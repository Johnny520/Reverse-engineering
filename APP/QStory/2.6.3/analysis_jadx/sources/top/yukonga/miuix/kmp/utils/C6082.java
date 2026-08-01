package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.C1865;
import androidx.compose.ui.platform.InterfaceC1848;
import kotlin.collections.AbstractC4339;
import p205.C7903;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6082 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C6078 f16633;

    public C6082(C6078 c6078) {
        this.f16633 = c6078;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m11437() {
        InterfaceC7896 interfaceC7896 = (InterfaceC7896) AbstractC1785.m3356(this, AbstractC1902.f5588);
        C1865 c1865 = (C1865) ((InterfaceC1848) AbstractC1785.m3356(this, AbstractC1902.f5580));
        float fMo1344 = interfaceC7896.mo1344(C7903.m13354(c1865.m3484()));
        C6078 c6078 = this.f16633;
        c6078.f16612 = fMo1344;
        c6078.f16622 = interfaceC7896.mo1344(C7903.m13353(c1865.m3484()));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        C6074 c6074;
        C6078 c6078 = this.f16633;
        c6078.f16624 = null;
        c6078.f16619 = null;
        c6078.f16618 = null;
        c6078.f16615 = null;
        c6078.m11433(0.0f);
        c6078.m11432(0.0f);
        c6078.f16614 = 0.0f;
        c6078.f16613 = 0.0f;
        C6081 c6081 = c6078.f16618;
        if (c6081 == null || (c6074 = (C6074) c6081.invoke()) == null || !c6074.m11429()) {
            return;
        }
        c6074.m11428(false);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        m11437();
        int i = 0;
        C6077 c6077 = new C6077(this, i);
        C6078 c6078 = this.f16633;
        c6078.f16624 = c6077;
        c6078.f16619 = new C6081(this, i);
        c6078.f16618 = new C6081(this, 1);
        c6078.f16615 = new C6081(this, 2);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        m11437();
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C6069(abstractC1724Mo3055, 1, this));
    }
}
