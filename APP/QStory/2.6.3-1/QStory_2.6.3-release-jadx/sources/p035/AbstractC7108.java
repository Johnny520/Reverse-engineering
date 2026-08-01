package p035;

import androidx.activity.AbstractC0900;
import kotlin.text.AbstractC5971;
import okio.ByteString;
import p020.C6943;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7108 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] f17678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f17679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] f17680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ByteString f17681;

    static {
        ByteString.Companion.getClass();
        f17681 = C6943.m12069("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f17680 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f17679 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = AbstractC7059.m12254("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        f17678 = strArr;
        String[] strArr2 = f17679;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC0900.m711(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f17679;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC0900.m711(sb, strArr3[i4], "|PADDED");
        }
        int length = f17679.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f17679;
            if (strArr4[i7] == null) {
                strArr4[i7] = f17678[i7];
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m12372(boolean z, int i, int i2, long j) {
        return AbstractC7059.m12254("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m12374(8), Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m12373(boolean z, int i, int i2, int i3, int i4) {
        String strM10696;
        String str;
        String strM12374 = m12374(i3);
        if (i4 == 0) {
            strM10696 = "";
        } else {
            String[] strArr = f17678;
            if (i3 == 2 || i3 == 3) {
                strM10696 = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM10696 = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 != 7 && i3 != 8) {
                String[] strArr2 = f17679;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                strM10696 = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str : AbstractC5971.m10696(str, "PRIORITY", "COMPRESSED") : AbstractC5971.m10696(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return AbstractC7059.m12254("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM12374, strM10696);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12374(int i) {
        String[] strArr = f17680;
        return i < strArr.length ? strArr[i] : AbstractC7059.m12254("0x%02x", Integer.valueOf(i));
    }
}
