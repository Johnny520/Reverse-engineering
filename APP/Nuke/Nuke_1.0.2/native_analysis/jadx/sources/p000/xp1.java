package p000;

import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xp1 implements aa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mb3 f13104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13105b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Window f13106c;

    public xp1(mb3 mb3Var, int i, Window window) {
        this.f13104a = mb3Var;
        this.f13105b = i;
        this.f13106c = window;
    }

    @Override // p000.aa0
    /* JADX INFO: renamed from: a */
    public final void mo120a() {
        df3 df3Var = (df3) this.f13104a.f6554a;
        df3Var.mo1015d(this.f13105b);
        switch (df3Var.f2033a) {
            case 0:
                for (int i = 1; i <= 512; i <<= 1) {
                    if ((519 & i) != 0) {
                        if (i == 1) {
                            df3Var.m1017g(4);
                            df3Var.f2034b.clearFlags(1024);
                        } else if (i == 2) {
                            df3Var.m1017g(2);
                        } else if (i == 8) {
                            ((hh1) ((hh1) df3Var.f2035c).f4019i).mo1419G();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) df3Var.f2035c).show(519);
                break;
        }
        rd3.m4434a(this.f13106c, true);
    }
}
