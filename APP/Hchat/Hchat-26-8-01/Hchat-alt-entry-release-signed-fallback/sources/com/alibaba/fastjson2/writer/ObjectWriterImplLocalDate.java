package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplLocalDate extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate.INSTANCE = r0
            return
    }

    private ObjectWriterImplLocalDate(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            if (r9 != 0) goto L6
            r8.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r10 = r8.context
            java.time.LocalDate r9 = (java.time.LocalDate) r9
            boolean r11 = r7.formatUnixTime
            if (r11 != 0) goto L18
            java.lang.String r11 = r7.format
            if (r11 != 0) goto L1b
            boolean r11 = r10.isDateFormatUnixTime()
            if (r11 == 0) goto L1b
        L18:
            r0 = r8
            goto Lc1
        L1b:
            boolean r11 = r7.formatMillis
            if (r11 != 0) goto L29
            java.lang.String r11 = r7.format
            if (r11 != 0) goto L2c
            boolean r11 = r10.isDateFormatMillis()
            if (r11 == 0) goto L2c
        L29:
            r0 = r8
            goto La7
        L2c:
            boolean r11 = r7.yyyyMMdd8
            if (r11 == 0) goto L40
            int r10 = r9.getYear()
            int r11 = r9.getMonthValue()
            int r9 = r9.getDayOfMonth()
            r8.writeDateYYYMMDD8(r10, r11, r9)
            return
        L40:
            boolean r11 = r7.yyyyMMdd10
            if (r11 == 0) goto L54
            int r10 = r9.getYear()
            int r11 = r9.getMonthValue()
            int r9 = r9.getDayOfMonth()
            r8.writeDateYYYMMDD10(r10, r11, r9)
            return
        L54:
            boolean r11 = r7.yyyyMMddhhmmss19
            if (r11 == 0) goto L6c
            int r1 = r9.getYear()
            int r2 = r9.getMonthValue()
            int r3 = r9.getDayOfMonth()
            r5 = 0
            r6 = 0
            r4 = 0
            r0 = r8
            r0.writeDateTime19(r1, r2, r3, r4, r5, r6)
            return
        L6c:
            r0 = r8
            java.time.format.DateTimeFormatter r8 = r7.getDateFormatter()
            if (r8 != 0) goto L77
            java.time.format.DateTimeFormatter r8 = r10.getDateFormatter()
        L77:
            if (r8 != 0) goto L89
            int r8 = r9.getYear()
            int r10 = r9.getMonthValue()
            int r9 = r9.getDayOfMonth()
            r0.writeDateYYYMMDD10(r8, r10, r9)
            return
        L89:
            boolean r11 = r7.formatHasHour
            if (r11 != 0) goto L99
            boolean r10 = r10.isDateFormatHasHour()
            if (r10 == 0) goto L94
            goto L99
        L94:
            java.lang.String r8 = r8.format(r9)
            goto La3
        L99:
            java.time.LocalTime r10 = java.time.LocalTime.MIN
            java.time.LocalDateTime r9 = java.time.LocalDateTime.of(r9, r10)
            java.lang.String r8 = r8.format(r9)
        La3:
            r0.writeString(r8)
            return
        La7:
            java.time.LocalTime r8 = java.time.LocalTime.MIN
            java.time.LocalDateTime r8 = java.time.LocalDateTime.of(r9, r8)
            java.time.ZoneId r9 = r10.getZoneId()
            java.time.ZonedDateTime r8 = r8.atZone(r9)
            java.time.Instant r8 = r8.toInstant()
            long r8 = r8.toEpochMilli()
            r0.writeInt64(r8)
            return
        Lc1:
            java.time.LocalTime r8 = java.time.LocalTime.MIN
            java.time.LocalDateTime r8 = java.time.LocalDateTime.of(r9, r8)
            java.time.ZoneId r9 = r10.getZoneId()
            java.time.ZonedDateTime r8 = r8.atZone(r9)
            java.time.Instant r8 = r8.toInstant()
            long r8 = r8.toEpochMilli()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            r0.writeInt64(r8)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.time.LocalDate r2 = (java.time.LocalDate) r2
            r1.writeLocalDate(r2)
            return
    }
}
