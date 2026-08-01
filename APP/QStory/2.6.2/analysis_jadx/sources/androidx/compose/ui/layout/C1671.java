package androidx.compose.ui.layout;

import androidx.collection.AbstractC0274;
import androidx.collection.C0242;
import androidx.collection.C0245;
import androidx.compose.foundation.lazy.layout.C0723;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1757;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1671 implements InterfaceC1718 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f4894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0245 f4896;

    public C1671(C1661 c1661, Object obj) {
        this.f4895 = c1661;
        this.f4894 = obj;
        int[] iArr = AbstractC0274.f979;
        this.f4896 = new C0245();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    public final void dispose() {
        C1661.m3052(this.f4895, this.f4894);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo3105(int i, long j) {
        C1661 c1661 = this.f4895;
        C1748 c1748 = (C1748) c1661.f4863.m756(this.f4894);
        if (c1748 == null || !c1748.m3233()) {
            return;
        }
        int i2 = ((C1224) ((C0242) c1748.m3247()).f894).f3519;
        if (i < 0 || i >= i2) {
            AbstractC7935.m13393("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (c1748.m3232()) {
            AbstractC7935.m13397("Pre-measure called on node that is not placed");
        }
        C1748 c17482 = c1661.f4873;
        c17482.f5113 = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).m3533((C1748) ((C0242) c1748.m3247()).get(i), j);
        c17482.f5113 = false;
        this.f4896.m784(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo3106() {
        C1748 c1748 = (C1748) this.f4895.f4863.m756(this.f4894);
        if (c1748 != null) {
            return ((C1224) ((C0242) c1748.m3247()).f894).f3519;
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3107(C0723 c0723) {
        C1811 c1811;
        C1748 c1748 = (C1748) this.f4895.f4863.m756(this.f4894);
        AbstractC2128 abstractC2128 = (c1748 == null || (c1811 = c1748.f5093) == null) ? null : c1811.f5282;
        if (abstractC2128 == null || !abstractC2128.f6278) {
            return;
        }
        AbstractC1785.m3324(abstractC2128, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0723);
    }
}
