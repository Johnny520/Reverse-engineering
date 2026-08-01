package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1615;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1796;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlinx.coroutines.AbstractC5398;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6050 extends AbstractC2128 implements InterfaceC1773, InterfaceC1796 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0331 f16536;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f16537;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C0331 f16538;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f16539;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f16540;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public long f16541;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16542;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final float f16543;

    public C6050(InterfaceC0579 interfaceC0579, float f, InterfaceC0349 interfaceC0349) {
        interfaceC0579.getClass();
        interfaceC0349.getClass();
        this.f16537 = interfaceC0579;
        this.f16543 = f;
        this.f16542 = interfaceC0349;
        this.f16541 = C1615.f4726;
        this.f16538 = AbstractC0330.m1011(0.0f);
        this.f16536 = AbstractC0330.m1011(0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final void m11355(C6050 c6050, float f, float f2) {
        AbstractC5398.m10473(c6050.m3857(), null, null, new TiltFeedback$TiltFeedbackNode$animateToTilt$1(c6050, f, null), 3);
        AbstractC5398.m10473(c6050.m3857(), null, null, new TiltFeedback$TiltFeedbackNode$animateToTilt$2(c6050, f2, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        int i = C1615.f4725;
        this.f16541 = C1615.f4726;
        this.f16540 = 0.0f;
        this.f16539 = 0.0f;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        c1652.getClass();
        pointerEventPass.getClass();
        if (pointerEventPass == PointerEventPass.Main && c1652.f4846 == 1) {
            long j2 = ((C1643) AbstractC4343.m8827(c1652.f4851)).f4806;
            int i = (int) (j2 >> 32);
            float f = ((int) (j >> 32)) / 2.0f;
            int i2 = (int) (j2 & 4294967295L);
            float f2 = ((int) (j & 4294967295L)) / 2.0f;
            this.f16541 = AbstractC1581.m2890(Float.intBitsToFloat(i) < f ? 1.0f : 0.0f, Float.intBitsToFloat(i2) < f2 ? 1.0f : 0.0f);
            float fIntBitsToFloat = Float.intBitsToFloat(i2);
            float f3 = this.f16543;
            this.f16540 = fIntBitsToFloat < f2 ? f3 : -f3;
            if (Float.intBitsToFloat(i) < f) {
                f3 = -f3;
            }
            this.f16539 = f3;
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        AbstractC5398.m10473(m3857(), null, null, new TiltFeedback$TiltFeedbackNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C6063(abstractC1724Mo3045, 5, this));
    }
}
