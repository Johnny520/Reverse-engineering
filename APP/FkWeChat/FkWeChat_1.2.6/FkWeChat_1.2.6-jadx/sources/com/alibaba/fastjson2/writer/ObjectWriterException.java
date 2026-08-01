package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterException extends ObjectWriterAdapter<Exception> {
    public ObjectWriterException(Class cls, long j10, List<FieldWriter> list) {
        super(cls, null, null, j10, list);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j10);
            return;
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj);
            return;
        }
        jSONWriter.startObject();
        if ((jSONWriter.getFeatures(j10) & (JSONWriter.Feature.WriteClassName.mask | JSONWriter.Feature.WriteThrowableClassName.mask)) != 0) {
            writeTypeInfo(jSONWriter);
        }
        Iterator<FieldWriter> it = this.fieldWriters.iterator();
        while (it.hasNext()) {
            it.next().write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        writeClassInfo(jSONWriter);
        int size = this.fieldWriters.size();
        jSONWriter.startObject();
        for (int i10 = 0; i10 < size; i10++) {
            this.fieldWriters.get(i10).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }
}
