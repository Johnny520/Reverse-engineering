package com.google.gson.internal.sql;

/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
    static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.sql.SqlDateTypeAdapter$1 r0 = new com.google.gson.internal.sql.SqlDateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.sql.SqlDateTypeAdapter.FACTORY = r0
            return
    }

    private SqlDateTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    public /* synthetic */ SqlDateTypeAdapter(com.google.gson.internal.sql.SqlDateTypeAdapter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.sql.Date read2(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
            r6 = this;
            com.google.gson.stream.JsonToken r0 = r7.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r7.nextNull()
            r7 = 0
            return r7
        Ld:
            java.lang.String r0 = r7.nextString()
            monitor-enter(r6)
            java.text.DateFormat r1 = r6.format     // Catch: java.lang.Throwable -> L2e
            java.util.TimeZone r1 = r1.getTimeZone()     // Catch: java.lang.Throwable -> L2e
            java.text.DateFormat r2 = r6.format     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            java.util.Date r2 = r2.parse(r0)     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            java.sql.Date r3 = new java.sql.Date     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            long r4 = r2.getTime()     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            java.text.DateFormat r7 = r6.format     // Catch: java.lang.Throwable -> L2e
            r7.setTimeZone(r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r7 = move-exception
            goto L5c
        L30:
            r7 = move-exception
            goto L56
        L32:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r3 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r4.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "Failed parsing '"
            r4.append(r5)     // Catch: java.lang.Throwable -> L30
            r4.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "' as SQL Date; at path "
            r4.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = r7.getPreviousPath()     // Catch: java.lang.Throwable -> L30
            r4.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L30
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L56:
            java.text.DateFormat r0 = r6.format     // Catch: java.lang.Throwable -> L2e
            r0.setTimeZone(r1)     // Catch: java.lang.Throwable -> L2e
            throw r7     // Catch: java.lang.Throwable -> L2e
        L5c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r7
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Date r2) throws java.io.IOException {
            r0 = this;
            java.sql.Date r2 = (java.sql.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r2, java.sql.Date r3) throws java.io.IOException {
            r1 = this;
            if (r3 != 0) goto L6
            r2.nullValue()
            return
        L6:
            monitor-enter(r1)
            java.text.DateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            r2.value(r3)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }
}
