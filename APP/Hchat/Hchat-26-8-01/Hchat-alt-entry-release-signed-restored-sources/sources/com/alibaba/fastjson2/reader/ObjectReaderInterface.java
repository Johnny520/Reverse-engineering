package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderInterface<T> extends ObjectReaderAdapter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderInterface(Class cls, String str, String str2, long j3, Supplier supplier, Function function, FieldReader[] fieldReaderArr) {
        super(cls, str, str2, j3, supplier, function, fieldReaderArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j3) {
        JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
        for (FieldReader fieldReader : this.fieldReaders) {
            Object obj = jSONObject.get(fieldReader.fieldName);
            if (obj instanceof Map) {
                ObjectReader objectReader = fieldReader.getObjectReader(JSONFactory.getDefaultObjectReaderProvider());
                if (objectReader instanceof ObjectReaderAdapter) {
                    if (jSONObject == map) {
                        jSONObject = new JSONObject(map);
                    }
                    jSONObject.put(fieldReader.fieldName, objectReader.createInstance((Map) obj, j3));
                }
            }
        }
        return (T) TypeUtils.newProxyInstance(this.objectClass, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, getTypeNameHash(), this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.isArray()) {
            if (jSONReader.isSupportBeanArray()) {
                return readArrayMappingJSONBObject(jSONReader, type, obj, j3);
            }
            C0086a.m464w(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
            return null;
        }
        jSONReader.nextIfObjectStart();
        JSONObject jSONObject = new JSONObject();
        int i9 = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == this.typeKeyHashCode && i9 == 0) {
                long valueHashCode = jSONReader.readValueHashCode();
                JSONReader.Context context = jSONReader.context;
                ObjectReader objectReaderAutoType = autoType(context, valueHashCode);
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        C0086a.m464w(jSONReader.info("auotype not support : " + string));
                        return null;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    jSONReader.setTypeRedirect(true);
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(this.features | j3)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    jSONObject.put(jSONReader.getFieldName(), jSONReader.readAny());
                } else {
                    jSONObject.put(fieldReader.fieldName, fieldReader.readFieldValue(jSONReader));
                }
            }
            i9++;
        }
        return (T) TypeUtils.newProxyInstance(this.objectClass, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        String string;
        Class<?> clsApply;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return null;
        }
        if (jSONReader.isArray() && jSONReader.isSupportBeanArray(getFeatures() | j3)) {
            return readArrayMappingObject(jSONReader, type, obj, j3);
        }
        JSONObject jSONObject = new JSONObject();
        if (!jSONReader.nextIfObjectStart()) {
            char cCurrent = jSONReader.current();
            if (cCurrent == 't' || cCurrent == 'f') {
                jSONReader.readBoolValue();
                return null;
            }
            if (cCurrent != '\"' && cCurrent != '\'' && cCurrent != '}') {
                C0086a.m464w(jSONReader.info());
                return null;
            }
        }
        int i9 = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            JSONReader.Context context = jSONReader.context;
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
            if (i9 == 0 && fieldNameHashCode == getTypeKeyHash()) {
                long features = j3 | getFeatures() | context.features;
                if ((JSONReader.Feature.SupportAutoType.mask & features) != 0 || contextAutoTypeBeforeHandler != null) {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    ObjectReader objectReader = (contextAutoTypeBeforeHandler == null || contextAutoTypeBeforeHandler.apply(typeHashCode, this.objectClass, features) != null || (clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), this.objectClass, features)) == null) ? null : context.getObjectReader(clsApply);
                    if (objectReader == null) {
                        objectReader = autoType(context, typeHashCode);
                    }
                    if (objectReader == null) {
                        String string2 = jSONReader.getString();
                        ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(string2, this.objectClass, features);
                        if (objectReaderAutoType == null) {
                            C0086a.m464w(jSONReader.info("No suitable ObjectReader found for" + string2));
                            return null;
                        }
                        objectReader = objectReaderAutoType;
                        string = string2;
                    } else {
                        string = null;
                    }
                    if (objectReader != this) {
                        FieldReader fieldReader = objectReader.getFieldReader(fieldNameHashCode);
                        if (fieldReader != null && string == null) {
                            string = jSONReader.getString();
                        }
                        String str = string;
                        T t9 = (T) objectReader.readObject(jSONReader, null, null, j3 | getFeatures());
                        if (fieldReader != null) {
                            fieldReader.accept(t9, str);
                        }
                        return t9;
                    }
                }
            } else {
                FieldReader fieldReader2 = getFieldReader(fieldNameHashCode);
                if (fieldReader2 == null && jSONReader.isSupportSmartMatch(j3 | getFeatures())) {
                    fieldReader2 = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader2 == null) {
                    jSONObject.put(jSONReader.getFieldName(), jSONReader.readAny());
                } else {
                    jSONObject.put(fieldReader2.fieldName, fieldReader2.readFieldValue(jSONReader));
                }
            }
            i9++;
        }
        jSONReader.nextIfComma();
        T t10 = (T) TypeUtils.newProxyInstance(this.objectClass, jSONObject);
        Function buildFunction = getBuildFunction();
        return buildFunction != null ? (T) buildFunction.apply(t10) : t10;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j3) {
        return (T) TypeUtils.newProxyInstance(this.objectClass, new JSONObject());
    }
}
