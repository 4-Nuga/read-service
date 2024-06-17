package spharos.nu.read.domain.goods.dto.event;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GoodsStatusEventDto {

	@Schema(description = "상품코드")
	private String goodsCode;
	@Schema(description = "거래상태")
	private byte tradingStatus;

}
