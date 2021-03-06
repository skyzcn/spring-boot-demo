package com.dragon.study.spring.boot.jersey.module;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by dragon on 16/7/31.
 */
@Setter
@Getter
public class CommonResponse {

  public static CommonResponse of(boolean success) {
    CommonResponse apiCommonResponse = new CommonResponse();
    apiCommonResponse.setResult(Result.of(success));
    return apiCommonResponse;
  }

  private Result result;

  @Data
  public static class Result {

    @JSONField(name = "is_success")
    private boolean isSuccess = false;

    public static Result of(boolean isSuccess) {
      Result result = new Result();
      result.setSuccess(isSuccess);
      return result;
    }
  }

}
