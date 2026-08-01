package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1194 extends AbstractC1189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f1539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1540;

    public C1194(float f, float f2) {
        this.f1540 = f;
        this.f1539 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1194)) {
            return false;
        }
        C1194 c1194 = (C1194) obj;
        return c1194.f1540 == this.f1540 && c1194.f1539 == this.f1539;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1539) + (Float.hashCode(this.f1540) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f1540 + ", v2 = " + this.f1539;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1597(float f, int i) {
        if (i == 0) {
            this.f1540 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f1539 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1598() {
        this.f1540 = 0.0f;
        this.f1539 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1189 mo1599() {
        return new C1194(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1600() {
        return 2;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1601(int i) {
        if (i == 0) {
            return this.f1540;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f1539;
    }
}
