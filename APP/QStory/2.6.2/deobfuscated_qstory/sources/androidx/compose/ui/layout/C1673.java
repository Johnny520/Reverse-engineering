package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1750;
import java.util.List;
import p052.InterfaceC6553;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 extends AbstractC1750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f4897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4898;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673(C1661 c1661, InterfaceC6553 interfaceC6553, String str) {
        super(str);
        this.f4898 = c1661;
        this.f4897 = interfaceC6553;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        C1661 c1661 = this.f4898;
        C1675 c1675 = c1661.f4867;
        c1675.f4907 = interfaceC1653.getLayoutDirection();
        c1675.f4905 = interfaceC1653.mo1246();
        c1675.f4906 = interfaceC1653.mo1247();
        boolean zMo1487 = interfaceC1653.mo1487();
        InterfaceC6553 interfaceC6553 = this.f4897;
        if (zMo1487 || c1661.f4873.f5119 == null) {
            c1661.f4866 = 0;
            InterfaceC1657 interfaceC1657 = (InterfaceC1657) interfaceC6553.invoke(c1675, new C7897(j));
            return new C1674(interfaceC1657, c1661, c1661.f4866, interfaceC1657, 1);
        }
        c1661.f4865 = 0;
        InterfaceC1657 interfaceC16572 = (InterfaceC1657) interfaceC6553.invoke(c1661.f4868, new C7897(j));
        return new C1674(interfaceC16572, c1661, c1661.f4865, interfaceC16572, 0);
    }
}
