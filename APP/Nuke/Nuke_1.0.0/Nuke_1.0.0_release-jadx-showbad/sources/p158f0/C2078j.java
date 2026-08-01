package p158f0;

import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2078j {

    /* JADX INFO: renamed from: a */
    public int f6951a;

    /* JADX INFO: renamed from: b */
    public long[] f6952b;

    /* JADX INFO: renamed from: c */
    public int[] f6953c;

    /* JADX INFO: renamed from: d */
    public int[] f6954d;

    /* JADX INFO: renamed from: e */
    public int f6955e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m3818a(long j5) {
        int i5 = this.f6951a + 1;
        long[] jArr = this.f6952b;
        int length = jArr.length;
        if (i5 > length) {
            int i6 = length * 2;
            long[] jArr2 = new long[i6];
            int[] iArr = new int[i6];
            AbstractC0972l.m1992P(jArr, jArr2, 0, 0, jArr.length);
            AbstractC0972l.m1994R(this.f6953c, iArr, 0, 0, 14);
            this.f6952b = jArr2;
            this.f6953c = iArr;
        }
        int i7 = this.f6951a;
        this.f6951a = i7 + 1;
        int length2 = this.f6954d.length;
        if (this.f6955e >= length2) {
            int i8 = length2 * 2;
            int[] iArr2 = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                iArr2[i9] = i10;
                i9 = i10;
            }
            AbstractC0972l.m1994R(this.f6954d, iArr2, 0, 0, 14);
            this.f6954d = iArr2;
        }
        int i11 = this.f6955e;
        int[] iArr3 = this.f6954d;
        this.f6955e = iArr3[i11];
        long[] jArr3 = this.f6952b;
        jArr3[i7] = j5;
        this.f6953c[i7] = i11;
        iArr3[i11] = i7;
        while (i7 > 0) {
            int i12 = ((i7 + 1) >> 1) - 1;
            if (AbstractC1665j.m2988h(jArr3[i12], j5) <= 0) {
                break;
            }
            m3819b(i12, i7);
            i7 = i12;
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3819b(int i5, int i6) {
        long[] jArr = this.f6952b;
        int[] iArr = this.f6953c;
        int[] iArr2 = this.f6954d;
        long j5 = jArr[i5];
        jArr[i5] = jArr[i6];
        jArr[i6] = j5;
        int i7 = iArr[i5];
        int i8 = iArr[i6];
        iArr[i5] = i8;
        iArr[i6] = i7;
        iArr2[i8] = i5;
        iArr2[i7] = i6;
    }
}
