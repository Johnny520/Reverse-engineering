package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子楪兰苏哲世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子楪兰哲苏世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1061 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f3152;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3153;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f3154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0580 f3155;

    public C1061(InterfaceC0580 interfaceC0580, boolean z, String str, InterfaceC6543 interfaceC6543) {
        this.f3155 = interfaceC0580;
        this.f3153 = z;
        this.f3154 = str;
        this.f3152 = interfaceC6543;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1061.class != obj.getClass()) {
            return false;
        }
        C1061 c1061 = (C1061) obj;
        return AbstractC4395.m8907(this.f3155, c1061.f3155) && this.f3153 == c1061.f3153 && AbstractC4395.m8907(this.f3154, c1061.f3154) && this.f3152 == c1061.f3152;
    }

    public final int hashCode() {
        InterfaceC0580 interfaceC0580 = this.f3155;
        int iM141 = AbstractC0053.m141(AbstractC0053.m141((interfaceC0580 != null ? interfaceC0580.hashCode() : 0) * 961, 31, true), 31, this.f3153);
        String str = this.f3154;
        return this.f3152.hashCode() + ((iM141 + (str != null ? str.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        ((C1059) abstractC2128).m1973(this.f3155, null, true, this.f3153, this.f3154, null, this.f3152);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1059(this.f3155, null, true, this.f3153, this.f3154, null, this.f3152);
    }
}
