package androidx.activity.compose;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5175;
import kotlin.InterfaceC5167;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p351.AbstractC8869;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0001 implements InterfaceC6553 {

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

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4;
        C5175 c5175 = C5175.f14739;
        Object obj3 = this.f3;
        boolean z = this.f2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0455.m1153(z, (InterfaceC6542) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0983.m1879((C0882) obj3, z, (InterfaceC1373) obj, AbstractC1367.m2460(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8869.m14516(z, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(385));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0001(boolean z, InterfaceC5167 interfaceC5167, int i, int i2) {
        this.f4 = i2;
        this.f2 = z;
        this.f3 = interfaceC5167;
    }
}
