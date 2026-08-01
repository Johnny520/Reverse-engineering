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
import p034.AbstractC6347;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f2518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0931 f2519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2022 f2520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2033 f2521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f2523;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2013 f2524;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2068 f2525;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0963 f2526;

    public C0888(C2013 c2013, InterfaceC2022 interfaceC2022, C0963 c0963, C0931 c0931) {
        C2068 c2068 = c2013.f5947;
        long j = c2013.f5946;
        C2033 c2033 = c0963 != null ? c0963.f2745 : null;
        this.f2523 = c2068;
        this.f2522 = j;
        this.f2521 = c2033;
        this.f2520 = interfaceC2022;
        this.f2519 = c0931;
        this.f2518 = j;
        this.f2525 = c2068;
        this.f2524 = c2013;
        this.f2526 = c0963;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1782() {
        C2033 c2033 = this.f2521;
        return (c2033 != null ? c2033.m3746(m1791()) : null) != ResolvedTextDirection.Rtl;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Integer m1783() {
        int i;
        C2033 c2033 = this.f2521;
        if (c2033 == null) {
            return null;
        }
        int iM1791 = m1791();
        while (true) {
            if (iM1791 <= 0) {
                i = 0;
                break;
            }
            int length = this.f2525.f6129.length() - 1;
            if (iM1791 <= length) {
                length = iM1791;
            }
            long jM3749 = c2033.m3749(length);
            int i2 = C2035.f6002;
            int i3 = (int) (jM3749 >> 32);
            if (i3 < iM1791) {
                this.f2520.mo1883(i3);
                i = i3;
                break;
            }
            iM1791--;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer m1784() {
        int length;
        C2033 c2033 = this.f2521;
        if (c2033 == null) {
            return null;
        }
        int iM1791 = m1791();
        while (true) {
            C2068 c2068 = this.f2523;
            if (iM1791 < c2068.f6129.length()) {
                int length2 = this.f2525.f6129.length() - 1;
                if (iM1791 <= length2) {
                    length2 = iM1791;
                }
                long jM3749 = c2033.m3749(length2);
                int i = C2035.f6002;
                int i2 = (int) (jM3749 & 4294967295L);
                if (i2 > iM1791) {
                    this.f2520.mo1883(i2);
                    length = i2;
                    break;
                }
                iM1791++;
            } else {
                length = c2068.f6129.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Integer m1785() {
        C2033 c2033 = this.f2521;
        if (c2033 == null) {
            return null;
        }
        int iM3757 = C2035.m3757(this.f2518);
        InterfaceC2022 interfaceC2022 = this.f2520;
        interfaceC2022.mo1882(iM3757);
        int iM3747 = c2033.m3747(c2033.f5990.m3788(iM3757));
        interfaceC2022.mo1883(iM3747);
        return Integer.valueOf(iM3747);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer m1786() {
        C2033 c2033 = this.f2521;
        if (c2033 == null) {
            return null;
        }
        C2062 c2062 = c2033.f5990;
        int iM3750 = C2035.m3750(this.f2518);
        InterfaceC2022 interfaceC2022 = this.f2520;
        interfaceC2022.mo1882(iM3750);
        int iM3789 = c2062.m3789(c2062.m3788(iM3750), true);
        interfaceC2022.mo1883(iM3789);
        return Integer.valueOf(iM3789);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m1787(InterfaceC6558 interfaceC6558) {
        if (!C2035.m3752(this.f2518)) {
            return AbstractC6347.m11931(new C2010("", 0), new C2016(C2035.m3757(this.f2518), C2035.m3757(this.f2518)));
        }
        InterfaceC2005 interfaceC2005 = (InterfaceC2005) interfaceC6558.invoke(this);
        if (interfaceC2005 != null) {
            return AbstractC6347.m11928(interfaceC2005);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m1788() {
        Integer numM1786;
        this.f2519.f2641 = null;
        if (this.f2525.f6129.length() <= 0 || (numM1786 = m1786()) == null) {
            return;
        }
        int iIntValue = numM1786.intValue();
        m1790(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m1789() {
        C0931 c0931 = this.f2519;
        c0931.f2641 = null;
        C2068 c2068 = this.f2525;
        if (c2068.f6129.length() > 0) {
            if (!m1782()) {
                m1796();
                return;
            }
            c0931.f2641 = null;
            if (c2068.f6129.length() > 0) {
                String str = c2068.f6129;
                long j = this.f2518;
                int i = C2035.f6002;
                int iM1901 = AbstractC0983.m1901((int) (j & 4294967295L), str);
                if (iM1901 != -1) {
                    m1790(iM1901, iM1901);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m1790(int i, int i2) {
        this.f2518 = AbstractC2048.m3770(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m1791() {
        long j = this.f2518;
        int i = C2035.f6002;
        int i2 = (int) (j & 4294967295L);
        this.f2520.mo1882(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m1792() {
        Integer numM1785;
        this.f2519.f2641 = null;
        if (this.f2525.f6129.length() <= 0 || (numM1785 = m1785()) == null) {
            return;
        }
        int iIntValue = numM1785.intValue();
        m1790(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m1793() {
        if (this.f2525.f6129.length() > 0) {
            int i = C2035.f6002;
            this.f2518 = AbstractC2048.m3770((int) (this.f2522 >> 32), (int) (this.f2518 & 4294967295L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1794(androidx.compose.foundation.text.C0963 r9, int r10) {
        /*
            r8 = this;
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r0 = r9.f2744
            androidx.compose.ui.text.飘花落叶言子世哲楪兰苏 r1 = r9.f2745
            if (r0 == 0) goto L13
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r9 = r9.f2743
            if (r9 == 0) goto L10
            r2 = 1
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r9 = r9.mo3089(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r9 = p112.C7328.f19536
        L15:
            androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏 r0 = r8.f2524
            long r2 = r0.f5946
            int r0 = androidx.compose.ui.text.C2035.f6002
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            androidx.compose.ui.text.input.飘花落叶言子楪哲苏兰世 r8 = r8.f2520
            r8.mo1882(r0)
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r0 = r1.m3743(r0)
            float r2 = r0.f19540
            float r0 = r0.f19539
            long r6 = r9.m12519()
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
            androidx.compose.ui.text.飘花落叶言子楪哲世苏兰 r0 = r1.f5990
            int r9 = r0.m3794(r9)
            r8.mo1883(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0888.m1794(androidx.compose.foundation.text.飘花落叶言子哲楪世苏兰, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m1795(C2033 c2033, int i) {
        int iM1791 = m1791();
        C0931 c0931 = this.f2519;
        if (c0931.f2641 == null) {
            c0931.f2641 = Float.valueOf(c2033.m3743(iM1791).f19540);
        }
        C2062 c2062 = c2033.f5990;
        int iM3788 = c2062.m3788(iM1791) + i;
        if (iM3788 < 0) {
            return 0;
        }
        if (iM3788 >= c2062.f6100) {
            return this.f2525.f6129.length();
        }
        float fM3790 = c2062.m3790(iM3788) - 1.0f;
        Float f = c0931.f2641;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((m1782() && fFloatValue >= c2033.m3740(iM3788)) || (!m1782() && fFloatValue <= c2033.m3741(iM3788))) {
            return c2062.m3789(iM3788, true);
        }
        int iM3794 = c2062.m3794((((long) Float.floatToRawIntBits(fM3790)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32));
        this.f2520.mo1883(iM3794);
        return iM3794;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1796() {
        this.f2519.f2641 = null;
        C2068 c2068 = this.f2525;
        if (c2068.f6129.length() > 0) {
            String str = c2068.f6129;
            long j = this.f2518;
            int i = C2035.f6002;
            int iM1903 = AbstractC0983.m1903((int) (j & 4294967295L), str);
            if (iM1903 != -1) {
                m1790(iM1903, iM1903);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1797() {
        this.f2519.f2641 = null;
        C2068 c2068 = this.f2525;
        String str = c2068.f6129;
        String str2 = c2068.f6129;
        if (str.length() > 0) {
            int iM1906 = AbstractC0983.m1906(C2035.m3757(this.f2518), str2);
            if (iM1906 == C2035.m3757(this.f2518) && iM1906 != 0) {
                iM1906 = AbstractC0983.m1906(iM1906 - 1, str2);
            }
            m1790(iM1906, iM1906);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1798() {
        C0931 c0931 = this.f2519;
        c0931.f2641 = null;
        C2068 c2068 = this.f2525;
        if (c2068.f6129.length() > 0) {
            if (m1782()) {
                m1796();
                return;
            }
            c0931.f2641 = null;
            if (c2068.f6129.length() > 0) {
                String str = c2068.f6129;
                long j = this.f2518;
                int i = C2035.f6002;
                int iM1901 = AbstractC0983.m1901((int) (j & 4294967295L), str);
                if (iM1901 != -1) {
                    m1790(iM1901, iM1901);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1799() {
        this.f2519.f2641 = null;
        C2068 c2068 = this.f2525;
        String str = c2068.f6129;
        String str2 = c2068.f6129;
        if (str.length() > 0) {
            int iM1905 = AbstractC0983.m1905(C2035.m3750(this.f2518), str2);
            if (iM1905 == C2035.m3750(this.f2518) && iM1905 != str2.length()) {
                iM1905 = AbstractC0983.m1905(iM1905 + 1, str2);
            }
            m1790(iM1905, iM1905);
        }
    }
}
