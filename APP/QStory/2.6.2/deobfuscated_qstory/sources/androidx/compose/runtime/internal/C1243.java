package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1243 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3602;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3603;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3604;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3605;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f3606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f3607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3609 = 1;

    public /* synthetic */ C1243(C1242 c1242, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.f3607 = c1242;
        this.f3608 = obj;
        this.f3604 = bool;
        this.f3603 = obj2;
        this.f3602 = obj3;
        this.f3605 = obj4;
        this.f3606 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3609;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f3606;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(i2) | 1;
                this.f3607.m2139(this.f3608, this.f3603, this.f3602, this.f3605, this.f3604, (InterfaceC1373) obj, iM2460);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(i2) | 1;
                this.f3607.m2135(this.f3608, (Boolean) this.f3604, this.f3603, this.f3602, this.f3605, (InterfaceC1373) obj, iM24602);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C1243(C1242 c1242, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3607 = c1242;
        this.f3608 = obj;
        this.f3603 = obj2;
        this.f3602 = obj3;
        this.f3605 = obj4;
        this.f3604 = obj5;
        this.f3606 = i;
    }
}
