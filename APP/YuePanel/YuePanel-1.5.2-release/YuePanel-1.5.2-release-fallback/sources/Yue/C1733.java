package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1733 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long f5390 = 253402300799999L;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1733.C1734 f5391 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String[] f5392 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.text.DateFormat[] f5393 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۠$ۥ, reason: contains not printable characters */
    public static final class C1734 extends java.lang.ThreadLocal<java.text.DateFormat> {
        public C1734() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ java.text.DateFormat initialValue() {
                r1 = this;
                java.text.DateFormat r0 = r1.m8246()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.text.DateFormat m8246() {
                r3 = this;
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
                java.util.Locale r2 = java.util.Locale.US
                r0.<init>(r1, r2)
                r1 = 0
                r0.setLenient(r1)
                java.util.TimeZone r1 = Yue.C6656.f23209
                r0.setTimeZone(r1)
                return r0
        }
    }

    static {
            Yue.ۥۣ۟ۨ۠$ۥ r0 = new Yue.ۥۣ۟ۨ۠$ۥ
            r0.<init>()
            Yue.C1733.f5391 = r0
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
            Yue.C1733.f5392 = r0
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            Yue.C1733.f5393 = r0
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.Date m8244(@Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r2 = 0
            r0.<init>(r2)
            Yue.ۥۣ۟ۨ۠$ۥ r3 = Yue.C1733.f5391
            java.lang.Object r3 = r3.get()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            java.util.Date r3 = r3.parse(r10, r0)
            int r4 = r0.getIndex()
            int r5 = r10.length()
            if (r4 != r5) goto L2a
            return r3
        L2a:
            java.lang.String[] r3 = Yue.C1733.f5392
            monitor-enter(r3)
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4a
            r5 = r2
        L2f:
            if (r5 >= r4) goto L5e
            java.text.DateFormat[] r6 = Yue.C1733.f5393     // Catch: java.lang.Throwable -> L4a
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L4c
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r8 = Yue.C1733.f5392     // Catch: java.lang.Throwable -> L4a
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L4a
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L4a
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L4a
            java.util.TimeZone r8 = Yue.C6656.f23209     // Catch: java.lang.Throwable -> L4a
            r7.setTimeZone(r8)     // Catch: java.lang.Throwable -> L4a
            r6[r5] = r7     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r10 = move-exception
            goto L62
        L4c:
            r0.setIndex(r2)     // Catch: java.lang.Throwable -> L4a
            java.util.Date r6 = r7.parse(r10, r0)     // Catch: java.lang.Throwable -> L4a
            int r7 = r0.getIndex()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L5b
            monitor-exit(r3)
            return r6
        L5b:
            int r5 = r5 + 1
            goto L2f
        L5e:
            Yue.ۥۣۢ۠ۤ r10 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)
            return r1
        L62:
            monitor-exit(r3)
            throw r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m8245(@Yue.InterfaceC4418 java.util.Date r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۣ۟ۨ۠$ۥ r0 = Yue.C1733.f5391
            java.lang.Object r0 = r0.get()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.lang.String r1 = r0.format(r1)
            java.lang.String r0 = "STANDARD_DATE_FORMAT.get().format(this)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }
}
