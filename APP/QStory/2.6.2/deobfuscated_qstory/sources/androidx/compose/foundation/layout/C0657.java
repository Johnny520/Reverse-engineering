package androidx.compose.foundation.layout;

import androidx.collection.C0252;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0948;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.C0998;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.internal.C1241;
import androidx.compose.runtime.snapshots.InterfaceC1257;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.text.input.C2004;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import p052.InterfaceC6557;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0657 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1833;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f1835;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1836;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1837;

    public /* synthetic */ C0657(AbstractC1724[] abstractC1724Arr, C0660 c0660, int i, int[] iArr) {
        this.f1837 = 0;
        this.f1836 = abstractC1724Arr;
        this.f1834 = c0660;
        this.f1835 = i;
        this.f1833 = iArr;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int iM3847;
        int i = this.f1837;
        int i2 = 0;
        C5175 c5175 = C5175.f14739;
        int i3 = this.f1835;
        Object obj2 = this.f1833;
        Object obj3 = this.f1834;
        Object obj4 = this.f1836;
        switch (i) {
            case 0:
                AbstractC1724[] abstractC1724Arr = (AbstractC1724[]) obj4;
                C0660 c0660 = (C0660) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int length = abstractC1724Arr.length;
                int i4 = 0;
                while (i2 < length) {
                    AbstractC1724 abstractC1724 = abstractC1724Arr[i2];
                    int i5 = i4 + 1;
                    abstractC1724.getClass();
                    Object objMo3046 = abstractC1724.mo3046();
                    C0662 c0662 = objMo3046 instanceof C0662 ? (C0662) objMo3046 : null;
                    C0598 c0598 = c0662 != null ? c0662.f1841 : null;
                    if (c0598 != null) {
                        int i6 = abstractC1724.f4996;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        iM3847 = c0598.f1677.m3847(i6, i3);
                    } else {
                        iM3847 = c0660.f1839.m3847(abstractC1724.f4996, i3);
                    }
                    abstractC1708.m3125(abstractC1724, iArr[i4], iM3847, 0.0f);
                    i2++;
                    i4 = i5;
                }
                return c5175;
            case 1:
                C0948 c0948 = (C0948) obj4;
                InterfaceC1653 interfaceC1653 = (InterfaceC1653) obj3;
                AbstractC1724 abstractC17242 = (AbstractC1724) obj2;
                AbstractC1708 abstractC17082 = (AbstractC1708) obj;
                int i7 = c0948.f2697;
                C0998 c0998 = c0948.f2699;
                C2004 c2004 = c0948.f2698;
                C0963 c0963 = (C0963) c0948.f2696.invoke();
                c0998.m1908(Orientation.Horizontal, AbstractC0983.m1897(abstractC17082, i7, c2004, c0963 != null ? c0963.f2744 : null, interfaceC1653.getLayoutDirection() == LayoutDirection.Rtl, abstractC17242.f4998), i3, abstractC17242.f4998);
                AbstractC1708.m3122(abstractC17082, abstractC17242, Math.round(-c0998.m1909()), 0);
                return c5175;
            default:
                C1241 c1241 = (C1241) obj3;
                C0252 c0252 = (C0252) obj2;
                if (obj == ((C1362) obj4)) {
                    C5919.m11250("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof InterfaceC1257) {
                    int i8 = c1241.f3596 - i3;
                    int iM803 = c0252.m803(obj);
                    c0252.m807(Math.min(i8, iM803 >= 0 ? c0252.f916[iM803] : Integer.MAX_VALUE), obj);
                }
                return c5175;
        }
    }

    public /* synthetic */ C0657(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f1837 = i2;
        this.f1836 = obj;
        this.f1834 = obj2;
        this.f1833 = obj3;
        this.f1835 = i;
    }
}
