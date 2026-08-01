package p051b0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public class C0493b implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final Reader f1546a;

    /* JADX INFO: renamed from: i */
    public long f1554i;

    /* JADX INFO: renamed from: j */
    public int f1555j;

    /* JADX INFO: renamed from: k */
    public String f1556k;

    /* JADX INFO: renamed from: l */
    public int[] f1557l;

    /* JADX INFO: renamed from: n */
    public String[] f1559n;

    /* JADX INFO: renamed from: o */
    public int[] f1560o;

    /* JADX INFO: renamed from: b */
    public boolean f1547b = false;

    /* JADX INFO: renamed from: c */
    public final char[] f1548c = new char[1024];

    /* JADX INFO: renamed from: d */
    public int f1549d = 0;

    /* JADX INFO: renamed from: e */
    public int f1550e = 0;

    /* JADX INFO: renamed from: f */
    public int f1551f = 0;

    /* JADX INFO: renamed from: g */
    public int f1552g = 0;

    /* JADX INFO: renamed from: h */
    public int f1553h = 0;

    /* JADX INFO: renamed from: m */
    public int f1558m = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0492a.f1545a = new C0492a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0493b(Reader reader) {
        int[] iArr = new int[32];
        this.f1557l = iArr;
        iArr[0] = 6;
        this.f1559n = new String[32];
        this.f1560o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f1546a = reader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m940A(char c2) throws C0495d {
        do {
            int i2 = this.f1549d;
            int i3 = this.f1550e;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = this.f1548c[i2];
                if (c3 == c2) {
                    this.f1549d = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f1549d = i4;
                    m954z();
                    i2 = this.f1549d;
                    i3 = this.f1550e;
                } else {
                    if (c3 == '\n') {
                        this.f1551f++;
                        this.f1552g = i4;
                    }
                    i2 = i4;
                }
            }
            this.f1549d = i2;
        } while (m946g(1));
        m943E("Unterminated string");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m941B() {
        char c2;
        do {
            if (this.f1549d >= this.f1550e && !m946g(1)) {
                return;
            }
            int i2 = this.f1549d;
            int i3 = i2 + 1;
            this.f1549d = i3;
            c2 = this.f1548c[i2];
            if (c2 == '\n') {
                this.f1551f++;
                this.f1552g = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m944c();
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m942C() throws C0495d {
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f1549d;
                if (i3 + i2 < this.f1550e) {
                    char c2 = this.f1548c[i3 + i2];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f1549d = i3 + i2;
                }
            }
            this.f1549d += i2;
            return;
        } while (m946g(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: D */
    public void mo563D() throws C0495d {
        int i2 = 0;
        do {
            int iM945d = this.f1553h;
            if (iM945d == 0) {
                iM945d = m945d();
            }
            switch (iM945d) {
                case 1:
                    m953y(3);
                    i2++;
                    this.f1553h = 0;
                    break;
                case 2:
                    if (i2 == 0) {
                        this.f1559n[this.f1558m - 1] = null;
                    }
                    this.f1558m--;
                    i2--;
                    this.f1553h = 0;
                    break;
                case 3:
                    m953y(1);
                    i2++;
                    this.f1553h = 0;
                    break;
                case 4:
                    this.f1558m--;
                    i2--;
                    this.f1553h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f1553h = 0;
                    break;
                case 8:
                    m940A('\'');
                    this.f1553h = 0;
                    break;
                case 9:
                    m940A('\"');
                    this.f1553h = 0;
                    break;
                case 10:
                    m942C();
                    this.f1553h = 0;
                    break;
                case 12:
                    m940A('\'');
                    if (i2 == 0) {
                        this.f1559n[this.f1558m - 1] = "<skipped>";
                    }
                    this.f1553h = 0;
                    break;
                case 13:
                    m940A('\"');
                    if (i2 == 0) {
                        this.f1559n[this.f1558m - 1] = "<skipped>";
                    }
                    this.f1553h = 0;
                    break;
                case 14:
                    m942C();
                    if (i2 == 0) {
                        this.f1559n[this.f1558m - 1] = "<skipped>";
                    }
                    this.f1553h = 0;
                    break;
                case 16:
                    this.f1549d += this.f1555j;
                    this.f1553h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i2 > 0);
        int[] iArr = this.f1560o;
        int i3 = this.f1558m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m943E(String str) throws C0495d {
        throw new C0495d(str + m949m());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void mo571a() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 3) {
            m953y(1);
            this.f1560o[this.f1558m - 1] = 0;
            this.f1553h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo572b() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 1) {
            m953y(3);
            this.f1553h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m944c() throws C0495d {
        if (this.f1547b) {
            return;
        }
        m943E("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1553h = 0;
        this.f1557l[0] = 8;
        this.f1558m = 1;
        this.f1546a.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x020f, code lost:
    
        if (m948l(r7) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m945d() {
        int iM950s;
        int i2;
        int iM950s2;
        String str;
        String str2;
        int i3;
        char c2;
        char c3;
        int i4;
        int[] iArr = this.f1557l;
        int i5 = this.f1558m - 1;
        int i6 = iArr[i5];
        char[] cArr = this.f1548c;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iM950s3 = m950s(true);
            if (iM950s3 != 44) {
                if (iM950s3 != 59) {
                    if (iM950s3 == 93) {
                        this.f1553h = 4;
                        return 4;
                    }
                    m943E("Unterminated array");
                    throw null;
                }
                m944c();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (iM950s = m950s(true)) != 44) {
                    if (iM950s != 59) {
                        if (iM950s == 125) {
                            this.f1553h = 2;
                            return 2;
                        }
                        m943E("Unterminated object");
                        throw null;
                    }
                    m944c();
                }
                int iM950s4 = m950s(true);
                if (iM950s4 == 34) {
                    this.f1553h = 13;
                    return 13;
                }
                if (iM950s4 == 39) {
                    m944c();
                    this.f1553h = 12;
                    return 12;
                }
                if (iM950s4 == 125) {
                    if (i6 != 5) {
                        this.f1553h = 2;
                        return 2;
                    }
                    m943E("Expected name");
                    throw null;
                }
                m944c();
                this.f1549d--;
                if (m948l((char) iM950s4)) {
                    this.f1553h = 14;
                    return 14;
                }
                m943E("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iM950s5 = m950s(true);
                if (iM950s5 != 58) {
                    if (iM950s5 != 61) {
                        m943E("Expected ':'");
                        throw null;
                    }
                    m944c();
                    if (this.f1549d < this.f1550e || m946g(1)) {
                        int i7 = this.f1549d;
                        if (cArr[i7] == '>') {
                            this.f1549d = i7 + 1;
                        }
                    }
                }
            } else {
                if (i6 != 6) {
                    if (i6 == 7) {
                        i2 = 0;
                        if (m950s(false) == -1) {
                            this.f1553h = 17;
                            return 17;
                        }
                        m944c();
                        this.f1549d--;
                    } else {
                        i2 = 0;
                        if (i6 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    iM950s2 = m950s(true);
                    if (iM950s2 != 34) {
                        this.f1553h = 9;
                        return 9;
                    }
                    if (iM950s2 == 39) {
                        m944c();
                        this.f1553h = 8;
                        return 8;
                    }
                    if (iM950s2 != 44 && iM950s2 != 59) {
                        if (iM950s2 == 91) {
                            this.f1553h = 3;
                            return 3;
                        }
                        if (iM950s2 != 93) {
                            if (iM950s2 == 123) {
                                this.f1553h = 1;
                                return 1;
                            }
                            int i8 = this.f1549d - 1;
                            this.f1549d = i8;
                            char c4 = cArr[i8];
                            if (c4 == 't' || c4 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i3 = 5;
                            } else if (c4 == 'f' || c4 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i3 = 6;
                            } else {
                                if (c4 == 'n' || c4 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i3 = 7;
                                }
                                i3 = i2;
                                if (i3 == 0) {
                                    return i3;
                                }
                                int i9 = this.f1549d;
                                int i10 = this.f1550e;
                                int i11 = i2;
                                int i12 = i11;
                                int i13 = i12;
                                int i14 = i9;
                                boolean z2 = true;
                                long j2 = 0;
                                while (true) {
                                    if (i14 + i12 == i10) {
                                        if (i12 == cArr.length) {
                                            break;
                                        }
                                        if (!m946g(i12 + 1)) {
                                            break;
                                        }
                                        i14 = this.f1549d;
                                        i10 = this.f1550e;
                                        c3 = cArr[i14 + i12];
                                        if (c3 != '+') {
                                        }
                                    } else {
                                        c3 = cArr[i14 + i12];
                                        if (c3 != '+') {
                                            if (i11 != 5) {
                                                break;
                                            }
                                            i11 = 6;
                                            i12++;
                                        } else if (c3 == 'E' || c3 == 'e') {
                                            if (i11 != 2 && i11 != 4) {
                                                break;
                                            }
                                            i11 = 5;
                                            i12++;
                                        } else if (c3 != '-') {
                                            if (c3 == '.') {
                                                if (i11 != 2) {
                                                    break;
                                                }
                                                i11 = 3;
                                                i12++;
                                            } else {
                                                if (c3 < '0' || c3 > '9') {
                                                    break;
                                                }
                                                if (i11 == 1 || i11 == 0) {
                                                    j2 = -(c3 - '0');
                                                    i11 = 2;
                                                } else if (i11 == 2) {
                                                    if (j2 == 0) {
                                                        break;
                                                    }
                                                    long j3 = (10 * j2) - ((long) (c3 - '0'));
                                                    z2 &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                    j2 = j3;
                                                } else if (i11 == 3) {
                                                    i11 = 4;
                                                } else if (i11 == 5 || i11 == 6) {
                                                    i11 = 7;
                                                }
                                                i12++;
                                            }
                                        } else if (i11 == 0) {
                                            i11 = 1;
                                            i13 = 1;
                                            i12++;
                                        } else {
                                            if (i11 != 5) {
                                                break;
                                            }
                                            i11 = 6;
                                            i12++;
                                        }
                                    }
                                    if (i4 == 0) {
                                        return i4;
                                    }
                                    if (!m948l(cArr[this.f1549d])) {
                                        m943E("Expected value");
                                        throw null;
                                    }
                                    m944c();
                                    this.f1553h = 10;
                                    return 10;
                                }
                                int i15 = 2;
                                if (i11 != 2) {
                                    if (i11 != i15 || i11 == 4 || i11 == 7) {
                                        this.f1555j = i12;
                                        i4 = 16;
                                        this.f1553h = 16;
                                    } else {
                                        i4 = 0;
                                    }
                                } else if (!z2 || ((j2 == Long.MIN_VALUE && i13 == 0) || (j2 == 0 && i13 != 0))) {
                                    i15 = 2;
                                    if (i11 != i15) {
                                    }
                                    this.f1555j = i12;
                                    i4 = 16;
                                    this.f1553h = 16;
                                } else {
                                    if (i13 == 0) {
                                        j2 = -j2;
                                    }
                                    this.f1554i = j2;
                                    this.f1549d += i12;
                                    i4 = 15;
                                    this.f1553h = 15;
                                }
                                if (i4 == 0) {
                                }
                            }
                            int length = str.length();
                            int i16 = 1;
                            while (true) {
                                if (i16 < length) {
                                    if ((this.f1549d + i16 >= this.f1550e && !m946g(i16 + 1)) || ((c2 = cArr[this.f1549d + i16]) != str.charAt(i16) && c2 != str2.charAt(i16))) {
                                        break;
                                    }
                                    i16++;
                                } else {
                                    if ((this.f1549d + length < this.f1550e || m946g(length + 1)) && m948l(cArr[this.f1549d + length])) {
                                        break;
                                    }
                                    this.f1549d += length;
                                    this.f1553h = i3;
                                }
                            }
                            if (i3 == 0) {
                            }
                        } else if (i6 == 1) {
                            this.f1553h = 4;
                            return 4;
                        }
                    }
                    if (i6 != 1 && i6 != 2) {
                        m943E("Unexpected value");
                        throw null;
                    }
                    m944c();
                    this.f1549d--;
                    this.f1553h = 7;
                    return 7;
                }
                if (this.f1547b) {
                    m950s(true);
                    int i17 = this.f1549d;
                    this.f1549d = i17 - 1;
                    if (i17 + 4 <= this.f1550e || m946g(5)) {
                        int i18 = this.f1549d;
                        if (cArr[i18] == ')' && cArr[i18 + 1] == ']' && cArr[i18 + 2] == '}' && cArr[i18 + 3] == '\'' && cArr[i18 + 4] == '\n') {
                            this.f1549d = i18 + 5;
                        }
                    }
                }
                this.f1557l[this.f1558m - 1] = 7;
            }
        }
        i2 = 0;
        iM950s2 = m950s(true);
        if (iM950s2 != 34) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void mo573e() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
        int i2 = this.f1558m;
        this.f1558m = i2 - 1;
        int[] iArr = this.f1560o;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f1553h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void mo574f() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
        int i2 = this.f1558m;
        int i3 = i2 - 1;
        this.f1558m = i3;
        this.f1559n[i3] = null;
        int[] iArr = this.f1560o;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f1553h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m946g(int i2) throws IOException {
        int i3;
        int i4;
        int i5 = this.f1552g;
        int i6 = this.f1549d;
        this.f1552g = i5 - i6;
        int i7 = this.f1550e;
        char[] cArr = this.f1548c;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f1550e = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f1550e = 0;
        }
        this.f1549d = 0;
        do {
            int i9 = this.f1550e;
            int i10 = this.f1546a.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f1550e + i10;
            this.f1550e = i3;
            if (this.f1551f == 0 && (i4 = this.f1552g) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f1549d++;
                this.f1552g = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public String mo575h() {
        return m947i(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m947i(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f1558m;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.f1557l[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.f1560o[i2];
                if (z2 && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.f1559n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public String mo576j() {
        return m947i(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public boolean mo577k() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        return (iM945d == 2 || iM945d == 4 || iM945d == 17) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m948l(char c2) throws C0495d {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
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
        m944c();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    final String m949m() {
        return " at line " + (this.f1551f + 1) + " column " + ((this.f1549d - this.f1552g) + 1) + " path " + mo575h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public boolean mo578n() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 5) {
            this.f1553h = 0;
            int[] iArr = this.f1560o;
            int i2 = this.f1558m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iM945d != 6) {
            throw new IllegalStateException("Expected a boolean but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
        this.f1553h = 0;
        int[] iArr2 = this.f1560o;
        int i3 = this.f1558m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public double mo579o() throws C0495d {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 15) {
            this.f1553h = 0;
            int[] iArr = this.f1560o;
            int i2 = this.f1558m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f1554i;
        }
        if (iM945d == 16) {
            this.f1556k = new String(this.f1548c, this.f1549d, this.f1555j);
            this.f1549d += this.f1555j;
        } else if (iM945d == 8 || iM945d == 9) {
            this.f1556k = m951u(iM945d == 8 ? '\'' : '\"');
        } else if (iM945d == 10) {
            this.f1556k = m952w();
        } else if (iM945d != 11) {
            throw new IllegalStateException("Expected a double but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
        this.f1553h = 11;
        double d2 = Double.parseDouble(this.f1556k);
        if (!this.f1547b && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new C0495d("JSON forbids NaN and infinities: " + d2 + m949m());
        }
        this.f1556k = null;
        this.f1553h = 0;
        int[] iArr2 = this.f1560o;
        int i3 = this.f1558m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public int mo580p() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 15) {
            long j2 = this.f1554i;
            int i2 = (int) j2;
            if (j2 != i2) {
                throw new NumberFormatException("Expected an int but was " + this.f1554i + m949m());
            }
            this.f1553h = 0;
            int[] iArr = this.f1560o;
            int i3 = this.f1558m - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (iM945d == 16) {
            this.f1556k = new String(this.f1548c, this.f1549d, this.f1555j);
            this.f1549d += this.f1555j;
        } else {
            if (iM945d != 8 && iM945d != 9 && iM945d != 10) {
                throw new IllegalStateException("Expected an int but was " + AbstractC0174d.m361q(mo585x()) + m949m());
            }
            if (iM945d == 10) {
                this.f1556k = m952w();
            } else {
                this.f1556k = m951u(iM945d == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.f1556k);
                this.f1553h = 0;
                int[] iArr2 = this.f1560o;
                int i5 = this.f1558m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1553h = 11;
        double d2 = Double.parseDouble(this.f1556k);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f1556k + m949m());
        }
        this.f1556k = null;
        this.f1553h = 0;
        int[] iArr3 = this.f1560o;
        int i7 = this.f1558m - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public long mo581q() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 15) {
            this.f1553h = 0;
            int[] iArr = this.f1560o;
            int i2 = this.f1558m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f1554i;
        }
        if (iM945d == 16) {
            this.f1556k = new String(this.f1548c, this.f1549d, this.f1555j);
            this.f1549d += this.f1555j;
        } else {
            if (iM945d != 8 && iM945d != 9 && iM945d != 10) {
                throw new IllegalStateException("Expected a long but was " + AbstractC0174d.m361q(mo585x()) + m949m());
            }
            if (iM945d == 10) {
                this.f1556k = m952w();
            } else {
                this.f1556k = m951u(iM945d == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.f1556k);
                this.f1553h = 0;
                int[] iArr2 = this.f1560o;
                int i3 = this.f1558m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1553h = 11;
        double d2 = Double.parseDouble(this.f1556k);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f1556k + m949m());
        }
        this.f1556k = null;
        this.f1553h = 0;
        int[] iArr3 = this.f1560o;
        int i4 = this.f1558m - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public String mo582r() {
        String strM951u;
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 14) {
            strM951u = m952w();
        } else if (iM945d == 12) {
            strM951u = m951u('\'');
        } else {
            if (iM945d != 13) {
                throw new IllegalStateException("Expected a name but was " + AbstractC0174d.m361q(mo585x()) + m949m());
            }
            strM951u = m951u('\"');
        }
        this.f1553h = 0;
        this.f1559n[this.f1558m - 1] = strM951u;
        return strM951u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m950s(boolean z2) throws IOException {
        int i2 = this.f1549d;
        int i3 = this.f1550e;
        while (true) {
            if (i2 == i3) {
                this.f1549d = i2;
                if (!m946g(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m949m());
                }
                i2 = this.f1549d;
                i3 = this.f1550e;
            }
            int i4 = i2 + 1;
            char[] cArr = this.f1548c;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f1551f++;
                this.f1552g = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f1549d = i4;
                    if (i4 == i3) {
                        this.f1549d = i2;
                        boolean zM946g = m946g(2);
                        this.f1549d++;
                        if (!zM946g) {
                            break;
                        }
                        break;
                        break;
                    }
                    m944c();
                    int i5 = this.f1549d;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f1549d = i5 + 1;
                        while (true) {
                            if (this.f1549d + 2 > this.f1550e && !m946g(2)) {
                                m943E("Unterminated comment");
                                throw null;
                            }
                            int i6 = this.f1549d;
                            if (cArr[i6] != '\n') {
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (cArr[this.f1549d + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                }
                                i2 = this.f1549d + 2;
                                i3 = this.f1550e;
                                break;
                            }
                            this.f1551f++;
                            this.f1552g = i6 + 1;
                            this.f1549d++;
                        }
                    } else {
                        if (c3 != '/') {
                            break;
                        }
                        this.f1549d = i5 + 1;
                        m941B();
                        i2 = this.f1549d;
                        i3 = this.f1550e;
                    }
                } else {
                    if (c2 != '#') {
                        this.f1549d = i4;
                        return c2;
                    }
                    this.f1549d = i4;
                    m944c();
                    m941B();
                    i2 = this.f1549d;
                    i3 = this.f1550e;
                }
            }
            i2 = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void mo583t() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d != 7) {
            throw new IllegalStateException("Expected null but was " + AbstractC0174d.m361q(mo585x()) + m949m());
        }
        this.f1553h = 0;
        int[] iArr = this.f1560o;
        int i2 = this.f1558m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + m949m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f1549d = r8;
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
    
        r1.append(r5, r3, r2 - r3);
        r10.f1549d = r2;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m951u(char c2) throws C0495d {
        char[] cArr;
        int i2;
        StringBuilder sb = null;
        do {
            int i3 = this.f1549d;
            int i4 = this.f1550e;
            while (true) {
                int i5 = i4;
                int i6 = i3;
                while (true) {
                    cArr = this.f1548c;
                    if (i3 >= i5) {
                        break;
                    }
                    int i7 = i3 + 1;
                    char c3 = cArr[i3];
                    if (c3 == c2) {
                        this.f1549d = i7;
                        int i8 = (i7 - i6) - 1;
                        if (sb == null) {
                            return new String(cArr, i6, i8);
                        }
                        sb.append(cArr, i6, i8);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        break;
                    }
                    if (c3 == '\n') {
                        this.f1551f++;
                        this.f1552g = i7;
                    }
                    i3 = i7;
                }
                sb.append(cArr, i6, i2);
                sb.append(m954z());
                i3 = this.f1549d;
                i4 = this.f1550e;
            }
        } while (m946g(1));
        m943E("Unterminated string");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public String mo584v() {
        String str;
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        if (iM945d == 10) {
            str = m952w();
        } else if (iM945d == 8) {
            str = m951u('\'');
        } else if (iM945d == 9) {
            str = m951u('\"');
        } else if (iM945d == 11) {
            str = this.f1556k;
            this.f1556k = null;
        } else if (iM945d == 15) {
            str = Long.toString(this.f1554i);
        } else {
            if (iM945d != 16) {
                throw new IllegalStateException("Expected a string but was " + AbstractC0174d.m361q(mo585x()) + m949m());
            }
            str = new String(this.f1548c, this.f1549d, this.f1555j);
            this.f1549d += this.f1555j;
        }
        this.f1553h = 0;
        int[] iArr = this.f1560o;
        int i2 = this.f1558m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m944c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m952w() throws C0495d {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i2 = 0;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f1549d;
                int i5 = i4 + i3;
                int i6 = this.f1550e;
                cArr = this.f1548c;
                if (i5 < i6) {
                    char c2 = cArr[i4 + i3];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i3 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(cArr, this.f1549d, i3);
                    this.f1549d += i3;
                } else if (m946g(i3 + 1)) {
                }
            }
            i2 = i3;
            if (sb != null) {
                string = new String(cArr, this.f1549d, i2);
            } else {
                sb.append(cArr, this.f1549d, i2);
                string = sb.toString();
            }
            this.f1549d += i2;
            return string;
        } while (m946g(1));
        if (sb != null) {
        }
        this.f1549d += i2;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public int mo585x() {
        int iM945d = this.f1553h;
        if (iM945d == 0) {
            iM945d = m945d();
        }
        switch (iM945d) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m953y(int i2) {
        int i3 = this.f1558m;
        int[] iArr = this.f1557l;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f1557l = Arrays.copyOf(iArr, i4);
            this.f1560o = Arrays.copyOf(this.f1560o, i4);
            this.f1559n = (String[]) Arrays.copyOf(this.f1559n, i4);
        }
        int[] iArr2 = this.f1557l;
        int i5 = this.f1558m;
        this.f1558m = i5 + 1;
        iArr2[i5] = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final char m954z() throws C0495d {
        int i2;
        if (this.f1549d == this.f1550e && !m946g(1)) {
            m943E("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.f1549d;
        int i4 = i3 + 1;
        this.f1549d = i4;
        char[] cArr = this.f1548c;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f1551f++;
            this.f1552g = i4;
            return c2;
        }
        if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            m943E("Invalid escape sequence");
            throw null;
        }
        if (i3 + 5 > this.f1550e && !m946g(4)) {
            m943E("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.f1549d;
        int i6 = i5 + 4;
        char c3 = 0;
        while (i5 < i6) {
            char c4 = cArr[i5];
            char c5 = (char) (c3 << 4);
            if (c4 >= '0' && c4 <= '9') {
                i2 = c4 - '0';
            } else if (c4 >= 'a' && c4 <= 'f') {
                i2 = c4 - 'W';
            } else {
                if (c4 < 'A' || c4 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f1549d, 4)));
                }
                i2 = c4 - '7';
            }
            c3 = (char) (i2 + c5);
            i5++;
        }
        this.f1549d += 4;
        return c3;
    }
}
