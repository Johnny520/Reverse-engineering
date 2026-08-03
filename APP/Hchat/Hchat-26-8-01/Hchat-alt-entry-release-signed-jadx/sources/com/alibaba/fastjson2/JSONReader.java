package com.alibaba.fastjson2;

import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderImplObject;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.ReferenceKey;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p221ws.RealWebSocket;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONReader implements Closeable {
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
    protected static final long MASK_DISABLE_REFERENCE_DETECT = 8589934592L;
    static final int MAX_EXP = 2047;
    static final long SPACE = 4294981377L;
    protected boolean boolValue;

    /* JADX INFO: renamed from: ch */
    protected char f1929ch;
    protected boolean comma;
    protected Object complex;
    public final Context context;
    protected char[] doubleChars;
    protected short exponent;
    public final boolean jsonb;
    protected int level;
    protected int mag0;
    protected int mag1;
    protected int mag2;
    protected int mag3;
    protected boolean nameEscape;
    protected boolean negative;
    protected int offset;
    List<ResolveTask> resolveTasks;
    protected short scale;
    protected String stringValue;
    protected boolean typeRedirect;
    protected boolean valueEscape;
    protected byte valueType;
    protected boolean wasNull;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface AutoTypeBeforeHandler extends Filter {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        default Class<?> apply(long j3, Class<?> cls, long j4) {
            return null;
        }

        Class<?> apply(String str, Class<?> cls, long j3);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class BigIntegerCreator implements BiFunction<Integer, int[], BigInteger> {
        static final BiFunction<Integer, int[], BigInteger> BIG_INTEGER_CREATOR = new BigIntegerCreator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
        @Override // java.util.function.BiFunction
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BigInteger apply(Integer num, int[] iArr) {
            int length;
            int iIntValue = num.intValue();
            if (iArr.length == 0) {
                length = 0;
            } else {
                length = ((iArr.length - 1) << 5) + (32 - Integer.numberOfLeadingZeros(iArr[0]));
                if (iIntValue < 0) {
                    boolean z9 = Integer.bitCount(iArr[0]) == 1;
                    for (int i9 = 1; i9 < iArr.length && z9; i9++) {
                        z9 = iArr[i9] == 0;
                    }
                    if (z9) {
                        length--;
                    }
                }
            }
            int i10 = length / 8;
            byte[] bArr = new byte[i10 + 1];
            int i11 = 0;
            int i12 = 0;
            int i13 = 4;
            while (i10 >= 0) {
                if (i13 == 4) {
                    int i14 = i12 + 1;
                    if (i12 >= 0) {
                        if (i12 >= iArr.length) {
                            i11 = iIntValue < 0 ? -1 : 0;
                        } else {
                            i11 = iArr[(iArr.length - i12) - 1];
                            if (iIntValue < 0) {
                                int length2 = iArr.length;
                                int i15 = length2 - 1;
                                while (i15 >= 0 && iArr[i15] == 0) {
                                    i15--;
                                }
                                i11 = i12 <= (length2 - i15) - 1 ? -i11 : ~i11;
                            }
                        }
                        i12 = i14;
                        i13 = 1;
                    }
                } else {
                    i11 >>>= 8;
                    i13++;
                }
                bArr[i10] = (byte) i11;
                i10--;
            }
            return new BigInteger(bArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ResolveTask {
        final FieldReader fieldReader;
        final Object name;
        final Object object;
        final JSONPath reference;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ResolveTask(FieldReader fieldReader, Object obj, Object obj2, JSONPath jSONPath) {
            this.fieldReader = fieldReader;
            this.object = obj;
            this.name = obj2;
            this.reference = jSONPath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return this.reference.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class SavePoint {
        protected final int current;
        protected final int offset;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavePoint(int i9, int i10) {
            this.offset = i9;
            this.current = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean[] zArr = new boolean[Opcodes.ACC_NATIVE];
        INT_VALUE_END = zArr;
        Arrays.fill(zArr, true);
        char[] cArr = {'.', 'e', 'E', 't', 'f', 'n', '{', '[', '0', '1', '2', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i9 = 0; i9 < 19; i9++) {
            INT_VALUE_END[cArr[i9]] = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONReader(Context context, boolean z9) {
        this.context = context;
        this.jsonb = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void add(List<Object> list, int i9, Object obj) {
        if (!(obj instanceof JSONPath)) {
            list.add(obj);
        } else {
            addResolveTask(list, i9, (JSONPath) obj);
            list.add(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AutoTypeBeforeHandler autoTypeFilter(String... strArr) {
        return new ContextAutoTypeBeforeHandler(strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static char char2(int i9, int i10) {
        int[] iArr = JSONFactory.DIGITS2;
        return (char) ((iArr[i9] << 4) + iArr[i10]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static char char4(int i9, int i10, int i11, int i12) {
        int[] iArr = JSONFactory.DIGITS2;
        return (char) ((iArr[i9] << 12) + (iArr[i10] << 8) + (iArr[i11] << 4) + iArr[i12]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isFirstIdentifier(int i9) {
        if (i9 >= 65 && i9 <= 90) {
            return true;
        }
        if ((i9 >= 97 && i9 <= 122) || i9 == 95 || i9 == 36) {
            return true;
        }
        return (i9 >= 48 && i9 <= 57) || i9 > 127;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static JSONReader m1677of(byte[] bArr, int i9, int i10, Charset charset, Context context) {
        return charset == StandardCharsets.UTF_8 ? new JSONReaderUTF8(context, null, bArr, i9, i10) : charset == StandardCharsets.UTF_16 ? new JSONReaderUTF16(context, bArr, i9, i10) : (charset == StandardCharsets.US_ASCII || charset == StandardCharsets.ISO_8859_1) ? new JSONReaderASCII(context, null, bArr, i9, i10) : m1669of(new String(bArr, i9, i10, charset), context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONReader ofJSONB(byte[] bArr, Feature... featureArr) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        contextCreateReadContext.config(featureArr);
        return new JSONReaderJSONB(contextCreateReadContext, bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONException syntaxError(int i9) {
        return new JSONException("syntax error, expect ',', but '" + ((char) i9) + "'");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addResolveTask(Map map, Object obj, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.resolveTasks.add(new ResolveTask(null, map, obj, jSONPath));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void bigInt(char[] cArr, int i9, int i10) {
        int i11;
        long j3;
        char c10;
        long j4;
        int i12 = i10 - i9;
        if (this.scale > 0) {
            i12--;
        }
        if (i12 > 38) {
            C0086a.m464w("number too large : ".concat(new String(cArr, i9, i12)));
            return;
        }
        int i13 = i12 % 9;
        int i14 = i9 + (i13 != 0 ? i13 : 9);
        int i15 = i9 + 1;
        char c11 = cArr[i9];
        if (c11 == '.') {
            c11 = cArr[i15];
            i15 = i9 + 2;
            i11 = i14 + 1;
        } else {
            i11 = i14;
        }
        int i16 = c11 - '0';
        while (i15 < i14) {
            char c12 = cArr[i15];
            if (c12 == '.') {
                i15++;
                c12 = cArr[i15];
                i11++;
                if (i14 < i10) {
                    i14++;
                }
            }
            i16 = (i16 * 10) + (c12 - '0');
            i15++;
        }
        this.mag3 = i16;
        while (i11 < i10) {
            int i17 = i11 + 9;
            int i18 = i11 + 1;
            char c13 = cArr[i11];
            if (c13 == '.') {
                int i19 = i11 + 2;
                c13 = cArr[i18];
                i11 += 10;
                i18 = i19;
                i17 = i11;
            } else {
                i11 = i17;
            }
            int i20 = c13 - '0';
            while (i18 < i17) {
                char c14 = cArr[i18];
                if (c14 == '.') {
                    i18++;
                    c14 = cArr[i18];
                    i11++;
                    i17++;
                }
                i20 = (i20 * 10) + (c14 - '0');
                i18++;
            }
            long j5 = 0;
            for (int i21 = 3; i21 >= 0; i21--) {
                if (i21 == 0) {
                    c10 = ' ';
                    j4 = j5 + (1000000000 * (((long) this.mag0) & 4294967295L));
                    this.mag0 = (int) j4;
                } else if (i21 == 1) {
                    c10 = ' ';
                    j4 = j5 + (1000000000 * (((long) this.mag1) & 4294967295L));
                    this.mag1 = (int) j4;
                } else if (i21 == 2) {
                    c10 = ' ';
                    j4 = j5 + (1000000000 * (((long) this.mag2) & 4294967295L));
                    this.mag2 = (int) j4;
                } else {
                    if (i21 != 3) {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    c10 = ' ';
                    j4 = j5 + (1000000000 * (((long) this.mag3) & 4294967295L));
                    this.mag3 = (int) j4;
                }
                j5 = j4 >>> c10;
            }
            long j10 = (((long) this.mag3) & 4294967295L) + (((long) i20) & 4294967295L);
            this.mag3 = (int) j10;
            long j11 = j10 >>> 32;
            for (int i22 = 2; i22 >= 0; i22--) {
                if (i22 == 0) {
                    j3 = (((long) this.mag0) & 4294967295L) + j11;
                    this.mag0 = (int) j3;
                } else if (i22 == 1) {
                    j3 = (((long) this.mag1) & 4294967295L) + j11;
                    this.mag1 = (int) j3;
                } else if (i22 == 2) {
                    j3 = (((long) this.mag2) & 4294967295L) + j11;
                    this.mag2 = (int) j3;
                } else {
                    if (i22 != 3) {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j3 = (((long) this.mag3) & 4294967295L) + j11;
                    this.mag3 = (int) j3;
                }
                j11 = j3 >>> 32;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final char char1(int i9) {
        if (i9 != 34 && i9 != 35 && i9 != 64) {
            if (i9 == 70) {
                return '\f';
            }
            if (i9 != 95) {
                if (i9 == 98) {
                    return '\b';
                }
                if (i9 == 102) {
                    return '\f';
                }
                if (i9 == 110) {
                    return '\n';
                }
                if (i9 == 114) {
                    return '\r';
                }
                if (i9 == 116) {
                    return '\t';
                }
                if (i9 == 118) {
                    return (char) 11;
                }
                switch (i9) {
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        break;
                    default:
                        switch (i9) {
                            case 46:
                            case 47:
                                break;
                            case 48:
                                return (char) 0;
                            case 49:
                                return (char) 1;
                            case 50:
                                return (char) 2;
                            case 51:
                                return (char) 3;
                            case 52:
                                return (char) 4;
                            case 53:
                                return (char) 5;
                            case 54:
                                return (char) 6;
                            case 55:
                                return (char) 7;
                            default:
                                switch (i9) {
                                    case 91:
                                    case 92:
                                    case 93:
                                        break;
                                    default:
                                        C0086a.m464w(info("unclosed.str '\\" + ((char) i9)));
                                        return (char) 0;
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return (char) i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader checkAutoType(Class cls, long j3, long j4) {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final char current() {
        return this.f1929ch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BigDecimal decimal(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        C0086a.m463v(jSONObject, "can not cast to decimal ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void endArray() {
        next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONException error() {
        return new JSONException(info("illegal ch " + this.f1929ch));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void errorOnNoneSerializable(Class cls) {
        if ((this.context.features & Feature.ErrorOnNoneSerializable.mask) == 0 || Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        C0086a.m464w("not support none-Serializable, class ".concat(cls.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long features(long j3) {
        return j3 | this.context.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BigDecimal getBigDecimal() {
        int[] iArr;
        int i9;
        BigDecimal bigDecimal;
        int[] iArr2;
        int[] iArr3;
        int i10;
        if (this.wasNull) {
            return null;
        }
        byte b10 = this.valueType;
        if (b10 == 1) {
            int i11 = this.mag1;
            if (i11 == 0 && this.mag2 == 0 && (i9 = this.mag3) >= 0) {
                return BigDecimal.valueOf(this.negative ? -i9 : i9);
            }
            int i12 = this.mag0;
            if (i12 != 0) {
                iArr = new int[]{i12, i11, this.mag2, this.mag3};
            } else if (i11 == 0) {
                int i13 = this.mag3;
                long j3 = ((long) i13) & 4294967295L;
                int i14 = this.mag2;
                long j4 = 4294967295L & ((long) i14);
                if (j4 <= 2147483647L) {
                    long j5 = (j4 << 32) + j3;
                    if (this.negative) {
                        j5 = -j5;
                    }
                    return BigDecimal.valueOf(j5);
                }
                iArr = new int[]{i14, i13};
            } else {
                iArr = new int[]{i11, this.mag2, this.mag3};
            }
            return new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr));
        }
        if (b10 != 2) {
            if (b10 == 3) {
                try {
                    return TypeUtils.toBigDecimal(this.stringValue);
                } catch (NumberFormatException e6) {
                    C0086a.m465x(info("read decimal error, value " + this.stringValue), e6);
                    return null;
                }
            }
            if (b10 == 4) {
                return this.boolValue ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            if (b10 != 6) {
                if (b10 == 8) {
                    return TypeUtils.toBigDecimal(this.stringValue);
                }
                C0086a.m466y(this.valueType, "TODO : ");
                return null;
            }
            JSONObject jSONObject = (JSONObject) this.complex;
            BigDecimal bigDecimal2 = jSONObject.getBigDecimal("value");
            if (bigDecimal2 == null) {
                bigDecimal2 = jSONObject.getBigDecimal("$numberDecimal");
            }
            if (bigDecimal2 != null) {
                return bigDecimal2;
            }
            C0086a.m466y(this.valueType, "TODO : ");
            return null;
        }
        if (this.exponent == 0 && this.mag0 == 0 && this.mag1 == 0) {
            int i15 = this.mag2;
            if (i15 != 0 || (i10 = this.mag3) < 0) {
                long j10 = ((long) this.mag3) & 4294967295L;
                long j11 = ((long) i15) & 4294967295L;
                if (j11 <= 2147483647L) {
                    long j12 = (j11 << 32) + j10;
                    if (this.negative) {
                        j12 = -j12;
                    }
                    bigDecimal = BigDecimal.valueOf(j12, this.scale);
                }
            } else {
                if (this.negative) {
                    i10 = -i10;
                }
                bigDecimal = BigDecimal.valueOf(i10, this.scale);
            }
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            int i16 = this.mag0;
            if (i16 == 0) {
                int i17 = this.mag1;
                if (i17 == 0) {
                    int i18 = this.mag2;
                    if (i18 == 0) {
                        iArr3 = new int[]{this.mag3};
                        bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(!this.negative ? -1 : 1), iArr3), this.scale);
                    } else {
                        iArr2 = new int[]{i18, this.mag3};
                    }
                } else {
                    iArr2 = new int[]{i17, this.mag2, this.mag3};
                }
            } else {
                iArr2 = new int[]{i16, this.mag1, this.mag2, this.mag3};
            }
            iArr3 = iArr2;
            bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(!this.negative ? -1 : 1), iArr3), this.scale);
        }
        if (this.exponent == 0) {
            return bigDecimal;
        }
        return TypeUtils.toBigDecimal(Double.parseDouble(bigDecimal.toPlainString() + "E" + ((int) this.exponent)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BigInteger getBigInteger() {
        Number number = getNumber();
        if (number == null) {
            return null;
        }
        return number instanceof BigInteger ? (BigInteger) number : BigInteger.valueOf(number.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double getDoubleValue() {
        int i9;
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0 && (i9 = this.mag3) != Integer.MIN_VALUE) {
                    return this.negative ? -i9 : i9;
                }
                Number number = getNumber();
                if (!(number instanceof BigInteger)) {
                    return number.doubleValue();
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
            case 11:
            case 12:
            case 13:
                return getNumber().doubleValue();
            case 3:
                try {
                    return TypeUtils.toDoubleValue(this.stringValue);
                } catch (NumberFormatException e6) {
                    C0086a.m464w(info(e6.getMessage()));
                    return 0.0d;
                }
            case 4:
                return this.boolValue ? 1.0d : 0.0d;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0086a.m464w(info("long value not support input null"));
                    return 0.0d;
                }
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
                } catch (ArithmeticException unused2) {
                    throw numberError();
                }
            case 14:
                return Double.NaN;
            default:
                C0086a.m466y(this.valueType, "TODO : ");
                return 0.0d;
        }
    }

    public abstract String getFieldName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getFloatValue() {
        return (float) getDoubleValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInt32Value() {
        int i9;
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0 && (i9 = this.mag3) != Integer.MIN_VALUE) {
                    return this.negative ? -i9 : i9;
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
                C0086a.m464w(info("integer overflow " + jLongValue));
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
                C0086a.m464w(info("int value not support input null"));
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
            case 11:
            case 12:
            case 13:
                long jLongValue2 = getNumber().longValue();
                if ((jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) || (this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return (int) jLongValue2;
                }
                C0086a.m464w(info("integer overflow " + jLongValue2));
                return 0;
            default:
                C0086a.m466y(this.valueType, "TODO : ");
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getInt64Value() {
        int i9;
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0 && (i9 = this.mag3) != Integer.MIN_VALUE) {
                    return this.negative ? -i9 : i9;
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
                return getNumber().longValue();
            case 3:
                return toInt64(this.stringValue);
            case 4:
                return this.boolValue ? 1L : 0L;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0086a.m464w(info("long value not support input null"));
                    return 0L;
                }
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
            case 11:
            case 12:
            case 13:
                return getNumber().longValue();
            default:
                C0086a.m466y(this.valueType, "TODO : ");
                return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Locale getLocale() {
        return this.context.getLocale();
    }

    public abstract long getNameHashCodeLCase();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Number getNumber() {
        int[] iArr;
        int i9;
        int i10;
        BigDecimal bigDecimalValueOf;
        int[] iArr2;
        int[] iArr3;
        int i11;
        int[] iArr4;
        int[] iArr5;
        byte b10;
        if (this.wasNull) {
            return null;
        }
        byte b11 = this.valueType;
        switch (b11) {
            case 1:
            case 11:
                int i12 = this.mag0;
                if (i12 != 0 || this.mag1 != 0 || this.mag2 != 0 || (i9 = this.mag3) == Integer.MIN_VALUE) {
                    if (i12 == 0) {
                        int i13 = this.mag1;
                        if (i13 == 0) {
                            int i14 = this.mag3;
                            long j3 = ((long) i14) & 4294967295L;
                            int i15 = this.mag2;
                            long j4 = ((long) i15) & 4294967295L;
                            if (j4 <= 2147483647L) {
                                long j5 = (j4 << 32) + j3;
                                if (this.negative) {
                                    j5 = -j5;
                                }
                                if ((this.context.features & Feature.UseBigIntegerForInts.mask) == 0) {
                                }
                            } else {
                                iArr = new int[]{i15, i14};
                            }
                        } else {
                            iArr = new int[]{i13, this.mag2, this.mag3};
                        }
                    } else {
                        iArr = new int[]{i12, this.mag1, this.mag2, this.mag3};
                    }
                    BigInteger bigIntegerApply = BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr);
                    if ((this.context.features & Feature.UseLongForInts.mask) != 0) {
                    }
                    break;
                } else {
                    if (!this.negative) {
                        if (i9 < 0) {
                            long j10 = ((long) i9) & 4294967295L;
                            if ((this.context.features & Feature.UseBigIntegerForInts.mask) == 0) {
                            }
                        }
                    } else if (i9 < 0) {
                        long j11 = -(((long) i9) & 4294967295L);
                        if ((this.context.features & Feature.UseBigIntegerForInts.mask) == 0) {
                        }
                    } else {
                        i9 = -i9;
                    }
                    long j12 = this.context.features;
                    if ((Feature.UseBigIntegerForInts.mask & j12) == 0) {
                        if ((j12 & Feature.UseLongForInts.mask) == 0) {
                            if (b11 != 11) {
                            }
                        }
                    }
                }
                break;
            case 2:
                if (this.mag0 == 0 && this.mag1 == 0) {
                    int i16 = this.mag2;
                    if (i16 != 0 || (i11 = this.mag3) < 0) {
                        i10 = 1;
                        long j13 = ((long) this.mag3) & 4294967295L;
                        long j14 = ((long) i16) & 4294967295L;
                        if (j14 <= 2147483647L) {
                            long j15 = (j14 << 32) + j13;
                            if (this.negative) {
                                j15 = -j15;
                            }
                            bigDecimalValueOf = BigDecimal.valueOf(j15, this.scale);
                        }
                    } else {
                        if (this.negative) {
                            i11 = -i11;
                        }
                        i10 = 1;
                        bigDecimalValueOf = BigDecimal.valueOf(i11, this.scale);
                    }
                    if (bigDecimalValueOf == null) {
                        int i17 = this.mag0;
                        if (i17 == 0) {
                            int i18 = this.mag1;
                            if (i18 == 0) {
                                iArr3 = new int[2];
                                iArr3[0] = this.mag2;
                                iArr3[i10] = this.mag3;
                                BigDecimal bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i10), iArr3), this.scale - this.exponent);
                                if (this.exponent != 0 || (this.context.features & (Feature.UseBigDecimalForDoubles.mask | Feature.UseBigDecimalForFloats.mask)) != 0) {
                                    bigDecimalValueOf = bigDecimal;
                                }
                            } else {
                                iArr2 = new int[3];
                                iArr2[0] = i18;
                                iArr2[i10] = this.mag2;
                                iArr2[2] = this.mag3;
                            }
                        } else {
                            iArr2 = new int[4];
                            iArr2[0] = i17;
                            iArr2[i10] = this.mag1;
                            iArr2[2] = this.mag2;
                            iArr2[3] = this.mag3;
                        }
                        iArr3 = iArr2;
                        BigDecimal bigDecimal2 = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i10), iArr3), this.scale - this.exponent);
                        if (this.exponent != 0) {
                        }
                        bigDecimalValueOf = bigDecimal2;
                    }
                    if (this.exponent == 0) {
                        String plainString = bigDecimalValueOf.toPlainString();
                        if ((this.context.features & (Feature.UseBigDecimalForDoubles.mask | Feature.UseBigDecimalForFloats.mask)) == 0) {
                            StringBuilder sbM1025n = AbstractC0255e.m1025n(plainString, "E");
                            sbM1025n.append((int) this.exponent);
                        } else if (bigDecimalValueOf.signum() != 0) {
                            StringBuilder sbM1025n2 = AbstractC0255e.m1025n(plainString, "E");
                            sbM1025n2.append((int) this.exponent);
                        }
                    } else if ((this.context.features & Feature.UseDoubleForDecimals.mask) != 0) {
                    }
                } else {
                    i10 = 1;
                }
                bigDecimalValueOf = null;
                if (bigDecimalValueOf == null) {
                }
                if (this.exponent == 0) {
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                short s10 = this.scale;
                if (s10 > 0) {
                    if (s10 > JSONFactory.defaultDecimalMaxScale) {
                        C0086a.m466y(this.scale, "scale overflow : ");
                    }
                }
                break;
            case 9:
                if (this.mag0 != 0 || this.mag1 != 0 || this.mag2 != 0 || (i = this.mag3) < 0) {
                    C0086a.m464w(info("shortValue overflow"));
                } else if (this.negative) {
                    int i19 = -i19;
                }
                break;
            case 10:
                if (this.mag0 != 0 || this.mag1 != 0 || this.mag2 != 0 || (i = this.mag3) < 0) {
                    C0086a.m464w(info("shortValue overflow"));
                } else if (this.negative) {
                    int i20 = -i20;
                }
                break;
            case 12:
            case 13:
                int i21 = this.mag0;
                if (i21 == 0) {
                    int i22 = this.mag1;
                    if (i22 == 0) {
                        int i23 = this.mag2;
                        if (i23 == 0) {
                            iArr5 = new int[]{this.mag3};
                            BigDecimal bigDecimal3 = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr5), this.scale);
                            b10 = this.valueType;
                            short s11 = this.exponent;
                            if (b10 == 12) {
                                if (s11 == 0) {
                                }
                            } else if (s11 == 0) {
                            }
                        } else {
                            iArr4 = new int[]{i23, this.mag3};
                        }
                    } else {
                        iArr4 = new int[]{i22, this.mag2, this.mag3};
                    }
                } else {
                    iArr4 = new int[]{i21, this.mag1, this.mag2, this.mag3};
                }
                iArr5 = iArr4;
                BigDecimal bigDecimal32 = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr5), this.scale);
                b10 = this.valueType;
                short s112 = this.exponent;
                if (b10 == 12) {
                }
                break;
            default:
                C0086a.m466y(this.valueType, "TODO : ");
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ObjectReader getObjectReader(Type type) {
        Context context = this.context;
        return context.provider.getObjectReader(type, (context.features & Feature.FieldBased.mask) != 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader getObjectReaderAutoType(long j3, Class cls, long j4) {
        Class<?> clsApply;
        ObjectReader objectReaderAutoType = this.context.getObjectReaderAutoType(j3);
        if (objectReaderAutoType != null) {
            return objectReaderAutoType;
        }
        String string = getString();
        AutoTypeBeforeHandler autoTypeBeforeHandler = this.context.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(string, (Class<?>) cls, j4)) != null) {
            return this.context.provider.getObjectReader(clsApply, (j4 & Feature.FieldBased.mask) != 0);
        }
        Context context = this.context;
        return context.provider.getObjectReader(string, cls, j4 | context.features);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getOffset() {
        return this.offset;
    }

    public abstract int getRawInt();

    public abstract long getRawLong();

    public abstract String getString();

    public abstract int getStringLength();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte getType() {
        return (byte) -128;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ZoneId getZoneId() {
        return this.context.getZoneId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleResolveTasks(Object obj) {
        if (this.resolveTasks == null) {
            return;
        }
        Object objEval = null;
        for (int i9 = 0; i9 < this.resolveTasks.size(); i9++) {
            ResolveTask resolveTask = this.resolveTasks.get(i9);
            JSONPath jSONPath = resolveTask.reference;
            FieldReader fieldReader = resolveTask.fieldReader;
            if (!jSONPath.previous) {
                Context context = this.context;
                jSONPath.readerContext = context;
                if ((context.features & Feature.FieldBased.mask) != 0) {
                    JSONWriter.Context contextCreateWriteContext = JSONFactory.createWriteContext();
                    contextCreateWriteContext.features |= JSONWriter.Feature.FieldBased.mask;
                    jSONPath.writerContext = contextCreateWriteContext;
                }
                objEval = jSONPath.eval(obj);
            }
            Object obj2 = resolveTask.name;
            Object obj3 = resolveTask.object;
            if (obj2 == null) {
                fieldReader.accept(obj3, objEval);
            } else if (obj3 instanceof Map) {
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
                    List list = (List) obj3;
                    if (iIntValue == list.size()) {
                        list.add(objEval);
                    } else if (iIntValue >= list.size() || list.get(iIntValue) != null) {
                        list.add(iIntValue, objEval);
                    } else {
                        list.set(iIntValue, objEval);
                    }
                } else if (obj3 instanceof Object[]) {
                    ((Object[]) obj3)[((Integer) obj2).intValue()] = objEval;
                } else if (obj3 instanceof Collection) {
                    ((Collection) obj3).add(objEval);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasComma() {
        return this.comma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String info(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.offset;
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, ", offset ");
        sbM1025n.append(this.offset);
        return sbM1025n.toString();
    }

    public abstract boolean isArray();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isBinary() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isDate() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEnabled(Feature feature) {
        return (this.context.features & feature.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isEnd() {
        return this.f1929ch == 26;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isInitStringFieldAsEmpty() {
        return (this.context.features & Feature.InitStringFieldAsEmpty.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isInt() {
        char c10 = this.f1929ch;
        if (c10 == '-' || c10 == '+') {
            return true;
        }
        return c10 >= '0' && c10 <= '9';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isJSONB() {
        return this.jsonb;
    }

    public abstract boolean isNull();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isNumber() {
        char c10 = this.f1929ch;
        if (c10 == '+' || c10 == '-') {
            return true;
        }
        switch (c10) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isObject() {
        return this.f1929ch == '{';
    }

    public abstract boolean isReference();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isString() {
        char c10 = this.f1929ch;
        return c10 == '\"' || c10 == '\'';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSupportAutoType(long j3) {
        return ((j3 | this.context.features) & Feature.SupportAutoType.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSupportAutoTypeOrHandler(long j3) {
        Context context = this.context;
        return (((j3 | context.features) & Feature.SupportAutoType.mask) == 0 && context.autoTypeBeforeHandler == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSupportBeanArray(long j3) {
        return ((j3 | this.context.features) & Feature.SupportArrayToBean.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSupportSmartMatch(long j3) {
        return ((j3 | this.context.features) & Feature.SupportSmartMatch.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isTypeRedirect() {
        return this.typeRedirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SavePoint mark() {
        return new SavePoint(this.offset, this.f1929ch);
    }

    public abstract void next();

    public abstract boolean nextIfArrayEnd();

    public abstract boolean nextIfArrayStart();

    public abstract boolean nextIfComma();

    public abstract boolean nextIfInfinity();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfMatch(byte b10) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean nextIfMatch(char c10);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12, char c13);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12, char c13, char c14);

    public abstract boolean nextIfMatchIdent(char c10, char c11, char c12, char c13, char c14, char c15);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfMatchTypedAny() {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean nextIfName4Match10(long j3);

    public abstract boolean nextIfName4Match11(long j3);

    public abstract boolean nextIfName4Match12(long j3, byte b10);

    public abstract boolean nextIfName4Match13(long j3, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName4Match14(long j3, int i9) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName4Match15(long j3, int i9) {
        return false;
    }

    public abstract boolean nextIfName4Match16(long j3, int i9, byte b10);

    public abstract boolean nextIfName4Match17(long j3, long j4);

    public abstract boolean nextIfName4Match18(long j3, long j4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName4Match19(long j3, long j4) {
        return false;
    }

    public abstract boolean nextIfName4Match2();

    public abstract boolean nextIfName4Match20(long j3, long j4, byte b10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName4Match21(long j3, long j4, int i9) {
        return false;
    }

    public abstract boolean nextIfName4Match22(long j3, long j4, int i9);

    public abstract boolean nextIfName4Match23(long j3, long j4, int i9);

    public abstract boolean nextIfName4Match24(long j3, long j4, int i9, byte b10);

    public abstract boolean nextIfName4Match25(long j3, long j4, long j5);

    public abstract boolean nextIfName4Match26(long j3, long j4, long j5);

    public abstract boolean nextIfName4Match27(long j3, long j4, long j5);

    public abstract boolean nextIfName4Match28(long j3, long j4, long j5, byte b10);

    public abstract boolean nextIfName4Match29(long j3, long j4, long j5, int i9);

    public abstract boolean nextIfName4Match3();

    public abstract boolean nextIfName4Match30(long j3, long j4, long j5, int i9);

    public abstract boolean nextIfName4Match31(long j3, long j4, long j5, int i9);

    public abstract boolean nextIfName4Match32(long j3, long j4, long j5, int i9, byte b10);

    public abstract boolean nextIfName4Match33(long j3, long j4, long j5, long j10);

    public abstract boolean nextIfName4Match34(long j3, long j4, long j5, long j10);

    public abstract boolean nextIfName4Match35(long j3, long j4, long j5, long j10);

    public abstract boolean nextIfName4Match36(long j3, long j4, long j5, long j10, byte b10);

    public abstract boolean nextIfName4Match37(long j3, long j4, long j5, long j10, int i9);

    public abstract boolean nextIfName4Match38(long j3, long j4, long j5, long j10, int i9);

    public abstract boolean nextIfName4Match39(long j3, long j4, long j5, long j10, int i9);

    public abstract boolean nextIfName4Match4(byte b10);

    public abstract boolean nextIfName4Match40(long j3, long j4, long j5, long j10, int i9, byte b10);

    public abstract boolean nextIfName4Match41(long j3, long j4, long j5, long j10, long j11);

    public abstract boolean nextIfName4Match42(long j3, long j4, long j5, long j10, long j11);

    public abstract boolean nextIfName4Match43(long j3, long j4, long j5, long j10, long j11);

    public abstract boolean nextIfName4Match5(int i9);

    public abstract boolean nextIfName4Match6(int i9);

    public abstract boolean nextIfName4Match7(int i9);

    public abstract boolean nextIfName4Match8(int i9, byte b10);

    public abstract boolean nextIfName4Match9(long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName8Match0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName8Match1() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfName8Match2() {
        return false;
    }

    public abstract boolean nextIfNull();

    public abstract boolean nextIfNullOrEmptyString();

    public abstract boolean nextIfObjectEnd();

    public abstract boolean nextIfObjectStart();

    public abstract boolean nextIfSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match10(long j3) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match11(long j3) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match2() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match3() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match4(byte b10) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match5(byte b10, byte b11) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match6(int i9) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match7(int i9) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match8(int i9, byte b10) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean nextIfValue4Match9(int i9, byte b10, byte b11) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void nextWithoutComment() {
        next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONException notSupportName() {
        return new JSONException(info("not support unquoted name"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONException numberError() {
        return new JSONException("illegal number, offset " + this.offset + ", char " + this.f1929ch);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void read(Map map, long j3) {
        boolean z9;
        boolean z10;
        Object fieldName;
        Object string;
        Object objPut;
        boolean zNextIfObjectStart = nextIfObjectStart();
        if (zNextIfObjectStart) {
            z9 = false;
        } else {
            boolean zIsTypeRedirect = isTypeRedirect();
            if (!zIsTypeRedirect) {
                if (isString() && readString().isEmpty()) {
                    return;
                }
                C0086a.m446e(this.offset, this.f1929ch, "illegal input， offset ");
                return;
            }
            setTypeRedirect(false);
            z9 = zIsTypeRedirect;
        }
        long j4 = j3 | this.context.features;
        int i9 = 0;
        while (true) {
            if (this.f1929ch == '/') {
                skipComment();
            }
            if (nextIfObjectEnd()) {
                nextIfComma();
                return;
            }
            if (i9 != 0 && !this.comma) {
                C0086a.m464w(info());
                return;
            }
            if (zNextIfObjectStart || z9) {
                char c10 = this.f1929ch;
                z10 = zNextIfObjectStart;
                fieldName = ((c10 < '0' || c10 > '9') && c10 != '-') ? readFieldName() : null;
            } else {
                fieldName = getFieldName();
                z10 = true;
            }
            if (fieldName == null) {
                if (isNumber()) {
                    fieldName = readNumber();
                    if ((Feature.NonStringKeyAsString.mask & j4) != 0) {
                        fieldName = fieldName.toString();
                    }
                    if (this.comma) {
                        C0086a.m464w(info("syntax error, illegal key-value"));
                        return;
                    }
                } else {
                    if ((Feature.AllowUnQuotedFieldNames.mask & j4) == 0) {
                        C0086a.m464w(info("not allow unquoted fieldName"));
                        return;
                    }
                    fieldName = readFieldNameUnquote();
                }
                if (this.f1929ch == ':') {
                    next();
                }
            }
            Object obj = fieldName;
            this.comma = false;
            char c11 = this.f1929ch;
            switch (c11) {
                case '\"':
                case '\'':
                    string = readString();
                    if ((string == null || (Feature.IgnoreNullPropertyValue.mask & j4) == 0) && (((Feature.SupportAutoType.mask & j4) == 0 || !obj.equals("@type") || !map.getClass().getName().equals(string)) && (objPut = map.put(obj, string)) != null && (Feature.DuplicateKeyValueAsArray.mask & j4) != 0)) {
                        if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map.put(obj, objPut);
                        } else {
                            map.put(obj, JSONArray.m1634of(objPut, string));
                        }
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                case '+':
                    string = readNumber();
                    if (string == null) {
                        if (objPut instanceof Collection) {
                        }
                    } else if (objPut instanceof Collection) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                case 'I':
                    if (!nextIfInfinity()) {
                        C0086a.m446e(this.offset, this.f1929ch, "FASTJSON2.0.60error, offset ");
                    } else {
                        string = Double.valueOf(Double.POSITIVE_INFINITY);
                        if (string == null) {
                        }
                        i9++;
                        zNextIfObjectStart = z10;
                    }
                    break;
                case 'S':
                    if (!nextIfSet()) {
                        C0086a.m446e(this.offset, this.f1929ch, "FASTJSON2.0.60error, offset ");
                    } else {
                        string = read((Class<Object>) HashSet.class);
                        if (string == null) {
                        }
                        i9++;
                        zNextIfObjectStart = z10;
                    }
                    break;
                case '[':
                    string = readArray();
                    if (string == null) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                case 'f':
                case 't':
                    string = Boolean.valueOf(readBoolValue());
                    if (string == null) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                case 'n':
                    string = readNullOrNewDate();
                    if (string == null) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                case 'x':
                    string = readBinary();
                    if (string == null) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                case '{':
                    string = z9 ? ObjectReaderImplObject.INSTANCE.readObject(this, null, obj, j3) : readObject();
                    if (string == null) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
                default:
                    switch (c11) {
                        case ParserConstants.PROTECTED /* 45 */:
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        case '/':
                            skipComment();
                            continue;
                            i9++;
                            zNextIfObjectStart = z10;
                            break;
                        default:
                            C0086a.m446e(this.offset, this.f1929ch, "FASTJSON2.0.60error, offset ");
                            break;
                    }
                    if (string == null) {
                    }
                    i9++;
                    zNextIfObjectStart = z10;
                    break;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object readAny() {
        return read(Object.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x013b */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
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
    */
    public List readArray() {
        JSONArray jSONArray;
        ArrayList arrayList;
        List<Object> list;
        JSONReader jSONReader;
        Object string;
        next();
        int i9 = this.level + 1;
        this.level = i9;
        if (i9 >= this.context.maxLevel) {
            C0086a.m466y(this.level, "level too large : ");
            return null;
        }
        List<Object> jSONArray2 = null;
        Object obj = null;
        Object obj2 = null;
        int i10 = 0;
        while (true) {
            char c10 = this.f1929ch;
            switch (c10) {
                case '\"':
                case '\'':
                    jSONReader = this;
                    string = readString();
                    if (i10 == 0) {
                        obj = string;
                    } else if (i10 == 1) {
                        obj2 = string;
                    } else if (i10 == 2) {
                        Supplier<List> supplier = jSONReader.context.arraySupplier;
                        jSONArray2 = supplier != null ? supplier.get() : new JSONArray();
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i10, string);
                    } else {
                        add(jSONArray2, i10, string);
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                case '+':
                case ParserConstants.PROTECTED /* 45 */:
                    jSONReader = this;
                    readNumber0();
                    string = getNumber();
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                case ParserConstants.LBRACE /* 78 */:
                    jSONReader = this;
                    string = Double.valueOf(readNaN());
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                case 'S':
                    jSONReader = this;
                    if (!nextIfSet()) {
                        C0086a.m464w(info());
                        return null;
                    }
                    string = read((Class<Object>) Set.class);
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                    break;
                case '[':
                    jSONReader = this;
                    string = readArray();
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                case ']':
                    next();
                    List<Object> list2 = jSONArray2;
                    if (jSONArray2 == null) {
                        Context context = this.context;
                        Supplier<List> supplier2 = context.arraySupplier;
                        if (supplier2 != null) {
                            list = supplier2.get();
                        } else if (!context.isEnabled(Feature.UseNativeObject)) {
                            Supplier<List> supplier3 = this.context.arraySupplier;
                            if (supplier3 != null) {
                                list = supplier3.get();
                            } else if (i10 == 2) {
                                list = jSONArray;
                                jSONArray = new JSONArray(2);
                            } else {
                                list = jSONArray;
                                jSONArray = new JSONArray(1);
                            }
                        } else if (i10 == 2) {
                            list = arrayList;
                            arrayList = new ArrayList(2);
                        } else {
                            list = arrayList;
                            arrayList = new ArrayList(1);
                        }
                        List<Object> list3 = list;
                        list2 = list3;
                        if (i10 == 1) {
                            add(list3, 0, obj);
                            list2 = list3;
                        } else if (i10 == 2) {
                            add(list3, 0, obj);
                            add(list3, 1, obj2);
                            list2 = list3;
                        }
                    }
                    boolean z9 = this.f1929ch == ',';
                    this.comma = z9;
                    if (z9) {
                        next();
                    }
                    this.level--;
                    return list2;
                case 'f':
                case 't':
                    jSONReader = this;
                    string = Boolean.valueOf(readBoolValue());
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                case 'n':
                    jSONReader = this;
                    readNull();
                    string = null;
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                case '{':
                    Context context2 = this.context;
                    if (context2.autoTypeBeforeHandler == null && (context2.features & Feature.SupportAutoType.mask) == 0) {
                        string = isReference() ? JSONPath.m1657of(readReference()) : readObject();
                        jSONReader = this;
                    } else {
                        JSONReader jSONReader2 = this;
                        string = ObjectReaderImplObject.INSTANCE.readObject(jSONReader2, null, null, 0L);
                        jSONReader = jSONReader2;
                    }
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
                default:
                    switch (c10) {
                        case '/':
                            skipComment();
                            i10--;
                            continue;
                            i10++;
                            jSONArray2 = jSONArray2;
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            C0086a.m461t(this.f1929ch, "TODO : ");
                            return null;
                    }
                    if (i10 == 0) {
                    }
                    i10++;
                    jSONArray2 = jSONArray2;
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] readBase64() {
        int iIndexOf;
        int i9;
        int iIndexOf2;
        String string = readString();
        if (string != null && string.startsWith("data:image/") && (iIndexOf = string.indexOf(59, 12)) != -1 && (iIndexOf2 = string.indexOf(44, (i9 = iIndexOf + 1))) != -1 && string.regionMatches(i9, "base64", 0, 6)) {
            string = string.substring(iIndexOf2 + 1);
        }
        return string.isEmpty() ? new byte[0] : Base64.getDecoder().decode(string);
    }

    public abstract BigDecimal readBigDecimal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BigInteger readBigInteger() {
        readNumber0();
        return getBigInteger();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] readBinary() {
        if (this.f1929ch == 'x') {
            return readHex();
        }
        if (isString()) {
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            if ((this.context.features & Feature.Base64StringAsByteArray.mask) != 0) {
                return IOUtils.decodeBase64(string);
            }
            C0086a.m464w(info("not support input ".concat(string)));
            return null;
        }
        if (!nextIfArrayStart()) {
            C0086a.m464w(info("not support read binary"));
            return null;
        }
        byte[] bArrCopyOf = new byte[64];
        int i9 = 0;
        while (this.f1929ch != ']') {
            if (i9 == bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + (length >> 1));
            }
            bArrCopyOf[i9] = (byte) readInt32Value();
            i9++;
        }
        next();
        nextIfComma();
        return Arrays.copyOf(bArrCopyOf, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Calendar readCalendar() {
        Date date = readDate();
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.context.getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public char readCharValue() {
        String string = readString();
        if (string != null && !string.isEmpty()) {
            return string.charAt(0);
        }
        this.wasNull = true;
        return (char) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Character readCharacter() {
        String string = readString();
        if (string != null && !string.isEmpty()) {
            return Character.valueOf(string.charAt(0));
        }
        this.wasNull = true;
        return (char) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        millisFromString = readMillisFromString();
        if (millisFromString == 0) {
        }
        return new Date(millisFromString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    public abstract long readFieldNameHashCodeUnquote();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String readFieldNameUnquote() {
        if (this.f1929ch == '/') {
            skipComment();
        }
        readFieldNameHashCodeUnquote();
        String fieldName = getFieldName();
        if (fieldName != null && !fieldName.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return fieldName;
        }
        C0086a.m464w(info("illegal input"));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Float readFloat() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Short readInt16() {
        Integer int32 = readInt32();
        if (int32 == null) {
            return null;
        }
        return Short.valueOf(int32.shortValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public short readInt16Value() {
        return (short) readInt32Value();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Integer readInt32() {
        char c10 = this.f1929ch;
        if ((c10 == '\"' || c10 == '\'' || c10 == 'n') && nextIfNullOrEmptyString()) {
            return null;
        }
        return Integer.valueOf(readInt32Value());
    }

    public abstract int readInt32Value();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int readInt32ValueOverflow() {
        readNumber0();
        return getInt32Value();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Long readInt64() {
        char c10 = this.f1929ch;
        if ((c10 == '\"' || c10 == '\'' || c10 == 'n') && nextIfNullOrEmptyString()) {
            return null;
        }
        return Long.valueOf(readInt64Value());
    }

    public abstract long readInt64Value();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long[] readInt64ValueArray() {
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            if (!isString()) {
                C0086a.m464w(info("TODO"));
                return null;
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            throw error("not support input ".concat(string));
        }
        long[] jArrCopyOf = new long[8];
        int i9 = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                C0086a.m464w(info("input end"));
                return null;
            }
            if (i9 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
            }
            jArrCopyOf[i9] = readInt64Value();
            i9++;
        }
        return i9 == jArrCopyOf.length ? jArrCopyOf : Arrays.copyOf(jArrCopyOf, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long readInt64ValueOverflow() {
        readNumber0();
        return getInt64Value();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Byte readInt8() {
        Integer int32 = readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte readInt8Value() {
        return (byte) readInt32Value();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONArray readJSONArray() {
        JSONArray jSONArray = new JSONArray();
        read((List) jSONArray);
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONObject readJSONObject() {
        JSONObject jSONObject = new JSONObject();
        read(jSONObject, 0L);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List readList(Type[] typeArr) {
        char c10;
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            C0086a.m461t(this.f1929ch, "syntax error : ");
            return null;
        }
        int length = typeArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i9 = 0;
        while (!nextIfArrayEnd() && i9 < length) {
            int i10 = this.offset;
            int i11 = i9 + 1;
            Object obj = read(typeArr[i9]);
            if (i10 == this.offset || (c10 = this.f1929ch) == '}' || c10 == 26) {
                throw new JSONException("illegal input : " + this.f1929ch + ", offset " + getOffset());
            }
            arrayList.add(obj);
            i9 = i11;
        }
        if (i9 != length) {
            C0086a.m464w(info("element length mismatch"));
            return null;
        }
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalDate readLocalDate() {
        LocalDateTime localDateTime19;
        if (nextIfNull()) {
            return null;
        }
        if (isInt()) {
            long int64Value = readInt64Value();
            if (this.context.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value).atZone(this.context.getZoneId()).toLocalDate();
        }
        Context context = this.context;
        if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            if (stringLength == 19) {
                localDateTime19 = readLocalDateTime19();
            } else if (stringLength != 20) {
                switch (stringLength) {
                    case 8:
                        LocalDate localDate8 = readLocalDate8();
                        localDateTime19 = localDate8 != null ? LocalDateTime.of(localDate8, LocalTime.MIN) : null;
                        break;
                    case 9:
                        LocalDate localDate9 = readLocalDate9();
                        if (localDate9 != null) {
                            localDateTime19 = LocalDateTime.of(localDate9, LocalTime.MIN);
                            break;
                        }
                        break;
                    case 10:
                        LocalDate localDate10 = readLocalDate10();
                        if (localDate10 != null) {
                            localDateTime19 = LocalDateTime.of(localDate10, LocalTime.MIN);
                            break;
                        }
                        break;
                    case 11:
                        LocalDate localDate11 = readLocalDate11();
                        if (localDate11 != null) {
                            localDateTime19 = LocalDateTime.of(localDate11, LocalTime.MIN);
                            break;
                        }
                        break;
                    default:
                        if (stringLength > 20) {
                            localDateTime19 = readLocalDateTimeX(stringLength);
                            break;
                        }
                        break;
                }
            } else {
                localDateTime19 = readLocalDateTime20();
            }
            if (localDateTime19 != null) {
                return localDateTime19.toLocalDate();
            }
        }
        String string = readString();
        if (string.isEmpty() || "null".equals(string)) {
            return null;
        }
        DateTimeFormatter dateFormatter = this.context.getDateFormatter();
        if (dateFormatter != null) {
            return this.context.formatHasHour ? LocalDateTime.parse(string, dateFormatter).toLocalDate() : LocalDate.parse(string, dateFormatter);
        }
        if (IOUtils.isNumber(string)) {
            return Instant.ofEpochMilli(Long.parseLong(string)).atZone(this.context.getZoneId()).toLocalDate();
        }
        C0086a.m464w("not support input : ".concat(string));
        return null;
    }

    public abstract LocalDate readLocalDate10();

    public abstract LocalDate readLocalDate11();

    public abstract LocalDate readLocalDate8();

    public abstract LocalDate readLocalDate9();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
                case 11:
                    LocalDate localDate11 = readLocalDate11();
                    if (localDate11 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate11, LocalTime.MIN);
                case 16:
                    return readLocalDateTime16();
                case 17:
                    LocalDateTime localDateTime17 = readLocalDateTime17();
                    if (localDateTime17 != null) {
                        return localDateTime17;
                    }
                    break;
                case 18:
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
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
            long j3 = Long.parseLong(string);
            if (jSONReader.context.formatUnixTime) {
                j3 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), jSONReader.context.getZoneId());
        }
        if (!string.startsWith("/Date(") || !string.endsWith(")/")) {
            if ("0000-00-00 00:00:00".equals(string)) {
                jSONReader.wasNull = true;
                return null;
            }
            C0086a.m464w(info("read LocalDateTime error ".concat(string)));
            return null;
        }
        String strM9262f = AbstractC4855en.m9262f(2, 6, string);
        int iIndexOf = strM9262f.indexOf(43);
        if (iIndexOf == -1) {
            iIndexOf = strM9262f.indexOf(45);
        }
        if (iIndexOf != -1) {
            strM9262f = strM9262f.substring(0, iIndexOf);
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(strM9262f)), jSONReader.context.getZoneId());
    }

    public abstract LocalDateTime readLocalDateTime12();

    public abstract LocalDateTime readLocalDateTime14();

    public abstract LocalDateTime readLocalDateTime16();

    public abstract LocalDateTime readLocalDateTime17();

    public abstract LocalDateTime readLocalDateTime18();

    public abstract LocalDateTime readLocalDateTime19();

    public abstract LocalDateTime readLocalDateTime20();

    public abstract LocalDateTime readLocalDateTimeX(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalTime readLocalTime() {
        if (nextIfNull()) {
            return null;
        }
        if (isInt()) {
            return Instant.ofEpochMilli(readInt64Value()).atZone(this.context.getZoneId()).toLocalTime();
        }
        int stringLength = getStringLength();
        if (stringLength == 5) {
            return readLocalTime5();
        }
        if (stringLength == 15) {
            return readLocalTime15();
        }
        switch (stringLength) {
            case 8:
                return readLocalTime8();
            case 9:
                return readLocalTime9();
            case 10:
                return readLocalTime10();
            case 11:
                return readLocalTime11();
            case 12:
                return readLocalTime12();
            default:
                switch (stringLength) {
                    case 18:
                        return readLocalTime18();
                    case 19:
                        return readLocalDateTime19().toLocalTime();
                    case 20:
                        return readLocalDateTime20().toLocalTime();
                    default:
                        String string = readString();
                        if (string.isEmpty() || "null".equals(string)) {
                            return null;
                        }
                        if (IOUtils.isNumber(string)) {
                            return Instant.ofEpochMilli(Long.parseLong(string)).atZone(this.context.getZoneId()).toLocalTime();
                        }
                        C0086a.m464w("not support len : ".concat(string));
                        return null;
                }
        }
    }

    public abstract LocalTime readLocalTime10();

    public abstract LocalTime readLocalTime11();

    public abstract LocalTime readLocalTime12();

    public abstract LocalTime readLocalTime15();

    public abstract LocalTime readLocalTime18();

    public abstract LocalTime readLocalTime5();

    public abstract LocalTime readLocalTime8();

    public abstract LocalTime readLocalTime9();

    public abstract long readMillis19();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long readMillisFromString() {
        LocalDateTime localDateTimeOf;
        ZonedDateTime zonedDateTime;
        long j3;
        int i9;
        this.wasNull = false;
        Context context = this.context;
        String str = context.dateFormat;
        if (str == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    if (localDate8 == null) {
                        C0086a.m450i(readString(), "TODO : ");
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
                        C0086a.m464w(AbstractC4855en.m9263g("TODO : ", string));
                        return 0L;
                    }
                    localDateTimeOf = LocalDateTime.of(localDate10, LocalTime.MIN);
                    break;
                case 11:
                    LocalDate localDate11 = readLocalDate11();
                    localDateTimeOf = localDate11 == null ? null : LocalDateTime.of(localDate11, LocalTime.MIN);
                    break;
                case 12:
                    localDateTimeOf = readLocalDateTime12();
                    break;
                case 13:
                case 15:
                default:
                    localDateTimeOf = null;
                    break;
                case 14:
                    localDateTimeOf = readLocalDateTime14();
                    break;
                case 16:
                    localDateTimeOf = readLocalDateTime16();
                    break;
                case 17:
                    localDateTimeOf = readLocalDateTime17();
                    break;
                case 18:
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
            } else {
                zonedDateTime = null;
            }
            if (zonedDateTime != null) {
                long epochSecond = zonedDateTime.toEpochSecond();
                int nano = zonedDateTime.toLocalTime().getNano();
                if (epochSecond >= 0 || nano <= 0) {
                    j3 = epochSecond * 1000;
                    i9 = nano / 1000000;
                } else {
                    j3 = (epochSecond + 1) * 1000;
                    i9 = (nano / 1000000) - 1000;
                }
                return j3 + ((long) i9);
            }
        }
        String string2 = readString();
        if (string2.isEmpty() || "null".equals(string2)) {
            this.wasNull = true;
            return 0L;
        }
        Context context2 = this.context;
        if (context2.formatMillis || context2.formatUnixTime) {
            long j4 = Long.parseLong(string2);
            return this.context.formatUnixTime ? j4 * 1000 : j4;
        }
        if (str != null && !str.isEmpty()) {
            if ("yyyy-MM-dd HH:mm:ss".equals(str)) {
                return ((string2.length() < 4 || string2.charAt(4) != '-') && IOUtils.isNumber(string2)) ? Long.parseLong(string2) : DateUtils.parseMillis19(string2, null);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            try {
                return simpleDateFormat.parse(string2).getTime();
            } catch (ParseException unused) {
                C0086a.m459r(AbstractC0255e.m1026o("parse date error, ", string2, ", expect format "), simpleDateFormat.toPattern());
                return 0L;
            }
        }
        if ("0000-00-00T00:00:00".equals(string2) || "0001-01-01T00:00:00+08:00".equals(string2)) {
            return 0L;
        }
        if (string2.startsWith("/Date(") && string2.endsWith(")/")) {
            String strM9262f = AbstractC4855en.m9262f(2, 6, string2);
            int iIndexOf = strM9262f.indexOf(43);
            if (iIndexOf == -1) {
                iIndexOf = strM9262f.indexOf(45);
            }
            if (iIndexOf != -1) {
                strM9262f = strM9262f.substring(0, iIndexOf);
            }
            return Long.parseLong(strM9262f);
        }
        if (IOUtils.isNumber(string2)) {
            return Long.parseLong(string2);
        }
        C0086a.m464w(info("format " + str + " not support, input " + string2));
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public double readNaN() {
        throw new JSONException("not support");
    }

    public abstract void readNull();

    public abstract Date readNullOrNewDate();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Number readNumber() {
        readNumber0();
        return getNumber();
    }

    public abstract void readNumber0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> readObject() {
        Map map;
        Map innerMap;
        Object string;
        nextIfObjectStart();
        int i9 = this.level + 1;
        this.level = i9;
        Context context = this.context;
        if (i9 >= context.maxLevel) {
            C0086a.m466y(this.level, "level too large : ");
            return null;
        }
        Supplier<Map> supplier = context.objectSupplier;
        if (supplier == null) {
            map = (context.features & Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject();
            innerMap = null;
        } else {
            map = supplier.get();
            innerMap = TypeUtils.getInnerMap(map);
        }
        int i10 = 0;
        while (true) {
            if (this.f1929ch == '/') {
                skipComment();
            }
            if (this.f1929ch == '}') {
                next();
                boolean z9 = this.f1929ch == ',';
                this.comma = z9;
                if (z9) {
                    next();
                }
                this.level--;
                return map;
            }
            Object fieldName = readFieldName();
            if (fieldName == null) {
                char c10 = this.f1929ch;
                if (c10 == 26) {
                    C0086a.m464w("input end");
                    return null;
                }
                if (c10 == '-' || (c10 >= '0' && c10 <= '9')) {
                    readNumber0();
                    fieldName = getNumber();
                } else {
                    fieldName = c10 == '{' ? readObject() : c10 == '[' ? readArray() : readFieldNameUnquote();
                }
                nextIfMatch(':');
            }
            if (i10 != 0 || (this.context.features & Feature.ErrorOnNotSupportAutoType.mask) == 0 || !"@type".equals(fieldName)) {
                char c11 = this.f1929ch;
                switch (c11) {
                    case '\"':
                    case '\'':
                        string = readString();
                        if (string == null || (this.context.features & Feature.IgnoreNullPropertyValue.mask) == 0) {
                            if (innerMap == null) {
                                innerMap.put(fieldName, string);
                            } else {
                                map.put(fieldName, string);
                            }
                        }
                        i10++;
                        break;
                    case '+':
                    case ParserConstants.PROTECTED /* 45 */:
                        readNumber0();
                        string = getNumber();
                        if (string == null) {
                            if (innerMap == null) {
                            }
                        }
                        i10++;
                        break;
                    case 'I':
                        if (!nextIfInfinity()) {
                            C0086a.m464w(info("illegal input " + this.f1929ch));
                            return null;
                        }
                        string = Double.valueOf(Double.POSITIVE_INFINITY);
                        if (string == null) {
                        }
                        i10++;
                        break;
                        break;
                    case 'S':
                        if (!nextIfSet()) {
                            C0086a.m464w(info("illegal input " + this.f1929ch));
                            return null;
                        }
                        string = read((Class<Object>) Set.class);
                        if (string == null) {
                        }
                        i10++;
                        break;
                        break;
                    case '[':
                        string = readArray();
                        if (string == null) {
                        }
                        i10++;
                        break;
                    case 'f':
                    case 't':
                        string = Boolean.valueOf(readBoolValue());
                        if (string == null) {
                        }
                        i10++;
                        break;
                    case 'n':
                        readNull();
                        string = null;
                        if (string == null) {
                        }
                        i10++;
                        break;
                    case '{':
                        if (!isReference()) {
                            string = readObject();
                            if (string == null) {
                            }
                            i10++;
                        } else {
                            addResolveTask(map, fieldName, JSONPath.m1657of(readReference()));
                            string = null;
                            if (string == null) {
                            }
                            i10++;
                        }
                        break;
                    default:
                        switch (c11) {
                            case '/':
                                skipComment();
                                continue;
                                i10++;
                                break;
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            default:
                                C0086a.m464w(info("illegal input " + this.f1929ch));
                                return null;
                        }
                        if (string == null) {
                        }
                        i10++;
                        break;
                }
            } else {
                C0086a.m464w(AbstractC4855en.m9263g("autoType not support : ", readString()));
                return null;
            }
        }
    }

    public abstract OffsetDateTime readOffsetDateTime();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OffsetTime readOffsetTime() {
        throw new JSONException("TODO");
    }

    public abstract String readPattern();

    public abstract String readReference();

    public abstract String readString();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] readStringArray() {
        String[] strArr = null;
        if (this.f1929ch == 'n' && nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            char c10 = this.f1929ch;
            if (c10 != '\"' && c10 != '\'') {
                C0086a.m464w(info("not support input"));
                return null;
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            C0086a.m464w(info("not support input ".concat(string)));
            return null;
        }
        int i9 = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                C0086a.m464w(info("input end"));
                return null;
            }
            if (strArr == null) {
                strArr = new String[16];
            } else if (i9 == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            }
            strArr[i9] = readString();
            i9++;
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        return strArr.length == i9 ? strArr : (String[]) Arrays.copyOf(strArr, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String readStringNotMatch() {
        char c10 = this.f1929ch;
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
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            C0086a.m464w(info("illegal input : " + this.f1929ch));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long readTypeHashCode() {
        return readValueHashCode();
    }

    public abstract UUID readUUID();

    public abstract long readValueHashCode();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZonedDateTime readZonedDateTime() {
        LocalDateTime localDateTimeOf;
        if (isInt()) {
            long int64Value = readInt64Value();
            if (this.context.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value).atZone(this.context.getZoneId());
        }
        if (!isString()) {
            if (nextIfNull()) {
                return null;
            }
            C0086a.m461t(this.f1929ch, "TODO : ");
            return null;
        }
        Context context = this.context;
        if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    localDateTimeOf = localDate8 == null ? null : LocalDateTime.of(localDate8, LocalTime.MIN);
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 9:
                    LocalDate localDate9 = readLocalDate9();
                    if (localDate9 != null) {
                        localDateTimeOf = LocalDateTime.of(localDate9, LocalTime.MIN);
                    }
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 10:
                    LocalDate localDate10 = readLocalDate10();
                    if (localDate10 != null) {
                        localDateTimeOf = LocalDateTime.of(localDate10, LocalTime.MIN);
                    }
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 11:
                    localDateTimeOf = LocalDateTime.of(readLocalDate11(), LocalTime.MIN);
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                    if (zonedDateTimeX != null) {
                        return zonedDateTimeX;
                    }
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 16:
                    localDateTimeOf = readLocalDateTime16();
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 17:
                    localDateTimeOf = readLocalDateTime17();
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 18:
                    localDateTimeOf = readLocalDateTime18();
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 19:
                    localDateTimeOf = readLocalDateTime19();
                    if (localDateTimeOf != null) {
                    }
                    break;
                case 20:
                    localDateTimeOf = readLocalDateTime20();
                    if (localDateTimeOf != null) {
                    }
                    break;
            }
        }
        String string = readString();
        if (string.isEmpty() || "null".equals(string)) {
            return null;
        }
        DateTimeFormatter dateFormatter = this.context.getDateFormatter();
        if (dateFormatter != null) {
            return !this.context.formatHasHour ? ZonedDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN, this.context.getZoneId()) : ZonedDateTime.of(LocalDateTime.parse(string, dateFormatter), this.context.getZoneId());
        }
        if (!IOUtils.isNumber(string)) {
            return ZonedDateTime.parse(string);
        }
        long j3 = Long.parseLong(string);
        if (this.context.formatUnixTime) {
            j3 *= 1000;
        }
        return Instant.ofEpochMilli(j3).atZone(this.context.getZoneId());
    }

    public abstract ZonedDateTime readZonedDateTimeX(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reset(SavePoint savePoint) {
        this.offset = savePoint.offset;
        this.f1929ch = (char) savePoint.current;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTypeRedirect(boolean z9) {
        this.typeRedirect = z9;
    }

    public abstract void skipComment();

    public abstract boolean skipName();

    public abstract void skipValue();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int startArray() {
        if (nextIfArrayStart()) {
            return Integer.MAX_VALUE;
        }
        C0086a.m464w(info("illegal input, expect '[', but " + this.f1929ch));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C0086a.m464w(info("parseLong error, field : value " + list));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int toInt32(String str) {
        if (IOUtils.isNumber(str) || str.lastIndexOf(44) == str.length() - 4) {
            return TypeUtils.toIntValue(str);
        }
        C0086a.m464w(info("parseInt error, value : ".concat(str)));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long toInt64(String str) {
        if (IOUtils.isNumber(str) || str.lastIndexOf(44) == str.length() - 4) {
            return TypeUtils.toLongValue(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return DateUtils.parseMillis(str, this.context.zoneId);
            } catch (JSONException | DateTimeException unused) {
            }
        }
        C0086a.m464w(info("parseLong error, value : ".concat(str)));
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long toLong(Map map) {
        if (map.get("val") instanceof Number) {
            return ((Number) r0).intValue();
        }
        C0086a.m464w(info("parseLong error, value : " + map));
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString(List list) {
        JSONWriter jSONWriterM1684of = JSONWriter.m1684of();
        jSONWriterM1684of.setRootObject(list);
        jSONWriterM1684of.write(list);
        return jSONWriterM1684of.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONException valueError() {
        return new JSONException(info("illegal value"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean wasNull() {
        return this.wasNull;
    }

    public static AutoTypeBeforeHandler autoTypeFilter(boolean z9, String... strArr) {
        return new ContextAutoTypeBeforeHandler(z9, strArr);
    }

    public static AutoTypeBeforeHandler autoTypeFilter(Class... clsArr) {
        return new ContextAutoTypeBeforeHandler(clsArr);
    }

    public static AutoTypeBeforeHandler autoTypeFilter(boolean z9, Class... clsArr) {
        return new ContextAutoTypeBeforeHandler(z9, clsArr);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
        UseDefaultConstructorAsPossible(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE),
        UseBigDecimalForFloats(2048),
        UseBigDecimalForDoubles(4096),
        ErrorOnEnumNotMatch(8192),
        TrimString(Http2Stream.EMIT_BUFFER_SIZE),
        ErrorOnNotSupportAutoType(32768),
        DuplicateKeyValueAsArray(65536),
        AllowUnQuotedFieldNames(131072),
        NonStringKeyAsString(262144),
        Base64StringAsByteArray(524288),
        IgnoreCheckClose(1048576),
        ErrorOnNullForPrimitives(2097152),
        NullOnError(4194304),
        IgnoreAutoTypeNotMatch(8388608),
        NonZeroNumberCastToBooleanAsTrue(16777216),
        IgnoreNullPropertyValue(33554432),
        ErrorOnUnknownProperties(67108864),
        EmptyStringAsNull(134217728),
        NonErrorOnNumberOverflow(268435456),
        UseBigIntegerForInts(536870912),
        UseLongForInts(1073741824),
        DisableSingleQuote(2147483648L),
        UseDoubleForDecimals(4294967296L),
        DisableReferenceDetect(JSONReader.MASK_DISABLE_REFERENCE_DETECT),
        DisableStringArrayUnwrapping(17179869184L);

        public final long mask;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        Feature(long j3) {
            this.mask = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public static long m1683of(Feature[] featureArr) {
            long j3 = 0;
            if (featureArr == null) {
                return 0L;
            }
            for (Feature feature : featureArr) {
                j3 |= feature.mask;
            }
            return j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isEnabled(long j3) {
            return (j3 & this.mask) != 0;
        }

        public static boolean isEnabled(long j3, Feature feature) {
            return (j3 & feature.mask) != 0;
        }
    }

    public static JSONReader ofJSONB(InputStream inputStream, Context context) {
        return new JSONReaderJSONB(context, inputStream);
    }

    public final String toString(Map map) {
        JSONWriter jSONWriterM1684of = JSONWriter.m1684of();
        jSONWriterM1684of.setRootObject(map);
        jSONWriterM1684of.write(map);
        return jSONWriterM1684of.toString();
    }

    @Deprecated
    public static JSONReader ofJSONB(Context context, byte[] bArr) {
        return new JSONReaderJSONB(context, bArr, 0, bArr.length);
    }

    public static JSONReader ofJSONB(byte[] bArr, Context context) {
        return new JSONReaderJSONB(context, bArr, 0, bArr.length);
    }

    public static JSONReader ofJSONB(byte[] bArr) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(), bArr, 0, bArr.length);
    }

    public static JSONReader ofJSONB(byte[] bArr, int i9, int i10) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(), bArr, i9, i10);
    }

    public final boolean isSupportBeanArray() {
        return (this.context.features & Feature.SupportArrayToBean.mask) != 0;
    }

    public final boolean isSupportSmartMatch() {
        return (this.context.features & Feature.SupportSmartMatch.mask) != 0;
    }

    public static JSONReader ofJSONB(byte[] bArr, int i9, int i10, Context context) {
        return new JSONReaderJSONB(context, bArr, i9, i10);
    }

    public static JSONReader ofJSONB(byte[] bArr, int i9, int i10, SymbolTable symbolTable) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(symbolTable), bArr, i9, i10);
    }

    public static JSONException syntaxError(int i9, int i10) {
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "syntax error, offset ", ", char ");
        sbM2257t.append((char) i10);
        return new JSONException(sbM2257t.toString());
    }

    public final JSONException error(int i9, int i10) {
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "error, offset ", ", char ");
        sbM2257t.append((char) i10);
        throw new JSONException(sbM2257t.toString());
    }

    public final JSONException error(String str) {
        return new JSONException(info(str));
    }

    public final void addResolveTask(FieldReader fieldReader, Object obj, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(fieldReader, obj, fieldReader.fieldName, jSONPath));
    }

    public final JSONException error(String str, Exception exc) {
        return new JSONException(info(str), exc);
    }

    public static JSONException numberError(int i9, int i10) {
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "illegal number, offset ", ", char ");
        sbM2257t.append((char) i10);
        return new JSONException(sbM2257t.toString());
    }

    public final Number toNumber(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public final void addResolveTask(Collection collection, int i9, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(null, collection, Integer.valueOf(i9), jSONPath));
    }

    public final void addResolveTask(Object[] objArr, int i9, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(null, objArr, Integer.valueOf(i9), jSONPath));
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Context {
        Supplier<List> arraySupplier;
        AutoTypeBeforeHandler autoTypeBeforeHandler;
        int bufferSize;
        String dateFormat;
        DateTimeFormatter dateFormatter;
        public ExtraProcessor extraProcessor;
        public long features;
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
        public final ObjectReaderProvider provider;
        protected final SymbolTable symbolTable;
        TimeZone timeZone;
        boolean useSimpleFormatter;
        boolean yyyyMMddhhmm16;
        ZoneId zoneId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Context(String str, Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = JSONFactory.defaultObjectReaderProvider;
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Supplier<List> getArraySupplier() {
            return this.arraySupplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int getBufferSize() {
            return this.bufferSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AutoTypeBeforeHandler getContextAutoTypeBeforeHandler() {
            return this.autoTypeBeforeHandler;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getDateFormat() {
            return this.dateFormat;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DateTimeFormatter getDateFormatter() {
            String str;
            if (this.dateFormatter == null && (str = this.dateFormat) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
                Locale locale = this.locale;
                this.dateFormatter = locale == null ? DateTimeFormatter.ofPattern(str) : DateTimeFormatter.ofPattern(str, locale);
            }
            return this.dateFormatter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ExtraProcessor getExtraProcessor() {
            return this.extraProcessor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public long getFeatures() {
            return this.features;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Locale getLocale() {
            return this.locale;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int getMaxLevel() {
            return this.maxLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ObjectReader getObjectReader(Type type) {
            return this.provider.getObjectReader(type, (this.features & Feature.FieldBased.mask) != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ObjectReader getObjectReaderAutoType(String str, Class cls) {
            Class<?> clsApply;
            AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (autoTypeBeforeHandler == null || (clsApply = autoTypeBeforeHandler.apply(str, (Class<?>) cls, this.features)) == null) {
                return this.provider.getObjectReader(str, cls, this.features);
            }
            return this.provider.getObjectReader(clsApply, (this.features & Feature.FieldBased.mask) != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Supplier<Map> getObjectSupplier() {
            return this.objectSupplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ObjectReaderProvider getProvider() {
            return this.provider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TimeZone getTimeZone() {
            return this.timeZone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ZoneId getZoneId() {
            if (this.zoneId == null) {
                this.zoneId = DateUtils.DEFAULT_ZONE_ID;
            }
            return this.zoneId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isEnabled(Feature feature) {
            return (this.features & feature.mask) != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatHasHour() {
            return this.formatHasHour;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatISO8601() {
            return this.formatISO8601;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatMillis() {
            return this.formatMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatUnixTime() {
            return this.formatUnixTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatyyyyMMdd8() {
            return this.formatyyyyMMdd8;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatyyyyMMddhhmmss19() {
            return this.formatyyyyMMddhhmmss19;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isFormatyyyyMMddhhmmssT19() {
            return this.formatyyyyMMddhhmmssT19;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setArraySupplier(Supplier<List> supplier) {
            this.arraySupplier = supplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setBufferSize(int i9) {
            this.bufferSize = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void setDateFormat(String str) {
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            byte b10;
            boolean z14;
            if (str != null && str.isEmpty()) {
                str = null;
            }
            boolean z15 = false;
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
                        z14 = false;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        break;
                    case 1:
                        z14 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z10 = true;
                        break;
                    case 2:
                        z14 = false;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        break;
                    case 3:
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z14 = true;
                        break;
                    case 4:
                    case 5:
                        this.formatyyyyMMdd8 = true;
                        z14 = false;
                        z10 = false;
                        z12 = false;
                        z13 = false;
                        z11 = true;
                        break;
                    case 6:
                    case 8:
                        this.formatyyyyMMddhhmmss19 = true;
                        z14 = false;
                        z10 = false;
                        z13 = false;
                        z11 = true;
                        z12 = true;
                        break;
                    case 7:
                        this.formatyyyyMMddhhmmssT19 = true;
                        z14 = false;
                        z10 = false;
                        z13 = false;
                        z11 = true;
                        z12 = true;
                        break;
                    case 9:
                        z14 = false;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z15 = true;
                        break;
                    default:
                        z13 = false;
                        z11 = str.indexOf(100) != -1;
                        z12 = (str.indexOf(72) == -1 && str.indexOf(104) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) ? false : true;
                        z14 = false;
                        z10 = false;
                        break;
                }
                this.formatComplex = true ^ (((this.formatyyyyMMddhhmmss19 | this.formatyyyyMMddhhmmssT19) | this.formatyyyyMMdd8) | z15);
                boolean z16 = z14;
                z9 = z15;
                z15 = z16;
            } else {
                z9 = false;
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            String str2 = this.dateFormat;
            if (str2 != null && !str2.equals(str)) {
                this.dateFormatter = null;
            }
            this.dateFormat = str;
            this.formatUnixTime = z15;
            this.formatMillis = z10;
            this.formatISO8601 = z9;
            this.formatHasDay = z11;
            this.formatHasHour = z12;
            this.useSimpleFormatter = z13;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
            this.dateFormatter = dateTimeFormatter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setExtraProcessor(ExtraProcessor extraProcessor) {
            this.extraProcessor = extraProcessor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setFeatures(long j3) {
            this.features = j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setLocale(Locale locale) {
            this.locale = locale;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setMaxLevel(int i9) {
            this.maxLevel = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setObjectSupplier(Supplier<Map> supplier) {
            this.objectSupplier = supplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

        public ObjectReader getObjectReaderAutoType(long j3) {
            return this.provider.getObjectReader(j3);
        }

        public ObjectReader getObjectReaderAutoType(String str, Class cls, long j3) {
            Class<?> clsApply;
            AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(str, (Class<?>) cls, j3)) != null) {
                return this.provider.getObjectReader(clsApply, (Feature.FieldBased.mask & j3) != 0);
            }
            return this.provider.getObjectReader(str, cls, j3 | this.features);
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

        public void config(Feature feature, boolean z9) {
            long j3 = this.features;
            if (z9) {
                this.features = feature.mask | j3;
            } else {
                this.features = (~feature.mask) & j3;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, long j3) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.bufferSize = 524288;
            this.features = j3;
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
            this.maxLevel = Opcodes.ACC_STRICT;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = JSONFactory.defaultObjectReaderProvider;
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
            this.maxLevel = Opcodes.ACC_STRICT;
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
            this.maxLevel = Opcodes.ACC_STRICT;
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

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable) {
            this.maxLevel = Opcodes.ACC_STRICT;
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
            this.maxLevel = Opcodes.ACC_STRICT;
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

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable, Filter filter, Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            config(filter);
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable, Filter[] filterArr, Feature... featureArr) {
            this.maxLevel = Opcodes.ACC_STRICT;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            config(filterArr, new Feature[0]);
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
    public static JSONReader m1660of(Context context, byte[] bArr) {
        return new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1678of(byte[] bArr, Context context) {
        return new JSONReaderUTF8(context, null, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1679of(char[] cArr) {
        return new JSONReaderUTF16(JSONFactory.createReadContext(), null, cArr, 0, cArr.length);
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static JSONReader m1661of(Context context, char[] cArr) {
        return new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1682of(char[] cArr, Context context) {
        return new JSONReaderUTF16(context, null, cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1676of(byte[] bArr, int i9, int i10, Charset charset) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        if (charset == StandardCharsets.UTF_8) {
            return new JSONReaderUTF8(contextCreateReadContext, null, bArr, i9, i10);
        }
        if (charset == StandardCharsets.UTF_16) {
            return new JSONReaderUTF16(contextCreateReadContext, bArr, i9, i10);
        }
        if (charset != StandardCharsets.US_ASCII && charset != StandardCharsets.ISO_8859_1) {
            return m1669of(new String(bArr, i9, i10, charset), contextCreateReadContext);
        }
        return new JSONReaderASCII(contextCreateReadContext, null, bArr, i9, i10);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1673of(byte[] bArr) {
        return new JSONReaderUTF8(JSONFactory.createReadContext(), null, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1674of(byte[] bArr, int i9, int i10) {
        return new JSONReaderUTF8(JSONFactory.createReadContext(), null, bArr, i9, i10);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1675of(byte[] bArr, int i9, int i10, Context context) {
        return new JSONReaderUTF8(context, null, bArr, i9, i10);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1680of(char[] cArr, int i9, int i10) {
        return new JSONReaderUTF16(JSONFactory.createReadContext(), null, cArr, i9, i10);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1681of(char[] cArr, int i9, int i10, Context context) {
        return new JSONReaderUTF16(context, null, cArr, i9, i10);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1670of(URL url, Context context) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            JSONReader jSONReaderM1663of = m1663of(inputStreamOpenStream, StandardCharsets.UTF_8, context);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return jSONReaderM1663of;
        } catch (Throwable th2) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1662of(InputStream inputStream, Charset charset) {
        return m1663of(inputStream, charset, new Context(JSONFactory.defaultObjectReaderProvider));
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1663of(InputStream inputStream, Charset charset, Context context) {
        if (charset != StandardCharsets.UTF_8 && charset != null) {
            if (charset == StandardCharsets.UTF_16) {
                return new JSONReaderUTF16(context, inputStream);
            }
            if (charset == StandardCharsets.US_ASCII) {
                return new JSONReaderASCII(context, inputStream);
            }
            C0086a.m463v(charset, "not support charset ");
            return null;
        }
        return new JSONReaderUTF8(context, inputStream);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1664of(Reader reader) {
        return new JSONReaderUTF16(JSONFactory.createReadContext(), reader);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1665of(Reader reader, Context context) {
        return new JSONReaderUTF16(context, reader);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1672of(ByteBuffer byteBuffer, Charset charset) {
        return m1671of(byteBuffer, JSONFactory.createReadContext(), charset);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1671of(ByteBuffer byteBuffer, Context context, Charset charset) {
        if (charset != StandardCharsets.UTF_8 && charset != null) {
            C0086a.m463v(charset, "not support charset ");
            return null;
        }
        return new JSONReaderUTF8(context, byteBuffer);
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static JSONReader m1659of(Context context, String str) {
        return m1669of(str, context);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1666of(String str) {
        str.getClass();
        return new JSONReaderUTF16(new Context(JSONFactory.defaultObjectReaderProvider), str, 0, str.length());
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1669of(String str, Context context) {
        if (str != null && context != null) {
            return new JSONReaderUTF16(context, str, 0, str.length());
        }
        throw null;
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1667of(String str, int i9, int i10) {
        str.getClass();
        return new JSONReaderUTF16(JSONFactory.createReadContext(), str, str.toCharArray(), i9, i10);
    }

    /* JADX INFO: renamed from: of */
    public static JSONReader m1668of(String str, int i9, int i10, Context context) {
        if (str != null && context != null) {
            return new JSONReaderUTF16(context, str, str.toCharArray(), i9, i10);
        }
        throw null;
    }

    public final void bigInt(byte[] bArr, int i9, int i10) {
        int i11;
        long j3;
        long j4;
        long j5;
        int i12 = i10 - i9;
        if (this.scale > 0) {
            i12--;
        }
        if (i12 <= 38) {
            int i13 = i12 % 9;
            int i14 = i9 + (i13 != 0 ? i13 : 9);
            int i15 = i9 + 1;
            char c10 = (char) bArr[i9];
            if (c10 == '.') {
                c10 = (char) bArr[i15];
                i15 = i9 + 2;
                i11 = i14 + 1;
            } else {
                i11 = i14;
            }
            int i16 = c10 - '0';
            while (i15 < i14) {
                char c11 = (char) bArr[i15];
                if (c11 == '.') {
                    i15++;
                    c11 = (char) bArr[i15];
                    i11++;
                    if (i14 < i10) {
                        i14++;
                    }
                }
                i16 = (i16 * 10) + (c11 - '0');
                i15++;
            }
            this.mag3 = i16;
            while (i11 < i10) {
                int i17 = i11 + 9;
                int i18 = i11 + 1;
                char c12 = (char) bArr[i11];
                if (c12 == '.') {
                    int i19 = i11 + 2;
                    c12 = (char) bArr[i18];
                    i11 += 10;
                    i18 = i19;
                    i17 = i11;
                } else {
                    i11 = i17;
                }
                int i20 = c12 - '0';
                while (i18 < i17) {
                    char c13 = (char) bArr[i18];
                    if (c13 == '.') {
                        i18++;
                        c13 = (char) bArr[i18];
                        i11++;
                        i17++;
                    }
                    i20 = (i20 * 10) + (c13 - '0');
                    i18++;
                }
                long j10 = 4294967295L;
                long j11 = ((long) i20) & 4294967295L;
                long j12 = 0;
                int i21 = 3;
                while (i21 >= 0) {
                    if (i21 == 0) {
                        j4 = j10;
                        j5 = (1000000000 * (((long) this.mag0) & j4)) + j12;
                        this.mag0 = (int) j5;
                    } else if (i21 == 1) {
                        j4 = j10;
                        j5 = (1000000000 * (((long) this.mag1) & j4)) + j12;
                        this.mag1 = (int) j5;
                    } else if (i21 == 2) {
                        j4 = j10;
                        j5 = (1000000000 * (((long) this.mag2) & j4)) + j12;
                        this.mag2 = (int) j5;
                    } else if (i21 == 3) {
                        j4 = j10;
                        j5 = (1000000000 * (((long) this.mag3) & j4)) + j12;
                        this.mag3 = (int) j5;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j12 = j5 >>> 32;
                    i21--;
                    j10 = j4;
                }
                long j13 = j10;
                long j14 = (((long) this.mag3) & j13) + j11;
                this.mag3 = (int) j14;
                long j15 = j14 >>> 32;
                for (int i22 = 2; i22 >= 0; i22--) {
                    if (i22 == 0) {
                        j3 = (((long) this.mag0) & j13) + j15;
                        this.mag0 = (int) j3;
                    } else if (i22 == 1) {
                        j3 = (((long) this.mag1) & j13) + j15;
                        this.mag1 = (int) j3;
                    } else if (i22 == 2) {
                        j3 = (((long) this.mag2) & j13) + j15;
                        this.mag2 = (int) j3;
                    } else if (i22 == 3) {
                        j3 = (((long) this.mag3) & j13) + j15;
                        this.mag3 = (int) j3;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j15 = j3 >>> 32;
                }
            }
            return;
        }
        C0086a.m464w("number too large : ".concat(new String(bArr, i9, i12)));
    }

    public final Object[] readArray(Type[] typeArr) {
        if (nextIfNull()) {
            return null;
        }
        if (nextIfArrayStart()) {
            Object[] objArr = new Object[typeArr.length];
            int i9 = 0;
            boolean z9 = false;
            while (true) {
                if (i9 >= typeArr.length) {
                    break;
                }
                if (i9 != 0) {
                    if (!nextIfArrayEnd()) {
                        if (isEnd()) {
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                objArr[i9] = read(typeArr[i9]);
                if (i9 == typeArr.length - 1) {
                    z9 = true;
                }
                i9++;
            }
            if (z9) {
                return objArr;
            }
            C0086a.m464w(info("syntax error"));
            return null;
        }
        C0086a.m464w(info("syntax error"));
        return null;
    }

    public final void readArray(List list, Type type) {
        readArray((Collection) list, type);
    }

    public void readArray(Collection collection, Type type) {
        boolean z9;
        if (nextIfArrayStart()) {
            while (!nextIfArrayEnd()) {
                collection.add(read(type));
                char c10 = this.f1929ch;
                if (c10 == '}' || c10 == 26) {
                    C0086a.m464w(info());
                    return;
                }
            }
            z9 = this.f1929ch == ',';
            this.comma = z9;
            if (z9) {
                next();
                return;
            }
            return;
        }
        if (isString()) {
            String string = readString();
            if (type != String.class) {
                Function typeConvert = this.context.provider.getTypeConvert(String.class, type);
                if (typeConvert == null) {
                    C0086a.m464w(info("not support input " + string));
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
        z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
    }

    public List readArray(Type type) {
        char c10;
        if (nextIfNull()) {
            return null;
        }
        if (nextIfArrayStart()) {
            Context context = this.context;
            ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & Feature.FieldBased.mask) != 0);
            ArrayList arrayList = new ArrayList();
            while (!nextIfArrayEnd()) {
                int i9 = this.offset;
                Object object = objectReader.readObject(this, null, null, 0L);
                if (i9 != this.offset && (c10 = this.f1929ch) != '}' && c10 != 26) {
                    arrayList.add(object);
                } else {
                    throw new JSONException("illegal input : " + this.f1929ch + ", offset " + getOffset());
                }
            }
            boolean z9 = this.f1929ch == ',';
            this.comma = z9;
            if (z9) {
                next();
            }
            return arrayList;
        }
        C0086a.m464w(info("syntax error : " + this.f1929ch));
        return null;
    }

    public final void read(List list) {
        if (nextIfArrayStart()) {
            int i9 = this.level + 1;
            this.level = i9;
            if (i9 < this.context.maxLevel) {
                while (!nextIfArrayEnd()) {
                    list.add(ObjectReaderImplObject.INSTANCE.readObject(this, null, null, 0L));
                    nextIfComma();
                }
                this.level--;
                nextIfComma();
                return;
            }
            C0086a.m466y(this.level, "level too large : ");
            return;
        }
        C0086a.m446e(this.offset, this.f1929ch, "illegal input, offset ");
    }

    public final void readObject(Object obj, long j3) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Context context = this.context;
            ObjectReader objectReader = context.provider.getObjectReader(cls, ((context.features | j3) & Feature.FieldBased.mask) != 0);
            if (objectReader instanceof ObjectReaderBean) {
                ((ObjectReaderBean) objectReader).readObject(this, obj, j3);
                return;
            } else if (obj instanceof Map) {
                read((Map) obj, j3);
                return;
            } else {
                C0086a.m464w("read object not support");
                return;
            }
        }
        C0086a.m464w("object is null");
    }

    public final void read(Collection collection) {
        if (nextIfArrayStart()) {
            int i9 = this.level + 1;
            this.level = i9;
            if (i9 < this.context.maxLevel) {
                while (!nextIfArrayEnd()) {
                    collection.add(readAny());
                    nextIfComma();
                }
                this.level--;
                nextIfComma();
                return;
            }
            C0086a.m466y(this.level, "level too large : ");
            return;
        }
        C0086a.m446e(this.offset, this.f1929ch, "illegal input, offset ");
    }

    public final void readObject(Object obj, Feature... featureArr) {
        long j3 = 0;
        for (Feature feature : featureArr) {
            j3 |= feature.mask;
        }
        readObject(obj, j3);
    }

    public <T> T read(Type type) {
        Context context = this.context;
        return (T) context.provider.getObjectReader(type, (context.features & Feature.FieldBased.mask) != 0).readObject(this, null, null, 0L);
    }

    public final void read(Map map, Type type, Type type2, long j3) {
        Object object;
        ObjectReader objectReader;
        Object objPut;
        if (nextIfObjectStart()) {
            ObjectReader objectReader2 = this.context.getObjectReader(type);
            ObjectReader objectReader3 = this.context.getObjectReader(type2);
            long j4 = j3 | this.context.features;
            int i9 = 0;
            while (true) {
                if (this.f1929ch == '/') {
                    skipComment();
                }
                if (nextIfMatch('}')) {
                    nextIfComma();
                    return;
                }
                if (i9 != 0 && !this.comma) {
                    C0086a.m464w(info());
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
                if ((object2 != null || (Feature.IgnoreNullPropertyValue.mask & j4) == 0) && (objPut = map.put(obj, object2)) != null && (Feature.DuplicateKeyValueAsArray.mask & j4) != 0) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(object2);
                        map.put(obj, objPut);
                    } else {
                        map.put(obj, JSONArray.m1634of(objPut, object2));
                    }
                }
                i9++;
                objectReader3 = objectReader4;
                objectReader2 = objectReader;
            }
        } else {
            C0086a.m446e(this.offset, this.f1929ch, "illegal input， offset ");
        }
    }

    public <T> T read(Class<T> cls) {
        Context context = this.context;
        return (T) context.provider.getObjectReader(cls, (context.features & Feature.FieldBased.mask) != 0).readObject(this, null, null, 0L);
    }

    public void read(Map map, ObjectReader objectReader, long j3) {
        Object objPut;
        nextIfObjectStart();
        long j4 = this.context.features | j3;
        int i9 = 0;
        while (true) {
            if (this.f1929ch == '/') {
                skipComment();
            }
            if (nextIfObjectEnd()) {
                nextIfComma();
                return;
            }
            if (i9 != 0 && !this.comma) {
                C0086a.m464w(info());
                return;
            }
            String fieldName = readFieldName();
            ObjectReader objectReader2 = objectReader;
            long j5 = j3;
            Object object = objectReader2.readObject(this, objectReader.getObjectClass(), fieldName, j5);
            if ((object != null || (Feature.IgnoreNullPropertyValue.mask & j4) == 0) && (objPut = map.put(fieldName, object)) != null && (Feature.DuplicateKeyValueAsArray.mask & j4) != 0) {
                if (objPut instanceof Collection) {
                    ((Collection) objPut).add(object);
                    map.put(fieldName, objPut);
                } else {
                    map.put(fieldName, JSONArray.m1634of(objPut, object));
                }
            }
            i9++;
            objectReader = objectReader2;
            j3 = j5;
        }
    }
}
