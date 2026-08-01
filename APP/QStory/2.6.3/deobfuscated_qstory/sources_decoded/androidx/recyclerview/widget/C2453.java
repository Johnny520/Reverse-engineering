package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2453 extends C2459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2452 f7303;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2453(C2452 c2452, Context context) {
        super(context);
        this.f7303 = c2452;
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo4824(int i) {
        return Math.min(100, super.mo4824(i));
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float mo4825(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo4826(View view, C2523 c2523) {
        C2452 c2452 = this.f7303;
        int[] iArrM4820 = c2452.m4820(c2452.f7302.getLayoutManager(), view);
        int i = iArrM4820[0];
        int i2 = iArrM4820[1];
        int iCeil = (int) Math.ceil(((double) mo4824(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            c2523.f7606 = i;
            c2523.f7605 = i2;
            c2523.f7604 = iCeil;
            c2523.f7602 = this.f7327;
            c2523.f7601 = true;
        }
    }
}
