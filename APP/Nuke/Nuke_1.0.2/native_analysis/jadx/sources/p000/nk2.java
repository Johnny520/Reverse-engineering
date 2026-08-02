package p000;

import android.content.Context;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nk2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f7201l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f7202m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ cq1 f7203n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f7204o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f7205p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ xk1 f7206q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ xk1 f7207r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk2(cq1 cq1Var, boolean z, Context context, xk1 xk1Var, xk1 xk1Var2, t00 t00Var) {
        super(2, t00Var);
        this.f7203n = cq1Var;
        this.f7204o = z;
        this.f7205p = context;
        this.f7206q = xk1Var;
        this.f7207r = xk1Var2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((nk2) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        nk2 nk2Var = new nk2(this.f7203n, this.f7204o, this.f7205p, this.f7206q, this.f7207r, t00Var);
        nk2Var.f7202m = obj;
        return nk2Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        Object x92Var;
        cq1 cq1Var = this.f7203n;
        String str = cq1Var.f1675a;
        int i = this.f7201l;
        a83 a83Var = a83.f116a;
        try {
            if (i == 0) {
                fg1.m1627T(obj);
                boolean z = this.f7204o;
                sq1 sq1Var = sq1.f10305a;
                this.f7202m = null;
                this.f7201l = 1;
                Object objM4988n = sq1Var.m4988n(str, z, this);
                k20 k20Var = k20.f5323h;
                if (objM4988n == k20Var) {
                    return k20Var;
                }
            } else {
                if (i != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
            }
            x92Var = a83Var;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            boolean z2 = thM6237a instanceof bq1;
            xk1 xk1Var = this.f7207r;
            if (z2) {
                this.f7206q.setValue(new vy1(str, cq1Var.f1676b, ((bq1) thM6237a).f984h, true));
                xk1Var.setValue(null);
            } else {
                String message = thM6237a.getMessage();
                if (message == null) {
                    message = this.f7205p.getString(R.string.script_settings_change_state_failed);
                    message.getClass();
                }
                xk1Var.setValue(message);
            }
        }
        return a83Var;
    }
}
