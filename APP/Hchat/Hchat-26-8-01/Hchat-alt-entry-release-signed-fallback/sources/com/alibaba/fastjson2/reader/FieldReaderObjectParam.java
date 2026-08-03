package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderObjectParam<T> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    final java.lang.String paramName;
    final long paramNameHash;

    public FieldReaderObjectParam(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, java.lang.String r17, int r18, long r19, java.lang.String r21, java.util.Locale r22, java.lang.Object r23) {
            r13 = this;
            r11 = 0
            r12 = 0
            r10 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r14 = r17
            r13.paramName = r14
            long r14 = com.alibaba.fastjson2.util.Fnv.hashCode64(r14)
            r13.paramNameHash = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperationException"
            r1.<init>(r2)
            throw r1
    }
}
