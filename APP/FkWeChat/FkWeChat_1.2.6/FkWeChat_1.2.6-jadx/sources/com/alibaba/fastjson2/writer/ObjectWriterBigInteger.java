package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterBigInteger implements ObjectWriter {
    static final ObjectWriterBigInteger INSTANCE = new ObjectWriterBigInteger(0);
    final long features;

    public ObjectWriterBigInteger(long j10) {
        this.features = j10;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeBigInt((BigInteger) obj, j10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeBigInt((BigInteger) obj, j10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeBigInt((BigInteger) obj, j10);
        }
    }
}
