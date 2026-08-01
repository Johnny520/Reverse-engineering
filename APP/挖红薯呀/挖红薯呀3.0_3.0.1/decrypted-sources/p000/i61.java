package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2467h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ hs0 f2468i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i61(hs0 hs0Var, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f2467h = i;
        this.f2468i = hs0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f2467h;
        hs0 hs0Var = this.f2468i;
        switch (i) {
            case 0:
                return new i61(hs0Var, interfaceC0322ik, 0);
            case 1:
                return new i61(hs0Var, interfaceC0322ik, 1);
            case 2:
                return new i61(hs0Var, interfaceC0322ik, 2);
            case 3:
                return new i61(hs0Var, interfaceC0322ik, 3);
            case 4:
                return new i61(hs0Var, interfaceC0322ik, 4);
            default:
                return new i61(hs0Var, interfaceC0322ik, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2467h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
            case 0:
                ((i61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
            case 1:
                ((i61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
            case 2:
                ((i61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
            case 3:
                ((i61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
            case 4:
                ((i61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
            default:
                ((i61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f2467h;
        na1 na1Var = na1.f4229a;
        hs0 hs0Var = this.f2468i;
        switch (i) {
            case 0:
                w60.m4891M(obj);
                hs0Var.m1500a();
                break;
            case 1:
                w60.m4891M(obj);
                hs0Var.f2357f = true;
                di0 di0Var = hs0Var.f2358g;
                if (di0Var.m711d()) {
                    di0Var.m714g(null);
                }
                break;
            case 2:
                w60.m4891M(obj);
                hs0Var.m1500a();
                break;
            case 3:
                w60.m4891M(obj);
                hs0Var.m1500a();
                break;
            case 4:
                w60.m4891M(obj);
                hs0Var.f2357f = true;
                di0 di0Var2 = hs0Var.f2358g;
                if (di0Var2.m711d()) {
                    di0Var2.m714g(null);
                }
                break;
            default:
                w60.m4891M(obj);
                hs0Var.m1500a();
                break;
        }
        return na1Var;
    }
}
