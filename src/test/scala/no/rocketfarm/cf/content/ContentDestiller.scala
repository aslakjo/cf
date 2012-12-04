package no.rocketfarm.cf.content
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class ContentDestillerSpec extends FlatSpec with ShouldMatchers {

  "ContentDestiller" should "take guly html and make it to header" in {
    val contentDestiller = new Object with ContentDestiller
    val parsedContent = contentDestiller.parse(html)
    
    parsedContent("title") should be ("Info")
    parsedContent("content") should be ("""<p>Fjellsportfestivalen er ein årleg festival som arrangerast av Bratt Moro AS. Staden er Sogndal; bygda som dei siste åra har blitt utropt til Fjellsporthovudstaden i Noreg, og det er ikkje utan grunn! Med sine bratte fjell, djupe dalar, nydelige fjordar og snø-rike vintrar er Sogndal den ultimate plassen å drive fjellsport. -Året rundt!</p>
<p>Fjellsportfestivalen vert i 2013 arrangert for 5.gong. Og gjennom desse åra har me vorte <strong><em>tøffare, brattare og friare</em></strong>!</p>
<p>&nbsp;</p>
<p>Dersom du har lyst til å melde deg som frivillig kan du ta kontakt med vår mann Magnus Aasheim på aasheimmagnus@gmail.com. Magnus er verdens hyggeligste frivillig-koordinator, og hjelper deg med det du måtte lure på!</p>
<p>&nbsp;</p>
<p>Andre festival-spørsmål kan rettast til festivalsjef Odd-Eivind Holo:</p>
<p>odd-eivind@brattmoro.no</p>
<p>&nbsp;</p>""")
  }
  
  val html = """
<!DOCTYPE html>
<html dir="ltr" lang="nb-NO">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Fjellsportfestivalen  &raquo; Info</title>
    <meta name="description" content="Fjellsportfestivalen / Brattmoro">
    <meta name="author" content="">

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le styles -->
    <link rel="stylesheet" type="text/css" href="http://fjellsportfestivalen.no/wp-content/themes/brattmoro/style.css" />
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
    </style>
    
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="http://fjellsportfestivalen.no/wp-content/themes/brattmoro/images/favicon.ico">
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">
	<script type="text/javascript">var _eab_data={"ajax_url":"http:\/\/fjellsportfestivalen.no\/wp-admin\/admin-ajax.php","root_url":"http:\/\/fjellsportfestivalen.no\/wp-content\/plugins\/events-and-bookings\/img\/","fb_scope":"email"};</script><meta name='robots' content='noindex,nofollow' />
<link rel="alternate" type="application/rss+xml" title="Fjellsportfestivalen &raquo; Info kommentarstrøm" href="http://fjellsportfestivalen.no/info/feed/" />
<link rel='stylesheet' id='jquery.slimbox-css'  href='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/slimbox/stylesheets/jquery.slimbox.css?ver=2.03' type='text/css' media='all' />
<link rel='stylesheet' id='mailmojo-css'  href='http://fjellsportfestivalen.no/wp-content/plugins/mailmojo-widget/css/mailmojo.css?ver=3.4.2' type='text/css' media='all' />
<link rel='stylesheet' id='NextGEN-css'  href='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/nextgen-gallery/css/nggallery.css?ver=1.0.0' type='text/css' media='screen' />
<link rel='stylesheet' id='shutter-css'  href='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/nextgen-gallery/shutter/shutter-reloaded.css?ver=1.3.4' type='text/css' media='screen' />
<link rel='stylesheet' id='eab-upcoming_calendar_widget-style-css'  href='http://fjellsportfestivalen.no/wp-content/plugins/events-and-bookings/css/upcoming_calendar_widget.css?ver=3.4.2' type='text/css' media='all' />
<script type='text/javascript' src='http://fjellsportfestivalen.no/wp-includes/js/jquery/jquery.js?ver=1.7.2'></script>
<script type='text/javascript' src='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/slimbox/javascript/jquery.slimbox.js?ver=2.03'></script>
<script type='text/javascript'>
/* <![CDATA[ */
var  MailMojoWidget = {"linkText":"Legg til flere"};
/* ]]> */
</script>
<script type='text/javascript' src='http://fjellsportfestivalen.no/wp-content/plugins/mailmojo-widget/js/mailmojo.js?ver=3.4.2'></script>
<script type='text/javascript'>
/* <![CDATA[ */
var shutterSettings = {"msgLoading":"L O A D I N G","msgClose":"Click to Close","imageCount":"1"};
/* ]]> */
</script>
<script type='text/javascript' src='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/nextgen-gallery/shutter/shutter-reloaded.js?ver=1.3.3'></script>
<script type='text/javascript' src='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/nextgen-gallery/js/jquery.cycle.all.min.js?ver=2.9995'></script>
<script type='text/javascript' src='http://fjellogfjordmoro.no/fjellsportfestivalen/wp-content/plugins/nextgen-gallery/js/ngg.slideshow.min.js?ver=1.06'></script>
<script type='text/javascript' src='http://fjellsportfestivalen.no/wp-content/themes/brattmoro/javascript/application.js?ver=3.4.2'></script>
<script type='text/javascript' src='http://fjellsportfestivalen.no/wp-content/plugins/events-and-bookings/js/upcoming_calendar_widget.js?ver=3.4.2'></script>
<link rel='canonical' href='http://fjellsportfestivalen.no/info/' />
<!-- <meta name="NextGEN" version="1.9.6" /> -->
<script type="text/javascript">
	jQuery(document).ready(function($){	
	    var select = $('a[href$=".bmp"],a[href$=".gif"],a[href$=".jpg"],a[href$=".jpeg"], a[href$=".png"],a[href$=".BMP"],a[href$=".GIF"],a[href$=".JPG"],a[href$=".JPEG"],a[href$=".PNG"]');
		select.slimbox();
	});
</script>
	    
  </head>

  <body>

    <div id="header">
      <div class="container">
        <div class="row">
          <div class="span4">
            			<p><img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/08/fejjsport1.png" alt="Fjellsportfestivalen"  title="Fjellsportfestivalen" /></p>
          </div>
          <div class="span8">
            <p><img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/08/fsf3.png" alt="Fjellsportfestivalen / Brattmoro" title="Fjellsportfestivalen / Brattmoro" /></p>
          </div>
        </div>
      
            <div class="container">
              <ul id="main_menu" class="nav nav-tabs"><li class="menu-heim"><a href="http://fjellsportfestivalen.no/"><span>Heim</span></a></li>
<li class="menu-program dropdown" data-dropdown="dropdown"><a href="http://fjellsportfestivalen.no/program/" class="dropdown-toggle" data-toggle="dropdown"><span>Program</span> <b class="caret"></b></a>
<ul class="dropdown-menu">
	<li class="menu-torsdag"><a href="http://fjellsportfestivalen.no/torsdag/"><span>Torsdag</span></a></li>
	<li class="menu-fredag"><a href="http://fjellsportfestivalen.no/fredag/"><span>Fredag</span></a></li>
	<li class="menu-laurdag"><a href="http://fjellsportfestivalen.no/laurdag/"><span>Laurdag</span></a></li>
	<li class="menu-sondag"><a href="http://fjellsportfestivalen.no/sundag/"><span>Søndag</span></a></li>
</ul>
</li>
<li class="menu-konkurranser dropdown" data-dropdown="dropdown"><a href="http://fjellsportfestivalen.no/konkurranser/" class="dropdown-toggle" data-toggle="dropdown"><span>Konkurranser</span> <b class="caret"></b></a>
<ul class="dropdown-menu">
	<li class="menu-kinesisk-utfor-2013"><a href="http://fjellsportfestivalen.no/kinesisk-utfor/"><span>Kinesisk Utfor 2013</span></a></li>
	<li class="menu-klatrekonk"><a href="http://fjellsportfestivalen.no/klatrekonk/"><span>Klatrekonk!</span></a></li>
	<li class="menu-haglofs-sogndal-frikoyring"><a href="http://fjellsportfestivalen.no/sognfreeridecup/"><span>Haglöfs Sogndal Frikøyring</span></a></li>
</ul>
</li>
<li class="menu-aktivitetar dropdown" data-dropdown="dropdown"><a href="http://fjellsportfestivalen.no/aktivitetar/" class="dropdown-toggle" data-toggle="dropdown"><span>Aktivitetar</span> <b class="caret"></b></a>
<ul class="dropdown-menu">
	<li class="menu-workshop"><a href="http://fjellsportfestivalen.no/workshop/"><span>Workshop</span></a></li>
	<li class="menu-seminar"><a href="http://fjellsportfestivalen.no/seminar/"><span>Seminar</span></a></li>
	<li class="menu-klatring"><a href="http://fjellsportfestivalen.no/klatring/"><span>Klatring</span></a></li>
	<li class="menu-guida-tur"><a href="http://fjellsportfestivalen.no/nortind-turen/"><span>Guida tur</span></a></li>
	<li class="menu-matine"><a href="http://fjellsportfestivalen.no/matine/"><span>Matinè</span></a></li>
</ul>
</li>
<li class="menu-festivalhotell"><a href="http://fjellsportfestivalen.no/festivalhotell/"><span>Festivalhotell</span></a></li>
<li class="menu-info current-menu-item active"><a href="http://fjellsportfestivalen.no/info/"><span>Info</span></a></li>
<li class="menu-bratt-pass"><a href="http://fjellsportfestivalen.no/bratt-pass/"><span>BRATT-PASS</span></a></li>
<li class="menu-fjellsport-app"><a href="http://fjellsportfestivalen.no/fjellsport-appen/"><span>Fjellsport-app</span></a></li>
<li class="menu-bratt-moro"><a href="http://brattmoro.no"><span>Bratt Moro</span></a></li>
</ul>            </div>
        
      </div>
    </div>

    <div class="container">
	<div class="row">
		<div class="span8">
						<div class="app-header page-header">
			  <h1>Info</h1>
			</div>
			<div class="app-content page-content">
				<p>Fjellsportfestivalen er ein årleg festival som arrangerast av Bratt Moro AS. Staden er Sogndal; bygda som dei siste åra har blitt utropt til Fjellsporthovudstaden i Noreg, og det er ikkje utan grunn! Med sine bratte fjell, djupe dalar, nydelige fjordar og snø-rike vintrar er Sogndal den ultimate plassen å drive fjellsport. -Året rundt!</p>
<p>Fjellsportfestivalen vert i 2013 arrangert for 5.gong. Og gjennom desse åra har me vorte <strong><em>tøffare, brattare og friare</em></strong>!</p>
<p>&nbsp;</p>
<p>Dersom du har lyst til å melde deg som frivillig kan du ta kontakt med vår mann Magnus Aasheim på aasheimmagnus@gmail.com. Magnus er verdens hyggeligste frivillig-koordinator, og hjelper deg med det du måtte lure på!</p>
<p>&nbsp;</p>
<p>Andre festival-spørsmål kan rettast til festivalsjef Odd-Eivind Holo:</p>
<p>odd-eivind@brattmoro.no</p>
<p>&nbsp;</p>
			</div>
			
					</div>
		<div class="span4">
			<aside id="sidebar" class="grid_4">
	<ul>
		</ul>
</aside>		</div>
	</div>
	<!-- <div class="row sponsors"> -->
       <!-- <div class="span2"><h3>Sponsorar:</h3></div> -->
       <div class="row sponsors"> <div class="span2" style="margin-bottom:20px; margin-left:20px">  <a class="thumbnail" target="_blank" href="http://www.haglofs.com/nn-NO">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/haglofs1.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.spv.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/logo-spv.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.lerum.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/logo-lerum.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.spv.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/logo-spv.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.haglofs.com/nn-NO">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/haglofs1.png" alt="" />  </a></div> </div>  <div class="row sponsors"> <div class="span2" style="margin-bottom:20px; margin-left:20px">  <a class="thumbnail" target="_blank" href="http://www.sisof.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/sisof.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.hisf.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/logo-hisf.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.sognavis.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/logo-sognavis.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.facebook.com/pages/Intersport-Sogndal/167166776704941?fref=ts">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/intersport.png" alt="" />  </a></div><div class="span2" style="margin-bottom:20px; margin-left:60px">  <a class="thumbnail" target="_blank" href="http://www.sognekraft.no">    <img src="http://fjellogfjordmoro.no/fjellsportfestivalen/files/2012/09/sognekraft.png" alt="" />  </a></div> </div>     <!-- </div> -->
		<hr />
		<footer id="footer">
		  <p class="ac">Bratt Moro &copy; 2012 | <a href="http://fjellsportfestivalen.no/wp-login.php">Logg inn</a></p>
		</footer>
	</div>
	</body>
</html>
"""
  
}