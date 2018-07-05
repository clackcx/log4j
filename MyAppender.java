package com.ly.appender;

import org.apache.log4j.Priority;
import org.apache.log4j.RollingFileAppender;

public class MyAppender extends RollingFileAppender {
	public boolean isAsSevereAsThreshold(Priority priority) {
		// 只判断是否相等，而不判断优先级
		return this.getThreshold().equals(priority);
	}
}
