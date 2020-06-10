package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListThiSinh {
	static Scanner ip = new Scanner(System.in);

	// nhập thông tin
	public static ArrayList<ThiSinh> inputData() {
		ArrayList<ThiSinh> listArr = new ArrayList<ThiSinh>();
		boolean cont = true;
		int n = 0;
		do {

			try {
				System.out.print("Bạn muốn nhập bao nhiêu thí sinh: ");
				n = Integer.parseInt(ip.nextLine());

				if (n < 0) {
					throw new NumberException("Số lượng thí sinh phải lớn hơn 0.!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("ĐỊnh dạng số lượng là số..!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		// nhập thông tin cho mỗi thí sinh
		for (int i = 0; i < n; i++) {
			System.out.print("Họ Tên Thí Sinh:");
			String name = ip.nextLine();
			float toan = 0, ly = 0, hoa = 0;
			boolean check = true;
			// điểm toán
			do {
				try {
					System.out.print("Điểm Toán: ");
					toan = Float.parseFloat(ip.nextLine());

					if (toan < 0 || toan > 10) {
						throw new NumberException("Vui lòng nhập điểm trong khoảng 0 -> 10");
					}
					check = false;
				} catch (NumberFormatException e) {
					System.out.println("Điểm phải là số..!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (check);
			// điểm lý
			do {
				try {
					System.out.print("Điểm Lý: ");
					ly = Float.parseFloat(ip.nextLine());
					if (ly < 0 || ly > 10) {
						throw new NumberException("Vui lòng nhập điểm trong khoảng 0 -> 10");
					}
					check = true;
				} catch (NumberFormatException e) {
					System.out.println("Điểm phải là số..!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (!check);
			// điểm hóa
			do {
				try {
					System.out.print("Điểm Hóa: ");
					hoa = Float.parseFloat(ip.nextLine());

					if (hoa < 0 || hoa > 10) {
						throw new NumberException("Vui lòng nhập điểm trong khoảng 0 -> 10");
					}
					check = false;
				} catch (NumberFormatException e) {
					System.out.println("Điểm phải là số..!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (check);
			ThiSinh list = new ThiSinh(name, toan, ly, hoa);
			listArr.add(list);
		}
		return listArr;
	}

	// Xuất thông tin
	public static void DisplayData(ArrayList<ThiSinh> list) {
		System.out.println("Thông tin thí sinh vừa nhập là: ");
		if (list.size() > 0) {
			for (ThiSinh thiSinh : list) {
				System.out.println(thiSinh + " ");
			}
		} else {
			System.out.println("Không có thí sinh để hiển thị");
		}

	}

	public static void main(String[] args) {
		ArrayList<ThiSinh> list = new ArrayList<ThiSinh>();
		DisplayData(list);
		
		
	}
}
