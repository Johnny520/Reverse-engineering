package p119i1;

import p024b9.AbstractC1061t;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i1.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3143o {

    /* JADX INFO: renamed from: a */
    public int f8382a;

    /* JADX INFO: renamed from: b */
    public long[] f8383b = AbstractC3149r.m11860b(16);

    /* JADX INFO: renamed from: c */
    public int[] f8384c = new int[16];

    /* JADX INFO: renamed from: d */
    public int[] f8385d;

    /* JADX INFO: renamed from: e */
    public int f8386e;

    public C3143o() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f8385d = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m11821a(long j10) {
        m11823c(this.f8382a + 1);
        int i10 = this.f8382a;
        this.f8382a = i10 + 1;
        int iM11822b = m11822b();
        this.f8383b[i10] = j10;
        this.f8384c[i10] = iM11822b;
        this.f8385d[iM11822b] = i10;
        m11828h(i10);
        return iM11822b;
    }

    /* JADX INFO: renamed from: b */
    public final int m11822b() {
        int length = this.f8385d.length;
        if (this.f8386e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            AbstractC5102r.m20663o(this.f8385d, iArr, 0, 0, 0, 14, null);
            this.f8385d = iArr;
        }
        int i13 = this.f8386e;
        this.f8386e = this.f8385d[i13];
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public final void m11823c(int i10) {
        int length = this.f8383b.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        long[] jArrM11860b = AbstractC3149r.m11860b(i11);
        int[] iArr = new int[i11];
        AbstractC5102r.m20664p(this.f8383b, jArrM11860b, 0, 0, 0, 12, null);
        AbstractC5102r.m20663o(this.f8384c, iArr, 0, 0, 0, 14, null);
        this.f8383b = jArrM11860b;
        this.f8384c = iArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m11824d(int i10) {
        this.f8385d[i10] = this.f8386e;
        this.f8386e = i10;
    }

    /* JADX INFO: renamed from: e */
    public final long m11825e(long j10) {
        return this.f8382a > 0 ? this.f8383b[0] : j10;
    }

    /* JADX INFO: renamed from: f */
    public final void m11826f(int i10) {
        int i11 = this.f8385d[i10];
        m11829i(i11, this.f8382a - 1);
        this.f8382a--;
        m11828h(i11);
        m11827g(i11);
        m11824d(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m11827g(int i10) {
        long[] jArr = this.f8383b;
        int i11 = this.f8382a >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 >= this.f8382a || AbstractC1061t.m3844e(jArr[i12], jArr[i13]) >= 0) {
                if (AbstractC1061t.m3844e(jArr[i13], jArr[i10]) >= 0) {
                    return;
                }
                m11829i(i13, i10);
                i10 = i13;
            } else {
                if (AbstractC1061t.m3844e(jArr[i12], jArr[i10]) >= 0) {
                    return;
                }
                m11829i(i12, i10);
                i10 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11828h(int i10) {
        long[] jArr = this.f8383b;
        long j10 = jArr[i10];
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (AbstractC1061t.m3844e(jArr[i11], j10) <= 0) {
                return;
            }
            m11829i(i11, i10);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11829i(int i10, int i11) {
        long[] jArr = this.f8383b;
        int[] iArr = this.f8384c;
        int[] iArr2 = this.f8385d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
