package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DatesKt {
    private static final java.text.DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = null;
    private static final java.lang.String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = null;
    public static final long MAX_DATE = 253402300799999L;
    private static final okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = null;

    static {
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r0 = new okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
            r0.<init>()
            okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT = r0
            java.lang.String r14 = "EEE, dd-MM-yyyy HH:mm:ss z"
            java.lang.String r15 = "EEE MMM d yyyy HH:mm:ss z"
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.lang.String r2 = "EEEE, dd-MMM-yy HH:mm:ss zzz"
            java.lang.String r3 = "EEE MMM d HH:mm:ss yyyy"
            java.lang.String r4 = "EEE, dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r5 = "EEE, dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r6 = "EEE, dd MMM yy HH:mm:ss z"
            java.lang.String r7 = "EEE dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r8 = "EEE dd MMM yyyy HH:mm:ss z"
            java.lang.String r9 = "EEE dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r10 = "EEE dd-MMM-yy HH:mm:ss z"
            java.lang.String r11 = "EEE dd MMM yy HH:mm:ss z"
            java.lang.String r12 = "EEE,dd-MMM-yy HH:mm:ss z"
            java.lang.String r13 = "EEE,dd-MMM-yyyy HH:mm:ss z"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = r0
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS = r0
            return
    }

    public static final java.util.Date toHttpDateOrNull(java.lang.String r10) {
            r10.getClass()
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r2 = 0
            r0.<init>(r2)
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r3 = okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT
            java.lang.Object r3 = r3.get()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            java.util.Date r3 = r3.parse(r10, r0)
            int r4 = r0.getIndex()
            int r5 = r10.length()
            if (r4 != r5) goto L28
            return r3
        L28:
            java.lang.String[] r3 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS
            monitor-enter(r3)
            int r4 = r3.length     // Catch: java.lang.Throwable -> L48
            r5 = r2
        L2d:
            if (r5 >= r4) goto L5c
            java.text.DateFormat[] r6 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS     // Catch: java.lang.Throwable -> L48
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L4a
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L48
            java.lang.String[] r8 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS     // Catch: java.lang.Throwable -> L48
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L48
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L48
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L48
            java.util.TimeZone r8 = okhttp3.internal.Util.UTC     // Catch: java.lang.Throwable -> L48
            r7.setTimeZone(r8)     // Catch: java.lang.Throwable -> L48
            r6[r5] = r7     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r10 = move-exception
            goto L5e
        L4a:
            r0.setIndex(r2)     // Catch: java.lang.Throwable -> L48
            java.util.Date r6 = r7.parse(r10, r0)     // Catch: java.lang.Throwable -> L48
            int r7 = r0.getIndex()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L59
            monitor-exit(r3)
            return r6
        L59:
            int r5 = r5 + 1
            goto L2d
        L5c:
            monitor-exit(r3)
            return r1
        L5e:
            monitor-exit(r3)
            throw r10
    }

    public static final java.lang.String toHttpDateString(java.util.Date r1) {
            r1.getClass()
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r0 = okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.lang.String r1 = r0.format(r1)
            r1.getClass()
            return r1
    }
}
