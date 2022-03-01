
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ParabankSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://parabank.parasoft.com")
    .inferHtmlResources(AllowList(), DenyList())
  
  private val headers_0 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "none",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_1 = Map(
  		"accept" -> "text/css,*/*;q=0.1",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "style",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_3 = Map(
  		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "image",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_4 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )
  
  private val headers_5 = Map(
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_25 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru,en-US;q=0.9,en;q=0.8,et;q=0.7",
  		"origin" -> "https://parabank.parasoft.com",
  		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
  )


  private val scn = scenario("ParabankSimulation")
    .exec(
      http("request_0")
        .get("/parabank/index.htm")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/parabank/template.css")
            .headers(headers_1),
          http("request_2")
            .get("/parabank/style.css")
            .headers(headers_1),
          http("request_3")
            .get("/parabank/images/clear.gif")
            .headers(headers_3),
          http("request_4")
            .get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
            .headers(headers_4),
          http("request_5")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_5),
          http("request_6")
            .get("/parabank/images/topbg.gif")
            .headers(headers_5),
          http("request_7")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_5),
          http("request_8")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_5),
          http("request_9")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_5),
          http("request_10")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_5),
          http("request_11")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_5),
          http("request_12")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_5),
          http("request_13")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_5),
          http("request_14")
            .get("/parabank/images/atmhand.jpg")
            .headers(headers_5),
          http("request_15")
            .get("/parabank/images/bullet2-normal.gif")
            .headers(headers_5),
          http("request_16")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_5),
          http("request_17")
            .get("/parabank/images/icon2.jpg")
            .headers(headers_5),
          http("request_18")
            .get("/parabank/images/icon4.jpg")
            .headers(headers_5),
          http("request_19")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_5),
          http("request_20")
            .get("/parabank/images/logo.gif")
            .headers(headers_3),
          http("request_21")
            .get("/parabank/images/header-main.jpg")
            .headers(headers_3),
          http("request_22")
            .get("/favicon.ico")
        )
    )
    .pause(20)
    .exec(
      http("request_23")
        .get("/parabank/images/contact-hover.gif")
        .resources(
          http("request_24")
            .get("/parabank/images/aboutus-hover.gif")
            .headers(headers_3)
        )
    )
    .pause(16)
    .exec(
      http("request_25")
        .post("/parabank/login.htm")
        .headers(headers_25)
        .formParam("username", "naveenauto")
        .formParam("password", "selenium123")
        .resources(
          http("request_26")
            .get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
            .headers(headers_5),
          http("request_27")
            .get("/parabank/images/logo.gif")
            .headers(headers_5),
          http("request_28")
            .get("/parabank/images/clear.gif")
            .headers(headers_5),
          http("request_29")
            .get("/parabank/template.css"),
          http("request_30")
            .get("/parabank/style.css"),
          http("request_31")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_5),
          http("request_32")
            .get("/parabank/images/topbg.gif")
            .headers(headers_5),
          http("request_33")
            .get("/parabank/images/header-main.jpg")
            .headers(headers_5),
          http("request_34")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_5),
          http("request_35")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_5),
          http("request_36")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_5),
          http("request_37")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_5),
          http("request_38")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_5),
          http("request_39")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_5),
          http("request_40")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_5),
          http("request_41")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_5),
          http("request_42")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_5)
        )
    )
    .pause(31)
    .exec(
      http("request_43")
        .post("/parabank/login.htm")
        .headers(headers_25)
        .formParam("username", "naveenauto")
        .formParam("password", "selenium123")
        .resources(
          http("request_44")
            .get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
            .headers(headers_5),
          http("request_45")
            .get("/parabank/images/clear.gif")
            .headers(headers_5),
          http("request_46")
            .get("/parabank/images/logo.gif")
            .headers(headers_5),
          http("request_47")
            .get("/parabank/template.css"),
          http("request_48")
            .get("/parabank/style.css"),
          http("request_49")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_5),
          http("request_50")
            .get("/parabank/images/topbg.gif")
            .headers(headers_5),
          http("request_51")
            .get("/parabank/images/header-main.jpg")
            .headers(headers_5),
          http("request_52")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_5),
          http("request_53")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_5),
          http("request_54")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_5),
          http("request_55")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_5),
          http("request_56")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_5),
          http("request_57")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_5),
          http("request_58")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_5),
          http("request_59")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_5),
          http("request_60")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_5)
        )
    )
    .pause(12)
    .exec(
      http("request_61")
        .post("/parabank/login.htm")
        .headers(headers_25)
        .formParam("username", "naveenauto")
        .formParam("password", "Selenium123")
        .resources(
          http("request_62")
            .get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
            .headers(headers_5),
          http("request_63")
            .get("/parabank/images/clear.gif")
            .headers(headers_5),
          http("request_64")
            .get("/parabank/images/logo.gif")
            .headers(headers_5),
          http("request_65")
            .get("/parabank/template.css"),
          http("request_66")
            .get("/parabank/style.css"),
          http("request_67")
            .get("/parabank/images/main-bg.gif")
            .headers(headers_5),
          http("request_68")
            .get("/parabank/images/topbg.gif")
            .headers(headers_5),
          http("request_69")
            .get("/parabank/images/header-main.jpg")
            .headers(headers_5),
          http("request_70")
            .get("/parabank/images/bullet-hover.gif")
            .headers(headers_5),
          http("request_71")
            .get("/parabank/images/bullet-normal.gif")
            .headers(headers_5),
          http("request_72")
            .get("/parabank/images/home-normal.gif")
            .headers(headers_5),
          http("request_73")
            .get("/parabank/images/aboutus-normal.gif")
            .headers(headers_5),
          http("request_74")
            .get("/parabank/images/contact-normal.gif")
            .headers(headers_5),
          http("request_75")
            .get("/parabank/images/bodybg.gif")
            .headers(headers_5),
          http("request_76")
            .get("/parabank/images/button-bgr.png")
            .headers(headers_5),
          http("request_77")
            .get("/parabank/images/sky-color-bg.gif")
            .headers(headers_5),
          http("request_78")
            .get("/parabank/images/footerbg.gif")
            .headers(headers_5)
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
