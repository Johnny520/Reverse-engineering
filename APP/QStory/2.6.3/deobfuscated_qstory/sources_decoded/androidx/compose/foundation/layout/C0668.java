package androidx.compose.foundation.layout;

import androidx.activity.compose.C0002;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import p205.AbstractC7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0668 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f1855;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f1856;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f1857;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f1858;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f1859;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iMo1343 = interfaceC1653.mo1343(this.f1858) + interfaceC1653.mo1343(this.f1855);
        int iMo13432 = interfaceC1653.mo1343(this.f1857) + interfaceC1653.mo1343(this.f1859);
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13329(-iMo1343, -iMo13432, j));
        return interfaceC1653.mo1495(AbstractC7897.m13327(abstractC1724Mo3055.f4999 + iMo1343, j), AbstractC7897.m13320(abstractC1724Mo3055.f4997 + iMo13432, j), AbstractC4339.m8776(), new C0002(this, 8, abstractC1724Mo3055));
    }
}
