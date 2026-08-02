package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class it1 implements OnBackAnimationCallback {
    public final /* synthetic */ ht1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public it1(ht1 ht1Var) {
        this.a = ht1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackCancelled() {
        ht1 ht1Var = this.a;
        fm1 fm1Var = ht1Var.a;
        if (fm1Var == null) {
            s.l("This input is not added to any dispatcher.");
            return;
        }
        if (!ht1Var.b) {
            fm1Var.d(ht1Var, null);
        }
        km1 km1Var = fm1Var.b;
        km1Var.getClass();
        if (ht1Var.equals(km1Var.h) && -1 == km1Var.g) {
            hm1 hm1VarC = km1Var.f;
            if (hm1VarC == null) {
                hm1VarC = km1Var.c(-1);
            }
            km1Var.f = null;
            km1Var.g = 0;
            km1Var.h = null;
            if (hm1VarC != null) {
                hm1VarC.a();
            }
            ju2 ju2Var = km1Var.a;
            lm1 lm1Var = lm1.f;
            ju2Var.getClass();
            ju2Var.h(null, lm1Var);
        }
        ht1Var.b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackInvoked() {
        this.a.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        em1 em1VarE = fg1.e(backEvent);
        ht1 ht1Var = this.a;
        fm1 fm1Var = ht1Var.a;
        if (fm1Var == null) {
            s.l("This input is not added to any dispatcher.");
            return;
        }
        if (ht1Var.b) {
            km1 km1Var = fm1Var.b;
            km1Var.getClass();
            if (ht1Var.equals(km1Var.h) && -1 == km1Var.g) {
                hm1 hm1VarC = km1Var.f;
                if (hm1VarC == null) {
                    hm1VarC = km1Var.c(-1);
                }
                if (hm1VarC != null) {
                    hm1VarC.c(em1VarE);
                }
                ju2 ju2Var = km1Var.a;
                mm1 mm1Var = new mm1(em1VarE);
                ju2Var.getClass();
                ju2Var.h(null, mm1Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        em1 em1VarE = fg1.e(backEvent);
        ht1 ht1Var = this.a;
        fm1 fm1Var = ht1Var.a;
        if (fm1Var == null) {
            s.l("This input is not added to any dispatcher.");
        } else {
            if (ht1Var.b) {
                return;
            }
            fm1Var.d(ht1Var, em1VarE);
            ht1Var.b = true;
        }
    }
}
