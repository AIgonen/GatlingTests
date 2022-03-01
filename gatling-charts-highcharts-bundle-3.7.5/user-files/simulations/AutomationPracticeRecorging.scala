
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class AutomationPracticeRecorging extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://automationpractice.com")
    .inferHtmlResources(AllowList(), DenyList())
  
  private val headers_0 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36")
  
  private val headers_48 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_52 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_53 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_54 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_64 = Map(
  		"Origin" -> "http://automationpractice.com",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_66 = Map(
  		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val uri2 = "https://fonts.gstatic.com/s/opensans/v27/memvYaGs126MiZpBA-UvWbX2vVnXBbObj2OVTS-muw.woff2"
  
  private val uri3 = "http://fonts.googleapis.com/css"

  private val scn = scenario("AutomationPracticeRecorging")
    .exec(
      http("request_0")
        .get("/themes/default-bootstrap/css/global.css")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/themes/default-bootstrap/css/autoload/highdpi.css")
            .headers(headers_0),
          http("request_2")
            .get("/themes/default-bootstrap/css/autoload/responsive-tables.css")
            .headers(headers_0),
          http("request_3")
            .get("/themes/default-bootstrap/css/autoload/uniform.default.css")
            .headers(headers_0),
          http("request_4")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.css")
            .headers(headers_0),
          http("request_5")
            .get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css")
            .headers(headers_0),
          http("request_6")
            .get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css")
            .headers(headers_0),
          http("request_7")
            .get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css")
            .headers(headers_0),
          http("request_8")
            .get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css")
            .headers(headers_0),
          http("request_9")
            .get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css")
            .headers(headers_0),
          http("request_10")
            .get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css")
            .headers(headers_0),
          http("request_11")
            .get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css")
            .headers(headers_0),
          http("request_12")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css")
            .headers(headers_0),
          http("request_13")
            .get("/themes/default-bootstrap/css/product_list.css")
            .headers(headers_0),
          http("request_14")
            .get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css")
            .headers(headers_0),
          http("request_15")
            .get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css")
            .headers(headers_0),
          http("request_16")
            .get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css")
            .headers(headers_0),
          http("request_17")
            .get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css")
            .headers(headers_0),
          http("request_18")
            .get("/modules/themeconfigurator/css/hooks.css")
            .headers(headers_0),
          http("request_19")
            .get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css")
            .headers(headers_0),
          http("request_20")
            .get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css")
            .headers(headers_0),
          http("request_21")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css")
            .headers(headers_0),
          http("request_22")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css")
            .headers(headers_0),
          http("request_23")
            .get("/js/jquery/jquery-1.11.0.min.js")
            .headers(headers_0),
          http("request_24")
            .get("/js/jquery/jquery-migrate-1.2.1.min.js")
            .headers(headers_0),
          http("request_25")
            .get("/js/jquery/plugins/jquery.easing.js")
            .headers(headers_0),
          http("request_26")
            .get("/js/tools.js")
            .headers(headers_0),
          http("request_27")
            .get("/themes/default-bootstrap/js/global.js")
            .headers(headers_0),
          http("request_28")
            .get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js")
            .headers(headers_0),
          http("request_29")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js")
            .headers(headers_0),
          http("request_30")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js")
            .headers(headers_0),
          http("request_31")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.js")
            .headers(headers_0),
          http("request_32")
            .get("/themes/default-bootstrap/js/products-comparison.js")
            .headers(headers_0),
          http("request_33")
            .get("/js/jquery/plugins/jquery.scrollTo.js")
            .headers(headers_0),
          http("request_34")
            .get("/js/jquery/plugins/jquery.serialScroll.js")
            .headers(headers_0),
          http("request_35")
            .get("/js/jquery/plugins/bxslider/jquery.bxslider.js")
            .headers(headers_0),
          http("request_36")
            .get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js")
            .headers(headers_0),
          http("request_37")
            .get("/themes/default-bootstrap/js/tools/treeManagement.js")
            .headers(headers_0),
          http("request_38")
            .get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js")
            .headers(headers_0),
          http("request_39")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js")
            .headers(headers_0),
          http("request_40")
            .get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js")
            .headers(headers_0),
          http("request_41")
            .get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js")
            .headers(headers_0),
          http("request_42")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js")
            .headers(headers_0),
          http("request_43")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js")
            .headers(headers_0),
          http("request_44")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js")
            .headers(headers_0),
          http("request_45")
            .get("/modules/blockbanner/img/sale70.png")
            .headers(headers_0),
          http("request_46")
            .get("/img/logo.jpg")
            .headers(headers_0),
          http("request_47")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1"),
          http("request_48")
            .get(uri3 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
            .headers(headers_48),
          http("request_49")
            .get("/img/c/3-0_thumb.jpg")
            .headers(headers_0),
          http("request_50")
            .get("/img/c/3-1_thumb.jpg")
            .headers(headers_0),
          http("request_51")
            .get("/img/p/1/2/12-home_default.jpg")
            .headers(headers_0),
          http("request_52")
            .get("/modules/socialsharing/css/socialsharing.css")
            .headers(headers_52),
          http("request_53")
            .get("/index.php?id_product=5&controller=product")
            .headers(headers_53),
          http("request_54")
            .get("/js/jquery/plugins/jquery.idTabs.js")
            .headers(headers_54),
          http("request_55")
            .get("/modules/sendtoafriend/sendtoafriend.css")
            .headers(headers_52),
          http("request_56")
            .get("/themes/default-bootstrap/css/product.css")
            .headers(headers_52),
          http("request_57")
            .get("/modules/socialsharing/js/socialsharing.js")
            .headers(headers_54),
          http("request_58")
            .get("/themes/default-bootstrap/js/product.js")
            .headers(headers_54),
          http("request_59")
            .get("/modules/productcomments/js/jquery.rating.pack.js")
            .headers(headers_54),
          http("request_60")
            .get("/themes/default-bootstrap/js/modules/sendtoafriend/sendtoafriend.js")
            .headers(headers_54),
          http("request_61")
            .get("/modules/productcomments/js/jquery.textareaCounter.plugin.js")
            .headers(headers_54),
          http("request_62")
            .get("/themes/default-bootstrap/js/modules/productcomments/js/productcomments.js")
            .headers(headers_54),
          http("request_63")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1"),
          http("request_64")
            .get(uri2)
            .headers(headers_64),
          http("request_65")
            .get("/themes/default-bootstrap/img/footer-bg.png"),
          http("request_66")
            .get("/img/p/1/2/12-cart_default.jpg")
            .headers(headers_66),
          http("request_67")
            .get("/img/p/1/4/14-cart_default.jpg")
            .headers(headers_66),
          http("request_68")
            .get("/img/p/1/3/13-cart_default.jpg")
            .headers(headers_66),
          http("request_69")
            .get("/themes/default-bootstrap/img/border-1.gif")
            .headers(headers_66),
          http("request_70")
            .get("/img/p/1/5/15-cart_default.jpg")
            .headers(headers_66),
          http("request_71")
            .get("/img/p/1/2/12-large_default.jpg")
            .headers(headers_66),
          http("request_72")
            .get("/modules/productpaymentlogos/img/payment-logo.png")
            .headers(headers_66),
          http("request_73")
            .get("/img/p/1/2/12-medium_default.jpg")
            .headers(headers_66),
          http("request_74")
            .get("/themes/default-bootstrap/css/print.css")
            .headers(headers_52),
          http("request_75")
            .get("/themes/default-bootstrap/img/jquery/uniform/sprite.png")
            .headers(headers_66)
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
