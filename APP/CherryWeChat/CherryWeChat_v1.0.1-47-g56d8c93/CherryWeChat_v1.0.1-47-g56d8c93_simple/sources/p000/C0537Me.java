package p000;

/* JADX INFO: renamed from: Me */
/* JADX INFO: loaded from: classes.dex */
public final class C0537Me implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final long f1747b = 0;

    /* JADX INFO: renamed from: c */
    public static final long f1748c = 0;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f1749d = 0;

    /* JADX INFO: renamed from: a */
    public final long f1750a;

    static {
        int r0 = AbstractC0580Ne.f1877a;
        f1747b = AbstractC0628Oj.m1244m(4611686018427387903L);
        f1748c = AbstractC0628Oj.m1244m(-4611686018427387903L);
    }

    public /* synthetic */ C0537Me(long r1) {
        this.f1750a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static final long m1030a(long r6, long r8) {
        long r0 = 1000000;
        long r2 = r8 / r0;
        long r62 = r6 + r2;
        if ((-4611686018426L) > r62) goto L9;
        if (r62 >= 4611686018427L) goto L9;
        long r63 = ((r62 * r0) + (r8 - (r2 * r0))) << 1;
        int r82 = AbstractC0580Ne.f1877a;
        return r63;
    L9:
        return AbstractC0628Oj.m1244m(AbstractC0828TB.m1640g(r62));
    }

    /* JADX INFO: renamed from: b */
    public static final void m1031b(StringBuilder r4, int r5, int r6, int r7, String r8, boolean r9) {
        r4.append(r5);
        if (r6 == 0) goto L30;
        r4.append('.');
        String r52 = String.valueOf(r6);
        if (r7 < 0) goto L29;
        if (r7 > r52.length()) goto L9;
        CharSequence r53 = r52.subSequence(0, r52.length());
    L15:
        String r54 = r53.toString();
        int r72 = -1;
        int r62 = r54.length() - 1;
        if (r62 < 0) goto L23;
    L17:
        int r2 = r62 - 1;
        if (r54.charAt(r62) != '0') goto L19;
        if (r2 < 0) goto L23;
        r62 = r2;
        goto L17
    L19:
        r72 = r62;
    L23:
        int r63 = r72 + 1;
        if (r9 == true) goto L27;
        if (r63 >= 3) goto L27;
        r4.append(r54, 0, r63);
    L27:
        r4.append(r54, 0, ((r72 + 3) / 3) * 3);
        goto L30
    L9:
        StringBuilder r64 = new StringBuilder(r7);
        int r73 = r7 - r52.length();
        int r22 = 1;
        if (1 > r73) goto L14;
    L11:
        r64.append('0');
        if (r22 == r73) goto L14;
        r22 = r22 + 1;
    L14:
        r64.append(r52);
        r53 = r64;
        goto L15
    L29:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r7, "Desired length ", " is less than zero."));
    L30:
        r4.append(r8);
    }

    /* JADX INFO: renamed from: c */
    public static final int m1032c(long r2) {
        if (m1033d(r2) == false) goto L7;
        return 0;
    L7:
        if ((((int) r2) & 1) != 1) goto L11;
        long r22 = ((r2 >> 1) % ((long) 1000)) * ((long) 1000000);
    L10:
        return (int) r22;
    L11:
        r22 = (r2 >> 1) % ((long) 1000000000);
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1033d(long r2) {
        if (r2 != f1747b) goto L5;
        return true;
    L5:
        if (r2 == f1748c) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static final long m1034e(long r3, long r5) {
        if (m1033d(r3) == false) goto L13;
        if (m1033d(r5) == true) goto L7;
    L11:
        return r3;
    L7:
        if ((r5 ^ r3) >= 0) goto L11;
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    L13:
        if (m1033d(r5) == false) goto L15;
        return r5;
    L15:
        int r0 = ((int) r3) & 1;
        if (r0 != (((int) r5) & 1)) goto L29;
        long r32 = (r3 >> 1) + (r5 >> 1);
        if (r0 != 0) goto L28;
        if ((-4611686018426999999L) > r32) goto L26;
        if (r32 >= 4611686018427000000L) goto L26;
        long r33 = r32 << 1;
        int r52 = AbstractC0580Ne.f1877a;
        return r33;
    L26:
        return AbstractC0628Oj.m1244m(r32 / ((long) 1000000));
    L28:
        return AbstractC0628Oj.m1245n(r32);
    L29:
        if (r0 != 1) goto L33;
        return m1030a(r3 >> 1, r5 >> 1);
    L33:
        return m1030a(r5 >> 1, r3 >> 1);
    }

    /* JADX INFO: renamed from: f */
    public static final long m1035f(long r3, EnumC0666Pe r5) {
        if (r3 != f1747b) goto L7;
        return Long.MAX_VALUE;
    L7:
        if (r3 != f1748c) goto L10;
        return Long.MIN_VALUE;
    L10:
        long r1 = r3 >> 1;
        if ((((int) r3) & 1) != 0) goto L13;
        EnumC0666Pe r32 = EnumC0666Pe.f2124b;
    L15:
        return r5.f2131a.convert(r1, r32.f2131a);
    L13:
        r32 = EnumC0666Pe.f2125c;
        goto L15
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r10) {
        long r0 = ((C0537Me) r10).f1750a;
        long r2 = this.f1750a;
        long r4 = r2 ^ r0;
        if (r4 < 0) goto L12;
        if ((((int) r4) & 1) == 0) goto L12;
        int r102 = (((int) r2) & 1) - (((int) r0) & 1);
        if (r2 < 0) goto L10;
        return r102;
    L10:
        return -r102;
    L12:
        if (r2 >= r0) goto L15;
        return -1;
    L15:
        if (r2 != r0) goto L18;
        return 0;
    L18:
        return 1;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof C0537Me) == false) goto L11;
        long r0 = ((C0537Me) r5).f1750a;
        if (this.f1750a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1750a);
    }

    public final String toString() {
        long r1 = this.f1750a;
        if (r1 != 0) goto L7;
        return "0s";
    L7:
        if (r1 != f1747b) goto L11;
        return "Infinity";
    L11:
        if (r1 != f1748c) goto L14;
        return "-Infinity";
    L14:
        int r6 = 0;
        if (r1 >= 0) goto L17;
        boolean r8 = true;
    L18:
        StringBuilder r9 = new StringBuilder();
        if (r8 == false) goto L21;
        r9.append('-');
    L21:
        if (r1 >= 0) goto L23;
        long r10 = -(r1 >> 1);
        r1 = (((int) r1) & 1) + (r10 << 1);
        int r5 = AbstractC0580Ne.f1877a;
    L23:
        long r102 = m1035f(r1, EnumC0666Pe.f2129g);
        if (m1033d(r1) == false) goto L26;
        int r52 = 0;
    L28:
        if (m1033d(r1) == false) goto L30;
        long r16 = 0;
        int r3 = 0;
    L32:
        if (m1033d(r1) == false) goto L34;
        int r4 = 0;
    L35:
        int r12 = m1032c(r1);
        if (r102 == r16) goto L38;
        boolean r2 = true;
    L39:
        if (r52 == 0) goto L41;
        boolean r122 = true;
    L42:
        if (r3 == 0) goto L44;
        boolean r13 = true;
    L45:
        if (r4 != 0) goto L49;
        if (r12 != 0) goto L49;
        boolean r14 = false;
    L50:
        if (r2 == false) goto L53;
        r9.append(r102);
        r9.append('d');
        r6 = 1;
    L53:
        if (r122 == true) goto L57;
        if (r2 == false) goto L61;
        if (r13 == true) goto L57;
        if (r14 == true) goto L57;
    L61:
        if (r13 == true) goto L65;
        if (r14 == false) goto L69;
        if (r122 == true) goto L65;
        if (r2 == true) goto L65;
    L69:
        if (r14 == false) goto L87;
        int r32 = r6 + 1;
        if (r6 <= 0) goto L73;
        r9.append(' ');
    L73:
        if (r4 != 0) goto L85;
        if (r2 == true) goto L85;
        if (r122 == true) goto L85;
        if (r13 == true) goto L85;
        if (r12 < 1000000) goto L82;
        m1031b(r9, r12 / 1000000, r12 % 1000000, 6, "ms", false);
    L86:
        r6 = r32;
        goto L87
    L82:
        if (r12 < 1000) goto L84;
        m1031b(r9, r12 / 1000, r12 % 1000, 3, "us", false);
        goto L86
    L84:
        r9.append(r12);
        r9.append("ns");
    L85:
        m1031b(r9, r4, r12, 9, "s", false);
    L87:
        if (r8 == false) goto L91;
        if (r6 <= 1) goto L91;
        r9.insert(1, '(').append(')');
    L91:
        return r9.toString();
    L65:
        int r53 = r6 + 1;
        if (r6 <= 0) goto L68;
        r9.append(' ');
    L68:
        r9.append(r3);
        r9.append('m');
        r6 = r53;
    L57:
        int r11 = r6 + 1;
        if (r6 <= 0) goto L60;
        r9.append(' ');
    L60:
        r9.append(r52);
        r9.append('h');
        r6 = r11;
    L49:
        r14 = true;
        goto L50
    L44:
        r13 = false;
        goto L45
    L41:
        r122 = false;
        goto L42
    L38:
        r2 = false;
        goto L39
    L34:
        r4 = (int) (m1035f(r1, EnumC0666Pe.f2126d) % ((long) 60));
        goto L35
    L30:
        r16 = 0;
        r3 = (int) (m1035f(r1, EnumC0666Pe.f2127e) % ((long) 60));
        goto L32
    L26:
        r52 = (int) (m1035f(r1, EnumC0666Pe.f2128f) % ((long) 24));
        goto L28
    L17:
        r8 = false;
        goto L18
    }
}
