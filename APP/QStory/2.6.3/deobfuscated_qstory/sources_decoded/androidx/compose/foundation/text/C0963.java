package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.text.C2033;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1695 f2743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1695 f2744 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2033 f2745;

    public C0963(C2033 c2033, InterfaceC1695 interfaceC1695) {
        this.f2745 = c2033;
        this.f2743 = interfaceC1695;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m1875(long j) {
        InterfaceC1695 interfaceC1695;
        InterfaceC1695 interfaceC16952 = this.f2744;
        if (interfaceC16952 != null) {
            if (!interfaceC16952.mo3086()) {
                interfaceC16952 = null;
            }
            if (interfaceC16952 != null && (interfaceC1695 = this.f2743) != null) {
                InterfaceC1695 interfaceC16953 = interfaceC1695.mo3086() ? interfaceC1695 : null;
                if (interfaceC16953 != null) {
                    return interfaceC16953.mo3081(interfaceC16952, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m1876(long j) {
        InterfaceC1695 interfaceC1695;
        InterfaceC1695 interfaceC16952 = this.f2744;
        if (interfaceC16952 != null) {
            if (!interfaceC16952.mo3086()) {
                interfaceC16952 = null;
            }
            if (interfaceC16952 != null && (interfaceC1695 = this.f2743) != null) {
                InterfaceC1695 interfaceC16953 = interfaceC1695.mo3086() ? interfaceC1695 : null;
                if (interfaceC16953 != null) {
                    return interfaceC16952.mo3081(interfaceC16953, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m1877(long j) {
        long jM1876 = m1876(m1879(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM1876));
        C2033 c2033 = this.f2745;
        int iM3787 = c2033.f5990.m3787(fIntBitsToFloat);
        int i = (int) (jM1876 >> 32);
        return Float.intBitsToFloat(i) >= c2033.m3741(iM3787) && Float.intBitsToFloat(i) <= c2033.m3740(iM3787);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m1878(long j, boolean z) {
        if (z) {
            j = m1879(j);
        }
        return this.f2745.f5990.m3794(m1876(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1879(long j) {
        C7328 c7328Mo3089;
        InterfaceC1695 interfaceC1695 = this.f2744;
        C7328 c7328 = C7328.f19536;
        if (interfaceC1695 != null) {
            if (interfaceC1695.mo3086()) {
                InterfaceC1695 interfaceC16952 = this.f2743;
                c7328Mo3089 = interfaceC16952 != null ? interfaceC16952.mo3089(interfaceC1695, true) : null;
            } else {
                c7328Mo3089 = c7328;
            }
            if (c7328Mo3089 != null) {
                c7328 = c7328Mo3089;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = c7328.f19540;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = c7328.f19538;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = c7328.f19539;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = c7328.f19537;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }
}
