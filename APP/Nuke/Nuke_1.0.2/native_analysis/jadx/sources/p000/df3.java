package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class df3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2033a;

    /* JADX INFO: renamed from: b */
    public final Window f2034b;

    /* JADX INFO: renamed from: c */
    public final Object f2035c;

    public df3(Window window, hh1 hh1Var, int i) {
        this.f2033a = i;
        switch (i) {
            case 1:
                this.f2035c = window.getInsetsController();
                this.f2034b = window;
                break;
            default:
                this.f2034b = window;
                this.f2035c = hh1Var;
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final r92 m1011f(r92 r92Var) {
        r92Var.getClass();
        p92 p92VarM4416b = r92Var.m4416b();
        u92 u92Var = r92Var.f9462n;
        p92VarM4416b.f8050g = new h83(u92Var.mo274e(), u92Var.mo273c());
        return p92VarM4416b.m3830a();
    }

    /* JADX INFO: renamed from: a */
    public int mo1012a() {
        int i = this.f2033a;
        Window window = this.f2034b;
        switch (i) {
            case 0:
                Object tag = window.getDecorView().getTag(356039078);
                if (tag != null) {
                    return ((Integer) tag).intValue();
                }
                return 1;
            default:
                if (window == null) {
                    return ((WindowInsetsController) this.f2035c).getSystemBarsBehavior();
                }
                Object tag2 = window.getDecorView().getTag(356039078);
                if (tag2 != null) {
                    return ((Integer) tag2).intValue();
                }
                return 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1013b(boolean z) {
        int i = this.f2033a;
        Window window = this.f2034b;
        switch (i) {
            case 0:
                if (!z) {
                    m1017g(16);
                } else {
                    window.clearFlags(134217728);
                    window.addFlags(Integer.MIN_VALUE);
                    m1016e(16);
                }
                break;
            default:
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.f2035c;
                    if (!z) {
                        windowInsetsController.setSystemBarsAppearance(0, 16);
                    } else {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                    }
                } else if (!z) {
                    m1017g(16);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1014c(boolean z) {
        int i = this.f2033a;
        Window window = this.f2034b;
        switch (i) {
            case 0:
                if (!z) {
                    m1017g(8192);
                } else {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    m1016e(8192);
                }
                break;
            default:
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.f2035c;
                    if (!z) {
                        windowInsetsController.setSystemBarsAppearance(0, 8);
                    } else {
                        windowInsetsController.setSystemBarsAppearance(8, 8);
                    }
                } else if (!z) {
                    m1017g(8192);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo1015d(int i) {
        int i2 = this.f2033a;
        Window window = this.f2034b;
        switch (i2) {
            case 0:
                window.getDecorView().setTag(356039078, Integer.valueOf(i));
                if (i == 0) {
                    m1017g(6144);
                    break;
                } else if (i == 1) {
                    m1017g(4096);
                    m1016e(2048);
                    break;
                } else if (i == 2) {
                    m1017g(2048);
                    m1016e(4096);
                    break;
                }
                break;
            default:
                if (window == null) {
                    ((WindowInsetsController) this.f2035c).setSystemBarsBehavior(i);
                    break;
                } else {
                    window.getDecorView().setTag(356039078, Integer.valueOf(i));
                    if (i == 0) {
                        m1017g(6144);
                        break;
                    } else if (i == 1) {
                        m1017g(4096);
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
                        break;
                    } else if (i == 2) {
                        m1017g(2048);
                        View decorView2 = window.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1016e(int i) {
        View decorView = this.f2034b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: g */
    public final void m1017g(int i) {
        int i2 = this.f2033a;
        Window window = this.f2034b;
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
