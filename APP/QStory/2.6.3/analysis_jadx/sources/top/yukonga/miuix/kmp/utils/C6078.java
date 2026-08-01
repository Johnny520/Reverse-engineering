package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1084;
import androidx.compose.foundation.gestures.C0502;
import androidx.compose.foundation.gestures.C0510;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.window.area.AbstractC2567;
import kotlinx.coroutines.InterfaceC5452;
import p112.C7329;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6078 implements InterfaceC1084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f16612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f16613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f16614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6081 f16615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f16616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f16617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C6081 f16618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C6081 f16619;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f16622;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC5452 f16623;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C6077 f16624;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC5452 f16626;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6049 f16621 = new C6049();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6049 f16625 = new C6049();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C6082 f16620 = new C6082(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11430(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16612;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f16613 + f;
        this.f16613 = f3;
        float fM5071 = AbstractC2567.m5071(f3, -f2, f2);
        this.f16613 = fM5071;
        float fMin = Math.min(Math.abs(fM5071) / this.f16612, 1.0f);
        float fSignum = Math.signum(this.f16613);
        float f4 = this.f16612;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11432(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11431(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16622;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f16614 + f;
        this.f16614 = f3;
        float fM5071 = AbstractC2567.m5071(f3, -f2, f2);
        this.f16614 = fM5071;
        float fMin = Math.min(Math.abs(fM5071) / this.f16622, 1.0f);
        float fSignum = Math.signum(this.f16614);
        float f4 = this.f16622;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11433(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1955(long j, int i, C0510 c0510) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        c0510.getClass();
        C0502 c0502 = (C0502) c0510.f1510;
        if (i != 1) {
            C7329 c7329 = new C7329(c0502.m1265(c0502.f1496, j, c0502.f1499));
            m11434();
            return c7329.f19541;
        }
        C6081 c6081 = this.f16619;
        if (c6081 != null) {
            c6081.invoke();
        }
        InterfaceC5452 interfaceC5452 = this.f16623;
        if (interfaceC5452 != null) {
            interfaceC5452.mo10256(null);
        }
        InterfaceC5452 interfaceC54522 = this.f16626;
        if (interfaceC54522 != null) {
            interfaceC54522.mo10256(null);
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        if (Math.abs(this.f16616) <= 1.0f || Float.intBitsToFloat(i2) == 0.0f || Math.signum(Float.intBitsToFloat(i2)) == Math.signum(this.f16613)) {
            fIntBitsToFloat = 0.0f;
        } else {
            float fIntBitsToFloat4 = Math.abs(this.f16613) <= Math.abs(Float.intBitsToFloat(i2)) ? -this.f16613 : Float.intBitsToFloat(i2);
            if (Math.abs(this.f16613) <= Math.abs(Float.intBitsToFloat(i2))) {
                m11432(0.0f);
                this.f16613 = 0.0f;
                float f = fIntBitsToFloat4;
                fIntBitsToFloat3 = Float.intBitsToFloat(i2) - fIntBitsToFloat4;
                fIntBitsToFloat = f;
            } else {
                m11430(fIntBitsToFloat4);
                fIntBitsToFloat = Float.intBitsToFloat(i2);
                fIntBitsToFloat3 = 0.0f;
            }
        }
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        if (Math.abs(this.f16617) <= 1.0f || Float.intBitsToFloat(i3) == 0.0f || Math.signum(Float.intBitsToFloat(i3)) == Math.signum(this.f16614)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            float fIntBitsToFloat6 = Math.abs(this.f16614) <= Math.abs(Float.intBitsToFloat(i3)) ? -this.f16614 : Float.intBitsToFloat(i3);
            if (Math.abs(this.f16614) <= Math.abs(Float.intBitsToFloat(i3))) {
                m11433(0.0f);
                this.f16614 = 0.0f;
                float f2 = fIntBitsToFloat6;
                fIntBitsToFloat5 = Float.intBitsToFloat(i3) - fIntBitsToFloat6;
                fIntBitsToFloat2 = f2;
            } else {
                m11431(fIntBitsToFloat6);
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                fIntBitsToFloat5 = 0.0f;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        long j2 = new C7329(c0502.m1265(c0502.f1496, jFloatToRawIntBits, c0502.f1499)).f19541;
        long jM12526 = C7329.m12526(jFloatToRawIntBits, j2);
        int i4 = (int) (jM12526 & 4294967295L);
        if (Float.intBitsToFloat(i4) != 0.0f) {
            m11430(Float.intBitsToFloat(i4));
        }
        int i5 = (int) (jM12526 >> 32);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            m11431(Float.intBitsToFloat(i5));
        }
        m11434();
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat + (Float.intBitsToFloat(i4) != 0.0f ? Float.intBitsToFloat(i4) : 0.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 >> 32)) + fIntBitsToFloat2) + (Float.intBitsToFloat(i5) == 0.0f ? 0.0f : Float.intBitsToFloat(i5)))) << 32);
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1956() {
        return Math.abs(this.f16617) > 1.0f || Math.abs(this.f16616) > 1.0f;
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC1787 mo1957() {
        return this.f16620;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1958(long r14, p052.InterfaceC6554 r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6078.mo1958(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11432(float f) {
        if (this.f16616 == f) {
            return;
        }
        this.f16616 = f;
        C6081 c6081 = this.f16615;
        if (c6081 != null) {
            c6081.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11433(float f) {
        if (this.f16617 == f) {
            return;
        }
        this.f16617 = f;
        C6081 c6081 = this.f16615;
        if (c6081 != null) {
            c6081.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11434() {
        C6074 c6074;
        boolean zMo1956;
        C6081 c6081 = this.f16618;
        if (c6081 == null || (c6074 = (C6074) c6081.invoke()) == null || c6074.m11429() == (zMo1956 = mo1956())) {
            return;
        }
        c6074.m11428(zMo1956);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11435(float f) {
        if (Math.abs(this.f16617) <= 1.0f && f == 0.0f) {
            m11433(0.0f);
            this.f16614 = 0.0f;
            return;
        }
        InterfaceC5452 interfaceC5452 = this.f16626;
        if (interfaceC5452 != null) {
            interfaceC5452.mo10256(null);
        }
        C6077 c6077 = this.f16624;
        this.f16626 = c6077 != null ? (InterfaceC5452) c6077.invoke(new MiuixOverscrollEffect$startSpringAnimationX$1(this, f, null)) : null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11436(float f) {
        if (Math.abs(this.f16616) <= 1.0f && f == 0.0f) {
            m11432(0.0f);
            this.f16613 = 0.0f;
            return;
        }
        InterfaceC5452 interfaceC5452 = this.f16623;
        if (interfaceC5452 != null) {
            interfaceC5452.mo10256(null);
        }
        C6077 c6077 = this.f16624;
        this.f16623 = c6077 != null ? (InterfaceC5452) c6077.invoke(new MiuixOverscrollEffect$startSpringAnimationY$1(this, f, null)) : null;
    }
}
