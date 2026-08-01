package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPathFilter;
import com.alibaba.fastjson2.JSONPathFunction;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ValueConsumer;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONPath {
    static final JSONReader.Context PARSE_CONTEXT = JSONFactory.createReadContext();
    final long features;
    final String path;
    JSONReader.Context readerContext;
    JSONWriter.Context writerContext;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Context {
        final JSONPathSegment current;
        boolean eval;
        final JSONPathSegment next;
        final Context parent;
        final JSONPath path;
        final long readerFeatures;
        Object root;
        Object value;

        public Context(JSONPath jSONPath, Context context, JSONPathSegment jSONPathSegment, JSONPathSegment jSONPathSegment2, long j10) {
            this.path = jSONPath;
            this.current = jSONPathSegment;
            this.next = jSONPathSegment2;
            this.parent = context;
            this.readerFeatures = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum Feature {
        AlwaysReturnList(1),
        NullOnError(2),
        KeepNullValue(4),
        DisableStringArrayUnwrapping(8);

        public final long mask;

        Feature(long j10) {
            this.mask = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class Sequence {
        final List values;

        public Sequence(List list) {
            this.values = list;
        }
    }

    public JSONPath(String str, Feature... featureArr) {
        this.path = str;
        long j10 = 0;
        for (Feature feature : featureArr) {
            j10 |= feature.mask;
        }
        this.features = j10;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m6204a(JSONPath jSONPath) {
        return new ArrayList();
    }

    public static JSONPath compile(String str, Class cls) {
        return JSONFactory.getDefaultJSONPathCompiler().compile(cls, m6205of(str));
    }

    public static boolean contains(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        return m6205of(str).contains(obj);
    }

    public static Object eval(Object obj, String str) {
        return m6205of(str).eval(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX INFO: renamed from: of */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.JSONPath m6211of(java.lang.String[] r22, java.lang.reflect.Type[] r23, java.lang.String[] r24, long[] r25, java.time.ZoneId r26, com.alibaba.fastjson2.JSONReader.Feature... r27) {
        /*
            Method dump skipped, instruction units count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPath.m6211of(java.lang.String[], java.lang.reflect.Type[], java.lang.String[], long[], java.time.ZoneId, com.alibaba.fastjson2.JSONReader$Feature[]):com.alibaba.fastjson2.JSONPath");
    }

    public static JSONPathFilter.Operator parseOperator(JSONReader jSONReader) {
        switch (jSONReader.f4541ch) {
            case '!':
                jSONReader.next();
                if (jSONReader.f4541ch != '=') {
                    C1588i.m6279a("not support operator : !", jSONReader.f4541ch);
                } else {
                    jSONReader.next();
                }
                break;
            case '<':
                jSONReader.next();
                char c10 = jSONReader.f4541ch;
                if (c10 == '=') {
                    jSONReader.next();
                } else if (c10 == '>') {
                    jSONReader.next();
                }
                break;
            case '=':
                jSONReader.next();
                char c11 = jSONReader.f4541ch;
                if (c11 == '~') {
                    jSONReader.nextWithoutComment();
                } else if (c11 == '=') {
                    jSONReader.next();
                }
                break;
            case '>':
                jSONReader.next();
                if (jSONReader.f4541ch == '=') {
                    jSONReader.next();
                }
                break;
            case 'B':
            case 'b':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName = jSONReader.getFieldName();
                if (!"between".equalsIgnoreCase(fieldName)) {
                    C1605j.m6294a("not support operator : ", fieldName);
                }
                break;
            case 'E':
            case 'e':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName2 = jSONReader.getFieldName();
                if ("ends".equalsIgnoreCase(fieldName2)) {
                    jSONReader.readFieldNameHashCodeUnquote();
                    String fieldName3 = jSONReader.getFieldName();
                    if (!"with".equalsIgnoreCase(fieldName3)) {
                        C1605j.m6294a("not support operator : ", fieldName3);
                    }
                } else if (!"endsWith".equalsIgnoreCase(fieldName2)) {
                    C1605j.m6294a("not support operator : ", fieldName2);
                }
                break;
            case 'I':
            case Opcodes.LMUL /* 105 */:
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName4 = jSONReader.getFieldName();
                if (!"in".equalsIgnoreCase(fieldName4)) {
                    if (!"is".equalsIgnoreCase(fieldName4)) {
                        C1605j.m6294a("not support operator : ", fieldName4);
                    }
                }
                break;
            case 'L':
            case Opcodes.IDIV /* 108 */:
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName5 = jSONReader.getFieldName();
                if (!"like".equalsIgnoreCase(fieldName5)) {
                    C1605j.m6294a("not support operator : ", fieldName5);
                }
                break;
            case 'N':
            case 'n':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName6 = jSONReader.getFieldName();
                if (!"nin".equalsIgnoreCase(fieldName6)) {
                    if (!"not".equalsIgnoreCase(fieldName6)) {
                        C1605j.m6294a("not support operator : ", fieldName6);
                    } else {
                        jSONReader.readFieldNameHashCodeUnquote();
                        String fieldName7 = jSONReader.getFieldName();
                        if (!"like".equalsIgnoreCase(fieldName7)) {
                            if (!"rlike".equalsIgnoreCase(fieldName7)) {
                                if (!"in".equalsIgnoreCase(fieldName7)) {
                                    if (!"between".equalsIgnoreCase(fieldName7)) {
                                        C1605j.m6294a("not support operator : ", fieldName7);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 'R':
            case 'r':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName8 = jSONReader.getFieldName();
                if (!"rlike".equalsIgnoreCase(fieldName8)) {
                    C1605j.m6294a("not support operator : ", fieldName8);
                }
                break;
            case Opcodes.AASTORE /* 83 */:
            case 's':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName9 = jSONReader.getFieldName();
                if ("starts".equalsIgnoreCase(fieldName9)) {
                    jSONReader.readFieldNameHashCodeUnquote();
                    String fieldName10 = jSONReader.getFieldName();
                    if (!"with".equalsIgnoreCase(fieldName10)) {
                        C1605j.m6294a("not support operator : ", fieldName10);
                    }
                } else if (!"startsWith".equalsIgnoreCase(fieldName9)) {
                    C1605j.m6294a("not support operator : ", fieldName9);
                }
                break;
            default:
                jSONReader.readFieldNameHashCodeUnquote();
                C1607k.m6296a("not support operator : ", jSONReader.getFieldName());
                break;
        }
        return null;
    }

    public static String remove(String str, String str2) {
        Object obj = JSON.parse(str);
        m6205of(str2).remove(obj);
        return JSON.toJSONString(obj);
    }

    public static String set(String str, String str2, Object obj) {
        Object obj2 = JSON.parse(str);
        m6205of(str2).set(obj2, obj);
        return JSON.toJSONString(obj2);
    }

    public void arrayAdd(Object obj, Object... objArr) {
        Object objEval = eval(obj);
        if (objEval == null) {
            set(obj, JSONArray.m6188of(objArr));
        } else if (objEval instanceof Collection) {
            ((Collection) objEval).addAll(Arrays.asList(objArr));
        }
    }

    public abstract boolean contains(Object obj);

    public JSONReader.Context createContext() {
        return JSONFactory.createReadContext();
    }

    public boolean endsWithFilter() {
        return false;
    }

    public abstract Object eval(Object obj);

    public abstract Object extract(JSONReader jSONReader);

    public void extract(JSONReader jSONReader, ValueConsumer valueConsumer) {
        Object objExtract = extract(jSONReader);
        if (objExtract == null) {
            valueConsumer.acceptNull();
            return;
        }
        if (objExtract instanceof Number) {
            valueConsumer.accept((Number) objExtract);
            return;
        }
        if (objExtract instanceof String) {
            valueConsumer.accept((String) objExtract);
            return;
        }
        if (objExtract instanceof Boolean) {
            valueConsumer.accept(((Boolean) objExtract).booleanValue());
            return;
        }
        if (objExtract instanceof Map) {
            valueConsumer.accept((Map) objExtract);
        } else if (objExtract instanceof List) {
            valueConsumer.accept((List) objExtract);
        } else {
            C1607k.m6296a("TODO : ", objExtract.getClass());
        }
    }

    public Integer extractInt32(JSONReader jSONReader) {
        int iExtractInt32Value = extractInt32Value(jSONReader);
        if (jSONReader.wasNull) {
            return null;
        }
        return Integer.valueOf(iExtractInt32Value);
    }

    public int extractInt32Value(JSONReader jSONReader) {
        Object objExtract = extract(jSONReader);
        if (objExtract == null) {
            jSONReader.wasNull = true;
            return 0;
        }
        if (objExtract instanceof Number) {
            return ((Number) objExtract).intValue();
        }
        Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objExtract.getClass(), Integer.TYPE);
        if (typeConvert != null) {
            return ((Integer) typeConvert.apply(objExtract)).intValue();
        }
        C1605j.m6294a("can not convert to int : ", objExtract);
        return 0;
    }

    public Long extractInt64(JSONReader jSONReader) {
        long jExtractInt64Value = extractInt64Value(jSONReader);
        if (jSONReader.wasNull) {
            return null;
        }
        return Long.valueOf(jExtractInt64Value);
    }

    public long extractInt64Value(JSONReader jSONReader) {
        Object objExtract = extract(jSONReader);
        if (objExtract == null) {
            jSONReader.wasNull = true;
            return 0L;
        }
        if (objExtract instanceof Number) {
            return ((Number) objExtract).longValue();
        }
        Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objExtract.getClass(), Long.TYPE);
        if (typeConvert != null) {
            return ((Long) typeConvert.apply(objExtract)).longValue();
        }
        C1605j.m6294a("can not convert to long : ", objExtract);
        return 0L;
    }

    public abstract String extractScalar(JSONReader jSONReader);

    public void extractScalar(JSONReader jSONReader, ValueConsumer valueConsumer) {
        String strExtractScalar = extractScalar(jSONReader);
        if (strExtractScalar == null) {
            valueConsumer.acceptNull();
        } else {
            valueConsumer.accept(strExtractScalar.toString());
        }
    }

    public abstract JSONPath getParent();

    public JSONReader.Context getReaderContext() {
        if (this.readerContext == null) {
            this.readerContext = JSONFactory.createReadContext();
        }
        return this.readerContext;
    }

    public JSONWriter.Context getWriterContext() {
        if (this.writerContext == null) {
            this.writerContext = JSONFactory.createWriteContext();
        }
        return this.writerContext;
    }

    public boolean isPrevious() {
        return false;
    }

    public abstract boolean isRef();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae A[PHI: r10
  0x00ae: PHI (r10v4 ??) = (r10v3 ??), (r10v8 ??) binds: [B:31:0x0066, B:40:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void paths(java.util.Map<java.lang.Object, java.lang.String> r18, java.util.Map r19, java.lang.String r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPath.paths(java.util.Map, java.util.Map, java.lang.String, java.lang.Object):void");
    }

    public abstract boolean remove(Object obj);

    public abstract void set(Object obj, Object obj2);

    public abstract void set(Object obj, Object obj2, JSONReader.Feature... featureArr);

    public abstract void setCallback(Object obj, BiFunction biFunction);

    public void setCallback(Object obj, Function function) {
        setCallback(obj, new JSONPathFunction.BiFunctionAdapter(function));
    }

    public abstract void setInt(Object obj, int i10);

    public abstract void setLong(Object obj, long j10);

    public JSONPath setReaderContext(JSONReader.Context context) {
        this.readerContext = context;
        return this;
    }

    public JSONPath setWriterContext(JSONWriter.Context context) {
        this.writerContext = context;
        return this;
    }

    public final String toString() {
        return this.path;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class PreviousPath extends JSONPath {
        static final PreviousPath INSTANCE = new PreviousPath("#-1");

        public PreviousPath(String str) {
            super(str, new Feature[0]);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean contains(Object obj) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object eval(Object obj) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object extract(JSONReader jSONReader) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public String extractScalar(JSONReader jSONReader) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public JSONPath getParent() {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean isPrevious() {
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean isRef() {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean remove(Object obj) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setCallback(Object obj, BiFunction biFunction) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setInt(Object obj, int i10) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setLong(Object obj, long j10) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
            throw new JSONException("unsupported operation");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class RootPath extends JSONPath {
        static final RootPath INSTANCE = new RootPath();

        private RootPath() {
            super("$", new Feature[0]);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean contains(Object obj) {
            return false;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object extract(JSONReader jSONReader) {
            if (jSONReader == null) {
                return null;
            }
            return jSONReader.readAny();
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public String extractScalar(JSONReader jSONReader) {
            return JSON.toJSONString(jSONReader.readAny());
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public JSONPath getParent() {
            return null;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean isRef() {
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean remove(Object obj) {
            return false;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setCallback(Object obj, BiFunction biFunction) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setInt(Object obj, int i10) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setLong(Object obj, long j10) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object eval(Object obj) {
            return obj;
        }
    }

    public static Object eval(String str, String str2) {
        return extract(str, str2);
    }

    public static Object setCallback(Object obj, String str, Function function) {
        m6205of(str).setCallback(obj, function);
        return obj;
    }

    public static Object setCallback(Object obj, String str, BiFunction biFunction) {
        m6205of(str).setCallback(obj, biFunction);
        return obj;
    }

    @Deprecated
    public static JSONPath compile(String str) {
        return m6205of(str);
    }

    public static void remove(Object obj, String str) {
        m6205of(str).remove(obj);
    }

    public static Object set(Object obj, String str, Object obj2) {
        m6205of(str).set(obj, obj2);
        return obj;
    }

    public JSONPath(String str, long j10) {
        this.path = str;
        this.features = j10;
    }

    public static Object extract(String str, String str2) {
        return m6205of(str2).extract(JSONReader.m6226of(str));
    }

    public static Object extract(String str, String str2, Feature... featureArr) {
        return m6208of(str2, featureArr).extract(JSONReader.m6226of(str));
    }

    public Object extract(String str) {
        if (str == null) {
            return null;
        }
        JSONReader jSONReaderM6229of = JSONReader.m6229of(str, createContext());
        try {
            Object objExtract = extract(jSONReaderM6229of);
            if (jSONReaderM6229of != null) {
                jSONReaderM6229of.close();
            }
            return objExtract;
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

    public Object extract(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        JSONReader jSONReaderM6238of = JSONReader.m6238of(bArr, createContext());
        try {
            Object objExtract = extract(jSONReaderM6238of);
            if (jSONReaderM6238of != null) {
                jSONReaderM6238of.close();
            }
            return objExtract;
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

    public Object extract(byte[] bArr, int i10, int i11, Charset charset) {
        if (bArr == null) {
            return null;
        }
        JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, i11, charset, createContext());
        try {
            Object objExtract = extract(jSONReaderM6237of);
            if (jSONReaderM6237of != null) {
                jSONReaderM6237of.close();
            }
            return objExtract;
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

    public static Map<String, Object> paths(Object obj) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RootPath.INSTANCE.paths(identityHashMap, linkedHashMap, "$", obj);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: of */
    public static JSONPath m6205of(String str) {
        if ("#-1".equals(str)) {
            return PreviousPath.INSTANCE;
        }
        return new JSONPathParser(str).parse(new Feature[0]);
    }

    /* JADX INFO: renamed from: of */
    public static JSONPath m6206of(String str, Type type) {
        return JSONPathTyped.m6216of(m6205of(str), type);
    }

    /* JADX INFO: renamed from: of */
    public static JSONPath m6207of(String str, Type type, Feature... featureArr) {
        return JSONPathTyped.m6216of(m6208of(str, featureArr), type);
    }

    /* JADX INFO: renamed from: of */
    public static JSONPath m6209of(String[] strArr, Type[] typeArr) {
        return m6211of(strArr, typeArr, null, null, null, new JSONReader.Feature[0]);
    }

    /* JADX INFO: renamed from: of */
    public static JSONPath m6210of(String[] strArr, Type[] typeArr, JSONReader.Feature... featureArr) {
        return m6211of(strArr, typeArr, null, null, null, featureArr);
    }

    /* JADX INFO: renamed from: of */
    public static JSONPathSingle m6212of(JSONPathSegment jSONPathSegment) {
        String str;
        if (!(jSONPathSegment instanceof JSONPathSegment.MultiIndexSegment) && !(jSONPathSegment instanceof JSONPathSegmentIndex)) {
            str = "$.";
        } else {
            str = "$";
        }
        String str2 = str + jSONPathSegment.toString();
        if (jSONPathSegment instanceof JSONPathSegmentName) {
            return new JSONPathSingleName(str2, (JSONPathSegmentName) jSONPathSegment, new Feature[0]);
        }
        return new JSONPathSingle(jSONPathSegment, str2, new Feature[0]);
    }

    /* JADX INFO: renamed from: of */
    public static JSONPath m6208of(String str, Feature... featureArr) {
        if ("#-1".equals(str)) {
            return PreviousPath.INSTANCE;
        }
        return new JSONPathParser(str).parse(featureArr);
    }
}
