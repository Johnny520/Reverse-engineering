package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.io.IOException;
import java.io.OutputStream;
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
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;
import p222p.AbstractC3199a;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterJSONB extends JSONWriter {
    private byte[] bytes;
    private final JSONFactory.CacheItem cacheItem;
    protected long rootTypeNameHash;
    private int symbolIndex;
    private TLongIntHashMap symbols;
    static final BigInteger BIGINT_INT32_MIN = BigInteger.valueOf(-2147483648L);
    static final BigInteger BIGINT_INT32_MAX = BigInteger.valueOf(2147483647L);
    static final BigInteger BIGINT_INT64_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    static final BigInteger BIGINT_INT64_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    static final byte[] SHANGHAI_ZONE_ID_NAME_BYTES = JSONB.toBytes(DateUtils.SHANGHAI_ZONE_ID_NAME);
    static final byte[] OFFSET_8_ZONE_ID_NAME_BYTES = JSONB.toBytes(DateUtils.OFFSET_8_ZONE_ID_NAME);
    static final long WRITE_ENUM_USING_STRING_MASK = JSONWriter.Feature.WriteEnumUsingToString.mask | JSONWriter.Feature.WriteEnumsUsingName.mask;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONWriterJSONB(JSONWriter.Context context, SymbolTable symbolTable) {
        super(context, symbolTable, true, StandardCharsets.UTF_8);
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[System.identityHashCode(Thread.currentThread()) & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        this.bytes = andSet == null ? new byte[8192] : andSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isInt32(BigInteger bigInteger) {
        return bigInteger.compareTo(BIGINT_INT32_MIN) >= 0 && bigInteger.compareTo(BIGINT_INT32_MAX) <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isInt64(BigInteger bigInteger) {
        return bigInteger.compareTo(BIGINT_INT64_MIN) >= 0 && bigInteger.compareTo(BIGINT_INT64_MAX) <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void putInt(byte[] bArr, int i9, int i10) {
        bArr[i9] = (byte) (i10 >>> 24);
        bArr[i9 + 1] = (byte) (i10 >>> 16);
        bArr[i9 + 2] = (byte) (i10 >>> 8);
        bArr[i9 + 3] = (byte) i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void putInt3(byte[] bArr, int i9, int i10) {
        bArr[i9] = (byte) ((i10 >> 16) + 68);
        bArr[i9 + 1] = (byte) (i10 >> 8);
        bArr[i9 + 2] = (byte) i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void putLong(byte[] bArr, int i9, long j3) {
        bArr[i9] = (byte) (j3 >>> 56);
        bArr[i9 + 1] = (byte) (j3 >>> 48);
        bArr[i9 + 2] = (byte) (j3 >>> 40);
        bArr[i9 + 3] = (byte) (j3 >>> 32);
        bArr[i9 + 4] = (byte) (j3 >>> 24);
        bArr[i9 + 5] = (byte) (j3 >>> 16);
        bArr[i9 + 6] = (byte) (j3 >>> 8);
        bArr[i9 + 7] = (byte) j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void putLong3(byte[] bArr, int i9, int i10) {
        bArr[i9] = (byte) ((i10 >> 16) - 60);
        bArr[i9 + 1] = (byte) (i10 >> 8);
        bArr[i9 + 2] = (byte) i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int putStringSizeLarge(byte[] bArr, int i9, int i10) {
        if (i10 <= 262143) {
            bArr[i9] = JSONB.Constants.BC_STR_ASCII;
            putInt3(bArr, i9 + 1, i10);
            return 4;
        }
        bArr[i9] = JSONB.Constants.BC_STR_ASCII;
        bArr[i9 + 1] = JSONB.Constants.BC_INT32;
        bArr[i9 + 2] = (byte) (i10 >>> 24);
        bArr[i9 + 3] = (byte) (i10 >>> 16);
        bArr[i9 + 4] = (byte) (i10 >>> 8);
        bArr[i9 + 5] = (byte) i10;
        return 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void putStringSizeSmall(byte[] bArr, int i9, int i10) {
        bArr[i9] = JSONB.Constants.BC_STR_ASCII;
        bArr[i9 + 1] = (byte) ((i10 >> 8) + 56);
        bArr[i9 + 2] = (byte) i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int sizeOfInt(int i9) {
        if (i9 >= -16 && i9 <= 47) {
            return 1;
        }
        if (i9 < -2048 || i9 > 2047) {
            return (i9 < -262144 || i9 > 262143) ? 5 : 3;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean writeTypeNameSymbol(int i9) {
        int i10 = this.off;
        int i11 = i10 + 2;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        this.bytes[i10] = JSONB.Constants.BC_TYPED_ANY;
        this.off = i10 + 1;
        writeInt32(-i9);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.bytes;
        if (bArr.length < 1048576) {
            JSONFactory.BYTES_UPDATER.lazySet(this.cacheItem, bArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void endObject() {
        this.level--;
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        this.bytes[i9] = JSONB.Constants.BC_OBJECT_END;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void ensureCapacity(int i9) {
        byte[] bArr = this.bytes;
        if (i9 >= bArr.length) {
            int length = bArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 >= 0) {
                i9 = i10;
            }
            if (i9 > this.maxArraySize) {
                throw new OutOfMemoryError("try enabling LargeObject feature instead");
            }
            this.bytes = Arrays.copyOf(bArr, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(OutputStream outputStream) throws IOException {
        int i9 = this.off;
        outputStream.write(this.bytes, 0, i9);
        this.off = 0;
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes() {
        return Arrays.copyOf(this.bytes, this.off);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public int size() {
        return this.off;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray(Object obj, int i9) {
        if (isWriteTypeInfo(obj)) {
            writeTypeName(obj.getClass().getName());
        }
        int i10 = this.off;
        if (i10 == this.bytes.length) {
            ensureCapacity(i10 + 1);
        }
        byte[] bArr = this.bytes;
        boolean z9 = i9 <= 15;
        bArr[i10] = z9 ? (byte) (i9 - 108) : JSONB.Constants.BC_ARRAY;
        this.off = i10 + 1;
        if (z9) {
            return;
        }
        writeInt32(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void startObject() {
        this.level++;
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        this.bytes[i9] = JSONB.Constants.BC_OBJECT;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        if (this.bytes.length == 0) {
            return "<empty>";
        }
        JSONReader jSONReaderOfJSONB = JSONReader.ofJSONB(getBytes());
        JSONWriter jSONWriterM1684of = JSONWriter.m1684of();
        try {
            jSONWriterM1684of.writeAny(jSONReaderOfJSONB.readAny());
            return jSONWriterM1684of.toString();
        } catch (Exception unused) {
            return JSONB.typeName(this.bytes[0]) + ", bytes length " + this.off;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(Map map) {
        if (map == null) {
            writeNull();
            return;
        }
        startObject();
        for (Map.Entry entry : map.entrySet()) {
            writeAny(entry.getKey());
            writeAny(entry.getValue());
        }
        endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void write0(char c10) {
        throw new JSONException("unsupported operation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeAny(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        boolean z9 = (this.context.features & JSONWriter.Feature.FieldBased.mask) != 0;
        Class<?> cls = obj.getClass();
        ObjectWriter objectWriter = this.context.provider.getObjectWriter(cls, cls, z9);
        if (isBeanToArray()) {
            objectWriter.writeArrayMappingJSONB(this, obj, null, null, 0L);
        } else {
            objectWriter.writeJSONB(this, obj, null, null, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeArrayNull() {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        long j3 = this.context.features & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask);
        byte[] bArr = this.bytes;
        if (j3 != 0) {
            int i10 = this.off;
            this.off = i10 + 1;
            bArr[i10] = -108;
        } else {
            int i11 = this.off;
            this.off = i11 + 1;
            bArr[i11] = JSONB.Constants.BC_NULL;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBase64(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBigInt(BigInteger bigInteger, long j3) {
        if (bigInteger == null) {
            writeNull();
            return;
        }
        if (isInt64(bigInteger)) {
            int i9 = this.off;
            if (i9 == this.bytes.length) {
                ensureCapacity(i9 + 1);
            }
            byte[] bArr = this.bytes;
            int i10 = this.off;
            this.off = i10 + 1;
            bArr[i10] = JSONB.Constants.BC_BIGINT_LONG;
            writeInt64(bigInteger.longValue());
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        ensureCapacity(this.off + 5 + byteArray.length);
        byte[] bArr2 = this.bytes;
        int i11 = this.off;
        this.off = i11 + 1;
        bArr2[i11] = JSONB.Constants.BC_BIGINT;
        writeInt32(byteArray.length);
        System.arraycopy(byteArray, 0, this.bytes, this.off, byteArray.length);
        this.off += byteArray.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBinary(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        ensureCapacity(this.off + 6 + bArr.length);
        byte[] bArr2 = this.bytes;
        int i9 = this.off;
        this.off = i9 + 1;
        bArr2[i9] = JSONB.Constants.BC_BINARY;
        writeInt32(bArr.length);
        System.arraycopy(bArr, 0, this.bytes, this.off, bArr.length);
        this.off += bArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean z9) {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = z9 ? JSONB.Constants.BC_TRUE : JSONB.Constants.BC_FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeChar(char c10) {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = JSONB.Constants.BC_CHAR;
        writeInt32(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeColon() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeComma() {
        throw new JSONException("unsupported operation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime14(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.off;
        int i16 = i15 + 8;
        ensureCapacity(i16);
        byte[] bArr = this.bytes;
        bArr[i15] = JSONB.Constants.BC_LOCAL_DATETIME;
        bArr[i15 + 1] = (byte) (i9 >>> 8);
        bArr[i15 + 2] = (byte) i9;
        bArr[i15 + 3] = (byte) i10;
        bArr[i15 + 4] = (byte) i11;
        bArr[i15 + 5] = (byte) i12;
        bArr[i15 + 6] = (byte) i13;
        bArr[i15 + 7] = (byte) i14;
        this.off = i16;
        writeInt32(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime19(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.off;
        int i16 = i15 + 8;
        ensureCapacity(i16);
        byte[] bArr = this.bytes;
        bArr[i15] = JSONB.Constants.BC_LOCAL_DATETIME;
        bArr[i15 + 1] = (byte) (i9 >>> 8);
        bArr[i15 + 2] = (byte) i9;
        bArr[i15 + 3] = (byte) i10;
        bArr[i15 + 4] = (byte) i11;
        bArr[i15 + 5] = (byte) i12;
        bArr[i15 + 6] = (byte) i13;
        bArr[i15 + 7] = (byte) i14;
        this.off = i16;
        writeInt32(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTimeISO8601(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        throw new JSONException("unsupported operation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD10(int i9, int i10, int i11) {
        throw new JSONException("unsupported operation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD8(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 5;
        ensureCapacity(i13);
        byte[] bArr = this.bytes;
        bArr[i12] = JSONB.Constants.BC_LOCAL_DATE;
        bArr[i12 + 1] = (byte) (i9 >>> 8);
        bArr[i12 + 2] = (byte) i9;
        bArr[i12 + 3] = (byte) i10;
        bArr[i12 + 4] = (byte) i11;
        this.off = i13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDecimal(BigDecimal bigDecimal, long j3, DecimalFormat decimalFormat) {
        if (bigDecimal == null) {
            writeNull();
            return;
        }
        int iScale = bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        if (iScale == 0 && isInt64(bigIntegerUnscaledValue)) {
            ensureCapacity(this.off + 1);
            byte[] bArr = this.bytes;
            int i9 = this.off;
            this.off = i9 + 1;
            bArr[i9] = JSONB.Constants.BC_DECIMAL_LONG;
            writeInt64(bigIntegerUnscaledValue.longValue());
            return;
        }
        ensureCapacity(this.off + 1);
        byte[] bArr2 = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr2[i10] = JSONB.Constants.BC_DECIMAL;
        writeInt32(iScale);
        if (isInt32(bigIntegerUnscaledValue)) {
            writeInt32(bigIntegerUnscaledValue.intValue());
        } else if (isInt64(bigIntegerUnscaledValue)) {
            writeInt64(bigIntegerUnscaledValue.longValue());
        } else {
            writeBigInt(bigIntegerUnscaledValue, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double d10) {
        if (d10 == 0.0d) {
            ensureCapacity(this.off + 1);
            byte[] bArr = this.bytes;
            int i9 = this.off;
            this.off = i9 + 1;
            bArr[i9] = JSONB.Constants.BC_DOUBLE_NUM_0;
            return;
        }
        if (d10 == 1.0d) {
            ensureCapacity(this.off + 1);
            byte[] bArr2 = this.bytes;
            int i10 = this.off;
            this.off = i10 + 1;
            bArr2[i10] = JSONB.Constants.BC_DOUBLE_NUM_1;
            return;
        }
        if (d10 >= -2.147483648E9d && d10 <= 2.147483647E9d) {
            long j3 = (long) d10;
            if (j3 == d10) {
                ensureCapacity(this.off + 1);
                byte[] bArr3 = this.bytes;
                int i11 = this.off;
                this.off = i11 + 1;
                bArr3[i11] = JSONB.Constants.BC_DOUBLE_LONG;
                writeInt64(j3);
                return;
            }
        }
        int i12 = this.off;
        int i13 = i12 + 9;
        ensureCapacity(i13);
        byte[] bArr4 = this.bytes;
        bArr4[i12] = JSONB.Constants.BC_DOUBLE;
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        bArr4[i12 + 1] = (byte) (jDoubleToLongBits >>> 56);
        bArr4[i12 + 2] = (byte) (jDoubleToLongBits >>> 48);
        bArr4[i12 + 3] = (byte) (jDoubleToLongBits >>> 40);
        bArr4[i12 + 4] = (byte) (jDoubleToLongBits >>> 32);
        bArr4[i12 + 5] = (byte) (jDoubleToLongBits >>> 24);
        bArr4[i12 + 6] = (byte) (jDoubleToLongBits >>> 16);
        bArr4[i12 + 7] = (byte) (jDoubleToLongBits >>> 8);
        bArr4[i12 + 8] = (byte) jDoubleToLongBits;
        this.off = i13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeEnum(Enum r72) {
        if (r72 == null) {
            writeNull();
            return;
        }
        long j3 = this.context.features;
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & j3) != 0) {
            writeString(r72.toString());
            return;
        }
        if ((j3 & JSONWriter.Feature.WriteEnumsUsingName.mask) != 0) {
            writeString(r72.name());
            return;
        }
        int iOrdinal = r72.ordinal();
        if (iOrdinal > 47) {
            writeInt32(iOrdinal);
            return;
        }
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = (byte) iOrdinal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float f3) {
        int i9 = this.off;
        int iWriteInt32 = i9 + 5;
        if (iWriteInt32 >= this.bytes.length) {
            ensureCapacity(iWriteInt32);
        }
        byte[] bArr = this.bytes;
        int i10 = (int) f3;
        if (i10 != f3 || f3 < -262144.0f || f3 > 262143.0f) {
            bArr[i9] = JSONB.Constants.BC_FLOAT;
            putInt(bArr, i9 + 1, Float.floatToIntBits(f3));
        } else {
            bArr[i9] = JSONB.Constants.BC_FLOAT_INT;
            iWriteInt32 = writeInt32(bArr, i9 + 1, i10) + 1 + i9;
        }
        this.off = iWriteInt32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeHex(byte[] bArr) {
        writeBinary(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInstant(Instant instant) {
        if (instant == null) {
            writeNull();
            return;
        }
        ensureCapacity(this.off + 1);
        byte[] bArr = this.bytes;
        int i9 = this.off;
        this.off = i9 + 1;
        bArr[i9] = JSONB.Constants.BC_TIMESTAMP;
        long epochSecond = instant.getEpochSecond();
        int nano = instant.getNano();
        writeInt64(epochSecond);
        writeInt32(nano);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short s10) {
        int i9 = this.off;
        int i10 = i9 + 3;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_INT16;
        bArr[i9 + 1] = (byte) (s10 >>> 8);
        bArr[i9 + 2] = (byte) s10;
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int[] iArr) {
        if (iArr == null) {
            writeArrayNull();
            return;
        }
        int length = iArr.length;
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        if (length <= 15) {
            int i10 = this.off;
            this.off = i10 + 1;
            bArr[i10] = (byte) (length - 108);
        } else {
            int i11 = this.off;
            this.off = i11 + 1;
            bArr[i11] = JSONB.Constants.BC_ARRAY;
            writeInt32(length);
        }
        int i12 = this.off;
        int length2 = (iArr.length * 5) + i12;
        if (length2 - this.bytes.length > 0) {
            ensureCapacity(length2);
        }
        byte[] bArr2 = this.bytes;
        for (int i13 : iArr) {
            if (i13 >= -16 && i13 <= 47) {
                bArr2[i12] = (byte) i13;
                i12++;
            } else if (i13 >= -2048 && i13 <= 2047) {
                int i14 = i12 + 1;
                bArr2[i12] = (byte) ((i13 >> 8) + 56);
                i12 += 2;
                bArr2[i14] = (byte) i13;
            } else if (i13 < -262144 || i13 > 262143) {
                bArr2[i12] = JSONB.Constants.BC_INT32;
                putInt(bArr2, i12 + 1, i13);
                i12 += 5;
            } else {
                putInt3(bArr2, i12, i13);
                i12 += 3;
            }
        }
        this.off = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long[] jArr) {
        int iWriteInt32;
        if (jArr == null) {
            writeArrayNull();
            return;
        }
        int length = jArr.length;
        int i9 = this.off;
        int iM6834g = AbstractC3199a.m6834g(jArr.length, 9, i9, 5);
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        if (length <= 15) {
            iWriteInt32 = i9 + 1;
            bArr[i9] = (byte) (length - 108);
        } else {
            bArr[i9] = JSONB.Constants.BC_ARRAY;
            iWriteInt32 = writeInt32(bArr, i9 + 1, length) + 1 + i9;
        }
        for (long j3 : jArr) {
            if (j3 >= -16 && j3 <= 47) {
                bArr[iWriteInt32] = (byte) j3;
                iWriteInt32++;
            } else if (j3 >= -2048 && j3 <= 2047) {
                bArr[iWriteInt32] = (byte) ((j3 >> 8) - 48);
                bArr[iWriteInt32 + 1] = (byte) j3;
                iWriteInt32 += 2;
            } else if (j3 >= -262144 && j3 <= 262143) {
                putLong3(bArr, iWriteInt32, (int) j3);
                iWriteInt32 += 3;
            } else if (j3 < -2147483648L || j3 > 2147483647L) {
                bArr[iWriteInt32] = JSONB.Constants.BC_INT64;
                putLong(bArr, iWriteInt32 + 1, j3);
                iWriteInt32 += 9;
            } else {
                bArr[iWriteInt32] = JSONB.Constants.BC_INT64_INT;
                putInt(bArr, iWriteInt32 + 1, (int) j3);
                iWriteInt32 += 5;
            }
        }
        this.off = iWriteInt32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt8(byte b10) {
        int i9 = this.off;
        int i10 = i9 + 2;
        if (i10 - this.bytes.length > 0) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_INT8;
        bArr[i9 + 1] = b10;
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDate(LocalDate localDate) {
        if (localDate == null) {
            writeNull();
            return;
        }
        int i9 = this.off;
        int i10 = i9 + 5;
        ensureCapacity(i10);
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_LOCAL_DATE;
        int year = localDate.getYear();
        bArr[i9 + 1] = (byte) (year >>> 8);
        bArr[i9 + 2] = (byte) year;
        bArr[i9 + 3] = (byte) localDate.getMonthValue();
        bArr[i9 + 4] = (byte) localDate.getDayOfMonth();
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            writeNull();
            return;
        }
        int i9 = this.off;
        int i10 = i9 + 8;
        ensureCapacity(i10);
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_LOCAL_DATETIME;
        int year = localDateTime.getYear();
        bArr[i9 + 1] = (byte) (year >>> 8);
        bArr[i9 + 2] = (byte) year;
        bArr[i9 + 3] = (byte) localDateTime.getMonthValue();
        bArr[i9 + 4] = (byte) localDateTime.getDayOfMonth();
        bArr[i9 + 5] = (byte) localDateTime.getHour();
        bArr[i9 + 6] = (byte) localDateTime.getMinute();
        bArr[i9 + 7] = (byte) localDateTime.getSecond();
        this.off = i10;
        writeInt32(localDateTime.getNano());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalTime(LocalTime localTime) {
        if (localTime == null) {
            writeNull();
            return;
        }
        int i9 = this.off;
        int i10 = i9 + 4;
        ensureCapacity(i10);
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_LOCAL_TIME;
        bArr[i9 + 1] = (byte) localTime.getHour();
        bArr[i9 + 2] = (byte) localTime.getMinute();
        bArr[i9 + 3] = (byte) localTime.getSecond();
        this.off = i10;
        writeInt32(localTime.getNano());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeMillis(long j3) {
        int i9 = this.off;
        int i10 = i9 + 9;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        if (j3 % 1000 == 0) {
            long j4 = j3 / 1000;
            if (j4 >= -2147483648L && j4 <= 2147483647L) {
                int i11 = (int) j4;
                bArr[i9] = JSONB.Constants.BC_TIMESTAMP_SECONDS;
                bArr[i9 + 1] = (byte) (i11 >>> 24);
                bArr[i9 + 2] = (byte) (i11 >>> 16);
                bArr[i9 + 3] = (byte) (i11 >>> 8);
                bArr[i9 + 4] = (byte) i11;
                this.off = i9 + 5;
                return;
            }
            if (j4 % 60 == 0) {
                long j5 = j4 / 60;
                if (j5 >= -2147483648L && j5 <= 2147483647L) {
                    int i12 = (int) j5;
                    bArr[i9] = JSONB.Constants.BC_TIMESTAMP_MINUTES;
                    bArr[i9 + 1] = (byte) (i12 >>> 24);
                    bArr[i9 + 2] = (byte) (i12 >>> 16);
                    bArr[i9 + 3] = (byte) (i12 >>> 8);
                    bArr[i9 + 4] = (byte) i12;
                    this.off = i9 + 5;
                    return;
                }
            }
        }
        bArr[i9] = JSONB.Constants.BC_TIMESTAMP_MILLIS;
        bArr[i9 + 1] = (byte) (j3 >>> 56);
        bArr[i9 + 2] = (byte) (j3 >>> 48);
        bArr[i9 + 3] = (byte) (j3 >>> 40);
        bArr[i9 + 4] = (byte) (j3 >>> 32);
        bArr[i9 + 5] = (byte) (j3 >>> 24);
        bArr[i9 + 6] = (byte) (j3 >>> 16);
        bArr[i9 + 7] = (byte) (j3 >>> 8);
        bArr[i9 + 8] = (byte) j3;
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName(String str) {
        writeString(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName10Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i9 + 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName11Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i9 + 11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName12Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i9 + 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName13Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i9 + 13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName14Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i9 + 14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName15Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i9 + 15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName16Raw(long j3, long j4) {
        int i9 = this.off;
        int i10 = i9 + 16;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i9;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(this.bytes, j5 + j10 + 8, j4);
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName2Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, ((long) i9) + JDKUtils.ARRAY_BYTE_BASE_OFFSET, j3);
        this.off = i9 + 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName3Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, ((long) i9) + JDKUtils.ARRAY_BYTE_BASE_OFFSET, j3);
        this.off = i9 + 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName4Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, ((long) i9) + JDKUtils.ARRAY_BYTE_BASE_OFFSET, j3);
        this.off = i9 + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName5Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, ((long) i9) + JDKUtils.ARRAY_BYTE_BASE_OFFSET, j3);
        this.off = i9 + 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName6Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, ((long) i9) + JDKUtils.ARRAY_BYTE_BASE_OFFSET, j3);
        this.off = i9 + 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName7Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, ((long) i9) + JDKUtils.ARRAY_BYTE_BASE_OFFSET, j3);
        this.off = i9 + 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long j3) {
        int i9 = this.off;
        int i10 = i9 + 8;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        JDKUtils.UNSAFE.putLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9), j3);
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName9Raw(long j3, int i9) {
        int i10 = this.off;
        int i11 = i10 + 12;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        byte[] bArr = this.bytes;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i10;
        unsafe.putLong(bArr, j4 + j5, j3);
        unsafe.putInt(this.bytes, j4 + j5 + 8, i9);
        this.off = i10 + 9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] bArr, long j3) {
        boolean z9;
        int iPutIfAbsent;
        int ordinalByHashCode;
        int i9 = this.off;
        int length = bArr.length + i9 + 2;
        if (length >= this.bytes.length) {
            ensureCapacity(length);
        }
        byte[] bArr2 = this.bytes;
        SymbolTable symbolTable = this.symbolTable;
        if (symbolTable == null || (ordinalByHashCode = symbolTable.getOrdinalByHashCode(j3)) == -1) {
            if ((this.context.features & JSONWriter.Feature.WriteNameAsSymbol.mask) == 0) {
                System.arraycopy(bArr, 0, bArr2, i9, bArr.length);
                this.off = i9 + bArr.length;
                return;
            }
            TLongIntHashMap tLongIntHashMap = this.symbols;
            if (tLongIntHashMap != null) {
                iPutIfAbsent = tLongIntHashMap.putIfAbsent(j3, this.symbolIndex);
                int i10 = this.symbolIndex;
                z9 = true;
                if (iPutIfAbsent == i10) {
                    this.symbolIndex = i10 + 1;
                    z9 = false;
                }
            } else {
                TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap();
                this.symbols = tLongIntHashMap2;
                int i11 = this.symbolIndex;
                this.symbolIndex = i11 + 1;
                tLongIntHashMap2.put(j3, i11);
                z9 = false;
                iPutIfAbsent = i11;
            }
            if (!z9) {
                int i12 = i9 + 1;
                bArr2[i9] = JSONB.Constants.BC_SYMBOL;
                System.arraycopy(bArr, 0, bArr2, i12, bArr.length);
                int length2 = i12 + bArr.length;
                this.off = length2;
                if (iPutIfAbsent < -16 || iPutIfAbsent > 47) {
                    writeInt32(iPutIfAbsent);
                    return;
                } else {
                    this.off = length2 + 1;
                    bArr2[length2] = (byte) iPutIfAbsent;
                    return;
                }
            }
            ordinalByHashCode = -iPutIfAbsent;
        }
        int i13 = i9 + 1;
        bArr2[i9] = JSONB.Constants.BC_SYMBOL;
        int i14 = -ordinalByHashCode;
        if (i14 < -16 || i14 > 47) {
            this.off = i13;
            writeInt32(i14);
        } else {
            bArr2[i13] = (byte) i14;
            this.off = i9 + 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNull() {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = JSONB.Constants.BC_NULL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeOffsetDateTime(OffsetDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            writeNull();
            return;
        }
        int i9 = this.off;
        int i10 = i9 + 8;
        ensureCapacity(i10);
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_TIMESTAMP_WITH_TIMEZONE;
        int year = offsetDateTime.getYear();
        bArr[i9 + 1] = (byte) (year >>> 8);
        bArr[i9 + 2] = (byte) year;
        bArr[i9 + 3] = (byte) offsetDateTime.getMonthValue();
        bArr[i9 + 4] = (byte) offsetDateTime.getDayOfMonth();
        bArr[i9 + 5] = (byte) offsetDateTime.getHour();
        bArr[i9 + 6] = (byte) offsetDateTime.getMinute();
        bArr[i9 + 7] = (byte) offsetDateTime.getSecond();
        this.off = i10;
        writeInt32(offsetDateTime.getNano());
        String id2 = offsetDateTime.getOffset().getId();
        if (id2.equals(DateUtils.OFFSET_8_ZONE_ID_NAME)) {
            writeRaw(OFFSET_8_ZONE_ID_NAME_BYTES);
        } else {
            writeString(id2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeOffsetTime(OffsetTime offsetTime) {
        if (offsetTime == null) {
            writeNull();
        } else {
            writeOffsetDateTime(OffsetDateTime.of(DateUtils.LOCAL_DATE_19700101, offsetTime.toLocalTime(), offsetTime.getOffset()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte[] bArr) {
        int length = this.off + bArr.length;
        if (length - this.bytes.length > 0) {
            ensureCapacity(length);
        }
        System.arraycopy(bArr, 0, this.bytes, this.off, bArr.length);
        this.off += bArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeReference(String str) {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = JSONB.Constants.BC_REFERENCE;
        if (str == this.lastReference) {
            writeString("#-1");
        } else {
            writeString(str);
        }
        this.lastReference = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr, int i9, int i10) {
        boolean z9;
        if (cArr == null) {
            writeNull();
            return;
        }
        if (i10 < 47) {
            int i11 = this.off;
            int i12 = i11 + 1 + i10;
            if (i12 - this.bytes.length > 0) {
                ensureCapacity(i12);
            }
            byte[] bArr = this.bytes;
            int i13 = this.off;
            this.off = i13 + 1;
            bArr[i13] = (byte) (i10 + 73);
            int i14 = i9;
            while (true) {
                if (i14 >= i10) {
                    z9 = true;
                    break;
                }
                char c10 = cArr[i14];
                if (c10 > 255) {
                    z9 = false;
                    break;
                }
                byte[] bArr2 = this.bytes;
                int i15 = this.off;
                this.off = i15 + 1;
                bArr2[i15] = (byte) c10;
                i14++;
            }
            if (z9) {
                return;
            } else {
                this.off = i11;
            }
        } else {
            z9 = true;
        }
        int length = cArr.length & (-4);
        while (i9 < length) {
            char c11 = cArr[i9];
            char c12 = cArr[i9 + 1];
            char c13 = cArr[i9 + 2];
            char c14 = cArr[i9 + 3];
            if (c11 > 255 || c12 > 255 || c13 > 255 || c14 > 255) {
                z9 = false;
                break;
            }
            i9 += 4;
        }
        if (z9) {
            while (true) {
                if (i9 >= cArr.length) {
                    break;
                }
                if (cArr[i9] > 255) {
                    z9 = false;
                    break;
                }
                i9++;
            }
        }
        int i16 = (z9 ? i10 : i10 * 3) + this.off + 6;
        if (i16 - this.bytes.length > 0) {
            ensureCapacity(i16);
        }
        if (z9) {
            if (i10 <= 47) {
                byte[] bArr3 = this.bytes;
                int i17 = this.off;
                this.off = i17 + 1;
                bArr3[i17] = (byte) (i10 + 73);
            } else {
                byte[] bArr4 = this.bytes;
                if (i10 <= 2047) {
                    int i18 = this.off;
                    int i19 = i18 + 1;
                    this.off = i19;
                    bArr4[i18] = JSONB.Constants.BC_STR_ASCII;
                    int i20 = i18 + 2;
                    this.off = i20;
                    bArr4[i19] = (byte) ((i10 >> 8) + 56);
                    this.off = i18 + 3;
                    bArr4[i20] = (byte) i10;
                } else {
                    int i21 = this.off;
                    this.off = i21 + 1;
                    bArr4[i21] = JSONB.Constants.BC_STR_ASCII;
                    writeInt32(i10);
                }
            }
            for (char c15 : cArr) {
                byte[] bArr5 = this.bytes;
                int i22 = this.off;
                this.off = i22 + 1;
                bArr5[i22] = (byte) c15;
            }
            return;
        }
        int length2 = cArr.length * 3;
        int iSizeOfInt = sizeOfInt(length2);
        ensureCapacity(this.off + length2 + iSizeOfInt + 1);
        int iEncodeUTF8 = ((IOUtils.encodeUTF8(cArr, 0, cArr.length, this.bytes, (this.off + iSizeOfInt) + 1) - this.off) - iSizeOfInt) - 1;
        int iSizeOfInt2 = sizeOfInt(iEncodeUTF8);
        if (iSizeOfInt != iSizeOfInt2) {
            byte[] bArr6 = this.bytes;
            int i23 = this.off;
            System.arraycopy(bArr6, iSizeOfInt + i23 + 1, bArr6, i23 + iSizeOfInt2 + 1, iEncodeUTF8);
        }
        byte[] bArr7 = this.bytes;
        int i24 = this.off;
        int i25 = i24 + 1;
        this.off = i25;
        bArr7[i24] = JSONB.Constants.BC_STR_UTF8;
        if (iEncodeUTF8 >= -16 && iEncodeUTF8 <= 47) {
            this.off = i24 + 2;
            bArr7[i25] = (byte) iEncodeUTF8;
        } else if (iEncodeUTF8 < -2048 || iEncodeUTF8 > 2047) {
            writeInt32(iEncodeUTF8);
        } else {
            int i26 = i24 + 2;
            this.off = i26;
            bArr7[i25] = (byte) ((iEncodeUTF8 >> 8) + 56);
            this.off = i24 + 3;
            bArr7[i26] = (byte) iEncodeUTF8;
        }
        this.off += iEncodeUTF8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] bArr) {
        int iPutStringSizeLarge;
        if (bArr == null) {
            writeStringNull();
            return;
        }
        int i9 = this.off;
        int length = bArr.length;
        int length2 = bArr.length + i9 + 6;
        if (length2 - this.bytes.length > 0) {
            ensureCapacity(length2);
        }
        byte[] bArr2 = this.bytes;
        if (length <= 47) {
            iPutStringSizeLarge = i9 + 1;
            bArr2[i9] = (byte) (length + 73);
        } else if (length <= 2047) {
            putStringSizeSmall(bArr2, i9, length);
            iPutStringSizeLarge = i9 + 3;
        } else {
            iPutStringSizeLarge = putStringSizeLarge(bArr2, i9, length) + i9;
        }
        System.arraycopy(bArr, 0, bArr2, iPutStringSizeLarge, bArr.length);
        this.off = iPutStringSizeLarge + length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringNull() {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = JSONB.Constants.BC_NULL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] bArr) {
        int i9 = this.off;
        int length = bArr.length;
        int i10 = i9 + length + 6;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr2 = this.bytes;
        int i11 = i9 + 1;
        bArr2[i9] = JDKUtils.BIG_ENDIAN ? JSONB.Constants.BC_STR_UTF16BE : JSONB.Constants.BC_STR_UTF16LE;
        int iWriteInt32 = i11 + writeInt32(bArr2, i11, length);
        System.arraycopy(bArr, 0, bArr2, iWriteInt32, length);
        this.off = iWriteInt32 + length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeSymbol(int i9) {
        int i10 = this.off + 3;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        int i11 = this.off;
        int i12 = i11 + 1;
        this.off = i12;
        bArr[i11] = JSONB.Constants.BC_SYMBOL;
        if (i9 >= -16 && i9 <= 47) {
            this.off = i11 + 2;
            bArr[i12] = (byte) i9;
        } else {
            if (i9 < -2048 || i9 > 2047) {
                writeInt32(i9);
                return;
            }
            int i13 = i11 + 2;
            this.off = i13;
            bArr[i12] = (byte) ((i9 >> 8) + 56);
            this.off = i11 + 3;
            bArr[i13] = (byte) i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTimeHHMMSS8(int i9, int i10, int i11) {
        throw new JSONException("unsupported operation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean writeTypeName(byte[] bArr, long j3) {
        int iPutIfAbsent;
        boolean z9;
        int ordinalByHashCode;
        SymbolTable symbolTable = this.symbolTable;
        if (symbolTable != null && (ordinalByHashCode = symbolTable.getOrdinalByHashCode(j3)) != -1) {
            return writeTypeNameSymbol(ordinalByHashCode);
        }
        if (this.rootTypeNameHash != j3) {
            TLongIntHashMap tLongIntHashMap = this.symbols;
            iPutIfAbsent = this.symbolIndex;
            if (tLongIntHashMap != null) {
                iPutIfAbsent = tLongIntHashMap.putIfAbsent(j3, iPutIfAbsent);
                int i9 = this.symbolIndex;
                if (iPutIfAbsent == i9) {
                    this.symbolIndex = i9 + 1;
                }
            } else {
                this.symbolIndex = iPutIfAbsent + 1;
                if (iPutIfAbsent == 0) {
                    this.rootTypeNameHash = j3;
                }
                if (iPutIfAbsent != 0 || (this.context.features & JSONWriter.Feature.WriteNameAsSymbol.mask) != 0) {
                    this.symbols = new TLongIntHashMap(j3, iPutIfAbsent);
                }
            }
            z9 = false;
            if (!z9) {
                writeTypeNameSymbol(-iPutIfAbsent);
                return false;
            }
            int i10 = this.off;
            int length = i10 + 2 + bArr.length;
            if (length > this.bytes.length) {
                ensureCapacity(length);
            }
            byte[] bArr2 = this.bytes;
            int i11 = i10 + 1;
            bArr2[i10] = JSONB.Constants.BC_TYPED_ANY;
            System.arraycopy(bArr, 0, bArr2, i11, bArr.length);
            int length2 = i11 + bArr.length;
            if (iPutIfAbsent < -16 || iPutIfAbsent > 47) {
                this.off = length2;
                writeInt32(iPutIfAbsent);
            } else {
                bArr2[length2] = (byte) iPutIfAbsent;
                this.off = length2 + 1;
            }
            return false;
        }
        iPutIfAbsent = 0;
        z9 = true;
        if (!z9) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeUUID(UUID uuid) {
        if (uuid == null) {
            writeNull();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i9 = this.off;
        int i10 = i9 + 18;
        ensureCapacity(i10);
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_BINARY;
        bArr[i9 + 1] = JSONB.Constants.BC_INT32_NUM_16;
        bArr[i9 + 2] = (byte) (mostSignificantBits >>> 56);
        bArr[i9 + 3] = (byte) (mostSignificantBits >>> 48);
        bArr[i9 + 4] = (byte) (mostSignificantBits >>> 40);
        bArr[i9 + 5] = (byte) (mostSignificantBits >>> 32);
        bArr[i9 + 6] = (byte) (mostSignificantBits >>> 24);
        bArr[i9 + 7] = (byte) (mostSignificantBits >>> 16);
        bArr[i9 + 8] = (byte) (mostSignificantBits >>> 8);
        bArr[i9 + 9] = (byte) mostSignificantBits;
        bArr[i9 + 10] = (byte) (leastSignificantBits >>> 56);
        bArr[i9 + 11] = (byte) (leastSignificantBits >>> 48);
        bArr[i9 + 12] = (byte) (leastSignificantBits >>> 40);
        bArr[i9 + 13] = (byte) (leastSignificantBits >>> 32);
        bArr[i9 + 14] = (byte) (leastSignificantBits >>> 24);
        bArr[i9 + 15] = (byte) (leastSignificantBits >>> 16);
        bArr[i9 + 16] = (byte) (leastSignificantBits >>> 8);
        bArr[i9 + 17] = (byte) leastSignificantBits;
        this.off = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeZonedDateTime(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            writeNull();
            return;
        }
        int i9 = this.off;
        int i10 = i9 + 8;
        ensureCapacity(i10);
        byte[] bArr = this.bytes;
        bArr[i9] = JSONB.Constants.BC_TIMESTAMP_WITH_TIMEZONE;
        int year = zonedDateTime.getYear();
        bArr[i9 + 1] = (byte) (year >>> 8);
        bArr[i9 + 2] = (byte) year;
        bArr[i9 + 3] = (byte) zonedDateTime.getMonthValue();
        bArr[i9 + 4] = (byte) zonedDateTime.getDayOfMonth();
        bArr[i9 + 5] = (byte) zonedDateTime.getHour();
        bArr[i9 + 6] = (byte) zonedDateTime.getMinute();
        bArr[i9 + 7] = (byte) zonedDateTime.getSecond();
        this.off = i10;
        writeInt32(zonedDateTime.getNano());
        String id2 = zonedDateTime.getZone().getId();
        if (id2.equals(DateUtils.SHANGHAI_ZONE_ID_NAME)) {
            writeRaw(SHANGHAI_ZONE_ID_NAME_BYTES);
        } else {
            writeString(id2);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes(Charset charset) {
        throw new JSONException("not support operator");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(OutputStream outputStream, Charset charset) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endArray() {
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean[] zArr) {
        if (zArr == null) {
            writeNull();
            return;
        }
        startArray(zArr.length);
        for (boolean z9 : zArr) {
            writeBool(z9);
        }
        endArray();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(String str) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte b10) {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short[] sArr) {
        if (sArr == null) {
            writeNull();
            return;
        }
        startArray(sArr.length);
        for (short s10 : sArr) {
            writeInt32(s10);
        }
        endArray();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char c10) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(List list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        int size = list.size();
        startArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            writeAny(list.get(i9));
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(JSONObject jSONObject) {
        if (jSONObject == null) {
            writeNull();
            return;
        }
        startObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            writeAny(entry.getKey());
            writeAny(entry.getValue());
        }
        endObject();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeArrayNull(long j3) {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        long j4 = j3 & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask);
        byte[] bArr = this.bytes;
        if (j4 != 0) {
            int i10 = this.off;
            this.off = i10 + 1;
            bArr[i10] = -108;
        } else {
            int i11 = this.off;
            this.off = i11 + 1;
            bArr[i11] = JSONB.Constants.BC_NULL;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray() {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray(int i9) {
        int i10 = this.off;
        if (i10 == this.bytes.length) {
            ensureCapacity(i10 + 1);
        }
        byte[] bArr = this.bytes;
        boolean z9 = i9 <= 15;
        bArr[i10] = z9 ? (byte) (i9 - 108) : JSONB.Constants.BC_ARRAY;
        this.off = i10 + 1;
        if (z9) {
            return;
        }
        writeInt32(i9);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float[] fArr) {
        if (fArr == null) {
            writeNull();
            return;
        }
        startArray(fArr.length);
        for (float f3 : fArr) {
            writeFloat(f3);
        }
        endArray();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeSymbol(String str) {
        int ordinal;
        if (str == null) {
            writeNull();
            return;
        }
        SymbolTable symbolTable = this.symbolTable;
        if (symbolTable != null && (ordinal = symbolTable.getOrdinal(str)) >= 0) {
            writeRaw(JSONB.Constants.BC_SYMBOL);
            writeInt32(-ordinal);
        } else {
            writeString(str);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTypeName(String str) {
        int ordinalByHashCode;
        TLongIntHashMap tLongIntHashMap;
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = JSONB.Constants.BC_TYPED_ANY;
        long jHashCode64 = Fnv.hashCode64(str);
        SymbolTable symbolTable = this.symbolTable;
        if (symbolTable != null) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(jHashCode64);
            if (ordinalByHashCode == -1 && (tLongIntHashMap = this.symbols) != null) {
                ordinalByHashCode = tLongIntHashMap.get(jHashCode64);
            }
        } else {
            TLongIntHashMap tLongIntHashMap2 = this.symbols;
            ordinalByHashCode = tLongIntHashMap2 != null ? tLongIntHashMap2.get(jHashCode64) : -1;
        }
        if (ordinalByHashCode == -1) {
            if (this.symbols == null) {
                this.symbols = new TLongIntHashMap();
            }
            TLongIntHashMap tLongIntHashMap3 = this.symbols;
            int i11 = this.symbolIndex;
            this.symbolIndex = i11 + 1;
            tLongIntHashMap3.put(jHashCode64, i11);
            writeString(str);
            writeInt32(i11);
            return;
        }
        int i12 = this.off;
        if (i12 == this.bytes.length) {
            ensureCapacity(i12 + 1);
        }
        writeInt32(ordinalByHashCode);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int i9) {
        int i10 = 5;
        int i11 = this.off + 5;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        byte[] bArr = this.bytes;
        int i12 = this.off;
        if (i9 >= -16 && i9 <= 47) {
            bArr[i12] = (byte) i9;
            i10 = 1;
        } else if (i9 >= -2048 && i9 <= 2047) {
            bArr[i12] = (byte) ((i9 >> 8) + 56);
            bArr[i12 + 1] = (byte) i9;
            i10 = 2;
        } else if (i9 >= -262144 && i9 <= 262143) {
            putInt3(bArr, i12, i9);
            i10 = 3;
        } else {
            bArr[i12] = JSONB.Constants.BC_INT32;
            putInt(bArr, i12 + 1, i9);
        }
        this.off += i10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] bArr) {
        writeRaw(bArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] cArr, int i9, int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    public static int writeInt32(byte[] bArr, int i9, int i10) {
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
            putInt3(bArr, i9, i10);
            return 3;
        }
        bArr[i9] = JSONB.Constants.BC_INT32;
        putInt(bArr, i9 + 1, i10);
        return 5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long j3) {
        int i9 = 9;
        int i10 = this.off + 9;
        if (i10 > this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        int i11 = this.off;
        if (j3 >= -8 && j3 <= 15) {
            bArr[i11] = (byte) (j3 - 32);
            i9 = 1;
        } else if (j3 >= -2048 && j3 <= 2047) {
            bArr[i11] = (byte) ((j3 >> 8) - 48);
            bArr[i11 + 1] = (byte) j3;
            i9 = 2;
        } else if (j3 >= -262144 && j3 <= 262143) {
            putLong3(bArr, i11, (int) j3);
            i9 = 3;
        } else if (j3 >= -2147483648L && j3 <= 2147483647L) {
            bArr[i11] = JSONB.Constants.BC_INT64_INT;
            putInt(bArr, i11 + 1, (int) j3);
            i9 = 5;
        } else {
            bArr[i11] = JSONB.Constants.BC_INT64;
            putLong(bArr, i11 + 1, j3);
        }
        this.off = i11 + i9;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double[] dArr) {
        if (dArr == null) {
            writeNull();
            return;
        }
        startArray(dArr.length);
        for (double d10 : dArr) {
            writeDouble(d10);
        }
        endArray();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr) {
        boolean z9;
        int iWriteInt32;
        int iPutStringSizeLarge;
        boolean z10;
        if (cArr == null) {
            writeNull();
            return;
        }
        int i9 = this.off;
        int length = cArr.length;
        int i10 = 0;
        if (cArr.length < 47) {
            int i11 = i9 + 1;
            int i12 = i11 + length;
            if (i12 - this.bytes.length > 0) {
                ensureCapacity(i12);
            }
            this.bytes[i9] = (byte) (length + 73);
            int i13 = 0;
            while (true) {
                if (i13 >= cArr.length) {
                    z10 = true;
                    break;
                }
                char c10 = cArr[i13];
                if (c10 > 255) {
                    z10 = false;
                    break;
                } else {
                    this.bytes[i11] = (byte) c10;
                    i13++;
                    i11++;
                }
            }
            if (z10) {
                this.off = i11;
                return;
            } else {
                z9 = z10;
                i9 = this.off;
            }
        } else {
            z9 = true;
        }
        int length2 = cArr.length & (-4);
        int i14 = 0;
        while (i14 < length2) {
            char c11 = cArr[i14];
            char c12 = cArr[i14 + 1];
            char c13 = cArr[i14 + 2];
            char c14 = cArr[i14 + 3];
            if (c11 > 255 || c12 > 255 || c13 > 255 || c14 > 255) {
                z9 = false;
                break;
            }
            i14 += 4;
        }
        if (z9) {
            while (true) {
                if (i14 >= cArr.length) {
                    break;
                }
                if (cArr[i14] > 255) {
                    z9 = false;
                    break;
                }
                i14++;
            }
        }
        int i15 = (z9 ? length : length * 3) + i9 + 6;
        if (i15 - this.bytes.length > 0) {
            ensureCapacity(i15);
        }
        if (z9) {
            if (length <= 47) {
                iPutStringSizeLarge = i9 + 1;
                this.bytes[i9] = (byte) (length + 73);
            } else {
                byte[] bArr = this.bytes;
                if (length <= 2047) {
                    putStringSizeSmall(bArr, i9, length);
                    iPutStringSizeLarge = i9 + 3;
                } else {
                    iPutStringSizeLarge = i9 + putStringSizeLarge(bArr, i9, length);
                }
            }
            while (i10 < cArr.length) {
                this.bytes[iPutStringSizeLarge] = (byte) cArr[i10];
                i10++;
                iPutStringSizeLarge++;
            }
        } else {
            int length3 = cArr.length * 3;
            int iSizeOfInt = sizeOfInt(length3);
            ensureCapacity(length3 + i9 + iSizeOfInt + 1);
            int i16 = i9 + iSizeOfInt + 1;
            int iEncodeUTF8 = ((IOUtils.encodeUTF8(cArr, 0, cArr.length, this.bytes, i16) - i9) - iSizeOfInt) - 1;
            int iSizeOfInt2 = sizeOfInt(iEncodeUTF8);
            if (iSizeOfInt != iSizeOfInt2) {
                byte[] bArr2 = this.bytes;
                System.arraycopy(bArr2, i16, bArr2, iSizeOfInt2 + i9 + 1, iEncodeUTF8);
            }
            byte[] bArr3 = this.bytes;
            int i17 = i9 + 1;
            bArr3[i9] = JSONB.Constants.BC_STR_UTF8;
            if (iEncodeUTF8 >= -16 && iEncodeUTF8 <= 47) {
                iWriteInt32 = i9 + 2;
                bArr3[i17] = (byte) iEncodeUTF8;
            } else if (iEncodeUTF8 >= -2048 && iEncodeUTF8 <= 2047) {
                bArr3[i17] = (byte) ((iEncodeUTF8 >> 8) + 56);
                bArr3[i9 + 2] = (byte) iEncodeUTF8;
                iWriteInt32 = i9 + 3;
            } else {
                iWriteInt32 = writeInt32(bArr3, i17, iEncodeUTF8) + i17;
            }
            iPutStringSizeLarge = iWriteInt32 + iEncodeUTF8;
        }
        this.off = iPutStringSizeLarge;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr, int i9, int i10, boolean z9) {
        if (cArr == null) {
            writeNull();
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (cArr[i11 + i9] > 255) {
                writeString(new String(cArr, i9, i10));
                return;
            }
        }
        byte[] bArr = this.bytes;
        if (i10 <= 47) {
            int i12 = this.off;
            this.off = i12 + 1;
            bArr[i12] = (byte) (i10 + 73);
        } else {
            int i13 = this.off;
            this.off = i13 + 1;
            bArr[i13] = JSONB.Constants.BC_STR_ASCII;
            writeInt32(i10);
        }
        for (int i14 = 0; i14 < i10; i14++) {
            byte[] bArr2 = this.bytes;
            int i15 = this.off;
            this.off = i15 + 1;
            bArr2[i15] = (byte) cArr[i9 + i14];
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String[] strArr) {
        if (strArr == null) {
            writeArrayNull();
            return;
        }
        startArray(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                if (isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                    writeString(HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    writeNull();
                }
            } else {
                writeString(str);
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(List<String> list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        int size = list.size();
        startArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            writeString(list.get(i9));
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeNull();
        } else {
            writeString(str.toCharArray());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean z9) {
        writeString(Boolean.toString(z9));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(byte b10) {
        writeString(Integer.toString(b10));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(short s10) {
        writeString(Integer.toString(s10));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(int i9) {
        writeString(Integer.toString(i9));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(long j3) {
        writeString(Long.toString(j3));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean[] zArr) {
        if (zArr == null) {
            writeArrayNull();
            return;
        }
        startArray(zArr.length);
        for (boolean z9 : zArr) {
            writeString(z9);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        startArray(bArr.length);
        for (byte b10 : bArr) {
            writeString(b10);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(short[] sArr) {
        if (sArr == null) {
            writeArrayNull();
            return;
        }
        startArray(sArr.length);
        for (short s10 : sArr) {
            writeString(s10);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(int[] iArr) {
        if (iArr == null) {
            writeArrayNull();
            return;
        }
        startArray(iArr.length);
        for (int i9 : iArr) {
            writeString(i9);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(long[] jArr) {
        if (jArr == null) {
            writeArrayNull();
            return;
        }
        startArray(jArr.length);
        for (long j3 : jArr) {
            writeString(j3);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        startArray(fArr.length);
        for (float f3 : fArr) {
            writeString(f3);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(double[] dArr) {
        if (dArr == null) {
            writeArrayNull();
            return;
        }
        startArray(dArr.length);
        for (double d10 : dArr) {
            writeString(d10);
        }
    }
}
