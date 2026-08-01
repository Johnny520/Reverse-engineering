package androidx.compose.foundation;

import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.drawscope.C1507;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1610 f3158 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1595 f3157 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1507 f3156 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1614 f3155 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1062)) {
            return false;
        }
        C1062 c1062 = (C1062) obj;
        return AbstractC4394.m8917(this.f3158, c1062.f3158) && AbstractC4394.m8917(this.f3157, c1062.f3157) && AbstractC4394.m8917(this.f3156, c1062.f3156) && AbstractC4394.m8917(this.f3155, c1062.f3155);
    }

    public final int hashCode() {
        C1610 c1610 = this.f3158;
        int iHashCode = (c1610 == null ? 0 : c1610.hashCode()) * 31;
        C1595 c1595 = this.f3157;
        int iHashCode2 = (iHashCode + (c1595 == null ? 0 : c1595.hashCode())) * 31;
        C1507 c1507 = this.f3156;
        int iHashCode3 = (iHashCode2 + (c1507 == null ? 0 : c1507.hashCode())) * 31;
        C1614 c1614 = this.f3155;
        return iHashCode3 + (c1614 != null ? c1614.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f3158 + ", canvas=" + this.f3157 + ", canvasDrawScope=" + this.f3156 + ", borderPath=" + this.f3155 + ')';
    }
}
