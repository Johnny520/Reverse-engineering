package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterObjectArrayField<T> extends FieldWriter<T> {
    final Class itemClass;
    ObjectWriter itemObjectWriter;
    final Type itemType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterObjectArrayField(String str, Type type, int i9, long j3, String str2, String str3, Type type2, Class cls, Field field) {
        super(str, i9, j3, str2, str3, type2, cls, field, null);
        this.itemType = type;
        if (type instanceof Class) {
            this.itemClass = (Class) type;
        } else {
            this.itemClass = TypeUtils.getMapping(type);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        if (type != null && type != this.itemType) {
            return jSONWriter.getObjectWriter(type, TypeUtils.getClass(type));
        }
        ObjectWriter objectWriter = this.itemObjectWriter;
        if (objectWriter != null) {
            return objectWriter;
        }
        if (type == Double.class) {
            this.itemObjectWriter = new ObjectWriterImplDouble(new DecimalFormat(this.format));
        } else if (type == Float.class) {
            this.itemObjectWriter = new ObjectWriterImplFloat(new DecimalFormat(this.format));
        } else if (type != BigDecimal.class || this.decimalFormat == null) {
            this.itemObjectWriter = jSONWriter.getObjectWriter(this.itemType, this.itemClass);
        } else {
            this.itemObjectWriter = new ObjectWriterImplBigDecimal(this.decimalFormat, null);
        }
        return this.itemObjectWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == String[].class ? ObjectWriterImplStringArray.INSTANCE : cls == Float[].class ? this.decimalFormat != null ? new ObjectWriterArrayFinal(Float.class, this.decimalFormat) : ObjectWriterArrayFinal.FLOAT_ARRAY : cls == Double[].class ? this.decimalFormat != null ? new ObjectWriterArrayFinal(Double.class, this.decimalFormat) : ObjectWriterArrayFinal.DOUBLE_ARRAY : cls == BigDecimal[].class ? this.decimalFormat != null ? new ObjectWriterArrayFinal(BigDecimal.class, this.decimalFormat) : ObjectWriterArrayFinal.DECIMAL_ARRAY : jSONWriter.getObjectWriter(cls);
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
        JSONWriter jSONWriter2 = jSONWriter;
        long features = jSONWriter.getFeatures() | this.features;
        boolean z11 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        if (z9) {
            if (objArr.length == 0 && (JSONWriter.Feature.NotWriteEmptyArray.mask & features) != 0) {
                return;
            } else {
                writeFieldName(jSONWriter);
            }
        }
        if (z11 && (path2 = jSONWriter.setPath(this.fieldName, objArr)) != null) {
            jSONWriter.writeReference(path2);
            return;
        }
        Class<?> cls3 = null;
        if (!jSONWriter2.jsonb) {
            jSONWriter.startArray();
            int i9 = 0;
            ObjectWriter itemWriter = null;
            while (i9 < objArr.length) {
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
                    itemWriter.write(jSONWriter2, obj, Integer.valueOf(i9), this.fieldType, features);
                    cls3 = cls;
                }
                i9++;
                jSONWriter2 = jSONWriter;
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
        boolean z12 = z11;
        for (int i10 = 0; i10 < length; i10++) {
            boolean z13 = z12;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                jSONWriter.writeNull();
                z12 = z13;
            } else {
                Class<?> cls6 = obj2.getClass();
                if (cls6 != cls3) {
                    boolean zIsRefDetect = jSONWriter.isRefDetect();
                    ObjectWriter itemWriter2 = getItemWriter(jSONWriter, cls6);
                    if (zIsRefDetect) {
                        zIsRefDetect = !ObjectWriterProvider.isNotReferenceDetect(cls6);
                    }
                    z10 = zIsRefDetect;
                    objectWriter = itemWriter2;
                    cls2 = cls6;
                } else {
                    cls2 = cls3;
                    z10 = z13;
                }
                if (!z10 || (path = jSONWriter.setPath(i10, obj2)) == null) {
                    objectWriter.writeJSONB(jSONWriter2, obj2, Integer.valueOf(i10), this.itemType, this.features);
                    if (z10) {
                        jSONWriter.popPath(obj2);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj2);
                }
                z12 = z10;
                cls3 = cls2;
            }
        }
        if (z11) {
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
