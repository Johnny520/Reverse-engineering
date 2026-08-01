package androidx.compose.ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;", "event", "Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;", "invoke", "(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class DragAndDropNodeKt$DragAndDropModifierNode$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6558 $shouldStartDragAndDrop;
    final /* synthetic */ InterfaceC1432 $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$DragAndDropModifierNode$1(InterfaceC6558 interfaceC6558, InterfaceC1432 interfaceC1432) {
        super(1);
        this.$shouldStartDragAndDrop = interfaceC6558;
        this.$target = interfaceC1432;
    }

    @Override // p052.InterfaceC6558
    public final InterfaceC1432 invoke(C1426 c1426) {
        if (((Boolean) this.$shouldStartDragAndDrop.invoke(c1426)).booleanValue()) {
            return this.$target;
        }
        return null;
    }
}
