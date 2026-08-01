package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 extends AbstractC0358jk {

    /* JADX INFO: renamed from: g */
    public int f5287g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0904ww f5288h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0322ik f5289i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(InterfaceC0322ik interfaceC0322ik, InterfaceC0618pk interfaceC0618pk, InterfaceC0904ww interfaceC0904ww, InterfaceC0322ik interfaceC0322ik2) {
        super(interfaceC0322ik, interfaceC0618pk);
        this.f5288h = interfaceC0904ww;
        this.f5289i = interfaceC0322ik2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f5287g;
        if (i != 0) {
            if (i != 1) {
                C0921xc.m5134o("This coroutine had already completed");
                return null;
            }
            this.f5287g = 2;
            w60.m4891M(obj);
            return obj;
        }
        this.f5287g = 1;
        w60.m4891M(obj);
        InterfaceC0904ww interfaceC0904ww = this.f5288h;
        interfaceC0904ww.getClass();
        s91.m4048m(2, interfaceC0904ww);
        return interfaceC0904ww.invoke(this.f5289i, this);
    }
}
