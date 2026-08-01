package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C1781;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2530;
import java.util.ArrayList;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8157;
import p128.C8158;
import p191.AbstractC8568;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1752 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2941;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2942;

    public /* synthetic */ C1752(Object obj, int i) {
        this.f2942 = i;
        this.f2941 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        InterfaceC2530 interfaceC2530M2426;
        int i = this.f2942;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2941;
        switch (i) {
            case 0:
                C2478 c2478 = (C2478) obj;
                if (((InterfaceC1764) obj2).mo2341(c2478.f5152)) {
                    c2478.m3584();
                }
                return c6008;
            case 1:
                ArrayList arrayList = (ArrayList) obj2;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    abstractC2543.m3695((AbstractC2559) arrayList.get(i2), 0, 0, 0.0f);
                }
                return c6008;
            case 2:
                C1720 c1720 = (C1720) obj2;
                InterfaceC2530 interfaceC2530 = (InterfaceC2530) obj;
                C8157 c8157M2326 = c1720.m2326();
                C1781 c1781 = c1720.f2832;
                if (c1781 == null || (interfaceC2530M2426 = c1781.m2426()) == null) {
                    return null;
                }
                return (interfaceC2530M2426.mo3646() && interfaceC2530.mo3646()) ? AbstractC8568.m13629(interfaceC2530.mo3641(AbstractC2505.m3673(interfaceC2530M2426), c8157M2326.m13077()), c8157M2326.m13078()) : C8157.f19881;
            default:
                return (C8158) ((InterfaceC7372) obj2).invoke();
        }
    }
}
