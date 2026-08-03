package com.alibaba.fastjson2;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import com.alibaba.fastjson2.reader.ObjectReaderImplMap;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.NameCacheEntry;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class JSONFactory {
    static final ObjectReader<JSONArray> ARRAY_READER;
    static final AtomicReferenceFieldUpdater<CacheItem, byte[]> BYTES_UPDATER;
    static final CacheItem[] CACHE_ITEMS;
    static final int CACHE_THRESHOLD = 1048576;
    static final AtomicReferenceFieldUpdater<CacheItem, char[]> CHARS_UPDATER;
    static Supplier JSON_ARRAY_1x_SUPPLIER = null;
    static Class JSON_ARRAY_CLASS_1x = null;
    static Function JSON_OBJECT_1x_BUILDER = null;
    static Function JSON_OBJECT_1x_INNER_MAP = null;
    static Supplier JSON_OBJECT_1x_SUPPLIER = null;
    static Class JSON_OBJECT_CLASS_1x = null;
    static volatile boolean JSON_REFLECT_1x_ERROR = false;
    static final ObjectReader<JSONObject> OBJECT_READER;
    static final char[] UUID_LOOKUP;
    static final byte[] UUID_VALUES;
    static Supplier<List> defaultArraySupplier = null;
    static int defaultDecimalMaxScale = 2048;
    public static final ObjectReaderProvider defaultObjectReaderProvider;
    static Supplier<Map> defaultObjectSupplier;
    public static final ObjectWriterProvider defaultObjectWriterProvider;
    static long defaultReaderFeatures;
    static String defaultReaderFormat;
    static ZoneId defaultReaderZoneId;
    static long defaultWriterFeatures;
    static String defaultWriterFormat;
    static ZoneId defaultWriterZoneId;
    static final NameCacheEntry[] NAME_CACHE = new NameCacheEntry[8192];
    static final NameCacheEntry2[] NAME_CACHE2 = new NameCacheEntry2[8192];
    static final BigDecimal LOW = BigDecimal.valueOf(-9007199254740991L);
    static final BigDecimal HIGH = BigDecimal.valueOf(9007199254740991L);
    static final BigInteger LOW_BIGINT = BigInteger.valueOf(-9007199254740991L);
    static final BigInteger HIGH_BIGINT = BigInteger.valueOf(9007199254740991L);

    /* JADX INFO: renamed from: CA */
    static final char[] f1928CA = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    static final int[] DIGITS2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15};
    static final float[] FLOAT_10_POW = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    static final double[] DOUBLE_10_POW = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    static final Double DOUBLE_ZERO = Double.valueOf(0.0d);

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CacheItem {
        volatile byte[] bytes;
        volatile char[] chars;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FJ1ObjectInnerSupplier implements Function {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private FJ1ObjectInnerSupplier() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (obj instanceof com.alibaba.fastjson.JSONObject) {
                return ((com.alibaba.fastjson.JSONObject) obj).getInnerMap();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FJ1OjbectBuilder implements Function {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private FJ1OjbectBuilder() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            return new com.alibaba.fastjson.JSONObject((Map) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class NameCacheEntry2 {
        final String name;
        final long value0;
        final long value1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public NameCacheEntry2(String str, long j3, long j4) {
            this.name = str;
            this.value0 = j3;
            this.value1 = j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        CacheItem[] cacheItemArr = new CacheItem[16];
        for (int i9 = 0; i9 < 16; i9++) {
            cacheItemArr[i9] = new CacheItem();
        }
        CACHE_ITEMS = cacheItemArr;
        CHARS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, char[].class, "chars");
        BYTES_UPDATER = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, byte[].class, "bytes");
        defaultObjectWriterProvider = new ObjectWriterProvider();
        defaultObjectReaderProvider = new ObjectReaderProvider();
        ARRAY_READER = ObjectReaderImplList.JSON_ARRAY_READER;
        OBJECT_READER = ObjectReaderImplMap.INSTANCE_OBJECT;
        UUID_LOOKUP = new char[Opcodes.ACC_NATIVE];
        UUID_VALUES = new byte[55];
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = (i10 >> 4) & 15;
            int i12 = i10 & 15;
            UUID_LOOKUP[i10] = (char) (((i11 < 10 ? i11 + 48 : i11 + 87) << 8) + (i12 < 10 ? i12 + 48 : i12 + 87));
        }
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            int i13 = c10 - '0';
            UUID_VALUES[i13] = (byte) i13;
        }
        for (char c11 = 'a'; c11 <= 'f'; c11 = (char) (c11 + 1)) {
            UUID_VALUES[c11 - '0'] = (byte) (c11 - 'W');
        }
        for (char c12 = 'A'; c12 <= 'F'; c12 = (char) (c12 + 1)) {
            UUID_VALUES[c12 - '0'] = (byte) (c12 - '7');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map createJSONObject1(Map map) {
        return new com.alibaba.fastjson.JSONObject(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONReader.Context createReadContext(Supplier<Map> supplier, Supplier<List> supplier2, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        context.setObjectSupplier(supplier);
        context.setArraySupplier(supplier2);
        context.config(featureArr);
        return context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONWriter.Context createWriteContext(ObjectWriterProvider objectWriterProvider, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        context.config(featureArr);
        return context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Function getBuilderJSONObject1x() {
        if (JSON_OBJECT_1x_BUILDER == null && !JSON_REFLECT_1x_ERROR && getClassJSONObject1x() != null) {
            try {
                JSON_OBJECT_1x_BUILDER = new FJ1OjbectBuilder();
            } catch (Throwable unused) {
                JSON_REFLECT_1x_ERROR = true;
                C0086a.m464w("create JSONObject1 error");
                return null;
            }
        }
        return JSON_OBJECT_1x_BUILDER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class getClassJSONArray1x() {
        if (JSON_ARRAY_CLASS_1x == null && !JSON_REFLECT_1x_ERROR) {
            try {
                JSON_ARRAY_CLASS_1x = com.alibaba.fastjson.JSONArray.class;
            } catch (Throwable unused) {
                JSON_REFLECT_1x_ERROR = true;
            }
        }
        return JSON_ARRAY_CLASS_1x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class getClassJSONObject1x() {
        if (JSON_OBJECT_CLASS_1x == null && !JSON_REFLECT_1x_ERROR) {
            try {
                JSON_OBJECT_CLASS_1x = com.alibaba.fastjson.JSONObject.class;
            } catch (Throwable unused) {
                JSON_REFLECT_1x_ERROR = true;
            }
        }
        return JSON_OBJECT_CLASS_1x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Supplier<List> getDefaultArraySupplier() {
        return defaultArraySupplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectReaderProvider getDefaultObjectReaderProvider() {
        return defaultObjectReaderProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Supplier<Map> getDefaultObjectSupplier() {
        return defaultObjectSupplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectWriterProvider getDefaultObjectWriterProvider() {
        return defaultObjectWriterProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getDefaultReaderFeatures() {
        return defaultReaderFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Function getInnerMap() {
        if (JSON_OBJECT_1x_INNER_MAP == null && !JSON_REFLECT_1x_ERROR && getClassJSONObject1x() != null) {
            try {
                JSON_OBJECT_1x_INNER_MAP = new FJ1ObjectInnerSupplier();
            } catch (Throwable unused) {
                JSON_REFLECT_1x_ERROR = true;
                C0086a.m464w("create getInnerMap error");
                return null;
            }
        }
        return JSON_OBJECT_1x_INNER_MAP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectReader getObjectReader(Type type, long j3) {
        return getDefaultObjectReaderProvider().getObjectReader(type, JSONReader.Feature.FieldBased.isEnabled(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectWriter getObjectWriter(Type type, long j3) {
        return getDefaultObjectWriterProvider().getObjectWriter(type, TypeUtils.getClass(type), JSONWriter.Feature.FieldBased.isEnabled(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setDefaultArraySupplier(Supplier<List> supplier) {
        defaultArraySupplier = supplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setDefaultObjectSupplier(Supplier<Map> supplier) {
        defaultObjectSupplier = supplier;
    }

    public static JSONWriter.Context createWriteContext() {
        return new JSONWriter.Context(defaultObjectWriterProvider);
    }

    public static JSONWriter.Context createWriteContext(JSONWriter.Feature... featureArr) {
        return new JSONWriter.Context(defaultObjectWriterProvider, featureArr);
    }

    public static JSONReader.Context createReadContext(long j3) {
        return new JSONReader.Context(defaultObjectReaderProvider, j3);
    }

    public static JSONReader.Context createReadContext(JSONReader.Feature... featureArr) {
        return new JSONReader.Context(defaultObjectReaderProvider, featureArr);
    }

    public static JSONReader.Context createReadContext(Filter filter, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        context.config(filter);
        return context;
    }

    public static JSONReader.Context createReadContext(Filter[] filterArr, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        context.config(filterArr, new JSONReader.Feature[0]);
        return context;
    }

    public static JSONReader.Context createReadContext(ObjectReaderProvider objectReaderProvider, JSONReader.Feature... featureArr) {
        if (objectReaderProvider == null) {
            objectReaderProvider = defaultObjectReaderProvider;
        }
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext(SymbolTable symbolTable) {
        return new JSONReader.Context(defaultObjectReaderProvider, symbolTable);
    }

    public static JSONReader.Context createReadContext(SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, symbolTable);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext(Supplier<Map> supplier, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        context.setObjectSupplier(supplier);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext() {
        return new JSONReader.Context(defaultObjectReaderProvider);
    }
}
