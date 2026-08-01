package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4285d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qj0 f4286e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj0(qj0 qj0Var, int i) {
        super(0);
        this.f4285d = i;
        this.f4286e = qj0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f4285d;
        na1 na1Var = na1.f4229a;
        qj0 qj0Var = this.f4286e;
        switch (i) {
            case 0:
                InterfaceC0051bd interfaceC0051bd = qj0Var.f5175K;
                interfaceC0051bd.getClass();
                qj0Var.m3264A0(interfaceC0051bd, qj0Var.f5174J);
                break;
            default:
                qj0 qj0Var2 = qj0Var.f5182t;
                if (qj0Var2 != null) {
                    qj0Var2.m3273N0();
                }
                break;
        }
        return na1Var;
    }
}
