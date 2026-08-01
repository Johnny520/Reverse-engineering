package p000;

import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0162e7 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1310h;

    /* JADX INFO: renamed from: i */
    public Object f1311i;

    /* JADX INFO: renamed from: j */
    public int f1312j;

    /* JADX INFO: renamed from: k */
    public Object f1313k;

    /* JADX INFO: renamed from: l */
    public Object f1314l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f1315m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1316n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f1317o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0162e7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f1310h = i;
        this.f1313k = obj;
        this.f1314l = obj2;
        this.f1315m = obj3;
        this.f1316n = obj4;
        this.f1317o = obj5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f1310h;
        Object obj2 = this.f1317o;
        Object obj3 = this.f1316n;
        switch (i) {
            case 0:
                C0162e7 c0162e7 = new C0162e7((InterfaceC0470md) this.f1314l, (C0045b7) this.f1315m, (oh0) obj3, (oh0) obj2, interfaceC0322ik);
                c0162e7.f1311i = obj;
                return c0162e7;
            case 1:
                C0162e7 c0162e72 = new C0162e7((bi0) obj3, (InterfaceC0742sw) obj2, interfaceC0322ik);
                c0162e72.f1315m = obj;
                return c0162e72;
            case 2:
                C0162e7 c0162e73 = new C0162e7((rr0) this.f1313k, (C0054bg) this.f1314l, (InterfaceC0742sw) this.f1315m, (InterfaceC0742sw) obj3, (C0017ag) obj2, interfaceC0322ik, 2);
                c0162e73.f1311i = obj;
                return c0162e73;
            default:
                C0162e7 c0162e74 = new C0162e7((zt0) this.f1313k, (ot0) this.f1314l, (x90) this.f1315m, (me1) obj3, (View) obj2, interfaceC0322ik, 3);
                c0162e74.f1311i = obj;
                return c0162e74;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1310h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((C0162e7) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x002a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x001c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0099 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [di0, int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [c40] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [c40] */
    /* JADX WARN: Type inference failed for: r2v35, types: [c40] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0219 -> B:111:0x021d). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) throws Throwable {
        InterfaceC0966yk interfaceC0966yk;
        C0797ub it;
        Object objM4292b;
        di0 di0Var;
        InterfaceC0742sw interfaceC0742sw;
        yh0 yh0Var;
        yh0 yh0Var2;
        Object objInvoke;
        di0 di0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.f1310h;
        ?? M1547w = 3;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f1317o;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        Object obj3 = this.f1316n;
        InterfaceC0322ik interfaceC0322ik = null;
        switch (i) {
            case 0:
                InterfaceC0470md interfaceC0470md = (InterfaceC0470md) this.f1314l;
                int i2 = this.f1312j;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    interfaceC0966yk = (InterfaceC0966yk) this.f1311i;
                    it = interfaceC0470md.iterator();
                    this.f1311i = interfaceC0966yk;
                    this.f1313k = it;
                    this.f1312j = 1;
                    objM4292b = it.m4292b(this);
                    if (objM4292b == enumC1007zk) {
                    }
                    if (((Boolean) objM4292b).booleanValue()) {
                    }
                } else {
                    if (i2 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (C0797ub) this.f1313k;
                    interfaceC0966yk = (InterfaceC0966yk) this.f1311i;
                    w60.m4891M(obj);
                    objM4292b = obj;
                    if (((Boolean) objM4292b).booleanValue()) {
                        Object objM4293c = it.m4293c();
                        Object objMo2494q = interfaceC0470md.mo2494q();
                        if (objMo2494q instanceof C0836vd) {
                            objMo2494q = null;
                        }
                        AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0119d7(objMo2494q == null ? objM4293c : objMo2494q, (C0045b7) this.f1315m, (oh0) obj3, (oh0) obj2, null, 0), 3);
                        this.f1311i = interfaceC0966yk;
                        this.f1313k = it;
                        this.f1312j = 1;
                        objM4292b = it.m4292b(this);
                        if (objM4292b == enumC1007zk) {
                            return enumC1007zk;
                        }
                        if (((Boolean) objM4292b).booleanValue()) {
                            return na1Var;
                        }
                    }
                }
                break;
            case 1:
                bi0 bi0Var = (bi0) obj3;
                ?? r2 = this.f1312j;
                try {
                    try {
                        if (r2 == 0) {
                            w60.m4891M(obj);
                            InterfaceC0515nk interfaceC0515nkMo64l = ((InterfaceC0966yk) this.f1315m).mo1328f().mo64l(C0496n2.f4129I);
                            interfaceC0515nkMo64l.getClass();
                            yh0 yh0Var3 = new yh0((c40) interfaceC0515nkMo64l);
                            AtomicReference atomicReference3 = bi0Var.f516a;
                            while (true) {
                                yh0 yh0Var4 = (yh0) atomicReference3.get();
                                if (yh0Var4 != null) {
                                    wh0 wh0Var = wh0.f7131d;
                                    if (wh0Var.compareTo(wh0Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(yh0Var4, yh0Var3)) {
                                    if (atomicReference3.get() != yh0Var4) {
                                    }
                                    break;
                                }
                                if (yh0Var4 != null) {
                                    yh0Var4.f7624a.mo478a(new C0052be("Mutation interrupted", 1));
                                }
                                di0 di0Var3 = bi0Var.f517b;
                                InterfaceC0742sw interfaceC0742sw2 = (InterfaceC0742sw) obj2;
                                this.f1315m = yh0Var3;
                                this.f1313k = di0Var3;
                                this.f1311i = interfaceC0742sw2;
                                this.f1314l = bi0Var;
                                this.f1312j = 1;
                                if (di0Var3.m712e(this) == enumC1007zk) {
                                    return enumC1007zk;
                                }
                                di0Var = di0Var3;
                                interfaceC0742sw = interfaceC0742sw2;
                                yh0Var = yh0Var3;
                            }
                        } else {
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                bi0Var = (bi0) this.f1311i;
                                di0Var2 = (di0) this.f1313k;
                                yh0Var2 = (yh0) this.f1315m;
                                try {
                                    w60.m4891M(obj);
                                    objInvoke = obj;
                                    atomicReference2 = bi0Var.f516a;
                                    while (!atomicReference2.compareAndSet(yh0Var2, null) && atomicReference2.get() == yh0Var2) {
                                    }
                                    di0Var2.m714g(null);
                                    return objInvoke;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = bi0Var.f516a;
                                    while (!atomicReference.compareAndSet(yh0Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            bi0Var = (bi0) this.f1314l;
                            interfaceC0742sw = (InterfaceC0742sw) this.f1311i;
                            di0Var = (di0) this.f1313k;
                            yh0Var = (yh0) this.f1315m;
                            w60.m4891M(obj);
                        }
                        this.f1315m = yh0Var;
                        this.f1313k = di0Var;
                        this.f1311i = bi0Var;
                        this.f1314l = null;
                        this.f1312j = 2;
                        objInvoke = interfaceC0742sw.invoke(this);
                        if (objInvoke == enumC1007zk) {
                            return enumC1007zk;
                        }
                        di0Var2 = di0Var;
                        yh0Var2 = yh0Var;
                        atomicReference2 = bi0Var.f516a;
                        while (!atomicReference2.compareAndSet(yh0Var2, null)) {
                        }
                        di0Var2.m714g(null);
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        yh0Var2 = yh0Var;
                        atomicReference = bi0Var.f516a;
                        while (!atomicReference.compareAndSet(yh0Var2, null) && atomicReference.get() == yh0Var2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    r2.m714g(null);
                    throw th3;
                }
            case 2:
                rr0 rr0Var = (rr0) this.f1313k;
                int i3 = this.f1312j;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    j61 j61Var = new j61((InterfaceC0966yk) this.f1311i, (C0054bg) this.f1314l, (InterfaceC0742sw) this.f1315m, (InterfaceC0742sw) obj3, (C0017ag) obj2, new hs0(rr0Var), null);
                    this.f1312j = 1;
                    return p30.m3005o(rr0Var, j61Var, this) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i3 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                me1 me1Var = (me1) obj3;
                x90 x90Var = (x90) this.f1315m;
                int i4 = this.f1312j;
                try {
                    if (i4 == 0) {
                        w60.m4891M(obj);
                        InterfaceC0966yk interfaceC0966yk2 = (InterfaceC0966yk) this.f1311i;
                        try {
                            yf0 yf0Var = (yf0) ((zt0) this.f1313k).f7995d;
                            if (yf0Var != null) {
                                x31 x31VarM2887a = oe1.m2887a(((View) obj2).getContext().getApplicationContext());
                                yf0Var.f7619d.m597h(((Number) x31VarM2887a.getValue()).floatValue());
                                M1547w = AbstractC0307i4.m1547w(interfaceC0966yk2, null, new C0154e(x31VarM2887a, yf0Var, interfaceC0322ik, 15), 3);
                            } else {
                                M1547w = 0;
                            }
                            ot0 ot0Var = (ot0) this.f1314l;
                            this.f1311i = M1547w;
                            this.f1312j = 1;
                            Object objM1522H = AbstractC0307i4.m1522H(ot0Var.f4631a, new lt0(ot0Var, new nt0(ot0Var, null), v50.m4406l(mo540e()), null), this);
                            if (objM1522H != enumC1007zk) {
                                objM1522H = na1Var;
                            }
                            if (objM1522H != enumC1007zk) {
                                objM1522H = na1Var;
                            }
                            if (objM1522H == enumC1007zk) {
                                return enumC1007zk;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            M1547w = 0;
                            if (M1547w != 0) {
                                M1547w.mo478a(null);
                            }
                            x90Var.getLifecycle().mo4015b(me1Var);
                            throw th;
                        }
                    } else {
                        if (i4 != 1) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        M1547w = (c40) this.f1311i;
                        w60.m4891M(obj);
                    }
                    if (M1547w != 0) {
                        M1547w.mo478a(null);
                    }
                    x90Var.getLifecycle().mo4015b(me1Var);
                    return na1Var;
                } catch (Throwable th5) {
                    th = th5;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162e7(bi0 bi0Var, InterfaceC0742sw interfaceC0742sw, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f1310h = 1;
        this.f1316n = bi0Var;
        this.f1317o = interfaceC0742sw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162e7(InterfaceC0470md interfaceC0470md, C0045b7 c0045b7, oh0 oh0Var, oh0 oh0Var2, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f1310h = 0;
        this.f1314l = interfaceC0470md;
        this.f1315m = c0045b7;
        this.f1316n = oh0Var;
        this.f1317o = oh0Var2;
    }
}
