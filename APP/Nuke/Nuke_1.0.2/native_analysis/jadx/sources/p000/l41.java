package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class l41 implements Closeable {

    /* JADX INFO: renamed from: h */
    public final Reader f5919h;

    /* JADX INFO: renamed from: o */
    public long f5926o;

    /* JADX INFO: renamed from: p */
    public int f5927p;

    /* JADX INFO: renamed from: q */
    public String f5928q;

    /* JADX INFO: renamed from: r */
    public int[] f5929r;

    /* JADX INFO: renamed from: t */
    public String[] f5931t;

    /* JADX INFO: renamed from: u */
    public int[] f5932u;

    /* JADX INFO: renamed from: v */
    public int f5933v = 2;

    /* JADX INFO: renamed from: i */
    public final char[] f5920i = new char[1024];

    /* JADX INFO: renamed from: j */
    public int f5921j = 0;

    /* JADX INFO: renamed from: k */
    public int f5922k = 0;

    /* JADX INFO: renamed from: l */
    public int f5923l = 0;

    /* JADX INFO: renamed from: m */
    public int f5924m = 0;

    /* JADX INFO: renamed from: n */
    public int f5925n = 0;

    /* JADX INFO: renamed from: s */
    public int f5930s = 1;

    static {
        C0160eb.f2377i = new C0160eb(29);
    }

    public l41(Reader reader) {
        int[] iArr = new int[32];
        this.f5929r = iArr;
        iArr[0] = 6;
        this.f5931t = new String[32];
        this.f5932u = new int[32];
        this.f5919h = reader;
    }

    /* JADX INFO: renamed from: A */
    public final long m2807A() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g == 15) {
            this.f5925n = 0;
            int[] iArr = this.f5932u;
            int i = this.f5930s - 1;
            iArr[i] = iArr[i] + 1;
            return this.f5926o;
        }
        if (iM2827g == 16) {
            this.f5928q = new String(this.f5920i, this.f5921j, this.f5927p);
            this.f5921j += this.f5927p;
        } else {
            if (iM2827g != 8 && iM2827g != 9 && iM2827g != 10) {
                throw m2823R("a long");
            }
            if (iM2827g == 10) {
                this.f5928q = m2813H();
            } else {
                this.f5928q = m2811F(iM2827g == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f5928q);
                this.f5925n = 0;
                int[] iArr2 = this.f5932u;
                int i2 = this.f5930s - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f5925n = 11;
        double d = Double.parseDouble(this.f5928q);
        long j2 = (long) d;
        if (j2 == d) {
            this.f5928q = null;
            this.f5925n = 0;
            int[] iArr3 = this.f5932u;
            int i3 = this.f5930s - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f5928q + m2834r());
    }

    /* JADX INFO: renamed from: B */
    public final String m2808B() throws IOException {
        String strM2811F;
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g == 14) {
            strM2811F = m2813H();
        } else if (iM2827g == 12) {
            strM2811F = m2811F('\'');
        } else {
            if (iM2827g != 13) {
                throw m2823R("a name");
            }
            strM2811F = m2811F('\"');
        }
        this.f5925n = 0;
        this.f5931t[this.f5930s - 1] = strM2811F;
        return strM2811F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2809D(boolean z) throws IOException {
        int i = this.f5921j;
        int i2 = this.f5922k;
        while (true) {
            if (i == i2) {
                this.f5921j = i;
                if (!m2830k(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m2834r()));
                    }
                    return -1;
                }
                i = this.f5921j;
                i2 = this.f5922k;
            }
            int i3 = i + 1;
            char[] cArr = this.f5920i;
            char c = cArr[i];
            if (c == '\n') {
                this.f5923l++;
                this.f5924m = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f5921j = i3;
                    if (i3 == i2) {
                        this.f5921j = i;
                        boolean zM2830k = m2830k(2);
                        this.f5921j++;
                        if (!zM2830k) {
                            break;
                        }
                        break;
                        break;
                    }
                    m2826e();
                    int i4 = this.f5921j;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f5921j = i4 + 1;
                        while (true) {
                            if (this.f5921j + 2 > this.f5922k && !m2830k(2)) {
                                m2822Q("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f5921j;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.f5921j;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.f5922k;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f5923l++;
                                this.f5924m = i5 + 1;
                            }
                            this.f5921j++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.f5921j = i4 + 1;
                        m2819N();
                        i = this.f5921j;
                        i2 = this.f5922k;
                    }
                } else {
                    if (c != '#') {
                        this.f5921j = i3;
                        return c;
                    }
                    this.f5921j = i3;
                    m2826e();
                    m2819N();
                    i = this.f5921j;
                    i2 = this.f5922k;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2810E() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g != 7) {
            throw m2823R("null");
        }
        this.f5925n = 0;
        int[] iArr = this.f5932u;
        int i = this.f5930s - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f5921j = r8;
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
        r11.f5921j = r2;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2811F(char c) throws ke1 {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.f5921j;
            int i3 = this.f5922k;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.f5920i;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.f5933v == 3 && c2 < ' ') {
                        m2822Q("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.f5921j = i6;
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
                        this.f5923l++;
                        this.f5924m = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(m2816K());
                i2 = this.f5921j;
                i3 = this.f5922k;
            }
        } while (m2830k(1));
        m2822Q("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final String m2812G() {
        String str;
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g == 10) {
            str = m2813H();
        } else if (iM2827g == 8) {
            str = m2811F('\'');
        } else if (iM2827g == 9) {
            str = m2811F('\"');
        } else if (iM2827g == 11) {
            str = this.f5928q;
            this.f5928q = null;
        } else if (iM2827g == 15) {
            str = Long.toString(this.f5926o);
        } else {
            if (iM2827g != 16) {
                throw m2823R("a string");
            }
            str = new String(this.f5920i, this.f5921j, this.f5927p);
            this.f5921j += this.f5927p;
        }
        this.f5925n = 0;
        int[] iArr = this.f5932u;
        int i = this.f5930s - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        m2826e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2813H() throws ke1 {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f5921j + i2;
                int i4 = this.f5922k;
                cArr = this.f5920i;
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
                    sb.append(cArr, this.f5921j, i2);
                    this.f5921j += i2;
                } else if (m2830k(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.f5921j;
            if (sb != null) {
                string = new String(cArr, i5, i);
            } else {
                sb.append(cArr, i5, i);
                string = sb.toString();
            }
            this.f5921j += i;
            return string;
        } while (m2830k(1));
        int i52 = this.f5921j;
        if (sb != null) {
        }
        this.f5921j += i;
        return string;
    }

    /* JADX INFO: renamed from: I */
    public final int m2814I() {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        switch (iM2827g) {
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

    /* JADX INFO: renamed from: J */
    public final void m2815J(int i) throws ke1 {
        int i2 = this.f5930s;
        if (i2 - 1 >= 255) {
            throw new ke1("Nesting limit 255 reached".concat(m2834r()));
        }
        int[] iArr = this.f5929r;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f5929r = Arrays.copyOf(iArr, i3);
            this.f5932u = Arrays.copyOf(this.f5932u, i3);
            this.f5931t = (String[]) Arrays.copyOf(this.f5931t, i3);
        }
        int[] iArr2 = this.f5929r;
        int i4 = this.f5930s;
        this.f5930s = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: K */
    public final char m2816K() throws ke1 {
        int i;
        if (this.f5921j == this.f5922k && !m2830k(1)) {
            m2822Q("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f5921j;
        int i3 = i2 + 1;
        this.f5921j = i3;
        char[] cArr = this.f5920i;
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
                            m2822Q("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f5922k && !m2830k(4)) {
                            m2822Q("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f5921j;
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
                                    m2822Q("Malformed Unicode escape \\u".concat(new String(cArr, this.f5921j, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f5921j += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f5933v == 3) {
            m2822Q("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f5923l++;
        this.f5924m = i3;
        if (this.f5933v == 3) {
            m2822Q("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: L */
    public final void m2817L(int i) {
        if (i == 0) {
            throw null;
        }
        this.f5933v = i;
    }

    /* JADX INFO: renamed from: M */
    public final void m2818M(char c) throws ke1 {
        do {
            int i = this.f5921j;
            int i2 = this.f5922k;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f5920i[i];
                if (c2 == c) {
                    this.f5921j = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f5921j = i3;
                    m2816K();
                    i = this.f5921j;
                    i2 = this.f5922k;
                } else {
                    if (c2 == '\n') {
                        this.f5923l++;
                        this.f5924m = i3;
                    }
                    i = i3;
                }
            }
            this.f5921j = i;
        } while (m2830k(1));
        m2822Q("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: N */
    public final void m2819N() {
        char c;
        do {
            if (this.f5921j >= this.f5922k && !m2830k(1)) {
                return;
            }
            int i = this.f5921j;
            int i2 = i + 1;
            this.f5921j = i2;
            c = this.f5920i[i];
            if (c == '\n') {
                this.f5923l++;
                this.f5924m = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        m2826e();
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2820O() throws ke1 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f5921j + i;
                if (i2 < this.f5922k) {
                    char c = this.f5920i[i2];
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
                    this.f5921j = i2;
                }
            }
            this.f5921j += i;
            return;
        } while (m2830k(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: P */
    public final void m2821P() throws IOException {
        int i = 0;
        do {
            int iM2827g = this.f5925n;
            if (iM2827g == 0) {
                iM2827g = m2827g();
            }
            switch (iM2827g) {
                case 1:
                    m2815J(3);
                    i++;
                    this.f5925n = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f5931t[this.f5930s - 1] = null;
                    }
                    this.f5930s--;
                    i--;
                    this.f5925n = 0;
                    break;
                case 3:
                    m2815J(1);
                    i++;
                    this.f5925n = 0;
                    break;
                case 4:
                    this.f5930s--;
                    i--;
                    this.f5925n = 0;
                    break;
                case 5:
                case AIChatConfig.DefaultContextRounds /* 6 */:
                case 7:
                case 11:
                case 15:
                default:
                    this.f5925n = 0;
                    break;
                case 8:
                    m2818M('\'');
                    this.f5925n = 0;
                    break;
                case 9:
                    m2818M('\"');
                    this.f5925n = 0;
                    break;
                case 10:
                    m2820O();
                    this.f5925n = 0;
                    break;
                case 12:
                    m2818M('\'');
                    if (i == 0) {
                        this.f5931t[this.f5930s - 1] = "<skipped>";
                    }
                    this.f5925n = 0;
                    break;
                case 13:
                    m2818M('\"');
                    if (i == 0) {
                        this.f5931t[this.f5930s - 1] = "<skipped>";
                    }
                    this.f5925n = 0;
                    break;
                case 14:
                    m2820O();
                    if (i == 0) {
                        this.f5931t[this.f5930s - 1] = "<skipped>";
                    }
                    this.f5925n = 0;
                    break;
                case 16:
                    this.f5921j += this.f5927p;
                    this.f5925n = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f5932u;
        int i2 = this.f5930s - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: Q */
    public final void m2822Q(String str) throws ke1 {
        throw new ke1(str + m2834r() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX INFO: renamed from: R */
    public final IllegalStateException m2823R(String str) {
        return new IllegalStateException("Expected " + str + " but was " + vi0.m5705x(m2814I()) + m2834r() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(m2814I() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX INFO: renamed from: b */
    public final void m2824b() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g != 3) {
            throw m2823R("BEGIN_ARRAY");
        }
        m2815J(1);
        this.f5932u[this.f5930s - 1] = 0;
        this.f5925n = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2825c() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g != 1) {
            throw m2823R("BEGIN_OBJECT");
        }
        m2815J(3);
        this.f5925n = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5925n = 0;
        this.f5929r[0] = 8;
        this.f5930s = 1;
        this.f5919h.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m2826e() throws ke1 {
        if (this.f5933v == 1) {
            return;
        }
        m2822Q("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0222, code lost:
    
        if (m2833q(r14) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x027f  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2827g() throws IOException {
        int iM2809D;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        char c2;
        long j;
        int i4;
        int[] iArr = this.f5929r;
        boolean z = true;
        int i5 = this.f5930s - 1;
        int i6 = iArr[i5];
        char[] cArr = this.f5920i;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iM2809D2 = m2809D(true);
            if (iM2809D2 != 44) {
                if (iM2809D2 != 59) {
                    if (iM2809D2 == 93) {
                        this.f5925n = 4;
                        return 4;
                    }
                    m2822Q("Unterminated array");
                    throw null;
                }
                m2826e();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (iM2809D = m2809D(true)) != 44) {
                    if (iM2809D != 59) {
                        if (iM2809D == 125) {
                            this.f5925n = 2;
                            return 2;
                        }
                        m2822Q("Unterminated object");
                        throw null;
                    }
                    m2826e();
                }
                int iM2809D3 = m2809D(true);
                if (iM2809D3 == 34) {
                    this.f5925n = 13;
                    return 13;
                }
                if (iM2809D3 == 39) {
                    m2826e();
                    this.f5925n = 12;
                    return 12;
                }
                if (iM2809D3 == 125) {
                    if (i6 != 5) {
                        this.f5925n = 2;
                        return 2;
                    }
                    m2822Q("Expected name");
                    throw null;
                }
                m2826e();
                this.f5921j--;
                if (m2833q((char) iM2809D3)) {
                    this.f5925n = 14;
                    return 14;
                }
                m2822Q("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iM2809D4 = m2809D(true);
                if (iM2809D4 != 58) {
                    if (iM2809D4 != 61) {
                        m2822Q("Expected ':'");
                        throw null;
                    }
                    m2826e();
                    if (this.f5921j < this.f5922k || m2830k(1)) {
                        int i7 = this.f5921j;
                        if (cArr[i7] == '>') {
                            this.f5921j = i7 + 1;
                        }
                    }
                }
            } else if (i6 == 6) {
                if (this.f5933v == 1) {
                    m2809D(true);
                    int i8 = this.f5921j;
                    this.f5921j = i8 - 1;
                    if (i8 + 4 <= this.f5922k || m2830k(5)) {
                        int i9 = this.f5921j;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.f5921j = i9 + 5;
                        }
                    }
                }
                this.f5929r[this.f5930s - 1] = 7;
            } else if (i6 == 7) {
                if (m2809D(false) == -1) {
                    this.f5925n = 17;
                    return 17;
                }
                m2826e();
                this.f5921j--;
            } else if (i6 == 8) {
                C0676s.m4653l("JsonReader is closed");
                return 0;
            }
        }
        int iM2809D5 = m2809D(true);
        if (iM2809D5 == 34) {
            this.f5925n = 9;
            return 9;
        }
        if (iM2809D5 == 39) {
            m2826e();
            this.f5925n = 8;
            return 8;
        }
        if (iM2809D5 == 44 || iM2809D5 == 59) {
            i = 1;
        } else {
            if (iM2809D5 == 91) {
                this.f5925n = 3;
                return 3;
            }
            if (iM2809D5 == 93) {
                i = 1;
                if (i6 == 1) {
                    this.f5925n = 4;
                    return 4;
                }
            } else {
                if (iM2809D5 == 123) {
                    this.f5925n = 1;
                    return 1;
                }
                int i10 = this.f5921j - 1;
                this.f5921j = i10;
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
                    int i11 = this.f5921j;
                    int i12 = this.f5922k;
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
                            if (!m2830k(i13 + 1)) {
                                j = j2;
                                break;
                            }
                            i11 = this.f5921j;
                            i12 = this.f5922k;
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
                        if (!m2833q(cArr[this.f5921j])) {
                            m2822Q("Expected value");
                            throw null;
                        }
                        m2826e();
                        this.f5925n = 10;
                        return 10;
                    }
                    char c5 = 2;
                    if (c4 != 2) {
                        if (c4 != c5 || c4 == 4 || c4 == 7) {
                            this.f5927p = i13;
                            i4 = 16;
                            this.f5925n = 16;
                        } else {
                            i4 = 0;
                        }
                    } else if (!z2 || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                        c5 = 2;
                        if (c4 != c5) {
                        }
                        this.f5927p = i13;
                        i4 = 16;
                        this.f5925n = 16;
                    } else {
                        long j6 = j;
                        if (!z3) {
                            j6 = -j6;
                        }
                        this.f5926o = j6;
                        this.f5921j += i13;
                        i4 = 15;
                        this.f5925n = 15;
                    }
                    if (i4 == 0) {
                    }
                }
                boolean z4 = this.f5933v != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.f5921j;
                    int i16 = this.f5922k;
                    if (i14 < length) {
                        if ((i15 + i14 >= i16 && !m2830k(i14 + 1)) || ((c = cArr[this.f5921j + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                            break;
                        }
                        i14++;
                    } else {
                        if ((i15 + length < i16 || m2830k(length + 1)) && m2833q(cArr[this.f5921j + length])) {
                            break;
                        }
                        this.f5921j += length;
                        this.f5925n = i2;
                        i3 = i2;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                }
            }
        }
        if (i6 != i && i6 != 2) {
            m2822Q("Unexpected value");
            throw null;
        }
        m2826e();
        this.f5921j -= i;
        this.f5925n = 7;
        return 7;
    }

    /* JADX INFO: renamed from: h */
    public final void m2828h() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g != 4) {
            throw m2823R("END_ARRAY");
        }
        int i = this.f5930s;
        this.f5930s = i - 1;
        int[] iArr = this.f5932u;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f5925n = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m2829j() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g != 2) {
            throw m2823R("END_OBJECT");
        }
        int i = this.f5930s;
        int i2 = i - 1;
        this.f5930s = i2;
        this.f5931t[i2] = null;
        int[] iArr = this.f5932u;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f5925n = 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2830k(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f5924m;
        int i5 = this.f5921j;
        this.f5924m = i4 - i5;
        int i6 = this.f5922k;
        char[] cArr = this.f5920i;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f5922k = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f5922k = 0;
        }
        this.f5921j = 0;
        do {
            int i8 = this.f5922k;
            int i9 = this.f5919h.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f5922k + i9;
            this.f5922k = i2;
            if (this.f5923l == 0 && (i3 = this.f5924m) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f5921j++;
                this.f5924m = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final String m2831o(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f5930s;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f5929r[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f5932u[i];
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
                    String str = this.f5931t[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                case 7:
                case 8:
                    break;
                default:
                    C0676s.m4650i(vi0.m5688g("Unknown scope value: ", i3));
                    return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2832p() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        return (iM2827g == 2 || iM2827g == 4 || iM2827g == 17) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2833q(char c) throws ke1 {
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
        m2826e();
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final String m2834r() {
        StringBuilder sbM2212k = hk1.m2212k(" at line ", this.f5923l + 1, (this.f5921j - this.f5924m) + 1, " column ", " path ");
        sbM2212k.append(m2831o(false));
        return sbM2212k.toString();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2835t() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g == 5) {
            this.f5925n = 0;
            int[] iArr = this.f5932u;
            int i = this.f5930s - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM2827g != 6) {
            throw m2823R("a boolean");
        }
        this.f5925n = 0;
        int[] iArr2 = this.f5932u;
        int i2 = this.f5930s - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final String toString() {
        return l41.class.getSimpleName().concat(m2834r());
    }

    /* JADX INFO: renamed from: u */
    public final double m2836u() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g == 15) {
            this.f5925n = 0;
            int[] iArr = this.f5932u;
            int i = this.f5930s - 1;
            iArr[i] = iArr[i] + 1;
            return this.f5926o;
        }
        if (iM2827g == 16) {
            this.f5928q = new String(this.f5920i, this.f5921j, this.f5927p);
            this.f5921j += this.f5927p;
        } else if (iM2827g == 8 || iM2827g == 9) {
            this.f5928q = m2811F(iM2827g == 8 ? '\'' : '\"');
        } else if (iM2827g == 10) {
            this.f5928q = m2813H();
        } else if (iM2827g != 11) {
            throw m2823R("a double");
        }
        this.f5925n = 11;
        double d = Double.parseDouble(this.f5928q);
        if (this.f5933v != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            m2822Q("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f5928q = null;
        this.f5925n = 0;
        int[] iArr2 = this.f5932u;
        int i2 = this.f5930s - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: v */
    public final int m2837v() throws IOException {
        int iM2827g = this.f5925n;
        if (iM2827g == 0) {
            iM2827g = m2827g();
        }
        if (iM2827g == 15) {
            long j = this.f5926o;
            int i = (int) j;
            if (j == i) {
                this.f5925n = 0;
                int[] iArr = this.f5932u;
                int i2 = this.f5930s - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f5926o + m2834r());
        }
        if (iM2827g == 16) {
            this.f5928q = new String(this.f5920i, this.f5921j, this.f5927p);
            this.f5921j += this.f5927p;
        } else {
            if (iM2827g != 8 && iM2827g != 9 && iM2827g != 10) {
                throw m2823R("an int");
            }
            if (iM2827g == 10) {
                this.f5928q = m2813H();
            } else {
                this.f5928q = m2811F(iM2827g == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f5928q);
                this.f5925n = 0;
                int[] iArr2 = this.f5932u;
                int i4 = this.f5930s - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f5925n = 11;
        double d = Double.parseDouble(this.f5928q);
        int i5 = (int) d;
        if (i5 == d) {
            this.f5928q = null;
            this.f5925n = 0;
            int[] iArr3 = this.f5932u;
            int i6 = this.f5930s - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f5928q + m2834r());
    }
}
