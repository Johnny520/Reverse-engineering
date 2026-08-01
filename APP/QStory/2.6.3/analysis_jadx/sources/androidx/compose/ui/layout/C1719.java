package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1372;
import androidx.compose.ui.node.C1748;
import kotlin.C5176;
import p052.InterfaceC6554;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1719 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1661 f4990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1717 f4991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6554 f4989 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
        {
            super(2);
        }

        public final void invoke(C1748 c1748, C1719 c1719) {
            C1719 c17192 = this.this$0;
            C1661 c1661 = c1748.f5131;
            if (c1661 == null) {
                c1661 = new C1661(c1748, c17192.f4991);
                c1748.f5131 = c1661;
            }
            c17192.f4990 = c1661;
            this.this$0.m3136().m3067();
            C1661 c1661M3136 = this.this$0.m3136();
            InterfaceC1717 interfaceC1717 = this.this$0.f4991;
            if (c1661M3136.f4873 != interfaceC1717) {
                c1661M3136.f4873 = interfaceC1717;
                c1661M3136.m3071(false);
                C1748.m3224(c1661M3136.f4874, false, 7);
            }
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C1748) obj, (C1719) obj2);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6554 f4988 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
        {
            super(2);
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C1748) obj, (AbstractC1372) obj2);
            return C5176.f14739;
        }

        public final void invoke(C1748 c1748, AbstractC1372 abstractC1372) {
            this.this$0.m3136().f4872 = abstractC1372;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6554 f4987 = new InterfaceC6554() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
        {
            super(2);
        }

        public final void invoke(C1748 c1748, InterfaceC6554 interfaceC6554) {
            C1661 c1661M3136 = this.this$0.m3136();
            c1748.m3271(new C1673(c1661M3136, interfaceC6554, c1661M3136.f4865));
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C1748) obj, (InterfaceC6554) obj2);
            return C5176.f14739;
        }
    };

    public C1719(InterfaceC1717 interfaceC1717) {
        this.f4991 = interfaceC1717;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1661 m3136() {
        C1661 c1661 = this.f4990;
        if (c1661 != null) {
            return c1661;
        }
        C5925.m11310("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
