package no.rocketfarm.cf
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class ContentFetcherSpec extends FlatSpec with ShouldMatchers{
	object TestFetcher extends ContentFetching{
	  override val appContentClass = "page-content"
	  override val appHeaderClass = "page-header"
	}
	
	"Content fetcher" should "get content form a url" in {
		val content = TestFetcher.get("http://fjellsportfestivalen.no/info/")
		content.title should be ("Info")
		content.body should startWith ("<p>Fjellsportfestivalen er ein årleg festival som arrangerast av Bratt Moro AS")
	}
}