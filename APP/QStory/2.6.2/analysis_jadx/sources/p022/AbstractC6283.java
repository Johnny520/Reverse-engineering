package p022;

import androidx.activity.AbstractC0053;
import okio.ByteString;
import p005.C6123;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] f17351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f17352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] f17353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ByteString f17354;

    static {
        ByteString.Companion.getClass();
        f17354 = C6123.m11517("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f17353 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f17352 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = AbstractC6238.m11703("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        f17351 = strArr;
        String[] strArr2 = f17352;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC0053.m146(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f17352;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC0053.m146(sb, strArr3[i4], "|PADDED");
        }
        int length = f17352.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f17352;
            if (strArr4[i7] == null) {
                strArr4[i7] = f17351[i7];
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m11796(boolean z, int i, int i2, long j) {
        return AbstractC6238.m11703("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m11798(8), Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m11797(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String r0 = m11798(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L57
        L9:
            r1 = 2
            java.lang.String[] r2 = p022.AbstractC6283.f17351
            if (r7 == r1) goto L55
            r1 = 3
            if (r7 == r1) goto L55
            r1 = 4
            if (r7 == r1) goto L4c
            r1 = 6
            if (r7 == r1) goto L4c
            r1 = 7
            if (r7 == r1) goto L55
            r1 = 8
            if (r7 == r1) goto L55
            java.lang.String[] r1 = p022.AbstractC6283.f17352
            int r3 = r1.length
            if (r8 >= r3) goto L29
            r1 = r1[r8]
            r1.getClass()
            goto L2b
        L29:
            r1 = r2[r8]
        L2b:
            r2 = 5
            if (r7 != r2) goto L3b
            r2 = r8 & 4
            if (r2 == 0) goto L3b
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = kotlin.text.AbstractC5138.m10128(r1, r7, r8)
            goto L57
        L3b:
            if (r7 != 0) goto L4a
            r7 = r8 & 32
            if (r7 == 0) goto L4a
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = kotlin.text.AbstractC5138.m10128(r1, r7, r8)
            goto L57
        L4a:
            r7 = r1
            goto L57
        L4c:
            r7 = 1
            if (r8 != r7) goto L52
            java.lang.String r7 = "ACK"
            goto L57
        L52:
            r7 = r2[r8]
            goto L57
        L55:
            r7 = r2[r8]
        L57:
            if (r4 == 0) goto L5c
            java.lang.String r4 = "<<"
            goto L5e
        L5c:
            java.lang.String r4 = ">>"
        L5e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = p017.AbstractC6238.m11703(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.AbstractC6283.m11797(boolean, int, int, int, int):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11798(int i) {
        String[] strArr = f17353;
        return i < strArr.length ? strArr[i] : AbstractC6238.m11703("0x%02x", Integer.valueOf(i));
    }
}
