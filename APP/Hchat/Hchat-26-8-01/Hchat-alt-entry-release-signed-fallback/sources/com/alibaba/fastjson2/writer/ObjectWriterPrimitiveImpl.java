package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectWriterPrimitiveImpl<T> implements com.alibaba.fastjson2.writer.ObjectWriter<T> {
    public ObjectWriterPrimitiveImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.function.Function getFunction() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMapping(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
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

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.writeJSONB(r1, r2, r3, r4, r5)
            return
    }
}
