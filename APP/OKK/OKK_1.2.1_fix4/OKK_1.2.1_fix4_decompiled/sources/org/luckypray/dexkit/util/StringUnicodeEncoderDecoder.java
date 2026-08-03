package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes.dex */
public class StringUnicodeEncoderDecoder {
    private static final String DELIMITER = "\\\\u";
    private static final String UNICODE_PREFIX = "\\u";
    private static final String UPPER_CASE_UNICODE_PREFIX = "\\U";
    private static final String UPPER_CASE_UNICODE_PREFIX_REGEX = "\\\\U";

    private static String convertCodePointToUnicodeString(int i2) {
        StringBuilder sb = new StringBuilder(UNICODE_PREFIX);
        String hexString = Integer.toHexString(i2);
        if (hexString.startsWith("0")) {
            hexString = hexString.substring(1);
        }
        if (hexString.length() <= 4) {
            sb.append(getPrecedingZerosStr(hexString.length()));
        }
        sb.append(hexString);
        return sb.toString();
    }

    public static String decodeUnicodeSequenceToString(String str) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        try {
            for (String str2 : replaceUpperCase_U_WithLoverCase(str).trim().substring(2).split(DELIMITER)) {
                sb.append(Character.toChars(Integer.parseInt(str2.trim(), 16)));
            }
            return sb.toString();
        } catch (Exception e2) {
            throw new IllegalArgumentException("Error occurred while converting unicode sequence String to String", e2);
        }
    }

    public static String encodeStringToUnicodeSequence(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            int i2 = 0;
            while (i2 < str.length()) {
                sb.append(convertCodePointToUnicodeString(Character.codePointAt(str, i2)));
                if (Character.isHighSurrogate(str.charAt(i2))) {
                    i2++;
                }
                i2++;
            }
        }
        return sb.toString();
    }

    private static String getPrecedingZerosStr(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < 4 - i2; i3++) {
            sb.append("0");
        }
        return sb.toString();
    }

    private static String replaceUpperCase_U_WithLoverCase(String str) {
        return (str == null || !str.contains(UPPER_CASE_UNICODE_PREFIX)) ? str : str.replaceAll(UPPER_CASE_UNICODE_PREFIX_REGEX, DELIMITER);
    }
}
