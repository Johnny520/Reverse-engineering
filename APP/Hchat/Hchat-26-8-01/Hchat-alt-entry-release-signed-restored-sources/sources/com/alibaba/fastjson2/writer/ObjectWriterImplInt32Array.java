package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt32Array extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt32Array INSTANCE = new ObjectWriterImplInt32Array();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Integer");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Integer");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            if (!jSONWriter.isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) {
                jSONWriter.writeNull();
                return;
            } else {
                jSONWriter.startArray();
                jSONWriter.endArray();
                return;
            }
        }
        Integer[] numArr = (Integer[]) obj;
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < numArr.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Integer num = numArr[i9];
            if (num == null) {
                jSONWriter.writeNull();
            } else {
                int iIntValue = num.intValue();
                if (z9) {
                    jSONWriter.writeString(iIntValue);
                } else {
                    jSONWriter.writeInt32(iIntValue);
                }
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
        Integer[] numArr = (Integer[]) obj;
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        jSONWriter.startArray(numArr.length);
        for (Integer num : numArr) {
            if (num == null) {
                jSONWriter.writeNull();
            } else {
                int iIntValue = num.intValue();
                if (z9) {
                    jSONWriter.writeString(iIntValue);
                } else {
                    jSONWriter.writeInt32(iIntValue);
                }
            }
        }
    }
}
