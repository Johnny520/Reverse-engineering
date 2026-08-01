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
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6056 extends AbstractC2128 implements InterfaceC1773, InterfaceC1796 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0331 f16545;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f16546;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C0331 f16547;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f16548;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f16549;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public long f16550;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16551;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final float f16552;

    public C6056(InterfaceC0579 interfaceC0579, float f, InterfaceC0349 interfaceC0349) {
        interfaceC0579.getClass();
        interfaceC0349.getClass();
        this.f16546 = interfaceC0579;
        this.f16552 = f;
        this.f16551 = interfaceC0349;
        this.f16550 = C1615.f4727;
        this.f16547 = AbstractC0330.m1012(0.0f);
        this.f16545 = AbstractC0330.m1012(0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final void m11415(C6056 c6056, float f, float f2) {
        AbstractC5399.m10477(c6056.m3867(), null, null, new TiltFeedback$TiltFeedbackNode$animateToTilt$1(c6056, f, null), 3);
        AbstractC5399.m10477(c6056.m3867(), null, null, new TiltFeedback$TiltFeedbackNode$animateToTilt$2(c6056, f2, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        int i = C1615.f4726;
        this.f16550 = C1615.f4727;
        this.f16549 = 0.0f;
        this.f16548 = 0.0f;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        c1652.getClass();
        pointerEventPass.getClass();
        if (pointerEventPass == PointerEventPass.Main && c1652.f4847 == 1) {
            long j2 = ((C1643) AbstractC4344.m8820(c1652.f4852)).f4807;
            int i = (int) (j2 >> 32);
            float f = ((int) (j >> 32)) / 2.0f;
            int i2 = (int) (j2 & 4294967295L);
            float f2 = ((int) (j & 4294967295L)) / 2.0f;
            this.f16550 = AbstractC1581.m2900(Float.intBitsToFloat(i) < f ? 1.0f : 0.0f, Float.intBitsToFloat(i2) < f2 ? 1.0f : 0.0f);
            float fIntBitsToFloat = Float.intBitsToFloat(i2);
            float f3 = this.f16552;
            this.f16549 = fIntBitsToFloat < f2 ? f3 : -f3;
            if (Float.intBitsToFloat(i) < f) {
                f3 = -f3;
            }
            this.f16548 = f3;
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        AbstractC5399.m10477(m3867(), null, null, new TiltFeedback$TiltFeedbackNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C6069(abstractC1724Mo3055, 5, this));
    }
}
