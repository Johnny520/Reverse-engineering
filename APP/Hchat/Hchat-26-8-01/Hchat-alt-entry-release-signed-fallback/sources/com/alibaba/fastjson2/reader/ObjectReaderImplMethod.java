package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplMethod implements com.alibaba.fastjson2.reader.ObjectReader<java.lang.reflect.Method> {
    static final long HASH_DECLARING_CLASS = 0;
    static final long HASH_NAME = 0;
    static final long HASH_PARAMETER_TYPES = 0;

    static {
            java.lang.String r0 = "declaringClass"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplMethod.HASH_DECLARING_CLASS = r0
            java.lang.String r0 = "name"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplMethod.HASH_NAME = r0
            java.lang.String r0 = "parameterTypes"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplMethod.HASH_PARAMETER_TYPES = r0
            return
    }

    public ObjectReaderImplMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.reflect.Method getMethod(long r3, java.lang.String r5, java.lang.String r6, java.util.List<java.lang.String> r7) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportClassForName
            long r0 = r0.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L3e
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r6)
            r4 = 0
            if (r7 != 0) goto L15
            java.lang.Class[] r4 = new java.lang.Class[r4]
            goto L31
        L15:
            int r6 = r7.size()
            java.lang.Class[] r6 = new java.lang.Class[r6]
        L1b:
            int r0 = r7.size()
            if (r4 >= r0) goto L30
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r0)
            r6[r4] = r0
            int r4 = r4 + 1
            goto L1b
        L30:
            r4 = r6
        L31:
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r4)     // Catch: java.lang.NoSuchMethodException -> L36
            return r3
        L36:
            r3 = move-exception
            java.lang.String r4 = "method not found"
            ah.a.x(r4, r3)
        L3c:
            r3 = 0
            return r3
        L3e:
            java.lang.String r3 = "ClassForName not support"
            ah.a.w(r3)
            goto L3c
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.reflect.Method readArrayMappingJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.reflect.Method r1 = r0.readArrayMappingJSONBObject2(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /* JADX INFO: renamed from: readArrayMappingJSONBObject, reason: avoid collision after fix types in other method */
    public java.lang.reflect.Method readArrayMappingJSONBObject2(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            int r8 = r7.startArray()
            r9 = 3
            if (r8 != r9) goto L21
            java.lang.String r4 = r7.readString()
            java.lang.String r3 = r7.readString()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.util.List r5 = r7.readArray(r8)
            com.alibaba.fastjson2.JSONReader$Context r7 = r7.context
            long r7 = r7.features
            long r1 = r7 | r10
            r0 = r6
            java.lang.reflect.Method r7 = r0.getMethod(r1, r3, r4, r5)
            return r7
        L21:
            java.lang.String r8 = "not support input "
            java.lang.String r7 = r7.info()
            ah.a.i(r7, r8)
            r7 = 0
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.reflect.Method readArrayMappingObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.reflect.Method r1 = r0.readArrayMappingObject2(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /* JADX INFO: renamed from: readArrayMappingObject, reason: avoid collision after fix types in other method */
    public java.lang.reflect.Method readArrayMappingObject2(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            boolean r8 = r7.nextIfArrayStart()
            java.lang.String r9 = "not support input "
            if (r8 == 0) goto L34
            java.lang.String r4 = r7.readString()
            java.lang.String r3 = r7.readString()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.util.List r5 = r7.readArray(r8)
            boolean r8 = r7.nextIfArrayEnd()
            if (r8 == 0) goto L2b
            r7.nextIfComma()
            com.alibaba.fastjson2.JSONReader$Context r7 = r7.context
            long r7 = r7.features
            long r1 = r7 | r10
            r0 = r6
            java.lang.reflect.Method r7 = r0.getMethod(r1, r3, r4, r5)
            return r7
        L2b:
            java.lang.String r7 = r7.info()
            ah.a.i(r7, r9)
            r7 = 0
            return r7
        L34:
            java.lang.String r7 = r7.info()
            ah.a.i(r7, r9)
            r7 = 0
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.reflect.Method readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.reflect.Method r1 = r0.readJSONBObject2(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /* JADX INFO: renamed from: readJSONBObject, reason: avoid collision after fix types in other method */
    public java.lang.reflect.Method readJSONBObject2(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.reflect.Method r1 = r0.readObject2(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.reflect.Method readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.reflect.Method r1 = r0.readObject2(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /* JADX INFO: renamed from: readObject, reason: avoid collision after fix types in other method */
    public java.lang.reflect.Method readObject2(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
            r7 = this;
            boolean r0 = r8.nextIfObjectStart()
            if (r0 != 0) goto L25
            boolean r0 = r8.isSupportBeanArray(r11)
            if (r0 == 0) goto L1a
            boolean r0 = r8.jsonb
            if (r0 == 0) goto L15
            java.lang.reflect.Method r8 = r7.readArrayMappingJSONBObject2(r8, r9, r10, r11)
            return r8
        L15:
            java.lang.reflect.Method r8 = r7.readArrayMappingObject2(r8, r9, r10, r11)
            return r8
        L1a:
            java.lang.String r9 = "not support input "
            java.lang.String r8 = r8.info()
            ah.a.i(r8, r9)
            r8 = 0
            return r8
        L25:
            r9 = 0
            r4 = r9
            r5 = r4
            r6 = r5
        L29:
            boolean r9 = r8.nextIfObjectEnd()
            if (r9 == 0) goto L42
            boolean r9 = r8.jsonb
            if (r9 != 0) goto L36
            r8.nextIfComma()
        L36:
            com.alibaba.fastjson2.JSONReader$Context r8 = r8.context
            long r8 = r8.features
            long r2 = r8 | r11
            r1 = r7
            java.lang.reflect.Method r8 = r1.getMethod(r2, r4, r5, r6)
            return r8
        L42:
            long r9 = r8.readFieldNameHashCode()
            long r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMethod.HASH_DECLARING_CLASS
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 != 0) goto L52
            java.lang.String r9 = r8.readString()
            r5 = r9
            goto L29
        L52:
            long r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMethod.HASH_NAME
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 != 0) goto L5e
            java.lang.String r9 = r8.readString()
            r4 = r9
            goto L29
        L5e:
            long r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMethod.HASH_PARAMETER_TYPES
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L6c
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.util.List r9 = r8.readArray(r9)
            r6 = r9
            goto L29
        L6c:
            r8.skipValue()
            goto L29
    }
}
