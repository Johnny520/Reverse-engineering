package com.alibaba.fastjson2.codec;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DateTimeCodec {
    java.time.format.DateTimeFormatter dateFormatter;
    public final java.lang.String format;
    protected final boolean formatHasDay;
    protected final boolean formatHasHour;
    public final boolean formatISO8601;
    public final boolean formatMillis;
    public final boolean formatUnixTime;
    public final java.util.Locale locale;
    protected final boolean useSimpleDateFormat;
    public final boolean useSimpleFormatter;
    protected final boolean yyyyMMdd10;
    protected final boolean yyyyMMdd8;
    protected final boolean yyyyMMddhhmm16;
    protected final boolean yyyyMMddhhmmss14;
    protected final boolean yyyyMMddhhmmss19;

    public DateTimeCodec(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DateTimeCodec(java.lang.String r5, java.util.Locale r6) {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto Ld
            java.lang.String r0 = "aa"
            java.lang.String r1 = "a"
            java.lang.String r5 = r5.replaceAll(r0, r1)
        Ld:
            r4.format = r5
            r4.locale = r6
            java.lang.String r6 = "yyyyMMddHHmmss"
            boolean r6 = r6.equals(r5)
            r4.yyyyMMddhhmmss14 = r6
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
            boolean r6 = r6.equals(r5)
            r4.yyyyMMddhhmmss19 = r6
            java.lang.String r6 = "yyyy-MM-dd HH:mm"
            boolean r6 = r6.equals(r5)
            r4.yyyyMMddhhmm16 = r6
            java.lang.String r6 = "yyyy-MM-dd"
            boolean r6 = r6.equals(r5)
            r4.yyyyMMdd10 = r6
            java.lang.String r6 = "yyyyMMdd"
            boolean r6 = r6.equals(r5)
            r4.yyyyMMdd8 = r6
            java.lang.String r6 = "yyyy-MM-dd'T'HH:mm:ssXXX"
            boolean r6 = r6.equals(r5)
            r4.useSimpleDateFormat = r6
            r6 = 0
            if (r5 == 0) goto Lb2
            int r0 = r5.hashCode()
            r1 = 1
            r2 = -1
            switch(r0) {
                case -1074095546: goto L65;
                case -288020395: goto L5a;
                case 2095190916: goto L4f;
                default: goto L4d;
            }
        L4d:
            r0 = r2
            goto L6f
        L4f:
            java.lang.String r0 = "iso8601"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L58
            goto L4d
        L58:
            r0 = 2
            goto L6f
        L5a:
            java.lang.String r0 = "unixtime"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L63
            goto L4d
        L63:
            r0 = r1
            goto L6f
        L65:
            java.lang.String r0 = "millis"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6e
            goto L4d
        L6e:
            r0 = r6
        L6f:
            switch(r0) {
                case 0: goto Lae;
                case 1: goto La9;
                case 2: goto La4;
                default: goto L72;
            }
        L72:
            r0 = 100
            int r0 = r5.indexOf(r0)
            if (r0 == r2) goto L7c
            r0 = r1
            goto L7d
        L7c:
            r0 = r6
        L7d:
            r3 = 72
            int r3 = r5.indexOf(r3)
            if (r3 != r2) goto L9f
            r3 = 104(0x68, float:1.46E-43)
            int r3 = r5.indexOf(r3)
            if (r3 != r2) goto L9f
            r3 = 75
            int r3 = r5.indexOf(r3)
            if (r3 != r2) goto L9f
            r3 = 107(0x6b, float:1.5E-43)
            int r3 = r5.indexOf(r3)
            if (r3 == r2) goto L9e
            goto L9f
        L9e:
            r1 = r6
        L9f:
            r2 = r0
            r3 = r1
            r0 = r6
            r1 = r0
            goto Lb6
        La4:
            r2 = r6
            r3 = r2
            r0 = r1
        La7:
            r1 = r3
            goto Lb6
        La9:
            r0 = r6
            r2 = r0
            r3 = r2
            r6 = r1
            goto La7
        Lae:
            r0 = r6
            r2 = r0
        Lb0:
            r3 = r2
            goto Lb6
        Lb2:
            r0 = r6
            r1 = r0
            r2 = r1
            goto Lb0
        Lb6:
            r4.formatUnixTime = r6
            r4.formatMillis = r1
            r4.formatISO8601 = r0
            r4.formatHasDay = r2
            r4.formatHasHour = r3
            java.lang.String r6 = "yyyyMMddHHmmssSSSZ"
            boolean r5 = r6.equals(r5)
            r4.useSimpleFormatter = r5
            return
    }

    public java.time.format.DateTimeFormatter getDateFormatter() {
            r2 = this;
            java.time.format.DateTimeFormatter r0 = r2.dateFormatter
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.format
            if (r0 == 0) goto L25
            boolean r1 = r2.formatMillis
            if (r1 != 0) goto L25
            boolean r1 = r2.formatISO8601
            if (r1 != 0) goto L25
            boolean r1 = r2.formatUnixTime
            if (r1 != 0) goto L25
            java.util.Locale r1 = r2.locale
            if (r1 != 0) goto L1f
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0)
            r2.dateFormatter = r0
            goto L25
        L1f:
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r1)
            r2.dateFormatter = r0
        L25:
            java.time.format.DateTimeFormatter r0 = r2.dateFormatter
            return r0
    }

    public java.time.format.DateTimeFormatter getDateFormatter(java.util.Locale r2) {
            r1 = this;
            java.lang.String r0 = r1.format
            if (r0 == 0) goto L4d
            boolean r0 = r1.formatMillis
            if (r0 != 0) goto L4d
            boolean r0 = r1.formatISO8601
            if (r0 != 0) goto L4d
            boolean r0 = r1.formatUnixTime
            if (r0 == 0) goto L11
            goto L4d
        L11:
            java.time.format.DateTimeFormatter r0 = r1.dateFormatter
            if (r0 == 0) goto L2e
            java.util.Locale r0 = r1.locale
            if (r0 != 0) goto L21
            if (r2 == 0) goto L2b
            java.util.Locale r0 = java.util.Locale.getDefault()
            if (r2 == r0) goto L2b
        L21:
            java.util.Locale r0 = r1.locale
            if (r0 == 0) goto L2e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2e
        L2b:
            java.time.format.DateTimeFormatter r2 = r1.dateFormatter
            return r2
        L2e:
            if (r2 != 0) goto L44
            java.util.Locale r2 = r1.locale
            java.lang.String r0 = r1.format
            if (r2 != 0) goto L3d
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ofPattern(r0)
            r1.dateFormatter = r2
            return r2
        L3d:
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ofPattern(r0, r2)
            r1.dateFormatter = r2
            return r2
        L44:
            java.lang.String r0 = r1.format
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ofPattern(r0, r2)
            r1.dateFormatter = r2
            return r2
        L4d:
            r2 = 0
            return r2
    }
}
