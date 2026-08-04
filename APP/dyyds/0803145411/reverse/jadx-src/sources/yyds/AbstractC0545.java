package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛲᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2534 f2617;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final String[] f2618;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String[] f2619;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final String[] f2620;

    static {
        C2534 c2534 = new C2534("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(AbstractC0347.f1806));
        c2534.f12476 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f2617 = c2534;
        f2618 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f2619 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = AbstractC0795.m1810("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f2620 = strArr;
        String[] strArr2 = f2619;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC2104.m4015(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f2619;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC2104.m4015(sb, strArr3[i4], "|PADDED");
        }
        int length = f2619.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f2619;
            if (strArr4[i7] == null) {
                strArr4[i7] = f2620[i7];
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m1379(int i) {
        String[] strArr = f2618;
        return i < strArr.length ? strArr[i] : AbstractC0795.m1810("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1380(boolean z, int i, int i2, int i3, int i4) {
        String strM1598;
        String strM1379 = m1379(i3);
        if (i4 == 0) {
            strM1598 = "";
        } else {
            String[] strArr = f2620;
            if (i3 == 2 || i3 == 3) {
                strM1598 = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM1598 = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 != 7 && i3 != 8) {
                String[] strArr2 = f2619;
                String str = i4 < strArr2.length ? strArr2[i4] : strArr[i4];
                strM1598 = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str : AbstractC0692.m1598(str, "PRIORITY", "COMPRESSED") : AbstractC0692.m1598(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return AbstractC0795.m1810("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM1379, strM1598);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static String m1381(boolean z, int i, int i2, long j) {
        return AbstractC0795.m1810("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m1379(8), Long.valueOf(j));
    }
}
