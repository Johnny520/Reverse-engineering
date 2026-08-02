package p000;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: tc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0729tc extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10669l;

    /* JADX INFO: renamed from: m */
    public Object f10670m;

    /* JADX INFO: renamed from: n */
    public int f10671n;

    /* JADX INFO: renamed from: o */
    public Object f10672o;

    /* JADX INFO: renamed from: p */
    public Object f10673p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f10674q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f10675r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f10676s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0729tc(cq1 cq1Var, xk1 xk1Var, xk1 xk1Var2, Context context, xk1 xk1Var3, t00 t00Var) {
        super(2, t00Var);
        this.f10669l = 3;
        this.f10672o = cq1Var;
        this.f10675r = xk1Var;
        this.f10676s = xk1Var2;
        this.f10673p = context;
        this.f10674q = xk1Var3;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f10669l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((C0729tc) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f10669l;
        Object obj2 = this.f10676s;
        Object obj3 = this.f10675r;
        switch (i) {
            case 0:
                C0729tc c0729tc = new C0729tc((InterfaceC0212fq) this.f10673p, (C0689sc) this.f10674q, (xk1) obj3, (xk1) obj2, t00Var);
                c0729tc.f10670m = obj;
                return c0729tc;
            case 1:
                C0729tc c0729tc2 = new C0729tc((gl1) obj3, (in0) obj2, t00Var, 1);
                c0729tc2.f10674q = obj;
                return c0729tc2;
            case 2:
                C0729tc c0729tc3 = new C0729tc((hl1) obj3, (in0) obj2, t00Var, 2);
                c0729tc3.f10674q = obj;
                return c0729tc3;
            default:
                C0729tc c0729tc4 = new C0729tc((cq1) this.f10672o, (xk1) obj3, (xk1) obj2, (Context) this.f10673p, (xk1) this.f10674q, t00Var);
                c0729tc4.f10670m = obj;
                return c0729tc4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x026e -> B:135:0x0272). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        j20 j20Var;
        C0319in it;
        Object objM2373b;
        dl1 dl1Var;
        gl1 gl1Var;
        il1 il1Var;
        in0 in0Var;
        gl1 gl1Var2;
        dl1 dl1Var2;
        gl1 gl1Var3;
        Object objMo5j;
        il1 il1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        in0 in0Var2;
        il1 il1Var3;
        el1 el1Var;
        hl1 hl1Var;
        hl1 hl1Var2;
        el1 el1Var2;
        Object objMo5j2;
        il1 il1Var4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        Object x92Var;
        int i = this.f10669l;
        Object obj2 = a83.f116a;
        Object obj3 = this.f10675r;
        k20 k20Var = k20.f5323h;
        Object obj4 = this.f10676s;
        switch (i) {
            case 0:
                InterfaceC0212fq interfaceC0212fq = (InterfaceC0212fq) this.f10673p;
                int i2 = this.f10671n;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    j20Var = (j20) this.f10670m;
                    it = interfaceC0212fq.iterator();
                    this.f10670m = j20Var;
                    this.f10672o = it;
                    this.f10671n = 1;
                    objM2373b = it.m2373b(this);
                    if (objM2373b == k20Var) {
                    }
                    if (((Boolean) objM2373b).booleanValue()) {
                    }
                } else {
                    if (i2 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (C0319in) this.f10672o;
                    j20Var = (j20) this.f10670m;
                    fg1.m1627T(obj);
                    objM2373b = obj;
                    if (((Boolean) objM2373b).booleanValue()) {
                        Object objM2374c = it.m2374c();
                        Object objMo1713m = interfaceC0212fq.mo1713m();
                        if (objMo1713m instanceof C0552oq) {
                            objMo1713m = null;
                        }
                        AbstractC0570p7.m3745A(j20Var, null, new C0379k9(objMo1713m == null ? objM2374c : objMo1713m, (C0689sc) this.f10674q, (xk1) obj3, (xk1) obj4, null, 1), 3);
                        this.f10670m = j20Var;
                        this.f10672o = it;
                        this.f10671n = 1;
                        objM2373b = it.m2373b(this);
                        if (objM2373b == k20Var) {
                            return k20Var;
                        }
                        if (((Boolean) objM2373b).booleanValue()) {
                            return obj2;
                        }
                    }
                }
                break;
            case 1:
                gl1 gl1Var4 = (gl1) obj3;
                int i3 = this.f10671n;
                try {
                    try {
                        if (i3 == 0) {
                            fg1.m1627T(obj);
                            y10 y10VarMo15o = ((j20) this.f10674q).mo705g().mo15o(C0700sn.f10207K);
                            y10VarMo15o.getClass();
                            dl1Var = new dl1(bl1.f932h, (k21) y10VarMo15o);
                            gl1.m1939a(gl1Var4, dl1Var);
                            kl1 kl1Var = gl1Var4.f3574b;
                            in0 in0Var3 = (in0) obj4;
                            this.f10674q = dl1Var;
                            this.f10672o = kl1Var;
                            this.f10670m = in0Var3;
                            this.f10673p = gl1Var4;
                            this.f10671n = 1;
                            if (kl1Var.m2720d(this) == k20Var) {
                                return k20Var;
                            }
                            gl1Var = gl1Var4;
                            il1Var = kl1Var;
                            in0Var = in0Var3;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                gl1Var3 = (gl1) this.f10670m;
                                il1Var2 = (il1) this.f10672o;
                                dl1Var2 = (dl1) this.f10674q;
                                try {
                                    fg1.m1627T(obj);
                                    objMo5j = obj;
                                    atomicReference2 = gl1Var3.f3573a;
                                    while (!atomicReference2.compareAndSet(dl1Var2, null) && atomicReference2.get() == dl1Var2) {
                                    }
                                    ((kl1) il1Var2).m2722f(null);
                                    return objMo5j;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = gl1Var3.f3573a;
                                    while (!atomicReference.compareAndSet(dl1Var2, null) && atomicReference.get() == dl1Var2) {
                                    }
                                    throw th;
                                }
                            }
                            gl1 gl1Var5 = (gl1) this.f10673p;
                            in0Var = (in0) this.f10670m;
                            il1 il1Var5 = (il1) this.f10672o;
                            dl1 dl1Var3 = (dl1) this.f10674q;
                            fg1.m1627T(obj);
                            gl1Var = gl1Var5;
                            il1Var = il1Var5;
                            dl1Var = dl1Var3;
                        }
                        this.f10674q = dl1Var;
                        this.f10672o = il1Var;
                        this.f10670m = gl1Var2;
                        this.f10673p = null;
                        this.f10671n = 2;
                        objMo5j = in0Var.mo5j(this);
                        if (objMo5j == k20Var) {
                            return k20Var;
                        }
                        dl1Var2 = dl1Var;
                        il1Var2 = il1Var;
                        gl1Var3 = gl1Var2;
                        atomicReference2 = gl1Var3.f3573a;
                        while (!atomicReference2.compareAndSet(dl1Var2, null)) {
                        }
                        ((kl1) il1Var2).m2722f(null);
                        return objMo5j;
                    } catch (Throwable th2) {
                        th = th2;
                        dl1Var2 = dl1Var;
                        gl1Var3 = gl1Var2;
                        atomicReference = gl1Var3.f3573a;
                        while (!atomicReference.compareAndSet(dl1Var2, null)) {
                        }
                        throw th;
                    }
                    gl1Var2 = gl1Var;
                } catch (Throwable th3) {
                    ((kl1) obj2).m2722f(null);
                    throw th3;
                }
                break;
            case 2:
                hl1 hl1Var3 = (hl1) obj3;
                ?? r3 = this.f10671n;
                try {
                    try {
                        if (r3 == 0) {
                            fg1.m1627T(obj);
                            y10 y10VarMo15o2 = ((j20) this.f10674q).mo705g().mo15o(C0700sn.f10207K);
                            y10VarMo15o2.getClass();
                            el1 el1Var3 = new el1((k21) y10VarMo15o2);
                            AtomicReference atomicReference5 = hl1Var3.f4071a;
                            while (true) {
                                el1 el1Var4 = (el1) atomicReference5.get();
                                if (el1Var4 != null) {
                                    cl1 cl1Var = cl1.f1614h;
                                    if (cl1Var.compareTo(cl1Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference5.compareAndSet(el1Var4, el1Var3)) {
                                    if (atomicReference5.get() != el1Var4) {
                                    }
                                    break;
                                }
                                if (el1Var4 != null) {
                                    el1Var4.f2496a.mo1704c(new C0398ks("Mutation interrupted", 1));
                                }
                                kl1 kl1Var2 = hl1Var3.f4072b;
                                in0Var2 = (in0) obj4;
                                this.f10674q = el1Var3;
                                this.f10672o = kl1Var2;
                                this.f10670m = in0Var2;
                                this.f10673p = hl1Var3;
                                this.f10671n = 1;
                                if (kl1Var2.m2720d(this) == k20Var) {
                                    return k20Var;
                                }
                                il1Var3 = kl1Var2;
                                el1Var = el1Var3;
                            }
                        } else {
                            if (r3 != 1) {
                                if (r3 != 2) {
                                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                hl1Var2 = (hl1) this.f10670m;
                                il1Var4 = (il1) this.f10672o;
                                el1Var2 = (el1) this.f10674q;
                                try {
                                    fg1.m1627T(obj);
                                    objMo5j2 = obj;
                                    atomicReference4 = hl1Var2.f4071a;
                                    while (!atomicReference4.compareAndSet(el1Var2, null) && atomicReference4.get() == el1Var2) {
                                    }
                                    ((kl1) il1Var4).m2722f(null);
                                    return objMo5j2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    atomicReference3 = hl1Var2.f4071a;
                                    while (!atomicReference3.compareAndSet(el1Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            hl1Var3 = (hl1) this.f10673p;
                            in0 in0Var4 = (in0) this.f10670m;
                            il1 il1Var6 = (il1) this.f10672o;
                            el1Var = (el1) this.f10674q;
                            fg1.m1627T(obj);
                            il1Var3 = il1Var6;
                            in0Var2 = in0Var4;
                        }
                        this.f10674q = el1Var;
                        this.f10672o = il1Var3;
                        this.f10670m = hl1Var;
                        this.f10673p = null;
                        this.f10671n = 2;
                        objMo5j2 = in0Var2.mo5j(this);
                        if (objMo5j2 == k20Var) {
                            return k20Var;
                        }
                        hl1Var2 = hl1Var;
                        el1Var2 = el1Var;
                        il1Var4 = il1Var3;
                        atomicReference4 = hl1Var2.f4071a;
                        while (!atomicReference4.compareAndSet(el1Var2, null)) {
                        }
                        ((kl1) il1Var4).m2722f(null);
                        return objMo5j2;
                    } catch (Throwable th5) {
                        th = th5;
                        hl1Var2 = hl1Var;
                        el1Var2 = el1Var;
                        atomicReference3 = hl1Var2.f4071a;
                        while (!atomicReference3.compareAndSet(el1Var2, null) && atomicReference3.get() == el1Var2) {
                        }
                        throw th;
                    }
                    hl1Var = hl1Var3;
                } catch (Throwable th6) {
                    ((kl1) r3).m2722f(null);
                    throw th6;
                }
                break;
            default:
                xk1 xk1Var = (xk1) obj4;
                int i4 = this.f10671n;
                try {
                    if (i4 == 0) {
                        fg1.m1627T(obj);
                        cq1 cq1Var = (cq1) this.f10672o;
                        sq1 sq1Var = sq1.f10305a;
                        String str = cq1Var.f1675a;
                        this.f10670m = null;
                        this.f10671n = 1;
                        if (sq1Var.m4986l(str, this) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i4 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    x92Var = obj2;
                    break;
                } catch (Throwable th7) {
                    x92Var = new x92(th7);
                }
                xk1 xk1Var2 = (xk1) obj3;
                if (!(x92Var instanceof x92)) {
                    xk1Var2.setValue(null);
                    xk1Var.setValue(null);
                }
                Context context = (Context) this.f10673p;
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    String message = thM6237a.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.script_settings_revoke_failed);
                        message.getClass();
                    }
                    xk1Var.setValue(message);
                }
                ((xk1) this.f10674q).setValue(Boolean.FALSE);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0729tc(InterfaceC0212fq interfaceC0212fq, C0689sc c0689sc, xk1 xk1Var, xk1 xk1Var2, t00 t00Var) {
        super(2, t00Var);
        this.f10669l = 0;
        this.f10673p = interfaceC0212fq;
        this.f10674q = c0689sc;
        this.f10675r = xk1Var;
        this.f10676s = xk1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0729tc(Object obj, in0 in0Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f10669l = i;
        this.f10675r = obj;
        this.f10676s = in0Var;
    }
}
