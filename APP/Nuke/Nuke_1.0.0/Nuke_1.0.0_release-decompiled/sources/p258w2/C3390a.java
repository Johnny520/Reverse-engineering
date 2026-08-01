package p258w2;

import java.io.Closeable;
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

    static {
        C2475a.f7965e = new C2475a(15);
    }

    public C3390a(Reader reader) {
        int[] iArr = new int[32];
        this.f10594n = iArr;
        iArr[0] = 6;
        this.f10596p = new String[32];
        this.f10597q = new int[32];
        this.f10584d = reader;
    }

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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5625E(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p258w2.C3390a.m5625E(boolean):int");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m5627G(char r12) throws p258w2.C3392c {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f10586f
            int r3 = r11.f10587g
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f10585e
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f10598r
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.m5637Q(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f10586f = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f10586f = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.m5632L()
            r1.append(r2)
            int r2 = r11.f10586f
            int r3 = r11.f10587g
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f10588h
            int r2 = r2 + r6
            r11.f10588h = r2
            r11.f10589i = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f10586f = r2
            boolean r2 = r11.m5645l(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.m5637Q(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p258w2.C3390a.m5627G(char):java.lang.String");
    }

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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m5641d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m5629I() throws p258w2.C3392c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f10586f
            int r4 = r3 + r2
            int r5 = r7.f10587g
            char[] r6 = r7.f10585e
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m5641d()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m5645l(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f10586f
            r0.append(r6, r3, r2)
            int r3 = r7.f10586f
            int r3 = r3 + r2
            r7.f10586f = r3
            r2 = 1
            boolean r2 = r7.m5645l(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f10586f
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f10586f
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f10586f
            int r2 = r2 + r1
            r7.f10586f = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p258w2.C3390a.m5629I():java.lang.String");
    }

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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m5641d();
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5635O() throws p258w2.C3392c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f10586f
            int r2 = r1 + r0
            int r3 = r4.f10587g
            if (r2 >= r3) goto L51
            char[] r2 = r4.f10585e
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m5641d()
        L4b:
            int r1 = r4.f10586f
            int r1 = r1 + r0
            r4.f10586f = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f10586f = r1
            r0 = 1
            boolean r0 = r4.m5645l(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p258w2.C3390a.m5635O():void");
    }

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

    /* JADX INFO: renamed from: Q */
    public final void m5637Q(String str) throws C3392c {
        throw new C3392c(str + m5649t() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX INFO: renamed from: R */
    public final IllegalStateException m5638R(String str) {
        return new IllegalStateException("Expected " + str + " but was " + AbstractC3202a.m5469d(m5630J()) + m5649t() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(m5630J() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10590j = 0;
        this.f10594n[0] = 8;
        this.f10595o = 1;
        this.f10584d.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m5641d() throws C3392c {
        if (this.f10598r == 1) {
            return;
        }
        m5637Q("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5642f() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p258w2.C3390a.m5642f():int");
    }

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

    /* JADX INFO: renamed from: n */
    public final boolean m5647n() throws IOException {
        int iM5642f = this.f10590j;
        if (iM5642f == 0) {
            iM5642f = m5642f();
        }
        return (iM5642f == 2 || iM5642f == 4 || iM5642f == 17) ? false : true;
    }

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

    /* JADX INFO: renamed from: t */
    public final String m5649t() {
        return " at line " + (this.f10588h + 1) + " column " + ((this.f10586f - this.f10589i) + 1) + " path " + m5646m(false);
    }

    public final String toString() {
        return C3390a.class.getSimpleName() + m5649t();
    }

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
