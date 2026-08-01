package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.support.csv.CSVWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class CSVWriterUTF16 extends CSVWriter {
    private static final int DOUBLE_QUOTE_2_UTF16 = 2228258;
    final char[] chars;
    final Writer out;

    public CSVWriterUTF16(Writer writer, ZoneId zoneId, CSVWriter.Feature... featureArr) {
        super(zoneId, featureArr);
        this.out = writer;
        this.chars = new char[524288];
    }

    public void checkCapacity(int i10) {
        if (this.off + i10 >= this.chars.length) {
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
            this.out.write(this.chars, 0, this.off);
            this.off = 0;
            this.out.flush();
        } catch (IOException e10) {
            C1565a.m6255a("write csv error", e10);
        }
    }

    public String toString() {
        if (!(this.out instanceof StringWriter)) {
            return super.toString();
        }
        flush();
        return this.out.toString();
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeBoolean(boolean z10) {
        checkCapacity(5);
        this.off = IOUtils.putBoolean(this.chars, this.off, z10);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeComma() {
        checkCapacity(1);
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = ',';
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateTime19(int i10, int i11, int i12, int i13, int i14, int i15) {
        checkCapacity(19);
        char[] cArr = this.chars;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, this.off, i10, i11, i12);
        cArr[iWriteLocalDate] = ' ';
        IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, i13, i14, i15);
        this.off = iWriteLocalDate + 9;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDateYYYMMDD10(int i10, int i11, int i12) {
        checkCapacity(10);
        this.off = IOUtils.writeLocalDate(this.chars, this.off, i10, i11, i12);
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
        char[] cArr = this.chars;
        if (i11 + 24 > cArr.length) {
            flush();
            i11 = 0;
        }
        this.off = IOUtils.writeDecimal(cArr, i11, j10, i10);
    }

    public void writeDirect(char[] cArr, int i10, int i11) {
        try {
            this.out.write(cArr, i10, i11);
        } catch (IOException e10) {
            C1565a.m6255a("write csv error", e10);
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDouble(double d10) {
        checkCapacity(24);
        this.off = NumberUtils.writeDouble(this.chars, this.off, d10, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeFloat(float f10) {
        checkCapacity(15);
        this.off = NumberUtils.writeFloat(this.chars, this.off, f10, true, false);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt32(int i10) {
        checkCapacity(11);
        this.off = IOUtils.writeInt32(this.chars, this.off, i10);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeInt64(long j10) {
        checkCapacity(20);
        this.off = IOUtils.writeInt64(this.chars, this.off, j10);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLine() {
        checkCapacity(1);
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = '\n';
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeLocalDateTime(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return;
        }
        int i10 = this.off;
        char[] cArr = this.chars;
        if (i10 + 19 > cArr.length) {
            flush();
            i10 = 0;
        }
        int iWriteLocalDate = IOUtils.writeLocalDate(cArr, i10, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        cArr[iWriteLocalDate] = ' ';
        this.off = IOUtils.writeLocalTime(cArr, iWriteLocalDate + 1, localDateTime.toLocalTime());
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeQuote() {
        checkCapacity(1);
        char[] cArr = this.chars;
        int i10 = this.off;
        this.off = i10 + 1;
        cArr[i10] = '\"';
    }

    public void writeRaw(char[] cArr) {
        int length = cArr.length;
        int i10 = this.off;
        int i11 = length + i10;
        char[] cArr2 = this.chars;
        if (i11 < cArr2.length) {
            System.arraycopy(cArr, 0, cArr2, i10, cArr.length);
            this.off += cArr.length;
            return;
        }
        flush();
        int length2 = cArr.length;
        char[] cArr3 = this.chars;
        if (length2 >= cArr3.length) {
            writeDirect(cArr, 0, cArr.length);
        } else {
            System.arraycopy(cArr, 0, cArr3, this.off, cArr.length);
            this.off += cArr.length;
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(String str) {
        int i10;
        boolean z10;
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = str.length();
        int i11 = 0;
        if (str.charAt(0) == '\"') {
            i10 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (str.charAt(i12) == '\"') {
                    i10++;
                }
            }
            z10 = false;
        } else {
            i10 = 0;
            z10 = false;
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                if (cCharAt == ',') {
                    z10 = true;
                } else if (cCharAt == '\"' || cCharAt == '\n' || cCharAt == '\r') {
                    i10++;
                }
            }
            if (!z10) {
                i10 = 0;
            }
        }
        if (i10 == 0 && !z10) {
            if (this.off + length >= this.chars.length) {
                flush();
                if (length > this.chars.length) {
                    try {
                        this.out.write(str);
                        return;
                    } catch (IOException e10) {
                        C1565a.m6255a("write csv error", e10);
                        return;
                    }
                }
            }
            str.getChars(0, length, this.chars, this.off);
            this.off += length;
            return;
        }
        checkCapacity(length + 2 + i10);
        char[] cArr = this.chars;
        int length2 = cArr.length - 2;
        int i14 = this.off;
        int i15 = i14 + 1;
        cArr[i14] = '\"';
        while (i11 < length) {
            int i16 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 == '\"') {
                IOUtils.putIntUnaligned(cArr, i15, DOUBLE_QUOTE_2_UTF16);
                i15 += 2;
            } else {
                cArr[i15] = cCharAt2;
                i15++;
            }
            if (i15 >= length2) {
                flush();
                i15 = this.off;
            }
            i11 = i16;
        }
        cArr[i15] = '\"';
        this.off = i15 + 1;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeDecimal(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return;
        }
        String string = bigDecimal.toString();
        int length = string.length();
        checkCapacity(24);
        string.getChars(0, length, this.chars, this.off);
        this.off += length;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeRaw(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        checkCapacity(str.length());
        str.getChars(0, str.length(), this.chars, this.off);
        this.off += str.length();
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVWriter
    public void writeString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        writeString(new String(bArr, StandardCharsets.UTF_8));
    }
}
