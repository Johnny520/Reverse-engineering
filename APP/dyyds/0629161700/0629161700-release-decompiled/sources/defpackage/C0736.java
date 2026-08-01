package defpackage;

/* JADX INFO: renamed from: ᛴᛸᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736 implements defpackage.InterfaceC2331 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C1819 f3478 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C0699 f3479 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1819 f3480 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1819 f3481 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1819 f3482 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1819 f3483 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.C0736.C0738 f3484 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1819 f3485 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1819 f3486 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C1819 f3487 = null;

    /* JADX INFO: renamed from: ᛴᛸᲇᛸ$ᛷᲁᛳᛳ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class C0737 extends defpackage.AbstractC0758 {
        public C0737() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.AbstractC0758
        /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
        public final void mo561(defpackage.C0353 r3, java.lang.Object r4) {
                r2 = this;
                java.time.ZoneId r4 = (java.time.ZoneId) r4
                boolean r2 = r4 instanceof java.time.ZoneOffset
                if (r2 == 0) goto L1c
                r3.m1069()
                java.lang.String r2 = "totalSeconds"
                r3.m1072(r2)
                java.time.ZoneOffset r4 = (java.time.ZoneOffset) r4
                int r2 = r4.getTotalSeconds()
                long r0 = (long) r2
                r3.m1070(r0)
                r3.m1073()
                return
            L1c:
                r3.m1069()
                java.lang.String r2 = "id"
                r3.m1072(r2)
                java.lang.String r2 = r4.getId()
                r3.m1075(r2)
                r3.m1073()
                return
        }

        @Override // defpackage.AbstractC0758
        /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
        public final java.lang.Object mo562(defpackage.C1103 r4) {
                r3 = this;
                r4.m2110()
                r3 = 0
                r0 = r3
            L5:
                int r1 = r4.m2090()
                r2 = 4
                if (r1 == r2) goto L32
                java.lang.String r1 = r4.m2102()
                java.lang.String r2 = "totalSeconds"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L29
                java.lang.String r2 = "id"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L24
                r4.m2086()
                goto L5
            L24:
                java.lang.String r3 = r4.m2096()
                goto L5
            L29:
                int r0 = r4.m2099()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L5
            L32:
                r4.m2093()
                if (r3 == 0) goto L3c
                java.time.ZoneId r3 = java.time.ZoneId.of(r3)
                return r3
            L3c:
                if (r0 == 0) goto L47
                int r3 = r0.intValue()
                java.time.ZoneOffset r3 = java.time.ZoneOffset.ofTotalSeconds(r3)
                return r3
            L47:
                ᛲᛱᛶᲀ r3 = new ᛲᛱᛶᲀ
                r0 = 1
                java.lang.String r4 = r4.m2106(r0)
                java.lang.String r0 = "Missing id or totalSeconds field; at path "
                java.lang.String r4 = r0.concat(r4)
                r3.<init>(r4)
                throw r3
        }
    }

    /* JADX INFO: renamed from: ᛴᛸᲇᛸ$ᲇᛶᛵᲇ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class C0738 implements defpackage.InterfaceC1405 {
        public C0738() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.InterfaceC1405
        /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
        public final defpackage.AbstractC0758 mo690(defpackage.C1950 r4, defpackage.C1949 r5) {
                r3 = this;
                java.lang.Class r3 = r5.f8476
                java.lang.String r5 = r3.getName()
                java.lang.String r0 = "java.time."
                boolean r5 = r5.startsWith(r0)
                if (r5 != 0) goto L10
                goto La4
            L10:
                java.lang.Class<java.time.Duration> r5 = java.time.Duration.class
                if (r3 != r5) goto L17
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3483
                return r3
            L17:
                java.lang.Class<java.time.Instant> r5 = java.time.Instant.class
                if (r3 != r5) goto L1e
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3485
                return r3
            L1e:
                java.lang.Class<java.time.LocalDate> r5 = java.time.LocalDate.class
                if (r3 != r5) goto L25
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3482
                return r3
            L25:
                java.lang.Class<java.time.LocalTime> r5 = java.time.LocalTime.class
                if (r3 != r5) goto L2c
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3481
                return r3
            L2c:
                java.lang.Class<java.time.LocalDateTime> r0 = java.time.LocalDateTime.class
                if (r3 != r0) goto L35
                ᛴᛶᲁᛸ r3 = defpackage.C0736.m1653(r4)
                return r3
            L35:
                java.lang.Class<java.time.MonthDay> r0 = java.time.MonthDay.class
                if (r3 != r0) goto L3c
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3480
                return r3
            L3c:
                java.lang.Class<java.time.OffsetDateTime> r0 = java.time.OffsetDateTime.class
                r1 = 1
                java.lang.Class<java.time.ZoneOffset> r2 = java.time.ZoneOffset.class
                if (r3 != r0) goto L55
                ᛴᛶᲁᛸ r3 = defpackage.C0736.m1653(r4)
                ᛴᲀᲈᛴ r4 = r4.m3366(r2)
                ᲁᛵᲁᛴ r5 = new ᲁᛵᲁᛴ
                r5.<init>(r3, r4, r1)
                ᛴᛶᲁᛸ r3 = r5.m1677()
                return r3
            L55:
                java.lang.Class<java.time.OffsetTime> r0 = java.time.OffsetTime.class
                if (r3 != r0) goto L6d
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3483
                ᛴᲀᲈᛴ r3 = r4.m3366(r5)
                ᛴᲀᲈᛴ r4 = r4.m3366(r2)
                ᛸᛲᛸᲀ r5 = new ᛸᛲᛸᲀ
                r5.<init>(r3, r4, r1)
                ᛴᛶᲁᛸ r3 = r5.m1677()
                return r3
            L6d:
                java.lang.Class<java.time.Period> r5 = java.time.Period.class
                if (r3 != r5) goto L74
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3486
                return r3
            L74:
                java.lang.Class<java.time.Year> r5 = java.time.Year.class
                if (r3 != r5) goto L7b
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3487
                return r3
            L7b:
                java.lang.Class<java.time.YearMonth> r5 = java.time.YearMonth.class
                if (r3 != r5) goto L82
                ᲁᛲᲀᲁ r3 = defpackage.C0736.f3478
                return r3
            L82:
                java.lang.Class<java.time.ZoneId> r5 = java.time.ZoneId.class
                if (r3 == r5) goto La6
                if (r3 != r2) goto L89
                goto La6
            L89:
                java.lang.Class<java.time.ZonedDateTime> r0 = java.time.ZonedDateTime.class
                if (r3 != r0) goto La4
                ᛴᛶᲁᛸ r3 = defpackage.C0736.m1653(r4)
                ᛴᲀᲈᛴ r0 = r4.m3366(r2)
                ᛴᲀᲈᛴ r4 = r4.m3366(r5)
                ᲈᛲᲈ r5 = new ᲈᛲᲈ
                r1 = 0
                r5.<init>(r3, r0, r4, r1)
                ᛴᛶᲁᛸ r3 = r5.m1677()
                return r3
            La4:
                r3 = 0
                return r3
            La6:
                ᛴᛶᲁᛸ r3 = defpackage.C0736.f3479
                return r3
        }
    }

    static {
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String r1 = "seconds"
            java.lang.String r2 = "nanos"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2}
            r4 = 2
            r0.<init>(r3, r4)
            defpackage.C0736.f3483 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.C0736.f3485 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String r1 = "year"
            java.lang.String r2 = "month"
            java.lang.String r3 = "day"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r3}
            r5 = 4
            r0.<init>(r4, r5)
            defpackage.C0736.f3482 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String r4 = "second"
            java.lang.String r5 = "nano"
            java.lang.String r6 = "hour"
            java.lang.String r7 = "minute"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            r5 = 5
            r0.<init>(r4, r5)
            defpackage.C0736.f3481 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String[] r3 = new java.lang.String[]{r2, r3}
            r4 = 6
            r0.<init>(r3, r4)
            defpackage.C0736.f3480 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String r3 = "months"
            java.lang.String r4 = "days"
            java.lang.String r5 = "years"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            r4 = 7
            r0.<init>(r3, r4)
            defpackage.C0736.f3486 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r4 = 0
            r0.<init>(r3, r4)
            defpackage.C0736.f3487 = r0
            ᲁᛲᲀᲁ r0 = new ᲁᛲᲀᲁ
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.C0736.f3478 = r0
            ᛴᛸᲇᛸ$ᛷᲁᛳᛳ r0 = new ᛴᛸᲇᛸ$ᛷᲁᛳᛳ
            r0.<init>()
            ᛴᛶᲁᛸ r0 = r0.m1677()
            defpackage.C0736.f3479 = r0
            ᛴᛸᲇᛸ$ᲇᛶᛵᲇ r0 = new ᛴᛸᲇᛸ$ᲇᛶᛵᲇ
            r0.<init>()
            defpackage.C0736.f3484 = r0
            return
    }

    public C0736() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0699 m1653(defpackage.C1950 r3) {
            java.lang.Class<java.time.LocalDate> r0 = java.time.LocalDate.class
            ᛴᲀᲈᛴ r0 = r3.m3366(r0)
            java.lang.Class<java.time.LocalTime> r1 = java.time.LocalTime.class
            ᛴᲀᲈᛴ r3 = r3.m3366(r1)
            ᛸᛲᛸᲀ r1 = new ᛸᛲᛸᲀ
            r2 = 0
            r1.<init>(r0, r3, r2)
            ᛴᛶᲁᛸ r3 = r1.m1677()
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m1654(java.io.Serializable r1, java.lang.String r2, defpackage.C1103 r3) {
            if (r1 == 0) goto L3
            return
        L3:
            r1 = 1
            java.lang.String r1 = r3.m2106(r1)
            java.lang.String r3 = "Missing "
            java.lang.String r0 = " field; at path "
            defpackage.C0086.m555(r3, r2, r0, r1)
            return
    }
}
