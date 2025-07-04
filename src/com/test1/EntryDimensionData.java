package com.test1;

public class EntryDimensionData {
	private Integer dimensions;
	private String efConstruction;
	private String entryBlkno;
	private boolean entryOffno;
	private String entryLevel;
	private Integer insertPage;
	private boolean buildstate;
	private Integer invalidOffsetNumber;
	private String hnswMetaPageData;
	private String unlockReleaseBuffer;
	private String forkNum;

	public EntryDimensionData() {

	}

	public EntryDimensionData(Integer dimensions, String efConstruction, String entryBlkno, boolean entryOffno,
			String entryLevel, Integer insertPage, boolean buildstate, Integer invalidOffsetNumber,
			String hnswMetaPageData, String unlockReleaseBuffer, String forkNum) {
		super();
		this.dimensions = dimensions;
		this.efConstruction = efConstruction;
		this.entryBlkno = entryBlkno;
		this.entryOffno = entryOffno;
		this.entryLevel = entryLevel;
		this.insertPage = insertPage;
		this.buildstate = buildstate;
		this.invalidOffsetNumber = invalidOffsetNumber;
		this.hnswMetaPageData = hnswMetaPageData;
		this.unlockReleaseBuffer = unlockReleaseBuffer;
		this.forkNum = forkNum;
	}

	public Integer getDimensions() {
		return dimensions;
	}

	public void setDimensions(Integer dimensions) {
		this.dimensions = dimensions;
	}

	public String getEfConstruction() {
		return efConstruction;
	}

	public void setEfConstruction(String efConstruction) {
		this.efConstruction = efConstruction;
	}

	public String getEntryBlkno() {
		return entryBlkno;
	}

	public void setEntryBlkno(String entryBlkno) {
		this.entryBlkno = entryBlkno;
	}

	public boolean isEntryOffno() {
		return entryOffno;
	}

	public void setEntryOffno(boolean entryOffno) {
		this.entryOffno = entryOffno;
	}

	public String getEntryLevel() {
		return entryLevel;
	}

	public void setEntryLevel(String entryLevel) {
		this.entryLevel = entryLevel;
	}

	public Integer getInsertPage() {
		return insertPage;
	}

	public void setInsertPage(Integer insertPage) {
		this.insertPage = insertPage;
	}

	public boolean isBuildstate() {
		return buildstate;
	}

	public void setBuildstate(boolean buildstate) {
		this.buildstate = buildstate;
	}

	public Integer getInvalidOffsetNumber() {
		return invalidOffsetNumber;
	}

	public void setInvalidOffsetNumber(Integer invalidOffsetNumber) {
		this.invalidOffsetNumber = invalidOffsetNumber;
	}

	public String getHnswMetaPageData() {
		return hnswMetaPageData;
	}

	public void setHnswMetaPageData(String hnswMetaPageData) {
		this.hnswMetaPageData = hnswMetaPageData;
	}

	public String getUnlockReleaseBuffer() {
		return unlockReleaseBuffer;
	}

	public void setUnlockReleaseBuffer(String unlockReleaseBuffer) {
		this.unlockReleaseBuffer = unlockReleaseBuffer;
	}

	public String getForkNum() {
		return forkNum;
	}

	public void setForkNum(String forkNum) {
		this.forkNum = forkNum;
	}

}
