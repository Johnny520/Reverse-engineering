package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: uo */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0810uo implements InterfaceC0331iu {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6271d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6272e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f6273f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0810uo(C0859vo c0859vo, zt0 zt0Var, InterfaceC0331iu interfaceC0331iu) {
        this.f6271d = 0;
        this.f6272e = zt0Var;
        this.f6273f = interfaceC0331iu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016a  */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0771to c0771to;
        C0526nu c0526nu;
        kd0 kd0Var;
        Object ks0Var;
        int i = this.f6271d;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        InterfaceC0322ik interfaceC0322ik2 = null;
        Object obj2 = this.f6272e;
        na1 na1Var = na1.f4229a;
        Object obj3 = this.f6273f;
        switch (i) {
            case 0:
                zt0 zt0Var = (zt0) obj2;
                if (interfaceC0322ik instanceof C0771to) {
                    c0771to = (C0771to) interfaceC0322ik;
                    int i2 = c0771to.f6022i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0771to.f6022i = i2 - Integer.MIN_VALUE;
                    } else {
                        c0771to = new C0771to(this, interfaceC0322ik);
                    }
                }
                Object obj4 = c0771to.f6020g;
                int i3 = c0771to.f6022i;
                if (i3 == 0) {
                    w60.m4891M(obj4);
                    Object obj5 = zt0Var.f7995d;
                    if (obj5 == o30.f4442l || !p30.m3002l(obj5, obj)) {
                        zt0Var.f7995d = obj;
                        c0771to.f6022i = 1;
                        if (((InterfaceC0331iu) obj3).mo827f(obj, c0771to) == enumC1007zk) {
                            return enumC1007zk;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj4);
                }
                return na1Var;
            case 1:
                if (interfaceC0322ik instanceof C0526nu) {
                    c0526nu = (C0526nu) interfaceC0322ik;
                    int i4 = c0526nu.f4340i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0526nu.f4340i = i4 - Integer.MIN_VALUE;
                    } else {
                        c0526nu = new C0526nu(this, interfaceC0322ik);
                    }
                }
                Object objInvoke = c0526nu.f4339h;
                int i5 = c0526nu.f4340i;
                if (i5 == 0) {
                    w60.m4891M(objInvoke);
                    c0526nu.f4338g = this;
                    c0526nu.f4342k = obj;
                    c0526nu.f4340i = 1;
                    objInvoke = ((InterfaceC0904ww) obj3).invoke(obj, c0526nu);
                    if (objInvoke == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i5 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c0526nu.f4342k;
                    this = c0526nu.f4338g;
                    w60.m4891M(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return na1Var;
                }
                ((zt0) this.f6272e).f7995d = obj;
                throw new C0000a(this);
            case 2:
                ld0 ld0Var = (ld0) obj2;
                LinkedHashMap linkedHashMap = ld0Var.f3420b;
                if (interfaceC0322ik instanceof kd0) {
                    kd0Var = (kd0) interfaceC0322ik;
                    int i6 = kd0Var.f3083h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kd0Var.f3083h = i6 - Integer.MIN_VALUE;
                    } else {
                        kd0Var = new kd0(this, interfaceC0322ik);
                    }
                }
                Object obj6 = kd0Var.f3082g;
                int i7 = kd0Var.f3083h;
                if (i7 == 0) {
                    w60.m4891M(obj6);
                    InterfaceC0331iu interfaceC0331iu = (InterfaceC0331iu) obj3;
                    f30 f30Var = (f30) obj;
                    if (f30Var instanceof js0) {
                        js0 js0Var = new js0(ok0.m2933d(((js0) f30Var).f2937a, ld0Var.f3419a));
                        linkedHashMap.put(f30Var, js0Var);
                        ks0Var = js0Var;
                    } else if (f30Var instanceof is0) {
                        is0 is0Var = (is0) f30Var;
                        js0 js0Var2 = (js0) linkedHashMap.remove(is0Var.f2615a);
                        ks0Var = is0Var;
                        if (js0Var2 != null) {
                            ks0Var = new is0(js0Var2);
                        }
                    } else {
                        boolean z = f30Var instanceof ks0;
                        ks0Var = f30Var;
                        if (z) {
                            ks0 ks0Var2 = (ks0) f30Var;
                            js0 js0Var3 = (js0) linkedHashMap.remove(ks0Var2.f3260a);
                            ks0Var = ks0Var2;
                            if (js0Var3 != null) {
                                ks0Var = new ks0(js0Var3);
                            }
                        }
                    }
                    kd0Var.f3083h = 1;
                    if (interfaceC0331iu.mo827f(ks0Var, kd0Var) == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i7 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj6);
                }
                return na1Var;
            case 3:
                f30 f30Var2 = (f30) obj;
                C0420l6 c0420l6 = (C0420l6) obj2;
                if (!(f30Var2 instanceof ls0)) {
                    InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj3;
                    C0206fe c0206fe = c0420l6.f3356w;
                    float f = 0.0f;
                    if (c0206fe == null) {
                        boolean z2 = c0420l6.f3352s;
                        C0769tm c0769tm = c0420l6.f3355v;
                        c0206fe = new C0206fe();
                        c0206fe.f1696a = z2;
                        c0206fe.f1697b = c0769tm;
                        c0206fe.f1698c = AbstractC0398kl.m1916b(0.0f);
                        c0206fe.f1699d = new ArrayList();
                        AbstractC0398kl.m1932r(c0420l6);
                        c0420l6.f3356w = c0206fe;
                    }
                    ArrayList arrayList = (ArrayList) c0206fe.f1699d;
                    if (f30Var2 instanceof C0264gz) {
                        arrayList.add(f30Var2);
                    } else if (f30Var2 instanceof C0301hz) {
                        arrayList.remove(((C0301hz) f30Var2).f2378a);
                    } else if (f30Var2 instanceof C0702ru) {
                        arrayList.add(f30Var2);
                    } else if (f30Var2 instanceof C0739su) {
                        arrayList.remove(((C0739su) f30Var2).f5836a);
                    } else if (f30Var2 instanceof C0440lq) {
                        arrayList.add(f30Var2);
                    } else if (f30Var2 instanceof C0483mq) {
                        arrayList.remove(((C0483mq) f30Var2).f4022a);
                    } else if (f30Var2 instanceof C0403kq) {
                        arrayList.remove(((C0403kq) f30Var2).f3258a);
                    }
                    f30 f30Var3 = (f30) AbstractC0960ye.m5247Q(arrayList);
                    if (!p30.m3002l((f30) c0206fe.f1700e, f30Var3)) {
                        if (f30Var3 != null) {
                            ((C0769tm) c0206fe.f1697b).invoke();
                            boolean z3 = f30Var3 instanceof C0264gz;
                            if (z3) {
                                f = 0.08f;
                            } else if (f30Var3 instanceof C0702ru) {
                                f = 0.1f;
                            } else if (f30Var3 instanceof C0440lq) {
                                f = 0.16f;
                            }
                            p91 p91Var = vv0.f6829a;
                            if (!z3 && ((f30Var3 instanceof C0702ru) || (f30Var3 instanceof C0440lq))) {
                                p91Var = new p91(45, AbstractC0102cr.f882b);
                            }
                            AbstractC0307i4.m1547w(interfaceC0966yk, null, new b41(c0206fe, f, p91Var, null), 3);
                        } else {
                            f30 f30Var4 = (f30) c0206fe.f1700e;
                            p91 p91Var2 = vv0.f6829a;
                            if (!(f30Var4 instanceof C0264gz) && !(f30Var4 instanceof C0702ru) && (f30Var4 instanceof C0440lq)) {
                                p91Var2 = new p91(150, AbstractC0102cr.f882b);
                            }
                            AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0154e(c0206fe, p91Var2, interfaceC0322ik2, 11), 3);
                        }
                        c0206fe.f1700e = f30Var3;
                    }
                } else if (c0420l6.f3359z) {
                    c0420l6.m1977w0((ls0) f30Var2);
                } else {
                    c0420l6.f3348A.m697a(f30Var2);
                }
                return na1Var;
            default:
                f30 f30Var5 = (f30) obj;
                xt0 xt0Var = (xt0) obj2;
                if (f30Var5 instanceof js0) {
                    xt0Var.f7423d++;
                } else if ((f30Var5 instanceof ks0) || (f30Var5 instanceof is0)) {
                    xt0Var.f7423d--;
                }
                boolean z4 = xt0Var.f7423d > 0;
                i81 i81Var = (i81) obj3;
                if (i81Var.f2485u != z4) {
                    i81Var.f2485u = z4;
                    v50.m4407m(i81Var);
                }
                return na1Var;
        }
    }

    public /* synthetic */ C0810uo(int i, Object obj, Object obj2, boolean z) {
        this.f6271d = i;
        this.f6272e = obj;
        this.f6273f = obj2;
    }

    public /* synthetic */ C0810uo(int i, Object obj, Object obj2) {
        this.f6271d = i;
        this.f6273f = obj;
        this.f6272e = obj2;
    }
}
