package androidx.compose.ui.draganddrop;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1776;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;
import p175.AbstractC7739;
import p251.AbstractC8175;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1431 extends AbstractC2128 implements InterfaceC1764, InterfaceC1432, InterfaceC1776 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1431 f4111;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public long f4112;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1432 f4113;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m2562(C1426 c1426) {
        InterfaceC1432 interfaceC1432 = this.f4113;
        if (interfaceC1432 != null) {
            ((C1431) interfaceC1432).m2562(c1426);
            return;
        }
        C1431 c1431 = this.f4111;
        if (c1431 != null) {
            c1431.m2562(c1426);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m2563(final C1426 c1426) {
        InterfaceC1764 interfaceC1764;
        C1431 c1431;
        C1431 c14312 = this.f4111;
        if (c14312 == null || !AbstractC7739.m13069(c14312, AbstractC8175.m13639(c1426))) {
            if (this.f6292.f6279) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC1785.m3333(this, new InterfaceC6558() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p052.InterfaceC6558
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C1431 c14313) {
                        C1431 c14314 = c14313;
                        C1431 c14315 = this;
                        c14315.getClass();
                        if (!((ViewOnDragListenerC1428) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c14315)).getDragAndDropManager()).f4108.contains(c14314) || !AbstractC7739.m13069(c14314, AbstractC8175.m13639(c1426))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        ref$ObjectRef.element = c14313;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                interfaceC1764 = (InterfaceC1764) ref$ObjectRef.element;
            } else {
                interfaceC1764 = null;
            }
            c1431 = (C1431) interfaceC1764;
        } else {
            c1431 = c14312;
        }
        if (c1431 != null && c14312 == null) {
            c1431.m2566(c1426);
            c1431.m2563(c1426);
            InterfaceC1432 interfaceC1432 = this.f4113;
            if (interfaceC1432 != null) {
                ((C1431) interfaceC1432).m2565(c1426);
            }
        } else if (c1431 == null && c14312 != null) {
            InterfaceC1432 interfaceC14322 = this.f4113;
            if (interfaceC14322 != null) {
                C1431 c14313 = (C1431) interfaceC14322;
                c14313.m2566(c1426);
                c14313.m2563(c1426);
            }
            c14312.m2565(c1426);
        } else if (!AbstractC4395.m8907(c1431, c14312)) {
            if (c1431 != null) {
                c1431.m2566(c1426);
                c1431.m2563(c1426);
            }
            if (c14312 != null) {
                c14312.m2565(c1426);
            }
        } else if (c1431 != null) {
            c1431.m2563(c1426);
        } else {
            InterfaceC1432 interfaceC14323 = this.f4113;
            if (interfaceC14323 != null) {
                ((C1431) interfaceC14323).m2563(c1426);
            }
        }
        this.f4111 = c1431;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m2564(C1426 c1426) {
        C1431 c1431 = this.f4111;
        if (c1431 != null) {
            return c1431.m2564(c1426);
        }
        InterfaceC1432 interfaceC1432 = this.f4113;
        if (interfaceC1432 != null) {
            return ((C1431) interfaceC1432).m2564(c1426);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m2565(C1426 c1426) {
        InterfaceC1432 interfaceC1432 = this.f4113;
        if (interfaceC1432 != null) {
            ((C1431) interfaceC1432).m2565(c1426);
        }
        C1431 c1431 = this.f4111;
        if (c1431 != null) {
            c1431.m2565(c1426);
        }
        this.f4111 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m2566(C1426 c1426) {
        InterfaceC1432 interfaceC1432 = this.f4113;
        if (interfaceC1432 != null) {
            ((C1431) interfaceC1432).m2566(c1426);
            return;
        }
        C1431 c1431 = this.f4111;
        if (c1431 != null) {
            c1431.m2566(c1426);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        this.f4113 = null;
        this.f4111 = null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1776, androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1321(long j) {
        this.f4112 = j;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1359() {
        return C1424.f4102;
    }
}
