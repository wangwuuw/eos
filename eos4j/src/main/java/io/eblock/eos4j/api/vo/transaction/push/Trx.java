package io.eblock.eos4j.api.vo.transaction.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.eblock.eos4j.api.vo.BaseVo;

/**
 * transaction包含的交易对象
 * @author espritblock http://eblock.io
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trx{
	@JsonProperty("id")
	private String id;
	@JsonProperty("signatures")
	private List<String> signatures;
	@JsonProperty("compression")
	private String compression;
	@JsonProperty("packed_context_free_data")
	private String packedContextFreeData;
	@JsonProperty("context_free_data")
	private List<String> contextFreeData;
	@JsonProperty("packed_trx")
	private String packedTrx;
	@JsonProperty("transaction")
	private Tx transaction;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getSignatures() {
		return signatures;
	}
	public void setSignatures(List<String> signatures) {
		this.signatures = signatures;
	}
	public String getCompression() {
		return compression;
	}
	public void setCompression(String compression) {
		this.compression = compression;
	}
	public String getPackedContextFreeData() {
		return packedContextFreeData;
	}
	public void setPackedContextFreeData(String packedContextFreeData) {
		this.packedContextFreeData = packedContextFreeData;
	}
	public List<String> getContextFreeData() {
		return contextFreeData;
	}
	public void setContextFreeData(List<String> contextFreeData) {
		this.contextFreeData = contextFreeData;
	}
	public String getPackedTrx() {
		return packedTrx;
	}
	public void setPackedTrx(String packedTrx) {
		this.packedTrx = packedTrx;
	}
	public Tx getTransaction() {
		return transaction;
	}
	public void setTransaction(Tx transaction) {
		this.transaction = transaction;
	}
	

}
