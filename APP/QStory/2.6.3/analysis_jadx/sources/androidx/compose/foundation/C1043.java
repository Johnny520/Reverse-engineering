package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.gestures.InterfaceC0560;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子哲世苏楪兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子哲世苏兰楪;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1043 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC0580 f3077;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC0560 f3078;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f3079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC1084 f3080;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Orientation f3081;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f3082;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0513 f3083;

    public C1043(InterfaceC0513 interfaceC0513, Orientation orientation, boolean z, InterfaceC0560 interfaceC0560, C0573 c0573, boolean z2, InterfaceC1084 interfaceC1084) {
        this.f3083 = interfaceC0513;
        this.f3081 = orientation;
        this.f3082 = z;
        this.f3078 = interfaceC0560;
        this.f3077 = c0573;
        this.f3079 = z2;
        this.f3080 = interfaceC1084;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1043.class != obj.getClass()) {
            return false;
        }
        C1043 c1043 = (C1043) obj;
        return AbstractC4395.m8907(this.f3083, c1043.f3083) && this.f3081 == c1043.f3081 && this.f3082 == c1043.f3082 && AbstractC4395.m8907(this.f3078, c1043.f3078) && AbstractC4395.m8907(this.f3077, c1043.f3077) && this.f3079 == c1043.f3079 && AbstractC4395.m8907(this.f3080, c1043.f3080);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141(AbstractC0053.m141((this.f3081.hashCode() + (this.f3083.hashCode() * 31)) * 31, 31, this.f3082), 31, false);
        InterfaceC0560 interfaceC0560 = this.f3078;
        int iHashCode = (iM141 + (interfaceC0560 != null ? interfaceC0560.hashCode() : 0)) * 31;
        InterfaceC0580 interfaceC0580 = this.f3077;
        int iM1412 = AbstractC0053.m141((iHashCode + (interfaceC0580 != null ? interfaceC0580.hashCode() : 0)) * 961, 31, this.f3079);
        InterfaceC1084 interfaceC1084 = this.f3080;
        return iM1412 + (interfaceC1084 != null ? interfaceC1084.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        ((C1042) abstractC2128).m1948(this.f3080, this.f3078, this.f3081, this.f3083, this.f3077, this.f3079, this.f3082);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C1042 c1042 = new C1042();
        c1042.f3076 = this.f3083;
        c1042.f3075 = this.f3081;
        c1042.f3074 = this.f3082;
        c1042.f3073 = this.f3078;
        c1042.f3072 = this.f3077;
        c1042.f3069 = this.f3079;
        c1042.f3068 = this.f3080;
        return c1042;
    }
}
