package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplLocalDateTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime.INSTANCE = r0
            return
    }

    public ObjectWriterImplLocalDateTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime of(java.lang.String r1, java.util.Locale r2) {
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r11, java.lang.Object r12, java.lang.Object r13, java.lang.reflect.Type r14, long r15) {
            r10 = this;
            if (r12 != 0) goto L6
            r11.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r13 = r11.context
            java.time.LocalDateTime r12 = (java.time.LocalDateTime) r12
            boolean r14 = r10.formatUnixTime
            if (r14 != 0) goto L127
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L1a
            boolean r14 = r13.isDateFormatUnixTime()
            if (r14 == 0) goto L1a
            goto L127
        L1a:
            boolean r14 = r10.formatMillis
            if (r14 != 0) goto L113
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L2a
            boolean r14 = r13.isDateFormatMillis()
            if (r14 == 0) goto L2a
            goto L113
        L2a:
            int r1 = r12.getYear()
            if (r1 < 0) goto Ld0
            r14 = 9999(0x270f, float:1.4012E-41)
            if (r1 > r14) goto Ld0
            boolean r14 = r10.formatISO8601
            if (r14 != 0) goto L9d
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L43
            boolean r14 = r13.isDateFormatISO8601()
            if (r14 == 0) goto L43
            goto L9d
        L43:
            boolean r14 = r10.yyyyMMddhhmmss19
            if (r14 == 0) goto L60
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            r0 = r11
            r0.writeDateTime19(r1, r2, r3, r4, r5, r6)
            return
        L60:
            boolean r14 = r10.yyyyMMddhhmmss14
            if (r14 == 0) goto L7d
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            r0 = r11
            r0.writeDateTime14(r1, r2, r3, r4, r5, r6)
            return
        L7d:
            boolean r14 = r10.yyyyMMdd8
            if (r14 == 0) goto L8d
            int r13 = r12.getMonthValue()
            int r12 = r12.getDayOfMonth()
            r11.writeDateYYYMMDD8(r1, r13, r12)
            return
        L8d:
            boolean r14 = r10.yyyyMMdd10
            if (r14 == 0) goto Ld0
            int r13 = r12.getMonthValue()
            int r12 = r12.getDayOfMonth()
            r11.writeDateYYYMMDD10(r1, r13, r12)
            return
        L9d:
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            int r14 = r12.getNano()
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r14 / r7
            java.time.ZoneId r13 = r13.getZoneId()
            java.time.zone.ZoneRules r13 = r13.getRules()
            java.time.ZoneOffset r12 = r13.getOffset(r12)
            int r8 = r12.getTotalSeconds()
            r9 = 1
            r0 = r11
            r0.writeDateTimeISO8601(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        Ld0:
            java.time.format.DateTimeFormatter r14 = r10.getDateFormatter()
            if (r14 != 0) goto Lda
            java.time.format.DateTimeFormatter r14 = r13.getDateFormatter()
        Lda:
            if (r14 != 0) goto Le0
            r11.writeLocalDateTime(r12)
            return
        Le0:
            boolean r13 = r10.useSimpleDateFormat
            if (r13 == 0) goto L10b
            com.alibaba.fastjson2.JSONWriter$Context r13 = r11.context
            java.time.ZoneId r13 = r13.getZoneId()
            java.time.zone.ZoneRules r13 = r13.getRules()
            java.time.ZoneOffset r13 = r13.getOffset(r12)
            java.time.Instant r12 = r12.toInstant(r13)
            java.util.Date r13 = new java.util.Date
            long r1 = r12.toEpochMilli()
            r13.<init>(r1)
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            java.lang.String r14 = r10.format
            r12.<init>(r14)
            java.lang.String r12 = r12.format(r13)
            goto L10f
        L10b:
            java.lang.String r12 = r14.format(r12)
        L10f:
            r11.writeString(r12)
            return
        L113:
            java.time.ZoneId r13 = r13.getZoneId()
            java.time.ZonedDateTime r12 = r12.atZone(r13)
            java.time.Instant r12 = r12.toInstant()
            long r12 = r12.toEpochMilli()
            r11.writeInt64(r12)
            return
        L127:
            java.time.ZoneId r13 = r13.getZoneId()
            java.time.ZonedDateTime r12 = r12.atZone(r13)
            java.time.Instant r12 = r12.toInstant()
            long r12 = r12.toEpochMilli()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r1
            r11.writeInt64(r12)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.time.LocalDateTime r2 = (java.time.LocalDateTime) r2
            r1.writeLocalDateTime(r2)
            return
    }
}
