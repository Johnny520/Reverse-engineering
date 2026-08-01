package p054df;

/* JADX INFO: renamed from: df.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1959e {
    /* JADX INFO: renamed from: a */
    public static String m7101a(int i10) {
        StringBuilder sb2 = new StringBuilder("\\u");
        String hexString = Integer.toHexString(i10);
        if (hexString.startsWith("0")) {
            hexString = hexString.substring(1);
        }
        if (hexString.length() <= 4) {
            sb2.append(m7103c(hexString.length()));
        }
        sb2.append(hexString);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m7102b(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            int i10 = 0;
            while (i10 < str.length()) {
                sb2.append(m7101a(Character.codePointAt(str, i10)));
                if (Character.isHighSurrogate(str.charAt(i10))) {
                    i10++;
                }
                i10++;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m7103c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 4 - i10; i11++) {
            sb2.append("0");
        }
        return sb2.toString();
    }
}
