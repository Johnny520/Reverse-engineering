package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplObject extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final com.alibaba.fastjson2.reader.ObjectReaderImplObject INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplObject r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplObject
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplObject.INSTANCE = r0
            return
    }

    public ObjectReaderImplObject() {
            r1 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(long r1) {
            r0 = this;
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            r1.<init>()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r1, long r2) {
            r0 = this;
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Map r9, long r10) {
            r8 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.String r1 = r8.getTypeKey()
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L48
            java.lang.String r1 = (java.lang.String) r1
            long r2 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r4 = r4.mask
            long r4 = r4 & r10
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L24
            com.alibaba.fastjson2.reader.ObjectReader r2 = r8.autoType(r0, r2)
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 != 0) goto L42
            java.lang.Class r2 = r8.getObjectClass()
            long r3 = r8.getFeatures()
            long r3 = r3 | r10
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r1, r2, r3)
            if (r2 == 0) goto L37
            goto L42
        L37:
            java.lang.String r9 = "No suitable ObjectReader found for"
            java.lang.String r9 = r9.concat(r1)
            ah.a.w(r9)
            r9 = 0
            return r9
        L42:
            if (r2 == r8) goto L48
            java.lang.Object r9 = r2.createInstance(r9, r10)
        L48:
            return r9
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = super.getObjectClass()
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r13, java.lang.reflect.Type r14, java.lang.Object r15, long r16) {
            r12 = this;
            byte r0 = r13.getType()
            r1 = 73
            if (r0 < r1) goto L11
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 > r1) goto L11
            java.lang.String r13 = r13.readString()
            return r13
        L11:
            r1 = -110(0xffffffffffffff92, float:NaN)
            if (r0 != r1) goto L2d
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r2 = r13
            r6 = r16
            com.alibaba.fastjson2.reader.ObjectReader r1 = r2.checkAutoType(r3, r4, r6)
            if (r1 == 0) goto L2d
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r6 = r1
            java.lang.Object r13 = r6.readJSONBObject(r7, r8, r9, r10)
            return r13
        L2d:
            r14 = -81
            if (r0 != r14) goto L36
            r13.next()
            r13 = 0
            return r13
        L36:
            java.lang.Object r13 = r13.readAny()
            return r13
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r24, java.lang.reflect.Type r25, java.lang.Object r26, long r27) {
            r23 = this;
            r1 = r24
            boolean r0 = r1.jsonb
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.readAny()
            return r0
        Lb:
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r2 = r0.features
            long r2 = r27 | r2
            boolean r4 = r1.isObject()
            r13 = 34
            r14 = 47
            r15 = 91
            r5 = 0
            if (r4 == 0) goto L230
            r1.nextIfObjectStart()
            boolean r4 = r1.isString()
            r16 = 0
            if (r4 == 0) goto Lc4
            long r18 = r1.readFieldNameHashCode()
            r20 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 != 0) goto Lc0
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            boolean r4 = r0.isEnabled(r4)
            if (r4 == 0) goto L7f
            long r6 = r1.readTypeHashCode()
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReaderAutoType(r6)
            if (r6 == 0) goto L73
            java.lang.Class r7 = r6.getObjectClass()
            if (r7 == 0) goto L73
            java.lang.ClassLoader r4 = r7.getClassLoader()
            java.lang.Thread r22 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r8 = r22.getContextClassLoader()
            if (r4 == r8) goto L73
            java.lang.String r4 = r1.getString()
            java.lang.Class r8 = r8.loadClass(r4)     // Catch: java.lang.ClassNotFoundException -> L65
            goto L66
        L65:
            r8 = r5
        L66:
            if (r8 == 0) goto L74
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L74
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r8)
            goto L74
        L73:
            r4 = r5
        L74:
            if (r6 != 0) goto Laa
            java.lang.String r4 = r1.getString()
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReaderAutoType(r4, r5)
            goto Laa
        L7f:
            java.lang.String r4 = r1.readString()
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReaderAutoType(r4, r5)
            if (r6 != 0) goto Laa
            com.alibaba.fastjson2.JSONReader$Context r7 = r1.context
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNotSupportAutoType
            boolean r7 = r7.isEnabled(r8)
            if (r7 != 0) goto L94
            goto Laa
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "autoType not support : "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            return r5
        Laa:
            if (r6 == 0) goto Lbc
            r0 = 1
            r1.setTypeRedirect(r0)
            r2 = r25
            r3 = r26
            r4 = r27
            r0 = r6
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            return r0
        Lbc:
            r6 = r27
            r8 = r4
            goto Lc9
        Lc0:
            r6 = r27
            r8 = r5
            goto Lc9
        Lc4:
            r6 = r27
            r8 = r5
            r18 = r16
        Lc9:
            com.alibaba.fastjson2.JSONReader$Context r4 = r1.context
            java.util.function.Supplier r4 = r4.getObjectSupplier()
            if (r4 == 0) goto Ld8
            java.lang.Object r0 = r4.get()
            java.util.Map r0 = (java.util.Map) r0
            goto Lf6
        Ld8:
            long r9 = r0.features
            long r9 = r9 | r6
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r11 = r0.mask
            long r9 = r9 & r11
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto Lea
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto Lf6
        Lea:
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE_OBJECT
            long r6 = r1.features(r6)
            java.lang.Object r0 = r0.createInstance(r6)
            java.util.Map r0 = (java.util.Map) r0
        Lf6:
            if (r8 == 0) goto L10f
            java.lang.String r4 = "java.util.ImmutableCollections$Map1"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L10d
            java.lang.String r4 = "java.util.ImmutableCollections$MapN"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L10d
            java.lang.String r4 = "@type"
            r0.put(r4, r8)
        L10d:
            r18 = r16
        L10f:
            r4 = 0
            r6 = r4
        L111:
            boolean r4 = r1.nextIfObjectEnd()
            if (r4 == 0) goto L11b
            r1.nextIfComma()
            return r0
        L11b:
            char r4 = r1.current()
            if (r4 != r14) goto L124
            r1.skipComment()
        L124:
            r4 = 58
            if (r6 != 0) goto L133
            if (r8 != 0) goto L133
            int r7 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r7 == 0) goto L133
            java.lang.String r7 = r1.getFieldName()
            goto L145
        L133:
            boolean r7 = r1.isNumber()
            if (r7 == 0) goto L141
            java.lang.Number r7 = r1.readNumber()
            r1.nextIfMatch(r4)
            goto L145
        L141:
            java.lang.String r7 = r1.readFieldName()
        L145:
            r9 = 123(0x7b, float:1.72E-43)
            if (r7 != 0) goto L175
            char r7 = r1.current()
            if (r7 == r9) goto L160
            if (r7 != r15) goto L152
            goto L160
        L152:
            java.lang.String r7 = r1.readFieldNameUnquote()
            char r10 = r1.current()
            if (r10 != r4) goto L175
            r1.next()
            goto L175
        L160:
            java.lang.Object r7 = r1.readAny()
            boolean r4 = r1.nextIfMatch(r4)
            if (r4 == 0) goto L16b
            goto L175
        L16b:
            java.lang.String r0 = "illegal input"
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            return r5
        L175:
            char r10 = r1.current()
            if (r10 == r13) goto L1f8
            r4 = 39
            if (r10 == r4) goto L1f8
            r4 = 43
            if (r10 == r4) goto L1f3
            r4 = 83
            if (r10 == r4) goto L1de
            if (r10 == r15) goto L1d9
            r4 = 102(0x66, float:1.43E-43)
            if (r10 == r4) goto L1d0
            r4 = 110(0x6e, float:1.54E-43)
            if (r10 == r4) goto L1cb
            r4 = 116(0x74, float:1.63E-43)
            if (r10 == r4) goto L1d0
            if (r10 == r9) goto L1aa
            r4 = 45
            if (r10 == r4) goto L1f3
            r9 = 46
            if (r10 == r9) goto L1f3
            switch(r10) {
                case 48: goto L1f3;
                case 49: goto L1f3;
                case 50: goto L1f3;
                case 51: goto L1f3;
                case 52: goto L1f3;
                case 53: goto L1f3;
                case 54: goto L1f3;
                case 55: goto L1f3;
                case 56: goto L1f3;
                case 57: goto L1f3;
                default: goto L1a2;
            }
        L1a2:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            return r5
        L1aa:
            boolean r9 = r1.isReference()
            if (r9 == 0) goto L1c6
            java.lang.String r9 = r1.readReference()
            java.lang.String r10 = ".."
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L1be
            r9 = r0
            goto L1fc
        L1be:
            com.alibaba.fastjson2.JSONPath r9 = com.alibaba.fastjson2.JSONPath.of(r9)
            r1.addResolveTask(r0, r7, r9)
            goto L22c
        L1c6:
            java.util.Map r9 = r1.readObject()
            goto L1fc
        L1cb:
            java.util.Date r9 = r1.readNullOrNewDate()
            goto L1fc
        L1d0:
            boolean r9 = r1.readBoolValue()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            goto L1fc
        L1d9:
            java.util.List r9 = r1.readArray()
            goto L1fc
        L1de:
            boolean r9 = r1.nextIfSet()
            if (r9 == 0) goto L1eb
            java.lang.Class<java.util.HashSet> r9 = java.util.HashSet.class
            java.lang.Object r9 = r1.read(r9)
            goto L1fc
        L1eb:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            return r5
        L1f3:
            java.lang.Number r9 = r1.readNumber()
            goto L1fc
        L1f8:
            java.lang.String r9 = r1.readString()
        L1fc:
            if (r9 != 0) goto L208
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r10 = r10.mask
            long r10 = r10 & r2
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto L208
            goto L22c
        L208:
            java.lang.Object r10 = r0.put(r7, r9)
            if (r10 == 0) goto L22c
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r11 = r11.mask
            long r11 = r11 & r2
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L22c
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L225
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            r11.add(r9)
            r0.put(r7, r10)
            goto L22c
        L225:
            com.alibaba.fastjson2.JSONArray r9 = com.alibaba.fastjson2.JSONArray.of(r10, r9)
            r0.put(r7, r9)
        L22c:
            int r6 = r6 + 1
            goto L111
        L230:
            char r0 = r1.current()
            if (r0 != r14) goto L23d
            r1.skipComment()
            char r0 = r1.current()
        L23d:
            if (r0 == r13) goto L2a4
            r2 = 39
            if (r0 == r2) goto L2a4
            r2 = 43
            if (r0 == r2) goto L29f
            r2 = 83
            if (r0 == r2) goto L288
            if (r0 == r15) goto L283
            r2 = 102(0x66, float:1.43E-43)
            if (r0 == r2) goto L27a
            r2 = 110(0x6e, float:1.54E-43)
            if (r0 == r2) goto L275
            r2 = 116(0x74, float:1.63E-43)
            if (r0 == r2) goto L27a
            r2 = 120(0x78, float:1.68E-43)
            if (r0 == r2) goto L270
            r4 = 45
            if (r0 == r4) goto L29f
            r9 = 46
            if (r0 == r9) goto L29f
            switch(r0) {
                case 48: goto L29f;
                case 49: goto L29f;
                case 50: goto L29f;
                case 51: goto L29f;
                case 52: goto L29f;
                case 53: goto L29f;
                case 54: goto L29f;
                case 55: goto L29f;
                case 56: goto L29f;
                case 57: goto L29f;
                default: goto L268;
            }
        L268:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            return r5
        L270:
            byte[] r0 = r1.readBinary()
            return r0
        L275:
            java.util.Date r0 = r1.readNullOrNewDate()
            return r0
        L27a:
            boolean r0 = r1.readBoolValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L283:
            java.util.List r0 = r1.readArray()
            return r0
        L288:
            boolean r0 = r1.nextIfSet()
            if (r0 == 0) goto L297
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.read(r0)
            return r0
        L297:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            return r5
        L29f:
            java.lang.Number r0 = r1.readNumber()
            return r0
        L2a4:
            java.lang.String r0 = r1.readString()
            return r0
    }
}
