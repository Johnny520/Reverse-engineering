package androidx.compose.animation;

import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;
import p112.C7327;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedBoundsNode$drawContentWithLookaheadAnimationDebug$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ C7327 $bounds;
    final /* synthetic */ long $lookaheadAnimationVisualDebugColor;
    final /* synthetic */ float $strokeWeight;
    final /* synthetic */ AbstractC0430 $targetData;
    final /* synthetic */ InterfaceC1506 $this_drawContentWithLookaheadAnimationDebug;
    final /* synthetic */ C0382 $visualDebugConfig;
    final /* synthetic */ AbstractC0376 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$drawContentWithLookaheadAnimationDebug$1(InterfaceC1506 interfaceC1506, AbstractC0376 abstractC0376, C0382 c0382, float f, AbstractC0430 abstractC0430, C7327 c7327, long j) {
        super(1);
        this.$this_drawContentWithLookaheadAnimationDebug = interfaceC1506;
        this.this$0 = abstractC0376;
        this.$visualDebugConfig = c0382;
        this.$strokeWeight = f;
        this.$targetData = abstractC0430;
        this.$bounds = c7327;
        this.$lookaheadAnimationVisualDebugColor = j;
    }

    public final void invoke(InterfaceC1504 interfaceC1504) {
        ((C1758) this.$this_drawContentWithLookaheadAnimationDebug).m3301();
        throw null;
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1504) obj);
        return C5175.f14739;
    }
}
