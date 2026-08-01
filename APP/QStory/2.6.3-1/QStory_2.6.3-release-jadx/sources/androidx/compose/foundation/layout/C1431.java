package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.collection.C1124;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2533;
import io.ktor.util.C5043;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1124 f1997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public AbstractC2559 f1998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2490 f1999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC2559 f2000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2490 f2001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final FlowLayoutOverflow$OverflowType f2002;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C1124 f2003;

    public C1431(FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType) {
        this.f2002 = flowLayoutOverflow$OverflowType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1431) && this.f2002 == ((C1431) obj).f2002;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0900.m704(0, this.f2002.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f2002 + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1928(InterfaceC2533 interfaceC2533, InterfaceC2533 interfaceC25332, long j) {
        long jM1982 = AbstractC1469.m1982(j, LayoutOrientation.Horizontal);
        if (interfaceC2533 != null) {
            int iMo3619 = interfaceC2533.mo3619(C8727.m13897(jM1982));
            this.f1997 = new C1124(C1124.m1414(iMo3619, interfaceC2533.mo3614(iMo3619)));
            this.f2001 = interfaceC2533 instanceof InterfaceC2490 ? (InterfaceC2490) interfaceC2533 : null;
            this.f2000 = null;
        }
        if (interfaceC25332 != null) {
            int iMo36192 = interfaceC25332.mo3619(C8727.m13897(jM1982));
            this.f2003 = new C1124(C1124.m1414(iMo36192, interfaceC25332.mo3614(iMo36192)));
            this.f1999 = interfaceC25332 instanceof InterfaceC2490 ? (InterfaceC2490) interfaceC25332 : null;
            this.f1998 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1124 m1929(int i, int i2, boolean z) {
        int i3 = AbstractC1430.f1996[this.f2002.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            if (z) {
                return this.f1997;
            }
            return null;
        }
        if (i3 != 4) {
            C5043.m9170();
            return null;
        }
        if (z) {
            return this.f1997;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f2003;
    }
}
