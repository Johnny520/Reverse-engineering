package com.alibaba.fastjson2;

import com.alibaba.fastjson2.codec.FieldInfo;
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
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.url._UrlKt;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONWriter implements Closeable {
    public static final long MAKS_ERROR_ON_NONE_SERIALIZABLE = 4;
    public static final long MASK_BEAN_TO_ARRAY = 8;
    public static final long MASK_BROWSER_COMPATIBLE = 32;
    public static final long MASK_BROWSER_SECURE = 34359738368L;
    public static final long MASK_ESCAPE_NONE_ASCII = 1073741824;
    public static final long MASK_FIELD_BASED = 1;
    public static final long MASK_IGNORE_ERROR_GETTER = 32768;
    public static final long MASK_IGNORE_NONE_SERIALIZABLE = 2;
    public static final long MASK_IGNORE_NON_FIELD_GETTER = 4294967296L;
    public static final long MASK_NOT_WRITE_DEFAULT_VALUE = 4096;
    public static final long MASK_NOT_WRITE_EMPTY_ARRAY = 67108864;
    public static final long MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME = 2048;
    public static final long MASK_NOT_WRITE_NUMBER_CLASS_NAME = 1099511627776L;
    public static final long MASK_NOT_WRITE_ROOT_CLASSNAME = 1024;
    public static final long MASK_NULL_AS_DEFAULT_VALUE = 64;
    public static final long MASK_PRETTY_FORMAT = 65536;
    public static final long MASK_REFERENCE_DETECTION = 131072;
    public static final long MASK_UNQUOTE_FIELD_NAME = 274877906944L;
    public static final long MASK_USE_SINGLE_QUOTES = 1048576;
    public static final long MASK_WRITE_BIG_DECIMAL_AS_PLAIN = 524288;
    public static final long MASK_WRITE_BOOLEAN_AS_NUMBER = 128;
    public static final long MASK_WRITE_CLASS_NAME = 512;
    public static final long MASK_WRITE_ENUMS_USING_NAME = 8192;
    public static final long MASK_WRITE_ENUM_USING_ORDINAL = 68719476736L;
    public static final long MASK_WRITE_ENUM_USING_TO_STRING = 16384;
    public static final long MASK_WRITE_FLOAT_SPECIAL_AS_STRING = 35184372088832L;
    public static final long MASK_WRITE_LONG_AS_STRING = 17179869184L;
    public static final long MASK_WRITE_MAP_NULL_VALUE = 16;
    public static final long MASK_WRITE_NON_STRING_KEY_AS_STRING = 134217728;
    public static final long MASK_WRITE_NON_STRING_VALUE_AS_STRING = 256;
    public static final long MASK_WRITE_NULL_BOOLEAN_AS_FALSE = 33554432;
    public static final long MASK_WRITE_NULL_LIST_AS_EMPTY = 4194304;
    public static final long MASK_WRITE_NULL_NUMBER_AS_ZERO = 16777216;
    public static final long MASK_WRITE_NULL_STRING_AS_EMPTY = 8388608;
    public static final long MASK_WRITE_PAIR_AS_JAVA_BEAN = 268435456;
    static final byte PRETTY_2_SPACE = 2;
    static final byte PRETTY_4_SPACE = 4;
    static final byte PRETTY_NON = 0;
    static final byte PRETTY_TAB = 1;
    protected Object attachment;
    protected final Charset charset;
    public final Context context;
    public final boolean jsonb;
    protected String lastReference;
    protected int level;
    protected final int maxArraySize;
    protected int off;
    protected Path path;
    protected byte pretty;
    protected final char quote;
    protected IdentityHashMap<Object, Path> refs;
    protected Object rootObject;
    protected boolean startObject;
    public final SymbolTable symbolTable;
    public final boolean useSingleQuote;
    public final boolean utf16;
    public final boolean utf8;
    static final long WRITE_ARRAY_NULL_MASK = Feature.NullAsDefaultValue.mask | Feature.WriteNullListAsEmpty.mask;
    static final long NONE_DIRECT_FEATURES = (Feature.ReferenceDetection.mask | Feature.NotWriteEmptyArray.mask) | Feature.NotWriteDefaultValue.mask;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        BeanToArray(8),
        WriteNulls(16),
        WriteMapNullValue(16),
        BrowserCompatible(32),
        NullAsDefaultValue(64),
        WriteBooleanAsNumber(128),
        WriteNonStringValueAsString(256),
        WriteClassName(512),
        NotWriteRootClassName(1024),
        NotWriteHashMapArrayListClassName(JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME),
        NotWriteDefaultValue(JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE),
        WriteEnumsUsingName(JSONWriter.MASK_WRITE_ENUMS_USING_NAME),
        WriteEnumUsingToString(16384),
        IgnoreErrorGetter(JSONWriter.MASK_IGNORE_ERROR_GETTER),
        PrettyFormat(JSONWriter.MASK_PRETTY_FORMAT),
        ReferenceDetection(JSONWriter.MASK_REFERENCE_DETECTION),
        WriteNameAsSymbol(262144),
        WriteBigDecimalAsPlain(JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN),
        UseSingleQuotes(JSONWriter.MASK_USE_SINGLE_QUOTES),
        MapSortField(2097152),
        WriteNullListAsEmpty(JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY),
        WriteNullStringAsEmpty(JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY),
        WriteNullNumberAsZero(JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO),
        WriteNullBooleanAsFalse(JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE),
        NotWriteEmptyArray(JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY),
        IgnoreEmpty(JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY),
        WriteNonStringKeyAsString(JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING),
        WritePairAsJavaBean(JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN),
        OptimizedForAscii(536870912),
        EscapeNoneAscii(JSONWriter.MASK_ESCAPE_NONE_ASCII),
        WriteByteArrayAsBase64(2147483648L),
        IgnoreNonFieldGetter(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER),
        LargeObject(8589934592L),
        WriteLongAsString(JSONWriter.MASK_WRITE_LONG_AS_STRING),
        BrowserSecure(JSONWriter.MASK_BROWSER_SECURE),
        WriteEnumUsingOrdinal(JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL),
        WriteThrowableClassName(137438953472L),
        UnquoteFieldName(JSONWriter.MASK_UNQUOTE_FIELD_NAME),
        NotWriteSetClassName(549755813888L),
        NotWriteNumberClassName(JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME),
        SortMapEntriesByKeys(2199023255552L),
        PrettyFormatWith2Space(4398046511104L),
        PrettyFormatWith4Space(8796093022208L),
        WriterUtilDateAsMillis(17592186044416L),
        WriteFloatSpecialAsString(JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING);

        public final long mask;

        Feature(long j10) {
            this.mask = j10;
        }

        public boolean isEnabled(long j10) {
            return (j10 & this.mask) != 0;
        }
    }

    public JSONWriter(Context context, SymbolTable symbolTable, boolean z10, Charset charset) {
        this.context = context;
        this.symbolTable = symbolTable;
        this.charset = charset;
        this.jsonb = z10;
        this.utf8 = !z10 && charset == StandardCharsets.UTF_8;
        this.utf16 = !z10 && charset == StandardCharsets.UTF_16;
        boolean z11 = (z10 || (context.features & Feature.UseSingleQuotes.mask) == 0) ? false : true;
        this.useSingleQuote = z11;
        this.quote = z11 ? '\'' : '\"';
        long j10 = context.features;
        this.maxArraySize = (Feature.LargeObject.mask & j10) != 0 ? 1073741824 : 67108864;
        if ((Feature.PrettyFormatWith4Space.mask & j10) != 0) {
            this.pretty = PRETTY_4_SPACE;
            return;
        }
        if ((Feature.PrettyFormatWith2Space.mask & j10) != 0) {
            this.pretty = PRETTY_2_SPACE;
        } else if ((j10 & Feature.PrettyFormat.mask) != 0) {
            this.pretty = (byte) 1;
        } else {
            this.pretty = (byte) 0;
        }
    }

    public static IllegalArgumentException illegalYear(int i10) {
        return new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i10);
    }

    public static boolean isWriteAsString(long j10, long j11) {
        if ((17179869440L & j11) == 0) {
            return ((j11 & 32) == 0 || TypeUtils.isJavaScriptSupport(j10)) ? false : true;
        }
        return true;
    }

    private static boolean isWriteTypeInfoGenericArray(GenericArrayType genericArrayType, Class cls) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            genericComponentType = ((ParameterizedType) genericComponentType).getRawType();
        }
        if (cls.isArray()) {
            return cls.getComponentType().equals(genericComponentType);
        }
        return false;
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m6247of() {
        Context context = new Context(JSONFactory.defaultObjectWriterProvider);
        return JDKUtils.JVM_VERSION == 8 ? (JDKUtils.FIELD_STRING_VALUE == null || JDKUtils.ANDROID || JDKUtils.OPENJ9) ? new JSONWriterUTF16JDK8(context) : new JSONWriterUTF16JDK8UF(context) : (JSONFactory.defaultWriterFeatures & Feature.OptimizedForAscii.mask) != 0 ? ofUTF8(context) : (JDKUtils.FIELD_STRING_VALUE == null || JDKUtils.STRING_CODER == null || JDKUtils.STRING_VALUE == null) ? new JSONWriterUTF16(context) : new JSONWriterUTF16JDK9UF(context);
    }

    public static JSONWriter ofJSONB() {
        return new JSONWriterJSONB(new Context(JSONFactory.defaultObjectWriterProvider), null);
    }

    public static JSONWriter ofPretty(JSONWriter jSONWriter) {
        if (jSONWriter.pretty == 0) {
            jSONWriter.pretty = (byte) 1;
            jSONWriter.context.features |= Feature.PrettyFormat.mask;
        }
        return jSONWriter;
    }

    public static JSONWriter ofUTF16(Feature... featureArr) {
        Context contextCreateWriteContext = JSONFactory.createWriteContext(featureArr);
        return JDKUtils.JVM_VERSION == 8 ? (JDKUtils.FIELD_STRING_VALUE == null || JDKUtils.ANDROID || JDKUtils.OPENJ9) ? new JSONWriterUTF16JDK8(contextCreateWriteContext) : new JSONWriterUTF16JDK8UF(contextCreateWriteContext) : (JDKUtils.FIELD_STRING_VALUE == null || JDKUtils.STRING_CODER == null || JDKUtils.STRING_VALUE == null) ? new JSONWriterUTF16(contextCreateWriteContext) : new JSONWriterUTF16JDK9UF(contextCreateWriteContext);
    }

    public static JSONWriter ofUTF8() {
        return ofUTF8(JSONFactory.createWriteContext());
    }

    public final void addManagerReference(Object obj) {
        if (this.refs == null) {
            this.refs = new IdentityHashMap<>(8);
        }
        this.refs.putIfAbsent(obj, Path.MANGER_REFERNCE);
    }

    public final void checkAndWriteTypeName(Object obj, Class cls) {
        Class<?> cls2;
        long j10 = this.context.features;
        if ((Feature.WriteClassName.mask & j10) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j10) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            if ((j10 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject) {
                writeTypeName(TypeUtils.getTypeName(cls2));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final void config(Feature... featureArr) {
        this.context.config(featureArr);
    }

    public final boolean containsReference(Object obj) {
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        return identityHashMap != null && identityHashMap.containsKey(obj);
    }

    public final void decrementIdent() {
        this.level--;
    }

    public abstract void endArray();

    public abstract void endObject();

    public abstract Object ensureCapacity(int i10);

    public abstract int flushTo(OutputStream outputStream);

    public abstract int flushTo(OutputStream outputStream, Charset charset);

    public void flushTo(Writer writer) {
        try {
            writer.write(toString());
            this.off = 0;
        } catch (IOException e10) {
            C1565a.m6255a("flushTo error", e10);
        }
    }

    public Object getAttachment() {
        return this.attachment;
    }

    public abstract byte[] getBytes();

    public abstract byte[] getBytes(Charset charset);

    public final Charset getCharset() {
        return this.charset;
    }

    public final Context getContext() {
        return this.context;
    }

    public final long getFeatures(long j10) {
        return j10 | this.context.features;
    }

    public final ObjectWriter getObjectWriter(Class cls) {
        Context context = this.context;
        return context.provider.getObjectWriter(cls, cls, (context.features & Feature.FieldBased.mask) != 0);
    }

    public int getOffset() {
        return this.off;
    }

    public final String getPath(Object obj) {
        Path path;
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        return (identityHashMap == null || (path = identityHashMap.get(obj)) == null) ? "$" : path.toString();
    }

    public final SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    public final boolean hasFilter(boolean z10) {
        Context context = this.context;
        if (context.hasFilter) {
            return true;
        }
        return z10 && (context.features & Feature.IgnoreNonFieldGetter.mask) != 0;
    }

    public final void incrementIndent() {
        this.level++;
    }

    public final boolean isBeanToArray() {
        return (this.context.features & Feature.BeanToArray.mask) != 0;
    }

    public final boolean isEnabled(Feature feature) {
        return (this.context.features & feature.mask) != 0;
    }

    public final boolean isIgnoreErrorGetter() {
        return (this.context.features & Feature.IgnoreErrorGetter.mask) != 0;
    }

    public final boolean isIgnoreNoneSerializable(Object obj) {
        return ((this.context.features & Feature.IgnoreNoneSerializable.mask) == 0 || obj == null || Serializable.class.isAssignableFrom(obj.getClass())) ? false : true;
    }

    public final boolean isRefDetect(Object obj) {
        long j10 = this.context.features;
        return ((Feature.ReferenceDetection.mask & j10) == 0 || (j10 & FieldInfo.DISABLE_REFERENCE_DETECT) != 0 || obj == null || ObjectWriterProvider.isNotReferenceDetect(obj.getClass())) ? false : true;
    }

    public final boolean isUTF16() {
        return this.utf16;
    }

    public final boolean isUTF8() {
        return this.utf8;
    }

    public final boolean isUseSingleQuotes() {
        return this.useSingleQuote;
    }

    public final boolean isWriteMapTypeInfo(Object obj, Class cls, long j10) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j11 = j10 | this.context.features;
        if ((Feature.WriteClassName.mask & j11) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j11) == 0 || cls2 != HashMap.class) {
            return (j11 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final boolean isWriteNulls() {
        return (this.context.features & Feature.WriteNulls.mask) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isWriteTypeInfo(java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
        /*
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            long r9 = r9 | r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r0.mask
            long r0 = r0 & r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            java.lang.Class r0 = r7.getClass()
            boolean r4 = r8 instanceof java.lang.Class
            if (r4 == 0) goto L20
            java.lang.Class r8 = (java.lang.Class) r8
            goto L32
        L20:
            boolean r4 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L31
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type r8 = r8.getRawType()
            boolean r4 = r8 instanceof java.lang.Class
            if (r4 == 0) goto L31
            java.lang.Class r8 = (java.lang.Class) r8
            goto L32
        L31:
            r8 = 0
        L32:
            if (r0 != r8) goto L35
            return r1
        L35:
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r4 = r4.mask
            long r4 = r4 & r9
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L56
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            if (r0 != r4) goto L51
            if (r8 == 0) goto L50
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r8 == r0) goto L50
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            if (r8 == r0) goto L50
            java.lang.Class<java.util.AbstractMap> r0 = java.util.AbstractMap.class
            if (r8 != r0) goto L56
        L50:
            return r1
        L51:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            if (r0 != r8) goto L56
            return r1
        L56:
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r4 = r8.mask
            long r8 = r9 & r4
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L66
            java.lang.Object r8 = r6.rootObject
            if (r7 == r8) goto L65
            goto L66
        L65:
            return r1
        L66:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.isWriteTypeInfo(java.lang.Object, java.lang.reflect.Type, long):boolean");
    }

    public final int level() {
        return this.level;
    }

    public final int newCapacity(int i10, int i11) {
        int i12 = i11 + (i11 >> 1);
        if (i12 - i10 < 0) {
            i12 = i10;
        }
        int i13 = this.maxArraySize;
        if (i12 <= i13) {
            return i12;
        }
        if (i10 < i13) {
            return i13;
        }
        throw new JSONLargeObjectException("Maximum array size exceeded. Try enabling LargeObject feature instead. Requested size: " + i10 + ", max size: " + this.maxArraySize);
    }

    public final void overflowLevel() {
        throw new JSONException("level too large : " + this.level);
    }

    public final void popPath(Object obj) {
        if (isRefDetect(obj)) {
            popPath0(obj);
        }
    }

    public final void popPath0(Object obj) {
        Path path = this.path;
        if (path == null || (this.context.features & MASK_REFERENCE_DETECTION) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET) {
            return;
        }
        this.path = path.parent;
    }

    public void println() {
        writeRaw('\n');
        for (int i10 = 0; i10 < this.level; i10++) {
            writeRaw('\t');
        }
    }

    public final boolean removeReference(Object obj) {
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        return (identityHashMap == null || identityHashMap.remove(obj) == null) ? false : true;
    }

    public void setAttachment(Object obj) {
        this.attachment = obj;
    }

    public void setOffset(int i10) {
        this.off = i10;
    }

    public final String setPath(FieldWriter fieldWriter, Object obj) {
        IdentityHashMap<Object, Path> identityHashMap;
        if (!isRefDetect(obj)) {
            return null;
        }
        Path path = this.path;
        Path path2 = Path.ROOT;
        this.path = path == path2 ? fieldWriter.getRootParentPath() : fieldWriter.getPath(path);
        if (obj == this.rootObject || ((identityHashMap = this.refs) != null && (path2 = identityHashMap.get(obj)) != null)) {
            return path2.toString();
        }
        if (this.refs == null) {
            this.refs = new IdentityHashMap<>(8);
        }
        this.refs.put(obj, this.path);
        return null;
    }

    public final String setPath0(int i10, Object obj) {
        Path path;
        Path path2;
        Path path3 = this.path;
        if (path3 == null) {
            return null;
        }
        if (i10 == 0) {
            path = path3.child0;
            if (path == null) {
                path = new Path(this.path, i10);
                path3.child0 = path;
            }
        } else if (i10 == 1) {
            path = path3.child1;
            if (path == null) {
                path = new Path(this.path, i10);
                path3.child1 = path;
            }
        } else {
            path = new Path(this.path, i10);
        }
        this.path = path;
        if (obj == this.rootObject) {
            path2 = Path.ROOT;
        } else {
            IdentityHashMap<Object, Path> identityHashMap = this.refs;
            if (identityHashMap == null || (path2 = identityHashMap.get(obj)) == null) {
                if (this.refs == null) {
                    this.refs = new IdentityHashMap<>(8);
                }
                this.refs.put(obj, this.path);
                return null;
            }
        }
        return path2.toString();
    }

    public final void setRootObject(Object obj) {
        this.rootObject = obj;
        this.path = Path.ROOT;
    }

    public abstract int size();

    public abstract void startArray();

    public void startArray(int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    public void startArray0() {
        startArray(0);
    }

    public void startArray1() {
        startArray(1);
    }

    public void startArray10() {
        startArray(10);
    }

    public void startArray11() {
        startArray(11);
    }

    public void startArray12() {
        startArray(12);
    }

    public void startArray13() {
        startArray(13);
    }

    public void startArray14() {
        startArray(14);
    }

    public void startArray15() {
        startArray(15);
    }

    public void startArray2() {
        startArray(2);
    }

    public void startArray3() {
        startArray(3);
    }

    public void startArray4() {
        startArray(4);
    }

    public void startArray5() {
        startArray(5);
    }

    public void startArray6() {
        startArray(6);
    }

    public void startArray7() {
        startArray(7);
    }

    public void startArray8() {
        startArray(8);
    }

    public void startArray9() {
        startArray(9);
    }

    public abstract void startObject();

    public abstract void write(List list);

    public void write(Map<?, ?> map) {
        if (map == null) {
            writeNull();
            return;
        }
        if (map.isEmpty()) {
            writeRaw('{', '}');
            return;
        }
        Context context = this.context;
        if ((context.features & NONE_DIRECT_FEATURES) != 0) {
            context.getObjectWriter(map.getClass()).write(this, map, null, null, 0L);
            return;
        }
        startObject();
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (this.context.features & Feature.WriteMapNullValue.mask) != 0) {
                if (!z10) {
                    writeComma();
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    writeString((String) key);
                } else {
                    writeAny(key);
                }
                writeColon();
                if (value == null) {
                    writeNull();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        writeString((String) value);
                    } else if (cls == Integer.class) {
                        writeInt32((Integer) value);
                    } else if (cls == Long.class) {
                        writeInt64((Long) value);
                    } else if (cls == Boolean.class) {
                        writeBool(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        writeDecimal((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        write((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        write((JSONObject) value);
                    } else {
                        this.context.getObjectWriter(cls, cls).write(this, value, null, null, 0L);
                    }
                }
                z10 = false;
            }
        }
        endObject();
    }

    public abstract void write0(char c10);

    public void writeAny(Object obj) {
        if (obj == null) {
            writeNull();
        } else {
            Class<?> cls = obj.getClass();
            this.context.getObjectWriter(cls, cls).write(this, obj, null, null, 0L);
        }
    }

    public void writeArrayNull(long j10) {
        writeRaw((j10 & 4194368) != 0 ? _UrlKt.PATH_SEGMENT_ENCODE_SET_URI : "null");
    }

    public final void writeAs(Object obj, Class cls) {
        if (obj == null) {
            writeNull();
        } else {
            this.context.getObjectWriter(cls).write(this, obj, null, null, 0L);
        }
    }

    public abstract void writeBase64(byte[] bArr);

    public final void writeBigInt(BigInteger bigInteger) {
        writeBigInt(bigInteger, 0L);
    }

    public abstract void writeBigInt(BigInteger bigInteger, long j10);

    public void writeBinary(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        if ((this.context.features & Feature.WriteByteArrayAsBase64.mask) != 0) {
            writeBase64(bArr);
            return;
        }
        startArray();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeInt32(bArr[i10]);
        }
        endArray();
    }

    public abstract void writeBool(boolean z10);

    public void writeBool(boolean[] zArr) {
        if (zArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < zArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeBool(zArr[i10]);
        }
        endArray();
    }

    public final void writeBooleanNull() {
        if ((this.context.features & (Feature.WriteNullBooleanAsFalse.mask | 64)) != 0) {
            writeBool(false);
        } else {
            writeNull();
        }
    }

    public abstract void writeChar(char c10);

    public abstract void writeColon();

    public abstract void writeComma();

    public abstract void writeDateTime14(int i10, int i11, int i12, int i13, int i14, int i15);

    public abstract void writeDateTime19(int i10, int i11, int i12, int i13, int i14, int i15);

    public abstract void writeDateTimeISO8601(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10);

    public abstract void writeDateYYYMMDD10(int i10, int i11, int i12);

    public abstract void writeDateYYYMMDD8(int i10, int i11, int i12);

    public final void writeDecimal(BigDecimal bigDecimal) {
        writeDecimal(bigDecimal, 0L, null);
    }

    public abstract void writeDecimal(BigDecimal bigDecimal, long j10, DecimalFormat decimalFormat);

    public final void writeDecimalNull(long j10) {
        if ((j10 & 16777280) != 0) {
            writeDouble(0.0d);
        } else {
            writeNull();
        }
    }

    public abstract void writeDouble(double d10);

    public abstract void writeDouble(double[] dArr);

    public final void writeDouble(double[] dArr, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.jsonb) {
            writeDouble(dArr);
            return;
        }
        if (dArr == null) {
            writeNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < dArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            if (Double.isFinite(dArr[i10])) {
                writeRaw(decimalFormat.format(dArr[i10]));
            } else if ((this.context.features & Feature.WriteFloatSpecialAsString.mask) != 0) {
                writeDouble(dArr[i10]);
            } else {
                writeNull();
            }
        }
        endArray();
    }

    public void writeDoubleArray(double d10, double d11) {
        startArray();
        writeDouble(d10);
        writeComma();
        writeDouble(d11);
        endArray();
    }

    public void writeEnum(Enum r72) {
        if (r72 == null) {
            writeNull();
            return;
        }
        long j10 = this.context.features;
        if ((Feature.WriteEnumUsingToString.mask & j10) != 0) {
            writeString(r72.toString());
        } else if ((j10 & Feature.WriteEnumsUsingName.mask) != 0) {
            writeString(r72.name());
        } else {
            writeInt32(r72.ordinal());
        }
    }

    public abstract void writeFloat(float f10);

    public abstract void writeFloat(float[] fArr);

    public final void writeFloat(float[] fArr, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.jsonb) {
            writeFloat(fArr);
            return;
        }
        if (fArr == null) {
            writeNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            if (Float.isFinite(fArr[i10])) {
                writeRaw(decimalFormat.format(fArr[i10]));
            } else if ((this.context.features & Feature.WriteFloatSpecialAsString.mask) != 0) {
                writeFloat(fArr[i10]);
            } else {
                writeNull();
            }
        }
        endArray();
    }

    public abstract void writeHex(byte[] bArr);

    public void writeInstant(Instant instant) {
        if (instant == null) {
            writeNull();
        } else {
            writeString(DateTimeFormatter.ISO_INSTANT.format(instant));
        }
    }

    public abstract void writeInt16(short s10);

    public void writeInt16(short[] sArr) {
        if (sArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < sArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeInt16(sArr[i10]);
        }
        endArray();
    }

    public abstract void writeInt32(int i10);

    public final void writeInt32(int i10, String str) {
        if (str == null || this.jsonb) {
            writeInt32(i10);
        } else {
            writeString(String.format(str, Integer.valueOf(i10)));
        }
    }

    public abstract void writeInt32(Integer num);

    public abstract void writeInt32(int[] iArr);

    public abstract void writeInt64(long j10);

    public abstract void writeInt64(Long l10);

    public abstract void writeInt64(long[] jArr);

    public final void writeInt64Null() {
        if ((this.context.features & 16777280) != 0) {
            writeInt64(0L);
        } else {
            writeNull();
        }
    }

    public abstract void writeInt8(byte b10);

    public abstract void writeInt8(byte[] bArr);

    public abstract void writeListInt32(List<Integer> list);

    public abstract void writeListInt64(List<Long> list);

    public abstract void writeLocalDate(LocalDate localDate);

    public abstract void writeLocalDateTime(LocalDateTime localDateTime);

    public final boolean writeLocalDateWithFormat(LocalDate localDate) {
        Context context = this.context;
        if (context.dateFormatUnixTime || context.dateFormatMillis) {
            long epochMilli = LocalDateTime.of(localDate, LocalTime.MIN).atZone(context.getZoneId()).toInstant().toEpochMilli();
            if (!context.dateFormatMillis) {
                epochMilli /= 1000;
            }
            writeInt64(epochMilli);
            return true;
        }
        DateTimeFormatter dateFormatter = context.getDateFormatter();
        if (dateFormatter == null) {
            return false;
        }
        writeString(context.isDateFormatHasHour() ? dateFormatter.format(LocalDateTime.of(localDate, LocalTime.MIN)) : dateFormatter.format(localDate));
        return true;
    }

    public abstract void writeLocalTime(LocalTime localTime);

    public void writeMillis(long j10) {
        writeInt64(j10);
    }

    public void writeName(String str) {
        boolean z10 = false;
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        boolean z11 = (this.context.features & Feature.UnquoteFieldName.mask) != 0;
        if (!z11 || (str.indexOf(this.quote) < 0 && str.indexOf(92) < 0)) {
            z10 = z11;
        }
        if (z10) {
            writeRaw(str);
        } else {
            writeString(str);
        }
    }

    public abstract void writeName10Raw(long j10, long j11);

    public abstract void writeName11Raw(long j10, long j11);

    public abstract void writeName12Raw(long j10, long j11);

    public abstract void writeName13Raw(long j10, long j11);

    public abstract void writeName14Raw(long j10, long j11);

    public abstract void writeName15Raw(long j10, long j11);

    public abstract void writeName16Raw(long j10, long j11);

    public abstract void writeName2Raw(long j10);

    public abstract void writeName3Raw(long j10);

    public abstract void writeName4Raw(long j10);

    public abstract void writeName5Raw(long j10);

    public abstract void writeName6Raw(long j10);

    public abstract void writeName7Raw(long j10);

    public abstract void writeName8Raw(long j10);

    public abstract void writeName9Raw(long j10, int i10);

    public void writeNameAny(Object obj) {
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        writeAny(obj);
    }

    public abstract void writeNameRaw(byte[] bArr);

    public void writeNameRaw(byte[] bArr, int i10, int i11) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeNameRaw(char[] cArr);

    public abstract void writeNameRaw(char[] cArr, int i10, int i11);

    public final void writeNameValue(String str, Object obj) {
        writeName(str);
        writeColon();
        writeAny(obj);
    }

    public abstract void writeNull();

    public final void writeNumberNull(long j10) {
        if ((j10 & 16777280) != 0) {
            writeInt32(0);
        } else {
            writeNull();
        }
    }

    public void writeObjectNull(Class<?> cls) {
        if ((this.context.features & 64) == 0) {
            writeNull();
        } else if (cls == Character.class) {
            writeString("\u0000");
        } else {
            writeRaw('{', '}');
        }
    }

    public abstract void writeOffsetDateTime(OffsetDateTime offsetDateTime);

    public abstract void writeOffsetTime(OffsetTime offsetTime);

    public void writeRaw(byte b10) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeRaw(char c10);

    public abstract void writeRaw(String str);

    public abstract void writeRaw(byte[] bArr);

    public final void writeReference(Object obj) {
        Path path;
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        if (identityHashMap == null || (path = identityHashMap.get(obj)) == null) {
            return;
        }
        writeReference(path.toString());
    }

    public abstract void writeReference(String str);

    public abstract void writeString(byte b10);

    public abstract void writeString(int i10);

    public abstract void writeString(long j10);

    public final void writeString(Reader reader) {
        writeRaw(this.quote);
        try {
            char[] cArr = new char[2048];
            while (true) {
                int i10 = reader.read(cArr, 0, 2048);
                if (i10 < 0) {
                    writeRaw(this.quote);
                    return;
                } else if (i10 > 0) {
                    writeString(cArr, 0, i10, false);
                }
            }
        } catch (Exception e10) {
            C1565a.m6255a("read string from reader error", e10);
        }
    }

    public abstract void writeString(String str);

    public abstract void writeString(short s10);

    public abstract void writeString(boolean z10);

    public abstract void writeString(char[] cArr);

    public abstract void writeString(char[] cArr, int i10, int i11);

    public abstract void writeString(char[] cArr, int i10, int i11, boolean z10);

    public abstract void writeStringLatin1(byte[] bArr);

    public void writeStringNull() {
        long j10 = this.context.features;
        writeRaw((8388672 & j10) != 0 ? (j10 & MASK_USE_SINGLE_QUOTES) != 0 ? "''" : "\"\"" : "null");
    }

    public abstract void writeStringUTF16(byte[] bArr);

    public void writeSymbol(int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeTimeHHMMSS8(int i10, int i11, int i12);

    public void writeTypeName(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeUUID(UUID uuid);

    public abstract void writeZonedDateTime(ZonedDateTime zonedDateTime);

    public final void config(Feature feature, boolean z10) {
        this.context.config(feature, z10);
    }

    public final long getFeatures() {
        return this.context.features;
    }

    public final void writeDecimal(BigDecimal bigDecimal, long j10) {
        writeDecimal(bigDecimal, j10, null);
    }

    public void startArray(Object obj, int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    public void writeNameRaw(byte[] bArr, long j10) {
        throw new JSONException("UnsupportedOperation");
    }

    public final void writeRaw(char[] cArr) {
        writeRaw(cArr, 0, cArr.length);
    }

    public void writeSymbol(String str) {
        writeString(str);
    }

    public boolean writeTypeName(byte[] bArr, long j10) {
        throw new JSONException("UnsupportedOperation");
    }

    public static JSONWriter ofUTF8(Context context) {
        return new JSONWriterUTF8(context);
    }

    public void writeRaw(char[] cArr, int i10, int i11) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Path {
        Path child0;
        Path child1;
        String fullPath;
        final int index;
        final String name;
        public final Path parent;
        public static final Path ROOT = new Path((Path) null, "$");
        public static final Path MANGER_REFERNCE = new Path((Path) null, "#");

        public Path(Path path, String str) {
            this.parent = path;
            this.name = str;
            this.index = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Path.class == obj.getClass()) {
                Path path = (Path) obj;
                if (this.index == path.index && Objects.equals(this.parent, path.parent) && Objects.equals(this.name, path.name)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.parent, this.name, Integer.valueOf(this.index));
        }

        /* JADX WARN: Removed duplicated region for block: B:139:0x02c9 A[FALL_THROUGH] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x018c A[FALL_THROUGH] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 968
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.Path.toString():java.lang.String");
        }

        public Path(Path path, int i10) {
            this.parent = path;
            this.name = null;
            this.index = i10;
        }
    }

    public static JSONWriter ofUTF8(Feature... featureArr) {
        return ofUTF8(JSONFactory.createWriteContext(featureArr));
    }

    public void writeRaw(char c10, char c11) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Context {
        static final ZoneId DEFAULT_ZONE_ID = ZoneId.systemDefault();
        AfterFilter afterFilter;
        BeforeFilter beforeFilter;
        ContextNameFilter contextNameFilter;
        ContextValueFilter contextValueFilter;
        String dateFormat;
        boolean dateFormatISO8601;
        boolean dateFormatMillis;
        boolean dateFormatUnixTime;
        DateTimeFormatter dateFormatter;
        long features;
        boolean formatHasDay;
        boolean formatHasHour;
        boolean formatyyyyMMddhhmmss19;
        boolean hasFilter;
        LabelFilter labelFilter;
        Locale locale;
        int maxLevel;
        NameFilter nameFilter;
        PropertyFilter propertyFilter;
        PropertyPreFilter propertyPreFilter;
        public final ObjectWriterProvider provider;
        ValueFilter valueFilter;
        ZoneId zoneId;

        public Context(ObjectWriterProvider objectWriterProvider, Feature... featureArr) {
            if (objectWriterProvider == null) {
                C9987e.m38645a("objectWriterProvider must not null");
                throw null;
            }
            this.features = JSONFactory.defaultWriterFeatures;
            this.provider = objectWriterProvider;
            this.zoneId = JSONFactory.defaultWriterZoneId;
            this.maxLevel = JSONFactory.defaultMaxLevel;
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
            String str = JSONFactory.defaultWriterFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public void config(Feature... featureArr) {
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public void configFilter(Filter... filterArr) {
            for (Filter filter : filterArr) {
                if (filter instanceof NameFilter) {
                    NameFilter nameFilter = this.nameFilter;
                    if (nameFilter == null) {
                        this.nameFilter = (NameFilter) filter;
                    } else {
                        this.nameFilter = NameFilter.compose(nameFilter, (NameFilter) filter);
                    }
                }
                if (filter instanceof ValueFilter) {
                    ValueFilter valueFilter = this.valueFilter;
                    if (valueFilter == null) {
                        this.valueFilter = (ValueFilter) filter;
                    } else {
                        this.valueFilter = ValueFilter.compose(valueFilter, (ValueFilter) filter);
                    }
                }
                if (filter instanceof PropertyFilter) {
                    PropertyFilter propertyFilter = this.propertyFilter;
                    if (propertyFilter == null) {
                        this.propertyFilter = (PropertyFilter) filter;
                    } else {
                        this.propertyFilter = PropertyFilter.compose(propertyFilter, (PropertyFilter) filter);
                    }
                }
                if (filter instanceof PropertyPreFilter) {
                    PropertyPreFilter propertyPreFilter = this.propertyPreFilter;
                    if (propertyPreFilter == null) {
                        this.propertyPreFilter = (PropertyPreFilter) filter;
                    } else {
                        this.propertyPreFilter = PropertyPreFilter.compose(propertyPreFilter, (PropertyPreFilter) filter);
                    }
                }
                if (filter instanceof BeforeFilter) {
                    this.beforeFilter = (BeforeFilter) filter;
                }
                if (filter instanceof AfterFilter) {
                    this.afterFilter = (AfterFilter) filter;
                }
                if (filter instanceof LabelFilter) {
                    LabelFilter labelFilter = this.labelFilter;
                    if (labelFilter == null) {
                        this.labelFilter = (LabelFilter) filter;
                    } else {
                        this.labelFilter = LabelFilter.compose(labelFilter, (LabelFilter) filter);
                    }
                }
                if (filter instanceof ContextValueFilter) {
                    this.contextValueFilter = (ContextValueFilter) filter;
                }
                if (filter instanceof ContextNameFilter) {
                    this.contextNameFilter = (ContextNameFilter) filter;
                }
            }
            this.hasFilter = (this.propertyPreFilter == null && this.propertyFilter == null && this.nameFilter == null && this.valueFilter == null && this.beforeFilter == null && this.afterFilter == null && this.labelFilter == null && this.contextValueFilter == null && this.contextNameFilter == null) ? false : true;
        }

        public AfterFilter getAfterFilter() {
            return this.afterFilter;
        }

        public BeforeFilter getBeforeFilter() {
            return this.beforeFilter;
        }

        public ContextNameFilter getContextNameFilter() {
            return this.contextNameFilter;
        }

        public ContextValueFilter getContextValueFilter() {
            return this.contextValueFilter;
        }

        public String getDateFormat() {
            return this.dateFormat;
        }

        public DateTimeFormatter getDateFormatter() {
            String str;
            if (this.dateFormatter == null && (str = this.dateFormat) != null && !this.dateFormatMillis && !this.dateFormatISO8601 && !this.dateFormatUnixTime) {
                Locale locale = this.locale;
                this.dateFormatter = locale == null ? DateTimeFormatter.ofPattern(str) : DateTimeFormatter.ofPattern(str, locale);
            }
            return this.dateFormatter;
        }

        public long getFeatures() {
            return this.features;
        }

        public LabelFilter getLabelFilter() {
            return this.labelFilter;
        }

        public int getMaxLevel() {
            return this.maxLevel;
        }

        public NameFilter getNameFilter() {
            return this.nameFilter;
        }

        public <T> ObjectWriter<T> getObjectWriter(Class<T> cls) {
            return this.provider.getObjectWriter(cls, cls, (this.features & Feature.FieldBased.mask) != 0);
        }

        public PropertyFilter getPropertyFilter() {
            return this.propertyFilter;
        }

        public PropertyPreFilter getPropertyPreFilter() {
            return this.propertyPreFilter;
        }

        public ObjectWriterProvider getProvider() {
            return this.provider;
        }

        public ValueFilter getValueFilter() {
            return this.valueFilter;
        }

        public ZoneId getZoneId() {
            if (this.zoneId == null) {
                this.zoneId = DEFAULT_ZONE_ID;
            }
            return this.zoneId;
        }

        public boolean isDateFormatHasDay() {
            return this.formatHasDay;
        }

        public boolean isDateFormatHasHour() {
            return this.formatHasHour;
        }

        public boolean isDateFormatISO8601() {
            return this.dateFormatISO8601;
        }

        public boolean isDateFormatMillis() {
            return this.dateFormatMillis;
        }

        public boolean isDateFormatUnixTime() {
            return this.dateFormatUnixTime;
        }

        public boolean isEnabled(Feature feature) {
            return (this.features & feature.mask) != 0;
        }

        public boolean isFormatyyyyMMddhhmmss19() {
            return this.formatyyyyMMddhhmmss19;
        }

        public void setAfterFilter(AfterFilter afterFilter) {
            this.afterFilter = afterFilter;
            if (afterFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setBeforeFilter(BeforeFilter beforeFilter) {
            this.beforeFilter = beforeFilter;
            if (beforeFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setContextNameFilter(ContextNameFilter contextNameFilter) {
            this.contextNameFilter = contextNameFilter;
            if (contextNameFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setContextValueFilter(ContextValueFilter contextValueFilter) {
            this.contextValueFilter = contextValueFilter;
            if (contextValueFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void setDateFormat(String str) {
            boolean z10;
            boolean z11;
            boolean zContains;
            boolean z12;
            if (str == null || !str.equals(this.dateFormat)) {
                this.dateFormatter = null;
            }
            if (str != null && !str.isEmpty()) {
                boolean z13 = true;
                boolean z14 = false;
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -1074095546:
                        if (str.equals("millis")) {
                            b10 = 0;
                        }
                        break;
                    case -288020395:
                        if (str.equals("unixtime")) {
                            b10 = 1;
                        }
                        break;
                    case 1333195168:
                        if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                            b10 = JSONWriter.PRETTY_2_SPACE;
                        }
                        break;
                    case 1834843604:
                        if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                            b10 = 3;
                        }
                        break;
                    case 2095190916:
                        if (str.equals("iso8601")) {
                            b10 = JSONWriter.PRETTY_4_SPACE;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        z10 = false;
                        z11 = false;
                        zContains = z11;
                        z12 = zContains;
                        break;
                    case 1:
                        z10 = true;
                        z13 = false;
                        z11 = false;
                        zContains = z11;
                        z12 = zContains;
                        break;
                    case 2:
                        z11 = true;
                        zContains = true;
                        z12 = true;
                        z10 = false;
                        z13 = false;
                        break;
                    case 3:
                        str = "yyyy-MM-dd'T'HH:mm:ss";
                        z11 = true;
                        zContains = true;
                        z10 = false;
                        z13 = false;
                        z12 = false;
                        break;
                    case 4:
                        z10 = false;
                        z11 = false;
                        zContains = false;
                        z12 = false;
                        z14 = true;
                        z13 = false;
                        break;
                    default:
                        boolean zContains2 = str.contains("d");
                        zContains = str.contains("H");
                        z11 = zContains2;
                        z10 = false;
                        z13 = false;
                        z12 = false;
                        break;
                }
                this.dateFormatMillis = z13;
                this.dateFormatISO8601 = z14;
                this.dateFormatUnixTime = z10;
                this.formatHasDay = z11;
                this.formatHasHour = zContains;
                this.formatyyyyMMddhhmmss19 = z12;
            }
            this.dateFormat = str;
        }

        public void setFeatures(long j10) {
            this.features = j10;
        }

        public void setLabelFilter(LabelFilter labelFilter) {
            this.labelFilter = labelFilter;
            if (labelFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setMaxLevel(int i10) {
            this.maxLevel = i10;
        }

        public void setNameFilter(NameFilter nameFilter) {
            this.nameFilter = nameFilter;
            if (nameFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setPropertyFilter(PropertyFilter propertyFilter) {
            this.propertyFilter = propertyFilter;
            if (propertyFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
            this.propertyPreFilter = propertyPreFilter;
            if (propertyPreFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setValueFilter(ValueFilter valueFilter) {
            this.valueFilter = valueFilter;
            if (valueFilter != null) {
                this.hasFilter = true;
            }
        }

        public void setZoneId(ZoneId zoneId) {
            this.zoneId = zoneId;
        }

        public boolean isEnabled(long j10) {
            return (j10 & this.features) != 0;
        }

        public void config(Feature feature, boolean z10) {
            long j10 = this.features;
            if (z10) {
                this.features = feature.mask | j10;
            } else {
                this.features = (~feature.mask) & j10;
            }
        }

        public <T> ObjectWriter<T> getObjectWriter(Type type, Class<T> cls) {
            return this.provider.getObjectWriter(type, cls, (this.features & Feature.FieldBased.mask) != 0);
        }

        public Context(Feature... featureArr) {
            this.features = JSONFactory.defaultWriterFeatures;
            this.provider = JSONFactory.getDefaultObjectWriterProvider();
            this.zoneId = JSONFactory.defaultWriterZoneId;
            this.maxLevel = JSONFactory.defaultMaxLevel;
            String str = JSONFactory.defaultWriterFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(String str, Feature... featureArr) {
            this.features = JSONFactory.defaultWriterFeatures;
            this.provider = JSONFactory.getDefaultObjectWriterProvider();
            this.zoneId = JSONFactory.defaultWriterZoneId;
            this.maxLevel = JSONFactory.defaultMaxLevel;
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
            str = str == null ? JSONFactory.defaultWriterFormat : str;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public Context(ObjectWriterProvider objectWriterProvider) {
            if (objectWriterProvider != null) {
                this.features = JSONFactory.defaultWriterFeatures;
                this.provider = objectWriterProvider;
                this.zoneId = JSONFactory.defaultWriterZoneId;
                this.maxLevel = JSONFactory.defaultMaxLevel;
                String str = JSONFactory.defaultWriterFormat;
                if (str != null) {
                    setDateFormat(str);
                    return;
                }
                return;
            }
            C9987e.m38645a("objectWriterProvider must not null");
            throw null;
        }
    }

    public static JSONWriter ofJSONB(Context context) {
        return new JSONWriterJSONB(context, null);
    }

    public static JSONWriter ofJSONB(Context context, SymbolTable symbolTable) {
        return new JSONWriterJSONB(context, symbolTable);
    }

    public static JSONWriter ofJSONB(Feature... featureArr) {
        return new JSONWriterJSONB(new Context(JSONFactory.defaultObjectWriterProvider, featureArr), null);
    }

    public static JSONWriter ofJSONB(SymbolTable symbolTable) {
        return new JSONWriterJSONB(new Context(JSONFactory.defaultObjectWriterProvider), symbolTable);
    }

    public final boolean isEnabled(long j10) {
        return (j10 & this.context.features) != 0;
    }

    public static JSONWriter ofPretty() {
        return m6250of(Feature.PrettyFormat);
    }

    public void writeArrayNull() {
        writeArrayNull(this.context.features);
    }

    public final void writeNumberNull() {
        writeNumberNull(this.context.features);
    }

    public final void writeDecimalNull() {
        writeDecimalNull(this.context.features);
    }

    public String getPath() {
        Path path = this.path;
        if (path == null) {
            return null;
        }
        return path.toString();
    }

    public final boolean writeReference(int i10, Object obj) {
        String path = setPath(i10, obj);
        if (path == null) {
            return false;
        }
        writeReference(path);
        popPath(obj);
        return true;
    }

    public final void writeInt64Null(long j10) {
        if ((j10 & 16777280) != 0) {
            writeInt64(0L);
        } else {
            writeNull();
        }
    }

    public final ObjectWriter getObjectWriter(Class cls, String str) {
        Context context = this.context;
        return context.provider.getObjectWriter(cls, cls, str, (context.features & Feature.FieldBased.mask) != 0);
    }

    public final boolean hasFilter(long j10) {
        Context context = this.context;
        return context.hasFilter || (j10 & context.features) != 0;
    }

    public final ObjectWriter getObjectWriter(Type type, Class cls) {
        Context context = this.context;
        return context.provider.getObjectWriter(type, cls, (context.features & Feature.FieldBased.mask) != 0);
    }

    public final boolean hasFilter() {
        return this.context.hasFilter;
    }

    public final void writeInt32(int i10, DecimalFormat decimalFormat) {
        if (decimalFormat != null && !this.jsonb) {
            writeString(decimalFormat.format(i10));
        } else {
            writeInt32(i10);
        }
    }

    public static boolean isWriteAsString(BigInteger bigInteger, long j10) {
        if ((256 & j10) == 0) {
            return ((j10 & 32) == 0 || TypeUtils.isJavaScriptSupport(bigInteger)) ? false : true;
        }
        return true;
    }

    public static boolean isWriteAsString(BigDecimal bigDecimal, long j10) {
        if ((256 & j10) == 0) {
            return ((j10 & 32) == 0 || TypeUtils.isJavaScriptSupport(bigDecimal)) ? false : true;
        }
        return true;
    }

    public final boolean isIgnoreNoneSerializable() {
        return (this.context.features & Feature.IgnoreNoneSerializable.mask) != 0;
    }

    public void writeString(boolean[] zArr) {
        if (zArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < zArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(zArr[i10]);
        }
        endArray();
    }

    public final boolean isRefDetect() {
        long j10 = this.context.features;
        return (Feature.ReferenceDetection.mask & j10) != 0 && (j10 & FieldInfo.DISABLE_REFERENCE_DETECT) == 0;
    }

    public void writeString(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(bArr[i10]);
        }
        endArray();
    }

    public void writeString(short[] sArr) {
        if (sArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < sArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(sArr[i10]);
        }
        endArray();
    }

    public void writeString(int[] iArr) {
        if (iArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(iArr[i10]);
        }
        endArray();
    }

    public final void writeName(long j10) {
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        writeInt64(j10);
    }

    public void writeString(long[] jArr) {
        if (jArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(jArr[i10]);
        }
        endArray();
    }

    public final void writeName(int i10) {
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        writeInt32(i10);
    }

    public void writeString(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(fArr[i10]);
        }
        endArray();
    }

    public final String setPath(String str, Object obj) {
        Path path;
        if (!isRefDetect(obj)) {
            return null;
        }
        this.path = new Path(this.path, str);
        if (obj == this.rootObject) {
            path = Path.ROOT;
        } else {
            IdentityHashMap<Object, Path> identityHashMap = this.refs;
            if (identityHashMap == null || (path = identityHashMap.get(obj)) == null) {
                if (this.refs == null) {
                    this.refs = new IdentityHashMap<>(8);
                }
                this.refs.put(obj, this.path);
                return null;
            }
        }
        return path.toString();
    }

    public void writeString(double[] dArr) {
        if (dArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < dArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(dArr[i10]);
        }
        endArray();
    }

    public void writeString(float f10) {
        writeString(Float.toString(f10));
    }

    public final void writeDouble(double d10, DecimalFormat decimalFormat) {
        if (decimalFormat != null && !this.jsonb) {
            if (Double.isFinite(d10)) {
                writeRaw(decimalFormat.format(d10));
                return;
            } else if ((this.context.features & Feature.WriteFloatSpecialAsString.mask) != 0) {
                writeDouble(d10);
                return;
            } else {
                writeNull();
                return;
            }
        }
        writeDouble(d10);
    }

    public void writeString(double d10) {
        writeString(Double.toString(d10));
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m6249of(ObjectWriterProvider objectWriterProvider, Feature... featureArr) {
        Context context = new Context(objectWriterProvider);
        context.config(featureArr);
        return m6248of(context);
    }

    public final String setPath(int i10, Object obj) {
        if (isRefDetect(obj)) {
            return setPath0(i10, obj);
        }
        return null;
    }

    public final void writeFloat(float f10, DecimalFormat decimalFormat) {
        if (decimalFormat != null && !this.jsonb) {
            if (Float.isFinite(f10)) {
                writeRaw(decimalFormat.format(f10));
                return;
            } else if ((this.context.features & Feature.WriteFloatSpecialAsString.mask) != 0) {
                writeFloat(f10);
                return;
            } else {
                writeNull();
                return;
            }
        }
        writeFloat(f10);
    }

    public void writeString(List<String> list) {
        startArray();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(list.get(i10));
        }
        endArray();
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m6248of(Context context) {
        if (context == null) {
            context = JSONFactory.createWriteContext();
        }
        if (JDKUtils.JVM_VERSION == 8) {
            if (JDKUtils.FIELD_STRING_VALUE != null && !JDKUtils.ANDROID && !JDKUtils.OPENJ9) {
                return new JSONWriterUTF16JDK8UF(context);
            }
            return new JSONWriterUTF16JDK8(context);
        }
        if ((context.features & Feature.OptimizedForAscii.mask) != 0) {
            return new JSONWriterUTF8(context);
        }
        if (JDKUtils.FIELD_STRING_VALUE != null && JDKUtils.STRING_CODER != null && JDKUtils.STRING_VALUE != null) {
            return new JSONWriterUTF16JDK9UF(context);
        }
        return new JSONWriterUTF16(context);
    }

    public void writeString(String[] strArr) {
        if (strArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeString(strArr[i10]);
        }
        endArray();
    }

    public final void writeFloat(Float f10) {
        if (f10 == null) {
            writeNumberNull();
        } else {
            writeDouble(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m6250of(Feature... featureArr) {
        Context contextCreateWriteContext = JSONFactory.createWriteContext(featureArr);
        if (JDKUtils.JVM_VERSION == 8) {
            if (JDKUtils.FIELD_STRING_VALUE != null && !JDKUtils.ANDROID && !JDKUtils.OPENJ9) {
                return new JSONWriterUTF16JDK8UF(contextCreateWriteContext);
            }
            return new JSONWriterUTF16JDK8(contextCreateWriteContext);
        }
        if ((contextCreateWriteContext.features & Feature.OptimizedForAscii.mask) != 0) {
            return ofUTF8(contextCreateWriteContext);
        }
        if (JDKUtils.FIELD_STRING_VALUE != null && JDKUtils.STRING_CODER != null && JDKUtils.STRING_VALUE != null) {
            return new JSONWriterUTF16JDK9UF(contextCreateWriteContext);
        }
        return new JSONWriterUTF16(contextCreateWriteContext);
    }

    public final String setPath0(FieldWriter fieldWriter, Object obj) {
        Path path;
        IdentityHashMap<Object, Path> identityHashMap;
        Path path2 = this.path;
        Path path3 = Path.ROOT;
        if (path2 == path3) {
            path = fieldWriter.getRootParentPath();
        } else {
            path = fieldWriter.getPath(path2);
        }
        this.path = path;
        if (obj == this.rootObject || ((identityHashMap = this.refs) != null && (path3 = identityHashMap.get(obj)) != null)) {
            return path3.toString();
        }
        if (this.refs == null) {
            this.refs = new IdentityHashMap<>(8);
        }
        this.refs.put(obj, this.path);
        return null;
    }

    public final boolean isWriteTypeInfo(Object obj, Type type) {
        Class<?> cls;
        long j10 = this.context.features;
        if ((Feature.WriteClassName.mask & j10) == 0 || obj == null) {
            return false;
        }
        Class<?> cls2 = obj.getClass();
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (type instanceof GenericArrayType) {
                if (isWriteTypeInfoGenericArray((GenericArrayType) type, cls2)) {
                    return false;
                }
            } else if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    cls = (Class) rawType;
                }
            }
            cls = null;
        }
        if (cls2 == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j10) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j10 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final boolean isWriteTypeInfo(Object obj) {
        Class<?> cls;
        long j10 = this.context.features;
        if ((Feature.WriteClassName.mask & j10) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j10) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j10 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final boolean isWriteTypeInfo(Object obj, Class cls) {
        Class<?> cls2;
        long j10 = this.context.features;
        if ((Feature.WriteClassName.mask & j10) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j10) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j10 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final boolean isWriteTypeInfo(Object obj, Class cls, long j10) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j11 = j10 | this.context.features;
        if ((Feature.WriteClassName.mask & j11) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j11) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j11 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
    }

    public final boolean isWriteTypeInfo(Object obj, long j10) {
        Class<?> cls;
        long j11 = j10 | this.context.features;
        if ((Feature.WriteClassName.mask & j11) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j11) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j11 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final void write(JSONObject jSONObject) {
        write((Map<?, ?>) jSONObject);
    }
}
