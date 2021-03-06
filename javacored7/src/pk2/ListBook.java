package pk2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ListBook {
	static Scanner input = new Scanner(System.in);
	public static ArrayList<Books> inputData() {
		ArrayList<Books> list = new ArrayList<Books>();
		System.out.print("Số Sách Bạn Cần Nhập Là: ");
		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.print("Tên Sách: ");
			String name = input.nextLine();
			System.out.print("Năm Xuất Bản: ");
			int year = Integer.parseInt(input.nextLine());
			System.out.println("=============");
			Books books = new Books(i, name, year);
			list.add(books);
		}
		return list;
	}

	public static void Display(ArrayList<Books> list) {
		if (list.size() > 0) {
			for (Books books : list) {
				System.out.println(list);
			}
		} else {
			System.out.println("Xảy ra lỗi");
		}
	}

	public static void searchData(ArrayList<Books> list) {
		System.out.print("Nhập id Bạn cần tìm: ");
		int id = Integer.parseInt(input.nextLine());
		for (Books books : list) {
			if(books.getId() == id) {
				System.out.println(books);
			}else {
				System.out.println("id bạn nhập chưa có..!");
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Books> list = inputData();
		Display(list);
		searchData(list);
	}

}
