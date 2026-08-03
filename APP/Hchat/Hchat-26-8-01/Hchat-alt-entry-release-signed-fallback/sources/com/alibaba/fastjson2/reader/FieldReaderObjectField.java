package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderObjectField<T> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    public FieldReaderObjectField(java.lang.String r15, java.lang.reflect.Type r16, java.lang.Class r17, int r18, long r19, java.lang.String r21, java.lang.Object r22, java.lang.reflect.Field r23) {
            r14 = this;
            if (r16 != 0) goto L8
            java.lang.Class r0 = r23.getType()
            r3 = r0
            goto La
        L8:
            r3 = r16
        La:
            r11 = 0
            r13 = 0
            r9 = 0
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r10 = r22
            r12 = r23
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, byte r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.Class r2 = r4.fieldClass
            java.lang.Class r3 = java.lang.Byte.TYPE
            if (r2 != r3) goto L14
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putByte(r5, r0, r6)
            return
        L14:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L1a
            r0.setByte(r5, r6)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, char r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.Class r2 = r4.fieldClass
            java.lang.Class r3 = java.lang.Character.TYPE
            if (r2 != r3) goto L14
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putChar(r5, r0, r6)
            return
        L14:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L1a
            r0.setChar(r5, r6)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r7, double r8) {
            r6 = this;
            long r2 = r6.fieldOffset
            r0 = -1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L16
            java.lang.Class r0 = r6.fieldClass
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L16
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r1 = r7
            r4 = r8
            r0.putDouble(r1, r2, r4)
            return
        L16:
            r1 = r7
            r4 = r8
            java.lang.reflect.Field r7 = r6.field     // Catch: java.lang.Exception -> L1e
            r7.setDouble(r1, r4)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "set "
            r8.<init>(r9)
            java.lang.String r9 = r6.fieldName
            java.lang.String r0 = " error"
            java.lang.String r8 = eh.a.r(r8, r9, r0)
            ah.a.x(r8, r7)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, float r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.Class r2 = r4.fieldClass
            java.lang.Class r3 = java.lang.Float.TYPE
            if (r2 != r3) goto L14
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putFloat(r5, r0, r6)
            return
        L14:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L1a
            r0.setFloat(r5, r6)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, int r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.Class r2 = r4.fieldClass
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 != r3) goto L14
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putInt(r5, r0, r6)
            return
        L14:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L1a
            r0.setInt(r5, r6)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r7, long r8) {
            r6 = this;
            long r2 = r6.fieldOffset
            r0 = -1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L16
            java.lang.Class r0 = r6.fieldClass
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L16
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r1 = r7
            r4 = r8
            r0.putLong(r1, r2, r4)
            return
        L16:
            r1 = r7
            r4 = r8
            java.lang.reflect.Field r7 = r6.field     // Catch: java.lang.Exception -> L1e
            r7.setLong(r1, r4)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "set "
            r8.<init>(r9)
            java.lang.String r9 = r6.fieldName
            java.lang.String r0 = " error"
            java.lang.String r8 = eh.a.r(r8, r9, r0)
            ah.a.x(r8, r7)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r7, java.lang.Object r8) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L10
            long r2 = r6.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r4 = r4.mask
            long r2 = r2 & r4
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L7f
            return
        L10:
            java.lang.Class r2 = r6.fieldClass
            boolean r3 = r2.isPrimitive()
            if (r3 == 0) goto L1c
            r6.acceptPrimitive(r7, r8)
            return
        L1c:
            java.lang.reflect.Type r3 = r6.fieldType
            if (r3 == r2) goto L40
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r4 = r3.isAssignableFrom(r2)
            if (r4 == 0) goto L40
            boolean r4 = r8 instanceof java.util.Map
            if (r4 == 0) goto L40
            if (r2 == r3) goto L40
            com.alibaba.fastjson2.JSONReader$Context r0 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.getObjectReader(r0)
            java.util.Map r8 = (java.util.Map) r8
            r1 = 0
            com.alibaba.fastjson2.JSONReader$Feature[] r1 = new com.alibaba.fastjson2.JSONReader.Feature[r1]
            java.lang.Object r8 = r0.createInstance(r8, r1)
            goto L7f
        L40:
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L7f
            boolean r3 = r2.isInstance(r8)
            if (r3 != 0) goto L7f
            boolean r3 = r8 instanceof java.lang.String
            if (r3 == 0) goto L73
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class<java.util.Date> r4 = java.util.Date.class
            if (r2 != r4) goto L73
            java.lang.String r8 = r6.format
            if (r8 == 0) goto L62
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.util.Date r8 = com.alibaba.fastjson2.util.DateUtils.parseDate(r3, r8, r0)
            goto L73
        L62:
            java.time.ZoneId r8 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r3 = com.alibaba.fastjson2.util.DateUtils.parseMillis(r3, r8)
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 != 0) goto L6e
            r8 = 0
            goto L73
        L6e:
            java.util.Date r8 = new java.util.Date
            r8.<init>(r3)
        L73:
            boolean r0 = r2.isInstance(r8)
            if (r0 != 0) goto L7f
            java.lang.reflect.Type r0 = r6.fieldType
            java.lang.Object r8 = com.alibaba.fastjson2.util.TypeUtils.cast(r8, r0)
        L7f:
            long r0 = r6.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L8d
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putObject(r7, r0, r8)
            return
        L8d:
            java.lang.reflect.Field r0 = r6.field     // Catch: java.lang.Exception -> L93
            r0.set(r7, r8)     // Catch: java.lang.Exception -> L93
            return
        L93:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r8.<init>(r0)
            java.lang.String r0 = r6.fieldName
            java.lang.String r1 = " error"
            java.lang.String r8 = eh.a.r(r8, r0, r1)
            ah.a.x(r8, r7)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, short r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.Class r2 = r4.fieldClass
            java.lang.Class r3 = java.lang.Short.TYPE
            if (r2 != r3) goto L14
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putShort(r5, r0, r6)
            return
        L14:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L1a
            r0.setShort(r5, r6)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, boolean r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L14
            java.lang.Class r2 = r4.fieldClass
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 != r3) goto L14
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putBoolean(r5, r0, r6)
            return
        L14:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L1a
            r0.setBoolean(r5, r6)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    public final void acceptPrimitive(T r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r0 = r2.fieldClass
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L14
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L92
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r2.accept(r3, r4)
            return
        L14:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L26
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L92
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            r2.accept(r3, r0)
            return
        L26:
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L38
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L92
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r2.accept(r3, r4)
            return
        L38:
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L4a
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L92
            java.lang.Number r4 = (java.lang.Number) r4
            double r0 = r4.doubleValue()
            r2.accept(r3, r0)
            return
        L4a:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L5c
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L92
            java.lang.Number r4 = (java.lang.Number) r4
            short r4 = r4.shortValue()
            r2.accept(r3, r4)
            return
        L5c:
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L6e
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L92
            java.lang.Number r4 = (java.lang.Number) r4
            byte r4 = r4.byteValue()
            r2.accept(r3, r4)
            return
        L6e:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L80
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 == 0) goto L92
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            r2.accept(r3, r4)
            return
        L80:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L92
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L92
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.accept(r3, r4)
            return
        L92:
            java.lang.String r3 = r2.fieldName
            java.lang.String r0 = " error, type not support "
            java.lang.Class r4 = r4.getClass()
            java.lang.String r1 = "set "
            ah.a.m(r1, r3, r0, r4)
            return
    }
}
