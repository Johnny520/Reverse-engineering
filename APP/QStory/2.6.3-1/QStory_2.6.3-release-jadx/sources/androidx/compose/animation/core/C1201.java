package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2168;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1201 implements InterfaceC2168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1200 f1565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC7387 f1566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC7387 f1567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1197 f1568;

    public C1201(C1200 c1200, C1197 c1197, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        this.f1565 = c1200;
        this.f1568 = c1197;
        this.f1566 = interfaceC7387;
        this.f1567 = interfaceC73872;
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        m1620(this.f1565.f1562.m1623());
        return ((AbstractC2182) this.f1568.f1553).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1620(InterfaceC1199 interfaceC1199) {
        Object objInvoke = this.f1567.invoke(interfaceC1199.mo1616());
        boolean zM1630 = this.f1565.f1562.m1630();
        C1197 c1197 = this.f1568;
        if (zM1630) {
            c1197.m1613(this.f1567.invoke(interfaceC1199.mo1617()), objInvoke, (InterfaceC1157) this.f1566.invoke(interfaceC1199));
        } else {
            c1197.m1615(objInvoke, (InterfaceC1157) this.f1566.invoke(interfaceC1199));
        }
    }
}
