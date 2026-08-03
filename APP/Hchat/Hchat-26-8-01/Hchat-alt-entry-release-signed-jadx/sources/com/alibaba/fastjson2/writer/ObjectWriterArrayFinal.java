package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterArrayFinal extends ObjectWriterPrimitiveImpl {
    public final DecimalFormat format;
    final Class itemClass;
    volatile ObjectWriter itemObjectWriter;
    public boolean refDetect;
    final byte[] typeNameBytes;
    final long typeNameHash;
    public static final ObjectWriterArrayFinal FLOAT_ARRAY = new ObjectWriterArrayFinal(Float.class, null);
    public static final ObjectWriterArrayFinal DOUBLE_ARRAY = new ObjectWriterArrayFinal(Double.class, null);
    public static final ObjectWriterArrayFinal DECIMAL_ARRAY = new ObjectWriterArrayFinal(BigDecimal.class, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterArrayFinal(Class cls, DecimalFormat decimalFormat) {
        this.itemClass = cls;
        this.format = decimalFormat;
        String str = "[" + TypeUtils.getTypeName(cls);
        this.typeNameBytes = JSONB.toBytes(str);
        this.typeNameHash = Fnv.hashCode64(str);
        this.refDetect = !ObjectWriterProvider.isNotReferenceDetect(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getItemObjectWriter(JSONWriter jSONWriter) {
        ObjectWriter objectWriter = this.itemObjectWriter;
        if (objectWriter != null) {
            return objectWriter;
        }
        Class cls = this.itemClass;
        ObjectWriter objectWriterImplFloat = cls == Float.class ? this.format != null ? new ObjectWriterImplFloat(this.format) : ObjectWriterImplFloat.INSTANCE : cls == Double.class ? this.format != null ? new ObjectWriterImplDouble(this.format) : ObjectWriterImplDouble.INSTANCE : cls == BigDecimal.class ? this.format != null ? new ObjectWriterImplBigDecimal(this.format, null) : ObjectWriterImplBigDecimal.INSTANCE : jSONWriter.getObjectWriter(cls);
        this.itemObjectWriter = objectWriterImplFloat;
        return objectWriterImplFloat;
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
        if (zIsRefDetect) {
            zIsRefDetect = this.refDetect;
        }
        Object[] objArr = (Object[]) obj;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < objArr.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Object obj3 = objArr[i9];
            if (obj3 == null) {
                jSONWriter.writeNull();
            } else {
                ObjectWriter itemObjectWriter = getItemObjectWriter(jSONWriter);
                if (!zIsRefDetect || (path = jSONWriter.setPath(i9, obj3)) == null) {
                    itemObjectWriter.write(jSONWriter, obj3, Integer.valueOf(i9), this.itemClass, j3);
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
        JSONWriter jSONWriter2;
        long j4;
        String path;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        if (zIsRefDetect) {
            zIsRefDetect = this.refDetect;
        }
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(this.typeNameBytes, this.typeNameHash);
        }
        jSONWriter.startArray(objArr.length);
        int i9 = 0;
        while (i9 < objArr.length) {
            Object obj3 = objArr[i9];
            if (obj3 == null) {
                jSONWriter.writeNull();
            } else {
                ObjectWriter itemObjectWriter = getItemObjectWriter(jSONWriter);
                if (!zIsRefDetect || (path = jSONWriter.setPath(i9, obj3)) == null) {
                    jSONWriter2 = jSONWriter;
                    j4 = j3;
                    itemObjectWriter.writeJSONB(jSONWriter2, obj3, Integer.valueOf(i9), this.itemClass, j4);
                    if (zIsRefDetect) {
                        jSONWriter2.popPath(obj3);
                    }
                    i9++;
                    jSONWriter = jSONWriter2;
                    j3 = j4;
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                }
            }
            jSONWriter2 = jSONWriter;
            j4 = j3;
            i9++;
            jSONWriter = jSONWriter2;
            j3 = j4;
        }
    }
}
