package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4338;
import p180.AbstractC7753;
import p205.AbstractC7896;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0665 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0664 f1845;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        float fMo1453 = this.f1845.mo1453(interfaceC1653.getLayoutDirection());
        float fMo1451 = this.f1845.mo1451();
        float fMo1452 = this.f1845.mo1452(interfaceC1653.getLayoutDirection());
        float fMo1454 = this.f1845.mo1454();
        int i = 1;
        if (!((C7892.m13291(fMo1453, 0.0f) >= 0) & (C7892.m13291(fMo1451, 0.0f) >= 0) & (C7892.m13291(fMo1452, 0.0f) >= 0) & (C7892.m13291(fMo1454, 0.0f) >= 0))) {
            AbstractC7753.m13083("Padding must be non-negative");
        }
        int iMo1333 = interfaceC1653.mo1333(fMo1453);
        int iMo13332 = interfaceC1653.mo1333(fMo1452) + iMo1333;
        int iMo13333 = interfaceC1653.mo1333(fMo1451);
        int iMo13334 = interfaceC1653.mo1333(fMo1454) + iMo13333;
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13301(-iMo13332, -iMo13334, j));
        return interfaceC1653.mo1485(AbstractC7896.m13299(abstractC1724Mo3045.f4998 + iMo13332, j), AbstractC7896.m13292(abstractC1724Mo3045.f4996 + iMo13334, j), AbstractC4338.m8781(), new C0673(abstractC1724Mo3045, iMo1333, iMo13333, i));
    }
}
