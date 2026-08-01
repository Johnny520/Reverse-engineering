package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Interpolator f7602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7606;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5024(RecyclerView recyclerView) {
        int i = this.f7603;
        if (i >= 0) {
            this.f7603 = -1;
            recyclerView.m4704(i);
            this.f7601 = false;
            return;
        }
        if (!this.f7601) {
            this.f7607 = 0;
            return;
        }
        Interpolator interpolator = this.f7602;
        if (interpolator != null && this.f7604 < 1) {
            C5925.m11311("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.f7604;
        if (i2 < 1) {
            C5925.m11311("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f7240.m4895(this.f7606, this.f7605, i2, interpolator);
        int i3 = this.f7607 + 1;
        this.f7607 = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f7601 = false;
    }
}
