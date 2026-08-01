package androidx.compose.animation.core;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1186 extends AbstractC1189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f1492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f1493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1494;

    public C1186(float f, float f2, float f3) {
        this.f1494 = f;
        this.f1493 = f2;
        this.f1492 = f3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1186)) {
            return false;
        }
        C1186 c1186 = (C1186) obj;
        return c1186.f1494 == this.f1494 && c1186.f1493 == this.f1493 && c1186.f1492 == this.f1492;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1492) + AbstractC0900.m705(Float.hashCode(this.f1494) * 31, this.f1493, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f1494 + ", v2 = " + this.f1493 + ", v3 = " + this.f1492;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1597(float f, int i) {
        if (i == 0) {
            this.f1494 = f;
        } else if (i == 1) {
            this.f1493 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f1492 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1598() {
        this.f1494 = 0.0f;
        this.f1493 = 0.0f;
        this.f1492 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1189 mo1599() {
        return new C1186(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1600() {
        return 3;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1601(int i) {
        if (i == 0) {
            return this.f1494;
        }
        if (i == 1) {
            return this.f1493;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f1492;
    }
}
