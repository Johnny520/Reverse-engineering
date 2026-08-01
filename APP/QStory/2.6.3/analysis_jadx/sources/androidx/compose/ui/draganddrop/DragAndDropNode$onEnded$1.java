package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class DragAndDropNode$onEnded$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ C1426 $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(C1426 c1426) {
        super(1);
        this.$event = c1426;
    }

    @Override // p052.InterfaceC6558
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C1431 c1431) {
        if (!c1431.f6292.f6279) {
            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        InterfaceC1432 interfaceC1432 = c1431.f4113;
        if (interfaceC1432 != null) {
            C1431 c14312 = (C1431) interfaceC1432;
            DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(this.$event);
            if (dragAndDropNode$onEnded$1.invoke((Object) c14312) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                AbstractC1785.m3333(c14312, dragAndDropNode$onEnded$1);
            }
        }
        c1431.f4113 = null;
        c1431.f4111 = null;
        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
