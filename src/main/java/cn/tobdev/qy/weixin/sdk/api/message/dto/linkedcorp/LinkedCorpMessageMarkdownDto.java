package cn.tobdev.qy.weixin.sdk.api.message.dto.linkedcorp;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.message.dto.MarkdownDto;
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
public class LinkedCorpMessageMarkdownDto extends LinkedCorpMessageDto {

  /**
   * markdown
   */
  @JsonProperty("markdown")
  private MarkdownDto markdown;
}
