package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2176h;

    /* JADX INFO: renamed from: i */
    public int f2177i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2178j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ float f2179k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h81(i81 i81Var, float f, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f2176h = i;
        this.f2178j = i81Var;
        this.f2179k = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f2176h;
        Object obj2 = this.f2178j;
        switch (i) {
            case 0:
                return new h81((i81) obj2, this.f2179k, interfaceC0322ik, 0);
            case 1:
                return new h81((i81) obj2, this.f2179k, interfaceC0322ik, 1);
            default:
                h81 h81Var = new h81((ScrollCaptureCallbackC0019ai) obj2, interfaceC0322ik);
                h81Var.f2179k = ((Number) obj).floatValue();
                return h81Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2176h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((h81) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 1:
                return ((h81) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((h81) mo15g(Float.valueOf(((Number) obj).floatValue()), (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f2176h;
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        Object obj2 = this.f2178j;
        switch (i) {
            case 0:
                i81 i81Var = (i81) obj2;
                int i2 = this.f2177i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    C0045b7 c0045b7 = i81Var.f2487w;
                    if (c0045b7 == null) {
                        return na1Var;
                    }
                    Float f = new Float(this.f2179k);
                    InterfaceC0830v7 interfaceC0830v7 = i81Var.f2485u ? w51.f7011f : i81Var.f2484t;
                    this.f2177i = 1;
                    obj = C0045b7.m322c(c0045b7, f, interfaceC0830v7, null, this, 12);
                    if (obj == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i2 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1Var;
            case 1:
                i81 i81Var2 = (i81) obj2;
                int i3 = this.f2177i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    C0045b7 c0045b72 = i81Var2.f2486v;
                    if (c0045b72 == null) {
                        return na1Var;
                    }
                    Float f2 = new Float(this.f2179k);
                    InterfaceC0830v7 interfaceC0830v72 = i81Var2.f2485u ? w51.f7011f : i81Var2.f2484t;
                    this.f2177i = 1;
                    obj = C0045b7.m322c(c0045b72, f2, interfaceC0830v72, null, this, 12);
                    if (obj == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i3 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return na1Var;
            default:
                ScrollCaptureCallbackC0019ai scrollCaptureCallbackC0019ai = (ScrollCaptureCallbackC0019ai) obj2;
                int i4 = this.f2177i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    float f3 = this.f2179k;
                    Object objM1701g = scrollCaptureCallbackC0019ai.f169a.f7471d.f5877d.m1701g(rz0.f5592e);
                    InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) (objM1701g != null ? objM1701g : null);
                    if (interfaceC0904ww == null) {
                        throw AbstractC0748t1.m4149g("Required value was null.");
                    }
                    ok0 ok0Var = new ok0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.f2177i = 1;
                    obj = interfaceC0904ww.invoke(ok0Var, this);
                    if (obj == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i4 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((ok0) obj).f4590a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h81(ScrollCaptureCallbackC0019ai scrollCaptureCallbackC0019ai, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2176h = 2;
        this.f2178j = scrollCaptureCallbackC0019ai;
    }
}
