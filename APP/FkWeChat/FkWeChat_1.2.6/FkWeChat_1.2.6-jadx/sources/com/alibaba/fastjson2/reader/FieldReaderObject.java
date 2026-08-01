package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderObject<T> extends FieldReader<T> {
    protected ObjectReader initReader;

    public FieldReaderObject(String str, Type type, Class cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, ObjectReader objectReader) {
        super(str, type, cls, i10, j10, str2, locale, obj, jSONSchema, method, field, biConsumer, null, null);
        this.initReader = objectReader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m6322B(String str, PropertyNamingStrategy propertyNamingStrategy, ObjectReader objectReader, Map map, BiConsumer biConsumer, Object obj) {
        Object fieldValue;
        boolean z10 = obj instanceof Map;
        if (z10) {
            fieldValue = ((Map) obj).get(str);
        } else {
            if (obj == null) {
                C1605j.m6294a("key not found ", str);
                return;
            }
            fieldValue = JSONFactory.getObjectWriter(obj.getClass(), 0L).getFieldValue(obj, str);
        }
        if (propertyNamingStrategy != null && (fieldValue instanceof String)) {
            fieldValue = propertyNamingStrategy.fieldName((String) fieldValue);
        }
        if (!objectReader.getObjectClass().isInstance(obj)) {
            if (!z10) {
                C1607k.m6296a("can not accept ", JSON.toJSONString(obj, JSONWriter.Feature.ReferenceDetection));
                return;
            }
            obj = objectReader.createInstance((Map) obj, new JSONReader.Feature[0]);
        }
        Object objPutIfAbsent = map.putIfAbsent(fieldValue, obj);
        if ((objPutIfAbsent != null) && (biConsumer != 0)) {
            biConsumer.accept(objPutIfAbsent, obj);
        }
    }

    public static void arrayToMap(final Map map, Collection collection, final String str, final PropertyNamingStrategy propertyNamingStrategy, final ObjectReader objectReader, final BiConsumer biConsumer) {
        collection.forEach(new Consumer() { // from class: com.alibaba.fastjson2.reader.x
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FieldReaderObject.m6322B(str, propertyNamingStrategy, objectReader, map, biConsumer, obj);
            }
        });
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        if (isParameter()) {
            return;
        }
        if (obj != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (obj != null && !this.fieldClass.isInstance(obj)) {
                obj = TypeUtils.cast(obj, this.fieldType);
            }
            this.propertyAccessor.setObject(t10, obj);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public BiConsumer getFunction() {
        return this.function;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getInitReader() {
        return this.initReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader jSONReader) {
        ObjectReader objectReader = this.initReader;
        if (objectReader != null) {
            return objectReader;
        }
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReaderCreateFormattedObjectReader = FieldReader.createFormattedObjectReader(this.fieldType, this.fieldClass, this.format, this.locale);
        if (objectReaderCreateFormattedObjectReader != null) {
            this.reader = objectReaderCreateFormattedObjectReader;
            return objectReaderCreateFormattedObjectReader;
        }
        Class cls = this.fieldClass;
        if (cls != null && Map.class.isAssignableFrom(cls)) {
            ObjectReader objectReaderM6389of = ObjectReaderImplMap.m6389of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderM6389of;
            return objectReaderM6389of;
        }
        Class cls2 = this.fieldClass;
        if (cls2 == null || !Collection.class.isAssignableFrom(cls2)) {
            ObjectReader objectReader2 = jSONReader.getObjectReader(this.fieldType);
            this.reader = objectReader2;
            return objectReader2;
        }
        ObjectReader objectReaderM6383of = ObjectReaderImplList.m6383of(this.fieldType, this.fieldClass, this.features);
        this.reader = objectReaderM6383of;
        return objectReaderM6383of;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(JSONReader jSONReader, Object obj) {
        if (this.initReader == null) {
            this.initReader = getObjectReader(jSONReader);
        }
        if ((this.initReader instanceof ObjectReaderBean) && this.field != null) {
            FieldReader fieldReader = this.initReader.getFieldReader(jSONReader.getFieldName());
            if (fieldReader != 0) {
                try {
                    Object objCreateInstance = this.field.get(obj);
                    if (objCreateInstance == null) {
                        objCreateInstance = this.initReader.createInstance(this.features);
                        accept(obj, objCreateInstance);
                    }
                    fieldReader.readFieldValue(jSONReader, objCreateInstance);
                    return;
                } catch (Exception e10) {
                    C1565a.m6255a("read unwrapped field error", e10);
                    return;
                }
            }
        }
        jSONReader.skipValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r11, T r12) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.FieldReaderObject.readFieldValue(com.alibaba.fastjson2.JSONReader, java.lang.Object):void");
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t10) {
        if (!this.fieldClassSerializable && jSONReader.getType() != -110) {
            long features = jSONReader.getContext().getFeatures();
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & features) != 0) {
                jSONReader.skipValue();
                return;
            } else if ((features & JSONReader.Feature.ErrorOnNoneSerializable.mask) != 0 && (this.fieldClass != Object.class || jSONReader.isObject() || jSONReader.getType() == -110)) {
                C1569c.m6258a("not support none-Serializable");
                return;
            }
        }
        if (this.initReader == null) {
            this.initReader = jSONReader.getContext().getObjectReader(this.fieldType);
        }
        if (jSONReader.isReference()) {
            String reference = jSONReader.readReference();
            if ("..".equals(reference)) {
                accept(t10, t10);
                return;
            } else {
                addResolveTask(jSONReader, t10, reference);
                return;
            }
        }
        Object jSONBObject = this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
        if (jSONBObject == null && (jSONReader.features(this.features) & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0 && this.fieldClass.isPrimitive()) {
            C1569c.m6258a(jSONReader.info("primitive value not support input null"));
        } else {
            accept(t10, jSONBObject);
        }
    }

    public FieldReaderObject(String str, Type type, Class cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        this(str, type, cls, i10, j10, str2, locale, obj, jSONSchema, method, field, biConsumer, null, null);
    }

    public FieldReaderObject(String str, Type type, Class cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, String str3, Parameter parameter) {
        super(str, type, cls, i10, j10, str2, locale, obj, jSONSchema, method, field, biConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, byte b10) {
        this.propertyAccessor.setByteValue(t10, b10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, short s10) {
        this.propertyAccessor.setShortValue(t10, s10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, int i10) {
        this.propertyAccessor.setIntValue(t10, i10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, long j10) {
        this.propertyAccessor.setLongValue(t10, j10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, float f10) {
        this.propertyAccessor.setFloatValue(t10, f10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, double d10) {
        this.propertyAccessor.setDoubleValue(t10, d10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, char c10) {
        this.propertyAccessor.setCharValue(t10, c10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, boolean z10) {
        this.propertyAccessor.setBooleanValue(t10, z10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader.Context context) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReaderCreateFormattedObjectReader = FieldReader.createFormattedObjectReader(this.fieldType, this.fieldClass, this.format, this.locale);
        if (objectReaderCreateFormattedObjectReader != null) {
            this.reader = objectReaderCreateFormattedObjectReader;
            return objectReaderCreateFormattedObjectReader;
        }
        if (Map.class.isAssignableFrom(this.fieldClass)) {
            ObjectReader objectReaderM6389of = ObjectReaderImplMap.m6389of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderM6389of;
            return objectReaderM6389of;
        }
        boolean zIsAssignableFrom = Collection.class.isAssignableFrom(this.fieldClass);
        Type type = this.fieldType;
        if (zIsAssignableFrom) {
            ObjectReader objectReaderM6383of = ObjectReaderImplList.m6383of(type, this.fieldClass, this.features);
            this.reader = objectReaderM6383of;
            return objectReaderM6383of;
        }
        ObjectReader objectReader = context.getObjectReader(type);
        this.reader = objectReader;
        return objectReader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        Object object;
        if (this.initReader == null) {
            this.initReader = getObjectReader(jSONReader);
        }
        boolean z10 = jSONReader.jsonb;
        ObjectReader objectReader = this.initReader;
        if (z10) {
            object = objectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
        } else {
            object = objectReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
        }
        Function buildFunction = this.initReader.getBuildFunction();
        return buildFunction != 0 ? buildFunction.apply(object) : object;
    }
}
