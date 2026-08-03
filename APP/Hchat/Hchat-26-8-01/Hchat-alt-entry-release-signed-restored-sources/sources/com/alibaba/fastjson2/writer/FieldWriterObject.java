package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p012ah.C0086a;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldWriterObject<T> extends FieldWriter<T> {
    static final AtomicReferenceFieldUpdater<FieldWriterObject, Class> initValueClassUpdater = AtomicReferenceFieldUpdater.newUpdater(FieldWriterObject.class, Class.class, "initValueClass");
    final boolean array;
    volatile Class initValueClass;
    final boolean number;
    final boolean unwrapped;
    protected boolean writeUsing;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterObject(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type, cls, field, method);
        this.unwrapped = (j3 & FieldInfo.UNWRAPPED_MASK) != 0;
        if (cls == Currency.class) {
            this.initValueClass = cls;
            this.initObjectWriter = ObjectWriterImplCurrency.INSTANCE_FOR_FIELD;
        }
        this.array = cls.isArray() || Collection.class.isAssignableFrom(cls) || cls == AtomicLongArray.class || cls == AtomicIntegerArray.class;
        this.number = Number.class.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectWriter getObjectWriterTypeMatch(JSONWriter jSONWriter, Class cls) {
        ObjectWriter objectWriterM1785of = Map.class.isAssignableFrom(cls) ? this.fieldClass.isAssignableFrom(cls) ? ObjectWriterImplMap.m1785of(this.fieldType, cls) : ObjectWriterImplMap.m1783of(cls) : jSONWriter.getObjectWriter(cls);
        AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater = FieldWriter.initObjectWriterUpdater;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, objectWriterM1785of)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return objectWriterM1785of;
            }
        }
        return objectWriterM1785of;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectWriter getObjectWriterTypeNotMatch(JSONWriter jSONWriter, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return this.fieldClass.isAssignableFrom(cls) ? ObjectWriterImplMap.m1785of(this.fieldType, cls) : ObjectWriterImplMap.m1783of(cls);
        }
        String str = this.format;
        ObjectWriter objectWriter = str != null ? FieldWriter.getObjectWriter(this.fieldType, this.fieldClass, str, null, cls) : null;
        return objectWriter == null ? jSONWriter.getObjectWriter(cls) : objectWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectWriter getObjectWriterVoid(JSONWriter jSONWriter, Class cls) {
        ObjectWriter objectWriterImplDoubleValueArray;
        boolean z9 = false;
        if (this.format == null) {
            JSONWriter.Context context = jSONWriter.context;
            objectWriterImplDoubleValueArray = context.provider.getObjectWriterFromCache(cls, cls, ((this.features | context.getFeatures()) & JSONWriter.Feature.FieldBased.mask) != 0);
        } else {
            objectWriterImplDoubleValueArray = null;
        }
        DecimalFormat decimalFormat = this.decimalFormat;
        if (cls == Float[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterArrayFinal(Float.class, decimalFormat) : ObjectWriterArrayFinal.FLOAT_ARRAY;
        } else if (cls == Double[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterArrayFinal(Double.class, decimalFormat) : ObjectWriterArrayFinal.DOUBLE_ARRAY;
        } else if (cls == float[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterImplFloatValueArray(decimalFormat) : ObjectWriterImplFloatValueArray.INSTANCE;
        } else if (cls == double[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterImplDoubleValueArray(decimalFormat) : ObjectWriterImplDoubleValueArray.INSTANCE;
        }
        if (objectWriterImplDoubleValueArray == null) {
            objectWriterImplDoubleValueArray = FieldWriter.getObjectWriter(this.fieldType, this.fieldClass, this.format, null, cls);
        }
        if (objectWriterImplDoubleValueArray != null) {
            if (this.initObjectWriter == null) {
                AtomicReferenceFieldUpdater<FieldWriterObject, Class> atomicReferenceFieldUpdater = initValueClassUpdater;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cls)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater2 = FieldWriter.initObjectWriterUpdater;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, objectWriterImplDoubleValueArray)) {
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        return objectWriterImplDoubleValueArray;
                    }
                }
                return objectWriterImplDoubleValueArray;
            }
            return objectWriterImplDoubleValueArray;
        }
        AtomicReferenceFieldUpdater<FieldWriterObject, Class> atomicReferenceFieldUpdater3 = initValueClassUpdater;
        while (true) {
            if (atomicReferenceFieldUpdater3.compareAndSet(this, null, cls)) {
                z9 = true;
                break;
            }
            if (atomicReferenceFieldUpdater3.get(this) != null) {
                break;
            }
        }
        ObjectWriter objectWriter = jSONWriter.getObjectWriter(cls);
        if (z9) {
            AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater4 = FieldWriter.initObjectWriterUpdater;
            while (!atomicReferenceFieldUpdater4.compareAndSet(this, null, objectWriter)) {
                if (atomicReferenceFieldUpdater4.get(this) != null) {
                }
            }
            return objectWriter;
        }
        return objectWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean typeMatch(Class cls, Class cls2) {
        if (cls == Integer.TYPE && cls2 == Integer.class) {
            return true;
        }
        if (cls == Long.TYPE && cls2 == Long.class) {
            return true;
        }
        if (cls == Boolean.TYPE && cls2 == Boolean.class) {
            return true;
        }
        if (cls == Short.TYPE && cls2 == Short.class) {
            return true;
        }
        if (cls == Byte.TYPE && cls2 == Byte.class) {
            return true;
        }
        if (cls == Float.TYPE && cls2 == Float.class) {
            return true;
        }
        if (cls == Double.TYPE && cls2 == Double.class) {
            return true;
        }
        return cls == Character.TYPE && cls2 == Character.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean writeInternal(JSONWriter jSONWriter, T t9) {
        boolean z9;
        ObjectWriter objectWriter;
        Field field;
        Class cls;
        long features = jSONWriter.getFeatures() | this.features;
        if (!this.fieldClassSerializable && (JSONWriter.Feature.IgnoreNoneSerializable.mask & features) != 0) {
            return false;
        }
        if (this.backReference && jSONWriter.containsReference(t9)) {
            return false;
        }
        try {
            Object fieldValue = getFieldValue(t9);
            if (fieldValue == null) {
                if (!((JSONWriter.Feature.WriteNulls.mask & features) == 0 && ((JSONWriter.Feature.NullAsDefaultValue.mask & features) == 0 || this.number)) && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) == 0) {
                    writeFieldName(jSONWriter);
                    if (this.array) {
                        jSONWriter.writeArrayNull();
                    } else if (this.number) {
                        jSONWriter.writeNumberNull();
                    } else {
                        Class<?> cls2 = this.fieldClass;
                        if (cls2 == Appendable.class || cls2 == StringBuffer.class || cls2 == StringBuilder.class) {
                            jSONWriter.writeStringNull();
                        } else {
                            jSONWriter.writeObjectNull(cls2);
                        }
                    }
                    return true;
                }
                long j3 = JSONWriter.Feature.WriteNullNumberAsZero.mask;
                long j4 = JSONWriter.Feature.NullAsDefaultValue.mask;
                if (((j3 | j4) & features) != 0 && this.number) {
                    writeFieldName(jSONWriter);
                    jSONWriter.writeInt32(0);
                    return true;
                }
                if ((features & (JSONWriter.Feature.WriteNullBooleanAsFalse.mask | j4)) == 0 || !((cls = this.fieldClass) == Boolean.class || cls == AtomicBoolean.class)) {
                    return false;
                }
                writeFieldName(jSONWriter);
                jSONWriter.writeBool(false);
                return true;
            }
            if (fieldValue == t9 && this.fieldClass == Throwable.class && (field = this.field) != null && field.getDeclaringClass() == Throwable.class) {
                return false;
            }
            if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & features) != 0 && !(fieldValue instanceof Serializable)) {
                return false;
            }
            if ((JSONWriter.Feature.IgnoreEmpty.mask & features) != 0) {
                if ((fieldValue instanceof Collection) && ((Collection) fieldValue).isEmpty()) {
                    return false;
                }
                if ((fieldValue instanceof Map) && ((Map) fieldValue).isEmpty()) {
                    return false;
                }
            }
            boolean zIsRefDetect = jSONWriter.isRefDetect(fieldValue);
            if (zIsRefDetect) {
                if (fieldValue == t9) {
                    writeFieldName(jSONWriter);
                    jSONWriter.writeReference("..");
                    return true;
                }
                String path = jSONWriter.setPath(this, fieldValue);
                if (path != null) {
                    writeFieldName(jSONWriter);
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(fieldValue);
                    return true;
                }
            }
            Class<?> cls3 = fieldValue.getClass();
            if (cls3 == byte[].class) {
                writeBinary(jSONWriter, (byte[]) fieldValue);
                return true;
            }
            ObjectWriter objectWriter2 = getObjectWriter(jSONWriter, cls3);
            if (objectWriter2 == null) {
                C0086a.m464w(AbstractC3199a.m6838k(cls3, "get objectWriter error : "));
                return false;
            }
            if (this.unwrapped) {
                boolean zWriteWithUnwrapped = writeWithUnwrapped(jSONWriter, fieldValue, features, zIsRefDetect, objectWriter2);
                fieldValue = fieldValue;
                z9 = zIsRefDetect;
                objectWriter = objectWriter2;
                if (zWriteWithUnwrapped) {
                    return true;
                }
            } else {
                z9 = zIsRefDetect;
                objectWriter = objectWriter2;
            }
            writeFieldName(jSONWriter);
            boolean z10 = jSONWriter.jsonb;
            long j5 = this.features;
            if ((JSONWriter.Feature.BeanToArray.mask & j5) != 0) {
                String str = this.fieldName;
                if (z10) {
                    objectWriter.writeArrayMappingJSONB(jSONWriter, fieldValue, str, this.fieldType, j5);
                } else {
                    objectWriter.writeArrayMapping(jSONWriter, fieldValue, str, this.fieldType, j5);
                }
            } else {
                String str2 = this.fieldName;
                if (z10) {
                    objectWriter.writeJSONB(jSONWriter, fieldValue, str2, this.fieldType, j5);
                } else {
                    objectWriter.write(jSONWriter, fieldValue, str2, this.fieldType, j5);
                }
            }
            if (z9) {
                jSONWriter.popPath(fieldValue);
            }
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getInitWriter() {
        return this.initObjectWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        Class cls2 = this.initValueClass;
        if (cls2 == null || this.initObjectWriter == ObjectWriterProvider.VoidObjectWriter.INSTANCE) {
            return getObjectWriterVoid(jSONWriter, cls);
        }
        boolean zTypeMatch = cls2 == cls || (this.writeUsing && cls2.isAssignableFrom(cls)) || ((cls2 == Map.class && cls2.isAssignableFrom(cls)) || (cls2 == List.class && cls2.isAssignableFrom(cls)));
        if (!zTypeMatch && cls2.isPrimitive()) {
            zTypeMatch = typeMatch(cls2, cls);
        }
        return zTypeMatch ? this.initObjectWriter == null ? getObjectWriterTypeMatch(jSONWriter, cls) : this.initObjectWriter : getObjectWriterTypeNotMatch(jSONWriter, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean unwrapped() {
        return this.unwrapped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        JSONWriter.Context context = jSONWriter.context;
        long features = context.getFeatures();
        context.setFeatures(this.features | features);
        boolean zWriteInternal = writeInternal(jSONWriter, t9);
        context.setFeatures(features);
        return zWriteInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        Object fieldValue = getFieldValue(t9);
        if (fieldValue == null) {
            jSONWriter.writeNull();
            return;
        }
        Class<?> cls = fieldValue.getClass();
        if (this.initValueClass == null) {
            this.initValueClass = cls;
            objectWriter = getObjectWriter(jSONWriter, cls);
            AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater = FieldWriter.initObjectWriterUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, objectWriter) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        } else {
            objectWriter = this.initValueClass == cls ? this.initObjectWriter : jSONWriter.getObjectWriter(cls);
        }
        if (objectWriter == null) {
            C0086a.m464w(AbstractC3199a.m6838k(cls, "get value writer error, valueType : "));
            return;
        }
        boolean z9 = jSONWriter.isRefDetect() && !ObjectWriterProvider.isNotReferenceDetect(cls);
        if (z9) {
            if (fieldValue == t9) {
                jSONWriter.writeReference("..");
                return;
            }
            String path = jSONWriter.setPath(this.fieldName, fieldValue);
            if (path != null) {
                jSONWriter.writeReference(path);
                jSONWriter.popPath(fieldValue);
                return;
            }
        }
        if (jSONWriter.jsonb) {
            boolean zIsBeanToArray = jSONWriter.isBeanToArray();
            String str = this.fieldName;
            if (zIsBeanToArray) {
                ObjectWriter objectWriter2 = objectWriter;
                jSONWriter2 = jSONWriter;
                objectWriter2.writeArrayMappingJSONB(jSONWriter2, fieldValue, str, this.fieldClass, this.features);
            } else {
                ObjectWriter objectWriter3 = objectWriter;
                jSONWriter2 = jSONWriter;
                objectWriter3.writeJSONB(jSONWriter2, fieldValue, str, this.fieldClass, this.features);
            }
        } else {
            ObjectWriter objectWriter4 = objectWriter;
            jSONWriter2 = jSONWriter;
            objectWriter4.write(jSONWriter2, fieldValue, this.fieldName, this.fieldClass, this.features);
        }
        if (z9) {
            jSONWriter2.popPath(fieldValue);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean writeWithUnwrapped(JSONWriter jSONWriter, Object obj, long j3, boolean z9, ObjectWriter objectWriter) {
        if (!(obj instanceof Map)) {
            if (!(objectWriter instanceof ObjectWriterAdapter)) {
                return false;
            }
            Iterator<FieldWriter> it = ((ObjectWriterAdapter) objectWriter).fieldWriters.iterator();
            while (it.hasNext()) {
                it.next().write(jSONWriter, obj);
            }
            return true;
        }
        boolean z10 = jSONWriter.jsonb;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            if (value != null || (JSONWriter.Feature.WriteNulls.mask & j3) != 0) {
                jSONWriter.writeName(string);
                if (!z10) {
                    jSONWriter.writeColon();
                }
                if (value == null) {
                    jSONWriter.writeNull();
                } else {
                    jSONWriter.getObjectWriter(value.getClass()).write(jSONWriter, value);
                }
            }
        }
        if (z9) {
            jSONWriter.popPath(obj);
        }
        return true;
    }
}
