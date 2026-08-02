package p000;

/* JADX INFO: renamed from: tq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743tq {

    /* JADX INFO: renamed from: a */
    public static final char[] f10896a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f10897b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m5376a(8, 'b');
        m5376a(9, 't');
        m5376a(10, 'n');
        m5376a(12, 'f');
        m5376a(13, 'r');
        m5376a(47, '/');
        m5376a(34, '\"');
        m5376a(92, '\\');
        byte[] bArr = f10897b;
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
    public static void m5376a(int i, char c) {
        if (c != 'u') {
            f10896a[c] = (char) i;
        }
    }
}
