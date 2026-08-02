package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u60 extends th1 {
    public final int v = ao1.e(this);
    public th1 w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void C0() {
        super.C0();
        for (th1 th1Var = this.w; th1Var != null; th1Var = th1Var.m) {
            th1Var.L0(this.o);
            if (!th1Var.u) {
                th1Var.C0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void D0() {
        for (th1 th1Var = this.w; th1Var != null; th1Var = th1Var.m) {
            th1Var.D0();
        }
        super.D0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void H0() {
        super.H0();
        for (th1 th1Var = this.w; th1Var != null; th1Var = th1Var.m) {
            th1Var.H0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void I0() {
        for (th1 th1Var = this.w; th1Var != null; th1Var = th1Var.m) {
            th1Var.I0();
        }
        super.I0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void J0() {
        super.J0();
        for (th1 th1Var = this.w; th1Var != null; th1Var = th1Var.m) {
            th1Var.J0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void K0(th1 th1Var) {
        this.h = th1Var;
        for (th1 th1Var2 = this.w; th1Var2 != null; th1Var2 = th1Var2.m) {
            th1Var2.K0(th1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void L0(zn1 zn1Var) {
        this.o = zn1Var;
        for (th1 th1Var = this.w; th1Var != null; th1Var = th1Var.m) {
            th1Var.L0(zn1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t60 M0(t60 t60Var) {
        th1 th1Var = ((th1) t60Var).h;
        if (th1Var != t60Var) {
            th1 th1Var2 = t60Var instanceof th1 ? (th1) t60Var : null;
            th1 th1Var3 = th1Var2 != null ? th1Var2.l : null;
            if (th1Var != this.h || !t11.l(th1Var3, this)) {
                s.l("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (th1Var.u) {
                kz0.b("Cannot delegate to an already attached node");
            }
            th1Var.K0(this.h);
            int i = this.j;
            int iF = ao1.f(th1Var);
            th1Var.j = iF;
            int i2 = this.j;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof j61)) {
                kz0.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + th1Var);
            }
            th1Var.m = this.w;
            this.w = th1Var;
            th1Var.l = this;
            O0(iF | this.j, false);
            if (this.u) {
                if (i3 == 0 || (i & 2) != 0) {
                    L0(this.o);
                } else {
                    vn1 vn1Var = sp0.c0(this).M;
                    this.h.L0(null);
                    vn1Var.A();
                }
                th1Var.C0();
                th1Var.I0();
                if (!th1Var.u) {
                    kz0.b("autoInvalidateInsertedNode called on unattached node");
                }
                ao1.a(th1Var, -1, 1);
            }
        }
        return t60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N0(t60 t60Var) {
        th1 th1Var = null;
        for (th1 th1Var2 = this.w; th1Var2 != null; th1Var2 = th1Var2.m) {
            if (th1Var2 == t60Var) {
                boolean z = th1Var2.u;
                if (z) {
                    gk1 gk1Var = ao1.a;
                    if (!z) {
                        kz0.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ao1.a(th1Var2, -1, 2);
                    th1Var2.J0();
                    th1Var2.D0();
                }
                th1Var2.K0(th1Var2);
                th1Var2.k = 0;
                th1 th1Var3 = th1Var2.m;
                if (th1Var == null) {
                    this.w = th1Var3;
                } else {
                    th1Var.m = th1Var3;
                }
                th1Var2.m = null;
                th1Var2.l = null;
                int i = this.j;
                int iF = ao1.f(this);
                O0(iF, true);
                if (this.u && (i & 2) != 0 && (iF & 2) == 0) {
                    vn1 vn1Var = sp0.c0(this).M;
                    this.h.L0(null);
                    vn1Var.A();
                    return;
                }
                return;
            }
            th1Var = th1Var2;
        }
        c80.u("Could not find delegate: ", t60Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void O0(int i, boolean z) {
        th1 th1Var;
        int i2 = this.j;
        this.j = i;
        if (i2 != i) {
            th1 th1Var2 = this.h;
            if (th1Var2 == this) {
                this.k = i;
            }
            boolean z2 = this.u;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.j;
                    r2.j = i;
                    if (r2 == th1Var2) {
                        break;
                    } else {
                        r2 = r2.l;
                    }
                }
                if (z && r2 == th1Var2) {
                    i = ao1.f(th1Var2);
                    th1Var2.j = i;
                }
                int i3 = i | ((r2 == 0 || (th1Var = r2.m) == null) ? 0 : th1Var.k);
                for (?? r22 = r2; r22 != 0; r22 = r22.l) {
                    i3 |= r22.j;
                    r22.k = i3;
                }
            }
        }
    }
}
