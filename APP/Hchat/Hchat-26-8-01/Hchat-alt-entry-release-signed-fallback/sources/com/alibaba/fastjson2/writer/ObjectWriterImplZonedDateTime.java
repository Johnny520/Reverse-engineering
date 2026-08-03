package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplZonedDateTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime INSTANCE = null;
    private final java.util.function.Function function;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime.INSTANCE = r0
            return
    }

    public ObjectWriterImplZonedDateTime(java.lang.String r2, java.util.Locale r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ObjectWriterImplZonedDateTime(java.lang.String r1, java.util.Locale r2, java.util.function.Function r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.function = r3
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r11, java.lang.Object r12, java.lang.Object r13, java.lang.reflect.Type r14, long r15) {
            r10 = this;
            if (r12 != 0) goto L6
            r11.writeNull()
            return
        L6:
            java.util.function.Function r13 = r10.function
            if (r13 == 0) goto L11
            java.lang.Object r12 = r13.apply(r12)
            java.time.ZonedDateTime r12 = (java.time.ZonedDateTime) r12
            goto L13
        L11:
            java.time.ZonedDateTime r12 = (java.time.ZonedDateTime) r12
        L13:
            com.alibaba.fastjson2.JSONWriter$Context r13 = r11.context
            boolean r14 = r10.formatUnixTime
            if (r14 != 0) goto Ld3
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L25
            boolean r14 = r13.isDateFormatUnixTime()
            if (r14 == 0) goto L25
            goto Ld3
        L25:
            boolean r14 = r10.formatMillis
            if (r14 != 0) goto Lc7
            java.lang.String r14 = r10.format
            if (r14 != 0) goto L35
            boolean r14 = r13.isDateFormatMillis()
            if (r14 == 0) goto L35
            goto Lc7
        L35:
            int r1 = r12.getYear()
            if (r1 < 0) goto Laf
            r14 = 9999(0x270f, float:1.4012E-41)
            if (r1 > r14) goto Laf
            boolean r14 = r10.formatISO8601
            if (r14 != 0) goto L84
            boolean r14 = r13.isDateFormatISO8601()
            if (r14 == 0) goto L4a
            goto L84
        L4a:
            boolean r14 = r10.yyyyMMddhhmmss19
            if (r14 == 0) goto L67
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            r0 = r11
            r0.writeDateTime19(r1, r2, r3, r4, r5, r6)
            return
        L67:
            boolean r14 = r10.yyyyMMddhhmmss14
            if (r14 == 0) goto Laf
            int r2 = r12.getMonthValue()
            int r3 = r12.getDayOfMonth()
            int r4 = r12.getHour()
            int r5 = r12.getMinute()
            int r6 = r12.getSecond()
            r0 = r11
            r0.writeDateTime14(r1, r2, r3, r4, r5, r6)
            return
        L84:
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
        Laf:
            java.time.format.DateTimeFormatter r14 = r10.getDateFormatter()
            if (r14 != 0) goto Lb9
            java.time.format.DateTimeFormatter r14 = r13.getDateFormatter()
        Lb9:
            if (r14 != 0) goto Lbf
            r11.writeZonedDateTime(r12)
            return
        Lbf:
            java.lang.String r12 = r14.format(r12)
            r11.writeString(r12)
            return
        Lc7:
            java.time.Instant r12 = r12.toInstant()
            long r12 = r12.toEpochMilli()
            r11.writeInt64(r12)
            return
        Ld3:
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
            java.time.ZonedDateTime r2 = (java.time.ZonedDateTime) r2
            r1.writeZonedDateTime(r2)
            return
    }
}
