package androidx.compose.foundation;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子楪兰苏哲世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子楪兰哲苏世;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1899 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f3497;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f3499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1421 f3500;

    public C1899(InterfaceC1421 interfaceC1421, boolean z, String str, InterfaceC7372 interfaceC7372) {
        this.f3500 = interfaceC1421;
        this.f3498 = z;
        this.f3499 = str;
        this.f3497 = interfaceC7372;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1899.class != obj.getClass()) {
            return false;
        }
        C1899 c1899 = (C1899) obj;
        return AbstractC5227.m9466(this.f3500, c1899.f3500) && this.f3498 == c1899.f3498 && AbstractC5227.m9466(this.f3499, c1899.f3499) && this.f3497 == c1899.f3497;
    }

    public final int hashCode() {
        InterfaceC1421 interfaceC1421 = this.f3500;
        int iM701 = AbstractC0900.m701(AbstractC0900.m701((interfaceC1421 != null ? interfaceC1421.hashCode() : 0) * 961, 31, true), 31, this.f3498);
        String str = this.f3499;
        return this.f3497.hashCode() + ((iM701 + (str != null ? str.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C1897) abstractC2961).m2533(this.f3500, null, true, this.f3498, this.f3499, null, this.f3497);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1897(this.f3500, null, true, this.f3498, this.f3499, null, this.f3497);
    }
}
