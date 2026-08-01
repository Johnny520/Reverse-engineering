package androidx.compose.p001ui.input.pointer;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2598;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2612;
import androidx.compose.p001ui.node.C2644;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2631;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2465 extends AbstractC2961 implements InterfaceC2599, InterfaceC2631, InterfaceC2618 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C2612 f5108;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5109;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2469 f5110;

    public AbstractC2465(C2469 c2469, C2612 c2612) {
        this.f5108 = c2612;
        this.f5110 = c2469;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        m3569();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List list = c2487.f5197;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo3563(((C2478) list.get(i)).f5164)) {
                    int i2 = c2487.f5192;
                    if (i2 == 4) {
                        this.f5109 = true;
                        m3571();
                        return;
                    } else {
                        if (i2 == 5) {
                            m3569();
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
    public final void m3569() {
        if (this.f5109) {
            this.f5109 = false;
            if (this.f6624) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC2620.m3895(this, new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p068.InterfaceC7387
                    public final Boolean invoke(AbstractC2465 abstractC2465) {
                        Ref$ObjectRef<AbstractC2465> ref$ObjectRef2 = ref$ObjectRef;
                        AbstractC2465 abstractC24652 = ref$ObjectRef2.element;
                        if (abstractC24652 == null && abstractC2465.f5109) {
                            ref$ObjectRef2.element = abstractC2465;
                        } else if (abstractC24652 != null) {
                            abstractC2465.getClass();
                        }
                        return Boolean.TRUE;
                    }
                });
                AbstractC2465 abstractC2465 = (AbstractC2465) ref$ObjectRef.element;
                if (abstractC2465 != null) {
                    abstractC2465.m3570();
                } else {
                    mo3564(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public abstract boolean mo3563(int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m3570() {
        C2469 c2469;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC2620.m3895(this, new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(AbstractC2465 abstractC2465) {
                abstractC2465.getClass();
                return Boolean.TRUE;
            }
        });
        AbstractC2465 abstractC2465 = (AbstractC2465) ref$ObjectRef.element;
        if (abstractC2465 == null || (c2469 = abstractC2465.f5110) == null) {
            c2469 = this.f5110;
        }
        mo3564(c2469);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m3571() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        AbstractC2620.m3893(this, new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(AbstractC2465 abstractC2465) {
                if (!abstractC2465.f5109) {
                    return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                }
                ref$BooleanRef.element = false;
                return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
            }
        });
        if (ref$BooleanRef.element) {
            m3570();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract void mo3564(InterfaceC2476 interfaceC2476);

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        m3569();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final long mo2209() {
        if (this.f5108 == null) {
            return AbstractC2598.f5525;
        }
        InterfaceC8725 interfaceC8725 = AbstractC2620.m3906(this).f5444;
        int i = AbstractC2598.f5524;
        return C2644.m3974(interfaceC8725.mo1903(10.0f), interfaceC8725.mo1903(40.0f), interfaceC8725.mo1903(10.0f), interfaceC8725.mo1903(40.0f));
    }
}
