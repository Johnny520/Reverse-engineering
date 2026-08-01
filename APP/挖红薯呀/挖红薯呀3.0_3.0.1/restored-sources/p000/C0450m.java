package p000;

/* JADX INFO: renamed from: m */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0450m extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3634h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC0493n f3635i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0450m(AbstractC0493n abstractC0493n, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f3634h = i;
        this.f3635i = abstractC0493n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f3634h;
        AbstractC0493n abstractC0493n = this.f3635i;
        switch (i) {
            case 0:
                return new C0450m(abstractC0493n, interfaceC0322ik, 0);
            default:
                return new C0450m(abstractC0493n, interfaceC0322ik, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3634h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
            case 0:
                ((C0450m) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
            default:
                ((C0450m) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
                break;
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f3634h;
        na1 na1Var = na1.f4229a;
        InterfaceC0322ik interfaceC0322ik = null;
        AbstractC0493n abstractC0493n = this.f3635i;
        switch (i) {
            case 0:
                w60.m4891M(obj);
                if (abstractC0493n.f4095E == null) {
                    C0264gz c0264gz = new C0264gz();
                    xg0 xg0Var = abstractC0493n.f4104t;
                    if (xg0Var != null) {
                        AbstractC0307i4.m1547w(abstractC0493n.m2879k0(), null, new C0154e(xg0Var, c0264gz, interfaceC0322ik, 0), 3);
                    }
                    abstractC0493n.f4095E = c0264gz;
                }
                break;
            default:
                w60.m4891M(obj);
                C0264gz c0264gz2 = abstractC0493n.f4095E;
                if (c0264gz2 != null) {
                    C0301hz c0301hz = new C0301hz(c0264gz2);
                    xg0 xg0Var2 = abstractC0493n.f4104t;
                    if (xg0Var2 != null) {
                        AbstractC0307i4.m1547w(abstractC0493n.m2879k0(), null, new C0154e(xg0Var2, c0301hz, interfaceC0322ik, 1), 3);
                    }
                    abstractC0493n.f4095E = null;
                }
                break;
        }
        return na1Var;
    }
}
