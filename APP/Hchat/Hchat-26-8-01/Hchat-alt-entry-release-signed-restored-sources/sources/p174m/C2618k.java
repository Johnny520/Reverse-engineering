package p174m;

import gg.AbstractC1416l;
import okio.C3193a;
import p057e1.C0808c;
import p117i0.C1883u;
import p131j0.C2046b;
import p201o.AbstractC3026b;
import p249qg.AbstractC3603v;
import p259r9.AbstractC3754e0;
import p293u2.C4242l;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5655w0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: m.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2618k extends AbstractC5852n implements InterfaceC5609h, InterfaceC5655w0 {

    /* JADX INFO: renamed from: B */
    public boolean f8515B;

    /* JADX INFO: renamed from: u */
    public EnumC2640p1 f8516u;

    /* JADX INFO: renamed from: v */
    public final C2637o2 f8517v;

    /* JADX INFO: renamed from: w */
    public boolean f8518w;

    /* JADX INFO: renamed from: x */
    public final C2584c2 f8519x;

    /* JADX INFO: renamed from: z */
    public boolean f8521z;

    /* JADX INFO: renamed from: y */
    public final C2581c f8520y = new C2581c(0);

    /* JADX INFO: renamed from: A */
    public long f8514A = AbstractC2622l.f8533a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2618k(EnumC2640p1 enumC2640p1, C2637o2 c2637o2, boolean z9, C2584c2 c2584c2) {
        this.f8516u = enumC2640p1;
        this.f8517v = c2637o2;
        this.f8518w = z9;
        this.f8519x = c2584c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public static final float m6071k1(C2618k c2618k, InterfaceC2596f interfaceC2596f, long j3) {
        char c10;
        C0808c c0808c;
        int iCompare;
        long j4 = c2618k.f8514A;
        C2046b c2046b = c2618k.f8520y.f8371a;
        int i9 = c2046b.f6893i - 1;
        Object[] objArr = c2046b.f6891g;
        if (i9 < objArr.length) {
            c0808c = null;
            while (true) {
                if (i9 < 0) {
                    c10 = ' ';
                    break;
                }
                C0808c c0808c2 = (C0808c) ((C2610i) objArr[i9]).f8467a.invoke();
                if (c0808c2 != null) {
                    long jM2047c = c0808c2.m2047c();
                    long jM7908q0 = AbstractC3754e0.m7908q0(c2618k.m6073l1());
                    c10 = ' ';
                    int iOrdinal = c2618k.f8516u.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM2047c & 4294967295L)), Float.intBitsToFloat((int) (jM7908q0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            C3193a.m6822k();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM2047c >> 32)), Float.intBitsToFloat((int) (jM7908q0 >> 32)));
                    }
                    if (iCompare <= 0) {
                        c0808c = c0808c2;
                    } else if (c0808c == null) {
                        c0808c = c0808c2;
                    }
                }
                i9--;
            }
        } else {
            c10 = ' ';
            c0808c = null;
        }
        if (c0808c == null) {
            C0808c c0808c3 = c2618k.f8521z ? (C0808c) c2618k.f8519x.invoke() : null;
            if (c0808c3 == null) {
                return 0.0f;
            }
            c0808c = c0808c3;
        }
        long jM7908q02 = AbstractC3754e0.m7908q0(j4);
        int iOrdinal2 = c2618k.f8516u.ordinal();
        if (iOrdinal2 == 0) {
            float f3 = c0808c.f2417b;
            return interfaceC2596f.mo6056a(f3 - ((int) (j3 & 4294967295L)), c0808c.f2419d - f3, Float.intBitsToFloat((int) (jM7908q02 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f10 = c0808c.f2416a;
            return interfaceC2596f.mo6056a(f10 - ((int) (j3 >> c10)), c0808c.f2418c - f10, Float.intBitsToFloat((int) (jM7908q02 >> c10)));
        }
        C3193a.m6822k();
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public static boolean m6072m1(C2618k c2618k, C0808c c0808c, long j3, long j4, int i9) {
        if ((i9 & 1) != 0) {
            j3 = c2618k.m6073l1();
        }
        long j5 = j3;
        if ((i9 & 2) != 0) {
            j4 = 0;
        }
        long jM6075o1 = c2618k.m6075o1(c0808c, j5, j4);
        return Math.abs(Float.intBitsToFloat((int) (jM6075o1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM6075o1 & 4294967295L))) <= 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5655w0
    /* JADX INFO: renamed from: e */
    public final void mo744e(long j3) {
        int iM3827c;
        long j4;
        long j5;
        long j10;
        long jM6073l1 = m6073l1();
        this.f8514A = j3;
        int iOrdinal = this.f8516u.ordinal();
        if (iOrdinal == 0) {
            iM3827c = AbstractC1416l.m3827c((int) (j3 & 4294967295L), (int) (jM6073l1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                C3193a.m6822k();
                return;
            }
            iM3827c = AbstractC1416l.m3827c((int) (j3 >> 32), (int) (jM6073l1 >> 32));
        }
        if (iM3827c >= 0) {
            return;
        }
        if (this.f8518w) {
            j4 = 0;
        } else {
            if (this.f8516u == EnumC2640p1.f8622g) {
                j5 = ((long) 0) << 32;
                j10 = ((int) (jM6073l1 & 4294967295L)) - ((int) (j3 & 4294967295L));
            } else {
                j5 = ((long) (((int) (jM6073l1 >> 32)) - ((int) (j3 >> 32)))) << 32;
                j10 = 0;
            }
            j4 = j5 | (j10 & 4294967295L);
        }
        long j11 = j4;
        C0808c c0808c = (C0808c) this.f8519x.invoke();
        if (c0808c == null || this.f8515B || this.f8521z || !m6072m1(this, c0808c, jM6073l1, 0L, 2) || m6072m1(this, c0808c, 0L, j11, 1)) {
            return;
        }
        this.f8521z = true;
        m6074n1(j11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final long m6073l1() {
        long j3 = this.f8514A;
        if (C4242l.m8534a(j3, AbstractC2622l.f8533a)) {
            return 0L;
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m6074n1(long j3) {
        C1883u c1883u = AbstractC2606h.f8446a;
        InterfaceC2596f interfaceC2596f = (InterfaceC2596f) AbstractC5618k.m10152h(this, c1883u);
        if (this.f8515B) {
            AbstractC3026b.m6430c("launchAnimation called when previous animation was running");
        }
        ((InterfaceC2596f) AbstractC5618k.m10152h(this, c1883u)).getClass();
        InterfaceC2596f.f8409a.getClass();
        AbstractC3603v.m7563q(m10550Y0(), null, new C2614j(this, new C2605g3(C2591e.f8392b), interfaceC2596f, j3, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final long m6075o1(C0808c c0808c, long j3, long j4) {
        long jM7908q0 = AbstractC3754e0.m7908q0(j3);
        int iOrdinal = this.f8516u.ordinal();
        if (iOrdinal == 0) {
            InterfaceC2596f interfaceC2596f = (InterfaceC2596f) AbstractC5618k.m10152h(this, AbstractC2606h.f8446a);
            float f3 = c0808c.f2417b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC2596f.mo6056a(f3 - ((int) (j4 & 4294967295L)), c0808c.f2419d - f3, Float.intBitsToFloat((int) (jM7908q0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            C3193a.m6822k();
            return 0L;
        }
        InterfaceC2596f interfaceC2596f2 = (InterfaceC2596f) AbstractC5618k.m10152h(this, AbstractC2606h.f8446a);
        float f10 = c0808c.f2416a;
        return (((long) Float.floatToRawIntBits(interfaceC2596f2.mo6056a(f10 - ((int) (j4 >> 32)), c0808c.f2418c - f10, Float.intBitsToFloat((int) (jM7908q0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
