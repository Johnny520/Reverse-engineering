package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldReaderLocalDateTime<T> extends com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec<T> {
    final java.util.function.BiConsumer<T, java.time.ZonedDateTime> function;

    public FieldReaderLocalDateTime(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.Object r22, java.lang.reflect.Field r23, java.lang.reflect.Method r24, java.util.function.BiConsumer<T, java.time.ZonedDateTime> r25) {
            r13 = this;
            r7 = r20
            if (r7 == 0) goto L1c
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime
            r8 = r21
            r0.<init>(r7, r8)
        Lb:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r9 = r22
            r11 = r23
            r10 = r24
            r12 = r0
            r0 = r13
            goto L21
        L1c:
            r8 = r21
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime r0 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime.INSTANCE
            goto Lb
        L21:
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r14 = r25
            r13.function = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(java.lang.Object r1, long r2) {
            r0 = this;
            java.time.Instant r2 = java.time.Instant.ofEpochMilli(r2)
            java.time.ZoneId r3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = r2.atZone(r3)
            java.time.LocalDateTime r2 = r2.toLocalDateTime()
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(java.lang.Object r2, java.time.Instant r3) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r3 = r3.atZone(r0)
            java.time.LocalDateTime r3 = r3.toLocalDateTime()
            r1.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(java.lang.Object r6, java.time.LocalDateTime r7) {
            r5 = this;
            java.lang.String r0 = "set "
            if (r6 == 0) goto L3a
            if (r7 != 0) goto L14
            long r1 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L14
            return
        L14:
            long r1 = r5.fieldOffset
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r0.putObject(r6, r1, r7)
            return
        L22:
            java.lang.reflect.Field r1 = r5.field     // Catch: java.lang.Exception -> L28
            r1.set(r6, r7)     // Catch: java.lang.Exception -> L28
            return
        L28:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r5.fieldName
            java.lang.String r1 = " error"
            java.lang.String r7 = eh.a.r(r7, r0, r1)
            ah.a.x(r7, r6)
            return
        L3a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r7 = r5.fieldName
            java.lang.String r0 = " error, object is null"
            java.lang.String r6 = eh.a.r(r6, r7, r0)
            ah.a.w(r6)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(java.lang.Object r1, java.time.ZonedDateTime r2) {
            r0 = this;
            java.time.LocalDateTime r2 = r2.toLocalDateTime()
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(java.lang.Object r2, java.util.Date r3) {
            r1 = this;
            java.time.Instant r3 = r3.toInstant()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r3 = r3.atZone(r0)
            java.time.LocalDateTime r3 = r3.toLocalDateTime()
            r1.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            r1.accept(r2, r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(long r1) {
            r0 = this;
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r1 = r1.atZone(r2)
            java.time.LocalDateTime r1 = r1.toLocalDateTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.Instant r2) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = r2.atZone(r0)
            java.time.LocalDateTime r2 = r2.toLocalDateTime()
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.LocalDateTime r1) {
            r0 = this;
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.ZonedDateTime r1) {
            r0 = this;
            java.time.LocalDateTime r1 = r1.toLocalDateTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.util.Date r2) {
            r1 = this;
            java.time.Instant r2 = r2.toInstant()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = r2.atZone(r0)
            java.time.LocalDateTime r2 = r2.toLocalDateTime()
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, java.lang.Object r9) {
            r7 = this;
            boolean r0 = r8.jsonb
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.dateReader
            if (r0 == 0) goto L14
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            r2 = r8
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            java.time.LocalDateTime r8 = (java.time.LocalDateTime) r8
            goto L21
        L14:
            r2 = r8
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
            java.time.LocalDateTime r8 = (java.time.LocalDateTime) r8
        L21:
            r7.accept(r9, r8)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(java.lang.Class r2) {
            r1 = this;
            java.lang.Class r2 = r1.fieldClass
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            if (r2 == r0) goto Ld
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }
}
