package androidx.compose.animation;

import androidx.compose.animation.core.C0364;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6551;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedTransitionScopeImpl$sharedBoundsImpl$1 extends Lambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0414 $boundsTransform;
    final /* synthetic */ InterfaceC0446 $clipInOverlayDuringTransition;
    final /* synthetic */ C0364 $parentTransition;
    final /* synthetic */ InterfaceC0443 $placeholderSize;
    final /* synthetic */ boolean $renderInOverlayDuringTransition;
    final /* synthetic */ boolean $renderOnlyWhenVisible;
    final /* synthetic */ AbstractC0428 $sharedContentState;
    final /* synthetic */ InterfaceC6558 $visible;
    final /* synthetic */ float $zIndexInOverlay;
    final /* synthetic */ C0425 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBoundsImpl$1(AbstractC0428 abstractC0428, C0364 c0364, InterfaceC6558 interfaceC6558, C0425 c0425, InterfaceC0443 interfaceC0443, boolean z, InterfaceC0446 interfaceC0446, float f, boolean z2, InterfaceC0414 interfaceC0414) {
        super(3);
        this.$parentTransition = c0364;
        this.$visible = interfaceC6558;
        this.this$0 = c0425;
        this.$renderOnlyWhenVisible = z;
        this.$clipInOverlayDuringTransition = interfaceC0446;
        this.$zIndexInOverlay = f;
        this.$renderInOverlayDuringTransition = z2;
        this.$boundsTransform = interfaceC0414;
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2129) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
    }

    public final InterfaceC2129 invoke(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i) {
        ((C1324) interfaceC1373).m2392(-1539505585);
        throw null;
    }
}
