package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplBoolValueArrayLambda extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    private final java.util.function.BiFunction<java.lang.Object, java.lang.Integer, java.lang.Boolean> functionGet;
    private final java.util.function.ToIntFunction functionSize;

    public ObjectWriterImplBoolValueArrayLambda(java.util.function.ToIntFunction r1, java.util.function.BiFunction<java.lang.Object, java.lang.Integer, java.lang.Boolean> r2) {
            r0 = this;
            r0.<init>()
            r0.functionSize = r1
            r0.functionGet = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeArrayNull()
            return
        L6:
            java.util.function.ToIntFunction r3 = r0.functionSize
            int r3 = r3.applyAsInt(r2)
            r1.startArray()
            r4 = 0
        L10:
            if (r4 >= r3) goto L2d
            java.util.function.BiFunction<java.lang.Object, java.lang.Integer, java.lang.Boolean> r5 = r0.functionGet
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.apply(r2, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r4 == 0) goto L27
            r1.writeComma()
        L27:
            r1.writeBool(r5)
            int r4 = r4 + 1
            goto L10
        L2d:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeArrayNull()
            return
        L6:
            boolean r3 = r1.isWriteTypeInfo(r2, r4, r5)
            if (r3 == 0) goto L13
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArray.JSONB_TYPE_NAME_BYTES
            long r4 = com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArray.JSONB_TYPE_HASH
            r1.writeTypeName(r3, r4)
        L13:
            java.util.function.ToIntFunction r3 = r0.functionSize
            int r3 = r3.applyAsInt(r2)
            r1.startArray(r3)
            r4 = 0
        L1d:
            if (r4 >= r3) goto L35
            java.util.function.BiFunction<java.lang.Object, java.lang.Integer, java.lang.Boolean> r5 = r0.functionGet
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.apply(r2, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1.writeBool(r5)
            int r4 = r4 + 1
            goto L1d
        L35:
            return
    }
}
