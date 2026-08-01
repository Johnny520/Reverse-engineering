package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.util.List<java.text.DateFormat> dateFormats;


    static {
            com.google.gson.internal.bind.DateTypeAdapter$1 r0 = new com.google.gson.internal.bind.DateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.DateTypeAdapter.FACTORY = r0
            return
    }

    public DateTypeAdapter() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.dateFormats = r0
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r2, r2, r1)
            r0.add(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.Locale r1 = java.util.Locale.US
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r2, r2)
            r0.add(r1)
        L2b:
            boolean r0 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r0 == 0) goto L3a
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            java.text.DateFormat r1 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(r2, r2)
            r0.add(r1)
        L3a:
            return
    }

    private java.util.Date deserializeToDate(com.google.gson.stream.JsonReader r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = r6.nextString()
            java.util.List<java.text.DateFormat> r1 = r5.dateFormats
            monitor-enter(r1)
            java.util.List<java.text.DateFormat> r2 = r5.dateFormats     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L55
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L55
            java.text.DateFormat r3 = (java.text.DateFormat) r3     // Catch: java.lang.Throwable -> L55
            java.util.Date r2 = r3.parse(r0)     // Catch: java.text.ParseException -> L1f java.lang.Throwable -> L55
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            return r2
        L1f:
            r4 = move-exception
            goto Ld
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L2d
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L2d
            java.util.Date r1 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r0, r1)     // Catch: java.text.ParseException -> L2d
            return r1
        L2d:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed parsing '"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = "' as Date; at path "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r6.getPreviousPath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
        L55:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            throw r2
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.util.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.util.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.Date read2(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.nextNull()
            r0 = 0
            return r0
        Ld:
            java.util.Date r0 = r2.deserializeToDate(r3)
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.util.Date r2) throws java.io.IOException {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r4, java.util.Date r5) throws java.io.IOException {
            r3 = this;
            if (r5 != 0) goto L6
            r4.nullValue()
            return
        L6:
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.util.List<java.text.DateFormat> r1 = r3.dateFormats
            monitor-enter(r1)
            java.lang.String r2 = r0.format(r5)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            r4.value(r2)
            return
        L1b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }
}
