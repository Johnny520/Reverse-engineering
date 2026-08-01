package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1915;
import androidx.compose.p001ui.C2964;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.Ref$IntRef;
import p068.InterfaceC7387;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1483 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f2151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2964 f2152;

    public C1483(C2964 c2964, boolean z) {
        this.f2152 = c2964;
        this.f2151 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1483)) {
            return false;
        }
        C1483 c1483 = (C1483) obj;
        return this.f2152.equals(c1483.f2152) && this.f2151 == c1483.f2151;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2151) + (this.f2152.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.f2152);
        sb.append(", propagateMinConstraints=");
        return AbstractC0900.m712(sb, this.f2151, ')');
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(final InterfaceC2488 interfaceC2488, List list, long j) {
        if (list.isEmpty()) {
            return interfaceC2488.mo2055(C8727.m13900(j), C8727.m13899(j), AbstractC5171.m9335(), new C1915(2));
        }
        long j2 = this.f2151 ? j : (-8589934589L) & j;
        if (list.size() == 1) {
            final InterfaceC2490 interfaceC2490 = (InterfaceC2490) list.get(0);
            interfaceC2490.mo3616();
            final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j2);
            final int iMax = Math.max(C8727.m13900(j), abstractC2559Mo3615.f5344);
            final int iMax2 = Math.max(C8727.m13899(j), abstractC2559Mo3615.f5342);
            return interfaceC2488.mo2055(iMax, iMax2, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.foundation.layout.飘花落叶言子楪哲苏兰世
                @Override // p068.InterfaceC7387
                public final Object invoke(Object obj) {
                    AbstractC1484.m2013((AbstractC2543) obj, abstractC2559Mo3615, interfaceC2490, interfaceC2488.getLayoutDirection(), iMax, iMax2, this.f2152);
                    return C6008.f15084;
                }
            });
        }
        AbstractC2559[] abstractC2559Arr = new AbstractC2559[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = C8727.m13900(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = C8727.m13899(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2490 interfaceC24902 = (InterfaceC2490) list.get(i);
            interfaceC24902.mo3616();
            AbstractC2559 abstractC2559Mo36152 = interfaceC24902.mo3615(j2);
            abstractC2559Arr[i] = abstractC2559Mo36152;
            ref$IntRef.element = Math.max(ref$IntRef.element, abstractC2559Mo36152.f5344);
            ref$IntRef2.element = Math.max(ref$IntRef2.element, abstractC2559Mo36152.f5342);
        }
        return interfaceC2488.mo2055(ref$IntRef.element, ref$IntRef2.element, AbstractC5171.m9335(), new C1482(abstractC2559Arr, list, interfaceC2488, ref$IntRef, ref$IntRef2, this));
    }
}
