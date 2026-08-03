package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JSONObject1O;
import com.alibaba.fastjson2.util.ReferenceKey;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;
import java.util.function.Supplier;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.C0260j;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplMap implements ObjectReader {
    static final Function ENUM_MAP_BUILDER = new C0627f(22);
    public static final ObjectReaderImplMap INSTANCE = new ObjectReaderImplMap(null, HashMap.class, 77, HashMap.class, 0, null);
    public static final ObjectReaderImplMap INSTANCE_OBJECT = new ObjectReaderImplMap(null, JSONObject.class, -2622135058008237800L, JSONObject.class, 0, null);
    final Function builder;
    final boolean fastjson1x;
    final long features;
    final Type fieldType;
    volatile boolean instanceError;
    final Class instanceType;
    Object mapSingleton;
    final Class mapType;
    final long mapTypeHash;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class SingleMapBuilder implements Function<Map, Map> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.function.Function
        public Map apply(Map map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectReaderImplMap(Type type, Class cls, long j3, Class cls2, long j4, Function function) {
        this.fieldType = type;
        this.mapType = cls;
        this.mapTypeHash = j3;
        this.instanceType = cls2;
        this.features = j4;
        this.builder = function;
        this.fastjson1x = cls != null && cls.getName().equals("com.alibaba.fastjson.JSONObject");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Function createObjectSupplier(Class cls) {
        try {
            return new C0260j(cls.getConstructor(Map.class), 6);
        } catch (NoSuchMethodException unused) {
            C0086a.m464w("create JSONObject1 error");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createObjectSupplier$1(Constructor constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            C0086a.m464w("create JSONObject1 error");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$0(Object obj) {
        return new EnumMap((Map) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0163  */
    /* JADX INFO: renamed from: of */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ObjectReader m1732of(Type type, Class cls, long j3) {
        Type genericSuperclass;
        Class superclass;
        Class cls2;
        Function singleMapBuilder;
        char c10;
        String name;
        Function builderJSONObject1x;
        Type genericSuperclass2;
        Class cls3;
        Type[] actualTypeArguments;
        if (HttpUrl.FRAGMENT_ENCODE_SET.equals(cls.getSimpleName())) {
            superclass = cls.getSuperclass();
            genericSuperclass = type == null ? cls.getGenericSuperclass() : type;
        } else {
            genericSuperclass = type;
            superclass = cls;
        }
        String name2 = cls.getName();
        Class cls4 = HashMap.class;
        if (cls == Map.class || cls == AbstractMap.class || name2.equals("java.util.Collections$SingletonMap")) {
            cls2 = cls4;
        } else if (name2.equals("java.util.Collections$UnmodifiableMap")) {
            cls2 = LinkedHashMap.class;
        } else {
            if (cls == ConcurrentMap.class) {
                superclass = ConcurrentHashMap.class;
            } else {
                if (cls != ConcurrentNavigableMap.class) {
                    String typeName = TypeUtils.getTypeName(cls);
                    typeName.getClass();
                    if (typeName.equals("java.util.Collections$SynchronizedSortedMap")) {
                        singleMapBuilder = new C0627f(20);
                        cls2 = TreeMap.class;
                    } else if (typeName.equals("java.util.Collections$SynchronizedMap")) {
                        singleMapBuilder = new C0627f(19);
                        cls2 = cls4;
                    }
                    if (genericSuperclass instanceof ParameterizedType) {
                        c10 = 0;
                    } else {
                        Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                        c10 = 0;
                        if (actualTypeArguments2.length == 2 && !"org.springframework.util.LinkedMultiValueMap".equals(cls2.getName())) {
                            Type type2 = actualTypeArguments2[0];
                            Type type3 = actualTypeArguments2[1];
                            if (type2 == String.class && type3 == String.class && singleMapBuilder == null) {
                                return new ObjectReaderImplMapString(cls, cls2, j3);
                            }
                            return new ObjectReaderImplMapTyped(cls, cls2, type2, type3, 0L, singleMapBuilder);
                        }
                    }
                    if (genericSuperclass == null && j3 == 0) {
                        if (cls != cls4 && cls2 == cls4) {
                            return INSTANCE;
                        }
                        if (cls == JSONObject.class && cls2 == JSONObject.class) {
                            return INSTANCE_OBJECT;
                        }
                    }
                    name = cls2.getName();
                    if (!name.equals("com.alibaba.fastjson.JSONObject")) {
                        builderJSONObject1x = singleMapBuilder;
                    } else {
                        if (name.equals("java.util.Collections$EmptyMap")) {
                            return new ObjectReaderImplMap(cls2, j3, Collections.EMPTY_MAP);
                        }
                        if (name.equals("tf.u")) {
                            try {
                                Field field = cls2.getField("INSTANCE");
                                if (!field.isAccessible()) {
                                    field.setAccessible(true);
                                }
                                return new ObjectReaderImplMap(cls2, j3, field.get(null));
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                throw new IllegalStateException(AbstractC3199a.m6838k(cls2, "Failed to get singleton of "), e);
                            } catch (NoSuchFieldException e7) {
                                e = e7;
                                throw new IllegalStateException(AbstractC3199a.m6838k(cls2, "Failed to get singleton of "), e);
                            }
                        }
                        if (cls2 == JSONObject1O.class) {
                            builderJSONObject1x = JSONFactory.getBuilderJSONObject1x();
                            cls4 = LinkedHashMap.class;
                        } else {
                            if (name2.equals("java.util.Collections$UnmodifiableMap")) {
                                singleMapBuilder = new C0627f(21);
                            } else if (name2.equals("java.util.Collections$SingletonMap")) {
                                singleMapBuilder = new SingleMapBuilder();
                            }
                            builderJSONObject1x = singleMapBuilder;
                            cls4 = cls2;
                        }
                    }
                    genericSuperclass2 = cls4.getGenericSuperclass();
                    if (cls != JSONObject.class && (genericSuperclass2 instanceof ParameterizedType)) {
                        actualTypeArguments = ((ParameterizedType) genericSuperclass2).getActualTypeArguments();
                        if (actualTypeArguments.length == 2) {
                            Type type4 = actualTypeArguments[c10];
                            Type type5 = actualTypeArguments[1];
                            if (!(type4 instanceof TypeVariable) && !(type5 instanceof TypeVariable)) {
                                return new ObjectReaderImplMapTyped(cls, cls4, type4, type5, 0L, builderJSONObject1x);
                            }
                        }
                    }
                    Class cls5 = cls4;
                    if (cls != EnumMap.class) {
                        builderJSONObject1x = ENUM_MAP_BUILDER;
                        cls3 = LinkedHashMap.class;
                    } else {
                        cls3 = cls5;
                    }
                    return new ObjectReaderImplMap(genericSuperclass, cls, cls3, j3, builderJSONObject1x);
                }
                superclass = ConcurrentSkipListMap.class;
            }
            cls2 = superclass;
        }
        singleMapBuilder = null;
        if (genericSuperclass instanceof ParameterizedType) {
        }
        if (genericSuperclass == null) {
            if (cls != cls4) {
            }
            if (cls == JSONObject.class) {
                return INSTANCE_OBJECT;
            }
        }
        name = cls2.getName();
        if (!name.equals("com.alibaba.fastjson.JSONObject")) {
        }
        genericSuperclass2 = cls4.getGenericSuperclass();
        if (cls != JSONObject.class) {
            actualTypeArguments = ((ParameterizedType) genericSuperclass2).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
            }
        }
        Class cls52 = cls4;
        if (cls != EnumMap.class) {
        }
        return new ObjectReaderImplMap(genericSuperclass, cls, cls3, j3, builderJSONObject1x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        Class cls = this.instanceType;
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls == JSONObject.class) {
            return new JSONObject();
        }
        Object obj = this.mapSingleton;
        if (obj != null) {
            return obj;
        }
        String name = cls.getName();
        if (name.equals("java.util.ImmutableCollections$Map1")) {
            return new HashMap();
        }
        if (name.equals("java.util.ImmutableCollections$MapN")) {
            return new LinkedHashMap();
        }
        try {
            return this.instanceType.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            C0086a.m450i(this.instanceType, "create map error : ");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Function getBuildFunction() {
        return this.builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.mapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f3 A[EDGE_INSN: B:113:0x00f3->B:47:0x00f3 BREAK  A[LOOP:0: B:45:0x00eb->B:107:0x01e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        JSONException jSONException;
        Map map;
        Map map2;
        Map jSONObject;
        int i9;
        byte type2;
        Object any;
        Object obj2;
        JSONReader jSONReader2;
        Object obj3;
        Object object;
        Object any2;
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.mapType, this.mapTypeHash, this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType != this) {
            return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        JSONReader jSONReader3 = jSONReader;
        long j4 = j3;
        if (jSONReader3.nextIfNull()) {
            return null;
        }
        jSONReader3.nextIfMatch(JSONB.Constants.BC_OBJECT);
        long jFeatures = jSONReader3.features(j4);
        Supplier<Map> objectSupplier = jSONReader3.context.getObjectSupplier();
        if (this.mapType != null || objectSupplier == null) {
            Class cls = this.instanceType;
            if (cls == HashMap.class) {
                jSONObject = new HashMap();
            } else if (cls == LinkedHashMap.class) {
                jSONObject = new LinkedHashMap();
            } else if (cls == JSONObject.class) {
                jSONObject = new JSONObject();
            } else {
                if (cls == null || !cls.getName().equals("java.util.Collections$EmptyMap")) {
                    if (this.instanceError) {
                        jSONException = null;
                        map = null;
                    } else {
                        try {
                            map = (Map) this.instanceType.newInstance();
                            jSONException = null;
                        } catch (IllegalAccessException | InstantiationException unused) {
                            this.instanceError = true;
                            jSONException = new JSONException(jSONReader3.info("create map error " + this.instanceType));
                            map = null;
                        }
                    }
                    if (this.instanceError && Map.class.isAssignableFrom(this.instanceType.getSuperclass())) {
                        try {
                            map = (Map) this.instanceType.getSuperclass().newInstance();
                            jSONException = null;
                        } catch (IllegalAccessException | InstantiationException unused2) {
                            if (jSONException == null) {
                                jSONException = new JSONException(jSONReader3.info("create map error " + this.instanceType));
                            }
                        }
                    }
                    if (jSONException != null) {
                        throw jSONException;
                    }
                    map2 = map;
                    i9 = 0;
                    while (true) {
                        type2 = jSONReader3.getType();
                        if (type2 != -91) {
                            break;
                        }
                        if (type2 >= 73) {
                            any = jSONReader3.readFieldName();
                        } else if (jSONReader3.nextIfMatch(JSONB.Constants.BC_REFERENCE)) {
                            String string = jSONReader3.readString();
                            ReferenceKey referenceKey = new ReferenceKey(i9);
                            jSONReader3.addResolveTask(map2, referenceKey, JSONPath.m1657of(string));
                            obj2 = referenceKey;
                            if (jSONReader3.isReference()) {
                                byte type3 = jSONReader3.getType();
                                if (type3 >= 73 && type3 <= 125) {
                                    object = jSONReader3.readString();
                                    jSONReader2 = jSONReader3;
                                    obj3 = obj2;
                                } else if (type3 == -110) {
                                    ObjectReader objectReaderCheckAutoType2 = jSONReader3.checkAutoType(Object.class, 0L, this.features | j4);
                                    if (objectReaderCheckAutoType2 != null) {
                                        Object obj4 = obj2;
                                        any2 = objectReaderCheckAutoType2.readJSONBObject(jSONReader, null, obj4, j4);
                                        obj3 = obj4;
                                        jSONReader2 = jSONReader;
                                    } else {
                                        jSONReader2 = jSONReader;
                                        obj3 = obj2;
                                        any2 = jSONReader2.readAny();
                                    }
                                    object = any2;
                                } else {
                                    jSONReader2 = jSONReader3;
                                    obj3 = obj2;
                                    if (type3 == -79) {
                                        object = Boolean.TRUE;
                                        jSONReader2.next();
                                    } else if (type3 == -80) {
                                        object = Boolean.FALSE;
                                        jSONReader2.next();
                                    } else if (type3 == -109) {
                                        String reference = jSONReader2.readReference();
                                        if ("..".equals(reference)) {
                                            object = map2;
                                        } else {
                                            jSONReader2.addResolveTask(map2, obj3, JSONPath.m1657of(reference));
                                            object = null;
                                        }
                                    } else {
                                        object = type3 == -90 ? jSONReader2.readObject() : (type3 < -108 || type3 > -92) ? jSONReader2.readAny() : jSONReader2.readArray();
                                    }
                                }
                                if (object != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & jFeatures) == 0) {
                                    map2.put(obj3, object);
                                }
                            } else {
                                String reference2 = jSONReader3.readReference();
                                if ("..".equals(reference2)) {
                                    map2.put(obj2, map2);
                                } else {
                                    jSONReader3.addResolveTask(map2, obj2, JSONPath.m1657of(reference2));
                                    map2.put(obj2, null);
                                }
                                jSONReader2 = jSONReader3;
                            }
                            i9++;
                            j4 = j3;
                            jSONReader3 = jSONReader2;
                        } else {
                            any = jSONReader3.readAny();
                        }
                        obj2 = any;
                        if (jSONReader3.isReference()) {
                        }
                        i9++;
                        j4 = j3;
                        jSONReader3 = jSONReader2;
                    }
                    jSONReader3.next();
                    if (!this.fastjson1x) {
                        return JSONFactory.createJSONObject1(map2);
                    }
                    Function function = this.builder;
                    return function != null ? function.apply(map2) : map2;
                }
                jSONObject = Collections.EMPTY_MAP;
            }
        } else {
            jSONObject = objectSupplier.get();
        }
        map2 = jSONObject;
        i9 = 0;
        while (true) {
            type2 = jSONReader3.getType();
            if (type2 != -91) {
            }
            i9++;
            j4 = j3;
            jSONReader3 = jSONReader2;
        }
        jSONReader3.next();
        if (!this.fastjson1x) {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Class cls;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.nextIfNull()) {
            return null;
        }
        JSONReader.Context context = jSONReader.context;
        Supplier<Map> objectSupplier = context.getObjectSupplier();
        Map map = (objectSupplier == null || !((cls = this.mapType) == null || cls == JSONObject.class || "com.alibaba.fastjson.JSONObject".equals(cls.getName()))) ? (Map) createInstance(context.features | j3) : objectSupplier.get();
        if (!jSONReader.isString() || jSONReader.isTypeRedirect()) {
            jSONReader.read(map, j3);
        } else {
            String string = jSONReader.readString();
            if (!string.isEmpty()) {
                JSONReader jSONReaderM1669of = JSONReader.m1669of(string, jSONReader.getContext());
                try {
                    jSONReaderM1669of.read(map, j3);
                    jSONReaderM1669of.close();
                } finally {
                }
            }
        }
        jSONReader.nextIfComma();
        if (this.fastjson1x) {
            return JSONFactory.createJSONObject1(map);
        }
        Function function = this.builder;
        return function != null ? function.apply(map) : map;
    }

    public ObjectReaderImplMap(Type type, Class cls, Class cls2, long j3, Function function) {
        this(type, cls, Fnv.hashCode64(TypeUtils.getTypeName(cls)), cls2, j3, function);
    }

    public ObjectReaderImplMap(Class cls, long j3, Object obj) {
        this(cls, cls, cls, j3, null);
        this.mapSingleton = obj;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j3) {
        if (this.mapType.isInstance(map)) {
            return map;
        }
        if (this.mapType == JSONObject.class) {
            return new JSONObject(map);
        }
        Map map2 = (Map) createInstance(j3);
        map2.putAll(map);
        if (this.fastjson1x) {
            return JSONFactory.createJSONObject1(map2);
        }
        Function function = this.builder;
        return function != null ? function.apply(map2) : map2;
    }
}
