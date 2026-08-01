package androidx.compose.foundation;

import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.drawscope.C1507;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1610 f3159 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1595 f3158 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1507 f3157 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1614 f3156 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1062)) {
            return false;
        }
        C1062 c1062 = (C1062) obj;
        return AbstractC4395.m8907(this.f3159, c1062.f3159) && AbstractC4395.m8907(this.f3158, c1062.f3158) && AbstractC4395.m8907(this.f3157, c1062.f3157) && AbstractC4395.m8907(this.f3156, c1062.f3156);
    }

    public final int hashCode() {
        C1610 c1610 = this.f3159;
        int iHashCode = (c1610 == null ? 0 : c1610.hashCode()) * 31;
        C1595 c1595 = this.f3158;
        int iHashCode2 = (iHashCode + (c1595 == null ? 0 : c1595.hashCode())) * 31;
        C1507 c1507 = this.f3157;
        int iHashCode3 = (iHashCode2 + (c1507 == null ? 0 : c1507.hashCode())) * 31;
        C1614 c1614 = this.f3156;
        return iHashCode3 + (c1614 != null ? c1614.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f3159 + ", canvas=" + this.f3158 + ", canvasDrawScope=" + this.f3157 + ", borderPath=" + this.f3156 + ')';
    }
}
