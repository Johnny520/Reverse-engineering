package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p112.C7325;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1508 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f4286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1601 f4287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public LayoutDirection f4288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC7895 f4289;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1508)) {
            return false;
        }
        C1508 c1508 = (C1508) obj;
        return AbstractC4394.m8917(this.f4289, c1508.f4289) && this.f4288 == c1508.f4288 && AbstractC4394.m8917(this.f4287, c1508.f4287) && C7325.m12488(this.f4286, c1508.f4286);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4286) + ((this.f4287.hashCode() + ((this.f4288.hashCode() + (this.f4289.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f4289 + ", layoutDirection=" + this.f4288 + ", canvas=" + this.f4287 + ", size=" + ((Object) C7325.m12485(this.f4286)) + ')';
    }
}
