package androidx.compose.ui.draganddrop;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1776;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import p251.AbstractC8174;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1431 extends AbstractC2128 implements InterfaceC1764, InterfaceC1432, InterfaceC1776 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1431 f4110;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public long f4111;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1432 f4112;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m2552(C1426 c1426) {
        InterfaceC1432 interfaceC1432 = this.f4112;
        if (interfaceC1432 != null) {
            ((C1431) interfaceC1432).m2552(c1426);
            return;
        }
        C1431 c1431 = this.f4110;
        if (c1431 != null) {
            c1431.m2552(c1426);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m2553(final C1426 c1426) {
        InterfaceC1764 interfaceC1764;
        C1431 c1431;
        C1431 c14312 = this.f4110;
        if (c14312 == null || !AbstractC8174.m13607(c14312, AbstractC8189.m13672(c1426))) {
            if (this.f6291.f6278) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC1785.m3323(this, new InterfaceC6557() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p052.InterfaceC6557
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(C1431 c14313) {
                        C1431 c14314 = c14313;
                        C1431 c14315 = this;
                        c14315.getClass();
                        if (!((ViewOnDragListenerC1428) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c14315)).getDragAndDropManager()).f4107.contains(c14314) || !AbstractC8174.m13607(c14314, AbstractC8189.m13672(c1426))) {
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
            c1431.m2556(c1426);
            c1431.m2553(c1426);
            InterfaceC1432 interfaceC1432 = this.f4112;
            if (interfaceC1432 != null) {
                ((C1431) interfaceC1432).m2555(c1426);
            }
        } else if (c1431 == null && c14312 != null) {
            InterfaceC1432 interfaceC14322 = this.f4112;
            if (interfaceC14322 != null) {
                C1431 c14313 = (C1431) interfaceC14322;
                c14313.m2556(c1426);
                c14313.m2553(c1426);
            }
            c14312.m2555(c1426);
        } else if (!AbstractC4394.m8917(c1431, c14312)) {
            if (c1431 != null) {
                c1431.m2556(c1426);
                c1431.m2553(c1426);
            }
            if (c14312 != null) {
                c14312.m2555(c1426);
            }
        } else if (c1431 != null) {
            c1431.m2553(c1426);
        } else {
            InterfaceC1432 interfaceC14323 = this.f4112;
            if (interfaceC14323 != null) {
                ((C1431) interfaceC14323).m2553(c1426);
            }
        }
        this.f4110 = c1431;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m2554(C1426 c1426) {
        C1431 c1431 = this.f4110;
        if (c1431 != null) {
            return c1431.m2554(c1426);
        }
        InterfaceC1432 interfaceC1432 = this.f4112;
        if (interfaceC1432 != null) {
            return ((C1431) interfaceC1432).m2554(c1426);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m2555(C1426 c1426) {
        InterfaceC1432 interfaceC1432 = this.f4112;
        if (interfaceC1432 != null) {
            ((C1431) interfaceC1432).m2555(c1426);
        }
        C1431 c1431 = this.f4110;
        if (c1431 != null) {
            c1431.m2555(c1426);
        }
        this.f4110 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m2556(C1426 c1426) {
        InterfaceC1432 interfaceC1432 = this.f4112;
        if (interfaceC1432 != null) {
            ((C1431) interfaceC1432).m2556(c1426);
            return;
        }
        C1431 c1431 = this.f4110;
        if (c1431 != null) {
            c1431.m2556(c1426);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        this.f4112 = null;
        this.f4110 = null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1776, androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1311(long j) {
        this.f4111 = j;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1349() {
        return C1424.f4101;
    }
}
