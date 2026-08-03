package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterObjectArrayMethod<T> extends FieldWriter<T> {
    final Class itemClass;
    ObjectWriter itemObjectWriter;
    final Type itemType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterObjectArrayMethod(String str, Type type, int i9, long j3, String str2, String str3, Type type2, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type2, cls, field, method);
        this.itemType = type;
        if (type instanceof Class) {
            this.itemClass = (Class) type;
        } else {
            this.itemClass = TypeUtils.getMapping(type);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        try {
            return this.method.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            C0086a.m456o("field.get error, ", this.fieldName, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        if (type != null && type != this.itemType) {
            return jSONWriter.getObjectWriter(type, null);
        }
        ObjectWriter objectWriter = this.itemObjectWriter;
        if (objectWriter != null) {
            return objectWriter;
        }
        if (type == Float[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(Float.class, this.decimalFormat) : ObjectWriterArrayFinal.FLOAT_ARRAY;
        }
        if (type == Double[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(Double.class, this.decimalFormat) : ObjectWriterArrayFinal.DOUBLE_ARRAY;
        }
        if (type == BigDecimal[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(BigDecimal.class, this.decimalFormat) : ObjectWriterArrayFinal.DECIMAL_ARRAY;
        }
        if (type == Float.class) {
            return this.decimalFormat != null ? new ObjectWriterImplFloat(this.decimalFormat) : ObjectWriterImplFloat.INSTANCE;
        }
        if (type == Double.class) {
            return this.decimalFormat != null ? new ObjectWriterImplDouble(this.decimalFormat) : ObjectWriterImplDouble.INSTANCE;
        }
        if (type == BigDecimal.class) {
            return this.decimalFormat != null ? new ObjectWriterImplBigDecimal(this.decimalFormat, null) : ObjectWriterImplBigDecimal.INSTANCE;
        }
        ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(this.itemType, this.itemClass);
        this.itemObjectWriter = objectWriter2;
        return objectWriter2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        Object[] objArr = (Object[]) getFieldValue(t9);
        if (objArr != null) {
            writeArray(jSONWriter, true, objArr);
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeArrayNull();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeArray(JSONWriter jSONWriter, boolean z9, Object[] objArr) {
        Class<?> cls;
        Class<?> cls2;
        boolean z10;
        String path;
        String path2;
        if (z9) {
            writeFieldName(jSONWriter);
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        if (zIsRefDetect && (path2 = jSONWriter.setPath(this.fieldName, objArr)) != null) {
            jSONWriter.writeReference(path2);
            return;
        }
        Class<?> cls3 = null;
        if (!jSONWriter.jsonb) {
            jSONWriter.startArray();
            ObjectWriter itemWriter = null;
            for (int i9 = 0; i9 < objArr.length; i9++) {
                if (i9 != 0) {
                    jSONWriter.writeComma();
                }
                Object obj = objArr[i9];
                if (obj == null) {
                    jSONWriter.writeNull();
                } else {
                    Class<?> cls4 = obj.getClass();
                    if (cls4 == cls3) {
                        cls = cls3;
                    } else {
                        itemWriter = getItemWriter(jSONWriter, cls4);
                        cls = cls4;
                    }
                    itemWriter.write(jSONWriter, obj, null, null, this.features);
                    cls3 = cls;
                }
            }
            jSONWriter.endArray();
            return;
        }
        Class<?> cls5 = objArr.getClass();
        if (cls5 != this.fieldClass) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) cls5));
        }
        int length = objArr.length;
        jSONWriter.startArray(length);
        ObjectWriter objectWriter = null;
        boolean z11 = zIsRefDetect;
        for (int i10 = 0; i10 < length; i10++) {
            boolean z12 = z11;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                jSONWriter.writeNull();
                z11 = z12;
            } else {
                Class<?> cls6 = obj2.getClass();
                if (cls6 != cls3) {
                    boolean zIsRefDetect2 = jSONWriter.isRefDetect();
                    ObjectWriter itemWriter2 = getItemWriter(jSONWriter, cls6);
                    if (zIsRefDetect2) {
                        zIsRefDetect2 = !ObjectWriterProvider.isNotReferenceDetect(cls6);
                    }
                    z10 = zIsRefDetect2;
                    objectWriter = itemWriter2;
                    cls2 = cls6;
                } else {
                    cls2 = cls3;
                    z10 = z12;
                }
                if (!z10 || (path = jSONWriter.setPath(i10, obj2)) == null) {
                    objectWriter.writeJSONB(jSONWriter, obj2, Integer.valueOf(i10), this.itemType, this.features);
                    if (z10) {
                        jSONWriter.popPath(obj2);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj2);
                }
                z11 = z10;
                cls3 = cls2;
            }
        }
        if (zIsRefDetect) {
            jSONWriter.popPath(objArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Object[] objArr = (Object[]) getFieldValue(t9);
        if (objArr == null) {
            jSONWriter.writeNull();
        } else {
            writeArray(jSONWriter, false, objArr);
        }
    }
}
