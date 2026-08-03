package com.alibaba.fastjson2.reader;

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
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplMapTyped implements ObjectReader {
    final Function builder;
    final Constructor defaultConstructor;
    final long features;
    final Class instanceType;
    ObjectReader keyObjectReader;
    final Type keyType;
    final Class mapType;
    final Class valueClass;
    ObjectReader valueObjectReader;
    final Type valueType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplMapTyped(Class cls, Class cls2, Type type, Type type2, long j3, Function function) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.mapType = cls;
        this.instanceType = cls2;
        this.keyType = type;
        this.valueType = type2;
        this.valueClass = TypeUtils.getClass(type2);
        this.features = j3;
        this.builder = function;
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i9];
            if (constructor2.getParameterTypes().length == 0 && !Modifier.isPublic(constructor2.getModifiers())) {
                constructor2.setAccessible(true);
                constructor = constructor2;
                break;
            }
            i9++;
        }
        this.defaultConstructor = constructor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j3) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Class cls = this.instanceType;
        Map map2 = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) createInstance(j3);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.keyType;
            Object string = (type == null || type == String.class) ? key.toString() : TypeUtils.cast(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                if (this.valueType == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == JSONFactory.getClassJSONObject1x()) {
                    if (this.valueObjectReader == null) {
                        this.valueObjectReader = objectReaderProvider.getObjectReader(this.valueType);
                    }
                    value = this.valueObjectReader.createInstance((JSONObject) value, j3);
                } else if ((cls2 == JSONArray.class || cls2 == JSONFactory.getClassJSONArray1x()) && this.valueClass == List.class) {
                    if (this.valueObjectReader == null) {
                        this.valueObjectReader = objectReaderProvider.getObjectReader(this.valueType);
                    }
                    value = this.valueObjectReader.createInstance((JSONArray) value, j3);
                } else {
                    Function typeConvert = objectReaderProvider.getTypeConvert(cls2, this.valueType);
                    if (typeConvert != null) {
                        value = typeConvert.apply(value);
                    } else if (value instanceof Map) {
                        Map map3 = (Map) value;
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = objectReaderProvider.getObjectReader(this.valueType);
                        }
                        try {
                            value = this.valueObjectReader.createInstance(map3, j3);
                        } catch (Exception unused) {
                        }
                    } else if (value instanceof Collection) {
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = objectReaderProvider.getObjectReader(this.valueType);
                        }
                        value = this.valueObjectReader.createInstance((Collection) value, j3);
                    } else if (!cls2.isInstance(value)) {
                        StringBuilder sb2 = new StringBuilder("can not convert from ");
                        sb2.append(cls2);
                        C0086a.m460s(sb2, " to ", this.valueType);
                        return null;
                    }
                }
            }
            map2.put(string, value);
        }
        Function function = this.builder;
        return function != null ? function.apply(map2) : map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.mapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        JSONReader jSONReader2;
        ObjectReader objectReader;
        Object fieldName;
        Object obj2;
        Object jSONBObject;
        Type type2;
        Function buildFunction = this.builder;
        if (jSONReader.getType() == -110) {
            ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.mapType, 0L, this.features | j3);
            if (objectReaderCheckAutoType != null && objectReaderCheckAutoType != this) {
                buildFunction = objectReaderCheckAutoType.getBuildFunction();
                if (!(objectReaderCheckAutoType instanceof ObjectReaderImplMap) && !(objectReaderCheckAutoType instanceof ObjectReaderImplMapTyped)) {
                    return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            }
            objectReader = objectReaderCheckAutoType;
            jSONReader2 = jSONReader;
        } else {
            jSONReader2 = jSONReader;
            objectReader = null;
        }
        byte type3 = jSONReader2.getType();
        if (type3 == -81) {
            jSONReader2.next();
            return null;
        }
        if (type3 == -90) {
            jSONReader2.next();
        }
        JSONReader.Context context = jSONReader2.context;
        long j4 = j3 | context.features;
        Map map = objectReader != null ? (Map) objectReader.createInstance(j4) : this.instanceType == HashMap.class ? new HashMap() : (Map) createInstance();
        int i9 = 0;
        while (jSONReader2.getType() != -91) {
            if (this.keyType == String.class || jSONReader2.isString()) {
                fieldName = jSONReader2.readFieldName();
            } else if (jSONReader2.isReference()) {
                String reference = jSONReader2.readReference();
                fieldName = new ReferenceKey(i9);
                jSONReader2.addResolveTask(map, fieldName, JSONPath.m1657of(reference));
            } else {
                if (this.keyObjectReader == null && (type2 = this.keyType) != null) {
                    this.keyObjectReader = jSONReader2.getObjectReader(type2);
                }
                ObjectReader objectReader2 = this.keyObjectReader;
                fieldName = objectReader2 == null ? jSONReader2.readAny() : objectReader2.readJSONBObject(jSONReader2, null, null, j3);
            }
            Object obj3 = fieldName;
            if (jSONReader2.isReference()) {
                String reference2 = jSONReader2.readReference();
                if ("..".equals(reference2)) {
                    map.put(obj3, map);
                } else {
                    jSONReader2.addResolveTask(map, obj3, JSONPath.m1657of(reference2));
                    if (!(map instanceof ConcurrentMap)) {
                        map.put(obj3, null);
                    }
                }
            } else if (jSONReader2.nextIfNull()) {
                map.put(obj3, null);
            } else {
                if (this.valueType == Object.class) {
                    jSONBObject = jSONReader2.readAny();
                    obj2 = obj3;
                } else {
                    ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(this.valueClass, 0L, j3);
                    if (objectReaderCheckAutoType2 == null || objectReaderCheckAutoType2 == this) {
                        obj2 = obj3;
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = context.provider.getObjectReader(this.valueType, (JSONReader.Feature.FieldBased.mask & j4) != 0);
                        }
                        jSONBObject = this.valueObjectReader.readJSONBObject(jSONReader, this.valueType, obj2, j3);
                    } else {
                        obj2 = obj3;
                        jSONBObject = objectReaderCheckAutoType2.readJSONBObject(jSONReader, this.valueType, obj2, j3);
                    }
                }
                if (jSONBObject != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j4) == 0) {
                    map.put(obj2, jSONBObject);
                }
            }
            i9++;
            jSONReader2 = jSONReader;
        }
        jSONReader2.next();
        return buildFunction != null ? (buildFunction == ObjectReaderImplMap.ENUM_MAP_BUILDER && map.isEmpty()) ? new EnumMap((Class) this.keyType) : buildFunction.apply(map) : map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        int i9;
        int i10;
        Map enumMap;
        Map map;
        Map map2;
        Class cls;
        char c10;
        JSONReader jSONReader2;
        Object string;
        Map map3;
        Map innerMap;
        JSONReader jSONReader3 = jSONReader;
        Object objCast = null;
        if (jSONReader3.nextIfObjectStart()) {
            i9 = 0;
        } else {
            if (!jSONReader3.isTypeRedirect()) {
                if (jSONReader3.nextIfNullOrEmptyString()) {
                    return null;
                }
                C0086a.m464w(jSONReader3.info("expect '{', but '" + jSONReader3.current() + "'"));
                return null;
            }
            jSONReader3.setTypeRedirect(false);
            i9 = 1;
        }
        JSONReader.Context context = jSONReader3.context;
        long j4 = context.features | j3;
        Class cls2 = this.instanceType;
        if (cls2 == HashMap.class) {
            Supplier<Map> objectSupplier = context.getObjectSupplier();
            if (this.mapType != Map.class || objectSupplier == null) {
                map3 = new HashMap();
                innerMap = null;
            } else {
                map3 = objectSupplier.get();
                innerMap = TypeUtils.getInnerMap(map3);
            }
            i10 = i9;
            enumMap = map3;
            map = innerMap;
        } else {
            i10 = i9;
            enumMap = (cls2 == EnumMap.class && (this.keyType instanceof Class)) ? new EnumMap((Class) this.keyType) : (Map) createInstance(j4);
            map = null;
        }
        while (!jSONReader3.nextIfObjectEnd() && !jSONReader3.isEnd()) {
            if (!jSONReader3.nextIfNull()) {
                if (this.keyType == String.class) {
                    String fieldName = jSONReader3.readFieldName();
                    if (i10 == 0 && (JSONReader.Feature.SupportAutoType.mask & j4) != 0 && fieldName.equals(getTypeKey())) {
                        ObjectReader objectReaderAutoType = jSONReader3.getObjectReaderAutoType(jSONReader3.readTypeHashCode(), this.mapType, j3);
                        if (objectReaderAutoType != null && (objectReaderAutoType instanceof ObjectReaderImplMap) && !enumMap.getClass().equals(((ObjectReaderImplMap) objectReaderAutoType).instanceType)) {
                            enumMap = (Map) objectReaderAutoType.createInstance(j3);
                        }
                    } else {
                        if (fieldName == null) {
                            fieldName = jSONReader3.readString();
                            if (!jSONReader3.nextIfMatch(':')) {
                                C0086a.m464w(jSONReader3.info("illegal json"));
                                return null;
                            }
                        }
                        objCast = fieldName;
                    }
                } else {
                    if (i10 == 0 && (((j4 & JSONReader.Feature.SupportAutoType.mask) != 0 || context.getContextAutoTypeBeforeHandler() != null) && jSONReader3.current() == '\"')) {
                        Type type2 = this.keyType;
                        if (!(type2 instanceof Class) || !Enum.class.isAssignableFrom((Class) type2)) {
                            String fieldName2 = jSONReader3.readFieldName();
                            if (fieldName2.equals(getTypeKey())) {
                                ObjectReader objectReaderAutoType2 = jSONReader3.getObjectReaderAutoType(jSONReader3.readTypeHashCode(), this.mapType, j3);
                                if (objectReaderAutoType2 != null && (objectReaderAutoType2 instanceof ObjectReaderImplMap) && !enumMap.getClass().equals(((ObjectReaderImplMap) objectReaderAutoType2).instanceType)) {
                                    map2 = (Map) objectReaderAutoType2.createInstance(j3);
                                    enumMap = map2;
                                }
                            } else {
                                objCast = TypeUtils.cast(fieldName2, this.keyType);
                            }
                        }
                    }
                    ObjectReader objectReader = this.keyObjectReader;
                    if (objectReader != null) {
                        cls = Enum.class;
                        c10 = ':';
                        jSONReader2 = jSONReader;
                        string = objectReader.readObject(jSONReader2, null, null, 0L);
                    } else {
                        cls = Enum.class;
                        c10 = ':';
                        jSONReader2 = jSONReader;
                        string = jSONReader2.read(this.keyType);
                    }
                    if (string == null && cls.isAssignableFrom((Class) this.keyType)) {
                        string = jSONReader2.getString();
                        jSONReader2.nextIfMatch(c10);
                    }
                    if (i10 == 0 && (JSONReader.Feature.SupportAutoType.mask & j4) != 0 && string.equals(getTypeKey())) {
                        ObjectReader objectReaderAutoType3 = jSONReader.getObjectReaderAutoType(jSONReader.readTypeHashCode(), this.mapType, j3);
                        if (objectReaderAutoType3 != null && (objectReaderAutoType3 instanceof ObjectReaderImplMap) && !enumMap.getClass().equals(((ObjectReaderImplMap) objectReaderAutoType3).instanceType)) {
                            map2 = (Map) objectReaderAutoType3.createInstance(j3);
                            enumMap = map2;
                        }
                    } else {
                        jSONReader2.nextIfMatch(c10);
                        objCast = string;
                    }
                }
                i10++;
                jSONReader3 = jSONReader;
                objCast = null;
            } else if (!jSONReader3.nextIfMatch(':')) {
                C0086a.m464w(jSONReader3.info("illegal json"));
                return null;
            }
            if (this.valueObjectReader == null) {
                this.valueObjectReader = context.provider.getObjectReader(this.valueType, (JSONReader.Feature.FieldBased.mask & j4) != 0);
            }
            Object object = this.valueObjectReader.readObject(jSONReader, this.valueType, obj, 0L);
            if (object != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j4) == 0) {
                Object objPut = map != null ? map.put(objCast, object) : enumMap.put(objCast, object);
                if (objPut != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j4) != 0) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(object);
                        enumMap.put(objCast, objPut);
                    } else {
                        enumMap.put(objCast, JSONArray.m1634of(objPut, object));
                    }
                }
            }
            i10++;
            jSONReader3 = jSONReader;
            objCast = null;
        }
        jSONReader.nextIfComma();
        Function function = this.builder;
        return function != null ? function.apply(enumMap) : enumMap;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        Class cls = this.instanceType;
        if (cls != null && !cls.isInterface()) {
            try {
                Constructor constructor = this.defaultConstructor;
                if (constructor != null) {
                    return constructor.newInstance(null);
                }
                return this.instanceType.newInstance();
            } catch (Exception e6) {
                C0086a.m465x("create map error", e6);
                return null;
            }
        }
        return new HashMap();
    }
}
