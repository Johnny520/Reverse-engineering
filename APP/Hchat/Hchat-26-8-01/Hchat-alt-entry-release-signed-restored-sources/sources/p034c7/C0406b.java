package p034c7;

import p005a5.C0016a;
import p047d7.AbstractC0724g;
import p047d7.C0721d;
import p047d7.C0730m;
import p152k7.AbstractC2331a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: c7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0406b {

    /* JADX INFO: renamed from: a */
    public final C0730m f1106a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0406b(C0730m c0730m) {
        this.f1106a = c0730m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0721d m1365a() {
        C0730m c0730m = this.f1106a;
        C0721d c0721d = c0730m.f2173u;
        if (c0721d == null) {
            c0721d = new C0721d();
            EnumC0411g enumC0411g = EnumC0411g.CENTRAL_FILE;
            if (c0721d.mo5551p() >= 4) {
                AbstractC2331a.m5534D(c0721d.f12076k, 0, 33639248);
            }
            c0721d.m1931R(4, c0730m.m1928O(4));
            long jMo5551p = c0730m.f2163s - ((long) c0730m.mo5551p());
            if (c0721d.mo1899h0() || AbstractC0724g.m1903i0(jMo5551p)) {
                if (c0721d.m1907Z() < 12) {
                    c0721d.m7715M(c0721d.mo1897W() + c0721d.m1909b0() + 58, false);
                    c0721d.m1931R(8 + 22, 12);
                }
                AbstractC2331a.m5534D(c0721d.f12076k, 42, -1);
                int iM1909b0 = c0721d.m1909b0();
                byte[] bArr = c0721d.f12076k;
                int i9 = iM1909b0 + 58;
                if (i9 <= bArr.length) {
                    for (int i10 = iM1909b0 + 50; i10 < i9; i10++) {
                        bArr[i10] = (byte) (255 & jMo5551p);
                        jMo5551p >>>= 8;
                    }
                }
            } else {
                c0721d.m1930Q(42, jMo5551p);
            }
            C0016a c0016a = c0730m.f2161q;
            int iM1928O = ((AbstractC0724g) c0016a.f56i).m1928O(c0016a.f55h);
            C0016a c0016a2 = c0721d.f2161q;
            AbstractC0724g abstractC0724g = (AbstractC0724g) c0016a2.f56i;
            int i11 = c0016a2.f55h;
            if (iM1928O != abstractC0724g.m1928O(i11)) {
                boolean zM203g = c0016a2.m203g();
                abstractC0724g.m1931R(i11, iM1928O);
                if (zM203g != c0016a2.m203g()) {
                    abstractC0724g.mo1900j0();
                }
            }
            int iM1910c0 = c0730m.m1910c0();
            int i12 = c0721d.f2160p;
            c0721d.m1931R(i12 + 2, iM1910c0);
            long jM1927N = c0730m.m1927N(c0730m.f2160p + 4);
            if (jM1927N != -1) {
                c0721d.m1930Q(i12 + 4, jM1927N);
            }
            c0721d.mo1914l0(c0730m.mo1906Y());
            c0721d.m1930Q(c0721d.m1911d0(), c0730m.mo1905X());
            c0721d.m1930Q(i12 + 16, c0730m.mo1912e0());
            c0721d.m1915m0(c0730m.m1908a0());
            c0730m.m1918n0(c0721d);
        }
        return c0721d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m1366b() {
        C0730m c0730m = this.f1106a;
        return c0730m.m1910c0() != 8 ? c0730m.mo1912e0() : c0730m.mo1905X();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        C0730m c0730m = this.f1106a;
        sb2.append(c0730m.f2163s);
        sb2.append("] ");
        sb2.append(c0730m.m1908a0());
        sb2.append(m1365a().m1902n0());
        sb2.append(AbstractC5999a.m10750m(8, " 0x", c0730m.mo1906Y()));
        return sb2.toString();
    }
}
