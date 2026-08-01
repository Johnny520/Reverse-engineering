package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m80 extends oe0 implements vz0 {

    /* JADX INFO: renamed from: r */
    public InterfaceC0298hw f3859r;

    /* JADX INFO: renamed from: s */
    public f80 f3860s;

    /* JADX INFO: renamed from: t */
    public um0 f3861t;

    /* JADX INFO: renamed from: u */
    public boolean f3862u;

    /* JADX INFO: renamed from: v */
    public hy0 f3863v;

    /* JADX INFO: renamed from: w */
    public final j80 f3864w = new j80(this, 0);

    /* JADX INFO: renamed from: x */
    public j80 f3865x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m80(InterfaceC0298hw interfaceC0298hw, f80 f80Var, um0 um0Var, boolean z) {
        this.f3859r = interfaceC0298hw;
        this.f3860s = f80Var;
        this.f3861t = um0Var;
        this.f3862u = z;
        m2448w0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        u40[] u40VarArr = d01.f923a;
        e01 e01Var = b01.f334m;
        u40[] u40VarArr2 = d01.f923a;
        u40 u40Var = u40VarArr2[6];
        f01Var.mo17a(e01Var, Boolean.TRUE);
        f01Var.mo17a(b01.f318K, this.f3864w);
        um0 um0Var = this.f3861t;
        hy0 hy0Var = this.f3863v;
        if (um0Var == um0.f6264d) {
            if (hy0Var == null) {
                p30.m2986V("scrollAxisRange");
                throw null;
            }
            e01 e01Var2 = b01.f343v;
            u40 u40Var2 = u40VarArr2[13];
            f01Var.mo17a(e01Var2, hy0Var);
        } else {
            if (hy0Var == null) {
                p30.m2986V("scrollAxisRange");
                throw null;
            }
            e01 e01Var3 = b01.f342u;
            u40 u40Var3 = u40VarArr2[12];
            f01Var.mo17a(e01Var3, hy0Var);
        }
        j80 j80Var = this.f3865x;
        if (j80Var != null) {
            f01Var.mo17a(rz0.f5593f, new C0533o0(null, j80Var));
        }
        f01Var.mo17a(rz0.f5587B, new C0533o0(null, new C0711s2(21, new k80(this, 2))));
        C0923xe c0923xeMo1051c = this.f3860s.mo1051c();
        e01 e01Var4 = b01.f327f;
        u40 u40Var4 = u40VarArr2[23];
        f01Var.mo17a(e01Var4, c0923xeMo1051c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final void m2448w0() {
        this.f3863v = new hy0(new k80(this, 0), new k80(this, 1));
        this.f3865x = this.f3862u ? new j80(this, 1) : null;
    }
}
