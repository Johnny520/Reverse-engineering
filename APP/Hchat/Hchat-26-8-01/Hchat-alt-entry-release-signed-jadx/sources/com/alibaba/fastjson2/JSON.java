package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.AfterFilter;
import com.alibaba.fastjson2.filter.BeforeFilter;
import com.alibaba.fastjson2.filter.ContextNameFilter;
import com.alibaba.fastjson2.filter.ContextValueFilter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.filter.LabelFilter;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.MapMultiValueType;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface JSON {
    public static final String VERSION = "2.0.60";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void config(JSONReader.Feature feature, boolean z9) {
        if (feature == JSONReader.Feature.SupportAutoType && z9) {
            C0086a.m464w("not support config global autotype support");
        } else if (z9) {
            JSONFactory.defaultReaderFeatures = feature.mask | JSONFactory.defaultReaderFeatures;
        } else {
            JSONFactory.defaultReaderFeatures = (~feature.mask) & JSONFactory.defaultReaderFeatures;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SafeVarargs
    static void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        JSONFactory.getDefaultObjectWriterProvider().configEnumAsJavaBean(clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void configReaderDateFormat(String str) {
        JSONFactory.defaultReaderFormat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void configReaderZoneId(ZoneId zoneId) {
        JSONFactory.defaultReaderZoneId = zoneId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void configWriterDateFormat(String str) {
        JSONFactory.defaultWriterFormat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void configWriterZoneId(ZoneId zoneId) {
        JSONFactory.defaultWriterZoneId = zoneId;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> T copy(T t9, JSONWriter.Feature... featureArr) throws Throwable {
        JSONReader jSONReader;
        if (t9 == null) {
            return null;
        }
        Class<?> cls = t9.getClass();
        if (ObjectWriterProvider.isPrimitiveOrEnum(cls)) {
            return t9;
        }
        boolean z9 = false;
        long j3 = 0;
        boolean z10 = false;
        for (JSONWriter.Feature feature : featureArr) {
            j3 |= feature.mask;
            if (feature == JSONWriter.Feature.FieldBased) {
                z10 = true;
            } else if (feature == JSONWriter.Feature.BeanToArray) {
                z9 = true;
            }
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter(cls, cls, z10);
        ObjectReader objectReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, z10);
        if ((objectWriter instanceof ObjectWriterAdapter) && (objectReader instanceof ObjectReaderBean)) {
            List<FieldWriter> fieldWriters = objectWriter.getFieldWriters();
            if (objectReader instanceof ObjectReaderNoneDefaultConstructor) {
                HashMap map = new HashMap(fieldWriters.size());
                for (int i9 = 0; i9 < fieldWriters.size(); i9++) {
                    FieldWriter fieldWriter = fieldWriters.get(i9);
                    map.put(fieldWriter.fieldName, fieldWriter.getFieldValue(t9));
                }
                return (T) objectReader.createInstance(map, j3);
            }
            T t10 = (T) objectReader.createInstance(j3);
            for (int i10 = 0; i10 < fieldWriters.size(); i10++) {
                FieldWriter fieldWriter2 = fieldWriters.get(i10);
                FieldReader fieldReader = objectReader.getFieldReader(fieldWriter2.fieldName);
                if (fieldReader != null) {
                    fieldReader.accept(t10, copy(fieldWriter2.getFieldValue(t9), new JSONWriter.Feature[0]));
                }
            }
            return t10;
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.config(JSONWriter.Feature.WriteClassName);
            objectWriter.writeJSONB(jSONWriterOfJSONB, t9, null, null, 0L);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            JSONReader jSONReaderOfJSONB = JSONReader.ofJSONB(bytes, JSONReader.Feature.SupportAutoType, JSONReader.Feature.SupportClassForName);
            if (!z9) {
                jSONReader = jSONReaderOfJSONB;
                T t11 = (T) objectReader.readJSONBObject(jSONReader, null, null, j3);
                if (jSONReader != null) {
                }
                return t11;
            }
            try {
                jSONReaderOfJSONB.context.config(JSONReader.Feature.SupportArrayToBean);
                jSONReader = jSONReaderOfJSONB;
                try {
                    T t112 = (T) objectReader.readJSONBObject(jSONReader, null, null, j3);
                    if (jSONReader != null) {
                        jSONReader.close();
                    }
                    return t112;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                jSONReader = jSONReaderOfJSONB;
            }
            Throwable th4 = th;
            if (jSONReader == null) {
                throw th4;
            }
            try {
                jSONReader.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T copyTo(Object obj, Class<T> cls, JSONWriter.Feature... featureArr) throws Throwable {
        if (obj == null) {
            return null;
        }
        Class<?> cls2 = obj.getClass();
        long j3 = 0;
        boolean z9 = false;
        boolean z10 = false;
        for (JSONWriter.Feature feature : featureArr) {
            j3 |= feature.mask;
            if (feature == JSONWriter.Feature.FieldBased) {
                z9 = true;
            } else if (feature == JSONWriter.Feature.BeanToArray) {
                z10 = true;
            }
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter(cls2, cls2, z9);
        ObjectReader objectReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, z9);
        if ((objectWriter instanceof ObjectWriterAdapter) && (objectReader instanceof ObjectReaderBean)) {
            List<FieldWriter> fieldWriters = objectWriter.getFieldWriters();
            if (objectReader instanceof ObjectReaderNoneDefaultConstructor) {
                HashMap map = new HashMap(fieldWriters.size());
                for (int i9 = 0; i9 < fieldWriters.size(); i9++) {
                    FieldWriter fieldWriter = fieldWriters.get(i9);
                    map.put(fieldWriter.fieldName, fieldWriter.getFieldValue(obj));
                }
                return (T) objectReader.createInstance(map, j3);
            }
            T t9 = (T) objectReader.createInstance(j3);
            for (int i10 = 0; i10 < fieldWriters.size(); i10++) {
                FieldWriter fieldWriter2 = fieldWriters.get(i10);
                FieldReader fieldReader = objectReader.getFieldReader(fieldWriter2.fieldName);
                if (fieldReader != null) {
                    Object fieldValue = fieldWriter2.getFieldValue(obj);
                    Class cls3 = fieldWriter2.fieldClass;
                    if (cls3 == Date.class && fieldReader.fieldClass == String.class) {
                        fieldValue = DateUtils.format((Date) fieldValue, fieldWriter2.format);
                    } else if (cls3 == LocalDate.class && fieldReader.fieldClass == String.class) {
                        fieldValue = DateUtils.format((LocalDate) fieldValue, fieldWriter2.format);
                    } else if (fieldValue != null && !fieldReader.supportAcceptType(fieldValue.getClass())) {
                        fieldValue = copy(fieldValue, new JSONWriter.Feature[0]);
                    }
                    fieldReader.accept(t9, fieldValue);
                }
            }
            return t9;
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.config(JSONWriter.Feature.WriteClassName);
            objectWriter.writeJSONB(jSONWriterOfJSONB, obj, null, null, 0L);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            JSONReader jSONReaderOfJSONB = JSONReader.ofJSONB(bytes, JSONReader.Feature.SupportAutoType, JSONReader.Feature.SupportClassForName);
            if (z10) {
                try {
                    jSONReaderOfJSONB.context.config(JSONReader.Feature.SupportArrayToBean);
                } finally {
                }
            }
            T t10 = (T) objectReader.readJSONBObject(jSONReaderOfJSONB, null, null, 0L);
            if (jSONReaderOfJSONB != null) {
                jSONReaderOfJSONB.close();
            }
            return t10;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static boolean isEnabled(JSONReader.Feature feature) {
        return (JSONFactory.defaultReaderFeatures & feature.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValid(String str, JSONReader.Feature... featureArr) {
        boolean z9;
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderM1669of = JSONReader.m1669of(str, JSONFactory.createReadContext(featureArr));
                try {
                    jSONReaderM1669of.skipValue();
                    if (jSONReaderM1669of.isEnd()) {
                        z9 = !jSONReaderM1669of.comma;
                    }
                    jSONReaderM1669of.close();
                    return z9;
                } catch (Throwable th2) {
                    if (jSONReaderM1669of != null) {
                        try {
                            jSONReaderM1669of.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValidArray(String str) {
        boolean z9;
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderM1666of = JSONReader.m1666of(str);
                try {
                    if (!jSONReaderM1666of.isArray()) {
                        jSONReaderM1666of.close();
                        return false;
                    }
                    jSONReaderM1666of.skipValue();
                    if (jSONReaderM1666of.isEnd()) {
                        z9 = !jSONReaderM1666of.comma;
                    }
                    jSONReaderM1666of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValidObject(String str) {
        boolean z9;
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderM1666of = JSONReader.m1666of(str);
                try {
                    if (!jSONReaderM1666of.isObject()) {
                        jSONReaderM1666of.close();
                        return false;
                    }
                    jSONReaderM1666of.skipValue();
                    if (jSONReaderM1666of.isEnd()) {
                        z9 = !jSONReaderM1666of.comma;
                    }
                    jSONReaderM1666of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void mixIn(Class<?> cls, Class<?> cls2) {
        JSONFactory.defaultObjectWriterProvider.mixIn(cls, cls2);
        JSONFactory.defaultObjectReaderProvider.mixIn(cls, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(String str) {
        Object object;
        Object obj;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            char cCurrent = jSONReaderUTF16.current();
            if (context.objectSupplier == null && (context.features & JSONReader.Feature.UseNativeObject.mask) == 0 && (cCurrent == '{' || cCurrent == '[')) {
                if (cCurrent == '{') {
                    JSONObject jSONObject = new JSONObject();
                    jSONReaderUTF16.read(jSONObject, 0L);
                    obj = jSONObject;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    jSONReaderUTF16.read((List) jSONArray);
                    obj = jSONArray;
                }
                object = obj;
                if (jSONReaderUTF16.resolveTasks != null) {
                    jSONReaderUTF16.handleResolveTasks(obj);
                    object = obj;
                }
            } else {
                object = defaultObjectReaderProvider.getObjectReader(Object.class, false).readObject(jSONReaderUTF16, null, null, 0L);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return object;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static <T> List<T> parseArray(String str, Type[] typeArr, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            jSONReaderUTF16.startArray();
            ArrayList arrayList = new ArrayList(typeArr.length);
            for (Type type : typeArr) {
                arrayList.add(jSONReaderUTF16.read(type));
            }
            jSONReaderUTF16.endArray();
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(arrayList);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: java.util.function.Consumer<T> */
    /* JADX WARN: Multi-variable type inference failed */
    static <T> void parseObject(InputStream inputStream, Charset charset, char c10, Type type, Consumer<T> consumer, JSONReader.Feature... featureArr) {
        int i9;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        ObjectReader objectReader = null;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int i10 = 524288;
        if (andSet == null) {
            andSet = new byte[524288];
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        long j3 = 0;
        boolean z9 = (context.features & JSONReader.Feature.FieldBased.mask) != 0;
        byte[] bArrCopyOf = andSet;
        int length = 0;
        int i11 = 0;
        while (true) {
            try {
                try {
                    int i12 = inputStream.read(bArrCopyOf, length, bArrCopyOf.length - length);
                    if (i12 == -1) {
                        JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
                        return;
                    }
                    int i13 = length + i12;
                    boolean z10 = false;
                    while (length < i13) {
                        int i14 = i10;
                        long j4 = j3;
                        if (bArrCopyOf[length] == c10) {
                            JSONReader jSONReaderM1677of = JSONReader.m1677of(bArrCopyOf, i11, length - i11, charset, context);
                            if (objectReader == null) {
                                objectReader = objectReaderProvider.getObjectReader(type, z9);
                            }
                            i9 = length;
                            ObjectReader objectReader2 = objectReader;
                            Object object = objectReader2.readObject(jSONReaderM1677of, type, null, 0L);
                            if (jSONReaderM1677of.resolveTasks != null) {
                                jSONReaderM1677of.handleResolveTasks(object);
                            }
                            if (jSONReaderM1677of.f1929ch != 26 && (jSONReaderM1677of.context.features & JSONReader.Feature.IgnoreCheckClose.mask) == j4) {
                                throw new JSONException(jSONReaderM1677of.info("input not end"));
                            }
                            consumer.accept(object);
                            i11 = i9 + 1;
                            z10 = true;
                            objectReader = objectReader2;
                        } else {
                            i9 = length;
                        }
                        length = i9 + 1;
                        i10 = i14;
                        j3 = j4;
                    }
                    int i15 = i10;
                    long j5 = j3;
                    if (i13 == bArrCopyOf.length) {
                        if (z10) {
                            length = bArrCopyOf.length - i11;
                            System.arraycopy(bArrCopyOf, i11, bArrCopyOf, 0, length);
                            i11 = 0;
                            i10 = i15;
                            j3 = j5;
                        } else {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + i15);
                        }
                    }
                    length = i13;
                    i10 = i15;
                    j3 = j5;
                } catch (IOException e6) {
                    throw new JSONException("JSON#parseObject cannot parse the 'InputStream' to '" + type + "'", e6);
                }
            } catch (Throwable th2) {
                JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
                throw th2;
            }
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void register(Class cls, Filter filter) {
        if ((filter instanceof AfterFilter) || (filter instanceof BeforeFilter) || (filter instanceof ContextNameFilter) || (filter instanceof ContextValueFilter) || (filter instanceof LabelFilter) || (filter instanceof NameFilter) || (filter instanceof PropertyFilter) || (filter instanceof PropertyPreFilter) || (filter instanceof ValueFilter)) {
            JSONFactory.defaultObjectWriterProvider.getObjectWriter(cls).setFilter(filter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static ObjectReader<?> registerIfAbsent(Type type, ObjectReader<?> objectReader) {
        return JSONFactory.defaultObjectReaderProvider.registerIfAbsent(type, objectReader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void registerSeeAlsoSubType(Class cls, String str) {
        JSONFactory.defaultObjectReaderProvider.registerSeeAlsoSubType(cls, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: to */
    static <T> T m1632to(Class<T> cls, Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof JSONObject ? (T) ((JSONObject) obj).m1654to((Class) cls, new JSONReader.Feature[0]) : (T) TypeUtils.cast(obj, (Class) cls, JSONFactory.defaultObjectReaderProvider);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static Object toJSON(Object obj, JSONWriter.Feature... featureArr) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        JSONWriter.Context contextCreateWriteContext = featureArr == null ? JSONFactory.createWriteContext() : JSONFactory.createWriteContext(featureArr);
        Class<?> cls = obj.getClass();
        ObjectWriter objectWriter = contextCreateWriteContext.getObjectWriter(cls, cls);
        if ((objectWriter instanceof ObjectWriterAdapter) && !contextCreateWriteContext.isEnabled(JSONWriter.Feature.ReferenceDetection) && (objectWriter.getFeatures() & JSONWriter.Feature.WriteClassName.mask) == 0) {
            return ((ObjectWriterAdapter) objectWriter).toJSONObject(obj, contextCreateWriteContext.features);
        }
        try {
            JSONWriter jSONWriterM1685of = JSONWriter.m1685of(contextCreateWriteContext);
            try {
                objectWriter.write(jSONWriterM1685of, obj, null, null, contextCreateWriteContext.features);
                String string = jSONWriterM1685of.toString();
                jSONWriterM1685of.close();
                return parse(string);
            } finally {
            }
        } catch (NullPointerException | NumberFormatException e6) {
            C0086a.m465x("toJSONString error", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toJSONBytes(Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriterUTF8 jSONWriterUTF8 = new JSONWriterUTF8(context);
        try {
            if (obj == null) {
                jSONWriterUTF8.writeNull();
            } else {
                jSONWriterUTF8.rootObject = obj;
                jSONWriterUTF8.path = JSONWriter.Path.ROOT;
                if (str != null && !str.isEmpty()) {
                    jSONWriterUTF8.context.setDateFormat(str);
                }
                if (filterArr != null && filterArr.length != 0) {
                    jSONWriterUTF8.context.configFilter(filterArr);
                }
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterUTF8.getBytes();
            jSONWriterUTF8.close();
            return bytes;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static String toJSONString(Object obj) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        try {
            JSONWriter jSONWriterUTF8 = (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.OptimizedForAscii.mask) != 0 ? new JSONWriterUTF8(context) : new JSONWriterUTF16(context);
            try {
                try {
                    if (obj == null) {
                        jSONWriterUTF8.writeNull();
                    } else {
                        jSONWriterUTF8.rootObject = obj;
                        jSONWriterUTF8.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        if (cls != JSONObject.class || context.features != 0) {
                            try {
                                objectWriterProvider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterUTF8, obj, null, null, 0L);
                                String string = jSONWriterUTF8.toString();
                                jSONWriterUTF8.close();
                                return string;
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                try {
                                    jSONWriterUTF8.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                        jSONWriterUTF8.write((JSONObject) obj);
                    }
                    String string2 = jSONWriterUTF8.toString();
                    jSONWriterUTF8.close();
                    return string2;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (NullPointerException e6) {
                e = e6;
                C0086a.m455n("JSON#toJSONString cannot serialize '", obj, "'", e);
                return null;
            } catch (NumberFormatException e7) {
                e = e7;
                C0086a.m455n("JSON#toJSONString cannot serialize '", obj, "'", e);
                return null;
            }
        } catch (NullPointerException e10) {
            e = e10;
            C0086a.m455n("JSON#toJSONString cannot serialize '", obj, "'", e);
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            C0086a.m455n("JSON#toJSONString cannot serialize '", obj, "'", e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static <T> T toJavaObject(Object obj, Class<T> cls) {
        return (T) m1632to(cls, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x005e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0061 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x001e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[Catch: Exception -> 0x005e, SYNTHETIC, TRY_LEAVE, TryCatch #1 {Exception -> 0x005e, blocks: (B:25:0x005a, B:39:0x0072, B:38:0x006f, B:34:0x0069), top: B:46:0x001e, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int writeTo(OutputStream outputStream, Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) throws Throwable {
        Throwable th2;
        Object obj2;
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        ?? r42 = 0;
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                try {
                    if (obj == null) {
                        jSONWriterOfUTF8.writeNull();
                        obj2 = obj;
                    } else {
                        try {
                            jSONWriterOfUTF8.rootObject = obj;
                            jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                            if (str != null && !str.isEmpty()) {
                                jSONWriterOfUTF8.context.setDateFormat(str);
                            }
                            if (filterArr != null && filterArr.length != 0) {
                                jSONWriterOfUTF8.context.configFilter(filterArr);
                            }
                            Class<?> cls = obj.getClass();
                            obj2 = obj;
                            try {
                                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterOfUTF8, obj2, null, null, 0L);
                                obj2 = obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                r42 = obj2;
                                if (jSONWriterOfUTF8 != null) {
                                    throw th2;
                                }
                                try {
                                    jSONWriterOfUTF8.close();
                                    throw th2;
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj2 = obj;
                            th2 = th;
                            r42 = obj2;
                            if (jSONWriterOfUTF8 != null) {
                            }
                        }
                    }
                    int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                    jSONWriterOfUTF8.close();
                    return iFlushTo;
                } catch (Exception e6) {
                    e = e6;
                    C0086a.m455n("JSON#writeTo cannot serialize '", r42, "' to 'OutputStream'", e);
                    return 0;
                }
            } catch (Throwable th6) {
                th2 = th6;
                r42 = obj;
            }
        } catch (Exception e7) {
            e = e7;
            r42 = obj;
        }
    }

    static void registerSeeAlsoSubType(Class cls) {
        registerSeeAlsoSubType(cls, null);
    }

    static ObjectWriter<?> registerIfAbsent(Type type, ObjectWriter<?> objectWriter) {
        return JSONFactory.defaultObjectWriterProvider.registerIfAbsent(type, objectWriter);
    }

    static boolean isEnabled(JSONWriter.Feature feature) {
        return (JSONFactory.defaultWriterFeatures & feature.mask) != 0;
    }

    static void config(JSONReader.Feature... featureArr) {
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.SupportAutoType) {
                C0086a.m464w("not support config global autotype support");
                return;
            }
            JSONFactory.defaultReaderFeatures |= feature.mask;
        }
    }

    static void config(JSONWriter.Feature... featureArr) {
        for (JSONWriter.Feature feature : featureArr) {
            JSONFactory.defaultWriterFeatures |= feature.mask;
        }
    }

    static void config(JSONWriter.Feature feature, boolean z9) {
        if (z9) {
            JSONFactory.defaultWriterFeatures = feature.mask | JSONFactory.defaultWriterFeatures;
        } else {
            JSONFactory.defaultWriterFeatures = (~feature.mask) & JSONFactory.defaultWriterFeatures;
        }
    }

    static ObjectWriter<?> register(Type type, ObjectWriter<?> objectWriter) {
        return JSONFactory.defaultObjectWriterProvider.register(type, objectWriter);
    }

    static ObjectReader<?> register(Type type, ObjectReader<?> objectReader) {
        return JSONFactory.defaultObjectReaderProvider.register(type, objectReader);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValid(char[] cArr) {
        boolean z9;
        if (cArr != null && cArr.length != 0) {
            try {
                JSONReader jSONReaderM1679of = JSONReader.m1679of(cArr);
                try {
                    jSONReaderM1679of.skipValue();
                    if (jSONReaderM1679of.isEnd()) {
                        z9 = !jSONReaderM1679of.comma;
                    }
                    jSONReaderM1679of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValid(byte[] bArr) {
        boolean z9;
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader jSONReaderM1673of = JSONReader.m1673of(bArr);
                try {
                    jSONReaderM1673of.skipValue();
                    if (jSONReaderM1673of.isEnd()) {
                        z9 = !jSONReaderM1673of.comma;
                    }
                    jSONReaderM1673of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValidArray(byte[] bArr) {
        boolean z9;
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader jSONReaderM1673of = JSONReader.m1673of(bArr);
                try {
                    if (!jSONReaderM1673of.isArray()) {
                        jSONReaderM1673of.close();
                        return false;
                    }
                    jSONReaderM1673of.skipValue();
                    if (jSONReaderM1673of.isEnd()) {
                        z9 = !jSONReaderM1673of.comma;
                    }
                    jSONReaderM1673of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValidObject(byte[] bArr) {
        boolean z9;
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader jSONReaderM1673of = JSONReader.m1673of(bArr);
                try {
                    if (!jSONReaderM1673of.isObject()) {
                        jSONReaderM1673of.close();
                        return false;
                    }
                    jSONReaderM1673of.skipValue();
                    if (jSONReaderM1673of.isEnd()) {
                        z9 = !jSONReaderM1673of.comma;
                    }
                    jSONReaderM1673of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValid(String str) {
        boolean z9;
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderM1666of = JSONReader.m1666of(str);
                try {
                    jSONReaderM1666of.skipValue();
                    if (jSONReaderM1666of.isEnd()) {
                        z9 = !jSONReaderM1666of.comma;
                    }
                    jSONReaderM1666of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    static boolean isValid(byte[] bArr, Charset charset) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        return isValid(bArr, 0, bArr.length, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isValid(byte[] bArr, int i9, int i10, Charset charset) {
        boolean z9;
        if (bArr != null && bArr.length != 0 && i10 != 0) {
            try {
                JSONReader jSONReaderM1676of = JSONReader.m1676of(bArr, i9, i10, charset);
                try {
                    jSONReaderM1676of.skipValue();
                    if (jSONReaderM1676of.isEnd()) {
                        z9 = !jSONReaderM1676of.comma;
                    }
                    jSONReaderM1676of.close();
                    return z9;
                } finally {
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static byte[] toJSONBytes(Object obj, Charset charset, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(new JSONWriter.Context(objectWriterProvider, featureArr));
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && jSONWriterOfUTF8.context.features == 0) {
                    jSONWriterOfUTF8.write((JSONObject) obj);
                } else {
                    objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes(charset);
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th2) {
            if (jSONWriterOfUTF8 == null) {
                throw th2;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    static Object toJSON(Object obj) {
        return toJSON(obj, null);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static byte[] toJSONBytes(Object obj, Charset charset, JSONWriter.Context context) {
        ObjectWriterProvider objectWriterProvider = context.provider;
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && jSONWriterOfUTF8.context.features == 0) {
                    jSONWriterOfUTF8.write((JSONObject) obj);
                } else {
                    objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes(charset);
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th2) {
            if (jSONWriterOfUTF8 == null) {
                throw th2;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONArray parseArray(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            if (jSONReaderUTF8.nextIfNull()) {
                jSONReaderUTF8.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderUTF8.read((List) jSONArray);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(jSONArray);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return jSONArray;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Context context) {
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                } else {
                    jSONWriterOfUTF8.rootObject = obj;
                    jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                    Class<?> cls = obj.getClass();
                    context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } finally {
            }
        } catch (Exception e6) {
            C0086a.m465x(e6.getMessage(), e6);
            return 0;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toJSONBytes(Object obj, String str, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriterUTF8 jSONWriterUTF8 = new JSONWriterUTF8(context);
        try {
            if (obj == null) {
                jSONWriterUTF8.writeNull();
            } else {
                jSONWriterUTF8.rootObject = obj;
                jSONWriterUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterUTF8.getBytes();
            jSONWriterUTF8.close();
            return bytes;
        } finally {
        }
    }

    static JSONArray parseArray(byte[] bArr, int i9, int i10, Charset charset) {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReader jSONReaderM1677of = JSONReader.m1677of(bArr, i9, i10, charset, context);
        try {
            if (jSONReaderM1677of.nextIfNull()) {
                jSONReaderM1677of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM1677of.read((List) jSONArray);
            if (jSONReaderM1677of.resolveTasks != null) {
                jSONReaderM1677of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM1677of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1677of.info("input not end"));
            }
            jSONReaderM1677of.close();
            return jSONArray;
        } catch (Throwable th2) {
            if (jSONReaderM1677of != null) {
                try {
                    jSONReaderM1677of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[Catch: NumberFormatException -> 0x002d, NullPointerException -> 0x0030, SYNTHETIC, TRY_LEAVE, TryCatch #8 {NullPointerException -> 0x0030, NumberFormatException -> 0x002d, blocks: (B:12:0x0029, B:28:0x0043, B:27:0x0040), top: B:43:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String toJSONString(Object obj, JSONWriter.Context context) {
        Throwable th2;
        Throwable th3;
        try {
            JSONWriter jSONWriterM1685of = JSONWriter.m1685of(context);
            try {
                if (obj == null) {
                    try {
                        jSONWriterM1685of.writeNull();
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (jSONWriterM1685of == null) {
                        }
                    }
                } else {
                    try {
                        jSONWriterM1685of.rootObject = obj;
                        jSONWriterM1685of.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        try {
                            jSONWriterM1685of.getObjectWriter(cls, cls).write(jSONWriterM1685of, obj, null, null, 0L);
                        } catch (Throwable th5) {
                            th3 = th5;
                            th2 = th3;
                            if (jSONWriterM1685of == null) {
                                throw th2;
                            }
                            try {
                                jSONWriterM1685of.close();
                                throw th2;
                            } catch (Throwable th6) {
                                th2.addSuppressed(th6);
                                throw th2;
                            }
                        }
                    } catch (Throwable th7) {
                        th3 = th7;
                        th2 = th3;
                        if (jSONWriterM1685of == null) {
                        }
                    }
                }
                String string = jSONWriterM1685of.toString();
                jSONWriterM1685of.close();
                return string;
            } catch (NullPointerException e6) {
                e = e6;
                C0086a.m455n("JSON#toJSONString cannot serialize '", obj, "'", e);
                return null;
            } catch (NumberFormatException e7) {
                e = e7;
                C0086a.m455n("JSON#toJSONString cannot serialize '", obj, "'", e);
                return null;
            }
        } catch (NullPointerException | NumberFormatException e10) {
            e = e10;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                } else {
                    jSONWriterOfUTF8.rootObject = obj;
                    jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                    Class<?> cls = obj.getClass();
                    objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } finally {
            }
        } catch (Exception e6) {
            C0086a.m465x(e6.getMessage(), e6);
            return 0;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toJSONBytes(Object obj, Filter... filterArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        context.configFilter(filterArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriterUTF8 jSONWriterUTF8 = new JSONWriterUTF8(context);
        if (filterArr != null) {
            try {
                if (filterArr.length != 0) {
                    jSONWriterUTF8.context.configFilter(filterArr);
                }
            } finally {
            }
        }
        if (obj == null) {
            jSONWriterUTF8.writeNull();
        } else {
            jSONWriterUTF8.rootObject = obj;
            jSONWriterUTF8.path = JSONWriter.Path.ROOT;
            Class<?> cls = obj.getClass();
            objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterUTF8, obj, null, null, 0L);
        }
        byte[] bytes = jSONWriterUTF8.getBytes();
        jSONWriterUTF8.close();
        return bytes;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriter jSONWriterM1685of = JSONWriter.m1685of(context);
        try {
            if (obj == null) {
                jSONWriterM1685of.writeNull();
            } else {
                jSONWriterM1685of.rootObject = obj;
                jSONWriterM1685of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterM1685of, obj, null, null, 0L);
            }
            String string = jSONWriterM1685of.toString();
            jSONWriterM1685of.close();
            return string;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            Object object = objectReader.readObject(jSONReaderUTF16, null, null, 0L);
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return object;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONArray parseArray(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderUTF16.read((List) jSONArray);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONArray);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONArray;
        } finally {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0054 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x001e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[Catch: Exception -> 0x0051, SYNTHETIC, TRY_LEAVE, TryCatch #5 {Exception -> 0x0051, blocks: (B:21:0x004d, B:35:0x0065, B:34:0x0062, B:30:0x005c), top: B:44:0x001e, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int writeTo(OutputStream outputStream, Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) throws Throwable {
        JSONWriter jSONWriterOfUTF8;
        Throwable th2;
        Object obj2;
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        ?? r42 = 0;
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        try {
            jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        } catch (Exception e6) {
            e = e6;
            r42 = obj;
        }
        try {
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                    obj2 = obj;
                } else {
                    try {
                        jSONWriterOfUTF8.rootObject = obj;
                        jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                        if (filterArr != null && filterArr.length != 0) {
                            jSONWriterOfUTF8.context.configFilter(filterArr);
                        }
                        Class<?> cls = obj.getClass();
                        obj2 = obj;
                        try {
                            objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterOfUTF8, obj2, null, null, 0L);
                            obj2 = obj2;
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            r42 = obj2;
                            if (jSONWriterOfUTF8 != null) {
                                throw th2;
                            }
                            try {
                                jSONWriterOfUTF8.close();
                                throw th2;
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                                throw th2;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj2 = obj;
                        th2 = th;
                        r42 = obj2;
                        if (jSONWriterOfUTF8 != null) {
                        }
                    }
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } catch (Throwable th6) {
                th2 = th6;
                r42 = obj;
            }
        } catch (Exception e7) {
            e = e7;
            C0086a.m455n("JSON#writeTo cannot serialize '", r42, "' to 'OutputStream'", e);
            return 0;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static Object parse(String str, int i9, int i10, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i10 == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderM1668of = JSONReader.m1668of(str, i9, i10, context);
        try {
            Object object = objectReader.readObject(jSONReaderM1668of, null, null, 0L);
            if (jSONReaderM1668of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1668of.info("input not end"));
            }
            jSONReaderM1668of.close();
            return object;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static String toJSONString(Object obj, Filter filter, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, null, filter, featureArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriter jSONWriterM1685of = JSONWriter.m1685of(context);
        try {
            if (obj == null) {
                jSONWriterM1685of.writeNull();
            } else {
                jSONWriterM1685of.rootObject = obj;
                jSONWriterM1685of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterM1685of, obj, null, null, 0L);
            }
            String string = jSONWriterM1685of.toString();
            jSONWriterM1685of.close();
            return string;
        } finally {
        }
    }

    static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderUTF16.read((List) jSONArray);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONArray);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONArray;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toJSONBytes(Object obj, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriterUTF8 jSONWriterUTF8 = new JSONWriterUTF8(context);
        try {
            if (obj == null) {
                jSONWriterUTF8.writeNull();
            } else {
                jSONWriterUTF8.rootObject = obj;
                jSONWriterUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterUTF8.getBytes();
            jSONWriterUTF8.close();
            return bytes;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(String str, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            Object object = objectReader.readObject(jSONReaderUTF16, null, null, 0L);
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return object;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static int writeTo(OutputStream outputStream, Object obj) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                } else {
                    jSONWriterOfUTF8.rootObject = obj;
                    jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                    Class<?> cls = obj.getClass();
                    objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } finally {
            }
        } catch (Exception e6) {
            C0086a.m465x(e6.getMessage(), e6);
            return 0;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static String toJSONString(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriter jSONWriterM1685of = JSONWriter.m1685of(context);
        try {
            if (obj == null) {
                jSONWriterM1685of.writeNull();
            } else {
                jSONWriterM1685of.rootObject = obj;
                jSONWriterM1685of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterM1685of, obj, null, null, 0L);
            }
            String string = jSONWriterM1685of.toString();
            jSONWriterM1685of.close();
            return string;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toJSONBytes(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriterUTF8 jSONWriterUTF8 = new JSONWriterUTF8(context);
        try {
            if (obj == null) {
                jSONWriterUTF8.writeNull();
            } else {
                jSONWriterUTF8.rootObject = obj;
                jSONWriterUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterUTF8.getBytes();
            jSONWriterUTF8.close();
            return bytes;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(byte[] bArr, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            Object object = objectReader.readObject(jSONReaderUTF8, null, null, 0L);
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return object;
        } finally {
        }
    }

    static JSONArray parseArray(URL url, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                JSONArray array = parseArray(inputStreamOpenStream, featureArr);
                if (inputStreamOpenStream == null) {
                    return array;
                }
                inputStreamOpenStream.close();
                return array;
            } finally {
            }
        } catch (IOException e6) {
            throw new JSONException("JSON#parseArray cannot parse '" + url + "' to '" + JSONArray.class + "'", e6);
        }
    }

    static JSONArray parseArray(InputStream inputStream, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, StandardCharsets.UTF_8, context);
        try {
            if (jSONReaderM1663of.nextIfNull()) {
                jSONReaderM1663of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM1663of.read((List) jSONArray);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return jSONArray;
        } catch (Throwable th2) {
            if (jSONReaderM1663of != null) {
                try {
                    jSONReaderM1663of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static Object parse(byte[] bArr, int i9, int i10, Charset charset, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderM1677of = JSONReader.m1677of(bArr, i9, i10, charset, context);
        try {
            Object object = objectReader.readObject(jSONReaderM1677of, null, null, 0L);
            if (jSONReaderM1677of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1677of.info("input not end"));
            }
            jSONReaderM1677of.close();
            return object;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static String toJSONString(Object obj, String str, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriter jSONWriterM1685of = JSONWriter.m1685of(context);
        try {
            if (obj == null) {
                jSONWriterM1685of.writeNull();
            } else {
                jSONWriterM1685of.rootObject = obj;
                jSONWriterM1685of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterM1685of, obj, null, null, 0L);
            }
            String string = jSONWriterM1685of.toString();
            jSONWriterM1685of.close();
            return string;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toJSONBytes(Object obj) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriterUTF8 jSONWriterUTF8 = new JSONWriterUTF8(context);
        try {
            if (obj == null) {
                jSONWriterUTF8.writeNull();
            } else {
                jSONWriterUTF8.rootObject = obj;
                jSONWriterUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && jSONWriterUTF8.context.features == 0) {
                    jSONWriterUTF8.write((JSONObject) obj);
                } else {
                    objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterUTF8, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterUTF8.getBytes();
            jSONWriterUTF8.close();
            return bytes;
        } finally {
        }
    }

    static Object parse(byte[] bArr, JSONReader.Feature... featureArr) throws Throwable {
        Object object;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            object = objectReader.readObject(jSONReaderUTF8, null, null, 0L);
        } catch (Throwable th2) {
            th = th2;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
        try {
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return object;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                jSONReaderUTF8.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    static JSONArray parseArray(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, charset, context);
        try {
            if (jSONReaderM1663of.nextIfNull()) {
                jSONReaderM1663of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM1663of.read((List) jSONArray);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return jSONArray;
        } catch (Throwable th2) {
            if (jSONReaderM1663of != null) {
                try {
                    jSONReaderM1663of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static Object parse(char[] cArr, JSONReader.Context context) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderM1682of = JSONReader.m1682of(cArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderM1682of, null, null, 0L);
            if (jSONReaderM1682of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1682of.info("input not end"));
            }
            jSONReaderM1682of.close();
            return object;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static String toJSONString(Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        JSONWriter jSONWriterM1685of = JSONWriter.m1685of(context);
        try {
            if (obj == null) {
                jSONWriterM1685of.writeNull();
            } else {
                jSONWriterM1685of.rootObject = obj;
                jSONWriterM1685of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, z9).write(jSONWriterM1685of, obj, null, null, 0L);
            }
            String string = jSONWriterM1685of.toString();
            jSONWriterM1685of.close();
            return string;
        } finally {
        }
    }

    static <T> List<T> parseArray(String str, Type type, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            List<T> array = jSONReaderUTF16.readArray(type);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(array);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return array;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static Object parse(char[] cArr, JSONReader.Feature... featureArr) throws Throwable {
        Object object;
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
        try {
            object = objectReader.readObject(jSONReaderUTF16, null, null, 0L);
        } catch (Throwable th2) {
            th = th2;
            jSONReaderUTF16 = jSONReaderUTF16;
        }
        try {
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return object;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                jSONReaderUTF16.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    static <T> List<T> parseArray(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            List<T> array = jSONReaderUTF16.readArray(type);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(array);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return array;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(InputStream inputStream, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, inputStream);
        try {
            Object object = objectReader.readObject(jSONReaderUTF8, null, null, 0L);
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return object;
        } finally {
        }
    }

    static <T> List<T> parseArray(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            List<T> array = jSONReaderUTF16.readArray(cls);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(array);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return array;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static <T> List<T> parseArray(String str, Type... typeArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            List<T> list = jSONReaderUTF16.readList(typeArr);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(list);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return list;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            List<T> array = jSONReaderUTF16.readArray(cls);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(array);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return array;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> List<T> parseArray(char[] cArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
        try {
            List<T> array = jSONReaderUTF16.readArray(cls);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(array);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return array;
        } finally {
        }
    }

    static JSONObject parseObject(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(contextCreateReadContext, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF16.read(jSONObject, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONObject;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static JSONArray parseArray(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderUTF16.read((List) jSONArray);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONArray);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONArray;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static JSONObject parseObject(String str, int i9, int i10, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i10 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM1668of = JSONReader.m1668of(str, i9, i10, contextCreateReadContext);
        try {
            if (jSONReaderM1668of.nextIfNull()) {
                jSONReaderM1668of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1668of.read(jSONObject, 0L);
            if (jSONReaderM1668of.resolveTasks != null) {
                jSONReaderM1668of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1668of.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1668of.info("input not end"));
            }
            jSONReaderM1668of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1668of != null) {
                try {
                    jSONReaderM1668of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> List<T> parseArray(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            List<T> array = jSONReaderUTF8.readArray(type);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(array);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return array;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> List<T> parseArray(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            List<T> array = jSONReaderUTF8.readArray(cls);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(array);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return array;
        } finally {
        }
    }

    static JSONObject parseObject(String str, int i9, int i10, JSONReader.Context context) {
        if (str == null || str.isEmpty() || i10 == 0) {
            return null;
        }
        JSONReader jSONReaderM1668of = JSONReader.m1668of(str, i9, i10, context);
        try {
            if (jSONReaderM1668of.nextIfNull()) {
                jSONReaderM1668of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1668of.read(jSONObject, 0L);
            if (jSONReaderM1668of.resolveTasks != null) {
                jSONReaderM1668of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1668of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1668of.info("input not end"));
            }
            jSONReaderM1668of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1668of != null) {
                try {
                    jSONReaderM1668of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, int i9, int i10, Charset charset, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReader jSONReaderM1677of = JSONReader.m1677of(bArr, i9, i10, charset, context);
        try {
            List<T> array = jSONReaderM1677of.readArray(cls);
            if (jSONReaderM1677of.resolveTasks != null) {
                jSONReaderM1677of.handleResolveTasks(array);
            }
            if (jSONReaderM1677of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1677of.info("input not end"));
            }
            jSONReaderM1677of.close();
            return array;
        } catch (Throwable th2) {
            if (jSONReaderM1677of != null) {
                try {
                    jSONReaderM1677of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static JSONObject parseObject(String str, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader jSONReaderM1669of = JSONReader.m1669of(str, context);
        try {
            if (jSONReaderM1669of.nextIfNull()) {
                jSONReaderM1669of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1669of.read(jSONObject, 0L);
            if (jSONReaderM1669of.resolveTasks != null) {
                jSONReaderM1669of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1669of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1669of.info("input not end"));
            }
            jSONReaderM1669of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1669of != null) {
                try {
                    jSONReaderM1669of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static JSONObject parseObject(Reader reader, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM1665of = JSONReader.m1665of(reader, contextCreateReadContext);
        try {
            if (jSONReaderM1665of.isEnd()) {
                jSONReaderM1665of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1665of.read(jSONObject, 0L);
            if (jSONReaderM1665of.resolveTasks != null) {
                jSONReaderM1665of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1665of.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1665of.info("input not end"));
            }
            jSONReaderM1665of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1665of != null) {
                try {
                    jSONReaderM1665of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static JSONObject parseObject(InputStream inputStream, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderM1663of.isEnd()) {
                jSONReaderM1663of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1663of.read(jSONObject, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1663of != null) {
                try {
                    jSONReaderM1663of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONObject parseObject(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(contextCreateReadContext, null, bArr, 0, bArr.length);
        try {
            if (jSONReaderUTF8.nextIfNull()) {
                jSONReaderUTF8.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF8.read(jSONObject, 0L);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return jSONObject;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONObject parseObject(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(contextCreateReadContext, null, cArr, 0, cArr.length);
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF16.read(jSONObject, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONObject;
        } finally {
        }
    }

    static JSONObject parseObject(InputStream inputStream, Charset charset) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, charset, contextCreateReadContext);
        try {
            if (jSONReaderM1663of.nextIfNull()) {
                jSONReaderM1663of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1663of.read(jSONObject, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1663of != null) {
                try {
                    jSONReaderM1663of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static JSONObject parseObject(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, charset, context);
        try {
            if (jSONReaderM1663of.isEnd()) {
                jSONReaderM1663of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1663of.read(jSONObject, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1663of != null) {
                try {
                    jSONReaderM1663of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static JSONObject parseObject(URL url) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                JSONObject object = parseObject(inputStreamOpenStream, StandardCharsets.UTF_8);
                if (inputStreamOpenStream == null) {
                    return object;
                }
                inputStreamOpenStream.close();
                return object;
            } finally {
            }
        } catch (IOException e6) {
            C0086a.m455n("JSON#parseObject cannot parse '", url, "'", e6);
            return null;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(contextCreateReadContext, null, bArr, 0, bArr.length);
        try {
            if (jSONReaderUTF8.nextIfNull()) {
                jSONReaderUTF8.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF8.read(jSONObject, 0L);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return jSONObject;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONObject parseObject(byte[] bArr, int i9, int i10, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(contextCreateReadContext, null, bArr, i9, i10);
        try {
            if (jSONReaderUTF8.nextIfNull()) {
                jSONReaderUTF8.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF8.read(jSONObject, 0L);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return jSONObject;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static JSONObject parseObject(char[] cArr, int i9, int i10, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0 || i10 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(contextCreateReadContext, null, cArr, i9, i10);
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF16.read(jSONObject, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONObject;
        } finally {
        }
    }

    static JSONObject parseObject(byte[] bArr, int i9, int i10, Charset charset, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM1677of = JSONReader.m1677of(bArr, i9, i10, charset, contextCreateReadContext);
        try {
            if (jSONReaderM1677of.nextIfNull()) {
                jSONReaderM1677of.close();
                return null;
            }
            contextCreateReadContext.config(featureArr);
            JSONObject jSONObject = new JSONObject();
            jSONReaderM1677of.read(jSONObject, 0L);
            if (jSONReaderM1677of.resolveTasks != null) {
                jSONReaderM1677of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM1677of.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1677of.info("input not end"));
            }
            jSONReaderM1677of.close();
            return jSONObject;
        } catch (Throwable th2) {
            if (jSONReaderM1677of != null) {
                try {
                    jSONReaderM1677of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(contextCreateReadContext, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Type type, String str2, Filter[] filterArr, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filterArr, featureArr);
        contextCreateReadContext.setDateFormat(str2);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(type, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(contextCreateReadContext, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReaderProvider.getObjectReader(type, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0).readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(String str, Type type, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(type);
        JSONReader jSONReaderM1669of = JSONReader.m1669of(str, context);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderM1669of, type, null, 0L);
            if (jSONReaderM1669of.resolveTasks != null) {
                jSONReaderM1669of.handleResolveTasks(t9);
            }
            if (jSONReaderM1669of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1669of.info("input not end"));
            }
            jSONReaderM1669of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T extends Map<String, Object>> T parseObject(String str, MapMultiValueType<T> mapMultiValueType) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReaderProvider.getObjectReader(mapMultiValueType, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0).readObject(jSONReaderUTF16, mapMultiValueType, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type... typeArr) {
        return (T) parseObject(str, new MultiType(typeArr));
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        Type type = typeReference.getType();
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, TypeReference<T> typeReference, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, (SymbolTable) null, filter, featureArr);
        Type type = typeReference.getType();
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, int i9, int i10, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i10 == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, i9, i10);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Class<T> cls, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Class<T> cls, String str2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        if (str2 != null && !str2.isEmpty()) {
            context.setDateFormat(str2);
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Type type, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, (SymbolTable) null, filter, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(String str, Type type, String str2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        if (str2 != null && !str2.isEmpty()) {
            context.setDateFormat(str2);
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    static <T> T parseObject(char[] cArr, int i9, int i10, Type type, JSONReader.Feature... featureArr) throws Throwable {
        if (cArr == null || cArr.length == 0 || i10 == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, i9, i10);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            try {
                if (jSONReaderUTF16.resolveTasks != null) {
                    jSONReaderUTF16.handleResolveTasks(t9);
                }
                if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF16.info("input not end"));
                }
                jSONReaderUTF16.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF16.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF16 = jSONReaderUTF16;
        }
    }

    static <T> T parseObject(char[] cArr, Class<T> cls) throws Throwable {
        T t9;
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
        try {
            t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
        } catch (Throwable th2) {
            th = th2;
            jSONReaderUTF16 = jSONReaderUTF16;
        }
        try {
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                jSONReaderUTF16.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i9, int i10, Type type, JSONReader.Feature... featureArr) throws Throwable {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, i9, i10);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF8, type, null, 0L);
            try {
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type) throws Throwable {
        T t9;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            t9 = (T) objectReader.readObject(jSONReaderUTF8, type, null, 0L);
        } catch (Throwable th2) {
            th = th2;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
        try {
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(t9);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return t9;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                jSONReaderUTF8.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(contextCreateReadContext, null, bArr, 0, bArr.length);
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            T t9 = (T) contextCreateReadContext.getObjectReader(cls).readObject(jSONReaderUTF8, cls, null, 0L);
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(t9);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return t9;
        } catch (Throwable th3) {
            th = th3;
            jSONReaderUTF8 = jSONReaderUTF8;
            Throwable th4 = th;
            try {
                jSONReaderUTF8.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(contextCreateReadContext, null, bArr, 0, bArr.length);
        try {
            contextCreateReadContext.config(filter, featureArr);
            try {
                T t9 = (T) contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0).readObject(jSONReaderUTF8, cls, null, 0L);
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                jSONReaderUTF8 = jSONReaderUTF8;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Context context) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            try {
                T t9 = (T) context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readObject(jSONReaderUTF8, cls, null, 0L);
                jSONReaderUTF8 = jSONReaderUTF8;
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                jSONReaderUTF8 = jSONReaderUTF8;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, String str, Filter[] filterArr, JSONReader.Feature... featureArr) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, (SymbolTable) null, filterArr, featureArr);
        context.setDateFormat(str);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF8, type, null, 0L);
            try {
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF8, cls, null, 0L);
            try {
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Feature... featureArr) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF8, type, null, 0L);
            try {
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
    }

    static <T> T parseObject(char[] cArr, Class<T> cls, JSONReader.Feature... featureArr) throws Throwable {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, cls, null, 0L);
            try {
                if (jSONReaderUTF16.resolveTasks != null) {
                    jSONReaderUTF16.handleResolveTasks(t9);
                }
                if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF16.info("input not end"));
                }
                jSONReaderUTF16.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF16.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF16 = jSONReaderUTF16;
        }
    }

    static <T> T parseObject(char[] cArr, Type type, JSONReader.Feature... featureArr) throws Throwable {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            try {
                if (jSONReaderUTF16.resolveTasks != null) {
                    jSONReaderUTF16.handleResolveTasks(t9);
                }
                if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF16.info("input not end"));
                }
                jSONReaderUTF16.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF16.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF16 = jSONReaderUTF16;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, Filter filter, JSONReader.Feature... featureArr) throws Throwable {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, (SymbolTable) null, filter, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderUTF8, type, null, 0L);
            try {
                if (jSONReaderUTF8.resolveTasks != null) {
                    jSONReaderUTF8.handleResolveTasks(t9);
                }
                if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                    throw new JSONException(jSONReaderUTF8.info("input not end"));
                }
                jSONReaderUTF8.close();
                return t9;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    jSONReaderUTF8.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, String str, JSONReader.Feature... featureArr) throws Throwable {
        T t9;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF8 = new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
        try {
            t9 = (T) objectReader.readObject(jSONReaderUTF8, type, null, 0L);
        } catch (Throwable th2) {
            th = th2;
            jSONReaderUTF8 = jSONReaderUTF8;
        }
        try {
            if (jSONReaderUTF8.resolveTasks != null) {
                jSONReaderUTF8.handleResolveTasks(t9);
            }
            if (jSONReaderUTF8.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return t9;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                jSONReaderUTF8.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(ByteBuffer byteBuffer, Class<T> cls) {
        if (byteBuffer == null) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1671of = JSONReader.m1671of(byteBuffer, context, (Charset) null);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderM1671of, cls, null, 0L);
            if (jSONReaderM1671of.resolveTasks != null) {
                jSONReaderM1671of.handleResolveTasks(t9);
            }
            if (jSONReaderM1671of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1671of.info("input not end"));
            }
            jSONReaderM1671of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(Reader reader, Type type, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderUTF16 = new JSONReaderUTF16(context, reader);
        try {
            if (jSONReaderUTF16.isEnd()) {
                jSONReaderUTF16.close();
                return null;
            }
            T t9 = (T) objectReader.readObject(jSONReaderUTF16, type, null, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(t9);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, StandardCharsets.UTF_8, context);
        try {
            if (jSONReaderM1663of.isEnd()) {
                jSONReaderM1663of.close();
                return null;
            }
            T t9 = (T) objectReader.readObject(jSONReaderM1663of, type, null, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(t9);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(InputStream inputStream, Charset charset, Type type, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, charset, context);
        try {
            if (jSONReaderM1663of.isEnd()) {
                jSONReaderM1663of.close();
                return null;
            }
            T t9 = (T) objectReader.readObject(jSONReaderM1663of, type, null, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(t9);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(InputStream inputStream, Charset charset, Class<T> cls, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, charset, context);
        try {
            if (jSONReaderM1663of.isEnd()) {
                jSONReaderM1663of.close();
                return null;
            }
            T t9 = (T) objectReader.readObject(jSONReaderM1663of, cls, null, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(t9);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return t9;
        } finally {
        }
    }

    static <T> T parseObject(URL url, Type type, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                T t9 = (T) parseObject(inputStreamOpenStream, type, featureArr);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return t9;
            } finally {
            }
        } catch (IOException e6) {
            C0086a.m465x("parseObject error", e6);
            return null;
        }
    }

    static <T> T parseObject(URL url, Class<T> cls, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                T t9 = (T) parseObject(inputStreamOpenStream, cls, featureArr);
                if (inputStreamOpenStream == null) {
                    return t9;
                }
                inputStreamOpenStream.close();
                return t9;
            } finally {
            }
        } catch (IOException e6) {
            throw new JSONException("JSON#parseObject cannot parse '" + url + "' to '" + cls + "'", e6);
        }
    }

    static <T> T parseObject(URL url, Function<JSONObject, T> function, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                JSONObject object = parseObject(inputStreamOpenStream, featureArr);
                if (object == null) {
                    if (inputStreamOpenStream == null) {
                        return null;
                    }
                    inputStreamOpenStream.close();
                    return null;
                }
                T tApply = function.apply(object);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return tApply;
            } finally {
            }
        } catch (IOException e6) {
            C0086a.m455n("JSON#parseObject cannot parse '", url, "'", e6);
            return null;
        }
        C0086a.m455n("JSON#parseObject cannot parse '", url, "'", e6);
        return null;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(InputStream inputStream, Type type, String str, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, StandardCharsets.UTF_8, context);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderM1663of, type, null, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(t9);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(InputStream inputStream, Charset charset, Type type, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1663of = JSONReader.m1663of(inputStream, charset, context);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderM1663of, type, null, 0L);
            if (jSONReaderM1663of.resolveTasks != null) {
                jSONReaderM1663of.handleResolveTasks(t9);
            }
            if (jSONReaderM1663of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1663of.info("input not end"));
            }
            jSONReaderM1663of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Charset charset, Type type) {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1677of = JSONReader.m1677of(bArr, i9, i10, charset, context);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderM1677of, type, null, 0L);
            if (jSONReaderM1677of.resolveTasks != null) {
                jSONReaderM1677of.handleResolveTasks(t9);
            }
            if (jSONReaderM1677of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1677of.info("input not end"));
            }
            jSONReaderM1677of.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Charset charset, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i10 == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM1677of = JSONReader.m1677of(bArr, i9, i10, charset, context);
        try {
            T t9 = (T) objectReader.readObject(jSONReaderM1677of, cls, null, 0L);
            if (jSONReaderM1677of.resolveTasks != null) {
                jSONReaderM1677of.handleResolveTasks(t9);
            }
            if (jSONReaderM1677of.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM1677of.info("input not end"));
            }
            jSONReaderM1677of.close();
            return t9;
        } finally {
        }
    }

    static <T> void parseObject(InputStream inputStream, Type type, Consumer<T> consumer, JSONReader.Feature... featureArr) {
        parseObject(inputStream, StandardCharsets.UTF_8, '\n', type, (Consumer) consumer, featureArr);
    }

    static JSONObject parseObject(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider);
        JSONReaderUTF16 jSONReaderUTF16 = new JSONReaderUTF16(context, str, 0, str.length());
        try {
            if (jSONReaderUTF16.nextIfNull()) {
                jSONReaderUTF16.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderUTF16.read(jSONObject, 0L);
            if (jSONReaderUTF16.resolveTasks != null) {
                jSONReaderUTF16.handleResolveTasks(jSONObject);
            }
            if (jSONReaderUTF16.f1929ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF16.info("input not end"));
            }
            jSONReaderUTF16.close();
            return jSONObject;
        } catch (Throwable th2) {
            try {
                jSONReaderUTF16.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: java.util.function.Consumer<T> */
    /* JADX WARN: Multi-variable type inference failed */
    static <T> void parseObject(Reader reader, char c10, Type type, Consumer<T> consumer) {
        int i9;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        ObjectReader objectReader = null;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new char[8192];
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        boolean z9 = (context.features & JSONReader.Feature.FieldBased.mask) != 0;
        char[] cArrCopyOf = andSet;
        int length = 0;
        int i10 = 0;
        while (true) {
            try {
                try {
                    int i11 = reader.read(cArrCopyOf, length, cArrCopyOf.length - length);
                    if (i11 == -1) {
                        JSONFactory.CHARS_UPDATER.lazySet(cacheItem, cArrCopyOf);
                        return;
                    }
                    int i12 = length + i11;
                    boolean z10 = false;
                    while (length < i12) {
                        if (cArrCopyOf[length] == c10) {
                            JSONReader jSONReaderM1681of = JSONReader.m1681of(cArrCopyOf, i10, length - i10, context);
                            if (objectReader == null) {
                                objectReader = objectReaderProvider.getObjectReader(type, z9);
                            }
                            i9 = length;
                            ObjectReader objectReader2 = objectReader;
                            consumer.accept(objectReader2.readObject(jSONReaderM1681of, type, null, 0L));
                            i10 = i9 + 1;
                            z10 = true;
                            objectReader = objectReader2;
                        } else {
                            i9 = length;
                        }
                        length = i9 + 1;
                    }
                    if (i12 != cArrCopyOf.length) {
                        length = i12;
                    } else if (z10) {
                        length = cArrCopyOf.length - i10;
                        System.arraycopy(cArrCopyOf, i10, cArrCopyOf, 0, length);
                        i10 = 0;
                    } else {
                        cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length + 8192);
                        length = i12;
                    }
                } catch (IOException e6) {
                    throw new JSONException("JSON#parseObject cannot parse the 'Reader' to '" + type + "'", e6);
                }
            } catch (Throwable th2) {
                JSONFactory.CHARS_UPDATER.lazySet(cacheItem, cArrCopyOf);
                throw th2;
            }
        }
    }
}
