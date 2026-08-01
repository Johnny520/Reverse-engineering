package androidx.compose.p001ui.layout;

import androidx.collection.AbstractC1121;
import androidx.collection.C1089;
import androidx.collection.C1092;
import androidx.compose.foundation.lazy.layout.C1564;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2592;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2506 implements InterfaceC2553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f5240;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2496 f5241;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1092 f5242;

    public C2506(C2496 c2496, Object obj) {
        this.f5241 = c2496;
        this.f5240 = obj;
        int[] iArr = AbstractC1121.f1324;
        this.f5242 = new C1092();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2553
    public final void dispose() {
        C2496.m3622(this.f5241, this.f5240);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2553
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo3675(int i, long j) {
        C2496 c2496 = this.f5241;
        C2583 c2583 = (C2583) c2496.f5209.m1317(this.f5240);
        if (c2583 == null || !c2583.m3803()) {
            return;
        }
        int i2 = ((C2059) ((C1089) c2583.m3817()).f1239).f3865;
        if (i < 0 || i >= i2) {
            AbstractC8765.m13980("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (c2583.m3802()) {
            AbstractC8765.m13984("Pre-measure called on node that is not placed");
        }
        C2583 c25832 = c2496.f5219;
        c25832.f5459 = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).m4103((C2583) ((C1089) c2583.m3817()).get(i), j);
        c25832.f5459 = false;
        this.f5242.m1345(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2553
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo3676() {
        C2583 c2583 = (C2583) this.f5241.f5209.m1317(this.f5240);
        if (c2583 != null) {
            return ((C2059) ((C1089) c2583.m3817()).f1239).f3865;
        }
        return 0;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2553
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3677(C1564 c1564) {
        C2646 c2646;
        C2583 c2583 = (C2583) this.f5241.f5209.m1317(this.f5240);
        AbstractC2961 abstractC2961 = (c2583 == null || (c2646 = c2583.f5439) == null) ? null : c2646.f5628;
        if (abstractC2961 == null || !abstractC2961.f6624) {
            return;
        }
        AbstractC2620.m3894(abstractC2961, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c1564);
    }
}
