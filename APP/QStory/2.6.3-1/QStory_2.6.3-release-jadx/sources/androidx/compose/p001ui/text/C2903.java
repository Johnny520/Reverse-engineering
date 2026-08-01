package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2903 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2870 f6477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6478;

    public C2903(String str, C2870 c2870) {
        this.f6478 = str;
        this.f6477 = c2870;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2903)) {
            return false;
        }
        C2903 c2903 = (C2903) obj;
        return this.f6478.equals(c2903.f6478) && AbstractC5227.m9466(this.f6477, c2903.f6477);
    }

    public final int hashCode() {
        int iHashCode = this.f6478.hashCode() * 31;
        C2870 c2870 = this.f6477;
        return (iHashCode + (c2870 != null ? c2870.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("LinkAnnotation.Url(url="), this.f6478, ')');
    }
}
