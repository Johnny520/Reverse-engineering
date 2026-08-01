package androidx.compose.ui.semantics;

import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1947 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f5756;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6554 f5757;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f5758;

    public C1947(String str, InterfaceC6554 interfaceC6554) {
        this.f5758 = str;
        this.f5757 = interfaceC6554;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f5758;
    }

    public /* synthetic */ C1947(String str) {
        this(str, SemanticsPropertyKey$1.INSTANCE);
    }

    public C1947(String str, int i) {
        this(str);
        this.f5756 = true;
    }

    public C1947(String str, boolean z, InterfaceC6554 interfaceC6554) {
        this(str, interfaceC6554);
        this.f5756 = z;
    }
}
