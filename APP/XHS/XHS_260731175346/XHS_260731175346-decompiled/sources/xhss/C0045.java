package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛵᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0045 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0873 f285 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f286;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0602 f287;

    static {
            xhss.ᲀᛶᲈᛲ r0 = new xhss.ᲀᛶᲈᛲ
            r0.<init>()
            xhss.C0045.f285 = r0
            return
    }

    public C0045(xhss.AbstractC0602 r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f286 = r4
            r2.f287 = r3
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.text.DateFormat r0 = java.text.DateFormat.getDateTimeInstance(r3, r3, r2)
            r4.add(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L27
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r3, r3)
            r4.add(r3)
        L27:
            int r3 = xhss.AbstractC1042.f3363
            r0 = 9
            if (r3 < r0) goto L3f
            java.lang.String r3 = " "
            java.lang.String r0 = "h:mm:ss a"
            java.lang.String r1 = "MMM d, yyyy"
            java.lang.String r3 = xhss.AbstractC0390.m781(r1, r3, r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r3, r2)
            r4.add(r0)
        L3f:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.ArrayList r3 = r3.f286
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            boolean r0 = r3 instanceof java.text.SimpleDateFormat
            r1 = 41
            java.lang.String r2 = "DefaultDateTypeAdapter("
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3
            java.lang.String r3 = r3.toPattern()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r7) {
            r6 = this;
            int r0 = r7.m762()
            r1 = 9
            r2 = 0
            if (r0 != r1) goto Ld
            r7.m756()
            return r2
        Ld:
            java.lang.String r0 = r7.m739()
            java.util.ArrayList r1 = r6.f286
            monitor-enter(r1)
            java.util.ArrayList r3 = r6.f286     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L33
        L1a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L33
            java.text.DateFormat r4 = (java.text.DateFormat) r4     // Catch: java.lang.Throwable -> L33
            java.util.TimeZone r5 = r4.getTimeZone()     // Catch: java.lang.Throwable -> L33
            java.util.Date r7 = r4.parse(r0)     // Catch: java.lang.Throwable -> L35 java.text.ParseException -> L3a
            r4.setTimeZone(r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            goto L49
        L33:
            r6 = move-exception
            goto L5c
        L35:
            r6 = move-exception
            r4.setTimeZone(r5)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L3a:
            r4.setTimeZone(r5)     // Catch: java.lang.Throwable -> L33
            goto L1a
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L50
            r3 = 0
            r1.<init>(r3)     // Catch: java.text.ParseException -> L50
            java.util.Date r7 = xhss.AbstractC1004.m1645(r0, r1)     // Catch: java.text.ParseException -> L50
        L49:
            xhss.ᛶᲇᛵᛴ r6 = r6.f287
            java.util.Date r6 = r6.mo1057(r7)
            return r6
        L50:
            r6 = move-exception
            java.lang.String r1 = "' as Date; at path "
            r3 = 1
            java.lang.String r7 = r7.m764(r3)
            xhss.C0532.m951(r0, r1, r7, r6)
            return r2
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r6
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r3, java.lang.Object r4) {
            r2 = this;
            java.util.Date r4 = (java.util.Date) r4
            if (r4 != 0) goto L8
            r3.m1396()
            return
        L8:
            java.util.ArrayList r0 = r2.f286
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.util.ArrayList r2 = r2.f286
            monitor-enter(r2)
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            r3.m1405(r4)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }
}
