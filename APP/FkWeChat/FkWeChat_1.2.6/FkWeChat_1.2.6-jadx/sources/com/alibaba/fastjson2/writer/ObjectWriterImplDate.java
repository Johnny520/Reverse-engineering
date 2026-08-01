package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.C1802v;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDate extends DateTimeCodec implements ObjectWriter {
    static final byte[] PREFIX_BYTES;
    static final byte[] PREFIX_BYTES_SQL;
    static final char[] PREFIX_CHARS_SQL;
    static final ObjectWriterImplDate INSTANCE = new ObjectWriterImplDate(null, null);
    static final char[] PREFIX_CHARS = "new Date(".toCharArray();

    static {
        Charset charset = StandardCharsets.UTF_8;
        PREFIX_BYTES = "new Date(".getBytes(charset);
        PREFIX_CHARS_SQL = "{\"@type\":\"java.sql.Date\",\"val\":".toCharArray();
        PREFIX_BYTES_SQL = "{\"@type\":\"java.sql.Date\",\"val\":".getBytes(charset);
    }

    public ObjectWriterImplDate(String str, Locale locale) {
        super(str, locale);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        String dateFormat;
        JSONWriter.Context context;
        ZoneId zoneId;
        long j11;
        byte[] bArr;
        char[] cArr;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context2 = jSONWriter.context;
        Date date = (Date) obj;
        long time = date.getTime();
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            char c10 = '}';
            if (jSONWriter.utf16) {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    cArr = PREFIX_CHARS_SQL;
                } else {
                    cArr = PREFIX_CHARS;
                    c10 = ')';
                }
                jSONWriter.writeRaw(cArr, 0, cArr.length);
            } else {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    bArr = PREFIX_BYTES_SQL;
                } else {
                    bArr = PREFIX_BYTES;
                    c10 = ')';
                }
                jSONWriter.writeRaw(bArr);
            }
            jSONWriter.writeInt64(time);
            jSONWriter.writeRaw(c10);
            return;
        }
        if (this.formatMillis || ((this.format == null && context2.isDateFormatMillis()) || (jSONWriter.getFeatures(j10) & JSONWriter.Feature.WriterUtilDateAsMillis.mask) != 0)) {
            jSONWriter.writeInt64(time);
            return;
        }
        if (this.formatUnixTime || (this.format == null && context2.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(time / 1000);
            return;
        }
        ZoneId zoneId2 = context2.getZoneId();
        ZoneId zoneId3 = DateUtils.SHANGHAI_ZONE_ID;
        int shanghaiZoneOffsetTotalSeconds = (zoneId2 == zoneId3 || zoneId2.getRules() == DateUtils.SHANGHAI_ZONE_RULES) ? DateUtils.getShanghaiZoneOffsetTotalSeconds(Math.floorDiv(time, 1000L)) : (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneId2).getOffset().getTotalSeconds();
        boolean z10 = this.formatISO8601 || context2.isDateFormatISO8601();
        if (z10) {
            dateFormat = null;
        } else {
            dateFormat = this.format;
            if (dateFormat == null) {
                dateFormat = context2.getDateFormat();
            }
        }
        if (dateFormat == null) {
            long jFloorDiv = Math.floorDiv(time, 1000L);
            long shanghaiZoneOffsetTotalSeconds2 = jFloorDiv + ((long) ((zoneId2 == zoneId3 || zoneId2.getRules() == DateUtils.SHANGHAI_ZONE_RULES) ? DateUtils.getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId2.getRules().getOffset(Instant.ofEpochMilli(time)).getTotalSeconds()));
            long jFloorDiv2 = Math.floorDiv(shanghaiZoneOffsetTotalSeconds2, 86400L);
            int iFloorMod = (int) Math.floorMod(shanghaiZoneOffsetTotalSeconds2, 86400L);
            long j12 = jFloorDiv2 + 719468;
            if (j12 < 0) {
                long j13 = ((jFloorDiv2 + 719469) / 146097) - 1;
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
            long j16 = j14 + j11;
            int i10 = (int) j15;
            int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
            int i12 = ((i11 + 2) % 12) + 1;
            context = context2;
            int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
            long j17 = j16 + ((long) (i11 / 10));
            if (j17 < -999999999 || j17 > 999999999) {
                C1802v.m6503a("Invalid year ", j17);
                return;
            }
            zoneId = zoneId2;
            int i14 = (int) j17;
            long j18 = iFloorMod;
            if (j18 < 0 || j18 > 86399) {
                C1802v.m6503a("Invalid secondOfDay ", j18);
                return;
            }
            int i15 = shanghaiZoneOffsetTotalSeconds;
            int i16 = (int) (j18 / 3600);
            long j19 = j18 - ((long) (i16 * 3600));
            int i17 = (int) (j19 / 60);
            int i18 = (int) (j19 - ((long) (i17 * 60)));
            if (i14 >= 0 && i14 <= 9999) {
                int iFloorMod2 = (int) Math.floorMod(time, 1000L);
                if (iFloorMod2 != 0 || z10) {
                    jSONWriter.writeDateTimeISO8601(i14, i12, i13, i16, i17, i18, iFloorMod2, i15, z10);
                    return;
                }
                if (i16 == 0 && i17 == 0 && i18 == 0 && "java.sql.Date".equals(date.getClass().getName())) {
                    jSONWriter.writeDateYYYMMDD10(i14, i12, i13);
                    return;
                } else {
                    jSONWriter.writeDateTime19(i14, i12, i13, i16, i17, i18);
                    return;
                }
            }
        } else {
            context = context2;
            zoneId = zoneId2;
        }
        jSONWriter.writeString((this.format != null ? getDateFormatter() : context.getDateFormatter()).format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneId)));
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeMillis(((Date) obj).getTime());
        }
    }
}
