package ad;

import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: ad.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0256f1 {

    /* JADX INFO: renamed from: a */
    public static final String[] f635a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f636b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + m756e(i10 >> 12) + m756e(i10 >> 8) + m756e(i10 >> 4) + m756e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f635a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f636b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m752a() {
        return f636b;
    }

    /* JADX INFO: renamed from: b */
    public static final String[] m753b() {
        return f635a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m754c(StringBuilder sb2, String str) {
        sb2.getClass();
        str.getClass();
        sb2.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            String[] strArr = f635a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) str, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) str, i10, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    /* JADX INFO: renamed from: d */
    public static final Boolean m755d(String str) {
        str.getClass();
        if (AbstractC8611a0.m33061F(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (AbstractC8611a0.m33061F(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final char m756e(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }
}
