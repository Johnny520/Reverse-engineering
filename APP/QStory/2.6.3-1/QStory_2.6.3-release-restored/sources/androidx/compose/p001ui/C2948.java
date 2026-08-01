package androidx.compose.p001ui;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6599;

    public C2948(float f) {
        this.f6599 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2948) && Float.compare(this.f6599, ((C2948) obj).f6599) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6599);
    }

    public final String toString() {
        return AbstractC0900.m715(new StringBuilder("Vertical(bias="), this.f6599, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m4417(int i, int i2) {
        return Math.round((1.0f + this.f6599) * ((i2 - i) / 2.0f));
    }
}
