package com.statistics.dto;

import org.apache.logging.log4j.util.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;

@Getter
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class CommonException extends RuntimeException implements Supplier {

	  private String code;
	    private String label;
	    private String message;

	    @Override
	    @JsonIgnore
	    public StackTraceElement[] getStackTrace() {
	        return super.getStackTrace();
	    }

	    @Override
	    @JsonIgnore
	    public String getLocalizedMessage() {
	        return super.getLocalizedMessage();
	    }

	    public CommonException() {
	        this.code = ResponseCode.INTERNAL_SERVER_ERROR.getCode();
	        this.label = ResponseCode.INTERNAL_SERVER_ERROR.getMessage();
	    }

	    public CommonException(ResponseCode responseCode) {
	        this.code = responseCode.getCode();
	        if (!responseCode.equals(ResponseCode.OK)) { // 정상적인 처리인 경우 라벨 붙이지 않음
	            this.label = responseCode.getMessage();
	            this.message = responseCode.getMessage();
	        }
	    }

	    public CommonException(ResponseCode responseCode, String message) {
	        this.code = responseCode.getCode();
	        this.label = responseCode.getMessage();
	        this.message = message;
	    }

	    public CommonException get() {
	        return this;
	    }
	
}
