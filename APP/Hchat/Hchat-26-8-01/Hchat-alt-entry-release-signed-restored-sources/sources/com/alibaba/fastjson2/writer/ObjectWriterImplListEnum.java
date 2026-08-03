package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListEnum extends ObjectWriterPrimitiveImpl {
    final Class defineClass;
    final Class enumType;
    final long features;
    byte[] typeNameJSONB;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplListEnum(Class cls, Class cls2, long j3) {
        this.defineClass = cls;
        this.enumType = cls2;
        this.features = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        jSONWriter.startArray();
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            String str = (String) list.get(i9);
            if (str == null) {
                jSONWriter.writeNull();
            } else {
                jSONWriter.writeString(str);
            }
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        JSONWriter jSONWriter2;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Class<?> cls = obj.getClass();
        if (jSONWriter.isWriteTypeInfo(obj) && this.defineClass != cls) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) cls));
        }
        List list = TypeUtils.toList(obj);
        int size = list.size();
        jSONWriter.startArray(size);
        boolean zIsEnabled = jSONWriter.isEnabled(JSONWriter.Feature.WriteEnumUsingToString);
        int i9 = 0;
        while (i9 < size) {
            Enum r42 = (Enum) list.get(i9);
            if (r42 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = r42.getClass();
                if (cls2 != this.enumType) {
                    jSONWriter2 = jSONWriter;
                    jSONWriter.getObjectWriter(cls2).writeJSONB(jSONWriter2, r42, null, this.enumType, this.features | j3);
                } else {
                    jSONWriter2 = jSONWriter;
                    jSONWriter2.writeString(zIsEnabled ? r42.toString() : r42.name());
                }
            }
            i9++;
            jSONWriter = jSONWriter2;
        }
        jSONWriter.endArray();
    }
}
