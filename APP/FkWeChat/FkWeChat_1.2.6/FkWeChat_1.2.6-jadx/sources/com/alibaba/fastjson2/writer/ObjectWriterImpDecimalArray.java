package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImpDecimalArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImpDecimalArray INSTANCE = new ObjectWriterImpDecimalArray();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[BigDecimal");

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
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
        for (int i10 = 0; i10 < bigDecimalArr.length; i10++) {
            if (i10 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeDecimal(bigDecimalArr[i10], 0L, null);
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
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, -2138534155605614069L);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        jSONWriter.startArray(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            jSONWriter.writeDecimal(bigDecimal, 0L, null);
        }
    }
}
