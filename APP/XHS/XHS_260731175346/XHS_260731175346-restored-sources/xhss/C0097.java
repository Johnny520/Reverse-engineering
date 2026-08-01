package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0097 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0097.C0098 f453 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.text.SimpleDateFormat f454;

    /* JADX INFO: renamed from: xhss.ᛱᲁᛴᛶ$ᛷᛵᛵᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
    public class C0098 implements xhss.InterfaceC0341 {
        public C0098() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // xhss.InterfaceC0341
        /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
        public final xhss.AbstractC0121 mo160(xhss.C1125 r1, xhss.C0032 r2) {
                r0 = this;
                java.lang.Class r0 = r2.f211
                java.lang.Class<java.sql.Time> r1 = java.sql.Time.class
                if (r0 != r1) goto Ld
                xhss.ᛱᲁᛴᛶ r0 = new xhss.ᛱᲁᛴᛶ
                r1 = 0
                r0.<init>(r1)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    static {
            xhss.ᛱᲁᛴᛶ$ᛷᛵᛵᲈ r0 = new xhss.ᛱᲁᛴᛶ$ᛷᛵᛵᲈ
            r0.<init>()
            xhss.C0097.f453 = r0
            return
    }

    private C0097() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.f454 = r0
            return
    }

    public /* synthetic */ C0097(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r8) {
            r7 = this;
            java.lang.String r0 = "Failed parsing '"
            int r1 = r8.m762()
            r2 = 9
            if (r1 != r2) goto Lf
            r8.m756()
            r7 = 0
            return r7
        Lf:
            java.lang.String r1 = r8.m739()
            monitor-enter(r7)
            java.text.SimpleDateFormat r2 = r7.f454     // Catch: java.lang.Throwable -> L30
            java.util.TimeZone r2 = r2.getTimeZone()     // Catch: java.lang.Throwable -> L30
            java.text.SimpleDateFormat r3 = r7.f454     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.util.Date r3 = r3.parse(r1)     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.sql.Time r4 = new java.sql.Time     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            long r5 = r3.getTime()     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.text.SimpleDateFormat r8 = r7.f454     // Catch: java.lang.Throwable -> L30
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
            xhss.ᛱᲈᛲᛷ r4 = new xhss.ᛱᲈᛲᛷ     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r5.append(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "' as SQL Time; at path "
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            r0 = 1
            java.lang.String r8 = r8.m764(r0)     // Catch: java.lang.Throwable -> L32
            r5.append(r8)     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L54:
            java.text.SimpleDateFormat r0 = r7.f454     // Catch: java.lang.Throwable -> L30
            r0.setTimeZone(r2)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L30
        L5a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            throw r8
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r2, java.lang.Object r3) {
            r1 = this;
            java.sql.Time r3 = (java.sql.Time) r3
            if (r3 != 0) goto L8
            r2.m1396()
            return
        L8:
            monitor-enter(r1)
            java.text.SimpleDateFormat r0 = r1.f454     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            r2.m1405(r3)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }
}
