package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplDate extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.reader.ObjectReader {
    public static final com.alibaba.fastjson2.reader.ObjectReaderImplDate INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplDate
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE = r0
            return
    }

    public ObjectReaderImplDate(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplDate of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r1 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplDate
            r0.<init>(r1, r2)
            return r0
    }

    private java.lang.Object readDate(com.alibaba.fastjson2.JSONReader r14) {
            r13 = this;
            boolean r0 = r14.isInt()
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L17
            long r3 = r14.readInt64Value()
            boolean r14 = r13.formatUnixTime
            if (r14 == 0) goto L11
            long r3 = r3 * r1
        L11:
            java.util.Date r14 = new java.util.Date
            r14.<init>(r3)
            return r14
        L17:
            boolean r0 = r14.readIfNull()
            r3 = 0
            if (r0 == 0) goto L1f
            return r3
        L1f:
            boolean r0 = r14.nextIfNullOrEmptyString()
            if (r0 == 0) goto L26
            return r3
        L26:
            char r0 = r14.current()
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L33
            java.util.Date r14 = r14.readNullOrNewDate()
            return r14
        L33:
            boolean r0 = r13.useSimpleFormatter
            if (r0 != 0) goto L3b
            java.util.Locale r0 = r13.locale
            if (r0 == 0) goto L3e
        L3b:
            r7 = r14
            goto L1e7
        L3e:
            boolean r0 = r13.formatUnixTime
            if (r0 != 0) goto L46
            boolean r0 = r13.formatMillis
            if (r0 == 0) goto L57
        L46:
            boolean r0 = r14.isString()
            if (r0 == 0) goto L57
            long r3 = r14.readInt64Value()
            boolean r14 = r13.formatUnixTime
            if (r14 == 0) goto L1e1
            long r3 = r3 * r1
            goto L1e1
        L57:
            java.lang.String r0 = r13.format
            r4 = 0
            r6 = 0
            if (r0 == 0) goto L197
            boolean r0 = r13.yyyyMMddhhmmss19
            if (r0 == 0) goto L88
            boolean r0 = r14.isSupportSmartMatch()
            if (r0 == 0) goto L6d
            long r6 = r14.readMillisFromString()
            goto L71
        L6d:
            long r6 = r14.readMillis19()
        L71:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L82
            boolean r0 = r14.wasNull()
            if (r0 != 0) goto L7c
            goto L82
        L7c:
            java.time.ZonedDateTime r14 = r14.readZonedDateTime()
            goto L171
        L82:
            java.util.Date r14 = new java.util.Date
            r14.<init>(r6)
            return r14
        L88:
            java.util.Locale r0 = r14.getLocale()
            java.time.format.DateTimeFormatter r0 = r13.getDateFormatter(r0)
            if (r0 == 0) goto L16d
            java.lang.String r7 = r14.readString()
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L16c
            java.lang.String r8 = "null"
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto La6
            goto L16c
        La6:
            java.lang.String r8 = r13.format
            r9 = 45
            int r8 = r8.indexOf(r9)
            r10 = -1
            if (r8 == r10) goto Lc7
            int r8 = r7.indexOf(r9)
            if (r8 != r10) goto Lc7
            boolean r8 = com.alibaba.fastjson2.util.TypeUtils.isInteger(r7)
            if (r8 == 0) goto Lc7
            long r0 = java.lang.Long.parseLong(r7)
            java.util.Date r14 = new java.util.Date
            r14.<init>(r0)
            return r14
        Lc7:
            boolean r8 = r13.formatHasHour
            r9 = 19
            if (r8 != 0) goto L125
            boolean r8 = r13.formatHasDay
            if (r8 != 0) goto Lee
            java.time.temporal.TemporalAccessor r0 = r0.parse(r7)
            java.time.temporal.ChronoField r6 = java.time.temporal.ChronoField.YEAR
            int r6 = r0.get(r6)
            java.time.temporal.ChronoField r7 = java.time.temporal.ChronoField.MONTH_OF_YEAR
            int r0 = r0.get(r7)
            r7 = 1
            java.time.LocalDate r0 = java.time.LocalDate.of(r6, r0, r7)
            java.time.LocalTime r6 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r6)
            goto L15f
        Lee:
            int r8 = r7.length()
            if (r8 != r9) goto L105
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            boolean r8 = r14.isEnabled(r8)
            if (r8 == 0) goto L105
            int r0 = r7.length()
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(r7, r6, r0)
            goto L15f
        L105:
            boolean r8 = r13.yyyyMMdd10
            if (r8 == 0) goto L11a
            int r8 = r7.length()
            r9 = 10
            if (r8 <= r9) goto L11a
            java.lang.String r6 = r7.substring(r6, r9)
            java.time.LocalDate r0 = java.time.LocalDate.parse(r6, r0)
            goto L11e
        L11a:
            java.time.LocalDate r0 = java.time.LocalDate.parse(r7, r0)
        L11e:
            java.time.LocalTime r6 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r6)
            goto L15f
        L125:
            int r8 = r7.length()
            if (r8 != r9) goto L14c
            boolean r8 = r13.yyyyMMddhhmm16
            if (r8 != 0) goto L141
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            boolean r8 = r14.isEnabled(r8)
            if (r8 != 0) goto L141
            java.lang.String r8 = "yyyy-MM-dd hh:mm:ss"
            java.lang.String r10 = r13.format
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L14c
        L141:
            boolean r0 = r13.yyyyMMddhhmm16
            if (r0 == 0) goto L147
            r9 = 16
        L147:
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(r7, r6, r9)
            goto L15f
        L14c:
            boolean r6 = r13.formatHasDay
            if (r6 == 0) goto L155
            java.time.LocalDateTime r0 = java.time.LocalDateTime.parse(r7, r0)
            goto L15f
        L155:
            java.time.LocalTime r0 = java.time.LocalTime.parse(r7, r0)
            java.time.LocalDate r6 = java.time.LocalDate.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r6, r0)
        L15f:
            com.alibaba.fastjson2.JSONReader$Context r14 = r14.getContext()
            java.time.ZoneId r14 = r14.getZoneId()
            java.time.ZonedDateTime r14 = r0.atZone(r14)
            goto L171
        L16c:
            return r3
        L16d:
            java.time.ZonedDateTime r14 = r14.readZonedDateTime()
        L171:
            if (r14 != 0) goto L174
            return r3
        L174:
            long r6 = r14.toEpochSecond()
            java.time.LocalTime r14 = r14.toLocalTime()
            int r14 = r14.getNano()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r3 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 >= 0) goto L194
            if (r14 <= 0) goto L194
            r4 = 1
            long r6 = r6 + r4
            long r6 = r6 * r1
            int r14 = r14 / r3
            int r14 = r14 + (-1000)
        L190:
            long r0 = (long) r14
            long r6 = r6 + r0
            r3 = r6
            goto L1e1
        L194:
            long r6 = r6 * r1
            int r14 = r14 / r3
            goto L190
        L197:
            boolean r0 = r14.isDate()
            if (r0 == 0) goto L1a2
            java.util.Date r14 = r14.readDate()
            return r14
        L1a2:
            boolean r0 = r14.isTypeRedirect()
            if (r0 == 0) goto L1c9
            r11 = 108(0x6c, float:1.51E-43)
            r12 = 34
            r8 = 34
            r9 = 118(0x76, float:1.65E-43)
            r10 = 97
            r7 = r14
            boolean r14 = r7.nextIfMatchIdent(r8, r9, r10, r11, r12)
            if (r14 == 0) goto L1ca
            r14 = 58
            r7.nextIfMatch(r14)
            long r8 = r7.readInt64Value()
            r7.nextIfObjectEnd()
            r7.setTypeRedirect(r6)
            goto L1ce
        L1c9:
            r7 = r14
        L1ca:
            long r8 = r7.readMillisFromString()
        L1ce:
            int r14 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r14 != 0) goto L1d9
            boolean r14 = r7.wasNull()
            if (r14 == 0) goto L1d9
            return r3
        L1d9:
            boolean r14 = r13.formatUnixTime
            if (r14 == 0) goto L1e0
            long r3 = r8 * r1
            goto L1e1
        L1e0:
            r3 = r8
        L1e1:
            java.util.Date r14 = new java.util.Date
            r14.<init>(r3)
            return r14
        L1e7:
            java.lang.String r14 = r7.readString()
            java.util.Locale r0 = r13.locale     // Catch: java.text.ParseException -> L1f9
            if (r0 == 0) goto L1fb
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L1f9
            java.lang.String r1 = r13.format     // Catch: java.text.ParseException -> L1f9
            java.util.Locale r2 = r13.locale     // Catch: java.text.ParseException -> L1f9
            r0.<init>(r1, r2)     // Catch: java.text.ParseException -> L1f9
            goto L202
        L1f9:
            r0 = move-exception
            goto L207
        L1fb:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L1f9
            java.lang.String r1 = r13.format     // Catch: java.text.ParseException -> L1f9
            r0.<init>(r1)     // Catch: java.text.ParseException -> L1f9
        L202:
            java.util.Date r14 = r0.parse(r14)     // Catch: java.text.ParseException -> L1f9
            return r14
        L207:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "parse error : "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            java.lang.String r14 = r7.info(r14)
            ah.a.x(r14, r0)
            r14 = 0
            return r14
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Object r1 = r0.readDate(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Object r1 = r0.readDate(r1)
            return r1
    }
}
