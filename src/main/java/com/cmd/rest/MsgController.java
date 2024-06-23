package com.cmd.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	private Logger logger = LoggerFactory.getLogger(MsgController.class);

	@GetMapping("/msg")
	public String getMessage() {
		logger.debug("debug msg from getmessage() method");
		logger.info("method started...");
		logger.warn("This is warning msg..");

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception is occured");
		}
		String msgString = "Welcome to logging class";

		return msgString;

	}

}
