package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jv0 {

    /* JADX INFO: renamed from: a */
    public static final C0505no f5231a;

    /* JADX INFO: renamed from: b */
    public static final String[] f5232b;

    /* JADX INFO: renamed from: c */
    public static final String[] f5233c;

    /* JADX INFO: renamed from: d */
    public static final String[] f5234d;

    static {
        C0505no c0505no = C0505no.f7266k;
        f5231a = C0160eb.m1321z("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f5232b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f5233c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = wg3.m5891d("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        f5234d = strArr;
        String[] strArr2 = f5233c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = hk1.m2211j(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f5233c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = hk1.m2211j(sb, strArr3[i4], "|PADDED");
        }
        int length = f5233c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f5233c;
            if (strArr4[i7] == null) {
                strArr4[i7] = f5234d[i7];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2579a(int i) {
        String[] strArr = f5232b;
        return i < strArr.length ? strArr[i] : wg3.m5891d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2580b(boolean z, int i, int i2, int i3, int i4) {
        String strM6010b0;
        String str;
        String strM2579a = m2579a(i3);
        if (i4 == 0) {
            strM6010b0 = "";
        } else {
            String[] strArr = f5234d;
            if (i3 == 2 || i3 == 3) {
                strM6010b0 = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM6010b0 = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 != 7 && i3 != 8) {
                String[] strArr2 = f5233c;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                strM6010b0 = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str : wv2.m6010b0(str, "PRIORITY", "COMPRESSED") : wv2.m6010b0(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return wg3.m5891d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM2579a, strM6010b0);
    }

    /* JADX INFO: renamed from: c */
    public static String m2581c(boolean z, int i, int i2, long j) {
        return wg3.m5891d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m2579a(8), Long.valueOf(j));
    }
}
