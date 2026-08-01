package p248u3;

/* JADX INFO: renamed from: u3.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3344h {

    /* JADX INFO: renamed from: a */
    public static final String[] f10396a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f10397b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String[] strArr = new String[93];
        for (int i5 = 0; i5 < 32; i5++) {
            strArr[i5] = "\\u" + m5597a(i5 >> 12) + m5597a(i5 >> 8) + m5597a(i5 >> 4) + m5597a(i5);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f10396a = strArr;
        byte[] bArr = new byte[93];
        for (int i6 = 0; i6 < 32; i6++) {
            bArr[i6] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f10397b = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final char m5597a(int i5) {
        int i6 = i5 & 15;
        return (char) (i6 < 10 ? i6 + 48 : i6 + 87);
    }
}
