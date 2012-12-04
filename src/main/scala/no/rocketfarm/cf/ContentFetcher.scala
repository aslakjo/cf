package no.rocketfarm.cf
import no.rocketfarm.cf.fetcher.TextFetcher
import content.ContentDestiller

trait ContentFetching extends ContentDestiller with TextFetcher {
	def get(url:String):Content= {
	  val text = fetch(url)
	  val values = parse(text)
	  
	  new Content(values("title"), values("content"))
	}
}

object ContentFetcher extends ContentFetching

case class Content(title: String, body:String)