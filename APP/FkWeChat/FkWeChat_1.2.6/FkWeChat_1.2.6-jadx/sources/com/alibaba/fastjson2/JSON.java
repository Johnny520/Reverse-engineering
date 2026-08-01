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
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
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

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface JSON {
    public static final String VERSION = "2.0.61";

    static void config(JSONReader.Feature feature, boolean z10) {
        if (feature == JSONReader.Feature.SupportAutoType && z10) {
            C1569c.m6258a("not support config global autotype support");
        } else if (z10) {
            JSONFactory.defaultReaderFeatures = feature.mask | JSONFactory.defaultReaderFeatures;
        } else {
            JSONFactory.defaultReaderFeatures = (~feature.mask) & JSONFactory.defaultReaderFeatures;
        }
    }

    @SafeVarargs
    static void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        JSONFactory.getDefaultObjectWriterProvider().configEnumAsJavaBean(clsArr);
    }

    static void configReaderDateFormat(String str) {
        JSONFactory.defaultReaderFormat = str;
    }

    static void configReaderZoneId(ZoneId zoneId) {
        JSONFactory.defaultReaderZoneId = zoneId;
    }

    static void configWriterDateFormat(String str) {
        JSONFactory.defaultWriterFormat = str;
    }

    static void configWriterZoneId(ZoneId zoneId) {
        JSONFactory.defaultWriterZoneId = zoneId;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> T copy(T r12, com.alibaba.fastjson2.JSONWriter.Feature... r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.copy(java.lang.Object, com.alibaba.fastjson2.JSONWriter$Feature[]):java.lang.Object");
    }

    static <T> T copyTo(Object obj, Class<T> cls, JSONWriter.Feature... featureArr) throws Throwable {
        if (obj == null) {
            return null;
        }
        Class<?> cls2 = obj.getClass();
        long j10 = JSONFactory.defaultReaderFeatures;
        boolean z10 = false;
        boolean z11 = false;
        for (JSONWriter.Feature feature : featureArr) {
            j10 |= feature.mask;
            if (feature == JSONWriter.Feature.FieldBased) {
                z10 = true;
            } else if (feature == JSONWriter.Feature.BeanToArray) {
                z11 = true;
            }
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter(cls2, cls2, z10);
        ObjectReader objectReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, z10);
        if ((objectWriter instanceof ObjectWriterAdapter) && (objectReader instanceof ObjectReaderBean)) {
            List<FieldWriter> fieldWriters = objectWriter.getFieldWriters();
            if (objectReader instanceof ObjectReaderNoneDefaultConstructor) {
                HashMap map = new HashMap(fieldWriters.size(), 1.0f);
                for (int i10 = 0; i10 < fieldWriters.size(); i10++) {
                    FieldWriter fieldWriter = fieldWriters.get(i10);
                    map.put(fieldWriter.fieldName, fieldWriter.getFieldValue(obj));
                }
                return (T) objectReader.createInstance(map, j10);
            }
            T t10 = (T) objectReader.createInstance(j10);
            for (int i11 = 0; i11 < fieldWriters.size(); i11++) {
                FieldWriter fieldWriter2 = fieldWriters.get(i11);
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
                    fieldReader.accept(t10, fieldValue);
                }
            }
            return t10;
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.config(JSONWriter.Feature.WriteClassName);
            objectWriter.writeJSONB(jSONWriterOfJSONB, obj, null, null, 0L);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            JSONReader jSONReaderOfJSONB = JSONReader.ofJSONB(bytes, JSONReader.Feature.SupportAutoType, JSONReader.Feature.SupportClassForName);
            if (z11) {
                try {
                    jSONReaderOfJSONB.context.config(JSONReader.Feature.SupportArrayToBean);
                } finally {
                }
            }
            T t11 = (T) objectReader.readJSONBObject(jSONReaderOfJSONB, null, null, 0L);
            if (jSONReaderOfJSONB != null) {
                jSONReaderOfJSONB.close();
            }
            return t11;
        } finally {
        }
    }

    static boolean isEnabled(JSONReader.Feature feature) {
        return (JSONFactory.defaultReaderFeatures & feature.mask) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValid(java.lang.String r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L33
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L33
        La:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext(r3)     // Catch: java.lang.Throwable -> L33
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6229of(r2, r3)     // Catch: java.lang.Throwable -> L33
            r2.skipValue()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.isEnd()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            boolean r3 = r2.comma     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = 1
            goto L24
        L21:
            r3 = move-exception
            goto L28
        L23:
            r3 = r0
        L24:
            r2.close()     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L33
            return r3
        L28:
            if (r2 == 0) goto L32
            r2.close()     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L33
        L32:
            throw r3     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L33
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValid(java.lang.String, com.alibaba.fastjson2.JSONReader$Feature[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValidArray(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L39
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L39
        La:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6226of(r2)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r2.isArray()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L18
            r2.close()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
            return r0
        L18:
            r2.skipValue()     // Catch: java.lang.Throwable -> L27
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            r1 = 1
            goto L2a
        L27:
            r1 = move-exception
            goto L2e
        L29:
            r1 = r0
        L2a:
            r2.close()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
            return r1
        L2e:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
        L38:
            throw r1     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValidArray(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValidObject(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L39
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L39
        La:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6226of(r2)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r2.isObject()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L18
            r2.close()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
            return r0
        L18:
            r2.skipValue()     // Catch: java.lang.Throwable -> L27
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            r1 = 1
            goto L2a
        L27:
            r1 = move-exception
            goto L2e
        L29:
            r1 = r0
        L2a:
            r2.close()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
            return r1
        L2e:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
        L38:
            throw r1     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L39
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValidObject(java.lang.String):boolean");
    }

    static void mixIn(Class<?> cls, Class<?> cls2) {
        JSONFactory.defaultObjectWriterProvider.mixIn(cls, cls2);
        JSONFactory.getDefaultObjectReaderProvider().mixIn(cls, cls2);
    }

    static Object parse(String str) {
        Object object;
        Object obj;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            char cCurrent = jSONReaderM6229of.current();
            if (context.objectSupplier == null && (context.features & JSONReader.Feature.UseNativeObject.mask) == 0 && (cCurrent == '{' || cCurrent == '[')) {
                if (cCurrent == '{') {
                    JSONObject jSONObject = new JSONObject();
                    jSONReaderM6229of.read(jSONObject, 0L);
                    obj = jSONObject;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    jSONReaderM6229of.read((List) jSONArray);
                    obj = jSONArray;
                }
                object = obj;
                if (jSONReaderM6229of.resolveTasks != null) {
                    jSONReaderM6229of.handleResolveTasks(obj);
                    object = obj;
                }
            } else {
                object = defaultObjectReaderProvider.getObjectReader(Object.class, false).readObject(jSONReaderM6229of, null, null, 0L);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return object;
        } finally {
        }
    }

    static <T> List<T> parseArray(String str, Type[] typeArr, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            jSONReaderM6229of.startArray();
            ArrayList arrayList = new ArrayList(typeArr.length);
            for (Type type : typeArr) {
                arrayList.add(jSONReaderM6229of.read(type));
            }
            jSONReaderM6229of.endArray();
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(arrayList);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return arrayList;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> void parseObject(InputStream inputStream, Charset charset, char c10, Type type, Consumer<T> consumer, JSONReader.Feature... featureArr) {
        int i10;
        JSONReader.Context context;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        ObjectReader objectReader = null;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int i11 = 524288;
        if (andSet == null) {
            andSet = new byte[524288];
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        byte[] bArrCopyOf = andSet;
        int length = 0;
        int i12 = 0;
        while (true) {
            try {
                try {
                    int i13 = inputStream.read(bArrCopyOf, length, bArrCopyOf.length - length);
                    if (i13 == -1) {
                        JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
                        return;
                    }
                    int i14 = length + i13;
                    int i15 = length;
                    boolean z10 = false;
                    while (i15 < i14) {
                        if (bArrCopyOf[i15] == c10) {
                            JSONReader jSONReaderM6237of = JSONReader.m6237of(bArrCopyOf, i12, i15 - i12, charset, contextCreateReadContext);
                            if (objectReader == null) {
                                objectReader = contextCreateReadContext.getObjectReader(type);
                            }
                            ObjectReader objectReader2 = objectReader;
                            Object object = objectReader2.readObject(jSONReaderM6237of, type, null, 0L);
                            if (jSONReaderM6237of.resolveTasks != null) {
                                jSONReaderM6237of.handleResolveTasks(object);
                            }
                            if (jSONReaderM6237of.f4541ch != 26) {
                                i10 = i11;
                                context = contextCreateReadContext;
                                if ((contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                                    throw new JSONException(jSONReaderM6237of.info("input not end"));
                                }
                            } else {
                                i10 = i11;
                                context = contextCreateReadContext;
                            }
                            consumer.accept(object);
                            i12 = i15 + 1;
                            objectReader = objectReader2;
                            z10 = true;
                        } else {
                            i10 = i11;
                            context = contextCreateReadContext;
                        }
                        i15++;
                        contextCreateReadContext = context;
                        i11 = i10;
                    }
                    int i16 = i11;
                    JSONReader.Context context2 = contextCreateReadContext;
                    if (i14 != bArrCopyOf.length) {
                        length = i14;
                    } else if (z10) {
                        length = bArrCopyOf.length - i12;
                        System.arraycopy(bArrCopyOf, i12, bArrCopyOf, 0, length);
                        i12 = 0;
                    } else {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + i16);
                        length = i14;
                    }
                    contextCreateReadContext = context2;
                    i11 = i16;
                } catch (IOException e10) {
                    throw new JSONException("JSON#parseObject cannot parse the 'InputStream' to '" + type + "'", e10);
                }
            } catch (Throwable th) {
                JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
                throw th;
            }
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
            throw th;
        }
    }

    static void register(Class cls, Filter filter) {
        if ((filter instanceof AfterFilter) || (filter instanceof BeforeFilter) || (filter instanceof ContextNameFilter) || (filter instanceof ContextValueFilter) || (filter instanceof LabelFilter) || (filter instanceof NameFilter) || (filter instanceof PropertyFilter) || (filter instanceof PropertyPreFilter) || (filter instanceof ValueFilter)) {
            JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(cls).setFilter(filter);
        }
    }

    static ObjectReader<?> registerIfAbsent(Type type, ObjectReader<?> objectReader) {
        return JSONFactory.getDefaultObjectReaderProvider().registerIfAbsent(type, objectReader);
    }

    static void registerSeeAlsoSubType(Class cls, String str) {
        JSONFactory.getDefaultObjectReaderProvider().registerSeeAlsoSubType(cls, str);
    }

    /* JADX INFO: renamed from: to */
    static <T> T m6184to(Class<T> cls, Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof JSONObject ? (T) ((JSONObject) obj).m6201to((Class) cls, new JSONReader.Feature[0]) : (T) TypeUtils.cast(obj, (Class) cls, JSONFactory.getDefaultObjectReaderProvider());
    }

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
            JSONWriter jSONWriterM6248of = JSONWriter.m6248of(contextCreateWriteContext);
            try {
                objectWriter.write(jSONWriterM6248of, obj, null, null, contextCreateWriteContext.features);
                String string = jSONWriterM6248of.toString();
                jSONWriterM6248of.close();
                return parse(string);
            } finally {
            }
        } catch (NullPointerException | NumberFormatException e10) {
            C1565a.m6255a("toJSONString error", e10);
            return null;
        }
    }

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
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static String toJSONString(Object obj) {
        Object obj2;
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        try {
            JSONWriter jSONWriterM6248of = JSONWriter.m6248of(context);
            try {
                try {
                    if (obj == null) {
                        jSONWriterM6248of.writeNull();
                    } else {
                        jSONWriterM6248of.rootObject = obj;
                        jSONWriterM6248of.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        if (cls != JSONObject.class || context.features != 0) {
                            obj2 = obj;
                            try {
                                objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterM6248of, obj2, null, null, 0L);
                                String string = jSONWriterM6248of.toString();
                                jSONWriterM6248of.close();
                                return string;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                if (jSONWriterM6248of == null) {
                                    throw th2;
                                }
                                try {
                                    jSONWriterM6248of.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        jSONWriterM6248of.write((JSONObject) obj);
                    }
                    obj2 = obj;
                    String string2 = jSONWriterM6248of.toString();
                    jSONWriterM6248of.close();
                    return string2;
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = obj;
                }
            } catch (NullPointerException e10) {
                e = e10;
                C1567b.m6257a("JSON#toJSONString cannot serialize '", obj2, "'", e);
                return null;
            } catch (NumberFormatException e11) {
                e = e11;
                C1567b.m6257a("JSON#toJSONString cannot serialize '", obj2, "'", e);
                return null;
            }
        } catch (NullPointerException | NumberFormatException e12) {
            e = e12;
            obj2 = obj;
        }
    }

    static <T> T toJavaObject(Object obj, Class<T> cls) {
        return (T) m6184to(cls, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[Catch: Exception -> 0x0047, SYNTHETIC, TRY_LEAVE, TryCatch #3 {Exception -> 0x0047, blocks: (B:21:0x0043, B:35:0x005b, B:34:0x0058, B:30:0x0052), top: B:46:0x001e, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int writeTo(java.io.OutputStream r8, java.lang.Object r9, java.lang.String r10, com.alibaba.fastjson2.filter.Filter[] r11, com.alibaba.fastjson2.JSONWriter.Feature... r12) throws java.lang.Throwable {
        /*
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.<init>(r1, r12)
            if (r10 == 0) goto L12
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L12
            r0.setDateFormat(r10)
        L12:
            if (r11 == 0) goto L1a
            int r10 = r11.length
            if (r10 == 0) goto L1a
            r0.configFilter(r11)
        L1a:
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r0)     // Catch: java.lang.Exception -> L5c
            if (r9 != 0) goto L29
            r2.writeNull()     // Catch: java.lang.Throwable -> L25
            r3 = r9
            goto L3f
        L25:
            r0 = move-exception
            r8 = r0
            r3 = r9
            goto L50
        L29:
            r2.rootObject = r9     // Catch: java.lang.Throwable -> L4d
            com.alibaba.fastjson2.JSONWriter$Path r10 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L4d
            r2.path = r10     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> L4d
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.getObjectWriter(r10, r10)     // Catch: java.lang.Throwable -> L4d
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = r9
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
        L3f:
            int r8 = r2.flushTo(r8)     // Catch: java.lang.Throwable -> L4a
            r2.close()     // Catch: java.lang.Exception -> L47
            return r8
        L47:
            r0 = move-exception
        L48:
            r8 = r0
            goto L5f
        L4a:
            r0 = move-exception
        L4b:
            r8 = r0
            goto L50
        L4d:
            r0 = move-exception
            r3 = r9
            goto L4b
        L50:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)     // Catch: java.lang.Exception -> L47
        L5b:
            throw r8     // Catch: java.lang.Exception -> L47
        L5c:
            r0 = move-exception
            r3 = r9
            goto L48
        L5f:
            java.lang.String r9 = "JSON#writeTo cannot serialize '"
            java.lang.String r10 = "' to 'OutputStream'"
            com.alibaba.fastjson2.C1567b.m6257a(r9, r3, r10, r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.writeTo(java.io.OutputStream, java.lang.Object, java.lang.String, com.alibaba.fastjson2.filter.Filter[], com.alibaba.fastjson2.JSONWriter$Feature[]):int");
    }

    static void registerSeeAlsoSubType(Class cls) {
        registerSeeAlsoSubType(cls, null);
    }

    static ObjectReader<?> registerIfAbsent(Type type, ObjectReader<?> objectReader, boolean z10) {
        return JSONFactory.getDefaultObjectReaderProvider().registerIfAbsent(type, objectReader, z10);
    }

    static ObjectWriter<?> registerIfAbsent(Type type, ObjectWriter<?> objectWriter) {
        return JSONFactory.getDefaultObjectWriterProvider().registerIfAbsent(type, objectWriter);
    }

    static ObjectWriter<?> registerIfAbsent(Type type, ObjectWriter<?> objectWriter, boolean z10) {
        return JSONFactory.getDefaultObjectWriterProvider().registerIfAbsent(type, objectWriter, z10);
    }

    static boolean isEnabled(JSONWriter.Feature feature) {
        return (JSONFactory.defaultWriterFeatures & feature.mask) != 0;
    }

    static void config(JSONReader.Feature... featureArr) {
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.SupportAutoType) {
                C1569c.m6258a("not support config global autotype support");
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

    static void config(JSONWriter.Feature feature, boolean z10) {
        if (z10) {
            JSONFactory.defaultWriterFeatures = feature.mask | JSONFactory.defaultWriterFeatures;
        } else {
            JSONFactory.defaultWriterFeatures = (~feature.mask) & JSONFactory.defaultWriterFeatures;
        }
    }

    static ObjectReader<?> register(Type type, ObjectReader<?> objectReader, boolean z10) {
        return JSONFactory.getDefaultObjectReaderProvider().register(type, objectReader, z10);
    }

    static boolean register(ObjectReaderModule objectReaderModule) {
        return JSONFactory.getDefaultObjectReaderProvider().register(objectReaderModule);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValid(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L2f
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L2f
        La:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6226of(r2)     // Catch: java.lang.Throwable -> L2f
            r2.skipValue()     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            r1 = 1
            goto L20
        L1d:
            r1 = move-exception
            goto L24
        L1f:
            r1 = r0
        L20:
            r2.close()     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L2f
            return r1
        L24:
            if (r2 == 0) goto L2e
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L2f
        L2e:
            throw r1     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L2f
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValid(java.lang.String):boolean");
    }

    static boolean register(ObjectWriterModule objectWriterModule) {
        return JSONFactory.getDefaultObjectWriterProvider().register(objectWriterModule);
    }

    static ObjectWriter<?> register(Type type, ObjectWriter<?> objectWriter) {
        return JSONFactory.getDefaultObjectWriterProvider().register(type, objectWriter);
    }

    static ObjectWriter<?> register(Type type, ObjectWriter<?> objectWriter, boolean z10) {
        return JSONFactory.getDefaultObjectWriterProvider().register(type, objectWriter, z10);
    }

    static ObjectReader<?> register(Type type, ObjectReader<?> objectReader) {
        return JSONFactory.getDefaultObjectReaderProvider().register(type, objectReader);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValid(char[] r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L2c
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L2c
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6239of(r2)     // Catch: java.lang.Throwable -> L2c
            r2.skipValue()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1a:
            r1 = move-exception
            goto L21
        L1c:
            r1 = r0
        L1d:
            r2.close()     // Catch: java.lang.Throwable -> L2c java.lang.Throwable -> L2c
            return r1
        L21:
            if (r2 == 0) goto L2b
            r2.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Throwable -> L2c
        L2b:
            throw r1     // Catch: java.lang.Throwable -> L2c java.lang.Throwable -> L2c
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValid(char[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValidArray(byte[] r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L36
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L36
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6233of(r2)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r2.isArray()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L15
            r2.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
            return r0
        L15:
            r2.skipValue()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L24:
            r1 = move-exception
            goto L2b
        L26:
            r1 = r0
        L27:
            r2.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
            return r1
        L2b:
            if (r2 == 0) goto L35
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
        L35:
            throw r1     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValidArray(byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValidObject(byte[] r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L36
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L36
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6233of(r2)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r2.isObject()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L15
            r2.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
            return r0
        L15:
            r2.skipValue()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L24:
            r1 = move-exception
            goto L2b
        L26:
            r1 = r0
        L27:
            r2.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
            return r1
        L2b:
            if (r2 == 0) goto L35
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
        L35:
            throw r1     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L36
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValidObject(byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValid(byte[] r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L2c
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L2c
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6233of(r2)     // Catch: java.lang.Throwable -> L2c
            r2.skipValue()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1a:
            r1 = move-exception
            goto L21
        L1c:
            r1 = r0
        L1d:
            r2.close()     // Catch: java.lang.Throwable -> L2c java.lang.Throwable -> L2c
            return r1
        L21:
            if (r2 == 0) goto L2b
            r2.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Throwable -> L2c
        L2b:
            throw r1     // Catch: java.lang.Throwable -> L2c java.lang.Throwable -> L2c
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValid(byte[]):boolean");
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
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean isValid(byte[] r2, int r3, int r4, java.nio.charset.Charset r5) {
        /*
            r0 = 0
            if (r2 == 0) goto L2e
            int r1 = r2.length
            if (r1 == 0) goto L2e
            if (r4 != 0) goto L9
            goto L2e
        L9:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.m6236of(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2e
            r2.skipValue()     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.isEnd()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            boolean r3 = r2.comma     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L1e
            r3 = 1
            goto L1f
        L1c:
            r3 = move-exception
            goto L23
        L1e:
            r3 = r0
        L1f:
            r2.close()     // Catch: java.lang.Throwable -> L2e java.lang.Throwable -> L2e
            return r3
        L23:
            if (r2 == 0) goto L2d
            r2.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L2e java.lang.Throwable -> L2e
        L2d:
            throw r3     // Catch: java.lang.Throwable -> L2e java.lang.Throwable -> L2e
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.isValid(byte[], int, int, java.nio.charset.Charset):boolean");
    }

    static byte[] toJSONBytes(Object obj) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(new JSONWriter.Context(objectWriterProvider));
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
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

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
        } catch (Exception e10) {
            C1565a.m6255a(e10.getMessage(), e10);
            return 0;
        }
    }

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
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static JSONArray parseArray(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            if (jSONReaderM6238of.nextIfNull()) {
                jSONReaderM6238of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6238of.read((List) jSONArray);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6238of != null) {
                try {
                    jSONReaderM6238of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
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
        } catch (Exception e10) {
            C1565a.m6255a(e10.getMessage(), e10);
            return 0;
        }
    }

    static Object toJSON(Object obj) {
        return toJSON(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[Catch: NumberFormatException -> 0x0033, NullPointerException -> 0x0036, SYNTHETIC, TRY_LEAVE, TryCatch #7 {NullPointerException -> 0x0036, NumberFormatException -> 0x0033, blocks: (B:14:0x002f, B:30:0x0049, B:29:0x0046, B:25:0x0040), top: B:47:0x000a, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String toJSONString(java.lang.Object r7, com.alibaba.fastjson2.JSONWriter.Context r8) throws java.lang.Throwable {
        /*
            if (r8 != 0) goto L6
            com.alibaba.fastjson2.JSONWriter$Context r8 = com.alibaba.fastjson2.JSONFactory.createWriteContext()
        L6:
            com.alibaba.fastjson2.JSONWriter r1 = com.alibaba.fastjson2.JSONWriter.m6248of(r8)     // Catch: java.lang.NumberFormatException -> L4a java.lang.NullPointerException -> L4d
            if (r7 != 0) goto L15
            r1.writeNull()     // Catch: java.lang.Throwable -> L11
            r2 = r7
            goto L2b
        L11:
            r0 = move-exception
            r8 = r0
            r2 = r7
            goto L3e
        L15:
            r1.rootObject = r7     // Catch: java.lang.Throwable -> L3b
            com.alibaba.fastjson2.JSONWriter$Path r0 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L3b
            r1.path = r0     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L3b
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r8.getObjectWriter(r0, r0)     // Catch: java.lang.Throwable -> L3b
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r7
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
        L2b:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L38
            r1.close()     // Catch: java.lang.NumberFormatException -> L33 java.lang.NullPointerException -> L36
            return r7
        L33:
            r0 = move-exception
        L34:
            r7 = r0
            goto L4f
        L36:
            r0 = move-exception
            goto L34
        L38:
            r0 = move-exception
        L39:
            r8 = r0
            goto L3e
        L3b:
            r0 = move-exception
            r2 = r7
            goto L39
        L3e:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch: java.lang.NumberFormatException -> L33 java.lang.NullPointerException -> L36
        L49:
            throw r8     // Catch: java.lang.NumberFormatException -> L33 java.lang.NullPointerException -> L36
        L4a:
            r0 = move-exception
        L4b:
            r2 = r7
            goto L34
        L4d:
            r0 = move-exception
            goto L4b
        L4f:
            java.lang.String r8 = "JSON#toJSONString cannot serialize '"
            java.lang.String r0 = "'"
            com.alibaba.fastjson2.C1567b.m6257a(r8, r2, r0, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.toJSONString(java.lang.Object, com.alibaba.fastjson2.JSONWriter$Context):java.lang.String");
    }

    static byte[] toJSONBytes(Object obj, String str, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
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
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } finally {
        }
    }

    static JSONArray parseArray(byte[] bArr, int i10, int i11, Charset charset) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, contextCreateReadContext);
        try {
            if (jSONReaderM6237of.nextIfNull()) {
                jSONReaderM6237of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6237of.read((List) jSONArray);
            if (jSONReaderM6237of.resolveTasks != null) {
                jSONReaderM6237of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6237of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6237of != null) {
                try {
                    jSONReaderM6237of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[Catch: Exception -> 0x003c, SYNTHETIC, TRY_LEAVE, TryCatch #1 {Exception -> 0x003c, blocks: (B:17:0x0038, B:31:0x0050, B:30:0x004d, B:26:0x0047), top: B:38:0x0013, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int writeTo(java.io.OutputStream r8, java.lang.Object r9, com.alibaba.fastjson2.filter.Filter[] r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) throws java.lang.Throwable {
        /*
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.<init>(r1, r11)
            if (r10 == 0) goto Lf
            int r11 = r10.length
            if (r11 == 0) goto Lf
            r0.configFilter(r10)
        Lf:
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r0)     // Catch: java.lang.Exception -> L51
            if (r9 != 0) goto L1e
            r2.writeNull()     // Catch: java.lang.Throwable -> L1a
            r3 = r9
            goto L34
        L1a:
            r0 = move-exception
            r8 = r0
            r3 = r9
            goto L45
        L1e:
            r2.rootObject = r9     // Catch: java.lang.Throwable -> L42
            com.alibaba.fastjson2.JSONWriter$Path r10 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L42
            r2.path = r10     // Catch: java.lang.Throwable -> L42
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> L42
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.getObjectWriter(r10, r10)     // Catch: java.lang.Throwable -> L42
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = r9
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3f
        L34:
            int r8 = r2.flushTo(r8)     // Catch: java.lang.Throwable -> L3f
            r2.close()     // Catch: java.lang.Exception -> L3c
            return r8
        L3c:
            r0 = move-exception
        L3d:
            r8 = r0
            goto L54
        L3f:
            r0 = move-exception
        L40:
            r8 = r0
            goto L45
        L42:
            r0 = move-exception
            r3 = r9
            goto L40
        L45:
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L50
        L4b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)     // Catch: java.lang.Exception -> L3c
        L50:
            throw r8     // Catch: java.lang.Exception -> L3c
        L51:
            r0 = move-exception
            r3 = r9
            goto L3d
        L54:
            java.lang.String r9 = "JSON#writeTo cannot serialize '"
            java.lang.String r10 = "' to 'OutputStream'"
            com.alibaba.fastjson2.C1567b.m6257a(r9, r3, r10, r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSON.writeTo(java.io.OutputStream, java.lang.Object, com.alibaba.fastjson2.filter.Filter[], com.alibaba.fastjson2.JSONWriter$Feature[]):int");
    }

    static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriter jSONWriterM6248of = JSONWriter.m6248of(context);
        try {
            if (obj == null) {
                jSONWriterM6248of.writeNull();
            } else {
                jSONWriterM6248of.rootObject = obj;
                jSONWriterM6248of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterM6248of, obj, null, null, 0L);
            }
            String string = jSONWriterM6248of.toString();
            jSONWriterM6248of.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterM6248of == null) {
                throw th;
            }
            try {
                jSONWriterM6248of.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toJSONBytes(Object obj, Filter... filterArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
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
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } finally {
        }
    }

    static JSONArray parseArray(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, contextCreateReadContext);
        try {
            if (jSONReaderM6242of.nextIfNull()) {
                jSONReaderM6242of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6242of.read((List) jSONArray);
            if (jSONReaderM6242of.resolveTasks != null) {
                jSONReaderM6242of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6242of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6242of != null) {
                try {
                    jSONReaderM6242of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, Filter filter, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriter jSONWriterM6248of = JSONWriter.m6248of(context);
        try {
            if (obj == null) {
                jSONWriterM6248of.writeNull();
            } else {
                jSONWriterM6248of.rootObject = obj;
                jSONWriterM6248of.path = JSONWriter.Path.ROOT;
                if (filter != null) {
                    jSONWriterM6248of.context.configFilter(filter);
                }
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterM6248of, obj, null, null, 0L);
            }
            String string = jSONWriterM6248of.toString();
            jSONWriterM6248of.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterM6248of == null) {
                throw th;
            }
            try {
                jSONWriterM6248of.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static int writeTo(OutputStream outputStream, Object obj) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
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
        } catch (Exception e10) {
            C1565a.m6255a(e10.getMessage(), e10);
            return 0;
        }
    }

    static Object parse(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            context.config(featureArr);
            Object object = objectReader.readObject(jSONReaderM6229of, null, null, 0L);
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return object;
        } finally {
        }
    }

    static byte[] toJSONBytes(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
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
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6229of.read((List) jSONArray);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterM6248of = JSONWriter.m6248of(context);
        try {
            if (obj == null) {
                jSONWriterM6248of.writeNull();
            } else {
                jSONWriterM6248of.rootObject = obj;
                jSONWriterM6248of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterM6248of, obj, null, null, 0L);
            }
            String string = jSONWriterM6248of.toString();
            jSONWriterM6248of.close();
            return string;
        } finally {
        }
    }

    static Object parse(String str, int i10, int i11, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i11 == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderM6228of = JSONReader.m6228of(str, i10, i11, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6228of, null, null, 0L);
            if (jSONReaderM6228of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6228of.info("input not end"));
            }
            jSONReaderM6228of.close();
            return object;
        } finally {
        }
    }

    static byte[] toJSONBytes(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
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
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } finally {
        }
    }

    static Object parse(String str, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(Object.class, false);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6229of, null, null, 0L);
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
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
        } catch (IOException e10) {
            throw new JSONException("JSON#parseArray cannot parse '" + url + "' to '" + JSONArray.class + "'", e10);
        }
    }

    static String toJSONString(Object obj, String str, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        JSONWriter jSONWriterM6248of = JSONWriter.m6248of(context);
        try {
            if (obj == null) {
                jSONWriterM6248of.writeNull();
            } else {
                jSONWriterM6248of.rootObject = obj;
                jSONWriterM6248of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterM6248of, obj, null, null, 0L);
            }
            String string = jSONWriterM6248of.toString();
            jSONWriterM6248of.close();
            return string;
        } finally {
        }
    }

    static JSONArray parseArray(Reader reader, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6225of = JSONReader.m6225of(reader, contextCreateReadContext);
        try {
            if (jSONReaderM6225of.nextIfNull()) {
                jSONReaderM6225of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6225of.read((List) jSONArray);
            if (jSONReaderM6225of.resolveTasks != null) {
                jSONReaderM6225of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6225of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6225of.info("input not end"));
            }
            jSONReaderM6225of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6225of != null) {
                try {
                    jSONReaderM6225of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(byte[] bArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6238of, null, null, 0L);
            if (jSONReaderM6238of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return object;
        } finally {
        }
    }

    static byte[] toJSONBytes(Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
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
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } finally {
        }
    }

    static String toJSONString(Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterM6248of = JSONWriter.m6248of(context);
        try {
            if (obj == null) {
                jSONWriterM6248of.writeNull();
            } else {
                jSONWriterM6248of.rootObject = obj;
                jSONWriterM6248of.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterM6248of, obj, null, null, 0L);
            }
            String string = jSONWriterM6248of.toString();
            jSONWriterM6248of.close();
            return string;
        } finally {
        }
    }

    static JSONArray parseArray(InputStream inputStream, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderM6223of.nextIfNull()) {
                jSONReaderM6223of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6223of.read((List) jSONArray);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6223of != null) {
                try {
                    jSONReaderM6223of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(byte[] bArr, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6238of, null, null, 0L);
            if (jSONReaderM6238of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return object;
        } finally {
        }
    }

    static Object parse(byte[] bArr, int i10, int i11, Charset charset, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6237of, null, null, 0L);
            if (jSONReaderM6237of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return object;
        } finally {
        }
    }

    static JSONArray parseArray(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, context);
        try {
            if (jSONReaderM6223of.nextIfNull()) {
                jSONReaderM6223of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6223of.read((List) jSONArray);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6223of != null) {
                try {
                    jSONReaderM6223of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(char[] cArr, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6242of, null, null, 0L);
            if (jSONReaderM6242of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return object;
        } finally {
        }
    }

    static <T> List<T> parseArray(String str, Type type, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6229of.readArray(type);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(array);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(char[] cArr, JSONReader.Context context) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6242of, null, null, 0L);
            if (jSONReaderM6242of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return object;
        } finally {
        }
    }

    static <T> List<T> parseArray(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6229of.readArray(type);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(array);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(InputStream inputStream, JSONReader.Feature... featureArr) {
        return parse(inputStream, JSONFactory.createReadContext(featureArr));
    }

    static Object parse(InputStream inputStream, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, inputStream);
        try {
            Object object = objectReader.readObject(jSONReaderUTF8, null, null, 0L);
            if (jSONReaderUTF8.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return object;
        } finally {
        }
    }

    static Object parse(InputStream inputStream, Charset charset) {
        return parse(inputStream, charset, JSONFactory.createReadContext());
    }

    static <T> List<T> parseArray(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6229of.readArray(cls);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(array);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, context);
        try {
            Object object = objectReader.readObject(jSONReaderM6223of, null, null, 0L);
            if (jSONReaderM6223of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return object;
        } finally {
        }
    }

    static <T> List<T> parseArray(String str, Type... typeArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            List<T> list = jSONReaderM6229of.readList(typeArr);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(list);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return list;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6229of.readArray(cls);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(array);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6229of.read(jSONObject, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(char[] cArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6242of.readArray(cls);
            if (jSONReaderM6242of.resolveTasks != null) {
                jSONReaderM6242of.handleResolveTasks(array);
            }
            if (jSONReaderM6242of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6242of != null) {
                try {
                    jSONReaderM6242of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, int i10, int i11, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6228of = JSONReader.m6228of(str, i10, i11, contextCreateReadContext);
        try {
            if (jSONReaderM6228of.nextIfNull()) {
                jSONReaderM6228of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6228of.read(jSONObject, 0L);
            if (jSONReaderM6228of.resolveTasks != null) {
                jSONReaderM6228of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6228of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6228of.info("input not end"));
            }
            jSONReaderM6228of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6228of != null) {
                try {
                    jSONReaderM6228of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONArray parseArray(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderM6229of.read((List) jSONArray);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(jSONArray);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, int i10, int i11, JSONReader.Context context) {
        if (str == null || str.isEmpty() || i11 == 0) {
            return null;
        }
        JSONReader jSONReaderM6228of = JSONReader.m6228of(str, i10, i11, context);
        try {
            if (jSONReaderM6228of.nextIfNull()) {
                jSONReaderM6228of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6228of.read(jSONObject, 0L);
            if (jSONReaderM6228of.resolveTasks != null) {
                jSONReaderM6228of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6228of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6228of.info("input not end"));
            }
            jSONReaderM6228of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6228of != null) {
                try {
                    jSONReaderM6228of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(Reader reader, Type type, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6225of = JSONReader.m6225of(reader, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6225of.readArray(type);
            if (jSONReaderM6225of.resolveTasks != null) {
                jSONReaderM6225of.handleResolveTasks(array);
            }
            if (jSONReaderM6225of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6225of.info("input not end"));
            }
            jSONReaderM6225of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6225of != null) {
                try {
                    jSONReaderM6225of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6229of.read(jSONObject, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6238of.readArray(type);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(array);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6238of != null) {
                try {
                    jSONReaderM6238of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(Reader reader, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6225of = JSONReader.m6225of(reader, contextCreateReadContext);
        try {
            if (jSONReaderM6225of.isEnd()) {
                jSONReaderM6225of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6225of.read(jSONObject, 0L);
            if (jSONReaderM6225of.resolveTasks != null) {
                jSONReaderM6225of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6225of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6225of.info("input not end"));
            }
            jSONReaderM6225of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6225of != null) {
                try {
                    jSONReaderM6225of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6238of.readArray(cls);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(array);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6238of != null) {
                try {
                    jSONReaderM6238of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, int i10, int i11, Charset charset, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, contextCreateReadContext);
        try {
            List<T> array = jSONReaderM6237of.readArray(cls);
            if (jSONReaderM6237of.resolveTasks != null) {
                jSONReaderM6237of.handleResolveTasks(array);
            }
            if (jSONReaderM6237of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderM6237of != null) {
                try {
                    jSONReaderM6237of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderM6223of.isEnd()) {
                jSONReaderM6223of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6223of.read(jSONObject, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6223of != null) {
                try {
                    jSONReaderM6223of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            if (jSONReaderM6238of.nextIfNull()) {
                jSONReaderM6238of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6238of.read(jSONObject, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6238of != null) {
                try {
                    jSONReaderM6238of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, contextCreateReadContext);
        try {
            if (jSONReaderM6242of.nextIfNull()) {
                jSONReaderM6242of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6242of.read(jSONObject, 0L);
            if (jSONReaderM6242of.resolveTasks != null) {
                jSONReaderM6242of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6242of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6242of != null) {
                try {
                    jSONReaderM6242of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, Charset charset) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, contextCreateReadContext);
        try {
            if (jSONReaderM6223of.nextIfNull()) {
                jSONReaderM6223of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6223of.read(jSONObject, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6223of != null) {
                try {
                    jSONReaderM6223of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, context);
        try {
            if (jSONReaderM6223of.isEnd()) {
                jSONReaderM6223of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6223of.read(jSONObject, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6223of != null) {
                try {
                    jSONReaderM6223of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
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
        } catch (IOException e10) {
            C1567b.m6257a("JSON#parseObject cannot parse '", url, "'", e10);
            return null;
        }
    }

    static JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            if (jSONReaderM6238of.nextIfNull()) {
                jSONReaderM6238of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6238of.read(jSONObject, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6238of != null) {
                try {
                    jSONReaderM6238of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr, int i10, int i11, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6235of = JSONReader.m6235of(bArr, i10, i11, contextCreateReadContext);
        try {
            if (jSONReaderM6235of.nextIfNull()) {
                jSONReaderM6235of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6235of.read(jSONObject, 0L);
            if (jSONReaderM6235of.resolveTasks != null) {
                jSONReaderM6235of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6235of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6235of.info("input not end"));
            }
            jSONReaderM6235of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6235of != null) {
                try {
                    jSONReaderM6235of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(char[] cArr, int i10, int i11, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6241of = JSONReader.m6241of(cArr, i10, i11, contextCreateReadContext);
        try {
            if (jSONReaderM6241of.nextIfNull()) {
                jSONReaderM6241of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6241of.read(jSONObject, 0L);
            if (jSONReaderM6241of.resolveTasks != null) {
                jSONReaderM6241of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6241of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6241of.info("input not end"));
            }
            jSONReaderM6241of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6241of != null) {
                try {
                    jSONReaderM6241of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr, int i10, int i11, Charset charset, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, contextCreateReadContext);
        try {
            if (jSONReaderM6237of.nextIfNull()) {
                jSONReaderM6237of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6237of.read(jSONObject, 0L);
            if (jSONReaderM6237of.resolveTasks != null) {
                jSONReaderM6237of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6237of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6237of != null) {
                try {
                    jSONReaderM6237of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> T parseObject(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, cls, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, cls, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type type, String str2, Filter[] filterArr, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), null, filterArr, featureArr);
        context.setDateFormat(str2);
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type type, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(type);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T extends Map<String, Object>> T parseObject(String str, MapMultiValueType<T> mapMultiValueType) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(mapMultiValueType);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, mapMultiValueType, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type... typeArr) {
        return (T) parseObject(str, new MultiType(typeArr));
    }

    static <T> T parseObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        Type type = typeReference.getType();
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(type, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, TypeReference<T> typeReference, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        Type type = typeReference.getType();
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(type, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, cls, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, int i10, int i11, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6228of = JSONReader.m6228of(str, i10, i11, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6228of, cls, null, 0L);
            if (jSONReaderM6228of.resolveTasks != null) {
                jSONReaderM6228of.handleResolveTasks(t10);
            }
            if (jSONReaderM6228of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6228of.info("input not end"));
            }
            jSONReaderM6228of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Class<T> cls, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, cls, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Class<T> cls, String str2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str2 != null && !str2.isEmpty()) {
            contextCreateReadContext.setDateFormat(str2);
        }
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, cls, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type type, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(String str, Type type, String str2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str2 != null && !str2.isEmpty()) {
            contextCreateReadContext.setDateFormat(str2);
        }
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            T t10 = (T) contextCreateReadContext.getObjectReader(type).readObject(jSONReaderM6229of, type, null, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(t10);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(char[] cArr, int i10, int i11, Type type, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6241of = JSONReader.m6241of(cArr, i10, i11, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6241of, type, null, 0L);
            if (jSONReaderM6241of.resolveTasks != null) {
                jSONReaderM6241of.handleResolveTasks(t10);
            }
            if (jSONReaderM6241of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6241of.info("input not end"));
            }
            jSONReaderM6241of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(char[] cArr, Class<T> cls) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6242of, cls, null, 0L);
            if (jSONReaderM6242of.resolveTasks != null) {
                jSONReaderM6242of.handleResolveTasks(t10);
            }
            if (jSONReaderM6242of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6235of = JSONReader.m6235of(bArr, i10, i11, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6235of, type, null, 0L);
            if (jSONReaderM6235of.resolveTasks != null) {
                jSONReaderM6235of.handleResolveTasks(t10);
            }
            if (jSONReaderM6235of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6235of.info("input not end"));
            }
            jSONReaderM6235of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, type, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, cls, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, cls, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, cls, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, String str, Filter[] filterArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), null, filterArr, featureArr);
        context.setDateFormat(str);
        return (T) parseObject(bArr, type, context);
    }

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, context);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, type, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, cls, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, type, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(char[] cArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6242of, cls, null, 0L);
            if (jSONReaderM6242of.resolveTasks != null) {
                jSONReaderM6242of.handleResolveTasks(t10);
            }
            if (jSONReaderM6242of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(char[] cArr, Type type, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6242of = JSONReader.m6242of(cArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6242of, type, null, 0L);
            if (jSONReaderM6242of.resolveTasks != null) {
                jSONReaderM6242of.handleResolveTasks(t10);
            }
            if (jSONReaderM6242of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6242of.info("input not end"));
            }
            jSONReaderM6242of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, Filter filter, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, type, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, String str, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str != null && !str.isEmpty()) {
            contextCreateReadContext.setDateFormat(str);
        }
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6238of, type, null, 0L);
            if (jSONReaderM6238of.resolveTasks != null) {
                jSONReaderM6238of.handleResolveTasks(t10);
            }
            if (jSONReaderM6238of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6238of.info("input not end"));
            }
            jSONReaderM6238of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(ByteBuffer byteBuffer, Class<T> cls) {
        if (byteBuffer == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderM6232of = JSONReader.m6232of(byteBuffer, (Charset) null, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6232of, cls, null, 0L);
            if (jSONReaderM6232of.resolveTasks != null) {
                jSONReaderM6232of.handleResolveTasks(t10);
            }
            if (jSONReaderM6232of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6232of.info("input not end"));
            }
            jSONReaderM6232of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(Reader reader, Type type, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6225of = JSONReader.m6225of(reader, contextCreateReadContext);
        try {
            if (jSONReaderM6225of.isEnd()) {
                jSONReaderM6225of.close();
                return null;
            }
            T t10 = (T) objectReader.readObject(jSONReaderM6225of, type, null, 0L);
            if (jSONReaderM6225of.resolveTasks != null) {
                jSONReaderM6225of.handleResolveTasks(t10);
            }
            if (jSONReaderM6225of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6225of.info("input not end"));
            }
            jSONReaderM6225of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        contextCreateReadContext.config(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderM6223of.isEnd()) {
                jSONReaderM6223of.close();
                return null;
            }
            T t10 = (T) objectReader.readObject(jSONReaderM6223of, type, null, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(t10);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, Charset charset, Type type, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, context);
        try {
            if (jSONReaderM6223of.isEnd()) {
                jSONReaderM6223of.close();
                return null;
            }
            T t10 = (T) objectReader.readObject(jSONReaderM6223of, type, null, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(t10);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, Charset charset, Class<T> cls, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, context);
        try {
            if (jSONReaderM6223of.isEnd()) {
                jSONReaderM6223of.close();
                return null;
            }
            T t10 = (T) objectReader.readObject(jSONReaderM6223of, cls, null, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(t10);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return t10;
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
                T t10 = (T) parseObject(inputStreamOpenStream, type, featureArr);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return t10;
            } finally {
            }
        } catch (IOException e10) {
            C1565a.m6255a("parseObject error", e10);
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
                T t10 = (T) parseObject(inputStreamOpenStream, cls, featureArr);
                if (inputStreamOpenStream == null) {
                    return t10;
                }
                inputStreamOpenStream.close();
                return t10;
            } finally {
            }
        } catch (IOException e10) {
            throw new JSONException("JSON#parseObject cannot parse '" + url + "' to '" + cls + "'", e10);
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
        } catch (IOException e10) {
            C1567b.m6257a("JSON#parseObject cannot parse '", url, "'", e10);
            return null;
        }
        C1567b.m6257a("JSON#parseObject cannot parse '", url, "'", e10);
        return null;
    }

    static <T> T parseObject(InputStream inputStream, Type type, String str, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str != null && !str.isEmpty()) {
            contextCreateReadContext.setDateFormat(str);
        }
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6223of, type, null, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(t10);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, Charset charset, Type type, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6223of = JSONReader.m6223of(inputStream, charset, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6223of, type, null, 0L);
            if (jSONReaderM6223of.resolveTasks != null) {
                jSONReaderM6223of.handleResolveTasks(t10);
            }
            if (jSONReaderM6223of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6223of.info("input not end"));
            }
            jSONReaderM6223of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Charset charset, Type type) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6237of, type, null, 0L);
            if (jSONReaderM6237of.resolveTasks != null) {
                jSONReaderM6237of.handleResolveTasks(t10);
            }
            if (jSONReaderM6237of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Charset charset, Class<T> cls) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6237of, cls, null, 0L);
            if (jSONReaderM6237of.resolveTasks != null) {
                jSONReaderM6237of.handleResolveTasks(t10);
            }
            if (jSONReaderM6237of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Charset charset, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i11 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, contextCreateReadContext);
        try {
            T t10 = (T) objectReader.readObject(jSONReaderM6237of, cls, null, 0L);
            if (jSONReaderM6237of.resolveTasks != null) {
                jSONReaderM6237of.handleResolveTasks(t10);
            }
            if (jSONReaderM6237of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6237of.info("input not end"));
            }
            jSONReaderM6237of.close();
            return t10;
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
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, contextCreateReadContext);
        try {
            if (jSONReaderM6229of.nextIfNull()) {
                jSONReaderM6229of.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderM6229of.read(jSONObject, 0L);
            if (jSONReaderM6229of.resolveTasks != null) {
                jSONReaderM6229of.handleResolveTasks(jSONObject);
            }
            if (jSONReaderM6229of.f4541ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderM6229of.info("input not end"));
            }
            jSONReaderM6229of.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderM6229of != null) {
                try {
                    jSONReaderM6229of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> void parseObject(Reader reader, char c10, Type type, Consumer<T> consumer) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        ObjectReader objectReader = null;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new char[8192];
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
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
                    for (int i13 = length; i13 < i12; i13++) {
                        if (cArrCopyOf[i13] == c10) {
                            JSONReader jSONReaderM6241of = JSONReader.m6241of(cArrCopyOf, i10, i13 - i10, contextCreateReadContext);
                            if (objectReader == null) {
                                objectReader = contextCreateReadContext.getObjectReader(type);
                            }
                            ObjectReader objectReader2 = objectReader;
                            consumer.accept(objectReader2.readObject(jSONReaderM6241of, type, null, 0L));
                            i10 = i13 + 1;
                            objectReader = objectReader2;
                            z10 = true;
                        }
                    }
                    if (i12 == cArrCopyOf.length) {
                        if (z10) {
                            length = cArrCopyOf.length - i10;
                            System.arraycopy(cArrCopyOf, i10, cArrCopyOf, 0, length);
                            i10 = 0;
                        } else {
                            cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length + 8192);
                        }
                    }
                    length = i12;
                } catch (IOException e10) {
                    throw new JSONException("JSON#parseObject cannot parse the 'Reader' to '" + type + "'", e10);
                }
            } catch (Throwable th) {
                JSONFactory.CHARS_UPDATER.lazySet(cacheItem, cArrCopyOf);
                throw th;
            }
        }
    }
}
