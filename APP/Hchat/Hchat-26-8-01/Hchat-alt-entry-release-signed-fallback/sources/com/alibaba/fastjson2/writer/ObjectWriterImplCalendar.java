package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCalendar extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplCalendar INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplCalendar r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplCalendar
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCalendar.INSTANCE = r0
            return
    }

    public ObjectWriterImplCalendar(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r11, java.lang.Object r12, java.lang.Object r13, java.lang.reflect.Type r14, long r15) {
            r10 = this;
            if (r12 != 0) goto L6
            r11.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r13 = r11.context
            java.util.Calendar r12 = (java.util.Calendar) r12
            long r0 = r12.getTimeInMillis()
            boolean r12 = r10.formatUnixTime
            if (r12 != 0) goto Lc3
            java.lang.String r12 = r10.format
            if (r12 != 0) goto L1e
            boolean r12 = r13.isDateFormatUnixTime()
            if (r12 == 0) goto L1e
            goto Lc3
        L1e:
            java.lang.String r12 = r10.format
            if (r12 != 0) goto L2c
            boolean r12 = r13.isDateFormatMillis()
            if (r12 == 0) goto L2c
            r11.writeInt64(r0)
            return
        L2c:
            java.time.ZoneId r12 = r13.getZoneId()
            java.time.Instant r14 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r14, r12)
            java.time.ZoneOffset r14 = r12.getOffset()
            int r8 = r14.getTotalSeconds()
            int r1 = r12.getYear()
            if (r1 < 0) goto La8
            r14 = 9999(0x270f, float:1.4012E-41)
            if (r1 > r14) goto La8
            java.lang.String r14 = r10.format
            r7 = 1000000(0xf4240, float:1.401298E-39)
            if (r14 != 0) goto L77
            boolean r14 = r13.isDateFormatISO8601()
            if (r14 == 0) goto L77
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            int r12 = r12.getNano()
            int r7 = r12 / r7
            r9 = 1
            r0 = r11
            r0.writeDateTimeISO8601(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L77:
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L7f
            java.lang.String r14 = r13.getDateFormat()
        L7f:
            if (r14 != 0) goto La8
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            int r12 = r12.getNano()
            if (r12 != 0) goto La0
            r0 = r11
            r0.writeDateTime19(r1, r2, r3, r4, r5, r6)
            return
        La0:
            int r7 = r12 / r7
            r9 = 0
            r0 = r11
            r0.writeDateTimeISO8601(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        La8:
            java.lang.String r0 = r10.format
            if (r0 == 0) goto Lb1
            java.time.format.DateTimeFormatter r13 = r10.getDateFormatter()
            goto Lb5
        Lb1:
            java.time.format.DateTimeFormatter r13 = r13.getDateFormatter()
        Lb5:
            if (r13 != 0) goto Lbb
            r11.writeZonedDateTime(r12)
            return
        Lbb:
            java.lang.String r12 = r13.format(r12)
            r11.writeString(r12)
            return
        Lc3:
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r12
            r11.writeInt64(r0)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.Calendar r2 = (java.util.Calendar) r2
            long r2 = r2.getTimeInMillis()
            r1.writeMillis(r2)
            return
    }
}
