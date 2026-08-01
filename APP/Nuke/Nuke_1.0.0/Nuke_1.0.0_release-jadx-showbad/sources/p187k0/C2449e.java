package p187k0;

import com.bumptech.glide.AbstractC1925g;
import com.bumptech.glide.AbstractC1926h;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0625w;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p121Y1.C1753n;
import p169h0.AbstractC2206o;
import p170h1.C2214e;

/* JADX INFO: renamed from: k0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2449e extends AbstractC2206o implements InterfaceC0558E0, InterfaceC0625w {

    /* JADX INFO: renamed from: r */
    public C2449e f7909r;

    /* JADX INFO: renamed from: s */
    public C2449e f7910s;

    /* JADX INFO: renamed from: t */
    public long f7911t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        this.f7910s = null;
        this.f7909r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final boolean m4368J0(C1753n c1753n) {
        C2449e c2449e = this.f7909r;
        if (c2449e != null) {
            return c2449e.m4368J0(c1753n);
        }
        C2449e c2449e2 = this.f7910s;
        if (c2449e2 != null) {
            return c2449e2.m4368J0(c1753n);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m4369K0(C1753n c1753n) {
        C2449e c2449e = this.f7910s;
        if (c2449e != null) {
            c2449e.m4369K0(c1753n);
            return;
        }
        C2449e c2449e2 = this.f7909r;
        if (c2449e2 != null) {
            c2449e2.m4369K0(c1753n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final void m4370L0(C1753n c1753n) {
        C2449e c2449e = this.f7910s;
        if (c2449e != null) {
            c2449e.m4370L0(c1753n);
        }
        C2449e c2449e2 = this.f7909r;
        if (c2449e2 != null) {
            c2449e2.m4370L0(c1753n);
        }
        this.f7909r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final void m4371M0(C1753n c1753n) {
        InterfaceC0558E0 interfaceC0558E0;
        C2449e c2449e;
        C2449e c2449e2 = this.f7909r;
        if (c2449e2 == null || !AbstractC1925g.m3525b(c2449e2, AbstractC1926h.m3575r(c1753n))) {
            if (this.f7186d.f7199q) {
                C1675t c1675t = new C1675t();
                AbstractC0601k.m1050z(this, new C2214e(c1675t, this, c1753n, 1));
                interfaceC0558E0 = (InterfaceC0558E0) c1675t.f5710e;
            } else {
                interfaceC0558E0 = null;
            }
            c2449e = (C2449e) interfaceC0558E0;
        } else {
            c2449e = c2449e2;
        }
        if (c2449e != null && c2449e2 == null) {
            c2449e.m4369K0(c1753n);
            c2449e.m4371M0(c1753n);
            C2449e c2449e3 = this.f7910s;
            if (c2449e3 != null) {
                c2449e3.m4370L0(c1753n);
            }
        } else if (c2449e == null && c2449e2 != null) {
            C2449e c2449e4 = this.f7910s;
            if (c2449e4 != null) {
                c2449e4.m4369K0(c1753n);
                c2449e4.m4371M0(c1753n);
            }
            c2449e2.m4370L0(c1753n);
        } else if (!AbstractC1665j.m2981a(c2449e, c2449e2)) {
            if (c2449e != null) {
                c2449e.m4369K0(c1753n);
                c2449e.m4371M0(c1753n);
            }
            if (c2449e2 != null) {
                c2449e2.m4370L0(c1753n);
            }
        } else if (c2449e != null) {
            c2449e.m4371M0(c1753n);
        } else {
            C2449e c2449e5 = this.f7910s;
            if (c2449e5 != null) {
                c2449e5.m4371M0(c1753n);
            }
        }
        this.f7909r = c2449e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m4372N0(C1753n c1753n) {
        C2449e c2449e = this.f7910s;
        if (c2449e != null) {
            c2449e.m4372N0(c1753n);
            return;
        }
        C2449e c2449e2 = this.f7909r;
        if (c2449e2 != null) {
            c2449e2.m4372N0(c1753n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return C2448d.f7908a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: x */
    public final void mo655x(long j5) {
        this.f7911t = j5;
    }
}
