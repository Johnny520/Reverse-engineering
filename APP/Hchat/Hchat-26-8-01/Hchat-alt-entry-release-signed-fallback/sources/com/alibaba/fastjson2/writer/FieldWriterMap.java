package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterMap extends com.alibaba.fastjson2.writer.FieldWriterObject {
    protected final java.lang.Class<?> contentAs;
    protected java.lang.reflect.Type contentAsFieldType;
    private final java.lang.reflect.Type keyType;
    volatile com.alibaba.fastjson2.writer.ObjectWriter mapWriter;
    private final java.lang.reflect.Type valueType;
    final boolean valueTypeRefDetect;
    volatile com.alibaba.fastjson2.writer.ObjectWriter valueWriter;

    public FieldWriterMap(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10, java.lang.Class<?> r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            boolean r2 = r7 instanceof java.lang.reflect.ParameterizedType
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L1a
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type[] r2 = r7.getActualTypeArguments()
            int r7 = r2.length
            if (r7 != r4) goto L1a
            r7 = r2[r3]
            r2 = r2[r5]
            goto L1c
        L1a:
            r2 = r6
            r7 = r2
        L1c:
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r7 != 0) goto L21
            r7 = r9
        L21:
            if (r2 != 0) goto L24
            r2 = r9
        L24:
            if (r11 == 0) goto L33
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r6 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r4]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4[r3] = r9
            r4[r5] = r11
            r6.<init>(r8, r4)
        L33:
            r1.contentAs = r11
            r1.contentAsFieldType = r6
            r1.keyType = r7
            r1.valueType = r2
            java.lang.Class r2 = com.alibaba.fastjson2.util.TypeUtils.getClass(r2)
            boolean r2 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r2)
            r2 = r2 ^ r5
            r1.valueTypeRefDetect = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r8, java.lang.Class r9) {
            r7 = this;
            java.lang.Class<?> r2 = r7.contentAs
            if (r2 == 0) goto Lc
            java.lang.Class r0 = r7.fieldClass
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto Le
        Lc:
            r3 = r9
            goto L25
        Le:
            com.alibaba.fastjson2.writer.ObjectWriter r8 = r7.valueWriter
            if (r8 == 0) goto L13
            return r8
        L13:
            long r0 = r7.features
            java.lang.reflect.Type r4 = r7.contentAsFieldType
            r5 = -9223372036854775808
            long r5 = r5 | r0
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplMap
            java.lang.reflect.Type r1 = r7.keyType
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mapWriter = r0
            return r0
        L25:
            com.alibaba.fastjson2.writer.ObjectWriter r8 = super.getObjectWriter(r8, r3)
            return r8
    }
}
