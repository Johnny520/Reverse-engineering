package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3105 extends AbstractC3108 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WindowInsetsAnimation f6944;

    public C3105(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f6944 = windowInsetsAnimation;
    }

    @Override // androidx.core.view.AbstractC3108
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4813(float f) {
        this.f6944.setFraction(f);
    }

    @Override // androidx.core.view.AbstractC3108
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo4814() {
        return this.f6944.getTypeMask();
    }

    @Override // androidx.core.view.AbstractC3108
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo4815() {
        return this.f6944.getInterpolatedFraction();
    }

    @Override // androidx.core.view.AbstractC3108
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo4816() {
        return this.f6944.getDurationMillis();
    }

    @Override // androidx.core.view.AbstractC3108
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo4817() {
        return this.f6944.getAlpha();
    }
}
