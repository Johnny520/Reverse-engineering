package p321w4;

/* JADX INFO: renamed from: w4.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9180j {

    /* JADX INFO: renamed from: l */
    public static final C9180j f31304l = new C9180j();

    /* JADX INFO: renamed from: a */
    public short f31305a;

    /* JADX INFO: renamed from: b */
    public int f31306b;

    /* JADX INFO: renamed from: c */
    public int[] f31307c;

    /* JADX INFO: renamed from: d */
    public short f31308d;

    /* JADX INFO: renamed from: e */
    public short f31309e;

    /* JADX INFO: renamed from: f */
    public short f31310f;

    /* JADX INFO: renamed from: g */
    public short f31311g;

    /* JADX INFO: renamed from: h */
    public C9178h f31312h;

    /* JADX INFO: renamed from: i */
    public C9180j f31313i;

    /* JADX INFO: renamed from: j */
    public C9175e f31314j;

    /* JADX INFO: renamed from: k */
    public C9180j f31315k;

    /* JADX INFO: renamed from: a */
    public final void m35662a(int i10, int i11, int i12) {
        if (this.f31307c == null) {
            this.f31307c = new int[6];
        }
        int[] iArr = this.f31307c;
        int i13 = iArr[0];
        if (i13 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f31307c = iArr2;
        }
        int[] iArr3 = this.f31307c;
        iArr3[i13 + 1] = i10;
        int i14 = i13 + 2;
        iArr3[i14] = i11 | i12;
        iArr3[0] = i14;
    }

    /* JADX INFO: renamed from: b */
    public final void m35663b(C9180j c9180j) {
        C9180j c9180j2 = f31304l;
        this.f31315k = c9180j2;
        C9180j c9180j3 = c9180j2;
        C9180j c9180jM35666e = this;
        while (c9180jM35666e != f31304l) {
            C9180j c9180j4 = c9180jM35666e.f31315k;
            c9180jM35666e.f31315k = c9180j3;
            if ((c9180jM35666e.f31305a & 64) != 0 && c9180jM35666e.f31311g != c9180j.f31311g) {
                c9180jM35666e.f31314j = new C9175e(c9180jM35666e.f31309e, c9180j.f31314j.f31279b, c9180jM35666e.f31314j);
            }
            c9180j3 = c9180jM35666e;
            c9180jM35666e = c9180jM35666e.m35666e(c9180j4);
        }
        while (c9180j3 != f31304l) {
            C9180j c9180j5 = c9180j3.f31315k;
            c9180j3.f31315k = null;
            c9180j3 = c9180j5;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C9180j m35664c() {
        C9178h c9178h = this.f31312h;
        return c9178h == null ? this : c9178h.f31289a;
    }

    /* JADX INFO: renamed from: d */
    public final void m35665d(short s10) {
        this.f31315k = f31304l;
        C9180j c9180jM35666e = this;
        while (c9180jM35666e != f31304l) {
            C9180j c9180j = c9180jM35666e.f31315k;
            c9180jM35666e.f31315k = null;
            if (c9180jM35666e.f31311g == 0) {
                c9180jM35666e.f31311g = s10;
                c9180jM35666e = c9180jM35666e.m35666e(c9180j);
            } else {
                c9180jM35666e = c9180j;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C9180j m35666e(C9180j c9180j) {
        for (C9175e c9175e = this.f31314j; c9175e != null; c9175e = c9175e.f31280c) {
            if ((this.f31305a & 16) == 0 || c9175e != this.f31314j.f31280c) {
                C9180j c9180j2 = c9175e.f31279b;
                if (c9180j2.f31315k == null) {
                    c9180j2.f31315k = c9180j;
                    c9180j = c9180j2;
                }
            }
        }
        return c9180j;
    }

    /* JADX INFO: renamed from: f */
    public final void m35667f(C9172b c9172b, int i10, boolean z10) {
        if ((this.f31305a & 4) != 0) {
            int i11 = this.f31306b;
            if (z10) {
                c9172b.m35626h(i11 - i10);
                return;
            } else {
                c9172b.m35628j(i11 - i10);
                return;
            }
        }
        if (z10) {
            m35662a(i10, 536870912, c9172b.f31256b);
            c9172b.m35626h(-1);
        } else {
            m35662a(i10, 268435456, c9172b.f31256b);
            c9172b.m35628j(-1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m35668g(byte[] bArr, int i10) {
        this.f31305a = (short) (this.f31305a | 4);
        this.f31306b = i10;
        int[] iArr = this.f31307c;
        boolean z10 = false;
        if (iArr == null) {
            return false;
        }
        for (int i11 = iArr[0]; i11 > 0; i11 -= 2) {
            int[] iArr2 = this.f31307c;
            int i12 = iArr2[i11 - 1];
            int i13 = iArr2[i11];
            int i14 = i10 - i12;
            int i15 = 268435455 & i13;
            if ((i13 & (-268435456)) == 268435456) {
                if (i14 < -32768 || i14 > 32767) {
                    int i16 = bArr[i12] & 255;
                    if (i16 < 198) {
                        bArr[i12] = (byte) (i16 + 49);
                    } else {
                        bArr[i12] = (byte) (i16 + 20);
                    }
                    z10 = true;
                }
                bArr[i15] = (byte) (i14 >>> 8);
                bArr[i15 + 1] = (byte) i14;
            } else {
                bArr[i15] = (byte) (i14 >>> 24);
                bArr[i15 + 1] = (byte) (i14 >>> 16);
                bArr[i15 + 2] = (byte) (i14 >>> 8);
                bArr[i15 + 3] = (byte) i14;
            }
        }
        return z10;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
