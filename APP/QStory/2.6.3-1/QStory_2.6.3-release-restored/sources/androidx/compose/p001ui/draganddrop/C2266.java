package androidx.compose.p001ui.draganddrop;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.InterfaceC2611;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;
import p191.AbstractC8568;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2266 extends AbstractC2961 implements InterfaceC2599, InterfaceC2267, InterfaceC2611 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C2266 f4456;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public long f4457;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC2267 f4458;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m3122(C2261 c2261) {
        InterfaceC2267 interfaceC2267 = this.f4458;
        if (interfaceC2267 != null) {
            ((C2266) interfaceC2267).m3122(c2261);
            return;
        }
        C2266 c2266 = this.f4456;
        if (c2266 != null) {
            c2266.m3122(c2261);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m3123(final C2261 c2261) {
        InterfaceC2599 interfaceC2599;
        C2266 c2266;
        C2266 c22662 = this.f4456;
        if (c22662 == null || !AbstractC8568.m13628(c22662, AbstractC9004.m14198(c2261))) {
            if (this.f6637.f6624) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC2620.m3893(this, new InterfaceC7387() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p068.InterfaceC7387
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C2266 c22663) {
                        C2266 c22664 = c22663;
                        C2266 c22665 = this;
                        c22665.getClass();
                        if (!((ViewOnDragListenerC2263) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c22665)).getDragAndDropManager()).f4453.contains(c22664) || !AbstractC8568.m13628(c22664, AbstractC9004.m14198(c2261))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        ref$ObjectRef.element = c22663;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                interfaceC2599 = (InterfaceC2599) ref$ObjectRef.element;
            } else {
                interfaceC2599 = null;
            }
            c2266 = (C2266) interfaceC2599;
        } else {
            c2266 = c22662;
        }
        if (c2266 != null && c22662 == null) {
            c2266.m3126(c2261);
            c2266.m3123(c2261);
            InterfaceC2267 interfaceC2267 = this.f4458;
            if (interfaceC2267 != null) {
                ((C2266) interfaceC2267).m3125(c2261);
            }
        } else if (c2266 == null && c22662 != null) {
            InterfaceC2267 interfaceC22672 = this.f4458;
            if (interfaceC22672 != null) {
                C2266 c22663 = (C2266) interfaceC22672;
                c22663.m3126(c2261);
                c22663.m3123(c2261);
            }
            c22662.m3125(c2261);
        } else if (!AbstractC5227.m9466(c2266, c22662)) {
            if (c2266 != null) {
                c2266.m3126(c2261);
                c2266.m3123(c2261);
            }
            if (c22662 != null) {
                c22662.m3125(c2261);
            }
        } else if (c2266 != null) {
            c2266.m3123(c2261);
        } else {
            InterfaceC2267 interfaceC22673 = this.f4458;
            if (interfaceC22673 != null) {
                ((C2266) interfaceC22673).m3123(c2261);
            }
        }
        this.f4456 = c2266;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m3124(C2261 c2261) {
        C2266 c2266 = this.f4456;
        if (c2266 != null) {
            return c2266.m3124(c2261);
        }
        InterfaceC2267 interfaceC2267 = this.f4458;
        if (interfaceC2267 != null) {
            return ((C2266) interfaceC2267).m3124(c2261);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m3125(C2261 c2261) {
        InterfaceC2267 interfaceC2267 = this.f4458;
        if (interfaceC2267 != null) {
            ((C2266) interfaceC2267).m3125(c2261);
        }
        C2266 c2266 = this.f4456;
        if (c2266 != null) {
            c2266.m3125(c2261);
        }
        this.f4456 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3126(C2261 c2261) {
        InterfaceC2267 interfaceC2267 = this.f4458;
        if (interfaceC2267 != null) {
            ((C2266) interfaceC2267).m3126(c2261);
            return;
        }
        C2266 c2266 = this.f4456;
        if (c2266 != null) {
            c2266.m3126(c2261);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        this.f4458 = null;
        this.f4456 = null;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2611, androidx.compose.p001ui.node.InterfaceC2575
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1881(long j) {
        this.f4457 = j;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1919() {
        return C2259.f4447;
    }
}
