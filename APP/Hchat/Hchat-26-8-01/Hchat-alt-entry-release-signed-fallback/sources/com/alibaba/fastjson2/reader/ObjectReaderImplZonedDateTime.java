package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplZonedDateTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime INSTANCE = null;
    private java.util.function.Function builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime.INSTANCE = r0
            return
    }

    public ObjectReaderImplZonedDateTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ObjectReaderImplZonedDateTime(java.util.function.Function r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.builder = r2
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime r1 = com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.time.ZonedDateTime> r0 = java.time.ZonedDateTime.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.time.ZonedDateTime r1 = r1.readZonedDateTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r4 = r3.getContext()
            boolean r5 = r3.isInt()
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L23
            long r0 = r3.readInt64Value()
            boolean r3 = r2.formatUnixTime
            if (r3 == 0) goto L15
            long r0 = r0 * r6
        L15:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r3, r4)
            goto La0
        L23:
            boolean r5 = r3.readIfNull()
            if (r5 == 0) goto L2c
            r3 = 0
            goto La0
        L2c:
            java.lang.String r5 = r2.format
            if (r5 == 0) goto L9c
            boolean r5 = r2.yyyyMMddhhmmss19
            if (r5 != 0) goto L9c
            boolean r5 = r2.formatISO8601
            if (r5 == 0) goto L39
            goto L9c
        L39:
            java.lang.String r5 = r3.readString()
            boolean r0 = r2.formatMillis
            if (r0 != 0) goto L86
            boolean r0 = r2.formatUnixTime
            if (r0 == 0) goto L46
            goto L86
        L46:
            java.util.Locale r3 = r3.getLocale()
            java.time.format.DateTimeFormatter r3 = r2.getDateFormatter(r3)
            boolean r6 = r2.formatHasHour
            if (r6 != 0) goto L61
            java.time.LocalDate r3 = java.time.LocalDate.parse(r5, r3)
            java.time.LocalTime r5 = java.time.LocalTime.MIN
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r3, r5, r4)
            goto La0
        L61:
            boolean r6 = r2.formatHasDay
            if (r6 != 0) goto L79
            r6 = 1970(0x7b2, float:2.76E-42)
            r7 = 1
            java.time.LocalDate r6 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalTime r3 = java.time.LocalTime.parse(r5, r3)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r6, r3, r4)
            goto La0
        L79:
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r5, r3)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r3, r4)
            goto La0
        L86:
            long r0 = java.lang.Long.parseLong(r5)
            boolean r3 = r2.formatUnixTime
            if (r3 == 0) goto L8f
            long r0 = r0 * r6
        L8f:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r3, r4)
            goto La0
        L9c:
            java.time.ZonedDateTime r3 = r3.readZonedDateTime()
        La0:
            java.util.function.Function r4 = r2.builder
            if (r4 == 0) goto Laa
            if (r3 == 0) goto Laa
            java.lang.Object r3 = r4.apply(r3)
        Laa:
            return r3
    }
}
