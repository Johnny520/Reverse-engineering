package yyds;

import android.view.WindowInsetsController;

/* JADX INFO: renamed from: yyds.ᲇᛲᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2393 extends C0119 {
    @Override // yyds.C0119
    /* JADX INFO: renamed from: ᛶᲀᲈᲇ */
    public final void mo558() {
        ((WindowInsetsController) this.f812).setSystemBarsBehavior(2);
    }

    @Override // yyds.C0119
    /* JADX INFO: renamed from: ᛸᛴᛵᛶ */
    public final void mo565(boolean z) {
        ((WindowInsetsController) this.f812).setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // yyds.C0119
    /* JADX INFO: renamed from: ᲁᛶᛴᛸ */
    public final void mo568(boolean z) {
        ((WindowInsetsController) this.f812).setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
