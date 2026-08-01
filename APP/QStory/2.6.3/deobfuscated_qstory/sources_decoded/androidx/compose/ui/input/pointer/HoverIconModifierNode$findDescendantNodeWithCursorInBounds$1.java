package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;", "it", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ Ref$ObjectRef<AbstractC1630> $descendantNodeWithCursorInBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(Ref$ObjectRef<AbstractC1630> ref$ObjectRef) {
        super(1);
        this.$descendantNodeWithCursorInBounds = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6558
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(AbstractC1630 abstractC1630) {
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
        if (abstractC1630.f4764) {
            this.$descendantNodeWithCursorInBounds.element = abstractC1630;
        }
        return traversableNode$Companion$TraverseDescendantsAction;
    }
}
