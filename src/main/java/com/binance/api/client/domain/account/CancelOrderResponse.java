package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response returned when placing a cancelOrder on the system.
 *
 * @see CancelOrder for the request
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelOrderResponse {

  /**
   * Order symbol.
   */
  private String symbol;

  /**
   * Order id.
   */
  private Long orderId;

  /**
   * This will be either a generated one, or the newClientOrderId parameter
   * which was passed when creating the new order.
   */
  private String clientOrderId;
  
  private String origClientOrderId;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getClientOrderId() {
    return clientOrderId;
  }

  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }

  public String getOrigClientOrderId() {
	return origClientOrderId;
}

public void setOrigClientOrderId(String origClientOrderId) {
	this.origClientOrderId = origClientOrderId;
}

@Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("orderId", orderId)
        .append("clientOrderId", clientOrderId)
        .append("origClientOrderId", origClientOrderId)
        .toString();
  }
}
