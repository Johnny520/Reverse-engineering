package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Interpolator f7947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7951;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5584(RecyclerView recyclerView) {
        int i = this.f7948;
        if (i >= 0) {
            this.f7948 = -1;
            recyclerView.m5264(i);
            this.f7946 = false;
            return;
        }
        if (!this.f7946) {
            this.f7952 = 0;
            return;
        }
        Interpolator interpolator = this.f7947;
        if (interpolator != null && this.f7949 < 1) {
            C6755.m11870("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.f7949;
        if (i2 < 1) {
            C6755.m11870("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f7585.m5455(this.f7951, this.f7950, i2, interpolator);
        int i3 = this.f7952 + 1;
        this.f7952 = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f7946 = false;
    }
}
