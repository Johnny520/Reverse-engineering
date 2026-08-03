package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalDateTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime.INSTANCE = r0
            return
    }

    public ObjectReaderImplLocalDateTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.time.LocalDateTime> r0 = java.time.LocalDateTime.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.time.LocalDateTime r1 = r1.readLocalDateTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            boolean r0 = r3.jsonb
            if (r0 == 0) goto La
            java.lang.Object r3 = r2.readJSONBObject(r3, r4, r5, r6)
            r4 = r2
            return r3
        La:
            r4 = r2
            com.alibaba.fastjson2.JSONReader$Context r5 = r3.getContext()
            boolean r6 = r3.isInt()
            r0 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L4c
            boolean r6 = r4.yyyyMMddhhmmss19
            if (r6 != 0) goto L36
            boolean r6 = r4.formatMillis
            if (r6 != 0) goto L36
            boolean r6 = r4.formatISO8601
            if (r6 != 0) goto L36
            boolean r6 = r4.formatUnixTime
            if (r6 != 0) goto L36
            java.time.format.DateTimeFormatter r6 = r2.getDateFormatter()
            if (r6 == 0) goto L36
            java.lang.String r3 = r3.readString()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r3, r6)
            return r3
        L36:
            long r6 = r3.readInt64Value()
            boolean r3 = r4.formatUnixTime
            if (r3 == 0) goto L3f
            long r6 = r6 * r0
        L3f:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r6)
            java.time.ZoneId r5 = r5.getZoneId()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r3, r5)
            return r3
        L4c:
            boolean r6 = r3.readIfNull()
            r7 = 0
            if (r6 == 0) goto L54
            return r7
        L54:
            java.lang.String r6 = r4.format
            if (r6 == 0) goto Lbb
            boolean r6 = r4.yyyyMMddhhmmss19
            if (r6 != 0) goto Lbb
            boolean r6 = r4.formatISO8601
            if (r6 == 0) goto L61
            goto Lbb
        L61:
            java.lang.String r3 = r3.readString()
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L6c
            return r7
        L6c:
            boolean r6 = r4.formatMillis
            if (r6 != 0) goto La5
            boolean r6 = r4.formatUnixTime
            if (r6 == 0) goto L75
            goto La5
        L75:
            java.util.Locale r5 = r5.getLocale()
            java.time.format.DateTimeFormatter r5 = r2.getDateFormatter(r5)
            boolean r6 = r4.formatHasHour
            if (r6 != 0) goto L8c
            java.time.LocalDate r3 = java.time.LocalDate.parse(r3, r5)
            java.time.LocalTime r5 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r5)
            return r3
        L8c:
            boolean r6 = r4.formatHasDay
            if (r6 != 0) goto La0
            r6 = 1970(0x7b2, float:2.76E-42)
            r7 = 1
            java.time.LocalDate r6 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalTime r3 = java.time.LocalTime.parse(r3, r5)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r6, r3)
            return r3
        La0:
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r3, r5)
            return r3
        La5:
            long r6 = java.lang.Long.parseLong(r3)
            boolean r3 = r4.formatUnixTime
            if (r3 == 0) goto Lae
            long r6 = r6 * r0
        Lae:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r6)
            java.time.ZoneId r5 = r5.getZoneId()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r3, r5)
            return r3
        Lbb:
            java.time.LocalDateTime r3 = r3.readLocalDateTime()
            return r3
    }
}
