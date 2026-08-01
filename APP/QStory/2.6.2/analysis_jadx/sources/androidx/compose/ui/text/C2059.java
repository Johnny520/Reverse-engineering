package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2055 f6095;

    public C2059(C2055 c2055) {
        this.f6095 = c2055;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2059) {
            return AbstractC4394.m8917(this.f6095, ((C2059) obj).f6095);
        }
        return false;
    }

    public final int hashCode() {
        C2055 c2055 = this.f6095;
        if (c2055 != null) {
            return c2055.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f6095 + ')';
    }
}
