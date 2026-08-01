package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1070 implements xhss.InterfaceC0358 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0328 f3456 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0328 f3457 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0328 f3458 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0328 f3459 = null;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final xhss.C0136 f3460 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0328 f3461 = null;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final xhss.C1070.C1071 f3462 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0328 f3463 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0328 f3464 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0328 f3465 = null;

    /* JADX INFO: renamed from: xhss.ᲇᛸᲀᲁ$ᛱᛱᛲᲇ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
    public class C1071 implements xhss.InterfaceC0341 {
        public C1071() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // xhss.InterfaceC0341
        /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
        public final xhss.AbstractC0121 mo160(xhss.C1125 r4, xhss.C0032 r5) {
                r3 = this;
                java.lang.Class r3 = r5.f211
                java.lang.String r5 = r3.getName()
                java.lang.String r0 = "java.time."
                boolean r5 = r5.startsWith(r0)
                if (r5 != 0) goto L10
                goto La4
            L10:
                java.lang.Class<java.time.Duration> r5 = java.time.Duration.class
                if (r3 != r5) goto L17
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3459
                return r3
            L17:
                java.lang.Class<java.time.Instant> r5 = java.time.Instant.class
                if (r3 != r5) goto L1e
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3456
                return r3
            L1e:
                java.lang.Class<java.time.LocalDate> r5 = java.time.LocalDate.class
                if (r3 != r5) goto L25
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3457
                return r3
            L25:
                java.lang.Class<java.time.LocalTime> r5 = java.time.LocalTime.class
                if (r3 != r5) goto L2c
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3464
                return r3
            L2c:
                java.lang.Class<java.time.LocalDateTime> r0 = java.time.LocalDateTime.class
                if (r3 != r0) goto L35
                xhss.ᛲᛲᛸᲇ r3 = xhss.C1070.m1733(r4)
                return r3
            L35:
                java.lang.Class<java.time.MonthDay> r0 = java.time.MonthDay.class
                if (r3 != r0) goto L3c
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3458
                return r3
            L3c:
                java.lang.Class<java.time.OffsetDateTime> r0 = java.time.OffsetDateTime.class
                r1 = 1
                java.lang.Class<java.time.ZoneOffset> r2 = java.time.ZoneOffset.class
                if (r3 != r0) goto L55
                xhss.ᛲᛲᛸᲇ r3 = xhss.C1070.m1733(r4)
                xhss.ᛲᛱᛶᛴ r4 = r4.m1814(r2)
                xhss.ᛸᛴᛴᛳ r5 = new xhss.ᛸᛴᛴᛳ
                r5.<init>(r3, r4, r1)
                xhss.ᛲᛲᛸᲇ r3 = r5.m357()
                return r3
            L55:
                java.lang.Class<java.time.OffsetTime> r0 = java.time.OffsetTime.class
                if (r3 != r0) goto L6d
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3459
                xhss.ᛲᛱᛶᛴ r3 = r4.m1814(r5)
                xhss.ᛲᛱᛶᛴ r4 = r4.m1814(r2)
                xhss.ᛱᲈᛳᛸ r5 = new xhss.ᛱᲈᛳᛸ
                r5.<init>(r3, r4, r1)
                xhss.ᛲᛲᛸᲇ r3 = r5.m357()
                return r3
            L6d:
                java.lang.Class<java.time.Period> r5 = java.time.Period.class
                if (r3 != r5) goto L74
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3465
                return r3
            L74:
                java.lang.Class<java.time.Year> r5 = java.time.Year.class
                if (r3 != r5) goto L7b
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3463
                return r3
            L7b:
                java.lang.Class<java.time.YearMonth> r5 = java.time.YearMonth.class
                if (r3 != r5) goto L82
                xhss.ᛳᲈᛷᛸ r3 = xhss.C1070.f3461
                return r3
            L82:
                java.lang.Class<java.time.ZoneId> r5 = java.time.ZoneId.class
                if (r3 == r5) goto La6
                if (r3 != r2) goto L89
                goto La6
            L89:
                java.lang.Class<java.time.ZonedDateTime> r0 = java.time.ZonedDateTime.class
                if (r3 != r0) goto La4
                xhss.ᛲᛲᛸᲇ r3 = xhss.C1070.m1733(r4)
                xhss.ᛲᛱᛶᛴ r0 = r4.m1814(r2)
                xhss.ᛲᛱᛶᛴ r4 = r4.m1814(r5)
                xhss.ᲈᛱᛲᛴ r5 = new xhss.ᲈᛱᛲᛴ
                r1 = 0
                r5.<init>(r3, r0, r4, r1)
                xhss.ᛲᛲᛸᲇ r3 = r5.m357()
                return r3
            La4:
                r3 = 0
                return r3
            La6:
                xhss.ᛲᛲᛸᲇ r3 = xhss.C1070.f3460
                return r3
        }
    }

    /* JADX INFO: renamed from: xhss.ᲇᛸᲀᲁ$ᛷᛵᛵᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
    public class C1072 extends xhss.AbstractC0121 {
        public C1072() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // xhss.AbstractC0121
        /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
        public final java.lang.Object mo119(xhss.C0385 r4) {
                r3 = this;
                r4.m743()
                r3 = 0
                r0 = r3
            L5:
                int r1 = r4.m762()
                r2 = 4
                if (r1 == r2) goto L32
                java.lang.String r1 = r4.m765()
                java.lang.String r2 = "totalSeconds"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L29
                java.lang.String r2 = "id"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L24
                r4.m753()
                goto L5
            L24:
                java.lang.String r3 = r4.m739()
                goto L5
            L29:
                int r0 = r4.m741()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L5
            L32:
                r4.m750()
                if (r3 == 0) goto L3c
                java.time.ZoneId r3 = java.time.ZoneId.of(r3)
                return r3
            L3c:
                if (r0 == 0) goto L47
                int r3 = r0.intValue()
                java.time.ZoneOffset r3 = java.time.ZoneOffset.ofTotalSeconds(r3)
                return r3
            L47:
                xhss.ᛱᲈᛲᛷ r3 = new xhss.ᛱᲈᛲᛷ
                r0 = 1
                java.lang.String r4 = r4.m764(r0)
                java.lang.String r0 = "Missing id or totalSeconds field; at path "
                java.lang.String r4 = r0.concat(r4)
                r3.<init>(r4)
                throw r3
        }

        @Override // xhss.AbstractC0121
        /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
        public final void mo120(xhss.C0827 r3, java.lang.Object r4) {
                r2 = this;
                java.time.ZoneId r4 = (java.time.ZoneId) r4
                boolean r2 = r4 instanceof java.time.ZoneOffset
                if (r2 == 0) goto L1c
                r3.m1407()
                java.lang.String r2 = "totalSeconds"
                r3.m1403(r2)
                java.time.ZoneOffset r4 = (java.time.ZoneOffset) r4
                int r2 = r4.getTotalSeconds()
                long r0 = (long) r2
                r3.m1397(r0)
                r3.m1399()
                return
            L1c:
                r3.m1407()
                java.lang.String r2 = "id"
                r3.m1403(r2)
                java.lang.String r2 = r4.getId()
                r3.m1405(r2)
                r3.m1399()
                return
        }
    }

    static {
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String r1 = "seconds"
            java.lang.String r2 = "nanos"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2}
            r4 = 2
            r0.<init>(r3, r4)
            xhss.C1070.f3459 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 3
            r0.<init>(r1, r2)
            xhss.C1070.f3456 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String r1 = "year"
            java.lang.String r2 = "month"
            java.lang.String r3 = "day"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r3}
            r5 = 4
            r0.<init>(r4, r5)
            xhss.C1070.f3457 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String r4 = "second"
            java.lang.String r5 = "nano"
            java.lang.String r6 = "hour"
            java.lang.String r7 = "minute"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            r5 = 5
            r0.<init>(r4, r5)
            xhss.C1070.f3464 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String[] r3 = new java.lang.String[]{r2, r3}
            r4 = 6
            r0.<init>(r3, r4)
            xhss.C1070.f3458 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String r3 = "months"
            java.lang.String r4 = "days"
            java.lang.String r5 = "years"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            r4 = 7
            r0.<init>(r3, r4)
            xhss.C1070.f3465 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r4 = 0
            r0.<init>(r3, r4)
            xhss.C1070.f3463 = r0
            xhss.ᛳᲈᛷᛸ r0 = new xhss.ᛳᲈᛷᛸ
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 1
            r0.<init>(r1, r2)
            xhss.C1070.f3461 = r0
            xhss.ᲇᛸᲀᲁ$ᛷᛵᛵᲈ r0 = new xhss.ᲇᛸᲀᲁ$ᛷᛵᛵᲈ
            r0.<init>()
            xhss.ᛲᛲᛸᲇ r0 = r0.m357()
            xhss.C1070.f3460 = r0
            xhss.ᲇᛸᲀᲁ$ᛱᛱᛲᲇ r0 = new xhss.ᲇᛸᲀᲁ$ᛱᛱᛲᲇ
            r0.<init>()
            xhss.C1070.f3462 = r0
            return
    }

    public C1070() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1732(java.io.Serializable r1, java.lang.String r2, xhss.C0385 r3) {
            if (r1 == 0) goto L3
            return
        L3:
            r1 = 1
            java.lang.String r1 = r3.m764(r1)
            java.lang.String r3 = "Missing "
            java.lang.String r0 = " field; at path "
            xhss.C0532.m957(r3, r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0136 m1733(xhss.C1125 r3) {
            java.lang.Class<java.time.LocalDate> r0 = java.time.LocalDate.class
            xhss.ᛲᛱᛶᛴ r0 = r3.m1814(r0)
            java.lang.Class<java.time.LocalTime> r1 = java.time.LocalTime.class
            xhss.ᛲᛱᛶᛴ r3 = r3.m1814(r1)
            xhss.ᛱᲈᛳᛸ r1 = new xhss.ᛱᲈᛳᛸ
            r2 = 0
            r1.<init>(r0, r3, r2)
            xhss.ᛲᛲᛸᲇ r3 = r1.m357()
            return r3
    }
}
