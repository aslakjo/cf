package no.rocketfarm.cf.content
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import no.rocketfarm.cf.util.HTML5Parser
import java.io.StringReader

class ParserTests extends FlatSpec with ShouldMatchers {

  "Parser" should "give out htmlettities" in {
	val html = """<h1>&aring;&nbsp;</h1>"""
    
    val parser = new HTML5Parser
    val xml = parser.load(new StringReader(html.replace("&", "&amp;")))
    
    val content = (xml \\ "h1").text
    content should be ("&aring;&nbsp;")
  }
  
  it should "give handle  utf-8 - øæå" in {
	val html = """<h1>øæå</h1>"""
    
    val parser = new HTML5Parser
    val xml = parser.load(new StringReader(html))
    
    val content = (xml \\ "h1").text
    
    content should be ("øæå")
  }
}
