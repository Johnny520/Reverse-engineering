package yyds;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: yyds.ᛶᛷᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1384 extends C0785 {

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C2693 f6444 = C2693.m4783(null, WindowInsets.CONSUMED);

    public C1384(C2693 c2693, WindowInsets windowInsets) {
        super(c2693, windowInsets);
    }

    @Override // yyds.C2389, yyds.AbstractC2502, yyds.C2610
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C1870 mo2800(int i) {
        return C1870.m3655(this.f12318.getInsets(AbstractC2616.m4722(i)));
    }

    @Override // yyds.C2389, yyds.AbstractC2502
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public C1870 mo2801(int i) {
        return C1870.m3655(this.f12318.getInsetsIgnoringVisibility(AbstractC2616.m4722(i)));
    }

    @Override // yyds.AbstractC2502, yyds.C2610
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public void mo2802(View view) {
    }

    @Override // yyds.C2389, yyds.C2610
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean mo2803(int i) {
        return this.f12318.isVisible(AbstractC2616.m4722(i));
    }
}
