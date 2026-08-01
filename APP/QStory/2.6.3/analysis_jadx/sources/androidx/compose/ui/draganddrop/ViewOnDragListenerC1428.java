package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.C0261;
import androidx.collection.C0275;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6558;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC1428 implements View.OnDragListener, InterfaceC1425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1429 f4107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0275 f4108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1431 f4109;

    public ViewOnDragListenerC1428() {
        C1431 c1431 = new C1431();
        c1431.f4112 = 0L;
        this.f4109 = c1431;
        this.f4108 = new C0275(0);
        this.f4107 = new C1429(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        final C1426 c1426 = new C1426(dragEvent);
        int action = dragEvent.getAction();
        C0275 c0275 = this.f4108;
        final C1431 c1431 = this.f4109;
        switch (action) {
            case 1:
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C1431 c14312) {
                        if (!c14312.f6279) {
                            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                        }
                        if (c14312.f4113 != null) {
                            AbstractC7936.m13423("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        c14312.f4113 = null;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        ref$BooleanRef2.element = ref$BooleanRef2.element;
                        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                    }
                };
                if (interfaceC6558.invoke(c1431) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                    AbstractC1785.m3333(c1431, interfaceC6558);
                }
                boolean z = ref$BooleanRef.element;
                c0275.getClass();
                C0261 c0261 = new C0261(c0275);
                while (c0261.hasNext()) {
                    ((C1431) ((InterfaceC1432) c0261.next())).m2562(c1426);
                }
                break;
            case 2:
                c1431.m2563(c1426);
                break;
            case 4:
                DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(c1426);
                if (dragAndDropNode$onEnded$1.invoke((Object) c1431) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                    AbstractC1785.m3333(c1431, dragAndDropNode$onEnded$1);
                }
                c0275.clear();
                break;
            case 5:
                c1431.m2566(c1426);
                break;
            case 6:
                c1431.m2565(c1426);
                break;
        }
        return false;
    }
}
