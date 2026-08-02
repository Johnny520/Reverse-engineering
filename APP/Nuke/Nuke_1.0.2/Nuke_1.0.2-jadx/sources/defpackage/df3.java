package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class df3 {
    public final /* synthetic */ int a;
    public final Window b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public df3(Window window, hh1 hh1Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = window.getInsetsController();
                this.b = window;
                break;
            default:
                this.b = window;
                this.c = hh1Var;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final r92 f(r92 r92Var) {
        r92Var.getClass();
        p92 p92VarB = r92Var.b();
        u92 u92Var = r92Var.n;
        p92VarB.g = new h83(u92Var.e(), u92Var.c());
        return p92VarB.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a() {
        int i = this.a;
        Window window = this.b;
        switch (i) {
            case 0:
                Object tag = window.getDecorView().getTag(356039078);
                if (tag != null) {
                    return ((Integer) tag).intValue();
                }
                return 1;
            default:
                if (window == null) {
                    return ((WindowInsetsController) this.c).getSystemBarsBehavior();
                }
                Object tag2 = window.getDecorView().getTag(356039078);
                if (tag2 != null) {
                    return ((Integer) tag2).intValue();
                }
                return 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(boolean z) {
        int i = this.a;
        Window window = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    g(16);
                } else {
                    window.clearFlags(134217728);
                    window.addFlags(Integer.MIN_VALUE);
                    e(16);
                }
                break;
            default:
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
                    if (!z) {
                        windowInsetsController.setSystemBarsAppearance(0, 16);
                    } else {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                    }
                } else if (!z) {
                    g(16);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(boolean z) {
        int i = this.a;
        Window window = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    g(8192);
                } else {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    e(8192);
                }
                break;
            default:
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
                    if (!z) {
                        windowInsetsController.setSystemBarsAppearance(0, 8);
                    } else {
                        windowInsetsController.setSystemBarsAppearance(8, 8);
                    }
                } else if (!z) {
                    g(8192);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i) {
        int i2 = this.a;
        Window window = this.b;
        switch (i2) {
            case 0:
                window.getDecorView().setTag(356039078, Integer.valueOf(i));
                if (i == 0) {
                    g(6144);
                    break;
                } else if (i == 1) {
                    g(4096);
                    e(2048);
                    break;
                } else if (i == 2) {
                    g(2048);
                    e(4096);
                    break;
                }
                break;
            default:
                if (window == null) {
                    ((WindowInsetsController) this.c).setSystemBarsBehavior(i);
                    break;
                } else {
                    window.getDecorView().setTag(356039078, Integer.valueOf(i));
                    if (i == 0) {
                        g(6144);
                        break;
                    } else if (i == 1) {
                        g(4096);
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
                        break;
                    } else if (i == 2) {
                        g(2048);
                        View decorView2 = window.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        int i2 = this.a;
        Window window = this.b;
        switch (i2) {
            case 0:
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
                break;
        }
    }
}
