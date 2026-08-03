package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectWriter<T> {
    default long getFeatures() {
            r2 = this;
            r0 = 0
            return r0
    }

    default java.lang.Object getFieldValue(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            com.alibaba.fastjson2.writer.FieldWriter r2 = r0.getFieldWriter(r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.getFieldValue(r1)
            return r1
    }

    default com.alibaba.fastjson2.writer.FieldWriter getFieldWriter(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    default com.alibaba.fastjson2.writer.FieldWriter getFieldWriter(java.lang.String r6) {
            r5 = this;
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r6)
            com.alibaba.fastjson2.writer.FieldWriter r2 = r5.getFieldWriter(r0)
            if (r2 != 0) goto L17
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r6)
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 == 0) goto L17
            com.alibaba.fastjson2.writer.FieldWriter r6 = r5.getFieldWriter(r3)
            return r6
        L17:
            return r2
    }

    default java.util.List<com.alibaba.fastjson2.writer.FieldWriter> getFieldWriters() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    default boolean hasFilter(com.alibaba.fastjson2.JSONWriter r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter
            long r0 = r0.mask
            boolean r3 = r3.hasFilter(r0)
            return r3
    }

    default void setFilter(com.alibaba.fastjson2.filter.Filter r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.PropertyFilter
            if (r0 == 0) goto La
            r0 = r2
            com.alibaba.fastjson2.filter.PropertyFilter r0 = (com.alibaba.fastjson2.filter.PropertyFilter) r0
            r1.setPropertyFilter(r0)
        La:
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.ValueFilter
            if (r0 == 0) goto L14
            r0 = r2
            com.alibaba.fastjson2.filter.ValueFilter r0 = (com.alibaba.fastjson2.filter.ValueFilter) r0
            r1.setValueFilter(r0)
        L14:
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.NameFilter
            if (r0 == 0) goto L1e
            r0 = r2
            com.alibaba.fastjson2.filter.NameFilter r0 = (com.alibaba.fastjson2.filter.NameFilter) r0
            r1.setNameFilter(r0)
        L1e:
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.PropertyPreFilter
            if (r0 == 0) goto L27
            com.alibaba.fastjson2.filter.PropertyPreFilter r2 = (com.alibaba.fastjson2.filter.PropertyPreFilter) r2
            r1.setPropertyPreFilter(r2)
        L27:
            return
    }

    default void setNameFilter(com.alibaba.fastjson2.filter.NameFilter r1) {
            r0 = this;
            return
    }

    default void setPropertyFilter(com.alibaba.fastjson2.filter.PropertyFilter r1) {
            r0 = this;
            return
    }

    default void setPropertyPreFilter(com.alibaba.fastjson2.filter.PropertyPreFilter r1) {
            r0 = this;
            return
    }

    default void setValueFilter(com.alibaba.fastjson2.filter.ValueFilter r1) {
            r0 = this;
            return
    }

    default java.lang.String toJSONString(T r9, com.alibaba.fastjson2.JSONWriter.Feature... r10) {
            r8 = this;
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.of(r10)
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r8
            r3 = r9
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L15
            r2.close()
            return r9
        L15:
            r0 = move-exception
            r9 = r0
            if (r2 == 0) goto L22
            r2.close()     // Catch: java.lang.Throwable -> L1d
            goto L22
        L1d:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L22:
            throw r9
    }

    default void write(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9) {
            r7 = this;
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.write(r1, r2, r3, r4, r5)
            return
    }

    void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5);

    default void writeArrayMapping(com.alibaba.fastjson2.JSONWriter r6, java.lang.Object r7, java.lang.Object r8, java.lang.reflect.Type r9, long r10) {
            r5 = this;
            boolean r0 = r6.jsonb
            if (r0 == 0) goto L8
            r5.writeArrayMappingJSONB(r6, r7, r8, r9, r10)
            return
        L8:
            java.util.List r8 = r5.getFieldWriters()
            r6.startArray()
            boolean r9 = r5.hasFilter(r6)
            r10 = 0
            if (r9 != 0) goto L2d
            int r9 = r8.size()
        L1a:
            if (r10 >= r9) goto L9a
            if (r10 == 0) goto L21
            r6.writeComma()
        L21:
            java.lang.Object r11 = r8.get(r10)
            com.alibaba.fastjson2.writer.FieldWriter r11 = (com.alibaba.fastjson2.writer.FieldWriter) r11
            r11.writeValue(r6, r7)
            int r10 = r10 + 1
            goto L1a
        L2d:
            com.alibaba.fastjson2.JSONWriter$Context r9 = r6.context
            com.alibaba.fastjson2.filter.PropertyPreFilter r11 = r9.getPropertyPreFilter()
            com.alibaba.fastjson2.filter.ValueFilter r0 = r9.getValueFilter()
            com.alibaba.fastjson2.filter.PropertyFilter r9 = r9.getPropertyFilter()
            int r1 = r8.size()
        L3f:
            if (r10 >= r1) goto L9a
            if (r10 == 0) goto L46
            r6.writeComma()
        L46:
            java.lang.Object r2 = r8.get(r10)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            if (r11 == 0) goto L5a
            java.lang.String r3 = r2.fieldName
            boolean r3 = r11.process(r6, r7, r3)
            if (r3 != 0) goto L5a
            r6.writeNull()
            goto L97
        L5a:
            java.lang.Object r3 = r2.getFieldValue(r7)
            if (r9 == 0) goto L6c
            java.lang.String r4 = r2.fieldName
            boolean r4 = r9.apply(r7, r4, r3)
            if (r4 != 0) goto L6c
            r6.writeNull()
            goto L97
        L6c:
            if (r0 == 0) goto L86
            java.lang.String r4 = r2.fieldName
            java.lang.Object r4 = r0.apply(r7, r4, r3)
            if (r4 != 0) goto L7a
            r6.writeNull()
            goto L97
        L7a:
            java.lang.Class r4 = r4.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r6, r4)
            r2.write(r6, r3)
            goto L97
        L86:
            if (r3 != 0) goto L8c
            r6.writeNull()
            goto L97
        L8c:
            java.lang.Class r4 = r3.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r6, r4)
            r2.write(r6, r3)
        L97:
            int r10 = r10 + 1
            goto L3f
        L9a:
            r6.endArray()
            return
    }

    default void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9) {
            r7 = this;
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.writeArrayMappingJSONB(r1, r2, r3, r4, r5)
            return
    }

    default void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.util.List r3 = r0.getFieldWriters()
            int r4 = r3.size()
            r1.startArray(r4)
            r5 = 0
        Lc:
            if (r5 >= r4) goto L1a
            java.lang.Object r6 = r3.get(r5)
            com.alibaba.fastjson2.writer.FieldWriter r6 = (com.alibaba.fastjson2.writer.FieldWriter) r6
            r6.writeValue(r1, r2)
            int r5 = r5 + 1
            goto Lc
        L1a:
            return
    }

    default void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            r0.write(r1, r2, r3, r4, r5)
            return
    }

    default boolean writeTypeInfo(com.alibaba.fastjson2.JSONWriter r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    default void writeWithFilter(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9) {
            r7 = this;
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.writeWithFilter(r1, r2, r3, r4, r5)
            return
    }

    default void writeWithFilter(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
