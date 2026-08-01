package androidx.compose.ui.semantics;

import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1947 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f5755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6553 f5756;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f5757;

    public C1947(String str, InterfaceC6553 interfaceC6553) {
        this.f5757 = str;
        this.f5756 = interfaceC6553;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f5757;
    }

    public /* synthetic */ C1947(String str) {
        this(str, SemanticsPropertyKey$1.INSTANCE);
    }

    public C1947(String str, int i) {
        this(str);
        this.f5755 = true;
    }

    public C1947(String str, boolean z, InterfaceC6553 interfaceC6553) {
        this(str, interfaceC6553);
        this.f5755 = z;
    }
}
