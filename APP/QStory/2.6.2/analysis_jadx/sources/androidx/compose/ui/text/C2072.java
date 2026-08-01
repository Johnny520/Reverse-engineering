package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2072 extends AbstractC2070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2036 f6134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6135;

    public C2072(String str, C2036 c2036) {
        this.f6135 = str;
        this.f6134 = c2036;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2072)) {
            return false;
        }
        C2072 c2072 = (C2072) obj;
        return this.f6135.equals(c2072.f6135) && AbstractC4394.m8917(this.f6134, c2072.f6134);
    }

    public final int hashCode() {
        int iHashCode = this.f6135.hashCode() * 31;
        C2036 c2036 = this.f6134;
        return (iHashCode + (c2036 != null ? c2036.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f6135, ')');
    }
}
