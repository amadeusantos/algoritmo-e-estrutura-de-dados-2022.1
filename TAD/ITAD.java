package TAD;

public interface ITAD {
	
	public ITAD getTAD();
	int getId();
	void setId(int id);
	
	String getCampo01();
	void setCampo01(String campo01);
	float getCampo02();
	void setCampo02(float campo02);
	boolean isCampo03();
	void setCampo03(boolean campo03);

	String print();
}