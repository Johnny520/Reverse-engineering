package p321w;

import p057e1.C0808c;
import p119i2.C1935k0;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: w.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4618m1 {

    /* JADX INFO: renamed from: a */
    public final C1935k0 f15293a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4428t f15294b = null;

    /* JADX INFO: renamed from: c */
    public InterfaceC4428t f15295c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4618m1(C1935k0 c1935k0, InterfaceC4428t interfaceC4428t) {
        this.f15293a = c1935k0;
        this.f15295c = interfaceC4428t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m9036a(long j3) {
        C0808c c0808cMo8866k0;
        InterfaceC4428t interfaceC4428t = this.f15294b;
        C0808c c0808c = C0808c.f2415e;
        if (interfaceC4428t != null) {
            if (interfaceC4428t.mo8856C()) {
                InterfaceC4428t interfaceC4428t2 = this.f15295c;
                c0808cMo8866k0 = interfaceC4428t2 != null ? interfaceC4428t2.mo8866k0(interfaceC4428t, true) : null;
            } else {
                c0808cMo8866k0 = c0808c;
            }
            if (c0808cMo8866k0 != null) {
                c0808c = c0808cMo8866k0;
            }
        }
        int i9 = (int) (j3 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i9);
        float fIntBitsToFloat2 = c0808c.f2416a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i9);
            fIntBitsToFloat2 = c0808c.f2418c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i9);
            }
        }
        int i10 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
        float fIntBitsToFloat5 = c0808c.f2417b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i10);
            fIntBitsToFloat5 = c0808c.f2419d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i10);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m9037b(long j3, boolean z9) {
        if (z9) {
            j3 = m9036a(j3);
        }
        return this.f15293a.f6562b.m4830g(m9039d(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m9038c(long j3) {
        long jM9039d = m9039d(m9036a(j3));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM9039d));
        C1935k0 c1935k0 = this.f15293a;
        int iM4828e = c1935k0.f6562b.m4828e(fIntBitsToFloat);
        int i9 = (int) (jM9039d >> 32);
        return Float.intBitsToFloat(i9) >= c1935k0.m4805e(iM4828e) && Float.intBitsToFloat(i9) <= c1935k0.m4806f(iM4828e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m9039d(long j3) {
        InterfaceC4428t interfaceC4428t;
        InterfaceC4428t interfaceC4428t2 = this.f15294b;
        if (interfaceC4428t2 == null) {
            return j3;
        }
        if (!interfaceC4428t2.mo8856C()) {
            interfaceC4428t2 = null;
        }
        if (interfaceC4428t2 == null || (interfaceC4428t = this.f15295c) == null) {
            return j3;
        }
        InterfaceC4428t interfaceC4428t3 = interfaceC4428t.mo8856C() ? interfaceC4428t : null;
        return interfaceC4428t3 == null ? j3 : interfaceC4428t2.mo8869w(interfaceC4428t3, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m9040e(long j3) {
        InterfaceC4428t interfaceC4428t;
        InterfaceC4428t interfaceC4428t2 = this.f15294b;
        if (interfaceC4428t2 == null) {
            return j3;
        }
        if (!interfaceC4428t2.mo8856C()) {
            interfaceC4428t2 = null;
        }
        if (interfaceC4428t2 == null || (interfaceC4428t = this.f15295c) == null) {
            return j3;
        }
        InterfaceC4428t interfaceC4428t3 = interfaceC4428t.mo8856C() ? interfaceC4428t : null;
        return interfaceC4428t3 == null ? j3 : interfaceC4428t3.mo8869w(interfaceC4428t2, j3);
    }
}
