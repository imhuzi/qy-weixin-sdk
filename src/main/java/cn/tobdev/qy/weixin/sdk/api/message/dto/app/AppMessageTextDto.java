package cn.tobdev.qy.weixin.sdk.api.message.dto.app;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.message.dto.MessageDto;
import cn.tobdev.qy.weixin.sdk.common.dto.TextDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/7/1
 */
@Getter
@Setter
@ToString
public class AppMessageTextDto extends AppMessageDto {
  /**
   * text
   */
  @JsonProperty("text")
  private TextDto text;

}
