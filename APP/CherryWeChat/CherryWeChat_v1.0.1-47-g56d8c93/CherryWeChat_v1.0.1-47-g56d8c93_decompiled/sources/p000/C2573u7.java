package p000;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2573u7 {

    /* JADX INFO: renamed from: a */
    public static final char[] f8921a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f8922b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m5080a('b', 8);
        m5080a('t', 9);
        m5080a('n', 10);
        m5080a('f', 12);
        m5080a('r', 13);
        m5080a('/', 47);
        m5080a('\"', 34);
        m5080a('\\', 92);
        byte[] bArr = f8922b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m5080a(char c, int i) {
        if (c != 'u') {
            f8921a[c] = (char) i;
        }
    }
}
