package androidx.core.view;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f6605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Interpolator f6606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f6607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6608;

    public AbstractC2275(int i, Interpolator interpolator, long j) {
        this.f6608 = i;
        this.f6606 = interpolator;
        this.f6605 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4253(float f) {
        this.f6607 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public int mo4254() {
        return this.f6608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo4255() {
        float f = this.f6607;
        Interpolator interpolator = this.f6606;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public long mo4256() {
        return this.f6605;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public float mo4257() {
        return 1.0f;
    }
}
