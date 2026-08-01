package androidx.core.view;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3108 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f6950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Interpolator f6951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f6952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6953;

    public AbstractC3108(int i, Interpolator interpolator, long j) {
        this.f6953 = i;
        this.f6951 = interpolator;
        this.f6950 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4813(float f) {
        this.f6952 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public int mo4814() {
        return this.f6953;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo4815() {
        float f = this.f6952;
        Interpolator interpolator = this.f6951;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public long mo4816() {
        return this.f6950;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public float mo4817() {
        return 1.0f;
    }
}
