package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mv0 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4051d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nv0 f4052e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv0(nv0 nv0Var, int i) {
        super(1);
        this.f4051d = i;
        this.f4052e = nv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f4051d;
        nv0 nv0Var = this.f4052e;
        switch (i) {
            case 0:
                return Double.valueOf(nv0Var.f4358n.mo1740c(w60.m4905l(((Number) obj).doubleValue(), nv0Var.f4349e, nv0Var.f4350f)));
            default:
                return Double.valueOf(w60.m4905l(nv0Var.f4355k.mo1740c(((Number) obj).doubleValue()), nv0Var.f4349e, nv0Var.f4350f));
        }
    }
}
