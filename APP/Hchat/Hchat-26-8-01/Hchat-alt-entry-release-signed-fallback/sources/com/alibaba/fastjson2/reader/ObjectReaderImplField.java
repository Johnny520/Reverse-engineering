package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplField implements com.alibaba.fastjson2.reader.ObjectReader {
    static final long HASH_DECLARING_CLASS = 0;
    static final long HASH_NAME = 0;

    static {
            java.lang.String r0 = "declaringClass"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplField.HASH_DECLARING_CLASS = r0
            java.lang.String r0 = "name"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplField.HASH_NAME = r0
            return
    }

    public ObjectReaderImplField() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.reflect.Field getField(long r3, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportClassForName
            long r0 = r0.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L1c
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r6)
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L14
            return r3
        L14:
            r3 = move-exception
            java.lang.String r4 = "method not found"
            ah.a.x(r4, r3)
        L1a:
            r3 = 0
            return r3
        L1c:
            java.lang.String r3 = "ClassForName not support"
            ah.a.w(r3)
            goto L1a
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readArrayMappingJSONBObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            int r4 = r3.startArray()
            r5 = 2
            if (r4 != r5) goto L19
            java.lang.String r4 = r3.readString()
            java.lang.String r5 = r3.readString()
            com.alibaba.fastjson2.JSONReader$Context r3 = r3.context
            long r0 = r3.features
            long r6 = r6 | r0
            java.lang.reflect.Field r3 = r2.getField(r6, r5, r4)
            return r3
        L19:
            java.lang.String r4 = "not support input "
            java.lang.String r3 = r3.info()
            ah.a.i(r3, r4)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readArrayMappingObject(com.alibaba.fastjson2.JSONReader r4, java.lang.reflect.Type r5, java.lang.Object r6, long r7) {
            r3 = this;
            boolean r5 = r4.nextIfArrayStart()
            java.lang.String r6 = "not support input "
            if (r5 == 0) goto L2d
            java.lang.String r5 = r4.readString()
            java.lang.String r0 = r4.readString()
            boolean r1 = r4.nextIfArrayEnd()
            if (r1 == 0) goto L24
            r4.nextIfComma()
            com.alibaba.fastjson2.JSONReader$Context r4 = r4.context
            long r1 = r4.features
            long r6 = r1 | r7
            java.lang.reflect.Field r4 = r3.getField(r6, r0, r5)
            return r4
        L24:
            java.lang.String r4 = r4.info()
            ah.a.i(r4, r6)
            r4 = 0
            return r4
        L2d:
            java.lang.String r4 = r4.info()
            ah.a.i(r4, r6)
            r4 = 0
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r6, java.lang.reflect.Type r7, java.lang.Object r8, long r9) {
            r5 = this;
            boolean r0 = r6.nextIfObjectStart()
            if (r0 != 0) goto L27
            boolean r0 = r6.isSupportBeanArray(r9)
            if (r0 == 0) goto L1b
            boolean r0 = r6.jsonb
            if (r0 == 0) goto L15
            java.lang.Object r6 = r5.readArrayMappingJSONBObject(r6, r7, r8, r9)
            return r6
        L15:
            java.lang.Object r6 = r5.readArrayMappingObject(r6, r7, r8, r9)
            r7 = r5
            return r6
        L1b:
            r7 = r5
            java.lang.String r8 = "not support input "
            java.lang.String r6 = r6.info()
            ah.a.i(r6, r8)
            r6 = 0
            return r6
        L27:
            r7 = r5
            r8 = 0
            r0 = r8
        L2a:
            boolean r1 = r6.nextIfObjectEnd()
            if (r1 == 0) goto L41
            boolean r1 = r6.jsonb
            if (r1 != 0) goto L37
            r6.nextIfComma()
        L37:
            com.alibaba.fastjson2.JSONReader$Context r6 = r6.context
            long r1 = r6.features
            long r9 = r9 | r1
            java.lang.reflect.Field r6 = r5.getField(r9, r8, r0)
            return r6
        L41:
            long r1 = r6.readFieldNameHashCode()
            long r3 = com.alibaba.fastjson2.reader.ObjectReaderImplField.HASH_DECLARING_CLASS
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L50
            java.lang.String r0 = r6.readString()
            goto L2a
        L50:
            long r3 = com.alibaba.fastjson2.reader.ObjectReaderImplField.HASH_NAME
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L5b
            java.lang.String r8 = r6.readString()
            goto L2a
        L5b:
            r6.skipValue()
            goto L2a
    }
}
