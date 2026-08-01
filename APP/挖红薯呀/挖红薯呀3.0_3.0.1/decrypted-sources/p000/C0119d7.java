package p000;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0119d7 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f979h;

    /* JADX INFO: renamed from: i */
    public int f980i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f981j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f982k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f983l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f984m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0119d7(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f979h = i;
        this.f981j = obj;
        this.f982k = obj2;
        this.f983l = obj3;
        this.f984m = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f979h;
        Object obj2 = this.f984m;
        Object obj3 = this.f983l;
        Object obj4 = this.f982k;
        switch (i) {
            case 0:
                return new C0119d7(this.f981j, (C0045b7) obj4, (oh0) obj3, (oh0) obj2, interfaceC0322ik, 0);
            case 1:
                return new C0119d7((ScrollCaptureCallbackC0019ai) this.f981j, (ScrollCaptureSession) obj4, (Rect) obj3, (Consumer) obj2, interfaceC0322ik, 1);
            case 2:
                C0119d7 c0119d7 = new C0119d7((InterfaceC0296hu) obj4, (z31) obj3, (Float) obj2, interfaceC0322ik);
                c0119d7.f981j = obj;
                return c0119d7;
            default:
                return new C0119d7((v31) this.f981j, (InterfaceC0296hu) obj4, (z31) obj3, (Float) obj2, interfaceC0322ik, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f979h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0119d7) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 1:
                return ((C0119d7) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 2:
                return ((C0119d7) mo15g((h11) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((C0119d7) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        Object objM175a;
        int i = this.f979h;
        int i2 = 2;
        Object obj2 = this.f984m;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        Object obj3 = this.f983l;
        na1 na1Var = na1.f4229a;
        Object obj4 = this.f982k;
        int i3 = 1;
        InterfaceC0322ik interfaceC0322ik = null;
        switch (i) {
            case 0:
                C0045b7 c0045b7 = (C0045b7) obj4;
                int i4 = this.f980i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    if (!p30.m3002l(this.f981j, c0045b7.f434e.getValue())) {
                        Object obj5 = this.f981j;
                        o31 o31Var = AbstractC0199f7.f1613a;
                        InterfaceC0830v7 interfaceC0830v7 = (InterfaceC0830v7) ((oh0) obj3).getValue();
                        this.f980i = 1;
                        if (C0045b7.m322c((C0045b7) obj4, obj5, interfaceC0830v7, null, this, 12) == enumC1007zk) {
                            return enumC1007zk;
                        }
                    }
                    return na1Var;
                }
                if (i4 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                o31 o31Var2 = AbstractC0199f7.f1613a;
                InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) ((oh0) obj2).getValue();
                if (interfaceC0742sw != null) {
                    interfaceC0742sw.invoke(c0045b7.m323d());
                }
                return na1Var;
            case 1:
                int i5 = this.f980i;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    Rect rect = (Rect) obj3;
                    a30 a30Var = new a30(rect.left, rect.top, rect.right, rect.bottom);
                    this.f980i = 1;
                    objM175a = ScrollCaptureCallbackC0019ai.m175a((ScrollCaptureCallbackC0019ai) this.f981j, (ScrollCaptureSession) obj4, a30Var, this);
                    if (objM175a == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i5 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                    objM175a = obj;
                }
                ((Consumer) obj2).accept(u50.m4258B((a30) objM175a));
                return na1Var;
            case 2:
                z31 z31Var = (z31) obj3;
                int i6 = this.f980i;
                if (i6 != 0) {
                    if (i6 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                int iOrdinal = ((h11) this.f981j).ordinal();
                if (iOrdinal == 0) {
                    this.f980i = 1;
                    if (((InterfaceC0296hu) obj4).mo609b(z31Var, this) == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0921xc.m5129j();
                        return null;
                    }
                    Float f = (Float) obj2;
                    if (f == AbstractC0398kl.f3211v) {
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    z31Var.m5413j(null, f);
                }
                return na1Var;
            default:
                InterfaceC0296hu interfaceC0296hu = (InterfaceC0296hu) obj4;
                z31 z31Var2 = (z31) obj3;
                int i7 = this.f980i;
                int i8 = 4;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            w60.m4891M(obj);
                            this.f980i = 3;
                            if (interfaceC0296hu.mo609b(z31Var2, this) == enumC1007zk) {
                                return enumC1007zk;
                            }
                        } else if (i7 != 3 && i7 != 4) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    w60.m4891M(obj);
                } else {
                    w60.m4891M(obj);
                    v31 v31Var = (v31) this.f981j;
                    if (v31Var == i11.f2395a) {
                        this.f980i = 1;
                        if (interfaceC0296hu.mo609b(z31Var2, this) == enumC1007zk) {
                            return enumC1007zk;
                        }
                    } else if (v31Var == i11.f2396b) {
                        b51 b51VarM2101h = z31Var2.m2101h();
                        C0628pu c0628pu = new C0628pu(2, null);
                        this.f980i = 2;
                        if (rd0.m3489r(b51VarM2101h, c0628pu, this) == enumC1007zk) {
                            return enumC1007zk;
                        }
                        this.f980i = 3;
                        if (interfaceC0296hu.mo609b(z31Var2, this) == enumC1007zk) {
                        }
                    } else {
                        b51 b51VarM2101h2 = z31Var2.m2101h();
                        u31 u31Var = new u31(v31Var, null);
                        int i9 = AbstractC0487mu.f4046a;
                        C0220fs c0220fs = C0220fs.f1799d;
                        EnumC0758tb enumC0758tb = EnumC0758tb.f5968d;
                        InterfaceC0296hu interfaceC0296huM3485n = rd0.m3485n(rd0.m3485n(new C0111d(i8, new C0760td(u31Var, b51VarM2101h2, c0220fs, -2, enumC0758tb), new kt0(i2, interfaceC0322ik, i3))));
                        C0119d7 c0119d7 = new C0119d7(interfaceC0296hu, z31Var2, (Float) obj2, null);
                        this.f980i = 4;
                        Object objMo609b = new C0760td(new C0444lu(c0119d7, null), interfaceC0296huM3485n, c0220fs, -2, enumC0758tb).mo981c(c0220fs, 0, enumC0758tb).mo609b(yj0.f7652d, this);
                        if (objMo609b != enumC1007zk) {
                            objMo609b = na1Var;
                        }
                        if (objMo609b != enumC1007zk) {
                            objMo609b = na1Var;
                        }
                        if (objMo609b == enumC1007zk) {
                            return enumC1007zk;
                        }
                    }
                }
                return na1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119d7(InterfaceC0296hu interfaceC0296hu, z31 z31Var, Float f, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f979h = 2;
        this.f982k = interfaceC0296hu;
        this.f983l = z31Var;
        this.f984m = f;
    }
}
