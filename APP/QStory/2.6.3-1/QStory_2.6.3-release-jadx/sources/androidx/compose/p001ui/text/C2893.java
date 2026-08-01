package androidx.compose.p001ui.text;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2889 f6441;

    public C2893(C2889 c2889) {
        this.f6441 = c2889;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2893) {
            return AbstractC5227.m9466(this.f6441, ((C2893) obj).f6441);
        }
        return false;
    }

    public final int hashCode() {
        C2889 c2889 = this.f6441;
        if (c2889 != null) {
            return c2889.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f6441 + ')';
    }
}
