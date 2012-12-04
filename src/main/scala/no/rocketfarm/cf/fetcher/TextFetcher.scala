package no.rocketfarm.cf.fetcher
import dispatch._

trait TextFetcher {
	def fetch(fetchUrl: String):String={
	  val connection = url(fetchUrl)
	  val text = Http(connection OK as.String)
	  text()
	}
}