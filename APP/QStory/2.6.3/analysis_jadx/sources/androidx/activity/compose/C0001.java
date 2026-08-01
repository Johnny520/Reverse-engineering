package androidx.activity.compose;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import kotlin.InterfaceC5168;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p351.AbstractC8861;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0001 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4;

    public /* synthetic */ C0001(C0882 c0882, boolean z, int i) {
        this.f4 = 1;
        this.f3 = c0882;
        this.f2 = z;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f3;
        boolean z = this.f2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0455.m1161(z, (InterfaceC6543) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0983.m1889((C0882) obj3, z, (InterfaceC1373) obj, AbstractC1367.m2471(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8861.m14523(z, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(385));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0001(boolean z, InterfaceC5168 interfaceC5168, int i, int i2) {
        this.f4 = i2;
        this.f2 = z;
        this.f3 = interfaceC5168;
    }
}
