package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.animation.core.InterfaceC0353;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;", "Landroidx/compose/animation/EnterExitState;", "Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;", "invoke", "(Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;)Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class VeilModifierNode$draw$veilColor$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ AbstractC0431 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VeilModifierNode$draw$veilColor$1(AbstractC0431 abstractC0431) {
        super(1);
        this.this$0 = abstractC0431;
    }

    @Override // p052.InterfaceC6557
    public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353) {
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (interfaceC0353.m1057(enterExitState, enterExitState2)) {
            this.this$0.getClass();
            throw null;
        }
        if (!interfaceC0353.m1057(enterExitState2, EnterExitState.PostExit)) {
            return AbstractC0387.f1301;
        }
        this.this$0.getClass();
        throw null;
    }
}
