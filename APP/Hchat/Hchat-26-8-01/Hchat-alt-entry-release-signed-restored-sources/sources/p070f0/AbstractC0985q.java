package p070f0;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import p015b0.C0136d0;
import p057e1.C0807b;
import p057e1.C0808c;
import p100h0.C1511d1;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1931i0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p190n2.C2865a;
import p190n2.C2870e;
import p190n2.C2883r;
import p190n2.C2884s;
import p190n2.InterfaceC2872g;
import p218og.AbstractC3149m;
import p308v1.InterfaceC4428t;
import p321w.C4618m1;
import p321w.C4629q0;
import p356y0.InterfaceC5853o;
import p357y1.InterfaceC5905l2;

/* JADX INFO: renamed from: f0.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m2431a(C4629q0 c4629q0, long j3, InterfaceC5905l2 interfaceC5905l2) {
        long jMo8865j0;
        int iM2438h;
        C4618m1 c4618m1M9051d = c4629q0.m9051d();
        if (c4618m1M9051d != null) {
            C1942o c1942o = c4618m1M9051d.f15293a.f6562b;
            InterfaceC4428t interfaceC4428tM9050c = c4629q0.m9050c();
            if (interfaceC4428tM9050c != null && (iM2438h = m2438h(c1942o, (jMo8865j0 = interfaceC4428tM9050c.mo8865j0(j3)), interfaceC5905l2)) != -1) {
                return c1942o.m4830g(C0807b.m2038a(jMo8865j0, (c1942o.m4825b(iM2438h) + c1942o.m4829f(iM2438h)) / 2.0f, 1));
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m2432b(C4629q0 c4629q0, C0808c c0808c, C0808c c0808c2, int i9) {
        long jM2439i = m2439i(c4629q0, c0808c, i9);
        if (C1939m0.m4813c(jM2439i)) {
            return C1939m0.f6573b;
        }
        long jM2439i2 = m2439i(c4629q0, c0808c2, i9);
        if (C1939m0.m4813c(jM2439i2)) {
            return C1939m0.f6573b;
        }
        int i10 = (int) (jM2439i >> 32);
        int i11 = (int) (jM2439i2 & 4294967295L);
        return AbstractC1923e0.m4784b(Math.min(i10, i10), Math.max(i11, i11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m2433c(C1935k0 c1935k0, int i9) {
        C1942o c1942o = c1935k0.f6562b;
        int iM4827d = c1942o.m4827d(i9);
        return i9 == c1935k0.m4807g(iM4827d) || i9 == c1942o.m4826c(iM4827d, false) ? c1935k0.m4808h(i9) != c1935k0.m4801a(i9) : c1935k0.m4801a(i9) != c1935k0.m4801a(i9 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final ExtractedText m2434d(C2884s c2884s) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2884s.f9316a.f6529h;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = c2884s.f9317b;
        extractedText.selectionStart = C1939m0.m4816f(j3);
        extractedText.selectionEnd = C1939m0.m4815e(j3);
        extractedText.flags = !AbstractC3149m.m6710i0(c2884s.f9316a.f6529h, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final long m2435e(PointF pointF) {
        float f3 = pointF.x;
        float f10 = pointF.y;
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m2436f(C0808c c0808c, float f3, float f10) {
        float f11 = c0808c.f2416a;
        if (f3 > c0808c.f2418c || f11 > f3) {
            return false;
        }
        return f10 <= c0808c.f2419d && c0808c.f2417b <= f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m2437g(HandwritingGesture handwritingGesture, C0136d0 c0136d0) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0136d0.invoke(new C2865a(fallbackText, 1));
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final int m2438h(C1942o c1942o, long j3, InterfaceC5905l2 interfaceC5905l2) {
        float fMo10621g = interfaceC5905l2 != null ? interfaceC5905l2.mo10621g() : 0.0f;
        int i9 = (int) (4294967295L & j3);
        int iM4828e = c1942o.m4828e(Float.intBitsToFloat(i9));
        if (Float.intBitsToFloat(i9) < c1942o.m4829f(iM4828e) - fMo10621g || Float.intBitsToFloat(i9) > c1942o.m4825b(iM4828e) + fMo10621g) {
            return -1;
        }
        int i10 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i10) < (-fMo10621g) || Float.intBitsToFloat(i10) > c1942o.f6586d + fMo10621g) {
            return -1;
        }
        return iM4828e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final long m2439i(C4629q0 c4629q0, C0808c c0808c, int i9) {
        C4618m1 c4618m1M9051d = c4629q0.m9051d();
        C1942o c1942o = c4618m1M9051d != null ? c4618m1M9051d.f15293a.f6562b : null;
        InterfaceC4428t interfaceC4428tM9050c = c4629q0.m9050c();
        return (c1942o == null || interfaceC4428tM9050c == null) ? C1939m0.f6573b : c1942o.m4831h(c0808c.m2053i(interfaceC4428tM9050c.mo8865j0(0L)), i9, C1931i0.f6547b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m2440j(int i9) {
        int type = Character.getType(i9);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m2441k(int i9) {
        return Character.isWhitespace(i9) || i9 == 160;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m2442l(int i9) {
        int type;
        return (!m2441k(i9) || (type = Character.getType(i9)) == 14 || type == 13 || i9 == 10) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC5853o m2443m(InterfaceC5853o interfaceC5853o, C0971c c0971c, C4629q0 c4629q0, C1511d1 c1511d1) {
        return interfaceC5853o.mo10549d(new C0983o(c0971c, c4629q0, c1511d1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m2444n(long j3, C1926g c1926g, boolean z9, C0136d0 c0136d0) {
        if (z9) {
            int i9 = C1939m0.f6574c;
            int iCharCount = (int) (j3 >> 32);
            int iCharCount2 = (int) (j3 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c1926g, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c1926g.f6529h.length() ? Character.codePointAt(c1926g, iCharCount2) : 10;
            if (m2442l(iCodePointBefore) && (m2441k(iCodePointAt) || m2440j(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c1926g, iCharCount);
                    }
                } while (m2442l(iCodePointBefore));
                j3 = AbstractC1923e0.m4784b(iCharCount, iCharCount2);
            } else if (m2442l(iCodePointAt) && (m2441k(iCodePointBefore) || m2440j(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c1926g.f6529h.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c1926g, iCharCount2);
                    }
                } while (m2442l(iCodePointAt));
                j3 = AbstractC1923e0.m4784b(iCharCount, iCharCount2);
            }
        }
        int i10 = (int) (4294967295L & j3);
        c0136d0.invoke(new C0981m(new InterfaceC2872g[]{new C2883r(i10, i10), new C2870e(C1939m0.m4814d(j3), 0)}));
    }
}
