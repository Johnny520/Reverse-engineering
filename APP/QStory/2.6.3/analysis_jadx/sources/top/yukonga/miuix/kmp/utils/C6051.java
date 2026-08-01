package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6051 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f16538;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0331 f16539;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC0349 f16540;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final float f16541;

    public C6051(InterfaceC0579 interfaceC0579, float f, InterfaceC0349 interfaceC0349) {
        interfaceC0579.getClass();
        interfaceC0349.getClass();
        this.f16538 = interfaceC0579;
        this.f16541 = f;
        this.f16540 = interfaceC0349;
        this.f16539 = AbstractC0330.m1012(1.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final void m11412(C6051 c6051, float f) {
        AbstractC5399.m10477(c6051.m3867(), null, null, new SinkFeedback$SinkFeedbackNode$animateToSink$1(c6051, f, null), 3);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        AbstractC5399.m10477(m3867(), null, null, new SinkFeedback$SinkFeedbackNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C6069(abstractC1724Mo3055, 4, this));
    }
}
