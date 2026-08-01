package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1758 implements InterfaceC1504, InterfaceC1506 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC1781 f5174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1507 f5175 = new C1507();

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    public final LayoutDirection getLayoutDirection() {
        return this.f5175.f4285.f4288;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1322(float f) {
        return f / this.f5175.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1323(int i) {
        return this.f5175.mo1323(i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2693(C1614 c1614, AbstractC1598 abstractC1598, float f, AbstractC1505 abstractC1505, int i) {
        this.f5175.mo2693(c1614, abstractC1598, f, abstractC1505, i);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1324(float f) {
        return this.f5175.mo1324(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1325(long j) {
        return this.f5175.mo1325(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3297(AbstractC1598 abstractC1598, long j, long j2, long j3, float f, AbstractC1505 abstractC1505) {
        C1507 c1507 = this.f5175;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        c1507.f4285.f4287.mo2673(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c1507.m2704(abstractC1598, abstractC1505, f, null, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3298(AbstractC1598 abstractC1598, long j, long j2, float f, AbstractC1505 abstractC1505) {
        C1507 c1507 = this.f5175;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        c1507.f4285.f4287.mo2682(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), c1507.m2704(abstractC1598, abstractC1505, f, null, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3299(C1614 c1614, long j, AbstractC1505 abstractC1505) {
        C1507 c1507 = this.f5175;
        c1507.f4285.f4287.mo2678(c1614, C1507.m2701(c1507, j, abstractC1505, 1.0f, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3300(InterfaceC1601 interfaceC1601, long j, AbstractC1794 abstractC1794, InterfaceC1781 interfaceC1781, C1516 c1516) {
        InterfaceC1781 interfaceC17812 = this.f5174;
        this.f5174 = interfaceC1781;
        LayoutDirection layoutDirection = abstractC1794.f5258.f5099;
        C1507 c1507 = this.f5175;
        InterfaceC7895 interfaceC7895M388 = c1507.f4283.m388();
        C0108 c0108 = c1507.f4283;
        LayoutDirection layoutDirectionM369 = c0108.m369();
        InterfaceC1601 interfaceC1601M385 = c0108.m385();
        long jM367 = c0108.m367();
        C1516 c15162 = (C1516) c0108.f320;
        c0108.m363(abstractC1794);
        c0108.m359(layoutDirection);
        c0108.m364(interfaceC1601);
        c0108.m360(j);
        c0108.f320 = c1516;
        interfaceC1601.mo2667();
        try {
            interfaceC1781.mo1127(this);
            interfaceC1601.mo2679();
            c0108.m363(interfaceC7895M388);
            c0108.m359(layoutDirectionM369);
            c0108.m364(interfaceC1601M385);
            c0108.m360(jM367);
            c0108.f320 = c15162;
            this.f5174 = interfaceC17812;
        } catch (Throwable th) {
            interfaceC1601.mo2679();
            c0108.m363(interfaceC7895M388);
            c0108.m359(layoutDirectionM369);
            c0108.m364(interfaceC1601M385);
            c0108.m360(jM367);
            c0108.f320 = c15162;
            throw th;
        }
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f5175.mo1246();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3301() {
        C1507 c1507 = this.f5175;
        InterfaceC1601 interfaceC1601M385 = c1507.f4283.m385();
        InterfaceC1787 interfaceC1787 = this.f5174;
        if (interfaceC1787 == null) {
            throw AbstractC0053.m139("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1787;
        AbstractC2128 abstractC2128M3329 = abstractC2128.f6291.f6287;
        if (abstractC2128M3329 == null || (abstractC2128M3329.f6284 & 4) == 0) {
            abstractC2128M3329 = null;
        } else {
            while (abstractC2128M3329 != null) {
                int i = abstractC2128M3329.f6290;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    abstractC2128M3329 = abstractC2128M3329.f6287;
                }
            }
            abstractC2128M3329 = null;
        }
        if (abstractC2128M3329 == null) {
            AbstractC1794 abstractC1794M3338 = AbstractC1785.m3338(interfaceC1787, 4);
            if (abstractC1794M3338.mo3272() == abstractC2128.f6291) {
                abstractC1794M3338 = abstractC1794M3338.f5256;
                abstractC1794M3338.getClass();
            }
            abstractC1794M3338.mo3273(interfaceC1601M385, (C1516) c1507.f4283.f320);
            return;
        }
        C1224 c1224 = null;
        while (abstractC2128M3329 != null) {
            if (abstractC2128M3329 instanceof InterfaceC1781) {
                InterfaceC1781 interfaceC1781 = (InterfaceC1781) abstractC2128M3329;
                C1516 c1516 = (C1516) c1507.f4283.f320;
                AbstractC1794 abstractC1794M33382 = AbstractC1785.m3338(interfaceC1781, 4);
                long jM13654 = AbstractC8189.m13654(abstractC1794M33382.f4997);
                C1748 c1748 = abstractC1794M33382.f5258;
                c1748.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getSharedDrawScope().m3300(interfaceC1601M385, jM13654, abstractC1794M33382, interfaceC1781, c1516);
            } else if ((abstractC2128M3329.f6290 & 4) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                int i2 = 0;
                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                    if ((abstractC21282.f6290 & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            abstractC2128M3329 = abstractC21282;
                        } else {
                            if (c1224 == null) {
                                c1224 = new C1224(0, new AbstractC2128[16]);
                            }
                            if (abstractC2128M3329 != null) {
                                c1224.m2037(abstractC2128M3329);
                                abstractC2128M3329 = null;
                            }
                            c1224.m2037(abstractC21282);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            abstractC2128M3329 = AbstractC1785.m3329(c1224);
        }
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1329(long j) {
        return this.f5175.mo1329(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1330(float f) {
        return this.f5175.mo1330(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1331(long j) {
        return this.f5175.mo1331(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2694(C1610 c1610, long j, long j2, long j3, float f, C1607 c1607, int i) {
        this.f5175.mo2694(c1610, j, j2, j3, f, c1607, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final long mo2695() {
        return this.f5175.mo2695();
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final C0108 mo2696() {
        return this.f5175.f4283;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final void mo2697(long j, float f, float f2, long j2, long j3, AbstractC1505 abstractC1505) {
        this.f5175.mo2697(j, f, f2, j2, j3, abstractC1505);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1332(long j) {
        return this.f5175.mo1332(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final long mo2698() {
        return this.f5175.mo2698();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1333(float f) {
        return this.f5175.mo1333(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo2699(long j, long j2, long j3, float f, AbstractC1505 abstractC1505, int i) {
        this.f5175.mo2699(j, j2, j3, f, abstractC1505, i);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f5175.mo1247();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1334(float f) {
        return this.f5175.mo1246() * f;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final void mo2700(float f, long j, long j2) {
        this.f5175.mo2700(f, j, j2);
    }
}
