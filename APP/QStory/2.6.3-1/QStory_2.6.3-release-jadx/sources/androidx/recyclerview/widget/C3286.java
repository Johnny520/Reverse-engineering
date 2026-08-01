package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3286 extends C3292 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3285 f7648;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3286(C3285 c3285, Context context) {
        super(context);
        this.f7648 = c3285;
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo5384(int i) {
        return Math.min(100, super.mo5384(i));
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float mo5385(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C3292
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo5386(View view, C3356 c3356) {
        C3285 c3285 = this.f7648;
        int[] iArrM5380 = c3285.m5380(c3285.f7647.getLayoutManager(), view);
        int i = iArrM5380[0];
        int i2 = iArrM5380[1];
        int iCeil = (int) Math.ceil(((double) mo5384(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            c3356.f7951 = i;
            c3356.f7950 = i2;
            c3356.f7949 = iCeil;
            c3356.f7947 = this.f7672;
            c3356.f7946 = true;
        }
    }
}
