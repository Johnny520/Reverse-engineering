package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterArray INSTANCE = new ObjectWriterArray(Object.class);
    volatile ObjectWriter itemObjectWriter;
    final Type itemType;
    final byte[] typeNameBytes;
    final long typeNameHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterArray(Type type) {
        this.itemType = type;
        if (type == Object.class) {
            this.typeNameBytes = JSONB.toBytes("[O");
            this.typeNameHash = Fnv.hashCode64("[0");
            return;
        }
        String str = "[" + TypeUtils.getTypeName((Class) type);
        this.typeNameBytes = JSONB.toBytes(str);
        this.typeNameHash = Fnv.hashCode64(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        String path;
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j3);
            return;
        }
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        Object[] objArr = (Object[]) obj;
        jSONWriter.startArray();
        Class<?> cls = null;
        ObjectWriter objectWriter = null;
        for (int i9 = 0; i9 < objArr.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Object obj3 = objArr[i9];
            if (obj3 == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    zIsRefDetect = jSONWriter.isRefDetect();
                    objectWriter = jSONWriter.getObjectWriter(cls2);
                    if (zIsRefDetect) {
                        zIsRefDetect = !ObjectWriterProvider.isNotReferenceDetect(cls2);
                    }
                    cls = cls2;
                }
                if (!zIsRefDetect || (path = jSONWriter.setPath(i9, obj3)) == null) {
                    objectWriter.write(jSONWriter, obj3, Integer.valueOf(i9), this.itemType, j3);
                    if (zIsRefDetect) {
                        jSONWriter.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                }
            }
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        String path;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(this.typeNameBytes, this.typeNameHash);
        }
        jSONWriter.startArray(objArr.length);
        Class<?> cls = null;
        int i9 = 0;
        boolean zIsRefDetect2 = zIsRefDetect;
        ObjectWriter objectWriter2 = null;
        while (i9 < objArr.length) {
            Object obj3 = objArr[i9];
            if (obj3 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 == cls) {
                    objectWriter = objectWriter2;
                } else {
                    zIsRefDetect2 = jSONWriter.isRefDetect();
                    ObjectWriter objectWriter3 = jSONWriter.getObjectWriter(cls2);
                    if (zIsRefDetect2) {
                        zIsRefDetect2 = !ObjectWriterProvider.isNotReferenceDetect(cls2);
                    }
                    objectWriter = objectWriter3;
                    cls = cls2;
                }
                if (!zIsRefDetect2 || (path = jSONWriter.setPath(i9, obj3)) == null) {
                    jSONWriter2 = jSONWriter;
                    objectWriter.writeJSONB(jSONWriter2, obj3, Integer.valueOf(i9), this.itemType, 0L);
                    if (zIsRefDetect2) {
                        jSONWriter2.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                    jSONWriter2 = jSONWriter;
                }
                objectWriter2 = objectWriter;
            }
            i9++;
            jSONWriter = jSONWriter2;
        }
    }
}
