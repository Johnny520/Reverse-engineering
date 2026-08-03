package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectReader<T> {
    public static final long HASH_TYPE = 435678704704L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default T accept(T t9, Map map, long j3) {
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            FieldReader fieldReader = getFieldReader(string);
            if (fieldReader == null) {
                acceptExtra(t9, string, entry.getValue(), j3);
            } else {
                fieldReader.acceptAny(t9, value, j3);
            }
        }
        Function buildFunction = getBuildFunction();
        return buildFunction != null ? (T) buildFunction.apply(t9) : t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default ObjectReader autoType(JSONReader.Context context, long j3) {
        return context.getObjectReaderAutoType(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    default T createInstance(Map map, long j3) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(getTypeKey());
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = ((JSONReader.Feature.SupportAutoType.mask & j3) != 0 || (this instanceof ObjectReaderSeeAlso)) ? autoType(objectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = objectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j3);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return objectReaderAutoType.createInstance(map, j3);
            }
        }
        return accept(createInstance(0L), map, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default T createInstanceNoneDefaultConstructor(Map<Long, Object> map) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default Function getBuildFunction() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long getFeatures() {
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default FieldReader getFieldReaderLCase(long j3) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default Class<T> getObjectClass() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default String getTypeKey() {
        return "@type";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long getTypeKeyHash() {
        return HASH_TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.isArray() && jSONReader.isSupportBeanArray()) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j3);
        }
        jSONReader.nextIfObjectStart();
        int i9 = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == getTypeKeyHash() && i9 == 0) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.context;
                ObjectReader objectReaderAutoType = autoType(context, typeHashCode);
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        C0086a.m464w(jSONReader.info("No suitable ObjectReader found for" + string));
                        return null;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(getFeatures() | j3)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    jSONReader.skipValue();
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(jSONReader.context.features | j3);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i9++;
        }
        return tCreateInstance == null ? createInstance(jSONReader.context.features | j3) : tCreateInstance;
    }

    T readObject(JSONReader jSONReader, Type type, Object obj, long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    default T readObject(String str, JSONReader.Feature... featureArr) {
        JSONReader jSONReaderM1669of = JSONReader.m1669of(str, JSONFactory.createReadContext(featureArr));
        try {
            T object = readObject(jSONReaderM1669of, null, null, getFeatures());
            if (jSONReaderM1669of != null) {
                jSONReaderM1669of.close();
            }
            return object;
        } catch (Throwable th2) {
            if (jSONReaderM1669of == null) {
                throw th2;
            }
            try {
                jSONReaderM1669of.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default boolean setFieldValue(Object obj, String str, Object obj2) {
        FieldReader fieldReader = getFieldReader(str);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, obj2);
        return true;
    }

    default ObjectReader autoType(ObjectReaderProvider objectReaderProvider, long j3) {
        return objectReaderProvider.getObjectReader(j3);
    }

    default FieldReader getFieldReader(long j3) {
        return null;
    }

    default T readObject(JSONReader jSONReader) {
        return readObject(jSONReader, null, null, getFeatures());
    }

    default T readObject(JSONReader jSONReader, long j3) {
        return readObject(jSONReader, null, null, j3);
    }

    default T createInstance(long j3) {
        throw new UnsupportedOperationException();
    }

    default T createInstance(Collection collection) {
        return createInstance(collection, 0L);
    }

    default T createInstance(Collection collection, JSONReader.Feature... featureArr) {
        return createInstance(collection, JSONReader.Feature.m1683of(featureArr));
    }

    default T createInstance(Collection collection, long j3) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default T createInstance(Map map, JSONReader.Feature... featureArr) {
        long j3 = 0;
        for (JSONReader.Feature feature : featureArr) {
            j3 |= feature.mask;
        }
        return createInstance(map, j3);
    }

    default T createInstance() {
        return createInstance(0L);
    }

    default void acceptExtra(Object obj, String str, Object obj2, long j3) {
    }
}
