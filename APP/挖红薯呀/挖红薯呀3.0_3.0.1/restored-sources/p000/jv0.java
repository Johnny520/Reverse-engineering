package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv0 implements InterfaceC1011zo {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2954d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nv0 f2955e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jv0(nv0 nv0Var, int i) {
        this.f2954d = i;
        this.f2955e = nv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC1011zo
    /* JADX INFO: renamed from: c */
    public final double mo1740c(double d) {
        int i = this.f2954d;
        nv0 nv0Var = this.f2955e;
        switch (i) {
            case 0:
                return w60.m4905l(nv0Var.f4355k.mo1740c(d), nv0Var.f4349e, nv0Var.f4350f);
            default:
                return nv0Var.f4358n.mo1740c(w60.m4905l(d, nv0Var.f4349e, nv0Var.f4350f));
        }
    }
}
