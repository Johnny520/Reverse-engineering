package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f00 extends tw2 implements mn0 {
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g00 n;
    public final /* synthetic */ p83 o;
    public final /* synthetic */ vm p;
    public final /* synthetic */ long q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(g00 g00Var, p83 p83Var, vm vmVar, long j, t00 t00Var) {
        super(2, t00Var);
        this.n = g00Var;
        this.o = p83Var;
        this.p = vmVar;
        this.q = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((f00) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        f00 f00Var = new f00(this.n, this.o, this.p, this.q, t00Var);
        f00Var.m = obj;
        return f00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        g00 g00Var = this.n;
        lm lmVar = g00Var.z;
        int i = this.l;
        try {
            try {
                if (i == 0) {
                    fg1.T(obj);
                    k21 k21VarB = xe1.B(((j20) this.m).g());
                    g00Var.C = true;
                    im2 im2Var = g00Var.w;
                    bl1 bl1Var = bl1.h;
                    e00 e00Var = new e00(this.o, g00Var, this.p, this.q, k21VarB, null);
                    this.l = 1;
                    Object objF = im2Var.f(bl1Var, e00Var, this);
                    k20 k20Var = k20.h;
                    if (objF == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                lmVar.b();
                g00Var.C = false;
                lmVar.a(null);
                g00Var.A = false;
                return a83.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            g00Var.C = false;
            lmVar.a(null);
            g00Var.A = false;
            throw th;
        }
    }
}
