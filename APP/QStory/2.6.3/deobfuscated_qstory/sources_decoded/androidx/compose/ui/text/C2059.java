package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2055 f6096;

    public C2059(C2055 c2055) {
        this.f6096 = c2055;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2059) {
            return AbstractC4395.m8907(this.f6096, ((C2059) obj).f6096);
        }
        return false;
    }

    public final int hashCode() {
        C2055 c2055 = this.f6096;
        if (c2055 != null) {
            return c2055.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f6096 + ')';
    }
}
