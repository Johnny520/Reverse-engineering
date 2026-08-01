package androidx.compose.animation;

import androidx.compose.animation.core.C1210;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7380;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class SharedTransitionScopeImpl$sharedBoundsImpl$1 extends Lambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC1260 $boundsTransform;
    final /* synthetic */ InterfaceC1292 $clipInOverlayDuringTransition;
    final /* synthetic */ C1210 $parentTransition;
    final /* synthetic */ InterfaceC1289 $placeholderSize;
    final /* synthetic */ boolean $renderInOverlayDuringTransition;
    final /* synthetic */ boolean $renderOnlyWhenVisible;
    final /* synthetic */ AbstractC1274 $sharedContentState;
    final /* synthetic */ InterfaceC7387 $visible;
    final /* synthetic */ float $zIndexInOverlay;
    final /* synthetic */ C1271 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBoundsImpl$1(AbstractC1274 abstractC1274, C1210 c1210, InterfaceC7387 interfaceC7387, C1271 c1271, InterfaceC1289 interfaceC1289, boolean z, InterfaceC1292 interfaceC1292, float f, boolean z2, InterfaceC1260 interfaceC1260) {
        super(3);
        this.$parentTransition = c1210;
        this.$visible = interfaceC7387;
        this.this$0 = c1271;
        this.$renderOnlyWhenVisible = z;
        this.$clipInOverlayDuringTransition = interfaceC1292;
        this.$zIndexInOverlay = f;
        this.$renderInOverlayDuringTransition = z2;
        this.$boundsTransform = interfaceC1260;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2962) obj, (InterfaceC2208) obj2, ((Number) obj3).intValue());
    }

    public final InterfaceC2962 invoke(InterfaceC2962 interfaceC2962, InterfaceC2208 interfaceC2208, int i) {
        ((C2159) interfaceC2208).m2952(-1539505585);
        throw null;
    }
}
