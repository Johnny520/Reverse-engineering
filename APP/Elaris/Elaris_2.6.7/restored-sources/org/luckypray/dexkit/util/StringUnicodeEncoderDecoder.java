package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public class StringUnicodeEncoderDecoder {
    private static final String DELIMITER = "\\\\u";
    private static final String UNICODE_PREFIX = "\\u";
    private static final String UPPER_CASE_UNICODE_PREFIX = "\\U";
    private static final String UPPER_CASE_UNICODE_PREFIX_REGEX = "\\\\U";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String convertCodePointToUnicodeString(int i) {
        StringBuilder sb = new StringBuilder(UNICODE_PREFIX);
        String hexString = Integer.toHexString(i);
        if (hexString.startsWith("0")) {
            hexString = hexString.substring(1);
        }
        if (hexString.length() <= 4) {
            sb.append(getPrecedingZerosStr(hexString.length()));
        }
        sb.append(hexString);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String decodeUnicodeSequenceToString(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (String str2 : replaceUpperCase_U_WithLoverCase(str).trim().substring(2).split(DELIMITER)) {
                sb.append(Character.toChars(Integer.parseInt(str2.trim(), 16)));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new IllegalArgumentException("Error occurred while converting unicode sequence String to String", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String encodeStringToUnicodeSequence(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            int i = 0;
            while (i < str.length()) {
                sb.append(convertCodePointToUnicodeString(Character.codePointAt(str, i)));
                if (Character.isHighSurrogate(str.charAt(i))) {
                    i++;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getPrecedingZerosStr(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 4 - i; i2++) {
            sb.append("0");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String replaceUpperCase_U_WithLoverCase(String str) {
        return (str == null || !str.contains(UPPER_CASE_UNICODE_PREFIX)) ? str : str.replaceAll(UPPER_CASE_UNICODE_PREFIX_REGEX, DELIMITER);
    }
}
