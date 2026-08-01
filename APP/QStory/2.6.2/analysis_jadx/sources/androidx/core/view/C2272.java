package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2272 extends AbstractC2275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WindowInsetsAnimation f6598;

    public C2272(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f6598 = windowInsetsAnimation;
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4243(float f) {
        this.f6598.setFraction(f);
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo4244() {
        return this.f6598.getTypeMask();
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo4245() {
        return this.f6598.getInterpolatedFraction();
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo4246() {
        return this.f6598.getDurationMillis();
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo4247() {
        return this.f6598.getAlpha();
    }
}
