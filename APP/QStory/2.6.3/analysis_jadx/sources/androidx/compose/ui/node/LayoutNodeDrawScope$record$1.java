package androidx.compose.ui.node;

import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class LayoutNodeDrawScope$record$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ InterfaceC1781 $currentDrawNode;
    final /* synthetic */ C1758 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeDrawScope$record$1(C1758 c1758, InterfaceC1781 interfaceC1781, InterfaceC6558 interfaceC6558) {
        super(1);
        this.this$0 = c1758;
        this.$currentDrawNode = interfaceC1781;
        this.$block = interfaceC6558;
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
        ?? Mo2706 = c1758.f5175;
        c1758.f5175 = this.$currentDrawNode;
        try {
            InterfaceC7896 interfaceC7896M389 = interfaceC1504.mo2706().m389();
            LayoutDirection layoutDirectionM370 = interfaceC1504.mo2706().m370();
            InterfaceC1601 interfaceC1601M386 = interfaceC1504.mo2706().m386();
            long jM368 = interfaceC1504.mo2706().m368();
            C1516 c1516 = (C1516) interfaceC1504.mo2706().f320;
            InterfaceC6558 interfaceC6558 = this.$block;
            InterfaceC7896 interfaceC7896M3892 = c1758.mo2706().m389();
            LayoutDirection layoutDirectionM3702 = c1758.mo2706().m370();
            InterfaceC1601 interfaceC1601M3862 = c1758.mo2706().m386();
            long jM3682 = c1758.mo2706().m368();
            C1516 c15162 = (C1516) c1758.mo2706().f320;
            try {
                Mo2706 = c1758.mo2706();
                Mo2706.m364(interfaceC7896M389);
                Mo2706.m360(layoutDirectionM370);
                Mo2706.m365(interfaceC1601M386);
                Mo2706.m361(jM368);
                Mo2706.f320 = c1516;
                interfaceC1601M386.mo2677();
                try {
                    interfaceC6558.invoke(c1758);
                    interfaceC1601M386.mo2689();
                    C0108 c0108Mo2706 = c1758.mo2706();
                    c0108Mo2706.m364(interfaceC7896M3892);
                    c0108Mo2706.m360(layoutDirectionM3702);
                    c0108Mo2706.m365(interfaceC1601M3862);
                    c0108Mo2706.m361(jM3682);
                    c0108Mo2706.f320 = c15162;
                    this.this$0.f5175 = Mo2706;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                Mo2706 = Mo2706;
                this.this$0.f5175 = Mo2706;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.this$0.f5175 = Mo2706;
            throw th;
        }
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
        invoke((InterfaceC1504) obj);
        return C5176.f14739;
    }
}
