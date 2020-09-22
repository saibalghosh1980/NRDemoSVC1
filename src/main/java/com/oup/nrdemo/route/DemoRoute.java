package com.oup.nrdemo.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DemoRoute extends RouteBuilder{
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		/*
		 * from("timer://foo?repeatCount=1000").routeId("id_SampleRouteRouteForNR")
		 * .log(LoggingLevel.INFO, logger,
		 * "Route started .....................................");
		 */
		// .to("stream:out");
		
		from("file:/Users/kumarghs/camelip?move=.done").routeId("id_FileRoute")
		.convertBodyTo(String.class)
		.log(LoggingLevel.INFO, logger,"${body}")
		.to("file:/Users/kumarghs/camelop");;
		
	}

}
