package androidx.compose.p001ui.semantics;

import kotlin.InterfaceC6000;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2776 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6000 f6051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6052;

    public C2776(String str, InterfaceC6000 interfaceC6000) {
        this.f6052 = str;
        this.f6051 = interfaceC6000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2776)) {
            return false;
        }
        C2776 c2776 = (C2776) obj;
        return AbstractC5227.m9466(this.f6052, c2776.f6052) && AbstractC5227.m9466(this.f6051, c2776.f6051);
    }

    public final int hashCode() {
        String str = this.f6052;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC6000 interfaceC6000 = this.f6051;
        return iHashCode + (interfaceC6000 != null ? interfaceC6000.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f6052 + ", action=" + this.f6051 + ')';
    }
}
