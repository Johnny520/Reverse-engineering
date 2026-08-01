package p314vb;

import java.io.IOException;
import okhttp3.internal.http2.Http2Connection;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p314vb.InterfaceC8914u;

/* JADX INFO: renamed from: vb.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8913t {

    /* JADX INFO: renamed from: a */
    public static final int[] f29511a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: b */
    public static final int[] f29512b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c */
    public static final int[] f29513c = {3, 6};

    /* JADX INFO: renamed from: d */
    public static final int[] f29514d = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: a */
    public static boolean m34186a(char c10) {
        return c10 == ':';
    }

    /* JADX INFO: renamed from: b */
    public static boolean m34187b(char c10) {
        return c10 == '-';
    }

    /* JADX INFO: renamed from: c */
    public static boolean m34188c(char c10) {
        return c10 == 'T' || c10 == 't';
    }

    /* JADX INFO: renamed from: d */
    public static boolean m34189d(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    /* JADX INFO: renamed from: e */
    public static boolean m34190e(char c10) {
        return c10 == '-';
    }

    /* JADX INFO: renamed from: f */
    public static boolean m34191f(char c10) {
        return c10 == ':';
    }

    /* JADX INFO: renamed from: j */
    public static final String m34195j(C8904k c8904k) throws IOException {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        C8894a0 c8894a0M34086a = C8894a0.f29476h.m34086a(c8904k);
        int iM34085g = c8894a0M34086a.m34085g();
        int i10 = 0;
        if (Math.abs(iM34085g) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (iM34085g >= 0) {
                sb3.append(iM34085g + 10000);
                sb3.deleteCharAt(0).getClass();
            } else {
                sb3.append(iM34085g - 10000);
                sb3.deleteCharAt(1).getClass();
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (iM34085g >= 10000) {
                sb2.append('+');
            }
            sb2.append(iM34085g);
        }
        sb2.append('-');
        m34196k(sb2, sb2, c8894a0M34086a.m34082d());
        sb2.append('-');
        m34196k(sb2, sb2, c8894a0M34086a.m34079a());
        sb2.append('T');
        m34196k(sb2, sb2, c8894a0M34086a.m34080b());
        sb2.append(':');
        m34196k(sb2, sb2, c8894a0M34086a.m34081c());
        sb2.append(':');
        m34196k(sb2, sb2, c8894a0M34086a.m34084f());
        if (c8894a0M34086a.m34083e() != 0) {
            sb2.append('.');
            while (true) {
                int iM34083e = c8894a0M34086a.m34083e();
                iArr = f29511a;
                int i11 = i10 + 1;
                if (iM34083e % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String strValueOf = String.valueOf((c8894a0M34086a.m34083e() / iArr[i12]) + iArr[9 - i12]);
            strValueOf.getClass();
            sb2.append(strValueOf.substring(1));
        }
        sb2.append('Z');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static final void m34196k(Appendable appendable, StringBuilder sb2, int i10) throws IOException {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb2.append(i10);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m34197l(int i10) {
        if ((i10 & 3) == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final int m34198m(int i10, boolean z10) {
        return i10 != 2 ? (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31 : z10 ? 29 : 28;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC8914u m34199n(CharSequence charSequence) {
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new InterfaceC8914u.a("An empty string is not a valid Instant", charSequence);
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i10 = 1;
        } else {
            i10 = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i14 = i10;
        while (i14 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i14)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i14) - '0');
            i14++;
        }
        int i15 = i14 - i10;
        if (i15 > 10) {
            return m34201p(charSequence, "Expected at most 10 digits for the year number, got " + i15 + " digits");
        }
        if (i15 == 10 && AbstractC1061t.m3843d(charSequence.charAt(i10), 50) >= 0) {
            return m34201p(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i15 + " digits");
        }
        if (i15 < 4) {
            return m34201p(charSequence, "The year number must be padded to 4 digits, got " + i15 + " digits");
        }
        if (cCharAt3 == '+' && i15 == 4) {
            return m34201p(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i15 != 4) {
            return m34201p(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i16 = iCharAt;
        int i17 = i14 + 16;
        if (charSequence.length() < i17) {
            return m34201p(charSequence, "The input string is too short");
        }
        InterfaceC8914u.a aVarM34200o = m34200o(charSequence, "'-'", i14, new InterfaceC0184l() { // from class: vb.n
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC8913t.m34187b(((Character) obj).charValue()));
            }
        });
        if (aVarM34200o != null) {
            return aVarM34200o;
        }
        InterfaceC8914u.a aVarM34200o2 = m34200o(charSequence, "'-'", i14 + 3, new InterfaceC0184l() { // from class: vb.o
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC8913t.m34190e(((Character) obj).charValue()));
            }
        });
        if (aVarM34200o2 != null) {
            return aVarM34200o2;
        }
        InterfaceC8914u.a aVarM34200o3 = m34200o(charSequence, "'T' or 't'", i14 + 6, new InterfaceC0184l() { // from class: vb.p
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC8913t.m34188c(((Character) obj).charValue()));
            }
        });
        if (aVarM34200o3 != null) {
            return aVarM34200o3;
        }
        InterfaceC8914u.a aVarM34200o4 = m34200o(charSequence, "':'", i14 + 9, new InterfaceC0184l() { // from class: vb.q
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC8913t.m34186a(((Character) obj).charValue()));
            }
        });
        if (aVarM34200o4 != null) {
            return aVarM34200o4;
        }
        InterfaceC8914u.a aVarM34200o5 = m34200o(charSequence, "':'", i14 + 12, new InterfaceC0184l() { // from class: vb.r
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC8913t.m34191f(((Character) obj).charValue()));
            }
        });
        if (aVarM34200o5 != null) {
            return aVarM34200o5;
        }
        for (int i18 : f29512b) {
            InterfaceC8914u.a aVarM34200o6 = m34200o(charSequence, "an ASCII digit", i18 + i14, new InterfaceC0184l() { // from class: vb.s
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Boolean.valueOf(AbstractC8913t.m34189d(((Character) obj).charValue()));
                }
            });
            if (aVarM34200o6 != null) {
                return aVarM34200o6;
            }
        }
        int iM34202q = m34202q(charSequence, i14 + 1);
        int iM34202q2 = m34202q(charSequence, i14 + 4);
        int iM34202q3 = m34202q(charSequence, i14 + 7);
        int iM34202q4 = m34202q(charSequence, i14 + 10);
        int iM34202q5 = m34202q(charSequence, i14 + 13);
        int i19 = i14 + 15;
        if (charSequence.charAt(i19) == '.') {
            i19 = i17;
            int iCharAt2 = 0;
            while (i19 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i19)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i19) - '0');
                i19++;
            }
            int i20 = i19 - i17;
            if (1 > i20 || i20 >= 10) {
                return m34201p(charSequence, "1..9 digits are supported for the fraction of the second, got " + i20 + " digits");
            }
            i11 = iCharAt2 * f29511a[9 - i20];
        } else {
            i11 = 0;
        }
        if (i19 >= charSequence.length()) {
            return m34201p(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i19);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i19;
            if (length > 9) {
                return m34201p(charSequence, "The UTC offset string \"" + m34203r(charSequence.subSequence(i19, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return m34201p(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i19, charSequence.length()).toString() + '\"');
            }
            for (int i21 : f29513c) {
                int i22 = i19 + i21;
                if (i22 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i22) != ':') {
                    return m34201p(charSequence, "Expected ':' at index " + i22 + ", got '" + charSequence.charAt(i22) + '\'');
                }
            }
            int[] iArr = f29514d;
            int length2 = iArr.length;
            int i23 = 0;
            while (i23 < length2) {
                int i24 = iArr[i23] + i19;
                if (i24 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i24);
                int[] iArr2 = iArr;
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    return m34201p(charSequence, "Expected an ASCII digit at index " + i24 + ", got '" + charSequence.charAt(i24) + '\'');
                }
                i23++;
                iArr = iArr2;
            }
            int iM34202q6 = m34202q(charSequence, i19 + 1);
            i12 = 3;
            int iM34202q7 = length > 3 ? m34202q(charSequence, i19 + 4) : 0;
            int iM34202q8 = length > 6 ? m34202q(charSequence, i19 + 7) : 0;
            if (iM34202q7 > 59) {
                return m34201p(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iM34202q7);
            }
            if (iM34202q8 > 59) {
                return m34201p(charSequence, "Expected offset-second-of-minute in 0..59, got " + iM34202q8);
            }
            if (iM34202q6 > 17 && (iM34202q6 != 18 || iM34202q7 != 0 || iM34202q8 != 0)) {
                return m34201p(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i19, charSequence.length()).toString());
            }
            i13 = (cCharAt4 == '-' ? -1 : 1) * ((iM34202q6 * 3600) + (iM34202q7 * 60) + iM34202q8);
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return m34201p(charSequence, "Expected the UTC offset at position " + i19 + ", got '" + cCharAt4 + '\'');
            }
            int i25 = i19 + 1;
            if (charSequence.length() != i25) {
                return m34201p(charSequence, "Extra text after the instant at position " + i25);
            }
            i13 = 0;
            i12 = 3;
        }
        if (1 > iM34202q || iM34202q >= 13) {
            return m34201p(charSequence, "Expected a month number in 1..12, got " + iM34202q);
        }
        if (1 > iM34202q2 || iM34202q2 > m34198m(iM34202q, m34197l(i16))) {
            return m34201p(charSequence, "Expected a valid day-of-month for month " + iM34202q + " of year " + i16 + ", got " + iM34202q2);
        }
        if (iM34202q3 > 23) {
            return m34201p(charSequence, "Expected hour in 0..23, got " + iM34202q3);
        }
        if (iM34202q4 > 59) {
            return m34201p(charSequence, "Expected minute-of-hour in 0..59, got " + iM34202q4);
        }
        if (iM34202q5 > 59) {
            return m34201p(charSequence, "Expected second-of-minute in 0..59, got " + iM34202q5);
        }
        C8894a0 c8894a0 = new C8894a0(i16, iM34202q, iM34202q2, iM34202q3, iM34202q4, iM34202q5, i11);
        long jM34085g = c8894a0.m34085g();
        long j10 = ((long) 365) * jM34085g;
        long jM34082d = (jM34085g >= 0 ? j10 + (((((long) i12) + jM34085g) / ((long) 4)) - ((((long) 99) + jM34085g) / ((long) 100))) + ((jM34085g + ((long) 399)) / ((long) 400)) : j10 - (((jM34085g / ((long) (-4))) - (jM34085g / ((long) (-100)))) + (jM34085g / ((long) (-400))))) + ((long) (((c8894a0.m34082d() * 367) - 362) / 12)) + ((long) (c8894a0.m34079a() - 1));
        if (c8894a0.m34082d() > 2) {
            jM34082d = !m34197l(c8894a0.m34085g()) ? jM34082d - 2 : (-1) + jM34082d;
        }
        return new InterfaceC8914u.b((((jM34082d - ((long) 719528)) * ((long) 86400)) + ((long) (((c8894a0.m34080b() * 3600) + (c8894a0.m34081c() * 60)) + c8894a0.m34084f()))) - ((long) i13), c8894a0.m34083e());
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC8914u.a m34200o(CharSequence charSequence, String str, int i10, InterfaceC0184l interfaceC0184l) {
        char cCharAt = charSequence.charAt(i10);
        if (((Boolean) interfaceC0184l.mo27m(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m34201p(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i10);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC8914u.a m34201p(CharSequence charSequence, String str) {
        return new InterfaceC8914u.a(str + " when parsing an Instant from \"" + m34203r(charSequence, 64) + '\"', charSequence);
    }

    /* JADX INFO: renamed from: q */
    public static final int m34202q(CharSequence charSequence, int i10) {
        return ((charSequence.charAt(i10) - '0') * 10) + (charSequence.charAt(i10 + 1) - '0');
    }

    /* JADX INFO: renamed from: r */
    public static final String m34203r(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + "...";
    }
}
