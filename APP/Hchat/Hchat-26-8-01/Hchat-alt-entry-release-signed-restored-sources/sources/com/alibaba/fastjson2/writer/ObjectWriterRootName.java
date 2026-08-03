package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWriterRootName<T> extends ObjectWriterAdapter<T> {
    final String rootName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterRootName(Class<T> cls, String str, String str2, String str3, long j3, List<FieldWriter> list) {
        super(cls, str, str2, j3, list);
        this.rootName = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter
    public JSONObject toJSONObject(T t9, long j3) {
        return JSONObject.m1647of(this.rootName, (Object) super.toJSONObject(t9, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        jSONWriter.startObject();
        jSONWriter.writeName(this.rootName);
        jSONWriter.writeColon();
        super.write(jSONWriter, obj, obj2, type, j3);
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        jSONWriter.startObject();
        jSONWriter.writeName(this.rootName);
        super.writeJSONB(jSONWriter, obj, obj2, type, j3);
        jSONWriter.endObject();
    }
}
