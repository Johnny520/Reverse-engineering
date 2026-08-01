package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.text.C2033;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1695 f2742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1695 f2743 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2033 f2744;

    public C0963(C2033 c2033, InterfaceC1695 interfaceC1695) {
        this.f2744 = c2033;
        this.f2742 = interfaceC1695;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m1865(long j) {
        InterfaceC1695 interfaceC1695;
        InterfaceC1695 interfaceC16952 = this.f2743;
        if (interfaceC16952 != null) {
            if (!interfaceC16952.mo3076()) {
                interfaceC16952 = null;
            }
            if (interfaceC16952 != null && (interfaceC1695 = this.f2742) != null) {
                InterfaceC1695 interfaceC16953 = interfaceC1695.mo3076() ? interfaceC1695 : null;
                if (interfaceC16953 != null) {
                    return interfaceC16953.mo3071(interfaceC16952, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m1866(long j) {
        InterfaceC1695 interfaceC1695;
        InterfaceC1695 interfaceC16952 = this.f2743;
        if (interfaceC16952 != null) {
            if (!interfaceC16952.mo3076()) {
                interfaceC16952 = null;
            }
            if (interfaceC16952 != null && (interfaceC1695 = this.f2742) != null) {
                InterfaceC1695 interfaceC16953 = interfaceC1695.mo3076() ? interfaceC1695 : null;
                if (interfaceC16953 != null) {
                    return interfaceC16952.mo3071(interfaceC16953, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m1867(long j) {
        long jM1866 = m1866(m1869(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM1866));
        C2033 c2033 = this.f2744;
        int iM3777 = c2033.f5989.m3777(fIntBitsToFloat);
        int i = (int) (jM1866 >> 32);
        return Float.intBitsToFloat(i) >= c2033.m3731(iM3777) && Float.intBitsToFloat(i) <= c2033.m3730(iM3777);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m1868(long j, boolean z) {
        if (z) {
            j = m1869(j);
        }
        return this.f2744.f5989.m3784(m1866(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1869(long j) {
        C7327 c7327Mo3079;
        InterfaceC1695 interfaceC1695 = this.f2743;
        C7327 c7327 = C7327.f19541;
        if (interfaceC1695 != null) {
            if (interfaceC1695.mo3076()) {
                InterfaceC1695 interfaceC16952 = this.f2742;
                c7327Mo3079 = interfaceC16952 != null ? interfaceC16952.mo3079(interfaceC1695, true) : null;
            } else {
                c7327Mo3079 = c7327;
            }
            if (c7327Mo3079 != null) {
                c7327 = c7327Mo3079;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = c7327.f19545;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = c7327.f19543;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = c7327.f19544;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = c7327.f19542;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }
}
