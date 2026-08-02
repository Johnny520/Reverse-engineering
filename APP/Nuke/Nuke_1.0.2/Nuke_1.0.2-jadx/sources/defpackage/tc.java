package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tc extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public Object m;
    public int n;
    public Object o;
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(cq1 cq1Var, xk1 xk1Var, xk1 xk1Var2, Context context, xk1 xk1Var3, t00 t00Var) {
        super(2, t00Var);
        this.l = 3;
        this.o = cq1Var;
        this.r = xk1Var;
        this.s = xk1Var2;
        this.p = context;
        this.q = xk1Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((tc) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i) {
            case 0:
                tc tcVar = new tc((fq) this.p, (sc) this.q, (xk1) obj3, (xk1) obj2, t00Var);
                tcVar.m = obj;
                return tcVar;
            case 1:
                tc tcVar2 = new tc((gl1) obj3, (in0) obj2, t00Var, 1);
                tcVar2.q = obj;
                return tcVar2;
            case 2:
                tc tcVar3 = new tc((hl1) obj3, (in0) obj2, t00Var, 2);
                tcVar3.q = obj;
                return tcVar3;
            default:
                tc tcVar4 = new tc((cq1) this.o, (xk1) obj3, (xk1) obj2, (Context) this.p, (xk1) this.q, t00Var);
                tcVar4.m = obj;
                return tcVar4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x026e -> B:135:0x0272). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        j20 j20Var;
        in it;
        Object objB;
        dl1 dl1Var;
        gl1 gl1Var;
        il1 il1Var;
        in0 in0Var;
        gl1 gl1Var2;
        dl1 dl1Var2;
        gl1 gl1Var3;
        Object objJ;
        il1 il1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        in0 in0Var2;
        il1 il1Var3;
        el1 el1Var;
        hl1 hl1Var;
        hl1 hl1Var2;
        el1 el1Var2;
        Object objJ2;
        il1 il1Var4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        Object x92Var;
        int i = this.l;
        Object obj2 = a83.a;
        Object obj3 = this.r;
        k20 k20Var = k20.h;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                fq fqVar = (fq) this.p;
                int i2 = this.n;
                if (i2 == 0) {
                    fg1.T(obj);
                    j20Var = (j20) this.m;
                    it = fqVar.iterator();
                    this.m = j20Var;
                    this.o = it;
                    this.n = 1;
                    objB = it.b(this);
                    if (objB == k20Var) {
                    }
                    if (((Boolean) objB).booleanValue()) {
                    }
                } else {
                    if (i2 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (in) this.o;
                    j20Var = (j20) this.m;
                    fg1.T(obj);
                    objB = obj;
                    if (((Boolean) objB).booleanValue()) {
                        Object objC = it.c();
                        Object objM = fqVar.m();
                        if (objM instanceof oq) {
                            objM = null;
                        }
                        p7.A(j20Var, null, new k9(objM == null ? objC : objM, (sc) this.q, (xk1) obj3, (xk1) obj4, null, 1), 3);
                        this.m = j20Var;
                        this.o = it;
                        this.n = 1;
                        objB = it.b(this);
                        if (objB == k20Var) {
                            return k20Var;
                        }
                        if (((Boolean) objB).booleanValue()) {
                            return obj2;
                        }
                    }
                }
                break;
            case 1:
                gl1 gl1Var4 = (gl1) obj3;
                int i3 = this.n;
                try {
                    try {
                        if (i3 == 0) {
                            fg1.T(obj);
                            y10 y10VarO = ((j20) this.q).g().o(sn.K);
                            y10VarO.getClass();
                            dl1Var = new dl1(bl1.h, (k21) y10VarO);
                            gl1.a(gl1Var4, dl1Var);
                            kl1 kl1Var = gl1Var4.b;
                            in0 in0Var3 = (in0) obj4;
                            this.q = dl1Var;
                            this.o = kl1Var;
                            this.m = in0Var3;
                            this.p = gl1Var4;
                            this.n = 1;
                            if (kl1Var.d(this) == k20Var) {
                                return k20Var;
                            }
                            gl1Var = gl1Var4;
                            il1Var = kl1Var;
                            in0Var = in0Var3;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    s.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                gl1Var3 = (gl1) this.m;
                                il1Var2 = (il1) this.o;
                                dl1Var2 = (dl1) this.q;
                                try {
                                    fg1.T(obj);
                                    objJ = obj;
                                    atomicReference2 = gl1Var3.a;
                                    while (!atomicReference2.compareAndSet(dl1Var2, null) && atomicReference2.get() == dl1Var2) {
                                    }
                                    ((kl1) il1Var2).f(null);
                                    return objJ;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = gl1Var3.a;
                                    while (!atomicReference.compareAndSet(dl1Var2, null) && atomicReference.get() == dl1Var2) {
                                    }
                                    throw th;
                                }
                            }
                            gl1 gl1Var5 = (gl1) this.p;
                            in0Var = (in0) this.m;
                            il1 il1Var5 = (il1) this.o;
                            dl1 dl1Var3 = (dl1) this.q;
                            fg1.T(obj);
                            gl1Var = gl1Var5;
                            il1Var = il1Var5;
                            dl1Var = dl1Var3;
                        }
                        this.q = dl1Var;
                        this.o = il1Var;
                        this.m = gl1Var2;
                        this.p = null;
                        this.n = 2;
                        objJ = in0Var.j(this);
                        if (objJ == k20Var) {
                            return k20Var;
                        }
                        dl1Var2 = dl1Var;
                        il1Var2 = il1Var;
                        gl1Var3 = gl1Var2;
                        atomicReference2 = gl1Var3.a;
                        while (!atomicReference2.compareAndSet(dl1Var2, null)) {
                        }
                        ((kl1) il1Var2).f(null);
                        return objJ;
                    } catch (Throwable th2) {
                        th = th2;
                        dl1Var2 = dl1Var;
                        gl1Var3 = gl1Var2;
                        atomicReference = gl1Var3.a;
                        while (!atomicReference.compareAndSet(dl1Var2, null)) {
                        }
                        throw th;
                    }
                    gl1Var2 = gl1Var;
                } catch (Throwable th3) {
                    ((kl1) obj2).f(null);
                    throw th3;
                }
                break;
            case 2:
                hl1 hl1Var3 = (hl1) obj3;
                ?? r3 = this.n;
                try {
                    try {
                        if (r3 == 0) {
                            fg1.T(obj);
                            y10 y10VarO2 = ((j20) this.q).g().o(sn.K);
                            y10VarO2.getClass();
                            el1 el1Var3 = new el1((k21) y10VarO2);
                            AtomicReference atomicReference5 = hl1Var3.a;
                            while (true) {
                                el1 el1Var4 = (el1) atomicReference5.get();
                                if (el1Var4 != null) {
                                    cl1 cl1Var = cl1.h;
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
                                    el1Var4.a.c(new ks("Mutation interrupted", 1));
                                }
                                kl1 kl1Var2 = hl1Var3.b;
                                in0Var2 = (in0) obj4;
                                this.q = el1Var3;
                                this.o = kl1Var2;
                                this.m = in0Var2;
                                this.p = hl1Var3;
                                this.n = 1;
                                if (kl1Var2.d(this) == k20Var) {
                                    return k20Var;
                                }
                                il1Var3 = kl1Var2;
                                el1Var = el1Var3;
                            }
                        } else {
                            if (r3 != 1) {
                                if (r3 != 2) {
                                    s.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                hl1Var2 = (hl1) this.m;
                                il1Var4 = (il1) this.o;
                                el1Var2 = (el1) this.q;
                                try {
                                    fg1.T(obj);
                                    objJ2 = obj;
                                    atomicReference4 = hl1Var2.a;
                                    while (!atomicReference4.compareAndSet(el1Var2, null) && atomicReference4.get() == el1Var2) {
                                    }
                                    ((kl1) il1Var4).f(null);
                                    return objJ2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    atomicReference3 = hl1Var2.a;
                                    while (!atomicReference3.compareAndSet(el1Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            hl1Var3 = (hl1) this.p;
                            in0 in0Var4 = (in0) this.m;
                            il1 il1Var6 = (il1) this.o;
                            el1Var = (el1) this.q;
                            fg1.T(obj);
                            il1Var3 = il1Var6;
                            in0Var2 = in0Var4;
                        }
                        this.q = el1Var;
                        this.o = il1Var3;
                        this.m = hl1Var;
                        this.p = null;
                        this.n = 2;
                        objJ2 = in0Var2.j(this);
                        if (objJ2 == k20Var) {
                            return k20Var;
                        }
                        hl1Var2 = hl1Var;
                        el1Var2 = el1Var;
                        il1Var4 = il1Var3;
                        atomicReference4 = hl1Var2.a;
                        while (!atomicReference4.compareAndSet(el1Var2, null)) {
                        }
                        ((kl1) il1Var4).f(null);
                        return objJ2;
                    } catch (Throwable th5) {
                        th = th5;
                        hl1Var2 = hl1Var;
                        el1Var2 = el1Var;
                        atomicReference3 = hl1Var2.a;
                        while (!atomicReference3.compareAndSet(el1Var2, null) && atomicReference3.get() == el1Var2) {
                        }
                        throw th;
                    }
                    hl1Var = hl1Var3;
                } catch (Throwable th6) {
                    ((kl1) r3).f(null);
                    throw th6;
                }
                break;
            default:
                xk1 xk1Var = (xk1) obj4;
                int i4 = this.n;
                try {
                    if (i4 == 0) {
                        fg1.T(obj);
                        cq1 cq1Var = (cq1) this.o;
                        sq1 sq1Var = sq1.a;
                        String str = cq1Var.a;
                        this.m = null;
                        this.n = 1;
                        if (sq1Var.l(str, this) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i4 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
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
                Context context = (Context) this.p;
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.script_settings_revoke_failed);
                        message.getClass();
                    }
                    xk1Var.setValue(message);
                }
                ((xk1) this.q).setValue(Boolean.FALSE);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(fq fqVar, sc scVar, xk1 xk1Var, xk1 xk1Var2, t00 t00Var) {
        super(2, t00Var);
        this.l = 0;
        this.p = fqVar;
        this.q = scVar;
        this.r = xk1Var;
        this.s = xk1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(Object obj, in0 in0Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.r = obj;
        this.s = in0Var;
    }
}
