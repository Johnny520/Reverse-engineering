package com.alibaba.fastjson2.writer;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterDate<T> extends FieldWriter<T> {
    protected ObjectWriter dateWriter;
    final boolean formatISO8601;
    final boolean formatMillis;
    final boolean formatUnixTime;
    protected DateTimeFormatter formatter;
    final boolean formatyyyyMMdd8;
    final boolean formatyyyyMMddhhmmss14;
    final boolean formatyyyyMMddhhmmss19;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FieldWriterDate(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        super(str, i9, j3, str2, str3, type, cls, field, method);
        boolean z14 = false;
        if (str2 != null) {
            z10 = true;
            switch (str2) {
                case "millis":
                    z9 = false;
                    z11 = false;
                    z13 = false;
                    z12 = false;
                    z14 = true;
                    z10 = z12;
                    break;
                case "unixtime":
                    z11 = false;
                    z13 = false;
                    z12 = false;
                    z9 = true;
                    z10 = z12;
                    break;
                case "yyyyMMdd":
                    z9 = false;
                    z13 = false;
                    z12 = false;
                    z11 = true;
                    z10 = z12;
                    break;
                case "yyyy-MM-dd HH:mm:ss":
                    z9 = false;
                    z11 = false;
                    z13 = false;
                    z12 = true;
                    z10 = false;
                    break;
                case "yyyyMMddHHmmss":
                    z9 = false;
                    z11 = false;
                    z12 = false;
                    z13 = true;
                    z10 = z12;
                    break;
                case "iso8601":
                    z9 = false;
                    z11 = false;
                    z13 = z11;
                    z12 = z13;
                    break;
                default:
                    z9 = false;
                    z10 = false;
                    z11 = false;
                    z13 = z11;
                    z12 = z13;
                    break;
            }
        }
        this.formatMillis = z14;
        this.formatISO8601 = z10;
        this.formatUnixTime = z9;
        this.formatyyyyMMdd8 = z11;
        this.formatyyyyMMddhhmmss14 = z13;
        this.formatyyyyMMddhhmmss19 = z12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DateTimeFormatter getFormatter() {
        String str;
        if (this.formatter == null && (str = this.format) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
            this.formatter = DateTimeFormatter.ofPattern(str);
        }
        return this.formatter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (cls != this.fieldClass) {
            return jSONWriter.getObjectWriter(cls);
        }
        ObjectWriterProvider objectWriterProvider = jSONWriter.context.provider;
        if (this.dateWriter == null) {
            if ((objectWriterProvider.userDefineMask & 16) == 0) {
                if (this.format == null) {
                    ObjectWriterImplDate objectWriterImplDate = ObjectWriterImplDate.INSTANCE;
                    this.dateWriter = objectWriterImplDate;
                    return objectWriterImplDate;
                }
                ObjectWriterImplDate objectWriterImplDate2 = new ObjectWriterImplDate(this.format, null);
                this.dateWriter = objectWriterImplDate2;
                return objectWriterImplDate2;
            }
            this.dateWriter = objectWriterProvider.getObjectWriter(cls, cls, false);
        }
        return this.dateWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatISO8601() {
        return this.formatISO8601;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatMillis() {
        return this.formatMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeDate(JSONWriter jSONWriter, long j3) {
        long j4;
        int shanghaiZoneOffsetTotalSeconds;
        long j5;
        long j10;
        long j11;
        long j12;
        long j13;
        int year;
        int year2;
        if (jSONWriter.jsonb) {
            writeFieldName(jSONWriter);
            jSONWriter.writeMillis(j3);
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt64(j3 / 1000);
            return;
        }
        if (this.formatMillis || ((this.format == null && context.isDateFormatMillis()) || (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.WriterUtilDateAsMillis.mask) != 0)) {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt64(j3);
            return;
        }
        ZoneId zoneId = context.getZoneId();
        String dateFormat = this.format;
        if (dateFormat == null) {
            dateFormat = context.getDateFormat();
        }
        boolean z9 = this.formatyyyyMMddhhmmss19 || (context.isFormatyyyyMMddhhmmss19() && this.format == null);
        if (dateFormat == null || this.formatyyyyMMddhhmmss14 || z9) {
            long jFloorDiv = Math.floorDiv(j3, 1000L);
            if (zoneId != DateUtils.SHANGHAI_ZONE_ID) {
                j4 = 0;
                if (zoneId.getRules() != DateUtils.SHANGHAI_ZONE_RULES) {
                    shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(j3)).getTotalSeconds();
                }
                long j14 = jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds);
                long jFloorDiv2 = Math.floorDiv(j14, 86400L);
                int iFloorMod = (int) Math.floorMod(j14, 86400L);
                j5 = jFloorDiv2 + 719468;
                if (j5 >= j4) {
                    long j15 = ((jFloorDiv2 + 719469) / 146097) - 1;
                    j10 = j15 * 400;
                    j5 += (-j15) * 146097;
                } else {
                    j10 = j4;
                }
                long j16 = ((j5 * 400) + 591) / 146097;
                j11 = j5 - ((j16 / 400) + (((j16 / 4) + (j16 * 365)) - (j16 / 100)));
                if (j11 < j4) {
                    j16--;
                    j11 = j5 - ((j16 / 400) + (((j16 / 4) + (365 * j16)) - (j16 / 100)));
                }
                long j17 = j16 + j10;
                int i9 = (int) j11;
                int i10 = ((i9 * 5) + 2) / Opcodes.IFEQ;
                int i11 = ((i10 + 2) % 12) + 1;
                int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
                j12 = j17 + ((long) (i10 / 10));
                if (j12 >= -999999999 || j12 > 999999999) {
                    throw new DateTimeException(AbstractC0255e.m1018g(j12, "Invalid year "));
                }
                j13 = j3;
                int i13 = (int) j12;
                long j18 = iFloorMod;
                if (j18 < j4 || j18 > 86399) {
                    throw new DateTimeException(AbstractC0255e.m1018g(j18, "Invalid secondOfDay "));
                }
                int i14 = (int) (j18 / 3600);
                long j19 = j18 - ((long) (i14 * 3600));
                int i15 = (int) (j19 / 60);
                int i16 = (int) (j19 - ((long) (i15 * 60)));
                if (i13 >= 0 && i13 <= 9999) {
                    if (this.formatyyyyMMddhhmmss14) {
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTime14(i13, i11, i12, i14, i15, i16);
                        return;
                    }
                    if (z9) {
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTime19(i13, i11, i12, i14, i15, i16);
                        return;
                    }
                    int iFloorMod2 = (int) Math.floorMod(j13, 1000L);
                    if (iFloorMod2 == 0) {
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTime19(i13, i11, i12, i14, i15, i16);
                        return;
                    } else {
                        int totalSeconds = context.getZoneId().getRules().getOffset(Instant.ofEpochMilli(j13)).getTotalSeconds();
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTimeISO8601(i13, i11, i12, i14, i15, i16, iFloorMod2, totalSeconds, false);
                        return;
                    }
                }
            } else {
                j4 = 0;
            }
            shanghaiZoneOffsetTotalSeconds = DateUtils.getShanghaiZoneOffsetTotalSeconds(jFloorDiv);
            long j142 = jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds);
            long jFloorDiv22 = Math.floorDiv(j142, 86400L);
            int iFloorMod3 = (int) Math.floorMod(j142, 86400L);
            j5 = jFloorDiv22 + 719468;
            if (j5 >= j4) {
            }
            long j162 = ((j5 * 400) + 591) / 146097;
            j11 = j5 - ((j162 / 400) + (((j162 / 4) + (j162 * 365)) - (j162 / 100)));
            if (j11 < j4) {
            }
            long j172 = j162 + j10;
            int i92 = (int) j11;
            int i102 = ((i92 * 5) + 2) / Opcodes.IFEQ;
            int i112 = ((i102 + 2) % 12) + 1;
            int i122 = (i92 - (((i102 * 306) + 5) / 10)) + 1;
            j12 = j172 + ((long) (i102 / 10));
            if (j12 >= -999999999) {
            }
            throw new DateTimeException(AbstractC0255e.m1018g(j12, "Invalid year "));
        }
        j13 = j3;
        writeFieldName(jSONWriter);
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j13), zoneId);
        if ((this.formatISO8601 || (context.isDateFormatISO8601() && this.format == null)) && (year = zonedDateTimeOfInstant.getYear()) >= 0 && year <= 9999) {
            jSONWriter.writeDateTimeISO8601(year, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
            return;
        }
        if (this.formatyyyyMMdd8 && (year2 = zonedDateTimeOfInstant.getYear()) >= 0 && year2 <= 9999) {
            jSONWriter.writeDateYYYMMDD8(year2, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth());
            return;
        }
        DateTimeFormatter formatter = getFormatter();
        if (formatter == null) {
            formatter = context.getDateFormatter();
        }
        if (formatter != null) {
            jSONWriter.writeString(formatter.format(zonedDateTimeOfInstant));
        } else {
            jSONWriter.writeZonedDateTime(zonedDateTimeOfInstant);
        }
    }
}
