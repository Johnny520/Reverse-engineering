package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface JSONB {

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface Constants {
        public static final int ARRAY_FIX_LEN = 15;
        public static final byte BC_ARRAY = -92;
        public static final byte BC_ARRAY_FIX_0 = -108;
        public static final byte BC_ARRAY_FIX_MAX = -93;
        public static final byte BC_ARRAY_FIX_MIN = -108;
        public static final byte BC_BIGINT = -69;
        public static final byte BC_BIGINT_LONG = -70;
        public static final byte BC_BINARY = -111;
        public static final byte BC_CHAR = -112;
        public static final byte BC_DECIMAL = -71;
        public static final byte BC_DECIMAL_LONG = -72;
        public static final byte BC_DOUBLE = -75;
        public static final byte BC_DOUBLE_LONG = -76;
        public static final byte BC_DOUBLE_NUM_0 = -78;
        public static final byte BC_DOUBLE_NUM_1 = -77;
        public static final byte BC_FALSE = -80;
        public static final byte BC_FLOAT = -73;
        public static final byte BC_FLOAT_INT = -74;
        public static final byte BC_INT16 = -68;
        public static final byte BC_INT32 = 72;
        public static final byte BC_INT32_BYTE_MAX = 63;
        public static final byte BC_INT32_BYTE_MIN = 48;
        public static final byte BC_INT32_BYTE_ZERO = 56;
        public static final byte BC_INT32_NUM_0 = 0;
        public static final byte BC_INT32_NUM_1 = 1;
        public static final byte BC_INT32_NUM_16 = 16;
        public static final byte BC_INT32_NUM_MAX = 47;
        public static final byte BC_INT32_NUM_MIN = -16;
        public static final byte BC_INT32_SHORT_MAX = 71;
        public static final byte BC_INT32_SHORT_MIN = 64;
        public static final byte BC_INT32_SHORT_ZERO = 68;
        public static final byte BC_INT64 = -66;
        public static final byte BC_INT64_BYTE_MAX = -41;
        public static final byte BC_INT64_BYTE_MIN = -56;
        public static final byte BC_INT64_BYTE_ZERO = -48;
        public static final byte BC_INT64_INT = -65;
        public static final byte BC_INT64_NUM_MAX = -17;
        public static final byte BC_INT64_NUM_MIN = -40;
        public static final byte BC_INT64_SHORT_MAX = -57;
        public static final byte BC_INT64_SHORT_MIN = -64;
        public static final byte BC_INT64_SHORT_ZERO = -60;
        public static final byte BC_INT8 = -67;
        public static final byte BC_LOCAL_DATE = -87;
        public static final byte BC_LOCAL_DATETIME = -88;
        public static final byte BC_LOCAL_TIME = -89;
        public static final byte BC_NULL = -81;
        public static final byte BC_OBJECT = -90;
        public static final byte BC_OBJECT_END = -91;
        public static final byte BC_REFERENCE = -109;
        public static final byte BC_STR_ASCII = 121;
        public static final byte BC_STR_ASCII_FIX_0 = 73;
        public static final byte BC_STR_ASCII_FIX_1 = 74;
        public static final byte BC_STR_ASCII_FIX_32 = 105;
        public static final byte BC_STR_ASCII_FIX_36 = 109;
        public static final byte BC_STR_ASCII_FIX_4 = 77;
        public static final byte BC_STR_ASCII_FIX_5 = 78;
        public static final byte BC_STR_ASCII_FIX_MAX = 120;
        public static final byte BC_STR_ASCII_FIX_MIN = 73;
        public static final byte BC_STR_GB18030 = 126;
        public static final byte BC_STR_UTF16 = 123;
        public static final byte BC_STR_UTF16BE = 125;
        public static final byte BC_STR_UTF16LE = 124;
        public static final byte BC_STR_UTF8 = 122;
        public static final byte BC_SYMBOL = 127;
        public static final byte BC_TIMESTAMP = -82;
        public static final byte BC_TIMESTAMP_MILLIS = -85;
        public static final byte BC_TIMESTAMP_MINUTES = -83;
        public static final byte BC_TIMESTAMP_SECONDS = -84;
        public static final byte BC_TIMESTAMP_WITH_TIMEZONE = -86;
        public static final byte BC_TRUE = -79;
        public static final byte BC_TYPED_ANY = -110;
        public static final int INT32_BYTE_MAX = 2047;
        public static final int INT32_BYTE_MIN = -2048;
        public static final int INT32_SHORT_MAX = 262143;
        public static final int INT32_SHORT_MIN = -262144;
        public static final int INT64_BYTE_MAX = 2047;
        public static final int INT64_BYTE_MIN = -2048;
        public static final int INT64_NUM_HIGH_VALUE = 15;
        public static final int INT64_NUM_LOW_VALUE = -8;
        public static final int INT64_SHORT_MAX = 262143;
        public static final int INT64_SHORT_MIN = -262144;
        public static final int STR_ASCII_FIX_LEN = 47;
    }

    static <T> T copy(T t10, JSONWriter.Feature... featureArr) {
        return (T) JSON.copy(t10, featureArr);
    }

    static void dump(byte[] bArr, SymbolTable symbolTable) {
        System.out.println(new JSONBDump(bArr, symbolTable, true).toString());
    }

    static byte[] fromJSONBytes(byte[] bArr) {
        JSONReader jSONReaderM6233of = JSONReader.m6233of(bArr);
        return toBytes(jSONReaderM6233of.getObjectReader(Object.class).readObject(jSONReaderM6233of, null, null, 0L));
    }

    static byte[] fromJSONString(String str) {
        return toBytes(JSON.parse(str));
    }

    static boolean isInt32(int i10) {
        return i10 >= -16 && i10 <= 72;
    }

    static boolean isInt32Byte(int i10) {
        return (i10 & 240) == 48;
    }

    static boolean isInt32ByteValue(int i10) {
        return ((i10 + 2048) & (-4096)) != 0;
    }

    static boolean isInt32ByteValue1(int i10) {
        return i10 >= -2048 && i10 <= 2047;
    }

    static boolean isInt32Num(int i10) {
        return i10 >= -16 && i10 <= 47;
    }

    static boolean isInt32Short(int i10) {
        return (i10 & 248) == 64;
    }

    static boolean isInt64Byte(int i10) {
        return ((i10 + 56) & 240) == 0;
    }

    static boolean isInt64Num(int i10) {
        return i10 >= -40 && i10 <= -17;
    }

    static boolean isInt64Short(int i10) {
        return (i10 & 248) == 192;
    }

    static Object parse(byte[] bArr, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            Object anyObject = jSONReaderJSONB.readAnyObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(anyObject);
            }
            jSONReaderJSONB.close();
            return anyObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{type}, null, List.class);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            List<T> list = (List) jSONReaderJSONB.read(parameterizedTypeImpl);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        T t10;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t10 = (T) jSONReaderJSONB.readAnyObject();
            } else {
                ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
                t10 = ((context.features & JSONReader.Feature.SupportArrayToBean.mask) != 0 && jSONReaderJSONB.isArray() && (objectReader instanceof ObjectReaderBean)) ? (T) objectReader.readArrayMappingJSONBObject(jSONReaderJSONB, cls, null, 0L) : (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static SymbolTable symbolTable(String... strArr) {
        return new SymbolTable(strArr);
    }

    static byte[] toBytes(String str) {
        byte[] bArrApply;
        int length;
        int i10 = 0;
        if (str == null) {
            return new byte[]{Constants.BC_NULL};
        }
        if (JDKUtils.JVM_VERSION == 8) {
            char[] charArray = JDKUtils.getCharArray(str);
            int length2 = charArray.length;
            if (length2 <= 47) {
                for (char c10 : charArray) {
                    if (c10 <= 127) {
                    }
                }
                byte[] bArr = new byte[charArray.length + 1];
                bArr[0] = (byte) (length2 + 73);
                while (i10 < length2) {
                    int i11 = i10 + 1;
                    bArr[i11] = (byte) charArray[i10];
                    i10 = i11;
                }
                return bArr;
            }
        } else {
            Function<String, byte[]> function = JDKUtils.STRING_VALUE;
            if (function != null && JDKUtils.STRING_CODER.applyAsInt(str) == 0 && (length = (bArrApply = function.apply(str)).length) <= 47) {
                byte[] bArr2 = new byte[bArrApply.length + 1];
                bArr2[0] = (byte) (length + 73);
                System.arraycopy(bArrApply, 0, bArr2, 1, bArrApply.length);
                return bArr2;
            }
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeString(str);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String toJSONString(byte[] bArr) {
        return new JSONBDump(bArr, false).toString();
    }

    static String typeName(byte b10) {
        if (b10 == 72) {
            return "INT32 " + Integer.toString(b10);
        }
        if (b10 == 127) {
            return "SYMBOL " + Integer.toString(b10);
        }
        switch (b10) {
            case -111:
                return "BINARY " + Integer.toString(b10);
            case -110:
                return "TYPED_ANY " + Integer.toString(b10);
            case -109:
                return "REFERENCE " + Integer.toString(b10);
            default:
                switch (b10) {
                    case -91:
                        return "OBJECT_END " + Integer.toString(b10);
                    case -90:
                        return "OBJECT " + Integer.toString(b10);
                    case -89:
                        return "LOCAL_TIME " + Integer.toString(b10);
                    case -88:
                        return "LOCAL_DATETIME " + Integer.toString(b10);
                    case -87:
                        return "LOCAL_DATE " + Integer.toString(b10);
                    case -86:
                        return "TIMESTAMP_WITH_TIMEZONE " + Integer.toString(b10);
                    case -85:
                        return "TIMESTAMP_MILLIS " + Integer.toString(b10);
                    case -84:
                        return "TIMESTAMP_SECONDS " + Integer.toString(b10);
                    case -83:
                        return "TIMESTAMP_MINUTES " + Integer.toString(b10);
                    case -82:
                        return "TIMESTAMP " + Integer.toString(b10);
                    case -81:
                        return "NULL " + Integer.toString(b10);
                    case -80:
                        return "FALSE " + Integer.toString(b10);
                    case -79:
                        return "TRUE " + Integer.toString(b10);
                    case -78:
                    case -77:
                    case -76:
                    case -75:
                        return "DOUBLE " + Integer.toString(b10);
                    case -74:
                    case -73:
                        return "FLOAT " + Integer.toString(b10);
                    case -72:
                    case -71:
                        return "DECIMAL " + Integer.toString(b10);
                    case -70:
                    case -69:
                        return "BIGINT " + Integer.toString(b10);
                    case -68:
                        return "INT16 " + Integer.toString(b10);
                    case -67:
                        return "INT8 " + Integer.toString(b10);
                    case -66:
                    case -65:
                        return "INT64 " + Integer.toString(b10);
                    default:
                        switch (b10) {
                            case Opcodes.ISHR /* 122 */:
                                return "STR_UTF8 " + Integer.toString(b10);
                            case Opcodes.LSHR /* 123 */:
                                return "STR_UTF16 " + Integer.toString(b10);
                            case Opcodes.IUSHR /* 124 */:
                                return "STR_UTF16LE " + Integer.toString(b10);
                            case Opcodes.LUSHR /* 125 */:
                                return "STR_UTF16BE " + Integer.toString(b10);
                            default:
                                if (b10 >= -108 && b10 <= -92) {
                                    return "ARRAY " + Integer.toString(b10);
                                }
                                if (b10 >= 73 && b10 <= 121) {
                                    return "STR_ASCII " + Integer.toString(b10);
                                }
                                if (b10 >= -16 && b10 <= 47) {
                                    return "INT32 " + Integer.toString(b10);
                                }
                                if (b10 >= 48 && b10 <= 63) {
                                    return "INT32 " + Integer.toString(b10);
                                }
                                if (b10 >= 64 && b10 <= 71) {
                                    return "INT32 " + Integer.toString(b10);
                                }
                                if (b10 >= -40 && b10 <= -17) {
                                    return "INT64 " + Integer.toString(b10);
                                }
                                if (b10 >= -56 && b10 <= -41) {
                                    return "INT64 " + Integer.toString(b10);
                                }
                                if (b10 < -64 || b10 > -57) {
                                    return Integer.toString(b10);
                                }
                                return "INT64 " + Integer.toString(b10);
                        }
                }
        }
    }

    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Feature... featureArr) {
        try {
            JSONWriter jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
            try {
                jSONWriterJSONB.config(featureArr);
                if (obj == null) {
                    jSONWriterJSONB.writeNull();
                } else {
                    jSONWriterJSONB.setRootObject(obj);
                    Class<?> cls = obj.getClass();
                    jSONWriterJSONB.getObjectWriter(cls, cls).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterJSONB.flushTo(outputStream);
                jSONWriterJSONB.close();
                return iFlushTo;
            } finally {
            }
        } catch (IOException e10) {
            C1565a.m6255a("writeJSONString error", e10);
            return 0;
        }
    }

    static String toJSONString(byte[] bArr, boolean z10) {
        return new JSONBDump(bArr, z10).toString();
    }

    static String toJSONString(byte[] bArr, SymbolTable symbolTable) {
        return toJSONString(bArr, symbolTable, false);
    }

    static String toJSONString(byte[] bArr, SymbolTable symbolTable, boolean z10) {
        return new JSONBDump(bArr, symbolTable, z10).toString();
    }

    static void dump(byte[] bArr) {
        System.out.println(toJSONString(bArr, true));
    }

    /* JADX INFO: renamed from: com.alibaba.fastjson2.JSONB$IO */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface InterfaceC1562IO {
        static int checkAndWriteTypeName(byte[] bArr, int i10, Object obj, Class<?> cls, JSONWriter jSONWriter) {
            Class<?> cls2;
            long features = jSONWriter.getFeatures();
            return ((JSONWriter.Feature.WriteClassName.mask & features) == 0 || obj == null || (cls2 = obj.getClass()) == cls || ((JSONWriter.Feature.NotWriteHashMapArrayListClassName.mask & features) != 0 && (cls2 == HashMap.class || cls2 == ArrayList.class)) || ((features & JSONWriter.Feature.NotWriteRootClassName.mask) != 0 && obj == jSONWriter.rootObject)) ? i10 : writeTypeName(bArr, i10, TypeUtils.getTypeName(cls2), jSONWriter);
        }

        static int enumCapacity(Enum r42, long j10) {
            if ((24576 & j10) != 0) {
                return stringCapacity((j10 & JSONWriter.Feature.WriteEnumUsingToString.mask) != 0 ? r42.toString() : r42.name());
            }
            return 5;
        }

        static int int64Capacity(Collection<Long> collection) {
            if (collection == null) {
                return 1;
            }
            return stringCapacity(collection.getClass().getName()) + 7 + (collection.size() * 9);
        }

        static int putStringSizeLarge(byte[] bArr, int i10, int i11) {
            if (i11 <= 262143) {
                IOUtils.putIntBE(bArr, i10, i11 + 2034499584);
                return i10 + 4;
            }
            IOUtils.putShortBE(bArr, i10, (short) 31048);
            IOUtils.putIntBE(bArr, i10 + 2, i11);
            return i10 + 6;
        }

        static int putStringSizeSmall(byte[] bArr, int i10, int i11) {
            bArr[i10] = Constants.BC_STR_ASCII;
            IOUtils.putShortBE(bArr, i10 + 1, (short) (i11 + 14336));
            return i10 + 3;
        }

        static int sizeOfInt(int i10) {
            if (i10 >= -16 && i10 <= 47) {
                return 1;
            }
            if (i10 < -2048 || i10 > 2047) {
                return (i10 < -262144 || i10 > 262143) ? 5 : 3;
            }
            return 2;
        }

        static int startArray(byte[] bArr, int i10, int i11) {
            boolean z10 = i11 <= 15;
            int i12 = i10 + 1;
            bArr[i10] = z10 ? (byte) (i11 - 108) : Constants.BC_ARRAY;
            return !z10 ? writeInt32(bArr, i12, i11) : i12;
        }

        static int stringCapacity(Collection<String> collection) {
            if (collection == null) {
                return 1;
            }
            int iStringCapacity = stringCapacity(collection.getClass().getName()) + 7;
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                iStringCapacity += stringCapacity(it.next());
            }
            return iStringCapacity;
        }

        static int writeBoolean(byte[] bArr, int i10, boolean[] zArr) {
            if (zArr == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            int iStartArray = startArray(bArr, i10, zArr.length);
            for (int i11 = 0; i11 < zArr.length; i11++) {
                bArr[iStartArray + i11] = zArr[i11] ? Constants.BC_TRUE : Constants.BC_FALSE;
            }
            return iStartArray + zArr.length;
        }

        static int writeDouble(byte[] bArr, int i10, double d10) {
            if (d10 == 0.0d || d10 == 1.0d) {
                bArr[i10] = d10 == 0.0d ? Constants.BC_DOUBLE_NUM_0 : Constants.BC_DOUBLE_NUM_1;
                return i10 + 1;
            }
            if (d10 >= -2.147483648E9d && d10 <= 2.147483647E9d) {
                long j10 = (long) d10;
                if (j10 == d10) {
                    bArr[i10] = Constants.BC_DOUBLE_LONG;
                    return writeInt64(bArr, i10 + 1, j10);
                }
            }
            bArr[i10] = Constants.BC_DOUBLE;
            IOUtils.putLongBE(bArr, i10 + 1, Double.doubleToLongBits(d10));
            return i10 + 9;
        }

        static int writeEnum(byte[] bArr, int i10, Enum r62, long j10) {
            if ((24576 & j10) != 0) {
                return writeString(bArr, i10, (j10 & JSONWriter.Feature.WriteEnumUsingToString.mask) != 0 ? r62.toString() : r62.name());
            }
            return writeInt32(bArr, i10, r62.ordinal());
        }

        static int writeFloat(byte[] bArr, int i10, float f10) {
            int i11 = (int) f10;
            if (i11 == f10 && ((262144 + i11) & (-524288)) == 0) {
                bArr[i10] = Constants.BC_FLOAT_INT;
                return writeInt32(bArr, i10 + 1, i11);
            }
            bArr[i10] = Constants.BC_FLOAT;
            IOUtils.putIntBE(bArr, i10 + 1, Float.floatToIntBits(f10));
            return i10 + 5;
        }

        static int writeInstant(byte[] bArr, int i10, Instant instant) {
            if (instant == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            bArr[i10] = Constants.BC_TIMESTAMP;
            return writeInt32(bArr, writeInt64(bArr, i10 + 1, instant.getEpochSecond()), instant.getNano());
        }

        static int writeInt16(byte[] bArr, int i10, Short sh, long j10) {
            if (sh == null) {
                bArr[i10] = (j10 & 16777280) == 0 ? Constants.BC_NULL : (byte) 0;
                return i10 + 1;
            }
            bArr[i10] = Constants.BC_INT16;
            IOUtils.putShortBE(bArr, i10 + 1, sh.shortValue());
            return i10 + 3;
        }

        static int writeInt32(byte[] bArr, int i10, int i11) {
            if (((i11 + 16) & (-64)) == 0) {
                int i12 = i10 + 1;
                bArr[i10] = (byte) i11;
                return i12;
            }
            if (((i11 + 2048) & (-4096)) == 0) {
                IOUtils.putShortBE(bArr, i10, (short) (i11 + 14336));
                return i10 + 2;
            }
            if (((262144 + i11) & (-524288)) == 0) {
                bArr[i10] = (byte) ((i11 >> 16) + 68);
                IOUtils.putShortBE(bArr, i10 + 1, (short) i11);
                return i10 + 3;
            }
            bArr[i10] = Constants.BC_INT32;
            IOUtils.putIntBE(bArr, i10 + 1, i11);
            return i10 + 5;
        }

        static int writeInt64(byte[] bArr, int i10, long j10) {
            if (j10 >= -8 && j10 <= 15) {
                int i11 = i10 + 1;
                bArr[i10] = (byte) (j10 - 32);
                return i11;
            }
            if (((JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME + j10) & (-4096)) == 0) {
                IOUtils.putShortBE(bArr, i10, (short) (j10 - 12288));
                return i10 + 2;
            }
            if (((262144 + j10) & (-524288)) == 0) {
                bArr[i10] = (byte) ((j10 >> 16) - 60);
                IOUtils.putShortBE(bArr, i10 + 1, (short) j10);
                return i10 + 3;
            }
            if (((2147483648L + j10) & (-4294967296L)) == 0) {
                bArr[i10] = Constants.BC_INT64_INT;
                IOUtils.putIntBE(bArr, i10 + 1, (int) j10);
                return i10 + 5;
            }
            bArr[i10] = Constants.BC_INT64;
            IOUtils.putLongBE(bArr, i10 + 1, j10);
            return i10 + 9;
        }

        static int writeInt8(byte[] bArr, int i10, Byte b10, long j10) {
            if (b10 == null) {
                bArr[i10] = (j10 & 16777280) == 0 ? Constants.BC_NULL : (byte) 0;
                return i10 + 1;
            }
            IOUtils.putShortLE(bArr, i10, (short) ((b10.byteValue() << 8) | Opcodes.ANEWARRAY));
            return i10 + 2;
        }

        static int writeLocalDate(byte[] bArr, int i10, LocalDate localDate) {
            if (localDate == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            bArr[i10] = Constants.BC_LOCAL_DATE;
            IOUtils.putIntBE(bArr, i10 + 1, localDate.getDayOfMonth() | (localDate.getYear() << 16) | (localDate.getMonthValue() << 8));
            return i10 + 5;
        }

        static int writeLocalDateTime(byte[] bArr, int i10, LocalDateTime localDateTime) {
            if (localDateTime == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            IOUtils.putIntBE(bArr, i10, (localDateTime.getYear() << 8) | (-1476395008) | localDateTime.getMonthValue());
            IOUtils.putIntBE(bArr, i10 + 4, (localDateTime.getDayOfMonth() << 24) | (localDateTime.getHour() << 16) | (localDateTime.getMinute() << 8) | localDateTime.getSecond());
            return writeInt32(bArr, i10 + 8, localDateTime.getNano());
        }

        static int writeLocalTime(byte[] bArr, int i10, LocalTime localTime) {
            if (localTime == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            IOUtils.putIntBE(bArr, i10, (localTime.getHour() << 16) | (-1493172224) | (localTime.getMinute() << 8) | localTime.getSecond());
            return writeInt32(bArr, i10 + 4, localTime.getNano());
        }

        static int writeNameRaw(byte[] bArr, int i10, byte[] bArr2, long j10, JSONWriter jSONWriter) {
            boolean z10;
            int iPutIfAbsent;
            int ordinalByHashCode;
            SymbolTable symbolTable = jSONWriter.symbolTable;
            JSONWriterJSONB jSONWriterJSONB = (JSONWriterJSONB) jSONWriter;
            if (symbolTable == null || (ordinalByHashCode = symbolTable.getOrdinalByHashCode(j10)) == -1) {
                if ((jSONWriter.context.features & JSONWriter.Feature.WriteNameAsSymbol.mask) == 0) {
                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                    return i10 + bArr2.length;
                }
                TLongIntHashMap tLongIntHashMap = jSONWriterJSONB.symbols;
                if (tLongIntHashMap != null) {
                    iPutIfAbsent = tLongIntHashMap.putIfAbsent(j10, jSONWriterJSONB.symbolIndex);
                    int i11 = jSONWriterJSONB.symbolIndex;
                    z10 = true;
                    if (iPutIfAbsent == i11) {
                        jSONWriterJSONB.symbolIndex = i11 + 1;
                        z10 = false;
                    }
                } else {
                    TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap();
                    jSONWriterJSONB.symbols = tLongIntHashMap2;
                    int i12 = jSONWriterJSONB.symbolIndex;
                    jSONWriterJSONB.symbolIndex = i12 + 1;
                    tLongIntHashMap2.put(j10, i12);
                    z10 = false;
                    iPutIfAbsent = i12;
                }
                if (!z10) {
                    int i13 = i10 + 1;
                    bArr[i10] = Constants.BC_SYMBOL;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    if (iPutIfAbsent < -16 || iPutIfAbsent > 47) {
                        return writeInt32(bArr, length, iPutIfAbsent);
                    }
                    int i14 = length + 1;
                    bArr[length] = (byte) iPutIfAbsent;
                    return i14;
                }
                ordinalByHashCode = -iPutIfAbsent;
            }
            int i15 = i10 + 1;
            bArr[i10] = Constants.BC_SYMBOL;
            int i16 = -ordinalByHashCode;
            if (i16 < -16 || i16 > 47) {
                return writeInt32(bArr, i15, i16);
            }
            int i17 = i10 + 2;
            bArr[i15] = (byte) i16;
            return i17;
        }

        static int writeOffsetDateTime(byte[] bArr, int i10, OffsetDateTime offsetDateTime) {
            if (offsetDateTime == null) {
                bArr[i10] = Constants.BC_NULL;
            } else {
                IOUtils.putIntBE(bArr, i10, (offsetDateTime.getYear() << 8) | (-1442840576) | offsetDateTime.getMonthValue());
                IOUtils.putIntBE(bArr, i10 + 4, (offsetDateTime.getDayOfMonth() << 24) | (offsetDateTime.getHour() << 16) | (offsetDateTime.getMinute() << 8) | offsetDateTime.getSecond());
                int iWriteInt32 = writeInt32(bArr, i10 + 8, offsetDateTime.getNano());
                String id2 = offsetDateTime.getOffset().getId();
                int length = id2.length();
                bArr[iWriteInt32] = (byte) (length + 73);
                id2.getBytes(0, length, bArr, iWriteInt32 + 1);
                i10 = iWriteInt32 + length;
            }
            return i10 + 1;
        }

        static int writeOffsetTime(byte[] bArr, int i10, OffsetTime offsetTime) {
            if (offsetTime == null) {
                bArr[i10] = Constants.BC_NULL;
            } else {
                IOUtils.putIntBE(bArr, i10, -1442336255);
                IOUtils.putIntBE(bArr, i10 + 4, (offsetTime.getHour() << 16) | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE | (offsetTime.getMinute() << 8) | offsetTime.getSecond());
                int iWriteInt32 = writeInt32(bArr, i10 + 8, offsetTime.getNano());
                String id2 = offsetTime.getOffset().getId();
                int length = id2.length();
                bArr[iWriteInt32] = (byte) (length + 73);
                id2.getBytes(0, length, bArr, iWriteInt32 + 1);
                i10 = iWriteInt32 + length;
            }
            return i10 + 1;
        }

        static int writeReference(byte[] bArr, int i10, String str, JSONWriter jSONWriter) {
            if (jSONWriter.lastReference == str) {
                str = "#-1";
            } else {
                jSONWriter.lastReference = str;
            }
            bArr[i10] = Constants.BC_REFERENCE;
            return writeString(bArr, i10 + 1, str);
        }

        static int writeString(byte[] bArr, int i10, char[] cArr, int i11, int i12) {
            boolean zIsLatin1;
            if (i12 < 47) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) (i12 + 73);
                int i14 = i11 + i12;
                int i15 = i11;
                while (true) {
                    if (i15 >= i14) {
                        zIsLatin1 = true;
                        break;
                    }
                    char c10 = cArr[i15];
                    if (c10 > 255) {
                        zIsLatin1 = false;
                        break;
                    }
                    bArr[i13] = (byte) c10;
                    i15++;
                    i13++;
                }
                if (zIsLatin1) {
                    return i13;
                }
            } else {
                zIsLatin1 = IOUtils.isLatin1(cArr, i11, i12);
            }
            return zIsLatin1 ? writeStringLatin1(bArr, i10, cArr, i11, i12) : writeUTF8(bArr, i10, cArr, i11, i12);
        }

        static int writeStringLatin1(byte[] bArr, int i10, char[] cArr, int i11, int i12) {
            int iWriteInt32;
            if (i12 <= 47) {
                iWriteInt32 = i10 + 1;
                bArr[i10] = (byte) (i12 + 73);
            } else {
                bArr[i10] = Constants.BC_STR_ASCII;
                if (i12 <= 2047) {
                    IOUtils.putShortBE(bArr, i10 + 1, (short) (i12 + 14336));
                    iWriteInt32 = i10 + 3;
                } else {
                    iWriteInt32 = writeInt32(bArr, i10 + 1, i12);
                }
            }
            int i13 = 0;
            while (i13 < i12) {
                bArr[iWriteInt32] = (byte) cArr[i11 + i13];
                i13++;
                iWriteInt32++;
            }
            return iWriteInt32;
        }

        static int writeStringUTF16(byte[] bArr, int i10, byte[] bArr2) {
            int length = bArr2.length;
            bArr[i10] = JDKUtils.BIG_ENDIAN ? Constants.BC_STR_UTF16BE : Constants.BC_STR_UTF16LE;
            int iWriteInt32 = writeInt32(bArr, i10 + 1, length);
            System.arraycopy(bArr2, 0, bArr, iWriteInt32, length);
            return iWriteInt32 + length;
        }

        static int writeSymbol(byte[] bArr, int i10, int i11) {
            int i12 = i10 + 1;
            bArr[i10] = Constants.BC_SYMBOL;
            if (i11 >= -16 && i11 <= 47) {
                int i13 = i10 + 2;
                bArr[i12] = (byte) i11;
                return i13;
            }
            if (i11 < -2048 || i11 > 2047) {
                return writeInt32(bArr, i12, i11);
            }
            IOUtils.putShortBE(bArr, i12, (short) (i11 + 14336));
            return i10 + 3;
        }

        static int writeTypeName(byte[] bArr, int i10, String str, JSONWriter jSONWriter) {
            int ordinalByHashCode;
            TLongIntHashMap tLongIntHashMap;
            JSONWriterJSONB jSONWriterJSONB = (JSONWriterJSONB) jSONWriter;
            SymbolTable symbolTable = jSONWriter.symbolTable;
            int i11 = i10 + 1;
            bArr[i10] = Constants.BC_TYPED_ANY;
            long jHashCode64 = Fnv.hashCode64(str);
            if (symbolTable != null) {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(jHashCode64);
                if (ordinalByHashCode == -1 && (tLongIntHashMap = jSONWriterJSONB.symbols) != null) {
                    ordinalByHashCode = tLongIntHashMap.get(jHashCode64);
                }
            } else {
                TLongIntHashMap tLongIntHashMap2 = jSONWriterJSONB.symbols;
                ordinalByHashCode = tLongIntHashMap2 != null ? tLongIntHashMap2.get(jHashCode64) : -1;
            }
            if (ordinalByHashCode != -1) {
                return writeInt32(bArr, i11, ordinalByHashCode);
            }
            if (jSONWriterJSONB.symbols == null) {
                jSONWriterJSONB.symbols = new TLongIntHashMap();
            }
            TLongIntHashMap tLongIntHashMap3 = jSONWriterJSONB.symbols;
            int i12 = jSONWriterJSONB.symbolIndex;
            jSONWriterJSONB.symbolIndex = i12 + 1;
            tLongIntHashMap3.put(jHashCode64, i12);
            return writeInt32(bArr, writeString(bArr, i11, str), i12);
        }

        static int writeUTF8(byte[] bArr, int i10, char[] cArr, int i11, int i12) {
            int iSizeOfInt = sizeOfInt(i12 * 3);
            int i13 = i10 + iSizeOfInt + 1;
            int iEncodeUTF8 = ((IOUtils.encodeUTF8(cArr, i11, i12, bArr, i13) - i10) - iSizeOfInt) - 1;
            int iSizeOfInt2 = sizeOfInt(iEncodeUTF8);
            if (iSizeOfInt != iSizeOfInt2) {
                System.arraycopy(bArr, i13, bArr, iSizeOfInt2 + i10 + 1, iEncodeUTF8);
            }
            bArr[i10] = Constants.BC_STR_UTF8;
            return writeInt32(bArr, i10 + 1, iEncodeUTF8) + iEncodeUTF8;
        }

        static int writeUUID(byte[] bArr, int i10, UUID uuid) {
            if (uuid == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            IOUtils.putShortLE(bArr, i10, (short) 4241);
            IOUtils.putLongBE(bArr, i10 + 2, uuid.getMostSignificantBits());
            IOUtils.putLongBE(bArr, i10 + 10, uuid.getLeastSignificantBits());
            return i10 + 18;
        }

        static int writeBoolean(byte[] bArr, int i10, boolean z10) {
            bArr[i10] = z10 ? Constants.BC_TRUE : Constants.BC_FALSE;
            return i10 + 1;
        }

        static int writeInt8(byte[] bArr, int i10, byte b10) {
            IOUtils.putShortLE(bArr, i10, (short) ((b10 << 8) | Opcodes.ANEWARRAY));
            return i10 + 2;
        }

        static int writeBoolean(byte[] bArr, int i10, Boolean bool) {
            byte b10;
            if (bool == null) {
                b10 = Constants.BC_NULL;
            } else {
                b10 = bool.booleanValue() ? Constants.BC_TRUE : Constants.BC_FALSE;
            }
            bArr[i10] = b10;
            return i10 + 1;
        }

        static int writeInt16(byte[] bArr, int i10, short s10) {
            bArr[i10] = Constants.BC_INT16;
            IOUtils.putShortBE(bArr, i10 + 1, s10);
            return i10 + 3;
        }

        static int stringCapacity(String[] strArr) {
            if (strArr == null) {
                return 1;
            }
            int iStringCapacity = 6;
            for (String str : strArr) {
                iStringCapacity += stringCapacity(str);
            }
            return iStringCapacity;
        }

        static int writeFloat(byte[] bArr, int i10, float[] fArr) {
            if (fArr == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            int iStartArray = startArray(bArr, i10, fArr.length);
            for (float f10 : fArr) {
                iStartArray = writeFloat(bArr, iStartArray, f10);
            }
            return iStartArray;
        }

        static int writeSymbol(byte[] bArr, int i10, String str, SymbolTable symbolTable) {
            if (str == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            int ordinal = symbolTable.getOrdinal(str);
            if (ordinal >= 0) {
                bArr[i10] = Constants.BC_STR_ASCII;
                return writeInt32(bArr, i10 + 1, -ordinal);
            }
            return writeString(bArr, i10, str);
        }

        static int stringCapacity(String str) {
            if (str == null) {
                return 0;
            }
            int length = str.length();
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            return (toIntFunction == null || JDKUtils.STRING_VALUE == null) ? (length * 3) + 6 : (length << toIntFunction.applyAsInt(str)) + 6;
        }

        static int writeFloat(byte[] bArr, int i10, Float f10, long j10) {
            float fFloatValue;
            if (f10 != null) {
                fFloatValue = f10.floatValue();
            } else {
                if ((j10 & 16777280) == 0) {
                    bArr[i10] = Constants.BC_NULL;
                    return i10 + 1;
                }
                fFloatValue = 0.0f;
            }
            return writeFloat(bArr, i10, fFloatValue);
        }

        static int writeString(byte[] bArr, int i10, String[] strArr, long j10) {
            if (strArr == null) {
                bArr[i10] = (j10 & JSONWriter.WRITE_ARRAY_NULL_MASK) != 0 ? (byte) -108 : Constants.BC_NULL;
                return i10 + 1;
            }
            int iStartArray = startArray(bArr, i10, strArr.length);
            for (String str : strArr) {
                iStartArray = writeString(bArr, iStartArray, str);
            }
            return iStartArray;
        }

        static int writeStringLatin1(byte[] bArr, int i10, byte[] bArr2) {
            int iPutStringSizeLarge;
            int length = bArr2.length;
            if (length <= 47) {
                iPutStringSizeLarge = i10 + 1;
                bArr[i10] = (byte) (length + 73);
            } else if (length <= 2047) {
                iPutStringSizeLarge = putStringSizeSmall(bArr, i10, length);
            } else {
                iPutStringSizeLarge = putStringSizeLarge(bArr, i10, length);
            }
            System.arraycopy(bArr2, 0, bArr, iPutStringSizeLarge, bArr2.length);
            return iPutStringSizeLarge + length;
        }

        static int writeString(byte[] bArr, int i10, String str) {
            Function<String, byte[]> function;
            if (str == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null) {
                int iApplyAsInt = toIntFunction.applyAsInt(str);
                byte[] bArrApply = function.apply(str);
                if (iApplyAsInt == 0) {
                    return writeStringLatin1(bArr, i10, bArrApply);
                }
                return writeStringUTF16(bArr, i10, bArrApply);
            }
            return writeString(bArr, i10, JDKUtils.getCharArray(str));
        }

        static int writeInt32(byte[] bArr, int i10, Integer num, long j10) {
            if (num == null) {
                bArr[i10] = (j10 & 16777280) == 0 ? Constants.BC_NULL : (byte) 0;
                return i10 + 1;
            }
            return writeInt32(bArr, i10, num.intValue());
        }

        static int writeString(byte[] bArr, int i10, char[] cArr) {
            return writeString(bArr, i10, cArr, 0, cArr.length);
        }

        static int writeString(byte[] bArr, int i10, Collection<String> collection, long j10) {
            if (collection == null) {
                bArr[i10] = (j10 & JSONWriter.WRITE_ARRAY_NULL_MASK) != 0 ? (byte) -108 : Constants.BC_NULL;
                return i10 + 1;
            }
            int iStartArray = startArray(bArr, i10, collection.size());
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                iStartArray = writeString(bArr, iStartArray, it.next());
            }
            return iStartArray;
        }

        static int writeDouble(byte[] bArr, int i10, Double d10, long j10) {
            if (d10 == null) {
                long j11 = j10 & 16777280;
                byte b10 = Constants.BC_DOUBLE_NUM_0;
                bArr[i10] = j11 == 0 ? (byte) -81 : (byte) -78;
                if (j11 == 0) {
                    b10 = -81;
                }
                bArr[i10] = b10;
                return i10 + 1;
            }
            return writeDouble(bArr, i10, d10.doubleValue());
        }

        static int writeDouble(byte[] bArr, int i10, double[] dArr) {
            if (dArr == null) {
                bArr[i10] = Constants.BC_NULL;
                return i10 + 1;
            }
            int iStartArray = startArray(bArr, i10, dArr.length);
            for (double d10 : dArr) {
                iStartArray = writeDouble(bArr, iStartArray, d10);
            }
            return iStartArray;
        }

        static int writeInt64(byte[] bArr, int i10, Long l10, long j10) {
            if (l10 == null) {
                bArr[i10] = (j10 & 16777280) == 0 ? Constants.BC_NULL : (byte) -32;
                return i10 + 1;
            }
            return writeInt64(bArr, i10, l10.longValue());
        }

        static int writeInt64(byte[] bArr, int i10, Collection<Long> collection, long j10) {
            if (collection == null) {
                bArr[i10] = (j10 & JSONWriter.WRITE_ARRAY_NULL_MASK) != 0 ? (byte) -108 : Constants.BC_NULL;
                return i10 + 1;
            }
            int iStartArray = startArray(bArr, i10, collection.size());
            Iterator<Long> it = collection.iterator();
            while (it.hasNext()) {
                iStartArray = writeInt64(bArr, iStartArray, it.next(), j10);
            }
            return iStartArray;
        }
    }

    static Object parse(byte[] bArr, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            Object anyObject = jSONReaderJSONB.readAnyObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(anyObject);
            }
            jSONReaderJSONB.close();
            return anyObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static Object parse(InputStream inputStream, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            Object any = jSONReaderJSONB.readAny();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(any);
            }
            jSONReaderJSONB.close();
            return any;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static Object parse(byte[] bArr, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), symbolTable, featureArr), bArr, 0, bArr.length);
        try {
            Object anyObject = jSONReaderJSONB.readAnyObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(anyObject);
            }
            jSONReaderJSONB.close();
            return anyObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONArray parseArray(InputStream inputStream, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            JSONArray jSONArray = (JSONArray) jSONReaderJSONB.readArray();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONArray);
            }
            jSONReaderJSONB.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONArray parseArray(byte[] bArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            JSONArray jSONArray = (JSONArray) jSONReaderJSONB.readArray();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONArray);
            }
            jSONReaderJSONB.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{type}, null, List.class);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            List<T> list = (List) jSONReaderJSONB.read(parameterizedTypeImpl);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type... typeArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            List<T> list = jSONReaderJSONB.readList(typeArr);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type[] typeArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            List<T> list = jSONReaderJSONB.readList(typeArr);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls) {
        T t10;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t10 = (T) jSONReaderJSONB.readAny();
            } else {
                t10 = (T) defaultObjectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static byte[] toBytes(int i10) {
        if (i10 >= -16 && i10 <= 47) {
            return new byte[]{(byte) i10};
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt32(i10);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static byte[] toBytes(byte b10) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt8(b10);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Type... typeArr) {
        return (T) parseObject(bArr, new MultiType(typeArr));
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(defaultObjectReaderProvider, symbolTable), bArr, 0, bArr.length);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static byte[] toBytes(short s10) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt16(s10);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, symbolTable, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static byte[] toBytes(long j10) {
        if (j10 >= -8 && j10 <= 15) {
            return new byte[]{(byte) (j10 - 32)};
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt64(j10);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static byte[] toBytes(boolean z10) {
        return new byte[]{z10 ? Constants.BC_TRUE : Constants.BC_FALSE};
    }

    static byte[] toBytes(String str, Charset charset) {
        byte b10;
        if (str == null) {
            return new byte[]{Constants.BC_NULL};
        }
        if (charset == StandardCharsets.UTF_16) {
            b10 = Constants.BC_STR_UTF16;
        } else if (charset == StandardCharsets.UTF_16BE) {
            b10 = Constants.BC_STR_UTF16BE;
        } else if (charset == StandardCharsets.UTF_16LE) {
            b10 = Constants.BC_STR_UTF16LE;
        } else if (charset == StandardCharsets.UTF_8) {
            b10 = Constants.BC_STR_UTF8;
        } else if (charset == StandardCharsets.US_ASCII || charset == StandardCharsets.ISO_8859_1) {
            b10 = Constants.BC_STR_ASCII;
        } else {
            if (charset == null || !"GB18030".equals(charset.name())) {
                return toBytes(str);
            }
            b10 = Constants.BC_STR_GB18030;
        }
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        int i10 = length + 2;
        if (bytes.length > 47) {
            if (bytes.length <= 2047) {
                i10 = length + 3;
            } else {
                i10 = bytes.length <= 262143 ? length + 4 : length + 6;
            }
        }
        byte[] bArr = new byte[i10];
        bArr[0] = b10;
        System.arraycopy(bytes, 0, bArr, InterfaceC1562IO.writeInt32(bArr, 1, bytes.length), bytes.length);
        return bArr;
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        T t10;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, filter, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        for (JSONReader.Feature feature : featureArr) {
            try {
                context.features |= feature.mask;
            } finally {
            }
        }
        if (cls == Object.class) {
            t10 = (T) jSONReaderJSONB.readAnyObject();
        } else {
            t10 = (T) defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
        }
        if (jSONReaderJSONB.resolveTasks != null) {
            jSONReaderJSONB.handleResolveTasks(t10);
        }
        jSONReaderJSONB.close();
        return t10;
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable, Filter[] filterArr, JSONReader.Feature... featureArr) {
        T t10;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, symbolTable, filterArr, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        for (JSONReader.Feature feature : featureArr) {
            try {
                context.features |= feature.mask;
            } finally {
            }
        }
        if (type == Object.class) {
            t10 = (T) jSONReaderJSONB.readAnyObject();
        } else {
            t10 = (T) defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
        }
        if (jSONReaderJSONB.resolveTasks != null) {
            jSONReaderJSONB.handleResolveTasks(t10);
        }
        jSONReaderJSONB.close();
        return t10;
    }

    static byte[] toBytes(Object obj) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                Class<?> cls = obj.getClass();
                context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
        }
    }

    static byte[] toBytes(Object obj, JSONWriter.Context context) {
        if (context == null) {
            context = JSONFactory.createWriteContext();
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.rootObject = obj;
                jSONWriterJSONB.path = JSONWriter.Path.ROOT;
                boolean z10 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, z10);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, TypeReference typeReference, JSONReader.Feature... featureArr) {
        return (T) parseObject(bArr, typeReference.getType(), featureArr);
    }

    static <T> T parseObject(InputStream inputStream, Class cls, JSONReader.Feature... featureArr) {
        return (T) parseObject(inputStream, cls, JSONFactory.createReadContext(featureArr));
    }

    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Feature... featureArr) {
        return (T) parseObject(inputStream, type, JSONFactory.createReadContext(featureArr));
    }

    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Context context) {
        T t10;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            if (type == Object.class) {
                t10 = (T) jSONReaderJSONB.readAny();
            } else {
                t10 = (T) context.getObjectReader(type).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static byte[] toBytes(Object obj, SymbolTable symbolTable) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, Class cls, JSONReader.Context context) {
        T t10;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            if (cls == Object.class) {
                t10 = (T) jSONReaderJSONB.readAny();
            } else {
                t10 = (T) context.getObjectReader(cls).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static byte[] toBytes(Object obj, SymbolTable symbolTable, JSONWriter.Feature... featureArr) {
        return toBytes(obj, new JSONWriter.Context(new JSONWriter.Feature[0]), symbolTable, featureArr);
    }

    static byte[] toBytes(Object obj, JSONWriter.Context context, SymbolTable symbolTable, JSONWriter.Feature... featureArr) {
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, int i10, Type type, JSONReader.Context context) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r2.length - 1)];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, byte[]> atomicReferenceFieldUpdater = JSONFactory.BYTES_UPDATER;
        byte[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new byte[8192];
        }
        try {
            if (andSet.length < i10) {
                andSet = new byte[i10];
            }
            int i11 = inputStream.read(andSet, 0, i10);
            if (i11 != i10) {
                throw new IllegalArgumentException("deserialize failed. expected read length: " + i10 + " but actual read: " + i11);
            }
            T t10 = (T) parseObject(andSet, 0, i10, type, context);
            atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            return t10;
        } catch (Throwable th) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
            throw th;
        }
    }

    static byte[] toBytes(Object obj, SymbolTable symbolTable, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        context.configFilter(filterArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, int i10, Type type, JSONReader.Feature... featureArr) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r2.length - 1)];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, byte[]> atomicReferenceFieldUpdater = JSONFactory.BYTES_UPDATER;
        byte[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new byte[8192];
        }
        try {
            if (andSet.length < i10) {
                andSet = new byte[i10];
            }
            int i11 = inputStream.read(andSet, 0, i10);
            if (i11 != i10) {
                throw new IllegalArgumentException("deserialize failed. expected read length: " + i10 + " but actual read: " + i11);
            }
            T t10 = (T) parseObject(andSet, 0, i10, type, featureArr);
            atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            return t10;
        } catch (Throwable th) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static byte[] toBytes(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.rootObject = obj;
                jSONWriterJSONB.path = JSONWriter.Path.ROOT;
                boolean z10 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, z10);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Context context) {
        T t10;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t10 = (T) jSONReaderJSONB.readAnyObject();
            } else {
                ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONReader.Feature.SupportArrayToBean.mask) != 0 && jSONReaderJSONB.isArray() && (objectReader instanceof ObjectReaderBean)) {
                    t10 = (T) objectReader.readArrayMappingJSONBObject(jSONReaderJSONB, cls, null, 0L);
                } else {
                    t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
                }
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Class<T> cls) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Type type) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Class<T> cls, JSONReader.Feature... featureArr) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Type type, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i10, i11);
        try {
            T t10 = (T) context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Type type, JSONReader.Feature... featureArr) {
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(JSONFactory.createReadContext(featureArr), bArr, i10, i11);
        try {
            T t10 = (T) jSONReaderJSONB.getObjectReader(type).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Class<T> cls, SymbolTable symbolTable) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Type type, SymbolTable symbolTable) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Class<T> cls, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, int i10, int i11, Type type, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i10, i11);
        try {
            T t10 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t10);
            }
            jSONReaderJSONB.close();
            return t10;
        } finally {
        }
    }
}
