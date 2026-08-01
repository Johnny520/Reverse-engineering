package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1077;
import androidx.compose.ui.C2131;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.Ref$IntRef;
import p052.InterfaceC6557;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0642 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f1805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2131 f1806;

    public C0642(C2131 c2131, boolean z) {
        this.f1806 = c2131;
        this.f1805 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0642)) {
            return false;
        }
        C0642 c0642 = (C0642) obj;
        return this.f1806.equals(c0642.f1806) && this.f1805 == c0642.f1805;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1805) + (this.f1806.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.f1806);
        sb.append(", propagateMinConstraints=");
        return AbstractC0053.m150(sb, this.f1805, ')');
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(final InterfaceC1653 interfaceC1653, List list, long j) {
        if (list.isEmpty()) {
            return interfaceC1653.mo1485(C7897.m13313(j), C7897.m13312(j), AbstractC4338.m8781(), new C1077(2));
        }
        long j2 = this.f1805 ? j : (-8589934589L) & j;
        if (list.size() == 1) {
            final InterfaceC1655 interfaceC1655 = (InterfaceC1655) list.get(0);
            interfaceC1655.mo3046();
            final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j2);
            final int iMax = Math.max(C7897.m13313(j), abstractC1724Mo3045.f4998);
            final int iMax2 = Math.max(C7897.m13312(j), abstractC1724Mo3045.f4996);
            return interfaceC1653.mo1485(iMax, iMax2, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.foundation.layout.飘花落叶言子楪哲苏兰世
                @Override // p052.InterfaceC6557
                public final Object invoke(Object obj) {
                    AbstractC0643.m1443((AbstractC1708) obj, abstractC1724Mo3045, interfaceC1655, interfaceC1653.getLayoutDirection(), iMax, iMax2, this.f1806);
                    return C5175.f14739;
                }
            });
        }
        AbstractC1724[] abstractC1724Arr = new AbstractC1724[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = C7897.m13313(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = C7897.m13312(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1655 interfaceC16552 = (InterfaceC1655) list.get(i);
            interfaceC16552.mo3046();
            AbstractC1724 abstractC1724Mo30452 = interfaceC16552.mo3045(j2);
            abstractC1724Arr[i] = abstractC1724Mo30452;
            ref$IntRef.element = Math.max(ref$IntRef.element, abstractC1724Mo30452.f4998);
            ref$IntRef2.element = Math.max(ref$IntRef2.element, abstractC1724Mo30452.f4996);
        }
        return interfaceC1653.mo1485(ref$IntRef.element, ref$IntRef2.element, AbstractC4338.m8781(), new C0641(abstractC1724Arr, list, interfaceC1653, ref$IntRef, ref$IntRef2, this));
    }
}
