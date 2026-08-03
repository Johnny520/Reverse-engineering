package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DateUtils {
    static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER_34 = null;
    static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER_COOKIE = null;
    static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER_COOKIE_LOCAL = null;
    static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER_RFC_2822 = null;
    public static final java.time.ZoneId DEFAULT_ZONE_ID = null;
    public static final java.time.LocalDate LOCAL_DATE_19700101 = null;
    static final int LOCAL_EPOCH_DAY = 0;
    public static final java.time.ZoneId OFFSET_8_ZONE_ID = null;
    public static final java.lang.String OFFSET_8_ZONE_ID_NAME = "+08:00";
    private static final int[] POWERS = null;
    public static final java.time.ZoneId SHANGHAI_ZONE_ID = null;
    public static final java.lang.String SHANGHAI_ZONE_ID_NAME = "Asia/Shanghai";
    public static final java.time.zone.ZoneRules SHANGHAI_ZONE_RULES = null;

    /* JADX INFO: renamed from: com.alibaba.fastjson2.util.DateUtils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern = null;

        static {
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern[] r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern = r0
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern     // Catch: java.lang.NoSuchFieldError -> L1d
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern     // Catch: java.lang.NoSuchFieldError -> L28
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern     // Catch: java.lang.NoSuchFieldError -> L33
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern     // Catch: java.lang.NoSuchFieldError -> L3e
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern     // Catch: java.lang.NoSuchFieldError -> L49
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class CacheDate10 {
        static final java.lang.String[] CACHE = null;

        static {
                r0 = 1024(0x400, float:1.435E-42)
                java.lang.String[] r0 = new java.lang.String[r0]
                com.alibaba.fastjson2.util.DateUtils.CacheDate10.CACHE = r0
                return
        }

        public CacheDate10() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class CacheDate8 {
        static final java.lang.String[] CACHE = null;

        static {
                r0 = 1024(0x400, float:1.435E-42)
                java.lang.String[] r0 = new java.lang.String[r0]
                com.alibaba.fastjson2.util.DateUtils.CacheDate8.CACHE = r0
                return
        }

        public CacheDate8() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum DateTimeFormatPattern extends java.lang.Enum<com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern> {
        private static final /* synthetic */ com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern[] $VALUES = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_FORMAT_10_DASH = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_FORMAT_10_DOT = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_FORMAT_10_SLASH = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_TIME_FORMAT_19_DASH = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_TIME_FORMAT_19_DASH_T = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_TIME_FORMAT_19_DOT = null;
        public static final com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern DATE_TIME_FORMAT_19_SLASH = null;
        public final int length;
        public final java.lang.String pattern;

        static {
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                java.lang.String r1 = "DATE_FORMAT_10_DASH"
                r2 = 0
                java.lang.String r3 = "yyyy-MM-dd"
                r4 = 10
                r0.<init>(r1, r2, r3, r4)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH = r0
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                r2 = 1
                java.lang.String r3 = "yyyy/MM/dd"
                java.lang.String r5 = "DATE_FORMAT_10_SLASH"
                r1.<init>(r5, r2, r3, r4)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH = r1
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r2 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                r3 = 2
                java.lang.String r5 = "dd.MM.yyyy"
                java.lang.String r6 = "DATE_FORMAT_10_DOT"
                r2.<init>(r6, r3, r5, r4)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT = r2
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r3 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                java.lang.String r4 = "DATE_TIME_FORMAT_19_DASH"
                r5 = 3
                java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
                r7 = 19
                r3.<init>(r4, r5, r6, r7)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH = r3
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r4 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                r5 = 4
                java.lang.String r6 = "yyyy-MM-dd'T'HH:mm:ss"
                java.lang.String r8 = "DATE_TIME_FORMAT_19_DASH_T"
                r4.<init>(r8, r5, r6, r7)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T = r4
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r5 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                r6 = 5
                java.lang.String r8 = "yyyy/MM/dd HH:mm:ss"
                java.lang.String r9 = "DATE_TIME_FORMAT_19_SLASH"
                r5.<init>(r9, r6, r8, r7)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH = r5
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = new com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern
                r8 = 6
                java.lang.String r9 = "dd.MM.yyyy HH:mm:ss"
                java.lang.String r10 = "DATE_TIME_FORMAT_19_DOT"
                r6.<init>(r10, r8, r9, r7)
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT = r6
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern[] r0 = new com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern[]{r0, r1, r2, r3, r4, r5, r6}
                com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.$VALUES = r0
                return
        }

        DateTimeFormatPattern(java.lang.String r1, int r2, java.lang.String r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.pattern = r3
                r0.length = r4
                return
        }

        public static com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern valueOf(java.lang.String r1) {
                java.lang.Class<com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern> r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r1 = (com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern) r1
                return r1
        }

        public static com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern[] values() {
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern[] r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.$VALUES
                java.lang.Object r0 = r0.clone()
                com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern[] r0 = (com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "Asia/Shanghai"
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID = r1
            r2 = 0
            java.lang.String r3 = r1.getId()     // Catch: java.lang.Exception -> L1d
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 == 0) goto L14
            goto L18
        L14:
            java.time.ZoneId r1 = java.time.ZoneId.of(r0)     // Catch: java.lang.Exception -> L1d
        L18:
            java.time.zone.ZoneRules r2 = r1.getRules()     // Catch: java.lang.Exception -> L1e
            goto L1e
        L1d:
            r1 = r2
        L1e:
            com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID = r1
            com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES = r2
            java.lang.String r0 = "+08:00"
            java.time.ZoneId r0 = java.time.ZoneId.of(r0)
            com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID = r0
            r0 = 1970(0x7b2, float:2.76E-42)
            r3 = 1
            java.time.LocalDate r0 = java.time.LocalDate.of(r0, r3, r3)
            com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101 = r0
            long r3 = java.lang.System.currentTimeMillis()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = java.lang.Math.floorDiv(r3, r5)
            if (r0 == r1) goto L59
            java.time.zone.ZoneRules r1 = r0.getRules()
            if (r1 != r2) goto L48
            goto L59
        L48:
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r3)
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r1)
            int r0 = r0.getTotalSeconds()
            goto L5d
        L59:
            int r0 = getShanghaiZoneOffsetTotalSeconds(r5)
        L5d:
            long r0 = (long) r0
            long r5 = r5 + r0
            r0 = 86400(0x15180, double:4.26873E-319)
            long r0 = java.lang.Math.floorDiv(r5, r0)
            int r0 = (int) r0
            com.alibaba.fastjson2.util.DateUtils.LOCAL_EPOCH_DAY = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 0, 0, 0, 0, 0, 0} // fill-array
            com.alibaba.fastjson2.util.DateUtils.POWERS = r0
            return
    }

    public DateUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String format(int r1, int r2, int r3) {
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH
            java.lang.String r1 = format(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String format(int r7, int r8, int r9, int r10, int r11, int r12) {
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String format(int r14, int r15, int r16, int r17, int r18, int r19, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r20) {
            r0 = r20
            int r1 = r14 / 100
            int r2 = r1 * 100
            int r14 = r14 - r2
            r2 = 19
            char[] r2 = new char[r2]
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT
            r4 = 32
            r5 = 10
            r6 = 16
            if (r0 != r3) goto L41
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r10 = r3[r16]
            r0.putInt(r2, r8, r10)
            r10 = 2
            r11 = 46
            r2[r10] = r11
            r12 = 6
            long r12 = r12 + r8
            r10 = r3[r15]
            r0.putInt(r2, r12, r10)
            r10 = 5
            r2[r10] = r11
            r10 = 12
            long r10 = r10 + r8
            r1 = r3[r1]
            r0.putInt(r2, r10, r1)
            long r8 = r8 + r6
            r14 = r3[r14]
            r0.putInt(r2, r8, r14)
            r2[r5] = r4
            goto L7a
        L41:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            if (r0 != r3) goto L46
            goto L48
        L46:
            r4 = 84
        L48:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH
            if (r0 != r3) goto L4f
            r0 = 47
            goto L51
        L4f:
            r0 = 45
        L51:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int[] r10 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r1 = r10[r1]
            r3.putInt(r2, r8, r1)
            r11 = 4
            long r11 = r11 + r8
            r14 = r10[r14]
            r3.putInt(r2, r11, r14)
            r14 = 4
            r2[r14] = r0
            r11 = 10
            long r11 = r11 + r8
            r14 = r10[r15]
            r3.putInt(r2, r11, r14)
            r14 = 7
            r2[r14] = r0
            long r8 = r8 + r6
            r14 = r10[r16]
            r3.putInt(r2, r8, r14)
            r2[r5] = r4
        L7a:
            r14 = 11
            r0 = r17
            r1 = r18
            r3 = r19
            com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r2, r14, r0, r1, r3)
            java.lang.String r14 = new java.lang.String
            r14.<init>(r2)
            return r14
    }

    public static java.lang.String format(int r10, int r11, int r12, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r13) {
            int r0 = r10 / 100
            int r1 = r0 * 100
            int r10 = r10 - r1
            r1 = 10
            char[] r1 = new char[r1]
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT
            r3 = 16
            if (r13 != r2) goto L39
            sun.misc.Unsafe r13 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int[] r2 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r12 = r2[r12]
            r13.putInt(r1, r5, r12)
            r12 = 2
            r7 = 46
            r1[r12] = r7
            r8 = 6
            long r8 = r8 + r5
            r11 = r2[r11]
            r13.putInt(r1, r8, r11)
            r11 = 5
            r1[r11] = r7
            r11 = 12
            long r11 = r11 + r5
            r0 = r2[r0]
            r13.putInt(r1, r11, r0)
            long r5 = r5 + r3
            r10 = r2[r10]
            r13.putInt(r1, r5, r10)
            goto L69
        L39:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH
            if (r13 != r2) goto L40
            r13 = 45
            goto L42
        L40:
            r13 = 47
        L42:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int[] r7 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r0 = r7[r0]
            r2.putInt(r1, r5, r0)
            r8 = 4
            long r8 = r8 + r5
            r10 = r7[r10]
            r2.putInt(r1, r8, r10)
            r10 = 4
            r1[r10] = r13
            r8 = 10
            long r8 = r8 + r5
            r10 = r7[r11]
            r2.putInt(r1, r8, r10)
            r10 = 7
            r1[r10] = r13
            long r5 = r5 + r3
            r10 = r7[r12]
            r2.putInt(r1, r5, r10)
        L69:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r1)
            return r10
    }

    public static java.lang.String format(long r1) {
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            java.lang.String r1 = format(r1, r0)
            return r1
    }

    public static java.lang.String format(long r26, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r28) {
            r6 = r28
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = r26
            long r1 = java.lang.Math.floorDiv(r3, r1)
            java.time.ZoneId r5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r0 == r5) goto L2a
            java.time.zone.ZoneRules r5 = r0.getRules()
            java.time.zone.ZoneRules r7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r5 != r7) goto L19
            goto L2a
        L19:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r3)
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r3)
            int r0 = r0.getTotalSeconds()
            goto L2e
        L2a:
            int r0 = getShanghaiZoneOffsetTotalSeconds(r1)
        L2e:
            long r3 = (long) r0
            long r1 = r1 + r3
            r3 = 86400(0x15180, double:4.26873E-319)
            long r7 = java.lang.Math.floorDiv(r1, r3)
            long r0 = java.lang.Math.floorMod(r1, r3)
            int r0 = (int) r0
            r1 = 719468(0xafa6c, double:3.554644E-318)
            long r1 = r1 + r7
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r9 = 1
            r11 = 146097(0x23ab1, double:7.21815E-319)
            r13 = 400(0x190, double:1.976E-321)
            if (r5 >= 0) goto L59
            r15 = 719469(0xafa6d, double:3.55465E-318)
            long r7 = r7 + r15
            long r7 = r7 / r11
            long r7 = r7 - r9
            long r15 = r7 * r13
            long r7 = -r7
            long r7 = r7 * r11
            long r1 = r1 + r7
            goto L5a
        L59:
            r15 = r3
        L5a:
            long r7 = r1 * r13
            r17 = 591(0x24f, double:2.92E-321)
            long r7 = r7 + r17
            long r7 = r7 / r11
            r11 = 365(0x16d, double:1.803E-321)
            long r17 = r7 * r11
            r19 = 4
            long r21 = r7 / r19
            long r21 = r21 + r17
            r17 = 100
            long r23 = r7 / r17
            long r21 = r21 - r23
            long r23 = r7 / r13
            long r23 = r23 + r21
            long r21 = r1 - r23
            int r5 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r5 >= 0) goto L88
            long r7 = r7 - r9
            long r11 = r11 * r7
            long r9 = r7 / r19
            long r9 = r9 + r11
            long r11 = r7 / r17
            long r9 = r9 - r11
            long r11 = r7 / r13
            long r11 = r11 + r9
            long r21 = r1 - r11
        L88:
            r1 = r21
            long r7 = r7 + r15
            int r1 = (int) r1
            int r2 = r1 * 5
            int r2 = r2 + 2
            int r2 = r2 / 153
            int r5 = r2 + 2
            int r5 = r5 % 12
            int r5 = r5 + 1
            int r9 = r2 * 306
            int r9 = r9 + 5
            int r9 = r9 / 10
            int r1 = r1 - r9
            int r1 = r1 + 1
            int r2 = r2 / 10
            long r9 = (long) r2
            long r7 = r7 + r9
            r9 = -999999999(0xffffffffc4653601, double:NaN)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L100
            r9 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L100
            int r2 = (int) r7
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH
            if (r6 == r7) goto Lc0
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH
            if (r6 == r7) goto Lc0
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT
            if (r6 != r7) goto Lc4
        Lc0:
            r0 = r2
            r2 = r1
            r1 = r5
            goto Lfb
        Lc4:
            long r7 = (long) r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto Lef
            r3 = 86399(0x1517f, double:4.2687E-319)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto Lef
            r3 = 3600(0xe10, double:1.7786E-320)
            long r3 = r7 / r3
            int r3 = (int) r3
            int r0 = r3 * 3600
            long r9 = (long) r0
            long r7 = r7 - r9
            r9 = 60
            long r9 = r7 / r9
            int r4 = (int) r9
            int r0 = r4 * 60
            long r9 = (long) r0
            long r7 = r7 - r9
            int r0 = (int) r7
            r25 = r5
            r5 = r0
            r0 = r2
            r2 = r1
            r1 = r25
            java.lang.String r0 = format(r0, r1, r2, r3, r4, r5, r6)
            return r0
        Lef:
            java.time.DateTimeException r0 = new java.time.DateTimeException
            java.lang.String r1 = "Invalid secondOfDay "
            java.lang.String r1 = bc.e.g(r7, r1)
            r0.<init>(r1)
            throw r0
        Lfb:
            java.lang.String r0 = format(r0, r1, r2, r6)
            return r0
        L100:
            java.time.DateTimeException r0 = new java.time.DateTimeException
            java.lang.String r1 = "Invalid year "
            java.lang.String r1 = bc.e.g(r7, r1)
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String format(java.time.LocalDate r7, java.lang.String r8) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r7.getYear()
            int r1 = r7.getMonthValue()
            int r2 = r7.getDayOfMonth()
            r8.getClass()
            int r3 = r8.hashCode()
            r4 = -1
            switch(r3) {
                case -159776256: goto L53;
                case -102516032: goto L48;
                case 1333195168: goto L3d;
                case 1798231098: goto L32;
                case 1834843604: goto L27;
                case 1900521056: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L5d
        L1c:
            java.lang.String r3 = "dd.MM.yyyy"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L25
            goto L5d
        L25:
            r4 = 5
            goto L5d
        L27:
            java.lang.String r3 = "yyyy-MM-ddTHH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L30
            goto L5d
        L30:
            r4 = 4
            goto L5d
        L32:
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L3b
            goto L5d
        L3b:
            r4 = 3
            goto L5d
        L3d:
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L46
            goto L5d
        L46:
            r4 = 2
            goto L5d
        L48:
            java.lang.String r3 = "yyyy/MM/dd"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L51
            goto L5d
        L51:
            r4 = 1
            goto L5d
        L53:
            java.lang.String r3 = "yyyy-MM-dd"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            switch(r4) {
                case 0: goto L8b;
                case 1: goto L84;
                case 2: goto L7a;
                case 3: goto L70;
                case 4: goto L70;
                case 5: goto L69;
                default: goto L60;
            }
        L60:
            java.time.format.DateTimeFormatter r8 = java.time.format.DateTimeFormatter.ofPattern(r8)
            java.lang.String r7 = r8.format(r7)
            return r7
        L69:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
        L70:
            r5 = 0
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T
            r3 = 0
            r4 = 0
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L7a:
            r5 = 0
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            r3 = 0
            r4 = 0
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L84:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
        L8b:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
    }

    public static java.lang.String format(java.time.LocalDateTime r7, java.lang.String r8) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r7.getYear()
            int r1 = r7.getMonthValue()
            int r2 = r7.getDayOfMonth()
            r8.getClass()
            int r3 = r8.hashCode()
            r4 = -1
            switch(r3) {
                case -159776256: goto L53;
                case -102516032: goto L48;
                case 1333195168: goto L3d;
                case 1798231098: goto L32;
                case 1834843604: goto L27;
                case 1900521056: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L5d
        L1c:
            java.lang.String r3 = "dd.MM.yyyy"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L25
            goto L5d
        L25:
            r4 = 5
            goto L5d
        L27:
            java.lang.String r3 = "yyyy-MM-ddTHH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L30
            goto L5d
        L30:
            r4 = 4
            goto L5d
        L32:
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L3b
            goto L5d
        L3b:
            r4 = 3
            goto L5d
        L3d:
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L46
            goto L5d
        L46:
            r4 = 2
            goto L5d
        L48:
            java.lang.String r3 = "yyyy/MM/dd"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L51
            goto L5d
        L51:
            r4 = 1
            goto L5d
        L53:
            java.lang.String r3 = "yyyy-MM-dd"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            switch(r4) {
                case 0: goto L9d;
                case 1: goto L96;
                case 2: goto L83;
                case 3: goto L70;
                case 4: goto L70;
                case 5: goto L69;
                default: goto L60;
            }
        L60:
            java.time.format.DateTimeFormatter r8 = java.time.format.DateTimeFormatter.ofPattern(r8)
            java.lang.String r7 = r8.format(r7)
            return r7
        L69:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
        L70:
            int r3 = r7.getHour()
            int r4 = r7.getMinute()
            int r5 = r7.getSecond()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L83:
            int r3 = r7.getHour()
            int r4 = r7.getMinute()
            int r5 = r7.getSecond()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L96:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
        L9d:
            java.lang.String r7 = formatYMD10(r0, r1, r2)
            return r7
    }

    public static java.lang.String format(java.time.ZonedDateTime r7, java.lang.String r8) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r7.getYear()
            int r1 = r7.getMonthValue()
            int r2 = r7.getDayOfMonth()
            r8.getClass()
            int r3 = r8.hashCode()
            r4 = -1
            switch(r3) {
                case -159776256: goto L53;
                case -102516032: goto L48;
                case 1333195168: goto L3d;
                case 1798231098: goto L32;
                case 1834843604: goto L27;
                case 1900521056: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L5d
        L1c:
            java.lang.String r3 = "dd.MM.yyyy"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L25
            goto L5d
        L25:
            r4 = 5
            goto L5d
        L27:
            java.lang.String r3 = "yyyy-MM-ddTHH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L30
            goto L5d
        L30:
            r4 = 4
            goto L5d
        L32:
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L3b
            goto L5d
        L3b:
            r4 = 3
            goto L5d
        L3d:
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L46
            goto L5d
        L46:
            r4 = 2
            goto L5d
        L48:
            java.lang.String r3 = "yyyy/MM/dd"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L51
            goto L5d
        L51:
            r4 = 1
            goto L5d
        L53:
            java.lang.String r3 = "yyyy-MM-dd"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            switch(r4) {
                case 0: goto L9d;
                case 1: goto L96;
                case 2: goto L83;
                case 3: goto L70;
                case 4: goto L70;
                case 5: goto L69;
                default: goto L60;
            }
        L60:
            java.time.format.DateTimeFormatter r8 = java.time.format.DateTimeFormatter.ofPattern(r8)
            java.lang.String r7 = r8.format(r7)
            return r7
        L69:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
        L70:
            int r3 = r7.getHour()
            int r4 = r7.getMinute()
            int r5 = r7.getSecond()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L83:
            int r3 = r7.getHour()
            int r4 = r7.getMinute()
            int r5 = r7.getSecond()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L96:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
        L9d:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH
            java.lang.String r7 = format(r0, r1, r2, r7)
            return r7
    }

    public static java.lang.String format(java.util.Date r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            long r0 = r2.getTime()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            java.lang.String r2 = format(r0, r2)
            return r2
    }

    public static java.lang.String format(java.util.Date r2, java.lang.String r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            if (r3 != 0) goto Lb
            java.lang.String r2 = format(r2)
            return r2
        Lb:
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -276306848: goto L62;
                case -159776256: goto L57;
                case -102516032: goto L4c;
                case 1333195168: goto L41;
                case 1397504320: goto L36;
                case 1798231098: goto L2b;
                case 1834843604: goto L20;
                case 1900521056: goto L15;
                default: goto L13;
            }
        L13:
            goto L6c
        L15:
            java.lang.String r0 = "dd.MM.yyyy"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1e
            goto L6c
        L1e:
            r1 = 7
            goto L6c
        L20:
            java.lang.String r0 = "yyyy-MM-ddTHH:mm:ss"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L6c
        L29:
            r1 = 6
            goto L6c
        L2b:
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L6c
        L34:
            r1 = 5
            goto L6c
        L36:
            java.lang.String r0 = "dd.MM.yyyy HH:mm:ss"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3f
            goto L6c
        L3f:
            r1 = 4
            goto L6c
        L41:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4a
            goto L6c
        L4a:
            r1 = 3
            goto L6c
        L4c:
            java.lang.String r0 = "yyyy/MM/dd"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L55
            goto L6c
        L55:
            r1 = 2
            goto L6c
        L57:
            java.lang.String r0 = "yyyy-MM-dd"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L60
            goto L6c
        L60:
            r1 = 1
            goto L6c
        L62:
            java.lang.String r0 = "yyyyMMdd"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6b
            goto L6c
        L6b:
            r1 = 0
        L6c:
            switch(r1) {
                case 0: goto Lc8;
                case 1: goto Lbd;
                case 2: goto Lb2;
                case 3: goto La7;
                case 4: goto L9c;
                case 5: goto L91;
                case 6: goto L91;
                case 7: goto L86;
                default: goto L6f;
            }
        L6f:
            long r0 = r2.getTime()
            java.time.Instant r2 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r2 = r2.atZone(r0)
            java.time.format.DateTimeFormatter r3 = java.time.format.DateTimeFormatter.ofPattern(r3)
            java.lang.String r2 = r3.format(r2)
            return r2
        L86:
            long r2 = r2.getTime()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT
            java.lang.String r2 = format(r2, r0)
            return r2
        L91:
            long r2 = r2.getTime()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T
            java.lang.String r2 = format(r2, r0)
            return r2
        L9c:
            long r2 = r2.getTime()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT
            java.lang.String r2 = format(r2, r0)
            return r2
        La7:
            long r2 = r2.getTime()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            java.lang.String r2 = format(r2, r0)
            return r2
        Lb2:
            long r2 = r2.getTime()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r0 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH
            java.lang.String r2 = format(r2, r0)
            return r2
        Lbd:
            long r2 = r2.getTime()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r2 = formatYMD10(r2, r0)
            return r2
        Lc8:
            long r2 = r2.getTime()
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r2 = formatYMD8(r2, r0)
            return r2
    }

    public static java.lang.String formatYMD10(int r2, int r3, int r4) {
            r0 = 10
            char[] r0 = new char[r0]
            r1 = 0
            com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r0, r1, r2, r3, r4)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            return r2
    }

    public static java.lang.String formatYMD10(long r25, java.time.ZoneId r27) {
            if (r27 != 0) goto L5
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto L7
        L5:
            r0 = r27
        L7:
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = r25
            long r1 = java.lang.Math.floorDiv(r3, r1)
            java.time.ZoneId r5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r0 == r5) goto L2d
            java.time.zone.ZoneRules r5 = r0.getRules()
            java.time.zone.ZoneRules r6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r5 != r6) goto L1c
            goto L2d
        L1c:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r3)
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r3)
            int r0 = r0.getTotalSeconds()
            goto L31
        L2d:
            int r0 = getShanghaiZoneOffsetTotalSeconds(r1)
        L31:
            long r3 = (long) r0
            long r1 = r1 + r3
            r3 = 86400(0x15180, double:4.26873E-319)
            long r0 = java.lang.Math.floorDiv(r1, r3)
            int r2 = com.alibaba.fastjson2.util.DateUtils.LOCAL_EPOCH_DAY
            long r2 = (long) r2
            long r2 = r0 - r2
            r4 = 128(0x80, double:6.3E-322)
            long r2 = r2 + r4
            int r2 = (int) r2
            java.lang.String[] r3 = com.alibaba.fastjson2.util.DateUtils.CacheDate10.CACHE
            if (r2 < 0) goto L4f
            int r4 = r3.length
            if (r2 >= r4) goto L4f
            r4 = r3[r2]
            if (r4 == 0) goto L4f
            return r4
        L4f:
            r4 = 719468(0xafa6c, double:3.554644E-318)
            long r4 = r4 + r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r9 = 1
            r11 = 146097(0x23ab1, double:7.21815E-319)
            r13 = 400(0x190, double:1.976E-321)
            if (r8 >= 0) goto L6c
            r15 = 719469(0xafa6d, double:3.55465E-318)
            long r0 = r0 + r15
            long r0 = r0 / r11
            long r0 = r0 - r9
            long r15 = r0 * r13
            long r0 = -r0
            long r0 = r0 * r11
            long r4 = r4 + r0
            goto L6d
        L6c:
            r15 = r6
        L6d:
            long r0 = r4 * r13
            r17 = 591(0x24f, double:2.92E-321)
            long r0 = r0 + r17
            long r0 = r0 / r11
            r11 = 365(0x16d, double:1.803E-321)
            long r17 = r0 * r11
            r19 = 4
            long r21 = r0 / r19
            long r21 = r21 + r17
            r17 = 100
            long r23 = r0 / r17
            long r21 = r21 - r23
            long r23 = r0 / r13
            long r23 = r23 + r21
            long r21 = r4 - r23
            int r6 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r6 >= 0) goto L9b
            long r0 = r0 - r9
            long r11 = r11 * r0
            long r6 = r0 / r19
            long r6 = r6 + r11
            long r8 = r0 / r17
            long r6 = r6 - r8
            long r8 = r0 / r13
            long r8 = r8 + r6
            long r21 = r4 - r8
        L9b:
            r4 = r21
            long r0 = r0 + r15
            int r4 = (int) r4
            int r5 = r4 * 5
            int r5 = r5 + 2
            int r5 = r5 / 153
            int r6 = r5 + 2
            int r6 = r6 % 12
            int r6 = r6 + 1
            int r7 = r5 * 306
            int r7 = r7 + 5
            r8 = 10
            int r7 = r7 / r8
            int r4 = r4 - r7
            int r4 = r4 + 1
            int r5 = r5 / r8
            long r9 = (long) r5
            long r0 = r0 + r9
            r9 = -999999999(0xffffffffc4653601, double:NaN)
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 < 0) goto Lda
            r9 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 > 0) goto Lda
            int r0 = (int) r0
            char[] r1 = new char[r8]
            r5 = 0
            com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r5, r0, r6, r4)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            if (r2 < 0) goto Ld9
            int r1 = r3.length
            if (r2 >= r1) goto Ld9
            r3[r2] = r0
        Ld9:
            return r0
        Lda:
            java.time.DateTimeException r2 = new java.time.DateTimeException
            java.lang.String r3 = "Invalid year "
            java.lang.String r0 = bc.e.g(r0, r3)
            r2.<init>(r0)
            throw r2
    }

    public static java.lang.String formatYMD10(java.time.LocalDate r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.getYear()
            int r1 = r2.getMonthValue()
            int r2 = r2.getDayOfMonth()
            java.lang.String r2 = formatYMD10(r0, r1, r2)
            return r2
    }

    public static java.lang.String formatYMD10(java.util.Date r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            long r0 = r2.getTime()
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r2 = formatYMD10(r0, r2)
            return r2
    }

    public static java.lang.String formatYMD8(long r25, java.time.ZoneId r27) {
            r0 = 1000(0x3e8, double:4.94E-321)
            r2 = r25
            long r0 = java.lang.Math.floorDiv(r2, r0)
            if (r27 != 0) goto Ld
            java.time.ZoneId r4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto Lf
        Ld:
            r4 = r27
        Lf:
            java.time.ZoneId r5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r4 == r5) goto L2d
            java.time.zone.ZoneRules r5 = r4.getRules()
            java.time.zone.ZoneRules r6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r5 != r6) goto L1c
            goto L2d
        L1c:
            java.time.Instant r2 = java.time.Instant.ofEpochMilli(r2)
            java.time.zone.ZoneRules r3 = r4.getRules()
            java.time.ZoneOffset r2 = r3.getOffset(r2)
            int r2 = r2.getTotalSeconds()
            goto L31
        L2d:
            int r2 = getShanghaiZoneOffsetTotalSeconds(r0)
        L31:
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = java.lang.Math.floorDiv(r0, r2)
            int r2 = com.alibaba.fastjson2.util.DateUtils.LOCAL_EPOCH_DAY
            long r2 = (long) r2
            long r2 = r0 - r2
            r4 = 128(0x80, double:6.3E-322)
            long r2 = r2 + r4
            int r2 = (int) r2
            java.lang.String[] r3 = com.alibaba.fastjson2.util.DateUtils.CacheDate8.CACHE
            if (r2 < 0) goto L4f
            int r4 = r3.length
            if (r2 >= r4) goto L4f
            r4 = r3[r2]
            if (r4 == 0) goto L4f
            return r4
        L4f:
            r4 = 719468(0xafa6c, double:3.554644E-318)
            long r4 = r4 + r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r9 = 1
            r11 = 146097(0x23ab1, double:7.21815E-319)
            r13 = 400(0x190, double:1.976E-321)
            if (r8 >= 0) goto L6c
            r15 = 719469(0xafa6d, double:3.55465E-318)
            long r0 = r0 + r15
            long r0 = r0 / r11
            long r0 = r0 - r9
            long r15 = r0 * r13
            long r0 = -r0
            long r0 = r0 * r11
            long r4 = r4 + r0
            goto L6d
        L6c:
            r15 = r6
        L6d:
            long r0 = r4 * r13
            r17 = 591(0x24f, double:2.92E-321)
            long r0 = r0 + r17
            long r0 = r0 / r11
            r11 = 365(0x16d, double:1.803E-321)
            long r17 = r0 * r11
            r19 = 4
            long r21 = r0 / r19
            long r21 = r21 + r17
            r17 = 100
            long r23 = r0 / r17
            long r21 = r21 - r23
            long r23 = r0 / r13
            long r23 = r23 + r21
            long r21 = r4 - r23
            int r6 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r6 >= 0) goto L9b
            long r0 = r0 - r9
            long r11 = r11 * r0
            long r6 = r0 / r19
            long r6 = r6 + r11
            long r8 = r0 / r17
            long r6 = r6 - r8
            long r8 = r0 / r13
            long r8 = r8 + r6
            long r21 = r4 - r8
        L9b:
            r4 = r21
            long r0 = r0 + r15
            int r4 = (int) r4
            int r5 = r4 * 5
            int r5 = r5 + 2
            int r5 = r5 / 153
            int r6 = r5 + 2
            int r6 = r6 % 12
            int r6 = r6 + 1
            int r7 = r5 * 306
            int r7 = r7 + 5
            int r7 = r7 / 10
            int r4 = r4 - r7
            int r4 = r4 + 1
            int r5 = r5 / 10
            long r7 = (long) r5
            long r0 = r0 + r7
            r7 = -999999999(0xffffffffc4653601, double:NaN)
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 < 0) goto Lff
            r7 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 > 0) goto Lff
            int r0 = (int) r0
            int r1 = r0 / 100
            int r5 = r1 * 100
            int r0 = r0 - r5
            r5 = 8
            char[] r5 = new char[r5]
            sun.misc.Unsafe r7 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int[] r10 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r1 = r10[r1]
            r7.putInt(r5, r8, r1)
            long r11 = r8 + r19
            r0 = r10[r0]
            r7.putInt(r5, r11, r0)
            r0 = 8
            long r0 = r0 + r8
            r6 = r10[r6]
            r7.putInt(r5, r0, r6)
            r0 = 12
            long r8 = r8 + r0
            r0 = r10[r4]
            r7.putInt(r5, r8, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            if (r2 < 0) goto Lfe
            int r1 = r3.length
            if (r2 >= r1) goto Lfe
            r3[r2] = r0
        Lfe:
            return r0
        Lff:
            java.time.DateTimeException r2 = new java.time.DateTimeException
            java.lang.String r3 = "Invalid year "
            java.lang.String r0 = bc.e.g(r0, r3)
            r2.<init>(r0)
            throw r2
    }

    public static java.lang.String formatYMD8(java.time.LocalDate r10) {
            if (r10 != 0) goto L4
            r10 = 0
            return r10
        L4:
            int r0 = r10.getYear()
            int r1 = r10.getMonthValue()
            int r10 = r10.getDayOfMonth()
            int r2 = r0 / 100
            int r3 = r2 * 100
            int r0 = r0 - r3
            r3 = 8
            char[] r3 = new char[r3]
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int[] r7 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r2 = r7[r2]
            r4.putInt(r3, r5, r2)
            r8 = 4
            long r8 = r8 + r5
            r0 = r7[r0]
            r4.putInt(r3, r8, r0)
            r8 = 8
            long r8 = r8 + r5
            r0 = r7[r1]
            r4.putInt(r3, r8, r0)
            r0 = 12
            long r5 = r5 + r0
            r10 = r7[r10]
            r4.putInt(r3, r5, r10)
            java.lang.String r10 = new java.lang.String
            r10.<init>(r3)
            return r10
    }

    public static java.lang.String formatYMD8(java.util.Date r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            long r0 = r2.getTime()
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r2 = formatYMD8(r0, r2)
            return r2
    }

    public static java.lang.String formatYMDHMS19(java.time.LocalDate r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.getYear()
            int r1 = r4.getMonthValue()
            int r4 = r4.getDayOfMonth()
            r2 = 19
            char[] r2 = new char[r2]
            r3 = 0
            com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r2, r3, r0, r1, r4)
            r4 = 10
            r0 = 32
            r2[r4] = r0
            r4 = 11
            com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r2, r4, r3, r3, r3)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            return r4
    }

    public static java.lang.String formatYMDHMS19(java.time.LocalDateTime r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r7.getYear()
            int r1 = r7.getMonthValue()
            int r2 = r7.getDayOfMonth()
            int r3 = r7.getHour()
            int r4 = r7.getMinute()
            int r7 = r7.getSecond()
            r5 = 19
            char[] r5 = new char[r5]
            r6 = 0
            com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r5, r6, r0, r1, r2)
            r0 = 10
            r1 = 32
            r5[r0] = r1
            r0 = 11
            com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r5, r0, r3, r4, r7)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r5)
            return r7
    }

    public static java.lang.String formatYMDHMS19(java.time.ZonedDateTime r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r7.getYear()
            int r1 = r7.getMonthValue()
            int r2 = r7.getDayOfMonth()
            int r3 = r7.getHour()
            int r4 = r7.getMinute()
            int r5 = r7.getSecond()
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH
            java.lang.String r7 = format(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String formatYMDHMS19(java.util.Date r1) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r1 = formatYMDHMS19(r1, r0)
            return r1
    }

    public static java.lang.String formatYMDHMS19(java.util.Date r24, java.time.ZoneId r25) {
            if (r24 != 0) goto L4
            r0 = 0
            return r0
        L4:
            long r0 = r24.getTime()
            if (r25 != 0) goto Ld
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto Lf
        Ld:
            r2 = r25
        Lf:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r3 = java.lang.Math.floorDiv(r0, r3)
            java.time.ZoneId r5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r2 == r5) goto L21
            java.time.zone.ZoneRules r5 = r2.getRules()
            java.time.zone.ZoneRules r6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r5 != r6) goto L2b
        L21:
            r5 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2b
            r0 = 28800(0x7080, float:4.0357E-41)
            goto L3b
        L2b:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            java.time.zone.ZoneRules r1 = r2.getRules()
            java.time.ZoneOffset r0 = r1.getOffset(r0)
            int r0 = r0.getTotalSeconds()
        L3b:
            long r0 = (long) r0
            long r3 = r3 + r0
            r0 = 86400(0x15180, double:4.26873E-319)
            long r5 = java.lang.Math.floorDiv(r3, r0)
            long r0 = java.lang.Math.floorMod(r3, r0)
            int r0 = (int) r0
            r1 = 719468(0xafa6c, double:3.554644E-318)
            long r1 = r1 + r5
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r8 = 1
            r10 = 146097(0x23ab1, double:7.21815E-319)
            r12 = 400(0x190, double:1.976E-321)
            if (r7 >= 0) goto L66
            r14 = 719469(0xafa6d, double:3.55465E-318)
            long r5 = r5 + r14
            long r5 = r5 / r10
            long r5 = r5 - r8
            long r14 = r5 * r12
            long r5 = -r5
            long r5 = r5 * r10
            long r1 = r1 + r5
            goto L67
        L66:
            r14 = r3
        L67:
            long r5 = r1 * r12
            r16 = 591(0x24f, double:2.92E-321)
            long r5 = r5 + r16
            long r5 = r5 / r10
            r10 = 365(0x16d, double:1.803E-321)
            long r16 = r5 * r10
            r18 = 4
            long r20 = r5 / r18
            long r20 = r20 + r16
            r16 = 100
            long r22 = r5 / r16
            long r20 = r20 - r22
            long r22 = r5 / r12
            long r22 = r22 + r20
            long r20 = r1 - r22
            int r7 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r7 >= 0) goto L95
            long r5 = r5 - r8
            long r10 = r10 * r5
            long r7 = r5 / r18
            long r7 = r7 + r10
            long r9 = r5 / r16
            long r7 = r7 - r9
            long r9 = r5 / r12
            long r9 = r9 + r7
            long r20 = r1 - r9
        L95:
            r1 = r20
            long r5 = r5 + r14
            int r1 = (int) r1
            int r2 = r1 * 5
            int r2 = r2 + 2
            int r2 = r2 / 153
            int r7 = r2 + 2
            int r7 = r7 % 12
            int r7 = r7 + 1
            int r8 = r2 * 306
            int r8 = r8 + 5
            r9 = 10
            int r8 = r8 / r9
            int r1 = r1 - r8
            int r1 = r1 + 1
            int r2 = r2 / r9
            long r10 = (long) r2
            long r5 = r5 + r10
            r10 = -999999999(0xffffffffc4653601, double:NaN)
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 < 0) goto L103
            r10 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 > 0) goto L103
            int r2 = (int) r5
            long r5 = (long) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lf7
            r3 = 86399(0x1517f, double:4.2687E-319)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto Lf7
            r3 = 3600(0xe10, double:1.7786E-320)
            long r3 = r5 / r3
            int r0 = (int) r3
            int r3 = r0 * 3600
            long r3 = (long) r3
            long r5 = r5 - r3
            r3 = 60
            long r3 = r5 / r3
            int r3 = (int) r3
            int r4 = r3 * 60
            long r10 = (long) r4
            long r5 = r5 - r10
            int r4 = (int) r5
            r5 = 19
            char[] r5 = new char[r5]
            r6 = 0
            com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r5, r6, r2, r7, r1)
            r1 = 32
            r5[r9] = r1
            r1 = 11
            com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r5, r1, r0, r3, r4)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            return r0
        Lf7:
            java.time.DateTimeException r0 = new java.time.DateTimeException
            java.lang.String r1 = "Invalid secondOfDay "
            java.lang.String r1 = bc.e.g(r5, r1)
            r0.<init>(r1)
            throw r0
        L103:
            java.time.DateTimeException r0 = new java.time.DateTimeException
            java.lang.String r1 = "Invalid year "
            java.lang.String r1 = bc.e.g(r5, r1)
            r0.<init>(r1)
            throw r0
    }

    public static int getShanghaiZoneOffsetTotalSeconds(long r5) {
            r0 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 28800(0x7080, float:4.0357E-41)
            if (r0 < 0) goto La
            return r1
        La:
            r2 = 671598000(0x2807c5b0, double:3.318134996E-315)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r2 = 32400(0x7e90, float:4.5402E-41)
            if (r0 < 0) goto L14
            return r2
        L14:
            r3 = 653450400(0x26f2dca0, double:3.22847394E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L1c
            return r1
        L1c:
            r3 = 640148400(0x2627e3b0, double:3.162753327E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L24
            return r2
        L24:
            r3 = 622000800(0x2512faa0, double:3.07309227E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L2c
            return r1
        L2c:
            r3 = 608698800(0x244801b0, double:3.007371657E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L34
            return r2
        L34:
            r3 = 589946400(0x2329de20, double:2.91472249E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L3c
            return r1
        L3c:
            r3 = 577249200(0x22681fb0, double:2.85198999E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L44
            return r2
        L44:
            r3 = 558496800(0x2149fc20, double:2.75934082E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L4c
            return r1
        L4c:
            r3 = 545194800(0x207f0330, double:2.69362021E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L54
            return r2
        L54:
            r3 = 527047200(0x1f6a1a20, double:2.603959153E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L5c
            return r1
        L5c:
            r3 = 515559600(0x1ebad0b0, double:2.547202867E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L64
            return r2
        L64:
            r3 = -649987200(0xffffffffd941fb80, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L6c
            return r1
        L6c:
            r3 = -652316400(0xffffffffd91e7110, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L74
            return r2
        L74:
            r3 = -670636800(0xffffffffd806e500, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L7c
            return r1
        L7c:
            r3 = -683852400(0xffffffffd73d3d90, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L84
            return r2
        L84:
            r3 = -699580800(0xffffffffd64d3e80, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L8c
            return r1
        L8c:
            r3 = -716857200(0xffffffffd545a090, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L94
            return r2
        L94:
            r3 = -733795200(0xffffffffd4432c80, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L9c
            return r1
        L9c:
            r3 = -745801200(0xffffffffd38bfa10, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto La4
            return r2
        La4:
            r3 = -767836800(0xffffffffd23bbd80, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lac
            return r1
        Lac:
            r3 = -881017200(0xffffffffcb7cbe90, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lb4
            return r2
        Lb4:
            r3 = -888796800(0xffffffffcb060980, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lbc
            return r1
        Lbc:
            r3 = -908838000(0xffffffffc9d43b90, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lc4
            return r2
        Lc4:
            r3 = -922060800(0xffffffffc90a7800, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lcc
            return r1
        Lcc:
            r3 = -933634800(0xffffffffc859dd10, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Ld4
            return r2
        Ld4:
            r3 = -1585872000(0xffffffffa1798380, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Ldc
            return r1
        Ldc:
            r3 = -1600642800(0xffffffffa0982110, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Le4
            return r2
        Le4:
            r2 = -2177452800(0xffffffff7e36b500, double:NaN)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 < 0) goto Lee
            return r1
        Lee:
            r5 = 29143(0x71d7, float:4.0838E-41)
            return r5
    }

    public static java.time.ZoneId getZoneId(java.lang.String r3, java.time.ZoneId r4) {
            if (r3 != 0) goto L8
            if (r4 == 0) goto L5
            return r4
        L5:
            java.time.ZoneId r3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            return r3
        L8:
            int r4 = r3.hashCode()
            r0 = 0
            r1 = 1
            r2 = -1
            switch(r4) {
                case 47664: goto L29;
                case 67044: goto L1e;
                case 1277108071: goto L13;
                default: goto L12;
            }
        L12:
            goto L33
        L13:
            java.lang.String r4 = "+08:00"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L1c
            goto L33
        L1c:
            r2 = 2
            goto L33
        L1e:
            java.lang.String r4 = "CST"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L27
            goto L33
        L27:
            r2 = r1
            goto L33
        L29:
            java.lang.String r4 = "000"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L32
            goto L33
        L32:
            r2 = r0
        L33:
            switch(r2) {
                case 0: goto L7d;
                case 1: goto L7a;
                case 2: goto L77;
                default: goto L36;
            }
        L36:
            int r4 = r3.length()
            r2 = 93
            if (r4 <= 0) goto L5a
            char r4 = r3.charAt(r0)
            r0 = 43
            if (r4 == r0) goto L4a
            r0 = 45
            if (r4 != r0) goto L5a
        L4a:
            int r4 = r3.length()
            int r4 = r4 - r1
            char r4 = r3.charAt(r4)
            if (r4 == r2) goto L5a
            java.time.ZoneOffset r3 = java.time.ZoneOffset.of(r3)
            return r3
        L5a:
            r4 = 91
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L72
            int r0 = r3.indexOf(r2, r4)
            if (r0 <= 0) goto L72
            int r4 = r4 + r1
            java.lang.String r3 = r3.substring(r4, r0)
            java.time.ZoneId r3 = java.time.ZoneId.of(r3)
            return r3
        L72:
            java.time.ZoneId r3 = java.time.ZoneId.of(r3)
            return r3
        L77:
            java.time.ZoneId r3 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID
            return r3
        L7a:
            java.time.ZoneId r3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            return r3
        L7d:
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
            return r3
    }

    public static long hms(byte[] r6, int r7) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r7
            long r1 = r1 + r3
            long r6 = r0.getLong(r6, r1)
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L12
            long r6 = java.lang.Long.reverseBytes(r6)
        L12:
            r0 = -1085102592571150096(0xf0f0f0f0f0f0f0f0, double:-1.0773087426743214E236)
            long r0 = r0 & r6
            r2 = 3472328296227680304(0x3030303030303030, double:1.398043286095289E-76)
            long r0 = r0 - r2
            r2 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r2 = r2 & r6
            r4 = 434034439958300166(0x606000606000606, double:1.211988592074742E-279)
            long r2 = r2 + r4
            r4 = -1085366475377544976(0xf0f000f0f000f0f0, double:-1.0176920443765422E236)
            long r2 = r2 & r4
            long r0 = r0 | r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5e
            r0 = 16492675399680(0xf00000f0000, double:8.148464322993E-311)
            long r0 = r0 & r6
            r2 = 10995116933120(0xa00000a0000, double:5.432309548662E-311)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L47
            goto L5e
        L47:
            r0 = 4222124902318095(0xf00000f00000f, double:2.0860068666861996E-308)
            long r0 = r0 & r6
            r2 = 3
            long r2 = r0 << r2
            r4 = 1
            long r0 = r0 << r4
            long r2 = r2 + r0
            r0 = 1080863974993432320(0xf00000f00000f00, double:1.965710727226218E-236)
            long r6 = r6 & r0
            r0 = 8
            long r6 = r6 >> r0
            long r2 = r2 + r6
            return r2
        L5e:
            r6 = -1
            return r6
    }

    public static int hourAfterNoon(char r5, char r6) {
            r0 = 51
            r1 = 52
            r2 = 50
            r3 = 49
            r4 = 48
            if (r5 != r4) goto L2c
            switch(r6) {
                case 48: goto L2a;
                case 49: goto L28;
                case 50: goto L26;
                case 51: goto L23;
                case 52: goto L20;
                case 53: goto L1d;
                case 54: goto L1a;
                case 55: goto L16;
                case 56: goto L13;
                case 57: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L39
        L10:
            r5 = r2
            r6 = r3
            goto L39
        L13:
            r5 = r2
            r6 = r4
            goto L39
        L16:
            r6 = 57
        L18:
            r5 = r3
            goto L39
        L1a:
            r6 = 56
            goto L18
        L1d:
            r6 = 55
            goto L18
        L20:
            r6 = 54
            goto L18
        L23:
            r6 = 53
            goto L18
        L26:
            r6 = r1
            goto L18
        L28:
            r6 = r0
            goto L18
        L2a:
            r6 = r2
            goto L18
        L2c:
            if (r5 != r3) goto L39
            switch(r6) {
                case 48: goto L37;
                case 49: goto L35;
                case 50: goto L32;
                default: goto L31;
            }
        L31:
            goto L39
        L32:
            r6 = r1
        L33:
            r5 = r2
            goto L39
        L35:
            r6 = r0
            goto L33
        L37:
            r5 = r2
            r6 = r5
        L39:
            int r5 = r5 << 16
            r5 = r5 | r6
            return r5
    }

    public static boolean isDate(java.lang.String r19) {
            r0 = r19
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lf
        Lb:
            r16 = r1
            goto L157
        Lf:
            int r2 = r0.length()
            r3 = 19
            r4 = 1
            if (r2 != r3) goto L37
            r2 = 4
            char r3 = r0.charAt(r2)
            r5 = 45
            if (r3 != r5) goto L37
            r3 = 7
            char r3 = r0.charAt(r3)
            if (r3 != r5) goto L37
            r3 = 10
            char r5 = r0.charAt(r3)
            r6 = 32
            if (r5 == r6) goto L3d
            r6 = 84
            if (r5 != r6) goto L37
            goto L3d
        L37:
            r16 = r1
            r17 = r4
            goto L14a
        L3d:
            r5 = 13
            char r5 = r0.charAt(r5)
            r6 = 58
            if (r5 != r6) goto L37
            r5 = 16
            char r5 = r0.charAt(r5)
            if (r5 != r6) goto L37
            char r5 = r0.charAt(r1)
            char r6 = r0.charAt(r4)
            r7 = 2
            char r8 = r0.charAt(r7)
            r9 = 3
            char r10 = r0.charAt(r9)
            r11 = 5
            char r11 = r0.charAt(r11)
            r12 = 6
            char r13 = r0.charAt(r12)
            r14 = 8
            char r14 = r0.charAt(r14)
            r15 = 9
            r16 = r1
            char r1 = r0.charAt(r15)
            r17 = r4
            r4 = 11
            r18 = r9
            char r9 = r0.charAt(r4)
            r4 = 12
            char r15 = r0.charAt(r4)
            r12 = 14
            char r12 = r0.charAt(r12)
            r2 = 15
            char r2 = r0.charAt(r2)
            r7 = 17
            char r7 = r0.charAt(r7)
            r4 = 18
            char r0 = r0.charAt(r4)
            r4 = 48
            if (r5 < r4) goto L149
            r3 = 57
            if (r5 > r3) goto L149
            if (r6 < r4) goto L149
            if (r6 > r3) goto L149
            if (r8 < r4) goto L149
            if (r8 > r3) goto L149
            if (r10 < r4) goto L149
            if (r10 > r3) goto L149
            if (r11 < r4) goto L149
            if (r11 > r3) goto L149
            if (r13 < r4) goto L149
            if (r13 > r3) goto L149
            if (r14 < r4) goto L149
            if (r14 > r3) goto L149
            if (r1 < r4) goto L149
            if (r1 > r3) goto L149
            if (r9 < r4) goto L149
            if (r9 > r3) goto L149
            if (r15 < r4) goto L149
            if (r15 > r3) goto L149
            if (r12 < r4) goto L149
            if (r12 > r3) goto L149
            if (r2 < r4) goto L149
            if (r2 > r3) goto L149
            if (r7 < r4) goto L149
            if (r7 > r3) goto L149
            if (r0 < r4) goto L149
            if (r0 <= r3) goto Ldf
            goto L149
        Ldf:
            int r5 = r5 - r4
            int r5 = r5 * 1000
            r3 = 100
            int r5 = p.a.z(r6, r4, r3, r5)
            r6 = 10
            int r5 = p.a.z(r8, r4, r6, r5)
            int r10 = r10 - r4
            int r10 = r10 + r5
            int r11 = r11 - r4
            int r11 = r11 * r6
            int r13 = r13 - r4
            int r13 = r13 + r11
            int r14 = r14 - r4
            int r14 = r14 * r6
            int r1 = r1 - r4
            int r1 = r1 + r14
            int r9 = r9 - r4
            int r9 = r9 * r6
            int r15 = r15 - r4
            int r15 = r15 + r9
            int r12 = r12 - r4
            int r12 = r12 * r6
            int r2 = r2 - r4
            int r2 = r2 + r12
            int r7 = r7 - r4
            int r7 = r7 * r6
            int r0 = r0 - r4
            int r0 = r0 + r7
            r4 = 12
            if (r13 <= r4) goto L109
            return r16
        L109:
            r4 = 28
            if (r1 <= r4) goto L13a
            r5 = 2
            if (r13 == r5) goto L124
            r5 = 4
            if (r13 == r5) goto L121
            r3 = 6
            if (r13 == r3) goto L121
            r3 = 9
            if (r13 == r3) goto L121
            r3 = 11
            if (r13 == r3) goto L121
            r3 = 31
            goto L137
        L121:
            r3 = 30
            goto L137
        L124:
            r5 = r10 & 15
            if (r5 != 0) goto L12d
            r3 = r10 & 3
            if (r3 != 0) goto L136
            goto L134
        L12d:
            r5 = r10 & 3
            if (r5 != 0) goto L136
            int r10 = r10 % r3
            if (r10 == 0) goto L136
        L134:
            r4 = 29
        L136:
            r3 = r4
        L137:
            if (r1 <= r3) goto L13a
            return r16
        L13a:
            r1 = 24
            if (r15 <= r1) goto L13f
            return r16
        L13f:
            r1 = 60
            if (r2 <= r1) goto L144
            return r16
        L144:
            r1 = 61
            if (r0 > r1) goto L149
            return r17
        L149:
            return r16
        L14a:
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID     // Catch: java.lang.Throwable -> L157
            long r0 = parseMillis(r0, r1)     // Catch: java.lang.Throwable -> L157
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L157
            return r17
        L157:
            return r16
    }

    public static boolean isLocalDate(java.lang.String r18) {
            r0 = r18
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lf
        Lb:
            r16 = r1
            goto Lb9
        Lf:
            int r2 = r0.length()
            r3 = 9
            r4 = 1
            r5 = 10
            if (r2 != r5) goto L9f
            r2 = 4
            char r6 = r0.charAt(r2)
            r7 = 45
            if (r6 != r7) goto L9f
            r6 = 7
            char r6 = r0.charAt(r6)
            if (r6 != r7) goto L9f
            char r6 = r0.charAt(r1)
            char r7 = r0.charAt(r4)
            r8 = 2
            char r9 = r0.charAt(r8)
            r10 = 3
            char r11 = r0.charAt(r10)
            r12 = 5
            char r12 = r0.charAt(r12)
            r13 = 6
            char r14 = r0.charAt(r13)
            r15 = 8
            char r15 = r0.charAt(r15)
            char r0 = r0.charAt(r3)
            r16 = r1
            r1 = 48
            int r6 = r6 - r1
            int r6 = r6 * 1000
            r17 = r4
            r4 = 100
            int r6 = p.a.z(r7, r1, r4, r6)
            int r6 = p.a.z(r9, r1, r5, r6)
            int r11 = r11 - r1
            int r11 = r11 + r6
            int r12 = r12 - r1
            int r12 = r12 * r5
            int r14 = r14 - r1
            int r14 = r14 + r12
            int r15 = r15 - r1
            int r15 = r15 * r5
            int r0 = r0 - r1
            int r0 = r0 + r15
            r1 = 12
            if (r14 <= r1) goto L72
            return r16
        L72:
            r1 = 28
            if (r0 <= r1) goto L9e
            if (r14 == r8) goto L88
            if (r14 == r2) goto L85
            if (r14 == r13) goto L85
            if (r14 == r3) goto L85
            r1 = 11
            if (r14 == r1) goto L85
            r1 = 31
            goto L9a
        L85:
            r1 = 30
            goto L9a
        L88:
            r2 = r11 & 15
            if (r2 != 0) goto L91
            r2 = r11 & 3
            if (r2 != 0) goto L9a
            goto L98
        L91:
            r2 = r11 & 3
            if (r2 != 0) goto L9a
            int r11 = r11 % r4
            if (r11 == 0) goto L9a
        L98:
            r1 = 29
        L9a:
            if (r0 > r1) goto L9d
            return r17
        L9d:
            return r16
        L9e:
            return r17
        L9f:
            r16 = r1
            r17 = r4
            int r1 = r0.length()
            if (r1 < r3) goto Lb9
            int r1 = r0.length()
            r2 = 40
            if (r1 <= r2) goto Lb2
            goto Lb9
        Lb2:
            java.time.LocalDate r0 = parseLocalDate(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb9
            return r17
        Lb9:
            return r16
    }

    public static boolean isLocalTime(java.lang.String r10) {
            r0 = 0
            if (r10 == 0) goto L83
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto Lb
            goto L83
        Lb:
            int r1 = r10.length()
            r2 = 8
            r3 = 1
            if (r1 != r2) goto L7f
            r1 = 2
            char r1 = r10.charAt(r1)
            r2 = 58
            if (r1 != r2) goto L7f
            r1 = 5
            char r1 = r10.charAt(r1)
            if (r1 != r2) goto L7f
            char r1 = r10.charAt(r0)
            char r2 = r10.charAt(r3)
            r4 = 3
            char r4 = r10.charAt(r4)
            r5 = 4
            char r5 = r10.charAt(r5)
            r6 = 6
            char r6 = r10.charAt(r6)
            r7 = 7
            char r10 = r10.charAt(r7)
            r7 = 48
            if (r1 < r7) goto L7e
            r8 = 50
            if (r1 > r8) goto L7e
            if (r2 < r7) goto L7e
            r8 = 57
            if (r2 > r8) goto L7e
            if (r4 < r7) goto L7e
            r9 = 54
            if (r4 > r9) goto L7e
            if (r5 < r7) goto L7e
            if (r5 > r8) goto L7e
            if (r6 < r7) goto L7e
            if (r6 > r9) goto L7e
            if (r10 < r7) goto L7e
            if (r10 > r8) goto L7e
            int r1 = r1 - r7
            int r1 = r1 * 10
            int r2 = r2 - r7
            int r2 = r2 + r1
            r1 = 24
            if (r2 <= r1) goto L6a
            return r0
        L6a:
            int r4 = r4 - r7
            int r4 = r4 * 10
            int r5 = r5 - r7
            int r5 = r5 + r4
            r1 = 60
            if (r5 <= r1) goto L74
            return r0
        L74:
            int r6 = r6 - r7
            int r6 = r6 * 10
            int r10 = r10 - r7
            int r10 = r10 + r6
            r1 = 61
            if (r10 > r1) goto L7e
            return r3
        L7e:
            return r0
        L7f:
            java.time.LocalTime.parse(r10)     // Catch: java.time.format.DateTimeParseException -> L83
            return r3
        L83:
            return r0
    }

    public static java.time.LocalDateTime localDateTime(char r17, char r18, char r19, char r20, char r21, char r22, char r23, char r24, char r25, char r26, char r27, char r28, char r29, char r30) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r15 = 48
            r16 = 0
            if (r0 < r15) goto Lb8
            r14 = 57
            if (r0 > r14) goto Lb8
            if (r1 < r15) goto Lb8
            if (r1 > r14) goto Lb8
            if (r2 < r15) goto Lb8
            if (r2 > r14) goto Lb8
            if (r3 < r15) goto Lb8
            if (r3 > r14) goto Lb8
            int r0 = r0 - r15
            int r0 = r0 * 1000
            r14 = 100
            int r0 = p.a.z(r1, r15, r14, r0)
            r1 = 10
            int r0 = p.a.z(r2, r15, r1, r0)
            int r2 = r3 + (-48)
            int r2 = r2 + r0
            if (r4 < r15) goto Lb8
            r0 = 57
            if (r4 > r0) goto Lb8
            if (r5 < r15) goto Lb8
            if (r5 > r0) goto Lb8
            int r3 = r4 + (-48)
            int r3 = r3 * r1
            int r4 = r5 + (-48)
            int r4 = r4 + r3
            if (r6 < r15) goto Lb8
            if (r6 > r0) goto Lb8
            if (r7 < r15) goto Lb8
            if (r7 > r0) goto Lb8
            int r3 = r6 + (-48)
            int r3 = r3 * r1
            int r5 = r7 + (-48)
            int r5 = r5 + r3
            if (r8 < r15) goto Lb8
            if (r8 > r0) goto Lb8
            if (r9 < r15) goto Lb8
            if (r9 > r0) goto Lb8
            int r3 = r8 + (-48)
            int r3 = r3 * r1
            int r6 = r9 + (-48)
            int r6 = r6 + r3
            if (r10 < r15) goto Lb8
            if (r10 > r0) goto Lb8
            if (r11 < r15) goto Lb8
            if (r11 > r0) goto Lb8
            int r3 = r10 + (-48)
            int r3 = r3 * r1
            int r7 = r11 + (-48)
            int r7 = r7 + r3
            if (r12 < r15) goto Lb8
            if (r12 > r0) goto Lb8
            if (r13 < r15) goto Lb8
            if (r13 > r0) goto Lb8
            int r0 = r12 + (-48)
            int r0 = r0 * r1
            int r1 = r13 + (-48)
            int r1 = r1 + r0
            if (r2 != 0) goto L99
            if (r4 != 0) goto L99
            if (r5 != 0) goto L99
            if (r6 != 0) goto L99
            if (r7 != 0) goto L99
            if (r1 != 0) goto L99
            return r16
        L99:
            r0 = 24
            if (r6 > r0) goto Lb8
            r0 = 60
            if (r7 > r0) goto Lb8
            if (r1 <= r0) goto La4
            goto Lb8
        La4:
            r0 = 0
            r23 = r0
            r22 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r17, r18, r19, r20, r21, r22, r23)
            return r0
        Lb8:
            return r16
    }

    public static java.time.LocalDateTime localDateTime(char r17, char r18, char r19, char r20, char r21, char r22, char r23, char r24, char r25, char r26, char r27, char r28, char r29, char r30, char r31, char r32, char r33, char r34, char r35, char r36, char r37, char r38, char r39) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r16 = 0
            r15 = 48
            if (r0 < r15) goto L10e
            r14 = 57
            if (r0 > r14) goto L10e
            if (r1 < r15) goto L10e
            if (r1 > r14) goto L10e
            if (r2 < r15) goto L10e
            if (r2 > r14) goto L10e
            if (r3 < r15) goto L10e
            if (r3 > r14) goto L10e
            int r0 = r0 - r15
            r14 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0 * r14
            r14 = 100
            int r0 = p.a.z(r1, r15, r14, r0)
            r1 = 10
            int r0 = p.a.z(r2, r15, r1, r0)
            int r2 = r3 + (-48)
            int r2 = r2 + r0
            if (r4 < r15) goto L10e
            r0 = 57
            if (r4 > r0) goto L10e
            if (r5 < r15) goto L10e
            if (r5 > r0) goto L10e
            int r3 = r4 + (-48)
            int r3 = r3 * r1
            int r4 = r5 + (-48)
            int r4 = r4 + r3
            if (r6 < r15) goto L10e
            if (r6 > r0) goto L10e
            if (r7 < r15) goto L10e
            if (r7 > r0) goto L10e
            int r3 = r6 + (-48)
            int r3 = r3 * r1
            int r5 = r7 + (-48)
            int r5 = r5 + r3
            if (r8 < r15) goto L10e
            if (r8 > r0) goto L10e
            if (r9 < r15) goto L10e
            if (r9 > r0) goto L10e
            int r3 = r8 + (-48)
            int r3 = r3 * r1
            int r6 = r9 + (-48)
            int r6 = r6 + r3
            if (r10 < r15) goto L10e
            if (r10 > r0) goto L10e
            if (r11 < r15) goto L10e
            if (r11 > r0) goto L10e
            int r3 = r10 + (-48)
            int r3 = r3 * r1
            int r7 = r11 + (-48)
            int r7 = r7 + r3
            if (r12 < r15) goto L10e
            if (r12 > r0) goto L10e
            if (r13 < r15) goto L10e
            if (r13 > r0) goto L10e
            int r3 = r12 + (-48)
            int r3 = r3 * r1
            int r8 = r13 + (-48)
            int r8 = r8 + r3
            r3 = r31
            if (r3 < r15) goto L10e
            if (r3 > r0) goto L10e
            r9 = r32
            if (r9 < r15) goto L10e
            if (r9 > r0) goto L10e
            r10 = r33
            if (r10 < r15) goto L10e
            if (r10 > r0) goto L10e
            r11 = r34
            if (r11 < r15) goto L10e
            if (r11 > r0) goto L10e
            r12 = r35
            if (r12 < r15) goto L10e
            if (r12 > r0) goto L10e
            r13 = r36
            if (r13 < r15) goto L10e
            if (r13 > r0) goto L10e
            r1 = r37
            if (r1 < r15) goto L10e
            if (r1 > r0) goto L10e
            r14 = r38
            if (r14 < r15) goto L10e
            if (r14 > r0) goto L10e
            r19 = r2
            r2 = r39
            if (r2 < r15) goto L10e
            if (r2 > r0) goto L10e
            int r0 = r3 + (-48)
            r3 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r0 = r0 * r3
            r3 = 10000000(0x989680, float:1.4012985E-38)
            int r0 = p.a.z(r9, r15, r3, r0)
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r0 = p.a.z(r10, r15, r3, r0)
            r3 = 100000(0x186a0, float:1.4013E-40)
            int r0 = p.a.z(r11, r15, r3, r0)
            r3 = 10000(0x2710, float:1.4013E-41)
            int r0 = p.a.z(r12, r15, r3, r0)
            r3 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r13, r15, r3, r0)
            r3 = 100
            int r0 = p.a.z(r1, r15, r3, r0)
            r1 = 10
            int r0 = p.a.z(r14, r15, r1, r0)
            int r1 = r2 + (-48)
            int r1 = r1 + r0
            r18 = r19
            r24 = r1
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r18, r19, r20, r21, r22, r23, r24)
            return r0
        L10e:
            return r16
    }

    public static long millis(java.time.LocalDateTime r8) {
            int r1 = r8.getYear()
            int r2 = r8.getMonthValue()
            int r3 = r8.getDayOfMonth()
            int r4 = r8.getHour()
            int r5 = r8.getMinute()
            int r6 = r8.getSecond()
            int r7 = r8.getNano()
            r0 = 0
            long r0 = millis(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static long millis(java.time.LocalDateTime r8, java.time.ZoneId r9) {
            int r1 = r8.getYear()
            int r2 = r8.getMonthValue()
            int r3 = r8.getDayOfMonth()
            int r4 = r8.getHour()
            int r5 = r8.getMinute()
            int r6 = r8.getSecond()
            int r7 = r8.getNano()
            r0 = r9
            long r8 = millis(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static long millis(java.time.ZoneId r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
            if (r6 != 0) goto L4
            java.time.ZoneId r6 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
        L4:
            int r0 = r7 * 365
            int r1 = r7 + 3
            int r1 = r1 / 4
            int r2 = r7 + 99
            int r2 = r2 / 100
            int r1 = r1 - r2
            int r2 = r7 + 399
            int r2 = r2 / 400
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r8 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / 12
            int r0 = r0 + r2
            int r1 = r9 + (-1)
            int r1 = r1 + r0
            long r0 = (long) r1
            r2 = 2
            if (r8 <= r2) goto L38
            r2 = 1
            long r2 = r0 - r2
            r4 = r7 & 3
            if (r4 != 0) goto L35
            int r4 = r7 % 100
            if (r4 != 0) goto L33
            int r4 = r7 % 400
            if (r4 != 0) goto L35
        L33:
            r0 = r2
            goto L38
        L35:
            r2 = 2
            long r0 = r0 - r2
        L38:
            r2 = 719528(0xafaa8, double:3.55494E-318)
            long r0 = r0 - r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r2
            int r2 = r10 * 3600
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r11 * 60
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = (long) r12
            long r0 = r0 + r2
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            r3 = 0
            if (r6 == r2) goto L5a
            java.time.zone.ZoneRules r2 = r6.getRules()
            java.time.zone.ZoneRules r4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r2 != r4) goto L58
            goto L5a
        L58:
            r2 = r3
            goto L5b
        L5a:
            r2 = 1
        L5b:
            if (r2 == 0) goto L67
            r4 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L67
            r3 = 28800(0x7080, float:4.0357E-41)
            goto L90
        L67:
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            if (r6 == r2) goto L90
            java.lang.String r2 = "UTC"
            java.lang.String r4 = r6.getId()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L78
            goto L90
        L78:
            java.time.LocalDate r7 = java.time.LocalDate.of(r7, r8, r9)
            java.time.LocalTime r8 = java.time.LocalTime.of(r10, r11, r12, r13)
            java.time.LocalDateTime r7 = java.time.LocalDateTime.of(r7, r8)
            java.time.zone.ZoneRules r6 = r6.getRules()
            java.time.ZoneOffset r6 = r6.getOffset(r7)
            int r3 = r6.getTotalSeconds()
        L90:
            long r6 = (long) r3
            long r0 = r0 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            if (r13 == 0) goto L9d
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r13 = r13 / r6
            long r6 = (long) r13
            long r0 = r0 + r6
        L9d:
            return r0
    }

    public static int month(char r7, char r8, char r9) {
            r0 = 65
            r1 = 117(0x75, float:1.64E-43)
            r2 = 114(0x72, float:1.6E-43)
            r3 = 112(0x70, float:1.57E-43)
            if (r7 == r0) goto L6e
            r0 = 68
            r4 = 99
            r5 = 101(0x65, float:1.42E-43)
            if (r7 == r0) goto L67
            r0 = 70
            if (r7 == r0) goto L5f
            r0 = 74
            r6 = 97
            if (r7 == r0) goto L4b
            r0 = 83
            if (r7 == r0) goto L44
            switch(r7) {
                case 77: goto L38;
                case 78: goto L2d;
                case 79: goto L24;
                default: goto L23;
            }
        L23:
            goto L7d
        L24:
            if (r8 != r4) goto L7d
            r7 = 116(0x74, float:1.63E-43)
            if (r9 != r7) goto L7d
            r7 = 10
            return r7
        L2d:
            r7 = 111(0x6f, float:1.56E-43)
            if (r8 != r7) goto L7d
            r7 = 118(0x76, float:1.65E-43)
            if (r9 != r7) goto L7d
            r7 = 11
            return r7
        L38:
            if (r8 != r6) goto L7d
            if (r9 != r2) goto L3e
            r7 = 3
            return r7
        L3e:
            r7 = 121(0x79, float:1.7E-43)
            if (r9 != r7) goto L7d
            r7 = 5
            return r7
        L44:
            if (r8 != r5) goto L7d
            if (r9 != r3) goto L7d
            r7 = 9
            return r7
        L4b:
            r7 = 110(0x6e, float:1.54E-43)
            if (r8 != r6) goto L53
            if (r9 != r7) goto L53
            r7 = 1
            return r7
        L53:
            if (r8 != r1) goto L7d
            if (r9 != r7) goto L59
            r7 = 6
            return r7
        L59:
            r7 = 108(0x6c, float:1.51E-43)
            if (r9 != r7) goto L7d
            r7 = 7
            return r7
        L5f:
            if (r8 != r5) goto L7d
            r7 = 98
            if (r9 != r7) goto L7d
            r7 = 2
            return r7
        L67:
            if (r8 != r5) goto L7d
            if (r9 != r4) goto L7d
            r7 = 12
            return r7
        L6e:
            if (r8 != r3) goto L74
            if (r9 != r2) goto L74
            r7 = 4
            return r7
        L74:
            if (r8 != r1) goto L7d
            r7 = 103(0x67, float:1.44E-43)
            if (r9 != r7) goto L7d
            r7 = 8
            return r7
        L7d:
            r7 = 0
            return r7
    }

    public static int nanos(int r1, int r2) {
            int[] r0 = com.alibaba.fastjson2.util.DateUtils.POWERS
            int r2 = 9 - r2
            r2 = r2 & 15
            r2 = r0[r2]
            int r1 = r1 * r2
            return r1
    }

    public static java.util.Date parseDate(java.lang.String r4) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r0 = parseMillis(r4, r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r4 = 0
            return r4
        Le:
            java.util.Date r4 = new java.util.Date
            r4.<init>(r0)
            return r4
    }

    public static java.util.Date parseDate(java.lang.String r1, java.lang.String r2) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.util.Date r1 = parseDate(r1, r2, r0)
            return r1
    }

    public static java.util.Date parseDate(java.lang.String r8, java.lang.String r9, java.time.ZoneId r10) {
            r0 = 0
            if (r8 == 0) goto L131
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L131
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L13
            goto L131
        L13:
            if (r9 == 0) goto L1b
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L1e
        L1b:
            r9 = r10
            goto L120
        L1e:
            int r0 = r9.hashCode()
            r1 = -1
            switch(r0) {
                case -347789785: goto L83;
                case -276306848: goto L78;
                case -159776256: goto L6d;
                case -102516032: goto L62;
                case 311496928: goto L57;
                case 1333195168: goto L4c;
                case 1397504320: goto L41;
                case 1798231098: goto L36;
                case 2095190916: goto L28;
                default: goto L26;
            }
        L26:
            goto L8d
        L28:
            java.lang.String r0 = "iso8601"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L32
            goto L8d
        L32:
            r1 = 8
            goto L8d
        L36:
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L3f
            goto L8d
        L3f:
            r1 = 7
            goto L8d
        L41:
            java.lang.String r0 = "dd.MM.yyyy HH:mm:ss"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4a
            goto L8d
        L4a:
            r1 = 6
            goto L8d
        L4c:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L55
            goto L8d
        L55:
            r1 = 5
            goto L8d
        L57:
            java.lang.String r0 = "yyyy/MM/dd HH:mm:ss"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L60
            goto L8d
        L60:
            r1 = 4
            goto L8d
        L62:
            java.lang.String r0 = "yyyy/MM/dd"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L6b
            goto L8d
        L6b:
            r1 = 3
            goto L8d
        L6d:
            java.lang.String r0 = "yyyy-MM-dd"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L76
            goto L8d
        L76:
            r1 = 2
            goto L8d
        L78:
            java.lang.String r0 = "yyyyMMdd"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L81
            goto L8d
        L81:
            r1 = 1
            goto L8d
        L83:
            java.lang.String r0 = "yyyyMMddHHmmssSSSZ"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L8c
            goto L8d
        L8c:
            r1 = 0
        L8d:
            switch(r1) {
                case 0: goto L114;
                case 1: goto Lf1;
                case 2: goto Le5;
                case 3: goto Ld9;
                case 4: goto Lcd;
                case 5: goto Lc3;
                case 6: goto Lb7;
                case 7: goto Lab;
                case 8: goto La6;
                default: goto L90;
            }
        L90:
            if (r10 != 0) goto L94
            java.time.ZoneId r10 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
        L94:
            java.time.format.DateTimeFormatter r9 = java.time.format.DateTimeFormatter.ofPattern(r9)
            java.time.LocalDateTime r8 = java.time.LocalDateTime.parse(r8, r9)
            long r8 = millis(r8, r10)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        La6:
            java.util.Date r8 = parseDate(r8)
            return r8
        Lab:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r9 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T
            long r8 = parseMillis19(r8, r10, r9)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        Lb7:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r9 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT
            long r8 = parseMillis19(r8, r10, r9)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        Lc3:
            long r8 = parseMillisYMDHMS19(r8, r10)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        Lcd:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r9 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH
            long r8 = parseMillis19(r8, r10, r9)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        Ld9:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r9 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH
            long r8 = parseMillis10(r8, r10, r9)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        Le5:
            com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r9 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH
            long r8 = parseMillis10(r8, r10, r9)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        Lf1:
            java.time.format.DateTimeFormatter r9 = java.time.format.DateTimeFormatter.ofPattern(r9)
            java.time.LocalDate r8 = java.time.LocalDate.parse(r8, r9)
            int r1 = r8.getYear()
            int r2 = r8.getMonthValue()
            int r3 = r8.getDayOfMonth()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r10
            long r8 = millis(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        L114:
            java.time.ZoneId r9 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r8 = parseMillis(r8, r9)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        L120:
            long r8 = parseMillis(r8, r9)
            r1 = 0
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L12b
            return r0
        L12b:
            java.util.Date r10 = new java.util.Date
            r10.<init>(r8)
            return r10
        L131:
            return r0
    }

    public static java.util.Date parseDate(java.lang.String r2, java.time.ZoneId r3) {
            long r2 = parseMillis(r2, r3)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            return r0
    }

    public static java.util.Date parseDateYMDHMS19(java.lang.String r2) {
            if (r2 == 0) goto L15
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L15
        L9:
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r0 = parseMillisYMDHMS19(r2, r0)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public static java.time.LocalDate parseLocalDate(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            char[] r1 = r4.toCharArray()
            int r2 = r1.length
            r3 = 0
            java.time.LocalDate r1 = parseLocalDate(r1, r3, r2)
            if (r1 != 0) goto L64
            int r1 = r4.hashCode()
            r2 = -1
            switch(r1) {
                case -2035181974: goto L50;
                case -1173940224: goto L45;
                case 0: goto L3a;
                case 3392903: goto L2f;
                case 86814033: goto L24;
                case 1333954784: goto L19;
                default: goto L18;
            }
        L18:
            goto L5a
        L19:
            java.lang.String r1 = "0000-00-00"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L22
            goto L5a
        L22:
            r2 = 5
            goto L5a
        L24:
            java.lang.String r1 = "0000年00月00日"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L2d
            goto L5a
        L2d:
            r2 = 4
            goto L5a
        L2f:
            java.lang.String r1 = "null"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L38
            goto L5a
        L38:
            r2 = 3
            goto L5a
        L3a:
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L43
            goto L5a
        L43:
            r2 = 2
            goto L5a
        L45:
            java.lang.String r1 = "00000000"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L4e
            goto L5a
        L4e:
            r2 = 1
            goto L5a
        L50:
            java.lang.String r1 = "0000-0-00"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L59
            goto L5a
        L59:
            r2 = r3
        L5a:
            switch(r2) {
                case 0: goto L63;
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L63;
                case 5: goto L63;
                default: goto L5d;
            }
        L5d:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r4, r4, r3)
            throw r0
        L63:
            return r0
        L64:
            return r1
    }

    public static java.time.LocalDate parseLocalDate(byte[] r5, int r6, int r7) {
            r0 = 0
            if (r5 == 0) goto L63
            if (r7 != 0) goto L6
            goto L63
        L6:
            int r1 = r6 + r7
            int r2 = r5.length
            r3 = 0
            java.lang.String r4 = "illegal input "
            if (r1 > r2) goto L54
            switch(r7) {
                case 8: goto L4f;
                case 9: goto L4a;
                case 10: goto L45;
                case 11: goto L40;
                default: goto L11;
            }
        L11:
            r1 = 4
            if (r7 != r1) goto L31
            r1 = r5[r6]
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 != r2) goto L31
            int r1 = r6 + 1
            r1 = r5[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L31
            int r1 = r6 + 2
            r1 = r5[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L31
            int r1 = r6 + 3
            r1 = r5[r1]
            if (r1 != r2) goto L31
            return r0
        L31:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r6, r7)
            java.time.format.DateTimeParseException r5 = new java.time.format.DateTimeParseException
            java.lang.String r6 = r4.concat(r0)
            r5.<init>(r6, r0, r3)
            throw r5
        L40:
            java.time.LocalDate r5 = parseLocalDate11(r5, r6)
            return r5
        L45:
            java.time.LocalDate r5 = parseLocalDate10(r5, r6)
            return r5
        L4a:
            java.time.LocalDate r5 = parseLocalDate9(r5, r6)
            return r5
        L4f:
            java.time.LocalDate r5 = parseLocalDate8(r5, r6)
            return r5
        L54:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r6, r7)
            java.time.format.DateTimeParseException r5 = new java.time.format.DateTimeParseException
            java.lang.String r6 = r4.concat(r0)
            r5.<init>(r6, r0, r3)
            throw r5
        L63:
            return r0
    }

    public static java.time.LocalDate parseLocalDate(char[] r5, int r6, int r7) {
            r0 = 0
            if (r5 == 0) goto L63
            if (r7 != 0) goto L6
            goto L63
        L6:
            int r1 = r6 + r7
            int r2 = r5.length
            r3 = 0
            java.lang.String r4 = "illegal input "
            if (r1 > r2) goto L54
            switch(r7) {
                case 8: goto L4f;
                case 9: goto L4a;
                case 10: goto L45;
                case 11: goto L40;
                default: goto L11;
            }
        L11:
            r1 = 4
            if (r7 != r1) goto L31
            char r1 = r5[r6]
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 != r2) goto L31
            int r1 = r6 + 1
            char r1 = r5[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L31
            int r1 = r6 + 2
            char r1 = r5[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L31
            int r1 = r6 + 3
            char r1 = r5[r1]
            if (r1 != r2) goto L31
            return r0
        L31:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r6, r7)
            java.time.format.DateTimeParseException r5 = new java.time.format.DateTimeParseException
            java.lang.String r6 = r4.concat(r0)
            r5.<init>(r6, r0, r3)
            throw r5
        L40:
            java.time.LocalDate r5 = parseLocalDate11(r5, r6)
            return r5
        L45:
            java.time.LocalDate r5 = parseLocalDate10(r5, r6)
            return r5
        L4a:
            java.time.LocalDate r5 = parseLocalDate9(r5, r6)
            return r5
        L4f:
            java.time.LocalDate r5 = parseLocalDate8(r5, r6)
            return r5
        L54:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r6, r7)
            java.time.format.DateTimeParseException r5 = new java.time.format.DateTimeParseException
            java.lang.String r6 = r4.concat(r0)
            r5.<init>(r6, r0, r3)
            throw r5
        L63:
            return r0
    }

    public static java.time.LocalDate parseLocalDate10(byte[] r14, int r15) {
            int r0 = r15 + 10
            int r1 = r14.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r14[r15]
            char r0 = (char) r0
            int r1 = r15 + 1
            r1 = r14[r1]
            char r1 = (char) r1
            int r3 = r15 + 2
            r3 = r14[r3]
            char r3 = (char) r3
            int r4 = r15 + 3
            r4 = r14[r4]
            char r4 = (char) r4
            int r5 = r15 + 4
            r5 = r14[r5]
            char r5 = (char) r5
            int r6 = r15 + 5
            r6 = r14[r6]
            char r6 = (char) r6
            int r7 = r15 + 6
            r7 = r14[r7]
            char r7 = (char) r7
            int r8 = r15 + 7
            r8 = r14[r8]
            char r8 = (char) r8
            int r9 = r15 + 8
            r9 = r14[r9]
            char r9 = (char) r9
            int r15 = r15 + 9
            r14 = r14[r15]
            char r14 = (char) r14
            r15 = 45
            r10 = 48
            r11 = 10
            if (r5 != r15) goto L42
            if (r8 != r15) goto L42
            goto L48
        L42:
            r12 = 47
            if (r5 != r12) goto L4e
            if (r8 != r12) goto L4e
        L48:
            r8 = r1
            r5 = r4
            r1 = r6
            r15 = r7
            r4 = r9
            goto L84
        L4e:
            r13 = 46
            if (r3 != r13) goto L55
            if (r6 != r13) goto L55
            goto L59
        L55:
            if (r3 != r15) goto L61
            if (r6 != r15) goto L61
        L59:
            r15 = r5
            r3 = r9
            r5 = r14
            r14 = r1
            r1 = r4
            r4 = r0
        L5f:
            r0 = r7
            goto L84
        L61:
            if (r3 != r12) goto L6c
            if (r6 != r12) goto L6c
            r15 = r5
            r5 = r14
            r14 = r15
            r15 = r1
            r3 = r9
            r1 = r0
            goto L5f
        L6c:
            r15 = 32
            if (r1 != r15) goto Lc9
            if (r6 != r15) goto Lc9
            int r15 = month(r3, r4, r5)
            if (r15 <= 0) goto Lc9
            int r1 = r15 / 10
            int r1 = r1 + r10
            char r1 = (char) r1
            int r15 = r15 % r11
            int r15 = r15 + r10
            char r15 = (char) r15
            r5 = r14
            r14 = r0
            r0 = r7
            r3 = r9
            r4 = r10
        L84:
            if (r0 < r10) goto Lc9
            r6 = 57
            if (r0 > r6) goto Lc9
            if (r8 < r10) goto Lc9
            if (r8 > r6) goto Lc9
            if (r3 < r10) goto Lc9
            if (r3 > r6) goto Lc9
            if (r5 < r10) goto Lc9
            if (r5 > r6) goto Lc9
            int r0 = r0 - r10
            int r0 = r0 * 1000
            r7 = 100
            int r0 = p.a.z(r8, r10, r7, r0)
            int r0 = p.a.z(r3, r10, r11, r0)
            int r5 = r5 - r10
            int r5 = r5 + r0
            if (r1 < r10) goto Lc9
            if (r1 > r6) goto Lc9
            if (r15 < r10) goto Lc9
            if (r15 > r6) goto Lc9
            int r1 = r1 - r10
            int r1 = r1 * r11
            int r15 = r15 - r10
            int r15 = r15 + r1
            if (r4 < r10) goto Lc9
            if (r4 > r6) goto Lc9
            if (r14 < r10) goto Lc9
            if (r14 > r6) goto Lc9
            int r4 = r4 - r10
            int r4 = r4 * r11
            int r14 = r14 - r10
            int r14 = r14 + r4
            if (r5 != 0) goto Lc4
            if (r15 != 0) goto Lc4
            if (r14 != 0) goto Lc4
            return r2
        Lc4:
            java.time.LocalDate r14 = java.time.LocalDate.of(r5, r15, r14)
            return r14
        Lc9:
            return r2
    }

    public static java.time.LocalDate parseLocalDate10(char[] r17, int r18) {
            r0 = r17
            int r1 = r18 + 10
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r1 = r0[r18]
            int r2 = r18 + 1
            char r2 = r0[r2]
            int r4 = r18 + 2
            char r4 = r0[r4]
            int r5 = r18 + 3
            char r5 = r0[r5]
            int r6 = r18 + 4
            char r6 = r0[r6]
            int r7 = r18 + 5
            char r7 = r0[r7]
            int r8 = r18 + 6
            char r8 = r0[r8]
            int r9 = r18 + 7
            char r9 = r0[r9]
            int r10 = r18 + 8
            char r10 = r0[r10]
            int r11 = r18 + 9
            char r0 = r0[r11]
            r11 = 45
            if (r6 != r11) goto L36
            if (r9 != r11) goto L36
            goto L3c
        L36:
            r14 = 47
            if (r6 != r14) goto L46
            if (r9 != r14) goto L46
        L3c:
            r16 = r3
            r9 = r10
            r17 = 10
            r10 = r0
        L42:
            r0 = 48
            goto Ld3
        L46:
            r15 = 46
            if (r4 != r15) goto L4d
            if (r7 != r15) goto L4d
            goto L51
        L4d:
            if (r4 != r11) goto L61
            if (r7 != r11) goto L61
        L51:
            r16 = r3
            r7 = r5
            r4 = r10
            r17 = 10
            r5 = r0
            r10 = r2
            r2 = r9
            r0 = 48
            r9 = r1
            r1 = r8
            r8 = r6
            goto Ld3
        L61:
            if (r4 != r14) goto L72
            if (r7 != r14) goto L72
            r7 = r1
            r16 = r3
            r1 = r8
            r4 = r10
            r17 = 10
            r8 = r2
            r10 = r6
            r2 = r9
            r9 = r5
            r5 = r0
            goto L42
        L72:
            r11 = 26085(0x65e5, float:3.6553E-41)
            r14 = 26376(0x6708, float:3.696E-41)
            r15 = 24180(0x5e74, float:3.3883E-41)
            if (r6 != r15) goto L88
            if (r8 != r14) goto L88
            if (r0 != r11) goto L88
            r16 = r3
            r8 = r7
            r17 = 10
            r0 = 48
            r7 = 48
            goto Ld3
        L88:
            r16 = r3
            r3 = 51068(0xc77c, float:7.1562E-41)
            r17 = 10
            r13 = 50900(0xc6d4, float:7.1326E-41)
            r18 = 48
            r12 = 45380(0xb144, float:6.3591E-41)
            if (r6 != r12) goto La2
            if (r8 != r13) goto La2
            if (r0 != r3) goto La2
            r0 = r18
            r8 = r7
            r7 = r0
            goto Ld3
        La2:
            if (r6 != r15) goto Lac
            if (r9 != r14) goto Lac
            if (r0 != r11) goto Lac
        La8:
            r0 = r18
        Laa:
            r9 = r0
            goto Ld3
        Lac:
            if (r6 != r12) goto Lb3
            if (r9 != r13) goto Lb3
            if (r0 != r3) goto Lb3
            goto La8
        Lb3:
            r3 = 32
            if (r2 != r3) goto L11a
            if (r7 != r3) goto L11a
            int r2 = month(r4, r5, r6)
            if (r2 <= 0) goto L11a
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r3 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r5 = r0
            r7 = r3
            r4 = r10
            r0 = r18
            r10 = r1
            r1 = r8
            r8 = r2
            r2 = r9
            goto Laa
        Ld3:
            if (r1 < r0) goto L11a
            r3 = 57
            if (r1 > r3) goto L11a
            if (r2 < r0) goto L11a
            if (r2 > r3) goto L11a
            if (r4 < r0) goto L11a
            if (r4 > r3) goto L11a
            if (r5 < r0) goto L11a
            if (r5 > r3) goto L11a
            int r1 = r1 - r0
            int r1 = r1 * 1000
            r6 = 100
            int r1 = p.a.z(r2, r0, r6, r1)
            r2 = r17
            int r1 = p.a.z(r4, r0, r2, r1)
            int r5 = r5 - r0
            int r5 = r5 + r1
            if (r7 < r0) goto L11a
            if (r7 > r3) goto L11a
            if (r8 < r0) goto L11a
            if (r8 > r3) goto L11a
            int r7 = r7 - r0
            int r7 = r7 * r2
            int r8 = r8 - r0
            int r8 = r8 + r7
            if (r9 < r0) goto L11a
            if (r9 > r3) goto L11a
            if (r10 < r0) goto L11a
            if (r10 > r3) goto L11a
            int r9 = r9 - r0
            int r9 = r9 * r2
            int r10 = r10 - r0
            int r10 = r10 + r9
            if (r5 != 0) goto L115
            if (r8 != 0) goto L115
            if (r10 != 0) goto L115
            return r16
        L115:
            java.time.LocalDate r0 = java.time.LocalDate.of(r5, r8, r10)
            return r0
        L11a:
            return r16
    }

    public static java.time.LocalDate parseLocalDate11(byte[] r13, int r14) {
            int r0 = r14 + 11
            int r1 = r13.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r13[r14]
            char r0 = (char) r0
            int r1 = r14 + 1
            r1 = r13[r1]
            char r1 = (char) r1
            int r3 = r14 + 2
            r3 = r13[r3]
            char r3 = (char) r3
            int r4 = r14 + 3
            r4 = r13[r4]
            char r4 = (char) r4
            int r5 = r14 + 4
            r5 = r13[r5]
            char r5 = (char) r5
            int r6 = r14 + 5
            r6 = r13[r6]
            char r6 = (char) r6
            int r7 = r14 + 6
            r7 = r13[r7]
            char r7 = (char) r7
            int r8 = r14 + 7
            r8 = r13[r8]
            char r8 = (char) r8
            int r9 = r14 + 8
            r9 = r13[r9]
            char r9 = (char) r9
            int r10 = r14 + 9
            r10 = r13[r10]
            char r10 = (char) r10
            r11 = 10
            int r14 = r14 + r11
            r13 = r13[r14]
            char r13 = (char) r13
            r14 = 45
            r12 = 48
            if (r5 != r14) goto L4a
            if (r8 != r14) goto L4a
            r14 = 90
            if (r13 != r14) goto L4a
            goto L63
        L4a:
            r14 = 32
            if (r3 != r14) goto La8
            if (r7 != r14) goto La8
            int r14 = month(r4, r5, r6)
            if (r14 <= 0) goto La8
            int r3 = r14 / 10
            int r3 = r3 + r12
            char r6 = (char) r3
            int r14 = r14 % r11
            int r14 = r14 + r12
            char r7 = (char) r14
            r4 = r13
            r3 = r10
            r10 = r1
            r1 = r9
            r9 = r0
            r0 = r8
        L63:
            if (r0 < r12) goto La8
            r13 = 57
            if (r0 > r13) goto La8
            if (r1 < r12) goto La8
            if (r1 > r13) goto La8
            if (r3 < r12) goto La8
            if (r3 > r13) goto La8
            if (r4 < r12) goto La8
            if (r4 > r13) goto La8
            int r0 = r0 - r12
            int r0 = r0 * 1000
            r14 = 100
            int r14 = p.a.z(r1, r12, r14, r0)
            int r14 = p.a.z(r3, r12, r11, r14)
            int r4 = r4 - r12
            int r4 = r4 + r14
            if (r6 < r12) goto La8
            if (r6 > r13) goto La8
            if (r7 < r12) goto La8
            if (r7 > r13) goto La8
            int r6 = r6 - r12
            int r6 = r6 * r11
            int r7 = r7 - r12
            int r7 = r7 + r6
            if (r9 < r12) goto La8
            if (r9 > r13) goto La8
            if (r10 < r12) goto La8
            if (r10 > r13) goto La8
            int r9 = r9 - r12
            int r9 = r9 * r11
            int r10 = r10 - r12
            int r10 = r10 + r9
            if (r4 != 0) goto La3
            if (r7 != 0) goto La3
            if (r10 != 0) goto La3
            return r2
        La3:
            java.time.LocalDate r13 = java.time.LocalDate.of(r4, r7, r10)
            return r13
        La8:
            return r2
    }

    public static java.time.LocalDate parseLocalDate11(char[] r13, int r14) {
            int r0 = r14 + 11
            int r1 = r13.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r13[r14]
            int r1 = r14 + 1
            char r1 = r13[r1]
            int r3 = r14 + 2
            char r3 = r13[r3]
            int r4 = r14 + 3
            char r4 = r13[r4]
            int r5 = r14 + 4
            char r5 = r13[r5]
            int r6 = r14 + 5
            char r6 = r13[r6]
            int r7 = r14 + 6
            char r7 = r13[r7]
            int r8 = r14 + 7
            char r8 = r13[r8]
            int r9 = r14 + 8
            char r9 = r13[r9]
            int r10 = r14 + 9
            char r10 = r13[r10]
            r11 = 10
            int r14 = r14 + r11
            char r13 = r13[r14]
            r14 = 24180(0x5e74, float:3.3883E-41)
            r12 = 48
            if (r5 != r14) goto L41
            r14 = 26376(0x6708, float:3.696E-41)
            if (r8 != r14) goto L41
            r14 = 26085(0x65e5, float:3.6553E-41)
            if (r13 != r14) goto L41
            goto L75
        L41:
            r14 = 45
            if (r5 != r14) goto L4c
            if (r8 != r14) goto L4c
            r14 = 90
            if (r13 != r14) goto L4c
            goto L75
        L4c:
            r14 = 45380(0xb144, float:6.3591E-41)
            if (r5 != r14) goto L5c
            r14 = 50900(0xc6d4, float:7.1326E-41)
            if (r8 != r14) goto L5c
            r14 = 51068(0xc77c, float:7.1562E-41)
            if (r13 != r14) goto L5c
            goto L75
        L5c:
            r14 = 32
            if (r3 != r14) goto Lba
            if (r7 != r14) goto Lba
            int r14 = month(r4, r5, r6)
            if (r14 <= 0) goto Lba
            int r3 = r14 / 10
            int r3 = r3 + r12
            char r6 = (char) r3
            int r14 = r14 % r11
            int r14 = r14 + r12
            char r7 = (char) r14
            r4 = r13
            r3 = r10
            r10 = r1
            r1 = r9
            r9 = r0
            r0 = r8
        L75:
            if (r0 < r12) goto Lba
            r13 = 57
            if (r0 > r13) goto Lba
            if (r1 < r12) goto Lba
            if (r1 > r13) goto Lba
            if (r3 < r12) goto Lba
            if (r3 > r13) goto Lba
            if (r4 < r12) goto Lba
            if (r4 > r13) goto Lba
            int r0 = r0 - r12
            int r0 = r0 * 1000
            r14 = 100
            int r14 = p.a.z(r1, r12, r14, r0)
            int r14 = p.a.z(r3, r12, r11, r14)
            int r4 = r4 - r12
            int r4 = r4 + r14
            if (r6 < r12) goto Lba
            if (r6 > r13) goto Lba
            if (r7 < r12) goto Lba
            if (r7 > r13) goto Lba
            int r6 = r6 - r12
            int r6 = r6 * r11
            int r7 = r7 - r12
            int r7 = r7 + r6
            if (r9 < r12) goto Lba
            if (r9 > r13) goto Lba
            if (r10 < r12) goto Lba
            if (r10 > r13) goto Lba
            int r9 = r9 - r12
            int r9 = r9 * r11
            int r10 = r10 - r12
            int r10 = r10 + r9
            if (r4 != 0) goto Lb5
            if (r7 != 0) goto Lb5
            if (r10 != 0) goto Lb5
            return r2
        Lb5:
            java.time.LocalDate r13 = java.time.LocalDate.of(r4, r7, r10)
            return r13
        Lba:
            return r2
    }

    public static java.time.LocalDate parseLocalDate8(byte[] r11, int r12) {
            int r0 = r12 + 8
            int r1 = r11.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r11[r12]
            char r0 = (char) r0
            int r1 = r12 + 1
            r1 = r11[r1]
            char r1 = (char) r1
            int r3 = r12 + 2
            r3 = r11[r3]
            char r3 = (char) r3
            int r4 = r12 + 3
            r4 = r11[r4]
            char r4 = (char) r4
            int r5 = r12 + 4
            r5 = r11[r5]
            char r5 = (char) r5
            int r6 = r12 + 5
            r6 = r11[r6]
            char r6 = (char) r6
            int r7 = r12 + 6
            r7 = r11[r7]
            char r7 = (char) r7
            int r12 = r12 + 7
            r11 = r11[r12]
            char r11 = (char) r11
            r12 = 45
            r8 = 10
            r9 = 48
            if (r5 != r12) goto L3a
            if (r7 != r12) goto L3a
            r5 = r9
            r7 = r5
            goto L65
        L3a:
            r10 = 47
            if (r1 != r10) goto L49
            if (r4 != r10) goto L49
            r4 = r11
            r11 = r3
            r1 = r6
            r3 = r7
            r7 = r9
            r6 = r0
            r0 = r5
            r5 = r7
            goto L65
        L49:
            if (r1 != r12) goto L65
            if (r6 != r12) goto L65
            int r12 = month(r3, r4, r5)
            if (r12 <= 0) goto L64
            int r1 = r12 / 10
            int r1 = r1 + r9
            char r5 = (char) r1
            int r12 = r12 % r8
            int r12 = r12 + r9
            char r12 = (char) r12
            r1 = 50
            r4 = r11
            r6 = r12
            r11 = r0
            r0 = r1
            r3 = r7
            r1 = r9
            r7 = r1
            goto L65
        L64:
            return r2
        L65:
            if (r0 < r9) goto Laa
            r12 = 57
            if (r0 > r12) goto Laa
            if (r1 < r9) goto Laa
            if (r1 > r12) goto Laa
            if (r3 < r9) goto Laa
            if (r3 > r12) goto Laa
            if (r4 < r9) goto Laa
            if (r4 > r12) goto Laa
            int r0 = r0 - r9
            int r0 = r0 * 1000
            r10 = 100
            int r0 = p.a.z(r1, r9, r10, r0)
            int r0 = p.a.z(r3, r9, r8, r0)
            int r4 = r4 - r9
            int r4 = r4 + r0
            if (r5 < r9) goto Laa
            if (r5 > r12) goto Laa
            if (r6 < r9) goto Laa
            if (r6 > r12) goto Laa
            int r5 = r5 - r9
            int r5 = r5 * r8
            int r6 = r6 - r9
            int r6 = r6 + r5
            if (r7 < r9) goto Laa
            if (r7 > r12) goto Laa
            if (r11 < r9) goto Laa
            if (r11 > r12) goto Laa
            int r7 = r7 - r9
            int r7 = r7 * r8
            int r11 = r11 - r9
            int r11 = r11 + r7
            if (r4 != 0) goto La5
            if (r6 != 0) goto La5
            if (r11 != 0) goto La5
            return r2
        La5:
            java.time.LocalDate r11 = java.time.LocalDate.of(r4, r6, r11)
            return r11
        Laa:
            return r2
    }

    public static java.time.LocalDate parseLocalDate8(char[] r11, int r12) {
            int r0 = r12 + 8
            int r1 = r11.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r11[r12]
            int r1 = r12 + 1
            char r1 = r11[r1]
            int r3 = r12 + 2
            char r3 = r11[r3]
            int r4 = r12 + 3
            char r4 = r11[r4]
            int r5 = r12 + 4
            char r5 = r11[r5]
            int r6 = r12 + 5
            char r6 = r11[r6]
            int r7 = r12 + 6
            char r7 = r11[r7]
            int r12 = r12 + 7
            char r11 = r11[r12]
            r12 = 45
            r8 = 10
            r9 = 48
            if (r5 != r12) goto L32
            if (r7 != r12) goto L32
            r5 = r9
            r7 = r5
            goto L5d
        L32:
            r10 = 47
            if (r1 != r10) goto L41
            if (r4 != r10) goto L41
            r4 = r11
            r11 = r3
            r1 = r6
            r3 = r7
            r7 = r9
            r6 = r0
            r0 = r5
            r5 = r7
            goto L5d
        L41:
            if (r1 != r12) goto L5d
            if (r6 != r12) goto L5d
            int r12 = month(r3, r4, r5)
            if (r12 <= 0) goto L5c
            int r1 = r12 / 10
            int r1 = r1 + r9
            char r5 = (char) r1
            int r12 = r12 % r8
            int r12 = r12 + r9
            char r12 = (char) r12
            r1 = 50
            r4 = r11
            r6 = r12
            r11 = r0
            r0 = r1
            r3 = r7
            r1 = r9
            r7 = r1
            goto L5d
        L5c:
            return r2
        L5d:
            if (r0 < r9) goto La2
            r12 = 57
            if (r0 > r12) goto La2
            if (r1 < r9) goto La2
            if (r1 > r12) goto La2
            if (r3 < r9) goto La2
            if (r3 > r12) goto La2
            if (r4 < r9) goto La2
            if (r4 > r12) goto La2
            int r0 = r0 - r9
            int r0 = r0 * 1000
            r10 = 100
            int r0 = p.a.z(r1, r9, r10, r0)
            int r0 = p.a.z(r3, r9, r8, r0)
            int r4 = r4 - r9
            int r4 = r4 + r0
            if (r5 < r9) goto La2
            if (r5 > r12) goto La2
            if (r6 < r9) goto La2
            if (r6 > r12) goto La2
            int r5 = r5 - r9
            int r5 = r5 * r8
            int r6 = r6 - r9
            int r6 = r6 + r5
            if (r7 < r9) goto La2
            if (r7 > r12) goto La2
            if (r11 < r9) goto La2
            if (r11 > r12) goto La2
            int r7 = r7 - r9
            int r7 = r7 * r8
            int r11 = r11 - r9
            int r11 = r11 + r7
            if (r4 != 0) goto L9d
            if (r6 != 0) goto L9d
            if (r11 != 0) goto L9d
            return r2
        L9d:
            java.time.LocalDate r11 = java.time.LocalDate.of(r4, r6, r11)
            return r11
        La2:
            return r2
    }

    public static java.time.LocalDate parseLocalDate9(byte[] r13, int r14) {
            int r0 = r14 + 9
            int r1 = r13.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r13[r14]
            char r0 = (char) r0
            int r1 = r14 + 1
            r1 = r13[r1]
            char r1 = (char) r1
            int r3 = r14 + 2
            r3 = r13[r3]
            char r3 = (char) r3
            int r4 = r14 + 3
            r4 = r13[r4]
            char r4 = (char) r4
            int r5 = r14 + 4
            r5 = r13[r5]
            char r5 = (char) r5
            int r6 = r14 + 5
            r6 = r13[r6]
            char r6 = (char) r6
            int r7 = r14 + 6
            r7 = r13[r7]
            char r7 = (char) r7
            int r8 = r14 + 7
            r8 = r13[r8]
            char r8 = (char) r8
            int r14 = r14 + 8
            r13 = r13[r14]
            char r13 = (char) r13
            r14 = 10
            r9 = 45
            r10 = 48
            if (r5 != r9) goto L43
            if (r8 != r9) goto L43
        L3c:
            r5 = r3
            r3 = r6
            r8 = r10
            r6 = r4
            r4 = r7
            goto Lb8
        L43:
            if (r5 != r9) goto L4e
            if (r7 != r9) goto L4e
        L47:
            r5 = r6
            r6 = r4
            r4 = r5
            r5 = r3
        L4b:
            r3 = r10
            goto Lb8
        L4e:
            r11 = 47
            if (r5 != r11) goto L55
            if (r8 != r11) goto L55
            goto L3c
        L55:
            if (r5 != r11) goto L5a
            if (r7 != r11) goto L5a
            goto L47
        L5a:
            r12 = 46
            if (r1 != r12) goto L69
            if (r5 != r12) goto L69
        L60:
            r1 = r6
            r6 = r13
            r13 = r0
            r0 = r1
            r1 = r7
            r5 = r8
            r8 = r10
            goto Lb8
        L69:
            if (r3 != r12) goto L76
            if (r5 != r12) goto L76
        L6d:
            r5 = r8
            r3 = r10
            r8 = r0
            r0 = r6
            r6 = r13
            r13 = r1
        L73:
            r1 = r7
            goto Lb8
        L76:
            if (r1 != r9) goto L7b
            if (r5 != r9) goto L7b
            goto L60
        L7b:
            if (r3 != r9) goto L80
            if (r5 != r9) goto L80
            goto L6d
        L80:
            if (r3 != r9) goto L9f
            if (r7 != r9) goto L9f
            int r3 = month(r4, r5, r6)
            if (r3 <= 0) goto L9e
            int r4 = r3 / 10
            int r4 = r4 + r10
            char r4 = (char) r4
            int r3 = r3 % r14
            int r3 = r3 + r10
            char r3 = (char) r3
            r5 = 50
            r6 = r8
            r8 = r0
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r3
            r3 = r6
            r6 = r13
            r13 = r1
            r1 = r10
            goto Lb8
        L9e:
            return r2
        L9f:
            if (r1 != r11) goto Lac
            if (r5 != r11) goto Lac
            r1 = r6
            r6 = r13
            r13 = r4
            r4 = r0
            r0 = r1
            r1 = r7
            r5 = r8
            r8 = r3
            goto L4b
        Lac:
            if (r3 != r11) goto Lfd
            if (r5 != r11) goto Lfd
            r3 = r0
            r0 = r6
            r5 = r8
            r8 = r10
            r6 = r13
            r13 = r4
            r4 = r1
            goto L73
        Lb8:
            if (r0 < r10) goto Lfd
            r7 = 57
            if (r0 > r7) goto Lfd
            if (r1 < r10) goto Lfd
            if (r1 > r7) goto Lfd
            if (r5 < r10) goto Lfd
            if (r5 > r7) goto Lfd
            if (r6 < r10) goto Lfd
            if (r6 > r7) goto Lfd
            int r0 = r0 - r10
            int r0 = r0 * 1000
            r9 = 100
            int r0 = p.a.z(r1, r10, r9, r0)
            int r0 = p.a.z(r5, r10, r14, r0)
            int r6 = r6 - r10
            int r6 = r6 + r0
            if (r3 < r10) goto Lfd
            if (r3 > r7) goto Lfd
            if (r4 < r10) goto Lfd
            if (r4 > r7) goto Lfd
            int r3 = r3 - r10
            int r3 = r3 * r14
            int r4 = r4 - r10
            int r4 = r4 + r3
            if (r8 < r10) goto Lfd
            if (r8 > r7) goto Lfd
            if (r13 < r10) goto Lfd
            if (r13 > r7) goto Lfd
            int r8 = r8 - r10
            int r8 = r8 * r14
            int r13 = r13 - r10
            int r13 = r13 + r8
            if (r6 != 0) goto Lf8
            if (r4 != 0) goto Lf8
            if (r13 != 0) goto Lf8
            return r2
        Lf8:
            java.time.LocalDate r13 = java.time.LocalDate.of(r6, r4, r13)
            return r13
        Lfd:
            return r2
    }

    public static java.time.LocalDate parseLocalDate9(char[] r13, int r14) {
            int r0 = r14 + 9
            int r1 = r13.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r13[r14]
            int r1 = r14 + 1
            char r1 = r13[r1]
            int r3 = r14 + 2
            char r3 = r13[r3]
            int r4 = r14 + 3
            char r4 = r13[r4]
            int r5 = r14 + 4
            char r5 = r13[r5]
            int r6 = r14 + 5
            char r6 = r13[r6]
            int r7 = r14 + 6
            char r7 = r13[r7]
            int r8 = r14 + 7
            char r8 = r13[r8]
            int r14 = r14 + 8
            char r13 = r13[r14]
            r14 = 10
            r9 = 45
            r10 = 48
            if (r5 != r9) goto L3a
            if (r8 != r9) goto L3a
        L33:
            r5 = r3
            r3 = r6
            r8 = r10
            r6 = r4
            r4 = r7
            goto Ld5
        L3a:
            if (r5 != r9) goto L45
            if (r7 != r9) goto L45
        L3e:
            r5 = r6
            r6 = r4
            r4 = r5
            r5 = r3
        L42:
            r3 = r10
            goto Ld5
        L45:
            r11 = 47
            if (r5 != r11) goto L4c
            if (r8 != r11) goto L4c
            goto L33
        L4c:
            if (r5 != r11) goto L51
            if (r7 != r11) goto L51
            goto L3e
        L51:
            r12 = 46
            if (r1 != r12) goto L60
            if (r5 != r12) goto L60
        L57:
            r1 = r6
            r6 = r13
            r13 = r0
            r0 = r1
            r1 = r7
            r5 = r8
            r8 = r10
            goto Ld5
        L60:
            if (r3 != r12) goto L6d
            if (r5 != r12) goto L6d
        L64:
            r5 = r8
            r3 = r10
            r8 = r0
            r0 = r6
            r6 = r13
            r13 = r1
        L6a:
            r1 = r7
            goto Ld5
        L6d:
            if (r1 != r9) goto L72
            if (r5 != r9) goto L72
            goto L57
        L72:
            if (r3 != r9) goto L77
            if (r5 != r9) goto L77
            goto L64
        L77:
            r12 = 24180(0x5e74, float:3.3883E-41)
            if (r5 != r12) goto L8c
            r12 = 26376(0x6708, float:3.696E-41)
            if (r7 != r12) goto L8c
            r12 = 26085(0x65e5, float:3.6553E-41)
            if (r13 != r12) goto L8c
        L83:
            r13 = r6
            r6 = r4
            r4 = r13
            r5 = r3
            r13 = r8
            r3 = r10
            r8 = r3
            goto Ld5
        L8c:
            r12 = 45380(0xb144, float:6.3591E-41)
            if (r5 != r12) goto L9c
            r12 = 50900(0xc6d4, float:7.1326E-41)
            if (r7 != r12) goto L9c
            r12 = 51068(0xc77c, float:7.1562E-41)
            if (r13 != r12) goto L9c
            goto L83
        L9c:
            if (r3 != r9) goto Lbb
            if (r7 != r9) goto Lbb
            int r3 = month(r4, r5, r6)
            if (r3 <= 0) goto Lba
            int r4 = r3 / 10
            int r4 = r4 + r10
            char r4 = (char) r4
            int r3 = r3 % r14
            int r3 = r3 + r10
            char r3 = (char) r3
            r5 = 50
            r6 = r8
            r8 = r0
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r3
            r3 = r6
            r6 = r13
            r13 = r1
            r1 = r10
            goto Ld5
        Lba:
            return r2
        Lbb:
            if (r1 != r11) goto Lc9
            if (r5 != r11) goto Lc9
            r1 = r6
            r6 = r13
            r13 = r4
            r4 = r0
            r0 = r1
            r1 = r7
            r5 = r8
            r8 = r3
            goto L42
        Lc9:
            if (r3 != r11) goto L11a
            if (r5 != r11) goto L11a
            r3 = r0
            r0 = r6
            r5 = r8
            r8 = r10
            r6 = r13
            r13 = r4
            r4 = r1
            goto L6a
        Ld5:
            if (r0 < r10) goto L11a
            r7 = 57
            if (r0 > r7) goto L11a
            if (r1 < r10) goto L11a
            if (r1 > r7) goto L11a
            if (r5 < r10) goto L11a
            if (r5 > r7) goto L11a
            if (r6 < r10) goto L11a
            if (r6 > r7) goto L11a
            int r0 = r0 - r10
            int r0 = r0 * 1000
            r9 = 100
            int r0 = p.a.z(r1, r10, r9, r0)
            int r0 = p.a.z(r5, r10, r14, r0)
            int r6 = r6 - r10
            int r6 = r6 + r0
            if (r3 < r10) goto L11a
            if (r3 > r7) goto L11a
            if (r4 < r10) goto L11a
            if (r4 > r7) goto L11a
            int r3 = r3 - r10
            int r3 = r3 * r14
            int r4 = r4 - r10
            int r4 = r4 + r3
            if (r8 < r10) goto L11a
            if (r8 > r7) goto L11a
            if (r13 < r10) goto L11a
            if (r13 > r7) goto L11a
            int r8 = r8 - r10
            int r8 = r8 * r14
            int r13 = r13 - r10
            int r13 = r13 + r8
            if (r6 != 0) goto L115
            if (r4 != 0) goto L115
            if (r13 != 0) goto L115
            return r2
        L115:
            java.time.LocalDate r13 = java.time.LocalDate.of(r6, r4, r13)
            return r13
        L11a:
            return r2
    }

    public static java.time.LocalDateTime parseLocalDateTime(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length()
            java.time.LocalDateTime r2 = parseLocalDateTime(r2, r0, r1)
            return r2
    }

    public static java.time.LocalDateTime parseLocalDateTime(java.lang.String r4, int r5, int r6) {
            r0 = 0
            if (r4 == 0) goto L80
            if (r6 != 0) goto L7
            goto L80
        L7:
            char[] r1 = new char[r6]
            int r2 = r5 + r6
            r3 = 0
            r4.getChars(r5, r2, r1, r3)
            java.time.LocalDateTime r6 = parseLocalDateTime(r1, r5, r6)
            if (r6 != 0) goto L7f
            int r6 = r4.hashCode()
            r1 = -1
            switch(r6) {
                case -2035181974: goto L6c;
                case -2035179184: goto L61;
                case -1328438272: goto L56;
                case -1173940224: goto L4b;
                case 0: goto L40;
                case 3392903: goto L35;
                case 86814033: goto L2a;
                case 1333954784: goto L1f;
                default: goto L1d;
            }
        L1d:
            r3 = r1
            goto L75
        L1f:
            java.lang.String r6 = "0000-00-00"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L28
            goto L1d
        L28:
            r3 = 7
            goto L75
        L2a:
            java.lang.String r6 = "0000年00月00日"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L33
            goto L1d
        L33:
            r3 = 6
            goto L75
        L35:
            java.lang.String r6 = "null"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L3e
            goto L1d
        L3e:
            r3 = 5
            goto L75
        L40:
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L49
            goto L1d
        L49:
            r3 = 4
            goto L75
        L4b:
            java.lang.String r6 = "00000000"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L54
            goto L1d
        L54:
            r3 = 3
            goto L75
        L56:
            java.lang.String r6 = "000000000000"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L5f
            goto L1d
        L5f:
            r3 = 2
            goto L75
        L61:
            java.lang.String r6 = "0000-00-0"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L6a
            goto L1d
        L6a:
            r3 = 1
            goto L75
        L6c:
            java.lang.String r6 = "0000-0-00"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L75
            goto L1d
        L75:
            switch(r3) {
                case 0: goto L7e;
                case 1: goto L7e;
                case 2: goto L7e;
                case 3: goto L7e;
                case 4: goto L7e;
                case 5: goto L7e;
                case 6: goto L7e;
                case 7: goto L7e;
                default: goto L78;
            }
        L78:
            java.time.format.DateTimeParseException r6 = new java.time.format.DateTimeParseException
            r6.<init>(r4, r4, r5)
            throw r6
        L7e:
            return r0
        L7f:
            return r6
        L80:
            return r0
    }

    public static java.time.LocalDateTime parseLocalDateTime(byte[] r3, int r4, int r5) {
            r0 = 0
            if (r3 == 0) goto L96
            if (r5 != 0) goto L7
            goto L96
        L7:
            switch(r5) {
                case 4: goto L67;
                case 5: goto La;
                case 6: goto La;
                case 7: goto La;
                case 8: goto L59;
                case 9: goto L4b;
                case 10: goto L3d;
                case 11: goto L32;
                case 12: goto L2d;
                case 13: goto La;
                case 14: goto L28;
                case 15: goto La;
                case 16: goto L23;
                case 17: goto L1e;
                case 18: goto L19;
                case 19: goto L14;
                case 20: goto Lf;
                default: goto La;
            }
        La:
            java.time.LocalDateTime r3 = parseLocalDateTimeX(r3, r4, r5)
            return r3
        Lf:
            java.time.LocalDateTime r3 = parseLocalDateTime20(r3, r4)
            return r3
        L14:
            java.time.LocalDateTime r3 = parseLocalDateTime19(r3, r4)
            return r3
        L19:
            java.time.LocalDateTime r3 = parseLocalDateTime18(r3, r4)
            return r3
        L1e:
            java.time.LocalDateTime r3 = parseLocalDateTime17(r3, r4)
            return r3
        L23:
            java.time.LocalDateTime r3 = parseLocalDateTime16(r3, r4)
            return r3
        L28:
            java.time.LocalDateTime r3 = parseLocalDateTime14(r3, r4)
            return r3
        L2d:
            java.time.LocalDateTime r3 = parseLocalDateTime12(r3, r4)
            return r3
        L32:
            java.time.LocalDate r3 = parseLocalDate11(r3, r4)
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L3d:
            java.time.LocalDate r3 = parseLocalDate10(r3, r4)
            if (r3 != 0) goto L44
            return r0
        L44:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L4b:
            java.time.LocalDate r3 = parseLocalDate9(r3, r4)
            if (r3 != 0) goto L52
            return r0
        L52:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L59:
            java.time.LocalDate r3 = parseLocalDate8(r3, r4)
            if (r3 != 0) goto L60
            return r0
        L60:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L67:
            r1 = r3[r4]
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 != r2) goto L84
            int r1 = r4 + 1
            r1 = r3[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L84
            int r1 = r4 + 2
            r1 = r3[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L84
            int r1 = r4 + 3
            r1 = r3[r1]
            if (r1 != r2) goto L84
            return r0
        L84:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r4, r5)
            java.time.format.DateTimeParseException r3 = new java.time.format.DateTimeParseException
            java.lang.String r4 = "illegal input "
            java.lang.String r4 = r4.concat(r0)
            r5 = 0
            r3.<init>(r4, r0, r5)
            throw r3
        L96:
            return r0
    }

    public static java.time.LocalDateTime parseLocalDateTime(char[] r3, int r4, int r5) {
            r0 = 0
            if (r3 == 0) goto Lb0
            if (r5 != 0) goto L7
            goto Lb0
        L7:
            switch(r5) {
                case 4: goto L81;
                case 5: goto La;
                case 6: goto La;
                case 7: goto La;
                case 8: goto L5c;
                case 9: goto L4e;
                case 10: goto L40;
                case 11: goto L32;
                case 12: goto L2d;
                case 13: goto La;
                case 14: goto L28;
                case 15: goto La;
                case 16: goto L23;
                case 17: goto L1e;
                case 18: goto L19;
                case 19: goto L14;
                case 20: goto Lf;
                default: goto La;
            }
        La:
            java.time.LocalDateTime r3 = parseLocalDateTimeX(r3, r4, r5)
            return r3
        Lf:
            java.time.LocalDateTime r3 = parseLocalDateTime20(r3, r4)
            return r3
        L14:
            java.time.LocalDateTime r3 = parseLocalDateTime19(r3, r4)
            return r3
        L19:
            java.time.LocalDateTime r3 = parseLocalDateTime18(r3, r4)
            return r3
        L1e:
            java.time.LocalDateTime r3 = parseLocalDateTime17(r3, r4)
            return r3
        L23:
            java.time.LocalDateTime r3 = parseLocalDateTime16(r3, r4)
            return r3
        L28:
            java.time.LocalDateTime r3 = parseLocalDateTime14(r3, r4)
            return r3
        L2d:
            java.time.LocalDateTime r3 = parseLocalDateTime12(r3, r4)
            return r3
        L32:
            java.time.LocalDate r3 = parseLocalDate11(r3, r4)
            if (r3 != 0) goto L39
            return r0
        L39:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L40:
            java.time.LocalDate r3 = parseLocalDate10(r3, r4)
            if (r3 != 0) goto L47
            return r0
        L47:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L4e:
            java.time.LocalDate r3 = parseLocalDate9(r3, r4)
            if (r3 != 0) goto L55
            return r0
        L55:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L5c:
            r5 = 2
            char r5 = r3[r5]
            r1 = 58
            if (r5 != r1) goto L73
            r5 = 5
            char r5 = r3[r5]
            if (r5 != r1) goto L73
            java.time.LocalTime r3 = parseLocalTime8(r3, r4)
            java.time.LocalDate r4 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r4, r3)
            return r3
        L73:
            java.time.LocalDate r3 = parseLocalDate8(r3, r4)
            if (r3 != 0) goto L7a
            return r0
        L7a:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            return r3
        L81:
            char r1 = r3[r4]
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 != r2) goto L9e
            int r1 = r4 + 1
            char r1 = r3[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L9e
            int r1 = r4 + 2
            char r1 = r3[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L9e
            int r1 = r4 + 3
            char r1 = r3[r1]
            if (r1 != r2) goto L9e
            return r0
        L9e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r4, r5)
            java.time.format.DateTimeParseException r3 = new java.time.format.DateTimeParseException
            java.lang.String r4 = "illegal input "
            java.lang.String r4 = r4.concat(r0)
            r5 = 0
            r3.<init>(r4, r0, r5)
            throw r3
        Lb0:
            return r0
    }

    public static java.time.LocalDateTime parseLocalDateTime12(byte[] r23, int r24) {
            r0 = r23
            r1 = r24
            int r2 = r1 + 12
            int r3 = r0.length
            java.lang.String r5 = "illegal input "
            if (r2 > r3) goto L11d
            r3 = r0[r1]
            char r3 = (char) r3
            int r6 = r1 + 1
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r1 + 2
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r1 + 3
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r1 + 4
            r9 = r0[r9]
            char r9 = (char) r9
            int r10 = r1 + 5
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r1 + 6
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r1 + 7
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r1 + 8
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r1 + 9
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r1 + 10
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r1 + 11
            r4 = r0[r16]
            char r4 = (char) r4
            r16 = r5
            r5 = 48
            if (r3 < r5) goto L10b
            r0 = 57
            if (r3 > r0) goto L106
            if (r6 < r5) goto L106
            if (r6 > r0) goto L106
            if (r7 < r5) goto L106
            if (r7 > r0) goto L106
            if (r8 < r5) goto L106
            if (r8 > r0) goto L106
            int r3 = r3 - r5
            int r3 = r3 * 1000
            r0 = 100
            int r0 = p.a.z(r6, r5, r0, r3)
            r3 = 10
            int r0 = p.a.z(r7, r5, r3, r0)
            int r8 = r8 - r5
            int r17 = r8 + r0
            if (r9 < r5) goto Lf2
            r0 = 57
            if (r9 > r0) goto Lf2
            if (r10 < r5) goto Lf2
            if (r10 > r0) goto Lf2
            int r9 = r9 - r5
            int r9 = r9 * r3
            int r10 = r10 - r5
            int r18 = r10 + r9
            if (r11 < r5) goto Lde
            if (r11 > r0) goto Lde
            if (r12 < r5) goto Lde
            if (r12 > r0) goto Lde
            int r11 = r11 - r5
            int r11 = r11 * r3
            int r12 = r12 - r5
            int r19 = r12 + r11
            if (r13 < r5) goto Lca
            if (r13 > r0) goto Lca
            if (r14 < r5) goto Lca
            if (r14 > r0) goto Lca
            int r13 = r13 - r5
            int r13 = r13 * r3
            int r14 = r14 - r5
            int r20 = r14 + r13
            if (r15 < r5) goto Lb6
            if (r15 > r0) goto Lb6
            if (r4 < r5) goto Lb6
            if (r4 > r0) goto Lb6
            int r15 = r15 - r5
            int r15 = r15 * r3
            int r4 = r4 - r5
            int r21 = r4 + r15
            if (r17 != 0) goto Laf
            if (r18 != 0) goto Laf
            if (r19 != 0) goto Laf
            if (r20 != 0) goto Laf
            if (r21 != 0) goto Laf
            r0 = 0
            return r0
        Laf:
            r22 = 0
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r17, r18, r19, r20, r21, r22)
            return r0
        Lb6:
            java.lang.String r0 = new java.lang.String
            r3 = r23
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r4 = r16
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        Lca:
            r3 = r23
            r4 = r16
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        Lde:
            r3 = r23
            r4 = r16
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        Lf2:
            r3 = r23
            r4 = r16
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L106:
            r3 = r23
        L108:
            r4 = r16
            goto L10d
        L10b:
            r3 = r0
            goto L108
        L10d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L11d:
            r3 = r0
            r4 = r5
            r5 = 0
            java.lang.String r0 = new java.lang.String
            int r2 = r3.length
            int r2 = r2 - r1
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
    }

    public static java.time.LocalDateTime parseLocalDateTime12(char[] r23, int r24) {
            r0 = r23
            r1 = r24
            int r2 = r1 + 12
            int r3 = r0.length
            java.lang.String r5 = "illegal input "
            if (r2 > r3) goto L111
            char r3 = r0[r1]
            int r6 = r1 + 1
            char r6 = r0[r6]
            int r7 = r1 + 2
            char r7 = r0[r7]
            int r8 = r1 + 3
            char r8 = r0[r8]
            int r9 = r1 + 4
            char r9 = r0[r9]
            int r10 = r1 + 5
            char r10 = r0[r10]
            int r11 = r1 + 6
            char r11 = r0[r11]
            int r12 = r1 + 7
            char r12 = r0[r12]
            int r13 = r1 + 8
            char r13 = r0[r13]
            int r14 = r1 + 9
            char r14 = r0[r14]
            int r15 = r1 + 10
            char r15 = r0[r15]
            int r16 = r1 + 11
            char r4 = r0[r16]
            r16 = r5
            r5 = 48
            if (r3 < r5) goto Lff
            r0 = 57
            if (r3 > r0) goto Lfa
            if (r6 < r5) goto Lfa
            if (r6 > r0) goto Lfa
            if (r7 < r5) goto Lfa
            if (r7 > r0) goto Lfa
            if (r8 < r5) goto Lfa
            if (r8 > r0) goto Lfa
            int r3 = r3 - r5
            int r3 = r3 * 1000
            r0 = 100
            int r0 = p.a.z(r6, r5, r0, r3)
            r3 = 10
            int r0 = p.a.z(r7, r5, r3, r0)
            int r8 = r8 - r5
            int r17 = r8 + r0
            if (r9 < r5) goto Le6
            r0 = 57
            if (r9 > r0) goto Le6
            if (r10 < r5) goto Le6
            if (r10 > r0) goto Le6
            int r9 = r9 - r5
            int r9 = r9 * r3
            int r10 = r10 - r5
            int r18 = r10 + r9
            if (r11 < r5) goto Ld2
            if (r11 > r0) goto Ld2
            if (r12 < r5) goto Ld2
            if (r12 > r0) goto Ld2
            int r11 = r11 - r5
            int r11 = r11 * r3
            int r12 = r12 - r5
            int r19 = r12 + r11
            if (r13 < r5) goto Lbe
            if (r13 > r0) goto Lbe
            if (r14 < r5) goto Lbe
            if (r14 > r0) goto Lbe
            int r13 = r13 - r5
            int r13 = r13 * r3
            int r14 = r14 - r5
            int r20 = r14 + r13
            if (r15 < r5) goto Laa
            if (r15 > r0) goto Laa
            if (r4 < r5) goto Laa
            if (r4 > r0) goto Laa
            int r15 = r15 - r5
            int r15 = r15 * r3
            int r4 = r4 - r5
            int r21 = r4 + r15
            if (r17 != 0) goto La3
            if (r18 != 0) goto La3
            if (r19 != 0) goto La3
            if (r20 != 0) goto La3
            if (r21 != 0) goto La3
            r0 = 0
            return r0
        La3:
            r22 = 0
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r17, r18, r19, r20, r21, r22)
            return r0
        Laa:
            java.lang.String r0 = new java.lang.String
            r3 = r23
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r4 = r16
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        Lbe:
            r3 = r23
            r4 = r16
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        Ld2:
            r3 = r23
            r4 = r16
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        Le6:
            r3 = r23
            r4 = r16
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        Lfa:
            r3 = r23
        Lfc:
            r4 = r16
            goto L101
        Lff:
            r3 = r0
            goto Lfc
        L101:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L111:
            r3 = r0
            r4 = r5
            r5 = 0
            java.lang.String r0 = new java.lang.String
            int r2 = r3.length
            int r2 = r2 - r1
            r0.<init>(r3, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
    }

    public static java.time.LocalDateTime parseLocalDateTime14(byte[] r23, int r24) {
            r0 = r23
            int r1 = r24 + 14
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r24]
            char r1 = (char) r1
            int r2 = r24 + 1
            r2 = r0[r2]
            char r2 = (char) r2
            int r4 = r24 + 2
            r4 = r0[r4]
            char r4 = (char) r4
            int r5 = r24 + 3
            r5 = r0[r5]
            char r5 = (char) r5
            int r6 = r24 + 4
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r24 + 5
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r24 + 6
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r24 + 7
            r9 = r0[r9]
            char r9 = (char) r9
            int r10 = r24 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r24 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r24 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r24 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r24 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r24 + 13
            r0 = r0[r15]
            char r0 = (char) r0
            r15 = 48
            r16 = r3
            if (r1 < r15) goto Lbd
            r3 = 57
            if (r1 > r3) goto Lbd
            if (r2 < r15) goto Lbd
            if (r2 > r3) goto Lbd
            if (r4 < r15) goto Lbd
            if (r4 > r3) goto Lbd
            if (r5 < r15) goto Lbd
            if (r5 > r3) goto Lbd
            int r1 = r1 - r15
            int r1 = r1 * 1000
            r3 = 100
            int r1 = p.a.z(r2, r15, r3, r1)
            r2 = 10
            int r1 = p.a.z(r4, r15, r2, r1)
            int r5 = r5 - r15
            int r17 = r5 + r1
            if (r6 < r15) goto Lbd
            r1 = 57
            if (r6 > r1) goto Lbd
            if (r7 < r15) goto Lbd
            if (r7 > r1) goto Lbd
            int r6 = r6 - r15
            int r6 = r6 * r2
            int r7 = r7 - r15
            int r18 = r7 + r6
            if (r8 < r15) goto Lbd
            if (r8 > r1) goto Lbd
            if (r9 < r15) goto Lbd
            if (r9 > r1) goto Lbd
            int r8 = r8 - r15
            int r8 = r8 * r2
            int r9 = r9 - r15
            int r19 = r9 + r8
            if (r10 < r15) goto Lbd
            if (r10 > r1) goto Lbd
            if (r11 < r15) goto Lbd
            if (r11 > r1) goto Lbd
            int r10 = r10 - r15
            int r10 = r10 * r2
            int r11 = r11 - r15
            int r20 = r11 + r10
            if (r12 < r15) goto Lbd
            if (r12 > r1) goto Lbd
            if (r13 < r15) goto Lbd
            if (r13 > r1) goto Lbd
            int r12 = r12 - r15
            int r12 = r12 * r2
            int r13 = r13 - r15
            int r21 = r13 + r12
            if (r14 < r15) goto Lbd
            if (r14 > r1) goto Lbd
            if (r0 < r15) goto Lbd
            if (r0 > r1) goto Lbd
            int r14 = r14 - r15
            int r14 = r14 * r2
            int r0 = r0 - r15
            int r22 = r0 + r14
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r17, r18, r19, r20, r21, r22)
            return r0
        Lbd:
            return r16
    }

    public static java.time.LocalDateTime parseLocalDateTime14(char[] r23, int r24) {
            r0 = r23
            int r1 = r24 + 14
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r1 = r0[r24]
            int r2 = r24 + 1
            char r2 = r0[r2]
            int r4 = r24 + 2
            char r4 = r0[r4]
            int r5 = r24 + 3
            char r5 = r0[r5]
            int r6 = r24 + 4
            char r6 = r0[r6]
            int r7 = r24 + 5
            char r7 = r0[r7]
            int r8 = r24 + 6
            char r8 = r0[r8]
            int r9 = r24 + 7
            char r9 = r0[r9]
            int r10 = r24 + 8
            char r10 = r0[r10]
            int r11 = r24 + 9
            char r11 = r0[r11]
            int r12 = r24 + 10
            char r12 = r0[r12]
            int r13 = r24 + 11
            char r13 = r0[r13]
            int r14 = r24 + 12
            char r14 = r0[r14]
            int r15 = r24 + 13
            char r0 = r0[r15]
            r15 = 48
            r16 = r3
            if (r1 < r15) goto Laf
            r3 = 57
            if (r1 > r3) goto Laf
            if (r2 < r15) goto Laf
            if (r2 > r3) goto Laf
            if (r4 < r15) goto Laf
            if (r4 > r3) goto Laf
            if (r5 < r15) goto Laf
            if (r5 > r3) goto Laf
            int r1 = r1 - r15
            int r1 = r1 * 1000
            r3 = 100
            int r1 = p.a.z(r2, r15, r3, r1)
            r2 = 10
            int r1 = p.a.z(r4, r15, r2, r1)
            int r5 = r5 - r15
            int r17 = r5 + r1
            if (r6 < r15) goto Laf
            r1 = 57
            if (r6 > r1) goto Laf
            if (r7 < r15) goto Laf
            if (r7 > r1) goto Laf
            int r6 = r6 - r15
            int r6 = r6 * r2
            int r7 = r7 - r15
            int r18 = r7 + r6
            if (r8 < r15) goto Laf
            if (r8 > r1) goto Laf
            if (r9 < r15) goto Laf
            if (r9 > r1) goto Laf
            int r8 = r8 - r15
            int r8 = r8 * r2
            int r9 = r9 - r15
            int r19 = r9 + r8
            if (r10 < r15) goto Laf
            if (r10 > r1) goto Laf
            if (r11 < r15) goto Laf
            if (r11 > r1) goto Laf
            int r10 = r10 - r15
            int r10 = r10 * r2
            int r11 = r11 - r15
            int r20 = r11 + r10
            if (r12 < r15) goto Laf
            if (r12 > r1) goto Laf
            if (r13 < r15) goto Laf
            if (r13 > r1) goto Laf
            int r12 = r12 - r15
            int r12 = r12 * r2
            int r13 = r13 - r15
            int r21 = r13 + r12
            if (r14 < r15) goto Laf
            if (r14 > r1) goto Laf
            if (r0 < r15) goto Laf
            if (r0 > r1) goto Laf
            int r14 = r14 - r15
            int r14 = r14 * r2
            int r0 = r0 - r15
            int r22 = r0 + r14
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r17, r18, r19, r20, r21, r22)
            return r0
        Laf:
            return r16
    }

    public static java.time.LocalDateTime parseLocalDateTime16(byte[] r26, int r27) {
            r0 = r26
            int r1 = r27 + 16
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r27]
            int r2 = r27 + 1
            r2 = r0[r2]
            int r4 = r27 + 2
            r4 = r0[r4]
            int r5 = r27 + 3
            r5 = r0[r5]
            int r6 = r27 + 4
            r6 = r0[r6]
            int r7 = r27 + 5
            r7 = r0[r7]
            int r8 = r27 + 6
            r8 = r0[r8]
            int r9 = r27 + 7
            r9 = r0[r9]
            int r10 = r27 + 8
            r10 = r0[r10]
            int r11 = r27 + 9
            r11 = r0[r11]
            int r12 = r27 + 10
            r12 = r0[r12]
            int r13 = r27 + 11
            r13 = r0[r13]
            int r14 = r27 + 12
            r14 = r0[r14]
            int r15 = r27 + 13
            r15 = r0[r15]
            int r16 = r27 + 14
            r17 = r3
            r3 = r0[r16]
            int r16 = r27 + 15
            r0 = r0[r16]
            r26 = r0
            r20 = 10
            r0 = 45
            r21 = 48
            if (r6 != r0) goto L60
            if (r9 != r0) goto L60
            r0 = 84
            if (r12 == r0) goto L5d
            r0 = 32
            if (r12 != r0) goto L60
        L5d:
            r0 = 58
            goto L67
        L60:
            r0 = r26
            r22 = r3
            r3 = 84
            goto L7d
        L67:
            if (r15 != r0) goto L60
            char r0 = (char) r1
            char r1 = (char) r2
            char r2 = (char) r4
            char r4 = (char) r5
            char r5 = (char) r7
            char r6 = (char) r8
            char r7 = (char) r10
            char r8 = (char) r11
            char r9 = (char) r13
            char r10 = (char) r14
            char r3 = (char) r3
            r11 = r26
            char r11 = (char) r11
            r12 = r21
        L79:
            r13 = r12
            r14 = r13
            goto L19d
        L7d:
            if (r10 != r3) goto L97
            r3 = 90
            if (r0 != r3) goto L97
            char r0 = (char) r1
            char r1 = (char) r2
            char r2 = (char) r4
            char r4 = (char) r5
            char r5 = (char) r6
            char r6 = (char) r7
            char r7 = (char) r8
            char r8 = (char) r9
            char r9 = (char) r11
            char r10 = (char) r12
            char r3 = (char) r13
            char r11 = (char) r14
            char r12 = (char) r15
            r13 = r22
            char r13 = (char) r13
            r14 = r21
            goto L19d
        L97:
            r3 = r22
            r22 = r14
            r14 = -27
            r24 = r13
            r13 = -26
            if (r6 != r14) goto Ld2
            r14 = -71
            if (r7 != r14) goto Ld2
            r14 = -76
            if (r8 != r14) goto Ld2
            if (r10 != r13) goto Ld2
            r14 = -100
            if (r11 != r14) goto Ld2
            r14 = -120(0xffffffffffffff88, float:NaN)
            if (r12 != r14) goto Ld2
            if (r15 != r13) goto Ld2
            r14 = -105(0xffffffffffffff97, float:NaN)
            if (r3 != r14) goto Ld2
            r14 = -91
            if (r0 != r14) goto Ld2
            char r0 = (char) r1
            char r1 = (char) r2
            char r2 = (char) r4
            char r4 = (char) r5
            char r6 = (char) r9
            r14 = r24
            char r7 = (char) r14
            r3 = r22
            char r8 = (char) r3
            r3 = r21
            r5 = r3
            r9 = r5
        Lce:
            r10 = r9
            r11 = r10
            r12 = r11
            goto L79
        Ld2:
            r25 = r22
            r14 = r24
            r13 = -27
            if (r6 != r13) goto L108
            r13 = -71
            if (r7 != r13) goto L108
            r13 = -76
            if (r8 != r13) goto L108
            r13 = -26
            if (r11 != r13) goto L108
            r13 = -100
            if (r12 != r13) goto L108
            r13 = -120(0xffffffffffffff88, float:NaN)
            if (r14 != r13) goto L108
            r13 = -26
            if (r15 != r13) goto L108
            r13 = -105(0xffffffffffffff97, float:NaN)
            if (r3 != r13) goto L108
            r13 = -91
            if (r0 != r13) goto L108
            char r0 = (char) r1
            char r1 = (char) r2
            char r2 = (char) r4
            char r4 = (char) r5
            char r5 = (char) r9
            char r6 = (char) r10
            r13 = r25
            char r8 = (char) r13
            r3 = r21
            r7 = r3
            r9 = r7
            goto Lce
        L108:
            r13 = r25
            r26 = r0
            r0 = 45
            if (r6 != r0) goto L134
            if (r9 != r0) goto L134
            r0 = 84
            if (r12 == r0) goto L11a
            r0 = 32
            if (r12 != r0) goto L136
        L11a:
            r0 = 58
            if (r13 != r0) goto L134
            if (r3 != r0) goto L134
            char r0 = (char) r1
            char r1 = (char) r2
            char r2 = (char) r4
            char r4 = (char) r5
            char r5 = (char) r7
            char r6 = (char) r8
            char r7 = (char) r10
            char r8 = (char) r11
            char r10 = (char) r14
            char r11 = (char) r15
            r3 = r26
            char r13 = (char) r3
            r3 = r21
            r9 = r3
        L130:
            r12 = r9
            r14 = r12
            goto L19d
        L134:
            r0 = 32
        L136:
            if (r2 != r0) goto L16b
            if (r7 != r0) goto L16b
            if (r12 != r0) goto L16b
            r0 = 58
            if (r15 != r0) goto L169
            char r0 = (char) r8
            char r2 = (char) r9
            char r7 = (char) r10
            char r8 = (char) r11
            char r4 = (char) r4
            char r5 = (char) r5
            char r6 = (char) r6
            int r4 = month(r4, r5, r6)
            if (r4 <= 0) goto L168
            int r5 = r4 / 10
            int r5 = r5 + 48
            char r5 = (char) r5
            int r4 = r4 % 10
            int r4 = r4 + 48
            char r6 = (char) r4
            char r1 = (char) r1
            char r9 = (char) r14
            char r10 = (char) r13
            char r3 = (char) r3
            r4 = r26
            char r11 = (char) r4
            r4 = r8
            r12 = r21
            r13 = r12
            r14 = r13
            r8 = r1
            r1 = r2
            r2 = r7
            r7 = r14
            goto L19d
        L168:
            return r17
        L169:
            r0 = 32
        L16b:
            if (r2 != r0) goto L209
            if (r7 != r0) goto L209
            if (r12 != r0) goto L209
            r0 = 58
            if (r13 != r0) goto L209
            if (r3 != r0) goto L209
            char r0 = (char) r1
            char r1 = (char) r4
            char r2 = (char) r5
            char r3 = (char) r6
            int r1 = month(r1, r2, r3)
            if (r1 <= 0) goto L209
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r5 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r6 = (char) r1
            char r1 = (char) r8
            char r2 = (char) r9
            char r3 = (char) r10
            char r4 = (char) r11
            char r10 = (char) r14
            char r11 = (char) r15
            r7 = r26
            char r13 = (char) r7
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r21
            r7 = r3
            r9 = r7
            goto L130
        L19d:
            if (r0 < r14) goto L209
            r15 = 57
            if (r0 > r15) goto L209
            if (r1 < r14) goto L209
            if (r1 > r15) goto L209
            if (r2 < r14) goto L209
            if (r2 > r15) goto L209
            if (r4 < r14) goto L209
            if (r4 > r15) goto L209
            int r0 = r0 - r14
            int r0 = r0 * 1000
            r15 = 100
            int r0 = p.a.z(r1, r14, r15, r0)
            r1 = r20
            int r0 = p.a.z(r2, r14, r1, r0)
            int r4 = r4 - r14
            int r18 = r4 + r0
            if (r5 < r14) goto L209
            r0 = 57
            if (r5 > r0) goto L209
            if (r6 < r14) goto L209
            if (r6 > r0) goto L209
            int r5 = r5 - r14
            int r5 = r5 * r1
            int r6 = r6 - r14
            int r19 = r6 + r5
            if (r7 < r14) goto L209
            if (r7 > r0) goto L209
            if (r8 < r14) goto L209
            if (r8 > r0) goto L209
            int r7 = r7 - r14
            int r7 = r7 * r1
            int r8 = r8 - r14
            int r20 = r8 + r7
            if (r9 < r14) goto L209
            if (r9 > r0) goto L209
            if (r10 < r14) goto L209
            if (r10 > r0) goto L209
            int r9 = r9 - r14
            int r9 = r9 * r1
            int r10 = r10 - r14
            int r21 = r10 + r9
            if (r3 < r14) goto L209
            if (r3 > r0) goto L209
            if (r11 < r14) goto L209
            if (r11 > r0) goto L209
            int r3 = r3 - r14
            int r3 = r3 * r1
            int r11 = r11 - r14
            int r22 = r11 + r3
            if (r12 < r14) goto L209
            if (r12 > r0) goto L209
            if (r13 < r14) goto L209
            if (r13 > r0) goto L209
            int r12 = r12 - r14
            int r12 = r12 * r1
            int r13 = r13 - r14
            int r23 = r13 + r12
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r18, r19, r20, r21, r22, r23)
            return r0
        L209:
            return r17
    }

    public static java.time.LocalDateTime parseLocalDateTime16(char[] r24, int r25) {
            r0 = r24
            int r1 = r25 + 16
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r1 = r0[r25]
            int r2 = r25 + 1
            char r2 = r0[r2]
            int r4 = r25 + 2
            char r4 = r0[r4]
            int r5 = r25 + 3
            char r5 = r0[r5]
            int r6 = r25 + 4
            char r6 = r0[r6]
            int r7 = r25 + 5
            char r7 = r0[r7]
            int r8 = r25 + 6
            char r8 = r0[r8]
            int r9 = r25 + 7
            char r9 = r0[r9]
            int r10 = r25 + 8
            char r10 = r0[r10]
            int r11 = r25 + 9
            char r11 = r0[r11]
            int r12 = r25 + 10
            char r12 = r0[r12]
            int r13 = r25 + 11
            char r13 = r0[r13]
            int r14 = r25 + 12
            char r14 = r0[r14]
            int r15 = r25 + 13
            char r15 = r0[r15]
            int r16 = r25 + 14
            r17 = r3
            char r3 = r0[r16]
            int r16 = r25 + 15
            char r0 = r0[r16]
            r16 = r1
            r20 = 10
            r1 = 45
            r21 = 48
            if (r6 != r1) goto L60
            if (r9 != r1) goto L60
            r1 = 84
            if (r12 == r1) goto L5d
            r1 = 32
            if (r12 != r1) goto L60
        L5d:
            r1 = 58
            goto L63
        L60:
            r1 = 84
            goto L73
        L63:
            if (r15 != r1) goto L60
            r6 = r7
            r7 = r8
            r8 = r10
            r12 = r14
            r1 = r16
            r9 = r21
        L6d:
            r15 = r9
            r14 = r0
            r0 = r3
            r3 = r15
            goto Lf9
        L73:
            if (r10 != r1) goto L82
            r1 = 90
            if (r0 != r1) goto L82
            r0 = r13
            r1 = r16
            r13 = r11
            r11 = r9
            r9 = r21
            goto Lf9
        L82:
            r1 = 45
            if (r6 != r1) goto La5
            if (r9 != r1) goto La5
            r1 = 84
            if (r12 == r1) goto L90
            r1 = 32
            if (r12 != r1) goto La7
        L90:
            r1 = 58
            if (r14 != r1) goto La5
            if (r3 != r1) goto La5
            r3 = r0
            r6 = r7
            r7 = r8
            r8 = r10
            r12 = r13
            r14 = r15
            r1 = r16
            r0 = r21
            r9 = r0
        La1:
            r13 = r9
            r15 = r13
            goto Lf9
        La5:
            r1 = 32
        La7:
            if (r2 != r1) goto Lcf
            if (r7 != r1) goto Lcf
            if (r12 != r1) goto Lcf
            r1 = 58
            if (r15 != r1) goto Lcd
            int r1 = month(r4, r5, r6)
            if (r1 <= 0) goto Lcc
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r6 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r7 = (char) r1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r12 = r14
            r11 = r16
            r8 = r21
            r9 = r8
            goto L6d
        Lcc:
            return r17
        Lcd:
            r1 = 32
        Lcf:
            if (r2 != r1) goto L165
            if (r7 != r1) goto L165
            if (r12 != r1) goto L165
            r1 = 58
            if (r14 != r1) goto L165
            if (r3 != r1) goto L165
            int r1 = month(r4, r5, r6)
            if (r1 <= 0) goto L165
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r6 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r7 = (char) r1
            r3 = r0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r12 = r13
            r14 = r15
            r11 = r16
            r0 = r21
            r8 = r0
            r9 = r8
            goto La1
        Lf9:
            if (r1 < r9) goto L165
            r10 = 57
            if (r1 > r10) goto L165
            if (r2 < r9) goto L165
            if (r2 > r10) goto L165
            if (r4 < r9) goto L165
            if (r4 > r10) goto L165
            if (r5 < r9) goto L165
            if (r5 > r10) goto L165
            int r1 = r1 - r9
            int r1 = r1 * 1000
            r10 = 100
            int r1 = p.a.z(r2, r9, r10, r1)
            r2 = r20
            int r1 = p.a.z(r4, r9, r2, r1)
            int r5 = r5 - r9
            int r18 = r5 + r1
            if (r6 < r9) goto L165
            r1 = 57
            if (r6 > r1) goto L165
            if (r7 < r9) goto L165
            if (r7 > r1) goto L165
            int r6 = r6 - r9
            int r6 = r6 * r2
            int r7 = r7 - r9
            int r19 = r7 + r6
            if (r8 < r9) goto L165
            if (r8 > r1) goto L165
            if (r11 < r9) goto L165
            if (r11 > r1) goto L165
            int r8 = r8 - r9
            int r8 = r8 * r2
            int r11 = r11 - r9
            int r20 = r11 + r8
            if (r13 < r9) goto L165
            if (r13 > r1) goto L165
            if (r12 < r9) goto L165
            if (r12 > r1) goto L165
            int r13 = r13 - r9
            int r13 = r13 * r2
            int r12 = r12 - r9
            int r21 = r12 + r13
            if (r0 < r9) goto L165
            if (r0 > r1) goto L165
            if (r14 < r9) goto L165
            if (r14 > r1) goto L165
            int r0 = r0 - r9
            int r0 = r0 * r2
            int r14 = r14 - r9
            int r22 = r14 + r0
            if (r15 < r9) goto L165
            if (r15 > r1) goto L165
            if (r3 < r9) goto L165
            if (r3 > r1) goto L165
            int r15 = r15 - r9
            int r15 = r15 * r2
            int r3 = r3 - r9
            int r23 = r3 + r15
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r18, r19, r20, r21, r22, r23)
            return r0
        L165:
            return r17
    }

    public static java.time.LocalDateTime parseLocalDateTime17(byte[] r32, int r33) {
            r0 = r32
            int r2 = r33 + 17
            int r3 = r0.length
            java.lang.String r4 = "illegal input "
            if (r2 > r3) goto L44c
            r2 = r0[r33]
            int r3 = r33 + 1
            r3 = r0[r3]
            int r6 = r33 + 2
            r6 = r0[r6]
            int r7 = r33 + 3
            r7 = r0[r7]
            int r8 = r33 + 4
            r8 = r0[r8]
            int r9 = r33 + 5
            r9 = r0[r9]
            int r10 = r33 + 6
            r10 = r0[r10]
            int r11 = r33 + 7
            r11 = r0[r11]
            int r12 = r33 + 8
            r12 = r0[r12]
            int r13 = r33 + 9
            r13 = r0[r13]
            int r14 = r33 + 10
            r14 = r0[r14]
            int r15 = r33 + 11
            r15 = r0[r15]
            int r16 = r33 + 12
            r5 = r0[r16]
            int r16 = r33 + 13
            r17 = r4
            r4 = r0[r16]
            int r16 = r33 + 14
            r0 = r32[r16]
            int r16 = r33 + 15
            r1 = r32[r16]
            int r16 = r33 + 16
            r18 = r1
            r1 = r32[r16]
            r16 = r0
            r19 = 100
            r20 = 10
            r21 = 48
            r0 = 45
            if (r8 != r0) goto L68
            if (r11 != r0) goto L68
            r0 = 84
            if (r14 == r0) goto L65
            r0 = 32
            if (r14 != r0) goto L68
        L65:
            r0 = 58
            goto L6f
        L68:
            r0 = r16
            r16 = r1
            r1 = 45
            goto L97
        L6f:
            if (r4 != r0) goto L68
            r0 = 90
            if (r1 != r0) goto L68
            char r0 = (char) r2
            char r1 = (char) r3
            char r2 = (char) r6
            char r3 = (char) r7
            char r4 = (char) r9
            char r6 = (char) r10
            char r7 = (char) r12
            char r8 = (char) r13
            char r9 = (char) r15
            char r5 = (char) r5
            r10 = r16
            char r10 = (char) r10
            r11 = r18
            char r11 = (char) r11
            r12 = r9
            r14 = r10
            r15 = r11
            r31 = r17
            r9 = r21
            r28 = 0
            r10 = r7
            r11 = r8
            r8 = r5
            r7 = r6
            r6 = r9
            r5 = r2
        L94:
            r2 = r6
            goto L34e
        L97:
            if (r8 != r1) goto La6
            if (r10 != r1) goto La6
            r1 = 32
            if (r12 == r1) goto La3
            r1 = 84
            if (r12 != r1) goto La6
        La3:
            r1 = 58
            goto Lb0
        La6:
            r1 = r16
            r16 = r4
            r4 = r1
            r1 = r18
            r18 = r5
            goto Ld7
        Lb0:
            if (r15 != r1) goto La6
            if (r0 != r1) goto La6
            char r0 = (char) r2
            char r1 = (char) r3
            char r2 = (char) r6
            char r3 = (char) r7
            char r6 = (char) r9
            char r8 = (char) r11
            char r9 = (char) r13
            char r7 = (char) r14
            char r10 = (char) r5
            char r11 = (char) r4
            r4 = r18
            char r4 = (char) r4
            r5 = r16
            char r5 = (char) r5
            r12 = r9
            r14 = r10
            r15 = r11
            r31 = r17
            r10 = r21
            r28 = 0
            r9 = r5
            r11 = r8
            r5 = r2
            r8 = r7
            r2 = r10
            r7 = r6
            r6 = r4
            r4 = r2
            goto L34e
        Ld7:
            r5 = -27
            if (r8 != r5) goto L119
            r5 = -71
            if (r9 != r5) goto L119
            r5 = -76
            if (r10 != r5) goto L119
            r5 = -26
            if (r13 != r5) goto L119
            r5 = -100
            if (r14 != r5) goto L119
            r5 = -120(0xffffffffffffff88, float:NaN)
            if (r15 != r5) goto L119
            r5 = -26
            if (r0 != r5) goto L119
            r5 = -105(0xffffffffffffff97, float:NaN)
            if (r1 != r5) goto L119
            r5 = -91
            if (r4 != r5) goto L119
            char r0 = (char) r2
            char r1 = (char) r3
            char r2 = (char) r6
            char r3 = (char) r7
            char r4 = (char) r11
            char r6 = (char) r12
            r5 = r18
            char r7 = (char) r5
            r5 = r16
            char r8 = (char) r5
            r5 = r2
            r10 = r7
            r11 = r8
            r31 = r17
            r2 = r21
            r8 = r2
            r9 = r8
            r12 = r9
            r14 = r12
            r15 = r14
            r28 = 0
            r7 = r6
            r6 = r15
            goto L34e
        L119:
            r5 = r16
            r16 = r4
            r4 = r5
            r5 = r18
            r18 = r1
            r1 = 32
            if (r6 != r1) goto L180
            if (r10 != r1) goto L180
            if (r15 != r1) goto L180
            r1 = 58
            if (r0 != r1) goto L179
            char r0 = (char) r11
            char r1 = (char) r12
            char r6 = (char) r13
            char r10 = (char) r14
            char r7 = (char) r7
            char r8 = (char) r8
            char r9 = (char) r9
            int r7 = month(r7, r8, r9)
            if (r7 <= 0) goto L161
            int r8 = r7 / 10
            int r8 = r8 + 48
            char r8 = (char) r8
            int r7 = r7 % 10
            int r7 = r7 + 48
            char r7 = (char) r7
            char r2 = (char) r2
            char r3 = (char) r3
            char r9 = (char) r5
            char r5 = (char) r4
            r4 = r18
            char r4 = (char) r4
            r11 = r16
            char r11 = (char) r11
            r14 = r4
            r4 = r8
            r12 = r9
            r15 = r11
            r31 = r17
            r9 = r21
            r28 = 0
            r11 = r3
            r8 = r5
            r5 = r6
            r3 = r10
            r6 = r9
            r10 = r2
            goto L94
        L161:
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r1 = r32
            r2 = r33
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = r17
            java.lang.String r2 = r2.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L179:
            r22 = r16
            r23 = r17
            r1 = 32
            goto L184
        L180:
            r22 = r16
            r23 = r17
        L184:
            if (r3 != r1) goto L1db
            if (r9 != r1) goto L1db
            if (r14 != r1) goto L1db
            r1 = 58
            if (r5 != r1) goto L1db
            if (r0 != r1) goto L1db
            char r0 = (char) r2
            char r1 = (char) r6
            char r2 = (char) r7
            char r3 = (char) r8
            int r1 = month(r1, r2, r3)
            if (r1 <= 0) goto L1c3
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r2 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r6 = (char) r1
            char r1 = (char) r10
            char r3 = (char) r11
            char r5 = (char) r12
            char r7 = (char) r13
            char r8 = (char) r15
            char r11 = (char) r4
            r4 = r18
            char r4 = (char) r4
            r9 = r22
            char r9 = (char) r9
            r15 = r11
            r10 = r21
            r12 = r10
            r14 = r12
            r31 = r23
            r28 = 0
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r7
            r7 = r6
            r6 = r4
            r4 = r2
            r2 = r14
            goto L34e
        L1c3:
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r1 = r32
            r2 = r33
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = r23
            java.lang.String r2 = r2.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L1db:
            r1 = r18
            r24 = r22
            r25 = r23
            r16 = r0
            r0 = 32
            if (r3 != r0) goto L244
            if (r9 != r0) goto L244
            if (r14 != r0) goto L244
            r0 = 58
            if (r5 != r0) goto L23d
            if (r1 != r0) goto L23d
            char r0 = (char) r2
            char r1 = (char) r6
            char r2 = (char) r7
            char r3 = (char) r8
            int r1 = month(r1, r2, r3)
            if (r1 <= 0) goto L225
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r2 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r6 = (char) r1
            char r1 = (char) r10
            char r3 = (char) r11
            char r5 = (char) r12
            char r7 = (char) r13
            char r8 = (char) r15
            char r10 = (char) r4
            r4 = r16
            char r11 = (char) r4
            r4 = r24
            char r4 = (char) r4
            r9 = r4
            r14 = r10
            r15 = r11
            r10 = r21
            r12 = r10
            r31 = r25
            r28 = 0
            r11 = r0
            r0 = r1
            r4 = r2
            r1 = r3
            r3 = r7
            r2 = r12
        L221:
            r7 = r6
            r6 = r2
            goto L34e
        L225:
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r1 = r32
            r2 = r33
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = r25
            java.lang.String r2 = r2.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L23d:
            r26 = r24
            r27 = r25
            r0 = 32
            goto L248
        L244:
            r26 = r24
            r27 = r25
        L248:
            if (r3 != r0) goto L2a5
            if (r9 != r0) goto L2a5
            if (r14 != r0) goto L2a5
            r0 = 58
            if (r4 != r0) goto L29e
            if (r1 != r0) goto L29e
            char r0 = (char) r2
            char r1 = (char) r6
            char r2 = (char) r7
            char r3 = (char) r8
            int r1 = month(r1, r2, r3)
            if (r1 <= 0) goto L286
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r4 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r6 = (char) r1
            char r1 = (char) r10
            char r2 = (char) r11
            char r3 = (char) r12
            char r7 = (char) r13
            char r9 = (char) r15
            char r5 = (char) r5
            r8 = r16
            char r11 = (char) r8
            r8 = r26
            char r8 = (char) r8
            r12 = r9
            r15 = r11
            r10 = r21
            r14 = r10
            r31 = r27
            r28 = 0
            r11 = r0
            r0 = r1
            r1 = r2
            r9 = r8
            r2 = r14
            r8 = r5
            r5 = r3
            r3 = r7
            goto L221
        L286:
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r1 = r32
            r2 = r33
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = r27
            java.lang.String r2 = r2.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L29e:
            r28 = r26
            r29 = r27
            r0 = 32
            goto L2a9
        L2a5:
            r28 = r26
            r29 = r27
        L2a9:
            if (r6 != r0) goto L301
            if (r10 != r0) goto L301
            if (r15 != r0) goto L301
            r0 = 58
            if (r4 != r0) goto L301
            if (r1 != r0) goto L301
            char r0 = (char) r2
            char r1 = (char) r3
            char r2 = (char) r7
            char r3 = (char) r8
            char r4 = (char) r9
            int r2 = month(r2, r3, r4)
            if (r2 <= 0) goto L2e9
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r4 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r6 = (char) r2
            char r2 = (char) r11
            char r3 = (char) r12
            char r7 = (char) r13
            char r8 = (char) r14
            char r5 = (char) r5
            r9 = r16
            char r11 = (char) r9
            r9 = r28
            char r9 = (char) r9
            r10 = r0
            r0 = r2
            r15 = r11
            r2 = r21
            r12 = r2
            r14 = r12
            r31 = r29
            r28 = 0
            r11 = r1
            r1 = r3
            r3 = r8
            r8 = r5
            r5 = r7
            r7 = r6
            r6 = r14
            goto L34e
        L2e9:
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r1 = r32
            r2 = r33
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = r29
            java.lang.String r2 = r2.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L301:
            r0 = r16
            r30 = r28
            r31 = r29
            char r2 = (char) r2
            char r3 = (char) r3
            char r6 = (char) r6
            char r7 = (char) r7
            char r8 = (char) r8
            char r9 = (char) r9
            char r10 = (char) r10
            char r11 = (char) r11
            char r12 = (char) r12
            char r13 = (char) r13
            char r14 = (char) r14
            char r15 = (char) r15
            char r5 = (char) r5
            char r4 = (char) r4
            r16 = r2
            r2 = r21
            if (r0 < r2) goto L44a
            r17 = r3
            r3 = 57
            if (r0 > r3) goto L44a
            if (r1 < r2) goto L44a
            if (r1 > r3) goto L44a
            r18 = r0
            r0 = r30
            if (r0 < r2) goto L44a
            if (r0 > r3) goto L44a
            int r18 = r18 + (-48)
            int r3 = r18 * 100
            r22 = r0
            r0 = r20
            int r1 = p.a.z(r1, r2, r0, r3)
            int r0 = r22 + (-48)
            int r0 = r0 + r1
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r0 = r0 * r1
            r1 = r6
            r6 = r5
            r5 = r1
            r28 = r0
            r3 = r7
            r7 = r9
            r0 = r16
            r1 = r17
            r9 = r4
            r4 = r8
            r8 = r13
        L34e:
            if (r0 < r2) goto L432
            r13 = 57
            if (r0 > r13) goto L432
            if (r1 < r2) goto L432
            if (r1 > r13) goto L432
            if (r5 < r2) goto L432
            if (r5 > r13) goto L432
            if (r3 < r2) goto L432
            if (r3 > r13) goto L432
            int r0 = r0 - r2
            int r0 = r0 * 1000
            r13 = r19
            int r0 = p.a.z(r1, r2, r13, r0)
            r1 = 10
            int r0 = p.a.z(r5, r2, r1, r0)
            int r3 = r3 - r2
            int r22 = r3 + r0
            if (r4 < r2) goto L41a
            r3 = 57
            if (r4 > r3) goto L41a
            if (r7 < r2) goto L41a
            if (r7 > r3) goto L41a
            int r4 = r4 - r2
            int r4 = r4 * r1
            int r7 = r7 - r2
            int r23 = r7 + r4
            if (r10 < r2) goto L402
            if (r10 > r3) goto L402
            if (r11 < r2) goto L402
            if (r11 > r3) goto L402
            int r10 = r10 - r2
            int r10 = r10 * r1
            int r11 = r11 - r2
            int r24 = r11 + r10
            if (r12 < r2) goto L3ea
            if (r12 > r3) goto L3ea
            if (r8 < r2) goto L3ea
            if (r8 > r3) goto L3ea
            int r12 = r12 - r2
            int r12 = r12 * r1
            int r8 = r8 - r2
            int r25 = r8 + r12
            if (r14 < r2) goto L3d2
            if (r14 > r3) goto L3d2
            if (r15 < r2) goto L3d2
            if (r15 > r3) goto L3d2
            int r14 = r14 - r2
            int r14 = r14 * r1
            int r15 = r15 - r2
            int r26 = r15 + r14
            if (r6 < r2) goto L3ba
            if (r6 > r3) goto L3ba
            if (r9 < r2) goto L3ba
            if (r9 > r3) goto L3ba
            int r6 = r6 - r2
            int r6 = r6 * r1
            int r9 = r9 - r2
            int r27 = r9 + r6
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r22, r23, r24, r25, r26, r27, r28)
            return r0
        L3ba:
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r1 = r32
            r2 = r33
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r4 = r31
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L3d2:
            r1 = r32
            r2 = r33
            r4 = r31
            r3 = 17
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3ea:
            r1 = r32
            r2 = r33
            r4 = r31
            r3 = 17
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L402:
            r1 = r32
            r2 = r33
            r4 = r31
            r3 = 17
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L41a:
            r1 = r32
            r2 = r33
            r4 = r31
            r3 = 17
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L432:
            r1 = r32
            r2 = r33
            r4 = r31
            java.lang.String r0 = new java.lang.String
            r3 = 17
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L44a:
            r0 = 0
            return r0
        L44c:
            r2 = r33
            r1 = r0
            java.lang.String r0 = new java.lang.String
            int r3 = r1.length
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
    }

    public static java.time.LocalDateTime parseLocalDateTime17(char[] r28, int r29) {
            r0 = r28
            r1 = r29
            int r2 = r1 + 17
            int r3 = r0.length
            if (r2 > r3) goto L238
            char r2 = r0[r1]
            int r3 = r1 + 1
            char r3 = r0[r3]
            int r5 = r1 + 2
            char r5 = r0[r5]
            int r6 = r1 + 3
            char r6 = r0[r6]
            int r7 = r1 + 4
            char r7 = r0[r7]
            int r8 = r1 + 5
            char r8 = r0[r8]
            int r9 = r1 + 6
            char r9 = r0[r9]
            int r10 = r1 + 7
            char r10 = r0[r10]
            int r11 = r1 + 8
            char r11 = r0[r11]
            int r12 = r1 + 9
            char r12 = r0[r12]
            int r13 = r1 + 10
            char r13 = r0[r13]
            int r14 = r1 + 11
            char r14 = r0[r14]
            int r15 = r1 + 12
            char r15 = r0[r15]
            int r16 = r1 + 13
            char r4 = r0[r16]
            int r16 = r1 + 14
            r17 = r2
            char r2 = r0[r16]
            int r16 = r1 + 15
            r18 = r12
            char r12 = r0[r16]
            int r1 = r1 + 16
            char r0 = r0[r1]
            r28 = 100
            r16 = 0
            r20 = 10
            r1 = 45
            r21 = 48
            if (r7 != r1) goto L85
            if (r10 != r1) goto L85
            r1 = 84
            if (r13 == r1) goto L65
            r1 = 32
            if (r13 != r1) goto L68
        L65:
            r1 = 58
            goto L6b
        L68:
            r1 = 45
            goto L85
        L6b:
            if (r4 != r1) goto L68
            r1 = 90
            if (r0 != r1) goto L68
            r13 = r2
            r10 = r3
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r14
            r2 = r17
            r3 = r18
            r1 = r21
            r4 = r1
            r27 = 0
            r14 = r12
            r12 = r15
            r15 = r4
            goto L1cb
        L85:
            if (r7 != r1) goto L94
            if (r9 != r1) goto L94
            r1 = 32
            if (r11 == r1) goto L91
            r1 = 84
            if (r11 != r1) goto L94
        L91:
            r1 = 58
            goto L97
        L94:
            r1 = 32
            goto Lb0
        L97:
            if (r14 != r1) goto L94
            if (r2 != r1) goto L94
            r1 = r10
            r10 = r3
            r3 = r1
            r1 = r15
            r15 = r12
            r12 = r13
            r13 = r1
            r14 = r4
            r2 = r17
            r11 = r18
            r1 = r21
            r7 = r1
            r9 = r7
            r27 = 0
        Lad:
            r4 = r0
            goto L1cb
        Lb0:
            if (r5 != r1) goto Le0
            if (r9 != r1) goto Le0
            if (r14 != r1) goto Le0
            r1 = 58
            if (r2 != r1) goto Lde
            int r1 = month(r6, r7, r8)
            if (r1 <= 0) goto Ldd
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r7 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r8 = (char) r1
            r14 = r0
            r2 = r10
            r10 = r11
            r6 = r13
            r11 = r15
            r9 = r17
            r5 = r18
            r1 = r21
            r15 = r1
            r27 = 0
            r13 = r12
            r12 = r4
            r4 = r15
            goto L1cb
        Ldd:
            return r16
        Lde:
            r1 = 32
        Le0:
            if (r3 != r1) goto L110
            if (r8 != r1) goto L110
            if (r13 != r1) goto L110
            r1 = 58
            if (r15 != r1) goto L10e
            if (r2 != r1) goto L10e
            int r1 = month(r5, r6, r7)
            if (r1 <= 0) goto L10d
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r7 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r8 = (char) r1
            r2 = r9
            r5 = r11
            r15 = r12
            r12 = r14
            r3 = r17
            r6 = r18
            r1 = r21
            r9 = r1
            r11 = r9
            r13 = r11
            r27 = 0
            r14 = r4
            goto Lad
        L10d:
            return r16
        L10e:
            r1 = 32
        L110:
            if (r3 != r1) goto L142
            if (r8 != r1) goto L142
            if (r13 != r1) goto L142
            r1 = 58
            if (r15 != r1) goto L140
            if (r12 != r1) goto L140
            int r1 = month(r5, r6, r7)
            if (r1 <= 0) goto L13f
            int r3 = r1 / 10
            int r3 = r3 + 48
            char r7 = (char) r3
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r8 = (char) r1
            r13 = r4
            r5 = r11
            r12 = r14
            r3 = r17
            r6 = r18
            r1 = r21
            r11 = r1
            r15 = r11
            r27 = 0
            r4 = r0
        L13a:
            r14 = r2
            r2 = r9
            r9 = r15
            goto L1cb
        L13f:
            return r16
        L140:
            r1 = 32
        L142:
            if (r3 != r1) goto L170
            if (r8 != r1) goto L170
            if (r13 != r1) goto L170
            r1 = 58
            if (r4 != r1) goto L16e
            if (r12 != r1) goto L16e
            int r1 = month(r5, r6, r7)
            if (r1 <= 0) goto L16d
            int r3 = r1 / 10
            int r3 = r3 + 48
            char r7 = (char) r3
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r8 = (char) r1
            r4 = r0
            r5 = r11
            r11 = r14
            r12 = r15
            r3 = r17
            r6 = r18
            r1 = r21
            r13 = r1
            r15 = r13
            r27 = 0
            goto L13a
        L16d:
            return r16
        L16e:
            r1 = 32
        L170:
            if (r5 != r1) goto L19f
            if (r9 != r1) goto L19f
            if (r14 != r1) goto L19f
            r1 = 58
            if (r4 != r1) goto L19f
            if (r12 != r1) goto L19f
            int r1 = month(r6, r7, r8)
            if (r1 <= 0) goto L19e
            int r4 = r1 / 10
            int r4 = r4 + 48
            char r7 = (char) r4
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r8 = (char) r1
            r4 = r0
            r14 = r2
            r2 = r10
            r10 = r11
            r6 = r13
            r12 = r15
            r9 = r17
            r5 = r18
            r1 = r21
            r11 = r1
            r13 = r11
            r15 = r13
            r27 = 0
            goto L1cb
        L19e:
            return r16
        L19f:
            r1 = r21
            if (r2 < r1) goto L237
            r19 = r3
            r3 = 57
            if (r2 > r3) goto L237
            if (r12 < r1) goto L237
            if (r12 > r3) goto L237
            if (r0 < r1) goto L237
            if (r0 > r3) goto L237
            int r2 = r2 + (-48)
            int r2 = r2 * 100
            r3 = r20
            int r2 = p.a.z(r12, r1, r3, r2)
            int r0 = r0 + (-48)
            int r0 = r0 + r2
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r0 = r0 * r2
            r27 = r0
            r3 = r10
            r2 = r17
            r12 = r18
            r10 = r19
        L1cb:
            if (r2 < r1) goto L237
            r0 = 57
            if (r2 > r0) goto L237
            if (r10 < r1) goto L237
            if (r10 > r0) goto L237
            if (r5 < r1) goto L237
            if (r5 > r0) goto L237
            if (r6 < r1) goto L237
            if (r6 > r0) goto L237
            int r2 = r2 - r1
            int r2 = r2 * 1000
            r0 = r28
            int r0 = p.a.z(r10, r1, r0, r2)
            r2 = 10
            int r0 = p.a.z(r5, r1, r2, r0)
            int r6 = r6 - r1
            int r21 = r6 + r0
            if (r7 < r1) goto L237
            r0 = 57
            if (r7 > r0) goto L237
            if (r8 < r1) goto L237
            if (r8 > r0) goto L237
            int r7 = r7 - r1
            int r7 = r7 * r2
            int r8 = r8 - r1
            int r22 = r8 + r7
            if (r9 < r1) goto L237
            if (r9 > r0) goto L237
            if (r3 < r1) goto L237
            if (r3 > r0) goto L237
            int r9 = r9 - r1
            int r9 = r9 * r2
            int r3 = r3 - r1
            int r23 = r3 + r9
            if (r11 < r1) goto L237
            if (r11 > r0) goto L237
            if (r12 < r1) goto L237
            if (r12 > r0) goto L237
            int r11 = r11 - r1
            int r11 = r11 * r2
            int r12 = r12 - r1
            int r24 = r12 + r11
            if (r13 < r1) goto L237
            if (r13 > r0) goto L237
            if (r14 < r1) goto L237
            if (r14 > r0) goto L237
            int r13 = r13 - r1
            int r13 = r13 * r2
            int r14 = r14 - r1
            int r25 = r14 + r13
            if (r15 < r1) goto L237
            if (r15 > r0) goto L237
            if (r4 < r1) goto L237
            if (r4 > r0) goto L237
            int r15 = r15 - r1
            int r15 = r15 * r2
            int r4 = r4 - r1
            int r26 = r4 + r15
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r21, r22, r23, r24, r25, r26, r27)
            return r0
        L237:
            return r16
        L238:
            java.lang.String r2 = new java.lang.String
            int r3 = r0.length
            int r3 = r3 - r1
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = "illegal input "
            java.lang.String r1 = r1.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
    }

    public static java.time.LocalDateTime parseLocalDateTime18(byte[] r28, int r29) {
            r0 = r28
            r1 = r29
            int r2 = r1 + 18
            int r3 = r0.length
            java.lang.String r5 = "illegal input "
            if (r2 > r3) goto L3ed
            r2 = r0[r1]
            char r2 = (char) r2
            int r3 = r1 + 1
            r3 = r0[r3]
            char r3 = (char) r3
            int r6 = r1 + 2
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r1 + 3
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r1 + 4
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r1 + 5
            r9 = r0[r9]
            char r9 = (char) r9
            int r10 = r1 + 6
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r1 + 7
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r1 + 8
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r1 + 9
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r1 + 10
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r1 + 11
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r1 + 12
            r4 = r0[r16]
            char r4 = (char) r4
            int r16 = r1 + 13
            r17 = r2
            r2 = r0[r16]
            char r2 = (char) r2
            int r16 = r1 + 14
            r18 = r12
            r12 = r0[r16]
            char r12 = (char) r12
            int r16 = r1 + 15
            r19 = r12
            r12 = r0[r16]
            char r12 = (char) r12
            int r16 = r1 + 16
            r20 = r15
            r15 = r0[r16]
            char r15 = (char) r15
            int r16 = r1 + 17
            r21 = r5
            r5 = r0[r16]
            char r5 = (char) r5
            r16 = r5
            r24 = 10
            r27 = 48
            r5 = 45
            if (r8 != r5) goto L9b
            if (r10 != r5) goto L9b
            r5 = 32
            if (r13 == r5) goto L81
            r5 = 84
            if (r13 != r5) goto L84
        L81:
            r5 = 58
            goto L87
        L84:
            r5 = 45
            goto L9b
        L87:
            if (r4 != r5) goto L84
            if (r12 != r5) goto L84
            r4 = r2
            r10 = r9
            r8 = r15
            r2 = r17
            r13 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r9 = r5
            goto L2d1
        L9b:
            if (r8 != r5) goto Lc0
            if (r11 != r5) goto Lc0
            r5 = 32
            if (r13 == r5) goto La7
            r5 = 84
            if (r13 != r5) goto Laa
        La7:
            r5 = 58
            goto Lad
        Laa:
            r5 = 45
            goto Lc0
        Lad:
            if (r4 != r5) goto Laa
            if (r12 != r5) goto Laa
            r4 = r2
            r8 = r15
            r2 = r17
            r13 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r11 = r5
            goto L2d1
        Lc0:
            if (r8 != r5) goto Le5
            if (r11 != r5) goto Le5
            r5 = 32
            if (r14 == r5) goto Lcc
            r5 = 84
            if (r14 != r5) goto Lcf
        Lcc:
            r5 = 58
            goto Ld2
        Lcf:
            r5 = 45
            goto Le5
        Ld2:
            if (r4 != r5) goto Lcf
            if (r12 != r5) goto Lcf
            r4 = r2
            r8 = r15
            r2 = r17
            r11 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r14 = r5
            goto L2d1
        Le5:
            if (r8 != r5) goto L10a
            if (r11 != r5) goto L10a
            r5 = 32
            if (r14 == r5) goto Lf1
            r5 = 84
            if (r14 != r5) goto Lf4
        Lf1:
            r5 = 58
            goto Lf7
        Lf4:
            r5 = 45
            goto L10a
        Lf7:
            if (r2 != r5) goto Lf4
            if (r12 != r5) goto Lf4
            r8 = r15
            r2 = r17
            r11 = r18
            r12 = r19
            r14 = r20
            r5 = r27
            r15 = r4
            r4 = r5
            goto L2d1
        L10a:
            if (r8 != r5) goto L119
            if (r11 != r5) goto L119
            r5 = 32
            if (r14 == r5) goto L116
            r5 = 84
            if (r14 != r5) goto L119
        L116:
            r5 = 58
            goto L11c
        L119:
            r5 = 32
            goto L12e
        L11c:
            if (r2 != r5) goto L119
            if (r15 != r5) goto L119
            r15 = r4
            r2 = r17
            r11 = r18
            r4 = r19
            r14 = r20
            r5 = r27
            r8 = r5
            goto L2d1
        L12e:
            if (r3 != r5) goto L172
            if (r9 != r5) goto L172
            if (r14 != r5) goto L172
            r5 = 58
            if (r4 != r5) goto L172
            if (r12 != r5) goto L172
            int r3 = month(r6, r7, r8)
            if (r3 <= 0) goto L15e
            int r4 = r3 / 10
            int r4 = r4 + 48
            char r9 = (char) r4
            int r3 = r3 % 10
            int r3 = r3 + 48
            char r3 = (char) r3
            r4 = r2
            r2 = r10
            r7 = r13
            r8 = r15
            r13 = r17
            r6 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r14 = r5
            r10 = r3
            r3 = r11
            r11 = r14
            goto L2d1
        L15e:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r5 = r21
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L172:
            r5 = r21
            r21 = r4
            r4 = 32
            if (r3 != r4) goto L1c0
            if (r9 != r4) goto L1c0
            if (r14 != r4) goto L1c0
            r4 = 58
            if (r2 != r4) goto L1be
            if (r12 != r4) goto L1be
            int r2 = month(r6, r7, r8)
            if (r2 <= 0) goto L1ac
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r3 = r10
            r10 = r2
            r2 = r3
            r3 = r11
            r7 = r13
            r8 = r15
            r13 = r17
            r6 = r18
            r12 = r19
            r14 = r20
            r15 = r21
            r4 = r27
            r11 = r4
        L1a7:
            r21 = r5
            r5 = r11
            goto L2d1
        L1ac:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L1be:
            r4 = 32
        L1c0:
            if (r3 != r4) goto L203
            if (r9 != r4) goto L203
            if (r14 != r4) goto L203
            r4 = 58
            if (r2 != r4) goto L201
            if (r15 != r4) goto L201
            int r2 = month(r6, r7, r8)
            if (r2 <= 0) goto L1ef
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r3 = r10
            r10 = r2
            r2 = r3
            r3 = r11
            r7 = r13
            r13 = r17
            r6 = r18
            r4 = r19
            r14 = r20
            r15 = r21
            r8 = r27
            r11 = r8
            goto L1a7
        L1ef:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L201:
            r4 = 32
        L203:
            if (r6 != r4) goto L257
            if (r10 != r4) goto L257
            r22 = r3
            r3 = r20
            if (r3 != r4) goto L252
            r4 = r19
            r19 = r11
            r11 = 58
            if (r4 != r11) goto L24f
            if (r15 != r11) goto L24f
            int r3 = month(r7, r8, r9)
            if (r3 <= 0) goto L23d
            int r4 = r3 / 10
            int r4 = r4 + 48
            char r9 = (char) r4
            int r3 = r3 % 10
            int r3 = r3 + 48
            char r3 = (char) r3
            r15 = r2
            r10 = r3
            r6 = r13
            r7 = r14
            r11 = r17
            r3 = r18
            r2 = r19
            r14 = r21
            r13 = r22
            r4 = r27
            r8 = r4
            r21 = r5
            r5 = r8
            goto L2d1
        L23d:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L24f:
            r11 = 32
            goto L25e
        L252:
            r4 = r19
        L254:
            r19 = r11
            goto L24f
        L257:
            r22 = r3
            r4 = r19
            r3 = r20
            goto L254
        L25e:
            if (r6 != r11) goto L2a2
            if (r10 != r11) goto L2a2
            if (r3 != r11) goto L2a2
            r11 = 58
            if (r2 != r11) goto L2a0
            if (r15 != r11) goto L2a0
            int r2 = month(r7, r8, r9)
            if (r2 <= 0) goto L28e
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r10 = r2
            r6 = r13
            r7 = r14
            r11 = r17
            r3 = r18
            r2 = r19
            r15 = r21
            r13 = r22
            r8 = r27
            r14 = r8
        L28a:
            r21 = r5
            r5 = r14
            goto L2d1
        L28e:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L2a0:
            r11 = 32
        L2a2:
            if (r6 != r11) goto L3da
            if (r10 != r11) goto L3da
            if (r3 != r11) goto L3da
            r11 = 58
            if (r2 != r11) goto L3da
            if (r12 != r11) goto L3da
            int r2 = month(r7, r8, r9)
            if (r2 <= 0) goto L3c7
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r10 = r2
            r12 = r4
            r6 = r13
            r7 = r14
            r8 = r15
            r11 = r17
            r3 = r18
            r2 = r19
            r15 = r21
            r13 = r22
            r4 = r27
            r14 = r4
            goto L28a
        L2d1:
            if (r2 < r5) goto L3b3
            r0 = 57
            if (r2 > r0) goto L3ae
            if (r3 < r5) goto L3ae
            if (r3 > r0) goto L3ae
            if (r6 < r5) goto L3ae
            if (r6 > r0) goto L3ae
            if (r7 < r5) goto L3ae
            if (r7 > r0) goto L3ae
            int r2 = r2 - r5
            int r2 = r2 * 1000
            r0 = 100
            int r0 = p.a.z(r3, r5, r0, r2)
            r2 = r24
            int r0 = p.a.z(r6, r5, r2, r0)
            int r7 = r7 - r5
            int r22 = r7 + r0
            if (r9 < r5) goto L398
            r0 = 57
            if (r9 > r0) goto L398
            if (r10 < r5) goto L398
            if (r10 > r0) goto L398
            int r9 = r9 - r5
            int r9 = r9 * r2
            int r10 = r10 - r5
            int r23 = r10 + r9
            if (r11 < r5) goto L382
            if (r11 > r0) goto L382
            if (r13 < r5) goto L382
            if (r13 > r0) goto L382
            int r11 = r11 - r5
            int r11 = r11 * r2
            int r13 = r13 - r5
            int r24 = r13 + r11
            if (r14 < r5) goto L36c
            if (r14 > r0) goto L36c
            if (r15 < r5) goto L36c
            if (r15 > r0) goto L36c
            int r14 = r14 - r5
            int r14 = r14 * r2
            int r15 = r15 - r5
            int r25 = r15 + r14
            if (r4 < r5) goto L356
            if (r4 > r0) goto L356
            if (r12 < r5) goto L356
            if (r12 > r0) goto L356
            int r4 = r4 - r5
            int r4 = r4 * r2
            int r12 = r12 - r5
            int r26 = r12 + r4
            if (r8 < r5) goto L340
            if (r8 > r0) goto L340
            r3 = r16
            if (r3 < r5) goto L340
            if (r3 > r0) goto L340
            int r8 = r8 - r5
            int r8 = r8 * r2
            int r5 = r3 + (-48)
            int r27 = r5 + r8
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r22, r23, r24, r25, r26, r27)
            return r0
        L340:
            java.lang.String r0 = new java.lang.String
            r3 = 18
            r2 = r28
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r5 = r21
            java.lang.String r2 = r5.concat(r0)
            r4 = 0
            r1.<init>(r2, r0, r4)
            throw r1
        L356:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L36c:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L382:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L398:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L3ae:
            r2 = r28
        L3b0:
            r5 = r21
            goto L3b5
        L3b3:
            r2 = r0
            goto L3b0
        L3b5:
            java.lang.String r0 = new java.lang.String
            r3 = 18
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r4 = 0
            r1.<init>(r2, r0, r4)
            throw r1
        L3c7:
            r2 = r0
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L3da:
            r2 = r0
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L3ed:
            r2 = r0
            r4 = 0
            java.lang.String r0 = new java.lang.String
            int r3 = r2.length
            int r3 = r3 - r1
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
    }

    public static java.time.LocalDateTime parseLocalDateTime18(char[] r28, int r29) {
            r0 = r28
            r1 = r29
            int r2 = r1 + 18
            int r3 = r0.length
            java.lang.String r5 = "illegal input "
            if (r2 > r3) goto L3db
            char r2 = r0[r1]
            int r3 = r1 + 1
            char r3 = r0[r3]
            int r6 = r1 + 2
            char r6 = r0[r6]
            int r7 = r1 + 3
            char r7 = r0[r7]
            int r8 = r1 + 4
            char r8 = r0[r8]
            int r9 = r1 + 5
            char r9 = r0[r9]
            int r10 = r1 + 6
            char r10 = r0[r10]
            int r11 = r1 + 7
            char r11 = r0[r11]
            int r12 = r1 + 8
            char r12 = r0[r12]
            int r13 = r1 + 9
            char r13 = r0[r13]
            int r14 = r1 + 10
            char r14 = r0[r14]
            int r15 = r1 + 11
            char r15 = r0[r15]
            int r16 = r1 + 12
            char r4 = r0[r16]
            int r16 = r1 + 13
            r17 = r2
            char r2 = r0[r16]
            int r16 = r1 + 14
            r18 = r12
            char r12 = r0[r16]
            int r16 = r1 + 15
            r19 = r12
            char r12 = r0[r16]
            int r16 = r1 + 16
            r20 = r15
            char r15 = r0[r16]
            int r16 = r1 + 17
            r21 = r5
            char r5 = r0[r16]
            r16 = r5
            r24 = 10
            r27 = 48
            r5 = 45
            if (r8 != r5) goto L89
            if (r10 != r5) goto L89
            r5 = 32
            if (r13 == r5) goto L6f
            r5 = 84
            if (r13 != r5) goto L72
        L6f:
            r5 = 58
            goto L75
        L72:
            r5 = 45
            goto L89
        L75:
            if (r4 != r5) goto L72
            if (r12 != r5) goto L72
            r4 = r2
            r10 = r9
            r8 = r15
            r2 = r17
            r13 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r9 = r5
            goto L2bf
        L89:
            if (r8 != r5) goto Lae
            if (r11 != r5) goto Lae
            r5 = 32
            if (r13 == r5) goto L95
            r5 = 84
            if (r13 != r5) goto L98
        L95:
            r5 = 58
            goto L9b
        L98:
            r5 = 45
            goto Lae
        L9b:
            if (r4 != r5) goto L98
            if (r12 != r5) goto L98
            r4 = r2
            r8 = r15
            r2 = r17
            r13 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r11 = r5
            goto L2bf
        Lae:
            if (r8 != r5) goto Ld3
            if (r11 != r5) goto Ld3
            r5 = 32
            if (r14 == r5) goto Lba
            r5 = 84
            if (r14 != r5) goto Lbd
        Lba:
            r5 = 58
            goto Lc0
        Lbd:
            r5 = 45
            goto Ld3
        Lc0:
            if (r4 != r5) goto Lbd
            if (r12 != r5) goto Lbd
            r4 = r2
            r8 = r15
            r2 = r17
            r11 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r14 = r5
            goto L2bf
        Ld3:
            if (r8 != r5) goto Lf8
            if (r11 != r5) goto Lf8
            r5 = 32
            if (r14 == r5) goto Ldf
            r5 = 84
            if (r14 != r5) goto Le2
        Ldf:
            r5 = 58
            goto Le5
        Le2:
            r5 = 45
            goto Lf8
        Le5:
            if (r2 != r5) goto Le2
            if (r12 != r5) goto Le2
            r8 = r15
            r2 = r17
            r11 = r18
            r12 = r19
            r14 = r20
            r5 = r27
            r15 = r4
            r4 = r5
            goto L2bf
        Lf8:
            if (r8 != r5) goto L107
            if (r11 != r5) goto L107
            r5 = 32
            if (r14 == r5) goto L104
            r5 = 84
            if (r14 != r5) goto L107
        L104:
            r5 = 58
            goto L10a
        L107:
            r5 = 32
            goto L11c
        L10a:
            if (r2 != r5) goto L107
            if (r15 != r5) goto L107
            r15 = r4
            r2 = r17
            r11 = r18
            r4 = r19
            r14 = r20
            r5 = r27
            r8 = r5
            goto L2bf
        L11c:
            if (r3 != r5) goto L160
            if (r9 != r5) goto L160
            if (r14 != r5) goto L160
            r5 = 58
            if (r4 != r5) goto L160
            if (r12 != r5) goto L160
            int r3 = month(r6, r7, r8)
            if (r3 <= 0) goto L14c
            int r4 = r3 / 10
            int r4 = r4 + 48
            char r9 = (char) r4
            int r3 = r3 % 10
            int r3 = r3 + 48
            char r3 = (char) r3
            r4 = r2
            r2 = r10
            r7 = r13
            r8 = r15
            r13 = r17
            r6 = r18
            r12 = r19
            r15 = r20
            r5 = r27
            r14 = r5
            r10 = r3
            r3 = r11
            r11 = r14
            goto L2bf
        L14c:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r5 = r21
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L160:
            r5 = r21
            r21 = r4
            r4 = 32
            if (r3 != r4) goto L1ae
            if (r9 != r4) goto L1ae
            if (r14 != r4) goto L1ae
            r4 = 58
            if (r2 != r4) goto L1ac
            if (r12 != r4) goto L1ac
            int r2 = month(r6, r7, r8)
            if (r2 <= 0) goto L19a
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r3 = r10
            r10 = r2
            r2 = r3
            r3 = r11
            r7 = r13
            r8 = r15
            r13 = r17
            r6 = r18
            r12 = r19
            r14 = r20
            r15 = r21
            r4 = r27
            r11 = r4
        L195:
            r21 = r5
            r5 = r11
            goto L2bf
        L19a:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L1ac:
            r4 = 32
        L1ae:
            if (r3 != r4) goto L1f1
            if (r9 != r4) goto L1f1
            if (r14 != r4) goto L1f1
            r4 = 58
            if (r2 != r4) goto L1ef
            if (r15 != r4) goto L1ef
            int r2 = month(r6, r7, r8)
            if (r2 <= 0) goto L1dd
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r3 = r10
            r10 = r2
            r2 = r3
            r3 = r11
            r7 = r13
            r13 = r17
            r6 = r18
            r4 = r19
            r14 = r20
            r15 = r21
            r8 = r27
            r11 = r8
            goto L195
        L1dd:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L1ef:
            r4 = 32
        L1f1:
            if (r6 != r4) goto L245
            if (r10 != r4) goto L245
            r22 = r3
            r3 = r20
            if (r3 != r4) goto L240
            r4 = r19
            r19 = r11
            r11 = 58
            if (r4 != r11) goto L23d
            if (r15 != r11) goto L23d
            int r3 = month(r7, r8, r9)
            if (r3 <= 0) goto L22b
            int r4 = r3 / 10
            int r4 = r4 + 48
            char r9 = (char) r4
            int r3 = r3 % 10
            int r3 = r3 + 48
            char r3 = (char) r3
            r15 = r2
            r10 = r3
            r6 = r13
            r7 = r14
            r11 = r17
            r3 = r18
            r2 = r19
            r14 = r21
            r13 = r22
            r4 = r27
            r8 = r4
            r21 = r5
            r5 = r8
            goto L2bf
        L22b:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L23d:
            r11 = 32
            goto L24c
        L240:
            r4 = r19
        L242:
            r19 = r11
            goto L23d
        L245:
            r22 = r3
            r4 = r19
            r3 = r20
            goto L242
        L24c:
            if (r6 != r11) goto L290
            if (r10 != r11) goto L290
            if (r3 != r11) goto L290
            r11 = 58
            if (r2 != r11) goto L28e
            if (r15 != r11) goto L28e
            int r2 = month(r7, r8, r9)
            if (r2 <= 0) goto L27c
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r10 = r2
            r6 = r13
            r7 = r14
            r11 = r17
            r3 = r18
            r2 = r19
            r15 = r21
            r13 = r22
            r8 = r27
            r14 = r8
        L278:
            r21 = r5
            r5 = r14
            goto L2bf
        L27c:
            java.lang.String r2 = new java.lang.String
            r3 = 18
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r5.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L28e:
            r11 = 32
        L290:
            if (r6 != r11) goto L3c8
            if (r10 != r11) goto L3c8
            if (r3 != r11) goto L3c8
            r11 = 58
            if (r2 != r11) goto L3c8
            if (r12 != r11) goto L3c8
            int r2 = month(r7, r8, r9)
            if (r2 <= 0) goto L3b5
            int r3 = r2 / 10
            int r3 = r3 + 48
            char r9 = (char) r3
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r10 = r2
            r12 = r4
            r6 = r13
            r7 = r14
            r8 = r15
            r11 = r17
            r3 = r18
            r2 = r19
            r15 = r21
            r13 = r22
            r4 = r27
            r14 = r4
            goto L278
        L2bf:
            if (r2 < r5) goto L3a1
            r0 = 57
            if (r2 > r0) goto L39c
            if (r3 < r5) goto L39c
            if (r3 > r0) goto L39c
            if (r6 < r5) goto L39c
            if (r6 > r0) goto L39c
            if (r7 < r5) goto L39c
            if (r7 > r0) goto L39c
            int r2 = r2 - r5
            int r2 = r2 * 1000
            r0 = 100
            int r0 = p.a.z(r3, r5, r0, r2)
            r2 = r24
            int r0 = p.a.z(r6, r5, r2, r0)
            int r7 = r7 - r5
            int r22 = r7 + r0
            if (r9 < r5) goto L386
            r0 = 57
            if (r9 > r0) goto L386
            if (r10 < r5) goto L386
            if (r10 > r0) goto L386
            int r9 = r9 - r5
            int r9 = r9 * r2
            int r10 = r10 - r5
            int r23 = r10 + r9
            if (r11 < r5) goto L370
            if (r11 > r0) goto L370
            if (r13 < r5) goto L370
            if (r13 > r0) goto L370
            int r11 = r11 - r5
            int r11 = r11 * r2
            int r13 = r13 - r5
            int r24 = r13 + r11
            if (r14 < r5) goto L35a
            if (r14 > r0) goto L35a
            if (r15 < r5) goto L35a
            if (r15 > r0) goto L35a
            int r14 = r14 - r5
            int r14 = r14 * r2
            int r15 = r15 - r5
            int r25 = r15 + r14
            if (r4 < r5) goto L344
            if (r4 > r0) goto L344
            if (r12 < r5) goto L344
            if (r12 > r0) goto L344
            int r4 = r4 - r5
            int r4 = r4 * r2
            int r12 = r12 - r5
            int r26 = r12 + r4
            if (r8 < r5) goto L32e
            if (r8 > r0) goto L32e
            r3 = r16
            if (r3 < r5) goto L32e
            if (r3 > r0) goto L32e
            int r8 = r8 - r5
            int r8 = r8 * r2
            int r5 = r3 + (-48)
            int r27 = r5 + r8
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r22, r23, r24, r25, r26, r27)
            return r0
        L32e:
            java.lang.String r0 = new java.lang.String
            r3 = 18
            r2 = r28
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r5 = r21
            java.lang.String r2 = r5.concat(r0)
            r4 = 0
            r1.<init>(r2, r0, r4)
            throw r1
        L344:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L35a:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L370:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L386:
            r2 = r28
            r5 = r21
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L39c:
            r2 = r28
        L39e:
            r5 = r21
            goto L3a3
        L3a1:
            r2 = r0
            goto L39e
        L3a3:
            java.lang.String r0 = new java.lang.String
            r3 = 18
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r4 = 0
            r1.<init>(r2, r0, r4)
            throw r1
        L3b5:
            r2 = r0
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L3c8:
            r2 = r0
            r3 = 18
            r4 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
        L3db:
            r2 = r0
            r4 = 0
            java.lang.String r0 = new java.lang.String
            int r3 = r2.length
            int r3 = r3 - r1
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r5.concat(r0)
            r1.<init>(r2, r0, r4)
            throw r1
    }

    public static java.time.LocalDateTime parseLocalDateTime19(java.lang.String r3, int r4) {
            int r0 = r4 + 19
            int r1 = r3.length()
            if (r0 <= r1) goto La
            r3 = 0
            return r3
        La:
            r1 = 19
            char[] r1 = new char[r1]
            r2 = 0
            r3.getChars(r4, r0, r1, r2)
            java.time.LocalDateTime r3 = parseLocalDateTime19(r1, r4)
            return r3
    }

    public static java.time.LocalDateTime parseLocalDateTime19(byte[] r28, int r29) {
            r0 = r28
            int r1 = r29 + 19
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r29]
            char r1 = (char) r1
            int r2 = r29 + 1
            r2 = r0[r2]
            char r2 = (char) r2
            int r4 = r29 + 2
            r4 = r0[r4]
            char r4 = (char) r4
            int r5 = r29 + 3
            r5 = r0[r5]
            char r5 = (char) r5
            int r6 = r29 + 4
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r29 + 5
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r29 + 6
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r29 + 7
            r9 = r0[r9]
            char r9 = (char) r9
            int r10 = r29 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r29 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r29 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r29 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r29 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r29 + 13
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r29 + 14
            r17 = r3
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r29 + 15
            r0 = r28[r16]
            char r0 = (char) r0
            int r16 = r29 + 16
            r25 = r0
            r0 = r28[r16]
            char r0 = (char) r0
            int r16 = r29 + 17
            r18 = r1
            r1 = r28[r16]
            char r1 = (char) r1
            int r16 = r29 + 18
            r26 = r1
            r1 = r28[r16]
            char r1 = (char) r1
            r27 = r1
            r1 = 45
            if (r6 != r1) goto L85
            if (r9 != r1) goto L85
            r1 = 32
            if (r12 == r1) goto L7e
            r1 = 84
            if (r12 != r1) goto L85
        L7e:
            r1 = 58
            if (r15 != r1) goto L85
            if (r0 != r1) goto L85
            goto L9d
        L85:
            r1 = 47
            if (r6 != r1) goto Lb4
            if (r9 != r1) goto Lb4
            r1 = 32
            if (r12 == r1) goto L93
            r1 = 84
            if (r12 != r1) goto L96
        L93:
            r1 = 58
            goto L99
        L96:
            r1 = 47
            goto Lb4
        L99:
            if (r15 != r1) goto L96
            if (r0 != r1) goto L96
        L9d:
            r15 = r2
            r24 = r3
            r16 = r4
            r17 = r5
            r19 = r8
            r20 = r10
            r21 = r11
            r22 = r13
            r23 = r14
            r14 = r18
            r18 = r7
            goto L112
        Lb4:
            if (r4 != r1) goto Lc3
            if (r7 != r1) goto Lc3
            r1 = 32
            if (r12 == r1) goto Lc0
            r1 = 84
            if (r12 != r1) goto Lc3
        Lc0:
            r1 = 58
            goto Lc6
        Lc3:
            r1 = 32
            goto Ldf
        Lc6:
            if (r15 != r1) goto Lc3
            if (r0 != r1) goto Lc3
            r21 = r2
            r24 = r3
            r19 = r6
            r15 = r9
            r16 = r10
            r17 = r11
            r22 = r13
            r23 = r14
            r20 = r18
        Ldb:
            r18 = r5
            r14 = r8
            goto L112
        Ldf:
            if (r2 != r1) goto L117
            if (r7 != r1) goto L117
            if (r12 != r1) goto L117
            r1 = 58
            if (r15 != r1) goto L117
            if (r0 != r1) goto L117
            int r0 = month(r4, r5, r6)
            r1 = 48
            if (r0 <= 0) goto Lfe
            int r2 = r0 / 10
            int r2 = r2 + r1
            char r2 = (char) r2
            int r0 = r0 % 10
            int r0 = r0 + r1
            char r0 = (char) r0
            r6 = r0
            r5 = r2
            goto L100
        Lfe:
            r5 = r1
            r6 = r5
        L100:
            r20 = r1
            r24 = r3
            r19 = r6
            r15 = r9
            r16 = r10
            r17 = r11
            r22 = r13
            r23 = r14
            r21 = r18
            goto Ldb
        L112:
            java.time.LocalDateTime r0 = localDateTime(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L117:
            return r17
    }

    public static java.time.LocalDateTime parseLocalDateTime19(char[] r28, int r29) {
            r0 = r28
            int r1 = r29 + 19
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r1 = r0[r29]
            int r2 = r29 + 1
            char r2 = r0[r2]
            int r4 = r29 + 2
            char r4 = r0[r4]
            int r5 = r29 + 3
            char r5 = r0[r5]
            int r6 = r29 + 4
            char r6 = r0[r6]
            int r7 = r29 + 5
            char r7 = r0[r7]
            int r8 = r29 + 6
            char r8 = r0[r8]
            int r9 = r29 + 7
            char r9 = r0[r9]
            int r10 = r29 + 8
            char r10 = r0[r10]
            int r11 = r29 + 9
            char r11 = r0[r11]
            int r12 = r29 + 10
            char r12 = r0[r12]
            int r13 = r29 + 11
            char r22 = r0[r13]
            int r13 = r29 + 12
            char r23 = r0[r13]
            int r13 = r29 + 13
            char r13 = r0[r13]
            int r14 = r29 + 14
            char r24 = r0[r14]
            int r14 = r29 + 15
            char r25 = r0[r14]
            int r14 = r29 + 16
            char r14 = r0[r14]
            int r15 = r29 + 17
            char r26 = r0[r15]
            int r15 = r29 + 18
            char r27 = r0[r15]
            r0 = 45
            r16 = r3
            r3 = 32
            r15 = 58
            if (r6 != r0) goto L6a
            if (r9 != r0) goto L6a
            if (r12 == r3) goto L65
            r0 = 84
            if (r12 != r0) goto L6a
        L65:
            if (r13 != r15) goto L6a
            if (r14 != r15) goto L6a
            goto L7a
        L6a:
            r0 = 47
            if (r6 != r0) goto L89
            if (r9 != r0) goto L89
            if (r12 == r3) goto L76
            r3 = 84
            if (r12 != r3) goto L89
        L76:
            if (r13 != r15) goto L89
            if (r14 != r15) goto L89
        L7a:
            r14 = r1
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r10
            r21 = r11
            goto Ld0
        L89:
            if (r4 != r0) goto L96
            if (r7 != r0) goto L96
            r0 = 32
            if (r12 == r0) goto L99
            r0 = 84
            if (r12 != r0) goto L96
            goto L99
        L96:
            r0 = 32
            goto Lac
        L99:
            if (r13 != r15) goto L96
            if (r14 != r15) goto L96
            r20 = r1
            r21 = r2
        La1:
            r18 = r5
            r19 = r6
            r14 = r8
            r15 = r9
            r16 = r10
            r17 = r11
            goto Ld0
        Lac:
            if (r2 != r0) goto Ld5
            if (r7 != r0) goto Ld5
            if (r12 != r0) goto Ld5
            if (r13 != r15) goto Ld5
            if (r14 != r15) goto Ld5
            int r0 = month(r4, r5, r6)
            r2 = 48
            if (r0 <= 0) goto Lc9
            int r3 = r0 / 10
            int r3 = r3 + r2
            char r3 = (char) r3
            int r0 = r0 % 10
            int r0 = r0 + r2
            char r0 = (char) r0
            r6 = r0
            r5 = r3
            goto Lcb
        Lc9:
            r5 = r2
            r6 = r5
        Lcb:
            r21 = r1
            r20 = r2
            goto La1
        Ld0:
            java.time.LocalDateTime r0 = localDateTime(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        Ld5:
            return r16
    }

    public static java.time.LocalDateTime parseLocalDateTime20(byte[] r22, int r23) {
            r0 = r22
            int r1 = r23 + 19
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r2 = r0[r23]
            char r10 = (char) r2
            int r2 = r23 + 1
            r2 = r0[r2]
            char r11 = (char) r2
            int r2 = r23 + 2
            r2 = r0[r2]
            char r2 = (char) r2
            int r4 = r23 + 3
            r4 = r0[r4]
            char r4 = (char) r4
            int r5 = r23 + 4
            r5 = r0[r5]
            char r5 = (char) r5
            int r6 = r23 + 5
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r23 + 6
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r23 + 7
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r23 + 8
            r9 = r0[r9]
            char r9 = (char) r9
            int r12 = r23 + 9
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r23 + 10
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r23 + 11
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r23 + 12
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r23 + 13
            r17 = r3
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r23 + 14
            r0 = r22[r16]
            char r0 = (char) r0
            int r16 = r23 + 15
            r18 = r1
            r1 = r22[r16]
            char r1 = (char) r1
            int r16 = r23 + 16
            r19 = r1
            r1 = r22[r16]
            char r1 = (char) r1
            int r16 = r23 + 17
            r20 = r1
            r1 = r22[r16]
            char r1 = (char) r1
            int r16 = r23 + 18
            r21 = r3
            r3 = r22[r16]
            char r3 = (char) r3
            r16 = r3
            r3 = r22[r18]
            char r3 = (char) r3
            r18 = r3
            r3 = 32
            if (r2 != r3) goto Lb0
            if (r7 != r3) goto Lb0
            if (r14 != r3) goto Lb0
            r2 = 58
            if (r0 != r2) goto Lb0
            if (r1 == r2) goto L86
            goto Lb0
        L86:
            int r0 = month(r4, r5, r6)
            r1 = 48
            if (r0 <= 0) goto La6
            int r2 = r0 / 10
            int r2 = r2 + r1
            char r2 = (char) r2
            int r0 = r0 % 10
            int r0 = r0 + r1
            char r1 = (char) r0
            r4 = r8
            r5 = r9
            r9 = r1
            r8 = r2
        L9a:
            r6 = r12
            r7 = r13
            r12 = r15
            r17 = r18
            r14 = r19
            r15 = r20
            r13 = r21
            goto Lab
        La6:
            r4 = r8
            r5 = r9
            r8 = r1
            r9 = r8
            goto L9a
        Lab:
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        Lb0:
            return r17
    }

    public static java.time.LocalDateTime parseLocalDateTime20(char[] r21, int r22) {
            r0 = r21
            int r1 = r22 + 19
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r10 = r0[r22]
            int r2 = r22 + 1
            char r11 = r0[r2]
            int r2 = r22 + 2
            char r2 = r0[r2]
            int r4 = r22 + 3
            char r4 = r0[r4]
            int r5 = r22 + 4
            char r5 = r0[r5]
            int r6 = r22 + 5
            char r6 = r0[r6]
            int r7 = r22 + 6
            char r7 = r0[r7]
            int r8 = r22 + 7
            char r8 = r0[r8]
            int r9 = r22 + 8
            char r9 = r0[r9]
            int r12 = r22 + 9
            char r12 = r0[r12]
            int r13 = r22 + 10
            char r13 = r0[r13]
            int r14 = r22 + 11
            char r14 = r0[r14]
            int r15 = r22 + 12
            char r15 = r0[r15]
            int r16 = r22 + 13
            char r16 = r0[r16]
            int r17 = r22 + 14
            r18 = r3
            char r3 = r0[r17]
            int r17 = r22 + 15
            char r17 = r0[r17]
            int r19 = r22 + 16
            char r19 = r0[r19]
            int r20 = r22 + 17
            char r0 = r21[r20]
            int r20 = r22 + 18
            char r20 = r21[r20]
            char r1 = r21[r1]
            r21 = r1
            r1 = 32
            if (r2 != r1) goto L94
            if (r7 != r1) goto L94
            if (r14 != r1) goto L94
            r1 = 58
            if (r3 != r1) goto L94
            if (r0 == r1) goto L68
            goto L94
        L68:
            int r0 = month(r4, r5, r6)
            r1 = 48
            if (r0 <= 0) goto L8a
            int r2 = r0 / 10
            int r2 = r2 + r1
            char r2 = (char) r2
            int r0 = r0 % 10
            int r0 = r0 + r1
            char r1 = (char) r0
            r4 = r8
            r5 = r9
            r9 = r1
            r8 = r2
        L7c:
            r6 = r12
            r7 = r13
            r12 = r15
            r13 = r16
            r14 = r17
            r15 = r19
            r16 = r20
            r17 = r21
            goto L8f
        L8a:
            r4 = r8
            r5 = r9
            r8 = r1
            r9 = r8
            goto L7c
        L8f:
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L94:
            return r18
    }

    public static java.time.LocalDateTime parseLocalDateTime26(byte[] r28, int r29) {
            r0 = r28
            int r1 = r29 + 26
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r29]
            char r4 = (char) r1
            int r1 = r29 + 1
            r1 = r0[r1]
            char r5 = (char) r1
            int r1 = r29 + 2
            r1 = r0[r1]
            char r6 = (char) r1
            int r1 = r29 + 3
            r1 = r0[r1]
            char r7 = (char) r1
            int r1 = r29 + 4
            r1 = r0[r1]
            char r1 = (char) r1
            int r2 = r29 + 5
            r2 = r0[r2]
            char r8 = (char) r2
            int r2 = r29 + 6
            r2 = r0[r2]
            char r9 = (char) r2
            int r2 = r29 + 7
            r2 = r0[r2]
            char r2 = (char) r2
            int r10 = r29 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r29 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r29 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r29 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r29 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r29 + 13
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r29 + 14
            r17 = r3
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r29 + 15
            r0 = r28[r16]
            char r0 = (char) r0
            int r16 = r29 + 16
            r18 = r0
            r0 = r28[r16]
            char r0 = (char) r0
            int r16 = r29 + 17
            r19 = r3
            r3 = r28[r16]
            char r3 = (char) r3
            int r16 = r29 + 18
            r20 = r3
            r3 = r28[r16]
            char r3 = (char) r3
            int r16 = r29 + 19
            r21 = r3
            r3 = r28[r16]
            char r3 = (char) r3
            int r16 = r29 + 20
            r22 = r4
            r4 = r28[r16]
            char r4 = (char) r4
            int r16 = r29 + 21
            r23 = r4
            r4 = r28[r16]
            char r4 = (char) r4
            int r16 = r29 + 22
            r24 = r4
            r4 = r28[r16]
            char r4 = (char) r4
            int r16 = r29 + 23
            r25 = r4
            r4 = r28[r16]
            char r4 = (char) r4
            int r16 = r29 + 24
            r26 = r4
            r4 = r28[r16]
            char r4 = (char) r4
            int r16 = r29 + 25
            r27 = r4
            r4 = r28[r16]
            char r4 = (char) r4
            r16 = r4
            r4 = 45
            if (r1 != r4) goto Ldd
            if (r2 != r4) goto Ldd
            r1 = 32
            if (r12 == r1) goto Laf
            r1 = 84
            if (r12 != r1) goto Ldd
        Laf:
            r1 = 58
            if (r15 != r1) goto Ldd
            if (r0 != r1) goto Ldd
            r0 = 46
            if (r3 == r0) goto Lba
            goto Ldd
        Lba:
            r15 = r18
            r18 = r23
            r23 = r16
            r16 = r20
            r20 = r25
            r25 = 48
            r17 = r21
            r21 = r26
            r26 = 48
            r12 = r13
            r13 = r14
            r14 = r19
            r19 = r24
            r24 = 48
            r4 = r22
            r22 = r27
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        Ldd:
            return r17
    }

    public static java.time.LocalDateTime parseLocalDateTime26(char[] r28, int r29) {
            r0 = r28
            int r1 = r29 + 26
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r4 = r0[r29]
            int r1 = r29 + 1
            char r5 = r0[r1]
            int r1 = r29 + 2
            char r6 = r0[r1]
            int r1 = r29 + 3
            char r7 = r0[r1]
            int r1 = r29 + 4
            char r1 = r0[r1]
            int r2 = r29 + 5
            char r8 = r0[r2]
            int r2 = r29 + 6
            char r9 = r0[r2]
            int r2 = r29 + 7
            char r2 = r0[r2]
            int r10 = r29 + 8
            char r10 = r0[r10]
            int r11 = r29 + 9
            char r11 = r0[r11]
            int r12 = r29 + 10
            char r12 = r0[r12]
            int r13 = r29 + 11
            char r13 = r0[r13]
            int r14 = r29 + 12
            char r14 = r0[r14]
            int r15 = r29 + 13
            char r15 = r0[r15]
            int r16 = r29 + 14
            char r16 = r0[r16]
            int r17 = r29 + 15
            char r17 = r0[r17]
            int r18 = r29 + 16
            r19 = r3
            char r3 = r0[r18]
            int r18 = r29 + 17
            char r18 = r0[r18]
            int r20 = r29 + 18
            char r20 = r0[r20]
            int r21 = r29 + 19
            char r0 = r28[r21]
            int r21 = r29 + 20
            char r21 = r28[r21]
            int r22 = r29 + 21
            char r22 = r28[r22]
            int r23 = r29 + 22
            char r23 = r28[r23]
            int r24 = r29 + 23
            char r24 = r28[r24]
            int r25 = r29 + 24
            char r25 = r28[r25]
            int r26 = r29 + 25
            char r26 = r28[r26]
            r27 = r4
            r4 = 45
            if (r1 != r4) goto L82
            if (r2 != r4) goto L82
            r1 = 32
            if (r12 == r1) goto L85
            r1 = 84
            if (r12 != r1) goto L82
            goto L85
        L82:
            r0 = r19
            goto Lb2
        L85:
            r1 = 58
            if (r15 != r1) goto L82
            if (r3 != r1) goto L82
            r1 = 46
            if (r0 == r1) goto L90
            goto L82
        L90:
            r19 = r22
            r22 = r25
            r25 = 48
            r15 = r17
            r17 = r20
            r20 = r23
            r23 = r26
            r26 = 48
            r12 = r13
            r13 = r14
            r14 = r16
            r16 = r18
            r18 = r21
            r21 = r24
            r24 = 48
            r4 = r27
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        Lb2:
            return r0
    }

    public static java.time.LocalDateTime parseLocalDateTime27(byte[] r29, int r30) {
            r0 = r29
            int r1 = r30 + 27
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r30]
            char r4 = (char) r1
            int r1 = r30 + 1
            r1 = r0[r1]
            char r5 = (char) r1
            int r1 = r30 + 2
            r1 = r0[r1]
            char r6 = (char) r1
            int r1 = r30 + 3
            r1 = r0[r1]
            char r7 = (char) r1
            int r1 = r30 + 4
            r1 = r0[r1]
            char r1 = (char) r1
            int r2 = r30 + 5
            r2 = r0[r2]
            char r8 = (char) r2
            int r2 = r30 + 6
            r2 = r0[r2]
            char r9 = (char) r2
            int r2 = r30 + 7
            r2 = r0[r2]
            char r2 = (char) r2
            int r10 = r30 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r30 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r30 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r30 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r30 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r30 + 13
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r30 + 14
            r17 = r3
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r30 + 15
            r0 = r29[r16]
            char r0 = (char) r0
            int r16 = r30 + 16
            r18 = r0
            r0 = r29[r16]
            char r0 = (char) r0
            int r16 = r30 + 17
            r19 = r3
            r3 = r29[r16]
            char r3 = (char) r3
            int r16 = r30 + 18
            r20 = r3
            r3 = r29[r16]
            char r3 = (char) r3
            int r16 = r30 + 19
            r21 = r3
            r3 = r29[r16]
            char r3 = (char) r3
            int r16 = r30 + 20
            r22 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            int r16 = r30 + 21
            r23 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            int r16 = r30 + 22
            r24 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            int r16 = r30 + 23
            r25 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            int r16 = r30 + 24
            r26 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            int r16 = r30 + 25
            r27 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            int r16 = r30 + 26
            r28 = r4
            r4 = r29[r16]
            char r4 = (char) r4
            r16 = r4
            r4 = 45
            if (r1 != r4) goto Le4
            if (r2 != r4) goto Le4
            r1 = 32
            if (r12 == r1) goto Lb6
            r1 = 84
            if (r12 != r1) goto Le4
        Lb6:
            r1 = 58
            if (r15 != r1) goto Le4
            if (r0 != r1) goto Le4
            r0 = 46
            if (r3 == r0) goto Lc1
            goto Le4
        Lc1:
            r12 = r13
            r13 = r14
            r14 = r19
            r19 = r24
            r24 = r16
            r16 = r20
            r20 = r25
            r25 = 48
            r17 = r21
            r21 = r26
            r26 = 48
            r15 = r18
            r4 = r22
            r18 = r23
            r22 = r27
            r23 = r28
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        Le4:
            return r17
    }

    public static java.time.LocalDateTime parseLocalDateTime27(char[] r29, int r30) {
            r0 = r29
            int r1 = r30 + 27
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r4 = r0[r30]
            int r1 = r30 + 1
            char r5 = r0[r1]
            int r1 = r30 + 2
            char r6 = r0[r1]
            int r1 = r30 + 3
            char r7 = r0[r1]
            int r1 = r30 + 4
            char r1 = r0[r1]
            int r2 = r30 + 5
            char r8 = r0[r2]
            int r2 = r30 + 6
            char r9 = r0[r2]
            int r2 = r30 + 7
            char r2 = r0[r2]
            int r10 = r30 + 8
            char r10 = r0[r10]
            int r11 = r30 + 9
            char r11 = r0[r11]
            int r12 = r30 + 10
            char r12 = r0[r12]
            int r13 = r30 + 11
            char r13 = r0[r13]
            int r14 = r30 + 12
            char r14 = r0[r14]
            int r15 = r30 + 13
            char r15 = r0[r15]
            int r16 = r30 + 14
            char r16 = r0[r16]
            int r17 = r30 + 15
            char r17 = r0[r17]
            int r18 = r30 + 16
            r19 = r3
            char r3 = r0[r18]
            int r18 = r30 + 17
            char r18 = r0[r18]
            int r20 = r30 + 18
            char r20 = r0[r20]
            int r21 = r30 + 19
            char r0 = r29[r21]
            int r21 = r30 + 20
            char r21 = r29[r21]
            int r22 = r30 + 21
            char r22 = r29[r22]
            int r23 = r30 + 22
            char r23 = r29[r23]
            int r24 = r30 + 23
            char r24 = r29[r24]
            int r25 = r30 + 24
            char r25 = r29[r25]
            int r26 = r30 + 25
            char r26 = r29[r26]
            int r27 = r30 + 26
            char r27 = r29[r27]
            r28 = r4
            r4 = 45
            if (r1 != r4) goto L86
            if (r2 != r4) goto L86
            r1 = 32
            if (r12 == r1) goto L89
            r1 = 84
            if (r12 != r1) goto L86
            goto L89
        L86:
            r0 = r19
            goto Lb6
        L89:
            r1 = 58
            if (r15 != r1) goto L86
            if (r3 != r1) goto L86
            r1 = 46
            if (r0 == r1) goto L94
            goto L86
        L94:
            r19 = r22
            r22 = r25
            r25 = 48
            r15 = r17
            r17 = r20
            r20 = r23
            r23 = r26
            r26 = 48
            r12 = r13
            r13 = r14
            r14 = r16
            r16 = r18
            r18 = r21
            r21 = r24
            r24 = r27
            r4 = r28
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        Lb6:
            return r0
    }

    public static java.time.LocalDateTime parseLocalDateTime28(byte[] r30, int r31) {
            r0 = r30
            int r1 = r31 + 28
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r31]
            char r4 = (char) r1
            int r1 = r31 + 1
            r1 = r0[r1]
            char r5 = (char) r1
            int r1 = r31 + 2
            r1 = r0[r1]
            char r6 = (char) r1
            int r1 = r31 + 3
            r1 = r0[r1]
            char r7 = (char) r1
            int r1 = r31 + 4
            r1 = r0[r1]
            char r1 = (char) r1
            int r2 = r31 + 5
            r2 = r0[r2]
            char r8 = (char) r2
            int r2 = r31 + 6
            r2 = r0[r2]
            char r9 = (char) r2
            int r2 = r31 + 7
            r2 = r0[r2]
            char r2 = (char) r2
            int r10 = r31 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r31 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r31 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r31 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r31 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r31 + 13
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r31 + 14
            r17 = r3
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r31 + 15
            r0 = r30[r16]
            char r0 = (char) r0
            int r16 = r31 + 16
            r18 = r0
            r0 = r30[r16]
            char r0 = (char) r0
            int r16 = r31 + 17
            r19 = r3
            r3 = r30[r16]
            char r3 = (char) r3
            int r16 = r31 + 18
            r20 = r3
            r3 = r30[r16]
            char r3 = (char) r3
            int r16 = r31 + 19
            r21 = r3
            r3 = r30[r16]
            char r3 = (char) r3
            int r16 = r31 + 20
            r22 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 21
            r23 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 22
            r24 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 23
            r25 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 24
            r26 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 25
            r27 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 26
            r28 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            int r16 = r31 + 27
            r29 = r4
            r4 = r30[r16]
            char r4 = (char) r4
            r16 = r4
            r4 = 45
            if (r1 != r4) goto Lbe
            if (r2 != r4) goto Lbe
            r1 = 32
            if (r12 == r1) goto Lc1
            r1 = 84
            if (r12 != r1) goto Lbe
            goto Lc1
        Lbe:
            r0 = r17
            goto Lf0
        Lc1:
            r1 = 58
            if (r15 != r1) goto Lbe
            if (r0 != r1) goto Lbe
            r0 = 46
            if (r3 == r0) goto Lcc
            goto Lbe
        Lcc:
            r17 = r21
            r21 = r26
            r26 = 48
            r4 = r25
            r25 = r16
            r16 = r20
            r20 = r4
            r12 = r13
            r13 = r14
            r15 = r18
            r14 = r19
            r4 = r22
            r18 = r23
            r19 = r24
            r22 = r27
            r23 = r28
            r24 = r29
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        Lf0:
            return r0
    }

    public static java.time.LocalDateTime parseLocalDateTime28(char[] r30, int r31) {
            r0 = r30
            int r1 = r31 + 28
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r4 = r0[r31]
            int r1 = r31 + 1
            char r5 = r0[r1]
            int r1 = r31 + 2
            char r6 = r0[r1]
            int r1 = r31 + 3
            char r7 = r0[r1]
            int r1 = r31 + 4
            char r1 = r0[r1]
            int r2 = r31 + 5
            char r8 = r0[r2]
            int r2 = r31 + 6
            char r9 = r0[r2]
            int r2 = r31 + 7
            char r2 = r0[r2]
            int r10 = r31 + 8
            char r10 = r0[r10]
            int r11 = r31 + 9
            char r11 = r0[r11]
            int r12 = r31 + 10
            char r12 = r0[r12]
            int r13 = r31 + 11
            char r13 = r0[r13]
            int r14 = r31 + 12
            char r14 = r0[r14]
            int r15 = r31 + 13
            char r15 = r0[r15]
            int r16 = r31 + 14
            char r16 = r0[r16]
            int r17 = r31 + 15
            char r17 = r0[r17]
            int r18 = r31 + 16
            r19 = r3
            char r3 = r0[r18]
            int r18 = r31 + 17
            char r18 = r0[r18]
            int r20 = r31 + 18
            char r20 = r0[r20]
            int r21 = r31 + 19
            char r0 = r30[r21]
            int r21 = r31 + 20
            char r21 = r30[r21]
            int r22 = r31 + 21
            char r22 = r30[r22]
            int r23 = r31 + 22
            char r23 = r30[r23]
            int r24 = r31 + 23
            char r24 = r30[r24]
            int r25 = r31 + 24
            char r25 = r30[r25]
            int r26 = r31 + 25
            char r26 = r30[r26]
            int r27 = r31 + 26
            char r27 = r30[r27]
            int r28 = r31 + 27
            char r28 = r30[r28]
            r29 = r4
            r4 = 45
            if (r1 != r4) goto Lb7
            if (r2 != r4) goto Lb7
            r1 = 32
            if (r12 == r1) goto L89
            r1 = 84
            if (r12 != r1) goto Lb7
        L89:
            r1 = 58
            if (r15 != r1) goto Lb7
            if (r3 != r1) goto Lb7
            r1 = 46
            if (r0 == r1) goto L94
            goto Lb7
        L94:
            r15 = r17
            r17 = r20
            r20 = r23
            r23 = r26
            r26 = 48
            r12 = r13
            r13 = r14
            r14 = r16
            r16 = r18
            r18 = r21
            r19 = r22
            r21 = r24
            r22 = r25
            r24 = r27
            r25 = r28
            r4 = r29
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        Lb7:
            return r19
    }

    public static java.time.LocalDateTime parseLocalDateTime29(byte[] r31, int r32) {
            r0 = r31
            int r1 = r32 + 29
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r32]
            char r4 = (char) r1
            int r1 = r32 + 1
            r1 = r0[r1]
            char r5 = (char) r1
            int r1 = r32 + 2
            r1 = r0[r1]
            char r6 = (char) r1
            int r1 = r32 + 3
            r1 = r0[r1]
            char r7 = (char) r1
            int r1 = r32 + 4
            r1 = r0[r1]
            char r1 = (char) r1
            int r2 = r32 + 5
            r2 = r0[r2]
            char r8 = (char) r2
            int r2 = r32 + 6
            r2 = r0[r2]
            char r9 = (char) r2
            int r2 = r32 + 7
            r2 = r0[r2]
            char r2 = (char) r2
            int r10 = r32 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r32 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r32 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r32 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r32 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r32 + 13
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r32 + 14
            r27 = r3
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r32 + 15
            r0 = r31[r16]
            char r0 = (char) r0
            int r16 = r32 + 16
            r17 = r0
            r0 = r31[r16]
            char r0 = (char) r0
            int r16 = r32 + 17
            r18 = r3
            r3 = r31[r16]
            char r3 = (char) r3
            int r16 = r32 + 18
            r19 = r3
            r3 = r31[r16]
            char r3 = (char) r3
            int r16 = r32 + 19
            r20 = r3
            r3 = r31[r16]
            char r3 = (char) r3
            int r16 = r32 + 20
            r21 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 21
            r22 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 22
            r23 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 23
            r24 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 24
            r25 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 25
            r26 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 26
            r28 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 27
            r29 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            int r16 = r32 + 28
            r30 = r4
            r4 = r31[r16]
            char r4 = (char) r4
            r16 = r4
            r4 = 45
            if (r1 != r4) goto Lf2
            if (r2 != r4) goto Lf2
            r1 = 32
            if (r12 == r1) goto Lc4
            r1 = 84
            if (r12 != r1) goto Lf2
        Lc4:
            r1 = 58
            if (r15 != r1) goto Lf2
            if (r0 != r1) goto Lf2
            r0 = 46
            if (r3 == r0) goto Lcf
            goto Lf2
        Lcf:
            r12 = r13
            r13 = r14
            r15 = r17
            r14 = r18
            r17 = r20
            r4 = r21
            r18 = r22
            r20 = r24
            r21 = r25
            r22 = r26
            r24 = r29
            r25 = r30
            r26 = r16
            r16 = r19
            r19 = r23
            r23 = r28
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        Lf2:
            return r27
    }

    public static java.time.LocalDateTime parseLocalDateTime29(char[] r31, int r32) {
            r0 = r31
            int r1 = r32 + 29
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r4 = r0[r32]
            int r1 = r32 + 1
            char r5 = r0[r1]
            int r1 = r32 + 2
            char r6 = r0[r1]
            int r1 = r32 + 3
            char r7 = r0[r1]
            int r1 = r32 + 4
            char r1 = r0[r1]
            int r2 = r32 + 5
            char r8 = r0[r2]
            int r2 = r32 + 6
            char r9 = r0[r2]
            int r2 = r32 + 7
            char r2 = r0[r2]
            int r10 = r32 + 8
            char r10 = r0[r10]
            int r11 = r32 + 9
            char r11 = r0[r11]
            int r12 = r32 + 10
            char r12 = r0[r12]
            int r13 = r32 + 11
            char r13 = r0[r13]
            int r14 = r32 + 12
            char r14 = r0[r14]
            int r15 = r32 + 13
            char r15 = r0[r15]
            int r16 = r32 + 14
            char r16 = r0[r16]
            int r17 = r32 + 15
            char r17 = r0[r17]
            int r18 = r32 + 16
            r27 = r3
            char r3 = r0[r18]
            int r18 = r32 + 17
            char r18 = r0[r18]
            int r19 = r32 + 18
            char r19 = r0[r19]
            int r20 = r32 + 19
            char r0 = r31[r20]
            int r20 = r32 + 20
            char r20 = r31[r20]
            int r21 = r32 + 21
            char r21 = r31[r21]
            int r22 = r32 + 22
            char r22 = r31[r22]
            int r23 = r32 + 23
            char r23 = r31[r23]
            int r24 = r32 + 24
            char r24 = r31[r24]
            int r25 = r32 + 25
            char r25 = r31[r25]
            int r26 = r32 + 26
            char r26 = r31[r26]
            int r28 = r32 + 27
            char r28 = r31[r28]
            int r29 = r32 + 28
            char r29 = r31[r29]
            r30 = r4
            r4 = 45
            if (r1 != r4) goto Lbb
            if (r2 != r4) goto Lbb
            r1 = 32
            if (r12 == r1) goto L8d
            r1 = 84
            if (r12 != r1) goto Lbb
        L8d:
            r1 = 58
            if (r15 != r1) goto Lbb
            if (r3 != r1) goto Lbb
            r1 = 46
            if (r0 == r1) goto L98
            goto Lbb
        L98:
            r12 = r13
            r13 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r28
            r26 = r29
            r4 = r30
            java.time.LocalDateTime r0 = localDateTime(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        Lbb:
            return r27
    }

    public static java.time.LocalDateTime parseLocalDateTimeX(byte[] r33, int r34, int r35) {
            r1 = r34
            r2 = r35
            if (r33 == 0) goto L8
            if (r2 != 0) goto Lc
        L8:
            r28 = 0
            goto L374
        Lc:
            r4 = 21
            if (r2 < r4) goto L14
            r4 = 29
            if (r2 <= r4) goto L18
        L14:
            r28 = 0
            goto L374
        L18:
            r4 = r33[r1]
            char r5 = (char) r4
            int r4 = r1 + 1
            r4 = r33[r4]
            char r6 = (char) r4
            int r4 = r1 + 2
            r4 = r33[r4]
            char r7 = (char) r4
            int r4 = r1 + 3
            r4 = r33[r4]
            char r8 = (char) r4
            int r4 = r1 + 4
            r4 = r33[r4]
            char r4 = (char) r4
            int r9 = r1 + 5
            r9 = r33[r9]
            char r9 = (char) r9
            int r10 = r1 + 6
            r10 = r33[r10]
            char r10 = (char) r10
            int r11 = r1 + 7
            r11 = r33[r11]
            char r11 = (char) r11
            int r12 = r1 + 8
            r12 = r33[r12]
            char r12 = (char) r12
            int r13 = r1 + 9
            r13 = r33[r13]
            char r13 = (char) r13
            int r14 = r1 + 10
            r14 = r33[r14]
            char r14 = (char) r14
            int r15 = r1 + 11
            r15 = r33[r15]
            char r15 = (char) r15
            int r16 = r1 + 12
            r28 = 0
            r3 = r33[r16]
            char r3 = (char) r3
            int r16 = r1 + 13
            r2 = r33[r16]
            char r2 = (char) r2
            int r16 = r1 + 14
            r17 = r3
            r3 = r33[r16]
            char r3 = (char) r3
            int r16 = r1 + 15
            r18 = r3
            r3 = r33[r16]
            char r3 = (char) r3
            int r16 = r1 + 16
            r19 = r3
            r3 = r33[r16]
            char r3 = (char) r3
            int r16 = r1 + 17
            r20 = r5
            r5 = r33[r16]
            char r5 = (char) r5
            int r16 = r1 + 18
            r21 = r5
            r5 = r33[r16]
            char r5 = (char) r5
            int r16 = r1 + 19
            r22 = r5
            r5 = r33[r16]
            char r5 = (char) r5
            r16 = 48
            switch(r35) {
                case 21: goto L2d1;
                case 22: goto L2a2;
                case 23: goto L26e;
                case 24: goto L230;
                case 25: goto L1eb;
                case 26: goto L19f;
                case 27: goto L14a;
                case 28: goto Lf0;
                default: goto L8d;
            }
        L8d:
            int r16 = r1 + 20
            r23 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 21
            r24 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 22
            r25 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 23
            r26 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 24
            r27 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 25
            r29 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 26
            r30 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 27
            r31 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            int r16 = r1 + 28
            r32 = r6
            r6 = r33[r16]
            char r6 = (char) r6
            r16 = r29
            r29 = r23
            r23 = r16
            r16 = r25
            r25 = r31
            r31 = r12
            r12 = r13
            r13 = r15
            r15 = r18
            r18 = r22
            r22 = r27
            r27 = r6
            r6 = r24
            r24 = r30
            r30 = r17
            r17 = r21
            r21 = r26
            r26 = r32
            goto L2f4
        Lf0:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 22
            r26 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 23
            r27 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 24
            r29 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 25
            r30 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 26
            r31 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 27
            r32 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r24 = r31
            r31 = r12
            r12 = r13
            r13 = r15
            r15 = r18
            r18 = r22
            r22 = r29
            r29 = r23
            r23 = r30
            r30 = r17
            r17 = r21
            r21 = r27
            r27 = r16
            r16 = r26
            r26 = r6
            r6 = r25
            r25 = r32
            goto L2f4
        L14a:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 22
            r26 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 23
            r27 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 24
            r29 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 25
            r30 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 26
            r31 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r24 = r25
            r25 = r6
            r6 = r24
            r24 = r31
            r31 = r12
            r12 = r13
            r13 = r15
            r15 = r18
            r18 = r22
            r22 = r29
            r29 = r23
            r23 = r30
            r30 = r17
            r17 = r21
            r21 = r27
            r27 = r16
            r16 = r26
            r26 = r27
            goto L2f4
        L19f:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 22
            r26 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 23
            r27 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 24
            r29 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 25
            r30 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r24 = r6
            r31 = r12
            r12 = r13
            r13 = r15
            r15 = r18
            r18 = r22
            r6 = r25
            r22 = r29
            r25 = r16
            r29 = r23
            r23 = r30
            r30 = r17
            r17 = r21
            r16 = r26
            r21 = r27
            r26 = r25
            r27 = r26
            goto L2f4
        L1eb:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 22
            r26 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 23
            r27 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 24
            r29 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r31 = r12
            r12 = r13
            r13 = r15
            r24 = r16
            r30 = r17
            r15 = r18
            r17 = r21
            r18 = r22
            r21 = r27
            r22 = r29
            r27 = r24
            r29 = r23
            r16 = r26
            r23 = r6
            r26 = r27
            r6 = r25
            r25 = r26
            goto L2f4
        L230:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 22
            r26 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 23
            r27 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r31 = r12
            r12 = r13
            r13 = r15
            r24 = r16
            r30 = r17
            r15 = r18
            r17 = r21
            r18 = r22
            r29 = r23
            r21 = r27
            r22 = r6
            r23 = r24
            r27 = r23
            r6 = r25
            r16 = r26
            r25 = r27
        L26a:
            r26 = r25
            goto L2f4
        L26e:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            int r24 = r1 + 22
            r26 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r31 = r12
            r12 = r13
            r13 = r15
            r24 = r16
            r27 = r24
            r30 = r17
            r15 = r18
            r17 = r21
            r18 = r22
            r29 = r23
            r21 = r6
            r22 = r27
            r23 = r22
            r6 = r25
            r16 = r26
            r25 = r23
            goto L26a
        L2a2:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            int r24 = r1 + 21
            r25 = r6
            r6 = r33[r24]
            char r6 = (char) r6
            r31 = r12
            r12 = r13
            r13 = r15
            r24 = r16
            r26 = r24
            r27 = r26
            r30 = r17
            r15 = r18
            r17 = r21
            r18 = r22
            r29 = r23
            r16 = r6
            r21 = r27
            r22 = r21
            r23 = r22
            r6 = r25
            r25 = r23
            goto L2f4
        L2d1:
            r23 = r6
            int r6 = r1 + 20
            r6 = r33[r6]
            char r6 = (char) r6
            r31 = r12
            r12 = r13
            r13 = r15
            r24 = r16
            r25 = r24
            r26 = r25
            r27 = r26
            r30 = r17
            r15 = r18
            r17 = r21
            r18 = r22
            r29 = r23
            r21 = r27
            r22 = r21
            r23 = r22
        L2f4:
            r0 = 45
            if (r4 != r0) goto L31f
            if (r11 != r0) goto L31f
            r4 = 32
            if (r14 == r4) goto L302
            r4 = 84
            if (r14 != r4) goto L31f
        L302:
            r4 = 58
            if (r2 != r4) goto L31f
            if (r3 != r4) goto L31f
            r2 = 46
            if (r5 != r2) goto L31f
            r5 = r20
            r14 = r30
            r11 = r31
            r20 = r16
            r16 = r19
            r19 = r6
            r6 = r29
            java.time.LocalDateTime r0 = localDateTime(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L31f:
            int r2 = r1 + r35
            int r3 = r2 + (-15)
            r3 = r33[r3]
            if (r3 != r0) goto L374
            int r3 = r2 + (-12)
            r3 = r33[r3]
            if (r3 != r0) goto L374
            int r0 = r2 + (-9)
            r0 = r33[r0]
            r3 = 32
            if (r0 == r3) goto L339
            r3 = 84
            if (r0 != r3) goto L374
        L339:
            int r0 = r2 + (-6)
            r0 = r33[r0]
            r4 = 58
            if (r0 != r4) goto L374
            int r0 = r2 + (-3)
            r0 = r33[r0]
            if (r0 != r4) goto L374
            int r0 = r35 + (-15)
            r3 = r33
            int r0 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r1, r0)
            int r1 = r2 + (-14)
            r4 = 2
            int r1 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r1, r4)
            int r5 = r2 + (-11)
            int r5 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r5, r4)
            int r6 = r2 + (-8)
            int r6 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r6, r4)
            int r7 = r2 + (-5)
            int r7 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r7, r4)
            int r2 = r2 - r4
            int r8 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r2, r4)
            r3 = r0
            r4 = r1
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r3, r4, r5, r6, r7, r8)
            return r0
        L374:
            return r28
    }

    public static java.time.LocalDateTime parseLocalDateTimeX(char[] r33, int r34, int r35) {
            r1 = r34
            r2 = r35
            if (r33 == 0) goto L8
            if (r2 != 0) goto Lc
        L8:
            r28 = 0
            goto L277
        Lc:
            r4 = 21
            if (r2 < r4) goto L14
            r4 = 29
            if (r2 <= r4) goto L18
        L14:
            r28 = 0
            goto L277
        L18:
            char r5 = r33[r1]
            int r4 = r1 + 1
            char r6 = r33[r4]
            int r4 = r1 + 2
            char r7 = r33[r4]
            int r4 = r1 + 3
            char r8 = r33[r4]
            int r4 = r1 + 4
            char r4 = r33[r4]
            int r9 = r1 + 5
            char r9 = r33[r9]
            int r10 = r1 + 6
            char r10 = r33[r10]
            int r11 = r1 + 7
            char r11 = r33[r11]
            int r12 = r1 + 8
            char r12 = r33[r12]
            int r13 = r1 + 9
            char r13 = r33[r13]
            int r14 = r1 + 10
            char r14 = r33[r14]
            int r15 = r1 + 11
            char r15 = r33[r15]
            int r16 = r1 + 12
            char r16 = r33[r16]
            int r17 = r1 + 13
            r28 = 0
            char r3 = r33[r17]
            int r17 = r1 + 14
            char r17 = r33[r17]
            int r18 = r1 + 15
            char r18 = r33[r18]
            int r19 = r1 + 16
            char r2 = r33[r19]
            int r19 = r1 + 17
            char r19 = r33[r19]
            int r20 = r1 + 18
            char r20 = r33[r20]
            int r21 = r1 + 19
            r22 = r5
            char r5 = r33[r21]
            r21 = 48
            switch(r35) {
                case 21: goto L1d6;
                case 22: goto L1c3;
                case 23: goto L19e;
                case 24: goto L175;
                case 25: goto L14e;
                case 26: goto L11f;
                case 27: goto Leb;
                case 28: goto Laf;
                default: goto L6f;
            }
        L6f:
            int r21 = r1 + 20
            char r21 = r33[r21]
            int r23 = r1 + 21
            char r23 = r33[r23]
            int r24 = r1 + 22
            char r24 = r33[r24]
            int r25 = r1 + 23
            char r25 = r33[r25]
            int r26 = r1 + 24
            char r26 = r33[r26]
            int r27 = r1 + 25
            char r27 = r33[r27]
            int r29 = r1 + 26
            char r29 = r33[r29]
            int r30 = r1 + 27
            char r30 = r33[r30]
            int r31 = r1 + 28
            char r31 = r33[r31]
            r32 = r31
            r31 = r16
            r16 = r18
            r18 = r20
            r20 = r23
            r23 = r26
            r26 = r30
            r30 = r29
            r29 = r22
            r22 = r25
            r25 = r24
            r24 = r27
            r27 = r32
            goto L1f4
        Laf:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            int r25 = r1 + 22
            char r25 = r33[r25]
            int r26 = r1 + 23
            char r26 = r33[r26]
            int r27 = r1 + 24
            char r27 = r33[r27]
            int r29 = r1 + 25
            char r29 = r33[r29]
            int r30 = r1 + 26
            char r30 = r33[r30]
            int r31 = r1 + 27
            char r31 = r33[r31]
            r32 = r31
            r31 = r16
            r16 = r18
            r18 = r20
            r20 = r24
            r24 = r29
            r29 = r22
            r22 = r26
            r26 = r32
            r32 = r27
            r27 = r21
            r21 = r23
            r23 = r32
            goto L1f4
        Leb:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            int r25 = r1 + 22
            char r25 = r33[r25]
            int r26 = r1 + 23
            char r26 = r33[r26]
            int r27 = r1 + 24
            char r27 = r33[r27]
            int r29 = r1 + 25
            char r29 = r33[r29]
            int r30 = r1 + 26
            char r30 = r33[r30]
            r31 = r16
            r16 = r18
            r18 = r20
            r20 = r24
            r24 = r29
            r29 = r22
            r22 = r26
            r26 = r21
        L117:
            r21 = r23
            r23 = r27
        L11b:
            r27 = r26
            goto L1f4
        L11f:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            int r25 = r1 + 22
            char r25 = r33[r25]
            int r26 = r1 + 23
            char r26 = r33[r26]
            int r27 = r1 + 24
            char r27 = r33[r27]
            int r29 = r1 + 25
            char r29 = r33[r29]
            r31 = r16
            r16 = r18
            r18 = r20
            r30 = r21
            r20 = r24
            r24 = r29
            r29 = r22
            r21 = r23
            r22 = r26
            r23 = r27
            r26 = r30
            goto L11b
        L14e:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            int r25 = r1 + 22
            char r25 = r33[r25]
            int r26 = r1 + 23
            char r26 = r33[r26]
            int r27 = r1 + 24
            char r27 = r33[r27]
            r31 = r16
            r16 = r18
            r18 = r20
            r30 = r21
            r29 = r22
            r20 = r24
            r22 = r26
            r24 = r30
            r26 = r24
            goto L117
        L175:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            int r25 = r1 + 22
            char r25 = r33[r25]
            int r26 = r1 + 23
            char r26 = r33[r26]
            r31 = r16
            r16 = r18
            r18 = r20
            r27 = r21
            r30 = r27
            r29 = r22
            r20 = r24
            r22 = r26
            r24 = r30
            r26 = r24
            r21 = r23
            r23 = r26
            goto L1f4
        L19e:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            int r25 = r1 + 22
            char r25 = r33[r25]
            r31 = r16
            r16 = r18
            r18 = r20
            r26 = r21
        L1b2:
            r27 = r26
            r30 = r27
            r29 = r22
            r20 = r24
            r22 = r30
            r24 = r22
            r21 = r23
            r23 = r24
            goto L1f4
        L1c3:
            int r23 = r1 + 20
            char r23 = r33[r23]
            int r24 = r1 + 21
            char r24 = r33[r24]
            r31 = r16
            r16 = r18
            r18 = r20
            r25 = r21
            r26 = r25
            goto L1b2
        L1d6:
            int r23 = r1 + 20
            char r23 = r33[r23]
            r31 = r16
            r16 = r18
            r18 = r20
            r20 = r21
            r24 = r20
            r25 = r24
            r26 = r25
            r27 = r26
            r30 = r27
            r29 = r22
            r22 = r30
            r21 = r23
            r23 = r22
        L1f4:
            r0 = 45
            if (r4 != r0) goto L222
            if (r11 != r0) goto L222
            r4 = 32
            if (r14 == r4) goto L202
            r4 = 84
            if (r14 != r4) goto L222
        L202:
            r4 = 58
            if (r3 != r4) goto L222
            if (r2 != r4) goto L222
            r2 = 46
            if (r5 != r2) goto L222
            r11 = r12
            r12 = r13
            r13 = r15
            r15 = r17
            r17 = r19
            r19 = r21
            r21 = r25
            r5 = r29
            r25 = r30
            r14 = r31
            java.time.LocalDateTime r0 = localDateTime(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L222:
            int r2 = r1 + r35
            int r3 = r2 + (-15)
            char r3 = r33[r3]
            if (r3 != r0) goto L277
            int r3 = r2 + (-12)
            char r3 = r33[r3]
            if (r3 != r0) goto L277
            int r0 = r2 + (-9)
            char r0 = r33[r0]
            r3 = 32
            if (r0 == r3) goto L23c
            r3 = 84
            if (r0 != r3) goto L277
        L23c:
            int r0 = r2 + (-6)
            char r0 = r33[r0]
            r4 = 58
            if (r0 != r4) goto L277
            int r0 = r2 + (-3)
            char r0 = r33[r0]
            if (r0 != r4) goto L277
            int r0 = r35 + (-15)
            r3 = r33
            int r0 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r1, r0)
            int r1 = r2 + (-14)
            r4 = 2
            int r1 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r1, r4)
            int r5 = r2 + (-11)
            int r5 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r5, r4)
            int r6 = r2 + (-8)
            int r6 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r6, r4)
            int r7 = r2 + (-5)
            int r7 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r7, r4)
            int r2 = r2 - r4
            int r8 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r3, r2, r4)
            r3 = r0
            r4 = r1
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r3, r4, r5, r6, r7, r8)
            return r0
        L277:
            return r28
    }

    public static java.time.LocalTime parseLocalTime(char r2, char r3, char r4, char r5, char r6, char r7, char r8, char r9) {
            r0 = 0
            r1 = 58
            if (r4 != r1) goto L37
            if (r7 != r1) goto L37
            r4 = 48
            if (r2 < r4) goto L37
            r7 = 57
            if (r2 > r7) goto L37
            if (r3 < r4) goto L37
            if (r3 > r7) goto L37
            int r2 = r2 - r4
            int r2 = r2 * 10
            int r3 = r3 - r4
            int r3 = r3 + r2
            if (r5 < r4) goto L37
            if (r5 > r7) goto L37
            if (r6 < r4) goto L37
            if (r6 > r7) goto L37
            int r5 = r5 - r4
            int r5 = r5 * 10
            int r6 = r6 - r4
            int r6 = r6 + r5
            if (r8 < r4) goto L37
            if (r8 > r7) goto L37
            if (r9 < r4) goto L37
            if (r9 > r7) goto L37
            int r8 = r8 - r4
            int r8 = r8 * 10
            int r9 = r9 - r4
            int r9 = r9 + r8
            java.time.LocalTime r2 = java.time.LocalTime.of(r3, r6, r9)
            return r2
        L37:
            return r0
    }

    public static java.time.LocalTime parseLocalTime10(byte[] r10, int r11) {
            int r0 = r11 + 10
            int r1 = r10.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r10[r11]
            int r1 = r11 + 1
            r1 = r10[r1]
            int r3 = r11 + 2
            r3 = r10[r3]
            int r4 = r11 + 3
            r4 = r10[r4]
            int r5 = r11 + 4
            r5 = r10[r5]
            int r6 = r11 + 5
            r6 = r10[r6]
            int r7 = r11 + 6
            r7 = r10[r7]
            int r8 = r11 + 7
            r8 = r10[r8]
            int r9 = r11 + 8
            r9 = r10[r9]
            int r11 = r11 + 9
            r10 = r10[r11]
            r11 = 58
            if (r3 != r11) goto L70
            if (r6 != r11) goto L70
            r11 = 46
            if (r9 != r11) goto L70
            r11 = 48
            if (r0 < r11) goto L70
            r3 = 57
            if (r0 > r3) goto L70
            if (r1 < r11) goto L70
            if (r1 > r3) goto L70
            int r0 = r0 - r11
            int r0 = r0 * 10
            int r1 = r1 - r11
            int r1 = r1 + r0
            if (r4 < r11) goto L70
            if (r4 > r3) goto L70
            if (r5 < r11) goto L70
            if (r5 > r3) goto L70
            int r4 = r4 - r11
            int r4 = r4 * 10
            int r5 = r5 - r11
            int r5 = r5 + r4
            if (r7 < r11) goto L70
            if (r7 > r3) goto L70
            if (r8 < r11) goto L70
            if (r8 > r3) goto L70
            int r7 = r7 - r11
            int r7 = r7 * 10
            int r8 = r8 - r11
            int r8 = r8 + r7
            if (r10 < r11) goto L70
            if (r10 > r3) goto L70
            int r10 = r10 - r11
            r11 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r10 = r10 * r11
            java.time.LocalTime r10 = java.time.LocalTime.of(r1, r5, r8, r10)
            return r10
        L70:
            return r2
    }

    public static java.time.LocalTime parseLocalTime10(char[] r10, int r11) {
            int r0 = r11 + 10
            int r1 = r10.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r10[r11]
            int r1 = r11 + 1
            char r1 = r10[r1]
            int r3 = r11 + 2
            char r3 = r10[r3]
            int r4 = r11 + 3
            char r4 = r10[r4]
            int r5 = r11 + 4
            char r5 = r10[r5]
            int r6 = r11 + 5
            char r6 = r10[r6]
            int r7 = r11 + 6
            char r7 = r10[r7]
            int r8 = r11 + 7
            char r8 = r10[r8]
            int r9 = r11 + 8
            char r9 = r10[r9]
            int r11 = r11 + 9
            char r10 = r10[r11]
            r11 = 58
            if (r3 != r11) goto L70
            if (r6 != r11) goto L70
            r11 = 46
            if (r9 != r11) goto L70
            r11 = 48
            if (r0 < r11) goto L70
            r3 = 57
            if (r0 > r3) goto L70
            if (r1 < r11) goto L70
            if (r1 > r3) goto L70
            int r0 = r0 - r11
            int r0 = r0 * 10
            int r1 = r1 - r11
            int r1 = r1 + r0
            if (r4 < r11) goto L70
            if (r4 > r3) goto L70
            if (r5 < r11) goto L70
            if (r5 > r3) goto L70
            int r4 = r4 - r11
            int r4 = r4 * 10
            int r5 = r5 - r11
            int r5 = r5 + r4
            if (r7 < r11) goto L70
            if (r7 > r3) goto L70
            if (r8 < r11) goto L70
            if (r8 > r3) goto L70
            int r7 = r7 - r11
            int r7 = r7 * 10
            int r8 = r8 - r11
            int r8 = r8 + r7
            if (r10 < r11) goto L70
            if (r10 > r3) goto L70
            int r10 = r10 - r11
            r11 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r10 = r10 * r11
            java.time.LocalTime r10 = java.time.LocalTime.of(r1, r5, r8, r10)
            return r10
        L70:
            return r2
    }

    public static java.time.LocalTime parseLocalTime11(byte[] r11, int r12) {
            int r0 = r12 + 11
            int r1 = r11.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r11[r12]
            int r1 = r12 + 1
            r1 = r11[r1]
            int r3 = r12 + 2
            r3 = r11[r3]
            int r4 = r12 + 3
            r4 = r11[r4]
            int r5 = r12 + 4
            r5 = r11[r5]
            int r6 = r12 + 5
            r6 = r11[r6]
            int r7 = r12 + 6
            r7 = r11[r7]
            int r8 = r12 + 7
            r8 = r11[r8]
            int r9 = r12 + 8
            r9 = r11[r9]
            int r10 = r12 + 9
            r10 = r11[r10]
            int r12 = r12 + 10
            r11 = r11[r12]
            r12 = 58
            if (r3 != r12) goto L7e
            if (r6 != r12) goto L7e
            r12 = 46
            if (r9 != r12) goto L7e
            r12 = 48
            if (r0 < r12) goto L7e
            r3 = 57
            if (r0 > r3) goto L7e
            if (r1 < r12) goto L7e
            if (r1 > r3) goto L7e
            int r0 = r0 - r12
            int r0 = r0 * 10
            int r1 = r1 - r12
            int r1 = r1 + r0
            if (r4 < r12) goto L7e
            if (r4 > r3) goto L7e
            if (r5 < r12) goto L7e
            if (r5 > r3) goto L7e
            int r4 = r4 - r12
            int r4 = r4 * 10
            int r5 = r5 - r12
            int r5 = r5 + r4
            if (r7 < r12) goto L7e
            if (r7 > r3) goto L7e
            if (r8 < r12) goto L7e
            if (r8 > r3) goto L7e
            int r7 = r7 - r12
            int r7 = r7 * 10
            int r8 = r8 - r12
            int r8 = r8 + r7
            if (r10 < r12) goto L7e
            if (r10 > r3) goto L7e
            if (r11 < r12) goto L7e
            if (r11 > r3) goto L7e
            int r10 = r10 - r12
            int r10 = r10 * 100
            int r11 = r11 - r12
            int r11 = r11 * 10
            int r11 = r11 + r10
            r12 = 1000000(0xf4240, float:1.401298E-39)
            int r11 = r11 * r12
            java.time.LocalTime r11 = java.time.LocalTime.of(r1, r5, r8, r11)
            return r11
        L7e:
            return r2
    }

    public static java.time.LocalTime parseLocalTime11(char[] r11, int r12) {
            int r0 = r12 + 11
            int r1 = r11.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r11[r12]
            int r1 = r12 + 1
            char r1 = r11[r1]
            int r3 = r12 + 2
            char r3 = r11[r3]
            int r4 = r12 + 3
            char r4 = r11[r4]
            int r5 = r12 + 4
            char r5 = r11[r5]
            int r6 = r12 + 5
            char r6 = r11[r6]
            int r7 = r12 + 6
            char r7 = r11[r7]
            int r8 = r12 + 7
            char r8 = r11[r8]
            int r9 = r12 + 8
            char r9 = r11[r9]
            int r10 = r12 + 9
            char r10 = r11[r10]
            int r12 = r12 + 10
            char r11 = r11[r12]
            r12 = 58
            if (r3 != r12) goto L7e
            if (r6 != r12) goto L7e
            r12 = 46
            if (r9 != r12) goto L7e
            r12 = 48
            if (r0 < r12) goto L7e
            r3 = 57
            if (r0 > r3) goto L7e
            if (r1 < r12) goto L7e
            if (r1 > r3) goto L7e
            int r0 = r0 - r12
            int r0 = r0 * 10
            int r1 = r1 - r12
            int r1 = r1 + r0
            if (r4 < r12) goto L7e
            if (r4 > r3) goto L7e
            if (r5 < r12) goto L7e
            if (r5 > r3) goto L7e
            int r4 = r4 - r12
            int r4 = r4 * 10
            int r5 = r5 - r12
            int r5 = r5 + r4
            if (r7 < r12) goto L7e
            if (r7 > r3) goto L7e
            if (r8 < r12) goto L7e
            if (r8 > r3) goto L7e
            int r7 = r7 - r12
            int r7 = r7 * 10
            int r8 = r8 - r12
            int r8 = r8 + r7
            if (r10 < r12) goto L7e
            if (r10 > r3) goto L7e
            if (r11 < r12) goto L7e
            if (r11 > r3) goto L7e
            int r10 = r10 - r12
            int r10 = r10 * 100
            int r11 = r11 - r12
            int r11 = r11 * 10
            int r11 = r11 + r10
            r12 = 1000000(0xf4240, float:1.401298E-39)
            int r11 = r11 * r12
            java.time.LocalTime r11 = java.time.LocalTime.of(r1, r5, r8, r11)
            return r11
        L7e:
            return r2
    }

    public static java.time.LocalTime parseLocalTime12(byte[] r12, int r13) {
            int r0 = r13 + 12
            int r1 = r12.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r12[r13]
            int r1 = r13 + 1
            r1 = r12[r1]
            int r3 = r13 + 2
            r3 = r12[r3]
            int r4 = r13 + 3
            r4 = r12[r4]
            int r5 = r13 + 4
            r5 = r12[r5]
            int r6 = r13 + 5
            r6 = r12[r6]
            int r7 = r13 + 6
            r7 = r12[r7]
            int r8 = r13 + 7
            r8 = r12[r8]
            int r9 = r13 + 8
            r9 = r12[r9]
            int r10 = r13 + 9
            r10 = r12[r10]
            int r11 = r13 + 10
            r11 = r12[r11]
            int r13 = r13 + 11
            r12 = r12[r13]
            r13 = 58
            if (r3 != r13) goto L87
            if (r6 != r13) goto L87
            r13 = 46
            if (r9 != r13) goto L87
            r13 = 48
            if (r0 < r13) goto L87
            r3 = 57
            if (r0 > r3) goto L87
            if (r1 < r13) goto L87
            if (r1 > r3) goto L87
            int r0 = r0 - r13
            r6 = 10
            int r0 = r0 * r6
            int r1 = r1 - r13
            int r1 = r1 + r0
            if (r4 < r13) goto L87
            if (r4 > r3) goto L87
            if (r5 < r13) goto L87
            if (r5 > r3) goto L87
            int r4 = r4 - r13
            int r4 = r4 * r6
            int r5 = r5 - r13
            int r5 = r5 + r4
            if (r7 < r13) goto L87
            if (r7 > r3) goto L87
            if (r8 < r13) goto L87
            if (r8 > r3) goto L87
            int r7 = r7 - r13
            int r7 = r7 * r6
            int r8 = r8 - r13
            int r8 = r8 + r7
            if (r10 < r13) goto L87
            if (r10 > r3) goto L87
            if (r11 < r13) goto L87
            if (r11 > r3) goto L87
            if (r12 < r13) goto L87
            if (r12 > r3) goto L87
            int r10 = r10 - r13
            int r10 = r10 * 100
            int r0 = p.a.z(r11, r13, r6, r10)
            int r12 = r12 - r13
            int r12 = r12 + r0
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r12 * r13
            java.time.LocalTime r12 = java.time.LocalTime.of(r1, r5, r8, r12)
            return r12
        L87:
            return r2
    }

    public static java.time.LocalTime parseLocalTime12(char[] r12, int r13) {
            int r0 = r13 + 12
            int r1 = r12.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r12[r13]
            int r1 = r13 + 1
            char r1 = r12[r1]
            int r3 = r13 + 2
            char r3 = r12[r3]
            int r4 = r13 + 3
            char r4 = r12[r4]
            int r5 = r13 + 4
            char r5 = r12[r5]
            int r6 = r13 + 5
            char r6 = r12[r6]
            int r7 = r13 + 6
            char r7 = r12[r7]
            int r8 = r13 + 7
            char r8 = r12[r8]
            int r9 = r13 + 8
            char r9 = r12[r9]
            int r10 = r13 + 9
            char r10 = r12[r10]
            int r11 = r13 + 10
            char r11 = r12[r11]
            int r13 = r13 + 11
            char r12 = r12[r13]
            r13 = 58
            if (r3 != r13) goto L87
            if (r6 != r13) goto L87
            r13 = 46
            if (r9 != r13) goto L87
            r13 = 48
            if (r0 < r13) goto L87
            r3 = 57
            if (r0 > r3) goto L87
            if (r1 < r13) goto L87
            if (r1 > r3) goto L87
            int r0 = r0 - r13
            r6 = 10
            int r0 = r0 * r6
            int r1 = r1 - r13
            int r1 = r1 + r0
            if (r4 < r13) goto L87
            if (r4 > r3) goto L87
            if (r5 < r13) goto L87
            if (r5 > r3) goto L87
            int r4 = r4 - r13
            int r4 = r4 * r6
            int r5 = r5 - r13
            int r5 = r5 + r4
            if (r7 < r13) goto L87
            if (r7 > r3) goto L87
            if (r8 < r13) goto L87
            if (r8 > r3) goto L87
            int r7 = r7 - r13
            int r7 = r7 * r6
            int r8 = r8 - r13
            int r8 = r8 + r7
            if (r10 < r13) goto L87
            if (r10 > r3) goto L87
            if (r11 < r13) goto L87
            if (r11 > r3) goto L87
            if (r12 < r13) goto L87
            if (r12 > r3) goto L87
            int r10 = r10 - r13
            int r10 = r10 * 100
            int r0 = p.a.z(r11, r13, r6, r10)
            int r12 = r12 - r13
            int r12 = r12 + r0
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r12 * r13
            java.time.LocalTime r12 = java.time.LocalTime.of(r1, r5, r8, r12)
            return r12
        L87:
            return r2
    }

    public static java.time.LocalTime parseLocalTime15(byte[] r6, int r7) {
            int r0 = r7 + 15
            int r1 = r6.length
            r2 = 0
            if (r0 > r1) goto L38
            long r0 = hms(r6, r7)
            r3 = -1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L38
            int r3 = r7 + 8
            r3 = r6[r3]
            r4 = 46
            if (r3 == r4) goto L19
            goto L38
        L19:
            int r3 = (int) r0
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 24
            long r4 = r0 >> r4
            int r4 = (int) r4
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 48
            long r0 = r0 >> r5
            int r0 = (int) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 9
            r1 = 6
            int r6 = readNanos(r6, r1, r7)
            if (r6 >= 0) goto L33
            return r2
        L33:
            java.time.LocalTime r6 = java.time.LocalTime.of(r3, r4, r0, r6)
            return r6
        L38:
            return r2
    }

    public static java.time.LocalTime parseLocalTime15(char[] r5, int r6) {
            int r0 = r6 + 15
            int r1 = r5.length
            r2 = 0
            if (r0 > r1) goto L40
            int r0 = r6 + 2
            char r0 = r5[r0]
            r1 = 58
            if (r0 != r1) goto L40
            int r0 = r6 + 5
            char r0 = r5[r0]
            if (r0 != r1) goto L40
            int r0 = r6 + 8
            char r0 = r5[r0]
            r1 = 46
            if (r0 == r1) goto L1d
            goto L40
        L1d:
            int r0 = com.alibaba.fastjson2.util.IOUtils.digit2(r5, r6)
            int r1 = r6 + 3
            int r1 = com.alibaba.fastjson2.util.IOUtils.digit2(r5, r1)
            int r3 = r6 + 6
            int r3 = com.alibaba.fastjson2.util.IOUtils.digit2(r5, r3)
            int r6 = r6 + 9
            r4 = 6
            int r5 = readNanos(r5, r4, r6)
            r6 = r0 | r1
            r6 = r6 | r3
            r6 = r6 | r5
            if (r6 >= 0) goto L3b
            return r2
        L3b:
            java.time.LocalTime r5 = java.time.LocalTime.of(r0, r1, r3, r5)
            return r5
        L40:
            return r2
    }

    public static java.time.LocalTime parseLocalTime18(byte[] r20, int r21) {
            r0 = r20
            int r1 = r21 + 18
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = r0[r21]
            int r2 = r21 + 1
            r2 = r0[r2]
            int r4 = r21 + 2
            r4 = r0[r4]
            int r5 = r21 + 3
            r5 = r0[r5]
            int r6 = r21 + 4
            r6 = r0[r6]
            int r7 = r21 + 5
            r7 = r0[r7]
            int r8 = r21 + 6
            r8 = r0[r8]
            int r9 = r21 + 7
            r9 = r0[r9]
            int r10 = r21 + 8
            r10 = r0[r10]
            int r11 = r21 + 9
            r11 = r0[r11]
            int r12 = r21 + 10
            r12 = r0[r12]
            int r13 = r21 + 11
            r13 = r0[r13]
            int r14 = r21 + 12
            r14 = r0[r14]
            int r15 = r21 + 13
            r15 = r0[r15]
            int r16 = r21 + 14
            r17 = r3
            r3 = r0[r16]
            int r16 = r21 + 15
            r0 = r20[r16]
            int r16 = r21 + 16
            r18 = r0
            r0 = r20[r16]
            int r16 = r21 + 17
            r19 = r0
            r0 = r20[r16]
            r20 = r0
            r0 = 58
            if (r4 != r0) goto Led
            if (r7 != r0) goto Led
            r0 = 46
            if (r10 != r0) goto Led
            r0 = 48
            if (r1 < r0) goto Led
            r4 = 57
            if (r1 > r4) goto Led
            if (r2 < r0) goto Led
            if (r2 > r4) goto Led
            int r1 = r1 - r0
            r7 = 10
            int r1 = r1 * r7
            int r2 = r2 - r0
            int r2 = r2 + r1
            if (r5 < r0) goto Led
            if (r5 > r4) goto Led
            if (r6 < r0) goto Led
            if (r6 > r4) goto Led
            int r5 = r5 - r0
            int r5 = r5 * r7
            int r6 = r6 - r0
            int r6 = r6 + r5
            if (r8 < r0) goto Led
            if (r8 > r4) goto Led
            if (r9 < r0) goto Led
            if (r9 > r4) goto Led
            int r8 = r8 - r0
            int r8 = r8 * r7
            int r9 = r9 - r0
            int r9 = r9 + r8
            if (r11 < r0) goto Led
            if (r11 > r4) goto Led
            if (r12 < r0) goto Led
            if (r12 > r4) goto Led
            if (r13 < r0) goto Led
            if (r13 > r4) goto Led
            if (r14 < r0) goto Led
            if (r14 > r4) goto Led
            if (r15 < r0) goto Led
            if (r15 > r4) goto Led
            if (r3 < r0) goto Led
            if (r3 > r4) goto Led
            r1 = r18
            if (r1 < r0) goto Led
            if (r1 > r4) goto Led
            r5 = r19
            if (r5 < r0) goto Led
            if (r5 > r4) goto Led
            r8 = r20
            if (r8 < r0) goto Led
            if (r8 > r4) goto Led
            int r11 = r11 - r0
            r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r11 = r11 * r4
            r4 = 10000000(0x989680, float:1.4012985E-38)
            int r4 = p.a.z(r12, r0, r4, r11)
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = p.a.z(r13, r0, r10, r4)
            r10 = 100000(0x186a0, float:1.4013E-40)
            int r4 = p.a.z(r14, r0, r10, r4)
            r10 = 10000(0x2710, float:1.4013E-41)
            int r4 = p.a.z(r15, r0, r10, r4)
            r10 = 1000(0x3e8, float:1.401E-42)
            int r3 = p.a.z(r3, r0, r10, r4)
            r4 = 100
            int r1 = p.a.z(r1, r0, r4, r3)
            int r1 = p.a.z(r5, r0, r7, r1)
            int r0 = r8 + (-48)
            int r0 = r0 + r1
            java.time.LocalTime r0 = java.time.LocalTime.of(r2, r6, r9, r0)
            return r0
        Led:
            return r17
    }

    public static java.time.LocalTime parseLocalTime18(char[] r20, int r21) {
            r0 = r20
            int r1 = r21 + 18
            int r2 = r0.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            char r1 = r0[r21]
            int r2 = r21 + 1
            char r2 = r0[r2]
            int r4 = r21 + 2
            char r4 = r0[r4]
            int r5 = r21 + 3
            char r5 = r0[r5]
            int r6 = r21 + 4
            char r6 = r0[r6]
            int r7 = r21 + 5
            char r7 = r0[r7]
            int r8 = r21 + 6
            char r8 = r0[r8]
            int r9 = r21 + 7
            char r9 = r0[r9]
            int r10 = r21 + 8
            char r10 = r0[r10]
            int r11 = r21 + 9
            char r11 = r0[r11]
            int r12 = r21 + 10
            char r12 = r0[r12]
            int r13 = r21 + 11
            char r13 = r0[r13]
            int r14 = r21 + 12
            char r14 = r0[r14]
            int r15 = r21 + 13
            char r15 = r0[r15]
            int r16 = r21 + 14
            r17 = r3
            char r3 = r0[r16]
            int r16 = r21 + 15
            char r0 = r20[r16]
            int r16 = r21 + 16
            r18 = r0
            char r0 = r20[r16]
            int r16 = r21 + 17
            r19 = r0
            char r0 = r20[r16]
            r20 = r0
            r0 = 58
            if (r4 != r0) goto Led
            if (r7 != r0) goto Led
            r0 = 46
            if (r10 != r0) goto Led
            r0 = 48
            if (r1 < r0) goto Led
            r4 = 57
            if (r1 > r4) goto Led
            if (r2 < r0) goto Led
            if (r2 > r4) goto Led
            int r1 = r1 - r0
            r7 = 10
            int r1 = r1 * r7
            int r2 = r2 - r0
            int r2 = r2 + r1
            if (r5 < r0) goto Led
            if (r5 > r4) goto Led
            if (r6 < r0) goto Led
            if (r6 > r4) goto Led
            int r5 = r5 - r0
            int r5 = r5 * r7
            int r6 = r6 - r0
            int r6 = r6 + r5
            if (r8 < r0) goto Led
            if (r8 > r4) goto Led
            if (r9 < r0) goto Led
            if (r9 > r4) goto Led
            int r8 = r8 - r0
            int r8 = r8 * r7
            int r9 = r9 - r0
            int r9 = r9 + r8
            if (r11 < r0) goto Led
            if (r11 > r4) goto Led
            if (r12 < r0) goto Led
            if (r12 > r4) goto Led
            if (r13 < r0) goto Led
            if (r13 > r4) goto Led
            if (r14 < r0) goto Led
            if (r14 > r4) goto Led
            if (r15 < r0) goto Led
            if (r15 > r4) goto Led
            if (r3 < r0) goto Led
            if (r3 > r4) goto Led
            r1 = r18
            if (r1 < r0) goto Led
            if (r1 > r4) goto Led
            r5 = r19
            if (r5 < r0) goto Led
            if (r5 > r4) goto Led
            r8 = r20
            if (r8 < r0) goto Led
            if (r8 > r4) goto Led
            int r11 = r11 - r0
            r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r11 = r11 * r4
            r4 = 10000000(0x989680, float:1.4012985E-38)
            int r4 = p.a.z(r12, r0, r4, r11)
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = p.a.z(r13, r0, r10, r4)
            r10 = 100000(0x186a0, float:1.4013E-40)
            int r4 = p.a.z(r14, r0, r10, r4)
            r10 = 10000(0x2710, float:1.4013E-41)
            int r4 = p.a.z(r15, r0, r10, r4)
            r10 = 1000(0x3e8, float:1.401E-42)
            int r3 = p.a.z(r3, r0, r10, r4)
            r4 = 100
            int r1 = p.a.z(r1, r0, r4, r3)
            int r1 = p.a.z(r5, r0, r7, r1)
            int r0 = r8 + (-48)
            int r0 = r0 + r1
            java.time.LocalTime r0 = java.time.LocalTime.of(r2, r6, r9, r0)
            return r0
        Led:
            return r17
    }

    public static java.time.LocalTime parseLocalTime5(byte[] r5, int r6) {
            int r0 = r6 + 5
            int r1 = r5.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            r0 = r5[r6]
            int r1 = r6 + 1
            r1 = r5[r1]
            int r3 = r6 + 2
            r3 = r5[r3]
            int r4 = r6 + 3
            r4 = r5[r4]
            int r6 = r6 + 4
            r5 = r5[r6]
            r6 = 58
            if (r3 != r6) goto L40
            r6 = 48
            if (r0 < r6) goto L40
            r3 = 57
            if (r0 > r3) goto L40
            if (r1 < r6) goto L40
            if (r1 > r3) goto L40
            int r0 = r0 - r6
            int r0 = r0 * 10
            int r1 = r1 - r6
            int r1 = r1 + r0
            if (r4 < r6) goto L40
            if (r4 > r3) goto L40
            if (r5 < r6) goto L40
            if (r5 > r3) goto L40
            int r4 = r4 - r6
            int r4 = r4 * 10
            int r5 = r5 - r6
            int r5 = r5 + r4
            java.time.LocalTime r5 = java.time.LocalTime.of(r1, r5)
            return r5
        L40:
            return r2
    }

    public static java.time.LocalTime parseLocalTime5(char[] r5, int r6) {
            int r0 = r6 + 5
            int r1 = r5.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            char r0 = r5[r6]
            int r1 = r6 + 1
            char r1 = r5[r1]
            int r3 = r6 + 2
            char r3 = r5[r3]
            int r4 = r6 + 3
            char r4 = r5[r4]
            int r6 = r6 + 4
            char r5 = r5[r6]
            r6 = 58
            if (r3 != r6) goto L40
            r6 = 48
            if (r0 < r6) goto L40
            r3 = 57
            if (r0 > r3) goto L40
            if (r1 < r6) goto L40
            if (r1 > r3) goto L40
            int r0 = r0 - r6
            int r0 = r0 * 10
            int r1 = r1 - r6
            int r1 = r1 + r0
            if (r4 < r6) goto L40
            if (r4 > r3) goto L40
            if (r5 < r6) goto L40
            if (r5 > r3) goto L40
            int r4 = r4 - r6
            int r4 = r4 * 10
            int r5 = r5 - r6
            int r5 = r5 + r4
            java.time.LocalTime r5 = java.time.LocalTime.of(r1, r5)
            return r5
        L40:
            return r2
    }

    public static java.time.LocalTime parseLocalTime8(byte[] r9, int r10) {
            int r0 = r10 + 8
            int r1 = r9.length
            if (r0 <= r1) goto L7
            r9 = 0
            return r9
        L7:
            r0 = r9[r10]
            char r1 = (char) r0
            int r0 = r10 + 1
            r0 = r9[r0]
            char r2 = (char) r0
            int r0 = r10 + 2
            r0 = r9[r0]
            char r3 = (char) r0
            int r0 = r10 + 3
            r0 = r9[r0]
            char r4 = (char) r0
            int r0 = r10 + 4
            r0 = r9[r0]
            char r5 = (char) r0
            int r0 = r10 + 5
            r0 = r9[r0]
            char r6 = (char) r0
            int r0 = r10 + 6
            r0 = r9[r0]
            char r7 = (char) r0
            int r10 = r10 + 7
            r9 = r9[r10]
            char r8 = (char) r9
            java.time.LocalTime r9 = parseLocalTime(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static java.time.LocalTime parseLocalTime8(char[] r8, int r9) {
            int r0 = r9 + 8
            int r1 = r8.length
            if (r0 <= r1) goto L7
            r8 = 0
            return r8
        L7:
            char r0 = r8[r9]
            int r1 = r9 + 1
            char r1 = r8[r1]
            int r2 = r9 + 2
            char r2 = r8[r2]
            int r3 = r9 + 3
            char r3 = r8[r3]
            int r4 = r9 + 4
            char r4 = r8[r4]
            int r5 = r9 + 5
            char r5 = r8[r5]
            int r6 = r9 + 6
            char r6 = r8[r6]
            int r9 = r9 + 7
            char r7 = r8[r9]
            java.time.LocalTime r8 = parseLocalTime(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static long parseMillis(java.lang.String r2) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r0 = parseMillis(r2, r0)
            return r0
    }

    public static long parseMillis(java.lang.String r2, java.time.ZoneId r3) {
            if (r2 != 0) goto L5
            r2 = 0
            return r2
        L5:
            char[] r2 = r2.toCharArray()
            r0 = 0
            int r1 = r2.length
            long r2 = parseMillis(r2, r0, r1, r3)
            return r2
    }

    public static long parseMillis(byte[] r2, int r3, int r4) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r2 = parseMillis(r2, r3, r4, r0, r1)
            return r2
    }

    public static long parseMillis(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r1 = parseMillis(r1, r2, r3, r4, r0)
            return r1
    }

    public static long parseMillis(byte[] r20, int r21, int r22, java.nio.charset.Charset r23, java.time.ZoneId r24) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = 0
            if (r0 == 0) goto L196
            if (r2 != 0) goto L10
            goto L196
        L10:
            r6 = 4
            if (r2 != r6) goto L30
            r7 = r0[r1]
            r8 = 110(0x6e, float:1.54E-43)
            if (r7 != r8) goto L30
            int r7 = r1 + 1
            r7 = r0[r7]
            r8 = 117(0x75, float:1.64E-43)
            if (r7 != r8) goto L30
            int r7 = r1 + 2
            r7 = r0[r7]
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 != r8) goto L30
            int r7 = r1 + 3
            r7 = r0[r7]
            if (r7 != r8) goto L30
            return r4
        L30:
            r7 = r0[r1]
            char r7 = (char) r7
            r8 = 34
            if (r7 != r8) goto L64
            int r9 = r2 + (-1)
            r9 = r0[r9]
            if (r9 != r8) goto L64
            com.alibaba.fastjson2.JSONReader r11 = com.alibaba.fastjson2.JSONReader.of(r20, r21, r22, r23)
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r10 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE     // Catch: java.lang.Throwable -> L57
            r13 = 0
            r14 = 0
            r12 = 0
            java.lang.Object r0 = r10.readObject(r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L57
            java.util.Date r0 = (java.util.Date) r0     // Catch: java.lang.Throwable -> L57
            long r0 = r0.getTime()     // Catch: java.lang.Throwable -> L57
            if (r11 == 0) goto L56
            r11.close()
        L56:
            return r0
        L57:
            r0 = move-exception
            r1 = r0
            if (r11 == 0) goto L63
            r11.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r1.addSuppressed(r0)
        L63:
            throw r1
        L64:
            r8 = 19
            if (r2 != r8) goto L6d
            long r0 = parseMillis19(r0, r1, r3)
            return r0
        L6d:
            if (r2 > r8) goto L174
            r8 = 16
            r9 = 45
            if (r2 != r8) goto L82
            int r8 = r1 + 10
            r8 = r0[r8]
            char r8 = (char) r8
            r10 = 43
            if (r8 == r10) goto L174
            if (r8 != r9) goto L82
            goto L174
        L82:
            r8 = 0
            r10 = 9
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = 48
            if (r7 == r9) goto L91
            if (r7 < r13) goto Lf8
            r14 = 57
            if (r7 > r14) goto Lf8
        L91:
            boolean r7 = com.alibaba.fastjson2.util.IOUtils.isNumber(r20, r21, r22)
            if (r7 == 0) goto Lf8
            long r0 = com.alibaba.fastjson2.util.TypeUtils.parseLong(r20, r21, r22)
            r4 = 8
            if (r2 != r4) goto Lf7
            r4 = 19700101(0x12c9985, double:9.733143E-317)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto Lf7
            r4 = 21000101(0x1406fa5, double:1.03754285E-316)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto Lf7
            int r2 = (int) r0
            int r13 = r2 / 10000
            int r4 = r2 % 10000
            int r14 = r4 / 100
            int r15 = r2 % 100
            r2 = 1
            if (r14 < r2) goto Lf7
            r2 = 12
            if (r14 > r2) goto Lf7
            r2 = 2
            if (r14 == r2) goto Ld1
            if (r14 == r6) goto Lce
            r2 = 6
            if (r14 == r2) goto Lce
            if (r14 == r10) goto Lce
            r2 = 11
            if (r14 == r2) goto Lce
            r2 = 31
            goto Le2
        Lce:
            r2 = 30
            goto Le2
        Ld1:
            r2 = r13 & 3
            if (r2 != 0) goto Le0
            int r2 = r13 % 100
            if (r2 != 0) goto Ldd
            int r2 = r13 % 400
            if (r2 != 0) goto Le0
        Ldd:
            r2 = 29
            goto Le2
        Le0:
            r2 = 28
        Le2:
            if (r15 > r2) goto Lf7
            r17 = 0
            r18 = 0
            r16 = 0
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r13, r14, r15, r16, r17, r18)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r0, r3, r8)
            long r0 = r0.toEpochSecond()
            long r0 = r0 * r11
        Lf7:
            return r0
        Lf8:
            int r6 = r2 + (-1)
            r6 = r0[r6]
            char r6 = (char) r6
            r7 = 90
            if (r6 != r7) goto L103
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
        L103:
            java.time.LocalDateTime r2 = parseLocalDateTime(r20, r21, r22)
            if (r2 != 0) goto L151
            r6 = r0[r1]
            if (r6 != r13) goto L151
            int r6 = r1 + 1
            r6 = r0[r6]
            if (r6 != r13) goto L151
            int r6 = r1 + 2
            r6 = r0[r6]
            if (r6 != r13) goto L151
            int r6 = r1 + 3
            r6 = r0[r6]
            if (r6 != r13) goto L151
            int r6 = r1 + 4
            r6 = r0[r6]
            if (r6 != r9) goto L151
            int r6 = r1 + 5
            r6 = r0[r6]
            if (r6 != r13) goto L151
            int r6 = r1 + 6
            r6 = r0[r6]
            if (r6 != r13) goto L151
            int r6 = r1 + 7
            r6 = r0[r6]
            if (r6 != r9) goto L151
            int r6 = r1 + 8
            r6 = r0[r6]
            if (r6 != r13) goto L151
            int r1 = r1 + r10
            r0 = r0[r1]
            if (r0 != r13) goto L151
            r18 = 0
            r19 = 0
            r14 = 1970(0x7b2, float:2.76E-42)
            r15 = 1
            r16 = 1
            r17 = 0
            java.time.LocalDateTime r2 = java.time.LocalDateTime.of(r14, r15, r16, r17, r18, r19)
        L151:
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r2, r3, r8)
            long r0 = r0.toEpochSecond()
            int r2 = r2.getNano()
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r3 >= 0) goto L16f
            if (r2 <= 0) goto L16f
            r5 = 1
            long r0 = r0 + r5
            long r0 = r0 * r11
            int r2 = r2 / r4
            long r2 = (long) r2
            long r0 = r0 + r2
            long r0 = r0 - r11
            return r0
        L16f:
            long r0 = r0 * r11
            int r2 = r2 / r4
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
        L174:
            java.time.ZonedDateTime r3 = parseZonedDateTime(r0, r1, r2, r3)
            if (r3 == 0) goto L183
            java.time.Instant r0 = r3.toInstant()
            long r0 = r0.toEpochMilli()
            return r0
        L183:
            java.lang.String r3 = new java.lang.String
            int r2 = r2 - r1
            r3.<init>(r0, r1, r2)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = "illegal input "
            java.lang.String r1 = r1.concat(r3)
            r2 = 0
            r0.<init>(r1, r3, r2)
            throw r0
        L196:
            return r4
    }

    public static long parseMillis(char[] r1, int r2, int r3) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r1 = parseMillis(r1, r2, r3, r0)
            return r1
    }

    public static long parseMillis(char[] r21, int r22, int r23, java.time.ZoneId r24) {
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = 0
            if (r0 == 0) goto L1ab
            if (r2 != 0) goto L10
            goto L1ab
        L10:
            r6 = 4
            if (r2 != r6) goto L30
            char r7 = r0[r1]
            r8 = 110(0x6e, float:1.54E-43)
            if (r7 != r8) goto L30
            int r7 = r1 + 1
            char r7 = r0[r7]
            r8 = 117(0x75, float:1.64E-43)
            if (r7 != r8) goto L30
            int r7 = r1 + 2
            char r7 = r0[r7]
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 != r8) goto L30
            int r7 = r1 + 3
            char r7 = r0[r7]
            if (r7 != r8) goto L30
            return r4
        L30:
            char r7 = r0[r1]
            r8 = 34
            if (r7 != r8) goto L63
            int r9 = r2 + (-1)
            char r9 = r0[r9]
            if (r9 != r8) goto L63
            com.alibaba.fastjson2.JSONReader r11 = com.alibaba.fastjson2.JSONReader.of(r21, r22, r23)
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r10 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE     // Catch: java.lang.Throwable -> L56
            r13 = 0
            r14 = 0
            r12 = 0
            java.lang.Object r0 = r10.readObject(r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L56
            java.util.Date r0 = (java.util.Date) r0     // Catch: java.lang.Throwable -> L56
            long r0 = r0.getTime()     // Catch: java.lang.Throwable -> L56
            if (r11 == 0) goto L55
            r11.close()
        L55:
            return r0
        L56:
            r0 = move-exception
            r1 = r0
            if (r11 == 0) goto L62
            r11.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r1.addSuppressed(r0)
        L62:
            throw r1
        L63:
            r8 = 19
            if (r2 != r8) goto L6c
            long r0 = parseMillis19(r0, r1, r3)
            return r0
        L6c:
            r9 = 0
            java.lang.String r10 = "illegal input "
            if (r2 > r8) goto L18c
            r8 = 16
            r11 = 45
            if (r2 != r8) goto L83
            int r8 = r1 + 10
            char r8 = r0[r8]
            r12 = 43
            if (r8 == r12) goto L18c
            if (r8 != r11) goto L83
            goto L18c
        L83:
            r8 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 48
            if (r7 == r11) goto L90
            if (r7 < r14) goto Lfb
            r15 = 57
            if (r7 > r15) goto Lfb
        L90:
            boolean r7 = com.alibaba.fastjson2.util.IOUtils.isNumber(r21, r22, r23)
            if (r7 == 0) goto Lfb
            long r0 = com.alibaba.fastjson2.util.TypeUtils.parseLong(r21, r22, r23)
            r4 = 8
            if (r2 != r4) goto Lfa
            r4 = 19700101(0x12c9985, double:9.733143E-317)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto Lfa
            r4 = 21000101(0x1406fa5, double:1.03754285E-316)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto Lfa
            int r2 = (int) r0
            int r14 = r2 / 10000
            int r4 = r2 % 10000
            int r15 = r4 / 100
            int r2 = r2 % 100
            r4 = 1
            if (r15 < r4) goto Lfa
            r4 = 12
            if (r15 > r4) goto Lfa
            r4 = 2
            if (r15 == r4) goto Ld2
            if (r15 == r6) goto Lcf
            r4 = 6
            if (r15 == r4) goto Lcf
            r4 = 9
            if (r15 == r4) goto Lcf
            r4 = 11
            if (r15 == r4) goto Lcf
            r4 = 31
            goto Le3
        Lcf:
            r4 = 30
            goto Le3
        Ld2:
            r4 = r14 & 3
            if (r4 != 0) goto Le1
            int r4 = r14 % 100
            if (r4 != 0) goto Lde
            int r4 = r14 % 400
            if (r4 != 0) goto Le1
        Lde:
            r4 = 29
            goto Le3
        Le1:
            r4 = 28
        Le3:
            if (r2 > r4) goto Lfa
            r18 = 0
            r19 = 0
            r17 = 0
            r16 = r2
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r14, r15, r16, r17, r18, r19)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r0, r3, r8)
            long r0 = r0.toEpochSecond()
            long r0 = r0 * r12
        Lfa:
            return r0
        Lfb:
            int r6 = r2 + (-1)
            char r6 = r0[r6]
            r7 = 90
            if (r6 != r7) goto L107
            int r2 = r2 + (-1)
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
        L107:
            java.time.LocalDateTime r6 = parseLocalDateTime(r0, r1, r2)
            if (r6 != 0) goto L157
            char r7 = r0[r1]
            if (r7 != r14) goto L157
            int r7 = r1 + 1
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            int r7 = r1 + 2
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            int r7 = r1 + 3
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            int r7 = r1 + 4
            char r7 = r0[r7]
            if (r7 != r11) goto L157
            int r7 = r1 + 5
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            int r7 = r1 + 6
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            int r7 = r1 + 7
            char r7 = r0[r7]
            if (r7 != r11) goto L157
            int r7 = r1 + 8
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            int r7 = r1 + 9
            char r7 = r0[r7]
            if (r7 != r14) goto L157
            r19 = 0
            r20 = 0
            r15 = 1970(0x7b2, float:2.76E-42)
            r16 = 1
            r17 = 1
            r18 = 0
            java.time.LocalDateTime r6 = java.time.LocalDateTime.of(r15, r16, r17, r18, r19, r20)
        L157:
            if (r6 == 0) goto L17c
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r6, r3, r8)
            long r0 = r0.toEpochSecond()
            int r2 = r6.getNano()
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r3 >= 0) goto L177
            if (r2 <= 0) goto L177
            r5 = 1
            long r0 = r0 + r5
            long r0 = r0 * r12
            int r2 = r2 / r4
            long r2 = (long) r2
            long r0 = r0 + r2
            long r0 = r0 - r12
            return r0
        L177:
            long r0 = r0 * r12
            int r2 = r2 / r4
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
        L17c:
            java.lang.String r3 = new java.lang.String
            int r2 = r2 - r1
            r3.<init>(r0, r1, r2)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r10.concat(r3)
            r0.<init>(r1, r3, r9)
            throw r0
        L18c:
            java.time.ZonedDateTime r3 = parseZonedDateTime(r21, r22, r23, r24)
            if (r3 == 0) goto L19b
            java.time.Instant r0 = r3.toInstant()
            long r0 = r0.toEpochMilli()
            return r0
        L19b:
            java.lang.String r3 = new java.lang.String
            int r2 = r2 - r1
            r3.<init>(r0, r1, r2)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r10.concat(r3)
            r0.<init>(r1, r3, r9)
            throw r0
        L1ab:
            return r4
    }

    public static long parseMillis10(java.lang.String r20, java.time.ZoneId r21, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r22) {
            r0 = r20
            r1 = r21
            if (r0 == 0) goto L1c3
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L10
            goto L1c3
        L10:
            r2 = r22
            int r3 = r2.length
            r4 = 10
            if (r3 != r4) goto L1bd
            int r3 = r0.length()
            r5 = 0
            if (r3 != r4) goto L1b0
            char r3 = r0.charAt(r5)
            r6 = 1
            char r7 = r0.charAt(r6)
            r8 = 2
            char r9 = r0.charAt(r8)
            r10 = 3
            char r10 = r0.charAt(r10)
            r11 = 4
            char r12 = r0.charAt(r11)
            r13 = 5
            char r14 = r0.charAt(r13)
            r15 = 6
            char r6 = r0.charAt(r15)
            r11 = 7
            char r11 = r0.charAt(r11)
            r8 = 8
            char r8 = r0.charAt(r8)
            r4 = 9
            char r5 = r0.charAt(r4)
            int[] r19 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern
            int r2 = r2.ordinal()
            r2 = r19[r2]
            java.lang.String r4 = "illegal input"
            if (r2 == r13) goto L75
            if (r2 != r15) goto L6e
            r2 = 47
            if (r12 != r2) goto L67
            if (r11 != r2) goto L67
            goto L7b
        L67:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = 0
            r1.<init>(r4, r0, r2)
            throw r1
        L6e:
            r2 = 0
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r4, r0, r2)
            throw r1
        L75:
            r2 = 45
            if (r12 != r2) goto L1a9
            if (r11 != r2) goto L1a9
        L7b:
            r2 = 48
            if (r3 < r2) goto L1a2
            r11 = 57
            if (r3 > r11) goto L1a2
            if (r7 < r2) goto L1a2
            if (r7 > r11) goto L1a2
            if (r9 < r2) goto L1a2
            if (r9 > r11) goto L1a2
            if (r10 < r2) goto L1a2
            if (r10 > r11) goto L1a2
            int r3 = r3 - r2
            int r3 = r3 * 1000
            r12 = 100
            int r3 = p.a.z(r7, r2, r12, r3)
            r7 = 10
            int r3 = p.a.z(r9, r2, r7, r3)
            int r10 = r10 - r2
            int r10 = r10 + r3
            if (r14 < r2) goto L19b
            if (r14 > r11) goto L19b
            if (r6 < r2) goto L19b
            if (r6 > r11) goto L19b
            int r14 = r14 - r2
            int r14 = r14 * r7
            int r6 = r6 - r2
            int r6 = r6 + r14
            if (r6 != 0) goto Lb4
            if (r10 != 0) goto Lb1
            goto Lb4
        Lb1:
            r2 = 0
            goto L195
        Lb4:
            r3 = 12
            if (r6 > r3) goto Lb1
            if (r8 < r2) goto L18e
            if (r8 > r11) goto L18e
            if (r5 < r2) goto L18e
            if (r5 > r11) goto L18e
            int r8 = r8 - r2
            r18 = 10
            int r8 = r8 * 10
            int r5 = r5 - r2
            int r5 = r5 + r8
            r2 = 2
            if (r6 == r2) goto Ldd
            r2 = 4
            if (r6 == r2) goto Lda
            if (r6 == r15) goto Lda
            r2 = 9
            if (r6 == r2) goto Lda
            r2 = 11
            if (r6 == r2) goto Lda
            r2 = 31
            goto Lee
        Lda:
            r2 = 30
            goto Lee
        Ldd:
            r2 = r10 & 3
            if (r2 != 0) goto Lec
            int r2 = r10 % 100
            if (r2 != 0) goto Le9
            int r2 = r10 % 400
            if (r2 != 0) goto Lec
        Le9:
            r2 = 29
            goto Lee
        Lec:
            r2 = 28
        Lee:
            if (r5 != 0) goto Lf2
            if (r10 != 0) goto L187
        Lf2:
            if (r5 > r2) goto L187
            if (r10 != 0) goto Lfe
            if (r6 != 0) goto Lfe
            if (r5 != 0) goto Lfe
            r10 = 1970(0x7b2, float:2.76E-42)
            r5 = 1
            r6 = 1
        Lfe:
            int r0 = r10 * 365
            int r2 = r10 + 3
            r17 = 4
            int r2 = r2 / 4
            int r4 = r10 + 99
            int r4 = r4 / r12
            int r2 = r2 - r4
            int r4 = r10 + 399
            int r4 = r4 / 400
            int r4 = r4 + r2
            int r4 = r4 + r0
            int r0 = r6 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / r3
            int r0 = r0 + r4
            int r2 = r5 + (-1)
            int r2 = r2 + r0
            long r2 = (long) r2
            r0 = 2
            if (r6 <= r0) goto L132
            r7 = 1
            long r7 = r2 - r7
            r0 = r10 & 3
            if (r0 != 0) goto L12f
            int r0 = r10 % 100
            if (r0 != 0) goto L12d
            int r0 = r10 % 400
            if (r0 != 0) goto L12f
        L12d:
            r2 = r7
            goto L132
        L12f:
            r7 = 2
            long r2 = r2 - r7
        L132:
            r7 = 719528(0xafaa8, double:3.55494E-318)
            long r2 = r2 - r7
            r7 = 86400(0x15180, double:4.26873E-319)
            long r2 = r2 * r7
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r1 == r0) goto L14a
            java.time.zone.ZoneRules r0 = r1.getRules()
            java.time.zone.ZoneRules r4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r0 != r4) goto L147
            goto L14a
        L147:
            r16 = 0
            goto L14c
        L14a:
            r16 = 1
        L14c:
            if (r16 == 0) goto L158
            r7 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L158
            r5 = 28800(0x7080, float:4.0357E-41)
            goto L181
        L158:
            java.time.ZoneOffset r0 = java.time.ZoneOffset.UTC
            if (r1 == r0) goto L180
            java.lang.String r0 = "UTC"
            java.lang.String r4 = r1.getId()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L169
            goto L180
        L169:
            java.time.LocalDate r0 = java.time.LocalDate.of(r10, r6, r5)
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r4)
            java.time.zone.ZoneRules r1 = r1.getRules()
            java.time.ZoneOffset r0 = r1.getOffset(r0)
            int r5 = r0.getTotalSeconds()
            goto L181
        L180:
            r5 = 0
        L181:
            long r0 = (long) r5
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            return r2
        L187:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = 0
            r1.<init>(r4, r0, r2)
            throw r1
        L18e:
            r2 = 0
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r4, r0, r2)
            throw r1
        L195:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r4, r0, r2)
            throw r1
        L19b:
            r2 = 0
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r4, r0, r2)
            throw r1
        L1a2:
            r2 = 0
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r4, r0, r2)
            throw r1
        L1a9:
            r2 = 0
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r4, r0, r2)
            throw r1
        L1b0:
            r2 = r5
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r3 = "illegal input "
            java.lang.String r3 = r3.concat(r0)
            r1.<init>(r3, r0, r2)
            throw r1
        L1bd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L1c3:
            r0 = 0
            return r0
    }

    public static long parseMillis19(java.lang.String r27, java.time.ZoneId r28) {
            r0 = r27
            r0.getClass()
            int r1 = r0.length()
            r2 = 19
            java.lang.String r3 = "illegal input "
            r4 = 0
            if (r1 != r2) goto L3b6
            char r1 = r0.charAt(r4)
            r2 = 1
            char r5 = r0.charAt(r2)
            r6 = 2
            char r7 = r0.charAt(r6)
            r8 = 3
            char r8 = r0.charAt(r8)
            r9 = 4
            char r10 = r0.charAt(r9)
            r11 = 5
            char r11 = r0.charAt(r11)
            r12 = 6
            char r13 = r0.charAt(r12)
            r14 = 7
            char r14 = r0.charAt(r14)
            r15 = 8
            char r15 = r0.charAt(r15)
            r2 = 9
            char r17 = r0.charAt(r2)
            r2 = 10
            char r12 = r0.charAt(r2)
            r9 = 11
            char r6 = r0.charAt(r9)
            r9 = 12
            char r19 = r0.charAt(r9)
            r9 = 13
            char r9 = r0.charAt(r9)
            r21 = r2
            r2 = 14
            char r2 = r0.charAt(r2)
            r4 = 15
            char r4 = r0.charAt(r4)
            r22 = r1
            r1 = 16
            char r1 = r0.charAt(r1)
            r23 = r4
            r4 = 17
            char r4 = r0.charAt(r4)
            r24 = r15
            r15 = 18
            char r15 = r0.charAt(r15)
            r25 = r15
            r15 = 45
            r26 = 48
            if (r10 != r15) goto L9a
            if (r14 != r15) goto L9a
            r15 = 32
            if (r12 == r15) goto L93
            r15 = 84
            if (r12 != r15) goto L9a
        L93:
            r15 = 58
            if (r9 != r15) goto L9a
            if (r1 != r15) goto L9a
            goto Lb2
        L9a:
            r15 = 47
            if (r10 != r15) goto Lc7
            if (r14 != r15) goto Lc7
            r15 = 32
            if (r12 == r15) goto La8
            r15 = 84
            if (r12 != r15) goto Lab
        La8:
            r15 = 58
            goto Lae
        Lab:
            r15 = 47
            goto Lc7
        Lae:
            if (r9 != r15) goto Lab
            if (r1 != r15) goto Lab
        Lb2:
            r14 = r5
            r9 = r7
            r12 = r8
            r10 = r13
            r5 = r17
            r13 = r19
            r1 = r22
            r15 = r26
            r7 = r4
            r8 = r6
            r6 = r23
            r4 = r2
            r2 = r24
            goto L1dc
        Lc7:
            if (r7 != r15) goto Ld6
            if (r11 != r15) goto Ld6
            r15 = 32
            if (r12 != r15) goto Ld6
            r15 = 58
            if (r9 != r15) goto Ld6
            if (r1 != r15) goto Ld6
            goto Le6
        Ld6:
            r15 = 46
            if (r7 != r15) goto Lf9
            if (r11 != r15) goto Lf9
            r15 = 32
            if (r12 != r15) goto Lfb
            r15 = 58
            if (r9 != r15) goto Lf9
            if (r1 != r15) goto Lf9
        Le6:
            r7 = r4
            r11 = r8
            r1 = r13
            r12 = r17
            r13 = r19
            r9 = r24
            r15 = r26
            r4 = r2
            r8 = r6
            r2 = r22
            r6 = r23
            goto L1dc
        Lf9:
            r15 = 32
        Lfb:
            if (r5 != r15) goto L138
            if (r11 != r15) goto L138
            if (r12 != r15) goto L138
            r15 = 58
            if (r9 != r15) goto L136
            if (r1 != r15) goto L136
            int r1 = month(r7, r8, r10)
            if (r1 <= 0) goto L12b
            int r5 = r1 / 10
            int r5 = r5 + 48
            char r8 = (char) r5
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r10 = (char) r1
            r7 = r4
            r11 = r8
            r1 = r13
            r12 = r17
            r13 = r19
            r5 = r22
            r9 = r24
            r15 = r26
            r4 = r2
            r8 = r6
            r6 = r23
            r2 = r15
            goto L1dc
        L12b:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L136:
            r15 = 32
        L138:
            if (r7 != r15) goto L174
            if (r13 != r15) goto L174
            if (r6 != r15) goto L174
            r15 = 58
            if (r9 != r15) goto L172
            if (r1 != r15) goto L172
            int r1 = month(r8, r10, r11)
            if (r1 <= 0) goto L167
            int r6 = r1 / 10
            int r6 = r6 + 48
            char r8 = (char) r6
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r10 = (char) r1
            r7 = r4
            r11 = r8
            r1 = r14
            r9 = r17
            r13 = r19
            r6 = r23
            r14 = r24
            r8 = r26
            r15 = r8
            r4 = r2
            r2 = r22
            goto L1dc
        L167:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L172:
            r15 = 32
        L174:
            if (r7 != r15) goto L1af
            if (r13 != r15) goto L1af
            if (r6 != r15) goto L1af
            r15 = 58
            if (r2 != r15) goto L1ad
            if (r1 != r15) goto L1ad
            int r1 = month(r8, r10, r11)
            if (r1 <= 0) goto L1a2
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r8 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r10 = (char) r1
            r7 = r4
            r11 = r8
            r13 = r9
            r1 = r14
            r9 = r17
            r8 = r19
            r2 = r22
            r6 = r23
            r14 = r24
            r4 = r26
            r15 = r4
            goto L1dc
        L1a2:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
        L1ad:
            r15 = 32
        L1af:
            if (r7 != r15) goto L3aa
            if (r13 != r15) goto L3aa
            if (r6 != r15) goto L3aa
            r15 = 58
            if (r2 != r15) goto L3aa
            if (r4 != r15) goto L3aa
            int r2 = month(r8, r10, r11)
            if (r2 <= 0) goto L39e
            int r4 = r2 / 10
            int r4 = r4 + 48
            char r8 = (char) r4
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r10 = (char) r2
            r6 = r1
            r11 = r8
            r13 = r9
            r1 = r14
            r9 = r17
            r8 = r19
            r2 = r22
            r4 = r23
            r14 = r24
            r7 = r26
            r15 = r7
        L1dc:
            if (r1 < r15) goto L392
            r0 = 57
            if (r1 > r0) goto L38f
            if (r14 < r15) goto L38f
            if (r14 > r0) goto L38f
            if (r9 < r15) goto L38f
            if (r9 > r0) goto L38f
            if (r12 < r15) goto L38f
            if (r12 > r0) goto L38f
            int r1 = r1 - r15
            int r1 = r1 * 1000
            r0 = 100
            int r1 = p.a.z(r14, r15, r0, r1)
            r14 = r21
            int r1 = p.a.z(r9, r15, r14, r1)
            int r12 = r12 - r15
            int r12 = r12 + r1
            if (r11 < r15) goto L382
            r1 = 57
            if (r11 > r1) goto L382
            if (r10 < r15) goto L382
            if (r10 > r1) goto L382
            int r11 = r11 - r15
            int r11 = r11 * r14
            int r10 = r10 - r15
            int r10 = r10 + r11
            if (r10 != 0) goto L211
            if (r12 != 0) goto L214
        L211:
            r1 = 12
            goto L219
        L214:
            r4 = 0
            r1 = r27
            goto L378
        L219:
            if (r10 > r1) goto L214
            if (r2 < r15) goto L36b
            r1 = 57
            if (r2 > r1) goto L36b
            if (r5 < r15) goto L36b
            if (r5 > r1) goto L36b
            int r2 = r2 - r15
            r21 = 10
            int r2 = r2 * 10
            int r5 = r5 - r15
            int r5 = r5 + r2
            r1 = 2
            if (r10 == r1) goto L243
            r1 = 4
            if (r10 == r1) goto L240
            r1 = 6
            if (r10 == r1) goto L240
            r1 = 9
            if (r10 == r1) goto L240
            r1 = 11
            if (r10 == r1) goto L240
            r1 = 31
            goto L254
        L240:
            r1 = 30
            goto L254
        L243:
            r1 = r12 & 3
            if (r1 != 0) goto L252
            int r1 = r12 % 100
            if (r1 != 0) goto L24f
            int r1 = r12 % 400
            if (r1 != 0) goto L252
        L24f:
            r1 = 29
            goto L254
        L252:
            r1 = 28
        L254:
            if (r5 != 0) goto L25e
            if (r12 != 0) goto L259
            goto L25e
        L259:
            r4 = 0
            r1 = r27
            goto L361
        L25e:
            if (r5 > r1) goto L259
            r15 = 48
            if (r8 < r15) goto L354
            r1 = 57
            if (r8 > r1) goto L354
            if (r13 < r15) goto L354
            if (r13 > r1) goto L354
            int r8 = r8 - r15
            r21 = 10
            int r8 = r8 * 10
            int r13 = r13 - r15
            int r13 = r13 + r8
            if (r4 < r15) goto L347
            if (r4 > r1) goto L347
            if (r6 < r15) goto L347
            if (r6 > r1) goto L347
            int r4 = r4 - r15
            int r4 = r4 * 10
            int r6 = r6 - r15
            int r6 = r6 + r4
            if (r7 < r15) goto L33a
            if (r7 > r1) goto L33a
            r2 = r25
            if (r2 < r15) goto L33a
            if (r2 > r1) goto L33a
            int r7 = r7 - r15
            int r7 = r7 * 10
            int r15 = r2 + (-48)
            int r15 = r15 + r7
            if (r12 != 0) goto L29a
            if (r10 != 0) goto L29a
            if (r5 != 0) goto L29a
            r12 = 1970(0x7b2, float:2.76E-42)
            r5 = 1
            r10 = 1
        L29a:
            int r1 = r12 * 365
            int r2 = r12 + 3
            r18 = 4
            int r2 = r2 / 4
            int r3 = r12 + 99
            int r3 = r3 / r0
            int r2 = r2 - r3
            int r0 = r12 + 399
            int r0 = r0 / 400
            int r0 = r0 + r2
            int r0 = r0 + r1
            int r1 = r10 * 367
            int r1 = r1 + (-362)
            r20 = 12
            int r1 = r1 / 12
            int r1 = r1 + r0
            int r0 = r5 + (-1)
            int r0 = r0 + r1
            long r0 = (long) r0
            r2 = 2
            if (r10 <= r2) goto L2d1
            r2 = 1
            long r2 = r0 - r2
            r4 = r12 & 3
            if (r4 != 0) goto L2ce
            int r4 = r12 % 100
            if (r4 != 0) goto L2cc
            int r4 = r12 % 400
            if (r4 != 0) goto L2ce
        L2cc:
            r0 = r2
            goto L2d1
        L2ce:
            r2 = 2
            long r0 = r0 - r2
        L2d1:
            r2 = 719528(0xafaa8, double:3.55494E-318)
            long r0 = r0 - r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r2
            int r2 = r13 * 3600
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r6 * 60
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = (long) r15
            long r0 = r0 + r2
            if (r28 != 0) goto L2e8
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto L2ea
        L2e8:
            r2 = r28
        L2ea:
            java.time.ZoneId r3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r2 == r3) goto L2fa
            java.time.zone.ZoneRules r3 = r2.getRules()
            java.time.zone.ZoneRules r4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r3 != r4) goto L2f7
            goto L2fa
        L2f7:
            r16 = 0
            goto L2fc
        L2fa:
            r16 = 1
        L2fc:
            if (r16 == 0) goto L308
            r3 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L308
            r4 = 28800(0x7080, float:4.0357E-41)
            goto L334
        L308:
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
            if (r2 == r3) goto L333
            java.lang.String r3 = "UTC"
            java.lang.String r4 = r2.getId()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L319
            goto L333
        L319:
            java.time.LocalDate r3 = java.time.LocalDate.of(r12, r10, r5)
            r4 = 0
            java.time.LocalTime r4 = java.time.LocalTime.of(r13, r6, r15, r4)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r4)
            java.time.zone.ZoneRules r2 = r2.getRules()
            java.time.ZoneOffset r2 = r2.getOffset(r3)
            int r4 = r2.getTotalSeconds()
            goto L334
        L333:
            r4 = 0
        L334:
            long r2 = (long) r4
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
        L33a:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r1 = r27
            java.lang.String r2 = r3.concat(r1)
            r4 = 0
            r0.<init>(r2, r1, r4)
            throw r0
        L347:
            r4 = 0
            r1 = r27
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L354:
            r4 = 0
            r1 = r27
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L361:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L36b:
            r4 = 0
            r1 = r27
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L378:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L382:
            r4 = 0
            r1 = r27
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L38f:
            r1 = r27
            goto L393
        L392:
            r1 = r0
        L393:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r4 = 0
            r0.<init>(r2, r1, r4)
            throw r0
        L39e:
            r1 = r0
            r4 = 0
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L3aa:
            r1 = r0
            r4 = 0
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
        L3b6:
            r1 = r0
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r3.concat(r1)
            r0.<init>(r2, r1, r4)
            throw r0
    }

    public static long parseMillis19(java.lang.String r28, java.time.ZoneId r29, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r30) {
            r0 = r28
            if (r0 == 0) goto L2df
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Le
            goto L2df
        Le:
            r1 = r30
            int r2 = r1.length
            r3 = 19
            if (r2 != r3) goto L2d9
            int r2 = r0.length()
            r4 = 0
            if (r2 != r3) goto L2cb
            char r2 = r0.charAt(r4)
            r3 = 1
            char r5 = r0.charAt(r3)
            r6 = 2
            char r7 = r0.charAt(r6)
            r8 = 3
            char r9 = r0.charAt(r8)
            r10 = 4
            char r11 = r0.charAt(r10)
            r12 = 5
            char r12 = r0.charAt(r12)
            r13 = 6
            char r14 = r0.charAt(r13)
            r15 = 7
            char r15 = r0.charAt(r15)
            r13 = 8
            char r13 = r0.charAt(r13)
            r4 = 9
            char r16 = r0.charAt(r4)
            r4 = 10
            char r10 = r0.charAt(r4)
            r4 = 11
            char r8 = r0.charAt(r4)
            r4 = 12
            char r6 = r0.charAt(r4)
            r4 = 13
            char r4 = r0.charAt(r4)
            r3 = 14
            char r3 = r0.charAt(r3)
            r1 = 15
            char r1 = r0.charAt(r1)
            r21 = r2
            r2 = 16
            char r2 = r0.charAt(r2)
            r22 = r5
            r5 = 17
            char r5 = r0.charAt(r5)
            r23 = r9
            r9 = 18
            char r9 = r0.charAt(r9)
            int[] r24 = com.alibaba.fastjson2.util.DateUtils.AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern
            int r25 = r30.ordinal()
            r26 = r13
            r13 = r24[r25]
            r24 = r14
            java.lang.String r14 = "illegal input"
            r27 = r9
            r9 = 1
            if (r13 == r9) goto L103
            r9 = 2
            if (r13 == r9) goto Leb
            r9 = 3
            if (r13 == r9) goto Ld3
            r9 = 4
            if (r13 != r9) goto Lcc
            r9 = 46
            if (r7 != r9) goto Lc5
            if (r12 != r9) goto Lc5
            r7 = 32
            if (r10 != r7) goto Lc5
            r7 = 58
            if (r4 != r7) goto Lc5
            if (r2 != r7) goto Lc5
            r10 = r16
            r4 = r21
            r7 = r22
            r12 = r23
            r2 = r24
            r9 = r26
            goto L120
        Lc5:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = 0
            r1.<init>(r14, r0, r2)
            throw r1
        Lcc:
            r2 = 0
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r1.<init>(r14, r0, r2)
            throw r1
        Ld3:
            r9 = 47
            if (r11 != r9) goto Le4
            if (r15 != r9) goto Le4
            r9 = 32
            if (r10 != r9) goto Le4
            r9 = 58
            if (r4 != r9) goto Le4
            if (r2 != r9) goto Le4
            goto L113
        Le4:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = 0
            r1.<init>(r14, r0, r2)
            throw r1
        Leb:
            r9 = 45
            if (r11 != r9) goto Lfc
            if (r15 != r9) goto Lfc
            r9 = 84
            if (r10 != r9) goto Lfc
            r9 = 58
            if (r4 != r9) goto Lfc
            if (r2 != r9) goto Lfc
            goto L113
        Lfc:
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r2 = 0
            r1.<init>(r14, r0, r2)
            throw r1
        L103:
            r9 = 45
            if (r11 != r9) goto L2c3
            if (r15 != r9) goto L2c3
            r9 = 32
            if (r10 != r9) goto L2c3
            r9 = 58
            if (r4 != r9) goto L2c3
            if (r2 != r9) goto L2c3
        L113:
            r9 = r7
            r7 = r16
            r2 = r21
            r15 = r22
            r10 = r23
            r11 = r24
            r4 = r26
        L120:
            r13 = 48
            if (r2 < r13) goto L2bb
            r0 = 57
            if (r2 > r0) goto L2b7
            if (r15 < r13) goto L2b7
            if (r15 > r0) goto L2b7
            if (r9 < r13) goto L2b7
            if (r9 > r0) goto L2b7
            if (r10 < r13) goto L2b7
            if (r10 > r0) goto L2b7
            int r2 = r2 - r13
            int r2 = r2 * 1000
            r0 = 100
            int r2 = p.a.z(r15, r13, r0, r2)
            r15 = 10
            int r2 = p.a.z(r9, r13, r15, r2)
            int r10 = r10 - r13
            int r10 = r10 + r2
            if (r12 < r13) goto L2ae
            r2 = 57
            if (r12 > r2) goto L2ae
            if (r11 < r13) goto L2ae
            if (r11 > r2) goto L2ae
            int r12 = r12 - r13
            int r12 = r12 * r15
            int r11 = r11 - r13
            int r11 = r11 + r12
            if (r11 != 0) goto L157
            if (r10 != 0) goto L15a
        L157:
            r2 = 12
            goto L15f
        L15a:
            r2 = 0
            r1 = r28
            goto L2a8
        L15f:
            if (r11 > r2) goto L15a
            if (r4 < r13) goto L29f
            r2 = 57
            if (r4 > r2) goto L29f
            if (r7 < r13) goto L29f
            if (r7 > r2) goto L29f
            int r4 = r4 - r13
            r18 = 10
            int r4 = r4 * 10
            int r7 = r7 - r13
            int r7 = r7 + r4
            r9 = 2
            if (r11 == r9) goto L189
            r9 = 4
            if (r11 == r9) goto L186
            r2 = 6
            if (r11 == r2) goto L186
            r2 = 9
            if (r11 == r2) goto L186
            r2 = 11
            if (r11 == r2) goto L186
            r2 = 31
            goto L19a
        L186:
            r2 = 30
            goto L19a
        L189:
            r2 = r10 & 3
            if (r2 != 0) goto L198
            int r2 = r10 % 100
            if (r2 != 0) goto L195
            int r2 = r10 % 400
            if (r2 != 0) goto L198
        L195:
            r2 = 29
            goto L19a
        L198:
            r2 = 28
        L19a:
            if (r7 != 0) goto L1a4
            if (r10 != 0) goto L19f
            goto L1a4
        L19f:
            r2 = 0
            r1 = r28
            goto L299
        L1a4:
            if (r7 > r2) goto L19f
            if (r8 < r13) goto L290
            r2 = 57
            if (r8 > r2) goto L290
            if (r6 < r13) goto L290
            if (r6 > r2) goto L290
            int r8 = r8 - r13
            r18 = 10
            int r8 = r8 * 10
            int r6 = r6 - r13
            int r6 = r6 + r8
            if (r3 < r13) goto L287
            if (r3 > r2) goto L287
            if (r1 < r13) goto L287
            if (r1 > r2) goto L287
            int r3 = r3 - r13
            int r3 = r3 * 10
            int r1 = r1 - r13
            int r1 = r1 + r3
            if (r5 < r13) goto L27e
            if (r5 > r2) goto L27e
            r3 = r27
            if (r3 < r13) goto L27e
            if (r3 > r2) goto L27e
            int r5 = r5 - r13
            int r5 = r5 * 10
            int r9 = r3 + (-48)
            int r9 = r9 + r5
            if (r10 != 0) goto L1de
            if (r11 != 0) goto L1de
            if (r7 != 0) goto L1de
            r10 = 1970(0x7b2, float:2.76E-42)
            r7 = 1
            r11 = 1
        L1de:
            int r2 = r10 * 365
            int r3 = r10 + 3
            r17 = 4
            int r3 = r3 / 4
            int r4 = r10 + 99
            int r4 = r4 / r0
            int r3 = r3 - r4
            int r0 = r10 + 399
            int r0 = r0 / 400
            int r0 = r0 + r3
            int r0 = r0 + r2
            int r2 = r11 * 367
            int r2 = r2 + (-362)
            r19 = 12
            int r2 = r2 / 12
            int r2 = r2 + r0
            int r0 = r7 + (-1)
            int r0 = r0 + r2
            long r2 = (long) r0
            r0 = 2
            if (r11 <= r0) goto L215
            r4 = 1
            long r4 = r2 - r4
            r0 = r10 & 3
            if (r0 != 0) goto L212
            int r0 = r10 % 100
            if (r0 != 0) goto L210
            int r0 = r10 % 400
            if (r0 != 0) goto L212
        L210:
            r2 = r4
            goto L215
        L212:
            r4 = 2
            long r2 = r2 - r4
        L215:
            r4 = 719528(0xafaa8, double:3.55494E-318)
            long r2 = r2 - r4
            r4 = 86400(0x15180, double:4.26873E-319)
            long r2 = r2 * r4
            int r0 = r6 * 3600
            long r4 = (long) r0
            long r2 = r2 + r4
            int r0 = r1 * 60
            long r4 = (long) r0
            long r2 = r2 + r4
            long r4 = (long) r9
            long r2 = r2 + r4
            if (r29 != 0) goto L22c
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto L22e
        L22c:
            r0 = r29
        L22e:
            java.time.ZoneId r4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r0 == r4) goto L23e
            java.time.zone.ZoneRules r4 = r0.getRules()
            java.time.zone.ZoneRules r5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r4 != r5) goto L23b
            goto L23e
        L23b:
            r20 = 0
            goto L240
        L23e:
            r20 = 1
        L240:
            if (r20 == 0) goto L24c
            r4 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L24c
            r4 = 28800(0x7080, float:4.0357E-41)
            goto L278
        L24c:
            java.time.ZoneOffset r4 = java.time.ZoneOffset.UTC
            if (r0 == r4) goto L277
            java.lang.String r4 = "UTC"
            java.lang.String r5 = r0.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L25d
            goto L277
        L25d:
            java.time.LocalDate r4 = java.time.LocalDate.of(r10, r11, r7)
            r5 = 0
            java.time.LocalTime r1 = java.time.LocalTime.of(r6, r1, r9, r5)
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r4, r1)
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r1)
            int r4 = r0.getTotalSeconds()
            goto L278
        L277:
            r4 = 0
        L278:
            long r0 = (long) r4
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            return r2
        L27e:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r2 = 0
            r1 = r28
            r0.<init>(r14, r1, r2)
            throw r0
        L287:
            r2 = 0
            r1 = r28
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L290:
            r2 = 0
            r1 = r28
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L299:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L29f:
            r2 = 0
            r1 = r28
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L2a8:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L2ae:
            r2 = 0
            r1 = r28
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L2b7:
            r2 = 0
            r1 = r28
            goto L2bd
        L2bb:
            r1 = r0
            r2 = 0
        L2bd:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L2c3:
            r1 = r0
            r2 = 0
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r14, r1, r2)
            throw r0
        L2cb:
            r1 = r0
            r2 = r4
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r3 = "illegal input "
            java.lang.String r3 = r3.concat(r1)
            r0.<init>(r3, r1, r2)
            throw r0
        L2d9:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L2df:
            r0 = 0
            return r0
    }

    public static long parseMillis19(byte[] r25, int r26, java.time.ZoneId r27) {
            r0 = r25
            r1 = r26
            r0.getClass()
            r2 = r0[r1]
            char r2 = (char) r2
            int r3 = r1 + 1
            r3 = r0[r3]
            char r3 = (char) r3
            int r4 = r1 + 2
            r4 = r0[r4]
            char r4 = (char) r4
            int r5 = r1 + 3
            r5 = r0[r5]
            char r5 = (char) r5
            int r6 = r1 + 4
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r1 + 5
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r1 + 6
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r1 + 7
            r9 = r0[r9]
            char r9 = (char) r9
            int r10 = r1 + 8
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r1 + 9
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r1 + 10
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r1 + 11
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r1 + 12
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r1 + 13
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r1 + 14
            r17 = r2
            r2 = r0[r16]
            char r2 = (char) r2
            int r16 = r1 + 15
            r18 = r10
            r10 = r0[r16]
            char r10 = (char) r10
            int r16 = r1 + 16
            r19 = r10
            r10 = r0[r16]
            char r10 = (char) r10
            int r16 = r1 + 17
            r20 = r11
            r11 = r0[r16]
            char r11 = (char) r11
            int r16 = r1 + 18
            r21 = r14
            r14 = r0[r16]
            char r14 = (char) r14
            r16 = r14
            java.lang.String r14 = "illegal input "
            r22 = r11
            r23 = 48
            r24 = 10
            r11 = 45
            if (r6 != r11) goto L8d
            if (r9 != r11) goto L8d
            r11 = 32
            if (r12 == r11) goto L86
            r11 = 84
            if (r12 != r11) goto L8d
        L86:
            r11 = 58
            if (r15 != r11) goto L8d
            if (r10 != r11) goto L8d
            goto La5
        L8d:
            r11 = 47
            if (r6 != r11) goto Lbb
            if (r9 != r11) goto Lbb
            r11 = 32
            if (r12 == r11) goto L9b
            r11 = 84
            if (r12 != r11) goto L9e
        L9b:
            r11 = 58
            goto La1
        L9e:
            r11 = 47
            goto Lbb
        La1:
            if (r15 != r11) goto L9e
            if (r10 != r11) goto L9e
        La5:
            r9 = r3
            r6 = r4
            r12 = r5
            r3 = r18
            r10 = r19
            r4 = r20
            r15 = r21
            r11 = r22
            r5 = r2
            r2 = r17
            r17 = r14
            r14 = r23
            goto L1f3
        Lbb:
            if (r4 != r11) goto Lc3
            if (r7 == r11) goto Lc0
            goto Lc3
        Lc0:
            r11 = 32
            goto Ld0
        Lc3:
            r11 = 46
            if (r4 != r11) goto Lc9
            if (r7 == r11) goto Lc0
        Lc9:
            r11 = 45
            if (r4 != r11) goto Lef
            if (r7 != r11) goto Lef
            goto Lc0
        Ld0:
            if (r12 != r11) goto Lf1
            r11 = 58
            if (r15 != r11) goto Lef
            if (r10 != r11) goto Lef
            r4 = r3
            r7 = r5
            r3 = r17
            r10 = r19
            r12 = r20
            r15 = r21
            r11 = r22
            r5 = r2
            r2 = r8
            r17 = r14
            r14 = r23
        Lea:
            r8 = r6
            r6 = r18
            goto L1f3
        Lef:
            r11 = 32
        Lf1:
            if (r3 != r11) goto L134
            if (r7 != r11) goto L134
            if (r12 != r11) goto L134
            r11 = 58
            if (r15 != r11) goto L132
            if (r10 != r11) goto L132
            int r3 = month(r4, r5, r6)
            if (r3 <= 0) goto L120
            int r4 = r3 / 10
            int r4 = r4 + 48
            char r5 = (char) r4
            int r3 = r3 % 10
            int r3 = r3 + 48
            char r6 = (char) r3
            r7 = r5
            r4 = r17
            r10 = r19
            r12 = r20
            r15 = r21
            r11 = r22
            r3 = r23
            r5 = r2
            r2 = r8
            r17 = r14
            r14 = r3
            goto Lea
        L120:
            java.lang.String r2 = new java.lang.String
            r3 = 19
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r14.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L132:
            r11 = 32
        L134:
            if (r4 != r11) goto L17c
            if (r8 != r11) goto L17c
            if (r13 != r11) goto L17c
            r11 = 58
            if (r15 != r11) goto L17a
            if (r10 != r11) goto L17a
            int r4 = month(r5, r6, r7)
            if (r4 <= 0) goto L168
            int r5 = r4 / 10
            int r5 = r5 + 48
            char r5 = (char) r5
            int r4 = r4 % 10
            int r4 = r4 + 48
            char r6 = (char) r4
            r4 = r3
            r7 = r5
            r8 = r6
            r3 = r17
            r10 = r19
            r6 = r20
            r15 = r21
            r11 = r22
            r13 = r23
            r5 = r2
            r2 = r9
            r17 = r14
            r9 = r18
            r14 = r13
            goto L1f3
        L168:
            java.lang.String r2 = new java.lang.String
            r3 = 19
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r14.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L17a:
            r11 = 32
        L17c:
            if (r4 != r11) goto L1c2
            if (r8 != r11) goto L1c2
            if (r13 != r11) goto L1c2
            r11 = 58
            if (r2 != r11) goto L1c0
            if (r10 != r11) goto L1c0
            int r2 = month(r5, r6, r7)
            if (r2 <= 0) goto L1ae
            int r4 = r2 / 10
            int r4 = r4 + 48
            char r5 = (char) r4
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r6 = (char) r2
            r4 = r3
            r7 = r5
            r8 = r6
            r2 = r9
            r3 = r17
            r9 = r18
            r10 = r19
            r6 = r20
            r13 = r21
            r11 = r22
            r5 = r23
            r17 = r14
            r14 = r5
            goto L1f3
        L1ae:
            java.lang.String r2 = new java.lang.String
            r3 = 19
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r14.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L1c0:
            r11 = 32
        L1c2:
            if (r4 != r11) goto L408
            if (r8 != r11) goto L408
            if (r13 != r11) goto L408
            r11 = 58
            if (r2 != r11) goto L408
            r2 = r22
            if (r2 != r11) goto L408
            int r2 = month(r5, r6, r7)
            if (r2 <= 0) goto L3f4
            int r4 = r2 / 10
            int r4 = r4 + 48
            char r5 = (char) r4
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r6 = (char) r2
            r4 = r3
            r7 = r5
            r8 = r6
            r2 = r9
            r3 = r17
            r9 = r18
            r5 = r19
            r6 = r20
            r13 = r21
            r11 = r23
            r17 = r14
            r14 = r11
        L1f3:
            if (r2 < r14) goto L3e0
            r0 = 57
            if (r2 > r0) goto L3db
            if (r9 < r14) goto L3db
            if (r9 > r0) goto L3db
            if (r6 < r14) goto L3db
            if (r6 > r0) goto L3db
            if (r12 < r14) goto L3db
            if (r12 > r0) goto L3db
            int r2 = r2 - r14
            int r2 = r2 * 1000
            r0 = 100
            int r2 = p.a.z(r9, r14, r0, r2)
            r9 = r24
            int r2 = p.a.z(r6, r14, r9, r2)
            int r12 = r12 - r14
            int r12 = r12 + r2
            if (r7 < r14) goto L3c5
            r2 = 57
            if (r7 > r2) goto L3c5
            if (r8 < r14) goto L3c5
            if (r8 > r2) goto L3c5
            int r7 = r7 - r14
            int r7 = r7 * r9
            int r8 = r8 - r14
            int r8 = r8 + r7
            if (r8 != 0) goto L232
            if (r12 != 0) goto L229
            goto L232
        L229:
            r2 = r25
            r4 = r17
            r3 = 19
            r5 = 0
            goto L3b6
        L232:
            r2 = 12
            if (r8 > r2) goto L229
            if (r3 < r14) goto L3a0
            r6 = 57
            if (r3 > r6) goto L3a0
            if (r4 < r14) goto L3a0
            if (r4 > r6) goto L3a0
            int r3 = r3 - r14
            r24 = 10
            int r3 = r3 * 10
            int r4 = r4 - r14
            int r4 = r4 + r3
            r3 = 2
            r6 = 4
            if (r8 == r3) goto L25e
            if (r8 == r6) goto L25b
            r7 = 6
            if (r8 == r7) goto L25b
            r7 = 9
            if (r8 == r7) goto L25b
            r7 = 11
            if (r8 == r7) goto L25b
            r7 = 31
            goto L26f
        L25b:
            r7 = 30
            goto L26f
        L25e:
            r7 = r12 & 3
            if (r7 != 0) goto L26d
            int r7 = r12 % 100
            if (r7 != 0) goto L26a
            int r7 = r12 % 400
            if (r7 != 0) goto L26d
        L26a:
            r7 = 29
            goto L26f
        L26d:
            r7 = 28
        L26f:
            if (r4 != 0) goto L27d
            if (r12 != 0) goto L274
            goto L27d
        L274:
            r2 = r25
            r4 = r17
            r3 = 19
            r5 = 0
            goto L391
        L27d:
            if (r4 > r7) goto L274
            r14 = 48
            if (r13 < r14) goto L37b
            r7 = 57
            if (r13 > r7) goto L37b
            if (r15 < r14) goto L37b
            if (r15 > r7) goto L37b
            int r13 = r13 - r14
            r24 = 10
            int r13 = r13 * 10
            int r15 = r15 - r14
            int r15 = r15 + r13
            if (r5 < r14) goto L365
            if (r5 > r7) goto L365
            if (r10 < r14) goto L365
            if (r10 > r7) goto L365
            int r5 = r5 - r14
            int r5 = r5 * 10
            int r10 = r10 - r14
            int r10 = r10 + r5
            if (r11 < r14) goto L34f
            if (r11 > r7) goto L34f
            r5 = r16
            if (r5 < r14) goto L34f
            if (r5 > r7) goto L34f
            int r11 = r11 - r14
            int r11 = r11 * 10
            int r14 = r5 + (-48)
            int r14 = r14 + r11
            r1 = 1
            if (r12 != 0) goto L2ba
            if (r8 != 0) goto L2ba
            if (r4 != 0) goto L2ba
            r12 = 1970(0x7b2, float:2.76E-42)
            r4 = r1
            r8 = r4
        L2ba:
            int r5 = r12 * 365
            int r7 = r12 + 3
            int r7 = r7 / r6
            int r6 = r12 + 99
            int r6 = r6 / r0
            int r7 = r7 - r6
            int r0 = r12 + 399
            int r0 = r0 / 400
            int r0 = r0 + r7
            int r0 = r0 + r5
            int r5 = r8 * 367
            int r5 = r5 + (-362)
            int r5 = r5 / r2
            int r5 = r5 + r0
            int r0 = r4 + (-1)
            int r0 = r0 + r5
            long r5 = (long) r0
            if (r8 <= r3) goto L2ea
            r2 = 1
            long r2 = r5 - r2
            r0 = r12 & 3
            if (r0 != 0) goto L2e7
            int r0 = r12 % 100
            if (r0 != 0) goto L2e5
            int r0 = r12 % 400
            if (r0 != 0) goto L2e7
        L2e5:
            r5 = r2
            goto L2ea
        L2e7:
            r2 = 2
            long r5 = r5 - r2
        L2ea:
            r2 = 719528(0xafaa8, double:3.55494E-318)
            long r5 = r5 - r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r5 = r5 * r2
            int r0 = r15 * 3600
            long r2 = (long) r0
            long r5 = r5 + r2
            int r0 = r10 * 60
            long r2 = (long) r0
            long r5 = r5 + r2
            long r2 = (long) r14
            long r5 = r5 + r2
            if (r27 != 0) goto L301
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto L303
        L301:
            r0 = r27
        L303:
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r0 == r2) goto L311
            java.time.zone.ZoneRules r2 = r0.getRules()
            java.time.zone.ZoneRules r3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r2 != r3) goto L310
            goto L311
        L310:
            r1 = 0
        L311:
            if (r1 == 0) goto L31d
            r1 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L31d
            r11 = 28800(0x7080, float:4.0357E-41)
            goto L349
        L31d:
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
            if (r0 == r1) goto L348
            java.lang.String r1 = "UTC"
            java.lang.String r2 = r0.getId()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32e
            goto L348
        L32e:
            java.time.LocalDate r1 = java.time.LocalDate.of(r12, r8, r4)
            r3 = 0
            java.time.LocalTime r2 = java.time.LocalTime.of(r15, r10, r14, r3)
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r1, r2)
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r1)
            int r11 = r0.getTotalSeconds()
            goto L349
        L348:
            r11 = 0
        L349:
            long r0 = (long) r11
            long r5 = r5 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            return r5
        L34f:
            java.lang.String r0 = new java.lang.String
            r3 = 19
            r2 = r25
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r4 = r17
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L365:
            r2 = r25
            r4 = r17
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L37b:
            r2 = r25
            r4 = r17
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L391:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3a0:
            r2 = r25
            r4 = r17
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3b6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3c5:
            r2 = r25
            r4 = r17
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3db:
            r2 = r25
        L3dd:
            r4 = r17
            goto L3e2
        L3e0:
            r2 = r0
            goto L3dd
        L3e2:
            java.lang.String r0 = new java.lang.String
            r3 = 19
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L3f4:
            r2 = r0
            r4 = r14
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L408:
            r2 = r0
            r4 = r14
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
    }

    public static long parseMillis19(char[] r25, int r26, java.time.ZoneId r27) {
            r0 = r25
            r1 = r26
            r0.getClass()
            char r2 = r0[r1]
            int r3 = r1 + 1
            char r3 = r0[r3]
            int r4 = r1 + 2
            char r4 = r0[r4]
            int r5 = r1 + 3
            char r5 = r0[r5]
            int r6 = r1 + 4
            char r6 = r0[r6]
            int r7 = r1 + 5
            char r7 = r0[r7]
            int r8 = r1 + 6
            char r8 = r0[r8]
            int r9 = r1 + 7
            char r9 = r0[r9]
            int r10 = r1 + 8
            char r10 = r0[r10]
            int r11 = r1 + 9
            char r11 = r0[r11]
            int r12 = r1 + 10
            char r12 = r0[r12]
            int r13 = r1 + 11
            char r13 = r0[r13]
            int r14 = r1 + 12
            char r14 = r0[r14]
            int r15 = r1 + 13
            char r15 = r0[r15]
            int r16 = r1 + 14
            r17 = r2
            char r2 = r0[r16]
            int r16 = r1 + 15
            char r16 = r0[r16]
            int r18 = r1 + 16
            r19 = r10
            char r10 = r0[r18]
            int r18 = r1 + 17
            r20 = r11
            char r11 = r0[r18]
            int r18 = r1 + 18
            r21 = r14
            char r14 = r0[r18]
            r18 = r14
            java.lang.String r14 = "illegal input "
            r22 = r11
            r23 = 48
            r24 = 10
            r11 = 45
            if (r6 != r11) goto L78
            if (r9 != r11) goto L78
            r11 = 32
            if (r12 == r11) goto L71
            r11 = 84
            if (r12 != r11) goto L78
        L71:
            r11 = 58
            if (r15 != r11) goto L78
            if (r10 != r11) goto L78
            goto L90
        L78:
            r11 = 47
            if (r6 != r11) goto La6
            if (r9 != r11) goto La6
            r11 = 32
            if (r12 == r11) goto L86
            r11 = 84
            if (r12 != r11) goto L89
        L86:
            r11 = 58
            goto L8c
        L89:
            r11 = 47
            goto La6
        L8c:
            if (r15 != r11) goto L89
            if (r10 != r11) goto L89
        L90:
            r9 = r3
            r6 = r4
            r12 = r5
            r10 = r16
            r3 = r19
            r4 = r20
            r15 = r21
            r11 = r22
            r5 = r2
            r16 = r14
            r2 = r17
            r14 = r23
            goto L1de
        La6:
            if (r4 != r11) goto Lae
            if (r7 == r11) goto Lab
            goto Lae
        Lab:
            r11 = 32
            goto Lbb
        Lae:
            r11 = 46
            if (r4 != r11) goto Lb4
            if (r7 == r11) goto Lab
        Lb4:
            r11 = 45
            if (r4 != r11) goto Lda
            if (r7 != r11) goto Lda
            goto Lab
        Lbb:
            if (r12 != r11) goto Ldc
            r11 = 58
            if (r15 != r11) goto Lda
            if (r10 != r11) goto Lda
            r4 = r3
            r7 = r5
            r10 = r16
            r3 = r17
            r12 = r20
            r15 = r21
            r11 = r22
            r5 = r2
            r2 = r8
            r16 = r14
            r14 = r23
        Ld5:
            r8 = r6
            r6 = r19
            goto L1de
        Lda:
            r11 = 32
        Ldc:
            if (r3 != r11) goto L11f
            if (r7 != r11) goto L11f
            if (r12 != r11) goto L11f
            r11 = 58
            if (r15 != r11) goto L11d
            if (r10 != r11) goto L11d
            int r3 = month(r4, r5, r6)
            if (r3 <= 0) goto L10b
            int r4 = r3 / 10
            int r4 = r4 + 48
            char r5 = (char) r4
            int r3 = r3 % 10
            int r3 = r3 + 48
            char r6 = (char) r3
            r7 = r5
            r10 = r16
            r4 = r17
            r12 = r20
            r15 = r21
            r11 = r22
            r3 = r23
            r5 = r2
            r2 = r8
            r16 = r14
            r14 = r3
            goto Ld5
        L10b:
            java.lang.String r2 = new java.lang.String
            r3 = 19
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r14.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L11d:
            r11 = 32
        L11f:
            if (r4 != r11) goto L167
            if (r8 != r11) goto L167
            if (r13 != r11) goto L167
            r11 = 58
            if (r15 != r11) goto L165
            if (r10 != r11) goto L165
            int r4 = month(r5, r6, r7)
            if (r4 <= 0) goto L153
            int r5 = r4 / 10
            int r5 = r5 + 48
            char r5 = (char) r5
            int r4 = r4 % 10
            int r4 = r4 + 48
            char r6 = (char) r4
            r4 = r3
            r7 = r5
            r8 = r6
            r10 = r16
            r3 = r17
            r6 = r20
            r15 = r21
            r11 = r22
            r13 = r23
            r5 = r2
            r2 = r9
            r16 = r14
            r9 = r19
            r14 = r13
            goto L1de
        L153:
            java.lang.String r2 = new java.lang.String
            r3 = 19
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r14.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L165:
            r11 = 32
        L167:
            if (r4 != r11) goto L1ad
            if (r8 != r11) goto L1ad
            if (r13 != r11) goto L1ad
            r11 = 58
            if (r2 != r11) goto L1ab
            if (r10 != r11) goto L1ab
            int r2 = month(r5, r6, r7)
            if (r2 <= 0) goto L199
            int r4 = r2 / 10
            int r4 = r4 + 48
            char r5 = (char) r4
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r6 = (char) r2
            r4 = r3
            r7 = r5
            r8 = r6
            r2 = r9
            r10 = r16
            r3 = r17
            r9 = r19
            r6 = r20
            r13 = r21
            r11 = r22
            r5 = r23
            r16 = r14
            r14 = r5
            goto L1de
        L199:
            java.lang.String r2 = new java.lang.String
            r3 = 19
            r2.<init>(r0, r1, r3)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r14.concat(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            throw r0
        L1ab:
            r11 = 32
        L1ad:
            if (r4 != r11) goto L3f3
            if (r8 != r11) goto L3f3
            if (r13 != r11) goto L3f3
            r11 = 58
            if (r2 != r11) goto L3f3
            r2 = r22
            if (r2 != r11) goto L3f3
            int r2 = month(r5, r6, r7)
            if (r2 <= 0) goto L3df
            int r4 = r2 / 10
            int r4 = r4 + 48
            char r5 = (char) r4
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r6 = (char) r2
            r4 = r3
            r7 = r5
            r8 = r6
            r2 = r9
            r5 = r16
            r3 = r17
            r9 = r19
            r6 = r20
            r13 = r21
            r11 = r23
            r16 = r14
            r14 = r11
        L1de:
            if (r2 < r14) goto L3cb
            r0 = 57
            if (r2 > r0) goto L3c6
            if (r9 < r14) goto L3c6
            if (r9 > r0) goto L3c6
            if (r6 < r14) goto L3c6
            if (r6 > r0) goto L3c6
            if (r12 < r14) goto L3c6
            if (r12 > r0) goto L3c6
            int r2 = r2 - r14
            int r2 = r2 * 1000
            r0 = 100
            int r2 = p.a.z(r9, r14, r0, r2)
            r9 = r24
            int r2 = p.a.z(r6, r14, r9, r2)
            int r12 = r12 - r14
            int r12 = r12 + r2
            if (r7 < r14) goto L3b0
            r2 = 57
            if (r7 > r2) goto L3b0
            if (r8 < r14) goto L3b0
            if (r8 > r2) goto L3b0
            int r7 = r7 - r14
            int r7 = r7 * r9
            int r8 = r8 - r14
            int r8 = r8 + r7
            if (r8 != 0) goto L21d
            if (r12 != 0) goto L214
            goto L21d
        L214:
            r2 = r25
            r4 = r16
            r3 = 19
            r5 = 0
            goto L3a1
        L21d:
            r2 = 12
            if (r8 > r2) goto L214
            if (r3 < r14) goto L38b
            r6 = 57
            if (r3 > r6) goto L38b
            if (r4 < r14) goto L38b
            if (r4 > r6) goto L38b
            int r3 = r3 - r14
            r24 = 10
            int r3 = r3 * 10
            int r4 = r4 - r14
            int r4 = r4 + r3
            r3 = 2
            r6 = 4
            if (r8 == r3) goto L249
            if (r8 == r6) goto L246
            r7 = 6
            if (r8 == r7) goto L246
            r7 = 9
            if (r8 == r7) goto L246
            r7 = 11
            if (r8 == r7) goto L246
            r7 = 31
            goto L25a
        L246:
            r7 = 30
            goto L25a
        L249:
            r7 = r12 & 3
            if (r7 != 0) goto L258
            int r7 = r12 % 100
            if (r7 != 0) goto L255
            int r7 = r12 % 400
            if (r7 != 0) goto L258
        L255:
            r7 = 29
            goto L25a
        L258:
            r7 = 28
        L25a:
            if (r4 != 0) goto L268
            if (r12 != 0) goto L25f
            goto L268
        L25f:
            r2 = r25
            r4 = r16
            r3 = 19
            r5 = 0
            goto L37c
        L268:
            if (r4 > r7) goto L25f
            r14 = 48
            if (r13 < r14) goto L366
            r7 = 57
            if (r13 > r7) goto L366
            if (r15 < r14) goto L366
            if (r15 > r7) goto L366
            int r13 = r13 - r14
            r24 = 10
            int r13 = r13 * 10
            int r15 = r15 - r14
            int r15 = r15 + r13
            if (r5 < r14) goto L350
            if (r5 > r7) goto L350
            if (r10 < r14) goto L350
            if (r10 > r7) goto L350
            int r5 = r5 - r14
            int r5 = r5 * 10
            int r10 = r10 - r14
            int r10 = r10 + r5
            if (r11 < r14) goto L33a
            if (r11 > r7) goto L33a
            r5 = r18
            if (r5 < r14) goto L33a
            if (r5 > r7) goto L33a
            int r11 = r11 - r14
            int r11 = r11 * 10
            int r14 = r5 + (-48)
            int r14 = r14 + r11
            r1 = 1
            if (r12 != 0) goto L2a5
            if (r8 != 0) goto L2a5
            if (r4 != 0) goto L2a5
            r12 = 1970(0x7b2, float:2.76E-42)
            r4 = r1
            r8 = r4
        L2a5:
            int r5 = r12 * 365
            int r7 = r12 + 3
            int r7 = r7 / r6
            int r6 = r12 + 99
            int r6 = r6 / r0
            int r7 = r7 - r6
            int r0 = r12 + 399
            int r0 = r0 / 400
            int r0 = r0 + r7
            int r0 = r0 + r5
            int r5 = r8 * 367
            int r5 = r5 + (-362)
            int r5 = r5 / r2
            int r5 = r5 + r0
            int r0 = r4 + (-1)
            int r0 = r0 + r5
            long r5 = (long) r0
            if (r8 <= r3) goto L2d5
            r2 = 1
            long r2 = r5 - r2
            r0 = r12 & 3
            if (r0 != 0) goto L2d2
            int r0 = r12 % 100
            if (r0 != 0) goto L2d0
            int r0 = r12 % 400
            if (r0 != 0) goto L2d2
        L2d0:
            r5 = r2
            goto L2d5
        L2d2:
            r2 = 2
            long r5 = r5 - r2
        L2d5:
            r2 = 719528(0xafaa8, double:3.55494E-318)
            long r5 = r5 - r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r5 = r5 * r2
            int r0 = r15 * 3600
            long r2 = (long) r0
            long r5 = r5 + r2
            int r0 = r10 * 60
            long r2 = (long) r0
            long r5 = r5 + r2
            long r2 = (long) r14
            long r5 = r5 + r2
            if (r27 != 0) goto L2ec
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto L2ee
        L2ec:
            r0 = r27
        L2ee:
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r0 == r2) goto L2fc
            java.time.zone.ZoneRules r2 = r0.getRules()
            java.time.zone.ZoneRules r3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r2 != r3) goto L2fb
            goto L2fc
        L2fb:
            r1 = 0
        L2fc:
            if (r1 == 0) goto L308
            r1 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L308
            r11 = 28800(0x7080, float:4.0357E-41)
            goto L334
        L308:
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
            if (r0 == r1) goto L333
            java.lang.String r1 = "UTC"
            java.lang.String r2 = r0.getId()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L319
            goto L333
        L319:
            java.time.LocalDate r1 = java.time.LocalDate.of(r12, r8, r4)
            r3 = 0
            java.time.LocalTime r2 = java.time.LocalTime.of(r15, r10, r14, r3)
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r1, r2)
            java.time.zone.ZoneRules r0 = r0.getRules()
            java.time.ZoneOffset r0 = r0.getOffset(r1)
            int r11 = r0.getTotalSeconds()
            goto L334
        L333:
            r11 = 0
        L334:
            long r0 = (long) r11
            long r5 = r5 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            return r5
        L33a:
            java.lang.String r0 = new java.lang.String
            r3 = 19
            r2 = r25
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            r4 = r16
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L350:
            r2 = r25
            r4 = r16
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L366:
            r2 = r25
            r4 = r16
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L37c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L38b:
            r2 = r25
            r4 = r16
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3a1:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3b0:
            r2 = r25
            r4 = r16
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3c6:
            r2 = r25
        L3c8:
            r4 = r16
            goto L3cd
        L3cb:
            r2 = r0
            goto L3c8
        L3cd:
            java.lang.String r0 = new java.lang.String
            r3 = 19
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r5 = 0
            r1.<init>(r2, r0, r5)
            throw r1
        L3df:
            r2 = r0
            r4 = r14
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
        L3f3:
            r2 = r0
            r4 = r14
            r3 = 19
            r5 = 0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r0)
            r1.<init>(r2, r0, r5)
            throw r1
    }

    public static long parseMillisYMDHMS19(java.lang.String r25, java.time.ZoneId r26) {
            r0 = r25
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            int r1 = r0.length()
            r2 = 19
            r3 = 0
            if (r1 != r2) goto L241
            char r1 = r0.charAt(r3)
            r2 = 1
            char r4 = r0.charAt(r2)
            r5 = 2
            char r6 = r0.charAt(r5)
            r7 = 3
            char r7 = r0.charAt(r7)
            r8 = 4
            char r9 = r0.charAt(r8)
            r10 = 5
            char r10 = r0.charAt(r10)
            r11 = 6
            char r12 = r0.charAt(r11)
            r13 = 7
            char r13 = r0.charAt(r13)
            r14 = 8
            char r14 = r0.charAt(r14)
            r15 = 9
            char r2 = r0.charAt(r15)
            r3 = 10
            char r15 = r0.charAt(r3)
            r11 = 11
            char r8 = r0.charAt(r11)
            r11 = 12
            char r5 = r0.charAt(r11)
            r11 = 13
            char r11 = r0.charAt(r11)
            r3 = 14
            char r3 = r0.charAt(r3)
            r20 = r3
            r3 = 15
            char r3 = r0.charAt(r3)
            r21 = r3
            r3 = 16
            char r3 = r0.charAt(r3)
            r22 = r5
            r5 = 17
            char r5 = r0.charAt(r5)
            r23 = r5
            r5 = 18
            char r5 = r0.charAt(r5)
            r0 = 45
            r24 = r5
            java.lang.String r5 = "illegal input"
            if (r9 != r0) goto L238
            if (r13 != r0) goto L238
            r0 = 32
            if (r15 != r0) goto L238
            r0 = 58
            if (r11 != r0) goto L238
            if (r3 != r0) goto L238
            r0 = 48
            if (r1 < r0) goto L22f
            r3 = 57
            if (r1 > r3) goto L22f
            if (r4 < r0) goto L22f
            if (r4 > r3) goto L22f
            if (r6 < r0) goto L22f
            if (r6 > r3) goto L22f
            if (r7 < r0) goto L22f
            if (r7 > r3) goto L22f
            int r1 = r1 - r0
            int r1 = r1 * 1000
            r9 = 100
            int r1 = p.a.z(r4, r0, r9, r1)
            r4 = 10
            int r1 = p.a.z(r6, r0, r4, r1)
            int r7 = r7 - r0
            int r7 = r7 + r1
            if (r10 < r0) goto L226
            if (r10 > r3) goto L226
            if (r12 < r0) goto L226
            if (r12 > r3) goto L226
            int r10 = r10 - r0
            int r10 = r10 * r4
            int r12 = r12 - r0
            int r12 = r12 + r10
            if (r12 != 0) goto Lca
            if (r7 != 0) goto Lcd
        Lca:
            r1 = 12
            goto Ld2
        Lcd:
            r7 = 0
            r1 = r25
            goto L220
        Ld2:
            if (r12 > r1) goto Lcd
            if (r14 < r0) goto L217
            if (r14 > r3) goto L217
            if (r2 < r0) goto L217
            if (r2 > r3) goto L217
            int r14 = r14 - r0
            r19 = 10
            int r14 = r14 * 10
            int r2 = r2 - r0
            int r2 = r2 + r14
            r1 = 2
            if (r12 == r1) goto Lfa
            r1 = 4
            if (r12 == r1) goto Lf7
            r1 = 6
            if (r12 == r1) goto Lf7
            r1 = 9
            if (r12 == r1) goto Lf7
            r1 = 11
            if (r12 == r1) goto Lf7
            r1 = 31
            goto L10b
        Lf7:
            r1 = 30
            goto L10b
        Lfa:
            r1 = r7 & 3
            if (r1 != 0) goto L109
            int r1 = r7 % 100
            if (r1 != 0) goto L106
            int r1 = r7 % 400
            if (r1 != 0) goto L109
        L106:
            r1 = 29
            goto L10b
        L109:
            r1 = 28
        L10b:
            if (r2 != 0) goto L115
            if (r7 != 0) goto L110
            goto L115
        L110:
            r7 = 0
            r1 = r25
            goto L211
        L115:
            if (r2 > r1) goto L110
            if (r8 < r0) goto L208
            if (r8 > r3) goto L208
            r1 = r22
            if (r1 < r0) goto L208
            if (r1 > r3) goto L208
            int r8 = r8 - r0
            r19 = 10
            int r8 = r8 * 10
            int r1 = r1 - r0
            int r1 = r1 + r8
            r4 = r20
            if (r4 < r0) goto L1ff
            if (r4 > r3) goto L1ff
            r6 = r21
            if (r6 < r0) goto L1ff
            if (r6 > r3) goto L1ff
            int r4 = r4 - r0
            int r4 = r4 * 10
            int r6 = r6 - r0
            int r6 = r6 + r4
            r4 = r23
            if (r4 < r0) goto L1f6
            if (r4 > r3) goto L1f6
            r8 = r24
            if (r8 < r0) goto L1f6
            if (r8 > r3) goto L1f6
            int r5 = r4 + (-48)
            int r5 = r5 * 10
            int r0 = r8 + (-48)
            int r0 = r0 + r5
            if (r7 != 0) goto L156
            if (r12 != 0) goto L156
            if (r2 != 0) goto L156
            r7 = 1970(0x7b2, float:2.76E-42)
            r2 = 1
            r12 = 1
        L156:
            int r3 = r7 * 365
            int r4 = r7 + 3
            r17 = 4
            int r4 = r4 / 4
            int r5 = r7 + 99
            int r5 = r5 / r9
            int r4 = r4 - r5
            int r5 = r7 + 399
            int r5 = r5 / 400
            int r5 = r5 + r4
            int r5 = r5 + r3
            int r3 = r12 * 367
            int r3 = r3 + (-362)
            r18 = 12
            int r3 = r3 / 12
            int r3 = r3 + r5
            int r4 = r2 + (-1)
            int r4 = r4 + r3
            long r3 = (long) r4
            r5 = 2
            if (r12 <= r5) goto L18d
            r8 = 1
            long r8 = r3 - r8
            r5 = r7 & 3
            if (r5 != 0) goto L18a
            int r5 = r7 % 100
            if (r5 != 0) goto L188
            int r5 = r7 % 400
            if (r5 != 0) goto L18a
        L188:
            r3 = r8
            goto L18d
        L18a:
            r8 = 2
            long r3 = r3 - r8
        L18d:
            r8 = 719528(0xafaa8, double:3.55494E-318)
            long r3 = r3 - r8
            r8 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 * r8
            int r5 = r1 * 3600
            long r8 = (long) r5
            long r3 = r3 + r8
            int r5 = r6 * 60
            long r8 = (long) r5
            long r3 = r3 + r8
            long r8 = (long) r0
            long r3 = r3 + r8
            if (r26 != 0) goto L1a4
            java.time.ZoneId r5 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            goto L1a6
        L1a4:
            r5 = r26
        L1a6:
            java.time.ZoneId r8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r5 == r8) goto L1b6
            java.time.zone.ZoneRules r8 = r5.getRules()
            java.time.zone.ZoneRules r9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r8 != r9) goto L1b3
            goto L1b6
        L1b3:
            r16 = 0
            goto L1b8
        L1b6:
            r16 = 1
        L1b8:
            if (r16 == 0) goto L1c4
            r8 = 684900000(0x28d2bea0, double:3.38385561E-315)
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 < 0) goto L1c4
            r0 = 28800(0x7080, float:4.0357E-41)
            goto L1f0
        L1c4:
            java.time.ZoneOffset r8 = java.time.ZoneOffset.UTC
            if (r5 == r8) goto L1ef
            java.lang.String r8 = "UTC"
            java.lang.String r9 = r5.getId()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L1d5
            goto L1ef
        L1d5:
            java.time.LocalDate r2 = java.time.LocalDate.of(r7, r12, r2)
            r7 = 0
            java.time.LocalTime r0 = java.time.LocalTime.of(r1, r6, r0, r7)
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r2, r0)
            java.time.zone.ZoneRules r1 = r5.getRules()
            java.time.ZoneOffset r0 = r1.getOffset(r0)
            int r0 = r0.getTotalSeconds()
            goto L1f0
        L1ef:
            r0 = 0
        L1f0:
            long r0 = (long) r0
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            return r3
        L1f6:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r7 = 0
            r1 = r25
            r0.<init>(r5, r1, r7)
            throw r0
        L1ff:
            r7 = 0
            r1 = r25
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L208:
            r7 = 0
            r1 = r25
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L211:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L217:
            r7 = 0
            r1 = r25
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L220:
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L226:
            r7 = 0
            r1 = r25
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L22f:
            r7 = 0
            r1 = r25
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L238:
            r7 = 0
            r1 = r25
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r0.<init>(r5, r1, r7)
            throw r0
        L241:
            r1 = r0
            r7 = r3
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = "illegal input "
            java.lang.String r2 = r2.concat(r1)
            r0.<init>(r2, r1, r7)
            throw r0
    }

    public static java.time.ZonedDateTime parseZonedDateTime(java.lang.String r1) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r1 = parseZonedDateTime(r1, r0)
            return r1
    }

    public static java.time.ZonedDateTime parseZonedDateTime(java.lang.String r4, java.time.ZoneId r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r1 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r2 = 34
            r3 = 0
            if (r1 < r2) goto L1e
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r1 = r4.getBytes(r1)
            int r2 = r1.length
            java.time.ZonedDateTime r5 = parseZonedDateTime(r1, r3, r2, r5)
            goto L2b
        L1e:
            char[] r1 = r4.toCharArray()
            char[] r2 = r4.toCharArray()
            int r1 = r1.length
            java.time.ZonedDateTime r5 = parseZonedDateTime(r2, r3, r1, r5)
        L2b:
            if (r5 != 0) goto L60
            int r5 = r4.hashCode()
            r1 = -1
            switch(r5) {
                case 48: goto L4c;
                case 3392903: goto L41;
                case 1333954784: goto L36;
                default: goto L35;
            }
        L35:
            goto L56
        L36:
            java.lang.String r5 = "0000-00-00"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L3f
            goto L56
        L3f:
            r1 = 2
            goto L56
        L41:
            java.lang.String r5 = "null"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L4a
            goto L56
        L4a:
            r1 = 1
            goto L56
        L4c:
            java.lang.String r5 = "0"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L55
            goto L56
        L55:
            r1 = r3
        L56:
            switch(r1) {
                case 0: goto L5f;
                case 1: goto L5f;
                case 2: goto L5f;
                default: goto L59;
            }
        L59:
            java.time.format.DateTimeParseException r5 = new java.time.format.DateTimeParseException
            r5.<init>(r4, r4, r3)
            throw r5
        L5f:
            return r0
        L60:
            return r5
    }

    public static java.time.ZonedDateTime parseZonedDateTime(byte[] r1, int r2, int r3) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r1 = parseZonedDateTime(r1, r2, r3, r0)
            return r1
    }

    public static java.time.ZonedDateTime parseZonedDateTime(byte[] r60, int r61, int r62, java.time.ZoneId r63) {
            r0 = r60
            r1 = r61
            r2 = r62
            r3 = r63
            r4 = 0
            if (r0 != 0) goto Lc
            return r4
        Lc:
            if (r2 != 0) goto Lf
            return r4
        Lf:
            r5 = 16
            if (r2 != r5) goto L18
            java.time.ZonedDateTime r0 = parseZonedDateTime16(r0, r1, r3)
            return r0
        L18:
            r5 = 19
            if (r2 >= r5) goto L1d
            return r4
        L1d:
            r6 = r0[r1]
            char r6 = (char) r6
            int r7 = r1 + 1
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r1 + 2
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r1 + 3
            r9 = r0[r9]
            char r10 = (char) r9
            int r11 = r1 + 4
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r1 + 5
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r1 + 6
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r1 + 7
            r14 = r0[r14]
            char r14 = (char) r14
            int r15 = r1 + 8
            r15 = r0[r15]
            char r15 = (char) r15
            int r16 = r1 + 9
            r17 = r4
            r4 = r0[r16]
            char r4 = (char) r4
            int r16 = r1 + 10
            r5 = r0[r16]
            char r5 = (char) r5
            int r16 = r1 + 11
            r19 = r9
            r9 = r0[r16]
            char r9 = (char) r9
            int r16 = r1 + 12
            r1 = r0[r16]
            char r1 = (char) r1
            int r16 = r61 + 13
            r3 = r0[r16]
            char r3 = (char) r3
            int r16 = r61 + 14
            r20 = r4
            r4 = r0[r16]
            char r4 = (char) r4
            int r16 = r61 + 15
            r21 = r15
            r15 = r0[r16]
            char r15 = (char) r15
            int r16 = r61 + 16
            r0 = r60[r16]
            char r0 = (char) r0
            int r16 = r61 + 17
            r22 = r15
            r15 = r60[r16]
            char r15 = (char) r15
            int r16 = r61 + 18
            r23 = r1
            r1 = r60[r16]
            char r1 = (char) r1
            r16 = r1
            r1 = 19
            if (r2 != r1) goto L8f
            r1 = 32
            goto L94
        L8f:
            int r18 = r61 + 19
            r1 = r60[r18]
            char r1 = (char) r1
        L94:
            r18 = 0
            r25 = 48
            switch(r2) {
                case 19: goto L307;
                case 20: goto L307;
                case 21: goto L2e9;
                case 22: goto L2c6;
                case 23: goto L29a;
                case 24: goto L266;
                case 25: goto L22b;
                case 26: goto L1e9;
                case 27: goto L1a0;
                case 28: goto L150;
                case 29: goto Lf9;
                default: goto L9b;
            }
        L9b:
            int r26 = r61 + 20
            r27 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 24
            r31 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 25
            r32 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 26
            r33 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 27
            r34 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 28
            r35 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 29
            r36 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r44 = r6
            r26 = r7
            r37 = r28
            r6 = r29
            r28 = r30
            r38 = r31
            r39 = r32
            r40 = r33
            r41 = r34
            r42 = r35
            r43 = r36
            goto L310
        Lf9:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 24
            r31 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 25
            r32 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 26
            r33 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 27
            r34 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 28
            r35 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r43 = r6
            r26 = r7
            r44 = r18
            r37 = r28
            r6 = r29
            r28 = r30
            r38 = r31
            r39 = r32
            r40 = r33
            r41 = r34
            r42 = r35
            goto L310
        L150:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 24
            r31 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 25
            r32 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 26
            r33 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 27
            r34 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r42 = r6
            r26 = r7
            r44 = r18
            r43 = r25
            r37 = r28
            r6 = r29
            r28 = r30
            r38 = r31
            r39 = r32
            r40 = r33
            r41 = r34
            goto L310
        L1a0:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 24
            r31 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 25
            r32 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 26
            r33 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r41 = r6
            r26 = r7
            r44 = r18
            r42 = r25
            r43 = r42
            r37 = r28
            r6 = r29
            r28 = r30
            r38 = r31
            r39 = r32
            r40 = r33
            goto L310
        L1e9:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 24
            r31 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 25
            r32 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r40 = r6
            r26 = r7
            r44 = r18
            r41 = r25
            r42 = r41
            r43 = r42
            r37 = r28
            r6 = r29
            r28 = r30
            r38 = r31
            r39 = r32
            goto L310
        L22b:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 24
            r31 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r39 = r6
            r26 = r7
            r44 = r18
            r40 = r25
            r41 = r40
            r42 = r41
            r43 = r42
            r37 = r28
            r6 = r29
            r28 = r30
            r38 = r31
            goto L310
        L266:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 23
            r30 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r38 = r6
            r26 = r7
            r44 = r18
            r39 = r25
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r37 = r28
            r6 = r29
            r28 = r30
            goto L310
        L29a:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            int r26 = r61 + 22
            r29 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r26 = r7
            r44 = r18
            r38 = r25
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r37 = r28
            r28 = r6
            r6 = r29
            goto L310
        L2c6:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            int r26 = r61 + 21
            r28 = r6
            r6 = r60[r26]
            char r6 = (char) r6
            r26 = r7
            r44 = r18
            r38 = r25
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r37 = r28
            r28 = r43
            goto L310
        L2e9:
            r27 = r6
            int r6 = r61 + 20
            r6 = r60[r6]
            char r6 = (char) r6
            r37 = r6
            r26 = r7
            r44 = r18
        L2f6:
            r6 = r25
            r28 = r6
            r38 = r28
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            goto L310
        L307:
            r27 = r6
            r26 = r7
            r37 = r18
            r44 = r37
            goto L2f6
        L310:
            r32 = 1
            r7 = 45
            r34 = r6
            r6 = 58
            if (r11 != r7) goto L374
            if (r14 != r7) goto L374
            r7 = 32
            if (r5 == r7) goto L324
            r7 = 84
            if (r5 != r7) goto L374
        L324:
            if (r3 != r6) goto L374
            if (r0 != r6) goto L374
            r7 = 91
            if (r1 == r7) goto L33c
            r7 = 90
            if (r1 == r7) goto L33c
            r7 = 43
            if (r1 == r7) goto L33c
            r7 = 45
            if (r1 == r7) goto L33c
            r7 = 32
            if (r1 != r7) goto L374
        L33c:
            r11 = r60
            r46 = r4
            r38 = r8
            r39 = r10
            r40 = r12
            r41 = r13
            r48 = r15
            r49 = r16
            r3 = r17
            r0 = r18
            r1 = r0
            r43 = r20
            r42 = r21
            r47 = r22
            r4 = r23
            r50 = r25
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r37 = r26
            r36 = r27
            r5 = 19
            r15 = r9
            goto L1016
        L374:
            r7 = 45
            if (r11 != r7) goto L3bf
            if (r14 != r7) goto L3bf
            r7 = 32
            if (r5 != r7) goto L3bf
            if (r9 != r7) goto L3bf
            if (r4 != r6) goto L3bf
            if (r15 != r6) goto L3bf
            r7 = 20
            if (r2 != r7) goto L3c1
            r11 = r60
            r47 = r0
            r49 = r1
            r4 = r3
            r5 = r7
            r38 = r8
            r39 = r10
            r40 = r12
            r41 = r13
            r48 = r16
            r3 = r17
            r0 = r18
            r1 = r0
            r43 = r20
            r42 = r21
            r46 = r22
            r15 = r23
            r50 = r25
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r37 = r26
            r36 = r27
            goto L1016
        L3bf:
            r7 = 20
        L3c1:
            if (r2 != r7) goto L41b
            r7 = 32
            if (r8 != r7) goto L41b
            if (r13 != r7) goto L41b
            if (r9 != r7) goto L41b
            if (r4 != r6) goto L41b
            if (r15 != r6) goto L41b
            int r4 = month(r10, r11, r12)
            if (r4 <= 0) goto L3e0
            int r6 = r4 / 10
            int r6 = r6 + 48
            char r6 = (char) r6
            int r4 = r4 % 10
            int r4 = r4 + 48
            char r4 = (char) r4
            goto L3e3
        L3e0:
            r4 = r25
            r6 = r4
        L3e3:
            r11 = r60
            r47 = r0
            r49 = r1
            r41 = r4
            r39 = r5
            r40 = r6
            r36 = r14
            r48 = r16
            r0 = r18
            r1 = r0
            r38 = r20
            r37 = r21
            r46 = r22
            r15 = r23
            r50 = r25
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r43 = r26
            r42 = r27
            r5 = 20
            r4 = r3
            r3 = r17
            goto L1016
        L41b:
            r7 = 45
            if (r11 != r7) goto L42a
            if (r14 != r7) goto L42a
            r7 = 32
            if (r5 == r7) goto L42e
            r7 = 84
            if (r5 != r7) goto L42a
            goto L42e
        L42a:
            r7 = r34
            goto L491
        L42e:
            if (r3 != r6) goto L42a
            if (r0 != r6) goto L42a
            r7 = 46
            if (r1 != r7) goto L42a
            r7 = 21
            if (r2 == r7) goto L44f
            r7 = r34
            r6 = 91
            if (r7 == r6) goto L44c
            r6 = 43
            if (r7 == r6) goto L44c
            r6 = 45
            if (r7 == r6) goto L44c
            r6 = 90
            if (r7 != r6) goto L491
        L44c:
            r0 = 124(0x7c, float:1.74E-43)
            goto L452
        L44f:
            r7 = r34
            goto L44c
        L452:
            if (r7 != r0) goto L457
            r0 = r32
            goto L459
        L457:
            r0 = r18
        L459:
            r11 = r60
            r1 = r0
            r46 = r4
            r38 = r8
            r39 = r10
            r40 = r12
            r41 = r13
            r48 = r15
            r49 = r16
            r3 = r17
            r0 = r18
            r43 = r20
            r42 = r21
            r47 = r22
            r4 = r23
            r51 = r25
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r36 = r27
            r50 = r37
            r5 = 21
        L48c:
            r15 = r9
            r37 = r26
            goto L1016
        L491:
            r6 = 45
            if (r11 != r6) goto L4a2
            if (r14 != r6) goto L4a2
            r6 = 32
            if (r5 == r6) goto L49f
            r6 = 84
            if (r5 != r6) goto L4a2
        L49f:
            r6 = 58
            goto L4a8
        L4a2:
            r6 = r28
            r28 = r4
            goto L50b
        L4a8:
            if (r3 != r6) goto L4a2
            if (r0 != r6) goto L4a2
            r6 = 46
            if (r1 != r6) goto L4a2
            r6 = 22
            if (r2 == r6) goto L4cb
            r6 = r28
            r28 = r4
            r4 = 91
            if (r6 == r4) goto L4c8
            r4 = 43
            if (r6 == r4) goto L4c8
            r4 = 45
            if (r6 == r4) goto L4c8
            r4 = 90
            if (r6 != r4) goto L50b
        L4c8:
            r0 = 124(0x7c, float:1.74E-43)
            goto L4d0
        L4cb:
            r6 = r28
            r28 = r4
            goto L4c8
        L4d0:
            if (r6 != r0) goto L4d5
            r0 = r32
            goto L4d7
        L4d5:
            r0 = r18
        L4d7:
            r11 = r60
            r1 = r0
            r51 = r7
            r38 = r8
            r39 = r10
            r40 = r12
            r41 = r13
            r48 = r15
            r49 = r16
            r3 = r17
            r0 = r18
            r43 = r20
            r42 = r21
            r47 = r22
            r4 = r23
            r52 = r25
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r36 = r27
            r46 = r28
            r50 = r37
            r5 = 22
            goto L48c
        L50b:
            r4 = 45
            if (r11 != r4) goto L566
            if (r14 != r4) goto L566
            r4 = 32
            if (r5 == r4) goto L519
            r4 = 84
            if (r5 != r4) goto L566
        L519:
            r4 = 58
            if (r3 != r4) goto L566
            r4 = 90
            if (r0 != r4) goto L566
            r4 = 91
            if (r15 != r4) goto L566
            r4 = 93
            if (r7 != r4) goto L566
            r4 = 22
            if (r2 != r4) goto L566
            r11 = r60
            r38 = r8
            r15 = r9
            r39 = r10
            r40 = r12
            r41 = r13
            r3 = r17
            r0 = r18
            r43 = r20
            r42 = r21
            r47 = r22
            r4 = r23
            r48 = r25
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r37 = r26
            r36 = r27
            r46 = r28
            r1 = r32
        L562:
            r5 = 17
            goto L1016
        L566:
            r4 = 22
            if (r2 != r4) goto L606
            r4 = 32
            if (r10 != r4) goto L606
            r52 = r11
            r11 = 44
            if (r12 != r11) goto L5fe
            if (r13 != r4) goto L5fe
            if (r9 != r4) goto L5fe
            r11 = 58
            if (r3 != r11) goto L5fe
            if (r0 != r11) goto L5fe
            if (r1 != r4) goto L5fe
            r4 = r37
            r11 = 65
            if (r4 == r11) goto L58a
            r11 = 80
            if (r4 != r11) goto L58d
        L58a:
            r11 = 77
            goto L596
        L58d:
            r11 = r26
            r26 = r14
            r14 = r11
        L592:
            r11 = 22
            goto L60e
        L596:
            if (r7 != r11) goto L5f7
            r11 = r26
            r26 = r14
            r14 = r11
            r11 = r27
            int r0 = month(r11, r14, r8)
            if (r0 <= 0) goto L5b4
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r0
            r6 = r1
        L5b1:
            r11 = 80
            goto L5b8
        L5b4:
            r6 = r25
            r7 = r6
            goto L5b1
        L5b8:
            if (r4 != r11) goto L5bd
            r0 = r32
            goto L5bf
        L5bd:
            r0 = r18
        L5bf:
            r11 = r60
            r39 = r5
            r40 = r6
            r41 = r7
            r48 = r15
            r49 = r16
            r3 = r17
            r1 = r18
            r38 = r20
            r37 = r21
            r47 = r22
            r4 = r23
            r15 = r25
            r42 = r15
            r50 = r42
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r36 = r26
            r46 = r28
            r43 = r52
            r5 = 22
        L5f3:
            r52 = r58
            goto L1016
        L5f7:
            r59 = r26
            r26 = r14
            r14 = r59
            goto L592
        L5fe:
            r4 = r26
            r26 = r14
            r14 = r4
        L603:
            r4 = r37
            goto L592
        L606:
            r4 = r26
            r26 = r14
            r14 = r4
            r52 = r11
            goto L603
        L60e:
            if (r2 != r11) goto L631
            r11 = 47
            if (r8 != r11) goto L631
            if (r12 != r11) goto L631
            r11 = 32
            if (r5 != r11) goto L631
            r11 = 58
            if (r3 != r11) goto L631
            if (r0 != r11) goto L631
            r11 = 32
            if (r1 != r11) goto L631
            r11 = 65
            if (r4 == r11) goto L634
            r11 = 80
            if (r4 != r11) goto L631
        L62c:
            r37 = r1
            r1 = 77
            goto L637
        L631:
            r37 = r1
            goto L675
        L634:
            r11 = 80
            goto L62c
        L637:
            if (r7 != r1) goto L675
            if (r4 != r11) goto L63e
            r0 = r32
            goto L640
        L63e:
            r0 = r18
        L640:
            r11 = r60
            r42 = r10
            r36 = r13
            r41 = r14
            r48 = r15
            r49 = r16
            r3 = r17
            r1 = r18
            r39 = r20
            r38 = r21
            r47 = r22
            r4 = r23
            r50 = r25
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r37 = r26
            r40 = r27
            r46 = r28
            r43 = r52
            r5 = 22
            r15 = r9
            goto L5f3
        L675:
            r1 = 23
            if (r2 != r1) goto L6fd
            r11 = 32
            if (r10 != r11) goto L6fd
            r1 = 44
            if (r12 != r1) goto L6fd
            if (r13 != r11) goto L6fd
            if (r9 != r11) goto L6fd
            r1 = r28
            r11 = 58
            if (r1 != r11) goto L69c
            if (r15 != r11) goto L69c
            r11 = 32
            if (r4 != r11) goto L69c
            r11 = 65
            if (r7 == r11) goto L699
            r11 = 80
            if (r7 != r11) goto L69c
        L699:
            r11 = 77
            goto L6a4
        L69c:
            r11 = r27
        L69e:
            r27 = r0
            r0 = 23
            goto L702
        L6a4:
            if (r6 != r11) goto L69c
            r11 = r27
            int r1 = month(r11, r14, r8)
            if (r1 <= 0) goto L6bc
            int r4 = r1 / 10
            int r4 = r4 + 48
            char r4 = (char) r4
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r1 = (char) r1
            r6 = r4
        L6b9:
            r11 = 80
            goto L6c0
        L6bc:
            r1 = r25
            r6 = r1
            goto L6b9
        L6c0:
            if (r7 != r11) goto L6c5
            r4 = r32
            goto L6c7
        L6c5:
            r4 = r18
        L6c7:
            r11 = r60
            r47 = r0
            r41 = r1
            r0 = r4
            r39 = r5
            r40 = r6
            r48 = r16
            r1 = r18
            r38 = r20
            r46 = r22
            r15 = r23
            r42 = r25
            r50 = r42
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r36 = r26
            r49 = r37
            r43 = r52
            r5 = 23
            r4 = r3
            r3 = r17
        L6f9:
            r37 = r21
            goto L5f3
        L6fd:
            r11 = r27
            r1 = r28
            goto L69e
        L702:
            if (r2 != r0) goto L790
            r0 = 32
            r28 = r5
            if (r10 != r0) goto L789
            r5 = 44
            if (r13 != r5) goto L789
            r5 = r26
            r26 = r3
            r3 = r23
            if (r5 != r0) goto L72d
            if (r3 != r0) goto L72d
            r0 = 58
            if (r1 != r0) goto L72d
            if (r15 != r0) goto L72d
            r0 = 32
            if (r4 != r0) goto L72d
            r0 = 65
            if (r7 == r0) goto L72a
            r0 = 80
            if (r7 != r0) goto L72d
        L72a:
            r0 = 77
            goto L731
        L72d:
            r0 = 23
            goto L798
        L731:
            if (r6 != r0) goto L72d
            int r0 = month(r11, r14, r8)
            if (r0 <= 0) goto L747
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r6 = r1
        L744:
            r11 = 80
            goto L74b
        L747:
            r0 = r25
            r6 = r0
            goto L744
        L74b:
            if (r7 != r11) goto L750
            r1 = r32
            goto L752
        L750:
            r1 = r18
        L752:
            r11 = r60
            r41 = r0
            r0 = r1
            r40 = r6
            r39 = r9
            r43 = r12
            r48 = r16
            r3 = r17
            r1 = r18
            r36 = r21
            r46 = r22
            r15 = r25
            r50 = r15
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r4 = r26
            r47 = r27
            r38 = r28
            r49 = r37
            r42 = r52
            r5 = 23
        L785:
            r37 = r20
            goto L5f3
        L789:
            r5 = r26
            r26 = r3
            r3 = r23
            goto L72d
        L790:
            r28 = r5
            r5 = r26
            r26 = r3
            r3 = r23
        L798:
            if (r2 != r0) goto L812
            r0 = 32
            if (r10 != r0) goto L812
            r23 = r5
            r5 = 44
            if (r12 != r5) goto L814
            if (r13 != r0) goto L814
            if (r9 != r5) goto L814
            if (r3 != r0) goto L814
            r5 = 58
            if (r1 != r5) goto L814
            if (r15 != r5) goto L814
            if (r4 != r0) goto L814
            r0 = 65
            if (r7 == r0) goto L7ba
            r0 = 80
            if (r7 != r0) goto L814
        L7ba:
            r0 = 77
            if (r6 != r0) goto L814
            int r0 = month(r11, r14, r8)
            if (r0 <= 0) goto L7d2
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r6 = r1
        L7cf:
            r11 = 80
            goto L7d6
        L7d2:
            r0 = r25
            r6 = r0
            goto L7cf
        L7d6:
            if (r7 != r11) goto L7db
            r1 = r32
            goto L7dd
        L7db:
            r1 = r18
        L7dd:
            r11 = r60
            r41 = r0
            r0 = r1
            r40 = r6
            r48 = r16
            r3 = r17
            r1 = r18
            r38 = r20
            r46 = r22
            r36 = r23
            r15 = r25
            r42 = r15
            r50 = r42
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r4 = r26
            r47 = r27
            r39 = r28
            r49 = r37
            r43 = r52
            r5 = 23
            goto L6f9
        L812:
            r23 = r5
        L814:
            r0 = 24
            if (r2 != r0) goto L8b2
            r5 = 32
            if (r10 != r5) goto L8b2
            r0 = 44
            if (r13 != r0) goto L8b2
            r0 = r23
            if (r0 != r5) goto L8a9
            if (r3 != r5) goto L8a9
            r5 = r22
            r22 = r4
            r4 = 58
            r23 = r1
            r1 = r16
            if (r5 != r4) goto L8a4
            if (r1 != r4) goto L847
            r4 = 32
            if (r7 != r4) goto L847
            r4 = 65
            if (r6 == r4) goto L840
            r4 = 80
            if (r6 != r4) goto L847
        L840:
            r16 = r15
            r4 = r38
            r15 = 77
            goto L84f
        L847:
            r16 = r15
            r4 = r38
        L84b:
            r15 = 24
            goto L8bd
        L84f:
            if (r4 != r15) goto L84b
            int r0 = month(r11, r14, r8)
            if (r0 <= 0) goto L865
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r0
        L862:
            r11 = 80
            goto L869
        L865:
            r1 = r25
            r7 = r1
            goto L862
        L869:
            if (r6 != r11) goto L86e
            r0 = r32
            goto L870
        L86e:
            r0 = r18
        L870:
            r11 = r60
            r40 = r1
            r41 = r7
            r39 = r9
            r43 = r12
            r47 = r16
            r3 = r17
            r1 = r18
            r36 = r21
            r49 = r22
            r4 = r23
            r50 = r25
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r15 = r26
            r46 = r27
            r38 = r28
            r48 = r37
            r42 = r52
            r5 = 24
            goto L785
        L8a4:
            r4 = r38
            r16 = r15
            goto L84b
        L8a9:
            r23 = r1
            r1 = r16
            r5 = r22
            r22 = r4
            goto L847
        L8b2:
            r5 = r22
            r0 = r23
            r23 = r1
            r22 = r4
            r1 = r16
            goto L8a4
        L8bd:
            if (r2 != r15) goto L946
            r15 = 32
            r38 = r9
            if (r10 != r15) goto L943
            r9 = 44
            if (r13 != r9) goto L943
            if (r0 != r15) goto L943
            if (r3 != r9) goto L943
            r9 = r26
            if (r9 != r15) goto L8e6
            r15 = 58
            if (r5 != r15) goto L8e6
            if (r1 != r15) goto L8e6
            r15 = 32
            if (r7 != r15) goto L8e6
            r15 = 65
            if (r6 == r15) goto L8e3
            r15 = 80
            if (r6 != r15) goto L8e6
        L8e3:
            r15 = 77
            goto L8ea
        L8e6:
            r15 = 24
            goto L94a
        L8ea:
            if (r4 != r15) goto L8e6
            int r0 = month(r11, r14, r8)
            if (r0 <= 0) goto L900
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r0
        L8fd:
            r11 = 80
            goto L904
        L900:
            r1 = r25
            r7 = r1
            goto L8fd
        L904:
            if (r6 != r11) goto L909
            r0 = r32
            goto L90b
        L909:
            r0 = r18
        L90b:
            r11 = r60
            r40 = r1
            r41 = r7
            r43 = r12
            r47 = r16
            r3 = r17
            r1 = r18
            r36 = r21
            r49 = r22
            r4 = r23
            r15 = r25
            r50 = r15
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r46 = r27
            r48 = r37
            r39 = r38
            r42 = r52
            r5 = 24
            r37 = r20
            r52 = r58
            r38 = r28
            goto L1016
        L943:
            r9 = r26
            goto L8e6
        L946:
            r38 = r9
            r9 = r26
        L94a:
            if (r2 != r15) goto L9d3
            r15 = 32
            if (r10 != r15) goto L9d3
            r26 = r10
            r10 = 44
            if (r12 != r10) goto L9ce
            if (r13 != r15) goto L9ce
            r55 = r12
            r12 = r38
            if (r12 != r10) goto L973
            if (r3 != r15) goto L973
            r10 = 58
            if (r5 != r10) goto L973
            if (r1 != r10) goto L973
            if (r7 != r15) goto L973
            r15 = 65
            if (r6 == r15) goto L970
            r15 = 80
            if (r6 != r15) goto L973
        L970:
            r15 = 77
            goto L979
        L973:
            r10 = r52
            r15 = 45
            goto L9d6
        L979:
            if (r4 != r15) goto L973
            int r1 = month(r11, r14, r8)
            if (r1 <= 0) goto L98f
            int r3 = r1 / 10
            int r3 = r3 + 48
            char r3 = (char) r3
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r1 = (char) r1
            r7 = r1
        L98c:
            r11 = 80
            goto L993
        L98f:
            r3 = r25
            r7 = r3
            goto L98c
        L993:
            if (r6 != r11) goto L998
            r1 = r32
            goto L99a
        L998:
            r1 = r18
        L99a:
            r11 = r60
            r36 = r0
            r0 = r1
            r40 = r3
            r41 = r7
            r15 = r9
            r47 = r16
            r3 = r17
            r1 = r18
            r38 = r20
            r49 = r22
            r4 = r23
            r42 = r25
            r50 = r42
            r51 = r50
            r53 = r51
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r46 = r27
            r39 = r28
            r48 = r37
            r43 = r52
            r5 = 24
            goto L6f9
        L9ce:
            r55 = r12
            r12 = r38
            goto L973
        L9d3:
            r26 = r10
            goto L9ce
        L9d6:
            if (r10 != r15) goto La63
            if (r0 != r15) goto La63
            r38 = r12
            r15 = r28
            r12 = 32
            if (r15 == r12) goto L9e6
            r12 = 84
            if (r15 != r12) goto L9e9
        L9e6:
            r12 = 58
            goto L9f5
        L9e9:
            r28 = r7
            r7 = r27
            r12 = r37
        L9ef:
            r27 = r1
        L9f1:
            r1 = 45
            goto La6e
        L9f5:
            if (r9 != r12) goto L9e9
            r28 = r7
            r7 = r27
            r27 = r1
            if (r7 != r12) goto La60
            r12 = r37
            r1 = 46
            if (r12 != r1) goto L9f1
            r1 = 23
            if (r2 == r1) goto La1d
            r1 = 91
            if (r4 == r1) goto La1d
            r1 = 124(0x7c, float:1.74E-43)
            if (r4 == r1) goto La20
            r1 = 43
            if (r4 == r1) goto La1d
            r1 = 45
            if (r4 == r1) goto La1d
            r1 = 90
            if (r4 != r1) goto L9f1
        La1d:
            r0 = 124(0x7c, float:1.74E-43)
            goto La21
        La20:
            r0 = r1
        La21:
            if (r4 != r0) goto La26
            r0 = r32
            goto La28
        La26:
            r0 = r18
        La28:
            r1 = r0
            r4 = r3
            r47 = r5
            r52 = r6
            r36 = r11
            r41 = r13
            r37 = r14
            r48 = r16
            r3 = r17
            r0 = r18
            r43 = r20
            r42 = r21
            r50 = r22
            r46 = r23
            r53 = r25
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r39 = r26
            r49 = r27
            r51 = r28
            r15 = r38
            r40 = r55
            r5 = 23
            r11 = r60
            r38 = r8
        La5c:
            r55 = r58
            goto L1016
        La60:
            r12 = r37
            goto L9f1
        La63:
            r38 = r12
            r15 = r28
            r12 = r37
            r28 = r7
            r7 = r27
            goto L9ef
        La6e:
            if (r10 != r1) goto La7d
            if (r0 != r1) goto La7d
            r1 = 32
            if (r15 == r1) goto La7a
            r1 = 84
            if (r15 != r1) goto La7d
        La7a:
            r1 = 58
            goto La83
        La7d:
            r37 = r5
            r1 = r39
            goto Laec
        La83:
            if (r9 != r1) goto La7d
            if (r7 != r1) goto La7d
            r1 = 46
            if (r12 != r1) goto La7d
            r1 = 24
            r37 = r5
            if (r2 == r1) goto Laac
            r1 = r39
            r5 = 91
            if (r1 == r5) goto Laa7
            r5 = 124(0x7c, float:1.74E-43)
            if (r1 == r5) goto Laaa
            r5 = 43
            if (r1 == r5) goto Laa7
            r5 = 45
            if (r1 == r5) goto Laa7
            r5 = 90
            if (r1 != r5) goto Laec
        Laa7:
            r0 = 124(0x7c, float:1.74E-43)
            goto Laaf
        Laaa:
            r0 = r5
            goto Laaf
        Laac:
            r1 = r39
            goto Laa7
        Laaf:
            if (r1 != r0) goto Lab4
            r0 = r32
            goto Lab6
        Lab4:
            r0 = r18
        Lab6:
            r1 = r0
            r53 = r4
            r52 = r6
            r36 = r11
            r41 = r13
            r48 = r16
            r0 = r18
            r43 = r20
            r42 = r21
            r50 = r22
            r46 = r23
            r54 = r25
            r56 = r54
            r57 = r56
            r58 = r57
            r39 = r26
            r49 = r27
            r51 = r28
            r47 = r37
            r15 = r38
            r40 = r55
            r5 = 24
            r11 = r60
            r4 = r3
            r38 = r8
            r37 = r14
            r3 = r17
            goto La5c
        Laec:
            r5 = 45
            if (r10 != r5) goto Lafd
            if (r0 != r5) goto Lafd
            r5 = 32
            if (r15 == r5) goto Lafa
            r5 = 84
            if (r15 != r5) goto Lafd
        Lafa:
            r5 = 58
            goto Lb05
        Lafd:
            r5 = r40
            r40 = r15
        Lb01:
            r15 = 25
            goto Lb6e
        Lb05:
            if (r9 != r5) goto Lafd
            if (r7 != r5) goto Lafd
            r5 = 46
            if (r12 != r5) goto Lafd
            r5 = 25
            if (r2 == r5) goto Lb2e
            r5 = r40
            r40 = r15
            r15 = 91
            if (r5 == r15) goto Lb29
            r15 = 124(0x7c, float:1.74E-43)
            if (r5 == r15) goto Lb2c
            r15 = 43
            if (r5 == r15) goto Lb29
            r15 = 45
            if (r5 == r15) goto Lb29
            r15 = 90
            if (r5 != r15) goto Lb01
        Lb29:
            r0 = 124(0x7c, float:1.74E-43)
            goto Lb31
        Lb2c:
            r0 = r15
            goto Lb31
        Lb2e:
            r5 = r40
            goto Lb29
        Lb31:
            if (r5 != r0) goto Lb36
            r0 = r32
            goto Lb38
        Lb36:
            r0 = r18
        Lb38:
            r54 = r1
            r53 = r4
            r52 = r6
            r36 = r11
            r41 = r13
            r48 = r16
            r43 = r20
            r42 = r21
            r50 = r22
            r46 = r23
            r56 = r25
            r57 = r56
            r58 = r57
            r39 = r26
            r49 = r27
            r51 = r28
            r47 = r37
            r15 = r38
            r40 = r55
            r5 = 25
            r11 = r60
            r1 = r0
            r4 = r3
            r38 = r8
            r37 = r14
            r3 = r17
            r0 = r18
            goto La5c
        Lb6e:
            if (r2 != r15) goto Lbf3
            r15 = r26
            r26 = r5
            r5 = 32
            r52 = r15
            if (r15 != r5) goto Lb97
            r15 = 44
            if (r13 != r15) goto Lb97
            if (r0 != r5) goto Lb97
            if (r3 != r15) goto Lb97
            if (r9 != r5) goto Lb97
            r15 = 58
            if (r7 != r15) goto Lb97
            if (r12 != r15) goto Lb97
            if (r6 != r5) goto Lb97
            r15 = 65
            if (r4 == r15) goto Lb94
            r15 = 80
            if (r4 != r15) goto Lb97
        Lb94:
            r15 = 77
            goto Lb9b
        Lb97:
            r15 = 45
            goto Lbf8
        Lb9b:
            if (r1 != r15) goto Lb97
            int r0 = month(r11, r14, r8)
            if (r0 <= 0) goto Lbb2
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r0
            r6 = r1
        Lbaf:
            r11 = 80
            goto Lbb6
        Lbb2:
            r6 = r25
            r7 = r6
            goto Lbaf
        Lbb6:
            if (r4 != r11) goto Lbbb
            r0 = r32
            goto Lbbd
        Lbbb:
            r0 = r18
        Lbbd:
            r11 = r60
            r41 = r7
            r42 = r10
            r46 = r16
            r3 = r17
            r1 = r18
            r36 = r21
            r48 = r22
            r15 = r23
            r50 = r25
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r47 = r27
            r49 = r28
            r4 = r37
            r39 = r38
            r38 = r40
            r43 = r55
            r5 = 25
            r40 = r6
            r37 = r20
            goto La5c
        Lbf3:
            r52 = r26
            r26 = r5
            goto Lb97
        Lbf8:
            if (r10 != r15) goto Lc7e
            if (r0 != r15) goto Lc7e
            r15 = r40
            r5 = 32
            if (r15 == r5) goto Lc06
            r5 = 84
            if (r15 != r5) goto Lc09
        Lc06:
            r5 = 58
            goto Lc11
        Lc09:
            r5 = r41
            r41 = r8
        Lc0d:
            r8 = 45
            goto Lc81
        Lc11:
            if (r9 != r5) goto Lc09
            if (r7 != r5) goto Lc09
            r5 = 46
            if (r12 != r5) goto Lc09
            r5 = 26
            if (r2 == r5) goto Lc3a
            r5 = r41
            r41 = r8
            r8 = 91
            if (r5 == r8) goto Lc35
            r8 = 124(0x7c, float:1.74E-43)
            if (r5 == r8) goto Lc38
            r8 = 43
            if (r5 == r8) goto Lc35
            r8 = 45
            if (r5 == r8) goto Lc35
            r8 = 90
            if (r5 != r8) goto Lc0d
        Lc35:
            r0 = 124(0x7c, float:1.74E-43)
            goto Lc3f
        Lc38:
            r0 = r8
            goto Lc3f
        Lc3a:
            r5 = r41
            r41 = r8
            goto Lc35
        Lc3f:
            if (r5 != r0) goto Lc44
            r0 = r32
            goto Lc46
        Lc44:
            r0 = r18
        Lc46:
            r54 = r1
            r53 = r4
            r36 = r11
            r48 = r16
            r43 = r20
            r42 = r21
            r50 = r22
            r46 = r23
            r56 = r25
            r57 = r56
            r58 = r57
            r49 = r27
            r51 = r28
            r47 = r37
            r15 = r38
            r38 = r41
            r39 = r52
            r40 = r55
            r5 = 26
            r11 = r60
            r1 = r0
            r4 = r3
            r52 = r6
            r41 = r13
            r37 = r14
            r3 = r17
            r0 = r18
        Lc7a:
            r55 = r26
            goto L1016
        Lc7e:
            r15 = r40
            goto Lc09
        Lc81:
            if (r10 != r8) goto Lc90
            if (r0 != r8) goto Lc90
            r8 = 32
            if (r15 == r8) goto Lc8d
            r8 = 84
            if (r15 != r8) goto Lc90
        Lc8d:
            r8 = 58
            goto Lc96
        Lc90:
            r8 = r42
            r42 = r11
            goto Ld39
        Lc96:
            if (r9 != r8) goto Lc90
            if (r7 != r8) goto Lc90
            r8 = 46
            if (r12 != r8) goto Lc90
            r8 = 27
            if (r2 == r8) goto Lcbd
            r8 = r42
            r42 = r11
            r11 = 91
            if (r8 == r11) goto Lcba
            r11 = 124(0x7c, float:1.74E-43)
            if (r8 == r11) goto Lcba
            r11 = 43
            if (r8 == r11) goto Lcba
            r11 = 45
            if (r8 == r11) goto Lcba
            r11 = 90
            if (r8 != r11) goto Ld39
        Lcba:
            r7 = 32
            goto Lcc2
        Lcbd:
            r8 = r42
            r42 = r11
            goto Lcba
        Lcc2:
            if (r4 != r7) goto Lcfa
            r11 = r60
            r4 = r3
            r48 = r16
            r3 = r17
            r0 = r18
            r1 = r0
            r43 = r20
            r50 = r22
            r46 = r23
            r53 = r25
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r49 = r27
            r51 = r28
            r47 = r37
            r15 = r38
            r38 = r41
            r36 = r42
            r39 = r52
            r40 = r55
            r5 = 23
            r52 = r6
            r41 = r13
            r37 = r14
            r42 = r21
            goto La5c
        Lcfa:
            r0 = 124(0x7c, float:1.74E-43)
            if (r8 != r0) goto Ld01
            r0 = r32
            goto Ld03
        Ld01:
            r0 = r18
        Ld03:
            r11 = r60
            r54 = r1
            r53 = r4
            r56 = r5
            r48 = r16
            r43 = r20
            r50 = r22
            r46 = r23
            r57 = r25
            r58 = r57
            r49 = r27
            r51 = r28
            r47 = r37
            r15 = r38
            r38 = r41
            r36 = r42
            r39 = r52
            r40 = r55
            r5 = 27
            r1 = r0
            r4 = r3
            r52 = r6
            r41 = r13
            r37 = r14
            r3 = r17
            r0 = r18
        Ld35:
            r42 = r21
            goto Lc7a
        Ld39:
            r11 = 45
            if (r10 != r11) goto Ld4a
            if (r0 != r11) goto Ld4a
            r11 = 32
            if (r15 == r11) goto Ld47
            r11 = 84
            if (r15 != r11) goto Ld4a
        Ld47:
            r11 = 58
            goto Ld52
        Ld4a:
            r11 = r43
            r43 = r14
        Ld4e:
            r14 = 28
            goto Ldbb
        Ld52:
            if (r9 != r11) goto Ld4a
            if (r7 != r11) goto Ld4a
            r11 = 46
            if (r12 != r11) goto Ld4a
            r11 = 28
            if (r2 == r11) goto Ld7b
            r11 = r43
            r43 = r14
            r14 = 91
            if (r11 == r14) goto Ld76
            r14 = 124(0x7c, float:1.74E-43)
            if (r11 == r14) goto Ld79
            r14 = 43
            if (r11 == r14) goto Ld76
            r14 = 45
            if (r11 == r14) goto Ld76
            r14 = 90
            if (r11 != r14) goto Ld4e
        Ld76:
            r0 = 124(0x7c, float:1.74E-43)
            goto Ld80
        Ld79:
            r0 = r14
            goto Ld80
        Ld7b:
            r11 = r43
            r43 = r14
            goto Ld76
        Ld80:
            if (r11 != r0) goto Ld85
            r0 = r32
            goto Ld87
        Ld85:
            r0 = r18
        Ld87:
            r11 = r60
            r54 = r1
            r53 = r4
            r56 = r5
            r57 = r8
            r48 = r16
            r50 = r22
            r46 = r23
            r58 = r25
            r49 = r27
            r51 = r28
            r47 = r37
            r15 = r38
            r38 = r41
            r36 = r42
            r37 = r43
            r39 = r52
            r40 = r55
            r5 = 28
            r1 = r0
            r4 = r3
            r52 = r6
            r41 = r13
            r3 = r17
            r0 = r18
            r43 = r20
            goto Ld35
        Ldbb:
            r48 = r11
            if (r2 != r14) goto Le34
            r14 = r52
            r11 = 32
            if (r14 != r11) goto Le2d
            if (r0 != r11) goto Le2d
            if (r15 != r11) goto Le2d
            r11 = 58
            if (r9 != r11) goto Le2d
            if (r7 != r11) goto Le2d
            r11 = 32
            if (r12 != r11) goto Le2d
            if (r4 != r11) goto Le2d
            r11 = r55
            int r0 = month(r10, r11, r13)
            if (r0 <= 0) goto Ldea
            int r4 = r0 / 10
            int r4 = r4 + 48
            char r4 = (char) r4
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r0
            r6 = r4
            goto Lded
        Ldea:
            r6 = r25
            r7 = r6
        Lded:
            java.lang.String r0 = new java.lang.String
            int r4 = r61 + 20
            r9 = 3
            r10 = r60
            r0.<init>(r10, r4, r9)
            r36 = r1
            r4 = r3
            r40 = r6
            r41 = r7
            r39 = r8
            r11 = r10
            r48 = r16
            r1 = r18
            r43 = r20
            r42 = r21
            r46 = r23
            r50 = r25
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r49 = r27
            r47 = r37
            r15 = r38
            r3 = r0
            r38 = r5
            r0 = r1
            r37 = r26
            r5 = 19
            goto L1016
        Le2d:
            r11 = r60
            r24 = r8
            r8 = 28
            goto Le37
        Le34:
            r14 = r52
            goto Le2d
        Le37:
            if (r2 != r8) goto Lecb
            r8 = 44
            if (r14 != r8) goto Lecb
            r8 = 32
            if (r10 != r8) goto Lecb
            if (r13 != r8) goto Lecb
            if (r15 != r8) goto Lecb
            r40 = r3
            r3 = r37
            if (r3 != r8) goto Lec0
            r8 = r27
            r27 = r5
            r5 = 58
            if (r8 != r5) goto Leb6
            r37 = r8
            r8 = r28
            if (r8 != r5) goto Leac
            r5 = 32
            if (r1 != r5) goto Leac
            r1 = r20
            r5 = r21
            int r0 = month(r0, r5, r1)
            if (r0 <= 0) goto Le72
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            goto Le75
        Le72:
            r0 = r25
            r1 = r0
        Le75:
            r41 = r0
            r49 = r4
            r48 = r6
            r15 = r7
            r46 = r12
            r4 = r16
            r3 = r17
            r0 = r18
            r47 = r22
            r39 = r23
            r42 = r25
            r50 = r42
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r36 = r38
            r37 = r40
            r43 = r55
            r5 = 24
            r40 = r1
            r38 = r9
            r55 = r58
            r1 = r32
            goto L1016
        Leac:
            r5 = r20
            r20 = r1
            r1 = r5
            r5 = r21
            r28 = r8
            goto Led6
        Leb6:
            r5 = r20
            r20 = r1
            r1 = r5
            r37 = r8
        Lebd:
            r5 = r21
            goto Led6
        Lec0:
            r37 = r20
            r20 = r1
            r1 = r37
        Lec6:
            r37 = r27
            r27 = r5
            goto Lebd
        Lecb:
            r40 = r20
            r20 = r1
            r1 = r40
            r40 = r3
            r3 = r37
            goto Lec6
        Led6:
            r8 = 29
            if (r2 != r8) goto Lf4e
            r8 = 44
            if (r14 != r8) goto Lf4e
            r8 = 32
            if (r10 != r8) goto Lf4e
            if (r0 != r8) goto Lf4e
            r52 = r14
            r14 = r38
            if (r14 != r8) goto Lf49
            if (r7 != r8) goto Lf49
            r8 = 58
            if (r12 != r8) goto Lf49
            if (r6 != r8) goto Lf49
            r8 = r26
            r26 = r4
            r4 = 32
            if (r8 != r4) goto Lf46
            int r0 = month(r5, r1, r15)
            if (r0 <= 0) goto Lf0d
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r0
            r6 = r1
            goto Lf10
        Lf0d:
            r6 = r25
            r7 = r6
        Lf10:
            r39 = r3
            r41 = r7
            r43 = r13
            r15 = r16
            r3 = r17
            r0 = r18
            r49 = r20
            r46 = r22
            r38 = r23
            r50 = r25
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r48 = r26
            r47 = r28
            r1 = r32
            r4 = r37
            r36 = r40
            r42 = r55
            r5 = 25
            r40 = r6
            r37 = r9
            goto La5c
        Lf46:
            r4 = 45
            goto Lf55
        Lf49:
            r8 = r26
        Lf4b:
            r26 = r4
            goto Lf46
        Lf4e:
            r52 = r14
            r8 = r26
            r14 = r38
            goto Lf4b
        Lf55:
            if (r10 != r4) goto Lf64
            if (r0 != r4) goto Lf64
            r4 = 32
            if (r15 == r4) goto Lf61
            r4 = 84
            if (r15 != r4) goto Lf64
        Lf61:
            r4 = 58
            goto Lf6a
        Lf64:
            r29 = r10
        Lf66:
            r4 = 22
            goto Lfd2
        Lf6a:
            if (r9 != r4) goto Lf64
            if (r7 != r4) goto Lf64
            r4 = 46
            if (r12 != r4) goto Lf64
            r4 = 29
            if (r2 == r4) goto Lf93
            r29 = r10
            r4 = r44
            r10 = 91
            if (r4 == r10) goto Lf8e
            r10 = 124(0x7c, float:1.74E-43)
            if (r4 == r10) goto Lf91
            r10 = 43
            if (r4 == r10) goto Lf8e
            r10 = 45
            if (r4 == r10) goto Lf8e
            r10 = 90
            if (r4 != r10) goto Lf66
        Lf8e:
            r0 = 124(0x7c, float:1.74E-43)
            goto Lf96
        Lf91:
            r0 = r10
            goto Lf96
        Lf93:
            r4 = r44
            goto Lf8e
        Lf96:
            if (r4 != r0) goto Lf9b
            r0 = r32
            goto Lf9d
        Lf9b:
            r0 = r18
        Lf9d:
            r47 = r3
            r15 = r14
            r3 = r17
            r54 = r20
            r50 = r22
            r46 = r23
            r57 = r24
            r53 = r26
            r56 = r27
            r51 = r28
            r49 = r37
            r4 = r40
            r38 = r41
            r36 = r42
            r37 = r43
            r58 = r48
            r39 = r52
            r40 = r55
            r43 = r1
            r42 = r5
            r52 = r6
            r55 = r8
            r41 = r13
            r48 = r16
            r5 = 29
            r1 = r0
            r0 = r18
            goto L1016
        Lfd2:
            if (r2 != r4) goto L10b5
            r4 = r16
            r10 = 43
            if (r4 == r10) goto Lfe3
            r10 = 45
            if (r4 != r10) goto Lfdf
            goto Lfe3
        Lfdf:
            r10 = 32
            goto L10b9
        Lfe3:
            r4 = r1
            r51 = r3
            r49 = r9
            r47 = r14
            r46 = r15
            r3 = r17
            r1 = r18
            r50 = r23
            r53 = r25
            r54 = r53
            r56 = r54
            r57 = r56
            r58 = r57
            r48 = r40
            r38 = r41
            r36 = r42
            r37 = r43
            r39 = r52
            r41 = r55
            r43 = r0
            r15 = r5
            r52 = r7
            r42 = r13
            r0 = r1
            r55 = r58
            r40 = r29
            goto L562
        L1016:
            if (r0 == 0) goto L1021
            r6 = 49
            if (r15 != r6) goto L1021
            r6 = 50
            if (r4 != r6) goto L1021
            goto L1023
        L1021:
            r18 = r0
        L1023:
            if (r18 == 0) goto L102e
            int r0 = hourAfterNoon(r15, r4)
            int r4 = r0 >> 16
            char r15 = (char) r4
            short r0 = (short) r0
            char r4 = (char) r0
        L102e:
            r45 = r4
            r44 = r15
            java.time.LocalDateTime r0 = localDateTime(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            if (r0 != 0) goto L1039
            return r17
        L1039:
            if (r1 == 0) goto L1060
            java.lang.String r1 = new java.lang.String
            int r2 = r2 - r5
            r1.<init>(r11, r5, r2)
            java.lang.String r2 = "UTC"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L105a
            java.lang.String r2 = "[UTC]"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L105a
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            java.time.ZoneId r1 = r1.toZoneId()
            goto L105c
        L105a:
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
        L105c:
            r2 = r1
            r1 = r63
            goto L10a6
        L1060:
            if (r5 != r2) goto L1066
            r1 = r63
            r2 = r1
            goto L10a6
        L1066:
            int r1 = r61 + r5
            r4 = r11[r1]
            char r4 = (char) r4
            r14 = 90
            if (r4 != r14) goto L1072
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
            goto L105c
        L1072:
            if (r3 != 0) goto L108b
            r10 = 43
            if (r4 == r10) goto L109b
            r15 = 45
            if (r4 != r15) goto L107d
            goto L109b
        L107d:
            r7 = 32
            if (r4 != r7) goto L108e
            java.lang.String r3 = new java.lang.String
            int r1 = r1 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            r3.<init>(r11, r1, r2)
        L108b:
            r1 = r63
            goto L10a2
        L108e:
            if (r5 >= r2) goto L108b
            java.lang.String r3 = new java.lang.String
            int r1 = r1 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-2)
            r3.<init>(r11, r1, r2)
            goto L108b
        L109b:
            java.lang.String r3 = new java.lang.String
            int r2 = r2 - r5
            r3.<init>(r11, r1, r2)
            goto L108b
        L10a2:
            java.time.ZoneId r2 = getZoneId(r3, r1)
        L10a6:
            if (r2 != 0) goto L10a9
            goto L10aa
        L10a9:
            r1 = r2
        L10aa:
            if (r1 != 0) goto L10ae
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
        L10ae:
            r2 = r17
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r0, r1, r2)
            return r0
        L10b5:
            r4 = r16
            goto Lfdf
        L10b9:
            if (r2 != r10) goto L10d7
            r11 = 44
            if (r13 != r11) goto L10d7
            if (r0 != r10) goto L10d7
            r11 = 45
            if (r15 != r11) goto L10d7
            r13 = r23
            if (r13 != r11) goto L10d7
            if (r12 != r10) goto L10d7
            r11 = 58
            if (r6 != r11) goto L10d7
            if (r8 != r11) goto L10d7
            int r11 = r61 + 28
            r11 = r60[r11]
            if (r11 == r10) goto L1147
        L10d7:
            r10 = 33
            if (r2 != r10) goto L10fd
            r11 = 44
            if (r0 != r11) goto L10fd
            r11 = 32
            if (r5 != r11) goto L10fd
            r10 = 45
            if (r14 != r10) goto L10fd
            if (r3 != r10) goto L10fd
            r0 = r22
            if (r0 != r11) goto L10fd
            r0 = r26
            r12 = 58
            if (r0 != r12) goto L10fd
            r0 = r27
            if (r0 != r12) goto L10fd
            int r0 = r61 + 29
            r0 = r60[r0]
            if (r0 == r11) goto L1147
        L10fd:
            r0 = 34
            if (r2 != r0) goto L1125
            r11 = 44
            if (r5 != r11) goto L1125
            r11 = 32
            if (r1 != r11) goto L1125
            r3 = r40
            r10 = 45
            if (r3 != r10) goto L1125
            if (r7 != r10) goto L1125
            r7 = r28
            if (r7 != r11) goto L1125
            r3 = r20
            r5 = 58
            if (r3 != r5) goto L1125
            r3 = r24
            if (r3 != r5) goto L1125
            int r3 = r61 + 30
            r3 = r60[r3]
            if (r3 == r11) goto L1147
        L1125:
            r3 = 35
            if (r2 != r3) goto L1155
            r11 = 44
            if (r1 != r11) goto L1155
            r11 = 32
            if (r15 != r11) goto L1155
            r15 = 45
            if (r9 != r15) goto L1155
            if (r4 != r15) goto L1155
            if (r6 != r11) goto L1155
            r5 = 58
            if (r8 != r5) goto L1155
            r6 = r48
            if (r6 != r5) goto L1155
            int r1 = r61 + 31
            r1 = r60[r1]
            if (r1 != r11) goto L1155
        L1147:
            java.lang.String r0 = new java.lang.String
            r10 = r60
            r1 = r61
            r0.<init>(r10, r1, r2)
            java.time.ZonedDateTime r0 = parseZonedDateTimeCookie(r0)
            return r0
        L1155:
            r10 = r60
            r1 = r61
            if (r2 != r0) goto L1173
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_34
            if (r0 != 0) goto L1169
            java.lang.String r0 = "EEE MMM dd HH:mm:ss O yyyy"
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r3)
            com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_34 = r0
        L1169:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r10, r1, r2)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.parse(r3, r0)
            return r0
        L1173:
            r0 = 31
            if (r2 != r0) goto L1195
            r0 = r19
            r11 = 44
            if (r0 != r11) goto L1195
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_RFC_2822
            if (r0 != 0) goto L118b
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss Z"
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r3)
            com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_RFC_2822 = r0
        L118b:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r10, r1, r2)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.parse(r3, r0)
            return r0
        L1195:
            r17 = 0
            return r17
    }

    public static java.time.ZonedDateTime parseZonedDateTime(char[] r1, int r2, int r3) {
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r1 = parseZonedDateTime(r1, r2, r3, r0)
            return r1
    }

    public static java.time.ZonedDateTime parseZonedDateTime(char[] r64, int r65, int r66, java.time.ZoneId r67) {
            r0 = r64
            r1 = r65
            r2 = r66
            r3 = r67
            r4 = 0
            if (r0 != 0) goto Lc
            return r4
        Lc:
            if (r2 != 0) goto Lf
            return r4
        Lf:
            r5 = 16
            if (r2 != r5) goto L18
            java.time.ZonedDateTime r0 = parseZonedDateTime16(r0, r1, r3)
            return r0
        L18:
            r5 = 19
            if (r2 < r5) goto L10f1
            char r7 = r0[r1]
            int r8 = r1 + 1
            char r8 = r0[r8]
            int r9 = r1 + 2
            char r9 = r0[r9]
            int r10 = r1 + 3
            char r10 = r0[r10]
            int r11 = r1 + 4
            char r11 = r0[r11]
            int r12 = r1 + 5
            char r12 = r0[r12]
            int r13 = r1 + 6
            char r13 = r0[r13]
            int r14 = r1 + 7
            char r14 = r0[r14]
            int r15 = r1 + 8
            char r15 = r0[r15]
            int r16 = r1 + 9
            char r6 = r0[r16]
            int r16 = r1 + 10
            r17 = r4
            char r4 = r0[r16]
            int r16 = r1 + 11
            char r5 = r0[r16]
            int r16 = r1 + 12
            char r1 = r0[r16]
            int r16 = r65 + 13
            char r3 = r0[r16]
            int r16 = r65 + 14
            r19 = r6
            char r6 = r0[r16]
            int r16 = r65 + 15
            r20 = r15
            char r15 = r0[r16]
            int r16 = r65 + 16
            char r0 = r64[r16]
            int r16 = r65 + 17
            r21 = r15
            char r15 = r64[r16]
            int r16 = r65 + 18
            r22 = r1
            char r1 = r64[r16]
            r16 = r1
            r1 = 19
            if (r2 != r1) goto L79
            r1 = 32
            goto L7f
        L79:
            int r18 = r65 + 19
            char r18 = r64[r18]
            r1 = r18
        L7f:
            r18 = 48
            switch(r2) {
                case 19: goto L22c;
                case 20: goto L22c;
                case 21: goto L221;
                case 22: goto L1ff;
                case 23: goto L1db;
                case 24: goto L1b7;
                case 25: goto L18f;
                case 26: goto L163;
                case 27: goto L134;
                case 28: goto L101;
                case 29: goto Lc8;
                default: goto L84;
            }
        L84:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            int r28 = r65 + 24
            char r28 = r64[r28]
            int r29 = r65 + 25
            char r29 = r64[r29]
            int r30 = r65 + 26
            char r30 = r64[r30]
            int r31 = r65 + 27
            char r31 = r64[r31]
            int r32 = r65 + 28
            char r32 = r64[r32]
            int r33 = r65 + 29
            char r33 = r64[r33]
            r34 = r25
            r25 = r8
            r8 = r34
            r34 = r27
            r35 = r28
            r36 = r29
            r37 = r30
            r38 = r31
            r39 = r32
            r40 = r33
        Lc0:
            r27 = r26
        Lc2:
            r26 = r24
        Lc4:
            r24 = r7
            goto L244
        Lc8:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            int r28 = r65 + 24
            char r28 = r64[r28]
            int r29 = r65 + 25
            char r29 = r64[r29]
            int r30 = r65 + 26
            char r30 = r64[r30]
            int r31 = r65 + 27
            char r31 = r64[r31]
            int r32 = r65 + 28
            char r32 = r64[r32]
            r34 = r25
            r25 = r8
            r8 = r34
            r34 = r27
            r35 = r28
            r36 = r29
            r37 = r30
            r38 = r31
            r39 = r32
        Lfe:
            r40 = 0
            goto Lc0
        L101:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            int r28 = r65 + 24
            char r28 = r64[r28]
            int r29 = r65 + 25
            char r29 = r64[r29]
            int r30 = r65 + 26
            char r30 = r64[r30]
            int r31 = r65 + 27
            char r31 = r64[r31]
            r34 = r25
            r25 = r8
            r8 = r34
            r39 = r18
            r34 = r27
            r35 = r28
            r36 = r29
            r37 = r30
            r38 = r31
            goto Lfe
        L134:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            int r28 = r65 + 24
            char r28 = r64[r28]
            int r29 = r65 + 25
            char r29 = r64[r29]
            int r30 = r65 + 26
            char r30 = r64[r30]
            r34 = r25
            r25 = r8
            r8 = r34
            r38 = r18
            r39 = r38
            r34 = r27
            r35 = r28
            r36 = r29
            r37 = r30
            goto Lfe
        L163:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            int r28 = r65 + 24
            char r28 = r64[r28]
            int r29 = r65 + 25
            char r29 = r64[r29]
            r34 = r25
            r25 = r8
            r8 = r34
            r37 = r18
            r38 = r37
            r39 = r38
            r34 = r27
            r35 = r28
            r36 = r29
            goto Lfe
        L18f:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            int r28 = r65 + 24
            char r28 = r64[r28]
            r34 = r25
            r25 = r8
            r8 = r34
            r36 = r18
            r37 = r36
            r38 = r37
            r39 = r38
            r34 = r27
            r35 = r28
            goto Lfe
        L1b7:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            int r27 = r65 + 23
            char r27 = r64[r27]
            r34 = r25
            r25 = r8
            r8 = r34
            r35 = r18
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r34 = r27
            goto Lfe
        L1db:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            int r26 = r65 + 22
            char r26 = r64[r26]
            r27 = r25
            r25 = r8
            r8 = r27
            r34 = r18
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r27 = r26
            r40 = 0
            goto Lc2
        L1ff:
            int r24 = r65 + 20
            char r24 = r64[r24]
            int r25 = r65 + 21
            char r25 = r64[r25]
            r26 = r25
            r25 = r8
            r8 = r26
            r27 = r18
        L20f:
            r34 = r27
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r26 = r24
            r40 = 0
            goto Lc4
        L221:
            int r24 = r65 + 20
            char r24 = r64[r24]
            r25 = r8
            r8 = r18
            r27 = r8
            goto L20f
        L22c:
            r24 = r7
            r25 = r8
            r8 = r18
            r27 = r8
            r34 = r27
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r26 = 0
            r40 = 0
        L244:
            r31 = 1
            r7 = 45
            r33 = r8
            r8 = 58
            if (r11 != r7) goto L2a8
            if (r14 != r7) goto L2a8
            r7 = 32
            if (r4 == r7) goto L258
            r7 = 84
            if (r4 != r7) goto L2a8
        L258:
            if (r3 != r8) goto L2a8
            if (r0 != r8) goto L2a8
            r7 = 91
            if (r1 == r7) goto L270
            r7 = 90
            if (r1 == r7) goto L270
            r7 = 43
            if (r1 == r7) goto L270
            r7 = 45
            if (r1 == r7) goto L270
            r7 = 32
            if (r1 != r7) goto L2a8
        L270:
            r0 = 0
            r11 = r64
            r7 = r2
            r51 = r6
            r43 = r9
            r44 = r10
            r45 = r12
            r46 = r13
            r53 = r15
            r54 = r16
            r2 = r17
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r52 = r21
            r6 = r22
            r41 = r24
            r42 = r25
            r1 = 0
            r15 = r5
            r5 = 19
            goto Lf70
        L2a8:
            r7 = 45
            if (r11 != r7) goto L2f3
            if (r14 != r7) goto L2f3
            r7 = 32
            if (r4 != r7) goto L2f3
            if (r5 != r7) goto L2f3
            if (r6 != r8) goto L2f3
            if (r15 != r8) goto L2f3
            r7 = 20
            if (r2 != r7) goto L2f5
            r11 = r64
            r52 = r0
            r54 = r1
            r6 = r3
            r5 = r7
            r43 = r9
            r44 = r10
            r45 = r12
            r46 = r13
            r53 = r16
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r51 = r21
            r15 = r22
            r41 = r24
            r42 = r25
            r1 = 0
            r0 = 0
        L2ee:
            r7 = r2
            r2 = r17
            goto Lf70
        L2f3:
            r7 = 20
        L2f5:
            if (r2 != r7) goto L34f
            r7 = 32
            if (r9 != r7) goto L34f
            if (r13 != r7) goto L34f
            if (r5 != r7) goto L34f
            if (r6 != r8) goto L34f
            if (r15 != r8) goto L34f
            int r5 = month(r10, r11, r12)
            if (r5 <= 0) goto L314
            int r6 = r5 / 10
            int r6 = r6 + 48
            char r6 = (char) r6
            int r5 = r5 % 10
            int r5 = r5 + 48
            char r5 = (char) r5
            goto L317
        L314:
            r5 = r18
            r6 = r5
        L317:
            r11 = r64
            r52 = r0
            r54 = r1
            r7 = r2
            r44 = r4
            r46 = r5
            r45 = r6
            r41 = r14
            r53 = r16
            r2 = r17
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r43 = r19
            r42 = r20
            r51 = r21
            r15 = r22
            r47 = r24
            r48 = r25
            r1 = 0
            r5 = 20
            r0 = 0
            r6 = r3
            goto Lf70
        L34f:
            r7 = 45
            if (r11 != r7) goto L35e
            if (r14 != r7) goto L35e
            r7 = 32
            if (r4 == r7) goto L362
            r7 = 84
            if (r4 != r7) goto L35e
            goto L362
        L35e:
            r7 = r33
            goto L3c4
        L362:
            if (r3 != r8) goto L35e
            if (r0 != r8) goto L35e
            r7 = 46
            if (r1 != r7) goto L35e
            r7 = 21
            if (r2 == r7) goto L383
            r7 = r33
            r8 = 91
            if (r7 == r8) goto L380
            r8 = 43
            if (r7 == r8) goto L380
            r8 = 45
            if (r7 == r8) goto L380
            r8 = 90
            if (r7 != r8) goto L3c4
        L380:
            r0 = 124(0x7c, float:1.74E-43)
            goto L386
        L383:
            r7 = r33
            goto L380
        L386:
            if (r7 != r0) goto L38b
            r0 = r31
            goto L38c
        L38b:
            r0 = 0
        L38c:
            r11 = r64
            r1 = r0
            r7 = r2
            r51 = r6
            r43 = r9
            r44 = r10
            r45 = r12
            r46 = r13
            r53 = r15
            r54 = r16
            r2 = r17
            r56 = r18
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r52 = r21
            r6 = r22
            r41 = r24
            r42 = r25
            r55 = r26
            r0 = 0
            r15 = r5
            r5 = 21
            goto Lf70
        L3c4:
            r8 = 45
            if (r11 != r8) goto L3d5
            if (r14 != r8) goto L3d5
            r8 = 32
            if (r4 == r8) goto L3d2
            r8 = 84
            if (r4 != r8) goto L3d5
        L3d2:
            r8 = 58
            goto L3db
        L3d5:
            r8 = r27
            r27 = r6
            goto L441
        L3db:
            if (r3 != r8) goto L3d5
            if (r0 != r8) goto L3d5
            r8 = 46
            if (r1 != r8) goto L3d5
            r8 = 22
            if (r2 == r8) goto L3fe
            r8 = r27
            r27 = r6
            r6 = 91
            if (r8 == r6) goto L3fb
            r6 = 43
            if (r8 == r6) goto L3fb
            r6 = 45
            if (r8 == r6) goto L3fb
            r6 = 90
            if (r8 != r6) goto L441
        L3fb:
            r0 = 124(0x7c, float:1.74E-43)
            goto L403
        L3fe:
            r8 = r27
            r27 = r6
            goto L3fb
        L403:
            if (r8 != r0) goto L408
            r0 = r31
            goto L409
        L408:
            r0 = 0
        L409:
            r11 = r64
            r1 = r0
            r56 = r7
            r43 = r9
            r44 = r10
            r45 = r12
            r46 = r13
            r53 = r15
            r54 = r16
            r57 = r18
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r52 = r21
            r6 = r22
            r41 = r24
            r42 = r25
            r55 = r26
            r51 = r27
            r0 = 0
            r7 = r2
            r15 = r5
            r2 = r17
        L43d:
            r5 = 22
            goto Lf70
        L441:
            r6 = 45
            if (r11 != r6) goto L49c
            if (r14 != r6) goto L49c
            r6 = 32
            if (r4 == r6) goto L44f
            r6 = 84
            if (r4 != r6) goto L49c
        L44f:
            r6 = 58
            if (r3 != r6) goto L49c
            r6 = 90
            if (r0 != r6) goto L49c
            r6 = 91
            if (r15 != r6) goto L49c
            r6 = 93
            if (r7 != r6) goto L49c
            r6 = 22
            if (r2 != r6) goto L49c
            r0 = 0
            r11 = r64
            r7 = r2
            r15 = r5
            r43 = r9
            r44 = r10
            r45 = r12
            r46 = r13
            r2 = r17
            r53 = r18
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r52 = r21
            r6 = r22
            r41 = r24
            r42 = r25
            r51 = r27
            r1 = r31
            r5 = 17
            goto Lf70
        L49c:
            r6 = 22
            if (r2 != r6) goto L530
            r6 = 32
            if (r10 != r6) goto L530
            r49 = r11
            r11 = 44
            if (r12 != r11) goto L52b
            if (r13 != r6) goto L52b
            if (r5 != r6) goto L52b
            r11 = 58
            if (r3 != r11) goto L52b
            if (r0 != r11) goto L52b
            if (r1 != r6) goto L52b
            r6 = r26
            r11 = 65
            if (r6 == r11) goto L4c0
            r11 = 80
            if (r6 != r11) goto L4c3
        L4c0:
            r11 = 77
            goto L4cf
        L4c3:
            r11 = r24
        L4c5:
            r24 = r14
            r14 = r25
            r25 = r11
            r11 = 22
            goto L533
        L4cf:
            if (r7 != r11) goto L4c3
            r11 = r24
            r24 = r14
            r14 = r25
            int r0 = month(r11, r14, r9)
            if (r0 <= 0) goto L4ec
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r8 = r0
            r7 = r1
        L4e9:
            r11 = 80
            goto L4f0
        L4ec:
            r7 = r18
            r8 = r7
            goto L4e9
        L4f0:
            if (r6 != r11) goto L4f5
            r0 = r31
            goto L4f6
        L4f5:
            r0 = 0
        L4f6:
            r11 = r64
            r44 = r4
            r45 = r7
            r46 = r8
            r53 = r15
            r54 = r16
            r15 = r18
            r47 = r15
            r55 = r47
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r43 = r19
            r42 = r20
            r52 = r21
            r6 = r22
            r41 = r24
            r51 = r27
            r48 = r49
            r1 = 0
            r5 = 22
            goto L2ee
        L52b:
            r11 = r24
            r6 = r26
            goto L4c5
        L530:
            r49 = r11
            goto L52b
        L533:
            if (r2 != r11) goto L556
            r11 = 47
            if (r9 != r11) goto L556
            if (r12 != r11) goto L556
            r11 = 32
            if (r4 != r11) goto L556
            r11 = 58
            if (r3 != r11) goto L556
            if (r0 != r11) goto L556
            r11 = 32
            if (r1 != r11) goto L556
            r11 = 65
            if (r6 == r11) goto L559
            r11 = 80
            if (r6 != r11) goto L556
        L551:
            r26 = r1
            r1 = 77
            goto L55c
        L556:
            r26 = r1
            goto L599
        L559:
            r11 = 80
            goto L551
        L55c:
            if (r7 != r1) goto L599
            if (r6 != r11) goto L563
            r0 = r31
            goto L564
        L563:
            r0 = 0
        L564:
            r11 = r64
            r7 = r2
            r47 = r10
            r41 = r13
            r46 = r14
            r53 = r15
            r54 = r16
            r2 = r17
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r44 = r19
            r43 = r20
            r52 = r21
            r6 = r22
            r42 = r24
            r45 = r25
            r51 = r27
            r48 = r49
            r1 = 0
            r15 = r5
            goto L43d
        L599:
            r1 = 23
            if (r2 != r1) goto L622
            r11 = 32
            if (r10 != r11) goto L622
            r1 = 44
            if (r12 != r1) goto L622
            if (r13 != r11) goto L622
            if (r5 != r11) goto L622
            r1 = r27
            r11 = 58
            if (r1 != r11) goto L5c0
            if (r15 != r11) goto L5c0
            r11 = 32
            if (r6 != r11) goto L5c0
            r11 = 65
            if (r7 == r11) goto L5bd
            r11 = 80
            if (r7 != r11) goto L5c0
        L5bd:
            r11 = 77
            goto L5c8
        L5c0:
            r11 = r25
        L5c2:
            r25 = r0
            r0 = 23
            goto L627
        L5c8:
            if (r8 != r11) goto L5c0
            r11 = r25
            int r1 = month(r11, r14, r9)
            if (r1 <= 0) goto L5e0
            int r5 = r1 / 10
            int r5 = r5 + 48
            char r5 = (char) r5
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r1 = (char) r1
            r8 = r1
        L5dd:
            r11 = 80
            goto L5e4
        L5e0:
            r5 = r18
            r8 = r5
            goto L5dd
        L5e4:
            if (r7 != r11) goto L5e9
            r1 = r31
            goto L5ea
        L5e9:
            r1 = 0
        L5ea:
            r11 = r64
            r52 = r0
            r0 = r1
            r7 = r2
            r6 = r3
            r44 = r4
            r45 = r5
            r46 = r8
            r53 = r16
            r2 = r17
            r47 = r18
            r55 = r47
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r43 = r19
            r42 = r20
            r51 = r21
            r15 = r22
            r41 = r24
            r54 = r26
        L61b:
            r48 = r49
        L61d:
            r1 = 0
            r5 = 23
            goto Lf70
        L622:
            r11 = r25
            r1 = r27
            goto L5c2
        L627:
            if (r2 != r0) goto L6b2
            r0 = 32
            r27 = r3
            if (r10 != r0) goto L6ab
            r3 = 44
            if (r13 != r3) goto L6ab
            r3 = r24
            r24 = r4
            r4 = r22
            if (r3 != r0) goto L652
            if (r4 != r0) goto L652
            r0 = 58
            if (r1 != r0) goto L652
            if (r15 != r0) goto L652
            r0 = 32
            if (r6 != r0) goto L652
            r0 = 65
            if (r7 == r0) goto L64f
            r0 = 80
            if (r7 != r0) goto L652
        L64f:
            r0 = 77
            goto L656
        L652:
            r0 = 23
            goto L6ba
        L656:
            if (r8 != r0) goto L652
            int r0 = month(r11, r14, r9)
            if (r0 <= 0) goto L66c
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r8 = r0
        L669:
            r11 = 80
            goto L670
        L66c:
            r1 = r18
            r8 = r1
            goto L669
        L670:
            if (r7 != r11) goto L675
            r0 = r31
            goto L676
        L675:
            r0 = 0
        L676:
            r11 = r64
            r45 = r1
            r7 = r2
            r44 = r5
            r46 = r8
            r48 = r12
            r53 = r16
            r2 = r17
            r15 = r18
            r55 = r15
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r42 = r19
            r41 = r20
            r51 = r21
            r43 = r24
            r52 = r25
            r54 = r26
            r6 = r27
            r47 = r49
            goto L61d
        L6ab:
            r3 = r24
            r24 = r4
            r4 = r22
            goto L652
        L6b2:
            r27 = r3
            r3 = r24
            r24 = r4
            r4 = r22
        L6ba:
            if (r2 != r0) goto L731
            r0 = 32
            if (r10 != r0) goto L731
            r22 = r3
            r3 = 44
            if (r12 != r3) goto L733
            if (r13 != r0) goto L733
            if (r5 != r3) goto L733
            if (r4 != r0) goto L733
            r3 = 58
            if (r1 != r3) goto L733
            if (r15 != r3) goto L733
            if (r6 != r0) goto L733
            r0 = 65
            if (r7 == r0) goto L6dc
            r0 = 80
            if (r7 != r0) goto L733
        L6dc:
            r0 = 77
            if (r8 != r0) goto L733
            int r0 = month(r11, r14, r9)
            if (r0 <= 0) goto L6f4
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r8 = r0
        L6f1:
            r11 = 80
            goto L6f8
        L6f4:
            r1 = r18
            r8 = r1
            goto L6f1
        L6f8:
            if (r7 != r11) goto L6fd
            r0 = r31
            goto L6fe
        L6fd:
            r0 = 0
        L6fe:
            r11 = r64
            r45 = r1
            r7 = r2
            r46 = r8
            r53 = r16
            r2 = r17
            r15 = r18
            r47 = r15
            r55 = r47
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r43 = r19
            r42 = r20
            r51 = r21
            r41 = r22
            r44 = r24
            r52 = r25
            r54 = r26
            r6 = r27
            goto L61b
        L731:
            r22 = r3
        L733:
            r0 = 24
            if (r2 != r0) goto L7e0
            r3 = 32
            if (r10 != r3) goto L7e0
            r0 = 44
            if (r13 != r0) goto L7e0
            r0 = r22
            if (r0 != r3) goto L7d7
            if (r4 != r3) goto L7d7
            r3 = r21
            r21 = r6
            r6 = 58
            r22 = r1
            r1 = r16
            if (r3 != r6) goto L7d2
            if (r1 != r6) goto L7cd
            r6 = 32
            if (r7 != r6) goto L7cd
            r6 = 65
            if (r8 == r6) goto L75f
            r6 = 80
            if (r8 != r6) goto L766
        L75f:
            r16 = r15
            r6 = r34
            r15 = 77
            goto L772
        L766:
            r16 = r15
            r6 = r34
            r15 = r49
            r34 = r5
        L76e:
            r5 = 45
            goto L7eb
        L772:
            if (r6 != r15) goto L7c8
            int r0 = month(r11, r14, r9)
            if (r0 <= 0) goto L788
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r1
        L785:
            r11 = 80
            goto L78c
        L788:
            r0 = r18
            r7 = r0
            goto L785
        L78c:
            if (r8 != r11) goto L791
            r1 = r31
            goto L792
        L791:
            r1 = 0
        L792:
            r11 = r64
            r46 = r0
            r0 = r1
            r44 = r5
            r45 = r7
            r48 = r12
            r52 = r16
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r42 = r19
            r41 = r20
            r54 = r21
            r6 = r22
            r43 = r24
            r51 = r25
            r53 = r26
            r15 = r27
            r47 = r49
        L7c3:
            r1 = 0
            r5 = 24
            goto L2ee
        L7c8:
            r34 = r5
            r15 = r49
            goto L76e
        L7cd:
            r16 = r15
            r6 = r34
            goto L7c8
        L7d2:
            r6 = r34
            r16 = r15
            goto L7c8
        L7d7:
            r22 = r1
            r1 = r16
            r3 = r21
            r21 = r6
            goto L7cd
        L7e0:
            r3 = r21
            r0 = r22
            r22 = r1
            r21 = r6
            r1 = r16
            goto L7d2
        L7eb:
            if (r15 != r5) goto L881
            if (r0 != r5) goto L881
            r5 = r24
            r24 = r12
            r12 = 32
            if (r5 == r12) goto L7fb
            r12 = 84
            if (r5 != r12) goto L802
        L7fb:
            r12 = r27
            r27 = r9
            r9 = 58
            goto L812
        L802:
            r49 = r11
            r11 = r25
            r12 = r27
            r27 = r9
            r25 = r14
        L80c:
            r9 = r26
        L80e:
            r14 = 45
            goto L891
        L812:
            r49 = r11
            r11 = r25
            if (r12 != r9) goto L87c
            r25 = r14
            if (r11 != r9) goto L80c
            r9 = r26
            r14 = 46
            if (r9 != r14) goto L80e
            r14 = 23
            if (r2 == r14) goto L83a
            r14 = 91
            if (r6 == r14) goto L83a
            r14 = 124(0x7c, float:1.74E-43)
            if (r6 == r14) goto L83d
            r14 = 43
            if (r6 == r14) goto L83a
            r14 = 45
            if (r6 == r14) goto L83a
            r14 = 90
            if (r6 != r14) goto L80e
        L83a:
            r0 = 124(0x7c, float:1.74E-43)
            goto L83e
        L83d:
            r0 = r14
        L83e:
            if (r6 != r0) goto L843
            r0 = r31
            goto L844
        L843:
            r0 = 0
        L844:
            r11 = r64
            r54 = r1
            r52 = r3
            r6 = r4
            r56 = r7
            r57 = r8
            r44 = r10
            r46 = r13
            r53 = r16
            r58 = r18
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r42 = r25
            r43 = r27
            r15 = r34
            r41 = r49
            r5 = 23
            r1 = r0
            r7 = r2
        L877:
            r2 = r17
        L879:
            r0 = 0
            goto Lf70
        L87c:
            r9 = r26
            r25 = r14
            goto L80e
        L881:
            r49 = r11
            r5 = r24
            r11 = r25
            r24 = r12
            r25 = r14
            r12 = r27
            r27 = r9
            goto L80c
        L891:
            if (r15 != r14) goto L8a0
            if (r0 != r14) goto L8a0
            r14 = 32
            if (r5 == r14) goto L89d
            r14 = 84
            if (r5 != r14) goto L8a0
        L89d:
            r14 = 58
            goto L8a8
        L8a0:
            r26 = r9
            r14 = r35
        L8a4:
            r9 = 24
            goto L90f
        L8a8:
            if (r12 != r14) goto L8a0
            if (r11 != r14) goto L8a0
            r14 = 46
            if (r9 != r14) goto L8a0
            r14 = 24
            if (r2 == r14) goto L8d1
            r26 = r9
            r14 = r35
            r9 = 91
            if (r14 == r9) goto L8cc
            r9 = 124(0x7c, float:1.74E-43)
            if (r14 == r9) goto L8cf
            r9 = 43
            if (r14 == r9) goto L8cc
            r9 = 45
            if (r14 == r9) goto L8cc
            r9 = 90
            if (r14 != r9) goto L8a4
        L8cc:
            r0 = 124(0x7c, float:1.74E-43)
            goto L8d4
        L8cf:
            r0 = r9
            goto L8d4
        L8d1:
            r14 = r35
            goto L8cc
        L8d4:
            if (r14 != r0) goto L8d9
            r0 = r31
            goto L8da
        L8d9:
            r0 = 0
        L8da:
            r11 = r64
            r54 = r1
            r52 = r3
            r58 = r6
            r56 = r7
            r57 = r8
            r44 = r10
            r46 = r13
            r53 = r16
            r59 = r18
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r42 = r25
            r43 = r27
            r15 = r34
            r41 = r49
            r5 = 24
            r1 = r0
            r7 = r2
            r6 = r4
            goto L877
        L90f:
            if (r2 != r9) goto L99d
            r9 = 32
            if (r10 != r9) goto L99d
            r35 = r14
            r14 = 44
            if (r13 != r14) goto L934
            if (r0 != r9) goto L934
            if (r4 != r14) goto L934
            if (r12 != r9) goto L934
            r14 = 58
            if (r3 != r14) goto L934
            if (r1 != r14) goto L934
            if (r7 != r9) goto L934
            r9 = 65
            if (r8 == r9) goto L931
            r9 = 80
            if (r8 != r9) goto L934
        L931:
            r9 = 77
            goto L942
        L934:
            r14 = r25
            r9 = r49
            r25 = r11
            r11 = r27
            r27 = r12
            r12 = 24
            goto L9a0
        L942:
            if (r6 != r9) goto L934
            r14 = r25
            r9 = r49
            r25 = r11
            r11 = r27
            int r0 = month(r9, r14, r11)
            if (r0 <= 0) goto L960
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r7 = r1
        L95d:
            r11 = 80
            goto L964
        L960:
            r0 = r18
            r7 = r0
            goto L95d
        L964:
            if (r8 != r11) goto L969
            r1 = r31
            goto L96a
        L969:
            r1 = 0
        L96a:
            r11 = r64
            r46 = r0
            r0 = r1
            r43 = r5
            r45 = r7
            r47 = r15
            r52 = r16
            r15 = r18
            r55 = r15
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r42 = r19
            r41 = r20
            r54 = r21
            r6 = r22
            r48 = r24
            r51 = r25
            r53 = r26
            r44 = r34
            goto L7c3
        L99d:
            r35 = r14
            goto L934
        L9a0:
            if (r2 != r12) goto La29
            r12 = 32
            if (r10 != r12) goto La29
            r49 = r10
            r10 = r24
            r2 = 44
            if (r10 != r2) goto La24
            if (r13 != r12) goto La24
            r24 = r10
            r10 = r34
            if (r10 != r2) goto La2c
            if (r4 != r12) goto La2c
            r2 = 58
            if (r3 != r2) goto La2c
            if (r1 != r2) goto La2c
            if (r7 != r12) goto La2c
            r2 = 65
            if (r8 == r2) goto L9c8
            r2 = 80
            if (r8 != r2) goto La2c
        L9c8:
            r2 = 77
            if (r6 != r2) goto La2c
            int r1 = month(r9, r14, r11)
            if (r1 <= 0) goto L9e0
            int r2 = r1 / 10
            int r2 = r2 + 48
            char r2 = (char) r2
            int r1 = r1 % 10
            int r1 = r1 + 48
            char r1 = (char) r1
            r7 = r2
        L9dd:
            r11 = 80
            goto L9e4
        L9e0:
            r1 = r18
            r7 = r1
            goto L9dd
        L9e4:
            if (r8 != r11) goto L9e9
            r2 = r31
            goto L9ea
        L9e9:
            r2 = 0
        L9ea:
            r11 = r64
            r41 = r0
            r46 = r1
            r0 = r2
            r44 = r5
            r45 = r7
            r48 = r15
            r52 = r16
            r2 = r17
            r47 = r18
            r55 = r47
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r43 = r19
            r42 = r20
            r54 = r21
            r6 = r22
            r51 = r25
            r53 = r26
            r15 = r27
            r1 = 0
            r5 = 24
            r7 = r66
            goto Lf70
        La24:
            r24 = r10
        La26:
            r10 = r34
            goto La2c
        La29:
            r49 = r10
            goto La26
        La2c:
            r12 = 45
            if (r15 != r12) goto La3f
            if (r0 != r12) goto La3f
            r12 = 32
            if (r5 == r12) goto La3a
            r12 = 84
            if (r5 != r12) goto La3f
        La3a:
            r12 = r27
            r2 = 58
            goto La55
        La3f:
            r34 = r10
            r10 = r25
            r2 = r26
            r12 = r27
        La47:
            r26 = r1
            r25 = r7
            r1 = r36
            r7 = r66
        La4f:
            r36 = r3
        La51:
            r3 = 25
            goto Ladb
        La55:
            r34 = r10
            r10 = r25
            if (r12 != r2) goto Lad7
            r25 = r7
            if (r10 != r2) goto Lad4
            r2 = r26
            r7 = 46
            if (r2 != r7) goto Lacc
            r7 = r66
            r26 = r1
            r1 = 25
            if (r7 == r1) goto La8a
            r1 = r36
            r36 = r3
            r3 = 91
            if (r1 == r3) goto La85
            r3 = 124(0x7c, float:1.74E-43)
            if (r1 == r3) goto La88
            r3 = 43
            if (r1 == r3) goto La85
            r3 = 45
            if (r1 == r3) goto La85
            r3 = 90
            if (r1 != r3) goto La51
        La85:
            r0 = 124(0x7c, float:1.74E-43)
            goto La8f
        La88:
            r0 = r3
            goto La8f
        La8a:
            r1 = r36
            r36 = r3
            goto La85
        La8f:
            if (r1 != r0) goto La94
            r0 = r31
            goto La95
        La94:
            r0 = 0
        La95:
            r1 = r0
            r58 = r6
            r57 = r8
            r41 = r9
            r43 = r11
            r46 = r13
            r42 = r14
            r53 = r16
            r2 = r17
            r60 = r18
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r56 = r25
            r54 = r26
            r15 = r34
            r59 = r35
            r52 = r36
            r44 = r49
            r5 = 25
            r0 = 0
            r11 = r64
            r6 = r4
            goto Lf70
        Lacc:
            r7 = r66
            r26 = r1
            r1 = r36
            goto La4f
        Lad4:
            r2 = r26
            goto Lacc
        Lad7:
            r2 = r26
            goto La47
        Ladb:
            if (r7 != r3) goto Lb63
            r3 = r49
            r49 = r1
            r1 = 32
            r52 = r3
            if (r3 != r1) goto Lb06
            r3 = 44
            if (r13 != r3) goto Lb06
            if (r0 != r1) goto Lb06
            if (r4 != r3) goto Lb06
            if (r12 != r1) goto Lb06
            r3 = 58
            if (r10 != r3) goto Lb06
            if (r2 != r3) goto Lb06
            if (r8 != r1) goto Lb06
            r1 = 65
            if (r6 == r1) goto Lb01
            r1 = 80
            if (r6 != r1) goto Lb06
        Lb01:
            r1 = r35
            r3 = 77
            goto Lb0c
        Lb06:
            r1 = r35
        Lb08:
            r3 = 45
            goto Lb68
        Lb0c:
            if (r1 != r3) goto Lb08
            int r0 = month(r9, r14, r11)
            if (r0 <= 0) goto Lb22
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r8 = r0
        Lb1f:
            r11 = 80
            goto Lb26
        Lb22:
            r1 = r18
            r8 = r1
            goto Lb1f
        Lb26:
            if (r6 != r11) goto Lb2b
            r0 = r31
            goto Lb2c
        Lb2b:
            r0 = 0
        Lb2c:
            r11 = r64
            r45 = r1
            r43 = r5
            r46 = r8
            r47 = r15
            r51 = r16
            r2 = r17
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r42 = r19
            r41 = r20
            r53 = r21
            r15 = r22
            r48 = r24
            r54 = r25
            r52 = r26
            r44 = r34
            r6 = r36
            r1 = 0
        Lb5f:
            r5 = 25
            goto Lf70
        Lb63:
            r52 = r49
            r49 = r1
            goto Lb06
        Lb68:
            if (r15 != r3) goto Lb77
            if (r0 != r3) goto Lb77
            r3 = 32
            if (r5 == r3) goto Lb74
            r3 = 84
            if (r5 != r3) goto Lb77
        Lb74:
            r3 = 58
            goto Lb7f
        Lb77:
            r3 = r37
            r37 = r9
        Lb7b:
            r9 = 45
            goto Lbe9
        Lb7f:
            if (r12 != r3) goto Lb77
            if (r10 != r3) goto Lb77
            r3 = 46
            if (r2 != r3) goto Lb77
            r3 = 26
            if (r7 == r3) goto Lba8
            r3 = r37
            r37 = r9
            r9 = 91
            if (r3 == r9) goto Lba3
            r9 = 124(0x7c, float:1.74E-43)
            if (r3 == r9) goto Lba6
            r9 = 43
            if (r3 == r9) goto Lba3
            r9 = 45
            if (r3 == r9) goto Lba3
            r9 = 90
            if (r3 != r9) goto Lb7b
        Lba3:
            r0 = 124(0x7c, float:1.74E-43)
            goto Lbad
        Lba6:
            r0 = r9
            goto Lbad
        Lba8:
            r3 = r37
            r37 = r9
            goto Lba3
        Lbad:
            if (r3 != r0) goto Lbb2
            r0 = r31
            goto Lbb3
        Lbb2:
            r0 = 0
        Lbb3:
            r59 = r1
            r58 = r6
            r57 = r8
            r43 = r11
            r46 = r13
            r42 = r14
            r53 = r16
            r2 = r17
            r61 = r18
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r56 = r25
            r54 = r26
            r15 = r34
            r41 = r37
            r60 = r49
            r44 = r52
            r5 = 26
            r11 = r64
        Lbe3:
            r1 = r0
            r6 = r4
            r52 = r36
            goto L879
        Lbe9:
            if (r15 != r9) goto Lbf8
            if (r0 != r9) goto Lbf8
            r9 = 32
            if (r5 == r9) goto Lbf5
            r9 = 84
            if (r5 != r9) goto Lbf8
        Lbf5:
            r9 = 58
            goto Lbfe
        Lbf8:
            r9 = r38
            r38 = r11
            goto Lc9d
        Lbfe:
            if (r12 != r9) goto Lbf8
            if (r10 != r9) goto Lbf8
            r9 = 46
            if (r2 != r9) goto Lbf8
            r9 = 27
            if (r7 == r9) goto Lc25
            r9 = r38
            r38 = r11
            r11 = 91
            if (r9 == r11) goto Lc22
            r11 = 124(0x7c, float:1.74E-43)
            if (r9 == r11) goto Lc22
            r11 = 43
            if (r9 == r11) goto Lc22
            r11 = 45
            if (r9 == r11) goto Lc22
            r11 = 90
            if (r9 != r11) goto Lc9d
        Lc22:
            r11 = 32
            goto Lc2a
        Lc25:
            r9 = r38
            r38 = r11
            goto Lc22
        Lc2a:
            if (r6 != r11) goto Lc63
            r0 = 0
            r11 = r64
            r6 = r4
            r57 = r8
            r46 = r13
            r42 = r14
            r53 = r16
            r2 = r17
            r58 = r18
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r56 = r25
            r54 = r26
            r15 = r34
            r41 = r37
            r43 = r38
            r44 = r52
            r1 = 0
            r5 = 23
            r52 = r36
            goto Lf70
        Lc63:
            r0 = 124(0x7c, float:1.74E-43)
            if (r9 != r0) goto Lc6a
            r0 = r31
            goto Lc6b
        Lc6a:
            r0 = 0
        Lc6b:
            r11 = r64
            r59 = r1
            r61 = r3
            r58 = r6
            r57 = r8
            r46 = r13
            r42 = r14
            r53 = r16
            r2 = r17
            r62 = r18
            r63 = r62
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r56 = r25
            r54 = r26
            r15 = r34
            r41 = r37
            r43 = r38
            r60 = r49
            r44 = r52
            r5 = 27
            goto Lbe3
        Lc9d:
            r11 = 45
            if (r15 != r11) goto Lcae
            if (r0 != r11) goto Lcae
            r11 = 32
            if (r5 == r11) goto Lcab
            r11 = 84
            if (r5 != r11) goto Lcae
        Lcab:
            r11 = 58
            goto Lcb6
        Lcae:
            r11 = r39
            r39 = r14
        Lcb2:
            r14 = 28
            goto Ld1c
        Lcb6:
            if (r12 != r11) goto Lcae
            if (r10 != r11) goto Lcae
            r11 = 46
            if (r2 != r11) goto Lcae
            r11 = 28
            if (r7 == r11) goto Lcdf
            r11 = r39
            r39 = r14
            r14 = 91
            if (r11 == r14) goto Lcda
            r14 = 124(0x7c, float:1.74E-43)
            if (r11 == r14) goto Lcdd
            r14 = 43
            if (r11 == r14) goto Lcda
            r14 = 45
            if (r11 == r14) goto Lcda
            r14 = 90
            if (r11 != r14) goto Lcb2
        Lcda:
            r0 = 124(0x7c, float:1.74E-43)
            goto Lce4
        Lcdd:
            r0 = r14
            goto Lce4
        Lcdf:
            r11 = r39
            r39 = r14
            goto Lcda
        Lce4:
            if (r11 != r0) goto Lce9
            r0 = r31
            goto Lcea
        Lce9:
            r0 = 0
        Lcea:
            r11 = r64
            r59 = r1
            r61 = r3
            r58 = r6
            r57 = r8
            r62 = r9
            r46 = r13
            r53 = r16
            r2 = r17
            r63 = r18
            r48 = r19
            r47 = r20
            r55 = r21
            r51 = r22
            r45 = r24
            r56 = r25
            r54 = r26
            r15 = r34
            r41 = r37
            r43 = r38
            r42 = r39
            r60 = r49
            r44 = r52
            r5 = 28
            goto Lbe3
        Ld1c:
            r45 = r11
            if (r7 != r14) goto Ld92
            r14 = r52
            r11 = 32
            if (r14 != r11) goto Ld8b
            if (r0 != r11) goto Ld8b
            if (r5 != r11) goto Ld8b
            r11 = 58
            if (r12 != r11) goto Ld8b
            if (r10 != r11) goto Ld8b
            r11 = 32
            if (r2 != r11) goto Ld8b
            if (r6 != r11) goto Ld8b
            r11 = r24
            int r0 = month(r15, r11, r13)
            if (r0 <= 0) goto Ld4a
            int r2 = r0 / 10
            int r2 = r2 + 48
            char r2 = (char) r2
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r8 = r0
            goto Ld4d
        Ld4a:
            r2 = r18
            r8 = r2
        Ld4d:
            java.lang.String r0 = new java.lang.String
            int r5 = r65 + 20
            r6 = 3
            r10 = r64
            r0.<init>(r10, r5, r6)
            r41 = r1
            r45 = r2
            r43 = r3
            r6 = r4
            r46 = r8
            r44 = r9
            r11 = r10
            r53 = r16
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r48 = r19
            r47 = r20
            r51 = r22
            r54 = r26
            r15 = r34
            r52 = r36
            r42 = r49
            r1 = 0
            r5 = 19
            r2 = r0
            goto L879
        Ld8b:
            r11 = r64
            r23 = r9
            r9 = 28
            goto Ld95
        Ld92:
            r14 = r52
            goto Ld8b
        Ld95:
            if (r7 != r9) goto Le28
            r9 = 44
            if (r14 != r9) goto Le28
            r9 = 32
            if (r15 != r9) goto Le28
            if (r13 != r9) goto Le28
            if (r5 != r9) goto Le28
            r35 = r4
            r4 = r36
            if (r4 != r9) goto Le1d
            r9 = r26
            r26 = r3
            r3 = 58
            if (r9 != r3) goto Le13
            r36 = r9
            r9 = r25
            if (r9 != r3) goto Le09
            r3 = 32
            if (r1 != r3) goto Le09
            r1 = r19
            r3 = r20
            int r0 = month(r0, r3, r1)
            if (r0 <= 0) goto Ldd0
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            goto Ldd3
        Ldd0:
            r0 = r18
            r1 = r0
        Ldd3:
            r46 = r0
            r45 = r1
            r51 = r2
            r54 = r6
            r53 = r8
            r15 = r10
            r43 = r12
            r6 = r16
            r2 = r17
            r47 = r18
            r55 = r47
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r52 = r21
            r44 = r22
            r48 = r24
            r1 = r31
            r41 = r34
            r42 = r35
            r0 = 0
            r5 = 24
            goto Lf70
        Le09:
            r3 = r19
            r19 = r1
            r1 = r3
            r3 = r20
            r25 = r9
            goto Le33
        Le13:
            r3 = r19
            r19 = r1
            r1 = r3
            r36 = r9
        Le1a:
            r3 = r20
            goto Le33
        Le1d:
            r36 = r19
            r19 = r1
            r1 = r36
        Le23:
            r36 = r26
            r26 = r3
            goto Le1a
        Le28:
            r35 = r19
            r19 = r1
            r1 = r35
            r35 = r4
            r4 = r36
            goto Le23
        Le33:
            r9 = 29
            if (r7 != r9) goto Lea9
            r9 = 44
            if (r14 != r9) goto Lea9
            r9 = 32
            if (r15 != r9) goto Lea9
            if (r0 != r9) goto Lea9
            r52 = r14
            r14 = r34
            if (r14 != r9) goto Lea4
            if (r10 != r9) goto Lea4
            r9 = 58
            if (r2 != r9) goto Lea4
            if (r8 != r9) goto Lea4
            r34 = r6
            r9 = r49
            r6 = 32
            if (r9 != r6) goto Lea1
            int r0 = month(r3, r1, r5)
            if (r0 <= 0) goto Le69
            int r1 = r0 / 10
            int r1 = r1 + 48
            char r1 = (char) r1
            int r0 = r0 % 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r8 = r0
            goto Le6c
        Le69:
            r1 = r18
            r8 = r1
        Le6c:
            r45 = r1
            r44 = r4
            r46 = r8
            r42 = r12
            r48 = r13
            r15 = r16
            r2 = r17
            r55 = r18
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r54 = r19
            r51 = r21
            r43 = r22
            r47 = r24
            r52 = r25
            r1 = r31
            r53 = r34
            r41 = r35
            r6 = r36
            r0 = 0
            goto Lb5f
        Lea1:
            r6 = 45
            goto Leb2
        Lea4:
            r34 = r6
            r9 = r49
            goto Lea1
        Lea9:
            r52 = r14
            r14 = r34
            r9 = r49
            r34 = r6
            goto Lea1
        Leb2:
            if (r15 != r6) goto Lec1
            if (r0 != r6) goto Lec1
            r6 = 32
            if (r5 == r6) goto Lebe
            r6 = 84
            if (r5 != r6) goto Lec1
        Lebe:
            r6 = 58
            goto Lec7
        Lec1:
            r49 = r15
        Lec3:
            r6 = 22
            goto Lf2d
        Lec7:
            if (r12 != r6) goto Lec1
            if (r10 != r6) goto Lec1
            r6 = 46
            if (r2 != r6) goto Lec1
            r6 = 29
            if (r7 == r6) goto Lef0
            r49 = r15
            r6 = r40
            r15 = 91
            if (r6 == r15) goto Leeb
            r15 = 124(0x7c, float:1.74E-43)
            if (r6 == r15) goto Leee
            r15 = 43
            if (r6 == r15) goto Leeb
            r15 = 45
            if (r6 == r15) goto Leeb
            r15 = 90
            if (r6 != r15) goto Lec3
        Leeb:
            r0 = 124(0x7c, float:1.74E-43)
            goto Lef3
        Leee:
            r0 = r15
            goto Lef3
        Lef0:
            r6 = r40
            goto Leeb
        Lef3:
            if (r6 != r0) goto Lef8
            r0 = r31
            goto Lef9
        Lef8:
            r0 = 0
        Lef9:
            r48 = r1
            r47 = r3
            r57 = r8
            r60 = r9
            r46 = r13
            r15 = r14
            r53 = r16
            r2 = r17
            r59 = r19
            r55 = r21
            r51 = r22
            r62 = r23
            r56 = r25
            r61 = r26
            r58 = r34
            r6 = r35
            r54 = r36
            r41 = r37
            r43 = r38
            r42 = r39
            r63 = r45
            r44 = r52
            r5 = 29
            r1 = r0
            r52 = r4
            r45 = r24
            goto L879
        Lf2d:
            if (r7 != r6) goto L100e
            r6 = r16
            r15 = 43
            if (r6 == r15) goto Lf3e
            r15 = 45
            if (r6 != r15) goto Lf3a
            goto Lf3e
        Lf3a:
            r15 = 32
            goto L1012
        Lf3e:
            r48 = r0
            r6 = r1
            r15 = r3
            r56 = r4
            r51 = r5
            r57 = r10
            r54 = r12
            r47 = r13
            r2 = r17
            r58 = r18
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r55 = r22
            r46 = r24
            r53 = r35
            r41 = r37
            r43 = r38
            r42 = r39
            r45 = r49
            r44 = r52
            r0 = 0
            r1 = 0
            r5 = 17
            r52 = r14
        Lf70:
            if (r0 == 0) goto Lf7b
            r3 = 49
            if (r15 != r3) goto Lf7b
            r3 = 50
            if (r6 != r3) goto Lf7b
            r0 = 0
        Lf7b:
            if (r0 == 0) goto Lf86
            int r0 = hourAfterNoon(r15, r6)
            int r3 = r0 >> 16
            char r15 = (char) r3
            short r0 = (short) r0
            char r6 = (char) r0
        Lf86:
            r50 = r6
            r49 = r15
            java.time.LocalDateTime r0 = localDateTime(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            if (r0 != 0) goto Lf91
            return r17
        Lf91:
            if (r1 == 0) goto Lfb8
            java.lang.String r1 = new java.lang.String
            int r2 = r7 - r5
            r1.<init>(r11, r5, r2)
            java.lang.String r2 = "UTC"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lfb3
            java.lang.String r2 = "[UTC]"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lfb3
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            java.time.ZoneId r1 = r1.toZoneId()
            goto Lfb5
        Lfb3:
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
        Lfb5:
            r3 = r67
            goto L1000
        Lfb8:
            if (r5 != r7) goto Lfbe
            r1 = r67
            r3 = r1
            goto L1000
        Lfbe:
            int r1 = r65 + r5
            char r3 = r11[r1]
            r14 = 90
            if (r3 != r14) goto Lfc9
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
            goto Lfb5
        Lfc9:
            if (r2 != 0) goto Lfe3
            r14 = 43
            if (r3 == r14) goto Lff4
            r14 = 45
            if (r3 != r14) goto Lfd4
            goto Lff4
        Lfd4:
            r6 = 32
            if (r3 != r6) goto Lfe6
            java.lang.String r2 = new java.lang.String
            int r1 = r1 + 1
            int r3 = r7 - r5
            int r3 = r3 + (-1)
            r2.<init>(r11, r1, r3)
        Lfe3:
            r3 = r67
            goto Lffc
        Lfe6:
            if (r5 >= r7) goto Lfe3
            java.lang.String r2 = new java.lang.String
            int r1 = r1 + 1
            int r3 = r7 - r5
            int r3 = r3 + (-2)
            r2.<init>(r11, r1, r3)
            goto Lfe3
        Lff4:
            java.lang.String r2 = new java.lang.String
            int r3 = r7 - r5
            r2.<init>(r11, r1, r3)
            goto Lfe3
        Lffc:
            java.time.ZoneId r1 = getZoneId(r2, r3)
        L1000:
            if (r1 != 0) goto L1003
            r1 = r3
        L1003:
            if (r1 != 0) goto L1007
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
        L1007:
            r2 = r17
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r0, r1, r2)
            return r0
        L100e:
            r6 = r16
            goto Lf3a
        L1012:
            if (r7 != r15) goto L1030
            r11 = 44
            if (r13 != r11) goto L1030
            if (r0 != r15) goto L1030
            r11 = 45
            if (r5 != r11) goto L1030
            r13 = r22
            if (r13 != r11) goto L1030
            if (r2 != r15) goto L1030
            r11 = 58
            if (r8 != r11) goto L1030
            if (r9 != r11) goto L1030
            int r2 = r65 + 28
            char r2 = r64[r2]
            if (r2 == r15) goto L10a0
        L1030:
            r2 = 33
            if (r7 != r2) goto L1056
            r11 = 44
            if (r0 != r11) goto L1056
            r11 = 32
            if (r3 != r11) goto L1056
            r15 = 45
            if (r14 != r15) goto L1056
            if (r4 != r15) goto L1056
            r0 = r21
            if (r0 != r11) goto L1056
            r0 = r34
            r14 = 58
            if (r0 != r14) goto L1056
            r0 = r26
            if (r0 != r14) goto L1056
            int r0 = r65 + 29
            char r0 = r64[r0]
            if (r0 == r11) goto L10a0
        L1056:
            r0 = 34
            if (r7 != r0) goto L107e
            r11 = 44
            if (r3 != r11) goto L107e
            r11 = 32
            if (r1 != r11) goto L107e
            r4 = r35
            r14 = 45
            if (r4 != r14) goto L107e
            if (r10 != r14) goto L107e
            r2 = r25
            if (r2 != r11) goto L107e
            r14 = r19
            r3 = 58
            if (r14 != r3) goto L107e
            r2 = r23
            if (r2 != r3) goto L107e
            int r2 = r65 + 30
            char r2 = r64[r2]
            if (r2 == r11) goto L10a0
        L107e:
            r2 = 35
            if (r7 != r2) goto L10ae
            r11 = 44
            if (r1 != r11) goto L10ae
            r11 = 32
            if (r5 != r11) goto L10ae
            r14 = 45
            if (r12 != r14) goto L10ae
            if (r6 != r14) goto L10ae
            if (r8 != r11) goto L10ae
            r3 = 58
            if (r9 != r3) goto L10ae
            r1 = r45
            if (r1 != r3) goto L10ae
            int r1 = r65 + 31
            char r1 = r64[r1]
            if (r1 != r11) goto L10ae
        L10a0:
            java.lang.String r0 = new java.lang.String
            r10 = r64
            r1 = r65
            r0.<init>(r10, r1, r7)
            java.time.ZonedDateTime r0 = parseZonedDateTimeCookie(r0)
            return r0
        L10ae:
            r10 = r64
            r1 = r65
            if (r7 != r0) goto L10cc
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_34
            if (r0 != 0) goto L10c2
            java.lang.String r0 = "EEE MMM dd HH:mm:ss O yyyy"
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r2)
            com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_34 = r0
        L10c2:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r10, r1, r7)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.parse(r2, r0)
            return r0
        L10cc:
            r0 = 31
            if (r7 != r0) goto L10ee
            r14 = r52
            r11 = 44
            if (r14 != r11) goto L10ee
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_RFC_2822
            if (r0 != 0) goto L10e4
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss Z"
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r2)
            com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_RFC_2822 = r0
        L10e4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r10, r1, r7)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.parse(r2, r0)
            return r0
        L10ee:
            r17 = 0
            return r17
        L10f1:
            r10 = r0
            java.lang.String r0 = new java.lang.String
            int r2 = r10.length
            int r2 = r2 - r1
            r0.<init>(r10, r1, r2)
            java.time.format.DateTimeParseException r1 = new java.time.format.DateTimeParseException
            java.lang.String r2 = "illegal input "
            java.lang.String r2 = r2.concat(r0)
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
    }

    public static java.time.ZonedDateTime parseZonedDateTime16(byte[] r17, int r18, java.time.ZoneId r19) {
            r0 = r17
            int r2 = r18 + 16
            int r3 = r0.length
            java.lang.String r5 = "illegal input "
            if (r2 > r3) goto L102
            r2 = r0[r18]
            char r2 = (char) r2
            int r3 = r18 + 1
            r3 = r0[r3]
            char r3 = (char) r3
            int r6 = r18 + 2
            r6 = r0[r6]
            char r6 = (char) r6
            int r7 = r18 + 3
            r7 = r0[r7]
            char r7 = (char) r7
            int r8 = r18 + 4
            r8 = r0[r8]
            char r8 = (char) r8
            int r9 = r18 + 5
            r9 = r0[r9]
            char r9 = (char) r9
            int r10 = r18 + 6
            r10 = r0[r10]
            char r10 = (char) r10
            int r11 = r18 + 7
            r11 = r0[r11]
            char r11 = (char) r11
            int r12 = r18 + 8
            r12 = r0[r12]
            char r12 = (char) r12
            int r13 = r18 + 9
            r13 = r0[r13]
            char r13 = (char) r13
            int r14 = r18 + 10
            r15 = r0[r14]
            char r15 = (char) r15
            int r16 = r18 + 13
            r4 = r0[r16]
            char r4 = (char) r4
            r16 = r5
            r5 = 45
            r1 = 16
            if (r8 != r5) goto L54
            if (r11 != r5) goto L54
            r8 = 43
            if (r15 == r8) goto L5b
            if (r15 != r5) goto L54
            goto L5b
        L54:
            r3 = r18
            r4 = r16
            r5 = 0
            goto Lf3
        L5b:
            r5 = 58
            if (r4 != r5) goto L54
            r4 = 48
            if (r2 < r4) goto Ldf
            r5 = 57
            if (r2 > r5) goto Ldf
            if (r3 < r4) goto Ldf
            if (r3 > r5) goto Ldf
            if (r6 < r4) goto Ldf
            if (r6 > r5) goto Ldf
            if (r7 < r4) goto Ldf
            if (r7 > r5) goto Ldf
            int r2 = r2 - r4
            int r2 = r2 * 1000
            r8 = 100
            int r2 = p.a.z(r3, r4, r8, r2)
            r3 = 10
            int r2 = p.a.z(r6, r4, r3, r2)
            int r7 = r7 - r4
            int r7 = r7 + r2
            if (r9 < r4) goto Lcb
            if (r9 > r5) goto Lcb
            if (r10 < r4) goto Lcb
            if (r10 > r5) goto Lcb
            int r9 = r9 - r4
            int r9 = r9 * r3
            int r10 = r10 - r4
            int r10 = r10 + r9
            if (r12 < r4) goto Lb7
            if (r12 > r5) goto Lb7
            if (r13 < r4) goto Lb7
            if (r13 > r5) goto Lb7
            int r12 = r12 - r4
            int r12 = r12 * r3
            int r13 = r13 - r4
            int r13 = r13 + r12
            java.lang.String r1 = new java.lang.String
            r2 = 6
            r1.<init>(r0, r14, r2)
            r0 = r19
            java.time.ZoneId r0 = getZoneId(r1, r0)
            java.time.LocalDate r1 = java.time.LocalDate.of(r7, r10, r13)
            java.time.LocalTime r2 = java.time.LocalTime.MIN
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r1, r2)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r1, r0)
            return r0
        Lb7:
            java.lang.String r2 = new java.lang.String
            r3 = r18
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r4 = r16
            java.lang.String r1 = r4.concat(r2)
            r5 = 0
            r0.<init>(r1, r2, r5)
            throw r0
        Lcb:
            r3 = r18
            r4 = r16
            r5 = 0
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r4.concat(r2)
            r0.<init>(r1, r2, r5)
            throw r0
        Ldf:
            r3 = r18
            r4 = r16
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r4.concat(r2)
            r5 = 0
            r0.<init>(r1, r2, r5)
            throw r0
        Lf3:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r4.concat(r2)
            r0.<init>(r1, r2, r5)
            throw r0
        L102:
            r3 = r18
            r4 = r5
            r5 = 0
            java.lang.String r1 = new java.lang.String
            int r2 = r0.length
            int r2 = r2 - r3
            r1.<init>(r0, r3, r2)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r1)
            r0.<init>(r2, r1, r5)
            throw r0
    }

    public static java.time.ZonedDateTime parseZonedDateTime16(char[] r17, int r18, java.time.ZoneId r19) {
            r0 = r17
            int r2 = r18 + 16
            int r3 = r0.length
            java.lang.String r5 = "illegal input "
            if (r2 > r3) goto Lf6
            char r2 = r0[r18]
            int r3 = r18 + 1
            char r3 = r0[r3]
            int r6 = r18 + 2
            char r6 = r0[r6]
            int r7 = r18 + 3
            char r7 = r0[r7]
            int r8 = r18 + 4
            char r8 = r0[r8]
            int r9 = r18 + 5
            char r9 = r0[r9]
            int r10 = r18 + 6
            char r10 = r0[r10]
            int r11 = r18 + 7
            char r11 = r0[r11]
            int r12 = r18 + 8
            char r12 = r0[r12]
            int r13 = r18 + 9
            char r13 = r0[r13]
            int r14 = r18 + 10
            char r15 = r0[r14]
            int r16 = r18 + 13
            char r4 = r0[r16]
            r16 = r5
            r5 = 45
            r1 = 16
            if (r8 != r5) goto L48
            if (r11 != r5) goto L48
            r8 = 43
            if (r15 == r8) goto L4f
            if (r15 != r5) goto L48
            goto L4f
        L48:
            r3 = r18
            r4 = r16
            r5 = 0
            goto Le7
        L4f:
            r5 = 58
            if (r4 != r5) goto L48
            r4 = 48
            if (r2 < r4) goto Ld3
            r5 = 57
            if (r2 > r5) goto Ld3
            if (r3 < r4) goto Ld3
            if (r3 > r5) goto Ld3
            if (r6 < r4) goto Ld3
            if (r6 > r5) goto Ld3
            if (r7 < r4) goto Ld3
            if (r7 > r5) goto Ld3
            int r2 = r2 - r4
            int r2 = r2 * 1000
            r8 = 100
            int r2 = p.a.z(r3, r4, r8, r2)
            r3 = 10
            int r2 = p.a.z(r6, r4, r3, r2)
            int r7 = r7 - r4
            int r7 = r7 + r2
            if (r9 < r4) goto Lbf
            if (r9 > r5) goto Lbf
            if (r10 < r4) goto Lbf
            if (r10 > r5) goto Lbf
            int r9 = r9 - r4
            int r9 = r9 * r3
            int r10 = r10 - r4
            int r10 = r10 + r9
            if (r12 < r4) goto Lab
            if (r12 > r5) goto Lab
            if (r13 < r4) goto Lab
            if (r13 > r5) goto Lab
            int r12 = r12 - r4
            int r12 = r12 * r3
            int r13 = r13 - r4
            int r13 = r13 + r12
            java.lang.String r1 = new java.lang.String
            r2 = 6
            r1.<init>(r0, r14, r2)
            r0 = r19
            java.time.ZoneId r0 = getZoneId(r1, r0)
            java.time.LocalDate r1 = java.time.LocalDate.of(r7, r10, r13)
            java.time.LocalTime r2 = java.time.LocalTime.MIN
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r1, r2)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r1, r0)
            return r0
        Lab:
            java.lang.String r2 = new java.lang.String
            r3 = r18
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            r4 = r16
            java.lang.String r1 = r4.concat(r2)
            r5 = 0
            r0.<init>(r1, r2, r5)
            throw r0
        Lbf:
            r3 = r18
            r4 = r16
            r5 = 0
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r4.concat(r2)
            r0.<init>(r1, r2, r5)
            throw r0
        Ld3:
            r3 = r18
            r4 = r16
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r4.concat(r2)
            r5 = 0
            r0.<init>(r1, r2, r5)
            throw r0
        Le7:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r3, r1)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r1 = r4.concat(r2)
            r0.<init>(r1, r2, r5)
            throw r0
        Lf6:
            r3 = r18
            r4 = r5
            r5 = 0
            java.lang.String r1 = new java.lang.String
            int r2 = r0.length
            int r2 = r2 - r3
            r1.<init>(r0, r3, r2)
            java.time.format.DateTimeParseException r0 = new java.time.format.DateTimeParseException
            java.lang.String r2 = r4.concat(r1)
            r0.<init>(r2, r1, r5)
            throw r0
    }

    public static java.time.ZonedDateTime parseZonedDateTimeCookie(java.lang.String r3) {
            java.lang.String r0 = " CST"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L2c
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_COOKIE_LOCAL
            if (r0 != 0) goto L16
            java.lang.String r0 = "EEEE, dd-MMM-yyyy HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r1)
            com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_COOKIE_LOCAL = r0
        L16:
            int r1 = r3.length()
            int r1 = r1 + (-4)
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.parse(r3, r0)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.of(r3, r0)
            return r3
        L2c:
            java.time.format.DateTimeFormatter r0 = com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_COOKIE
            if (r0 != 0) goto L3a
            java.lang.String r0 = "EEEE, dd-MMM-yyyy HH:mm:ss zzz"
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r1)
            com.alibaba.fastjson2.util.DateUtils.DATE_TIME_FORMATTER_COOKIE = r0
        L3a:
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.parse(r3, r0)
            return r3
    }

    public static int readNanos(byte[] r7, int r8, int r9) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            r3 = 9
            if (r1 >= r8) goto L23
            int r4 = r9 + r1
            r4 = r7[r4]
            int r4 = r4 + (-48)
            r5 = 1
            if (r4 >= 0) goto L12
            r6 = r5
            goto L13
        L12:
            r6 = r0
        L13:
            if (r4 <= r3) goto L16
            goto L17
        L16:
            r5 = r0
        L17:
            r3 = r6 | r5
            if (r3 == 0) goto L1d
            r7 = -1
            return r7
        L1d:
            int r2 = r2 * 10
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L3
        L23:
            int[] r7 = com.alibaba.fastjson2.util.DateUtils.POWERS
            int r3 = r3 - r8
            r8 = r3 & 15
            r7 = r7[r8]
            int r2 = r2 * r7
            return r2
    }

    public static int readNanos(char[] r7, int r8, int r9) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            r3 = 9
            if (r1 >= r8) goto L23
            int r4 = r9 + r1
            char r4 = r7[r4]
            int r4 = r4 + (-48)
            r5 = 1
            if (r4 >= 0) goto L12
            r6 = r5
            goto L13
        L12:
            r6 = r0
        L13:
            if (r4 <= r3) goto L16
            goto L17
        L16:
            r5 = r0
        L17:
            r3 = r6 | r5
            if (r3 == 0) goto L1d
            r7 = -1
            return r7
        L1d:
            int r2 = r2 * 10
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L3
        L23:
            int[] r7 = com.alibaba.fastjson2.util.DateUtils.POWERS
            int r3 = r3 - r8
            r8 = r3 & 15
            r7 = r7[r8]
            int r2 = r2 * r7
            return r2
    }

    public static java.lang.String toString(long r29, boolean r31, java.time.ZoneId r32) {
            r0 = r29
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = java.lang.Math.floorDiv(r0, r2)
            java.time.ZoneId r6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            r7 = r32
            if (r7 == r6) goto L28
            java.time.zone.ZoneRules r6 = r7.getRules()
            java.time.zone.ZoneRules r8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r6 != r8) goto L17
            goto L28
        L17:
            java.time.Instant r6 = java.time.Instant.ofEpochMilli(r0)
            java.time.zone.ZoneRules r7 = r7.getRules()
            java.time.ZoneOffset r6 = r7.getOffset(r6)
            int r6 = r6.getTotalSeconds()
            goto L2c
        L28:
            int r6 = getShanghaiZoneOffsetTotalSeconds(r4)
        L2c:
            long r7 = (long) r6
            long r4 = r4 + r7
            r7 = 86400(0x15180, double:4.26873E-319)
            long r9 = java.lang.Math.floorDiv(r4, r7)
            long r4 = java.lang.Math.floorMod(r4, r7)
            int r4 = (int) r4
            r7 = 719468(0xafa6c, double:3.554644E-318)
            long r7 = r7 + r9
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r13 = 1
            r15 = 146097(0x23ab1, double:7.21815E-319)
            r17 = 400(0x190, double:1.976E-321)
            if (r5 >= 0) goto L58
            r19 = 719469(0xafa6d, double:3.55465E-318)
            long r9 = r9 + r19
            long r9 = r9 / r15
            long r9 = r9 - r13
            long r19 = r9 * r17
            long r9 = -r9
            long r9 = r9 * r15
            long r7 = r7 + r9
            goto L5a
        L58:
            r19 = r11
        L5a:
            long r9 = r7 * r17
            r21 = 591(0x24f, double:2.92E-321)
            long r9 = r9 + r21
            long r9 = r9 / r15
            r15 = 365(0x16d, double:1.803E-321)
            long r21 = r9 * r15
            r23 = 4
            long r25 = r9 / r23
            long r25 = r25 + r21
            r21 = 100
            long r27 = r9 / r21
            long r25 = r25 - r27
            long r27 = r9 / r17
            long r27 = r27 + r25
            long r25 = r7 - r27
            int r5 = (r25 > r11 ? 1 : (r25 == r11 ? 0 : -1))
            if (r5 >= 0) goto L88
            long r9 = r9 - r13
            long r15 = r15 * r9
            long r13 = r9 / r23
            long r13 = r13 + r15
            long r15 = r9 / r21
            long r13 = r13 - r15
            long r15 = r9 / r17
            long r15 = r15 + r13
            long r25 = r7 - r15
        L88:
            r7 = r25
            long r9 = r9 + r19
            int r5 = (int) r7
            int r7 = r5 * 5
            r8 = 2
            int r7 = r7 + r8
            int r7 = r7 / 153
            int r13 = r7 + 2
            int r13 = r13 % 12
            r14 = 1
            int r13 = r13 + r14
            int r15 = r7 * 306
            int r15 = r15 + 5
            r8 = 10
            int r15 = r15 / r8
            int r5 = r5 - r15
            int r5 = r5 + r14
            int r7 = r7 / r8
            r15 = r11
            long r11 = (long) r7
            long r9 = r9 + r11
            r11 = -999999999(0xffffffffc4653601, double:NaN)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 < 0) goto L180
            r11 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L180
            int r7 = (int) r9
            long r9 = (long) r4
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 < 0) goto L174
            r11 = 86399(0x1517f, double:4.2687E-319)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 > 0) goto L174
            r11 = 3600(0xe10, double:1.7786E-320)
            long r11 = r9 / r11
            int r4 = (int) r11
            int r11 = r4 * 3600
            long r11 = (long) r11
            long r9 = r9 - r11
            r11 = 60
            long r11 = r9 / r11
            int r11 = (int) r11
            int r12 = r11 * 60
            long r14 = (long) r12
            long r9 = r9 - r14
            int r9 = (int) r9
            long r0 = java.lang.Math.floorMod(r0, r2)
            int r0 = (int) r0
            r1 = 0
            if (r0 != 0) goto Lde
            r2 = r1
            goto Led
        Lde:
            r2 = 4
            if (r0 >= r8) goto Le2
            goto Led
        Le2:
            int r3 = r0 % 100
            if (r3 != 0) goto Le8
            r2 = 2
            goto Led
        Le8:
            int r3 = r0 % 10
            if (r3 != 0) goto Led
            r2 = 3
        Led:
            if (r31 == 0) goto Lf5
            if (r6 != 0) goto Lf3
            r14 = 1
            goto Lf6
        Lf3:
            r14 = 6
            goto Lf6
        Lf5:
            r14 = r1
        Lf6:
            int r3 = r2 + 19
            int r14 = r14 + r3
            byte[] r10 = new byte[r14]
            com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r10, r1, r7, r13, r5)
            r5 = 32
            r10[r8] = r5
            r5 = 11
            com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r10, r5, r4, r11, r9)
            r4 = 48
            if (r2 <= 0) goto L136
            r5 = 46
            r7 = 19
            r10[r7] = r5
            r5 = 20
        L113:
            if (r5 >= r14) goto L11a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L113
        L11a:
            if (r0 >= r8) goto L120
            com.alibaba.fastjson2.util.IOUtils.getChars(r0, r3, r10)
            goto L136
        L120:
            int r5 = r0 % 100
            if (r5 != 0) goto L12a
            int r0 = r0 / 100
            com.alibaba.fastjson2.util.IOUtils.getChars(r0, r3, r10)
            goto L136
        L12a:
            int r5 = r0 % 10
            if (r5 != 0) goto L133
            int r0 = r0 / r8
            com.alibaba.fastjson2.util.IOUtils.getChars(r0, r3, r10)
            goto L136
        L133:
            com.alibaba.fastjson2.util.IOUtils.getChars(r0, r3, r10)
        L136:
            if (r31 == 0) goto L16c
            int r0 = r6 / 3600
            if (r6 != 0) goto L141
            r0 = 90
            r10[r3] = r0
            goto L16c
        L141:
            int r5 = java.lang.Math.abs(r0)
            if (r0 < 0) goto L14c
            r7 = 43
            r10[r3] = r7
            goto L150
        L14c:
            r7 = 45
            r10[r3] = r7
        L150:
            int r3 = r2 + 20
            r10[r3] = r4
            int r3 = r2 + 22
            com.alibaba.fastjson2.util.IOUtils.getChars(r5, r3, r10)
            r5 = 58
            r10[r3] = r5
            int r2 = r2 + 23
            r10[r2] = r4
            int r0 = r0 * 3600
            int r6 = r6 - r0
            int r6 = r6 / 60
            if (r6 >= 0) goto L169
            int r6 = -r6
        L169:
            com.alibaba.fastjson2.util.IOUtils.getChars(r6, r14, r10)
        L16c:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            r0.<init>(r10, r1, r14, r2)
            return r0
        L174:
            java.time.DateTimeException r0 = new java.time.DateTimeException
            java.lang.String r1 = "Invalid secondOfDay "
            java.lang.String r1 = bc.e.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L180:
            java.time.DateTimeException r0 = new java.time.DateTimeException
            java.lang.String r1 = "Invalid year "
            java.lang.String r1 = bc.e.g(r9, r1)
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String toString(java.util.Date r3) {
            long r0 = r3.getTime()
            r3 = 0
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r3 = toString(r0, r3, r2)
            return r3
    }

    public static long utcSeconds(int r3, int r4, int r5, int r6, int r7, int r8) {
            int r0 = r3 * 365
            int r1 = r3 + 3
            int r1 = r1 / 4
            int r2 = r3 + 99
            int r2 = r2 / 100
            int r1 = r1 - r2
            int r2 = r3 + 399
            int r2 = r2 / 400
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r4 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / 12
            int r0 = r0 + r2
            int r5 = r5 + (-1)
            int r5 = r5 + r0
            long r0 = (long) r5
            r5 = 2
            if (r4 <= r5) goto L34
            r4 = 1
            long r4 = r0 - r4
            r2 = r3 & 3
            if (r2 != 0) goto L31
            int r2 = r3 % 100
            if (r2 != 0) goto L2f
            int r3 = r3 % 400
            if (r3 != 0) goto L31
        L2f:
            r0 = r4
            goto L34
        L31:
            r3 = 2
            long r0 = r0 - r3
        L34:
            r3 = 719528(0xafaa8, double:3.55494E-318)
            long r0 = r0 - r3
            r3 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r3
            int r6 = r6 * 3600
            long r3 = (long) r6
            long r0 = r0 + r3
            int r7 = r7 * 60
            long r3 = (long) r7
            long r0 = r0 + r3
            long r3 = (long) r8
            long r0 = r0 + r3
            return r0
    }

    public static long ymd(byte[] r8, int r9) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r9
            long r1 = r1 + r3
            long r8 = r0.getLong(r8, r1)
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L12
            long r8 = java.lang.Long.reverseBytes(r8)
        L12:
            r0 = 280375481794560(0xff0000ff0000, double:1.3852389349088E-309)
            long r0 = r0 & r8
            r2 = 49478026199040(0x2d00002d0000, double:2.4445392968979E-310)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = -1085366475377544976(0xf0f000f0f000f0f0, double:-1.0176920443765422E236)
            long r2 = r8 & r0
            r4 = 3472275519666401328(0x3030003030003030, double:1.3818504690893197E-76)
            long r2 = r2 - r4
            r4 = 1085086099895750415(0xf0f000f0f000f0f, double:3.808538281982251E-236)
            long r4 = r4 & r8
            r6 = 434034439958300166(0x606000606000606, double:1.211988592074742E-279)
            long r4 = r4 + r6
            long r0 = r0 & r4
            long r0 = r0 | r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L43
            goto L5a
        L43:
            r0 = 4222124902318095(0xf00000f00000f, double:2.0860068666861996E-308)
            long r0 = r0 & r8
            r2 = 3
            long r2 = r0 << r2
            r4 = 1
            long r0 = r0 << r4
            long r2 = r2 + r0
            r0 = 1080863974993432320(0xf00000f00000f00, double:1.965710727226218E-236)
            long r8 = r8 & r0
            r0 = 8
            long r8 = r8 >> r0
            long r2 = r2 + r8
            return r2
        L5a:
            r8 = -1
            return r8
    }

    public static int yy(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            short r5 = r0.getShort(r5, r1)
            boolean r6 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r6 == 0) goto L12
            short r5 = java.lang.Short.reverseBytes(r5)
        L12:
            r6 = 61680(0xf0f0, float:8.6432E-41)
            r0 = r5 & r6
            int r0 = r0 + (-12336)
            r1 = r5 & 3855(0xf0f, float:5.402E-42)
            int r2 = r1 + 1542
            r6 = r6 & r2
            r6 = r6 | r0
            if (r6 == 0) goto L23
            r5 = -1
            return r5
        L23:
            r5 = r5 & 15
            int r5 = r5 * 1000
            int r6 = r1 >> 8
            int r6 = r6 * 100
            int r6 = r6 + r5
            return r6
    }

    public static java.time.ZoneOffset zoneOffset(byte[] r1, int r2, int r3) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            java.time.ZoneOffset r1 = java.time.ZoneOffset.of(r0)
            return r1
    }

    public static java.time.ZoneOffset zoneOffset(char[] r1, int r2, int r3) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            java.time.ZoneOffset r1 = java.time.ZoneOffset.of(r0)
            return r1
    }
}
