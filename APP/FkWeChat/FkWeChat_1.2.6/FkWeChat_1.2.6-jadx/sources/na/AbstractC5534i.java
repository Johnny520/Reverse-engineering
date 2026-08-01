package na;

/* JADX INFO: renamed from: na.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5534i {
    /* JADX INFO: renamed from: a */
    public static final byte[] m22556a(String[] strArr) {
        strArr.getClass();
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i11 = 0;
            while (i11 < length2) {
                bArr[i10] = (byte) str2.charAt(i11);
                i11++;
                i10++;
            }
        }
        return bArr;
    }
}
