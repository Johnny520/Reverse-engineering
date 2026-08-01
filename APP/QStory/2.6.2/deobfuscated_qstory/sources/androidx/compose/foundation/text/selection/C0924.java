package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0924 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2625;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2626;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2629 = 0;

    public /* synthetic */ C0924(InterfaceC2129 interfaceC2129, InterfaceC6542 interfaceC6542, boolean z, int i) {
        this.f2626 = interfaceC2129;
        this.f2625 = interfaceC6542;
        this.f2627 = z;
        this.f2628 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2629;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f2628;
        Object obj3 = this.f2625;
        Object obj4 = this.f2626;
        boolean z = this.f2627;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0895.m1794((InterfaceC2129) obj4, (InterfaceC6542) obj3, z, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0895.m1792(z, (ResolvedTextDirection) obj4, (C0882) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0924(boolean z, ResolvedTextDirection resolvedTextDirection, C0882 c0882, int i) {
        this.f2627 = z;
        this.f2626 = resolvedTextDirection;
        this.f2625 = c0882;
        this.f2628 = i;
    }
}
