package com.google.gson.internal.bind;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends java.util.Date> extends com.google.gson.TypeAdapter<T> {
    public static final com.google.gson.TypeAdapterFactory DEFAULT_STYLE_FACTORY = null;
    private static final java.lang.String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final java.util.List<java.text.DateFormat> dateFormats;
    private final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType;


    public static abstract class DateType<T extends java.util.Date> {
        public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<java.util.Date> DATE = null;
        private final java.lang.Class<T> dateClass;


        static {
                com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1 r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1
                java.lang.Class<java.util.Date> r1 = java.util.Date.class
                r0.<init>(r1)
                com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE = r0
                return
        }

        public DateType(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.dateClass = r1
                return
        }

        private com.google.gson.TypeAdapterFactory createFactory(com.google.gson.internal.bind.DefaultDateTypeAdapter<T> r2) {
                r1 = this;
                java.lang.Class<T extends java.util.Date> r0 = r1.dateClass
                com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r0, r2)
                return r2
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(int r3, int r4) {
                r2 = this;
                com.google.gson.internal.bind.DefaultDateTypeAdapter r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter
                r1 = 0
                r0.<init>(r2, r3, r4, r1)
                com.google.gson.TypeAdapterFactory r3 = r2.createFactory(r0)
                return r3
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(java.lang.String r3) {
                r2 = this;
                com.google.gson.internal.bind.DefaultDateTypeAdapter r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter
                r1 = 0
                r0.<init>(r2, r3, r1)
                com.google.gson.TypeAdapterFactory r3 = r2.createFactory(r0)
                return r3
        }

        public abstract T deserialize(java.util.Date r1);
    }

    static {
            com.google.gson.internal.bind.DefaultDateTypeAdapter$1 r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY = r0
            return
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.util.Objects.requireNonNull(r3)
            r2.dateType = r3
            java.util.Locale r3 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r4, r5, r3)
            r0.add(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L29
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r4, r5)
            r0.add(r3)
        L29:
            boolean r3 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r3 == 0) goto L36
            java.text.DateFormat r3 = com.google.gson.internal.PreJava9DateFormatProvider.getUsDateTimeFormat(r4, r5)
            r0.add(r3)
        L36:
            return
    }

    public /* synthetic */ DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType r1, int r2, int r3, com.google.gson.internal.bind.DefaultDateTypeAdapter.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.util.Objects.requireNonNull(r3)
            r2.dateType = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r4, r1)
            r0.add(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2b
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r4)
            r0.add(r3)
        L2b:
            return
    }

    public /* synthetic */ DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType r1, java.lang.String r2, com.google.gson.internal.bind.DefaultDateTypeAdapter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.util.Date deserializeToDate(com.google.gson.stream.JsonReader r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = r6.nextString()
            java.util.List<java.text.DateFormat> r1 = r5.dateFormats
            monitor-enter(r1)
            java.util.List<java.text.DateFormat> r2 = r5.dateFormats     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L26
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L26
            java.text.DateFormat r3 = (java.text.DateFormat) r3     // Catch: java.lang.Throwable -> L26
            java.util.TimeZone r4 = r3.getTimeZone()     // Catch: java.lang.Throwable -> L26
            java.util.Date r6 = r3.parse(r0)     // Catch: java.lang.Throwable -> L28 java.text.ParseException -> L2d
            r3.setTimeZone(r4)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r6
        L26:
            r6 = move-exception
            goto L61
        L28:
            r6 = move-exception
            r3.setTimeZone(r4)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L2d:
            r3.setTimeZone(r4)     // Catch: java.lang.Throwable -> L26
            goto Ld
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L3d
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L3d
            java.util.Date r6 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r0, r1)     // Catch: java.text.ParseException -> L3d
            return r6
        L3d:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed parsing '"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "' as Date; at path "
            r3.append(r0)
            java.lang.String r6 = r6.getPreviousPath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r1)
            throw r2
        L61:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r6
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.util.Date r1 = r0.read(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    public T read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.nextNull()
            r3 = 0
            return r3
        Ld:
            java.util.Date r3 = r2.deserializeToDate(r3)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<T extends java.util.Date> r0 = r2.dateType
            java.util.Date r3 = r0.deserialize(r3)
            return r3
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.List<java.text.DateFormat> r0 = r4.dateFormats
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            boolean r1 = r0 instanceof java.text.SimpleDateFormat
            r2 = 41
            java.lang.String r3 = "DefaultDateTypeAdapter("
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r0 = r0.toPattern()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.write(r1, r2)
            return
    }

    public void write(com.google.gson.stream.JsonWriter r3, java.util.Date r4) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L6
            r3.nullValue()
            return
        L6:
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.util.List<java.text.DateFormat> r1 = r2.dateFormats
            monitor-enter(r1)
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            r3.value(r4)
            return
        L1b:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }
}
