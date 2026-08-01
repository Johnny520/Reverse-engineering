package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import com.alibaba.fastjson2.util.StringUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class JSONWriterUTF16 extends JSONWriter {
    static final long BYTE_VEC_64_DOUBLE_QUOTE = 9570295239278626L;
    static final long BYTE_VEC_64_SINGLE_QUOTE = 10977691597996071L;
    static final int[] HEX256;
    static final int QUOTE2_COLON;
    static final int QUOTE_COLON;
    static final long REF_0;
    static final long REF_1;
    protected final long byteVectorQuote;
    final JSONFactory.CacheItem cacheItem;
    protected char[] chars;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        while (i10 < 16) {
            short s10 = (short) (i10 < 10 ? i10 + 48 : i10 + 87);
            int i11 = 0;
            while (i11 < 16) {
                iArr[(i10 << 4) + i11] = (((short) (i11 < 10 ? i11 + 48 : i11 + 87)) << 16) | s10;
                i11++;
            }
            i10++;
        }
        if (JDKUtils.BIG_ENDIAN) {
            for (int i12 = 0; i12 < 256; i12++) {
                iArr[i12] = Integer.reverseBytes(iArr[i12] << 8);
            }
        }
        HEX256 = iArr;
        char[] cArr = {'{', '\"', '$', 'r', 'e', 'f', '\"', ':'};
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        REF_0 = unsafe.getLong(cArr, j10);
        REF_1 = unsafe.getLong(cArr, 8 + j10);
        QUOTE2_COLON = unsafe.getInt(cArr, j10 + 12);
        cArr[6] = '\'';
        QUOTE_COLON = unsafe.getInt(cArr, j10 + 12);
    }

    public JSONWriterUTF16(JSONWriter.Context context) {
        super(context, null, false, StandardCharsets.UTF_16);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r0.length - 1)];
        this.cacheItem = cacheItem;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        this.chars = andSet == null ? new char[8192] : andSet;
        this.byteVectorQuote = this.useSingleQuote ? -2821266740684990248L : -2459565876494606883L;
    }

    public static long expand(long j10) {
        return ((j10 & 4278190080L) << 24) | (255 & j10) | ((65280 & j10) << 8) | ((16711680 & j10) << 16);
    }

    private char[] grow(int i10) {
        grow0(i10);
        return this.chars;
    }

    private int indent(char[] cArr, int i10) {
        cArr[i10] = '\n';
        int i11 = i10 + 1;
        byte b10 = this.pretty;
        int i12 = (this.level * b10) + i11;
        Arrays.fill(cArr, i11, i12, b10 == 1 ? '\t' : ' ');
        return i12;
    }

    private static void putLong(char[] cArr, int i10, long j10, long j11) {
        long j12 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j12, (j10 & 255) | ((j10 & 65280) << 8) | ((j10 & 16711680) << 16) | ((j10 & 4278190080L) << 24));
        unsafe.putLong(cArr, j12 + 8, ((j10 & 1095216660480L) >> 32) | ((j10 & 280375465082880L) >> 24) | ((j10 & 71776119061217280L) >> 16) | ((j10 & (-72057594037927936L)) >> 8));
        unsafe.putLong(cArr, j12 + 16, (j11 & 255) | ((j11 & 65280) << 8) | ((j11 & 16711680) << 16) | ((j11 & 4278190080L) << 24));
        unsafe.putLong(cArr, j12 + 24, ((j11 & 1095216660480L) >> 32) | ((j11 & 280375465082880L) >> 24) | ((j11 & 71776119061217280L) >> 16) | ((j11 & (-72057594037927936L)) >> 8));
    }

    private void writeQuote() {
        int i10 = this.off;
        if (i10 == this.chars.length) {
            grow(i10 + 1);
        }
        char[] cArr = this.chars;
        int i11 = this.off;
        this.off = i11 + 1;
        cArr[i11] = this.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.chars;
        if (cArr.length > 8388608) {
            return;
        }
        JSONFactory.CHARS_UPDATER.lazySet(this.cacheItem, cArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void endArray() {
        int i10 = this.level - 1;
        this.level = i10;
        int iIndent = this.off;
        int i11 = iIndent + 1;
        byte b10 = this.pretty;
        int i12 = i11 + (b10 == 0 ? 0 : (b10 * i10) + 1);
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        cArrGrow[iIndent] = ']';
        this.off = iIndent + 1;
        this.startObject = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void endObject() {
        int i10 = this.level - 1;
        this.level = i10;
        int iIndent = this.off;
        int i11 = iIndent + 1;
        byte b10 = this.pretty;
        int i12 = i11 + (b10 == 0 ? 0 : (b10 * i10) + 1);
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        cArrGrow[iIndent] = '}';
        this.off = iIndent + 1;
        this.startObject = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final Object ensureCapacity(int i10) {
        char[] cArr = this.chars;
        if (i10 < cArr.length) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, newCapacity(i10, cArr.length));
        this.chars = cArrCopyOf;
        return cArrCopyOf;
    }

    public final void ensureCapacityInternal(int i10) {
        if (i10 > this.chars.length) {
            grow0(i10);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int flushTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            C1569c.m6258a("out is nulll");
            return 0;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.off;
            if (i10 >= i11) {
                byte[] bArr = new byte[i11];
                for (int i12 = 0; i12 < this.off; i12++) {
                    bArr[i12] = (byte) this.chars[i12];
                }
                outputStream.write(bArr);
                this.off = 0;
                return i11;
            }
            char[] cArr = this.chars;
            if (cArr[i10] >= 128) {
                byte[] bArr2 = new byte[i11 * 3];
                int iEncodeUTF8 = IOUtils.encodeUTF8(cArr, 0, i11, bArr2, 0);
                outputStream.write(bArr2, 0, iEncodeUTF8);
                this.off = 0;
                return iEncodeUTF8;
            }
            i10++;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final byte[] getBytes(Charset charset) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = this.off;
            if (i11 < i10) {
                if (this.chars[i11] >= 128) {
                    break;
                }
                i11++;
            } else if (charset == StandardCharsets.UTF_8 || charset == StandardCharsets.ISO_8859_1 || charset == StandardCharsets.US_ASCII) {
                byte[] bArr = new byte[i10];
                for (int i12 = 0; i12 < this.off; i12++) {
                    bArr[i12] = (byte) this.chars[i12];
                }
                return bArr;
            }
        }
        String str = new String(this.chars, 0, i10);
        if (charset == null) {
            charset = StandardCharsets.UTF_8;
        }
        return str.getBytes(charset);
    }

    public final void grow0(int i10) {
        char[] cArr = this.chars;
        this.chars = Arrays.copyOf(cArr, newCapacity(i10, cArr.length));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int size() {
        return this.off;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void startArray() {
        int i10 = this.level + 1;
        this.level = i10;
        if (i10 > this.context.maxLevel) {
            overflowLevel();
        }
        int i11 = this.off;
        int i12 = i11 + 3 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        int iIndent = i11 + 1;
        cArrGrow[i11] = '[';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void startObject() {
        int i10 = this.level + 1;
        this.level = i10;
        if (i10 > this.context.maxLevel) {
            overflowLevel();
        }
        this.startObject = true;
        int i11 = this.off;
        char[] cArrGrow = this.chars;
        int i12 = i11 + 3 + (this.pretty * this.level);
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        int iIndent = i11 + 1;
        cArrGrow[i11] = '{';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    public final String toString() {
        return new String(this.chars, 0, this.off);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write(List list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        long j10 = JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask;
        JSONWriter.Context context = this.context;
        if ((j10 & context.features) != 0) {
            context.getObjectWriter(list.getClass()).write(this, list, null, null, 0L);
            return;
        }
        int i10 = this.off;
        if (i10 == this.chars.length) {
            grow0(i10 + 1);
        }
        char[] cArr = this.chars;
        int i11 = this.off;
        this.off = i11 + 1;
        cArr[i11] = '[';
        boolean z10 = true;
        int i12 = 0;
        while (i12 < list.size()) {
            Object obj = list.get(i12);
            if (!z10) {
                int i13 = this.off;
                if (i13 == this.chars.length) {
                    grow(i13 + 1);
                }
                char[] cArr2 = this.chars;
                int i14 = this.off;
                this.off = i14 + 1;
                cArr2[i14] = ',';
            }
            if (obj == null) {
                writeNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == String.class) {
                    writeString((String) obj);
                } else if (cls == Integer.class) {
                    writeInt32((Integer) obj);
                } else if (cls == Long.class) {
                    writeInt64((Long) obj);
                } else if (cls == Boolean.class) {
                    writeBool(((Boolean) obj).booleanValue());
                } else if (cls == BigDecimal.class) {
                    writeDecimal((BigDecimal) obj, 0L, null);
                } else if (cls == JSONArray.class) {
                    write((JSONArray) obj);
                } else if (cls == JSONObject.class) {
                    write((JSONObject) obj);
                } else {
                    this.context.getObjectWriter(cls, cls).write(this, obj, null, null, 0L);
                }
            }
            i12++;
            z10 = false;
        }
        int i15 = this.off;
        if (i15 == this.chars.length) {
            grow(i15 + 1);
        }
        char[] cArr3 = this.chars;
        int i16 = this.off;
        this.off = i16 + 1;
        cArr3[i16] = ']';
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write0(char c10) {
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        if (i10 == cArrGrow.length) {
            cArrGrow = grow(i10 + 1);
        }
        cArrGrow[i10] = c10;
        this.off = i10 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeBase64(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        int i10 = this.off;
        ensureCapacityInternal(((((bArr.length - 1) / 3) + 1) << 2) + i10 + 2);
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = this.quote;
        int length = (bArr.length / 3) * 3;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 2;
            int i14 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16);
            i12 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            char[] cArr2 = JSONFactory.f4532CA;
            cArr[i11] = cArr2[(i15 >>> 18) & 63];
            cArr[i11 + 1] = cArr2[(i15 >>> 12) & 63];
            cArr[i11 + 2] = cArr2[(i15 >>> 6) & 63];
            cArr[i11 + 3] = cArr2[i15 & 63];
            i11 += 4;
        }
        int length2 = bArr.length - length;
        if (length2 > 0) {
            int i16 = ((bArr[length] & 255) << 10) | (length2 == 2 ? (bArr[bArr.length - 1] & 255) << 2 : 0);
            char[] cArr3 = JSONFactory.f4532CA;
            cArr[i11] = cArr3[i16 >> 12];
            cArr[i11 + 1] = cArr3[(i16 >>> 6) & 63];
            cArr[i11 + 2] = length2 == 2 ? cArr3[i16 & 63] : '=';
            cArr[i11 + 3] = '=';
            i11 += 4;
        }
        cArr[i11] = this.quote;
        this.off = i11 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeBigInt(BigInteger bigInteger, long j10) {
        if (bigInteger == null) {
            writeNumberNull(j10);
            return;
        }
        if (TypeUtils.isInt64(bigInteger) && j10 == 0) {
            writeInt64(bigInteger.longValue());
            return;
        }
        String string = bigInteger.toString(10);
        boolean zIsWriteAsString = JSONWriter.isWriteAsString(bigInteger, j10 | this.context.features);
        int i10 = this.off;
        int length = string.length();
        int i11 = i10 + length + (zIsWriteAsString ? 2 : 0);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (zIsWriteAsString) {
            cArrGrow[i10] = '\"';
            i10++;
        }
        string.getChars(0, length, cArrGrow, i10);
        int i12 = i10 + length;
        if (zIsWriteAsString) {
            cArrGrow[i12] = '\"';
            i12++;
        }
        this.off = i12;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean z10) {
        int i10;
        int i11 = this.off + 5;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        int i12 = this.off;
        if ((this.context.features & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
            i10 = i12 + 1;
            cArrGrow[i12] = z10 ? '1' : '0';
        } else if (z10) {
            cArrGrow[i12] = 't';
            cArrGrow[i12 + 1] = 'r';
            cArrGrow[i12 + 2] = 'u';
            cArrGrow[i12 + 3] = 'e';
            i10 = i12 + 4;
        } else {
            cArrGrow[i12] = 'f';
            cArrGrow[i12 + 1] = 'a';
            cArrGrow[i12 + 2] = 'l';
            cArrGrow[i12 + 3] = 's';
            cArrGrow[i12 + 4] = 'e';
            i10 = i12 + 5;
        }
        this.off = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeChar(char r8) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeChar(char):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeColon() {
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        if (i10 == cArrGrow.length) {
            cArrGrow = grow(i10 + 1);
        }
        cArrGrow[i10] = ':';
        this.off = i10 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeComma() {
        this.startObject = false;
        int i10 = this.off;
        int i11 = i10 + 2 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        int iIndent = i10 + 1;
        cArrGrow[i10] = ',';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTime14(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = this.off;
        int i17 = i16 + 16;
        char[] cArrGrow = this.chars;
        if (i17 > cArrGrow.length) {
            cArrGrow = grow(i17);
        }
        cArrGrow[i16] = this.quote;
        if (i10 < 0 || i10 > 9999) {
            throw JSONWriter.illegalYear(i10);
        }
        int i18 = i10 / 100;
        IOUtils.writeDigitPair(cArrGrow, i16 + 1, i18);
        IOUtils.writeDigitPair(cArrGrow, i16 + 3, i10 - (i18 * 100));
        IOUtils.writeDigitPair(cArrGrow, i16 + 5, i11);
        IOUtils.writeDigitPair(cArrGrow, i16 + 7, i12);
        IOUtils.writeDigitPair(cArrGrow, i16 + 9, i13);
        IOUtils.writeDigitPair(cArrGrow, i16 + 11, i14);
        IOUtils.writeDigitPair(cArrGrow, i16 + 13, i15);
        cArrGrow[i16 + 15] = this.quote;
        this.off = i17;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTime19(int i10, int i11, int i12, int i13, int i14, int i15) {
        char[] cArrGrow = this.chars;
        int i16 = this.off;
        if (i16 + 21 > cArrGrow.length) {
            cArrGrow = grow(i16 + 21);
        }
        int i17 = this.off;
        cArrGrow[i17] = this.quote;
        if (i10 < 0 || i10 > 9999) {
            throw JSONWriter.illegalYear(i10);
        }
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i17 + 1, i10, i11, i12);
        cArrGrow[iWriteLocalDate] = ' ';
        IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, i13, i14, i15);
        cArrGrow[iWriteLocalDate + 9] = this.quote;
        this.off = iWriteLocalDate + 10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTimeISO8601(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        int i18 = z10 ? i17 == 0 ? 1 : 6 : 0;
        int i19 = this.off;
        int i20 = i19 + 25 + i18;
        char[] cArrGrow = this.chars;
        if (i20 > cArrGrow.length) {
            cArrGrow = grow(i20);
        }
        cArrGrow[i19] = this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i19 + 1, i10, i11, i12);
        cArrGrow[iWriteLocalDate] = z10 ? 'T' : ' ';
        IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, i13, i14, i15);
        int i21 = iWriteLocalDate + 9;
        if (i16 > 0) {
            int i22 = i16 / 10;
            int i23 = i22 / 10;
            if (i16 - (i22 * 10) != 0) {
                IOUtils.putLongLE(cArrGrow, i21, (IOUtils.DIGITS_K_64[i16 & 1023] & (-65536)) | IOUtils.DOT_X0);
                i21 = iWriteLocalDate + 13;
            } else {
                int i24 = iWriteLocalDate + 10;
                cArrGrow[i21] = '.';
                if (i22 - (i23 * 10) != 0) {
                    IOUtils.writeDigitPair(cArrGrow, i24, i22);
                    i21 = iWriteLocalDate + 12;
                } else {
                    i21 = iWriteLocalDate + 11;
                    cArrGrow[i24] = (char) ((byte) (i23 + 48));
                }
            }
        }
        if (z10) {
            int i25 = i17 / 3600;
            if (i17 == 0) {
                cArrGrow[i21] = 'Z';
                i21++;
            } else {
                int iAbs = Math.abs(i25);
                cArrGrow[i21] = i25 >= 0 ? '+' : '-';
                IOUtils.writeDigitPair(cArrGrow, i21 + 1, iAbs);
                cArrGrow[i21 + 3] = ':';
                int i26 = (i17 - (i25 * 3600)) / 60;
                if (i26 < 0) {
                    i26 = -i26;
                }
                IOUtils.writeDigitPair(cArrGrow, i21 + 4, i26);
                i21 += 6;
            }
        }
        cArrGrow[i21] = this.quote;
        this.off = i21 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateYYYMMDD10(int i10, int i11, int i12) {
        int i13 = this.off;
        int i14 = i13 + 13;
        char[] cArrGrow = this.chars;
        if (i14 > cArrGrow.length) {
            cArrGrow = grow(i14);
        }
        cArrGrow[i13] = this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i13 + 1, i10, i11, i12);
        cArrGrow[iWriteLocalDate] = this.quote;
        this.off = iWriteLocalDate + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateYYYMMDD8(int i10, int i11, int i12) {
        int i13 = this.off;
        int i14 = i13 + 10;
        char[] cArrGrow = this.chars;
        if (i14 > cArrGrow.length) {
            cArrGrow = grow(i14);
        }
        cArrGrow[i13] = this.quote;
        if (i10 < 0 || i10 > 9999) {
            throw JSONWriter.illegalYear(i10);
        }
        int i15 = i10 / 100;
        IOUtils.writeDigitPair(cArrGrow, i13 + 1, i15);
        IOUtils.writeDigitPair(cArrGrow, i13 + 3, i10 - (i15 * 100));
        IOUtils.writeDigitPair(cArrGrow, i13 + 5, i11);
        IOUtils.writeDigitPair(cArrGrow, i13 + 7, i12);
        cArrGrow[i13 + 9] = this.quote;
        this.off = i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeDecimal(java.math.BigDecimal r9, long r10, java.text.DecimalFormat r12) {
        /*
            r8 = this;
            if (r9 != 0) goto L6
            r8.writeDecimalNull()
            return
        L6:
            if (r12 == 0) goto L10
            java.lang.String r9 = r12.format(r9)
            r8.writeRaw(r9)
            return
        L10:
            com.alibaba.fastjson2.JSONWriter$Context r12 = r8.context
            long r0 = r12.features
            long r10 = r10 | r0
            int r12 = r9.precision()
            boolean r0 = com.alibaba.fastjson2.JSONWriter.isWriteAsString(r9, r10)
            int r1 = r8.off
            int r2 = r1 + r12
            int r3 = r9.scale()
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 + r3
            int r2 = r2 + 7
            char[] r3 = r8.chars
            int r4 = r3.length
            if (r2 <= r4) goto L35
            char[] r3 = r8.grow(r2)
        L35:
            r2 = 34
            if (r0 == 0) goto L3e
            int r4 = r1 + 1
            r3[r1] = r2
            r1 = r4
        L3e:
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain
            long r4 = r4.mask
            long r10 = r10 & r4
            r4 = 0
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 0
            if (r10 == 0) goto L4c
            r10 = 1
            goto L4d
        L4c:
            r10 = r11
        L4d:
            r4 = 19
            if (r12 >= r4) goto L72
            int r12 = r9.scale()
            if (r12 < 0) goto L72
            long r4 = com.alibaba.fastjson2.util.JDKUtils.FIELD_DECIMAL_INT_COMPACT_OFFSET
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L72
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = r6.getLong(r9, r4)
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L72
            if (r10 != 0) goto L72
            int r9 = com.alibaba.fastjson2.util.IOUtils.writeDecimal(r3, r1, r4, r12)
            goto L89
        L72:
            if (r10 == 0) goto L79
            java.lang.String r9 = r9.toPlainString()
            goto L7d
        L79:
            java.lang.String r9 = r9.toString()
        L7d:
            int r10 = r9.length()
            r9.getChars(r11, r10, r3, r1)
            int r9 = r9.length()
            int r9 = r9 + r1
        L89:
            if (r0 == 0) goto L90
            int r10 = r9 + 1
            r3[r9] = r2
            r9 = r10
        L90:
            r8.off = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeDecimal(java.math.BigDecimal, long, java.text.DecimalFormat):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDouble(double[] dArr) {
        int i10;
        int i11;
        if (dArr == null) {
            writeNull();
            return;
        }
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i12 = this.off;
        int length = (dArr.length * 27) + i12 + 1;
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        char[] cArr = cArrGrow;
        int iWriteDouble = i12 + 1;
        cArr[i12] = '[';
        for (int i13 = 0; i13 < dArr.length; i13++) {
            if (i13 != 0) {
                cArr[iWriteDouble] = ',';
                i10 = iWriteDouble + 1;
            } else {
                i10 = iWriteDouble;
            }
            if (Double.isFinite(dArr[i13])) {
                if (z10) {
                    cArr[i10] = '\"';
                    i11 = i10 + 1;
                } else {
                    i11 = i10;
                }
                iWriteDouble = NumberUtils.writeDouble(cArr, i11, dArr[i13], true, false);
                if (z10) {
                    cArr[iWriteDouble] = '\"';
                    iWriteDouble++;
                }
            } else {
                iWriteDouble = NumberUtils.writeDouble(cArr, i10, dArr[i13], true, z11);
            }
        }
        cArr[iWriteDouble] = ']';
        this.off = iWriteDouble + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDoubleArray(double d10, double d11) {
        int i10;
        int iWriteDouble;
        int i11;
        int iWriteDouble2;
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i12 = this.off;
        int i13 = i12 + 51;
        if (z10) {
            i13 = i12 + 55;
        }
        char[] cArrGrow = this.chars;
        if (i13 > cArrGrow.length) {
            cArrGrow = grow(i13);
        }
        char[] cArr = cArrGrow;
        int i14 = i12 + 1;
        cArr[i12] = '[';
        if (Double.isFinite(d10)) {
            if (z10) {
                cArr[i14] = '\"';
                i10 = i12 + 2;
            } else {
                i10 = i14;
            }
            iWriteDouble = NumberUtils.writeDouble(cArr, i10, d10, true, false);
            if (z10) {
                cArr[iWriteDouble] = '\"';
                iWriteDouble++;
            }
        } else {
            iWriteDouble = NumberUtils.writeDouble(cArr, i14, d10, true, z11);
        }
        int i15 = iWriteDouble + 1;
        cArr[iWriteDouble] = ',';
        if (Double.isFinite(d11)) {
            if (z10) {
                cArr[i15] = '\"';
                i11 = iWriteDouble + 2;
            } else {
                i11 = i15;
            }
            iWriteDouble2 = NumberUtils.writeDouble(cArr, i11, d11, true, false);
            if (z10) {
                cArr[iWriteDouble2] = '\"';
                iWriteDouble2++;
            }
        } else {
            iWriteDouble2 = NumberUtils.writeDouble(cArr, i15, d11, true, z11);
        }
        cArr[iWriteDouble2] = ']';
        this.off = iWriteDouble2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeFloat(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i10 = this.off;
        int length = (fArr.length * (z10 ? 16 : 18)) + i10 + 1;
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int iWriteFloat = i10 + 1;
        cArrGrow[i10] = '[';
        for (int i11 = 0; i11 < fArr.length; i11++) {
            if (i11 != 0) {
                cArrGrow[iWriteFloat] = ',';
                iWriteFloat++;
            }
            if (Float.isFinite(fArr[i11])) {
                if (z10) {
                    cArrGrow[iWriteFloat] = '\"';
                    iWriteFloat++;
                }
                iWriteFloat = NumberUtils.writeFloat(cArrGrow, iWriteFloat, fArr[i11], true, false);
                if (z10) {
                    cArrGrow[iWriteFloat] = '\"';
                    iWriteFloat++;
                }
            } else {
                iWriteFloat = NumberUtils.writeFloat(cArrGrow, iWriteFloat, fArr[i11], true, z11);
            }
        }
        cArrGrow[iWriteFloat] = ']';
        this.off = iWriteFloat + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeHex(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        int length = (bArr.length * 2) + 3;
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        int i11 = length + i10 + 2;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        cArrGrow[i10] = 'x';
        cArrGrow[i10 + 1] = '\'';
        int i12 = i10 + 2;
        for (byte b10 : bArr) {
            int i13 = (b10 & 255) >> 4;
            int i14 = b10 & 15;
            int i15 = 55;
            cArrGrow[i12] = (char) (i13 + (i13 < 10 ? 48 : 55));
            int i16 = i12 + 1;
            if (i14 < 10) {
                i15 = 48;
            }
            cArrGrow[i16] = (char) (i14 + i15);
            i12 += 2;
        }
        cArrGrow[i12] = '\'';
        this.off = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt16(short s10) {
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int i11 = i10 + 7;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (z10) {
            cArrGrow[i10] = this.quote;
            i10++;
        }
        int iWriteInt16 = IOUtils.writeInt16(cArrGrow, i10, s10);
        if (z10) {
            cArrGrow[iWriteInt16] = this.quote;
            iWriteInt16++;
        }
        this.off = iWriteInt16;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(int[] iArr) {
        if (iArr == null) {
            writeNull();
            return;
        }
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int length = (iArr.length * 13) + i10 + 2;
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int i11 = i10 + 1;
        cArrGrow[i10] = '[';
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (i12 != 0) {
                cArrGrow[i11] = ',';
                i11++;
            }
            if (z10) {
                cArrGrow[i11] = this.quote;
                i11++;
            }
            int iWriteInt32 = IOUtils.writeInt32(cArrGrow, i11, iArr[i12]);
            if (z10) {
                i11 = iWriteInt32 + 1;
                cArrGrow[iWriteInt32] = this.quote;
            } else {
                i11 = iWriteInt32;
            }
        }
        cArrGrow[i11] = ']';
        this.off = i11 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(long j10) {
        int i10;
        long j11 = this.context.features;
        int i11 = this.off;
        int i12 = i11 + 23;
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        boolean zIsWriteAsString = JSONWriter.isWriteAsString(j10, j11);
        if (zIsWriteAsString) {
            cArrGrow[i11] = this.quote;
            i11++;
        }
        int iWriteInt64 = IOUtils.writeInt64(cArrGrow, i11, j10);
        if (!zIsWriteAsString) {
            if ((512 & j11) != 0 && (j11 & JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME) == 0 && j10 >= -2147483648L && j10 <= 2147483647L) {
                i10 = iWriteInt64 + 1;
                cArrGrow[iWriteInt64] = 'L';
            }
            this.off = iWriteInt64;
        }
        i10 = iWriteInt64 + 1;
        cArrGrow[iWriteInt64] = this.quote;
        iWriteInt64 = i10;
        this.off = iWriteInt64;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt8(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int length = (bArr.length * 5) + i10 + 2;
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int i11 = i10 + 1;
        cArrGrow[i10] = '[';
        for (int i12 = 0; i12 < bArr.length; i12++) {
            if (i12 != 0) {
                cArrGrow[i11] = ',';
                i11++;
            }
            if (z10) {
                cArrGrow[i11] = this.quote;
                i11++;
            }
            int iWriteInt8 = IOUtils.writeInt8(cArrGrow, i11, bArr[i12]);
            if (z10) {
                i11 = iWriteInt8 + 1;
                cArrGrow[iWriteInt8] = this.quote;
            } else {
                i11 = iWriteInt8;
            }
        }
        cArrGrow[i11] = ']';
        this.off = i11 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeListInt32(List<Integer> list) {
        if (list == null) {
            writeNull();
            return;
        }
        int size = list.size();
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int i11 = i10 + 2 + (size * 23);
        if (i11 >= this.chars.length) {
            grow0(i11);
        }
        char[] cArr = this.chars;
        int i12 = i10 + 1;
        cArr[i10] = '[';
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 != 0) {
                cArr[i12] = ',';
                i12++;
            }
            Integer num = list.get(i13);
            if (num == null) {
                cArr[i12] = 'n';
                cArr[i12 + 1] = 'u';
                cArr[i12 + 2] = 'l';
                cArr[i12 + 3] = 'l';
                i12 += 4;
            } else {
                int iIntValue = num.intValue();
                if (z10) {
                    cArr[i12] = this.quote;
                    i12++;
                }
                int iWriteInt32 = IOUtils.writeInt32(cArr, i12, iIntValue);
                if (z10) {
                    i12 = iWriteInt32 + 1;
                    cArr[iWriteInt32] = this.quote;
                } else {
                    i12 = iWriteInt32;
                }
            }
        }
        cArr[i12] = ']';
        this.off = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeListInt64(List<Long> list) {
        if (list == null) {
            writeNull();
            return;
        }
        int size = list.size();
        int i10 = this.off;
        int i11 = i10 + 2 + (size * 23);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        int iWriteInt64 = i10 + 1;
        cArrGrow[i10] = '[';
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 != 0) {
                cArrGrow[iWriteInt64] = ',';
                iWriteInt64++;
            }
            Long l10 = list.get(i12);
            if (l10 == null) {
                cArrGrow[iWriteInt64] = 'n';
                cArrGrow[iWriteInt64 + 1] = 'u';
                cArrGrow[iWriteInt64 + 2] = 'l';
                cArrGrow[iWriteInt64 + 3] = 'l';
                iWriteInt64 += 4;
            } else {
                long jLongValue = l10.longValue();
                boolean zIsWriteAsString = JSONWriter.isWriteAsString(jLongValue, this.context.features);
                if (zIsWriteAsString) {
                    cArrGrow[iWriteInt64] = this.quote;
                    iWriteInt64++;
                }
                iWriteInt64 = IOUtils.writeInt64(cArrGrow, iWriteInt64, jLongValue);
                if (zIsWriteAsString) {
                    cArrGrow[iWriteInt64] = this.quote;
                    iWriteInt64++;
                }
            }
        }
        cArrGrow[iWriteInt64] = ']';
        this.off = iWriteInt64 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalDate(LocalDate localDate) {
        if (localDate == null) {
            writeNull();
            return;
        }
        if (this.context.dateFormat == null || !writeLocalDateWithFormat(localDate)) {
            int i10 = this.off;
            int i11 = i10 + 18;
            char[] cArrGrow = this.chars;
            if (i11 > cArrGrow.length) {
                cArrGrow = grow(i11);
            }
            cArrGrow[i10] = this.quote;
            int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i10 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            cArrGrow[iWriteLocalDate] = this.quote;
            this.off = iWriteLocalDate + 1;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalDateTime(LocalDateTime localDateTime) {
        int i10 = this.off;
        int i11 = i10 + 38;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        int i12 = i10 + 1;
        cArrGrow[i10] = this.quote;
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i12, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArrGrow[iWriteLocalDate] = ' ';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, localDateTime.toLocalTime());
        cArrGrow[iWriteLocalTime] = this.quote;
        this.off = iWriteLocalTime + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(LocalTime localTime) {
        int i10 = this.off;
        int i11 = i10 + 20;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        cArrGrow[i10] = this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, i10 + 1, localTime);
        cArrGrow[iWriteLocalTime] = this.quote;
        this.off = iWriteLocalTime + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName10Raw(long j10, long j11) {
        long j12;
        long j13;
        int i10;
        int iIndent = this.off;
        int i11 = iIndent + 18 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i12 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty == 0) {
                j12 = j10;
                j13 = j11;
                i10 = i12;
                putLong(cArr, i10, j12, j13);
                this.off = i10 + 13;
            }
            iIndent = indent(cArr, i12);
        }
        j12 = j10;
        j13 = j11;
        i10 = iIndent;
        putLong(cArr, i10, j12, j13);
        this.off = i10 + 13;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName11Raw(long j10, long j11) {
        long j12;
        long j13;
        int i10;
        int iIndent = this.off;
        int i11 = iIndent + 18 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i12 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty == 0) {
                j12 = j10;
                j13 = j11;
                i10 = i12;
                putLong(cArr, i10, j12, j13);
                this.off = i10 + 14;
            }
            iIndent = indent(cArr, i12);
        }
        j12 = j10;
        j13 = j11;
        i10 = iIndent;
        putLong(cArr, i10, j12, j13);
        this.off = i10 + 14;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName12Raw(long j10, long j11) {
        long j12;
        long j13;
        int i10;
        int iIndent = this.off;
        int i11 = iIndent + 18 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i12 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty == 0) {
                j12 = j10;
                j13 = j11;
                i10 = i12;
                putLong(cArr, i10, j12, j13);
                this.off = i10 + 15;
            }
            iIndent = indent(cArr, i12);
        }
        j12 = j10;
        j13 = j11;
        i10 = iIndent;
        putLong(cArr, i10, j12, j13);
        this.off = i10 + 15;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName13Raw(long j10, long j11) {
        long j12;
        long j13;
        int i10;
        int iIndent = this.off;
        int i11 = iIndent + 18 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i12 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty == 0) {
                j12 = j10;
                j13 = j11;
                i10 = i12;
                putLong(cArr, i10, j12, j13);
                this.off = i10 + 16;
            }
            iIndent = indent(cArr, i12);
        }
        j12 = j10;
        j13 = j11;
        i10 = iIndent;
        putLong(cArr, i10, j12, j13);
        this.off = i10 + 16;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName14Raw(long j10, long j11) {
        long j12;
        long j13;
        int i10;
        int iIndent = this.off;
        int i11 = iIndent + 19 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i12 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty == 0) {
                j12 = j10;
                j13 = j11;
                i10 = i12;
                putLong(cArr, i10, j12, j13);
                int i13 = i10;
                cArr[i13 + 16] = ':';
                this.off = i13 + 17;
            }
            iIndent = indent(cArr, i12);
        }
        j12 = j10;
        j13 = j11;
        i10 = iIndent;
        putLong(cArr, i10, j12, j13);
        int i132 = i10;
        cArr[i132 + 16] = ':';
        this.off = i132 + 17;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeName15Raw(long r10, long r12) {
        /*
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 20
            byte r2 = r9.pretty
            int r3 = r9.level
            int r2 = r2 * r3
            int r1 = r1 + r2
            char[] r2 = r9.chars
            int r3 = r2.length
            if (r1 <= r3) goto L13
            char[] r2 = r9.grow(r1)
        L13:
            r3 = r2
            boolean r1 = r9.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r9.startObject = r1
        L1b:
            r5 = r10
            r7 = r12
            r4 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r9.pretty
            if (r0 == 0) goto L2e
            int r0 = r9.indent(r3, r1)
            goto L1b
        L2e:
            r5 = r10
            r7 = r12
            r4 = r1
        L31:
            putLong(r3, r4, r5, r7)
            r0 = r4
            int r4 = r0 + 16
            boolean r10 = r9.useSingleQuote
            if (r10 == 0) goto L3e
            int r10 = com.alibaba.fastjson2.JSONWriterUTF16.QUOTE_COLON
            goto L40
        L3e:
            int r10 = com.alibaba.fastjson2.JSONWriterUTF16.QUOTE2_COLON
        L40:
            com.alibaba.fastjson2.util.IOUtils.putIntUnaligned(r3, r4, r10)
            int r4 = r0 + 18
            r9.off = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeName15Raw(long, long):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName16Raw(long j10, long j11) {
        int iIndent = this.off;
        int i10 = iIndent + 21 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArr[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArr, i11) : i11;
        }
        cArr[iIndent] = this.quote;
        putLong(cArr, iIndent + 1, j10, j11);
        IOUtils.putIntUnaligned(cArr, iIndent + 17, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 19;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName2Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 10 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        putLong(cArrGrow, iIndent, j10);
        this.off = iIndent + 5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName3Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 10 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        putLong(cArrGrow, iIndent, j10);
        this.off = iIndent + 6;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName4Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 10 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        putLong(cArrGrow, iIndent, j10);
        this.off = iIndent + 7;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName5Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 10 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        putLong(cArrGrow, iIndent, j10);
        this.off = iIndent + 8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName6Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 11 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        putLong(cArrGrow, iIndent, j10);
        cArrGrow[iIndent + 8] = ':';
        this.off = iIndent + 9;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName7Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 12 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        putLong(cArrGrow, iIndent, j10);
        IOUtils.putIntUnaligned(cArrGrow, iIndent + 8, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName8Raw(long j10) {
        int iIndent = this.off;
        int i10 = iIndent + 13 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i11) : i11;
        }
        cArrGrow[iIndent] = this.quote;
        putLong(cArrGrow, iIndent + 1, j10);
        IOUtils.putIntUnaligned(cArrGrow, iIndent + 9, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName9Raw(long j10, int i10) {
        int iIndent = this.off;
        int i11 = iIndent + 14 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i12 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i12) : i12;
        }
        putLong(cArrGrow, iIndent, j10, i10);
        this.off = iIndent + 12;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(char[] cArr) {
        int iIndent = this.off;
        int length = cArr.length + iIndent + 2 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        System.arraycopy(cArr, 0, cArrGrow, iIndent, cArr.length);
        this.off = iIndent + cArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNull() {
        int i10 = this.off;
        int i11 = i10 + 4;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        IOUtils.putNULL(cArrGrow, i10);
        this.off = i11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetDateTime(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            writeNull();
            return;
        }
        int i10 = this.off;
        int i11 = i10 + 45;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        cArrGrow[i10] = this.quote;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i10 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArrGrow[iWriteLocalDate] = 'T';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = 'Z';
        } else {
            String id2 = offset.getId();
            id2.getChars(0, id2.length(), cArrGrow, iWriteLocalTime);
            length = id2.length() + iWriteLocalTime;
        }
        cArrGrow[length] = this.quote;
        this.off = length + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetTime(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            writeNull();
            return;
        }
        ZoneOffset offset = offsetTime.getOffset();
        int i10 = this.off;
        int i11 = i10 + 28;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        cArrGrow[i10] = this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, i10 + 1, offsetTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = 'Z';
        } else {
            String id2 = offset.getId();
            id2.getChars(0, id2.length(), cArrGrow, iWriteLocalTime);
            length = id2.length() + iWriteLocalTime;
        }
        cArrGrow[length] = this.quote;
        this.off = length + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(String str) {
        int length = str.length();
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        int i11 = i10 + length;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        str.getChars(0, length, cArrGrow, i10);
        this.off = i11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeReference(String str) {
        this.lastReference = str;
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        int i11 = i10 + 9;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        char[] cArr = cArrGrow;
        long j10 = (((long) i10) << 1) + JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j10, REF_0);
        unsafe.putLong(cArr, j10 + 8, REF_1);
        this.off = i10 + 8;
        writeString(str);
        int i12 = this.off;
        char[] cArrGrow2 = this.chars;
        if (i12 == cArrGrow2.length) {
            cArrGrow2 = grow(i12 + 1);
        }
        cArrGrow2[i12] = '}';
        this.off = i12 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeString(char[] r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeString(char[], int, int, boolean):void");
    }

    public final void writeStringBrowserSecure(char[] cArr) {
        int i10 = 0;
        boolean z10 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i11 = this.off;
        int length = cArr.length + i11 + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        char[] cArr2 = this.chars;
        int i12 = i11 + 1;
        cArr2[i11] = this.quote;
        int length2 = cArr.length;
        while (i10 < length2) {
            char c10 = IOUtils.getChar(cArr, i10);
            if (c10 == '\\' || c10 == this.quote || c10 < ' ' || c10 == '<' || c10 == '>' || c10 == '(' || c10 == ')' || (z10 && c10 > 127)) {
                writeStringEscape(cArr);
                return;
            } else {
                cArr2[i12] = c10;
                i10++;
                i12++;
            }
        }
        cArr2[i12] = this.quote;
        this.off = i12 + 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeStringEscape(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeStringEscape(java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0053. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeStringEscapeUTF16(byte[] r14) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeStringEscapeUTF16(byte[]):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] bArr) {
        int i10;
        if ((this.context.features & JSONWriter.MASK_BROWSER_SECURE) != 0) {
            writeStringLatin1BrowserSecure(bArr);
            return;
        }
        int i11 = this.off;
        char[] cArrGrow = this.chars;
        int length = bArr.length + i11 + 2;
        if (length >= cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int i12 = i11 + 1;
        cArrGrow[i11] = this.quote;
        long j10 = this.byteVectorQuote;
        int length2 = bArr.length & (-8);
        int i13 = 0;
        while (i13 < length2) {
            long longLE = IOUtils.getLongLE(bArr, i13);
            if (!StringUtils.noneEscaped(longLE, j10)) {
                break;
            }
            IOUtils.putLongLE(cArrGrow, i12, expand(longLE));
            IOUtils.putLongLE(cArrGrow, i12 + 4, expand(longLE >>> 32));
            i12 += 8;
            i13 += 8;
        }
        int i14 = i13;
        while (true) {
            i10 = i12;
            if (i14 >= bArr.length) {
                cArrGrow[i10] = this.quote;
                this.off = i10 + 1;
                return;
            }
            byte b10 = bArr[i14];
            if (b10 == 92 || b10 == this.quote || b10 < 32) {
                break;
            }
            i12 = i10 + 1;
            cArrGrow[i10] = (char) b10;
            i14++;
        }
        int length3 = length + (bArr.length * 5);
        if (length3 >= cArrGrow.length) {
            cArrGrow = grow(length3);
        }
        this.off = StringUtils.writeLatin1EscapedRest(cArrGrow, i10, bArr, i14, this.quote, this.context.features);
    }

    public final void writeStringLatin1BrowserSecure(byte[] bArr) {
        int i10 = this.off;
        int length = bArr.length + i10 + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = this.quote;
        int length2 = bArr.length;
        int i12 = 0;
        while (i12 < length2) {
            byte b10 = bArr[i12];
            if (b10 == 92 || b10 == this.quote || b10 < 32 || b10 == 60 || b10 == 62 || b10 == 40 || b10 == 41) {
                this.off = i10;
                writeStringEscape(bArr);
                return;
            } else {
                cArr[i11] = (char) b10;
                i12++;
                i11++;
            }
        }
        cArr[i11] = this.quote;
        this.off = i11 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeStringUTF16(byte[] r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            if (r1 != 0) goto La
            r0.writeStringNull()
            return
        La:
            com.alibaba.fastjson2.JSONWriter$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r4 = r4.mask
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r6 = r6.mask
            long r4 = r4 | r6
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L22
            r19.writeStringUTF16BrowserSecure(r20)
            return
        L22:
            int r2 = r0.off
            int r3 = r1.length
            int r3 = r3 + r2
            int r3 = r3 + 2
            char[] r6 = r0.chars
            int r6 = r6.length
            if (r3 < r6) goto L30
            r0.grow(r3)
        L30:
            long r6 = r0.byteVectorQuote
            char[] r3 = r0.chars
            int r8 = r2 + 1
            char r9 = r0.quote
            r3[r2] = r9
            int r2 = r1.length
            int r2 = r2 >> 1
            r9 = 0
        L3e:
            if (r9 >= r2) goto L97
            int r10 = r9 + 8
            if (r10 >= r2) goto L79
            int r11 = r9 << 1
            long r11 = com.alibaba.fastjson2.util.IOUtils.getLongLE(r1, r11)
            int r13 = r9 + 4
            int r13 = r13 << 1
            long r13 = com.alibaba.fastjson2.util.IOUtils.getLongLE(r1, r13)
            long r15 = r11 | r13
            r17 = -71777214294589696(0xff00ff00ff00ff00, double:-5.82767264895205E303)
            long r15 = r15 & r17
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 != 0) goto L79
            r15 = 8
            long r15 = r11 << r15
            long r4 = r15 | r13
            boolean r4 = com.alibaba.fastjson2.util.StringUtils.noneEscaped(r4, r6)
            if (r4 == 0) goto L79
            com.alibaba.fastjson2.util.IOUtils.putLongLE(r3, r8, r11)
            int r4 = r8 + 4
            com.alibaba.fastjson2.util.IOUtils.putLongLE(r3, r4, r13)
            int r8 = r8 + 8
            r9 = r10
        L76:
            r4 = 0
            goto L3e
        L79:
            int r4 = r9 + 1
            char r5 = com.alibaba.fastjson2.util.IOUtils.getChar(r1, r9)
            r9 = 92
            if (r5 == r9) goto L93
            char r9 = r0.quote
            if (r5 == r9) goto L93
            r9 = 32
            if (r5 >= r9) goto L8c
            goto L93
        L8c:
            int r9 = r8 + 1
            r3[r8] = r5
            r8 = r9
            r9 = r4
            goto L76
        L93:
            r19.writeStringEscapeUTF16(r20)
            return
        L97:
            char r1 = r0.quote
            r3[r8] = r1
            int r8 = r8 + 1
            r0.off = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeStringUTF16(byte[]):void");
    }

    public final void writeStringUTF16BrowserSecure(byte[] bArr) {
        int i10 = 0;
        boolean z10 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i11 = this.off;
        int length = bArr.length + i11 + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        char[] cArr = this.chars;
        int i12 = i11 + 1;
        cArr[i11] = this.quote;
        int length2 = bArr.length >> 1;
        while (i10 < length2) {
            char c10 = IOUtils.getChar(bArr, i10);
            if (c10 == '\\' || c10 == this.quote || c10 < ' ' || c10 == '<' || c10 == '>' || c10 == '(' || c10 == ')' || (z10 && c10 > 127)) {
                writeStringEscapeUTF16(bArr);
                return;
            } else {
                cArr[i12] = c10;
                i10++;
                i12++;
            }
        }
        cArr[i12] = this.quote;
        this.off = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeTimeHHMMSS8(int i10, int i11, int i12) {
        int i13 = this.off;
        int i14 = i13 + 10;
        char[] cArrGrow = this.chars;
        if (i14 > cArrGrow.length) {
            cArrGrow = grow(i14);
        }
        cArrGrow[i13] = (char) ((byte) this.quote);
        IOUtils.writeDigitPair(cArrGrow, i13 + 1, i10);
        cArrGrow[i13 + 3] = ':';
        IOUtils.writeDigitPair(cArrGrow, i13 + 4, i11);
        cArrGrow[i13 + 6] = ':';
        IOUtils.writeDigitPair(cArrGrow, i13 + 7, i12);
        cArrGrow[i13 + 9] = (char) ((byte) this.quote);
        this.off = i14;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeUUID(UUID uuid) {
        if (uuid == null) {
            writeNull();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i10 = this.off + 38;
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        int i11 = this.off;
        cArrGrow[i11] = '\"';
        putLong(cArrGrow, i11 + 1, (int) (mostSignificantBits >> 56), (int) (mostSignificantBits >> 48));
        putLong(cArrGrow, i11 + 5, (int) (mostSignificantBits >> 40), (int) (mostSignificantBits >> 32));
        cArrGrow[i11 + 9] = '-';
        int i12 = (int) mostSignificantBits;
        putLong(cArrGrow, i11 + 10, i12 >> 24, i12 >> 16);
        cArrGrow[i11 + 14] = '-';
        putLong(cArrGrow, i11 + 15, i12 >> 8, i12);
        cArrGrow[i11 + 19] = '-';
        putLong(cArrGrow, i11 + 20, (int) (leastSignificantBits >> 56), (int) (leastSignificantBits >> 48));
        cArrGrow[i11 + 24] = '-';
        putLong(cArrGrow, i11 + 25, (int) (leastSignificantBits >> 40), (int) (leastSignificantBits >> 32));
        int i13 = (int) leastSignificantBits;
        putLong(cArrGrow, i11 + 29, i13 >> 24, i13 >> 16);
        putLong(cArrGrow, i11 + 33, i13 >> 8, i13);
        cArrGrow[i11 + 37] = '\"';
        this.off += 38;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeZonedDateTime(ZonedDateTime zonedDateTime) {
        char cCharAt;
        int i10;
        int i11;
        if (zonedDateTime == null) {
            writeNull();
            return;
        }
        ZoneId zone = zonedDateTime.getZone();
        String id2 = zone.getId();
        int length = id2.length();
        if (ZoneOffset.UTC == zone || (length <= 3 && ("UTC".equals(id2) || "Z".equals(id2)))) {
            id2 = "Z";
            cCharAt = 0;
            i10 = 1;
        } else {
            if (length != 0) {
                cCharAt = id2.charAt(0);
                if (cCharAt == '+' || cCharAt == '-') {
                    i10 = length;
                }
            } else {
                cCharAt = 0;
            }
            i10 = length + 2;
        }
        int i12 = this.off;
        int i13 = i12 + i10 + 38;
        char[] cArrGrow = this.chars;
        if (i13 > cArrGrow.length) {
            cArrGrow = grow(i13);
        }
        cArrGrow[i12] = this.quote;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i12 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArrGrow[iWriteLocalDate] = 'T';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, zonedDateTime.toLocalTime());
        if (i10 == 1) {
            i11 = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = 'Z';
        } else if (cCharAt == '+' || cCharAt == '-') {
            id2.getChars(0, length, cArrGrow, iWriteLocalTime);
            i11 = iWriteLocalTime + length;
        } else {
            int i14 = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = '[';
            id2.getChars(0, length, cArrGrow, i14);
            int i15 = i14 + length;
            cArrGrow[i15] = ']';
            i11 = i15 + 1;
        }
        cArrGrow[i11] = this.quote;
        this.off = i11 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char[] cArr, int i10, int i11) {
        int i12 = this.off;
        char[] cArrGrow = this.chars;
        int i13 = i12 + i11;
        if (i13 > cArrGrow.length) {
            cArrGrow = grow(i13);
        }
        System.arraycopy(cArr, i10, cArrGrow, i12, i11);
        this.off = i13;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char c10) {
        int i10 = this.off;
        if (i10 == this.chars.length) {
            grow0(i10 + 1);
        }
        char[] cArr = this.chars;
        int i11 = this.off;
        this.off = i11 + 1;
        cArr[i11] = c10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char c10, char c11) {
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        int i11 = i10 + 2;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        cArrGrow[i10] = c10;
        cArrGrow[i10 + 1] = c11;
        this.off = i11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(char[] cArr, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + i11 + 2 + (this.pretty * this.level);
        char[] cArrGrow = this.chars;
        if (i13 > cArrGrow.length) {
            cArrGrow = grow(i13);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            cArrGrow[i12] = ',';
            i12++;
        }
        System.arraycopy(cArr, i10, cArrGrow, i12, i11);
        this.off = i12 + i11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void flushTo(Writer writer) {
        try {
            int i10 = this.off;
            if (i10 > 0) {
                writer.write(this.chars, 0, i10);
                this.off = 0;
            }
        } catch (IOException e10) {
            C1565a.m6255a("flushTo error", e10);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final byte[] getBytes() {
        int i10 = 0;
        while (true) {
            int i11 = this.off;
            if (i10 < i11) {
                char[] cArr = this.chars;
                if (cArr[i10] >= 128) {
                    byte[] bArr = new byte[i11 * 3];
                    return Arrays.copyOf(bArr, IOUtils.encodeUTF8(cArr, 0, i11, bArr, 0));
                }
                i10++;
            } else {
                byte[] bArr2 = new byte[i11];
                for (int i12 = 0; i12 < this.off; i12++) {
                    bArr2[i12] = (byte) this.chars[i12];
                }
                return bArr2;
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int flushTo(OutputStream outputStream, Charset charset) throws IOException {
        if (this.off == 0) {
            return 0;
        }
        if (outputStream != null) {
            byte[] bytes = getBytes(charset);
            outputStream.write(bytes);
            this.off = 0;
            return bytes.length;
        }
        C1569c.m6258a("out is null");
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(long[] jArr) {
        if (jArr == null) {
            writeNull();
            return;
        }
        int i10 = this.off;
        int length = i10 + 2 + (jArr.length * 23);
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int iWriteInt64 = i10 + 1;
        cArrGrow[i10] = '[';
        for (int i11 = 0; i11 < jArr.length; i11++) {
            if (i11 != 0) {
                cArrGrow[iWriteInt64] = ',';
                iWriteInt64++;
            }
            long j10 = jArr[i11];
            boolean zIsWriteAsString = JSONWriter.isWriteAsString(j10, this.context.features);
            if (zIsWriteAsString) {
                cArrGrow[iWriteInt64] = this.quote;
                iWriteInt64++;
            }
            iWriteInt64 = IOUtils.writeInt64(cArrGrow, iWriteInt64, j10);
            if (zIsWriteAsString) {
                cArrGrow[iWriteInt64] = this.quote;
                iWriteInt64++;
            }
        }
        cArrGrow[iWriteInt64] = ']';
        this.off = iWriteInt64 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt8(byte b10) {
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int i11 = i10 + 7;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (z10) {
            cArrGrow[i10] = this.quote;
            i10++;
        }
        int iWriteInt8 = IOUtils.writeInt8(cArrGrow, i10, b10);
        if (z10) {
            cArrGrow[iWriteInt8] = this.quote;
            iWriteInt8++;
        }
        this.off = iWriteInt8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(int i10) {
        boolean z10 = (this.context.features & 256) != 0;
        int i11 = this.off;
        int i12 = i11 + 13;
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        if (z10) {
            cArrGrow[i11] = this.quote;
            i11++;
        }
        int iWriteInt32 = IOUtils.writeInt32(cArrGrow, i11, i10);
        if (z10) {
            cArrGrow[iWriteInt32] = this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(Long l10) {
        if (l10 == null) {
            writeInt64Null();
        } else {
            writeInt64(l10.longValue());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(Integer num) {
        if (num == null) {
            writeNumberNull();
        } else {
            writeInt32(num.intValue());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeFloat(float f10) {
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        boolean z12 = (!z11 || Float.isFinite(f10)) ? z10 : false;
        int i10 = this.off;
        int i11 = i10 + 15;
        if (z12) {
            i11 = i10 + 17;
        }
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (z12) {
            cArrGrow[i10] = '\"';
            i10++;
        }
        int iWriteFloat = NumberUtils.writeFloat(cArrGrow, i10, f10, true, z11);
        if (z12) {
            cArrGrow[iWriteFloat] = '\"';
            iWriteFloat++;
        }
        this.off = iWriteFloat;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeStringNull();
            return;
        }
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.EscapeNoneAscii.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        char c10 = this.quote;
        int length = str.length();
        int i10 = this.off + length + 2;
        if (i10 >= this.chars.length) {
            grow(i10);
        }
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\\' || cCharAt == c10 || cCharAt < ' ' || ((z11 && (cCharAt == '<' || cCharAt == '>' || cCharAt == '(' || cCharAt == ')')) || (z10 && cCharAt > 127))) {
                writeStringEscape(str);
                return;
            }
        }
        int i12 = this.off;
        char[] cArr = this.chars;
        int i13 = i12 + 1;
        cArr[i12] = c10;
        str.getChars(0, length, cArr, i13);
        int i14 = i13 + length;
        cArr[i14] = c10;
        this.off = i14 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDouble(double d10) {
        int i10;
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        boolean z12 = (!z11 || Double.isFinite(d10)) ? z10 : false;
        int i11 = this.off;
        int i12 = i11 + 24;
        if (z12) {
            i12 = i11 + 26;
        }
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        char[] cArr = cArrGrow;
        if (z12) {
            cArr[i11] = '\"';
            i10 = i11 + 1;
        } else {
            i10 = i11;
        }
        int iWriteDouble = NumberUtils.writeDouble(cArr, i10, d10, true, z11);
        if (z12) {
            cArr[iWriteDouble] = '\"';
            iWriteDouble++;
        }
        this.off = iWriteDouble;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x004b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeStringEscape(char[] r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeStringEscape(char[]):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(List<String> list) {
        if (this.pretty != 0) {
            super.writeString(list);
            return;
        }
        int i10 = this.off;
        if (i10 == this.chars.length) {
            grow(i10 + 1);
        }
        char[] cArr = this.chars;
        int i11 = this.off;
        this.off = i11 + 1;
        cArr[i11] = '[';
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 != 0) {
                int i13 = this.off;
                if (i13 == this.chars.length) {
                    grow(i13 + 1);
                }
                char[] cArr2 = this.chars;
                int i14 = this.off;
                this.off = i14 + 1;
                cArr2[i14] = ',';
            }
            writeString(list.get(i12));
        }
        int i15 = this.off;
        if (i15 == this.chars.length) {
            grow(i15 + 1);
        }
        char[] cArr3 = this.chars;
        int i16 = this.off;
        this.off = i16 + 1;
        cArr3[i16] = ']';
    }

    private static void putLong(char[] cArr, int i10, long j10) {
        long j11 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j11, (255 & j10) | ((65280 & j10) << 8) | ((16711680 & j10) << 16) | ((4278190080L & j10) << 24));
        unsafe.putLong(cArr, 8 + j11, ((1095216660480L & j10) >> 32) | ((280375465082880L & j10) >> 24) | ((71776119061217280L & j10) >> 16) | ((j10 & (-72057594037927936L)) >> 8));
    }

    private static void putLong(char[] cArr, int i10, long j10, int i11) {
        long j11 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j11, (j10 & 255) | ((j10 & 65280) << 8) | ((j10 & 16711680) << 16) | ((j10 & 4278190080L) << 24));
        unsafe.putLong(cArr, j11 + 8, ((j10 & 1095216660480L) >> 32) | ((j10 & 280375465082880L) >> 24) | ((j10 & 71776119061217280L) >> 16) | ((j10 & (-72057594037927936L)) >> 8));
        long j12 = i11;
        unsafe.putLong(cArr, j11 + 16, ((j12 & 4278190080L) << 24) | (j12 & 255) | ((j12 & 65280) << 8) | ((j12 & 16711680) << 16));
    }

    public static void putLong(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = HEX256;
        long jReverseBytes = (((long) iArr[i12 & 255]) << 32) | ((long) iArr[i11 & 255]);
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1);
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes << 8);
        }
        unsafe.putLong(cArr, j10, jReverseBytes);
    }

    public final void writeStringEscape(byte[] bArr) {
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        int length = (bArr.length * 6) + i10 + 2;
        if (length >= cArrGrow.length) {
            cArrGrow = grow(length);
        }
        char[] cArr = cArrGrow;
        char c10 = this.quote;
        cArr[i10] = c10;
        this.off = StringUtils.writeLatin1EscapedRest(cArr, i10 + 1, bArr, 0, c10, this.context.features);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(String[] strArr) {
        if (this.pretty == 0 && strArr != null) {
            int i10 = this.off;
            if (i10 == this.chars.length) {
                grow(i10 + 1);
            }
            char[] cArr = this.chars;
            int i11 = this.off;
            this.off = i11 + 1;
            cArr[i11] = '[';
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (i12 != 0) {
                    int i13 = this.off;
                    if (i13 == this.chars.length) {
                        grow(i13 + 1);
                    }
                    char[] cArr2 = this.chars;
                    int i14 = this.off;
                    this.off = i14 + 1;
                    cArr2[i14] = ',';
                }
                writeString(strArr[i12]);
            }
            int i15 = this.off;
            if (i15 == this.chars.length) {
                grow(i15 + 1);
            }
            char[] cArr3 = this.chars;
            int i16 = this.off;
            this.off = i16 + 1;
            cArr3[i16] = ']';
            return;
        }
        super.writeString(strArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(boolean z10) {
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = this.quote;
        writeBool(z10);
        char[] cArr2 = this.chars;
        int i11 = this.off;
        this.off = i11 + 1;
        cArr2[i11] = this.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(byte b10) {
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z10) {
            writeQuote();
        }
        writeInt8(b10);
        if (z10) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(short s10) {
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z10) {
            writeQuote();
        }
        writeInt16(s10);
        if (z10) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(int i10) {
        boolean z10 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z10) {
            writeQuote();
        }
        writeInt32(i10);
        if (z10) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(long j10) {
        boolean z10 = (this.context.features & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) == 0;
        if (z10) {
            writeQuote();
        }
        writeInt64(j10);
        if (z10) {
            writeQuote();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeString(char[] r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            if (r1 != 0) goto La
            r0.writeStringNull()
            return
        La:
            com.alibaba.fastjson2.JSONWriter$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r4 = r4.mask
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r6 = r6.mask
            long r4 = r4 | r6
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L22
            r19.writeStringBrowserSecure(r20)
            return
        L22:
            int r2 = r0.off
            int r3 = r1.length
            int r3 = r3 + r2
            int r3 = r3 + 2
            char[] r6 = r0.chars
            int r6 = r6.length
            if (r3 < r6) goto L30
            r0.grow(r3)
        L30:
            long r6 = r0.byteVectorQuote
            char[] r3 = r0.chars
            int r8 = r2 + 1
            char r9 = r0.quote
            r3[r2] = r9
            int r2 = r1.length
            r9 = 0
        L3c:
            if (r9 >= r2) goto L91
            int r10 = r9 + 8
            if (r10 >= r2) goto L73
            long r11 = com.alibaba.fastjson2.util.IOUtils.getLongLE(r1, r9)
            int r13 = r9 + 4
            long r13 = com.alibaba.fastjson2.util.IOUtils.getLongLE(r1, r13)
            long r15 = r11 | r13
            r17 = -71777214294589696(0xff00ff00ff00ff00, double:-5.82767264895205E303)
            long r15 = r15 & r17
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 != 0) goto L73
            r15 = 8
            long r15 = r11 << r15
            long r4 = r15 | r13
            boolean r4 = com.alibaba.fastjson2.util.StringUtils.noneEscaped(r4, r6)
            if (r4 == 0) goto L73
            com.alibaba.fastjson2.util.IOUtils.putLongLE(r3, r8, r11)
            int r4 = r8 + 4
            com.alibaba.fastjson2.util.IOUtils.putLongLE(r3, r4, r13)
            int r8 = r8 + 8
            r9 = r10
        L70:
            r4 = 0
            goto L3c
        L73:
            int r4 = r9 + 1
            char r5 = com.alibaba.fastjson2.util.IOUtils.getChar(r1, r9)
            r9 = 92
            if (r5 == r9) goto L8d
            char r9 = r0.quote
            if (r5 == r9) goto L8d
            r9 = 32
            if (r5 >= r9) goto L86
            goto L8d
        L86:
            int r9 = r8 + 1
            r3[r8] = r5
            r8 = r9
            r9 = r4
            goto L70
        L8d:
            r19.writeStringEscape(r20)
            return
        L91:
            char r1 = r0.quote
            r3[r8] = r1
            int r8 = r8 + 1
            r0.off = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriterUTF16.writeString(char[]):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            writeStringNull();
            return;
        }
        boolean z10 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        for (int i12 = i10; i12 < i11; i12++) {
            char c10 = cArr[i12];
            if (c10 == '\\' || c10 == this.quote || c10 < ' ') {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            int i13 = this.off;
            int i14 = i13 + i11 + 2;
            char[] cArrGrow = this.chars;
            if (i14 > cArrGrow.length) {
                cArrGrow = grow(i14);
            }
            int i15 = i13 + 1;
            cArrGrow[i13] = this.quote;
            System.arraycopy(cArr, i10, cArrGrow, i15, i11);
            int i16 = i15 + i11;
            cArrGrow[i16] = this.quote;
            this.off = i16 + 1;
            return;
        }
        writeStringEscape(new String(cArr, i10, i11));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write(Map<?, ?> map) {
        if (this.pretty != 0) {
            super.write(map);
            return;
        }
        if (map == null) {
            writeNull();
            return;
        }
        JSONWriter.Context context = this.context;
        if ((context.features & JSONWriter.NONE_DIRECT_FEATURES) != 0) {
            context.getObjectWriter(map.getClass()).write(this, map, null, null, 0L);
            return;
        }
        writeRaw('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (this.context.features & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                if (!z10) {
                    writeRaw(',');
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    writeString((String) key);
                } else {
                    writeAny(key);
                }
                writeRaw(':');
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
        writeRaw('}');
    }
}
