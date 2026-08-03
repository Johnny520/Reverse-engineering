package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderZonedDateTime<T> extends com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec<T> {
    final java.util.function.BiConsumer<T, java.time.ZonedDateTime> function;

    public FieldReaderZonedDateTime(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.Object r22, java.lang.reflect.Field r23, java.lang.reflect.Method r24, java.util.function.BiConsumer<T, java.time.ZonedDateTime> r25) {
            r13 = this;
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime r12 = com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime.of(r20, r21)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r11 = r23
            r10 = r24
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r14 = r25
            r13.function = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, long r2) {
            r0 = this;
            java.time.Instant r2 = java.time.Instant.ofEpochMilli(r2)
            java.time.ZoneId r3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = java.time.ZonedDateTime.ofInstant(r2, r3)
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
    public void accept(T r2, java.time.Instant r3) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r3, r0)
            r1.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r2, java.time.LocalDateTime r3) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r3, r0)
            r1.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r8, java.time.ZonedDateTime r9) {
            r7 = this;
            if (r9 != 0) goto L10
            long r0 = r7.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            return
        L10:
            java.lang.String r0 = "set "
            if (r8 == 0) goto L5e
            java.util.function.BiConsumer<T, java.time.ZonedDateTime> r1 = r7.function
            if (r1 == 0) goto L1c
            r1.accept(r8, r9)
            return
        L1c:
            java.lang.reflect.Method r1 = r7.method
            java.lang.String r2 = " error"
            if (r1 == 0) goto L3a
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L2a
            r1.invoke(r8, r9)     // Catch: java.lang.Exception -> L2a
            return
        L2a:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r0 = r7.fieldName
            java.lang.String r9 = eh.a.r(r9, r0, r2)
            ah.a.x(r9, r8)
            return
        L3a:
            long r3 = r7.fieldOffset
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L48
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r0.putObject(r8, r3, r9)
            return
        L48:
            java.lang.reflect.Field r1 = r7.field     // Catch: java.lang.Exception -> L4e
            r1.set(r8, r9)     // Catch: java.lang.Exception -> L4e
            return
        L4e:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r0 = r7.fieldName
            java.lang.String r9 = eh.a.r(r9, r0, r2)
            ah.a.x(r9, r8)
            return
        L5e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r9 = r7.fieldName
            java.lang.String r0 = " error, object is null"
            java.lang.String r8 = eh.a.r(r8, r9, r0)
            ah.a.w(r8)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r2, java.util.Date r3) {
            r1 = this;
            java.time.Instant r3 = r3.toInstant()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r3, r0)
            r1.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(T r2) {
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
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofInstant(r1, r2)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.Instant r2) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = java.time.ZonedDateTime.ofInstant(r2, r0)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.LocalDateTime r2) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = r2.atZone(r0)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.ZonedDateTime r1) {
            r0 = this;
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.util.Date r2) {
            r1 = this;
            java.time.Instant r2 = r2.toInstant()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = java.time.ZonedDateTime.ofInstant(r2, r0)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final void readFieldValue(com.alibaba.fastjson2.JSONReader r7, T r8) {
            r6 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.dateReader
            java.lang.reflect.Type r2 = r6.fieldType
            java.lang.String r3 = r6.fieldName
            long r4 = r6.features
            r1 = r7
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            java.time.ZonedDateTime r7 = (java.time.ZonedDateTime) r7
            r6.accept(r8, r7)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            java.time.ZonedDateTime r1 = r1.readZonedDateTime()
            r0.accept(r2, r1)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ boolean supportAcceptType(java.lang.Class r1) {
            r0 = this;
            boolean r1 = super.supportAcceptType(r1)
            return r1
    }
}
