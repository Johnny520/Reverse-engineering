package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JdbcSupport {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ClobWriter implements com.alibaba.fastjson2.writer.ObjectWriter {
        public ClobWriter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
                r0 = this;
                java.sql.Clob r2 = (java.sql.Clob) r2
                java.io.Reader r2 = r2.getCharacterStream()     // Catch: java.sql.SQLException -> La
                r1.writeString(r2)
                return
            La:
                r1 = move-exception
                java.lang.String r2 = "get getCharacterStream error"
                ah.a.x(r2, r1)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class DateReader extends com.alibaba.fastjson2.reader.ObjectReaderImplDate {
        public DateReader(java.lang.String r1, java.util.Locale r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
                r0 = this;
                java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)
                return r1
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
                r2 = this;
                boolean r4 = r3.isInt()
                r5 = 1000(0x3e8, double:4.94E-321)
                if (r4 == 0) goto L17
                long r3 = r3.readInt64Value()
                boolean r7 = r2.formatUnixTime
                if (r7 == 0) goto L11
                long r3 = r3 * r5
            L11:
                java.sql.Date r5 = new java.sql.Date
                r5.<init>(r3)
                return r5
            L17:
                boolean r4 = r3.readIfNull()
                r7 = 0
                if (r4 == 0) goto L1f
                return r7
            L1f:
                boolean r4 = r2.formatUnixTime
                if (r4 == 0) goto L38
                boolean r4 = r3.isString()
                if (r4 == 0) goto L38
                java.lang.String r3 = r3.readString()
                long r3 = java.lang.Long.parseLong(r3)
                long r3 = r3 * r5
                java.sql.Date r5 = new java.sql.Date
                r5.<init>(r3)
                return r5
            L38:
                java.lang.String r4 = r2.format
                if (r4 == 0) goto L91
                boolean r4 = r2.formatISO8601
                if (r4 != 0) goto L91
                boolean r4 = r2.formatMillis
                if (r4 == 0) goto L45
                goto L91
            L45:
                java.lang.String r4 = r3.readString()
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L50
                return r7
            L50:
                java.time.format.DateTimeFormatter r5 = r2.getDateFormatter()
                boolean r6 = r2.formatHasHour
                if (r6 != 0) goto L73
                java.time.LocalDate r4 = java.time.LocalDate.parse(r4, r5)
                java.time.LocalTime r5 = java.time.LocalTime.MIN
                java.time.LocalDateTime r4 = java.time.LocalDateTime.of(r4, r5)
                com.alibaba.fastjson2.JSONReader$Context r3 = r3.getContext()
                java.time.ZoneId r3 = r3.getZoneId()
                java.time.ZonedDateTime r3 = r4.atZone(r3)
                java.time.Instant r3 = r3.toInstant()
                goto L87
            L73:
                java.time.LocalDateTime r4 = java.time.LocalDateTime.parse(r4, r5)
                com.alibaba.fastjson2.JSONReader$Context r3 = r3.getContext()
                java.time.ZoneId r3 = r3.getZoneId()
                java.time.ZonedDateTime r3 = r4.atZone(r3)
                java.time.Instant r3 = r3.toInstant()
            L87:
                java.sql.Date r4 = new java.sql.Date
                long r5 = r3.toEpochMilli()
                r4.<init>(r5)
                return r4
            L91:
                java.time.LocalDateTime r4 = r3.readLocalDateTime()
                if (r4 == 0) goto La0
                java.time.LocalDate r3 = r4.toLocalDate()
                java.sql.Date r3 = java.sql.Date.valueOf(r3)
                return r3
            La0:
                boolean r4 = r3.wasNull()
                if (r4 == 0) goto La7
                return r7
            La7:
                long r4 = r3.readMillisFromString()
                r0 = 0
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 != 0) goto Lb8
                boolean r3 = r3.wasNull()
                if (r3 == 0) goto Lb8
                return r7
            Lb8:
                java.sql.Date r3 = new java.sql.Date
                r3.<init>(r4)
                return r3
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimeReader extends com.alibaba.fastjson2.reader.ObjectReaderImplDate {
        public TimeReader(java.lang.String r1, java.util.Locale r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
                r0 = this;
                java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)
                return r1
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r9, java.lang.reflect.Type r10, java.lang.Object r11, long r12) {
                r8 = this;
                boolean r10 = r9.isInt()
                r11 = 1000(0x3e8, double:4.94E-321)
                if (r10 == 0) goto L17
                long r9 = r9.readInt64Value()
                boolean r13 = r8.formatUnixTime
                if (r13 == 0) goto L11
                long r9 = r9 * r11
            L11:
                java.sql.Time r11 = new java.sql.Time
                r11.<init>(r9)
                return r11
            L17:
                boolean r10 = r9.readIfNull()
                r13 = 0
                if (r10 == 0) goto L1f
                return r13
            L1f:
                boolean r10 = r8.formatISO8601
                if (r10 != 0) goto L11b
                boolean r10 = r8.formatMillis
                if (r10 == 0) goto L29
                goto L11b
            L29:
                boolean r10 = r8.formatUnixTime
                if (r10 == 0) goto L3c
                java.lang.Long r9 = r9.readInt64()
                long r9 = r9.longValue()
                java.sql.Time r13 = new java.sql.Time
                long r9 = r9 * r11
                r13.<init>(r9)
                return r13
            L3c:
                java.lang.String r10 = r8.format
                r11 = 1
                if (r10 == 0) goto L97
                java.util.Locale r10 = r9.getLocale()
                java.time.format.DateTimeFormatter r10 = r8.getDateFormatter(r10)
                if (r10 == 0) goto L89
                java.lang.String r12 = r9.readString()
                boolean r0 = r12.isEmpty()
                if (r0 == 0) goto L56
                return r13
            L56:
                boolean r13 = r8.formatHasHour
                if (r13 != 0) goto L65
                java.time.LocalDate r10 = java.time.LocalDate.parse(r12, r10)
                java.time.LocalTime r11 = java.time.LocalTime.MIN
                java.time.LocalDateTime r10 = java.time.LocalDateTime.of(r10, r11)
                goto L7c
            L65:
                boolean r13 = r8.formatHasDay
                if (r13 != 0) goto L78
                r13 = 1970(0x7b2, float:2.76E-42)
                java.time.LocalDate r11 = java.time.LocalDate.of(r13, r11, r11)
                java.time.LocalTime r10 = java.time.LocalTime.parse(r12, r10)
                java.time.LocalDateTime r10 = java.time.LocalDateTime.of(r11, r10)
                goto L7c
            L78:
                java.time.LocalDateTime r10 = java.time.LocalDateTime.parse(r12, r10)
            L7c:
                com.alibaba.fastjson2.JSONReader$Context r9 = r9.getContext()
                java.time.ZoneId r9 = r9.getZoneId()
                java.time.ZonedDateTime r9 = r10.atZone(r9)
                goto L8d
            L89:
                java.time.ZonedDateTime r9 = r9.readZonedDateTime()
            L8d:
                java.time.Instant r9 = r9.toInstant()
                long r9 = r9.toEpochMilli()
                goto L115
            L97:
                java.lang.String r9 = r9.readString()
                java.lang.String r10 = "0000-00-00"
                boolean r10 = r10.equals(r9)
                if (r10 != 0) goto L113
                java.lang.String r10 = "0000-00-00 00:00:00"
                boolean r10 = r10.equals(r9)
                if (r10 == 0) goto Lac
                goto L113
            Lac:
                int r10 = r9.length()
                r12 = 9
                if (r10 != r12) goto Lfe
                r10 = 8
                char r10 = r9.charAt(r10)
                r12 = 90
                if (r10 != r12) goto Lfe
                r10 = 0
                char r0 = r9.charAt(r10)
                char r1 = r9.charAt(r11)
                r10 = 2
                char r2 = r9.charAt(r10)
                r10 = 3
                char r3 = r9.charAt(r10)
                r10 = 4
                char r4 = r9.charAt(r10)
                r10 = 5
                char r5 = r9.charAt(r10)
                r10 = 6
                char r6 = r9.charAt(r10)
                r10 = 7
                char r7 = r9.charAt(r10)
                java.time.LocalTime r9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime(r0, r1, r2, r3, r4, r5, r6, r7)
                java.time.LocalDate r10 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101
                java.time.LocalDateTime r9 = java.time.LocalDateTime.of(r10, r9)
                java.time.ZoneId r10 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
                java.time.ZonedDateTime r9 = r9.atZone(r10)
                java.time.Instant r9 = r9.toInstant()
                long r9 = r9.toEpochMilli()
                goto L115
            Lfe:
                boolean r10 = r9.isEmpty()
                if (r10 != 0) goto L112
                java.lang.String r10 = "null"
                boolean r10 = r10.equals(r9)
                if (r10 == 0) goto L10d
                goto L112
            L10d:
                java.sql.Time r9 = java.sql.Time.valueOf(r9)
                return r9
            L112:
                return r13
            L113:
                r9 = 0
            L115:
                java.sql.Time r11 = new java.sql.Time
                r11.<init>(r9)
                return r11
            L11b:
                long r9 = r9.readMillisFromString()
                java.sql.Time r11 = new java.sql.Time
                r11.<init>(r9)
                return r11
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimeWriter extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
        public static final com.alibaba.fastjson2.util.JdbcSupport.TimeWriter INSTANCE = null;

        static {
                com.alibaba.fastjson2.util.JdbcSupport$TimeWriter r0 = new com.alibaba.fastjson2.util.JdbcSupport$TimeWriter
                r1 = 0
                r0.<init>(r1)
                com.alibaba.fastjson2.util.JdbcSupport.TimeWriter.INSTANCE = r0
                return
        }

        public TimeWriter(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static com.alibaba.fastjson2.util.JdbcSupport.TimeWriter of(java.lang.String r1) {
                if (r1 != 0) goto L5
                com.alibaba.fastjson2.util.JdbcSupport$TimeWriter r1 = com.alibaba.fastjson2.util.JdbcSupport.TimeWriter.INSTANCE
                return r1
            L5:
                com.alibaba.fastjson2.util.JdbcSupport$TimeWriter r0 = new com.alibaba.fastjson2.util.JdbcSupport$TimeWriter
                r0.<init>(r1)
                return r0
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(com.alibaba.fastjson2.JSONWriter r11, java.lang.Object r12, java.lang.Object r13, java.lang.reflect.Type r14, long r15) {
                r10 = this;
                if (r12 != 0) goto L6
                r11.writeNull()
                return
            L6:
                com.alibaba.fastjson2.JSONWriter$Context r13 = r11.context
                boolean r14 = r10.formatUnixTime
                if (r14 != 0) goto Lb6
                boolean r14 = r13.isDateFormatUnixTime()
                if (r14 == 0) goto L14
                goto Lb6
            L14:
                boolean r14 = r10.formatMillis
                if (r14 != 0) goto Lac
                boolean r14 = r13.isDateFormatMillis()
                if (r14 == 0) goto L20
                goto Lac
            L20:
                boolean r14 = r10.formatISO8601
                if (r14 != 0) goto L73
                boolean r14 = r13.isDateFormatISO8601()
                if (r14 == 0) goto L2b
                goto L73
            L2b:
                java.lang.String r14 = r10.format
                java.lang.String r0 = "dd"
                if (r14 == 0) goto L3c
                boolean r14 = r14.contains(r0)
                if (r14 != 0) goto L3c
                java.time.format.DateTimeFormatter r14 = r10.getDateFormatter()
                goto L3d
            L3c:
                r14 = 0
            L3d:
                if (r14 != 0) goto L4f
                java.lang.String r1 = r13.getDateFormat()
                if (r1 == 0) goto L4f
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4f
                java.time.format.DateTimeFormatter r14 = r13.getDateFormatter()
            L4f:
                if (r14 != 0) goto L59
                java.lang.String r12 = r12.toString()
                r11.writeString(r12)
                return
            L59:
                java.util.Date r12 = (java.util.Date) r12
                java.time.ZoneId r13 = r13.getZoneId()
                long r0 = r12.getTime()
                java.time.Instant r12 = java.time.Instant.ofEpochMilli(r0)
                java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r12, r13)
                java.lang.String r12 = r14.format(r12)
                r11.writeString(r12)
                return
            L73:
                java.time.ZoneId r13 = r13.getZoneId()
                java.util.Date r12 = (java.util.Date) r12
                long r0 = r12.getTime()
                java.time.Instant r12 = java.time.Instant.ofEpochMilli(r0)
                java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r12, r13)
                java.time.ZoneOffset r13 = r12.getOffset()
                int r8 = r13.getTotalSeconds()
                int r1 = r12.getYear()
                int r2 = r12.getMonthValue()
                int r3 = r12.getDayOfMonth()
                int r4 = r12.getHour()
                int r5 = r12.getMinute()
                int r6 = r12.getSecond()
                r7 = 0
                r9 = 1
                r0 = r11
                r0.writeDateTimeISO8601(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            Lac:
                java.util.Date r12 = (java.util.Date) r12
                long r12 = r12.getTime()
                r11.writeInt64(r12)
                return
            Lb6:
                java.util.Date r12 = (java.util.Date) r12
                long r12 = r12.getTime()
                r1 = 1000(0x3e8, double:4.94E-321)
                long r12 = r12 / r1
                r11.writeInt64(r12)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimestampReader extends com.alibaba.fastjson2.reader.ObjectReaderImplDate {
        public TimestampReader(java.lang.String r1, java.util.Locale r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.lang.Object createTimestamp(long r2, int r4) {
                r1 = this;
                java.sql.Timestamp r0 = new java.sql.Timestamp
                r0.<init>(r2)
                if (r4 == 0) goto La
                r0.setNanos(r4)
            La:
                return r0
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
                r6 = this;
                boolean r0 = r7.isInt()
                if (r0 == 0) goto L17
                long r7 = r7.readInt64Value()
                boolean r9 = r6.formatUnixTime
                if (r9 == 0) goto L11
                r9 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 * r9
            L11:
                r9 = 0
                java.lang.Object r7 = r6.createTimestamp(r7, r9)
                return r7
            L17:
                boolean r0 = r7.readIfNull()
                if (r0 == 0) goto L1f
                r7 = 0
                return r7
            L1f:
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
                return r7
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
                r2 = this;
                boolean r4 = r3.isInt()
                if (r4 == 0) goto L17
                long r3 = r3.readInt64Value()
                boolean r5 = r2.formatUnixTime
                if (r5 == 0) goto L11
                r5 = 1000(0x3e8, double:4.94E-321)
                long r3 = r3 * r5
            L11:
                r5 = 0
                java.lang.Object r3 = r2.createTimestamp(r3, r5)
                return r3
            L17:
                boolean r4 = r3.nextIfNullOrEmptyString()
                r5 = 0
                if (r4 == 0) goto L1f
                return r5
            L1f:
                java.lang.String r4 = r2.format
                if (r4 == 0) goto L7b
                boolean r4 = r2.formatISO8601
                if (r4 != 0) goto L7b
                boolean r4 = r2.formatMillis
                if (r4 == 0) goto L2c
                goto L7b
            L2c:
                java.lang.String r4 = r3.readString()
                boolean r6 = r4.isEmpty()
                if (r6 == 0) goto L37
                return r5
            L37:
                java.time.format.DateTimeFormatter r5 = r2.getDateFormatter()
                boolean r6 = r2.formatHasHour
                if (r6 != 0) goto L5a
                java.time.LocalDate r4 = java.time.LocalDate.parse(r4, r5)
                java.time.LocalTime r5 = java.time.LocalTime.MIN
                java.time.LocalDateTime r4 = java.time.LocalDateTime.of(r4, r5)
                com.alibaba.fastjson2.JSONReader$Context r3 = r3.getContext()
                java.time.ZoneId r3 = r3.getZoneId()
                java.time.ZonedDateTime r3 = r4.atZone(r3)
                java.time.Instant r3 = r3.toInstant()
                goto L6e
            L5a:
                java.time.LocalDateTime r4 = java.time.LocalDateTime.parse(r4, r5)
                com.alibaba.fastjson2.JSONReader$Context r3 = r3.getContext()
                java.time.ZoneId r3 = r3.getZoneId()
                java.time.ZonedDateTime r3 = r4.atZone(r3)
                java.time.Instant r3 = r3.toInstant()
            L6e:
                long r4 = r3.toEpochMilli()
                int r3 = r3.getNano()
                java.lang.Object r3 = r2.createTimestamp(r4, r3)
                return r3
            L7b:
                java.time.LocalDateTime r4 = r3.readLocalDateTime()
                if (r4 == 0) goto L86
                java.sql.Timestamp r3 = java.sql.Timestamp.valueOf(r4)
                return r3
            L86:
                boolean r4 = r3.wasNull()
                if (r4 == 0) goto L8d
                return r5
            L8d:
                long r6 = r3.readMillisFromString()
                r0 = 0
                int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r4 != 0) goto L9e
                boolean r3 = r3.wasNull()
                if (r3 == 0) goto L9e
                return r5
            L9e:
                java.sql.Timestamp r3 = new java.sql.Timestamp
                r3.<init>(r6)
                return r3
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimestampWriter extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
        public TimestampWriter(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(com.alibaba.fastjson2.JSONWriter r12, java.lang.Object r13, java.lang.Object r14, java.lang.reflect.Type r15, long r16) {
                r11 = this;
                if (r13 != 0) goto L6
                r12.writeNull()
                return
            L6:
                com.alibaba.fastjson2.JSONWriter$Context r14 = r12.context
                java.sql.Timestamp r13 = (java.sql.Timestamp) r13
                boolean r15 = r11.formatUnixTime
                if (r15 != 0) goto Lb9
                boolean r15 = r14.isDateFormatUnixTime()
                if (r15 == 0) goto L16
                goto Lb9
            L16:
                java.time.ZoneId r15 = r14.getZoneId()
                java.time.Instant r0 = r13.toInstant()
                java.time.ZonedDateTime r15 = java.time.ZonedDateTime.ofInstant(r0, r15)
                java.time.ZoneOffset r0 = r15.getOffset()
                int r9 = r0.getTotalSeconds()
                boolean r0 = r11.formatISO8601
                r1 = 1000000(0xf4240, float:1.401298E-39)
                if (r0 != 0) goto L37
                boolean r0 = r14.isDateFormatISO8601()
                if (r0 == 0) goto L62
            L37:
                int r0 = r15.getNano()
                int r0 = r0 % r1
                if (r0 != 0) goto L62
                int r2 = r15.getYear()
                int r3 = r15.getMonthValue()
                int r4 = r15.getDayOfMonth()
                int r5 = r15.getHour()
                int r6 = r15.getMinute()
                int r7 = r15.getSecond()
                int r13 = r15.getNano()
                int r8 = r13 / r1
                r10 = 1
                r1 = r12
                r1.writeDateTimeISO8601(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            L62:
                java.time.format.DateTimeFormatter r0 = r11.getDateFormatter()
                if (r0 != 0) goto L6c
                java.time.format.DateTimeFormatter r0 = r14.getDateFormatter()
            L6c:
                if (r0 != 0) goto Lb1
                boolean r0 = r11.formatMillis
                if (r0 != 0) goto La9
                boolean r14 = r14.isDateFormatMillis()
                if (r14 == 0) goto L79
                goto La9
            L79:
                int r13 = r13.getNanos()
                int r2 = r15.getYear()
                int r3 = r15.getMonthValue()
                int r4 = r15.getDayOfMonth()
                int r5 = r15.getHour()
                int r6 = r15.getMinute()
                int r7 = r15.getSecond()
                int r14 = r13 % r1
                if (r14 != 0) goto La1
                int r8 = r13 / r1
                r10 = 0
                r1 = r12
                r1.writeDateTimeISO8601(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            La1:
                java.time.LocalDateTime r13 = r15.toLocalDateTime()
                r12.writeLocalDateTime(r13)
                return
            La9:
                long r13 = r13.getTime()
                r12.writeInt64(r13)
                return
            Lb1:
                java.lang.String r13 = r0.format(r15)
                r12.writeString(r13)
                return
            Lb9:
                long r13 = r13.getTime()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r13 = r13 / r2
                r12.writeInt64(r13)
                return
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
                r2 = this;
                if (r4 != 0) goto L6
                r3.writeNull()
                return
            L6:
                java.lang.String r0 = r2.format
                if (r0 == 0) goto Le
                r2.write(r3, r4, r5, r6, r7)
                return
            Le:
                java.sql.Timestamp r4 = (java.sql.Timestamp) r4
                long r5 = r4.getTime()
                int r7 = r4.getNanos()
                r4.toLocalDateTime()
                r0 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r0
                r3.writeInstant(r5, r7)
                return
        }
    }

    public JdbcSupport() {
            r0 = this;
            r0.<init>()
            return
    }
}
