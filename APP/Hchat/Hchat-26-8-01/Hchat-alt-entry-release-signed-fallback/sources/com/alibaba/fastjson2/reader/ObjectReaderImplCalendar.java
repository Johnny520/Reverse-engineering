package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCalendar extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplCalendar INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplCalendar r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplCalendar
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplCalendar.INSTANCE = r0
            return
    }

    public ObjectReaderImplCalendar(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplCalendar of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplCalendar r1 = com.alibaba.fastjson2.reader.ObjectReaderImplCalendar.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplCalendar r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplCalendar
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.isInt()
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L19
            long r1 = r1.readInt64Value()
            boolean r5 = r0.formatUnixTime
            if (r5 == 0) goto L11
            long r1 = r1 * r3
        L11:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r3.setTimeInMillis(r1)
            return r3
        L19:
            boolean r2 = r1.readIfNull()
            if (r2 == 0) goto L21
            r1 = 0
            return r1
        L21:
            long r1 = r1.readMillisFromString()
            boolean r5 = r0.formatUnixTime
            if (r5 == 0) goto L2a
            long r1 = r1 * r3
        L2a:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r3.setTimeInMillis(r1)
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r5, java.lang.reflect.Type r6, java.lang.Object r7, long r8) {
            r4 = this;
            boolean r6 = r5.isString()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            if (r6 == 0) goto L5c
            java.lang.String r6 = r4.format
            if (r6 == 0) goto L3e
            java.time.format.DateTimeFormatter r6 = r4.getDateFormatter()
            if (r6 == 0) goto L3e
            java.lang.String r7 = r5.readString()
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L1e
            return r9
        L1e:
            java.time.LocalDateTime r6 = java.time.LocalDateTime.parse(r7, r6)
            com.alibaba.fastjson2.JSONReader$Context r5 = r5.getContext()
            java.time.ZoneId r5 = r5.getZoneId()
            java.time.ZonedDateTime r5 = java.time.ZonedDateTime.of(r6, r5)
            java.time.Instant r5 = r5.toInstant()
            long r5 = r5.toEpochMilli()
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            r7.setTimeInMillis(r5)
            return r7
        L3e:
            long r0 = r5.readMillisFromString()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L4f
            boolean r5 = r5.wasNull()
            if (r5 == 0) goto L4f
            return r9
        L4f:
            boolean r5 = r4.formatUnixTime
            if (r5 == 0) goto L54
            long r0 = r0 * r7
        L54:
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            r5.setTimeInMillis(r0)
            return r5
        L5c:
            boolean r6 = r5.readIfNull()
            if (r6 == 0) goto L63
            return r9
        L63:
            long r0 = r5.readInt64Value()
            boolean r6 = r4.formatUnixTime
            if (r6 != 0) goto L75
            com.alibaba.fastjson2.JSONReader$Context r5 = r5.getContext()
            boolean r5 = r5.isFormatUnixTime()
            if (r5 == 0) goto L76
        L75:
            long r0 = r0 * r7
        L76:
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            r5.setTimeInMillis(r0)
            return r5
    }
}
