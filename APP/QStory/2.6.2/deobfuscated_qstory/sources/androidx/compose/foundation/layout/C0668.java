package androidx.compose.foundation.layout;

import androidx.activity.compose.C0002;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4338;
import p205.AbstractC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0668 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f1854;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f1855;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f1856;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f1857;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f1858;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iMo1333 = interfaceC1653.mo1333(this.f1857) + interfaceC1653.mo1333(this.f1854);
        int iMo13332 = interfaceC1653.mo1333(this.f1856) + interfaceC1653.mo1333(this.f1858);
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13301(-iMo1333, -iMo13332, j));
        return interfaceC1653.mo1485(AbstractC7896.m13299(abstractC1724Mo3045.f4998 + iMo1333, j), AbstractC7896.m13292(abstractC1724Mo3045.f4996 + iMo13332, j), AbstractC4338.m8781(), new C0002(this, 8, abstractC1724Mo3045));
    }
}
