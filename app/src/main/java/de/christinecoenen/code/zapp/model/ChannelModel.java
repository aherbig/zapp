package de.christinecoenen.code.zapp.model;

import android.content.Intent;
import android.net.Uri;

import java.io.Serializable;

public class ChannelModel implements Serializable {

	private String id;
	private String name;
	private String subtitle;
	private String streamUrl;
	private int drawableId;
	private int color = 0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getStreamUrl() {
		return streamUrl;
	}

	public void setStreamUrl(String streamUrl) {
		this.streamUrl = streamUrl;
	}

	public int getDrawableId() {
		return drawableId;
	}

	public void setDrawableId(int drawableId) {
		this.drawableId = drawableId;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Intent getVideoShareIntent() {
		Intent videoIntent = new Intent(Intent.ACTION_VIEW);
		videoIntent.setDataAndType(Uri.parse(streamUrl), "video/*");
		return videoIntent;
	}

	@Override
	public String toString() {
		return "ChannelModel{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", subtitle='" + subtitle + '\'' +
				", streamUrl='" + streamUrl + '\'' +
				", drawableId=" + drawableId +
				", color=" + color +
				'}';
	}
}
