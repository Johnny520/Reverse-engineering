package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.InterfaceC1601;
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
final class DrawScope$record$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $block;
    final /* synthetic */ InterfaceC1504 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawScope$record$1(InterfaceC1504 interfaceC1504, InterfaceC6557 interfaceC6557) {
        super(1);
        this.this$0 = interfaceC1504;
        this.$block = interfaceC6557;
    }

    public final void invoke(InterfaceC1504 interfaceC1504) {
        InterfaceC1504 interfaceC15042 = this.this$0;
        InterfaceC7895 interfaceC7895M388 = interfaceC1504.mo2696().m388();
        LayoutDirection layoutDirectionM369 = interfaceC1504.mo2696().m369();
        InterfaceC1601 interfaceC1601M385 = interfaceC1504.mo2696().m385();
        long jM367 = interfaceC1504.mo2696().m367();
        C1516 c1516 = (C1516) interfaceC1504.mo2696().f320;
        InterfaceC6557 interfaceC6557 = this.$block;
        InterfaceC7895 interfaceC7895M3882 = interfaceC15042.mo2696().m388();
        LayoutDirection layoutDirectionM3692 = interfaceC15042.mo2696().m369();
        InterfaceC1601 interfaceC1601M3852 = interfaceC15042.mo2696().m385();
        long jM3672 = interfaceC15042.mo2696().m367();
        C1516 c15162 = (C1516) interfaceC15042.mo2696().f320;
        C0108 c0108Mo2696 = interfaceC15042.mo2696();
        c0108Mo2696.m363(interfaceC7895M388);
        c0108Mo2696.m359(layoutDirectionM369);
        c0108Mo2696.m364(interfaceC1601M385);
        c0108Mo2696.m360(jM367);
        c0108Mo2696.f320 = c1516;
        interfaceC1601M385.mo2667();
        try {
            interfaceC6557.invoke(interfaceC15042);
        } finally {
            interfaceC1601M385.mo2679();
            C0108 c0108Mo26962 = interfaceC15042.mo2696();
            c0108Mo26962.m363(interfaceC7895M3882);
            c0108Mo26962.m359(layoutDirectionM3692);
            c0108Mo26962.m364(interfaceC1601M3852);
            c0108Mo26962.m360(jM3672);
            c0108Mo26962.f320 = c15162;
        }
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1504) obj);
        return C5175.f14739;
    }
}
