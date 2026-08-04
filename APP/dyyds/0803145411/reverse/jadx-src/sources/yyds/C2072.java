package yyds;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: yyds.ᲀᲀᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2072 {

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static final boolean[] f10227;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static final boolean[] f10228;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final boolean[] f10229;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final boolean[] f10230;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final boolean[] f10231;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final boolean f10232;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f10233;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final boolean f10234;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f10235;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f10236;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public char f10237;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final boolean f10238;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final boolean f10239;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final boolean f10240;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f10241 = 0;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public String f10242;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean f10243;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f10244;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int f10245;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final boolean f10246;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean f10247;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean f10248;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean f10249;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final boolean f10250;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public String f10251;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final boolean f10252;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public String f10253;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1760 f10254;

    static {
        boolean[] zArr = new boolean[126];
        f10228 = zArr;
        boolean[] zArr2 = new boolean[126];
        f10231 = zArr2;
        boolean[] zArr3 = new boolean[126];
        f10229 = zArr3;
        boolean[] zArr4 = new boolean[126];
        f10227 = zArr4;
        boolean[] zArr5 = new boolean[126];
        f10230 = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public C2072(int i) {
        C1760 c1760 = new C1760((char) 0, 4);
        c1760.f8839 = new char[15];
        c1760.f8838 = -1;
        this.f10254 = c1760;
        this.f10235 = (i & 4) > 0;
        this.f10249 = (i & 2) > 0;
        this.f10247 = (i & 1) > 0;
        this.f10239 = (i & 8) > 0;
        this.f10243 = (i & 16) > 0;
        this.f10233 = (i & 32) > 0;
        this.f10248 = (i & 64) > 0;
        this.f10252 = (i & 128) > 0;
        this.f10234 = (i & 768) != 768;
        this.f10232 = (i & 512) == 0;
        this.f10240 = (i & 1024) > 0;
        this.f10250 = (i & 2048) > 0;
        this.f10238 = (i & 4096) > 0;
        this.f10246 = (i & 8192) > 0;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m3963() throws C2240 {
        char c = this.f10237;
        while (true) {
            m3967();
            char c2 = this.f10237;
            C1760 c1760 = this.f10254;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    m3967();
                    this.f10253 = c1760.toString();
                    return;
                }
                c1760.m3499(c2);
            } else if (c2 != '\\') {
                boolean z = this.f10239;
                if (c2 != 127) {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            if (!z) {
                                throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
                            }
                            continue;
                            break;
                        case 26:
                            if (!this.f10246) {
                                throw new C2240(this.f10244 - 1, 3, null);
                            }
                            this.f10253 = c1760.toString();
                            return;
                    }
                    c1760.m3499(c2);
                } else if (z) {
                    continue;
                } else {
                    if (this.f10240) {
                        throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
                    }
                    c1760.m3499(c2);
                }
            } else {
                m3967();
                char c3 = this.f10237;
                if (c3 == '\"') {
                    c1760.m3499('\"');
                } else if (c3 == '\'') {
                    c1760.m3499('\'');
                } else if (c3 == '/') {
                    c1760.m3499('/');
                } else if (c3 == '\\') {
                    c1760.m3499('\\');
                } else if (c3 == 'b') {
                    c1760.m3499('\b');
                } else if (c3 == 'f') {
                    c1760.m3499('\f');
                } else if (c3 == 'n') {
                    c1760.m3499('\n');
                } else if (c3 == 'r') {
                    c1760.m3499('\r');
                } else if (c3 == 'x') {
                    c1760.m3499(m3969(2));
                } else if (c3 == 't') {
                    c1760.m3499('\t');
                } else if (c3 == 'u') {
                    c1760.m3499(m3969(4));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        throw new yyds.C2240(r3.f10244, 0, java.lang.Character.valueOf(r3.f10237));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        return m3975(r5);
     */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3964(AbstractC1183 abstractC1183, boolean[] zArr) throws C2240 {
        while (true) {
            char c = this.f10237;
            if (c != '\t' && c != '\n') {
                boolean z = this.f10249;
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case 26:
                        if (this.f10246) {
                            return null;
                        }
                        throw new C2240(this.f10244 - 1, 3, "EOF");
                    case '\"':
                    case '\'':
                        m3965();
                        return this.f10253;
                    case '-':
                        break;
                    case 'N':
                        m3966(zArr);
                        if (!this.f10235) {
                            throw new C2240(this.f10244, 1, this.f10253);
                        }
                        if ("NaN".equals(this.f10253)) {
                            return Float.valueOf(Float.NaN);
                        }
                        if (z) {
                            return this.f10253;
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case '[':
                        return m3978(abstractC1183.mo1664(this.f10251));
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        m3966(zArr);
                        if ("false".equals(this.f10253)) {
                            return Boolean.FALSE;
                        }
                        if (z) {
                            return this.f10253;
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case 'n':
                        m3966(zArr);
                        if ("null".equals(this.f10253)) {
                            return null;
                        }
                        if (z) {
                            return this.f10253;
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case 't':
                        m3966(zArr);
                        if ("true".equals(this.f10253)) {
                            return Boolean.TRUE;
                        }
                        if (z) {
                            return this.f10253;
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case '{':
                        return m3973(abstractC1183.mo1662(this.f10251));
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                m3966(zArr);
                                if (z) {
                                    return this.f10253;
                                }
                                throw new C2240(this.f10244, 1, this.f10253);
                        }
                        break;
                }
            }
            m3967();
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m3965() throws C2240 {
        if (!this.f10247 && this.f10237 == '\'') {
            if (!this.f10249) {
                throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
            }
            m3966(f10228);
            return;
        }
        int iIndexOf = this.f10242.indexOf(this.f10237, this.f10244 + 1);
        if (iIndexOf == -1) {
            if (!this.f10246) {
                throw new C2240(this.f10245, 3, null);
            }
            m3963();
            return;
        }
        String strSubstring = this.f10242.substring(this.f10244 + 1, iIndexOf);
        this.f10253 = strSubstring;
        if (strSubstring.indexOf(92) != -1) {
            this.f10254.f8838 = -1;
            m3963();
            return;
        }
        if (!this.f10239) {
            int length = this.f10253.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = this.f10253.charAt(i);
                if (cCharAt >= 0) {
                    if (cCharAt <= 31) {
                        throw new C2240(this.f10244 + i, 0, Character.valueOf(cCharAt));
                    }
                    if (cCharAt == 127 && this.f10240) {
                        throw new C2240(this.f10244 + i, 0, Character.valueOf(cCharAt));
                    }
                }
            }
        }
        this.f10244 = iIndexOf;
        m3967();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m3966(boolean[] zArr) {
        int i = this.f10244;
        m3977(zArr);
        m3976(i, this.f10244);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m3967() {
        int i = this.f10244 + 1;
        this.f10244 = i;
        if (i >= this.f10245) {
            this.f10237 = (char) 26;
        } else {
            this.f10237 = this.f10242.charAt(i);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3968() throws C2240 {
        int length = this.f10253.length();
        if (length == 1) {
            return;
        }
        String str = this.f10253;
        if (length == 2) {
            if (str.equals("00")) {
                throw new C2240(this.f10244, 6, this.f10253);
            }
            return;
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = this.f10253.charAt(1);
        if (cCharAt != '-') {
            if (cCharAt == '0' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new C2240(this.f10244, 6, this.f10253);
            }
            return;
        }
        char cCharAt3 = this.f10253.charAt(2);
        if (cCharAt2 == '0' && cCharAt3 >= '0' && cCharAt3 <= '9') {
            throw new C2240(this.f10244, 6, this.f10253);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final char m3969(int i) throws C2240 {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 * 16;
            m3967();
            char c = this.f10237;
            if (c <= '9' && c >= '0') {
                i2 = c - '0';
            } else if (c <= 'F' && c >= 'A') {
                i2 = c - '7';
            } else {
                if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new C2240(this.f10244, 3, "EOF");
                    }
                    throw new C2240(this.f10244, 4, Character.valueOf(this.f10237));
                }
                i2 = c - 'W';
            }
            i3 = i2 + i5;
        }
        return (char) i3;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Number m3970() throws C2240 {
        if (!this.f10233) {
            m3968();
        }
        try {
            boolean z = this.f10252;
            String str = this.f10253;
            if (!z) {
                return Float.valueOf(Float.parseFloat(str));
            }
            if (str.length() <= 18) {
                return Double.valueOf(Double.parseDouble(this.f10253));
            }
            if (!this.f10250) {
                double d = Double.parseDouble(this.f10253);
                String strValueOf = String.valueOf(d);
                String str2 = this.f10253;
                char[] charArray = strValueOf.toCharArray();
                char[] charArray2 = str2.toCharArray();
                if (charArray.length <= charArray2.length) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i < charArray.length) {
                            char c = charArray[i];
                            if (c >= '0' && c <= '9') {
                                if (c != charArray2[i2]) {
                                    break;
                                }
                                i2++;
                                i++;
                            }
                            char c2 = charArray2[i2];
                            if (c2 >= '0' && c2 <= '9') {
                                break;
                            }
                            int i3 = i2 + 1;
                            i2 = charArray2[i3] == '+' ? i2 + 2 : i3;
                            i++;
                        } else if (i2 == charArray2.length) {
                            return Double.valueOf(d);
                        }
                    }
                }
            }
            return new BigDecimal(this.f10253);
        } catch (NumberFormatException unused) {
            throw new C2240(this.f10244, 1, this.f10253);
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m3971() {
        while (true) {
            char c = this.f10237;
            if (c > ' ' || c == 26) {
                return;
            } else {
                m3974();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        throw new yyds.C2240(r4.f10244, 0, java.lang.Character.valueOf(r4.f10237));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
    
        r0 = m3975(r3);
        r4.f10236 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        return r5.mo1661(r0);
     */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3972(AbstractC1183 abstractC1183) throws C2240 {
        while (true) {
            char c = this.f10237;
            if (c != '\t' && c != '\n') {
                boolean z = this.f10249;
                boolean[] zArr = f10230;
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        m3965();
                        return abstractC1183.mo1661(this.f10253);
                    case '-':
                        break;
                    case 'N':
                        m3966(zArr);
                        if (!this.f10235) {
                            throw new C2240(this.f10244, 1, this.f10253);
                        }
                        if ("NaN".equals(this.f10253)) {
                            return abstractC1183.mo1661(Float.valueOf(Float.NaN));
                        }
                        if (z) {
                            return abstractC1183.mo1661(this.f10253);
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case '[':
                        return m3978(abstractC1183);
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        m3966(zArr);
                        if ("false".equals(this.f10253)) {
                            return abstractC1183.mo1661(Boolean.FALSE);
                        }
                        if (z) {
                            return abstractC1183.mo1661(this.f10253);
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case 'n':
                        m3966(zArr);
                        if ("null".equals(this.f10253)) {
                            return null;
                        }
                        if (z) {
                            return abstractC1183.mo1661(this.f10253);
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case 't':
                        m3966(zArr);
                        if ("true".equals(this.f10253)) {
                            return abstractC1183.mo1661(Boolean.TRUE);
                        }
                        if (z) {
                            return abstractC1183.mo1661(this.f10253);
                        }
                        throw new C2240(this.f10244, 1, this.f10253);
                    case '{':
                        return m3973(abstractC1183);
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                m3966(zArr);
                                if (z) {
                                    return abstractC1183.mo1661(this.f10253);
                                }
                                throw new C2240(this.f10244, 1, this.f10253);
                        }
                        break;
                }
            }
            m3967();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014b, code lost:
    
        throw new yyds.C2240(r13.f10244, 0, java.lang.Character.valueOf(r13.f10237));
     */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3973(AbstractC1183 abstractC1183) throws C2240 {
        if (this.f10237 != '{') {
            throw new RuntimeException("Internal Error");
        }
        if (this.f10238) {
            int i = this.f10241 + 1;
            this.f10241 = i;
            if (i > 400) {
                throw new C2240(this.f10244, 7, Character.valueOf(this.f10237));
            }
        }
        Object objMo1665 = abstractC1183.mo1665();
        boolean z = false;
        while (true) {
            m3967();
            char c = this.f10237;
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                boolean z2 = this.f10248;
                if (c != ',') {
                    if (c == ':' || c == '[' || c == ']' || c == '{') {
                        break;
                    }
                    if (c == '}') {
                        if (z && !z2) {
                            throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
                        }
                        this.f10241--;
                        m3967();
                        return abstractC1183.mo1661(objMo1665);
                    }
                    if (c == '\"' || c == '\'') {
                        m3965();
                    } else {
                        m3966(f10229);
                        if (!this.f10249) {
                            throw new C2240(this.f10244, 1, this.f10253);
                        }
                    }
                    String str = this.f10253;
                    m3971();
                    char c2 = this.f10237;
                    boolean z3 = this.f10246;
                    if (c2 != ':') {
                        if (c2 != 26) {
                            throw new C2240(this.f10244 - 1, 0, Character.valueOf(this.f10237));
                        }
                        if (!z3) {
                            throw new C2240(this.f10244 - 1, 3, null);
                        }
                        this.f10241--;
                        abstractC1183.mo1659(objMo1665, str, null);
                        return abstractC1183.mo1661(objMo1665);
                    }
                    int i2 = this.f10244 + 1;
                    this.f10244 = i2;
                    if (i2 >= this.f10245) {
                        this.f10237 = (char) 26;
                        if (!this.f10246) {
                            throw new C2240(this.f10244 - 1, 3, "EOF");
                        }
                    } else {
                        this.f10237 = this.f10242.charAt(i2);
                    }
                    this.f10251 = str;
                    abstractC1183.mo1659(objMo1665, str, m3964(abstractC1183, f10227));
                    this.f10251 = null;
                    m3971();
                    char c3 = this.f10237;
                    if (c3 == '}') {
                        this.f10241--;
                        m3967();
                        return abstractC1183.mo1661(objMo1665);
                    }
                    if (c3 == 26) {
                        if (!z3) {
                            throw new C2240(this.f10244 - 1, 3, null);
                        }
                        this.f10241--;
                        return abstractC1183.mo1661(objMo1665);
                    }
                    if (c3 != ',') {
                        throw new C2240(this.f10244 - 1, 1, Character.valueOf(this.f10237));
                    }
                } else if (z && !z2) {
                    throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
                }
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m3974() {
        int i = this.f10244 + 1;
        this.f10244 = i;
        if (i >= this.f10245) {
            this.f10237 = (char) 26;
        } else {
            this.f10237 = this.f10242.charAt(i);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Object m3975(boolean[] zArr) throws C2240 {
        char c;
        int i;
        int i2;
        int i3 = this.f10244;
        m3967();
        while (true) {
            c = this.f10237;
            if (c < '0' || c > '9') {
                break;
            }
            m3974();
        }
        boolean z = this.f10233;
        boolean z2 = this.f10249;
        boolean z3 = true;
        if (c != '.' && c != 'E' && c != 'e') {
            m3971();
            char c2 = this.f10237;
            if (c2 >= 0 && c2 < '~' && !zArr[c2] && c2 != 26) {
                m3977(zArr);
                m3976(i3, this.f10244);
                if (z2) {
                    return this.f10253;
                }
                throw new C2240(this.f10244, 1, this.f10253);
            }
            m3976(i3, this.f10244);
            String str = this.f10253;
            int length = str.length();
            if (str.charAt(0) == '-') {
                if (!z && length >= 3 && str.charAt(1) == '0') {
                    throw new C2240(this.f10244, 6, str);
                }
                i = 20;
                i2 = 1;
            } else {
                if (!z && length >= 2 && str.charAt(0) == '0') {
                    throw new C2240(this.f10244, 6, str);
                }
                i = 19;
                i2 = 0;
            }
            int i4 = i2;
            if (length < i) {
                z3 = false;
            } else {
                if (length > i) {
                    return new BigInteger(str, 10);
                }
                length--;
            }
            long jCharAt = 0;
            while (i2 < length) {
                jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i2)));
                i2++;
            }
            if (z3) {
                if (jCharAt <= -922337203685477580L) {
                    if (jCharAt >= -922337203685477580L) {
                        if (i4 != 0) {
                        }
                    }
                    return new BigInteger(str, 10);
                }
                jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i2)));
            }
            boolean z4 = this.f10243;
            if (i4 != 0) {
                return (!z4 || jCharAt < -2147483648L) ? Long.valueOf(jCharAt) : Integer.valueOf((int) jCharAt);
            }
            long j = -jCharAt;
            return (!z4 || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
        }
        if (c == '.') {
            m3967();
            while (true) {
                c = this.f10237;
                if (c < '0' || c > '9') {
                    break;
                }
                m3974();
            }
        }
        if (c != 'E' && c != 'e') {
            m3971();
            char c3 = this.f10237;
            if (c3 < 0 || c3 >= '~' || zArr[c3] || c3 == 26) {
                m3976(i3, this.f10244);
                return m3970();
            }
            m3977(zArr);
            m3976(i3, this.f10244);
            if (z2) {
                return this.f10253;
            }
            throw new C2240(this.f10244, 1, this.f10253);
        }
        C1760 c1760 = this.f10254;
        c1760.m3499('E');
        m3967();
        char c4 = this.f10237;
        if (c4 != '+' && c4 != '-' && (c4 < '0' || c4 > '9')) {
            m3977(zArr);
            m3976(i3, this.f10244);
            if (!z2) {
                throw new C2240(this.f10244, 1, this.f10253);
            }
            if (!z) {
                m3968();
            }
            return this.f10253;
        }
        c1760.m3499(c4);
        m3967();
        while (true) {
            char c5 = this.f10237;
            if (c5 < '0' || c5 > '9') {
                break;
            }
            m3974();
        }
        m3971();
        char c6 = this.f10237;
        if (c6 < 0 || c6 >= '~' || zArr[c6] || c6 == 26) {
            m3976(i3, this.f10244);
            return m3970();
        }
        m3977(zArr);
        m3976(i3, this.f10244);
        if (z2) {
            return this.f10253;
        }
        throw new C2240(this.f10244, 1, this.f10253);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3976(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.f10242.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.f10242.charAt(i3))) {
                break;
            } else {
                i2--;
            }
        }
        this.f10253 = this.f10242.substring(i, i2);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m3977(boolean[] zArr) {
        while (true) {
            char c = this.f10237;
            if (c == 26) {
                return;
            }
            if (c >= 0 && c < '~' && zArr[c]) {
                return;
            } else {
                m3974();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r6 == ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r6 == ']') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r6 == '}') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        throw new yyds.C2240(r8.f10244, 0, java.lang.Character.valueOf(r8.f10237));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        r8.f10241--;
        m3967();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        return r9.mo1661(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        throw new yyds.C2240(r8.f10244, 0, java.lang.Character.valueOf(r8.f10237));
     */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3978(AbstractC1183 abstractC1183) throws C2240 {
        if (this.f10237 != '[') {
            throw new RuntimeException("Internal Error");
        }
        if (this.f10238) {
            int i = this.f10241 + 1;
            this.f10241 = i;
            if (i > 400) {
                throw new C2240(this.f10244, 7, Character.valueOf(this.f10237));
            }
        }
        Object objMo1663 = abstractC1183.mo1663();
        m3967();
        char c = this.f10237;
        boolean z = this.f10248;
        if (c == ',' && !z) {
            throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
        }
        while (true) {
            boolean z2 = false;
            while (true) {
                char c2 = this.f10237;
                if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                    if (c2 == 26) {
                        if (!this.f10246) {
                            throw new C2240(this.f10244 - 1, 3, "EOF");
                        }
                        this.f10241--;
                        return abstractC1183.mo1661(objMo1663);
                    }
                    if (c2 != ' ') {
                        if (c2 != ',') {
                            break;
                        }
                        if (z2 && !z) {
                            throw new C2240(this.f10244, 0, Character.valueOf(this.f10237));
                        }
                        m3967();
                        z2 = true;
                    }
                }
                m3967();
            }
            abstractC1183.mo1660(objMo1663, m3964(abstractC1183, f10231));
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object m3979(String str, AbstractC1183 abstractC1183) throws C2240 {
        C0644 c0644 = abstractC1183.f5420;
        this.f10242 = str;
        this.f10245 = str.length();
        this.f10244 = -1;
        try {
            m3967();
            Object objM3972 = m3972(abstractC1183);
            if (this.f10234) {
                if (!this.f10232) {
                    m3971();
                }
                if (this.f10237 != 26) {
                    throw new C2240(this.f10244 - 1, 1, Character.valueOf(this.f10237));
                }
            }
            this.f10253 = null;
            return objM3972;
        } catch (IOException e) {
            throw new C2240(C2240.m4240(this.f10244, 2, e), e);
        }
    }
}
