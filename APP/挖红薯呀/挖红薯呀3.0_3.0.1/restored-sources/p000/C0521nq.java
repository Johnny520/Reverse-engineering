package p000;

/* JADX INFO: renamed from: nq */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0521nq extends m51 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4302h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0521nq(int i, InterfaceC0322ik interfaceC0322ik, int i2) {
        super(i, interfaceC0322ik);
        this.f4302h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        int i = this.f4302h;
        na1 na1Var = na1.f4229a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((ok0) obj2).f4590a;
                new C0521nq(i2, (InterfaceC0322ik) obj3, 0).mo16m(na1Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new C0521nq(i2, (InterfaceC0322ik) obj3, 1).mo16m(na1Var);
                break;
            default:
                long j2 = ((ok0) obj2).f4590a;
                new C0521nq(i2, (InterfaceC0322ik) obj3, 2).mo16m(na1Var);
                break;
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f4302h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                w60.m4891M(obj);
                break;
            case 1:
                w60.m4891M(obj);
                break;
            default:
                w60.m4891M(obj);
                break;
        }
        return na1Var;
    }
}
