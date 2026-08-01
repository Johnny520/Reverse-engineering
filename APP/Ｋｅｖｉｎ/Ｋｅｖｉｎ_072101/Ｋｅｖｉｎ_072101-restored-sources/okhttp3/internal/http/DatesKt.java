package okhttp3.internal.http;

/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000+\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0005H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0000\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, m115d2 = {"BROWSER_COMPATIBLE_DATE_FORMATS", "", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "", "[Ljava/lang/String;", "MAX_DATE", "", "STANDARD_DATE_FORMAT", "okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;", "toHttpDateOrNull", "Ljava/util/Date;", "toHttpDateString", "okhttp"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class DatesKt {
    private static final java.text.DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = null;
    private static final java.lang.String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = null;
    public static final long MAX_DATE = 253402300799999L;
    private static final okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = null;

    static {
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r0 = new okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
            r0.<init>()
            okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT = r0
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
            java.lang.String r14 = "EEE, dd-MM-yyyy HH:mm:ss z"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = r0
            java.lang.String[] r0 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS = r0
            return
    }

    public static final java.util.Date toHttpDateOrNull(java.lang.String r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r13
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 0
            if (r0 == 0) goto L16
            return r2
        L16:
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r0.<init>(r1)
            r3 = 0
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r4 = okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT
            java.lang.Object r4 = r4.get()
            java.text.DateFormat r4 = (java.text.DateFormat) r4
            java.util.Date r3 = r4.parse(r13, r0)
            int r4 = r0.getIndex()
            int r5 = r13.length()
            if (r4 != r5) goto L33
            return r3
        L33:
            java.lang.String[] r4 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS
            monitor-enter(r4)
            r5 = 0
            r6 = 0
            java.lang.String[] r7 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS     // Catch: java.lang.Throwable -> L76
            int r7 = r7.length     // Catch: java.lang.Throwable -> L76
        L3b:
            if (r6 >= r7) goto L71
            java.text.DateFormat[] r8 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS     // Catch: java.lang.Throwable -> L76
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L76
            if (r8 != 0) goto L5d
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L76
            java.lang.String[] r10 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS     // Catch: java.lang.Throwable -> L76
            r10 = r10[r6]     // Catch: java.lang.Throwable -> L76
            java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> L76
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L76
            r10 = r9
            r11 = 0
            java.util.TimeZone r12 = okhttp3.internal.Util.UTC     // Catch: java.lang.Throwable -> L76
            r10.setTimeZone(r12)     // Catch: java.lang.Throwable -> L76
            java.text.DateFormat r9 = (java.text.DateFormat) r9     // Catch: java.lang.Throwable -> L76
            r8 = r9
            java.text.DateFormat[] r9 = okhttp3.internal.http.DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS     // Catch: java.lang.Throwable -> L76
            r9[r6] = r8     // Catch: java.lang.Throwable -> L76
        L5d:
            r0.setIndex(r1)     // Catch: java.lang.Throwable -> L76
            java.util.Date r9 = r8.parse(r13, r0)     // Catch: java.lang.Throwable -> L76
            r3 = r9
            int r9 = r0.getIndex()     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L6e
        L6c:
            monitor-exit(r4)
            return r3
        L6e:
            int r6 = r6 + 1
            goto L3b
        L71:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L76
            monitor-exit(r4)
            return r2
        L76:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
    }

    public static final java.lang.String toHttpDateString(java.util.Date r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1 r0 = okhttp3.internal.http.DatesKt.STANDARD_DATE_FORMAT
            java.lang.Object r0 = r0.get()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.lang.String r0 = r0.format(r2)
            java.lang.String r1 = "STANDARD_DATE_FORMAT.get().format(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
