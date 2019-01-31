package io.eblock.eos4j.api.vo.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * gettransaction返回的实体接收类
 * @author wangwu
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionEntity {
	@JsonProperty("transaction")
      private Object transaction;

	public Object getTransaction() {
		return transaction;
	}

	public void setTransaction(Object transaction) {
		this.transaction = transaction;
	}
	
}
