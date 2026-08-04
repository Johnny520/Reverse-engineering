package yyds;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0366 extends C1384 {
    public C0366(C2693 c2693, WindowInsets windowInsets) {
        super(c2693, windowInsets);
    }

    @Override // yyds.AbstractC2502, yyds.C2610
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public List<Rect> mo1062(int i) {
        return this.f12318.getBoundingRects(AbstractC2616.m4722(i));
    }

    @Override // yyds.AbstractC2502, yyds.C2610
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public void mo1063() {
    }

    @Override // yyds.AbstractC2502, yyds.C2610
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public List<Rect> mo1064(int i) {
        return this.f12318.getBoundingRectsIgnoringVisibility(AbstractC2616.m4722(i));
    }
}
