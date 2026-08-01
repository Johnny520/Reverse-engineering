package androidx.compose.animation;

import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;
import p112.C7328;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedBoundsNode$draw$2 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ C7328 $bounds;
    final /* synthetic */ AbstractC0442 $sharedElement;
    final /* synthetic */ InterfaceC1506 $this_draw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$draw$2(InterfaceC1506 interfaceC1506, C7328 c7328, AbstractC0442 abstractC0442) {
        super(1);
        this.$this_draw = interfaceC1506;
        this.$bounds = c7328;
        this.$sharedElement = abstractC0442;
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1504) obj);
        return C5176.f14739;
    }

    public final void invoke(InterfaceC1504 interfaceC1504) {
        ((C1758) this.$this_draw).m3311();
    }
}
