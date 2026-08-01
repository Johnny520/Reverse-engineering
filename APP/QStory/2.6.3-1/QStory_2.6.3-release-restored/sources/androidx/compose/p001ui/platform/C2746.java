package androidx.compose.p001ui.platform;

import android.view.ViewParent;
import androidx.collection.C1091;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.graphics.C2450;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.graphics.layer.InterfaceC2349;
import androidx.compose.p001ui.node.InterfaceC2641;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8158;
import p191.AbstractC8568;
import p221.C8735;
import p221.C8737;
import p221.InterfaceC8725;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2746 implements InterfaceC2641 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f5980;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f5984;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f5986;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f5988;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f5989;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC2416 f5990;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7372 f5991;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC7383 f5992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float[] f5994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2418 f5997;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f5998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2351 f5999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f5995 = 9223372034707292159L;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float[] f5993 = C2422.m3467();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC8725 f5983 = AbstractC8568.m13630();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public LayoutDirection f5982 = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C2342 f5981 = new C2342();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f5979 = C2450.f5072;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f5987 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC7387 f5985 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        public final void invoke(InterfaceC2339 interfaceC2339) {
            C2746 c2746 = this.this$0;
            InterfaceC2436 interfaceC2436M946 = interfaceC2339.mo3266().m946();
            InterfaceC7383 interfaceC7383 = c2746.f5992;
            if (interfaceC7383 != null) {
                interfaceC7383.invoke(interfaceC2436M946, (C2351) interfaceC2339.mo3266().f665);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2339) obj);
            return C6008.f15084;
        }
    };

    public C2746(C2351 c2351, InterfaceC2418 interfaceC2418, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, InterfaceC7383 interfaceC7383, InterfaceC7372 interfaceC7372) {
        this.f5999 = c2351;
        this.f5997 = interfaceC2418;
        this.f5998 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f5992 = interfaceC7383;
        this.f5991 = interfaceC7372;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4167(boolean z) {
        if (z != this.f5984) {
            this.f5984 = z;
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5998;
            C1091 c1091 = viewTreeObserverOnGlobalLayoutListenerC2719.f5767;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC2719.f5764;
            if (!z) {
                if (z2) {
                    return;
                }
                c1091.m1336(this);
                C1091 c10912 = viewTreeObserverOnGlobalLayoutListenerC2719.f5763;
                if (c10912 != null) {
                    c10912.m1336(this);
                    return;
                }
                return;
            }
            if (!z2) {
                c1091.m1335(this);
                return;
            }
            C1091 c10913 = viewTreeObserverOnGlobalLayoutListenerC2719.f5763;
            if (c10913 == null) {
                c10913 = new C1091();
                viewTreeObserverOnGlobalLayoutListenerC2719.f5763 = c10913;
            }
            c10913.m1335(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4168(long j) {
        if (C8735.m13916(j, this.f5995)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC2719.m4075()) {
            this.f5998.m4084(-4.0f);
        }
        this.f5995 = j;
        m4170();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4169(long j) {
        boolean zM4075 = ViewTreeObserverOnGlobalLayoutListenerC2719.m4075();
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5998;
        if (zM4075) {
            viewTreeObserverOnGlobalLayoutListenerC2719.m4084(-4.0f);
        }
        C2351 c2351 = this.f5999;
        if (!C8737.m13923(c2351.f4702, j)) {
            c2351.f4702 = j;
            c2351.f4701.mo3308((int) (j >> 32), (int) (j & 4294967295L), c2351.f4706);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC2719.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC2719, viewTreeObserverOnGlobalLayoutListenerC2719);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4170() {
        if (this.f5984 || this.f5996) {
            return;
        }
        this.f5998.invalidate();
        m4167(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] m4171() {
        boolean z = this.f5989;
        float[] fArr = this.f5993;
        if (z) {
            C2351 c2351 = this.f5999;
            long jM14264 = c2351.f4707;
            InterfaceC2349 interfaceC2349 = c2351.f4701;
            if ((9223372034707292159L & jM14264) == 9205357640488583168L) {
                jM14264 = AbstractC9019.m14264(AbstractC1298.m1700(this.f5995));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM14264 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM14264 & 4294967295L));
            float fMo3287 = interfaceC2349.mo3287();
            float fMo3301 = interfaceC2349.mo3301();
            float fMo3285 = interfaceC2349.mo3285();
            float fMo3307 = interfaceC2349.mo3307();
            float fMo3312 = interfaceC2349.mo3312();
            float fMo3298 = interfaceC2349.mo3298();
            float fMo3279 = interfaceC2349.mo3279();
            double d = ((double) fMo3285) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fMo3301 * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fMo3301 * fSin);
            double d2 = ((double) fMo3307) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fMo3287 * fCos2);
            float f10 = (f3 * fCos2) + ((-fMo3287) * fSin2);
            double d3 = ((double) fMo3312) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fMo3298;
            float f16 = f14 * fMo3298;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fMo3298;
            float f18 = f12 * fMo3279;
            float f19 = fCos * fCos3 * fMo3279;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fMo3279;
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
            this.f5989 = false;
            this.f5987 = AbstractC2416.m3446(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] m4172() {
        float[] fArrM3467 = this.f5994;
        if (fArrM3467 == null) {
            fArrM3467 = C2422.m3467();
            this.f5994 = fArrM3467;
        }
        if (this.f5988) {
            this.f5988 = false;
            float[] fArrM4171 = m4171();
            if (this.f5987) {
                return fArrM4171;
            }
            if (!AbstractC2751.m4181(fArrM4171, fArrM3467)) {
                fArrM3467[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM3467[0])) {
            return null;
        }
        return fArrM3467;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4173() {
        ViewTreeObserverOnGlobalLayoutListenerC2719.m4075();
        if (this.f5984) {
            if (!C2450.m3545(this.f5979, C2450.f5072) && !C8735.m13916(this.f5999.f4706, this.f5995)) {
                C2351 c2351 = this.f5999;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5979 >> 32)) * ((int) (this.f5995 >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f5979 & 4294967295L)) * ((int) (this.f5995 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!C8158.m13087(c2351.f4707, jFloatToRawIntBits)) {
                    c2351.f4707 = jFloatToRawIntBits;
                    c2351.f4701.mo3309(jFloatToRawIntBits);
                }
            }
            C2351 c23512 = this.f5999;
            InterfaceC8725 interfaceC8725 = this.f5983;
            LayoutDirection layoutDirection = this.f5982;
            long j = this.f5995;
            InterfaceC2349 interfaceC2349 = c23512.f4701;
            if (!C8735.m13916(c23512.f4706, j)) {
                c23512.f4706 = j;
                long j2 = c23512.f4702;
                interfaceC2349.mo3308((int) (j2 >> 32), (int) (4294967295L & j2), j);
                if (c23512.f4718 == 9205357640488583168L) {
                    c23512.f4715 = true;
                    c23512.m3357();
                }
            }
            c23512.f4700 = interfaceC8725;
            c23512.f4699 = layoutDirection;
            c23512.f4698 = this.f5985;
            interfaceC2349.mo3280(interfaceC8725, layoutDirection, c23512, c23512.f4697);
            m4167(false);
        }
    }
}
