package cn.tobdev.qy.weixin.sdk.api.message.param;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@NoArgsConstructor
@Data
public class MessageStatGetParam {

  /**
   * timeType
   */
  @JsonProperty("time_type")
  private Integer timeType;
}
