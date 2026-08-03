package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderObject<T> extends FieldReader<T> {
    protected final BiConsumer function;
    protected ObjectReader initReader;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderObject(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field);
        this.function = biConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void arrayToMap(final Map map, Collection collection, final String str, final PropertyNamingStrategy propertyNamingStrategy, final ObjectReader objectReader, final BiConsumer biConsumer) {
        collection.forEach(new Consumer() { // from class: com.alibaba.fastjson2.reader.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FieldReaderObject.lambda$arrayToMap$0(str, propertyNamingStrategy, objectReader, map, biConsumer, obj);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.function.BiConsumer */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$arrayToMap$0(String str, PropertyNamingStrategy propertyNamingStrategy, ObjectReader objectReader, Map map, BiConsumer biConsumer, Object obj) {
        Object fieldValue;
        boolean z9 = obj instanceof Map;
        if (z9) {
            fieldValue = ((Map) obj).get(str);
        } else {
            if (obj == null) {
                C0086a.m464w(AbstractC4855en.m9263g("key not found ", str));
                return;
            }
            fieldValue = JSONFactory.getObjectWriter(obj.getClass(), 0L).getFieldValue(obj, str);
        }
        if (propertyNamingStrategy != null && (fieldValue instanceof String)) {
            fieldValue = propertyNamingStrategy.fieldName((String) fieldValue);
        }
        if (!objectReader.getObjectClass().isInstance(obj)) {
            if (!z9) {
                C0086a.m450i(JSON.toJSONString(obj, JSONWriter.Feature.ReferenceDetection), "can not accept ");
                return;
            }
            obj = objectReader.createInstance((Map) obj, new JSONReader.Feature[0]);
        }
        Object objPutIfAbsent = map.putIfAbsent(fieldValue, obj);
        if ((objPutIfAbsent != null) && (biConsumer != 0)) {
            biConsumer.accept(objPutIfAbsent, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (this.fieldClass == Character.TYPE && (obj instanceof String)) {
                String str = (String) obj;
                obj = str.length() > 0 ? Character.valueOf(str.charAt(0)) : (char) 0;
            }
            if (obj != null && !this.fieldClass.isInstance(obj)) {
                obj = TypeUtils.cast(obj, this.fieldType);
            }
            try {
                BiConsumer biConsumer = this.function;
                if (biConsumer != null) {
                    biConsumer.accept(t9, obj);
                    return;
                }
                Method method = this.method;
                if (method != null) {
                    method.invoke(t9, obj);
                } else {
                    this.field.set(t9, obj);
                }
            } catch (Exception e6) {
                throw new JSONException(AbstractC0921a.m2255r(new StringBuilder("set "), this.function != null ? super.toString() : this.fieldName, " error"), e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getInitReader() {
        return this.initReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            ObjectReader objectReaderM1732of = ObjectReaderImplMap.m1732of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderM1732of;
            return objectReaderM1732of;
        }
        Class cls2 = this.fieldClass;
        if (cls2 != null && Collection.class.isAssignableFrom(cls2)) {
            ObjectReader objectReaderM1726of = ObjectReaderImplList.m1726of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderM1726of;
            return objectReaderM1726of;
        }
        JSONReader.Context context = jSONReader.context;
        ObjectReader objectReader2 = context.provider.getObjectReader(this.fieldType, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        this.reader = objectReader2;
        return objectReader2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.alibaba.fastjson2.reader.FieldReader */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
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
                } catch (Exception e6) {
                    C0086a.m465x("read unwrapped field error", e6);
                    return;
                }
            }
        }
        jSONReader.skipValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void readFieldValue(JSONReader jSONReader, T t9) {
        Member member;
        String strM2255r;
        Object object;
        if (!this.fieldClassSerializable) {
            long j3 = jSONReader.context.features;
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & j3) != 0) {
                jSONReader.skipValue();
                return;
            } else if ((j3 & JSONReader.Feature.ErrorOnNoneSerializable.mask) != 0) {
                C0086a.m464w("not support none-Serializable");
                return;
            }
        }
        ObjectReader objectReaderCreateFormattedObjectReader = this.initReader;
        if (objectReaderCreateFormattedObjectReader == null) {
            objectReaderCreateFormattedObjectReader = FieldReader.createFormattedObjectReader(this.fieldType, this.fieldClass, this.format, this.locale);
            if (objectReaderCreateFormattedObjectReader != null) {
                this.initReader = objectReaderCreateFormattedObjectReader;
            } else {
                objectReaderCreateFormattedObjectReader = jSONReader.context.getObjectReader(this.fieldType);
                this.initReader = objectReaderCreateFormattedObjectReader;
            }
        }
        if (jSONReader.isReference()) {
            String reference = jSONReader.readReference();
            if ("..".equals(reference)) {
                accept(t9, t9);
                return;
            } else {
                addResolveTask(jSONReader, t9, reference);
                return;
            }
        }
        try {
            char cCurrent = jSONReader.current();
            if (jSONReader.nextIfNullOrEmptyString()) {
                object = this.defaultValue;
                if (object == null) {
                    Class cls = this.fieldClass;
                    object = cls == OptionalInt.class ? OptionalInt.empty() : cls == OptionalLong.class ? OptionalLong.empty() : cls == OptionalDouble.class ? OptionalDouble.empty() : cls == Optional.class ? Optional.empty() : cCurrent == 'n' ? null : HttpUrl.FRAGMENT_ENCODE_SET;
                }
            } else if (!jSONReader.jsonb) {
                object = objectReaderCreateFormattedObjectReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
            } else if (this.fieldClass == Object.class) {
                ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(Object.class, 0L, this.features);
                object = objectReaderCheckAutoType != null ? objectReaderCheckAutoType.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features) : jSONReader.readAny();
            } else {
                object = objectReaderCreateFormattedObjectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
            }
            accept(t9, object);
            if (this.noneStaticMemberClass) {
                BeanUtils.setNoneStaticMemberClassParent(object, t9);
            }
        } catch (Exception e6) {
            e = e6;
            member = this.field;
            if (member == null) {
                member = this.method;
            }
            if (member == null) {
                strM2255r = "read field '" + member.getDeclaringClass().getName() + "." + member.getName();
            } else {
                strM2255r = AbstractC0921a.m2255r(new StringBuilder("read field "), this.fieldName, " error");
            }
            C0086a.m465x(jSONReader.info(strM2255r), e);
        } catch (IllegalAccessError e7) {
            e = e7;
            member = this.field;
            if (member == null) {
            }
            if (member == null) {
            }
            C0086a.m465x(jSONReader.info(strM2255r), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t9) {
        JSONReader.Context context = jSONReader.context;
        long j3 = context.features;
        if (!this.fieldClassSerializable && jSONReader.getType() != -110) {
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & j3) != 0) {
                jSONReader.skipValue();
                return;
            } else if ((JSONReader.Feature.ErrorOnNoneSerializable.mask & j3) != 0 && (this.fieldClass != Object.class || jSONReader.isObject() || jSONReader.getType() == -110)) {
                C0086a.m464w("not support none-Serializable");
                return;
            }
        }
        if (this.initReader == null) {
            this.initReader = context.provider.getObjectReader(this.fieldType, (j3 & JSONReader.Feature.FieldBased.mask) != 0);
        }
        if (!jSONReader.isReference()) {
            accept(t9, this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features));
            return;
        }
        String reference = jSONReader.readReference();
        if ("..".equals(reference)) {
            accept(t9, t9);
        } else {
            addResolveTask(jSONReader, t9, reference);
        }
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
            ObjectReader objectReaderM1732of = ObjectReaderImplMap.m1732of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderM1732of;
            return objectReaderM1732of;
        }
        if (Collection.class.isAssignableFrom(this.fieldClass)) {
            ObjectReader objectReaderM1726of = ObjectReaderImplList.m1726of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderM1726of;
            return objectReaderM1726of;
        }
        ObjectReader objectReader = context.provider.getObjectReader(this.fieldType, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        this.reader = objectReader;
        return objectReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, byte b10) {
        accept(t9, Byte.valueOf(b10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, short s10) {
        accept(t9, Short.valueOf(s10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, int i9) {
        accept(t9, Integer.valueOf(i9));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        accept(t9, Long.valueOf(j3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, float f3) {
        accept(t9, Float.valueOf(f3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, double d10) {
        accept(t9, Double.valueOf(d10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, char c10) {
        accept(t9, Character.valueOf(c10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, boolean z9) {
        accept(t9, Boolean.valueOf(z9));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        Object object;
        if (this.initReader == null) {
            this.initReader = getObjectReader(jSONReader);
        }
        boolean z9 = jSONReader.jsonb;
        ObjectReader objectReader = this.initReader;
        if (z9) {
            object = objectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
        } else {
            object = objectReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
        }
        Function buildFunction = this.initReader.getBuildFunction();
        return buildFunction != 0 ? buildFunction.apply(object) : object;
    }
}
