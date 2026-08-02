package p000;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class qb2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8873a;

    /* JADX INFO: renamed from: b */
    public int f8874b;

    /* JADX INFO: renamed from: c */
    public Object f8875c;

    /* JADX INFO: renamed from: d */
    public Object f8876d;

    /* JADX INFO: renamed from: e */
    public Serializable f8877e;

    /* JADX INFO: renamed from: f */
    public final Object f8878f;

    /* JADX INFO: renamed from: g */
    public final Object f8879g;

    public qb2(StringWriter stringWriter, int i, int i2, String str) {
        this.f8873a = 2;
        if (stringWriter == null) {
            um2.m5516f("out == null");
            throw null;
        }
        if (i < 1) {
            C0676s.m4651j("leftWidth < 1");
            throw null;
        }
        if (i2 < 1) {
            C0676s.m4651j("rightWidth < 1");
            throw null;
        }
        StringWriter stringWriter2 = new StringWriter(1000);
        StringWriter stringWriter3 = new StringWriter(1000);
        this.f8875c = stringWriter;
        this.f8874b = i;
        this.f8876d = stringWriter2.getBuffer();
        this.f8877e = stringWriter3.getBuffer();
        this.f8878f = new hy0(stringWriter2, i, "");
        this.f8879g = new hy0(stringWriter3, i2, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m4113b(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4114m(qb2 qb2Var, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = qb2Var.f8874b;
        }
        qb2Var.m4125l(i, str, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public int m4115a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f8878f).append((char) (m4126n(charSequence, i + 3) + (m4126n(charSequence, i) << 12) + (m4126n(charSequence, i + 1) << 8) + (m4126n(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f8874b = i;
        if (i2 < charSequence.length()) {
            return m4115a(charSequence, this.f8874b);
        }
        m4114m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4116c() {
        int i = this.f8874b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f8879g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8874b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f8874b = i;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m4117d(String str, int i) {
        String str2 = (String) this.f8879g;
        if (str2.length() - i < str.length()) {
            m4114m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m4114m(this, "Expected valid boolean literal prefix, but had '" + m4124k() + '\'', 0, 6);
                throw null;
            }
        }
        this.f8874b = str.length() + i;
    }

    /* JADX INFO: renamed from: e */
    public String m4118e() {
        String string;
        StringBuilder sb = (StringBuilder) this.f8878f;
        String str = (String) this.f8879g;
        m4121h('\"');
        int i = this.f8874b;
        int iM4003p0 = pv2.m4003p0(str, '\"', i, 4);
        if (iM4003p0 == -1) {
            m4124k();
            int i2 = this.f8874b;
            m4114m(this, vi0.m5691j("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM4003p0) {
            if (str.charAt(i3) == '\\') {
                int iM4129q = this.f8874b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM4129q, i3);
                        int iM4129q2 = m4129q(i3 + 1);
                        if (iM4129q2 == -1) {
                            m4114m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM4115a = iM4129q2 + 1;
                        char cCharAt2 = str.charAt(iM4129q2);
                        if (cCharAt2 == 'u') {
                            iM4115a = m4115a(str, iM4115a);
                        } else {
                            char c = cCharAt2 < 'u' ? C0743tq.f10896a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m4114m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM4129q = m4129q(iM4115a);
                        if (iM4129q == -1) {
                            m4114m(this, "Unexpected EOF", iM4129q, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM4129q, i3);
                            iM4129q = m4129q(i3);
                            if (iM4129q == -1) {
                                m4114m(this, "Unexpected EOF", iM4129q, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i3);
                        }
                    }
                    i3 = iM4129q;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM4129q, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM4129q, i3).toString();
                }
                this.f8874b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f8874b = iM4003p0 + 1;
        return str.substring(i, iM4003p0);
    }

    /* JADX INFO: renamed from: f */
    public byte m4119f() {
        String str = (String) this.f8879g;
        int i = this.f8874b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8874b = i2;
                return AbstractC0179eu.m1420A(cCharAt);
            }
            i = i2;
        }
        this.f8874b = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: g */
    public byte m4120g(byte b) {
        String str = (String) this.f8879g;
        byte bM4119f = m4119f();
        if (bM4119f == b) {
            return bM4119f;
        }
        String strM1453d0 = AbstractC0179eu.m1453d0(b);
        int i = this.f8874b;
        int i2 = i > 0 ? i - 1 : i;
        m4114m(this, vi0.m5692k("Expected ", strM1453d0, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void m4121h(char c) {
        int i = this.f8874b;
        if (i == -1) {
            m4132t(c);
            throw null;
        }
        String str = (String) this.f8879g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8874b = i2;
                if (cCharAt == c) {
                    return;
                }
                m4132t(c);
                throw null;
            }
            i = i2;
        }
        this.f8874b = -1;
        m4132t(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        return r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        if (r14 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0197, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x019f, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a0, code lost:
    
        m4114m(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a6, code lost:
    
        m4114m(r24, "Expected numeric literal", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0101, code lost:
    
        m4114m(r24, "Unexpected symbol '" + r6 + "' in numeric literal", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        if (r1 == r12) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011e, code lost:
    
        if (r14 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0122, code lost:
    
        if (r1 == (r12 - 1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        if (r22 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0126, code lost:
    
        if (r3 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        if (r2.charAt(r12) != '\"') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0130, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        m4114m(r24, "Expected closing quotation mark", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
    
        m4114m(r24, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
    
        r24.f8874b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
    
        if (r13 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0146, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
    
        if (r11 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0153, code lost:
    
        if (r11 != true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0155, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0165, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0171, code lost:
    
        m4114m(r24, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018a, code lost:
    
        m4114m(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        p000.c80.m675s();
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m4122i() {
        boolean z;
        boolean z2;
        int iM4129q = m4129q(m4130r());
        String str = (String) this.f8879g;
        if (iM4129q < str.length() && iM4129q != -1) {
            if (str.charAt(iM4129q) == '\"') {
                iM4129q++;
                if (iM4129q == str.length()) {
                    m4114m(this, "EOF", 0, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i = iM4129q;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            while (true) {
                long j4 = j2;
                if (i == str.length()) {
                    z2 = z;
                    break;
                }
                char cCharAt = str.charAt(i);
                if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                    z2 = z;
                    if (cCharAt == '-' && z4) {
                        if (i == iM4129q) {
                            m4114m(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        j2 = j4;
                        z = z2;
                        z3 = false;
                    } else if (cCharAt != '+' || !z4) {
                        if (cCharAt != '-') {
                            if (AbstractC0179eu.m1420A(cCharAt) != 0) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = cCharAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                break;
                            }
                            if (z4) {
                                j = (j * 10) + ((long) i3);
                            } else {
                                j3 = (j3 * 10) - ((long) i3);
                                if (j3 > j4) {
                                    m4114m(this, "Numeric value overflow", 0, 6);
                                    throw null;
                                }
                            }
                            j2 = j4;
                            z = z2;
                            i = i2;
                        } else {
                            if (i != iM4129q) {
                                m4114m(this, "Unexpected symbol '-' in numeric literal", i, 4);
                                throw null;
                            }
                            i++;
                            j2 = j4;
                            z = z2;
                            z5 = true;
                        }
                    } else {
                        if (i == iM4129q) {
                            m4114m(this, "Unexpected symbol '+' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        j2 = j4;
                        z = z2;
                        z3 = true;
                    }
                } else {
                    if (i == iM4129q) {
                        m4114m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    j2 = j4;
                    z3 = true;
                    z4 = true;
                }
            }
        } else {
            m4114m(this, "EOF", 0, 6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m4123j() {
        String str = (String) this.f8877e;
        if (str == null) {
            return m4118e();
        }
        str.getClass();
        this.f8877e = null;
        return str;
    }

    /* JADX INFO: renamed from: k */
    public String m4124k() {
        String string;
        StringBuilder sb = (StringBuilder) this.f8878f;
        String str = (String) this.f8879g;
        String str2 = (String) this.f8877e;
        if (str2 != null) {
            str2.getClass();
            this.f8877e = null;
            return str2;
        }
        int iM4130r = m4130r();
        if (iM4130r >= str.length() || iM4130r == -1) {
            m4114m(this, "EOF", iM4130r, 4);
            throw null;
        }
        byte bM1420A = AbstractC0179eu.m1420A(str.charAt(iM4130r));
        if (bM1420A == 1) {
            return m4123j();
        }
        if (bM1420A != 0) {
            m4114m(this, "Expected beginning of the string, but got " + str.charAt(iM4130r), 0, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC0179eu.m1420A(str.charAt(iM4130r)) == 0) {
            iM4130r++;
            if (iM4130r >= str.length()) {
                sb.append((CharSequence) str, this.f8874b, iM4130r);
                int iM4129q = m4129q(iM4130r);
                if (iM4129q == -1) {
                    this.f8874b = iM4130r;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM4130r = iM4129q;
                z = true;
            }
        }
        int i = this.f8874b;
        if (z) {
            sb.append((CharSequence) str, i, iM4130r);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iM4130r).toString();
        }
        this.f8874b = iM4130r;
        return string;
    }

    /* JADX INFO: renamed from: l */
    public void m4125l(int i, String str, String str2) {
        String strM4089e = ((C0611q9) this.f8876d).m4089e();
        String str3 = (String) this.f8879g;
        str3.getClass();
        throw new h31(AbstractC0570p7.m3783s(i, str, strM4089e, str2, ((f31) this.f8875c).f2761h ? AbstractC0570p7.m3749E(str3, i).toString() : null));
    }

    /* JADX INFO: renamed from: n */
    public int m4126n(CharSequence charSequence, int i) {
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
        m4114m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public void m4127o() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.f8877e;
        StringBuffer stringBuffer2 = (StringBuffer) this.f8876d;
        Writer writer = (Writer) this.f8875c;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f8874b - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public byte m4128p() {
        String str = (String) this.f8879g;
        int i = this.f8874b;
        while (true) {
            int iM4129q = m4129q(i);
            if (iM4129q == -1) {
                this.f8874b = iM4129q;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM4129q);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f8874b = iM4129q;
                return AbstractC0179eu.m1420A(cCharAt);
            }
            i = iM4129q + 1;
        }
    }

    /* JADX INFO: renamed from: q */
    public int m4129q(int i) {
        if (i < ((String) this.f8879g).length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public int m4130r() {
        char cCharAt;
        int i = this.f8874b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f8879g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f8874b = i;
        return i;
    }

    /* JADX INFO: renamed from: s */
    public boolean m4131s() {
        int iM4130r = m4130r();
        String str = (String) this.f8879g;
        if (iM4130r >= str.length() || iM4130r == -1 || str.charAt(iM4130r) != ',') {
            return false;
        }
        this.f8874b++;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m4132t(char c) {
        String str = (String) this.f8879g;
        int i = this.f8874b;
        if (i > 0 && c == '\"') {
            try {
                this.f8874b = i - 1;
                String strM4124k = m4124k();
                this.f8874b = i;
                if (t11.m5086l(strM4124k, "null")) {
                    m4125l(this.f8874b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f8874b = i;
                throw th;
            }
        }
        String strM1453d0 = AbstractC0179eu.m1453d0(AbstractC0179eu.m1420A(c));
        int i2 = this.f8874b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m4114m(this, vi0.m5692k("Expected ", strM1453d0, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, 4);
        throw null;
    }

    public String toString() {
        switch (this.f8873a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f8879g);
                sb.append("', currentPosition=");
                return vi0.m5694m(sb, this.f8874b, ')');
            default:
                return super.toString();
        }
    }

    public qb2(String str, f31 f31Var) {
        this.f8873a = 1;
        str.getClass();
        this.f8875c = f31Var;
        this.f8876d = new C0611q9(f31Var);
        this.f8878f = new StringBuilder();
        this.f8879g = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public qb2() {
        this.f8873a = 0;
        this.f8875c = new gu0[32];
        this.f8876d = new float[32];
        this.f8877e = new byte[32];
        sk1 sk1Var = fd2.f2911a;
        this.f8878f = new sk1();
        this.f8879g = new sk1();
    }
}
