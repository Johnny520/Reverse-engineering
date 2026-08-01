package androidx.compose.p001ui.node;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C2059;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2593 implements InterfaceC2339, InterfaceC2341 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2616 f5520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2342 f5521 = new C2342();

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    public final LayoutDirection getLayoutDirection() {
        return this.f5521.f4631.f4634;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return f / this.f5521.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f5521.mo1893(i);
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo3263(C2449 c2449, AbstractC2433 abstractC2433, float f, AbstractC2340 abstractC2340, int i) {
        this.f5521.mo3263(c2449, abstractC2433, f, abstractC2340, i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f5521.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f5521.mo1895(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3867(AbstractC2433 abstractC2433, long j, long j2, long j3, float f, AbstractC2340 abstractC2340) {
        C2342 c2342 = this.f5521;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        c2342.f4631.f4633.mo3243(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c2342.m3274(abstractC2433, abstractC2340, f, null, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3868(AbstractC2433 abstractC2433, long j, long j2, float f, AbstractC2340 abstractC2340) {
        C2342 c2342 = this.f5521;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        c2342.f4631.f4633.mo3252(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), c2342.m3274(abstractC2433, abstractC2340, f, null, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3869(C2449 c2449, long j, AbstractC2340 abstractC2340) {
        C2342 c2342 = this.f5521;
        c2342.f4631.f4633.mo3248(c2449, C2342.m3271(c2342, j, abstractC2340, 1.0f, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3870(InterfaceC2436 interfaceC2436, long j, AbstractC2629 abstractC2629, InterfaceC2616 interfaceC2616, C2351 c2351) {
        InterfaceC2616 interfaceC26162 = this.f5520;
        this.f5520 = interfaceC2616;
        LayoutDirection layoutDirection = abstractC2629.f5604.f5445;
        C2342 c2342 = this.f5521;
        InterfaceC8725 interfaceC8725M949 = c2342.f4629.m949();
        C0955 c0955 = c2342.f4629;
        LayoutDirection layoutDirectionM930 = c0955.m930();
        InterfaceC2436 interfaceC2436M946 = c0955.m946();
        long jM928 = c0955.m928();
        C2351 c23512 = (C2351) c0955.f665;
        c0955.m924(abstractC2629);
        c0955.m920(layoutDirection);
        c0955.m925(interfaceC2436);
        c0955.m921(j);
        c0955.f665 = c2351;
        interfaceC2436.mo3237();
        try {
            interfaceC2616.mo1688(this);
            interfaceC2436.mo3249();
            c0955.m924(interfaceC8725M949);
            c0955.m920(layoutDirectionM930);
            c0955.m925(interfaceC2436M946);
            c0955.m921(jM928);
            c0955.f665 = c23512;
            this.f5520 = interfaceC26162;
        } catch (Throwable th) {
            interfaceC2436.mo3249();
            c0955.m924(interfaceC8725M949);
            c0955.m920(layoutDirectionM930);
            c0955.m925(interfaceC2436M946);
            c0955.m921(jM928);
            c0955.f665 = c23512;
            throw th;
        }
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5521.mo1816();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3871() {
        C2342 c2342 = this.f5521;
        InterfaceC2436 interfaceC2436M946 = c2342.f4629.m946();
        InterfaceC2622 interfaceC2622 = this.f5520;
        if (interfaceC2622 == null) {
            throw AbstractC0900.m699("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC2961 abstractC2961 = (AbstractC2961) interfaceC2622;
        AbstractC2961 abstractC2961M3899 = abstractC2961.f6637.f6633;
        if (abstractC2961M3899 == null || (abstractC2961M3899.f6630 & 4) == 0) {
            abstractC2961M3899 = null;
        } else {
            while (abstractC2961M3899 != null) {
                int i = abstractC2961M3899.f6636;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    abstractC2961M3899 = abstractC2961M3899.f6633;
                }
            }
            abstractC2961M3899 = null;
        }
        if (abstractC2961M3899 == null) {
            AbstractC2629 abstractC2629M3908 = AbstractC2620.m3908(interfaceC2622, 4);
            if (abstractC2629M3908.mo3842() == abstractC2961.f6637) {
                abstractC2629M3908 = abstractC2629M3908.f5602;
                abstractC2629M3908.getClass();
            }
            abstractC2629M3908.mo3843(interfaceC2436M946, (C2351) c2342.f4629.f665);
            return;
        }
        C2059 c2059 = null;
        while (abstractC2961M3899 != null) {
            if (abstractC2961M3899 instanceof InterfaceC2616) {
                InterfaceC2616 interfaceC2616 = (InterfaceC2616) abstractC2961M3899;
                C2351 c2351 = (C2351) c2342.f4629.f665;
                AbstractC2629 abstractC2629M39082 = AbstractC2620.m3908(interfaceC2616, 4);
                long jM1700 = AbstractC1298.m1700(abstractC2629M39082.f5343);
                C2583 c2583 = abstractC2629M39082.f5604;
                c2583.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getSharedDrawScope().m3870(interfaceC2436M946, jM1700, abstractC2629M39082, interfaceC2616, c2351);
            } else if ((abstractC2961M3899.f6636 & 4) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                int i2 = 0;
                for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                    if ((abstractC29612.f6636 & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            abstractC2961M3899 = abstractC29612;
                        } else {
                            if (c2059 == null) {
                                c2059 = new C2059(0, new AbstractC2961[16]);
                            }
                            if (abstractC2961M3899 != null) {
                                c2059.m2607(abstractC2961M3899);
                                abstractC2961M3899 = null;
                            }
                            c2059.m2607(abstractC29612);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            abstractC2961M3899 = AbstractC2620.m3899(c2059);
        }
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f5521.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f5521.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f5521.mo1901(j);
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo3264(C2445 c2445, long j, long j2, long j3, float f, C2442 c2442, int i) {
        this.f5521.mo3264(c2445, j, j2, j3, f, c2442, i);
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final long mo3265() {
        return this.f5521.mo3265();
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final C0955 mo3266() {
        return this.f5521.f4629;
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final void mo3267(long j, float f, float f2, long j2, long j3, AbstractC2340 abstractC2340) {
        this.f5521.mo3267(j, f, f2, j2, j3, abstractC2340);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f5521.mo1902(j);
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final long mo3268() {
        return this.f5521.mo3268();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f5521.mo1903(f);
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo3269(long j, long j2, long j3, float f, AbstractC2340 abstractC2340, int i) {
        this.f5521.mo3269(j, j2, j3, f, abstractC2340, i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5521.mo1817();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f5521.mo1816() * f;
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final void mo3270(float f, long j, long j2) {
        this.f5521.mo3270(f, j, j2);
    }
}
