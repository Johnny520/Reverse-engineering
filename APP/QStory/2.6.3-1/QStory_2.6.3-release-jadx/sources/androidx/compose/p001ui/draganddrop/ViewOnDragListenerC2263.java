package androidx.compose.p001ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.C1108;
import androidx.collection.C1122;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Ref$BooleanRef;
import p068.InterfaceC7387;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC2263 implements View.OnDragListener, InterfaceC2260 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2264 f4452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1122 f4453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2266 f4454;

    public ViewOnDragListenerC2263() {
        C2266 c2266 = new C2266();
        c2266.f4457 = 0L;
        this.f4454 = c2266;
        this.f4453 = new C1122(0);
        this.f4452 = new C2264(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        final C2261 c2261 = new C2261(dragEvent);
        int action = dragEvent.getAction();
        C1122 c1122 = this.f4453;
        final C2266 c2266 = this.f4454;
        switch (action) {
            case 1:
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C2266 c22662) {
                        if (!c22662.f6624) {
                            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                        }
                        if (c22662.f4458 != null) {
                            AbstractC8765.m13982("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        c22662.f4458 = null;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        ref$BooleanRef2.element = ref$BooleanRef2.element;
                        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                    }
                };
                if (interfaceC7387.invoke(c2266) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                    AbstractC2620.m3893(c2266, interfaceC7387);
                }
                boolean z = ref$BooleanRef.element;
                c1122.getClass();
                C1108 c1108 = new C1108(c1122);
                while (c1108.hasNext()) {
                    ((C2266) ((InterfaceC2267) c1108.next())).m3122(c2261);
                }
                break;
            case 2:
                c2266.m3123(c2261);
                break;
            case 4:
                DragAndDropNode$onEnded$1 dragAndDropNode$onEnded$1 = new DragAndDropNode$onEnded$1(c2261);
                if (dragAndDropNode$onEnded$1.invoke((Object) c2266) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                    AbstractC2620.m3893(c2266, dragAndDropNode$onEnded$1);
                }
                c1122.clear();
                break;
            case 5:
                c2266.m3126(c2261);
                break;
            case 6:
                c2266.m3125(c2261);
                break;
        }
        return false;
    }
}
