package cn.zr.wx4j.model.mass.tag;

import cn.zr.wx4j.model.container.MediaIdContainer;

public class NewsMassWithTag extends BaseMassWithTag {
	private MediaIdContainer mpnews;
	private String send_ignore_reprint;

	public NewsMassWithTag() {
		super();
	}

	public NewsMassWithTag(String msgtype, MassFilter filter, MediaIdContainer mpnews, String send_ignore_reprint) {
		super(msgtype, filter);
		this.mpnews = mpnews;
		this.send_ignore_reprint = send_ignore_reprint;
	}

	public MediaIdContainer getMpnews() {
		return mpnews;
	}

	public void setMpnews(MediaIdContainer mpnews) {
		this.mpnews = mpnews;
	}

	public String getSend_ignore_reprint() {
		return send_ignore_reprint;
	}

	public void setSend_ignore_reprint(String send_ignore_reprint) {
		this.send_ignore_reprint = send_ignore_reprint;
	}

}
