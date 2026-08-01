package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0943;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1695;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p112.C7327;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0914 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2595;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2596;

    public /* synthetic */ C0914(Object obj, int i) {
        this.f2596 = i;
        this.f2595 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        InterfaceC1695 interfaceC1695M1856;
        int i = this.f2596;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2595;
        switch (i) {
            case 0:
                C1643 c1643 = (C1643) obj;
                if (((InterfaceC0926) obj2).mo1771(c1643.f4806)) {
                    c1643.m3014();
                }
                return c5175;
            case 1:
                ArrayList arrayList = (ArrayList) obj2;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    abstractC1708.m3125((AbstractC1724) arrayList.get(i2), 0, 0, 0.0f);
                }
                return c5175;
            case 2:
                C0882 c0882 = (C0882) obj2;
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) obj;
                C7327 c7327M1756 = c0882.m1756();
                C0943 c0943 = c0882.f2486;
                if (c0943 == null || (interfaceC1695M1856 = c0943.m1856()) == null) {
                    return null;
                }
                return (interfaceC1695M1856.mo3076() && interfaceC1695.mo3076()) ? AbstractC5061.m10034(interfaceC1695.mo3071(AbstractC1670.m3103(interfaceC1695M1856), c7327M1756.m12491()), c7327M1756.m12492()) : C7327.f19541;
            default:
                return (C7328) ((InterfaceC6542) obj2).invoke();
        }
    }
}
