package androidx.compose.runtime.internal;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.lifecycle.InterfaceC2388;
import kotlin.C5175;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1244 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f3614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3615;

    public /* synthetic */ C1244(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f3615 = i2;
        this.f3611 = obj;
        this.f3613 = obj2;
        this.f3610 = obj3;
        this.f3612 = obj4;
        this.f3614 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3615;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f3614;
        Object obj3 = this.f3611;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(i2) | 1;
                ((C1242) obj3).m2133(this.f3613, this.f3610, this.f3612, (InterfaceC1373) obj, iM2460);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(i2 | 1);
                AbstractC0455.m1151((Boolean) obj3, this.f3613, (InterfaceC2388) this.f3610, (InterfaceC6557) this.f3612, (InterfaceC1373) obj, iM24602);
                break;
        }
        return c5175;
    }
}
