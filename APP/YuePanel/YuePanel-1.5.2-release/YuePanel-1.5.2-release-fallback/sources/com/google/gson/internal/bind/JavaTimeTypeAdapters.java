package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
@com.google.gson.internal.bind.IgnoreJRERequirement
final class JavaTimeTypeAdapters implements com.google.gson.internal.bind.TypeAdapters.FactorySupplier {
    private static final com.google.gson.TypeAdapter<java.time.Duration> DURATION = null;
    private static final com.google.gson.TypeAdapter<java.time.Instant> INSTANT = null;
    static final com.google.gson.TypeAdapterFactory JAVA_TIME_FACTORY = null;
    private static final com.google.gson.TypeAdapter<java.time.LocalDate> LOCAL_DATE = null;
    public static final com.google.gson.TypeAdapter<java.time.LocalTime> LOCAL_TIME = null;
    private static final com.google.gson.TypeAdapter<java.time.MonthDay> MONTH_DAY = null;
    private static final com.google.gson.TypeAdapter<java.time.Period> PERIOD = null;
    private static final com.google.gson.TypeAdapter<java.time.Year> YEAR = null;
    private static final com.google.gson.TypeAdapter<java.time.YearMonth> YEAR_MONTH = null;
    private static final com.google.gson.TypeAdapter<java.time.ZoneId> ZONE_ID = null;















