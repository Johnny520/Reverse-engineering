package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.support.csv.CSVWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class CSVWriterUTF8 extends CSVWriter {
    private static final short DOUBLE_QUOTE_2_LATIN1 = 8738;
    final byte[] bytes;
    final Charset charset;
    final OutputStream out;

    public CSVWriterUTF8(OutputStream outputStream, Charset charset, ZoneId zoneId, CSVWriter.Feature... featureArr) {
        super(zoneId, featureArr);
        this.out = outputStream;
        this.charset = charset;
        this.bytes = new byte[524288];
    }

    private void writeRaw(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.off;
        int i11 = length + i10;
        byte[] bArr2 = this.bytes;
        if (i11 < bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, i10, bArr.length);
            this.off += bArr.length;
            return;
        }
        flush();
        int length2 = bArr.length;
        byte[] bArr3 = this.bytes;
        if (length2 >= bArr3.length) {
            writeDirect(bArr, 0, bArr.length);
        } else {
            System.arraycopy(bArr, 0, bArr3, this.off, bArr.length);
            this.off += bArr.length;
        }
    }

    public void checkCapacity(int i10) {
        if (this.off + i10 >= this.bytes.length) {
            flush();
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.off > 0) {
            flush();
        }
        this.out.close();
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter, java.io.Flushable
    public void flush() {
        try {
            this.out.write(this.bytes, 0, this.off);
            this.off = 0;
            this.out.flush();
        } catch (IOException e10) {
            C1565a.m6255a("write csv error", e10);
        }
    }

    public String toString() {
        if (!(this.out instanceof ByteArrayOutputStream)) {
            return super.toString();
        }
        flush();
        return new String(((ByteArrayOutputStream) this.out).toByteArray(), StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeBoolean(boolean z10) {
        checkCapacity(5);
        this.off = IOUtils.putBoolean(this.bytes, this.off, z10);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeComma() {
        checkCapacity(1);
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = 44;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateTime19(int i10, int i11, int i12, int i13, int i14, int i15) {
        checkCapacity(19);
        byte[] bArr = this.bytes;
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, this.off, i10, i11, i12);
        bArr[iWriteLocalDate] = 32;
        IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, i13, i14, i15);
        this.off = iWriteLocalDate + 9;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateYYYMMDD10(int i10, int i11, int i12) {
        checkCapacity(10);
        this.off = IOUtils.writeLocalDate(this.bytes, this.off, i10, i11, i12);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(long j10, int i10) {
        if (i10 == 0) {
            writeInt64(j10);
            return;
        }
        if (j10 == Long.MIN_VALUE || i10 >= 20 || i10 < 0) {
            writeDecimal(BigDecimal.valueOf(j10, i10));
            return;
        }
        int i11 = this.off;
        byte[] bArr = this.bytes;
        if (i11 + 24 > bArr.length) {
            flush();
            i11 = 0;
        }
        this.off = IOUtils.writeDecimal(bArr, i11, j10, i10);
    }

    public void writeDirect(byte[] bArr, int i10, int i11) {
        try {
            this.out.write(bArr, i10, i11);
        } catch (IOException e10) {
            C1565a.m6255a("write csv error", e10);
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDouble(double d10) {
        checkCapacity(24);
        this.off = NumberUtils.writeDouble(this.bytes, this.off, d10, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeFloat(float f10) {
        checkCapacity(15);
        this.off = NumberUtils.writeFloat(this.bytes, this.off, f10, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt32(int i10) {
        checkCapacity(11);
        this.off = IOUtils.writeInt32(this.bytes, this.off, i10);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt64(long j10) {
        checkCapacity(20);
        this.off = IOUtils.writeInt64(this.bytes, this.off, j10);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLine() {
        checkCapacity(1);
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = 10;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return;
        }
        int i10 = this.off;
        byte[] bArr = this.bytes;
        if (i10 + 19 > bArr.length) {
            flush();
            i10 = 0;
        }
        int iWriteLocalDate = IOUtils.writeLocalDate(bArr, i10, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        bArr[iWriteLocalDate] = 32;
        this.off = IOUtils.writeLocalTime(bArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeQuote() {
        checkCapacity(1);
        byte[] bArr = this.bytes;
        int i10 = this.off;
        this.off = i10 + 1;
        bArr[i10] = 34;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(byte[] bArr) {
        int i10;
        boolean z10;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        int length = bArr.length;
        if (bArr[0] == 34) {
            i10 = 0;
            for (byte b10 : bArr) {
                if (b10 == 34) {
                    i10++;
                }
            }
            z10 = false;
        } else {
            i10 = 0;
            z10 = false;
            for (byte b11 : bArr) {
                if (b11 == 44) {
                    z10 = true;
                } else if (b11 == 34 || b11 == 10 || b11 == 13) {
                    i10++;
                }
            }
            if (!z10) {
                i10 = 0;
            }
        }
        if (i10 == 0 && !z10) {
            writeRaw(bArr);
            return;
        }
        checkCapacity(length + 2 + i10);
        byte[] bArr2 = this.bytes;
        int length2 = bArr2.length - 2;
        int i11 = this.off;
        int i12 = i11 + 1;
        bArr2[i11] = 34;
        for (byte b12 : bArr) {
            if (b12 == 34) {
                IOUtils.putShortUnaligned(bArr2, i12, DOUBLE_QUOTE_2_LATIN1);
                i12 += 2;
            } else {
                bArr2[i12] = b12;
                i12++;
            }
            if (i12 >= length2) {
                flush();
                i12 = this.off;
            }
        }
        bArr2[i12] = 34;
        this.off = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return;
        }
        String string = bigDecimal.toString();
        int length = string.length();
        checkCapacity(24);
        string.getBytes(0, length, this.bytes, this.off);
        this.off += length;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeRaw(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        writeRaw(str.getBytes(this.charset));
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(String str) {
        byte[] bytes;
        Function<String, byte[]> function;
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null && toIntFunction.applyAsInt(str) == JDKUtils.LATIN1.byteValue()) {
            bytes = function.apply(str);
        } else {
            bytes = str.getBytes(this.charset);
        }
        writeString(bytes);
    }
}
