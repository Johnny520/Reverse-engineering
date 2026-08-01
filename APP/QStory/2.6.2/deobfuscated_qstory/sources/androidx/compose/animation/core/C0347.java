package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0347 extends AbstractC0343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1193;

    public C0347(float f) {
        this.f1193 = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0347) && ((C0347) obj).f1193 == this.f1193;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1193);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f1193;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1036(float f, int i) {
        if (i == 0) {
            this.f1193 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1037() {
        this.f1193 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC0343 mo1038() {
        return new C0347(0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1039() {
        return 1;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1040(int i) {
        if (i == 0) {
            return this.f1193;
        }
        return 0.0f;
    }
}
