package androidx.core.view;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f6604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Interpolator f6605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f6606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6607;

    public AbstractC2275(int i, Interpolator interpolator, long j) {
        this.f6607 = i;
        this.f6605 = interpolator;
        this.f6604 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4243(float f) {
        this.f6606 = f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public int mo4244() {
        return this.f6607;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo4245() {
        float f = this.f6606;
        Interpolator interpolator = this.f6605;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public long mo4246() {
        return this.f6604;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public float mo4247() {
        return 1.0f;
    }
}
