package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ul */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0807ul extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6251h = 0;

    /* JADX INFO: renamed from: i */
    public wt0 f6252i;

    /* JADX INFO: renamed from: j */
    public int f6253j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f6254k;

    /* JADX INFO: renamed from: l */
    public Object f6255l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f6256m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ ny0 f6257n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0807ul(f21 f21Var, float f, InterfaceC0742sw interfaceC0742sw, ny0 ny0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f6255l = f21Var;
        this.f6254k = f;
        this.f6256m = interfaceC0742sw;
        this.f6257n = ny0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f6251h;
        Object obj2 = this.f6256m;
        switch (i) {
            case 0:
                hz0 hz0Var = (hz0) this.f6257n;
                return new C0807ul(this.f6254k, (C0856vl) obj2, hz0Var, interfaceC0322ik);
            default:
                ny0 ny0Var = this.f6257n;
                return new C0807ul((f21) this.f6255l, this.f6254k, (InterfaceC0742sw) obj2, ny0Var, interfaceC0322ik);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6251h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((C0807ul) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [c21] */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        wt0 wt0Var;
        C0879w7 c0879w7;
        C0478ml c0478ml;
        C1006zj c1006zj;
        final wt0 wt0Var2;
        Object objM997b;
        int i = this.f6251h;
        final int i2 = 0;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        float f = this.f6254k;
        Object obj2 = this.f6256m;
        final int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.f6253j;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0879w7 = (C0879w7) this.f6255l;
                    wt0Var = this.f6252i;
                    try {
                        w60.m4891M(obj);
                    } catch (CancellationException unused) {
                        wt0Var.f7189d = ((Number) c0879w7.m4921a()).floatValue();
                    }
                    f = wt0Var.f7189d;
                    break;
                } else {
                    w60.m4891M(obj);
                    if (Math.abs(f) > 1.0f) {
                        wt0 wt0Var3 = new wt0();
                        wt0Var3.f7189d = f;
                        wt0 wt0Var4 = new wt0();
                        C0879w7 c0879w7M3045a = pf1.m3045a(0.0f, f, 28);
                        try {
                            C0856vl c0856vl = (C0856vl) obj2;
                            c0478ml = c0856vl.f6741a;
                            c1006zj = new C1006zj(wt0Var4, (hz0) this.f6257n, wt0Var3, c0856vl);
                            this.f6252i = wt0Var3;
                            this.f6255l = c0879w7M3045a;
                            this.f6253j = 1;
                        } catch (CancellationException unused2) {
                            wt0Var = wt0Var3;
                            c0879w7 = c0879w7M3045a;
                            wt0Var.f7189d = ((Number) c0879w7.m4921a()).floatValue();
                        }
                        if (z60.m5437g(c0879w7M3045a, c0478ml, false, c1006zj, this) == enumC1007zk) {
                            return enumC1007zk;
                        }
                        wt0Var = wt0Var3;
                        f = wt0Var.f7189d;
                    }
                    break;
                }
                return new Float(f);
            default:
                final InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) obj2;
                f21 f21Var = (f21) this.f6255l;
                j21 j21Var = f21Var.f1571a;
                int i5 = this.f6253j;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    float fMo949a = j21Var.mo949a(f, ((C0916x7) new C0948y2(f21Var.f1572b.f4003a).m5206j(new C0916x7(0.0f), new C0916x7(f))).f7277a);
                    if (Float.isNaN(fMo949a)) {
                        z10.m5363c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    wt0Var2 = new wt0();
                    float fSignum = Math.signum(f) * Math.abs(fMo949a);
                    wt0Var2.f7189d = fSignum;
                    interfaceC0742sw.invoke(new Float(fSignum));
                    float f2 = wt0Var2.f7189d;
                    ?? r4 = new InterfaceC0742sw() { // from class: c21
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p000.InterfaceC0742sw
                        public final Object invoke(Object obj3) {
                            int i6 = i2;
                            na1 na1Var = na1.f4229a;
                            InterfaceC0742sw interfaceC0742sw2 = interfaceC0742sw;
                            wt0 wt0Var5 = wt0Var2;
                            float fFloatValue = ((Float) obj3).floatValue();
                            switch (i6) {
                                case 0:
                                    float f3 = wt0Var5.f7189d - fFloatValue;
                                    wt0Var5.f7189d = f3;
                                    interfaceC0742sw2.invoke(Float.valueOf(f3));
                                    break;
                                default:
                                    float f4 = wt0Var5.f7189d - fFloatValue;
                                    wt0Var5.f7189d = f4;
                                    interfaceC0742sw2.invoke(Float.valueOf(f4));
                                    break;
                            }
                            return na1Var;
                        }
                    };
                    this.f6252i = wt0Var2;
                    this.f6253j = 1;
                    objM997b = f21.m997b(f21Var, this.f6257n, f2, this.f6254k, r4, this);
                    if (objM997b != enumC1007zk) {
                    }
                    return enumC1007zk;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        w60.m4891M(obj);
                        return obj;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wt0 wt0Var5 = this.f6252i;
                w60.m4891M(obj);
                wt0Var2 = wt0Var5;
                objM997b = obj;
                C0879w7 c0879w72 = (C0879w7) objM997b;
                float fMo950b = j21Var.mo950b(((Number) c0879w72.m4921a()).floatValue());
                if (Float.isNaN(fMo950b)) {
                    z10.m5363c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                wt0Var2.f7189d = fMo950b;
                C0879w7 c0879w7M3057q = pf1.m3057q(c0879w72, 0.0f, 0.0f, 30);
                o31 o31Var = f21Var.f1573c;
                InterfaceC0742sw interfaceC0742sw2 = new InterfaceC0742sw() { // from class: c21
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0742sw
                    public final Object invoke(Object obj3) {
                        int i6 = i3;
                        na1 na1Var = na1.f4229a;
                        InterfaceC0742sw interfaceC0742sw22 = interfaceC0742sw;
                        wt0 wt0Var52 = wt0Var2;
                        float fFloatValue = ((Float) obj3).floatValue();
                        switch (i6) {
                            case 0:
                                float f3 = wt0Var52.f7189d - fFloatValue;
                                wt0Var52.f7189d = f3;
                                interfaceC0742sw22.invoke(Float.valueOf(f3));
                                break;
                            default:
                                float f4 = wt0Var52.f7189d - fFloatValue;
                                wt0Var52.f7189d = f4;
                                interfaceC0742sw22.invoke(Float.valueOf(f4));
                                break;
                        }
                        return na1Var;
                    }
                };
                this.f6252i = null;
                this.f6253j = 2;
                Object objM1655e = j50.m1655e(this.f6257n, fMo950b, fMo950b, c0879w7M3057q, o31Var, interfaceC0742sw2, this);
                if (objM1655e != enumC1007zk) {
                    return objM1655e;
                }
                return enumC1007zk;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0807ul(float f, C0856vl c0856vl, hz0 hz0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f6254k = f;
        this.f6256m = c0856vl;
        this.f6257n = hz0Var;
    }
}
