package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.C2583;
import androidx.compose.runtime.AbstractC2207;
import kotlin.C6008;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2496 f5335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2552 f5336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7383 f5334 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
        {
            super(2);
        }

        public final void invoke(C2583 c2583, C2554 c2554) {
            C2554 c25542 = this.this$0;
            C2496 c2496 = c2583.f5476;
            if (c2496 == null) {
                c2496 = new C2496(c2583, c25542.f5336);
                c2583.f5476 = c2496;
            }
            c25542.f5335 = c2496;
            this.this$0.m3696().m3627();
            C2496 c2496M3696 = this.this$0.m3696();
            InterfaceC2552 interfaceC2552 = this.this$0.f5336;
            if (c2496M3696.f5218 != interfaceC2552) {
                c2496M3696.f5218 = interfaceC2552;
                c2496M3696.m3631(false);
                C2583.m3784(c2496M3696.f5219, false, 7);
            }
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C2583) obj, (C2554) obj2);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7383 f5333 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
        {
            super(2);
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C2583) obj, (AbstractC2207) obj2);
            return C6008.f15084;
        }

        public final void invoke(C2583 c2583, AbstractC2207 abstractC2207) {
            this.this$0.m3696().f5217 = abstractC2207;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7383 f5332 = new InterfaceC7383() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
        {
            super(2);
        }

        public final void invoke(C2583 c2583, InterfaceC7383 interfaceC7383) {
            C2496 c2496M3696 = this.this$0.m3696();
            c2583.m3831(new C2508(c2496M3696, interfaceC7383, c2496M3696.f5210));
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C2583) obj, (InterfaceC7383) obj2);
            return C6008.f15084;
        }
    };

    public C2554(InterfaceC2552 interfaceC2552) {
        this.f5336 = interfaceC2552;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2496 m3696() {
        C2496 c2496 = this.f5335;
        if (c2496 != null) {
            return c2496;
        }
        C6755.m11869("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
