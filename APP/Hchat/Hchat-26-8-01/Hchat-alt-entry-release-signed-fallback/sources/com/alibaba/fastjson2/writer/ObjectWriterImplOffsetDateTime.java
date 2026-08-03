package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOffsetDateTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime.INSTANCE = r0
            return
    }

    private ObjectWriterImplOffsetDateTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime
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
            java.time.OffsetDateTime r12 = (java.time.OffsetDateTime) r12
            boolean r14 = r10.formatUnixTime
            if (r14 != 0) goto Lc8
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L1a
            boolean r14 = r13.isDateFormatUnixTime()
            if (r14 == 0) goto L1a
            goto Lc8
        L1a:
            boolean r14 = r10.formatMillis
            if (r14 != 0) goto Lbc
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L2a
            boolean r14 = r13.isDateFormatMillis()
            if (r14 == 0) goto L2a
            goto Lbc
        L2a:
            int r1 = r12.getYear()
            if (r1 < 0) goto La4
            r14 = 9999(0x270f, float:1.4012E-41)
            if (r1 > r14) goto La4
            boolean r14 = r10.formatISO8601
            if (r14 != 0) goto L79
            boolean r14 = r13.isDateFormatISO8601()
            if (r14 == 0) goto L3f
            goto L79
        L3f:
            boolean r14 = r10.yyyyMMddhhmmss19
            if (r14 == 0) goto L5c
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            r0 = r11
            r0.writeDateTime19(r1, r2, r3, r4, r5, r6)
            return
        L5c:
            boolean r14 = r10.yyyyMMddhhmmss14
            if (r14 == 0) goto La4
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            r0 = r11
            r0.writeDateTime14(r1, r2, r3, r4, r5, r6)
            return
        L79:
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            int r13 = r12.getNano()
            r14 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r13 / r14
            java.time.ZoneOffset r12 = r12.getOffset()
            int r8 = r12.getTotalSeconds()
            r9 = 1
            r0 = r11
            r0.writeDateTimeISO8601(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        La4:
            java.time.format.DateTimeFormatter r14 = r10.getDateFormatter()
            if (r14 != 0) goto Lae
            java.time.format.DateTimeFormatter r14 = r13.getDateFormatter()
        Lae:
            if (r14 != 0) goto Lb4
            r11.writeOffsetDateTime(r12)
            return
        Lb4:
            java.lang.String r12 = r14.format(r12)
            r11.writeString(r12)
            return
        Lbc:
            java.time.Instant r12 = r12.toInstant()
            long r12 = r12.toEpochMilli()
            r11.writeInt64(r12)
            return
        Lc8:
            java.time.Instant r12 = r12.toInstant()
            long r12 = r12.toEpochMilli()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r1
            r11.writeInt64(r12)
            return
    }
}
