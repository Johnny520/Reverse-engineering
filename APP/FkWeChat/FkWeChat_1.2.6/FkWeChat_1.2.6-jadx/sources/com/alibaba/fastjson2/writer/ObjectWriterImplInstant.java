package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.C1802v;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInstant extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplInstant INSTANCE = new ObjectWriterImplInstant(null, null);

    public ObjectWriterImplInstant(String str, Locale locale) {
        super(str, locale);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        long j11;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        String dateFormat = this.format;
        if (dateFormat == null) {
            dateFormat = context.getDateFormat();
        }
        Instant instant = (Instant) obj;
        if (dateFormat == null) {
            jSONWriter.writeInstant(instant);
            return;
        }
        boolean z10 = this.yyyyMMddhhmmss19 || (context.isFormatyyyyMMddhhmmss19() && this.format == null);
        if (!this.yyyyMMddhhmmss14 && !z10 && !this.yyyyMMdd8 && !this.yyyyMMdd10) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instant, context.getZoneId());
            if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
                jSONWriter.writeInt64(zonedDateTimeOfInstant.toInstant().toEpochMilli() / 1000);
                return;
            }
            if (this.formatMillis || (this.format == null && context.isDateFormatMillis())) {
                jSONWriter.writeInt64(zonedDateTimeOfInstant.toInstant().toEpochMilli());
                return;
            }
            int year = zonedDateTimeOfInstant.getYear();
            if (year >= 0 && year <= 9999 && (this.formatISO8601 || (this.format == null && context.isDateFormatISO8601()))) {
                jSONWriter.writeDateTimeISO8601(year, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            DateTimeFormatter dateFormatter = getDateFormatter();
            if (dateFormatter == null) {
                dateFormatter = context.getDateFormatter();
            }
            if (dateFormatter == null) {
                jSONWriter.writeZonedDateTime(zonedDateTimeOfInstant);
                return;
            } else {
                jSONWriter.writeString(dateFormatter.format(zonedDateTimeOfInstant));
                return;
            }
        }
        ZoneId zoneId = context.getZoneId();
        long epochSecond = instant.getEpochSecond();
        long shanghaiZoneOffsetTotalSeconds = epochSecond + ((long) ((zoneId == DateUtils.SHANGHAI_ZONE_ID || zoneId.getRules() == DateUtils.SHANGHAI_ZONE_RULES) ? DateUtils.getShanghaiZoneOffsetTotalSeconds(epochSecond) : zoneId.getRules().getOffset(instant).getTotalSeconds()));
        long jFloorDiv = Math.floorDiv(shanghaiZoneOffsetTotalSeconds, 86400L);
        int iFloorMod = (int) Math.floorMod(shanghaiZoneOffsetTotalSeconds, 86400L);
        long j12 = 719468 + jFloorDiv;
        if (j12 < 0) {
            long j13 = ((jFloorDiv + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((((j14 * 365) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((((365 * j14) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + ((long) (i11 / 10));
        if (j16 < -999999999 || j16 > 999999999) {
            C1802v.m6503a("Invalid year ", j16);
            return;
        }
        int i14 = (int) j16;
        long j17 = iFloorMod;
        if (j17 < 0 || j17 > 86399) {
            C1802v.m6503a("Invalid secondOfDay ", j17);
            return;
        }
        int i15 = (int) (j17 / 3600);
        long j18 = j17 - ((long) (i15 * 3600));
        int i16 = (int) (j18 / 60);
        int i17 = (int) (j18 - ((long) (i16 * 60)));
        if (z10) {
            jSONWriter.writeDateTime19(i14, i12, i13, i15, i16, i17);
            return;
        }
        if (this.yyyyMMddhhmmss14) {
            jSONWriter.writeDateTime14(i14, i12, i13, i15, i16, i17);
        } else if (this.yyyyMMdd10) {
            jSONWriter.writeDateYYYMMDD10(i14, i12, i13);
        } else {
            jSONWriter.writeDateYYYMMDD8(i14, i12, i13);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        jSONWriter.writeInstant((Instant) obj);
    }
}
