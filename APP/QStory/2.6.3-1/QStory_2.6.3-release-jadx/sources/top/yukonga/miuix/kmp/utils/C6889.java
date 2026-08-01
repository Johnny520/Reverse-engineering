package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.node.InterfaceC2622;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6889 implements InterfaceC1933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16905;

    public C6889(long j) {
        this.f16905 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6889) {
            return C2434.m3509(this.f16905, ((C6889) obj).f16905);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f16905);
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2622 mo2504(InterfaceC1420 interfaceC1420) {
        interfaceC1420.getClass();
        return new C6890(interfaceC1420, this.f16905);
    }
}
