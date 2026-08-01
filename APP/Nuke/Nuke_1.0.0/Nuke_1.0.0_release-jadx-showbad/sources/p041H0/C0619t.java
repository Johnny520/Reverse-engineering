package p041H0;

import java.util.Arrays;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: H0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0619t {

    /* JADX INFO: renamed from: a */
    public int[] f1980a;

    /* JADX INFO: renamed from: b */
    public int f1981b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0619t() {
        this.f1980a = new int[10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m1057a(int i5) {
        int i6 = this.f1981b - 1;
        return i6 >= 0 ? this.f1980a[i6] : i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m1058b() {
        int[] iArr = this.f1980a;
        int i5 = this.f1981b - 1;
        this.f1981b = i5;
        return iArr[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m1059c(int i5) {
        int[] iArrCopyOf = this.f1980a;
        if (this.f1981b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f1980a = iArrCopyOf;
        }
        int i6 = this.f1981b;
        this.f1981b = i6 + 1;
        iArrCopyOf[i6] = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m1060d(int i5, int i6, int i7) {
        int i8 = this.f1981b;
        int[] iArrCopyOf = this.f1980a;
        int i9 = i8 + 3;
        if (i9 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f1980a = iArrCopyOf;
        }
        iArrCopyOf[i8] = i5 + i7;
        iArrCopyOf[i8 + 1] = i6 + i7;
        iArrCopyOf[i8 + 2] = i7;
        this.f1981b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m1061e(int i5, int i6, int i7, int i8) {
        int i9 = this.f1981b;
        int[] iArrCopyOf = this.f1980a;
        int i10 = i9 + 4;
        if (i10 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f1980a = iArrCopyOf;
        }
        iArrCopyOf[i9] = i5;
        iArrCopyOf[i9 + 1] = i6;
        iArrCopyOf[i9 + 2] = i7;
        iArrCopyOf[i9 + 3] = i8;
        this.f1981b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m1062f(int i5, int i6) {
        if (i5 < i6) {
            int i7 = i5 - 3;
            for (int i8 = i5; i8 < i6; i8 += 3) {
                int[] iArr = this.f1980a;
                int i9 = iArr[i8];
                int i10 = iArr[i6];
                if (i9 < i10 || (i9 == i10 && iArr[i8 + 1] <= iArr[i6 + 1])) {
                    i7 += 3;
                    m1063g(i7, i8);
                }
            }
            m1063g(i7 + 3, i6);
            m1062f(i5, i7);
            m1062f(i7 + 6, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m1063g(int i5, int i6) {
        int[] iArr = this.f1980a;
        int i7 = iArr[i5];
        iArr[i5] = iArr[i6];
        iArr[i6] = i7;
        int i8 = i5 + 1;
        int i9 = i6 + 1;
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
        int i11 = i5 + 2;
        int i12 = i6 + 2;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
    }

    public C0619t(int i5) {
        this.f1980a = new int[i5];
    }
}
