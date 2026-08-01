package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲈᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0328 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1240;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.List f1241;

    public C0328(java.lang.String[] r1, int r2) {
            r0 = this;
            r0.f1240 = r2
            r0.<init>()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.f1241 = r1
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r13) {
            r12 = this;
            int r0 = r13.m762()
            r1 = 9
            if (r0 != r1) goto Ld
            r13.m756()
            r12 = 0
            return r12
        Ld:
            r13.m743()
            java.util.List r0 = r12.f1241
            int r1 = r0.size()
            long[] r1 = new long[r1]
        L18:
            int r2 = r13.m762()
            r3 = 4
            if (r2 == r3) goto L34
            java.lang.String r2 = r13.m765()
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto L30
            long r3 = r13.m758()
            r1[r2] = r3
            goto L18
        L30:
            r13.m753()
            goto L18
        L34:
            r13.m750()
            int r12 = r12.f1240
            r13 = 3
            r0 = 2
            r2 = 1
            r4 = 0
            switch(r12) {
                case 0: goto Lec;
                case 1: goto Ldb;
                case 2: goto Ld2;
                case 3: goto Lc9;
                case 4: goto Lb2;
                case 5: goto L95;
                case 6: goto L84;
                case 7: goto L6c;
                default: goto L40;
            }
        L40:
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar
            r6 = r1[r4]
            int r6 = xhss.AbstractC0073.m224(r6)
            r7 = r1[r2]
            int r7 = xhss.AbstractC0073.m224(r7)
            r8 = r1[r0]
            int r8 = xhss.AbstractC0073.m224(r8)
            r12 = r1[r13]
            int r9 = xhss.AbstractC0073.m224(r12)
            r12 = r1[r3]
            int r10 = xhss.AbstractC0073.m224(r12)
            r12 = 5
            r12 = r1[r12]
            int r11 = xhss.AbstractC0073.m224(r12)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto Lf6
        L6c:
            r12 = r1[r4]
            int r12 = java.lang.Math.toIntExact(r12)
            r2 = r1[r2]
            int r13 = java.lang.Math.toIntExact(r2)
            r0 = r1[r0]
            int r0 = java.lang.Math.toIntExact(r0)
            java.time.Period r5 = java.time.Period.of(r12, r13, r0)
            goto Lf6
        L84:
            r12 = r1[r4]
            int r12 = java.lang.Math.toIntExact(r12)
            r0 = r1[r2]
            int r13 = java.lang.Math.toIntExact(r0)
            java.time.MonthDay r5 = java.time.MonthDay.of(r12, r13)
            goto Lf6
        L95:
            r3 = r1[r4]
            int r12 = java.lang.Math.toIntExact(r3)
            r2 = r1[r2]
            int r2 = java.lang.Math.toIntExact(r2)
            r3 = r1[r0]
            int r0 = java.lang.Math.toIntExact(r3)
            r3 = r1[r13]
            int r13 = java.lang.Math.toIntExact(r3)
            java.time.LocalTime r5 = java.time.LocalTime.of(r12, r2, r0, r13)
            goto Lf6
        Lb2:
            r12 = r1[r4]
            int r12 = java.lang.Math.toIntExact(r12)
            r2 = r1[r2]
            int r13 = java.lang.Math.toIntExact(r2)
            r0 = r1[r0]
            int r0 = java.lang.Math.toIntExact(r0)
            java.time.LocalDate r5 = java.time.LocalDate.of(r12, r13, r0)
            goto Lf6
        Lc9:
            r12 = r1[r4]
            r0 = r1[r2]
            java.time.Instant r5 = java.time.Instant.ofEpochSecond(r12, r0)
            goto Lf6
        Ld2:
            r12 = r1[r4]
            r0 = r1[r2]
            java.time.Duration r5 = java.time.Duration.ofSeconds(r12, r0)
            goto Lf6
        Ldb:
            r12 = r1[r4]
            int r12 = java.lang.Math.toIntExact(r12)
            r0 = r1[r2]
            int r13 = java.lang.Math.toIntExact(r0)
            java.time.YearMonth r5 = java.time.YearMonth.of(r12, r13)
            goto Lf6
        Lec:
            r12 = r1[r4]
            int r12 = java.lang.Math.toIntExact(r12)
            java.time.Year r5 = java.time.Year.of(r12)
        Lf6:
            return r5
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r22, java.lang.Object r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            if (r23 != 0) goto La
            r1.m1396()
            return
        La:
            r1.m1407()
            int r2 = r0.f1240
            r3 = 4
            r4 = 3
            r5 = 2
            r7 = 1
            switch(r2) {
                case 0: goto L11f;
                case 1: goto L107;
                case 2: goto Lf0;
                case 3: goto Ld9;
                case 4: goto Lba;
                case 5: goto L93;
                case 6: goto L7a;
                case 7: goto L59;
                default: goto L16;
            }
        L16:
            r2 = r23
            java.util.Calendar r2 = (java.util.Calendar) r2
            int r8 = r2.get(r7)
            long r8 = (long) r8
            int r10 = r2.get(r5)
            long r10 = (long) r10
            r12 = 5
            int r13 = r2.get(r12)
            long r13 = (long) r13
            r15 = 11
            int r15 = r2.get(r15)
            r23 = r12
            r16 = r13
            long r12 = (long) r15
            r14 = 12
            int r14 = r2.get(r14)
            long r14 = (long) r14
            r18 = 0
            r6 = 13
            int r2 = r2.get(r6)
            r6 = r7
            r19 = r8
            long r7 = (long) r2
            r2 = 6
            long[] r2 = new long[r2]
            r2[r18] = r19
            r2[r6] = r10
            r2[r5] = r16
            r2[r4] = r12
            r2[r3] = r14
            r2[r23] = r7
            goto L131
        L59:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.Period r2 = (java.time.Period) r2
            int r3 = r2.getYears()
            long r7 = (long) r3
            int r3 = r2.getMonths()
            long r9 = (long) r3
            int r2 = r2.getDays()
            long r2 = (long) r2
            long[] r4 = new long[r4]
            r4[r18] = r7
            r4[r6] = r9
            r4[r5] = r2
        L77:
            r2 = r4
            goto L131
        L7a:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.MonthDay r2 = (java.time.MonthDay) r2
            int r3 = r2.getMonthValue()
            long r3 = (long) r3
            int r2 = r2.getDayOfMonth()
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        L93:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.LocalTime r2 = (java.time.LocalTime) r2
            int r7 = r2.getHour()
            long r7 = (long) r7
            int r9 = r2.getMinute()
            long r9 = (long) r9
            int r11 = r2.getSecond()
            long r11 = (long) r11
            int r2 = r2.getNano()
            long r13 = (long) r2
            long[] r2 = new long[r3]
            r2[r18] = r7
            r2[r6] = r9
            r2[r5] = r11
            r2[r4] = r13
            goto L131
        Lba:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.LocalDate r2 = (java.time.LocalDate) r2
            int r3 = r2.getYear()
            long r7 = (long) r3
            int r3 = r2.getMonthValue()
            long r9 = (long) r3
            int r2 = r2.getDayOfMonth()
            long r2 = (long) r2
            long[] r4 = new long[r4]
            r4[r18] = r7
            r4[r6] = r9
            r4[r5] = r2
            goto L77
        Ld9:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.Instant r2 = (java.time.Instant) r2
            long r3 = r2.getEpochSecond()
            int r2 = r2.getNano()
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        Lf0:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.Duration r2 = (java.time.Duration) r2
            long r3 = r2.getSeconds()
            int r2 = r2.getNano()
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        L107:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.YearMonth r2 = (java.time.YearMonth) r2
            int r3 = r2.getYear()
            long r3 = (long) r3
            int r2 = r2.getMonthValue()
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        L11f:
            r6 = r7
            r18 = 0
            r2 = r23
            java.time.Year r2 = (java.time.Year) r2
            int r2 = r2.getValue()
            long r2 = (long) r2
            long[] r4 = new long[r6]
            r4[r18] = r2
            goto L77
        L131:
            r6 = r18
        L133:
            java.util.List r3 = r0.f1241
            int r4 = r3.size()
            if (r6 >= r4) goto L14c
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r1.m1403(r3)
            r3 = r2[r6]
            r1.m1397(r3)
            int r6 = r6 + 1
            goto L133
        L14c:
            r1.m1399()
            return
    }
}
