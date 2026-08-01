package top.yukonga.miuix.kmp.utils;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.C2700;
import androidx.compose.p001ui.platform.InterfaceC2683;
import kotlin.collections.AbstractC5171;
import p221.C8732;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6911 extends AbstractC2961 implements InterfaceC2618, InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C6907 f16978;

    public C6911(C6907 c6907) {
        this.f16978 = c6907;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m11996() {
        InterfaceC8725 interfaceC8725 = (InterfaceC8725) AbstractC2620.m3916(this, AbstractC2737.f5933);
        C2700 c2700 = (C2700) ((InterfaceC2683) AbstractC2620.m3916(this, AbstractC2737.f5925));
        float fMo1904 = interfaceC8725.mo1904(C8732.m13913(c2700.m4044()));
        C6907 c6907 = this.f16978;
        c6907.f16957 = fMo1904;
        c6907.f16967 = interfaceC8725.mo1904(C8732.m13912(c2700.m4044()));
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C6903 c6903;
        C6907 c6907 = this.f16978;
        c6907.f16969 = null;
        c6907.f16964 = null;
        c6907.f16963 = null;
        c6907.f16960 = null;
        c6907.m11992(0.0f);
        c6907.m11991(0.0f);
        c6907.f16959 = 0.0f;
        c6907.f16958 = 0.0f;
        C6910 c6910 = c6907.f16963;
        if (c6910 == null || (c6903 = (C6903) c6910.invoke()) == null || !c6903.m11988()) {
            return;
        }
        c6903.m11987(false);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        m11996();
        int i = 0;
        C6906 c6906 = new C6906(this, i);
        C6907 c6907 = this.f16978;
        c6907.f16969 = c6906;
        c6907.f16964 = new C6910(this, i);
        c6907.f16963 = new C6910(this, 1);
        c6907.f16960 = new C6910(this, 2);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        interfaceC2490.getClass();
        m11996();
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C6898(abstractC2559Mo3615, 1, this));
    }
}
