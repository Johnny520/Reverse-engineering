package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class l41 implements Closeable {
    public final Reader h;
    public long o;
    public int p;
    public String q;
    public int[] r;
    public String[] t;
    public int[] u;
    public int v = 2;
    public final char[] i = new char[1024];
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int s = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        eb.i = new eb(29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l41(Reader reader) {
        int[] iArr = new int[32];
        this.r = iArr;
        iArr[0] = 6;
        this.t = new String[32];
        this.u = new int[32];
        this.h = reader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long A() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.n = 0;
            int[] iArr = this.u;
            int i = this.s - 1;
            iArr[i] = iArr[i] + 1;
            return this.o;
        }
        if (iG == 16) {
            this.q = new String(this.i, this.j, this.p);
            this.j += this.p;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw R("a long");
            }
            if (iG == 10) {
                this.q = H();
            } else {
                this.q = F(iG == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.q);
                this.n = 0;
                int[] iArr2 = this.u;
                int i2 = this.s - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.n = 11;
        double d = Double.parseDouble(this.q);
        long j2 = (long) d;
        if (j2 == d) {
            this.q = null;
            this.n = 0;
            int[] iArr3 = this.u;
            int i3 = this.s - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.q + r());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String B() throws IOException {
        String strF;
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strF = H();
        } else if (iG == 12) {
            strF = F('\'');
        } else {
            if (iG != 13) {
                throw R("a name");
            }
            strF = F('\"');
        }
        this.n = 0;
        this.t[this.s - 1] = strF;
        return strF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D(boolean z) throws IOException {
        int i = this.j;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.j = i;
                if (!k(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(r()));
                    }
                    return -1;
                }
                i = this.j;
                i2 = this.k;
            }
            int i3 = i + 1;
            char[] cArr = this.i;
            char c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.j = i3;
                    if (i3 == i2) {
                        this.j = i;
                        boolean zK = k(2);
                        this.j++;
                        if (!zK) {
                            break;
                        }
                        break;
                        break;
                    }
                    e();
                    int i4 = this.j;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.j = i4 + 1;
                        while (true) {
                            if (this.j + 2 > this.k && !k(2)) {
                                Q("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.j;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.j;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.k;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.l++;
                                this.m = i5 + 1;
                            }
                            this.j++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.j = i4 + 1;
                        N();
                        i = this.j;
                        i2 = this.k;
                    }
                } else {
                    if (c != '#') {
                        this.j = i3;
                        return c;
                    }
                    this.j = i3;
                    e();
                    N();
                    i = this.j;
                    i2 = this.k;
                }
            }
            i = i3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 7) {
            throw R("null");
        }
        this.n = 0;
        int[] iArr = this.u;
        int i = this.s - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.j = r8;
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
        r11.j = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String F(char c) throws ke1 {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.j;
            int i3 = this.k;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.i;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.v == 3 && c2 < ' ') {
                        Q("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.j = i6;
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
                        this.l++;
                        this.m = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(K());
                i2 = this.j;
                i3 = this.k;
            }
        } while (k(1));
        Q("Unterminated string");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String G() {
        String str;
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = H();
        } else if (iG == 8) {
            str = F('\'');
        } else if (iG == 9) {
            str = F('\"');
        } else if (iG == 11) {
            str = this.q;
            this.q = null;
        } else if (iG == 15) {
            str = Long.toString(this.o);
        } else {
            if (iG != 16) {
                throw R("a string");
            }
            str = new String(this.i, this.j, this.p);
            this.j += this.p;
        }
        this.n = 0;
        int[] iArr = this.u;
        int i = this.s - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H() throws ke1 {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.j + i2;
                int i4 = this.k;
                cArr = this.i;
                if (i3 < i4) {
                    char c = cArr[i3];
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
                    sb.append(cArr, this.j, i2);
                    this.j += i2;
                } else if (k(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.j;
            if (sb != null) {
                string = new String(cArr, i5, i);
            } else {
                sb.append(cArr, i5, i);
                string = sb.toString();
            }
            this.j += i;
            return string;
        } while (k(1));
        int i52 = this.j;
        if (sb != null) {
        }
        this.j += i;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int I() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case AIChatConfig.DefaultContextRounds /* 6 */:
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
    public final void J(int i) throws ke1 {
        int i2 = this.s;
        if (i2 - 1 >= 255) {
            throw new ke1("Nesting limit 255 reached".concat(r()));
        }
        int[] iArr = this.r;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.r = Arrays.copyOf(iArr, i3);
            this.u = Arrays.copyOf(this.u, i3);
            this.t = (String[]) Arrays.copyOf(this.t, i3);
        }
        int[] iArr2 = this.r;
        int i4 = this.s;
        this.s = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final char K() throws ke1 {
        int i;
        if (this.j == this.k && !k(1)) {
            Q("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.j;
        int i3 = i2 + 1;
        this.j = i3;
        char[] cArr = this.i;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
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
                            Q("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.k && !k(4)) {
                            Q("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.j;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    Q("Malformed Unicode escape \\u".concat(new String(cArr, this.j, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.j += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.v == 3) {
            Q("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.l++;
        this.m = i3;
        if (this.v == 3) {
            Q("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(int i) {
        if (i == 0) {
            throw null;
        }
        this.v = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(char c) throws ke1 {
        do {
            int i = this.j;
            int i2 = this.k;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.i[i];
                if (c2 == c) {
                    this.j = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.j = i3;
                    K();
                    i = this.j;
                    i2 = this.k;
                } else {
                    if (c2 == '\n') {
                        this.l++;
                        this.m = i3;
                    }
                    i = i3;
                }
            }
            this.j = i;
        } while (k(1));
        Q("Unterminated string");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N() {
        char c;
        do {
            if (this.j >= this.k && !k(1)) {
                return;
            }
            int i = this.j;
            int i2 = i + 1;
            this.j = i2;
            c = this.i[i];
            if (c == '\n') {
                this.l++;
                this.m = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() throws ke1 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.j + i;
                if (i2 < this.k) {
                    char c = this.i[i2];
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
                                                    i++;
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
                    this.j = i2;
                }
            }
            this.j += i;
            return;
        } while (k(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void P() throws IOException {
        int i = 0;
        do {
            int iG = this.n;
            if (iG == 0) {
                iG = g();
            }
            switch (iG) {
                case 1:
                    J(3);
                    i++;
                    this.n = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.t[this.s - 1] = null;
                    }
                    this.s--;
                    i--;
                    this.n = 0;
                    break;
                case 3:
                    J(1);
                    i++;
                    this.n = 0;
                    break;
                case 4:
                    this.s--;
                    i--;
                    this.n = 0;
                    break;
                case 5:
                case AIChatConfig.DefaultContextRounds /* 6 */:
                case 7:
                case 11:
                case 15:
                default:
                    this.n = 0;
                    break;
                case 8:
                    M('\'');
                    this.n = 0;
                    break;
                case 9:
                    M('\"');
                    this.n = 0;
                    break;
                case 10:
                    O();
                    this.n = 0;
                    break;
                case 12:
                    M('\'');
                    if (i == 0) {
                        this.t[this.s - 1] = "<skipped>";
                    }
                    this.n = 0;
                    break;
                case 13:
                    M('\"');
                    if (i == 0) {
                        this.t[this.s - 1] = "<skipped>";
                    }
                    this.n = 0;
                    break;
                case 14:
                    O();
                    if (i == 0) {
                        this.t[this.s - 1] = "<skipped>";
                    }
                    this.n = 0;
                    break;
                case 16:
                    this.j += this.p;
                    this.n = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.u;
        int i2 = this.s - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(String str) throws ke1 {
        throw new ke1(str + r() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IllegalStateException R(String str) {
        return new IllegalStateException("Expected " + str + " but was " + vi0.x(I()) + r() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(I() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 3) {
            throw R("BEGIN_ARRAY");
        }
        J(1);
        this.u[this.s - 1] = 0;
        this.n = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 1) {
            throw R("BEGIN_OBJECT");
        }
        J(3);
        this.n = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n = 0;
        this.r[0] = 8;
        this.s = 1;
        this.h.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() throws ke1 {
        if (this.v == 1) {
            return;
        }
        Q("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0222, code lost:
    
        if (q(r14) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g() throws IOException {
        int iD;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        char c2;
        long j;
        int i4;
        int[] iArr = this.r;
        boolean z = true;
        int i5 = this.s - 1;
        int i6 = iArr[i5];
        char[] cArr = this.i;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iD2 = D(true);
            if (iD2 != 44) {
                if (iD2 != 59) {
                    if (iD2 == 93) {
                        this.n = 4;
                        return 4;
                    }
                    Q("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (iD = D(true)) != 44) {
                    if (iD != 59) {
                        if (iD == 125) {
                            this.n = 2;
                            return 2;
                        }
                        Q("Unterminated object");
                        throw null;
                    }
                    e();
                }
                int iD3 = D(true);
                if (iD3 == 34) {
                    this.n = 13;
                    return 13;
                }
                if (iD3 == 39) {
                    e();
                    this.n = 12;
                    return 12;
                }
                if (iD3 == 125) {
                    if (i6 != 5) {
                        this.n = 2;
                        return 2;
                    }
                    Q("Expected name");
                    throw null;
                }
                e();
                this.j--;
                if (q((char) iD3)) {
                    this.n = 14;
                    return 14;
                }
                Q("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iD4 = D(true);
                if (iD4 != 58) {
                    if (iD4 != 61) {
                        Q("Expected ':'");
                        throw null;
                    }
                    e();
                    if (this.j < this.k || k(1)) {
                        int i7 = this.j;
                        if (cArr[i7] == '>') {
                            this.j = i7 + 1;
                        }
                    }
                }
            } else if (i6 == 6) {
                if (this.v == 1) {
                    D(true);
                    int i8 = this.j;
                    this.j = i8 - 1;
                    if (i8 + 4 <= this.k || k(5)) {
                        int i9 = this.j;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.j = i9 + 5;
                        }
                    }
                }
                this.r[this.s - 1] = 7;
            } else if (i6 == 7) {
                if (D(false) == -1) {
                    this.n = 17;
                    return 17;
                }
                e();
                this.j--;
            } else if (i6 == 8) {
                s.l("JsonReader is closed");
                return 0;
            }
        }
        int iD5 = D(true);
        if (iD5 == 34) {
            this.n = 9;
            return 9;
        }
        if (iD5 == 39) {
            e();
            this.n = 8;
            return 8;
        }
        if (iD5 == 44 || iD5 == 59) {
            i = 1;
        } else {
            if (iD5 == 91) {
                this.n = 3;
                return 3;
            }
            if (iD5 == 93) {
                i = 1;
                if (i6 == 1) {
                    this.n = 4;
                    return 4;
                }
            } else {
                if (iD5 == 123) {
                    this.n = 1;
                    return 1;
                }
                int i10 = this.j - 1;
                this.j = i10;
                char c3 = cArr[i10];
                if (c3 == 't' || c3 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else if (c3 == 'f' || c3 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                } else {
                    if (c3 == 'n' || c3 == 'N') {
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                        return i3;
                    }
                    int i11 = this.j;
                    int i12 = this.k;
                    boolean z2 = true;
                    int i13 = 0;
                    long j2 = 0;
                    boolean z3 = false;
                    char c4 = 0;
                    while (true) {
                        if (i11 + i13 == i12) {
                            if (i13 == cArr.length) {
                                break;
                            }
                            if (!k(i13 + 1)) {
                                j = j2;
                                break;
                            }
                            i11 = this.j;
                            i12 = this.k;
                            c2 = cArr[i11 + i13];
                            if (c2 != '+') {
                            }
                        } else {
                            c2 = cArr[i11 + i13];
                            if (c2 != '+') {
                                if (c4 != 5) {
                                    break;
                                }
                                c4 = 6;
                                i13++;
                                z = true;
                            } else if (c2 == 'E' || c2 == 'e') {
                                if (c4 != 2 && c4 != 4) {
                                    break;
                                }
                                c4 = 5;
                                i13++;
                                z = true;
                            } else if (c2 != '-') {
                                if (c2 == '.') {
                                    if (c4 != 2) {
                                        break;
                                    }
                                    c4 = 3;
                                    i13++;
                                    z = true;
                                } else {
                                    if (c2 < '0' || c2 > '9') {
                                        break;
                                    }
                                    if (c4 == z || c4 == 0) {
                                        j2 = -(c2 - '0');
                                        c4 = 2;
                                    } else if (c4 != 2) {
                                        long j3 = j2;
                                        if (c4 == 3) {
                                            j2 = j3;
                                            c4 = 4;
                                        } else if (c4 == 5 || c4 == 6) {
                                            j2 = j3;
                                            c4 = 7;
                                        } else {
                                            j2 = j3;
                                        }
                                    } else {
                                        if (j2 == 0) {
                                            break;
                                        }
                                        long j4 = j2;
                                        long j5 = (10 * j2) - ((long) (c2 - '0'));
                                        z2 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
                                        j2 = j5;
                                    }
                                    i13++;
                                    z = true;
                                }
                            } else if (c4 == 0) {
                                z3 = true;
                                c4 = 1;
                                i13++;
                                z = true;
                            } else {
                                if (c4 != 5) {
                                    break;
                                }
                                c4 = 6;
                                i13++;
                                z = true;
                            }
                        }
                        if (i4 == 0) {
                            return i4;
                        }
                        if (!q(cArr[this.j])) {
                            Q("Expected value");
                            throw null;
                        }
                        e();
                        this.n = 10;
                        return 10;
                    }
                    char c5 = 2;
                    if (c4 != 2) {
                        if (c4 != c5 || c4 == 4 || c4 == 7) {
                            this.p = i13;
                            i4 = 16;
                            this.n = 16;
                        } else {
                            i4 = 0;
                        }
                    } else if (!z2 || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                        c5 = 2;
                        if (c4 != c5) {
                        }
                        this.p = i13;
                        i4 = 16;
                        this.n = 16;
                    } else {
                        long j6 = j;
                        if (!z3) {
                            j6 = -j6;
                        }
                        this.o = j6;
                        this.j += i13;
                        i4 = 15;
                        this.n = 15;
                    }
                    if (i4 == 0) {
                    }
                }
                boolean z4 = this.v != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.j;
                    int i16 = this.k;
                    if (i14 < length) {
                        if ((i15 + i14 >= i16 && !k(i14 + 1)) || ((c = cArr[this.j + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                            break;
                        }
                        i14++;
                    } else {
                        if ((i15 + length < i16 || k(length + 1)) && q(cArr[this.j + length])) {
                            break;
                        }
                        this.j += length;
                        this.n = i2;
                        i3 = i2;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                }
            }
        }
        if (i6 != i && i6 != 2) {
            Q("Unexpected value");
            throw null;
        }
        e();
        this.j -= i;
        this.n = 7;
        return 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw R("END_ARRAY");
        }
        int i = this.s;
        this.s = i - 1;
        int[] iArr = this.u;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.n = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw R("END_OBJECT");
        }
        int i = this.s;
        int i2 = i - 1;
        this.s = i2;
        this.t[i2] = null;
        int[] iArr = this.u;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.n = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.m;
        int i5 = this.j;
        this.m = i4 - i5;
        int i6 = this.k;
        char[] cArr = this.i;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.k = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.k = 0;
        }
        this.j = 0;
        do {
            int i8 = this.k;
            int i9 = this.h.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.k + i9;
            this.k = i2;
            if (this.l == 0 && (i3 = this.m) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.j++;
                this.m = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String o(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.s;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.r[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.u[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.t[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                case 7:
                case 8:
                    break;
                default:
                    s.i(vi0.g("Unknown scope value: ", i3));
                    return null;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4 || iG == 17) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q(char c) throws ke1 {
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
        e();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String r() {
        StringBuilder sbK = hk1.k(" at line ", this.l + 1, (this.j - this.m) + 1, " column ", " path ");
        sbK.append(o(false));
        return sbK.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.n = 0;
            int[] iArr = this.u;
            int i = this.s - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iG != 6) {
            throw R("a boolean");
        }
        this.n = 0;
        int[] iArr2 = this.u;
        int i2 = this.s - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return l41.class.getSimpleName().concat(r());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double u() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.n = 0;
            int[] iArr = this.u;
            int i = this.s - 1;
            iArr[i] = iArr[i] + 1;
            return this.o;
        }
        if (iG == 16) {
            this.q = new String(this.i, this.j, this.p);
            this.j += this.p;
        } else if (iG == 8 || iG == 9) {
            this.q = F(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.q = H();
        } else if (iG != 11) {
            throw R("a double");
        }
        this.n = 11;
        double d = Double.parseDouble(this.q);
        if (this.v != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            Q("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.q = null;
        this.n = 0;
        int[] iArr2 = this.u;
        int i2 = this.s - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v() throws IOException {
        int iG = this.n;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j = this.o;
            int i = (int) j;
            if (j == i) {
                this.n = 0;
                int[] iArr = this.u;
                int i2 = this.s - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.o + r());
        }
        if (iG == 16) {
            this.q = new String(this.i, this.j, this.p);
            this.j += this.p;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw R("an int");
            }
            if (iG == 10) {
                this.q = H();
            } else {
                this.q = F(iG == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.q);
                this.n = 0;
                int[] iArr2 = this.u;
                int i4 = this.s - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.n = 11;
        double d = Double.parseDouble(this.q);
        int i5 = (int) d;
        if (i5 == d) {
            this.q = null;
            this.n = 0;
            int[] iArr3 = this.u;
            int i6 = this.s - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.q + r());
    }
}
