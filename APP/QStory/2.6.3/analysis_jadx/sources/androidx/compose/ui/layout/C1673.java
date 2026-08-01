package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1750;
import java.util.List;
import p052.InterfaceC6554;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 extends AbstractC1750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f4898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4899;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673(C1661 c1661, InterfaceC6554 interfaceC6554, String str) {
        super(str);
        this.f4899 = c1661;
        this.f4898 = interfaceC6554;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        C1661 c1661 = this.f4899;
        C1675 c1675 = c1661.f4868;
        c1675.f4908 = interfaceC1653.getLayoutDirection();
        c1675.f4906 = interfaceC1653.mo1256();
        c1675.f4907 = interfaceC1653.mo1257();
        boolean zMo1497 = interfaceC1653.mo1497();
        InterfaceC6554 interfaceC6554 = this.f4898;
        if (zMo1497 || c1661.f4874.f5120 == null) {
            c1661.f4867 = 0;
            InterfaceC1657 interfaceC1657 = (InterfaceC1657) interfaceC6554.invoke(c1675, new C7898(j));
            return new C1674(interfaceC1657, c1661, c1661.f4867, interfaceC1657, 1);
        }
        c1661.f4866 = 0;
        InterfaceC1657 interfaceC16572 = (InterfaceC1657) interfaceC6554.invoke(c1661.f4869, new C7898(j));
        return new C1674(interfaceC16572, c1661, c1661.f4866, interfaceC16572, 0);
    }
}
