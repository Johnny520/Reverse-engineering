package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gi1 implements fi1 {
    public final Context h;
    public s00 i;
    public final jx1 j = new jx1(1.0f);
    public zt2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gi1(Context context) {
        this.h = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 k(a20 a20Var) {
        return xe1.f0(this, a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final y10 o(z10 z10Var) {
        return xe1.u(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final Object r(mn0 mn0Var, Object obj) {
        return mn0Var.g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 u(z10 z10Var) {
        return xe1.W(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fi1
    public final float v() {
        t00 t00Var;
        hu2 hu2Var;
        if (this.k == null) {
            Context context = this.h;
            rk1 rk1Var = wf3.a;
            synchronized (rk1Var) {
                try {
                    Object objG = rk1Var.g(context);
                    t00Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        jn jnVarA = fg1.a(-1, 6, null);
                        yb2 yb2Var = new yb2(new vi2(contentResolver, uriFor, new vf3(jnVarA, se.A(Looper.getMainLooper())), jnVarA, context, (t00) null, 3));
                        mw2 mw2Var = new mw2(null);
                        c60 c60Var = o90.a;
                        objG = p40.U(yb2Var, new s00(xe1.f0(mw2Var, ie1.a)), new fu2(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        rk1Var.m(context, objG);
                    }
                    hu2Var = (hu2) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j.h(((Number) hu2Var.getValue()).floatValue());
            s00 s00Var = this.i;
            if (s00Var == null) {
                s.l("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.k = p7.A(s00Var, null, new a2(hu2Var, this, t00Var, 15), 3);
        }
        return this.j.g();
    }
}
