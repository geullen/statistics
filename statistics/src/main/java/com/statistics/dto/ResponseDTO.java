package com.statistics.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseDTO<T> {

	private T data;
    private CommonException error;

    public ResponseDTO() {
        this.data = null;
        this.error = null;
    }

    public ResponseDTO(T data) {
        this.data = data;
        this.error = new CommonException(ResponseCode.OK);
    }

    public ResponseDTO(CommonException error) {
        this.error = error;
    }

    public ResponseDTO(T data, CommonException error) {
        this.data = data;
        this.error = error;
    }

    public static ResponseDTO success() {
        return new ResponseDTO<>(new CommonException(ResponseCode.OK));
    }

    public static <T> ResponseDTO success(T data) {
        return new ResponseDTO<>(data);
    }

    public static ResponseDTO fail(CommonException error) {
        return new ResponseDTO<>(error);
    }

    /*
     * CssAdapter 클래스에서 Get 사용
     * */
    @JsonIgnore
    public String getResponseCode() {
        return this.error.getCode();
    }
	
}
