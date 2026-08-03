package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplList extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final java.lang.Class CLASS_SUBLIST = null;
    static final com.alibaba.fastjson2.writer.ObjectWriterImplList INSTANCE = null;
    static final com.alibaba.fastjson2.writer.ObjectWriterImplList INSTANCE_JSON_ARRAY = null;
    static final com.alibaba.fastjson2.writer.ObjectWriterImplList INSTANCE_JSON_ARRAY_1x = null;
    static final java.lang.String TYPE_NAME_ARRAY_LIST = null;
    static final long TYPE_NAME_HASH_ARRAY_LIST = 0;
    static final byte[] TYPE_NAME_JSONB_ARRAY_LIST = null;
    final java.lang.Class defineClass;
    final java.lang.reflect.Type defineType;
    final long features;
    final java.lang.Class itemClass;
    final boolean itemClassRefDetect;
    volatile com.alibaba.fastjson2.writer.ObjectWriter itemClassWriter;
    final java.lang.reflect.Type itemType;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplList r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplList
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE = r0
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplList
            r5 = 0
            r6 = 0
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r2 = com.alibaba.fastjson2.JSONArray.class
            r1.<init>(r2, r3, r4, r5, r6)
            com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY = r1
            java.lang.Class r3 = com.alibaba.fastjson2.JSONFactory.getClassJSONArray1x()
            if (r3 != 0) goto L23
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY_1x = r0
            goto L2f
        L23:
            com.alibaba.fastjson2.writer.ObjectWriterImplList r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplList
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY_1x = r2
        L2f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.List r0 = r0.subList(r1, r1)
            java.lang.Class r0 = r0.getClass()
            com.alibaba.fastjson2.writer.ObjectWriterImplList.CLASS_SUBLIST = r0
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplList.TYPE_NAME_ARRAY_LIST = r0
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplList.TYPE_NAME_JSONB_ARRAY_LIST = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplList.TYPE_NAME_HASH_ARRAY_LIST = r0
            return
    }

    public ObjectWriterImplList(java.lang.Class r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            r0.defineType = r2
            r0.itemClass = r3
            r0.itemType = r4
            r0.features = r5
            if (r3 == 0) goto L17
            boolean r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r3)
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r0.itemClassRefDetect = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r23, java.lang.Object r24, java.lang.Object r25, java.lang.reflect.Type r26, long r27) {
            r22 = this;
            r0 = r22
            r2 = r23
            if (r24 != 0) goto La
            r2.writeArrayNull()
            return
        La:
            java.util.List r8 = com.alibaba.fastjson2.util.TypeUtils.toList(r24)
            boolean r1 = r2.jsonb
            r9 = 0
            r10 = 0
            if (r1 == 0) goto L47
            int r1 = r8.size()
            r2.startArray(r1)
            r1 = r9
        L1c:
            int r3 = r8.size()
            if (r10 >= r3) goto L46
            java.lang.Object r3 = r8.get(r10)
            if (r3 != 0) goto L2c
            r2.writeNull()
            goto L43
        L2c:
            java.lang.Class r4 = r3.getClass()
            if (r4 != r9) goto L33
            goto L38
        L33:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r4)
            r9 = r4
        L38:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.reflect.Type r5 = r0.itemType
            r6 = r27
            r1.writeJSONB(r2, r3, r4, r5, r6)
        L43:
            int r10 = r10 + 1
            goto L1c
        L46:
            return
        L47:
            com.alibaba.fastjson2.JSONWriter$Context r11 = r2.context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r12 = r11.provider
            int r13 = r8.size()
            if (r13 != 0) goto L59
            r1 = 91
            r3 = 93
            r2.writeRaw(r1, r3)
            return
        L59:
            r2.startArray()
            r1 = r9
            r16 = r1
            r15 = r10
            r17 = 1
        L62:
            if (r15 >= r13) goto L1b3
            if (r15 == 0) goto L69
            r2.writeComma()
        L69:
            java.lang.Object r3 = r8.get(r15)
            if (r3 != 0) goto L75
            r2.writeNull()
        L72:
            r14 = r1
            goto L11f
        L75:
            java.lang.Class r4 = r3.getClass()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L83
            java.lang.String r3 = (java.lang.String) r3
            r2.writeString(r3)
            goto L72
        L83:
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            r18 = 0
            if (r4 != r5) goto Lad
            r24 = 2
            long r6 = r12.userDefineMask
            long r5 = r6 & r24
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 != 0) goto L99
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2.writeInt32(r3)
            goto L72
        L99:
            r5 = r1
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r12.getObjectWriter(r4, r4, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r6 = r5
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            r14 = r6
            r6 = r27
            r1.write(r2, r3, r4, r5, r6)
            goto L11f
        Lad:
            r14 = r1
            r24 = 2
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r4 != r1) goto Ld4
            long r5 = r12.userDefineMask
            r20 = 4
            long r5 = r5 & r20
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 != 0) goto Lc4
            java.lang.Long r3 = (java.lang.Long) r3
            r2.writeInt64(r3)
            goto L11f
        Lc4:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r12.getObjectWriter(r4, r4, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r6 = r27
            r1.write(r2, r3, r4, r5, r6)
            goto L11f
        Ld4:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r4 != r1) goto Lfa
            long r5 = r12.userDefineMask
            long r5 = r5 & r24
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 != 0) goto Lea
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            r2.writeBool(r1)
            goto L11f
        Lea:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r12.getObjectWriter(r4, r4, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            r6 = r27
            r1.write(r2, r3, r4, r5, r6)
            goto L11f
        Lfa:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r4 != r1) goto L122
            long r5 = r12.userDefineMask
            r20 = 8
            long r5 = r5 & r20
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 != 0) goto L110
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            r6 = r27
            r2.writeDecimal(r3, r6, r9)
            goto L11f
        L110:
            r6 = r27
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r12.getObjectWriter(r4, r4, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Class<java.math.BigDecimal> r5 = java.math.BigDecimal.class
            r1.write(r2, r3, r4, r5, r6)
        L11f:
            r1 = r14
            goto L1af
        L122:
            java.lang.Class r1 = r0.itemClass
            if (r4 != r1) goto L13e
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.itemClassWriter
            if (r1 == 0) goto L13e
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.itemClassWriter
            boolean r4 = r0.itemClassRefDetect
            if (r4 == 0) goto L138
            boolean r4 = r2.isRefDetect()
            if (r4 == 0) goto L138
            r4 = 1
            goto L139
        L138:
            r4 = r10
        L139:
            r18 = r17
            r17 = r4
            goto L18c
        L13e:
            if (r4 != r14) goto L145
            r1 = r16
        L142:
            r18 = r17
            goto L18c
        L145:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            if (r4 != r1) goto L152
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE
            boolean r5 = r2.isRefDetect()
        L14f:
            r17 = r5
            goto L182
        L152:
            java.lang.Class r1 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
            if (r4 != r1) goto L161
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.getINSTANCE1()
            boolean r5 = r2.isRefDetect()
            goto L14f
        L161:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r1 = com.alibaba.fastjson2.JSONArray.class
            if (r4 != r1) goto L16c
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY
            boolean r5 = r2.isRefDetect()
            goto L14f
        L16c:
            java.lang.Class r1 = com.alibaba.fastjson2.JSONFactory.getClassJSONArray1x()
            if (r4 != r1) goto L179
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY_1x
            boolean r5 = r2.isRefDetect()
            goto L14f
        L179:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r11.getObjectWriter(r4)
            boolean r5 = r2.isRefDetect(r3)
            goto L14f
        L182:
            java.lang.Class r5 = r0.itemClass
            if (r4 != r5) goto L188
            r0.itemClassWriter = r1
        L188:
            r16 = r1
            r14 = r4
            goto L142
        L18c:
            if (r17 == 0) goto L19b
            java.lang.String r4 = r2.setPath(r15, r3)
            if (r4 == 0) goto L19b
            r2.writeReference(r4)
            r2.popPath(r3)
            goto L1ab
        L19b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.reflect.Type r5 = r0.itemType
            long r6 = r0.features
            r1.write(r2, r3, r4, r5, r6)
            if (r17 == 0) goto L1ab
            r2.popPath(r3)
        L1ab:
            r17 = r18
            goto L11f
        L1af:
            int r15 = r15 + 1
            goto L62
        L1b3:
            r2.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r10, java.lang.Object r11, java.lang.Object r12, java.lang.reflect.Type r13, long r14) {
            r9 = this;
            if (r11 != 0) goto L6
            r10.writeArrayNull()
            return
        L6:
            java.util.List r11 = com.alibaba.fastjson2.util.TypeUtils.toList(r11)
            int r12 = r11.size()
            r10.startArray(r12)
            r12 = 0
            r13 = 0
            r0 = r13
            r13 = r12
        L15:
            int r1 = r11.size()
            if (r0 >= r1) goto L46
            java.lang.Object r4 = r11.get(r0)
            if (r4 != 0) goto L26
            r10.writeNull()
            r3 = r10
            goto L42
        L26:
            java.lang.Class r1 = r4.getClass()
            if (r1 != r12) goto L2e
        L2c:
            r2 = r13
            goto L34
        L2e:
            com.alibaba.fastjson2.writer.ObjectWriter r13 = r10.getObjectWriter(r1)
            r12 = r1
            goto L2c
        L34:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.reflect.Type r6 = r9.itemType
            long r7 = r9.features
            long r7 = r7 | r14
            r3 = r10
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)
            r13 = r2
        L42:
            int r0 = r0 + 1
            r10 = r3
            goto L15
        L46:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r18, java.lang.Object r19, java.lang.Object r20, java.lang.reflect.Type r21, long r22) {
            r17 = this;
            r0 = r17
            r2 = r18
            r1 = r19
            r3 = r21
            if (r1 != 0) goto Le
            r2.writeArrayNull()
            return
        Le:
            boolean r4 = r3 instanceof java.lang.Class
            r8 = 0
            r9 = 1
            r5 = 0
            if (r4 == 0) goto L19
            java.lang.Class r3 = (java.lang.Class) r3
        L17:
            r4 = r5
            goto L46
        L19:
            java.lang.reflect.Type r4 = r0.defineType
            if (r3 != r4) goto L20
            java.lang.Class r3 = r0.itemClass
            goto L17
        L20:
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L44
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r4 = r3.getActualTypeArguments()
            int r6 = r4.length
            if (r6 != r9) goto L36
            r4 = r4[r8]
            boolean r6 = r4 instanceof java.lang.Class
            if (r6 == 0) goto L36
            java.lang.Class r4 = (java.lang.Class) r4
            goto L37
        L36:
            r4 = r5
        L37:
            java.lang.reflect.Type r3 = r3.getRawType()
            boolean r6 = r3 instanceof java.lang.Class
            if (r6 == 0) goto L42
            java.lang.Class r3 = (java.lang.Class) r3
            goto L46
        L42:
            r3 = r5
            goto L46
        L44:
            r3 = r5
            r4 = r3
        L46:
            java.lang.Class r6 = r1.getClass()
            r10 = r22
            boolean r3 = r2.isWriteTypeInfo(r1, r3, r10)
            if (r3 == 0) goto L6a
            java.lang.Class r3 = com.alibaba.fastjson2.writer.ObjectWriterImplList.CLASS_SUBLIST
            if (r6 == r3) goto L63
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            if (r6 != r3) goto L5b
            goto L63
        L5b:
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r6)
            r2.writeTypeName(r3)
            goto L6a
        L63:
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplList.TYPE_NAME_JSONB_ARRAY_LIST
            long r6 = com.alibaba.fastjson2.writer.ObjectWriterImplList.TYPE_NAME_HASH_ARRAY_LIST
            r2.writeTypeName(r3, r6)
        L6a:
            java.util.List r12 = com.alibaba.fastjson2.util.TypeUtils.toList(r1)
            int r13 = r12.size()
            if (r13 != 0) goto L7a
            r1 = -108(0xffffffffffffff94, float:NaN)
            r2.writeRaw(r1)
            return
        L7a:
            boolean r1 = r2.isBeanToArray()
            if (r1 == 0) goto Lb4
            r2.startArray(r13)
            r1 = r5
        L84:
            if (r8 >= r13) goto Lb0
            java.lang.Object r3 = r12.get(r8)
            if (r3 != 0) goto L92
            r2.writeNull()
            r9 = r5
            r5 = r4
            goto La9
        L92:
            java.lang.Class r6 = r3.getClass()
            if (r6 != r5) goto L9b
            r9 = r5
        L99:
            r5 = r4
            goto La1
        L9b:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r6)
            r9 = r6
            goto L99
        La1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r6 = r10
            r1.writeArrayMappingJSONB(r2, r3, r4, r5, r6)
        La9:
            int r8 = r8 + 1
            r10 = r22
            r4 = r5
            r5 = r9
            goto L84
        Lb0:
            r2.endArray()
            return
        Lb4:
            com.alibaba.fastjson2.JSONWriter$Context r10 = r2.context
            r2.startArray(r13)
            r1 = r5
            r11 = r8
        Lbb:
            if (r11 >= r13) goto L156
            java.lang.Object r3 = r12.get(r11)
            if (r3 != 0) goto Lc8
            r2.writeNull()
            goto L152
        Lc8:
            java.lang.Class r4 = r3.getClass()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r4 != r6) goto Ld7
            java.lang.String r3 = (java.lang.String) r3
            r2.writeString(r3)
            goto L152
        Ld7:
            java.lang.Class r6 = r0.itemClass
            if (r4 != r6) goto Le9
            boolean r6 = r0.itemClassRefDetect
            if (r6 == 0) goto Le7
            boolean r6 = r2.isRefDetect()
            if (r6 == 0) goto Le7
            r14 = r9
            goto Lee
        Le7:
            r14 = r8
            goto Lee
        Le9:
            boolean r6 = r2.isRefDetect(r3)
            r14 = r6
        Lee:
            java.lang.Class r6 = r0.itemClass
            if (r4 != r6) goto Lfd
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r0.itemClassWriter
            if (r6 == 0) goto Lfd
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r0.itemClassWriter
            r15 = r1
            r1 = r4
        Lfa:
            r16 = r5
            goto L130
        Lfd:
            if (r4 != r5) goto L101
            r15 = r1
            goto Lfa
        L101:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            if (r4 != r1) goto L108
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE
            goto L127
        L108:
            java.lang.Class r1 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
            if (r4 != r1) goto L113
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.getINSTANCE1()
            goto L127
        L113:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r1 = com.alibaba.fastjson2.JSONArray.class
            if (r4 != r1) goto L11a
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY
            goto L127
        L11a:
            java.lang.Class r1 = com.alibaba.fastjson2.JSONFactory.getClassJSONArray1x()
            if (r4 != r1) goto L123
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE_JSON_ARRAY_1x
            goto L127
        L123:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r10.getObjectWriter(r4)
        L127:
            java.lang.Class r5 = r0.itemClass
            if (r4 != r5) goto L12d
            r0.itemClassWriter = r1
        L12d:
            r15 = r1
            r16 = r4
        L130:
            if (r14 == 0) goto L13f
            java.lang.String r4 = r2.setPath(r11, r3)
            if (r4 == 0) goto L13f
            r2.writeReference(r4)
            r2.popPath(r3)
            goto L14f
        L13f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.reflect.Type r5 = r0.itemType
            long r6 = r0.features
            r1.writeJSONB(r2, r3, r4, r5, r6)
            if (r14 == 0) goto L14f
            r2.popPath(r3)
        L14f:
            r1 = r15
            r5 = r16
        L152:
            int r11 = r11 + 1
            goto Lbb
        L156:
            r2.endArray()
            return
    }
}
