package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListStr extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplListStr INSTANCE = new ObjectWriterImplListStr();

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
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Class<List> cls;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        if (type == TypeUtils.PARAM_TYPE_LIST_STR) {
            cls = List.class;
        } else if (type instanceof Class) {
            cls = (Class) type;
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            cls = rawType instanceof Class ? (Class) rawType : null;
        }
        Class<?> cls2 = obj.getClass();
        if (cls2 != ArrayList.class && jSONWriter.isWriteTypeInfo(obj, (Class) cls, j3)) {
            if (cls2 == ObjectWriterImplList.CLASS_SUBLIST) {
                cls2 = ArrayList.class;
            }
            jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) cls2));
        }
        jSONWriter.writeString(TypeUtils.toList(obj));
    }
}
