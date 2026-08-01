package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b41 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f369h = 1;

    /* JADX INFO: renamed from: i */
    public float f370i;

    /* JADX INFO: renamed from: j */
    public int f371j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f372k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f373l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(C0206fe c0206fe, float f, InterfaceC0830v7 interfaceC0830v7, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f372k = c0206fe;
        this.f370i = f;
        this.f373l = interfaceC0830v7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f369h;
        Object obj2 = this.f373l;
        switch (i) {
            case 0:
                return new b41((C0206fe) this.f372k, this.f370i, (InterfaceC0830v7) obj2, interfaceC0322ik);
            default:
                b41 b41Var = new b41((b91) obj2, interfaceC0322ik);
                b41Var.f372k = obj;
                return b41Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f369h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((b41) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        final float fM5454x;
        InterfaceC0966yk interfaceC0966yk;
        int i = this.f369h;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f373l;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 0:
                int i2 = this.f371j;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    this.f371j = 1;
                    if (C0045b7.m322c((C0045b7) ((C0206fe) this.f372k).f1698c, new Float(this.f370i), (InterfaceC0830v7) obj2, null, this, 12) == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i3 = this.f371j;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    InterfaceC0966yk interfaceC0966yk2 = (InterfaceC0966yk) this.f372k;
                    fM5454x = z60.m5454x(interfaceC0966yk2.mo1328f());
                    interfaceC0966yk = interfaceC0966yk2;
                } else if (i3 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fM5454x = this.f370i;
                    interfaceC0966yk = (InterfaceC0966yk) this.f372k;
                    w60.m4891M(obj);
                }
                while (p30.m2975K(interfaceC0966yk)) {
                    final b91 b91Var = (b91) obj2;
                    InterfaceC0742sw interfaceC0742sw = new InterfaceC0742sw() { // from class: z81
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p000.InterfaceC0742sw
                        public final Object invoke(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            b91 b91Var2 = b91Var;
                            boolean zM332g = b91Var2.m332g();
                            ep0 ep0Var = b91Var2.f465g;
                            if (!zM332g) {
                                if (ep0Var.m951g() == Long.MIN_VALUE) {
                                    ep0Var.m952h(jLongValue);
                                    ((gp0) b91Var2.f459a.f919e).setValue(Boolean.TRUE);
                                }
                                long jM951g = jLongValue - ep0Var.m951g();
                                float f = fM5454x;
                                if (f != 0.0f) {
                                    jM951g = rd0.m3459R(jM951g / ((double) f));
                                }
                                if (b91Var2.f460b == null) {
                                    b91Var2.f464f.m952h(jM951g);
                                }
                                b91Var2.m333h(jM951g, f == 0.0f);
                            }
                            return na1.f4229a;
                        }
                    };
                    this.f372k = interfaceC0966yk;
                    this.f370i = fM5454x;
                    this.f371j = 1;
                    if (v50.m4406l(mo540e()).m4008c(interfaceC0742sw, this) == enumC1007zk) {
                        break;
                    }
                }
                break;
        }
        return enumC1007zk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(b91 b91Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f373l = b91Var;
    }
}
