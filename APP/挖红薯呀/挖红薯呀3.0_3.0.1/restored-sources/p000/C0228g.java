package p000;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0228g extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1826h;

    /* JADX INFO: renamed from: i */
    public int f1827i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1828j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1829k;

    /* JADX INFO: renamed from: l */
    public Object f1830l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1831m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0228g(Object obj, long j, Object obj2, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f1826h = i;
        this.f1831m = obj;
        this.f1828j = j;
        this.f1829k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f1826h;
        Object obj2 = this.f1829k;
        Object obj3 = this.f1831m;
        switch (i) {
            case 0:
                return new C0228g((AbstractC0493n) obj3, this.f1828j, (xg0) obj2, interfaceC0322ik, 0);
            case 1:
                return new C0228g((c40) obj3, this.f1828j, (xg0) obj2, interfaceC0322ik, 1);
            default:
                C0228g c0228g = new C0228g((lz0) obj3, this.f1828j, (wt0) obj2, interfaceC0322ik, 2);
                c0228g.f1830l = obj;
                return c0228g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1826h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0228g) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 1:
                return ((C0228g) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((C0228g) mo15g((jz0) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        js0 js0Var;
        ks0 ks0Var;
        int i = this.f1826h;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f1829k;
        long j = this.f1828j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        Object obj3 = this.f1831m;
        switch (i) {
            case 0:
                AbstractC0493n abstractC0493n = (AbstractC0493n) obj3;
                int i2 = this.f1827i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    if (abstractC0493n.m2611B0()) {
                        long j2 = AbstractC0686re.f5382a;
                        this.f1827i = 1;
                        if (s91.m4056u(j2, this) != enumC1007zk) {
                        }
                    }
                } else if (i2 == 1) {
                    w60.m4891M(obj);
                } else if (i2 != 2) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    js0Var = (js0) this.f1830l;
                    w60.m4891M(obj);
                    abstractC0493n.f4094D = js0Var;
                }
                js0 js0Var2 = new js0(j);
                this.f1830l = js0Var2;
                this.f1827i = 2;
                if (((xg0) obj2).m5135b(js0Var2, this) != enumC1007zk) {
                    js0Var = js0Var2;
                    abstractC0493n.f4094D = js0Var;
                }
                break;
            case 1:
                xg0 xg0Var = (xg0) obj2;
                int i3 = this.f1827i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    this.f1827i = 1;
                    if (((c40) obj3).mo483v(this) != enumC1007zk) {
                    }
                } else if (i3 == 1) {
                    w60.m4891M(obj);
                } else if (i3 == 2) {
                    ks0Var = (ks0) this.f1830l;
                    w60.m4891M(obj);
                    this.f1830l = null;
                    this.f1827i = 3;
                    if (xg0Var.m5135b(ks0Var, this) != enumC1007zk) {
                    }
                } else if (i3 != 3) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                js0 js0Var3 = new js0(j);
                ks0Var = new ks0(js0Var3);
                this.f1830l = ks0Var;
                this.f1827i = 2;
                if (xg0Var.m5135b(js0Var3, this) != enumC1007zk) {
                    this.f1830l = null;
                    this.f1827i = 3;
                    if (xg0Var.m5135b(ks0Var, this) != enumC1007zk) {
                    }
                }
                break;
            default:
                final lz0 lz0Var = (lz0) obj3;
                int i4 = this.f1827i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    final jz0 jz0Var = (jz0) this.f1830l;
                    float fM2096g = lz0Var.m2096g(j);
                    final wt0 wt0Var = (wt0) obj2;
                    InterfaceC0904ww interfaceC0904ww = new InterfaceC0904ww() { // from class: vy0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p000.InterfaceC0904ww
                        public final Object invoke(Object obj4, Object obj5) {
                            float fFloatValue = ((Float) obj4).floatValue();
                            ((Float) obj5).getClass();
                            wt0 wt0Var2 = wt0Var;
                            float f = fFloatValue - wt0Var2.f7189d;
                            lz0 lz0Var2 = lz0Var;
                            long jM2097h = lz0Var2.m2097h(lz0Var2.m2093d(f));
                            lz0 lz0Var3 = jz0Var.f2961a;
                            wt0Var2.f7189d += lz0Var2.m2093d(lz0Var2.m2096g(lz0Var3.m2092c(lz0Var3.f3631k, jM2097h, 1)));
                            return na1.f4229a;
                        }
                    };
                    this.f1827i = 1;
                    if (z60.m5436f(fM2096g, null, interfaceC0904ww, this, 12) == enumC1007zk) {
                    }
                } else if (i4 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
        }
        return enumC1007zk;
    }
}
