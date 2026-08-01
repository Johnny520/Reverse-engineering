package p051J;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import p000A.C0036S0;
import p000A.C0049a;
import p000A.C0078o0;
import p029F0.InterfaceC0430v;
import p047I0.InterfaceC0697T0;
import p058L.C0920W;
import p092S0.AbstractC1251D;
import p092S0.C1255H;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p092S0.C1277o;
import p115X0.C1626a;
import p115X0.C1630e;
import p115X0.C1645t;
import p115X0.C1646u;
import p115X0.InterfaceC1632g;
import p149d3.AbstractC1976d;
import p169h0.InterfaceC2207p;
import p204n0.C2683b;
import p204n0.C2684c;

/* JADX INFO: renamed from: J.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825q {
    /* JADX INFO: renamed from: a */
    public static final int m1456a(C0078o0 c0078o0, long j5, InterfaceC0697T0 interfaceC0697T0) {
        long jMo631B;
        int iM1463h;
        C0036S0 c0036s0M123d = c0078o0.m123d();
        if (c0036s0M123d != null) {
            C1277o c1277o = c0036s0M123d.f161a.f4527b;
            InterfaceC0430v interfaceC0430vM122c = c0078o0.m122c();
            if (interfaceC0430vM122c != null && (iM1463h = m1463h(c1277o, (jMo631B = interfaceC0430vM122c.mo631B(j5)), interfaceC0697T0)) != -1) {
                return c1277o.m2366g(C2683b.m4643a(jMo631B, (c1277o.m2361b(iM1463h) + c1277o.m2365f(iM1463h)) / 2.0f, 1));
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final long m1457b(C0078o0 c0078o0, C2684c c2684c, C2684c c2684c2, int i5) {
        long jM1464i = m1464i(c0078o0, c2684c, i5);
        if (C1259L.m2335c(jM1464i)) {
            return C1259L.f4536b;
        }
        long jM1464i2 = m1464i(c0078o0, c2684c2, i5);
        if (C1259L.m2335c(jM1464i2)) {
            return C1259L.f4536b;
        }
        int i6 = (int) (jM1464i >> 32);
        int i7 = (int) (jM1464i2 & 4294967295L);
        return AbstractC1251D.m2313b(Math.min(i6, i6), Math.max(i7, i7));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1458c(C1257J c1257j, int i5) {
        C1277o c1277o = c1257j.f4527b;
        int iM2363d = c1277o.m2363d(i5);
        return i5 == c1257j.m2329f(iM2363d) || i5 == c1277o.m2362c(iM2363d, false) ? c1257j.m2330g(i5) != c1257j.m2324a(i5) : c1257j.m2324a(i5) != c1257j.m2324a(i5 - 1);
    }

    /* JADX INFO: renamed from: d */
    public static final ExtractedText m1459d(C1646u c1646u) {
        ExtractedText extractedText = new ExtractedText();
        String str = c1646u.f5650a.f4563e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j5 = c1646u.f5651b;
        extractedText.selectionStart = C1259L.m2338f(j5);
        extractedText.selectionEnd = C1259L.m2337e(j5);
        extractedText.flags = !AbstractC1976d.m3628V(c1646u.f5650a.f4563e, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: e */
    public static final long m1460e(PointF pointF) {
        float f2 = pointF.x;
        float f5 = pointF.y;
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1461f(C2684c c2684c, float f2, float f5) {
        float f6 = c2684c.f8558a;
        if (f2 > c2684c.f8560c || f6 > f2) {
            return false;
        }
        return f5 <= c2684c.f8561d && c2684c.f8559b <= f5;
    }

    /* JADX INFO: renamed from: g */
    public static int m1462g(HandwritingGesture handwritingGesture, C0049a c0049a) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0049a.mo1h(new C1626a(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: h */
    public static final int m1463h(C1277o c1277o, long j5, InterfaceC0697T0 interfaceC0697T0) {
        float fMo1205f = interfaceC0697T0 != null ? interfaceC0697T0.mo1205f() : 0.0f;
        int i5 = (int) (4294967295L & j5);
        int iM2364e = c1277o.m2364e(Float.intBitsToFloat(i5));
        if (Float.intBitsToFloat(i5) < c1277o.m2365f(iM2364e) - fMo1205f || Float.intBitsToFloat(i5) > c1277o.m2361b(iM2364e) + fMo1205f) {
            return -1;
        }
        int i6 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i6) < (-fMo1205f) || Float.intBitsToFloat(i6) > c1277o.f4588d + fMo1205f) {
            return -1;
        }
        return iM2364e;
    }

    /* JADX INFO: renamed from: i */
    public static final long m1464i(C0078o0 c0078o0, C2684c c2684c, int i5) {
        C0036S0 c0036s0M123d = c0078o0.m123d();
        C1277o c1277o = c0036s0M123d != null ? c0036s0M123d.f161a.f4527b : null;
        InterfaceC0430v interfaceC0430vM122c = c0078o0.m122c();
        return (c1277o == null || interfaceC0430vM122c == null) ? C1259L.f4536b : c1277o.m2367h(c2684c.m4658i(interfaceC0430vM122c.mo631B(0L)), i5, C1255H.f4515b);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m1465j(int i5) {
        int type = Character.getType(i5);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m1466k(int i5) {
        return Character.isWhitespace(i5) || i5 == 160;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m1467l(int i5) {
        int type;
        return (!m1466k(i5) || (type = Character.getType(i5)) == 14 || type == 13 || i5 == 10) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC2207p m1468m(InterfaceC2207p interfaceC2207p, C0811c c0811c, C0078o0 c0078o0, C0920W c0920w) {
        return interfaceC2207p.mo4021c(new C0823o(c0811c, c0078o0, c0920w));
    }

    /* JADX INFO: renamed from: n */
    public static void m1469n(long j5, C1269g c1269g, boolean z5, C0049a c0049a) {
        if (z5) {
            int i5 = C1259L.f4537c;
            int iCharCount = (int) (j5 >> 32);
            int iCharCount2 = (int) (j5 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c1269g, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c1269g.f4563e.length() ? Character.codePointAt(c1269g, iCharCount2) : 10;
            if (m1467l(iCodePointBefore) && (m1466k(iCodePointAt) || m1465j(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c1269g, iCharCount);
                    }
                } while (m1467l(iCodePointBefore));
                j5 = AbstractC1251D.m2313b(iCharCount, iCharCount2);
            } else if (m1467l(iCodePointAt) && (m1466k(iCodePointBefore) || m1465j(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c1269g.f4563e.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c1269g, iCharCount2);
                    }
                } while (m1467l(iCodePointAt));
                j5 = AbstractC1251D.m2313b(iCharCount, iCharCount2);
            }
        }
        int i6 = (int) (4294967295L & j5);
        c0049a.mo1h(new C0821m(new InterfaceC1632g[]{new C1645t(i6, i6), new C1630e(C1259L.m2336d(j5), 0)}));
    }
}
