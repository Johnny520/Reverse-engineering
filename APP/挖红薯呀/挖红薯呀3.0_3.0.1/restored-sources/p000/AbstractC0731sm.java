package p000;

/* JADX INFO: renamed from: sm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0731sm extends oe0 {

    /* JADX INFO: renamed from: r */
    public final int f5781r = rj0.m3513d(this);

    /* JADX INFO: renamed from: s */
    public oe0 f5782s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: m0 */
    public final void mo2880m0() {
        super.mo2880m0();
        for (oe0 oe0Var = this.f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2886v0(this.f4536k);
            if (!oe0Var.f4542q) {
                oe0Var.mo2880m0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: n0 */
    public final void mo2881n0() {
        for (oe0 oe0Var = this.f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2881n0();
        }
        super.mo2881n0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: r0 */
    public final void mo2882r0() {
        super.mo2882r0();
        for (oe0 oe0Var = this.f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2882r0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: s0 */
    public final void mo2883s0() {
        for (oe0 oe0Var = this.f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2883s0();
        }
        super.mo2883s0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: t0 */
    public final void mo2884t0() {
        super.mo2884t0();
        for (oe0 oe0Var = this.f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2884t0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: u0 */
    public final void mo2885u0(oe0 oe0Var) {
        this.f4529d = oe0Var;
        for (oe0 oe0Var2 = this.f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
            oe0Var2.mo2885u0(oe0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: v0 */
    public final void mo2886v0(qj0 qj0Var) {
        this.f4536k = qj0Var;
        for (oe0 oe0Var = this.f5782s; oe0Var != null; oe0Var = oe0Var.f4534i) {
            oe0Var.mo2886v0(qj0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC0694rm m4086w0(InterfaceC0694rm interfaceC0694rm) {
        oe0 oe0Var = ((oe0) interfaceC0694rm).f4529d;
        if (oe0Var != interfaceC0694rm) {
            oe0 oe0Var2 = interfaceC0694rm instanceof oe0 ? (oe0) interfaceC0694rm : null;
            oe0 oe0Var3 = oe0Var2 != null ? oe0Var2.f4533h : null;
            if (oe0Var != this.f4529d || !p30.m3002l(oe0Var3, this)) {
                C0921xc.m5134o("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (oe0Var.f4542q) {
                w10.m4824b("Cannot delegate to an already attached node");
            }
            oe0Var.mo2885u0(this.f4529d);
            int i = this.f4531f;
            int iM3514e = rj0.m3514e(oe0Var);
            oe0Var.f4531f = iM3514e;
            int i2 = this.f4531f;
            int i3 = iM3514e & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof r50)) {
                w10.m4824b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + oe0Var);
            }
            oe0Var.f4534i = this.f5782s;
            this.f5782s = oe0Var;
            oe0Var.f4533h = this;
            m4088y0(iM3514e | this.f4531f, false);
            if (this.f4542q) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo2886v0(this.f4536k);
                } else {
                    mj0 mj0Var = pf1.m3039Q(this).f395I;
                    this.f4529d.mo2886v0(null);
                    mj0Var.m2603g();
                }
                oe0Var.mo2880m0();
                oe0Var.mo2883s0();
                if (!oe0Var.f4542q) {
                    w10.m4824b("autoInvalidateInsertedNode called on unattached node");
                }
                rj0.m3510a(oe0Var, -1, 1);
            }
        }
        return interfaceC0694rm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final void m4087x0(InterfaceC0694rm interfaceC0694rm) {
        oe0 oe0Var = null;
        for (oe0 oe0Var2 = this.f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
            if (oe0Var2 == interfaceC0694rm) {
                boolean z = oe0Var2.f4542q;
                if (z) {
                    ch0 ch0Var = rj0.f5425a;
                    if (!z) {
                        w10.m4824b("autoInvalidateRemovedNode called on unattached node");
                    }
                    rj0.m3510a(oe0Var2, -1, 2);
                    oe0Var2.mo2884t0();
                    oe0Var2.mo2881n0();
                }
                oe0Var2.mo2885u0(oe0Var2);
                oe0Var2.f4532g = 0;
                oe0 oe0Var3 = oe0Var2.f4534i;
                if (oe0Var == null) {
                    this.f5782s = oe0Var3;
                } else {
                    oe0Var.f4534i = oe0Var3;
                }
                oe0Var2.f4534i = null;
                oe0Var2.f4533h = null;
                int i = this.f4531f;
                int iM3514e = rj0.m3514e(this);
                m4088y0(iM3514e, true);
                if (this.f4542q && (i & 2) != 0 && (iM3514e & 2) == 0) {
                    mj0 mj0Var = pf1.m3039Q(this).f395I;
                    this.f4529d.mo2886v0(null);
                    mj0Var.m2603g();
                    return;
                }
                return;
            }
            oe0Var = oe0Var2;
        }
        C0921xc.m5130k(interfaceC0694rm, "Could not find delegate: ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [oe0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: y0 */
    public final void m4088y0(int i, boolean z) {
        oe0 oe0Var;
        int i2 = this.f4531f;
        this.f4531f = i;
        if (i2 != i) {
            oe0 oe0Var2 = this.f4529d;
            if (oe0Var2 == this) {
                this.f4532g = i;
            }
            boolean z2 = this.f4542q;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f4531f;
                    r2.f4531f = i;
                    if (r2 == oe0Var2) {
                        break;
                    } else {
                        r2 = r2.f4533h;
                    }
                }
                if (z && r2 == oe0Var2) {
                    i = rj0.m3514e(oe0Var2);
                    oe0Var2.f4531f = i;
                }
                int i3 = i | ((r2 == 0 || (oe0Var = r2.f4534i) == null) ? 0 : oe0Var.f4532g);
                for (?? r22 = r2; r22 != 0; r22 = r22.f4533h) {
                    i3 |= r22.f4531f;
                    r22.f4532g = i3;
                }
            }
        }
    }
}
