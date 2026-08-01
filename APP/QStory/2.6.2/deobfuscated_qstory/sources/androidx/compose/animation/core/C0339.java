package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0339 extends AbstractC0343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f1143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f1144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f1145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1146;

    public C0339(float f, float f2, float f3, float f4) {
        this.f1146 = f;
        this.f1145 = f2;
        this.f1144 = f3;
        this.f1143 = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0339)) {
            return false;
        }
        C0339 c0339 = (C0339) obj;
        return c0339.f1146 == this.f1146 && c0339.f1145 == this.f1145 && c0339.f1144 == this.f1144 && c0339.f1143 == this.f1143;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1143) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f1146) * 31, this.f1145, 31), this.f1144, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f1146 + ", v2 = " + this.f1145 + ", v3 = " + this.f1144 + ", v4 = " + this.f1143;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo1036(float f, int i) {
        if (i == 0) {
            this.f1146 = f;
            return;
        }
        if (i == 1) {
            this.f1145 = f;
        } else if (i == 2) {
            this.f1144 = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f1143 = f;
        }
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1037() {
        this.f1146 = 0.0f;
        this.f1145 = 0.0f;
        this.f1144 = 0.0f;
        this.f1143 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC0343 mo1038() {
        return new C0339(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1039() {
        return 4;
    }

    @Override // androidx.compose.animation.core.AbstractC0343
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo1040(int i) {
        if (i == 0) {
            return this.f1146;
        }
        if (i == 1) {
            return this.f1145;
        }
        if (i == 2) {
            return this.f1144;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f1143;
    }
}
