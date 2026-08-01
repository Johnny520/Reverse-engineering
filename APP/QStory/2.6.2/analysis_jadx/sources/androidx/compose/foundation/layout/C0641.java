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
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.Ref$IntRef;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import top.suzhelan.qstory.ui.components.C5961;
import top.suzhelan.qstory.ui.components.C5967;
import top.suzhelan.qstory.ui.components.C5975;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0641 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1798;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1799;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1800;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f1801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f1802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1804 = 1;

    public /* synthetic */ C0641(List list, InterfaceC6557 interfaceC6557, InterfaceC6553 interfaceC6553, InterfaceC6553 interfaceC65532, InterfaceC6553 interfaceC65533, InterfaceC1398 interfaceC1398) {
        this.f1802 = list;
        this.f1803 = interfaceC6557;
        this.f1799 = interfaceC6553;
        this.f1798 = interfaceC65532;
        this.f1800 = interfaceC65533;
        this.f1801 = interfaceC1398;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1804;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f1801;
        Object obj3 = this.f1800;
        Object obj4 = this.f1798;
        Object obj5 = this.f1799;
        Object obj6 = this.f1803;
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
                    AbstractC0643.m1443(abstractC1708, abstractC1724, (InterfaceC1655) this.f1802.get(i3), interfaceC1653.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, c0642.f1806);
                    i2++;
                    i3++;
                }
                break;
            default:
                InterfaceC1398 interfaceC1398 = (InterfaceC1398) obj2;
                C0760 c0760 = (C0760) obj;
                AbstractC3056.m6668(-3937306677649606055L);
                c0760.getClass();
                C5961 c5961 = new C5961(objArr == true ? 1 : 0, 1);
                List list = this.f1802;
                c0760.f2223.m1467(list.size(), new C0108(new C1311(c5961, 6, list), new C5975(0, list), new C1242(2039820996, true, new C5967(list, list, (InterfaceC6557) obj6, (InterfaceC6553) obj5, (InterfaceC6553) obj4, (InterfaceC6553) obj3, interfaceC1398)), 2));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0641(AbstractC1724[] abstractC1724Arr, List list, InterfaceC1653 interfaceC1653, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, C0642 c0642) {
        this.f1803 = abstractC1724Arr;
        this.f1802 = list;
        this.f1799 = interfaceC1653;
        this.f1798 = ref$IntRef;
        this.f1800 = ref$IntRef2;
        this.f1801 = c0642;
    }
}
