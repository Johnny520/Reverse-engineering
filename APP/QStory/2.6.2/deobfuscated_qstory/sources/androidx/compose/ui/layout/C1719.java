package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1372;
import androidx.compose.ui.node.C1748;
import kotlin.C5175;
import p052.InterfaceC6553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1719 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1661 f4989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1717 f4990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6553 f4988 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
        {
            super(2);
        }

        public final void invoke(C1748 c1748, C1719 c1719) {
            C1719 c17192 = this.this$0;
            C1661 c1661 = c1748.f5130;
            if (c1661 == null) {
                c1661 = new C1661(c1748, c17192.f4990);
                c1748.f5130 = c1661;
            }
            c17192.f4989 = c1661;
            this.this$0.m3126().m3057();
            C1661 c1661M3126 = this.this$0.m3126();
            InterfaceC1717 interfaceC1717 = this.this$0.f4990;
            if (c1661M3126.f4872 != interfaceC1717) {
                c1661M3126.f4872 = interfaceC1717;
                c1661M3126.m3061(false);
                C1748.m3214(c1661M3126.f4873, false, 7);
            }
        }

        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C1748) obj, (C1719) obj2);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6553 f4987 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
        {
            super(2);
        }

        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C1748) obj, (AbstractC1372) obj2);
            return C5175.f14739;
        }

        public final void invoke(C1748 c1748, AbstractC1372 abstractC1372) {
            this.this$0.m3126().f4871 = abstractC1372;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6553 f4986 = new InterfaceC6553() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
        {
            super(2);
        }

        public final void invoke(C1748 c1748, InterfaceC6553 interfaceC6553) {
            C1661 c1661M3126 = this.this$0.m3126();
            c1748.m3261(new C1673(c1661M3126, interfaceC6553, c1661M3126.f4864));
        }

        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C1748) obj, (InterfaceC6553) obj2);
            return C5175.f14739;
        }
    };

    public C1719(InterfaceC1717 interfaceC1717) {
        this.f4990 = interfaceC1717;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1661 m3126() {
        C1661 c1661 = this.f4989;
        if (c1661 != null) {
            return c1661;
        }
        C5919.m11249("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
