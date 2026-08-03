package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterDate<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    protected com.alibaba.fastjson2.writer.ObjectWriter dateWriter;
    final boolean formatISO8601;
    final boolean formatMillis;
    final boolean formatUnixTime;
    protected java.time.format.DateTimeFormatter formatter;
    final boolean formatyyyyMMdd8;
    final boolean formatyyyyMMddhhmmss14;
    final boolean formatyyyyMMddhhmmss19;

    public FieldWriterDate(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            r2 = 0
            if (r5 == 0) goto L77
            int r3 = r5.hashCode()
            r4 = 1
            r6 = -1
            switch(r3) {
                case -1074095546: goto L48;
                case -288020395: goto L3d;
                case -276306848: goto L32;
                case 1333195168: goto L27;
                case 1349114208: goto L1c;
                case 2095190916: goto L11;
                default: goto L10;
            }
        L10:
            goto L52
        L11:
            java.lang.String r3 = "iso8601"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L1a
            goto L52
        L1a:
            r6 = 5
            goto L52
        L1c:
            java.lang.String r3 = "yyyyMMddHHmmss"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L25
            goto L52
        L25:
            r6 = 4
            goto L52
        L27:
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L30
            goto L52
        L30:
            r6 = 3
            goto L52
        L32:
            java.lang.String r3 = "yyyyMMdd"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L3b
            goto L52
        L3b:
            r6 = 2
            goto L52
        L3d:
            java.lang.String r3 = "unixtime"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L46
            goto L52
        L46:
            r6 = r4
            goto L52
        L48:
            java.lang.String r3 = "millis"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L51
            goto L52
        L51:
            r6 = r2
        L52:
            switch(r6) {
                case 0: goto L71;
                case 1: goto L6c;
                case 2: goto L67;
                case 3: goto L61;
                case 4: goto L5b;
                case 5: goto L56;
                default: goto L55;
            }
        L55:
            goto L77
        L56:
            r3 = r2
            r5 = r3
        L58:
            r6 = r5
            r7 = r6
            goto L7b
        L5b:
            r3 = r2
            r5 = r3
            r7 = r5
            r6 = r4
        L5f:
            r4 = r7
            goto L7b
        L61:
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r4
            r4 = r6
            goto L7b
        L67:
            r3 = r2
            r6 = r3
            r7 = r6
            r5 = r4
            goto L5f
        L6c:
            r5 = r2
            r6 = r5
            r7 = r6
            r3 = r4
            goto L5f
        L71:
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r6
            r2 = r4
            goto L5f
        L77:
            r3 = r2
            r4 = r3
            r5 = r4
            goto L58
        L7b:
            r1.formatMillis = r2
            r1.formatISO8601 = r4
            r1.formatUnixTime = r3
            r1.formatyyyyMMdd8 = r5
            r1.formatyyyyMMddhhmmss14 = r6
            r1.formatyyyyMMddhhmmss19 = r7
            return
    }

    public java.time.format.DateTimeFormatter getFormatter() {
            r2 = this;
            java.time.format.DateTimeFormatter r0 = r2.formatter
            if (r0 != 0) goto L1a
            java.lang.String r0 = r2.format
            if (r0 == 0) goto L1a
            boolean r1 = r2.formatMillis
            if (r1 != 0) goto L1a
            boolean r1 = r2.formatISO8601
            if (r1 != 0) goto L1a
            boolean r1 = r2.formatUnixTime
            if (r1 != 0) goto L1a
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0)
            r2.formatter = r0
        L1a:
            java.time.format.DateTimeFormatter r0 = r2.formatter
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r5, java.lang.Class r6) {
            r4 = this;
            java.lang.Class r0 = r4.fieldClass
            if (r6 != r0) goto L36
            com.alibaba.fastjson2.JSONWriter$Context r5 = r5.context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r5 = r5.provider
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r4.dateWriter
            if (r0 != 0) goto L33
            long r0 = r5.userDefineMask
            r2 = 16
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1f
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r5.getObjectWriter(r6, r6, r0)
            r4.dateWriter = r5
            goto L33
        L1f:
            java.lang.String r5 = r4.format
            if (r5 != 0) goto L28
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r5 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.INSTANCE
            r4.dateWriter = r5
            return r5
        L28:
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r5 = new com.alibaba.fastjson2.writer.ObjectWriterImplDate
            java.lang.String r6 = r4.format
            r0 = 0
            r5.<init>(r6, r0)
            r4.dateWriter = r5
            return r5
        L33:
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r4.dateWriter
            return r5
        L36:
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r5.getObjectWriter(r6)
            return r5
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatISO8601() {
            r1 = this;
            boolean r0 = r1.formatISO8601
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatMillis() {
            r1 = this;
            boolean r0 = r1.formatMillis
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeDate(com.alibaba.fastjson2.JSONWriter r35, long r36) {
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r4 = r1.jsonb
            if (r4 == 0) goto L11
            r34.writeFieldName(r35)
            r35.writeMillis(r36)
            return
        L11:
            com.alibaba.fastjson2.JSONWriter$Context r4 = r1.context
            boolean r5 = r0.formatUnixTime
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 != 0) goto L23
            java.lang.String r5 = r0.format
            if (r5 != 0) goto L27
            boolean r5 = r4.isDateFormatUnixTime()
            if (r5 == 0) goto L27
        L23:
            r11 = r2
            r2 = r1
            goto L24a
        L27:
            boolean r5 = r0.formatMillis
            if (r5 != 0) goto L36
            java.lang.String r5 = r0.format
            if (r5 != 0) goto L3a
            boolean r5 = r4.isDateFormatMillis()
            if (r5 != 0) goto L36
            goto L3a
        L36:
            r11 = r2
            r2 = r1
            goto L243
        L3a:
            long r8 = r0.features
            long r8 = r1.getFeatures(r8)
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriterUtilDateAsMillis
            long r10 = r5.mask
            long r8 = r8 & r10
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L4c
            goto L36
        L4c:
            java.time.ZoneId r5 = r4.getZoneId()
            java.lang.String r8 = r0.format
            if (r8 == 0) goto L55
            goto L59
        L55:
            java.lang.String r8 = r4.getDateFormat()
        L59:
            boolean r9 = r0.formatyyyyMMddhhmmss19
            r12 = 1
            if (r9 != 0) goto L6b
            boolean r9 = r4.isFormatyyyyMMddhhmmss19()
            if (r9 == 0) goto L69
            java.lang.String r9 = r0.format
            if (r9 != 0) goto L69
            goto L6b
        L69:
            r9 = 0
            goto L6c
        L6b:
            r9 = r12
        L6c:
            r13 = 9999(0x270f, float:1.4012E-41)
            if (r8 == 0) goto L7a
            boolean r8 = r0.formatyyyyMMddhhmmss14
            if (r8 != 0) goto L7a
            if (r9 == 0) goto L77
            goto L7a
        L77:
            r11 = r2
            goto L1ab
        L7a:
            long r14 = java.lang.Math.floorDiv(r2, r6)
            java.time.ZoneId r8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r5 == r8) goto L9e
            java.time.zone.ZoneRules r8 = r5.getRules()
            r16 = r10
            java.time.zone.ZoneRules r10 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r8 != r10) goto L8d
            goto La0
        L8d:
            java.time.Instant r8 = java.time.Instant.ofEpochMilli(r2)
            java.time.zone.ZoneRules r10 = r5.getRules()
            java.time.ZoneOffset r8 = r10.getOffset(r8)
            int r8 = r8.getTotalSeconds()
            goto La4
        L9e:
            r16 = r10
        La0:
            int r8 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(r14)
        La4:
            long r10 = (long) r8
            long r14 = r14 + r10
            r10 = 86400(0x15180, double:4.26873E-319)
            long r18 = java.lang.Math.floorDiv(r14, r10)
            long r10 = java.lang.Math.floorMod(r14, r10)
            int r8 = (int) r10
            r10 = 719468(0xafa6c, double:3.554644E-318)
            long r10 = r18 + r10
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            r20 = 1
            r22 = 146097(0x23ab1, double:7.21815E-319)
            r24 = 400(0x190, double:1.976E-321)
            if (r14 >= 0) goto Ld2
            r14 = 719469(0xafa6d, double:3.55465E-318)
            long r18 = r18 + r14
            long r18 = r18 / r22
            long r14 = r18 - r20
            long r18 = r14 * r24
            long r14 = -r14
            long r14 = r14 * r22
            long r10 = r10 + r14
            goto Ld4
        Ld2:
            r18 = r16
        Ld4:
            long r14 = r10 * r24
            r26 = 591(0x24f, double:2.92E-321)
            long r14 = r14 + r26
            long r14 = r14 / r22
            r22 = 365(0x16d, double:1.803E-321)
            long r26 = r14 * r22
            r28 = 4
            long r30 = r14 / r28
            long r30 = r30 + r26
            r26 = 100
            long r32 = r14 / r26
            long r30 = r30 - r32
            long r32 = r14 / r24
            long r32 = r32 + r30
            long r30 = r10 - r32
            int r32 = (r30 > r16 ? 1 : (r30 == r16 ? 0 : -1))
            if (r32 >= 0) goto L108
            long r14 = r14 - r20
            long r22 = r22 * r14
            long r20 = r14 / r28
            long r20 = r20 + r22
            long r22 = r14 / r26
            long r20 = r20 - r22
            long r22 = r14 / r24
            long r22 = r22 + r20
            long r30 = r10 - r22
        L108:
            r10 = r30
            long r14 = r14 + r18
            int r10 = (int) r10
            int r11 = r10 * 5
            int r11 = r11 + 2
            int r11 = r11 / 153
            int r18 = r11 + 2
            int r18 = r18 % 12
            int r18 = r18 + 1
            r19 = r12
            int r12 = r11 * 306
            int r12 = r12 + 5
            int r12 = r12 / 10
            int r10 = r10 - r12
            int r10 = r10 + 1
            int r11 = r11 / 10
            long r11 = (long) r11
            long r14 = r14 + r11
            r11 = -999999999(0xffffffffc4653601, double:NaN)
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L237
            r11 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 > 0) goto L237
            r11 = r2
            int r2 = (int) r14
            long r14 = (long) r8
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 < 0) goto L22b
            r16 = 86399(0x1517f, double:4.2687E-319)
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 > 0) goto L22b
            r16 = 3600(0xe10, double:1.7786E-320)
            long r6 = r14 / r16
            int r3 = (int) r6
            int r6 = r3 * 3600
            long r6 = (long) r6
            long r14 = r14 - r6
            r6 = 60
            long r6 = r14 / r6
            int r6 = (int) r6
            int r7 = r6 * 60
            long r7 = (long) r7
            long r14 = r14 - r7
            int r7 = (int) r14
            if (r2 < 0) goto L1ab
            if (r2 > r13) goto L1ab
            boolean r5 = r0.formatyyyyMMddhhmmss14
            if (r5 == 0) goto L16a
            r34.writeFieldName(r35)
            r5 = r3
            r4 = r10
            r3 = r18
            r1.writeDateTime14(r2, r3, r4, r5, r6, r7)
            return
        L16a:
            r5 = r3
            r3 = r18
            if (r9 == 0) goto L179
            r34.writeFieldName(r35)
            r1 = r35
            r4 = r10
            r1.writeDateTime19(r2, r3, r4, r5, r6, r7)
            return
        L179:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = java.lang.Math.floorMod(r11, r8)
            int r8 = (int) r8
            if (r8 == 0) goto L1a1
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r11)
            java.time.ZoneId r4 = r4.getZoneId()
            java.time.zone.ZoneRules r4 = r4.getRules()
            java.time.ZoneOffset r1 = r4.getOffset(r1)
            int r9 = r1.getTotalSeconds()
            r34.writeFieldName(r35)
            r4 = r10
            r10 = 0
            r1 = r35
            r1.writeDateTimeISO8601(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L1a1:
            r4 = r10
            r34.writeFieldName(r35)
            r1 = r35
            r1.writeDateTime19(r2, r3, r4, r5, r6, r7)
            return
        L1ab:
            r34.writeFieldName(r35)
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r11)
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofInstant(r1, r5)
            boolean r2 = r0.formatISO8601
            if (r2 != 0) goto L1c8
            boolean r2 = r4.isDateFormatISO8601()
            if (r2 == 0) goto L1c5
            java.lang.String r2 = r0.format
            if (r2 != 0) goto L1c5
            goto L1c8
        L1c5:
            r2 = r35
            goto L1fb
        L1c8:
            int r2 = r1.getYear()
            if (r2 < 0) goto L1c5
            if (r2 > r13) goto L1c5
            int r3 = r1.getMonthValue()
            int r4 = r1.getDayOfMonth()
            int r5 = r1.getHour()
            int r6 = r1.getMinute()
            int r7 = r1.getSecond()
            int r8 = r1.getNano()
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = r8 / r9
            java.time.ZoneOffset r1 = r1.getOffset()
            int r9 = r1.getTotalSeconds()
            r10 = 1
            r1 = r35
            r1.writeDateTimeISO8601(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L1fb:
            boolean r3 = r0.formatyyyyMMdd8
            if (r3 == 0) goto L213
            int r3 = r1.getYear()
            if (r3 < 0) goto L213
            if (r3 > r13) goto L213
            int r4 = r1.getMonthValue()
            int r1 = r1.getDayOfMonth()
            r2.writeDateYYYMMDD8(r3, r4, r1)
            return
        L213:
            java.time.format.DateTimeFormatter r3 = r0.getFormatter()
            if (r3 != 0) goto L21d
            java.time.format.DateTimeFormatter r3 = r4.getDateFormatter()
        L21d:
            if (r3 == 0) goto L227
            java.lang.String r1 = r3.format(r1)
            r2.writeString(r1)
            return
        L227:
            r2.writeZonedDateTime(r1)
            return
        L22b:
            java.time.DateTimeException r1 = new java.time.DateTimeException
            java.lang.String r2 = "Invalid secondOfDay "
            java.lang.String r2 = bc.e.g(r14, r2)
            r1.<init>(r2)
            throw r1
        L237:
            java.time.DateTimeException r1 = new java.time.DateTimeException
            java.lang.String r2 = "Invalid year "
            java.lang.String r2 = bc.e.g(r14, r2)
            r1.<init>(r2)
            throw r1
        L243:
            r34.writeFieldName(r35)
            r35.writeInt64(r36)
            return
        L24a:
            r34.writeFieldName(r35)
            r19 = 1000(0x3e8, double:4.94E-321)
            long r3 = r11 / r19
            r2.writeInt64(r3)
            return
    }
}
