package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;", "T", "child", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class DragAndDropNodeKt$firstDescendantOrNull$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ Ref$ObjectRef<InterfaceC1764> $match;
    final /* synthetic */ InterfaceC6557 $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$firstDescendantOrNull$1(InterfaceC6557 interfaceC6557, Ref$ObjectRef<InterfaceC1764> ref$ObjectRef) {
        super(1);
        this.$predicate = interfaceC6557;
        this.$match = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6557
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(InterfaceC1764 interfaceC1764) {
        if (!((Boolean) this.$predicate.invoke(interfaceC1764)).booleanValue()) {
            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
        }
        this.$match.element = interfaceC1764;
        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
    }
}
