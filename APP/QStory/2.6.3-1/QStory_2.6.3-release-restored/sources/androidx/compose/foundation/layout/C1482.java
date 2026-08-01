package androidx.compose.foundation.layout;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.lazy.C1601;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.runtime.C2146;
import androidx.compose.runtime.InterfaceC2233;
import androidx.compose.runtime.internal.C2077;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$IntRef;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import top.suzhelan.qstory.p015ui.components.C6797;
import top.suzhelan.qstory.p015ui.components.C6803;
import top.suzhelan.qstory.p015ui.components.C6811;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1482 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2145;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2146;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f2147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f2148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2150 = 1;

    public /* synthetic */ C1482(List list, InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383, InterfaceC7383 interfaceC73832, InterfaceC7383 interfaceC73833, InterfaceC2233 interfaceC2233) {
        this.f2148 = list;
        this.f2149 = interfaceC7387;
        this.f2145 = interfaceC7383;
        this.f2144 = interfaceC73832;
        this.f2146 = interfaceC73833;
        this.f2147 = interfaceC2233;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2150;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2147;
        Object obj3 = this.f2146;
        Object obj4 = this.f2144;
        Object obj5 = this.f2145;
        Object obj6 = this.f2149;
        int i2 = 0;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                AbstractC2559[] abstractC2559Arr = (AbstractC2559[]) obj6;
                InterfaceC2488 interfaceC2488 = (InterfaceC2488) obj5;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                C1483 c1483 = (C1483) obj2;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                int length = abstractC2559Arr.length;
                int i3 = 0;
                while (i2 < length) {
                    AbstractC2559 abstractC2559 = abstractC2559Arr[i2];
                    abstractC2559.getClass();
                    AbstractC1484.m2013(abstractC2543, abstractC2559, (InterfaceC2490) this.f2148.get(i3), interfaceC2488.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, c1483.f2152);
                    i2++;
                    i3++;
                }
                break;
            default:
                InterfaceC2233 interfaceC2233 = (InterfaceC2233) obj2;
                C1601 c1601 = (C1601) obj;
                "$this$LazyColumn";
                c1601.getClass();
                C6797 c6797 = new C6797(objArr == true ? 1 : 0, 1);
                List list = this.f2148;
                c1601.f2569.m2037(list.size(), new C0955(new C2146(c6797, 6, list), new C6811(0, list), new C2077(2039820996, true, new C6803(list, list, (InterfaceC7387) obj6, (InterfaceC7383) obj5, (InterfaceC7383) obj4, (InterfaceC7383) obj3, interfaceC2233)), 2));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1482(AbstractC2559[] abstractC2559Arr, List list, InterfaceC2488 interfaceC2488, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, C1483 c1483) {
        this.f2149 = abstractC2559Arr;
        this.f2148 = list;
        this.f2145 = interfaceC2488;
        this.f2144 = ref$IntRef;
        this.f2146 = ref$IntRef2;
        this.f2147 = c1483;
    }
}
