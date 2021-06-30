package cn.tobdev.qy.weixin.sdk.api.message.dto.appChat;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.message.dto.MessageDto;
import cn.tobdev.qy.weixin.sdk.common.dto.VoiceDto;
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
public class MessageVoiceDto extends MessageDto {
  /**
   * text
   */
  @JsonProperty("voice")
  private VoiceDto voice;

}
