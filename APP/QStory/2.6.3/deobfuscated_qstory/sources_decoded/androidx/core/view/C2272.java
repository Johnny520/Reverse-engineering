package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2272 extends AbstractC2275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WindowInsetsAnimation f6599;

    public C2272(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f6599 = windowInsetsAnimation;
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4253(float f) {
        this.f6599.setFraction(f);
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo4254() {
        return this.f6599.getTypeMask();
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo4255() {
        return this.f6599.getInterpolatedFraction();
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo4256() {
        return this.f6599.getDurationMillis();
    }

    @Override // androidx.core.view.AbstractC2275
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo4257() {
        return this.f6599.getAlpha();
    }
}
