package p156e4;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p149d3.AbstractC1983k;
import p191k4.C2475a;
import p208n4.C2709h;

/* JADX INFO: renamed from: e4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2045h {

    /* JADX INFO: renamed from: a */
    public static final C2709h f6820a;

    /* JADX INFO: renamed from: b */
    public static final String[] f6821b;

    /* JADX INFO: renamed from: c */
    public static final String[] f6822c;

    /* JADX INFO: renamed from: d */
    public static final String[] f6823d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2709h c2709h = C2709h.f8630g;
        f6820a = C2475a.m4416e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f6821b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f6822c = new String[64];
        String[] strArr = new String[256];
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            AbstractC1665j.m2984d(binaryString, "toBinaryString(...)");
            strArr[i5] = AbstractC1983k.m3653P(AbstractC1776g.m3176c("%8s", binaryString), ' ', '0');
        }
        f6823d = strArr;
        String[] strArr2 = f6822c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = AbstractC0231b.m403n(new StringBuilder(), strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr2[i7];
            int i9 = iArr[0];
            String[] strArr3 = f6822c;
            int i10 = i9 | i8;
            strArr3[i10] = strArr3[i9] + '|' + strArr3[i8];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i9]);
            sb.append('|');
            strArr3[i10 | 8] = AbstractC0231b.m403n(sb, strArr3[i8], "|PADDED");
        }
        int length = f6822c.length;
        for (int i11 = 0; i11 < length; i11++) {
            String[] strArr4 = f6822c;
            if (strArr4[i11] == null) {
                strArr4[i11] = f6823d[i11];
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3749a(int i5) {
        String[] strArr = f6821b;
        return i5 < strArr.length ? strArr[i5] : AbstractC1776g.m3176c("0x%02x", Integer.valueOf(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m3750b(boolean z5, int i5, int i6, int i7, int i8) {
        String strM3654Q;
        String str;
        String strM3749a = m3749a(i7);
        if (i8 == 0) {
            strM3654Q = "";
        } else {
            String[] strArr = f6823d;
            if (i7 == 2 || i7 == 3) {
                strM3654Q = strArr[i8];
            } else if (i7 == 4 || i7 == 6) {
                strM3654Q = i8 == 1 ? "ACK" : strArr[i8];
            } else if (i7 != 7 && i7 != 8) {
                String[] strArr2 = f6822c;
                if (i8 < strArr2.length) {
                    str = strArr2[i8];
                    AbstractC1665j.m2982b(str);
                } else {
                    str = strArr[i8];
                }
                strM3654Q = (i7 != 5 || (i8 & 4) == 0) ? (i7 != 0 || (i8 & 32) == 0) ? str : AbstractC1983k.m3654Q(str, "PRIORITY", "COMPRESSED") : AbstractC1983k.m3654Q(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return AbstractC1776g.m3176c("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i5), Integer.valueOf(i6), strM3749a, strM3654Q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m3751c(boolean z5, int i5, int i6, long j5) {
        return AbstractC1776g.m3176c("%s 0x%08x %5d %-13s %d", z5 ? "<<" : ">>", Integer.valueOf(i5), Integer.valueOf(i6), m3749a(8), Long.valueOf(j5));
    }
}
