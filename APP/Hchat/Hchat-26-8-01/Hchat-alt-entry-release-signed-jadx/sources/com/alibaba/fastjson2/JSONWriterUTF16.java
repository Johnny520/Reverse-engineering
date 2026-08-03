package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.DoubleToDecimal;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
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
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p222p.AbstractC3199a;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF16 extends JSONWriter {
    final JSONFactory.CacheItem cacheItem;
    protected char[] chars;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONWriterUTF16(JSONWriter.Context context) {
        super(context, null, false, StandardCharsets.UTF_16);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r0.length - 1)];
        this.cacheItem = cacheItem;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        this.chars = andSet == null ? new char[8192] : andSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private char[] grow(int i9) {
        grow0(i9);
        return this.chars;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void grow0(int i9) {
        char[] cArr = this.chars;
        this.chars = Arrays.copyOf(cArr, newCapacity(i9, cArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int indent(char[] cArr, int i9) {
        cArr[i9] = '\n';
        int i10 = i9 + 1;
        byte b10 = this.pretty;
        int i11 = (this.level * b10) + i10;
        Arrays.fill(cArr, i10, i11, b10 == 1 ? '\t' : ' ');
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void putIntUnaligned(char[] cArr, int i9, int i10) {
        JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i9) << 1), i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void putLong(char[] cArr, int i9, long j3, long j4) {
        long j5 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1));
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j5, (j3 & 255) | ((j3 & 65280) << 8) | ((j3 & 16711680) << 16) | ((j3 & 4278190080L) << 24));
        unsafe.putLong(cArr, j5 + 8, ((j3 & 1095216660480L) >> 32) | ((j3 & 280375465082880L) >> 24) | ((j3 & 71776119061217280L) >> 16) | ((j3 & (-72057594037927936L)) >> 8));
        unsafe.putLong(cArr, j5 + 16, (j4 & 255) | ((j4 & 65280) << 8) | ((j4 & 16711680) << 16) | ((j4 & 4278190080L) << 24));
        unsafe.putLong(cArr, j5 + 24, ((j4 & 1095216660480L) >> 32) | ((j4 & 280375465082880L) >> 24) | ((j4 & 71776119061217280L) >> 16) | ((j4 & (-72057594037927936L)) >> 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void writeQuote() {
        int i9 = this.off;
        if (i9 == this.chars.length) {
            ensureCapacity(i9 + 1);
        }
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.chars;
        if (cArr.length > 1048576) {
            return;
        }
        JSONFactory.CHARS_UPDATER.lazySet(this.cacheItem, cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void endArray() {
        int i9 = this.level - 1;
        this.level = i9;
        int iIndent = this.off;
        int i10 = iIndent + 1;
        byte b10 = this.pretty;
        int i11 = i10 + (b10 == 0 ? 0 : (b10 * i9) + 1);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        cArrGrow[iIndent] = ']';
        this.off = iIndent + 1;
        this.startObject = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void endObject() {
        int i9 = this.level - 1;
        this.level = i9;
        int iIndent = this.off;
        int i10 = iIndent + 1;
        byte b10 = this.pretty;
        int i11 = i10 + (b10 == 0 ? 0 : (b10 * i9) + 1);
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        cArrGrow[iIndent] = '}';
        this.off = iIndent + 1;
        this.startObject = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void ensureCapacity(int i9) {
        if (i9 > this.chars.length) {
            grow0(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            C0086a.m464w("out is nulll");
            return 0;
        }
        int i9 = 0;
        while (true) {
            int i10 = this.off;
            if (i9 >= i10) {
                byte[] bArr = new byte[i10];
                for (int i11 = 0; i11 < this.off; i11++) {
                    bArr[i11] = (byte) this.chars[i11];
                }
                outputStream.write(bArr);
                this.off = 0;
                return i10;
            }
            char[] cArr = this.chars;
            if (cArr[i9] >= 128) {
                byte[] bArr2 = new byte[i10 * 3];
                int iEncodeUTF8 = IOUtils.encodeUTF8(cArr, 0, i10, bArr2, 0);
                outputStream.write(bArr2, 0, iEncodeUTF8);
                this.off = 0;
                return iEncodeUTF8;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes(Charset charset) {
        int i9;
        int i10 = 0;
        while (true) {
            i9 = this.off;
            if (i10 < i9) {
                if (this.chars[i10] >= 128) {
                    break;
                }
                i10++;
            } else if (charset == StandardCharsets.UTF_8 || charset == StandardCharsets.ISO_8859_1 || charset == StandardCharsets.US_ASCII) {
                byte[] bArr = new byte[i9];
                for (int i11 = 0; i11 < this.off; i11++) {
                    bArr[i11] = (byte) this.chars[i11];
                }
                return bArr;
            }
        }
        String str = new String(this.chars, 0, i9);
        if (charset == null) {
            charset = StandardCharsets.UTF_8;
        }
        return str.getBytes(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public int size() {
        return this.off;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray() {
        int i9 = this.level + 1;
        this.level = i9;
        if (i9 > this.context.maxLevel) {
            overflowLevel();
        }
        int i10 = this.off;
        int i11 = (this.pretty * this.level) + i10 + 3;
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        int iIndent = i10 + 1;
        cArrGrow[i10] = '[';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void startObject() {
        int i9 = this.level + 1;
        this.level = i9;
        if (i9 > this.context.maxLevel) {
            overflowLevel();
        }
        this.startObject = true;
        int i10 = this.off;
        char[] cArrGrow = this.chars;
        int i11 = (this.pretty * this.level) + i10 + 3;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        int iIndent = i10 + 1;
        cArrGrow[i10] = '{';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return new String(this.chars, 0, this.off);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(List list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        long j3 = JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask;
        JSONWriter.Context context = this.context;
        if ((j3 & context.features) != 0) {
            context.getObjectWriter(list.getClass()).write(this, list, null, null, 0L);
            return;
        }
        int i9 = this.off;
        if (i9 == this.chars.length) {
            ensureCapacity(i9 + 1);
        }
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = '[';
        int size = list.size();
        boolean z9 = true;
        int i11 = 0;
        while (i11 < size) {
            if (!z9) {
                int i12 = this.off;
                if (i12 == this.chars.length) {
                    ensureCapacity(i12 + 1);
                }
                char[] cArr2 = this.chars;
                int i13 = this.off;
                this.off = i13 + 1;
                cArr2[i13] = ',';
            }
            Object obj = list.get(i11);
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
            i11++;
            z9 = false;
        }
        int i14 = this.off;
        if (i14 == this.chars.length) {
            ensureCapacity(i14 + 1);
        }
        char[] cArr3 = this.chars;
        int i15 = this.off;
        this.off = i15 + 1;
        cArr3[i15] = ']';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void write0(char c10) {
        int i9 = this.off;
        if (i9 == this.chars.length) {
            ensureCapacity(i9 + 1);
        }
        this.chars[i9] = c10;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBase64(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        int i9 = this.off;
        ensureCapacity(((((bArr.length - 1) / 3) + 1) << 2) + i9 + 2);
        char[] cArr = this.chars;
        int i10 = i9 + 1;
        cArr[i9] = this.quote;
        int length = (bArr.length / 3) * 3;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i14 = i13 | (bArr[i12] & 255);
            char[] cArr2 = JSONFactory.f1928CA;
            cArr[i10] = cArr2[(i14 >>> 18) & 63];
            cArr[i10 + 1] = cArr2[(i14 >>> 12) & 63];
            cArr[i10 + 2] = cArr2[(i14 >>> 6) & 63];
            cArr[i10 + 3] = cArr2[i14 & 63];
            i10 += 4;
        }
        int length2 = bArr.length - length;
        if (length2 > 0) {
            int i15 = ((bArr[length] & 255) << 10) | (length2 == 2 ? (bArr[bArr.length - 1] & 255) << 2 : 0);
            char[] cArr3 = JSONFactory.f1928CA;
            cArr[i10] = cArr3[i15 >> 12];
            cArr[i10 + 1] = cArr3[(i15 >>> 6) & 63];
            cArr[i10 + 2] = length2 == 2 ? cArr3[i15 & 63] : '=';
            cArr[i10 + 3] = '=';
            i10 += 4;
        }
        cArr[i10] = this.quote;
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBigInt(BigInteger bigInteger, long j3) {
        int i9;
        if (bigInteger == null) {
            writeNumberNull();
            return;
        }
        String string = bigInteger.toString(10);
        long j4 = j3 | this.context.features;
        boolean z9 = true;
        boolean z10 = (JSONWriter.Feature.BrowserCompatible.mask & j4) != 0 && (bigInteger.compareTo(JSONFactory.LOW_BIGINT) < 0 || bigInteger.compareTo(JSONFactory.HIGH_BIGINT) > 0);
        boolean z11 = (j4 & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        if (!z10 && !z11) {
            z9 = false;
        }
        int length = string.length();
        ensureCapacity(this.off + length + 2);
        char[] cArr = this.chars;
        int i10 = this.off;
        if (z9) {
            int i11 = i10 + 1;
            cArr[i10] = '\"';
            string.getChars(0, length, cArr, i11);
            int i12 = i11 + length;
            i9 = i12 + 1;
            cArr[i12] = '\"';
        } else {
            string.getChars(0, length, cArr, i10);
            i9 = length + i10;
        }
        this.off = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeChar(char c10) {
        int i9;
        int i10 = this.off;
        int i11 = i10 + 8;
        if (i11 >= this.chars.length) {
            ensureCapacity(i11);
        }
        char[] cArr = this.chars;
        int i12 = i10 + 1;
        char c11 = this.quote;
        cArr[i10] = c11;
        if (c10 == '\"' || c10 == '\'') {
            if (c10 == c11) {
                cArr[i12] = '\\';
                i12 = i10 + 2;
            }
            i9 = i12 + 1;
            cArr[i12] = c10;
        } else {
            if (c10 != '\\') {
                switch (c10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'u';
                        cArr[i10 + 3] = '0';
                        cArr[i10 + 4] = '0';
                        cArr[i10 + 5] = '0';
                        cArr[i10 + 6] = (char) (c10 + '0');
                        i9 = i10 + 7;
                        break;
                    case '\b':
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'b';
                        break;
                    case '\t':
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 't';
                        break;
                    case '\n':
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'n';
                        break;
                    case 11:
                    case 14:
                    case 15:
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'u';
                        cArr[i10 + 3] = '0';
                        cArr[i10 + 4] = '0';
                        cArr[i10 + 5] = '0';
                        cArr[i10 + 6] = (char) (c10 + 'W');
                        i9 = i10 + 7;
                        break;
                    case '\f':
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'f';
                        break;
                    case '\r':
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'r';
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'u';
                        cArr[i10 + 3] = '0';
                        cArr[i10 + 4] = '0';
                        cArr[i10 + 5] = '1';
                        cArr[i10 + 6] = (char) (c10 + ' ');
                        i9 = i10 + 7;
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        cArr[i12] = '\\';
                        cArr[i10 + 2] = 'u';
                        cArr[i10 + 3] = '0';
                        cArr[i10 + 4] = '0';
                        cArr[i10 + 5] = '1';
                        cArr[i10 + 6] = (char) (c10 + 'G');
                        i9 = i10 + 7;
                        break;
                    default:
                        i9 = i10 + 2;
                        cArr[i12] = c10;
                        break;
                }
            } else {
                cArr[i12] = '\\';
                cArr[i10 + 2] = c10;
            }
            i9 = i10 + 3;
        }
        cArr[i9] = c11;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeColon() {
        int i9 = this.off;
        if (i9 == this.chars.length) {
            ensureCapacity(i9 + 1);
        }
        this.chars[i9] = ':';
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeComma() {
        this.startObject = false;
        int i9 = this.off;
        int i10 = (this.pretty * this.level) + i9 + 2;
        char[] cArrGrow = this.chars;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        int iIndent = i9 + 1;
        cArrGrow[i9] = ',';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime14(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.off;
        int i16 = i15 + 16;
        if (i16 >= this.chars.length) {
            ensureCapacity(i16);
        }
        char[] cArr = this.chars;
        char c10 = this.quote;
        cArr[i15] = c10;
        if (i9 < 0 || i9 > 9999) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i17 = i9 / 1000;
        int[] iArr = IOUtils.DIGITS_K;
        int i18 = iArr[i9 - (i17 * 1000)];
        cArr[i15 + 1] = (char) ((byte) (i17 + 48));
        cArr[i15 + 2] = (char) ((byte) (i18 >> 16));
        cArr[i15 + 3] = (char) ((byte) (i18 >> 8));
        cArr[i15 + 4] = (char) ((byte) i18);
        int i19 = iArr[i10];
        cArr[i15 + 5] = (char) ((byte) (i19 >> 8));
        cArr[i15 + 6] = (char) ((byte) i19);
        int i20 = iArr[i11];
        cArr[i15 + 7] = (char) ((byte) (i20 >> 8));
        cArr[i15 + 8] = (char) ((byte) i20);
        int i21 = iArr[i12];
        cArr[i15 + 9] = (char) ((byte) (i21 >> 8));
        cArr[i15 + 10] = (char) ((byte) i21);
        int i22 = iArr[i13];
        cArr[i15 + 11] = (char) ((byte) (i22 >> 8));
        cArr[i15 + 12] = (char) ((byte) i22);
        int i23 = iArr[i14];
        cArr[i15 + 13] = (char) ((byte) (i23 >> 8));
        cArr[i15 + 14] = (char) ((byte) i23);
        cArr[i15 + 15] = c10;
        this.off = i16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime19(int i9, int i10, int i11, int i12, int i13, int i14) {
        ensureCapacity(this.off + 21);
        char[] cArr = this.chars;
        int i15 = this.off;
        char c10 = this.quote;
        cArr[i15] = c10;
        if (i9 < 0 || i9 > 9999) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i16 = i9 / 1000;
        int[] iArr = IOUtils.DIGITS_K;
        int i17 = iArr[i9 - (i16 * 1000)];
        cArr[i15 + 1] = (char) ((byte) (i16 + 48));
        cArr[i15 + 2] = (char) ((byte) (i17 >> 16));
        cArr[i15 + 3] = (char) ((byte) (i17 >> 8));
        cArr[i15 + 4] = (char) ((byte) i17);
        cArr[i15 + 5] = '-';
        int i18 = iArr[i10];
        cArr[i15 + 6] = (char) ((byte) (i18 >> 8));
        cArr[i15 + 7] = (char) ((byte) i18);
        cArr[i15 + 8] = '-';
        int i19 = iArr[i11];
        cArr[i15 + 9] = (char) ((byte) (i19 >> 8));
        cArr[i15 + 10] = (char) ((byte) i19);
        cArr[i15 + 11] = ' ';
        int i20 = iArr[i12];
        cArr[i15 + 12] = (char) ((byte) (i20 >> 8));
        cArr[i15 + 13] = (char) ((byte) i20);
        cArr[i15 + 14] = ':';
        int i21 = iArr[i13];
        cArr[i15 + 15] = (char) ((byte) (i21 >> 8));
        cArr[i15 + 16] = (char) ((byte) i21);
        cArr[i15 + 17] = ':';
        int i22 = iArr[i14];
        cArr[i15 + 18] = (char) ((byte) (i22 >> 8));
        cArr[i15 + 19] = (char) ((byte) i22);
        cArr[i15 + 20] = (char) ((byte) c10);
        this.off = i15 + 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTimeISO8601(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        int i17 = z9 ? i16 == 0 ? 1 : 6 : 0;
        int i18 = this.off;
        int i19 = i18 + 25 + i17;
        if (i18 + i19 >= this.chars.length) {
            ensureCapacity(i19);
        }
        char[] cArr = this.chars;
        cArr[i18] = this.quote;
        int iWriteInt32 = IOUtils.writeInt32(cArr, i18 + 1, i9);
        cArr[iWriteInt32] = '-';
        int[] iArr = IOUtils.DIGITS_K;
        int i20 = iArr[i10];
        cArr[iWriteInt32 + 1] = (char) ((byte) (i20 >> 8));
        cArr[iWriteInt32 + 2] = (char) ((byte) i20);
        cArr[iWriteInt32 + 3] = '-';
        int i21 = iArr[i11];
        cArr[iWriteInt32 + 4] = (char) ((byte) (i21 >> 8));
        cArr[iWriteInt32 + 5] = (char) ((byte) i21);
        cArr[iWriteInt32 + 6] = (char) ((byte) (z9 ? 84 : 32));
        int i22 = iArr[i12];
        cArr[iWriteInt32 + 7] = (char) ((byte) (i22 >> 8));
        cArr[iWriteInt32 + 8] = (char) ((byte) i22);
        cArr[iWriteInt32 + 9] = ':';
        int i23 = iArr[i13];
        cArr[iWriteInt32 + 10] = (char) ((byte) (i23 >> 8));
        cArr[iWriteInt32 + 11] = (char) ((byte) i23);
        cArr[iWriteInt32 + 12] = ':';
        int i24 = iArr[i14];
        cArr[iWriteInt32 + 13] = (char) ((byte) (i24 >> 8));
        cArr[iWriteInt32 + 14] = (char) ((byte) i24);
        int i25 = iWriteInt32 + 15;
        if (i15 > 0) {
            int i26 = iWriteInt32 + 16;
            cArr[i25] = '.';
            int i27 = i15 / 10;
            int i28 = i27 / 10;
            if (i15 - (i27 * 10) != 0) {
                int i29 = iArr[i15];
                cArr[i26] = (char) ((byte) (i29 >> 16));
                cArr[iWriteInt32 + 17] = (char) ((byte) (i29 >> 8));
                cArr[iWriteInt32 + 18] = (char) ((byte) i29);
                i25 = iWriteInt32 + 19;
            } else if (i27 - (i28 * 10) != 0) {
                int i30 = iArr[i27];
                cArr[i26] = (char) ((byte) (i30 >> 8));
                cArr[iWriteInt32 + 17] = (char) ((byte) i30);
                i25 = iWriteInt32 + 18;
            } else {
                i25 = iWriteInt32 + 17;
                cArr[i26] = (char) ((byte) (i28 + 48));
            }
        }
        if (z9) {
            int i31 = i16 / 3600;
            if (i16 == 0) {
                cArr[i25] = 'Z';
                i25++;
            } else {
                int iAbs = Math.abs(i31);
                cArr[i25] = i31 >= 0 ? '+' : '-';
                int i32 = iArr[iAbs];
                cArr[i25 + 1] = (char) ((byte) (i32 >> 8));
                cArr[i25 + 2] = (char) ((byte) i32);
                cArr[i25 + 3] = ':';
                int i33 = (i16 - (i31 * 3600)) / 60;
                if (i33 < 0) {
                    i33 = -i33;
                }
                int i34 = iArr[i33];
                cArr[i25 + 4] = (char) ((byte) (i34 >> 8));
                cArr[i25 + 5] = (char) ((byte) i34);
                i25 += 6;
            }
        }
        cArr[i25] = this.quote;
        this.off = i25 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD10(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 13;
        if (i13 >= this.chars.length) {
            ensureCapacity(i13);
        }
        char[] cArr = this.chars;
        cArr[i12] = this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i12 + 1, i9, i10, i11);
        cArr[iWriteLocalDate] = this.quote;
        this.off = iWriteLocalDate + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD8(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 10;
        if (i13 >= this.chars.length) {
            ensureCapacity(i13);
        }
        char[] cArr = this.chars;
        char c10 = this.quote;
        cArr[i12] = c10;
        if (i9 < 0 || i9 > 9999) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i14 = i9 / 1000;
        int[] iArr = IOUtils.DIGITS_K;
        int i15 = iArr[i9 - (i14 * 1000)];
        cArr[i12 + 1] = (char) ((byte) (i14 + 48));
        cArr[i12 + 2] = (char) ((byte) (i15 >> 16));
        cArr[i12 + 3] = (char) ((byte) (i15 >> 8));
        cArr[i12 + 4] = (char) ((byte) i15);
        int i16 = iArr[i10];
        cArr[i12 + 5] = (char) ((byte) (i16 >> 8));
        cArr[i12 + 6] = (char) ((byte) i16);
        int i17 = iArr[i11];
        cArr[i12 + 7] = (char) ((byte) (i17 >> 8));
        cArr[i12 + 8] = (char) ((byte) i17);
        cArr[i12 + 9] = c10;
        this.off = i13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDecimal(BigDecimal bigDecimal, long j3, DecimalFormat decimalFormat) {
        if (bigDecimal == null) {
            writeDecimalNull();
            return;
        }
        if (decimalFormat != null) {
            writeRaw(decimalFormat.format(bigDecimal));
            return;
        }
        long j4 = j3 | this.context.features;
        int iPrecision = bigDecimal.precision();
        boolean z9 = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j4) != 0 || ((JSONWriter.Feature.BrowserCompatible.mask & j4) != 0 && iPrecision >= 16 && (bigDecimal.compareTo(JSONFactory.LOW) < 0 || bigDecimal.compareTo(JSONFactory.HIGH) > 0));
        int i9 = this.off;
        int iAbs = Math.abs(bigDecimal.scale()) + iPrecision + i9 + 7;
        if (iAbs >= this.chars.length) {
            ensureCapacity(iAbs);
        }
        char[] cArr = this.chars;
        if (z9) {
            cArr[i9] = '\"';
            i9++;
        }
        String plainString = (j4 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) != 0 ? bigDecimal.toPlainString() : bigDecimal.toString();
        plainString.getChars(0, plainString.length(), cArr, i9);
        int length = plainString.length() + i9;
        if (z9) {
            cArr[length] = '\"';
            length++;
        }
        this.off = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double[] dArr) {
        if (dArr == null) {
            writeNull();
            return;
        }
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int iM6834g = AbstractC3199a.m6834g(dArr.length, 27, i9, 1);
        if (iM6834g >= this.chars.length) {
            ensureCapacity(iM6834g);
        }
        char[] cArr = this.chars;
        int i10 = i9 + 1;
        cArr[i9] = '[';
        for (int i11 = 0; i11 < dArr.length; i11++) {
            if (i11 != 0) {
                cArr[i10] = ',';
                i10++;
            }
            if (z9) {
                cArr[i10] = '\"';
                i10++;
            }
            int string = DoubleToDecimal.toString(dArr[i11], cArr, i10, true) + i10;
            if (z9) {
                i10 = string + 1;
                cArr[string] = '\"';
            } else {
                i10 = string;
            }
        }
        cArr[i10] = ']';
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDoubleArray(double d10, double d11) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 51;
        if (z9) {
            i10 = i9 + 53;
        }
        ensureCapacity(i10);
        char[] cArr = this.chars;
        int i11 = i9 + 1;
        cArr[i9] = '[';
        if (z9) {
            cArr[i11] = '\"';
            i11 = i9 + 2;
        }
        int string = DoubleToDecimal.toString(d10, cArr, i11, true) + i11;
        if (z9) {
            cArr[string] = '\"';
            string++;
        }
        int i12 = string + 1;
        cArr[string] = ',';
        if (z9) {
            cArr[i12] = '\"';
            i12 = string + 2;
        }
        int string2 = DoubleToDecimal.toString(d11, cArr, i12, true) + i12;
        if (z9) {
            cArr[string2] = '\"';
            string2++;
        }
        cArr[string2] = ']';
        this.off = string2 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int iM6834g = AbstractC3199a.m6834g(fArr.length, z9 ? 16 : 18, i9, 1);
        if (iM6834g >= this.chars.length) {
            ensureCapacity(iM6834g);
        }
        char[] cArr = this.chars;
        int i10 = i9 + 1;
        cArr[i9] = '[';
        for (int i11 = 0; i11 < fArr.length; i11++) {
            if (i11 != 0) {
                cArr[i10] = ',';
                i10++;
            }
            if (z9) {
                cArr[i10] = '\"';
                i10++;
            }
            int string = DoubleToDecimal.toString(fArr[i11], cArr, i10, true) + i10;
            if (z9) {
                i10 = string + 1;
                cArr[string] = '\"';
            } else {
                i10 = string;
            }
        }
        cArr[i10] = ']';
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeHex(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        int length = (bArr.length * 2) + 3;
        int i9 = this.off;
        ensureCapacity(length + i9 + 2);
        char[] cArr = this.chars;
        cArr[i9] = 'x';
        cArr[i9 + 1] = '\'';
        int i10 = i9 + 2;
        for (byte b10 : bArr) {
            int i11 = (b10 & 255) >> 4;
            int i12 = b10 & 15;
            int i13 = 55;
            cArr[i10] = (char) (i11 + (i11 < 10 ? 48 : 55));
            int i14 = i10 + 1;
            if (i12 < 10) {
                i13 = 48;
            }
            cArr[i14] = (char) (i12 + i13);
            i10 += 2;
        }
        cArr[i10] = '\'';
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short s10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 7;
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        if (z9) {
            cArr[i9] = this.quote;
            i9++;
        }
        int iWriteInt32 = IOUtils.writeInt32(cArr, i9, s10);
        if (z9) {
            cArr[iWriteInt32] = this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int[] iArr) {
        if (iArr == null) {
            writeNull();
            return;
        }
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int iM6834g = AbstractC3199a.m6834g(iArr.length, 13, i9, 2);
        if (iM6834g >= this.chars.length) {
            ensureCapacity(iM6834g);
        }
        char[] cArr = this.chars;
        int i10 = i9 + 1;
        cArr[i9] = '[';
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i11 != 0) {
                cArr[i10] = ',';
                i10++;
            }
            if (z9) {
                cArr[i10] = this.quote;
                i10++;
            }
            int iWriteInt32 = IOUtils.writeInt32(cArr, i10, iArr[i11]);
            if (z9) {
                i10 = iWriteInt32 + 1;
                cArr[iWriteInt32] = this.quote;
            } else {
                i10 = iWriteInt32;
            }
        }
        cArr[i10] = ']';
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long[] jArr) {
        if (jArr == null) {
            writeNull();
            return;
        }
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.BrowserCompatible.mask & j3) != 0;
        boolean z10 = (j3 & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        int i9 = this.off;
        int length = (jArr.length * 23) + i9 + 2;
        if (length >= this.chars.length) {
            ensureCapacity(length);
        }
        char[] cArr = this.chars;
        int iWriteInt64 = i9 + 1;
        cArr[i9] = '[';
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 != 0) {
                cArr[iWriteInt64] = ',';
                iWriteInt64++;
            }
            long j4 = jArr[i10];
            boolean z11 = z10 || (z9 && j4 <= 9007199254740991L && j4 >= -9007199254740991L);
            if (z11) {
                cArr[iWriteInt64] = this.quote;
                iWriteInt64++;
            }
            iWriteInt64 = IOUtils.writeInt64(cArr, iWriteInt64, j4);
            if (z11) {
                cArr[iWriteInt64] = this.quote;
                iWriteInt64++;
            }
        }
        cArr[iWriteInt64] = ']';
        this.off = iWriteInt64 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt8(byte b10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 7;
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        if (z9) {
            cArr[i9] = this.quote;
            i9++;
        }
        int iWriteInt32 = IOUtils.writeInt32(cArr, i9, b10);
        if (z9) {
            cArr[iWriteInt32] = this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDate(LocalDate localDate) {
        if (localDate == null) {
            writeNull();
            return;
        }
        JSONWriter.Context context = this.context;
        if (context.dateFormat == null || !writeLocalDateWithFormat(localDate, context)) {
            int i9 = this.off;
            int i10 = i9 + 18;
            if (i10 >= this.chars.length) {
                ensureCapacity(i10);
            }
            char[] cArr = this.chars;
            cArr[i9] = this.quote;
            int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i9 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            cArr[iWriteLocalDate] = this.quote;
            this.off = iWriteLocalDate + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        int i9 = this.off;
        int i10 = i9 + 38;
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        int i11 = i9 + 1;
        cArr[i9] = this.quote;
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i11, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iWriteLocalDate] = ' ';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
        cArr[iWriteLocalTime] = this.quote;
        this.off = iWriteLocalTime + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(LocalTime localTime) {
        int i9 = this.off;
        int i10 = i9 + 20;
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        cArr[i9] = this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(cArr, i9 + 1, localTime);
        cArr[iWriteLocalTime] = this.quote;
        this.off = iWriteLocalTime + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName10Raw(long j3, long j4) {
        long j5;
        long j10;
        int i9;
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 18;
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
            if (this.pretty == 0) {
                j5 = j3;
                j10 = j4;
                i9 = i11;
                putLong(cArr, i9, j5, j10);
                this.off = i9 + 13;
            }
            iIndent = indent(cArr, i11);
        }
        j5 = j3;
        j10 = j4;
        i9 = iIndent;
        putLong(cArr, i9, j5, j10);
        this.off = i9 + 13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName11Raw(long j3, long j4) {
        long j5;
        long j10;
        int i9;
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 18;
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
            if (this.pretty == 0) {
                j5 = j3;
                j10 = j4;
                i9 = i11;
                putLong(cArr, i9, j5, j10);
                this.off = i9 + 14;
            }
            iIndent = indent(cArr, i11);
        }
        j5 = j3;
        j10 = j4;
        i9 = iIndent;
        putLong(cArr, i9, j5, j10);
        this.off = i9 + 14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName12Raw(long j3, long j4) {
        long j5;
        long j10;
        int i9;
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 18;
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
            if (this.pretty == 0) {
                j5 = j3;
                j10 = j4;
                i9 = i11;
                putLong(cArr, i9, j5, j10);
                this.off = i9 + 15;
            }
            iIndent = indent(cArr, i11);
        }
        j5 = j3;
        j10 = j4;
        i9 = iIndent;
        putLong(cArr, i9, j5, j10);
        this.off = i9 + 15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName13Raw(long j3, long j4) {
        long j5;
        long j10;
        int i9;
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 18;
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
            if (this.pretty == 0) {
                j5 = j3;
                j10 = j4;
                i9 = i11;
                putLong(cArr, i9, j5, j10);
                this.off = i9 + 16;
            }
            iIndent = indent(cArr, i11);
        }
        j5 = j3;
        j10 = j4;
        i9 = iIndent;
        putLong(cArr, i9, j5, j10);
        this.off = i9 + 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName14Raw(long j3, long j4) {
        long j5;
        long j10;
        int i9;
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 19;
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
            if (this.pretty == 0) {
                j5 = j3;
                j10 = j4;
                i9 = i11;
                putLong(cArr, i9, j5, j10);
                int i12 = i9;
                cArr[i12 + 16] = ':';
                this.off = i12 + 17;
            }
            iIndent = indent(cArr, i11);
        }
        j5 = j3;
        j10 = j4;
        i9 = iIndent;
        putLong(cArr, i9, j5, j10);
        int i122 = i9;
        cArr[i122 + 16] = ':';
        this.off = i122 + 17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName15Raw(long j3, long j4) {
        long j5;
        long j10;
        int i9;
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 20;
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
            if (this.pretty == 0) {
                j5 = j3;
                j10 = j4;
                i9 = i11;
                putLong(cArr, i9, j5, j10);
                int i12 = i9;
                cArr[i12 + 16] = this.quote;
                cArr[i12 + 17] = ':';
                this.off = i12 + 18;
            }
            iIndent = indent(cArr, i11);
        }
        j5 = j3;
        j10 = j4;
        i9 = iIndent;
        putLong(cArr, i9, j5, j10);
        int i122 = i9;
        cArr[i122 + 16] = this.quote;
        cArr[i122 + 17] = ':';
        this.off = i122 + 18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName16Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 21;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArr[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArr, i10) : i10;
        }
        cArr[iIndent] = this.quote;
        putLong(cArr, iIndent + 1, j3, j4);
        cArr[iIndent + 17] = this.quote;
        cArr[iIndent + 18] = ':';
        this.off = iIndent + 19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName2Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        putLong(cArrGrow, iIndent, j3);
        this.off = iIndent + 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName3Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        putLong(cArrGrow, iIndent, j3);
        this.off = iIndent + 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName4Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        putLong(cArrGrow, iIndent, j3);
        this.off = iIndent + 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName5Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        putLong(cArrGrow, iIndent, j3);
        this.off = iIndent + 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName6Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 11;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        putLong(cArrGrow, iIndent, j3);
        cArrGrow[iIndent + 8] = ':';
        this.off = iIndent + 9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName7Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 12;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        putLong(cArrGrow, iIndent, j3);
        cArrGrow[iIndent + 8] = this.quote;
        cArrGrow[iIndent + 9] = ':';
        this.off = iIndent + 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 13;
        char[] cArrGrow = this.chars;
        if (i9 > cArrGrow.length) {
            cArrGrow = grow(i9);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i10) : i10;
        }
        cArrGrow[iIndent] = this.quote;
        putLong(cArrGrow, iIndent + 1, j3);
        cArrGrow[iIndent + 9] = this.quote;
        cArrGrow[iIndent + 10] = ':';
        this.off = iIndent + 11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName9Raw(long j3, int i9) {
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 14;
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
        putLong(cArrGrow, iIndent, j3, i9);
        this.off = iIndent + 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] cArr) {
        int iIndent = this.off;
        int length = (this.pretty * this.level) + cArr.length + iIndent + 2;
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i9 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i9) : i9;
        }
        System.arraycopy(cArr, 0, cArrGrow, iIndent, cArr.length);
        this.off = iIndent + cArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetDateTime(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            writeNull();
            return;
        }
        ZoneOffset offset = offsetDateTime.getOffset();
        int i9 = this.off;
        int i10 = i9 + 45;
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        int i11 = i9 + 1;
        cArr[i9] = this.quote;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i11, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iWriteLocalDate] = 'T';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            cArr[iWriteLocalTime] = 'Z';
        } else {
            String id2 = offset.getId();
            id2.getChars(0, id2.length(), cArr, iWriteLocalTime);
            length = id2.length() + iWriteLocalTime;
        }
        cArr[length] = this.quote;
        this.off = length + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetTime(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            writeNull();
            return;
        }
        ZoneOffset offset = offsetTime.getOffset();
        int i9 = this.off;
        int i10 = i9 + 25;
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        cArr[i9] = this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(cArr, i9 + 1, offsetTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            cArr[iWriteLocalTime] = 'Z';
        } else {
            String id2 = offset.getId();
            id2.getChars(0, id2.length(), cArr, iWriteLocalTime);
            length = id2.length() + iWriteLocalTime;
        }
        cArr[length] = this.quote;
        this.off = length + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(String str) {
        ensureCapacity(str.length() + this.off);
        str.getChars(0, str.length(), this.chars, this.off);
        this.off = str.length() + this.off;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeReference(String str) {
        this.lastReference = str;
        int i9 = this.off;
        char[] cArrGrow = this.chars;
        int i10 = i9 + 9;
        if (i10 > cArrGrow.length) {
            cArrGrow = grow(i10);
        }
        cArrGrow[i9] = '{';
        cArrGrow[i9 + 1] = '\"';
        cArrGrow[i9 + 2] = '$';
        cArrGrow[i9 + 3] = 'r';
        cArrGrow[i9 + 4] = 'e';
        cArrGrow[i9 + 5] = 'f';
        cArrGrow[i9 + 6] = '\"';
        cArrGrow[i9 + 7] = ':';
        this.off = i9 + 8;
        writeString(str);
        int i11 = this.off;
        char[] cArrGrow2 = this.chars;
        if (i11 == cArrGrow2.length) {
            cArrGrow2 = grow(i11 + 1);
        }
        cArrGrow2[i11] = '}';
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0054. Please report as an issue. */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr, int i9, int i10, boolean z9) {
        int i11;
        boolean z10 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        char c10 = this.quote;
        int i12 = this.off;
        int i13 = (z10 ? i10 * 6 : i10 * 2) + (z9 ? i12 + 2 : i12);
        if (i13 - this.chars.length > 0) {
            ensureCapacity(i13);
        }
        char[] cArr2 = this.chars;
        if (z9) {
            cArr2[i12] = c10;
            i12++;
        }
        int iMin = Math.min(i10 + i9, cArr.length);
        while (i9 < iMin) {
            char c11 = cArr[i9];
            if (c11 == '\"' || c11 == '\'') {
                if (c11 == c10) {
                    cArr2[i12] = '\\';
                    i12++;
                }
                i11 = i12 + 1;
                cArr2[i12] = c11;
            } else {
                if (c11 != '\\') {
                    switch (c11) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'u';
                            cArr2[i12 + 2] = '0';
                            cArr2[i12 + 3] = '0';
                            cArr2[i12 + 4] = '0';
                            cArr2[i12 + 5] = (char) (c11 + '0');
                            i12 += 6;
                            break;
                        case '\b':
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'b';
                            break;
                        case '\t':
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 't';
                            break;
                        case '\n':
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'u';
                            cArr2[i12 + 2] = '0';
                            cArr2[i12 + 3] = '0';
                            cArr2[i12 + 4] = '0';
                            cArr2[i12 + 5] = (char) (c11 + 'W');
                            i12 += 6;
                            break;
                        case '\f':
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'f';
                            break;
                        case '\r':
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'r';
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'u';
                            cArr2[i12 + 2] = '0';
                            cArr2[i12 + 3] = '0';
                            cArr2[i12 + 4] = '1';
                            cArr2[i12 + 5] = (char) (c11 + ' ');
                            i12 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = 'u';
                            cArr2[i12 + 2] = '0';
                            cArr2[i12 + 3] = '0';
                            cArr2[i12 + 4] = '1';
                            cArr2[i12 + 5] = (char) (c11 + 'G');
                            i12 += 6;
                            break;
                        default:
                            if (z10 && c11 > 127) {
                                cArr2[i12] = '\\';
                                cArr2[i12 + 1] = 'u';
                                char[] cArr3 = JSONWriter.DIGITS;
                                cArr2[i12 + 2] = cArr3[(c11 >>> '\f') & 15];
                                cArr2[i12 + 3] = cArr3[(c11 >>> '\b') & 15];
                                cArr2[i12 + 4] = cArr3[(c11 >>> 4) & 15];
                                cArr2[i12 + 5] = cArr3[c11 & 15];
                                i12 += 6;
                            } else {
                                i11 = i12 + 1;
                                cArr2[i12] = c11;
                            }
                            break;
                    }
                    i9++;
                } else {
                    cArr2[i12] = '\\';
                    cArr2[i12 + 1] = c11;
                }
                i12 += 2;
                i9++;
            }
            i12 = i11;
            i9++;
        }
        if (z9) {
            cArr2[i12] = c10;
            i12++;
        }
        this.off = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0053. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeStringEscape(String str) {
        int i9;
        int length = str.length();
        char c10 = this.quote;
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.EscapeNoneAscii.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i10 = this.off;
        ensureCapacity(AbstractC3199a.m6834g(length, 6, i10, 2));
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = c10;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\"') {
                if (cCharAt == c10) {
                    cArr[i11] = '\\';
                    i11++;
                }
                i9 = i11 + 1;
                cArr[i11] = cCharAt;
                i11 = i9;
            } else if (cCharAt != '<' && cCharAt != '>') {
                if (cCharAt != '\\') {
                    switch (cCharAt) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '0';
                            cArr[i11 + 5] = (char) (cCharAt + '0');
                            i11 += 6;
                            break;
                        case '\b':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'b';
                            break;
                        case '\t':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 't';
                            break;
                        case '\n':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '0';
                            cArr[i11 + 5] = (char) (cCharAt + 'W');
                            i11 += 6;
                            break;
                        case '\f':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'f';
                            break;
                        case '\r':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'r';
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '1';
                            cArr[i11 + 5] = (char) (cCharAt + ' ');
                            i11 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '1';
                            cArr[i11 + 5] = (char) (cCharAt + 'G');
                            i11 += 6;
                            break;
                        default:
                            switch (cCharAt) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (!z9 || cCharAt <= 127) {
                                        i9 = i11 + 1;
                                        cArr[i11] = cCharAt;
                                        i11 = i9;
                                    } else {
                                        cArr[i11] = '\\';
                                        cArr[i11 + 1] = 'u';
                                        char[] cArr2 = JSONWriter.DIGITS;
                                        cArr[i11 + 2] = cArr2[(cCharAt >>> '\f') & 15];
                                        cArr[i11 + 3] = cArr2[(cCharAt >>> '\b') & 15];
                                        cArr[i11 + 4] = cArr2[(cCharAt >>> 4) & 15];
                                        cArr[i11 + 5] = cArr2[cCharAt & 15];
                                        i11 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    cArr[i11] = '\\';
                    cArr[i11 + 1] = cCharAt;
                }
                i11 += 2;
            } else if (z10) {
                cArr[i11] = '\\';
                cArr[i11 + 1] = 'u';
                cArr[i11 + 2] = '0';
                cArr[i11 + 3] = '0';
                char[] cArr3 = JSONWriter.DIGITS;
                cArr[i11 + 4] = cArr3[(cCharAt >>> 4) & 15];
                cArr[i11 + 5] = cArr3[cCharAt & 15];
                i11 += 6;
            } else {
                i9 = i11 + 1;
                cArr[i11] = cCharAt;
                i11 = i9;
            }
        }
        cArr[i11] = c10;
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x005a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeStringEscapeUTF16(byte[] bArr) {
        int i9;
        int length = bArr.length;
        char c10 = this.quote;
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.EscapeNoneAscii.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i10 = this.off;
        ensureCapacity(AbstractC3199a.m6834g(length, 6, i10, 2));
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = c10;
        for (int i12 = 0; i12 < length; i12 += 2) {
            char c11 = JDKUtils.UNSAFE.getChar(bArr, ((long) Unsafe.ARRAY_CHAR_BASE_OFFSET) + ((long) i12));
            if (c11 == '\"') {
                if (c11 == c10) {
                    cArr[i11] = '\\';
                    i11++;
                }
                i9 = i11 + 1;
                cArr[i11] = c11;
                i11 = i9;
            } else if (c11 != '<' && c11 != '>') {
                if (c11 != '\\') {
                    switch (c11) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '0';
                            cArr[i11 + 5] = (char) (c11 + '0');
                            i11 += 6;
                            break;
                        case '\b':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'b';
                            break;
                        case '\t':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 't';
                            break;
                        case '\n':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '0';
                            cArr[i11 + 5] = (char) (c11 + 'W');
                            i11 += 6;
                            break;
                        case '\f':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'f';
                            break;
                        case '\r':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'r';
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '1';
                            cArr[i11 + 5] = (char) (c11 + ' ');
                            i11 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '1';
                            cArr[i11 + 5] = (char) (c11 + 'G');
                            i11 += 6;
                            break;
                        default:
                            switch (c11) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (!z9 || c11 <= 127) {
                                        i9 = i11 + 1;
                                        cArr[i11] = c11;
                                        i11 = i9;
                                    } else {
                                        cArr[i11] = '\\';
                                        cArr[i11 + 1] = 'u';
                                        char[] cArr2 = JSONWriter.DIGITS;
                                        cArr[i11 + 2] = cArr2[(c11 >>> '\f') & 15];
                                        cArr[i11 + 3] = cArr2[(c11 >>> '\b') & 15];
                                        cArr[i11 + 4] = cArr2[(c11 >>> 4) & 15];
                                        cArr[i11 + 5] = cArr2[c11 & 15];
                                        i11 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    cArr[i11] = '\\';
                    cArr[i11 + 1] = c11;
                }
                i11 += 2;
            } else if (z10) {
                cArr[i11] = '\\';
                cArr[i11 + 1] = 'u';
                cArr[i11 + 2] = '0';
                cArr[i11 + 3] = '0';
                char[] cArr3 = JSONWriter.DIGITS;
                cArr[i11 + 4] = cArr3[(c11 >>> 4) & 15];
                cArr[i11 + 5] = cArr3[c11 & 15];
                i11 += 6;
            } else {
                i9 = i11 + 1;
                cArr[i11] = c11;
                i11 = i9;
            }
        }
        cArr[i11] = c10;
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] bArr) {
        if (bArr == null) {
            writeStringNull();
            return;
        }
        int i9 = 0;
        boolean z9 = (this.context.features & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i10 = this.off;
        int length = bArr.length + i10 + 2;
        if (length >= this.chars.length) {
            ensureCapacity(length);
        }
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = this.quote;
        while (i9 < bArr.length) {
            byte b10 = bArr[i9];
            if (b10 == 92 || b10 == this.quote || b10 < 32 || (z9 && (b10 == 60 || b10 == 62 || b10 == 40 || b10 == 41))) {
                this.off = i10;
                writeStringEscape(bArr);
                return;
            } else {
                cArr[i11] = (char) b10;
                i9++;
                i11++;
            }
        }
        cArr[i11] = this.quote;
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] bArr) {
        if (bArr == null) {
            writeStringNull();
            return;
        }
        long j3 = this.context.features;
        int i9 = 0;
        boolean z9 = (JSONWriter.Feature.BrowserSecure.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i10 = this.off;
        int length = bArr.length + i10 + 2;
        if (length >= this.chars.length) {
            ensureCapacity(length);
        }
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = this.quote;
        while (i9 < bArr.length) {
            char c10 = JDKUtils.UNSAFE.getChar(bArr, ((long) Unsafe.ARRAY_BYTE_BASE_OFFSET) + ((long) i9));
            if (c10 == '\\' || c10 == this.quote || c10 < ' ' || ((z9 && (c10 == '<' || c10 == '>' || c10 == '(' || c10 == ')')) || (z10 && c10 > 127))) {
                writeStringEscapeUTF16(bArr);
                return;
            } else {
                cArr[i11] = c10;
                i9 += 2;
                i11++;
            }
        }
        cArr[i11] = this.quote;
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTimeHHMMSS8(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 10;
        if (i13 >= this.chars.length) {
            ensureCapacity(i13);
        }
        char[] cArr = this.chars;
        char c10 = this.quote;
        cArr[i12] = (char) ((byte) c10);
        int[] iArr = IOUtils.DIGITS_K;
        int i14 = iArr[i9];
        cArr[i12 + 1] = (char) ((byte) (i14 >> 8));
        cArr[i12 + 2] = (char) ((byte) i14);
        cArr[i12 + 3] = ':';
        int i15 = iArr[i10];
        cArr[i12 + 4] = (char) ((byte) (i15 >> 8));
        cArr[i12 + 5] = (char) ((byte) i15);
        cArr[i12 + 6] = ':';
        int i16 = iArr[i11];
        cArr[i12 + 7] = (char) ((byte) (i16 >> 8));
        cArr[i12 + 8] = (char) ((byte) i16);
        cArr[i12 + 9] = (char) ((byte) c10);
        this.off = i13;
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
        int i9 = this.off + 38;
        if (i9 >= this.chars.length) {
            ensureCapacity(i9);
        }
        char[] cArr = JSONFactory.UUID_LOOKUP;
        char[] cArr2 = this.chars;
        int i10 = this.off;
        cArr2[i10] = '\"';
        char c10 = cArr[((int) (mostSignificantBits >> 56)) & 255];
        char c11 = cArr[((int) (mostSignificantBits >> 48)) & 255];
        char c12 = cArr[((int) (mostSignificantBits >> 40)) & 255];
        char c13 = cArr[((int) (mostSignificantBits >> 32)) & 255];
        int i11 = (int) mostSignificantBits;
        char c14 = cArr[(i11 >> 24) & 255];
        char c15 = cArr[(i11 >> 16) & 255];
        char c16 = cArr[(i11 >> 8) & 255];
        char c17 = cArr[i11 & 255];
        char c18 = cArr[((int) (leastSignificantBits >> 56)) & 255];
        char c19 = cArr[((int) (leastSignificantBits >> 48)) & 255];
        char c20 = cArr[((int) (leastSignificantBits >> 40)) & 255];
        char c21 = cArr[((int) (leastSignificantBits >> 32)) & 255];
        int i12 = (int) leastSignificantBits;
        char c22 = cArr[(i12 >> 24) & 255];
        char c23 = cArr[(i12 >> 16) & 255];
        char c24 = cArr[(i12 >> 8) & 255];
        char c25 = cArr[i12 & 255];
        cArr2[i10 + 1] = (char) ((byte) (c10 >> '\b'));
        cArr2[i10 + 2] = (char) ((byte) c10);
        cArr2[i10 + 3] = (char) ((byte) (c11 >> '\b'));
        cArr2[i10 + 4] = (char) ((byte) c11);
        cArr2[i10 + 5] = (char) ((byte) (c12 >> '\b'));
        cArr2[i10 + 6] = (char) ((byte) c12);
        cArr2[i10 + 7] = (char) ((byte) (c13 >> '\b'));
        cArr2[i10 + 8] = (char) ((byte) c13);
        cArr2[i10 + 9] = '-';
        cArr2[i10 + 10] = (char) ((byte) (c14 >> '\b'));
        cArr2[i10 + 11] = (char) ((byte) c14);
        cArr2[i10 + 12] = (char) ((byte) (c15 >> '\b'));
        cArr2[i10 + 13] = (char) ((byte) c15);
        cArr2[i10 + 14] = '-';
        cArr2[i10 + 15] = (char) ((byte) (c16 >> '\b'));
        cArr2[i10 + 16] = (char) ((byte) c16);
        cArr2[i10 + 17] = (char) ((byte) (c17 >> '\b'));
        cArr2[i10 + 18] = (char) ((byte) c17);
        cArr2[i10 + 19] = '-';
        cArr2[i10 + 20] = (char) ((byte) (c18 >> '\b'));
        cArr2[i10 + 21] = (char) ((byte) c18);
        cArr2[i10 + 22] = (char) ((byte) (c19 >> '\b'));
        cArr2[i10 + 23] = (char) ((byte) c19);
        cArr2[i10 + 24] = '-';
        cArr2[i10 + 25] = (char) ((byte) (c20 >> '\b'));
        cArr2[i10 + 26] = (char) ((byte) c20);
        cArr2[i10 + 27] = (char) ((byte) (c21 >> '\b'));
        cArr2[i10 + 28] = (char) ((byte) c21);
        cArr2[i10 + 29] = (char) ((byte) (c22 >> '\b'));
        cArr2[i10 + 30] = (char) ((byte) c22);
        cArr2[i10 + 31] = (char) ((byte) (c23 >> '\b'));
        cArr2[i10 + 32] = (char) ((byte) c23);
        cArr2[i10 + 33] = (char) ((byte) (c24 >> '\b'));
        cArr2[i10 + 34] = (char) ((byte) c24);
        cArr2[i10 + 35] = (char) ((byte) (c25 >> '\b'));
        cArr2[i10 + 36] = (char) ((byte) c25);
        cArr2[i10 + 37] = '\"';
        this.off = i10 + 38;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeZonedDateTime(ZonedDateTime zonedDateTime) {
        char cCharAt;
        int i9;
        int i10;
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
            i9 = 1;
        } else {
            if (length != 0) {
                cCharAt = id2.charAt(0);
                if (cCharAt == '+' || cCharAt == '-') {
                    i9 = length;
                }
            } else {
                cCharAt = 0;
            }
            i9 = length + 2;
        }
        int i11 = this.off;
        int i12 = i11 + i9 + 38;
        if (i12 >= this.chars.length) {
            ensureCapacity(i12);
        }
        char[] cArr = this.chars;
        int i13 = i11 + 1;
        cArr[i11] = this.quote;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i13, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[iWriteLocalDate] = 'T';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, zonedDateTime.toLocalTime());
        if (i9 == 1) {
            i10 = iWriteLocalTime + 1;
            cArr[iWriteLocalTime] = 'Z';
        } else if (cCharAt == '+' || cCharAt == '-') {
            id2.getChars(0, length, cArr, iWriteLocalTime);
            i10 = iWriteLocalTime + length;
        } else {
            int i14 = iWriteLocalTime + 1;
            cArr[iWriteLocalTime] = '[';
            id2.getChars(0, length, cArr, i14);
            int i15 = i14 + length;
            cArr[i15] = ']';
            i10 = i15 + 1;
        }
        cArr[i10] = this.quote;
        this.off = i10 + 1;
    }

    private static int indent(char[] cArr, int i9, int i10) {
        int i11 = i9 + 1;
        cArr[i9] = '\n';
        int i12 = i10 + i11;
        while (i11 < i12) {
            cArr[i11] = '\t';
            i11++;
        }
        return i11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char[] cArr, int i9, int i10) {
        int i11 = this.off + i10;
        if (i11 >= this.chars.length) {
            ensureCapacity(i11);
        }
        System.arraycopy(cArr, i9, this.chars, this.off, i10);
        this.off += i10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char c10) {
        int i9 = this.off;
        if (i9 == this.chars.length) {
            ensureCapacity(i9 + 1);
        }
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char c10, char c11) {
        int i9 = this.off;
        int i10 = i9 + 1;
        if (i10 >= this.chars.length) {
            ensureCapacity(i9 + 2);
        }
        char[] cArr = this.chars;
        cArr[i9] = c10;
        cArr[i10] = c11;
        this.off = i9 + 2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] cArr, int i9, int i10) {
        int i11 = this.off;
        int i12 = (this.pretty * this.level) + i11 + i10 + 2;
        char[] cArrGrow = this.chars;
        if (i12 > cArrGrow.length) {
            cArrGrow = grow(i12);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            cArrGrow[i11] = ',';
            i11++;
        }
        System.arraycopy(cArr, i9, cArrGrow, i11, i10);
        this.off = i11 + i10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void flushTo(Writer writer) {
        try {
            int i9 = this.off;
            if (i9 > 0) {
                writer.write(this.chars, 0, i9);
                this.off = 0;
            }
        } catch (IOException e6) {
            C0086a.m465x("flushTo error", e6);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes() {
        int i9 = 0;
        while (true) {
            int i10 = this.off;
            if (i9 < i10) {
                char[] cArr = this.chars;
                if (cArr[i9] >= 128) {
                    byte[] bArr = new byte[i10 * 3];
                    return Arrays.copyOf(bArr, IOUtils.encodeUTF8(cArr, 0, i10, bArr, 0));
                }
                i9++;
            } else {
                byte[] bArr2 = new byte[i10];
                for (int i11 = 0; i11 < this.off; i11++) {
                    bArr2[i11] = (byte) this.chars[i11];
                }
                return bArr2;
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(OutputStream outputStream, Charset charset) throws IOException {
        if (this.off == 0) {
            return 0;
        }
        if (outputStream != null) {
            byte[] bytes = getBytes(charset);
            outputStream.write(bytes);
            this.off = 0;
            return bytes.length;
        }
        C0086a.m464w("out is null");
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double d10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 24;
        if (z9) {
            i10 = i9 + 26;
        }
        if (i10 >= this.chars.length) {
            ensureCapacity(i10);
        }
        char[] cArr = this.chars;
        if (z9) {
            cArr[i9] = '\"';
            i9++;
        }
        int string = DoubleToDecimal.toString(d10, cArr, i9, true) + i9;
        if (z9) {
            cArr[string] = '\"';
            string++;
        }
        this.off = string;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int i9) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int i11 = i10 + 13;
        if (i11 >= this.chars.length) {
            ensureCapacity(i11);
        }
        char[] cArr = this.chars;
        if (z9) {
            cArr[i10] = this.quote;
            i10++;
        }
        int iWriteInt32 = IOUtils.writeInt32(cArr, i10, i9);
        if (z9) {
            cArr[iWriteInt32] = this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float f3) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 15;
        if (z9) {
            i10 = i9 + 17;
        }
        ensureCapacity(i10);
        char[] cArr = this.chars;
        if (z9) {
            cArr[i9] = '\"';
            i9++;
        }
        int string = DoubleToDecimal.toString(f3, cArr, i9, true) + i9;
        if (z9) {
            cArr[string] = '\"';
            string++;
        }
        this.off = string;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long j3) {
        int i9;
        long j4 = this.context.features;
        boolean z9 = ((JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask) & j4) != 0 || ((JSONWriter.Feature.BrowserCompatible.mask & j4) != 0 && (j3 > 9007199254740991L || j3 < -9007199254740991L));
        int i10 = this.off;
        int i11 = i10 + 23;
        if (i11 >= this.chars.length) {
            ensureCapacity(i11);
        }
        char[] cArr = this.chars;
        if (z9) {
            cArr[i10] = this.quote;
            i10++;
        }
        int iWriteInt64 = IOUtils.writeInt64(cArr, i10, j3);
        if (z9) {
            i9 = iWriteInt64 + 1;
            cArr[iWriteInt64] = this.quote;
        } else {
            if ((JSONWriter.Feature.WriteClassName.mask & j4) != 0 && (j4 & JSONWriter.Feature.NotWriteNumberClassName.mask) == 0 && j3 >= -2147483648L && j3 <= 2147483647L) {
                i9 = iWriteInt64 + 1;
                cArr[iWriteInt64] = 'L';
            }
            this.off = iWriteInt64;
        }
        iWriteInt64 = i9;
        this.off = iWriteInt64;
    }

    private static void putLong(char[] cArr, int i9, long j3, int i10) {
        long j4 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1));
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j4, (j3 & 255) | ((j3 & 65280) << 8) | ((j3 & 16711680) << 16) | ((j3 & 4278190080L) << 24));
        unsafe.putLong(cArr, j4 + 8, ((j3 & 1095216660480L) >> 32) | ((j3 & 280375465082880L) >> 24) | ((j3 & 71776119061217280L) >> 16) | ((j3 & (-72057594037927936L)) >> 8));
        long j5 = i10;
        unsafe.putLong(cArr, j4 + 16, ((j5 & 4278190080L) << 24) | (j5 & 255) | ((j5 & 65280) << 8) | ((j5 & 16711680) << 16));
    }

    private static void putLong(char[] cArr, int i9, long j3) {
        long j4 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1));
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j4, (255 & j3) | ((65280 & j3) << 8) | ((16711680 & j3) << 16) | ((4278190080L & j3) << 24));
        unsafe.putLong(cArr, 8 + j4, ((1095216660480L & j3) >> 32) | ((280375465082880L & j3) >> 24) | ((71776119061217280L & j3) >> 16) | ((j3 & (-72057594037927936L)) >> 8));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(JSONObject jSONObject) {
        if (this.pretty != 0) {
            super.write(jSONObject);
            return;
        }
        if (jSONObject == null) {
            writeNull();
            return;
        }
        JSONWriter.Context context = this.context;
        if ((context.features & JSONWriter.NONE_DIRECT_FEATURES) != 0) {
            context.getObjectWriter(jSONObject.getClass()).write(this, jSONObject, null, null, 0L);
            return;
        }
        writeRaw('{');
        boolean z9 = true;
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (this.context.features & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                if (!z9) {
                    writeRaw(',');
                }
                String key = entry.getKey();
                if (key instanceof String) {
                    writeString(key);
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
                z9 = false;
            }
        }
        writeRaw('}');
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeStringNull();
            return;
        }
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.EscapeNoneAscii.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        char c10 = this.quote;
        int length = str.length();
        int i9 = this.off + length + 2;
        if (i9 >= this.chars.length) {
            ensureCapacity(i9);
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\' || cCharAt == c10 || cCharAt < ' ' || ((z10 && (cCharAt == '<' || cCharAt == '>' || cCharAt == '(' || cCharAt == ')')) || (z9 && cCharAt > 127))) {
                writeStringEscape(str);
                return;
            }
        }
        int i11 = this.off;
        char[] cArr = this.chars;
        int i12 = i11 + 1;
        cArr[i11] = c10;
        str.getChars(0, length, cArr, i12);
        int i13 = i12 + length;
        cArr[i13] = c10;
        this.off = i13 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean z9) {
        char[] cArr = this.chars;
        int i9 = this.off;
        this.off = i9 + 1;
        cArr[i9] = this.quote;
        writeBool(z9);
        char[] cArr2 = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr2[i10] = this.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(byte b10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z9) {
            writeQuote();
        }
        writeInt8(b10);
        if (z9) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(short s10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z9) {
            writeQuote();
        }
        writeInt16(s10);
        if (z9) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(int i9) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z9) {
            writeQuote();
        }
        writeInt32(i9);
        if (z9) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(long j3) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z9) {
            writeQuote();
        }
        writeInt64(j3);
        if (z9) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(List<String> list) {
        if (this.pretty != 0) {
            super.writeString(list);
            return;
        }
        int i9 = this.off;
        if (i9 == this.chars.length) {
            ensureCapacity(i9 + 1);
        }
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = '[';
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                int i12 = this.off;
                if (i12 == this.chars.length) {
                    ensureCapacity(i12 + 1);
                }
                char[] cArr2 = this.chars;
                int i13 = this.off;
                this.off = i13 + 1;
                cArr2[i13] = ',';
            }
            writeString(list.get(i11));
        }
        int i14 = this.off;
        if (i14 == this.chars.length) {
            ensureCapacity(i14 + 1);
        }
        char[] cArr3 = this.chars;
        int i15 = this.off;
        this.off = i15 + 1;
        cArr3[i15] = ']';
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0051. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeStringEscape(char[] cArr) {
        int i9;
        int length = cArr.length;
        char c10 = this.quote;
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.EscapeNoneAscii.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i10 = this.off;
        ensureCapacity(AbstractC3199a.m6834g(length, 6, i10, 2));
        char[] cArr2 = this.chars;
        int i11 = i10 + 1;
        cArr2[i10] = c10;
        for (char c11 : cArr) {
            if (c11 == '\"') {
                if (c11 == c10) {
                    cArr2[i11] = '\\';
                    i11++;
                }
                i9 = i11 + 1;
                cArr2[i11] = c11;
                i11 = i9;
            } else if (c11 != '<' && c11 != '>') {
                if (c11 != '\\') {
                    switch (c11) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'u';
                            cArr2[i11 + 2] = '0';
                            cArr2[i11 + 3] = '0';
                            cArr2[i11 + 4] = '0';
                            cArr2[i11 + 5] = (char) (c11 + '0');
                            i11 += 6;
                            break;
                        case '\b':
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'b';
                            break;
                        case '\t':
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 't';
                            break;
                        case '\n':
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'u';
                            cArr2[i11 + 2] = '0';
                            cArr2[i11 + 3] = '0';
                            cArr2[i11 + 4] = '0';
                            cArr2[i11 + 5] = (char) (c11 + 'W');
                            i11 += 6;
                            break;
                        case '\f':
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'f';
                            break;
                        case '\r':
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'r';
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'u';
                            cArr2[i11 + 2] = '0';
                            cArr2[i11 + 3] = '0';
                            cArr2[i11 + 4] = '1';
                            cArr2[i11 + 5] = (char) (c11 + ' ');
                            i11 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr2[i11] = '\\';
                            cArr2[i11 + 1] = 'u';
                            cArr2[i11 + 2] = '0';
                            cArr2[i11 + 3] = '0';
                            cArr2[i11 + 4] = '1';
                            cArr2[i11 + 5] = (char) (c11 + 'G');
                            i11 += 6;
                            break;
                        default:
                            switch (c11) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (z9 && c11 > 127) {
                                        cArr2[i11] = '\\';
                                        cArr2[i11 + 1] = 'u';
                                        char[] cArr3 = JSONWriter.DIGITS;
                                        cArr2[i11 + 2] = cArr3[(c11 >>> '\f') & 15];
                                        cArr2[i11 + 3] = cArr3[(c11 >>> '\b') & 15];
                                        cArr2[i11 + 4] = cArr3[(c11 >>> 4) & 15];
                                        cArr2[i11 + 5] = cArr3[c11 & 15];
                                        i11 += 6;
                                    } else {
                                        i9 = i11 + 1;
                                        cArr2[i11] = c11;
                                        i11 = i9;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    cArr2[i11] = '\\';
                    cArr2[i11 + 1] = c11;
                }
                i11 += 2;
            } else if (z10) {
                cArr2[i11] = '\\';
                cArr2[i11 + 1] = 'u';
                cArr2[i11 + 2] = '0';
                cArr2[i11 + 3] = '0';
                char[] cArr4 = JSONWriter.DIGITS;
                cArr2[i11 + 4] = cArr4[(c11 >>> 4) & 15];
                cArr2[i11 + 5] = cArr4[c11 & 15];
                i11 += 6;
            } else {
                i9 = i11 + 1;
                cArr2[i11] = c11;
                i11 = i9;
            }
        }
        cArr2[i11] = c10;
        this.off = i11 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String[] strArr) {
        if (strArr == null) {
            writeArrayNull();
            return;
        }
        startArray();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (i9 != 0) {
                writeComma();
            }
            String str = strArr[i9];
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
        endArray();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr) {
        if (cArr == null) {
            writeStringNull();
            return;
        }
        long j3 = this.context.features;
        boolean z9 = true;
        boolean z10 = (JSONWriter.Feature.BrowserSecure.mask & j3) != 0;
        boolean z11 = (j3 & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i9 = 0;
        while (true) {
            if (i9 >= cArr.length) {
                z9 = z11;
                break;
            }
            char c10 = cArr[i9];
            if (c10 == '\\' || c10 == this.quote || c10 < ' ' || (z10 && (c10 == '<' || c10 == '>' || c10 == '(' || c10 == ')'))) {
                break;
            } else {
                i9++;
            }
        }
        if (!z9) {
            int length = this.off + cArr.length + 2;
            if (length > this.chars.length) {
                ensureCapacity(length);
            }
            char[] cArr2 = this.chars;
            int i10 = this.off;
            int i11 = i10 + 1;
            this.off = i11;
            cArr2[i10] = this.quote;
            System.arraycopy(cArr, 0, cArr2, i11, cArr.length);
            int length2 = this.off + cArr.length;
            char[] cArr3 = this.chars;
            this.off = length2 + 1;
            cArr3[length2] = this.quote;
            return;
        }
        writeStringEscape(cArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr, int i9, int i10) {
        if (cArr == null) {
            writeStringNull();
            return;
        }
        boolean z9 = true;
        boolean z10 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i11 = i9;
        while (true) {
            if (i11 >= i10) {
                z9 = z10;
                break;
            }
            char c10 = cArr[i11];
            if (c10 == '\\' || c10 == this.quote || c10 < ' ') {
                break;
            } else {
                i11++;
            }
        }
        if (!z9) {
            int i12 = this.off + i10 + 2;
            if (i12 >= this.chars.length) {
                ensureCapacity(i12);
            }
            char[] cArr2 = this.chars;
            int i13 = this.off;
            int i14 = i13 + 1;
            this.off = i14;
            cArr2[i13] = this.quote;
            System.arraycopy(cArr, i9, cArr2, i14, i10);
            int i15 = this.off + i10;
            char[] cArr3 = this.chars;
            this.off = i15 + 1;
            cArr3[i15] = this.quote;
            return;
        }
        writeStringEscape(new String(cArr, i9, i10));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0054. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeStringEscape(byte[] bArr) {
        int i9;
        int length = bArr.length;
        char c10 = this.quote;
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.EscapeNoneAscii.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i10 = this.off;
        ensureCapacity(AbstractC3199a.m6834g(length, 6, i10, 2));
        char[] cArr = this.chars;
        int i11 = i10 + 1;
        cArr[i10] = c10;
        for (byte b10 : bArr) {
            char c11 = (char) (b10 & 255);
            if (c11 == '\"') {
                if (c11 == c10) {
                    cArr[i11] = '\\';
                    i11++;
                }
                i9 = i11 + 1;
                cArr[i11] = c11;
                i11 = i9;
            } else if (c11 != '<' && c11 != '>') {
                if (c11 != '\\') {
                    switch (c11) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '0';
                            cArr[i11 + 5] = (char) (c11 + '0');
                            i11 += 6;
                            break;
                        case '\b':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'b';
                            break;
                        case '\t':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 't';
                            break;
                        case '\n':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '0';
                            cArr[i11 + 5] = (char) (c11 + 'W');
                            i11 += 6;
                            break;
                        case '\f':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'f';
                            break;
                        case '\r':
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'r';
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '1';
                            cArr[i11 + 5] = (char) (c11 + ' ');
                            i11 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr[i11] = '\\';
                            cArr[i11 + 1] = 'u';
                            cArr[i11 + 2] = '0';
                            cArr[i11 + 3] = '0';
                            cArr[i11 + 4] = '1';
                            cArr[i11 + 5] = (char) (c11 + 'G');
                            i11 += 6;
                            break;
                        default:
                            switch (c11) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (z9 && c11 > 127) {
                                        cArr[i11] = '\\';
                                        cArr[i11 + 1] = 'u';
                                        cArr[i11 + 2] = '0';
                                        cArr[i11 + 3] = '0';
                                        char[] cArr2 = JSONWriter.DIGITS;
                                        cArr[i11 + 4] = cArr2[(c11 >>> 4) & 15];
                                        cArr[i11 + 5] = cArr2[c11 & 15];
                                        i11 += 6;
                                    } else {
                                        i9 = i11 + 1;
                                        cArr[i11] = c11;
                                        i11 = i9;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    cArr[i11] = '\\';
                    cArr[i11 + 1] = c11;
                }
                i11 += 2;
            } else if (z10) {
                cArr[i11] = '\\';
                cArr[i11 + 1] = 'u';
                cArr[i11 + 2] = '0';
                cArr[i11 + 3] = '0';
                char[] cArr3 = JSONWriter.DIGITS;
                cArr[i11 + 4] = cArr3[(c11 >>> 4) & 15];
                cArr[i11 + 5] = cArr3[c11 & 15];
                i11 += 6;
            } else {
                i9 = i11 + 1;
                cArr[i11] = c11;
                i11 = i9;
            }
        }
        cArr[i11] = c10;
        this.off = i11 + 1;
    }
}
