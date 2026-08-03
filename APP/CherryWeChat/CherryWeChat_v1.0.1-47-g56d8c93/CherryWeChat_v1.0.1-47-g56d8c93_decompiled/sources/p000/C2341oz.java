package p000;

/* JADX INFO: renamed from: oz */
/* JADX INFO: loaded from: classes.dex */
public class C2341oz {

    /* JADX INFO: renamed from: a */
    public int f8216a;

    /* JADX INFO: renamed from: b */
    public final C0477L3 f8217b;

    /* JADX INFO: renamed from: c */
    public String f8218c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f8219d;

    /* JADX INFO: renamed from: e */
    public final String f8220e;

    public C2341oz(String str) {
        C0477L3 c0477l3 = new C0477L3();
        c0477l3.f1575c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        c0477l3.f1576d = iArr;
        c0477l3.f1574b = -1;
        this.f8217b = c0477l3;
        this.f8219d = new StringBuilder();
        this.f8220e = str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4750m(C2341oz c2341oz, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = c2341oz.f8216a;
        }
        c2341oz.m4762l(i, str, (i2 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m4751a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f8219d.append((char) (m4764o(charSequence, i + 3) + (m4764o(charSequence, i) << 12) + (m4764o(charSequence, i + 1) << 8) + (m4764o(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f8216a = i;
        if (i2 < charSequence.length()) {
            return m4751a(charSequence, this.f8216a);
        }
        m4750m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4752b() {
        int i = this.f8216a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f8220e;
            if (i >= str.length()) {
                this.f8216a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8216a = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4753c(int i, String str) {
        String str2 = this.f8220e;
        if (str2.length() - i < str.length()) {
            m4750m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m4750m(this, "Expected valid boolean literal prefix, but had '" + m4760j() + '\'', 0, 6);
                throw null;
            }
        }
        this.f8216a = str.length() + i;
    }

    /* JADX INFO: renamed from: d */
    public final String m4754d() {
        String string;
        m4757g('\"');
        int i = this.f8216a;
        String str = this.f8220e;
        int iM5056Q = AbstractC2564tz.m5056Q(str, '\"', i, 4);
        if (iM5056Q == -1) {
            m4760j();
            m4763n((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iM5056Q) {
            if (str.charAt(i2) == '\\') {
                int iM4766q = this.f8216a;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (true) {
                    StringBuilder sb = this.f8219d;
                    if (cCharAt == '\"') {
                        if (z) {
                            sb.append((CharSequence) str, iM4766q, i2);
                            string = sb.toString();
                            sb.setLength(0);
                        } else {
                            string = str.subSequence(iM4766q, i2).toString();
                        }
                        this.f8216a = i2 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM4766q, i2);
                        int iM4766q2 = m4766q(i2 + 1);
                        if (iM4766q2 == -1) {
                            m4750m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM4751a = iM4766q2 + 1;
                        char cCharAt2 = str.charAt(iM4766q2);
                        if (cCharAt2 == 'u') {
                            iM4751a = m4751a(str, iM4751a);
                        } else {
                            char c = cCharAt2 < 'u' ? C2573u7.f8921a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m4750m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM4766q = m4766q(iM4751a);
                        if (iM4766q == -1) {
                            m4750m(this, "Unexpected EOF", iM4766q, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            sb.append((CharSequence) str, iM4766q, i2);
                            iM4766q = m4766q(i2);
                            if (iM4766q == -1) {
                                m4750m(this, "Unexpected EOF", iM4766q, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i2);
                        }
                    }
                    i2 = iM4766q;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
            } else {
                i2++;
            }
        }
        this.f8216a = iM5056Q + 1;
        return str.substring(i, iM5056Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f8216a = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte m4755e() {
        int i = this.f8216a;
        while (true) {
            String str = this.f8220e;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8216a = i2;
                return AbstractC0148Dc.m269c(cCharAt);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final byte m4756f(byte b) {
        byte bM4755e = m4755e();
        if (bM4755e == b) {
            return bM4755e;
        }
        m4763n(b, true);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public void m4757g(char c) {
        int i = this.f8216a;
        if (i == -1) {
            m4770u(c);
            throw null;
        }
        while (true) {
            String str = this.f8220e;
            if (i >= str.length()) {
                this.f8216a = -1;
                m4770u(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8216a = i2;
                if (cCharAt == c) {
                    return;
                }
                m4770u(c);
                throw null;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        throw new p000.C0232Fa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0184, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0185, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0187, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x018c, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018f, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0190, code lost:
    
        m4750m(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0196, code lost:
    
        m4750m(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
    
        m4750m(r22, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0104, code lost:
    
        if (r1 == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0106, code lost:
    
        if (r14 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        if (r1 == (r12 - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011b, code lost:
    
        if (r2.charAt(r12) != '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011d, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0120, code lost:
    
        m4750m(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0128, code lost:
    
        m4750m(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
    
        r22.f8216a = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0132, code lost:
    
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0134, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
    
        if (r11 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0141, code lost:
    
        if (r11 != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0143, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015b, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015d, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015f, code lost:
    
        m4750m(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0177, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
    
        m4750m(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m4758h() {
        boolean z;
        int iM4766q = m4766q(m4767r());
        String str = this.f8220e;
        int i = 6;
        int i2 = 0;
        if (iM4766q >= str.length() || iM4766q == -1) {
            m4750m(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM4766q) == '\"') {
            iM4766q++;
            if (iM4766q == str.length()) {
                m4750m(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i3 = iM4766q;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            long j4 = j2;
            if (i3 == str.length()) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z2) {
                if (i3 == iM4766q) {
                    m4750m(this, "Unexpected symbol " + cCharAt + " in numeric literal", i2, i);
                    throw null;
                }
                i3++;
                j2 = j4;
                i4 = 1;
                z2 = true;
            } else if (cCharAt == '-' && z2) {
                if (i3 == iM4766q) {
                    m4750m(this, "Unexpected symbol '-' in numeric literal", i2, 6);
                    throw null;
                }
                i3++;
                i4 = i2;
                j2 = j4;
                i = 6;
            } else if (cCharAt != '+' || !z2) {
                if (cCharAt != '-') {
                    if (AbstractC0148Dc.m269c(cCharAt) != 0) {
                        break;
                    }
                    i3++;
                    int i5 = cCharAt - '0';
                    if (i5 < 0 || i5 >= 10) {
                        break;
                    }
                    if (z2) {
                        j = (j * ((long) 10)) + ((long) i5);
                    } else {
                        j3 = (j3 * ((long) 10)) - ((long) i5);
                        if (j3 > j4) {
                            m4750m(this, "Numeric value overflow", 0, 6);
                            throw null;
                        }
                    }
                    j2 = j4;
                    i = 6;
                    i2 = 0;
                } else {
                    if (i3 != iM4766q) {
                        m4750m(this, "Unexpected symbol '-' in numeric literal", i2, 6);
                        throw null;
                    }
                    i3++;
                    j2 = j4;
                    i = 6;
                    z3 = true;
                }
            } else {
                if (i3 == iM4766q) {
                    m4750m(this, "Unexpected symbol '+' in numeric literal", i2, 6);
                    throw null;
                }
                i3++;
                j2 = j4;
                i = 6;
                i4 = 1;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m4759i() {
        String str = this.f8218c;
        if (str == null) {
            return m4754d();
        }
        this.f8218c = null;
        return str;
    }

    /* JADX INFO: renamed from: j */
    public final String m4760j() {
        String string;
        String str = this.f8218c;
        if (str != null) {
            this.f8218c = null;
            return str;
        }
        int iM4767r = m4767r();
        String str2 = this.f8220e;
        if (iM4767r >= str2.length() || iM4767r == -1) {
            m4750m(this, "EOF", iM4767r, 4);
            throw null;
        }
        byte bM269c = AbstractC0148Dc.m269c(str2.charAt(iM4767r));
        if (bM269c == 1) {
            return m4759i();
        }
        if (bM269c != 0) {
            m4750m(this, "Expected beginning of the string, but got " + str2.charAt(iM4767r), 0, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bM269c2 = AbstractC0148Dc.m269c(str2.charAt(iM4767r));
            StringBuilder sb = this.f8219d;
            if (bM269c2 != 0) {
                if (z) {
                    sb.append((CharSequence) str2, this.f8216a, iM4767r);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = str2.subSequence(this.f8216a, iM4767r).toString();
                }
                this.f8216a = iM4767r;
                return string;
            }
            iM4767r++;
            if (iM4767r >= str2.length()) {
                sb.append((CharSequence) str2, this.f8216a, iM4767r);
                int iM4766q = m4766q(iM4767r);
                if (iM4766q == -1) {
                    this.f8216a = iM4767r;
                    sb.append((CharSequence) str2, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM4767r = iM4766q;
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m4761k() {
        String strM4760j = m4760j();
        if (AbstractC0585Nj.m1134a(strM4760j, "null")) {
            if (this.f8220e.charAt(this.f8216a - 1) != '\"') {
                m4750m(this, "Unexpected 'null' value instead of string literal", 0, 6);
                throw null;
            }
        }
        return strM4760j;
    }

    /* JADX INFO: renamed from: l */
    public final void m4762l(int i, String str, String str2) {
        throw AbstractC1293cr.m2543b(i, this.f8220e, str + " at path: " + this.f8217b.m934c() + (str2.length() == 0 ? "" : "\n".concat(str2)));
    }

    /* JADX INFO: renamed from: n */
    public final void m4763n(byte b, boolean z) {
        String strM288v = AbstractC0148Dc.m288v(b);
        int i = z ? this.f8216a - 1 : this.f8216a;
        int i2 = this.f8216a;
        String str = this.f8220e;
        m4750m(this, "Expected " + strM288v + ", but had '" + ((i2 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i))) + "' instead", i, 4);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final int m4764o(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m4750m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public byte m4765p() {
        int i = this.f8216a;
        while (true) {
            int iM4766q = m4766q(i);
            if (iM4766q == -1) {
                this.f8216a = iM4766q;
                return (byte) 10;
            }
            char cCharAt = this.f8220e.charAt(iM4766q);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f8216a = iM4766q;
                return AbstractC0148Dc.m269c(cCharAt);
            }
            i = iM4766q + 1;
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m4766q(int i) {
        if (i < this.f8220e.length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public int m4767r() {
        char cCharAt;
        int i = this.f8216a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f8220e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f8216a = i;
        return i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4768s() {
        int iM4767r = m4767r();
        String str = this.f8220e;
        if (iM4767r >= str.length() || iM4767r == -1 || str.charAt(iM4767r) != ',') {
            return false;
        }
        this.f8216a++;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4769t(boolean z) {
        int iM4766q = m4766q(m4767r());
        String str = this.f8220e;
        int length = str.length() - iM4766q;
        if (length >= 4 && iM4766q != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(iM4766q + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || AbstractC0148Dc.m269c(str.charAt(iM4766q + 4)) != 0) {
                    if (z) {
                        this.f8216a = iM4766q + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) this.f8220e);
        sb.append("', currentPosition=");
        return AbstractC0213Ey.m408f(sb, this.f8216a, ')');
    }

    /* JADX INFO: renamed from: u */
    public final void m4770u(char c) {
        int i = this.f8216a;
        if (i > 0 && c == '\"') {
            try {
                this.f8216a = i - 1;
                String strM4760j = m4760j();
                this.f8216a = i;
                if (AbstractC0585Nj.m1134a(strM4760j, "null")) {
                    m4762l(this.f8216a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f8216a = i;
                throw th;
            }
        }
        m4763n(AbstractC0148Dc.m269c(c), true);
        throw null;
    }
}
