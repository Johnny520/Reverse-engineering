package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCurrency extends ObjectWriterPrimitiveImpl {
    final Class defineClass;
    static final ObjectWriterImplCurrency INSTANCE = new ObjectWriterImplCurrency(null);
    static final ObjectWriterImplCurrency INSTANCE_FOR_FIELD = new ObjectWriterImplCurrency(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes(TypeUtils.getTypeName(Currency.class));
    static final long JSONB_TYPE_HASH = Fnv.hashCode64(TypeUtils.getTypeName(Currency.class));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplCurrency(Class cls) {
        this.defineClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j3);
        } else if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeString(((Currency) obj).getCurrencyCode());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Currency currency = (Currency) obj;
        if (jSONWriter.isWriteTypeInfo(currency) && this.defineClass == null) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        jSONWriter.writeString(currency.getCurrencyCode());
    }
}
