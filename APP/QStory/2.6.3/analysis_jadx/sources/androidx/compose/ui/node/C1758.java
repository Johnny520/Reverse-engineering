package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1758 implements InterfaceC1504, InterfaceC1506 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC1781 f5175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1507 f5176 = new C1507();

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    public final LayoutDirection getLayoutDirection() {
        return this.f5176.f4286.f4289;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1332(float f) {
        return f / this.f5176.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1333(int i) {
        return this.f5176.mo1333(i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2703(C1614 c1614, AbstractC1598 abstractC1598, float f, AbstractC1505 abstractC1505, int i) {
        this.f5176.mo2703(c1614, abstractC1598, f, abstractC1505, i);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1334(float f) {
        return this.f5176.mo1334(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1335(long j) {
        return this.f5176.mo1335(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3307(AbstractC1598 abstractC1598, long j, long j2, long j3, float f, AbstractC1505 abstractC1505) {
        C1507 c1507 = this.f5176;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        c1507.f4286.f4288.mo2683(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c1507.m2714(abstractC1598, abstractC1505, f, null, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3308(AbstractC1598 abstractC1598, long j, long j2, float f, AbstractC1505 abstractC1505) {
        C1507 c1507 = this.f5176;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        c1507.f4286.f4288.mo2692(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), c1507.m2714(abstractC1598, abstractC1505, f, null, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3309(C1614 c1614, long j, AbstractC1505 abstractC1505) {
        C1507 c1507 = this.f5176;
        c1507.f4286.f4288.mo2688(c1614, C1507.m2711(c1507, j, abstractC1505, 1.0f, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3310(InterfaceC1601 interfaceC1601, long j, AbstractC1794 abstractC1794, InterfaceC1781 interfaceC1781, C1516 c1516) {
        InterfaceC1781 interfaceC17812 = this.f5175;
        this.f5175 = interfaceC1781;
        LayoutDirection layoutDirection = abstractC1794.f5259.f5100;
        C1507 c1507 = this.f5176;
        InterfaceC7896 interfaceC7896M389 = c1507.f4284.m389();
        C0108 c0108 = c1507.f4284;
        LayoutDirection layoutDirectionM370 = c0108.m370();
        InterfaceC1601 interfaceC1601M386 = c0108.m386();
        long jM368 = c0108.m368();
        C1516 c15162 = (C1516) c0108.f320;
        c0108.m364(abstractC1794);
        c0108.m360(layoutDirection);
        c0108.m365(interfaceC1601);
        c0108.m361(j);
        c0108.f320 = c1516;
        interfaceC1601.mo2677();
        try {
            interfaceC1781.mo1128(this);
            interfaceC1601.mo2689();
            c0108.m364(interfaceC7896M389);
            c0108.m360(layoutDirectionM370);
            c0108.m365(interfaceC1601M386);
            c0108.m361(jM368);
            c0108.f320 = c15162;
            this.f5175 = interfaceC17812;
        } catch (Throwable th) {
            interfaceC1601.mo2689();
            c0108.m364(interfaceC7896M389);
            c0108.m360(layoutDirectionM370);
            c0108.m365(interfaceC1601M386);
            c0108.m361(jM368);
            c0108.f320 = c15162;
            throw th;
        }
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f5176.mo1256();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3311() {
        C1507 c1507 = this.f5176;
        InterfaceC1601 interfaceC1601M386 = c1507.f4284.m386();
        InterfaceC1787 interfaceC1787 = this.f5175;
        if (interfaceC1787 == null) {
            throw AbstractC0053.m139("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC2128 abstractC2128 = (AbstractC2128) interfaceC1787;
        AbstractC2128 abstractC2128M3339 = abstractC2128.f6292.f6288;
        if (abstractC2128M3339 == null || (abstractC2128M3339.f6285 & 4) == 0) {
            abstractC2128M3339 = null;
        } else {
            while (abstractC2128M3339 != null) {
                int i = abstractC2128M3339.f6291;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    abstractC2128M3339 = abstractC2128M3339.f6288;
                }
            }
            abstractC2128M3339 = null;
        }
        if (abstractC2128M3339 == null) {
            AbstractC1794 abstractC1794M3348 = AbstractC1785.m3348(interfaceC1787, 4);
            if (abstractC1794M3348.mo3282() == abstractC2128.f6292) {
                abstractC1794M3348 = abstractC1794M3348.f5257;
                abstractC1794M3348.getClass();
            }
            abstractC1794M3348.mo3283(interfaceC1601M386, (C1516) c1507.f4284.f320);
            return;
        }
        C1224 c1224 = null;
        while (abstractC2128M3339 != null) {
            if (abstractC2128M3339 instanceof InterfaceC1781) {
                InterfaceC1781 interfaceC1781 = (InterfaceC1781) abstractC2128M3339;
                C1516 c1516 = (C1516) c1507.f4284.f320;
                AbstractC1794 abstractC1794M33482 = AbstractC1785.m3348(interfaceC1781, 4);
                long jM1140 = AbstractC0455.m1140(abstractC1794M33482.f4998);
                C1748 c1748 = abstractC1794M33482.f5259;
                c1748.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getSharedDrawScope().m3310(interfaceC1601M386, jM1140, abstractC1794M33482, interfaceC1781, c1516);
            } else if ((abstractC2128M3339.f6291 & 4) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                int i2 = 0;
                for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                    if ((abstractC21282.f6291 & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            abstractC2128M3339 = abstractC21282;
                        } else {
                            if (c1224 == null) {
                                c1224 = new C1224(0, new AbstractC2128[16]);
                            }
                            if (abstractC2128M3339 != null) {
                                c1224.m2047(abstractC2128M3339);
                                abstractC2128M3339 = null;
                            }
                            c1224.m2047(abstractC21282);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            abstractC2128M3339 = AbstractC1785.m3339(c1224);
        }
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1339(long j) {
        return this.f5176.mo1339(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1340(float f) {
        return this.f5176.mo1340(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1341(long j) {
        return this.f5176.mo1341(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2704(C1610 c1610, long j, long j2, long j3, float f, C1607 c1607, int i) {
        this.f5176.mo2704(c1610, j, j2, j3, f, c1607, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final long mo2705() {
        return this.f5176.mo2705();
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final C0108 mo2706() {
        return this.f5176.f4284;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final void mo2707(long j, float f, float f2, long j2, long j3, AbstractC1505 abstractC1505) {
        this.f5176.mo2707(j, f, f2, j2, j3, abstractC1505);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1342(long j) {
        return this.f5176.mo1342(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final long mo2708() {
        return this.f5176.mo2708();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1343(float f) {
        return this.f5176.mo1343(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo2709(long j, long j2, long j3, float f, AbstractC1505 abstractC1505, int i) {
        this.f5176.mo2709(j, j2, j3, f, abstractC1505, i);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f5176.mo1257();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1344(float f) {
        return this.f5176.mo1256() * f;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final void mo2710(float f, long j, long j2) {
        this.f5176.mo2710(f, j, j2);
    }
}
