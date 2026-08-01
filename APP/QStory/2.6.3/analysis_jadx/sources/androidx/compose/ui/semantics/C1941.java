package androidx.compose.ui.semantics;

import kotlin.InterfaceC5168;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5168 f5706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f5707;

    public C1941(String str, InterfaceC5168 interfaceC5168) {
        this.f5707 = str;
        this.f5706 = interfaceC5168;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1941)) {
            return false;
        }
        C1941 c1941 = (C1941) obj;
        return AbstractC4395.m8907(this.f5707, c1941.f5707) && AbstractC4395.m8907(this.f5706, c1941.f5706);
    }

    public final int hashCode() {
        String str = this.f5707;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC5168 interfaceC5168 = this.f5706;
        return iHashCode + (interfaceC5168 != null ? interfaceC5168.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f5707 + ", action=" + this.f5706 + ')';
    }
}
