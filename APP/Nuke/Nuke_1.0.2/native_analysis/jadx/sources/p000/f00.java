package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f00 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f2702l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f2703m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ g00 f2704n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ p83 f2705o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0815vm f2706p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long f2707q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(g00 g00Var, p83 p83Var, InterfaceC0815vm interfaceC0815vm, long j, t00 t00Var) {
        super(2, t00Var);
        this.f2704n = g00Var;
        this.f2705o = p83Var;
        this.f2706p = interfaceC0815vm;
        this.f2707q = j;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((f00) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        f00 f00Var = new f00(this.f2704n, this.f2705o, this.f2706p, this.f2707q, t00Var);
        f00Var.f2703m = obj;
        return f00Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        g00 g00Var = this.f2704n;
        C0429lm c0429lm = g00Var.f3217z;
        int i = this.f2702l;
        try {
            try {
                if (i == 0) {
                    fg1.m1627T(obj);
                    k21 k21VarM6084B = xe1.m6084B(((j20) this.f2703m).mo705g());
                    g00Var.f3212C = true;
                    im2 im2Var = g00Var.f3214w;
                    bl1 bl1Var = bl1.f932h;
                    e00 e00Var = new e00(this.f2705o, g00Var, this.f2706p, this.f2707q, k21VarM6084B, null);
                    this.f2702l = 1;
                    Object objM2369f = im2Var.m2369f(bl1Var, e00Var, this);
                    k20 k20Var = k20.f5323h;
                    if (objM2369f == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                c0429lm.m2942b();
                g00Var.f3212C = false;
                c0429lm.m2941a(null);
                g00Var.f3210A = false;
                return a83.f116a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            g00Var.f3212C = false;
            c0429lm.m2941a(null);
            g00Var.f3210A = false;
            throw th;
        }
    }
}
