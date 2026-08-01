package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class DragAndDropNode$startDragAndDropTransfer$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6542 $isTransferStarted;
    final /* synthetic */ InterfaceC1695 $nodeCoordinates;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC1430 $this_startDragAndDropTransfer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$startDragAndDropTransfer$1(long j, InterfaceC1695 interfaceC1695, InterfaceC1430 interfaceC1430, InterfaceC6542 interfaceC6542) {
        super(1);
        this.$offset = j;
        this.$nodeCoordinates = interfaceC1695;
        this.$isTransferStarted = interfaceC6542;
    }

    @Override // p052.InterfaceC6557
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C1431 c1431) {
        return !c1431.f6278 ? TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
