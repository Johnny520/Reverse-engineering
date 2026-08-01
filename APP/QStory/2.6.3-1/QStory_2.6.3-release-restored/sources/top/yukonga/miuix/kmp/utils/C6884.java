package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.node.InterfaceC2622;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6884 implements InterfaceC1933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1195 f16888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f16889;

    public C6884() {
        C1145 c1145M1574 = AbstractC1176.m1574(0.6f, 400.0f, null, 4);
        this.f16889 = 8.0f;
        this.f16888 = c1145M1574;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6884)) {
            return false;
        }
        C6884 c6884 = (C6884) obj;
        return Float.compare(this.f16889, c6884.f16889) == 0 && AbstractC5227.m9466(this.f16888, c6884.f16888);
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    public final int hashCode() {
        return this.f16888.hashCode() + (Float.hashCode(this.f16889) * 31);
    }

    public final String toString() {
        return "TiltFeedback(tiltAmount=" + this.f16889 + ", animationSpec=" + this.f16888 + ")";
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2622 mo2504(InterfaceC1420 interfaceC1420) {
        interfaceC1420.getClass();
        return new C6885(interfaceC1420, this.f16889, this.f16888);
    }
}
