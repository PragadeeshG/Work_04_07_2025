package com.test1;

public class CreateGraphPagesContext {
package com.test1;

public class CreateGraphPagesContext {
private String forkNumber;
private String hnswElementTuple;
private String hnswNeighborTuple;
private String hnswElement;
private String hnswElementPtr;
private Integer hnswNewBuffer;
private Integer hnswInitPage;
private String valuePtr;
private String combineSize;
private String ntupSize;
private String etupSize;

public CreateGraphPagesContext() {
	
}

public CreateGraphPagesContext(String forkNumber, String hnswElementTuple, String hnswNeighborTuple, String hnswElement,
		String hnswElementPtr, Integer hnswNewBuffer, Integer hnswInitPage, String valuePtr, String combineSize,
		String ntupSize, String etupSize) {
	super();
	this.forkNumber = forkNumber;
	this.hnswElementTuple = hnswElementTuple;
	this.hnswNeighborTuple = hnswNeighborTuple;
	this.hnswElement = hnswElement;
	this.hnswElementPtr = hnswElementPtr;
	this.hnswNewBuffer = hnswNewBuffer;
	this.hnswInitPage = hnswInitPage;
	this.valuePtr = valuePtr;
	this.combineSize = combineSize;
	this.ntupSize = ntupSize;
	this.etupSize = etupSize;
}

public String getForkNumber() {
	return forkNumber;
}

public void setForkNumber(String forkNumber) {
	this.forkNumber = forkNumber;
}

public String getHnswElementTuple() {
	return hnswElementTuple;
}

public void setHnswElementTuple(String hnswElementTuple) {
	this.hnswElementTuple = hnswElementTuple;
}

public String getHnswNeighborTuple() {
	return hnswNeighborTuple;
}

public void setHnswNeighborTuple(String hnswNeighborTuple) {
	this.hnswNeighborTuple = hnswNeighborTuple;
}

public String getHnswElement() {
	return hnswElement;
}

public void setHnswElement(String hnswElement) {
	this.hnswElement = hnswElement;
}

public String getHnswElementPtr() {
	return hnswElementPtr;
}

public void setHnswElementPtr(String hnswElementPtr) {
	this.hnswElementPtr = hnswElementPtr;
}

public Integer getHnswNewBuffer() {
	return hnswNewBuffer;
}

public void setHnswNewBuffer(Integer hnswNewBuffer) {
	this.hnswNewBuffer = hnswNewBuffer;
}

public Integer getHnswInitPage() {
	return hnswInitPage;
}

public void setHnswInitPage(Integer hnswInitPage) {
	this.hnswInitPage = hnswInitPage;
}

public String getValuePtr() {
	return valuePtr;
}

public void setValuePtr(String valuePtr) {
	this.valuePtr = valuePtr;
}

public String getCombineSize() {
	return combineSize;
}

public void setCombineSize(String combineSize) {
	this.combineSize = combineSize;
}

public String getNtupSize() {
	return ntupSize;
}

public void setNtupSize(String ntupSize) {
	this.ntupSize = ntupSize;
}

public String getEtupSize() {
	return etupSize;
}

public void setEtupSize(String etupSize) {
	this.etupSize = etupSize;
}


}

}
