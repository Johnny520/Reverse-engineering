package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWriterRootName<T> extends ObjectWriterAdapter<T> {
    final String rootName;

    public ObjectWriterRootName(Class<T> cls, String str, String str2, String str3, long j10, List<FieldWriter> list) {
        super(cls, str, str2, j10, list);
        this.rootName = str3;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter
    public JSONObject toJSONObject(T t10, long j10) {
        return JSONObject.m6194of(this.rootName, (Object) super.toJSONObject(t10, j10));
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        jSONWriter.startObject();
        jSONWriter.writeName(this.rootName);
        jSONWriter.writeColon();
        super.write(jSONWriter, obj, obj2, type, j10);
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        jSONWriter.startObject();
        jSONWriter.writeName(this.rootName);
        super.writeJSONB(jSONWriter, obj, obj2, type, j10);
        jSONWriter.endObject();
    }
}
