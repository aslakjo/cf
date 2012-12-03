package no.rocketfarm.cf.content
import nu.validator.htmlparser.sax.HtmlParser
import no.rocketfarm.cf.util.HTML5Parser
import java.io.StringReader
import org.xml.sax.InputSource
import java.io.ByteArrayInputStream
import scala.xml.NodeSeq
import scala.xml.XML
import scala.xml.PrettyPrinter
import java.io.BufferedWriter
import java.io.StringWriter
import scala.xml.Node

trait ContentDestiller {
	val appHeaderClass = "app-header"
	val appContentClass = "app-content"
  
	def parse(html:String):Map[String, String] ={
	  val source = new InputSource()
	  source.setByteStream(new ByteArrayInputStream(html.getBytes()))
	  source.setEncoding("UTF-8")
	  
	  val xml = new HTML5Parser().loadXML(source)
	
	  val divs = (xml \\ "div")
	  
	  val headers = filterOutHeaders(divs)
	  val content = filterOutContent(divs)
	  

	  val writer = writeToString(content.head)
	  Map(("title" -> (headers \\ "h1" text)), ("content" -> writer.toString.trim))
	}
	
	protected def writeToString(node : Node) = {
  	    val writer=new BufferedWriter(new StringWriter) 
		XML.write(writer, node, "UTF-8", true, null) 
		writer.close() 
		writer
	}
	
	protected def filterOutContent(divs:NodeSeq)={
	  filterOut(appContentClass, divs)
	}
	
	protected def filterOutHeaders(divs: NodeSeq)={
	  filterOut(appHeaderClass, divs)
	}
	
	protected def filterOut(cssClass:String, divs:NodeSeq)= {
	  divs.map{node =>{
	    val css = node \ "@class"
		val cssClasses = css.text.split(" ").toList
		println(cssClasses)
	    if(cssClasses.contains(cssClass)){
	      node
	    }else 
    	  null
	  }}.filter{ _ != null }
	}
}