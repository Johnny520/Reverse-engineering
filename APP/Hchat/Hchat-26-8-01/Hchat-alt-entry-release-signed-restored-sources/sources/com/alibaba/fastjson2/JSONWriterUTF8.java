package com.alibaba.fastjson2;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.DoubleToDecimal;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.io.IOException;
import java.io.OutputStream;
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
final class JSONWriterUTF8 extends JSONWriter {
    protected byte[] bytes;
    final JSONFactory.CacheItem cacheItem;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONWriterUTF8(JSONWriter.Context context) {
        super(context, null, false, StandardCharsets.UTF_8);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r0.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        this.bytes = andSet == null ? new byte[8192] : andSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private byte[] grow(int i9) {
        grow0(i9);
        return this.bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void grow0(int i9) {
        byte[] bArr = this.bytes;
        this.bytes = Arrays.copyOf(bArr, newCapacity(i9, bArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int indent(byte[] bArr, int i9) {
        bArr[i9] = 10;
        int i10 = i9 + 1;
        byte b10 = this.pretty;
        int i11 = (this.level * b10) + i10;
        Arrays.fill(bArr, i10, i11, b10 == 1 ? (byte) 9 : (byte) 32);
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void writeQuote() {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = (byte) this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.bytes;
        if (bArr.length > 1048576) {
            return;
        }
        JSONFactory.BYTES_UPDATER.lazySet(this.cacheItem, bArr);
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
        byte[] bArrGrow = this.bytes;
        if (i11 > bArrGrow.length) {
            bArrGrow = grow(i11);
        }
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        bArrGrow[iIndent] = 93;
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
        byte[] bArrGrow = this.bytes;
        if (i11 > bArrGrow.length) {
            bArrGrow = grow(i11);
        }
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        bArrGrow[iIndent] = JSONB.Constants.BC_STR_UTF16BE;
        this.off = iIndent + 1;
        this.startObject = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void ensureCapacity(int i9) {
        if (i9 > this.bytes.length) {
            grow0(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(OutputStream outputStream, Charset charset) throws IOException {
        if (charset == null || charset == StandardCharsets.UTF_8 || charset == StandardCharsets.US_ASCII) {
            int i9 = this.off;
            outputStream.write(this.bytes, 0, i9);
            this.off = 0;
            return i9;
        }
        if (charset == StandardCharsets.ISO_8859_1) {
            int i10 = 0;
            while (true) {
                byte[] bArr = this.bytes;
                if (i10 >= bArr.length) {
                    int i11 = this.off;
                    outputStream.write(bArr, 0, i11);
                    this.off = 0;
                    return i11;
                }
                if (bArr[i10] < 0) {
                    break;
                }
                i10++;
            }
        }
        byte[] bytes = new String(this.bytes, 0, this.off).getBytes(charset);
        outputStream.write(bytes);
        return bytes.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes(Charset charset) {
        return charset == StandardCharsets.UTF_8 ? Arrays.copyOf(this.bytes, this.off) : toString().getBytes(charset);
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
        byte[] bArrGrow = this.bytes;
        if (i11 > bArrGrow.length) {
            bArrGrow = grow(i11);
        }
        int iIndent = i10 + 1;
        bArrGrow[i10] = 91;
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
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
        int i11 = (this.pretty * this.level) + i10 + 3;
        byte[] bArrGrow = this.bytes;
        if (i11 > bArrGrow.length) {
            bArrGrow = grow(i11);
        }
        int iIndent = i10 + 1;
        bArrGrow[i10] = JSONB.Constants.BC_STR_UTF16;
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return new String(this.bytes, 0, this.off, StandardCharsets.UTF_8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            grow(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = JSONB.Constants.BC_STR_UTF16;
        boolean z9 = true;
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (this.context.features & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                if (!z9) {
                    int i11 = this.off;
                    if (i11 == this.bytes.length) {
                        ensureCapacity(i11 + 1);
                    }
                    byte[] bArr2 = this.bytes;
                    int i12 = this.off;
                    this.off = i12 + 1;
                    bArr2[i12] = 44;
                }
                String key = entry.getKey();
                if (key instanceof String) {
                    writeString(key);
                } else {
                    writeAny(key);
                }
                int i13 = this.off;
                if (i13 == this.bytes.length) {
                    ensureCapacity(i13 + 1);
                }
                byte[] bArr3 = this.bytes;
                int i14 = this.off;
                this.off = i14 + 1;
                bArr3[i14] = 58;
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
        int i15 = this.off;
        if (i15 == this.bytes.length) {
            grow(i15 + 1);
        }
        byte[] bArr4 = this.bytes;
        int i16 = this.off;
        this.off = i16 + 1;
        bArr4[i16] = JSONB.Constants.BC_STR_UTF16BE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write0(char c10) {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        this.bytes[i9] = (byte) c10;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBase64(byte[] bArr) {
        int i9 = this.off;
        ensureCapacity(((((bArr.length - 1) / 3) + 1) << 2) + i9 + 2);
        byte[] bArr2 = this.bytes;
        int i10 = i9 + 1;
        bArr2[i9] = (byte) this.quote;
        int length = (bArr.length / 3) * 3;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i14 = i13 | (bArr[i12] & 255);
            char[] cArr = JSONFactory.f1928CA;
            bArr2[i10] = (byte) cArr[(i14 >>> 18) & 63];
            bArr2[i10 + 1] = (byte) cArr[(i14 >>> 12) & 63];
            bArr2[i10 + 2] = (byte) cArr[(i14 >>> 6) & 63];
            bArr2[i10 + 3] = (byte) cArr[i14 & 63];
            i10 += 4;
        }
        int length2 = bArr.length - length;
        if (length2 > 0) {
            int i15 = ((bArr[length] & 255) << 10) | (length2 == 2 ? (bArr[bArr.length - 1] & 255) << 2 : 0);
            char[] cArr2 = JSONFactory.f1928CA;
            bArr2[i10] = (byte) cArr2[i15 >> 12];
            bArr2[i10 + 1] = (byte) cArr2[(i15 >>> 6) & 63];
            bArr2[i10 + 2] = length2 == 2 ? (byte) cArr2[i15 & 63] : (byte) 61;
            bArr2[i10 + 3] = 61;
            i10 += 4;
        }
        bArr2[i10] = (byte) this.quote;
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBigInt(BigInteger bigInteger, long j3) {
        if (bigInteger == null) {
            writeNumberNull();
            return;
        }
        String string = bigInteger.toString(10);
        if (((j3 | this.context.features) & JSONWriter.Feature.BrowserCompatible.mask) != 0 && (bigInteger.compareTo(JSONFactory.LOW_BIGINT) < 0 || bigInteger.compareTo(JSONFactory.HIGH_BIGINT) > 0)) {
            writeString(string);
            return;
        }
        int length = string.length();
        int i9 = this.off + length;
        if (i9 >= this.bytes.length) {
            ensureCapacity(i9);
        }
        string.getBytes(0, length, this.bytes, this.off);
        this.off += length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeChar(char c10) {
        int i9;
        int i10 = this.off;
        int i11 = i10 + 8;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        byte[] bArr = this.bytes;
        int i12 = i10 + 1;
        char c11 = this.quote;
        bArr[i10] = (byte) c11;
        if (c10 <= 127) {
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
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 117;
                        bArr[i10 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 5] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 6] = (byte) (c10 + '0');
                        i9 = i10 + 7;
                        break;
                    case '\b':
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 98;
                        break;
                    case '\t':
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 116;
                        break;
                    case '\n':
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 110;
                        break;
                    case 11:
                    case 14:
                    case 15:
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 117;
                        bArr[i10 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 5] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 6] = (byte) (c10 + 'W');
                        i9 = i10 + 7;
                        break;
                    case '\f':
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 102;
                        break;
                    case '\r':
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 114;
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
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 117;
                        bArr[i10 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 5] = 49;
                        bArr[i10 + 6] = (byte) (c10 + ' ');
                        i9 = i10 + 7;
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        bArr[i12] = 92;
                        bArr[i10 + 2] = 117;
                        bArr[i10 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                        bArr[i10 + 5] = 49;
                        bArr[i10 + 6] = (byte) (c10 + 'G');
                        i9 = i10 + 7;
                        break;
                    default:
                        if (c10 != c11) {
                            i9 = i10 + 2;
                            bArr[i12] = (byte) c10;
                        } else {
                            bArr[i12] = 92;
                            bArr[i10 + 2] = (byte) c11;
                        }
                        break;
                }
            } else {
                bArr[i12] = 92;
                bArr[i10 + 2] = 92;
            }
            i9 = i10 + 3;
        } else {
            if (c10 >= 55296 && c10 < 57344) {
                C0086a.m448g(c10, "illegal char ");
                return;
            }
            if (c10 > 2047) {
                bArr[i12] = (byte) (((c10 >> '\f') & 15) | 224);
                bArr[i10 + 2] = (byte) (((c10 >> 6) & 63) | 128);
                bArr[i10 + 3] = (byte) ((c10 & '?') | 128);
                i9 = i10 + 4;
            } else {
                bArr[i12] = (byte) (((c10 >> 6) & 31) | Opcodes.CHECKCAST);
                bArr[i10 + 2] = (byte) ((c10 & '?') | 128);
                i9 = i10 + 3;
            }
        }
        bArr[i9] = (byte) c11;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeColon() {
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        this.bytes[i9] = 58;
        this.off = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeComma() {
        this.startObject = false;
        int i9 = this.off;
        int i10 = (this.pretty * this.level) + i9 + 2;
        byte[] bArrGrow = this.bytes;
        if (i10 > bArrGrow.length) {
            bArrGrow = grow(i10);
        }
        int iIndent = i9 + 1;
        bArrGrow[i9] = 44;
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime14(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.off;
        int i16 = i15 + 16;
        if (i16 >= this.bytes.length) {
            ensureCapacity(i16);
        }
        byte[] bArr = this.bytes;
        char c10 = this.quote;
        bArr[i15] = (byte) c10;
        if (i9 < 0 || i9 > 9999) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i17 = i9 / 1000;
        int[] iArr = IOUtils.DIGITS_K;
        int i18 = iArr[i9 - (i17 * 1000)];
        bArr[i15 + 1] = (byte) (i17 + 48);
        bArr[i15 + 2] = (byte) (i18 >> 16);
        bArr[i15 + 3] = (byte) (i18 >> 8);
        bArr[i15 + 4] = (byte) i18;
        int i19 = iArr[i10];
        bArr[i15 + 5] = (byte) (i19 >> 8);
        bArr[i15 + 6] = (byte) i19;
        int i20 = iArr[i11];
        bArr[i15 + 7] = (byte) (i20 >> 8);
        bArr[i15 + 8] = (byte) i20;
        int i21 = iArr[i12];
        bArr[i15 + 9] = (byte) (i21 >> 8);
        bArr[i15 + 10] = (byte) i21;
        int i22 = iArr[i13];
        bArr[i15 + 11] = (byte) (i22 >> 8);
        bArr[i15 + 12] = (byte) i22;
        int i23 = iArr[i14];
        bArr[i15 + 13] = (byte) (i23 >> 8);
        bArr[i15 + 14] = (byte) i23;
        bArr[i15 + 15] = (byte) c10;
        this.off = i16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime19(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.off;
        int i16 = i15 + 21;
        if (i16 >= this.bytes.length) {
            ensureCapacity(i16);
        }
        byte[] bArr = this.bytes;
        char c10 = this.quote;
        bArr[i15] = (byte) c10;
        if (i9 < 0 || i9 > 9999) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i17 = i9 / 1000;
        int[] iArr = IOUtils.DIGITS_K;
        int i18 = iArr[i9 - (i17 * 1000)];
        bArr[i15 + 1] = (byte) (i17 + 48);
        bArr[i15 + 2] = (byte) (i18 >> 16);
        bArr[i15 + 3] = (byte) (i18 >> 8);
        bArr[i15 + 4] = (byte) i18;
        bArr[i15 + 5] = 45;
        int i19 = iArr[i10];
        bArr[i15 + 6] = (byte) (i19 >> 8);
        bArr[i15 + 7] = (byte) i19;
        bArr[i15 + 8] = 45;
        int i20 = iArr[i11];
        bArr[i15 + 9] = (byte) (i20 >> 8);
        bArr[i15 + 10] = (byte) i20;
        bArr[i15 + 11] = 32;
        int i21 = iArr[i12];
        bArr[i15 + 12] = (byte) (i21 >> 8);
        bArr[i15 + 13] = (byte) i21;
        bArr[i15 + 14] = 58;
        int i22 = iArr[i13];
        bArr[i15 + 15] = (byte) (i22 >> 8);
        bArr[i15 + 16] = (byte) i22;
        bArr[i15 + 17] = 58;
        int i23 = iArr[i14];
        bArr[i15 + 18] = (byte) (i23 >> 8);
        bArr[i15 + 19] = (byte) i23;
        bArr[i15 + 20] = (byte) c10;
        this.off = i16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTimeISO8601(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        int i17 = this.off + 25 + (z9 ? i16 == 0 ? 1 : 6 : 0);
        if (i17 >= this.bytes.length) {
            ensureCapacity(i17);
        }
        byte[] bArr = this.bytes;
        int i18 = this.off;
        bArr[i18] = (byte) this.quote;
        int iWriteInt32 = IOUtils.writeInt32(bArr, i18 + 1, i9);
        bArr[iWriteInt32] = 45;
        int[] iArr = IOUtils.DIGITS_K;
        int i19 = iArr[i10];
        bArr[iWriteInt32 + 1] = (byte) (i19 >> 8);
        bArr[iWriteInt32 + 2] = (byte) i19;
        bArr[iWriteInt32 + 3] = 45;
        int i20 = iArr[i11];
        bArr[iWriteInt32 + 4] = (byte) (i20 >> 8);
        bArr[iWriteInt32 + 5] = (byte) i20;
        bArr[iWriteInt32 + 6] = (byte) (z9 ? 84 : 32);
        int i21 = iArr[i12];
        bArr[iWriteInt32 + 7] = (byte) (i21 >> 8);
        bArr[iWriteInt32 + 8] = (byte) i21;
        bArr[iWriteInt32 + 9] = 58;
        int i22 = iArr[i13];
        bArr[iWriteInt32 + 10] = (byte) (i22 >> 8);
        bArr[iWriteInt32 + 11] = (byte) i22;
        bArr[iWriteInt32 + 12] = 58;
        int i23 = iArr[i14];
        bArr[iWriteInt32 + 13] = (byte) (i23 >> 8);
        bArr[iWriteInt32 + 14] = (byte) i23;
        int i24 = iWriteInt32 + 15;
        if (i15 > 0) {
            int i25 = iWriteInt32 + 16;
            bArr[i24] = 46;
            int i26 = i15 / 10;
            int i27 = i26 / 10;
            if (i15 - (i26 * 10) != 0) {
                int i28 = iArr[i15];
                bArr[i25] = (byte) (i28 >> 16);
                bArr[iWriteInt32 + 17] = (byte) (i28 >> 8);
                bArr[iWriteInt32 + 18] = (byte) i28;
                i24 = iWriteInt32 + 19;
            } else if (i26 - (i27 * 10) != 0) {
                int i29 = iArr[i26];
                bArr[i25] = (byte) (i29 >> 8);
                bArr[iWriteInt32 + 17] = (byte) i29;
                i24 = iWriteInt32 + 18;
            } else {
                i24 = iWriteInt32 + 17;
                bArr[i25] = (byte) (i27 + 48);
            }
        }
        if (z9) {
            int i30 = i16 / 3600;
            if (i16 == 0) {
                bArr[i24] = 90;
                i24++;
            } else {
                int iAbs = Math.abs(i30);
                bArr[i24] = i30 >= 0 ? (byte) 43 : (byte) 45;
                int i31 = iArr[iAbs];
                bArr[i24 + 1] = (byte) (i31 >> 8);
                bArr[i24 + 2] = (byte) i31;
                bArr[i24 + 3] = 58;
                int i32 = (i16 - (i30 * 3600)) / 60;
                if (i32 < 0) {
                    i32 = -i32;
                }
                int i33 = iArr[i32];
                bArr[i24 + 4] = (byte) (i33 >> 8);
                bArr[i24 + 5] = (byte) i33;
                i24 += 6;
            }
        }
        bArr[i24] = (byte) this.quote;
        this.off = i24 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD10(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 13;
        if (i13 >= this.bytes.length) {
            ensureCapacity(i13);
        }
        byte[] bArr = this.bytes;
        bArr[i12] = (byte) this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i12 + 1, i9, i10, i11);
        bArr[iWriteLocalDate] = (byte) this.quote;
        this.off = iWriteLocalDate + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD8(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 10;
        if (i13 >= this.bytes.length) {
            ensureCapacity(i13);
        }
        byte[] bArr = this.bytes;
        char c10 = this.quote;
        bArr[i12] = (byte) c10;
        if (i9 < 0 || i9 > 9999) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Only 4 digits numbers are supported. Provided: "));
            return;
        }
        int i14 = i9 / 1000;
        int[] iArr = IOUtils.DIGITS_K;
        int i15 = iArr[i9 - (i14 * 1000)];
        bArr[i12 + 1] = (byte) (i14 + 48);
        bArr[i12 + 2] = (byte) (i15 >> 16);
        bArr[i12 + 3] = (byte) (i15 >> 8);
        bArr[i12 + 4] = (byte) i15;
        int i16 = iArr[i10];
        bArr[i12 + 5] = (byte) (i16 >> 8);
        bArr[i12 + 6] = (byte) i16;
        int i17 = iArr[i11];
        bArr[i12 + 7] = (byte) (i17 >> 8);
        bArr[i12 + 8] = (byte) i17;
        bArr[i12 + 9] = (byte) c10;
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
        if (iAbs >= this.bytes.length) {
            ensureCapacity(iAbs);
        }
        byte[] bArr = this.bytes;
        if (z9) {
            bArr[i9] = 34;
            i9++;
        }
        String plainString = (j4 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) != 0 ? bigDecimal.toPlainString() : bigDecimal.toString();
        plainString.getBytes(0, plainString.length(), bArr, i9);
        int length = plainString.length() + i9;
        if (z9) {
            bArr[length] = 34;
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
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i10 = i9 + 1;
        bArr[i9] = 91;
        for (int i11 = 0; i11 < dArr.length; i11++) {
            if (i11 != 0) {
                bArr[i10] = 44;
                i10++;
            }
            if (z9) {
                bArr[i10] = 34;
                i10++;
            }
            int string = DoubleToDecimal.toString(dArr[i11], bArr, i10, true) + i10;
            if (z9) {
                i10 = string + 1;
                bArr[string] = 34;
            } else {
                i10 = string;
            }
        }
        bArr[i10] = 93;
        this.off = i10 + 1;
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
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i10 = i9 + 1;
        bArr[i9] = 91;
        for (int i11 = 0; i11 < fArr.length; i11++) {
            if (i11 != 0) {
                bArr[i10] = 44;
                i10++;
            }
            if (z9) {
                bArr[i10] = 34;
                i10++;
            }
            int string = DoubleToDecimal.toString(fArr[i11], bArr, i10, true) + i10;
            if (z9) {
                i10 = string + 1;
                bArr[string] = 34;
            } else {
                i10 = string;
            }
        }
        bArr[i10] = 93;
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
        byte[] bArr2 = this.bytes;
        bArr2[i9] = JSONB.Constants.BC_STR_ASCII_FIX_MAX;
        bArr2[i9 + 1] = 39;
        int i10 = i9 + 2;
        for (byte b10 : bArr) {
            int i11 = (b10 & 255) >> 4;
            int i12 = b10 & 15;
            int i13 = 55;
            bArr2[i10] = (byte) (i11 + (i11 < 10 ? 48 : 55));
            int i14 = i10 + 1;
            if (i12 < 10) {
                i13 = 48;
            }
            bArr2[i14] = (byte) (i12 + i13);
            i10 += 2;
        }
        bArr2[i10] = 39;
        this.off = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short s10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 7;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        if (z9) {
            bArr[i9] = (byte) this.quote;
            i9++;
        }
        int iWriteInt32 = IOUtils.writeInt32(bArr, i9, s10);
        if (z9) {
            bArr[iWriteInt32] = (byte) this.quote;
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
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i10 = i9 + 1;
        bArr[i9] = 91;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i11 != 0) {
                bArr[i10] = 44;
                i10++;
            }
            if (z9) {
                bArr[i10] = (byte) this.quote;
                i10++;
            }
            int iWriteInt32 = IOUtils.writeInt32(bArr, i10, iArr[i11]);
            if (z9) {
                i10 = iWriteInt32 + 1;
                bArr[iWriteInt32] = (byte) this.quote;
            } else {
                i10 = iWriteInt32;
            }
        }
        bArr[i10] = 93;
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
        if (length >= this.bytes.length) {
            ensureCapacity(length);
        }
        byte[] bArr = this.bytes;
        int iWriteInt64 = i9 + 1;
        bArr[i9] = 91;
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 != 0) {
                bArr[iWriteInt64] = 44;
                iWriteInt64++;
            }
            long j4 = jArr[i10];
            boolean z11 = z10 || (z9 && j4 <= 9007199254740991L && j4 >= -9007199254740991L);
            if (z11) {
                bArr[iWriteInt64] = (byte) this.quote;
                iWriteInt64++;
            }
            iWriteInt64 = IOUtils.writeInt64(bArr, iWriteInt64, j4);
            if (z11) {
                bArr[iWriteInt64] = (byte) this.quote;
                iWriteInt64++;
            }
        }
        bArr[iWriteInt64] = 93;
        this.off = iWriteInt64 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt8(byte b10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 5;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        if (z9) {
            bArr[i9] = (byte) this.quote;
            i9++;
        }
        int iWriteInt32 = IOUtils.writeInt32(bArr, i9, b10);
        if (z9) {
            bArr[iWriteInt32] = (byte) this.quote;
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
            if (i10 >= this.bytes.length) {
                ensureCapacity(i10);
            }
            byte[] bArr = this.bytes;
            bArr[i9] = (byte) this.quote;
            int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i9 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            bArr[iWriteLocalDate] = (byte) this.quote;
            this.off = iWriteLocalDate + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        int i9 = this.off;
        int i10 = i9 + 38;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        int i11 = i9 + 1;
        bArr[i9] = (byte) this.quote;
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i11, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iWriteLocalDate] = 32;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
        bArr[iWriteLocalTime] = (byte) this.quote;
        this.off = iWriteLocalTime + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(LocalTime localTime) {
        int i9 = this.off;
        int i10 = i9 + 20;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        bArr[i9] = (byte) this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArr, i9 + 1, localTime);
        bArr[iWriteLocalTime] = (byte) this.quote;
        this.off = iWriteLocalTime + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName10Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        this.off = iIndent + 13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName11Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        this.off = iIndent + 14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName12Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        this.off = iIndent + 15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName13Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        this.off = iIndent + 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName14Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 19;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        bArr[iIndent + 16] = 58;
        this.off = iIndent + 17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName15Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 20;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        bArr[iIndent + 16] = (byte) this.quote;
        bArr[iIndent + 17] = 58;
        this.off = iIndent + 18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName16Raw(long j3, long j4) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 21;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        bArr[iIndent] = (byte) this.quote;
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = iIndent + 1;
        unsafe.putLong(bArr, j5 + j10, j3);
        unsafe.putLong(bArr, j5 + j10 + 8, j4);
        bArr[iIndent + 18] = (byte) this.quote;
        int i11 = iIndent + 19;
        bArr[i11] = 58;
        this.off = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName2Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j3);
        this.off = iIndent + 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName3Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j3);
        this.off = iIndent + 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName4Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j3);
        this.off = iIndent + 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName5Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j3);
        this.off = iIndent + 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName6Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 11;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j3);
        bArr[iIndent + 8] = 58;
        this.off = iIndent + 9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName7Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 12;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j3);
        bArr[iIndent + 8] = (byte) this.quote;
        bArr[iIndent + 9] = 58;
        this.off = iIndent + 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long j3) {
        int iIndent = this.off;
        int i9 = (this.pretty * this.level) + iIndent + 13;
        byte[] bArrGrow = this.bytes;
        if (i9 > bArrGrow.length) {
            bArrGrow = grow(i9);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i10 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i10) : i10;
        }
        bArr[iIndent] = (byte) this.quote;
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent) + 1, j3);
        bArr[iIndent + 9] = (byte) this.quote;
        bArr[iIndent + 10] = 58;
        this.off = iIndent + 11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName9Raw(long j3, int i9) {
        int iIndent = this.off;
        int i10 = (this.pretty * this.level) + iIndent + 14;
        byte[] bArrGrow = this.bytes;
        if (i10 > bArrGrow.length) {
            bArrGrow = grow(i10);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i11 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i11) : i11;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = iIndent;
        unsafe.putLong(bArr, j4 + j5, j3);
        unsafe.putInt(bArr, j4 + j5 + 8, i9);
        this.off = iIndent + 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] bArr) {
        int iIndent = this.off;
        int length = (this.pretty * this.level) + bArr.length + iIndent + 2;
        byte[] bArrGrow = this.bytes;
        if (length > bArrGrow.length) {
            bArrGrow = grow(length);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i9 = iIndent + 1;
            bArrGrow[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArrGrow, i9) : i9;
        }
        System.arraycopy(bArr, 0, bArrGrow, iIndent, bArr.length);
        this.off = iIndent + bArr.length;
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
        int i9 = this.off + 45;
        if (i9 >= this.bytes.length) {
            ensureCapacity(i9);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        int i11 = i10 + 1;
        bArr[i10] = (byte) this.quote;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i11, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iWriteLocalDate] = 84;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            bArr[iWriteLocalTime] = 90;
        } else {
            String id2 = offset.getId();
            id2.getBytes(0, id2.length(), bArr, iWriteLocalTime);
            length = id2.length() + iWriteLocalTime;
        }
        bArr[length] = (byte) this.quote;
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
        int i9 = this.off + 45;
        if (i9 >= this.bytes.length) {
            ensureCapacity(i9);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        bArr[i10] = (byte) this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArr, i10 + 1, offsetTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            bArr[iWriteLocalTime] = 90;
        } else {
            String id2 = offset.getId();
            id2.getBytes(0, id2.length(), bArr, iWriteLocalTime);
            length = id2.length() + iWriteLocalTime;
        }
        bArr[length] = (byte) this.quote;
        this.off = length + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(String str) {
        int i9;
        int i10;
        char[] charArray = str.toCharArray();
        int i11 = this.off;
        int length = (charArray.length * 3) + i11;
        if (length >= this.bytes.length) {
            ensureCapacity(length);
        }
        byte[] bArr = this.bytes;
        for (char c10 : charArray) {
            if (c10 < 1 || c10 > 127) {
                if (c10 > 2047) {
                    bArr[i11] = (byte) (((c10 >> '\f') & 15) | 224);
                    bArr[i11 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                    i9 = i11 + 2;
                } else {
                    bArr[i11] = (byte) (((c10 >> 6) & 31) | Opcodes.CHECKCAST);
                    i9 = i11 + 1;
                }
                i10 = i9 + 1;
                bArr[i9] = (byte) ((c10 & '?') | 128);
            } else {
                i10 = i11 + 1;
                bArr[i11] = (byte) c10;
            }
            i11 = i10;
        }
        this.off = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeReference(String str) {
        this.lastReference = str;
        int i9 = this.off;
        byte[] bArrGrow = this.bytes;
        int i10 = i9 + 8;
        if (i10 > bArrGrow.length) {
            bArrGrow = grow(i10);
        }
        bArrGrow[i9] = JSONB.Constants.BC_STR_UTF16;
        bArrGrow[i9 + 1] = 34;
        bArrGrow[i9 + 2] = 36;
        bArrGrow[i9 + 3] = 114;
        bArrGrow[i9 + 4] = 101;
        bArrGrow[i9 + 5] = 102;
        bArrGrow[i9 + 6] = 34;
        bArrGrow[i9 + 7] = 58;
        this.off = i10;
        writeString(str);
        int i11 = this.off;
        byte[] bArrGrow2 = this.bytes;
        if (i11 == bArrGrow2.length) {
            bArrGrow2 = grow(i11 + 1);
        }
        bArrGrow2[i11] = JSONB.Constants.BC_STR_UTF16BE;
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr, int i9, int i10, boolean z9) {
        int i11;
        int i12;
        char c10;
        boolean z10 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int iM6834g = AbstractC3199a.m6834g(cArr.length, 3, this.off, 2);
        if (z10) {
            iM6834g += i10 * 3;
        }
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i13 = this.off;
        if (z9) {
            bArr[i13] = (byte) this.quote;
            i13++;
        }
        int i14 = i9 + i10;
        int i15 = i13;
        int i16 = i9;
        while (i16 < i14 && (c10 = cArr[i16]) != this.quote && c10 != '\\' && c10 >= ' ' && c10 <= 127) {
            bArr[i15] = (byte) c10;
            i16++;
            i15++;
        }
        if (i16 == i14) {
            if (z9) {
                bArr[i15] = (byte) this.quote;
                i15++;
            }
            this.off = i15;
            return;
        }
        while (i16 < i14) {
            char c11 = cArr[i16];
            if (c11 <= 127) {
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
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 117;
                            bArr[i15 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 5] = (byte) (c11 + '0');
                            i15 += 6;
                            break;
                        case '\b':
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 98;
                            break;
                        case '\t':
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 116;
                            break;
                        case '\n':
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 110;
                            break;
                        case 11:
                        case 14:
                        case 15:
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 117;
                            bArr[i15 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 5] = (byte) (c11 + 'W');
                            i15 += 6;
                            break;
                        case '\f':
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 102;
                            break;
                        case '\r':
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 114;
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
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 117;
                            bArr[i15 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 4] = 49;
                            bArr[i15 + 5] = (byte) (c11 + ' ');
                            i15 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            bArr[i15] = 92;
                            bArr[i15 + 1] = 117;
                            bArr[i15 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr[i15 + 4] = 49;
                            bArr[i15 + 5] = (byte) (c11 + 'G');
                            i15 += 6;
                            break;
                        default:
                            char c12 = this.quote;
                            if (c11 != c12) {
                                bArr[i15] = (byte) c11;
                                i15++;
                            } else {
                                bArr[i15] = 92;
                                bArr[i15 + 1] = (byte) c12;
                            }
                            break;
                    }
                } else {
                    bArr[i15] = 92;
                    bArr[i15 + 1] = 92;
                }
                i15 += 2;
            } else if (z10) {
                bArr[i15] = 92;
                bArr[i15 + 1] = 117;
                char[] cArr2 = JSONWriter.DIGITS;
                bArr[i15 + 2] = (byte) cArr2[(c11 >>> '\f') & 15];
                bArr[i15 + 3] = (byte) cArr2[(c11 >>> '\b') & 15];
                bArr[i15 + 4] = (byte) cArr2[(c11 >>> 4) & 15];
                bArr[i15 + 5] = (byte) cArr2[c11 & 15];
                i15 += 6;
            } else if (c11 >= 55296 && c11 < 57344) {
                if (c11 < 56320) {
                    if (cArr.length - i16 < 2) {
                        i12 = -1;
                    } else {
                        char c13 = cArr[i16 + 1];
                        if (c13 < 56320 || c13 >= 57344) {
                            i11 = i15 + 1;
                            bArr[i15] = 63;
                        } else {
                            i12 = ((c11 << '\n') + c13) - 56613888;
                        }
                    }
                    if (i12 < 0) {
                        i11 = i15 + 1;
                        bArr[i15] = 63;
                    } else {
                        bArr[i15] = (byte) ((i12 >> 18) | 240);
                        bArr[i15 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr[i15 + 2] = (byte) ((63 & (i12 >> 6)) | 128);
                        bArr[i15 + 3] = (byte) ((i12 & 63) | 128);
                        i11 = i15 + 4;
                        i16++;
                    }
                } else {
                    i11 = i15 + 1;
                    bArr[i15] = 63;
                }
                i15 = i11;
            } else if (c11 > 2047) {
                bArr[i15] = (byte) (((c11 >> '\f') & 15) | 224);
                bArr[i15 + 1] = (byte) ((63 & (c11 >> 6)) | 128);
                bArr[i15 + 2] = (byte) ((c11 & '?') | 128);
                i15 += 3;
            } else {
                bArr[i15] = (byte) (((c11 >> 6) & 31) | Opcodes.CHECKCAST);
                bArr[i15 + 1] = (byte) ((c11 & '?') | 128);
                i15 += 2;
            }
            i16++;
        }
        if (z9) {
            bArr[i15] = (byte) this.quote;
            i15++;
        }
        this.off = i15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x004f. Please report as an issue. */
    public void writeStringEscaped(byte[] bArr) {
        int i9;
        int iM6834g = AbstractC3199a.m6834g(bArr.length, 6, this.off, 2);
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        boolean z9 = (this.context.features & JSONWriter.Feature.BrowserSecure.mask) != 0;
        byte[] bArr2 = this.bytes;
        int i10 = this.off;
        int i11 = i10 + 1;
        bArr2[i10] = (byte) this.quote;
        for (byte b10 : bArr) {
            if (b10 != 40 && b10 != 41 && b10 != 60 && b10 != 62) {
                if (b10 != 92) {
                    switch (b10) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 117;
                            bArr2[i11 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 5] = (byte) (b10 + JSONB.Constants.BC_INT32_BYTE_MIN);
                            i11 += 6;
                            break;
                        case 8:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 98;
                            break;
                        case 9:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 116;
                            break;
                        case 10:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 110;
                            break;
                        case 11:
                        case 14:
                        case 15:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 117;
                            bArr2[i11 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 5] = (byte) (b10 + 87);
                            i11 += 6;
                            break;
                        case 12:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 102;
                            break;
                        case 13:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 114;
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
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 117;
                            bArr2[i11 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 4] = 49;
                            bArr2[i11 + 5] = (byte) (b10 + 32);
                            i11 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            bArr2[i11] = 92;
                            bArr2[i11 + 1] = 117;
                            bArr2[i11 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i11 + 4] = 49;
                            bArr2[i11 + 5] = (byte) (b10 + JSONB.Constants.BC_INT32_SHORT_MAX);
                            i11 += 6;
                            break;
                        default:
                            byte b11 = this.quote;
                            if (b10 == b11) {
                                bArr2[i11] = 92;
                                bArr2[i11 + 1] = b11;
                            } else if (b10 < 0) {
                                bArr2[i11] = (byte) (((b10 & 255) >> 6) | Opcodes.CHECKCAST);
                                bArr2[i11 + 1] = (byte) ((b10 & 63) | 128);
                            } else {
                                i9 = i11 + 1;
                                bArr2[i11] = b10;
                                i11 = i9;
                            }
                            break;
                    }
                } else {
                    bArr2[i11] = 92;
                    bArr2[i11 + 1] = 92;
                }
                i11 += 2;
            } else if (z9) {
                bArr2[i11] = 92;
                bArr2[i11 + 1] = 117;
                bArr2[i11 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                bArr2[i11 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                char[] cArr = JSONWriter.DIGITS;
                bArr2[i11 + 4] = (byte) cArr[(b10 >>> 4) & 15];
                bArr2[i11 + 5] = (byte) cArr[b10 & 15];
                i11 += 6;
            } else {
                i9 = i11 + 1;
                bArr2[i11] = b10;
                i11 = i9;
            }
        }
        bArr2[i11] = (byte) this.quote;
        this.off = i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0038. Please report as an issue. */
    public final void writeStringEscapedRest(char[] cArr, int i9, boolean z9, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        int iM6834g = AbstractC3199a.m6834g(cArr.length - i10, 6, this.off, 2);
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i14 = this.off;
        while (i10 < i9) {
            char c10 = cArr[i10];
            if (c10 <= 127) {
                if (c10 != '(' && c10 != ')' && c10 != '<' && c10 != '>') {
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
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 117;
                                bArr[i14 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 5] = (byte) (c10 + '0');
                                i14 += 6;
                                break;
                            case '\b':
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 98;
                                break;
                            case '\t':
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 116;
                                break;
                            case '\n':
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 110;
                                break;
                            case 11:
                            case 14:
                            case 15:
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 117;
                                bArr[i14 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 5] = (byte) (c10 + 'W');
                                i14 += 6;
                                break;
                            case '\f':
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 102;
                                break;
                            case '\r':
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 114;
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
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 117;
                                bArr[i14 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 4] = 49;
                                bArr[i14 + 5] = (byte) (c10 + ' ');
                                i14 += 6;
                                break;
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                bArr[i14] = 92;
                                bArr[i14 + 1] = 117;
                                bArr[i14 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                                bArr[i14 + 4] = 49;
                                bArr[i14 + 5] = (byte) (c10 + 'G');
                                i14 += 6;
                                break;
                            default:
                                char c11 = this.quote;
                                if (c10 != c11) {
                                    i13 = i14 + 1;
                                    bArr[i14] = (byte) c10;
                                    i14 = i13;
                                } else {
                                    bArr[i14] = 92;
                                    bArr[i14 + 1] = (byte) c11;
                                }
                                break;
                        }
                    } else {
                        bArr[i14] = 92;
                        bArr[i14 + 1] = 92;
                    }
                    i14 += 2;
                } else if (z9) {
                    bArr[i14] = 92;
                    bArr[i14 + 1] = 117;
                    bArr[i14 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                    bArr[i14 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                    char[] cArr2 = JSONWriter.DIGITS;
                    bArr[i14 + 4] = (byte) cArr2[(c10 >>> 4) & 15];
                    bArr[i14 + 5] = (byte) cArr2[c10 & 15];
                    i14 += 6;
                } else {
                    i13 = i14 + 1;
                    bArr[i14] = (byte) c10;
                    i14 = i13;
                }
            } else if (z10) {
                bArr[i14] = 92;
                bArr[i14 + 1] = 117;
                char[] cArr3 = JSONWriter.DIGITS;
                bArr[i14 + 2] = (byte) cArr3[(c10 >>> '\f') & 15];
                bArr[i14 + 3] = (byte) cArr3[(c10 >>> '\b') & 15];
                bArr[i14 + 4] = (byte) cArr3[(c10 >>> 4) & 15];
                bArr[i14 + 5] = (byte) cArr3[c10 & 15];
                i14 += 6;
            } else if (c10 >= 55296 && c10 < 57344) {
                if (c10 < 56320) {
                    if (cArr.length - i10 < 2) {
                        i12 = -1;
                    } else {
                        char c12 = cArr[i10 + 1];
                        if (c12 < 56320 || c12 >= 57344) {
                            i11 = i14 + 1;
                            bArr[i14] = 63;
                        } else {
                            i12 = ((c10 << '\n') + c12) - 56613888;
                        }
                    }
                    if (i12 < 0) {
                        i11 = i14 + 1;
                        bArr[i14] = 63;
                    } else {
                        bArr[i14] = (byte) ((i12 >> 18) | 240);
                        bArr[i14 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr[i14 + 2] = (byte) ((63 & (i12 >> 6)) | 128);
                        bArr[i14 + 3] = (byte) ((i12 & 63) | 128);
                        i11 = i14 + 4;
                        i10++;
                    }
                } else {
                    i11 = i14 + 1;
                    bArr[i14] = 63;
                }
                i14 = i11;
            } else if (c10 > 2047) {
                bArr[i14] = (byte) (((c10 >> '\f') & 15) | 224);
                bArr[i14 + 1] = (byte) ((63 & (c10 >> 6)) | 128);
                bArr[i14 + 2] = (byte) ((c10 & '?') | 128);
                i14 += 3;
            } else {
                bArr[i14] = (byte) (((c10 >> 6) & 31) | Opcodes.CHECKCAST);
                bArr[i14 + 1] = (byte) ((c10 & '?') | 128);
                i14 += 2;
            }
            i10++;
        }
        this.off = i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] bArr) {
        boolean z9;
        if (bArr == null) {
            writeStringNull();
            return;
        }
        boolean z10 = (this.context.features & JSONWriter.Feature.BrowserSecure.mask) != 0;
        byte b10 = (byte) this.quote;
        for (byte b11 : bArr) {
            if (b11 == b10 || b11 == 92 || b11 < 32 || (z10 && (b11 == 60 || b11 == 62 || b11 == 40 || b11 == 41))) {
                z9 = true;
                break;
            }
        }
        z9 = false;
        int i9 = this.off;
        if (z9) {
            writeStringEscaped(bArr);
            return;
        }
        int length = bArr.length + i9 + 2;
        if (length >= this.bytes.length) {
            ensureCapacity(length);
        }
        byte[] bArr2 = this.bytes;
        bArr2[i9] = b10;
        System.arraycopy(bArr, 0, bArr2, i9 + 1, bArr.length);
        int length2 = bArr.length + 1 + i9;
        bArr2[length2] = b10;
        this.off = length2 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x006e. Please report as an issue. */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] bArr) {
        int i9;
        int i10;
        if (bArr == null) {
            writeStringNull();
            return;
        }
        long j3 = this.context.features;
        int i11 = 0;
        boolean z9 = (JSONWriter.Feature.EscapeNoneAscii.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i12 = this.off;
        int iM6834g = AbstractC3199a.m6834g(bArr.length, 4, i12, 2);
        if (z9) {
            iM6834g += bArr.length * 2;
        }
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr2 = this.bytes;
        int i13 = i12 + 1;
        bArr2[i12] = (byte) this.quote;
        while (i11 < bArr.length) {
            byte b10 = bArr[i11];
            int i14 = i11 + 2;
            byte b11 = bArr[i11 + 1];
            if (b11 != 0 || b10 < 0) {
                char c10 = (char) (((b11 & 255) << 8) | (b10 & 255));
                if (c10 < 2048) {
                    bArr2[i13] = (byte) ((c10 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i13 + 1] = (byte) ((c10 & '?') | 128);
                    i13 += 2;
                } else if (z9) {
                    bArr2[i13] = 92;
                    bArr2[i13 + 1] = 117;
                    char[] cArr = JSONWriter.DIGITS;
                    bArr2[i13 + 2] = (byte) cArr[(c10 >>> '\f') & 15];
                    bArr2[i13 + 3] = (byte) cArr[(c10 >>> '\b') & 15];
                    bArr2[i13 + 4] = (byte) cArr[(c10 >>> 4) & 15];
                    bArr2[i13 + 5] = (byte) cArr[c10 & 15];
                    i13 += 6;
                } else if (c10 < 55296 || c10 >= 57344) {
                    bArr2[i13] = (byte) ((c10 >> '\f') | 224);
                    bArr2[i13 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                    bArr2[i13 + 2] = (byte) ((c10 & '?') | 128);
                    i13 += 3;
                } else {
                    int i15 = i11 + 1;
                    if (c10 < 56320) {
                        if (bArr.length - i15 < 2) {
                            i10 = -1;
                        } else {
                            char c11 = (char) ((bArr[i11 + 2] & 255) | ((bArr[i11 + 3] & 255) << 8));
                            if (c11 < 56320 || c11 >= 57344) {
                                i9 = i13 + 1;
                                bArr2[i13] = 63;
                            } else {
                                i14 = i11 + 4;
                                i10 = ((c10 << '\n') + c11) - 56613888;
                            }
                        }
                        if (i10 < 0) {
                            i9 = i13 + 1;
                            bArr2[i13] = 63;
                        } else {
                            bArr2[i13] = (byte) ((i10 >> 18) | 240);
                            bArr2[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr2[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr2[i13 + 3] = (byte) ((i10 & 63) | 128);
                            i9 = i13 + 4;
                        }
                    } else {
                        i9 = i13 + 1;
                        bArr2[i13] = 63;
                    }
                    i13 = i9;
                }
            } else if (b10 != 40 && b10 != 41 && b10 != 60 && b10 != 62) {
                if (b10 != 92) {
                    switch (b10) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 117;
                            bArr2[i13 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 5] = (byte) (b10 + JSONB.Constants.BC_INT32_BYTE_MIN);
                            i13 += 6;
                            break;
                        case 8:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 98;
                            break;
                        case 9:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 116;
                            break;
                        case 10:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 110;
                            break;
                        case 11:
                        case 14:
                        case 15:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 117;
                            bArr2[i13 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 4] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 5] = (byte) (b10 + 87);
                            i13 += 6;
                            break;
                        case 12:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 102;
                            break;
                        case 13:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 114;
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
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 117;
                            bArr2[i13 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 4] = 49;
                            bArr2[i13 + 5] = (byte) (b10 + 32);
                            i13 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            bArr2[i13] = 92;
                            bArr2[i13 + 1] = 117;
                            bArr2[i13 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                            bArr2[i13 + 4] = 49;
                            bArr2[i13 + 5] = (byte) (b10 + JSONB.Constants.BC_INT32_SHORT_MAX);
                            i13 += 6;
                            break;
                        default:
                            byte b12 = this.quote;
                            if (b10 != b12) {
                                i9 = i13 + 1;
                                bArr2[i13] = b10;
                                i13 = i9;
                            } else {
                                bArr2[i13] = 92;
                                bArr2[i13 + 1] = b12;
                            }
                            break;
                    }
                } else {
                    bArr2[i13] = 92;
                    bArr2[i13 + 1] = 92;
                }
                i13 += 2;
            } else if (z10) {
                bArr2[i13] = 92;
                bArr2[i13 + 1] = 117;
                bArr2[i13 + 2] = JSONB.Constants.BC_INT32_BYTE_MIN;
                bArr2[i13 + 3] = JSONB.Constants.BC_INT32_BYTE_MIN;
                char[] cArr2 = JSONWriter.DIGITS;
                bArr2[i13 + 4] = (byte) cArr2[(b10 >>> 4) & 15];
                bArr2[i13 + 5] = (byte) cArr2[b10 & 15];
                i13 += 6;
            } else {
                i9 = i13 + 1;
                bArr2[i13] = b10;
                i13 = i9;
            }
            i11 = i14;
        }
        bArr2[i13] = (byte) this.quote;
        this.off = i13 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTimeHHMMSS8(int i9, int i10, int i11) {
        int i12 = this.off;
        int i13 = i12 + 10;
        if (i13 >= this.bytes.length) {
            ensureCapacity(i13);
        }
        byte[] bArr = this.bytes;
        char c10 = this.quote;
        bArr[i12] = (byte) c10;
        int[] iArr = IOUtils.DIGITS_K;
        int i14 = iArr[i9];
        bArr[i12 + 1] = (byte) (i14 >> 8);
        bArr[i12 + 2] = (byte) i14;
        bArr[i12 + 3] = 58;
        int i15 = iArr[i10];
        bArr[i12 + 4] = (byte) (i15 >> 8);
        bArr[i12 + 5] = (byte) i15;
        bArr[i12 + 6] = 58;
        int i16 = iArr[i11];
        bArr[i12 + 7] = (byte) (i16 >> 8);
        bArr[i12 + 8] = (byte) i16;
        bArr[i12 + 9] = (byte) c10;
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
        if (i9 >= this.bytes.length) {
            ensureCapacity(i9);
        }
        char[] cArr = JSONFactory.UUID_LOOKUP;
        byte[] bArr = this.bytes;
        int i10 = this.off;
        bArr[i10] = 34;
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
        bArr[i10 + 1] = (byte) (c10 >> '\b');
        bArr[i10 + 2] = (byte) c10;
        bArr[i10 + 3] = (byte) (c11 >> '\b');
        bArr[i10 + 4] = (byte) c11;
        bArr[i10 + 5] = (byte) (c12 >> '\b');
        bArr[i10 + 6] = (byte) c12;
        bArr[i10 + 7] = (byte) (c13 >> '\b');
        bArr[i10 + 8] = (byte) c13;
        bArr[i10 + 9] = 45;
        bArr[i10 + 10] = (byte) (c14 >> '\b');
        bArr[i10 + 11] = (byte) c14;
        bArr[i10 + 12] = (byte) (c15 >> '\b');
        bArr[i10 + 13] = (byte) c15;
        bArr[i10 + 14] = 45;
        bArr[i10 + 15] = (byte) (c16 >> '\b');
        bArr[i10 + 16] = (byte) c16;
        bArr[i10 + 17] = (byte) (c17 >> '\b');
        bArr[i10 + 18] = (byte) c17;
        bArr[i10 + 19] = 45;
        bArr[i10 + 20] = (byte) (c18 >> '\b');
        bArr[i10 + 21] = (byte) c18;
        bArr[i10 + 22] = (byte) (c19 >> '\b');
        bArr[i10 + 23] = (byte) c19;
        bArr[i10 + 24] = 45;
        bArr[i10 + 25] = (byte) (c20 >> '\b');
        bArr[i10 + 26] = (byte) c20;
        bArr[i10 + 27] = (byte) (c21 >> '\b');
        bArr[i10 + 28] = (byte) c21;
        bArr[i10 + 29] = (byte) (c22 >> '\b');
        bArr[i10 + 30] = (byte) c22;
        bArr[i10 + 31] = (byte) (c23 >> '\b');
        bArr[i10 + 32] = (byte) c23;
        bArr[i10 + 33] = (byte) (c24 >> '\b');
        bArr[i10 + 34] = (byte) c24;
        bArr[i10 + 35] = (byte) (c25 >> '\b');
        bArr[i10 + 36] = (byte) c25;
        bArr[i10 + 37] = 34;
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
        if (i12 >= this.bytes.length) {
            ensureCapacity(i12);
        }
        byte[] bArr = this.bytes;
        int i13 = i11 + 1;
        bArr[i11] = (byte) this.quote;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i13, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArr[iWriteLocalDate] = 84;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, zonedDateTime.toLocalTime());
        if (i9 == 1) {
            i10 = iWriteLocalTime + 1;
            bArr[iWriteLocalTime] = 90;
        } else if (cCharAt == '+' || cCharAt == '-') {
            id2.getBytes(0, length, bArr, iWriteLocalTime);
            i10 = iWriteLocalTime + length;
        } else {
            int i14 = iWriteLocalTime + 1;
            bArr[iWriteLocalTime] = 91;
            id2.getBytes(0, length, bArr, i14);
            int i15 = i14 + length;
            bArr[i15] = 93;
            i10 = i15 + 1;
        }
        bArr[i10] = (byte) this.quote;
        this.off = i10 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes() {
        return Arrays.copyOf(this.bytes, this.off);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] bArr, int i9, int i10) {
        int i11 = this.off + i10 + 2 + this.indent;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            writeComma();
        }
        System.arraycopy(bArr, i9, this.bytes, this.off, i10);
        this.off += i10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] cArr, int i9, int i10) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(OutputStream outputStream) throws IOException {
        int i9 = this.off;
        if (i9 > 0) {
            outputStream.write(this.bytes, 0, i9);
            this.off = 0;
        }
        return i9;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte[] bArr) {
        int length = this.off + bArr.length;
        if (length >= this.bytes.length) {
            ensureCapacity(length);
        }
        System.arraycopy(bArr, 0, this.bytes, this.off, bArr.length);
        this.off += bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double d10) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 26;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        byte[] bArr = this.bytes;
        if (z9) {
            bArr[i9] = 34;
            i9++;
        }
        int string = DoubleToDecimal.toString(d10, bArr, i9, true) + i9;
        if (z9) {
            bArr[string] = 34;
            string++;
        }
        this.off = string;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char c10) {
        if (c10 <= 128) {
            int i9 = this.off;
            if (i9 == this.bytes.length) {
                ensureCapacity(i9 + 1);
            }
            byte[] bArr = this.bytes;
            int i10 = this.off;
            this.off = i10 + 1;
            bArr[i10] = (byte) c10;
            return;
        }
        C0086a.m448g(c10, "not support ");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int i9) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i10 = this.off;
        int i11 = i10 + 13;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        byte[] bArr = this.bytes;
        if (z9) {
            bArr[i10] = (byte) this.quote;
            i10++;
        }
        int iWriteInt32 = IOUtils.writeInt32(bArr, i10, i9);
        if (z9) {
            bArr[iWriteInt32] = (byte) this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float f3) {
        boolean z9 = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i9 = this.off;
        int i10 = i9 + 17;
        if (i10 >= this.bytes.length) {
            ensureCapacity(i10);
        }
        if (z9) {
            this.bytes[i9] = 34;
            i9++;
        }
        int string = DoubleToDecimal.toString(f3, this.bytes, i9, true) + i9;
        if (z9) {
            this.bytes[string] = 34;
            string++;
        }
        this.off = string;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char c10, char c11) {
        if (c10 > 128) {
            C0086a.m448g(c10, "not support ");
            return;
        }
        if (c11 <= 128) {
            int i9 = this.off;
            int i10 = i9 + 1;
            if (i10 >= this.bytes.length) {
                ensureCapacity(i9 + 2);
            }
            byte[] bArr = this.bytes;
            bArr[i9] = (byte) c10;
            bArr[i10] = (byte) c11;
            this.off = i9 + 2;
            return;
        }
        C0086a.m448g(c11, "not support ");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long j3) {
        int i9;
        long j4 = this.context.features;
        boolean z9 = ((JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask) & j4) != 0 || ((JSONWriter.Feature.BrowserCompatible.mask & j4) != 0 && (j3 > 9007199254740991L || j3 < -9007199254740991L));
        int i10 = this.off;
        int i11 = i10 + 23;
        if (i11 >= this.bytes.length) {
            ensureCapacity(i11);
        }
        byte[] bArr = this.bytes;
        if (z9) {
            bArr[i10] = (byte) this.quote;
            i10++;
        }
        int iWriteInt64 = IOUtils.writeInt64(bArr, i10, j3);
        if (z9) {
            i9 = iWriteInt64 + 1;
            bArr[iWriteInt64] = (byte) this.quote;
        } else {
            if ((JSONWriter.Feature.WriteClassName.mask & j4) != 0 && (j4 & JSONWriter.Feature.NotWriteNumberClassName.mask) == 0 && j3 >= -2147483648L && j3 <= 2147483647L) {
                i9 = iWriteInt64 + 1;
                bArr[iWriteInt64] = 76;
            }
            this.off = iWriteInt64;
        }
        iWriteInt64 = i9;
        this.off = iWriteInt64;
    }

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
        if (i9 == this.bytes.length) {
            ensureCapacity(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = 91;
        int size = list.size();
        boolean z9 = true;
        int i11 = 0;
        while (i11 < size) {
            if (!z9) {
                int i12 = this.off;
                if (i12 == this.bytes.length) {
                    ensureCapacity(i12 + 1);
                }
                byte[] bArr2 = this.bytes;
                int i13 = this.off;
                this.off = i13 + 1;
                bArr2[i13] = 44;
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
        if (i14 == this.bytes.length) {
            ensureCapacity(i14 + 1);
        }
        byte[] bArr3 = this.bytes;
        int i15 = this.off;
        this.off = i15 + 1;
        bArr3[i15] = 93;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        int i9;
        JSONWriterUTF8 jSONWriterUTF8;
        char c10;
        if (str == null) {
            writeStringNull();
            return;
        }
        char[] charArray = str.toCharArray();
        long j3 = this.context.features;
        int i10 = 0;
        boolean z9 = true;
        boolean z10 = (JSONWriter.Feature.BrowserSecure.mask & j3) != 0;
        if ((j3 & JSONWriter.Feature.EscapeNoneAscii.mask) != 0) {
            i9 = 1;
        } else {
            i9 = 1;
            z9 = false;
        }
        int i11 = this.off;
        int iM6834g = AbstractC3199a.m6834g(charArray.length, 3, i11, 2);
        if (z9 || z10) {
            iM6834g += charArray.length * 3;
        }
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i12 = i11 + 1;
        bArr[i11] = (byte) this.quote;
        while (i10 < charArray.length && (c10 = charArray[i10]) != this.quote && c10 != '\\' && c10 >= ' ' && c10 <= 127 && (!z10 || (c10 != '<' && c10 != '>' && c10 != '(' && c10 != ')'))) {
            bArr[i12] = (byte) c10;
            i10++;
            i12++;
        }
        if (i10 == charArray.length) {
            bArr[i12] = (byte) this.quote;
            this.off = i12 + i9;
            return;
        }
        this.off = i12;
        if (i10 < charArray.length) {
            int i13 = i10;
            jSONWriterUTF8 = this;
            jSONWriterUTF8.writeStringEscapedRest(charArray, charArray.length, z10, z9, i13);
        } else {
            jSONWriterUTF8 = this;
        }
        byte[] bArr2 = jSONWriterUTF8.bytes;
        int i14 = jSONWriterUTF8.off;
        jSONWriterUTF8.off = i14 + 1;
        bArr2[i14] = (byte) jSONWriterUTF8.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean z9) {
        byte b10 = (byte) this.quote;
        byte[] bArr = this.bytes;
        int i9 = this.off;
        this.off = i9 + 1;
        bArr[i9] = b10;
        writeBool(z9);
        byte[] bArr2 = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr2[i10] = b10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(byte b10) {
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
    public void writeString(short s10) {
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
    public void writeString(int i9) {
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
    public void writeString(long j3) {
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
    public void writeString(char[] cArr) {
        JSONWriterUTF8 jSONWriterUTF8;
        char c10;
        if (cArr == null) {
            writeStringNull();
            return;
        }
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.BrowserSecure.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i9 = this.off;
        int iM6834g = AbstractC3199a.m6834g(cArr.length, 3, i9, 2);
        if (z10 || z9) {
            iM6834g += cArr.length * 3;
        }
        if (iM6834g >= this.bytes.length) {
            ensureCapacity(iM6834g);
        }
        byte[] bArr = this.bytes;
        int i10 = i9 + 1;
        bArr[i9] = (byte) this.quote;
        int i11 = 0;
        while (i11 < cArr.length && (c10 = cArr[i11]) != this.quote && c10 != '\\' && c10 >= ' ' && c10 <= 127 && (!z9 || (c10 != '<' && c10 != '>' && c10 != '(' && c10 != ')'))) {
            bArr[i10] = (byte) c10;
            i11++;
            i10++;
        }
        this.off = i10;
        int length = ((cArr.length - i11) * 6) + i10 + 2;
        if (length >= this.bytes.length) {
            ensureCapacity(length);
        }
        if (i11 < cArr.length) {
            jSONWriterUTF8 = this;
            jSONWriterUTF8.writeStringEscapedRest(cArr, cArr.length, z9, z10, i11);
        } else {
            jSONWriterUTF8 = this;
        }
        byte[] bArr2 = jSONWriterUTF8.bytes;
        int i12 = jSONWriterUTF8.off;
        jSONWriterUTF8.off = i12 + 1;
        bArr2[i12] = (byte) jSONWriterUTF8.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] cArr, int i9, int i10) {
        if (cArr == null) {
            if (isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                writeString(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            } else {
                writeNull();
                return;
            }
        }
        int i11 = i9 + i10;
        long j3 = this.context.features;
        boolean z9 = (JSONWriter.Feature.BrowserSecure.mask & j3) != 0;
        boolean z10 = (j3 & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i12 = this.off;
        int i13 = i10 * 3;
        int i14 = i12 + i13 + 2;
        if (z10 || z9) {
            i14 += i13;
        }
        if (i14 >= this.bytes.length) {
            ensureCapacity(i14);
        }
        byte[] bArr = this.bytes;
        int i15 = i12 + 1;
        bArr[i12] = (byte) this.quote;
        int i16 = i9;
        while (i16 < i11) {
            char c10 = cArr[i16];
            if (c10 == this.quote || c10 == '\\' || c10 < ' ' || c10 > 127 || (z9 && (c10 == '<' || c10 == '>' || c10 == '(' || c10 == ')'))) {
                break;
            }
            bArr[i15] = (byte) c10;
            i16++;
            i15++;
        }
        this.off = i15;
        int i17 = ((i11 - i16) * 6) + i15 + 2;
        if (i17 >= this.bytes.length) {
            ensureCapacity(i17);
        }
        if (i16 < i11) {
            writeStringEscapedRest(cArr, i11, z9, z10, i16);
        }
        byte[] bArr2 = this.bytes;
        int i18 = this.off;
        this.off = i18 + 1;
        bArr2[i18] = (byte) this.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(List<String> list) {
        if (this.pretty != 0) {
            super.writeString(list);
            return;
        }
        int i9 = this.off;
        if (i9 == this.bytes.length) {
            grow(i9 + 1);
        }
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = 91;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                int i12 = this.off;
                if (i12 == this.bytes.length) {
                    ensureCapacity(i12 + 1);
                }
                byte[] bArr2 = this.bytes;
                int i13 = this.off;
                this.off = i13 + 1;
                bArr2[i13] = 44;
            }
            writeString(list.get(i11));
        }
        int i14 = this.off;
        if (i14 == this.bytes.length) {
            ensureCapacity(i14 + 1);
        }
        byte[] bArr3 = this.bytes;
        int i15 = this.off;
        this.off = i15 + 1;
        bArr3[i15] = 93;
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
}
