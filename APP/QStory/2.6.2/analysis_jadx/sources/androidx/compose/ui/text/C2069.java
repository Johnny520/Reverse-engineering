package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2069 extends AbstractC2070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2036 f6131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6132;

    public C2069(String str, C2036 c2036) {
        this.f6132 = str;
        this.f6131 = c2036;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2069)) {
            return false;
        }
        C2069 c2069 = (C2069) obj;
        return this.f6132.equals(c2069.f6132) && AbstractC4394.m8917(this.f6131, c2069.f6131);
    }

    public final int hashCode() {
        int iHashCode = this.f6132.hashCode() * 31;
        C2036 c2036 = this.f6131;
        return (iHashCode + (c2036 != null ? c2036.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("LinkAnnotation.Url(url="), this.f6132, ')');
    }
}
