package p000;

import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ef3 extends df3 {
    @Override // p000.df3
    /* JADX INFO: renamed from: a */
    public final int mo1012a() {
        return ((WindowInsetsController) this.f2035c).getSystemBarsBehavior();
    }

    @Override // p000.df3
    /* JADX INFO: renamed from: b */
    public final void mo1013b(boolean z) {
        ((WindowInsetsController) this.f2035c).setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // p000.df3
    /* JADX INFO: renamed from: c */
    public final void mo1014c(boolean z) {
        ((WindowInsetsController) this.f2035c).setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // p000.df3
    /* JADX INFO: renamed from: d */
    public final void mo1015d(int i) {
        ((WindowInsetsController) this.f2035c).setSystemBarsBehavior(i);
    }
}
