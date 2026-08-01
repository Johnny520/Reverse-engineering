package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.collection.C0277;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1698;
import io.ktor.util.C4210;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0590 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0277 f1651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public AbstractC1724 f1652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC1655 f1653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC1724 f1654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1655 f1655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final FlowLayoutOverflow$OverflowType f1656;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0277 f1657;

    public C0590(FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType) {
        this.f1656 = flowLayoutOverflow$OverflowType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0590) && this.f1656 == ((C0590) obj).f1656;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0053.m143(0, this.f1656.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f1656 + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1358(InterfaceC1698 interfaceC1698, InterfaceC1698 interfaceC16982, long j) {
        long jM1412 = AbstractC0628.m1412(j, LayoutOrientation.Horizontal);
        if (interfaceC1698 != null) {
            int iMo3049 = interfaceC1698.mo3049(C7897.m13310(jM1412));
            this.f1651 = new C0277(C0277.m853(iMo3049, interfaceC1698.mo3044(iMo3049)));
            this.f1655 = interfaceC1698 instanceof InterfaceC1655 ? (InterfaceC1655) interfaceC1698 : null;
            this.f1654 = null;
        }
        if (interfaceC16982 != null) {
            int iMo30492 = interfaceC16982.mo3049(C7897.m13310(jM1412));
            this.f1657 = new C0277(C0277.m853(iMo30492, interfaceC16982.mo3044(iMo30492)));
            this.f1653 = interfaceC16982 instanceof InterfaceC1655 ? (InterfaceC1655) interfaceC16982 : null;
            this.f1652 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0277 m1359(int i, int i2, boolean z) {
        int i3 = AbstractC0589.f1650[this.f1656.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            if (z) {
                return this.f1651;
            }
            return null;
        }
        if (i3 != 4) {
            C4210.m8621();
            return null;
        }
        if (z) {
            return this.f1651;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f1657;
    }
}
