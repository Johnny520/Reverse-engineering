package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u60 extends th1 {

    /* JADX INFO: renamed from: v */
    public final int f11115v = ao1.m242e(this);

    /* JADX INFO: renamed from: w */
    public th1 f11116w;

    @Override // p000.th1
    /* JADX INFO: renamed from: C0 */
    public final void mo5256C0() {
        super.mo5256C0();
        for (th1 th1Var = this.f11116w; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5262L0(this.f10764o);
            if (!th1Var.f10770u) {
                th1Var.mo5256C0();
            }
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: D0 */
    public final void mo5257D0() {
        for (th1 th1Var = this.f11116w; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5257D0();
        }
        super.mo5257D0();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: H0 */
    public final void mo5258H0() {
        super.mo5258H0();
        for (th1 th1Var = this.f11116w; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5258H0();
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: I0 */
    public final void mo5259I0() {
        for (th1 th1Var = this.f11116w; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5259I0();
        }
        super.mo5259I0();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: J0 */
    public final void mo5260J0() {
        super.mo5260J0();
        for (th1 th1Var = this.f11116w; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5260J0();
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: K0 */
    public final void mo5261K0(th1 th1Var) {
        this.f10757h = th1Var;
        for (th1 th1Var2 = this.f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
            th1Var2.mo5261K0(th1Var);
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: L0 */
    public final void mo5262L0(zn1 zn1Var) {
        this.f10764o = zn1Var;
        for (th1 th1Var = this.f11116w; th1Var != null; th1Var = th1Var.f10762m) {
            th1Var.mo5262L0(zn1Var);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final t60 m5468M0(t60 t60Var) {
        th1 th1Var = ((th1) t60Var).f10757h;
        if (th1Var != t60Var) {
            th1 th1Var2 = t60Var instanceof th1 ? (th1) t60Var : null;
            th1 th1Var3 = th1Var2 != null ? th1Var2.f10761l : null;
            if (th1Var != this.f10757h || !t11.m5086l(th1Var3, this)) {
                C0676s.m4653l("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (th1Var.f10770u) {
                kz0.m2764b("Cannot delegate to an already attached node");
            }
            th1Var.mo5261K0(this.f10757h);
            int i = this.f10759j;
            int iM243f = ao1.m243f(th1Var);
            th1Var.f10759j = iM243f;
            int i2 = this.f10759j;
            int i3 = iM243f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof j61)) {
                kz0.m2764b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + th1Var);
            }
            th1Var.f10762m = this.f11116w;
            this.f11116w = th1Var;
            th1Var.f10761l = this;
            m5470O0(iM243f | this.f10759j, false);
            if (this.f10770u) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo5262L0(this.f10764o);
                } else {
                    vn1 vn1Var = sp0.m4933c0(this).f9372M;
                    this.f10757h.mo5262L0(null);
                    vn1Var.m5721A();
                }
                th1Var.mo5256C0();
                th1Var.mo5259I0();
                if (!th1Var.f10770u) {
                    kz0.m2764b("autoInvalidateInsertedNode called on unattached node");
                }
                ao1.m238a(th1Var, -1, 1);
            }
        }
        return t60Var;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m5469N0(t60 t60Var) {
        th1 th1Var = null;
        for (th1 th1Var2 = this.f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
            if (th1Var2 == t60Var) {
                boolean z = th1Var2.f10770u;
                if (z) {
                    gk1 gk1Var = ao1.f314a;
                    if (!z) {
                        kz0.m2764b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ao1.m238a(th1Var2, -1, 2);
                    th1Var2.mo5260J0();
                    th1Var2.mo5257D0();
                }
                th1Var2.mo5261K0(th1Var2);
                th1Var2.f10760k = 0;
                th1 th1Var3 = th1Var2.f10762m;
                if (th1Var == null) {
                    this.f11116w = th1Var3;
                } else {
                    th1Var.f10762m = th1Var3;
                }
                th1Var2.f10762m = null;
                th1Var2.f10761l = null;
                int i = this.f10759j;
                int iM243f = ao1.m243f(this);
                m5470O0(iM243f, true);
                if (this.f10770u && (i & 2) != 0 && (iM243f & 2) == 0) {
                    vn1 vn1Var = sp0.m4933c0(this).f9372M;
                    this.f10757h.mo5262L0(null);
                    vn1Var.m5721A();
                    return;
                }
                return;
            }
            th1Var = th1Var2;
        }
        c80.m677u("Could not find delegate: ", t60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: O0 */
    public final void m5470O0(int i, boolean z) {
        th1 th1Var;
        int i2 = this.f10759j;
        this.f10759j = i;
        if (i2 != i) {
            th1 th1Var2 = this.f10757h;
            if (th1Var2 == this) {
                this.f10760k = i;
            }
            boolean z2 = this.f10770u;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f10759j;
                    r2.f10759j = i;
                    if (r2 == th1Var2) {
                        break;
                    } else {
                        r2 = r2.f10761l;
                    }
                }
                if (z && r2 == th1Var2) {
                    i = ao1.m243f(th1Var2);
                    th1Var2.f10759j = i;
                }
                int i3 = i | ((r2 == 0 || (th1Var = r2.f10762m) == null) ? 0 : th1Var.f10760k);
                for (?? r22 = r2; r22 != 0; r22 = r22.f10761l) {
                    i3 |= r22.f10759j;
                    r22.f10760k = i3;
                }
            }
        }
    }
}
