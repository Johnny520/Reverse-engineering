package androidx.compose.p001ui.semantics;

import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2782 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7383 f6102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f6103;

    public C2782(String str, InterfaceC7383 interfaceC7383) {
        this.f6103 = str;
        this.f6102 = interfaceC7383;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f6103;
    }

    public /* synthetic */ C2782(String str) {
        this(str, SemanticsPropertyKey$1.INSTANCE);
    }

    public C2782(String str, int i) {
        this(str);
        this.f6101 = true;
    }

    public C2782(String str, boolean z, InterfaceC7383 interfaceC7383) {
        this(str, interfaceC7383);
        this.f6101 = z;
    }
}
