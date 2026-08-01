package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.node.InterfaceC1787;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6060 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16560;

    public C6060(long j) {
        this.f16560 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6060) {
            return C1599.m2949(this.f16560, ((C6060) obj).f16560);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f16560);
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1944(InterfaceC0579 interfaceC0579) {
        interfaceC0579.getClass();
        return new C6061(interfaceC0579, this.f16560);
    }
}
