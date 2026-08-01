package androidx.compose.ui.semantics;

import kotlin.InterfaceC5167;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5167 f5705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f5706;

    public C1941(String str, InterfaceC5167 interfaceC5167) {
        this.f5706 = str;
        this.f5705 = interfaceC5167;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1941)) {
            return false;
        }
        C1941 c1941 = (C1941) obj;
        return AbstractC4394.m8917(this.f5706, c1941.f5706) && AbstractC4394.m8917(this.f5705, c1941.f5705);
    }

    public final int hashCode() {
        String str = this.f5706;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC5167 interfaceC5167 = this.f5705;
        return iHashCode + (interfaceC5167 != null ? interfaceC5167.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f5706 + ", action=" + this.f5705 + ')';
    }
}
