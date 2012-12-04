package no.rocketfarm.cf.util

import org.xml.sax.InputSource
import scala.xml._
import parsing._
import nu.validator.htmlparser.io.Encoding
import org.xml.sax.EntityResolver
import org.xml.sax.ext.LexicalHandler
import org.xml.sax.ext.DefaultHandler2
import nu.validator.htmlparser.sax.HtmlParser
import org.xml.sax.helpers.XMLFilterImpl


class HTML5Parser extends NoBindingFactoryAdapter{

  override def loadXML(source : InputSource, _p: SAXParser):Node = {
    loadXML(source)
  }

  def loadXML(source : InputSource):Node = {
    import nu.validator.htmlparser.{sax,common}
    import sax.HtmlParser
    import common.XmlViolationPolicy
    
    val reader = new HtmlParser 
    reader.setProperty("http://xml.org/sax/properties/lexical-handler", new LexicalEntity);
    reader.setLexicalHandler(new LexicalEntity)
    reader.setXmlPolicy(XmlViolationPolicy.ALLOW)
    reader.setContentHandler(this)
    reader.parse(source)
    rootElem
  }
  
  override def characters(ch:Array[Char], offset:Int, length:Int)={
    super.characters(ch,offset, length)
  }
  
}



class LexicalEntity extends XMLFilterImpl with LexicalHandler{
  
  
  override def comment(ch:Array[Char], start:Int, length:Int) = {}
  override def startDTD(name:String, publicId:String, systemId:String) = {}
  override def endDTD = {}
  override def startCDATA ={}
  override def endCDATA = {}
  
  override def startEntity(name:String)={println("--" + name)}
  override def endEntity(name:String)={println("--" + name)}
}


