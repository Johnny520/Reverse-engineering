package defpackage;

import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xp1 implements aa0 {
    public final /* synthetic */ mb3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Window c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xp1(mb3 mb3Var, int i, Window window) {
        this.a = mb3Var;
        this.b = i;
        this.c = window;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aa0
    public final void a() {
        df3 df3Var = (df3) this.a.a;
        df3Var.d(this.b);
        switch (df3Var.a) {
            case 0:
                for (int i = 1; i <= 512; i <<= 1) {
                    if ((519 & i) != 0) {
                        if (i == 1) {
                            df3Var.g(4);
                            df3Var.b.clearFlags(1024);
                        } else if (i == 2) {
                            df3Var.g(2);
                        } else if (i == 8) {
                            ((hh1) ((hh1) df3Var.c).i).G();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) df3Var.c).show(519);
                break;
        }
        rd3.a(this.c, true);
    }
}
