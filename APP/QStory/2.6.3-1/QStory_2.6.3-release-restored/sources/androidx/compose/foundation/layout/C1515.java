package androidx.compose.foundation.layout;

import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.collections.AbstractC5171;
import p221.AbstractC8726;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1515 extends AbstractC1425 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1449 f2219;

    public C1515(InterfaceC1449 interfaceC1449) {
        this.f2219 = interfaceC1449;
    }

    @Override // androidx.compose.foundation.layout.AbstractC1425
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final InterfaceC1449 mo1917(InterfaceC1449 interfaceC1449) {
        return new C1450(interfaceC1449, this.f2219);
    }

    @Override // androidx.compose.foundation.layout.AbstractC1425
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo1918() {
        super.mo1918();
        AbstractC2620.m3910(this);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        int iMo1930 = this.f1978.mo1930(interfaceC2488, interfaceC2488.getLayoutDirection()) - this.f1977.mo1930(interfaceC2488, interfaceC2488.getLayoutDirection());
        int iMo1931 = this.f1978.mo1931(interfaceC2488) - this.f1977.mo1931(interfaceC2488);
        int iMo1933 = (this.f1978.mo1933(interfaceC2488, interfaceC2488.getLayoutDirection()) - this.f1977.mo1933(interfaceC2488, interfaceC2488.getLayoutDirection())) + iMo1930;
        int iMo1932 = (this.f1978.mo1932(interfaceC2488) - this.f1977.mo1932(interfaceC2488)) + iMo1931;
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13888(-iMo1933, -iMo1932, j));
        return interfaceC2488.mo2055(AbstractC8726.m13886(abstractC2559Mo3615.f5344 + iMo1933, j), AbstractC8726.m13879(abstractC2559Mo3615.f5342 + iMo1932, j), AbstractC5171.m9335(), new C1514(abstractC2559Mo3615, iMo1930, iMo1931, 0));
    }
}
