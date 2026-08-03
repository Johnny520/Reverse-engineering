package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListStr extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplListStr INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplListStr r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplListStr
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplListStr.INSTANCE = r0
            return
    }

    public ObjectWriterImplListStr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.List r2 = com.alibaba.fastjson2.util.TypeUtils.toList(r2)
            r1.startArray()
            r3 = 0
        Le:
            int r4 = r2.size()
            if (r3 >= r4) goto L2b
            if (r3 == 0) goto L19
            r1.writeComma()
        L19:
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L25
            r1.writeNull()
            goto L28
        L25:
            r1.writeString(r4)
        L28:
            int r3 = r3 + 1
            goto Le
        L2b:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            java.lang.reflect.ParameterizedType r4 = com.alibaba.fastjson2.util.TypeUtils.PARAM_TYPE_LIST_STR
            if (r5 != r4) goto Ld
            java.lang.Class<java.util.List> r4 = java.util.List.class
            goto L27
        Ld:
            boolean r4 = r5 instanceof java.lang.Class
            if (r4 == 0) goto L15
            r4 = r5
            java.lang.Class r4 = (java.lang.Class) r4
            goto L27
        L15:
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L26
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r4 = r5.getRawType()
            boolean r5 = r4 instanceof java.lang.Class
            if (r5 == 0) goto L26
            java.lang.Class r4 = (java.lang.Class) r4
            goto L27
        L26:
            r4 = 0
        L27:
            java.lang.Class r5 = r3.getClass()
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            if (r5 == r0) goto L41
            boolean r4 = r2.isWriteTypeInfo(r3, r4, r6)
            if (r4 == 0) goto L41
            java.lang.Class r4 = com.alibaba.fastjson2.writer.ObjectWriterImplList.CLASS_SUBLIST
            if (r5 != r4) goto L3a
            r5 = r0
        L3a:
            java.lang.String r4 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r5)
            r2.writeTypeName(r4)
        L41:
            java.util.List r3 = com.alibaba.fastjson2.util.TypeUtils.toList(r3)
            r2.writeString(r3)
            return
    }
}
