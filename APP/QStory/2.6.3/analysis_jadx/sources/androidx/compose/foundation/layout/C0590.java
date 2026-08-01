package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.collection.C0277;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1698;
import io.ktor.util.C4211;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0590 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0277 f1652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public AbstractC1724 f1653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC1655 f1654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC1724 f1655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1655 f1656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final FlowLayoutOverflow$OverflowType f1657;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0277 f1658;

    public C0590(FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType) {
        this.f1657 = flowLayoutOverflow$OverflowType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0590) && this.f1657 == ((C0590) obj).f1657;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0053.m144(0, this.f1657.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f1657 + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1368(InterfaceC1698 interfaceC1698, InterfaceC1698 interfaceC16982, long j) {
        long jM1422 = AbstractC0628.m1422(j, LayoutOrientation.Horizontal);
        if (interfaceC1698 != null) {
            int iMo3059 = interfaceC1698.mo3059(C7898.m13338(jM1422));
            this.f1652 = new C0277(C0277.m854(iMo3059, interfaceC1698.mo3054(iMo3059)));
            this.f1656 = interfaceC1698 instanceof InterfaceC1655 ? (InterfaceC1655) interfaceC1698 : null;
            this.f1655 = null;
        }
        if (interfaceC16982 != null) {
            int iMo30592 = interfaceC16982.mo3059(C7898.m13338(jM1422));
            this.f1658 = new C0277(C0277.m854(iMo30592, interfaceC16982.mo3054(iMo30592)));
            this.f1654 = interfaceC16982 instanceof InterfaceC1655 ? (InterfaceC1655) interfaceC16982 : null;
            this.f1653 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0277 m1369(int i, int i2, boolean z) {
        int i3 = AbstractC0589.f1651[this.f1657.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            if (z) {
                return this.f1652;
            }
            return null;
        }
        if (i3 != 4) {
            C4211.m8611();
            return null;
        }
        if (z) {
            return this.f1652;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f1658;
    }
}
