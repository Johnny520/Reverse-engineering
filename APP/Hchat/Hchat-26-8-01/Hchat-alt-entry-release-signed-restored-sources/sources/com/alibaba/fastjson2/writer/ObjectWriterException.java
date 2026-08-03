package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterException extends ObjectWriterAdapter<Exception> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterException(Class cls, long j3, List<FieldWriter> list) {
        super(cls, null, null, j3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j3);
            return;
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj);
            return;
        }
        jSONWriter.startObject();
        if ((jSONWriter.getFeatures(j3) & (JSONWriter.Feature.WriteClassName.mask | JSONWriter.Feature.WriteThrowableClassName.mask)) != 0) {
            writeTypeInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.fieldWriters.get(i9).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        writeClassInfo(jSONWriter);
        int size = this.fieldWriters.size();
        jSONWriter.startObject();
        for (int i9 = 0; i9 < size; i9++) {
            this.fieldWriters.get(i9).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }
}
