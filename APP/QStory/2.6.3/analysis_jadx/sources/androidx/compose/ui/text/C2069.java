package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2069 extends AbstractC2070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2036 f6132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6133;

    public C2069(String str, C2036 c2036) {
        this.f6133 = str;
        this.f6132 = c2036;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2069)) {
            return false;
        }
        C2069 c2069 = (C2069) obj;
        return this.f6133.equals(c2069.f6133) && AbstractC4395.m8907(this.f6132, c2069.f6132);
    }

    public final int hashCode() {
        int iHashCode = this.f6133.hashCode() * 31;
        C2036 c2036 = this.f6132;
        return (iHashCode + (c2036 != null ? c2036.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("LinkAnnotation.Url(url="), this.f6133, ')');
    }
}
