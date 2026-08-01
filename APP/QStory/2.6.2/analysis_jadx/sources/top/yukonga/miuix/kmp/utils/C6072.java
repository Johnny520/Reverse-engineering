package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1084;
import androidx.compose.foundation.gestures.C0502;
import androidx.compose.foundation.gestures.C0510;
import androidx.compose.ui.node.InterfaceC1787;
import kotlinx.coroutines.InterfaceC5451;
import p000.AbstractC6087;
import p112.C7328;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6072 implements InterfaceC1084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f16603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f16604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f16605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6075 f16606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f16607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f16608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C6075 f16609;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C6075 f16610;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f16613;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC5451 f16614;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C6071 f16615;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC5451 f16617;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6043 f16612 = new C6043();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6043 f16616 = new C6043();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C6076 f16611 = new C6076(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11370(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16603;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f16604 + f;
        this.f16604 = f3;
        float fM11419 = AbstractC6087.m11419(f3, -f2, f2);
        this.f16604 = fM11419;
        float fMin = Math.min(Math.abs(fM11419) / this.f16603, 1.0f);
        float fSignum = Math.signum(this.f16604);
        float f4 = this.f16603;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11372(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11371(float f) {
        if (f == 0.0f) {
            return;
        }
        float f2 = this.f16613;
        if (f2 == 0.0f) {
            return;
        }
        float f3 = this.f16605 + f;
        this.f16605 = f3;
        float fM11419 = AbstractC6087.m11419(f3, -f2, f2);
        this.f16605 = fM11419;
        float fMin = Math.min(Math.abs(fM11419) / this.f16613, 1.0f);
        float fSignum = Math.signum(this.f16605);
        float f4 = this.f16613;
        double dMax = Math.max(0.0f, Math.min(fMin, 1.0f));
        m11373(fSignum * ((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * ((double) f4))));
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1945(long j, int i, C0510 c0510) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        c0510.getClass();
        C0502 c0502 = (C0502) c0510.f1509;
        if (i != 1) {
            C7328 c7328 = new C7328(c0502.m1255(c0502.f1495, j, c0502.f1498));
            m11374();
            return c7328.f19546;
        }
        C6075 c6075 = this.f16610;
        if (c6075 != null) {
            c6075.invoke();
        }
        InterfaceC5451 interfaceC5451 = this.f16614;
        if (interfaceC5451 != null) {
            interfaceC5451.mo10252(null);
        }
        InterfaceC5451 interfaceC54512 = this.f16617;
        if (interfaceC54512 != null) {
            interfaceC54512.mo10252(null);
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        if (Math.abs(this.f16607) <= 1.0f || Float.intBitsToFloat(i2) == 0.0f || Math.signum(Float.intBitsToFloat(i2)) == Math.signum(this.f16604)) {
            fIntBitsToFloat = 0.0f;
        } else {
            float fIntBitsToFloat4 = Math.abs(this.f16604) <= Math.abs(Float.intBitsToFloat(i2)) ? -this.f16604 : Float.intBitsToFloat(i2);
            if (Math.abs(this.f16604) <= Math.abs(Float.intBitsToFloat(i2))) {
                m11372(0.0f);
                this.f16604 = 0.0f;
                float f = fIntBitsToFloat4;
                fIntBitsToFloat3 = Float.intBitsToFloat(i2) - fIntBitsToFloat4;
                fIntBitsToFloat = f;
            } else {
                m11370(fIntBitsToFloat4);
                fIntBitsToFloat = Float.intBitsToFloat(i2);
                fIntBitsToFloat3 = 0.0f;
            }
        }
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        if (Math.abs(this.f16608) <= 1.0f || Float.intBitsToFloat(i3) == 0.0f || Math.signum(Float.intBitsToFloat(i3)) == Math.signum(this.f16605)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            float fIntBitsToFloat6 = Math.abs(this.f16605) <= Math.abs(Float.intBitsToFloat(i3)) ? -this.f16605 : Float.intBitsToFloat(i3);
            if (Math.abs(this.f16605) <= Math.abs(Float.intBitsToFloat(i3))) {
                m11373(0.0f);
                this.f16605 = 0.0f;
                float f2 = fIntBitsToFloat6;
                fIntBitsToFloat5 = Float.intBitsToFloat(i3) - fIntBitsToFloat6;
                fIntBitsToFloat2 = f2;
            } else {
                m11371(fIntBitsToFloat6);
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                fIntBitsToFloat5 = 0.0f;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        long j2 = new C7328(c0502.m1255(c0502.f1495, jFloatToRawIntBits, c0502.f1498)).f19546;
        long jM12499 = C7328.m12499(jFloatToRawIntBits, j2);
        int i4 = (int) (jM12499 & 4294967295L);
        if (Float.intBitsToFloat(i4) != 0.0f) {
            m11370(Float.intBitsToFloat(i4));
        }
        int i5 = (int) (jM12499 >> 32);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            m11371(Float.intBitsToFloat(i5));
        }
        m11374();
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat + (Float.intBitsToFloat(i4) != 0.0f ? Float.intBitsToFloat(i4) : 0.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 >> 32)) + fIntBitsToFloat2) + (Float.intBitsToFloat(i5) == 0.0f ? 0.0f : Float.intBitsToFloat(i5)))) << 32);
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1946() {
        return Math.abs(this.f16608) > 1.0f || Math.abs(this.f16607) > 1.0f;
    }

    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC1787 mo1947() {
        return this.f16611;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.compose.foundation.InterfaceC1084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1948(long r14, p052.InterfaceC6553 r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6072.mo1948(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11372(float f) {
        if (this.f16607 == f) {
            return;
        }
        this.f16607 = f;
        C6075 c6075 = this.f16606;
        if (c6075 != null) {
            c6075.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11373(float f) {
        if (this.f16608 == f) {
            return;
        }
        this.f16608 = f;
        C6075 c6075 = this.f16606;
        if (c6075 != null) {
            c6075.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11374() {
        C6068 c6068;
        boolean zMo1946;
        C6075 c6075 = this.f16609;
        if (c6075 == null || (c6068 = (C6068) c6075.invoke()) == null || c6068.m11369() == (zMo1946 = mo1946())) {
            return;
        }
        c6068.m11368(zMo1946);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11375(float f) {
        if (Math.abs(this.f16608) <= 1.0f && f == 0.0f) {
            m11373(0.0f);
            this.f16605 = 0.0f;
            return;
        }
        InterfaceC5451 interfaceC5451 = this.f16617;
        if (interfaceC5451 != null) {
            interfaceC5451.mo10252(null);
        }
        C6071 c6071 = this.f16615;
        this.f16617 = c6071 != null ? (InterfaceC5451) c6071.invoke(new MiuixOverscrollEffect$startSpringAnimationX$1(this, f, null)) : null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11376(float f) {
        if (Math.abs(this.f16607) <= 1.0f && f == 0.0f) {
            m11372(0.0f);
            this.f16604 = 0.0f;
            return;
        }
        InterfaceC5451 interfaceC5451 = this.f16614;
        if (interfaceC5451 != null) {
            interfaceC5451.mo10252(null);
        }
        C6071 c6071 = this.f16615;
        this.f16614 = c6071 != null ? (InterfaceC5451) c6071.invoke(new MiuixOverscrollEffect$startSpringAnimationY$1(this, f, null)) : null;
    }
}
