package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 extends AbstractC0731sm implements InterfaceC1005zi, mk0 {

    /* JADX INFO: renamed from: A */
    public C0343j5 f5572A;

    /* JADX INFO: renamed from: B */
    public dz0 f5573B;

    /* JADX INFO: renamed from: C */
    public InterfaceC0694rm f5574C;

    /* JADX INFO: renamed from: D */
    public C0380k5 f5575D;

    /* JADX INFO: renamed from: E */
    public C0343j5 f5576E;

    /* JADX INFO: renamed from: F */
    public boolean f5577F;

    /* JADX INFO: renamed from: t */
    public ez0 f5578t;

    /* JADX INFO: renamed from: u */
    public um0 f5579u;

    /* JADX INFO: renamed from: v */
    public boolean f5580v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0975yt f5581w;

    /* JADX INFO: renamed from: x */
    public xg0 f5582x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0386kb f5583y;

    /* JADX INFO: renamed from: z */
    public boolean f5584z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public final boolean m3987A0() {
        return (this.f4542q ? pf1.m3039Q(this).f389C : k50.f3015d) != k50.f3016e || this.f5579u == um0.f6264d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public final void m3988B0(C0343j5 c0343j5, InterfaceC0386kb interfaceC0386kb, InterfaceC0975yt interfaceC0975yt, xg0 xg0Var, um0 um0Var, ez0 ez0Var, boolean z, boolean z2) {
        boolean z3;
        this.f5578t = ez0Var;
        this.f5579u = um0Var;
        boolean z4 = true;
        if (this.f5584z != z) {
            this.f5584z = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (p30.m3002l(this.f5572A, c0343j5)) {
            z4 = false;
        } else {
            this.f5572A = c0343j5;
        }
        if (z3 || (z4 && !z)) {
            InterfaceC0694rm interfaceC0694rm = this.f5574C;
            if (interfaceC0694rm != null) {
                m4087x0(interfaceC0694rm);
            }
            this.f5574C = null;
            m3989z0();
        }
        this.f5580v = z2;
        this.f5581w = interfaceC0975yt;
        this.f5582x = xg0Var;
        this.f5583y = interfaceC0386kb;
        boolean zM3987A0 = m3987A0();
        this.f5577F = zM3987A0;
        dz0 dz0Var = this.f5573B;
        if (dz0Var != null) {
            dz0Var.m756N0(this.f5584z ? this.f5576E : this.f5572A, interfaceC0386kb, interfaceC0975yt, xg0Var, um0Var, ez0Var, z2, zM3987A0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0694rm
    /* JADX INFO: renamed from: g0 */
    public final void mo2490g0() {
        boolean zM3987A0 = m3987A0();
        if (this.f5577F != zM3987A0) {
            this.f5577F = zM3987A0;
            ez0 ez0Var = this.f5578t;
            um0 um0Var = this.f5579u;
            boolean z = this.f5584z;
            C0343j5 c0343j5 = z ? this.f5576E : this.f5572A;
            m3988B0(c0343j5, this.f5583y, this.f5581w, this.f5582x, um0Var, ez0Var, z, this.f5580v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        this.f5577F = m3987A0();
        m3989z0();
        if (this.f5573B == null) {
            ez0 ez0Var = this.f5578t;
            C0343j5 c0343j5 = this.f5584z ? this.f5576E : this.f5572A;
            dz0 dz0Var = new dz0(c0343j5, this.f5583y, this.f5581w, this.f5582x, this.f5579u, ez0Var, this.f5580v, this.f5577F);
            m4086w0(dz0Var);
            this.f5573B = dz0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        InterfaceC0694rm interfaceC0694rm = this.f5574C;
        if (interfaceC0694rm != null) {
            m4087x0(interfaceC0694rm);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mk0
    /* JADX INFO: renamed from: z */
    public final void mo734z() {
        C0380k5 c0380k5 = (C0380k5) pf1.m3058r(this, bn0.f548a);
        if (p30.m3002l(c0380k5, this.f5575D)) {
            return;
        }
        this.f5575D = c0380k5;
        this.f5576E = null;
        InterfaceC0694rm interfaceC0694rm = this.f5574C;
        if (interfaceC0694rm != null) {
            m4087x0(interfaceC0694rm);
        }
        this.f5574C = null;
        m3989z0();
        dz0 dz0Var = this.f5573B;
        if (dz0Var != null) {
            ez0 ez0Var = this.f5578t;
            um0 um0Var = this.f5579u;
            C0343j5 c0343j5 = this.f5584z ? this.f5576E : this.f5572A;
            dz0Var.m756N0(c0343j5, this.f5583y, this.f5581w, this.f5582x, um0Var, ez0Var, this.f5580v, this.f5577F);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final void m3989z0() {
        InterfaceC0694rm interfaceC0694rm = this.f5574C;
        if (interfaceC0694rm != null) {
            if (((oe0) interfaceC0694rm).f4529d.f4542q) {
                return;
            }
            m4086w0(interfaceC0694rm);
            return;
        }
        if (this.f5584z) {
            r60.m3420v(this, new C0381k6(10, this));
        }
        C0343j5 c0343j5 = this.f5584z ? this.f5576E : this.f5572A;
        if (c0343j5 != null) {
            AbstractC0731sm abstractC0731sm = c0343j5.f2729i;
            if (abstractC0731sm.f4529d.f4542q) {
                return;
            }
            m4086w0(abstractC0731sm);
            this.f5574C = abstractC0731sm;
        }
    }
}
