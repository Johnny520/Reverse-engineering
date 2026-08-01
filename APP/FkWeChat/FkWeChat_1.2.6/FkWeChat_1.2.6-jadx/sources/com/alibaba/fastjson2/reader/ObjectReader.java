package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectReader<T> {
    public static final long HASH_TYPE = Fnv.hashCode64("@type");
    public static final String VALUE_NAME = "@value";

    default T accept(T t10, Map map, long j10) {
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            FieldReader fieldReader = getFieldReader(string);
            if (fieldReader == null) {
                acceptExtra(t10, string, entry.getValue(), j10);
            } else {
                fieldReader.acceptAny(t10, value, j10);
            }
        }
        Function buildFunction = getBuildFunction();
        return buildFunction != null ? (T) buildFunction.apply(t10) : t10;
    }

    default void acceptExtra(Object obj, String str, Object obj2) {
        acceptExtra(obj, str, obj2, getFeatures());
    }

    default ObjectReader autoType(JSONReader.Context context, long j10) {
        return context.getObjectReaderAutoType(j10);
    }

    default T createInstance(Map map, long j10) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Object obj = map.get(getTypeKey());
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = ((JSONReader.Feature.SupportAutoType.mask & j10) != 0 || (this instanceof ObjectReaderSeeAlso)) ? autoType(defaultObjectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = defaultObjectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j10);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return objectReaderAutoType.createInstance(map, j10);
            }
        }
        return accept(createInstance(0L), map, j10);
    }

    default T createInstanceNoneDefaultConstructor(Map<Long, Object> map) {
        throw new UnsupportedOperationException();
    }

    default Function getBuildFunction() {
        return null;
    }

    default long getFeatures() {
        return 0L;
    }

    default FieldReader getFieldReader(String str) {
        long jHashCode64 = Fnv.hashCode64(str);
        FieldReader fieldReader = getFieldReader(jHashCode64);
        if (fieldReader == null && (fieldReader = getFieldReaderLCase(jHashCode64)) == null) {
            long jHashCode64LCase = Fnv.hashCode64LCase(str);
            if (jHashCode64LCase != jHashCode64) {
                return getFieldReaderLCase(jHashCode64LCase);
            }
        }
        return fieldReader;
    }

    default FieldReader getFieldReaderLCase(long j10) {
        return null;
    }

    default Class<T> getObjectClass() {
        return null;
    }

    default String getTypeKey() {
        return "@type";
    }

    default long getTypeKeyHash() {
        return HASH_TYPE;
    }

    default T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        throw new UnsupportedOperationException();
    }

    default T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        throw new UnsupportedOperationException();
    }

    default T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.isArray() && jSONReader.isSupportBeanArray()) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j10);
        }
        jSONReader.nextIfObjectStart();
        JSONReader.Context context = jSONReader.getContext();
        long features = context.getFeatures() | j10;
        int i10 = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == getTypeKeyHash() && i10 == 0) {
                ObjectReader objectReaderAutoType = autoType(context, jSONReader.readTypeHashCode());
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        C1569c.m6258a(jSONReader.info("No suitable ObjectReader found for " + string));
                        return null;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j10);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(getFeatures() | features)) {
                    long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                    if (nameHashCodeLCase != fieldNameHashCode) {
                        fieldReader = getFieldReaderLCase(nameHashCodeLCase);
                    }
                }
                if (fieldReader == null) {
                    jSONReader.skipValue();
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(features);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i10++;
        }
        return tCreateInstance != null ? tCreateInstance : createInstance(features);
    }

    T readObject(JSONReader jSONReader, Type type, Object obj, long j10);

    default T readObject(String str, JSONReader.Feature... featureArr) {
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, JSONFactory.createReadContext(featureArr));
        try {
            T object = readObject(jSONReaderM6229of, null, null, getFeatures());
            if (jSONReaderM6229of != null) {
                jSONReaderM6229of.close();
            }
            return object;
        } catch (Throwable th) {
            if (jSONReaderM6229of == null) {
                throw th;
            }
            try {
                jSONReaderM6229of.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    default boolean setFieldValue(Object obj, String str, long j10, int i10) {
        FieldReader fieldReader = getFieldReader(j10);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, i10);
        return true;
    }

    default ObjectReader autoType(ObjectReaderProvider objectReaderProvider, long j10) {
        return objectReaderProvider.getObjectReader(j10);
    }

    default void acceptExtra(Object obj, String str, Object obj2, long j10) {
    }

    default boolean setFieldValue(Object obj, String str, long j10, long j11) {
        FieldReader fieldReader = getFieldReader(j10);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, j11);
        return true;
    }

    default boolean setFieldValue(Object obj, String str, Object obj2) {
        FieldReader fieldReader = getFieldReader(str);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, obj2);
        return true;
    }

    default FieldReader getFieldReader(long j10) {
        return null;
    }

    default T readObject(JSONReader jSONReader) {
        return readObject(jSONReader, null, null, getFeatures());
    }

    default T readObject(JSONReader jSONReader, long j10) {
        return readObject(jSONReader, null, null, j10);
    }

    default T createInstance(long j10) {
        throw new UnsupportedOperationException();
    }

    default T createInstance(Collection collection) {
        return createInstance(collection, 0L);
    }

    default T createInstance(Collection collection, JSONReader.Feature... featureArr) {
        return createInstance(collection, JSONReader.Feature.m6243of(featureArr));
    }

    default T createInstance(Collection collection, long j10) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default T createInstance(Map map, JSONReader.Feature... featureArr) {
        long j10 = 0;
        for (JSONReader.Feature feature : featureArr) {
            j10 |= feature.mask;
        }
        return createInstance(map, j10);
    }

    default T createInstance() {
        return createInstance(0L);
    }
}
