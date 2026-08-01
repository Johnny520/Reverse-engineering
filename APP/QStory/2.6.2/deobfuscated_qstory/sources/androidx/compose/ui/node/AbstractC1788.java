package androidx.compose.ui.node;

import androidx.collection.C0252;
import androidx.compose.ui.AbstractC2128;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1788 extends AbstractC2128 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f5224 = AbstractC1793.m3363(this);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC2128 f5225;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void mo3352() {
        super.mo3352();
        for (AbstractC2128 abstractC2128 = this.f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3353(this.f6285);
            if (!abstractC2128.f6278) {
                abstractC2128.mo3352();
            }
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final void mo3353(AbstractC1794 abstractC1794) {
        this.f6285 = abstractC1794;
        for (AbstractC2128 abstractC2128 = this.f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3353(abstractC1794);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC1787 m3354(InterfaceC1787 interfaceC1787) {
        AbstractC2128 abstractC2128 = ((AbstractC2128) interfaceC1787).f6291;
        if (abstractC2128 != interfaceC1787) {
            AbstractC2128 abstractC21282 = interfaceC1787 instanceof AbstractC2128 ? (AbstractC2128) interfaceC1787 : null;
            AbstractC2128 abstractC21283 = abstractC21282 != null ? abstractC21282.f6283 : null;
            if (abstractC2128 != this.f6291 || !AbstractC4394.m8917(abstractC21283, this)) {
                C5919.m11250("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (abstractC2128.f6278) {
                AbstractC7935.m13395("Cannot delegate to an already attached node");
            }
            abstractC2128.mo3356(this.f6291);
            int i = this.f6290;
            int iM3362 = AbstractC1793.m3362(abstractC2128);
            abstractC2128.f6290 = iM3362;
            int i2 = this.f6290;
            int i3 = iM3362 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC1773)) {
                AbstractC7935.m13395("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC2128);
            }
            abstractC2128.f6287 = this.f5225;
            this.f5225 = abstractC2128;
            abstractC2128.f6283 = this;
            m3357(iM3362 | this.f6290, false);
            if (this.f6278) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo3353(this.f6285);
                } else {
                    C1811 c1811 = AbstractC1785.m3336(this).f5093;
                    this.f6291.mo3353(null);
                    c1811.m3419();
                }
                abstractC2128.mo3352();
                abstractC2128.mo3359();
                if (!abstractC2128.f6278) {
                    AbstractC7935.m13395("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC1793.m3367(abstractC2128, -1, 1);
            }
        }
        return interfaceC1787;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void mo3355() {
        super.mo3355();
        for (AbstractC2128 abstractC2128 = this.f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3355();
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo3356(AbstractC2128 abstractC2128) {
        this.f6291 = abstractC2128;
        for (AbstractC2128 abstractC21282 = this.f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
            abstractC21282.mo3356(abstractC2128);
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
    public final void m3357(int i, boolean z) {
        AbstractC2128 abstractC2128;
        int i2 = this.f6290;
        this.f6290 = i;
        if (i2 != i) {
            AbstractC2128 abstractC21282 = this.f6291;
            if (abstractC21282 == this) {
                this.f6284 = i;
            }
            boolean z2 = this.f6278;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f6290;
                    r2.f6290 = i;
                    if (r2 == abstractC21282) {
                        break;
                    } else {
                        r2 = r2.f6283;
                    }
                }
                if (z && r2 == abstractC21282) {
                    i = AbstractC1793.m3362(abstractC21282);
                    abstractC21282.f6290 = i;
                }
                int i3 = i | ((r2 == 0 || (abstractC2128 = r2.f6287) == null) ? 0 : abstractC2128.f6284);
                for (?? r22 = r2; r22 != 0; r22 = r22.f6283) {
                    i3 |= r22.f6290;
                    r22.f6284 = i3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3358(InterfaceC1787 interfaceC1787) {
        AbstractC2128 abstractC2128 = null;
        for (AbstractC2128 abstractC21282 = this.f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
            if (abstractC21282 == interfaceC1787) {
                boolean z = abstractC21282.f6278;
                if (z) {
                    C0252 c0252 = AbstractC1793.f5233;
                    if (!z) {
                        AbstractC7935.m13395("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC1793.m3367(abstractC21282, -1, 2);
                    abstractC21282.mo3355();
                    abstractC21282.mo3361();
                }
                abstractC21282.mo3356(abstractC21282);
                abstractC21282.f6284 = 0;
                AbstractC2128 abstractC21283 = abstractC21282.f6287;
                if (abstractC2128 == null) {
                    this.f5225 = abstractC21283;
                } else {
                    abstractC2128.f6287 = abstractC21283;
                }
                abstractC21282.f6287 = null;
                abstractC21282.f6283 = null;
                int i = this.f6290;
                int iM3362 = AbstractC1793.m3362(this);
                m3357(iM3362, true);
                if (this.f6278 && (i & 2) != 0 && (iM3362 & 2) == 0) {
                    C1811 c1811 = AbstractC1785.m3336(this).f5093;
                    this.f6291.mo3353(null);
                    c1811.m3419();
                    return;
                }
                return;
            }
            abstractC2128 = abstractC21282;
        }
        C4210.m8602(interfaceC1787, "Could not find delegate: ");
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void mo3359() {
        for (AbstractC2128 abstractC2128 = this.f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3359();
        }
        super.mo3359();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void mo3360() {
        super.mo3360();
        for (AbstractC2128 abstractC2128 = this.f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3360();
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo3361() {
        for (AbstractC2128 abstractC2128 = this.f5225; abstractC2128 != null; abstractC2128 = abstractC2128.f6287) {
            abstractC2128.mo3361();
        }
        super.mo3361();
    }
}
