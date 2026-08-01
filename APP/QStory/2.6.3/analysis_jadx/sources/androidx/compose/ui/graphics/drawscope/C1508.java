package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p112.C7326;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1508 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f4287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1601 f4288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public LayoutDirection f4289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC7896 f4290;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1508)) {
            return false;
        }
        C1508 c1508 = (C1508) obj;
        return AbstractC4395.m8907(this.f4290, c1508.f4290) && this.f4289 == c1508.f4289 && AbstractC4395.m8907(this.f4288, c1508.f4288) && C7326.m12515(this.f4287, c1508.f4287);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4287) + ((this.f4288.hashCode() + ((this.f4289.hashCode() + (this.f4290.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f4290 + ", layoutDirection=" + this.f4289 + ", canvas=" + this.f4288 + ", size=" + ((Object) C7326.m12512(this.f4287)) + ')';
    }
}
