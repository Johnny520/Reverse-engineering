package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.C1802v;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CSVWriter implements Closeable, Flushable {
    private long features;
    int off;
    final ZoneId zoneId;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum Feature {
        AlwaysQuoteStrings(1);

        public final long mask;

        Feature(long j10) {
            this.mask = j10;
        }
    }

    public CSVWriter(ZoneId zoneId, Feature... featureArr) {
        for (Feature feature : featureArr) {
            this.features |= feature.mask;
        }
        this.zoneId = zoneId;
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6468of(OutputStream outputStream, Charset charset, ZoneId zoneId) {
        if (charset == StandardCharsets.UTF_16 || charset == StandardCharsets.UTF_16LE || charset == StandardCharsets.UTF_16BE) {
            return m6471of(new OutputStreamWriter(outputStream, charset), zoneId);
        }
        if (charset == null) {
            charset = StandardCharsets.UTF_8;
        }
        return new CSVWriterUTF8(outputStream, charset, zoneId, new Feature[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @Override // java.io.Flushable
    public abstract void flush();

    public void writeBigInteger(BigInteger bigInteger) {
        if (bigInteger == null) {
            return;
        }
        writeRaw(bigInteger.toString());
    }

    public abstract void writeBoolean(boolean z10);

    public abstract void writeComma();

    public final void writeDate(long j10) {
        int shanghaiZoneOffsetTotalSeconds;
        long j11;
        ZoneId zoneId = this.zoneId;
        long jFloorDiv = Math.floorDiv(j10, 1000L);
        if (zoneId == DateUtils.SHANGHAI_ZONE_ID || zoneId.getRules() == DateUtils.SHANGHAI_ZONE_RULES) {
            shanghaiZoneOffsetTotalSeconds = DateUtils.getShanghaiZoneOffsetTotalSeconds(jFloorDiv);
        } else {
            shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(j10)).getTotalSeconds();
        }
        long j12 = jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds);
        long jFloorDiv2 = Math.floorDiv(j12, 86400L);
        int iFloorMod = (int) Math.floorMod(j12, 86400L);
        long j13 = 719468 + jFloorDiv2;
        if (j13 < 0) {
            long j14 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j11 = j14 * 400;
            j13 += (-j14) * 146097;
        } else {
            j11 = 0;
        }
        long j15 = ((j13 * 400) + 591) / 146097;
        long j16 = j13 - ((((j15 * 365) + (j15 / 4)) - (j15 / 100)) + (j15 / 400));
        if (j16 < 0) {
            j15--;
            j16 = j13 - ((((365 * j15) + (j15 / 4)) - (j15 / 100)) + (j15 / 400));
        }
        int i10 = (int) j16;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j17 = j15 + j11 + ((long) (i11 / 10));
        if (j17 < -999999999 || j17 > 999999999) {
            C1802v.m6503a("Invalid year ", j17);
            return;
        }
        int i14 = (int) j17;
        long j18 = iFloorMod;
        if (j18 < 0 || j18 > 86399) {
            C1802v.m6503a("Invalid secondOfDay ", j18);
            return;
        }
        int i15 = (int) (j18 / 3600);
        long j19 = j18 - ((long) (i15 * 3600));
        int i16 = (int) (j19 / 60);
        int i17 = (int) (j19 - ((long) (i16 * 60)));
        if (i14 < 0 || i14 > 9999 || ((int) Math.floorMod(j10, 1000L)) != 0) {
            writeRaw(DateUtils.toString(j10, false, zoneId));
        } else if (i15 == 0 && i16 == 0 && i17 == 0) {
            writeDateYYYMMDD10(i14, i12, i13);
        } else {
            writeDateTime19(i14, i12, i13, i15, i16, i17);
        }
    }

    public abstract void writeDateTime19(int i10, int i11, int i12, int i13, int i14, int i15);

    public abstract void writeDateYYYMMDD10(int i10, int i11, int i12);

    public abstract void writeDecimal(long j10, int i10);

    public abstract void writeDecimal(BigDecimal bigDecimal);

    public abstract void writeDouble(double d10);

    public abstract void writeFloat(float f10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.time.LocalDateTime] */
    public final void writeInstant(Instant instant) {
        if (instant == null) {
            return;
        }
        if (instant.getNano() % 1000000 == 0) {
            writeDate(instant.toEpochMilli());
            return;
        }
        if ((this.features & Feature.AlwaysQuoteStrings.mask) != 0) {
            writeQuote();
        }
        writeLocalDateTime(instant.atZone(this.zoneId).toLocalDateTime());
    }

    public abstract void writeInt32(int i10);

    public abstract void writeInt64(long j10);

    public abstract void writeLine();

    public final void writeLine(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeValue(list.get(i10));
        }
        writeLine();
    }

    public final void writeLineObject(Object obj) {
        if (obj == null) {
            writeLine();
            return;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        if (!(objectWriter instanceof ObjectWriterAdapter)) {
            writeLine(obj);
            return;
        }
        List<FieldWriter> fieldWriters = ((ObjectWriterAdapter) objectWriter).getFieldWriters();
        if (fieldWriters.size() == 1 && (fieldWriters.get(0).features & FieldInfo.VALUE_MASK) != 0) {
            writeLineObject(fieldWriters.get(0).getFieldValue(obj));
            return;
        }
        Object[] objArr = new Object[fieldWriters.size()];
        for (int i10 = 0; i10 < fieldWriters.size(); i10++) {
            objArr[i10] = fieldWriters.get(i10).getFieldValue(obj);
        }
        writeLine(objArr);
    }

    public void writeLocalDate(LocalDate localDate) {
        if (localDate == null) {
            return;
        }
        writeRaw(DateTimeFormatter.ISO_LOCAL_DATE.format(localDate));
    }

    public abstract void writeLocalDateTime(LocalDateTime localDateTime);

    public abstract void writeQuote();

    public abstract void writeRaw(String str);

    public abstract void writeString(String str);

    public abstract void writeString(byte[] bArr);

    public void writeValue(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            if (!optional.isPresent()) {
                return;
            } else {
                obj = optional.get();
            }
        }
        if (obj instanceof Integer) {
            writeInt32(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writeInt64(((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            writeFloat(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Short) {
            writeInt32(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Byte) {
            writeInt32(((Byte) obj).intValue());
            return;
        }
        if (obj instanceof BigDecimal) {
            writeDecimal((BigDecimal) obj);
            return;
        }
        if (obj instanceof BigInteger) {
            writeBigInteger((BigInteger) obj);
            return;
        }
        if (obj instanceof Date) {
            writeDate((Date) obj);
            return;
        }
        if (obj instanceof Instant) {
            writeInstant((Instant) obj);
            return;
        }
        if (obj instanceof LocalDate) {
            writeLocalDate((LocalDate) obj);
        } else if (obj instanceof LocalDateTime) {
            writeLocalDateTime((LocalDateTime) obj);
        } else {
            writeString(obj.toString());
        }
    }

    public final void writeLine(int i10, IntFunction intFunction) {
        for (int i11 = 0; i11 < i10; i11++) {
            Object objApply = intFunction.apply(i11);
            if (i11 != 0) {
                writeComma();
            }
            writeValue(objApply);
        }
        writeLine();
    }

    public final void writeLine(Object... objArr) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 != 0) {
                writeComma();
            }
            writeValue(objArr[i10]);
        }
        writeLine();
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6465of(File file) {
        return m6467of(new FileOutputStream(file), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6466of(File file, Charset charset) {
        return m6467of(new FileOutputStream(file), charset);
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6469of(OutputStream outputStream, Feature... featureArr) {
        return new CSVWriterUTF8(outputStream, StandardCharsets.UTF_8, DateUtils.DEFAULT_ZONE_ID, featureArr);
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6467of(OutputStream outputStream, Charset charset) {
        return m6468of(outputStream, charset, DateUtils.DEFAULT_ZONE_ID);
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6464of() {
        return m6469of(new ByteArrayOutputStream(), new Feature[0]);
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6470of(Writer writer) {
        return new CSVWriterUTF16(writer, DateUtils.DEFAULT_ZONE_ID, new Feature[0]);
    }

    /* JADX INFO: renamed from: of */
    public static CSVWriter m6471of(Writer writer, ZoneId zoneId) {
        return new CSVWriterUTF16(writer, zoneId, new Feature[0]);
    }

    public final void writeDate(Date date) {
        if (date == null) {
            return;
        }
        writeDate(date.getTime());
    }
}
