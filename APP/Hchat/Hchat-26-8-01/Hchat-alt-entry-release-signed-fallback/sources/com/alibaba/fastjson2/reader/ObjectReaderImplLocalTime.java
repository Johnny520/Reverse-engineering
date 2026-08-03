package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime.INSTANCE = r0
            return
    }

    public ObjectReaderImplLocalTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.time.LocalTime> r0 = java.time.LocalTime.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.time.LocalTime r1 = r1.readLocalTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r4 = r3.getContext()
            boolean r5 = r3.readIfNull()
            r6 = 0
            if (r5 == 0) goto Lc
            return r6
        Lc:
            boolean r5 = r3.isInt()
            r0 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L2e
            long r5 = r3.readInt64Value()
            boolean r3 = r2.formatUnixTime
            if (r3 == 0) goto L1d
            long r5 = r5 * r0
        L1d:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r5)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r3, r4)
            java.time.LocalTime r3 = r3.toLocalTime()
            return r3
        L2e:
            java.lang.String r5 = r2.format
            if (r5 == 0) goto L93
            boolean r5 = r3.isNumber()
            if (r5 == 0) goto L39
            goto L93
        L39:
            boolean r5 = r2.yyyyMMddhhmmss19
            if (r5 != 0) goto L8a
            boolean r5 = r2.formatISO8601
            if (r5 == 0) goto L42
            goto L8a
        L42:
            java.lang.String r3 = r3.readString()
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L4d
            return r6
        L4d:
            boolean r5 = r2.formatMillis
            if (r5 != 0) goto L70
            boolean r5 = r2.formatUnixTime
            if (r5 == 0) goto L56
            goto L70
        L56:
            java.util.Locale r4 = r4.getLocale()
            java.time.format.DateTimeFormatter r4 = r2.getDateFormatter(r4)
            boolean r5 = r2.formatHasDay
            if (r5 == 0) goto L6b
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r3, r4)
            java.time.LocalTime r3 = r3.toLocalTime()
            return r3
        L6b:
            java.time.LocalTime r3 = java.time.LocalTime.parse(r3, r4)
            return r3
        L70:
            long r5 = java.lang.Long.parseLong(r3)
            boolean r3 = r2.formatUnixTime
            if (r3 == 0) goto L79
            long r5 = r5 * r0
        L79:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r5)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r3, r4)
            java.time.LocalTime r3 = r3.toLocalTime()
            return r3
        L8a:
            java.time.LocalDateTime r3 = r3.readLocalDateTime()
            java.time.LocalTime r3 = r3.toLocalTime()
            return r3
        L93:
            java.time.LocalTime r3 = r3.readLocalTime()
            return r3
    }
}
