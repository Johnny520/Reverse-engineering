package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterBoolVal extends com.alibaba.fastjson2.writer.FieldWriterBoolean {
    public FieldWriterBoolVal(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterBoolean, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r6, java.lang.Object r7) {
            r5 = this;
            r0 = 0
            java.lang.Object r7 = r5.getFieldValue(r7)     // Catch: java.lang.RuntimeException -> L25
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.RuntimeException -> L25
            boolean r7 = r7.booleanValue()     // Catch: java.lang.RuntimeException -> L25
            if (r7 != 0) goto L20
            long r1 = r5.features
            long r3 = r6.getFeatures()
            long r1 = r1 | r3
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L20
            return r0
        L20:
            r5.writeBool(r6, r7)
            r6 = 1
            return r6
        L25:
            r7 = move-exception
            boolean r6 = r6.isIgnoreErrorGetter()
            if (r6 == 0) goto L2d
            return r0
        L2d:
            throw r7
    }
}
