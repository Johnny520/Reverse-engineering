package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ng0 {

    /* JADX INFO: renamed from: a */
    public int f4258a;

    /* JADX INFO: renamed from: b */
    public int f4259b;

    /* JADX INFO: renamed from: c */
    public Object f4260c;

    /* JADX INFO: renamed from: d */
    public Object f4261d;

    /* JADX INFO: renamed from: e */
    public Object f4262e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m2702a(long j) {
        int i = this.f4258a + 1;
        long[] jArr = (long[]) this.f4260c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            AbstractC0201f9.m1056b0(jArr, jArr2, 0, 0, jArr.length);
            AbstractC0201f9.m1058d0((int[]) this.f4261d, iArr, 0, 0, 14);
            this.f4260c = jArr2;
            this.f4261d = iArr;
        }
        int i3 = this.f4258a;
        this.f4258a = i3 + 1;
        int length2 = ((int[]) this.f4262e).length;
        if (this.f4259b >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            AbstractC0201f9.m1058d0((int[]) this.f4262e, iArr2, 0, 0, 14);
            this.f4262e = iArr2;
        }
        int i7 = this.f4259b;
        int[] iArr3 = (int[]) this.f4262e;
        this.f4259b = iArr3[i7];
        long[] jArr3 = (long[]) this.f4260c;
        jArr3[i3] = j;
        ((int[]) this.f4261d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (p30.m3009s(jArr3[i8], j) <= 0) {
                break;
            }
            m2704c(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m2703b(int i) {
        int i2 = this.f4259b;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        x10.m5082a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m2704c(int i, int i2) {
        long[] jArr = (long[]) this.f4260c;
        int[] iArr = (int[]) this.f4261d;
        int[] iArr2 = (int[]) this.f4262e;
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
