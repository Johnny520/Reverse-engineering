package androidx.compose.p001ui.draganddrop;

import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;", "T", "child", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
public final class DragAndDropNodeKt$firstDescendantOrNull$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ Ref$ObjectRef<InterfaceC2599> $match;
    final /* synthetic */ InterfaceC7387 $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$firstDescendantOrNull$1(InterfaceC7387 interfaceC7387, Ref$ObjectRef<InterfaceC2599> ref$ObjectRef) {
        super(1);
        this.$predicate = interfaceC7387;
        this.$match = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068.InterfaceC7387
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(InterfaceC2599 interfaceC2599) {
        if (!((Boolean) this.$predicate.invoke(interfaceC2599)).booleanValue()) {
            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
        }
        this.$match.element = interfaceC2599;
        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
    }
}
