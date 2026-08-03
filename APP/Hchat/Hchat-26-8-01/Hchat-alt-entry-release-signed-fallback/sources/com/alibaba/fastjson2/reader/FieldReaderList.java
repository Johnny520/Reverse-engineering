package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderList<T, V> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    final long fieldClassHash;
    final long itemClassHash;

    public FieldReaderList(java.lang.String r16, java.lang.reflect.Type r17, java.lang.Class r18, java.lang.reflect.Type r19, java.lang.Class r20, int r21, long r22, java.lang.String r24, java.util.Locale r25, java.lang.Object r26, java.lang.reflect.Method r27, java.lang.reflect.Field r28, java.util.function.BiConsumer r29) {
            r15 = this;
            r0 = r19
            r1 = r20
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r21
            r7 = r22
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r15.itemType = r0
            r15.itemClass = r1
            r3 = 0
            if (r1 != 0) goto L28
            r5 = r3
            goto L30
        L28:
            java.lang.String r1 = r1.getName()
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
        L30:
            r15.itemClassHash = r5
            if (r18 != 0) goto L35
            goto L3d
        L35:
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r18)
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
        L3d:
            r15.fieldClassHash = r3
            if (r9 == 0) goto L4e
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L4e
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplDate
            r10 = r25
            r0.<init>(r9, r10)
            r15.itemReader = r0
        L4e:
            return
    }

    public void accept(T r1, com.alibaba.fastjson2.JSONArray r2) {
            r0 = this;
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader checkObjectAutoType(com.alibaba.fastjson2.JSONReader r9) {
            r8 = this;
            r0 = -110(0xffffffffffffff92, float:NaN)
            boolean r0 = r9.nextIfMatch(r0)
            if (r0 == 0) goto La4
            long r2 = r9.readTypeHashCode()
            long r0 = r8.features
            long r5 = r9.features(r0)
            com.alibaba.fastjson2.JSONReader$Context r0 = r9.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r1 = r0.getContextAutoTypeBeforeHandler()
            if (r1 == 0) goto L35
            java.lang.Class r4 = r8.fieldClass
            java.lang.Class r4 = r1.apply(r2, r4, r5)
            if (r4 != 0) goto L2c
            java.lang.String r4 = r9.getString()
            java.lang.Class r7 = r8.fieldClass
            java.lang.Class r4 = r1.apply(r4, r7, r5)
        L2c:
            if (r4 == 0) goto L35
            java.lang.Class r9 = r8.fieldClass
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r9)
            return r9
        L35:
            boolean r0 = r9.isSupportAutoType(r5)
            if (r0 != 0) goto L69
            boolean r0 = r9.isArray()
            if (r0 == 0) goto L4e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNotSupportAutoType
            boolean r0 = r9.isEnabled(r0)
            if (r0 != 0) goto L4e
            com.alibaba.fastjson2.reader.ObjectReader r9 = r8.getObjectReader(r9)
            return r9
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "autoType not support input "
            r0.<init>(r1)
            java.lang.String r1 = r9.getString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r9.info(r0)
            ah.a.w(r9)
            r9 = 0
            return r9
        L69:
            java.lang.Class r4 = r8.fieldClass
            r1 = r9
            com.alibaba.fastjson2.reader.ObjectReader r9 = r1.getObjectReaderAutoType(r2, r4, r5)
            boolean r0 = r9 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplList
            if (r0 == 0) goto L86
            com.alibaba.fastjson2.reader.ObjectReaderImplList r9 = (com.alibaba.fastjson2.reader.ObjectReaderImplList) r9
            com.alibaba.fastjson2.reader.ObjectReaderImplList r2 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            java.lang.reflect.Type r3 = r8.fieldType
            java.lang.Class r4 = r8.fieldClass
            java.lang.Class r5 = r9.instanceType
            java.lang.reflect.Type r6 = r8.itemType
            java.util.function.Function r7 = r9.builder
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = r2
        L86:
            if (r9 == 0) goto L89
            return r9
        L89:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "auotype not support : "
            r9.<init>(r0)
            java.lang.String r0 = r1.getString()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r1.info(r9)
            ah.a.w(r9)
            r9 = 0
            return r9
        La4:
            r9 = 0
            return r9
    }

    public java.util.Collection<V> createList(com.alibaba.fastjson2.JSONReader.Context r3) {
            r2 = this;
            java.lang.Class r0 = r2.fieldClass
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 == r1) goto L1a
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            if (r0 == r1) goto L1a
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            if (r0 != r1) goto Lf
            goto L1a
        Lf:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.getObjectReader(r3)
            java.lang.Object r3 = r3.createInstance()
            java.util.Collection r3 = (java.util.Collection) r3
            return r3
        L1a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public long getItemClassHash() {
            r2 = this;
            long r0 = r2.itemClassHash
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r12) {
            r11 = this;
            boolean r0 = r12.jsonb
            r1 = 0
            if (r0 == 0) goto L27
            int r0 = r12.startArray()
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.alibaba.fastjson2.JSONReader$Context r3 = r12.context
            com.alibaba.fastjson2.reader.ObjectReader r4 = r11.getItemObjectReader(r3)
        L11:
            if (r1 >= r0) goto L22
            r7 = 0
            r8 = 0
            r6 = 0
            r5 = r12
            java.lang.Object r12 = r4.readObject(r5, r6, r7, r8)
            r2[r1] = r12
            int r1 = r1 + 1
            r12 = r5
            goto L11
        L22:
            java.util.List r12 = java.util.Arrays.asList(r2)
            return r12
        L27:
            r5 = r12
            char r12 = r5.current()
            r0 = 91
            if (r12 != r0) goto L5c
            com.alibaba.fastjson2.JSONReader$Context r12 = r5.context
            r6 = r5
            com.alibaba.fastjson2.reader.ObjectReader r5 = r11.getItemObjectReader(r12)
            java.util.Collection r12 = r11.createList(r12)
            r6.next()
        L3e:
            boolean r0 = r6.nextIfArrayEnd()
            if (r0 == 0) goto L48
            r6.nextIfComma()
            return r12
        L48:
            java.lang.reflect.Type r7 = r11.fieldType
            java.lang.String r8 = r11.fieldName
            r9 = 0
            java.lang.Object r0 = r5.readObject(r6, r7, r8, r9)
            r2 = r5
            r5 = r6
            r12.add(r0)
            r5.nextIfComma()
            r5 = r2
            goto L3e
        L5c:
            boolean r12 = r5.isString()
            if (r12 == 0) goto La9
            java.lang.String r12 = r5.readString()
            java.lang.reflect.Type r0 = r11.itemType
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto La9
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto La9
            com.alibaba.fastjson2.JSONReader$Context r0 = r5.context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r0.provider
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.reflect.Type r3 = r11.itemType
            java.util.function.Function r0 = r0.getTypeConvert(r2, r3)
            if (r0 == 0) goto La9
            com.alibaba.fastjson2.JSONReader$Context r2 = r5.context
            java.util.Collection r2 = r11.createList(r2)
            r3 = 44
            int r3 = r12.indexOf(r3)
            r4 = -1
            if (r3 == r4) goto La8
            java.lang.String r3 = ","
            java.lang.String[] r12 = r12.split(r3)
            int r3 = r12.length
        L9a:
            if (r1 >= r3) goto La8
            r4 = r12[r1]
            java.lang.Object r4 = r0.apply(r4)
            r2.add(r4)
            int r1 = r1 + 1
            goto L9a
        La8:
            return r2
        La9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "TODO : "
            r12.<init>(r0)
            java.lang.Class r0 = r11.getClass()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = r5.info(r12)
            ah.a.w(r12)
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r14, T r15) {
            r13 = this;
            boolean r0 = r14.jsonb
            if (r0 == 0) goto L8
            r13.readFieldValueJSONB(r14, r15)
            return
        L8:
            boolean r0 = r14.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L13
            r13.accept(r15, r1)
            return
        L13:
            boolean r0 = r14.isReference()
            java.lang.String r2 = ".."
            if (r0 == 0) goto L2d
            java.lang.String r0 = r14.readReference()
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L29
            r13.accept(r15, r15)
            return
        L29:
            r13.addResolveTask(r14, r15, r0)
            return
        L2d:
            com.alibaba.fastjson2.JSONReader$Context r0 = r14.context
            com.alibaba.fastjson2.reader.ObjectReader r3 = r13.getObjectReader(r0)
            com.alibaba.fastjson2.reader.ObjectReader r4 = r13.initReader
            if (r4 == 0) goto L3c
            java.util.function.Function r1 = r4.getBuildFunction()
            goto L44
        L3c:
            boolean r4 = r3 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplList
            if (r4 == 0) goto L44
            java.util.function.Function r1 = r3.getBuildFunction()
        L44:
            char r4 = r14.current()
            r5 = 91
            if (r4 != r5) goto L9c
            com.alibaba.fastjson2.reader.ObjectReader r6 = r13.getItemObjectReader(r0)
            java.util.Collection r5 = r13.createList(r0)
            r14.next()
            r0 = 0
        L58:
            boolean r3 = r14.nextIfArrayEnd()
            if (r3 == 0) goto L6e
            if (r1 == 0) goto L67
            java.lang.Object r0 = r1.apply(r5)
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
        L67:
            r13.accept(r15, r5)
            r14.nextIfComma()
            return
        L6e:
            boolean r3 = r14.isReference()
            if (r3 == 0) goto L89
            java.lang.String r3 = r14.readReference()
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L81
            r7 = r14
            r14 = r5
            goto L92
        L81:
            r4 = r5
            java.util.List r4 = (java.util.List) r4
            r13.addResolveTask(r14, r4, r0, r3)
            r7 = r14
            goto L98
        L89:
            r9 = 0
            r10 = 0
            r8 = 0
            r7 = r14
            java.lang.Object r14 = r6.readObject(r7, r8, r9, r10)
        L92:
            r5.add(r14)
            r7.nextIfComma()
        L98:
            int r0 = r0 + 1
            r14 = r7
            goto L58
        L9c:
            r7 = r14
            r14 = 123(0x7b, float:1.72E-43)
            if (r4 != r14) goto Ld0
            com.alibaba.fastjson2.reader.ObjectReader r14 = r13.getItemObjectReader(r0)
            boolean r14 = r14 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean
            if (r14 == 0) goto Ld0
            r4 = r7
            com.alibaba.fastjson2.reader.ObjectReader r7 = r13.itemReader
            r10 = 0
            long r11 = r13.features
            r9 = 0
            r8 = r4
            java.lang.Object r14 = r7.readObject(r8, r9, r10, r11)
            long r5 = r13.features
            java.lang.Object r0 = r3.createInstance(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r14)
            if (r1 == 0) goto Lc9
            java.lang.Object r14 = r1.apply(r0)
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
        Lc9:
            r13.accept(r15, r0)
            r4.nextIfComma()
            return
        Ld0:
            r4 = r7
            r6 = 0
            long r7 = r13.features
            r5 = 0
            java.lang.Object r14 = r3.readObject(r4, r5, r6, r7)
            r13.accept(r15, r14)
            return
    }
}
