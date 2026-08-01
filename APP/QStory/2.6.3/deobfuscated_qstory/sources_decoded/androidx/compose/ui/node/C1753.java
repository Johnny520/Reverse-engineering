package androidx.compose.ui.node;

import androidx.collection.C0252;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1684;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1687;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p205.C7906;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1753 extends AbstractC1794 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static final C1609 f5139;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C1774 f5140;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public InterfaceC1773 f5141;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C1684 f5142;

    static {
        C1609 c1609M2896 = AbstractC1581.m2896();
        int i = C1599.f4699;
        c1609M2896.m2969(C1599.f4692);
        c1609M2896.m2967(1.0f);
        c1609M2896.m2968(1);
        f5139 = c1609M2896;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1753(C1748 c1748, InterfaceC1773 interfaceC1773) {
        super(c1748);
        this.f5141 = interfaceC1773;
        this.f5140 = c1748.f5120 != null ? new C1774(this) : null;
        this.f5142 = (((AbstractC2128) interfaceC1773).f6292.f6291 & 512) != 0 ? new C1684(this, (InterfaceC1687) interfaceC1773) : null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3054(int i) {
        if (this.f5142 != null) {
            this.f5257.getClass();
            throw null;
        }
        InterfaceC1773 interfaceC1773 = this.f5141;
        AbstractC1794 abstractC1794 = this.f5257;
        abstractC1794.getClass();
        return interfaceC1773.mo1076(this, abstractC1794, i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3055(long j) {
        m3140(j);
        C1684 c1684 = this.f5142;
        if (c1684 == null) {
            InterfaceC1773 interfaceC1773 = this.f5141;
            AbstractC1794 abstractC1794 = this.f5257;
            abstractC1794.getClass();
            m3386(interfaceC1773.mo1102(this, abstractC1794, j));
            m3380();
            return this;
        }
        C1774 c1774 = c1684.f4943.f5140;
        c1774.getClass();
        InterfaceC1657 interfaceC1657Mo3201 = c1774.mo3201();
        interfaceC1657Mo3201.mo1473();
        interfaceC1657Mo3201.mo1474();
        throw null;
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final AbstractC2128 mo3282() {
        return ((AbstractC2128) this.f5141).f6292;
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void mo3283(InterfaceC1601 interfaceC1601, C1516 c1516) {
        AbstractC1794 abstractC1794;
        AbstractC1794 abstractC17942 = this.f5257;
        abstractC17942.getClass();
        abstractC17942.m3406(interfaceC1601, c1516);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(this.f5259)).getShowLayoutBounds() || (abstractC1794 = this.f5257) == null) {
            return;
        }
        if (C7906.m13357(this.f4998, abstractC1794.f4998) && C7908.m13364(abstractC1794.f5245, 0L)) {
            return;
        }
        long j = this.f4998;
        interfaceC1601.mo2692(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5139);
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final void mo3284() {
        if (this.f5140 == null) {
            this.f5140 = new C1774(this);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final AbstractC1745 mo3285() {
        return this.f5140;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3057(int i) {
        if (this.f5142 != null) {
            this.f5257.getClass();
            throw null;
        }
        InterfaceC1773 interfaceC1773 = this.f5141;
        AbstractC1794 abstractC1794 = this.f5257;
        abstractC1794.getClass();
        return interfaceC1773.mo1074(this, abstractC1794, i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3058(int i) {
        if (this.f5142 != null) {
            this.f5257.getClass();
            throw null;
        }
        InterfaceC1773 interfaceC1773 = this.f5141;
        AbstractC1794 abstractC1794 = this.f5257;
        abstractC1794.getClass();
        return interfaceC1773.mo1075(this, abstractC1794, i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3059(int i) {
        if (this.f5142 != null) {
            this.f5257.getClass();
            throw null;
        }
        InterfaceC1773 interfaceC1773 = this.f5141;
        AbstractC1794 abstractC1794 = this.f5257;
        abstractC1794.getClass();
        return interfaceC1773.mo1077(this, abstractC1794, i);
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final int mo3286(AbstractC1689 abstractC1689) {
        C1774 c1774 = this.f5140;
        if (c1774 == null) {
            return AbstractC1785.m3341(this, abstractC1689);
        }
        C0252 c0252 = c1774.f5058;
        int iM804 = c0252.m804(abstractC1689);
        if (iM804 >= 0) {
            return c0252.f916[iM804];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3128(long r5, float r7, p052.InterfaceC6558 r8) {
        /*
            r4 = this;
            boolean r0 = r4.f5258
            if (r0 == 0) goto L11
            androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r5 = r4.mo3285()
            r5.getClass()
            long r5 = r5.f5062
            r4.m3395(r5, r7, r8)
            goto L14
        L11:
            r4.m3395(r5, r7, r8)
        L14:
            boolean r5 = r4.f5148
            if (r5 == 0) goto L19
            goto L6e
        L19:
            r4.m3381()
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r5 = r4.f5257
            r5.getClass()
            androidx.compose.ui.layout.飘花落叶言子楪世兰哲苏 r6 = r4.f5142
            r7 = 0
            if (r6 == 0) goto L5f
            androidx.compose.ui.node.飘花落叶言子楪兰哲苏世 r6 = r4.f5140
            r6.getClass()
            long r0 = r4.f4998
            androidx.compose.ui.node.飘花落叶言子楪兰哲苏世 r6 = r4.f5140
            r8 = 0
            if (r6 == 0) goto L3c
            long r2 = r6.m3208()
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰哲世 r6 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰哲世
            r6.<init>(r2)
            goto L3d
        L3c:
            r6 = r8
        L3d:
            boolean r6 = p205.C7906.m13358(r6, r0)
            if (r6 == 0) goto L5c
            long r0 = r5.f4998
            androidx.compose.ui.node.飘花落叶言子世哲楪苏兰 r6 = r5.mo3285()
            if (r6 == 0) goto L54
            long r2 = r6.m3208()
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰哲世 r8 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰哲世
            r8.<init>(r2)
        L54:
            boolean r6 = p205.C7906.m13358(r8, r0)
            if (r6 == 0) goto L5c
            r6 = 1
            goto L5d
        L5c:
            r6 = r7
        L5d:
            r5.f5258 = r6
        L5f:
            boolean r6 = r4.f5147
            r5.f5147 = r6
            androidx.compose.ui.layout.飘花落叶言子世兰苏哲楪 r4 = r4.mo3201()
            r4.mo1471()
            r5.f5147 = r7
            r5.f5258 = r7
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1753.mo3128(long, float, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public final void m3287(InterfaceC1773 interfaceC1773) {
        if (!interfaceC1773.equals(this.f5141)) {
            if ((((AbstractC2128) interfaceC1773).f6292.f6291 & 512) != 0) {
                InterfaceC1687 interfaceC1687 = (InterfaceC1687) interfaceC1773;
                C1684 c1684 = this.f5142;
                if (c1684 == null) {
                    c1684 = new C1684(this, interfaceC1687);
                }
                this.f5142 = c1684;
            } else {
                this.f5142 = null;
            }
        }
        this.f5141 = interfaceC1773;
    }
}
