package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1843 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f1842 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0598 f1841 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0662)) {
            return false;
        }
        C0662 c0662 = (C0662) obj;
        return Float.compare(this.f1843, c0662.f1843) == 0 && this.f1842 == c0662.f1842 && AbstractC4394.m8917(this.f1841, c0662.f1841);
    }

    public final int hashCode() {
        int iM140 = AbstractC0053.m140(Float.hashCode(this.f1843) * 31, 31, this.f1842);
        C0598 c0598 = this.f1841;
        return (iM140 + (c0598 == null ? 0 : c0598.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f1843 + ", fill=" + this.f1842 + ", crossAxisAlignment=" + this.f1841 + ", flowLayoutData=null)";
    }
}
