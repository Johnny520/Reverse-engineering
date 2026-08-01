package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2450;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2631;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6885 extends AbstractC2961 implements InterfaceC2608, InterfaceC2631 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1177 f16890;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC1420 f16891;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1177 f16892;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f16893;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f16894;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public long f16895;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC1195 f16896;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final float f16897;

    public C6885(InterfaceC1420 interfaceC1420, float f, InterfaceC1195 interfaceC1195) {
        interfaceC1420.getClass();
        interfaceC1195.getClass();
        this.f16891 = interfaceC1420;
        this.f16897 = f;
        this.f16896 = interfaceC1195;
        this.f16895 = C2450.f5072;
        this.f16892 = AbstractC1176.m1572(0.0f);
        this.f16890 = AbstractC1176.m1572(0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final void m11974(C6885 c6885, float f, float f2) {
        AbstractC6231.m11036(c6885.m4427(), null, null, new TiltFeedback$TiltFeedbackNode$animateToTilt$1(c6885, f, null), 3);
        AbstractC6231.m11036(c6885.m4427(), null, null, new TiltFeedback$TiltFeedbackNode$animateToTilt$2(c6885, f2, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        int i = C2450.f5071;
        this.f16895 = C2450.f5072;
        this.f16894 = 0.0f;
        this.f16893 = 0.0f;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        c2487.getClass();
        pointerEventPass.getClass();
        if (pointerEventPass == PointerEventPass.Main && c2487.f5192 == 1) {
            long j2 = ((C2478) AbstractC5176.m9379(c2487.f5197)).f5152;
            int i = (int) (j2 >> 32);
            float f = ((int) (j >> 32)) / 2.0f;
            int i2 = (int) (j2 & 4294967295L);
            float f2 = ((int) (j & 4294967295L)) / 2.0f;
            this.f16895 = AbstractC2416.m3460(Float.intBitsToFloat(i) < f ? 1.0f : 0.0f, Float.intBitsToFloat(i2) < f2 ? 1.0f : 0.0f);
            float fIntBitsToFloat = Float.intBitsToFloat(i2);
            float f3 = this.f16897;
            this.f16894 = fIntBitsToFloat < f2 ? f3 : -f3;
            if (Float.intBitsToFloat(i) < f) {
                f3 = -f3;
            }
            this.f16893 = f3;
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        AbstractC6231.m11036(m4427(), null, null, new TiltFeedback$TiltFeedbackNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        interfaceC2490.getClass();
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C6898(abstractC2559Mo3615, 5, this));
    }
}
