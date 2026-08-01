package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1193 extends AbstractC1189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1538;

    public C1193(float f) {
        this.f1538 = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1193) && ((C1193) obj).f1538 == this.f1538;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1538);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f1538;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1597(float f, int i) {
        if (i == 0) {
            this.f1538 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1598() {
        this.f1538 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1189 mo1599() {
        return new C1193(0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1600() {
        return 1;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1601(int i) {
        if (i == 0) {
            return this.f1538;
        }
        return 0.0f;
    }
}
