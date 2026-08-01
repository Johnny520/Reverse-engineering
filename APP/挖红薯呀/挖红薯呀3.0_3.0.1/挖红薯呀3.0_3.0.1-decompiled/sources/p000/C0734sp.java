package p000;

/* JADX INFO: renamed from: sp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0734sp extends oe0 implements h91, g50 {

    /* JADX INFO: renamed from: r */
    public C0734sp f5815r;

    /* JADX INFO: renamed from: s */
    public C0734sp f5816s;

    /* JADX INFO: renamed from: t */
    public long f5817t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public final void m4094A0() {
        C0734sp c0734sp = this.f5816s;
        if (c0734sp != null) {
            c0734sp.m4094A0();
            return;
        }
        C0734sp c0734sp2 = this.f5815r;
        if (c0734sp2 != null) {
            c0734sp2.m4094A0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.h91
    /* JADX INFO: renamed from: k */
    public final Object mo1247k() {
        return C0496n2.f4165y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.g50
    /* JADX INFO: renamed from: l */
    public final void mo547l(long j) {
        this.f5817t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        this.f5816s = null;
        this.f5815r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final boolean m4095w0() {
        C0734sp c0734sp = this.f5815r;
        if (c0734sp != null) {
            return c0734sp.m4095w0();
        }
        C0734sp c0734sp2 = this.f5816s;
        if (c0734sp2 != null) {
            return c0734sp2.m4095w0();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final void m4096x0() {
        C0734sp c0734sp = this.f5816s;
        if (c0734sp != null) {
            c0734sp.m4096x0();
            return;
        }
        C0734sp c0734sp2 = this.f5815r;
        if (c0734sp2 != null) {
            c0734sp2.m4096x0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final void m4097y0() {
        C0734sp c0734sp = this.f5816s;
        if (c0734sp != null) {
            c0734sp.m4097y0();
        }
        C0734sp c0734sp2 = this.f5815r;
        if (c0734sp2 != null) {
            c0734sp2.m4097y0();
        }
        this.f5815r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final void m4098z0(C0910x1 c0910x1) {
        h91 h91Var;
        C0734sp c0734sp;
        C0734sp c0734sp2 = this.f5815r;
        if (c0734sp2 == null || !s91.m4043h(c0734sp2, pf1.m3026B(c0910x1))) {
            if (this.f4529d.f4542q) {
                zt0 zt0Var = new zt0();
                r60.m3397F(this, new C0697rp(zt0Var, this, c0910x1, 0));
                h91Var = (h91) zt0Var.f7995d;
            } else {
                h91Var = null;
            }
            c0734sp = (C0734sp) h91Var;
        } else {
            c0734sp = c0734sp2;
        }
        if (c0734sp != null && c0734sp2 == null) {
            c0734sp.m4096x0();
            c0734sp.m4098z0(c0910x1);
            C0734sp c0734sp3 = this.f5816s;
            if (c0734sp3 != null) {
                c0734sp3.m4097y0();
            }
        } else if (c0734sp == null && c0734sp2 != null) {
            C0734sp c0734sp4 = this.f5816s;
            if (c0734sp4 != null) {
                c0734sp4.m4096x0();
                c0734sp4.m4098z0(c0910x1);
            }
            c0734sp2.m4097y0();
        } else if (!p30.m3002l(c0734sp, c0734sp2)) {
            if (c0734sp != null) {
                c0734sp.m4096x0();
                c0734sp.m4098z0(c0910x1);
            }
            if (c0734sp2 != null) {
                c0734sp2.m4097y0();
            }
        } else if (c0734sp != null) {
            c0734sp.m4098z0(c0910x1);
        } else {
            C0734sp c0734sp5 = this.f5816s;
            if (c0734sp5 != null) {
                c0734sp5.m4098z0(c0910x1);
            }
        }
        this.f5815r = c0734sp;
    }
}
