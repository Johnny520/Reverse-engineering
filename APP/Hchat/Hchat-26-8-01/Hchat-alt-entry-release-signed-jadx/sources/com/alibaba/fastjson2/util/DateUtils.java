package com.alibaba.fastjson2.util;

import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplDate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.internal.http2.Http2Connection;
import p025bc.AbstractC0255e;
import p222p.AbstractC3199a;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DateUtils {
    static DateTimeFormatter DATE_TIME_FORMATTER_34 = null;
    static DateTimeFormatter DATE_TIME_FORMATTER_COOKIE = null;
    static DateTimeFormatter DATE_TIME_FORMATTER_COOKIE_LOCAL = null;
    static DateTimeFormatter DATE_TIME_FORMATTER_RFC_2822 = null;
    public static final ZoneId DEFAULT_ZONE_ID;
    public static final LocalDate LOCAL_DATE_19700101;
    static final int LOCAL_EPOCH_DAY;
    public static final ZoneId OFFSET_8_ZONE_ID;
    public static final String OFFSET_8_ZONE_ID_NAME = "+08:00";
    private static final int[] POWERS;
    public static final ZoneId SHANGHAI_ZONE_ID;
    public static final String SHANGHAI_ZONE_ID_NAME = "Asia/Shanghai";
    public static final ZoneRules SHANGHAI_ZONE_RULES;

    /* JADX INFO: renamed from: com.alibaba.fastjson2.util.DateUtils$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static /* synthetic */ class C06361 {

        /* JADX INFO: renamed from: $SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern */
        static final /* synthetic */ int[] f1978x8a2a5bbc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            int[] iArr = new int[DateTimeFormatPattern.values().length];
            f1978x8a2a5bbc = iArr;
            try {
                iArr[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1978x8a2a5bbc[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1978x8a2a5bbc[DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1978x8a2a5bbc[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1978x8a2a5bbc[DateTimeFormatPattern.DATE_FORMAT_10_DASH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1978x8a2a5bbc[DateTimeFormatPattern.DATE_FORMAT_10_SLASH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class CacheDate10 {
        static final String[] CACHE = new String[1024];
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class CacheDate8 {
        static final String[] CACHE = new String[1024];
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum DateTimeFormatPattern {
        DATE_FORMAT_10_DASH("yyyy-MM-dd", 10),
        DATE_FORMAT_10_SLASH("yyyy/MM/dd", 10),
        DATE_FORMAT_10_DOT("dd.MM.yyyy", 10),
        DATE_TIME_FORMAT_19_DASH("yyyy-MM-dd HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_DASH_T("yyyy-MM-dd'T'HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_SLASH("yyyy/MM/dd HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_DOT("dd.MM.yyyy HH:mm:ss", 19);

        public final int length;
        public final String pattern;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        DateTimeFormatPattern(String str, int i9) {
            this.pattern = str;
            this.length = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int shanghaiZoneOffsetTotalSeconds;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        DEFAULT_ZONE_ID = zoneIdSystemDefault;
        ZoneRules rules = null;
        try {
            if (!SHANGHAI_ZONE_ID_NAME.equals(zoneIdSystemDefault.getId())) {
                zoneIdSystemDefault = ZoneId.of(SHANGHAI_ZONE_ID_NAME);
            }
            try {
                rules = zoneIdSystemDefault.getRules();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            zoneIdSystemDefault = null;
        }
        SHANGHAI_ZONE_ID = zoneIdSystemDefault;
        SHANGHAI_ZONE_RULES = rules;
        OFFSET_8_ZONE_ID = ZoneId.of(OFFSET_8_ZONE_ID_NAME);
        LOCAL_DATE_19700101 = LocalDate.of(1970, 1, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZoneId zoneId = DEFAULT_ZONE_ID;
        long jFloorDiv = Math.floorDiv(jCurrentTimeMillis, 1000L);
        if (zoneId == zoneIdSystemDefault || zoneId.getRules() == rules) {
            shanghaiZoneOffsetTotalSeconds = getShanghaiZoneOffsetTotalSeconds(jFloorDiv);
        } else {
            shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(jCurrentTimeMillis)).getTotalSeconds();
        }
        LOCAL_EPOCH_DAY = (int) Math.floorDiv(jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds), 86400L);
        POWERS = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS, 0, 0, 0, 0, 0, 0};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String format(long j3, DateTimeFormatPattern dateTimeFormatPattern) {
        int shanghaiZoneOffsetTotalSeconds;
        long j4;
        ZoneId zoneId = DEFAULT_ZONE_ID;
        long jFloorDiv = Math.floorDiv(j3, 1000L);
        if (zoneId == SHANGHAI_ZONE_ID || zoneId.getRules() == SHANGHAI_ZONE_RULES) {
            shanghaiZoneOffsetTotalSeconds = getShanghaiZoneOffsetTotalSeconds(jFloorDiv);
        } else {
            shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(j3)).getTotalSeconds();
        }
        long j5 = jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds);
        long jFloorDiv2 = Math.floorDiv(j5, 86400L);
        int iFloorMod = (int) Math.floorMod(j5, 86400L);
        long j10 = 719468 + jFloorDiv2;
        if (j10 < 0) {
            long j11 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j4 = j11 * 400;
            j10 += (-j11) * 146097;
        } else {
            j4 = 0;
        }
        long j12 = ((j10 * 400) + 591) / 146097;
        long j13 = j10 - ((j12 / 400) + (((j12 / 4) + (j12 * 365)) - (j12 / 100)));
        if (j13 < 0) {
            j12--;
            j13 = j10 - ((j12 / 400) + (((j12 / 4) + (365 * j12)) - (j12 / 100)));
        }
        int i9 = (int) j13;
        int i10 = ((i9 * 5) + 2) / Opcodes.IFEQ;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
        long j14 = j12 + j4 + ((long) (i10 / 10));
        if (j14 < -999999999 || j14 > 999999999) {
            throw new DateTimeException(AbstractC0255e.m1018g(j14, "Invalid year "));
        }
        int i13 = (int) j14;
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH || dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_SLASH || dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            return format(i13, i11, i12, dateTimeFormatPattern);
        }
        long j15 = iFloorMod;
        if (j15 < 0 || j15 > 86399) {
            throw new DateTimeException(AbstractC0255e.m1018g(j15, "Invalid secondOfDay "));
        }
        int i14 = (int) (j15 / 3600);
        long j16 = j15 - ((long) (i14 * 3600));
        int i15 = (int) (j16 / 60);
        return format(i13, i11, i12, i14, i15, (int) (j16 - ((long) (i15 * 60))), dateTimeFormatPattern);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String formatYMD10(long j3, ZoneId zoneId) {
        long j4;
        String str;
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        long jFloorDiv = Math.floorDiv(j3, 1000L);
        long jFloorDiv2 = Math.floorDiv(jFloorDiv + ((long) ((zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) ? getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId2.getRules().getOffset(Instant.ofEpochMilli(j3)).getTotalSeconds())), 86400L);
        int i9 = (int) ((jFloorDiv2 - ((long) LOCAL_EPOCH_DAY)) + 128);
        String[] strArr = CacheDate10.CACHE;
        if (i9 >= 0 && i9 < strArr.length && (str = strArr[i9]) != null) {
            return str;
        }
        long j5 = 719468 + jFloorDiv2;
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
        int i10 = (int) j12;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j13 = j11 + j4 + ((long) (i11 / 10));
        if (j13 < -999999999 || j13 > 999999999) {
            throw new DateTimeException(AbstractC0255e.m1018g(j13, "Invalid year "));
        }
        char[] cArr = new char[10];
        IOUtils.writeLocalDate(cArr, 0, (int) j13, i12, i13);
        String str2 = new String(cArr);
        if (i9 >= 0 && i9 < strArr.length) {
            strArr[i9] = str2;
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String formatYMD8(long j3, ZoneId zoneId) {
        long j4;
        String str;
        long jFloorDiv = Math.floorDiv(j3, 1000L);
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        long jFloorDiv2 = Math.floorDiv(jFloorDiv + ((long) ((zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) ? getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId2.getRules().getOffset(Instant.ofEpochMilli(j3)).getTotalSeconds())), 86400L);
        int i9 = (int) ((jFloorDiv2 - ((long) LOCAL_EPOCH_DAY)) + 128);
        String[] strArr = CacheDate8.CACHE;
        if (i9 >= 0 && i9 < strArr.length && (str = strArr[i9]) != null) {
            return str;
        }
        long j5 = 719468 + jFloorDiv2;
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
        int i10 = (int) j12;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j13 = j11 + j4 + ((long) (i11 / 10));
        if (j13 < -999999999 || j13 > 999999999) {
            throw new DateTimeException(AbstractC0255e.m1018g(j13, "Invalid year "));
        }
        int i14 = (int) j13;
        int i15 = i14 / 100;
        char[] cArr = new char[8];
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        int[] iArr = IOUtils.PACKED_DIGITS_UTF16;
        unsafe.putInt(cArr, j14, iArr[i15]);
        unsafe.putInt(cArr, j14 + 4, iArr[i14 - (i15 * 100)]);
        unsafe.putInt(cArr, 8 + j14, iArr[i12]);
        unsafe.putInt(cArr, j14 + 12, iArr[i13]);
        String str2 = new String(cArr);
        if (i9 >= 0 && i9 < strArr.length) {
            strArr[i9] = str2;
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String formatYMDHMS19(Date date, ZoneId zoneId) {
        long j3;
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        long jFloorDiv = Math.floorDiv(time, 1000L);
        long totalSeconds = jFloorDiv + ((long) (((zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) && jFloorDiv > 684900000) ? 28800 : zoneId2.getRules().getOffset(Instant.ofEpochMilli(time)).getTotalSeconds()));
        long jFloorDiv2 = Math.floorDiv(totalSeconds, 86400L);
        int iFloorMod = (int) Math.floorMod(totalSeconds, 86400L);
        long j4 = 719468 + jFloorDiv2;
        if (j4 < 0) {
            long j5 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j3 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j3 = 0;
        }
        long j10 = ((j4 * 400) + 591) / 146097;
        long j11 = j4 - ((j10 / 400) + (((j10 / 4) + (j10 * 365)) - (j10 / 100)));
        if (j11 < 0) {
            j10--;
            j11 = j4 - ((j10 / 400) + (((j10 / 4) + (365 * j10)) - (j10 / 100)));
        }
        int i9 = (int) j11;
        int i10 = ((i9 * 5) + 2) / Opcodes.IFEQ;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
        long j12 = j10 + j3 + ((long) (i10 / 10));
        if (j12 < -999999999 || j12 > 999999999) {
            throw new DateTimeException(AbstractC0255e.m1018g(j12, "Invalid year "));
        }
        int i13 = (int) j12;
        long j13 = iFloorMod;
        if (j13 < 0 || j13 > 86399) {
            throw new DateTimeException(AbstractC0255e.m1018g(j13, "Invalid secondOfDay "));
        }
        int i14 = (int) (j13 / 3600);
        long j14 = j13 - ((long) (i14 * 3600));
        int i15 = (int) (j14 / 60);
        int i16 = (int) (j14 - ((long) (i15 * 60)));
        char[] cArr = new char[19];
        IOUtils.writeLocalDate(cArr, 0, i13, i11, i12);
        cArr[10] = ' ';
        IOUtils.writeLocalTime(cArr, 11, i14, i15, i16);
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getShanghaiZoneOffsetTotalSeconds(long j3) {
        if (j3 >= 684900000) {
            return 28800;
        }
        if (j3 >= 671598000) {
            return 32400;
        }
        if (j3 >= 653450400) {
            return 28800;
        }
        if (j3 >= 640148400) {
            return 32400;
        }
        if (j3 >= 622000800) {
            return 28800;
        }
        if (j3 >= 608698800) {
            return 32400;
        }
        if (j3 >= 589946400) {
            return 28800;
        }
        if (j3 >= 577249200) {
            return 32400;
        }
        if (j3 >= 558496800) {
            return 28800;
        }
        if (j3 >= 545194800) {
            return 32400;
        }
        if (j3 >= 527047200) {
            return 28800;
        }
        if (j3 >= 515559600) {
            return 32400;
        }
        if (j3 >= -649987200) {
            return 28800;
        }
        if (j3 >= -652316400) {
            return 32400;
        }
        if (j3 >= -670636800) {
            return 28800;
        }
        if (j3 >= -683852400) {
            return 32400;
        }
        if (j3 >= -699580800) {
            return 28800;
        }
        if (j3 >= -716857200) {
            return 32400;
        }
        if (j3 >= -733795200) {
            return 28800;
        }
        if (j3 >= -745801200) {
            return 32400;
        }
        if (j3 >= -767836800) {
            return 28800;
        }
        if (j3 >= -881017200) {
            return 32400;
        }
        if (j3 >= -888796800) {
            return 28800;
        }
        if (j3 >= -908838000) {
            return 32400;
        }
        if (j3 >= -922060800) {
            return 28800;
        }
        if (j3 >= -933634800) {
            return 32400;
        }
        if (j3 >= -1585872000) {
            return 28800;
        }
        if (j3 >= -1600642800) {
            return 32400;
        }
        return j3 >= -2177452800L ? 28800 : 29143;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ZoneId getZoneId(String str, ZoneId zoneId) {
        int iIndexOf;
        char cCharAt;
        if (str == null) {
            return zoneId != null ? zoneId : DEFAULT_ZONE_ID;
        }
        switch (str) {
            case "000":
                return ZoneOffset.UTC;
            case "CST":
                return SHANGHAI_ZONE_ID;
            case "+08:00":
                return OFFSET_8_ZONE_ID;
            default:
                if (str.length() > 0 && (((cCharAt = str.charAt(0)) == '+' || cCharAt == '-') && str.charAt(str.length() - 1) != ']')) {
                    return ZoneOffset.of(str);
                }
                int iIndexOf2 = str.indexOf(91);
                return (iIndexOf2 <= 0 || (iIndexOf = str.indexOf(93, iIndexOf2)) <= 0) ? ZoneId.of(str) : ZoneId.of(str.substring(iIndexOf2 + 1, iIndexOf));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long hms(byte[] bArr, int i9) {
        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if (((((-1085102592571150096L) & jReverseBytes) - 3472328296227680304L) | (((1085102592571150095L & jReverseBytes) + 434034439958300166L) & (-1085366475377544976L))) != 0 || (16492675399680L & jReverseBytes) != 10995116933120L) {
            return -1L;
        }
        long j3 = 4222124902318095L & jReverseBytes;
        return (j3 << 3) + (j3 << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int hourAfterNoon(char c10, char c11) {
        if (c10 != '0') {
            if (c10 == '1') {
                switch (c11) {
                    case '0':
                        c10 = '2';
                        c11 = '2';
                        break;
                    case '1':
                        c11 = '3';
                        c10 = '2';
                        break;
                    case '2':
                        c11 = '4';
                        c10 = '2';
                        break;
                }
            }
        } else {
            switch (c11) {
                case '0':
                    c11 = '2';
                    c10 = '1';
                    break;
                case '1':
                    c11 = '3';
                    c10 = '1';
                    break;
                case '2':
                    c11 = '4';
                    c10 = '1';
                    break;
                case '3':
                    c11 = '5';
                    c10 = '1';
                    break;
                case '4':
                    c11 = '6';
                    c10 = '1';
                    break;
                case '5':
                    c11 = '7';
                    c10 = '1';
                    break;
                case '6':
                    c11 = '8';
                    c10 = '1';
                    break;
                case '7':
                    c11 = '9';
                    c10 = '1';
                    break;
                case '8':
                    c10 = '2';
                    c11 = '0';
                    break;
                case '9':
                    c10 = '2';
                    c11 = '1';
                    break;
            }
        }
        return (c10 << 16) | c11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
    
        r4 = 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isDate(String str) {
        char cCharAt;
        int i9;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() != 19 || str.charAt(4) != '-' || str.charAt(7) != '-' || (((cCharAt = str.charAt(10)) != ' ' && cCharAt != 'T') || str.charAt(13) != ':' || str.charAt(16) != ':')) {
            try {
                return parseMillis(str, DEFAULT_ZONE_ID) != 0;
            } catch (JSONException | DateTimeException unused) {
                return false;
            }
        }
        char cCharAt2 = str.charAt(0);
        char cCharAt3 = str.charAt(1);
        char cCharAt4 = str.charAt(2);
        char cCharAt5 = str.charAt(3);
        char cCharAt6 = str.charAt(5);
        char cCharAt7 = str.charAt(6);
        char cCharAt8 = str.charAt(8);
        char cCharAt9 = str.charAt(9);
        char cCharAt10 = str.charAt(11);
        char cCharAt11 = str.charAt(12);
        char cCharAt12 = str.charAt(14);
        char cCharAt13 = str.charAt(15);
        char cCharAt14 = str.charAt(17);
        char cCharAt15 = str.charAt(18);
        if (cCharAt2 >= '0' && cCharAt2 <= '9' && cCharAt3 >= '0' && cCharAt3 <= '9' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9' && cCharAt6 >= '0' && cCharAt6 <= '9' && cCharAt7 >= '0' && cCharAt7 <= '9' && cCharAt8 >= '0' && cCharAt8 <= '9' && cCharAt9 >= '0' && cCharAt9 <= '9' && cCharAt10 >= '0' && cCharAt10 <= '9' && cCharAt11 >= '0' && cCharAt11 <= '9' && cCharAt12 >= '0' && cCharAt12 <= '9' && cCharAt13 >= '0' && cCharAt13 <= '9' && cCharAt14 >= '0' && cCharAt14 <= '9' && cCharAt15 >= '0' && cCharAt15 <= '9') {
            int iM6853z = (cCharAt5 - '0') + AbstractC3199a.m6853z(cCharAt4, 48, 10, AbstractC3199a.m6853z(cCharAt3, 48, 100, (cCharAt2 - '0') * 1000));
            int i10 = (cCharAt7 - '0') + ((cCharAt6 - '0') * 10);
            int i11 = (cCharAt9 - '0') + ((cCharAt8 - '0') * 10);
            int i12 = (cCharAt11 - '0') + ((cCharAt10 - '0') * 10);
            int i13 = (cCharAt13 - '0') + ((cCharAt12 - '0') * 10);
            int i14 = (cCharAt15 - '0') + ((cCharAt14 - '0') * 10);
            if (i10 > 12) {
                return false;
            }
            int i15 = 28;
            if (i11 > 28) {
                if (i10 != 2) {
                    i9 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
                } else {
                    i9 = (iM6853z & 15) == 0 ? i15 : i15;
                }
                if (i11 > i9) {
                    return false;
                }
            }
            if (i12 <= 24 && i13 <= 60 && i14 <= 61) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r1 = 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isLocalDate(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() != 10 || str.charAt(4) != '-' || str.charAt(7) != '-') {
            if (str.length() < 9 || str.length() > 40) {
                return false;
            }
            try {
                return parseLocalDate(str) != null;
            } catch (JSONException | DateTimeException unused) {
                return false;
            }
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char cCharAt3 = str.charAt(2);
        char cCharAt4 = str.charAt(3);
        char cCharAt5 = str.charAt(5);
        char cCharAt6 = str.charAt(6);
        char cCharAt7 = str.charAt(8);
        char cCharAt8 = str.charAt(9);
        int iM6853z = (cCharAt4 - '0') + AbstractC3199a.m6853z(cCharAt3, 48, 10, AbstractC3199a.m6853z(cCharAt2, 48, 100, (cCharAt - '0') * 1000));
        int i9 = (cCharAt6 - '0') + ((cCharAt5 - '0') * 10);
        int i10 = (cCharAt8 - '0') + ((cCharAt7 - '0') * 10);
        if (i9 > 12) {
            return false;
        }
        int i11 = 28;
        if (i10 <= 28) {
            return true;
        }
        if (i9 != 2) {
            i11 = (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) ? 30 : 31;
        } else if ((iM6853z & 15) == 0) {
        }
        return i10 <= i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isLocalTime(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.length() == 8 && str.charAt(2) == ':' && str.charAt(5) == ':') {
                char cCharAt = str.charAt(0);
                char cCharAt2 = str.charAt(1);
                char cCharAt3 = str.charAt(3);
                char cCharAt4 = str.charAt(4);
                char cCharAt5 = str.charAt(6);
                char cCharAt6 = str.charAt(7);
                if (cCharAt >= '0' && cCharAt <= '2' && cCharAt2 >= '0' && cCharAt2 <= '9' && cCharAt3 >= '0' && cCharAt3 <= '6' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '6' && cCharAt6 >= '0' && cCharAt6 <= '9') {
                    if ((cCharAt2 - '0') + ((cCharAt - '0') * 10) > 24) {
                        return false;
                    }
                    if ((cCharAt4 - '0') + ((cCharAt3 - '0') * 10) > 60) {
                        return false;
                    }
                    if ((cCharAt6 - '0') + ((cCharAt5 - '0') * 10) <= 61) {
                        return true;
                    }
                }
                return false;
            }
            try {
                LocalTime.parse(str);
                return true;
            } catch (DateTimeParseException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime localDateTime(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23, char c24, char c25, char c26, char c27, char c28, char c29, char c30, char c31, char c32) {
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i9 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i10 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        int i11 = (c19 - '0') + ((c18 - '0') * 10);
                        if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                            int i12 = (c21 - '0') + ((c20 - '0') * 10);
                            if (c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                int i13 = (c23 - '0') + ((c22 - '0') * 10);
                                if (c24 >= '0' && c24 <= '9' && c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9' && c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9' && c30 >= '0' && c30 <= '9' && c31 >= '0' && c31 <= '9' && c32 >= '0' && c32 <= '9') {
                                    return LocalDateTime.of(iM6853z, i9, i10, i11, i12, i13, (c32 - '0') + AbstractC3199a.m6853z(c31, 48, 10, AbstractC3199a.m6853z(c30, 48, 100, AbstractC3199a.m6853z(c29, 48, 1000, AbstractC3199a.m6853z(c28, 48, 10000, AbstractC3199a.m6853z(c27, 48, 100000, AbstractC3199a.m6853z(c26, 48, 1000000, AbstractC3199a.m6853z(c25, 48, 10000000, (c24 - '0') * 100000000))))))));
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long millis(ZoneId zoneId, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (zoneId == null) {
            zoneId = DEFAULT_ZONE_ID;
        }
        long j3 = (i11 - 1) + (((i10 * 367) - 362) / 12) + ((i9 + 399) / 400) + (((i9 + 3) / 4) - ((i9 + 99) / 100)) + (i9 * 365);
        if (i10 > 2) {
            j3 = ((i9 & 3) != 0 || (i9 % 100 == 0 && i9 % 400 != 0)) ? j3 - 2 : j3 - 1;
        }
        long j4 = ((j3 - 719528) * 86400) + ((long) (i12 * 3600)) + ((long) (i13 * 60)) + ((long) i14);
        int totalSeconds = 0;
        if ((zoneId == SHANGHAI_ZONE_ID || zoneId.getRules() == SHANGHAI_ZONE_RULES) && j4 >= 684900000) {
            totalSeconds = 28800;
        } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
            totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(i9, i10, i11), LocalTime.of(i12, i13, i14, i15))).getTotalSeconds();
        }
        long j5 = (j4 - ((long) totalSeconds)) * 1000;
        return i15 != 0 ? j5 + ((long) (i15 / 1000000)) : j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int month(char c10, char c11, char c12) {
        if (c10 == 'A') {
            if (c11 == 'p' && c12 == 'r') {
                return 4;
            }
            return (c11 == 'u' && c12 == 'g') ? 8 : 0;
        }
        if (c10 == 'D') {
            return (c11 == 'e' && c12 == 'c') ? 12 : 0;
        }
        if (c10 == 'F') {
            return (c11 == 'e' && c12 == 'b') ? 2 : 0;
        }
        if (c10 == 'J') {
            if (c11 == 'a' && c12 == 'n') {
                return 1;
            }
            if (c11 != 'u') {
                return 0;
            }
            if (c12 == 'n') {
                return 6;
            }
            return c12 == 'l' ? 7 : 0;
        }
        if (c10 == 'S') {
            return (c11 == 'e' && c12 == 'p') ? 9 : 0;
        }
        switch (c10) {
            case ParserConstants.RPAREN /* 77 */:
                if (c11 != 'a') {
                    return 0;
                }
                if (c12 == 'r') {
                    return 3;
                }
                return c12 == 'y' ? 5 : 0;
            case ParserConstants.LBRACE /* 78 */:
                return (c11 == 'o' && c12 == 'v') ? 11 : 0;
            case 'O':
                return (c11 == 'c' && c12 == 't') ? 10 : 0;
            default:
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int nanos(int i9, int i10) {
        return i9 * POWERS[(9 - i10) & 15];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Date parseDate(String str, String str2, ZoneId zoneId) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str2 == null || str2.isEmpty()) {
            long millis = parseMillis(str, zoneId);
            if (millis == 0) {
                return null;
            }
            return new Date(millis);
        }
        switch (str2) {
            case "yyyyMMddHHmmssSSSZ":
                return new Date(parseMillis(str, DEFAULT_ZONE_ID));
            case "yyyyMMdd":
                LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
                return new Date(millis(zoneId, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0, 0));
            case "yyyy-MM-dd":
                return new Date(parseMillis10(str, zoneId, DateTimeFormatPattern.DATE_FORMAT_10_DASH));
            case "yyyy/MM/dd":
                return new Date(parseMillis10(str, zoneId, DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
            case "yyyy/MM/dd HH:mm:ss":
                return new Date(parseMillis19(str, zoneId, DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
            case "yyyy-MM-dd HH:mm:ss":
                return new Date(parseMillisYMDHMS19(str, zoneId));
            case "dd.MM.yyyy HH:mm:ss":
                return new Date(parseMillis19(str, zoneId, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
            case "yyyy-MM-dd'T'HH:mm:ss":
                return new Date(parseMillis19(str, zoneId, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T));
            case "iso8601":
                return parseDate(str);
            default:
                if (zoneId == null) {
                    zoneId = DEFAULT_ZONE_ID;
                }
                return new Date(millis(LocalDateTime.parse(str, DateTimeFormatter.ofPattern(str2)), zoneId));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Date parseDateYMDHMS19(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Date(parseMillisYMDHMS19(str, DEFAULT_ZONE_ID));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDate parseLocalDate(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        LocalDate localDate = parseLocalDate(charArray, 0, charArray.length);
        if (localDate != null) {
            return localDate;
        }
        switch (str) {
            case "0000-0-00":
            case "00000000":
            case "":
            case "null":
            case "0000年00月00日":
            case "0000-00-00":
                return null;
            default:
                throw new DateTimeParseException(str, str, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDate parseLocalDate10(char[] cArr, int i9) {
        LocalDate localDate;
        int i10;
        int iMonth;
        char c10;
        int i11;
        int iM6853z;
        int i12;
        if (i9 + 10 > cArr.length) {
            return null;
        }
        char c11 = cArr[i9];
        char c12 = cArr[i9 + 1];
        char c13 = cArr[i9 + 2];
        char c14 = cArr[i9 + 3];
        char c15 = cArr[i9 + 4];
        char c16 = cArr[i9 + 5];
        char c17 = cArr[i9 + 6];
        char c18 = cArr[i9 + 7];
        char c19 = cArr[i9 + 8];
        char c20 = cArr[i9 + 9];
        if ((c15 != '-' || c18 != '-') && (c15 != '/' || c18 != '/')) {
            if ((c13 == '.' && c16 == '.') || (c13 == '-' && c16 == '-')) {
                localDate = null;
                c16 = c14;
                c13 = c19;
                i10 = 10;
                c14 = c20;
                c19 = c12;
                c12 = c18;
                c10 = '0';
                c18 = c11;
                c11 = c17;
                c17 = c15;
            } else if (c13 == '/' && c16 == '/') {
                c16 = c11;
                localDate = null;
                c11 = c17;
                c13 = c19;
                i10 = 10;
                c17 = c12;
                c19 = c15;
                c12 = c18;
                c18 = c14;
                c14 = c20;
            } else if (c15 == 24180 && c17 == 26376 && c20 == 26085) {
                localDate = null;
                c17 = c16;
                i10 = 10;
                c10 = '0';
                c16 = '0';
            } else {
                localDate = null;
                i10 = 10;
                if (c15 == 45380 && c17 == 50900 && c20 == 51068) {
                    c10 = '0';
                    c17 = c16;
                    c16 = '0';
                } else {
                    if ((c15 != 24180 || c18 != 26376 || c20 != 26085) && (c15 != 45380 || c18 != 50900 || c20 != 51068)) {
                        if (c12 == ' ' && c16 == ' ' && (iMonth = month(c13, c14, c15)) > 0) {
                            c14 = c20;
                            c16 = (char) ((iMonth / 10) + 48);
                            c13 = c19;
                            c10 = '0';
                            c19 = c11;
                            c11 = c17;
                            c17 = (char) ((iMonth % 10) + 48);
                            c12 = c18;
                        }
                        return localDate;
                    }
                    c10 = '0';
                    c18 = c10;
                }
            }
            if (c11 >= c10 && c11 <= '9' && c12 >= c10 && c12 <= '9' && c13 >= c10 && c13 <= '9' && c14 >= c10 && c14 <= '9') {
                int iM6853z2 = AbstractC3199a.m6853z(c12, c10, 100, (c11 - c10) * 1000);
                i11 = i10;
                iM6853z = (c14 - c10) + AbstractC3199a.m6853z(c13, c10, i11, iM6853z2);
                if (c16 >= c10 && c16 <= '9' && c17 >= c10 && c17 <= '9') {
                    i12 = (c17 - c10) + ((c16 - c10) * i11);
                    if (c18 >= c10 && c18 <= '9' && c19 >= c10 && c19 <= '9') {
                        int i13 = (c19 - c10) + ((c18 - c10) * i11);
                        return (iM6853z != 0 && i12 == 0 && i13 == 0) ? localDate : LocalDate.of(iM6853z, i12, i13);
                    }
                }
            }
            return localDate;
        }
        localDate = null;
        c18 = c19;
        i10 = 10;
        c19 = c20;
        c10 = '0';
        if (c11 >= c10) {
            int iM6853z22 = AbstractC3199a.m6853z(c12, c10, 100, (c11 - c10) * 1000);
            i11 = i10;
            iM6853z = (c14 - c10) + AbstractC3199a.m6853z(c13, c10, i11, iM6853z22);
            if (c16 >= c10) {
                i12 = (c17 - c10) + ((c16 - c10) * i11);
                if (c18 >= c10) {
                    int i132 = (c19 - c10) + ((c18 - c10) * i11);
                    if (iM6853z != 0) {
                    }
                }
            }
        }
        return localDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDate parseLocalDate11(char[] cArr, int i9) {
        int iMonth;
        int iM6853z;
        int i10;
        int i11;
        if (i9 + 11 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        if ((c14 == 24180 && c17 == 26376 && c20 == 26085) || ((c14 == '-' && c17 == '-' && c20 == 'Z') || (c14 == 45380 && c17 == 50900 && c20 == 51068))) {
            if (c10 >= '0') {
                iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
                if (c15 >= '0') {
                    i10 = (c16 - '0') + ((c15 - '0') * 10);
                    if (c18 >= '0') {
                        i11 = (c19 - '0') + ((c18 - '0') * 10);
                        if (iM6853z != 0) {
                        }
                        return LocalDate.of(iM6853z, i10, i11);
                    }
                }
            }
        } else if (c12 == ' ' && c16 == ' ' && (iMonth = month(c13, c14, c15)) > 0) {
            c15 = (char) ((iMonth / 10) + 48);
            c16 = (char) ((iMonth % 10) + 48);
            c13 = c20;
            c12 = c19;
            c19 = c11;
            c11 = c18;
            c18 = c10;
            c10 = c17;
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
                if (c15 >= '0' && c15 <= '9' && c16 >= '0' && c16 <= '9') {
                    i10 = (c16 - '0') + ((c15 - '0') * 10);
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        i11 = (c19 - '0') + ((c18 - '0') * 10);
                        if (iM6853z != 0 && i10 == 0 && i11 == 0) {
                            return null;
                        }
                        return LocalDate.of(iM6853z, i10, i11);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDate parseLocalDate8(byte[] bArr, int i9) {
        if (i9 + 8 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        if (c14 == '-' && c16 == '-') {
            c14 = '0';
            c16 = '0';
        } else if (c11 == '/' && c13 == '/') {
            c13 = c17;
            c17 = c12;
            c11 = c15;
            c12 = c16;
            c16 = '0';
            c15 = c10;
            c10 = c14;
            c14 = '0';
        } else if (c11 == '-' && c15 == '-') {
            int iMonth = month(c12, c13, c14);
            if (iMonth <= 0) {
                return null;
            }
            c14 = (char) ((iMonth / 10) + 48);
            c13 = c17;
            c15 = (char) ((iMonth % 10) + 48);
            c17 = c10;
            c10 = '2';
            c12 = c16;
            c11 = '0';
            c16 = '0';
        }
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i10 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i11 = (c17 - '0') + ((c16 - '0') * 10);
                    if (iM6853z == 0 && i10 == 0 && i11 == 0) {
                        return null;
                    }
                    return LocalDate.of(iM6853z, i10, i11);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDate parseLocalDate9(char[] cArr, int i9) {
        char c10;
        char c11;
        if (i9 + 9 > cArr.length) {
            return null;
        }
        char c12 = cArr[i9];
        char c13 = cArr[i9 + 1];
        char c14 = cArr[i9 + 2];
        char c15 = cArr[i9 + 3];
        char c16 = cArr[i9 + 4];
        char c17 = cArr[i9 + 5];
        char c18 = cArr[i9 + 6];
        char c19 = cArr[i9 + 7];
        char c20 = cArr[i9 + 8];
        if (c16 != '-' || c19 != '-') {
            if (c16 != '-' || c18 != '-') {
                if (c16 == '/' && c19 == '/') {
                    c10 = c14;
                    c14 = c17;
                    c19 = '0';
                    c11 = c15;
                    c15 = c18;
                } else {
                    if (c16 == '/' && c18 == '/') {
                        c11 = c15;
                        c15 = c17;
                        c10 = c14;
                    } else if (c13 != '.' || c16 != '.') {
                        if (c14 != '.' || c16 != '.') {
                            if (c13 == '-' && c16 == '-') {
                                c11 = c20;
                                c20 = c12;
                                c12 = c17;
                                c13 = c18;
                                c10 = c19;
                                c19 = '0';
                            } else {
                                if (c14 == '-' && c16 == '-') {
                                    c10 = c19;
                                    c14 = '0';
                                    c19 = c12;
                                    c12 = c17;
                                    c11 = c20;
                                    c20 = c13;
                                } else if ((c16 == 24180 && c18 == 26376 && c20 == 26085) || (c16 == 45380 && c18 == 50900 && c20 == 51068)) {
                                    c11 = c15;
                                    c15 = c17;
                                    c10 = c14;
                                    c20 = c19;
                                    c14 = '0';
                                    c19 = '0';
                                } else if (c14 == '-' && c18 == '-') {
                                    int iMonth = month(c15, c16, c17);
                                    if (iMonth <= 0) {
                                        return null;
                                    }
                                    c19 = c12;
                                    c12 = '2';
                                    c10 = c19;
                                    c15 = (char) ((iMonth % 10) + 48);
                                    c14 = (char) ((iMonth / 10) + 48);
                                    c11 = c20;
                                    c20 = c13;
                                    c13 = '0';
                                } else if (c13 == '/' && c16 == '/') {
                                    c11 = c20;
                                    c20 = c15;
                                    c15 = c12;
                                    c12 = c17;
                                    c13 = c18;
                                    c10 = c19;
                                    c19 = c14;
                                } else if (c14 == '/' && c16 == '/') {
                                    c14 = c12;
                                    c12 = c17;
                                    c10 = c19;
                                    c19 = '0';
                                    c11 = c20;
                                    c20 = c15;
                                    c15 = c13;
                                }
                                c13 = c18;
                            }
                        }
                    }
                    c14 = '0';
                }
                if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    int iM6853z = (c11 - '0') + AbstractC3199a.m6853z(c10, 48, 10, AbstractC3199a.m6853z(c13, 48, 100, (c12 - '0') * 1000));
                    if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                        int i10 = (c15 - '0') + ((c14 - '0') * 10);
                        if (c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9') {
                            int i11 = (c20 - '0') + ((c19 - '0') * 10);
                            if (iM6853z == 0 && i10 == 0 && i11 == 0) {
                                return null;
                            }
                            return LocalDate.of(iM6853z, i10, i11);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime(char[] cArr, int i9, int i10) {
        if (cArr == null || i10 == 0) {
            return null;
        }
        switch (i10) {
            case 4:
                if (cArr[i9] == 'n' && cArr[i9 + 1] == 'u' && cArr[i9 + 2] == 'l' && cArr[i9 + 3] == 'l') {
                    return null;
                }
                String str = new String(cArr, i9, i10);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            default:
                return parseLocalDateTimeX(cArr, i9, i10);
            case 8:
                if (cArr[2] == ':' && cArr[5] == ':') {
                    return LocalDateTime.of(LOCAL_DATE_19700101, parseLocalTime8(cArr, i9));
                }
                LocalDate localDate8 = parseLocalDate8(cArr, i9);
                if (localDate8 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate8, LocalTime.MIN);
            case 9:
                LocalDate localDate9 = parseLocalDate9(cArr, i9);
                if (localDate9 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate9, LocalTime.MIN);
            case 10:
                LocalDate localDate10 = parseLocalDate10(cArr, i9);
                if (localDate10 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate10, LocalTime.MIN);
            case 11:
                LocalDate localDate11 = parseLocalDate11(cArr, i9);
                if (localDate11 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate11, LocalTime.MIN);
            case 12:
                return parseLocalDateTime12(cArr, i9);
            case 14:
                return parseLocalDateTime14(cArr, i9);
            case 16:
                return parseLocalDateTime16(cArr, i9);
            case 17:
                return parseLocalDateTime17(cArr, i9);
            case 18:
                return parseLocalDateTime18(cArr, i9);
            case 19:
                return parseLocalDateTime19(cArr, i9);
            case 20:
                return parseLocalDateTime20(cArr, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime12(byte[] bArr, int i9) {
        int i10 = i9 + 12;
        if (i10 > bArr.length) {
            String str = new String(bArr, i9, bArr.length - i9);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        char c21 = (char) bArr[i9 + 11];
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            byte[] bArr2 = bArr;
            String str2 = new String(bArr2, i9, i10);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
        if (c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9') {
            String str3 = new String(bArr, i9, i10);
            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
        }
        int i11 = (c15 - '0') + ((c14 - '0') * 10);
        if (c16 < '0' || c16 > '9' || c17 < '0' || c17 > '9') {
            String str4 = new String(bArr, i9, i10);
            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
        }
        int i12 = (c17 - '0') + ((c16 - '0') * 10);
        if (c18 < '0' || c18 > '9' || c19 < '0' || c19 > '9') {
            String str5 = new String(bArr, i9, i10);
            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
        }
        int i13 = (c19 - '0') + ((c18 - '0') * 10);
        if (c20 < '0' || c20 > '9' || c21 < '0' || c21 > '9') {
            String str6 = new String(bArr, i9, i10);
            throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
        }
        int i14 = (c21 - '0') + ((c20 - '0') * 10);
        if (iM6853z == 0 && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return null;
        }
        return LocalDateTime.of(iM6853z, i11, i12, i13, i14, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime14(byte[] bArr, int i9) {
        if (i9 + 14 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        char c21 = (char) bArr[i9 + 11];
        char c22 = (char) bArr[i9 + 12];
        char c23 = (char) bArr[i9 + 13];
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i10 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i11 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        int i12 = (c19 - '0') + ((c18 - '0') * 10);
                        if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                            int i13 = (c21 - '0') + ((c20 - '0') * 10);
                            if (c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c23 - '0') + ((c22 - '0') * 10));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime parseLocalDateTime16(byte[] bArr, int i9) {
        byte b10;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        int iMonth;
        int iM6853z;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i9 + 16 > bArr.length) {
            return null;
        }
        byte b11 = bArr[i9];
        byte b12 = bArr[i9 + 1];
        byte b13 = bArr[i9 + 2];
        byte b14 = bArr[i9 + 3];
        byte b15 = bArr[i9 + 4];
        byte b16 = bArr[i9 + 5];
        byte b17 = bArr[i9 + 6];
        byte b18 = bArr[i9 + 7];
        byte b19 = bArr[i9 + 8];
        byte b20 = bArr[i9 + 9];
        byte b21 = bArr[i9 + 10];
        byte b22 = bArr[i9 + 11];
        byte b23 = bArr[i9 + 12];
        byte b24 = bArr[i9 + 13];
        byte b25 = bArr[i9 + 14];
        byte b26 = bArr[i9 + 15];
        if (b15 != 45 || b18 != 45 || ((b21 != 84 && b21 != 32) || b24 != 58)) {
            if (b19 == 84 && b26 == 90) {
                c22 = (char) b11;
                c21 = (char) b12;
                c20 = (char) b13;
                c18 = (char) b14;
                c17 = (char) b15;
                c16 = (char) b16;
                c15 = (char) b17;
                c14 = (char) b18;
                c13 = (char) b20;
                c12 = (char) b21;
                c19 = (char) b22;
                c11 = (char) b23;
                c23 = (char) b24;
                c10 = (char) b25;
                c24 = '0';
            } else {
                if (b15 == -27 && b16 == -71 && b17 == -76 && b19 == -26 && b20 == -100 && b21 == -120 && b24 == -26 && b25 == -105 && b26 == -91) {
                    c22 = (char) b11;
                    c21 = (char) b12;
                    c20 = (char) b13;
                    c18 = (char) b14;
                    c16 = (char) b18;
                    c15 = (char) b22;
                    c14 = (char) b23;
                    c19 = '0';
                    c17 = '0';
                    c13 = '0';
                } else {
                    if (b15 != -27 || b16 != -71 || b17 != -76 || b20 != -26 || b21 != -100 || b22 != -120 || b24 != -26 || b25 != -105 || b26 != -91) {
                        if (b15 == 45 && b18 == 45) {
                            if (b21 != 84) {
                                b10 = 32;
                                if (b21 != 32) {
                                    if (b12 == b10) {
                                        if (b24 != 58) {
                                        }
                                    }
                                    if (b12 == b10) {
                                        char c25 = (char) b11;
                                        iMonth = month((char) b13, (char) b14, (char) b15);
                                        if (iMonth > 0) {
                                        }
                                    }
                                }
                                c23 = c13;
                                c24 = c23;
                            }
                            if (b23 == 58 && b25 == 58) {
                                c22 = (char) b11;
                                c21 = (char) b12;
                                c20 = (char) b13;
                                c18 = (char) b14;
                                c17 = (char) b16;
                                c16 = (char) b17;
                                c15 = (char) b19;
                                c14 = (char) b20;
                                c12 = (char) b22;
                                c11 = (char) b24;
                                c10 = (char) b26;
                                c19 = '0';
                                c13 = '0';
                                c23 = c13;
                                c24 = c23;
                            }
                            b10 = 32;
                            if (b12 == b10) {
                            }
                            if (b12 == b10) {
                            }
                        } else {
                            b10 = 32;
                            if (b12 == b10 && b16 == b10 && b21 == b10) {
                                if (b24 != 58) {
                                    c22 = (char) b17;
                                    char c26 = (char) b18;
                                    char c27 = (char) b19;
                                    char c28 = (char) b20;
                                    int iMonth2 = month((char) b13, (char) b14, (char) b15);
                                    if (iMonth2 <= 0) {
                                        return null;
                                    }
                                    c17 = (char) ((iMonth2 / 10) + 48);
                                    c16 = (char) ((iMonth2 % 10) + 48);
                                    c13 = (char) b22;
                                    c12 = (char) b23;
                                    c19 = (char) b25;
                                    c11 = (char) b26;
                                    c18 = c28;
                                    c23 = '0';
                                    c10 = '0';
                                    c24 = '0';
                                    c14 = (char) b11;
                                    c21 = c26;
                                    c20 = c27;
                                    c15 = '0';
                                } else {
                                    b10 = 32;
                                }
                            }
                            if (b12 == b10 && b16 == b10 && b21 == b10 && b23 == 58 && b25 == 58) {
                                char c252 = (char) b11;
                                iMonth = month((char) b13, (char) b14, (char) b15);
                                if (iMonth > 0) {
                                    c17 = (char) ((iMonth / 10) + 48);
                                    c16 = (char) ((iMonth % 10) + 48);
                                    char c29 = (char) b17;
                                    char c30 = (char) b19;
                                    c18 = (char) b20;
                                    c12 = (char) b22;
                                    c11 = (char) b24;
                                    c10 = (char) b26;
                                    c14 = c252;
                                    c22 = c29;
                                    c21 = (char) b18;
                                    c20 = c30;
                                    c19 = '0';
                                    c15 = '0';
                                    c13 = '0';
                                    c23 = c13;
                                    c24 = c23;
                                }
                            }
                        }
                        return null;
                    }
                    c22 = (char) b11;
                    c21 = (char) b12;
                    c20 = (char) b13;
                    c18 = (char) b14;
                    c17 = (char) b18;
                    c16 = (char) b19;
                    c14 = (char) b23;
                    c19 = '0';
                    c15 = '0';
                    c13 = '0';
                }
                c12 = c13;
                c11 = c12;
                c23 = c11;
            }
            if (c22 >= c24 && c22 <= '9' && c21 >= c24 && c21 <= '9' && c20 >= c24 && c20 <= '9' && c18 >= c24 && c18 <= '9') {
                iM6853z = (c18 - c24) + AbstractC3199a.m6853z(c20, c24, 10, AbstractC3199a.m6853z(c21, c24, 100, (c22 - c24) * 1000));
                if (c17 >= c24 && c17 <= '9' && c16 >= c24 && c16 <= '9') {
                    i10 = (c16 - c24) + ((c17 - c24) * 10);
                    if (c15 >= c24 && c15 <= '9' && c14 >= c24 && c14 <= '9') {
                        i11 = (c14 - c24) + ((c15 - c24) * 10);
                        if (c13 >= c24 && c13 <= '9' && c12 >= c24 && c12 <= '9') {
                            i12 = (c12 - c24) + ((c13 - c24) * 10);
                            if (c19 >= c24 && c19 <= '9' && c11 >= c24 && c11 <= '9') {
                                i13 = (c11 - c24) + ((c19 - c24) * 10);
                                if (c23 >= c24 && c23 <= '9' && c10 >= c24 && c10 <= '9') {
                                    return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c10 - c24) + ((c23 - c24) * 10));
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        c22 = (char) b11;
        c21 = (char) b12;
        c20 = (char) b13;
        c18 = (char) b14;
        c17 = (char) b16;
        c16 = (char) b17;
        c15 = (char) b19;
        c14 = (char) b20;
        c13 = (char) b22;
        c12 = (char) b23;
        c19 = (char) b25;
        c11 = (char) b26;
        c23 = '0';
        c10 = c23;
        c24 = c10;
        if (c22 >= c24) {
            iM6853z = (c18 - c24) + AbstractC3199a.m6853z(c20, c24, 10, AbstractC3199a.m6853z(c21, c24, 100, (c22 - c24) * 1000));
            if (c17 >= c24) {
                i10 = (c16 - c24) + ((c17 - c24) * 10);
                if (c15 >= c24) {
                    i11 = (c14 - c24) + ((c15 - c24) * 10);
                    if (c13 >= c24) {
                        i12 = (c12 - c24) + ((c13 - c24) * 10);
                        if (c19 >= c24) {
                            i13 = (c11 - c24) + ((c19 - c24) * 10);
                            if (c23 >= c24) {
                                return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c10 - c24) + ((c23 - c24) * 10));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime17(byte[] bArr, int i9) {
        byte b10;
        String str;
        byte b11;
        String str2;
        byte b12;
        String str3;
        String str4;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        int iM6853z;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        char c25;
        if (i9 + 17 > bArr.length) {
            String str5 = new String(bArr, i9, bArr.length - i9);
            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
        }
        byte b13 = bArr[i9];
        byte b14 = bArr[i9 + 1];
        byte b15 = bArr[i9 + 2];
        byte b16 = bArr[i9 + 3];
        byte b17 = bArr[i9 + 4];
        byte b18 = bArr[i9 + 5];
        byte b19 = bArr[i9 + 6];
        byte b20 = bArr[i9 + 7];
        byte b21 = bArr[i9 + 8];
        byte b22 = bArr[i9 + 9];
        byte b23 = bArr[i9 + 10];
        byte b24 = bArr[i9 + 11];
        byte b25 = bArr[i9 + 12];
        byte b26 = bArr[i9 + 13];
        byte b27 = bArr[i9 + 14];
        byte b28 = bArr[i9 + 15];
        byte b29 = bArr[i9 + 16];
        if (b17 != 45 || b20 != 45 || ((b23 != 84 && b23 != 32) || b26 != 58 || b29 != 90)) {
            if (b17 == 45 && b19 == 45 && ((b21 == 32 || b21 == 84) && b24 == 58 && b27 == 58)) {
                c20 = (char) b13;
                c21 = (char) b14;
                char c26 = (char) b15;
                c18 = (char) b16;
                char c27 = (char) b18;
                char c28 = (char) b23;
                c12 = (char) b22;
                c13 = (char) b25;
                c14 = (char) b26;
                str4 = "illegal input ";
                c10 = '0';
                iM6853z = 0;
                c22 = (char) b29;
                c11 = (char) b20;
                c17 = c26;
                c24 = c28;
                c15 = '0';
                c19 = c27;
                c16 = (char) b28;
                c23 = '0';
            } else if (b17 == -27 && b18 == -71 && b19 == -76 && b22 == -26 && b23 == -100 && b24 == -120 && b27 == -26 && b28 == -105 && b29 == -91) {
                c20 = (char) b13;
                c21 = (char) b14;
                char c29 = (char) b15;
                c18 = (char) b16;
                c23 = (char) b20;
                char c30 = (char) b21;
                char c31 = (char) b25;
                c17 = c29;
                c10 = c31;
                c11 = (char) b26;
                str4 = "illegal input ";
                c15 = '0';
                c24 = '0';
                c22 = '0';
                c12 = '0';
                c13 = '0';
                c14 = '0';
                iM6853z = 0;
                c19 = c30;
                c16 = '0';
            } else {
                byte b30 = 32;
                if (b15 != 32 || b19 != 32 || b24 != 32) {
                    b10 = b29;
                    str = "illegal input ";
                } else if (b27 == 58) {
                    c20 = (char) b20;
                    c21 = (char) b21;
                    char c32 = (char) b22;
                    char c33 = (char) b23;
                    int iMonth = month((char) b16, (char) b17, (char) b18);
                    if (iMonth <= 0) {
                        String str6 = new String(bArr, i9, 17);
                        throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
                    }
                    char c34 = (char) ((iMonth / 10) + 48);
                    c19 = (char) ((iMonth % 10) + 48);
                    char c35 = (char) b25;
                    char c36 = (char) b26;
                    c13 = (char) b28;
                    c23 = c34;
                    c12 = c35;
                    c14 = (char) b29;
                    str4 = "illegal input ";
                    c22 = '0';
                    iM6853z = 0;
                    c11 = (char) b14;
                    c24 = c36;
                    c17 = c32;
                    c18 = c33;
                    c16 = '0';
                    c10 = (char) b13;
                } else {
                    b10 = b29;
                    str = "illegal input ";
                    b30 = 32;
                }
                if (b14 == b30 && b18 == b30 && b23 == b30 && b25 == 58 && b27 == 58) {
                    char c37 = (char) b13;
                    int iMonth2 = month((char) b15, (char) b16, (char) b17);
                    if (iMonth2 <= 0) {
                        String str7 = new String(bArr, i9, 17);
                        throw new DateTimeParseException(str.concat(str7), str7, 0);
                    }
                    char c38 = (char) ((iMonth2 / 10) + 48);
                    char c39 = (char) ((iMonth2 % 10) + 48);
                    char c40 = (char) b19;
                    char c41 = (char) b20;
                    c17 = (char) b21;
                    c24 = (char) b24;
                    char c42 = (char) b26;
                    char c43 = (char) b28;
                    c22 = (char) b10;
                    c14 = c42;
                    c10 = '0';
                    c12 = '0';
                    c13 = '0';
                    str4 = str;
                    iM6853z = 0;
                    c11 = c37;
                    c20 = c40;
                    c21 = c41;
                    c18 = (char) b22;
                    c19 = c39;
                    c16 = c43;
                    c23 = c38;
                    c15 = '0';
                } else {
                    byte b31 = b10;
                    String str8 = str;
                    byte b32 = 32;
                    if (b14 != 32 || b18 != 32 || b23 != 32) {
                        b11 = b31;
                        str2 = str8;
                    } else if (b25 == 58 && b28 == 58) {
                        char c44 = (char) b13;
                        int iMonth3 = month((char) b15, (char) b16, (char) b17);
                        if (iMonth3 <= 0) {
                            String str9 = new String(bArr, i9, 17);
                            throw new DateTimeParseException(str8.concat(str9), str9, 0);
                        }
                        char c45 = (char) ((iMonth3 / 10) + 48);
                        c25 = (char) ((iMonth3 % 10) + 48);
                        char c46 = (char) b19;
                        char c47 = (char) b20;
                        c17 = (char) b21;
                        c24 = (char) b24;
                        c22 = (char) b31;
                        c13 = (char) b26;
                        c14 = (char) b27;
                        c10 = '0';
                        c12 = '0';
                        str4 = str8;
                        iM6853z = 0;
                        c11 = c44;
                        c20 = c46;
                        c23 = c45;
                        c21 = c47;
                        c18 = (char) b22;
                        c15 = '0';
                        c19 = c25;
                        c16 = c15;
                    } else {
                        b11 = b31;
                        str2 = str8;
                        b32 = 32;
                    }
                    if (b14 != b32 || b18 != b32 || b23 != b32) {
                        b12 = b11;
                        str3 = str2;
                    } else if (b26 == 58 && b28 == 58) {
                        char c48 = (char) b13;
                        int iMonth4 = month((char) b15, (char) b16, (char) b17);
                        if (iMonth4 <= 0) {
                            String str10 = new String(bArr, i9, 17);
                            throw new DateTimeParseException(str2.concat(str10), str10, 0);
                        }
                        c23 = (char) ((iMonth4 / 10) + 48);
                        c25 = (char) ((iMonth4 % 10) + 48);
                        char c49 = (char) b19;
                        char c50 = (char) b20;
                        char c51 = (char) b21;
                        c12 = (char) b24;
                        c14 = (char) b27;
                        c10 = '0';
                        c13 = '0';
                        str4 = str2;
                        iM6853z = 0;
                        c11 = c48;
                        c20 = c49;
                        c21 = c50;
                        c22 = (char) b11;
                        c15 = '0';
                        c24 = (char) b25;
                        c17 = c51;
                        c18 = (char) b22;
                        c19 = c25;
                        c16 = c15;
                    } else {
                        b12 = b11;
                        str3 = str2;
                        b32 = 32;
                    }
                    if (b15 == b32 && b19 == b32 && b24 == b32 && b26 == 58 && b28 == 58) {
                        char c52 = (char) b13;
                        char c53 = (char) b14;
                        int iMonth5 = month((char) b16, (char) b17, (char) b18);
                        if (iMonth5 <= 0) {
                            String str11 = new String(bArr, i9, 17);
                            throw new DateTimeParseException(str3.concat(str11), str11, 0);
                        }
                        c23 = (char) ((iMonth5 / 10) + 48);
                        char c54 = (char) ((iMonth5 % 10) + 48);
                        char c55 = (char) b20;
                        char c56 = (char) b21;
                        char c57 = (char) b23;
                        char c58 = (char) b27;
                        c22 = (char) b12;
                        c10 = c52;
                        c20 = c55;
                        c14 = c58;
                        c15 = '0';
                        c12 = '0';
                        c13 = '0';
                        str4 = str3;
                        iM6853z = 0;
                        c11 = c53;
                        c21 = c56;
                        c18 = c57;
                        c24 = (char) b25;
                        c17 = (char) b22;
                        c19 = c54;
                        c16 = '0';
                    } else {
                        byte b33 = b12;
                        str4 = str3;
                        char c59 = (char) b13;
                        char c60 = (char) b14;
                        char c61 = (char) b15;
                        char c62 = (char) b16;
                        char c63 = (char) b17;
                        char c64 = (char) b18;
                        c10 = (char) b19;
                        c11 = (char) b20;
                        c12 = (char) b21;
                        char c65 = (char) b22;
                        c13 = (char) b23;
                        c14 = (char) b24;
                        char c66 = (char) b25;
                        char c67 = (char) b26;
                        c15 = '0';
                        if (b27 < 48 || b27 > 57 || b28 < 48 || b28 > 57 || b33 < 48 || b33 > 57) {
                            return null;
                        }
                        c16 = c66;
                        c17 = c61;
                        iM6853z = (b33 + JSONB.Constants.BC_INT64_BYTE_ZERO + AbstractC3199a.m6853z(b28, 48, 10, (b27 + JSONB.Constants.BC_INT64_BYTE_ZERO) * 100)) * 1000000;
                        c18 = c62;
                        c19 = c64;
                        c20 = c59;
                        c21 = c60;
                        c22 = c67;
                        c23 = c63;
                        c24 = c65;
                    }
                }
            }
            if (c20 >= c15 || c20 > '9' || c21 < c15 || c21 > '9' || c17 < c15 || c17 > '9' || c18 < c15 || c18 > '9') {
                String str12 = new String(bArr, i9, 17);
                throw new DateTimeParseException(str4.concat(str12), str12, 0);
            }
            int iM6853z2 = (c18 - c15) + AbstractC3199a.m6853z(c17, c15, 10, AbstractC3199a.m6853z(c21, c15, 100, (c20 - c15) * 1000));
            if (c23 < c15 || c23 > '9' || c19 < c15 || c19 > '9') {
                String str13 = new String(bArr, i9, 17);
                throw new DateTimeParseException(str4.concat(str13), str13, 0);
            }
            int i10 = (c19 - c15) + ((c23 - c15) * 10);
            if (c10 < c15 || c10 > '9' || c11 < c15 || c11 > '9') {
                String str14 = new String(bArr, i9, 17);
                throw new DateTimeParseException(str4.concat(str14), str14, 0);
            }
            int i11 = (c11 - c15) + ((c10 - c15) * 10);
            if (c12 < c15 || c12 > '9' || c24 < c15 || c24 > '9') {
                String str15 = new String(bArr, i9, 17);
                throw new DateTimeParseException(str4.concat(str15), str15, 0);
            }
            int i12 = (c24 - c15) + ((c12 - c15) * 10);
            if (c13 < c15 || c13 > '9' || c14 < c15 || c14 > '9') {
                String str16 = new String(bArr, i9, 17);
                throw new DateTimeParseException(str4.concat(str16), str16, 0);
            }
            int i13 = (c14 - c15) + ((c13 - c15) * 10);
            if (c16 < c15 || c16 > '9' || c22 < c15 || c22 > '9') {
                String str17 = new String(bArr, i9, 17);
                throw new DateTimeParseException(str4.concat(str17), str17, 0);
            }
            return LocalDateTime.of(iM6853z2, i10, i11, i12, i13, (c22 - c15) + ((c16 - c15) * 10), iM6853z);
        }
        c20 = (char) b13;
        c21 = (char) b14;
        char c68 = (char) b15;
        c18 = (char) b16;
        c23 = (char) b18;
        char c69 = (char) b19;
        char c70 = (char) b21;
        c12 = (char) b24;
        c13 = (char) b27;
        c14 = (char) b28;
        str4 = "illegal input ";
        c22 = '0';
        iM6853z = 0;
        c10 = c70;
        c11 = (char) b22;
        c24 = (char) b25;
        c19 = c69;
        c16 = '0';
        c17 = c68;
        c15 = c16;
        if (c20 >= c15) {
        }
        String str122 = new String(bArr, i9, 17);
        throw new DateTimeParseException(str4.concat(str122), str122, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2 A[PHI: r11
  0x02a2: PHI (r11v4 char) = (r11v3 char), (r11v3 char), (r11v3 char), (r11v9 char) binds: [B:113:0x025e, B:114:0x0260, B:115:0x0262, B:125:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0 A[PHI: r5
  0x00c0: PHI (r5v5 char) = (r5v4 char), (r5v4 char), (r5v33 char) binds: [B:16:0x009b, B:17:0x009d, B:23:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[PHI: r5
  0x00e5: PHI (r5v6 char) = (r5v5 char), (r5v5 char), (r5v28 char) binds: [B:27:0x00c0, B:28:0x00c2, B:34:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a A[PHI: r5
  0x010a: PHI (r5v7 char) = (r5v6 char), (r5v6 char), (r5v23 char) binds: [B:38:0x00e5, B:39:0x00e7, B:45:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0 A[PHI: r4
  0x01c0: PHI (r4v4 char) = (r4v3 char), (r4v3 char), (r4v3 char), (r4v23 char) binds: [B:72:0x0178, B:73:0x017a, B:74:0x017c, B:84:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime parseLocalDateTime18(byte[] bArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        if (i9 + 18 > bArr.length) {
            String str = new String(bArr, i9, bArr.length - i9);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char c20 = (char) bArr[i9];
        char c21 = (char) bArr[i9 + 1];
        char c22 = (char) bArr[i9 + 2];
        char c23 = (char) bArr[i9 + 3];
        char c24 = (char) bArr[i9 + 4];
        char c25 = (char) bArr[i9 + 5];
        char c26 = (char) bArr[i9 + 6];
        char c27 = (char) bArr[i9 + 7];
        char c28 = (char) bArr[i9 + 8];
        char c29 = (char) bArr[i9 + 9];
        char c30 = (char) bArr[i9 + 10];
        char c31 = (char) bArr[i9 + 11];
        char c32 = (char) bArr[i9 + 12];
        char c33 = (char) bArr[i9 + 13];
        char c34 = (char) bArr[i9 + 14];
        char c35 = (char) bArr[i9 + 15];
        char c36 = (char) bArr[i9 + 16];
        String str2 = "illegal input ";
        char c37 = (char) bArr[i9 + 17];
        char c38 = '-';
        if (c24 == '-' && c26 == '-') {
            if ((c29 == ' ' || c29 == 'T') && c32 == ':' && c35 == ':') {
                c12 = c33;
                c26 = c25;
                c16 = c36;
                c17 = c20;
                c29 = c28;
                c35 = c34;
                c18 = c31;
                c19 = '0';
                c25 = '0';
            } else {
                c38 = '-';
                if (c24 == c38) {
                    if (c24 == c38) {
                    }
                }
            }
        } else if (c24 == c38 || c27 != c38) {
            if (c24 == c38 && c27 == c38) {
                if ((c30 == ' ' || c30 == 'T') && c32 == ':' && c35 == ':') {
                    c12 = c33;
                    c16 = c36;
                    c17 = c20;
                    c27 = c28;
                    c35 = c34;
                    c18 = c31;
                    c19 = '0';
                    c30 = '0';
                } else {
                    c38 = '-';
                    if (c24 == c38) {
                        if (c24 == c38) {
                        }
                    }
                }
            } else if (c24 == c38 && c27 == c38) {
                if ((c30 == ' ' || c30 == 'T') && c33 == ':' && c35 == ':') {
                    c16 = c36;
                    c17 = c20;
                    c27 = c28;
                    c35 = c34;
                    c30 = c31;
                    c19 = '0';
                    c18 = c32;
                    c12 = '0';
                } else {
                    c38 = '-';
                    if (c24 == c38) {
                        if (c21 != ' ') {
                            c10 = ' ';
                            if (c21 == ' ') {
                                if (c21 == c10) {
                                }
                                if (c22 == c10) {
                                }
                            }
                        }
                    }
                }
            } else if (c24 == c38 && c27 == c38 && ((c30 == ' ' || c30 == 'T') && c33 == ':' && c36 == ':')) {
                c18 = c32;
                c17 = c20;
                c27 = c28;
                c12 = c34;
                c30 = c31;
                c19 = '0';
                c16 = '0';
            } else if (c21 != ' ' && c25 == ' ' && c30 == ' ' && c32 == ':' && c35 == ':') {
                int iMonth = month(c22, c23, c24);
                if (iMonth <= 0) {
                    String str3 = new String(bArr, i9, 18);
                    throw new DateTimeParseException(str2.concat(str3), str3, 0);
                }
                c25 = (char) ((iMonth / 10) + 48);
                c12 = c33;
                c17 = c26;
                c23 = c29;
                c16 = c36;
                c29 = c20;
                c22 = c28;
                c35 = c34;
                c18 = c31;
                c19 = '0';
                c30 = '0';
                c26 = (char) ((iMonth % 10) + 48);
                c21 = c27;
                c27 = '0';
            } else {
                c10 = ' ';
                if (c21 == ' ' || c25 != ' ' || c30 != ' ') {
                    if (c21 == c10 && c25 == c10 && c30 == c10) {
                        if (c33 == ':' || c36 != ':') {
                            c10 = ' ';
                        } else {
                            int iMonth2 = month(c22, c23, c24);
                            if (iMonth2 <= 0) {
                                String str4 = new String(bArr, i9, 18);
                                throw new DateTimeParseException(str2.concat(str4), str4, 0);
                            }
                            c25 = (char) ((iMonth2 / 10) + 48);
                            c26 = (char) ((iMonth2 % 10) + 48);
                            c17 = c26;
                            c21 = c27;
                            c23 = c29;
                            c29 = c20;
                            c22 = c28;
                            c12 = c34;
                            c30 = c31;
                            c18 = c32;
                            c16 = '0';
                            c27 = '0';
                            str2 = str2;
                            c19 = c27;
                        }
                    }
                    if (c22 == c10 && c26 == c10) {
                        c11 = c21;
                        c13 = c31;
                        if (c13 == c10) {
                            c12 = c34;
                            c14 = c27;
                            if (c12 == ':' && c36 == ':') {
                                int iMonth3 = month(c23, c24, c25);
                                if (iMonth3 <= 0) {
                                    String str5 = new String(bArr, i9, 18);
                                    throw new DateTimeParseException(str2.concat(str5), str5, 0);
                                }
                                c25 = (char) ((iMonth3 / 10) + 48);
                                c18 = c33;
                                c26 = (char) ((iMonth3 % 10) + 48);
                                c22 = c29;
                                c23 = c30;
                                c27 = c20;
                                c21 = c28;
                                c17 = c14;
                                c30 = c32;
                                c29 = c11;
                                c12 = '0';
                                c16 = '0';
                                str2 = str2;
                                c19 = '0';
                            } else {
                                c15 = ' ';
                                if (c22 == ' ' && c26 == ' ' && c13 == ' ') {
                                    if (c33 != ':' || c36 != ':') {
                                        c15 = ' ';
                                        if (c22 == c15) {
                                        }
                                        String str6 = new String(bArr, i9, 18);
                                        throw new DateTimeParseException(str2.concat(str6), str6, 0);
                                    }
                                    int iMonth4 = month(c23, c24, c25);
                                    if (iMonth4 <= 0) {
                                        String str7 = new String(bArr, i9, 18);
                                        throw new DateTimeParseException(str2.concat(str7), str7, 0);
                                    }
                                    c25 = (char) ((iMonth4 / 10) + 48);
                                    c26 = (char) ((iMonth4 % 10) + 48);
                                    c22 = c29;
                                    c23 = c30;
                                    c27 = c20;
                                    c21 = c28;
                                    c17 = c14;
                                    c18 = c32;
                                    c29 = c11;
                                    c16 = '0';
                                    c30 = '0';
                                    str2 = str2;
                                    c19 = c30;
                                } else {
                                    if (c22 == c15 || c26 != c15 || c13 != c15 || c33 != ':' || c35 != ':') {
                                        String str62 = new String(bArr, i9, 18);
                                        throw new DateTimeParseException(str2.concat(str62), str62, 0);
                                    }
                                    int iMonth5 = month(c23, c24, c25);
                                    if (iMonth5 <= 0) {
                                        String str8 = new String(bArr, i9, 18);
                                        throw new DateTimeParseException(str2.concat(str8), str8, 0);
                                    }
                                    c25 = (char) ((iMonth5 / 10) + 48);
                                    c26 = (char) ((iMonth5 % 10) + 48);
                                    c35 = c12;
                                    c22 = c29;
                                    c23 = c30;
                                    c16 = c36;
                                    c27 = c20;
                                    c21 = c28;
                                    c17 = c14;
                                    c18 = c32;
                                    c29 = c11;
                                    c12 = '0';
                                    c30 = '0';
                                    str2 = str2;
                                    c19 = c30;
                                }
                            }
                        } else {
                            c12 = c34;
                        }
                    } else {
                        c11 = c21;
                        c12 = c34;
                        c13 = c31;
                    }
                    c14 = c27;
                    c15 = ' ';
                    if (c22 == ' ') {
                        if (c22 == c15) {
                        }
                        String str622 = new String(bArr, i9, 18);
                        throw new DateTimeParseException(str2.concat(str622), str622, 0);
                    }
                } else if (c33 == ':' && c35 == ':') {
                    int iMonth6 = month(c22, c23, c24);
                    if (iMonth6 <= 0) {
                        String str9 = new String(bArr, i9, 18);
                        throw new DateTimeParseException(str2.concat(str9), str9, 0);
                    }
                    c25 = (char) ((iMonth6 / 10) + 48);
                    c26 = (char) ((iMonth6 % 10) + 48);
                    c17 = c26;
                    c21 = c27;
                    c23 = c29;
                    c16 = c36;
                    c29 = c20;
                    c22 = c28;
                    c35 = c34;
                    c30 = c31;
                    c18 = c32;
                    c12 = '0';
                    c27 = '0';
                    str2 = str2;
                    c19 = c27;
                } else {
                    c10 = ' ';
                    if (c21 == c10) {
                        if (c33 == ':') {
                        }
                        c10 = ' ';
                    }
                    if (c22 == c10) {
                        c11 = c21;
                        c12 = c34;
                        c13 = c31;
                        c14 = c27;
                        c15 = ' ';
                        if (c22 == ' ') {
                        }
                    }
                }
            }
        } else if ((c29 == ' ' || c29 == 'T') && c32 == ':' && c35 == ':') {
            c12 = c33;
            c16 = c36;
            c17 = c20;
            c29 = c28;
            c35 = c34;
            c18 = c31;
            c19 = '0';
            c27 = '0';
        } else {
            c38 = '-';
            if (c24 == c38) {
                if (c24 == c38) {
                }
            }
        }
        if (c17 < c19 || c17 > '9' || c21 < c19 || c21 > '9' || c22 < c19 || c22 > '9' || c23 < c19 || c23 > '9') {
            byte[] bArr2 = bArr;
            String str10 = str2;
            String str11 = new String(bArr2, i9, 18);
            throw new DateTimeParseException(str10.concat(str11), str11, 0);
        }
        int iM6853z = (c23 - c19) + AbstractC3199a.m6853z(c22, c19, 10, AbstractC3199a.m6853z(c21, c19, 100, (c17 - c19) * 1000));
        if (c25 < c19 || c25 > '9' || c26 < c19 || c26 > '9') {
            String str12 = new String(bArr, i9, 18);
            throw new DateTimeParseException(str2.concat(str12), str12, 0);
        }
        int i10 = (c26 - c19) + ((c25 - c19) * 10);
        if (c27 < c19 || c27 > '9' || c29 < c19 || c29 > '9') {
            String str13 = new String(bArr, i9, 18);
            throw new DateTimeParseException(str2.concat(str13), str13, 0);
        }
        int i11 = (c29 - c19) + ((c27 - c19) * 10);
        if (c30 < c19 || c30 > '9' || c18 < c19 || c18 > '9') {
            String str14 = new String(bArr, i9, 18);
            throw new DateTimeParseException(str2.concat(str14), str14, 0);
        }
        int i12 = (c18 - c19) + ((c30 - c19) * 10);
        if (c12 < c19 || c12 > '9' || c35 < c19 || c35 > '9') {
            String str15 = new String(bArr, i9, 18);
            throw new DateTimeParseException(str2.concat(str15), str15, 0);
        }
        int i13 = (c35 - c19) + ((c12 - c19) * 10);
        if (c16 < c19 || c16 > '9' || c37 < c19 || c37 > '9') {
            String str16 = new String(bArr, i9, 18);
            throw new DateTimeParseException(str2.concat(str16), str16, 0);
        }
        return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c37 - '0') + ((c16 - c19) * 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime19(byte[] bArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        if (i9 + 19 > bArr.length) {
            return null;
        }
        char c22 = (char) bArr[i9];
        char c23 = (char) bArr[i9 + 1];
        char c24 = (char) bArr[i9 + 2];
        char c25 = (char) bArr[i9 + 3];
        char c26 = (char) bArr[i9 + 4];
        char c27 = (char) bArr[i9 + 5];
        char c28 = (char) bArr[i9 + 6];
        char c29 = (char) bArr[i9 + 7];
        char c30 = (char) bArr[i9 + 8];
        char c31 = (char) bArr[i9 + 9];
        char c32 = (char) bArr[i9 + 10];
        char c33 = (char) bArr[i9 + 11];
        char c34 = (char) bArr[i9 + 12];
        char c35 = (char) bArr[i9 + 13];
        char c36 = (char) bArr[i9 + 14];
        char c37 = (char) bArr[i9 + 15];
        char c38 = (char) bArr[i9 + 16];
        char c39 = (char) bArr[i9 + 17];
        char c40 = (char) bArr[i9 + 18];
        if (c26 == '-' && c29 == '-' && ((c32 == ' ' || c32 == 'T') && c35 == ':' && c38 == ':')) {
            c14 = c23;
            c12 = c36;
            c15 = c24;
            c16 = c25;
            c13 = c28;
            c11 = c30;
            c19 = c31;
            c17 = c33;
            c18 = c34;
            c21 = c22;
            c20 = c27;
        } else {
            char c41 = '/';
            if (c26 == '/' && c29 == '/') {
                if ((c32 != ' ' && c32 != 'T') || c35 != ':' || c38 != ':') {
                    c41 = '/';
                }
                c14 = c23;
                c12 = c36;
                c15 = c24;
                c16 = c25;
                c13 = c28;
                c11 = c30;
                c19 = c31;
                c17 = c33;
                c18 = c34;
                c21 = c22;
                c20 = c27;
            }
            if (c24 == c41 && c27 == c41 && ((c32 == ' ' || c32 == 'T') && c35 == ':' && c38 == ':')) {
                c19 = c23;
                c12 = c36;
                c13 = c26;
                c14 = c29;
                c15 = c30;
                c16 = c31;
                c17 = c33;
                c18 = c34;
                c11 = c22;
            } else {
                if (c23 != ' ' || c27 != ' ' || c32 != ' ' || c35 != ':' || c38 != ':') {
                    return null;
                }
                int iMonth = month(c24, c25, c26);
                if (iMonth > 0) {
                    c10 = (char) ((iMonth % 10) + 48);
                    c25 = (char) ((iMonth / 10) + 48);
                } else {
                    c25 = '0';
                    c10 = '0';
                }
                c11 = '0';
                c12 = c36;
                c13 = c10;
                c14 = c29;
                c15 = c30;
                c16 = c31;
                c17 = c33;
                c18 = c34;
                c19 = c22;
            }
            c20 = c25;
            c21 = c28;
        }
        return localDateTime(c21, c14, c15, c16, c20, c13, c11, c19, c17, c18, c12, c37, c39, c40);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime20(byte[] bArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        int i10 = i9 + 19;
        if (i10 > bArr.length) {
            return null;
        }
        char c14 = (char) bArr[i9];
        char c15 = (char) bArr[i9 + 1];
        char c16 = (char) bArr[i9 + 2];
        char c17 = (char) bArr[i9 + 3];
        char c18 = (char) bArr[i9 + 4];
        char c19 = (char) bArr[i9 + 5];
        char c20 = (char) bArr[i9 + 6];
        char c21 = (char) bArr[i9 + 7];
        char c22 = (char) bArr[i9 + 8];
        char c23 = (char) bArr[i9 + 9];
        char c24 = (char) bArr[i9 + 10];
        char c25 = (char) bArr[i9 + 11];
        char c26 = (char) bArr[i9 + 12];
        char c27 = (char) bArr[i9 + 13];
        char c28 = (char) bArr[i9 + 14];
        char c29 = (char) bArr[i9 + 15];
        char c30 = (char) bArr[i9 + 16];
        char c31 = (char) bArr[i9 + 17];
        char c32 = (char) bArr[i9 + 18];
        char c33 = (char) bArr[i10];
        if (c16 != ' ' || c20 != ' ' || c25 != ' ' || c28 != ':' || c31 != ':') {
            return null;
        }
        int iMonth = month(c17, c18, c19);
        if (iMonth > 0) {
            c10 = c21;
            c11 = c22;
            c13 = (char) ((iMonth % 10) + 48);
            c12 = (char) ((iMonth / 10) + 48);
        } else {
            c10 = c21;
            c11 = c22;
            c12 = '0';
            c13 = '0';
        }
        return localDateTime(c10, c11, c23, c24, c12, c13, c14, c15, c26, c27, c29, c30, c32, c33);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime26(byte[] bArr, int i9) {
        if (i9 + 26 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        char c21 = (char) bArr[i9 + 11];
        char c22 = (char) bArr[i9 + 12];
        char c23 = (char) bArr[i9 + 13];
        char c24 = (char) bArr[i9 + 14];
        char c25 = (char) bArr[i9 + 15];
        char c26 = (char) bArr[i9 + 16];
        char c27 = (char) bArr[i9 + 17];
        char c28 = (char) bArr[i9 + 18];
        char c29 = (char) bArr[i9 + 19];
        char c30 = (char) bArr[i9 + 20];
        char c31 = (char) bArr[i9 + 21];
        char c32 = (char) bArr[i9 + 22];
        char c33 = (char) bArr[i9 + 23];
        char c34 = (char) bArr[i9 + 24];
        char c35 = (char) bArr[i9 + 25];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, '0', '0', '0');
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime27(byte[] bArr, int i9) {
        if (i9 + 27 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        char c21 = (char) bArr[i9 + 11];
        char c22 = (char) bArr[i9 + 12];
        char c23 = (char) bArr[i9 + 13];
        char c24 = (char) bArr[i9 + 14];
        char c25 = (char) bArr[i9 + 15];
        char c26 = (char) bArr[i9 + 16];
        char c27 = (char) bArr[i9 + 17];
        char c28 = (char) bArr[i9 + 18];
        char c29 = (char) bArr[i9 + 19];
        char c30 = (char) bArr[i9 + 20];
        char c31 = (char) bArr[i9 + 21];
        char c32 = (char) bArr[i9 + 22];
        char c33 = (char) bArr[i9 + 23];
        char c34 = (char) bArr[i9 + 24];
        char c35 = (char) bArr[i9 + 25];
        char c36 = (char) bArr[i9 + 26];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, c36, '0', '0');
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime28(byte[] bArr, int i9) {
        if (i9 + 28 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        char c21 = (char) bArr[i9 + 11];
        char c22 = (char) bArr[i9 + 12];
        char c23 = (char) bArr[i9 + 13];
        char c24 = (char) bArr[i9 + 14];
        char c25 = (char) bArr[i9 + 15];
        char c26 = (char) bArr[i9 + 16];
        char c27 = (char) bArr[i9 + 17];
        char c28 = (char) bArr[i9 + 18];
        char c29 = (char) bArr[i9 + 19];
        char c30 = (char) bArr[i9 + 20];
        char c31 = (char) bArr[i9 + 21];
        char c32 = (char) bArr[i9 + 22];
        char c33 = (char) bArr[i9 + 23];
        char c34 = (char) bArr[i9 + 24];
        char c35 = (char) bArr[i9 + 25];
        char c36 = (char) bArr[i9 + 26];
        char c37 = (char) bArr[i9 + 27];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, c36, c37, '0');
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTime29(byte[] bArr, int i9) {
        if (i9 + 29 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        char c21 = (char) bArr[i9 + 11];
        char c22 = (char) bArr[i9 + 12];
        char c23 = (char) bArr[i9 + 13];
        char c24 = (char) bArr[i9 + 14];
        char c25 = (char) bArr[i9 + 15];
        char c26 = (char) bArr[i9 + 16];
        char c27 = (char) bArr[i9 + 17];
        char c28 = (char) bArr[i9 + 18];
        char c29 = (char) bArr[i9 + 19];
        char c30 = (char) bArr[i9 + 20];
        char c31 = (char) bArr[i9 + 21];
        char c32 = (char) bArr[i9 + 22];
        char c33 = (char) bArr[i9 + 23];
        char c34 = (char) bArr[i9 + 24];
        char c35 = (char) bArr[i9 + 25];
        char c36 = (char) bArr[i9 + 26];
        char c37 = (char) bArr[i9 + 27];
        char c38 = (char) bArr[i9 + 28];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, c36, c37, c38);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalDateTime parseLocalDateTimeX(byte[] bArr, int i9, int i10) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        char c25;
        if (bArr == null || i10 == 0 || i10 < 21 || i10 > 29) {
            return null;
        }
        char c26 = (char) bArr[i9];
        char c27 = (char) bArr[i9 + 1];
        char c28 = (char) bArr[i9 + 2];
        char c29 = (char) bArr[i9 + 3];
        char c30 = (char) bArr[i9 + 4];
        char c31 = (char) bArr[i9 + 5];
        char c32 = (char) bArr[i9 + 6];
        char c33 = (char) bArr[i9 + 7];
        char c34 = (char) bArr[i9 + 8];
        char c35 = (char) bArr[i9 + 9];
        char c36 = (char) bArr[i9 + 10];
        char c37 = (char) bArr[i9 + 11];
        char c38 = (char) bArr[i9 + 12];
        char c39 = (char) bArr[i9 + 13];
        char c40 = (char) bArr[i9 + 14];
        char c41 = (char) bArr[i9 + 15];
        char c42 = (char) bArr[i9 + 16];
        char c43 = (char) bArr[i9 + 17];
        char c44 = (char) bArr[i9 + 18];
        char c45 = (char) bArr[i9 + 19];
        char c46 = '0';
        switch (i10) {
            case 21:
                c10 = (char) bArr[i9 + 20];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c15 = '0';
                c16 = '0';
                c17 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c22 = c27;
                c23 = '0';
                c24 = '0';
                c25 = '0';
                break;
            case 22:
                char c47 = (char) bArr[i9 + 20];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c16 = '0';
                c17 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c22 = c27;
                c46 = (char) bArr[i9 + 21];
                c23 = '0';
                c24 = '0';
                c25 = '0';
                c10 = c47;
                c15 = '0';
                break;
            case 23:
                char c48 = (char) bArr[i9 + 20];
                char c49 = (char) bArr[i9 + 21];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c17 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c22 = c27;
                c23 = (char) bArr[i9 + 22];
                c24 = '0';
                c25 = '0';
                c10 = c48;
                c46 = c49;
                c15 = '0';
                c16 = c15;
                break;
            case 24:
                char c50 = (char) bArr[i9 + 20];
                char c51 = (char) bArr[i9 + 21];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c22 = c27;
                c23 = (char) bArr[i9 + 22];
                c24 = (char) bArr[i9 + 23];
                c25 = '0';
                c17 = '0';
                c10 = c50;
                c46 = c51;
                c15 = '0';
                c16 = c15;
                break;
            case 25:
                char c52 = (char) bArr[i9 + 20];
                char c53 = (char) bArr[i9 + 21];
                char c54 = (char) bArr[i9 + 22];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c23 = c54;
                c24 = (char) bArr[i9 + 23];
                c17 = '0';
                c22 = c27;
                c46 = c53;
                c25 = (char) bArr[i9 + 24];
                c16 = '0';
                c10 = c52;
                c15 = '0';
                break;
            case 26:
                char c55 = (char) bArr[i9 + 20];
                char c56 = (char) bArr[i9 + 21];
                char c57 = (char) bArr[i9 + 22];
                char c58 = (char) bArr[i9 + 23];
                char c59 = (char) bArr[i9 + 24];
                c14 = (char) bArr[i9 + 25];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c19 = c40;
                c21 = c44;
                c10 = c55;
                c24 = c58;
                c15 = '0';
                c22 = c27;
                c25 = c59;
                c18 = c38;
                c20 = c43;
                c46 = c56;
                c23 = c57;
                c16 = '0';
                c17 = '0';
                break;
            case 27:
                char c60 = (char) bArr[i9 + 20];
                char c61 = (char) bArr[i9 + 21];
                char c62 = (char) bArr[i9 + 22];
                char c63 = (char) bArr[i9 + 23];
                char c64 = (char) bArr[i9 + 24];
                char c65 = (char) bArr[i9 + 25];
                c15 = (char) bArr[i9 + 26];
                c10 = c60;
                c14 = c65;
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c19 = c40;
                c21 = c44;
                c24 = c63;
                c22 = c27;
                c25 = c64;
                c18 = c38;
                c20 = c43;
                c23 = c62;
                c17 = '0';
                c46 = c61;
                c16 = '0';
                break;
            case 28:
                char c66 = (char) bArr[i9 + 20];
                char c67 = (char) bArr[i9 + 21];
                char c68 = (char) bArr[i9 + 22];
                char c69 = (char) bArr[i9 + 23];
                char c70 = (char) bArr[i9 + 24];
                char c71 = (char) bArr[i9 + 25];
                char c72 = (char) bArr[i9 + 26];
                c14 = c71;
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c19 = c40;
                c21 = c44;
                c24 = c69;
                c22 = c27;
                c25 = c70;
                c18 = c38;
                c20 = c43;
                c23 = c68;
                c17 = '0';
                c46 = c67;
                c16 = (char) bArr[i9 + 27];
                c10 = c66;
                c15 = c72;
                break;
            default:
                char c73 = (char) bArr[i9 + 20];
                char c74 = (char) bArr[i9 + 21];
                char c75 = (char) bArr[i9 + 22];
                char c76 = (char) bArr[i9 + 23];
                char c77 = (char) bArr[i9 + 24];
                char c78 = (char) bArr[i9 + 25];
                char c79 = (char) bArr[i9 + 26];
                char c80 = (char) bArr[i9 + 27];
                c22 = c27;
                c25 = c77;
                c46 = c74;
                c15 = c79;
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c19 = c40;
                c21 = c44;
                c24 = c76;
                c17 = (char) bArr[i9 + 28];
                c10 = c73;
                c14 = c78;
                c18 = c38;
                c20 = c43;
                c23 = c75;
                c16 = c80;
                break;
        }
        if (c30 == '-' && c33 == '-' && ((c36 == ' ' || c36 == 'T') && c39 == ':' && c42 == ':' && c45 == '.')) {
            return localDateTime(c26, c22, c28, c29, c31, c32, c11, c12, c13, c18, c19, c41, c20, c21, c10, c46, c23, c24, c25, c14, c15, c16, c17);
        }
        int i11 = i9 + i10;
        if (bArr[i11 - 15] != 45 || bArr[i11 - 12] != 45) {
            return null;
        }
        byte b10 = bArr[i11 - 9];
        if ((b10 == 32 || b10 == 84) && bArr[i11 - 6] == 58 && bArr[i11 - 3] == 58) {
            return LocalDateTime.of(TypeUtils.parseInt(bArr, i9, i10 - 15), TypeUtils.parseInt(bArr, i11 - 14, 2), TypeUtils.parseInt(bArr, i11 - 11, 2), TypeUtils.parseInt(bArr, i11 - 8, 2), TypeUtils.parseInt(bArr, i11 - 5, 2), TypeUtils.parseInt(bArr, i11 - 2, 2));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) {
        if (c12 == ':' && c15 == ':' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i9 = (c11 - '0') + ((c10 - '0') * 10);
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                int i10 = (c14 - '0') + ((c13 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    return LocalTime.of(i9, i10, (c17 - '0') + ((c16 - '0') * 10));
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime10(byte[] bArr, int i9) {
        if (i9 + 10 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        byte b12 = bArr[i9 + 2];
        byte b13 = bArr[i9 + 3];
        byte b14 = bArr[i9 + 4];
        byte b15 = bArr[i9 + 5];
        byte b16 = bArr[i9 + 6];
        byte b17 = bArr[i9 + 7];
        byte b18 = bArr[i9 + 8];
        byte b19 = bArr[i9 + 9];
        if (b12 == 58 && b15 == 58 && b18 == 46 && b10 >= 48 && b10 <= 57 && b11 >= 48 && b11 <= 57) {
            int i10 = (b11 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b10 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
            if (b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57) {
                int i11 = (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b13 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                if (b16 >= 48 && b16 <= 57 && b17 >= 48 && b17 <= 57) {
                    int i12 = (b17 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b16 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                    if (b19 >= 48 && b19 <= 57) {
                        return LocalTime.of(i10, i11, i12, (b19 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100000000);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime11(byte[] bArr, int i9) {
        if (i9 + 11 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        byte b12 = bArr[i9 + 2];
        byte b13 = bArr[i9 + 3];
        byte b14 = bArr[i9 + 4];
        byte b15 = bArr[i9 + 5];
        byte b16 = bArr[i9 + 6];
        byte b17 = bArr[i9 + 7];
        byte b18 = bArr[i9 + 8];
        byte b19 = bArr[i9 + 9];
        byte b20 = bArr[i9 + 10];
        if (b12 == 58 && b15 == 58 && b18 == 46 && b10 >= 48 && b10 <= 57 && b11 >= 48 && b11 <= 57) {
            int i10 = (b11 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b10 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
            if (b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57) {
                int i11 = (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b13 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                if (b16 >= 48 && b16 <= 57 && b17 >= 48 && b17 <= 57) {
                    int i12 = (b17 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b16 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                    if (b19 >= 48 && b19 <= 57 && b20 >= 48 && b20 <= 57) {
                        return LocalTime.of(i10, i11, i12, (((b20 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10) + ((b19 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) * 1000000);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime12(byte[] bArr, int i9) {
        if (i9 + 12 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        byte b12 = bArr[i9 + 2];
        byte b13 = bArr[i9 + 3];
        byte b14 = bArr[i9 + 4];
        byte b15 = bArr[i9 + 5];
        byte b16 = bArr[i9 + 6];
        byte b17 = bArr[i9 + 7];
        byte b18 = bArr[i9 + 8];
        byte b19 = bArr[i9 + 9];
        byte b20 = bArr[i9 + 10];
        byte b21 = bArr[i9 + 11];
        if (b12 == 58 && b15 == 58 && b18 == 46 && b10 >= 48 && b10 <= 57 && b11 >= 48 && b11 <= 57) {
            int i10 = (b11 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b10 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
            if (b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57) {
                int i11 = (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b13 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                if (b16 >= 48 && b16 <= 57 && b17 >= 48 && b17 <= 57) {
                    int i12 = (b17 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b16 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                    if (b19 >= 48 && b19 <= 57 && b20 >= 48 && b20 <= 57 && b21 >= 48 && b21 <= 57) {
                        return LocalTime.of(i10, i11, i12, ((b21 - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(b20, 48, 10, (b19 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) * 1000000);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime15(char[] cArr, int i9) {
        if (i9 + 15 > cArr.length || cArr[i9 + 2] != ':' || cArr[i9 + 5] != ':' || cArr[i9 + 8] != '.') {
            return null;
        }
        int iDigit2 = IOUtils.digit2(cArr, i9);
        int iDigit22 = IOUtils.digit2(cArr, i9 + 3);
        int iDigit23 = IOUtils.digit2(cArr, i9 + 6);
        int nanos = readNanos(cArr, 6, i9 + 9);
        if ((iDigit2 | iDigit22 | iDigit23 | nanos) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, nanos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime18(byte[] bArr, int i9) {
        if (i9 + 18 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        byte b12 = bArr[i9 + 2];
        byte b13 = bArr[i9 + 3];
        byte b14 = bArr[i9 + 4];
        byte b15 = bArr[i9 + 5];
        byte b16 = bArr[i9 + 6];
        byte b17 = bArr[i9 + 7];
        byte b18 = bArr[i9 + 8];
        byte b19 = bArr[i9 + 9];
        byte b20 = bArr[i9 + 10];
        byte b21 = bArr[i9 + 11];
        byte b22 = bArr[i9 + 12];
        byte b23 = bArr[i9 + 13];
        byte b24 = bArr[i9 + 14];
        byte b25 = bArr[i9 + 15];
        byte b26 = bArr[i9 + 16];
        byte b27 = bArr[i9 + 17];
        if (b12 == 58 && b15 == 58 && b18 == 46 && b10 >= 48 && b10 <= 57 && b11 >= 48 && b11 <= 57) {
            int i10 = (b11 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b10 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
            if (b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57) {
                int i11 = (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b13 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                if (b16 >= 48 && b16 <= 57 && b17 >= 48 && b17 <= 57) {
                    int i12 = (b17 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b16 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                    if (b19 >= 48 && b19 <= 57 && b20 >= 48 && b20 <= 57 && b21 >= 48 && b21 <= 57 && b22 >= 48 && b22 <= 57 && b23 >= 48 && b23 <= 57 && b24 >= 48 && b24 <= 57 && b25 >= 48 && b25 <= 57 && b26 >= 48 && b26 <= 57 && b27 >= 48 && b27 <= 57) {
                        return LocalTime.of(i10, i11, i12, b27 + JSONB.Constants.BC_INT64_BYTE_ZERO + AbstractC3199a.m6853z(b26, 48, 10, AbstractC3199a.m6853z(b25, 48, 100, AbstractC3199a.m6853z(b24, 48, 1000, AbstractC3199a.m6853z(b23, 48, 10000, AbstractC3199a.m6853z(b22, 48, 100000, AbstractC3199a.m6853z(b21, 48, 1000000, AbstractC3199a.m6853z(b20, 48, 10000000, (b19 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100000000))))))));
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime5(byte[] bArr, int i9) {
        if (i9 + 5 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        byte b12 = bArr[i9 + 2];
        byte b13 = bArr[i9 + 3];
        byte b14 = bArr[i9 + 4];
        if (b12 == 58 && b10 >= 48 && b10 <= 57 && b11 >= 48 && b11 <= 57) {
            int i10 = (b11 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b10 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
            if (b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57) {
                return LocalTime.of(i10, (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b13 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocalTime parseLocalTime8(byte[] bArr, int i9) {
        if (i9 + 8 > bArr.length) {
            return null;
        }
        return parseLocalTime((char) bArr[i9], (char) bArr[i9 + 1], (char) bArr[i9 + 2], (char) bArr[i9 + 3], (char) bArr[i9 + 4], (char) bArr[i9 + 5], (char) bArr[i9 + 6], (char) bArr[i9 + 7]);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public static long parseMillis(char[] cArr, int i9, int i10, ZoneId zoneId) {
        char c10;
        int i11 = i10;
        ZoneId zoneId2 = zoneId;
        if (cArr == null || i11 == 0) {
            return 0L;
        }
        if (i11 == 4 && cArr[i9] == 'n' && cArr[i9 + 1] == 'u' && cArr[i9 + 2] == 'l' && cArr[i9 + 3] == 'l') {
            return 0L;
        }
        char c11 = cArr[i9];
        if (c11 != '\"' || cArr[i11 - 1] != '\"') {
            if (i11 == 19) {
                return parseMillis19(cArr, i9, zoneId2);
            }
            if (i11 > 19 || (i11 == 16 && ((c10 = cArr[i9 + 10]) == '+' || c10 == '-'))) {
                ZonedDateTime zonedDateTime = parseZonedDateTime(cArr, i9, i10, zoneId);
                if (zonedDateTime != null) {
                    return zonedDateTime.toInstant().toEpochMilli();
                }
                String str = new String(cArr, i9, i11 - i9);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            if ((c11 == '-' || (c11 >= '0' && c11 <= '9')) && IOUtils.isNumber(cArr, i9, i10)) {
                long j3 = TypeUtils.parseLong(cArr, i9, i10);
                if (i11 != 8 || j3 < 19700101 || j3 > 21000101) {
                    return j3;
                }
                int i12 = (int) j3;
                int i13 = i12 / 10000;
                int i14 = (i12 % 10000) / 100;
                int i15 = i12 % 100;
                if (i14 < 1 || i14 > 12) {
                    return j3;
                }
                return i15 <= (i14 != 2 ? (i14 == 4 || i14 == 6 || i14 == 9 || i14 == 11) ? 30 : 31 : ((i13 & 3) != 0 || (i13 % 100 == 0 && i13 % 400 != 0)) ? 28 : 29) ? ZonedDateTime.ofLocal(LocalDateTime.of(i13, i14, i15, 0, 0, 0), zoneId2, null).toEpochSecond() * 1000 : j3;
            }
            if (cArr[i11 - 1] == 'Z') {
                i11--;
                zoneId2 = ZoneOffset.UTC;
            }
            LocalDateTime localDateTime = parseLocalDateTime(cArr, i9, i11);
            if (localDateTime == null && cArr[i9] == '0' && cArr[i9 + 1] == '0' && cArr[i9 + 2] == '0' && cArr[i9 + 3] == '0' && cArr[i9 + 4] == '-' && cArr[i9 + 5] == '0' && cArr[i9 + 6] == '0' && cArr[i9 + 7] == '-' && cArr[i9 + 8] == '0' && cArr[i9 + 9] == '0') {
                localDateTime = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
            }
            if (localDateTime == null) {
                String str2 = new String(cArr, i9, i11 - i9);
                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
            }
            long epochSecond = ZonedDateTime.ofLocal(localDateTime, zoneId2, null).toEpochSecond();
            int nano = localDateTime.getNano();
            return (epochSecond >= 0 || nano <= 0) ? (epochSecond * 1000) + ((long) (nano / 1000000)) : (((epochSecond + 1) * 1000) + ((long) (nano / 1000000))) - 1000;
        }
        JSONReader jSONReaderM1680of = JSONReader.m1680of(cArr, i9, i10);
        try {
            long time = ((Date) ObjectReaderImplDate.INSTANCE.readObject(jSONReaderM1680of, null, null, 0L)).getTime();
            if (jSONReaderM1680of != null) {
                jSONReaderM1680of.close();
            }
            return time;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long parseMillis10(String str, ZoneId zoneId, DateTimeFormatPattern dateTimeFormatPattern) {
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (dateTimeFormatPattern.length != 10) {
            throw new UnsupportedOperationException();
        }
        if (str.length() != 10) {
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char cCharAt3 = str.charAt(2);
        char cCharAt4 = str.charAt(3);
        char cCharAt5 = str.charAt(4);
        char cCharAt6 = str.charAt(5);
        char cCharAt7 = str.charAt(6);
        char cCharAt8 = str.charAt(7);
        char cCharAt9 = str.charAt(8);
        char cCharAt10 = str.charAt(9);
        int i9 = C06361.f1978x8a2a5bbc[dateTimeFormatPattern.ordinal()];
        if (i9 != 5) {
            if (i9 != 6) {
                throw new DateTimeParseException("illegal input", str, 0);
            }
            if (cCharAt5 != '/' || cCharAt8 != '/') {
                throw new DateTimeParseException("illegal input", str, 0);
            }
        } else if (cCharAt5 != '-' || cCharAt8 != '-') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || cCharAt3 < '0' || cCharAt3 > '9' || cCharAt4 < '0' || cCharAt4 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int iM6853z = (cCharAt4 - '0') + AbstractC3199a.m6853z(cCharAt3, 48, 10, AbstractC3199a.m6853z(cCharAt2, 48, 100, (cCharAt - '0') * 1000));
        if (cCharAt6 < '0' || cCharAt6 > '9' || cCharAt7 < '0' || cCharAt7 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i10 = (cCharAt7 - '0') + ((cCharAt6 - '0') * 10);
        if ((i10 == 0 && iM6853z != 0) || i10 > 12) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt9 < '0' || cCharAt9 > '9' || cCharAt10 < '0' || cCharAt10 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i11 = (cCharAt10 - '0') + ((cCharAt9 - '0') * 10);
        int i12 = i10 != 2 ? (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31 : ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? 28 : 29;
        if ((i11 == 0 && iM6853z != 0) || i11 > i12) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (iM6853z == 0 && i10 == 0 && i11 == 0) {
            iM6853z = 1970;
            i11 = 1;
            i10 = 1;
        }
        long j3 = (i11 - 1) + (((i10 * 367) - 362) / 12) + ((iM6853z + 399) / 400) + (((iM6853z + 3) / 4) - ((iM6853z + 99) / 100)) + (iM6853z * 365);
        if (i10 > 2) {
            j3 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? j3 - 2 : j3 - 1;
        }
        long j4 = (j3 - 719528) * 86400;
        return (j4 - ((long) ((!(zoneId == SHANGHAI_ZONE_ID || zoneId.getRules() == SHANGHAI_ZONE_RULES) || j4 < 684900000) ? (zoneId == ZoneOffset.UTC || "UTC".equals(zoneId.getId())) ? 0 : zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM6853z, i10, i11), LocalTime.MIN)).getTotalSeconds() : 28800))) * 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[PHI: r11
  0x017c: PHI (r11v12 char) = (r11v11 char), (r11v11 char), (r11v11 char), (r11v20 char) binds: [B:55:0x0134, B:56:0x0136, B:57:0x0138, B:66:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c2 A[PHI: r11
  0x01c2: PHI (r11v13 char) = (r11v12 char), (r11v12 char), (r11v12 char), (r11v17 char) binds: [B:67:0x017c, B:68:0x017e, B:69:0x0180, B:78:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parseMillis19(byte[] bArr, int i9, ZoneId zoneId) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        String str;
        char c17;
        bArr.getClass();
        char c18 = (char) bArr[i9];
        char c19 = (char) bArr[i9 + 1];
        char c20 = (char) bArr[i9 + 2];
        char c21 = (char) bArr[i9 + 3];
        char c22 = (char) bArr[i9 + 4];
        char c23 = (char) bArr[i9 + 5];
        char c24 = (char) bArr[i9 + 6];
        char c25 = (char) bArr[i9 + 7];
        char c26 = (char) bArr[i9 + 8];
        char c27 = (char) bArr[i9 + 9];
        char c28 = (char) bArr[i9 + 10];
        char c29 = (char) bArr[i9 + 11];
        char c30 = (char) bArr[i9 + 12];
        char c31 = (char) bArr[i9 + 13];
        char c32 = (char) bArr[i9 + 14];
        char c33 = (char) bArr[i9 + 15];
        char c34 = (char) bArr[i9 + 16];
        char c35 = (char) bArr[i9 + 17];
        char c36 = (char) bArr[i9 + 18];
        if (c22 == '-' && c25 == '-' && ((c28 == ' ' || c28 == 'T') && c31 == ':' && c34 == ':')) {
            c25 = c19;
            c15 = c20;
            c28 = c21;
            c13 = c26;
            c34 = c33;
            c11 = c27;
            c31 = c30;
            c16 = c35;
            c14 = c32;
            c12 = c18;
            str = "illegal input ";
            c17 = '0';
        } else {
            char c37 = '/';
            if (c22 == '/' && c25 == '/') {
                if ((c28 != ' ' && c28 != 'T') || c31 != ':' || c34 != ':') {
                    c37 = '/';
                }
                c25 = c19;
                c15 = c20;
                c28 = c21;
                c13 = c26;
                c34 = c33;
                c11 = c27;
                c31 = c30;
                c16 = c35;
                c14 = c32;
                c12 = c18;
                str = "illegal input ";
                c17 = '0';
            }
            if ((c20 == c37 && c23 == c37) || ((c20 == '.' && c23 == '.') || (c20 == '-' && c23 == '-'))) {
                c10 = ' ';
                if (c28 != ' ') {
                    if (c19 == c10) {
                        if (c31 == ':') {
                        }
                        c10 = ' ';
                    }
                    if (c20 == c10) {
                        if (c20 == c10) {
                        }
                    }
                } else {
                    if (c31 == ':' && c34 == ':') {
                        c11 = c19;
                        c23 = c21;
                        c13 = c18;
                        c34 = c33;
                        c28 = c27;
                        c31 = c30;
                        c16 = c35;
                        c14 = c32;
                        c12 = c24;
                        str = "illegal input ";
                        c17 = '0';
                    }
                    c10 = ' ';
                    if (c19 == c10) {
                    }
                    if (c20 == c10) {
                    }
                }
                c24 = c22;
                c15 = c26;
            } else {
                c10 = ' ';
                if (c19 == c10 && c23 == c10 && c28 == c10) {
                    if (c31 == ':' || c34 != ':') {
                        c10 = ' ';
                    } else {
                        int iMonth = month(c20, c21, c22);
                        if (iMonth <= 0) {
                            String str2 = new String(bArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                        }
                        c22 = (char) ((iMonth % 10) + 48);
                        c23 = (char) ((iMonth / 10) + 48);
                        c11 = c18;
                        c34 = c33;
                        c28 = c27;
                        c31 = c30;
                        c16 = c35;
                        c13 = '0';
                        c14 = c32;
                        c12 = c24;
                        str = "illegal input ";
                        c17 = '0';
                        c24 = c22;
                        c15 = c26;
                    }
                }
                if (c20 == c10 && c24 == c10 && c29 == c10) {
                    if (c31 == ':' && c34 == ':') {
                        int iMonth2 = month(c21, c22, c23);
                        if (iMonth2 <= 0) {
                            String str3 = new String(bArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                        }
                        char c38 = (char) ((iMonth2 / 10) + 48);
                        char c39 = (char) ((iMonth2 % 10) + 48);
                        c11 = c19;
                        c23 = c38;
                        c24 = c39;
                        c13 = c18;
                        c34 = c33;
                        c15 = c27;
                        c31 = c30;
                        c16 = c35;
                        c29 = '0';
                        c14 = c32;
                        c12 = c25;
                        str = "illegal input ";
                        c25 = c26;
                        c17 = '0';
                    } else {
                        c10 = ' ';
                        if (c20 == c10) {
                            if (c20 == c10) {
                            }
                            String str4 = new String(bArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                        }
                    }
                } else if (c20 == c10 && c24 == c10 && c29 == c10) {
                    if (c32 != ':' || c34 != ':') {
                        c10 = ' ';
                        if (c20 == c10) {
                        }
                        String str42 = new String(bArr, i9, 19);
                        throw new DateTimeParseException("illegal input ".concat(str42), str42, 0);
                    }
                    int iMonth3 = month(c21, c22, c23);
                    if (iMonth3 <= 0) {
                        String str5 = new String(bArr, i9, 19);
                        throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
                    }
                    c11 = c19;
                    c23 = (char) ((iMonth3 / 10) + 48);
                    c24 = (char) ((iMonth3 % 10) + 48);
                    c12 = c25;
                    c13 = c18;
                    c25 = c26;
                    c34 = c33;
                    c15 = c27;
                    c29 = c30;
                    c16 = c35;
                    c14 = '0';
                    str = "illegal input ";
                    c17 = '0';
                } else {
                    if (c20 == c10 || c24 != c10 || c29 != c10 || c32 != ':' || c35 != ':') {
                        String str422 = new String(bArr, i9, 19);
                        throw new DateTimeParseException("illegal input ".concat(str422), str422, 0);
                    }
                    int iMonth4 = month(c21, c22, c23);
                    if (iMonth4 <= 0) {
                        String str6 = new String(bArr, i9, 19);
                        throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
                    }
                    c11 = c19;
                    c23 = (char) ((iMonth4 / 10) + 48);
                    c24 = (char) ((iMonth4 % 10) + 48);
                    c12 = c25;
                    c13 = c18;
                    c25 = c26;
                    c14 = c33;
                    c15 = c27;
                    c29 = c30;
                    c16 = '0';
                    str = "illegal input ";
                    c17 = '0';
                }
            }
        }
        if (c12 < c17 || c12 > '9' || c25 < c17 || c25 > '9' || c15 < c17 || c15 > '9' || c28 < c17 || c28 > '9') {
            byte[] bArr2 = bArr;
            String str7 = str;
            String str8 = new String(bArr2, i9, 19);
            throw new DateTimeParseException(str7.concat(str8), str8, 0);
        }
        int iM6853z = (c28 - c17) + AbstractC3199a.m6853z(c15, c17, 10, AbstractC3199a.m6853z(c25, c17, 100, (c12 - c17) * 1000));
        if (c23 < c17 || c23 > '9' || c24 < c17 || c24 > '9') {
            String str9 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str.concat(str9), str9, 0);
        }
        int i10 = (c24 - c17) + ((c23 - c17) * 10);
        if ((i10 == 0 && iM6853z != 0) || i10 > 12) {
            String str10 = str;
            String str11 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str10.concat(str11), str11, 0);
        }
        if (c13 < c17 || c13 > '9' || c11 < c17 || c11 > '9') {
            String str12 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str.concat(str12), str12, 0);
        }
        int i11 = (c11 - c17) + ((c13 - c17) * 10);
        int i12 = i10 != 2 ? (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31 : ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? 28 : 29;
        if ((i11 == 0 && iM6853z != 0) || i11 > i12) {
            String str13 = str;
            String str14 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str13.concat(str14), str14, 0);
        }
        if (c29 < '0' || c29 > '9' || c31 < '0' || c31 > '9') {
            String str15 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str.concat(str15), str15, 0);
        }
        int i13 = (c31 - '0') + ((c29 - '0') * 10);
        if (c14 < '0' || c14 > '9' || c34 < '0' || c34 > '9') {
            String str16 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str.concat(str16), str16, 0);
        }
        int i14 = (c34 - '0') + ((c14 - '0') * 10);
        if (c16 < '0' || c16 > '9' || c36 < '0' || c36 > '9') {
            String str17 = new String(bArr, i9, 19);
            throw new DateTimeParseException(str.concat(str17), str17, 0);
        }
        int i15 = (c36 - '0') + ((c16 - '0') * 10);
        boolean z9 = true;
        if (iM6853z == 0 && i10 == 0 && i11 == 0) {
            iM6853z = 1970;
            i11 = 1;
            i10 = 1;
        }
        long j3 = (i11 - 1) + (((i10 * 367) - 362) / 12) + ((iM6853z + 399) / 400) + (((iM6853z + 3) / 4) - ((iM6853z + 99) / 100)) + (iM6853z * 365);
        if (i10 > 2) {
            j3 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? j3 - 2 : j3 - 1;
        }
        long j4 = ((j3 - 719528) * 86400) + ((long) (i13 * 3600)) + ((long) (i14 * 60)) + ((long) i15);
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        if (zoneId2 != SHANGHAI_ZONE_ID && zoneId2.getRules() != SHANGHAI_ZONE_RULES) {
            z9 = false;
        }
        return (j4 - ((long) ((!z9 || j4 < 684900000) ? (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM6853z, i10, i11), LocalTime.of(i13, i14, i15, 0))).getTotalSeconds() : 28800))) * 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long parseMillisYMDHMS19(String str, ZoneId zoneId) {
        if (str == null) {
            return 0L;
        }
        if (str.length() != 19) {
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char cCharAt3 = str.charAt(2);
        char cCharAt4 = str.charAt(3);
        char cCharAt5 = str.charAt(4);
        char cCharAt6 = str.charAt(5);
        char cCharAt7 = str.charAt(6);
        char cCharAt8 = str.charAt(7);
        char cCharAt9 = str.charAt(8);
        char cCharAt10 = str.charAt(9);
        char cCharAt11 = str.charAt(10);
        char cCharAt12 = str.charAt(11);
        char cCharAt13 = str.charAt(12);
        char cCharAt14 = str.charAt(13);
        char cCharAt15 = str.charAt(14);
        char cCharAt16 = str.charAt(15);
        char cCharAt17 = str.charAt(16);
        char cCharAt18 = str.charAt(17);
        char cCharAt19 = str.charAt(18);
        if (cCharAt5 != '-' || cCharAt8 != '-' || cCharAt11 != ' ' || cCharAt14 != ':' || cCharAt17 != ':') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || cCharAt3 < '0' || cCharAt3 > '9' || cCharAt4 < '0' || cCharAt4 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int iM6853z = (cCharAt4 - '0') + AbstractC3199a.m6853z(cCharAt3, 48, 10, AbstractC3199a.m6853z(cCharAt2, 48, 100, (cCharAt - '0') * 1000));
        if (cCharAt6 < '0' || cCharAt6 > '9' || cCharAt7 < '0' || cCharAt7 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i9 = (cCharAt7 - '0') + ((cCharAt6 - '0') * 10);
        if ((i9 == 0 && iM6853z != 0) || i9 > 12) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt9 < '0' || cCharAt9 > '9' || cCharAt10 < '0' || cCharAt10 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i10 = (cCharAt10 - '0') + ((cCharAt9 - '0') * 10);
        int i11 = i9 != 2 ? (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) ? 30 : 31 : ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? 28 : 29;
        if ((i10 == 0 && iM6853z != 0) || i10 > i11) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt12 < '0' || cCharAt12 > '9' || cCharAt13 < '0' || cCharAt13 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i12 = (cCharAt13 - '0') + ((cCharAt12 - '0') * 10);
        if (cCharAt15 < '0' || cCharAt15 > '9' || cCharAt16 < '0' || cCharAt16 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i13 = (cCharAt16 - '0') + ((cCharAt15 - '0') * 10);
        if (cCharAt18 < '0' || cCharAt18 > '9' || cCharAt19 < '0' || cCharAt19 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i14 = (cCharAt19 - '0') + ((cCharAt18 - '0') * 10);
        if (iM6853z == 0 && i9 == 0 && i10 == 0) {
            iM6853z = 1970;
            i10 = 1;
            i9 = 1;
        }
        long j3 = (i10 - 1) + (((i9 * 367) - 362) / 12) + ((iM6853z + 399) / 400) + (((iM6853z + 3) / 4) - ((iM6853z + 99) / 100)) + (iM6853z * 365);
        if (i9 > 2) {
            j3 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? j3 - 2 : j3 - 1;
        }
        long j4 = ((j3 - 719528) * 86400) + ((long) (i12 * 3600)) + ((long) (i13 * 60)) + ((long) i14);
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        return (j4 - ((long) ((!(zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) || j4 < 684900000) ? (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM6853z, i9, i10), LocalTime.of(i12, i13, i14, 0))).getTotalSeconds() : 28800))) * 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04c6, code lost:
    
        if (r6 != 'Z') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a1b, code lost:
    
        if (r4 != 'Z') goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0aa5, code lost:
    
        if (r1 != 'Z') goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b27, code lost:
    
        if (r5 != 'Z') goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0c33, code lost:
    
        if (r5 != 'Z') goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0d74, code lost:
    
        if (r11 != 'Z') goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0f8c, code lost:
    
        if (r4 != 'Z') goto L707;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a70 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0c83 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0ecb  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0eda  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0f4e  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0f57 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0f64  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0f9b  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0fd4  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x10a9  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x10ac  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x10b5  */
    /* JADX WARN: Removed duplicated region for block: B:854:0x115b  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x1173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZonedDateTime parseZonedDateTime(byte[] bArr, int i9, int i10, ZoneId zoneId) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        int i11;
        char c22;
        char c23;
        char c24;
        char c25;
        char c26;
        char c27;
        char c28;
        char c29;
        char c30;
        char c31;
        char c32;
        char c33;
        char c34;
        char c35;
        char c36;
        char c37;
        char c38;
        char c39;
        char c40;
        char c41;
        char c42;
        byte[] bArr2;
        int i12;
        char c43;
        String str;
        boolean z9;
        boolean z10;
        char c44;
        char c45;
        char c46;
        char c47;
        char c48;
        char c49;
        char c50;
        char c51;
        char c52;
        char c53;
        char c54;
        int i13;
        char c55;
        char c56;
        char c57;
        char c58;
        char c59;
        char c60;
        char c61;
        char c62;
        char c63;
        char c64;
        char c65;
        char c66;
        int i14;
        char c67;
        char c68;
        char c69;
        char c70;
        char c71;
        char c72;
        char c73;
        char c74;
        char c75;
        char c76;
        char c77;
        char c78;
        char c79;
        char c80;
        char c81;
        char c82;
        char c83;
        char c84;
        char c85;
        char c86;
        char c87;
        char c88;
        char c89;
        char c90;
        char c91;
        char c92;
        char c93;
        char c94;
        char c95;
        char c96;
        char c97;
        char c98;
        char c99;
        char c100;
        char c101;
        char c102;
        char c103;
        char c104;
        char c105;
        char c106;
        char c107;
        char c108;
        char c109;
        char c110;
        char c111;
        char c112;
        char c113;
        char c114;
        char c115;
        char c116;
        char c117;
        char c118;
        char c119;
        char c120;
        char c121;
        char c122;
        char c123;
        char c124;
        char c125;
        char c126;
        char c127;
        char c128;
        char c129;
        char c130;
        char c131;
        char c132;
        char c133;
        char c134;
        char c135;
        char c136;
        char c137;
        ZoneId zoneId2;
        ZoneId zoneId3;
        ZoneId zoneId4;
        if (bArr == null || i10 == 0) {
            return null;
        }
        if (i10 == 16) {
            return parseZonedDateTime16(bArr, i9, zoneId);
        }
        if (i10 < 19) {
            return null;
        }
        char c138 = (char) bArr[i9];
        char c139 = (char) bArr[i9 + 1];
        char c140 = (char) bArr[i9 + 2];
        byte b10 = bArr[i9 + 3];
        char c141 = (char) b10;
        char c142 = (char) bArr[i9 + 4];
        char c143 = (char) bArr[i9 + 5];
        char c144 = (char) bArr[i9 + 6];
        char c145 = (char) bArr[i9 + 7];
        char c146 = (char) bArr[i9 + 8];
        char c147 = (char) bArr[i9 + 9];
        char c148 = (char) bArr[i9 + 10];
        char c149 = (char) bArr[i9 + 11];
        char c150 = (char) bArr[i9 + 12];
        char c151 = (char) bArr[i9 + 13];
        char c152 = (char) bArr[i9 + 14];
        char c153 = (char) bArr[i9 + 15];
        char c154 = (char) bArr[i9 + 16];
        char c155 = (char) bArr[i9 + 17];
        char c156 = (char) bArr[i9 + 18];
        char c157 = i10 == 19 ? ' ' : (char) bArr[i9 + 19];
        switch (i10) {
            case 19:
            case 20:
                c10 = c138;
                c11 = c139;
                c12 = 0;
                c13 = 0;
                c14 = '0';
                c15 = '0';
                c16 = '0';
                c17 = '0';
                c18 = '0';
                c19 = '0';
                c20 = '0';
                c21 = '0';
                break;
            case 21:
                c10 = c138;
                c12 = (char) bArr[i9 + 20];
                c11 = c139;
                c13 = 0;
                c14 = '0';
                c15 = '0';
                c16 = '0';
                c17 = '0';
                c18 = '0';
                c19 = '0';
                c20 = '0';
                c21 = '0';
                break;
            case 22:
                c10 = c138;
                char c158 = (char) bArr[i9 + 20];
                c14 = (char) bArr[i9 + 21];
                c11 = c139;
                c13 = 0;
                c16 = '0';
                c17 = '0';
                c18 = '0';
                c19 = '0';
                c20 = '0';
                c21 = '0';
                c12 = c158;
                c15 = '0';
                break;
            case 23:
                c10 = c138;
                char c159 = (char) bArr[i9 + 20];
                char c160 = (char) bArr[i9 + 21];
                c11 = c139;
                c13 = 0;
                c16 = '0';
                c17 = '0';
                c18 = '0';
                c19 = '0';
                c20 = '0';
                c21 = '0';
                c12 = c159;
                c15 = (char) bArr[i9 + 22];
                c14 = c160;
                break;
            case 24:
                c10 = c138;
                char c161 = (char) bArr[i9 + 20];
                char c162 = (char) bArr[i9 + 21];
                char c163 = (char) bArr[i9 + 22];
                c16 = (char) bArr[i9 + 23];
                c11 = c139;
                c13 = 0;
                c17 = '0';
                c18 = '0';
                c19 = '0';
                c20 = '0';
                c21 = '0';
                c12 = c161;
                c14 = c162;
                c15 = c163;
                break;
            case 25:
                c10 = c138;
                char c164 = (char) bArr[i9 + 20];
                char c165 = (char) bArr[i9 + 21];
                char c166 = (char) bArr[i9 + 22];
                char c167 = (char) bArr[i9 + 23];
                c17 = (char) bArr[i9 + 24];
                c11 = c139;
                c13 = 0;
                c18 = '0';
                c19 = '0';
                c20 = '0';
                c21 = '0';
                c12 = c164;
                c14 = c165;
                c15 = c166;
                c16 = c167;
                break;
            case 26:
                c10 = c138;
                char c168 = (char) bArr[i9 + 20];
                char c169 = (char) bArr[i9 + 21];
                char c170 = (char) bArr[i9 + 22];
                char c171 = (char) bArr[i9 + 23];
                char c172 = (char) bArr[i9 + 24];
                c18 = (char) bArr[i9 + 25];
                c11 = c139;
                c13 = 0;
                c19 = '0';
                c20 = '0';
                c21 = '0';
                c12 = c168;
                c14 = c169;
                c15 = c170;
                c16 = c171;
                c17 = c172;
                break;
            case 27:
                c10 = c138;
                char c173 = (char) bArr[i9 + 20];
                char c174 = (char) bArr[i9 + 21];
                char c175 = (char) bArr[i9 + 22];
                char c176 = (char) bArr[i9 + 23];
                char c177 = (char) bArr[i9 + 24];
                char c178 = (char) bArr[i9 + 25];
                c19 = (char) bArr[i9 + 26];
                c11 = c139;
                c13 = 0;
                c20 = '0';
                c21 = '0';
                c12 = c173;
                c14 = c174;
                c15 = c175;
                c16 = c176;
                c17 = c177;
                c18 = c178;
                break;
            case 28:
                c10 = c138;
                char c179 = (char) bArr[i9 + 20];
                char c180 = (char) bArr[i9 + 21];
                char c181 = (char) bArr[i9 + 22];
                char c182 = (char) bArr[i9 + 23];
                char c183 = (char) bArr[i9 + 24];
                char c184 = (char) bArr[i9 + 25];
                char c185 = (char) bArr[i9 + 26];
                c20 = (char) bArr[i9 + 27];
                c11 = c139;
                c13 = 0;
                c21 = '0';
                c12 = c179;
                c14 = c180;
                c15 = c181;
                c16 = c182;
                c17 = c183;
                c18 = c184;
                c19 = c185;
                break;
            case 29:
                c10 = c138;
                char c186 = (char) bArr[i9 + 20];
                char c187 = (char) bArr[i9 + 21];
                char c188 = (char) bArr[i9 + 22];
                char c189 = (char) bArr[i9 + 23];
                char c190 = (char) bArr[i9 + 24];
                char c191 = (char) bArr[i9 + 25];
                char c192 = (char) bArr[i9 + 26];
                char c193 = (char) bArr[i9 + 27];
                c21 = (char) bArr[i9 + 28];
                c11 = c139;
                c13 = 0;
                c12 = c186;
                c14 = c187;
                c15 = c188;
                c16 = c189;
                c17 = c190;
                c18 = c191;
                c19 = c192;
                c20 = c193;
                break;
            default:
                c10 = c138;
                char c194 = (char) bArr[i9 + 20];
                char c195 = (char) bArr[i9 + 21];
                char c196 = (char) bArr[i9 + 22];
                char c197 = (char) bArr[i9 + 23];
                char c198 = (char) bArr[i9 + 24];
                char c199 = (char) bArr[i9 + 25];
                char c200 = (char) bArr[i9 + 26];
                char c201 = (char) bArr[i9 + 27];
                char c202 = (char) bArr[i9 + 28];
                c13 = (char) bArr[i9 + 29];
                c11 = c139;
                c12 = c194;
                c14 = c195;
                c15 = c196;
                c16 = c197;
                c17 = c198;
                c18 = c199;
                c19 = c200;
                c20 = c201;
                c21 = c202;
                break;
        }
        char c203 = c14;
        if (c142 == '-' && c145 == '-' && ((c148 == ' ' || c148 == 'T') && c151 == ':' && c154 == ':' && (c157 == '[' || c157 == 'Z' || c157 == '+' || c157 == '-' || c157 == ' '))) {
            bArr2 = bArr;
            c35 = c152;
            c41 = c140;
            c40 = c141;
            c39 = c143;
            c38 = c144;
            c33 = c155;
            c32 = c156;
            str = null;
            z10 = false;
            z9 = false;
            c36 = c147;
            c37 = c146;
            c34 = c153;
            c43 = c150;
            c31 = '0';
            c30 = '0';
            c29 = '0';
            c28 = '0';
            c27 = '0';
            c26 = '0';
            c25 = '0';
            c24 = '0';
            c23 = '0';
            c45 = c11;
            c42 = c10;
            i12 = 19;
            c44 = c149;
        } else {
            if (c142 == '-' && c145 == '-' && c148 == ' ' && c149 == ' ' && c152 == ':' && c155 == ':') {
                i11 = 20;
                if (i10 == 20) {
                    bArr2 = bArr;
                    c34 = c154;
                    c32 = c157;
                    c43 = c151;
                    i12 = 20;
                    c41 = c140;
                    c40 = c141;
                    c39 = c143;
                    c38 = c144;
                    c33 = c156;
                    str = null;
                    z10 = false;
                    z9 = false;
                    c36 = c147;
                    c37 = c146;
                    c35 = c153;
                    c44 = c150;
                    c31 = '0';
                    c30 = '0';
                    c29 = '0';
                    c28 = '0';
                    c27 = '0';
                    c26 = '0';
                    c25 = '0';
                    c24 = '0';
                    c23 = '0';
                    c45 = c11;
                    c42 = c10;
                }
            } else {
                i11 = 20;
            }
            if (i10 == i11 && c140 == ' ' && c144 == ' ' && c149 == ' ' && c152 == ':' && c155 == ':') {
                int iMonth = month(c141, c142, c143);
                if (iMonth > 0) {
                    c137 = (char) ((iMonth / 10) + 48);
                    c136 = (char) ((iMonth % 10) + 48);
                } else {
                    c136 = '0';
                    c137 = '0';
                }
                bArr2 = bArr;
                c34 = c154;
                c32 = c157;
                c38 = c136;
                c40 = c148;
                c39 = c137;
                c42 = c145;
                c33 = c156;
                z10 = false;
                z9 = false;
                c41 = c147;
                c45 = c146;
                c35 = c153;
                c44 = c150;
                c31 = '0';
                c30 = '0';
                c29 = '0';
                c28 = '0';
                c27 = '0';
                c26 = '0';
                c25 = '0';
                c24 = '0';
                c23 = '0';
                c36 = c11;
                c37 = c10;
                i12 = 20;
                c43 = c151;
                str = null;
            } else {
                if (c142 == '-' && c145 == '-' && ((c148 == ' ' || c148 == 'T') && c151 == ':' && c154 == ':' && c157 == '.')) {
                    if (i10 != 21) {
                        c22 = c203;
                        if (c22 == '[' || c22 == '+' || c22 == '-' || c22 == 'Z') {
                        }
                        c44 = c149;
                        c45 = c11;
                    } else {
                        c22 = c203;
                    }
                    bArr2 = bArr;
                    z9 = c22 == '|';
                    c35 = c152;
                    c41 = c140;
                    c40 = c141;
                    c39 = c143;
                    c38 = c144;
                    c33 = c155;
                    c32 = c156;
                    str = null;
                    z10 = false;
                    c36 = c147;
                    c37 = c146;
                    c34 = c153;
                    c43 = c150;
                    c30 = '0';
                    c29 = '0';
                    c28 = '0';
                    c27 = '0';
                    c26 = '0';
                    c25 = '0';
                    c24 = '0';
                    c23 = '0';
                    c42 = c10;
                    c31 = c12;
                    i12 = 21;
                    c44 = c149;
                    c45 = c11;
                } else {
                    c22 = c203;
                }
                if (c142 == '-' && c145 == '-' && ((c148 == ' ' || c148 == 'T') && c151 == ':' && c154 == ':' && c157 == '.')) {
                    if (i10 != 22) {
                        c46 = c15;
                        c47 = c152;
                        if (c46 != '[') {
                            if (c46 != '+') {
                                if (c46 != '-') {
                                }
                            }
                        }
                    } else {
                        c46 = c15;
                        c47 = c152;
                    }
                    bArr2 = bArr;
                    z9 = c46 == '|';
                    c30 = c22;
                    c41 = c140;
                    c40 = c141;
                    c39 = c143;
                    c38 = c144;
                    c33 = c155;
                    c32 = c156;
                    str = null;
                    z10 = false;
                    c36 = c147;
                    c37 = c146;
                    c34 = c153;
                    c43 = c150;
                    c29 = '0';
                    c28 = '0';
                    c27 = '0';
                    c26 = '0';
                    c25 = '0';
                    c24 = '0';
                    c23 = '0';
                    c42 = c10;
                    c35 = c47;
                    c31 = c12;
                    i12 = 22;
                    c44 = c149;
                    c45 = c11;
                } else {
                    c46 = c15;
                    c47 = c152;
                }
                if (c142 == '-' && c145 == '-' && ((c148 == ' ' || c148 == 'T') && c151 == ':' && c154 == 'Z' && c155 == '[' && c22 == ']' && i10 == 22)) {
                    bArr2 = bArr;
                    c41 = c140;
                    c44 = c149;
                    c40 = c141;
                    c39 = c143;
                    c38 = c144;
                    str = null;
                    z10 = false;
                    c36 = c147;
                    c37 = c146;
                    c34 = c153;
                    c43 = c150;
                    c33 = '0';
                    c32 = '0';
                    c31 = '0';
                    c30 = '0';
                    c29 = '0';
                    c28 = '0';
                    c27 = '0';
                    c26 = '0';
                    c25 = '0';
                    c24 = '0';
                    c23 = '0';
                    c45 = c11;
                    c42 = c10;
                    c35 = c47;
                    z9 = true;
                } else {
                    if (i10 == 22 && c141 == ' ') {
                        c50 = c142;
                        if (c143 == ',' && c144 == ' ' && c149 == ' ' && c151 == ':' && c154 == ':' && c157 == ' ') {
                            c51 = c12;
                            if (c51 != 'A' && c51 != 'P') {
                                char c204 = c11;
                                c48 = c145;
                                c49 = c204;
                            } else if (c22 == 'M') {
                                int iMonth2 = month(c10, c11, c140);
                                if (iMonth2 > 0) {
                                    c135 = (char) ((iMonth2 % 10) + 48);
                                    c134 = (char) ((iMonth2 / 10) + 48);
                                } else {
                                    c134 = '0';
                                    c135 = '0';
                                }
                                z10 = c51 == 'P';
                                bArr2 = bArr;
                                c40 = c148;
                                c39 = c134;
                                c38 = c135;
                                c33 = c155;
                                c32 = c156;
                                str = null;
                                z9 = false;
                                c41 = c147;
                                c45 = c146;
                                c34 = c153;
                                c43 = c150;
                                c44 = '0';
                                c37 = '0';
                                c31 = '0';
                                c30 = '0';
                                c28 = '0';
                                c27 = '0';
                                c26 = '0';
                                c25 = '0';
                                c24 = '0';
                                c23 = '0';
                                c42 = c145;
                                c35 = c47;
                                c36 = c50;
                                i12 = 22;
                                c29 = c23;
                            } else {
                                char c205 = c11;
                                c48 = c145;
                                c49 = c205;
                            }
                            if (i10 != 22 && c140 == '/' && c143 == '/' && c148 == ' ' && c151 == ':' && c154 == ':' && c157 == ' ') {
                                if (c51 != 'A') {
                                    c133 = 'P';
                                    if (c51 == 'P') {
                                    }
                                    if (i10 != 23) {
                                        c53 = c10;
                                        c54 = c47;
                                        i13 = 23;
                                        if (i10 != 23) {
                                        }
                                        if (i10 == i13) {
                                            c59 = c56;
                                            if (i10 != 24) {
                                                c60 = c153;
                                                c61 = c59;
                                                c62 = c54;
                                                c63 = c51;
                                                c64 = c156;
                                                c65 = c16;
                                                c66 = c155;
                                                i14 = 24;
                                                if (i10 != 24) {
                                                }
                                                if (i10 == i14) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c133 = 'P';
                                }
                                c52 = c157;
                                if (c22 == 'M') {
                                    z10 = c51 == c133;
                                    bArr2 = bArr;
                                    c37 = c141;
                                    c42 = c144;
                                    c38 = c49;
                                    c33 = c155;
                                    c32 = c156;
                                    str = null;
                                    z9 = false;
                                    c40 = c147;
                                    c41 = c146;
                                    c34 = c153;
                                    c43 = c150;
                                    c31 = '0';
                                    c30 = '0';
                                    c28 = '0';
                                    c27 = '0';
                                    c26 = '0';
                                    c25 = '0';
                                    c24 = '0';
                                    c23 = '0';
                                    c45 = c48;
                                    c39 = c10;
                                    c35 = c47;
                                    c36 = c50;
                                    i12 = 22;
                                    c44 = c149;
                                } else if (i10 != 23) {
                                }
                                c29 = c23;
                            } else {
                                c52 = c157;
                                if (i10 != 23 && c141 == ' ' && c143 == ',' && c144 == ' ' && c149 == ' ') {
                                    c54 = c47;
                                    if (c54 == ':' && c155 == ':' && c51 == ' ' && ((c22 == 'A' || c22 == 'P') && c46 == 'M')) {
                                        int iMonth3 = month(c10, c49, c140);
                                        if (iMonth3 > 0) {
                                            char c206 = (char) ((iMonth3 / 10) + 48);
                                            c131 = (char) ((iMonth3 % 10) + 48);
                                            c132 = c206;
                                        } else {
                                            c131 = '0';
                                            c132 = '0';
                                        }
                                        bArr2 = bArr;
                                        c34 = c154;
                                        c38 = c131;
                                        z10 = c22 == 'P';
                                        c40 = c148;
                                        c39 = c132;
                                        c33 = c156;
                                        z9 = false;
                                        c41 = c147;
                                        c35 = c153;
                                        c44 = c150;
                                        c37 = '0';
                                        c31 = '0';
                                        c30 = '0';
                                        c28 = '0';
                                        c27 = '0';
                                        c26 = '0';
                                        c25 = '0';
                                        c24 = '0';
                                        c23 = '0';
                                        c42 = c48;
                                        c32 = c52;
                                        c36 = c50;
                                        i12 = 23;
                                        c43 = c151;
                                        str = null;
                                        c45 = c146;
                                        c29 = c23;
                                    } else {
                                        c53 = c10;
                                    }
                                } else {
                                    c53 = c10;
                                    c54 = c47;
                                }
                                i13 = 23;
                                if (i10 != 23) {
                                    c55 = c148;
                                    if (c141 == ' ' && c144 == ',') {
                                        c56 = c48;
                                        c57 = c151;
                                        c58 = c150;
                                        if (c56 == ' ' && c58 == ' ' && c54 == ':' && c155 == ':' && c51 == ' ' && ((c22 == 'A' || c22 == 'P') && c46 == 'M')) {
                                            int iMonth4 = month(c53, c49, c140);
                                            if (iMonth4 > 0) {
                                                char c207 = (char) ((iMonth4 / 10) + 48);
                                                c129 = (char) ((iMonth4 % 10) + 48);
                                                c130 = c207;
                                            } else {
                                                c129 = '0';
                                                c130 = '0';
                                            }
                                            bArr2 = bArr;
                                            c38 = c129;
                                            z10 = c22 == 'P';
                                            c39 = c130;
                                            c40 = c149;
                                            c36 = c143;
                                            c33 = c156;
                                            str = null;
                                            z9 = false;
                                            c42 = c146;
                                            c35 = c153;
                                            c44 = '0';
                                            c31 = '0';
                                            c30 = '0';
                                            c28 = '0';
                                            c27 = '0';
                                            c26 = '0';
                                            c25 = '0';
                                            c24 = '0';
                                            c23 = '0';
                                            c43 = c57;
                                            c34 = c154;
                                            c41 = c55;
                                            c32 = c52;
                                            c37 = c50;
                                            i12 = 23;
                                            c45 = c147;
                                            c29 = c23;
                                        }
                                    } else {
                                        c56 = c48;
                                        c57 = c151;
                                        c58 = c150;
                                    }
                                    i13 = 23;
                                } else {
                                    c55 = c148;
                                    c56 = c48;
                                    c57 = c151;
                                    c58 = c150;
                                }
                                if (i10 == i13 || c141 != ' ') {
                                    c59 = c56;
                                } else {
                                    c59 = c56;
                                    if (c143 == ',' && c144 == ' ' && c149 == ',' && c58 == ' ' && c54 == ':' && c155 == ':' && c51 == ' ' && ((c22 == 'A' || c22 == 'P') && c46 == 'M')) {
                                        int iMonth5 = month(c53, c49, c140);
                                        if (iMonth5 > 0) {
                                            char c208 = (char) ((iMonth5 / 10) + 48);
                                            c127 = (char) ((iMonth5 % 10) + 48);
                                            c128 = c208;
                                        } else {
                                            c127 = '0';
                                            c128 = '0';
                                        }
                                        bArr2 = bArr;
                                        c38 = c127;
                                        z10 = c22 == 'P';
                                        c39 = c128;
                                        c33 = c156;
                                        str = null;
                                        z9 = false;
                                        c41 = c147;
                                        c35 = c153;
                                        c42 = c59;
                                        c44 = '0';
                                        c37 = '0';
                                        c31 = '0';
                                        c30 = '0';
                                        c28 = '0';
                                        c27 = '0';
                                        c26 = '0';
                                        c25 = '0';
                                        c24 = '0';
                                        c23 = '0';
                                        c43 = c57;
                                        c34 = c154;
                                        c40 = c55;
                                        c32 = c52;
                                        c36 = c50;
                                        i12 = 23;
                                    }
                                    c45 = c146;
                                    c29 = c23;
                                }
                                if (i10 != 24 && c141 == ' ' && c144 == ',') {
                                    c61 = c59;
                                    if (c61 == ' ' && c58 == ' ') {
                                        c60 = c153;
                                        c63 = c51;
                                        c62 = c54;
                                        c64 = c156;
                                        if (c60 == ':') {
                                            if (c64 == ':' && c22 == ' ' && (c46 == 'A' || c46 == 'P')) {
                                                c66 = c155;
                                                c65 = c16;
                                                if (c65 == 'M') {
                                                    int iMonth6 = month(c53, c49, c140);
                                                    if (iMonth6 > 0) {
                                                        c125 = (char) ((iMonth6 / 10) + 48);
                                                        c126 = (char) ((iMonth6 % 10) + 48);
                                                    } else {
                                                        c125 = '0';
                                                        c126 = '0';
                                                    }
                                                    z10 = c46 == 'P';
                                                    bArr2 = bArr;
                                                    c39 = c125;
                                                    c38 = c126;
                                                    c40 = c149;
                                                    c36 = c143;
                                                    c34 = c66;
                                                    str = null;
                                                    z9 = false;
                                                    c42 = c146;
                                                    c32 = c63;
                                                    c43 = c62;
                                                    c31 = '0';
                                                    c30 = '0';
                                                    c28 = '0';
                                                    c27 = '0';
                                                    c26 = '0';
                                                    c25 = '0';
                                                    c24 = '0';
                                                    c23 = '0';
                                                    c44 = c57;
                                                    c35 = c154;
                                                    c41 = c55;
                                                    c33 = c52;
                                                    c37 = c50;
                                                    i12 = 24;
                                                    c45 = c147;
                                                    c29 = c23;
                                                }
                                            }
                                        }
                                        i14 = 24;
                                        if (i10 != 24) {
                                            c67 = c149;
                                            if (c141 == ' ' && c144 == ',' && c61 == ' ' && c58 == ',') {
                                                c68 = c57;
                                                if (c68 == ' ' && c60 == ':' && c64 == ':' && c22 == ' ' && ((c46 == 'A' || c46 == 'P') && c65 == 'M')) {
                                                    int iMonth7 = month(c53, c49, c140);
                                                    if (iMonth7 > 0) {
                                                        c123 = (char) ((iMonth7 / 10) + 48);
                                                        c124 = (char) ((iMonth7 % 10) + 48);
                                                    } else {
                                                        c123 = '0';
                                                        c124 = '0';
                                                    }
                                                    z10 = c46 == 'P';
                                                    bArr2 = bArr;
                                                    c39 = c123;
                                                    c38 = c124;
                                                    c36 = c143;
                                                    c34 = c66;
                                                    str = null;
                                                    z9 = false;
                                                    c42 = c146;
                                                    c32 = c63;
                                                    c43 = c62;
                                                    c44 = '0';
                                                    c31 = '0';
                                                    c30 = '0';
                                                    c28 = '0';
                                                    c27 = '0';
                                                    c26 = '0';
                                                    c25 = '0';
                                                    c24 = '0';
                                                    c23 = '0';
                                                    c35 = c154;
                                                    c33 = c52;
                                                    c40 = c67;
                                                    c37 = c50;
                                                    i12 = 24;
                                                    c45 = c147;
                                                    c29 = '0';
                                                    c41 = c55;
                                                }
                                            } else {
                                                c68 = c57;
                                            }
                                            i14 = 24;
                                        } else {
                                            c67 = c149;
                                            c68 = c57;
                                        }
                                        if (i10 == i14 || c141 != ' ') {
                                            c69 = c141;
                                        } else {
                                            c69 = c141;
                                            if (c143 == ',' && c144 == ' ') {
                                                c70 = c143;
                                                c71 = c67;
                                                if (c71 == ',' && c58 == ' ' && c60 == ':' && c64 == ':' && c22 == ' ' && ((c46 == 'A' || c46 == 'P') && c65 == 'M')) {
                                                    int iMonth8 = month(c53, c49, c140);
                                                    if (iMonth8 > 0) {
                                                        c121 = (char) ((iMonth8 / 10) + 48);
                                                        c122 = (char) ((iMonth8 % 10) + 48);
                                                    } else {
                                                        c121 = '0';
                                                        c122 = '0';
                                                    }
                                                    bArr2 = bArr;
                                                    c42 = c61;
                                                    z10 = c46 == 'P';
                                                    c39 = c121;
                                                    c38 = c122;
                                                    c44 = c68;
                                                    c34 = c66;
                                                    str = null;
                                                    z9 = false;
                                                    c41 = c147;
                                                    c32 = c63;
                                                    c43 = c62;
                                                    c37 = '0';
                                                    c31 = '0';
                                                    c30 = '0';
                                                    c28 = '0';
                                                    c27 = '0';
                                                    c26 = '0';
                                                    c25 = '0';
                                                    c24 = '0';
                                                    c23 = '0';
                                                    c35 = c154;
                                                    c40 = c55;
                                                    c33 = c52;
                                                    c36 = c50;
                                                    i12 = 24;
                                                    c45 = c146;
                                                    c29 = c23;
                                                }
                                            }
                                            c72 = c50;
                                            if (c72 == '-' && c61 == '-') {
                                                c73 = c71;
                                                c74 = c55;
                                                if ((c74 == ' ' || c74 == 'T') && c68 == ':') {
                                                    c76 = c22;
                                                    c77 = c154;
                                                    c78 = c64;
                                                    if (c77 == ':') {
                                                        c75 = c52;
                                                        if (c75 == '.') {
                                                            if (i10 == 23 || c65 == '[') {
                                                                c120 = '|';
                                                                z9 = c65 == c120;
                                                                c43 = c58;
                                                                c34 = c60;
                                                                c29 = c46;
                                                                c42 = c53;
                                                                c38 = c144;
                                                                c45 = c49;
                                                                c33 = c66;
                                                                str = null;
                                                                z10 = false;
                                                                c36 = c147;
                                                                c37 = c146;
                                                                c31 = c63;
                                                                c35 = c62;
                                                                c28 = '0';
                                                                c27 = '0';
                                                                c25 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c40 = c69;
                                                                c32 = c78;
                                                                c30 = c76;
                                                                c44 = c73;
                                                                c39 = c70;
                                                                i12 = 23;
                                                                bArr2 = bArr;
                                                                c41 = c140;
                                                                c26 = c23;
                                                            } else if (c65 != '|') {
                                                                if (c65 != '+') {
                                                                    if (c65 != '-') {
                                                                    }
                                                                }
                                                                c120 = '|';
                                                                z9 = c65 == c120;
                                                                c43 = c58;
                                                                c34 = c60;
                                                                c29 = c46;
                                                                c42 = c53;
                                                                c38 = c144;
                                                                c45 = c49;
                                                                c33 = c66;
                                                                str = null;
                                                                z10 = false;
                                                                c36 = c147;
                                                                c37 = c146;
                                                                c31 = c63;
                                                                c35 = c62;
                                                                c28 = '0';
                                                                c27 = '0';
                                                                c25 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c40 = c69;
                                                                c32 = c78;
                                                                c30 = c76;
                                                                c44 = c73;
                                                                c39 = c70;
                                                                i12 = 23;
                                                                bArr2 = bArr;
                                                                c41 = c140;
                                                                c26 = c23;
                                                            } else {
                                                                c120 = '|';
                                                                z9 = c65 == c120;
                                                                c43 = c58;
                                                                c34 = c60;
                                                                c29 = c46;
                                                                c42 = c53;
                                                                c38 = c144;
                                                                c45 = c49;
                                                                c33 = c66;
                                                                str = null;
                                                                z10 = false;
                                                                c36 = c147;
                                                                c37 = c146;
                                                                c31 = c63;
                                                                c35 = c62;
                                                                c28 = '0';
                                                                c27 = '0';
                                                                c25 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c40 = c69;
                                                                c32 = c78;
                                                                c30 = c76;
                                                                c44 = c73;
                                                                c39 = c70;
                                                                i12 = 23;
                                                                bArr2 = bArr;
                                                                c41 = c140;
                                                                c26 = c23;
                                                            }
                                                        }
                                                    } else {
                                                        c75 = c52;
                                                    }
                                                    if (c72 == '-' && c61 == '-' && ((c74 == ' ' || c74 == 'T') && c68 == ':' && c77 == ':' && c75 == '.')) {
                                                        c79 = c60;
                                                        if (i10 != 24) {
                                                            c80 = c17;
                                                            if (c80 != '[') {
                                                                if (c80 == '|') {
                                                                    c119 = '|';
                                                                    z9 = c80 != c119;
                                                                    c28 = c65;
                                                                    c29 = c46;
                                                                    c42 = c53;
                                                                    c38 = c144;
                                                                    c33 = c66;
                                                                    z10 = false;
                                                                    c36 = c147;
                                                                    c37 = c146;
                                                                    c31 = c63;
                                                                    c35 = c62;
                                                                    c27 = '0';
                                                                    c25 = '0';
                                                                    c24 = '0';
                                                                    c23 = '0';
                                                                    c40 = c69;
                                                                    c32 = c78;
                                                                    c30 = c76;
                                                                    c34 = c79;
                                                                    c44 = c73;
                                                                    c39 = c70;
                                                                    i12 = 24;
                                                                    bArr2 = bArr;
                                                                    c43 = c58;
                                                                    c41 = c140;
                                                                    c45 = c49;
                                                                    str = null;
                                                                    c26 = c23;
                                                                } else if (c80 != '+') {
                                                                    if (c80 != '-') {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            c80 = c17;
                                                        }
                                                        c119 = '|';
                                                        z9 = c80 != c119;
                                                        c28 = c65;
                                                        c29 = c46;
                                                        c42 = c53;
                                                        c38 = c144;
                                                        c33 = c66;
                                                        z10 = false;
                                                        c36 = c147;
                                                        c37 = c146;
                                                        c31 = c63;
                                                        c35 = c62;
                                                        c27 = '0';
                                                        c25 = '0';
                                                        c24 = '0';
                                                        c23 = '0';
                                                        c40 = c69;
                                                        c32 = c78;
                                                        c30 = c76;
                                                        c34 = c79;
                                                        c44 = c73;
                                                        c39 = c70;
                                                        i12 = 24;
                                                        bArr2 = bArr;
                                                        c43 = c58;
                                                        c41 = c140;
                                                        c45 = c49;
                                                        str = null;
                                                        c26 = c23;
                                                    } else {
                                                        c79 = c60;
                                                        c80 = c17;
                                                    }
                                                    if (c72 != '-' && c61 == '-' && ((c74 == ' ' || c74 == 'T') && c68 == ':' && c77 == ':' && c75 == '.')) {
                                                        if (i10 != 25) {
                                                            c81 = c18;
                                                            c82 = c74;
                                                            if (c81 != '[') {
                                                                if (c81 == '|') {
                                                                    c118 = '|';
                                                                    boolean z11 = c81 != c118;
                                                                    c27 = c80;
                                                                    c28 = c65;
                                                                    c29 = c46;
                                                                    c42 = c53;
                                                                    c38 = c144;
                                                                    c33 = c66;
                                                                    c36 = c147;
                                                                    c37 = c146;
                                                                    c31 = c63;
                                                                    c35 = c62;
                                                                    c25 = '0';
                                                                    c24 = '0';
                                                                    c23 = '0';
                                                                    c40 = c69;
                                                                    c32 = c78;
                                                                    c30 = c76;
                                                                    c34 = c79;
                                                                    c44 = c73;
                                                                    c39 = c70;
                                                                    i12 = 25;
                                                                    bArr2 = bArr;
                                                                    z9 = z11;
                                                                    c43 = c58;
                                                                    c41 = c140;
                                                                    c45 = c49;
                                                                    str = null;
                                                                    z10 = false;
                                                                    c26 = c23;
                                                                } else if (c81 != '+') {
                                                                    if (c81 != '-') {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            c81 = c18;
                                                        }
                                                        c118 = '|';
                                                        if (c81 != c118) {
                                                        }
                                                        c27 = c80;
                                                        c28 = c65;
                                                        c29 = c46;
                                                        c42 = c53;
                                                        c38 = c144;
                                                        c33 = c66;
                                                        c36 = c147;
                                                        c37 = c146;
                                                        c31 = c63;
                                                        c35 = c62;
                                                        c25 = '0';
                                                        c24 = '0';
                                                        c23 = '0';
                                                        c40 = c69;
                                                        c32 = c78;
                                                        c30 = c76;
                                                        c34 = c79;
                                                        c44 = c73;
                                                        c39 = c70;
                                                        i12 = 25;
                                                        bArr2 = bArr;
                                                        z9 = z11;
                                                        c43 = c58;
                                                        c41 = c140;
                                                        c45 = c49;
                                                        str = null;
                                                        z10 = false;
                                                        c26 = c23;
                                                    } else {
                                                        c81 = c18;
                                                        c82 = c74;
                                                    }
                                                    if (i10 != 25) {
                                                        char c209 = c69;
                                                        c84 = c81;
                                                        c83 = c209;
                                                        if (c209 == ' ' && c144 == ',' && c61 == ' ' && c58 == ',' && c68 == ' ' && c77 == ':' && c75 == ':' && c46 == ' ' && ((c65 == 'A' || c65 == 'P') && c80 == 'M')) {
                                                            int iMonth9 = month(c53, c49, c140);
                                                            if (iMonth9 > 0) {
                                                                c117 = (char) ((iMonth9 % 10) + 48);
                                                                c116 = (char) ((iMonth9 / 10) + 48);
                                                            } else {
                                                                c116 = '0';
                                                                c117 = '0';
                                                            }
                                                            z10 = c65 == 'P';
                                                            bArr2 = bArr;
                                                            c38 = c117;
                                                            c37 = c72;
                                                            c35 = c66;
                                                            str = null;
                                                            z9 = false;
                                                            c42 = c146;
                                                            c33 = c63;
                                                            c44 = c62;
                                                            c31 = '0';
                                                            c30 = '0';
                                                            c29 = '0';
                                                            c28 = '0';
                                                            c27 = '0';
                                                            c25 = '0';
                                                            c24 = '0';
                                                            c23 = '0';
                                                            c34 = c78;
                                                            c32 = c76;
                                                            c43 = c79;
                                                            c40 = c73;
                                                            c41 = c82;
                                                            c36 = c70;
                                                            i12 = 25;
                                                            c39 = c116;
                                                            c45 = c147;
                                                        }
                                                        c26 = c23;
                                                    } else {
                                                        c83 = c69;
                                                        c84 = c81;
                                                    }
                                                    if (c72 == '-' || c61 != '-') {
                                                        c85 = c82;
                                                    } else {
                                                        c85 = c82;
                                                        if ((c85 == ' ' || c85 == 'T') && c68 == ':' && c77 == ':' && c75 == '.') {
                                                            if (i10 != 26) {
                                                                c87 = c19;
                                                                c86 = c140;
                                                                if (c87 != '[') {
                                                                    if (c87 == '|') {
                                                                        c115 = '|';
                                                                        boolean z12 = c87 != c115;
                                                                        c27 = c80;
                                                                        c28 = c65;
                                                                        c42 = c53;
                                                                        c33 = c66;
                                                                        c36 = c147;
                                                                        c37 = c146;
                                                                        c31 = c63;
                                                                        c35 = c62;
                                                                        c25 = '0';
                                                                        c24 = '0';
                                                                        c23 = '0';
                                                                        c32 = c78;
                                                                        c30 = c76;
                                                                        c34 = c79;
                                                                        c44 = c73;
                                                                        c41 = c86;
                                                                        c40 = c83;
                                                                        c39 = c70;
                                                                        i12 = 26;
                                                                        bArr2 = bArr;
                                                                        z9 = z12;
                                                                        c43 = c58;
                                                                        c29 = c46;
                                                                        c38 = c144;
                                                                        c45 = c49;
                                                                        str = null;
                                                                        z10 = false;
                                                                        c26 = c84;
                                                                    } else if (c87 != '+') {
                                                                        if (c87 != '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c87 = c19;
                                                                c86 = c140;
                                                            }
                                                            c115 = '|';
                                                            if (c87 != c115) {
                                                            }
                                                            c27 = c80;
                                                            c28 = c65;
                                                            c42 = c53;
                                                            c33 = c66;
                                                            c36 = c147;
                                                            c37 = c146;
                                                            c31 = c63;
                                                            c35 = c62;
                                                            c25 = '0';
                                                            c24 = '0';
                                                            c23 = '0';
                                                            c32 = c78;
                                                            c30 = c76;
                                                            c34 = c79;
                                                            c44 = c73;
                                                            c41 = c86;
                                                            c40 = c83;
                                                            c39 = c70;
                                                            i12 = 26;
                                                            bArr2 = bArr;
                                                            z9 = z12;
                                                            c43 = c58;
                                                            c29 = c46;
                                                            c38 = c144;
                                                            c45 = c49;
                                                            str = null;
                                                            z10 = false;
                                                            c26 = c84;
                                                        }
                                                        if (c72 == '-' && c61 == '-' && ((c85 == ' ' || c85 == 'T') && c68 == ':' && c77 == ':' && c75 == '.')) {
                                                            if (i10 != 27) {
                                                                c88 = c20;
                                                                c89 = c53;
                                                                if (c88 == '[' || c88 == '|' || c88 == '+' || c88 == '-' || c88 == 'Z') {
                                                                }
                                                            } else {
                                                                c88 = c20;
                                                                c89 = c53;
                                                            }
                                                            if (c65 == ' ') {
                                                                bArr2 = bArr;
                                                                c43 = c58;
                                                                c33 = c66;
                                                                str = null;
                                                                z10 = false;
                                                                z9 = false;
                                                                c36 = c147;
                                                                c31 = c63;
                                                                c35 = c62;
                                                                c28 = '0';
                                                                c27 = '0';
                                                                c25 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c32 = c78;
                                                                c30 = c76;
                                                                c34 = c79;
                                                                c44 = c73;
                                                                c41 = c86;
                                                                c42 = c89;
                                                                c40 = c83;
                                                                c39 = c70;
                                                                i12 = 23;
                                                                c29 = c46;
                                                                c38 = c144;
                                                                c45 = c49;
                                                                c37 = c146;
                                                                c26 = c23;
                                                            } else {
                                                                bArr2 = bArr;
                                                                c27 = c80;
                                                                c28 = c65;
                                                                c25 = c87;
                                                                c33 = c66;
                                                                c36 = c147;
                                                                c31 = c63;
                                                                c35 = c62;
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c32 = c78;
                                                                c30 = c76;
                                                                c34 = c79;
                                                                c44 = c73;
                                                                c41 = c86;
                                                                c42 = c89;
                                                                c40 = c83;
                                                                c39 = c70;
                                                                i12 = 27;
                                                                z9 = c88 == '|';
                                                                c43 = c58;
                                                                c29 = c46;
                                                                c38 = c144;
                                                                c45 = c49;
                                                                str = null;
                                                                z10 = false;
                                                                c37 = c146;
                                                                c26 = c84;
                                                            }
                                                        } else {
                                                            c88 = c20;
                                                            c89 = c53;
                                                        }
                                                        if (c72 != '-' && c61 == '-' && ((c85 == ' ' || c85 == 'T') && c68 == ':' && c77 == ':' && c75 == '.')) {
                                                            if (i10 != 28) {
                                                                c90 = c21;
                                                                c91 = c49;
                                                                if (c90 != '[') {
                                                                    if (c90 == '|') {
                                                                        c114 = '|';
                                                                        boolean z13 = c90 != c114;
                                                                        bArr2 = bArr;
                                                                        c27 = c80;
                                                                        c28 = c65;
                                                                        c25 = c87;
                                                                        c24 = c88;
                                                                        c33 = c66;
                                                                        c31 = c63;
                                                                        c35 = c62;
                                                                        c23 = '0';
                                                                        c32 = c78;
                                                                        c30 = c76;
                                                                        c34 = c79;
                                                                        c44 = c73;
                                                                        c41 = c86;
                                                                        c42 = c89;
                                                                        c45 = c91;
                                                                        c40 = c83;
                                                                        c39 = c70;
                                                                        i12 = 28;
                                                                        z9 = z13;
                                                                        c43 = c58;
                                                                        c29 = c46;
                                                                        c38 = c144;
                                                                        str = null;
                                                                        z10 = false;
                                                                        c36 = c147;
                                                                        c37 = c146;
                                                                        c26 = c84;
                                                                    } else if (c90 != '+') {
                                                                        if (c90 != '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c90 = c21;
                                                                c91 = c49;
                                                            }
                                                            c114 = '|';
                                                            if (c90 != c114) {
                                                            }
                                                            bArr2 = bArr;
                                                            c27 = c80;
                                                            c28 = c65;
                                                            c25 = c87;
                                                            c24 = c88;
                                                            c33 = c66;
                                                            c31 = c63;
                                                            c35 = c62;
                                                            c23 = '0';
                                                            c32 = c78;
                                                            c30 = c76;
                                                            c34 = c79;
                                                            c44 = c73;
                                                            c41 = c86;
                                                            c42 = c89;
                                                            c45 = c91;
                                                            c40 = c83;
                                                            c39 = c70;
                                                            i12 = 28;
                                                            z9 = z13;
                                                            c43 = c58;
                                                            c29 = c46;
                                                            c38 = c144;
                                                            str = null;
                                                            z10 = false;
                                                            c36 = c147;
                                                            c37 = c146;
                                                            c26 = c84;
                                                        } else {
                                                            c90 = c21;
                                                            c91 = c49;
                                                        }
                                                        char c210 = c90;
                                                        if (i10 != 28) {
                                                            c92 = c83;
                                                            if (c92 == ' ' && c61 == ' ' && c85 == ' ' && c68 == ':' && c77 == ':' && c75 == ' ' && c65 == ' ') {
                                                                int iMonth10 = month(c72, c70, c144);
                                                                if (iMonth10 > 0) {
                                                                    c113 = (char) ((iMonth10 % 10) + 48);
                                                                    c112 = (char) ((iMonth10 / 10) + 48);
                                                                } else {
                                                                    c112 = '0';
                                                                    c113 = '0';
                                                                }
                                                                c42 = c80;
                                                                c43 = c58;
                                                                c39 = c112;
                                                                c38 = c113;
                                                                c40 = c88;
                                                                bArr2 = bArr;
                                                                c33 = c66;
                                                                z9 = false;
                                                                c36 = c147;
                                                                c37 = c146;
                                                                c35 = c62;
                                                                c31 = '0';
                                                                c30 = '0';
                                                                c29 = '0';
                                                                c28 = '0';
                                                                c27 = '0';
                                                                c26 = '0';
                                                                c25 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c32 = c78;
                                                                c34 = c79;
                                                                c44 = c73;
                                                                str = new String(bArr, i9 + 20, 3);
                                                                c41 = c87;
                                                                z10 = false;
                                                                c45 = c84;
                                                                i12 = 19;
                                                            }
                                                        } else {
                                                            c92 = c83;
                                                        }
                                                        bArr2 = bArr;
                                                        char c211 = c88;
                                                        if (i10 != 28 && c92 == ',' && c72 == ' ' && c144 == ' ' && c85 == ' ') {
                                                            c95 = c58;
                                                            c96 = c79;
                                                            if (c96 == ' ') {
                                                                char c212 = c78;
                                                                c98 = c87;
                                                                if (c212 == ':') {
                                                                    c97 = c212;
                                                                    char c213 = c76;
                                                                    if (c213 == ':' && c80 == ' ') {
                                                                        int iMonth11 = month(c61, c146, c147);
                                                                        if (iMonth11 > 0) {
                                                                            c111 = (char) ((iMonth11 / 10) + 48);
                                                                            c110 = (char) ((iMonth11 % 10) + 48);
                                                                        } else {
                                                                            c110 = '0';
                                                                            c111 = '0';
                                                                        }
                                                                        c38 = c110;
                                                                        c32 = c65;
                                                                        c33 = c46;
                                                                        c44 = c77;
                                                                        c35 = c75;
                                                                        c43 = c66;
                                                                        str = null;
                                                                        z10 = false;
                                                                        c34 = c63;
                                                                        c40 = c62;
                                                                        c37 = '0';
                                                                        c31 = '0';
                                                                        c30 = '0';
                                                                        c29 = '0';
                                                                        c28 = '0';
                                                                        c27 = '0';
                                                                        c25 = '0';
                                                                        c24 = '0';
                                                                        c23 = '0';
                                                                        c42 = c73;
                                                                        c45 = c95;
                                                                        c36 = c70;
                                                                        i12 = 24;
                                                                        c39 = c111;
                                                                        c41 = c68;
                                                                        c26 = '0';
                                                                        z9 = true;
                                                                    } else {
                                                                        c93 = c80;
                                                                        c94 = c147;
                                                                        c99 = c146;
                                                                        c76 = c213;
                                                                        if (i10 != 29 && c92 == ',' && c72 == ' ' && c61 == ' ') {
                                                                            c100 = c92;
                                                                            c102 = c73;
                                                                            if (c102 == ' ' && c77 == ' ' && c75 == ':' && c46 == ':') {
                                                                                c101 = c84;
                                                                                c103 = c65;
                                                                                if (c101 == ' ') {
                                                                                    int iMonth12 = month(c99, c94, c85);
                                                                                    if (iMonth12 > 0) {
                                                                                        c109 = (char) ((iMonth12 % 10) + 48);
                                                                                        c108 = (char) ((iMonth12 / 10) + 48);
                                                                                    } else {
                                                                                        c108 = '0';
                                                                                        c109 = '0';
                                                                                    }
                                                                                    c40 = c96;
                                                                                    c38 = c109;
                                                                                    c36 = c144;
                                                                                    c44 = c66;
                                                                                    str = null;
                                                                                    z10 = false;
                                                                                    c32 = c93;
                                                                                    c35 = c63;
                                                                                    c41 = c62;
                                                                                    c31 = '0';
                                                                                    c30 = '0';
                                                                                    c29 = '0';
                                                                                    c28 = '0';
                                                                                    c27 = '0';
                                                                                    c25 = '0';
                                                                                    c24 = '0';
                                                                                    c23 = '0';
                                                                                    c33 = c103;
                                                                                    c34 = c76;
                                                                                    z9 = true;
                                                                                    c43 = c97;
                                                                                    c42 = c95;
                                                                                    c37 = c70;
                                                                                    i12 = 25;
                                                                                    c39 = c108;
                                                                                    c45 = c68;
                                                                                    c26 = c23;
                                                                                }
                                                                                if (c72 == '-' && c61 == '-' && ((c85 == ' ' || c85 == 'T') && c68 == ':' && c77 == ':' && c75 == '.')) {
                                                                                    if (i10 != 29) {
                                                                                        c104 = c72;
                                                                                        c106 = c13;
                                                                                        if (c106 != '[') {
                                                                                            if (c106 == '|') {
                                                                                                c107 = '|';
                                                                                                boolean z14 = c106 != c107;
                                                                                                c34 = c96;
                                                                                                c44 = c102;
                                                                                                str = null;
                                                                                                c27 = c93;
                                                                                                c31 = c63;
                                                                                                c35 = c62;
                                                                                                c24 = c211;
                                                                                                c28 = c103;
                                                                                                c25 = c98;
                                                                                                c30 = c76;
                                                                                                c32 = c97;
                                                                                                c43 = c95;
                                                                                                c41 = c86;
                                                                                                c42 = c89;
                                                                                                c45 = c91;
                                                                                                c23 = c210;
                                                                                                c40 = c100;
                                                                                                c39 = c70;
                                                                                                c36 = c94;
                                                                                                c37 = c99;
                                                                                                c29 = c46;
                                                                                                c26 = c101;
                                                                                                c38 = c144;
                                                                                                c33 = c66;
                                                                                                i12 = 29;
                                                                                                z9 = z14;
                                                                                                z10 = false;
                                                                                            } else if (c106 != '+') {
                                                                                                if (c106 != '-') {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        c106 = c13;
                                                                                    }
                                                                                    c107 = '|';
                                                                                    if (c106 != c107) {
                                                                                    }
                                                                                    c34 = c96;
                                                                                    c44 = c102;
                                                                                    str = null;
                                                                                    c27 = c93;
                                                                                    c31 = c63;
                                                                                    c35 = c62;
                                                                                    c24 = c211;
                                                                                    c28 = c103;
                                                                                    c25 = c98;
                                                                                    c30 = c76;
                                                                                    c32 = c97;
                                                                                    c43 = c95;
                                                                                    c41 = c86;
                                                                                    c42 = c89;
                                                                                    c45 = c91;
                                                                                    c23 = c210;
                                                                                    c40 = c100;
                                                                                    c39 = c70;
                                                                                    c36 = c94;
                                                                                    c37 = c99;
                                                                                    c29 = c46;
                                                                                    c26 = c101;
                                                                                    c38 = c144;
                                                                                    c33 = c66;
                                                                                    i12 = 29;
                                                                                    z9 = z14;
                                                                                    z10 = false;
                                                                                } else {
                                                                                    c104 = c72;
                                                                                }
                                                                                if (i10 != 22) {
                                                                                    c105 = c66;
                                                                                    if (c105 == '+' || c105 == '-') {
                                                                                        c43 = c94;
                                                                                        c30 = c96;
                                                                                        c32 = c68;
                                                                                        c34 = c102;
                                                                                        c35 = c85;
                                                                                        str = null;
                                                                                        z9 = false;
                                                                                        c31 = c62;
                                                                                        c28 = '0';
                                                                                        c27 = '0';
                                                                                        c25 = '0';
                                                                                        c24 = '0';
                                                                                        c23 = '0';
                                                                                        c33 = c95;
                                                                                        c41 = c86;
                                                                                        c42 = c89;
                                                                                        c45 = c91;
                                                                                        c40 = c100;
                                                                                        c38 = c70;
                                                                                        c36 = c61;
                                                                                        c44 = c99;
                                                                                        c29 = c77;
                                                                                        c37 = c144;
                                                                                        z10 = false;
                                                                                        c26 = '0';
                                                                                        c39 = c104;
                                                                                    }
                                                                                } else {
                                                                                    c105 = c66;
                                                                                }
                                                                                if ((i10 != 32 && c144 == ',' && c61 == ' ' && c85 == '-' && c62 == '-' && c75 == ' ' && c46 == ':' && c101 == ':' && bArr[i9 + 28] == 32) || ((i10 == 33 && c61 == ',' && c99 == ' ' && c102 == '-' && c96 == '-' && c63 == ' ' && c103 == ':' && c98 == ':' && bArr[i9 + 29] == 32) || ((i10 == 34 && c99 == ',' && c94 == ' ' && c95 == '-' && c77 == '-' && c76 == ' ' && c93 == ':' && c211 == ':' && bArr[i9 + 30] == 32) || (i10 == 35 && c94 == ',' && c85 == ' ' && c68 == '-' && c105 == '-' && c46 == ' ' && c101 == ':' && c210 == ':' && bArr[i9 + 31] == 32)))) {
                                                                                    return parseZonedDateTimeCookie(new String(bArr, i9, i10));
                                                                                }
                                                                                if (i10 == 34) {
                                                                                    DateTimeFormatter dateTimeFormatterOfPattern = DATE_TIME_FORMATTER_34;
                                                                                    if (dateTimeFormatterOfPattern == null) {
                                                                                        dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss O yyyy", Locale.ENGLISH);
                                                                                        DATE_TIME_FORMATTER_34 = dateTimeFormatterOfPattern;
                                                                                    }
                                                                                    return ZonedDateTime.parse(new String(bArr, i9, i10), dateTimeFormatterOfPattern);
                                                                                }
                                                                                if (i10 != 31 || b10 != 44) {
                                                                                    return null;
                                                                                }
                                                                                DateTimeFormatter dateTimeFormatterOfPattern2 = DATE_TIME_FORMATTER_RFC_2822;
                                                                                if (dateTimeFormatterOfPattern2 == null) {
                                                                                    dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
                                                                                    DATE_TIME_FORMATTER_RFC_2822 = dateTimeFormatterOfPattern2;
                                                                                }
                                                                                return ZonedDateTime.parse(new String(bArr, i9, i10), dateTimeFormatterOfPattern2);
                                                                            }
                                                                            c101 = c84;
                                                                        } else {
                                                                            c100 = c92;
                                                                            c101 = c84;
                                                                            c102 = c73;
                                                                        }
                                                                        c103 = c65;
                                                                        if (c72 == '-') {
                                                                            c104 = c72;
                                                                            if (i10 != 22) {
                                                                            }
                                                                            if (i10 != 32) {
                                                                                if (i10 == 34) {
                                                                                }
                                                                            } else if (i10 == 34) {
                                                                            }
                                                                            return parseZonedDateTimeCookie(new String(bArr, i9, i10));
                                                                        }
                                                                    }
                                                                } else {
                                                                    c93 = c80;
                                                                    c94 = c147;
                                                                    c97 = c212;
                                                                    c99 = c146;
                                                                    if (i10 != 29) {
                                                                        c100 = c92;
                                                                        c101 = c84;
                                                                        c102 = c73;
                                                                        c103 = c65;
                                                                        if (c72 == '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c93 = c80;
                                                                c94 = c147;
                                                            }
                                                        } else {
                                                            c93 = c80;
                                                            c94 = c147;
                                                            c95 = c58;
                                                            c96 = c79;
                                                        }
                                                        c97 = c78;
                                                        c98 = c87;
                                                        c99 = c146;
                                                        if (i10 != 29) {
                                                        }
                                                    }
                                                    c87 = c19;
                                                    c86 = c140;
                                                    if (c72 == '-') {
                                                        c88 = c20;
                                                        c89 = c53;
                                                        if (c72 != '-') {
                                                            c90 = c21;
                                                            c91 = c49;
                                                            char c2102 = c90;
                                                            if (i10 != 28) {
                                                            }
                                                            bArr2 = bArr;
                                                            char c2112 = c88;
                                                            if (i10 != 28) {
                                                                c93 = c80;
                                                                c94 = c147;
                                                                c95 = c58;
                                                                c96 = c79;
                                                                c97 = c78;
                                                                c98 = c87;
                                                                c99 = c146;
                                                                if (i10 != 29) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c76 = c22;
                                                    c77 = c154;
                                                    c75 = c52;
                                                }
                                            } else {
                                                c73 = c71;
                                                c74 = c55;
                                                c75 = c52;
                                                c76 = c22;
                                                c77 = c154;
                                            }
                                            c78 = c64;
                                            if (c72 == '-') {
                                                c79 = c60;
                                                c80 = c17;
                                                if (c72 != '-') {
                                                    c81 = c18;
                                                    c82 = c74;
                                                    if (i10 != 25) {
                                                    }
                                                    if (c72 == '-') {
                                                        c85 = c82;
                                                        c87 = c19;
                                                        c86 = c140;
                                                        if (c72 == '-') {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        c70 = c143;
                                        c71 = c67;
                                        c72 = c50;
                                        if (c72 == '-') {
                                            c73 = c71;
                                            c74 = c55;
                                            c75 = c52;
                                            c76 = c22;
                                            c77 = c154;
                                            c78 = c64;
                                            if (c72 == '-') {
                                            }
                                        }
                                    } else {
                                        c62 = c54;
                                        c64 = c156;
                                        c60 = c153;
                                        c63 = c51;
                                    }
                                    c66 = c155;
                                    c65 = c16;
                                    i14 = 24;
                                    if (i10 != 24) {
                                    }
                                    if (i10 == i14) {
                                        c69 = c141;
                                        c70 = c143;
                                        c71 = c67;
                                        c72 = c50;
                                        if (c72 == '-') {
                                        }
                                    }
                                } else {
                                    c60 = c153;
                                    c61 = c59;
                                    c62 = c54;
                                    c63 = c51;
                                    c64 = c156;
                                }
                                c65 = c16;
                                c66 = c155;
                                i14 = 24;
                                if (i10 != 24) {
                                }
                                if (i10 == i14) {
                                }
                            }
                        } else {
                            char c214 = c11;
                            c48 = c145;
                            c49 = c214;
                        }
                    } else {
                        char c215 = c11;
                        c48 = c145;
                        c49 = c215;
                        c50 = c142;
                    }
                    c51 = c12;
                    if (i10 != 22) {
                        c52 = c157;
                        if (i10 != 23) {
                        }
                    }
                }
                i12 = 17;
            }
        }
        if ((z10 && c44 == '1' && c43 == '2') ? false : z10) {
            int iHourAfterNoon = hourAfterNoon(c44, c43);
            c44 = (char) (iHourAfterNoon >> 16);
            c43 = (char) ((short) iHourAfterNoon);
        }
        LocalDateTime localDateTime = localDateTime(c42, c45, c41, c40, c39, c38, c37, c36, c44, c43, c35, c34, c33, c32, c31, c30, c29, c28, c27, c26, c25, c24, c23);
        if (localDateTime == null) {
            return null;
        }
        if (!z9) {
            if (i12 == i10) {
                zoneId2 = zoneId;
                zoneId3 = zoneId2;
            } else {
                int i15 = i9 + i12;
                char c216 = (char) bArr2[i15];
                if (c216 == 'Z') {
                    zoneId4 = ZoneOffset.UTC;
                } else {
                    if (str == null) {
                        if (c216 == '+' || c216 == '-') {
                            str = new String(bArr2, i15, i10 - i12);
                        } else if (c216 == ' ') {
                            str = new String(bArr2, i15 + 1, (i10 - i12) - 1);
                        } else if (i12 < i10) {
                            str = new String(bArr2, i15 + 1, (i10 - i12) - 2);
                        }
                    }
                    zoneId2 = zoneId;
                    zoneId3 = getZoneId(str, zoneId2);
                }
            }
            if (zoneId3 != null) {
                zoneId2 = zoneId3;
            }
            if (zoneId2 == null) {
                zoneId2 = DEFAULT_ZONE_ID;
            }
            return ZonedDateTime.ofLocal(localDateTime, zoneId2, null);
        }
        String str2 = new String(bArr2, i12, i10 - i12);
        zoneId4 = (str2.equals("UTC") || str2.equals("[UTC]")) ? ZoneOffset.UTC : TimeZone.getTimeZone(str2).toZoneId();
        zoneId3 = zoneId4;
        zoneId2 = zoneId;
        if (zoneId3 != null) {
        }
        if (zoneId2 == null) {
        }
        return ZonedDateTime.ofLocal(localDateTime, zoneId2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ZonedDateTime parseZonedDateTime16(byte[] bArr, int i9, ZoneId zoneId) {
        if (i9 + 16 > bArr.length) {
            String str = new String(bArr, i9, bArr.length - i9);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        int i10 = i9 + 10;
        char c20 = (char) bArr[i10];
        char c21 = (char) bArr[i9 + 13];
        if (c14 != '-' || c17 != '-' || ((c20 != '+' && c20 != '-') || c21 != ':')) {
            String str2 = new String(bArr, i9, 16);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            String str3 = new String(bArr, i9, 16);
            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
        }
        int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
        if (c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9') {
            String str4 = new String(bArr, i9, 16);
            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
        }
        int i11 = (c16 - '0') + ((c15 - '0') * 10);
        if (c18 < '0' || c18 > '9' || c19 < '0' || c19 > '9') {
            String str5 = new String(bArr, i9, 16);
            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
        }
        int i12 = c19 - '0';
        return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(iM6853z, i11, i12 + ((c18 - '0') * 10)), LocalTime.MIN), getZoneId(new String(bArr, i10, 6), zoneId));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ZonedDateTime parseZonedDateTimeCookie(String str) {
        if (str.endsWith(" CST")) {
            DateTimeFormatter dateTimeFormatterOfPattern = DATE_TIME_FORMATTER_COOKIE_LOCAL;
            if (dateTimeFormatterOfPattern == null) {
                dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
                DATE_TIME_FORMATTER_COOKIE_LOCAL = dateTimeFormatterOfPattern;
            }
            return ZonedDateTime.of(LocalDateTime.parse(str.substring(0, str.length() - 4), dateTimeFormatterOfPattern), SHANGHAI_ZONE_ID);
        }
        DateTimeFormatter dateTimeFormatterOfPattern2 = DATE_TIME_FORMATTER_COOKIE;
        if (dateTimeFormatterOfPattern2 == null) {
            dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy HH:mm:ss zzz", Locale.ENGLISH);
            DATE_TIME_FORMATTER_COOKIE = dateTimeFormatterOfPattern2;
        }
        return ZonedDateTime.parse(str, dateTimeFormatterOfPattern2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int readNanos(char[] cArr, int i9, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = cArr[i10 + i12] - '0';
            if ((i13 < 0) || (i13 > 9)) {
                return -1;
            }
            i11 = (i11 * 10) + i13;
        }
        return i11 * POWERS[(9 - i9) & 15];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String toString(long j3, boolean z9, ZoneId zoneId) {
        long j4;
        int i9;
        long jFloorDiv = Math.floorDiv(j3, 1000L);
        int shanghaiZoneOffsetTotalSeconds = (zoneId == SHANGHAI_ZONE_ID || zoneId.getRules() == SHANGHAI_ZONE_RULES) ? getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId.getRules().getOffset(Instant.ofEpochMilli(j3)).getTotalSeconds();
        long j5 = jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds);
        long jFloorDiv2 = Math.floorDiv(j5, 86400L);
        int iFloorMod = (int) Math.floorMod(j5, 86400L);
        long j10 = 719468 + jFloorDiv2;
        if (j10 < 0) {
            long j11 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j4 = j11 * 400;
            j10 += (-j11) * 146097;
        } else {
            j4 = 0;
        }
        long j12 = ((j10 * 400) + 591) / 146097;
        long j13 = j10 - ((j12 / 400) + (((j12 / 4) + (j12 * 365)) - (j12 / 100)));
        if (j13 < 0) {
            j12--;
            j13 = j10 - ((j12 / 400) + (((j12 / 4) + (365 * j12)) - (j12 / 100)));
        }
        int i10 = (int) j13;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j14 = j12 + j4 + ((long) (i11 / 10));
        if (j14 < -999999999 || j14 > 999999999) {
            throw new DateTimeException(AbstractC0255e.m1018g(j14, "Invalid year "));
        }
        int i14 = (int) j14;
        long j15 = iFloorMod;
        if (j15 < 0 || j15 > 86399) {
            throw new DateTimeException(AbstractC0255e.m1018g(j15, "Invalid secondOfDay "));
        }
        int i15 = (int) (j15 / 3600);
        long j16 = j15 - ((long) (i15 * 3600));
        int i16 = (int) (j16 / 60);
        int i17 = (int) (j16 - ((long) (i16 * 60)));
        int iFloorMod2 = (int) Math.floorMod(j3, 1000L);
        if (iFloorMod2 == 0) {
            i9 = 0;
        } else {
            i9 = 4;
            if (iFloorMod2 >= 10) {
                if (iFloorMod2 % 100 == 0) {
                    i9 = 2;
                } else if (iFloorMod2 % 10 == 0) {
                    i9 = 3;
                }
            }
        }
        int i18 = i9 + 19;
        int i19 = (z9 ? shanghaiZoneOffsetTotalSeconds == 0 ? 1 : 6 : 0) + i18;
        byte[] bArr = new byte[i19];
        IOUtils.writeLocalDate(bArr, 0, i14, i12, i13);
        bArr[10] = 32;
        IOUtils.writeLocalTime(bArr, 11, i15, i16, i17);
        if (i9 > 0) {
            bArr[19] = 46;
            for (int i20 = 20; i20 < i19; i20++) {
                bArr[i20] = JSONB.Constants.BC_INT32_BYTE_MIN;
            }
            if (iFloorMod2 < 10) {
                IOUtils.getChars(iFloorMod2, i18, bArr);
            } else if (iFloorMod2 % 100 == 0) {
                IOUtils.getChars(iFloorMod2 / 100, i18, bArr);
            } else if (iFloorMod2 % 10 == 0) {
                IOUtils.getChars(iFloorMod2 / 10, i18, bArr);
            } else {
                IOUtils.getChars(iFloorMod2, i18, bArr);
            }
        }
        if (z9) {
            int i21 = shanghaiZoneOffsetTotalSeconds / 3600;
            if (shanghaiZoneOffsetTotalSeconds == 0) {
                bArr[i18] = 90;
            } else {
                int iAbs = Math.abs(i21);
                if (i21 >= 0) {
                    bArr[i18] = 43;
                } else {
                    bArr[i18] = 45;
                }
                bArr[i9 + 20] = JSONB.Constants.BC_INT32_BYTE_MIN;
                int i22 = i9 + 22;
                IOUtils.getChars(iAbs, i22, bArr);
                bArr[i22] = 58;
                bArr[i9 + 23] = JSONB.Constants.BC_INT32_BYTE_MIN;
                int i23 = (shanghaiZoneOffsetTotalSeconds - (i21 * 3600)) / 60;
                if (i23 < 0) {
                    i23 = -i23;
                }
                IOUtils.getChars(i23, i19, bArr);
            }
        }
        return new String(bArr, 0, i19, StandardCharsets.ISO_8859_1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long utcSeconds(int i9, int i10, int i11, int i12, int i13, int i14) {
        long j3 = (i11 - 1) + (((i10 * 367) - 362) / 12) + ((i9 + 399) / 400) + (((i9 + 3) / 4) - ((i9 + 99) / 100)) + (i9 * 365);
        if (i10 > 2) {
            j3 = ((i9 & 3) != 0 || (i9 % 100 == 0 && i9 % 400 != 0)) ? j3 - 2 : j3 - 1;
        }
        return ((j3 - 719528) * 86400) + ((long) (i12 * 3600)) + ((long) (i13 * 60)) + ((long) i14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long ymd(byte[] bArr, int i9) {
        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if ((280375481794560L & jReverseBytes) != 49478026199040L) {
            return -1L;
        }
        if ((((-1085366475377544976L) & ((1085086099895750415L & jReverseBytes) + 434034439958300166L)) | ((jReverseBytes & (-1085366475377544976L)) - 3472275519666401328L)) != 0) {
            return -1L;
        }
        long j3 = 4222124902318095L & jReverseBytes;
        return (j3 << 3) + (j3 << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: yy */
    public static int m1772yy(byte[] bArr, int i9) {
        short sReverseBytes = JDKUtils.UNSAFE.getShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        if (JDKUtils.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i10 = sReverseBytes & 3855;
        if (((61680 & (i10 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((i10 >> 8) * 100) + ((sReverseBytes & 15) * 1000);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ZoneOffset zoneOffset(byte[] bArr, int i9, int i10) {
        return ZoneOffset.of(new String(bArr, i9, i10));
    }

    public static LocalDateTime localDateTime(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23) {
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i9 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i10 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        int i11 = (c19 - '0') + ((c18 - '0') * 10);
                        if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                            int i12 = (c21 - '0') + ((c20 - '0') * 10);
                            if (c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                int i13 = (c23 - '0') + ((c22 - '0') * 10);
                                if ((iM6853z != 0 || i9 != 0 || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) && i11 <= 24 && i12 <= 60 && i13 <= 60) {
                                    return LocalDateTime.of(iM6853z, i9, i10, i11, i12, i13, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ZoneOffset zoneOffset(char[] cArr, int i9, int i10) {
        return ZoneOffset.of(new String(cArr, i9, i10));
    }

    public static int readNanos(byte[] bArr, int i9, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = bArr[i10 + i12] + JSONB.Constants.BC_INT64_BYTE_ZERO;
            if ((i13 < 0) || (i13 > 9)) {
                return -1;
            }
            i11 = (i11 * 10) + i13;
        }
        return i11 * POWERS[(9 - i9) & 15];
    }

    public static LocalTime parseLocalTime8(char[] cArr, int i9) {
        if (i9 + 8 > cArr.length) {
            return null;
        }
        return parseLocalTime(cArr[i9], cArr[i9 + 1], cArr[i9 + 2], cArr[i9 + 3], cArr[i9 + 4], cArr[i9 + 5], cArr[i9 + 6], cArr[i9 + 7]);
    }

    public static LocalTime parseLocalTime15(byte[] bArr, int i9) {
        if (i9 + 15 <= bArr.length) {
            long jHms = hms(bArr, i9);
            if (jHms != -1 && bArr[i9 + 8] == 46) {
                int i10 = ((int) jHms) & 255;
                int i11 = ((int) (jHms >> 24)) & 255;
                int i12 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 6, i9 + 9);
                if (nanos < 0) {
                    return null;
                }
                return LocalTime.of(i10, i11, i12, nanos);
            }
        }
        return null;
    }

    public static LocalTime parseLocalTime5(char[] cArr, int i9) {
        if (i9 + 5 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        if (c12 == ':' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i10 = (c11 - '0') + ((c10 - '0') * 10);
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                return LocalTime.of(i10, (c14 - '0') + ((c13 - '0') * 10));
            }
        }
        return null;
    }

    public static LocalDate parseLocalDate(byte[] bArr, int i9, int i10) {
        if (bArr == null || i10 == 0) {
            return null;
        }
        if (i9 + i10 <= bArr.length) {
            switch (i10) {
                case 8:
                    return parseLocalDate8(bArr, i9);
                case 9:
                    return parseLocalDate9(bArr, i9);
                case 10:
                    return parseLocalDate10(bArr, i9);
                case 11:
                    return parseLocalDate11(bArr, i9);
                default:
                    if (i10 == 4 && bArr[i9] == 110 && bArr[i9 + 1] == 117 && bArr[i9 + 2] == 108 && bArr[i9 + 3] == 108) {
                        return null;
                    }
                    String str = new String(bArr, i9, i10);
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
        }
        String str2 = new String(bArr, i9, i10);
        throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
    }

    public static LocalDate parseLocalDate(char[] cArr, int i9, int i10) {
        if (cArr == null || i10 == 0) {
            return null;
        }
        if (i9 + i10 <= cArr.length) {
            switch (i10) {
                case 8:
                    return parseLocalDate8(cArr, i9);
                case 9:
                    return parseLocalDate9(cArr, i9);
                case 10:
                    return parseLocalDate10(cArr, i9);
                case 11:
                    return parseLocalDate11(cArr, i9);
                default:
                    if (i10 == 4 && cArr[i9] == 'n' && cArr[i9 + 1] == 'u' && cArr[i9 + 2] == 'l' && cArr[i9 + 3] == 'l') {
                        return null;
                    }
                    String str = new String(cArr, i9, i10);
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
        }
        String str2 = new String(cArr, i9, i10);
        throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
    }

    public static LocalTime parseLocalTime10(char[] cArr, int i9) {
        if (i9 + 10 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        if (c12 == ':' && c15 == ':' && c18 == '.' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i10 = (c11 - '0') + ((c10 - '0') * 10);
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                int i11 = (c14 - '0') + ((c13 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i12 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c19 >= '0' && c19 <= '9') {
                        return LocalTime.of(i10, i11, i12, (c19 - '0') * 100000000);
                    }
                }
            }
        }
        return null;
    }

    public static LocalTime parseLocalTime11(char[] cArr, int i9) {
        if (i9 + 11 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        if (c12 == ':' && c15 == ':' && c18 == '.' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i10 = (c11 - '0') + ((c10 - '0') * 10);
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                int i11 = (c14 - '0') + ((c13 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i12 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9') {
                        return LocalTime.of(i10, i11, i12, (((c20 - '0') * 10) + ((c19 - '0') * 100)) * 1000000);
                    }
                }
            }
        }
        return null;
    }

    public static LocalTime parseLocalTime12(char[] cArr, int i9) {
        if (i9 + 12 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        if (c12 == ':' && c15 == ':' && c18 == '.' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i10 = (c11 - '0') + ((c10 - '0') * 10);
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                int i11 = (c14 - '0') + ((c13 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i12 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                        return LocalTime.of(i10, i11, i12, ((c21 - '0') + AbstractC3199a.m6853z(c20, 48, 10, (c19 - '0') * 100)) * 1000000);
                    }
                }
            }
        }
        return null;
    }

    public static ZonedDateTime parseZonedDateTime(String str, ZoneId zoneId) {
        ZonedDateTime zonedDateTime;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (JDKUtils.ANDROID_SDK_INT >= 34) {
            byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
            zonedDateTime = parseZonedDateTime(bytes, 0, bytes.length, zoneId);
        } else {
            zonedDateTime = parseZonedDateTime(str.toCharArray(), 0, str.toCharArray().length, zoneId);
        }
        if (zonedDateTime != null) {
            return zonedDateTime;
        }
        switch (str) {
            case "0":
            case "null":
            case "0000-00-00":
                return null;
            default:
                throw new DateTimeParseException(str, str, 0);
        }
    }

    public static ZonedDateTime parseZonedDateTime(byte[] bArr, int i9, int i10) {
        return parseZonedDateTime(bArr, i9, i10, DEFAULT_ZONE_ID);
    }

    public static ZonedDateTime parseZonedDateTime(char[] cArr, int i9, int i10) {
        return parseZonedDateTime(cArr, i9, i10, DEFAULT_ZONE_ID);
    }

    public static ZonedDateTime parseZonedDateTime(String str) {
        return parseZonedDateTime(str, DEFAULT_ZONE_ID);
    }

    /* JADX WARN: Code restructure failed: missing block: B:367:0x0838, code lost:
    
        if (r6 != 'Z') goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x08ca, code lost:
    
        if (r14 != 'Z') goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a83, code lost:
    
        if (r1 != 'Z') goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0ba1, code lost:
    
        if (r3 != 'Z') goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0cd8, code lost:
    
        if (r11 != 'Z') goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x0ee9, code lost:
    
        if (r6 != 'Z') goto L716;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0893 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a30 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b6a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0cae  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0d92  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0e28  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0ea9  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0ef5  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0ef8  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0f2f  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x1005  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x100e  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x10cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZonedDateTime parseZonedDateTime(char[] cArr, int i9, int i10, ZoneId zoneId) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        int i11;
        char c25;
        char c26;
        char c27;
        char c28;
        char c29;
        char c30;
        char c31;
        char c32;
        char c33;
        char c34;
        char c35;
        char c36;
        char c37;
        char c38;
        char c39;
        char c40;
        char c41;
        char c42;
        char c43;
        char c44;
        char c45;
        char c46;
        char c47;
        char c48;
        char c49;
        char[] cArr2;
        int i12;
        char c50;
        String str;
        boolean z9;
        boolean z10;
        int i13;
        char c51;
        char c52;
        char c53;
        char c54;
        char c55;
        char c56;
        int i14;
        char c57;
        char c58;
        char c59;
        char c60;
        char c61;
        char c62;
        char c63;
        char c64;
        char c65;
        char c66;
        char c67;
        char c68;
        char c69;
        char c70;
        char c71;
        char c72;
        char c73;
        char c74;
        char c75;
        char c76;
        char c77;
        char c78;
        char c79;
        char c80;
        char c81;
        char c82;
        char c83;
        char c84;
        char c85;
        char c86;
        char c87;
        char c88;
        char c89;
        char c90;
        char c91;
        char c92;
        char c93;
        char c94;
        char c95;
        char c96;
        boolean z11;
        char c97;
        char c98;
        char c99;
        char c100;
        char c101;
        char c102;
        char c103;
        char c104;
        char c105;
        char c106;
        char c107;
        char c108;
        char c109;
        char c110;
        char c111;
        char c112;
        char c113;
        char c114;
        char c115;
        char c116;
        char c117;
        char c118;
        char c119;
        char c120;
        char c121;
        char c122;
        char c123;
        char c124;
        char c125;
        char c126;
        char c127;
        char c128;
        char c129;
        char c130;
        char c131;
        char c132;
        char c133;
        char c134;
        char c135;
        char c136;
        char c137;
        char c138;
        char c139;
        char c140;
        char c141;
        char c142;
        char c143;
        char c144;
        char c145;
        char c146;
        ZoneId zoneId2;
        ZoneId zoneId3;
        if (cArr == null || i10 == 0) {
            return null;
        }
        if (i10 == 16) {
            return parseZonedDateTime16(cArr, i9, zoneId);
        }
        if (i10 >= 19) {
            char c147 = cArr[i9];
            char c148 = cArr[i9 + 1];
            char c149 = cArr[i9 + 2];
            char c150 = cArr[i9 + 3];
            char c151 = cArr[i9 + 4];
            char c152 = cArr[i9 + 5];
            char c153 = cArr[i9 + 6];
            char c154 = cArr[i9 + 7];
            char c155 = cArr[i9 + 8];
            char c156 = cArr[i9 + 9];
            char c157 = cArr[i9 + 10];
            char c158 = cArr[i9 + 11];
            char c159 = cArr[i9 + 12];
            char c160 = cArr[i9 + 13];
            char c161 = cArr[i9 + 14];
            char c162 = cArr[i9 + 15];
            char c163 = cArr[i9 + 16];
            char c164 = cArr[i9 + 17];
            char c165 = cArr[i9 + 18];
            char c166 = i10 == 19 ? ' ' : cArr[i9 + 19];
            switch (i10) {
                case 19:
                case 20:
                    c10 = c147;
                    c11 = c148;
                    c12 = '0';
                    c13 = '0';
                    c14 = '0';
                    c15 = '0';
                    c16 = '0';
                    c17 = '0';
                    c18 = '0';
                    c19 = '0';
                    c20 = 0;
                    c21 = 0;
                    break;
                case 21:
                    c22 = cArr[i9 + 20];
                    c11 = c148;
                    c12 = '0';
                    c13 = '0';
                    c14 = c13;
                    c15 = c14;
                    c16 = c15;
                    c17 = c16;
                    c18 = c17;
                    c19 = c18;
                    c20 = c22;
                    c21 = 0;
                    c10 = c147;
                    break;
                case 22:
                    c22 = cArr[i9 + 20];
                    c11 = c148;
                    c12 = cArr[i9 + 21];
                    c13 = '0';
                    c14 = c13;
                    c15 = c14;
                    c16 = c15;
                    c17 = c16;
                    c18 = c17;
                    c19 = c18;
                    c20 = c22;
                    c21 = 0;
                    c10 = c147;
                    break;
                case 23:
                    c23 = cArr[i9 + 20];
                    c11 = c148;
                    c12 = cArr[i9 + 21];
                    c14 = '0';
                    c15 = '0';
                    c16 = '0';
                    c17 = '0';
                    c18 = '0';
                    c19 = '0';
                    c13 = cArr[i9 + 22];
                    c21 = 0;
                    c20 = c23;
                    c10 = c147;
                    break;
                case 24:
                    c23 = cArr[i9 + 20];
                    char c167 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    c11 = c148;
                    c12 = c167;
                    c15 = '0';
                    c16 = '0';
                    c17 = '0';
                    c18 = '0';
                    c19 = '0';
                    c14 = cArr[i9 + 23];
                    c21 = 0;
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
                case 25:
                    c23 = cArr[i9 + 20];
                    char c168 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    c11 = c148;
                    c12 = c168;
                    c16 = '0';
                    c17 = '0';
                    c18 = '0';
                    c19 = '0';
                    c14 = cArr[i9 + 23];
                    c15 = cArr[i9 + 24];
                    c21 = 0;
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
                case 26:
                    c23 = cArr[i9 + 20];
                    char c169 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    c11 = c148;
                    c12 = c169;
                    c17 = '0';
                    c18 = '0';
                    c19 = '0';
                    c14 = cArr[i9 + 23];
                    c15 = cArr[i9 + 24];
                    c16 = cArr[i9 + 25];
                    c21 = 0;
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
                case 27:
                    c23 = cArr[i9 + 20];
                    char c170 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    c11 = c148;
                    c12 = c170;
                    c18 = '0';
                    c19 = '0';
                    c14 = cArr[i9 + 23];
                    c15 = cArr[i9 + 24];
                    c16 = cArr[i9 + 25];
                    c17 = cArr[i9 + 26];
                    c21 = 0;
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
                case 28:
                    c23 = cArr[i9 + 20];
                    char c171 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    char c172 = cArr[i9 + 23];
                    c11 = c148;
                    c12 = c171;
                    c19 = '0';
                    c14 = c172;
                    c15 = cArr[i9 + 24];
                    c16 = cArr[i9 + 25];
                    c17 = cArr[i9 + 26];
                    c18 = cArr[i9 + 27];
                    c21 = 0;
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
                case 29:
                    c23 = cArr[i9 + 20];
                    char c173 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    char c174 = cArr[i9 + 23];
                    char c175 = cArr[i9 + 24];
                    c11 = c148;
                    c12 = c173;
                    c14 = c174;
                    c15 = c175;
                    c16 = cArr[i9 + 25];
                    c17 = cArr[i9 + 26];
                    c18 = cArr[i9 + 27];
                    c19 = cArr[i9 + 28];
                    c21 = 0;
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
                default:
                    c23 = cArr[i9 + 20];
                    char c176 = cArr[i9 + 21];
                    c24 = cArr[i9 + 22];
                    char c177 = cArr[i9 + 23];
                    char c178 = cArr[i9 + 24];
                    char c179 = cArr[i9 + 25];
                    c11 = c148;
                    c12 = c176;
                    c14 = c177;
                    c15 = c178;
                    c16 = c179;
                    c17 = cArr[i9 + 26];
                    c18 = cArr[i9 + 27];
                    c19 = cArr[i9 + 28];
                    c21 = cArr[i9 + 29];
                    c13 = c24;
                    c20 = c23;
                    c10 = c147;
                    break;
            }
            char c180 = c12;
            if (c151 == '-' && c154 == '-' && ((c157 == ' ' || c157 == 'T') && c160 == ':' && c163 == ':' && (c166 == '[' || c166 == 'Z' || c166 == '+' || c166 == '-' || c166 == ' '))) {
                z10 = false;
                cArr2 = cArr;
                i12 = i10;
                c40 = c161;
                c46 = c149;
                c45 = c150;
                c44 = c152;
                c43 = c153;
                c38 = c164;
                c37 = c165;
                str = null;
                c36 = '0';
                c35 = '0';
                c34 = '0';
                c33 = '0';
                c32 = '0';
                c31 = '0';
                c30 = '0';
                c29 = '0';
                c28 = '0';
                c41 = c156;
                c42 = c155;
                c39 = c162;
                c50 = c159;
                c48 = c10;
                c47 = c11;
                z9 = false;
                c49 = c158;
                i13 = 19;
            } else {
                if (c151 == '-' && c154 == '-' && c157 == ' ' && c158 == ' ' && c161 == ':' && c164 == ':') {
                    i11 = 20;
                    if (i10 == 20) {
                        cArr2 = cArr;
                        c39 = c163;
                        c37 = c166;
                        c50 = c160;
                        i13 = 20;
                        c46 = c149;
                        c45 = c150;
                        c44 = c152;
                        c43 = c153;
                        c38 = c165;
                        c36 = '0';
                        c35 = '0';
                        c34 = '0';
                        c33 = '0';
                        c32 = '0';
                        c31 = '0';
                        c30 = '0';
                        c29 = '0';
                        c28 = '0';
                        c41 = c156;
                        c42 = c155;
                        c40 = c162;
                        c49 = c159;
                        c48 = c10;
                        c47 = c11;
                        z9 = false;
                        z10 = false;
                    }
                    i12 = i10;
                    str = null;
                } else {
                    i11 = 20;
                }
                if (i10 == i11 && c149 == ' ' && c153 == ' ' && c158 == ' ' && c161 == ':' && c164 == ':') {
                    int iMonth = month(c150, c151, c152);
                    if (iMonth > 0) {
                        c146 = (char) ((iMonth / 10) + 48);
                        c145 = (char) ((iMonth % 10) + 48);
                    } else {
                        c145 = '0';
                        c146 = '0';
                    }
                    cArr2 = cArr;
                    c39 = c163;
                    c37 = c166;
                    i12 = i10;
                    c45 = c157;
                    c43 = c145;
                    c44 = c146;
                    c48 = c154;
                    c38 = c165;
                    str = null;
                    c36 = '0';
                    c35 = '0';
                    c34 = '0';
                    c33 = '0';
                    c32 = '0';
                    c31 = '0';
                    c30 = '0';
                    c29 = '0';
                    c28 = '0';
                    c46 = c156;
                    c47 = c155;
                    c40 = c162;
                    c49 = c159;
                    c42 = c10;
                    c41 = c11;
                    z9 = false;
                    i13 = 20;
                    z10 = false;
                    c50 = c160;
                } else {
                    if (c151 == '-' && c154 == '-' && ((c157 == ' ' || c157 == 'T') && c160 == ':' && c163 == ':' && c166 == '.')) {
                        if (i10 != 21) {
                            c25 = c180;
                            if (c25 == '[' || c25 == '+' || c25 == '-' || c25 == 'Z') {
                            }
                        } else {
                            c25 = c180;
                        }
                        cArr2 = cArr;
                        z9 = c25 == '|';
                        i12 = i10;
                        c40 = c161;
                        c46 = c149;
                        c45 = c150;
                        c44 = c152;
                        c43 = c153;
                        c38 = c164;
                        c37 = c165;
                        str = null;
                        c35 = '0';
                        c34 = '0';
                        c33 = '0';
                        c32 = '0';
                        c31 = '0';
                        c30 = '0';
                        c29 = '0';
                        c28 = '0';
                        c41 = c156;
                        c42 = c155;
                        c39 = c162;
                        c50 = c159;
                        c48 = c10;
                        c47 = c11;
                        c36 = c20;
                        z10 = false;
                        c49 = c158;
                        i13 = 21;
                    } else {
                        c25 = c180;
                    }
                    if (c151 == '-' && c154 == '-' && ((c157 == ' ' || c157 == 'T') && c160 == ':' && c163 == ':' && c166 == '.')) {
                        if (i10 != 22) {
                            c26 = c13;
                            c27 = c161;
                            if (c26 == '[' || c26 == '+' || c26 == '-' || c26 == 'Z') {
                            }
                            i13 = 22;
                        } else {
                            c26 = c13;
                            c27 = c161;
                        }
                        cArr2 = cArr;
                        z9 = c26 == '|';
                        c35 = c25;
                        c46 = c149;
                        c45 = c150;
                        c44 = c152;
                        c43 = c153;
                        c38 = c164;
                        c37 = c165;
                        c34 = '0';
                        c33 = '0';
                        c32 = '0';
                        c31 = '0';
                        c30 = '0';
                        c29 = '0';
                        c28 = '0';
                        c41 = c156;
                        c42 = c155;
                        c39 = c162;
                        c50 = c159;
                        c48 = c10;
                        c47 = c11;
                        c36 = c20;
                        c40 = c27;
                        z10 = false;
                        i12 = i10;
                        c49 = c158;
                        str = null;
                        i13 = 22;
                    } else {
                        c26 = c13;
                        c27 = c161;
                    }
                    if (c151 == '-' && c154 == '-' && ((c157 == ' ' || c157 == 'T') && c160 == ':' && c163 == 'Z' && c164 == '[' && c25 == ']' && i10 == 22)) {
                        z10 = false;
                        cArr2 = cArr;
                        i12 = i10;
                        c49 = c158;
                        c46 = c149;
                        c45 = c150;
                        c44 = c152;
                        c43 = c153;
                        str = null;
                        c38 = '0';
                        c37 = '0';
                        c36 = '0';
                        c35 = '0';
                        c34 = '0';
                        c33 = '0';
                        c32 = '0';
                        c31 = '0';
                        c30 = '0';
                        c29 = '0';
                        c28 = '0';
                        c41 = c156;
                        c42 = c155;
                        c39 = c162;
                        c50 = c159;
                        c48 = c10;
                        c47 = c11;
                        c40 = c27;
                        z9 = true;
                        i13 = 17;
                    } else {
                        if (i10 == 22 && c150 == ' ') {
                            c51 = c151;
                            if (c152 == ',' && c153 == ' ' && c158 == ' ' && c160 == ':' && c163 == ':' && c166 == ' ') {
                                c53 = c20;
                                if ((c53 == 'A' || c53 == 'P') && c25 == 'M') {
                                    int iMonth2 = month(c10, c11, c149);
                                    if (iMonth2 > 0) {
                                        c144 = (char) ((iMonth2 % 10) + 48);
                                        c143 = (char) ((iMonth2 / 10) + 48);
                                    } else {
                                        c143 = '0';
                                        c144 = '0';
                                    }
                                    z10 = c53 == 'P';
                                    cArr2 = cArr;
                                    c45 = c157;
                                    c44 = c143;
                                    c43 = c144;
                                    c38 = c164;
                                    c37 = c165;
                                    c49 = '0';
                                    c42 = '0';
                                    c36 = '0';
                                    c35 = '0';
                                    c34 = '0';
                                    c33 = '0';
                                    c32 = '0';
                                    c31 = '0';
                                    c30 = '0';
                                    c29 = '0';
                                    c28 = '0';
                                    c46 = c156;
                                    c47 = c155;
                                    c39 = c162;
                                    c50 = c159;
                                    c48 = c154;
                                    c40 = c27;
                                    c41 = c51;
                                    z9 = false;
                                    i13 = 22;
                                    i12 = i10;
                                    str = null;
                                } else {
                                    c52 = c10;
                                }
                            }
                            char c181 = c11;
                            char c182 = c52;
                            if (i10 != 22 && c149 == '/' && c152 == '/' && c157 == ' ' && c160 == ':' && c163 == ':' && c166 == ' ') {
                                if (c53 != 'A') {
                                    c142 = 'P';
                                    if (c53 == 'P') {
                                    }
                                    if (i10 != 23) {
                                        c55 = c182;
                                        c56 = c27;
                                        i14 = 23;
                                        if (i10 != 23) {
                                        }
                                        if (i10 == i14) {
                                            c61 = c58;
                                            if (i10 != 24) {
                                                c62 = c162;
                                                c63 = c61;
                                                c64 = c56;
                                                c65 = c53;
                                                c66 = c165;
                                                c67 = c14;
                                                c68 = c164;
                                                c69 = c158;
                                                c70 = c51;
                                                if (c70 == '-') {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c142 = 'P';
                                }
                                c54 = c166;
                                if (c25 == 'M') {
                                    z10 = c53 == c142;
                                    cArr2 = cArr;
                                    i12 = i10;
                                    c42 = c150;
                                    c48 = c153;
                                    c43 = c181;
                                    c38 = c164;
                                    c37 = c165;
                                    str = null;
                                    c36 = '0';
                                    c35 = '0';
                                    c34 = '0';
                                    c33 = '0';
                                    c32 = '0';
                                    c31 = '0';
                                    c30 = '0';
                                    c29 = '0';
                                    c28 = '0';
                                    c45 = c156;
                                    c46 = c155;
                                    c39 = c162;
                                    c50 = c159;
                                    c47 = c154;
                                    c44 = c182;
                                    c40 = c27;
                                    c41 = c51;
                                    z9 = false;
                                    c49 = c158;
                                    i13 = 22;
                                }
                                if (i10 != 23) {
                                }
                            } else {
                                c54 = c166;
                                if (i10 != 23 && c150 == ' ' && c152 == ',' && c153 == ' ' && c158 == ' ') {
                                    c56 = c27;
                                    if (c56 == ':' && c164 == ':' && c53 == ' ' && ((c25 == 'A' || c25 == 'P') && c26 == 'M')) {
                                        int iMonth3 = month(c182, c181, c149);
                                        if (iMonth3 > 0) {
                                            c140 = (char) ((iMonth3 / 10) + 48);
                                            c141 = (char) ((iMonth3 % 10) + 48);
                                        } else {
                                            c140 = '0';
                                            c141 = '0';
                                        }
                                        cArr2 = cArr;
                                        c39 = c163;
                                        z10 = c25 == 'P';
                                        i12 = i10;
                                        c50 = c160;
                                        c45 = c157;
                                        c44 = c140;
                                        c43 = c141;
                                        c38 = c165;
                                        str = null;
                                        c42 = '0';
                                        c36 = '0';
                                        c35 = '0';
                                        c34 = '0';
                                        c33 = '0';
                                        c32 = '0';
                                        c31 = '0';
                                        c30 = '0';
                                        c29 = '0';
                                        c28 = '0';
                                        c46 = c156;
                                        c47 = c155;
                                        c40 = c162;
                                        c49 = c159;
                                        c48 = c154;
                                        c37 = c54;
                                        c41 = c51;
                                        z9 = false;
                                        i13 = 23;
                                    } else {
                                        c55 = c182;
                                    }
                                } else {
                                    c55 = c182;
                                    c56 = c27;
                                }
                                i14 = 23;
                                if (i10 != 23) {
                                    c57 = c160;
                                    if (c150 == ' ' && c153 == ',') {
                                        c58 = c154;
                                        c59 = c157;
                                        c60 = c159;
                                        if (c58 == ' ' && c60 == ' ' && c56 == ':' && c164 == ':' && c53 == ' ' && ((c25 == 'A' || c25 == 'P') && c26 == 'M')) {
                                            int iMonth4 = month(c55, c181, c149);
                                            if (iMonth4 > 0) {
                                                c138 = (char) ((iMonth4 / 10) + 48);
                                                c139 = (char) ((iMonth4 % 10) + 48);
                                            } else {
                                                c138 = '0';
                                                c139 = '0';
                                            }
                                            z10 = c25 == 'P';
                                            cArr2 = cArr;
                                            c44 = c138;
                                            i12 = i10;
                                            c45 = c158;
                                            c43 = c139;
                                            c41 = c152;
                                            c38 = c165;
                                            str = null;
                                            c49 = '0';
                                            c36 = '0';
                                            c35 = '0';
                                            c34 = '0';
                                            c33 = '0';
                                            c32 = '0';
                                            c31 = '0';
                                            c30 = '0';
                                            c29 = '0';
                                            c28 = '0';
                                            c47 = c156;
                                            c48 = c155;
                                            c40 = c162;
                                            c46 = c59;
                                            c39 = c163;
                                            c37 = c54;
                                            c50 = c57;
                                            c42 = c51;
                                            z9 = false;
                                            i13 = 23;
                                        }
                                    } else {
                                        c58 = c154;
                                        c59 = c157;
                                        c60 = c159;
                                    }
                                    i14 = 23;
                                } else {
                                    c57 = c160;
                                    c58 = c154;
                                    c59 = c157;
                                    c60 = c159;
                                }
                                if (i10 == i14 || c150 != ' ') {
                                    c61 = c58;
                                } else {
                                    c61 = c58;
                                    if (c152 == ',' && c153 == ' ' && c158 == ',' && c60 == ' ' && c56 == ':' && c164 == ':' && c53 == ' ' && ((c25 == 'A' || c25 == 'P') && c26 == 'M')) {
                                        int iMonth5 = month(c55, c181, c149);
                                        if (iMonth5 > 0) {
                                            c136 = (char) ((iMonth5 / 10) + 48);
                                            c137 = (char) ((iMonth5 % 10) + 48);
                                        } else {
                                            c136 = '0';
                                            c137 = '0';
                                        }
                                        z10 = c25 == 'P';
                                        cArr2 = cArr;
                                        c44 = c136;
                                        i12 = i10;
                                        c43 = c137;
                                        c38 = c165;
                                        str = null;
                                        c49 = '0';
                                        c42 = '0';
                                        c36 = '0';
                                        c35 = '0';
                                        c34 = '0';
                                        c33 = '0';
                                        c32 = '0';
                                        c31 = '0';
                                        c30 = '0';
                                        c29 = '0';
                                        c28 = '0';
                                        c46 = c156;
                                        c47 = c155;
                                        c40 = c162;
                                        c48 = c61;
                                        c45 = c59;
                                        c39 = c163;
                                        c37 = c54;
                                        c50 = c57;
                                        c41 = c51;
                                        z9 = false;
                                        i13 = 23;
                                    }
                                }
                                if (i10 != 24 && c150 == ' ' && c153 == ',') {
                                    c63 = c61;
                                    if (c63 == ' ' && c60 == ' ') {
                                        c62 = c162;
                                        c65 = c53;
                                        c64 = c56;
                                        c66 = c165;
                                        if (c62 == ':') {
                                            if (c66 == ':' && c25 == ' ') {
                                                if (c26 == 'A' || c26 == 'P') {
                                                    c68 = c164;
                                                    c67 = c14;
                                                    if (c67 == 'M') {
                                                        int iMonth6 = month(c55, c181, c149);
                                                        if (iMonth6 > 0) {
                                                            char c183 = (char) ((iMonth6 / 10) + 48);
                                                            c134 = (char) ((iMonth6 % 10) + 48);
                                                            c135 = c183;
                                                        } else {
                                                            c134 = '0';
                                                            c135 = '0';
                                                        }
                                                        cArr2 = cArr;
                                                        c43 = c134;
                                                        z10 = c26 == 'P';
                                                        c45 = c158;
                                                        c44 = c135;
                                                        c41 = c152;
                                                        c39 = c68;
                                                        c36 = '0';
                                                        c35 = '0';
                                                        c34 = '0';
                                                        c33 = '0';
                                                        c32 = '0';
                                                        c31 = '0';
                                                        c30 = '0';
                                                        c29 = '0';
                                                        c28 = '0';
                                                        c47 = c156;
                                                        c48 = c155;
                                                        c37 = c65;
                                                        c50 = c64;
                                                        c46 = c59;
                                                        c40 = c163;
                                                        c38 = c54;
                                                        c49 = c57;
                                                        c42 = c51;
                                                        z9 = false;
                                                        i13 = 24;
                                                        i12 = i10;
                                                        str = null;
                                                    }
                                                } else {
                                                    c68 = c164;
                                                    c67 = c14;
                                                    c70 = c51;
                                                    c69 = c158;
                                                    if (c70 == '-' && c63 == '-') {
                                                        c72 = c59;
                                                        c74 = c152;
                                                        if (c72 == ' ' || c72 == 'T') {
                                                            c76 = c57;
                                                            c77 = c149;
                                                            c71 = c55;
                                                            c73 = c163;
                                                            if (c76 == ':') {
                                                                c75 = c181;
                                                                if (c73 == ':') {
                                                                    c78 = c54;
                                                                    if (c78 == '.') {
                                                                        if (i10 == 23 || c67 == '[') {
                                                                            c133 = '|';
                                                                            boolean z12 = c67 == c133;
                                                                            cArr2 = cArr;
                                                                            c37 = c66;
                                                                            c39 = c62;
                                                                            c50 = c60;
                                                                            c35 = c25;
                                                                            c34 = c26;
                                                                            c45 = c150;
                                                                            c43 = c153;
                                                                            c38 = c68;
                                                                            c33 = '0';
                                                                            c32 = '0';
                                                                            c31 = '0';
                                                                            c30 = '0';
                                                                            c29 = '0';
                                                                            c28 = '0';
                                                                            c41 = c156;
                                                                            c42 = c155;
                                                                            c36 = c65;
                                                                            c40 = c64;
                                                                            c44 = c74;
                                                                            c47 = c75;
                                                                            c46 = c77;
                                                                            c49 = c69;
                                                                            c48 = c71;
                                                                            i13 = 23;
                                                                            z9 = z12;
                                                                            i12 = i10;
                                                                            str = null;
                                                                            z10 = false;
                                                                        } else if (c67 != '|') {
                                                                            if (c67 != '+') {
                                                                                if (c67 != '-') {
                                                                                }
                                                                            }
                                                                            c133 = '|';
                                                                            if (c67 == c133) {
                                                                            }
                                                                            cArr2 = cArr;
                                                                            c37 = c66;
                                                                            c39 = c62;
                                                                            c50 = c60;
                                                                            c35 = c25;
                                                                            c34 = c26;
                                                                            c45 = c150;
                                                                            c43 = c153;
                                                                            c38 = c68;
                                                                            c33 = '0';
                                                                            c32 = '0';
                                                                            c31 = '0';
                                                                            c30 = '0';
                                                                            c29 = '0';
                                                                            c28 = '0';
                                                                            c41 = c156;
                                                                            c42 = c155;
                                                                            c36 = c65;
                                                                            c40 = c64;
                                                                            c44 = c74;
                                                                            c47 = c75;
                                                                            c46 = c77;
                                                                            c49 = c69;
                                                                            c48 = c71;
                                                                            i13 = 23;
                                                                            z9 = z12;
                                                                            i12 = i10;
                                                                            str = null;
                                                                            z10 = false;
                                                                        } else {
                                                                            c133 = '|';
                                                                            if (c67 == c133) {
                                                                            }
                                                                            cArr2 = cArr;
                                                                            c37 = c66;
                                                                            c39 = c62;
                                                                            c50 = c60;
                                                                            c35 = c25;
                                                                            c34 = c26;
                                                                            c45 = c150;
                                                                            c43 = c153;
                                                                            c38 = c68;
                                                                            c33 = '0';
                                                                            c32 = '0';
                                                                            c31 = '0';
                                                                            c30 = '0';
                                                                            c29 = '0';
                                                                            c28 = '0';
                                                                            c41 = c156;
                                                                            c42 = c155;
                                                                            c36 = c65;
                                                                            c40 = c64;
                                                                            c44 = c74;
                                                                            c47 = c75;
                                                                            c46 = c77;
                                                                            c49 = c69;
                                                                            c48 = c71;
                                                                            i13 = 23;
                                                                            z9 = z12;
                                                                            i12 = i10;
                                                                            str = null;
                                                                            z10 = false;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c78 = c54;
                                                                c75 = c181;
                                                            }
                                                            if (c70 == '-' && c63 == '-' && ((c72 == ' ' || c72 == 'T') && c76 == ':' && c73 == ':' && c78 == '.')) {
                                                                if (i10 != 24) {
                                                                    c79 = c78;
                                                                    c80 = c15;
                                                                    if (c80 != '[') {
                                                                        if (c80 == '|') {
                                                                            c132 = '|';
                                                                            cArr2 = cArr;
                                                                            c37 = c66;
                                                                            c39 = c62;
                                                                            c33 = c67;
                                                                            c35 = c25;
                                                                            c34 = c26;
                                                                            c45 = c150;
                                                                            c43 = c153;
                                                                            c38 = c68;
                                                                            c32 = '0';
                                                                            c31 = '0';
                                                                            c30 = '0';
                                                                            c29 = '0';
                                                                            c28 = '0';
                                                                            c41 = c156;
                                                                            c42 = c155;
                                                                            c36 = c65;
                                                                            c40 = c64;
                                                                            c44 = c74;
                                                                            c47 = c75;
                                                                            c46 = c77;
                                                                            c49 = c69;
                                                                            c48 = c71;
                                                                            i13 = 24;
                                                                            z9 = c80 != c132;
                                                                            i12 = i10;
                                                                            c50 = c60;
                                                                            str = null;
                                                                            z10 = false;
                                                                        } else if (c80 != '+') {
                                                                            if (c80 != '-') {
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    c80 = c15;
                                                                }
                                                                c132 = '|';
                                                                cArr2 = cArr;
                                                                c37 = c66;
                                                                c39 = c62;
                                                                c33 = c67;
                                                                c35 = c25;
                                                                c34 = c26;
                                                                c45 = c150;
                                                                c43 = c153;
                                                                c38 = c68;
                                                                c32 = '0';
                                                                c31 = '0';
                                                                c30 = '0';
                                                                c29 = '0';
                                                                c28 = '0';
                                                                c41 = c156;
                                                                c42 = c155;
                                                                c36 = c65;
                                                                c40 = c64;
                                                                c44 = c74;
                                                                c47 = c75;
                                                                c46 = c77;
                                                                c49 = c69;
                                                                c48 = c71;
                                                                i13 = 24;
                                                                z9 = c80 != c132;
                                                                i12 = i10;
                                                                c50 = c60;
                                                                str = null;
                                                                z10 = false;
                                                            } else {
                                                                c79 = c78;
                                                                c80 = c15;
                                                            }
                                                            if (i10 == 24 || c150 != ' ') {
                                                                c81 = c80;
                                                            } else {
                                                                c81 = c80;
                                                                if (c153 == ',' && c63 == ' ' && c60 == ',' && c76 == ' ' && c62 == ':' && c66 == ':' && c25 == ' ' && ((c26 == 'A' || c26 == 'P') && c67 == 'M')) {
                                                                    char c184 = c75;
                                                                    char c185 = c73;
                                                                    int iMonth7 = month(c71, c184, c77);
                                                                    if (iMonth7 > 0) {
                                                                        char c186 = (char) ((iMonth7 / 10) + 48);
                                                                        c130 = (char) ((iMonth7 % 10) + 48);
                                                                        c131 = c186;
                                                                    } else {
                                                                        c130 = '0';
                                                                        c131 = '0';
                                                                    }
                                                                    cArr2 = cArr;
                                                                    c43 = c130;
                                                                    z10 = c26 == 'P';
                                                                    c46 = c72;
                                                                    c44 = c131;
                                                                    c42 = c70;
                                                                    c39 = c68;
                                                                    c49 = '0';
                                                                    c36 = '0';
                                                                    c35 = '0';
                                                                    c34 = '0';
                                                                    c33 = '0';
                                                                    c32 = '0';
                                                                    c31 = '0';
                                                                    c30 = '0';
                                                                    c29 = '0';
                                                                    c28 = '0';
                                                                    c47 = c156;
                                                                    c48 = c155;
                                                                    c37 = c65;
                                                                    c50 = c64;
                                                                    c41 = c74;
                                                                    c40 = c185;
                                                                    c38 = c79;
                                                                    c45 = c69;
                                                                    z9 = false;
                                                                    i13 = 24;
                                                                    i12 = i10;
                                                                    str = null;
                                                                }
                                                            }
                                                            char c187 = c75;
                                                            char c188 = c71;
                                                            char c189 = c73;
                                                            char c190 = c77;
                                                            char c191 = c76;
                                                            if (i10 == 24 || c150 != ' ') {
                                                                c82 = c150;
                                                            } else {
                                                                c82 = c150;
                                                                char c192 = c74;
                                                                if (c192 == ',' && c153 == ' ') {
                                                                    c74 = c192;
                                                                    c83 = c69;
                                                                    if (c83 == ',' && c60 == ' ' && c62 == ':' && c66 == ':' && c25 == ' ' && ((c26 == 'A' || c26 == 'P') && c67 == 'M')) {
                                                                        int iMonth8 = month(c188, c187, c190);
                                                                        if (iMonth8 > 0) {
                                                                            char c193 = (char) ((iMonth8 / 10) + 48);
                                                                            c128 = (char) ((iMonth8 % 10) + 48);
                                                                            c129 = c193;
                                                                        } else {
                                                                            c128 = '0';
                                                                            c129 = '0';
                                                                        }
                                                                        cArr2 = cArr;
                                                                        c48 = c63;
                                                                        c43 = c128;
                                                                        z10 = c26 == 'P';
                                                                        c45 = c72;
                                                                        c44 = c129;
                                                                        c41 = c70;
                                                                        c39 = c68;
                                                                        str = null;
                                                                        c42 = '0';
                                                                        c36 = '0';
                                                                        c35 = '0';
                                                                        c34 = '0';
                                                                        c33 = '0';
                                                                        c32 = '0';
                                                                        c31 = '0';
                                                                        c30 = '0';
                                                                        c29 = '0';
                                                                        c28 = '0';
                                                                        c46 = c156;
                                                                        c47 = c155;
                                                                        c37 = c65;
                                                                        c50 = c64;
                                                                        c40 = c189;
                                                                        c38 = c79;
                                                                        c49 = c191;
                                                                        z9 = false;
                                                                        i13 = 24;
                                                                        i12 = i10;
                                                                    } else {
                                                                        if (c70 == '-' && c63 == '-' && (c72 == ' ' || c72 == 'T')) {
                                                                            c87 = c191;
                                                                            c84 = c83;
                                                                            c85 = c189;
                                                                            if (c87 == ':') {
                                                                                c89 = c25;
                                                                                if (c85 == ':') {
                                                                                    c86 = c79;
                                                                                    if (c86 == '.') {
                                                                                        i12 = i10;
                                                                                        c88 = c66;
                                                                                        if (i12 != 25) {
                                                                                            c90 = c16;
                                                                                            c91 = c62;
                                                                                            if (c90 != '[') {
                                                                                                if (c90 == '|') {
                                                                                                    c127 = '|';
                                                                                                    z9 = c90 != c127;
                                                                                                    c33 = c67;
                                                                                                    c34 = c26;
                                                                                                    c48 = c188;
                                                                                                    c46 = c190;
                                                                                                    c43 = c153;
                                                                                                    c47 = c187;
                                                                                                    c38 = c68;
                                                                                                    str = null;
                                                                                                    c31 = '0';
                                                                                                    c30 = '0';
                                                                                                    c29 = '0';
                                                                                                    c28 = '0';
                                                                                                    c41 = c156;
                                                                                                    c42 = c155;
                                                                                                    c36 = c65;
                                                                                                    c40 = c64;
                                                                                                    c44 = c74;
                                                                                                    c35 = c89;
                                                                                                    c37 = c88;
                                                                                                    c49 = c84;
                                                                                                    c32 = c81;
                                                                                                    c39 = c91;
                                                                                                    c45 = c82;
                                                                                                    i13 = 25;
                                                                                                    z10 = false;
                                                                                                    cArr2 = cArr;
                                                                                                    c50 = c60;
                                                                                                } else if (c90 != '+') {
                                                                                                    if (c90 != '-') {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c90 = c16;
                                                                                            c91 = c62;
                                                                                        }
                                                                                        c127 = '|';
                                                                                        z9 = c90 != c127;
                                                                                        c33 = c67;
                                                                                        c34 = c26;
                                                                                        c48 = c188;
                                                                                        c46 = c190;
                                                                                        c43 = c153;
                                                                                        c47 = c187;
                                                                                        c38 = c68;
                                                                                        str = null;
                                                                                        c31 = '0';
                                                                                        c30 = '0';
                                                                                        c29 = '0';
                                                                                        c28 = '0';
                                                                                        c41 = c156;
                                                                                        c42 = c155;
                                                                                        c36 = c65;
                                                                                        c40 = c64;
                                                                                        c44 = c74;
                                                                                        c35 = c89;
                                                                                        c37 = c88;
                                                                                        c49 = c84;
                                                                                        c32 = c81;
                                                                                        c39 = c91;
                                                                                        c45 = c82;
                                                                                        i13 = 25;
                                                                                        z10 = false;
                                                                                        cArr2 = cArr;
                                                                                        c50 = c60;
                                                                                    }
                                                                                } else {
                                                                                    c86 = c79;
                                                                                }
                                                                                i12 = i10;
                                                                                c88 = c66;
                                                                                c90 = c16;
                                                                                c91 = c62;
                                                                                if (i12 == 25) {
                                                                                    char c194 = c82;
                                                                                    c93 = c90;
                                                                                    c92 = c194;
                                                                                    if (c194 == ' ' && c153 == ',' && c63 == ' ' && c60 == ',' && c87 == ' ' && c85 == ':' && c86 == ':' && c26 == ' ' && (c67 == 'A' || c67 == 'P')) {
                                                                                        c94 = c81;
                                                                                        if (c94 == 'M') {
                                                                                            int iMonth9 = month(c188, c187, c190);
                                                                                            if (iMonth9 > 0) {
                                                                                                c125 = (char) ((iMonth9 / 10) + 48);
                                                                                                c126 = (char) ((iMonth9 % 10) + 48);
                                                                                            } else {
                                                                                                c125 = '0';
                                                                                                c126 = '0';
                                                                                            }
                                                                                            z10 = c67 == 'P';
                                                                                            cArr2 = cArr;
                                                                                            c44 = c125;
                                                                                            c46 = c72;
                                                                                            c43 = c126;
                                                                                            c42 = c70;
                                                                                            c40 = c68;
                                                                                            str = null;
                                                                                            c36 = '0';
                                                                                            c35 = '0';
                                                                                            c34 = '0';
                                                                                            c33 = '0';
                                                                                            c32 = '0';
                                                                                            c31 = '0';
                                                                                            c30 = '0';
                                                                                            c29 = '0';
                                                                                            c28 = '0';
                                                                                            c47 = c156;
                                                                                            c48 = c155;
                                                                                            c38 = c65;
                                                                                            c49 = c64;
                                                                                            c41 = c74;
                                                                                            c37 = c89;
                                                                                            c39 = c88;
                                                                                            c45 = c84;
                                                                                            c50 = c91;
                                                                                            z9 = false;
                                                                                        }
                                                                                        i13 = 25;
                                                                                    }
                                                                                    if (c70 != '-' && c63 == '-' && ((c72 == ' ' || c72 == 'T') && c87 == ':' && c85 == ':' && c86 == '.')) {
                                                                                        if (i12 != 26) {
                                                                                            c95 = c17;
                                                                                            c96 = c188;
                                                                                            if (c95 != '[') {
                                                                                                if (c95 == '|') {
                                                                                                    c124 = '|';
                                                                                                    z11 = c95 != c124;
                                                                                                    c32 = c94;
                                                                                                    c33 = c67;
                                                                                                    c34 = c26;
                                                                                                    c46 = c190;
                                                                                                    c43 = c153;
                                                                                                    c47 = c187;
                                                                                                    c38 = c68;
                                                                                                    str = null;
                                                                                                    c30 = '0';
                                                                                                    c29 = '0';
                                                                                                    c28 = '0';
                                                                                                    c41 = c156;
                                                                                                    c42 = c155;
                                                                                                    c36 = c65;
                                                                                                    c40 = c64;
                                                                                                    c44 = c74;
                                                                                                    c35 = c89;
                                                                                                    c37 = c88;
                                                                                                    c49 = c84;
                                                                                                    c48 = c96;
                                                                                                    c31 = c93;
                                                                                                    c45 = c92;
                                                                                                    i13 = 26;
                                                                                                    cArr2 = cArr;
                                                                                                    z9 = z11;
                                                                                                    c50 = c60;
                                                                                                    c39 = c91;
                                                                                                    z10 = false;
                                                                                                } else if (c95 != '+') {
                                                                                                    if (c95 != '-') {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c95 = c17;
                                                                                            c96 = c188;
                                                                                        }
                                                                                        c124 = '|';
                                                                                        if (c95 != c124) {
                                                                                        }
                                                                                        c32 = c94;
                                                                                        c33 = c67;
                                                                                        c34 = c26;
                                                                                        c46 = c190;
                                                                                        c43 = c153;
                                                                                        c47 = c187;
                                                                                        c38 = c68;
                                                                                        str = null;
                                                                                        c30 = '0';
                                                                                        c29 = '0';
                                                                                        c28 = '0';
                                                                                        c41 = c156;
                                                                                        c42 = c155;
                                                                                        c36 = c65;
                                                                                        c40 = c64;
                                                                                        c44 = c74;
                                                                                        c35 = c89;
                                                                                        c37 = c88;
                                                                                        c49 = c84;
                                                                                        c48 = c96;
                                                                                        c31 = c93;
                                                                                        c45 = c92;
                                                                                        i13 = 26;
                                                                                        cArr2 = cArr;
                                                                                        z9 = z11;
                                                                                        c50 = c60;
                                                                                        c39 = c91;
                                                                                        z10 = false;
                                                                                    } else {
                                                                                        c95 = c17;
                                                                                        c96 = c188;
                                                                                    }
                                                                                    if (c70 != '-' && c63 == '-' && ((c72 == ' ' || c72 == 'T') && c87 == ':' && c85 == ':' && c86 == '.')) {
                                                                                        if (i12 != 27) {
                                                                                            c97 = c18;
                                                                                            c98 = c190;
                                                                                            if (c97 == '[' || c97 == '|' || c97 == '+' || c97 == '-' || c97 == 'Z') {
                                                                                            }
                                                                                            z10 = false;
                                                                                        } else {
                                                                                            c97 = c18;
                                                                                            c98 = c190;
                                                                                        }
                                                                                        if (c67 == ' ') {
                                                                                            z10 = false;
                                                                                            cArr2 = cArr;
                                                                                            c50 = c60;
                                                                                            c34 = c26;
                                                                                            c43 = c153;
                                                                                            c47 = c187;
                                                                                            c38 = c68;
                                                                                            str = null;
                                                                                            c33 = '0';
                                                                                            c32 = '0';
                                                                                            c31 = '0';
                                                                                            c30 = '0';
                                                                                            c29 = '0';
                                                                                            c28 = '0';
                                                                                            c41 = c156;
                                                                                            c42 = c155;
                                                                                            c36 = c65;
                                                                                            c40 = c64;
                                                                                            c44 = c74;
                                                                                            c35 = c89;
                                                                                            c37 = c88;
                                                                                            c49 = c84;
                                                                                            c48 = c96;
                                                                                            c46 = c98;
                                                                                            c45 = c92;
                                                                                            z9 = false;
                                                                                            i13 = 23;
                                                                                            c39 = c91;
                                                                                        } else {
                                                                                            z11 = c97 == '|';
                                                                                            cArr2 = cArr;
                                                                                            c32 = c94;
                                                                                            c30 = c95;
                                                                                            c33 = c67;
                                                                                            c34 = c26;
                                                                                            c43 = c153;
                                                                                            c47 = c187;
                                                                                            c38 = c68;
                                                                                            str = null;
                                                                                            c29 = '0';
                                                                                            c28 = '0';
                                                                                            c41 = c156;
                                                                                            c42 = c155;
                                                                                            c36 = c65;
                                                                                            c40 = c64;
                                                                                            c44 = c74;
                                                                                            c35 = c89;
                                                                                            c37 = c88;
                                                                                            c49 = c84;
                                                                                            c48 = c96;
                                                                                            c46 = c98;
                                                                                            c31 = c93;
                                                                                            c45 = c92;
                                                                                            i13 = 27;
                                                                                            z9 = z11;
                                                                                            c50 = c60;
                                                                                            c39 = c91;
                                                                                            z10 = false;
                                                                                        }
                                                                                    } else {
                                                                                        c97 = c18;
                                                                                        c98 = c190;
                                                                                    }
                                                                                    if (c70 != '-' && c63 == '-' && ((c72 == ' ' || c72 == 'T') && c87 == ':' && c85 == ':' && c86 == '.')) {
                                                                                        if (i12 != 28) {
                                                                                            c99 = c19;
                                                                                            c100 = c187;
                                                                                            if (c99 != '[') {
                                                                                                if (c99 == '|') {
                                                                                                    c123 = '|';
                                                                                                    z11 = c99 != c123;
                                                                                                    cArr2 = cArr;
                                                                                                    c32 = c94;
                                                                                                    c30 = c95;
                                                                                                    c33 = c67;
                                                                                                    c34 = c26;
                                                                                                    c29 = c97;
                                                                                                    c43 = c153;
                                                                                                    c38 = c68;
                                                                                                    str = null;
                                                                                                    c28 = '0';
                                                                                                    c41 = c156;
                                                                                                    c42 = c155;
                                                                                                    c36 = c65;
                                                                                                    c40 = c64;
                                                                                                    c44 = c74;
                                                                                                    c35 = c89;
                                                                                                    c37 = c88;
                                                                                                    c49 = c84;
                                                                                                    c48 = c96;
                                                                                                    c46 = c98;
                                                                                                    c47 = c100;
                                                                                                    c31 = c93;
                                                                                                    c45 = c92;
                                                                                                    i13 = 28;
                                                                                                    z9 = z11;
                                                                                                    c50 = c60;
                                                                                                    c39 = c91;
                                                                                                    z10 = false;
                                                                                                } else if (c99 != '+') {
                                                                                                    if (c99 != '-') {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c99 = c19;
                                                                                            c100 = c187;
                                                                                        }
                                                                                        c123 = '|';
                                                                                        if (c99 != c123) {
                                                                                        }
                                                                                        cArr2 = cArr;
                                                                                        c32 = c94;
                                                                                        c30 = c95;
                                                                                        c33 = c67;
                                                                                        c34 = c26;
                                                                                        c29 = c97;
                                                                                        c43 = c153;
                                                                                        c38 = c68;
                                                                                        str = null;
                                                                                        c28 = '0';
                                                                                        c41 = c156;
                                                                                        c42 = c155;
                                                                                        c36 = c65;
                                                                                        c40 = c64;
                                                                                        c44 = c74;
                                                                                        c35 = c89;
                                                                                        c37 = c88;
                                                                                        c49 = c84;
                                                                                        c48 = c96;
                                                                                        c46 = c98;
                                                                                        c47 = c100;
                                                                                        c31 = c93;
                                                                                        c45 = c92;
                                                                                        i13 = 28;
                                                                                        z9 = z11;
                                                                                        c50 = c60;
                                                                                        c39 = c91;
                                                                                        z10 = false;
                                                                                    } else {
                                                                                        c99 = c19;
                                                                                        c100 = c187;
                                                                                    }
                                                                                    char c195 = c99;
                                                                                    if (i12 != 28) {
                                                                                        c101 = c92;
                                                                                        if (c101 == ' ' && c63 == ' ' && c72 == ' ' && c87 == ':' && c85 == ':' && c86 == ' ' && c67 == ' ') {
                                                                                            int iMonth10 = month(c70, c74, c153);
                                                                                            if (iMonth10 > 0) {
                                                                                                c121 = (char) ((iMonth10 / 10) + 48);
                                                                                                c122 = (char) ((iMonth10 % 10) + 48);
                                                                                            } else {
                                                                                                c121 = '0';
                                                                                                c122 = '0';
                                                                                            }
                                                                                            c48 = c94;
                                                                                            c44 = c121;
                                                                                            c46 = c95;
                                                                                            c50 = c60;
                                                                                            c43 = c122;
                                                                                            c45 = c97;
                                                                                            cArr2 = cArr;
                                                                                            c38 = c68;
                                                                                            c36 = '0';
                                                                                            c35 = '0';
                                                                                            c34 = '0';
                                                                                            c33 = '0';
                                                                                            c32 = '0';
                                                                                            c31 = '0';
                                                                                            c30 = '0';
                                                                                            c29 = '0';
                                                                                            c28 = '0';
                                                                                            c41 = c156;
                                                                                            c42 = c155;
                                                                                            c40 = c64;
                                                                                            c37 = c88;
                                                                                            c49 = c84;
                                                                                            c39 = c91;
                                                                                            c47 = c93;
                                                                                            z9 = false;
                                                                                            i13 = 19;
                                                                                            str = new String(cArr, i9 + 20, 3);
                                                                                        }
                                                                                        z10 = false;
                                                                                    } else {
                                                                                        c101 = c92;
                                                                                    }
                                                                                    cArr2 = cArr;
                                                                                    char c196 = c97;
                                                                                    if (i12 != 28 && c101 == ',' && c70 == ' ' && c153 == ' ' && c72 == ' ') {
                                                                                        c104 = c60;
                                                                                        c105 = c91;
                                                                                        if (c105 == ' ') {
                                                                                            char c197 = c88;
                                                                                            c107 = c95;
                                                                                            if (c197 == ':') {
                                                                                                c106 = c197;
                                                                                                char c198 = c89;
                                                                                                if (c198 == ':' && c94 == ' ') {
                                                                                                    int iMonth11 = month(c63, c155, c156);
                                                                                                    if (iMonth11 > 0) {
                                                                                                        c120 = (char) ((iMonth11 / 10) + 48);
                                                                                                        c119 = (char) ((iMonth11 % 10) + 48);
                                                                                                    } else {
                                                                                                        c119 = '0';
                                                                                                        c120 = '0';
                                                                                                    }
                                                                                                    c43 = c119;
                                                                                                    c44 = c120;
                                                                                                    c40 = c86;
                                                                                                    c37 = c67;
                                                                                                    c38 = c26;
                                                                                                    c49 = c85;
                                                                                                    c46 = c87;
                                                                                                    c50 = c68;
                                                                                                    str = null;
                                                                                                    c42 = '0';
                                                                                                    c36 = '0';
                                                                                                    c35 = '0';
                                                                                                    c34 = '0';
                                                                                                    c33 = '0';
                                                                                                    c32 = '0';
                                                                                                    c31 = '0';
                                                                                                    c30 = '0';
                                                                                                    c29 = '0';
                                                                                                    c28 = '0';
                                                                                                    c39 = c65;
                                                                                                    c45 = c64;
                                                                                                    c41 = c74;
                                                                                                    z9 = true;
                                                                                                    c48 = c84;
                                                                                                    c47 = c104;
                                                                                                    z10 = false;
                                                                                                    i13 = 24;
                                                                                                } else {
                                                                                                    c102 = c94;
                                                                                                    c103 = c156;
                                                                                                    c108 = c155;
                                                                                                    c89 = c198;
                                                                                                    if (i12 != 29 && c101 == ',' && c70 == ' ' && c63 == ' ') {
                                                                                                        c109 = c101;
                                                                                                        c110 = c84;
                                                                                                        if (c110 == ' ' && c85 == ' ' && c86 == ':' && c26 == ':') {
                                                                                                            c112 = c67;
                                                                                                            c111 = c93;
                                                                                                            if (c111 == ' ') {
                                                                                                                int iMonth12 = month(c108, c103, c72);
                                                                                                                if (iMonth12 > 0) {
                                                                                                                    c117 = (char) ((iMonth12 / 10) + 48);
                                                                                                                    c118 = (char) ((iMonth12 % 10) + 48);
                                                                                                                } else {
                                                                                                                    c117 = '0';
                                                                                                                    c118 = '0';
                                                                                                                }
                                                                                                                c44 = c117;
                                                                                                                c45 = c105;
                                                                                                                c43 = c118;
                                                                                                                c47 = c87;
                                                                                                                c41 = c153;
                                                                                                                c49 = c68;
                                                                                                                str = null;
                                                                                                                c36 = '0';
                                                                                                                c35 = '0';
                                                                                                                c34 = '0';
                                                                                                                c33 = '0';
                                                                                                                c32 = '0';
                                                                                                                c31 = '0';
                                                                                                                c30 = '0';
                                                                                                                c29 = '0';
                                                                                                                c28 = '0';
                                                                                                                c37 = c102;
                                                                                                                c40 = c65;
                                                                                                                c46 = c64;
                                                                                                                c42 = c74;
                                                                                                                c39 = c89;
                                                                                                                z9 = true;
                                                                                                                c38 = c112;
                                                                                                                c48 = c104;
                                                                                                                c50 = c106;
                                                                                                                z10 = false;
                                                                                                                i13 = 25;
                                                                                                            }
                                                                                                        } else {
                                                                                                            c112 = c67;
                                                                                                            c111 = c93;
                                                                                                        }
                                                                                                    } else {
                                                                                                        c109 = c101;
                                                                                                        c110 = c84;
                                                                                                        c111 = c93;
                                                                                                        c112 = c67;
                                                                                                    }
                                                                                                    if (c70 != '-' && c63 == '-' && ((c72 == ' ' || c72 == 'T') && c87 == ':' && c85 == ':' && c86 == '.')) {
                                                                                                        if (i12 != 29) {
                                                                                                            c113 = c70;
                                                                                                            c115 = c21;
                                                                                                            if (c115 != '[') {
                                                                                                                if (c115 == '|') {
                                                                                                                    c116 = '|';
                                                                                                                    boolean z13 = c115 != c116;
                                                                                                                    c41 = c103;
                                                                                                                    c42 = c108;
                                                                                                                    c34 = c26;
                                                                                                                    c31 = c111;
                                                                                                                    c43 = c153;
                                                                                                                    c49 = c110;
                                                                                                                    c38 = c68;
                                                                                                                    str = null;
                                                                                                                    c32 = c102;
                                                                                                                    c36 = c65;
                                                                                                                    c40 = c64;
                                                                                                                    c29 = c196;
                                                                                                                    c35 = c89;
                                                                                                                    c30 = c107;
                                                                                                                    c33 = c112;
                                                                                                                    c50 = c104;
                                                                                                                    c37 = c106;
                                                                                                                    c48 = c96;
                                                                                                                    c46 = c98;
                                                                                                                    c47 = c100;
                                                                                                                    c28 = c195;
                                                                                                                    c45 = c109;
                                                                                                                    i13 = 29;
                                                                                                                    z9 = z13;
                                                                                                                    c39 = c105;
                                                                                                                    c44 = c74;
                                                                                                                    z10 = false;
                                                                                                                } else if (c115 != '+') {
                                                                                                                    if (c115 != '-') {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            c115 = c21;
                                                                                                        }
                                                                                                        c116 = '|';
                                                                                                        if (c115 != c116) {
                                                                                                        }
                                                                                                        c41 = c103;
                                                                                                        c42 = c108;
                                                                                                        c34 = c26;
                                                                                                        c31 = c111;
                                                                                                        c43 = c153;
                                                                                                        c49 = c110;
                                                                                                        c38 = c68;
                                                                                                        str = null;
                                                                                                        c32 = c102;
                                                                                                        c36 = c65;
                                                                                                        c40 = c64;
                                                                                                        c29 = c196;
                                                                                                        c35 = c89;
                                                                                                        c30 = c107;
                                                                                                        c33 = c112;
                                                                                                        c50 = c104;
                                                                                                        c37 = c106;
                                                                                                        c48 = c96;
                                                                                                        c46 = c98;
                                                                                                        c47 = c100;
                                                                                                        c28 = c195;
                                                                                                        c45 = c109;
                                                                                                        i13 = 29;
                                                                                                        z9 = z13;
                                                                                                        c39 = c105;
                                                                                                        c44 = c74;
                                                                                                        z10 = false;
                                                                                                    } else {
                                                                                                        c113 = c70;
                                                                                                    }
                                                                                                    if (i12 != 22) {
                                                                                                        c114 = c68;
                                                                                                        if (c114 == '+' || c114 == '-') {
                                                                                                            c41 = c63;
                                                                                                            c50 = c103;
                                                                                                            c49 = c108;
                                                                                                            c35 = c105;
                                                                                                            c40 = c72;
                                                                                                            c34 = c85;
                                                                                                            c37 = c87;
                                                                                                            c42 = c153;
                                                                                                            str = null;
                                                                                                            c33 = '0';
                                                                                                            c32 = '0';
                                                                                                            c31 = '0';
                                                                                                            c30 = '0';
                                                                                                            c29 = '0';
                                                                                                            c28 = '0';
                                                                                                            c36 = c64;
                                                                                                            c43 = c74;
                                                                                                            c38 = c104;
                                                                                                            c48 = c96;
                                                                                                            c46 = c98;
                                                                                                            c47 = c100;
                                                                                                            c44 = c113;
                                                                                                            c45 = c109;
                                                                                                            z10 = false;
                                                                                                            z9 = false;
                                                                                                            i13 = 17;
                                                                                                            c39 = c110;
                                                                                                        }
                                                                                                    } else {
                                                                                                        c114 = c68;
                                                                                                    }
                                                                                                    if ((i12 != 32 && c153 == ',' && c63 == ' ' && c72 == '-' && c64 == '-' && c86 == ' ' && c26 == ':' && c111 == ':' && cArr[i9 + 28] == ' ') || ((i12 == 33 && c63 == ',' && c108 == ' ' && c110 == '-' && c105 == '-' && c65 == ' ' && c112 == ':' && c107 == ':' && cArr[i9 + 29] == ' ') || ((i12 == 34 && c108 == ',' && c103 == ' ' && c104 == '-' && c85 == '-' && c89 == ' ' && c102 == ':' && c196 == ':' && cArr[i9 + 30] == ' ') || (i12 == 35 && c103 == ',' && c72 == ' ' && c87 == '-' && c114 == '-' && c26 == ' ' && c111 == ':' && c195 == ':' && cArr[i9 + 31] == ' ')))) {
                                                                                                        return parseZonedDateTimeCookie(new String(cArr, i9, i12));
                                                                                                    }
                                                                                                    if (i12 == 34) {
                                                                                                        DateTimeFormatter dateTimeFormatterOfPattern = DATE_TIME_FORMATTER_34;
                                                                                                        if (dateTimeFormatterOfPattern == null) {
                                                                                                            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss O yyyy", Locale.ENGLISH);
                                                                                                            DATE_TIME_FORMATTER_34 = dateTimeFormatterOfPattern;
                                                                                                        }
                                                                                                        return ZonedDateTime.parse(new String(cArr, i9, i12), dateTimeFormatterOfPattern);
                                                                                                    }
                                                                                                    if (i12 != 31 || c109 != ',') {
                                                                                                        return null;
                                                                                                    }
                                                                                                    DateTimeFormatter dateTimeFormatterOfPattern2 = DATE_TIME_FORMATTER_RFC_2822;
                                                                                                    if (dateTimeFormatterOfPattern2 == null) {
                                                                                                        dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
                                                                                                        DATE_TIME_FORMATTER_RFC_2822 = dateTimeFormatterOfPattern2;
                                                                                                    }
                                                                                                    return ZonedDateTime.parse(new String(cArr, i9, i12), dateTimeFormatterOfPattern2);
                                                                                                }
                                                                                            } else {
                                                                                                c102 = c94;
                                                                                                c103 = c156;
                                                                                                c106 = c197;
                                                                                                c108 = c155;
                                                                                                if (i12 != 29) {
                                                                                                    c109 = c101;
                                                                                                    c110 = c84;
                                                                                                    c111 = c93;
                                                                                                    c112 = c67;
                                                                                                    if (c70 != '-') {
                                                                                                        c113 = c70;
                                                                                                        if (i12 != 22) {
                                                                                                        }
                                                                                                        if (i12 != 32) {
                                                                                                            if (i12 == 34) {
                                                                                                            }
                                                                                                        } else if (i12 == 34) {
                                                                                                        }
                                                                                                        return parseZonedDateTimeCookie(new String(cArr, i9, i12));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c102 = c94;
                                                                                            c103 = c156;
                                                                                        }
                                                                                    } else {
                                                                                        c102 = c94;
                                                                                        c103 = c156;
                                                                                        c104 = c60;
                                                                                        c105 = c91;
                                                                                    }
                                                                                    c106 = c88;
                                                                                    c107 = c95;
                                                                                    c108 = c155;
                                                                                    if (i12 != 29) {
                                                                                    }
                                                                                } else {
                                                                                    c92 = c82;
                                                                                    c93 = c90;
                                                                                }
                                                                                c94 = c81;
                                                                                if (c70 != '-') {
                                                                                    c95 = c17;
                                                                                    c96 = c188;
                                                                                    if (c70 != '-') {
                                                                                        c97 = c18;
                                                                                        c98 = c190;
                                                                                        if (c70 != '-') {
                                                                                            c99 = c19;
                                                                                            c100 = c187;
                                                                                            char c1952 = c99;
                                                                                            if (i12 != 28) {
                                                                                            }
                                                                                            cArr2 = cArr;
                                                                                            char c1962 = c97;
                                                                                            if (i12 != 28) {
                                                                                                c102 = c94;
                                                                                                c103 = c156;
                                                                                                c104 = c60;
                                                                                                c105 = c91;
                                                                                                c106 = c88;
                                                                                                c107 = c95;
                                                                                                c108 = c155;
                                                                                                if (i12 != 29) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c86 = c79;
                                                                            }
                                                                        } else {
                                                                            c84 = c83;
                                                                            c85 = c189;
                                                                            c86 = c79;
                                                                            c87 = c191;
                                                                        }
                                                                        c88 = c66;
                                                                        c89 = c25;
                                                                        c90 = c16;
                                                                        i12 = i10;
                                                                        c91 = c62;
                                                                        if (i12 == 25) {
                                                                        }
                                                                        c94 = c81;
                                                                        if (c70 != '-') {
                                                                        }
                                                                    }
                                                                } else {
                                                                    c74 = c192;
                                                                }
                                                            }
                                                            c83 = c69;
                                                            if (c70 == '-') {
                                                                c84 = c83;
                                                                c85 = c189;
                                                                c86 = c79;
                                                                c87 = c191;
                                                                c88 = c66;
                                                                c89 = c25;
                                                                c90 = c16;
                                                                i12 = i10;
                                                                c91 = c62;
                                                                if (i12 == 25) {
                                                                }
                                                                c94 = c81;
                                                                if (c70 != '-') {
                                                                }
                                                            }
                                                        } else {
                                                            c71 = c55;
                                                            c73 = c163;
                                                            c76 = c57;
                                                            c77 = c149;
                                                            c75 = c181;
                                                        }
                                                    } else {
                                                        c71 = c55;
                                                        c72 = c59;
                                                        c73 = c163;
                                                        c74 = c152;
                                                        c75 = c181;
                                                        c76 = c57;
                                                        c77 = c149;
                                                    }
                                                    c78 = c54;
                                                    if (c70 == '-') {
                                                        c79 = c78;
                                                        c80 = c15;
                                                        if (i10 == 24) {
                                                            c81 = c80;
                                                            char c1872 = c75;
                                                            char c1882 = c71;
                                                            char c1892 = c73;
                                                            char c1902 = c77;
                                                            char c1912 = c76;
                                                            if (i10 == 24) {
                                                                c82 = c150;
                                                                c83 = c69;
                                                                if (c70 == '-') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        c69 = c158;
                                        c70 = c51;
                                        if (c70 == '-') {
                                            c71 = c55;
                                            c72 = c59;
                                            c73 = c163;
                                            c74 = c152;
                                            c75 = c181;
                                            c76 = c57;
                                            c77 = c149;
                                            c78 = c54;
                                            if (c70 == '-') {
                                            }
                                        }
                                    } else {
                                        c64 = c56;
                                        c66 = c165;
                                        c62 = c162;
                                        c65 = c53;
                                    }
                                    c68 = c164;
                                    c67 = c14;
                                    c69 = c158;
                                    c70 = c51;
                                    if (c70 == '-') {
                                    }
                                } else {
                                    c62 = c162;
                                    c63 = c61;
                                    c64 = c56;
                                    c65 = c53;
                                    c66 = c165;
                                }
                                c67 = c14;
                                c68 = c164;
                                c69 = c158;
                                c70 = c51;
                                if (c70 == '-') {
                                }
                            }
                        } else {
                            c51 = c151;
                        }
                        c52 = c10;
                        c53 = c20;
                        char c1812 = c11;
                        char c1822 = c52;
                        if (i10 != 22) {
                            c54 = c166;
                            if (i10 != 23) {
                            }
                        }
                    }
                }
            }
            if (z10 && c49 == '1' && c50 == '2') {
                z10 = false;
            }
            if (z10) {
                int iHourAfterNoon = hourAfterNoon(c49, c50);
                c49 = (char) (iHourAfterNoon >> 16);
                c50 = (char) ((short) iHourAfterNoon);
            }
            LocalDateTime localDateTime = localDateTime(c48, c47, c46, c45, c44, c43, c42, c41, c49, c50, c40, c39, c38, c37, c36, c35, c34, c33, c32, c31, c30, c29, c28);
            if (localDateTime == null) {
                return null;
            }
            if (z9) {
                String str2 = new String(cArr2, i13, i12 - i13);
                if (!str2.equals("UTC") && !str2.equals("[UTC]")) {
                    zoneId3 = TimeZone.getTimeZone(str2).toZoneId();
                } else {
                    zoneId3 = ZoneOffset.UTC;
                }
            } else {
                if (i13 == i12) {
                    zoneId3 = zoneId;
                    zoneId2 = zoneId3;
                } else {
                    int i15 = i9 + i13;
                    char c199 = cArr2[i15];
                    if (c199 == 'Z') {
                        zoneId3 = ZoneOffset.UTC;
                    } else {
                        if (str == null) {
                            if (c199 == '+' || c199 == '-') {
                                str = new String(cArr2, i15, i12 - i13);
                            } else if (c199 == ' ') {
                                str = new String(cArr2, i15 + 1, (i12 - i13) - 1);
                            } else if (i13 < i12) {
                                str = new String(cArr2, i15 + 1, (i12 - i13) - 2);
                            }
                        }
                        zoneId2 = zoneId;
                        zoneId3 = getZoneId(str, zoneId2);
                    }
                }
                if (zoneId3 == null) {
                    zoneId3 = zoneId2;
                }
                if (zoneId3 == null) {
                    zoneId3 = DEFAULT_ZONE_ID;
                }
                return ZonedDateTime.ofLocal(localDateTime, zoneId3, null);
            }
            zoneId2 = zoneId;
            if (zoneId3 == null) {
            }
            if (zoneId3 == null) {
            }
            return ZonedDateTime.ofLocal(localDateTime, zoneId3, null);
        }
        String str3 = new String(cArr, i9, cArr.length - i9);
        throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
    }

    public static long millis(LocalDateTime localDateTime, ZoneId zoneId) {
        return millis(zoneId, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano());
    }

    public static long millis(LocalDateTime localDateTime) {
        return millis(null, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano());
    }

    public static LocalDate parseLocalDate8(char[] cArr, int i9) {
        if (i9 + 8 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        if (c14 == '-' && c16 == '-') {
            c14 = '0';
            c16 = '0';
        } else if (c11 == '/' && c13 == '/') {
            c13 = c17;
            c17 = c12;
            c11 = c15;
            c12 = c16;
            c16 = '0';
            c15 = c10;
            c10 = c14;
            c14 = '0';
        } else if (c11 == '-' && c15 == '-') {
            int iMonth = month(c12, c13, c14);
            if (iMonth <= 0) {
                return null;
            }
            c14 = (char) ((iMonth / 10) + 48);
            c13 = c17;
            c15 = (char) ((iMonth % 10) + 48);
            c17 = c10;
            c10 = '2';
            c12 = c16;
            c11 = '0';
            c16 = '0';
        }
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i10 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i11 = (c17 - '0') + ((c16 - '0') * 10);
                    if (iM6853z == 0 && i10 == 0 && i11 == 0) {
                        return null;
                    }
                    return LocalDate.of(iM6853z, i10, i11);
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime20(char[] cArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        int i10 = i9 + 19;
        if (i10 > cArr.length) {
            return null;
        }
        char c14 = cArr[i9];
        char c15 = cArr[i9 + 1];
        char c16 = cArr[i9 + 2];
        char c17 = cArr[i9 + 3];
        char c18 = cArr[i9 + 4];
        char c19 = cArr[i9 + 5];
        char c20 = cArr[i9 + 6];
        char c21 = cArr[i9 + 7];
        char c22 = cArr[i9 + 8];
        char c23 = cArr[i9 + 9];
        char c24 = cArr[i9 + 10];
        char c25 = cArr[i9 + 11];
        char c26 = cArr[i9 + 12];
        char c27 = cArr[i9 + 13];
        char c28 = cArr[i9 + 14];
        char c29 = cArr[i9 + 15];
        char c30 = cArr[i9 + 16];
        char c31 = cArr[i9 + 17];
        char c32 = cArr[i9 + 18];
        char c33 = cArr[i10];
        if (c16 != ' ' || c20 != ' ' || c25 != ' ' || c28 != ':' || c31 != ':') {
            return null;
        }
        int iMonth = month(c17, c18, c19);
        if (iMonth > 0) {
            c10 = c21;
            c11 = c22;
            c13 = (char) ((iMonth % 10) + 48);
            c12 = (char) ((iMonth / 10) + 48);
        } else {
            c10 = c21;
            c11 = c22;
            c12 = '0';
            c13 = '0';
        }
        return localDateTime(c10, c11, c23, c24, c12, c13, c14, c15, c26, c27, c29, c30, c32, c33);
    }

    public static LocalDateTime parseLocalDateTime(String str, int i9, int i10) {
        if (str == null || i10 == 0) {
            return null;
        }
        char[] cArr = new char[i10];
        str.getChars(i9, i9 + i10, cArr, 0);
        LocalDateTime localDateTime = parseLocalDateTime(cArr, i9, i10);
        if (localDateTime != null) {
            return localDateTime;
        }
        switch (str) {
            case "0000-0-00":
            case "0000-00-0":
            case "000000000000":
            case "00000000":
            case "":
            case "null":
            case "0000年00月00日":
            case "0000-00-00":
                return null;
            default:
                throw new DateTimeParseException(str, str, i9);
        }
    }

    public static LocalDateTime parseLocalDateTime(String str) {
        if (str == null) {
            return null;
        }
        return parseLocalDateTime(str, 0, str.length());
    }

    public static LocalDateTime parseLocalDateTime(byte[] bArr, int i9, int i10) {
        if (bArr == null || i10 == 0) {
            return null;
        }
        switch (i10) {
            case 4:
                if (bArr[i9] == 110 && bArr[i9 + 1] == 117 && bArr[i9 + 2] == 108 && bArr[i9 + 3] == 108) {
                    return null;
                }
                String str = new String(bArr, i9, i10);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            default:
                return parseLocalDateTimeX(bArr, i9, i10);
            case 8:
                LocalDate localDate8 = parseLocalDate8(bArr, i9);
                if (localDate8 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate8, LocalTime.MIN);
            case 9:
                LocalDate localDate9 = parseLocalDate9(bArr, i9);
                if (localDate9 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate9, LocalTime.MIN);
            case 10:
                LocalDate localDate10 = parseLocalDate10(bArr, i9);
                if (localDate10 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate10, LocalTime.MIN);
            case 11:
                return LocalDateTime.of(parseLocalDate11(bArr, i9), LocalTime.MIN);
            case 12:
                return parseLocalDateTime12(bArr, i9);
            case 14:
                return parseLocalDateTime14(bArr, i9);
            case 16:
                return parseLocalDateTime16(bArr, i9);
            case 17:
                return parseLocalDateTime17(bArr, i9);
            case 18:
                return parseLocalDateTime18(bArr, i9);
            case 19:
                return parseLocalDateTime19(bArr, i9);
            case 20:
                return parseLocalDateTime20(bArr, i9);
        }
    }

    public static LocalDate parseLocalDate11(byte[] bArr, int i9) {
        int iMonth;
        int iM6853z;
        int i10;
        int i11;
        if (i9 + 11 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i9];
        char c11 = (char) bArr[i9 + 1];
        char c12 = (char) bArr[i9 + 2];
        char c13 = (char) bArr[i9 + 3];
        char c14 = (char) bArr[i9 + 4];
        char c15 = (char) bArr[i9 + 5];
        char c16 = (char) bArr[i9 + 6];
        char c17 = (char) bArr[i9 + 7];
        char c18 = (char) bArr[i9 + 8];
        char c19 = (char) bArr[i9 + 9];
        char c20 = (char) bArr[i9 + 10];
        if (c14 == '-' && c17 == '-' && c20 == 'Z') {
            if (c10 >= '0') {
                iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
                if (c15 >= '0') {
                    i10 = (c16 - '0') + ((c15 - '0') * 10);
                    if (c18 >= '0') {
                        i11 = (c19 - '0') + ((c18 - '0') * 10);
                        if (iM6853z != 0) {
                        }
                        return LocalDate.of(iM6853z, i10, i11);
                    }
                }
            }
        } else if (c12 == ' ' && c16 == ' ' && (iMonth = month(c13, c14, c15)) > 0) {
            c15 = (char) ((iMonth / 10) + 48);
            c16 = (char) ((iMonth % 10) + 48);
            c13 = c20;
            c12 = c19;
            c19 = c11;
            c11 = c18;
            c18 = c10;
            c10 = c17;
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
                if (c15 >= '0' && c15 <= '9' && c16 >= '0' && c16 <= '9') {
                    i10 = (c16 - '0') + ((c15 - '0') * 10);
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        i11 = (c19 - '0') + ((c18 - '0') * 10);
                        if (iM6853z != 0 && i10 == 0 && i11 == 0) {
                            return null;
                        }
                        return LocalDate.of(iM6853z, i10, i11);
                    }
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime14(char[] cArr, int i9) {
        if (i9 + 14 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        char c22 = cArr[i9 + 12];
        char c23 = cArr[i9 + 13];
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i10 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i11 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        int i12 = (c19 - '0') + ((c18 - '0') * 10);
                        if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                            int i13 = (c21 - '0') + ((c20 - '0') * 10);
                            if (c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c23 - '0') + ((c22 - '0') * 10));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime26(char[] cArr, int i9) {
        if (i9 + 26 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        char c22 = cArr[i9 + 12];
        char c23 = cArr[i9 + 13];
        char c24 = cArr[i9 + 14];
        char c25 = cArr[i9 + 15];
        char c26 = cArr[i9 + 16];
        char c27 = cArr[i9 + 17];
        char c28 = cArr[i9 + 18];
        char c29 = cArr[i9 + 19];
        char c30 = cArr[i9 + 20];
        char c31 = cArr[i9 + 21];
        char c32 = cArr[i9 + 22];
        char c33 = cArr[i9 + 23];
        char c34 = cArr[i9 + 24];
        char c35 = cArr[i9 + 25];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, '0', '0', '0');
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime27(char[] cArr, int i9) {
        if (i9 + 27 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        char c22 = cArr[i9 + 12];
        char c23 = cArr[i9 + 13];
        char c24 = cArr[i9 + 14];
        char c25 = cArr[i9 + 15];
        char c26 = cArr[i9 + 16];
        char c27 = cArr[i9 + 17];
        char c28 = cArr[i9 + 18];
        char c29 = cArr[i9 + 19];
        char c30 = cArr[i9 + 20];
        char c31 = cArr[i9 + 21];
        char c32 = cArr[i9 + 22];
        char c33 = cArr[i9 + 23];
        char c34 = cArr[i9 + 24];
        char c35 = cArr[i9 + 25];
        char c36 = cArr[i9 + 26];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, c36, '0', '0');
        }
        return null;
    }

    public static String formatYMD10(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return formatYMD10(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    public static String formatYMD10(Date date) {
        if (date == null) {
            return null;
        }
        return formatYMD10(date.getTime(), DEFAULT_ZONE_ID);
    }

    public static String formatYMD10(int i9, int i10, int i11) {
        char[] cArr = new char[10];
        IOUtils.writeLocalDate(cArr, 0, i9, i10, i11);
        return new String(cArr);
    }

    public static LocalTime parseLocalTime18(char[] cArr, int i9) {
        if (i9 + 18 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        char c22 = cArr[i9 + 12];
        char c23 = cArr[i9 + 13];
        char c24 = cArr[i9 + 14];
        char c25 = cArr[i9 + 15];
        char c26 = cArr[i9 + 16];
        char c27 = cArr[i9 + 17];
        if (c12 == ':' && c15 == ':' && c18 == '.' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i10 = (c11 - '0') + ((c10 - '0') * 10);
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                int i11 = (c14 - '0') + ((c13 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i12 = (c17 - '0') + ((c16 - '0') * 10);
                    if (c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9' && c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9') {
                        return LocalTime.of(i10, i11, i12, (c27 - '0') + AbstractC3199a.m6853z(c26, 48, 10, AbstractC3199a.m6853z(c25, 48, 100, AbstractC3199a.m6853z(c24, 48, 1000, AbstractC3199a.m6853z(c23, 48, 10000, AbstractC3199a.m6853z(c22, 48, 100000, AbstractC3199a.m6853z(c21, 48, 1000000, AbstractC3199a.m6853z(c20, 48, 10000000, (c19 - '0') * 100000000))))))));
                    }
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime28(char[] cArr, int i9) {
        if (i9 + 28 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        char c22 = cArr[i9 + 12];
        char c23 = cArr[i9 + 13];
        char c24 = cArr[i9 + 14];
        char c25 = cArr[i9 + 15];
        char c26 = cArr[i9 + 16];
        char c27 = cArr[i9 + 17];
        char c28 = cArr[i9 + 18];
        char c29 = cArr[i9 + 19];
        char c30 = cArr[i9 + 20];
        char c31 = cArr[i9 + 21];
        char c32 = cArr[i9 + 22];
        char c33 = cArr[i9 + 23];
        char c34 = cArr[i9 + 24];
        char c35 = cArr[i9 + 25];
        char c36 = cArr[i9 + 26];
        char c37 = cArr[i9 + 27];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, c36, c37, '0');
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime29(char[] cArr, int i9) {
        if (i9 + 29 > cArr.length) {
            return null;
        }
        char c10 = cArr[i9];
        char c11 = cArr[i9 + 1];
        char c12 = cArr[i9 + 2];
        char c13 = cArr[i9 + 3];
        char c14 = cArr[i9 + 4];
        char c15 = cArr[i9 + 5];
        char c16 = cArr[i9 + 6];
        char c17 = cArr[i9 + 7];
        char c18 = cArr[i9 + 8];
        char c19 = cArr[i9 + 9];
        char c20 = cArr[i9 + 10];
        char c21 = cArr[i9 + 11];
        char c22 = cArr[i9 + 12];
        char c23 = cArr[i9 + 13];
        char c24 = cArr[i9 + 14];
        char c25 = cArr[i9 + 15];
        char c26 = cArr[i9 + 16];
        char c27 = cArr[i9 + 17];
        char c28 = cArr[i9 + 18];
        char c29 = cArr[i9 + 19];
        char c30 = cArr[i9 + 20];
        char c31 = cArr[i9 + 21];
        char c32 = cArr[i9 + 22];
        char c33 = cArr[i9 + 23];
        char c34 = cArr[i9 + 24];
        char c35 = cArr[i9 + 25];
        char c36 = cArr[i9 + 26];
        char c37 = cArr[i9 + 27];
        char c38 = cArr[i9 + 28];
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return localDateTime(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c30, c31, c32, c33, c34, c35, c36, c37, c38);
        }
        return null;
    }

    public static String formatYMD8(Date date) {
        if (date == null) {
            return null;
        }
        return formatYMD8(date.getTime(), DEFAULT_ZONE_ID);
    }

    public static String format(ZonedDateTime zonedDateTime, String str) {
        int year;
        int monthValue;
        int dayOfMonth;
        if (zonedDateTime == null) {
            return null;
        }
        year = zonedDateTime.getYear();
        monthValue = zonedDateTime.getMonthValue();
        dayOfMonth = zonedDateTime.getDayOfMonth();
        str.getClass();
        switch (str) {
            case "yyyy-MM-dd":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_DASH);
            case "yyyy/MM/dd":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
            case "yyyy-MM-dd HH:mm:ss":
                return format(year, monthValue, dayOfMonth, zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
            case "yyyy-MM-dd'T'HH:mm:ss":
            case "yyyy-MM-ddTHH:mm:ss":
                return format(year, monthValue, dayOfMonth, zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
            case "dd.MM.yyyy":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_DOT);
            default:
                return DateTimeFormatter.ofPattern(str).format(zonedDateTime);
        }
    }

    public static String formatYMD8(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        int i9 = year / 100;
        char[] cArr = new char[8];
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        int[] iArr = IOUtils.PACKED_DIGITS_UTF16;
        unsafe.putInt(cArr, j3, iArr[i9]);
        unsafe.putInt(cArr, 4 + j3, iArr[year - (i9 * 100)]);
        unsafe.putInt(cArr, 8 + j3, iArr[monthValue]);
        unsafe.putInt(cArr, j3 + 12, iArr[dayOfMonth]);
        return new String(cArr);
    }

    public static String formatYMDHMS19(Date date) {
        return formatYMDHMS19(date, DEFAULT_ZONE_ID);
    }

    public static String formatYMDHMS19(ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null) {
            return null;
        }
        return format(zonedDateTime.getYear(), zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String formatYMDHMS19(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        int year = localDateTime.getYear();
        int monthValue = localDateTime.getMonthValue();
        int dayOfMonth = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        char[] cArr = new char[19];
        IOUtils.writeLocalDate(cArr, 0, year, monthValue, dayOfMonth);
        cArr[10] = ' ';
        IOUtils.writeLocalTime(cArr, 11, hour, minute, second);
        return new String(cArr);
    }

    public static ZonedDateTime parseZonedDateTime16(char[] cArr, int i9, ZoneId zoneId) {
        if (i9 + 16 <= cArr.length) {
            char c10 = cArr[i9];
            char c11 = cArr[i9 + 1];
            char c12 = cArr[i9 + 2];
            char c13 = cArr[i9 + 3];
            char c14 = cArr[i9 + 4];
            char c15 = cArr[i9 + 5];
            char c16 = cArr[i9 + 6];
            char c17 = cArr[i9 + 7];
            char c18 = cArr[i9 + 8];
            char c19 = cArr[i9 + 9];
            int i10 = i9 + 10;
            char c20 = cArr[i10];
            char c21 = cArr[i9 + 13];
            if (c14 != '-' || c17 != '-' || ((c20 != '+' && c20 != '-') || c21 != ':')) {
                String str = new String(cArr, i9, 16);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
                if (c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9') {
                    String str2 = new String(cArr, i9, 16);
                    throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                }
                int i11 = (c16 - '0') + ((c15 - '0') * 10);
                if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                    int i12 = c19 - '0';
                    return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(iM6853z, i11, i12 + ((c18 - '0') * 10)), LocalTime.MIN), getZoneId(new String(cArr, i10, 6), zoneId));
                }
                String str3 = new String(cArr, i9, 16);
                throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
            }
            String str4 = new String(cArr, i9, 16);
            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
        }
        String str5 = new String(cArr, i9, cArr.length - i9);
        throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
    }

    public static LocalDateTime parseLocalDateTime19(String str, int i9) {
        int i10 = i9 + 19;
        if (i10 > str.length()) {
            return null;
        }
        char[] cArr = new char[19];
        str.getChars(i9, i10, cArr, 0);
        return parseLocalDateTime19(cArr, i9);
    }

    public static LocalDate parseLocalDate10(byte[] bArr, int i9) {
        int iMonth;
        char c10;
        char c11;
        char c12;
        if (i9 + 10 > bArr.length) {
            return null;
        }
        char c13 = (char) bArr[i9];
        char c14 = (char) bArr[i9 + 1];
        char c15 = (char) bArr[i9 + 2];
        char c16 = (char) bArr[i9 + 3];
        char c17 = (char) bArr[i9 + 4];
        char c18 = (char) bArr[i9 + 5];
        char c19 = (char) bArr[i9 + 6];
        char c20 = (char) bArr[i9 + 7];
        char c21 = (char) bArr[i9 + 8];
        char c22 = (char) bArr[i9 + 9];
        if ((c17 == '-' && c20 == '-') || (c17 == '/' && c20 == '/')) {
            c20 = c14;
            c12 = c16;
            c10 = c18;
            c11 = c19;
            c16 = c21;
        } else {
            if ((c15 == '.' && c18 == '.') || (c15 == '-' && c18 == '-')) {
                c11 = c17;
                c15 = c21;
                c12 = c22;
                c22 = c14;
                c10 = c16;
                c16 = c13;
            } else {
                if (c15 != '/' || c18 != '/') {
                    if (c14 == ' ' && c18 == ' ' && (iMonth = month(c15, c16, c17)) > 0) {
                        c10 = (char) ((iMonth / 10) + 48);
                        c11 = (char) ((iMonth % 10) + 48);
                        c12 = c22;
                        c22 = c13;
                        c13 = c19;
                        c15 = c21;
                        c16 = '0';
                    }
                    return null;
                }
                c12 = c22;
                c22 = c17;
                c11 = c14;
                c15 = c21;
                c10 = c13;
            }
            c13 = c19;
        }
        if (c13 >= '0' && c13 <= '9' && c20 >= '0' && c20 <= '9' && c15 >= '0' && c15 <= '9' && c12 >= '0' && c12 <= '9') {
            int iM6853z = (c12 - '0') + AbstractC3199a.m6853z(c15, 48, 10, AbstractC3199a.m6853z(c20, 48, 100, (c13 - '0') * 1000));
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                int i10 = (c11 - '0') + ((c10 - '0') * 10);
                if (c16 >= '0' && c16 <= '9' && c22 >= '0' && c22 <= '9') {
                    int i11 = (c22 - '0') + ((c16 - '0') * 10);
                    if (iM6853z == 0 && i10 == 0 && i11 == 0) {
                        return null;
                    }
                    return LocalDate.of(iM6853z, i10, i11);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDate parseLocalDate9(byte[] bArr, int i9) {
        char c10;
        char c11;
        if (i9 + 9 > bArr.length) {
            return null;
        }
        char c12 = (char) bArr[i9];
        char c13 = (char) bArr[i9 + 1];
        char c14 = (char) bArr[i9 + 2];
        char c15 = (char) bArr[i9 + 3];
        char c16 = (char) bArr[i9 + 4];
        char c17 = (char) bArr[i9 + 5];
        char c18 = (char) bArr[i9 + 6];
        char c19 = (char) bArr[i9 + 7];
        char c20 = (char) bArr[i9 + 8];
        if (c16 != '-' || c19 != '-') {
            if (c16 != '-' || c18 != '-') {
                if (c16 == '/' && c19 == '/') {
                    c10 = c14;
                    c14 = c17;
                    c19 = '0';
                    c11 = c15;
                    c15 = c18;
                } else {
                    if (c16 == '/' && c18 == '/') {
                        c11 = c15;
                        c15 = c17;
                        c10 = c14;
                    } else if (c13 != '.' || c16 != '.') {
                        if (c14 != '.' || c16 != '.') {
                            if (c13 == '-' && c16 == '-') {
                                c11 = c20;
                                c20 = c12;
                                c12 = c17;
                                c13 = c18;
                                c10 = c19;
                                c19 = '0';
                            } else {
                                if (c14 == '-' && c16 == '-') {
                                    c10 = c19;
                                    c14 = '0';
                                    c19 = c12;
                                    c12 = c17;
                                    c11 = c20;
                                    c20 = c13;
                                } else if (c14 == '-' && c18 == '-') {
                                    int iMonth = month(c15, c16, c17);
                                    if (iMonth <= 0) {
                                        return null;
                                    }
                                    c19 = c12;
                                    c12 = '2';
                                    c10 = c19;
                                    c15 = (char) ((iMonth % 10) + 48);
                                    c14 = (char) ((iMonth / 10) + 48);
                                    c11 = c20;
                                    c20 = c13;
                                    c13 = '0';
                                } else if (c13 == '/' && c16 == '/') {
                                    c11 = c20;
                                    c20 = c15;
                                    c15 = c12;
                                    c12 = c17;
                                    c13 = c18;
                                    c10 = c19;
                                    c19 = c14;
                                } else if (c14 == '/' && c16 == '/') {
                                    c14 = c12;
                                    c12 = c17;
                                    c10 = c19;
                                    c19 = '0';
                                    c11 = c20;
                                    c20 = c15;
                                    c15 = c13;
                                }
                                c13 = c18;
                            }
                        }
                    }
                    c14 = '0';
                }
                if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    int iM6853z = (c11 - '0') + AbstractC3199a.m6853z(c10, 48, 10, AbstractC3199a.m6853z(c13, 48, 100, (c12 - '0') * 1000));
                    if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                        int i10 = (c15 - '0') + ((c14 - '0') * 10);
                        if (c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9') {
                            int i11 = (c20 - '0') + ((c19 - '0') * 10);
                            if (iM6853z == 0 && i10 == 0 && i11 == 0) {
                                return null;
                            }
                            return LocalDate.of(iM6853z, i10, i11);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime19(char[] cArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        if (i9 + 19 > cArr.length) {
            return null;
        }
        char c18 = cArr[i9];
        char c19 = cArr[i9 + 1];
        char c20 = cArr[i9 + 2];
        char c21 = cArr[i9 + 3];
        char c22 = cArr[i9 + 4];
        char c23 = cArr[i9 + 5];
        char c24 = cArr[i9 + 6];
        char c25 = cArr[i9 + 7];
        char c26 = cArr[i9 + 8];
        char c27 = cArr[i9 + 9];
        char c28 = cArr[i9 + 10];
        char c29 = cArr[i9 + 11];
        char c30 = cArr[i9 + 12];
        char c31 = cArr[i9 + 13];
        char c32 = cArr[i9 + 14];
        char c33 = cArr[i9 + 15];
        char c34 = cArr[i9 + 16];
        char c35 = cArr[i9 + 17];
        char c36 = cArr[i9 + 18];
        if ((c22 == '-' && c25 == '-' && ((c28 == ' ' || c28 == 'T') && c31 == ':' && c34 == ':')) || (c22 == '/' && c25 == '/' && ((c28 == ' ' || c28 == 'T') && c31 == ':' && c34 == ':'))) {
            c14 = c18;
            c15 = c19;
            c16 = c20;
            c17 = c21;
            c12 = c23;
            c13 = c24;
            c11 = c26;
            c10 = c27;
        } else {
            if (c20 == '/' && c23 == '/' && ((c28 == ' ' || c28 == 'T') && c31 == ':' && c34 == ':')) {
                c11 = c18;
                c10 = c19;
            } else {
                if (c19 != ' ' || c23 != ' ' || c28 != ' ' || c31 != ':' || c34 != ':') {
                    return null;
                }
                int iMonth = month(c20, c21, c22);
                if (iMonth > 0) {
                    c22 = (char) ((iMonth % 10) + 48);
                    c21 = (char) ((iMonth / 10) + 48);
                } else {
                    c21 = '0';
                    c22 = '0';
                }
                c10 = c18;
                c11 = '0';
            }
            c12 = c21;
            c13 = c22;
            c14 = c24;
            c15 = c25;
            c16 = c26;
            c17 = c27;
        }
        return localDateTime(c14, c15, c16, c17, c12, c13, c11, c10, c29, c30, c32, c33, c35, c36);
    }

    public static String format(LocalDateTime localDateTime, String str) {
        int year;
        int monthValue;
        int dayOfMonth;
        if (localDateTime == null) {
            return null;
        }
        year = localDateTime.getYear();
        monthValue = localDateTime.getMonthValue();
        dayOfMonth = localDateTime.getDayOfMonth();
        str.getClass();
        switch (str) {
            case "yyyy-MM-dd":
                return formatYMD10(year, monthValue, dayOfMonth);
            case "yyyy/MM/dd":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
            case "yyyy-MM-dd HH:mm:ss":
                return format(year, monthValue, dayOfMonth, localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
            case "yyyy-MM-dd'T'HH:mm:ss":
            case "yyyy-MM-ddTHH:mm:ss":
                return format(year, monthValue, dayOfMonth, localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
            case "dd.MM.yyyy":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_DOT);
            default:
                return DateTimeFormatter.ofPattern(str).format(localDateTime);
        }
    }

    public static String formatYMDHMS19(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        char[] cArr = new char[19];
        IOUtils.writeLocalDate(cArr, 0, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArr[10] = ' ';
        IOUtils.writeLocalTime(cArr, 11, 0, 0, 0);
        return new String(cArr);
    }

    public static String format(LocalDate localDate, String str) {
        int year;
        int monthValue;
        int dayOfMonth;
        if (localDate == null) {
            return null;
        }
        year = localDate.getYear();
        monthValue = localDate.getMonthValue();
        dayOfMonth = localDate.getDayOfMonth();
        str.getClass();
        switch (str) {
            case "yyyy-MM-dd":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_DASH);
            case "yyyy/MM/dd":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
            case "yyyy-MM-dd HH:mm:ss":
                return format(year, monthValue, dayOfMonth, 0, 0, 0, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
            case "yyyy-MM-dd'T'HH:mm:ss":
            case "yyyy-MM-ddTHH:mm:ss":
                return format(year, monthValue, dayOfMonth, 0, 0, 0, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
            case "dd.MM.yyyy":
                return format(year, monthValue, dayOfMonth, DateTimeFormatPattern.DATE_FORMAT_10_DOT);
            default:
                return DateTimeFormatter.ofPattern(str).format(localDate);
        }
    }

    public static LocalDateTime parseLocalDateTime12(char[] cArr, int i9) {
        int i10 = i9 + 12;
        if (i10 <= cArr.length) {
            char c10 = cArr[i9];
            char c11 = cArr[i9 + 1];
            char c12 = cArr[i9 + 2];
            char c13 = cArr[i9 + 3];
            char c14 = cArr[i9 + 4];
            char c15 = cArr[i9 + 5];
            char c16 = cArr[i9 + 6];
            char c17 = cArr[i9 + 7];
            char c18 = cArr[i9 + 8];
            char c19 = cArr[i9 + 9];
            char c20 = cArr[i9 + 10];
            char c21 = cArr[i9 + 11];
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c12, 48, 10, AbstractC3199a.m6853z(c11, 48, 100, (c10 - '0') * 1000));
                if (c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9') {
                    String str = new String(cArr, i9, i10);
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                int i11 = (c15 - '0') + ((c14 - '0') * 10);
                if (c16 < '0' || c16 > '9' || c17 < '0' || c17 > '9') {
                    String str2 = new String(cArr, i9, i10);
                    throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                }
                int i12 = (c17 - '0') + ((c16 - '0') * 10);
                if (c18 < '0' || c18 > '9' || c19 < '0' || c19 > '9') {
                    String str3 = new String(cArr, i9, i10);
                    throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                }
                int i13 = (c19 - '0') + ((c18 - '0') * 10);
                if (c20 < '0' || c20 > '9' || c21 < '0' || c21 > '9') {
                    String str4 = new String(cArr, i9, i10);
                    throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                }
                int i14 = (c21 - '0') + ((c20 - '0') * 10);
                if (iM6853z == 0 && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
                    return null;
                }
                return LocalDateTime.of(iM6853z, i11, i12, i13, i14, 0);
            }
            char[] cArr2 = cArr;
            String str5 = new String(cArr2, i9, i10);
            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
        }
        String str6 = new String(cArr, i9, cArr.length - i9);
        throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
    }

    public static Date parseDate(String str, String str2) {
        return parseDate(str, str2, DEFAULT_ZONE_ID);
    }

    public static Date parseDate(String str) {
        long millis = parseMillis(str, DEFAULT_ZONE_ID);
        if (millis == 0) {
            return null;
        }
        return new Date(millis);
    }

    public static Date parseDate(String str, ZoneId zoneId) {
        long millis = parseMillis(str, zoneId);
        if (millis == 0) {
            return null;
        }
        return new Date(millis);
    }

    public static String format(int i9, int i10, int i11) {
        return format(i9, i10, i11, DateTimeFormatPattern.DATE_FORMAT_10_DASH);
    }

    public static String format(int i9, int i10, int i11, DateTimeFormatPattern dateTimeFormatPattern) {
        int i12 = i9 / 100;
        int i13 = i9 - (i12 * 100);
        char[] cArr = new char[10];
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            Unsafe unsafe = JDKUtils.UNSAFE;
            long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
            int[] iArr = IOUtils.PACKED_DIGITS_UTF16;
            unsafe.putInt(cArr, j3, iArr[i11]);
            cArr[2] = '.';
            unsafe.putInt(cArr, 6 + j3, iArr[i10]);
            cArr[5] = '.';
            unsafe.putInt(cArr, 12 + j3, iArr[i12]);
            unsafe.putInt(cArr, j3 + 16, iArr[i13]);
        } else {
            char c10 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH ? '-' : '/';
            Unsafe unsafe2 = JDKUtils.UNSAFE;
            long j4 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
            int[] iArr2 = IOUtils.PACKED_DIGITS_UTF16;
            unsafe2.putInt(cArr, j4, iArr2[i12]);
            unsafe2.putInt(cArr, 4 + j4, iArr2[i13]);
            cArr[4] = c10;
            unsafe2.putInt(cArr, 10 + j4, iArr2[i10]);
            cArr[7] = c10;
            unsafe2.putInt(cArr, j4 + 16, iArr2[i11]);
        }
        return new String(cArr);
    }

    public static String format(long j3) {
        return format(j3, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String format(Date date) {
        if (date == null) {
            return null;
        }
        return format(date.getTime(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String format(Date date, String str) {
        if (date == null) {
            return null;
        }
        if (str == null) {
            return format(date);
        }
        switch (str) {
            case "yyyyMMdd":
                return formatYMD8(date.getTime(), DEFAULT_ZONE_ID);
            case "yyyy-MM-dd":
                return formatYMD10(date.getTime(), DEFAULT_ZONE_ID);
            case "yyyy/MM/dd":
                return format(date.getTime(), DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
            case "yyyy-MM-dd HH:mm:ss":
                return format(date.getTime(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
            case "dd.MM.yyyy HH:mm:ss":
                return format(date.getTime(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT);
            case "yyyy-MM-dd'T'HH:mm:ss":
            case "yyyy-MM-ddTHH:mm:ss":
                return format(date.getTime(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
            case "dd.MM.yyyy":
                return format(date.getTime(), DateTimeFormatPattern.DATE_FORMAT_10_DOT);
            default:
                return DateTimeFormatter.ofPattern(str).format(Instant.ofEpochMilli(date.getTime()).atZone(DEFAULT_ZONE_ID));
        }
    }

    public static String format(int i9, int i10, int i11, int i12, int i13, int i14) {
        return format(i9, i10, i11, i12, i13, i14, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String format(int i9, int i10, int i11, int i12, int i13, int i14, DateTimeFormatPattern dateTimeFormatPattern) {
        int i15 = i9 / 100;
        int i16 = i9 - (i15 * 100);
        char[] cArr = new char[19];
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
            Unsafe unsafe = JDKUtils.UNSAFE;
            long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
            int[] iArr = IOUtils.PACKED_DIGITS_UTF16;
            unsafe.putInt(cArr, j3, iArr[i11]);
            cArr[2] = '.';
            unsafe.putInt(cArr, 6 + j3, iArr[i10]);
            cArr[5] = '.';
            unsafe.putInt(cArr, 12 + j3, iArr[i15]);
            unsafe.putInt(cArr, j3 + 16, iArr[i16]);
            cArr[10] = ' ';
        } else {
            char c10 = dateTimeFormatPattern != DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 'T' : ' ';
            char c11 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? '/' : '-';
            Unsafe unsafe2 = JDKUtils.UNSAFE;
            long j4 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
            int[] iArr2 = IOUtils.PACKED_DIGITS_UTF16;
            unsafe2.putInt(cArr, j4, iArr2[i15]);
            unsafe2.putInt(cArr, 4 + j4, iArr2[i16]);
            cArr[4] = c11;
            unsafe2.putInt(cArr, 10 + j4, iArr2[i10]);
            cArr[7] = c11;
            unsafe2.putInt(cArr, j4 + 16, iArr2[i11]);
            cArr[10] = c10;
        }
        IOUtils.writeLocalTime(cArr, 11, i12, i13, i14);
        return new String(cArr);
    }

    public static String toString(Date date) {
        return toString(date.getTime(), false, DEFAULT_ZONE_ID);
    }

    public static long parseMillis(String str, ZoneId zoneId) {
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        return parseMillis(charArray, 0, charArray.length, zoneId);
    }

    public static long parseMillis(byte[] bArr, int i9, int i10) {
        return parseMillis(bArr, i9, i10, StandardCharsets.UTF_8, DEFAULT_ZONE_ID);
    }

    public static long parseMillis(byte[] bArr, int i9, int i10, Charset charset) {
        return parseMillis(bArr, i9, i10, charset, DEFAULT_ZONE_ID);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public static long parseMillis(byte[] bArr, int i9, int i10, Charset charset, ZoneId zoneId) {
        int i11;
        char c10;
        ZoneId zoneId2 = zoneId;
        if (bArr == null || i10 == 0) {
            return 0L;
        }
        if (i10 == 4 && bArr[i9] == 110 && bArr[i9 + 1] == 117 && bArr[i9 + 2] == 108 && bArr[i9 + 3] == 108) {
            return 0L;
        }
        char c11 = (char) bArr[i9];
        if (c11 != '\"' || bArr[i10 - 1] != 34) {
            if (i10 == 19) {
                return parseMillis19(bArr, i9, zoneId2);
            }
            if (i10 <= 19 && (i10 != 16 || ((c10 = (char) bArr[i9 + 10]) != '+' && c10 != '-'))) {
                if ((c11 == '-' || (c11 >= '0' && c11 <= '9')) && IOUtils.isNumber(bArr, i9, i10)) {
                    long j3 = TypeUtils.parseLong(bArr, i9, i10);
                    if (i10 != 8 || j3 < 19700101 || j3 > 21000101) {
                        return j3;
                    }
                    int i12 = (int) j3;
                    int i13 = i12 / 10000;
                    int i14 = (i12 % 10000) / 100;
                    int i15 = i12 % 100;
                    if (i14 < 1 || i14 > 12) {
                        return j3;
                    }
                    if (i14 != 2) {
                        i11 = (i14 == 4 || i14 == 6 || i14 == 9 || i14 == 11) ? 30 : 31;
                    } else {
                        i11 = ((i13 & 3) != 0 || (i13 % 100 == 0 && i13 % 400 != 0)) ? 28 : 29;
                    }
                    return i15 <= i11 ? ZonedDateTime.ofLocal(LocalDateTime.of(i13, i14, i15, 0, 0, 0), zoneId2, null).toEpochSecond() * 1000 : j3;
                }
                if (((char) bArr[i10 - 1]) == 'Z') {
                    zoneId2 = ZoneOffset.UTC;
                }
                LocalDateTime localDateTime = parseLocalDateTime(bArr, i9, i10);
                if (localDateTime == null && bArr[i9] == 48 && bArr[i9 + 1] == 48 && bArr[i9 + 2] == 48 && bArr[i9 + 3] == 48 && bArr[i9 + 4] == 45 && bArr[i9 + 5] == 48 && bArr[i9 + 6] == 48 && bArr[i9 + 7] == 45 && bArr[i9 + 8] == 48 && bArr[i9 + 9] == 48) {
                    localDateTime = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
                }
                long epochSecond = ZonedDateTime.ofLocal(localDateTime, zoneId2, null).toEpochSecond();
                int nano = localDateTime.getNano();
                if (epochSecond < 0 && nano > 0) {
                    return (((epochSecond + 1) * 1000) + ((long) (nano / 1000000))) - 1000;
                }
                return (epochSecond * 1000) + ((long) (nano / 1000000));
            }
            ZonedDateTime zonedDateTime = parseZonedDateTime(bArr, i9, i10, zoneId2);
            if (zonedDateTime != null) {
                return zonedDateTime.toInstant().toEpochMilli();
            }
            String str = new String(bArr, i9, i10 - i9);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        JSONReader jSONReaderM1676of = JSONReader.m1676of(bArr, i9, i10, charset);
        try {
            long time = ((Date) ObjectReaderImplDate.INSTANCE.readObject(jSONReaderM1676of, null, null, 0L)).getTime();
            if (jSONReaderM1676of != null) {
                jSONReaderM1676of.close();
            }
            return time;
        } finally {
        }
    }

    public static long parseMillis(char[] cArr, int i9, int i10) {
        return parseMillis(cArr, i9, i10, DEFAULT_ZONE_ID);
    }

    public static long parseMillis(String str) {
        return parseMillis(str, DEFAULT_ZONE_ID);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime parseLocalDateTime16(char[] cArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        int iMonth;
        int iM6853z;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i9 + 16 > cArr.length) {
            return null;
        }
        char c14 = cArr[i9];
        char c15 = cArr[i9 + 1];
        char c16 = cArr[i9 + 2];
        char c17 = cArr[i9 + 3];
        char c18 = cArr[i9 + 4];
        char c19 = cArr[i9 + 5];
        char c20 = cArr[i9 + 6];
        char c21 = cArr[i9 + 7];
        char c22 = cArr[i9 + 8];
        char c23 = cArr[i9 + 9];
        char c24 = cArr[i9 + 10];
        char c25 = cArr[i9 + 11];
        char c26 = cArr[i9 + 12];
        char c27 = cArr[i9 + 13];
        char c28 = cArr[i9 + 14];
        char c29 = cArr[i9 + 15];
        if (c18 != '-' || c21 != '-' || ((c24 != 'T' && c24 != ' ') || c27 != ':')) {
            if (c22 != 'T' || c29 != 'Z') {
                if (c18 == '-' && c21 == '-') {
                    if (c24 != 'T') {
                        c10 = ' ';
                        if (c24 != ' ') {
                            if (c15 == c10) {
                                if (c27 != ':') {
                                }
                            }
                            if (c15 == c10) {
                                c18 = (char) ((iMonth / 10) + 48);
                                c19 = (char) ((iMonth % 10) + 48);
                                c28 = c29;
                                c12 = c20;
                                c15 = c21;
                                c16 = c22;
                                c17 = c23;
                                c24 = c25;
                                c26 = c27;
                                c23 = c14;
                                c13 = '0';
                                c20 = '0';
                                c11 = '0';
                            }
                        }
                        c25 = c11;
                        c27 = c25;
                    }
                    if (c26 == ':' && c28 == ':') {
                        c28 = c29;
                        c18 = c19;
                        c19 = c20;
                        c20 = c22;
                        c24 = c25;
                        c26 = c27;
                        c12 = c14;
                        c13 = '0';
                        c11 = '0';
                        c25 = c11;
                        c27 = c25;
                    }
                    c10 = ' ';
                    if (c15 == c10) {
                    }
                    if (c15 == c10) {
                    }
                } else {
                    c10 = ' ';
                    if (c15 == c10 && c19 == c10 && c24 == c10) {
                        if (c27 != ':') {
                            int iMonth2 = month(c16, c17, c18);
                            if (iMonth2 <= 0) {
                                return null;
                            }
                            c18 = (char) ((iMonth2 / 10) + 48);
                            c19 = (char) ((iMonth2 % 10) + 48);
                            c12 = c20;
                            c15 = c21;
                            c16 = c22;
                            c17 = c23;
                            c24 = c26;
                            c23 = c14;
                            c20 = '0';
                            c11 = '0';
                        } else {
                            c10 = ' ';
                        }
                    }
                    if (c15 == c10 && c19 == c10 && c24 == c10 && c26 == ':' && c28 == ':' && (iMonth = month(c16, c17, c18)) > 0) {
                        c18 = (char) ((iMonth / 10) + 48);
                        c19 = (char) ((iMonth % 10) + 48);
                        c28 = c29;
                        c12 = c20;
                        c15 = c21;
                        c16 = c22;
                        c17 = c23;
                        c24 = c25;
                        c26 = c27;
                        c23 = c14;
                        c13 = '0';
                        c20 = '0';
                        c11 = '0';
                        c25 = c11;
                        c27 = c25;
                    }
                }
                return null;
            }
            c13 = c25;
            c12 = c14;
            c25 = c23;
            c23 = c21;
            c11 = '0';
            if (c12 >= c11 && c12 <= '9' && c15 >= c11 && c15 <= '9' && c16 >= c11 && c16 <= '9' && c17 >= c11 && c17 <= '9') {
                iM6853z = (c17 - c11) + AbstractC3199a.m6853z(c16, c11, 10, AbstractC3199a.m6853z(c15, c11, 100, (c12 - c11) * 1000));
                if (c18 >= c11 && c18 <= '9' && c19 >= c11 && c19 <= '9') {
                    i10 = (c19 - c11) + ((c18 - c11) * 10);
                    if (c20 >= c11 && c20 <= '9' && c23 >= c11 && c23 <= '9') {
                        i11 = (c23 - c11) + ((c20 - c11) * 10);
                        if (c25 >= c11 && c25 <= '9' && c24 >= c11 && c24 <= '9') {
                            i12 = (c24 - c11) + ((c25 - c11) * 10);
                            if (c13 >= c11 && c13 <= '9' && c26 >= c11 && c26 <= '9') {
                                i13 = (c26 - c11) + ((c13 - c11) * 10);
                                if (c27 >= c11 && c27 <= '9' && c28 >= c11 && c28 <= '9') {
                                    return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c28 - c11) + ((c27 - c11) * 10));
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        c18 = c19;
        c19 = c20;
        c20 = c22;
        c24 = c26;
        c12 = c14;
        c11 = '0';
        c27 = c11;
        c26 = c29;
        c13 = c28;
        c28 = c27;
        if (c12 >= c11) {
            iM6853z = (c17 - c11) + AbstractC3199a.m6853z(c16, c11, 10, AbstractC3199a.m6853z(c15, c11, 100, (c12 - c11) * 1000));
            if (c18 >= c11) {
                i10 = (c19 - c11) + ((c18 - c11) * 10);
                if (c20 >= c11) {
                    i11 = (c23 - c11) + ((c20 - c11) * 10);
                    if (c25 >= c11) {
                        i12 = (c24 - c11) + ((c25 - c11) * 10);
                        if (c13 >= c11) {
                            i13 = (c26 - c11) + ((c13 - c11) * 10);
                            if (c27 >= c11) {
                                return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c28 - c11) + ((c27 - c11) * 10));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTimeX(char[] cArr, int i9, int i10) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        char c25;
        char c26;
        if (cArr == null || i10 == 0 || i10 < 21 || i10 > 29) {
            return null;
        }
        char c27 = cArr[i9];
        char c28 = cArr[i9 + 1];
        char c29 = cArr[i9 + 2];
        char c30 = cArr[i9 + 3];
        char c31 = cArr[i9 + 4];
        char c32 = cArr[i9 + 5];
        char c33 = cArr[i9 + 6];
        char c34 = cArr[i9 + 7];
        char c35 = cArr[i9 + 8];
        char c36 = cArr[i9 + 9];
        char c37 = cArr[i9 + 10];
        char c38 = cArr[i9 + 11];
        char c39 = cArr[i9 + 12];
        char c40 = cArr[i9 + 13];
        char c41 = cArr[i9 + 14];
        char c42 = cArr[i9 + 15];
        char c43 = cArr[i9 + 16];
        char c44 = cArr[i9 + 17];
        char c45 = cArr[i9 + 18];
        char c46 = cArr[i9 + 19];
        switch (i10) {
            case 21:
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c13 = '0';
                c14 = '0';
                c15 = '0';
                c16 = '0';
                c17 = '0';
                c18 = '0';
                c19 = c27;
                c20 = '0';
                c21 = cArr[i9 + 20];
                c22 = '0';
                break;
            case 22:
                c23 = cArr[i9 + 20];
                c24 = cArr[i9 + 21];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c15 = '0';
                c16 = '0';
                c17 = c16;
                c18 = c17;
                c19 = c27;
                c13 = c24;
                c20 = c18;
                c14 = c20;
                c21 = c23;
                c22 = c14;
                break;
            case 23:
                c23 = cArr[i9 + 20];
                c24 = cArr[i9 + 21];
                c15 = cArr[i9 + 22];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c16 = '0';
                c17 = c16;
                c18 = c17;
                c19 = c27;
                c13 = c24;
                c20 = c18;
                c14 = c20;
                c21 = c23;
                c22 = c14;
                break;
            case 24:
                char c47 = cArr[i9 + 20];
                char c48 = cArr[i9 + 21];
                c15 = cArr[i9 + 22];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c17 = '0';
                c18 = '0';
                c19 = c27;
                c13 = c48;
                c20 = cArr[i9 + 23];
                c14 = '0';
                c16 = '0';
                c21 = c47;
                c22 = '0';
                break;
            case 25:
                c25 = cArr[i9 + 20];
                char c49 = cArr[i9 + 21];
                c15 = cArr[i9 + 22];
                char c50 = cArr[i9 + 23];
                c26 = cArr[i9 + 24];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c18 = '0';
                c19 = c27;
                c13 = c49;
                c20 = c50;
                c14 = '0';
                c16 = '0';
                c21 = c25;
                c22 = c26;
                c17 = c16;
                break;
            case 26:
                char c51 = cArr[i9 + 20];
                char c52 = cArr[i9 + 21];
                c15 = cArr[i9 + 22];
                char c53 = cArr[i9 + 23];
                char c54 = cArr[i9 + 24];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c18 = '0';
                c13 = c52;
                c14 = cArr[i9 + 25];
                c19 = c27;
                c21 = c51;
                c20 = c53;
                c22 = c54;
                c16 = '0';
                c17 = c16;
                break;
            case 27:
                c25 = cArr[i9 + 20];
                char c55 = cArr[i9 + 21];
                c15 = cArr[i9 + 22];
                char c56 = cArr[i9 + 23];
                c26 = cArr[i9 + 24];
                char c57 = cArr[i9 + 25];
                c18 = cArr[i9 + 26];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c13 = c55;
                c14 = c57;
                c19 = c27;
                c20 = c56;
                c16 = '0';
                c21 = c25;
                c22 = c26;
                c17 = c16;
                break;
            case 28:
                char c58 = cArr[i9 + 20];
                char c59 = cArr[i9 + 21];
                c15 = cArr[i9 + 22];
                char c60 = cArr[i9 + 23];
                char c61 = cArr[i9 + 24];
                char c62 = cArr[i9 + 25];
                c18 = cArr[i9 + 26];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c13 = c59;
                c14 = c62;
                c19 = c27;
                c20 = c60;
                c16 = cArr[i9 + 27];
                c17 = '0';
                c21 = c58;
                c22 = c61;
                break;
            default:
                c21 = cArr[i9 + 20];
                char c63 = cArr[i9 + 21];
                char c64 = cArr[i9 + 22];
                char c65 = cArr[i9 + 23];
                char c66 = cArr[i9 + 24];
                char c67 = cArr[i9 + 25];
                char c68 = cArr[i9 + 26];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c13 = c63;
                c22 = c66;
                c16 = cArr[i9 + 27];
                c18 = c68;
                c19 = c27;
                c20 = c65;
                c15 = c64;
                c14 = c67;
                c17 = cArr[i9 + 28];
                break;
        }
        if (c31 == '-' && c34 == '-' && ((c37 == ' ' || c37 == 'T') && c40 == ':' && c43 == ':' && c46 == '.')) {
            return localDateTime(c19, c28, c29, c30, c32, c33, c35, c36, c38, c10, c41, c11, c44, c12, c21, c13, c15, c20, c22, c14, c18, c16, c17);
        }
        int i11 = i9 + i10;
        if (cArr[i11 - 15] != '-' || cArr[i11 - 12] != '-') {
            return null;
        }
        char c69 = cArr[i11 - 9];
        if ((c69 == ' ' || c69 == 'T') && cArr[i11 - 6] == ':' && cArr[i11 - 3] == ':') {
            return LocalDateTime.of(TypeUtils.parseInt(cArr, i9, i10 - 15), TypeUtils.parseInt(cArr, i11 - 14, 2), TypeUtils.parseInt(cArr, i11 - 11, 2), TypeUtils.parseInt(cArr, i11 - 8, 2), TypeUtils.parseInt(cArr, i11 - 5, 2), TypeUtils.parseInt(cArr, i11 - 2, 2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0290 A[PHI: r11
  0x0290: PHI (r11v3 char) = (r11v2 char), (r11v2 char), (r11v2 char), (r11v8 char) binds: [B:113:0x024c, B:114:0x024e, B:115:0x0250, B:125:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[PHI: r5
  0x00ae: PHI (r5v4 char) = (r5v3 char), (r5v3 char), (r5v32 char) binds: [B:16:0x0089, B:17:0x008b, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[PHI: r5
  0x00d3: PHI (r5v5 char) = (r5v4 char), (r5v4 char), (r5v27 char) binds: [B:27:0x00ae, B:28:0x00b0, B:34:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[PHI: r5
  0x00f8: PHI (r5v6 char) = (r5v5 char), (r5v5 char), (r5v22 char) binds: [B:38:0x00d3, B:39:0x00d5, B:45:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ae A[PHI: r4
  0x01ae: PHI (r4v3 char) = (r4v2 char), (r4v2 char), (r4v2 char), (r4v22 char) binds: [B:72:0x0166, B:73:0x0168, B:74:0x016a, B:84:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime parseLocalDateTime18(char[] cArr, int i9) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        if (i9 + 18 <= cArr.length) {
            char c20 = cArr[i9];
            char c21 = cArr[i9 + 1];
            char c22 = cArr[i9 + 2];
            char c23 = cArr[i9 + 3];
            char c24 = cArr[i9 + 4];
            char c25 = cArr[i9 + 5];
            char c26 = cArr[i9 + 6];
            char c27 = cArr[i9 + 7];
            char c28 = cArr[i9 + 8];
            char c29 = cArr[i9 + 9];
            char c30 = cArr[i9 + 10];
            char c31 = cArr[i9 + 11];
            char c32 = cArr[i9 + 12];
            char c33 = cArr[i9 + 13];
            char c34 = cArr[i9 + 14];
            char c35 = cArr[i9 + 15];
            char c36 = cArr[i9 + 16];
            String str = "illegal input ";
            char c37 = cArr[i9 + 17];
            char c38 = '-';
            if (c24 == '-' && c26 == '-') {
                if ((c29 == ' ' || c29 == 'T') && c32 == ':' && c35 == ':') {
                    c12 = c33;
                    c26 = c25;
                    c16 = c36;
                    c17 = c20;
                    c29 = c28;
                    c35 = c34;
                    c18 = c31;
                    c19 = '0';
                    c25 = '0';
                } else {
                    c38 = '-';
                    if (c24 == c38) {
                        if (c24 == c38) {
                        }
                    }
                }
            } else if (c24 == c38 || c27 != c38) {
                if (c24 == c38 && c27 == c38) {
                    if ((c30 == ' ' || c30 == 'T') && c32 == ':' && c35 == ':') {
                        c12 = c33;
                        c16 = c36;
                        c17 = c20;
                        c27 = c28;
                        c35 = c34;
                        c18 = c31;
                        c19 = '0';
                        c30 = '0';
                    } else {
                        c38 = '-';
                        if (c24 == c38) {
                            if (c24 == c38) {
                            }
                        }
                    }
                } else if (c24 == c38 && c27 == c38) {
                    if ((c30 == ' ' || c30 == 'T') && c33 == ':' && c35 == ':') {
                        c16 = c36;
                        c17 = c20;
                        c27 = c28;
                        c35 = c34;
                        c30 = c31;
                        c19 = '0';
                        c18 = c32;
                        c12 = '0';
                    } else {
                        c38 = '-';
                        if (c24 == c38) {
                            if (c21 != ' ') {
                                c10 = ' ';
                                if (c21 == ' ') {
                                    if (c21 == c10) {
                                    }
                                    if (c22 == c10) {
                                    }
                                }
                            }
                        }
                    }
                } else if (c24 == c38 && c27 == c38 && ((c30 == ' ' || c30 == 'T') && c33 == ':' && c36 == ':')) {
                    c18 = c32;
                    c17 = c20;
                    c27 = c28;
                    c12 = c34;
                    c30 = c31;
                    c19 = '0';
                    c16 = '0';
                } else if (c21 != ' ' && c25 == ' ' && c30 == ' ' && c32 == ':' && c35 == ':') {
                    int iMonth = month(c22, c23, c24);
                    if (iMonth > 0) {
                        c25 = (char) ((iMonth / 10) + 48);
                        c12 = c33;
                        c17 = c26;
                        c23 = c29;
                        c16 = c36;
                        c29 = c20;
                        c22 = c28;
                        c35 = c34;
                        c18 = c31;
                        c19 = '0';
                        c30 = '0';
                        c26 = (char) ((iMonth % 10) + 48);
                        c21 = c27;
                        c27 = '0';
                    } else {
                        String str2 = new String(cArr, i9, 18);
                        throw new DateTimeParseException(str.concat(str2), str2, 0);
                    }
                } else {
                    c10 = ' ';
                    if (c21 == ' ' || c25 != ' ' || c30 != ' ') {
                        if (c21 == c10 && c25 == c10 && c30 == c10) {
                            if (c33 == ':' || c36 != ':') {
                                c10 = ' ';
                            } else {
                                int iMonth2 = month(c22, c23, c24);
                                if (iMonth2 > 0) {
                                    c25 = (char) ((iMonth2 / 10) + 48);
                                    c26 = (char) ((iMonth2 % 10) + 48);
                                    c17 = c26;
                                    c21 = c27;
                                    c23 = c29;
                                    c29 = c20;
                                    c22 = c28;
                                    c12 = c34;
                                    c30 = c31;
                                    c18 = c32;
                                    c16 = '0';
                                    c27 = '0';
                                    str = str;
                                    c19 = c27;
                                } else {
                                    String str3 = new String(cArr, i9, 18);
                                    throw new DateTimeParseException(str.concat(str3), str3, 0);
                                }
                            }
                        }
                        if (c22 == c10 && c26 == c10) {
                            c11 = c21;
                            c13 = c31;
                            if (c13 == c10) {
                                c12 = c34;
                                c14 = c27;
                                if (c12 == ':' && c36 == ':') {
                                    int iMonth3 = month(c23, c24, c25);
                                    if (iMonth3 > 0) {
                                        c25 = (char) ((iMonth3 / 10) + 48);
                                        c18 = c33;
                                        c26 = (char) ((iMonth3 % 10) + 48);
                                        c22 = c29;
                                        c23 = c30;
                                        c27 = c20;
                                        c21 = c28;
                                        c17 = c14;
                                        c30 = c32;
                                        c29 = c11;
                                        c12 = '0';
                                        c16 = '0';
                                        str = str;
                                        c19 = '0';
                                    } else {
                                        String str4 = new String(cArr, i9, 18);
                                        throw new DateTimeParseException(str.concat(str4), str4, 0);
                                    }
                                } else {
                                    c15 = ' ';
                                    if (c22 == ' ' && c26 == ' ' && c13 == ' ') {
                                        if (c33 == ':' && c36 == ':') {
                                            int iMonth4 = month(c23, c24, c25);
                                            if (iMonth4 > 0) {
                                                c25 = (char) ((iMonth4 / 10) + 48);
                                                c26 = (char) ((iMonth4 % 10) + 48);
                                                c22 = c29;
                                                c23 = c30;
                                                c27 = c20;
                                                c21 = c28;
                                                c17 = c14;
                                                c18 = c32;
                                                c29 = c11;
                                                c16 = '0';
                                                c30 = '0';
                                                str = str;
                                                c19 = c30;
                                            } else {
                                                String str5 = new String(cArr, i9, 18);
                                                throw new DateTimeParseException(str.concat(str5), str5, 0);
                                            }
                                        } else {
                                            c15 = ' ';
                                            if (c22 != c15) {
                                            }
                                            String str6 = new String(cArr, i9, 18);
                                            throw new DateTimeParseException(str.concat(str6), str6, 0);
                                        }
                                    } else if (c22 != c15 && c26 == c15 && c13 == c15 && c33 == ':' && c35 == ':') {
                                        int iMonth5 = month(c23, c24, c25);
                                        if (iMonth5 > 0) {
                                            c25 = (char) ((iMonth5 / 10) + 48);
                                            c26 = (char) ((iMonth5 % 10) + 48);
                                            c35 = c12;
                                            c22 = c29;
                                            c23 = c30;
                                            c16 = c36;
                                            c27 = c20;
                                            c21 = c28;
                                            c17 = c14;
                                            c18 = c32;
                                            c29 = c11;
                                            c12 = '0';
                                            c30 = '0';
                                            str = str;
                                            c19 = c30;
                                        } else {
                                            String str7 = new String(cArr, i9, 18);
                                            throw new DateTimeParseException(str.concat(str7), str7, 0);
                                        }
                                    } else {
                                        String str62 = new String(cArr, i9, 18);
                                        throw new DateTimeParseException(str.concat(str62), str62, 0);
                                    }
                                }
                            } else {
                                c12 = c34;
                            }
                        } else {
                            c11 = c21;
                            c12 = c34;
                            c13 = c31;
                        }
                        c14 = c27;
                        c15 = ' ';
                        if (c22 == ' ') {
                            if (c22 != c15) {
                            }
                            String str622 = new String(cArr, i9, 18);
                            throw new DateTimeParseException(str.concat(str622), str622, 0);
                        }
                    } else if (c33 == ':' && c35 == ':') {
                        int iMonth6 = month(c22, c23, c24);
                        if (iMonth6 > 0) {
                            c25 = (char) ((iMonth6 / 10) + 48);
                            c26 = (char) ((iMonth6 % 10) + 48);
                            c17 = c26;
                            c21 = c27;
                            c23 = c29;
                            c16 = c36;
                            c29 = c20;
                            c22 = c28;
                            c35 = c34;
                            c30 = c31;
                            c18 = c32;
                            c12 = '0';
                            c27 = '0';
                            str = str;
                            c19 = c27;
                        } else {
                            String str8 = new String(cArr, i9, 18);
                            throw new DateTimeParseException(str.concat(str8), str8, 0);
                        }
                    } else {
                        c10 = ' ';
                        if (c21 == c10) {
                            if (c33 == ':') {
                            }
                            c10 = ' ';
                        }
                        if (c22 == c10) {
                            c11 = c21;
                            c12 = c34;
                            c13 = c31;
                            c14 = c27;
                            c15 = ' ';
                            if (c22 == ' ') {
                            }
                        }
                    }
                }
            } else if ((c29 == ' ' || c29 == 'T') && c32 == ':' && c35 == ':') {
                c12 = c33;
                c16 = c36;
                c17 = c20;
                c29 = c28;
                c35 = c34;
                c18 = c31;
                c19 = '0';
                c27 = '0';
            } else {
                c38 = '-';
                if (c24 == c38) {
                    if (c24 == c38) {
                    }
                }
            }
            if (c17 >= c19 && c17 <= '9' && c21 >= c19 && c21 <= '9' && c22 >= c19 && c22 <= '9' && c23 >= c19 && c23 <= '9') {
                int iM6853z = (c23 - c19) + AbstractC3199a.m6853z(c22, c19, 10, AbstractC3199a.m6853z(c21, c19, 100, (c17 - c19) * 1000));
                if (c25 < c19 || c25 > '9' || c26 < c19 || c26 > '9') {
                    String str9 = new String(cArr, i9, 18);
                    throw new DateTimeParseException(str.concat(str9), str9, 0);
                }
                int i10 = (c26 - c19) + ((c25 - c19) * 10);
                if (c27 < c19 || c27 > '9' || c29 < c19 || c29 > '9') {
                    String str10 = new String(cArr, i9, 18);
                    throw new DateTimeParseException(str.concat(str10), str10, 0);
                }
                int i11 = (c29 - c19) + ((c27 - c19) * 10);
                if (c30 < c19 || c30 > '9' || c18 < c19 || c18 > '9') {
                    String str11 = new String(cArr, i9, 18);
                    throw new DateTimeParseException(str.concat(str11), str11, 0);
                }
                int i12 = (c18 - c19) + ((c30 - c19) * 10);
                if (c12 < c19 || c12 > '9' || c35 < c19 || c35 > '9') {
                    String str12 = new String(cArr, i9, 18);
                    throw new DateTimeParseException(str.concat(str12), str12, 0);
                }
                int i13 = (c35 - c19) + ((c12 - c19) * 10);
                if (c16 >= c19 && c16 <= '9' && c37 >= c19 && c37 <= '9') {
                    return LocalDateTime.of(iM6853z, i10, i11, i12, i13, (c37 - '0') + ((c16 - c19) * 10));
                }
                String str13 = new String(cArr, i9, 18);
                throw new DateTimeParseException(str.concat(str13), str13, 0);
            }
            char[] cArr2 = cArr;
            String str14 = str;
            String str15 = new String(cArr2, i9, 18);
            throw new DateTimeParseException(str14.concat(str15), str15, 0);
        }
        String str16 = new String(cArr, i9, cArr.length - i9);
        throw new DateTimeParseException("illegal input ".concat(str16), str16, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        if (r1 == ':') goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[PHI: r15
  0x0138: PHI (r15v10 char) = (r15v9 char), (r15v9 char), (r15v9 char), (r15v22 char) binds: [B:45:0x00fb, B:46:0x00fd, B:47:0x00ff, B:56:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174 A[PHI: r15
  0x0174: PHI (r15v11 char) = (r15v10 char), (r15v10 char), (r15v10 char), (r15v19 char) binds: [B:57:0x0138, B:58:0x013a, B:59:0x013c, B:68:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af A[PHI: r15
  0x01af: PHI (r15v12 char) = (r15v11 char), (r15v11 char), (r15v11 char), (r15v16 char) binds: [B:69:0x0174, B:70:0x0176, B:71:0x0178, B:80:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parseMillis19(String str, ZoneId zoneId) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        int i9;
        int totalSeconds;
        str.getClass();
        if (str.length() == 19) {
            char cCharAt = str.charAt(0);
            char cCharAt2 = str.charAt(1);
            char cCharAt3 = str.charAt(2);
            char cCharAt4 = str.charAt(3);
            char cCharAt5 = str.charAt(4);
            char cCharAt6 = str.charAt(5);
            char cCharAt7 = str.charAt(6);
            char cCharAt8 = str.charAt(7);
            char cCharAt9 = str.charAt(8);
            char cCharAt10 = str.charAt(9);
            char cCharAt11 = str.charAt(10);
            char cCharAt12 = str.charAt(11);
            char cCharAt13 = str.charAt(12);
            char cCharAt14 = str.charAt(13);
            char cCharAt15 = str.charAt(14);
            char cCharAt16 = str.charAt(15);
            char cCharAt17 = str.charAt(16);
            char cCharAt18 = str.charAt(17);
            char cCharAt19 = str.charAt(18);
            if (cCharAt5 == '-' && cCharAt8 == '-' && ((cCharAt11 == ' ' || cCharAt11 == 'T') && cCharAt14 == ':' && cCharAt17 == ':')) {
                cCharAt8 = cCharAt2;
                c14 = cCharAt3;
                cCharAt11 = cCharAt4;
                cCharAt5 = cCharAt7;
                cCharAt2 = cCharAt10;
                c12 = cCharAt13;
                c13 = cCharAt;
                c19 = '0';
                c18 = cCharAt18;
                c15 = cCharAt12;
                c11 = cCharAt16;
                c17 = cCharAt15;
                c16 = cCharAt9;
            } else {
                char c20 = '/';
                if (cCharAt5 == '/' && cCharAt8 == '/') {
                    if ((cCharAt11 != ' ' && cCharAt11 != 'T') || cCharAt14 != ':' || cCharAt17 != ':') {
                        c20 = '/';
                    }
                    cCharAt8 = cCharAt2;
                    c14 = cCharAt3;
                    cCharAt11 = cCharAt4;
                    cCharAt5 = cCharAt7;
                    cCharAt2 = cCharAt10;
                    c12 = cCharAt13;
                    c13 = cCharAt;
                    c19 = '0';
                    c18 = cCharAt18;
                    c15 = cCharAt12;
                    c11 = cCharAt16;
                    c17 = cCharAt15;
                    c16 = cCharAt9;
                }
                if (cCharAt3 == c20 && cCharAt6 == c20 && cCharAt11 == ' ' && cCharAt14 == ':' && cCharAt17 == ':') {
                    c18 = cCharAt18;
                    cCharAt6 = cCharAt4;
                    c13 = cCharAt7;
                    cCharAt11 = cCharAt10;
                    c12 = cCharAt13;
                    c14 = cCharAt9;
                    c19 = '0';
                    c17 = cCharAt15;
                    c15 = cCharAt12;
                    c16 = cCharAt;
                    c11 = cCharAt16;
                } else if (cCharAt3 == '.' && cCharAt6 == '.') {
                    c10 = ' ';
                    if (cCharAt11 == ' ') {
                        if (cCharAt14 == ':') {
                        }
                        c10 = ' ';
                    }
                    if (cCharAt2 != c10) {
                        if (cCharAt3 == c10) {
                        }
                    }
                } else {
                    c10 = ' ';
                    if (cCharAt2 != c10 && cCharAt6 == c10 && cCharAt11 == c10) {
                        if (cCharAt14 == ':' && cCharAt17 == ':') {
                            int iMonth = month(cCharAt3, cCharAt4, cCharAt5);
                            if (iMonth > 0) {
                                cCharAt5 = (char) ((iMonth % 10) + 48);
                                c18 = cCharAt18;
                                cCharAt6 = (char) ((iMonth / 10) + 48);
                                c13 = cCharAt7;
                                cCharAt11 = cCharAt10;
                                c12 = cCharAt13;
                                cCharAt2 = cCharAt;
                                c14 = cCharAt9;
                                c19 = '0';
                                c17 = cCharAt15;
                                c15 = cCharAt12;
                                c11 = cCharAt16;
                                c16 = '0';
                            } else {
                                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                            }
                        } else {
                            c10 = ' ';
                            if (cCharAt3 == c10) {
                                if (cCharAt3 == c10) {
                                }
                            }
                        }
                    } else if (cCharAt3 == c10 && cCharAt7 == c10 && cCharAt12 == c10) {
                        if (cCharAt14 == ':' && cCharAt17 == ':') {
                            int iMonth2 = month(cCharAt4, cCharAt5, cCharAt6);
                            if (iMonth2 > 0) {
                                cCharAt5 = (char) ((iMonth2 % 10) + 48);
                                c18 = cCharAt18;
                                cCharAt6 = (char) ((iMonth2 / 10) + 48);
                                c13 = cCharAt8;
                                c14 = cCharAt10;
                                c12 = cCharAt13;
                                c11 = cCharAt16;
                                cCharAt8 = cCharAt9;
                                c15 = '0';
                                c19 = '0';
                                c17 = cCharAt15;
                                c16 = cCharAt;
                            } else {
                                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                            }
                        } else {
                            c10 = ' ';
                            if (cCharAt3 == c10) {
                                if (cCharAt3 != c10) {
                                }
                                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                            }
                        }
                    } else if (cCharAt3 == c10 && cCharAt7 == c10 && cCharAt12 == c10) {
                        if (cCharAt15 == ':' && cCharAt17 == ':') {
                            int iMonth3 = month(cCharAt4, cCharAt5, cCharAt6);
                            if (iMonth3 > 0) {
                                cCharAt5 = (char) ((iMonth3 % 10) + 48);
                                c18 = cCharAt18;
                                cCharAt6 = (char) ((iMonth3 / 10) + 48);
                                c12 = cCharAt14;
                                c13 = cCharAt8;
                                c14 = cCharAt10;
                                c15 = cCharAt13;
                                c16 = cCharAt;
                                c11 = cCharAt16;
                                cCharAt8 = cCharAt9;
                                c17 = '0';
                                c19 = '0';
                            } else {
                                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                            }
                        } else {
                            c10 = ' ';
                            if (cCharAt3 != c10) {
                            }
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                    } else if (cCharAt3 != c10 && cCharAt7 == c10 && cCharAt12 == c10 && cCharAt15 == ':' && cCharAt18 == ':') {
                        int iMonth4 = month(cCharAt4, cCharAt5, cCharAt6);
                        if (iMonth4 > 0) {
                            cCharAt5 = (char) ((iMonth4 % 10) + 48);
                            c11 = cCharAt17;
                            cCharAt6 = (char) ((iMonth4 / 10) + 48);
                            c12 = cCharAt14;
                            c13 = cCharAt8;
                            c14 = cCharAt10;
                            c15 = cCharAt13;
                            c16 = cCharAt;
                            c17 = cCharAt16;
                            cCharAt8 = cCharAt9;
                            c18 = '0';
                            c19 = '0';
                        } else {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                    } else {
                        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                    }
                }
            }
            if (c13 >= c19 && c13 <= '9' && cCharAt8 >= c19 && cCharAt8 <= '9' && c14 >= c19 && c14 <= '9' && cCharAt11 >= c19 && cCharAt11 <= '9') {
                int iM6853z = (cCharAt11 - c19) + AbstractC3199a.m6853z(c14, c19, 10, AbstractC3199a.m6853z(cCharAt8, c19, 100, (c13 - c19) * 1000));
                if (cCharAt6 < c19 || cCharAt6 > '9' || cCharAt5 < c19 || cCharAt5 > '9') {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                int i10 = (cCharAt5 - c19) + ((cCharAt6 - c19) * 10);
                if ((i10 == 0 && iM6853z != 0) || i10 > 12) {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                if (c16 < c19 || c16 > '9' || cCharAt2 < c19 || cCharAt2 > '9') {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                int i11 = (cCharAt2 - c19) + ((c16 - c19) * 10);
                if (i10 != 2) {
                    i9 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
                } else {
                    i9 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? 28 : 29;
                }
                if ((i11 == 0 && iM6853z != 0) || i11 > i9) {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                if (c15 < '0' || c15 > '9' || c12 < '0' || c12 > '9') {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                int i12 = (c12 - '0') + ((c15 - '0') * 10);
                if (c17 < '0' || c17 > '9' || c11 < '0' || c11 > '9') {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                int i13 = (c11 - '0') + ((c17 - '0') * 10);
                if (c18 >= '0' && c18 <= '9' && cCharAt19 >= '0' && cCharAt19 <= '9') {
                    int i14 = (cCharAt19 - '0') + ((c18 - '0') * 10);
                    if (iM6853z == 0 && i10 == 0 && i11 == 0) {
                        iM6853z = 1970;
                        i11 = 1;
                        i10 = 1;
                    }
                    long j3 = (i11 - 1) + (((i10 * 367) - 362) / 12) + ((iM6853z + 399) / 400) + (((iM6853z + 3) / 4) - ((iM6853z + 99) / 100)) + (iM6853z * 365);
                    if (i10 > 2) {
                        j3 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? j3 - 2 : j3 - 1;
                    }
                    long j4 = ((j3 - 719528) * 86400) + ((long) (i12 * 3600)) + ((long) (i13 * 60)) + ((long) i14);
                    ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
                    if (!(zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) || j4 < 684900000) {
                        totalSeconds = (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM6853z, i10, i11), LocalTime.of(i12, i13, i14, 0))).getTotalSeconds();
                    } else {
                        totalSeconds = 28800;
                    }
                    return (j4 - ((long) totalSeconds)) * 1000;
                }
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            String str2 = str;
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parseMillis19(String str, ZoneId zoneId, DateTimeFormatPattern dateTimeFormatPattern) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        String str2;
        int i9;
        int i10;
        int totalSeconds;
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (dateTimeFormatPattern.length == 19) {
            if (str.length() == 19) {
                char cCharAt = str.charAt(0);
                char cCharAt2 = str.charAt(1);
                char cCharAt3 = str.charAt(2);
                char cCharAt4 = str.charAt(3);
                char cCharAt5 = str.charAt(4);
                char cCharAt6 = str.charAt(5);
                char cCharAt7 = str.charAt(6);
                char cCharAt8 = str.charAt(7);
                char cCharAt9 = str.charAt(8);
                char cCharAt10 = str.charAt(9);
                char cCharAt11 = str.charAt(10);
                char cCharAt12 = str.charAt(11);
                char cCharAt13 = str.charAt(12);
                char cCharAt14 = str.charAt(13);
                char cCharAt15 = str.charAt(14);
                char cCharAt16 = str.charAt(15);
                char cCharAt17 = str.charAt(16);
                char cCharAt18 = str.charAt(17);
                char cCharAt19 = str.charAt(18);
                int i11 = C06361.f1978x8a2a5bbc[dateTimeFormatPattern.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new DateTimeParseException("illegal input", str, 0);
                            }
                            if (cCharAt3 != '.' || cCharAt6 != '.' || cCharAt11 != ' ' || cCharAt14 != ':' || cCharAt17 != ':') {
                                throw new DateTimeParseException("illegal input", str, 0);
                            }
                            c13 = cCharAt10;
                            c14 = cCharAt;
                            c11 = cCharAt2;
                            cCharAt6 = cCharAt4;
                            c12 = cCharAt7;
                            c10 = cCharAt9;
                            if (c12 >= '0') {
                                str2 = str;
                                i9 = 0;
                            } else {
                                if (c12 <= '9' && cCharAt8 >= '0' && cCharAt8 <= '9' && c10 >= '0' && c10 <= '9' && c13 >= '0' && c13 <= '9') {
                                    int iM6853z = (c13 - '0') + AbstractC3199a.m6853z(c10, 48, 10, AbstractC3199a.m6853z(cCharAt8, 48, 100, (c12 - '0') * 1000));
                                    if (cCharAt6 < '0' || cCharAt6 > '9' || cCharAt5 < '0' || cCharAt5 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i12 = (cCharAt5 - '0') + ((cCharAt6 - '0') * 10);
                                    if ((i12 == 0 && iM6853z != 0) || i12 > 12) {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    if (c14 < '0' || c14 > '9' || c11 < '0' || c11 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i13 = (c11 - '0') + ((c14 - '0') * 10);
                                    if (i12 != 2) {
                                        i10 = (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) ? 30 : 31;
                                    } else {
                                        i10 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? 28 : 29;
                                    }
                                    if ((i13 == 0 && iM6853z != 0) || i13 > i10) {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    if (cCharAt12 < '0' || cCharAt12 > '9' || cCharAt13 < '0' || cCharAt13 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i14 = (cCharAt13 - '0') + ((cCharAt12 - '0') * 10);
                                    if (cCharAt15 < '0' || cCharAt15 > '9' || cCharAt16 < '0' || cCharAt16 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i15 = (cCharAt16 - '0') + ((cCharAt15 - '0') * 10);
                                    if (cCharAt18 >= '0' && cCharAt18 <= '9' && cCharAt19 >= '0' && cCharAt19 <= '9') {
                                        int i16 = (cCharAt19 - '0') + ((cCharAt18 - '0') * 10);
                                        if (iM6853z == 0 && i12 == 0 && i13 == 0) {
                                            iM6853z = 1970;
                                            i13 = 1;
                                            i12 = 1;
                                        }
                                        long j3 = (i13 - 1) + (((i12 * 367) - 362) / 12) + ((iM6853z + 399) / 400) + (((iM6853z + 3) / 4) - ((iM6853z + 99) / 100)) + (iM6853z * 365);
                                        if (i12 > 2) {
                                            j3 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? j3 - 2 : j3 - 1;
                                        }
                                        long j4 = ((j3 - 719528) * 86400) + ((long) (i14 * 3600)) + ((long) (i15 * 60)) + ((long) i16);
                                        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
                                        if (!(zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) || j4 < 684900000) {
                                            totalSeconds = (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM6853z, i12, i13), LocalTime.of(i14, i15, i16, 0))).getTotalSeconds();
                                        } else {
                                            totalSeconds = 28800;
                                        }
                                        return (j4 - ((long) totalSeconds)) * 1000;
                                    }
                                    throw new DateTimeParseException("illegal input", str, 0);
                                }
                                i9 = 0;
                                str2 = str;
                            }
                            throw new DateTimeParseException("illegal input", str2, i9);
                        }
                        if (cCharAt5 != '/' || cCharAt8 != '/' || cCharAt11 != ' ' || cCharAt14 != ':' || cCharAt17 != ':') {
                            throw new DateTimeParseException("illegal input", str, 0);
                        }
                    } else if (cCharAt5 != '-' || cCharAt8 != '-' || cCharAt11 != 'T' || cCharAt14 != ':' || cCharAt17 != ':') {
                        throw new DateTimeParseException("illegal input", str, 0);
                    }
                } else if (cCharAt5 != '-' || cCharAt8 != '-' || cCharAt11 != ' ' || cCharAt14 != ':' || cCharAt17 != ':') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                c10 = cCharAt3;
                c11 = cCharAt10;
                c12 = cCharAt;
                cCharAt8 = cCharAt2;
                c13 = cCharAt4;
                cCharAt5 = cCharAt7;
                c14 = cCharAt9;
                if (c12 >= '0') {
                }
                throw new DateTimeParseException("illegal input", str2, i9);
            }
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[PHI: r1
  0x00e0: PHI (r1v7 char) = (r1v6 char), (r1v6 char), (r1v6 char), (r1v37 char) binds: [B:29:0x00b0, B:30:0x00b2, B:31:0x00b4, B:38:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142 A[PHI: r1
  0x0142: PHI (r1v9 char) = (r1v8 char), (r1v8 char), (r1v8 char), (r1v25 char) binds: [B:50:0x0110, B:51:0x0112, B:52:0x0114, B:61:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime parseLocalDateTime17(char[] cArr, int i9) {
        char c10;
        char c11;
        int iM6853z;
        char c12;
        char c13;
        int iM6853z2;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i9 + 17 <= cArr.length) {
            char c14 = cArr[i9];
            char c15 = cArr[i9 + 1];
            char c16 = cArr[i9 + 2];
            char c17 = cArr[i9 + 3];
            char c18 = cArr[i9 + 4];
            char c19 = cArr[i9 + 5];
            char c20 = cArr[i9 + 6];
            char c21 = cArr[i9 + 7];
            char c22 = cArr[i9 + 8];
            char c23 = cArr[i9 + 9];
            char c24 = cArr[i9 + 10];
            char c25 = cArr[i9 + 11];
            char c26 = cArr[i9 + 12];
            char c27 = cArr[i9 + 13];
            char c28 = cArr[i9 + 14];
            char c29 = cArr[i9 + 15];
            char c30 = cArr[i9 + 16];
            char c31 = '-';
            if (c18 != '-' || c21 != '-') {
                if (c18 != c31 && c20 == c31 && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':')) {
                    c21 = c15;
                    c15 = c21;
                    c26 = c29;
                    c13 = c24;
                    c24 = c26;
                    c25 = c27;
                    c12 = c14;
                    c22 = c23;
                    c11 = '0';
                    c18 = '0';
                    c20 = '0';
                    iM6853z = 0;
                } else {
                    c10 = ' ';
                    if (c16 == ' ' || c20 != ' ' || c25 != ' ') {
                        if (c15 == c10 && c19 == c10 && c24 == c10) {
                            if (c26 == ':' || c28 != ':') {
                                c10 = ' ';
                            } else {
                                int iMonth = month(c16, c17, c18);
                                if (iMonth <= 0) {
                                    return null;
                                }
                                c18 = (char) ((iMonth / 10) + 48);
                                c19 = (char) ((iMonth % 10) + 48);
                                c12 = c20;
                                c16 = c22;
                                c26 = c29;
                                c13 = c25;
                                c15 = c14;
                                c17 = c23;
                                c11 = '0';
                                c20 = '0';
                                c22 = '0';
                                c24 = '0';
                                iM6853z = 0;
                                c25 = c27;
                            }
                        }
                        if (c15 != c10 || c19 != c10 || c24 != c10) {
                            if (c15 == c10 && c19 == c10 && c24 == c10) {
                                if (c27 == ':' || c29 != ':') {
                                    c10 = ' ';
                                } else {
                                    int iMonth2 = month(c16, c17, c18);
                                    if (iMonth2 <= 0) {
                                        return null;
                                    }
                                    c18 = (char) ((iMonth2 / 10) + 48);
                                    c19 = (char) ((iMonth2 % 10) + 48);
                                    c27 = c30;
                                    c16 = c22;
                                    c22 = c25;
                                    c13 = c26;
                                    c15 = c14;
                                    c17 = c23;
                                    c11 = '0';
                                    c24 = '0';
                                    c26 = '0';
                                    iM6853z = 0;
                                    c25 = c28;
                                    c12 = c20;
                                    c20 = c26;
                                    if (c12 >= c11 && c12 <= '9' && c21 >= c11 && c21 <= '9' && c16 >= c11 && c16 <= '9' && c17 >= c11 && c17 <= '9') {
                                        iM6853z2 = (c17 - c11) + AbstractC3199a.m6853z(c16, c11, 10, AbstractC3199a.m6853z(c21, c11, 100, (c12 - c11) * 1000));
                                        if (c18 >= c11 && c18 <= '9' && c19 >= c11 && c19 <= '9') {
                                            i10 = (c19 - c11) + ((c18 - c11) * 10);
                                            if (c20 >= c11 && c20 <= '9' && c15 >= c11 && c15 <= '9') {
                                                i11 = (c15 - c11) + ((c20 - c11) * 10);
                                                if (c22 >= c11 && c22 <= '9' && c13 >= c11 && c13 <= '9') {
                                                    i12 = (c13 - c11) + ((c22 - c11) * 10);
                                                    if (c24 >= c11 && c24 <= '9' && c25 >= c11 && c25 <= '9') {
                                                        i13 = (c25 - c11) + ((c24 - c11) * 10);
                                                        if (c26 >= c11 && c26 <= '9' && c27 >= c11 && c27 <= '9') {
                                                            return LocalDateTime.of(iM6853z2, i10, i11, i12, i13, (c27 - c11) + ((c26 - c11) * 10), iM6853z);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (c16 == c10 && c20 == c10 && c25 == c10 && c27 == ':' && c29 == ':') {
                                int iMonth3 = month(c17, c18, c19);
                                if (iMonth3 <= 0) {
                                    return null;
                                }
                                c18 = (char) ((iMonth3 / 10) + 48);
                                c19 = (char) ((iMonth3 % 10) + 48);
                                c27 = c30;
                                c25 = c28;
                                c12 = c21;
                                c21 = c22;
                                c17 = c24;
                                c13 = c26;
                                c20 = c14;
                                c16 = c23;
                                c11 = '0';
                                c22 = '0';
                                c24 = '0';
                                c26 = '0';
                                iM6853z = 0;
                            } else {
                                c11 = '0';
                                if (c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9' && c30 >= '0' && c30 <= '9') {
                                    iM6853z = ((c30 - '0') + AbstractC3199a.m6853z(c29, 48, 10, (c28 - '0') * 100)) * 1000000;
                                    c15 = c21;
                                    c12 = c14;
                                    c13 = c23;
                                    c21 = c15;
                                }
                            }
                            if (c12 >= c11) {
                                iM6853z2 = (c17 - c11) + AbstractC3199a.m6853z(c16, c11, 10, AbstractC3199a.m6853z(c21, c11, 100, (c12 - c11) * 1000));
                                if (c18 >= c11) {
                                    i10 = (c19 - c11) + ((c18 - c11) * 10);
                                    if (c20 >= c11) {
                                        i11 = (c15 - c11) + ((c20 - c11) * 10);
                                        if (c22 >= c11) {
                                            i12 = (c13 - c11) + ((c22 - c11) * 10);
                                            if (c24 >= c11) {
                                                i13 = (c25 - c11) + ((c24 - c11) * 10);
                                                if (c26 >= c11) {
                                                    return LocalDateTime.of(iM6853z2, i10, i11, i12, i13, (c27 - c11) + ((c26 - c11) * 10), iM6853z);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (c26 == ':' && c29 == ':') {
                            int iMonth4 = month(c16, c17, c18);
                            if (iMonth4 <= 0) {
                                return null;
                            }
                            c18 = (char) ((iMonth4 / 10) + 48);
                            c19 = (char) ((iMonth4 % 10) + 48);
                            c24 = c27;
                            c16 = c22;
                            c13 = c25;
                            c15 = c14;
                            c17 = c23;
                            c11 = '0';
                            c22 = '0';
                            c26 = '0';
                            iM6853z = 0;
                            c27 = c30;
                            c25 = c28;
                            c12 = c20;
                            c20 = c26;
                            if (c12 >= c11) {
                            }
                        } else {
                            c10 = ' ';
                            if (c15 == c10) {
                                if (c27 == ':') {
                                }
                                c10 = ' ';
                            }
                            if (c16 == c10) {
                                c11 = '0';
                                if (c28 >= '0') {
                                    iM6853z = ((c30 - '0') + AbstractC3199a.m6853z(c29, 48, 10, (c28 - '0') * 100)) * 1000000;
                                    c15 = c21;
                                    c12 = c14;
                                    c13 = c23;
                                    c21 = c15;
                                    if (c12 >= c11) {
                                    }
                                }
                            }
                        }
                    } else if (c28 == ':') {
                        int iMonth5 = month(c17, c18, c19);
                        if (iMonth5 <= 0) {
                            return null;
                        }
                        c18 = (char) ((iMonth5 / 10) + 48);
                        c19 = (char) ((iMonth5 % 10) + 48);
                        c25 = c30;
                        c12 = c21;
                        c21 = c22;
                        c17 = c24;
                        c22 = c26;
                        c20 = c14;
                        c16 = c23;
                        c11 = '0';
                        c26 = '0';
                        iM6853z = 0;
                        c24 = c29;
                        c13 = c27;
                        c27 = '0';
                        if (c12 >= c11) {
                        }
                    } else {
                        c10 = ' ';
                        if (c15 == c10) {
                            if (c26 == ':') {
                            }
                            c10 = ' ';
                        }
                        if (c15 != c10) {
                            if (c15 == c10) {
                            }
                            if (c16 == c10) {
                            }
                        }
                    }
                }
                c27 = c30;
                if (c12 >= c11) {
                }
            } else if ((c24 == 'T' || c24 == ' ') && c27 == ':' && c30 == 'Z') {
                c24 = c28;
                c21 = c15;
                c18 = c19;
                c19 = c20;
                c20 = c22;
                c22 = c25;
                c12 = c14;
                c15 = c23;
                c11 = '0';
                c27 = '0';
                iM6853z = 0;
                c25 = c29;
                c13 = c26;
                c26 = '0';
                if (c12 >= c11) {
                }
            } else {
                c31 = '-';
                if (c18 != c31) {
                    c10 = ' ';
                    if (c16 == ' ') {
                        if (c15 == c10) {
                        }
                        if (c15 != c10) {
                        }
                    }
                }
            }
            return null;
        }
        String str = new String(cArr, i9, cArr.length - i9);
        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167 A[PHI: r11
  0x0167: PHI (r11v10 char) = (r11v9 char), (r11v9 char), (r11v9 char), (r11v18 char) binds: [B:55:0x011f, B:56:0x0121, B:57:0x0123, B:66:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad A[PHI: r11
  0x01ad: PHI (r11v11 char) = (r11v10 char), (r11v10 char), (r11v10 char), (r11v15 char) binds: [B:67:0x0167, B:68:0x0169, B:69:0x016b, B:78:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parseMillis19(char[] cArr, int i9, ZoneId zoneId) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        String str;
        char c17;
        int i10;
        int totalSeconds;
        cArr.getClass();
        char c18 = cArr[i9];
        char c19 = cArr[i9 + 1];
        char c20 = cArr[i9 + 2];
        char c21 = cArr[i9 + 3];
        char c22 = cArr[i9 + 4];
        char c23 = cArr[i9 + 5];
        char c24 = cArr[i9 + 6];
        char c25 = cArr[i9 + 7];
        char c26 = cArr[i9 + 8];
        char c27 = cArr[i9 + 9];
        char c28 = cArr[i9 + 10];
        char c29 = cArr[i9 + 11];
        char c30 = cArr[i9 + 12];
        char c31 = cArr[i9 + 13];
        char c32 = cArr[i9 + 14];
        char c33 = cArr[i9 + 15];
        char c34 = cArr[i9 + 16];
        char c35 = cArr[i9 + 17];
        char c36 = cArr[i9 + 18];
        if (c22 == '-' && c25 == '-' && ((c28 == ' ' || c28 == 'T') && c31 == ':' && c34 == ':')) {
            c25 = c19;
            c15 = c20;
            c28 = c21;
            c34 = c33;
            c14 = c26;
            c11 = c27;
            c31 = c30;
            c16 = c35;
            c13 = c32;
            str = "illegal input ";
            c12 = c18;
            c17 = '0';
        } else {
            char c37 = '/';
            if (c22 == '/' && c25 == '/') {
                if ((c28 != ' ' && c28 != 'T') || c31 != ':' || c34 != ':') {
                    c37 = '/';
                }
                c25 = c19;
                c15 = c20;
                c28 = c21;
                c34 = c33;
                c14 = c26;
                c11 = c27;
                c31 = c30;
                c16 = c35;
                c13 = c32;
                str = "illegal input ";
                c12 = c18;
                c17 = '0';
            }
            if ((c20 == c37 && c23 == c37) || ((c20 == '.' && c23 == '.') || (c20 == '-' && c23 == '-'))) {
                c10 = ' ';
                if (c28 != ' ') {
                    if (c19 == c10) {
                        if (c31 == ':') {
                        }
                        c10 = ' ';
                    }
                    if (c20 == c10) {
                        if (c20 == c10) {
                        }
                    }
                } else {
                    if (c31 == ':' && c34 == ':') {
                        c11 = c19;
                        c23 = c21;
                        c34 = c33;
                        c14 = c18;
                        c28 = c27;
                        c31 = c30;
                        c16 = c35;
                        c13 = c32;
                        c12 = c24;
                        str = "illegal input ";
                        c17 = '0';
                    }
                    c10 = ' ';
                    if (c19 == c10) {
                    }
                    if (c20 == c10) {
                    }
                }
                c24 = c22;
                c15 = c26;
            } else {
                c10 = ' ';
                if (c19 == c10 && c23 == c10 && c28 == c10) {
                    if (c31 == ':' || c34 != ':') {
                        c10 = ' ';
                    } else {
                        int iMonth = month(c20, c21, c22);
                        if (iMonth > 0) {
                            c22 = (char) ((iMonth % 10) + 48);
                            c23 = (char) ((iMonth / 10) + 48);
                            c34 = c33;
                            c11 = c18;
                            c28 = c27;
                            c31 = c30;
                            c16 = c35;
                            c14 = '0';
                            c13 = c32;
                            c12 = c24;
                            str = "illegal input ";
                            c17 = '0';
                            c24 = c22;
                            c15 = c26;
                        } else {
                            String str2 = new String(cArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                        }
                    }
                }
                if (c20 == c10 && c24 == c10 && c29 == c10) {
                    if (c31 == ':' && c34 == ':') {
                        int iMonth2 = month(c21, c22, c23);
                        if (iMonth2 > 0) {
                            char c38 = (char) ((iMonth2 / 10) + 48);
                            char c39 = (char) ((iMonth2 % 10) + 48);
                            c11 = c19;
                            c23 = c38;
                            c24 = c39;
                            c34 = c33;
                            c14 = c18;
                            c15 = c27;
                            c31 = c30;
                            c16 = c35;
                            c29 = '0';
                            c13 = c32;
                            c12 = c25;
                            str = "illegal input ";
                            c25 = c26;
                            c17 = '0';
                        } else {
                            String str3 = new String(cArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                        }
                    } else {
                        c10 = ' ';
                        if (c20 == c10) {
                            if (c20 != c10) {
                            }
                            String str4 = new String(cArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                        }
                    }
                } else if (c20 == c10 && c24 == c10 && c29 == c10) {
                    if (c32 == ':' && c34 == ':') {
                        int iMonth3 = month(c21, c22, c23);
                        if (iMonth3 > 0) {
                            c11 = c19;
                            c23 = (char) ((iMonth3 / 10) + 48);
                            c24 = (char) ((iMonth3 % 10) + 48);
                            c12 = c25;
                            c34 = c33;
                            c14 = c18;
                            c25 = c26;
                            c15 = c27;
                            c29 = c30;
                            c16 = c35;
                            c13 = '0';
                            str = "illegal input ";
                            c17 = '0';
                        } else {
                            String str5 = new String(cArr, i9, 19);
                            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
                        }
                    } else {
                        c10 = ' ';
                        if (c20 != c10) {
                        }
                        String str42 = new String(cArr, i9, 19);
                        throw new DateTimeParseException("illegal input ".concat(str42), str42, 0);
                    }
                } else if (c20 != c10 && c24 == c10 && c29 == c10 && c32 == ':' && c35 == ':') {
                    int iMonth4 = month(c21, c22, c23);
                    if (iMonth4 > 0) {
                        c11 = c19;
                        c23 = (char) ((iMonth4 / 10) + 48);
                        c24 = (char) ((iMonth4 % 10) + 48);
                        c12 = c25;
                        c13 = c33;
                        c14 = c18;
                        c25 = c26;
                        c15 = c27;
                        c29 = c30;
                        c16 = '0';
                        str = "illegal input ";
                        c17 = '0';
                    } else {
                        String str6 = new String(cArr, i9, 19);
                        throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
                    }
                } else {
                    String str422 = new String(cArr, i9, 19);
                    throw new DateTimeParseException("illegal input ".concat(str422), str422, 0);
                }
            }
        }
        if (c12 >= c17 && c12 <= '9' && c25 >= c17 && c25 <= '9' && c15 >= c17 && c15 <= '9' && c28 >= c17 && c28 <= '9') {
            int iM6853z = (c28 - c17) + AbstractC3199a.m6853z(c15, c17, 10, AbstractC3199a.m6853z(c25, c17, 100, (c12 - c17) * 1000));
            if (c23 < c17 || c23 > '9' || c24 < c17 || c24 > '9') {
                String str7 = new String(cArr, i9, 19);
                throw new DateTimeParseException(str.concat(str7), str7, 0);
            }
            int i11 = (c24 - c17) + ((c23 - c17) * 10);
            if ((i11 == 0 && iM6853z != 0) || i11 > 12) {
                String str8 = str;
                String str9 = new String(cArr, i9, 19);
                throw new DateTimeParseException(str8.concat(str9), str9, 0);
            }
            if (c14 < c17 || c14 > '9' || c11 < c17 || c11 > '9') {
                String str10 = new String(cArr, i9, 19);
                throw new DateTimeParseException(str.concat(str10), str10, 0);
            }
            int i12 = (c11 - c17) + ((c14 - c17) * 10);
            if (i11 != 2) {
                i10 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else {
                i10 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? 28 : 29;
            }
            if ((i12 == 0 && iM6853z != 0) || i12 > i10) {
                String str11 = str;
                String str12 = new String(cArr, i9, 19);
                throw new DateTimeParseException(str11.concat(str12), str12, 0);
            }
            if (c29 < '0' || c29 > '9' || c31 < '0' || c31 > '9') {
                String str13 = new String(cArr, i9, 19);
                throw new DateTimeParseException(str.concat(str13), str13, 0);
            }
            int i13 = (c31 - '0') + ((c29 - '0') * 10);
            if (c13 < '0' || c13 > '9' || c34 < '0' || c34 > '9') {
                String str14 = new String(cArr, i9, 19);
                throw new DateTimeParseException(str.concat(str14), str14, 0);
            }
            int i14 = (c34 - '0') + ((c13 - '0') * 10);
            if (c16 >= '0' && c16 <= '9' && c36 >= '0' && c36 <= '9') {
                int i15 = (c36 - '0') + ((c16 - '0') * 10);
                boolean z9 = true;
                if (iM6853z == 0 && i11 == 0 && i12 == 0) {
                    iM6853z = 1970;
                    i12 = 1;
                    i11 = 1;
                }
                long j3 = (i12 - 1) + (((i11 * 367) - 362) / 12) + ((iM6853z + 399) / 400) + (((iM6853z + 3) / 4) - ((iM6853z + 99) / 100)) + (iM6853z * 365);
                if (i11 > 2) {
                    j3 = ((iM6853z & 3) != 0 || (iM6853z % 100 == 0 && iM6853z % 400 != 0)) ? j3 - 2 : j3 - 1;
                }
                long j4 = ((j3 - 719528) * 86400) + ((long) (i13 * 3600)) + ((long) (i14 * 60)) + ((long) i15);
                ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
                if (zoneId2 != SHANGHAI_ZONE_ID && zoneId2.getRules() != SHANGHAI_ZONE_RULES) {
                    z9 = false;
                }
                if (!z9 || j4 < 684900000) {
                    totalSeconds = (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM6853z, i11, i12), LocalTime.of(i13, i14, i15, 0))).getTotalSeconds();
                } else {
                    totalSeconds = 28800;
                }
                return (j4 - ((long) totalSeconds)) * 1000;
            }
            String str15 = new String(cArr, i9, 19);
            throw new DateTimeParseException(str.concat(str15), str15, 0);
        }
        char[] cArr2 = cArr;
        String str16 = str;
        String str17 = new String(cArr2, i9, 19);
        throw new DateTimeParseException(str16.concat(str17), str17, 0);
    }
}
