package cn.zr.wx4j.model.receiveEvent;

public class ReceivePicSysPhotoEvent extends ReceiveEvent {
	private String EventKey;// �¼�KEYֵ��qrscene_Ϊǰ׺������Ϊ��ά��Ĳ���ֵ
	private String SendPicsInfo;	//���͵�ͼƬ��Ϣ
	public String getSendPicsInfo() {
		return SendPicsInfo;
	}
	public void setSendPicsInfo(String sendPicsInfo) {
		SendPicsInfo = sendPicsInfo;
	}
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
		Count = count;
	}
	public String getPicList() {
		return PicList;
	}
	public void setPicList(String picList) {
		PicList = picList;
	}
	public String getPicMd5Sum() {
		return PicMd5Sum;
	}
	public void setPicMd5Sum(String picMd5Sum) {
		PicMd5Sum = picMd5Sum;
	}
	private String Count;	//���͵�ͼƬ����
	private String PicList;	//ͼƬ�б�
	private String PicMd5Sum;	//ͼƬ��MD5ֵ������������Ҫ����������֤���յ�ͼƬ
	public String getEventKey() {
		return EventKey;
	}
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
	
}