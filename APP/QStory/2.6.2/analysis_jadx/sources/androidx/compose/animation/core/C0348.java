package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0348 extends AbstractC0343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f1194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1195;

    public C0348(float f, float f2) {
        this.f1195 = f;
        this.f1194 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0348)) {
            return false;
        }
        C0348 c0348 = (C0348) obj;
        return c0348.f1195 == this.f1195 && c0348.f1194 == this.f1194;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1194) + (Float.hashCode(this.f1195) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f1195 + ", v2 = " + this.f1194;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1036(float f, int i) {
        if (i == 0) {
            this.f1195 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f1194 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1037() {
        this.f1195 = 0.0f;
        this.f1194 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC0343 mo1038() {
        return new C0348(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1039() {
        return 2;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1040(int i) {
        if (i == 0) {
            return this.f1195;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f1194;
    }
}
