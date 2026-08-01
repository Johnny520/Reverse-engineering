package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2072 extends AbstractC2070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2036 f6135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6136;

    public C2072(String str, C2036 c2036) {
        this.f6136 = str;
        this.f6135 = c2036;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2072)) {
            return false;
        }
        C2072 c2072 = (C2072) obj;
        return this.f6136.equals(c2072.f6136) && AbstractC4395.m8907(this.f6135, c2072.f6135);
    }

    public final int hashCode() {
        int iHashCode = this.f6136.hashCode() * 31;
        C2036 c2036 = this.f6135;
        return (iHashCode + (c2036 != null ? c2036.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f6136, ')');
    }
}
