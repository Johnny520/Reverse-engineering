package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes.dex */
public class StringUnicodeEncoderDecoder {
    private static final String DELIMITER = "\\\\u";
    private static final String UNICODE_PREFIX = "\\u";
    private static final String UPPER_CASE_UNICODE_PREFIX = "\\U";
    private static final String UPPER_CASE_UNICODE_PREFIX_REGEX = "\\\\U";

    public StringUnicodeEncoderDecoder() {
    }

    private static String convertCodePointToUnicodeString(int r3) {
        StringBuilder r02 = new StringBuilder(UNICODE_PREFIX);
        String r32 = Integer.toHexString(r3);
        if (r32.startsWith("0") == false) goto L6;
        r32 = r32.substring(1);
    L6:
        if (r32.length() > 4) goto L8;
        r02.append(getPrecedingZerosStr(r32.length()));
    L8:
        r02.append(r32);
        return r02.toString();
    }

    public static String decodeUnicodeSequenceToString(String r5) throws IllegalArgumentException {
        StringBuilder r02 = new StringBuilder();
        String[] r52 = replaceUpperCase_U_WithLoverCase(r5).trim().substring(2).split(DELIMITER);     // Catch: Exception -> L7
        int r1 = r52.length;     // Catch: Exception -> L7
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L10;
        r02.append(Character.toChars(Integer.parseInt(r52[r2].trim(), 16)));     // Catch: Exception -> L7
        r2 = r2 + 1;
        goto L4
    L10:
        return r02.toString();
    L7:
        e = move-exception;
        throw new IllegalArgumentException("Error occurred while converting unicode sequence String to String", e);
    }

    public static String encodeStringToUnicodeSequence(String r3) {
        StringBuilder r02 = new StringBuilder();
        if (r3 == null) goto L14;
        if (r3.isEmpty() == true) goto L14;
        int r1 = 0;
    L8:
        if (r1 >= r3.length()) goto L14;
        r02.append(convertCodePointToUnicodeString(Character.codePointAt(r3, r1)));
        if (Character.isHighSurrogate(r3.charAt(r1)) == false) goto L12;
        r1 = r1 + 1;
    L12:
        r1 = r1 + 1;
    L14:
        return r02.toString();
    }

    private static String getPrecedingZerosStr(int r3) {
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= (4 - r3)) goto L7;
        r02.append("0");
        r1 = r1 + 1;
        goto L4
    L7:
        return r02.toString();
    }

    private static String replaceUpperCase_U_WithLoverCase(String r2) {
        if (r2 != null) goto L4;
        return r2;
    L4:
        if (r2.contains(UPPER_CASE_UNICODE_PREFIX) == true) goto L6;
        return r2;
    L6:
        return r2.replaceAll(UPPER_CASE_UNICODE_PREFIX_REGEX, DELIMITER);
    }
}
