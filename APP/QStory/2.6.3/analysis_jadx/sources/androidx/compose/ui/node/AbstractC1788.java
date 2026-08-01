package androidx.compose.ui.node;

import androidx.collection.C0252;
import androidx.compose.ui.AbstractC2128;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1788 extends AbstractC2128 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f5225 = AbstractC1793.m3373(this);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC2128 f5226;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo3362() {
        super.mo3362();
        for (AbstractC2128 abstractC2128 = this.f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
            abstractC2128.mo3363(this.f6286);
            if (!abstractC2128.f6279) {
                abstractC2128.mo3362();
            }
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo3363(AbstractC1794 abstractC1794) {
        this.f6286 = abstractC1794;
        for (AbstractC2128 abstractC2128 = this.f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
            abstractC2128.mo3363(abstractC1794);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC1787 m3364(InterfaceC1787 interfaceC1787) {
        AbstractC2128 abstractC2128 = ((AbstractC2128) interfaceC1787).f6292;
        if (abstractC2128 != interfaceC1787) {
            AbstractC2128 abstractC21282 = interfaceC1787 instanceof AbstractC2128 ? (AbstractC2128) interfaceC1787 : null;
            AbstractC2128 abstractC21283 = abstractC21282 != null ? abstractC21282.f6284 : null;
            if (abstractC2128 != this.f6292 || !AbstractC4395.m8907(abstractC21283, this)) {
                C5925.m11311("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (abstractC2128.f6279) {
                AbstractC7936.m13423("Cannot delegate to an already attached node");
            }
            abstractC2128.mo3366(this.f6292);
            int i = this.f6291;
            int iM3372 = AbstractC1793.m3372(abstractC2128);
            abstractC2128.f6291 = iM3372;
            int i2 = this.f6291;
            int i3 = iM3372 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC1773)) {
                AbstractC7936.m13423("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC2128);
            }
            abstractC2128.f6288 = this.f5226;
            this.f5226 = abstractC2128;
            abstractC2128.f6284 = this;
            m3367(iM3372 | this.f6291, false);
            if (this.f6279) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo3363(this.f6286);
                } else {
                    C1811 c1811 = AbstractC1785.m3346(this).f5094;
                    this.f6292.mo3363(null);
                    c1811.m3429();
                }
                abstractC2128.mo3362();
                abstractC2128.mo3369();
                if (!abstractC2128.f6279) {
                    AbstractC7936.m13423("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC1793.m3377(abstractC2128, -1, 1);
            }
        }
        return interfaceC1787;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void mo3365() {
        super.mo3365();
        for (AbstractC2128 abstractC2128 = this.f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
            abstractC2128.mo3365();
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo3366(AbstractC2128 abstractC2128) {
        this.f6292 = abstractC2128;
        for (AbstractC2128 abstractC21282 = this.f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
            abstractC21282.mo3366(abstractC2128);
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
    public final void m3367(int i, boolean z) {
        AbstractC2128 abstractC2128;
        int i2 = this.f6291;
        this.f6291 = i;
        if (i2 != i) {
            AbstractC2128 abstractC21282 = this.f6292;
            if (abstractC21282 == this) {
                this.f6285 = i;
            }
            boolean z2 = this.f6279;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f6291;
                    r2.f6291 = i;
                    if (r2 == abstractC21282) {
                        break;
                    } else {
                        r2 = r2.f6284;
                    }
                }
                if (z && r2 == abstractC21282) {
                    i = AbstractC1793.m3372(abstractC21282);
                    abstractC21282.f6291 = i;
                }
                int i3 = i | ((r2 == 0 || (abstractC2128 = r2.f6288) == null) ? 0 : abstractC2128.f6285);
                for (?? r22 = r2; r22 != 0; r22 = r22.f6284) {
                    i3 |= r22.f6291;
                    r22.f6285 = i3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3368(InterfaceC1787 interfaceC1787) {
        AbstractC2128 abstractC2128 = null;
        for (AbstractC2128 abstractC21282 = this.f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
            if (abstractC21282 == interfaceC1787) {
                boolean z = abstractC21282.f6279;
                if (z) {
                    C0252 c0252 = AbstractC1793.f5234;
                    if (!z) {
                        AbstractC7936.m13423("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC1793.m3377(abstractC21282, -1, 2);
                    abstractC21282.mo3365();
                    abstractC21282.mo3371();
                }
                abstractC21282.mo3366(abstractC21282);
                abstractC21282.f6285 = 0;
                AbstractC2128 abstractC21283 = abstractC21282.f6288;
                if (abstractC2128 == null) {
                    this.f5226 = abstractC21283;
                } else {
                    abstractC2128.f6288 = abstractC21283;
                }
                abstractC21282.f6288 = null;
                abstractC21282.f6284 = null;
                int i = this.f6291;
                int iM3372 = AbstractC1793.m3372(this);
                m3367(iM3372, true);
                if (this.f6279 && (i & 2) != 0 && (iM3372 & 2) == 0) {
                    C1811 c1811 = AbstractC1785.m3346(this).f5094;
                    this.f6292.mo3363(null);
                    c1811.m3429();
                    return;
                }
                return;
            }
            abstractC2128 = abstractC21282;
        }
        C4211.m8592(interfaceC1787, "Could not find delegate: ");
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void mo3369() {
        for (AbstractC2128 abstractC2128 = this.f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
            abstractC2128.mo3369();
        }
        super.mo3369();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void mo3370() {
        super.mo3370();
        for (AbstractC2128 abstractC2128 = this.f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
            abstractC2128.mo3370();
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo3371() {
        for (AbstractC2128 abstractC2128 = this.f5226; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
            abstractC2128.mo3371();
        }
        super.mo3371();
    }
}
