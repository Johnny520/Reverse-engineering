package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import p180.AbstractC7754;
import p205.AbstractC7897;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0665 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0664 f1846;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        float fMo1463 = this.f1846.mo1463(interfaceC1653.getLayoutDirection());
        float fMo1461 = this.f1846.mo1461();
        float fMo1462 = this.f1846.mo1462(interfaceC1653.getLayoutDirection());
        float fMo1464 = this.f1846.mo1464();
        int i = 1;
        if (!((C7893.m13319(fMo1463, 0.0f) >= 0) & (C7893.m13319(fMo1461, 0.0f) >= 0) & (C7893.m13319(fMo1462, 0.0f) >= 0) & (C7893.m13319(fMo1464, 0.0f) >= 0))) {
            AbstractC7754.m13111("Padding must be non-negative");
        }
        int iMo1343 = interfaceC1653.mo1343(fMo1463);
        int iMo13432 = interfaceC1653.mo1343(fMo1462) + iMo1343;
        int iMo13433 = interfaceC1653.mo1343(fMo1461);
        int iMo13434 = interfaceC1653.mo1343(fMo1464) + iMo13433;
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13329(-iMo13432, -iMo13434, j));
        return interfaceC1653.mo1495(AbstractC7897.m13327(abstractC1724Mo3055.f4999 + iMo13432, j), AbstractC7897.m13320(abstractC1724Mo3055.f4997 + iMo13434, j), AbstractC4339.m8776(), new C0673(abstractC1724Mo3055, iMo1343, iMo13433, i));
    }
}
