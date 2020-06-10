package bai2;

public class ThiSinh {
	private String name;
	private float diemToan;
	private float diemLy;
	private float diemHoa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public ThiSinh(String name, float diemToan, float diemLy, float diemHoa) {
		super();
		this.name = name;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public ThiSinh() {
		super();
	}

	@Override
	public String toString() {
		return "Tên: " + this.name + " - Điểm Toán: " + this.diemToan + " - Điểm Lý: " + this.diemLy + " - Điểm Hóa: "
				+ this.diemHoa;
	}

	public float tongDiem() {
		return (float) this.diemHoa + this.diemLy + this.diemToan;
	}

}
