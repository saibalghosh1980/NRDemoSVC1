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
		
		  from("timer://foo?repeatCount=10").routeId("id_SampleRouteRouteForNR")
		  .to("direct:fromOne");
		  
		  from("direct:fromOne")
		  .to("stream:out");
		 
		// .to("stream:out");
		
		/*
		 * from("file:C:\\JavaTest?move=.done").routeId("id_FileRoute")
		 * .convertBodyTo(String.class) .log(LoggingLevel.INFO, logger,"${body}")
		 * .to("file:C:\\JavaTest\\camelop");
		 */
		
		/*from("activemq:SPS-PURCHASE-ORDERS-DEV").routeId("id_PickToAMQ")
		.convertBodyTo(String.class)
		.log(LoggingLevel.INFO, logger,"${body}")
		.to("direct:secondRoute");
		
		from("direct:secondRoute").routeId("id_PickFromDirect")
		.process("springManagedUppercaseProcessor")
		.log(LoggingLevel.INFO, logger,"---${body}")
		.to("activemq:SPS-SALES-FORECAST-DEV");
		
		from("activemq:SPS-SALES-FORECAST-DEV").routeId("id_PickFromSPS-SALES-FORECAST-DEVQ")
		.convertBodyTo(String.class)
		.log(LoggingLevel.INFO, logger,"Picked from SPS-SALES-FORECAST-DEV -- ${body}");*/
		
	}

}
