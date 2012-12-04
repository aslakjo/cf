cf
==

content-fetcher

Example 
===

	val content = TestFetcher.get("http://fjellsportfestivalen.no/info/")
	content.title should be ("Info")
	content.body should startWith ("<p>Fjellsportfestivalen er ein årleg festival som arrangerast av Bratt Moro AS")