package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1503 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f2189 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f2188 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1439 f2187 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1503)) {
            return false;
        }
        C1503 c1503 = (C1503) obj;
        return Float.compare(this.f2189, c1503.f2189) == 0 && this.f2188 == c1503.f2188 && AbstractC5227.m9466(this.f2187, c1503.f2187);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701(Float.hashCode(this.f2189) * 31, 31, this.f2188);
        C1439 c1439 = this.f2187;
        return (iM701 + (c1439 == null ? 0 : c1439.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f2189 + ", fill=" + this.f2188 + ", crossAxisAlignment=" + this.f2187 + ", flowLayoutData=null)";
    }
}
