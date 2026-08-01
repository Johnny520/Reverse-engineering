package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6055 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f16544;

    public C6055() {
        C0299 c0299M1014 = AbstractC0330.m1014(0.6f, 400.0f, null, 4);
        this.f16544 = 8.0f;
        this.f16543 = c0299M1014;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6055)) {
            return false;
        }
        C6055 c6055 = (C6055) obj;
        return Float.compare(this.f16544, c6055.f16544) == 0 && AbstractC4395.m8907(this.f16543, c6055.f16543);
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        return this.f16543.hashCode() + (Float.hashCode(this.f16544) * 31);
    }

    public final String toString() {
        return "TiltFeedback(tiltAmount=" + this.f16544 + ", animationSpec=" + this.f16543 + ")";
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1944(InterfaceC0579 interfaceC0579) {
        interfaceC0579.getClass();
        return new C6056(interfaceC0579, this.f16544, this.f16543);
    }
}
