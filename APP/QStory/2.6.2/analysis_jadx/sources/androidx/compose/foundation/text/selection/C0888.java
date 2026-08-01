package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0963;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2010;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2016;
import androidx.compose.ui.text.input.InterfaceC2005;
import androidx.compose.ui.text.input.InterfaceC2022;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import p052.InterfaceC6557;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f2517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0931 f2518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2022 f2519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2033 f2520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f2522;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2013 f2523;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2068 f2524;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0963 f2525;

    public C0888(C2013 c2013, InterfaceC2022 interfaceC2022, C0963 c0963, C0931 c0931) {
        C2068 c2068 = c2013.f5946;
        long j = c2013.f5945;
        C2033 c2033 = c0963 != null ? c0963.f2744 : null;
        this.f2522 = c2068;
        this.f2521 = j;
        this.f2520 = c2033;
        this.f2519 = interfaceC2022;
        this.f2518 = c0931;
        this.f2517 = j;
        this.f2524 = c2068;
        this.f2523 = c2013;
        this.f2525 = c0963;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1772() {
        C2033 c2033 = this.f2520;
        return (c2033 != null ? c2033.m3736(m1781()) : null) != ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Integer m1773() {
        int i;
        C2033 c2033 = this.f2520;
        if (c2033 == null) {
            return null;
        }
        int iM1781 = m1781();
        while (true) {
            if (iM1781 <= 0) {
                i = 0;
                break;
            }
            int length = this.f2524.f6128.length() - 1;
            if (iM1781 <= length) {
                length = iM1781;
            }
            long jM3739 = c2033.m3739(length);
            int i2 = C2035.f6001;
            int i3 = (int) (jM3739 >> 32);
            if (i3 < iM1781) {
                this.f2519.mo1873(i3);
                i = i3;
                break;
            }
            iM1781--;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer m1774() {
        int length;
        C2033 c2033 = this.f2520;
        if (c2033 == null) {
            return null;
        }
        int iM1781 = m1781();
        while (true) {
            C2068 c2068 = this.f2522;
            if (iM1781 < c2068.f6128.length()) {
                int length2 = this.f2524.f6128.length() - 1;
                if (iM1781 <= length2) {
                    length2 = iM1781;
                }
                long jM3739 = c2033.m3739(length2);
                int i = C2035.f6001;
                int i2 = (int) (jM3739 & 4294967295L);
                if (i2 > iM1781) {
                    this.f2519.mo1873(i2);
                    length = i2;
                    break;
                }
                iM1781++;
            } else {
                length = c2068.f6128.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Integer m1775() {
        C2033 c2033 = this.f2520;
        if (c2033 == null) {
            return null;
        }
        int iM3747 = C2035.m3747(this.f2517);
        InterfaceC2022 interfaceC2022 = this.f2519;
        interfaceC2022.mo1872(iM3747);
        int iM3737 = c2033.m3737(c2033.f5989.m3778(iM3747));
        interfaceC2022.mo1873(iM3737);
        return Integer.valueOf(iM3737);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer m1776() {
        C2033 c2033 = this.f2520;
        if (c2033 == null) {
            return null;
        }
        C2062 c2062 = c2033.f5989;
        int iM3740 = C2035.m3740(this.f2517);
        InterfaceC2022 interfaceC2022 = this.f2519;
        interfaceC2022.mo1872(iM3740);
        int iM3779 = c2062.m3779(c2062.m3778(iM3740), true);
        interfaceC2022.mo1873(iM3779);
        return Integer.valueOf(iM3779);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m1777(InterfaceC6557 interfaceC6557) {
        if (!C2035.m3742(this.f2517)) {
            return AbstractC8189.m13659(new C2010("", 0), new C2016(C2035.m3747(this.f2517), C2035.m3747(this.f2517)));
        }
        InterfaceC2005 interfaceC2005 = (InterfaceC2005) interfaceC6557.invoke(this);
        if (interfaceC2005 != null) {
            return AbstractC8189.m13660(interfaceC2005);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m1778() {
        Integer numM1776;
        this.f2518.f2640 = null;
        if (this.f2524.f6128.length() <= 0 || (numM1776 = m1776()) == null) {
            return;
        }
        int iIntValue = numM1776.intValue();
        m1780(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m1779() {
        C0931 c0931 = this.f2518;
        c0931.f2640 = null;
        C2068 c2068 = this.f2524;
        if (c2068.f6128.length() > 0) {
            if (!m1772()) {
                m1786();
                return;
            }
            c0931.f2640 = null;
            if (c2068.f6128.length() > 0) {
                String str = c2068.f6128;
                long j = this.f2517;
                int i = C2035.f6001;
                int iM1891 = AbstractC0983.m1891((int) (j & 4294967295L), str);
                if (iM1891 != -1) {
                    m1780(iM1891, iM1891);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m1780(int i, int i2) {
        this.f2517 = AbstractC2048.m3760(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m1781() {
        long j = this.f2517;
        int i = C2035.f6001;
        int i2 = (int) (j & 4294967295L);
        this.f2519.mo1872(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m1782() {
        Integer numM1775;
        this.f2518.f2640 = null;
        if (this.f2524.f6128.length() <= 0 || (numM1775 = m1775()) == null) {
            return;
        }
        int iIntValue = numM1775.intValue();
        m1780(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m1783() {
        if (this.f2524.f6128.length() > 0) {
            int i = C2035.f6001;
            this.f2517 = AbstractC2048.m3760((int) (this.f2521 >> 32), (int) (this.f2517 & 4294967295L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1784(androidx.compose.foundation.text.C0963 r9, int r10) {
        /*
            r8 = this;
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r0 = r9.f2743
            androidx.compose.ui.text.飘花落叶言子世哲楪兰苏 r1 = r9.f2744
            if (r0 == 0) goto L13
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r9 = r9.f2742
            if (r9 == 0) goto L10
            r2 = 1
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r9 = r9.mo3079(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r9 = p112.C7327.f19541
        L15:
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r0 = r8.f2523
            long r2 = r0.f5945
            int r0 = androidx.compose.ui.text.C2035.f6001
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            androidx.compose.ui.text.input.飘花落叶言子楪哲苏兰世 r8 = r8.f2519
            r8.mo1872(r0)
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r0 = r1.m3733(r0)
            float r2 = r0.f19545
            float r0 = r0.f19544
            long r6 = r9.m12492()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            androidx.compose.ui.text.飘花落叶言子楪哲世苏兰 r0 = r1.f5989
            int r9 = r0.m3784(r9)
            r8.mo1873(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0888.m1784(androidx.compose.foundation.text.飘花落叶言子哲楪世苏兰, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m1785(C2033 c2033, int i) {
        int iM1781 = m1781();
        C0931 c0931 = this.f2518;
        if (c0931.f2640 == null) {
            c0931.f2640 = Float.valueOf(c2033.m3733(iM1781).f19545);
        }
        C2062 c2062 = c2033.f5989;
        int iM3778 = c2062.m3778(iM1781) + i;
        if (iM3778 < 0) {
            return 0;
        }
        if (iM3778 >= c2062.f6099) {
            return this.f2524.f6128.length();
        }
        float fM3780 = c2062.m3780(iM3778) - 1.0f;
        Float f = c0931.f2640;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((m1772() && fFloatValue >= c2033.m3730(iM3778)) || (!m1772() && fFloatValue <= c2033.m3731(iM3778))) {
            return c2062.m3779(iM3778, true);
        }
        int iM3784 = c2062.m3784((((long) Float.floatToRawIntBits(fM3780)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32));
        this.f2519.mo1873(iM3784);
        return iM3784;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1786() {
        this.f2518.f2640 = null;
        C2068 c2068 = this.f2524;
        if (c2068.f6128.length() > 0) {
            String str = c2068.f6128;
            long j = this.f2517;
            int i = C2035.f6001;
            int iM1893 = AbstractC0983.m1893((int) (j & 4294967295L), str);
            if (iM1893 != -1) {
                m1780(iM1893, iM1893);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1787() {
        this.f2518.f2640 = null;
        C2068 c2068 = this.f2524;
        String str = c2068.f6128;
        String str2 = c2068.f6128;
        if (str.length() > 0) {
            int iM1896 = AbstractC0983.m1896(C2035.m3747(this.f2517), str2);
            if (iM1896 == C2035.m3747(this.f2517) && iM1896 != 0) {
                iM1896 = AbstractC0983.m1896(iM1896 - 1, str2);
            }
            m1780(iM1896, iM1896);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1788() {
        C0931 c0931 = this.f2518;
        c0931.f2640 = null;
        C2068 c2068 = this.f2524;
        if (c2068.f6128.length() > 0) {
            if (m1772()) {
                m1786();
                return;
            }
            c0931.f2640 = null;
            if (c2068.f6128.length() > 0) {
                String str = c2068.f6128;
                long j = this.f2517;
                int i = C2035.f6001;
                int iM1891 = AbstractC0983.m1891((int) (j & 4294967295L), str);
                if (iM1891 != -1) {
                    m1780(iM1891, iM1891);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1789() {
        this.f2518.f2640 = null;
        C2068 c2068 = this.f2524;
        String str = c2068.f6128;
        String str2 = c2068.f6128;
        if (str.length() > 0) {
            int iM1895 = AbstractC0983.m1895(C2035.m3740(this.f2517), str2);
            if (iM1895 == C2035.m3740(this.f2517) && iM1895 != str2.length()) {
                iM1895 = AbstractC0983.m1895(iM1895 + 1, str2);
            }
            m1780(iM1895, iM1895);
        }
    }
}
