package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.OptionalDouble;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOptionalDouble extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplOptionalDouble INSTANCE = new ObjectWriterImplOptionalDouble();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        if (optionalDouble.isPresent()) {
            jSONWriter.writeDouble(optionalDouble.getAsDouble());
        } else {
            jSONWriter.writeNull();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        if (optionalDouble.isPresent()) {
            jSONWriter.writeDouble(optionalDouble.getAsDouble());
        } else {
            jSONWriter.writeNull();
        }
    }
}
