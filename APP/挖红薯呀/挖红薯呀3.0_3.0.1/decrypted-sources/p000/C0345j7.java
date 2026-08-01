package p000;

/* JADX INFO: renamed from: j7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0345j7 implements InterfaceC0331iu {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2763d;

    /* JADX INFO: renamed from: e */
    public final Object f2764e;

    /* JADX INFO: renamed from: f */
    public final Object f2765f;

    /* JADX INFO: renamed from: g */
    public final Object f2766g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0345j7(InterfaceC0331iu interfaceC0331iu, InterfaceC0618pk interfaceC0618pk) {
        this.f2763d = 2;
        this.f2764e = interfaceC0618pk;
        this.f2765f = s91.m4029P(interfaceC0618pk);
        this.f2766g = new C0154e(interfaceC0331iu, null, 13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0407ku c0407ku;
        int i = this.f2763d;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f2766g;
        Object obj3 = this.f2765f;
        Object obj4 = this.f2764e;
        switch (i) {
            case 0:
                b91 b91Var = (b91) obj3;
                ((ps0) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((InterfaceC0904ww) ((oh0) obj2).getValue()).invoke(b91Var.m328c(), b91Var.f462d.getValue())).booleanValue() : false));
                return na1Var;
            case 1:
                if (interfaceC0322ik instanceof C0407ku) {
                    c0407ku = (C0407ku) interfaceC0322ik;
                    int i2 = c0407ku.f3269k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0407ku.f3269k = i2 - Integer.MIN_VALUE;
                    } else {
                        c0407ku = new C0407ku(this, interfaceC0322ik);
                    }
                }
                Object objInvoke = c0407ku.f3267i;
                int i3 = c0407ku.f3269k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = c0407ku.f3266h;
                            this = c0407ku.f3265g;
                            w60.m4891M(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((vt0) this.f2764e).f6825d = true;
                                InterfaceC0331iu interfaceC0331iu = (InterfaceC0331iu) this.f2765f;
                                c0407ku.f3265g = null;
                                c0407ku.f3266h = null;
                                c0407ku.f3269k = 3;
                                if (interfaceC0331iu.mo827f(obj, c0407ku) == enumC1007zk) {
                                    return enumC1007zk;
                                }
                            }
                        } else if (i3 != 3) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    w60.m4891M(objInvoke);
                } else {
                    w60.m4891M(objInvoke);
                    if (((vt0) obj4).f6825d) {
                        c0407ku.f3269k = 1;
                        if (((InterfaceC0331iu) obj3).mo827f(obj, c0407ku) == enumC1007zk) {
                            return enumC1007zk;
                        }
                    } else {
                        c0407ku.f3265g = this;
                        c0407ku.f3266h = obj;
                        c0407ku.f3269k = 2;
                        objInvoke = ((kt0) obj2).invoke(obj, c0407ku);
                        if (objInvoke == enumC1007zk) {
                            return enumC1007zk;
                        }
                        if (!((Boolean) objInvoke).booleanValue()) {
                        }
                    }
                }
                return na1Var;
            default:
                Object objM1913D = AbstractC0398kl.m1913D((InterfaceC0618pk) obj4, obj, obj3, (C0154e) obj2, interfaceC0322ik);
                return objM1913D == enumC1007zk ? objM1913D : na1Var;
        }
    }

    public /* synthetic */ C0345j7(Object obj, Object obj2, Object obj3, int i) {
        this.f2763d = i;
        this.f2764e = obj;
        this.f2765f = obj2;
        this.f2766g = obj3;
    }
}
