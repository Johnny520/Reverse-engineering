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
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1671 implements InterfaceC1718 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f4895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0245 f4897;

    public C1671(C1661 c1661, Object obj) {
        this.f4896 = c1661;
        this.f4895 = obj;
        int[] iArr = AbstractC0274.f979;
        this.f4897 = new C0245();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    public final void dispose() {
        C1661.m3062(this.f4896, this.f4895);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo3115(int i, long j) {
        C1661 c1661 = this.f4896;
        C1748 c1748 = (C1748) c1661.f4864.m757(this.f4895);
        if (c1748 == null || !c1748.m3243()) {
            return;
        }
        int i2 = ((C1224) ((C0242) c1748.m3257()).f894).f3520;
        if (i < 0 || i >= i2) {
            AbstractC7936.m13421("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (c1748.m3242()) {
            AbstractC7936.m13425("Pre-measure called on node that is not placed");
        }
        C1748 c17482 = c1661.f4874;
        c17482.f5114 = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).m3543((C1748) ((C0242) c1748.m3257()).get(i), j);
        c17482.f5114 = false;
        this.f4897.m785(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo3116() {
        C1748 c1748 = (C1748) this.f4896.f4864.m757(this.f4895);
        if (c1748 != null) {
            return ((C1224) ((C0242) c1748.m3257()).f894).f3520;
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1718
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3117(C0723 c0723) {
        C1811 c1811;
        C1748 c1748 = (C1748) this.f4896.f4864.m757(this.f4895);
        AbstractC2128 abstractC2128 = (c1748 == null || (c1811 = c1748.f5094) == null) ? null : c1811.f5283;
        if (abstractC2128 == null || !abstractC2128.f6279) {
            return;
        }
        AbstractC1785.m3334(abstractC2128, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0723);
    }
}
