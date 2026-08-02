package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class qb2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Serializable e;
    public final Object f;
    public final Object g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qb2(StringWriter stringWriter, int i, int i2, String str) {
        this.a = 2;
        if (stringWriter == null) {
            um2.f("out == null");
            throw null;
        }
        if (i < 1) {
            s.j("leftWidth < 1");
            throw null;
        }
        if (i2 < 1) {
            s.j("rightWidth < 1");
            throw null;
        }
        StringWriter stringWriter2 = new StringWriter(1000);
        StringWriter stringWriter3 = new StringWriter(1000);
        this.c = stringWriter;
        this.b = i;
        this.d = stringWriter2.getBuffer();
        this.e = stringWriter3.getBuffer();
        this.f = new hy0(stringWriter2, i, "");
        this.g = new hy0(stringWriter3, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void m(qb2 qb2Var, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = qb2Var.b;
        }
        qb2Var.l(i, str, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (n(charSequence, i + 3) + (n(charSequence, i) << 12) + (n(charSequence, i + 1) << 8) + (n(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.b);
        }
        m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(String str, int i) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String e() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        h('\"');
        int i = this.b;
        int iP0 = pv2.p0(str, '\"', i, 4);
        if (iP0 == -1) {
            k();
            int i2 = this.b;
            m(this, vi0.j("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iP0) {
            if (str.charAt(i3) == '\\') {
                int iQ = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iQ, i3);
                        int iQ2 = q(i3 + 1);
                        if (iQ2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iA = iQ2 + 1;
                        char cCharAt2 = str.charAt(iQ2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? tq.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iQ = q(iA);
                        if (iQ == -1) {
                            m(this, "Unexpected EOF", iQ, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iQ, i3);
                            iQ = q(i3);
                            if (iQ == -1) {
                                m(this, "Unexpected EOF", iQ, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i3);
                        }
                    }
                    i3 = iQ;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iQ, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iQ, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iP0 + 1;
        return str.substring(i, iP0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte f() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return eu.A(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte g(byte b) {
        String str = (String) this.g;
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        String strD0 = eu.d0(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        m(this, vi0.k("Expected ", strD0, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(char c) {
        int i = this.b;
        if (i == -1) {
            t(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                t(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        t(c);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    
        m(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a6, code lost:
    
        m(r24, "Expected numeric literal", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0101, code lost:
    
        m(r24, "Unexpected symbol '" + r6 + "' in numeric literal", r12, 4);
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
    
        m(r24, "Expected closing quotation mark", r12, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
    
        m(r24, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
    
        r24.b = r12;
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
    
        m(r24, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018a, code lost:
    
        m(r24, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        defpackage.c80.s();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() {
        boolean z;
        boolean z2;
        int iQ = q(r());
        String str = (String) this.g;
        if (iQ < str.length() && iQ != -1) {
            if (str.charAt(iQ) == '\"') {
                iQ++;
                if (iQ == str.length()) {
                    m(this, "EOF", 0, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i = iQ;
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
                        if (i == iQ) {
                            m(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        j2 = j4;
                        z = z2;
                        z3 = false;
                    } else if (cCharAt != '+' || !z4) {
                        if (cCharAt != '-') {
                            if (eu.A(cCharAt) != 0) {
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
                                    m(this, "Numeric value overflow", 0, 6);
                                    throw null;
                                }
                            }
                            j2 = j4;
                            z = z2;
                            i = i2;
                        } else {
                            if (i != iQ) {
                                m(this, "Unexpected symbol '-' in numeric literal", i, 4);
                                throw null;
                            }
                            i++;
                            j2 = j4;
                            z = z2;
                            z5 = true;
                        }
                    } else {
                        if (i == iQ) {
                            m(this, "Unexpected symbol '+' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        j2 = j4;
                        z = z2;
                        z3 = true;
                    }
                } else {
                    if (i == iQ) {
                        m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    j2 = j4;
                    z3 = true;
                    z4 = true;
                }
            }
        } else {
            m(this, "EOF", 0, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String j() {
        String str = (String) this.e;
        if (str == null) {
            return e();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String k() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iR = r();
        if (iR >= str.length() || iR == -1) {
            m(this, "EOF", iR, 4);
            throw null;
        }
        byte bA = eu.A(str.charAt(iR));
        if (bA == 1) {
            return j();
        }
        if (bA != 0) {
            m(this, "Expected beginning of the string, but got " + str.charAt(iR), 0, 6);
            throw null;
        }
        boolean z = false;
        while (eu.A(str.charAt(iR)) == 0) {
            iR++;
            if (iR >= str.length()) {
                sb.append((CharSequence) str, this.b, iR);
                int iQ = q(iR);
                if (iQ == -1) {
                    this.b = iR;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iR = iQ;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iR);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iR).toString();
        }
        this.b = iR;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(int i, String str, String str2) {
        String strE = ((q9) this.d).e();
        String str3 = (String) this.g;
        str3.getClass();
        throw new h31(p7.s(i, str, strE, str2, ((f31) this.c).h ? p7.E(str3, i).toString() : null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int n(CharSequence charSequence, int i) {
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
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.e;
        StringBuffer stringBuffer2 = (StringBuffer) this.d;
        Writer writer = (Writer) this.c;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.b - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte p() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int iQ = q(i);
            if (iQ == -1) {
                this.b = iQ;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iQ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iQ;
                return eu.A(cCharAt);
            }
            i = iQ + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int q(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int r() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean s() {
        int iR = r();
        String str = (String) this.g;
        if (iR >= str.length() || iR == -1 || str.charAt(iR) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strK = k();
                this.b = i;
                if (t11.l(strK, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strD0 = eu.d0(eu.A(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m(this, vi0.k("Expected ", strD0, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, 4);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return vi0.m(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public qb2(String str, f31 f31Var) {
        this.a = 1;
        str.getClass();
        this.c = f31Var;
        this.d = new q9(f31Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public qb2() {
        this.a = 0;
        this.c = new gu0[32];
        this.d = new float[32];
        this.e = new byte[32];
        sk1 sk1Var = fd2.a;
        this.f = new sk1();
        this.g = new sk1();
    }
}
