package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImpDecimalArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImpDecimalArray INSTANCE = new ObjectWriterImpDecimalArray();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[BigDecimal");

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
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < bigDecimalArr.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeDecimal(bigDecimalArr[i9], 0L, null);
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
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, -2138534155605614069L);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        jSONWriter.startArray(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            jSONWriter.writeDecimal(bigDecimal, 0L, null);
        }
    }
}
