package defpackage;

import android.content.Context;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nk2 extends tw2 implements mn0 {
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cq1 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ xk1 q;
    public final /* synthetic */ xk1 r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk2(cq1 cq1Var, boolean z, Context context, xk1 xk1Var, xk1 xk1Var2, t00 t00Var) {
        super(2, t00Var);
        this.n = cq1Var;
        this.o = z;
        this.p = context;
        this.q = xk1Var;
        this.r = xk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((nk2) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        nk2 nk2Var = new nk2(this.n, this.o, this.p, this.q, this.r, t00Var);
        nk2Var.m = obj;
        return nk2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        Object x92Var;
        cq1 cq1Var = this.n;
        String str = cq1Var.a;
        int i = this.l;
        a83 a83Var = a83.a;
        try {
            if (i == 0) {
                fg1.T(obj);
                boolean z = this.o;
                sq1 sq1Var = sq1.a;
                this.m = null;
                this.l = 1;
                Object objN = sq1Var.n(str, z, this);
                k20 k20Var = k20.h;
                if (objN == k20Var) {
                    return k20Var;
                }
            } else {
                if (i != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
            }
            x92Var = a83Var;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            boolean z2 = thA instanceof bq1;
            xk1 xk1Var = this.r;
            if (z2) {
                this.q.setValue(new vy1(str, cq1Var.b, ((bq1) thA).h, true));
                xk1Var.setValue(null);
            } else {
                String message = thA.getMessage();
                if (message == null) {
                    message = this.p.getString(R.string.script_settings_change_state_failed);
                    message.getClass();
                }
                xk1Var.setValue(message);
            }
        }
        return a83Var;
    }
}
