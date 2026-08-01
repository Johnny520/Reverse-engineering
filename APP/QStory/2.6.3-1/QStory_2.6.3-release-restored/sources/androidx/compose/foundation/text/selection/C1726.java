package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1801;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2850;
import androidx.compose.p001ui.text.input.InterfaceC2839;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import java.util.List;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f2863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1769 f2864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2856 f2865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2867 f2866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f2868;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2847 f2869;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2902 f2870;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1801 f2871;

    public C1726(C2847 c2847, InterfaceC2856 interfaceC2856, C1801 c1801, C1769 c1769) {
        C2902 c2902 = c2847.f6292;
        long j = c2847.f6291;
        C2867 c2867 = c1801 != null ? c1801.f3090 : null;
        this.f2868 = c2902;
        this.f2867 = j;
        this.f2866 = c2867;
        this.f2865 = interfaceC2856;
        this.f2864 = c1769;
        this.f2863 = j;
        this.f2870 = c2902;
        this.f2869 = c2847;
        this.f2871 = c1801;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m2342() {
        C2867 c2867 = this.f2866;
        return (c2867 != null ? c2867.m4306(m2351()) : null) != ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Integer m2343() {
        int i;
        C2867 c2867 = this.f2866;
        if (c2867 == null) {
            return null;
        }
        int iM2351 = m2351();
        while (true) {
            if (iM2351 <= 0) {
                i = 0;
                break;
            }
            int length = this.f2870.f6474.length() - 1;
            if (iM2351 <= length) {
                length = iM2351;
            }
            long jM4309 = c2867.m4309(length);
            int i2 = C2869.f6347;
            int i3 = (int) (jM4309 >> 32);
            if (i3 < iM2351) {
                this.f2865.mo2443(i3);
                i = i3;
                break;
            }
            iM2351--;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer m2344() {
        int length;
        C2867 c2867 = this.f2866;
        if (c2867 == null) {
            return null;
        }
        int iM2351 = m2351();
        while (true) {
            C2902 c2902 = this.f2868;
            if (iM2351 < c2902.f6474.length()) {
                int length2 = this.f2870.f6474.length() - 1;
                if (iM2351 <= length2) {
                    length2 = iM2351;
                }
                long jM4309 = c2867.m4309(length2);
                int i = C2869.f6347;
                int i2 = (int) (jM4309 & 4294967295L);
                if (i2 > iM2351) {
                    this.f2865.mo2443(i2);
                    length = i2;
                    break;
                }
                iM2351++;
            } else {
                length = c2902.f6474.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Integer m2345() {
        C2867 c2867 = this.f2866;
        if (c2867 == null) {
            return null;
        }
        int iM4317 = C2869.m4317(this.f2863);
        InterfaceC2856 interfaceC2856 = this.f2865;
        interfaceC2856.mo2442(iM4317);
        int iM4307 = c2867.m4307(c2867.f6335.m4348(iM4317));
        interfaceC2856.mo2443(iM4307);
        return Integer.valueOf(iM4307);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer m2346() {
        C2867 c2867 = this.f2866;
        if (c2867 == null) {
            return null;
        }
        C2896 c2896 = c2867.f6335;
        int iM4310 = C2869.m4310(this.f2863);
        InterfaceC2856 interfaceC2856 = this.f2865;
        interfaceC2856.mo2442(iM4310);
        int iM4349 = c2896.m4349(c2896.m4348(iM4310), true);
        interfaceC2856.mo2443(iM4349);
        return Integer.valueOf(iM4349);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m2347(InterfaceC7387 interfaceC7387) {
        if (!C2869.m4312(this.f2863)) {
            return AbstractC7176.m12490(new C2844("", 0), new C2850(C2869.m4317(this.f2863), C2869.m4317(this.f2863)));
        }
        InterfaceC2839 interfaceC2839 = (InterfaceC2839) interfaceC7387.invoke(this);
        if (interfaceC2839 != null) {
            return AbstractC7176.m12487(interfaceC2839);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2348() {
        Integer numM2346;
        this.f2864.f2986 = null;
        if (this.f2870.f6474.length() <= 0 || (numM2346 = m2346()) == null) {
            return;
        }
        int iIntValue = numM2346.intValue();
        m2350(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2349() {
        C1769 c1769 = this.f2864;
        c1769.f2986 = null;
        C2902 c2902 = this.f2870;
        if (c2902.f6474.length() > 0) {
            if (!m2342()) {
                m2356();
                return;
            }
            c1769.f2986 = null;
            if (c2902.f6474.length() > 0) {
                String str = c2902.f6474;
                long j = this.f2863;
                int i = C2869.f6347;
                int iM2461 = AbstractC1821.m2461((int) (j & 4294967295L), str);
                if (iM2461 != -1) {
                    m2350(iM2461, iM2461);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2350(int i, int i2) {
        this.f2863 = AbstractC2882.m4330(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m2351() {
        long j = this.f2863;
        int i = C2869.f6347;
        int i2 = (int) (j & 4294967295L);
        this.f2865.mo2442(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2352() {
        Integer numM2345;
        this.f2864.f2986 = null;
        if (this.f2870.f6474.length() <= 0 || (numM2345 = m2345()) == null) {
            return;
        }
        int iIntValue = numM2345.intValue();
        m2350(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m2353() {
        if (this.f2870.f6474.length() > 0) {
            int i = C2869.f6347;
            this.f2863 = AbstractC2882.m4330((int) (this.f2867 >> 32), (int) (this.f2863 & 4294967295L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2354(C1801 c1801, int i) {
        C8157 c8157Mo3649;
        InterfaceC2530 interfaceC2530 = c1801.f3089;
        C2867 c2867 = c1801.f3090;
        if (interfaceC2530 == null) {
            c8157Mo3649 = C8157.f19881;
        } else {
            InterfaceC2530 interfaceC25302 = c1801.f3088;
            c8157Mo3649 = interfaceC25302 != null ? interfaceC25302.mo3649(interfaceC2530, true) : null;
            if (c8157Mo3649 == null) {
            }
        }
        long j = this.f2869.f6291;
        int i2 = C2869.f6347;
        int i3 = (int) (j & 4294967295L);
        InterfaceC2856 interfaceC2856 = this.f2865;
        interfaceC2856.mo2442(i3);
        C8157 c8157M4303 = c2867.m4303(i3);
        float f = c8157M4303.f19885;
        int iM4354 = c2867.f6335.m4354((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c8157Mo3649.m13078() & 4294967295L)) * i) + c8157M4303.f19884)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        interfaceC2856.mo2443(iM4354);
        return iM4354;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2355(C2867 c2867, int i) {
        int iM2351 = m2351();
        C1769 c1769 = this.f2864;
        if (c1769.f2986 == null) {
            c1769.f2986 = Float.valueOf(c2867.m4303(iM2351).f19885);
        }
        C2896 c2896 = c2867.f6335;
        int iM4348 = c2896.m4348(iM2351) + i;
        if (iM4348 < 0) {
            return 0;
        }
        if (iM4348 >= c2896.f6445) {
            return this.f2870.f6474.length();
        }
        float fM4350 = c2896.m4350(iM4348) - 1.0f;
        Float f = c1769.f2986;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((m2342() && fFloatValue >= c2867.m4300(iM4348)) || (!m2342() && fFloatValue <= c2867.m4301(iM4348))) {
            return c2896.m4349(iM4348, true);
        }
        int iM4354 = c2896.m4354((((long) Float.floatToRawIntBits(fM4350)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32));
        this.f2865.mo2443(iM4354);
        return iM4354;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2356() {
        this.f2864.f2986 = null;
        C2902 c2902 = this.f2870;
        if (c2902.f6474.length() > 0) {
            String str = c2902.f6474;
            long j = this.f2863;
            int i = C2869.f6347;
            int iM2463 = AbstractC1821.m2463((int) (j & 4294967295L), str);
            if (iM2463 != -1) {
                m2350(iM2463, iM2463);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2357() {
        this.f2864.f2986 = null;
        C2902 c2902 = this.f2870;
        String str = c2902.f6474;
        String str2 = c2902.f6474;
        if (str.length() > 0) {
            int iM2466 = AbstractC1821.m2466(C2869.m4317(this.f2863), str2);
            if (iM2466 == C2869.m4317(this.f2863) && iM2466 != 0) {
                iM2466 = AbstractC1821.m2466(iM2466 - 1, str2);
            }
            m2350(iM2466, iM2466);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2358() {
        C1769 c1769 = this.f2864;
        c1769.f2986 = null;
        C2902 c2902 = this.f2870;
        if (c2902.f6474.length() > 0) {
            if (m2342()) {
                m2356();
                return;
            }
            c1769.f2986 = null;
            if (c2902.f6474.length() > 0) {
                String str = c2902.f6474;
                long j = this.f2863;
                int i = C2869.f6347;
                int iM2461 = AbstractC1821.m2461((int) (j & 4294967295L), str);
                if (iM2461 != -1) {
                    m2350(iM2461, iM2461);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2359() {
        this.f2864.f2986 = null;
        C2902 c2902 = this.f2870;
        String str = c2902.f6474;
        String str2 = c2902.f6474;
        if (str.length() > 0) {
            int iM2465 = AbstractC1821.m2465(C2869.m4310(this.f2863), str2);
            if (iM2465 == C2869.m4310(this.f2863) && iM2465 != str2.length()) {
                iM2465 = AbstractC1821.m2465(iM2465 + 1, str2);
            }
            m2350(iM2465, iM2465);
        }
    }
}
