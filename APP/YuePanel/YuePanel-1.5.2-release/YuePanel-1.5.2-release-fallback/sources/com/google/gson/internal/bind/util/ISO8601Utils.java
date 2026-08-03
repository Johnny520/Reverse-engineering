package com.google.gson.internal.bind.util;

/* JADX INFO: loaded from: classes2.dex */
public class ISO8601Utils {
    private static final java.util.TimeZone TIMEZONE_UTC = null;
    private static final java.lang.String UTC_ID = "UTC";

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC = r0
            return
    }

    private ISO8601Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkOffset(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static java.lang.String format(java.util.Date r2) {
            r0 = 0
            java.util.TimeZone r1 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r2 = format(r2, r0, r1)
            return r2
    }

    public static java.lang.String format(java.util.Date r1, boolean r2) {
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r1 = format(r1, r2, r0)
            return r1
    }

    public static java.lang.String format(java.util.Date r6, boolean r7, java.util.TimeZone r8) {
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r8, r1)
            r0.setTime(r6)
            r6 = 4
            if (r7 == 0) goto Lf
            r1 = r6
            goto L10
        Lf:
            r1 = 0
        L10:
            r2 = 19
            int r2 = r2 + r1
            int r1 = r8.getRawOffset()
            r3 = 1
            if (r1 != 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = 6
        L1d:
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            int r2 = r0.get(r3)
            padInt(r1, r2, r6)
            r6 = 45
            r1.append(r6)
            r2 = 2
            int r4 = r0.get(r2)
            int r4 = r4 + r3
            padInt(r1, r4, r2)
            r1.append(r6)
            r3 = 5
            int r3 = r0.get(r3)
            padInt(r1, r3, r2)
            r3 = 84
            r1.append(r3)
            r3 = 11
            int r3 = r0.get(r3)
            padInt(r1, r3, r2)
            r3 = 58
            r1.append(r3)
            r4 = 12
            int r4 = r0.get(r4)
            padInt(r1, r4, r2)
            r1.append(r3)
            r4 = 13
            int r4 = r0.get(r4)
            padInt(r1, r4, r2)
            if (r7 == 0) goto L7c
            r7 = 46
            r1.append(r7)
            r7 = 14
            int r7 = r0.get(r7)
            r4 = 3
            padInt(r1, r7, r4)
        L7c:
            long r4 = r0.getTimeInMillis()
            int r7 = r8.getOffset(r4)
            if (r7 == 0) goto La9
            r8 = 60000(0xea60, float:8.4078E-41)
            int r8 = r7 / r8
            int r0 = r8 / 60
            int r0 = java.lang.Math.abs(r0)
            int r8 = r8 % 60
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= 0) goto L9a
            goto L9c
        L9a:
            r6 = 43
        L9c:
            r1.append(r6)
            padInt(r1, r0, r2)
            r1.append(r3)
            padInt(r1, r8, r2)
            goto Lae
        La9:
            r6 = 90
            r1.append(r6)
        Lae:
            java.lang.String r6 = r1.toString()
            return r6
    }

    private static int indexOfNonDigit(java.lang.String r2, int r3) {
        L0:
            int r0 = r2.length()
            if (r3 >= r0) goto L17
            char r0 = r2.charAt(r3)
            r1 = 48
            if (r0 < r1) goto L16
            r1 = 57
            if (r0 <= r1) goto L13
            goto L16
        L13:
            int r3 = r3 + 1
            goto L0
        L16:
            return r3
        L17:
            int r2 = r2.length()
            return r2
    }

    private static void padInt(java.lang.StringBuilder r1, int r2, int r3) {
            java.lang.String r2 = java.lang.Integer.toString(r2)
            int r0 = r2.length()
            int r3 = r3 - r0
        L9:
            if (r3 <= 0) goto L13
            r0 = 48
            r1.append(r0)
            int r3 = r3 + (-1)
            goto L9
        L13:
            r1.append(r2)
            return
    }

    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
            r1 = r19
            r2 = r20
            int r0 = r20.getIndex()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r3 = r0 + 4
            int r4 = parseInt(r1, r0, r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r5 = 45
            boolean r6 = checkOffset(r1, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r7 = 5
            if (r6 == 0) goto L19
            int r3 = r0 + 5
        L19:
            int r0 = r3 + 2
            int r6 = parseInt(r1, r3, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r8 = checkOffset(r1, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r8 == 0) goto L27
            int r0 = r3 + 3
        L27:
            int r3 = r0 + 2
            int r8 = parseInt(r1, r0, r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r9 = 84
            boolean r9 = checkOffset(r1, r3, r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L54
            int r12 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 > r3) goto L54
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0.setLenient(r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r2.setIndex(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            return r0
        L4e:
            r0 = move-exception
            goto L1ce
        L51:
            r0 = move-exception
            goto L1ce
        L54:
            r12 = 43
            r13 = 90
            r14 = 2
            if (r9 == 0) goto Ld8
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = parseInt(r1, r3, r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r15 = 58
            boolean r16 = checkOffset(r1, r9, r15)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r16 == 0) goto L6d
            int r9 = r0 + 6
        L6d:
            int r0 = r9 + 2
            int r16 = parseInt(r1, r9, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r15 = checkOffset(r1, r0, r15)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r15 == 0) goto L7c
            int r9 = r9 + 3
            r0 = r9
        L7c:
            int r9 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r9 <= r0) goto Lce
            char r9 = r1.charAt(r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r9 == r13) goto Lce
            if (r9 == r12) goto Lce
            if (r9 == r5) goto Lce
            int r9 = r0 + 2
            int r15 = parseInt(r1, r0, r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r11 = 59
            if (r15 <= r11) goto L9c
            r11 = 63
            if (r15 >= r11) goto L9c
            r15 = 59
        L9c:
            r11 = 46
            boolean r11 = checkOffset(r1, r9, r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r11 == 0) goto Lc8
            int r9 = r0 + 3
            int r11 = r0 + 4
            int r11 = indexOfNonDigit(r1, r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r11, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r17 = parseInt(r1, r9, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r0 = r0 - r9
            if (r0 == r10) goto Lbf
            if (r0 == r14) goto Lbc
            goto Lc1
        Lbc:
            int r17 = r17 * 10
            goto Lc1
        Lbf:
            int r17 = r17 * 100
        Lc1:
            r0 = r3
            r3 = r11
            r9 = r16
            r11 = r17
            goto Ldc
        Lc8:
            r0 = r3
            r3 = r9
            r9 = r16
            r11 = 0
            goto Ldc
        Lce:
            r9 = r16
            r11 = 0
            r15 = 0
            r18 = r3
            r3 = r0
            r0 = r18
            goto Ldc
        Ld8:
            r0 = 0
            r9 = 0
            r11 = 0
            r15 = 0
        Ldc:
            int r14 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r14 <= r3) goto L1c6
            char r14 = r1.charAt(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r14 != r13) goto Led
            java.util.TimeZone r5 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r3 = r3 + r10
            goto L195
        Led:
            if (r14 == r12) goto L10e
            if (r14 != r5) goto Lf2
            goto L10e
        Lf2:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.append(r14)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L10e:
            java.lang.String r5 = r1.substring(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r12 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 < r7) goto L119
            goto L12a
        L119:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r12.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r12.append(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r5 = "00"
            r12.append(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r5 = r12.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L12a:
            int r12 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r3 = r3 + r12
            java.lang.String r12 = "+0000"
            boolean r12 = r5.equals(r12)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 != 0) goto L193
            java.lang.String r12 = "+00:00"
            boolean r12 = r5.equals(r12)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r12 == 0) goto L140
            goto L193
        L140:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r12.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r13 = "GMT"
            r12.append(r13)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r12.append(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r5 = r12.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r13 = r12.getID()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r14 = r13.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r14 != 0) goto L191
            java.lang.String r14 = ":"
            java.lang.String r7 = ""
            java.lang.String r7 = r13.replace(r14, r7)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            boolean r7 = r7.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            if (r7 == 0) goto L16e
            goto L191
        L16e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.append(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r4 = r12.getID()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L191:
            r5 = r12
            goto L195
        L193:
            java.util.TimeZone r5 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L195:
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r7.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r5 = 0
            r7.setLenient(r5)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r7.set(r10, r4)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            int r6 = r6 - r10
            r4 = 2
            r7.set(r4, r6)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r4 = 5
            r7.set(r4, r8)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r4 = 11
            r7.set(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0 = 12
            r7.set(r0, r9)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0 = 13
            r7.set(r0, r15)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r0 = 14
            r7.set(r0, r11)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            r2.setIndex(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.util.Date r0 = r7.getTime()     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            return r0
        L1c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4e java.lang.IndexOutOfBoundsException -> L51
        L1ce:
            if (r1 != 0) goto L1d2
            r1 = 0
            goto L1e6
        L1d2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L1e6:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1f2
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L210
        L1f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L210:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }

    private static int parseInt(java.lang.String r5, int r6, int r7) throws java.lang.NumberFormatException {
            if (r6 < 0) goto L67
            int r0 = r5.length()
            if (r7 > r0) goto L67
            if (r6 > r7) goto L67
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r6 >= r7) goto L37
            int r2 = r6 + 1
            char r3 = r5.charAt(r6)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L39
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L37:
            r3 = 0
            r2 = r6
        L39:
            if (r2 >= r7) goto L65
            int r4 = r2 + 1
            char r2 = r5.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L4c
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L39
        L4c:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L65:
            int r5 = -r3
            return r5
        L67:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r6.<init>(r5)
            throw r6
    }
}
