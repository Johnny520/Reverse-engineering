package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONPObject;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterImplJSONP extends ObjectWriterPrimitiveImpl<JSONPObject> {
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if ((jSONWriter.getFeatures(j10) & JSONWriter.Feature.BrowserSecure.mask) != 0) {
            jSONWriter.writeRaw("/**/");
        }
        JSONPObject jSONPObject = (JSONPObject) obj;
        jSONWriter.writeRaw(jSONPObject.getFunction());
        jSONWriter.writeRaw('(');
        List<Object> parameters = jSONPObject.getParameters();
        for (int i10 = 0; i10 < parameters.size(); i10++) {
            if (i10 != 0) {
                jSONWriter.writeRaw(',');
            }
            jSONWriter.writeAny(parameters.get(i10));
        }
        jSONWriter.writeRaw(')');
    }
}
