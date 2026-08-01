package androidx.compose.p001ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;", "event", "Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;", "invoke", "(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class DragAndDropNodeKt$DragAndDropTargetModifierNode$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $shouldStartDragAndDrop;
    final /* synthetic */ InterfaceC2267 $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$DragAndDropTargetModifierNode$1(InterfaceC7387 interfaceC7387, InterfaceC2267 interfaceC2267) {
        super(1);
        this.$shouldStartDragAndDrop = interfaceC7387;
        this.$target = interfaceC2267;
    }

    @Override // p068.InterfaceC7387
    public final InterfaceC2267 invoke(C2261 c2261) {
        if (((Boolean) this.$shouldStartDragAndDrop.invoke(c2261)).booleanValue()) {
            return this.$target;
        }
        return null;
    }
}
