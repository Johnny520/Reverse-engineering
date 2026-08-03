package p000;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2573u7 {

    /* JADX INFO: renamed from: a */
    public static final char[] f8921a = null;

    /* JADX INFO: renamed from: b */
    public static final byte[] f8922b = null;

    static {
        f8921a = new char[117];
        f8922b = new byte[126];
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= 32) goto L6;
        r1 = r1 + 1;
        goto L4
    L6:
        m5080a('b', 8);
        m5080a('t', 9);
        m5080a('n', 10);
        m5080a('f', 12);
        m5080a('r', 13);
        m5080a('/', 47);
        m5080a('\"', 34);
        m5080a('\\', 92);
        byte[] r8 = f8922b;
    L8:
        if (r0 >= 33) goto L10;
        r8[r0] = 127;
        r0 = r0 + 1;
        goto L8
    L10:
        r8[9] = 3;
        r8[10] = 3;
        r8[13] = 3;
        r8[32] = 3;
        r8[44] = 4;
        r8[58] = 5;
        r8[123(0x7b, float:1.72E-43)] = 6;
        r8[125(0x7d, float:1.75E-43)] = 7;
        r8[91] = 8;
        r8[93] = 9;
        r8[34] = 1;
        r8[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m5080a(char r1, int r2) {
        if (r1 == 'u') goto L6;
        f8921a[r1] = (char) r2;
        return;
    }
}
