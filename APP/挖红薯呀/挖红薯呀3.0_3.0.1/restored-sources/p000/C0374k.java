package p000;

/* JADX INFO: renamed from: k */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0374k extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public int f2962h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xg0 f2963i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ js0 f2964j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f2965k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractC0493n f2966l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0374k(xg0 xg0Var, js0 js0Var, boolean z, AbstractC0493n abstractC0493n, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2963i = xg0Var;
        this.f2964j = js0Var;
        this.f2965k = z;
        this.f2966l = abstractC0493n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        return new C0374k(this.f2963i, this.f2964j, this.f2965k, this.f2966l, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0374k) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r7.f2963i.m5135b(r3, r7) == r4) goto L15;
     */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        int i = this.f2962h;
        js0 js0Var = this.f2964j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            long j = AbstractC0686re.f5382a;
            this.f2962h = 1;
            if (s91.m4056u(j, this) != enumC1007zk) {
            }
            return enumC1007zk;
        }
        if (i != 1) {
            if (i != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
            boolean z = this.f2965k;
            AbstractC0493n abstractC0493n = this.f2966l;
            if (z) {
                abstractC0493n.f4098H = js0Var;
            } else {
                abstractC0493n.f4094D = js0Var;
            }
            return na1.f4229a;
        }
        w60.m4891M(obj);
        this.f2962h = 2;
    }
}
