package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: cg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0091cg extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f807h;

    /* JADX INFO: renamed from: i */
    public int f808i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f809j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091cg(c90 c90Var, int i, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f807h = 4;
        this.f809j = c90Var;
        this.f808i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = 2;
        switch (this.f807h) {
            case 0:
                return new C0091cg((C0128dg) this.f809j, interfaceC0322ik, 0);
            case 1:
                return new C0091cg((C0656ql) this.f809j, interfaceC0322ik, 1);
            case 2:
                return new C0091cg((C0260gv) this.f809j, interfaceC0322ik, i);
            case 3:
                return new C0091cg((C0111d) this.f809j, interfaceC0322ik, 3);
            case 4:
                return new C0091cg((c90) this.f809j, this.f808i, interfaceC0322ik);
            case 5:
                C0091cg c0091cg = new C0091cg(i, interfaceC0322ik);
                c0091cg.f809j = obj;
                return c0091cg;
            case 6:
                return new C0091cg((C0215fn) this.f809j, interfaceC0322ik, 6);
            case 7:
                return new C0091cg((s51) this.f809j, interfaceC0322ik, 7);
            case 8:
                return new C0091cg((hs0) this.f809j, interfaceC0322ik, 8);
            default:
                return new C0091cg((i81) this.f809j, interfaceC0322ik, 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f807h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 4:
                ((C0091cg) mo15g((ny0) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
                break;
        }
        return ((C0091cg) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        InterfaceC0966yk interfaceC0966yk;
        int i = this.f807h;
        boolean z = false;
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        InterfaceC0322ik interfaceC0322ik = null;
        switch (i) {
            case 0:
                C0128dg c0128dg = (C0128dg) this.f809j;
                int i2 = this.f808i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    long jMo2690c = ((nc1) pf1.m3058r(c0128dg, AbstractC0131dj.f1132s)).mo2690c();
                    this.f808i = 1;
                    if (s91.m4056u(jMo2690c, this) == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                InterfaceC0298hw interfaceC0298hw = c0128dg.f1093O;
                if (interfaceC0298hw != null) {
                    interfaceC0298hw.invoke();
                }
                break;
            case 1:
                C0656ql c0656ql = (C0656ql) this.f809j;
                int i3 = this.f808i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    xt0 xt0Var = new xt0();
                    xt0 xt0Var2 = new xt0();
                    xt0 xt0Var3 = new xt0();
                    InterfaceC0296hu interfaceC0296huMo1196a = c0656ql.f5195r.mo1196a();
                    C0722sd c0722sd = new C0722sd(xt0Var, xt0Var2, xt0Var3, c0656ql, 1);
                    this.f808i = 1;
                    if (interfaceC0296huMo1196a.mo609b(c0722sd, this) == enumC1007zk) {
                    }
                } else if (i3 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            case 2:
                int i4 = this.f808i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    C0260gv c0260gv = (C0260gv) this.f809j;
                    this.f808i = 1;
                    if (s91.m4049n(c0260gv, null, this) == enumC1007zk) {
                    }
                } else if (i4 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            case 3:
                int i5 = this.f808i;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    C0879w7 c0879w7 = (C0879w7) ((C0111d) this.f809j).f920f;
                    Float f = new Float(0.0f);
                    o31 o31VarM4028O = s91.m4028O(0.0f, 400.0f, new Float(0.5f), 1);
                    this.f808i = 1;
                    if (z60.m5438h(c0879w7, f, o31VarM4028O, true, new sx0(17), this) == enumC1007zk) {
                    }
                } else if (i5 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            case 4:
                w60.m4891M(obj);
                c90 c90Var = (c90) this.f809j;
                int i6 = this.f808i;
                C0206fe c0206fe = c90Var.f743e;
                if (((dp0) c0206fe.f1697b).m720g() != i6 || ((dp0) c0206fe.f1698c).m720g() != 0) {
                    l70 l70Var = c90Var.f752n;
                    l70Var.m1981c();
                    l70Var.f3372b = null;
                    C0134dm c0134dm = c90Var.f739a;
                }
                c0206fe.m1091b(i6, 0);
                c0206fe.f1699d = null;
                b60 b60Var = c90Var.f749k;
                if (b60Var != null) {
                    b60Var.m304k();
                }
                break;
            case 5:
                int i7 = this.f808i;
                if (i7 == 0) {
                    w60.m4891M(obj);
                    interfaceC0966yk = (InterfaceC0966yk) this.f809j;
                } else if (i7 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    interfaceC0966yk = (InterfaceC0966yk) this.f809j;
                    w60.m4891M(obj);
                }
                while (pf1.m3028D(interfaceC0966yk.mo1328f())) {
                    C0621pn c0621pn = new C0621pn(29);
                    this.f809j = interfaceC0966yk;
                    this.f808i = 1;
                    if (v50.m4406l(mo540e()).m4008c(c0621pn, this) == enumC1007zk) {
                        break;
                    }
                }
                break;
            case 6:
                int i8 = this.f808i;
                if (i8 == 0) {
                    w60.m4891M(obj);
                    C0834vb c0834vb = (C0834vb) ((C0215fn) this.f809j).f1775f;
                    this.f808i = 1;
                    Object objM3013w = p30.m3013w(new C0154e(c0834vb, interfaceC0322ik, 6), this);
                    if (objM3013w == enumC1007zk) {
                    }
                } else if (i8 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            case 7:
                s51 s51Var = (s51) this.f809j;
                int i9 = this.f808i;
                if (i9 == 0) {
                    w60.m4891M(obj);
                    PointerInputEventHandler pointerInputEventHandler = s51Var.f5648t;
                    this.f808i = 2;
                    if (pointerInputEventHandler.invoke(s51Var, this) == enumC1007zk) {
                    }
                } else if (i9 == 1 || i9 == 2) {
                    w60.m4891M(obj);
                } else {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            case 8:
                int i10 = this.f808i;
                if (i10 == 0) {
                    w60.m4891M(obj);
                    hs0 hs0Var = (hs0) this.f809j;
                    this.f808i = 1;
                    if (hs0Var.m1501d(this) == enumC1007zk) {
                    }
                } else if (i10 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                i81 i81Var = (i81) this.f809j;
                int i11 = this.f808i;
                if (i11 == 0) {
                    w60.m4891M(obj);
                    xt0 xt0Var4 = new xt0();
                    InterfaceC0296hu interfaceC0296huMo1196a2 = i81Var.f2482r.mo1196a();
                    C0810uo c0810uo = new C0810uo(4, xt0Var4, i81Var, z);
                    this.f808i = 1;
                    if (interfaceC0296huMo1196a2.mo609b(c0810uo, this) == enumC1007zk) {
                    }
                } else if (i11 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
        }
        return enumC1007zk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0091cg(int i, InterfaceC0322ik interfaceC0322ik) {
        super(i, interfaceC0322ik);
        this.f807h = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0091cg(Object obj, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f807h = i;
        this.f809j = obj;
    }
}
