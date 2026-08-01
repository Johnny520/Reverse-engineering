package p000;

/* JADX INFO: renamed from: pu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0628pu extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ int f4967h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0628pu c0628pu = new C0628pu(2, interfaceC0322ik);
        c0628pu.f4967h = ((Number) obj).intValue();
        return c0628pu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0628pu) mo15g(Integer.valueOf(((Number) obj).intValue()), (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        w60.m4891M(obj);
        return Boolean.valueOf(this.f4967h > 0);
    }
}
