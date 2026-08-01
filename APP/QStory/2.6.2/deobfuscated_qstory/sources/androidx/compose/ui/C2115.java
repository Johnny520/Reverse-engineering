package androidx.compose.ui;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2115 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6253;

    public C2115(float f) {
        this.f6253 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2115) && Float.compare(this.f6253, ((C2115) obj).f6253) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6253);
    }

    public final String toString() {
        return AbstractC0053.m157(new StringBuilder("Vertical(bias="), this.f6253, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m3847(int i, int i2) {
        return Math.round((1.0f + this.f6253) * ((i2 - i) / 2.0f));
    }
}
