package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8Array extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt8Array INSTANCE = new ObjectWriterImplInt8Array();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Byte");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Byte");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Byte b10 = bArr[i9];
            if (b10 == null) {
                jSONWriter.writeNull();
            } else if (z9) {
                jSONWriter.writeString(b10.byteValue());
            } else {
                jSONWriter.writeInt8(b10.byteValue());
            }
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.startArray(bArr.length);
        for (Byte b10 : bArr) {
            if (b10 == null) {
                jSONWriter.writeNull();
            } else if (z9) {
                jSONWriter.writeString(b10.byteValue());
            } else {
                jSONWriter.writeInt8(b10.byteValue());
            }
        }
    }
}
