package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.collection.C0244;
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
import kotlin.C5175;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p112.C7328;
import p205.C7905;
import p205.C7907;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1911 implements InterfaceC1806 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f5634;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5638;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5640;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f5642;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5643;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC1581 f5644;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC6542 f5645;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6553 f5646;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float[] f5648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1583 f5651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1516 f5653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f5649 = 9223372034707292159L;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float[] f5647 = C1587.m2897();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC7895 f5637 = AbstractC6325.m11859();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public LayoutDirection f5636 = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1507 f5635 = new C1507();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f5633 = C1615.f4726;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5641 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC6557 f5639 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        public final void invoke(InterfaceC1504 interfaceC1504) {
            C1911 c1911 = this.this$0;
            InterfaceC1601 interfaceC1601M385 = interfaceC1504.mo2696().m385();
            InterfaceC6553 interfaceC6553 = c1911.f5646;
            if (interfaceC6553 != null) {
                interfaceC6553.invoke(interfaceC1601M385, (C1516) interfaceC1504.mo2696().f320);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1504) obj);
            return C5175.f14739;
        }
    };

    public C1911(C1516 c1516, InterfaceC1583 interfaceC1583, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, InterfaceC6553 interfaceC6553, InterfaceC6542 interfaceC6542) {
        this.f5653 = c1516;
        this.f5651 = interfaceC1583;
        this.f5652 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5646 = interfaceC6553;
        this.f5645 = interfaceC6542;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3597(boolean z) {
        if (z != this.f5638) {
            this.f5638 = z;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5652;
            C0244 c0244 = viewTreeObserverOnGlobalLayoutListenerC1884.f5421;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC1884.f5418;
            if (!z) {
                if (z2) {
                    return;
                }
                c0244.m775(this);
                C0244 c02442 = viewTreeObserverOnGlobalLayoutListenerC1884.f5417;
                if (c02442 != null) {
                    c02442.m775(this);
                    return;
                }
                return;
            }
            if (!z2) {
                c0244.m774(this);
                return;
            }
            C0244 c02443 = viewTreeObserverOnGlobalLayoutListenerC1884.f5417;
            if (c02443 == null) {
                c02443 = new C0244();
                viewTreeObserverOnGlobalLayoutListenerC1884.f5417 = c02443;
            }
            c02443.m774(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3598(long j) {
        if (C7905.m13329(j, this.f5649)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC1884.m3505()) {
            this.f5652.m3514(-4.0f);
        }
        this.f5649 = j;
        m3600();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3599(long j) {
        boolean zM3505 = ViewTreeObserverOnGlobalLayoutListenerC1884.m3505();
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5652;
        if (zM3505) {
            viewTreeObserverOnGlobalLayoutListenerC1884.m3514(-4.0f);
        }
        C1516 c1516 = this.f5653;
        if (!C7907.m13336(c1516.f4356, j)) {
            c1516.f4356 = j;
            c1516.f4355.mo2738((int) (j >> 32), (int) (j & 4294967295L), c1516.f4360);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC1884, viewTreeObserverOnGlobalLayoutListenerC1884);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3600() {
        if (this.f5638 || this.f5650) {
            return;
        }
        this.f5652.invalidate();
        m3597(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] m3601() {
        boolean z = this.f5643;
        float[] fArr = this.f5647;
        if (z) {
            C1516 c1516 = this.f5653;
            long jM11406 = c1516.f4361;
            InterfaceC1514 interfaceC1514 = c1516.f4355;
            if ((9223372034707292159L & jM11406) == 9205357640488583168L) {
                jM11406 = AbstractC6087.m11406(AbstractC8189.m13654(this.f5649));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM11406 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM11406 & 4294967295L));
            float fMo2717 = interfaceC1514.mo2717();
            float fMo2731 = interfaceC1514.mo2731();
            float fMo2715 = interfaceC1514.mo2715();
            float fMo2737 = interfaceC1514.mo2737();
            float fMo2742 = interfaceC1514.mo2742();
            float fMo2728 = interfaceC1514.mo2728();
            float fMo2709 = interfaceC1514.mo2709();
            double d = ((double) fMo2715) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fMo2731 * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fMo2731 * fSin);
            double d2 = ((double) fMo2737) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fMo2717 * fCos2);
            float f10 = (f3 * fCos2) + ((-fMo2717) * fSin2);
            double d3 = ((double) fMo2742) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fMo2728;
            float f16 = f14 * fMo2728;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fMo2728;
            float f18 = f12 * fMo2709;
            float f19 = fCos * fCos3 * fMo2709;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fMo2709;
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
            this.f5643 = false;
            this.f5641 = AbstractC1581.m2876(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] m3602() {
        float[] fArrM2897 = this.f5648;
        if (fArrM2897 == null) {
            fArrM2897 = C1587.m2897();
            this.f5648 = fArrM2897;
        }
        if (this.f5642) {
            this.f5642 = false;
            float[] fArrM3601 = m3601();
            if (this.f5641) {
                return fArrM3601;
            }
            if (!AbstractC1916.m3611(fArrM3601, fArrM2897)) {
                fArrM2897[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM2897[0])) {
            return null;
        }
        return fArrM2897;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3603() {
        ViewTreeObserverOnGlobalLayoutListenerC1884.m3505();
        if (this.f5638) {
            if (!C1615.m2975(this.f5633, C1615.f4726) && !C7905.m13329(this.f5653.f4360, this.f5649)) {
                C1516 c1516 = this.f5653;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5633 >> 32)) * ((int) (this.f5649 >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f5633 & 4294967295L)) * ((int) (this.f5649 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!C7328.m12501(c1516.f4361, jFloatToRawIntBits)) {
                    c1516.f4361 = jFloatToRawIntBits;
                    c1516.f4355.mo2739(jFloatToRawIntBits);
                }
            }
            C1516 c15162 = this.f5653;
            InterfaceC7895 interfaceC7895 = this.f5637;
            LayoutDirection layoutDirection = this.f5636;
            long j = this.f5649;
            InterfaceC1514 interfaceC1514 = c15162.f4355;
            if (!C7905.m13329(c15162.f4360, j)) {
                c15162.f4360 = j;
                long j2 = c15162.f4356;
                interfaceC1514.mo2738((int) (j2 >> 32), (int) (4294967295L & j2), j);
                if (c15162.f4372 == 9205357640488583168L) {
                    c15162.f4369 = true;
                    c15162.m2787();
                }
            }
            c15162.f4354 = interfaceC7895;
            c15162.f4353 = layoutDirection;
            c15162.f4352 = this.f5639;
            interfaceC1514.mo2710(interfaceC7895, layoutDirection, c15162, c15162.f4351);
            m3597(false);
        }
    }
}
