package de.cm.osm2po.snapp;



public enum MarkerType {
	
	TOUCH_MARKER(0, "", "", R.drawable.ic_marker16, false),
	SOURCE_MARKER(1, "Source", "", R.drawable.ic_source32, true),
	TARGET_MARKER(2, "Target", "", R.drawable.ic_target32, true),
	SOURCE_NEW_MARKER(3, "New Source", "", R.drawable.ic_newsource32, true),
	GPS_MARKER(4, "GPS Location", "", R.drawable.ic_gps40, false);

	private int index;
	private String title;
	private String snippet;
	private int iconId;
	private boolean bottomCenter;
	
	private MarkerType(int index,
			String title, String snippet, int iconId, boolean bottomCenter) {
		this.index = index;
		this.title = title;
		this.snippet = snippet;
		this.iconId = iconId;
		this.bottomCenter = bottomCenter;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSnippet() {
		return this.snippet;
	}
	
	public int getIconId() {
		return this.iconId;
	}
	
	public boolean isBottomCenter() {
		return this.bottomCenter;
	}
}
