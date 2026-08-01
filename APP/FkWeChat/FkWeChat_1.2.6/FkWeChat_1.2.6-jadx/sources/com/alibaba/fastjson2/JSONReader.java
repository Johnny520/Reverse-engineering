package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderImplObject;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.ReferenceKey;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.Wrapper;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONReader implements Closeable {
    static final byte[] CHAR1_ESCAPED;
    static final char EOI = 26;
    static final boolean[] INT_VALUE_END;
    static final byte JSON_TYPE_ARRAY = 7;
    static final byte JSON_TYPE_BIG_DEC = 8;
    static final byte JSON_TYPE_BOOL = 4;
    static final byte JSON_TYPE_DEC = 2;
    static final byte JSON_TYPE_DOUBLE = 13;
    static final byte JSON_TYPE_FLOAT = 12;
    static final byte JSON_TYPE_INT = 1;
    static final byte JSON_TYPE_INT16 = 10;
    static final byte JSON_TYPE_INT64 = 11;
    static final byte JSON_TYPE_INT8 = 9;
    static final byte JSON_TYPE_NULL = 5;
    static final byte JSON_TYPE_NaN = 14;
    static final byte JSON_TYPE_OBJECT = 6;
    static final byte JSON_TYPE_STRING = 3;
    protected static final long MASK_ALLOW_UN_QUOTED_FIELD_NAMES = 131072;
    protected static final long MASK_DISABLE_REFERENCE_DETECT = 8589934592L;
    protected static final long MASK_DISABLE_SINGLE_QUOTE = 2147483648L;
    protected static final long MASK_EMPTY_STRING_AS_NULL = 134217728;
    protected static final long MASK_ERROR_ON_NONE_SERIALIZABLE = 4;
    protected static final long MASK_FIELD_BASED = 1;
    protected static final long MASK_IGNORE_NONE_SERIALIZABLE = 2;
    protected static final long MASK_INIT_STRING_FIELD_AS_EMPTY = 16;
    protected static final long MASK_SUPPORT_ARRAY_TO_BEAN = 8;
    protected static final long MASK_SUPPORT_AUTO_TYPE = 32;
    protected static final long MASK_SUPPORT_SMART_MATCH = 64;
    protected static final long MASK_TRIM_STRING = 16384;
    static final int MAX_EXP = 2047;
    static final long SPACE = 4294981377L;
    protected boolean boolValue;

    /* JADX INFO: renamed from: ch */
    protected char f4541ch;
    protected boolean comma;
    protected Object complex;
    protected final Context context;
    protected byte[] doubleChars;
    protected short exponent;
    public final boolean jsonb;
    protected int level;
    protected int mag0;
    protected int mag1;
    protected int mag2;
    protected int mag3;
    protected int nameBegin;
    protected boolean nameEscape;
    protected boolean negative;
    protected int offset;
    List<ResolveTask> resolveTasks;
    protected short scale;
    protected String stringValue;
    protected boolean typeRedirect;
    public final boolean utf8;
    protected boolean valueEscape;
    protected byte valueType;
    protected boolean wasNull;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface AutoTypeBeforeHandler extends Filter {
        default Class<?> apply(long j10, Class<?> cls, long j11) {
            return null;
        }

        Class<?> apply(String str, Class<?> cls, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class BigIntegerCreator implements BiFunction<Integer, int[], BigInteger> {
        static final BiFunction<Integer, int[], BigInteger> BIG_INTEGER_CREATOR;

        static {
            BiFunction bigIntegerCreator;
            if (JDKUtils.ANDROID || JDKUtils.GRAAL) {
                bigIntegerCreator = null;
            } else {
                try {
                    MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(BigInteger.class);
                    MethodHandle methodHandleFindConstructor = lookupTrustedLookup.findConstructor(BigInteger.class, MethodType.methodType(Void.TYPE, Integer.TYPE, int[].class));
                    bigIntegerCreator = (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(BiFunction.class), methodHandleFindConstructor.type().generic(), methodHandleFindConstructor, MethodType.methodType(BigInteger.class, Integer.class, int[].class)).getTarget().invokeExact();
                } catch (Throwable unused) {
                    bigIntegerCreator = null;
                }
            }
            if (bigIntegerCreator == null) {
                bigIntegerCreator = new BigIntegerCreator();
            }
            BIG_INTEGER_CREATOR = bigIntegerCreator;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
        @Override // java.util.function.BiFunction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.math.BigInteger apply(java.lang.Integer r12, int[] r13) {
            /*
                r11 = this;
                int r12 = r12.intValue()
                int r0 = r13.length
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lb
                r3 = r1
                goto L39
            Lb:
                r0 = r13[r1]
                int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
                int r0 = 32 - r0
                int r3 = r13.length
                int r3 = r3 - r2
                int r3 = r3 << 5
                int r3 = r3 + r0
                if (r12 >= 0) goto L39
                r0 = r13[r1]
                int r0 = java.lang.Integer.bitCount(r0)
                if (r0 != r2) goto L24
                r0 = r2
                goto L25
            L24:
                r0 = r1
            L25:
                r4 = r2
            L26:
                int r5 = r13.length
                if (r4 >= r5) goto L35
                if (r0 == 0) goto L35
                r0 = r13[r4]
                if (r0 != 0) goto L31
                r0 = r2
                goto L32
            L31:
                r0 = r1
            L32:
                int r4 = r4 + 1
                goto L26
            L35:
                if (r0 == 0) goto L39
                int r3 = r3 + (-1)
            L39:
                int r3 = r3 / 8
                int r0 = r3 + 1
                byte[] r0 = new byte[r0]
                r4 = 4
                r6 = r1
                r7 = r6
                r5 = r4
            L43:
                if (r3 < 0) goto L7c
                if (r5 != r4) goto L72
                int r5 = r7 + 1
                if (r7 >= 0) goto L4d
            L4b:
                r6 = r1
                goto L6f
            L4d:
                int r6 = r13.length
                if (r7 < r6) goto L54
                if (r12 >= 0) goto L4b
                r6 = -1
                goto L6f
            L54:
                int r6 = r13.length
                int r6 = r6 - r7
                int r6 = r6 - r2
                r6 = r13[r6]
                if (r12 < 0) goto L5c
                goto L6f
            L5c:
                int r8 = r13.length
                int r9 = r8 + (-1)
            L5f:
                if (r9 < 0) goto L68
                r10 = r13[r9]
                if (r10 != 0) goto L68
                int r9 = r9 + (-1)
                goto L5f
            L68:
                int r8 = r8 - r9
                int r8 = r8 - r2
                if (r7 > r8) goto L6e
                int r6 = -r6
                goto L6f
            L6e:
                int r6 = ~r6
            L6f:
                r7 = r5
                r5 = r2
                goto L76
            L72:
                int r6 = r6 >>> 8
                int r5 = r5 + 1
            L76:
                byte r8 = (byte) r6
                r0[r3] = r8
                int r3 = r3 + (-1)
                goto L43
            L7c:
                java.math.BigInteger r12 = new java.math.BigInteger
                r12.<init>(r0)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.BigIntegerCreator.apply(java.lang.Integer, int[]):java.math.BigInteger");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class ResolveTask {
        final FieldReader fieldReader;
        final Object name;
        final Object object;
        final JSONPath reference;

        public ResolveTask(FieldReader fieldReader, Object obj, Object obj2, JSONPath jSONPath) {
            this.fieldReader = fieldReader;
            this.object = obj;
            this.name = obj2;
            this.reference = jSONPath;
        }

        public String toString() {
            return this.reference.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class SavePoint {
        protected final int current;
        protected final int offset;

        public SavePoint(int i10, int i11) {
            this.offset = i10;
            this.current = i11;
        }
    }

    static {
        boolean[] zArr = new boolean[256];
        INT_VALUE_END = zArr;
        Arrays.fill(zArr, true);
        char[] cArr = {'.', 'e', 'E', 't', 'f', 'n', '{', '[', '0', '1', '2', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i10 = 0; i10 < 19; i10++) {
            INT_VALUE_END[cArr[i10]] = false;
        }
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        byte[] bArr2 = {JSONB.Constants.BC_INT32_BYTE_MIN, 0, 49, 1, 50, JSON_TYPE_DEC, 51, JSON_TYPE_STRING, 52, JSON_TYPE_BOOL, 53, JSON_TYPE_NULL, 54, JSON_TYPE_OBJECT, 55, JSON_TYPE_ARRAY, 98, JSON_TYPE_BIG_DEC, 116, JSON_TYPE_INT8, 110, JSON_TYPE_INT16, 118, JSON_TYPE_INT64, 102, JSON_TYPE_FLOAT, 70, JSON_TYPE_FLOAT, 114, JSON_TYPE_DOUBLE, 34, 34, 39, 39, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 46, 46, 92, 92, 35, 35, 38, 38, 91, 91, 93, 93, JSONB.Constants.BC_INT32_SHORT_MIN, JSONB.Constants.BC_INT32_SHORT_MIN, 40, 40, 41, 41, 95, 95, 44, 44, JSONB.Constants.BC_STR_GB18030, JSONB.Constants.BC_STR_GB18030, 32, 32};
        for (int i11 = 0; i11 < 62; i11 += 2) {
            bArr[bArr2[i11]] = bArr2[i11 + 1];
        }
        CHAR1_ESCAPED = bArr;
    }

    public JSONReader(Context context, boolean z10, boolean z11) {
        this.context = context;
        this.jsonb = z10;
        this.utf8 = z11;
    }

    private void add(List<Object> list, int i10, Object obj) {
        if (!(obj instanceof JSONPath)) {
            list.add(obj);
        } else {
            addResolveTask(list, i10, (JSONPath) obj);
            list.add(null);
        }
    }

    public static AutoTypeBeforeHandler autoTypeFilter(String... strArr) {
        return new ContextAutoTypeBeforeHandler(strArr);
    }

    public static char char2(int i10, int i11) {
        int[] iArr = JSONFactory.DIGITS2;
        return (char) ((iArr[i10] * 16) + iArr[i11]);
    }

    public static boolean isFirstIdentifier(int i10) {
        if (i10 >= 65 && i10 <= 90) {
            return true;
        }
        if ((i10 >= 97 && i10 <= 122) || i10 == 95 || i10 == 36) {
            return true;
        }
        return (i10 >= 48 && i10 <= 57) || i10 > 127;
    }

    public static int newCapacity(int i10, int i11) {
        int i12 = i11 + (i11 >> 1);
        if (i12 - i10 >= 0) {
            i10 = i12;
        }
        if (i10 >= 0) {
            return i10;
        }
        throw new OutOfMemoryError();
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6229of(String str, Context context) {
        ToIntFunction<String> toIntFunction;
        if (str == null || context == null) {
            throw null;
        }
        Function<String, byte[]> function = JDKUtils.STRING_VALUE;
        if (function != null && (toIntFunction = JDKUtils.STRING_CODER) != null) {
            try {
                if (toIntFunction.applyAsInt(str) == 0) {
                    byte[] bArrApply = function.apply(str);
                    return JSONReaderASCII.m6245of(context, str, bArrApply, 0, bArrApply.length);
                }
            } catch (Exception unused) {
                C1569c.m6258a("unsafe get String.coder error");
                return null;
            }
        }
        return ofUTF16(str, JDKUtils.JVM_VERSION == 8 ? JDKUtils.getCharArray(str) : str.toCharArray(), 0, str.length(), context);
    }

    public static JSONReader ofJSONB(byte[] bArr, Feature... featureArr) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        contextCreateReadContext.config(featureArr);
        return new JSONReaderJSONB(contextCreateReadContext, bArr, 0, bArr.length);
    }

    private static JSONReader ofUTF16(String str, char[] cArr, int i10, int i11, Context context) {
        return new JSONReaderUTF16(context, str, cArr, i10, i11);
    }

    private boolean readReference0(Collection collection, int i10) {
        String reference = readReference();
        if ("..".equals(reference)) {
            collection.add(collection);
            return true;
        }
        addResolveTask(collection, i10, JSONPath.m6205of(reference));
        return true;
    }

    public static String stringValue(String str, long j10) {
        if ((16384 & j10) != 0) {
            str = str.trim();
        }
        if ((j10 & 134217728) == 0 || !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static JSONException syntaxError(int i10, int i11) {
        return new JSONException("syntax error, offset " + i10 + ", char " + ((char) i11));
    }

    public final void addResolveTask(Map map, Object obj, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.resolveTasks.add(new ResolveTask(null, map, obj, jSONPath));
    }

    public final void bigInt(char[] cArr, int i10, int i11) {
        int i12;
        long j10;
        char c10;
        long j11;
        int i13 = i11 - i10;
        if (this.scale > 0) {
            i13--;
        }
        if (i13 > 38) {
            C1569c.m6258a("number too large : ".concat(new String(cArr, i10, i13)));
            return;
        }
        int i14 = i13 % 9;
        int i15 = i10 + (i14 != 0 ? i14 : 9);
        int i16 = i10 + 1;
        char c11 = cArr[i10];
        if (c11 == '.') {
            c11 = cArr[i16];
            i16 = i10 + 2;
            i12 = i15 + 1;
        } else {
            i12 = i15;
        }
        int i17 = c11 - '0';
        while (i16 < i15) {
            char c12 = cArr[i16];
            if (c12 == '.') {
                i16++;
                c12 = cArr[i16];
                i12++;
                if (i15 < i11) {
                    i15++;
                }
            }
            i17 = (i17 * 10) + (c12 - '0');
            i16++;
        }
        this.mag3 = i17;
        while (i12 < i11) {
            int i18 = i12 + 9;
            int i19 = i12 + 1;
            char c13 = cArr[i12];
            if (c13 == '.') {
                int i20 = i12 + 2;
                c13 = cArr[i19];
                i12 += 10;
                i19 = i20;
                i18 = i12;
            } else {
                i12 = i18;
            }
            int i21 = c13 - '0';
            while (i19 < i18) {
                char c14 = cArr[i19];
                if (c14 == '.') {
                    i19++;
                    c14 = cArr[i19];
                    i12++;
                    i18++;
                }
                i21 = (i21 * 10) + (c14 - '0');
                i19++;
            }
            long j12 = 0;
            for (int i22 = 3; i22 >= 0; i22--) {
                if (i22 == 0) {
                    c10 = ' ';
                    j11 = j12 + (1000000000 * (((long) this.mag0) & 4294967295L));
                    this.mag0 = (int) j11;
                } else if (i22 == 1) {
                    c10 = ' ';
                    j11 = j12 + (1000000000 * (((long) this.mag1) & 4294967295L));
                    this.mag1 = (int) j11;
                } else if (i22 == 2) {
                    c10 = ' ';
                    j11 = j12 + (1000000000 * (((long) this.mag2) & 4294967295L));
                    this.mag2 = (int) j11;
                } else {
                    if (i22 != 3) {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    c10 = ' ';
                    j11 = j12 + (1000000000 * (((long) this.mag3) & 4294967295L));
                    this.mag3 = (int) j11;
                }
                j12 = j11 >>> c10;
            }
            long j13 = (((long) this.mag3) & 4294967295L) + (((long) i21) & 4294967295L);
            this.mag3 = (int) j13;
            long j14 = j13 >>> 32;
            for (int i23 = 2; i23 >= 0; i23--) {
                if (i23 == 0) {
                    j10 = (((long) this.mag0) & 4294967295L) + j14;
                    this.mag0 = (int) j10;
                } else if (i23 == 1) {
                    j10 = (((long) this.mag1) & 4294967295L) + j14;
                    this.mag1 = (int) j10;
                } else if (i23 == 2) {
                    j10 = (((long) this.mag2) & 4294967295L) + j14;
                    this.mag2 = (int) j10;
                } else {
                    if (i23 != 3) {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j10 = (((long) this.mag3) & 4294967295L) + j14;
                    this.mag3 = (int) j10;
                }
                j14 = j10 >>> 32;
            }
        }
    }

    public final char char1(int i10) {
        byte b10 = CHAR1_ESCAPED[i10 & 127];
        if (b10 != -1) {
            return (char) b10;
        }
        throw char1Error(i10);
    }

    public JSONException char1Error(int i10) {
        return new JSONException(info("unclosed.str '\\" + ((char) i10)));
    }

    public ObjectReader checkAutoType(Class cls, long j10, long j11) {
        return null;
    }

    public final boolean checkNameBegin(int i10) {
        long j10 = this.context.features;
        if (i10 == 39 && (MASK_DISABLE_SINGLE_QUOTE & j10) != 0) {
            throw notSupportName();
        }
        if (i10 == 34 || i10 == 39) {
            return false;
        }
        if ((j10 & 131072) == 0) {
            throw notSupportName();
        }
        readFieldNameHashCodeUnquote();
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final char current() {
        return this.f4541ch;
    }

    public final BigDecimal decimal(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw error("can not cast to decimal " + jSONObject);
    }

    public void endArray() {
        next();
    }

    public final JSONException error() {
        throw new JSONValidException("error, offset " + this.offset + ", char " + this.f4541ch);
    }

    public final void errorOnNoneSerializable(Class cls) {
        if ((this.context.features & 4) == 0 || Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        C1569c.m6258a("not support none-Serializable, class ".concat(cls.getName()));
    }

    public final long features(long j10) {
        return j10 | this.context.features;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigDecimal getBigDecimal() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.getBigDecimal():java.math.BigDecimal");
    }

    public final BigInteger getBigInteger() {
        Number number = getNumber();
        if (number == null) {
            return null;
        }
        return number instanceof BigInteger ? (BigInteger) number : BigInteger.valueOf(number.longValue());
    }

    public final Context getContext() {
        return this.context;
    }

    public final double getDoubleValue() {
        int i10;
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                return (this.mag1 == 0 && this.mag2 == 0 && (i10 = this.mag3) != Integer.MIN_VALUE) ? this.negative ? -i10 : i10 : getNumber().doubleValue();
            case 2:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
                return getNumber().doubleValue();
            case 3:
                try {
                    return TypeUtils.toDoubleValue(this.stringValue);
                } catch (NumberFormatException e10) {
                    C1569c.m6258a(info(e10.getMessage()));
                    return 0.0d;
                }
            case 4:
                return this.boolValue ? 1.0d : 0.0d;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0.0d;
                }
                C1569c.m6258a(info("long value not support input null"));
                return 0.0d;
            case 6:
                Map map = (Map) this.complex;
                if (map != null && !map.isEmpty()) {
                    return TypeUtils.toDoubleValue(map);
                }
                this.wasNull = true;
                return 0.0d;
            case 7:
                Collection collection = (Collection) this.complex;
                if (collection != null && !collection.isEmpty()) {
                    return TypeUtils.toDoubleValue(this.complex);
                }
                this.wasNull = true;
                return 0.0d;
            case 8:
                try {
                    return getBigDecimal().doubleValue();
                } catch (ArithmeticException unused) {
                    throw numberError();
                }
            case Opcodes.DCONST_0 /* 14 */:
                return Double.NaN;
            default:
                C1606j0.m6295a("TODO : ", this.valueType);
                return 0.0d;
        }
    }

    public abstract String getFieldName();

    public final float getFloatValue() {
        return (float) getDoubleValue();
    }

    public final int getInt32Value() {
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0) {
                    boolean z10 = this.negative;
                    int i10 = this.mag3;
                    if (z10) {
                        if (i10 == Integer.MIN_VALUE) {
                            return i10;
                        }
                        if (i10 >= 0) {
                            return -i10;
                        }
                    } else if (i10 >= 0) {
                        return i10;
                    }
                }
                Number number = getNumber();
                if (!(number instanceof Long)) {
                    if (!(number instanceof BigInteger)) {
                        return number.intValue();
                    }
                    BigInteger bigInteger = (BigInteger) number;
                    if ((this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                        return bigInteger.intValue();
                    }
                    try {
                        return bigInteger.intValueExact();
                    } catch (ArithmeticException unused) {
                        throw numberError();
                    }
                }
                long jLongValue = number.longValue();
                if (jLongValue >= -2147483648L && jLongValue <= 2147483647L) {
                    return (int) jLongValue;
                }
                C1569c.m6258a(info("integer overflow " + jLongValue));
                return 0;
            case 2:
                return getNumber().intValue();
            case 3:
                return toInt32(this.stringValue);
            case 4:
                return this.boolValue ? 1 : 0;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0;
                }
                C1569c.m6258a(info("int value not support input null"));
                return 0;
            case 6:
                Number number2 = toNumber((Map) this.complex);
                if (number2 != null) {
                    return number2.intValue();
                }
                return 0;
            case 7:
                return toInt((List) this.complex);
            case 8:
                try {
                    return getBigDecimal().intValueExact();
                } catch (ArithmeticException unused2) {
                    throw numberError();
                }
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
                long jLongValue2 = getNumber().longValue();
                if ((jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) || (this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return (int) jLongValue2;
                }
                C1569c.m6258a(info("integer overflow " + jLongValue2));
                return 0;
            default:
                C1606j0.m6295a("TODO : ", this.valueType);
                return 0;
        }
    }

    public final long getInt64Value() {
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0) {
                    boolean z10 = this.negative;
                    int i10 = this.mag3;
                    if (z10) {
                        if (i10 == Integer.MIN_VALUE) {
                            return i10;
                        }
                        if (i10 >= 0) {
                            return -i10;
                        }
                    } else if (i10 >= 0) {
                        return i10;
                    }
                }
                Number number = getNumber();
                if (!(number instanceof BigInteger)) {
                    return number.longValue();
                }
                BigInteger bigInteger = (BigInteger) number;
                if ((this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw numberError();
                }
            case 2:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
                return getNumber().longValue();
            case 3:
                return toInt64(this.stringValue);
            case 4:
                return this.boolValue ? 1L : 0L;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0L;
                }
                C1569c.m6258a(info("long value not support input null"));
                return 0L;
            case 6:
                return toLong((Map) this.complex);
            case 7:
                return toInt((List) this.complex);
            case 8:
                try {
                    return getBigDecimal().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw numberError();
                }
            default:
                C1606j0.m6295a("TODO : ", this.valueType);
                return 0L;
        }
    }

    public final Locale getLocale() {
        return this.context.getLocale();
    }

    public abstract long getNameHashCodeLCase();

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number getNumber() {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.getNumber():java.lang.Number");
    }

    public final ObjectReader getObjectReader(Type type) {
        Context context = this.context;
        return context.provider.getObjectReader(type, (context.features & 1) != 0);
    }

    public ObjectReader getObjectReaderAutoType(long j10, Class cls, long j11) {
        Class<?> clsApply;
        ObjectReader objectReaderAutoType = this.context.getObjectReaderAutoType(j10);
        if (objectReaderAutoType != null) {
            return objectReaderAutoType;
        }
        String string = getString();
        AutoTypeBeforeHandler autoTypeBeforeHandler = this.context.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(string, (Class<?>) cls, j11)) != null) {
            return this.context.provider.getObjectReader(clsApply, (j11 & Feature.FieldBased.mask) != 0);
        }
        Context context = this.context;
        return context.provider.getObjectReader(string, cls, j11 | context.features);
    }

    public final int getOffset() {
        return this.offset;
    }

    public abstract int getRawInt();

    public abstract long getRawLong();

    public abstract String getString();

    public abstract int getStringLength();

    public byte getType() {
        return (byte) -128;
    }

    public final ZoneId getZoneId() {
        return this.context.getZoneId();
    }

    public final void handleResolveTasks(Object obj) {
        List<ResolveTask> list = this.resolveTasks;
        if (list == null) {
            return;
        }
        Object objEval = null;
        for (ResolveTask resolveTask : list) {
            JSONPath jSONPath = resolveTask.reference;
            FieldReader fieldReader = resolveTask.fieldReader;
            if (!jSONPath.isPrevious()) {
                if (!jSONPath.isRef()) {
                    C1605j.m6294a("reference path invalid : ", jSONPath);
                    return;
                }
                jSONPath.setReaderContext(this.context);
                if ((this.context.features & Feature.FieldBased.mask) != 0) {
                    JSONWriter.Context contextCreateWriteContext = JSONFactory.createWriteContext();
                    contextCreateWriteContext.features |= JSONWriter.Feature.FieldBased.mask;
                    jSONPath.setWriterContext(contextCreateWriteContext);
                }
                objEval = jSONPath.eval(obj);
            }
            Object obj2 = resolveTask.name;
            Object obj3 = resolveTask.object;
            if (obj2 != null) {
                if (obj3 instanceof Map) {
                    Map map = (Map) obj3;
                    if (!(obj2 instanceof ReferenceKey)) {
                        map.put(obj2, objEval);
                    } else if (map instanceof LinkedHashMap) {
                        int size = map.size();
                        if (size != 0) {
                            Object[] objArr = new Object[size];
                            Object[] objArr2 = new Object[size];
                            int i10 = 0;
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                if (obj2 == key) {
                                    objArr[i10] = objEval;
                                } else {
                                    objArr[i10] = key;
                                }
                                objArr2[i10] = entry.getValue();
                                i10++;
                            }
                            map.clear();
                            for (int i11 = 0; i11 < size; i11++) {
                                map.put(objArr[i11], objArr2[i11]);
                            }
                        }
                    } else {
                        map.put(objEval, map.remove(obj2));
                    }
                } else if (obj2 instanceof Integer) {
                    if (obj3 instanceof List) {
                        int iIntValue = ((Integer) obj2).intValue();
                        List list2 = (List) obj3;
                        if (iIntValue == list2.size()) {
                            list2.add(objEval);
                        } else if (iIntValue >= list2.size() || list2.get(iIntValue) != null) {
                            list2.add(iIntValue, objEval);
                        } else {
                            list2.set(iIntValue, objEval);
                        }
                    } else if (obj3 instanceof Object[]) {
                        ((Object[]) obj3)[((Integer) obj2).intValue()] = objEval;
                    } else if (obj3 instanceof Collection) {
                        ((Collection) obj3).add(objEval);
                    }
                }
            }
            fieldReader.accept(obj3, objEval);
        }
    }

    public boolean hasAutoTypeBeforeHandler() {
        return this.context.autoTypeBeforeHandler != null;
    }

    public final boolean hasComma() {
        return this.comma;
    }

    public String info(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.offset;
        }
        return str + ", offset " + this.offset;
    }

    public boolean isArray() {
        return this.f4541ch == '[';
    }

    public boolean isBinary() {
        return false;
    }

    public boolean isBool() {
        char c10 = this.f4541ch;
        return c10 == 't' || c10 == 'f';
    }

    public boolean isDate() {
        return false;
    }

    public final boolean isEnabled(Feature feature) {
        return (this.context.features & feature.mask) != 0;
    }

    public boolean isEnd() {
        return this.f4541ch == 26;
    }

    public final boolean isIgnoreNoneSerializable() {
        return (this.context.features & 2) != 0;
    }

    public final boolean isInitStringFieldAsEmpty() {
        return (this.context.features & 16) != 0;
    }

    public boolean isInt() {
        char c10 = this.f4541ch;
        if (c10 == '-' || c10 == '+') {
            return true;
        }
        return c10 >= '0' && c10 <= '9';
    }

    public final boolean isJSONB() {
        return this.jsonb;
    }

    public abstract boolean isNull();

    public boolean isNumber() {
        char c10 = this.f4541ch;
        if (c10 == '+' || c10 == '-') {
            return true;
        }
        switch (c10) {
            case '0':
            case '1':
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case '4':
            case Opcodes.SALOAD /* 53 */:
            case Opcodes.ISTORE /* 54 */:
            case Opcodes.LSTORE /* 55 */:
            case Opcodes.FSTORE /* 56 */:
            case Opcodes.DSTORE /* 57 */:
                return true;
            default:
                return false;
        }
    }

    public boolean isObject() {
        return this.f4541ch == '{';
    }

    public abstract boolean isReference();

    public boolean isString() {
        char c10 = this.f4541ch;
        return c10 == '\"' || c10 == '\'';
    }

    public final boolean isSupportAutoType(long j10) {
        return ((j10 | this.context.features) & 32) != 0;
    }

    public final boolean isSupportAutoTypeOrHandler(long j10) {
        Context context = this.context;
        return (((j10 | context.features) & 32) == 0 && context.autoTypeBeforeHandler == null) ? false : true;
    }

    public final boolean isSupportBeanArray(long j10) {
        return ((j10 | this.context.features) & 8) != 0;
    }

    public final boolean isSupportSmartMatch(long j10) {
        return ((j10 | this.context.features) & 64) != 0;
    }

    public final boolean isTypeRedirect() {
        return this.typeRedirect;
    }

    public SavePoint mark() {
        return new SavePoint(this.offset, this.f4541ch);
    }

    public abstract void next();

    public abstract boolean nextIfArrayEnd();

    public abstract boolean nextIfArrayStart();

    public abstract boolean nextIfComma();

    public abstract boolean nextIfInfinity();

    public boolean nextIfMatch(byte b10) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean nextIfMatch(char c10);

    public abstract boolean nextIfMatchIdent(char c10, char c11);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12, char c13);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12, char c13, char c14);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12, char c13, char c14, char c15);

    public boolean nextIfMatchTypedAny() {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean nextIfName4Match10(long j10);

    public abstract boolean nextIfName4Match11(long j10);

    public abstract boolean nextIfName4Match12(long j10, byte b10);

    public abstract boolean nextIfName4Match13(long j10, int i10);

    public boolean nextIfName4Match14(long j10, int i10) {
        return false;
    }

    public boolean nextIfName4Match15(long j10, int i10) {
        return false;
    }

    public abstract boolean nextIfName4Match16(long j10, int i10, byte b10);

    public abstract boolean nextIfName4Match17(long j10, long j11);

    public abstract boolean nextIfName4Match18(long j10, long j11);

    public boolean nextIfName4Match19(long j10, long j11) {
        return false;
    }

    public abstract boolean nextIfName4Match2();

    public abstract boolean nextIfName4Match20(long j10, long j11, byte b10);

    public boolean nextIfName4Match21(long j10, long j11, int i10) {
        return false;
    }

    public abstract boolean nextIfName4Match22(long j10, long j11, int i10);

    public abstract boolean nextIfName4Match23(long j10, long j11, int i10);

    public abstract boolean nextIfName4Match24(long j10, long j11, int i10, byte b10);

    public abstract boolean nextIfName4Match25(long j10, long j11, long j12);

    public abstract boolean nextIfName4Match26(long j10, long j11, long j12);

    public abstract boolean nextIfName4Match27(long j10, long j11, long j12);

    public abstract boolean nextIfName4Match28(long j10, long j11, long j12, byte b10);

    public abstract boolean nextIfName4Match29(long j10, long j11, long j12, int i10);

    public abstract boolean nextIfName4Match3();

    public abstract boolean nextIfName4Match30(long j10, long j11, long j12, int i10);

    public abstract boolean nextIfName4Match31(long j10, long j11, long j12, int i10);

    public abstract boolean nextIfName4Match32(long j10, long j11, long j12, int i10, byte b10);

    public abstract boolean nextIfName4Match33(long j10, long j11, long j12, long j13);

    public abstract boolean nextIfName4Match34(long j10, long j11, long j12, long j13);

    public abstract boolean nextIfName4Match35(long j10, long j11, long j12, long j13);

    public abstract boolean nextIfName4Match36(long j10, long j11, long j12, long j13, byte b10);

    public abstract boolean nextIfName4Match37(long j10, long j11, long j12, long j13, int i10);

    public abstract boolean nextIfName4Match38(long j10, long j11, long j12, long j13, int i10);

    public abstract boolean nextIfName4Match39(long j10, long j11, long j12, long j13, int i10);

    public abstract boolean nextIfName4Match4(byte b10);

    public abstract boolean nextIfName4Match40(long j10, long j11, long j12, long j13, int i10, byte b10);

    public abstract boolean nextIfName4Match41(long j10, long j11, long j12, long j13, long j14);

    public abstract boolean nextIfName4Match42(long j10, long j11, long j12, long j13, long j14);

    public abstract boolean nextIfName4Match43(long j10, long j11, long j12, long j13, long j14);

    public abstract boolean nextIfName4Match5(int i10);

    public abstract boolean nextIfName4Match6(int i10);

    public abstract boolean nextIfName4Match7(int i10);

    public abstract boolean nextIfName4Match8(int i10, byte b10);

    public abstract boolean nextIfName4Match9(long j10);

    public boolean nextIfName8Match0() {
        return false;
    }

    public boolean nextIfName8Match1() {
        return false;
    }

    public boolean nextIfName8Match2() {
        return false;
    }

    public abstract boolean nextIfNull();

    public abstract boolean nextIfNullOrEmptyString();

    public abstract boolean nextIfObjectEnd();

    public abstract boolean nextIfObjectStart();

    public abstract boolean nextIfSet();

    public boolean nextIfValue4Match10(long j10) {
        return false;
    }

    public boolean nextIfValue4Match11(long j10) {
        return false;
    }

    public boolean nextIfValue4Match2() {
        return false;
    }

    public boolean nextIfValue4Match3() {
        return false;
    }

    public boolean nextIfValue4Match4(byte b10) {
        return false;
    }

    public boolean nextIfValue4Match5(byte b10, byte b11) {
        return false;
    }

    public boolean nextIfValue4Match6(int i10) {
        return false;
    }

    public boolean nextIfValue4Match7(int i10) {
        return false;
    }

    public boolean nextIfValue4Match8(int i10, byte b10) {
        return false;
    }

    public boolean nextIfValue4Match9(int i10, byte b10, byte b11) {
        return false;
    }

    public void nextWithoutComment() {
        next();
    }

    public final JSONException notSupportName() {
        return new JSONException(info("not support unquoted name"));
    }

    public JSONException numberError() {
        return new JSONException("illegal number, offset " + this.offset + ", char " + this.f4541ch);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void read(java.util.Map r19, long r20) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.read(java.util.Map, long):void");
    }

    public Object readAny() {
        return read(Object.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List readArray() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.readArray():java.util.List");
    }

    public byte[] readBase64() {
        int iIndexOf;
        int i10;
        int iIndexOf2;
        String string = readString();
        if (string != null && string.startsWith("data:image/") && (iIndexOf = string.indexOf(59, 12)) != -1 && (iIndexOf2 = string.indexOf(44, (i10 = iIndexOf + 1))) != -1 && string.regionMatches(i10, "base64", 0, 6)) {
            string = string.substring(iIndexOf2 + 1);
        }
        return string.isEmpty() ? new byte[0] : Base64.getDecoder().decode(string);
    }

    public abstract BigDecimal readBigDecimal();

    public BigInteger readBigInteger() {
        readNumber0();
        return getBigInteger();
    }

    public byte[] readBinary() {
        if (this.f4541ch == 'x') {
            return readHex();
        }
        if (isString()) {
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            if ((this.context.features & Feature.Base64StringAsByteArray.mask) != 0) {
                return Base64.getDecoder().decode(string);
            }
            C1569c.m6258a(info("not support input ".concat(string)));
            return null;
        }
        if (!nextIfArrayStart()) {
            C1569c.m6258a(info("not support read binary"));
            return null;
        }
        byte[] bArrCopyOf = new byte[64];
        int i10 = 0;
        while (this.f4541ch != ']') {
            if (i10 == bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + (length >> 1));
            }
            bArrCopyOf[i10] = (byte) readInt32Value();
            i10++;
        }
        next();
        nextIfComma();
        return Arrays.copyOf(bArrCopyOf, i10);
    }

    public Boolean readBool() {
        if (nextIfNull()) {
            return null;
        }
        this.wasNull = false;
        boolean boolValue = readBoolValue();
        if (boolValue || !this.wasNull) {
            return Boolean.valueOf(boolValue);
        }
        return null;
    }

    public abstract boolean readBoolValue();

    public Calendar readCalendar() {
        if (isString()) {
            long millisFromString = readMillisFromString();
            if (millisFromString == 0 && this.wasNull) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(millisFromString);
            return calendar;
        }
        if (readIfNull()) {
            return null;
        }
        long int64Value = readInt64Value();
        if (this.context.formatUnixTime) {
            int64Value *= 1000;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(int64Value);
        return calendar2;
    }

    public char readCharValue() {
        String string = readString();
        if (string != null && !string.isEmpty()) {
            return string.charAt(0);
        }
        this.wasNull = true;
        return (char) 0;
    }

    public Character readCharacter() {
        String string = readString();
        if (string != null && !string.isEmpty()) {
            return Character.valueOf(string.charAt(0));
        }
        this.wasNull = true;
        return (char) 0;
    }

    public Date readDate() {
        JSONReader jSONReader;
        long millisFromString;
        if (isInt()) {
            return new Date(readInt64Value());
        }
        if (readIfNull() || nextIfNullOrEmptyString()) {
            return null;
        }
        if (current() == 'n') {
            return readNullOrNewDate();
        }
        if (isTypeRedirect()) {
            jSONReader = this;
            if (jSONReader.nextIfMatchIdent('\"', 'v', 'a', 'l', '\"')) {
                nextIfMatch(':');
                millisFromString = readInt64Value();
                nextIfObjectEnd();
                setTypeRedirect(false);
            }
            if (millisFromString == 0 || !jSONReader.wasNull) {
                return new Date(millisFromString);
            }
            return null;
        }
        jSONReader = this;
        if (isObject()) {
            JSONObject jSONObject = readJSONObject();
            Object obj = jSONObject.get("$date");
            return obj instanceof String ? DateUtils.parseDate((String) obj, jSONReader.context.getZoneId()) : TypeUtils.toDate(jSONObject);
        }
        millisFromString = readMillisFromString();
        if (millisFromString == 0) {
        }
        return new Date(millisFromString);
    }

    public final Double readDouble() {
        if (nextIfNull()) {
            return null;
        }
        this.wasNull = false;
        double doubleValue = readDoubleValue();
        if (this.wasNull) {
            return null;
        }
        return Double.valueOf(doubleValue);
    }

    public abstract double readDoubleValue();

    public abstract String readFieldName();

    public abstract long readFieldNameHashCode();

    public long readFieldNameHashCode(int i10, int i11, int i12) {
        return readFieldNameHashCode();
    }

    public long readFieldNameHashCodeE(int i10, int i11, int i12) {
        return readFieldNameHashCode();
    }

    public final long readFieldNameHashCodeError(int i10, int i11) {
        String str;
        String fieldName;
        if ((this.context.features & 131072) != 0 && isFirstIdentifier(i11)) {
            return readFieldNameHashCodeUnquote();
        }
        if (i11 == 125 || nextIfNull()) {
            return -1L;
        }
        if (i11 != 91 || i10 <= 0 || (fieldName = getFieldName()) == null) {
            str = "illegal fieldName input" + i11;
        } else {
            str = "illegal fieldName input " + i11 + ", previous fieldName " + fieldName;
        }
        C1569c.m6258a(info(str));
        return 0L;
    }

    public abstract long readFieldNameHashCodeUnquote();

    public final String readFieldNameUnquote() {
        if (this.f4541ch == '/') {
            skipComment();
        }
        readFieldNameHashCodeUnquote();
        String fieldName = getFieldName();
        if (fieldName != null && !fieldName.isEmpty()) {
            return fieldName;
        }
        C1569c.m6258a(info("illegal input"));
        return null;
    }

    public Float readFloat() {
        if (nextIfNull()) {
            return null;
        }
        this.wasNull = false;
        float floatValue = readFloatValue();
        if (this.wasNull) {
            return null;
        }
        return Float.valueOf(floatValue);
    }

    public abstract float readFloatValue();

    public abstract byte[] readHex();

    public abstract boolean readIfNull();

    public Instant readInstant() {
        if (nextIfNull()) {
            return null;
        }
        if (isNumber()) {
            long int64Value = readInt64Value();
            if (this.context.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value);
        }
        if (isObject()) {
            return (Instant) getObjectReader(Instant.class).createInstance(readObject(), 0L);
        }
        ZonedDateTime zonedDateTime = readZonedDateTime();
        if (zonedDateTime == null) {
            return null;
        }
        return Instant.ofEpochSecond(zonedDateTime.toEpochSecond(), zonedDateTime.toLocalTime().getNano());
    }

    public final Short readInt16() {
        Integer int32 = readInt32();
        if (int32 == null) {
            return null;
        }
        return Short.valueOf(int32.shortValue());
    }

    public short readInt16Value() {
        return (short) readInt32Value();
    }

    public abstract Integer readInt32();

    public abstract int readInt32Value();

    public int[] readInt32ValueArray() {
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            if (!isString()) {
                C1569c.m6258a(info("TODO"));
                return null;
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            C1569c.m6258a(info("not support input ".concat(string)));
            return null;
        }
        int[] iArrCopyOf = new int[8];
        int i10 = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                C1569c.m6258a(info("input end"));
                return null;
            }
            if (i10 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
            }
            iArrCopyOf[i10] = readInt32Value();
            i10++;
        }
        nextIfComma();
        return i10 == iArrCopyOf.length ? iArrCopyOf : Arrays.copyOf(iArrCopyOf, i10);
    }

    public final int readInt32ValueOverflow() {
        readNumber0();
        return getInt32Value();
    }

    public abstract Long readInt64();

    public abstract long readInt64Value();

    public long[] readInt64ValueArray() {
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            if (!isString()) {
                C1569c.m6258a(info("TODO"));
                return null;
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            throw error("not support input ".concat(string));
        }
        long[] jArrCopyOf = new long[8];
        int i10 = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                C1569c.m6258a(info("input end"));
                return null;
            }
            if (i10 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
            }
            jArrCopyOf[i10] = readInt64Value();
            i10++;
        }
        return i10 == jArrCopyOf.length ? jArrCopyOf : Arrays.copyOf(jArrCopyOf, i10);
    }

    public final long readInt64ValueOverflow() {
        readNumber0();
        return getInt64Value();
    }

    public final Byte readInt8() {
        Integer int32 = readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }

    public byte readInt8Value() {
        return (byte) readInt32Value();
    }

    public final JSONArray readJSONArray() {
        JSONArray jSONArray = new JSONArray();
        read((List) jSONArray);
        return jSONArray;
    }

    public final JSONObject readJSONObject() {
        JSONObject jSONObject = new JSONObject();
        read(jSONObject, 0L);
        return jSONObject;
    }

    public List readList(Type[] typeArr) {
        char c10;
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            C1588i.m6279a("syntax error : ", this.f4541ch);
            return null;
        }
        int length = typeArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (!nextIfArrayEnd() && i10 < length) {
            int i11 = this.offset;
            int i12 = i10 + 1;
            Object obj = read(typeArr[i10]);
            if (i11 == this.offset || (c10 = this.f4541ch) == '}' || c10 == 26) {
                C1612m0.m6300a("illegal input : ", this.f4541ch, getOffset());
                return null;
            }
            arrayList.add(obj);
            i10 = i12;
        }
        if (i10 != length) {
            C1569c.m6258a(info("element length mismatch"));
            return null;
        }
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.LocalDate readLocalDate() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.readLocalDate():java.time.LocalDate");
    }

    public abstract LocalDate readLocalDate10();

    public abstract LocalDate readLocalDate11();

    public abstract LocalDate readLocalDate8();

    public abstract LocalDate readLocalDate9();

    /* JADX WARN: Type inference failed for: r0v17, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.time.LocalDateTime] */
    public LocalDateTime readLocalDateTime() {
        JSONReader jSONReader;
        if (isInt()) {
            return Instant.ofEpochMilli(readInt64Value()).atZone(this.context.getZoneId()).toLocalDateTime();
        }
        if (isTypeRedirect()) {
            jSONReader = this;
            if (jSONReader.nextIfMatchIdent('\"', 'v', 'a', 'l', '\"')) {
                nextIfMatch(':');
                LocalDateTime localDateTime = readLocalDateTime();
                nextIfObjectEnd();
                setTypeRedirect(false);
                return localDateTime;
            }
        } else {
            jSONReader = this;
        }
        Context context = jSONReader.context;
        if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    if (localDate8 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate8, LocalTime.MIN);
                case 9:
                    LocalDate localDate9 = readLocalDate9();
                    if (localDate9 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate9, LocalTime.MIN);
                case 10:
                    LocalDate localDate10 = readLocalDate10();
                    if (localDate10 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate10, LocalTime.MIN);
                case Opcodes.FCONST_0 /* 11 */:
                    LocalDate localDate11 = readLocalDate11();
                    if (localDate11 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate11, LocalTime.MIN);
                case 16:
                    return readLocalDateTime16();
                case Opcodes.SIPUSH /* 17 */:
                    LocalDateTime localDateTime17 = readLocalDateTime17();
                    if (localDateTime17 != null) {
                        return localDateTime17;
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    LocalDateTime localDateTime18 = readLocalDateTime18();
                    if (localDateTime18 != null) {
                        return localDateTime18;
                    }
                    break;
                case 19:
                    LocalDateTime localDateTime19 = readLocalDateTime19();
                    if (localDateTime19 != null) {
                        return localDateTime19;
                    }
                    break;
                case 20:
                    LocalDateTime localDateTime20 = readLocalDateTime20();
                    if (localDateTime20 != null) {
                        return localDateTime20;
                    }
                    ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                    if (zonedDateTimeX != null) {
                        return zonedDateTimeX.toLocalDateTime();
                    }
                    break;
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.DLOAD /* 24 */:
                case Opcodes.ALOAD /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                    LocalDateTime localDateTimeX = readLocalDateTimeX(stringLength);
                    if (localDateTimeX != null) {
                        return localDateTimeX;
                    }
                    ZonedDateTime zonedDateTimeX2 = readZonedDateTimeX(stringLength);
                    if (zonedDateTimeX2 != null) {
                        ZoneId zoneId = jSONReader.context.getZoneId();
                        return !zonedDateTimeX2.getZone().equals(zoneId) ? zonedDateTimeX2.toInstant().atZone(zoneId).toLocalDateTime() : zonedDateTimeX2.toLocalDateTime();
                    }
                    break;
            }
        }
        String string = readString();
        if (string.isEmpty() || "null".equals(string)) {
            jSONReader.wasNull = true;
            return null;
        }
        DateTimeFormatter dateFormatter = jSONReader.context.getDateFormatter();
        if (dateFormatter != null) {
            return !jSONReader.context.formatHasHour ? LocalDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN) : LocalDateTime.parse(string, dateFormatter);
        }
        if (IOUtils.isNumber(string)) {
            long j10 = Long.parseLong(string);
            if (jSONReader.context.formatUnixTime) {
                j10 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(j10), jSONReader.context.getZoneId());
        }
        if (!string.startsWith("/Date(") || !string.endsWith(")/")) {
            if ("0000-00-00 00:00:00".equals(string)) {
                jSONReader.wasNull = true;
                return null;
            }
            C1569c.m6258a(info("read LocalDateTime error ".concat(string)));
            return null;
        }
        String strSubstring = string.substring(6, string.length() - 2);
        int iIndexOf = strSubstring.indexOf(43);
        if (iIndexOf == -1) {
            iIndexOf = strSubstring.indexOf(45);
        }
        if (iIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(strSubstring)), jSONReader.context.getZoneId());
    }

    public abstract LocalDateTime readLocalDateTime12();

    public abstract LocalDateTime readLocalDateTime14();

    public abstract LocalDateTime readLocalDateTime16();

    public abstract LocalDateTime readLocalDateTime17();

    public abstract LocalDateTime readLocalDateTime18();

    public abstract LocalDateTime readLocalDateTime19();

    public abstract LocalDateTime readLocalDateTime20();

    public abstract LocalDateTime readLocalDateTimeX(int i10);

    public LocalTime readLocalTime() {
        if (nextIfNull()) {
            return null;
        }
        if (isInt()) {
            return Instant.ofEpochMilli(readInt64Value()).atZone(this.context.getZoneId()).toLocalTime();
        }
        switch (getStringLength()) {
            case 5:
                return readLocalTime5();
            case 6:
                return readLocalTime6();
            case 7:
                return readLocalTime7();
            case 8:
                return readLocalTime8();
            case 9:
                return readLocalTime9();
            case 10:
                return readLocalTime10();
            case Opcodes.FCONST_0 /* 11 */:
                return readLocalTime11();
            case Opcodes.FCONST_1 /* 12 */:
                return readLocalTime12();
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            default:
                String string = readString();
                if (string.isEmpty() || "null".equals(string)) {
                    return null;
                }
                if (IOUtils.isNumber(string)) {
                    return Instant.ofEpochMilli(Long.parseLong(string)).atZone(this.context.getZoneId()).toLocalTime();
                }
                C1569c.m6258a("not support len : ".concat(string));
                return null;
            case 15:
                return readLocalTime15();
            case Opcodes.LDC /* 18 */:
                return readLocalTime18();
            case 19:
                return readLocalDateTime19().toLocalTime();
            case 20:
                return readLocalDateTime20().toLocalTime();
        }
    }

    public abstract LocalTime readLocalTime10();

    public abstract LocalTime readLocalTime11();

    public abstract LocalTime readLocalTime12();

    public abstract LocalTime readLocalTime15();

    public abstract LocalTime readLocalTime18();

    public abstract LocalTime readLocalTime5();

    public abstract LocalTime readLocalTime6();

    public abstract LocalTime readLocalTime7();

    public abstract LocalTime readLocalTime8();

    public abstract LocalTime readLocalTime9();

    public abstract long readMillis19();

    public final long readMillisFromString() {
        LocalDateTime localDateTimeOf;
        this.wasNull = false;
        Context context = this.context;
        String str = context.dateFormat;
        if (str == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            ZonedDateTime zonedDateTime = null;
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    if (localDate8 == null) {
                        C1607k.m6296a("TODO : ", readString());
                        return 0L;
                    }
                    localDateTimeOf = LocalDateTime.of(localDate8, LocalTime.MIN);
                    break;
                    break;
                case 9:
                    LocalDate localDate9 = readLocalDate9();
                    localDateTimeOf = localDate9 == null ? null : LocalDateTime.of(localDate9, LocalTime.MIN);
                    break;
                case 10:
                    LocalDate localDate10 = readLocalDate10();
                    if (localDate10 == null) {
                        String string = readString();
                        if ("0000-00-00".equals(string)) {
                            this.wasNull = true;
                            return 0L;
                        }
                        if (IOUtils.isNumber(string)) {
                            return Long.parseLong(string);
                        }
                        C1605j.m6294a("TODO : ", string);
                        return 0L;
                    }
                    localDateTimeOf = LocalDateTime.of(localDate10, LocalTime.MIN);
                    break;
                case Opcodes.FCONST_0 /* 11 */:
                    LocalDate localDate11 = readLocalDate11();
                    localDateTimeOf = localDate11 == null ? null : LocalDateTime.of(localDate11, LocalTime.MIN);
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    localDateTimeOf = readLocalDateTime12();
                    break;
                case Opcodes.FCONST_2 /* 13 */:
                case 15:
                default:
                    localDateTimeOf = null;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    localDateTimeOf = readLocalDateTime14();
                    break;
                case 16:
                    localDateTimeOf = readLocalDateTime16();
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    localDateTimeOf = readLocalDateTime17();
                    break;
                case Opcodes.LDC /* 18 */:
                    localDateTimeOf = readLocalDateTime18();
                    break;
                case 19:
                    long millis19 = readMillis19();
                    if (millis19 != 0 || !this.wasNull) {
                        return millis19;
                    }
                    localDateTimeOf = readLocalDateTime19();
                    break;
                    break;
                case 20:
                    localDateTimeOf = readLocalDateTime20();
                    break;
            }
            if (localDateTimeOf != null) {
                zonedDateTime = ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
            } else if (stringLength >= 20) {
                ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                zonedDateTime = (zonedDateTimeX != null || stringLength < 32 || stringLength > 35) ? zonedDateTimeX : DateUtils.parseZonedDateTime(readString(), null);
            }
            if (zonedDateTime != null) {
                long epochSecond = zonedDateTime.toEpochSecond();
                int nano = zonedDateTime.toLocalTime().getNano();
                return (epochSecond >= 0 || nano <= 0) ? (epochSecond * 1000) + ((long) (nano / 1000000)) : ((epochSecond + 1) * 1000) + ((long) ((nano / 1000000) - 1000));
            }
        }
        String string2 = readString();
        if (string2.isEmpty() || "null".equals(string2)) {
            this.wasNull = true;
            return 0L;
        }
        Context context2 = this.context;
        if (context2.formatMillis || context2.formatUnixTime) {
            long j10 = Long.parseLong(string2);
            return this.context.formatUnixTime ? j10 * 1000 : j10;
        }
        if (str != null && !str.isEmpty()) {
            if ("yyyy-MM-dd HH:mm:ss".equals(str)) {
                return ((string2.length() < 4 || string2.charAt(4) != '-') && IOUtils.isNumber(string2)) ? Long.parseLong(string2) : DateUtils.parseMillis19(string2, this.context.getZoneId());
            }
            if ("yyyy-MM-dd HH:mm:ss.SSS".equals(str) && string2.length() == 19 && string2.charAt(4) == '-' && string2.charAt(7) == '-' && string2.charAt(10) == ' ' && string2.charAt(13) == ':' && string2.charAt(16) == ':') {
                return DateUtils.parseMillis19(string2, this.context.getZoneId());
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            try {
                return simpleDateFormat.parse(string2).getTime();
            } catch (ParseException unused) {
                C1608k0.m6297a("parse date error, ", string2, ", expect format ", simpleDateFormat.toPattern());
                return 0L;
            }
        }
        if ("0000-00-00T00:00:00".equals(string2) || "0001-01-01T00:00:00+08:00".equals(string2)) {
            return 0L;
        }
        if (string2.startsWith("/Date(") && string2.endsWith(")/")) {
            String strSubstring = string2.substring(6, string2.length() - 2);
            int iIndexOf = strSubstring.indexOf(43);
            if (iIndexOf == -1) {
                iIndexOf = strSubstring.indexOf(45);
            }
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            return Long.parseLong(strSubstring);
        }
        if (IOUtils.isNumber(string2)) {
            return Long.parseLong(string2);
        }
        C1569c.m6258a(info("format " + str + " not support, input " + string2));
        return 0L;
    }

    public double readNaN() {
        throw new JSONException("not support");
    }

    public abstract void readNull();

    public abstract Date readNullOrNewDate();

    public void readNumber(ValueConsumer valueConsumer, boolean z10) {
        readNumber0();
        valueConsumer.accept(getNumber());
    }

    public abstract void readNumber0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> readObject() {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.readObject():java.util.Map");
    }

    public abstract OffsetDateTime readOffsetDateTime();

    public abstract OffsetTime readOffsetTime();

    public abstract String readPattern();

    public abstract String readReference();

    public final boolean readReference(List list, int i10) {
        if (isReference()) {
            return readReference0(list, i10);
        }
        return false;
    }

    public abstract String readString();

    public void readString(ValueConsumer valueConsumer, boolean z10) {
        String string = readString();
        if (z10) {
            valueConsumer.accept(JSON.toJSONString(string));
        } else {
            valueConsumer.accept(string);
        }
    }

    public String[] readStringArray() {
        String[] strArr = null;
        if (this.f4541ch == 'n' && nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            char c10 = this.f4541ch;
            if (c10 != '\"' && c10 != '\'') {
                C1569c.m6258a(info("not support input"));
                return null;
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            C1569c.m6258a(info("not support input ".concat(string)));
            return null;
        }
        int i10 = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                C1569c.m6258a(info("input end"));
                return null;
            }
            if (strArr == null) {
                strArr = new String[16];
            } else if (i10 == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            }
            strArr[i10] = readString();
            i10++;
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        return strArr.length == i10 ? strArr : (String[]) Arrays.copyOf(strArr, i10);
    }

    public final String readStringNotMatch() {
        char c10 = this.f4541ch;
        if (c10 != '+' && c10 != '-') {
            if (c10 == '[') {
                List array = readArray();
                if (array.size() == 1) {
                    Object obj = array.get(0);
                    if (obj == null) {
                        return null;
                    }
                    if ((this.context.features & Feature.DisableStringArrayUnwrapping.mask) == 0 && (obj instanceof String)) {
                        return obj.toString();
                    }
                }
                return toString(array);
            }
            if (c10 != 'f') {
                if (c10 == 'n') {
                    readNull();
                    return null;
                }
                if (c10 != 't') {
                    if (c10 == '{') {
                        return toString(readObject());
                    }
                    switch (c10) {
                        case '0':
                        case '1':
                        case Opcodes.AALOAD /* 50 */:
                        case Opcodes.BALOAD /* 51 */:
                        case '4':
                        case Opcodes.SALOAD /* 53 */:
                        case Opcodes.ISTORE /* 54 */:
                        case Opcodes.LSTORE /* 55 */:
                        case Opcodes.FSTORE /* 56 */:
                        case Opcodes.DSTORE /* 57 */:
                            break;
                        default:
                            C1569c.m6258a(info("illegal input : " + this.f4541ch));
                            return null;
                    }
                }
            }
            boolean boolValue = readBoolValue();
            this.boolValue = boolValue;
            return boolValue ? "true" : "false";
        }
        readNumber0();
        return getNumber().toString();
    }

    public long readTypeHashCode() {
        return readValueHashCode();
    }

    public abstract UUID readUUID();

    public abstract long readValueHashCode();

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.ZonedDateTime readZonedDateTime() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.readZonedDateTime():java.time.ZonedDateTime");
    }

    public abstract ZonedDateTime readZonedDateTimeX(int i10);

    public void reset(SavePoint savePoint) {
        this.offset = savePoint.offset;
        this.f4541ch = (char) savePoint.current;
    }

    public final void setTypeRedirect(boolean z10) {
        this.typeRedirect = z10;
    }

    public abstract void skipComment();

    public abstract boolean skipName();

    public abstract void skipValue();

    public int startArray() {
        if (nextIfArrayStart()) {
            return Integer.MAX_VALUE;
        }
        C1569c.m6258a(info("illegal input, expect '[', but " + this.f4541ch));
        return 0;
    }

    public final int toInt(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw error("parseLong error, field : value " + list);
    }

    public final int toInt32(String str) {
        if (IOUtils.isNumber(str) || str.lastIndexOf(44) == str.length() - 4) {
            return TypeUtils.toIntValue(str);
        }
        throw error("parseInt error, value : ".concat(str));
    }

    public final long toInt64(String str) {
        if (IOUtils.isNumber(str) || str.lastIndexOf(44) == str.length() - 4) {
            return TypeUtils.toLongValue(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return DateUtils.parseMillis(str, this.context.zoneId);
            } catch (JSONException | NullPointerException | DateTimeException unused) {
            }
        }
        throw error("parseLong error, value : ".concat(str));
    }

    public final long toLong(Map map) {
        if (map.get("val") instanceof Number) {
            return ((Number) r0).intValue();
        }
        throw error("parseLong error, value : " + map);
    }

    public final Number toNumber(List list) {
        if (list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return TypeUtils.toBigDecimal((String) obj);
        }
        return null;
    }

    public final String toString(List list) {
        JSONWriter jSONWriterM6247of = JSONWriter.m6247of();
        jSONWriterM6247of.setRootObject(list);
        jSONWriterM6247of.write(list);
        return jSONWriterM6247of.toString();
    }

    public final JSONException valueError() {
        return new JSONException(info("illegal value"));
    }

    public boolean wasNull() {
        return this.wasNull;
    }

    public static AutoTypeBeforeHandler autoTypeFilter(boolean z10, String... strArr) {
        return new ContextAutoTypeBeforeHandler(z10, strArr);
    }

    public static AutoTypeBeforeHandler autoTypeFilter(Class... clsArr) {
        return new ContextAutoTypeBeforeHandler(clsArr);
    }

    public static AutoTypeBeforeHandler autoTypeFilter(boolean z10, Class... clsArr) {
        return new ContextAutoTypeBeforeHandler(z10, clsArr);
    }

    private static JSONReader ofUTF16(byte[] bArr, int i10, int i11, Context context) {
        return new JSONReaderUTF16(context, bArr, i10, i11);
    }

    public Number readNumber() {
        readNumber0();
        return getNumber();
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        SupportArrayToBean(8),
        InitStringFieldAsEmpty(16),
        SupportAutoType(32),
        SupportSmartMatch(64),
        UseNativeObject(128),
        SupportClassForName(256),
        IgnoreSetNullValue(512),
        UseDefaultConstructorAsPossible(1024),
        UseBigDecimalForFloats(JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME),
        UseBigDecimalForDoubles(JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE),
        ErrorOnEnumNotMatch(JSONWriter.MASK_WRITE_ENUMS_USING_NAME),
        TrimString(16384),
        ErrorOnNotSupportAutoType(JSONWriter.MASK_IGNORE_ERROR_GETTER),
        DuplicateKeyValueAsArray(JSONWriter.MASK_PRETTY_FORMAT),
        AllowUnQuotedFieldNames(131072),
        NonStringKeyAsString(262144),
        Base64StringAsByteArray(JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN),
        IgnoreCheckClose(JSONWriter.MASK_USE_SINGLE_QUOTES),
        ErrorOnNullForPrimitives(2097152),
        NullOnError(JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY),
        IgnoreAutoTypeNotMatch(JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY),
        NonZeroNumberCastToBooleanAsTrue(JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO),
        IgnoreNullPropertyValue(JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE),
        ErrorOnUnknownProperties(JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY),
        EmptyStringAsNull(134217728),
        NonErrorOnNumberOverflow(JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN),
        UseBigIntegerForInts(536870912),
        UseLongForInts(JSONWriter.MASK_ESCAPE_NONE_ASCII),
        DisableSingleQuote(JSONReader.MASK_DISABLE_SINGLE_QUOTE),
        UseDoubleForDecimals(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER),
        DisableReferenceDetect(JSONReader.MASK_DISABLE_REFERENCE_DETECT),
        DisableStringArrayUnwrapping(JSONWriter.MASK_WRITE_LONG_AS_STRING);

        public final long mask;

        Feature(long j10) {
            this.mask = j10;
        }

        /* JADX INFO: renamed from: of */
        public static long m6243of(Feature[] featureArr) {
            long j10 = 0;
            if (featureArr == null) {
                return 0L;
            }
            for (Feature feature : featureArr) {
                j10 |= feature.mask;
            }
            return j10;
        }

        public boolean isEnabled(long j10) {
            return (j10 & this.mask) != 0;
        }

        public static boolean isEnabled(long j10, Feature feature) {
            return (j10 & feature.mask) != 0;
        }
    }

    public boolean readReference(Collection collection, int i10) {
        if (isReference()) {
            return readReference0(collection, i10);
        }
        return false;
    }

    @Deprecated
    public static JSONReader ofJSONB(Context context, byte[] bArr) {
        return new JSONReaderJSONB(context, bArr, 0, bArr.length);
    }

    public final String toString(Map map) {
        JSONWriter jSONWriterM6247of = JSONWriter.m6247of();
        jSONWriterM6247of.setRootObject(map);
        jSONWriterM6247of.write((Map<?, ?>) map);
        return jSONWriterM6247of.toString();
    }

    public static JSONReader ofJSONB(byte[] bArr, Context context) {
        return new JSONReaderJSONB(context, bArr, 0, bArr.length);
    }

    public static JSONReader ofJSONB(InputStream inputStream, Context context) {
        return new JSONReaderJSONB(context, inputStream);
    }

    public static JSONReader ofJSONB(byte[] bArr) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(), bArr, 0, bArr.length);
    }

    public final boolean isSupportBeanArray() {
        return (this.context.features & 8) != 0;
    }

    public final boolean isSupportSmartMatch() {
        return (this.context.features & 64) != 0;
    }

    public static JSONReader ofJSONB(byte[] bArr, int i10, int i11) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(), bArr, i10, i11);
    }

    public static JSONReader ofJSONB(byte[] bArr, int i10, int i11, Context context) {
        return new JSONReaderJSONB(context, bArr, i10, i11);
    }

    public static JSONReader ofJSONB(byte[] bArr, int i10, int i11, SymbolTable symbolTable) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(symbolTable), bArr, i10, i11);
    }

    public static JSONException syntaxError(int i10) {
        return new JSONException("syntax error, expect ',', but '" + ((char) i10) + "'");
    }

    public final void addResolveTask(FieldReader fieldReader, Object obj, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(fieldReader, obj, fieldReader.fieldName, jSONPath));
    }

    public static JSONException numberError(int i10, int i11) {
        return new JSONException("illegal number, offset " + i10 + ", char " + ((char) i11));
    }

    public final JSONException error(String str, int i10) {
        return new JSONException(info(str).concat(Integer.toString(i10)));
    }

    public final Number toNumber(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public final void addResolveTask(Collection collection, int i10, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(null, collection, Integer.valueOf(i10), jSONPath));
    }

    public final JSONException error(String str, Exception exc) {
        return new JSONException(info(str), exc);
    }

    public final JSONException error(String str) {
        return new JSONException(info(str));
    }

    public final JSONException error(int i10, int i11) {
        throw new JSONValidException("error, offset " + i10 + ", char " + ((char) i11));
    }

    public final void addResolveTask(Object[] objArr, int i10, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(null, objArr, Integer.valueOf(i10), jSONPath));
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Context {
        Supplier<List> arraySupplier;
        AutoTypeBeforeHandler autoTypeBeforeHandler;
        int bufferSize;
        String dateFormat;
        DateTimeFormatter dateFormatter;
        ExtraProcessor extraProcessor;
        long features;
        boolean formatComplex;
        boolean formatHasDay;
        boolean formatHasHour;
        boolean formatISO8601;
        boolean formatMillis;
        boolean formatUnixTime;
        boolean formatyyyyMMdd8;
        boolean formatyyyyMMddhhmmss19;
        boolean formatyyyyMMddhhmmssT19;
        Locale locale;
        int maxLevel;
        Supplier<Map> objectSupplier;
        final ObjectReaderProvider provider;
        final SymbolTable symbolTable;
        TimeZone timeZone;
        boolean useSimpleFormatter;
        boolean yyyyMMddhhmm16;
        ZoneId zoneId;

        public Context(String str, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = JSONFactory.getDefaultObjectReaderProvider();
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str2 = JSONFactory.defaultReaderFormat;
            if (str2 != null) {
                setDateFormat(str2);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
            setDateFormat(str);
        }

        public void config(Filter[] filterArr, Feature... featureArr) {
            for (Filter filter : filterArr) {
                if (filter instanceof AutoTypeBeforeHandler) {
                    this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
                }
                if (filter instanceof ExtraProcessor) {
                    this.extraProcessor = (ExtraProcessor) filter;
                }
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Supplier<List> getArraySupplier() {
            return this.arraySupplier;
        }

        public int getBufferSize() {
            return this.bufferSize;
        }

        public AutoTypeBeforeHandler getContextAutoTypeBeforeHandler() {
            return this.autoTypeBeforeHandler;
        }

        public String getDateFormat() {
            return this.dateFormat;
        }

        public DateTimeFormatter getDateFormatter() {
            String str;
            if (this.dateFormatter == null && (str = this.dateFormat) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
                Locale locale = this.locale;
                this.dateFormatter = locale == null ? DateTimeFormatter.ofPattern(str) : DateTimeFormatter.ofPattern(str, locale);
            }
            return this.dateFormatter;
        }

        public ExtraProcessor getExtraProcessor() {
            return this.extraProcessor;
        }

        public long getFeatures() {
            return this.features;
        }

        public Locale getLocale() {
            return this.locale;
        }

        public int getMaxLevel() {
            return this.maxLevel;
        }

        public ObjectReader getObjectReader(Type type) {
            return this.provider.getObjectReader(type, (this.features & Feature.FieldBased.mask) != 0);
        }

        public ObjectReader getObjectReaderAutoType(String str, Class cls) {
            Class<?> clsApply;
            AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (autoTypeBeforeHandler == null || (clsApply = autoTypeBeforeHandler.apply(str, (Class<?>) cls, this.features)) == null) {
                return this.provider.getObjectReader(str, cls, this.features);
            }
            return this.provider.getObjectReader(clsApply, (this.features & Feature.FieldBased.mask) != 0);
        }

        public Supplier<Map> getObjectSupplier() {
            return this.objectSupplier;
        }

        public ObjectReaderProvider getProvider() {
            return this.provider;
        }

        public TimeZone getTimeZone() {
            return this.timeZone;
        }

        public ZoneId getZoneId() {
            if (this.zoneId == null) {
                this.zoneId = DateUtils.DEFAULT_ZONE_ID;
            }
            return this.zoneId;
        }

        public boolean isEnabled(Feature feature) {
            return (this.features & feature.mask) != 0;
        }

        public boolean isFormatHasHour() {
            return this.formatHasHour;
        }

        public boolean isFormatISO8601() {
            return this.formatISO8601;
        }

        public boolean isFormatMillis() {
            return this.formatMillis;
        }

        public boolean isFormatUnixTime() {
            return this.formatUnixTime;
        }

        public boolean isFormatyyyyMMdd8() {
            return this.formatyyyyMMdd8;
        }

        public boolean isFormatyyyyMMddhhmmss19() {
            return this.formatyyyyMMddhhmmss19;
        }

        public boolean isFormatyyyyMMddhhmmssT19() {
            return this.formatyyyyMMddhhmmssT19;
        }

        public void setArraySupplier(Supplier<List> supplier) {
            this.arraySupplier = supplier;
        }

        public Context setBufferSize(int i10) {
            if (i10 >= 0) {
                this.bufferSize = i10;
                return this;
            }
            C9987e.m38645a("buffer size can not be less than zero");
            return null;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void setDateFormat(String str) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            byte b10;
            boolean z15;
            if (str != null && str.isEmpty()) {
                str = null;
            }
            boolean z16 = false;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1172057030:
                        b10 = !str.equals("yyyy-MM-dd HH:mm") ? (byte) -1 : (byte) 0;
                        break;
                    case -1074095546:
                        b10 = !str.equals("millis") ? (byte) -1 : (byte) 1;
                        break;
                    case -347789785:
                        b10 = !str.equals("yyyyMMddHHmmssSSSZ") ? (byte) -1 : JSONReader.JSON_TYPE_DEC;
                        break;
                    case -288020395:
                        b10 = !str.equals("unixtime") ? (byte) -1 : JSONReader.JSON_TYPE_STRING;
                        break;
                    case -276306848:
                        b10 = !str.equals("yyyyMMdd") ? (byte) -1 : JSONReader.JSON_TYPE_BOOL;
                        break;
                    case -159776256:
                        b10 = !str.equals("yyyy-MM-dd") ? (byte) -1 : JSONReader.JSON_TYPE_NULL;
                        break;
                    case 1333195168:
                        b10 = !str.equals("yyyy-MM-dd HH:mm:ss") ? (byte) -1 : JSONReader.JSON_TYPE_OBJECT;
                        break;
                    case 1798231098:
                        b10 = !str.equals("yyyy-MM-dd'T'HH:mm:ss") ? (byte) -1 : JSONReader.JSON_TYPE_ARRAY;
                        break;
                    case 1834843604:
                        b10 = !str.equals("yyyy-MM-ddTHH:mm:ss") ? (byte) -1 : JSONReader.JSON_TYPE_BIG_DEC;
                        break;
                    case 2095190916:
                        b10 = !str.equals("iso8601") ? (byte) -1 : JSONReader.JSON_TYPE_INT8;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        this.yyyyMMddhhmm16 = true;
                        z15 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                        break;
                    case 1:
                        z15 = false;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                        z11 = true;
                        break;
                    case 2:
                        z15 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z14 = true;
                        break;
                    case 3:
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                        z15 = true;
                        break;
                    case 4:
                    case 5:
                        this.formatyyyyMMdd8 = true;
                        z15 = false;
                        z11 = false;
                        z13 = false;
                        z14 = false;
                        z12 = true;
                        break;
                    case 6:
                    case 8:
                        this.formatyyyyMMddhhmmss19 = true;
                        z15 = false;
                        z11 = false;
                        z14 = false;
                        z12 = true;
                        z13 = true;
                        break;
                    case 7:
                        this.formatyyyyMMddhhmmssT19 = true;
                        z15 = false;
                        z11 = false;
                        z14 = false;
                        z12 = true;
                        z13 = true;
                        break;
                    case 9:
                        z15 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                        z16 = true;
                        break;
                    default:
                        z14 = false;
                        z12 = str.indexOf(100) != -1;
                        z13 = (str.indexOf(72) == -1 && str.indexOf(Opcodes.IMUL) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) ? false : true;
                        z15 = false;
                        z11 = false;
                        break;
                }
                this.formatComplex = true ^ (((this.formatyyyyMMddhhmmss19 | this.formatyyyyMMddhhmmssT19) | this.formatyyyyMMdd8) | z16);
                boolean z17 = z15;
                z10 = z16;
                z16 = z17;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (!Objects.equals(this.dateFormat, str)) {
                this.dateFormatter = null;
            }
            this.dateFormat = str;
            this.formatUnixTime = z16;
            this.formatMillis = z11;
            this.formatISO8601 = z10;
            this.formatHasDay = z12;
            this.formatHasHour = z13;
            this.useSimpleFormatter = z14;
        }

        public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
            this.dateFormatter = dateTimeFormatter;
        }

        public void setExtraProcessor(ExtraProcessor extraProcessor) {
            this.extraProcessor = extraProcessor;
        }

        public void setFeatures(long j10) {
            this.features = j10;
        }

        public void setLocale(Locale locale) {
            this.locale = locale;
        }

        public void setMaxLevel(int i10) {
            this.maxLevel = i10;
        }

        public void setObjectSupplier(Supplier<Map> supplier) {
            this.objectSupplier = supplier;
        }

        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        public void setZoneId(ZoneId zoneId) {
            this.zoneId = zoneId;
        }

        public void config(Filter filter, Feature... featureArr) {
            if (filter instanceof AutoTypeBeforeHandler) {
                this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
            }
            if (filter instanceof ExtraProcessor) {
                this.extraProcessor = (ExtraProcessor) filter;
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public ObjectReader getObjectReaderAutoType(long j10) {
            return this.provider.getObjectReader(j10);
        }

        public ObjectReader getObjectReaderAutoType(String str, Class cls, long j10) {
            Class<?> clsApply;
            AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(str, (Class<?>) cls, j10)) != null) {
                return this.provider.getObjectReader(clsApply, (Feature.FieldBased.mask & j10) != 0);
            }
            return this.provider.getObjectReader(str, cls, j10 | this.features);
        }

        public void config(Filter filter) {
            if (filter instanceof AutoTypeBeforeHandler) {
                this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
            }
            if (filter instanceof ExtraProcessor) {
                this.extraProcessor = (ExtraProcessor) filter;
            }
        }

        public void config(Feature... featureArr) {
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public void config(Filter[] filterArr) {
            for (Filter filter : filterArr) {
                if (filter instanceof AutoTypeBeforeHandler) {
                    this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
                }
                if (filter instanceof ExtraProcessor) {
                    this.extraProcessor = (ExtraProcessor) filter;
                }
            }
        }

        public void config(Feature feature, boolean z10) {
            long j10 = this.features;
            if (z10) {
                this.features = feature.mask | j10;
            } else {
                this.features = (~feature.mask) & j10;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, long j10) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = j10;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public Context(Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = JSONFactory.getDefaultObjectReaderProvider();
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, Filter filter, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            config(filter);
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable, Filter[] filterArr, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            config(filterArr);
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }
    }

    public final String info() {
        return info(null);
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static JSONReader m6220of(Context context, byte[] bArr) {
        return JSONReaderUTF8.m6246of(bArr, 0, bArr.length, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6238of(byte[] bArr, Context context) {
        return JSONReaderUTF8.m6246of(bArr, 0, bArr.length, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6239of(char[] cArr) {
        return ofUTF16(null, cArr, 0, cArr.length, JSONFactory.createReadContext());
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static JSONReader m6221of(Context context, char[] cArr) {
        return ofUTF16(null, cArr, 0, cArr.length, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6242of(char[] cArr, Context context) {
        return ofUTF16(null, cArr, 0, cArr.length, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6236of(byte[] bArr, int i10, int i11, Charset charset) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        if (charset == StandardCharsets.UTF_8) {
            return JSONReaderUTF8.m6246of(bArr, i10, i11, contextCreateReadContext);
        }
        if (charset == StandardCharsets.UTF_16) {
            return ofUTF16(bArr, i10, i11, contextCreateReadContext);
        }
        if (charset != StandardCharsets.US_ASCII && charset != StandardCharsets.ISO_8859_1) {
            C1605j.m6294a("not support charset ", charset);
            return null;
        }
        return JSONReaderASCII.m6245of(contextCreateReadContext, (String) null, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6237of(byte[] bArr, int i10, int i11, Charset charset, Context context) {
        if (charset == StandardCharsets.UTF_8) {
            return JSONReaderUTF8.m6246of(bArr, i10, i11, context);
        }
        if (charset == StandardCharsets.UTF_16) {
            return ofUTF16(bArr, i10, i11, context);
        }
        if (charset != StandardCharsets.US_ASCII && charset != StandardCharsets.ISO_8859_1) {
            C1605j.m6294a("not support charset ", charset);
            return null;
        }
        return JSONReaderASCII.m6245of(context, (String) null, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6234of(byte[] bArr, int i10, int i11) {
        return m6237of(bArr, i10, i11, StandardCharsets.UTF_8, JSONFactory.createReadContext());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6235of(byte[] bArr, int i10, int i11, Context context) {
        return new JSONReaderUTF8(context, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6240of(char[] cArr, int i10, int i11) {
        return ofUTF16(null, cArr, i10, i11, JSONFactory.createReadContext());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6241of(char[] cArr, int i10, int i11, Context context) {
        return ofUTF16(null, cArr, i10, i11, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6230of(URL url, Context context) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            JSONReader jSONReaderM6223of = m6223of(inputStreamOpenStream, StandardCharsets.UTF_8, context);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return jSONReaderM6223of;
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6222of(InputStream inputStream, Charset charset) {
        return m6223of(inputStream, charset, JSONFactory.createReadContext());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6223of(InputStream inputStream, Charset charset, Context context) {
        if (inputStream != null) {
            if (charset != StandardCharsets.UTF_8 && charset != null) {
                if (charset == StandardCharsets.UTF_16) {
                    return new JSONReaderUTF16(context, inputStream);
                }
                if (charset == StandardCharsets.US_ASCII) {
                    return JSONReaderASCII.m6244of(context, inputStream);
                }
                return m6225of(new InputStreamReader(inputStream, charset), context);
            }
            return new JSONReaderUTF8(context, inputStream);
        }
        C1569c.m6258a("inputStream is null");
        return null;
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6224of(Reader reader) {
        return new JSONReaderUTF16(JSONFactory.createReadContext(), reader);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6225of(Reader reader, Context context) {
        return new JSONReaderUTF16(context, reader);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6231of(ByteBuffer byteBuffer, Charset charset) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        if (charset != StandardCharsets.UTF_8 && charset != null) {
            C1605j.m6294a("not support charset ", charset);
            return null;
        }
        return new JSONReaderUTF8(contextCreateReadContext, byteBuffer);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6232of(ByteBuffer byteBuffer, Charset charset, Context context) {
        if (charset != StandardCharsets.UTF_8 && charset != null) {
            C1605j.m6294a("not support charset ", charset);
            return null;
        }
        return new JSONReaderUTF8(context, byteBuffer);
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static JSONReader m6219of(Context context, String str) {
        return m6229of(str, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6226of(String str) {
        return m6229of(str, JSONFactory.createReadContext());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6233of(byte[] bArr) {
        return m6237of(bArr, 0, bArr.length, StandardCharsets.UTF_8, JSONFactory.createReadContext());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6227of(String str, int i10, int i11) {
        return m6228of(str, i10, i11, JSONFactory.createReadContext());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m6228of(String str, int i10, int i11, Context context) {
        char[] charArray;
        ToIntFunction<String> toIntFunction;
        if (str != null && context != null) {
            Function<String, byte[]> function = JDKUtils.STRING_VALUE;
            if (function != null && (toIntFunction = JDKUtils.STRING_CODER) != null) {
                try {
                    if (toIntFunction.applyAsInt(str) == 0) {
                        return JSONReaderASCII.m6245of(context, str, function.apply(str), i10, i11);
                    }
                } catch (Exception unused) {
                    C1569c.m6258a("unsafe get String.coder error");
                    return null;
                }
            }
            if (JDKUtils.JVM_VERSION == 8) {
                charArray = JDKUtils.getCharArray(str);
            } else {
                charArray = str.toCharArray();
            }
            return ofUTF16(str, charArray, i10, i11, context);
        }
        throw null;
    }

    public final Object[] readArray(Type[] typeArr) {
        char c10;
        if (nextIfNull()) {
            return null;
        }
        if (nextIfArrayStart()) {
            int length = typeArr.length;
            Object[] objArr = new Object[length];
            int i10 = 0;
            while (!nextIfArrayEnd() && i10 < length) {
                int i11 = this.offset;
                Object obj = read(typeArr[i10]);
                if (i11 != this.offset && (c10 = this.f4541ch) != '}' && c10 != 26) {
                    objArr[i10] = obj;
                    i10++;
                } else {
                    C1612m0.m6300a("illegal input : ", this.f4541ch, getOffset());
                    return null;
                }
            }
            if (i10 == length) {
                boolean z10 = this.f4541ch == ',';
                this.comma = z10;
                if (z10) {
                    next();
                }
                return objArr;
            }
            C1569c.m6258a(info("element length mismatch"));
            return null;
        }
        C1569c.m6258a(info("syntax error"));
        return null;
    }

    public final void bigInt(byte[] bArr, int i10, int i11) {
        int i12;
        long j10;
        long j11;
        long j12;
        int i13 = i11 - i10;
        if (this.scale > 0) {
            i13--;
        }
        if (i13 <= 38) {
            int i14 = i13 % 9;
            int i15 = i10 + (i14 != 0 ? i14 : 9);
            int i16 = i10 + 1;
            char c10 = (char) bArr[i10];
            if (c10 == '.') {
                c10 = (char) bArr[i16];
                i16 = i10 + 2;
                i12 = i15 + 1;
            } else {
                i12 = i15;
            }
            int i17 = c10 - '0';
            while (i16 < i15) {
                char c11 = (char) bArr[i16];
                if (c11 == '.') {
                    i16++;
                    c11 = (char) bArr[i16];
                    i12++;
                    if (i15 < i11) {
                        i15++;
                    }
                }
                i17 = (i17 * 10) + (c11 - '0');
                i16++;
            }
            this.mag3 = i17;
            while (i12 < i11) {
                int i18 = i12 + 9;
                int i19 = i12 + 1;
                char c12 = (char) bArr[i12];
                if (c12 == '.') {
                    int i20 = i12 + 2;
                    c12 = (char) bArr[i19];
                    i12 += 10;
                    i19 = i20;
                    i18 = i12;
                } else {
                    i12 = i18;
                }
                int i21 = c12 - '0';
                while (i19 < i18) {
                    char c13 = (char) bArr[i19];
                    if (c13 == '.') {
                        i19++;
                        c13 = (char) bArr[i19];
                        i12++;
                        i18++;
                    }
                    i21 = (i21 * 10) + (c13 - '0');
                    i19++;
                }
                long j13 = 4294967295L;
                long j14 = ((long) i21) & 4294967295L;
                long j15 = 0;
                int i22 = 3;
                while (i22 >= 0) {
                    if (i22 == 0) {
                        j11 = j13;
                        j12 = (1000000000 * (((long) this.mag0) & j11)) + j15;
                        this.mag0 = (int) j12;
                    } else if (i22 == 1) {
                        j11 = j13;
                        j12 = (1000000000 * (((long) this.mag1) & j11)) + j15;
                        this.mag1 = (int) j12;
                    } else if (i22 == 2) {
                        j11 = j13;
                        j12 = (1000000000 * (((long) this.mag2) & j11)) + j15;
                        this.mag2 = (int) j12;
                    } else if (i22 == 3) {
                        j11 = j13;
                        j12 = (1000000000 * (((long) this.mag3) & j11)) + j15;
                        this.mag3 = (int) j12;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j15 = j12 >>> 32;
                    i22--;
                    j13 = j11;
                }
                long j16 = j13;
                long j17 = (((long) this.mag3) & j16) + j14;
                this.mag3 = (int) j17;
                long j18 = j17 >>> 32;
                for (int i23 = 2; i23 >= 0; i23--) {
                    if (i23 == 0) {
                        j10 = (((long) this.mag0) & j16) + j18;
                        this.mag0 = (int) j10;
                    } else if (i23 == 1) {
                        j10 = (((long) this.mag1) & j16) + j18;
                        this.mag1 = (int) j10;
                    } else if (i23 == 2) {
                        j10 = (((long) this.mag2) & j16) + j18;
                        this.mag2 = (int) j10;
                    } else if (i23 == 3) {
                        j10 = (((long) this.mag3) & j16) + j18;
                        this.mag3 = (int) j10;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j18 = j10 >>> 32;
                }
            }
            return;
        }
        C1569c.m6258a("number too large : ".concat(new String(bArr, i10, i13)));
    }

    public final void readArray(List list, Type type) {
        readArray((Collection) list, type);
    }

    public void readArray(Collection collection, Type type) {
        if (nextIfArrayStart()) {
            while (!nextIfArrayEnd()) {
                collection.add(read(type));
            }
            return;
        }
        if (isString()) {
            String string = readString();
            if (type != String.class) {
                Function typeConvert = this.context.getProvider().getTypeConvert(String.class, type);
                if (typeConvert == null) {
                    C1569c.m6258a(info("not support input " + string));
                    return;
                } else if (string.indexOf(44) != -1) {
                    for (String str : string.split(",")) {
                        collection.add(typeConvert.apply(str));
                    }
                } else {
                    collection.add(typeConvert.apply(string));
                }
            } else {
                collection.add(string);
            }
        } else {
            collection.add(read(type));
        }
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
    }

    /* JADX WARN: Type update failed for variable: r12v0 'this'  ??, new type: com.alibaba.fastjson2.JSONReader
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 1851. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r12v0 'this'  ??, new type: com.alibaba.fastjson2.JSONReader
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 1851. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    public List readArray(Type type) {
        JSONReader jSONReader;
        JSONReader jSONReader2;
        Object object;
        char c10;
        if (nextIfNull()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char c11 = this.f4541ch;
        if (c11 == '[') {
            next();
            Context context = this.context;
            ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & Feature.FieldBased.mask) != 0);
            int i10 = 0;
            while (!nextIfArrayEnd()) {
                int i11 = this.offset;
                if (isReference()) {
                    String reference = readReference();
                    if ("..".equals(reference)) {
                        object = arrayList;
                    } else {
                        addResolveTask(arrayList, i10, JSONPath.m6205of(reference));
                        object = null;
                    }
                    jSONReader2 = this;
                } else {
                    jSONReader2 = this;
                    object = objectReader.readObject(jSONReader2, null, null, 0L);
                }
                arrayList.add(object);
                if (i11 == jSONReader2.offset || (c10 = jSONReader2.f4541ch) == '}' || c10 == 26) {
                    C1612m0.m6300a("illegal input : ", jSONReader2.f4541ch, getOffset());
                    return null;
                }
                i10++;
            }
            jSONReader = this;
        } else {
            jSONReader = this;
            if (c11 != '\"' && c11 != '\'' && c11 != '{') {
                C1569c.m6258a(info("syntax error"));
                return null;
            }
            String string = readString();
            if (string != null && !string.isEmpty()) {
                arrayList.add(string);
            }
        }
        boolean z10 = jSONReader.f4541ch == ',';
        jSONReader.comma = z10;
        if (z10) {
            next();
        }
        return arrayList;
    }

    public final void readObject(Object obj, long j10) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Context context = this.context;
            ObjectReader objectReader = context.provider.getObjectReader(cls, ((context.features | j10) & Feature.FieldBased.mask) != 0);
            if (objectReader instanceof ObjectReaderBean) {
                ((ObjectReaderBean) objectReader).readObject(this, obj, j10);
                return;
            } else if (obj instanceof Map) {
                read((Map) obj, j10);
                return;
            } else {
                C1569c.m6258a("read object not support");
                return;
            }
        }
        C1569c.m6258a("object is null");
    }

    public final void readObject(Object obj, Feature... featureArr) {
        long j10 = 0;
        for (Feature feature : featureArr) {
            j10 |= feature.mask;
        }
        readObject(obj, j10);
    }

    public final void read(List list) {
        if (nextIfArrayStart()) {
            int i10 = this.level + 1;
            this.level = i10;
            if (i10 < this.context.maxLevel) {
                while (!nextIfArrayEnd()) {
                    list.add(ObjectReaderImplObject.INSTANCE.readObject(this, null, null, 0L));
                    nextIfComma();
                }
                this.level--;
                nextIfComma();
                return;
            }
            C1606j0.m6295a("level too large : ", this.level);
            return;
        }
        C1610l0.m6298a("illegal input, offset ", this.offset, this.f4541ch);
    }

    public final void read(Collection collection) {
        if (nextIfArrayStart()) {
            int i10 = this.level + 1;
            this.level = i10;
            if (i10 < this.context.maxLevel) {
                while (!nextIfArrayEnd()) {
                    collection.add(readAny());
                    nextIfComma();
                }
                this.level--;
                nextIfComma();
                return;
            }
            C1606j0.m6295a("level too large : ", this.level);
            return;
        }
        C1610l0.m6298a("illegal input, offset ", this.offset, this.f4541ch);
    }

    public void read(Map map, ObjectReader objectReader, long j10) {
        Object objPut;
        nextIfObjectStart();
        Map map2 = map instanceof Wrapper ? (Map) ((Wrapper) map).unwrap(Map.class) : map;
        long features = this.context.getFeatures() | j10;
        int i10 = 0;
        while (true) {
            if (this.f4541ch == '/') {
                skipComment();
            }
            if (nextIfObjectEnd()) {
                nextIfComma();
                return;
            }
            if (i10 != 0 && !this.comma) {
                C1569c.m6258a(info());
                return;
            }
            String fieldName = readFieldName();
            Object object = objectReader.readObject(this, objectReader.getObjectClass(), fieldName, j10);
            if ((object != null || (Feature.IgnoreNullPropertyValue.mask & features) == 0) && (((Feature.SupportAutoType.mask & features) == 0 || !fieldName.equals("@type") || !map.getClass().getName().equals(object)) && (objPut = map2.put(fieldName, object)) != null && (Feature.DuplicateKeyValueAsArray.mask & features) != 0)) {
                if (objPut instanceof Collection) {
                    ((Collection) objPut).add(object);
                    map2.put(fieldName, objPut);
                } else {
                    map2.put(fieldName, JSONArray.m6186of(objPut, object));
                }
            }
            i10++;
        }
    }

    public <T> T read(Type type) {
        Context context = this.context;
        return (T) context.provider.getObjectReader(type, (context.features & Feature.FieldBased.mask) != 0).readObject(this, null, null, 0L);
    }

    public final void read(Map map, Type type, Type type2, long j10) {
        Object object;
        ObjectReader objectReader;
        Object objPut;
        if (nextIfObjectStart()) {
            ObjectReader objectReader2 = this.context.getObjectReader(type);
            ObjectReader objectReader3 = this.context.getObjectReader(type2);
            long features = j10 | this.context.getFeatures();
            int i10 = 0;
            while (true) {
                if (this.f4541ch == '/') {
                    skipComment();
                }
                if (nextIfObjectEnd()) {
                    nextIfComma();
                    return;
                }
                if (i10 != 0 && !this.comma) {
                    C1569c.m6258a(info());
                    return;
                }
                if (type == String.class) {
                    object = readFieldName();
                    objectReader = objectReader2;
                } else {
                    object = objectReader2.readObject(this, null, null, 0L);
                    objectReader = objectReader2;
                    nextIfMatch(':');
                }
                Object obj = object;
                ObjectReader objectReader4 = objectReader3;
                Object object2 = objectReader4.readObject(this, null, null, 0L);
                if ((object2 != null || (Feature.IgnoreNullPropertyValue.mask & features) == 0) && (((Feature.SupportAutoType.mask & features) == 0 || !obj.equals("@type") || !map.getClass().getName().equals(object2)) && (objPut = map.put(obj, object2)) != null && (Feature.DuplicateKeyValueAsArray.mask & features) != 0)) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(object2);
                        map.put(obj, objPut);
                    } else {
                        map.put(obj, JSONArray.m6186of(objPut, object2));
                    }
                }
                i10++;
                objectReader3 = objectReader4;
                objectReader2 = objectReader;
            }
        } else {
            C1610l0.m6298a("illegal input， offset ", this.offset, this.f4541ch);
        }
    }

    public <T> T read(Class<T> cls) {
        Context context = this.context;
        return (T) context.provider.getObjectReader(cls, (context.features & Feature.FieldBased.mask) != 0).readObject(this, null, null, 0L);
    }
}
