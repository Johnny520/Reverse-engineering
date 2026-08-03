package com.alibaba.fastjson2;

import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
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
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p221ws.RealWebSocket;
import p012ah.C0086a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONWriter implements Closeable {
    static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final long NONE_DIRECT_FEATURES = (Feature.ReferenceDetection.mask | Feature.NotWriteEmptyArray.mask) | Feature.NotWriteDefaultValue.mask;
    static final byte PRETTY_2_SPACE = 2;
    static final byte PRETTY_4_SPACE = 4;
    static final byte PRETTY_NON = 0;
    static final byte PRETTY_TAB = 1;
    protected final Charset charset;
    public final Context context;
    protected int indent;
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
        NotWriteRootClassName(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE),
        NotWriteHashMapArrayListClassName(2048),
        NotWriteDefaultValue(4096),
        WriteEnumsUsingName(8192),
        WriteEnumUsingToString(Http2Stream.EMIT_BUFFER_SIZE),
        IgnoreErrorGetter(32768),
        PrettyFormat(65536),
        ReferenceDetection(131072),
        WriteNameAsSymbol(262144),
        WriteBigDecimalAsPlain(524288),
        UseSingleQuotes(1048576),
        MapSortField(2097152),
        WriteNullListAsEmpty(4194304),
        WriteNullStringAsEmpty(8388608),
        WriteNullNumberAsZero(16777216),
        WriteNullBooleanAsFalse(33554432),
        NotWriteEmptyArray(67108864),
        IgnoreEmpty(67108864),
        WriteNonStringKeyAsString(134217728),
        WritePairAsJavaBean(268435456),
        OptimizedForAscii(536870912),
        EscapeNoneAscii(1073741824),
        WriteByteArrayAsBase64(2147483648L),
        IgnoreNonFieldGetter(4294967296L),
        LargeObject(8589934592L),
        WriteLongAsString(17179869184L),
        BrowserSecure(34359738368L),
        WriteEnumUsingOrdinal(68719476736L),
        WriteThrowableClassName(137438953472L),
        UnquoteFieldName(274877906944L),
        NotWriteSetClassName(549755813888L),
        NotWriteNumberClassName(1099511627776L),
        SortMapEntriesByKeys(2199023255552L),
        PrettyFormatWith2Space(4398046511104L),
        PrettyFormatWith4Space(8796093022208L),
        WriterUtilDateAsMillis(17592186044416L);

        public final long mask;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        Feature(long j3) {
            this.mask = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isEnabled(long j3) {
            return (j3 & this.mask) != 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONWriter(Context context, SymbolTable symbolTable, boolean z9, Charset charset) {
        this.context = context;
        this.symbolTable = symbolTable;
        this.charset = charset;
        this.jsonb = z9;
        this.utf8 = !z9 && charset == StandardCharsets.UTF_8;
        this.utf16 = !z9 && charset == StandardCharsets.UTF_16;
        boolean z10 = (z9 || (context.features & Feature.UseSingleQuotes.mask) == 0) ? false : true;
        this.useSingleQuote = z10;
        this.quote = z10 ? '\'' : '\"';
        long j3 = context.features;
        this.maxArraySize = (Feature.LargeObject.mask & j3) != 0 ? 1073741824 : 67108864;
        if ((Feature.PrettyFormatWith4Space.mask & j3) != 0) {
            this.pretty = PRETTY_4_SPACE;
            return;
        }
        if ((Feature.PrettyFormatWith2Space.mask & j3) != 0) {
            this.pretty = PRETTY_2_SPACE;
        } else if ((j3 & Feature.PrettyFormat.mask) != 0) {
            this.pretty = (byte) 1;
        } else {
            this.pretty = (byte) 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static JSONWriter m1684of() {
        Context context = new Context(JSONFactory.defaultObjectWriterProvider);
        return (JSONFactory.defaultWriterFeatures & Feature.OptimizedForAscii.mask) != 0 ? new JSONWriterUTF8(context) : new JSONWriterUTF16(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONWriter ofJSONB() {
        return new JSONWriterJSONB(new Context(JSONFactory.defaultObjectWriterProvider), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONWriter ofPretty(JSONWriter jSONWriter) {
        if (jSONWriter.pretty == 0) {
            jSONWriter.pretty = (byte) 1;
            jSONWriter.context.features |= Feature.PrettyFormat.mask;
        }
        return jSONWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONWriter ofUTF16(Feature... featureArr) {
        return new JSONWriterUTF16(JSONFactory.createWriteContext(featureArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONWriter ofUTF8() {
        return new JSONWriterUTF8(JSONFactory.createWriteContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String setPath0(int i9, Object obj) {
        Path path;
        Path path2;
        Path path3 = this.path;
        if (path3 == null) {
            return null;
        }
        if (i9 == 0) {
            path = path3.child0;
            if (path == null) {
                path = new Path(this.path, i9);
                path3.child0 = path;
            }
        } else if (i9 == 1) {
            path = path3.child1;
            if (path == null) {
                path = new Path(this.path, i9);
                path3.child1 = path;
            }
        } else {
            path = new Path(this.path, i9);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void checkAndWriteTypeName(Object obj, Class cls) {
        Class<?> cls2;
        long j3 = this.context.features;
        if ((Feature.WriteClassName.mask & j3) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j3) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            if ((j3 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject) {
                writeTypeName(TypeUtils.getTypeName((Class) cls2));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void config(Feature... featureArr) {
        this.context.config(featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean containsReference(Object obj) {
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        return identityHashMap != null && identityHashMap.containsKey(obj);
    }

    public abstract void endArray();

    public abstract void endObject();

    public abstract int flushTo(OutputStream outputStream);

    public abstract int flushTo(OutputStream outputStream, Charset charset);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void flushTo(Writer writer) {
        try {
            writer.write(toString());
            this.off = 0;
        } catch (IOException e6) {
            C0086a.m465x("flushTo error", e6);
        }
    }

    public abstract byte[] getBytes();

    public abstract byte[] getBytes(Charset charset);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Charset getCharset() {
        return this.charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getFeatures(long j3) {
        return j3 | this.context.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ObjectWriter getObjectWriter(Class cls) {
        Context context = this.context;
        return context.provider.getObjectWriter(cls, cls, (context.features & Feature.FieldBased.mask) != 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getPath(Object obj) {
        Path path;
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        return (identityHashMap == null || (path = identityHashMap.get(obj)) == null) ? "$" : path.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasFilter(boolean z9) {
        Context context = this.context;
        if (context.hasFilter) {
            return true;
        }
        return z9 && (context.features & Feature.IgnoreNonFieldGetter.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isBeanToArray() {
        return (this.context.features & Feature.BeanToArray.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEnabled(Feature feature) {
        return (this.context.features & feature.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isIgnoreErrorGetter() {
        return (this.context.features & Feature.IgnoreErrorGetter.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isIgnoreNoneSerializable(Object obj) {
        return ((this.context.features & Feature.IgnoreNoneSerializable.mask) == 0 || obj == null || Serializable.class.isAssignableFrom(obj.getClass())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRefDetect(Object obj) {
        long j3 = this.context.features;
        return ((Feature.ReferenceDetection.mask & j3) == 0 || (j3 & FieldInfo.DISABLE_REFERENCE_DETECT) != 0 || obj == null || ObjectWriterProvider.isNotReferenceDetect(obj.getClass())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isUTF16() {
        return this.utf16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isUTF8() {
        return this.utf8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isUseSingleQuotes() {
        return this.useSingleQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isWriteMapTypeInfo(Object obj, Class cls, long j3) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j4 = j3 | this.context.features;
        if ((Feature.WriteClassName.mask & j4) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j4) == 0 || cls2 != HashMap.class) {
            return (j4 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isWriteNulls() {
        return (this.context.features & Feature.WriteNulls.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isWriteTypeInfo(Object obj, Type type, long j3) {
        Class<?> cls;
        long j4 = j3 | this.context.features;
        if ((Feature.WriteClassName.mask & j4) == 0 || obj == null) {
            return false;
        }
        Class<?> cls2 = obj.getClass();
        if (type instanceof Class) {
            cls = (Class) type;
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            cls = rawType instanceof Class ? (Class) rawType : null;
        }
        if (cls2 == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j4) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j4 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int level() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int newCapacity(int i9, int i10) {
        int i11 = i10 + (i10 >> 1);
        if (i11 - i9 < 0) {
            i11 = i9;
        }
        int i12 = this.maxArraySize;
        if (i11 <= i12) {
            return i11;
        }
        if (i9 < i12) {
            return i12;
        }
        throw new OutOfMemoryError("try enabling LargeObject feature instead");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void overflowLevel() {
        throw new JSONException("level too large : " + this.level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void popPath(Object obj) {
        Path path = this.path;
        if (path == null || (this.context.features & Feature.ReferenceDetection.mask) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET) {
            return;
        }
        this.path = path.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean removeReference(Object obj) {
        IdentityHashMap<Object, Path> identityHashMap = this.refs;
        return (identityHashMap == null || identityHashMap.remove(obj) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setRootObject(Object obj) {
        this.rootObject = obj;
        this.path = Path.ROOT;
    }

    public abstract int size();

    public abstract void startArray();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startArray(int i9) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void startObject();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void write(Map map) {
        if (map == null) {
            writeNull();
            return;
        }
        if (map.isEmpty()) {
            writeRaw('{', '}');
            this.startObject = false;
            return;
        }
        Context context = this.context;
        if ((context.features & NONE_DIRECT_FEATURES) != 0) {
            context.getObjectWriter(map.getClass()).write(this, map, null, null, 0L);
            return;
        }
        startObject();
        boolean z9 = true;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null || (this.context.features & Feature.WriteMapNullValue.mask) != 0) {
                if (!z9) {
                    writeComma();
                }
                writeAny(key);
                writeColon();
                writeAny(value);
                z9 = false;
            }
        }
        endObject();
    }

    public abstract void write0(char c10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeAny(Object obj) {
        if (obj == null) {
            writeNull();
        } else {
            Class<?> cls = obj.getClass();
            this.context.getObjectWriter(cls, cls).write(this, obj, null, null, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeArrayNull() {
        writeRaw((this.context.features & (Feature.NullAsDefaultValue.mask | Feature.WriteNullListAsEmpty.mask)) != 0 ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeAs(Object obj, Class cls) {
        if (obj == null) {
            writeNull();
        } else {
            this.context.getObjectWriter(cls).write(this, obj, null, null, 0L);
        }
    }

    public abstract void writeBase64(byte[] bArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeBigInt(BigInteger bigInteger) {
        writeBigInt(bigInteger, 0L);
    }

    public abstract void writeBigInt(BigInteger bigInteger, long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeInt32(bArr[i9]);
        }
        endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeBool(boolean z9) {
        if ((this.context.features & Feature.WriteBooleanAsNumber.mask) != 0) {
            write0(z9 ? '1' : '0');
        } else {
            writeRaw(z9 ? "true" : "false");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeBooleanNull() {
        if ((this.context.features & (Feature.NullAsDefaultValue.mask | Feature.WriteNullBooleanAsFalse.mask)) != 0) {
            writeBool(false);
        } else {
            writeNull();
        }
    }

    public abstract void writeChar(char c10);

    public abstract void writeColon();

    public abstract void writeComma();

    public abstract void writeDateTime14(int i9, int i10, int i11, int i12, int i13, int i14);

    public abstract void writeDateTime19(int i9, int i10, int i11, int i12, int i13, int i14);

    public abstract void writeDateTimeISO8601(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9);

    public abstract void writeDateYYYMMDD10(int i9, int i10, int i11);

    public abstract void writeDateYYYMMDD8(int i9, int i10, int i11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeDecimal(BigDecimal bigDecimal) {
        writeDecimal(bigDecimal, 0L, null);
    }

    public abstract void writeDecimal(BigDecimal bigDecimal, long j3, DecimalFormat decimalFormat);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeDecimalNull() {
        long j3 = this.context.features;
        if ((Feature.NullAsDefaultValue.mask & j3) != 0) {
            writeDouble(0.0d);
        } else if ((j3 & Feature.WriteNullNumberAsZero.mask) != 0) {
            writeInt32(0);
        } else {
            writeNull();
        }
    }

    public abstract void writeDouble(double d10);

    public abstract void writeDouble(double[] dArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        for (int i9 = 0; i9 < dArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeRaw(decimalFormat.format(dArr[i9]));
        }
        endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeDoubleArray(double d10, double d11) {
        startArray();
        writeDouble(d10);
        writeComma();
        writeDouble(d11);
        endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeEnum(Enum r72) {
        if (r72 == null) {
            writeNull();
            return;
        }
        long j3 = this.context.features;
        if ((Feature.WriteEnumUsingToString.mask & j3) != 0) {
            writeString(r72.toString());
        } else if ((j3 & Feature.WriteEnumsUsingName.mask) != 0) {
            writeString(r72.name());
        } else {
            writeInt32(r72.ordinal());
        }
    }

    public abstract void writeFloat(float f3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        for (int i9 = 0; i9 < fArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeRaw(decimalFormat.format(fArr[i9]));
        }
        endArray();
    }

    public abstract void writeHex(byte[] bArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeInstant(Instant instant) {
        if (instant == null) {
            writeNull();
        } else {
            writeString(DateTimeFormatter.ISO_INSTANT.format(instant));
        }
    }

    public abstract void writeInt16(short s10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeInt16(short[] sArr) {
        if (sArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < sArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeInt16(sArr[i9]);
        }
        endArray();
    }

    public abstract void writeInt32(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeInt32(int i9, String str) {
        if (str == null || this.jsonb) {
            writeInt32(i9);
        } else {
            writeString(String.format(str, Integer.valueOf(i9)));
        }
    }

    public abstract void writeInt32(int[] iArr);

    public abstract void writeInt64(long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeInt64(Long l10) {
        if (l10 == null) {
            writeInt64Null();
        } else {
            writeInt64(l10.longValue());
        }
    }

    public abstract void writeInt64(long[] jArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeInt64Null() {
        if ((this.context.features & (Feature.NullAsDefaultValue.mask | Feature.WriteNullNumberAsZero.mask)) != 0) {
            writeInt64(0L);
        } else {
            writeNull();
        }
    }

    public abstract void writeInt8(byte b10);

    public abstract void writeLocalDate(LocalDate localDate);

    public abstract void writeLocalDateTime(LocalDateTime localDateTime);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean writeLocalDateWithFormat(LocalDate localDate, Context context) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeMillis(long j3) {
        writeInt64(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeName(String str) {
        boolean z9 = false;
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        boolean z10 = (this.context.features & Feature.UnquoteFieldName.mask) != 0;
        if (!z10 || (str.indexOf(this.quote) < 0 && str.indexOf(92) < 0)) {
            z9 = z10;
        }
        if (z9) {
            writeRaw(str);
        } else {
            writeString(str);
        }
    }

    public abstract void writeName10Raw(long j3, long j4);

    public abstract void writeName11Raw(long j3, long j4);

    public abstract void writeName12Raw(long j3, long j4);

    public abstract void writeName13Raw(long j3, long j4);

    public abstract void writeName14Raw(long j3, long j4);

    public abstract void writeName15Raw(long j3, long j4);

    public abstract void writeName16Raw(long j3, long j4);

    public abstract void writeName2Raw(long j3);

    public abstract void writeName3Raw(long j3);

    public abstract void writeName4Raw(long j3);

    public abstract void writeName5Raw(long j3);

    public abstract void writeName6Raw(long j3);

    public abstract void writeName7Raw(long j3);

    public abstract void writeName8Raw(long j3);

    public abstract void writeName9Raw(long j3, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeNameAny(Object obj) {
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        writeAny(obj);
    }

    public abstract void writeNameRaw(byte[] bArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeNameRaw(byte[] bArr, int i9, int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeNameRaw(char[] cArr);

    public abstract void writeNameRaw(char[] cArr, int i9, int i10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeNameValue(String str, Object obj) {
        writeName(str);
        writeColon();
        writeAny(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeNull() {
        writeRaw("null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeNumberNull() {
        if ((this.context.features & (Feature.NullAsDefaultValue.mask | Feature.WriteNullNumberAsZero.mask)) != 0) {
            writeInt32(0);
        } else {
            writeNull();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeObjectNull(Class<?> cls) {
        if ((this.context.features & Feature.NullAsDefaultValue.mask) == 0) {
            writeNull();
        } else if (cls == Character.class) {
            writeString("\u0000");
        } else {
            writeRaw('{', '}');
        }
    }

    public abstract void writeOffsetDateTime(OffsetDateTime offsetDateTime);

    public abstract void writeOffsetTime(OffsetTime offsetTime);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeRaw(byte b10) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeRaw(char c10);

    public abstract void writeRaw(String str);

    public abstract void writeRaw(byte[] bArr);

    public abstract void writeReference(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean writeReference(int i9, Object obj) {
        String path = setPath(i9, obj);
        if (path == null) {
            return false;
        }
        writeReference(path);
        popPath(obj);
        return true;
    }

    public abstract void writeString(byte b10);

    public abstract void writeString(int i9);

    public abstract void writeString(long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeString(Reader reader) {
        writeRaw(this.quote);
        try {
            char[] cArr = new char[Opcodes.ACC_STRICT];
            while (true) {
                int i9 = reader.read(cArr, 0, Opcodes.ACC_STRICT);
                if (i9 < 0) {
                    writeRaw(this.quote);
                    return;
                } else if (i9 > 0) {
                    writeString(cArr, 0, i9, false);
                }
            }
        } catch (Exception e6) {
            C0086a.m465x("read string from reader error", e6);
        }
    }

    public abstract void writeString(String str);

    public abstract void writeString(short s10);

    public abstract void writeString(boolean z9);

    public abstract void writeString(char[] cArr);

    public abstract void writeString(char[] cArr, int i9, int i10);

    public abstract void writeString(char[] cArr, int i9, int i10, boolean z9);

    public abstract void writeString(String[] strArr);

    public abstract void writeStringLatin1(byte[] bArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeStringNull() {
        long j3 = this.context.features;
        writeRaw(((Feature.NullAsDefaultValue.mask | Feature.WriteNullStringAsEmpty.mask) & j3) != 0 ? (j3 & Feature.UseSingleQuotes.mask) != 0 ? "''" : "\"\"" : "null");
    }

    public abstract void writeStringUTF16(byte[] bArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeSymbol(int i9) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeTimeHHMMSS8(int i9, int i10, int i11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeTypeName(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void writeUUID(UUID uuid);

    public abstract void writeZonedDateTime(ZonedDateTime zonedDateTime);

    public final void config(Feature feature, boolean z9) {
        this.context.config(feature, z9);
    }

    public final long getFeatures() {
        return this.context.features;
    }

    public final void writeDecimal(BigDecimal bigDecimal, long j3) {
        writeDecimal(bigDecimal, j3, null);
    }

    public void startArray(Object obj, int i9) {
        throw new JSONException("UnsupportedOperation");
    }

    public void writeNameRaw(byte[] bArr, long j3) {
        throw new JSONException("UnsupportedOperation");
    }

    public final void writeRaw(char[] cArr) {
        writeRaw(cArr, 0, cArr.length);
    }

    public void writeSymbol(String str) {
        writeString(str);
    }

    public boolean writeTypeName(byte[] bArr, long j3) {
        throw new JSONException("UnsupportedOperation");
    }

    public void writeRaw(char[] cArr, int i9, int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Path {
        public static final Path ROOT = new Path((Path) null, "$");
        Path child0;
        Path child1;
        String fullPath;
        final int index;
        final String name;
        public final Path parent;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Path(Path path, String str) {
            this.parent = path;
            this.name = str;
            this.index = -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            Path path;
            String str;
            if (this == obj) {
                return true;
            }
            if (obj != null && Path.class == obj.getClass()) {
                Path path2 = (Path) obj;
                if ((this.index == path2.index && this.parent == path2.parent) || (((path = this.parent) != null && path.equals(path2.parent) && this.name == path2.name) || ((str = this.name) != null && str.equals(path2.name)))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.parent, this.name, Integer.valueOf(this.index)});
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0178 A[FALL_THROUGH] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            int i9;
            int i10;
            String str = this.fullPath;
            if (str != null) {
                return str;
            }
            byte[] bArrCopyOf = new byte[16];
            Path[] pathArr = new Path[4];
            int i11 = 0;
            for (Path path = this; path != null; path = path.parent) {
                if (pathArr.length == i11) {
                    pathArr = (Path[]) Arrays.copyOf(pathArr, pathArr.length + 4);
                }
                pathArr[i11] = path;
                i11++;
            }
            int i12 = i11 - 1;
            boolean z9 = true;
            int i13 = 0;
            for (int i14 = i12; i14 >= 0; i14--) {
                Path path2 = pathArr[i14];
                String str2 = path2.name;
                if (str2 == null) {
                    int i15 = path2.index;
                    int iStringSize = IOUtils.stringSize(i15);
                    while (i13 + iStringSize + 2 >= bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                    }
                    bArrCopyOf[i13] = 91;
                    int iWriteInt32 = IOUtils.writeInt32(bArrCopyOf, i13 + 1, i15);
                    bArrCopyOf[iWriteInt32] = 93;
                    i13 = iWriteInt32 + 1;
                } else {
                    int i16 = i13 + 1;
                    if (i16 >= bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                    }
                    if (i14 != i12) {
                        bArrCopyOf[i13] = 46;
                        i13 = i16;
                    }
                    int i17 = 0;
                    while (i17 < str2.length()) {
                        char cCharAt = str2.charAt(i17);
                        if (cCharAt != '`' && cCharAt != '~') {
                            switch (cCharAt) {
                                default:
                                    switch (cCharAt) {
                                        default:
                                            switch (cCharAt) {
                                                default:
                                                    switch (cCharAt) {
                                                        default:
                                                            switch (cCharAt) {
                                                                case '[':
                                                                case '\\':
                                                                case ']':
                                                                case '^':
                                                                    break;
                                                                default:
                                                                    if (cCharAt < 1 || cCharAt > 127) {
                                                                        if (cCharAt >= 55296 && cCharAt < 57344) {
                                                                            if (cCharAt < 56320) {
                                                                                if (str2.length() - i14 < 2) {
                                                                                    i10 = -1;
                                                                                } else {
                                                                                    char cCharAt2 = str2.charAt(i14 + 1);
                                                                                    if (cCharAt2 < 56320 || cCharAt2 >= 57344) {
                                                                                        i9 = i13 + 1;
                                                                                        bArrCopyOf[i13] = 63;
                                                                                    } else {
                                                                                        i10 = ((cCharAt << '\n') + cCharAt2) - 56613888;
                                                                                    }
                                                                                }
                                                                                if (i10 < 0) {
                                                                                    if (i13 == bArrCopyOf.length) {
                                                                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                                    }
                                                                                    i9 = i13 + 1;
                                                                                    bArrCopyOf[i13] = 63;
                                                                                } else {
                                                                                    if (i13 + 3 >= bArrCopyOf.length) {
                                                                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                                    }
                                                                                    bArrCopyOf[i13] = (byte) ((i10 >> 18) | 240);
                                                                                    bArrCopyOf[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                                                                    bArrCopyOf[i13 + 2] = (byte) ((63 & (i10 >> 6)) | 128);
                                                                                    bArrCopyOf[i13 + 3] = (byte) ((i10 & 63) | 128);
                                                                                    i17++;
                                                                                    i9 = i13 + 4;
                                                                                }
                                                                            } else {
                                                                                i9 = i13 + 1;
                                                                                bArrCopyOf[i13] = 63;
                                                                            }
                                                                            i13 = i9;
                                                                        } else if (cCharAt > 2047) {
                                                                            if (i13 + 2 >= bArrCopyOf.length) {
                                                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                            }
                                                                            bArrCopyOf[i13] = (byte) (((cCharAt >> '\f') & 15) | 224);
                                                                            int i18 = i13 + 2;
                                                                            bArrCopyOf[i13 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                                                                            i13 += 3;
                                                                            bArrCopyOf[i18] = (byte) ((cCharAt & '?') | 128);
                                                                        } else {
                                                                            int i19 = i13 + 1;
                                                                            if (i19 >= bArrCopyOf.length) {
                                                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                            }
                                                                            bArrCopyOf[i13] = (byte) (((cCharAt >> 6) & 31) | Opcodes.CHECKCAST);
                                                                            i13 += 2;
                                                                            bArrCopyOf[i19] = (byte) ((cCharAt & '?') | 128);
                                                                        }
                                                                        z9 = false;
                                                                    } else {
                                                                        if (i13 == bArrCopyOf.length) {
                                                                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                        }
                                                                        bArrCopyOf[i13] = (byte) cCharAt;
                                                                        i13++;
                                                                    }
                                                                    break;
                                                            }
                                                        case ':':
                                                        case ParserConstants.VOLATILE /* 59 */:
                                                        case ParserConstants.WHEN /* 60 */:
                                                        case ParserConstants.WHILE /* 61 */:
                                                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                        case ParserConstants.DECIMAL_LITERAL /* 63 */:
                                                        case '@':
                                                            break;
                                                    }
                                                case ParserConstants.PROTECTED /* 45 */:
                                                case '.':
                                                case '/':
                                                    break;
                                            }
                                        case '%':
                                        case '&':
                                        case '\'':
                                        case '(':
                                        case ')':
                                        case '*':
                                        case '+':
                                            break;
                                    }
                                case '!':
                                case '\"':
                                case '#':
                                    break;
                            }
                        } else {
                            int i20 = i13 + 1;
                            if (i20 >= bArrCopyOf.length) {
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                            }
                            bArrCopyOf[i13] = 92;
                            i13 += 2;
                            bArrCopyOf[i20] = (byte) cCharAt;
                        }
                        i17++;
                    }
                }
            }
            String str3 = new String(bArrCopyOf, 0, i13, z9 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8);
            this.fullPath = str3;
            return str3;
        }

        public Path(Path path, int i9) {
            this.parent = path;
            this.name = null;
            this.index = i9;
        }
    }

    public static JSONWriter ofUTF8(Context context) {
        return new JSONWriterUTF8(context);
    }

    public void writeRaw(char c10, char c11) {
        writeRaw(c10);
        writeRaw(c11);
    }

    public static JSONWriter ofUTF8(Feature... featureArr) {
        return new JSONWriterUTF8(JSONFactory.createWriteContext(featureArr));
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Context {
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
        TimeZone timeZone;
        ValueFilter valueFilter;
        ZoneId zoneId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Context(ObjectWriterProvider objectWriterProvider, String str, Filter filter, Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.features = JSONFactory.defaultWriterFeatures;
            this.provider = objectWriterProvider;
            this.zoneId = JSONFactory.defaultWriterZoneId;
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
            configFilter(filter);
            str = str == null ? JSONFactory.defaultWriterFormat : str;
            if (str != null) {
                setDateFormat(str);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void config(Feature... featureArr) {
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void configFilter(Filter... filterArr) {
            if (filterArr == null) {
                return;
            }
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AfterFilter getAfterFilter() {
            return this.afterFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BeforeFilter getBeforeFilter() {
            return this.beforeFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ContextNameFilter getContextNameFilter() {
            return this.contextNameFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ContextValueFilter getContextValueFilter() {
            return this.contextValueFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getDateFormat() {
            return this.dateFormat;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DateTimeFormatter getDateFormatter() {
            String str;
            if (this.dateFormatter == null && (str = this.dateFormat) != null && !this.dateFormatMillis && !this.dateFormatISO8601 && !this.dateFormatUnixTime) {
                Locale locale = this.locale;
                this.dateFormatter = locale == null ? DateTimeFormatter.ofPattern(str) : DateTimeFormatter.ofPattern(str, locale);
            }
            return this.dateFormatter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public long getFeatures() {
            return this.features;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LabelFilter getLabelFilter() {
            return this.labelFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public NameFilter getNameFilter() {
            return this.nameFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public <T> ObjectWriter<T> getObjectWriter(Class<T> cls) {
            return this.provider.getObjectWriter(cls, cls, (this.features & Feature.FieldBased.mask) != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public PropertyFilter getPropertyFilter() {
            return this.propertyFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public PropertyPreFilter getPropertyPreFilter() {
            return this.propertyPreFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ObjectWriterProvider getProvider() {
            return this.provider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ValueFilter getValueFilter() {
            return this.valueFilter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ZoneId getZoneId() {
            if (this.zoneId == null) {
                this.zoneId = DateUtils.DEFAULT_ZONE_ID;
            }
            return this.zoneId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isDateFormatHasDay() {
            return this.formatHasDay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isDateFormatHasHour() {
            return this.formatHasHour;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isDateFormatISO8601() {
            return this.dateFormatISO8601;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isDateFormatMillis() {
            return this.dateFormatMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isDateFormatUnixTime() {
            return this.dateFormatUnixTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isEnabled(Feature feature) {
            return (this.features & feature.mask) != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatyyyyMMddhhmmss19() {
            return this.formatyyyyMMddhhmmss19;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setAfterFilter(AfterFilter afterFilter) {
            this.afterFilter = afterFilter;
            if (afterFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setBeforeFilter(BeforeFilter beforeFilter) {
            this.beforeFilter = beforeFilter;
            if (beforeFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setContextNameFilter(ContextNameFilter contextNameFilter) {
            this.contextNameFilter = contextNameFilter;
            if (contextNameFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setContextValueFilter(ContextValueFilter contextValueFilter) {
            this.contextValueFilter = contextValueFilter;
            if (contextValueFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void setDateFormat(String str) {
            boolean z9;
            boolean zContains;
            boolean zContains2;
            boolean z10;
            if (str == null || !str.equals(this.dateFormat)) {
                this.dateFormatter = null;
            }
            if (str != null && !str.isEmpty()) {
                boolean z11 = false;
                boolean z12 = true;
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
                        z9 = false;
                        zContains = false;
                        zContains2 = false;
                        z10 = false;
                        z11 = true;
                        z12 = z10;
                        break;
                    case 1:
                        zContains = false;
                        zContains2 = false;
                        z10 = false;
                        z9 = true;
                        z12 = z10;
                        break;
                    case 2:
                        z9 = false;
                        zContains = true;
                        zContains2 = true;
                        z10 = true;
                        z12 = false;
                        break;
                    case 3:
                        str = "yyyy-MM-dd'T'HH:mm:ss";
                        z9 = false;
                        z10 = false;
                        zContains = true;
                        zContains2 = true;
                        z12 = z10;
                        break;
                    case 4:
                        z9 = false;
                        zContains = false;
                        zContains2 = false;
                        z10 = false;
                        break;
                    default:
                        zContains = str.contains("d");
                        z9 = false;
                        z10 = false;
                        zContains2 = str.contains("H");
                        z12 = z10;
                        break;
                }
                this.dateFormatMillis = z11;
                this.dateFormatISO8601 = z12;
                this.dateFormatUnixTime = z9;
                this.formatHasDay = zContains;
                this.formatHasHour = zContains2;
                this.formatyyyyMMddhhmmss19 = z10;
            }
            this.dateFormat = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setFeatures(long j3) {
            this.features = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setLabelFilter(LabelFilter labelFilter) {
            this.labelFilter = labelFilter;
            if (labelFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setNameFilter(NameFilter nameFilter) {
            this.nameFilter = nameFilter;
            if (nameFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setPropertyFilter(PropertyFilter propertyFilter) {
            this.propertyFilter = propertyFilter;
            if (propertyFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
            this.propertyPreFilter = propertyPreFilter;
            if (propertyPreFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setValueFilter(ValueFilter valueFilter) {
            this.valueFilter = valueFilter;
            if (valueFilter != null) {
                this.hasFilter = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setZoneId(ZoneId zoneId) {
            this.zoneId = zoneId;
        }

        public boolean isEnabled(long j3) {
            return (j3 & this.features) != 0;
        }

        public void config(Feature feature, boolean z9) {
            long j3 = this.features;
            if (z9) {
                this.features = feature.mask | j3;
            } else {
                this.features = (~feature.mask) & j3;
            }
        }

        public <T> ObjectWriter<T> getObjectWriter(Type type, Class<T> cls) {
            return this.provider.getObjectWriter(type, cls, (this.features & Feature.FieldBased.mask) != 0);
        }

        public Context(Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.features = JSONFactory.defaultWriterFeatures;
            this.provider = JSONFactory.defaultObjectWriterProvider;
            this.zoneId = JSONFactory.defaultWriterZoneId;
            String str = JSONFactory.defaultWriterFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(String str, Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.features = JSONFactory.defaultWriterFeatures;
            this.provider = JSONFactory.defaultObjectWriterProvider;
            this.zoneId = JSONFactory.defaultWriterZoneId;
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
            str = str == null ? JSONFactory.defaultWriterFormat : str;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public Context(ObjectWriterProvider objectWriterProvider) {
            this.maxLevel = Opcodes.ACC_STRICT;
            if (objectWriterProvider != null) {
                this.features = JSONFactory.defaultWriterFeatures;
                this.provider = objectWriterProvider;
                this.zoneId = JSONFactory.defaultWriterZoneId;
                String str = JSONFactory.defaultWriterFormat;
                if (str != null) {
                    setDateFormat(str);
                    return;
                }
                return;
            }
            C2104o.m5294t("objectWriterProvider must not null");
            throw null;
        }

        public Context(ObjectWriterProvider objectWriterProvider, Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            if (objectWriterProvider != null) {
                this.features = JSONFactory.defaultWriterFeatures;
                this.provider = objectWriterProvider;
                this.zoneId = JSONFactory.defaultWriterZoneId;
                for (Feature feature : featureArr) {
                    this.features |= feature.mask;
                }
                String str = JSONFactory.defaultWriterFormat;
                if (str != null) {
                    setDateFormat(str);
                    return;
                }
                return;
            }
            C2104o.m5294t("objectWriterProvider must not null");
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

    public void writeInstant(long j3, int i9) {
        writeInstant(Instant.ofEpochSecond(j3, i9));
    }

    public static JSONWriter ofJSONB(SymbolTable symbolTable) {
        return new JSONWriterJSONB(new Context(JSONFactory.defaultObjectWriterProvider), symbolTable);
    }

    public final boolean isEnabled(long j3) {
        return (j3 & this.context.features) != 0;
    }

    public static JSONWriter ofPretty() {
        return m1687of(Feature.PrettyFormat);
    }

    public String getPath() {
        Path path = this.path;
        if (path == null) {
            return null;
        }
        return path.toString();
    }

    public final ObjectWriter getObjectWriter(Type type, Class cls) {
        Context context = this.context;
        return context.provider.getObjectWriter(type, cls, (context.features & Feature.FieldBased.mask) != 0);
    }

    public final boolean hasFilter(long j3) {
        Context context = this.context;
        return context.hasFilter || (j3 & context.features) != 0;
    }

    public final boolean hasFilter() {
        return this.context.hasFilter;
    }

    public void writeInt32(Integer num) {
        if (num == null) {
            writeNull();
        } else {
            writeInt32(num.intValue());
        }
    }

    public void writeArrayNull(long j3) {
        String str;
        if ((j3 & (Feature.NullAsDefaultValue.mask | Feature.WriteNullListAsEmpty.mask)) != 0) {
            str = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        } else {
            str = "null";
        }
        writeRaw(str);
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m1686of(ObjectWriterProvider objectWriterProvider, Feature... featureArr) {
        Context context = new Context(objectWriterProvider);
        context.config(featureArr);
        return m1685of(context);
    }

    public final boolean isIgnoreNoneSerializable() {
        return (this.context.features & Feature.IgnoreNoneSerializable.mask) != 0;
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m1685of(Context context) {
        if (context == null) {
            context = JSONFactory.createWriteContext();
        }
        if ((context.features & Feature.OptimizedForAscii.mask) != 0) {
            return new JSONWriterUTF8(context);
        }
        return new JSONWriterUTF16(context);
    }

    public void writeString(boolean[] zArr) {
        if (zArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < zArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(zArr[i9]);
        }
        endArray();
    }

    public void writeBool(boolean[] zArr) {
        if (zArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < zArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeBool(zArr[i9]);
        }
        endArray();
    }

    public final boolean isRefDetect() {
        long j3 = this.context.features;
        return (Feature.ReferenceDetection.mask & j3) != 0 && (j3 & FieldInfo.DISABLE_REFERENCE_DETECT) == 0;
    }

    /* JADX INFO: renamed from: of */
    public static JSONWriter m1687of(Feature... featureArr) {
        Context contextCreateWriteContext = JSONFactory.createWriteContext(featureArr);
        if ((contextCreateWriteContext.features & Feature.OptimizedForAscii.mask) != 0) {
            return new JSONWriterUTF8(contextCreateWriteContext);
        }
        return new JSONWriterUTF16(contextCreateWriteContext);
    }

    public void writeString(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(bArr[i9]);
        }
        endArray();
    }

    public final void writeDouble(double d10, DecimalFormat decimalFormat) {
        if (decimalFormat != null && !this.jsonb) {
            if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
                writeRaw(decimalFormat.format(d10));
                return;
            } else {
                writeNull();
                return;
            }
        }
        writeDouble(d10);
    }

    public final void writeFloat(float f3, DecimalFormat decimalFormat) {
        if (decimalFormat != null && !this.jsonb) {
            if (!Float.isNaN(f3) && !Float.isInfinite(f3)) {
                writeRaw(decimalFormat.format(f3));
                return;
            } else {
                writeNull();
                return;
            }
        }
        writeFloat(f3);
    }

    public void writeString(short[] sArr) {
        if (sArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < sArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(sArr[i9]);
        }
        endArray();
    }

    public void writeFloat(float[] fArr) {
        if (fArr == null) {
            writeNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < fArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeFloat(fArr[i9]);
        }
        endArray();
    }

    public void writeString(int[] iArr) {
        if (iArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(iArr[i9]);
        }
        endArray();
    }

    public final void writeFloat(Float f3) {
        if (f3 == null) {
            writeNumberNull();
        } else {
            writeDouble(f3.floatValue());
        }
    }

    public final void writeName(long j3) {
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        writeInt64(j3);
    }

    public void writeString(long[] jArr) {
        if (jArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < jArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(jArr[i9]);
        }
        endArray();
    }

    public final void writeName(int i9) {
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        writeInt32(i9);
    }

    public void writeString(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < fArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(fArr[i9]);
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
        for (int i9 = 0; i9 < dArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(dArr[i9]);
        }
        endArray();
    }

    public void writeString(float f3) {
        writeString(Float.toString(f3));
    }

    public void writeString(double d10) {
        writeString(Double.toString(d10));
    }

    public final String setPath(int i9, Object obj) {
        if (isRefDetect(obj)) {
            return setPath0(i9, obj);
        }
        return null;
    }

    public void writeString(List<String> list) {
        startArray();
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            writeString(list.get(i9));
        }
        endArray();
    }

    public final boolean isWriteTypeInfo(Object obj, Type type) {
        Class<?> cls;
        long j3 = this.context.features;
        if ((Feature.WriteClassName.mask & j3) == 0 || obj == null) {
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
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j3) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j3 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final boolean isWriteTypeInfo(Object obj) {
        Class<?> cls;
        long j3 = this.context.features;
        if ((Feature.WriteClassName.mask & j3) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j3) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j3 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public void write(List list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        long j3 = Feature.ReferenceDetection.mask | Feature.PrettyFormat.mask | Feature.NotWriteEmptyArray.mask | Feature.NotWriteDefaultValue.mask;
        Context context = this.context;
        if ((j3 & context.features) != 0) {
            context.getObjectWriter(list.getClass()).write(this, list, null, null, 0L);
            return;
        }
        write0('[');
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object obj = list.get(i9);
            if (i9 != 0) {
                write0(',');
            }
            writeAny(obj);
        }
        write0(']');
    }

    public final boolean isWriteTypeInfo(Object obj, Class cls) {
        Class<?> cls2;
        long j3 = this.context.features;
        if ((Feature.WriteClassName.mask & j3) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j3) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j3 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }

    public final boolean isWriteTypeInfo(Object obj, Class cls, long j3) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j4 = j3 | this.context.features;
        if ((Feature.WriteClassName.mask & j4) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j4) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j4 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
    }

    public void write(JSONObject jSONObject) {
        write((Map) jSONObject);
    }

    public final boolean isWriteTypeInfo(Object obj, long j3) {
        Class<?> cls;
        long j4 = j3 | this.context.features;
        if ((Feature.WriteClassName.mask & j4) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j4) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j4 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.rootObject;
        }
        return false;
    }
}
