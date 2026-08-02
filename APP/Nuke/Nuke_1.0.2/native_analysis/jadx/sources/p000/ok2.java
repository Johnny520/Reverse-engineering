package p000;

import android.content.Context;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f7704l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f7705m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f7706n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ kf2 f7707o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ j31 f7708p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ xk1 f7709q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ xk1 f7710r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ xk1 f7711s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Context f7712t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(String str, kf2 kf2Var, j31 j31Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, Context context, t00 t00Var) {
        super(2, t00Var);
        this.f7706n = str;
        this.f7707o = kf2Var;
        this.f7708p = j31Var;
        this.f7709q = xk1Var;
        this.f7710r = xk1Var2;
        this.f7711s = xk1Var3;
        this.f7712t = context;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((ok2) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        ok2 ok2Var = new ok2(this.f7706n, this.f7707o, this.f7708p, this.f7709q, this.f7710r, this.f7711s, this.f7712t, t00Var);
        ok2Var.f7705m = obj;
        return ok2Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        Object x92Var;
        int i = this.f7704l;
        try {
            if (i == 0) {
                fg1.m1627T(obj);
                String str = this.f7706n;
                kf2 kf2Var = this.f7707o;
                j31 j31Var = this.f7708p;
                sq1 sq1Var = sq1.f10305a;
                String str2 = kf2Var.f5499a;
                this.f7705m = null;
                this.f7704l = 1;
                obj = sq1Var.m4987m(str, str2, j31Var, this);
                k20 k20Var = k20.f5323h;
                if (obj == k20Var) {
                    return k20Var;
                }
            } else {
                if (i != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
            }
            x92Var = (uq1) obj;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        boolean z = x92Var instanceof x92;
        xk1 xk1Var = this.f7710r;
        if (!z) {
            this.f7709q.setValue((uq1) x92Var);
            xk1Var.setValue(null);
            this.f7711s.setValue(null);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            String message = thM6237a.getMessage();
            if (message == null) {
                message = this.f7712t.getString(R.string.script_settings_save_failed);
                message.getClass();
            }
            xk1Var.setValue(message);
        }
        return a83.f116a;
    }
}
