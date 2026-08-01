package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class az0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f302h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f303i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(long j, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f303i = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        az0 az0Var = new az0(this.f303i, interfaceC0322ik);
        az0Var.f302h = obj;
        return az0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        az0 az0Var = (az0) mo15g((jz0) obj, (InterfaceC0322ik) obj2);
        na1 na1Var = na1.f4229a;
        az0Var.mo16m(na1Var);
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        w60.m4891M(obj);
        lz0 lz0Var = ((jz0) this.f302h).f2961a;
        lz0Var.m2092c(lz0Var.f3631k, this.f303i, 1);
        return na1.f4229a;
    }
}
