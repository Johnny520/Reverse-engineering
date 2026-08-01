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
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1771 extends AbstractC1794 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final C1609 f5201;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C1772 f5202;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final C1760 f5203;

    static {
        C1609 c1609M2896 = AbstractC1581.m2896();
        int i = C1599.f4699;
        c1609M2896.m2969(C1599.f4693);
        c1609M2896.m2967(1.0f);
        c1609M2896.m2968(1);
        f5201 = c1609M2896;
    }

    public C1771(C1748 c1748) {
        super(c1748);
        C1760 c1760 = new C1760();
        c1760.f6285 = 0;
        this.f5203 = c1760;
        c1760.f6286 = this;
        this.f5202 = c1748.f5120 != null ? new C1772(this) : null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3054(int i) {
        C0076 c0076M3251 = this.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1104(c1748.f5094.f5285, c1748.m3258(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3055(long j) {
        m3140(j);
        C1748 c1748 = this.f5259;
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            ((C1748) objArr[i2]).f5132.f5167.f5027 = LayoutNode$UsageByParent.NotUsed;
        }
        m3386(c1748.f5104.mo1106(this, c1748.m3258(), j));
        m3380();
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
    public final void mo3326(androidx.compose.ui.node.InterfaceC1810 r12, long r13, androidx.compose.ui.node.C1780 r15, int r16, boolean r17) {
        /*
            r11 = this;
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r0 = r11.f5259
            boolean r1 = r12.mo3417(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.m3409(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.m3403()
            float r11 = r11.m3407(r13, r4)
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
            int r11 = r15.f5220
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r0 = r0.m3240()
            java.lang.Object[] r1 = r0.f3521
            int r0 = r0.f3520
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r5 = (androidx.compose.ui.node.C1748) r5
            boolean r2 = r5.m3242()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.mo3419(r5, r6, r8, r9, r10)
            long r2 = r15.m3332()
            float r6 = androidx.compose.ui.node.AbstractC1785.m3359(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = androidx.compose.ui.node.AbstractC1785.m3352(r2)
            if (r6 == 0) goto L73
            boolean r2 = androidx.compose.ui.node.AbstractC1785.m3355(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.mo3421(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.f5220 = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1771.mo3326(androidx.compose.ui.node.飘花落叶言子苏楪兰哲世, long, androidx.compose.ui.node.飘花落叶言子楪哲兰苏世, int, boolean):void");
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final AbstractC2128 mo3282() {
        return this.f5203;
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public final void mo3283(InterfaceC1601 interfaceC1601, C1516 c1516) throws Throwable {
        C1748 c1748 = this.f5259;
        InterfaceC1801 interfaceC1801M3306 = AbstractC1757.m3306(c1748);
        C1224 c1224M3240 = c1748.m3240();
        Object[] objArr = c1224M3240.f3521;
        int i = c1224M3240.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c17482 = (C1748) objArr[i2];
            if (c17482.m3242()) {
                c17482.m3267(interfaceC1601, c1516);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801M3306).getShowLayoutBounds()) {
            long j = this.f4998;
            interfaceC1601.mo2692(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5201);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public final void mo3284() {
        if (this.f5202 == null) {
            this.f5202 = new C1772(this);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1794
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final AbstractC1745 mo3285() {
        return this.f5202;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3057(int i) {
        C0076 c0076M3251 = this.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1108(c1748.f5094.f5285, c1748.m3258(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3058(int i) {
        C0076 c0076M3251 = this.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1105(c1748.f5094.f5285, c1748.m3258(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3059(int i) {
        C0076 c0076M3251 = this.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1107(c1748.f5094.f5285, c1748.m3258(), i);
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final int mo3286(AbstractC1689 abstractC1689) {
        C1772 c1772 = this.f5202;
        if (c1772 != null) {
            return c1772.mo3286(abstractC1689);
        }
        C1738 c1738 = this.f5259.f5132.f5167;
        LayoutNode$LayoutState layoutNode$LayoutState = c1738.f5038.f5159;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        C1759 c1759 = c1738.f5020;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            c1759.f5196 = true;
            if (c1759.f5198) {
                c1738.f5030 = true;
                c1738.f5021 = true;
            }
        } else {
            c1759.f5195 = true;
        }
        C1771 c1771Mo3172 = c1738.mo3172();
        boolean z = c1771Mo3172.f5147;
        c1771Mo3172.f5147 = true;
        c1738.mo3167();
        c1771Mo3172.f5147 = z;
        Integer num = (Integer) c1759.f5200.get(abstractC1689);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3128(long j, float f, InterfaceC6558 interfaceC6558) {
        if (this.f5258) {
            AbstractC1745 abstractC1745Mo3285 = mo3285();
            abstractC1745Mo3285.getClass();
            m3395(abstractC1745Mo3285.f5062, f, interfaceC6558);
        } else {
            m3395(j, f, interfaceC6558);
        }
        if (this.f5148) {
            return;
        }
        this.f5259.f5132.f5167.m3169();
    }
}
