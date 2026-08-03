package com.alibaba.fastjson2.codec;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldInfo {
    public static final long BACKR_EFERENCE = 2305843009213693952L;
    public static final long CONTENT_AS = Long.MIN_VALUE;
    public static final long DISABLE_REFERENCE_DETECT = 288230376151711744L;
    public static final long DISABLE_SMART_MATCH = 144115188075855872L;
    public static final long DISABLE_UNSAFE = 36028797018963968L;
    public static final long FIELD_MASK = 4503599627370496L;
    public static final long RAW_VALUE_MASK = 1125899906842624L;
    public static final long READ_ONLY = 72057594037927936L;
    public static final long READ_USING_MASK = 2251799813685248L;
    public static final long RECORD = 4611686018427387904L;
    public static final long UNWRAPPED_MASK = 562949953421312L;
    public static final long VALUE_MASK = 281474976710656L;
    public java.lang.String[] alternateNames;
    public java.lang.Class<?> arrayToMapDuplicateHandler;
    public java.lang.String arrayToMapKey;
    public java.lang.Class<?> contentAs;
    public java.lang.String defaultValue;
    public long features;
    public boolean fieldClassMixIn;
    public java.lang.String fieldName;
    public java.lang.String format;
    public boolean ignore;
    public boolean isTransient;
    public java.lang.Class<?> keyUsing;
    public java.lang.String label;
    public java.util.Locale locale;
    public int ordinal;
    public java.lang.Class<?> readUsing;
    public boolean required;
    public java.lang.String schema;
    public java.lang.Class<?> valueUsing;
    public java.lang.Class<?> writeUsing;

    public FieldInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.function.BiConsumer getInitArrayToMapDuplicateHandler() {
            r3 = this;
            java.lang.Class<?> r0 = r3.arrayToMapDuplicateHandler
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.Class<java.util.function.BiConsumer> r2 = java.util.function.BiConsumer.class
            boolean r2 = r2.isAssignableFrom(r0)
            if (r2 == 0) goto L1c
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L1c
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L1c
            java.util.function.BiConsumer r0 = (java.util.function.BiConsumer) r0     // Catch: java.lang.Exception -> L1c
            return r0
        L1c:
            return r1
    }

    public com.alibaba.fastjson2.reader.ObjectReader getInitReader() {
            r3 = this;
            java.lang.Class<?> r0 = r3.readUsing
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.Class<com.alibaba.fastjson2.reader.ObjectReader> r2 = com.alibaba.fastjson2.reader.ObjectReader.class
            boolean r2 = r2.isAssignableFrom(r0)
            if (r2 == 0) goto L1c
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L1c
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L1c
            com.alibaba.fastjson2.reader.ObjectReader r0 = (com.alibaba.fastjson2.reader.ObjectReader) r0     // Catch: java.lang.Exception -> L1c
            return r0
        L1c:
            return r1
    }

    public void init() {
            r4 = this;
            r0 = 0
            r4.fieldName = r0
            r4.format = r0
            r4.label = r0
            r1 = 0
            r4.ordinal = r1
            r2 = 0
            r4.features = r2
            r4.ignore = r1
            r4.required = r1
            r4.alternateNames = r0
            r4.writeUsing = r0
            r4.keyUsing = r0
            r4.valueUsing = r0
            r4.readUsing = r0
            r4.fieldClassMixIn = r1
            r4.isTransient = r1
            r4.defaultValue = r0
            r4.locale = r0
            r4.arrayToMapKey = r0
            r4.arrayToMapDuplicateHandler = r0
            r4.contentAs = r0
            return
    }
}
