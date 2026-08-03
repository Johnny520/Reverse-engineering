package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplMapEntry extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplMapEntry INSTANCE = new ObjectWriterImplMapEntry();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            jSONWriter.writeNull();
            return;
        }
        jSONWriter.startObject();
        long features = jSONWriter.context.getFeatures();
        Object key = entry.getKey();
        if ((features & (JSONWriter.Feature.WriteNonStringKeyAsString.mask | JSONWriter.Feature.BrowserCompatible.mask)) != 0) {
            jSONWriter.writeAny(key.toString());
        } else {
            jSONWriter.writeAny(key);
        }
        jSONWriter.writeColon();
        jSONWriter.writeAny(entry.getValue());
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            jSONWriter.writeNull();
            return;
        }
        jSONWriter.startArray(2);
        long features = jSONWriter.context.getFeatures();
        Object key = entry.getKey();
        if ((features & (JSONWriter.Feature.WriteNonStringKeyAsString.mask | JSONWriter.Feature.BrowserCompatible.mask)) != 0) {
            jSONWriter.writeAny(key.toString());
        } else {
            jSONWriter.writeAny(key);
        }
        jSONWriter.writeAny(entry.getValue());
    }
}
