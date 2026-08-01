package com.google.gson.internal.bind;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends java.util.Date> extends com.google.gson.TypeAdapter<T> {
    private static final java.lang.String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final java.util.List<java.text.DateFormat> dateFormats;
    private final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$1 */
    static /* synthetic */ class C04211 {
    }

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

        protected DateType(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.dateClass = r1
                return
        }

        private com.google.gson.TypeAdapterFactory createFactory(com.google.gson.internal.bind.DefaultDateTypeAdapter<T> r2) {
                r1 = this;
                java.lang.Class<T extends java.util.Date> r0 = r1.dateClass
                com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.TypeAdapters.newFactory(r0, r2)
                return r0
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(int r3) {
                r2 = this;
                com.google.gson.internal.bind.DefaultDateTypeAdapter r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter
                r1 = 0
                r0.<init>(r2, r3, r1)
                com.google.gson.TypeAdapterFactory r0 = r2.createFactory(r0)
                return r0
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(int r3, int r4) {
                r2 = this;
                com.google.gson.internal.bind.DefaultDateTypeAdapter r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter
                r1 = 0
                r0.<init>(r2, r3, r4, r1)
                com.google.gson.TypeAdapterFactory r0 = r2.createFactory(r0)
                return r0
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(java.lang.String r3) {
                r2 = this;
                com.google.gson.internal.bind.DefaultDateTypeAdapter r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter
                r1 = 0
                r0.<init>(r2, r3, r1)
                com.google.gson.TypeAdapterFactory r0 = r2.createFactory(r0)
                return r0
        }

        public final com.google.gson.TypeAdapterFactory createDefaultsAdapterFactory() {
                r3 = this;
                com.google.gson.internal.bind.DefaultDateTypeAdapter r0 = new com.google.gson.internal.bind.DefaultDateTypeAdapter
                r1 = 2
                r2 = 0
                r0.<init>(r3, r1, r1, r2)
                com.google.gson.TypeAdapterFactory r0 = r3.createFactory(r0)
                return r0
        }

        protected abstract T deserialize(java.util.Date r1);
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.lang.Object r0 = java.util.Objects.requireNonNull(r3)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r0 = (com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType) r0
            r2.dateType = r0
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            java.util.Locale r1 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance(r4, r1)
            r0.add(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.Locale r1 = java.util.Locale.US
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance(r4)
            r0.add(r1)
        L32:
            boolean r0 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r0 == 0) goto L41
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            java.text.DateFormat r1 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateFormat(r4)
            r0.add(r1)
        L41:
            return
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dateFormats = r0
            java.lang.Object r0 = java.util.Objects.requireNonNull(r3)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r0 = (com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType) r0
            r2.dateType = r0
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            java.util.Locale r1 = java.util.Locale.US
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r4, r5, r1)
            r0.add(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.Locale r1 = java.util.Locale.US
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r4, r5)
            r0.add(r1)
        L32:
            boolean r0 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r0 == 0) goto L41
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            java.text.DateFormat r1 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(r4, r5)
            r0.add(r1)
        L41:
            return
    }

    /* synthetic */ DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType r1, int r2, int r3, com.google.gson.internal.bind.DefaultDateTypeAdapter.C04211 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    /* synthetic */ DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType r1, int r2, com.google.gson.internal.bind.DefaultDateTypeAdapter.C04211 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.dateFormats = r0
            java.lang.Object r0 = java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r0 = (com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType) r0
            r3.dateType = r0
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.US
            r1.<init>(r5, r2)
            r0.add(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.Locale r1 = java.util.Locale.US
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            java.util.List<java.text.DateFormat> r0 = r3.dateFormats
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r5)
            r0.add(r1)
        L34:
            return
    }

    /* synthetic */ DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType r1, java.lang.String r2, com.google.gson.internal.bind.DefaultDateTypeAdapter.C04211 r3) {
            r0 = this;
            r0.<init>(r1, r2)
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
            r0 = 0
            return r0
        Ld:
            java.util.Date r0 = r2.deserializeToDate(r3)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<T extends java.util.Date> r1 = r2.dateType
            java.util.Date r1 = r1.deserialize(r0)
            return r1
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
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            r3 = r0
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3
            java.lang.String r3 = r3.toPattern()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.write(r1, r2)
            return
    }

    public void write(com.google.gson.stream.JsonWriter r4, java.util.Date r5) throws java.io.IOException {
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
