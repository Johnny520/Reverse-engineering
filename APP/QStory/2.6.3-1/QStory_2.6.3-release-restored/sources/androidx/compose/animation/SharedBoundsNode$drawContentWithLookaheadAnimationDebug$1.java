package androidx.compose.animation;

import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class SharedBoundsNode$drawContentWithLookaheadAnimationDebug$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ C8157 $bounds;
    final /* synthetic */ long $lookaheadAnimationVisualDebugColor;
    final /* synthetic */ float $strokeWeight;
    final /* synthetic */ AbstractC1276 $targetData;
    final /* synthetic */ InterfaceC2341 $this_drawContentWithLookaheadAnimationDebug;
    final /* synthetic */ C1228 $visualDebugConfig;
    final /* synthetic */ AbstractC1222 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$drawContentWithLookaheadAnimationDebug$1(InterfaceC2341 interfaceC2341, AbstractC1222 abstractC1222, C1228 c1228, float f, AbstractC1276 abstractC1276, C8157 c8157, long j) {
        super(1);
        this.$this_drawContentWithLookaheadAnimationDebug = interfaceC2341;
        this.this$0 = abstractC1222;
        this.$visualDebugConfig = c1228;
        this.$strokeWeight = f;
        this.$targetData = abstractC1276;
        this.$bounds = c8157;
        this.$lookaheadAnimationVisualDebugColor = j;
    }

    public final void invoke(InterfaceC2339 interfaceC2339) {
        ((C2593) this.$this_drawContentWithLookaheadAnimationDebug).m3871();
        throw null;
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2339) obj);
        return C6008.f15084;
    }
}
