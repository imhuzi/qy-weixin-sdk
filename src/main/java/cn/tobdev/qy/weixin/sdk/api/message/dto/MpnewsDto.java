package cn.tobdev.qy.weixin.sdk.api.message.dto;

import java.util.List;

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
public class MpnewsDto {
  /**
   * articles
   */
  @JsonProperty("articles")
  private List<MpnewsItemDto> articles;
}
