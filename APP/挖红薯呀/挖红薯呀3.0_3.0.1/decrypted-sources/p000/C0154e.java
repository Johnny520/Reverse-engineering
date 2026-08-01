package p000;

import android.view.View;
import java.util.concurrent.CancellationException;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: e */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0154e extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1245h;

    /* JADX INFO: renamed from: i */
    public int f1246i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1247j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1248k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0154e(Object obj, Object obj2, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f1245h = i;
        this.f1247j = obj;
        this.f1248k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f1245h;
        Object obj2 = this.f1248k;
        switch (i) {
            case 0:
                return new C0154e((xg0) this.f1247j, (C0264gz) obj2, interfaceC0322ik, 0);
            case 1:
                return new C0154e((xg0) this.f1247j, (C0301hz) obj2, interfaceC0322ik, 1);
            case 2:
                return new C0154e((C0277hb) this.f1247j, (C0607p9) obj2, interfaceC0322ik, 2);
            case 3:
                return new C0154e((g30) this.f1247j, (c31) obj2, interfaceC0322ik, 3);
            case 4:
                return new C0154e((ScrollCaptureCallbackC0019ai) this.f1247j, (Runnable) obj2, interfaceC0322ik, 4);
            case 5:
                return new C0154e((rr0) this.f1247j, (C0399km) obj2, interfaceC0322ik, 5);
            case 6:
                C0154e c0154e = new C0154e((InterfaceC0470md) obj2, interfaceC0322ik, 6);
                c0154e.f1247j = obj;
                return c0154e;
            case 7:
                C0154e c0154e2 = new C0154e((C0215fn) obj2, interfaceC0322ik, 7);
                c0154e2.f1247j = obj;
                return c0154e2;
            case 8:
                return new C0154e((lz0) this.f1247j, (InterfaceC0904ww) obj2, interfaceC0322ik, 8);
            case 9:
                C0154e c0154e3 = new C0154e((C0420l6) obj2, interfaceC0322ik, 9);
                c0154e3.f1247j = obj;
                return c0154e3;
            case 10:
                return new C0154e((C0101cq) this.f1247j, (dz0) obj2, interfaceC0322ik, 10);
            case 11:
                return new C0154e((C0206fe) this.f1247j, (InterfaceC0830v7) obj2, interfaceC0322ik, 11);
            case 12:
                return new C0154e((c40) this.f1247j, (hs0) obj2, interfaceC0322ik, 12);
            case 13:
                C0154e c0154e4 = new C0154e((InterfaceC0331iu) obj2, interfaceC0322ik, 13);
                c0154e4.f1247j = obj;
                return c0154e4;
            case 14:
                return new C0154e((ot0) this.f1247j, (View) obj2, interfaceC0322ik, 14);
            default:
                return new C0154e((x31) this.f1247j, (yf0) obj2, interfaceC0322ik, 15);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1245h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 1:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 2:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 3:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 4:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 5:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 6:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 7:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 8:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 9:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 10:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 11:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 12:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 13:
                return ((C0154e) mo15g(obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 14:
                return ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                ((C0154e) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
                return EnumC1007zk.f7916d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:202:0x0227 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1 A[Catch: all -> 0x01bf, TryCatch #2 {all -> 0x01bf, blocks: (B:104:0x01bb, B:113:0x01d7, B:115:0x01e1, B:118:0x01f3, B:110:0x01ca), top: B:206:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021f A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11, types: [c40] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9, types: [c40] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x021b -> B:113:0x01d7). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        Object objMo2493m;
        InterfaceC0966yk interfaceC0966yk;
        Object objM4440D;
        fg0 fg0Var;
        float fMo654p;
        float fMo654p2;
        lz0 lz0Var;
        C0154e c0154e;
        C0154e c0154e2 = this;
        int i = c0154e2.f1245h;
        ?? r1 = 3;
        char c = 3;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 2;
        na1 na1Var = na1.f4229a;
        Object obj2 = c0154e2.f1248k;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        int i4 = 1;
        CancellationException cancellationException = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (i) {
            case 0:
                int i5 = c0154e2.f1246i;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    c0154e2.f1246i = 1;
                    return ((xg0) c0154e2.f1247j).m5135b((C0264gz) obj2, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i5 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i6 = c0154e2.f1246i;
                if (i6 == 0) {
                    w60.m4891M(obj);
                    c0154e2.f1246i = 1;
                    return ((xg0) c0154e2.f1247j).m5135b((C0301hz) obj2, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i6 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i7 = c0154e2.f1246i;
                if (i7 == 0) {
                    w60.m4891M(obj);
                    c0154e2.f1246i = 1;
                    return s91.m4049n((C0277hb) c0154e2.f1247j, (C0607p9) obj2, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i7 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i8 = c0154e2.f1246i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                InterfaceC0296hu interfaceC0296huMo1196a = ((g30) c0154e2.f1247j).mo1196a();
                C0167ec c0167ec = new C0167ec(z ? 1 : 0, (c31) obj2);
                c0154e2.f1246i = 1;
                return interfaceC0296huMo1196a.mo609b(c0167ec, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
            case 4:
                ScrollCaptureCallbackC0019ai scrollCaptureCallbackC0019ai = (ScrollCaptureCallbackC0019ai) c0154e2.f1247j;
                int i9 = c0154e2.f1246i;
                if (i9 == 0) {
                    w60.m4891M(obj);
                    hu0 hu0Var = scrollCaptureCallbackC0019ai.f174f;
                    c0154e2.f1246i = 1;
                    Object objM1507a = hu0Var.m1507a(0.0f - hu0Var.f2368c, c0154e2);
                    if (objM1507a != enumC1007zk) {
                        objM1507a = na1Var;
                    }
                    if (objM1507a == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i9 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                scrollCaptureCallbackC0019ai.f171c.f2490a.setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return na1Var;
            case 5:
                int i10 = c0154e2.f1246i;
                if (i10 != 0) {
                    if (i10 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                rr0 rr0Var = (rr0) c0154e2.f1247j;
                w70 w70Var = new w70((C0399km) obj2, null);
                c0154e2.f1246i = 1;
                return p30.m3005o(rr0Var, w70Var, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
            case 6:
                int i11 = c0154e2.f1246i;
                try {
                    if (i11 == 0) {
                        w60.m4891M(obj);
                        r31 r31VarM1547w = AbstractC0307i4.m1547w((InterfaceC0966yk) c0154e2.f1247j, null, new C0091cg(i3, z3 ? 1 : 0), 3);
                        c0154e2.f1247j = r31VarM1547w;
                        c0154e2.f1246i = 1;
                        objMo2493m = ((InterfaceC0470md) obj2).mo2493m(c0154e2);
                        r1 = r31VarM1547w;
                        if (objMo2493m == enumC1007zk) {
                            return enumC1007zk;
                        }
                    } else {
                        if (i11 != 1) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c40 c40Var = (c40) c0154e2.f1247j;
                        w60.m4891M(obj);
                        objMo2493m = obj;
                        r1 = c40Var;
                    }
                    return (fg0) objMo2493m;
                } finally {
                    r1.mo478a(null);
                }
            case 7:
                C0215fn c0215fn = (C0215fn) obj2;
                int i12 = c0154e2.f1246i;
                try {
                    if (i12 == 0) {
                        w60.m4891M(obj);
                        interfaceC0966yk = (InterfaceC0966yk) c0154e2.f1247j;
                    } else {
                        if (i12 == 1) {
                            interfaceC0966yk = (InterfaceC0966yk) c0154e2.f1247j;
                            w60.m4891M(obj);
                            objM4440D = obj;
                            fg0Var = (fg0) objM4440D;
                            fMo654p = ((InterfaceC0968ym) c0215fn.f1774e).mo654p(6.0f);
                            fMo654p2 = ((InterfaceC0968ym) c0215fn.f1774e).mo654p(1.0f);
                            lz0Var = (lz0) c0215fn.f1771b;
                            c0154e2.f1247j = interfaceC0966yk;
                            c0154e2.f1246i = 2;
                            c0154e = c0154e2;
                            c0154e2 = c0154e;
                            if (C0215fn.m1163a(c0215fn, lz0Var, fg0Var, fMo654p, fMo654p2, c0154e) != enumC1007zk) {
                            }
                            return enumC1007zk;
                        }
                        if (i12 != 2) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interfaceC0966yk = (InterfaceC0966yk) c0154e2.f1247j;
                        w60.m4891M(obj);
                    }
                    if (!pf1.m3028D(interfaceC0966yk.mo1328f())) {
                        C0834vb c0834vb = (C0834vb) c0215fn.f1775f;
                        c0154e2.f1247j = interfaceC0966yk;
                        c0154e2.f1246i = 1;
                        c0834vb.getClass();
                        objM4440D = C0834vb.m4440D(c0834vb, c0154e2);
                        if (objM4440D != enumC1007zk) {
                            fg0Var = (fg0) objM4440D;
                            fMo654p = ((InterfaceC0968ym) c0215fn.f1774e).mo654p(6.0f);
                            fMo654p2 = ((InterfaceC0968ym) c0215fn.f1774e).mo654p(1.0f);
                            lz0Var = (lz0) c0215fn.f1771b;
                            c0154e2.f1247j = interfaceC0966yk;
                            c0154e2.f1246i = 2;
                            c0154e = c0154e2;
                            c0154e2 = c0154e;
                            if (C0215fn.m1163a(c0215fn, lz0Var, fg0Var, fMo654p, fMo654p2, c0154e) != enumC1007zk) {
                                if (!pf1.m3028D(interfaceC0966yk.mo1328f())) {
                                    return na1Var;
                                }
                            }
                        }
                        return enumC1007zk;
                    }
                } finally {
                    c0215fn.f1776g = null;
                }
            case 8:
                int i13 = c0154e2.f1246i;
                if (i13 == 0) {
                    w60.m4891M(obj);
                    c0154e2.f1246i = 1;
                    return ((lz0) c0154e2.f1247j).m2095f(vh0.f6719e, (InterfaceC0904ww) obj2, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i13 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                C0420l6 c0420l6 = (C0420l6) obj2;
                int i14 = c0154e2.f1246i;
                if (i14 != 0) {
                    if (i14 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                InterfaceC0966yk interfaceC0966yk2 = (InterfaceC0966yk) c0154e2.f1247j;
                InterfaceC0296hu interfaceC0296huMo1196a2 = c0420l6.f3351r.mo1196a();
                C0810uo c0810uo = new C0810uo(c, c0420l6, interfaceC0966yk2, z2 ? 1 : 0);
                c0154e2.f1246i = 1;
                return interfaceC0296huMo1196a2.mo609b(c0810uo, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
            case 10:
                int i15 = c0154e2.f1246i;
                if (i15 != 0) {
                    if (i15 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                C0101cq c0101cq = (C0101cq) c0154e2.f1247j;
                float f = c0101cq.f874b ? -1.0f : 1.0f;
                lz0 lz0Var2 = ((dz0) obj2).f1231Q;
                long j = c0101cq.f873a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
                c0154e2.f1246i = 1;
                return lz0Var2.m2091b((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), false, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
            case 11:
                int i16 = c0154e2.f1246i;
                if (i16 == 0) {
                    w60.m4891M(obj);
                    c0154e2.f1246i = 1;
                    return C0045b7.m322c((C0045b7) ((C0206fe) c0154e2.f1247j).f1698c, new Float(0.0f), (InterfaceC0830v7) obj2, null, c0154e2, 12) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i16 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                int i17 = c0154e2.f1246i;
                if (i17 == 0) {
                    w60.m4891M(obj);
                    c40 c40Var2 = (c40) c0154e2.f1247j;
                    c0154e2.f1246i = 1;
                    if (c40Var2.mo483v(c0154e2) != enumC1007zk) {
                    }
                    return enumC1007zk;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                c0154e2.f1246i = 2;
                if (((hs0) obj2).m1501d(c0154e2) != enumC1007zk) {
                    return na1Var;
                }
                return enumC1007zk;
            case 13:
                int i18 = c0154e2.f1246i;
                if (i18 == 0) {
                    w60.m4891M(obj);
                    Object obj3 = c0154e2.f1247j;
                    c0154e2.f1246i = 1;
                    return ((InterfaceC0331iu) obj2).mo827f(obj3, c0154e2) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i18 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                ot0 ot0Var = (ot0) c0154e2.f1247j;
                View view = (View) obj2;
                int i19 = c0154e2.f1246i;
                try {
                    if (i19 == 0) {
                        w60.m4891M(obj);
                        c0154e2.f1246i = 1;
                        Object objM3489r = rd0.m3489r(ot0Var.f4651u, new kt0(i3, z4 ? 1 : 0, i2), c0154e2);
                        if (objM3489r != enumC1007zk) {
                            objM3489r = na1Var;
                        }
                        if (objM3489r == enumC1007zk) {
                            return enumC1007zk;
                        }
                    } else {
                        if (i19 != 1) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w60.m4891M(obj);
                    }
                    if (oe1.m2888b(view) != ot0Var) {
                        return na1Var;
                    }
                    view.setTag(C0587R.id.androidx_compose_ui_view_composition_context, null);
                    return na1Var;
                } finally {
                    if (oe1.m2888b(view) == ot0Var) {
                        view.setTag(C0587R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            default:
                int i20 = c0154e2.f1246i;
                if (i20 == 0) {
                    w60.m4891M(obj);
                    x31 x31Var = (x31) c0154e2.f1247j;
                    C0167ec c0167ec2 = new C0167ec(i4, (yf0) obj2);
                    c0154e2.f1246i = 1;
                    if (x31Var.mo609b(c0167ec2, c0154e2) == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i20 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                throw new C0725sg();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0154e(Object obj, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f1245h = i;
        this.f1248k = obj;
    }
}
