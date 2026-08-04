package yyds;

import android.view.WindowInsets;

/* JADX INFO: renamed from: yyds.ᛸᲁᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1878 extends AbstractC2502 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C1870 f9468;

    public AbstractC1878(C2693 c2693, WindowInsets windowInsets) {
        super(c2693, windowInsets);
        this.f9468 = null;
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean mo3671() {
        return this.f12318.isConsumed();
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C1870 mo3672() {
        C1870 c1870 = this.f9468;
        if (c1870 != null) {
            return c1870;
        }
        WindowInsets windowInsets = this.f12318;
        C1870 c1870M3654 = C1870.m3654(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.f9468 = c1870M3654;
        return c1870M3654;
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C2693 mo3673() {
        return C2693.m4783(null, this.f12318.consumeStableInsets());
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2693 mo3674() {
        return C2693.m4783(null, this.f12318.consumeSystemWindowInsets());
    }
}
