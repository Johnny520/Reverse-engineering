package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldReaderDateTimeCodec<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final com.alibaba.fastjson2.reader.ObjectReader dateReader;
    final boolean formatMillis;
    final boolean formatUnixTime;

    public FieldReaderDateTimeCodec(java.lang.String r2, java.lang.reflect.Type r3, java.lang.Class r4, int r5, long r6, java.lang.String r8, java.util.Locale r9, java.lang.Object r10, java.lang.reflect.Method r11, java.lang.reflect.Field r12, com.alibaba.fastjson2.reader.ObjectReader r13) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            r2 = r1
            r2.dateReader = r13
            r3 = 0
            if (r8 == 0) goto L1f
            java.lang.String r4 = "millis"
            boolean r4 = r8.equals(r4)
            r5 = 1
            if (r4 != 0) goto L20
            java.lang.String r4 = "unixtime"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            r0 = r5
            r5 = r3
            r3 = r0
            goto L20
        L1f:
            r5 = r3
        L20:
            r2.formatUnixTime = r3
            r2.formatMillis = r5
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r4.acceptNull(r5)
            return
        L6:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L49
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L45
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1b
            goto L45
        L1b:
            java.lang.String r0 = r4.format
            if (r0 == 0) goto L27
            boolean r0 = r4.formatUnixTime
            if (r0 != 0) goto L27
            boolean r0 = r4.formatMillis
            if (r0 == 0) goto L3c
        L27:
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r6)
            if (r0 == 0) goto L3c
            long r0 = java.lang.Long.parseLong(r6)
            boolean r6 = r4.formatUnixTime
            if (r6 == 0) goto L38
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L38:
            r4.accept(r5, r0)
            return
        L3c:
            java.lang.String r0 = r4.format
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.util.Date r6 = com.alibaba.fastjson2.util.DateUtils.parseDate(r6, r0, r1)
            goto L49
        L45:
            r4.acceptNull(r5)
            return
        L49:
            boolean r0 = r6 instanceof java.util.Date
            if (r0 == 0) goto L53
            java.util.Date r6 = (java.util.Date) r6
            r4.accept(r5, r6)
            return
        L53:
            boolean r0 = r6 instanceof java.time.Instant
            if (r0 == 0) goto L5d
            java.time.Instant r6 = (java.time.Instant) r6
            r4.accept(r5, r6)
            return
        L5d:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L6b
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.accept(r5, r0)
            return
        L6b:
            boolean r0 = r6 instanceof java.time.LocalDateTime
            if (r0 == 0) goto L75
            java.time.LocalDateTime r6 = (java.time.LocalDateTime) r6
            r4.accept(r5, r6)
            return
        L75:
            boolean r0 = r6 instanceof java.time.ZonedDateTime
            if (r0 == 0) goto L7f
            java.time.ZonedDateTime r6 = (java.time.ZonedDateTime) r6
            r4.accept(r5, r6)
            return
        L7f:
            java.lang.String r5 = "not support value "
            java.lang.Class r6 = r6.getClass()
            ah.a.i(r6, r5)
            return
    }

    public abstract void accept(T r1, java.time.Instant r2);

    public abstract void accept(T r1, java.time.LocalDateTime r2);

    public abstract void accept(T r1, java.time.ZonedDateTime r2);

    public abstract void accept(T r1, java.util.Date r2);

    public abstract void acceptNull(T r1);

    public abstract java.lang.Object apply(long r1);

    public abstract java.lang.Object apply(java.time.Instant r1);

    public abstract java.lang.Object apply(java.time.LocalDateTime r1);

    public abstract java.lang.Object apply(java.time.ZonedDateTime r1);

    public abstract java.lang.Object apply(java.util.Date r1);

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader.Context r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.dateReader
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.dateReader
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r7) {
            r6 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.dateReader
            java.lang.reflect.Type r2 = r6.fieldType
            java.lang.String r3 = r6.fieldName
            long r4 = r6.features
            r1 = r7
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(java.lang.Class r2) {
            r1 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r2 == r0) goto Lb
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }
}
