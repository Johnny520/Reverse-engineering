package androidx.compose.animation.core;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1185 extends AbstractC1189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f1488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f1489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f1490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1491;

    public C1185(float f, float f2, float f3, float f4) {
        this.f1491 = f;
        this.f1490 = f2;
        this.f1489 = f3;
        this.f1488 = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1185)) {
            return false;
        }
        C1185 c1185 = (C1185) obj;
        return c1185.f1491 == this.f1491 && c1185.f1490 == this.f1490 && c1185.f1489 == this.f1489 && c1185.f1488 == this.f1488;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1488) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f1491) * 31, this.f1490, 31), this.f1489, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f1491 + ", v2 = " + this.f1490 + ", v3 = " + this.f1489 + ", v4 = " + this.f1488;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo1597(float f, int i) {
        if (i == 0) {
            this.f1491 = f;
            return;
        }
        if (i == 1) {
            this.f1490 = f;
        } else if (i == 2) {
            this.f1489 = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f1488 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1598() {
        this.f1491 = 0.0f;
        this.f1490 = 0.0f;
        this.f1489 = 0.0f;
        this.f1488 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1189 mo1599() {
        return new C1185(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1600() {
        return 4;
    }

    @Override // androidx.compose.animation.core.AbstractC1189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo1601(int i) {
        if (i == 0) {
            return this.f1491;
        }
        if (i == 1) {
            return this.f1490;
        }
        if (i == 2) {
            return this.f1489;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f1488;
    }
}
