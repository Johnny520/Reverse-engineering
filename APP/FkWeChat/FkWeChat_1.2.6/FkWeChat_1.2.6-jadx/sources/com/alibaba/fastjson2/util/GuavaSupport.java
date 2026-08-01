package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class GuavaSupport {
    static Class CLASS_ARRAYLIST_MULTI_MAP;
    static Class CLASS_IMMUTABLE_LIST;
    static Class CLASS_IMMUTABLE_MAP;
    static Class CLASS_IMMUTABLE_SET;
    static Supplier FUNC_ARRAYLIST_MULTI_MAP_CREATE;
    static Function FUNC_IMMUTABLE_LIST_COPY_OF;
    static Supplier FUNC_IMMUTABLE_LIST_OF_0;
    static Function FUNC_IMMUTABLE_LIST_OF_1;
    static Function FUNC_IMMUTABLE_MAP_COPY_OF;
    static Supplier FUNC_IMMUTABLE_MAP_OF_0;
    static BiFunction FUNC_IMMUTABLE_MAP_OF_1;
    static Function FUNC_IMMUTABLE_SET_COPY_OF;
    static Supplier FUNC_IMMUTABLE_SET_OF_0;
    static Function FUNC_IMMUTABLE_SET_OF_1;
    static BiFunction FUNC_SINGLETON_IMMUTABLE_BIMAP;
    static volatile boolean METHOD_ARRAYLIST_MULTI_MAP_ERROR;
    static Method METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ArrayListMultimapConvertFunction implements Function {
        final Supplier method;
        final Method putAllMethod;

        public ArrayListMultimapConvertFunction(Supplier supplier, Method method) {
            this.method = supplier;
            this.putAllMethod = method;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            Object obj2 = this.method.get();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                try {
                    this.putAllMethod.invoke(obj2, entry.getKey(), (Iterable) entry.getValue());
                } catch (Throwable th) {
                    C1565a.m6255a("putAll ArrayListMultimap error", th);
                    return null;
                }
            }
            return obj2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class AsMapWriter implements ObjectWriter {
        final Function asMap;
        final Class objectClass;
        final String typeName;
        final long typeNameHash;
        protected byte[] typeNameJSONB;

        public AsMapWriter(Class cls) {
            this.objectClass = cls;
            String typeName = TypeUtils.getTypeName(cls);
            this.typeName = typeName;
            this.typeNameHash = Fnv.hashCode64(typeName);
            try {
                this.asMap = LambdaMiscCodec.createFunction(cls.getMethod("asMap", null));
            } catch (NoSuchMethodException e10) {
                C1565a.m6255a("create Guava AsMapWriter error", e10);
                throw null;
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
            jSONWriter.write((Map<?, ?>) this.asMap.apply(obj));
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
            if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
                if (this.typeNameJSONB == null) {
                    this.typeNameJSONB = JSONB.toBytes(this.typeName);
                }
                jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
            }
            jSONWriter.write((Map<?, ?>) this.asMap.apply(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ImmutableListConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.CLASS_IMMUTABLE_LIST == null) {
                GuavaSupport.CLASS_IMMUTABLE_LIST = TypeUtils.loadClass("com.google.common.collect.ImmutableList");
            }
            if (GuavaSupport.CLASS_IMMUTABLE_LIST == null) {
                C1569c.m6258a("class not found : com.google.common.collect.ImmutableList");
                return null;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                if (GuavaSupport.FUNC_IMMUTABLE_LIST_OF_0 == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_LIST_OF_0 = LambdaMiscCodec.createSupplier(GuavaSupport.CLASS_IMMUTABLE_LIST.getMethod("of", null));
                    } catch (NoSuchMethodException e10) {
                        C1565a.m6255a("method not found : com.google.common.collect.ImmutableList.of", e10);
                        return null;
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_LIST_OF_0.get();
            }
            if (list.size() != 1) {
                if (GuavaSupport.FUNC_IMMUTABLE_LIST_COPY_OF == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_LIST_COPY_OF = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_LIST.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e11) {
                        C1565a.m6255a("method not found : com.google.common.collect.ImmutableList.copyOf", e11);
                        return null;
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_LIST_COPY_OF.apply(list);
            }
            if (GuavaSupport.FUNC_IMMUTABLE_LIST_OF_1 == null) {
                try {
                    GuavaSupport.FUNC_IMMUTABLE_LIST_OF_1 = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_LIST.getMethod("of", Object.class));
                } catch (NoSuchMethodException e12) {
                    C1565a.m6255a("method not found : com.google.common.collect.ImmutableList.of", e12);
                    return null;
                }
            }
            return GuavaSupport.FUNC_IMMUTABLE_LIST_OF_1.apply(list.get(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ImmutableSetConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.CLASS_IMMUTABLE_SET == null) {
                GuavaSupport.CLASS_IMMUTABLE_SET = TypeUtils.loadClass("com.google.common.collect.ImmutableSet");
            }
            if (GuavaSupport.CLASS_IMMUTABLE_SET == null) {
                C1569c.m6258a("class not found : com.google.common.collect.ImmutableSet");
                return null;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                if (GuavaSupport.FUNC_IMMUTABLE_SET_OF_0 == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_SET_OF_0 = LambdaMiscCodec.createSupplier(GuavaSupport.CLASS_IMMUTABLE_SET.getMethod("of", null));
                    } catch (NoSuchMethodException e10) {
                        C1565a.m6255a("method not found : com.google.common.collect.ImmutableSet.of", e10);
                        return null;
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_SET_OF_0.get();
            }
            if (list.size() != 1) {
                if (GuavaSupport.FUNC_IMMUTABLE_SET_COPY_OF == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_SET_COPY_OF = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_SET.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e11) {
                        C1565a.m6255a("method not found : com.google.common.collect.ImmutableSet.copyOf", e11);
                        return null;
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_SET_COPY_OF.apply(list);
            }
            if (GuavaSupport.FUNC_IMMUTABLE_SET_OF_1 == null) {
                try {
                    GuavaSupport.FUNC_IMMUTABLE_SET_OF_1 = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_SET.getMethod("of", Object.class));
                } catch (NoSuchMethodException e12) {
                    C1565a.m6255a("method not found : com.google.common.collect.ImmutableSet.of", e12);
                    return null;
                }
            }
            return GuavaSupport.FUNC_IMMUTABLE_SET_OF_1.apply(list.get(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ImmutableSingletonMapConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.CLASS_IMMUTABLE_MAP == null) {
                GuavaSupport.CLASS_IMMUTABLE_MAP = TypeUtils.loadClass("com.google.common.collect.ImmutableMap");
            }
            if (GuavaSupport.CLASS_IMMUTABLE_MAP == null) {
                C1569c.m6258a("class not found : com.google.common.collect.ImmutableMap");
                return null;
            }
            Map map = (Map) obj;
            if (map.size() == 0) {
                if (GuavaSupport.FUNC_IMMUTABLE_MAP_OF_0 == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_MAP_OF_0 = LambdaMiscCodec.createSupplier(GuavaSupport.CLASS_IMMUTABLE_MAP.getMethod("of", null));
                    } catch (NoSuchMethodException e10) {
                        C1565a.m6255a("method not found : com.google.common.collect.ImmutableMap.of", e10);
                        return null;
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_MAP_OF_0.get();
            }
            if (map.size() != 1) {
                if (GuavaSupport.FUNC_IMMUTABLE_MAP_COPY_OF == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_MAP_COPY_OF = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_MAP.getMethod("copyOf", Map.class));
                    } catch (NoSuchMethodException e11) {
                        C1565a.m6255a("method not found : com.google.common.collect.ImmutableBiMap.copyOf", e11);
                        return null;
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_MAP_COPY_OF.apply(map);
            }
            if (GuavaSupport.FUNC_IMMUTABLE_MAP_OF_1 == null) {
                try {
                    Method method = GuavaSupport.CLASS_IMMUTABLE_MAP.getMethod("of", Object.class, Object.class);
                    method.setAccessible(true);
                    GuavaSupport.FUNC_IMMUTABLE_MAP_OF_1 = LambdaMiscCodec.createBiFunction(method);
                } catch (NoSuchMethodException e12) {
                    C1565a.m6255a("method not found : com.google.common.collect.ImmutableBiMap.of", e12);
                    return null;
                }
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return GuavaSupport.FUNC_IMMUTABLE_MAP_OF_1.apply(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class SingletonImmutableBiMapConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.FUNC_SINGLETON_IMMUTABLE_BIMAP == null) {
                try {
                    GuavaSupport.FUNC_SINGLETON_IMMUTABLE_BIMAP = LambdaMiscCodec.createBiFunction(TypeUtils.loadClass("com.google.common.collect.SingletonImmutableBiMap").getDeclaredConstructor(Object.class, Object.class));
                } catch (NoSuchMethodException | SecurityException e10) {
                    C1565a.m6255a("method not found : com.google.common.collect.SingletonImmutableBiMap(Object, Object)", e10);
                    return null;
                }
            }
            Map.Entry entry = (Map.Entry) ((Map) obj).entrySet().iterator().next();
            return GuavaSupport.FUNC_SINGLETON_IMMUTABLE_BIMAP.apply(entry.getKey(), entry.getValue());
        }
    }

    public static ObjectWriter createAsMapWriter(Class cls) {
        return new AsMapWriter(cls);
    }

    public static Function createConvertFunction(Class cls) {
        Method method;
        if ("com.google.common.collect.ArrayListMultimap".equals(cls.getName())) {
            if (CLASS_ARRAYLIST_MULTI_MAP == null) {
                CLASS_ARRAYLIST_MULTI_MAP = cls;
            }
            if (!METHOD_ARRAYLIST_MULTI_MAP_ERROR && FUNC_ARRAYLIST_MULTI_MAP_CREATE == null) {
                try {
                    FUNC_ARRAYLIST_MULTI_MAP_CREATE = LambdaMiscCodec.createSupplier(CLASS_ARRAYLIST_MULTI_MAP.getMethod("create", null));
                } catch (Throwable unused) {
                    METHOD_ARRAYLIST_MULTI_MAP_ERROR = true;
                }
            }
            if (!METHOD_ARRAYLIST_MULTI_MAP_ERROR && METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL == null) {
                try {
                    METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL = CLASS_ARRAYLIST_MULTI_MAP.getMethod("putAll", Object.class, Iterable.class);
                } catch (Throwable unused2) {
                    METHOD_ARRAYLIST_MULTI_MAP_ERROR = true;
                }
            }
            Supplier supplier = FUNC_ARRAYLIST_MULTI_MAP_CREATE;
            if (supplier != null && (method = METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL) != null) {
                return new ArrayListMultimapConvertFunction(supplier, method);
            }
        }
        C1605j.m6294a("create map error : ", cls);
        return null;
    }

    public static Function immutableListConverter() {
        return new ImmutableListConvertFunction();
    }

    public static Function immutableMapConverter() {
        return new ImmutableSingletonMapConvertFunction();
    }

    public static Function immutableSetConverter() {
        return new ImmutableSetConvertFunction();
    }

    public static Function singletonBiMapConverter() {
        return new SingletonImmutableBiMapConvertFunction();
    }
}
