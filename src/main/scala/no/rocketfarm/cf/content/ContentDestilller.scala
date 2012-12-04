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
	  val escapedEntities = html.replace("&", "&amp;")
	  
	  val parser = new HTML5Parser()
	  val xml = parser.load(new StringReader(escapedEntities))
	
	  val divs = (xml \\ "div")
	  
	  val headers = filterOutHeaders(divs)
	  val content = filterOutContent(divs)
	  

	  Map(("title" -> (headers \\ "h1" text)), ("content" -> content.head.child.mkString.trim.replace("&amp;", "&")))
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
	    if(cssClasses.contains(cssClass)){
	      node
	    }else 
    	  null
	  }}.filter{ _ != null }
	}
}