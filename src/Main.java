import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong day: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("So luong phan tu phai > 0. Nhap lai: ");
            n = scanner.nextInt();
        }

        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Xuat day: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Nhap so muon them: ");
        int soThem = scanner.nextInt();
        arr[n] = soThem;
        n++;
        System.out.print("Xuat day sau khi them: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Nhap so muon xoa: ");
        int soMuonXoa = scanner.nextInt();
        boolean timThay = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == soMuonXoa) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay so can xoa.");
        }

        System.out.print("Xuat day sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int soMuonSua;
        boolean tonTai;
        do {
            System.out.print("Nhap so muon sua: ");
            soMuonSua = scanner.nextInt();
            tonTai = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == soMuonSua) {
                    tonTai = true;
                    break;
                }
            }
            if (!tonTai) {
                System.out.println("So khong ton tai trong day. Nhap lai.");
            }
        } while (!tonTai);

        System.out.print("Nhap gia tri moi: ");
        int giaTriMoi = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == soMuonSua) {
                arr[i] = giaTriMoi;
            }
        }

        System.out.print("Xuat day sau khi sua: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Xuat day sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        double tb = tong / n;
        System.out.println("Gia tri trung binh: " + tb);
        int ganNhat = arr[0];
        double min = Math.abs(arr[0] - tb);
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i] - tb) < min) {
                min = Math.abs(arr[i] - tb);
                ganNhat = arr[i];
            }
        }
        System.out.println("Phan tu gan trung binh nhat: " + ganNhat);
        scanner.close();
    }
}