package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListEnum extends ObjectWriterPrimitiveImpl {
    final Class defineClass;
    final Class enumType;
    final long features;
    byte[] typeNameJSONB;

    public ObjectWriterImplListEnum(Class cls, Class cls2, long j10) {
        this.defineClass = cls;
        this.enumType = cls2;
        this.features = j10;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        jSONWriter.startArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                jSONWriter.writeComma();
            }
            String str = (String) list.get(i10);
            if (str == null) {
                jSONWriter.writeNull();
            } else {
                jSONWriter.writeString(str);
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        JSONWriter jSONWriter2;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Class<?> cls = obj.getClass();
        if (jSONWriter.isWriteTypeInfo(obj) && this.defineClass != cls) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName(cls));
        }
        List list = TypeUtils.toList(obj);
        int size = list.size();
        jSONWriter.startArray(size);
        boolean zIsEnabled = jSONWriter.isEnabled(JSONWriter.Feature.WriteEnumUsingToString);
        int i10 = 0;
        while (i10 < size) {
            Enum r42 = (Enum) list.get(i10);
            if (r42 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = r42.getClass();
                if (cls2 != this.enumType) {
                    jSONWriter2 = jSONWriter;
                    jSONWriter.getObjectWriter(cls2).writeJSONB(jSONWriter2, r42, null, this.enumType, this.features | j10);
                } else {
                    jSONWriter2 = jSONWriter;
                    jSONWriter2.writeString(zIsEnabled ? r42.toString() : r42.name());
                }
            }
            i10++;
            jSONWriter = jSONWriter2;
        }
        jSONWriter.endArray();
    }
}
