package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDate extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplDate INSTANCE = null;
    static final byte[] PREFIX_BYTES = null;
    static final byte[] PREFIX_BYTES_SQL = null;
    static final char[] PREFIX_CHARS = null;
    static final char[] PREFIX_CHARS_SQL = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplDate
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplDate.INSTANCE = r0
            java.lang.String r0 = "new Date("
            char[] r1 = r0.toCharArray()
            com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_CHARS = r1
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_BYTES = r0
            java.lang.String r0 = "{\"@type\":\"java.sql.Date\",\"val\":"
            char[] r2 = r0.toCharArray()
            com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_CHARS_SQL = r2
            byte[] r0 = r0.getBytes(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_BYTES_SQL = r0
            return
    }

    public ObjectWriterImplDate(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r34, java.lang.Object r35, java.lang.Object r36, java.lang.reflect.Type r37, long r38) {
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            if (r2 != 0) goto Lc
            r1.writeNull()
            return
        Lc:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r1.context
            r4 = r2
            java.util.Date r4 = (java.util.Date) r4
            long r5 = r4.getTime()
            r7 = r37
            boolean r2 = r1.isWriteTypeInfo(r2, r7)
            r7 = 0
            java.lang.String r8 = "java.sql.Date"
            if (r2 == 0) goto L5f
            boolean r2 = r1.utf16
            r3 = 125(0x7d, float:1.75E-43)
            r9 = 41
            if (r2 == 0) goto L41
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L39
            char[] r2 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_CHARS_SQL
            goto L3c
        L39:
            char[] r2 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_CHARS
            r3 = r9
        L3c:
            int r4 = r2.length
            r1.writeRaw(r2, r7, r4)
            goto L58
        L41:
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L52
            byte[] r2 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_BYTES_SQL
            goto L55
        L52:
            byte[] r2 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.PREFIX_BYTES
            r3 = r9
        L55:
            r1.writeRaw(r2)
        L58:
            r1.writeInt64(r5)
            r1.writeRaw(r3)
            return
        L5f:
            boolean r2 = r0.formatMillis
            if (r2 != 0) goto L24a
            java.lang.String r2 = r0.format
            if (r2 != 0) goto L6d
            boolean r2 = r3.isDateFormatMillis()
            if (r2 != 0) goto L24a
        L6d:
            r9 = r38
            long r9 = r1.getFeatures(r9)
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriterUtilDateAsMillis
            long r11 = r2.mask
            long r9 = r9 & r11
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L80
            goto L24a
        L80:
            boolean r2 = r0.formatUnixTime
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r2 != 0) goto L90
            java.lang.String r2 = r0.format
            if (r2 != 0) goto L93
            boolean r2 = r3.isDateFormatUnixTime()
            if (r2 == 0) goto L93
        L90:
            r11 = r9
            goto L245
        L93:
            java.time.ZoneId r2 = r3.getZoneId()
            java.time.ZoneId r13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            if (r2 == r13) goto Lc8
            java.time.zone.ZoneRules r14 = r2.getRules()
            java.time.zone.ZoneRules r15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r14 != r15) goto La4
            goto Lc8
        La4:
            java.time.ZoneOffset r14 = java.time.ZoneOffset.UTC
            if (r2 == r14) goto Lc6
            java.lang.String r14 = "UTC"
            java.lang.String r15 = r2.getId()
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto Lb5
            goto Lc6
        Lb5:
            java.time.Instant r14 = java.time.Instant.ofEpochMilli(r5)
            java.time.ZonedDateTime r14 = java.time.ZonedDateTime.ofInstant(r14, r2)
            java.time.ZoneOffset r14 = r14.getOffset()
            int r14 = r14.getTotalSeconds()
            goto Ld0
        Lc6:
            r14 = r7
            goto Ld0
        Lc8:
            long r14 = java.lang.Math.floorDiv(r5, r9)
            int r14 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(r14)
        Ld0:
            boolean r15 = r0.formatISO8601
            r16 = 1
            if (r15 != 0) goto Ldc
            boolean r15 = r3.isDateFormatISO8601()
            if (r15 == 0) goto Lde
        Ldc:
            r7 = r16
        Lde:
            if (r7 == 0) goto Le2
            r15 = 0
            goto Lea
        Le2:
            java.lang.String r15 = r0.format
            if (r15 != 0) goto Lea
            java.lang.String r15 = r3.getDateFormat()
        Lea:
            if (r15 != 0) goto L225
            long r17 = java.lang.Math.floorDiv(r5, r9)
            if (r2 == r13) goto L10e
            java.time.zone.ZoneRules r13 = r2.getRules()
            java.time.zone.ZoneRules r15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_RULES
            if (r13 != r15) goto Lfb
            goto L10e
        Lfb:
            java.time.Instant r13 = java.time.Instant.ofEpochMilli(r5)
            java.time.zone.ZoneRules r15 = r2.getRules()
            java.time.ZoneOffset r13 = r15.getOffset(r13)
            int r13 = r13.getTotalSeconds()
        L10b:
            r35 = r11
            goto L113
        L10e:
            int r13 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(r17)
            goto L10b
        L113:
            long r11 = (long) r13
            long r11 = r17 + r11
            r9 = 86400(0x15180, double:4.26873E-319)
            long r17 = java.lang.Math.floorDiv(r11, r9)
            long r9 = java.lang.Math.floorMod(r11, r9)
            int r9 = (int) r9
            r10 = 719468(0xafa6c, double:3.554644E-318)
            long r10 = r17 + r10
            int r12 = (r10 > r35 ? 1 : (r10 == r35 ? 0 : -1))
            r19 = 1
            r21 = 146097(0x23ab1, double:7.21815E-319)
            r23 = 400(0x190, double:1.976E-321)
            if (r12 >= 0) goto L142
            r12 = 719469(0xafa6d, double:3.55465E-318)
            long r17 = r17 + r12
            long r17 = r17 / r21
            long r12 = r17 - r19
            long r17 = r12 * r23
            long r12 = -r12
            long r12 = r12 * r21
            long r10 = r10 + r12
            goto L144
        L142:
            r17 = r35
        L144:
            long r12 = r10 * r23
            r25 = 591(0x24f, double:2.92E-321)
            long r12 = r12 + r25
            long r12 = r12 / r21
            r21 = 365(0x16d, double:1.803E-321)
            long r25 = r12 * r21
            r27 = 4
            long r29 = r12 / r27
            long r29 = r29 + r25
            r25 = 100
            long r31 = r12 / r25
            long r29 = r29 - r31
            long r31 = r12 / r23
            long r31 = r31 + r29
            long r29 = r10 - r31
            int r15 = (r29 > r35 ? 1 : (r29 == r35 ? 0 : -1))
            if (r15 >= 0) goto L178
            long r12 = r12 - r19
            long r21 = r21 * r12
            long r19 = r12 / r27
            long r19 = r19 + r21
            long r21 = r12 / r25
            long r19 = r19 - r21
            long r21 = r12 / r23
            long r21 = r21 + r19
            long r29 = r10 - r21
        L178:
            r10 = r29
            long r12 = r12 + r17
            int r10 = (int) r10
            int r11 = r10 * 5
            int r11 = r11 + 2
            int r11 = r11 / 153
            int r15 = r11 + 2
            int r15 = r15 % 12
            int r15 = r15 + 1
            r17 = r3
            int r3 = r11 * 306
            int r3 = r3 + 5
            int r3 = r3 / 10
            int r10 = r10 - r3
            int r10 = r10 + 1
            int r11 = r11 / 10
            r16 = r4
            long r3 = (long) r11
            long r12 = r12 + r3
            r3 = -999999999(0xffffffffc4653601, double:NaN)
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 < 0) goto L219
            r3 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L219
            r3 = r2
            int r2 = (int) r12
            long r11 = (long) r9
            int r4 = (r11 > r35 ? 1 : (r11 == r35 ? 0 : -1))
            if (r4 < 0) goto L20d
            r18 = 86399(0x1517f, double:4.2687E-319)
            int r4 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r4 > 0) goto L20d
            r18 = 3600(0xe10, double:1.7786E-320)
            r9 = r14
            long r13 = r11 / r18
            int r4 = (int) r13
            int r13 = r4 * 3600
            long r13 = (long) r13
            long r11 = r11 - r13
            r13 = 60
            long r13 = r11 / r13
            int r13 = (int) r13
            int r14 = r13 * 60
            r35 = r11
            long r11 = (long) r14
            long r11 = r35 - r11
            int r11 = (int) r11
            if (r2 < 0) goto L228
            r12 = 9999(0x270f, float:1.4012E-41)
            if (r2 > r12) goto L228
            r14 = r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r5 = java.lang.Math.floorMod(r5, r11)
            int r3 = (int) r5
            if (r3 != 0) goto L200
            if (r7 != 0) goto L200
            if (r4 != 0) goto L1f7
            if (r13 != 0) goto L1f7
            if (r14 != 0) goto L1f7
            java.lang.Class r3 = r16.getClass()
            java.lang.String r3 = r3.getName()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L1f7
            r1.writeDateYYYMMDD10(r2, r15, r10)
            return
        L1f7:
            r5 = r4
            r4 = r10
            r6 = r13
            r7 = r14
            r3 = r15
            r1.writeDateTime19(r2, r3, r4, r5, r6, r7)
            return
        L200:
            r1 = r34
            r8 = r3
            r5 = r4
            r4 = r10
            r6 = r13
            r3 = r15
            r10 = r7
            r7 = r14
            r1.writeDateTimeISO8601(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L20d:
            java.time.DateTimeException r1 = new java.time.DateTimeException
            java.lang.String r2 = "Invalid secondOfDay "
            java.lang.String r2 = bc.e.g(r11, r2)
            r1.<init>(r2)
            throw r1
        L219:
            java.time.DateTimeException r1 = new java.time.DateTimeException
            java.lang.String r2 = "Invalid year "
            java.lang.String r2 = bc.e.g(r12, r2)
            r1.<init>(r2)
            throw r1
        L225:
            r17 = r3
            r3 = r2
        L228:
            java.lang.String r2 = r0.format
            if (r2 == 0) goto L231
            java.time.format.DateTimeFormatter r2 = r0.getDateFormatter()
            goto L235
        L231:
            java.time.format.DateTimeFormatter r2 = r17.getDateFormatter()
        L235:
            java.time.Instant r4 = java.time.Instant.ofEpochMilli(r5)
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r4, r3)
            java.lang.String r2 = r2.format(r3)
            r1.writeString(r2)
            return
        L245:
            long r5 = r5 / r11
            r1.writeInt64(r5)
            return
        L24a:
            r1.writeInt64(r5)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.Date r2 = (java.util.Date) r2
            long r2 = r2.getTime()
            r1.writeMillis(r2)
            return
    }
}
