package p248u3;

/* JADX INFO: renamed from: u3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3339c {

    /* JADX INFO: renamed from: a */
    public static final char[] f10384a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f10385b = new byte[126];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i5 = 0; i5 < 32; i5++) {
        }
        m5581a(8, 'b');
        m5581a(9, 't');
        m5581a(10, 'n');
        m5581a(12, 'f');
        m5581a(13, 'r');
        m5581a(47, '/');
        m5581a(34, '\"');
        m5581a(92, '\\');
        byte[] bArr = f10385b;
        for (int i6 = 0; i6 < 33; i6++) {
            bArr[i6] = 127;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5581a(int i5, char c5) {
        if (c5 != 'u') {
            f10384a[c5] = (char) i5;
        }
    }
}
