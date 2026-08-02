package defpackage;

import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ef3 extends df3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.df3
    public final int a() {
        return ((WindowInsetsController) this.c).getSystemBarsBehavior();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.df3
    public final void b(boolean z) {
        ((WindowInsetsController) this.c).setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.df3
    public final void c(boolean z) {
        ((WindowInsetsController) this.c).setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.df3
    public final void d(int i) {
        ((WindowInsetsController) this.c).setSystemBarsBehavior(i);
    }
}
