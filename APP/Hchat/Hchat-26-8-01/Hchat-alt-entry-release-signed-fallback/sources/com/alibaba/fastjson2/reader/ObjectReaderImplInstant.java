package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInstant extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    public static final com.alibaba.fastjson2.reader.ObjectReaderImplInstant INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInstant
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant.INSTANCE = r0
            return
    }

    public ObjectReaderImplInstant(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplInstant of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant r1 = com.alibaba.fastjson2.reader.ObjectReaderImplInstant.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInstant
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Map r3, long r4) {
            r2 = this;
            java.lang.String r4 = "nano"
            java.lang.Object r4 = r3.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.String r5 = "epochSecond"
            java.lang.Object r5 = r3.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r4 == 0) goto L21
            if (r5 == 0) goto L21
            long r0 = r5.longValue()
            long r3 = r4.longValue()
            java.time.Instant r3 = java.time.Instant.ofEpochSecond(r0, r3)
            return r3
        L21:
            if (r5 == 0) goto L2c
            long r3 = r5.longValue()
            java.time.Instant r3 = java.time.Instant.ofEpochSecond(r3)
            return r3
        L2c:
            java.lang.String r4 = "epochMilli"
            java.lang.Object r3 = r3.get(r4)
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L3f
            long r3 = r3.longValue()
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r3)
            return r3
        L3f:
            java.lang.String r3 = "can not create instant."
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.time.Instant r1 = r1.readInstant()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r4 = r3.getContext()
            boolean r5 = r3.isInt()
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L20
            java.lang.String r5 = r4.getDateFormat()
            if (r5 != 0) goto L20
            long r3 = r3.readInt64Value()
            boolean r5 = r2.formatUnixTime
            if (r5 == 0) goto L1b
            long r3 = r3 * r6
        L1b:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r3)
            return r3
        L20:
            boolean r5 = r3.readIfNull()
            r0 = 0
            if (r5 == 0) goto L28
            return r0
        L28:
            java.lang.String r5 = r2.format
            if (r5 == 0) goto La9
            boolean r5 = r2.yyyyMMddhhmmss19
            if (r5 != 0) goto La9
            boolean r5 = r2.formatISO8601
            if (r5 != 0) goto La9
            boolean r5 = r3.isObject()
            if (r5 == 0) goto L3b
            goto La9
        L3b:
            java.lang.String r5 = r3.readString()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L46
            return r0
        L46:
            boolean r0 = r2.formatMillis
            if (r0 != 0) goto L9b
            boolean r0 = r2.formatUnixTime
            if (r0 == 0) goto L4f
            goto L9b
        L4f:
            java.util.Locale r3 = r3.getLocale()
            java.time.format.DateTimeFormatter r3 = r2.getDateFormatter(r3)
            boolean r6 = r2.formatHasHour
            if (r6 != 0) goto L6e
            java.time.LocalDate r3 = java.time.LocalDate.parse(r5, r3)
            java.time.LocalTime r5 = java.time.LocalTime.MIN
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r3, r5, r4)
            java.time.Instant r3 = r3.toInstant()
            return r3
        L6e:
            boolean r6 = r2.formatHasDay
            if (r6 != 0) goto L8a
            r6 = 1970(0x7b2, float:2.76E-42)
            r7 = 1
            java.time.LocalDate r6 = java.time.LocalDate.of(r6, r7, r7)
            java.time.LocalTime r3 = java.time.LocalTime.parse(r5, r3)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r6, r3, r4)
            java.time.Instant r3 = r3.toInstant()
            return r3
        L8a:
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r5, r3)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r3, r4)
            java.time.Instant r3 = r3.toInstant()
            return r3
        L9b:
            long r3 = java.lang.Long.parseLong(r5)
            boolean r5 = r2.formatUnixTime
            if (r5 == 0) goto La4
            long r3 = r3 * r6
        La4:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r3)
            return r3
        La9:
            java.time.Instant r3 = r3.readInstant()
            return r3
    }
}
