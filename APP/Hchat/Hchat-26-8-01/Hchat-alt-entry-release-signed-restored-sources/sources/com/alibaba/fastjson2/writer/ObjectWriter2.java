package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriter2<T> extends ObjectWriterAdapter<T> {
    public final FieldWriter fieldWriter0;
    public final FieldWriter fieldWriter1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter2(Class<T> cls, String str, String str2, long j3, List<FieldWriter> list) {
        super(cls, str, str2, j3, list);
        this.fieldWriter0 = list.get(0);
        this.fieldWriter1 = list.get(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public final FieldWriter getFieldWriter(long j3) {
        FieldWriter fieldWriter = this.fieldWriter0;
        if (j3 == fieldWriter.hashCode) {
            return fieldWriter;
        }
        FieldWriter fieldWriter2 = this.fieldWriter1;
        if (j3 == fieldWriter2.hashCode) {
            return fieldWriter2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        long features = this.features | j3 | jSONWriter.getFeatures();
        if (jSONWriter.jsonb) {
            if ((features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j3);
                return;
            } else {
                writeJSONB(jSONWriter, obj, obj2, type, j3);
                return;
            }
        }
        if ((JSONWriter.Feature.BeanToArray.mask & features) != 0) {
            writeArrayMapping(jSONWriter, obj, obj2, type, j3);
            return;
        }
        if (!this.serializable) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & features) != 0) {
                errorOnNoneSerializable();
                return;
            } else if ((features & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                jSONWriter.writeNull();
                return;
            }
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj, obj2, type, 0L);
            return;
        }
        jSONWriter.startObject();
        if (((this.features | j3) & JSONWriter.Feature.WriteClassName.mask) != 0 || jSONWriter.isWriteTypeInfo(obj, j3)) {
            writeTypeInfo(jSONWriter);
        }
        this.fieldWriter0.write(jSONWriter, obj);
        this.fieldWriter1.write(jSONWriter, obj);
        jSONWriter.endObject();
    }
}
