package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i11 {

    /* JADX INFO: renamed from: a */
    public int[] f4214a;

    /* JADX INFO: renamed from: b */
    public int f4215b;

    public i11() {
        this.f4214a = new int[10];
    }

    /* JADX INFO: renamed from: a */
    public int m2241a(int i) {
        int i2 = this.f4215b - 1;
        return i2 >= 0 ? this.f4214a[i2] : i;
    }

    /* JADX INFO: renamed from: b */
    public int m2242b() {
        int[] iArr = this.f4214a;
        int i = this.f4215b - 1;
        this.f4215b = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: c */
    public void m2243c(int i) {
        int[] iArrCopyOf = this.f4214a;
        if (this.f4215b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f4214a = iArrCopyOf;
        }
        int i2 = this.f4215b;
        this.f4215b = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: d */
    public void m2244d(int i, int i2, int i3) {
        int i4 = this.f4215b;
        int[] iArrCopyOf = this.f4214a;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f4214a = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f4215b = i5;
    }

    /* JADX INFO: renamed from: e */
    public void m2245e(int i, int i2, int i3, int i4) {
        int i5 = this.f4215b;
        int[] iArrCopyOf = this.f4214a;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f4214a = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f4215b = i6;
    }

    /* JADX INFO: renamed from: f */
    public void m2246f(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f4214a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m2247g(i3, i4);
                }
            }
            m2247g(i3 + 3, i2);
            m2246f(i, i3);
            m2246f(i3 + 6, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2247g(int i, int i2) {
        int[] iArr = this.f4214a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public i11(int i) {
        this.f4214a = new int[i];
    }
}
