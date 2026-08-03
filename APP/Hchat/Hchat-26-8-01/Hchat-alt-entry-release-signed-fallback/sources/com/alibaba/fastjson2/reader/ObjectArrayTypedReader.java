package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayTypedReader extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    final java.lang.Class componentClass;
    final long componentClassHash;
    final java.lang.Class componentType;
    final java.lang.String typeName;
    final long typeNameHashCode;

    public ObjectArrayTypedReader(java.lang.Class r4) {
            r3 = this;
            r3.<init>(r4)
            java.lang.Class r4 = r4.getComponentType()
            r3.componentType = r4
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r4)
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            r3.componentClassHash = r1
            java.lang.String r1 = "["
            java.lang.String r0 = wb.en.g(r1, r0)
            r3.typeName = r0
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            r3.typeNameHashCode = r0
            java.lang.Class r4 = com.alibaba.fastjson2.util.TypeUtils.getClass(r4)
            r3.componentClass = r4
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r10, long r11) {
            r9 = this;
            java.lang.Class r0 = r9.componentClass
            int r1 = r10.size()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Iterator r10 = r10.iterator()
            r1 = 0
            r2 = r1
        L12:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r10.next()
            if (r3 == 0) goto L32
            java.lang.Class r4 = r3.getClass()
            java.lang.Class r5 = r9.componentType
            if (r4 == r5) goto L32
            com.alibaba.fastjson2.reader.ObjectReaderProvider r6 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.util.function.Function r4 = r6.getTypeConvert(r4, r5)
            if (r4 == 0) goto L32
            java.lang.Object r3 = r4.apply(r3)
        L32:
            java.lang.Class r4 = r9.componentType
            boolean r4 = r4.isInstance(r3)
            if (r4 != 0) goto L9d
            com.alibaba.fastjson2.reader.ObjectReaderProvider r4 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r5 = r9.componentType
            com.alibaba.fastjson2.reader.ObjectReader r4 = r4.getObjectReader(r5)
            boolean r5 = r3 instanceof java.util.Map
            if (r5 == 0) goto L4d
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r4.createInstance(r3, r11)
            goto L9d
        L4d:
            boolean r5 = r3 instanceof java.util.Collection
            if (r5 == 0) goto L58
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r3 = r4.createInstance(r3, r11)
            goto L9d
        L58:
            boolean r5 = r3 instanceof java.lang.Object[]
            if (r5 == 0) goto L67
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            com.alibaba.fastjson2.JSONArray r3 = com.alibaba.fastjson2.JSONArray.of(r3)
            java.lang.Object r3 = r4.createInstance(r3, r11)
            goto L9d
        L67:
            if (r3 == 0) goto L9d
            java.lang.Class r5 = r3.getClass()
            boolean r6 = r5.isArray()
            if (r6 == 0) goto L8e
            int r5 = java.lang.reflect.Array.getLength(r3)
            com.alibaba.fastjson2.JSONArray r6 = new com.alibaba.fastjson2.JSONArray
            r6.<init>(r5)
            r7 = r1
        L7d:
            if (r7 >= r5) goto L89
            java.lang.Object r8 = java.lang.reflect.Array.get(r3, r7)
            r6.add(r8)
            int r7 = r7 + 1
            goto L7d
        L89:
            java.lang.Object r3 = r4.createInstance(r6, r11)
            goto L9d
        L8e:
            java.lang.Class r10 = r9.componentType
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = ", but "
            java.lang.String r12 = "component type not match, expect "
            ah.a.m(r12, r10, r11, r5)
            r10 = 0
            return r10
        L9d:
            int r4 = r2 + 1
            r0[r2] = r3
            r2 = r4
            goto L12
        La4:
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r11, java.lang.reflect.Type r12, java.lang.Object r13, long r14) {
            r10 = this;
            byte r1 = r11.getType()
            r2 = -110(0xffffffffffffff92, float:NaN)
            if (r1 != r2) goto L6c
            r11.next()
            long r1 = r11.readTypeHashCode()
            long r3 = com.alibaba.fastjson2.reader.ObjectArrayReader.TYPE_HASH_CODE
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L6c
            long r3 = r10.typeNameHashCode
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L1c
            goto L6c
        L1c:
            r4 = r14
            boolean r3 = r11.isSupportAutoType(r14)
            if (r3 == 0) goto L51
            java.lang.Class r3 = r10.objectClass
            r0 = r11
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.getObjectReaderAutoType(r1, r3, r4)
            if (r1 == 0) goto L36
            r2 = r12
            r3 = r13
            r4 = r14
            r0 = r1
            r1 = r11
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            return r0
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "auotype not support : "
            r1.<init>(r2)
            java.lang.String r2 = r11.getString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r11.info(r1)
            ah.a.w(r0)
            r0 = 0
            return r0
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "not support autotype : "
            r1.<init>(r2)
            java.lang.String r2 = r11.getString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r11.info(r1)
            ah.a.w(r0)
            r0 = 0
            return r0
        L6c:
            int r6 = r11.startArray()
            r1 = -1
            r7 = 0
            if (r6 != r1) goto L75
            return r7
        L75:
            java.lang.Class r1 = r10.componentClass
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r6)
            r8 = r1
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r1 = 0
            r9 = r1
        L80:
            if (r9 >= r6) goto Lc1
            boolean r1 = r11.isReference()
            if (r1 == 0) goto La0
            java.lang.String r1 = r11.readReference()
            java.lang.String r2 = ".."
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L96
            r1 = r8
            goto L9e
        L96:
            com.alibaba.fastjson2.JSONPath r1 = com.alibaba.fastjson2.JSONPath.of(r1)
            r11.addResolveTask(r8, r9, r1)
            r1 = r7
        L9e:
            r0 = r1
            goto Lbc
        La0:
            java.lang.Class r1 = r10.componentClass
            long r2 = r10.componentClassHash
            r0 = r11
            r4 = r14
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.checkAutoType(r1, r2, r4)
            if (r1 == 0) goto Lb6
            r2 = 0
            r3 = 0
            r4 = r14
            r0 = r1
            r1 = r11
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            goto Lbc
        Lb6:
            java.lang.Class r0 = r10.componentType
            java.lang.Object r0 = r11.read(r0)
        Lbc:
            r8[r9] = r0
            int r9 = r9 + 1
            goto L80
        Lc1:
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            boolean r10 = r7.jsonb
            if (r10 == 0) goto Lf
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)
            return r7
        Lf:
            r0 = r6
            r1 = r7
            boolean r7 = r1.readIfNull()
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            boolean r7 = r1.nextIfArrayStart()
            if (r7 == 0) goto L59
            java.lang.Class r7 = r0.componentType
            r8 = 16
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r8)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            r8 = 0
        L2a:
            boolean r9 = r1.nextIfArrayEnd()
            if (r9 == 0) goto L38
            r1.nextIfComma()
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            return r7
        L38:
            int r9 = r8 + 1
            int r10 = r7.length
            int r10 = r9 - r10
            if (r10 <= 0) goto L4c
            int r10 = r7.length
            int r11 = r10 >> 1
            int r10 = r10 + r11
            int r11 = r10 - r9
            if (r11 >= 0) goto L48
            r10 = r9
        L48:
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r10)
        L4c:
            java.lang.Class r10 = r0.componentType
            java.lang.Object r10 = r1.read(r10)
            r7[r8] = r10
            r1.nextIfComma()
            r8 = r9
            goto L2a
        L59:
            char r7 = r1.current()
            r9 = 34
            if (r7 != r9) goto L6c
            java.lang.String r7 = r1.readString()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L6c
            return r8
        L6c:
            java.lang.String r7 = "TODO"
            java.lang.String r7 = r1.info(r7)
            ah.a.w(r7)
            r7 = 0
            return r7
    }
}
