package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8Array extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt8Array INSTANCE = new ObjectWriterImplInt8Array();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Byte");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Byte");

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.startArray();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 != 0) {
                jSONWriter.writeComma();
            }
            Byte b10 = bArr[i10];
            if (b10 == null) {
                jSONWriter.writeNull();
            } else {
                byte bByteValue = b10.byteValue();
                if (z10) {
                    jSONWriter.writeString(bByteValue);
                } else {
                    jSONWriter.writeInt8(bByteValue);
                }
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.startArray(bArr.length);
        for (Byte b10 : bArr) {
            if (b10 == null) {
                jSONWriter.writeNull();
            } else {
                byte bByteValue = b10.byteValue();
                if (z10) {
                    jSONWriter.writeString(bByteValue);
                } else {
                    jSONWriter.writeInt8(bByteValue);
                }
            }
        }
    }
}
