package androidx.compose.foundation.layout;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.lazy.C0760;
import androidx.compose.runtime.C1311;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import java.util.List;
import kotlin.C5176;
import kotlin.jvm.internal.Ref$IntRef;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import top.suzhelan.qstory.ui.components.C5967;
import top.suzhelan.qstory.ui.components.C5973;
import top.suzhelan.qstory.ui.components.C5981;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0641 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1799;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1800;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1801;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f1802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f1803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1805 = 1;

    public /* synthetic */ C0641(List list, InterfaceC6558 interfaceC6558, InterfaceC6554 interfaceC6554, InterfaceC6554 interfaceC65542, InterfaceC6554 interfaceC65543, InterfaceC1398 interfaceC1398) {
        this.f1803 = list;
        this.f1804 = interfaceC6558;
        this.f1800 = interfaceC6554;
        this.f1799 = interfaceC65542;
        this.f1801 = interfaceC65543;
        this.f1802 = interfaceC1398;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1805;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f1802;
        Object obj3 = this.f1801;
        Object obj4 = this.f1799;
        Object obj5 = this.f1800;
        Object obj6 = this.f1804;
        int i2 = 0;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                AbstractC1724[] abstractC1724Arr = (AbstractC1724[]) obj6;
                InterfaceC1653 interfaceC1653 = (InterfaceC1653) obj5;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                C0642 c0642 = (C0642) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int length = abstractC1724Arr.length;
                int i3 = 0;
                while (i2 < length) {
                    AbstractC1724 abstractC1724 = abstractC1724Arr[i2];
                    abstractC1724.getClass();
                    AbstractC0643.m1453(abstractC1708, abstractC1724, (InterfaceC1655) this.f1803.get(i3), interfaceC1653.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, c0642.f1807);
                    i2++;
                    i3++;
                }
                break;
            default:
                InterfaceC1398 interfaceC1398 = (InterfaceC1398) obj2;
                C0760 c0760 = (C0760) obj;
                AbstractC8405.m13972(2966);
                c0760.getClass();
                C5967 c5967 = new C5967(objArr == true ? 1 : 0, 1);
                List list = this.f1803;
                c0760.f2224.m1477(list.size(), new C0108(new C1311(c5967, 6, list), new C5981(0, list), new C1242(2039820996, true, new C5973(list, list, (InterfaceC6558) obj6, (InterfaceC6554) obj5, (InterfaceC6554) obj4, (InterfaceC6554) obj3, interfaceC1398)), 2));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0641(AbstractC1724[] abstractC1724Arr, List list, InterfaceC1653 interfaceC1653, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, C0642 c0642) {
        this.f1804 = abstractC1724Arr;
        this.f1803 = list;
        this.f1800 = interfaceC1653;
        this.f1799 = ref$IntRef;
        this.f1801 = ref$IntRef2;
        this.f1802 = c0642;
    }
}
