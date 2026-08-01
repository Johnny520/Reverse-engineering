package androidx.compose.foundation.text;

import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.text.C2867;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1801 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2530 f3088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2530 f3089 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2867 f3090;

    public C1801(C2867 c2867, InterfaceC2530 interfaceC2530) {
        this.f3090 = c2867;
        this.f3088 = interfaceC2530;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m2435(long j) {
        InterfaceC2530 interfaceC2530;
        InterfaceC2530 interfaceC25302 = this.f3089;
        if (interfaceC25302 != null) {
            if (!interfaceC25302.mo3646()) {
                interfaceC25302 = null;
            }
            if (interfaceC25302 != null && (interfaceC2530 = this.f3088) != null) {
                InterfaceC2530 interfaceC25303 = interfaceC2530.mo3646() ? interfaceC2530 : null;
                if (interfaceC25303 != null) {
                    return interfaceC25303.mo3641(interfaceC25302, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m2436(long j) {
        InterfaceC2530 interfaceC2530;
        InterfaceC2530 interfaceC25302 = this.f3089;
        if (interfaceC25302 != null) {
            if (!interfaceC25302.mo3646()) {
                interfaceC25302 = null;
            }
            if (interfaceC25302 != null && (interfaceC2530 = this.f3088) != null) {
                InterfaceC2530 interfaceC25303 = interfaceC2530.mo3646() ? interfaceC2530 : null;
                if (interfaceC25303 != null) {
                    return interfaceC25302.mo3641(interfaceC25303, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2437(long j) {
        long jM2436 = m2436(m2439(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM2436));
        C2867 c2867 = this.f3090;
        int iM4347 = c2867.f6335.m4347(fIntBitsToFloat);
        int i = (int) (jM2436 >> 32);
        return Float.intBitsToFloat(i) >= c2867.m4301(iM4347) && Float.intBitsToFloat(i) <= c2867.m4300(iM4347);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m2438(long j, boolean z) {
        if (z) {
            j = m2439(j);
        }
        return this.f3090.f6335.m4354(m2436(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m2439(long j) {
        C8157 c8157Mo3649;
        InterfaceC2530 interfaceC2530 = this.f3089;
        C8157 c8157 = C8157.f19881;
        if (interfaceC2530 != null) {
            if (interfaceC2530.mo3646()) {
                InterfaceC2530 interfaceC25302 = this.f3088;
                c8157Mo3649 = interfaceC25302 != null ? interfaceC25302.mo3649(interfaceC2530, true) : null;
            } else {
                c8157Mo3649 = c8157;
            }
            if (c8157Mo3649 != null) {
                c8157 = c8157Mo3649;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = c8157.f19885;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = c8157.f19883;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = c8157.f19884;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = c8157.f19882;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }
}