    static {
            com.google.gson.internal.bind.JavaTimeTypeAdapters$1 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$1
            java.lang.String r1 = "seconds"
            java.lang.String r2 = "nanos"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2}
            r0.<init>(r3)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.DURATION = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$2 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$2
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r0.<init>(r1)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.INSTANT = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$3 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$3
            java.lang.String r1 = "year"
            java.lang.String r2 = "month"
            java.lang.String r3 = "day"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r3}
            r0.<init>(r4)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.LOCAL_DATE = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$4 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$4
            java.lang.String r4 = "second"
            java.lang.String r5 = "nano"
            java.lang.String r6 = "hour"
            java.lang.String r7 = "minute"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            r0.<init>(r4)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.LOCAL_TIME = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$6 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$6
            java.lang.String[] r3 = new java.lang.String[]{r2, r3}
            r0.<init>(r3)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.MONTH_DAY = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$9 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$9
            java.lang.String r3 = "months"
            java.lang.String r4 = "days"
            java.lang.String r5 = "years"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            r0.<init>(r3)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.PERIOD = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$10 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$10
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r0.<init>(r3)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.YEAR = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$11 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$11
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r0.<init>(r1)
            com.google.gson.internal.bind.JavaTimeTypeAdapters.YEAR_MONTH = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$12 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$12
            r0.<init>()
            com.google.gson.TypeAdapter r0 = r0.nullSafe()
            com.google.gson.internal.bind.JavaTimeTypeAdapters.ZONE_ID = r0
            com.google.gson.internal.bind.JavaTimeTypeAdapters$14 r0 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$14
            r0.<init>()
            com.google.gson.internal.bind.JavaTimeTypeAdapters.JAVA_TIME_FACTORY = r0
            return
    }

    public JavaTimeTypeAdapters() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object access$000(java.lang.Object r0, java.lang.String r1, com.google.gson.stream.JsonReader r2) {
            java.lang.Object r0 = requireNonNullField(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$100() {
            com.google.gson.TypeAdapter<java.time.Duration> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.DURATION
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$1000() {
            com.google.gson.TypeAdapter<java.time.YearMonth> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.YEAR_MONTH
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$1100() {
            com.google.gson.TypeAdapter<java.time.ZoneId> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.ZONE_ID
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$1200(com.google.gson.Gson r0) {
            com.google.gson.TypeAdapter r0 = zonedDateTime(r0)
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$200() {
            com.google.gson.TypeAdapter<java.time.Instant> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.INSTANT
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$300() {
            com.google.gson.TypeAdapter<java.time.LocalDate> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.LOCAL_DATE
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$400(com.google.gson.Gson r0) {
            com.google.gson.TypeAdapter r0 = localDateTime(r0)
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$500() {
            com.google.gson.TypeAdapter<java.time.MonthDay> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.MONTH_DAY
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$600(com.google.gson.Gson r0) {
            com.google.gson.TypeAdapter r0 = offsetDateTime(r0)
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$700(com.google.gson.Gson r0) {
            com.google.gson.TypeAdapter r0 = offsetTime(r0)
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$800() {
            com.google.gson.TypeAdapter<java.time.Period> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.PERIOD
            return r0
    }

    public static /* synthetic */ com.google.gson.TypeAdapter access$900() {
            com.google.gson.TypeAdapter<java.time.Year> r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.YEAR
            return r0
    }

    private static com.google.gson.TypeAdapter<java.time.LocalDateTime> localDateTime(com.google.gson.Gson r2) {
            java.lang.Class<java.time.LocalDate> r0 = java.time.LocalDate.class
            com.google.gson.TypeAdapter r0 = r2.getAdapter(r0)
            java.lang.Class<java.time.LocalTime> r1 = java.time.LocalTime.class
            com.google.gson.TypeAdapter r2 = r2.getAdapter(r1)
            com.google.gson.internal.bind.JavaTimeTypeAdapters$5 r1 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$5
            r1.<init>(r0, r2)
            com.google.gson.TypeAdapter r2 = r1.nullSafe()
            return r2
    }

    private static com.google.gson.TypeAdapter<java.time.OffsetDateTime> offsetDateTime(com.google.gson.Gson r2) {
            com.google.gson.TypeAdapter r0 = localDateTime(r2)
            java.lang.Class<java.time.ZoneOffset> r1 = java.time.ZoneOffset.class
            com.google.gson.TypeAdapter r2 = r2.getAdapter(r1)
            com.google.gson.internal.bind.JavaTimeTypeAdapters$7 r1 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$7
            r1.<init>(r0, r2)
            com.google.gson.TypeAdapter r2 = r1.nullSafe()
            return r2
    }

    private static com.google.gson.TypeAdapter<java.time.OffsetTime> offsetTime(com.google.gson.Gson r2) {
            java.lang.Class<java.time.LocalTime> r0 = java.time.LocalTime.class
            com.google.gson.TypeAdapter r0 = r2.getAdapter(r0)
            java.lang.Class<java.time.ZoneOffset> r1 = java.time.ZoneOffset.class
            com.google.gson.TypeAdapter r2 = r2.getAdapter(r1)
            com.google.gson.internal.bind.JavaTimeTypeAdapters$8 r1 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$8
            r1.<init>(r0, r2)
            com.google.gson.TypeAdapter r2 = r1.nullSafe()
            return r2
    }

    private static <T> T requireNonNullField(T r2, java.lang.String r3, com.google.gson.stream.JsonReader r4) {
            if (r2 == 0) goto L3
            return r2
        L3:
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Missing "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " field; at path "
            r0.append(r3)
            java.lang.String r3 = r4.getPreviousPath()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private static com.google.gson.TypeAdapter<java.time.ZonedDateTime> zonedDateTime(com.google.gson.Gson r3) {
            com.google.gson.TypeAdapter r0 = localDateTime(r3)
            java.lang.Class<java.time.ZoneOffset> r1 = java.time.ZoneOffset.class
            com.google.gson.TypeAdapter r1 = r3.getAdapter(r1)
            java.lang.Class<java.time.ZoneId> r2 = java.time.ZoneId.class
            com.google.gson.TypeAdapter r3 = r3.getAdapter(r2)
            com.google.gson.internal.bind.JavaTimeTypeAdapters$13 r2 = new com.google.gson.internal.bind.JavaTimeTypeAdapters$13
            r2.<init>(r0, r1, r3)
            com.google.gson.TypeAdapter r3 = r2.nullSafe()
            return r3
    }

    @Override // com.google.gson.internal.bind.TypeAdapters.FactorySupplier
    public com.google.gson.TypeAdapterFactory get() {
            r1 = this;
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.JavaTimeTypeAdapters.JAVA_TIME_FACTORY
            return r0
    }
}
