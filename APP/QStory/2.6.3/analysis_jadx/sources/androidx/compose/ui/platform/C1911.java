package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.collection.C0244;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.graphics.C1615;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.graphics.layer.InterfaceC1514;
import androidx.compose.ui.node.InterfaceC1806;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p112.C7329;
import p175.AbstractC7739;
import p205.C7906;
import p205.C7908;
import p205.InterfaceC7896;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1911 implements InterfaceC1806 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f5635;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5639;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5641;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f5643;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5644;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC1581 f5645;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC6543 f5646;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6554 f5647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float[] f5649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1583 f5652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1516 f5654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f5650 = 9223372034707292159L;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float[] f5648 = C1587.m2907();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC7896 f5638 = AbstractC7739.m13071();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public LayoutDirection f5637 = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1507 f5636 = new C1507();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f5634 = C1615.f4727;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5642 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC6558 f5640 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1504 interfaceC1504) {
            C1911 c1911 = this.this$0;
            InterfaceC1601 interfaceC1601M386 = interfaceC1504.mo2706().m386();
            InterfaceC6554 interfaceC6554 = c1911.f5647;
            if (interfaceC6554 != null) {
                interfaceC6554.invoke(interfaceC1601M386, (C1516) interfaceC1504.mo2706().f320);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1504) obj);
            return C5176.f14739;
        }
    };

    public C1911(C1516 c1516, InterfaceC1583 interfaceC1583, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, InterfaceC6554 interfaceC6554, InterfaceC6543 interfaceC6543) {
        this.f5654 = c1516;
        this.f5652 = interfaceC1583;
        this.f5653 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5647 = interfaceC6554;
        this.f5646 = interfaceC6543;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3607(boolean z) {
        if (z != this.f5639) {
            this.f5639 = z;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5653;
            C0244 c0244 = viewTreeObserverOnGlobalLayoutListenerC1884.f5422;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC1884.f5419;
            if (!z) {
                if (z2) {
                    return;
                }
                c0244.m776(this);
                C0244 c02442 = viewTreeObserverOnGlobalLayoutListenerC1884.f5418;
                if (c02442 != null) {
                    c02442.m776(this);
                    return;
                }
                return;
            }
            if (!z2) {
                c0244.m775(this);
                return;
            }
            C0244 c02443 = viewTreeObserverOnGlobalLayoutListenerC1884.f5418;
            if (c02443 == null) {
                c02443 = new C0244();
                viewTreeObserverOnGlobalLayoutListenerC1884.f5418 = c02443;
            }
            c02443.m775(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3608(long j) {
        if (C7906.m13357(j, this.f5650)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC1884.m3515()) {
            this.f5653.m3524(-4.0f);
        }
        this.f5650 = j;
        m3610();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3609(long j) {
        boolean zM3515 = ViewTreeObserverOnGlobalLayoutListenerC1884.m3515();
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5653;
        if (zM3515) {
            viewTreeObserverOnGlobalLayoutListenerC1884.m3524(-4.0f);
        }
        C1516 c1516 = this.f5654;
        if (!C7908.m13364(c1516.f4357, j)) {
            c1516.f4357 = j;
            c1516.f4356.mo2748((int) (j >> 32), (int) (j & 4294967295L), c1516.f4361);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC1884, viewTreeObserverOnGlobalLayoutListenerC1884);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3610() {
        if (this.f5639 || this.f5651) {
            return;
        }
        this.f5653.invalidate();
        m3607(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] m3611() {
        boolean z = this.f5644;
        float[] fArr = this.f5648;
        if (z) {
            C1516 c1516 = this.f5654;
            long jM13705 = c1516.f4362;
            InterfaceC1514 interfaceC1514 = c1516.f4356;
            if ((9223372034707292159L & jM13705) == 9205357640488583168L) {
                jM13705 = AbstractC8190.m13705(AbstractC0455.m1140(this.f5650));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM13705 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM13705 & 4294967295L));
            float fMo2727 = interfaceC1514.mo2727();
            float fMo2741 = interfaceC1514.mo2741();
            float fMo2725 = interfaceC1514.mo2725();
            float fMo2747 = interfaceC1514.mo2747();
            float fMo2752 = interfaceC1514.mo2752();
            float fMo2738 = interfaceC1514.mo2738();
            float fMo2719 = interfaceC1514.mo2719();
            double d = ((double) fMo2725) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fMo2741 * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fMo2741 * fSin);
            double d2 = ((double) fMo2747) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fMo2727 * fCos2);
            float f10 = (f3 * fCos2) + ((-fMo2727) * fSin2);
            double d3 = ((double) fMo2752) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fMo2738;
            float f16 = f14 * fMo2738;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fMo2738;
            float f18 = f12 * fMo2719;
            float f19 = fCos * fCos3 * fMo2719;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fMo2719;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.f5644 = false;
            this.f5642 = AbstractC1581.m2886(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] m3612() {
        float[] fArrM2907 = this.f5649;
        if (fArrM2907 == null) {
            fArrM2907 = C1587.m2907();
            this.f5649 = fArrM2907;
        }
        if (this.f5643) {
            this.f5643 = false;
            float[] fArrM3611 = m3611();
            if (this.f5642) {
                return fArrM3611;
            }
            if (!AbstractC1916.m3621(fArrM3611, fArrM2907)) {
                fArrM2907[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM2907[0])) {
            return null;
        }
        return fArrM2907;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3613() {
        ViewTreeObserverOnGlobalLayoutListenerC1884.m3515();
        if (this.f5639) {
            if (!C1615.m2985(this.f5634, C1615.f4727) && !C7906.m13357(this.f5654.f4361, this.f5650)) {
                C1516 c1516 = this.f5654;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5634 >> 32)) * ((int) (this.f5650 >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f5634 & 4294967295L)) * ((int) (this.f5650 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!C7329.m12528(c1516.f4362, jFloatToRawIntBits)) {
                    c1516.f4362 = jFloatToRawIntBits;
                    c1516.f4356.mo2749(jFloatToRawIntBits);
                }
            }
            C1516 c15162 = this.f5654;
            InterfaceC7896 interfaceC7896 = this.f5638;
            LayoutDirection layoutDirection = this.f5637;
            long j = this.f5650;
            InterfaceC1514 interfaceC1514 = c15162.f4356;
            if (!C7906.m13357(c15162.f4361, j)) {
                c15162.f4361 = j;
                long j2 = c15162.f4357;
                interfaceC1514.mo2748((int) (j2 >> 32), (int) (4294967295L & j2), j);
                if (c15162.f4373 == 9205357640488583168L) {
                    c15162.f4370 = true;
                    c15162.m2797();
                }
            }
            c15162.f4355 = interfaceC7896;
            c15162.f4354 = layoutDirection;
            c15162.f4353 = this.f5640;
            interfaceC1514.mo2720(interfaceC7896, layoutDirection, c15162, c15162.f4352);
            m3607(false);
        }
    }
}
