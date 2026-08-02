package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gi1 implements fi1 {

    /* JADX INFO: renamed from: h */
    public final Context f3533h;

    /* JADX INFO: renamed from: i */
    public s00 f3534i;

    /* JADX INFO: renamed from: j */
    public final jx1 f3535j = new jx1(1.0f);

    /* JADX INFO: renamed from: k */
    public zt2 f3536k;

    public gi1(Context context) {
        this.f3533h = context;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: k */
    public final a20 mo14k(a20 a20Var) {
        return xe1.m6120f0(this, a20Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: o */
    public final y10 mo15o(z10 z10Var) {
        return xe1.m6144u(this, z10Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: r */
    public final Object mo16r(mn0 mn0Var, Object obj) {
        return mn0Var.mo12g(obj, this);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: u */
    public final a20 mo17u(z10 z10Var) {
        return xe1.m6105W(this, z10Var);
    }

    @Override // p000.fi1
    /* JADX INFO: renamed from: v */
    public final float mo1656v() {
        t00 t00Var;
        hu2 hu2Var;
        if (this.f3536k == null) {
            Context context = this.f3533h;
            rk1 rk1Var = wf3.f12494a;
            synchronized (rk1Var) {
                try {
                    Object objM4505g = rk1Var.m4505g(context);
                    t00Var = null;
                    if (objM4505g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C0356jn c0356jnM1630a = fg1.m1630a(-1, 6, null);
                        yb2 yb2Var = new yb2(new vi2(contentResolver, uriFor, new vf3(c0356jnM1630a, AbstractC0691se.m4812A(Looper.getMainLooper())), c0356jnM1630a, context, (t00) null, 3));
                        mw2 mw2Var = new mw2(null);
                        c60 c60Var = o90.f7590a;
                        objM4505g = p40.m3710U(yb2Var, new s00(xe1.m6120f0(mw2Var, ie1.f4583a)), new fu2(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        rk1Var.m4511m(context, objM4505g);
                    }
                    hu2Var = (hu2) objM4505g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3535j.m2592h(((Number) hu2Var.getValue()).floatValue());
            s00 s00Var = this.f3534i;
            if (s00Var == null) {
                C0676s.m4653l("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f3536k = AbstractC0570p7.m3745A(s00Var, null, new C0003a2(hu2Var, this, t00Var, 15), 3);
        }
        return this.f3535j.m2591g();
    }
}
