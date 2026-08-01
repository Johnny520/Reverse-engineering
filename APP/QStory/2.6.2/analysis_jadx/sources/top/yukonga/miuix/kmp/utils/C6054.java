package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.node.InterfaceC1787;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6054 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16551;

    public C6054(long j) {
        this.f16551 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6054) {
            return C1599.m2939(this.f16551, ((C6054) obj).f16551);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f16551);
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1934(InterfaceC0579 interfaceC0579) {
        interfaceC0579.getClass();
        return new C6055(interfaceC0579, this.f16551);
    }
}
