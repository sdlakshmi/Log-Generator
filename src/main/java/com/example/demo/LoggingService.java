package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Service;

@Service
public class LoggingService {

	@Value("${process.count}")
	private int processCount;
	
	@Value("${max.events.count}")
	private int maxEventsCount;

	private static final Logger logger = LogManager.getLogger(LoggingService.class);

	ExecutorService executorService1 = Executors.newFixedThreadPool(10);

	@PostConstruct
	public void logService() {
		
		logData();
		
//		while(true) {
//			logData();
//		}

//		for (int processLen = 0; processLen < processCount; processLen++) {
//			executorService1.submit(() -> {
//				logData();
//			});
//		}

	}

	private void logData() {
		
		while(true) {
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=200, API-PARTNER=Spai-1");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=200, API-PARTNER=Spai-2");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=200, API-PARTNER=Spai-3");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=200, API-PARTNER=Spai-4");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=400, API-PARTNER=Spai-1");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=400, API-PARTNER=Spai-2");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=400, API-PARTNER=Spai-3");
			logger.info("[qtp793589513-9] INFO  StatsLogger {bo-rest=UserServiceBO.createUser(), dw-request-id=request_e535a5a6-e3ab-4f11-a90c-160eec260fdf} -- BO-API-URL=users, BO-API-HTTP-METHOD=POST, CALLER-USER-ID=e2116ce2-a46b-4426-a1bc-f839f1dc6deb, CALLER-APP-KEY=2d9f930e-7a85, PROCESSING-TIME=1120ms, RESPONSE-LENGTH=null bytes, RESPONSE-STATUS-CODE=400, API-PARTNER=Spai-4");

		}
		

	}

}
