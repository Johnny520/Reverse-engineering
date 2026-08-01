package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1572d0;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.ReferenceKey;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplMapTyped implements ObjectReader {
    final Function builder;
    final Constructor defaultConstructor;
    final long features;
    final Class instanceType;
    ObjectReader keyObjectReader;
    final Type keyType;
    final Class mapType;
    final boolean multiValue;
    final Class valueClass;
    ObjectReader valueObjectReader;
    final Type valueType;

    public ObjectReaderImplMapTyped(Class cls, Class cls2, Type type, Type type2, long j10, Function function) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.mapType = cls;
        this.instanceType = cls2;
        this.keyType = type;
        this.valueType = type2;
        this.valueClass = TypeUtils.getClass(type2);
        this.features = j10;
        this.builder = function;
        int i10 = 0;
        this.multiValue = cls2 != null && "org.springframework.util.LinkedMultiValueMap".equals(cls2.getName());
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i10];
            if (constructor2.getParameterCount() == 0 && !Modifier.isPublic(constructor2.getModifiers())) {
                constructor2.setAccessible(true);
                constructor = constructor2;
                break;
            }
            i10++;
        }
        this.defaultConstructor = constructor;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j10) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Class cls = this.instanceType;
        Map map2 = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) createInstance(j10);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.keyType;
            Object string = (type == null || type == String.class) ? key.toString() : TypeUtils.cast(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                Type type2 = this.valueType;
                if (type2 == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == TypeUtils.CLASS_JSON_OBJECT_1x) {
                    if (this.valueObjectReader == null) {
                        this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(type2);
                    }
                    value = this.valueObjectReader.createInstance((Map) value, j10);
                } else if ((cls2 == JSONArray.class || cls2 == TypeUtils.CLASS_JSON_ARRAY_1x) && this.valueClass == List.class) {
                    if (this.valueObjectReader == null) {
                        this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(type2);
                    }
                    value = this.valueObjectReader.createInstance((List) value, j10);
                } else {
                    Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, type2);
                    if (typeConvert != null) {
                        value = typeConvert.apply(value);
                    } else if (value instanceof Map) {
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(this.valueType);
                        }
                        value = this.valueObjectReader.createInstance((Map) value, j10);
                    } else if ((value instanceof Collection) && !this.multiValue) {
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(this.valueType);
                        }
                        value = this.valueObjectReader.createInstance((Collection) value, j10);
                    } else if (!cls2.isInstance(value)) {
                        StringBuilder sb2 = new StringBuilder("can not convert from ");
                        sb2.append(cls2);
                        C1572d0.m6260a(sb2, " to ", this.valueType);
                        return null;
                    }
                }
            }
            map2.put(string, value);
        }
        Function function = this.builder;
        return function != null ? function.apply(map2) : map2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.mapType;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        long j11;
        Function buildFunction;
        ObjectReader objectReaderCheckAutoType;
        Object fieldName;
        Object obj2;
        Object jSONBObject;
        Object any;
        Type type2;
        Function function = this.builder;
        if (jSONReader.getType() == -110) {
            objectReaderCheckAutoType = jSONReader.checkAutoType(this.mapType, 0L, this.features | j10);
            if (objectReaderCheckAutoType == null || objectReaderCheckAutoType == this) {
                j11 = j10;
                buildFunction = function;
            } else {
                buildFunction = objectReaderCheckAutoType.getBuildFunction();
                if (!(objectReaderCheckAutoType instanceof ObjectReaderImplMap) && !(objectReaderCheckAutoType instanceof ObjectReaderImplMapTyped)) {
                    return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j10);
                }
                j11 = j10;
            }
        } else {
            j11 = j10;
            buildFunction = function;
            objectReaderCheckAutoType = null;
        }
        byte type3 = jSONReader.getType();
        if (type3 == -81) {
            jSONReader.next();
            return null;
        }
        if (type3 == -90) {
            jSONReader.next();
        }
        long features = j11 | jSONReader.getContext().getFeatures();
        Map map = objectReaderCheckAutoType != null ? (Map) objectReaderCheckAutoType.createInstance(features) : this.instanceType == HashMap.class ? new HashMap() : (Map) createInstance(j11);
        int i10 = 0;
        while (jSONReader.getType() != -91) {
            if (this.keyType == String.class || jSONReader.isString()) {
                fieldName = jSONReader.readFieldName();
            } else {
                if (jSONReader.isReference()) {
                    String reference = jSONReader.readReference();
                    any = new ReferenceKey(i10);
                    jSONReader.addResolveTask(map, any, JSONPath.m6205of(reference));
                } else {
                    if (this.keyObjectReader == null && (type2 = this.keyType) != null) {
                        this.keyObjectReader = jSONReader.getObjectReader(type2);
                    }
                    ObjectReader objectReader = this.keyObjectReader;
                    if (objectReader == null) {
                        any = jSONReader.readAny();
                    } else {
                        fieldName = objectReader.readJSONBObject(jSONReader, null, null, j11);
                    }
                }
                fieldName = any;
            }
            if (jSONReader.isReference()) {
                String reference2 = jSONReader.readReference();
                if ("..".equals(reference2)) {
                    map.put(fieldName, map);
                } else {
                    jSONReader.addResolveTask(map, fieldName, JSONPath.m6205of(reference2));
                    if (!(map instanceof ConcurrentMap)) {
                        map.put(fieldName, null);
                    }
                }
            } else if (jSONReader.nextIfNull()) {
                map.put(fieldName, null);
            } else {
                if (this.valueType == Object.class) {
                    jSONBObject = jSONReader.readAny();
                    obj2 = fieldName;
                } else {
                    ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(this.valueClass, 0L, j10);
                    if (objectReaderCheckAutoType2 == null || objectReaderCheckAutoType2 == this) {
                        obj2 = fieldName;
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = jSONReader.getObjectReader(this.valueType);
                        }
                        jSONBObject = this.valueObjectReader.readJSONBObject(jSONReader, this.valueType, obj2, j10);
                    } else {
                        obj2 = fieldName;
                        jSONBObject = objectReaderCheckAutoType2.readJSONBObject(jSONReader, this.valueType, obj2, j10);
                    }
                }
                if (jSONBObject != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & features) == 0) {
                    map.put(obj2, jSONBObject);
                }
            }
            i10++;
            j11 = j10;
        }
        jSONReader.next();
        return buildFunction != null ? (buildFunction == ObjectReaderImplMap.ENUM_MAP_BUILDER && map.isEmpty()) ? new EnumMap((Class) this.keyType) : buildFunction.apply(map) : map;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped.readObject(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j10) {
        Class cls = this.instanceType;
        if (cls != null && !cls.isInterface()) {
            try {
                Constructor constructor = this.defaultConstructor;
                if (constructor != null) {
                    return constructor.newInstance(null);
                }
                return this.instanceType.newInstance();
            } catch (Exception e10) {
                C1565a.m6255a("create map error", e10);
                return null;
            }
        }
        return new HashMap();
    }
}
