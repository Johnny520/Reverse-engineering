package androidx.compose.p001ui.draganddrop;

import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class DragAndDropNode$startDragAndDropTransfer$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7372 $isTransferStarted;
    final /* synthetic */ InterfaceC2530 $nodeCoordinates;
    final /* synthetic */ long $offset;
    final /* synthetic */ InterfaceC2265 $this_startDragAndDropTransfer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$startDragAndDropTransfer$1(long j, InterfaceC2530 interfaceC2530, InterfaceC2265 interfaceC2265, InterfaceC7372 interfaceC7372) {
        super(1);
        this.$offset = j;
        this.$nodeCoordinates = interfaceC2530;
        this.$isTransferStarted = interfaceC7372;
    }

    @Override // p068.InterfaceC7387
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C2266 c2266) {
        return !c2266.f6624 ? TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
