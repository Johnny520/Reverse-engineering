package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplObject extends ObjectReaderPrimitive {
    public static final ObjectReaderImplObject INSTANCE = new ObjectReaderImplObject();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplObject() {
        super(Object.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j3) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(getTypeKey());
        if (!(obj instanceof String)) {
            return map;
        }
        String str = (String) obj;
        ObjectReader objectReaderAutoType = (JSONReader.Feature.SupportAutoType.mask & j3) != 0 ? autoType(objectReaderProvider, Fnv.hashCode64(str)) : null;
        if (objectReaderAutoType != null || (objectReaderAutoType = objectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j3)) != null) {
            return objectReaderAutoType != this ? objectReaderAutoType.createInstance(map, j3) : map;
        }
        C0086a.m464w("No suitable ObjectReader found for".concat(str));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        ObjectReader objectReaderCheckAutoType;
        byte type2 = jSONReader.getType();
        if (type2 >= 73 && type2 <= 125) {
            return jSONReader.readString();
        }
        if (type2 == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(Object.class, 0L, j3)) != null) {
            return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        if (type2 != -81) {
            return jSONReader.readAny();
        }
        jSONReader.next();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        long j4;
        String str;
        long fieldNameHashCode;
        Object fieldName;
        Object string;
        Object objPut;
        String string2;
        ObjectReader objectReaderAutoType;
        Class objectClass;
        Class<?> clsLoadClass;
        if (jSONReader.jsonb) {
            return jSONReader.readAny();
        }
        JSONReader.Context context = jSONReader.context;
        long j5 = j3 | context.features;
        if (!jSONReader.isObject()) {
            char cCurrent = jSONReader.current();
            if (cCurrent == '/') {
                jSONReader.skipComment();
                cCurrent = jSONReader.current();
            }
            if (cCurrent == '\"' || cCurrent == '\'') {
                return jSONReader.readString();
            }
            if (cCurrent != '+') {
                if (cCurrent == 'S') {
                    if (!jSONReader.nextIfSet()) {
                        C0086a.m464w(jSONReader.info());
                        return null;
                    }
                    HashSet hashSet = new HashSet();
                    jSONReader.read(hashSet);
                    return hashSet;
                }
                if (cCurrent == '[') {
                    return jSONReader.readArray();
                }
                if (cCurrent != 'f') {
                    if (cCurrent == 'n') {
                        return jSONReader.readNullOrNewDate();
                    }
                    if (cCurrent != 't') {
                        if (cCurrent == 'x') {
                            return jSONReader.readBinary();
                        }
                        if (cCurrent != '-' && cCurrent != '.') {
                            switch (cCurrent) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    C0086a.m464w(jSONReader.info());
                                    return null;
                            }
                        }
                    }
                }
                return Boolean.valueOf(jSONReader.readBoolValue());
            }
            return jSONReader.readNumber();
        }
        jSONReader.nextIfObjectStart();
        if (jSONReader.isString()) {
            fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == ObjectReader.HASH_TYPE) {
                if (context.isEnabled(JSONReader.Feature.SupportAutoType)) {
                    objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.readTypeHashCode());
                    if (objectReaderAutoType == null || (objectClass = objectReaderAutoType.getObjectClass()) == null) {
                        string2 = null;
                        if (objectReaderAutoType == null) {
                            string2 = jSONReader.getString();
                            objectReaderAutoType = context.getObjectReaderAutoType(string2, null);
                        }
                    } else {
                        ClassLoader classLoader = objectClass.getClassLoader();
                        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                        if (classLoader != contextClassLoader) {
                            string2 = jSONReader.getString();
                            try {
                                clsLoadClass = contextClassLoader.loadClass(string2);
                            } catch (ClassNotFoundException unused) {
                                clsLoadClass = null;
                            }
                            if (clsLoadClass != null && !objectClass.equals(clsLoadClass)) {
                                objectReaderAutoType = context.getObjectReader(clsLoadClass);
                            }
                        }
                        if (objectReaderAutoType == null) {
                        }
                    }
                } else {
                    string2 = jSONReader.readString();
                    objectReaderAutoType = context.getObjectReaderAutoType(string2, null);
                    if (objectReaderAutoType == null && jSONReader.context.isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                        C0086a.m464w(jSONReader.info("autoType not support : " + string2));
                        return null;
                    }
                }
                if (objectReaderAutoType != null) {
                    jSONReader.setTypeRedirect(true);
                    return objectReaderAutoType.readObject(jSONReader, type, obj, j3);
                }
                j4 = j3;
                str = string2;
            } else {
                j4 = j3;
                str = null;
            }
        } else {
            j4 = j3;
            str = null;
            fieldNameHashCode = 0;
        }
        Supplier<Map> objectSupplier = jSONReader.context.getObjectSupplier();
        Map map = objectSupplier != null ? objectSupplier.get() : ((context.features | j4) & JSONReader.Feature.UseNativeObject.mask) != 0 ? new HashMap() : (Map) ObjectReaderImplMap.INSTANCE_OBJECT.createInstance(jSONReader.features(j4));
        if (str != null) {
            if (!str.equals("java.util.ImmutableCollections$Map1") && !str.equals("java.util.ImmutableCollections$MapN")) {
                map.put("@type", str);
            }
            fieldNameHashCode = 0;
        }
        int i9 = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            if (jSONReader.current() == '/') {
                jSONReader.skipComment();
            }
            if (i9 == 0 && str == null && fieldNameHashCode != 0) {
                fieldName = jSONReader.getFieldName();
            } else if (jSONReader.isNumber()) {
                fieldName = jSONReader.readNumber();
                jSONReader.nextIfMatch(':');
            } else {
                fieldName = jSONReader.readFieldName();
            }
            if (fieldName == null) {
                char cCurrent2 = jSONReader.current();
                if (cCurrent2 == '{' || cCurrent2 == '[') {
                    fieldName = jSONReader.readAny();
                    if (!jSONReader.nextIfMatch(':')) {
                        C0086a.m464w(jSONReader.info("illegal input"));
                        return null;
                    }
                } else {
                    fieldName = jSONReader.readFieldNameUnquote();
                    if (jSONReader.current() == ':') {
                        jSONReader.next();
                    }
                }
            }
            char cCurrent3 = jSONReader.current();
            if (cCurrent3 == '\"' || cCurrent3 == '\'') {
                string = jSONReader.readString();
            } else {
                if (cCurrent3 == '+') {
                    string = jSONReader.readNumber();
                } else if (cCurrent3 != 'S') {
                    if (cCurrent3 == '[') {
                        string = jSONReader.readArray();
                    } else if (cCurrent3 == 'f') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (cCurrent3 == 'n') {
                        string = jSONReader.readNullOrNewDate();
                    } else if (cCurrent3 != 't') {
                        if (cCurrent3 != '{') {
                            if (cCurrent3 != '-' && cCurrent3 != '.') {
                                switch (cCurrent3) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        C0086a.m464w(jSONReader.info());
                                        return null;
                                }
                            }
                            string = jSONReader.readNumber();
                        } else if (jSONReader.isReference()) {
                            String reference = jSONReader.readReference();
                            if ("..".equals(reference)) {
                                string = map;
                            } else {
                                jSONReader.addResolveTask(map, fieldName, JSONPath.m1657of(reference));
                            }
                        } else {
                            string = jSONReader.readObject();
                        }
                    }
                } else {
                    if (!jSONReader.nextIfSet()) {
                        C0086a.m464w(jSONReader.info());
                        return null;
                    }
                    string = jSONReader.read((Class<Object>) HashSet.class);
                }
                i9++;
            }
            if ((string != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j5) == 0) && (objPut = map.put(fieldName, string)) != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j5) != 0) {
                if (objPut instanceof Collection) {
                    ((Collection) objPut).add(string);
                    map.put(fieldName, objPut);
                } else {
                    map.put(fieldName, JSONArray.m1634of(objPut, string));
                }
            }
            i9++;
        }
        jSONReader.nextIfComma();
        return map;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        return new JSONObject();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        return collection;
    }
}
