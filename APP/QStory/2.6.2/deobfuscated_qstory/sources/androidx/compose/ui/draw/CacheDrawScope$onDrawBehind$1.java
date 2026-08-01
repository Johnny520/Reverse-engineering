package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲苏兰;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class CacheDrawScope$onDrawBehind$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(InterfaceC6557 interfaceC6557) {
        super(1);
        this.$block = interfaceC6557;
    }

    public final void invoke(InterfaceC1506 interfaceC1506) {
        this.$block.invoke(interfaceC1506);
        ((C1758) interfaceC1506).m3301();
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1506) obj);
        return C5175.f14739;
    }
}
