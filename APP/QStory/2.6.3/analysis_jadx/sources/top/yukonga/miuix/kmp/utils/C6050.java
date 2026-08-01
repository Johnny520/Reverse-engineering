package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6050 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f16537;

    public C6050() {
        C0299 c0299M1014 = AbstractC0330.m1014(0.8f, 600.0f, null, 4);
        this.f16537 = 0.94f;
        this.f16536 = c0299M1014;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6050)) {
            return false;
        }
        C6050 c6050 = (C6050) obj;
        return Float.compare(this.f16537, c6050.f16537) == 0 && AbstractC4395.m8907(this.f16536, c6050.f16536);
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        return this.f16536.hashCode() + (Float.hashCode(this.f16537) * 31);
    }

    public final String toString() {
        return "SinkFeedback(sinkAmount=" + this.f16537 + ", animationSpec=" + this.f16536 + ")";
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1944(InterfaceC0579 interfaceC0579) {
        interfaceC0579.getClass();
        return new C6051(interfaceC0579, this.f16537, this.f16536);
    }
}
