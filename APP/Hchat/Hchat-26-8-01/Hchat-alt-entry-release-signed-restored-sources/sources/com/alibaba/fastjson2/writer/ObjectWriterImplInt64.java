package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt64 extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt64 INSTANCE = new ObjectWriterImplInt64(null);
    final Class defineClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplInt64(Class cls) {
        this.defineClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        long jLongValue = ((Number) obj).longValue();
        JSONWriter.Feature feature = JSONWriter.Feature.WriteNonStringValueAsString;
        if ((feature.mask & j3) != 0) {
            jSONWriter.writeString(jLongValue);
            return;
        }
        jSONWriter.writeInt64(jLongValue);
        if (jLongValue < -2147483648L || jLongValue > 2147483647L) {
            return;
        }
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteClassName;
        if ((j3 & feature2.mask) != 0) {
            long features = jSONWriter.getFeatures();
            if ((feature2.mask & features) == 0 && ((feature.mask | JSONWriter.Feature.WriteLongAsString.mask) & features) == 0) {
                jSONWriter.writeRaw('L');
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        long jLongValue = ((Long) obj).longValue();
        if ((j3 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(jLongValue);
        } else {
            jSONWriter.writeInt64(jLongValue);
        }
    }
}
