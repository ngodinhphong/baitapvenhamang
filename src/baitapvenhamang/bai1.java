package baitapvenhamang;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		
		//code đầu vào
		
		int soPhanTu;
		int[] mang;
		int luaChon;
		Scanner scan = new Scanner(System.in);
		
		//lấy thông tin người dùng
		do {
			System.out.println("Nhap so phan tu cua mang: ");
			soPhanTu = scan.nextInt();
			if(soPhanTu <= 0) {
				System.out.println("Ban phai nhap vao so lon hon 0!");
			}
		}while(soPhanTu <= 0);
		
		//tạo mảng
		mang = new int[soPhanTu];
		System.out.println("NHẬP MẢNG:");
		nhapMang(mang);
		//danh sách lựa chọn
		listMenu();
		
		//lấy lựa chọn người dùng
		do {
			System.out.println("\nNhap vao cac lua chon (Cac so tu 0 den 10)");
			luaChon = scan.nextInt();
			if(luaChon <= -1 || luaChon > 10) {
				System.out.println("Ban phai nhap vao so tu 0 den 10");
			}
			else {
				xuLyLuaChon( mang, luaChon);
			}
		}while(true);
		
		
		//code xử lý
		
		//code đầu ra
		
	}

	public static void nhapMang(int[] mang) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<mang.length; i++) {
			System.out.println("Vui lòng nhập giá trị cho phần tử ở vị trí thứ: " +i);
			mang[i] = scan.nextInt();
		}
	}
	
	public static void listMenu() {
		System.out.println("---------- MENU ----------");
		System.out.println("1. Tính tổng các số dương.");
		System.out.println("2. Tính tổng các số lẻ.");
		System.out.println("3. Đếm có bao nhiêu số dương trong mảng.");
		System.out.println("4. Tìm số nhỏ nhất trong mảng.");
		System.out.println("5. Tìm số dương nhỏ nhất trong mảng.");
		System.out.println("6. Tìm số chẵn cuối cùng trong mảng.");
		System.out.println("7. Tìm số chẵn đầu tiên trong mảng.");
		System.out.println("8. Tìm số nguyên tố đầu tiên trong mảng.");
		System.out.println("9. Tìm số dương cuối cùng trong mảng.");
		System.out.println("10. Tìm giá trị chẵn nhỏ nhất trong mảng.");
		System.out.println("0. Thoát chương trình.");
	}
	
	private static void xuLyLuaChon(int[] mang, int luaChon) {
		switch (luaChon) {
		case 1:
			tinhTongSoDuong(mang);
			break;
			
		case 2:
			tinhTongSoLe(mang);
			break;
			
		case 3:
			demSoDuong(mang);
			break;
			
		case 4:
			timSoNhoNhat(mang);
			break;
			
		case 5:
			timSoDuongNhoNhat(mang);
			break;
			
		case 6:
			timSoChanCuoiCung(mang);
			break;
			
		case 7:
			timSoChanDauTien(mang);
			break;
			
		case 8:
			timSoNguyenToDauTien(mang);
			break;
			
		case 9:
			timSoDuongCuoiCung(mang);
			break;
			
		case 10:
			timSoChanNhoNhatTrongMang(mang);
			break;
			
		default:
			System.out.println("Chương trình kết thúc");
			System.exit(0);
			break;
		}
		
	}
	
	public static void tinhTongSoDuong(int[] mang) {
		
		int tongSoDuong = 0;
		for(int i = 0; i < mang.length; i++) {
			if(mang[i] > 0) {
				tongSoDuong += mang[i];
			}
		}
		
		System.out.printf("Tổng số dương trong mảng là: %d", tongSoDuong);
	}
	
	public static void tinhTongSoLe(int[] mang) {
		
		int tongSoLe = 0;
		for(int i = 0; i < mang.length; i++) {
			if(mang[i] % 2 != 0) {
				tongSoLe += mang[i];
			}
		}

		System.out.printf("Tổng số lẻ trong mảng là: %d", tongSoLe);
	}
	
	public static void demSoDuong(int[] mang) {

		int demSoDuong = 0;
		for(int i = 0; i < mang.length; i++) {
			if(mang[i] > 0) {
				demSoDuong += 1;
			}
		}

		System.out.println("Có " + demSoDuong + " số dương trong mảng");
	}
	
	public static void timSoNhoNhat(int[] mang) {
		
		int soNhoNhat = mang[0];
		for(int i = 1; i < mang.length; i++) {
			if(mang[i] < soNhoNhat) {
				soNhoNhat = mang[i];
			}
		}

		System.out.printf("Số nhỏ nhất trong mảng là: %d", soNhoNhat);
	}
	
	public static void timSoDuongNhoNhat(int[] mang) {

		int soDuongNhoNhat = mang[0];
		for(int i = 1; i < mang.length; i++) {
			if(mang[i] > 0 & mang[i] < soDuongNhoNhat) {
				soDuongNhoNhat = mang[i];
			}
			else {
			}
		}

		if(soDuongNhoNhat <= 0) {
			System.out.print("Không có số dương trong mảng");
		}
		else {
			System.out.printf("Số dương nhỏ nhất trong mảng là: %d", soDuongNhoNhat);
		}
	}
	
	public static void timSoChanCuoiCung(int[] mang) {

		int soChanCuoiCung = -1;
		for(int i = 0; i < mang.length; i++) {
			if(mang[i] % 2 == 0) {
				soChanCuoiCung = mang[i];
			}
		}

		if(soChanCuoiCung == -1) {
			System.out.print("Không tìm thấy số chẵn trong mảng");
		}
		else {
			System.out.printf("Số chẵn cuối cùng trong mảng là: %d", soChanCuoiCung);
		}
	}
	
	public static void timSoChanDauTien(int[] mang) {

		int soChanDauTien = -1;
		for(int i = 0; i < mang.length; i++) {
			if(mang[i] % 2 == 0) {
				soChanDauTien = mang[i];
				break;
			}
		}

		if(soChanDauTien == -1) {
			System.out.print("Không tìm thấy số chẵn trong mảng");
		}
		else {
			System.out.printf("Số chẵn đầu tiên trong mảng là: %d",soChanDauTien);
		}
	}
	
	public static void timSoNguyenToDauTien(int[] mang) {
		
		int soNguyenTo = -1;
		boolean index = true;
		for(int i = 0; i< mang.length; i ++) {
			if(kiemTraSoNguyenTo(mang[i])) {
				soNguyenTo = mang[i];
				break;
			}
		}
		
		if(soNguyenTo == -1) {
			System.out.print("Không tìm thấy số nguyên tố trong mảng");
		}
		else {
			System.out.printf("Số nguyên tố đầu tiên trong mảng là: %d", soNguyenTo);
		}
		
	}
	public static boolean kiemTraSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	
	public static void timSoDuongCuoiCung(int[] mang) {

		int soDuongCuoiCung = -1;
		for(int i = 0; i < mang.length; i++) {
			if(mang[i] > 0) {
				soDuongCuoiCung = mang[i];
			}
		}

		if(soDuongCuoiCung == -1) {
			System.out.print("Không tìm thấy số dương trong mảng");
		}
		else {
			System.out.printf("Số dương cuối cùng trong mảng là: %d", soDuongCuoiCung);
		}
	}
	
	public static void timSoChanNhoNhatTrongMang(int[] mang) {

		int soChanNhoNhat = -1;
		for (int i = 0; i < mang.length; i++) {
			if(mang[i] % 2 == 0 ) {
				soChanNhoNhat = mang[i];
				break;
			}
		}
		if(soChanNhoNhat == -1) {
			System.out.println("Không có số chẵn trong mảng");
		}else {
			for (int t = 0; t < mang.length; t++) {
				if(mang[t] % 2 == 0 && mang[t] < soChanNhoNhat) {
					soChanNhoNhat = mang[t];
				}
			}
			System.out.printf("Số chẵn nhỏ nhất trong mảng là: %d", soChanNhoNhat);
			
		}
		
	}

}
