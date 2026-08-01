package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6044 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f16528;

    public C6044() {
        C0299 c0299M1013 = AbstractC0330.m1013(0.8f, 600.0f, null, 4);
        this.f16528 = 0.94f;
        this.f16527 = c0299M1013;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6044)) {
            return false;
        }
        C6044 c6044 = (C6044) obj;
        return Float.compare(this.f16528, c6044.f16528) == 0 && AbstractC4394.m8917(this.f16527, c6044.f16527);
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        return this.f16527.hashCode() + (Float.hashCode(this.f16528) * 31);
    }

    public final String toString() {
        return "SinkFeedback(sinkAmount=" + this.f16528 + ", animationSpec=" + this.f16527 + ")";
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1934(InterfaceC0579 interfaceC0579) {
        interfaceC0579.getClass();
        return new C6045(interfaceC0579, this.f16528, this.f16527);
    }
}
