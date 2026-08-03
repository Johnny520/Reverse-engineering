package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInstant extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplInstant INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplInstant r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInstant
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplInstant.INSTANCE = r0
            return
    }

    public ObjectWriterImplInstant(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r30, java.lang.Object r31, java.lang.Object r32, java.lang.reflect.Type r33, long r34) {
            r29 = this;
            r0 = r29
            r1 = r30
            if (r31 != 0) goto La
            r1.writeNull()
            return
        La:
            com.alibaba.fastjson2.JSONWriter$Context r2 = r1.context
            java.lang.String r3 = r0.format
            if (r3 == 0) goto L11
            goto L15
        L11:
            java.lang.String r3 = r2.getDateFormat()
        L15:
            r4 = r31
            java.time.Instant r4 = (java.time.Instant) r4
            if (r3 != 0) goto L1f
            r1.writeInstant(r4)
            return
        L1f:
            boolean r3 = r0.yyyyMMddhhmmss19
            r5 = 1
            if (r3 != 0) goto L31
            boolean r3 = r2.isFormatyyyyMMddhhmmss19()
            if (r3 == 0) goto L2f
            java.lang.String r3 = r0.format
            if (r3 != 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = r5
        L32:
            boolean r6 = r0.yyyyMMddhhmmss14
            if (r6 != 0) goto L40
            if (r3 != 0) goto L40
            boolean r6 = r0.yyyyMMdd8
            if (r6 != 0) goto L40
            boolean r6 = r0.yyyyMMdd10
            if (r6 == 0) goto L43
        L40:
            r6 = r2
            goto Lee
        L43:
            java.time.ZoneId r3 = r2.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r4, r3)
            boolean r4 = r0.formatUnixTime
            if (r4 != 0) goto L59
            java.lang.String r4 = r0.format
            if (r4 != 0) goto L5c
            boolean r4 = r2.isDateFormatUnixTime()
            if (r4 == 0) goto L5c
        L59:
            r8 = r3
            goto Ldf
        L5c:
            boolean r4 = r0.formatMillis
            if (r4 != 0) goto L6a
            java.lang.String r4 = r0.format
            if (r4 != 0) goto L6d
            boolean r4 = r2.isDateFormatMillis()
            if (r4 == 0) goto L6d
        L6a:
            r8 = r3
            goto Ld3
        L6d:
            r6 = r2
            int r2 = r3.getYear()
            if (r2 < 0) goto L88
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r2 > r4) goto L88
            boolean r4 = r0.formatISO8601
            if (r4 != 0) goto L86
            java.lang.String r4 = r0.format
            if (r4 != 0) goto L88
            boolean r4 = r6.isDateFormatISO8601()
            if (r4 == 0) goto L88
        L86:
            r4 = r3
            goto L8a
        L88:
            r8 = r3
            goto Lbb
        L8a:
            int r3 = r4.getMonthValue()
            r5 = r4
            int r4 = r5.getDayOfMonth()
            r7 = r5
            int r5 = r7.getHour()
            int r6 = r7.getMinute()
            r8 = r7
            int r7 = r8.getSecond()
            int r9 = r8.getNano()
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r9 = r9 / r10
            java.time.ZoneOffset r8 = r8.getOffset()
            int r8 = r8.getTotalSeconds()
            r10 = 1
            r28 = r9
            r9 = r8
            r8 = r28
            r1.writeDateTimeISO8601(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        Lbb:
            java.time.format.DateTimeFormatter r2 = r0.getDateFormatter()
            if (r2 != 0) goto Lc5
            java.time.format.DateTimeFormatter r2 = r6.getDateFormatter()
        Lc5:
            if (r2 != 0) goto Lcb
            r1.writeZonedDateTime(r8)
            return
        Lcb:
            java.lang.String r2 = r2.format(r8)
            r1.writeString(r2)
            return
        Ld3:
            java.time.Instant r2 = r8.toInstant()
            long r2 = r2.toEpochMilli()
            r1.writeInt64(r2)
            return
        Ldf:
            java.time.Instant r2 = r8.toInstant()
            long r2 = r2.toEpochMilli()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r1.writeInt64(r2)
            return
        Lee:
            java.time.ZoneId r2 = r6.getZoneId()
            long r6 = r4.getEpochSecond()
            java.time.ZoneId r8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r2 == r8) goto L110
            java.time.zone.ZoneRules r8 = r2.getRules()
            java.time.zone.ZoneRules r9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r8 != r9) goto L103
            goto L110
        L103:
            java.time.zone.ZoneRules r2 = r2.getRules()
            java.time.ZoneOffset r2 = r2.getOffset(r4)
            int r2 = r2.getTotalSeconds()
            goto L114
        L110:
            int r2 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(r6)
        L114:
            long r8 = (long) r2
            long r6 = r6 + r8
            r8 = 86400(0x15180, double:4.26873E-319)
            long r10 = java.lang.Math.floorDiv(r6, r8)
            long r6 = java.lang.Math.floorMod(r6, r8)
            int r2 = (int) r6
            r6 = 719468(0xafa6c, double:3.554644E-318)
            long r6 = r6 + r10
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r12 = 1
            r14 = 146097(0x23ab1, double:7.21815E-319)
            r16 = 400(0x190, double:1.976E-321)
            if (r4 >= 0) goto L140
            r18 = 719469(0xafa6d, double:3.55465E-318)
            long r10 = r10 + r18
            long r10 = r10 / r14
            long r10 = r10 - r12
            long r18 = r10 * r16
            long r10 = -r10
            long r10 = r10 * r14
            long r6 = r6 + r10
            goto L142
        L140:
            r18 = r8
        L142:
            long r10 = r6 * r16
            r20 = 591(0x24f, double:2.92E-321)
            long r10 = r10 + r20
            long r10 = r10 / r14
            r14 = 365(0x16d, double:1.803E-321)
            long r20 = r10 * r14
            r22 = 4
            long r24 = r10 / r22
            long r24 = r24 + r20
            r20 = 100
            long r26 = r10 / r20
            long r24 = r24 - r26
            long r26 = r10 / r16
            long r26 = r26 + r24
            long r24 = r6 - r26
            int r4 = (r24 > r8 ? 1 : (r24 == r8 ? 0 : -1))
            if (r4 >= 0) goto L170
            long r10 = r10 - r12
            long r14 = r14 * r10
            long r12 = r10 / r22
            long r12 = r12 + r14
            long r14 = r10 / r20
            long r12 = r12 - r14
            long r14 = r10 / r16
            long r14 = r14 + r12
            long r24 = r6 - r14
        L170:
            r6 = r24
            long r10 = r10 + r18
            int r4 = (int) r6
            int r6 = r4 * 5
            int r6 = r6 + 2
            int r6 = r6 / 153
            int r7 = r6 + 2
            int r7 = r7 % 12
            int r7 = r7 + r5
            int r12 = r6 * 306
            int r12 = r12 + 5
            int r12 = r12 / 10
            int r4 = r4 - r12
            int r4 = r4 + r5
            int r6 = r6 / 10
            long r5 = (long) r6
            long r10 = r10 + r5
            r5 = -999999999(0xffffffffc4653601, double:NaN)
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 < 0) goto L1ee
            r5 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 > 0) goto L1ee
            int r5 = (int) r10
            long r10 = (long) r2
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 < 0) goto L1e2
            r8 = 86399(0x1517f, double:4.2687E-319)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L1e2
            r8 = 3600(0xe10, double:1.7786E-320)
            long r8 = r10 / r8
            int r2 = (int) r8
            int r6 = r2 * 3600
            long r8 = (long) r6
            long r10 = r10 - r8
            r8 = 60
            long r8 = r10 / r8
            int r6 = (int) r8
            int r8 = r6 * 60
            long r8 = (long) r8
            long r10 = r10 - r8
            int r8 = (int) r10
            if (r3 == 0) goto L1c5
            r3 = r5
            r5 = r2
            r2 = r3
            r3 = r7
            r7 = r8
            r1.writeDateTime19(r2, r3, r4, r5, r6, r7)
            return
        L1c5:
            r3 = r5
            r5 = r2
            r2 = r3
            r3 = r7
            r7 = r8
            boolean r1 = r0.yyyyMMddhhmmss14
            if (r1 == 0) goto L1d4
            r1 = r30
            r1.writeDateTime14(r2, r3, r4, r5, r6, r7)
            return
        L1d4:
            r1 = r30
            boolean r5 = r0.yyyyMMdd10
            if (r5 == 0) goto L1de
            r1.writeDateYYYMMDD10(r2, r3, r4)
            return
        L1de:
            r1.writeDateYYYMMDD8(r2, r3, r4)
            return
        L1e2:
            java.time.DateTimeException r1 = new java.time.DateTimeException
            java.lang.String r2 = "Invalid secondOfDay "
            java.lang.String r2 = bc.e.g(r10, r2)
            r1.<init>(r2)
            throw r1
        L1ee:
            java.time.DateTimeException r1 = new java.time.DateTimeException
            java.lang.String r2 = "Invalid year "
            java.lang.String r2 = bc.e.g(r10, r2)
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.time.Instant r2 = (java.time.Instant) r2
            r1.writeInstant(r2)
            return
    }
}
