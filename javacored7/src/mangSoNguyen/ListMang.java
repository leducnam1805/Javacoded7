package mangSoNguyen;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMang {
	static Scanner input = new Scanner(System.in);

	// Nhập mảng số nguyên
	public static ArrayList<Integer> inputData() {
		boolean cont = true;
		int n = 0;
		// Nhập số phần tử
		do {
			try {
				System.out.print("Nhập số phần tử của mảng: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 0)
					throw new NumberException("Số phần tử của mảng không được nhỏ hơn 0...!");
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Xin nhập ký tự là số.!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);

		ArrayList<Integer> listInt = new ArrayList<Integer>();
		// Nhập từng phần tử cho mảng
		for (int i = 0; i < n; i++) {
			try {
				System.out.print("Phần tử số " + (i + 1) + " là: ");
				int number = Integer.parseInt(input.nextLine());
				listInt.add(number);
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số!");
			}
		}
		return listInt;
	}

	// Xuất mảng số nguyên
	public static void displayData(ArrayList<Integer> listInt) {
		if (listInt.size() > 0) {
			System.out.print("Mảng của bạn là: ");
			for (Integer integer : listInt) {
				System.out.println(integer + " ");
			}
			System.out.println();
		} else
			System.out.println("Mảng rỗng!");
	}

	// Tính tổng mảng
	public static int tinhTongMang(ArrayList<Integer> listInt) {
		int tong = 0;
		for (Integer integer : listInt) {
			tong += integer;
		}
		return tong;
	}

	// tính tồng phần tử đầu và cuối
	public static int tinhTongDauCuoi(ArrayList<Integer> listInt) {
		if (listInt.size() == 1)
			return listInt.get(0);
		return listInt.get(0) + listInt.get(listInt.size() - 1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> listNumber = new ArrayList<>();
		listNumber = inputData();
		displayData(listNumber);
		if (listNumber.size() > 0) {
			System.out.println("Tổng các phần tử có trong mảng là: " + tinhTongMang(listNumber));
			System.out.println("Tồng phần tử đầu và cuối là: " + tinhTongDauCuoi(listNumber));
		}
	}
}
