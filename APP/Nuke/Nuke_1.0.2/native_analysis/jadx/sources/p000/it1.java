package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class it1 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ht1 f4776a;

    public it1(ht1 ht1Var) {
        this.f4776a = ht1Var;
    }

    public final void onBackCancelled() {
        ht1 ht1Var = this.f4776a;
        fm1 fm1Var = ht1Var.f5105a;
        if (fm1Var == null) {
            C0676s.m4653l("This input is not added to any dispatcher.");
            return;
        }
        if (!ht1Var.f5106b) {
            fm1Var.m1665d(ht1Var, null);
        }
        km1 km1Var = fm1Var.f3056b;
        km1Var.getClass();
        if (ht1Var.equals(km1Var.f5644h) && -1 == km1Var.f5643g) {
            hm1 hm1VarM2725c = km1Var.f5642f;
            if (hm1VarM2725c == null) {
                hm1VarM2725c = km1Var.m2725c(-1);
            }
            km1Var.f5642f = null;
            km1Var.f5643g = 0;
            km1Var.f5644h = null;
            if (hm1VarM2725c != null) {
                hm1VarM2725c.mo1356a();
            }
            ju2 ju2Var = km1Var.f5637a;
            lm1 lm1Var = lm1.f6196f;
            ju2Var.getClass();
            ju2Var.m2576h(null, lm1Var);
        }
        ht1Var.f5106b = false;
    }

    public final void onBackInvoked() {
        this.f4776a.m2515a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        em1 em1VarM1632e = fg1.m1632e(backEvent);
        ht1 ht1Var = this.f4776a;
        fm1 fm1Var = ht1Var.f5105a;
        if (fm1Var == null) {
            C0676s.m4653l("This input is not added to any dispatcher.");
            return;
        }
        if (ht1Var.f5106b) {
            km1 km1Var = fm1Var.f3056b;
            km1Var.getClass();
            if (ht1Var.equals(km1Var.f5644h) && -1 == km1Var.f5643g) {
                hm1 hm1VarM2725c = km1Var.f5642f;
                if (hm1VarM2725c == null) {
                    hm1VarM2725c = km1Var.m2725c(-1);
                }
                if (hm1VarM2725c != null) {
                    hm1VarM2725c.mo1358c(em1VarM1632e);
                }
                ju2 ju2Var = km1Var.f5637a;
                mm1 mm1Var = new mm1(em1VarM1632e);
                ju2Var.getClass();
                ju2Var.m2576h(null, mm1Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        em1 em1VarM1632e = fg1.m1632e(backEvent);
        ht1 ht1Var = this.f4776a;
        fm1 fm1Var = ht1Var.f5105a;
        if (fm1Var == null) {
            C0676s.m4653l("This input is not added to any dispatcher.");
        } else {
            if (ht1Var.f5106b) {
                return;
            }
            fm1Var.m1665d(ht1Var, em1VarM1632e);
            ht1Var.f5106b = true;
        }
    }
}
