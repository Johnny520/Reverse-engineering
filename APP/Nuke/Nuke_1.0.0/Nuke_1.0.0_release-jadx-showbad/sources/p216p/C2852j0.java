package p216p;

import p000A.C0099z;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0604l0;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p169h0.AbstractC2206o;
import p227r.C2996k;
import p227r.C3015t0;
import p227r.EnumC2983d0;
import p227r.InterfaceC3017u0;
import p232s.C3162i;

/* JADX INFO: renamed from: p.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2852j0 extends AbstractC0599j implements InterfaceC0595h, InterfaceC0604l0 {

    /* JADX INFO: renamed from: A */
    public C3015t0 f8973A;

    /* JADX INFO: renamed from: B */
    public InterfaceC0597i f8974B;

    /* JADX INFO: renamed from: C */
    public C2849i f8975C;

    /* JADX INFO: renamed from: D */
    public C2847h f8976D;

    /* JADX INFO: renamed from: E */
    public boolean f8977E;

    /* JADX INFO: renamed from: t */
    public InterfaceC3017u0 f8978t;

    /* JADX INFO: renamed from: u */
    public EnumC2983d0 f8979u;

    /* JADX INFO: renamed from: v */
    public boolean f8980v;

    /* JADX INFO: renamed from: w */
    public C2996k f8981w;

    /* JADX INFO: renamed from: x */
    public C3162i f8982x;

    /* JADX INFO: renamed from: y */
    public boolean f8983y;

    /* JADX INFO: renamed from: z */
    public C2847h f8984z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        this.f8977E = m5042N0();
        m5041M0();
        if (this.f8973A == null) {
            InterfaceC3017u0 interfaceC3017u0 = this.f8978t;
            C3015t0 c3015t0 = new C3015t0(this.f8983y ? this.f8976D : this.f8984z, this.f8981w, this.f8979u, interfaceC3017u0, this.f8982x, this.f8980v, this.f8977E);
            m1021J0(c3015t0);
            this.f8973A = c3015t0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() throws ClassNotFoundException {
        InterfaceC0597i interfaceC0597i = this.f8974B;
        if (interfaceC0597i != null) {
            m1022K0(interfaceC0597i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final void m5041M0() {
        InterfaceC0597i interfaceC0597i = this.f8974B;
        if (interfaceC0597i != null) {
            if (((AbstractC2206o) interfaceC0597i).f7186d.f7199q) {
                return;
            }
            m1021J0(interfaceC0597i);
            return;
        }
        if (this.f8983y) {
            AbstractC0601k.m1040p(this, new C0099z(22, this));
        }
        C2847h c2847h = this.f8983y ? this.f8976D : this.f8984z;
        if (c2847h != null) {
            AbstractC0599j abstractC0599j = c2847h.f8950i;
            if (abstractC0599j.f7186d.f7199q) {
                return;
            }
            m1021J0(abstractC0599j);
            this.f8974B = abstractC0599j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final boolean m5042N0() {
        return (this.f7199q ? AbstractC0601k.m1044t(this).f1693D : EnumC2017m.f6742d) != EnumC2017m.f6743e || this.f8979u == EnumC2983d0.f9447d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() throws ClassNotFoundException {
        C2849i c2849i = (C2849i) AbstractC0601k.m1032h(this, AbstractC2831Y.f8910a);
        if (AbstractC1665j.m2981a(c2849i, this.f8975C)) {
            return;
        }
        this.f8975C = c2849i;
        this.f8976D = null;
        InterfaceC0597i interfaceC0597i = this.f8974B;
        if (interfaceC0597i != null) {
            m1022K0(interfaceC0597i);
        }
        this.f8974B = null;
        m5041M0();
        C3015t0 c3015t0 = this.f8973A;
        if (c3015t0 != null) {
            InterfaceC3017u0 interfaceC3017u0 = this.f8978t;
            EnumC2983d0 enumC2983d0 = this.f8979u;
            c3015t0.m5223a1(this.f8983y ? this.f8976D : this.f8984z, this.f8981w, enumC2983d0, interfaceC3017u0, this.f8982x, this.f8980v, this.f8977E);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public final void m5043O0(C2847h c2847h, C2996k c2996k, EnumC2983d0 enumC2983d0, InterfaceC3017u0 interfaceC3017u0, C3162i c3162i, boolean z5, boolean z6) throws ClassNotFoundException {
        boolean z7;
        this.f8978t = interfaceC3017u0;
        this.f8979u = enumC2983d0;
        boolean z8 = true;
        if (this.f8983y != z5) {
            this.f8983y = z5;
            z7 = true;
        } else {
            z7 = false;
        }
        if (AbstractC1665j.m2981a(this.f8984z, c2847h)) {
            z8 = false;
        } else {
            this.f8984z = c2847h;
        }
        if (z7 || (z8 && !z5)) {
            InterfaceC0597i interfaceC0597i = this.f8974B;
            if (interfaceC0597i != null) {
                m1022K0(interfaceC0597i);
            }
            this.f8974B = null;
            m5041M0();
        }
        this.f8980v = z6;
        this.f8981w = c2996k;
        this.f8982x = c3162i;
        boolean zM5042N0 = m5042N0();
        this.f8977E = zM5042N0;
        C3015t0 c3015t0 = this.f8973A;
        if (c3015t0 != null) {
            c3015t0.m5223a1(this.f8983y ? this.f8976D : this.f8984z, c2996k, enumC2983d0, interfaceC3017u0, c3162i, z6, zM5042N0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0597i
    /* JADX INFO: renamed from: s0 */
    public final void mo1007s0() throws ClassNotFoundException {
        boolean zM5042N0 = m5042N0();
        if (this.f8977E != zM5042N0) {
            this.f8977E = zM5042N0;
            InterfaceC3017u0 interfaceC3017u0 = this.f8978t;
            EnumC2983d0 enumC2983d0 = this.f8979u;
            boolean z5 = this.f8983y;
            m5043O0(z5 ? this.f8976D : this.f8984z, this.f8981w, enumC2983d0, interfaceC3017u0, this.f8982x, z5, this.f8980v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
