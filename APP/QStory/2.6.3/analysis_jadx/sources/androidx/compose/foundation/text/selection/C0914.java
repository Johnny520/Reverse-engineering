package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0943;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1695;
import java.util.ArrayList;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p112.C7328;
import p112.C7329;
import p175.AbstractC7739;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0914 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2597;

    public /* synthetic */ C0914(Object obj, int i) {
        this.f2597 = i;
        this.f2596 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        InterfaceC1695 interfaceC1695M1866;
        int i = this.f2597;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2596;
        switch (i) {
            case 0:
                C1643 c1643 = (C1643) obj;
                if (((InterfaceC0926) obj2).mo1781(c1643.f4807)) {
                    c1643.m3024();
                }
                return c5176;
            case 1:
                ArrayList arrayList = (ArrayList) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    abstractC1708.m3135((AbstractC1724) arrayList.get(i2), 0, 0, 0.0f);
                }
                return c5176;
            case 2:
                C0882 c0882 = (C0882) obj2;
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) obj;
                C7328 c7328M1766 = c0882.m1766();
                C0943 c0943 = c0882.f2487;
                if (c0943 == null || (interfaceC1695M1866 = c0943.m1866()) == null) {
                    return null;
                }
                return (interfaceC1695M1866.mo3086() && interfaceC1695.mo3086()) ? AbstractC7739.m13070(interfaceC1695.mo3081(AbstractC1670.m3113(interfaceC1695M1866), c7328M1766.m12518()), c7328M1766.m12519()) : C7328.f19536;
            default:
                return (C7329) ((InterfaceC6543) obj2).invoke();
        }
    }
}
