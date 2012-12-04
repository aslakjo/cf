package no.rocketfarm.cf
import no.rocketfarm.cf.fetcher.TextFetcher
import content.ContentDestilling

trait ContentFetching extends ContentDestilling with TextFetcher {
	def get(url:String):Content= {
	  val text = fetch(url)
	  val values = parse(text)
	  
	  new Content(values("title"), values("content"))
	}
}

object ContentFetcher extends ContentFetching

