package androidx.compose.ui.input.pointer;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1763;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1777;
import androidx.compose.ui.node.C1809;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1796;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1630 extends AbstractC2128 implements InterfaceC1764, InterfaceC1796, InterfaceC1783 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1777 f4763;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f4764;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1634 f4765;

    public AbstractC1630(C1634 c1634, C1777 c1777) {
        this.f4763 = c1777;
        this.f4765 = c1634;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        m3009();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List list = c1652.f4852;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo3003(((C1643) list.get(i)).f4819)) {
                    int i2 = c1652.f4847;
                    if (i2 == 4) {
                        this.f4764 = true;
                        m3011();
                        return;
                    } else {
                        if (i2 == 5) {
                            m3009();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m3009() {
        if (this.f4764) {
            this.f4764 = false;
            if (this.f6279) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC1785.m3335(this, new InterfaceC6558() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p052.InterfaceC6558
                    public final Boolean invoke(AbstractC1630 abstractC1630) {
                        Ref$ObjectRef<AbstractC1630> ref$ObjectRef2 = ref$ObjectRef;
                        AbstractC1630 abstractC16302 = ref$ObjectRef2.element;
                        if (abstractC16302 == null && abstractC1630.f4764) {
                            ref$ObjectRef2.element = abstractC1630;
                        } else if (abstractC16302 != null) {
                            abstractC1630.getClass();
                        }
                        return Boolean.TRUE;
                    }
                });
                AbstractC1630 abstractC1630 = (AbstractC1630) ref$ObjectRef.element;
                if (abstractC1630 != null) {
                    abstractC1630.m3010();
                } else {
                    mo3004(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public abstract boolean mo3003(int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m3010() {
        C1634 c1634;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC1785.m3335(this, new InterfaceC6558() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final Boolean invoke(AbstractC1630 abstractC1630) {
                abstractC1630.getClass();
                return Boolean.TRUE;
            }
        });
        AbstractC1630 abstractC1630 = (AbstractC1630) ref$ObjectRef.element;
        if (abstractC1630 == null || (c1634 = abstractC1630.f4765) == null) {
            c1634 = this.f4765;
        }
        mo3004(c1634);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m3011() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        AbstractC1785.m3333(this, new InterfaceC6558() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(AbstractC1630 abstractC1630) {
                if (!abstractC1630.f4764) {
                    return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                }
                ref$BooleanRef.element = false;
                return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
            }
        });
        if (ref$BooleanRef.element) {
            m3010();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract void mo3004(InterfaceC1641 interfaceC1641);

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        m3009();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final long mo1649() {
        if (this.f4763 == null) {
            return AbstractC1763.f5180;
        }
        InterfaceC7896 interfaceC7896 = AbstractC1785.m3346(this).f5099;
        int i = AbstractC1763.f5179;
        return C1809.m3414(interfaceC7896.mo1343(10.0f), interfaceC7896.mo1343(40.0f), interfaceC7896.mo1343(10.0f), interfaceC7896.mo1343(40.0f));
    }
}
