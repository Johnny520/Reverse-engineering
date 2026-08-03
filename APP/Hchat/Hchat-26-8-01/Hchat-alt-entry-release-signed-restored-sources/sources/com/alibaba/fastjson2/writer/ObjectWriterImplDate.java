package com.alibaba.fastjson2.writer;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDate extends DateTimeCodec implements ObjectWriter {
    static final byte[] PREFIX_BYTES;
    static final byte[] PREFIX_BYTES_SQL;
    static final char[] PREFIX_CHARS_SQL;
    static final ObjectWriterImplDate INSTANCE = new ObjectWriterImplDate(null, null);
    static final char[] PREFIX_CHARS = "new Date(".toCharArray();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charset = StandardCharsets.UTF_8;
        PREFIX_BYTES = "new Date(".getBytes(charset);
        PREFIX_CHARS_SQL = "{\"@type\":\"java.sql.Date\",\"val\":".toCharArray();
        PREFIX_BYTES_SQL = "{\"@type\":\"java.sql.Date\",\"val\":".getBytes(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplDate(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        String dateFormat;
        JSONWriter.Context context;
        ZoneId zoneId;
        long j4;
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
        if (this.formatMillis || ((this.format == null && context2.isDateFormatMillis()) || (jSONWriter.getFeatures(j3) & JSONWriter.Feature.WriterUtilDateAsMillis.mask) != 0)) {
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
        boolean z9 = this.formatISO8601 || context2.isDateFormatISO8601();
        if (z9) {
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
            long j5 = jFloorDiv2 + 719468;
            if (j5 < 0) {
                long j10 = ((jFloorDiv2 + 719469) / 146097) - 1;
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
            long j13 = j11 + j4;
            int i9 = (int) j12;
            int i10 = ((i9 * 5) + 2) / Opcodes.IFEQ;
            int i11 = ((i10 + 2) % 12) + 1;
            context = context2;
            int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
            long j14 = j13 + ((long) (i10 / 10));
            if (j14 < -999999999 || j14 > 999999999) {
                throw new DateTimeException(AbstractC0255e.m1018g(j14, "Invalid year "));
            }
            zoneId = zoneId2;
            int i13 = (int) j14;
            long j15 = iFloorMod;
            if (j15 < 0 || j15 > 86399) {
                throw new DateTimeException(AbstractC0255e.m1018g(j15, "Invalid secondOfDay "));
            }
            int i14 = shanghaiZoneOffsetTotalSeconds;
            int i15 = (int) (j15 / 3600);
            long j16 = j15 - ((long) (i15 * 3600));
            int i16 = (int) (j16 / 60);
            int i17 = (int) (j16 - ((long) (i16 * 60)));
            if (i13 >= 0 && i13 <= 9999) {
                int iFloorMod2 = (int) Math.floorMod(time, 1000L);
                if (iFloorMod2 != 0 || z9) {
                    jSONWriter.writeDateTimeISO8601(i13, i11, i12, i15, i16, i17, iFloorMod2, i14, z9);
                    return;
                }
                if (i15 == 0 && i16 == 0 && i17 == 0 && "java.sql.Date".equals(date.getClass().getName())) {
                    jSONWriter.writeDateYYYMMDD10(i13, i11, i12);
                    return;
                } else {
                    jSONWriter.writeDateTime19(i13, i11, i12, i15, i16, i17);
                    return;
                }
            }
        } else {
            context = context2;
            zoneId = zoneId2;
        }
        jSONWriter.writeString((this.format != null ? getDateFormatter() : context.getDateFormatter()).format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneId)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeMillis(((Date) obj).getTime());
        }
    }
}
