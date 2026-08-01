package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q30 extends zu0 {

    /* JADX INFO: renamed from: e */
    public int f5035e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0904ww f5036f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0322ik f5037g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(InterfaceC0322ik interfaceC0322ik, InterfaceC0322ik interfaceC0322ik2, InterfaceC0904ww interfaceC0904ww) {
        super(interfaceC0322ik);
        this.f5036f = interfaceC0904ww;
        this.f5037g = interfaceC0322ik2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f5035e;
        if (i != 0) {
            if (i != 1) {
                C0921xc.m5134o("This coroutine had already completed");
                return null;
            }
            this.f5035e = 2;
            w60.m4891M(obj);
            return obj;
        }
        this.f5035e = 1;
        w60.m4891M(obj);
        InterfaceC0904ww interfaceC0904ww = this.f5036f;
        interfaceC0904ww.getClass();
        s91.m4048m(2, interfaceC0904ww);
        return interfaceC0904ww.invoke(this.f5037g, this);
    }
}
