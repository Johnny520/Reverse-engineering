package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j20 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2663d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k20 f2664e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j20(k20 k20Var, int i) {
        this.f2663d = i;
        this.f2664e = k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f2663d;
        k20 k20Var = this.f2664e;
        h91 h91Var = (h91) obj;
        switch (i) {
            case 0:
                h91Var.getClass();
                k20 k20Var2 = (k20) h91Var;
                fd1 fd1Var = k20Var.f2996s;
                if (!p30.m3002l(k20Var2.f2995r, fd1Var)) {
                    k20Var2.f2995r = fd1Var;
                    k20Var2.mo1762x0();
                }
                return g91.f1894e;
            default:
                h91Var.getClass();
                k20Var.f2995r = ((k20) h91Var).f2996s;
                return Boolean.FALSE;
        }
    }
}
