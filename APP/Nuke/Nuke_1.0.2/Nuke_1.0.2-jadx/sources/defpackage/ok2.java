package defpackage;

import android.content.Context;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends tw2 implements mn0 {
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;
    public final /* synthetic */ kf2 o;
    public final /* synthetic */ j31 p;
    public final /* synthetic */ xk1 q;
    public final /* synthetic */ xk1 r;
    public final /* synthetic */ xk1 s;
    public final /* synthetic */ Context t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(String str, kf2 kf2Var, j31 j31Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, Context context, t00 t00Var) {
        super(2, t00Var);
        this.n = str;
        this.o = kf2Var;
        this.p = j31Var;
        this.q = xk1Var;
        this.r = xk1Var2;
        this.s = xk1Var3;
        this.t = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((ok2) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        ok2 ok2Var = new ok2(this.n, this.o, this.p, this.q, this.r, this.s, this.t, t00Var);
        ok2Var.m = obj;
        return ok2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        Object x92Var;
        int i = this.l;
        try {
            if (i == 0) {
                fg1.T(obj);
                String str = this.n;
                kf2 kf2Var = this.o;
                j31 j31Var = this.p;
                sq1 sq1Var = sq1.a;
                String str2 = kf2Var.a;
                this.m = null;
                this.l = 1;
                obj = sq1Var.m(str, str2, j31Var, this);
                k20 k20Var = k20.h;
                if (obj == k20Var) {
                    return k20Var;
                }
            } else {
                if (i != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
            }
            x92Var = (uq1) obj;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        boolean z = x92Var instanceof x92;
        xk1 xk1Var = this.r;
        if (!z) {
            this.q.setValue((uq1) x92Var);
            xk1Var.setValue(null);
            this.s.setValue(null);
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = this.t.getString(R.string.script_settings_save_failed);
                message.getClass();
            }
            xk1Var.setValue(message);
        }
        return a83.a;
    }
}
