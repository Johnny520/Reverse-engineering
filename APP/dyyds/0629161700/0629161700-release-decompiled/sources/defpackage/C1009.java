package defpackage;

/* JADX INFO: renamed from: ᛶᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1009 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1009.C1010 f4479 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.text.SimpleDateFormat f4480;

    /* JADX INFO: renamed from: ᛶᛱᛶ$ᛷᲁᛳᛳ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class C1010 implements defpackage.InterfaceC1405 {
        public C1010() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.InterfaceC1405
        /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
        public final defpackage.AbstractC0758 mo690(defpackage.C1950 r1, defpackage.C1949 r2) {
                r0 = this;
                java.lang.Class r0 = r2.f8476
                java.lang.Class<java.sql.Time> r1 = java.sql.Time.class
                if (r0 != r1) goto Ld
                ᛶᛱᛶ r0 = new ᛶᛱᛶ
                r1 = 0
                r0.<init>(r1)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    static {
            ᛶᛱᛶ$ᛷᲁᛳᛳ r0 = new ᛶᛱᛶ$ᛷᲁᛳᛳ
            r0.<init>()
            defpackage.C1009.f4479 = r0
            return
    }

    private C1009() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.f4480 = r0
            return
    }

    public /* synthetic */ C1009(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r2, java.lang.Object r3) {
            r1 = this;
            java.sql.Time r3 = (java.sql.Time) r3
            if (r3 != 0) goto L8
            r2.m1067()
            return
        L8:
            monitor-enter(r1)
            java.text.SimpleDateFormat r0 = r1.f4480     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            r2.m1075(r3)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r8) {
            r7 = this;
            java.lang.String r0 = "Failed parsing '"
            int r1 = r8.m2090()
            r2 = 9
            if (r1 != r2) goto Lf
            r8.m2108()
            r7 = 0
            return r7
        Lf:
            java.lang.String r1 = r8.m2096()
            monitor-enter(r7)
            java.text.SimpleDateFormat r2 = r7.f4480     // Catch: java.lang.Throwable -> L30
            java.util.TimeZone r2 = r2.getTimeZone()     // Catch: java.lang.Throwable -> L30
            java.text.SimpleDateFormat r3 = r7.f4480     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.util.Date r3 = r3.parse(r1)     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.sql.Time r4 = new java.sql.Time     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            long r5 = r3.getTime()     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.text.SimpleDateFormat r8 = r7.f4480     // Catch: java.lang.Throwable -> L30
            r8.setTimeZone(r2)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            return r4
        L30:
            r8 = move-exception
            goto L5a
        L32:
            r8 = move-exception
            goto L54
        L34:
            r3 = move-exception
            ᛲᛱᛶᲀ r4 = new ᛲᛱᛶᲀ     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r5.append(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "' as SQL Time; at path "
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            r0 = 1
            java.lang.String r8 = r8.m2106(r0)     // Catch: java.lang.Throwable -> L32
            r5.append(r8)     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L54:
            java.text.SimpleDateFormat r0 = r7.f4480     // Catch: java.lang.Throwable -> L30
            r0.setTimeZone(r2)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L30
        L5a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            throw r8
    }
}
