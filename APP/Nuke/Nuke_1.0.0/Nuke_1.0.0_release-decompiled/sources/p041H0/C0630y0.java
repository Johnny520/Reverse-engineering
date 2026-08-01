package p041H0;

import java.io.Serializable;
import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;
import p029F0.C0414n;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;
import p186k.AbstractC2416M;
import p186k.C2409F;
import p211o0.C2748g;
import p237s4.AbstractC3202a;
import p242t3.C3216e;
import p242t3.C3217f;
import p248u3.AbstractC3341e;
import p248u3.C3339c;

/* JADX INFO: renamed from: H0.y0 */
/* JADX INFO: loaded from: classes.dex */
public class C0630y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1998a;

    /* JADX INFO: renamed from: b */
    public int f1999b;

    /* JADX INFO: renamed from: c */
    public Object f2000c;

    /* JADX INFO: renamed from: d */
    public Object f2001d;

    /* JADX INFO: renamed from: e */
    public Serializable f2002e;

    /* JADX INFO: renamed from: f */
    public final Object f2003f;

    /* JADX INFO: renamed from: g */
    public final Object f2004g;

    public C0630y0(String str, C3216e c3216e) {
        this.f1998a = 1;
        AbstractC1665j.m2985e(str, "source");
        this.f2000c = c3216e;
        this.f2001d = new C2748g(c3216e);
        this.f2003f = new StringBuilder();
        this.f2004g = str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m1064l(C0630y0 c0630y0, String str, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i5 = c0630y0.f1999b;
        }
        c0630y0.m1075k(i5, str, (i6 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public int m1065a(CharSequence charSequence, int i5) {
        int i6 = i5 + 4;
        if (i6 < charSequence.length()) {
            ((StringBuilder) this.f2003f).append((char) (m1076m(charSequence, i5 + 3) + (m1076m(charSequence, i5) << 12) + (m1076m(charSequence, i5 + 1) << 8) + (m1076m(charSequence, i5 + 2) << 4)));
            return i6;
        }
        this.f1999b = i5;
        if (i6 < charSequence.length()) {
            return m1065a(charSequence, this.f1999b);
        }
        m1064l(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1066b() {
        int i5 = this.f1999b;
        if (i5 == -1) {
            return false;
        }
        String str = (String) this.f2004g;
        while (i5 < str.length()) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1999b = i5;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i5++;
        }
        this.f1999b = i5;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m1067c(String str, int i5) {
        String str2 = (String) this.f2004g;
        if (str2.length() - i5 < str.length()) {
            m1064l(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) != (str2.charAt(i5 + i6) | ' ')) {
                m1064l(this, "Expected valid boolean literal prefix, but had '" + m1073i() + '\'', 0, 6);
                throw null;
            }
        }
        this.f1999b = str.length() + i5;
    }

    /* JADX INFO: renamed from: d */
    public String m1068d() {
        StringBuilder sb = (StringBuilder) this.f2003f;
        String str = (String) this.f2004g;
        m1070f('\"');
        int i5 = this.f1999b;
        int iM3634b0 = AbstractC1976d.m3634b0(str, '\"', i5, 4);
        if (iM3634b0 == -1) {
            m1073i();
            int i6 = this.f1999b;
            m1064l(this, AbstractC0231b.m400k("Expected quotation mark '\"', but had '", (i6 == str.length() || i6 < 0) ? "EOF" : String.valueOf(str.charAt(i6)), "' instead"), i6, 4);
            throw null;
        }
        int i7 = i5;
        while (i7 < iM3634b0) {
            if (str.charAt(i7) == '\\') {
                int iM1078o = this.f1999b;
                char cCharAt = str.charAt(i7);
                boolean z5 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM1078o, i7);
                        int iM1078o2 = m1078o(i7 + 1);
                        if (iM1078o2 == -1) {
                            m1064l(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM1065a = iM1078o2 + 1;
                        char cCharAt2 = str.charAt(iM1078o2);
                        if (cCharAt2 == 'u') {
                            iM1065a = m1065a(str, iM1065a);
                        } else {
                            char c5 = cCharAt2 < 'u' ? C3339c.f10384a[cCharAt2] : (char) 0;
                            if (c5 == 0) {
                                m1064l(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c5);
                        }
                        iM1078o = m1078o(iM1065a);
                        if (iM1078o == -1) {
                            m1064l(this, "Unexpected EOF", iM1078o, 4);
                            throw null;
                        }
                    } else {
                        i7++;
                        if (i7 >= str.length()) {
                            sb.append((CharSequence) str, iM1078o, i7);
                            iM1078o = m1078o(i7);
                            if (iM1078o == -1) {
                                m1064l(this, "Unexpected EOF", iM1078o, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i7);
                        }
                    }
                    i7 = iM1078o;
                    z5 = true;
                    cCharAt = str.charAt(i7);
                }
                String string = !z5 ? str.subSequence(iM1078o, i7).toString() : m1074j(iM1078o, i7);
                this.f1999b = i7 + 1;
                return string;
            }
            i7++;
        }
        this.f1999b = iM3634b0 + 1;
        String strSubstring = str.substring(i5, iM3634b0);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public byte m1069e() {
        String str = (String) this.f2004g;
        int i5 = this.f1999b;
        while (i5 != -1 && i5 < str.length()) {
            int i6 = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1999b = i6;
                return AbstractC3341e.m5583b(cCharAt);
            }
            i5 = i6;
        }
        this.f1999b = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: f */
    public void m1070f(char c5) {
        int i5 = this.f1999b;
        if (i5 == -1) {
            m1081r(c5);
            throw null;
        }
        String str = (String) this.f2004g;
        while (i5 < str.length()) {
            int i6 = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1999b = i6;
                if (cCharAt == c5) {
                    return;
                }
                m1081r(c5);
                throw null;
            }
            i5 = i6;
        }
        this.f1999b = -1;
        m1081r(c5);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0196, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        if (r14 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0199, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019e, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a1, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a2, code lost:
    
        m1064l(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a8, code lost:
    
        m1064l(r24, "Expected numeric literal", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        m1064l(r24, "Unexpected symbol '" + r6 + "' in numeric literal", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0119, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r1 == r12) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        if (r14 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        if (r1 == (r12 - 1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
    
        if (r22 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0126, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:
    
        if (r2.charAt(r12) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0130, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0133, code lost:
    
        m1064l(r24, "Expected closing quotation mark", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013a, code lost:
    
        m1064l(r24, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0140, code lost:
    
        r24.f1999b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0144, code lost:
    
        if (r13 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0146, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0149, code lost:
    
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        if (r11 != true) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015a, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0165, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0171, code lost:
    
        m1064l(r24, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0189, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018a, code lost:
    
        m1064l(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0195, code lost:
    
        throw new p027E4.C0330q();
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m1071g() {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0630y0.m1071g():long");
    }

    /* JADX INFO: renamed from: h */
    public String m1072h() {
        String str = (String) this.f2002e;
        if (str == null) {
            return m1068d();
        }
        AbstractC1665j.m2982b(str);
        this.f2002e = null;
        return str;
    }

    /* JADX INFO: renamed from: i */
    public String m1073i() {
        String str = (String) this.f2004g;
        String str2 = (String) this.f2002e;
        if (str2 != null) {
            AbstractC1665j.m2982b(str2);
            this.f2002e = null;
            return str2;
        }
        int iM1079p = m1079p();
        if (iM1079p >= str.length() || iM1079p == -1) {
            m1064l(this, "EOF", iM1079p, 4);
            throw null;
        }
        byte bM5583b = AbstractC3341e.m5583b(str.charAt(iM1079p));
        if (bM5583b == 1) {
            return m1072h();
        }
        if (bM5583b != 0) {
            m1064l(this, "Expected beginning of the string, but got " + str.charAt(iM1079p), 0, 6);
            throw null;
        }
        boolean z5 = false;
        while (AbstractC3341e.m5583b(str.charAt(iM1079p)) == 0) {
            iM1079p++;
            if (iM1079p >= str.length()) {
                ((StringBuilder) this.f2003f).append((CharSequence) str, this.f1999b, iM1079p);
                int iM1078o = m1078o(iM1079p);
                if (iM1078o == -1) {
                    this.f1999b = iM1079p;
                    return m1074j(0, 0);
                }
                iM1079p = iM1078o;
                z5 = true;
            }
        }
        String string = !z5 ? str.subSequence(this.f1999b, iM1079p).toString() : m1074j(this.f1999b, iM1079p);
        this.f1999b = iM1079p;
        return string;
    }

    /* JADX INFO: renamed from: j */
    public String m1074j(int i5, int i6) {
        StringBuilder sb = (StringBuilder) this.f2003f;
        sb.append((CharSequence) this.f2004g, i5, i6);
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: k */
    public void m1075k(int i5, String str, String str2) {
        String string;
        AbstractC1665j.m2985e(str, "message");
        String strM4863a = ((C2748g) this.f2001d).m4863a();
        String string2 = (String) this.f2004g;
        AbstractC1665j.m2985e(strM4863a, "path");
        AbstractC1665j.m2985e(string2, "input");
        if (((C3216e) this.f2000c).f10006g) {
            AbstractC1665j.m2985e(string2, "<this>");
            if (string2.length() >= 200) {
                if (i5 == -1) {
                    int length = string2.length() - 60;
                    if (length > 0) {
                        string2 = "....." + string2.subSequence(length, string2.length()).toString();
                    }
                } else {
                    int i6 = i5 - 30;
                    int i7 = i5 + 30;
                    String str3 = i6 <= 0 ? "" : ".....";
                    String str4 = i7 >= string2.length() ? "" : ".....";
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    int length2 = string2.length();
                    if (i7 > length2) {
                        i7 = length2;
                    }
                    sb.append(string2.subSequence(i6, i7).toString());
                    sb.append(str4);
                    string2 = sb.toString();
                }
            }
            string = string2.toString();
        } else {
            string = null;
        }
        throw new C3217f(0, AbstractC3341e.m5584c(i5, str, strM4863a, str2, string), str);
    }

    /* JADX INFO: renamed from: m */
    public int m1076m(CharSequence charSequence, int i5) {
        char cCharAt = charSequence.charAt(i5);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m1064l(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public byte m1077n() {
        String str = (String) this.f2004g;
        int i5 = this.f1999b;
        while (true) {
            int iM1078o = m1078o(i5);
            if (iM1078o == -1) {
                this.f1999b = iM1078o;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM1078o);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1999b = iM1078o;
                return AbstractC3341e.m5583b(cCharAt);
            }
            i5 = iM1078o + 1;
        }
    }

    /* JADX INFO: renamed from: o */
    public int m1078o(int i5) {
        if (i5 < ((String) this.f2004g).length()) {
            return i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public int m1079p() {
        char cCharAt;
        int i5 = this.f1999b;
        if (i5 == -1) {
            return i5;
        }
        String str = (String) this.f2004g;
        while (i5 < str.length() && ((cCharAt = str.charAt(i5)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i5++;
        }
        this.f1999b = i5;
        return i5;
    }

    /* JADX INFO: renamed from: q */
    public boolean m1080q() {
        int iM1079p = m1079p();
        String str = (String) this.f2004g;
        if (iM1079p >= str.length() || iM1079p == -1 || str.charAt(iM1079p) != ',') {
            return false;
        }
        this.f1999b++;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m1081r(char c5) {
        String str = (String) this.f2004g;
        int i5 = this.f1999b;
        if (i5 > 0 && c5 == '\"') {
            try {
                this.f1999b = i5 - 1;
                String strM1073i = m1073i();
                this.f1999b = i5;
                if (AbstractC1665j.m2981a(strM1073i, "null")) {
                    m1075k(this.f1999b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1999b = i5;
                throw th;
            }
        }
        byte bM5583b = AbstractC3341e.m5583b(c5);
        String str2 = bM5583b == 1 ? "quotation mark '\"'" : bM5583b == 2 ? "string escape sequence '\\'" : bM5583b == 4 ? "comma ','" : bM5583b == 5 ? "colon ':'" : bM5583b == 6 ? "start of the object '{'" : bM5583b == 7 ? "end of the object '}'" : bM5583b == 8 ? "start of the array '['" : bM5583b == 9 ? "end of the array ']'" : bM5583b == 10 ? "end of the input" : bM5583b == 127 ? "invalid token" : "valid token";
        int i6 = this.f1999b;
        int i7 = i6 > 0 ? i6 - 1 : i6;
        m1064l(this, "Expected " + str2 + ", but had '" + ((i6 == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7))) + "' instead", i7, 4);
        throw null;
    }

    public String toString() {
        switch (this.f1998a) {
            case BuildConfig.VERSION_CODE /* 1 */:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f2004g);
                sb.append("', currentPosition=");
                return AbstractC3202a.m5466a(sb, this.f1999b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public C0630y0() {
        this.f1998a = 0;
        this.f2000c = new C0414n[32];
        this.f2001d = new float[32];
        this.f2002e = new byte[32];
        C2409F c2409f = AbstractC2416M.f7817a;
        this.f2003f = new C2409F();
        this.f2004g = new C2409F();
    }
}
