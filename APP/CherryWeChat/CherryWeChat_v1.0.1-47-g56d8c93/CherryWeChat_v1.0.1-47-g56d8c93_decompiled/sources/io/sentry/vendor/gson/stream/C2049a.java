package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p000.C2273na;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2049a implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Reader f7247a;

    /* JADX INFO: renamed from: i */
    public long f7255i;

    /* JADX INFO: renamed from: j */
    public int f7256j;

    /* JADX INFO: renamed from: k */
    public String f7257k;

    /* JADX INFO: renamed from: l */
    public int[] f7258l;

    /* JADX INFO: renamed from: n */
    public String[] f7260n;

    /* JADX INFO: renamed from: o */
    public int[] f7261o;

    /* JADX INFO: renamed from: b */
    public boolean f7248b = false;

    /* JADX INFO: renamed from: c */
    public final char[] f7249c = new char[1024];

    /* JADX INFO: renamed from: d */
    public int f7250d = 0;

    /* JADX INFO: renamed from: e */
    public int f7251e = 0;

    /* JADX INFO: renamed from: f */
    public int f7252f = 0;

    /* JADX INFO: renamed from: g */
    public int f7253g = 0;

    /* JADX INFO: renamed from: h */
    public int f7254h = 0;

    /* JADX INFO: renamed from: m */
    public int f7259m = 1;

    public C2049a(Reader reader) {
        int[] iArr = new int[32];
        this.f7258l = iArr;
        iArr[0] = 6;
        this.f7260n = new String[32];
        this.f7261o = new int[32];
        this.f7247a = reader;
    }

    /* JADX INFO: renamed from: A */
    public final String m4192A() throws IOException {
        String str;
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 10) {
            str = m4193B();
        } else if (iM4203l == 8) {
            str = m4216z('\'');
        } else if (iM4203l == 9) {
            str = m4216z('\"');
        } else if (iM4203l == 11) {
            str = this.f7257k;
            this.f7257k = null;
        } else if (iM4203l == 15) {
            str = Long.toString(this.f7255i);
        } else {
            if (iM4203l != 16) {
                throw new IllegalStateException("Expected a string but was " + m4194C() + m4208r());
            }
            str = new String(this.f7249c, this.f7250d, this.f7256j);
            this.f7250d += this.f7256j;
        }
        this.f7254h = 0;
        int[] iArr = this.f7261o;
        int i = this.f7259m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m4202i();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4193B() throws C2273na {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f7250d;
                int i4 = i3 + i2;
                int i5 = this.f7251e;
                cArr = this.f7249c;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f7250d, i2);
                    this.f7250d += i2;
                } else if (m4206p(i2 + 1)) {
                }
            }
            i = i2;
            if (sb != null) {
                string = new String(cArr, this.f7250d, i);
            } else {
                sb.append(cArr, this.f7250d, i);
                string = sb.toString();
            }
            this.f7250d += i;
            return string;
        } while (m4206p(1));
        if (sb != null) {
        }
        this.f7250d += i;
        return string;
    }

    /* JADX INFO: renamed from: C */
    public final EnumC2050b m4194C() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        switch (iM4203l) {
            case 1:
                return EnumC2050b.BEGIN_OBJECT;
            case 2:
                return EnumC2050b.END_OBJECT;
            case 3:
                return EnumC2050b.BEGIN_ARRAY;
            case 4:
                return EnumC2050b.END_ARRAY;
            case 5:
            case 6:
                return EnumC2050b.BOOLEAN;
            case 7:
                return EnumC2050b.NULL;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
            case 10:
            case 11:
                return EnumC2050b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC2050b.NAME;
            case 15:
            case 16:
                return EnumC2050b.NUMBER;
            case 17:
                return EnumC2050b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4195D(int i) {
        int i2 = this.f7259m;
        int[] iArr = this.f7258l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f7258l = Arrays.copyOf(iArr, i3);
            this.f7261o = Arrays.copyOf(this.f7261o, i3);
            this.f7260n = (String[]) Arrays.copyOf(this.f7260n, i3);
        }
        int[] iArr2 = this.f7258l;
        int i4 = this.f7259m;
        this.f7259m = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: E */
    public final char m4196E() throws C2273na {
        int i;
        if (this.f7250d == this.f7251e && !m4206p(1)) {
            m4199H("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f7250d;
        int i3 = i2 + 1;
        this.f7250d = i3;
        char[] cArr = this.f7249c;
        char c = cArr[i2];
        if (c == '\n') {
            this.f7252f++;
            this.f7253g = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            m4199H("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.f7251e && !m4206p(4)) {
            m4199H("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.f7250d;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f7250d, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.f7250d += 4;
        return c2;
    }

    /* JADX INFO: renamed from: F */
    public final void m4197F(char c) throws C2273na {
        do {
            int i = this.f7250d;
            int i2 = this.f7251e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f7249c[i];
                if (c2 == c) {
                    this.f7250d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f7250d = i3;
                    m4196E();
                    i = this.f7250d;
                    i2 = this.f7251e;
                } else {
                    if (c2 == '\n') {
                        this.f7252f++;
                        this.f7253g = i3;
                    }
                    i = i3;
                }
            }
            this.f7250d = i;
        } while (m4206p(1));
        m4199H("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final void m4198G() {
        char c;
        do {
            if (this.f7250d >= this.f7251e && !m4206p(1)) {
                return;
            }
            int i = this.f7250d;
            int i2 = i + 1;
            this.f7250d = i2;
            c = this.f7249c[i];
            if (c == '\n') {
                this.f7252f++;
                this.f7253g = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: H */
    public final void m4199H(String str) throws C2273na {
        throw new C2273na(str + m4208r());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7254h = 0;
        this.f7258l[0] = 8;
        this.f7259m = 1;
        this.f7247a.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m4200d() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 3) {
            m4195D(1);
            this.f7261o[this.f7259m - 1] = 0;
            this.f7254h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m4194C() + m4208r());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4201f() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 1) {
            m4195D(3);
            this.f7254h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m4194C() + m4208r());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4202i() throws C2273na {
        if (this.f7248b) {
            return;
        }
        m4199H("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0215, code lost:
    
        if (m4207q(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4203l() throws IOException {
        int iM4214x;
        int i;
        int iM4214x2;
        int i2;
        String str;
        String str2;
        int i3;
        char c;
        char c2;
        long j;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f7258l;
        int i7 = 1;
        int i8 = this.f7259m - 1;
        int i9 = iArr[i8];
        char[] cArr = this.f7249c;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iM4214x3 = m4214x(true);
            if (iM4214x3 != 44) {
                if (iM4214x3 != 59) {
                    if (iM4214x3 == 93) {
                        this.f7254h = 4;
                        return 4;
                    }
                    m4199H("Unterminated array");
                    throw null;
                }
                m4202i();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iM4214x = m4214x(true)) != 44) {
                    if (iM4214x != 59) {
                        if (iM4214x == 125) {
                            this.f7254h = 2;
                            return 2;
                        }
                        m4199H("Unterminated object");
                        throw null;
                    }
                    m4202i();
                }
                int iM4214x4 = m4214x(true);
                if (iM4214x4 == 34) {
                    this.f7254h = 13;
                    return 13;
                }
                if (iM4214x4 == 39) {
                    m4202i();
                    this.f7254h = 12;
                    return 12;
                }
                if (iM4214x4 == 125) {
                    if (i9 != 5) {
                        this.f7254h = 2;
                        return 2;
                    }
                    m4199H("Expected name");
                    throw null;
                }
                m4202i();
                this.f7250d--;
                if (m4207q((char) iM4214x4)) {
                    this.f7254h = 14;
                    return 14;
                }
                m4199H("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iM4214x5 = m4214x(true);
                if (iM4214x5 != 58) {
                    if (iM4214x5 != 61) {
                        m4199H("Expected ':'");
                        throw null;
                    }
                    m4202i();
                    if (this.f7250d < this.f7251e || m4206p(1)) {
                        int i10 = this.f7250d;
                        if (cArr[i10] == '>') {
                            this.f7250d = i10 + 1;
                        }
                    }
                }
            } else {
                if (i9 != 6) {
                    if (i9 == 7) {
                        i = 0;
                        if (m4214x(false) == -1) {
                            this.f7254h = 17;
                            return 17;
                        }
                        m4202i();
                        this.f7250d--;
                    } else {
                        i = 0;
                        if (i9 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    iM4214x2 = m4214x(true);
                    if (iM4214x2 != 34) {
                        this.f7254h = 9;
                        return 9;
                    }
                    if (iM4214x2 == 39) {
                        m4202i();
                        this.f7254h = 8;
                        return 8;
                    }
                    if (iM4214x2 == 44 || iM4214x2 == 59) {
                        i2 = 1;
                    } else {
                        if (iM4214x2 == 91) {
                            this.f7254h = 3;
                            return 3;
                        }
                        if (iM4214x2 == 93) {
                            i2 = 1;
                            if (i9 == 1) {
                                this.f7254h = 4;
                                return 4;
                            }
                        } else {
                            if (iM4214x2 == 123) {
                                this.f7254h = 1;
                                return 1;
                            }
                            int i11 = this.f7250d - 1;
                            this.f7250d = i11;
                            char c3 = cArr[i11];
                            if (c3 == 't' || c3 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i3 = 5;
                            } else if (c3 == 'f' || c3 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i3 = 6;
                            } else {
                                if (c3 == 'n' || c3 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i3 = 7;
                                }
                                i3 = i;
                                if (i3 == 0) {
                                    return i3;
                                }
                                int i12 = this.f7250d;
                                int i13 = this.f7251e;
                                int i14 = i;
                                int i15 = i14;
                                int i16 = i15;
                                boolean z = true;
                                long j2 = 0;
                                while (true) {
                                    if (i12 + i15 == i13) {
                                        if (i15 == cArr.length) {
                                            break;
                                        }
                                        if (!m4206p(i15 + 1)) {
                                            j = 0;
                                            break;
                                        }
                                        int i17 = this.f7250d;
                                        i13 = this.f7251e;
                                        i12 = i17;
                                        c2 = cArr[i12 + i15];
                                        j = 0;
                                        if (c2 != '+') {
                                        }
                                    } else {
                                        c2 = cArr[i12 + i15];
                                        j = 0;
                                        if (c2 != '+') {
                                            i4 = i13;
                                            i5 = 6;
                                            if (i14 != 5) {
                                                break;
                                            }
                                            i14 = i5;
                                            i15++;
                                            i13 = i4;
                                            i7 = 1;
                                        } else if (c2 == 'E' || c2 == 'e') {
                                            i4 = i13;
                                            if (i14 != 2 && i14 != 4) {
                                                break;
                                            }
                                            i14 = 5;
                                            i15++;
                                            i13 = i4;
                                            i7 = 1;
                                        } else if (c2 == '-') {
                                            i4 = i13;
                                            i5 = 6;
                                            if (i14 == 0) {
                                                i14 = 1;
                                                i16 = 1;
                                                i15++;
                                                i13 = i4;
                                                i7 = 1;
                                            } else {
                                                if (i14 != 5) {
                                                    break;
                                                }
                                                i14 = i5;
                                                i15++;
                                                i13 = i4;
                                                i7 = 1;
                                            }
                                        } else if (c2 == '.') {
                                            i4 = i13;
                                            if (i14 != 2) {
                                                break;
                                            }
                                            i14 = 3;
                                            i15++;
                                            i13 = i4;
                                            i7 = 1;
                                        } else {
                                            if (c2 < '0' || c2 > '9') {
                                                break;
                                            }
                                            if (i14 == i7 || i14 == 0) {
                                                i4 = i13;
                                                j2 = -(c2 - '0');
                                                i14 = 2;
                                            } else if (i14 != 2) {
                                                i4 = i13;
                                                if (i14 == 3) {
                                                    i14 = 4;
                                                } else if (i14 == 5 || i14 == 6) {
                                                    i14 = 7;
                                                }
                                            } else {
                                                if (j2 == 0) {
                                                    break;
                                                }
                                                i4 = i13;
                                                long j3 = (10 * j2) - ((long) (c2 - '0'));
                                                z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                j2 = j3;
                                            }
                                            i15++;
                                            i13 = i4;
                                            i7 = 1;
                                        }
                                    }
                                    if (i6 == 0) {
                                        return i6;
                                    }
                                    if (!m4207q(cArr[this.f7250d])) {
                                        m4199H("Expected value");
                                        throw null;
                                    }
                                    m4202i();
                                    this.f7254h = 10;
                                    return 10;
                                }
                                int i18 = 2;
                                if (i14 != 2) {
                                    if (i14 != i18 || i14 == 4 || i14 == 7) {
                                        this.f7256j = i15;
                                        i6 = 16;
                                        this.f7254h = 16;
                                    } else {
                                        i6 = 0;
                                    }
                                } else if (!z || ((j2 == Long.MIN_VALUE && i16 == 0) || (j2 == j && i16 != 0))) {
                                    i18 = 2;
                                    if (i14 != i18) {
                                    }
                                    this.f7256j = i15;
                                    i6 = 16;
                                    this.f7254h = 16;
                                } else {
                                    if (i16 == 0) {
                                        j2 = -j2;
                                    }
                                    this.f7255i = j2;
                                    this.f7250d += i15;
                                    i6 = 15;
                                    this.f7254h = 15;
                                }
                                if (i6 == 0) {
                                }
                            }
                            int length = str.length();
                            int i19 = 1;
                            while (true) {
                                if (i19 < length) {
                                    if ((this.f7250d + i19 >= this.f7251e && !m4206p(i19 + 1)) || ((c = cArr[this.f7250d + i19]) != str.charAt(i19) && c != str2.charAt(i19))) {
                                        break;
                                    }
                                    i19++;
                                } else {
                                    if ((this.f7250d + length < this.f7251e || m4206p(length + 1)) && m4207q(cArr[this.f7250d + length])) {
                                        break;
                                    }
                                    this.f7250d += length;
                                    this.f7254h = i3;
                                }
                            }
                            if (i3 == 0) {
                            }
                        }
                    }
                    if (i9 != i2 && i9 != 2) {
                        m4199H("Unexpected value");
                        throw null;
                    }
                    m4202i();
                    this.f7250d -= i2;
                    this.f7254h = 7;
                    return 7;
                }
                if (this.f7248b) {
                    m4214x(true);
                    int i20 = this.f7250d;
                    int i21 = i20 - 1;
                    this.f7250d = i21;
                    if ((i20 + 4 <= this.f7251e || m4206p(5)) && cArr[i21] == ')' && cArr[i20] == ']' && cArr[i20 + 1] == '}' && cArr[i20 + 2] == '\'' && cArr[i20 + 3] == '\n') {
                        this.f7250d += 5;
                    }
                }
                this.f7258l[this.f7259m - 1] = 7;
            }
        }
        i = 0;
        iM4214x2 = m4214x(true);
        if (iM4214x2 != 34) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4204m() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + m4194C() + m4208r());
        }
        int i = this.f7259m;
        this.f7259m = i - 1;
        int[] iArr = this.f7261o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f7254h = 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m4205o() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + m4194C() + m4208r());
        }
        int i = this.f7259m;
        int i2 = i - 1;
        this.f7259m = i2;
        this.f7260n[i2] = null;
        int[] iArr = this.f7261o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f7254h = 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4206p(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f7253g;
        int i5 = this.f7250d;
        this.f7253g = i4 - i5;
        int i6 = this.f7251e;
        char[] cArr = this.f7249c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f7251e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f7251e = 0;
        }
        this.f7250d = 0;
        do {
            int i8 = this.f7251e;
            int i9 = this.f7247a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f7251e + i9;
            this.f7251e = i2;
            if (this.f7252f == 0 && (i3 = this.f7253g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f7250d++;
                this.f7253g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4207q(char c) throws C2273na {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m4202i();
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final String m4208r() {
        int i = this.f7252f + 1;
        int i2 = (this.f7250d - this.f7253g) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = this.f7259m;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f7258l[i4];
            if (i5 == 1 || i5 == 2) {
                sb2.append('[');
                sb2.append(this.f7261o[i4]);
                sb2.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb2.append('.');
                String str = this.f7260n[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4209s() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 5) {
            this.f7254h = 0;
            int[] iArr = this.f7261o;
            int i = this.f7259m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM4203l != 6) {
            throw new IllegalStateException("Expected a boolean but was " + m4194C() + m4208r());
        }
        this.f7254h = 0;
        int[] iArr2 = this.f7261o;
        int i2 = this.f7259m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final double m4210t() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 15) {
            this.f7254h = 0;
            int[] iArr = this.f7261o;
            int i = this.f7259m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f7255i;
        }
        if (iM4203l == 16) {
            this.f7257k = new String(this.f7249c, this.f7250d, this.f7256j);
            this.f7250d += this.f7256j;
        } else if (iM4203l == 8 || iM4203l == 9) {
            this.f7257k = m4216z(iM4203l == 8 ? '\'' : '\"');
        } else if (iM4203l == 10) {
            this.f7257k = m4193B();
        } else if (iM4203l != 11) {
            throw new IllegalStateException("Expected a double but was " + m4194C() + m4208r());
        }
        this.f7254h = 11;
        double d = Double.parseDouble(this.f7257k);
        if (!this.f7248b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C2273na("JSON forbids NaN and infinities: " + d + m4208r());
        }
        this.f7257k = null;
        this.f7254h = 0;
        int[] iArr2 = this.f7261o;
        int i2 = this.f7259m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final String toString() {
        return C2049a.class.getSimpleName() + m4208r();
    }

    /* JADX INFO: renamed from: u */
    public final int m4211u() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 15) {
            long j = this.f7255i;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f7255i + m4208r());
            }
            this.f7254h = 0;
            int[] iArr = this.f7261o;
            int i2 = this.f7259m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM4203l == 16) {
            this.f7257k = new String(this.f7249c, this.f7250d, this.f7256j);
            this.f7250d += this.f7256j;
        } else {
            if (iM4203l != 8 && iM4203l != 9 && iM4203l != 10) {
                throw new IllegalStateException("Expected an int but was " + m4194C() + m4208r());
            }
            if (iM4203l == 10) {
                this.f7257k = m4193B();
            } else {
                this.f7257k = m4216z(iM4203l == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f7257k);
                this.f7254h = 0;
                int[] iArr2 = this.f7261o;
                int i4 = this.f7259m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7254h = 11;
        double d = Double.parseDouble(this.f7257k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f7257k + m4208r());
        }
        this.f7257k = null;
        this.f7254h = 0;
        int[] iArr3 = this.f7261o;
        int i6 = this.f7259m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* JADX INFO: renamed from: v */
    public final long m4212v() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 15) {
            this.f7254h = 0;
            int[] iArr = this.f7261o;
            int i = this.f7259m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f7255i;
        }
        if (iM4203l == 16) {
            this.f7257k = new String(this.f7249c, this.f7250d, this.f7256j);
            this.f7250d += this.f7256j;
        } else {
            if (iM4203l != 8 && iM4203l != 9 && iM4203l != 10) {
                throw new IllegalStateException("Expected a long but was " + m4194C() + m4208r());
            }
            if (iM4203l == 10) {
                this.f7257k = m4193B();
            } else {
                this.f7257k = m4216z(iM4203l == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f7257k);
                this.f7254h = 0;
                int[] iArr2 = this.f7261o;
                int i2 = this.f7259m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7254h = 11;
        double d = Double.parseDouble(this.f7257k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f7257k + m4208r());
        }
        this.f7257k = null;
        this.f7254h = 0;
        int[] iArr3 = this.f7261o;
        int i3 = this.f7259m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX INFO: renamed from: w */
    public final String m4213w() throws IOException {
        String strM4216z;
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l == 14) {
            strM4216z = m4193B();
        } else if (iM4203l == 12) {
            strM4216z = m4216z('\'');
        } else {
            if (iM4203l != 13) {
                throw new IllegalStateException("Expected a name but was " + m4194C() + m4208r());
            }
            strM4216z = m4216z('\"');
        }
        this.f7254h = 0;
        this.f7260n[this.f7259m - 1] = strM4216z;
        return strM4216z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4214x(boolean z) throws IOException {
        int i = this.f7250d;
        int i2 = this.f7251e;
        while (true) {
            if (i == i2) {
                this.f7250d = i;
                if (!m4206p(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m4208r());
                }
                i = this.f7250d;
                i2 = this.f7251e;
            }
            int i3 = i + 1;
            char[] cArr = this.f7249c;
            char c = cArr[i];
            if (c == '\n') {
                this.f7252f++;
                this.f7253g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f7250d = i3;
                    if (i3 == i2) {
                        this.f7250d = i;
                        boolean zM4206p = m4206p(2);
                        this.f7250d++;
                        if (!zM4206p) {
                            break;
                        }
                        break;
                        break;
                    }
                    m4202i();
                    int i4 = this.f7250d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f7250d = i4 + 1;
                        while (true) {
                            if (this.f7250d + 2 > this.f7251e && !m4206p(2)) {
                                m4199H("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f7250d;
                            if (cArr[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (cArr[this.f7250d + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                i = this.f7250d + 2;
                                i2 = this.f7251e;
                                break;
                            }
                            this.f7252f++;
                            this.f7253g = i5 + 1;
                            this.f7250d++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.f7250d = i4 + 1;
                        m4198G();
                        i = this.f7250d;
                        i2 = this.f7251e;
                    }
                } else {
                    if (c != '#') {
                        this.f7250d = i3;
                        return c;
                    }
                    this.f7250d = i3;
                    m4202i();
                    m4198G();
                    i = this.f7250d;
                    i2 = this.f7251e;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4215y() throws IOException {
        int iM4203l = this.f7254h;
        if (iM4203l == 0) {
            iM4203l = m4203l();
        }
        if (iM4203l != 7) {
            throw new IllegalStateException("Expected null but was " + m4194C() + m4208r());
        }
        this.f7254h = 0;
        int[] iArr = this.f7261o;
        int i = this.f7259m - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f7250d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f7250d = r2;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4216z(char c) throws C2273na {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.f7250d;
            int i3 = this.f7251e;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.f7249c;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f7250d = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        break;
                    }
                    if (c2 == '\n') {
                        this.f7252f++;
                        this.f7253g = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(m4196E());
                i2 = this.f7250d;
                i3 = this.f7251e;
            }
        } while (m4206p(1));
        m4199H("Unterminated string");
        throw null;
    }
}
