package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplLocalTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime.INSTANCE = r0
            return
    }

    public ObjectWriterImplLocalTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r4 = r2.context
            java.time.LocalTime r3 = (java.time.LocalTime) r3
            boolean r5 = r1.formatMillis
            r6 = 1970(0x7b2, float:2.76E-42)
            r7 = 1
            if (r5 != 0) goto L92
            java.lang.String r5 = r1.format
            if (r5 != 0) goto L1d
            boolean r5 = r4.isDateFormatMillis()
            if (r5 == 0) goto L1d
            goto L92
        L1d:
            boolean r5 = r1.formatUnixTime
            if (r5 != 0) goto L72
            java.lang.String r5 = r1.format
            if (r5 != 0) goto L2c
            boolean r5 = r4.isDateFormatUnixTime()
            if (r5 == 0) goto L2c
            goto L72
        L2c:
            java.time.format.DateTimeFormatter r5 = r1.getDateFormatter()
            if (r5 != 0) goto L36
            java.time.format.DateTimeFormatter r5 = r4.getDateFormatter()
        L36:
            if (r5 != 0) goto L52
            int r4 = r3.getHour()
            int r5 = r3.getMinute()
            int r6 = r3.getSecond()
            int r7 = r3.getNano()
            if (r7 != 0) goto L4e
            r2.writeTimeHHMMSS8(r4, r5, r6)
            return
        L4e:
            r2.writeLocalTime(r3)
            return
        L52:
            boolean r0 = r1.formatHasDay
            if (r0 != 0) goto L62
            boolean r4 = r4.isDateFormatHasDay()
            if (r4 == 0) goto L5d
            goto L62
        L5d:
            java.lang.String r3 = r5.format(r3)
            goto L6e
        L62:
            java.time.LocalDate r4 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r4, r3)
            java.lang.String r3 = r5.format(r3)
        L6e:
            r2.writeString(r3)
            return
        L72:
            java.time.LocalDate r5 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r5, r3)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = r3.atZone(r4)
            java.time.Instant r3 = r3.toInstant()
            long r3 = r3.toEpochMilli()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r3 = (int) r3
            r2.writeInt32(r3)
            return
        L92:
            java.time.LocalDate r5 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r5, r3)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = r3.atZone(r4)
            java.time.Instant r3 = r3.toInstant()
            long r3 = r3.toEpochMilli()
            r2.writeInt64(r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.time.LocalTime r2 = (java.time.LocalTime) r2
            r1.writeLocalTime(r2)
            return
    }
}
