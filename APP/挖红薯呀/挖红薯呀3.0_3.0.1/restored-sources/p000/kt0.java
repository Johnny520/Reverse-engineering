package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3263h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f3264i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt0(int i, InterfaceC0322ik interfaceC0322ik, int i2) {
        super(i, interfaceC0322ik);
        this.f3263h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        switch (this.f3263h) {
            case 0:
                kt0 kt0Var = new kt0(2, interfaceC0322ik, 0);
                kt0Var.f3264i = obj;
                return kt0Var;
            default:
                kt0 kt0Var2 = new kt0(2, interfaceC0322ik, 1);
                kt0Var2.f3264i = obj;
                return kt0Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3263h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((kt0) mo15g((jt0) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((kt0) mo15g((h11) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        switch (this.f3263h) {
            case 0:
                w60.m4891M(obj);
                return Boolean.valueOf(((jt0) this.f3264i) == jt0.f2941d);
            default:
                w60.m4891M(obj);
                return Boolean.valueOf(((h11) this.f3264i) != h11.f2123d);
        }
    }
}
