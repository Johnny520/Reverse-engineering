package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0340 extends AbstractC0343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f1147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f1148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1149;

    public C0340(float f, float f2, float f3) {
        this.f1149 = f;
        this.f1148 = f2;
        this.f1147 = f3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0340)) {
            return false;
        }
        C0340 c0340 = (C0340) obj;
        return c0340.f1149 == this.f1149 && c0340.f1148 == this.f1148 && c0340.f1147 == this.f1147;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1147) + AbstractC0053.m144(Float.hashCode(this.f1149) * 31, this.f1148, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f1149 + ", v2 = " + this.f1148 + ", v3 = " + this.f1147;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1036(float f, int i) {
        if (i == 0) {
            this.f1149 = f;
        } else if (i == 1) {
            this.f1148 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f1147 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1037() {
        this.f1149 = 0.0f;
        this.f1148 = 0.0f;
        this.f1147 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC0343 mo1038() {
        return new C0340(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1039() {
        return 3;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1040(int i) {
        if (i == 0) {
            return this.f1149;
        }
        if (i == 1) {
            return this.f1148;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f1147;
    }
}
