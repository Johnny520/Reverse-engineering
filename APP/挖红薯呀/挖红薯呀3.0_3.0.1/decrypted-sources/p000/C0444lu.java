package p000;

/* JADX INFO: renamed from: lu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0444lu extends m51 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: h */
    public int f3593h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC0331iu f3594i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f3595j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0119d7 f3596k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0444lu(C0119d7 c0119d7, InterfaceC0322ik interfaceC0322ik) {
        super(3, interfaceC0322ik);
        this.f3596k = c0119d7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        C0444lu c0444lu = new C0444lu(this.f3596k, (InterfaceC0322ik) obj3);
        c0444lu.f3594i = (InterfaceC0331iu) obj;
        c0444lu.f3595j = obj2;
        return c0444lu.mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r0.mo827f(r6, r5) == r4) goto L15;
     */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        InterfaceC0331iu interfaceC0331iu;
        int i = this.f3593h;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            interfaceC0331iu = this.f3594i;
            Object obj2 = this.f3595j;
            this.f3594i = interfaceC0331iu;
            this.f3593h = 1;
            obj = this.f3596k.invoke(obj2, this);
            if (obj != enumC1007zk) {
            }
            return enumC1007zk;
        }
        if (i != 1) {
            if (i == 2) {
                w60.m4891M(obj);
                return na1.f4229a;
            }
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC0331iu = this.f3594i;
        w60.m4891M(obj);
        this.f3594i = null;
        this.f3593h = 2;
    }
}
