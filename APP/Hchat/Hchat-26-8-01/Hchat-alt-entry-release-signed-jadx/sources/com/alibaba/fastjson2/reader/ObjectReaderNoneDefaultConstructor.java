package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderNoneDefaultConstructor<T> extends ObjectReaderAdapter<T> {
    private final Function<Map<Long, Object>, T> creator;
    final String[] paramNames;
    final FieldReader[] setterFieldReaders;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderNoneDefaultConstructor(Class cls, String str, String str2, long j3, Function<Map<Long, Object>, T> function, String[] strArr, FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2, Class[] clsArr, String[] strArr2) {
        super(cls, str, str2, j3, null, null, clsArr, strArr2, null, concat(fieldReaderArr, fieldReaderArr2));
        this.paramNames = strArr;
        this.creator = function;
        this.setterFieldReaders = fieldReaderArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FieldReader[] concat(FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2) {
        if (fieldReaderArr2 == null) {
            return fieldReaderArr;
        }
        int length = fieldReaderArr.length;
        FieldReader[] fieldReaderArr3 = (FieldReader[]) Arrays.copyOf(fieldReaderArr, fieldReaderArr2.length + length);
        System.arraycopy(fieldReaderArr2, 0, fieldReaderArr3, length, fieldReaderArr2.length);
        return fieldReaderArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x0097 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00b1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0047 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0047 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.alibaba.fastjson2.reader.ObjectReader, com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor<T>] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.function.Function] */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T createInstance(Map map, long j3) {
        Class<?> cls;
        Class<?> cls2;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(getTypeKey());
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = (JSONReader.Feature.SupportAutoType.mask & j3) != 0 ? autoType(objectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = objectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j3);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return (T) objectReaderAutoType.createInstance(map, j3);
            }
        }
        ?? linkedHashMap = 0;
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            FieldReader fieldReader = getFieldReader(string);
            if (fieldReader != null) {
                if (value != null && (cls = value.getClass()) != (cls2 = fieldReader.fieldClass)) {
                    if (value instanceof JSONObject) {
                        value = objectReaderProvider.getObjectReader(fieldReader.fieldType).createInstance((Map) value, j3);
                    } else if (value instanceof JSONArray) {
                        value = ((JSONArray) value).m1639to(fieldReader.fieldType, j3);
                    } else {
                        ?? typeConvert = objectReaderProvider.getTypeConvert(cls, cls2);
                        if (typeConvert != 0) {
                            value = typeConvert.apply(value);
                        }
                    }
                }
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(fieldReader instanceof FieldReaderObjectParam ? ((FieldReaderObjectParam) fieldReader).paramNameHash : fieldReader.fieldNameHash), value);
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        T t9 = (T) createInstanceNoneDefaultConstructor(linkedHashMap);
        int i9 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.setterFieldReaders;
            if (i9 >= fieldReaderArr.length) {
                return t9;
            }
            FieldReader fieldReader2 = fieldReaderArr[i9];
            Object objCreateInstance = map.get(fieldReader2.fieldName);
            if (objCreateInstance != null) {
                Field field = fieldReader2.field;
                if (field == null || !Modifier.isFinal(field.getModifiers())) {
                    Class<?> cls3 = objCreateInstance.getClass();
                    Class<?> cls4 = fieldReader2.fieldClass;
                    Type type = fieldReader2.fieldType;
                    if (cls3 != cls4) {
                        ?? typeConvert2 = objectReaderProvider.getTypeConvert(cls3, cls4);
                        if (!(type instanceof Class)) {
                            objCreateInstance = TypeUtils.cast(objCreateInstance, type, objectReaderProvider);
                        } else if (typeConvert2 != 0) {
                            objCreateInstance = typeConvert2.apply(objCreateInstance);
                        } else if (objCreateInstance instanceof Map) {
                            objCreateInstance = fieldReader2.getObjectReader(JSONFactory.createReadContext(objectReaderProvider, new JSONReader.Feature[0])).createInstance((Map) objCreateInstance, fieldReader2.features | j3);
                        }
                    }
                    fieldReader2.accept(t9, objCreateInstance);
                } else {
                    try {
                        Object objInvoke = fieldReader2.method.invoke(t9, null);
                        if (!(objInvoke instanceof Collection) || ((Collection) objInvoke).isEmpty()) {
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstanceNoneDefaultConstructor(Map<Long, Object> map) {
        return this.creator.apply(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0094 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0094 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:80:0x005c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x018c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor<T>] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        ?? linkedHashMap;
        ObjectReader objectReaderAutoType;
        JSONReader jSONReader2;
        Object obj2;
        long j4;
        Type type2;
        ObjectReader objectReaderCheckAutoType;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        byte type3 = jSONReader.getType();
        HashMap map = null;
        if (type3 == -81) {
            jSONReader.next();
            return null;
        }
        if (type3 == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, getTypeNameHash(), this.features | j3)) != null && objectReaderCheckAutoType != this) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        int i9 = 0;
        if (!jSONReader.isArray()) {
            jSONReader.nextIfObjectStart();
            int i10 = 0;
            linkedHashMap = 0;
            HashMap map2 = null;
            while (!jSONReader.nextIfObjectEnd()) {
                long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                if (fieldNameHashCode != 0) {
                    if (fieldNameHashCode == ObjectReader.HASH_TYPE && i10 == 0) {
                        long typeHashCode = jSONReader.readTypeHashCode();
                        JSONReader.Context context = jSONReader.context;
                        ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(typeHashCode);
                        if (objectReaderAutoType2 == null) {
                            String string = jSONReader.getString();
                            objectReaderAutoType = context.getObjectReaderAutoType(string, this.objectClass);
                            if (objectReaderAutoType == null) {
                                C0086a.m464w(jSONReader.info("auotype not support : " + string));
                                return null;
                            }
                            jSONReader2 = jSONReader;
                            type2 = type;
                            obj2 = obj;
                            j4 = j3;
                        } else {
                            objectReaderAutoType = objectReaderAutoType2;
                            jSONReader2 = jSONReader;
                            obj2 = obj;
                            j4 = j3;
                            type2 = type;
                        }
                        T t9 = (T) objectReaderAutoType.readJSONBObject(jSONReader2, type2, obj2, j4);
                        jSONReader.nextIfComma();
                        return t9;
                    }
                    FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                    if (fieldReader == null) {
                        processExtra(jSONReader, null, j3);
                    } else if (jSONReader.isReference()) {
                        jSONReader.next();
                        String string2 = jSONReader.readString();
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(Long.valueOf(fieldNameHashCode), string2);
                    } else {
                        Object fieldValue = fieldReader.readFieldValue(jSONReader);
                        linkedHashMap = linkedHashMap;
                        if (linkedHashMap == 0) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(Long.valueOf(fieldReader.fieldNameHash), fieldValue);
                    }
                }
                i10++;
                linkedHashMap = linkedHashMap;
            }
            map = map2;
        } else {
            if (!jSONReader.isSupportBeanArray()) {
                C0086a.m464w(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
                return null;
            }
            int iStartArray = jSONReader.startArray();
            int i11 = 0;
            linkedHashMap = 0;
            while (i11 < iStartArray) {
                FieldReader fieldReader2 = this.fieldReaders[i11];
                Object fieldValue2 = fieldReader2.readFieldValue(jSONReader);
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(fieldReader2.fieldNameHash), fieldValue2);
                i11++;
                linkedHashMap = linkedHashMap;
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        T t10 = (T) createInstanceNoneDefaultConstructor(linkedHashMap);
        if (this.setterFieldReaders != null) {
            while (true) {
                FieldReader[] fieldReaderArr = this.setterFieldReaders;
                if (i9 >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader3 = fieldReaderArr[i9];
                fieldReader3.accept(t10, linkedHashMap.get(Long.valueOf(fieldReader3.fieldNameHash)));
                i9++;
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l10 = (Long) entry.getKey();
                String str = (String) entry.getValue();
                FieldReader fieldReader4 = getFieldReader(l10.longValue());
                if ("..".equals(str)) {
                    fieldReader4.accept(t10, t10);
                } else {
                    fieldReader4.addResolveTask(jSONReader, t10, str);
                }
            }
        }
        return t10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:112:0x0044 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        FieldReader fieldReaderLCase;
        Class cls;
        JSONReader jSONReader2 = jSONReader;
        if (!this.serializable) {
            jSONReader2.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader2.jsonb) {
            return readJSONBObject(jSONReader2, type, obj, 0L);
        }
        LinkedHashMap linkedHashMap = null;
        int i9 = 0;
        if (jSONReader2.isSupportBeanArray(this.features | j3) && jSONReader2.nextIfArrayStart()) {
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i9 >= fieldReaderArr.length) {
                    break;
                }
                Object fieldValue = fieldReaderArr[i9].readFieldValue(jSONReader2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(this.fieldReaders[i9].fieldNameHash), fieldValue);
                i9++;
                linkedHashMap = linkedHashMap;
            }
            if (!jSONReader2.nextIfArrayEnd()) {
                C0086a.m464w(jSONReader2.info("array not end, " + jSONReader2.current()));
                return null;
            }
            jSONReader2.nextIfComma();
            Map<Long, Object> map = linkedHashMap;
            if (linkedHashMap == null) {
                map = Collections.EMPTY_MAP;
            }
            return createInstanceNoneDefaultConstructor(map);
        }
        if (!jSONReader2.nextIfObjectStart()) {
            if (jSONReader2.isTypeRedirect()) {
                jSONReader2.setTypeRedirect(false);
            } else if (jSONReader2.nextIfNullOrEmptyString()) {
                return null;
            }
        }
        JSONReader.Context context = jSONReader2.context;
        long j4 = this.features | j3 | context.features;
        LinkedHashMap linkedHashMap2 = null;
        int i10 = 0;
        while (!jSONReader2.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader2.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.typeKeyHashCode && i10 == 0) {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    if (typeHashCode != getTypeNameHash()) {
                        ObjectReader objectReaderAutoType = (JSONReader.Feature.SupportAutoType.mask & j4) != 0 ? jSONReader.getObjectReaderAutoType(typeHashCode, this.objectClass, this.features) : context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass);
                        if (objectReaderAutoType == null) {
                            objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass, this.features);
                        }
                        ObjectReader objectReader = objectReaderAutoType;
                        if (objectReader != null) {
                            T t9 = (T) objectReader.readObject(jSONReader, type, obj, 0L);
                            jSONReader.nextIfComma();
                            return t9;
                        }
                    }
                    jSONReader2 = jSONReader;
                } else {
                    FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                    if (fieldReader == null && (JSONReader.Feature.SupportSmartMatch.mask & j4) != 0 && (fieldReader = getFieldReaderLCase(jSONReader2.getNameHashCodeLCase())) == null) {
                        String fieldName = jSONReader2.getFieldName();
                        if (fieldName.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(fieldName.substring(2)))) != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
                            fieldReader = fieldReaderLCase;
                        }
                    }
                    if (fieldReader == null) {
                        processExtra(jSONReader2, null, j3);
                    } else {
                        Object fieldValue2 = fieldReader.readFieldValue(jSONReader2);
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                        }
                        linkedHashMap2.put(Long.valueOf(fieldReader instanceof FieldReaderObjectParam ? ((FieldReaderObjectParam) fieldReader).paramNameHash : fieldReader.fieldNameHash), fieldValue2);
                    }
                }
            }
            i10++;
        }
        if (this.hasDefaultValue) {
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            for (FieldReader fieldReader2 : this.fieldReaders) {
                if (fieldReader2.defaultValue != null && linkedHashMap2.get(Long.valueOf(fieldReader2.fieldNameHash)) == null) {
                    linkedHashMap2.put(Long.valueOf(fieldReader2.fieldNameHash), fieldReader2.defaultValue);
                }
            }
        }
        T tApply = this.creator.apply(linkedHashMap2 == null ? Collections.EMPTY_MAP : linkedHashMap2);
        if (this.setterFieldReaders != null && linkedHashMap2 != null) {
            while (true) {
                FieldReader[] fieldReaderArr2 = this.setterFieldReaders;
                if (i9 >= fieldReaderArr2.length) {
                    break;
                }
                FieldReader fieldReader3 = fieldReaderArr2[i9];
                Object obj2 = linkedHashMap2.get(Long.valueOf(fieldReader3.fieldNameHash));
                if (obj2 != null) {
                    fieldReader3.accept(tApply, obj2);
                }
                i9++;
            }
        }
        jSONReader2.nextIfComma();
        return tApply;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Collection collection, long j3) {
        long j4;
        Function typeConvert;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i9 >= fieldReaderArr.length) {
                break;
            }
            FieldReader fieldReader = fieldReaderArr[i9];
            if (next != null) {
                Class<?> cls = next.getClass();
                Class<?> cls2 = fieldReader.fieldClass;
                Type type = fieldReader.fieldType;
                if (!(type instanceof Class)) {
                    next = TypeUtils.cast(next, type, objectReaderProvider);
                } else if (cls != cls2 && (typeConvert = objectReaderProvider.getTypeConvert(cls, cls2)) != 0) {
                    next = typeConvert.apply(next);
                }
            }
            if (fieldReader instanceof FieldReaderObjectParam) {
                j4 = ((FieldReaderObjectParam) fieldReader).paramNameHash;
            } else {
                j4 = fieldReader.fieldNameHash;
            }
            linkedHashMap.put(Long.valueOf(j4), next);
            i9++;
        }
        return createInstanceNoneDefaultConstructor(linkedHashMap);
    }
}
