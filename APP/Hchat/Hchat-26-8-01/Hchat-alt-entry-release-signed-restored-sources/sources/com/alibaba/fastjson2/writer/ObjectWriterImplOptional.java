package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOptional extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplOptional INSTANCE = new ObjectWriterImplOptional(null, null);
    long features;
    final String format;
    final Locale locale;
    Type valueType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplOptional(Type type, String str, Locale locale) {
        this.valueType = type;
        this.format = str;
        this.locale = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectWriterImplOptional m1788of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectWriterImplOptional(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            jSONWriter.writeNull();
            return;
        }
        Object obj3 = optional.get();
        Class<?> cls = obj3.getClass();
        String str = this.format;
        ObjectWriter objectWriter = str != null ? FieldWriter.getObjectWriter(null, null, str, this.locale, cls) : null;
        if (objectWriter == null) {
            objectWriter = jSONWriter.getObjectWriter(cls);
        }
        objectWriter.write(jSONWriter, obj3, obj2, this.valueType, this.features);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            jSONWriter.writeNull();
        } else {
            Object obj3 = optional.get();
            jSONWriter.getObjectWriter(obj3.getClass()).writeJSONB(jSONWriter, obj3, obj2, null, j3);
        }
    }

    public ObjectWriterImplOptional(String str, Locale locale) {
        this.format = str;
        this.locale = locale;
    }
}
