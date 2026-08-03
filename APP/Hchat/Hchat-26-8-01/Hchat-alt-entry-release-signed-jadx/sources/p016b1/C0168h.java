package p016b1;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import gg.C1425u;
import p259r9.AbstractC3754e0;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5648u;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0168h extends AbstractC5852n implements InterfaceC5600e2, InterfaceC5648u {

    /* JADX INFO: renamed from: u */
    public C0168h f441u;

    /* JADX INFO: renamed from: v */
    public C0168h f442v;

    /* JADX INFO: renamed from: w */
    public long f443w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return C0164d.f432a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        this.f442v = null;
        this.f441u = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5648u, p339x1.InterfaceC5655w0
    /* JADX INFO: renamed from: e */
    public final void mo744e(long j3) {
        this.f443w = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final boolean m745k1() {
        C0168h c0168h = this.f441u;
        if (c0168h != null) {
            return c0168h.m745k1();
        }
        C0168h c0168h2 = this.f442v;
        if (c0168h2 != null) {
            return c0168h2.m745k1();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final void m746l1() {
        C0168h c0168h = this.f442v;
        if (c0168h != null) {
            c0168h.m746l1();
            return;
        }
        C0168h c0168h2 = this.f441u;
        if (c0168h2 != null) {
            c0168h2.m746l1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m747m1() {
        C0168h c0168h = this.f442v;
        if (c0168h != null) {
            c0168h.m747m1();
        }
        C0168h c0168h2 = this.f441u;
        if (c0168h2 != null) {
            c0168h2.m747m1();
        }
        this.f441u = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m748n1(C0119x c0119x) {
        InterfaceC5600e2 interfaceC5600e2;
        C0168h c0168h;
        C0168h c0168h2 = this.f441u;
        if (c0168h2 == null || !AbstractC3754e0.m7892h(c0168h2, AbstractC5700d.m10247C(c0119x))) {
            if (this.f23788g.f23801t) {
                C1425u c1425u = new C1425u();
                AbstractC5618k.m10143B(this, new C0167g(c1425u, this, c0119x, 0));
                interfaceC5600e2 = (InterfaceC5600e2) c1425u.f4738g;
            } else {
                interfaceC5600e2 = null;
            }
            c0168h = (C0168h) interfaceC5600e2;
        } else {
            c0168h = c0168h2;
        }
        if (c0168h != null && c0168h2 == null) {
            c0168h.m746l1();
            c0168h.m748n1(c0119x);
            C0168h c0168h3 = this.f442v;
            if (c0168h3 != null) {
                c0168h3.m747m1();
            }
        } else if (c0168h == null && c0168h2 != null) {
            C0168h c0168h4 = this.f442v;
            if (c0168h4 != null) {
                c0168h4.m746l1();
                c0168h4.m748n1(c0119x);
            }
            c0168h2.m747m1();
        } else if (!AbstractC1416l.m3825a(c0168h, c0168h2)) {
            if (c0168h != null) {
                c0168h.m746l1();
                c0168h.m748n1(c0119x);
            }
            if (c0168h2 != null) {
                c0168h2.m747m1();
            }
        } else if (c0168h != null) {
            c0168h.m748n1(c0119x);
        } else {
            C0168h c0168h5 = this.f442v;
            if (c0168h5 != null) {
                c0168h5.m748n1(c0119x);
            }
        }
        this.f441u = c0168h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final void m749o1() {
        C0168h c0168h = this.f442v;
        if (c0168h != null) {
            c0168h.m749o1();
            return;
        }
        C0168h c0168h2 = this.f441u;
        if (c0168h2 != null) {
            c0168h2.m749o1();
        }
    }
}
