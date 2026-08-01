package androidx.compose.ui.node;

import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;
import p205.InterfaceC7895;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class LayoutNodeDrawScope$record$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $block;
    final /* synthetic */ InterfaceC1781 $currentDrawNode;
    final /* synthetic */ C1758 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeDrawScope$record$1(C1758 c1758, InterfaceC1781 interfaceC1781, InterfaceC6557 interfaceC6557) {
        super(1);
        this.this$0 = c1758;
        this.$currentDrawNode = interfaceC1781;
        this.$block = interfaceC6557;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.node.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.node.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.appcompat.app.飘花落叶言子苏楪世兰哲] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void invoke(InterfaceC1504 interfaceC1504) throws Throwable {
        C1758 c1758 = this.this$0;
        ?? Mo2696 = c1758.f5174;
        c1758.f5174 = this.$currentDrawNode;
        try {
            InterfaceC7895 interfaceC7895M388 = interfaceC1504.mo2696().m388();
            LayoutDirection layoutDirectionM369 = interfaceC1504.mo2696().m369();
            InterfaceC1601 interfaceC1601M385 = interfaceC1504.mo2696().m385();
            long jM367 = interfaceC1504.mo2696().m367();
            C1516 c1516 = (C1516) interfaceC1504.mo2696().f320;
            InterfaceC6557 interfaceC6557 = this.$block;
            InterfaceC7895 interfaceC7895M3882 = c1758.mo2696().m388();
            LayoutDirection layoutDirectionM3692 = c1758.mo2696().m369();
            InterfaceC1601 interfaceC1601M3852 = c1758.mo2696().m385();
            long jM3672 = c1758.mo2696().m367();
            C1516 c15162 = (C1516) c1758.mo2696().f320;
            try {
                Mo2696 = c1758.mo2696();
                Mo2696.m363(interfaceC7895M388);
                Mo2696.m359(layoutDirectionM369);
                Mo2696.m364(interfaceC1601M385);
                Mo2696.m360(jM367);
                Mo2696.f320 = c1516;
                interfaceC1601M385.mo2667();
                try {
                    interfaceC6557.invoke(c1758);
                    interfaceC1601M385.mo2679();
                    C0108 c0108Mo2696 = c1758.mo2696();
                    c0108Mo2696.m363(interfaceC7895M3882);
                    c0108Mo2696.m359(layoutDirectionM3692);
                    c0108Mo2696.m364(interfaceC1601M3852);
                    c0108Mo2696.m360(jM3672);
                    c0108Mo2696.f320 = c15162;
                    this.this$0.f5174 = Mo2696;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                Mo2696 = Mo2696;
                this.this$0.f5174 = Mo2696;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.this$0.f5174 = Mo2696;
            throw th;
        }
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
        invoke((InterfaceC1504) obj);
        return C5175.f14739;
    }
}
