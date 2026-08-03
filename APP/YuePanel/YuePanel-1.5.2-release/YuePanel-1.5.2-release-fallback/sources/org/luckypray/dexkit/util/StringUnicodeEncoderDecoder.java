package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
public class StringUnicodeEncoderDecoder {
    private static final java.lang.String DELIMITER = "\\\\u";
    private static final java.lang.String UNICODE_PREFIX = "\\u";
    private static final java.lang.String UPPER_CASE_UNICODE_PREFIX = "\\U";
    private static final java.lang.String UPPER_CASE_UNICODE_PREFIX_REGEX = "\\\\U";

    public StringUnicodeEncoderDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String convertCodePointToUnicodeString(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\u"
            r0.<init>(r1)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r1 = "0"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L18
            r1 = 1
            java.lang.String r3 = r3.substring(r1)
        L18:
            int r1 = r3.length()
            r2 = 4
            if (r1 > r2) goto L2a
            int r1 = r3.length()
            java.lang.String r1 = getPrecedingZerosStr(r1)
            r0.append(r1)
        L2a:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String decodeUnicodeSequenceToString(java.lang.String r5) throws java.lang.IllegalArgumentException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = replaceUpperCase_U_WithLoverCase(r5)     // Catch: java.lang.Exception -> L32
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L32
            r1 = 2
            java.lang.String r5 = r5.substring(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "\\\\u"
            java.lang.String[] r5 = r5.split(r1)     // Catch: java.lang.Exception -> L32
            int r1 = r5.length     // Catch: java.lang.Exception -> L32
            r2 = 0
        L1a:
            if (r2 >= r1) goto L34
            r3 = r5[r2]     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Exception -> L32
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)     // Catch: java.lang.Exception -> L32
            char[] r3 = java.lang.Character.toChars(r3)     // Catch: java.lang.Exception -> L32
            r0.append(r3)     // Catch: java.lang.Exception -> L32
            int r2 = r2 + 1
            goto L1a
        L32:
            r5 = move-exception
            goto L39
        L34:
            java.lang.String r5 = r0.toString()
            return r5
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Error occurred while converting unicode sequence String to String"
            r0.<init>(r1, r5)
            throw r0
    }

    public static java.lang.String encodeStringToUnicodeSequence(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r3 == 0) goto L2e
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2e
            r1 = 0
        Le:
            int r2 = r3.length()
            if (r1 >= r2) goto L2e
            int r2 = java.lang.Character.codePointAt(r3, r1)
            java.lang.String r2 = convertCodePointToUnicodeString(r2)
            r0.append(r2)
            char r2 = r3.charAt(r1)
            boolean r2 = java.lang.Character.isHighSurrogate(r2)
            if (r2 == 0) goto L2b
            int r1 = r1 + 1
        L2b:
            int r1 = r1 + 1
            goto Le
        L2e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String getPrecedingZerosStr(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = 4 - r3
            if (r1 >= r2) goto L12
            java.lang.String r2 = "0"
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L12:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String replaceUpperCase_U_WithLoverCase(java.lang.String r2) {
            if (r2 == 0) goto L12
            java.lang.String r0 = "\\U"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "\\\\U"
            java.lang.String r1 = "\\\\u"
            java.lang.String r2 = r2.replaceAll(r0, r1)
        L12:
            return r2
    }
}
