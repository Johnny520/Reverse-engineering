package yyds;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: yyds.ᲇᛱᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2389 extends AbstractC1701 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C2693 f11794 = C2693.m4783(null, WindowInsets.CONSUMED);

    public C2389(C2693 c2693, WindowInsets windowInsets) {
        super(c2693, windowInsets);
    }

    @Override // yyds.AbstractC2502, yyds.C2610
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public C1870 mo2800(int i) {
        return C1870.m3655(this.f12318.getInsets(AbstractC2220.m4210(i)));
    }

    @Override // yyds.AbstractC2502
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    public C1870 mo2801(int i) {
        return C1870.m3655(this.f12318.getInsetsIgnoringVisibility(AbstractC2220.m4210(i)));
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public boolean mo2803(int i) {
        return this.f12318.isVisible(AbstractC2220.m4210(i));
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo4430(View view) {
    }
}
