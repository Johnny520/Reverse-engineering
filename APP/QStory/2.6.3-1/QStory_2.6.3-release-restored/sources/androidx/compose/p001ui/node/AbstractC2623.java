package androidx.compose.p001ui.node;

import androidx.collection.C1099;
import androidx.compose.p001ui.AbstractC2961;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2623 extends AbstractC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f5570 = AbstractC2628.m3933(this);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC2961 f5571;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo3922() {
        super.mo3922();
        for (AbstractC2961 abstractC2961 = this.f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3923(this.f6631);
            if (!abstractC2961.f6624) {
                abstractC2961.mo3922();
            }
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo3923(AbstractC2629 abstractC2629) {
        this.f6631 = abstractC2629;
        for (AbstractC2961 abstractC2961 = this.f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3923(abstractC2629);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC2622 m3924(InterfaceC2622 interfaceC2622) {
        AbstractC2961 abstractC2961 = ((AbstractC2961) interfaceC2622).f6637;
        if (abstractC2961 != interfaceC2622) {
            AbstractC2961 abstractC29612 = interfaceC2622 instanceof AbstractC2961 ? (AbstractC2961) interfaceC2622 : null;
            AbstractC2961 abstractC29613 = abstractC29612 != null ? abstractC29612.f6629 : null;
            if (abstractC2961 != this.f6637 || !AbstractC5227.m9466(abstractC29613, this)) {
                C6755.m11870("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (abstractC2961.f6624) {
                AbstractC8765.m13982("Cannot delegate to an already attached node");
            }
            abstractC2961.mo3926(this.f6637);
            int i = this.f6636;
            int iM3932 = AbstractC2628.m3932(abstractC2961);
            abstractC2961.f6636 = iM3932;
            int i2 = this.f6636;
            int i3 = iM3932 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC2608)) {
                AbstractC8765.m13982("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC2961);
            }
            abstractC2961.f6633 = this.f5571;
            this.f5571 = abstractC2961;
            abstractC2961.f6629 = this;
            m3927(iM3932 | this.f6636, false);
            if (this.f6624) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo3923(this.f6631);
                } else {
                    C2646 c2646 = AbstractC2620.m3906(this).f5439;
                    this.f6637.mo3923(null);
                    c2646.m3989();
                }
                abstractC2961.mo3922();
                abstractC2961.mo3929();
                if (!abstractC2961.f6624) {
                    AbstractC8765.m13982("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC2628.m3937(abstractC2961, -1, 1);
            }
        }
        return interfaceC2622;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void mo3925() {
        super.mo3925();
        for (AbstractC2961 abstractC2961 = this.f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3925();
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo3926(AbstractC2961 abstractC2961) {
        this.f6637 = abstractC2961;
        for (AbstractC2961 abstractC29612 = this.f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
            abstractC29612.mo3926(abstractC2961);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m3927(int i, boolean z) {
        AbstractC2961 abstractC2961;
        int i2 = this.f6636;
        this.f6636 = i;
        if (i2 != i) {
            AbstractC2961 abstractC29612 = this.f6637;
            if (abstractC29612 == this) {
                this.f6630 = i;
            }
            boolean z2 = this.f6624;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f6636;
                    r2.f6636 = i;
                    if (r2 == abstractC29612) {
                        break;
                    } else {
                        r2 = r2.f6629;
                    }
                }
                if (z && r2 == abstractC29612) {
                    i = AbstractC2628.m3932(abstractC29612);
                    abstractC29612.f6636 = i;
                }
                int i3 = i | ((r2 == 0 || (abstractC2961 = r2.f6633) == null) ? 0 : abstractC2961.f6630);
                for (?? r22 = r2; r22 != 0; r22 = r22.f6629) {
                    i3 |= r22.f6636;
                    r22.f6630 = i3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3928(InterfaceC2622 interfaceC2622) {
        AbstractC2961 abstractC2961 = null;
        for (AbstractC2961 abstractC29612 = this.f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
            if (abstractC29612 == interfaceC2622) {
                boolean z = abstractC29612.f6624;
                if (z) {
                    C1099 c1099 = AbstractC2628.f5579;
                    if (!z) {
                        AbstractC8765.m13982("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC2628.m3937(abstractC29612, -1, 2);
                    abstractC29612.mo3925();
                    abstractC29612.mo3931();
                }
                abstractC29612.mo3926(abstractC29612);
                abstractC29612.f6630 = 0;
                AbstractC2961 abstractC29613 = abstractC29612.f6633;
                if (abstractC2961 == null) {
                    this.f5571 = abstractC29613;
                } else {
                    abstractC2961.f6633 = abstractC29613;
                }
                abstractC29612.f6633 = null;
                abstractC29612.f6629 = null;
                int i = this.f6636;
                int iM3932 = AbstractC2628.m3932(this);
                m3927(iM3932, true);
                if (this.f6624 && (i & 2) != 0 && (iM3932 & 2) == 0) {
                    C2646 c2646 = AbstractC2620.m3906(this).f5439;
                    this.f6637.mo3923(null);
                    c2646.m3989();
                    return;
                }
                return;
            }
            abstractC2961 = abstractC29612;
        }
        C5043.m9151(interfaceC2622, "Could not find delegate: ");
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void mo3929() {
        for (AbstractC2961 abstractC2961 = this.f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3929();
        }
        super.mo3929();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void mo3930() {
        super.mo3930();
        for (AbstractC2961 abstractC2961 = this.f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3930();
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo3931() {
        for (AbstractC2961 abstractC2961 = this.f5571; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
            abstractC2961.mo3931();
        }
        super.mo3931();
    }
}
