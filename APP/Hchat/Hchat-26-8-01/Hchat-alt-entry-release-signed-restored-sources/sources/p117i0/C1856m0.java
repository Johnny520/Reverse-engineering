package p117i0;

import java.util.Arrays;

/* JADX INFO: renamed from: i0.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1856m0 {

    /* JADX INFO: renamed from: a */
    public int[] f6174a;

    /* JADX INFO: renamed from: b */
    public int f6175b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1856m0() {
        this.f6174a = new int[10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m4575a(int i9) {
        int i10 = this.f6175b - 1;
        return i10 >= 0 ? this.f6174a[i10] : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m4576b() {
        int[] iArr = this.f6174a;
        int i9 = this.f6175b - 1;
        this.f6175b = i9;
        return iArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m4577c(int i9) {
        int[] iArrCopyOf = this.f6174a;
        if (this.f6175b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f6174a = iArrCopyOf;
        }
        int i10 = this.f6175b;
        this.f6175b = i10 + 1;
        iArrCopyOf[i10] = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m4578d(int i9, int i10, int i11) {
        int i12 = this.f6175b;
        int[] iArrCopyOf = this.f6174a;
        int i13 = i12 + 3;
        if (i13 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f6174a = iArrCopyOf;
        }
        iArrCopyOf[i12] = i9 + i11;
        iArrCopyOf[i12 + 1] = i10 + i11;
        iArrCopyOf[i12 + 2] = i11;
        this.f6175b = i13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m4579e(int i9, int i10, int i11, int i12) {
        int i13 = this.f6175b;
        int[] iArrCopyOf = this.f6174a;
        int i14 = i13 + 4;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f6174a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i9;
        iArrCopyOf[i13 + 1] = i10;
        iArrCopyOf[i13 + 2] = i11;
        iArrCopyOf[i13 + 3] = i12;
        this.f6175b = i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m4580f(int i9, int i10) {
        if (i9 < i10) {
            int i11 = i9 - 3;
            for (int i12 = i9; i12 < i10; i12 += 3) {
                int[] iArr = this.f6174a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    m4581g(i11, i12);
                }
            }
            m4581g(i11 + 3, i10);
            m4580f(i9, i11);
            m4580f(i11 + 6, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m4581g(int i9, int i10) {
        int[] iArr = this.f6174a;
        int i11 = iArr[i9];
        iArr[i9] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i9 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i9 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public C1856m0(int i9) {
        this.f6174a = new int[i9];
    }
}
