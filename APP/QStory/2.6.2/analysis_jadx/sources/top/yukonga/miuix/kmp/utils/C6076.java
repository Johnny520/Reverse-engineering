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
import kotlin.collections.AbstractC4338;
import p205.C7902;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6076 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C6072 f16624;

    public C6076(C6072 c6072) {
        this.f16624 = c6072;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m11377() {
        InterfaceC7895 interfaceC7895 = (InterfaceC7895) AbstractC1785.m3346(this, AbstractC1902.f5587);
        C1865 c1865 = (C1865) ((InterfaceC1848) AbstractC1785.m3346(this, AbstractC1902.f5579));
        float fMo1334 = interfaceC7895.mo1334(C7902.m13326(c1865.m3474()));
        C6072 c6072 = this.f16624;
        c6072.f16603 = fMo1334;
        c6072.f16613 = interfaceC7895.mo1334(C7902.m13325(c1865.m3474()));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        C6068 c6068;
        C6072 c6072 = this.f16624;
        c6072.f16615 = null;
        c6072.f16610 = null;
        c6072.f16609 = null;
        c6072.f16606 = null;
        c6072.m11373(0.0f);
        c6072.m11372(0.0f);
        c6072.f16605 = 0.0f;
        c6072.f16604 = 0.0f;
        C6075 c6075 = c6072.f16609;
        if (c6075 == null || (c6068 = (C6068) c6075.invoke()) == null || !c6068.m11369()) {
            return;
        }
        c6068.m11368(false);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        m11377();
        int i = 0;
        C6071 c6071 = new C6071(this, i);
        C6072 c6072 = this.f16624;
        c6072.f16615 = c6071;
        c6072.f16610 = new C6075(this, i);
        c6072.f16609 = new C6075(this, 1);
        c6072.f16606 = new C6075(this, 2);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        interfaceC1655.getClass();
        m11377();
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C6063(abstractC1724Mo3045, 1, this));
    }
}
