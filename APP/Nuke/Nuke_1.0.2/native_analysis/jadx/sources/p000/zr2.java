package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zr2 {

    /* JADX INFO: renamed from: a */
    public int f14075a;

    /* JADX INFO: renamed from: b */
    public long[] f14076b;

    /* JADX INFO: renamed from: c */
    public int[] f14077c;

    /* JADX INFO: renamed from: d */
    public int[] f14078d;

    /* JADX INFO: renamed from: e */
    public int f14079e;

    /* JADX INFO: renamed from: a */
    public final int m6502a(long j) {
        int i = this.f14075a + 1;
        long[] jArr = this.f14076b;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            AbstractC0460mg.m3087b0(jArr, jArr2, 0, 0, jArr.length);
            AbstractC0460mg.m3090e0(this.f14077c, iArr, 0, 0, 14);
            this.f14076b = jArr2;
            this.f14077c = iArr;
        }
        int i3 = this.f14075a;
        this.f14075a = i3 + 1;
        int length2 = this.f14078d.length;
        if (this.f14079e >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            AbstractC0460mg.m3090e0(this.f14078d, iArr2, 0, 0, 14);
            this.f14078d = iArr2;
        }
        int i7 = this.f14079e;
        int[] iArr3 = this.f14078d;
        this.f14079e = iArr3[i7];
        long[] jArr3 = this.f14076b;
        jArr3[i3] = j;
        this.f14077c[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (t11.m5090p(jArr3[i8], j) <= 0) {
                break;
            }
            m6503b(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public final void m6503b(int i, int i2) {
        long[] jArr = this.f14076b;
        int[] iArr = this.f14077c;
        int[] iArr2 = this.f14078d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
