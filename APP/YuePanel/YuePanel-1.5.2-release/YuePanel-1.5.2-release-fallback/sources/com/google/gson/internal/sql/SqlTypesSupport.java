package com.google.gson.internal.sql;

/* JADX INFO: loaded from: classes2.dex */
public final class SqlTypesSupport {
    public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<? extends java.util.Date> DATE_DATE_TYPE = null;
    public static final com.google.gson.TypeAdapterFactory DATE_FACTORY = null;
    public static final java.util.List<com.google.gson.TypeAdapterFactory> SQL_TYPE_FACTORIES = null;
    public static final boolean SUPPORTS_SQL_TYPES = false;
    public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<? extends java.util.Date> TIMESTAMP_DATE_TYPE = null;
    public static final com.google.gson.TypeAdapterFactory TIMESTAMP_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory TIME_FACTORY = null;



    static {
            r0 = 0
            r1 = 1
            java.lang.String r2 = "java.sql.Date"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES = r2
            if (r2 == 0) goto L41
            com.google.gson.internal.sql.SqlTypesSupport$1 r2 = new com.google.gson.internal.sql.SqlTypesSupport$1
            java.lang.Class<java.sql.Date> r3 = java.sql.Date.class
            r2.<init>(r3)
            com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE = r2
            com.google.gson.internal.sql.SqlTypesSupport$2 r2 = new com.google.gson.internal.sql.SqlTypesSupport$2
            java.lang.Class<java.sql.Timestamp> r3 = java.sql.Timestamp.class
            r2.<init>(r3)
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE = r2
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.sql.SqlDateTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY = r2
            com.google.gson.TypeAdapterFactory r3 = com.google.gson.internal.sql.SqlTimeTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY = r3
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.sql.SqlTimestampTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY = r4
            r5 = 3
            com.google.gson.TypeAdapterFactory[] r5 = new com.google.gson.TypeAdapterFactory[r5]
            r5[r0] = r3
            r5[r1] = r2
            r0 = 2
            r5[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.google.gson.internal.sql.SqlTypesSupport.SQL_TYPE_FACTORIES = r0
            goto L52
        L41:
            r0 = 0
            com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE = r0
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE = r0
            com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY = r0
            com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY = r0
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY = r0
            java.util.List r0 = java.util.Collections.emptyList()
            com.google.gson.internal.sql.SqlTypesSupport.SQL_TYPE_FACTORIES = r0
        L52:
            return
    }

    private SqlTypesSupport() {
            r0 = this;
            r0.<init>()
            return
    }
}
