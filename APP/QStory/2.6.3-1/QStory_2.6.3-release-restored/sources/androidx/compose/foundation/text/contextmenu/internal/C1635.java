package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.p001ui.layout.InterfaceC2530;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p128.C8157;
import p137.C8217;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1635 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1654 f2619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1667 f2620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2621;

    public /* synthetic */ C1635(C1654 c1654, InterfaceC1667 interfaceC1667, int i) {
        this.f2621 = i;
        this.f2619 = c1654;
        this.f2620 = interfaceC1667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f2621;
        int i2 = 0;
        InterfaceC1667 interfaceC1667 = this.f2620;
        C1654 c1654 = this.f2619;
        switch (i) {
            case 0:
                C1636 c1636 = c1654.f2665;
                C1634 c1634 = new C1634(interfaceC1667, 0);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c1654.f2666.m2806("dataBuilder", c1636, new C1633(ref$ObjectRef, i2, c1634));
                T t = ref$ObjectRef.element;
                if (t != 0) {
                    return (C8217) t;
                }
                AbstractC5227.m9467("result");
                throw null;
            case 1:
                C1636 c16362 = c1654.f2672;
                C1635 c1635 = new C1635(c1654, interfaceC1667, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                c1654.f2666.m2806("positioner", c16362, new C1633(ref$ObjectRef2, i2, c1635));
                T t2 = ref$ObjectRef2.element;
                if (t2 != 0) {
                    return (C8157) t2;
                }
                AbstractC5227.m9467("result");
                throw null;
            default:
                Object objInvoke = c1654.f2668.invoke();
                InterfaceC2530 interfaceC2530 = (InterfaceC2530) (((InterfaceC2530) objInvoke).mo3646() ? objInvoke : null);
                return interfaceC2530 == null ? C8157.f19881 : interfaceC1667.mo2201(interfaceC2530).m13083(interfaceC2530.mo3636(0L));
        }
    }
}
