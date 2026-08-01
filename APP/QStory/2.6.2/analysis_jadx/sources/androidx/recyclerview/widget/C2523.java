package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7600;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Interpolator f7601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7605;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5014(RecyclerView recyclerView) {
        int i = this.f7602;
        if (i >= 0) {
            this.f7602 = -1;
            recyclerView.m4694(i);
            this.f7600 = false;
            return;
        }
        if (!this.f7600) {
            this.f7606 = 0;
            return;
        }
        Interpolator interpolator = this.f7601;
        if (interpolator != null && this.f7603 < 1) {
            C5919.m11250("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.f7603;
        if (i2 < 1) {
            C5919.m11250("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f7239.m4885(this.f7605, this.f7604, i2, interpolator);
        int i3 = this.f7606 + 1;
        this.f7606 = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f7600 = false;
    }
}
