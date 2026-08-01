package androidx.compose.foundation.layout;

import androidx.collection.C1099;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1786;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.C1836;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.text.input.C2838;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.internal.C2076;
import androidx.compose.runtime.snapshots.InterfaceC2092;
import kotlin.C6008;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1498 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2179;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2183;

    public /* synthetic */ C1498(AbstractC2559[] abstractC2559Arr, C1501 c1501, int i, int[] iArr) {
        this.f2183 = 0;
        this.f2182 = abstractC2559Arr;
        this.f2180 = c1501;
        this.f2181 = i;
        this.f2179 = iArr;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int iM4417;
        int i = this.f2183;
        int i2 = 0;
        C6008 c6008 = C6008.f15084;
        int i3 = this.f2181;
        Object obj2 = this.f2179;
        Object obj3 = this.f2180;
        Object obj4 = this.f2182;
        switch (i) {
            case 0:
                AbstractC2559[] abstractC2559Arr = (AbstractC2559[]) obj4;
                C1501 c1501 = (C1501) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                int length = abstractC2559Arr.length;
                int i4 = 0;
                while (i2 < length) {
                    AbstractC2559 abstractC2559 = abstractC2559Arr[i2];
                    int i5 = i4 + 1;
                    abstractC2559.getClass();
                    Object objMo3616 = abstractC2559.mo3616();
                    C1503 c1503 = objMo3616 instanceof C1503 ? (C1503) objMo3616 : null;
                    C1439 c1439 = c1503 != null ? c1503.f2187 : null;
                    if (c1439 != null) {
                        int i6 = abstractC2559.f5342;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        iM4417 = c1439.f2023.m4417(i6, i3);
                    } else {
                        iM4417 = c1501.f2185.m4417(abstractC2559.f5342, i3);
                    }
                    abstractC2543.m3695(abstractC2559, iArr[i4], iM4417, 0.0f);
                    i2++;
                    i4 = i5;
                }
                return c6008;
            case 1:
                C1786 c1786 = (C1786) obj4;
                InterfaceC2488 interfaceC2488 = (InterfaceC2488) obj3;
                AbstractC2559 abstractC25592 = (AbstractC2559) obj2;
                AbstractC2543 abstractC25432 = (AbstractC2543) obj;
                int i7 = c1786.f3043;
                C1836 c1836 = c1786.f3045;
                C2838 c2838 = c1786.f3044;
                C1801 c1801 = (C1801) c1786.f3042.invoke();
                c1836.m2478(Orientation.Horizontal, AbstractC1821.m2467(abstractC25432, i7, c2838, c1801 != null ? c1801.f3090 : null, interfaceC2488.getLayoutDirection() == LayoutDirection.Rtl, abstractC25592.f5344), i3, abstractC25592.f5344);
                AbstractC2543.m3692(abstractC25432, abstractC25592, Math.round(-c1836.m2479()), 0);
                return c6008;
            default:
                C2076 c2076 = (C2076) obj3;
                C1099 c1099 = (C1099) obj2;
                if (obj == ((C2197) obj4)) {
                    C6755.m11870("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof InterfaceC2092) {
                    int i8 = c2076.f3942 - i3;
                    int iM1364 = c1099.m1364(obj);
                    c1099.m1368(Math.min(i8, iM1364 >= 0 ? c1099.f1261[iM1364] : Integer.MAX_VALUE), obj);
                }
                return c6008;
        }
    }

    public /* synthetic */ C1498(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f2183 = i2;
        this.f2182 = obj;
        this.f2180 = obj2;
        this.f2179 = obj3;
        this.f2181 = i;
    }
}
