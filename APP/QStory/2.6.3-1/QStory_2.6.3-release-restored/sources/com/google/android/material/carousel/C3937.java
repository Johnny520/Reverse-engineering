package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C3292;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3937 extends C3292 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f10528 = 1;

    public /* synthetic */ C3937(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public PointF mo5418(int i) {
        switch (this.f10528) {
            case 0:
                return null;
            default:
                return super.mo5418(i);
        }
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo5385(DisplayMetrics displayMetrics) {
        switch (this.f10528) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo5385(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public int mo5419(View view, int i) {
        switch (this.f10528) {
            case 0:
                return 0;
            default:
                return super.mo5419(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo5420(View view, int i) {
        switch (this.f10528) {
            case 0:
                return 0;
            default:
                return super.mo5420(view, i);
        }
    }

    public C3937(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
