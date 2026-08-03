package p267s1;

import gg.C1421q;
import gg.C1425u;
import p016b1.C0165e;
import p253r1.C3653j;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5592c2;
import p339x1.AbstractC5618k;
import p339x1.C5595d1;
import p339x1.C5621l;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5656w1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s1.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3893f extends AbstractC5852n implements InterfaceC5600e2, InterfaceC5656w1, InterfaceC5609h {

    /* JADX INFO: renamed from: u */
    public C5621l f12764u;

    /* JADX INFO: renamed from: v */
    public C3883a f12765v;

    /* JADX INFO: renamed from: w */
    public boolean f12766w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3893f(C3883a c3883a, C5621l c5621l) {
        this.f12764u = c5621l;
        this.f12765v = c3883a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: H */
    public final long mo2034H() {
        C5621l c5621l = this.f12764u;
        if (c5621l == null) {
            return AbstractC5592c2.f22728a;
        }
        InterfaceC4233c interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
        int i9 = AbstractC5592c2.f22729b;
        return C5595d1.m9992h(interfaceC4233c.mo1590G0(c5621l.f22902a), interfaceC4233c.mo1590G0(c5621l.f22903b), interfaceC4233c.mo1590G0(c5621l.f22904c), interfaceC4233c.mo1590G0(c5621l.f22905d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        if (enumC3905l == EnumC3905l.f12813h) {
            ?? r32 = c3903k.f12800a;
            int size = r32.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (mo8083n1(((C3914t) r32.get(i9)).f12842i)) {
                    int i10 = c3903k.f12805f;
                    if (i10 == 4) {
                        this.f12766w = true;
                        m8082m1();
                        return;
                    } else {
                        if (i10 == 5) {
                            m8084o1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        m8084o1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m8084o1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m8080k1() {
        C3883a c3883a;
        C1425u c1425u = new C1425u();
        AbstractC5618k.m10142A(this, new C3891e(1));
        AbstractC3893f abstractC3893f = (AbstractC3893f) c1425u.f4738g;
        if (abstractC3893f == null || (c3883a = abstractC3893f.f12765v) == null) {
            c3883a = this.f12765v;
        }
        mo8081l1(c3883a);
    }

    /* JADX INFO: renamed from: l1 */
    public abstract void mo8081l1(InterfaceC3911q interfaceC3911q);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m8082m1() {
        C1421q c1421q = new C1421q();
        c1421q.f4734g = true;
        AbstractC5618k.m10143B(this, new C0165e(c1421q));
        if (c1421q.f4734g) {
            m8080k1();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public abstract boolean mo8083n1(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final void m8084o1() {
        if (this.f12766w) {
            this.f12766w = false;
            if (this.f23801t) {
                C1425u c1425u = new C1425u();
                AbstractC5618k.m10142A(this, new C3653j(c1425u, 1));
                AbstractC3893f abstractC3893f = (AbstractC3893f) c1425u.f4738g;
                if (abstractC3893f != null) {
                    abstractC3893f.m8080k1();
                } else {
                    mo8081l1(null);
                }
            }
        }
    }
}
