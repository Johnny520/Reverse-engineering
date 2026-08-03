package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray;
import com.alibaba.fastjson2.reader.ObjectReaderImplStringArray;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NameCacheEntry;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import okhttp3.HttpUrl;
import okhttp3.internal.p221ws.WebSocketProtocol;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderJSONB extends JSONReader {
    static Charset GB18030;
    protected final byte[] bytes;
    protected final JSONFactory.CacheItem cacheItem;
    protected char[] charBuf;
    protected final int end;
    protected final int length;
    protected int strBegin;
    protected int strlen;
    protected byte strtype;
    protected int symbol0Begin;
    protected long symbol0Hash;
    protected int symbol0Length;
    protected byte symbol0StrType;
    protected final SymbolTable symbolTable;
    protected long[] symbols;
    protected byte type;
    protected byte[] valueBytes;
    static final long BASE = JDKUtils.UNSAFE.arrayBaseOffset(byte[].class);
    static final byte[] SHANGHAI_ZONE_ID_NAME_BYTES = JSONB.toBytes(DateUtils.SHANGHAI_ZONE_ID_NAME);
    static final byte[] FIXED_TYPE_SIZE = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, JSONB.Constants.BC_INT32_NUM_16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, JSONB.Constants.BC_INT32_NUM_MAX, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 5, 0, 0, 1, 1, 1, 0, 0, 0, 9, 0, 5, 0, 0, 0, 0, 3, 2, 9, 5, 3, 3, 3, 3, 3, 3, 3, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONReaderJSONB(JSONReader.Context context, InputStream inputStream) {
        super(context, true);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        andSet = andSet == null ? new byte[context.bufferSize] : andSet;
        int i9 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(andSet, i9, andSet.length - i9);
                if (i10 == -1) {
                    this.bytes = andSet;
                    this.offset = 0;
                    this.length = i9;
                    this.end = i9;
                    this.symbolTable = context.symbolTable;
                    return;
                }
                i9 += i10;
                if (i9 == andSet.length) {
                    andSet = Arrays.copyOf(andSet, andSet.length + context.bufferSize);
                }
            } catch (IOException e6) {
                C0086a.m465x("read error", e6);
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getInt(byte[] bArr, int i9) {
        int i10 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        return JDKUtils.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getInt3(byte[] bArr, int i9, int i10) {
        return ((i10 - 68) << 16) + ((bArr[i9] & 255) << 8) + (bArr[i9 + 1] & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectReader getObjectReaderContext(ObjectReader objectReader, Class cls, ClassLoader classLoader) {
        String string = getString();
        Class<?> mapping = TypeUtils.getMapping(string);
        if (mapping == null) {
            if (classLoader == null) {
                try {
                    classLoader = JSON.class.getClassLoader();
                } catch (ClassNotFoundException unused) {
                }
            }
            mapping = classLoader.loadClass(string);
        }
        return (mapping == null || cls.equals(mapping)) ? objectReader : getObjectReader(mapping);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JSONException notSupportString() {
        throw new JSONException("readString not support type " + JSONB.typeName(this.strtype) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static JSONException notSupportType(byte b10) {
        return new JSONException("name not support input : " + JSONB.typeName(b10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BigInteger readBigInteger0(byte b10) {
        byte[] bArr = this.bytes;
        if (b10 == -111) {
            int int32Value = readInt32Value();
            byte[] bArr2 = new byte[int32Value];
            System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value);
            this.offset += int32Value;
            return new BigInteger(bArr2);
        }
        if (b10 == -71) {
            int int32Value2 = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value2 == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value2)).toBigInteger();
        }
        if (b10 != 72) {
            if (b10 == 124) {
                int int32Value3 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value3, StandardCharsets.UTF_16LE);
                this.offset += int32Value3;
                return str.indexOf(46) == -1 ? new BigInteger(str) : TypeUtils.toBigDecimal(str).toBigInteger();
            }
            if (b10 == 121) {
                int int32Value4 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value4, StandardCharsets.ISO_8859_1);
                this.offset += int32Value4;
                return str2.indexOf(46) == -1 ? new BigInteger(str2) : TypeUtils.toBigDecimal(str2).toBigInteger();
            }
            if (b10 == 122) {
                int int32Value5 = readInt32Value();
                String str3 = new String(bArr, this.offset, int32Value5, StandardCharsets.UTF_8);
                this.offset += int32Value5;
                return str3.indexOf(46) == -1 ? new BigInteger(str3) : TypeUtils.toBigDecimal(str3).toBigInteger();
            }
            switch (b10) {
                case -81:
                    return null;
                case -80:
                case -78:
                    return BigInteger.ZERO;
                case -79:
                case -77:
                    return BigInteger.ONE;
                case -76:
                    return BigInteger.valueOf(readInt64Value());
                case -75:
                    long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                    this.offset += 8;
                    if (!JDKUtils.BIG_ENDIAN) {
                        jReverseBytes = Long.reverseBytes(jReverseBytes);
                    }
                    return BigInteger.valueOf((long) Double.longBitsToDouble(jReverseBytes));
                case -74:
                    return BigInteger.valueOf(readInt32Value());
                case -73:
                    int i9 = getInt(bArr, this.offset);
                    this.offset += 4;
                    return BigInteger.valueOf((long) Float.intBitsToFloat(i9));
                default:
                    switch (b10) {
                        case -68:
                            int i10 = this.offset;
                            int i11 = (bArr[i10 + 1] & 255) + (bArr[i10] << 8);
                            this.offset = i10 + 2;
                            return BigInteger.valueOf(i11);
                        case -67:
                            this.offset = this.offset + 1;
                            return BigInteger.valueOf(bArr[r7]);
                        case -66:
                            long jReverseBytes2 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                            this.offset += 8;
                            if (!JDKUtils.BIG_ENDIAN) {
                                jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                            }
                            return BigInteger.valueOf(jReverseBytes2);
                        case -65:
                            break;
                        default:
                            if (b10 >= -16 && b10 <= 47) {
                                return BigInteger.valueOf(b10);
                            }
                            if (b10 >= 48 && b10 <= 63) {
                                int i12 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                this.offset = this.offset + 1;
                                return BigInteger.valueOf(i12 + (bArr[r1] & 255));
                            }
                            if (b10 >= 64 && b10 <= 71) {
                                int int3 = getInt3(bArr, this.offset, b10);
                                this.offset += 2;
                                return BigInteger.valueOf(int3);
                            }
                            if (b10 >= -40 && b10 <= -17) {
                                return BigInteger.valueOf(b10 + 32);
                            }
                            if (b10 >= -56 && b10 <= -41) {
                                int i13 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                this.offset = this.offset + 1;
                                return BigInteger.valueOf(i13 + (bArr[r1] & 255));
                            }
                            if (b10 >= -64 && b10 <= -57) {
                                int i14 = this.offset;
                                this.offset = i14 + 1;
                                int i15 = ((b10 + 60) << 16) + ((bArr[i14] & 255) << 8);
                                this.offset = i14 + 2;
                                return BigInteger.valueOf(i15 + (bArr[r2] & 255));
                            }
                            if (b10 < 73 || b10 > 120) {
                                throw notSupportType(b10);
                            }
                            int i16 = b10 - 73;
                            String latin1String = getLatin1String(this.offset, i16);
                            this.offset += i16;
                            return new BigInteger(latin1String);
                    }
                    break;
            }
        }
        int i17 = getInt(bArr, this.offset);
        this.offset += 4;
        return BigInteger.valueOf(i17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean readBoolValue0(byte b10) {
        boolean z9;
        int i9;
        byte b11;
        int length;
        String str;
        byte[] bArr = this.bytes;
        if (b10 == -81) {
            if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                this.wasNull = true;
                return false;
            }
            C0086a.m464w(info("long value not support input null"));
            return false;
        }
        if (b10 == 74) {
            int i10 = this.offset;
            byte b12 = bArr[i10];
            z9 = false;
            if (b12 == 49 || b12 == 89) {
                this.offset = i10 + 1;
                return true;
            }
            if (b12 == 48 || b12 == 78) {
                this.offset = i10 + 1;
                return false;
            }
        } else {
            if (b10 == 0) {
                return false;
            }
            if (b10 == 1) {
                return true;
            }
            if (b10 != 77) {
                if (b10 == 78) {
                    z9 = false;
                    i9 = this.offset;
                    b11 = bArr[i9];
                    if (b11 != 102 && bArr[i9 + 1] == 97 && bArr[i9 + 2] == 108 && bArr[i9 + 3] == 115 && bArr[i9 + 4] == 101) {
                        this.offset = i9 + 5;
                        return z9;
                    }
                    if (b11 == 70 && bArr[i9 + 1] == 65 && bArr[i9 + 2] == 76 && bArr[i9 + 3] == 83 && bArr[i9 + 4] == 69) {
                        this.offset = i9 + 5;
                        return z9;
                    }
                    length = readLength();
                    this.strlen = length;
                    if (length == 1) {
                    }
                    String str2 = new String(bArr, this.offset, length, StandardCharsets.ISO_8859_1);
                    this.offset += this.strlen;
                    C0086a.m464w("not support input ".concat(str2));
                    return z9;
                }
                switch (b10) {
                    case 121:
                    case 122:
                        z9 = false;
                        break;
                    case 123:
                    case 124:
                    case 125:
                        int length2 = readLength();
                        this.strlen = length2;
                        byte[] bArr2 = new byte[length2];
                        System.arraycopy(bArr, this.offset, bArr2, 0, length2);
                        str = new String(bArr2, b10 == 125 ? StandardCharsets.UTF_16BE : b10 == 124 ? StandardCharsets.UTF_16LE : StandardCharsets.UTF_16);
                        this.offset += this.strlen;
                        switch (str) {
                            case "0":
                            case "N":
                            case "FALSE":
                            case "false":
                                return false;
                            case "1":
                            case "Y":
                            case "TRUE":
                            case "true":
                                return true;
                            default:
                                C0086a.m464w("not support input ".concat(str));
                                return false;
                        }
                    default:
                        throw notSupportType(b10);
                }
                length = readLength();
                this.strlen = length;
                if (length == 1) {
                    int i11 = this.offset;
                    byte b13 = bArr[i11];
                    if (b13 == 89) {
                        this.offset = i11 + 1;
                        return true;
                    }
                    if (b13 == 78) {
                        this.offset = i11 + 1;
                        return true;
                    }
                } else {
                    if (length == 4) {
                        int i12 = this.offset;
                        if (bArr[i12] == 116 && bArr[i12 + 1] == 114 && bArr[i12 + 2] == 117 && bArr[i12 + 3] == 101) {
                            this.offset = i12 + 4;
                            return true;
                        }
                    }
                    if (length == 5) {
                        int i13 = this.offset;
                        byte b14 = bArr[i13];
                        if (b14 == 102 && bArr[i13 + 1] == 97 && bArr[i13 + 2] == 108 && bArr[i13 + 3] == 115 && bArr[i13 + 4] == 101) {
                            this.offset = i13 + 5;
                            return z9;
                        }
                        if (b14 == 70 && bArr[i13 + 1] == 65 && bArr[i13 + 2] == 76 && bArr[i13 + 3] == 83 && bArr[i13 + 4] == 69) {
                            this.offset = i13 + 5;
                            return z9;
                        }
                    }
                }
                String str22 = new String(bArr, this.offset, length, StandardCharsets.ISO_8859_1);
                this.offset += this.strlen;
                C0086a.m464w("not support input ".concat(str22));
                return z9;
            }
            z9 = false;
        }
        int i14 = this.offset;
        byte b15 = bArr[i14];
        if (b15 == 116 && bArr[i14 + 1] == 114 && bArr[i14 + 2] == 117 && bArr[i14 + 3] == 101) {
            this.offset = i14 + 4;
            return true;
        }
        if (b15 == 84 && bArr[i14 + 1] == 82 && bArr[i14 + 2] == 85 && bArr[i14 + 3] == 69) {
            this.offset = i14 + 4;
            return true;
        }
        i9 = this.offset;
        b11 = bArr[i9];
        if (b11 != 102) {
        }
        if (b11 == 70) {
            this.offset = i9 + 5;
            return z9;
        }
        length = readLength();
        this.strlen = length;
        if (length == 1) {
        }
        String str222 = new String(bArr, this.offset, length, StandardCharsets.ISO_8859_1);
        this.offset += this.strlen;
        C0086a.m464w("not support input ".concat(str222));
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BigDecimal readDecimal0(byte b10) {
        if (b10 != 72) {
            if (b10 == 124) {
                int int32Value = readInt32Value();
                String str = new String(this.bytes, this.offset, int32Value, StandardCharsets.UTF_16LE);
                this.offset += int32Value;
                return TypeUtils.toBigDecimal(str);
            }
            if (b10 == 121) {
                int int32Value2 = readInt32Value();
                String str2 = new String(this.bytes, this.offset, int32Value2, StandardCharsets.ISO_8859_1);
                this.offset += int32Value2;
                return TypeUtils.toBigDecimal(str2);
            }
            if (b10 == 122) {
                int int32Value3 = readInt32Value();
                String str3 = new String(this.bytes, this.offset, int32Value3, StandardCharsets.UTF_8);
                this.offset += int32Value3;
                return TypeUtils.toBigDecimal(str3);
            }
            switch (b10) {
                case -81:
                    return null;
                case -80:
                case -78:
                    return BigDecimal.ZERO;
                case -79:
                case -77:
                    return BigDecimal.ONE;
                case -76:
                    return BigDecimal.valueOf(readInt64Value());
                case -75:
                    long jReverseBytes = JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                    this.offset += 8;
                    if (!JDKUtils.BIG_ENDIAN) {
                        jReverseBytes = Long.reverseBytes(jReverseBytes);
                    }
                    return BigDecimal.valueOf((long) Double.longBitsToDouble(jReverseBytes));
                case -74:
                    return BigDecimal.valueOf(readInt32Value());
                case -73:
                    int i9 = getInt(this.bytes, this.offset);
                    this.offset += 4;
                    return BigDecimal.valueOf((long) Float.intBitsToFloat(i9));
                default:
                    switch (b10) {
                        case -69:
                            return new BigDecimal(readBigInteger());
                        case -68:
                            byte[] bArr = this.bytes;
                            int i10 = this.offset;
                            int i11 = (bArr[i10 + 1] & 255) + (bArr[i10] << 8);
                            this.offset = i10 + 2;
                            return BigDecimal.valueOf(i11);
                        case -67:
                            byte[] bArr2 = this.bytes;
                            this.offset = this.offset + 1;
                            return BigDecimal.valueOf(bArr2[r0]);
                        case -66:
                            long jReverseBytes2 = JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                            this.offset += 8;
                            if (!JDKUtils.BIG_ENDIAN) {
                                jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                            }
                            return BigDecimal.valueOf(jReverseBytes2);
                        case -65:
                            break;
                        default:
                            if (b10 >= -16 && b10 <= 47) {
                                return BigDecimal.valueOf(b10);
                            }
                            if (b10 >= 48 && b10 <= 63) {
                                int i12 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                byte[] bArr3 = this.bytes;
                                this.offset = this.offset + 1;
                                return BigDecimal.valueOf(i12 + (bArr3[r1] & 255));
                            }
                            if (b10 >= 64 && b10 <= 71) {
                                int int3 = getInt3(this.bytes, this.offset, b10);
                                this.offset += 2;
                                return BigDecimal.valueOf(int3);
                            }
                            if (b10 >= -40 && b10 <= -17) {
                                return BigDecimal.valueOf(b10 + 32);
                            }
                            if (b10 >= -56 && b10 <= -41) {
                                int i13 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                byte[] bArr4 = this.bytes;
                                this.offset = this.offset + 1;
                                return BigDecimal.valueOf(i13 + (bArr4[r1] & 255));
                            }
                            if (b10 < -64 || b10 > -57) {
                                if (b10 < 73 || b10 > 120) {
                                    throw notSupportType(b10);
                                }
                                int i14 = b10 - 73;
                                String latin1String = getLatin1String(this.offset, i14);
                                this.offset += i14;
                                return TypeUtils.toBigDecimal(latin1String);
                            }
                            byte[] bArr5 = this.bytes;
                            int i15 = this.offset;
                            this.offset = i15 + 1;
                            int i16 = ((b10 + 60) << 16) + ((bArr5[i15] & 255) << 8);
                            this.offset = i15 + 2;
                            return BigDecimal.valueOf(i16 + (bArr5[r2] & 255));
                    }
                    break;
            }
        }
        int i17 = getInt(this.bytes, this.offset);
        this.offset += 4;
        return BigDecimal.valueOf(i17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private double readDoubleValue0() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 == -74) {
            return readInt32Value();
        }
        if (b10 == -73) {
            int iReverseBytes = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
            this.offset += 4;
            if (!JDKUtils.BIG_ENDIAN) {
                iReverseBytes = Integer.reverseBytes(iReverseBytes);
            }
            return Float.intBitsToFloat(iReverseBytes);
        }
        if (b10 == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).intValue();
        }
        if (b10 != 72) {
            if (b10 == 124) {
                int int32Value2 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
                this.offset += int32Value2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
            }
            if (b10 == 121) {
                int int32Value3 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value3, StandardCharsets.ISO_8859_1);
                this.offset += int32Value3;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
            }
            if (b10 == 122) {
                int int32Value4 = readInt32Value();
                String str3 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
                this.offset += int32Value4;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.toBigDecimal(str3).intValue();
            }
            switch (b10) {
                case -81:
                    if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.wasNull = true;
                        return 0.0d;
                    }
                    C0086a.m464w(info("long value not support input null"));
                    return 0.0d;
                case -80:
                case -78:
                    return 0.0d;
                case -79:
                case -77:
                    return 1.0d;
                case -76:
                    return readInt64Value();
                default:
                    switch (b10) {
                        case -68:
                            int i11 = (bArr[i9 + 2] & 255) + (bArr[i10] << 8);
                            this.offset = i9 + 3;
                            return i11;
                        case -67:
                            this.offset = i9 + 2;
                            return bArr[i10];
                        case -66:
                            long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                            this.offset += 8;
                            if (!JDKUtils.BIG_ENDIAN) {
                                jReverseBytes = Long.reverseBytes(jReverseBytes);
                            }
                            return jReverseBytes;
                        case -65:
                            break;
                        default:
                            if (b10 >= -16 && b10 <= 47) {
                                return b10;
                            }
                            if (b10 >= 48 && b10 <= 63) {
                                int i12 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                this.offset = i9 + 2;
                                return i12 + (bArr[i10] & 255);
                            }
                            if (b10 >= 64 && b10 <= 71) {
                                int int3 = getInt3(bArr, i10, b10);
                                this.offset += 2;
                                return int3;
                            }
                            if (b10 >= -40 && b10 <= -17) {
                                return ((long) (b10 - JSONB.Constants.BC_INT64_NUM_MIN)) - 8;
                            }
                            if (b10 >= -56 && b10 <= -41) {
                                int i13 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                this.offset = i9 + 2;
                                return i13 + (bArr[i10] & 255);
                            }
                            if (b10 >= -64 && b10 <= -57) {
                                this.offset = i9 + 2;
                                int i14 = ((b10 + 60) << 16) + ((bArr[i10] & 255) << 8);
                                this.offset = i9 + 3;
                                return i14 + (bArr[r4] & 255);
                            }
                            if (b10 < 73 || b10 > 120) {
                                throw notSupportType(b10);
                            }
                            int i15 = b10 - 73;
                            String latin1String = getLatin1String(i10, i15);
                            this.offset += i15;
                            return latin1String.indexOf(46) == -1 ? new BigInteger(latin1String).intValue() : TypeUtils.toBigDecimal(latin1String).intValue();
                    }
                    break;
            }
        }
        int i16 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        this.offset += 4;
        return JDKUtils.BIG_ENDIAN ? i16 : Integer.reverseBytes(i16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private float readFloat0() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).intValue();
        }
        if (b10 != 72) {
            if (b10 == 124) {
                int int32Value2 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
                this.offset += int32Value2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
            }
            if (b10 == 121) {
                int int32Value3 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value3, StandardCharsets.ISO_8859_1);
                this.offset += int32Value3;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
            }
            if (b10 == 122) {
                int int32Value4 = readInt32Value();
                String str3 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
                this.offset += int32Value4;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.toBigDecimal(str3).intValue();
            }
            switch (b10) {
                case -81:
                    if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.wasNull = true;
                        return 0.0f;
                    }
                    C0086a.m464w(info("long value not support input null"));
                    return 0.0f;
                case -80:
                case -78:
                    return 0.0f;
                case -79:
                case -77:
                    return 1.0f;
                case -76:
                    return readInt64Value();
                case -75:
                    long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                    this.offset += 8;
                    if (!JDKUtils.BIG_ENDIAN) {
                        jReverseBytes = Long.reverseBytes(jReverseBytes);
                    }
                    return (float) Double.longBitsToDouble(jReverseBytes);
                case -74:
                    return readInt32Value();
                default:
                    switch (b10) {
                        case -68:
                            int i11 = (bArr[i9 + 2] & 255) + (bArr[i10] << 8);
                            this.offset = i9 + 3;
                            return i11;
                        case -67:
                            this.offset = i9 + 2;
                            return bArr[i10];
                        case -66:
                            long jReverseBytes2 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                            this.offset += 8;
                            if (!JDKUtils.BIG_ENDIAN) {
                                jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                            }
                            return jReverseBytes2;
                        case -65:
                            break;
                        default:
                            if (b10 >= -16 && b10 <= 47) {
                                return b10;
                            }
                            if (b10 >= 48 && b10 <= 63) {
                                int i12 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                this.offset = i9 + 2;
                                return i12 + (bArr[i10] & 255);
                            }
                            if (b10 >= 64 && b10 <= 71) {
                                int int3 = getInt3(bArr, i10, b10);
                                this.offset += 2;
                                return int3;
                            }
                            if (b10 >= -40 && b10 <= -17) {
                                return b10 + 32;
                            }
                            if (b10 >= -56 && b10 <= -41) {
                                int i13 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                this.offset = i9 + 2;
                                return i13 + (bArr[i10] & 255);
                            }
                            if (b10 >= -64 && b10 <= -57) {
                                this.offset = i9 + 2;
                                int i14 = ((b10 + 60) << 16) + ((bArr[i10] & 255) << 8);
                                this.offset = i9 + 3;
                                return i14 + (bArr[r4] & 255);
                            }
                            if (b10 < 73 || b10 > 120) {
                                throw notSupportType(b10);
                            }
                            int i15 = b10 - 73;
                            String latin1String = getLatin1String(i10, i15);
                            this.offset += i15;
                            return latin1String.indexOf(46) == -1 ? new BigInteger(latin1String).intValue() : TypeUtils.toBigDecimal(latin1String).intValue();
                    }
                    break;
            }
        }
        int i16 = getInt(bArr, i10);
        this.offset += 4;
        return i16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String readGB18030() {
        this.strlen = readLength();
        this.strBegin = this.offset;
        if (GB18030 != null) {
            return null;
        }
        GB18030 = Charset.forName("GB18030");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int readInt32Value0(byte[] bArr, byte b10) {
        if (b10 >= -40 && b10 <= -17) {
            return b10 + 32;
        }
        if (b10 >= -56 && b10 <= -41) {
            int i9 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
            int i10 = this.offset;
            this.offset = i10 + 1;
            return i9 + (bArr[i10] & 255);
        }
        if (b10 >= -64 && b10 <= -57) {
            int i11 = this.offset;
            int i12 = i11 + 1;
            this.offset = i12;
            int i13 = ((b10 + 60) << 16) + ((bArr[i11] & 255) << 8);
            this.offset = i11 + 2;
            return i13 + (bArr[i12] & 255);
        }
        if (b10 != -84 && b10 != -83) {
            if (b10 == -71) {
                int int32Value = readInt32Value();
                BigInteger bigInteger = readBigInteger();
                return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).intValue();
            }
            if (b10 == 124) {
                int int32Value2 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
                this.offset += int32Value2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
            }
            if (b10 == 121) {
                int int32Value3 = readInt32Value();
                String latin1String = getLatin1String(this.offset, int32Value3);
                this.offset += int32Value3;
                return latin1String.indexOf(46) == -1 ? new BigInteger(latin1String).intValue() : TypeUtils.toBigDecimal(latin1String).intValue();
            }
            if (b10 == 122) {
                int int32Value4 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
                this.offset += int32Value4;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
            }
            switch (b10) {
                case -81:
                    if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.wasNull = true;
                        return 0;
                    }
                    C0086a.m464w(info("int value not support input null"));
                    return 0;
                case -80:
                case -78:
                    return 0;
                case -79:
                case -77:
                    return 1;
                case -76:
                    return (int) readInt64Value();
                case -75:
                    this.offset--;
                    return (int) readDoubleValue();
                case -74:
                    return readInt32Value();
                case -73:
                    int i14 = getInt(bArr, this.offset);
                    this.offset += 4;
                    return (int) Float.intBitsToFloat(i14);
                default:
                    switch (b10) {
                        case -68:
                            int i15 = this.offset;
                            int i16 = (bArr[i15 + 1] & 255) + (bArr[i15] << 8);
                            this.offset = i15 + 2;
                            return i16;
                        case -67:
                            int i17 = this.offset;
                            this.offset = i17 + 1;
                            return bArr[i17];
                        case -66:
                            long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                            this.offset += 8;
                            if (!JDKUtils.BIG_ENDIAN) {
                                jReverseBytes = Long.reverseBytes(jReverseBytes);
                            }
                            return (int) jReverseBytes;
                        case -65:
                            break;
                        default:
                            if (b10 < 73 || b10 > 120) {
                                C0086a.m453l("readInt32Value not support ", this.offset, bArr.length, JSONB.typeName(b10));
                                return 0;
                            }
                            int i18 = b10 - 73;
                            String latin1String2 = getLatin1String(this.offset, i18);
                            this.offset += i18;
                            return latin1String2.indexOf(46) == -1 ? new BigInteger(latin1String2).intValue() : TypeUtils.toBigDecimal(latin1String2).intValue();
                    }
                    break;
            }
        }
        int i19 = getInt(bArr, this.offset);
        this.offset += 4;
        return i19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JSONException readInt32ValueError(byte b10) {
        throw new JSONException("readInt32Value not support " + JSONB.typeName(b10) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private long readInt64Value0(byte[] bArr, byte b10) {
        if (b10 >= 48 && b10 <= 63) {
            int i9 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = this.offset + 1;
            return i9 + (bArr[r0] & 255);
        }
        if (b10 >= -16 && b10 <= 47) {
            return b10;
        }
        if (b10 >= 64 && b10 <= 71) {
            int int3 = getInt3(bArr, this.offset, b10);
            this.offset += 2;
            return int3;
        }
        if (b10 == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).longValue();
        }
        if (b10 == 72) {
            int i10 = getInt(bArr, this.offset);
            this.offset += 4;
            return i10;
        }
        if (b10 == 124) {
            int int32Value2 = readInt32Value();
            String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
            this.offset += int32Value2;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
        }
        if (b10 == -68) {
            int i11 = this.offset;
            int i12 = (bArr[i11 + 1] & 255) + (bArr[i11] << 8);
            this.offset = i11 + 2;
            return i12;
        }
        if (b10 == -67) {
            this.offset = this.offset + 1;
            return bArr[r7];
        }
        if (b10 == 121) {
            int int32Value3 = readInt32Value();
            String latin1String = getLatin1String(this.offset, int32Value3);
            this.offset += int32Value3;
            return latin1String.indexOf(46) == -1 ? new BigInteger(latin1String).intValue() : TypeUtils.toBigDecimal(latin1String).intValue();
        }
        if (b10 == 122) {
            int int32Value4 = readInt32Value();
            String str2 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
            this.offset += int32Value4;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
        }
        switch (b10) {
            case -85:
                long j3 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                this.offset += 8;
                return JDKUtils.BIG_ENDIAN ? j3 : Long.reverseBytes(j3);
            case -84:
                long j4 = getInt(bArr, this.offset);
                this.offset += 4;
                return j4 * 1000;
            case -83:
                long j5 = getInt(bArr, this.offset);
                this.offset += 4;
                return j5 * 60000;
            default:
                switch (b10) {
                    case -81:
                        if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.wasNull = true;
                            return 0L;
                        }
                        C0086a.m464w(info("long value not support input null"));
                        return 0L;
                    case -80:
                    case -78:
                        return 0L;
                    case -79:
                    case -77:
                        return 1L;
                    case -76:
                        return readInt64Value();
                    case -75:
                        this.offset--;
                        return (long) readDoubleValue();
                    case -74:
                        return readInt32Value();
                    case -73:
                        int i13 = getInt(bArr, this.offset);
                        this.offset += 4;
                        return (long) Float.intBitsToFloat(i13);
                    default:
                        if (b10 < 73 || b10 > 120) {
                            C0086a.m453l("readInt64Value not support ", this.offset, bArr.length, JSONB.typeName(b10));
                            return 0L;
                        }
                        int i14 = b10 - 73;
                        String latin1String2 = getLatin1String(this.offset, i14);
                        this.offset += i14;
                        return latin1String2.indexOf(46) == -1 ? new BigInteger(latin1String2).longValue() : TypeUtils.toBigDecimal(latin1String2).longValue();
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JSONException readInt64ValueError(byte b10) {
        throw new JSONException("readInt64Value not support " + JSONB.typeName(b10) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private LocalDate readLocalDate0(int i9) {
        if (i9 >= 73 && i9 <= 120) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    return readLocalDate8();
                case 9:
                    return readLocalDate9();
                case 10:
                    return readLocalDate10();
                case 11:
                    return readLocalDate11();
                default:
                    C0086a.m459r(AbstractC0921a.m2257t(stringLength, "TODO : ", ", "), readString());
                    return null;
            }
        }
        if (i9 == 122 || i9 == 121) {
            this.strtype = (byte) i9;
            this.offset++;
            int length = readLength();
            this.strlen = length;
            switch (length) {
                case 8:
                    return readLocalDate8();
                case 9:
                    return readLocalDate9();
                case 10:
                    return readLocalDate10();
                case 11:
                    return readLocalDate11();
            }
        }
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.time.LocalDateTime] */
    private LocalDateTime readLocalDateTime0(int i9) {
        if (i9 == -87) {
            LocalDate localDate = readLocalDate();
            if (localDate == null) {
                return null;
            }
            return LocalDateTime.of(localDate, LocalTime.MIN);
        }
        if (i9 == -86) {
            return readZonedDateTime().toLocalDateTime();
        }
        if (i9 < 73 || i9 > 120) {
            C0086a.m450i(JSONB.typeName((byte) i9), "not support type : ");
            return null;
        }
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
                return readLocalDateTime17();
            case 18:
                return readLocalDateTime18();
            case 19:
                return readLocalDateTime19();
            case 20:
                return readLocalDateTime20();
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
                ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                if (zonedDateTimeX != null) {
                    return zonedDateTimeX.toLocalDateTime();
                }
                break;
        }
        C0086a.m459r(AbstractC0921a.m2257t(stringLength, "TODO : ", ", "), readString());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JSONException readStringError() {
        throw new JSONException("string value not support input " + JSONB.typeName(this.type) + " offset " + this.offset + "/" + this.bytes.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String readStringNonAscii() {
        Charset charset;
        String utf16be;
        Charset charset2;
        byte b10 = this.strtype;
        if (b10 == 122) {
            byte[] bArr = this.bytes;
            int i9 = this.offset;
            byte b11 = bArr[i9];
            if (b11 >= -16 && b11 <= 47) {
                this.strlen = b11;
                this.offset = i9 + 1;
            } else if (b11 < 48 || b11 > 63) {
                this.strlen = readLength();
            } else {
                this.strlen = ((b11 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8) + (bArr[i9 + 1] & 255);
                this.offset = i9 + 2;
            }
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_8;
        } else {
            if (b10 != 123) {
                if (b10 == 124) {
                    utf16be = readUTF16LE();
                    charset2 = StandardCharsets.UTF_16LE;
                } else if (b10 == 125) {
                    utf16be = readUTF16BE();
                    if (utf16be != null) {
                        return utf16be;
                    }
                    charset2 = StandardCharsets.UTF_16BE;
                } else {
                    if (b10 != 126) {
                        return readStringTypeNotMatch();
                    }
                    readGB18030();
                    charset = GB18030;
                }
                if (utf16be == null) {
                    return (this.context.features & JSONReader.Feature.TrimString.mask) != 0 ? utf16be.trim() : utf16be;
                }
                int i10 = this.strlen;
                if (i10 < 0) {
                    return this.symbolTable.getName(-i10);
                }
                String str = new String(this.bytes, this.offset, i10, charset2);
                this.offset += this.strlen;
                if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                    str = str.trim();
                }
                if (this.strlen != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                    return str;
                }
                return null;
            }
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_16;
        }
        charset2 = charset;
        utf16be = null;
        if (utf16be == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String readStringTypeNotMatch() {
        byte b10 = this.strtype;
        if (b10 >= -16 && b10 <= 47) {
            return Byte.toString(b10);
        }
        if (b10 >= 48 && b10 <= 63) {
            int i9 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            byte[] bArr = this.bytes;
            int i10 = this.offset;
            this.offset = i10 + 1;
            return Integer.toString(i9 + (bArr[i10] & 255));
        }
        if (b10 >= 64 && b10 <= 71) {
            int int3 = getInt3(this.bytes, this.offset, b10);
            this.offset += 2;
            return Integer.toString(int3);
        }
        if (b10 >= -40 && b10 <= -17) {
            return Integer.toString(b10 + 32);
        }
        if (b10 >= -56 && b10 <= -41) {
            int i11 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
            byte[] bArr2 = this.bytes;
            int i12 = this.offset;
            this.offset = i12 + 1;
            return Integer.toString(i11 + (bArr2[i12] & 255));
        }
        if (b10 >= -64 && b10 <= -57) {
            byte[] bArr3 = this.bytes;
            int i13 = this.offset;
            int i14 = i13 + 1;
            this.offset = i14;
            int i15 = ((b10 + 60) << 16) + ((bArr3[i13] & 255) << 8);
            this.offset = i13 + 2;
            return Integer.toString(i15 + (bArr3[i14] & 255));
        }
        if (b10 == -110) {
            this.offset--;
            Object any = readAny();
            if (any == null) {
                return null;
            }
            return JSON.toJSONString(any, JSONWriter.Feature.WriteThrowableClassName);
        }
        if (b10 == -81) {
            return null;
        }
        if (b10 != 72) {
            if (b10 == -66) {
                long jReverseBytes = JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                }
                this.offset += 8;
                return Long.toString(jReverseBytes);
            }
            if (b10 != -65) {
                switch (b10) {
                    case -85:
                        long jReverseBytes2 = JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                        this.offset += 8;
                        if (!JDKUtils.BIG_ENDIAN) {
                            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                        }
                        return DateUtils.toString(jReverseBytes2, false, DateUtils.DEFAULT_ZONE_ID);
                    case -84:
                        long j3 = getInt(this.bytes, this.offset);
                        this.offset += 4;
                        return DateUtils.toString(j3 * 1000, false, DateUtils.DEFAULT_ZONE_ID);
                    case -83:
                        long j4 = getInt(this.bytes, this.offset);
                        this.offset += 4;
                        return DateUtils.toString(j4 * 60000, false, DateUtils.DEFAULT_ZONE_ID);
                    default:
                        switch (b10) {
                            case -78:
                                return "0.0";
                            case -77:
                                return "1.0";
                            case -76:
                                return Double.toString(readInt64Value());
                            case -75:
                                long jReverseBytes3 = JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
                                this.offset += 8;
                                if (!JDKUtils.BIG_ENDIAN) {
                                    jReverseBytes3 = Long.reverseBytes(jReverseBytes3);
                                }
                                return Double.toString(Double.longBitsToDouble(jReverseBytes3));
                            case -74:
                                return Float.toString(readInt32Value());
                            case -73:
                                int i16 = getInt(this.bytes, this.offset);
                                this.offset += 4;
                                return Float.toString(Float.intBitsToFloat(i16));
                            case -72:
                            case -70:
                                return Long.toString(readInt64Value());
                            case -71:
                                int int32Value = readInt32Value();
                                BigInteger bigInteger = readBigInteger();
                                return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).toString();
                            case -69:
                                int int32Value2 = readInt32Value();
                                byte[] bArr4 = new byte[int32Value2];
                                System.arraycopy(this.bytes, this.offset, bArr4, 0, int32Value2);
                                this.offset += int32Value2;
                                return new BigInteger(bArr4).toString();
                            default:
                                throw notSupportString();
                        }
                }
            }
        }
        long j5 = getInt(this.bytes, this.offset);
        this.offset += 4;
        return Long.toString(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String readStringUTF8() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 >= -16 && b10 <= 47) {
            this.offset = i9 + 1;
            this.strlen = b10;
        } else if (b10 < 48 || b10 > 63) {
            this.strlen = readLength();
        } else {
            int i10 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            this.strlen = i10 + (bArr[i9 + 1] & 255);
        }
        this.strBegin = this.offset;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ZonedDateTime readTimestampWithTimeZone() {
        ZoneId zoneId;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        int i11 = bArr[i9] << 8;
        int i12 = i9 + 2;
        this.offset = i12;
        int i13 = i11 + (bArr[i10] & 255);
        int i14 = i9 + 3;
        this.offset = i14;
        byte b10 = bArr[i12];
        int i15 = i9 + 4;
        this.offset = i15;
        byte b11 = bArr[i14];
        int i16 = i9 + 5;
        this.offset = i16;
        byte b12 = bArr[i15];
        int i17 = i9 + 6;
        this.offset = i17;
        byte b13 = bArr[i16];
        this.offset = i9 + 7;
        byte b14 = bArr[i17];
        int int32Value = readInt32Value();
        byte[] bArr2 = SHANGHAI_ZONE_ID_NAME_BYTES;
        if (this.offset + bArr2.length < bArr.length) {
            int i18 = 0;
            while (true) {
                int length = bArr2.length;
                int i19 = this.offset;
                if (i18 >= length) {
                    this.offset = i19 + bArr2.length;
                    zoneId = DateUtils.SHANGHAI_ZONE_ID;
                    break;
                }
                if (bArr[i19 + i18] != bArr2[i18]) {
                    break;
                }
                i18++;
            }
            zoneId = DateUtils.getZoneId(readString(), DateUtils.SHANGHAI_ZONE_ID);
        } else {
            zoneId = DateUtils.getZoneId(readString(), DateUtils.SHANGHAI_ZONE_ID);
        }
        return ZonedDateTime.of(LocalDateTime.of(i13, b10, b11, b12, b13, b14, int32Value), zoneId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String readUTF16BE() {
        this.strlen = readLength();
        this.strBegin = this.offset;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String readUTF16LE() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 >= -16 && b10 <= 47) {
            this.offset = i9 + 1;
            this.strlen = b10;
        } else if (b10 < 48 || b10 > 63) {
            this.strlen = readLength();
        } else {
            int i10 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            this.strlen = i10 + (bArr[i9 + 1] & 255);
        }
        this.strBegin = this.offset;
        if (this.strlen == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ZonedDateTime readZonedDateTime0(int i9) {
        if (i9 == -88) {
            byte[] bArr = this.bytes;
            int i10 = this.offset;
            int i11 = i10 + 1;
            this.offset = i11;
            int i12 = bArr[i10] << 8;
            int i13 = i10 + 2;
            this.offset = i13;
            int i14 = i12 + (bArr[i11] & 255);
            int i15 = i10 + 3;
            this.offset = i15;
            byte b10 = bArr[i13];
            int i16 = i10 + 4;
            this.offset = i16;
            byte b11 = bArr[i15];
            int i17 = i10 + 5;
            this.offset = i17;
            byte b12 = bArr[i16];
            int i18 = i10 + 6;
            this.offset = i18;
            byte b13 = bArr[i17];
            this.offset = i10 + 7;
            return ZonedDateTime.of(LocalDateTime.of(i14, b10, b11, b12, b13, bArr[i18], readInt32Value()), DateUtils.DEFAULT_ZONE_ID);
        }
        if (i9 == -87) {
            byte[] bArr2 = this.bytes;
            int i19 = this.offset;
            int i20 = i19 + 1;
            this.offset = i20;
            int i21 = bArr2[i19] << 8;
            int i22 = i19 + 2;
            this.offset = i22;
            int i23 = i21 + (bArr2[i20] & 255);
            int i24 = i19 + 3;
            this.offset = i24;
            byte b14 = bArr2[i22];
            this.offset = i19 + 4;
            return ZonedDateTime.of(LocalDate.of(i23, b14, bArr2[i24]), LocalTime.MIN, DateUtils.DEFAULT_ZONE_ID);
        }
        if (i9 != -66) {
            switch (i9) {
                case -85:
                    break;
                case -84:
                    long j3 = getInt(this.bytes, this.offset);
                    this.offset += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(j3), DateUtils.DEFAULT_ZONE_ID);
                case -83:
                    long j4 = getInt(this.bytes, this.offset);
                    this.offset += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(j4 * 60), DateUtils.DEFAULT_ZONE_ID);
                case -82:
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(readInt64Value(), readInt32Value()), DateUtils.DEFAULT_ZONE_ID);
                case -81:
                    return null;
                default:
                    if (i9 < 73 || i9 > 120) {
                        C0086a.m450i(JSONB.typeName((byte) i9), "type not support : ");
                        return null;
                    }
                    this.offset--;
                    return readZonedDateTimeX(i9 - 73);
            }
        }
        long jReverseBytes = JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) this.offset));
        this.offset += 8;
        if (!JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(jReverseBytes), DateUtils.DEFAULT_ZONE_ID);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONException typeRefNotFound(int i9) {
        throw new JSONException(AbstractC0921a.m2249l(i9, "type ref not found : "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void autoTypeError() {
        throw new JSONException("auotype not support : " + getString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public ObjectReader checkAutoType(Class cls, long j3, long j4) {
        Class objectClass;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        ObjectReader objectReader;
        ObjectReader objectReader2;
        Class objectClass2;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -110) {
            return null;
        }
        this.offset = i9 + 1;
        long typeHashCode = readTypeHashCode();
        JSONReader.Context context = this.context;
        ObjectReaderProvider objectReaderProvider = context.provider;
        if (j3 == typeHashCode && (objectClass2 = (objectReader2 = context.getObjectReader(cls)).getObjectClass()) != null && objectClass2 == cls) {
            objectReaderProvider.registerIfAbsent(typeHashCode, objectReader2);
            return objectReader2;
        }
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = this.context.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null) {
            Class<?> clsApply = autoTypeBeforeHandler.apply(typeHashCode, (Class<?>) cls, j4);
            if (clsApply == null) {
                clsApply = autoTypeBeforeHandler.apply(getString(), (Class<?>) cls, j4);
            }
            if (clsApply != null && (objectReader = this.context.getObjectReader(clsApply)) != null) {
                return objectReader;
            }
        }
        long j5 = this.context.features | j4;
        if ((JSONReader.Feature.SupportAutoType.mask & j5) == 0) {
            if ((JSONReader.Feature.ErrorOnNotSupportAutoType.mask & j5) == 0) {
                return null;
            }
            autoTypeError();
        }
        ObjectReader objectReader3 = objectReaderProvider.getObjectReader(typeHashCode);
        if (objectReader3 != null && (objectClass = objectReader3.getObjectClass()) != null && (classLoader = objectClass.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
            objectReader3 = getObjectReaderContext(objectReader3, objectClass, contextClassLoader);
        }
        if (objectReader3 == null && (objectReader3 = objectReaderProvider.getObjectReader(getString(), cls, j5)) == null) {
            autoTypeError();
        }
        this.type = this.bytes[this.offset];
        return objectReader3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.valueBytes;
        if (bArr != null && bArr.length < 1048576) {
            JSONFactory.BYTES_UPDATER.lazySet(this.cacheItem, bArr);
        }
        char[] cArr = this.charBuf;
        if (cArr == null || cArr.length >= 1048576) {
            return;
        }
        JSONFactory.CHARS_UPDATER.lazySet(this.cacheItem, cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String error(byte b10) {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(JSONB.typeName(b10));
        if (isString()) {
            int i9 = this.offset;
            this.offset = i9 - 1;
            try {
                string = readString();
            } catch (Throwable unused) {
                string = null;
            }
            if (string != null) {
                sb2.append(' ');
                sb2.append(string);
            }
            this.offset = i9;
        }
        sb2.append(", offset ");
        sb2.append(this.offset);
        sb2.append('/');
        sb2.append(this.bytes.length);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String getFieldName() {
        return getString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getLatin1String(int i9, int i10) {
        if (JDKUtils.ANDROID_SDK_INT >= 34) {
            return new String(this.bytes, i9, i10, StandardCharsets.ISO_8859_1);
        }
        char[] andSet = this.charBuf;
        if (andSet == null) {
            andSet = JSONFactory.CHARS_UPDATER.getAndSet(this.cacheItem, null);
            this.charBuf = andSet;
        }
        if (andSet == null || andSet.length < i10) {
            andSet = new char[i10];
            this.charBuf = andSet;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            andSet[i11] = (char) (this.bytes[i9 + i11] & 255);
        }
        return new String(andSet, 0, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getNameHashCode() {
        long j3;
        long j4;
        int i9 = this.strBegin;
        int i10 = 0;
        long j5 = 0;
        int i11 = 0;
        while (i11 < this.strlen) {
            byte[] bArr = this.bytes;
            byte b10 = bArr[i9];
            if (b10 < 0 || i11 >= 8 || (i11 == 0 && bArr[this.strBegin] == 0)) {
                i9 = this.strBegin;
                j5 = 0;
                if (j5 == 0) {
                    return j5;
                }
                long j10 = Fnv.MAGIC_HASH_CODE;
                while (i10 < this.strlen) {
                    j10 = (j10 ^ ((long) this.bytes[i9])) * Fnv.MAGIC_PRIME;
                    i10++;
                    i9++;
                }
                return j10;
            }
            switch (i11) {
                case 0:
                    j5 = b10;
                    continue;
                    i11++;
                    i9++;
                    break;
                case 1:
                    j3 = b10 << 8;
                    j4 = 255;
                    break;
                case 2:
                    j3 = b10 << JSONB.Constants.BC_INT32_NUM_16;
                    j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                    break;
                case 3:
                    j3 = b10 << 24;
                    j4 = 16777215;
                    break;
                case 4:
                    j3 = ((long) b10) << 32;
                    j4 = 4294967295L;
                    break;
                case 5:
                    j3 = ((long) b10) << 40;
                    j4 = 1099511627775L;
                    break;
                case 6:
                    j3 = ((long) b10) << 48;
                    j4 = 281474976710655L;
                    break;
                case 7:
                    j3 = ((long) b10) << 56;
                    j4 = 72057594037927935L;
                    break;
                default:
                    i11++;
                    i9++;
                    break;
            }
            j5 = (j5 & j4) + j3;
            i11++;
            i9++;
        }
        if (j5 == 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getNameHashCodeLCase() {
        long j3;
        long j4;
        int i9 = this.strBegin;
        int i10 = 0;
        long j5 = 0;
        int i11 = 0;
        while (i11 < this.strlen) {
            byte[] bArr = this.bytes;
            byte b10 = bArr[i9];
            if (b10 < 0 || i11 >= 8 || (i11 == 0 && bArr[this.strBegin] == 0)) {
                i9 = this.strBegin;
                j5 = 0;
                if (j5 == 0) {
                    return j5;
                }
                long j10 = Fnv.MAGIC_HASH_CODE;
                while (i10 < this.strlen) {
                    int i12 = i9 + 1;
                    byte b11 = this.bytes[i9];
                    if (b11 >= 65 && b11 <= 90) {
                        b11 = (byte) (b11 + 32);
                    }
                    if (b11 != 95 && b11 != 45 && b11 != 32) {
                        j10 = (j10 ^ ((long) b11)) * Fnv.MAGIC_PRIME;
                    }
                    i10++;
                    i9 = i12;
                }
                return j10;
            }
            if ((b10 != 95 && b10 != 45 && b10 != 32) || bArr[i9 + 1] == b10) {
                if (b10 >= 65 && b10 <= 90) {
                    b10 = (byte) (b10 + 32);
                }
                switch (i11) {
                    case 0:
                        j5 = b10;
                        break;
                    case 1:
                        j3 = b10 << 8;
                        j4 = 255;
                        j5 = (j5 & j4) + j3;
                        break;
                    case 2:
                        j3 = b10 << JSONB.Constants.BC_INT32_NUM_16;
                        j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        j5 = (j5 & j4) + j3;
                        break;
                    case 3:
                        j3 = b10 << 24;
                        j4 = 16777215;
                        j5 = (j5 & j4) + j3;
                        break;
                    case 4:
                        j3 = ((long) b10) << 32;
                        j4 = 4294967295L;
                        j5 = (j5 & j4) + j3;
                        break;
                    case 5:
                        j3 = ((long) b10) << 40;
                        j4 = 1099511627775L;
                        j5 = (j5 & j4) + j3;
                        break;
                    case 6:
                        j3 = ((long) b10) << 48;
                        j4 = 281474976710655L;
                        j5 = (j5 & j4) + j3;
                        break;
                    case 7:
                        j3 = ((long) b10) << 56;
                        j4 = 72057594037927935L;
                        j5 = (j5 & j4) + j3;
                        break;
                }
                i11++;
            }
            i9++;
        }
        if (j5 == 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public int getRawInt() {
        int i9 = this.offset;
        if (i9 + 3 < this.end) {
            return JDKUtils.UNSAFE.getInt(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long getRawLong() {
        int i9 = this.offset;
        if (i9 + 7 < this.end) {
            return JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String getString() {
        Charset charset;
        byte b10 = this.strtype;
        if (b10 == -81) {
            return null;
        }
        int i9 = this.strlen;
        if (i9 < 0) {
            return this.symbolTable.getName(-i9);
        }
        if (b10 == 121 || (b10 >= 73 && b10 <= 120)) {
            charset = StandardCharsets.ISO_8859_1;
            if (JDKUtils.ANDROID_SDK_INT < 34) {
                int i10 = this.strBegin;
                char[] andSet = this.charBuf;
                if (andSet == null) {
                    andSet = JSONFactory.CHARS_UPDATER.getAndSet(this.cacheItem, null);
                    this.charBuf = andSet;
                }
                if (andSet == null || andSet.length < this.strlen) {
                    andSet = new char[this.strlen];
                    this.charBuf = andSet;
                }
                int i11 = 0;
                while (true) {
                    int i12 = this.strlen;
                    if (i11 >= i12) {
                        return new String(andSet, 0, i12);
                    }
                    andSet[i11] = (char) (this.bytes[i10 + i11] & 255);
                    i11++;
                }
            }
        } else if (b10 == 122) {
            charset = StandardCharsets.UTF_8;
        } else if (b10 == 123) {
            charset = StandardCharsets.UTF_16;
        } else if (b10 == 124) {
            charset = StandardCharsets.UTF_16LE;
        } else {
            if (b10 != 125) {
                throw notSupportType(b10);
            }
            charset = StandardCharsets.UTF_16BE;
        }
        return new String(this.bytes, this.strBegin, i9, charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final int getStringLength() {
        byte b10 = this.bytes[this.offset];
        this.type = b10;
        if (b10 >= 73 && b10 < 120) {
            return b10 - 73;
        }
        C2104o.m5297w(JSONB.typeName(b10));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public byte getType() {
        return this.bytes[this.offset];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isArray() {
        byte b10;
        int i9 = this.offset;
        byte[] bArr = this.bytes;
        return i9 < bArr.length && (b10 = bArr[i9]) >= -108 && b10 <= -92;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isBinary() {
        return this.bytes[this.offset] == -111;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isDate() {
        byte b10 = this.bytes[this.offset];
        return b10 >= -89 && b10 <= -82;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isEnd() {
        return this.offset >= this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isInt() {
        byte b10 = this.bytes[this.offset];
        return (b10 >= -70 && b10 <= 72) || b10 == -84 || b10 == -83 || b10 == -85;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNull() {
        return this.bytes[this.offset] == -81;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNumber() {
        byte b10 = this.bytes[this.offset];
        return b10 >= -78 && b10 <= 72;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isObject() {
        int i9 = this.offset;
        return i9 < this.end && this.bytes[i9] == -90;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isReference() {
        int i9 = this.offset;
        byte[] bArr = this.bytes;
        return i9 < bArr.length && bArr[i9] == -109;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isString() {
        int i9 = this.offset;
        byte[] bArr = this.bytes;
        if (i9 >= bArr.length) {
            return false;
        }
        byte b10 = bArr[i9];
        this.type = b10;
        return b10 >= 73;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public JSONReader.SavePoint mark() {
        return new JSONReader.SavePoint(this.offset, this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
        this.offset++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayEnd() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayStart() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfComma() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfInfinity() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != b10) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c10, char c11, char c12) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchTypedAny() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -110) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match10(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 11;
        if (i9 >= this.end || (JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i9)) - 7) & 72057594037927935L) != j3) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match11(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 12;
        if (i9 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i9)) - 8) != j3) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match12(long j3, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 13;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i10)) - 9) != j3 || bArr[i9 + 12] != b10) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match13(long j3, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 14;
        if (i10 + 15 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i11;
        if (unsafe.getLong(bArr, (j4 + j5) - 10) != j3 || unsafe.getShort(bArr, (j4 + j5) - 2) != i9) {
            return false;
        }
        this.offset = i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match14(long j3, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 15;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i10;
        if (unsafe.getLong(bArr, (j4 + j5) - 11) != j3 || (unsafe.getInt(bArr, (j4 + j5) - 3) & 16777215) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match15(long j3, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 16;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i10;
        if (unsafe.getLong(bArr, (j4 + j5) - 12) != j3 || unsafe.getInt(bArr, (j4 + j5) - 4) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match16(long j3, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 17;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i11;
        if (unsafe.getLong(bArr, (j4 + j5) - 13) != j3 || unsafe.getInt(bArr, (j4 + j5) - 5) != i9 || bArr[i10 + 16] != b10) {
            return false;
        }
        this.offset = i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match17(long j3, long j4) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 18;
        if (i9 + 19 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 14) != j3 || (unsafe.getLong(bArr, (j5 + j10) - 6) & 281474976710655L) != j4) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match18(long j3, long j4) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 19;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i9;
        if (unsafe.getLong(bArr, (j5 + j10) - 15) != j3 || (unsafe.getLong(bArr, (j5 + j10) - 7) & 72057594037927935L) != j4) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match19(long j3, long j4) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 20;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i9;
        if (unsafe.getLong(bArr, (j5 + j10) - 16) != j3 || unsafe.getLong(bArr, (j5 + j10) - 8) != j4) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match2() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match20(long j3, long j4, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 21;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 17) != j3 || unsafe.getLong(bArr, (j5 + j10) - 9) != j4 || bArr[i9 + 20] != b10) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match21(long j3, long j4, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 22;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 18) != j3 || unsafe.getLong(bArr, (j5 + j10) - 10) != j4 || unsafe.getShort(bArr, (j5 + j10) - 2) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match22(long j3, long j4, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 23;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 19) != j3 || unsafe.getLong(bArr, (j5 + j10) - 11) != j4 || (unsafe.getInt(bArr, (j5 + j10) - 3) & 16777215) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match23(long j3, long j4, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 24;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 20) != j3 || unsafe.getLong(bArr, (j5 + j10) - 12) != j4 || unsafe.getInt(bArr, (j5 + j10) - 4) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match24(long j3, long j4, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 25;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j10 = i11;
        if (unsafe.getLong(bArr, (j5 + j10) - 21) != j3 || unsafe.getLong(bArr, (j5 + j10) - 13) != j4 || unsafe.getInt(bArr, (j5 + j10) - 5) != i9 || bArr[i10 + 24] != b10) {
            return false;
        }
        this.offset = i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match25(long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 26;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i9;
        if (unsafe.getLong(bArr, (j10 + j11) - 22) != j3 || unsafe.getLong(bArr, (j10 + j11) - 14) != j4 || (unsafe.getLong(bArr, (j10 + j11) - 6) & 281474976710655L) != j5) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match26(long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 27;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i9;
        if (unsafe.getLong(bArr, (j10 + j11) - 23) != j3 || unsafe.getLong(bArr, (j10 + j11) - 15) != j4 || (unsafe.getLong(bArr, (j10 + j11) - 7) & 72057594037927935L) != j5) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match27(long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 28;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i9;
        if (unsafe.getLong(bArr, (j10 + j11) - 24) != j3 || unsafe.getLong(bArr, (j10 + j11) - 16) != j4 || unsafe.getLong(bArr, (j10 + j11) - 8) != j5) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match28(long j3, long j4, long j5, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 29;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 25) != j3 || unsafe.getLong(bArr, (j10 + j11) - 17) != j4 || unsafe.getLong(bArr, (j10 + j11) - 9) != j5 || bArr[i9 + 28] != b10) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match29(long j3, long j4, long j5, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 30;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 26) != j3 || unsafe.getLong(bArr, (j10 + j11) - 18) != j4 || unsafe.getLong(bArr, (j10 + j11) - 10) != j5 || unsafe.getShort(bArr, (j10 + j11) - 2) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match3() {
        int i9 = this.offset + 4;
        if (i9 > this.end) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match30(long j3, long j4, long j5, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 31;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 27) != j3 || unsafe.getLong(bArr, (j10 + j11) - 19) != j4 || unsafe.getLong(bArr, (j10 + j11) - 11) != j5 || (unsafe.getInt(bArr, (j10 + j11) - 3) & 16777215) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match31(long j3, long j4, long j5, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 32;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 28) != j3 || unsafe.getLong(bArr, (j10 + j11) - 20) != j4 || unsafe.getLong(bArr, (j10 + j11) - 12) != j5 || unsafe.getInt(bArr, (j10 + j11) - 4) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match32(long j3, long j4, long j5, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 33;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = BASE;
        long j11 = i11;
        if (unsafe.getLong(bArr, (j10 + j11) - 29) != j3 || unsafe.getLong(bArr, (j10 + j11) - 21) != j4 || unsafe.getLong(bArr, (j10 + j11) - 13) != j5 || unsafe.getInt(bArr, (j10 + j11) - 5) != i9 || bArr[i10 + 32] != b10) {
            return false;
        }
        this.offset = i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match33(long j3, long j4, long j5, long j10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 34;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i9;
        if (unsafe.getLong(bArr, (j11 + j12) - 30) != j3 || unsafe.getLong(bArr, (j11 + j12) - 22) != j4 || unsafe.getLong(bArr, (j11 + j12) - 14) != j5 || (unsafe.getLong(bArr, (j11 + j12) - 6) & 281474976710655L) != j10) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match34(long j3, long j4, long j5, long j10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 35;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i9;
        if (unsafe.getLong(bArr, (j11 + j12) - 31) != j3 || unsafe.getLong(bArr, (j11 + j12) - 23) != j4 || unsafe.getLong(bArr, (j11 + j12) - 15) != j5 || (unsafe.getLong(bArr, (j11 + j12) - 7) & 72057594037927935L) != j10) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match35(long j3, long j4, long j5, long j10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 36;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i9;
        if (unsafe.getLong(bArr, (j11 + j12) - 32) != j3 || unsafe.getLong(bArr, (j11 + j12) - 24) != j4 || unsafe.getLong(bArr, (j11 + j12) - 16) != j5 || unsafe.getLong(bArr, (j11 + j12) - 8) != j10) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match36(long j3, long j4, long j5, long j10, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 37;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 33) != j3 || unsafe.getLong(bArr, (j11 + j12) - 25) != j4 || unsafe.getLong(bArr, (j11 + j12) - 17) != j5 || unsafe.getLong(bArr, (j11 + j12) - 9) != j10 || bArr[i9 + 36] != b10) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match37(long j3, long j4, long j5, long j10, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 38;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 34) != j3 || unsafe.getLong(bArr, (j11 + j12) - 26) != j4 || unsafe.getLong(bArr, (j11 + j12) - 18) != j5 || unsafe.getLong(bArr, (j11 + j12) - 10) != j10 || unsafe.getShort(bArr, (j11 + j12) - 2) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match38(long j3, long j4, long j5, long j10, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 39;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 35) != j3 || unsafe.getLong(bArr, (j11 + j12) - 27) != j4 || unsafe.getLong(bArr, (j11 + j12) - 19) != j5 || unsafe.getLong(bArr, (j11 + j12) - 11) != j10 || (unsafe.getInt(bArr, (j11 + j12) - 3) & 16777215) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match39(long j3, long j4, long j5, long j10, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 40;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 36) != j3 || unsafe.getLong(bArr, (j11 + j12) - 28) != j4 || unsafe.getLong(bArr, (j11 + j12) - 20) != j5 || unsafe.getLong(bArr, (j11 + j12) - 12) != j10 || unsafe.getInt(bArr, (j11 + j12) - 4) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match4(byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 5;
        if (i10 > this.end || bArr[i9 + 4] != b10) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match40(long j3, long j4, long j5, long j10, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 41;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = BASE;
        long j12 = i11;
        if (unsafe.getLong(bArr, (j11 + j12) - 37) != j3 || unsafe.getLong(bArr, (j11 + j12) - 29) != j4 || unsafe.getLong(bArr, (j11 + j12) - 21) != j5 || unsafe.getLong(bArr, (j11 + j12) - 13) != j10 || unsafe.getInt(bArr, (j11 + j12) - 5) != i9 || bArr[i10 + 40] != b10) {
            return false;
        }
        this.offset = i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match41(long j3, long j4, long j5, long j10, long j11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 42;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = BASE;
        long j13 = i9;
        if (unsafe.getLong(bArr, (j12 + j13) - 38) != j3 || unsafe.getLong(bArr, (j12 + j13) - 30) != j4 || unsafe.getLong(bArr, (j12 + j13) - 22) != j5 || unsafe.getLong(bArr, (j12 + j13) - 14) != j10 || (unsafe.getLong(bArr, (j12 + j13) - 6) & 281474976710655L) != j11) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match42(long j3, long j4, long j5, long j10, long j11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 43;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = BASE;
        long j13 = i9;
        if (unsafe.getLong(bArr, (j12 + j13) - 39) != j3 || unsafe.getLong(bArr, (j12 + j13) - 31) != j4 || unsafe.getLong(bArr, (j12 + j13) - 23) != j5 || unsafe.getLong(bArr, (j12 + j13) - 15) != j10 || (unsafe.getLong(bArr, (j12 + j13) - 7) & 72057594037927935L) != j11) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match43(long j3, long j4, long j5, long j10, long j11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset + 44;
        if (i9 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = BASE;
        long j13 = i9;
        if (unsafe.getLong(bArr, (j12 + j13) - 40) != j3 || unsafe.getLong(bArr, (j12 + j13) - 32) != j4 || unsafe.getLong(bArr, (j12 + j13) - 24) != j5 || unsafe.getLong(bArr, (j12 + j13) - 16) != j10 || unsafe.getLong(bArr, (j12 + j13) - 8) != j11) {
            return false;
        }
        this.offset = i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match5(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 6;
        if (i10 > this.end || JDKUtils.UNSAFE.getShort(bArr, (BASE + ((long) i10)) - 2) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match6(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 7;
        if (i10 > this.end || (JDKUtils.UNSAFE.getInt(bArr, (BASE + ((long) i10)) - 3) & 16777215) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match7(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset + 8;
        if (i10 > this.end || JDKUtils.UNSAFE.getInt(bArr, (BASE + ((long) i10)) - 4) != i9) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match8(int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 9;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (BASE + ((long) i11)) - 5) != i9 || bArr[i10 + 8] != b10) {
            return false;
        }
        this.offset = i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match9(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 10;
        if (i9 + 11 >= this.end || (JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i10)) - 6) & 281474976710655L) != j3) {
            return false;
        }
        this.offset = i10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNull() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -81) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 == -81) {
            this.offset = i9 + 1;
            return true;
        }
        if (b10 != 73) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectEnd() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -91) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -90) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfSet() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void read(Map map, long j3) {
        Object object;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -90) {
            C0086a.m450i(error(this.type), "object not support input ");
            return;
        }
        this.offset = i9 + 1;
        while (true) {
            byte[] bArr2 = this.bytes;
            int i10 = this.offset;
            byte b10 = bArr2[i10];
            if (b10 == -91) {
                this.offset = i10 + 1;
                return;
            }
            Object fieldName = b10 >= 73 ? readFieldName() : readAny();
            if (isReference()) {
                String reference = readReference();
                if ("..".equals(reference)) {
                    map.put(fieldName, map);
                } else {
                    addResolveTask(map, fieldName, JSONPath.m1657of(reference));
                    map.put(fieldName, null);
                }
            } else {
                byte[] bArr3 = this.bytes;
                int i11 = this.offset;
                byte b11 = bArr3[i11];
                if (b11 >= 73 && b11 <= 126) {
                    object = readString();
                } else if (b11 >= -16 && b11 <= 47) {
                    this.offset = i11 + 1;
                    object = Integer.valueOf(b11);
                } else if (b11 == -79) {
                    this.offset = i11 + 1;
                    object = Boolean.TRUE;
                } else if (b11 == -80) {
                    this.offset = i11 + 1;
                    object = Boolean.FALSE;
                } else {
                    object = b11 == -90 ? readObject() : readAny();
                }
                if (object != null || (this.context.features & JSONReader.Feature.IgnoreNullPropertyValue.mask) == 0) {
                    map.put(fieldName, object);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Object readAny() {
        long j3;
        Object fieldName;
        Object object;
        String str;
        String str2;
        int i9 = this.offset;
        byte[] bArr = this.bytes;
        if (i9 >= bArr.length) {
            throw new JSONException("readAny overflow : " + this.offset + "/" + this.bytes.length);
        }
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        this.type = b10;
        if (b10 == 72) {
            int i11 = getInt(bArr, i10);
            this.offset += 4;
            return new Integer(i11);
        }
        switch (b10) {
            case -112:
                return Character.valueOf((char) readInt32Value());
            case -111:
                int length = readLength();
                byte[] bArr2 = this.bytes;
                int i12 = this.offset;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i12, i12 + length);
                this.offset += length;
                return bArrCopyOfRange;
            case -110:
                long typeHashCode = readTypeHashCode();
                JSONReader.Context context = this.context;
                JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = context.autoTypeBeforeHandler;
                if (autoTypeBeforeHandler != null) {
                    Class<?> clsApply = autoTypeBeforeHandler.apply(typeHashCode, (Class<?>) null, context.features);
                    j3 = typeHashCode;
                    if (clsApply == null) {
                        String string = getString();
                        JSONReader.Context context2 = this.context;
                        clsApply = context2.autoTypeBeforeHandler.apply(string, (Class<?>) null, context2.features);
                    }
                    if (clsApply != null) {
                        return this.context.getObjectReader(clsApply).readJSONBObject(this, null, null, 0L);
                    }
                } else {
                    j3 = typeHashCode;
                }
                JSONReader.Context context3 = this.context;
                if ((context3.features & JSONReader.Feature.SupportAutoType.mask) == 0) {
                    if (isObject()) {
                        return readObject();
                    }
                    if (isArray()) {
                        return readArray();
                    }
                    throw new JSONException("autoType not support , offset " + this.offset + "/" + this.bytes.length);
                }
                ObjectReader objectReaderAutoType = context3.getObjectReaderAutoType(j3);
                if (objectReaderAutoType == null) {
                    String string2 = getString();
                    ObjectReader objectReaderAutoType2 = this.context.getObjectReaderAutoType(string2, null);
                    if (objectReaderAutoType2 == null) {
                        StringBuilder sbM1026o = AbstractC0255e.m1026o("autoType not support : ", string2, ", offset ");
                        sbM1026o.append(this.offset);
                        sbM1026o.append("/");
                        sbM1026o.append(this.bytes.length);
                        throw new JSONException(sbM1026o.toString());
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                return objectReaderAutoType.readJSONBObject(this, null, null, 0L);
            default:
                String str3 = "..";
                int i13 = 0;
                switch (b10) {
                    case -90:
                        ?? r2 = 1;
                        boolean z9 = (this.context.features & JSONReader.Feature.SupportAutoType.mask) != 0;
                        Map jSONObject = null;
                        while (true) {
                            byte[] bArr3 = this.bytes;
                            int i14 = this.offset;
                            byte b11 = bArr3[i14];
                            if (b11 == -91) {
                                this.offset = i14 + r2;
                                return jSONObject == null ? (this.context.features & JSONReader.Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject() : jSONObject;
                            }
                            if (!z9 || i13 != 0 || b11 < 73) {
                                fieldName = b11 >= 73 ? readFieldName() : readAny();
                            } else {
                                if (readFieldNameHashCode() == ObjectReader.HASH_TYPE) {
                                    ObjectReader objectReaderAutoType3 = this.context.getObjectReaderAutoType(readValueHashCode());
                                    if (objectReaderAutoType3 == null) {
                                        String string3 = getString();
                                        ObjectReader objectReaderAutoType4 = this.context.getObjectReaderAutoType(string3, null);
                                        if (objectReaderAutoType4 == null) {
                                            StringBuilder sbM1026o2 = AbstractC0255e.m1026o("auotype not support : ", string3, ", offset ");
                                            sbM1026o2.append(this.offset);
                                            sbM1026o2.append("/");
                                            sbM1026o2.append(this.bytes.length);
                                            throw new JSONException(sbM1026o2.toString());
                                        }
                                        objectReaderAutoType3 = objectReaderAutoType4;
                                    }
                                    this.typeRedirect = r2;
                                    return objectReaderAutoType3.readJSONBObject(this, null, null, 0L);
                                }
                                fieldName = getString();
                            }
                            if (jSONObject == null) {
                                JSONReader.Context context4 = this.context;
                                if ((context4.features & JSONReader.Feature.UseNativeObject.mask) != 0) {
                                    jSONObject = new HashMap();
                                } else {
                                    Supplier<Map> supplier = context4.objectSupplier;
                                    jSONObject = supplier != null ? supplier.get() : new JSONObject();
                                }
                            }
                            if (isReference()) {
                                String reference = readReference();
                                if (str3.equals(reference)) {
                                    jSONObject.put(fieldName, jSONObject);
                                } else {
                                    addResolveTask(jSONObject, fieldName, JSONPath.m1657of(reference));
                                    jSONObject.put(fieldName, null);
                                }
                                str = str3;
                            } else {
                                byte[] bArr4 = this.bytes;
                                int i15 = this.offset;
                                byte b12 = bArr4[i15];
                                if (b12 >= 73 && b12 <= 126) {
                                    object = readString();
                                } else if (b12 >= -16 && b12 <= 47) {
                                    this.offset = i15 + 1;
                                    object = Integer.valueOf(b12);
                                } else if (b12 == -79) {
                                    this.offset = i15 + 1;
                                    object = Boolean.TRUE;
                                } else if (b12 == -80) {
                                    this.offset = i15 + 1;
                                    object = Boolean.FALSE;
                                } else {
                                    object = b12 == -90 ? readObject() : readAny();
                                }
                                if (object == null) {
                                    str = str3;
                                    if ((this.context.features & JSONReader.Feature.IgnoreNullPropertyValue.mask) != 0) {
                                    }
                                } else {
                                    str = str3;
                                }
                                jSONObject.put(fieldName, object);
                            }
                            i13++;
                            str3 = str;
                            r2 = 1;
                        }
                        break;
                    case -89:
                        int i16 = i9 + 2;
                        this.offset = i16;
                        byte b13 = bArr[i10];
                        int i17 = i9 + 3;
                        this.offset = i17;
                        byte b14 = bArr[i16];
                        this.offset = i9 + 4;
                        return LocalTime.of(b13, b14, bArr[i17], readInt32Value());
                    case -88:
                        int i18 = i9 + 2;
                        this.offset = i18;
                        int i19 = bArr[i10] << 8;
                        int i20 = i9 + 3;
                        this.offset = i20;
                        int i21 = i19 + (bArr[i18] & 255);
                        int i22 = i9 + 4;
                        this.offset = i22;
                        byte b15 = bArr[i20];
                        int i23 = i9 + 5;
                        this.offset = i23;
                        byte b16 = bArr[i22];
                        int i24 = i9 + 6;
                        this.offset = i24;
                        byte b17 = bArr[i23];
                        int i25 = i9 + 7;
                        this.offset = i25;
                        byte b18 = bArr[i24];
                        this.offset = i9 + 8;
                        return LocalDateTime.of(i21, b15, b16, b17, b18, bArr[i25], readInt32Value());
                    case -87:
                        int i26 = i9 + 2;
                        this.offset = i26;
                        int i27 = bArr[i10] << 8;
                        int i28 = i9 + 3;
                        this.offset = i28;
                        int i29 = i27 + (bArr[i26] & 255);
                        int i30 = i9 + 4;
                        this.offset = i30;
                        byte b19 = bArr[i28];
                        this.offset = i9 + 5;
                        return LocalDate.of(i29, b19, bArr[i30]);
                    case -86:
                        return readTimestampWithTimeZone();
                    case -85:
                        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                        this.offset += 8;
                        if (!JDKUtils.BIG_ENDIAN) {
                            jReverseBytes = Long.reverseBytes(jReverseBytes);
                        }
                        return new Date(jReverseBytes);
                    case -84:
                        long j4 = getInt(bArr, i10);
                        this.offset += 4;
                        return new Date(j4 * 1000);
                    case -83:
                        long j5 = getInt(bArr, i10);
                        this.offset += 4;
                        return new Date(j5 * 60000);
                    case -82:
                        return Instant.ofEpochSecond(readInt64Value(), readInt32Value());
                    case -81:
                        return null;
                    case -80:
                        return Boolean.FALSE;
                    case -79:
                        return Boolean.TRUE;
                    case -78:
                        return Double.valueOf(0.0d);
                    case -77:
                        return Double.valueOf(1.0d);
                    case -76:
                        return Double.valueOf(readInt64Value());
                    case -75:
                        long jReverseBytes2 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                        this.offset += 8;
                        if (!JDKUtils.BIG_ENDIAN) {
                            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                        }
                        return Double.valueOf(Double.longBitsToDouble(jReverseBytes2));
                    case -74:
                        return Float.valueOf(readInt32Value());
                    case -73:
                        int i31 = getInt(bArr, i10);
                        this.offset += 4;
                        return Float.valueOf(Float.intBitsToFloat(i31));
                    case -72:
                        return BigDecimal.valueOf(readInt64Value());
                    case -71:
                        int int32Value = readInt32Value();
                        BigInteger bigInteger = readBigInteger();
                        return int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value);
                    case -70:
                        return BigInteger.valueOf(readInt64Value());
                    case -69:
                        int int32Value2 = readInt32Value();
                        byte[] bArr5 = new byte[int32Value2];
                        System.arraycopy(this.bytes, this.offset, bArr5, 0, int32Value2);
                        this.offset += int32Value2;
                        return new BigInteger(bArr5);
                    case -68:
                        int i32 = i9 + 2;
                        this.offset = i32;
                        int i33 = bArr[i10] << 8;
                        this.offset = i9 + 3;
                        return Short.valueOf((short) (i33 + (bArr[i32] & 255)));
                    case -67:
                        this.offset = i9 + 2;
                        return Byte.valueOf(bArr[i10]);
                    case -66:
                        long jReverseBytes3 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                        this.offset += 8;
                        if (!JDKUtils.BIG_ENDIAN) {
                            jReverseBytes3 = Long.reverseBytes(jReverseBytes3);
                        }
                        return Long.valueOf(jReverseBytes3);
                    case -65:
                        int i34 = getInt(bArr, i10);
                        this.offset += 4;
                        return new Long(i34);
                    default:
                        switch (b10) {
                            case 122:
                                int length2 = readLength();
                                str2 = (length2 != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) ? new String(this.bytes, this.offset, length2, StandardCharsets.UTF_8) : null;
                                this.offset += length2;
                                return str2;
                            case 123:
                                int length3 = readLength();
                                str2 = (length3 != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) ? new String(this.bytes, this.offset, length3, StandardCharsets.UTF_16) : null;
                                this.offset += length3;
                                return str2;
                            case 124:
                                int length4 = readLength();
                                str2 = (length4 != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) ? new String(this.bytes, this.offset, length4, StandardCharsets.UTF_16LE) : null;
                                this.offset += length4;
                                return str2;
                            case 125:
                                int length5 = readLength();
                                str2 = (length5 != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) ? new String(this.bytes, this.offset, length5, StandardCharsets.UTF_16BE) : null;
                                this.offset += length5;
                                return str2;
                            case 126:
                                if (GB18030 == null) {
                                    GB18030 = Charset.forName("GB18030");
                                }
                                int length6 = readLength();
                                str2 = (length6 != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) ? new String(this.bytes, this.offset, length6, GB18030) : null;
                                this.offset += length6;
                                return str2;
                            default:
                                if (b10 >= -16 && b10 <= 47) {
                                    return Integer.valueOf(b10);
                                }
                                if (b10 >= 48 && b10 <= 63) {
                                    int i35 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                    this.offset = i9 + 2;
                                    return Integer.valueOf(i35 + (bArr[i10] & 255));
                                }
                                if (b10 >= 64 && b10 <= 71) {
                                    int int3 = getInt3(bArr, i10, b10);
                                    this.offset += 2;
                                    return Integer.valueOf(int3);
                                }
                                if (b10 >= -40 && b10 <= -17) {
                                    return Long.valueOf(((long) (b10 - JSONB.Constants.BC_INT64_NUM_MIN)) - 8);
                                }
                                if (b10 >= -56 && b10 <= -41) {
                                    long j10 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                    this.offset = i9 + 2;
                                    return Long.valueOf(j10 + ((long) (bArr[i10] & 255)));
                                }
                                if (b10 >= -64 && b10 <= -57) {
                                    int i36 = (b10 + 60) << 16;
                                    this.offset = i9 + 2;
                                    int i37 = i36 + ((bArr[i10] & 255) << 8);
                                    this.offset = i9 + 3;
                                    return Long.valueOf(i37 + (bArr[r5] & 255));
                                }
                                if (b10 >= -108 && b10 <= -92) {
                                    int length7 = b10 == -92 ? readLength() : b10 + 108;
                                    JSONReader.Context context5 = this.context;
                                    if (length7 == 0) {
                                        if ((context5.features & JSONReader.Feature.UseNativeObject.mask) != 0) {
                                            return new ArrayList();
                                        }
                                        Supplier<List> supplier2 = context5.arraySupplier;
                                        return supplier2 != null ? supplier2.get() : new JSONArray();
                                    }
                                    List arrayList = (context5.features & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList(length7) : new JSONArray(length7);
                                    while (i13 < length7) {
                                        if (isReference()) {
                                            String reference2 = readReference();
                                            if ("..".equals(reference2)) {
                                                arrayList.add(arrayList);
                                            } else {
                                                arrayList.add(null);
                                                addResolveTask(arrayList, i13, JSONPath.m1657of(reference2));
                                            }
                                        } else {
                                            arrayList.add(readAny());
                                        }
                                        i13++;
                                    }
                                    return arrayList;
                                }
                                if (b10 < 73 || b10 > 121) {
                                    if (b10 != 127) {
                                        C0086a.m450i(error(this.type), "not support type : ");
                                        return null;
                                    }
                                    int length8 = readLength();
                                    this.strlen = length8;
                                    if (length8 < 0) {
                                        return this.symbolTable.getName(-length8);
                                    }
                                    C0086a.m466y(this.strlen, "not support symbol : ");
                                    return null;
                                }
                                int length9 = b10 == 121 ? readLength() : b10 - 73;
                                this.strlen = length9;
                                if (length9 < 0) {
                                    return this.symbolTable.getName(-length9);
                                }
                                String latin1String = getLatin1String(this.offset, length9);
                                this.offset += this.strlen;
                                if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                                    latin1String = latin1String.trim();
                                }
                                if (this.strlen != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                                    return latin1String;
                                }
                                return null;
                        }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x014c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONReaderJSONB] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Integer] */
    @Override // com.alibaba.fastjson2.JSONReader
    public List readArray() {
        ?? any;
        ?? num;
        int iStartArray = startArray();
        JSONArray jSONArray = new JSONArray(iStartArray);
        for (int i9 = 0; i9 < iStartArray; i9++) {
            byte[] bArr = this.bytes;
            int i10 = this.offset;
            byte b10 = bArr[i10];
            if (b10 >= 73 && b10 <= 126) {
                any = readString();
            } else if (b10 >= -16 && b10 <= 47) {
                this.offset = i10 + 1;
                any = Integer.valueOf(b10);
            } else if (b10 == -79) {
                this.offset = i10 + 1;
                any = Boolean.TRUE;
            } else if (b10 == -80) {
                this.offset = i10 + 1;
                any = Boolean.FALSE;
            } else if (b10 == -90) {
                any = readObject();
            } else if (b10 == -66) {
                int i11 = i10 + 1;
                this.offset = i11;
                long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11));
                this.offset += 8;
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                }
                any = Long.valueOf(jReverseBytes);
            } else {
                if (b10 >= -108 && b10 <= -92) {
                    this.offset = i10 + 1;
                    int length = b10 == -92 ? readLength() : b10 + 108;
                    JSONReader.Context context = this.context;
                    if (length != 0) {
                        num = (context.features & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList(length) : new JSONArray(length);
                        for (int i12 = 0; i12 < length; i12++) {
                            if (isReference()) {
                                String reference = readReference();
                                if ("..".equals(reference)) {
                                    num.add(num);
                                } else {
                                    num.add(null);
                                    addResolveTask(num, i12, JSONPath.m1657of(reference));
                                }
                            } else {
                                byte b11 = this.bytes[this.offset];
                                num.add((b11 < 73 || b11 > 126) ? b11 == -90 ? readObject() : readAny() : readString());
                            }
                        }
                        any = num;
                    } else if ((context.features & JSONReader.Feature.UseNativeObject.mask) != 0) {
                        any = new ArrayList();
                    } else {
                        Supplier<List> supplier = context.arraySupplier;
                        any = supplier != null ? supplier.get() : new JSONArray();
                    }
                } else if (b10 < 48 || b10 > 63) {
                    if (b10 >= 64 && b10 <= 71) {
                        int int3 = getInt3(bArr, i10 + 1, b10);
                        this.offset += 3;
                        num = new Integer(int3);
                    } else if (b10 == 72) {
                        int i13 = getInt(bArr, i10 + 1);
                        this.offset += 5;
                        num = new Integer(i13);
                    } else if (b10 == -109) {
                        String reference2 = readReference();
                        if ("..".equals(reference2)) {
                            any = jSONArray;
                        } else {
                            addResolveTask(jSONArray, i9, JSONPath.m1657of(reference2));
                        }
                    } else {
                        any = readAny();
                    }
                    any = num;
                } else {
                    Integer numValueOf = Integer.valueOf(((b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8) + (bArr[i10 + 1] & 255));
                    this.offset += 2;
                    any = numValueOf;
                }
            }
            jSONArray.add(any);
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public BigDecimal readBigDecimal() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 != -71) {
            return b10 == -72 ? BigDecimal.valueOf(readInt64Value()) : readDecimal0(b10);
        }
        int int32Value = readInt32Value();
        int i10 = this.offset;
        byte b11 = bArr[i10];
        if (b11 == -70) {
            this.offset = i10 + 1;
            return BigDecimal.valueOf(readInt64Value(), int32Value);
        }
        if (b11 == 72) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(getInt(bArr, i10 + 1), int32Value);
            this.offset += 5;
            return bigDecimalValueOf;
        }
        if (b11 != -66) {
            BigInteger bigInteger = readBigInteger();
            return int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value);
        }
        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10) + 1);
        if (!JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(jReverseBytes, int32Value);
        this.offset += 9;
        return bigDecimalValueOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public BigInteger readBigInteger() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 == -70) {
            return BigInteger.valueOf(readInt64Value());
        }
        if (b10 != -69) {
            return readBigInteger0(b10);
        }
        int int32Value = readInt32Value();
        byte[] bArr2 = new byte[int32Value];
        System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value);
        this.offset += int32Value;
        return new BigInteger(bArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readBinary() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 != -111) {
            throw notSupportType(b10);
        }
        int length = readLength();
        byte[] bArr2 = new byte[length];
        System.arraycopy(this.bytes, this.offset, bArr2, 0, length);
        this.offset += length;
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Boolean readBool() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 == -81) {
            return null;
        }
        return b10 == -79 ? Boolean.TRUE : b10 == -80 ? Boolean.FALSE : Boolean.valueOf(readBoolValue0(b10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readBoolValue() {
        this.wasNull = false;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 == -79) {
            return true;
        }
        if (b10 == -80) {
            return false;
        }
        return readBoolValue0(b10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public char readCharValue() {
        int int32Value;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 == -112) {
            this.offset = i9 + 1;
            int32Value = readInt32Value();
        } else {
            if (b10 == 73) {
                this.offset = i9 + 1;
                return (char) 0;
            }
            if (b10 <= 73 || b10 >= 120) {
                String string = readString();
                if (string == null || string.isEmpty()) {
                    return (char) 0;
                }
                return string.charAt(0);
            }
            this.offset = i9 + 2;
            int32Value = bArr[i9 + 1] & 255;
        }
        return (char) int32Value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Date readDate() {
        long j3;
        int i9;
        int i10 = this.offset;
        byte[] bArr = this.bytes;
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (bArr[i10]) {
            case -89:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(LocalDate.of(1970, 1, 1), readLocalTime()), this.context.getZoneId(), null);
                break;
            case -88:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(readLocalDateTime(), this.context.getZoneId(), null);
                break;
            case -87:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(readLocalDate(), LocalTime.MIN), this.context.getZoneId(), null);
                break;
            case -86:
                this.offset = i10 + 1;
                zonedDateTimeOfLocal = readTimestampWithTimeZone();
                break;
            case -85:
                long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10) + 1);
                this.offset += 9;
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                }
                return new Date(jReverseBytes);
            case -84:
                long j4 = getInt(bArr, i10 + 1);
                this.offset += 5;
                return new Date(j4 * 1000);
            case -83:
                long j5 = getInt(bArr, i10 + 1);
                this.offset += 5;
                return new Date(j5 * 60000);
            case -82:
                this.offset = i10 + 1;
                return Date.from(Instant.ofEpochSecond(readInt64Value(), readInt32Value()));
        }
        if (zonedDateTimeOfLocal == null) {
            return super.readDate();
        }
        long epochSecond = zonedDateTimeOfLocal.toEpochSecond();
        int nano = zonedDateTimeOfLocal.toLocalTime().getNano();
        if (epochSecond >= 0 || nano <= 0) {
            j3 = epochSecond * 1000;
            i9 = nano / 1000000;
        } else {
            j3 = (epochSecond + 1) * 1000;
            i9 = (nano / 1000000) - 1000;
        }
        return new Date(j3 + ((long) i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public double readDoubleValue() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -75) {
            return readDoubleValue0();
        }
        long j3 = (((long) bArr[i9 + 8]) & 255) + ((((long) bArr[i9 + 7]) & 255) << 8) + ((((long) bArr[i9 + 6]) & 255) << 16) + ((((long) bArr[i9 + 5]) & 255) << 24) + ((((long) bArr[i9 + 4]) & 255) << 32) + ((((long) bArr[i9 + 3]) & 255) << 40) + ((255 & ((long) bArr[i9 + 2])) << 48) + (((long) bArr[i9 + 1]) << 56);
        this.offset = i9 + 9;
        return Double.longBitsToDouble(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:98:0x07dc  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String readFieldName() {
        char c10;
        Charset charset;
        String str;
        long j3;
        long j4;
        byte b10;
        long j5;
        long j10;
        byte b11;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        int i9;
        long j17;
        long j18;
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        byte b12 = bArr[i12];
        this.strtype = b12;
        if (b12 == -81) {
            this.offset = i12 + 1;
            return null;
        }
        int i13 = i12 + 1;
        this.offset = i13;
        boolean z9 = b12 == 127;
        if (z9) {
            byte b13 = bArr[i13];
            this.strtype = b13;
            if (b13 >= -16 && b13 <= 72) {
                int int32Value = readInt32Value();
                if (int32Value < 0) {
                    return this.symbolTable.getName(-int32Value);
                }
                if (int32Value == 0) {
                    this.strtype = this.symbol0StrType;
                    this.strlen = this.symbol0Length;
                    this.strBegin = this.symbol0Begin;
                    return getString();
                }
                long j19 = this.symbols[(int32Value * 2) + 1];
                int i14 = (int) j19;
                this.strtype = (byte) i14;
                this.strlen = i14 >> 8;
                this.strBegin = (int) (j19 >> 32);
                return getString();
            }
            this.offset = i12 + 2;
        }
        int i15 = this.offset;
        this.strBegin = i15;
        byte b14 = this.strtype;
        if (b14 < 73 || b14 > 121) {
            c10 = '\b';
            if (b14 == 122) {
                byte b15 = bArr[i15];
                if (b15 >= -16 && b15 <= 47) {
                    this.strlen = b15;
                    this.offset = i15 + 1;
                } else if (b15 >= 48 && b15 <= 63) {
                    this.strlen = ((b15 - JSONB.Constants.BC_INT32_BYTE_ZERO) << 8) + (bArr[i15 + 1] & 255);
                    this.offset = i15 + 2;
                } else if (b15 < 64 || b15 > 71) {
                    this.strlen = readLength();
                } else {
                    this.strlen = getInt3(bArr, i15 + 1, b15);
                    this.offset += 3;
                }
                this.strBegin = this.offset;
                charset = StandardCharsets.UTF_8;
            } else if (b14 == 123) {
                this.strlen = readLength();
                this.strBegin = this.offset;
                charset = StandardCharsets.UTF_16;
            } else if (b14 == 124) {
                this.strlen = readLength();
                this.strBegin = this.offset;
                charset = StandardCharsets.UTF_16LE;
            } else if (b14 == 125) {
                this.strlen = readLength();
                this.strBegin = this.offset;
                charset = StandardCharsets.UTF_16BE;
            } else if (b14 == 126) {
                this.strlen = readLength();
                if (GB18030 == null) {
                    GB18030 = Charset.forName("GB18030");
                }
                charset = GB18030;
            } else {
                charset = StandardCharsets.UTF_8;
            }
            str = null;
        } else {
            if (b14 == 121) {
                this.strlen = readLength();
                this.strBegin = this.offset;
            } else {
                int i16 = b14 + JSONB.Constants.BC_FLOAT;
                this.strlen = i16;
                if (JDKUtils.BIG_ENDIAN) {
                    switch (i16) {
                        case 1:
                            c10 = '\b';
                            j3 = -1;
                            j13 = ((long) bArr[i15]) & 255;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 2:
                            c10 = '\b';
                            j3 = -1;
                            j4 = (((long) bArr[i15 + 1]) & 255) << 8;
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 3:
                            c10 = '\b';
                            j3 = -1;
                            j4 = ((long) (bArr[i15 + 2] << JSONB.Constants.BC_INT32_NUM_16)) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 4:
                            c10 = '\b';
                            j3 = -1;
                            j13 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i15));
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 5:
                            c10 = '\b';
                            j16 = 4294967295L;
                            j3 = -1;
                            j4 = ((long) bArr[i15 + 4]) << 32;
                            i9 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i15));
                            j12 = ((long) i9) & j16;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 6:
                            c10 = '\b';
                            j16 = 4294967295L;
                            j3 = -1;
                            j4 = (((long) bArr[i15 + 5]) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32);
                            i9 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i15));
                            j12 = ((long) i9) & j16;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 7:
                            c10 = '\b';
                            j16 = 4294967295L;
                            j3 = -1;
                            j4 = (((long) bArr[i15 + 6]) << 48) + ((((long) bArr[i15 + 5]) & 255) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32);
                            i9 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i15));
                            j12 = ((long) i9) & j16;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 8:
                            c10 = '\b';
                            j3 = -1;
                            j13 = JDKUtils.UNSAFE.getLong(bArr, BASE + ((long) i15));
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 9:
                            c10 = '\b';
                            j3 = -1;
                            j5 = bArr[i15];
                            j11 = JDKUtils.UNSAFE.getLong(bArr, BASE + ((long) i15) + 1);
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 10:
                            c10 = '\b';
                            j3 = -1;
                            Unsafe unsafe = JDKUtils.UNSAFE;
                            long j20 = BASE;
                            j17 = unsafe.getShort(bArr, ((long) i15) + j20);
                            j18 = unsafe.getLong(bArr, j20 + ((long) this.offset) + 2);
                            j15 = j18;
                            j14 = j17;
                            break;
                        case 11:
                            c10 = '\b';
                            j3 = -1;
                            j5 = ((long) (bArr[i15] << JSONB.Constants.BC_INT32_NUM_16)) + ((((long) bArr[i15 + 1]) & 255) << 8) + (((long) bArr[i15 + 2]) & 255);
                            j11 = JDKUtils.UNSAFE.getLong(bArr, BASE + ((long) i15) + 3);
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 12:
                            c10 = '\b';
                            j3 = -1;
                            Unsafe unsafe2 = JDKUtils.UNSAFE;
                            long j21 = BASE;
                            j17 = unsafe2.getInt(bArr, ((long) i15) + j21);
                            j18 = unsafe2.getLong(bArr, j21 + ((long) this.offset) + 4);
                            j15 = j18;
                            j14 = j17;
                            break;
                        case 13:
                            c10 = '\b';
                            j3 = -1;
                            long j22 = ((long) bArr[i15 + 4]) << 32;
                            Unsafe unsafe3 = JDKUtils.UNSAFE;
                            long j23 = BASE;
                            j5 = j22 + (((long) unsafe3.getInt(bArr, ((long) i15) + j23)) & 4294967295L);
                            j11 = unsafe3.getLong(bArr, j23 + ((long) this.offset) + 5);
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 14:
                            c10 = '\b';
                            j3 = -1;
                            long j24 = (((long) bArr[i15 + 5]) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32);
                            Unsafe unsafe4 = JDKUtils.UNSAFE;
                            long j25 = BASE;
                            j5 = j24 + (((long) unsafe4.getInt(bArr, ((long) i15) + j25)) & 4294967295L);
                            j11 = unsafe4.getLong(bArr, j25 + ((long) this.offset) + 6);
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 15:
                            c10 = '\b';
                            long j26 = (((long) bArr[i15 + 6]) << 48) + ((((long) bArr[i15 + 5]) & 255) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32);
                            Unsafe unsafe5 = JDKUtils.UNSAFE;
                            long j27 = BASE;
                            j3 = -1;
                            j5 = j26 + (((long) unsafe5.getInt(bArr, ((long) i15) + j27)) & 4294967295L);
                            j11 = unsafe5.getLong(bArr, j27 + ((long) this.offset) + 7);
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 16:
                            Unsafe unsafe6 = JDKUtils.UNSAFE;
                            long j28 = BASE;
                            c10 = '\b';
                            j14 = unsafe6.getLong(bArr, j28 + ((long) i15));
                            j15 = unsafe6.getLong(bArr, ((long) this.offset) + j28 + 8);
                            j3 = -1;
                            break;
                    }
                } else {
                    c10 = '\b';
                    j3 = -1;
                    switch (i16) {
                        case 3:
                            j4 = ((long) (bArr[i15 + 2] << JSONB.Constants.BC_INT32_NUM_16)) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 4:
                            j4 = ((long) (bArr[i15 + 3] << 24)) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 5:
                            j4 = (((long) bArr[i15 + 4]) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 6:
                            j4 = (((long) bArr[i15 + 5]) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 7:
                            j4 = (((long) bArr[i15 + 6]) << 48) + ((((long) bArr[i15 + 5]) & 255) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32) + ((((long) bArr[i15 + 4]) & 255) << 24) + ((((long) bArr[i15 + 3]) & 255) << 16) + ((((long) bArr[i15 + 2]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 8:
                            j4 = (((long) bArr[i15 + 7]) << 56) + ((((long) bArr[i15 + 6]) & 255) << 48) + ((((long) bArr[i15 + 5]) & 255) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            b10 = bArr[i15];
                            j12 = ((long) b10) & 255;
                            j13 = j4 + j12;
                            j14 = j13;
                            j15 = j3;
                            break;
                        case 9:
                            j5 = bArr[i15];
                            j10 = (((long) bArr[i15 + 8]) << 56) + ((long) (bArr[i15 + 7] << JSONB.Constants.BC_INT32_BYTE_MIN)) + ((((long) bArr[i15 + 6]) & 255) << 40) + ((((long) bArr[i15 + 5]) & 255) << 32) + ((((long) bArr[i15 + 4]) & 255) << 24) + ((((long) bArr[i15 + 3]) & 255) << 16) + ((((long) bArr[i15 + 2]) & 255) << 8);
                            b11 = bArr[i15 + 1];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 10:
                            j5 = ((long) (bArr[i15 + 1] << 8)) + (((long) bArr[i15]) & 255);
                            j10 = (((long) bArr[i15 + 9]) << 56) + ((((long) bArr[i15 + 8]) & 255) << 48) + ((((long) bArr[i15 + 7]) & 255) << 40) + ((((long) bArr[i15 + 6]) & 255) << 32) + ((((long) bArr[i15 + 5]) & 255) << 24) + ((((long) bArr[i15 + 4]) & 255) << 16) + ((((long) bArr[i15 + 3]) & 255) << 8);
                            b11 = bArr[i15 + 2];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 11:
                            j5 = ((long) (bArr[i15 + 2] << JSONB.Constants.BC_INT32_NUM_16)) + ((((long) bArr[i15 + 1]) & 255) << 8) + (((long) bArr[i15]) & 255);
                            j10 = (((long) bArr[i15 + 10]) << 56) + ((((long) bArr[i15 + 9]) & 255) << 48) + ((((long) bArr[i15 + 8]) & 255) << 40) + ((((long) bArr[i15 + 7]) & 255) << 32) + ((((long) bArr[i15 + 6]) & 255) << 24) + ((((long) bArr[i15 + 5]) & 255) << 16) + ((((long) bArr[i15 + 4]) & 255) << 8);
                            b11 = bArr[i15 + 3];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 12:
                            j5 = ((long) (bArr[i15 + 3] << 24)) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8) + (((long) bArr[i15]) & 255);
                            j10 = (((long) bArr[i15 + 11]) << 56) + ((((long) bArr[i15 + 10]) & 255) << 48) + ((((long) bArr[i15 + 9]) & 255) << 40) + ((((long) bArr[i15 + 8]) & 255) << 32) + ((((long) bArr[i15 + 7]) & 255) << 24) + ((((long) bArr[i15 + 6]) & 255) << 16) + ((((long) bArr[i15 + 5]) & 255) << 8);
                            b11 = bArr[i15 + 4];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 13:
                            j5 = (((long) bArr[i15 + 4]) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8) + (((long) bArr[i15]) & 255);
                            j10 = (((long) bArr[i15 + 12]) << 56) + ((((long) bArr[i15 + 11]) & 255) << 48) + ((((long) bArr[i15 + 10]) & 255) << 40) + ((((long) bArr[i15 + 9]) & 255) << 32) + ((((long) bArr[i15 + 8]) & 255) << 24) + ((((long) bArr[i15 + 7]) & 255) << 16) + ((((long) bArr[i15 + 6]) & 255) << 8);
                            b11 = bArr[i15 + 5];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 14:
                            j5 = (((long) bArr[i15 + 5]) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8) + (((long) bArr[i15]) & 255);
                            j10 = (((long) bArr[i15 + 13]) << 56) + ((((long) bArr[i15 + 12]) & 255) << 48) + ((((long) bArr[i15 + 11]) & 255) << 40) + ((((long) bArr[i15 + 10]) & 255) << 32) + ((((long) bArr[i15 + 9]) & 255) << 24) + ((((long) bArr[i15 + 8]) & 255) << 16) + ((((long) bArr[i15 + 7]) & 255) << 8);
                            b11 = bArr[i15 + 6];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 15:
                            j5 = (((long) bArr[i15 + 6]) << 48) + ((((long) bArr[i15 + 5]) & 255) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8) + (((long) bArr[i15]) & 255);
                            j10 = (((long) bArr[i15 + 14]) << 56) + ((((long) bArr[i15 + 13]) & 255) << 48) + ((((long) bArr[i15 + 12]) & 255) << 40) + ((((long) bArr[i15 + 11]) & 255) << 32) + ((((long) bArr[i15 + 10]) & 255) << 24) + ((((long) bArr[i15 + 9]) & 255) << 16) + ((((long) bArr[i15 + 8]) & 255) << 8);
                            b11 = bArr[i15 + 7];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        case 16:
                            j5 = (((long) bArr[i15]) & 255) + (((long) bArr[i15 + 7]) << 56) + ((long) (bArr[i15 + 6] << JSONB.Constants.BC_INT32_BYTE_MIN)) + ((((long) bArr[i15 + 5]) & 255) << 40) + ((((long) bArr[i15 + 4]) & 255) << 32) + ((((long) bArr[i15 + 3]) & 255) << 24) + ((((long) bArr[i15 + 2]) & 255) << 16) + ((((long) bArr[i15 + 1]) & 255) << 8);
                            j10 = (((long) bArr[i15 + 15]) << 56) + ((((long) bArr[i15 + 14]) & 255) << 48) + ((((long) bArr[i15 + 13]) & 255) << 40) + ((((long) bArr[i15 + 12]) & 255) << 32) + ((((long) bArr[i15 + 11]) & 255) << 24) + ((((long) bArr[i15 + 10]) & 255) << 16) + ((((long) bArr[i15 + 9]) & 255) << 8);
                            b11 = bArr[i15 + 8];
                            j11 = (((long) b11) & 255) + j10;
                            j14 = j5;
                            j15 = j11;
                            break;
                        default:
                            j14 = j3;
                            j15 = j14;
                            break;
                    }
                }
                i10 = this.offset;
                i11 = this.strlen;
                if (bArr[(i10 + i11) - 1] > 0 || j14 == j3) {
                    str = null;
                    charset = StandardCharsets.ISO_8859_1;
                } else if (j15 != j3) {
                    long j29 = j14 ^ j15;
                    JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr = JSONFactory.NAME_CACHE2;
                    int length = ((int) (j29 ^ (j29 >>> 32))) & (nameCacheEntry2Arr.length - 1);
                    JSONFactory.NameCacheEntry2 nameCacheEntry2 = nameCacheEntry2Arr[length];
                    if (nameCacheEntry2 == null) {
                        str = getLatin1String(i10, i11);
                        nameCacheEntry2Arr[length] = new JSONFactory.NameCacheEntry2(str, j14, j15);
                        this.offset += this.strlen;
                    } else if (nameCacheEntry2.value0 == j14 && nameCacheEntry2.value1 == j15) {
                        this.offset = i10 + i11;
                        str = nameCacheEntry2.name;
                    }
                    charset = StandardCharsets.ISO_8859_1;
                } else {
                    NameCacheEntry[] nameCacheEntryArr = JSONFactory.NAME_CACHE;
                    int length2 = ((int) ((j14 >>> 32) ^ j14)) & (nameCacheEntryArr.length - 1);
                    NameCacheEntry nameCacheEntry = nameCacheEntryArr[length2];
                    if (nameCacheEntry == null) {
                        str = getLatin1String(i10, i11);
                        nameCacheEntryArr[length2] = new NameCacheEntry(str, j14);
                        this.offset += this.strlen;
                    } else if (nameCacheEntry.value == j14) {
                        this.offset = i10 + i11;
                        str = nameCacheEntry.name;
                    }
                    charset = StandardCharsets.ISO_8859_1;
                }
            }
            c10 = '\b';
            j3 = -1;
            j14 = j3;
            j15 = j14;
            i10 = this.offset;
            i11 = this.strlen;
            if (bArr[(i10 + i11) - 1] > 0) {
                str = null;
                charset = StandardCharsets.ISO_8859_1;
            }
        }
        int i17 = this.strlen;
        if (i17 < 0) {
            str = this.symbolTable.getName(-i17);
        }
        if (str == null) {
            if (charset == StandardCharsets.ISO_8859_1 && JDKUtils.ANDROID_SDK_INT < 34) {
                char[] andSet = this.charBuf;
                int i18 = this.strlen;
                if (andSet == null) {
                    andSet = JSONFactory.CHARS_UPDATER.getAndSet(this.cacheItem, null);
                    this.charBuf = andSet;
                }
                if (andSet == null || andSet.length < i18) {
                    andSet = new char[i18];
                    this.charBuf = andSet;
                }
                for (int i19 = 0; i19 < i18; i19++) {
                    andSet[i19] = (char) (bArr[this.offset + i19] & 255);
                }
                str = new String(andSet, 0, i18);
            }
            if (str == null) {
                str = new String(bArr, this.offset, this.strlen, charset);
            }
            this.offset += this.strlen;
        }
        if (z9) {
            int int32Value2 = readInt32Value();
            if (int32Value2 == 0) {
                this.symbol0Begin = this.strBegin;
                this.symbol0Length = this.strlen;
                this.symbol0StrType = this.strtype;
                return str;
            }
            long[] jArr = this.symbols;
            if (jArr == null) {
                int i20 = (int32Value2 * 2) + 2;
                if (i20 < 32) {
                    i20 = 32;
                }
                this.symbols = new long[i20];
            } else if (jArr.length < (int32Value2 * 2) + 2) {
                this.symbols = Arrays.copyOf(jArr, jArr.length + 16);
            }
            this.symbols[(int32Value2 * 2) + 1] = (((long) this.strBegin) << 32) + (((long) this.strlen) << c10) + ((long) this.strtype);
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
        int length;
        char c10;
        long j3;
        int i9;
        long hashCode;
        int i10;
        long j4;
        long j5;
        int i11;
        long j10;
        int int32Value;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 1;
        this.offset = i13;
        byte b10 = bArr[i12];
        this.strtype = b10;
        boolean z9 = b10 == 127;
        byte b11 = b10;
        if (z9) {
            byte b12 = bArr[i13];
            this.strtype = b12;
            if (b12 >= -16 && b12 <= 72) {
                if (b12 <= 47) {
                    this.offset = i12 + 2;
                    int32Value = b12;
                } else {
                    int32Value = readInt32Value();
                }
                if (int32Value < 0) {
                    return this.symbolTable.getHashCode(-int32Value);
                }
                if (int32Value == 0) {
                    this.strtype = this.symbol0StrType;
                    this.strlen = this.symbol0Length;
                    this.strBegin = this.symbol0Begin;
                    if (this.symbol0Hash == 0) {
                        this.symbol0Hash = getNameHashCode();
                    }
                    return this.symbol0Hash;
                }
                int i14 = int32Value * 2;
                long[] jArr = this.symbols;
                long j11 = jArr[i14 + 1];
                int i15 = (int) j11;
                this.strtype = (byte) i15;
                this.strlen = i15 >> 8;
                this.strBegin = (int) (j11 >> 32);
                long j12 = jArr[i14];
                if (j12 != 0) {
                    return j12;
                }
                long nameHashCode = getNameHashCode();
                this.symbols[i14] = nameHashCode;
                return nameHashCode;
            }
            this.offset = i12 + 2;
            b11 = b12;
        }
        if (b11 >= 73 && b11 <= 120) {
            length = b11 + JSONB.Constants.BC_FLOAT;
        } else {
            if (b11 != 121 && b11 != 122) {
                throw readFieldNameHashCodeError();
            }
            length = readLength();
        }
        this.strlen = length;
        int i16 = this.offset;
        this.strBegin = i16;
        if (length < 0) {
            hashCode = this.symbolTable.getHashCode(-length);
            c10 = '\b';
            i9 = 32;
        } else {
            if (length <= 8 && i16 + length <= bArr.length) {
                long j13 = 4294967295L;
                switch (length) {
                    case 1:
                        c10 = '\b';
                        j3 = 0;
                        i9 = 32;
                        i10 = bArr[i16];
                        j4 = i10;
                        hashCode = j4;
                        break;
                    case 2:
                        c10 = '\b';
                        j3 = 0;
                        i9 = 32;
                        j4 = ((long) JDKUtils.UNSAFE.getShort(bArr, BASE + ((long) i16))) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        hashCode = j4;
                        break;
                    case 3:
                        c10 = '\b';
                        j3 = 0;
                        i9 = 32;
                        j5 = bArr[i16 + 2] << 16;
                        Unsafe unsafe = JDKUtils.UNSAFE;
                        long j14 = BASE;
                        j13 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        i11 = unsafe.getShort(bArr, j14 + ((long) i16));
                        j4 = j5 + (((long) i11) & j13);
                        hashCode = j4;
                        break;
                    case 4:
                        c10 = '\b';
                        j3 = 0;
                        i9 = 32;
                        i10 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i16));
                        j4 = i10;
                        hashCode = j4;
                        break;
                    case 5:
                        c10 = '\b';
                        j3 = 0;
                        i9 = 32;
                        j5 = ((long) bArr[i16 + 4]) << 32;
                        i11 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i16));
                        j4 = j5 + (((long) i11) & j13);
                        hashCode = j4;
                        break;
                    case 6:
                        c10 = '\b';
                        j3 = 0;
                        Unsafe unsafe2 = JDKUtils.UNSAFE;
                        long j15 = BASE;
                        long j16 = i16;
                        i9 = 32;
                        hashCode = (((long) unsafe2.getShort(bArr, (j15 + j16) + 4)) << 32) + (((long) unsafe2.getInt(bArr, j15 + j16)) & 4294967295L);
                        break;
                    case 7:
                        c10 = '\b';
                        j3 = 0;
                        j10 = (((long) bArr[i16 + 6]) << 48) + ((((long) bArr[i16 + 5]) & 255) << 40) + ((((long) bArr[i16 + 4]) & 255) << 32) + (((long) JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i16))) & 4294967295L);
                        hashCode = j10;
                        i9 = 32;
                        break;
                    default:
                        j10 = JDKUtils.UNSAFE.getLong(bArr, ((long) i16) + BASE);
                        c10 = '\b';
                        j3 = 0;
                        hashCode = j10;
                        i9 = 32;
                        break;
                }
            } else {
                c10 = '\b';
                j3 = 0;
                i9 = 32;
                hashCode = 0;
            }
            if (hashCode != j3) {
                this.offset += length;
            } else {
                hashCode = -3750763034362895579L;
                for (int i17 = 0; i17 < length; i17++) {
                    int i18 = this.offset;
                    this.offset = i18 + 1;
                    hashCode = (hashCode ^ ((long) bArr[i18])) * Fnv.MAGIC_PRIME;
                }
            }
        }
        if (z9) {
            int i19 = this.offset;
            int int32Value2 = bArr[i19];
            if (int32Value2 < -16 || int32Value2 > 47) {
                int32Value2 = readInt32Value();
            } else {
                this.offset = i19 + 1;
            }
            if (int32Value2 == 0) {
                this.symbol0Begin = this.strBegin;
                this.symbol0Length = length;
                this.symbol0StrType = b11;
                this.symbol0Hash = hashCode;
                return hashCode;
            }
            int i20 = int32Value2 << 1;
            int i21 = i20 + 2;
            long[] jArr2 = this.symbols;
            if (jArr2 == null) {
                this.symbols = new long[Math.max(i21, i9)];
            } else if (jArr2.length < i21) {
                this.symbols = Arrays.copyOf(jArr2, i20 + 18);
            }
            long[] jArr3 = this.symbols;
            jArr3[i20] = hashCode;
            jArr3[i20 + 1] = (((long) this.strBegin) << 32) + (((long) length) << c10) + ((long) b11);
        }
        return hashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONException readFieldNameHashCodeError() {
        StringBuilder sb2 = new StringBuilder("fieldName not support input type ");
        sb2.append(JSONB.typeName(this.strtype));
        if (this.strtype == -109) {
            sb2.append(" ");
            sb2.append(readString());
        }
        sb2.append(", offset ");
        sb2.append(this.offset);
        return new JSONException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeUnquote() {
        return readFieldNameHashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public float readFloatValue() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -73) {
            return readFloat0();
        }
        int iReverseBytes = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9) + 1);
        this.offset = i9 + 5;
        if (!JDKUtils.BIG_ENDIAN) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        return Float.intBitsToFloat(iReverseBytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readHex() {
        String string = readString();
        int length = string.length() / 2;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            char cCharAt = string.charAt(i10);
            char cCharAt2 = string.charAt(i10 + 1);
            char c10 = '7';
            int i11 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c10 = '0';
            }
            bArr[i9] = (byte) ((cCharAt2 - c10) | (i11 << 4));
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readIfNull() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -81) {
            return false;
        }
        this.offset = i9 + 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Instant readInstant() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 != -66) {
            switch (b10) {
                case -85:
                    break;
                case -84:
                    long j3 = getInt(bArr, i10);
                    this.offset += 4;
                    return Instant.ofEpochSecond(j3, 0L);
                case -83:
                    long j4 = getInt(bArr, i10);
                    this.offset += 4;
                    return Instant.ofEpochSecond(j4 * 60, 0L);
                case -82:
                    return Instant.ofEpochSecond(readInt64Value(), readInt32Value());
                default:
                    throw new UnsupportedOperationException();
            }
        }
        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        this.offset += 8;
        if (!JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        return Instant.ofEpochMilli(jReverseBytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer readInt32() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == -81) {
            this.offset = i11;
            return null;
        }
        if (b10 >= -16) {
            i9 = b10;
            if (b10 > 47) {
                if (b10 >= 48 && b10 <= 63) {
                    int i12 = ((b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8) + (bArr[i11] & 255);
                    i11 = i10 + 2;
                    i9 = i12;
                } else if (b10 >= 64 && b10 <= 71) {
                    int i13 = ((b10 + JSONB.Constants.BC_INT16) << 16) + ((bArr[i11] & 255) << 8) + (bArr[i10 + 2] & 255);
                    i11 = i10 + 3;
                    i9 = i13;
                } else {
                    if (b10 != 72) {
                        this.offset = i11;
                        return Integer.valueOf(readInt32Value0(bArr, b10));
                    }
                    int iReverseBytes = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11));
                    if (!JDKUtils.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    i9 = iReverseBytes;
                    i11 = i10 + 5;
                }
            }
        }
        this.offset = i11;
        return Integer.valueOf(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int readInt32Value() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= -16) {
            i9 = b10;
            if (b10 > 47) {
                if (b10 >= 48 && b10 <= 63) {
                    int i12 = ((b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8) + (bArr[i11] & 255);
                    i11 = i10 + 2;
                    i9 = i12;
                } else if (b10 >= 64 && b10 <= 71) {
                    int int3 = getInt3(bArr, i11, b10);
                    i11 = i10 + 3;
                    i9 = int3;
                } else {
                    if (b10 != 72) {
                        this.offset = i11;
                        return readInt32Value0(bArr, b10);
                    }
                    int i13 = getInt(bArr, i11);
                    i11 = i10 + 5;
                    i9 = i13;
                }
            }
        }
        this.offset = i11;
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Long readInt64() {
        long jReverseBytes;
        int i9;
        long j3;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == -81) {
            this.offset = i11;
            return null;
        }
        if (b10 < -40 || b10 > -17) {
            if (b10 >= -56 && b10 <= -41) {
                jReverseBytes = ((b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8) + (bArr[i11] & 255);
                i9 = i10 + 2;
            } else if (b10 >= -64 && b10 <= -57) {
                jReverseBytes = ((b10 + 60) << 16) + ((bArr[i11] & 255) << 8) + (bArr[i10 + 2] & 255);
                i9 = i10 + 3;
            } else if (b10 == -65) {
                int iReverseBytes = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11));
                if (!JDKUtils.BIG_ENDIAN) {
                    iReverseBytes = Integer.reverseBytes(iReverseBytes);
                }
                jReverseBytes = iReverseBytes;
                i9 = i10 + 5;
            } else {
                if (b10 != -66) {
                    this.offset = i11;
                    return Long.valueOf(readInt64Value0(bArr, b10));
                }
                jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11));
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                }
                i9 = i10 + 9;
            }
            long j4 = jReverseBytes;
            i11 = i9;
            j3 = j4;
        } else {
            j3 = b10 + 32;
        }
        this.offset = i11;
        return Long.valueOf(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readInt64Value() {
        long jReverseBytes;
        int i9;
        long j3;
        this.wasNull = false;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < -40 || b10 > -17) {
            if (b10 >= -56 && b10 <= -41) {
                jReverseBytes = ((b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8) + (bArr[i11] & 255);
                i9 = i10 + 2;
            } else if (b10 >= -64 && b10 <= -57) {
                jReverseBytes = ((b10 + 60) << 16) + ((bArr[i11] & 255) << 8) + (bArr[i10 + 2] & 255);
                i9 = i10 + 3;
            } else if (b10 == -65) {
                jReverseBytes = getInt(bArr, i11);
                i9 = i10 + 5;
            } else {
                if (b10 != -66) {
                    this.offset = i11;
                    return readInt64Value0(bArr, b10);
                }
                jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11));
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                }
                i9 = i10 + 9;
            }
            long j4 = jReverseBytes;
            i11 = i9;
            j3 = j4;
        } else {
            j3 = b10 + 32;
        }
        this.offset = i11;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long[] readInt64ValueArray() {
        if (nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = readTypeHashCode();
            if (typeHashCode != ObjectReaderImplInt64ValueArray.HASH_TYPE && typeHashCode != ObjectReaderImplInt64Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32ValueArray.HASH_TYPE) {
                C0086a.m464w(info("not support " + getString()));
                return null;
            }
        }
        int iStartArray = startArray();
        if (iStartArray == -1) {
            return null;
        }
        long[] jArr = new long[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            jArr[i9] = readInt64Value();
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int readLength() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 >= -16 && b10 <= 47) {
            return b10;
        }
        if (b10 >= 48 && b10 <= 63) {
            int i11 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            return i11 + (bArr[i10] & 255);
        }
        if (b10 >= 64 && b10 <= 71) {
            int int3 = getInt3(bArr, i10, b10);
            this.offset += 2;
            return int3;
        }
        if (b10 != 72) {
            throw notSupportType(b10);
        }
        int i12 = getInt(bArr, i10);
        this.offset += 4;
        if (i12 <= 268435456) {
            return i12;
        }
        C0086a.m464w("input length overflow");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public List readList(Type[] typeArr) {
        if (nextIfNull()) {
            return null;
        }
        int iStartArray = startArray();
        JSONArray jSONArray = new JSONArray(iStartArray);
        for (int i9 = 0; i9 < iStartArray; i9++) {
            jSONArray.add(read(typeArr[i9]));
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 != -87) {
            if (b10 != -81) {
                return readLocalDate0(b10);
            }
            this.offset = i9 + 1;
            return null;
        }
        int i10 = i9 + 2;
        this.offset = i10;
        int i11 = bArr[i9 + 1] << 8;
        int i12 = i9 + 3;
        this.offset = i12;
        int i13 = i11 + (bArr[i10] & 255);
        int i14 = i9 + 4;
        this.offset = i14;
        byte b11 = bArr[i12];
        this.offset = i9 + 5;
        return LocalDate.of(i13, b11, bArr[i14]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate10() {
        LocalDate localDate10;
        byte b10 = this.strtype;
        if ((b10 == 121 || b10 == 122) && this.strlen == 10) {
            localDate10 = DateUtils.parseLocalDate10(this.bytes, this.offset);
        } else {
            byte[] bArr = this.bytes;
            int i9 = this.offset;
            if (bArr[i9] != 83 || (localDate10 = DateUtils.parseLocalDate10(bArr, i9 + 1)) == null) {
                C0086a.m464w("date only support string input");
                return null;
            }
        }
        this.offset += 11;
        return localDate10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate11() {
        LocalDate localDate11;
        byte b10 = this.strtype;
        if ((b10 == 121 || b10 == 122) && this.strlen == 11) {
            localDate11 = DateUtils.parseLocalDate11(this.bytes, this.offset);
        } else {
            byte[] bArr = this.bytes;
            int i9 = this.offset;
            if (bArr[i9] != 84 || (localDate11 = DateUtils.parseLocalDate11(bArr, i9 + 1)) == null) {
                C0086a.m464w("date only support string input");
                return null;
            }
        }
        this.offset += 12;
        return localDate11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate8() {
        LocalDate localDate8;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 81 || (localDate8 = DateUtils.parseLocalDate8(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 9;
        return localDate8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate9() {
        LocalDate localDate9;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 82 || (localDate9 = DateUtils.parseLocalDate9(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 10;
        return localDate9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 != -88) {
            if (b10 != -81) {
                return readLocalDateTime0(b10);
            }
            this.offset = i9 + 1;
            return null;
        }
        int i10 = i9 + 2;
        this.offset = i10;
        int i11 = bArr[i9 + 1] << 8;
        int i12 = i9 + 3;
        this.offset = i12;
        int i13 = i11 + (bArr[i10] & 255);
        int i14 = i9 + 4;
        this.offset = i14;
        byte b11 = bArr[i12];
        int i15 = i9 + 5;
        this.offset = i15;
        byte b12 = bArr[i14];
        int i16 = i9 + 6;
        this.offset = i16;
        byte b13 = bArr[i15];
        int i17 = i9 + 7;
        this.offset = i17;
        byte b14 = bArr[i16];
        this.offset = i9 + 8;
        return LocalDateTime.of(i13, b11, b12, b13, b14, bArr[i17], readInt32Value());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime12() {
        LocalDateTime localDateTime12;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 85 || (localDateTime12 = DateUtils.parseLocalDateTime12(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 13;
        return localDateTime12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime14() {
        LocalDateTime localDateTime14;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 87 || (localDateTime14 = DateUtils.parseLocalDateTime14(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 15;
        return localDateTime14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime16() {
        LocalDateTime localDateTime16;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 89 || (localDateTime16 = DateUtils.parseLocalDateTime16(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 17;
        return localDateTime16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime17() {
        LocalDateTime localDateTime17;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 90 || (localDateTime17 = DateUtils.parseLocalDateTime17(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 18;
        return localDateTime17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime18() {
        LocalDateTime localDateTime18;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 91 || (localDateTime18 = DateUtils.parseLocalDateTime18(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 19;
        return localDateTime18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime19() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        this.type = b10;
        if (b10 != 92) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime19 = DateUtils.parseLocalDateTime19(bArr, i9 + 1);
        if (localDateTime19 != null) {
            this.offset += 20;
            return localDateTime19;
        }
        C0086a.m464w("date only support string input");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime20() {
        LocalDateTime localDateTime20;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 93 || (localDateTime20 = DateUtils.parseLocalDateTime20(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 21;
        return localDateTime20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTimeX(int i9) {
        LocalDateTime localDateTimeX;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        byte b10 = bArr[i10];
        this.type = b10;
        if (b10 < 73 || b10 > 120) {
            C0086a.m464w("date only support string input");
            return null;
        }
        if (i9 < 21 || i9 > 29 || (localDateTimeX = DateUtils.parseLocalDateTimeX(bArr, i10 + 1, i9)) == null) {
            C0086a.m450i(readString(), "illegal LocalDateTime string : ");
            return null;
        }
        this.offset = i9 + 1 + this.offset;
        return localDateTimeX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        if (b10 == -89) {
            int i10 = i9 + 2;
            this.offset = i10;
            byte b11 = bArr[i9 + 1];
            int i11 = i9 + 3;
            this.offset = i11;
            byte b12 = bArr[i10];
            this.offset = i9 + 4;
            return LocalTime.of(b11, b12, bArr[i11], readInt32Value());
        }
        if (b10 < 73 || b10 > 120) {
            throw new UnsupportedOperationException();
        }
        int stringLength = getStringLength();
        if (stringLength == 5) {
            return readLocalTime5();
        }
        if (stringLength == 8) {
            return readLocalTime8();
        }
        if (stringLength == 18) {
            return readLocalTime18();
        }
        switch (stringLength) {
            case 10:
                return readLocalTime10();
            case 11:
                return readLocalTime11();
            case 12:
                return readLocalTime12();
            default:
                C0086a.m464w(AbstractC0921a.m2249l(stringLength, "not support len : "));
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime10() {
        LocalTime localTime10;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 83 || (localTime10 = DateUtils.parseLocalTime10(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 11;
        return localTime10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime11() {
        LocalTime localTime11;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 84 || (localTime11 = DateUtils.parseLocalTime11(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 12;
        return localTime11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime12() {
        LocalTime localTime12;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 85 || (localTime12 = DateUtils.parseLocalTime12(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 13;
        return localTime12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime15() {
        LocalTime localTime15;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 88 || (localTime15 = DateUtils.parseLocalTime15(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 16;
        return localTime15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime18() {
        LocalTime localTime18;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 91 || (localTime18 = DateUtils.parseLocalTime18(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 19;
        return localTime18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime5() {
        LocalTime localTime5;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 78 || (localTime5 = DateUtils.parseLocalTime5(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 6;
        return localTime5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime8() {
        LocalTime localTime8;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 81 || (localTime8 = DateUtils.parseLocalTime8(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 9;
        return localTime8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime9() {
        LocalTime localTime8;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 81 || (localTime8 = DateUtils.parseLocalTime8(bArr, i9 + 1)) == null) {
            C0086a.m464w("date only support string input");
            return null;
        }
        this.offset += 10;
        return localTime8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readMillis19() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != 92) {
            C0086a.m464w("date only support string input");
            return 0L;
        }
        long millis19 = DateUtils.parseMillis19(bArr, i9 + 1, this.context.zoneId);
        this.offset += 20;
        return millis19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void readNull() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        this.type = b10;
        if (b10 == -81) {
            return;
        }
        C0086a.m466y(this.type, "null not match, ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Date readNullOrNewDate() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public Number readNumber() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 >= -16 && b10 <= 47) {
            return Integer.valueOf(b10);
        }
        if (b10 >= 48 && b10 <= 63) {
            int i11 = (b10 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            return Integer.valueOf(i11 + (bArr[i10] & 255));
        }
        if (b10 >= 64 && b10 <= 71) {
            int int3 = getInt3(bArr, i10, b10);
            this.offset += 2;
            return Integer.valueOf(int3);
        }
        if (b10 >= -40 && b10 <= -17) {
            return Long.valueOf(((long) (b10 - JSONB.Constants.BC_INT64_NUM_MIN)) - 8);
        }
        if (b10 >= -56 && b10 <= -41) {
            int i12 = (b10 + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
            this.offset = i9 + 2;
            return Integer.valueOf(i12 + (bArr[i10] & 255));
        }
        if (b10 >= -64 && b10 <= -57) {
            int i13 = i9 + 2;
            this.offset = i13;
            int i14 = ((b10 + 60) << 16) + ((bArr[i10] & 255) << 8);
            this.offset = i9 + 3;
            return Integer.valueOf(i14 + (bArr[i13] & 255));
        }
        if (b10 == -110) {
            C0086a.m464w("not support input type : ".concat(readString()));
            return null;
        }
        if (b10 == 72) {
            int i15 = getInt(bArr, i10);
            this.offset += 4;
            return Integer.valueOf(i15);
        }
        if (b10 == 121) {
            int int32Value = readInt32Value();
            String latin1String = getLatin1String(this.offset, int32Value);
            this.offset += int32Value;
            return TypeUtils.toBigDecimal(latin1String);
        }
        if (b10 == 122) {
            int int32Value2 = readInt32Value();
            String str = new String(this.bytes, this.offset, int32Value2, StandardCharsets.UTF_8);
            this.offset += int32Value2;
            return TypeUtils.toBigDecimal(str);
        }
        switch (b10) {
            case -81:
                return null;
            case -80:
            case -78:
                return Double.valueOf(0.0d);
            case -79:
            case -77:
                return Double.valueOf(1.0d);
            case -76:
                return Double.valueOf(readInt64Value());
            case -75:
                long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                this.offset += 8;
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                }
                return Double.valueOf(Double.longBitsToDouble(jReverseBytes));
            case -74:
                return Float.valueOf(readInt32Value());
            case -73:
                int i16 = getInt(bArr, i10);
                this.offset += 4;
                return Float.valueOf(Float.intBitsToFloat(i16));
            case -72:
                return BigDecimal.valueOf(readInt64Value());
            case -71:
                int int32Value3 = readInt32Value();
                BigInteger bigInteger = readBigInteger();
                return int32Value3 == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value3);
            case -70:
                return BigInteger.valueOf(readInt64Value());
            case -69:
                int int32Value4 = readInt32Value();
                byte[] bArr2 = new byte[int32Value4];
                System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value4);
                this.offset += int32Value4;
                return new BigInteger(bArr2);
            case -68:
                int i17 = (bArr[i9 + 2] & 255) + (bArr[i10] << 8);
                this.offset = i9 + 3;
                return Short.valueOf((short) i17);
            case -67:
                this.offset = i9 + 2;
                return Byte.valueOf(bArr[i10]);
            case -66:
                long jReverseBytes2 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
                this.offset += 8;
                if (!JDKUtils.BIG_ENDIAN) {
                    jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                }
                return Long.valueOf(jReverseBytes2);
            case -65:
                int i18 = getInt(bArr, i10);
                this.offset += 4;
                return Long.valueOf(i18);
            default:
                if (b10 < 73 || b10 > 120) {
                    throw notSupportType(b10);
                }
                int i19 = b10 - 73;
                String latin1String2 = getLatin1String(i10, i19);
                this.offset += i19;
                return TypeUtils.toBigDecimal(latin1String2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void readNumber0() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> readObject() {
        Map jSONObject;
        long j3;
        Object obj;
        byte b10;
        Object any;
        Integer num;
        int length;
        List jSONArray;
        byte b11;
        byte[] bArr = this.bytes;
        JSONReader.Context context = this.context;
        long j4 = context.features;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b12 = bArr[i9];
        this.type = b12;
        Object obj2 = null;
        if (b12 == -81) {
            return null;
        }
        byte b13 = JSONB.Constants.BC_OBJECT;
        if (b12 < -90) {
            if (b12 == -110) {
                return (Map) checkAutoType(Map.class, 0L, 0L).readObject(this, null, null, 0L);
            }
            throw notSupportType(b12);
        }
        long j5 = 0;
        if ((JSONReader.Feature.UseNativeObject.mask & j4) != 0) {
            jSONObject = new HashMap();
        } else {
            Supplier<Map> supplier = context.objectSupplier;
            jSONObject = supplier != null ? supplier.get() : new JSONObject();
        }
        while (true) {
            int i10 = this.offset;
            byte b14 = bArr[i10];
            if (b14 == -91) {
                this.offset = i10 + 1;
                return jSONObject;
            }
            Object fieldName = b14 >= 73 ? readFieldName() : readAny();
            int i11 = this.offset;
            byte b15 = bArr[i11];
            if (b15 == -109) {
                String reference = readReference();
                if ("..".equals(reference)) {
                    jSONObject.put(fieldName, jSONObject);
                } else {
                    addResolveTask(jSONObject, fieldName, JSONPath.m1657of(reference));
                }
                b10 = b13;
                j3 = j5;
                obj = obj2;
            } else {
                if (b15 < 73 || b15 > 126) {
                    j3 = j5;
                    if (b15 >= -16 && b15 <= 47) {
                        this.offset = i11 + 1;
                        any = Integer.valueOf(b15);
                    } else if (b15 == -79) {
                        this.offset = i11 + 1;
                        any = Boolean.TRUE;
                    } else if (b15 == -80) {
                        this.offset = i11 + 1;
                        any = Boolean.FALSE;
                    } else if (b15 == b13) {
                        any = readObject();
                    } else if (b15 == -66) {
                        int i12 = i11 + 1;
                        this.offset = i12;
                        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i12));
                        this.offset += 8;
                        if (!JDKUtils.BIG_ENDIAN) {
                            jReverseBytes = Long.reverseBytes(jReverseBytes);
                        }
                        any = Long.valueOf(jReverseBytes);
                    } else {
                        if (b15 < -108 || b15 > -92) {
                            obj = obj2;
                            b10 = JSONB.Constants.BC_OBJECT;
                            if (b15 < 48 || b15 > 63) {
                                if (b15 >= 64 && b15 <= 71) {
                                    int int3 = getInt3(bArr, i11 + 1, b15);
                                    this.offset += 3;
                                    num = new Integer(int3);
                                } else if (b15 == 72) {
                                    int i13 = getInt(bArr, i11 + 1);
                                    this.offset += 5;
                                    num = new Integer(i13);
                                } else {
                                    any = readAny();
                                }
                                any = num;
                            } else {
                                any = Integer.valueOf(((b15 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8) + (bArr[i11 + 1] & 255));
                                this.offset += 2;
                            }
                        } else {
                            int i14 = i11 + 1;
                            this.offset = i14;
                            if (b15 == -92) {
                                length = bArr[i14];
                                if (length >= -16 && length <= 47) {
                                    this.offset = i11 + 2;
                                } else if (length < 48 || length > 63) {
                                    length = readLength();
                                } else {
                                    length = ((length - 56) << 8) + (bArr[i11 + 2] & 255);
                                    this.offset = i11 + 3;
                                }
                            } else {
                                length = b15 + 108;
                            }
                            if (length == 0) {
                                if ((JSONReader.Feature.UseNativeObject.mask & j4) != j3) {
                                    any = new ArrayList();
                                } else {
                                    Supplier<List> supplier2 = this.context.arraySupplier;
                                    any = supplier2 != null ? supplier2.get() : new JSONArray();
                                }
                                obj = null;
                                b11 = JSONB.Constants.BC_OBJECT;
                            } else {
                                if ((JSONReader.Feature.UseNativeObject.mask & j4) != j3) {
                                    jSONArray = new ArrayList(length);
                                } else {
                                    Supplier<List> supplier3 = this.context.arraySupplier;
                                    jSONArray = supplier3 != null ? supplier3.get() : new JSONArray(length);
                                }
                                for (int i15 = 0; i15 < length; i15++) {
                                    byte b16 = bArr[this.offset];
                                    if (b16 == -109) {
                                        String reference2 = readReference();
                                        if ("..".equals(reference2)) {
                                            jSONArray.add(jSONArray);
                                        } else {
                                            jSONArray.add(null);
                                            addResolveTask(jSONArray, i15, JSONPath.m1657of(reference2));
                                        }
                                    } else {
                                        jSONArray.add((b16 < 73 || b16 > 126) ? b16 == -90 ? readObject() : readAny() : readString());
                                    }
                                }
                                obj = null;
                                b11 = JSONB.Constants.BC_OBJECT;
                                any = jSONArray;
                            }
                            b10 = b11;
                        }
                        if (any == null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j4) == j3) {
                            jSONObject.put(fieldName, any);
                        }
                    }
                    b10 = b13;
                } else {
                    any = readString();
                    b10 = b13;
                    j3 = j5;
                }
                obj = obj2;
                if (any == null) {
                    jSONObject.put(fieldName, any);
                }
            }
            obj2 = obj;
            j5 = j3;
            b13 = b10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public OffsetDateTime readOffsetDateTime() {
        ZonedDateTime zonedDateTime = readZonedDateTime();
        if (zonedDateTime == null) {
            return null;
        }
        return zonedDateTime.toOffsetDateTime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public OffsetTime readOffsetTime() {
        ZonedDateTime zonedDateTime = readZonedDateTime();
        if (zonedDateTime == null) {
            return null;
        }
        return zonedDateTime.toOffsetDateTime().toOffsetTime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String readPattern() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String readReference() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        if (bArr[i9] != -109) {
            return null;
        }
        this.offset = i9 + 1;
        if (isString()) {
            return readString();
        }
        C0086a.m450i(error(this.type), "reference not support input ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String readString() {
        int length;
        String str;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        this.strtype = b10;
        if (b10 == -81) {
            return null;
        }
        this.strBegin = i10;
        if (b10 < 73 || b10 > 121) {
            return readStringNonAscii();
        }
        if (b10 == 121) {
            length = bArr[i10];
            if (length >= -16 && length <= 47) {
                this.offset = i9 + 2;
            } else if (length >= 48 && length <= 63) {
                length = ((length - 56) << 8) + (bArr[i9 + 2] & 255);
                this.offset = i9 + 3;
            } else if (length < 64 || length > 71) {
                length = readLength();
            } else {
                length = getInt3(bArr, i9 + 2, length);
                this.offset += 3;
            }
            this.strBegin = this.offset;
        } else {
            length = b10 - 73;
        }
        if (length < 0) {
            return this.symbolTable.getName(-length);
        }
        this.strlen = length;
        if (JDKUtils.ANDROID_SDK_INT < 34) {
            char[] andSet = this.charBuf;
            if (andSet == null) {
                andSet = JSONFactory.CHARS_UPDATER.getAndSet(this.cacheItem, null);
                this.charBuf = andSet;
            }
            if (andSet == null || andSet.length < length) {
                andSet = new char[length];
                this.charBuf = andSet;
            }
            for (int i11 = 0; i11 < length; i11++) {
                andSet[i11] = (char) (this.bytes[this.offset + i11] & 255);
            }
            str = new String(andSet, 0, length);
        } else {
            str = new String(this.bytes, this.offset, length, StandardCharsets.ISO_8859_1);
        }
        this.offset += length;
        if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
            str = str.trim();
        }
        if (length != 0 || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
            return str;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String[] readStringArray() {
        if (nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && readTypeHashCode() != ObjectReaderImplStringArray.HASH_TYPE) {
            C0086a.m464w(info("not support type " + getString()));
            return null;
        }
        int iStartArray = startArray();
        if (iStartArray == -1) {
            return null;
        }
        String[] strArr = new String[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            strArr[i9] = readString();
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readTypeHashCode() {
        int i9;
        int i10;
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        byte b10 = bArr[i11];
        this.strtype = b10;
        if (b10 == 121 && (i9 = bArr[i11 + 1]) > 8 && i9 <= 63) {
            if (i9 <= 47) {
                i10 = i11 + 2;
            } else {
                i9 = ((i9 - 56) << 8) + (bArr[i11 + 2] & 255);
                i10 = i11 + 3;
            }
            long j3 = Fnv.MAGIC_HASH_CODE;
            int i12 = 0;
            int i13 = i10;
            while (i12 < i9) {
                j3 = (j3 ^ ((long) bArr[i13])) * Fnv.MAGIC_PRIME;
                i12++;
                i13++;
            }
            int i14 = bArr[i13];
            if (i14 >= 0 && i14 <= 47) {
                int i15 = i13 + 1;
                if (i14 == 0) {
                    this.symbol0Begin = i10;
                    this.symbol0Length = i9;
                    this.symbol0StrType = b10;
                    this.symbol0Hash = j3;
                } else {
                    int i16 = i14 * 2;
                    int i17 = i16 + 2;
                    long[] jArr = this.symbols;
                    if (jArr == null) {
                        this.symbols = new long[Math.max(i17, 32)];
                    } else if (jArr.length < i17) {
                        this.symbols = Arrays.copyOf(jArr, i16 + 18);
                    }
                    this.symbols[i16 + 1] = (((long) i10) << 32) + (((long) i9) << 8) + ((long) b10);
                }
                this.strBegin = i10;
                this.strlen = i9;
                this.offset = i15;
                return j3;
            }
        }
        return readTypeHashCode0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readTypeHashCode0() {
        long hashCode;
        long j3;
        long j4;
        long j5;
        int int32Value;
        int int32Value2;
        long jHashCode64;
        int int32Value3;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        byte b10 = bArr[i9];
        this.strtype = b10;
        byte b11 = b10;
        if (b10 == 127) {
            int i10 = i9 + 1;
            this.offset = i10;
            byte b12 = bArr[i10];
            this.strtype = b12;
            b11 = b12;
            b11 = b12;
            if (b12 >= -16 && b12 <= 72) {
                if (b12 <= 47) {
                    this.offset = i9 + 2;
                    int32Value3 = b12;
                } else {
                    int32Value3 = readInt32Value();
                }
                if (int32Value3 < 0) {
                    return this.symbolTable.getHashCode(-int32Value3);
                }
                if (int32Value3 == 0) {
                    this.strtype = this.symbol0StrType;
                    this.strlen = this.symbol0Length;
                    this.strBegin = this.symbol0Begin;
                    if (this.symbol0Hash == 0) {
                        this.symbol0Hash = getNameHashCode();
                    }
                    return this.symbol0Hash;
                }
                int i11 = int32Value3 * 2;
                long[] jArr = this.symbols;
                long j10 = jArr[i11 + 1];
                int i12 = (int) j10;
                this.strtype = (byte) i12;
                this.strlen = i12 >> 8;
                this.strBegin = (int) (j10 >> 32);
                long j11 = jArr[i11];
                if (j11 != 0) {
                    return j11;
                }
                long nameHashCode = getNameHashCode();
                this.symbols[i11] = nameHashCode;
                return nameHashCode;
            }
        }
        if (b11 >= -16 && b11 <= 72) {
            if (b11 <= 47) {
                this.offset++;
                int32Value2 = b11;
            } else if (b11 <= 63) {
                int i13 = this.offset;
                int i14 = (b11 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                this.offset = i13 + 2;
                int32Value2 = i14 + (bArr[i13 + 1] & 255);
            } else {
                int32Value2 = readInt32Value();
            }
            if (int32Value2 == 0) {
                this.strtype = this.symbol0StrType;
                this.strlen = this.symbol0Length;
                this.strBegin = this.symbol0Begin;
                if (this.symbol0Hash == 0) {
                    this.symbol0Hash = Fnv.hashCode64(getString());
                }
                jHashCode64 = this.symbol0Hash;
            } else if (int32Value2 < 0) {
                this.strlen = b11;
                jHashCode64 = this.symbolTable.getHashCode(-int32Value2);
            } else {
                long[] jArr2 = this.symbols;
                int i15 = int32Value2 * 2;
                long j12 = jArr2[i15];
                if (j12 == 0) {
                    long j13 = jArr2[i15 + 1];
                    int i16 = (int) j13;
                    this.strtype = (byte) i16;
                    this.strlen = i16 >> 8;
                    this.strBegin = (int) (j13 >> 32);
                    jHashCode64 = Fnv.hashCode64(getString());
                } else {
                    jHashCode64 = j12;
                }
            }
            if (jHashCode64 != -1) {
                return jHashCode64;
            }
            throw typeRefNotFound(int32Value2);
        }
        int i17 = this.offset;
        int i18 = i17 + 1;
        this.offset = i18;
        this.strBegin = i18;
        if (b11 >= 73 && b11 <= 120) {
            this.strlen = b11 + JSONB.Constants.BC_FLOAT;
        } else {
            if (b11 != 121 && b11 != 122 && b11 != 123 && b11 != 124 && b11 != 125) {
                throw readStringError();
            }
            int i19 = bArr[i18];
            if (i19 >= -16 && i19 <= 47) {
                this.offset = i17 + 2;
                this.strlen = i19;
            } else if (i19 < 48 || i19 > 63) {
                this.strlen = readLength();
            } else {
                this.offset = i17 + 3;
                this.strlen = ((i19 - 56) << 8) + (bArr[i17 + 2] & 255);
            }
            this.strBegin = this.offset;
        }
        int i20 = this.strlen;
        if (i20 < 0) {
            hashCode = this.symbolTable.getHashCode(-i20);
        } else {
            long j14 = Fnv.MAGIC_PRIME;
            long j15 = Fnv.MAGIC_HASH_CODE;
            if (b11 == 122) {
                int i21 = this.offset + i20;
                while (true) {
                    int i22 = this.offset;
                    if (i22 < i21) {
                        int iChar2_utf8 = bArr[i22];
                        if (iChar2_utf8 >= 0) {
                            this.offset = i22 + 1;
                        } else {
                            int i23 = iChar2_utf8 & 255;
                            switch (i23 >> 4) {
                                case 12:
                                case 13:
                                    iChar2_utf8 = JSONReaderUTF8.char2_utf8(i23, bArr[i22 + 1], i22);
                                    this.offset += 2;
                                    break;
                                case 14:
                                    iChar2_utf8 = JSONReaderUTF8.char2_utf8(i23, bArr[i22 + 1], bArr[i22 + 2], i22);
                                    this.offset += 3;
                                    break;
                                default:
                                    C0086a.m466y(this.offset, "malformed input around byte ");
                                    return 0L;
                            }
                        }
                        j15 = (j15 ^ ((long) iChar2_utf8)) * Fnv.MAGIC_PRIME;
                    }
                }
            } else {
                int i24 = 0;
                if (b11 == 123 || b11 == 125) {
                    hashCode = -3750763034362895579L;
                    while (i24 < this.strlen) {
                        int i25 = this.offset;
                        hashCode = (hashCode ^ ((long) ((char) ((bArr[(i25 + i24) + 1] & 255) | ((bArr[i25 + i24] & 255) << 8))))) * Fnv.MAGIC_PRIME;
                        i24 += 2;
                    }
                } else if (b11 == 124) {
                    while (i24 < this.strlen) {
                        int i26 = this.offset;
                        j15 = (j15 ^ ((long) ((char) (((bArr[(i26 + i24) + 1] & 255) << 8) | (bArr[i26 + i24] & 255))))) * Fnv.MAGIC_PRIME;
                        i24 += 2;
                    }
                } else {
                    if (i20 <= 8) {
                        int i27 = this.offset;
                        int i28 = 0;
                        long j16 = 0;
                        while (i28 < this.strlen) {
                            int i29 = this.offset;
                            j3 = j14;
                            int i30 = bArr[i29];
                            if (i30 < 0 || (i30 == 0 && bArr[i27] == 0)) {
                                this.offset = i27;
                            } else {
                                switch (i28) {
                                    case 0:
                                        j16 = i30;
                                        continue;
                                        this.offset = i29 + 1;
                                        i28++;
                                        j14 = j3;
                                        break;
                                    case 1:
                                        j4 = i30 << 8;
                                        j5 = 255;
                                        break;
                                    case 2:
                                        j4 = i30 << 16;
                                        j5 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                        break;
                                    case 3:
                                        j4 = i30 << 24;
                                        j5 = 16777215;
                                        break;
                                    case 4:
                                        j4 = ((long) i30) << 32;
                                        j5 = 4294967295L;
                                        break;
                                    case 5:
                                        j4 = ((long) i30) << 40;
                                        j5 = 1099511627775L;
                                        break;
                                    case 6:
                                        j4 = ((long) i30) << 48;
                                        j5 = 281474976710655L;
                                        break;
                                    case 7:
                                        j4 = ((long) i30) << 56;
                                        j5 = 72057594037927935L;
                                        break;
                                    default:
                                        this.offset = i29 + 1;
                                        i28++;
                                        j14 = j3;
                                        break;
                                }
                                j16 = (j16 & j5) + j4;
                                this.offset = i29 + 1;
                                i28++;
                                j14 = j3;
                            }
                        }
                        j3 = j14;
                        hashCode = j16;
                        if (hashCode == 0) {
                            hashCode = -3750763034362895579L;
                            while (i24 < this.strlen) {
                                int i31 = this.offset;
                                this.offset = i31 + 1;
                                hashCode = (hashCode ^ ((long) bArr[i31])) * j3;
                                i24++;
                            }
                        }
                    } else {
                        j3 = 1099511628211L;
                    }
                    hashCode = 0;
                    if (hashCode == 0) {
                    }
                }
            }
            hashCode = j15;
        }
        int i32 = this.offset;
        byte b13 = bArr[i32];
        this.type = b13;
        if (b13 < -16 || b13 > 47) {
            int32Value = readInt32Value();
        } else {
            this.offset = i32 + 1;
            int32Value = b13;
        }
        if (int32Value == 0) {
            this.symbol0Begin = this.strBegin;
            this.symbol0Length = this.strlen;
            this.symbol0StrType = b11;
            this.symbol0Hash = hashCode;
            return hashCode;
        }
        int i33 = int32Value * 2;
        int i34 = i33 + 2;
        long[] jArr3 = this.symbols;
        if (jArr3 == null) {
            this.symbols = new long[Math.max(i34, 32)];
        } else if (jArr3.length < i34) {
            this.symbols = Arrays.copyOf(jArr3, i33 + 18);
        }
        this.symbols[i33 + 1] = (((long) this.strBegin) << 32) + (((long) this.strlen) << 8) + ((long) b11);
        return hashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public UUID readUUID() {
        long j3;
        long j4;
        long j5;
        long j10;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        int i11 = 16;
        if (b10 == -111) {
            int length = readLength();
            if (length != 16) {
                C0086a.m464w(AbstractC0921a.m2249l(length, "uuid not support "));
                return null;
            }
            Unsafe unsafe = JDKUtils.UNSAFE;
            long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
            long j12 = unsafe.getLong(bArr, ((long) this.offset) + j11);
            long jReverseBytes = unsafe.getLong(bArr, j11 + ((long) this.offset) + 8);
            this.offset += 16;
            boolean z9 = JDKUtils.BIG_ENDIAN;
            long jReverseBytes2 = z9 ? j12 : Long.reverseBytes(j12);
            if (!z9) {
                jReverseBytes = Long.reverseBytes(jReverseBytes);
            }
            j3 = jReverseBytes;
            j4 = jReverseBytes2;
        } else {
            if (b10 == -81) {
                return null;
            }
            if (b10 != 105) {
                int i12 = 14;
                if (b10 == 109) {
                    byte b11 = bArr[i9 + 9];
                    byte b12 = bArr[i9 + 14];
                    byte b13 = bArr[i9 + 19];
                    byte b14 = bArr[i9 + 24];
                    if (b11 != 45 || b12 != 45 || b13 != 45 || b14 != 45) {
                        C0086a.m464w("Invalid UUID string:  ".concat(new String(bArr, i10, 36, StandardCharsets.ISO_8859_1)));
                        return null;
                    }
                    long j13 = 0;
                    for (int i13 = 0; i13 < 8; i13++) {
                        j13 = (j13 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i13] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                    }
                    for (int i14 = 9; i14 < 13; i14++) {
                        j13 = (j13 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i14] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                    }
                    j4 = j13;
                    while (i12 < 18) {
                        j4 = (j4 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i12] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                        i12++;
                    }
                    j3 = 0;
                    for (int i15 = 19; i15 < 23; i15++) {
                        j3 = (j3 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i15] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                    }
                    for (int i16 = 24; i16 < 36; i16++) {
                        j3 = (j3 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i16] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                    }
                    this.offset += 36;
                } else {
                    if (b10 != 121 && b10 != 122) {
                        throw notSupportType(b10);
                    }
                    int length2 = readLength();
                    if (length2 == 32) {
                        j4 = 0;
                        for (int i17 = 0; i17 < 16; i17++) {
                            j4 = (j4 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i17] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                        }
                        j3 = 0;
                        while (i11 < 32) {
                            j3 = (j3 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i11] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                            i11++;
                        }
                        this.offset += 32;
                    } else {
                        int i18 = this.offset;
                        if (length2 != 36) {
                            String str = new String(bArr, i18, length2, StandardCharsets.UTF_8);
                            this.offset += length2;
                            C0086a.m464w("Invalid UUID string:  ".concat(str));
                            return null;
                        }
                        byte b15 = bArr[i18 + 8];
                        byte b16 = bArr[i18 + 13];
                        byte b17 = bArr[i18 + 18];
                        byte b18 = bArr[i18 + 23];
                        if (b15 == 45 && b16 == 45 && b17 == 45 && b18 == 45) {
                            long j14 = 0;
                            for (int i19 = 0; i19 < 8; i19++) {
                                j14 = (j14 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i19] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                            }
                            for (int i20 = 9; i20 < 13; i20++) {
                                j14 = (j14 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i20] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                            }
                            while (i12 < 18) {
                                j14 = (j14 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i12] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                                i12++;
                            }
                            long j15 = 0;
                            for (int i21 = 19; i21 < 23; i21++) {
                                j15 = (j15 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i21] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                            }
                            for (int i22 = 24; i22 < 36; i22++) {
                                j15 = (j15 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i22] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                            }
                            this.offset += 36;
                            j10 = j15;
                            j5 = j14;
                        } else {
                            j5 = 0;
                            j10 = 0;
                        }
                        j4 = j5;
                        j3 = j10;
                    }
                }
            } else {
                j4 = 0;
                for (int i23 = 0; i23 < 16; i23++) {
                    j4 = (j4 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i23] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                }
                j3 = 0;
                while (i11 < 32) {
                    j3 = (j3 << 4) + ((long) JSONFactory.UUID_VALUES[bArr[this.offset + i11] + JSONB.Constants.BC_INT64_BYTE_ZERO]);
                    i11++;
                }
                this.offset += 32;
            }
        }
        return new UUID(j4, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v39, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r5v39, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r8v51, resolved type: char */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0319 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c A[RETURN] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readValueHashCode() {
        long j3;
        long j4;
        long j5;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        this.strtype = b10;
        this.strBegin = i10;
        if (b10 >= 73 && b10 <= 120) {
            this.strlen = b10 + JSONB.Constants.BC_FLOAT;
        } else {
            if (b10 != 121 && b10 != 122 && b10 != 123 && b10 != 124 && b10 != 125 && b10 != 127) {
                throw readStringError();
            }
            this.strlen = readLength();
            this.strBegin = this.offset;
        }
        int i11 = this.strlen;
        if (i11 < 0) {
            return this.symbolTable.getHashCode(-i11);
        }
        int i12 = 2;
        if (b10 != 122) {
            if (b10 == 123) {
                int i13 = this.offset;
                char c10 = bArr[i13];
                if (c10 != -2 || bArr[i13 + 1] != -1) {
                    if (c10 == -1 && bArr[i13 + 1] == -2) {
                        long j15 = Fnv.MAGIC_HASH_CODE;
                        while (i12 < this.strlen) {
                            int i14 = i13 + i12;
                            j15 = (j15 ^ ((long) ((char) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255))))) * Fnv.MAGIC_PRIME;
                            i12 += 2;
                        }
                        return j15;
                    }
                    long j16 = Fnv.MAGIC_HASH_CODE;
                    for (int i15 = 0; i15 < this.strlen; i15 += 2) {
                        int i16 = i13 + i15;
                        j16 = (j16 ^ ((long) ((char) (((bArr[i16 + 1] & 255) << 8) | (bArr[i16] & 255))))) * Fnv.MAGIC_PRIME;
                    }
                    return j16;
                }
                if (i11 <= 16) {
                    long j17 = 0;
                    for (int i17 = 2; i17 < this.strlen; i17 += 2) {
                        int i18 = i13 + i17;
                        char c11 = (char) ((bArr[i18 + 1] & 255) | ((bArr[i18] & 255) << 8));
                        if (c11 > 127 || (i17 == 0 && c11 == 0)) {
                            j17 = 0;
                            if (j17 != 0) {
                                return j17;
                            }
                        } else {
                            byte b11 = (byte) c11;
                            switch ((i17 - 2) >> 1) {
                                case 0:
                                    j17 = b11;
                                    continue;
                                    break;
                                case 1:
                                    j13 = b11 << 8;
                                    j14 = j17 & 255;
                                    break;
                                case 2:
                                    j13 = b11 << JSONB.Constants.BC_INT32_NUM_16;
                                    j14 = j17 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    break;
                                case 3:
                                    j13 = b11 << 24;
                                    j14 = j17 & 16777215;
                                    break;
                                case 4:
                                    j13 = ((long) b11) << 32;
                                    j14 = j17 & 4294967295L;
                                    break;
                                case 5:
                                    j13 = ((long) b11) << 40;
                                    j14 = j17 & 1099511627775L;
                                    break;
                                case 6:
                                    j13 = ((long) b11) << 48;
                                    j14 = j17 & 281474976710655L;
                                    break;
                                case 7:
                                    j13 = ((long) b11) << 56;
                                    j14 = j17 & 72057594037927935L;
                                    break;
                                default:
                                    break;
                            }
                            j17 = j14 + j13;
                        }
                    }
                    if (j17 != 0) {
                    }
                }
                long j18 = Fnv.MAGIC_HASH_CODE;
                while (i12 < this.strlen) {
                    int i19 = i13 + i12;
                    j18 = (j18 ^ ((long) ((char) ((bArr[i19 + 1] & 255) | ((bArr[i19] & 255) << 8))))) * Fnv.MAGIC_PRIME;
                    i12 += 2;
                }
                return j18;
            }
            if (b10 == 125) {
                int i20 = this.offset;
                if (i11 <= 16) {
                    long j19 = 0;
                    for (int i21 = 0; i21 < this.strlen; i21 += 2) {
                        int i22 = i20 + i21;
                        char c12 = (char) ((bArr[i22 + 1] & 255) | ((bArr[i22] & 255) << 8));
                        if (c12 > 127 || (i21 == 0 && c12 == 0)) {
                            j19 = 0;
                            if (j19 != 0) {
                                return j19;
                            }
                        } else {
                            byte b12 = (byte) c12;
                            switch (i21 >> 1) {
                                case 0:
                                    j19 = b12;
                                    continue;
                                    break;
                                case 1:
                                    j11 = b12 << 8;
                                    j12 = j19 & 255;
                                    break;
                                case 2:
                                    j11 = b12 << JSONB.Constants.BC_INT32_NUM_16;
                                    j12 = j19 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    break;
                                case 3:
                                    j11 = b12 << 24;
                                    j12 = j19 & 16777215;
                                    break;
                                case 4:
                                    j11 = ((long) b12) << 32;
                                    j12 = j19 & 4294967295L;
                                    break;
                                case 5:
                                    j11 = ((long) b12) << 40;
                                    j12 = j19 & 1099511627775L;
                                    break;
                                case 6:
                                    j11 = ((long) b12) << 48;
                                    j12 = j19 & 281474976710655L;
                                    break;
                                case 7:
                                    j11 = ((long) b12) << 56;
                                    j12 = j19 & 72057594037927935L;
                                    break;
                                default:
                                    break;
                            }
                            j19 = j12 + j11;
                        }
                    }
                    if (j19 != 0) {
                    }
                }
                long j20 = Fnv.MAGIC_HASH_CODE;
                for (int i23 = 0; i23 < this.strlen; i23 += 2) {
                    int i24 = i20 + i23;
                    j20 = (j20 ^ ((long) ((char) ((bArr[i24 + 1] & 255) | ((bArr[i24] & 255) << 8))))) * Fnv.MAGIC_PRIME;
                }
                return j20;
            }
            if (b10 == 124) {
                int i25 = this.offset;
                if (i11 <= 16) {
                    long j21 = 0;
                    for (int i26 = 0; i26 < this.strlen; i26 += 2) {
                        int i27 = i25 + i26;
                        char c13 = (char) (((bArr[i27 + 1] & 255) << 8) | (bArr[i27] & 255));
                        if (c13 > 127 || (i26 == 0 && c13 == 0)) {
                            j21 = 0;
                            if (j21 != 0) {
                                return j21;
                            }
                        } else {
                            byte b13 = (byte) c13;
                            switch (i26 >> 1) {
                                case 0:
                                    j21 = b13;
                                    continue;
                                    break;
                                case 1:
                                    j5 = b13 << 8;
                                    j10 = j21 & 255;
                                    break;
                                case 2:
                                    j5 = b13 << JSONB.Constants.BC_INT32_NUM_16;
                                    j10 = j21 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    break;
                                case 3:
                                    j5 = b13 << 24;
                                    j10 = j21 & 16777215;
                                    break;
                                case 4:
                                    j5 = ((long) b13) << 32;
                                    j10 = j21 & 4294967295L;
                                    break;
                                case 5:
                                    j5 = ((long) b13) << 40;
                                    j10 = j21 & 1099511627775L;
                                    break;
                                case 6:
                                    j5 = ((long) b13) << 48;
                                    j10 = j21 & 281474976710655L;
                                    break;
                                case 7:
                                    j5 = ((long) b13) << 56;
                                    j10 = j21 & 72057594037927935L;
                                    break;
                                default:
                                    break;
                            }
                            j21 = j10 + j5;
                        }
                    }
                    if (j21 != 0) {
                    }
                }
                long j22 = Fnv.MAGIC_HASH_CODE;
                for (int i28 = 0; i28 < this.strlen; i28 += 2) {
                    int i29 = i25 + i28;
                    j22 = (j22 ^ ((long) ((char) (((bArr[i29 + 1] & 255) << 8) | (bArr[i29] & 255))))) * Fnv.MAGIC_PRIME;
                }
                return j22;
            }
            if (i11 <= 8) {
                int i30 = this.offset;
                long j23 = 0;
                for (int i31 = 0; i31 < this.strlen; i31++) {
                    int i32 = this.offset;
                    int i33 = bArr[i32];
                    if (i33 < 0 || (i33 == 0 && bArr[i30] == 0)) {
                        this.offset = i30;
                        j23 = 0;
                        if (j23 != 0) {
                            return j23;
                        }
                    } else {
                        switch (i31) {
                            case 0:
                                j23 = i33;
                                continue;
                                this.offset = i32 + 1;
                                break;
                            case 1:
                                j3 = i33 << 8;
                                j4 = j23 & 255;
                                break;
                            case 2:
                                j3 = i33 << 16;
                                j4 = j23 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                break;
                            case 3:
                                j3 = i33 << 24;
                                j4 = j23 & 16777215;
                                break;
                            case 4:
                                j3 = ((long) i33) << 32;
                                j4 = j23 & 4294967295L;
                                break;
                            case 5:
                                j3 = ((long) i33) << 40;
                                j4 = j23 & 1099511627775L;
                                break;
                            case 6:
                                j3 = ((long) i33) << 48;
                                j4 = j23 & 281474976710655L;
                                break;
                            case 7:
                                j3 = ((long) i33) << 56;
                                j4 = j23 & 72057594037927935L;
                                break;
                            default:
                                this.offset = i32 + 1;
                                break;
                        }
                        j23 = j4 + j3;
                        this.offset = i32 + 1;
                    }
                }
                if (j23 != 0) {
                }
            }
            long j24 = Fnv.MAGIC_HASH_CODE;
            for (int i34 = 0; i34 < this.strlen; i34++) {
                int i35 = this.offset;
                this.offset = i35 + 1;
                j24 = (((long) bArr[i35]) ^ j24) * Fnv.MAGIC_PRIME;
            }
            return j24;
        }
        int i36 = this.offset + i11;
        long j25 = Fnv.MAGIC_HASH_CODE;
        while (true) {
            int i37 = this.offset;
            if (i37 >= i36) {
                return j25;
            }
            int iChar2_utf8 = bArr[i37];
            if (iChar2_utf8 >= 0) {
                this.offset = i37 + 1;
            } else {
                int i38 = iChar2_utf8 & 255;
                switch (i38 >> 4) {
                    case 12:
                    case 13:
                        iChar2_utf8 = JSONReaderUTF8.char2_utf8(i38, bArr[i37 + 1], i37);
                        this.offset += 2;
                        break;
                    case 14:
                        iChar2_utf8 = JSONReaderUTF8.char2_utf8(i38, bArr[i37 + 1], bArr[i37 + 2], i37);
                        this.offset += 3;
                        break;
                    default:
                        C0086a.m466y(this.offset, "malformed input around byte ");
                        return 0L;
                }
            }
            j25 = (((long) iChar2_utf8) ^ j25) * Fnv.MAGIC_PRIME;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public ZonedDateTime readZonedDateTime() {
        ZoneId zoneId;
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 != -86) {
            return readZonedDateTime0(b10);
        }
        int i11 = i9 + 2;
        this.offset = i11;
        int i12 = bArr[i10] << 8;
        int i13 = i9 + 3;
        this.offset = i13;
        int i14 = i12 + (bArr[i11] & 255);
        int i15 = i9 + 4;
        this.offset = i15;
        byte b11 = bArr[i13];
        int i16 = i9 + 5;
        this.offset = i16;
        byte b12 = bArr[i15];
        int i17 = i9 + 6;
        this.offset = i17;
        byte b13 = bArr[i16];
        int i18 = i9 + 7;
        this.offset = i18;
        byte b14 = bArr[i17];
        this.offset = i9 + 8;
        LocalDateTime localDateTimeOf = LocalDateTime.of(i14, b11, b12, b13, b14, bArr[i18], readInt32Value());
        if (readValueHashCode() == -4800907791268808639L) {
            zoneId = DateUtils.SHANGHAI_ZONE_ID;
        } else {
            String string = getString();
            ZoneId zoneId2 = this.context.getZoneId();
            zoneId = zoneId2.getId().equals(string) ? zoneId2 : DateUtils.getZoneId(string, DateUtils.SHANGHAI_ZONE_ID);
        }
        return ZonedDateTime.ofLocal(localDateTimeOf, zoneId, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final ZonedDateTime readZonedDateTimeX(int i9) {
        ZonedDateTime zonedDateTime;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        byte b10 = bArr[i10];
        this.type = b10;
        if (b10 < 73 || b10 > 120) {
            C0086a.m464w("date only support string input");
            return null;
        }
        if (i9 < 19 || (zonedDateTime = DateUtils.parseZonedDateTime(bArr, i10 + 1, i9, this.context.zoneId)) == null) {
            C0086a.m450i(readString(), "illegal LocalDateTime string : ");
            return null;
        }
        this.offset = i9 + 1 + this.offset;
        return zonedDateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void reset(JSONReader.SavePoint savePoint) {
        this.offset = savePoint.offset;
        this.type = (byte) savePoint.current;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void skipComment() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean skipName() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        this.strtype = b10;
        if (b10 >= 73 && b10 <= 120) {
            this.offset = (b10 - 73) + i10;
            return true;
        }
        if (b10 == 121 || b10 == 122 || b10 == 123 || b10 == 124 || b10 == 125) {
            int length = readLength();
            this.strlen = length;
            this.offset += length;
            return true;
        }
        if (b10 != 127) {
            throw notSupportType(b10);
        }
        byte b11 = bArr[i10];
        if (b11 >= -16 && b11 <= 72) {
            readInt32Value();
            return true;
        }
        readString();
        readInt32Value();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void skipValue() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 1;
        this.offset = i10;
        byte b10 = bArr[i9];
        if (b10 != 72) {
            if (b10 != 73) {
                switch (b10) {
                    case -111:
                        this.offset += readInt32Value();
                        return;
                    case -110:
                        readTypeHashCode();
                        skipValue();
                        return;
                    case -109:
                        if (isString()) {
                            skipName();
                            return;
                        } else {
                            C0086a.m450i(JSONB.typeName(b10), "skip not support type ");
                            return;
                        }
                    case -108:
                        return;
                    default:
                        switch (b10) {
                            case -90:
                                while (true) {
                                    byte[] bArr2 = this.bytes;
                                    int i11 = this.offset;
                                    byte b11 = bArr2[i11];
                                    if (b11 == -91) {
                                        this.offset = i11 + 1;
                                        return;
                                    }
                                    byte[] bArr3 = FIXED_TYPE_SIZE;
                                    byte b12 = bArr3[b11 & 255];
                                    if (b12 > 0) {
                                        this.offset = i11 + b12;
                                    } else if (b12 == -1) {
                                        this.offset = i11 + 1;
                                        this.offset += readInt32Value();
                                    } else {
                                        skipName();
                                    }
                                    byte[] bArr4 = this.bytes;
                                    int i12 = this.offset;
                                    byte b13 = bArr3[bArr4[i12] & 255];
                                    if (b13 > 0) {
                                        this.offset = i12 + b13;
                                    } else if (b13 == -1) {
                                        this.offset = i12 + 1;
                                        this.offset += readInt32Value();
                                    } else {
                                        skipValue();
                                    }
                                }
                                break;
                            case -89:
                                this.offset = i9 + 4;
                                readInt32Value();
                                return;
                            case -88:
                                this.offset = i9 + 8;
                                readInt32Value();
                                return;
                            case -87:
                            case -84:
                            case -83:
                                break;
                            case -86:
                                this.offset = i9 + 8;
                                readInt32Value();
                                readString();
                                return;
                            case -85:
                                this.offset = i9 + 9;
                                return;
                            default:
                                switch (b10) {
                                    case -81:
                                    case -80:
                                    case -79:
                                        return;
                                    default:
                                        switch (b10) {
                                            case -76:
                                                readInt64Value();
                                                return;
                                            case -75:
                                                break;
                                            case -74:
                                                readInt32Value();
                                                return;
                                            case -73:
                                                break;
                                            case -72:
                                                readInt64Value();
                                                return;
                                            case -71:
                                                readInt32Value();
                                                readBigInteger();
                                                return;
                                            default:
                                                switch (b10) {
                                                    case -68:
                                                        this.offset = i9 + 3;
                                                        return;
                                                    case -67:
                                                        this.offset = i9 + 2;
                                                        return;
                                                    case -66:
                                                        break;
                                                    case -65:
                                                        break;
                                                    default:
                                                        switch (b10) {
                                                            case 121:
                                                            case 122:
                                                            case 123:
                                                            case 124:
                                                            case 125:
                                                                this.offset += readInt32Value();
                                                                return;
                                                            default:
                                                                if (b10 < -16 || b10 > 47) {
                                                                    if (b10 < -40 || b10 > -17) {
                                                                        if (b10 >= 48 && b10 <= 63) {
                                                                            this.offset = i9 + 2;
                                                                            return;
                                                                        }
                                                                        if (b10 >= 64 && b10 <= 71) {
                                                                            this.offset = i9 + 3;
                                                                            return;
                                                                        }
                                                                        if (b10 >= 73 && b10 <= 120) {
                                                                            this.offset = (b10 - 73) + i10;
                                                                            return;
                                                                        }
                                                                        if (b10 >= -56 && b10 <= -41) {
                                                                            this.offset = i9 + 2;
                                                                            return;
                                                                        }
                                                                        if (b10 >= -64 && b10 <= -57) {
                                                                            this.offset = i9 + 3;
                                                                            return;
                                                                        }
                                                                        if (b10 < -108 || b10 > -92) {
                                                                            throw notSupportType(b10);
                                                                        }
                                                                        int int32Value = b10 == -92 ? readInt32Value() : b10 - (-108);
                                                                        for (int i13 = 0; i13 < int32Value; i13++) {
                                                                            byte[] bArr5 = FIXED_TYPE_SIZE;
                                                                            byte[] bArr6 = this.bytes;
                                                                            int i14 = this.offset;
                                                                            byte b14 = bArr5[bArr6[i14] & 255];
                                                                            if (b14 > 0) {
                                                                                this.offset = i14 + b14;
                                                                            } else if (b14 == -1) {
                                                                                this.offset = i14 + 1;
                                                                                this.offset += readInt32Value();
                                                                            } else {
                                                                                skipValue();
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                return;
            }
        }
        this.offset = i9 + 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public int startArray() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        this.offset = i9 + 1;
        byte b10 = bArr[i9];
        this.type = b10;
        if (b10 == -81) {
            return -1;
        }
        if (b10 >= -108 && b10 <= -93) {
            this.f1929ch = (char) (-b10);
            return b10 - (-108);
        }
        if (b10 == -111) {
            return readInt32Value();
        }
        if (b10 == -92) {
            return readInt32Value();
        }
        C0086a.m450i(error(b10), "array not support input ");
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c10, char c11, char c12, char c13) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c10, char c11, char c12, char c13, char c14) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c10, char c11, char c12, char c13, char c14, char c15) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(char c10) {
        throw new JSONException("UnsupportedOperation");
    }

    public JSONReaderJSONB(JSONReader.Context context, byte[] bArr, int i9, int i10) {
        super(context, true);
        this.bytes = bArr;
        this.offset = i9;
        this.length = i10;
        this.end = i9 + i10;
        this.symbolTable = context.symbolTable;
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        this.cacheItem = cacheItemArr[System.identityHashCode(Thread.currentThread()) & (cacheItemArr.length - 1)];
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T read(Class<T> cls) {
        JSONReader.Context context = this.context;
        return (T) context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T read(Type type) {
        JSONReader.Context context = this.context;
        return (T) context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List readArray(Type type) {
        if (nextIfNull()) {
            return null;
        }
        if (this.bytes[this.offset] == -110) {
            Object any = readAny();
            if (any instanceof List) {
                return (List) any;
            }
            if (any instanceof Collection) {
                return new JSONArray((Collection<?>) any);
            }
            C0086a.m450i(any.getClass(), "not support class ");
            return null;
        }
        int iStartArray = startArray();
        JSONArray jSONArray = new JSONArray(iStartArray);
        for (int i9 = 0; i9 < iStartArray; i9++) {
            jSONArray.add(read(type));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readArray(Collection collection, Type type) {
        int iStartArray = startArray();
        for (int i9 = 0; i9 < iStartArray; i9++) {
            collection.add(read(type));
        }
    }
}
