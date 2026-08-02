package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends tw2 implements mn0 {
    public il1 l;
    public Object m;
    public d60 n;
    public gl1 o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ bl1 r;
    public final /* synthetic */ gl1 s;
    public final /* synthetic */ b2 t;
    public final /* synthetic */ d60 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(bl1 bl1Var, gl1 gl1Var, b2 b2Var, d60 d60Var, t00 t00Var) {
        super(2, t00Var);
        this.r = bl1Var;
        this.s = gl1Var;
        this.t = b2Var;
        this.u = d60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((fl1) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        fl1 fl1Var = new fl1(this.r, this.s, this.t, this.u, t00Var);
        fl1Var.q = obj;
        return fl1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        dl1 dl1Var;
        gl1 gl1Var;
        mn0 mn0Var;
        d60 d60Var;
        il1 il1Var;
        Throwable th;
        dl1 dl1Var2;
        gl1 gl1Var2;
        il1 il1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.p;
        k20 k20Var = k20.h;
        try {
            try {
                if (i == 0) {
                    fg1.T(obj);
                    y10 y10VarO = ((j20) this.q).g().o(sn.K);
                    y10VarO.getClass();
                    dl1Var = new dl1(this.r, (k21) y10VarO);
                    gl1Var = this.s;
                    gl1.a(gl1Var, dl1Var);
                    kl1 kl1Var = gl1Var.b;
                    this.q = dl1Var;
                    this.l = kl1Var;
                    mn0Var = this.t;
                    this.m = mn0Var;
                    d60 d60Var2 = this.u;
                    this.n = d60Var2;
                    this.o = gl1Var;
                    this.p = 1;
                    if (kl1Var.d(this) != k20Var) {
                        d60Var = d60Var2;
                        il1Var = kl1Var;
                    }
                    return k20Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gl1Var2 = (gl1) this.m;
                    il1 il1Var3 = this.l;
                    dl1Var2 = (dl1) this.q;
                    try {
                        fg1.T(obj);
                        il1Var2 = il1Var3;
                        atomicReference2 = gl1Var2.a;
                        while (!atomicReference2.compareAndSet(dl1Var2, null) && atomicReference2.get() == dl1Var2) {
                        }
                        ((kl1) il1Var2).f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = gl1Var2.a;
                        while (!atomicReference.compareAndSet(dl1Var2, null)) {
                        }
                        throw th;
                    }
                }
                gl1 gl1Var3 = this.o;
                d60Var = this.n;
                mn0 mn0Var2 = (mn0) this.m;
                il1 il1Var4 = this.l;
                dl1 dl1Var3 = (dl1) this.q;
                fg1.T(obj);
                mn0Var = mn0Var2;
                il1Var = il1Var4;
                gl1Var = gl1Var3;
                dl1Var = dl1Var3;
                this.q = dl1Var;
                this.l = il1Var;
                this.m = gl1Var;
                this.n = null;
                this.o = null;
                this.p = 2;
                Object objG = mn0Var.g(d60Var, this);
                if (objG != k20Var) {
                    gl1 gl1Var4 = gl1Var;
                    obj = objG;
                    dl1Var2 = dl1Var;
                    gl1Var2 = gl1Var4;
                    il1Var2 = il1Var;
                    atomicReference2 = gl1Var2.a;
                    while (!atomicReference2.compareAndSet(dl1Var2, null)) {
                    }
                    ((kl1) il1Var2).f(null);
                    return obj;
                }
                return k20Var;
            } catch (Throwable th3) {
                gl1 gl1Var5 = gl1Var;
                th = th3;
                dl1Var2 = dl1Var;
                gl1Var2 = gl1Var5;
                atomicReference = gl1Var2.a;
                while (!atomicReference.compareAndSet(dl1Var2, null) && atomicReference.get() == dl1Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((kl1) 2).f(null);
            throw th4;
        }
    }
}
