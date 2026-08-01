package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k80 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3047d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m80 f3048e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k80(m80 m80Var, int i) {
        this.f3047d = i;
        this.f3048e = m80Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f3047d;
        m80 m80Var = this.f3048e;
        switch (i) {
            case 0:
                return Float.valueOf(m80Var.f3860s.mo1050b());
            case 1:
                return Float.valueOf(m80Var.f3860s.mo1054f());
            default:
                return Float.valueOf(m80Var.f3860s.mo1049a() - m80Var.f3860s.mo1053e());
        }
    }
}
