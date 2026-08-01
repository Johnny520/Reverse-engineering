package p000;

/* JADX INFO: renamed from: h */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0265h extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public boolean f2097h;

    /* JADX INFO: renamed from: i */
    public int f2098i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f2099j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ hs0 f2100k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f2101l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ xg0 f2102m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractC0493n f2103n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0265h(hs0 hs0Var, long j, xg0 xg0Var, AbstractC0493n abstractC0493n, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2100k = hs0Var;
        this.f2101l = j;
        this.f2102m = xg0Var;
        this.f2103n = abstractC0493n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0265h c0265h = new C0265h(this.f2100k, this.f2101l, this.f2102m, this.f2103n, interfaceC0322ik);
        c0265h.f2099j = obj;
        return c0265h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0265h) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0098 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r14.m5135b(r1, r18) != r11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r14.m5135b(r2, r18) == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [js0] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v4, types: [c40] */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        EnumC1007zk enumC1007zk;
        ?? r10;
        Object objM1502e;
        ?? r1;
        boolean z;
        ks0 ks0Var;
        int i = this.f2098i;
        AbstractC0493n abstractC0493n = this.f2103n;
        na1 na1Var = na1.f4229a;
        xg0 xg0Var = this.f2102m;
        EnumC1007zk enumC1007zk2 = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            enumC1007zk = enumC1007zk2;
            r10 = 0;
            r31 r31VarM1547w = AbstractC0307i4.m1547w((InterfaceC0966yk) this.f2099j, null, new C0228g(abstractC0493n, this.f2101l, this.f2102m, null, 0), 3);
            this.f2099j = r31VarM1547w;
            this.f2098i = 1;
            objM1502e = this.f2100k.m1502e(this);
            r1 = r31VarM1547w;
            if (objM1502e != enumC1007zk) {
            }
            return enumC1007zk;
        }
        if (i == 1) {
            c40 c40Var = (c40) this.f2099j;
            w60.m4891M(obj);
            r10 = 0;
            enumC1007zk = enumC1007zk2;
            objM1502e = obj;
            r1 = c40Var;
        } else {
            if (i == 2) {
                z = this.f2097h;
                w60.m4891M(obj);
                r10 = 0;
                enumC1007zk = enumC1007zk2;
                if (z) {
                    js0 js0Var = new js0(this.f2101l);
                    ks0 ks0Var2 = new ks0(js0Var);
                    this.f2099j = ks0Var2;
                    this.f2098i = 3;
                    if (xg0Var.m5135b(js0Var, this) != enumC1007zk) {
                        ks0Var = ks0Var2;
                        r10 = r10;
                        this.f2099j = r10;
                        this.f2098i = 4;
                    }
                    return enumC1007zk;
                }
                abstractC0493n.f4094D = r10;
                return na1Var;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                r10 = 0;
                abstractC0493n.f4094D = r10;
                return na1Var;
            }
            ks0Var = (ks0) this.f2099j;
            w60.m4891M(obj);
            r10 = 0;
            enumC1007zk = enumC1007zk2;
            this.f2099j = r10;
            this.f2098i = 4;
        }
        boolean zBooleanValue = ((Boolean) objM1502e).booleanValue();
        if (!r1.mo479b()) {
            js0 js0Var2 = abstractC0493n.f4094D;
            if (js0Var2 != null) {
                f30 ks0Var3 = zBooleanValue ? new ks0(js0Var2) : new is0(js0Var2);
                this.f2099j = r10;
                this.f2098i = 5;
            }
            abstractC0493n.f4094D = r10;
            return na1Var;
        }
        this.f2099j = r10;
        this.f2097h = zBooleanValue;
        this.f2098i = 2;
        r1.mo478a(r10);
        Object objMo483v = r1.mo483v(this);
        if (objMo483v != enumC1007zk) {
            objMo483v = na1Var;
        }
        if (objMo483v != enumC1007zk) {
            z = zBooleanValue;
            r10 = r10;
            if (z) {
            }
            abstractC0493n.f4094D = r10;
            return na1Var;
        }
        return enumC1007zk;
    }
}
