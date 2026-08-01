package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderImplDate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import okhttp3.internal.http2.Http2Connection;
import p319w2.C9079i0;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
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

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class CacheDate10 {
        static final String[] CACHE = new String[1024];
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class CacheDate8 {
        static final String[] CACHE = new String[1024];
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
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

        DateTimeFormatPattern(String str, int i10) {
            this.pattern = str;
            this.length = i10;
        }
    }

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

    private static long calcEpochDay(int i10, int i11, int i12) {
        long j10 = (i10 * 365) + (((i10 + 3) / 4) - ((i10 + 99) / 100)) + ((i10 + 399) / 400) + (((i11 * 367) - 362) / 12) + (i12 - 1);
        if (i11 > 2) {
            j10 = ((i10 & 3) != 0 || (i10 % 100 == 0 && i10 % 400 != 0)) ? j10 - 2 : j10 - 1;
        }
        return j10 - 719528;
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

    public static String formatYMD10(long j10, ZoneId zoneId) {
        long j11;
        String strApply;
        String str;
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        long jFloorDiv = Math.floorDiv(j10, 1000L);
        long jFloorDiv2 = Math.floorDiv(jFloorDiv + ((long) ((zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) ? getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId2.getRules().getOffset(Instant.ofEpochMilli(j10)).getTotalSeconds())), 86400L);
        int i10 = (int) ((jFloorDiv2 - ((long) LOCAL_EPOCH_DAY)) + 128);
        String[] strArr = CacheDate10.CACHE;
        if (i10 >= 0 && i10 < strArr.length && (str = strArr[i10]) != null) {
            return str;
        }
        long j12 = 719468 + jFloorDiv2;
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
        int i11 = (int) j15;
        int i12 = ((i11 * 5) + 2) / Opcodes.IFEQ;
        int i13 = ((i12 + 2) % 12) + 1;
        int i14 = (i11 - (((i12 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + ((long) (i12 / 10));
        if (j16 < -999999999 || j16 > 999999999) {
            C1802v.m6503a("Invalid year ", j16);
            return null;
        }
        int i15 = (int) j16;
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[10];
            IOUtils.writeLocalDate(bArr, 0, i15, i13, i14);
            strApply = biFunction.apply(bArr, JDKUtils.LATIN1);
        } else {
            char[] cArr = new char[10];
            IOUtils.writeLocalDate(cArr, 0, i15, i13, i14);
            BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
            strApply = biFunction2 != null ? biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
        }
        if (i10 >= 0 && i10 < strArr.length) {
            strArr[i10] = strApply;
        }
        return strApply;
    }

    public static String formatYMD8(long j10, ZoneId zoneId) {
        long j11;
        String strApply;
        String str;
        long jFloorDiv = Math.floorDiv(j10, 1000L);
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        long jFloorDiv2 = Math.floorDiv(jFloorDiv + ((long) ((zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) ? getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId2.getRules().getOffset(Instant.ofEpochMilli(j10)).getTotalSeconds())), 86400L);
        int i10 = (int) ((jFloorDiv2 - ((long) LOCAL_EPOCH_DAY)) + 128);
        String[] strArr = CacheDate8.CACHE;
        if (i10 >= 0 && i10 < strArr.length && (str = strArr[i10]) != null) {
            return str;
        }
        long j12 = 719468 + jFloorDiv2;
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
        int i11 = (int) j15;
        int i12 = ((i11 * 5) + 2) / Opcodes.IFEQ;
        int i13 = ((i12 + 2) % 12) + 1;
        int i14 = (i11 - (((i12 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + ((long) (i12 / 10));
        if (j16 < -999999999 || j16 > 999999999) {
            C1802v.m6503a("Invalid year ", j16);
            return null;
        }
        int i15 = (int) j16;
        int i16 = i15 / 100;
        int i17 = i15 - (i16 * 100);
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[8];
            IOUtils.writeDigitPair(bArr, 0, i16);
            IOUtils.writeDigitPair(bArr, 2, i17);
            IOUtils.writeDigitPair(bArr, 4, i13);
            IOUtils.writeDigitPair(bArr, 6, i14);
            strApply = biFunction.apply(bArr, JDKUtils.LATIN1);
        } else {
            char[] cArr = new char[8];
            IOUtils.writeDigitPair(cArr, 0, i16);
            IOUtils.writeDigitPair(cArr, 2, i17);
            IOUtils.writeDigitPair(cArr, 4, i13);
            IOUtils.writeDigitPair(cArr, 6, i14);
            BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
            strApply = biFunction2 != null ? biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
        }
        if (i10 >= 0 && i10 < strArr.length) {
            strArr[i10] = strApply;
        }
        return strApply;
    }

    public static String formatYMDHMS19(Date date, ZoneId zoneId) {
        long j10;
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        long jFloorDiv = Math.floorDiv(time, 1000L);
        long totalSeconds = jFloorDiv + ((long) (((zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) && jFloorDiv > 684900000) ? 28800 : zoneId2.getRules().getOffset(Instant.ofEpochMilli(time)).getTotalSeconds()));
        long jFloorDiv2 = Math.floorDiv(totalSeconds, 86400L);
        int iFloorMod = (int) Math.floorMod(totalSeconds, 86400L);
        long j11 = 719468 + jFloorDiv2;
        if (j11 < 0) {
            long j12 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((((j13 * 365) + (j13 / 4)) - (j13 / 100)) + (j13 / 400));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((((365 * j13) + (j13 / 4)) - (j13 / 100)) + (j13 / 400));
        }
        int i10 = (int) j14;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j15 = j13 + j10 + ((long) (i11 / 10));
        if (j15 < -999999999 || j15 > 999999999) {
            C1802v.m6503a("Invalid year ", j15);
            return null;
        }
        int i14 = (int) j15;
        long j16 = iFloorMod;
        if (j16 < 0 || j16 > 86399) {
            C1802v.m6503a("Invalid secondOfDay ", j16);
            return null;
        }
        int i15 = (int) (j16 / 3600);
        long j17 = j16 - ((long) (i15 * 3600));
        int i16 = (int) (j17 / 60);
        int i17 = (int) (j17 - ((long) (i16 * 60)));
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[19];
            IOUtils.writeLocalDate(bArr, 0, i14, i12, i13);
            bArr[10] = 32;
            IOUtils.writeLocalTime(bArr, 11, i15, i16, i17);
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[19];
        IOUtils.writeLocalDate(cArr, 0, i14, i12, i13);
        cArr[10] = ' ';
        IOUtils.writeLocalTime(cArr, 11, i15, i16, i17);
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        return biFunction2 != null ? biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
    }

    public static int getShanghaiZoneOffsetTotalSeconds(long j10) {
        if (j10 >= 684900000) {
            return 28800;
        }
        if (j10 >= 671598000) {
            return 32400;
        }
        if (j10 >= 653450400) {
            return 28800;
        }
        if (j10 >= 640148400) {
            return 32400;
        }
        if (j10 >= 622000800) {
            return 28800;
        }
        if (j10 >= 608698800) {
            return 32400;
        }
        if (j10 >= 589946400) {
            return 28800;
        }
        if (j10 >= 577249200) {
            return 32400;
        }
        if (j10 >= 558496800) {
            return 28800;
        }
        if (j10 >= 545194800) {
            return 32400;
        }
        if (j10 >= 527047200) {
            return 28800;
        }
        if (j10 >= 515559600) {
            return 32400;
        }
        if (j10 >= -649987200) {
            return 28800;
        }
        if (j10 >= -652316400) {
            return 32400;
        }
        if (j10 >= -670636800) {
            return 28800;
        }
        if (j10 >= -683852400) {
            return 32400;
        }
        if (j10 >= -699580800) {
            return 28800;
        }
        if (j10 >= -716857200) {
            return 32400;
        }
        if (j10 >= -733795200) {
            return 28800;
        }
        if (j10 >= -745801200) {
            return 32400;
        }
        if (j10 >= -767836800) {
            return 28800;
        }
        if (j10 >= -881017200) {
            return 32400;
        }
        if (j10 >= -888796800) {
            return 28800;
        }
        if (j10 >= -908838000) {
            return 32400;
        }
        if (j10 >= -922060800) {
            return 28800;
        }
        if (j10 >= -933634800) {
            return 32400;
        }
        if (j10 >= -1585872000) {
            return 28800;
        }
        if (j10 >= -1600642800) {
            return 32400;
        }
        return j10 >= -2177452800L ? 28800 : 29143;
    }

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

    public static long hms(byte[] bArr, int i10) {
        long jReverseBytes = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if (((((-1085102592571150096L) & jReverseBytes) - 3472328296227680304L) | (((1085102592571150095L & jReverseBytes) + 434034439958300166L) & (-1085366475377544976L))) != 0 || (16492675399680L & jReverseBytes) != 10995116933120L) {
            return -1L;
        }
        long j10 = 4222124902318095L & jReverseBytes;
        return (j10 << 3) + (j10 << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
    }

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
                    case Opcodes.AALOAD /* 50 */:
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
                case Opcodes.AALOAD /* 50 */:
                    c11 = '4';
                    c10 = '1';
                    break;
                case Opcodes.BALOAD /* 51 */:
                    c11 = '5';
                    c10 = '1';
                    break;
                case '4':
                    c11 = '6';
                    c10 = '1';
                    break;
                case Opcodes.SALOAD /* 53 */:
                    c11 = '7';
                    c10 = '1';
                    break;
                case Opcodes.ISTORE /* 54 */:
                    c11 = '8';
                    c10 = '1';
                    break;
                case Opcodes.LSTORE /* 55 */:
                    c11 = '9';
                    c10 = '1';
                    break;
                case Opcodes.FSTORE /* 56 */:
                    c10 = '2';
                    c11 = '0';
                    break;
                case Opcodes.DSTORE /* 57 */:
                    c10 = '2';
                    c11 = '1';
                    break;
            }
        }
        return (c10 << 16) | c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        r0 = 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isDate(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.isDate(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        r15 = 29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isLocalDate(java.lang.String r15) {
        /*
            r0 = 0
            if (r15 == 0) goto Lb1
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto Lb
            goto Lb1
        Lb:
            int r1 = r15.length()
            r2 = 9
            r3 = 1
            r4 = 10
            if (r1 != r4) goto L9b
            r1 = 4
            char r5 = r15.charAt(r1)
            r6 = 45
            if (r5 != r6) goto L9b
            r5 = 7
            char r5 = r15.charAt(r5)
            if (r5 != r6) goto L9b
            char r5 = r15.charAt(r0)
            char r6 = r15.charAt(r3)
            r7 = 2
            char r8 = r15.charAt(r7)
            r9 = 3
            char r10 = r15.charAt(r9)
            r11 = 5
            char r11 = r15.charAt(r11)
            r12 = 6
            char r13 = r15.charAt(r12)
            r14 = 8
            char r14 = r15.charAt(r14)
            char r15 = r15.charAt(r2)
            int r5 = r5 + (-48)
            int r5 = r5 * 1000
            int r6 = r6 + (-48)
            int r6 = r6 * 100
            int r5 = r5 + r6
            int r8 = r8 + (-48)
            int r8 = r8 * r4
            int r5 = r5 + r8
            int r10 = r10 + (-48)
            int r5 = r5 + r10
            int r11 = r11 + (-48)
            int r11 = r11 * r4
            int r13 = r13 + (-48)
            int r11 = r11 + r13
            int r14 = r14 + (-48)
            int r14 = r14 * r4
            int r15 = r15 + (-48)
            int r14 = r14 + r15
            r15 = 12
            if (r11 <= r15) goto L6d
            return r0
        L6d:
            r15 = 28
            if (r14 <= r15) goto L9a
            if (r11 == r7) goto L83
            if (r11 == r1) goto L80
            if (r11 == r12) goto L80
            if (r11 == r2) goto L80
            r15 = 11
            if (r11 == r15) goto L80
            r15 = 31
            goto L96
        L80:
            r15 = 30
            goto L96
        L83:
            r1 = r5 & 15
            if (r1 != 0) goto L8c
            r1 = r5 & 3
            if (r1 != 0) goto L96
            goto L94
        L8c:
            r1 = r5 & 3
            if (r1 != 0) goto L96
            int r5 = r5 % 100
            if (r5 == 0) goto L96
        L94:
            r15 = 29
        L96:
            if (r14 > r15) goto L99
            return r3
        L99:
            return r0
        L9a:
            return r3
        L9b:
            int r1 = r15.length()
            if (r1 < r2) goto Lb1
            int r1 = r15.length()
            r2 = 40
            if (r1 <= r2) goto Laa
            goto Lb1
        Laa:
            java.time.LocalDate r15 = parseLocalDate(r15)     // Catch: java.lang.Throwable -> Lb1
            if (r15 == 0) goto Lb1
            return r3
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.isLocalDate(java.lang.String):boolean");
    }

    public static boolean isLocalTime(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.length() == 8 && str.charAt(2) == ':' && str.charAt(5) == ':') {
                char cCharAt = str.charAt(0);
                char cCharAt2 = str.charAt(1);
                char cCharAt3 = str.charAt(3);
                char cCharAt4 = str.charAt(4);
                char cCharAt5 = str.charAt(6);
                char cCharAt6 = str.charAt(7);
                return cCharAt >= '0' && cCharAt <= '2' && cCharAt2 >= '0' && cCharAt2 <= '9' && cCharAt3 >= '0' && cCharAt3 <= '6' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '6' && cCharAt6 >= '0' && cCharAt6 <= '9' && ((cCharAt - '0') * 10) + (cCharAt2 - '0') <= 24 && ((cCharAt3 - '0') * 10) + (cCharAt4 - '0') <= 60 && ((cCharAt5 - '0') * 10) + (cCharAt6 - '0') <= 61;
            }
            try {
                LocalTime.parse(str);
                return true;
            } catch (DateTimeParseException unused) {
            }
        }
        return false;
    }

    public static LocalDateTime localDateTime(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23, char c24, char c25, char c26, char c27, char c28, char c29, char c30, char c31, char c32) {
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int i10 = ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0');
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i11 = ((c14 - '0') * 10) + (c15 - '0');
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i12 = ((c16 - '0') * 10) + (c17 - '0');
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        int i13 = ((c18 - '0') * 10) + (c19 - '0');
                        if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                            int i14 = ((c20 - '0') * 10) + (c21 - '0');
                            if (c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                int i15 = ((c22 - '0') * 10) + (c23 - '0');
                                if (c24 >= '0' && c24 <= '9' && c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9' && c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9' && c30 >= '0' && c30 <= '9' && c31 >= '0' && c31 <= '9' && c32 >= '0' && c32 <= '9') {
                                    return LocalDateTime.of(i10, i11, i12, i13, i14, i15, ((c24 - '0') * 100000000) + ((c25 - '0') * 10000000) + ((c26 - '0') * 1000000) + ((c27 - '0') * 100000) + ((c28 - '0') * 10000) + ((c29 - '0') * 1000) + ((c30 - '0') * 100) + ((c31 - '0') * 10) + (c32 - '0'));
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static LocalDate localDateYMD(byte[] bArr, int i10) {
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i10;
        short s10 = unsafe.getShort(bArr, j10 + j11);
        int i11 = s10 & 3855;
        if (((61680 & (i11 + 1542)) | ((s10 & 61680) - 12336)) != 0) {
            return null;
        }
        long jReverseBytes = unsafe.getLong(bArr, j10 + j11 + 2);
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if ((280375481794560L & jReverseBytes) == 49478026199040L) {
            if ((((-1085366475377544976L) & ((1085086099895750415L & jReverseBytes) + 434034439958300166L)) | ((jReverseBytes & (-1085366475377544976L)) - 3472275519666401328L)) == 0) {
                long j12 = 4222124902318095L & jReverseBytes;
                long j13 = (j12 << 3) + (j12 << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
                int i12 = ((s10 & 15) * 1000) + ((i11 >> 8) * 100) + (((int) j13) & 255);
                int i13 = ((int) (j13 >> 24)) & 255;
                int i14 = ((int) (j13 >> 48)) & 255;
                if (i12 == 0 && i13 == 0 && i14 == 0) {
                    return null;
                }
                return LocalDate.of(i12, i13, i14);
            }
        }
        return null;
    }

    private static LocalTime localTime(int i10, int i11, int i12) {
        if ((i10 | i11 | i12) < 0) {
            return null;
        }
        return LocalTime.of(i10, i11, i12);
    }

    public static long millis(ZoneId zoneId, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (zoneId == null) {
            zoneId = DEFAULT_ZONE_ID;
        }
        long jCalcEpochDay = (calcEpochDay(i10, i11, i12) * 86400) + ((long) (i13 * 3600)) + ((long) (i14 * 60)) + ((long) i15);
        int totalSeconds = 0;
        if ((zoneId == SHANGHAI_ZONE_ID || zoneId.getRules() == SHANGHAI_ZONE_RULES) && jCalcEpochDay >= 684900000) {
            totalSeconds = 28800;
        } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
            totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(i10, i11, i12), LocalTime.of(i13, i14, i15, i16))).getTotalSeconds();
        }
        long j10 = (jCalcEpochDay - ((long) totalSeconds)) * 1000;
        return i16 != 0 ? j10 + ((long) (i16 / 1000000)) : j10;
    }

    public static int month(char c10, char c11, char c12) {
        switch ((c10 << 16) | (c11 << '\b') | c12) {
            case 4288626:
                return 4;
            case 4289895:
                return 8;
            case 4482403:
                return 12;
            case 4613474:
                return 2;
            case 4874606:
                return 1;
            case 4879724:
                return 7;
            case 4879726:
                return 6;
            case 5071218:
                return 3;
            case 5071225:
                return 5;
            case 5140342:
                return 11;
            case 5202804:
                return 10;
            case 5465456:
                return 9;
            default:
                return -1;
        }
    }

    public static int nanos(int i10, int i11) {
        return i10 * POWERS[(9 - i11) & 15];
    }

    public static Date parseDate(String str, String str2, ZoneId zoneId) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
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

    public static Date parseDateYMDHMS19(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Date(parseMillisYMDHMS19(str, DEFAULT_ZONE_ID));
    }

    public static LocalDate parseLocalDate(String str) {
        LocalDate localDate;
        Function<String, byte[]> function;
        if (str == null) {
            return null;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction == null || (function = JDKUtils.STRING_VALUE) == null || toIntFunction.applyAsInt(str) != 0) {
            char[] charArray = JDKUtils.getCharArray(str);
            localDate = parseLocalDate(charArray, 0, charArray.length);
        } else {
            byte[] bArrApply = function.apply(str);
            localDate = parseLocalDate(bArrApply, 0, bArrApply.length);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDate parseLocalDate10(char[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(char[], int):java.time.LocalDate");
    }

    public static LocalDate parseLocalDate11(char[] cArr, int i10) {
        int iDigit2;
        int iDigit22;
        int iDigit4;
        if (i10 + 11 > cArr.length) {
            return null;
        }
        char c10 = cArr[i10 + 4];
        int i11 = i10 + 7;
        char c11 = cArr[i11];
        char c12 = cArr[i10 + 10];
        if ((c10 != 24180 || c11 != 26376 || c12 != 26085) && ((c10 != '-' || c11 != '-' || c12 != 'Z') && (c10 != 45380 || c11 != 50900 || c12 != 51068))) {
            if (cArr[i10 + 2] == ' ' && cArr[i10 + 6] == ' ') {
                int iDigit42 = IOUtils.digit4(cArr, i11);
                int iMonth = month(cArr[i10 + 3], c10, cArr[i10 + 5]);
                iDigit2 = IOUtils.digit2(cArr, i10);
                iDigit22 = iMonth;
                iDigit4 = iDigit42;
            }
            return null;
        }
        iDigit4 = IOUtils.digit4(cArr, i10);
        iDigit22 = IOUtils.digit2(cArr, i10 + 5);
        iDigit2 = IOUtils.digit2(cArr, i10 + 8);
        if ((iDigit4 | iDigit22 | iDigit2) >= 0 && (iDigit4 != 0 || iDigit22 != 0 || iDigit2 != 0)) {
            return LocalDate.of(iDigit4, iDigit22, iDigit2);
        }
        return null;
    }

    public static LocalDate parseLocalDate8(byte[] bArr, int i10) {
        int iDigit4;
        int iDigit2;
        int iDigit22;
        if (i10 + 8 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i10 + 1];
        char c11 = (char) bArr[i10 + 3];
        int i11 = i10 + 4;
        char c12 = (char) bArr[i11];
        if (c12 == '-' && bArr[i10 + 6] == 45) {
            iDigit4 = IOUtils.digit4(bArr, i10);
            iDigit2 = IOUtils.digit1(bArr, i10 + 5);
            iDigit22 = IOUtils.digit1(bArr, i10 + 7);
        } else if (c10 == '/' && c11 == '/') {
            iDigit2 = IOUtils.digit1(bArr, i10);
            int iDigit1 = IOUtils.digit1(bArr, i10 + 2);
            iDigit4 = IOUtils.digit4(bArr, i11);
            iDigit22 = iDigit1;
        } else if (c10 == '-' && bArr[i10 + 5] == 45) {
            int iDigit12 = IOUtils.digit1(bArr, i10);
            iDigit2 = month((char) bArr[i10 + 2], c11, c12);
            int iDigit23 = IOUtils.digit2(bArr, i10 + 6);
            if (iDigit23 != -1) {
                iDigit23 += 2000;
            }
            iDigit4 = iDigit23;
            iDigit22 = iDigit12;
        } else {
            iDigit4 = IOUtils.digit4(bArr, i10);
            iDigit2 = IOUtils.digit2(bArr, i11);
            iDigit22 = IOUtils.digit2(bArr, i10 + 6);
        }
        if ((iDigit4 | iDigit2 | iDigit22) <= 0) {
            return null;
        }
        return LocalDate.of(iDigit4, iDigit2, iDigit22);
    }

    public static LocalDate parseLocalDate9(char[] cArr, int i10) {
        int iDigit2;
        int iDigit1;
        int iDigit4;
        int iMonth;
        int iDigit42;
        int iDigit12;
        int iDigit13;
        int iDigit22;
        int iDigit43;
        if (i10 + 9 > cArr.length) {
            return null;
        }
        char c10 = cArr[i10 + 1];
        int i11 = i10 + 2;
        char c11 = cArr[i11];
        char c12 = cArr[i10 + 4];
        char c13 = cArr[i10 + 6];
        int i12 = i10 + 7;
        char c14 = cArr[i12];
        int i13 = i10 + 8;
        char c15 = cArr[i13];
        if ((c12 == '-' && c14 == '-') || (c12 == '/' && c14 == '/')) {
            iDigit42 = IOUtils.digit4(cArr, i10);
            iMonth = IOUtils.digit2(cArr, i10 + 5);
            iDigit12 = IOUtils.digit1(cArr, i13);
        } else if ((c12 == '-' && c13 == '-') || (c12 == '/' && c13 == '/')) {
            iDigit42 = IOUtils.digit4(cArr, i10);
            iMonth = IOUtils.digit1(cArr, i10 + 5);
            iDigit12 = IOUtils.digit2(cArr, i12);
        } else if ((c12 == 24180 && c13 == 26376 && c15 == 26085) || (c12 == 45380 && c13 == 50900 && c15 == 51068)) {
            iDigit42 = IOUtils.digit4(cArr, i10);
            iMonth = IOUtils.digit1(cArr, i10 + 5);
            iDigit12 = IOUtils.digit1(cArr, i12);
        } else {
            if (c10 == '.' && c12 == '.') {
                iDigit13 = IOUtils.digit1(cArr, i10);
                iDigit22 = IOUtils.digit2(cArr, i11);
                iDigit43 = IOUtils.digit4(cArr, i10 + 5);
            } else if ((c11 == '.' && c12 == '.') || (c11 == '-' && c12 == '-')) {
                iDigit13 = IOUtils.digit2(cArr, i10);
                iDigit22 = IOUtils.digit1(cArr, i10 + 3);
                iDigit43 = IOUtils.digit4(cArr, i10 + 5);
            } else if (c10 == '-' && c12 == '-') {
                iDigit13 = IOUtils.digit1(cArr, i10);
                iDigit22 = IOUtils.digit2(cArr, i11);
                iDigit43 = IOUtils.digit4(cArr, i10 + 5);
            } else if (c11 == '-' && c13 == '-') {
                int iDigit23 = IOUtils.digit2(cArr, i10);
                iMonth = month(cArr[i10 + 3], c12, cArr[i10 + 5]);
                int iDigit24 = IOUtils.digit2(cArr, i12);
                if (iDigit24 != -1) {
                    iDigit24 += 2000;
                }
                iDigit42 = iDigit24;
                iDigit12 = iDigit23;
            } else {
                if (c10 == '/' && c12 == '/') {
                    iDigit2 = IOUtils.digit1(cArr, i10);
                    iDigit1 = IOUtils.digit2(cArr, i11);
                    iDigit4 = IOUtils.digit4(cArr, i10 + 5);
                } else {
                    if (c11 != '/' || c12 != '/') {
                        return null;
                    }
                    iDigit2 = IOUtils.digit2(cArr, i10);
                    iDigit1 = IOUtils.digit1(cArr, i10 + 3);
                    iDigit4 = IOUtils.digit4(cArr, i10 + 5);
                }
                iMonth = iDigit2;
                iDigit42 = iDigit4;
                iDigit12 = iDigit1;
            }
            int i14 = iDigit13;
            iDigit42 = iDigit43;
            iDigit12 = i14;
            iMonth = iDigit22;
        }
        if ((iDigit42 | iMonth | iDigit12) <= 0) {
            return null;
        }
        return LocalDate.of(iDigit42, iMonth, iDigit12);
    }

    public static LocalDateTime parseLocalDateTime(String str, int i10, int i11) {
        LocalDateTime localDateTime;
        Function<String, byte[]> function;
        if (str == null || i11 == 0) {
            return null;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null && toIntFunction.applyAsInt(str) == 0) {
            localDateTime = parseLocalDateTime(function.apply(str), i10, i11);
        } else if (JDKUtils.JVM_VERSION != 8 || JDKUtils.FIELD_STRING_VALUE_ERROR) {
            char[] cArr = new char[i11];
            str.getChars(i10, i10 + i11, cArr, 0);
            localDateTime = parseLocalDateTime(cArr, i10, i11);
        } else {
            localDateTime = parseLocalDateTime(JDKUtils.getCharArray(str), i10, i11);
        }
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
                throw new DateTimeParseException(str, str, i10);
        }
    }

    public static LocalDateTime parseLocalDateTime12(char[] cArr, int i10) {
        int i11 = i10 + 12;
        if (i11 > cArr.length) {
            String str = new String(cArr, i10, cArr.length - i10);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        int iDigit4 = IOUtils.digit4(cArr, i10);
        int iDigit2 = IOUtils.digit2(cArr, i10 + 4);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 6);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 8);
        int iDigit24 = IOUtils.digit2(cArr, i10 + 10);
        if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24) < 0) {
            String str2 = new String(cArr, i10, i11);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (iDigit4 == 0 && iDigit2 == 0 && iDigit22 == 0 && iDigit23 == 0 && iDigit24 == 0) {
            return null;
        }
        return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, 0);
    }

    public static LocalDateTime parseLocalDateTime14(char[] cArr, int i10) {
        if (i10 + 14 > cArr.length) {
            return null;
        }
        int iDigit4 = IOUtils.digit4(cArr, i10);
        int iDigit2 = IOUtils.digit2(cArr, i10 + 4);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 6);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 8);
        int iDigit24 = IOUtils.digit2(cArr, i10 + 10);
        int iDigit25 = IOUtils.digit2(cArr, i10 + 12);
        if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24 | iDigit25) < 0) {
            return null;
        }
        return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, iDigit25);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime16(byte[] r31, int r32) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byte[], int):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime17(byte[] r32, int r33) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byte[], int):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266 A[PHI: r12
  0x0266: PHI (r12v5 char) = (r12v4 char), (r12v4 char), (r12v4 char), (r12v8 char) binds: [B:100:0x023c, B:101:0x023e, B:102:0x0240, B:107:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1 A[PHI: r12
  0x01d1: PHI (r12v2 char) = (r12v1 char), (r12v1 char), (r12v1 char), (r12v12 char) binds: [B:73:0x01a9, B:74:0x01ab, B:75:0x01ad, B:80:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb A[PHI: r12
  0x01fb: PHI (r12v3 char) = (r12v2 char), (r12v2 char), (r12v2 char), (r12v10 char) binds: [B:81:0x01d1, B:82:0x01d3, B:83:0x01d5, B:88:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime18(char[] r29, int r30) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(char[], int):java.time.LocalDateTime");
    }

    public static LocalDateTime parseLocalDateTime19(char[] cArr, int i10) {
        int iDigit2;
        int iDigit22;
        int iDigit1;
        int iMonth;
        int iDigit4;
        int iDigit23;
        if (i10 + 19 > cArr.length) {
            return null;
        }
        char c10 = cArr[i10 + 1];
        char c11 = cArr[i10 + 2];
        int i11 = i10 + 3;
        char c12 = cArr[i11];
        char c13 = cArr[i10 + 4];
        int i12 = i10 + 5;
        char c14 = cArr[i12];
        char c15 = cArr[i10 + 7];
        char c16 = cArr[i10 + 10];
        char c17 = cArr[i10 + 13];
        char c18 = cArr[i10 + 16];
        if (((c13 == '-' && c15 == '-') || (c13 == '/' && c15 == '/')) && ((c16 == ' ' || c16 == 'T') && c17 == ':' && c18 == ':')) {
            iDigit4 = IOUtils.digit4(cArr, i10);
            iMonth = IOUtils.digit2(cArr, i12);
            iDigit1 = IOUtils.digit2(cArr, i10 + 8);
            iDigit22 = IOUtils.digit2(cArr, i10 + 11);
            iDigit2 = IOUtils.digit2(cArr, i10 + 14);
            iDigit23 = IOUtils.digit2(cArr, i10 + 17);
        } else if (c11 == '/' && c14 == '/' && ((c16 == ' ' || c16 == 'T') && c17 == ':' && c18 == ':')) {
            iDigit1 = IOUtils.digit2(cArr, i10);
            iMonth = IOUtils.digit2(cArr, i11);
            iDigit4 = IOUtils.digit4(cArr, i10 + 6);
            iDigit22 = IOUtils.digit2(cArr, i10 + 11);
            iDigit2 = IOUtils.digit2(cArr, i10 + 14);
            iDigit23 = IOUtils.digit2(cArr, i10 + 17);
        } else {
            if (c10 != ' ' || c14 != ' ' || c16 != ' ' || c17 != ':' || c18 != ':') {
                return null;
            }
            iDigit1 = IOUtils.digit1(cArr, i10);
            iMonth = month(c11, c12, c13);
            iDigit4 = IOUtils.digit4(cArr, i10 + 6);
            iDigit22 = IOUtils.digit2(cArr, i10 + 11);
            iDigit2 = IOUtils.digit2(cArr, i10 + 14);
            iDigit23 = IOUtils.digit2(cArr, i10 + 17);
        }
        int i13 = iDigit23;
        int i14 = iDigit4;
        int i15 = iMonth;
        int i16 = iDigit1;
        int i17 = iDigit22;
        int i18 = iDigit2;
        if ((i14 | i15 | i16 | i17 | i18 | i13) <= 0) {
            return null;
        }
        return LocalDateTime.of(i14, i15, i16, i17, i18, i13);
    }

    public static LocalDateTime parseLocalDateTime20(char[] cArr, int i10) {
        if (i10 + 19 <= cArr.length && cArr[i10 + 2] == ' ' && cArr[i10 + 6] == ' ' && cArr[i10 + 11] == ' ' && cArr[i10 + 14] == ':' && cArr[i10 + 17] == ':') {
            int iDigit2 = IOUtils.digit2(cArr, i10);
            int iMonth = month(cArr[i10 + 3], cArr[i10 + 4], cArr[i10 + 5]);
            int iDigit4 = IOUtils.digit4(cArr, i10 + 7);
            int iDigit22 = IOUtils.digit2(cArr, i10 + 12);
            int iDigit23 = IOUtils.digit2(cArr, i10 + 15);
            int iDigit24 = IOUtils.digit2(cArr, i10 + 18);
            if ((iDigit4 | iMonth | iDigit2 | iDigit22 | iDigit23 | iDigit24) > 0 && iDigit22 <= 24 && iDigit23 <= 59 && iDigit24 <= 60) {
                return LocalDateTime.of(iDigit4, iMonth, iDigit2, iDigit22, iDigit23, iDigit24);
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime26(char[] cArr, int i10) {
        char c10;
        if (i10 + 26 <= cArr.length && cArr[i10 + 4] == '-' && cArr[i10 + 7] == '-' && (((c10 = cArr[i10 + 10]) == ' ' || c10 == 'T') && cArr[i10 + 13] == ':' && cArr[i10 + 16] == ':' && cArr[i10 + 19] == '.')) {
            int iDigit4 = IOUtils.digit4(cArr, i10);
            int iDigit2 = IOUtils.digit2(cArr, i10 + 5);
            int iDigit22 = IOUtils.digit2(cArr, i10 + 8);
            int iDigit23 = IOUtils.digit2(cArr, i10 + 11);
            int iDigit24 = IOUtils.digit2(cArr, i10 + 14);
            int iDigit25 = IOUtils.digit2(cArr, i10 + 17);
            int nanos = readNanos(cArr, 6, i10 + 20);
            if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24 | iDigit25 | nanos) > 0 && iDigit23 <= 24 && iDigit24 <= 59 && iDigit25 <= 60) {
                return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, iDigit25, nanos);
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime27(char[] cArr, int i10) {
        char c10;
        if (i10 + 27 <= cArr.length && cArr[i10 + 4] == '-' && cArr[i10 + 7] == '-' && (((c10 = cArr[i10 + 10]) == ' ' || c10 == 'T') && cArr[i10 + 13] == ':' && cArr[i10 + 16] == ':' && cArr[i10 + 19] == '.')) {
            int iDigit4 = IOUtils.digit4(cArr, i10);
            int iDigit2 = IOUtils.digit2(cArr, i10 + 5);
            int iDigit22 = IOUtils.digit2(cArr, i10 + 8);
            int iDigit23 = IOUtils.digit2(cArr, i10 + 11);
            int iDigit24 = IOUtils.digit2(cArr, i10 + 14);
            int iDigit25 = IOUtils.digit2(cArr, i10 + 17);
            int nanos = readNanos(cArr, 7, i10 + 20);
            if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24 | iDigit25 | nanos) > 0 && iDigit23 <= 24 && iDigit24 <= 59 && iDigit25 <= 60) {
                return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, iDigit25, nanos);
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime28(char[] cArr, int i10) {
        char c10;
        if (i10 + 28 <= cArr.length && cArr[i10 + 4] == '-' && cArr[i10 + 7] == '-' && (((c10 = cArr[i10 + 10]) == ' ' || c10 == 'T') && cArr[i10 + 13] == ':' && cArr[i10 + 16] == ':' && cArr[i10 + 19] == '.')) {
            int iDigit4 = IOUtils.digit4(cArr, i10);
            int iDigit2 = IOUtils.digit2(cArr, i10 + 5);
            int iDigit22 = IOUtils.digit2(cArr, i10 + 8);
            int iDigit23 = IOUtils.digit2(cArr, i10 + 11);
            int iDigit24 = IOUtils.digit2(cArr, i10 + 14);
            int iDigit25 = IOUtils.digit2(cArr, i10 + 17);
            int nanos = readNanos(cArr, 8, i10 + 20);
            if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24 | iDigit25 | nanos) > 0 && iDigit23 <= 24 && iDigit24 <= 59 && iDigit25 <= 60) {
                return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, iDigit25, nanos);
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime29(char[] cArr, int i10) {
        char c10;
        if (i10 + 29 <= cArr.length && cArr[i10 + 4] == '-' && cArr[i10 + 7] == '-' && (((c10 = cArr[i10 + 10]) == ' ' || c10 == 'T') && cArr[i10 + 13] == ':' && cArr[i10 + 16] == ':' && cArr[i10 + 19] == '.')) {
            int iDigit4 = IOUtils.digit4(cArr, i10);
            int iDigit2 = IOUtils.digit2(cArr, i10 + 5);
            int iDigit22 = IOUtils.digit2(cArr, i10 + 8);
            int iDigit23 = IOUtils.digit2(cArr, i10 + 11);
            int iDigit24 = IOUtils.digit2(cArr, i10 + 14);
            int iDigit25 = IOUtils.digit2(cArr, i10 + 17);
            int nanos = readNanos(cArr, 9, i10 + 20);
            if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24 | iDigit25 | nanos) > 0 && iDigit23 <= 24 && iDigit24 <= 59 && iDigit25 <= 60) {
                return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, iDigit25, nanos);
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTimeX(byte[] bArr, int i10, int i11) {
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
        if (bArr == null || i11 == 0 || i11 < 21 || i11 > 29) {
            return null;
        }
        char c26 = (char) bArr[i10];
        char c27 = (char) bArr[i10 + 1];
        char c28 = (char) bArr[i10 + 2];
        char c29 = (char) bArr[i10 + 3];
        char c30 = (char) bArr[i10 + 4];
        char c31 = (char) bArr[i10 + 5];
        char c32 = (char) bArr[i10 + 6];
        char c33 = (char) bArr[i10 + 7];
        char c34 = (char) bArr[i10 + 8];
        char c35 = (char) bArr[i10 + 9];
        char c36 = (char) bArr[i10 + 10];
        char c37 = (char) bArr[i10 + 11];
        char c38 = (char) bArr[i10 + 12];
        char c39 = (char) bArr[i10 + 13];
        char c40 = (char) bArr[i10 + 14];
        char c41 = (char) bArr[i10 + 15];
        char c42 = (char) bArr[i10 + 16];
        char c43 = (char) bArr[i10 + 17];
        char c44 = (char) bArr[i10 + 18];
        char c45 = (char) bArr[i10 + 19];
        char c46 = '0';
        switch (i11) {
            case Opcodes.ILOAD /* 21 */:
                c10 = (char) bArr[i10 + 20];
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
            case Opcodes.LLOAD /* 22 */:
                char c47 = (char) bArr[i10 + 20];
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
                c46 = (char) bArr[i10 + 21];
                c23 = '0';
                c24 = '0';
                c25 = '0';
                c10 = c47;
                c15 = '0';
                break;
            case Opcodes.FLOAD /* 23 */:
                char c48 = (char) bArr[i10 + 20];
                char c49 = (char) bArr[i10 + 21];
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
                c23 = (char) bArr[i10 + 22];
                c24 = '0';
                c25 = '0';
                c10 = c48;
                c46 = c49;
                c15 = '0';
                c16 = c15;
                break;
            case Opcodes.DLOAD /* 24 */:
                char c50 = (char) bArr[i10 + 20];
                char c51 = (char) bArr[i10 + 21];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c22 = c27;
                c23 = (char) bArr[i10 + 22];
                c24 = (char) bArr[i10 + 23];
                c25 = '0';
                c17 = '0';
                c10 = c50;
                c46 = c51;
                c15 = '0';
                c16 = c15;
                break;
            case Opcodes.ALOAD /* 25 */:
                char c52 = (char) bArr[i10 + 20];
                char c53 = (char) bArr[i10 + 21];
                char c54 = (char) bArr[i10 + 22];
                c11 = c34;
                c12 = c35;
                c13 = c37;
                c14 = '0';
                c18 = c38;
                c19 = c40;
                c20 = c43;
                c21 = c44;
                c23 = c54;
                c24 = (char) bArr[i10 + 23];
                c17 = '0';
                c22 = c27;
                c46 = c53;
                c25 = (char) bArr[i10 + 24];
                c16 = '0';
                c10 = c52;
                c15 = '0';
                break;
            case 26:
                char c55 = (char) bArr[i10 + 20];
                char c56 = (char) bArr[i10 + 21];
                char c57 = (char) bArr[i10 + 22];
                char c58 = (char) bArr[i10 + 23];
                char c59 = (char) bArr[i10 + 24];
                c14 = (char) bArr[i10 + 25];
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
                char c60 = (char) bArr[i10 + 20];
                char c61 = (char) bArr[i10 + 21];
                char c62 = (char) bArr[i10 + 22];
                char c63 = (char) bArr[i10 + 23];
                char c64 = (char) bArr[i10 + 24];
                char c65 = (char) bArr[i10 + 25];
                c15 = (char) bArr[i10 + 26];
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
                char c66 = (char) bArr[i10 + 20];
                char c67 = (char) bArr[i10 + 21];
                char c68 = (char) bArr[i10 + 22];
                char c69 = (char) bArr[i10 + 23];
                char c70 = (char) bArr[i10 + 24];
                char c71 = (char) bArr[i10 + 25];
                char c72 = (char) bArr[i10 + 26];
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
                c16 = (char) bArr[i10 + 27];
                c10 = c66;
                c15 = c72;
                break;
            default:
                char c73 = (char) bArr[i10 + 20];
                char c74 = (char) bArr[i10 + 21];
                char c75 = (char) bArr[i10 + 22];
                char c76 = (char) bArr[i10 + 23];
                char c77 = (char) bArr[i10 + 24];
                char c78 = (char) bArr[i10 + 25];
                char c79 = (char) bArr[i10 + 26];
                char c80 = (char) bArr[i10 + 27];
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
                c17 = (char) bArr[i10 + 28];
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
        int i12 = i10 + i11;
        if (bArr[i12 - 15] != 45 || bArr[i12 - 12] != 45) {
            return null;
        }
        byte b10 = bArr[i12 - 9];
        if ((b10 == 32 || b10 == 84) && bArr[i12 - 6] == 58 && bArr[i12 - 3] == 58) {
            return LocalDateTime.of(TypeUtils.parseInt(bArr, i10, i11 - 15), TypeUtils.parseInt(bArr, i12 - 14, 2), TypeUtils.parseInt(bArr, i12 - 11, 2), TypeUtils.parseInt(bArr, i12 - 8, 2), TypeUtils.parseInt(bArr, i12 - 5, 2), TypeUtils.parseInt(bArr, i12 - 2, 2));
        }
        return null;
    }

    public static LocalTime parseLocalTime(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) {
        if (c12 == ':' && c15 == ':' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
            int i10 = ((c10 - '0') * 10) + (c11 - '0');
            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                int i11 = ((c13 - '0') * 10) + (c14 - '0');
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    return LocalTime.of(i10, i11, ((c16 - '0') * 10) + (c17 - '0'));
                }
            }
        }
        return null;
    }

    public static LocalTime parseLocalTime10(byte[] bArr, int i10) {
        if (i10 + 10 > bArr.length || bArr[i10 + 2] != 58 || bArr[i10 + 5] != 58 || bArr[i10 + 8] != 46) {
            return null;
        }
        int iDigit2 = IOUtils.digit2(bArr, i10);
        int iDigit22 = IOUtils.digit2(bArr, i10 + 3);
        int iDigit23 = IOUtils.digit2(bArr, i10 + 6);
        int iDigit1 = IOUtils.digit1(bArr, i10 + 9);
        if (iDigit1 > 0) {
            iDigit1 *= 100000000;
        }
        if ((iDigit2 | iDigit22 | iDigit23 | iDigit22) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, iDigit1);
    }

    public static LocalTime parseLocalTime11(char[] cArr, int i10) {
        if (i10 + 11 > cArr.length || cArr[i10 + 2] != ':' || cArr[i10 + 5] != ':' || cArr[i10 + 8] != '.') {
            return null;
        }
        int iDigit2 = IOUtils.digit2(cArr, i10);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 3);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 6);
        int iDigit24 = IOUtils.digit2(cArr, i10 + 9);
        if (iDigit24 > 0) {
            iDigit24 *= 10000000;
        }
        if ((iDigit2 | iDigit22 | iDigit23 | iDigit22) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, iDigit24);
    }

    public static LocalTime parseLocalTime12(char[] cArr, int i10) {
        if (i10 + 12 > cArr.length || cArr[i10 + 2] != ':' || cArr[i10 + 5] != ':' || cArr[i10 + 8] != '.') {
            return null;
        }
        int iDigit2 = IOUtils.digit2(cArr, i10);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 3);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 6);
        int iDigit3 = IOUtils.digit3(cArr, i10 + 9);
        if (iDigit3 > 0) {
            iDigit3 *= 1000000;
        }
        if ((iDigit2 | iDigit22 | iDigit23 | iDigit22) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, iDigit3);
    }

    public static LocalTime parseLocalTime15(char[] cArr, int i10) {
        if (i10 + 15 > cArr.length || cArr[i10 + 2] != ':' || cArr[i10 + 5] != ':' || cArr[i10 + 8] != '.') {
            return null;
        }
        int iDigit2 = IOUtils.digit2(cArr, i10);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 3);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 6);
        int nanos = readNanos(cArr, 6, i10 + 9);
        if ((iDigit2 | iDigit22 | iDigit23 | nanos) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, nanos);
    }

    public static LocalTime parseLocalTime18(char[] cArr, int i10) {
        if (i10 + 18 > cArr.length || cArr[i10 + 2] != ':' || cArr[i10 + 5] != ':' || cArr[i10 + 8] != '.') {
            return null;
        }
        int iDigit2 = IOUtils.digit2(cArr, i10);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 3);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 6);
        int nanos = readNanos(cArr, 9, i10 + 9);
        if ((iDigit2 | iDigit22 | iDigit23 | nanos) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, nanos);
    }

    public static LocalTime parseLocalTime5(byte[] bArr, int i10) {
        int iDigit1;
        int iDigit2;
        int iDigit22;
        if (i10 + 5 > bArr.length) {
            return null;
        }
        int i11 = i10 + 2;
        if (bArr[i11] == 58) {
            iDigit22 = IOUtils.digit2(bArr, i10);
            iDigit2 = IOUtils.digit2(bArr, i10 + 3);
            iDigit1 = 0;
        } else {
            if (bArr[i10 + 1] != 58 || bArr[i10 + 3] != 58) {
                return null;
            }
            int iDigit12 = IOUtils.digit1(bArr, i10);
            int iDigit13 = IOUtils.digit1(bArr, i11);
            iDigit1 = IOUtils.digit1(bArr, i10 + 4);
            iDigit2 = iDigit13;
            iDigit22 = iDigit12;
        }
        return localTime(iDigit22, iDigit2, iDigit1);
    }

    public static LocalTime parseLocalTime6(byte[] bArr, int i10) {
        int iDigit1;
        int iDigit12;
        int iDigit2;
        int i11 = i10 + 5;
        if (i11 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i10 + 1];
        int i12 = i10 + 4;
        byte b11 = bArr[i12];
        int i13 = i10 + 2;
        if (bArr[i13] == 58 && b11 == 58) {
            iDigit1 = IOUtils.digit2(bArr, i10);
            iDigit12 = IOUtils.digit1(bArr, i10 + 3);
            iDigit2 = IOUtils.digit1(bArr, i11);
        } else if (b10 == 58 && b11 == 58) {
            iDigit1 = IOUtils.digit1(bArr, i10);
            iDigit12 = IOUtils.digit2(bArr, i13);
            iDigit2 = IOUtils.digit1(bArr, i11);
        } else {
            if (b10 != 58 || bArr[i10 + 3] != 58) {
                return null;
            }
            iDigit1 = IOUtils.digit1(bArr, i10);
            iDigit12 = IOUtils.digit1(bArr, i13);
            iDigit2 = IOUtils.digit2(bArr, i12);
        }
        return localTime(iDigit1, iDigit12, iDigit2);
    }

    public static LocalTime parseLocalTime7(byte[] bArr, int i10) {
        int iDigit2;
        int iDigit1;
        int iDigit12;
        int i11 = i10 + 5;
        if (i11 > bArr.length) {
            return null;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i12];
        byte b11 = bArr[i10 + 4];
        if (bArr[i10 + 1] == 58 && b11 == 58) {
            iDigit12 = IOUtils.digit1(bArr, i10);
            iDigit2 = IOUtils.digit2(bArr, i12);
            iDigit1 = IOUtils.digit2(bArr, i11);
        } else if (b10 == 58 && b11 == 58) {
            int iDigit22 = IOUtils.digit2(bArr, i10);
            int iDigit13 = IOUtils.digit1(bArr, i10 + 3);
            iDigit1 = IOUtils.digit2(bArr, i11);
            iDigit2 = iDigit13;
            iDigit12 = iDigit22;
        } else {
            if (b10 != 58 || bArr[i11] != 58) {
                return null;
            }
            int iDigit23 = IOUtils.digit2(bArr, i10);
            iDigit2 = IOUtils.digit2(bArr, i10 + 3);
            iDigit1 = IOUtils.digit1(bArr, i10 + 6);
            iDigit12 = iDigit23;
        }
        return localTime(iDigit12, iDigit2, iDigit1);
    }

    public static LocalTime parseLocalTime8(char[] cArr, int i10) {
        if (i10 + 8 <= cArr.length && cArr[i10 + 2] == ':' && cArr[i10 + 5] == ':') {
            return localTime(IOUtils.digit2(cArr, i10), IOUtils.digit2(cArr, i10 + 3), IOUtils.digit2(cArr, i10 + 6));
        }
        return null;
    }

    public static long parseMillis(char[] cArr, int i10, int i11, ZoneId zoneId) {
        char c10;
        int i12 = i11;
        ZoneId zoneId2 = zoneId;
        if (cArr == null || i12 == 0) {
            return 0L;
        }
        if (i12 == 4 && IOUtils.isNULL(cArr, i10)) {
            return 0L;
        }
        char c11 = cArr[i10];
        if (c11 != '\"' || cArr[i12 - 1] != '\"') {
            if (i12 == 19) {
                return parseMillis19(cArr, i10, zoneId2);
            }
            if (i12 > 19 || (i12 == 16 && ((c10 = cArr[i10 + 10]) == '+' || c10 == '-'))) {
                ZonedDateTime zonedDateTime = parseZonedDateTime(cArr, i10, i11, zoneId);
                if (zonedDateTime != null) {
                    return zonedDateTime.toInstant().toEpochMilli();
                }
                String str = new String(cArr, i10, i12 - i10);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            if ((c11 == '-' || (c11 >= '0' && c11 <= '9')) && IOUtils.isNumber(cArr, i10, i11)) {
                long j10 = TypeUtils.parseLong(cArr, i10, i11);
                if (i12 != 8 || j10 < 19700101 || j10 > 21000101) {
                    return j10;
                }
                int i13 = (int) j10;
                int i14 = i13 / 10000;
                int i15 = (i13 % 10000) / 100;
                int i16 = i13 % 100;
                if (i15 < 1 || i15 > 12) {
                    return j10;
                }
                return i16 <= (i15 != 2 ? (i15 == 4 || i15 == 6 || i15 == 9 || i15 == 11) ? 30 : 31 : ((i14 & 3) != 0 || (i14 % 100 == 0 && i14 % 400 != 0)) ? 28 : 29) ? ZonedDateTime.ofLocal(LocalDateTime.of(i14, i15, i16, 0, 0, 0), zoneId2, null).toEpochSecond() * 1000 : j10;
            }
            if (cArr[i12 - 1] == 'Z') {
                i12--;
                zoneId2 = ZoneOffset.UTC;
            }
            LocalDateTime localDateTime = parseLocalDateTime(cArr, i10, i12);
            if (localDateTime == null && IOUtils.getLongLE(cArr, i10) == 13511005043687472L && IOUtils.getLongLE(cArr, i10 + 4) == 12666580113555501L && IOUtils.getIntLE(cArr, i10 + 8) == 3145776) {
                localDateTime = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
            }
            if (localDateTime == null) {
                String str2 = new String(cArr, i10, i12 - i10);
                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
            }
            long epochSecond = ZonedDateTime.ofLocal(localDateTime, zoneId2, null).toEpochSecond();
            int nano = localDateTime.getNano();
            return (epochSecond >= 0 || nano <= 0) ? (epochSecond * 1000) + ((long) (nano / 1000000)) : (((epochSecond + 1) * 1000) + ((long) (nano / 1000000))) - 1000;
        }
        JSONReader jSONReaderM6240of = JSONReader.m6240of(cArr, i10, i11);
        try {
            long time = ((Date) ObjectReaderImplDate.INSTANCE.readObject(jSONReaderM6240of, null, null, 0L)).getTime();
            if (jSONReaderM6240of != null) {
                jSONReaderM6240of.close();
            }
            return time;
        } finally {
        }
    }

    public static long parseMillis10(String str, ZoneId zoneId, DateTimeFormatPattern dateTimeFormatPattern) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char c10;
        char c11;
        char c12;
        char c13;
        char cCharAt6;
        Function<String, byte[]> function;
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (dateTimeFormatPattern.length != 10) {
            C9079i0.m35296a();
            return 0L;
        }
        boolean z10 = true;
        int totalSeconds = 0;
        if (JDKUtils.JVM_VERSION == 8) {
            char[] charArray = JDKUtils.getCharArray(str);
            if (charArray.length != 10) {
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            cCharAt = charArray[0];
            cCharAt2 = charArray[1];
            char c14 = charArray[2];
            cCharAt3 = charArray[3];
            char c15 = charArray[4];
            cCharAt4 = charArray[5];
            char c16 = charArray[6];
            c13 = charArray[7];
            cCharAt5 = charArray[8];
            cCharAt6 = charArray[9];
            c12 = c14;
            c11 = c15;
            c10 = c16;
        } else {
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null && toIntFunction.applyAsInt(str) == 0) {
                byte[] bArrApply = function.apply(str);
                if (bArrApply.length != 10) {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                cCharAt = (char) bArrApply[0];
                cCharAt2 = (char) bArrApply[1];
                char c17 = (char) bArrApply[2];
                cCharAt3 = (char) bArrApply[3];
                char c18 = (char) bArrApply[4];
                cCharAt4 = (char) bArrApply[5];
                char c19 = (char) bArrApply[6];
                char c20 = (char) bArrApply[7];
                char c21 = (char) bArrApply[8];
                cCharAt6 = (char) bArrApply[9];
                c11 = c18;
                c13 = c20;
                c10 = c19;
                c12 = c17;
                cCharAt5 = c21;
            } else {
                if (str.length() != 10) {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                cCharAt = str.charAt(0);
                cCharAt2 = str.charAt(1);
                char cCharAt7 = str.charAt(2);
                cCharAt3 = str.charAt(3);
                char cCharAt8 = str.charAt(4);
                cCharAt4 = str.charAt(5);
                char cCharAt9 = str.charAt(6);
                char cCharAt10 = str.charAt(7);
                cCharAt5 = str.charAt(8);
                c10 = cCharAt9;
                c11 = cCharAt8;
                c12 = cCharAt7;
                c13 = cCharAt10;
                cCharAt6 = str.charAt(9);
            }
        }
        int iOrdinal = dateTimeFormatPattern.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new DateTimeParseException("illegal input", str, 0);
            }
            if (c11 != '/' || c13 != '/') {
                throw new DateTimeParseException("illegal input", str, 0);
            }
        } else if (c11 != '-' || c13 != '-') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || c12 < '0' || c12 > '9' || cCharAt3 < '0' || cCharAt3 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i10 = ((cCharAt - '0') * 1000) + ((cCharAt2 - '0') * 100) + ((c12 - '0') * 10) + (cCharAt3 - '0');
        if (cCharAt4 < '0' || cCharAt4 > '9' || c10 < '0' || c10 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i11 = ((cCharAt4 - '0') * 10) + (c10 - '0');
        if ((i11 == 0 && i10 != 0) || i11 > 12) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt5 < '0' || cCharAt5 > '9' || cCharAt6 < '0' || cCharAt6 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i12 = ((cCharAt5 - '0') * 10) + (cCharAt6 - '0');
        int i13 = i11 != 2 ? (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31 : ((i10 & 3) != 0 || (i10 % 100 == 0 && i10 % 400 != 0)) ? 28 : 29;
        if ((i12 == 0 && i10 != 0) || i12 > i13) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (i10 == 0 && i11 == 0 && i12 == 0) {
            i10 = 1970;
            i11 = 1;
            i12 = 1;
        }
        long jCalcEpochDay = calcEpochDay(i10, i11, i12) * 86400;
        if (zoneId != SHANGHAI_ZONE_ID && zoneId.getRules() != SHANGHAI_ZONE_RULES) {
            z10 = false;
        }
        if (z10 && jCalcEpochDay >= 684900000) {
            totalSeconds = 28800;
        } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
            totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(i10, i11, i12), LocalTime.MIN)).getTotalSeconds();
        }
        return (jCalcEpochDay - ((long) totalSeconds)) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fb, code lost:
    
        if (r7 == ':') goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c6 A[PHI: r1
  0x02c6: PHI (r1v33 char) = (r1v32 char), (r1v32 char), (r1v32 char), (r1v42 char) binds: [B:90:0x028b, B:91:0x028d, B:92:0x028f, B:101:0x02c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f A[PHI: r1
  0x024f: PHI (r1v31 char) = (r1v30 char), (r1v30 char), (r1v30 char), (r1v56 char) binds: [B:66:0x0212, B:67:0x0214, B:68:0x0216, B:77:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028b A[PHI: r1
  0x028b: PHI (r1v32 char) = (r1v31 char), (r1v31 char), (r1v31 char), (r1v49 char) binds: [B:78:0x024f, B:79:0x0251, B:80:0x0253, B:89:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long parseMillis19(java.lang.String r33, java.time.ZoneId r34) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseMillis19(java.lang.String, java.time.ZoneId):long");
    }

    public static long parseMillisYMDHMS19(String str, ZoneId zoneId) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        char cCharAt9;
        char cCharAt10;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char cCharAt11;
        char c15;
        char c16;
        char c17;
        Function<String, byte[]> function;
        char c18;
        char c19;
        if (str == null) {
            return 0L;
        }
        if (JDKUtils.JVM_VERSION == 8) {
            char[] charArray = JDKUtils.getCharArray(str);
            if (charArray.length != 19) {
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            cCharAt = charArray[0];
            cCharAt2 = charArray[1];
            cCharAt3 = charArray[2];
            cCharAt4 = charArray[3];
            char c20 = charArray[4];
            cCharAt5 = charArray[5];
            char c21 = charArray[6];
            cCharAt6 = charArray[7];
            cCharAt7 = charArray[8];
            char c22 = charArray[9];
            char c23 = charArray[10];
            char c24 = charArray[11];
            char c25 = charArray[12];
            char c26 = charArray[13];
            cCharAt8 = charArray[14];
            cCharAt9 = charArray[15];
            c12 = charArray[16];
            c13 = c26;
            c14 = c20;
            c17 = c21;
            c11 = c23;
            c16 = c24;
            c15 = c25;
            cCharAt10 = charArray[17];
            cCharAt11 = charArray[18];
            c10 = c22;
        } else {
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            if (toIntFunction != null && toIntFunction.applyAsInt(str) == 0 && (function = JDKUtils.STRING_VALUE) != null) {
                byte[] bArrApply = function.apply(str);
                if (bArrApply.length != 19) {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                cCharAt = (char) bArrApply[0];
                cCharAt2 = (char) bArrApply[1];
                cCharAt3 = (char) bArrApply[2];
                cCharAt4 = (char) bArrApply[3];
                char c27 = (char) bArrApply[4];
                cCharAt5 = (char) bArrApply[5];
                char c28 = (char) bArrApply[6];
                cCharAt6 = (char) bArrApply[7];
                cCharAt7 = (char) bArrApply[8];
                char c29 = (char) bArrApply[9];
                char c30 = (char) bArrApply[10];
                char c31 = (char) bArrApply[11];
                c15 = (char) bArrApply[12];
                c13 = (char) bArrApply[13];
                cCharAt8 = (char) bArrApply[14];
                cCharAt9 = (char) bArrApply[15];
                char c32 = (char) bArrApply[16];
                char c33 = (char) bArrApply[17];
                cCharAt11 = (char) bArrApply[18];
                c10 = c29;
                c11 = c30;
                cCharAt10 = c33;
                c16 = c31;
                c17 = c28;
                c12 = c32;
                c14 = c27;
            } else {
                if (str.length() != 19) {
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                }
                cCharAt = str.charAt(0);
                cCharAt2 = str.charAt(1);
                cCharAt3 = str.charAt(2);
                cCharAt4 = str.charAt(3);
                char cCharAt12 = str.charAt(4);
                cCharAt5 = str.charAt(5);
                char cCharAt13 = str.charAt(6);
                cCharAt6 = str.charAt(7);
                cCharAt7 = str.charAt(8);
                char cCharAt14 = str.charAt(9);
                char cCharAt15 = str.charAt(10);
                char cCharAt16 = str.charAt(11);
                char cCharAt17 = str.charAt(12);
                char cCharAt18 = str.charAt(13);
                cCharAt8 = str.charAt(14);
                cCharAt9 = str.charAt(15);
                char cCharAt19 = str.charAt(16);
                cCharAt10 = str.charAt(17);
                c10 = cCharAt14;
                c11 = cCharAt15;
                c12 = cCharAt19;
                c13 = cCharAt18;
                c14 = cCharAt12;
                cCharAt11 = str.charAt(18);
                c15 = cCharAt17;
                c16 = cCharAt16;
                c17 = cCharAt13;
            }
        }
        char c34 = c15;
        if (c14 != '-' || cCharAt6 != '-' || c11 != ' ' || c13 != ':' || c12 != ':') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || cCharAt3 < '0' || cCharAt3 > '9' || cCharAt4 < '0' || cCharAt4 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i10 = ((cCharAt - '0') * 1000) + ((cCharAt2 - '0') * 100) + ((cCharAt3 - '0') * 10) + (cCharAt4 - '0');
        if (cCharAt5 < '0' || cCharAt5 > '9' || c17 < '0' || c17 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i11 = ((cCharAt5 - '0') * 10) + (c17 - '0');
        if ((i11 == 0 && i10 != 0) || i11 > 12) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (cCharAt7 < '0' || cCharAt7 > '9' || c10 < '0' || c10 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i12 = ((cCharAt7 - '0') * 10) + (c10 - '0');
        int i13 = i11 != 2 ? (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31 : ((i10 & 3) != 0 || (i10 % 100 == 0 && i10 % 400 != 0)) ? 28 : 29;
        if ((i12 == 0 && i10 != 0) || i12 > i13) {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        if (c16 < '0' || c16 > '9' || c34 < '0' || c34 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i14 = ((c16 - '0') * 10) + (c34 - '0');
        char c35 = cCharAt8;
        if (c35 < '0' || c35 > '9' || (c18 = cCharAt9) < '0' || c18 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i15 = ((c35 - '0') * 10) + (c18 - '0');
        char c36 = cCharAt10;
        if (c36 < '0' || c36 > '9' || (c19 = cCharAt11) < '0' || c19 > '9') {
            throw new DateTimeParseException("illegal input", str, 0);
        }
        int i16 = ((c36 - '0') * 10) + (c19 - '0');
        if (i10 == 0 && i11 == 0 && i12 == 0) {
            i10 = 1970;
            i12 = 1;
            i11 = 1;
        }
        long jCalcEpochDay = (calcEpochDay(i10, i11, i12) * 86400) + ((long) (i14 * 3600)) + ((long) (i15 * 60)) + ((long) i16);
        ZoneId zoneId2 = zoneId == null ? DEFAULT_ZONE_ID : zoneId;
        return (jCalcEpochDay - ((long) ((!(zoneId2 == SHANGHAI_ZONE_ID || zoneId2.getRules() == SHANGHAI_ZONE_RULES) || jCalcEpochDay < 684900000) ? (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(i10, i11, i12), LocalTime.of(i14, i15, i16, 0))).getTotalSeconds() : 28800))) * 1000;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.ZonedDateTime parseZonedDateTime(byte[] r60, int r61, int r62, java.time.ZoneId r63) {
        /*
            Method dump skipped, instruction units count: 4530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byte[], int, int, java.time.ZoneId):java.time.ZonedDateTime");
    }

    public static ZonedDateTime parseZonedDateTime16(byte[] bArr, int i10, ZoneId zoneId) {
        if (i10 + 16 > bArr.length) {
            String str = new String(bArr, i10, bArr.length - i10);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char c10 = (char) bArr[i10];
        char c11 = (char) bArr[i10 + 1];
        char c12 = (char) bArr[i10 + 2];
        char c13 = (char) bArr[i10 + 3];
        char c14 = (char) bArr[i10 + 4];
        char c15 = (char) bArr[i10 + 5];
        char c16 = (char) bArr[i10 + 6];
        char c17 = (char) bArr[i10 + 7];
        char c18 = (char) bArr[i10 + 8];
        char c19 = (char) bArr[i10 + 9];
        int i11 = i10 + 10;
        char c20 = (char) bArr[i11];
        char c21 = (char) bArr[i10 + 13];
        if (c14 != '-' || c17 != '-' || ((c20 != '+' && c20 != '-') || c21 != ':')) {
            String str2 = new String(bArr, i10, 16);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            String str3 = new String(bArr, i10, 16);
            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
        }
        int i12 = ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0');
        if (c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9') {
            String str4 = new String(bArr, i10, 16);
            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
        }
        int i13 = ((c15 - '0') * 10) + (c16 - '0');
        if (c18 < '0' || c18 > '9' || c19 < '0' || c19 > '9') {
            String str5 = new String(bArr, i10, 16);
            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
        }
        return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(i12, i13, ((c18 - '0') * 10) + (c19 - '0')), LocalTime.MIN), getZoneId(new String(bArr, i11, 6), zoneId));
    }

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

    public static int readNanos(char[] cArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = cArr[i11 + i13] - '0';
            if ((i14 < 0) || (i14 > 9)) {
                return -1;
            }
            i12 = (i12 * 10) + i14;
        }
        return i12 * POWERS[(9 - i10) & 15];
    }

    public static String toString(long j10, boolean z10, ZoneId zoneId) {
        long j11;
        int i10;
        long jFloorDiv = Math.floorDiv(j10, 1000L);
        int shanghaiZoneOffsetTotalSeconds = (zoneId == SHANGHAI_ZONE_ID || zoneId.getRules() == SHANGHAI_ZONE_RULES) ? getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId.getRules().getOffset(Instant.ofEpochMilli(j10)).getTotalSeconds();
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
        int i11 = (int) j16;
        int i12 = ((i11 * 5) + 2) / Opcodes.IFEQ;
        int i13 = ((i12 + 2) % 12) + 1;
        int i14 = (i11 - (((i12 * 306) + 5) / 10)) + 1;
        long j17 = j15 + j11 + ((long) (i12 / 10));
        if (j17 < -999999999 || j17 > 999999999) {
            C1802v.m6503a("Invalid year ", j17);
            return null;
        }
        int i15 = (int) j17;
        long j18 = iFloorMod;
        if (j18 < 0 || j18 > 86399) {
            C1802v.m6503a("Invalid secondOfDay ", j18);
            return null;
        }
        int i16 = (int) (j18 / 3600);
        long j19 = j18 - ((long) (i16 * 3600));
        int i17 = (int) (j19 / 60);
        int i18 = (int) (j19 - ((long) (i17 * 60)));
        int iFloorMod2 = (int) Math.floorMod(j10, 1000L);
        if (iFloorMod2 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
            if (iFloorMod2 >= 10) {
                if (iFloorMod2 % 100 == 0) {
                    i10 = 2;
                } else if (iFloorMod2 % 10 == 0) {
                    i10 = 3;
                }
            }
        }
        int i19 = i10 + 19;
        int i20 = (z10 ? shanghaiZoneOffsetTotalSeconds == 0 ? 1 : 6 : 0) + i19;
        if (JDKUtils.STRING_CREATOR_JDK8 != null) {
            char[] cArr = new char[i20];
            IOUtils.writeLocalDate(cArr, 0, i15, i13, i14);
            cArr[10] = ' ';
            IOUtils.writeLocalTime(cArr, 11, i16, i17, i18);
            if (i10 > 0) {
                cArr[19] = '.';
                for (int i21 = 20; i21 < i20; i21++) {
                    cArr[i21] = '0';
                }
                if (iFloorMod2 < 10) {
                    IOUtils.getChars(iFloorMod2, i19, cArr);
                } else if (iFloorMod2 % 100 == 0) {
                    IOUtils.getChars(iFloorMod2 / 100, i19, cArr);
                } else if (iFloorMod2 % 10 == 0) {
                    IOUtils.getChars(iFloorMod2 / 10, i19, cArr);
                } else {
                    IOUtils.getChars(iFloorMod2, i19, cArr);
                }
            }
            if (z10) {
                int i22 = shanghaiZoneOffsetTotalSeconds / 3600;
                if (shanghaiZoneOffsetTotalSeconds == 0) {
                    cArr[i19] = 'Z';
                } else {
                    int iAbs = Math.abs(i22);
                    if (i22 >= 0) {
                        cArr[i19] = '+';
                    } else {
                        cArr[i19] = '-';
                    }
                    cArr[i10 + 20] = '0';
                    int i23 = i10 + 22;
                    IOUtils.getChars(iAbs, i23, cArr);
                    cArr[i23] = ':';
                    cArr[i10 + 23] = '0';
                    int i24 = (shanghaiZoneOffsetTotalSeconds - (i22 * 3600)) / 60;
                    if (i24 < 0) {
                        i24 = -i24;
                    }
                    IOUtils.getChars(i24, i20, cArr);
                }
            }
            return JDKUtils.STRING_CREATOR_JDK8.apply(cArr, Boolean.TRUE);
        }
        byte[] bArr = new byte[i20];
        IOUtils.writeLocalDate(bArr, 0, i15, i13, i14);
        bArr[10] = 32;
        IOUtils.writeLocalTime(bArr, 11, i16, i17, i18);
        if (i10 > 0) {
            bArr[19] = 46;
            for (int i25 = 20; i25 < i20; i25++) {
                bArr[i25] = JSONB.Constants.BC_INT32_BYTE_MIN;
            }
            if (iFloorMod2 < 10) {
                IOUtils.getChars(iFloorMod2, i19, bArr);
            } else if (iFloorMod2 % 100 == 0) {
                IOUtils.getChars(iFloorMod2 / 100, i19, bArr);
            } else if (iFloorMod2 % 10 == 0) {
                IOUtils.getChars(iFloorMod2 / 10, i19, bArr);
            } else {
                IOUtils.getChars(iFloorMod2, i19, bArr);
            }
        }
        if (z10) {
            int i26 = shanghaiZoneOffsetTotalSeconds / 3600;
            if (shanghaiZoneOffsetTotalSeconds == 0) {
                bArr[i19] = 90;
            } else {
                int iAbs2 = Math.abs(i26);
                if (i26 >= 0) {
                    bArr[i19] = 43;
                } else {
                    bArr[i19] = 45;
                }
                bArr[i10 + 20] = JSONB.Constants.BC_INT32_BYTE_MIN;
                int i27 = i10 + 22;
                IOUtils.getChars(iAbs2, i27, bArr);
                bArr[i27] = 58;
                bArr[i10 + 23] = JSONB.Constants.BC_INT32_BYTE_MIN;
                int i28 = (shanghaiZoneOffsetTotalSeconds - (i26 * 3600)) / 60;
                if (i28 < 0) {
                    i28 = -i28;
                }
                IOUtils.getChars(i28, i20, bArr);
            }
        }
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        return biFunction != null ? biFunction.apply(bArr, JDKUtils.LATIN1) : new String(bArr, 0, i20, StandardCharsets.ISO_8859_1);
    }

    public static long utcSeconds(int i10, int i11, int i12, int i13, int i14, int i15) {
        return (calcEpochDay(i10, i11, i12) * 86400) + ((long) (i13 * 3600)) + ((long) (i14 * 60)) + ((long) i15);
    }

    /* JADX INFO: renamed from: yy */
    public static int m6496yy(byte[] bArr, int i10) {
        short sReverseBytes = JDKUtils.UNSAFE.getShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        if (JDKUtils.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i11 = sReverseBytes & 3855;
        if (((61680 & (i11 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((sReverseBytes & 15) * 1000) + ((i11 >> 8) * 100);
    }

    public static ZoneOffset zoneOffset(byte[] bArr, int i10, int i11) {
        return ZoneOffset.of(new String(bArr, i10, i11));
    }

    public static LocalDateTime localDateTime(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23) {
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int i10 = ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0');
            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                int i11 = ((c14 - '0') * 10) + (c15 - '0');
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9') {
                    int i12 = ((c16 - '0') * 10) + (c17 - '0');
                    if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                        int i13 = ((c18 - '0') * 10) + (c19 - '0');
                        if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                            int i14 = ((c20 - '0') * 10) + (c21 - '0');
                            if (c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                int i15 = ((c22 - '0') * 10) + (c23 - '0');
                                if ((i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0 || i14 != 0 || i15 != 0) && i13 <= 24 && i14 <= 60 && i15 <= 60) {
                                    return LocalDateTime.of(i10, i11, i12, i13, i14, i15, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ZoneOffset zoneOffset(char[] cArr, int i10, int i11) {
        return ZoneOffset.of(new String(cArr, i10, i11));
    }

    private static int month(byte b10, byte b11, byte b12) {
        return month((char) b10, (char) b11, (char) b12);
    }

    public static LocalTime parseLocalTime8(byte[] bArr, int i10) {
        if (i10 + 8 > bArr.length) {
            return null;
        }
        long jHms = hms(bArr, i10);
        if (jHms == -1) {
            return null;
        }
        return LocalTime.of(((int) jHms) & 255, ((int) (jHms >> 24)) & 255, ((int) (jHms >> 48)) & 255);
    }

    public static int readNanos(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = bArr[i11 + i13] + JSONB.Constants.BC_INT64_BYTE_ZERO;
            if ((i14 < 0) || (i14 > 9)) {
                return -1;
            }
            i12 = (i12 * 10) + i14;
        }
        return i12 * POWERS[(9 - i10) & 15];
    }

    public static LocalDateTime parseLocalDateTime14(byte[] bArr, int i10) {
        if (i10 + 14 > bArr.length) {
            return null;
        }
        int iDigit4 = IOUtils.digit4(bArr, i10);
        int iDigit2 = IOUtils.digit2(bArr, i10 + 4);
        int iDigit22 = IOUtils.digit2(bArr, i10 + 6);
        int iDigit23 = IOUtils.digit2(bArr, i10 + 8);
        int iDigit24 = IOUtils.digit2(bArr, i10 + 10);
        int iDigit25 = IOUtils.digit2(bArr, i10 + 12);
        if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24 | iDigit25) < 0) {
            return null;
        }
        return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, iDigit25);
    }

    public static LocalTime parseLocalTime5(char[] cArr, int i10) {
        int iDigit1;
        int iDigit2;
        int iDigit22;
        if (i10 + 5 > cArr.length) {
            return null;
        }
        int i11 = i10 + 2;
        if (cArr[i11] == ':') {
            iDigit22 = IOUtils.digit2(cArr, i10);
            iDigit2 = IOUtils.digit2(cArr, i10 + 3);
            iDigit1 = 0;
        } else {
            if (cArr[i10 + 1] != ':' || cArr[i10 + 3] != ':') {
                return null;
            }
            int iDigit12 = IOUtils.digit1(cArr, i10);
            int iDigit13 = IOUtils.digit1(cArr, i11);
            iDigit1 = IOUtils.digit1(cArr, i10 + 4);
            iDigit2 = iDigit13;
            iDigit22 = iDigit12;
        }
        return localTime(iDigit22, iDigit2, iDigit1);
    }

    public static LocalTime parseLocalTime15(byte[] bArr, int i10) {
        if (i10 + 15 <= bArr.length) {
            long jHms = hms(bArr, i10);
            if (jHms != -1 && bArr[i10 + 8] == 46) {
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 6, i10 + 9);
                if (nanos < 0) {
                    return null;
                }
                return LocalTime.of(i11, i12, i13, nanos);
            }
        }
        return null;
    }

    public static LocalTime parseLocalTime18(byte[] bArr, int i10) {
        if (i10 + 18 <= bArr.length) {
            long jHms = hms(bArr, i10);
            if (jHms != -1 && bArr[i10 + 8] == 46) {
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 9, i10 + 9);
                if (nanos < 0) {
                    return null;
                }
                return LocalTime.of(i11, i12, i13, nanos);
            }
        }
        return null;
    }

    public static LocalTime parseLocalTime10(char[] cArr, int i10) {
        if (i10 + 10 > cArr.length || cArr[i10 + 2] != ':' || cArr[i10 + 5] != ':' || cArr[i10 + 8] != '.') {
            return null;
        }
        int iDigit2 = IOUtils.digit2(cArr, i10);
        int iDigit22 = IOUtils.digit2(cArr, i10 + 3);
        int iDigit23 = IOUtils.digit2(cArr, i10 + 6);
        int iDigit1 = IOUtils.digit1(cArr, i10 + 9);
        if (iDigit1 > 0) {
            iDigit1 *= 100000000;
        }
        if ((iDigit2 | iDigit22 | iDigit23 | iDigit22) < 0) {
            return null;
        }
        return LocalTime.of(iDigit2, iDigit22, iDigit23, iDigit1);
    }

    public static LocalTime parseLocalTime11(byte[] bArr, int i10) {
        if (i10 + 11 > bArr.length) {
            return null;
        }
        long jHms = hms(bArr, i10);
        if (jHms == -1 || bArr[i10 + 8] != 46) {
            return null;
        }
        int i11 = ((int) jHms) & 255;
        int i12 = ((int) (jHms >> 24)) & 255;
        int i13 = ((int) (jHms >> 48)) & 255;
        int iDigit2 = IOUtils.digit2(bArr, i10 + 9);
        if (iDigit2 > 0) {
            iDigit2 *= 10000000;
        }
        return LocalTime.of(i11, i12, i13, iDigit2);
    }

    public static LocalTime parseLocalTime12(byte[] bArr, int i10) {
        if (i10 + 12 > bArr.length) {
            return null;
        }
        long jHms = hms(bArr, i10);
        if (jHms == -1 || bArr[i10 + 8] != 46) {
            return null;
        }
        int i11 = ((int) jHms) & 255;
        int i12 = ((int) (jHms >> 24)) & 255;
        int i13 = ((int) (jHms >> 48)) & 255;
        int iDigit3 = IOUtils.digit3(bArr, i10 + 9);
        if (iDigit3 > 0) {
            iDigit3 *= 1000000;
        }
        return LocalTime.of(i11, i12, i13, iDigit3);
    }

    public static LocalTime parseLocalTime6(char[] cArr, int i10) {
        int iDigit1;
        int iDigit12;
        int iDigit2;
        int i11 = i10 + 5;
        if (i11 > cArr.length) {
            return null;
        }
        char c10 = cArr[i10 + 1];
        int i12 = i10 + 4;
        char c11 = cArr[i12];
        int i13 = i10 + 2;
        if (cArr[i13] == ':' && c11 == ':') {
            iDigit1 = IOUtils.digit2(cArr, i10);
            iDigit12 = IOUtils.digit1(cArr, i10 + 3);
            iDigit2 = IOUtils.digit1(cArr, i11);
        } else if (c10 == ':' && c11 == ':') {
            iDigit1 = IOUtils.digit1(cArr, i10);
            iDigit12 = IOUtils.digit2(cArr, i13);
            iDigit2 = IOUtils.digit1(cArr, i11);
        } else {
            if (c10 != ':' || cArr[i10 + 3] != ':') {
                return null;
            }
            iDigit1 = IOUtils.digit1(cArr, i10);
            iDigit12 = IOUtils.digit1(cArr, i13);
            iDigit2 = IOUtils.digit2(cArr, i12);
        }
        return localTime(iDigit1, iDigit12, iDigit2);
    }

    public static LocalTime parseLocalTime7(char[] cArr, int i10) {
        int iDigit2;
        int iDigit1;
        int iDigit12;
        int i11 = i10 + 5;
        if (i11 > cArr.length) {
            return null;
        }
        int i12 = i10 + 2;
        char c10 = cArr[i12];
        char c11 = cArr[i10 + 4];
        if (cArr[i10 + 1] == ':' && c11 == ':') {
            iDigit12 = IOUtils.digit1(cArr, i10);
            iDigit2 = IOUtils.digit2(cArr, i12);
            iDigit1 = IOUtils.digit2(cArr, i11);
        } else if (c10 == ':' && c11 == ':') {
            int iDigit22 = IOUtils.digit2(cArr, i10);
            int iDigit13 = IOUtils.digit1(cArr, i10 + 3);
            iDigit1 = IOUtils.digit2(cArr, i11);
            iDigit2 = iDigit13;
            iDigit12 = iDigit22;
        } else {
            if (c10 != ':' || cArr[i11] != ':') {
                return null;
            }
            int iDigit23 = IOUtils.digit2(cArr, i10);
            iDigit2 = IOUtils.digit2(cArr, i10 + 3);
            iDigit1 = IOUtils.digit1(cArr, i10 + 6);
            iDigit12 = iDigit23;
        }
        return localTime(iDigit12, iDigit2, iDigit1);
    }

    public static LocalDateTime parseLocalDateTime12(byte[] bArr, int i10) {
        int i11 = i10 + 12;
        if (i11 <= bArr.length) {
            int iDigit4 = IOUtils.digit4(bArr, i10);
            int iDigit2 = IOUtils.digit2(bArr, i10 + 4);
            int iDigit22 = IOUtils.digit2(bArr, i10 + 6);
            int iDigit23 = IOUtils.digit2(bArr, i10 + 8);
            int iDigit24 = IOUtils.digit2(bArr, i10 + 10);
            if ((iDigit4 | iDigit2 | iDigit22 | iDigit23 | iDigit24) < 0) {
                String str = new String(bArr, i10, i11);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            if (iDigit4 == 0 && iDigit2 == 0 && iDigit22 == 0 && iDigit23 == 0 && iDigit24 == 0) {
                return null;
            }
            return LocalDateTime.of(iDigit4, iDigit2, iDigit22, iDigit23, iDigit24, 0);
        }
        String str2 = new String(bArr, i10, bArr.length - i10);
        throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
    }

    public static long millis(LocalDateTime localDateTime, ZoneId zoneId) {
        return millis(zoneId, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano());
    }

    public static LocalDateTime parseLocalDateTime20(byte[] bArr, int i10) {
        if (i10 + 19 <= bArr.length && bArr[i10 + 2] == 32 && bArr[i10 + 6] == 32 && bArr[i10 + 11] == 32) {
            long jHms = hms(bArr, i10 + 12);
            if (jHms != -1) {
                int iDigit2 = IOUtils.digit2(bArr, i10);
                int iMonth = month(bArr[i10 + 3], bArr[i10 + 4], bArr[i10 + 5]);
                int iDigit4 = IOUtils.digit4(bArr, i10 + 7);
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                if ((iDigit4 | iMonth | iDigit2 | i11 | i12 | i13) > 0 && i11 <= 24 && i12 <= 59 && i13 <= 60) {
                    return LocalDateTime.of(iDigit4, iMonth, iDigit2, i11, i12, i13);
                }
            }
        }
        return null;
    }

    public static long millis(LocalDateTime localDateTime) {
        return millis(null, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano());
    }

    public static LocalDateTime parseLocalDateTime26(byte[] bArr, int i10) {
        byte b10;
        if (i10 + 26 <= bArr.length && bArr[i10 + 4] == 45 && bArr[i10 + 7] == 45 && ((b10 = bArr[i10 + 10]) == 32 || b10 == 84)) {
            long jHms = hms(bArr, i10 + 11);
            if (jHms != -1 && bArr[i10 + 19] == 46) {
                int iDigit4 = IOUtils.digit4(bArr, i10);
                int iDigit2 = IOUtils.digit2(bArr, i10 + 5);
                int iDigit22 = IOUtils.digit2(bArr, i10 + 8);
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 6, i10 + 20);
                if ((iDigit4 | iDigit2 | iDigit22 | i11 | i12 | i13 | nanos) > 0 && i11 <= 24 && i12 <= 59 && i13 <= 60) {
                    return LocalDateTime.of(iDigit4, iDigit2, iDigit22, i11, i12, i13, nanos);
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime27(byte[] bArr, int i10) {
        byte b10;
        if (i10 + 27 <= bArr.length && bArr[i10 + 4] == 45 && bArr[i10 + 7] == 45 && ((b10 = bArr[i10 + 10]) == 32 || b10 == 84)) {
            long jHms = hms(bArr, i10 + 11);
            if (jHms != -1 && bArr[i10 + 19] == 46) {
                int iDigit4 = IOUtils.digit4(bArr, i10);
                int iDigit2 = IOUtils.digit2(bArr, i10 + 5);
                int iDigit22 = IOUtils.digit2(bArr, i10 + 8);
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 7, i10 + 20);
                if ((iDigit4 | iDigit2 | iDigit22 | i11 | i12 | i13 | nanos) > 0 && i11 <= 24 && i12 <= 59 && i13 <= 60) {
                    return LocalDateTime.of(iDigit4, iDigit2, iDigit22, i11, i12, i13, nanos);
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime28(byte[] bArr, int i10) {
        byte b10;
        if (i10 + 28 <= bArr.length && bArr[i10 + 4] == 45 && bArr[i10 + 7] == 45 && ((b10 = bArr[i10 + 10]) == 32 || b10 == 84)) {
            long jHms = hms(bArr, i10 + 11);
            if (jHms != -1 && bArr[i10 + 19] == 46) {
                int iDigit4 = IOUtils.digit4(bArr, i10);
                int iDigit2 = IOUtils.digit2(bArr, i10 + 5);
                int iDigit22 = IOUtils.digit2(bArr, i10 + 8);
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 8, i10 + 20);
                if ((iDigit4 | iDigit2 | iDigit22 | i11 | i12 | i13 | nanos) > 0 && i11 <= 24 && i12 <= 59 && i13 <= 60) {
                    return LocalDateTime.of(iDigit4, iDigit2, iDigit22, i11, i12, i13, nanos);
                }
            }
        }
        return null;
    }

    public static LocalDateTime parseLocalDateTime29(byte[] bArr, int i10) {
        byte b10;
        if (i10 + 29 <= bArr.length && bArr[i10 + 4] == 45 && bArr[i10 + 7] == 45 && ((b10 = bArr[i10 + 10]) == 32 || b10 == 84)) {
            long jHms = hms(bArr, i10 + 11);
            if (jHms != -1 && bArr[i10 + 19] == 46) {
                int iDigit4 = IOUtils.digit4(bArr, i10);
                int iDigit2 = IOUtils.digit2(bArr, i10 + 5);
                int iDigit22 = IOUtils.digit2(bArr, i10 + 8);
                int i11 = ((int) jHms) & 255;
                int i12 = ((int) (jHms >> 24)) & 255;
                int i13 = ((int) (jHms >> 48)) & 255;
                int nanos = readNanos(bArr, 9, i10 + 20);
                if ((iDigit4 | iDigit2 | iDigit22 | i11 | i12 | i13 | nanos) > 0 && i11 <= 24 && i12 <= 59 && i13 <= 60) {
                    return LocalDateTime.of(iDigit4, iDigit2, iDigit22, i11, i12, i13, nanos);
                }
            }
        }
        return null;
    }

    public static LocalDate parseLocalDate(byte[] bArr, int i10, int i11) {
        if (bArr == null || i11 == 0) {
            return null;
        }
        if (i10 + i11 <= bArr.length) {
            switch (i11) {
                case 8:
                    return parseLocalDate8(bArr, i10);
                case 9:
                    return parseLocalDate9(bArr, i10);
                case 10:
                    return parseLocalDate10(bArr, i10);
                case Opcodes.FCONST_0 /* 11 */:
                    return parseLocalDate11(bArr, i10);
                default:
                    if (i11 == 4 && bArr[i10] == 110 && bArr[i10 + 1] == 117 && bArr[i10 + 2] == 108 && bArr[i10 + 3] == 108) {
                        return null;
                    }
                    String str = new String(bArr, i10, i11);
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
        }
        String str2 = new String(bArr, i10, i11);
        throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
    }

    public static LocalDate parseLocalDate11(byte[] bArr, int i10) {
        int iDigit2;
        int iDigit22;
        int iDigit4;
        if (i10 + 11 > bArr.length) {
            return null;
        }
        int i11 = i10 + 4;
        if (bArr[i11] == 45 && bArr[i10 + 7] == 45 && bArr[i10 + 10] == 90) {
            iDigit4 = IOUtils.digit4(bArr, i10);
            iDigit22 = IOUtils.digit2(bArr, i10 + 5);
            iDigit2 = IOUtils.digit2(bArr, i10 + 8);
        } else {
            if (bArr[i10 + 2] == 32 && bArr[i10 + 6] == 32) {
                int iDigit42 = IOUtils.digit4(bArr, i10 + 7);
                int iMonth = month((char) bArr[i10 + 3], (char) bArr[i11], (char) bArr[i10 + 5]);
                iDigit2 = IOUtils.digit2(bArr, i10);
                iDigit22 = iMonth;
                iDigit4 = iDigit42;
            }
            return null;
        }
        if ((iDigit4 | iDigit22 | iDigit2) >= 0 && (iDigit4 != 0 || iDigit22 != 0 || iDigit2 != 0)) {
            return LocalDate.of(iDigit4, iDigit22, iDigit2);
        }
        return null;
    }

    public static LocalDate parseLocalDate8(char[] cArr, int i10) {
        int iDigit4;
        int iDigit2;
        int iDigit22;
        if (i10 + 8 > cArr.length) {
            return null;
        }
        char c10 = cArr[i10 + 1];
        char c11 = cArr[i10 + 3];
        int i11 = i10 + 4;
        char c12 = cArr[i11];
        if (c12 == '-' && cArr[i10 + 6] == '-') {
            iDigit4 = IOUtils.digit4(cArr, i10);
            iDigit2 = IOUtils.digit1(cArr, i10 + 5);
            iDigit22 = IOUtils.digit1(cArr, i10 + 7);
        } else if (c10 == '/' && c11 == '/') {
            iDigit2 = IOUtils.digit1(cArr, i10);
            int iDigit1 = IOUtils.digit1(cArr, i10 + 2);
            iDigit4 = IOUtils.digit4(cArr, i11);
            iDigit22 = iDigit1;
        } else if (c10 == '-' && cArr[i10 + 5] == '-') {
            int iDigit12 = IOUtils.digit1(cArr, i10);
            iDigit2 = month(cArr[i10 + 2], c11, c12);
            int iDigit23 = IOUtils.digit2(cArr, i10 + 6);
            if (iDigit23 != -1) {
                iDigit23 += 2000;
            }
            iDigit4 = iDigit23;
            iDigit22 = iDigit12;
        } else {
            iDigit4 = IOUtils.digit4(cArr, i10);
            iDigit2 = IOUtils.digit2(cArr, i11);
            iDigit22 = IOUtils.digit2(cArr, i10 + 6);
        }
        if ((iDigit4 | iDigit2 | iDigit22) <= 0) {
            return null;
        }
        return LocalDate.of(iDigit4, iDigit2, iDigit22);
    }

    public static ZonedDateTime parseZonedDateTime(String str, ZoneId zoneId) {
        ZonedDateTime zonedDateTime;
        Function<String, byte[]> function;
        if (str == null || str.length() == 0) {
            return null;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null && toIntFunction.applyAsInt(str) == 0) {
            byte[] bArrApply = function.apply(str);
            zonedDateTime = parseZonedDateTime(bArrApply, 0, bArrApply.length, zoneId);
        } else {
            char[] charArray = JDKUtils.getCharArray(str);
            zonedDateTime = parseZonedDateTime(charArray, 0, charArray.length, zoneId);
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

    public static LocalDate parseLocalDate(char[] cArr, int i10, int i11) {
        if (cArr == null || i11 == 0) {
            return null;
        }
        if (i10 + i11 <= cArr.length) {
            switch (i11) {
                case 8:
                    return parseLocalDate8(cArr, i10);
                case 9:
                    return parseLocalDate9(cArr, i10);
                case 10:
                    return parseLocalDate10(cArr, i10);
                case Opcodes.FCONST_0 /* 11 */:
                    return parseLocalDate11(cArr, i10);
                default:
                    if (i11 == 4 && cArr[i10] == 'n' && cArr[i10 + 1] == 'u' && cArr[i10 + 2] == 'l' && cArr[i10 + 3] == 'l') {
                        return null;
                    }
                    String str = new String(cArr, i10, i11);
                    throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
        }
        String str2 = new String(cArr, i10, i11);
        throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
    }

    public static ZonedDateTime parseZonedDateTime(byte[] bArr, int i10, int i11) {
        return parseZonedDateTime(bArr, i10, i11, DEFAULT_ZONE_ID);
    }

    public static ZonedDateTime parseZonedDateTime(char[] cArr, int i10, int i11) {
        return parseZonedDateTime(cArr, i10, i11, DEFAULT_ZONE_ID);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.ZonedDateTime parseZonedDateTime(char[] r64, int r65, int r66, java.time.ZoneId r67) {
        /*
            Method dump skipped, instruction units count: 4384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(char[], int, int, java.time.ZoneId):java.time.ZonedDateTime");
    }

    public static LocalDateTime parseLocalDateTime(String str) {
        if (str == null) {
            return null;
        }
        return parseLocalDateTime(str, 0, str.length());
    }

    public static LocalDateTime parseLocalDateTime(char[] cArr, int i10, int i11) {
        if (cArr == null || i11 == 0) {
            return null;
        }
        switch (i11) {
            case 4:
                if (cArr[i10] == 'n' && cArr[i10 + 1] == 'u' && cArr[i10 + 2] == 'l' && cArr[i10 + 3] == 'l') {
                    return null;
                }
                String str = new String(cArr, i10, i11);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case Opcodes.FCONST_2 /* 13 */:
            case 15:
            default:
                return parseLocalDateTimeX(cArr, i10, i11);
            case 8:
                if (cArr[2] == ':' && cArr[5] == ':') {
                    return LocalDateTime.of(LOCAL_DATE_19700101, parseLocalTime8(cArr, i10));
                }
                LocalDate localDate8 = parseLocalDate8(cArr, i10);
                if (localDate8 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate8, LocalTime.MIN);
            case 9:
                LocalDate localDate9 = parseLocalDate9(cArr, i10);
                if (localDate9 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate9, LocalTime.MIN);
            case 10:
                LocalDate localDate10 = parseLocalDate10(cArr, i10);
                if (localDate10 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate10, LocalTime.MIN);
            case Opcodes.FCONST_0 /* 11 */:
                LocalDate localDate11 = parseLocalDate11(cArr, i10);
                if (localDate11 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate11, LocalTime.MIN);
            case Opcodes.FCONST_1 /* 12 */:
                return parseLocalDateTime12(cArr, i10);
            case Opcodes.DCONST_0 /* 14 */:
                return parseLocalDateTime14(cArr, i10);
            case 16:
                return parseLocalDateTime16(cArr, i10);
            case Opcodes.SIPUSH /* 17 */:
                return parseLocalDateTime17(cArr, i10);
            case Opcodes.LDC /* 18 */:
                return parseLocalDateTime18(cArr, i10);
            case 19:
                return parseLocalDateTime19(cArr, i10);
            case 20:
                return parseLocalDateTime20(cArr, i10);
        }
    }

    public static LocalDateTime parseLocalDateTime(byte[] bArr, int i10, int i11) {
        if (bArr == null || i11 == 0) {
            return null;
        }
        switch (i11) {
            case 4:
                if (bArr[i10] == 110 && bArr[i10 + 1] == 117 && bArr[i10 + 2] == 108 && bArr[i10 + 3] == 108) {
                    return null;
                }
                String str = new String(bArr, i10, i11);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case Opcodes.FCONST_2 /* 13 */:
            case 15:
            default:
                return parseLocalDateTimeX(bArr, i10, i11);
            case 8:
                LocalDate localDate8 = parseLocalDate8(bArr, i10);
                if (localDate8 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate8, LocalTime.MIN);
            case 9:
                LocalDate localDate9 = parseLocalDate9(bArr, i10);
                if (localDate9 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate9, LocalTime.MIN);
            case 10:
                LocalDate localDate10 = parseLocalDate10(bArr, i10);
                if (localDate10 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate10, LocalTime.MIN);
            case Opcodes.FCONST_0 /* 11 */:
                return LocalDateTime.of(parseLocalDate11(bArr, i10), LocalTime.MIN);
            case Opcodes.FCONST_1 /* 12 */:
                return parseLocalDateTime12(bArr, i10);
            case Opcodes.DCONST_0 /* 14 */:
                return parseLocalDateTime14(bArr, i10);
            case 16:
                return parseLocalDateTime16(bArr, i10);
            case Opcodes.SIPUSH /* 17 */:
                return parseLocalDateTime17(bArr, i10);
            case Opcodes.LDC /* 18 */:
                return parseLocalDateTime18(bArr, i10);
            case 19:
                return parseLocalDateTime19(bArr, i10);
            case 20:
                return parseLocalDateTime20(bArr, i10);
        }
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

    public static LocalDateTime parseLocalDateTime19(String str, int i10) {
        Function<String, byte[]> function;
        int i11 = i10 + 19;
        if (i11 > str.length()) {
            return null;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null && toIntFunction.applyAsInt(str) == 0) {
            return parseLocalDateTime19(function.apply(str), i10);
        }
        if (JDKUtils.JVM_VERSION == 8 && !JDKUtils.FIELD_STRING_VALUE_ERROR) {
            return parseLocalDateTime19(JDKUtils.getCharArray(str), i10);
        }
        char[] cArr = new char[19];
        str.getChars(i10, i11, cArr, 0);
        return parseLocalDateTime19(cArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime19(byte[] r14, int r15) {
        /*
            int r0 = r15 + 19
            int r1 = r14.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            int r0 = r15 + 1
            r0 = r14[r0]
            int r1 = r15 + 2
            r1 = r14[r1]
            int r3 = r15 + 3
            r4 = r14[r3]
            int r5 = r15 + 4
            r5 = r14[r5]
            int r6 = r15 + 5
            r7 = r14[r6]
            int r8 = r15 + 7
            r8 = r14[r8]
            int r9 = r15 + 10
            r9 = r14[r9]
            r10 = 84
            r11 = 45
            r12 = 47
            r13 = 32
            if (r5 != r11) goto L2f
            if (r8 == r11) goto L33
        L2f:
            if (r5 != r12) goto L49
            if (r8 != r12) goto L49
        L33:
            if (r9 == r13) goto L37
            if (r9 != r10) goto L49
        L37:
            int r0 = com.alibaba.fastjson2.util.IOUtils.digit4(r14, r15)
            int r1 = com.alibaba.fastjson2.util.IOUtils.digit2(r14, r6)
            int r3 = r15 + 8
            int r3 = com.alibaba.fastjson2.util.IOUtils.digit2(r14, r3)
        L45:
            r4 = r0
            r5 = r1
            r6 = r3
            goto L78
        L49:
            if (r1 != r12) goto L63
            if (r7 != r12) goto L63
            if (r9 == r13) goto L51
            if (r9 != r10) goto L63
        L51:
            int r0 = com.alibaba.fastjson2.util.IOUtils.digit2(r14, r15)
            int r1 = com.alibaba.fastjson2.util.IOUtils.digit2(r14, r3)
            int r3 = r15 + 6
            int r3 = com.alibaba.fastjson2.util.IOUtils.digit4(r14, r3)
            r6 = r0
            r5 = r1
            r4 = r3
            goto L78
        L63:
            if (r0 != r13) goto L9f
            if (r7 != r13) goto L9f
            if (r9 != r13) goto L9f
            int r3 = com.alibaba.fastjson2.util.IOUtils.digit1(r14, r15)
            int r1 = month(r1, r4, r5)
            int r0 = r15 + 6
            int r0 = com.alibaba.fastjson2.util.IOUtils.digit4(r14, r0)
            goto L45
        L78:
            int r15 = r15 + 11
            long r14 = hms(r14, r15)
            r0 = r4 | r5
            r0 = r0 | r6
            long r0 = (long) r0
            long r0 = r0 | r14
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L8a
            return r2
        L8a:
            int r0 = (int) r14
            r7 = r0 & 255(0xff, float:3.57E-43)
            r0 = 24
            long r0 = r14 >> r0
            int r0 = (int) r0
            r8 = r0 & 255(0xff, float:3.57E-43)
            r0 = 48
            long r14 = r14 >> r0
            int r14 = (int) r14
            r9 = r14 & 255(0xff, float:3.57E-43)
            java.time.LocalDateTime r14 = java.time.LocalDateTime.of(r4, r5, r6, r7, r8, r9)
            return r14
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byte[], int):java.time.LocalDateTime");
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

    public static LocalDate parseLocalDate10(byte[] bArr, int i10) {
        int iMonth;
        int iDigit4;
        int iDigit2;
        int iDigit22;
        int iDigit42;
        if (i10 + 10 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i10 + 2];
        char c11 = (char) bArr[i10 + 4];
        int i11 = i10 + 5;
        char c12 = (char) bArr[i11];
        char c13 = (char) bArr[i10 + 7];
        if ((c11 == '-' && c13 == '-') || (c11 == '/' && c13 == '/')) {
            iDigit4 = IOUtils.digit4(bArr, i10);
            iMonth = IOUtils.digit2(bArr, i11);
            iDigit2 = IOUtils.digit2(bArr, i10 + 8);
        } else {
            if ((c10 == '.' && c12 == '.') || (c10 == '-' && c12 == '-')) {
                iDigit22 = IOUtils.digit2(bArr, i10);
                iMonth = IOUtils.digit2(bArr, i10 + 3);
                iDigit42 = IOUtils.digit4(bArr, i10 + 6);
            } else if (c10 == '/' && c12 == '/') {
                iMonth = IOUtils.digit2(bArr, i10);
                iDigit22 = IOUtils.digit2(bArr, i10 + 3);
                iDigit42 = IOUtils.digit4(bArr, i10 + 6);
            } else {
                if (bArr[i10 + 1] != 32 || c12 != ' ') {
                    return null;
                }
                int iDigit1 = IOUtils.digit1(bArr, i10);
                iMonth = month(c10, (char) bArr[i10 + 3], c11);
                iDigit4 = IOUtils.digit4(bArr, i10 + 6);
                iDigit2 = iDigit1;
            }
            int i12 = iDigit22;
            iDigit4 = iDigit42;
            iDigit2 = i12;
        }
        if ((iDigit4 | iMonth | iDigit2) <= 0) {
            return null;
        }
        return LocalDate.of(iDigit4, iMonth, iDigit2);
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

    public static String formatYMD10(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return formatYMD10(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    public static String format(int i10, int i11, int i12) {
        return format(i10, i11, i12, DateTimeFormatPattern.DATE_FORMAT_10_DASH);
    }

    public static String formatYMD10(Date date) {
        if (date == null) {
            return null;
        }
        return formatYMD10(date.getTime(), DEFAULT_ZONE_ID);
    }

    public static String format(int i10, int i11, int i12, DateTimeFormatPattern dateTimeFormatPattern) {
        int i13 = i10 / 100;
        int i14 = i10 - (i13 * 100);
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[10];
            if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
                IOUtils.writeDigitPair(bArr, 0, i12);
                bArr[2] = 46;
                IOUtils.writeDigitPair(bArr, 3, i11);
                bArr[5] = 46;
                IOUtils.writeDigitPair(bArr, 6, i13);
                IOUtils.writeDigitPair(bArr, 8, i14);
            } else {
                byte b10 = (byte) (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH ? 45 : 47);
                IOUtils.writeDigitPair(bArr, 0, i13);
                IOUtils.writeDigitPair(bArr, 2, i14);
                bArr[4] = b10;
                IOUtils.writeDigitPair(bArr, 5, i11);
                bArr[7] = b10;
                IOUtils.writeDigitPair(bArr, 8, i12);
            }
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[10];
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            IOUtils.writeDigitPair(cArr, 0, i12);
            cArr[2] = '.';
            IOUtils.writeDigitPair(cArr, 3, i11);
            cArr[5] = '.';
            IOUtils.writeDigitPair(cArr, 6, i13);
            IOUtils.writeDigitPair(cArr, 8, i14);
        } else {
            char c10 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH ? '-' : '/';
            IOUtils.writeDigitPair(cArr, 0, i13);
            IOUtils.writeDigitPair(cArr, 2, i14);
            cArr[4] = c10;
            IOUtils.writeDigitPair(cArr, 5, i11);
            cArr[7] = c10;
            IOUtils.writeDigitPair(cArr, 8, i12);
        }
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        if (biFunction2 != null) {
            return biFunction2.apply(cArr, Boolean.TRUE);
        }
        return new String(cArr);
    }

    public static String formatYMD10(int i10, int i11, int i12) {
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[10];
            IOUtils.writeLocalDate(bArr, 0, i10, i11, i12);
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[10];
        IOUtils.writeLocalDate(cArr, 0, i10, i11, i12);
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        if (biFunction2 != null) {
            return biFunction2.apply(cArr, Boolean.TRUE);
        }
        return new String(cArr);
    }

    public static ZonedDateTime parseZonedDateTime16(char[] cArr, int i10, ZoneId zoneId) {
        if (i10 + 16 <= cArr.length) {
            char c10 = cArr[i10];
            char c11 = cArr[i10 + 1];
            char c12 = cArr[i10 + 2];
            char c13 = cArr[i10 + 3];
            char c14 = cArr[i10 + 4];
            char c15 = cArr[i10 + 5];
            char c16 = cArr[i10 + 6];
            char c17 = cArr[i10 + 7];
            char c18 = cArr[i10 + 8];
            char c19 = cArr[i10 + 9];
            int i11 = i10 + 10;
            char c20 = cArr[i11];
            char c21 = cArr[i10 + 13];
            if (c14 != '-' || c17 != '-' || ((c20 != '+' && c20 != '-') || c21 != ':')) {
                String str = new String(cArr, i10, 16);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            }
            if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
                String str2 = new String(cArr, i10, 16);
                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
            }
            int i12 = ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0');
            if (c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9') {
                String str3 = new String(cArr, i10, 16);
                throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
            }
            int i13 = ((c15 - '0') * 10) + (c16 - '0');
            if (c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(i12, i13, ((c18 - '0') * 10) + (c19 - '0')), LocalTime.MIN), getZoneId(new String(cArr, i11, 6), zoneId));
            }
            String str4 = new String(cArr, i10, 16);
            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
        }
        String str5 = new String(cArr, i10, cArr.length - i10);
        throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
    }

    public static String formatYMD8(Date date) {
        if (date == null) {
            return null;
        }
        return formatYMD8(date.getTime(), DEFAULT_ZONE_ID);
    }

    public static String formatYMD8(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        int i10 = year / 100;
        int i11 = year - (i10 * 100);
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[8];
            IOUtils.writeDigitPair(bArr, 0, i10);
            IOUtils.writeDigitPair(bArr, 2, i11);
            IOUtils.writeDigitPair(bArr, 4, monthValue);
            IOUtils.writeDigitPair(bArr, 6, dayOfMonth);
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[8];
        IOUtils.writeDigitPair(cArr, 0, i10);
        IOUtils.writeDigitPair(cArr, 2, i11);
        IOUtils.writeDigitPair(cArr, 4, monthValue);
        IOUtils.writeDigitPair(cArr, 6, dayOfMonth);
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        if (biFunction2 != null) {
            return biFunction2.apply(cArr, Boolean.TRUE);
        }
        return new String(cArr);
    }

    public static LocalDate parseLocalDate9(byte[] bArr, int i10) {
        int iDigit2;
        int iDigit1;
        int iDigit4;
        int iDigit42;
        int iDigit22;
        if (i10 + 9 > bArr.length) {
            return null;
        }
        char c10 = (char) bArr[i10 + 1];
        int i11 = i10 + 2;
        char c11 = (char) bArr[i11];
        char c12 = (char) bArr[i10 + 4];
        char c13 = (char) bArr[i10 + 6];
        int i12 = i10 + 7;
        char c14 = (char) bArr[i12];
        if ((c12 == '-' && c14 == '-') || (c12 == '/' && c14 == '/')) {
            iDigit42 = IOUtils.digit4(bArr, i10);
            iDigit2 = IOUtils.digit2(bArr, i10 + 5);
            iDigit22 = IOUtils.digit1(bArr, i10 + 8);
        } else if ((c12 == '-' && c13 == '-') || (c12 == '/' && c13 == '/')) {
            iDigit42 = IOUtils.digit4(bArr, i10);
            iDigit2 = IOUtils.digit1(bArr, i10 + 5);
            iDigit22 = IOUtils.digit2(bArr, i12);
        } else {
            if (c10 == '.' && c12 == '.') {
                iDigit1 = IOUtils.digit1(bArr, i10);
                iDigit2 = IOUtils.digit2(bArr, i11);
                iDigit4 = IOUtils.digit4(bArr, i10 + 5);
            } else if ((c11 == '.' && c12 == '.') || (c11 == '-' && c12 == '-')) {
                iDigit1 = IOUtils.digit2(bArr, i10);
                iDigit2 = IOUtils.digit1(bArr, i10 + 3);
                iDigit4 = IOUtils.digit4(bArr, i10 + 5);
            } else if (c10 == '-' && c12 == '-') {
                iDigit1 = IOUtils.digit1(bArr, i10);
                iDigit2 = IOUtils.digit2(bArr, i11);
                iDigit4 = IOUtils.digit4(bArr, i10 + 5);
            } else if (c11 == '-' && c13 == '-') {
                iDigit1 = IOUtils.digit2(bArr, i10);
                iDigit2 = month((char) bArr[i10 + 3], c12, (char) bArr[i10 + 5]);
                iDigit4 = IOUtils.digit2(bArr, i12);
                if (iDigit4 != -1) {
                    iDigit4 += 2000;
                }
            } else if (c10 == '/' && c12 == '/') {
                int iDigit12 = IOUtils.digit1(bArr, i10);
                int iDigit23 = IOUtils.digit2(bArr, i11);
                iDigit42 = IOUtils.digit4(bArr, i10 + 5);
                iDigit22 = iDigit23;
                iDigit2 = iDigit12;
            } else {
                if (c11 != '/' || c12 != '/') {
                    return null;
                }
                iDigit2 = IOUtils.digit2(bArr, i10);
                iDigit1 = IOUtils.digit1(bArr, i10 + 3);
                iDigit4 = IOUtils.digit4(bArr, i10 + 5);
            }
            int i13 = iDigit1;
            iDigit42 = iDigit4;
            iDigit22 = i13;
        }
        if ((iDigit42 | iDigit2 | iDigit22) <= 0) {
            return null;
        }
        return LocalDate.of(iDigit42, iDigit2, iDigit22);
    }

    public static String format(long j10) {
        return format(j10, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String format(Date date) {
        if (date == null) {
            return null;
        }
        return format(date.getTime(), DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String format(long j10, DateTimeFormatPattern dateTimeFormatPattern) {
        int shanghaiZoneOffsetTotalSeconds;
        long j11;
        ZoneId zoneId = DEFAULT_ZONE_ID;
        long jFloorDiv = Math.floorDiv(j10, 1000L);
        if (zoneId != SHANGHAI_ZONE_ID && zoneId.getRules() != SHANGHAI_ZONE_RULES) {
            shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(j10)).getTotalSeconds();
        } else {
            shanghaiZoneOffsetTotalSeconds = getShanghaiZoneOffsetTotalSeconds(jFloorDiv);
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
        if (j17 >= -999999999 && j17 <= 999999999) {
            int i14 = (int) j17;
            if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH || dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_SLASH || dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
                return format(i14, i12, i13, dateTimeFormatPattern);
            }
            long j18 = iFloorMod;
            if (j18 >= 0 && j18 <= 86399) {
                int i15 = (int) (j18 / 3600);
                long j19 = j18 - ((long) (i15 * 3600));
                int i16 = (int) (j19 / 60);
                return format(i14, i12, i13, i15, i16, (int) (j19 - ((long) (i16 * 60))), dateTimeFormatPattern);
            }
            C1802v.m6503a("Invalid secondOfDay ", j18);
            return null;
        }
        C1802v.m6503a("Invalid year ", j17);
        return null;
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
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[19];
            IOUtils.writeLocalDate(bArr, 0, year, monthValue, dayOfMonth);
            bArr[10] = 32;
            IOUtils.writeLocalTime(bArr, 11, hour, minute, second);
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[19];
        IOUtils.writeLocalDate(cArr, 0, year, monthValue, dayOfMonth);
        cArr[10] = ' ';
        IOUtils.writeLocalTime(cArr, 11, hour, minute, second);
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        if (biFunction2 != null) {
            return biFunction2.apply(cArr, Boolean.TRUE);
        }
        return new String(cArr);
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

    public static String format(int i10, int i11, int i12, int i13, int i14, int i15) {
        return format(i10, i11, i12, i13, i14, i15, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String format(int i10, int i11, int i12, int i13, int i14, int i15, DateTimeFormatPattern dateTimeFormatPattern) {
        int i16 = i10 / 100;
        int i17 = i10 - (i16 * 100);
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[19];
            if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
                IOUtils.writeDigitPair(bArr, 0, i12);
                bArr[2] = 46;
                IOUtils.writeDigitPair(bArr, 3, i11);
                bArr[5] = 46;
                IOUtils.writeDigitPair(bArr, 6, i16);
                IOUtils.writeDigitPair(bArr, 8, i17);
                bArr[10] = 32;
            } else {
                int i18 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 32 : 84;
                byte b10 = (byte) (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? 47 : 45);
                IOUtils.writeDigitPair(bArr, 0, i16);
                IOUtils.writeDigitPair(bArr, 2, i17);
                bArr[4] = b10;
                IOUtils.writeDigitPair(bArr, 5, i11);
                bArr[7] = b10;
                IOUtils.writeDigitPair(bArr, 8, i12);
                bArr[10] = (byte) i18;
            }
            IOUtils.writeLocalTime(bArr, 11, i13, i14, i15);
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[19];
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
            IOUtils.writeDigitPair(cArr, 0, i12);
            cArr[2] = '.';
            IOUtils.writeDigitPair(cArr, 3, i11);
            cArr[5] = '.';
            IOUtils.writeDigitPair(cArr, 6, i16);
            IOUtils.writeDigitPair(cArr, 8, i17);
            cArr[10] = ' ';
        } else {
            char c10 = dateTimeFormatPattern != DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 'T' : ' ';
            char c11 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? '/' : '-';
            IOUtils.writeDigitPair(cArr, 0, i16);
            IOUtils.writeDigitPair(cArr, 2, i17);
            cArr[4] = c11;
            IOUtils.writeDigitPair(cArr, 5, i11);
            cArr[7] = c11;
            IOUtils.writeDigitPair(cArr, 8, i12);
            cArr[10] = c10;
        }
        IOUtils.writeLocalTime(cArr, 11, i13, i14, i15);
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        if (biFunction2 != null) {
            return biFunction2.apply(cArr, Boolean.TRUE);
        }
        return new String(cArr);
    }

    public static String formatYMDHMS19(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null) {
            byte[] bArr = new byte[19];
            IOUtils.writeLocalDate(bArr, 0, year, monthValue, dayOfMonth);
            bArr[10] = 32;
            IOUtils.writeLocalTime(bArr, 11, 0, 0, 0);
            return biFunction.apply(bArr, JDKUtils.LATIN1);
        }
        char[] cArr = new char[19];
        IOUtils.writeLocalDate(cArr, 0, year, monthValue, dayOfMonth);
        cArr[10] = ' ';
        IOUtils.writeLocalTime(cArr, 11, 0, 0, 0);
        BiFunction<char[], Boolean, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK8;
        if (biFunction2 != null) {
            return biFunction2.apply(cArr, Boolean.TRUE);
        }
        return new String(cArr);
    }

    public static long parseMillis(String str, ZoneId zoneId) {
        Function<String, byte[]> function;
        if (str == null) {
            return 0L;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null && toIntFunction.applyAsInt(str) == 0) {
            byte[] bArrApply = function.apply(str);
            return parseMillis(bArrApply, 0, bArrApply.length, StandardCharsets.ISO_8859_1, zoneId);
        }
        char[] charArray = JDKUtils.getCharArray(str);
        return parseMillis(charArray, 0, charArray.length, zoneId);
    }

    public static long parseMillis(byte[] bArr, int i10, int i11) {
        return parseMillis(bArr, i10, i11, StandardCharsets.UTF_8, DEFAULT_ZONE_ID);
    }

    public static long parseMillis(byte[] bArr, int i10, int i11, Charset charset) {
        return parseMillis(bArr, i10, i11, charset, DEFAULT_ZONE_ID);
    }

    public static long parseMillis(byte[] bArr, int i10, int i11, Charset charset, ZoneId zoneId) {
        int i12;
        char c10;
        ZoneId zoneId2 = zoneId;
        if (bArr == null || i11 == 0) {
            return 0L;
        }
        if (i11 == 4 && IOUtils.isNULL(bArr, i10)) {
            return 0L;
        }
        char c11 = (char) bArr[i10];
        if (c11 != '\"' || bArr[i11 - 1] != 34) {
            if (i11 == 19) {
                return parseMillis19(bArr, i10, zoneId2);
            }
            if (i11 <= 19 && (i11 != 16 || ((c10 = (char) bArr[i10 + 10]) != '+' && c10 != '-'))) {
                if ((c11 == '-' || (c11 >= '0' && c11 <= '9')) && IOUtils.isNumber(bArr, i10, i11)) {
                    long j10 = TypeUtils.parseLong(bArr, i10, i11);
                    if (i11 != 8 || j10 < 19700101 || j10 > 21000101) {
                        return j10;
                    }
                    int i13 = (int) j10;
                    int i14 = i13 / 10000;
                    int i15 = (i13 % 10000) / 100;
                    int i16 = i13 % 100;
                    if (i15 < 1 || i15 > 12) {
                        return j10;
                    }
                    if (i15 != 2) {
                        i12 = (i15 == 4 || i15 == 6 || i15 == 9 || i15 == 11) ? 30 : 31;
                    } else {
                        i12 = ((i14 & 3) != 0 || (i14 % 100 == 0 && i14 % 400 != 0)) ? 28 : 29;
                    }
                    return i16 <= i12 ? ZonedDateTime.ofLocal(LocalDateTime.of(i14, i15, i16, 0, 0, 0), zoneId2, null).toEpochSecond() * 1000 : j10;
                }
                if (((char) bArr[i11 - 1]) == 'Z') {
                    zoneId2 = ZoneOffset.UTC;
                }
                LocalDateTime localDateTime = parseLocalDateTime(bArr, i10, i11);
                if (localDateTime == null && IOUtils.getLongLE(bArr, i10) == 3256155501228994608L && IOUtils.getShortLE(bArr, i10 + 8) == 12336) {
                    localDateTime = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
                }
                long epochSecond = ZonedDateTime.ofLocal(localDateTime, zoneId2, null).toEpochSecond();
                int nano = localDateTime.getNano();
                if (epochSecond < 0 && nano > 0) {
                    return (((epochSecond + 1) * 1000) + ((long) (nano / 1000000))) - 1000;
                }
                return (epochSecond * 1000) + ((long) (nano / 1000000));
            }
            ZonedDateTime zonedDateTime = parseZonedDateTime(bArr, i10, i11, zoneId2);
            if (zonedDateTime != null) {
                return zonedDateTime.toInstant().toEpochMilli();
            }
            String str = new String(bArr, i10, i11 - i10);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        JSONReader jSONReaderM6236of = JSONReader.m6236of(bArr, i10, i11, charset);
        try {
            long time = ((Date) ObjectReaderImplDate.INSTANCE.readObject(jSONReaderM6236of, null, null, 0L)).getTime();
            if (jSONReaderM6236of != null) {
                jSONReaderM6236of.close();
            }
            return time;
        } finally {
        }
    }

    public static long parseMillis(char[] cArr, int i10, int i11) {
        return parseMillis(cArr, i10, i11, DEFAULT_ZONE_ID);
    }

    public static long parseMillis(String str) {
        return parseMillis(str, DEFAULT_ZONE_ID);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime16(char[] r20, int r21) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(char[], int):java.time.LocalDateTime");
    }

    public static String toString(Date date) {
        return toString(date.getTime(), false, DEFAULT_ZONE_ID);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6 A[PHI: r3
  0x01b6: PHI (r3v15 char) = (r3v14 char), (r3v14 char), (r3v14 char), (r3v20 char) binds: [B:59:0x018e, B:60:0x0190, B:61:0x0192, B:66:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime17(char[] r31, int r32) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(char[], int):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266 A[PHI: r12
  0x0266: PHI (r12v5 byte) = (r12v4 byte), (r12v4 byte), (r12v4 byte), (r12v8 byte) binds: [B:100:0x023c, B:101:0x023e, B:102:0x0240, B:107:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1 A[PHI: r12
  0x01d1: PHI (r12v2 byte) = (r12v1 byte), (r12v1 byte), (r12v1 byte), (r12v12 byte) binds: [B:73:0x01a9, B:74:0x01ab, B:75:0x01ad, B:80:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb A[PHI: r12
  0x01fb: PHI (r12v3 byte) = (r12v2 byte), (r12v2 byte), (r12v2 byte), (r12v10 byte) binds: [B:81:0x01d1, B:82:0x01d3, B:83:0x01d5, B:88:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime parseLocalDateTime18(byte[] r29, int r30) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byte[], int):java.time.LocalDateTime");
    }

    public static LocalDateTime parseLocalDateTimeX(char[] cArr, int i10, int i11) {
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
        if (cArr == null || i11 == 0 || i11 < 21 || i11 > 29) {
            return null;
        }
        char c27 = cArr[i10];
        char c28 = cArr[i10 + 1];
        char c29 = cArr[i10 + 2];
        char c30 = cArr[i10 + 3];
        char c31 = cArr[i10 + 4];
        char c32 = cArr[i10 + 5];
        char c33 = cArr[i10 + 6];
        char c34 = cArr[i10 + 7];
        char c35 = cArr[i10 + 8];
        char c36 = cArr[i10 + 9];
        char c37 = cArr[i10 + 10];
        char c38 = cArr[i10 + 11];
        char c39 = cArr[i10 + 12];
        char c40 = cArr[i10 + 13];
        char c41 = cArr[i10 + 14];
        char c42 = cArr[i10 + 15];
        char c43 = cArr[i10 + 16];
        char c44 = cArr[i10 + 17];
        char c45 = cArr[i10 + 18];
        char c46 = cArr[i10 + 19];
        switch (i11) {
            case Opcodes.ILOAD /* 21 */:
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
                c21 = cArr[i10 + 20];
                c22 = '0';
                break;
            case Opcodes.LLOAD /* 22 */:
                c23 = cArr[i10 + 20];
                c24 = cArr[i10 + 21];
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
            case Opcodes.FLOAD /* 23 */:
                c23 = cArr[i10 + 20];
                c24 = cArr[i10 + 21];
                c15 = cArr[i10 + 22];
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
            case Opcodes.DLOAD /* 24 */:
                char c47 = cArr[i10 + 20];
                char c48 = cArr[i10 + 21];
                c15 = cArr[i10 + 22];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c17 = '0';
                c18 = '0';
                c19 = c27;
                c13 = c48;
                c20 = cArr[i10 + 23];
                c14 = '0';
                c16 = '0';
                c21 = c47;
                c22 = '0';
                break;
            case Opcodes.ALOAD /* 25 */:
                c25 = cArr[i10 + 20];
                char c49 = cArr[i10 + 21];
                c15 = cArr[i10 + 22];
                char c50 = cArr[i10 + 23];
                c26 = cArr[i10 + 24];
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
                char c51 = cArr[i10 + 20];
                char c52 = cArr[i10 + 21];
                c15 = cArr[i10 + 22];
                char c53 = cArr[i10 + 23];
                char c54 = cArr[i10 + 24];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c18 = '0';
                c13 = c52;
                c14 = cArr[i10 + 25];
                c19 = c27;
                c21 = c51;
                c20 = c53;
                c22 = c54;
                c16 = '0';
                c17 = c16;
                break;
            case 27:
                c25 = cArr[i10 + 20];
                char c55 = cArr[i10 + 21];
                c15 = cArr[i10 + 22];
                char c56 = cArr[i10 + 23];
                c26 = cArr[i10 + 24];
                char c57 = cArr[i10 + 25];
                c18 = cArr[i10 + 26];
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
                char c58 = cArr[i10 + 20];
                char c59 = cArr[i10 + 21];
                c15 = cArr[i10 + 22];
                char c60 = cArr[i10 + 23];
                char c61 = cArr[i10 + 24];
                char c62 = cArr[i10 + 25];
                c18 = cArr[i10 + 26];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c13 = c59;
                c14 = c62;
                c19 = c27;
                c20 = c60;
                c16 = cArr[i10 + 27];
                c17 = '0';
                c21 = c58;
                c22 = c61;
                break;
            default:
                c21 = cArr[i10 + 20];
                char c63 = cArr[i10 + 21];
                char c64 = cArr[i10 + 22];
                char c65 = cArr[i10 + 23];
                char c66 = cArr[i10 + 24];
                char c67 = cArr[i10 + 25];
                char c68 = cArr[i10 + 26];
                c10 = c39;
                c11 = c42;
                c12 = c45;
                c13 = c63;
                c22 = c66;
                c16 = cArr[i10 + 27];
                c18 = c68;
                c19 = c27;
                c20 = c65;
                c15 = c64;
                c14 = c67;
                c17 = cArr[i10 + 28];
                break;
        }
        if (c31 == '-' && c34 == '-' && ((c37 == ' ' || c37 == 'T') && c40 == ':' && c43 == ':' && c46 == '.')) {
            return localDateTime(c19, c28, c29, c30, c32, c33, c35, c36, c38, c10, c41, c11, c44, c12, c21, c13, c15, c20, c22, c14, c18, c16, c17);
        }
        int i12 = i10 + i11;
        if (cArr[i12 - 15] != '-' || cArr[i12 - 12] != '-') {
            return null;
        }
        char c69 = cArr[i12 - 9];
        if ((c69 == ' ' || c69 == 'T') && cArr[i12 - 6] == ':' && cArr[i12 - 3] == ':') {
            return LocalDateTime.of(TypeUtils.parseInt(cArr, i10, i11 - 15), TypeUtils.parseInt(cArr, i12 - 14, 2), TypeUtils.parseInt(cArr, i12 - 11, 2), TypeUtils.parseInt(cArr, i12 - 8, 2), TypeUtils.parseInt(cArr, i12 - 5, 2), TypeUtils.parseInt(cArr, i12 - 2, 2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long parseMillis19(java.lang.String r34, java.time.ZoneId r35, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r36) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseMillis19(java.lang.String, java.time.ZoneId, com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a A[PHI: r11
  0x017a: PHI (r11v12 char) = (r11v11 char), (r11v11 char), (r11v11 char), (r11v20 char) binds: [B:54:0x0132, B:55:0x0134, B:56:0x0136, B:65:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0 A[PHI: r11
  0x01c0: PHI (r11v13 char) = (r11v12 char), (r11v12 char), (r11v12 char), (r11v17 char) binds: [B:66:0x017a, B:67:0x017c, B:68:0x017e, B:77:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long parseMillis19(byte[] r24, int r25, java.time.ZoneId r26) {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseMillis19(byte[], int, java.time.ZoneId):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165 A[PHI: r11
  0x0165: PHI (r11v10 char) = (r11v9 char), (r11v9 char), (r11v9 char), (r11v18 char) binds: [B:54:0x011d, B:55:0x011f, B:56:0x0121, B:65:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab A[PHI: r11
  0x01ab: PHI (r11v11 char) = (r11v10 char), (r11v10 char), (r11v10 char), (r11v15 char) binds: [B:66:0x0165, B:67:0x0167, B:68:0x0169, B:77:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long parseMillis19(char[] r24, int r25, java.time.ZoneId r26) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.parseMillis19(char[], int, java.time.ZoneId):long");
    }
}
