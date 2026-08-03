package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt64Array extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt64Array INSTANCE = new ObjectWriterImplInt64Array();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Long");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Long");

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
        Long[] lArr = (Long[]) obj;
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < lArr.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Long l10 = lArr[i9];
            if (l10 == null) {
                jSONWriter.writeNull();
            } else {
                long jLongValue = l10.longValue();
                if (z9) {
                    jSONWriter.writeString(jLongValue);
                } else {
                    jSONWriter.writeInt64(jLongValue);
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
        Long[] lArr = (Long[]) obj;
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        jSONWriter.startArray(lArr.length);
        for (Long l10 : lArr) {
            if (l10 == null) {
                jSONWriter.writeNull();
            } else {
                long jLongValue = l10.longValue();
                if (z9) {
                    jSONWriter.writeString(jLongValue);
                } else {
                    jSONWriter.writeInt64(jLongValue);
                }
            }
        }
    }
}
