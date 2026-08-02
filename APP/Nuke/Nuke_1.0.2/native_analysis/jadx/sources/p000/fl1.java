package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public il1 f3037l;

    /* JADX INFO: renamed from: m */
    public Object f3038m;

    /* JADX INFO: renamed from: n */
    public d60 f3039n;

    /* JADX INFO: renamed from: o */
    public gl1 f3040o;

    /* JADX INFO: renamed from: p */
    public int f3041p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f3042q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ bl1 f3043r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ gl1 f3044s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0040b2 f3045t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ d60 f3046u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(bl1 bl1Var, gl1 gl1Var, C0040b2 c0040b2, d60 d60Var, t00 t00Var) {
        super(2, t00Var);
        this.f3043r = bl1Var;
        this.f3044s = gl1Var;
        this.f3045t = c0040b2;
        this.f3046u = d60Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((fl1) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        fl1 fl1Var = new fl1(this.f3043r, this.f3044s, this.f3045t, this.f3046u, t00Var);
        fl1Var.f3042q = obj;
        return fl1Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
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
        int i = this.f3041p;
        k20 k20Var = k20.f5323h;
        try {
            try {
                if (i == 0) {
                    fg1.m1627T(obj);
                    y10 y10VarMo15o = ((j20) this.f3042q).mo705g().mo15o(C0700sn.f10207K);
                    y10VarMo15o.getClass();
                    dl1Var = new dl1(this.f3043r, (k21) y10VarMo15o);
                    gl1Var = this.f3044s;
                    gl1.m1939a(gl1Var, dl1Var);
                    kl1 kl1Var = gl1Var.f3574b;
                    this.f3042q = dl1Var;
                    this.f3037l = kl1Var;
                    mn0Var = this.f3045t;
                    this.f3038m = mn0Var;
                    d60 d60Var2 = this.f3046u;
                    this.f3039n = d60Var2;
                    this.f3040o = gl1Var;
                    this.f3041p = 1;
                    if (kl1Var.m2720d(this) != k20Var) {
                        d60Var = d60Var2;
                        il1Var = kl1Var;
                    }
                    return k20Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gl1Var2 = (gl1) this.f3038m;
                    il1 il1Var3 = this.f3037l;
                    dl1Var2 = (dl1) this.f3042q;
                    try {
                        fg1.m1627T(obj);
                        il1Var2 = il1Var3;
                        atomicReference2 = gl1Var2.f3573a;
                        while (!atomicReference2.compareAndSet(dl1Var2, null) && atomicReference2.get() == dl1Var2) {
                        }
                        ((kl1) il1Var2).m2722f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = gl1Var2.f3573a;
                        while (!atomicReference.compareAndSet(dl1Var2, null)) {
                        }
                        throw th;
                    }
                }
                gl1 gl1Var3 = this.f3040o;
                d60Var = this.f3039n;
                mn0 mn0Var2 = (mn0) this.f3038m;
                il1 il1Var4 = this.f3037l;
                dl1 dl1Var3 = (dl1) this.f3042q;
                fg1.m1627T(obj);
                mn0Var = mn0Var2;
                il1Var = il1Var4;
                gl1Var = gl1Var3;
                dl1Var = dl1Var3;
                this.f3042q = dl1Var;
                this.f3037l = il1Var;
                this.f3038m = gl1Var;
                this.f3039n = null;
                this.f3040o = null;
                this.f3041p = 2;
                Object objMo12g = mn0Var.mo12g(d60Var, this);
                if (objMo12g != k20Var) {
                    gl1 gl1Var4 = gl1Var;
                    obj = objMo12g;
                    dl1Var2 = dl1Var;
                    gl1Var2 = gl1Var4;
                    il1Var2 = il1Var;
                    atomicReference2 = gl1Var2.f3573a;
                    while (!atomicReference2.compareAndSet(dl1Var2, null)) {
                    }
                    ((kl1) il1Var2).m2722f(null);
                    return obj;
                }
                return k20Var;
            } catch (Throwable th3) {
                gl1 gl1Var5 = gl1Var;
                th = th3;
                dl1Var2 = dl1Var;
                gl1Var2 = gl1Var5;
                atomicReference = gl1Var2.f3573a;
                while (!atomicReference.compareAndSet(dl1Var2, null) && atomicReference.get() == dl1Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((kl1) 2).m2722f(null);
            throw th4;
        }
    }
}
