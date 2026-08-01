package p258w2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;
import p191k4.C2475a;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: w2.a */
/* JADX INFO: loaded from: classes.dex */
public class C3390a implements Closeable {

    /* JADX INFO: renamed from: d */
    public final Reader f10584d;

    /* JADX INFO: renamed from: k */
    public long f10591k;

    /* JADX INFO: renamed from: l */
    public int f10592l;

    /* JADX INFO: renamed from: m */
    public String f10593m;

    /* JADX INFO: renamed from: n */
    public int[] f10594n;

    /* JADX INFO: renamed from: p */
    public String[] f10596p;

    /* JADX INFO: renamed from: q */
    public int[] f10597q;

    /* JADX INFO: renamed from: r */
    public int f10598r = 2;

    /* JADX INFO: renamed from: e */
    public final char[] f10585e = new char[1024];

    /* JADX INFO: renamed from: f */
    public int f10586f = 0;

    /* JADX INFO: renamed from: g */
    public int f10587g = 0;

    /* JADX INFO: renamed from: h */
    public int f10588h = 0;

    /* JADX INFO: renamed from: i */
    public int f10589i = 0;

    /* JADX INFO: renamed from: j */
    public int f10590j = 0;

    /* JADX INFO: renamed from: o */
    public int f10595o = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2475a.f7965e = new C2475a(15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3390a(Reader reader) {
        int[] iArr = new int[32];
        this.f10594n = iArr;
        iArr[0] = 6;
        this.f10596p = new String[32];
        this.f10597q = new int[32];
        this.f10584d = reader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final int m5622A() throws IOException {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f == 15) {
            long j5 = this.f10591k;
            int i5 = (int) j5;
            if (j5 != i5) {
                throw new NumberFormatException("Expected an int but was " + this.f10591k + m5649t());
            }
            this.f10590j = 0;
            int[] iArr = this.f10597q;
            int i6 = this.f10595o - 1;
            iArr[i6] = iArr[i6] + 1;
            return i5;
        }
        if (iM5642f == 16) {
            this.f10593m = new String(this.f10585e, this.f10586f, this.f10592l);
            this.f10586f += this.f10592l;
        } else {
            if (iM5642f != 8 && iM5642f != 9 && iM5642f != 10) {
                throw m5638R("an int");
            }
            if (iM5642f == 10) {
                this.f10593m = m5629I();
            } else {
                this.f10593m = m5627G(iM5642f == 8 ? '\'' : '\"');
            }
            try {
                int i7 = Integer.parseInt(this.f10593m);
                this.f10590j = 0;
                int[] iArr2 = this.f10597q;
                int i8 = this.f10595o - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return i7;
            } catch (NumberFormatException unused) {
            }
        }
        this.f10590j = 11;
        double d5 = Double.parseDouble(this.f10593m);
        int i9 = (int) d5;
        if (i9 != d5) {
            throw new NumberFormatException("Expected an int but was " + this.f10593m + m5649t());
        }
        this.f10593m = null;
        this.f10590j = 0;
        int[] iArr3 = this.f10597q;
        int i10 = this.f10595o - 1;
        iArr3[i10] = iArr3[i10] + 1;
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final long m5623C() throws IOException {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f == 15) {
            this.f10590j = 0;
            int[] iArr = this.f10597q;
            int i5 = this.f10595o - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f10591k;
        }
        if (iM5642f == 16) {
            this.f10593m = new String(this.f10585e, this.f10586f, this.f10592l);
            this.f10586f += this.f10592l;
        } else {
            if (iM5642f != 8 && iM5642f != 9 && iM5642f != 10) {
                throw m5638R("a long");
            }
            if (iM5642f == 10) {
                this.f10593m = m5629I();
            } else {
                this.f10593m = m5627G(iM5642f == 8 ? '\'' : '\"');
            }
            try {
                long j5 = Long.parseLong(this.f10593m);
                this.f10590j = 0;
                int[] iArr2 = this.f10597q;
                int i6 = this.f10595o - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return j5;
            } catch (NumberFormatException unused) {
            }
        }
        this.f10590j = 11;
        double d5 = Double.parseDouble(this.f10593m);
        long j6 = (long) d5;
        if (j6 != d5) {
            throw new NumberFormatException("Expected a long but was " + this.f10593m + m5649t());
        }
        this.f10593m = null;
        this.f10590j = 0;
        int[] iArr3 = this.f10597q;
        int i7 = this.f10595o - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final String m5624D() throws IOException {
        String strM5627G;
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f == 14) {
            strM5627G = m5629I();
        } else if (iM5642f == 12) {
            strM5627G = m5627G('\'');
        } else {
            if (iM5642f != 13) {
                throw m5638R("a name");
            }
            strM5627G = m5627G('\"');
        }
        this.f10590j = 0;
        this.f10596p[this.f10595o - 1] = strM5627G;
        return strM5627G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m5625E(boolean z5) throws IOException {
        int i5 = this.f10586f;
        int i6 = this.f10587g;
        while (true) {
            if (i5 == i6) {
                this.f10586f = i5;
                if (!m5645l(1)) {
                    if (!z5) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m5649t());
                }
                i5 = this.f10586f;
                i6 = this.f10587g;
            }
            int i7 = i5 + 1;
            char[] cArr = this.f10585e;
            char c5 = cArr[i5];
            if (c5 == '\n') {
                this.f10588h++;
                this.f10589i = i7;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 == '/') {
                    this.f10586f = i7;
                    if (i7 == i6) {
                        this.f10586f = i5;
                        boolean zM5645l = m5645l(2);
                        this.f10586f++;
                        if (!zM5645l) {
                            break;
                        }
                        break;
                        break;
                    }
                    m5641d();
                    int i8 = this.f10586f;
                    char c6 = cArr[i8];
                    if (c6 == '*') {
                        this.f10586f = i8 + 1;
                        while (true) {
                            if (this.f10586f + 2 > this.f10587g && !m5645l(2)) {
                                m5637Q("Unterminated comment");
                                throw null;
                            }
                            int i9 = this.f10586f;
                            if (cArr[i9] != '\n') {
                                for (int i10 = 0; i10 < 2; i10++) {
                                    if (cArr[this.f10586f + i10] != "*/".charAt(i10)) {
                                        break;
                                    }
                                }
                                i5 = this.f10586f + 2;
                                i6 = this.f10587g;
                                break;
                            }
                            this.f10588h++;
                            this.f10589i = i9 + 1;
                            this.f10586f++;
                        }
                    } else {
                        if (c6 != '/') {
                            break;
                        }
                        this.f10586f = i8 + 1;
                        m5634N();
                        i5 = this.f10586f;
                        i6 = this.f10587g;
                    }
                } else {
                    if (c5 != '#') {
                        this.f10586f = i7;
                        return c5;
                    }
                    this.f10586f = i7;
                    m5641d();
                    m5634N();
                    i5 = this.f10586f;
                    i6 = this.f10587g;
                }
            }
            i5 = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m5626F() {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f != 7) {
            throw m5638R("null");
        }
        this.f10590j = 0;
        int[] iArr = this.f10597q;
        int i5 = this.f10595o - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f10586f = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f10586f = r2;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5627G(char c5) throws C3392c {
        char[] cArr;
        int i5;
        StringBuilder sb = null;
        do {
            int i6 = this.f10586f;
            int i7 = this.f10587g;
            while (true) {
                int i8 = i7;
                int i9 = i6;
                while (true) {
                    cArr = this.f10585e;
                    if (i6 >= i8) {
                        break;
                    }
                    int i10 = i6 + 1;
                    char c6 = cArr[i6];
                    if (this.f10598r == 3 && c6 < ' ') {
                        m5637Q("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c6 == c5) {
                        this.f10586f = i10;
                        int i11 = (i10 - i9) - 1;
                        if (sb == null) {
                            return new String(cArr, i9, i11);
                        }
                        sb.append(cArr, i9, i11);
                        return sb.toString();
                    }
                    if (c6 == '\\') {
                        break;
                    }
                    if (c6 == '\n') {
                        this.f10588h++;
                        this.f10589i = i10;
                    }
                    i6 = i10;
                }
                sb.append(cArr, i9, i5);
                sb.append(m5632L());
                i6 = this.f10586f;
                i7 = this.f10587g;
            }
        } while (m5645l(1));
        m5637Q("Unterminated string");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final String m5628H() throws IOException {
        String str;
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f == 10) {
            str = m5629I();
        } else if (iM5642f == 8) {
            str = m5627G('\'');
        } else if (iM5642f == 9) {
            str = m5627G('\"');
        } else if (iM5642f == 11) {
            str = this.f10593m;
            this.f10593m = null;
        } else if (iM5642f == 15) {
            str = Long.toString(this.f10591k);
        } else {
            if (iM5642f != 16) {
                throw m5638R("a string");
            }
            str = new String(this.f10585e, this.f10586f, this.f10592l);
            this.f10586f += this.f10592l;
        }
        this.f10590j = 0;
        int[] iArr = this.f10597q;
        int i5 = this.f10595o - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m5641d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5629I() throws C3392c {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i5 = 0;
        do {
            int i6 = 0;
            while (true) {
                int i7 = this.f10586f;
                int i8 = i7 + i6;
                int i9 = this.f10587g;
                cArr = this.f10585e;
                if (i8 < i9) {
                    char c5 = cArr[i7 + i6];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i6++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i6 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i6, 16));
                    }
                    sb.append(cArr, this.f10586f, i6);
                    this.f10586f += i6;
                } else if (m5645l(i6 + 1)) {
                }
            }
            i5 = i6;
            if (sb != null) {
                string = new String(cArr, this.f10586f, i5);
            } else {
                sb.append(cArr, this.f10586f, i5);
                string = sb.toString();
            }
            this.f10586f += i5;
            return string;
        } while (m5645l(1));
        if (sb != null) {
        }
        this.f10586f += i5;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final int m5630J() {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        switch (iM5642f) {
            case BuildConfig.VERSION_CODE /* 1 */:
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
    /* JADX INFO: renamed from: K */
    public final void m5631K(int i5) throws C3392c {
        int i6 = this.f10595o;
        if (i6 - 1 >= 255) {
            throw new C3392c("Nesting limit 255 reached" + m5649t());
        }
        int[] iArr = this.f10594n;
        if (i6 == iArr.length) {
            int i7 = i6 * 2;
            this.f10594n = Arrays.copyOf(iArr, i7);
            this.f10597q = Arrays.copyOf(this.f10597q, i7);
            this.f10596p = (String[]) Arrays.copyOf(this.f10596p, i7);
        }
        int[] iArr2 = this.f10594n;
        int i8 = this.f10595o;
        this.f10595o = i8 + 1;
        iArr2[i8] = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final char m5632L() throws C3392c {
        int i5;
        if (this.f10586f == this.f10587g && !m5645l(1)) {
            m5637Q("Unterminated escape sequence");
            throw null;
        }
        int i6 = this.f10586f;
        int i7 = i6 + 1;
        this.f10586f = i7;
        char[] cArr = this.f10585e;
        char c5 = cArr[i6];
        if (c5 != '\n') {
            if (c5 != '\"') {
                if (c5 != '\'') {
                    if (c5 != '/' && c5 != '\\') {
                        if (c5 == 'b') {
                            return '\b';
                        }
                        if (c5 == 'f') {
                            return '\f';
                        }
                        if (c5 == 'n') {
                            return '\n';
                        }
                        if (c5 == 'r') {
                            return '\r';
                        }
                        if (c5 == 't') {
                            return '\t';
                        }
                        if (c5 != 'u') {
                            m5637Q("Invalid escape sequence");
                            throw null;
                        }
                        if (i6 + 5 > this.f10587g && !m5645l(4)) {
                            m5637Q("Unterminated escape sequence");
                            throw null;
                        }
                        int i8 = this.f10586f;
                        int i9 = i8 + 4;
                        int i10 = 0;
                        while (i8 < i9) {
                            char c6 = cArr[i8];
                            int i11 = i10 << 4;
                            if (c6 >= '0' && c6 <= '9') {
                                i5 = c6 - '0';
                            } else if (c6 >= 'a' && c6 <= 'f') {
                                i5 = c6 - 'W';
                            } else {
                                if (c6 < 'A' || c6 > 'F') {
                                    m5637Q("Malformed Unicode escape \\u".concat(new String(cArr, this.f10586f, 4)));
                                    throw null;
                                }
                                i5 = c6 - '7';
                            }
                            i10 = i5 + i11;
                            i8++;
                        }
                        this.f10586f += 4;
                        return (char) i10;
                    }
                }
            }
            return c5;
        }
        if (this.f10598r == 3) {
            m5637Q("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f10588h++;
        this.f10589i = i7;
        if (this.f10598r == 3) {
            m5637Q("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m5633M(char c5) throws C3392c {
        do {
            int i5 = this.f10586f;
            int i6 = this.f10587g;
            while (i5 < i6) {
                int i7 = i5 + 1;
                char c6 = this.f10585e[i5];
                if (c6 == c5) {
                    this.f10586f = i7;
                    return;
                }
                if (c6 == '\\') {
                    this.f10586f = i7;
                    m5632L();
                    i5 = this.f10586f;
                    i6 = this.f10587g;
                } else {
                    if (c6 == '\n') {
                        this.f10588h++;
                        this.f10589i = i7;
                    }
                    i5 = i7;
                }
            }
            this.f10586f = i5;
        } while (m5645l(1));
        m5637Q("Unterminated string");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m5634N() {
        char c5;
        do {
            if (this.f10586f >= this.f10587g && !m5645l(1)) {
                return;
            }
            int i5 = this.f10586f;
            int i6 = i5 + 1;
            this.f10586f = i6;
            c5 = this.f10585e[i5];
            if (c5 == '\n') {
                this.f10588h++;
                this.f10589i = i6;
                return;
            }
        } while (c5 != '\r');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m5641d();
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5635O() throws C3392c {
        do {
            int i5 = 0;
            while (true) {
                int i6 = this.f10586f;
                if (i6 + i5 < this.f10587g) {
                    char c5 = this.f10585e[i6 + i5];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i5++;
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
                    this.f10586f = i6 + i5;
                }
            }
            this.f10586f += i5;
            return;
        } while (m5645l(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: P */
    public final void m5636P() throws IOException {
        int i5 = 0;
        do {
            int iM5642f = this.f10590j;
            if (iM5642f == 0) {
                iM5642f = m5642f();
            }
            switch (iM5642f) {
                case BuildConfig.VERSION_CODE /* 1 */:
                    m5631K(3);
                    i5++;
                    this.f10590j = 0;
                    break;
                case 2:
                    if (i5 == 0) {
                        this.f10596p[this.f10595o - 1] = null;
                    }
                    this.f10595o--;
                    i5--;
                    this.f10590j = 0;
                    break;
                case 3:
                    m5631K(1);
                    i5++;
                    this.f10590j = 0;
                    break;
                case 4:
                    this.f10595o--;
                    i5--;
                    this.f10590j = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f10590j = 0;
                    break;
                case 8:
                    m5633M('\'');
                    this.f10590j = 0;
                    break;
                case 9:
                    m5633M('\"');
                    this.f10590j = 0;
                    break;
                case 10:
                    m5635O();
                    this.f10590j = 0;
                    break;
                case 12:
                    m5633M('\'');
                    if (i5 == 0) {
                        this.f10596p[this.f10595o - 1] = "<skipped>";
                    }
                    this.f10590j = 0;
                    break;
                case 13:
                    m5633M('\"');
                    if (i5 == 0) {
                        this.f10596p[this.f10595o - 1] = "<skipped>";
                    }
                    this.f10590j = 0;
                    break;
                case 14:
                    m5635O();
                    if (i5 == 0) {
                        this.f10596p[this.f10595o - 1] = "<skipped>";
                    }
                    this.f10590j = 0;
                    break;
                case 16:
                    this.f10586f += this.f10592l;
                    this.f10590j = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i5 > 0);
        int[] iArr = this.f10597q;
        int i6 = this.f10595o - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m5637Q(String str) throws C3392c {
        throw new C3392c(str + m5649t() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final IllegalStateException m5638R(String str) {
        return new IllegalStateException("Expected " + str + " but was " + AbstractC3202a.m5469d(m5630J()) + m5649t() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(m5630J() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5639b() {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f != 3) {
            throw m5638R("BEGIN_ARRAY");
        }
        m5631K(1);
        this.f10597q[this.f10595o - 1] = 0;
        this.f10590j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5640c() {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f != 1) {
            throw m5638R("BEGIN_OBJECT");
        }
        m5631K(3);
        this.f10590j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10590j = 0;
        this.f10594n[0] = 8;
        this.f10595o = 1;
        this.f10584d.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5641d() throws C3392c {
        if (this.f10598r == 1) {
            return;
        }
        m5637Q("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
    
        if (m5648r(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m5642f() throws IOException {
        int iM5625E;
        int i5;
        int iM5625E2;
        String str;
        String str2;
        int i6;
        char c5;
        char c6;
        int i7;
        int[] iArr = this.f10594n;
        int i8 = this.f10595o - 1;
        int i9 = iArr[i8];
        char[] cArr = this.f10585e;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iM5625E3 = m5625E(true);
            if (iM5625E3 != 44) {
                if (iM5625E3 != 59) {
                    if (iM5625E3 == 93) {
                        this.f10590j = 4;
                        return 4;
                    }
                    m5637Q("Unterminated array");
                    throw null;
                }
                m5641d();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iM5625E = m5625E(true)) != 44) {
                    if (iM5625E != 59) {
                        if (iM5625E == 125) {
                            this.f10590j = 2;
                            return 2;
                        }
                        m5637Q("Unterminated object");
                        throw null;
                    }
                    m5641d();
                }
                int iM5625E4 = m5625E(true);
                if (iM5625E4 == 34) {
                    this.f10590j = 13;
                    return 13;
                }
                if (iM5625E4 == 39) {
                    m5641d();
                    this.f10590j = 12;
                    return 12;
                }
                if (iM5625E4 == 125) {
                    if (i9 != 5) {
                        this.f10590j = 2;
                        return 2;
                    }
                    m5637Q("Expected name");
                    throw null;
                }
                m5641d();
                this.f10586f--;
                if (m5648r((char) iM5625E4)) {
                    this.f10590j = 14;
                    return 14;
                }
                m5637Q("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iM5625E5 = m5625E(true);
                if (iM5625E5 != 58) {
                    if (iM5625E5 != 61) {
                        m5637Q("Expected ':'");
                        throw null;
                    }
                    m5641d();
                    if (this.f10586f < this.f10587g || m5645l(1)) {
                        int i10 = this.f10586f;
                        if (cArr[i10] == '>') {
                            this.f10586f = i10 + 1;
                        }
                    }
                }
            } else {
                if (i9 != 6) {
                    if (i9 == 7) {
                        i5 = 0;
                        if (m5625E(false) == -1) {
                            this.f10590j = 17;
                            return 17;
                        }
                        m5641d();
                        this.f10586f--;
                    } else {
                        i5 = 0;
                        if (i9 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    iM5625E2 = m5625E(true);
                    if (iM5625E2 != 34) {
                        this.f10590j = 9;
                        return 9;
                    }
                    if (iM5625E2 == 39) {
                        m5641d();
                        this.f10590j = 8;
                        return 8;
                    }
                    if (iM5625E2 != 44 && iM5625E2 != 59) {
                        if (iM5625E2 == 91) {
                            this.f10590j = 3;
                            return 3;
                        }
                        if (iM5625E2 != 93) {
                            if (iM5625E2 == 123) {
                                this.f10590j = 1;
                                return 1;
                            }
                            int i11 = this.f10586f - 1;
                            this.f10586f = i11;
                            char c7 = cArr[i11];
                            if (c7 == 't' || c7 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i6 = 5;
                            } else if (c7 == 'f' || c7 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i6 = 6;
                            } else {
                                if (c7 == 'n' || c7 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i6 = 7;
                                }
                                i6 = i5;
                                if (i6 == 0) {
                                    return i6;
                                }
                                int i12 = this.f10586f;
                                int i13 = this.f10587g;
                                int i14 = i5;
                                int i15 = i14;
                                int i16 = i15;
                                int i17 = i12;
                                boolean z5 = true;
                                long j5 = 0;
                                while (true) {
                                    if (i17 + i15 == i13) {
                                        if (i15 == cArr.length) {
                                            break;
                                        }
                                        if (!m5645l(i15 + 1)) {
                                            break;
                                        }
                                        i17 = this.f10586f;
                                        i13 = this.f10587g;
                                        c6 = cArr[i17 + i15];
                                        if (c6 != '+') {
                                        }
                                    } else {
                                        c6 = cArr[i17 + i15];
                                        if (c6 != '+') {
                                            if (i14 != 5) {
                                                break;
                                            }
                                            i14 = 6;
                                            i15++;
                                        } else if (c6 == 'E' || c6 == 'e') {
                                            if (i14 != 2 && i14 != 4) {
                                                break;
                                            }
                                            i14 = 5;
                                            i15++;
                                        } else if (c6 != '-') {
                                            if (c6 == '.') {
                                                if (i14 != 2) {
                                                    break;
                                                }
                                                i14 = 3;
                                                i15++;
                                            } else {
                                                if (c6 < '0' || c6 > '9') {
                                                    break;
                                                }
                                                if (i14 == 1 || i14 == 0) {
                                                    j5 = -(c6 - '0');
                                                    i14 = 2;
                                                } else if (i14 == 2) {
                                                    if (j5 == 0) {
                                                        break;
                                                    }
                                                    long j6 = (10 * j5) - ((long) (c6 - '0'));
                                                    z5 &= j5 > -922337203685477580L || (j5 == -922337203685477580L && j6 < j5);
                                                    j5 = j6;
                                                } else if (i14 == 3) {
                                                    i14 = 4;
                                                } else if (i14 == 5 || i14 == 6) {
                                                    i14 = 7;
                                                }
                                                i15++;
                                            }
                                        } else if (i14 == 0) {
                                            i14 = 1;
                                            i16 = 1;
                                            i15++;
                                        } else {
                                            if (i14 != 5) {
                                                break;
                                            }
                                            i14 = 6;
                                            i15++;
                                        }
                                    }
                                    if (i7 == 0) {
                                        return i7;
                                    }
                                    if (!m5648r(cArr[this.f10586f])) {
                                        m5637Q("Expected value");
                                        throw null;
                                    }
                                    m5641d();
                                    this.f10590j = 10;
                                    return 10;
                                }
                                int i18 = 2;
                                if (i14 != 2) {
                                    if (i14 != i18 || i14 == 4 || i14 == 7) {
                                        this.f10592l = i15;
                                        i7 = 16;
                                        this.f10590j = 16;
                                    } else {
                                        i7 = 0;
                                    }
                                } else if (!z5 || ((j5 == Long.MIN_VALUE && i16 == 0) || (j5 == 0 && i16 != 0))) {
                                    i18 = 2;
                                    if (i14 != i18) {
                                    }
                                    this.f10592l = i15;
                                    i7 = 16;
                                    this.f10590j = 16;
                                } else {
                                    if (i16 == 0) {
                                        j5 = -j5;
                                    }
                                    this.f10591k = j5;
                                    this.f10586f += i15;
                                    i7 = 15;
                                    this.f10590j = 15;
                                }
                                if (i7 == 0) {
                                }
                            }
                            int i19 = this.f10598r != 3 ? 1 : i5;
                            int length = str.length();
                            int i20 = i5;
                            while (true) {
                                if (i20 < length) {
                                    if ((this.f10586f + i20 >= this.f10587g && !m5645l(i20 + 1)) || ((c5 = cArr[this.f10586f + i20]) != str.charAt(i20) && (i19 == 0 || c5 != str2.charAt(i20)))) {
                                        break;
                                    }
                                    i20++;
                                } else {
                                    if ((this.f10586f + length < this.f10587g || m5645l(length + 1)) && m5648r(cArr[this.f10586f + length])) {
                                        break;
                                    }
                                    this.f10586f += length;
                                    this.f10590j = i6;
                                }
                            }
                            i6 = i5;
                            if (i6 == 0) {
                            }
                        } else if (i9 == 1) {
                            this.f10590j = 4;
                            return 4;
                        }
                    }
                    if (i9 != 1 && i9 != 2) {
                        m5637Q("Unexpected value");
                        throw null;
                    }
                    m5641d();
                    this.f10586f--;
                    this.f10590j = 7;
                    return 7;
                }
                if (this.f10598r == 1) {
                    m5625E(true);
                    int i21 = this.f10586f;
                    this.f10586f = i21 - 1;
                    if (i21 + 4 <= this.f10587g || m5645l(5)) {
                        int i22 = this.f10586f;
                        if (cArr[i22] == ')' && cArr[i22 + 1] == ']' && cArr[i22 + 2] == '}' && cArr[i22 + 3] == '\'' && cArr[i22 + 4] == '\n') {
                            this.f10586f = i22 + 5;
                        }
                    }
                }
                this.f10594n[this.f10595o - 1] = 7;
            }
        }
        i5 = 0;
        iM5625E2 = m5625E(true);
        if (iM5625E2 != 34) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m5643h() {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f != 4) {
            throw m5638R("END_ARRAY");
        }
        int i5 = this.f10595o;
        this.f10595o = i5 - 1;
        int[] iArr = this.f10597q;
        int i6 = i5 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f10590j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m5644j() {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f != 2) {
            throw m5638R("END_OBJECT");
        }
        int i5 = this.f10595o;
        int i6 = i5 - 1;
        this.f10595o = i6;
        this.f10596p[i6] = null;
        int[] iArr = this.f10597q;
        int i7 = i5 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.f10590j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m5645l(int i5) throws IOException {
        int i6;
        int i7;
        int i8 = this.f10589i;
        int i9 = this.f10586f;
        this.f10589i = i8 - i9;
        int i10 = this.f10587g;
        char[] cArr = this.f10585e;
        if (i10 != i9) {
            int i11 = i10 - i9;
            this.f10587g = i11;
            System.arraycopy(cArr, i9, cArr, 0, i11);
        } else {
            this.f10587g = 0;
        }
        this.f10586f = 0;
        do {
            int i12 = this.f10587g;
            int i13 = this.f10584d.read(cArr, i12, cArr.length - i12);
            if (i13 == -1) {
                return false;
            }
            i6 = this.f10587g + i13;
            this.f10587g = i6;
            if (this.f10588h == 0 && (i7 = this.f10589i) == 0 && i6 > 0 && cArr[0] == 65279) {
                this.f10586f++;
                this.f10589i = i7 + 1;
                i5++;
            }
        } while (i6 < i5);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m5646m(boolean z5) {
        StringBuilder sb = new StringBuilder("$");
        int i5 = 0;
        while (true) {
            int i6 = this.f10595o;
            if (i5 >= i6) {
                return sb.toString();
            }
            int i7 = this.f10594n[i5];
            switch (i7) {
                case BuildConfig.VERSION_CODE /* 1 */:
                case 2:
                    int i8 = this.f10597q[i5];
                    if (z5 && i8 > 0 && i5 == i6 - 1) {
                        i8--;
                    }
                    sb.append('[');
                    sb.append(i8);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f10596p[i5];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC0231b.m398i("Unknown scope value: ", i7));
            }
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m5647n() throws IOException {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        return (iM5642f == 2 || iM5642f == 4 || iM5642f == 17) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m5648r(char c5) throws C3392c {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
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
        m5641d();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final String m5649t() {
        return " at line " + (this.f10588h + 1) + " column " + ((this.f10586f - this.f10589i) + 1) + " path " + m5646m(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C3390a.class.getSimpleName() + m5649t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m5650w() throws IOException {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f == 5) {
            this.f10590j = 0;
            int[] iArr = this.f10597q;
            int i5 = this.f10595o - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (iM5642f != 6) {
            throw m5638R("a boolean");
        }
        this.f10590j = 0;
        int[] iArr2 = this.f10597q;
        int i6 = this.f10595o - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final double m5651x() throws IOException {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        if (iM5642f == 15) {
            this.f10590j = 0;
            int[] iArr = this.f10597q;
            int i5 = this.f10595o - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f10591k;
        }
        if (iM5642f == 16) {
            this.f10593m = new String(this.f10585e, this.f10586f, this.f10592l);
            this.f10586f += this.f10592l;
        } else if (iM5642f == 8 || iM5642f == 9) {
            this.f10593m = m5627G(iM5642f == 8 ? '\'' : '\"');
        } else if (iM5642f == 10) {
            this.f10593m = m5629I();
        } else if (iM5642f != 11) {
            throw m5638R("a double");
        }
        this.f10590j = 11;
        double d5 = Double.parseDouble(this.f10593m);
        if (this.f10598r != 1 && (Double.isNaN(d5) || Double.isInfinite(d5))) {
            m5637Q("JSON forbids NaN and infinities: " + d5);
            throw null;
        }
        this.f10593m = null;
        this.f10590j = 0;
        int[] iArr2 = this.f10597q;
        int i6 = this.f10595o - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return d5;
    }
}
