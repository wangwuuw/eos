package io.eblock.eos4j.api.vo.transaction;

import io.eblock.eos4j.api.vo.transaction.push.Trx;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 返回的transactions包含的对象
 * @author wangwu
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionResult {
	@JsonProperty("cpu_usage_us")
	  private Long cpuUsageUs;
	@JsonProperty("net_usage_words")
	    private Long netUsageWords;
	@JsonProperty("status")
	    private String status;
	@JsonProperty("trx")
	private Object trx;
	public Long getCpuUsageUs() {
		return cpuUsageUs;
	}
	public void setCpuUsageUs(Long cpuUsageUs) {
		this.cpuUsageUs = cpuUsageUs;
	}
	public Long getNetUsageWords() {
		return netUsageWords;
	}
	public void setNetUsageWords(Long netUsageWords) {
		this.netUsageWords = netUsageWords;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getTrx() {
		return trx;
	}
	public void setTrx(Object trx) {
		this.trx = trx;
	}
}
