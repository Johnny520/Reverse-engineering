package androidx.compose.foundation;

import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2445 f3504 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2430 f3503 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2342 f3502 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2449 f3501 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900)) {
            return false;
        }
        C1900 c1900 = (C1900) obj;
        return AbstractC5227.m9466(this.f3504, c1900.f3504) && AbstractC5227.m9466(this.f3503, c1900.f3503) && AbstractC5227.m9466(this.f3502, c1900.f3502) && AbstractC5227.m9466(this.f3501, c1900.f3501);
    }

    public final int hashCode() {
        C2445 c2445 = this.f3504;
        int iHashCode = (c2445 == null ? 0 : c2445.hashCode()) * 31;
        C2430 c2430 = this.f3503;
        int iHashCode2 = (iHashCode + (c2430 == null ? 0 : c2430.hashCode())) * 31;
        C2342 c2342 = this.f3502;
        int iHashCode3 = (iHashCode2 + (c2342 == null ? 0 : c2342.hashCode())) * 31;
        C2449 c2449 = this.f3501;
        return iHashCode3 + (c2449 != null ? c2449.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f3504 + ", canvas=" + this.f3503 + ", canvasDrawScope=" + this.f3502 + ", borderPath=" + this.f3501 + ')';
    }
}
