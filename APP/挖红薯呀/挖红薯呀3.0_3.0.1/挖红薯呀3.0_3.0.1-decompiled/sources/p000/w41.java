package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w41 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7000d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x41 f7001e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w41(x41 x41Var, int i) {
        super(2);
        this.f7000d = i;
        this.f7001e = x41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7000d;
        na1 na1Var = na1.f4229a;
        x41 x41Var = this.f7001e;
        switch (i) {
            case 0:
                x41Var.m5085a().f5057e = (AbstractC0727si) obj2;
                break;
            case 1:
                q60 q60VarM5085a = x41Var.m5085a();
                ((b60) obj).m296e0(new m60(q60VarM5085a, (InterfaceC0904ww) obj2, q60VarM5085a.f5071s));
                break;
            default:
                b60 b60Var = (b60) obj;
                a51 a51Var = x41Var.f7257a;
                q60 q60Var = b60Var.f397K;
                if (q60Var == null) {
                    q60Var = new q60(b60Var, a51Var);
                    b60Var.f397K = q60Var;
                }
                x41Var.f7258b = q60Var;
                x41Var.m5085a().m3200h();
                q60 q60VarM5085a2 = x41Var.m5085a();
                if (q60VarM5085a2.f5058f != a51Var) {
                    q60VarM5085a2.f5058f = a51Var;
                    q60VarM5085a2.m3201i(false);
                    b60.m262X(q60VarM5085a2.f5056d, false, 7);
                }
                break;
        }
        return na1Var;
    }
}
