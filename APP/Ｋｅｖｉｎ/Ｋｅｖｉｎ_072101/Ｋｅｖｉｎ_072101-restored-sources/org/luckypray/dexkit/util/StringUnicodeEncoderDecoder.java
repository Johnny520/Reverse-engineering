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

    private static java.lang.String convertCodePointToUnicodeString(int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\u"
            r0.<init>(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r4)
            java.lang.String r2 = "0"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L19
            r2 = 1
            java.lang.String r2 = r1.substring(r2)
            goto L1a
        L19:
            r2 = r1
        L1a:
            r1 = r2
            int r2 = r1.length()
            r3 = 4
            if (r2 > r3) goto L2d
            int r2 = r1.length()
            java.lang.String r2 = getPrecedingZerosStr(r2)
            r0.append(r2)
        L2d:
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String decodeUnicodeSequenceToString(java.lang.String r7) throws java.lang.IllegalArgumentException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = replaceUpperCase_U_WithLoverCase(r7)     // Catch: java.lang.Exception -> L40
            r7 = r1
            java.lang.String r1 = r7.trim()     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = "\\u"
            int r2 = r2.length()     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Exception -> L40
            r7 = r1
            java.lang.String r1 = "\\\\u"
            java.lang.String[] r1 = r7.split(r1)     // Catch: java.lang.Exception -> L40
            int r2 = r1.length     // Catch: java.lang.Exception -> L40
            r3 = 0
        L21:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]     // Catch: java.lang.Exception -> L40
            java.lang.String r5 = r4.trim()     // Catch: java.lang.Exception -> L40
            r6 = 16
            int r5 = java.lang.Integer.parseInt(r5, r6)     // Catch: java.lang.Exception -> L40
            char[] r5 = java.lang.Character.toChars(r5)     // Catch: java.lang.Exception -> L40
            r0.append(r5)     // Catch: java.lang.Exception -> L40
            int r3 = r3 + 1
            goto L21
        L3a:
            java.lang.String r1 = r0.toString()
            return r1
        L40:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Error occurred while converting unicode sequence String to String"
            r2.<init>(r3, r1)
            throw r2
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
            java.lang.String r1 = r0.toString()
            return r1
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
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String replaceUpperCase_U_WithLoverCase(java.lang.String r3) {
            r0 = r3
            if (r3 == 0) goto L13
            java.lang.String r1 = "\\U"
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L13
            java.lang.String r1 = "\\\\U"
            java.lang.String r2 = "\\\\u"
            java.lang.String r0 = r3.replaceAll(r1, r2)
        L13:
            return r0
    }
}
