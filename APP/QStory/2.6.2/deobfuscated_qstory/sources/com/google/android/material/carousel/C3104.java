package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C2459;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3104 extends C2459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f10178 = 1;

    public /* synthetic */ C3104(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public PointF mo4848(int i) {
        switch (this.f10178) {
            case 0:
                return null;
            default:
                return super.mo4848(i);
        }
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo4815(DisplayMetrics displayMetrics) {
        switch (this.f10178) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo4815(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public int mo4849(View view, int i) {
        switch (this.f10178) {
            case 0:
                return 0;
            default:
                return super.mo4849(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo4850(View view, int i) {
        switch (this.f10178) {
            case 0:
                return 0;
            default:
                return super.mo4850(view, i);
        }
    }

    public C3104(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
