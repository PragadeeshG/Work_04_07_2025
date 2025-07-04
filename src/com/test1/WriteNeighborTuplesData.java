package com.test1;

public class WriteNeighborTuplesData {
	private Integer reqId;
	private Integer dimensions;
	private String lwLockAcquire;
	private boolean hnswAddHeapTid;
	private String hnswNeighborArray;
	private String hnswCandidate;
	private String hnswElement;
	private Integer addDuplicateInMemory;
	private String addElementInMemory;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public WriteNeighborTuplesData() {

	}

	public WriteNeighborTuplesData(Integer reqId, Integer dimensions, String lwLockAcquire, boolean hnswAddHeapTid,
			String hnswNeighborArray, String hnswCandidate, String hnswElement, Integer addDuplicateInMemory,
			String addElementInMemory, String creationDate, String modifiedDate, String entityState) {
		super();
		this.reqId = reqId;
		this.dimensions = dimensions;
		this.lwLockAcquire = lwLockAcquire;
		this.hnswAddHeapTid = hnswAddHeapTid;
		this.hnswNeighborArray = hnswNeighborArray;
		this.hnswCandidate = hnswCandidate;
		this.hnswElement = hnswElement;
		this.addDuplicateInMemory = addDuplicateInMemory;
		this.addElementInMemory = addElementInMemory;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getReqId() {
		return reqId;
	}

	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}

	public Integer getDimensions() {
		return dimensions;
	}

	public void setDimensions(Integer dimensions) {
		this.dimensions = dimensions;
	}

	public String getLwLockAcquire() {
		return lwLockAcquire;
	}

	public void setLwLockAcquire(String lwLockAcquire) {
		this.lwLockAcquire = lwLockAcquire;
	}

	public boolean isHnswAddHeapTid() {
		return hnswAddHeapTid;
	}

	public void setHnswAddHeapTid(boolean hnswAddHeapTid) {
		this.hnswAddHeapTid = hnswAddHeapTid;
	}

	public String getHnswNeighborArray() {
		return hnswNeighborArray;
	}

	public void setHnswNeighborArray(String hnswNeighborArray) {
		this.hnswNeighborArray = hnswNeighborArray;
	}

	public String getHnswCandidate() {
		return hnswCandidate;
	}

	public void setHnswCandidate(String hnswCandidate) {
		this.hnswCandidate = hnswCandidate;
	}

	public String getHnswElement() {
		return hnswElement;
	}

	public void setHnswElement(String hnswElement) {
		this.hnswElement = hnswElement;
	}

	public Integer getAddDuplicateInMemory() {
		return addDuplicateInMemory;
	}

	public void setAddDuplicateInMemory(Integer addDuplicateInMemory) {
		this.addDuplicateInMemory = addDuplicateInMemory;
	}

	public String getAddElementInMemory() {
		return addElementInMemory;
	}

	public void setAddElementInMemory(String addElementInMemory) {
		this.addElementInMemory = addElementInMemory;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
