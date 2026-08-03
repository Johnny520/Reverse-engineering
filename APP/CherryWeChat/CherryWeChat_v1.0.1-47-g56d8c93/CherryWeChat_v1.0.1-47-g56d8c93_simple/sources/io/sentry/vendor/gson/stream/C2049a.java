package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import p000.C2273na;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2049a implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Reader f7247a;

    /* JADX INFO: renamed from: b */
    public boolean f7248b;

    /* JADX INFO: renamed from: c */
    public final char[] f7249c;

    /* JADX INFO: renamed from: d */
    public int f7250d;

    /* JADX INFO: renamed from: e */
    public int f7251e;

    /* JADX INFO: renamed from: f */
    public int f7252f;

    /* JADX INFO: renamed from: g */
    public int f7253g;

    /* JADX INFO: renamed from: h */
    public int f7254h;

    /* JADX INFO: renamed from: i */
    public long f7255i;

    /* JADX INFO: renamed from: j */
    public int f7256j;

    /* JADX INFO: renamed from: k */
    public String f7257k;

    /* JADX INFO: renamed from: l */
    public int[] f7258l;

    /* JADX INFO: renamed from: m */
    public int f7259m;

    /* JADX INFO: renamed from: n */
    public String[] f7260n;

    /* JADX INFO: renamed from: o */
    public int[] f7261o;

    public C2049a(Reader r5) {
        this.f7248b = false;
        this.f7249c = new char[1024];
        this.f7250d = 0;
        this.f7251e = 0;
        this.f7252f = 0;
        this.f7253g = 0;
        this.f7254h = 0;
        int[] r2 = new int[32];
        this.f7258l = r2;
        this.f7259m = 1;
        r2[0] = 6;
        this.f7260n = new String[32];
        this.f7261o = new int[32];
        this.f7247a = r5;
    }

    /* JADX INFO: renamed from: A */
    public final String m4192A() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 10) goto L9;
        String r02 = m4193B();
    L23:
        this.f7254h = 0;
        int[] r1 = this.f7261o;
        int r2 = this.f7259m - 1;
        r1[r2] = r1[r2] + 1;
        return r02;
    L9:
        if (r0 != 8) goto L12;
        r02 = m4216z('\'');
        goto L23
    L12:
        if (r0 != 9) goto L15;
        r02 = m4216z('\"');
        goto L23
    L15:
        if (r0 != 11) goto L18;
        r02 = this.f7257k;
        this.f7257k = null;
        goto L23
    L18:
        if (r0 != 15) goto L21;
        r02 = Long.toString(this.f7255i);
        goto L23
    L21:
        if (r0 != 16) goto L26;
        r02 = new String(this.f7249c, this.f7250d, this.f7256j);
        this.f7250d += this.f7256j;
        goto L23
    L26:
        throw new IllegalStateException("Expected a string but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: B */
    public final String m4193B() {
        StringBuilder r0 = null;
        int r1 = 0;
    L3:
        int r2 = 0;
    L4:
        int r3 = this.f7250d;
        int r4 = r3 + r2;
        int r5 = this.f7251e;
        char[] r6 = this.f7249c;
        if (r4 < r5) goto L6;
        if (r2 >= r6.length) goto L41;
        if (m4206p(r2 + 1) == true) goto L4;
    L40:
        r1 = r2;
    L45:
        if (r0 != null) goto L47;
        String r02 = new String(r6, this.f7250d, r1);
    L48:
        this.f7250d += r1;
        return r02;
    L47:
        r0.append(r6, this.f7250d, r1);
        r02 = r0.toString();
        goto L48
    L41:
        if (r0 != null) goto L43;
        r0 = new StringBuilder(Math.max(r2, 16));
    L43:
        r0.append(r6, this.f7250d, r2);
        this.f7250d += r2;
        if (m4206p(1) == true) goto L3;
    L6:
        char r32 = r6[r3 + r2];
        if (r32 == '\t') goto L40;
        if (r32 == '\n') goto L40;
        if (r32 == '\f') goto L40;
        if (r32 == '\r') goto L40;
        if (r32 == ' ') goto L40;
        if (r32 == '#') goto L34;
        if (r32 == ',') goto L40;
        if (r32 == '/') goto L34;
        if (r32 == '=') goto L34;
        if (r32 == '{') goto L40;
        if (r32 == '}') goto L40;
        if (r32 == ':') goto L40;
        if (r32 == ';') goto L34;
        switch(r32) {
            case 91: goto L40;
            case 92: goto L34;
            case 93: goto L40;
            default: goto L33;
        };
    L33:
        r2 = r2 + 1;
    L34:
        m4202i();
        goto L40
    }

    /* JADX INFO: renamed from: C */
    public final EnumC2050b m4194C() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L5;
        r0 = m4203l();
    L5:
        switch(r0) {
            case 1: goto L27;
            case 2: goto L25;
            case 3: goto L23;
            case 4: goto L21;
            case 5: goto L19;
            case 6: goto L19;
            case 7: goto L17;
            case 8: goto L15;
            case 9: goto L15;
            case 10: goto L15;
            case 11: goto L15;
            case 12: goto L13;
            case 13: goto L13;
            case 14: goto L13;
            case 15: goto L11;
            case 16: goto L11;
            case 17: goto L9;
            default: goto L7;
        };
    L7:
        throw new AssertionError();
    L9:
        return EnumC2050b.END_DOCUMENT;
    L11:
        return EnumC2050b.NUMBER;
    L13:
        return EnumC2050b.NAME;
    L15:
        return EnumC2050b.STRING;
    L17:
        return EnumC2050b.NULL;
    L19:
        return EnumC2050b.BOOLEAN;
    L21:
        return EnumC2050b.END_ARRAY;
    L23:
        return EnumC2050b.BEGIN_ARRAY;
    L25:
        return EnumC2050b.END_OBJECT;
    L27:
        return EnumC2050b.BEGIN_OBJECT;
    }

    /* JADX INFO: renamed from: D */
    public final void m4195D(int r4) {
        int r0 = this.f7259m;
        int[] r1 = this.f7258l;
        if (r0 != r1.length) goto L5;
        int r02 = r0 * 2;
        this.f7258l = Arrays.copyOf(r1, r02);
        this.f7261o = Arrays.copyOf(this.f7261o, r02);
        this.f7260n = (String[]) Arrays.copyOf(this.f7260n, r02);
    L5:
        int[] r03 = this.f7258l;
        int r12 = this.f7259m;
        this.f7259m = r12 + 1;
        r03[r12] = r4;
    }

    /* JADX INFO: renamed from: E */
    public final char m4196E() {
        if (this.f7250d == this.f7251e) goto L5;
    L9:
        int r0 = this.f7250d;
        int r1 = r0 + 1;
        this.f7250d = r1;
        char[] r5 = this.f7249c;
        char r6 = r5[r0];
        if (r6 != '\n') goto L12;
        this.f7252f++;
        this.f7253g = r1;
        return r6;
    L12:
        if (r6 != '\"') goto L14;
    L71:
        return r6;
    L14:
        if (r6 == '\'') goto L71;
        if (r6 == '/') goto L71;
        if (r6 == '\\') goto L71;
        if (r6 != 'b') goto L22;
        return '\b';
    L22:
        if (r6 != 'f') goto L24;
        return '\f';
    L24:
        if (r6 != 'n') goto L26;
        return '\n';
    L26:
        if (r6 != 'r') goto L28;
        return '\r';
    L28:
        if (r6 != 't') goto L30;
        return '\t';
    L30:
        if (r6 == 'u') goto L32;
        m4199H("Invalid escape sequence");
        throw null;
    L32:
        if ((r0 + 5) > this.f7251e) goto L34;
    L38:
        int r02 = this.f7250d;
        int r2 = r02 + 4;
        char r3 = 0;
    L39:
        if (r02 >= r2) goto L58;
        char r4 = r5[r02];
        char r32 = (char) (r3 << 4);
        if (r4 < '0') goto L47;
        if (r4 > '9') goto L47;
        int r42 = r4 - '0';
    L45:
        r3 = (char) (r42 + r32);
        r02 = r02 + 1;
    L47:
        if (r4 < 'a') goto L51;
        if (r4 > 'f') goto L51;
        r42 = r4 - 'W';
    L51:
        if (r4 < 'A') goto L57;
        if (r4 > 'F') goto L57;
        r42 = r4 - '7';
    L57:
        throw new NumberFormatException("\\u".concat(new String(r5, this.f7250d, 4)));
    L58:
        this.f7250d += 4;
        return r3;
    L34:
        if (m4206p(4) == true) goto L38;
        m4199H("Unterminated escape sequence");
        throw null;
    L5:
        if (m4206p(1) == true) goto L9;
        m4199H("Unterminated escape sequence");
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final void m4197F(char r6) {
    L2:
        int r0 = this.f7250d;
        int r1 = this.f7251e;
    L4:
        if (r0 >= r1) goto L16;
        int r3 = r0 + 1;
        char r02 = this.f7249c[r0];
        if (r02 == r6) goto L7;
        if (r02 == '\\') goto L11;
        if (r02 != '\n') goto L15;
        this.f7252f++;
        this.f7253g = r3;
    L15:
        r0 = r3;
        goto L4
    L11:
        this.f7250d = r3;
        m4196E();
        r0 = this.f7250d;
        r1 = this.f7251e;
        goto L4
    L7:
        this.f7250d = r3;
        return;
    L16:
        this.f7250d = r0;
        if (m4206p(1) == true) goto L2;
        m4199H("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final void m4198G() {
    L3:
        if (this.f7250d >= this.f7251e) goto L5;
    L6:
        int r0 = this.f7250d;
        int r1 = r0 + 1;
        this.f7250d = r1;
        char r02 = this.f7249c[r0];
        if (r02 == '\n') goto L8;
        if (r02 != '\r') goto L3;
        return;
    L8:
        this.f7252f++;
        this.f7253g = r1;
        return;
    L5:
        if (m4206p(1) == true) goto L6;
    }

    /* JADX INFO: renamed from: H */
    public final void m4199H(String r3) {
        throw new C2273na(r3 + m4208r());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7254h = 0;
        this.f7258l[0] = 8;
        this.f7259m = 1;
        this.f7247a.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m4200d() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 3) goto L10;
        m4195D(1);
        this.f7261o[this.f7259m - 1] = 0;
        this.f7254h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: f */
    public final void m4201f() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 1) goto L10;
        m4195D(3);
        this.f7254h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: i */
    public final void m4202i() {
        if (this.f7248b == false) goto L5;
        return;
    L5:
        m4199H("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final int m4203l() {
        int[] r1 = this.f7258l;
        int r3 = 1;
        int r2 = this.f7259m - 1;
        int r4 = r1[r2];
        char[] r6 = this.f7249c;
        if (r4 != 1) goto L6;
        r1[r2] = 2;
    L5:
        int r12 = 0;
    L64:
        int r22 = m4214x(true);
        if (r22 == 34) goto L234;
        if (r22 == 39) goto L232;
        if (r22 == 44) goto L223;
        if (r22 == 59) goto L223;
        if (r22 == 91) goto L221;
        if (r22 != 93) goto L73;
        int r13 = 1;
        if (r4 != 1) goto L224;
        this.f7254h = 4;
        return 4;
    L224:
        if (r4 != r13) goto L226;
    L230:
        m4202i();
        this.f7250d -= r13;
        this.f7254h = 7;
        return 7;
    L226:
        if (r4 == 2) goto L230;
        m4199H("Unexpected value");
        throw null;
    L73:
        if (r22 == 123) goto L215;
        int r23 = this.f7250d - 1;
        this.f7250d = r23;
        char r24 = r6[r23];
        if (r24 != 't') goto L77;
    L92:
        String r25 = "true";
        String r42 = "TRUE";
        int r7 = 5;
    L93:
        int r9 = r25.length();
        int r10 = 1;
    L94:
        if (r10 >= r9) goto L107;
        if ((this.f7250d + r10) >= this.f7251e) goto L98;
    L100:
        char r11 = r6[this.f7250d + r10];
        if (r11 == r25.charAt(r10)) goto L105;
        if (r11 == r42.charAt(r10)) goto L105;
    L89:
        r7 = r12;
    L114:
        if (r7 == 0) goto L116;
        return r7;
    L116:
        int r26 = this.f7250d;
        int r43 = this.f7251e;
        int r72 = r12;
        int r112 = r72;
        int r17 = r112;
        boolean r132 = true;
        long r14 = 0;
    L118:
        if ((r26 + r112) == r43) goto L120;
    L127:
        char r15 = r6[r26 + r112];
        long r21 = 0;
        if (r15 != '+') goto L130;
        int r18 = r43;
        int r32 = 6;
        if (r72 != 5) goto L121;
    L197:
        r72 = r32;
    L206:
        r112 = r112 + 1;
        r43 = r18;
        r3 = 1;
    L121:
        int r92 = 0;
    L207:
        if (r92 == 0) goto L210;
        return r92;
    L210:
        if (m4207q(r6[this.f7250d]) == false) goto L213;
        m4202i();
        this.f7254h = 10;
        return 10;
    L213:
        m4199H("Expected value");
        throw null;
    L130:
        if (r15 != 'E') goto L132;
    L198:
        r18 = r43;
        if (r72 != 2) goto L201;
    L202:
        r72 = 5;
        goto L206
    L201:
        if (r72 != 4) goto L121;
    L132:
        if (r15 == 'e') goto L198;
        if (r15 != '-') goto L136;
        r18 = r43;
        r32 = 6;
        if (r72 != 0) goto L196;
        r72 = 1;
        r17 = 1;
        goto L206
    L196:
        if (r72 != 5) goto L121;
    L136:
        if (r15 != '.') goto L138;
        r18 = r43;
        if (r72 != 2) goto L121;
        r72 = 3;
        goto L206
    L138:
        if (r15 < '0') goto L168;
        if (r15 > '9') goto L168;
        if (r72 == r3) goto L144;
        if (r72 == 0) goto L144;
        if (r72 == 2) goto L148;
        r18 = r43;
        if (r72 != 3) goto L163;
        r72 = 4;
        goto L206
    L163:
        if (r72 == 5) goto L165;
        if (r72 != 6) goto L206;
    L165:
        r72 = 7;
        goto L206
    L148:
        if (r14 == 0) goto L121;
        r18 = r43;
        long r93 = (10 * r14) - ((long) (r15 - '0'));
        if (r14 > (-922337203685477580L)) goto L157;
        if (r14 == (-922337203685477580L)) goto L154;
    L156:
        boolean r16 = false;
    L158:
        r132 = r132 & r16;
        r14 = r93;
        goto L206
    L154:
        if (r93 >= r14) goto L156;
    L157:
        r16 = true;
    L144:
        r18 = r43;
        r14 = -(r15 - '0');
        r72 = 2;
    L168:
        if (m4207q(r15) == true) goto L121;
    L125:
        int r94 = 2;
        if (r72 != 2) goto L184;
        if (r132 == true) goto L173;
    L176:
        r94 = 2;
        goto L184
    L173:
        if (r14 != Long.MIN_VALUE) goto L178;
        if (r17 == 0) goto L176;
    L178:
        if (r14 != r21) goto L180;
        if (r17 != 0) goto L176;
    L180:
        if (r17 != 0) goto L183;
        r14 = -r14;
    L183:
        this.f7255i = r14;
        this.f7250d += r112;
        r92 = 15;
        this.f7254h = 15;
    L184:
        if (r72 != r94) goto L186;
    L189:
        this.f7256j = r112;
        r92 = 16;
        this.f7254h = 16;
        goto L207
    L186:
        if (r72 == 4) goto L189;
        if (r72 != 7) goto L121;
    L120:
        if (r112 == r6.length) goto L121;
        if (m4206p(r112 + 1) == false) goto L124;
        int r19 = this.f7250d;
        r43 = this.f7251e;
        r26 = r19;
        goto L127
    L124:
        r21 = 0;
    L105:
        r10 = r10 + 1;
        goto L94
    L98:
        if (m4206p(r10 + 1) == true) goto L100;
    L107:
        if ((this.f7250d + r9) < this.f7251e) goto L111;
        if (m4206p(r9 + 1) == true) goto L111;
    L113:
        this.f7250d += r9;
        this.f7254h = r7;
    L111:
        if (m4207q(r6[this.f7250d + r9]) == false) goto L113;
    L77:
        if (r24 == 'T') goto L92;
        if (r24 != 'f') goto L82;
    L91:
        r25 = "false";
        r42 = "FALSE";
        r7 = 6;
        goto L93
    L82:
        if (r24 == 'F') goto L91;
        if (r24 != 'n') goto L87;
    L90:
        r25 = "null";
        r42 = "NULL";
        r7 = 7;
        goto L93
    L87:
        if (r24 != 'N') goto L89;
    L215:
        this.f7254h = 1;
        return 1;
    L221:
        this.f7254h = 3;
        return 3;
    L223:
        r13 = 1;
        goto L224
    L232:
        m4202i();
        this.f7254h = 8;
        return 8;
    L234:
        this.f7254h = 9;
        return 9;
    L6:
        if (r4 != 2) goto L17;
        int r110 = m4214x(true);
        if (r110 == 44) goto L5;
        if (r110 == 59) goto L15;
        if (r110 != 93) goto L13;
        this.f7254h = 4;
        return 4;
    L13:
        m4199H("Unterminated array");
        throw null;
    L15:
        m4202i();
        goto L5
    L17:
        if (r4 == 3) goto L238;
        if (r4 == 5) goto L238;
        if (r4 != 4) goto L34;
        r1[r2] = 5;
        int r111 = m4214x(true);
        if (r111 == 58) goto L5;
        if (r111 != 61) goto L32;
        m4202i();
        if (this.f7250d >= this.f7251e) goto L28;
    L29:
        int r113 = this.f7250d;
        if (r6[r113] != '>') goto L5;
        this.f7250d = r113 + 1;
        goto L5
    L28:
        if (m4206p(1) == false) goto L5;
    L32:
        m4199H("Expected ':'");
        throw null;
    L34:
        if (r4 != 6) goto L56;
        if (this.f7248b == false) goto L54;
        m4214x(true);
        int r114 = this.f7250d;
        int r27 = r114 - 1;
        this.f7250d = r27;
        if ((r114 + 4) <= this.f7251e) goto L43;
        if (m4206p(5) == false) goto L54;
    L43:
        if (r6[r27] != ')') goto L54;
        if (r6[r114] != ']') goto L54;
        if (r6[r114 + 1] != '}') goto L54;
        if (r6[r114 + 2] != '\'') goto L54;
        if (r6[r114 + 3] != '\n') goto L54;
        this.f7250d += 5;
    L54:
        this.f7258l[this.f7259m - 1] = 7;
        goto L5
    L56:
        if (r4 != 7) goto L62;
        r12 = 0;
        if (m4214x(false) != (-1)) goto L61;
        this.f7254h = 17;
        return 17;
    L61:
        m4202i();
        this.f7250d--;
        goto L64
    L62:
        r12 = 0;
        if (r4 != 8) goto L64;
        throw new IllegalStateException("JsonReader is closed");
    L238:
        r1[r2] = 4;
        if (r4 != 5) goto L249;
        int r28 = m4214x(true);
        if (r28 == 44) goto L249;
        if (r28 == 59) goto L248;
        if (r28 != 125) goto L246;
        this.f7254h = 2;
        return 2;
    L246:
        m4199H("Unterminated object");
        throw null;
    L248:
        m4202i();
    L249:
        int r29 = m4214x(true);
        if (r29 == 34) goto L267;
        if (r29 != 39) goto L253;
        m4202i();
        this.f7254h = 12;
        return 12;
    L253:
        if (r29 == 125) goto L260;
        m4202i();
        this.f7250d--;
        if (m4207q((char) r29) == false) goto L258;
        this.f7254h = 14;
        return 14;
    L258:
        m4199H("Expected name");
        throw null;
    L260:
        if (r4 == 5) goto L263;
        this.f7254h = 2;
        return 2;
    L263:
        m4199H("Expected name");
        throw null;
    L267:
        this.f7254h = 13;
        return 13;
    }

    /* JADX INFO: renamed from: m */
    public final void m4204m() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 4) goto L10;
        int r02 = this.f7259m;
        this.f7259m = r02 - 1;
        int[] r1 = this.f7261o;
        int r03 = r02 - 2;
        r1[r03] = r1[r03] + 1;
        this.f7254h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected END_ARRAY but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: o */
    public final void m4205o() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 2) goto L10;
        int r02 = this.f7259m;
        int r2 = r02 - 1;
        this.f7259m = r2;
        this.f7260n[r2] = null;
        int[] r22 = this.f7261o;
        int r03 = r02 - 2;
        r22[r03] = r22[r03] + 1;
        this.f7254h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected END_OBJECT but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4206p(int r8) {
        int r0 = this.f7253g;
        int r1 = this.f7250d;
        this.f7253g = r0 - r1;
        int r02 = this.f7251e;
        char[] r3 = this.f7249c;
        if (r02 == r1) goto L5;
        int r03 = r02 - r1;
        this.f7251e = r03;
        System.arraycopy(r3, r1, r3, 0, r03);
    L6:
        this.f7250d = 0;
    L7:
        int r04 = this.f7251e;
        int r05 = this.f7247a.read(r3, r04, r3.length - r04);
        if (r05 == (-1)) goto L19;
        int r12 = this.f7251e + r05;
        this.f7251e = r12;
        if (this.f7252f != 0) goto L17;
        int r06 = this.f7253g;
        if (r06 != 0) goto L17;
        if (r12 <= 0) goto L17;
        if (r3[0] != 65279) goto L17;
        this.f7250d++;
        this.f7253g = r06 + 1;
        r8 = r8 + 1;
    L17:
        if (r12 < r8) goto L7;
        return true;
    L19:
        return false;
    L5:
        this.f7251e = 0;
        goto L6
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4207q(char r2) {
        if (r2 != '\t') goto L5;
        return false;
    L5:
        if (r2 != '\n') goto L7;
        return false;
    L7:
        if (r2 != '\f') goto L9;
        return false;
    L9:
        if (r2 != '\r') goto L11;
        return false;
    L11:
        if (r2 != ' ') goto L13;
        return false;
    L13:
        if (r2 != '#') goto L15;
    L31:
        m4202i();
        return false;
    L15:
        if (r2 != ',') goto L17;
        return false;
    L17:
        if (r2 == '/') goto L31;
        if (r2 == '=') goto L31;
        if (r2 != '{') goto L23;
        return false;
    L23:
        if (r2 != '}') goto L25;
        return false;
    L25:
        if (r2 != ':') goto L27;
        return false;
    L27:
        if (r2 == ';') goto L31;
        switch(r2) {
            case 91: goto L43;
            case 92: goto L31;
            case 93: goto L43;
            default: goto L29;
        };
    L29:
        return true;
    L43:
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final String m4208r() {
        int r0 = this.f7252f + 1;
        int r2 = (this.f7250d - this.f7253g) + 1;
        StringBuilder r3 = new StringBuilder(" at line ");
        r3.append(r0);
        r3.append(" column ");
        r3.append(r2);
        r3.append(" path ");
        StringBuilder r02 = new StringBuilder("$");
        int r22 = this.f7259m;
        int r4 = 0;
    L3:
        if (r4 >= r22) goto L20;
        int r5 = this.f7258l[r4];
        if (r5 != 1) goto L7;
    L18:
        r02.append('[');
        r02.append(this.f7261o[r4]);
        r02.append(']');
    L19:
        r4 = r4 + 1;
        goto L3
    L7:
        if (r5 == 2) goto L18;
        if (r5 != 3) goto L11;
    L15:
        r02.append('.');
        String r52 = this.f7260n[r4];
        if (r52 == null) goto L19;
        r02.append(r52);
        goto L19
    L11:
        if (r5 == 4) goto L15;
        if (r5 == 5) goto L15;
    L20:
        r3.append(r02.toString());
        return r3.toString();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4209s() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 5) goto L10;
        this.f7254h = 0;
        int[] r02 = this.f7261o;
        int r1 = this.f7259m - 1;
        r02[r1] = r02[r1] + 1;
        return true;
    L10:
        if (r0 != 6) goto L14;
        this.f7254h = 0;
        int[] r03 = this.f7261o;
        int r12 = this.f7259m - 1;
        r03[r12] = r03[r12] + 1;
        return false;
    L14:
        throw new IllegalStateException("Expected a boolean but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: t */
    public final double m4210t() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 15) goto L10;
        this.f7254h = 0;
        int[] r02 = this.f7261o;
        int r1 = this.f7259m - 1;
        r02[r1] = r02[r1] + 1;
        return this.f7255i;
    L10:
        if (r0 != 16) goto L13;
        this.f7257k = new String(this.f7249c, this.f7250d, this.f7256j);
        this.f7250d += this.f7256j;
    L28:
        this.f7254h = 11;
        double r03 = Double.parseDouble(this.f7257k);
        if (this.f7248b == false) goto L31;
    L37:
        this.f7257k = null;
        this.f7254h = 0;
        int[] r2 = this.f7261o;
        int r3 = this.f7259m - 1;
        r2[r3] = r2[r3] + 1;
        return r03;
    L31:
        if (Double.isNaN(r03) == true) goto L36;
        if (Double.isInfinite(r03) == false) goto L37;
    L36:
        throw new C2273na("JSON forbids NaN and infinities: " + r03 + m4208r());
    L13:
        if (r0 != 8) goto L15;
    L24:
        if (r0 != 8) goto L26;
        char r04 = '\'';
    L27:
        this.f7257k = m4216z(r04);
        goto L28
    L26:
        r04 = '\"';
        goto L27
    L15:
        if (r0 == 9) goto L24;
        if (r0 != 10) goto L20;
        this.f7257k = m4193B();
        goto L28
    L20:
        if (r0 == 11) goto L28;
        throw new IllegalStateException("Expected a double but was " + m4194C() + m4208r());
    }

    public final String toString() {
        return C2049a.class.getSimpleName() + m4208r();
    }

    /* JADX INFO: renamed from: u */
    public final int m4211u() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 15) goto L14;
        long r02 = this.f7255i;
        int r4 = (int) r02;
        if (r02 != r4) goto L12;
        this.f7254h = 0;
        int[] r03 = this.f7261o;
        int r1 = this.f7259m - 1;
        r03[r1] = r03[r1] + 1;
        return r4;
    L12:
        throw new NumberFormatException("Expected an int but was " + this.f7255i + m4208r());
    L14:
        if (r0 != 16) goto L17;
        this.f7257k = new String(this.f7249c, this.f7250d, this.f7256j);
        this.f7250d += this.f7256j;
    L32:
        this.f7254h = 11;
        double r04 = Double.parseDouble(this.f7257k);
        int r42 = (int) r04;
        if (r42 != r04) goto L37;
        this.f7257k = null;
        this.f7254h = 0;
        int[] r05 = this.f7261o;
        int r12 = this.f7259m - 1;
        r05[r12] = r05[r12] + 1;
        return r42;
    L37:
        throw new NumberFormatException("Expected an int but was " + this.f7257k + m4208r());
    L17:
        if (r0 != 8) goto L19;
    L24:
        if (r0 != 10) goto L26;
        this.f7257k = m4193B();
    L39:
        int r06 = Integer.parseInt(this.f7257k);     // Catch: NumberFormatException -> L38
        this.f7254h = 0;     // Catch: NumberFormatException -> L38
        int[] r13 = this.f7261o;     // Catch: NumberFormatException -> L38
        int r43 = this.f7259m - 1;
        r13[r43] = r13[r43] + 1;     // Catch: NumberFormatException -> L38
        return r06;
    L26:
        if (r0 != 8) goto L28;
        char r07 = '\'';
    L29:
        this.f7257k = m4216z(r07);
        goto L39
    L28:
        r07 = '\"';
        goto L29
    L19:
        if (r0 == 9) goto L24;
        if (r0 == 10) goto L24;
        throw new IllegalStateException("Expected an int but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: v */
    public final long m4212v() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 15) goto L10;
        this.f7254h = 0;
        int[] r02 = this.f7261o;
        int r1 = this.f7259m - 1;
        r02[r1] = r02[r1] + 1;
        return this.f7255i;
    L10:
        if (r0 != 16) goto L13;
        this.f7257k = new String(this.f7249c, this.f7250d, this.f7256j);
        this.f7250d += this.f7256j;
    L28:
        this.f7254h = 11;
        double r03 = Double.parseDouble(this.f7257k);
        long r4 = (long) r03;
        if (r4 != r03) goto L33;
        this.f7257k = null;
        this.f7254h = 0;
        int[] r04 = this.f7261o;
        int r12 = this.f7259m - 1;
        r04[r12] = r04[r12] + 1;
        return r4;
    L33:
        throw new NumberFormatException("Expected a long but was " + this.f7257k + m4208r());
    L13:
        if (r0 != 8) goto L15;
    L20:
        if (r0 != 10) goto L22;
        this.f7257k = m4193B();
    L35:
        long r05 = Long.parseLong(this.f7257k);     // Catch: NumberFormatException -> L34
        this.f7254h = 0;     // Catch: NumberFormatException -> L34
        int[] r42 = this.f7261o;     // Catch: NumberFormatException -> L34
        int r5 = this.f7259m - 1;
        r42[r5] = r42[r5] + 1;     // Catch: NumberFormatException -> L34
        return r05;
    L22:
        if (r0 != 8) goto L24;
        char r06 = '\'';
    L25:
        this.f7257k = m4216z(r06);
        goto L35
    L24:
        r06 = '\"';
        goto L25
    L15:
        if (r0 == 9) goto L20;
        if (r0 == 10) goto L20;
        throw new IllegalStateException("Expected a long but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: w */
    public final String m4213w() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 14) goto L9;
        String r02 = m4193B();
    L14:
        this.f7254h = 0;
        this.f7260n[this.f7259m - 1] = r02;
        return r02;
    L9:
        if (r0 != 12) goto L12;
        r02 = m4216z('\'');
        goto L14
    L12:
        if (r0 != 13) goto L17;
        r02 = m4216z('\"');
        goto L14
    L17:
        throw new IllegalStateException("Expected a name but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: x */
    public final int m4214x(boolean r10) {
        int r0 = this.f7250d;
        int r1 = this.f7251e;
    L4:
        if (r0 != r1) goto L13;
        this.f7250d = r0;
        if (m4206p(1) == false) goto L7;
        r0 = this.f7250d;
        r1 = this.f7251e;
        goto L13
    L7:
        if (r10 == true) goto L11;
        return -1;
    L11:
        throw new EOFException("End of input" + m4208r());
    L13:
        int r3 = r0 + 1;
        char[] r4 = this.f7249c;
        char r5 = r4[r0];
        if (r5 == '\n') goto L15;
        if (r5 == ' ') goto L58;
        if (r5 == '\r') goto L58;
        if (r5 == '\t') goto L58;
        if (r5 == '/') goto L25;
        if (r5 != '#') goto L56;
        this.f7250d = r3;
        m4202i();
        m4198G();
        r0 = this.f7250d;
        r1 = this.f7251e;
        goto L4
    L56:
        this.f7250d = r3;
        return r5;
    L25:
        this.f7250d = r3;
        if (r3 != r1) goto L30;
        this.f7250d = r0;
        boolean r02 = m4206p(2);
        this.f7250d++;
        if (r02 == true) goto L30;
    L33:
        return r5;
    L30:
        m4202i();
        int r03 = this.f7250d;
        char r12 = r4[r03];
        if (r12 != '*') goto L32;
        this.f7250d = r03 + 1;
    L37:
        if ((this.f7250d + 2) > this.f7251e) goto L39;
    L43:
        int r04 = this.f7250d;
        if (r4[r04] != '\n') goto L46;
        this.f7252f++;
        this.f7253g = r04 + 1;
    L50:
        this.f7250d++;
        goto L37
    L46:
        int r05 = 0;
    L47:
        if (r05 >= 2) goto L52;
        if (r4[this.f7250d + r05] != "*/".charAt(r05)) goto L50;
        r05 = r05 + 1;
        goto L47
    L52:
        r0 = this.f7250d + 2;
        r1 = this.f7251e;
        goto L4
    L39:
        if (m4206p(2) == true) goto L43;
        m4199H("Unterminated comment");
        throw null;
    L32:
        if (r12 != '/') goto L33;
        this.f7250d = r03 + 1;
        m4198G();
        r0 = this.f7250d;
        r1 = this.f7251e;
    L58:
        r0 = r3;
        goto L4
    L15:
        this.f7252f++;
        this.f7253g = r3;
        goto L58
    }

    /* JADX INFO: renamed from: y */
    public final void m4215y() {
        int r0 = this.f7254h;
        if (r0 != 0) goto L6;
        r0 = m4203l();
    L6:
        if (r0 != 7) goto L10;
        this.f7254h = 0;
        int[] r02 = this.f7261o;
        int r1 = this.f7259m - 1;
        r02[r1] = r02[r1] + 1;
        return;
    L10:
        throw new IllegalStateException("Expected null but was " + m4194C() + m4208r());
    }

    /* JADX INFO: renamed from: z */
    public final String m4216z(char r11) {
        StringBuilder r1 = null;
    L3:
        int r2 = this.f7250d;
        int r3 = this.f7251e;
    L4:
        int r4 = r3;
        int r32 = r2;
    L5:
        char[] r7 = this.f7249c;
        if (r2 >= r4) goto L25;
        int r8 = r2 + 1;
        char r22 = r7[r2];
        if (r22 == r11) goto L9;
        if (r22 == '\\') goto L17;
        if (r22 != '\n') goto L24;
        this.f7252f++;
        this.f7253g = r8;
    L24:
        r2 = r8;
        goto L5
    L17:
        this.f7250d = r8;
        int r82 = r8 - r32;
        int r23 = r82 - 1;
        if (r1 != null) goto L20;
        r1 = new StringBuilder(Math.max(r82 * 2, 16));
    L20:
        r1.append(r7, r32, r23);
        r1.append(m4196E());
        r2 = this.f7250d;
        r3 = this.f7251e;
        goto L4
    L9:
        this.f7250d = r8;
        int r83 = (r8 - r32) - 1;
        if (r1 == null) goto L12;
        r1.append(r7, r32, r83);
        return r1.toString();
    L12:
        return new String(r7, r32, r83);
    L25:
        if (r1 != null) goto L27;
        r1 = new StringBuilder(Math.max((r2 - r32) * 2, 16));
    L27:
        r1.append(r7, r32, r2 - r32);
        this.f7250d = r2;
        if (m4206p(1) == true) goto L3;
        m4199H("Unterminated string");
        throw null;
    }
}
