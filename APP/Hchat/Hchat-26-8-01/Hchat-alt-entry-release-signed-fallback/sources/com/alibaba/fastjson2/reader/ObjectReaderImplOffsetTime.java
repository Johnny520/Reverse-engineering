package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplOffsetTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime.INSTANCE = r0
            return
    }

    public ObjectReaderImplOffsetTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime r1 = com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.time.OffsetTime> r0 = java.time.OffsetTime.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r4 = r3.getContext()
            boolean r5 = r3.isInt()
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L38
            long r0 = r3.readInt64Value()
            boolean r3 = r2.formatUnixTime
            if (r3 != 0) goto L1a
            boolean r3 = r4.isFormatUnixTime()
            if (r3 == 0) goto L1b
        L1a:
            long r0 = r0 * r6
        L1b:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.LocalDateTime r5 = java.time.LocalDateTime.ofInstant(r3, r4)
            java.time.LocalTime r5 = r5.toLocalTime()
            java.time.zone.ZoneRules r4 = r4.getRules()
            java.time.ZoneOffset r3 = r4.getOffset(r3)
            java.time.OffsetTime r3 = java.time.OffsetTime.of(r5, r3)
            return r3
        L38:
            boolean r5 = r3.readIfNull()
            if (r5 == 0) goto L40
            r3 = 0
            return r3
        L40:
            java.lang.String r5 = r2.format
            if (r5 != 0) goto L49
            java.time.OffsetTime r3 = r3.readOffsetTime()
            return r3
        L49:
            java.lang.String r5 = r3.readString()
            java.time.ZoneId r4 = r4.getZoneId()
            boolean r0 = r2.formatMillis
            if (r0 != 0) goto Lb2
            boolean r0 = r2.formatUnixTime
            if (r0 == 0) goto L5a
            goto Lb2
        L5a:
            java.util.Locale r3 = r3.getLocale()
            java.time.format.DateTimeFormatter r3 = r2.getDateFormatter(r3)
            boolean r6 = r2.formatHasHour
            if (r6 != 0) goto L81
            java.time.LocalDate r3 = java.time.LocalDate.parse(r5, r3)
            java.time.LocalTime r5 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r5)
            java.time.zone.ZoneRules r4 = r4.getRules()
            java.time.ZoneOffset r4 = r4.getOffset(r3)
            java.time.OffsetDateTime r3 = java.time.OffsetDateTime.of(r3, r4)
            java.time.OffsetTime r3 = r3.toOffsetTime()
            return r3
        L81:
            boolean r6 = r2.formatHasDay
            if (r6 != 0) goto L9d
            r6 = 1970(0x7b2, float:2.76E-42)
            r7 = 1
            java.time.LocalDate r6 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalTime r3 = java.time.LocalTime.parse(r5, r3)
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r6, r3, r4)
            java.time.OffsetDateTime r3 = r3.toOffsetDateTime()
            java.time.OffsetTime r3 = r3.toOffsetTime()
            return r3
        L9d:
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r5, r3)
            java.time.zone.ZoneRules r4 = r4.getRules()
            java.time.ZoneOffset r4 = r4.getOffset(r3)
            java.time.OffsetDateTime r3 = java.time.OffsetDateTime.of(r3, r4)
            java.time.OffsetTime r3 = r3.toOffsetTime()
            return r3
        Lb2:
            long r0 = java.lang.Long.parseLong(r5)
            boolean r3 = r2.formatUnixTime
            if (r3 == 0) goto Lbb
            long r0 = r0 * r6
        Lbb:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r0)
            java.time.LocalDateTime r5 = java.time.LocalDateTime.ofInstant(r3, r4)
            java.time.zone.ZoneRules r4 = r4.getRules()
            java.time.ZoneOffset r3 = r4.getOffset(r3)
            java.time.OffsetDateTime r3 = java.time.OffsetDateTime.of(r5, r3)
            java.time.OffsetTime r3 = r3.toOffsetTime()
            return r3
    }
}
