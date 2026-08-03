package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalDate extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate.INSTANCE = r0
            return
    }

    public ObjectReaderImplLocalDate(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate r1 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.time.LocalDate> r0 = java.time.LocalDate.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.time.LocalDate r1 = r1.readLocalDate()
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
            boolean r6 = r3.readIfNull()
            r7 = 0
            if (r6 == 0) goto L17
            return r7
        L17:
            java.lang.String r6 = r4.format
            if (r6 == 0) goto L89
            boolean r6 = r4.yyyyMMddhhmmss19
            if (r6 != 0) goto L89
            boolean r6 = r4.formatISO8601
            if (r6 != 0) goto L89
            boolean r6 = r3.isNumber()
            if (r6 == 0) goto L2a
            goto L89
        L2a:
            java.lang.String r3 = r3.readString()
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L88
            java.lang.String r6 = "null"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L3d
            goto L88
        L3d:
            boolean r6 = r4.formatMillis
            if (r6 != 0) goto L6c
            boolean r6 = r4.formatUnixTime
            if (r6 == 0) goto L46
            goto L6c
        L46:
            java.util.Locale r5 = r5.getLocale()
            java.time.format.DateTimeFormatter r5 = r2.getDateFormatter(r5)
            boolean r6 = r4.formatHasHour
            if (r6 != 0) goto L57
            java.time.LocalDate r3 = java.time.LocalDate.parse(r3, r5)
            return r3
        L57:
            boolean r6 = r4.formatHasDay
            if (r6 != 0) goto L63
            r3 = 1970(0x7b2, float:2.76E-42)
            r5 = 1
            java.time.LocalDate r3 = java.time.LocalDate.of(r3, r5, r5)
            return r3
        L63:
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r3, r5)
            java.time.LocalDate r3 = r3.toLocalDate()
            return r3
        L6c:
            long r6 = java.lang.Long.parseLong(r3)
            boolean r3 = r4.formatUnixTime
            if (r3 == 0) goto L77
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
        L77:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r6)
            java.time.ZoneId r5 = r5.getZoneId()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r3, r5)
            java.time.LocalDate r3 = r3.toLocalDate()
            return r3
        L88:
            return r7
        L89:
            java.time.LocalDate r3 = r3.readLocalDate()
            return r3
    }
}
