package androidx.compose.ui.node;

import androidx.appcompat.app.C0076;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1771 extends AbstractC1794 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final C1609 f5200;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C1772 f5201;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final C1760 f5202;

    static {
        C1609 c1609M2886 = AbstractC1581.m2886();
        int i = C1599.f4698;
        c1609M2886.m2959(C1599.f4692);
        c1609M2886.m2957(1.0f);
        c1609M2886.m2958(1);
        f5200 = c1609M2886;
    }

    public C1771(C1748 c1748) {
        super(c1748);
        C1760 c1760 = new C1760();
        c1760.f6284 = 0;
        this.f5202 = c1760;
        c1760.f6285 = this;
        this.f5201 = c1748.f5119 != null ? new C1772(this) : null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3044(int i) {
        C0076 c0076M3241 = this.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1103(c1748.f5093.f5284, c1748.m3248(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3045(long j) {
        m3130(j);
        C1748 c1748 = this.f5258;
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1748) objArr[i2]).f5131.f5166.f5026 = LayoutNode$UsageByParent.NotUsed;
        }
        m3376(c1748.f5103.mo1105(this, c1748.m3248(), j));
        m3370();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3316(androidx.compose.ui.node.InterfaceC1810 r12, long r13, androidx.compose.ui.node.C1780 r15, int r16, boolean r17) {
        /*
            r11 = this;
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r11.f5258
            boolean r1 = r12.mo3407(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.m3399(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.m3393()
            float r11 = r11.m3397(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.f5219
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r0 = r0.m3230()
            java.lang.Object[] r1 = r0.f3520
            int r0 = r0.f3519
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r5 = (androidx.compose.ui.node.C1748) r5
            boolean r2 = r5.m3232()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.mo3409(r5, r6, r8, r9, r10)
            long r2 = r15.m3322()
            float r6 = androidx.compose.ui.node.AbstractC1785.m3349(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = androidx.compose.ui.node.AbstractC1785.m3342(r2)
            if (r6 == 0) goto L73
            boolean r2 = androidx.compose.ui.node.AbstractC1785.m3345(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.mo3411(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.f5219 = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1771.mo3316(androidx.compose.ui.node.飘花落叶言子苏楪兰哲世, long, androidx.compose.ui.node.飘花落叶言子楪哲兰苏世, int, boolean):void");
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final AbstractC2128 mo3272() {
        return this.f5202;
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public final void mo3273(InterfaceC1601 interfaceC1601, C1516 c1516) throws Throwable {
        C1748 c1748 = this.f5258;
        InterfaceC1801 interfaceC1801M3296 = AbstractC1757.m3296(c1748);
        C1224 c1224M3230 = c1748.m3230();
        Object[] objArr = c1224M3230.f3520;
        int i = c1224M3230.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c17482.m3232()) {
                c17482.m3257(interfaceC1601, c1516);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3296).getShowLayoutBounds()) {
            long j = this.f4997;
            interfaceC1601.mo2682(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5200);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public final void mo3274() {
        if (this.f5201 == null) {
            this.f5201 = new C1772(this);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final AbstractC1745 mo3275() {
        return this.f5201;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3047(int i) {
        C0076 c0076M3241 = this.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1107(c1748.f5093.f5284, c1748.m3248(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3048(int i) {
        C0076 c0076M3241 = this.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1104(c1748.f5093.f5284, c1748.m3248(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3049(int i) {
        C0076 c0076M3241 = this.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1106(c1748.f5093.f5284, c1748.m3248(), i);
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final int mo3276(AbstractC1689 abstractC1689) {
        C1772 c1772 = this.f5201;
        if (c1772 != null) {
            return c1772.mo3276(abstractC1689);
        }
        C1738 c1738 = this.f5258.f5131.f5166;
        LayoutNode$LayoutState layoutNode$LayoutState = c1738.f5037.f5158;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        C1759 c1759 = c1738.f5019;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            c1759.f5195 = true;
            if (c1759.f5197) {
                c1738.f5029 = true;
                c1738.f5020 = true;
            }
        } else {
            c1759.f5194 = true;
        }
        C1771 c1771Mo3162 = c1738.mo3162();
        boolean z = c1771Mo3162.f5146;
        c1771Mo3162.f5146 = true;
        c1738.mo3157();
        c1771Mo3162.f5146 = z;
        Integer num = (Integer) c1759.f5199.get(abstractC1689);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3118(long j, float f, InterfaceC6557 interfaceC6557) {
        if (this.f5257) {
            AbstractC1745 abstractC1745Mo3275 = mo3275();
            abstractC1745Mo3275.getClass();
            m3385(abstractC1745Mo3275.f5061, f, interfaceC6557);
        } else {
            m3385(j, f, interfaceC6557);
        }
        if (this.f5147) {
            return;
        }
        this.f5258.f5131.f5166.m3159();
    }
}
