package p000;

/* JADX INFO: renamed from: oz */
/* JADX INFO: loaded from: classes.dex */
public class C2341oz {

    /* JADX INFO: renamed from: a */
    public int f8216a;

    /* JADX INFO: renamed from: b */
    public final C0477L3 f8217b;

    /* JADX INFO: renamed from: c */
    public String f8218c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f8219d;

    /* JADX INFO: renamed from: e */
    public final String f8220e;

    public C2341oz(String r6) {
        C0477L3 r0 = new C0477L3();
        r0.f1575c = new Object[8];
        int[] r2 = new int[8];
        int r3 = 0;
    L4:
        if (r3 >= 8) goto L6;
        r2[r3] = -1;
        r3 = r3 + 1;
        goto L4
    L6:
        r0.f1576d = r2;
        r0.f1574b = -1;
        this.f8217b = r0;
        this.f8219d = new StringBuilder();
        this.f8220e = r6;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4750m(C2341oz r1, String r2, int r3, int r4) {
        if ((r4 & 2) == 0) goto L6;
        r3 = r1.f8216a;
    L6:
        if ((r4 & 4) == 0) goto L8;
        String r42 = "";
    L9:
        r1.m4762l(r3, r2, r42);
        throw null;
    L8:
        r42 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public final int m4751a(CharSequence r4, int r5) {
        int r0 = r5 + 4;
        if (r0 < r4.length()) goto L10;
        this.f8216a = r5;
        if (r0 < r4.length()) goto L7;
        m4750m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    L7:
        return m4751a(r4, this.f8216a);
    L10:
        int r1 = ((m4764o(r4, r5) << 12) + (m4764o(r4, r5 + 1) << 8)) + (m4764o(r4, r5 + 2) << 4);
        char r42 = (char) (m4764o(r4, r5 + 3) + r1);
        this.f8219d.append(r42);
        return r0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4752b() {
        int r0 = this.f8216a;
        if (r0 != (-1)) goto L5;
        return false;
    L5:
        String r1 = this.f8220e;
        if (r0 >= r1.length()) goto L28;
        char r12 = r1.charAt(r0);
        if (r12 == ' ') goto L27;
        if (r12 == '\n') goto L27;
        if (r12 == '\r') goto L27;
        if (r12 == '\t') goto L27;
        this.f8216a = r0;
        if (r12 != ',') goto L19;
    L26:
        return false;
    L19:
        if (r12 == ':') goto L26;
        if (r12 == ']') goto L26;
        if (r12 == '}') goto L26;
        return true;
    L27:
        r0 = r0 + 1;
        goto L5
    L28:
        this.f8216a = r0;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m4753c(int r9, String r10) {
        String r0 = this.f8220e;
        if ((r0.length() - r9) < r10.length()) goto L13;
        int r1 = r10.length();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L11;
        if (r10.charAt(r2) != (r0.charAt(r9 + r2) | ' ')) goto L9;
        r2 = r2 + 1;
        goto L5
    L9:
        m4750m(this, "Expected valid boolean literal prefix, but had '" + m4760j() + '\'', 0, 6);
        throw null;
    L11:
        this.f8216a = r10.length() + r9;
        return;
    L13:
        m4750m(this, "Unexpected end of boolean literal", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final String m4754d() {
        m4757g('\"');
        int r1 = this.f8216a;
        String r2 = this.f8220e;
        int r4 = AbstractC2564tz.m5056Q(r2, '\"', r1, 4);
        if (r4 == (-1)) goto L48;
        int r9 = r1;
    L5:
        if (r9 >= r4) goto L46;
        if (r2.charAt(r9) == '\\') goto L8;
        r9 = r9 + 1;
        goto L5
    L8:
        int r12 = this.f8216a;
        char r42 = r2.charAt(r9);
        boolean r10 = false;
    L9:
        StringBuilder r122 = this.f8219d;
        if (r42 == '\"') goto L40;
        if (r42 != '\\') goto L32;
        r122.append(r2, r12, r9);
        int r13 = m4766q(r9 + 1);
        if (r13 == (-1)) goto L30;
        int r92 = r13 + 1;
        char r14 = r2.charAt(r13);
        if (r14 != 'u') goto L18;
        r92 = m4751a(r2, r92);
    L23:
        r12 = m4766q(r92);
        if (r12 == (-1)) goto L26;
    L25:
        r9 = r12;
        r10 = true;
    L39:
        r42 = r2.charAt(r9);
        goto L9
    L26:
        m4750m(this, "Unexpected EOF", r12, 4);
        throw null;
    L18:
        if (r14 >= 'u') goto L20;
        char r102 = C2573u7.f8921a[r14];
    L21:
        if (r102 == 0) goto L28;
        r122.append(r102);
        goto L23
    L28:
        m4750m(this, "Invalid escaped char '" + r14 + '\'', 0, 6);
        throw null;
    L20:
        r102 = 0;
        goto L21
    L30:
        m4750m(this, "Expected escape sequence to continue, got EOF", 0, 6);
        throw null;
    L32:
        r9 = r9 + 1;
        if (r9 < r2.length()) goto L39;
        r122.append(r2, r12, r9);
        r12 = m4766q(r9);
        if (r12 != (-1)) goto L25;
        m4750m(this, "Unexpected EOF", r12, 4);
        throw null;
    L40:
        if (r10 == true) goto L42;
        String r0 = r2.subSequence(r12, r9).toString();
    L43:
        this.f8216a = r9 + 1;
        return r0;
    L42:
        r122.append(r2, r12, r9);
        r0 = r122.toString();
        r122.setLength(0);
        goto L43
    L46:
        this.f8216a = r4 + 1;
        return r2.substring(r1, r4);
    L48:
        m4760j();
        m4763n((byte) 1, false);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public byte m4755e() {
        int r0 = this.f8216a;
    L3:
        String r3 = this.f8220e;
        if (r0 == (-1)) goto L18;
        if (r0 >= r3.length()) goto L18;
        int r1 = r0 + 1;
        char r02 = r3.charAt(r0);
        if (r02 == ' ') goto L17;
        if (r02 == '\n') goto L17;
        if (r02 == '\r') goto L17;
        if (r02 == '\t') goto L17;
        this.f8216a = r1;
        return AbstractC0148Dc.m269c(r02);
    L17:
        r0 = r1;
    L18:
        this.f8216a = r3.length();
        return 10;
    }

    /* JADX INFO: renamed from: f */
    public final byte m4756f(byte r2) {
        byte r0 = m4755e();
        if (r0 != r2) goto L5;
        return r0;
    L5:
        m4763n(r2, true);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public void m4757g(char r6) {
        int r0 = this.f8216a;
        if (r0 == (-1)) goto L23;
    L4:
        String r3 = this.f8220e;
        if (r0 >= r3.length()) goto L21;
        int r4 = r0 + 1;
        char r02 = r3.charAt(r0);
        if (r02 == ' ') goto L20;
        if (r02 == '\n') goto L20;
        if (r02 == '\r') goto L20;
        if (r02 == '\t') goto L20;
        this.f8216a = r4;
        if (r02 != r6) goto L18;
        return;
    L18:
        m4770u(r6);
        throw null;
    L20:
        r0 = r4;
        goto L4
    L21:
        this.f8216a = -1;
        m4770u(r6);
        throw null;
    L23:
        m4770u(r6);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final long m4758h() {
        int r1 = m4766q(m4767r());
        String r2 = this.f8220e;
        int r6 = 6;
        int r7 = 0;
        if (r1 < r2.length()) goto L5;
    L113:
        m4750m(this, "EOF", 0, 6);
        throw null;
    L5:
        if (r1 == (-1)) goto L113;
        if (r2.charAt(r1) != '\"') goto L13;
        r1 = r1 + 1;
        if (r1 == r2.length()) goto L11;
        boolean r3 = true;
    L14:
        int r12 = r1;
        int r11 = 0;
        boolean r13 = false;
        boolean r14 = false;
        long r9 = 0;
        long r15 = 0;
        long r17 = 0;
    L15:
        long r20 = r15;
        if (r12 == r2.length()) goto L63;
        char r5 = r2.charAt(r12);
        if (r5 != 'e') goto L20;
    L21:
        if (r13 == true) goto L27;
        if (r12 == r1) goto L24;
        r12 = r12 + 1;
        r15 = r20;
        r11 = 1;
        r13 = true;
        goto L15
    L24:
        m4750m(this, "Unexpected symbol " + r5 + " in numeric literal", r7, r6);
        throw null;
    L27:
        if (r5 != '-') goto L35;
        if (r13 == false) goto L35;
        if (r12 == r1) goto L32;
        r12 = r12 + 1;
        r11 = r7;
        r15 = r20;
        r6 = 6;
        goto L15
    L32:
        m4750m(this, "Unexpected symbol '-' in numeric literal", r7, 6);
        throw null;
    L35:
        if (r5 != '+') goto L42;
        if (r13 == false) goto L42;
        if (r12 == r1) goto L39;
        r12 = r12 + 1;
        r15 = r20;
        r6 = 6;
        r11 = 1;
        goto L15
    L39:
        m4750m(this, "Unexpected symbol '+' in numeric literal", r7, 6);
        throw null;
    L42:
        if (r5 != '-') goto L48;
        if (r12 != r1) goto L45;
        r12 = r12 + 1;
        r15 = r20;
        r6 = 6;
        r14 = true;
        goto L15
    L45:
        m4750m(this, "Unexpected symbol '-' in numeric literal", r7, 6);
        throw null;
    L48:
        if (AbstractC0148Dc.m269c(r5) != 0) goto L63;
        r12 = r12 + 1;
        int r62 = r5 - '0';
        if (r62 < 0) goto L61;
        if (r62 >= 10) goto L61;
        if (r13 == false) goto L56;
        r9 = (r9 * ((long) 10)) + ((long) r62);
    L55:
        r15 = r20;
        r6 = 6;
        r7 = 0;
        goto L15
    L56:
        r17 = (r17 * ((long) 10)) - ((long) r62);
        if (r17 <= r20) goto L55;
        m4750m(this, "Numeric value overflow", 0, 6);
        throw null;
    L61:
        m4750m(this, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
        throw null;
    L20:
        if (r5 != 'E') goto L27;
    L63:
        if (r12 == r1) goto L65;
        boolean r52 = true;
    L66:
        if (r1 == r12) goto L111;
        if (r14 == true) goto L69;
    L72:
        if (r3 == false) goto L81;
        if (r52 == true) goto L75;
        m4750m(this, "EOF", 0, 6);
        throw null;
    L75:
        if (r2.charAt(r12) != '\"') goto L77;
        r12 = r12 + 1;
        goto L81
    L77:
        m4750m(this, "Expected closing quotation mark", 0, 6);
        throw null;
    L81:
        this.f8216a = r12;
        long r16 = r17;
        if (r13 == false) goto L102;
        double r18 = r16;
        if (r11 != 0) goto L87;
        double r32 = Math.pow(10.0d, -r9);
    L89:
        double r19 = r18 * r32;
        if (r19 <= 9.223372036854776E18d) goto L92;
    L98:
        m4750m(this, "Numeric value overflow", 0, 6);
        throw null;
    L92:
        if (r19 < (-9.223372036854776E18d)) goto L98;
        if (Math.floor(r19) != r19) goto L96;
        long r10 = (long) r19;
    L103:
        if (r14 == false) goto L106;
        return r10;
    L106:
        if (r10 != Long.MIN_VALUE) goto L108;
        m4750m(this, "Numeric value overflow", 0, 6);
        throw null;
    L108:
        return -r10;
    L96:
        m4750m(this, "Can't convert " + r19 + " to Long", 0, 6);
        throw null;
    L87:
        if (r11 != 1) goto L101;
        r32 = Math.pow(10.0d, r9);
        goto L89
    L101:
        throw new C0232Fa();
    L102:
        r10 = r16;
        goto L103
    L69:
        if (r1 != (r12 - 1)) goto L72;
    L111:
        m4750m(this, "Expected numeric literal", 0, 6);
        throw null;
    L65:
        r52 = false;
        goto L66
    L11:
        m4750m(this, "EOF", 0, 6);
        throw null;
    L13:
        r3 = false;
        goto L14
    }

    /* JADX INFO: renamed from: i */
    public final String m4759i() {
        String r0 = this.f8218c;
        if (r0 == null) goto L7;
        this.f8218c = null;
        return r0;
    L7:
        return m4754d();
    }

    /* JADX INFO: renamed from: j */
    public final String m4760j() {
        String r0 = this.f8218c;
        if (r0 == null) goto L6;
        this.f8218c = null;
        return r0;
    L6:
        int r02 = m4767r();
        String r2 = this.f8220e;
        if (r02 < r2.length()) goto L9;
    L33:
        m4750m(this, "EOF", r02, 4);
        throw null;
    L9:
        if (r02 == (-1)) goto L33;
        byte r4 = AbstractC0148Dc.m269c(r2.charAt(r02));
        if (r4 != 1) goto L15;
        return m4759i();
    L15:
        if (r4 != 0) goto L31;
        boolean r1 = false;
    L17:
        byte r42 = AbstractC0148Dc.m269c(r2.charAt(r02));
        StringBuilder r7 = this.f8219d;
        if (r42 != 0) goto L26;
        r02 = r02 + 1;
        if (r02 < r2.length()) goto L17;
        r7.append(r2, this.f8216a, r02);
        int r12 = m4766q(r02);
        if (r12 == (-1)) goto L23;
        r02 = r12;
        r1 = true;
        goto L17
    L23:
        this.f8216a = r02;
        r7.append(r2, 0, 0);
        String r03 = r7.toString();
        r7.setLength(0);
        return r03;
    L26:
        if (r1 == true) goto L28;
        String r13 = r2.subSequence(this.f8216a, r02).toString();
    L29:
        this.f8216a = r02;
        return r13;
    L28:
        r7.append(r2, this.f8216a, r02);
        r13 = r7.toString();
        r7.setLength(0);
        goto L29
    L31:
        m4750m(this, "Expected beginning of the string, but got " + r2.charAt(r02), 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final String m4761k() {
        String r0 = m4760j();
        if (AbstractC0585Nj.m1134a(r0, "null") == true) goto L5;
    L9:
        return r0;
    L5:
        if (this.f8220e.charAt(this.f8216a - 1) == '\"') goto L9;
        m4750m(this, "Unexpected 'null' value instead of string literal", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final void m4762l(int r2, String r3, String r4) {
        if (r4.length() != 0) goto L5;
        String r42 = "";
    L7:
        throw AbstractC1293cr.m2543b(r2, this.f8220e, r3 + " at path: " + this.f8217b.m934c() + r42);
    L5:
        r42 = "\n".concat(r4);
        goto L7
    }

    /* JADX INFO: renamed from: n */
    public final void m4763n(byte r4, boolean r5) {
        String r42 = AbstractC0148Dc.m288v(r4);
        if (r5 == false) goto L5;
        int r52 = this.f8216a - 1;
    L6:
        int r0 = this.f8216a;
        String r1 = this.f8220e;
        if (r0 == r1.length()) goto L11;
        if (r52 < 0) goto L11;
        String r02 = String.valueOf(r1.charAt(r52));
    L12:
        m4750m(this, "Expected " + r42 + ", but had '" + r02 + "' instead", r52, 4);
        throw null;
    L11:
        r02 = "EOF";
        goto L12
    L5:
        r52 = this.f8216a;
        goto L6
    }

    /* JADX INFO: renamed from: o */
    public final int m4764o(CharSequence r2, int r3) {
        char r22 = r2.charAt(r3);
        if ('0' > r22) goto L9;
        if (r22 >= ':') goto L9;
        return r22 - '0';
    L9:
        if ('a' > r22) goto L15;
        if (r22 >= 'g') goto L15;
        return r22 - 'W';
    L15:
        if ('A' <= r22) goto L17;
    L20:
        m4750m(this, "Invalid toHexChar char '" + r22 + "' in unicode escape", 0, 6);
        throw null;
    L17:
        if (r22 >= 'G') goto L20;
        return r22 - '7';
    }

    /* JADX INFO: renamed from: p */
    public byte m4765p() {
        int r0 = this.f8216a;
    L3:
        int r02 = m4766q(r0);
        if (r02 == (-1)) goto L15;
        char r1 = this.f8220e.charAt(r02);
        if (r1 == '\t') goto L14;
        if (r1 == '\n') goto L14;
        if (r1 == '\r') goto L14;
        if (r1 == ' ') goto L14;
        this.f8216a = r02;
        return AbstractC0148Dc.m269c(r1);
    L14:
        r0 = r02 + 1;
        goto L3
    L15:
        this.f8216a = r02;
        return 10;
    }

    /* JADX INFO: renamed from: q */
    public final int m4766q(int r2) {
        if (r2 >= this.f8220e.length()) goto L5;
        return r2;
    L5:
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public int m4767r() {
        int r0 = this.f8216a;
        if (r0 != (-1)) goto L5;
        return r0;
    L5:
        String r1 = this.f8220e;
        if (r0 >= r1.length()) goto L16;
        char r12 = r1.charAt(r0);
        if (r12 == ' ') goto L15;
        if (r12 == '\n') goto L15;
        if (r12 == '\r') goto L15;
        if (r12 != '\t') goto L16;
    L15:
        r0 = r0 + 1;
    L16:
        this.f8216a = r0;
        return r0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4768s() {
        int r0 = m4767r();
        String r1 = this.f8220e;
        if (r0 < r1.length()) goto L5;
    L11:
        return false;
    L5:
        if (r0 == (-1)) goto L11;
        if (r1.charAt(r0) != ',') goto L11;
        this.f8216a++;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4769t(boolean r9) {
        int r0 = m4766q(m4767r());
        String r1 = this.f8220e;
        int r2 = r1.length() - r0;
        if (r2 >= 4) goto L5;
    L21:
        return false;
    L5:
        if (r0 == (-1)) goto L21;
        int r5 = 0;
    L8:
        if (r5 >= 4) goto L13;
        if ("null".charAt(r5) != r1.charAt(r0 + r5)) goto L21;
        r5 = r5 + 1;
        goto L8
    L13:
        if (r2 <= 4) goto L18;
        if (AbstractC0148Dc.m269c(r1.charAt(r0 + 4)) == 0) goto L21;
    L18:
        if (r9 == false) goto L20;
        this.f8216a = r0 + 4;
    L20:
        return true;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("JsonReader(source='");
        r0.append(this.f8220e);
        r0.append("', currentPosition=");
        return AbstractC0213Ey.m408f(r0, this.f8216a, ')');
    }

    /* JADX INFO: renamed from: u */
    public final void m4770u(char r5) {
        int r0 = this.f8216a;
        if (r0 > 0) goto L5;
    L15:
        m4763n(AbstractC0148Dc.m269c(r5), true);
        throw null;
    L5:
        if (r5 != '\"') goto L15;
        this.f8216a = r0 - 1;     // Catch: Throwable -> L12
        String r3 = m4760j();     // Catch: Throwable -> L12
        this.f8216a = r0;
        if (AbstractC0585Nj.m1134a(r3, "null") == false) goto L15;
        m4762l(this.f8216a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
        throw null;
    L12:
        th = move-exception;
        this.f8216a = r0;
        throw th;
    }
}
