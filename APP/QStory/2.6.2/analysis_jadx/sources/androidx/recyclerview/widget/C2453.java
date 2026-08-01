package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2453 extends C2459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2452 f7302;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2453(C2452 c2452, Context context) {
        super(context);
        this.f7302 = c2452;
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo4814(int i) {
        return Math.min(100, super.mo4814(i));
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float mo4815(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C2459
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo4816(View view, C2523 c2523) {
        C2452 c2452 = this.f7302;
        int[] iArrM4810 = c2452.m4810(c2452.f7301.getLayoutManager(), view);
        int i = iArrM4810[0];
        int i2 = iArrM4810[1];
        int iCeil = (int) Math.ceil(((double) mo4814(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            c2523.f7605 = i;
            c2523.f7604 = i2;
            c2523.f7603 = iCeil;
            c2523.f7601 = this.f7326;
            c2523.f7600 = true;
        }
    }
}
