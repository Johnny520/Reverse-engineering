package androidx.compose.p001ui.draganddrop;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class DragAndDropNode$onEnded$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ C2261 $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(C2261 c2261) {
        super(1);
        this.$event = c2261;
    }

    @Override // p068.InterfaceC7387
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C2266 c2266) {
        if (!c2266.f6637.f6624) {
            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        InterfaceC2267 interfaceC2267 = c2266.f4458;
        if (interfaceC2267 != null) {
            C2266 c22662 = (C2266) interfaceC2267;
            DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(this.$event);
            if (dragAndDropNode$onEnded$1.invoke((Object) c22662) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                AbstractC2620.m3893(c22662, dragAndDropNode$onEnded$1);
            }
        }
        c2266.f4458 = null;
        c2266.f4456 = null;
        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
