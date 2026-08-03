package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDate<T> extends com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec<T> {
    final java.util.function.BiConsumer<T, java.util.Date> function;

    public FieldReaderDate(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.Object r22, java.lang.reflect.Field r23, java.lang.reflect.Method r24, java.util.function.BiConsumer<T, java.util.Date> r25) {
            r13 = this;
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r12 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.of(r20, r21)
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
    public void accept(T r2, long r3) {
            r1 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            r1.accept(r2, r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r1, java.time.Instant r2) {
            r0 = this;
            java.util.Date r2 = java.util.Date.from(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r2, java.time.LocalDateTime r3) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r3)
            java.time.Instant r3 = r3.toInstant(r0)
            java.util.Date r3 = java.util.Date.from(r3)
            r1.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r3, java.time.ZonedDateTime r4) {
            r2 = this;
            java.time.Instant r4 = r4.toInstant()
            long r0 = r4.toEpochMilli()
            java.util.Date r4 = new java.util.Date
            r4.<init>(r0)
            r2.accept(r3, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T r8, java.util.Date r9) {
            r7 = this;
            java.util.function.BiConsumer<T, java.util.Date> r0 = r7.function
            if (r0 == 0) goto L8
            r0.accept(r8, r9)
            return
        L8:
            java.lang.String r0 = "set "
            if (r8 == 0) goto L4e
            java.lang.reflect.Method r1 = r7.method
            java.lang.String r2 = " error"
            if (r1 == 0) goto L2a
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L1a
            r1.invoke(r8, r9)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r0 = r7.fieldName
            java.lang.String r9 = eh.a.r(r9, r0, r2)
            ah.a.x(r9, r8)
            return
        L2a:
            long r3 = r7.fieldOffset
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L38
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r0.putObject(r8, r3, r9)
            return
        L38:
            java.lang.reflect.Field r1 = r7.field     // Catch: java.lang.Exception -> L3e
            r1.set(r8, r9)     // Catch: java.lang.Exception -> L3e
            return
        L3e:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r0 = r7.fieldName
            java.lang.String r9 = eh.a.r(r9, r0, r2)
            ah.a.x(r9, r8)
            return
        L4e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r9 = r7.fieldName
            java.lang.String r0 = " error, object is null"
            java.lang.String r8 = eh.a.r(r8, r9, r0)
            ah.a.w(r8)
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
    public java.lang.Object apply(long r2) {
            r1 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.Instant r1) {
            r0 = this;
            java.util.Date r1 = java.util.Date.from(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.LocalDateTime r2) {
            r1 = this;
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r2)
            java.time.Instant r2 = r2.toInstant(r0)
            java.util.Date r2 = java.util.Date.from(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.time.ZonedDateTime r1) {
            r0 = this;
            java.time.Instant r1 = r1.toInstant()
            java.util.Date r1 = java.util.Date.from(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public java.lang.Object apply(java.util.Date r1) {
            r0 = this;
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r7, T r8) {
            r6 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.dateReader     // Catch: java.lang.Exception -> L10
            java.lang.reflect.Type r2 = r6.fieldType     // Catch: java.lang.Exception -> L10
            java.lang.String r3 = r6.fieldName     // Catch: java.lang.Exception -> L10
            long r4 = r6.features     // Catch: java.lang.Exception -> L10
            r1 = r7
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L10
            java.util.Date r7 = (java.util.Date) r7     // Catch: java.lang.Exception -> L10
            goto L20
        L10:
            r0 = move-exception
            r7 = r0
            long r0 = r6.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.NullOnError
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L24
            r7 = 0
        L20:
            r6.accept(r8, r7)
            return
        L24:
            throw r7
    }
}
