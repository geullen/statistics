package com.statistics.dto;

import lombok.Getter;

@Getter
public enum ResponseCode {
	 OK("0000", "OK", null, ""),

	    //POINT ERROR
	    POINT_SERVICE_NO_DATA("0002", "no data", null, ""),
	    POINT_SERVICE_PARAM_ERROR("0003", "params error", null, ""),
	    POINT_SERVICE_LEAK_POINT("0004", "leak point", "포인트가 부족합니다.", ""),
	    POINT_SERVICE_DUPLICATION_REQUEST("0005", "duplicate request", null, ""),

	    //POINT RENEWAL
	    POINT_SERVICE_UNAUTHORIZED("7401", "Unauthorized", null, ""),
	    POINT_SERVICE_NOT_FOUND("7404", "Not found", null, ""),
	    POINT_SERVICE_INTERNAL_SEVER_ERROR("7500", "Internal server error", null, ""),
	    POINT_SERVICE_INVALID_INPUT("7600", "Invalid input", "입력값이 잘못 되었습니다.", ""),
	    POINT_SERVICE_NOT_ENOUGH_POINT("7601", "Not enough point", "가능한 포인트 잔액이 부족합니다.", ""),

	    // Common Error '1xxx'
	    LOGIN_SESSION_EXPIRED("1100", "login session expired.", null, ""),
	    INVALID_SESSION_INFORMATION("1101", "invalid session information", null, ""),
	    TOKEN_EXPIRED("1102", "expired token", null, ""),
	    TOKEN_INVALID("1103", "invalid token", null, ""),
	    NANO_SERVICE_REQUEST_FAILED("1110", "nano service request failed", null, ""),
	    MEMBER_SERVICE_REQUEST_FAILED("1111", "member service request failed", null, ""),
	    ADMIN_SERVICE_REQUEST_FAILED("1112", "admin service request failed", null, ""),
	    POINT_SERVICE_REQUEST_FAILED("1113", "point service request failed", null, ""),
	    MAILGUN_REQUEST_FAILED("1114", "mailgun request failed", null, ""),
	    NOT_MATCHED_ENUM_VALUE("1121", "not matched enum value", null, ""),
	    NOT_ENOUGH_POINT("1122", "Not enough point", null, ""),
	    EXCEEDED_DUE_DATE("1190", "Exceeded due date", null, ""),

	    //    - support - member : '12xx'
	    COMMON_MEMBER_REST_API_ERROR("1201", "Internal API Error.", null, ""),
	    COMMON_MEMBER_NOT_FOUND("1202", "Not Found Member.", null, ""),
	    COMMON_MEMBER_PASSWORD_NOT_MATCHED("1203", "Does not match password", null, ""),
	    COMMON_MEMBER_PASSWORD_ALREADY_SET("1204", "Password is already set", null, ""),
	    COMMON_MEMBER_PUSH_API_ERROR("1205", "Push API Error.", null, ""),
	    COMMON_MEMBER_CI_NOT_MATCH("1206", "Does not match ci", null, ""),
	    COMMON_MEMBER_ALREADY_REGISTERED("1207", "Already registered", null, ""),
	    COMMON_MEMBER_DELETED("1208", "deleted member", null, ""),
	    COMMON_MEMBER_PHONE_EMPTY("1209", "empty phone number", null, ""),
	    COMMON_NOTIFICATION_MESSAGE_EMPTY("1210", "empty message", null, ""),
	    COMPANY_OWNER_AND_VERIFIED_NAME_NOT_MATCHED("1211", "company owner and verified name not matched", "대표자명과 본인인증 된 이름이 일치하지 않습니다.", ""),
	    COMMON_OAUTH2_ERROR("1291", "OAuth2 exception", null, ""),

	    INVALID_LOAN_AMOUNT("1301", "Invalid loan amount", null, ""),
	    INVALID_LOAN_DURATION("1302", "Invalid loan duration", null, ""),

	    BAD_REQUEST("1400", "Bad Request", null, ""),
	    VALID_REQUEST_NOT_FOUND("1401", "Valid request not found", null, ""),
	    INVALID_REQUEST_ID("1402", "Invalid request id", null, ""),
	    NOT_FOUND_EXCEPTION("1404", "Not Found", null, ""),
	    INTERNAL_SERVER_ERROR("1500", "Internal server error", null, ""),
	    UNSUPPORTED_METHOD("1501", "Unsupported method", null, ""),
	    MAINTENANCE("1600", "Maintenance", null, ""),

	    SCHEDULE_NOT_FOUND("1700", "Schedule Not Found", null, ""),
	    SCRAPPED_TRANSACTION_NOT_FOUND("1701", "Scrapped Transaction Not Found", null, ""),
	    REPAY_AMOUNT_NOT_MATCH("1702", "Repay Amount Not Match", null, ""),
	    CONTRACT_HAS_OVERDUE("1703", "Contract has overdue", null, ""),
	    BANK_ACCOUNT_VERIFICATION_FAIL("1704", "bank account verification fail", "계좌 인증에 실패하였습니다.", ""),
	    INVALID_REPAYMENT_METHOD_CODE("1705", "repayment method is invalid", null, ""),
	    COOCON_REQUEST_ERROR("1706", "Coocon request error", null, ""),
	    REPAYMENT_DATE_EXTENSION_FAIL("1707", "Repayment date extension fail", null, ""),
	    REPAYMENT_FAIL("1708", "Repayment fail", null, ""),
	    REPAYMENT_DATE_IS_NOT_WORKING_DAY("1709", "Not working day", "상환은 영업일(주말, 공휴일 제외)에만 가능합니다.", null),



	    NO_MATCHING_CURRENT_STAGE_APPLICATION("2101", "No matching current stage application", null, ""),
	    ALREADY_REJECTED_APPLICATION("2102", "Already rejected application", null, ""),

	    ;


	    private final String code;
	    private final String messageEn;
	    private final String message;
	    private final String action;


	    ResponseCode(String code, String messageEn, String message, String action) {
	        this.code = code;
	        this.messageEn = messageEn;
	        this.message = message;
	        this.action = action;
	    }
}
