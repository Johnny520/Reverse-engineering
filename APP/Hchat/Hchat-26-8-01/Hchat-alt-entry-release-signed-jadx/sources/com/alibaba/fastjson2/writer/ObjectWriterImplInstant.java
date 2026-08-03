package com.alibaba.fastjson2.writer;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInstant extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplInstant INSTANCE = new ObjectWriterImplInstant(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplInstant(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        long j4;
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
        boolean z9 = this.yyyyMMddhhmmss19 || (context.isFormatyyyyMMddhhmmss19() && this.format == null);
        if (!this.yyyyMMddhhmmss14 && !z9 && !this.yyyyMMdd8 && !this.yyyyMMdd10) {
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
        long j5 = 719468 + jFloorDiv;
        if (j5 < 0) {
            long j10 = ((jFloorDiv + 719469) / 146097) - 1;
            j4 = j10 * 400;
            j5 += (-j10) * 146097;
        } else {
            j4 = 0;
        }
        long j11 = ((j5 * 400) + 591) / 146097;
        long j12 = j5 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j5 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i9 = (int) j12;
        int i10 = ((i9 * 5) + 2) / Opcodes.IFEQ;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
        long j13 = j11 + j4 + ((long) (i10 / 10));
        if (j13 < -999999999 || j13 > 999999999) {
            throw new DateTimeException(AbstractC0255e.m1018g(j13, "Invalid year "));
        }
        int i13 = (int) j13;
        long j14 = iFloorMod;
        if (j14 < 0 || j14 > 86399) {
            throw new DateTimeException(AbstractC0255e.m1018g(j14, "Invalid secondOfDay "));
        }
        int i14 = (int) (j14 / 3600);
        long j15 = j14 - ((long) (i14 * 3600));
        int i15 = (int) (j15 / 60);
        int i16 = (int) (j15 - ((long) (i15 * 60)));
        if (z9) {
            jSONWriter.writeDateTime19(i13, i11, i12, i14, i15, i16);
            return;
        }
        if (this.yyyyMMddhhmmss14) {
            jSONWriter.writeDateTime14(i13, i11, i12, i14, i15, i16);
        } else if (this.yyyyMMdd10) {
            jSONWriter.writeDateYYYMMDD10(i13, i11, i12);
        } else {
            jSONWriter.writeDateYYYMMDD8(i13, i11, i12);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        jSONWriter.writeInstant((Instant) obj);
    }
}
