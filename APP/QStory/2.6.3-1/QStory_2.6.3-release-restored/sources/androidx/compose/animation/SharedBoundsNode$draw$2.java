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
final class SharedBoundsNode$draw$2 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ C8157 $bounds;
    final /* synthetic */ AbstractC1288 $sharedElement;
    final /* synthetic */ InterfaceC2341 $this_draw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$draw$2(InterfaceC2341 interfaceC2341, C8157 c8157, AbstractC1288 abstractC1288) {
        super(1);
        this.$this_draw = interfaceC2341;
        this.$bounds = c8157;
        this.$sharedElement = abstractC1288;
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2339) obj);
        return C6008.f15084;
    }

    public final void invoke(InterfaceC2339 interfaceC2339) {
        ((C2593) this.$this_draw).m3871();
    }
}
