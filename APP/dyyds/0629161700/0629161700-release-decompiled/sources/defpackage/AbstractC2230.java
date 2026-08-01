package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2230 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.TimeZone f9519 = null;

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            defpackage.AbstractC2230.f9519 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m3620(java.lang.String r5, int r6, int r7) {
            if (r6 < 0) goto L51
            int r0 = r5.length()
            if (r7 > r0) goto L51
            if (r6 > r7) goto L51
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r6 >= r7) goto L2c
            int r2 = r6 + 1
            char r3 = r5.charAt(r6)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L2e
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r5 = r5.substring(r6, r7)
            java.lang.String r5 = r0.concat(r5)
            r1.<init>(r5)
            throw r1
        L2c:
            r3 = 0
            r2 = r6
        L2e:
            if (r2 >= r7) goto L4f
            int r4 = r2 + 1
            char r2 = r5.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L41
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L2e
        L41:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r5 = r5.substring(r6, r7)
            java.lang.String r5 = r0.concat(r5)
            r1.<init>(r5)
            throw r1
        L4f:
            int r5 = -r3
            return r5
        L51:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r6.<init>(r5)
            throw r6
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m3621(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.util.Date m3622(java.lang.String r17, java.text.ParsePosition r18) {
            r1 = r17
            r2 = r18
            int r0 = r2.getIndex()     // Catch: java.lang.Throwable -> L4e
            int r3 = r0 + 4
            int r4 = m3620(r1, r0, r3)     // Catch: java.lang.Throwable -> L4e
            r5 = 45
            boolean r6 = m3621(r1, r3, r5)     // Catch: java.lang.Throwable -> L4e
            r7 = 5
            if (r6 == 0) goto L19
            int r3 = r0 + 5
        L19:
            int r0 = r3 + 2
            int r6 = m3620(r1, r3, r0)     // Catch: java.lang.Throwable -> L4e
            boolean r8 = m3621(r1, r0, r5)     // Catch: java.lang.Throwable -> L4e
            if (r8 == 0) goto L27
            int r0 = r3 + 3
        L27:
            int r3 = r0 + 2
            int r8 = m3620(r1, r0, r3)     // Catch: java.lang.Throwable -> L4e
            r9 = 84
            boolean r9 = m3621(r1, r3, r9)     // Catch: java.lang.Throwable -> L4e
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L51
            int r12 = r1.length()     // Catch: java.lang.Throwable -> L4e
            if (r12 > r3) goto L51
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch: java.lang.Throwable -> L4e
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch: java.lang.Throwable -> L4e
            r0.setLenient(r11)     // Catch: java.lang.Throwable -> L4e
            r2.setIndex(r3)     // Catch: java.lang.Throwable -> L4e
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.Throwable -> L4e
            return r0
        L4e:
            r0 = move-exception
            goto L1df
        L51:
            r12 = 43
            r13 = 90
            r14 = 2
            if (r9 == 0) goto Leb
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = m3620(r1, r3, r9)     // Catch: java.lang.Throwable -> L4e
            r15 = 58
            boolean r16 = m3621(r1, r9, r15)     // Catch: java.lang.Throwable -> L4e
            if (r16 == 0) goto L6a
            int r9 = r0 + 6
        L6a:
            int r0 = r9 + 2
            int r16 = m3620(r1, r9, r0)     // Catch: java.lang.Throwable -> L4e
            boolean r15 = m3621(r1, r0, r15)     // Catch: java.lang.Throwable -> L4e
            if (r15 == 0) goto L79
            int r9 = r9 + 3
            r0 = r9
        L79:
            int r9 = r1.length()     // Catch: java.lang.Throwable -> L4e
            if (r9 <= r0) goto Le3
            char r9 = r1.charAt(r0)     // Catch: java.lang.Throwable -> L4e
            if (r9 == r13) goto Le3
            if (r9 == r12) goto Le3
            if (r9 == r5) goto Le3
            int r9 = r0 + 2
            int r15 = m3620(r1, r0, r9)     // Catch: java.lang.Throwable -> L4e
            r11 = 59
            if (r15 <= r11) goto L99
            r11 = 63
            if (r15 >= r11) goto L99
            r15 = 59
        L99:
            r11 = 46
            boolean r11 = m3621(r1, r9, r11)     // Catch: java.lang.Throwable -> L4e
            if (r11 == 0) goto Ldd
            int r9 = r0 + 3
            int r11 = r0 + 4
        La5:
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L4e
            if (r11 >= r7) goto Lbf
            char r7 = r1.charAt(r11)     // Catch: java.lang.Throwable -> L4e
            r5 = 48
            if (r7 < r5) goto Lbd
            r5 = 57
            if (r7 <= r5) goto Lb8
            goto Lbd
        Lb8:
            int r11 = r11 + 1
            r5 = 45
            goto La5
        Lbd:
            r5 = r11
            goto Lc3
        Lbf:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L4e
        Lc3:
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r5, r0)     // Catch: java.lang.Throwable -> L4e
            int r7 = m3620(r1, r9, r0)     // Catch: java.lang.Throwable -> L4e
            int r0 = r0 - r9
            if (r0 == r10) goto Ld6
            if (r0 == r14) goto Ld3
            goto Ld8
        Ld3:
            int r7 = r7 * 10
            goto Ld8
        Ld6:
            int r7 = r7 * 100
        Ld8:
            r0 = r3
            r3 = r5
            r5 = r16
            goto Lee
        Ldd:
            r0 = r3
            r3 = r9
            r5 = r16
            r7 = 0
            goto Lee
        Le3:
            r5 = r3
            r3 = r0
            r0 = r5
            r5 = r16
        Le8:
            r7 = 0
            r15 = 0
            goto Lee
        Leb:
            r0 = 0
            r5 = 0
            goto Le8
        Lee:
            int r9 = r1.length()     // Catch: java.lang.Throwable -> L4e
            if (r9 <= r3) goto L1d7
            char r9 = r1.charAt(r3)     // Catch: java.lang.Throwable -> L4e
            java.util.TimeZone r11 = defpackage.AbstractC2230.f9519
            if (r9 != r13) goto Lff
            int r3 = r3 + r10
            goto L1a6
        Lff:
            if (r9 == r12) goto L122
            r12 = 45
            if (r9 != r12) goto L106
            goto L122
        L106:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r3.append(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
        L122:
            java.lang.String r9 = r1.substring(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            int r12 = r9.length()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r13 = 5
            if (r12 < r13) goto L12e
            goto L13f
        L12e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r12.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r12.append(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r9 = "00"
            r12.append(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r9 = r12.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
        L13f:
            int r12 = r9.length()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            int r3 = r3 + r12
            java.lang.String r12 = "+0000"
            boolean r12 = r9.equals(r12)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            if (r12 != 0) goto L1a6
            java.lang.String r12 = "+00:00"
            boolean r12 = r9.equals(r12)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            if (r12 == 0) goto L155
            goto L1a6
        L155:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r11.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r12 = "GMT"
            r11.append(r12)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r11.append(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r12 = r11.getID()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            boolean r13 = r12.equals(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            if (r13 != 0) goto L1a6
            java.lang.String r13 = ":"
            java.lang.String r14 = ""
            java.lang.String r12 = r12.replace(r13, r14)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            boolean r12 = r12.equals(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            if (r12 == 0) goto L183
            goto L1a6
        L183:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r3.append(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r4 = r11.getID()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
        L1a6:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r11 = 0
            r9.setLenient(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r9.set(r10, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            int r6 = r6 - r10
            r4 = 2
            r9.set(r4, r6)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r13 = 5
            r9.set(r13, r8)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r4 = 11
            r9.set(r4, r0)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r0 = 12
            r9.set(r0, r5)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r0 = 13
            r9.set(r0, r15)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r0 = 14
            r9.set(r0, r7)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            r2.setIndex(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.util.Date r0 = r9.getTime()     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            return r0
        L1d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e java.lang.Throwable -> L4e
        L1df:
            if (r1 != 0) goto L1e3
            r1 = 0
            goto L1f6
        L1e3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L1f6:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L202
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L21d
        L202:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L21d:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r2.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }
}
