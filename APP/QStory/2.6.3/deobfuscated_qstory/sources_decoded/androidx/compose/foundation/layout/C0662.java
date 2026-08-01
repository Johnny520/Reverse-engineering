package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1844 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f1843 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0598 f1842 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0662)) {
            return false;
        }
        C0662 c0662 = (C0662) obj;
        return Float.compare(this.f1844, c0662.f1844) == 0 && this.f1843 == c0662.f1843 && AbstractC4395.m8907(this.f1842, c0662.f1842);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141(Float.hashCode(this.f1844) * 31, 31, this.f1843);
        C0598 c0598 = this.f1842;
        return (iM141 + (c0598 == null ? 0 : c0598.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f1844 + ", fill=" + this.f1843 + ", crossAxisAlignment=" + this.f1842 + ", flowLayoutData=null)";
    }
}
