package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p012ah.C0086a;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface JSONB {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static <T> T copy(T t9, JSONWriter.Feature... featureArr) {
        return (T) JSON.copy(t9, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void dump(byte[] bArr, SymbolTable symbolTable) {
        System.out.println(new JSONBDump(bArr, symbolTable, true).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static byte[] fromJSONBytes(byte[] bArr) {
        JSONReader jSONReaderM1673of = JSONReader.m1673of(bArr);
        return toBytes(jSONReaderM1673of.getObjectReader(Object.class).readObject(jSONReaderM1673of, null, null, 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static byte[] fromJSONString(String str) {
        return toBytes(JSON.parse(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(byte[] bArr, JSONReader.Feature... featureArr) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        boolean z9 = (context.features & JSONReader.Feature.FieldBased.mask) != 0;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            Object jSONBObject = objectReaderProvider.getObjectReader(Object.class, z9).readJSONBObject(jSONReaderJSONB, null, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONBObject);
            }
            jSONReaderJSONB.close();
            return jSONBObject;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static <T> List<T> parseArray(byte[] bArr, Type type) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{type}, null, List.class);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            List<T> list = (List) jSONReaderJSONB.read(parameterizedTypeImpl);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:52|9|10)|49|7) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r2 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable, Filter[] filterArr, JSONReader.Feature... featureArr) throws Throwable {
        JSONReaderJSONB jSONReaderJSONB;
        Throwable th2;
        T t9;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, symbolTable);
        context.config(filterArr, featureArr);
        JSONReaderJSONB jSONReaderJSONB2 = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        for (JSONReader.Feature feature : featureArr) {
            try {
                context.features |= feature.mask;
            } catch (Throwable th3) {
                th2 = th3;
                jSONReaderJSONB = jSONReaderJSONB2;
                try {
                    jSONReaderJSONB.close();
                    throw th2;
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                    throw th2;
                }
            }
        }
        try {
            if (type != Object.class) {
                t9 = (T) objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB2, type, null, 0L);
                jSONReaderJSONB = jSONReaderJSONB2;
            } else if (jSONReaderJSONB2.getType() == -110) {
                t9 = (T) jSONReaderJSONB2.checkAutoType(Object.class, 0L, 0L).readJSONBObject(jSONReaderJSONB2, type, null, context.features);
                jSONReaderJSONB = jSONReaderJSONB2;
            } else {
                jSONReaderJSONB = jSONReaderJSONB2;
                t9 = (T) jSONReaderJSONB.readAny();
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            jSONReaderJSONB.close();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static SymbolTable symbolTable(String... strArr) {
        return new SymbolTable(strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        int i9 = length + 2;
        if (bytes.length > 47) {
            i9 = bytes.length <= 2047 ? length + 3 : bytes.length <= 262143 ? length + 4 : length + 6;
        }
        byte[] bArr = new byte[i9];
        bArr[0] = b10;
        System.arraycopy(bytes, 0, bArr, writeInt(bArr, 1, bytes.length) + 1, bytes.length);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static String toJSONString(byte[] bArr) {
        return new JSONBDump(bArr, false).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static String typeName(byte b10) {
        if (b10 == 72) {
            return AbstractC0255e.m1017f(b10, new StringBuilder("INT32 "));
        }
        if (b10 == 127) {
            return AbstractC0255e.m1017f(b10, new StringBuilder("SYMBOL "));
        }
        switch (b10) {
            case -111:
                return AbstractC0255e.m1017f(b10, new StringBuilder("BINARY "));
            case -110:
                return AbstractC0255e.m1017f(b10, new StringBuilder("TYPED_ANY "));
            case -109:
                return AbstractC0255e.m1017f(b10, new StringBuilder("REFERENCE "));
            default:
                switch (b10) {
                    case -91:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("OBJECT_END "));
                    case -90:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("OBJECT "));
                    case -89:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("LOCAL_TIME "));
                    case -88:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("LOCAL_DATETIME "));
                    case -87:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("LOCAL_DATE "));
                    case -86:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("TIMESTAMP_WITH_TIMEZONE "));
                    case -85:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("TIMESTAMP_MILLIS "));
                    case -84:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("TIMESTAMP_SECONDS "));
                    case -83:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("TIMESTAMP_MINUTES "));
                    case -82:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("TIMESTAMP "));
                    case -81:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("NULL "));
                    case -80:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("FALSE "));
                    case -79:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("TRUE "));
                    case -78:
                    case -77:
                    case -76:
                    case -75:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("DOUBLE "));
                    case -74:
                    case -73:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("FLOAT "));
                    case -72:
                    case -71:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("DECIMAL "));
                    case -70:
                    case -69:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("BIGINT "));
                    case -68:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("INT16 "));
                    case -67:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("INT8 "));
                    case -66:
                    case -65:
                        return AbstractC0255e.m1017f(b10, new StringBuilder("INT64 "));
                    default:
                        switch (b10) {
                            case 122:
                                return AbstractC0255e.m1017f(b10, new StringBuilder("STR_UTF8 "));
                            case 123:
                                return AbstractC0255e.m1017f(b10, new StringBuilder("STR_UTF16 "));
                            case 124:
                                return AbstractC0255e.m1017f(b10, new StringBuilder("STR_UTF16LE "));
                            case 125:
                                return AbstractC0255e.m1017f(b10, new StringBuilder("STR_UTF16BE "));
                            default:
                                return (b10 < -108 || b10 > -92) ? (b10 < 73 || b10 > 121) ? (b10 < -16 || b10 > 47) ? (b10 < 48 || b10 > 63) ? (b10 < 64 || b10 > 71) ? (b10 < -40 || b10 > -17) ? (b10 < -56 || b10 > -41) ? (b10 < -64 || b10 > -57) ? Integer.toString(b10) : AbstractC0255e.m1017f(b10, new StringBuilder("INT64 ")) : AbstractC0255e.m1017f(b10, new StringBuilder("INT64 ")) : AbstractC0255e.m1017f(b10, new StringBuilder("INT64 ")) : AbstractC0255e.m1017f(b10, new StringBuilder("INT32 ")) : AbstractC0255e.m1017f(b10, new StringBuilder("INT32 ")) : AbstractC0255e.m1017f(b10, new StringBuilder("INT32 ")) : AbstractC0255e.m1017f(b10, new StringBuilder("STR_ASCII ")) : AbstractC0255e.m1017f(b10, new StringBuilder("ARRAY "));
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static int writeInt(byte[] bArr, int i9, int i10) {
        if (i10 >= -16 && i10 <= 47) {
            bArr[i9] = (byte) i10;
            return 1;
        }
        if (i10 >= -2048 && i10 <= 2047) {
            bArr[i9] = (byte) ((i10 >> 8) + 56);
            bArr[i9 + 1] = (byte) i10;
            return 2;
        }
        if (i10 >= -262144 && i10 <= 262143) {
            bArr[i9] = (byte) ((i10 >> 16) + 68);
            bArr[i9 + 1] = (byte) (i10 >> 8);
            bArr[i9 + 2] = (byte) i10;
            return 3;
        }
        bArr[i9] = Constants.BC_INT32;
        bArr[i9 + 1] = (byte) (i10 >>> 24);
        bArr[i9 + 2] = (byte) (i10 >>> 16);
        bArr[i9 + 3] = (byte) (i10 >>> 8);
        bArr[i9 + 4] = (byte) i10;
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
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
        } catch (IOException e6) {
            C0086a.m465x("writeJSONString error", e6);
            return 0;
        }
    }

    static String toJSONString(byte[] bArr, boolean z9) {
        return new JSONBDump(bArr, z9).toString();
    }

    static String toJSONString(byte[] bArr, SymbolTable symbolTable) {
        return new JSONBDump(bArr, symbolTable, false).toString();
    }

    static void dump(byte[] bArr) {
        System.out.println(toJSONString(bArr, true));
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
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static Object parse(byte[] bArr, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            Object any = jSONReaderJSONB.readAny();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(any);
            }
            jSONReaderJSONB.close();
            return any;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static JSONArray parseArray(byte[] bArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            JSONArray jSONArray = (JSONArray) jSONReaderJSONB.readArray();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONArray);
            }
            jSONReaderJSONB.close();
            return jSONArray;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
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
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{type}, null, List.class);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr), bArr, 0, bArr.length);
        try {
            List<T> list = (List) jSONReaderJSONB.read(parameterizedTypeImpl);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static Object parse(byte[] bArr, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, symbolTable, featureArr);
        boolean z9 = (context.features & JSONReader.Feature.FieldBased.mask) != 0;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            Object jSONBObject = objectReaderProvider.getObjectReader(Object.class, z9).readJSONBObject(jSONReaderJSONB, null, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONBObject);
            }
            jSONReaderJSONB.close();
            return jSONBObject;
        } finally {
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type... typeArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            List<T> list = jSONReaderJSONB.readList(typeArr);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type[] typeArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr), bArr, 0, bArr.length);
        try {
            List<T> list = jSONReaderJSONB.readList(typeArr);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static byte[] toBytes(int i9) {
        if (i9 >= -16 && i9 <= 47) {
            return new byte[]{(byte) i9};
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeInt32(i9);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th2) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static byte[] toBytes(byte b10) {
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeInt8(b10);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th2) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static byte[] toBytes(short s10) {
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeInt16(s10);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th2) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static byte[] toBytes(long j3) {
        if (j3 >= -8 && j3 <= 15) {
            return new byte[]{(byte) (j3 - 32)};
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeInt64(j3);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th2) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static byte[] toBytes(String str) {
        if (str == null) {
            return new byte[]{Constants.BC_NULL};
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeString(str);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th2) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr), bArr, 0, bArr.length);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static byte[] toBytes(boolean z9) {
        return new byte[]{z9 ? Constants.BC_TRUE : Constants.BC_FALSE};
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toBytes(Object obj) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                Class<?> cls = obj.getClass();
                objectWriterProvider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } finally {
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
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, Class<T> cls) {
        T t9;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        boolean z9 = (context.features & JSONReader.Feature.FieldBased.mask) != 0;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t9 = (T) jSONReaderJSONB.readAny();
            } else {
                t9 = (T) objectReaderProvider.getObjectReader(cls, z9).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
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
                boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, z9);
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

    static <T> T parseObject(byte[] bArr, Type type) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        T t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
        if (jSONReaderJSONB.resolveTasks != null) {
            jSONReaderJSONB.handleResolveTasks(t9);
        }
        return t9;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
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

    static <T> T parseObject(byte[] bArr, Type... typeArr) {
        return (T) parseObject(bArr, new MultiType(typeArr));
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, symbolTable);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        T t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
        if (jSONReaderJSONB.resolveTasks != null) {
            jSONReaderJSONB.handleResolveTasks(t9);
        }
        return t9;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toBytes(Object obj, SymbolTable symbolTable, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = objectWriterProvider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0);
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

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, symbolTable, featureArr);
        ObjectReader objectReader = objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            T t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) throws Throwable {
        JSONReaderJSONB jSONReaderJSONB;
        Throwable th2;
        Object any;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        context.config(filter, featureArr);
        JSONReaderJSONB jSONReaderJSONB2 = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        for (JSONReader.Feature feature : featureArr) {
            try {
                try {
                    context.features |= feature.mask;
                } catch (Throwable th3) {
                    th2 = th3;
                    jSONReaderJSONB = jSONReaderJSONB2;
                    try {
                        jSONReaderJSONB.close();
                        throw th2;
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                        throw th2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                jSONReaderJSONB = jSONReaderJSONB2;
            }
        }
        if (cls == Object.class) {
            if (jSONReaderJSONB2.getType() == -110) {
                jSONReaderJSONB = jSONReaderJSONB2;
                try {
                    jSONReaderJSONB2 = jSONReaderJSONB;
                    any = (T) jSONReaderJSONB.checkAutoType(Object.class, 0L, 0L).readJSONBObject(jSONReaderJSONB2, cls, null, context.features);
                } catch (Throwable th6) {
                    th = th6;
                    th2 = th;
                    jSONReaderJSONB.close();
                    throw th2;
                }
            } else {
                any = jSONReaderJSONB2.readAny();
            }
            jSONReaderJSONB = jSONReaderJSONB2;
        } else {
            any = (T) objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB2, cls, null, 0L);
            jSONReaderJSONB = jSONReaderJSONB2;
        }
        try {
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(any);
            }
            jSONReaderJSONB.close();
            return (T) any;
        } catch (Throwable th7) {
            th = th7;
            th2 = th;
            jSONReaderJSONB.close();
            throw th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toBytes(Object obj, SymbolTable symbolTable, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        context.configFilter(filterArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = objectWriterProvider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0);
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

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static byte[] toBytes(Object obj, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider, featureArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.rootObject = obj;
                jSONWriterJSONB.path = JSONWriter.Path.ROOT;
                boolean z9 = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = objectWriterProvider.getObjectWriter(cls, cls, z9);
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

    static JSONObject parseObject(byte[] bArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th2) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
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

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Context context) {
        T t9;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            if (type == Object.class) {
                t9 = (T) jSONReaderJSONB.readAny();
            } else {
                t9 = (T) context.getObjectReader(type).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(InputStream inputStream, Class cls, JSONReader.Context context) {
        T t9;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            if (cls == Object.class) {
                t9 = (T) jSONReaderJSONB.readAny();
            } else {
                t9 = (T) context.getObjectReader(cls).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    static <T> T parseObject(InputStream inputStream, int i9, Type type, JSONReader.Context context) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r2.length - 1)];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, byte[]> atomicReferenceFieldUpdater = JSONFactory.BYTES_UPDATER;
        byte[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new byte[8192];
        }
        try {
            if (andSet.length < i9) {
                andSet = new byte[i9];
            }
            int i10 = inputStream.read(andSet, 0, i9);
            if (i10 != i9) {
                throw new IllegalArgumentException("deserialize failed. expected read length: " + i9 + " but actual read: " + i10);
            }
            T t9 = (T) parseObject(andSet, 0, i9, type, context);
            atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            return t9;
        } catch (Throwable th2) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
            throw th2;
        }
    }

    static <T> T parseObject(InputStream inputStream, int i9, Type type, JSONReader.Feature... featureArr) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r2.length - 1)];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, byte[]> atomicReferenceFieldUpdater = JSONFactory.BYTES_UPDATER;
        byte[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new byte[8192];
        }
        try {
            if (andSet.length < i9) {
                andSet = new byte[i9];
            }
            int i10 = inputStream.read(andSet, 0, i9);
            if (i10 != i9) {
                throw new IllegalArgumentException("deserialize failed. expected read length: " + i9 + " but actual read: " + i10);
            }
            T t9 = (T) parseObject(andSet, 0, i9, type, featureArr);
            atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            return t9;
        } catch (Throwable th2) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
            throw th2;
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) throws Throwable {
        T t9;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                if (jSONReaderJSONB.getType() == -110) {
                    try {
                        ObjectReader objectReaderCheckAutoType = jSONReaderJSONB.checkAutoType(Object.class, 0L, 0L);
                        jSONReaderJSONB = jSONReaderJSONB;
                        t9 = (T) objectReaderCheckAutoType.readJSONBObject(jSONReaderJSONB, cls, null, context.features);
                    } catch (Throwable th2) {
                        th = th2;
                        jSONReaderJSONB = jSONReaderJSONB;
                        Throwable th3 = th;
                        try {
                            jSONReaderJSONB.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } else {
                    t9 = (T) jSONReaderJSONB.readAny();
                }
            } else {
                ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONReader.Feature.SupportArrayToBean.mask) != 0 && jSONReaderJSONB.isArray() && (objectReader instanceof ObjectReaderBean)) {
                    t9 = (T) objectReader.readArrayMappingJSONBObject(jSONReaderJSONB, cls, null, 0L);
                } else {
                    t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
                }
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Context context) {
        T t9;
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                if (jSONReaderJSONB.getType() == -110) {
                    t9 = (T) jSONReaderJSONB.checkAutoType(Object.class, 0L, 0L).readJSONBObject(jSONReaderJSONB, cls, null, context.features);
                } else {
                    t9 = (T) jSONReaderJSONB.readAny();
                }
            } else {
                ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONReader.Feature.SupportArrayToBean.mask) != 0 && jSONReaderJSONB.isArray() && (objectReader instanceof ObjectReaderBean)) {
                    t9 = (T) objectReader.readArrayMappingJSONBObject(jSONReaderJSONB, cls, null, 0L);
                } else {
                    t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
                }
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            T t9 = (T) objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Class<T> cls) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i9, i10);
        try {
            T t9 = (T) objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Type type) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i9, i10);
        try {
            T t9 = (T) objectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Class<T> cls, JSONReader.Feature... featureArr) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        for (JSONReader.Feature feature : featureArr) {
            context.features |= feature.mask;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i9, i10);
        try {
            T t9 = (T) objectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Type type, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i9, i10);
        try {
            T t9 = (T) context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Type type, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(JSONFactory.defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = context.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i9, i10);
        try {
            T t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Class<T> cls, SymbolTable symbolTable) {
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(JSONFactory.createReadContext(symbolTable), bArr, i9, i10);
        try {
            T t9 = (T) jSONReaderJSONB.getObjectReader(cls).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Type type, SymbolTable symbolTable) {
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(JSONFactory.createReadContext(symbolTable), bArr, i9, i10);
        try {
            T t9 = (T) jSONReaderJSONB.getObjectReader(type).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Class<T> cls, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i9, i10);
        try {
            T t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    static <T> T parseObject(byte[] bArr, int i9, int i10, Type type, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i9, i10);
        try {
            T t9 = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t9);
            }
            jSONReaderJSONB.close();
            return t9;
        } finally {
        }
    }
}
