package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6049 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f16535;

    public C6049() {
        C0299 c0299M1013 = AbstractC0330.m1013(0.6f, 400.0f, null, 4);
        this.f16535 = 8.0f;
        this.f16534 = c0299M1013;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6049)) {
            return false;
        }
        C6049 c6049 = (C6049) obj;
        return Float.compare(this.f16535, c6049.f16535) == 0 && AbstractC4394.m8917(this.f16534, c6049.f16534);
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        return this.f16534.hashCode() + (Float.hashCode(this.f16535) * 31);
    }

    public final String toString() {
        return "TiltFeedback(tiltAmount=" + this.f16535 + ", animationSpec=" + this.f16534 + ")";
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1934(InterfaceC0579 interfaceC0579) {
        interfaceC0579.getClass();
        return new C6050(interfaceC0579, this.f16535, this.f16534);
    }
}
