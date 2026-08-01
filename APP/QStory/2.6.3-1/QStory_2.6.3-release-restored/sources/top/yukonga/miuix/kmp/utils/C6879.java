package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.node.InterfaceC2622;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6879 implements InterfaceC1933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1195 f16881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f16882;

    public C6879() {
        C1145 c1145M1574 = AbstractC1176.m1574(0.8f, 600.0f, null, 4);
        this.f16882 = 0.94f;
        this.f16881 = c1145M1574;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6879)) {
            return false;
        }
        C6879 c6879 = (C6879) obj;
        return Float.compare(this.f16882, c6879.f16882) == 0 && AbstractC5227.m9466(this.f16881, c6879.f16881);
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    public final int hashCode() {
        return this.f16881.hashCode() + (Float.hashCode(this.f16882) * 31);
    }

    public final String toString() {
        return "SinkFeedback(sinkAmount=" + this.f16882 + ", animationSpec=" + this.f16881 + ")";
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2622 mo2504(InterfaceC1420 interfaceC1420) {
        interfaceC1420.getClass();
        return new C6880(interfaceC1420, this.f16882, this.f16881);
    }
}
