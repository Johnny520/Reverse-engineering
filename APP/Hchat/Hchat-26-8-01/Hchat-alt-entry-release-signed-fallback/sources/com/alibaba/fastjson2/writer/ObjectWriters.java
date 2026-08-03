package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriters {
    static com.alibaba.fastjson2.writer.ObjectWriterCreator INSTANCE;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriterCreator.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE = r0
            return
    }

    public ObjectWriters() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int a(java.util.function.ToLongFunction r0, java.lang.Object r1) {
            int r0 = lambda$ofToBooleanArray$0(r0, r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, com.alibaba.fastjson2.function.ToByteFunction<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, com.alibaba.fastjson2.function.ToFloatFunction<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, com.alibaba.fastjson2.function.ToShortFunction<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T, V> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, java.lang.Class<V> r2, java.util.function.Function<T, V> r3) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2, r3)
            return r1
    }

    public static <T, V> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class<V> r3, java.util.function.Function<T, V> r4) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2, r3, r4)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r2, java.util.function.Function<T, java.lang.String> r3) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.alibaba.fastjson2.writer.FieldWriter r2 = r0.createFieldWriter(r2, r1, r3)
            return r2
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, java.util.function.Predicate<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, java.util.function.ToDoubleFunction<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, java.util.function.ToIntFunction<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriter(java.lang.String r1, java.util.function.ToLongFunction<T> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2)
            return r1
    }

    public static <T, V> com.alibaba.fastjson2.writer.FieldWriter fieldWriterList(java.lang.String r4, java.lang.Class<V> r5, java.util.function.Function<T, java.util.List<V>> r6) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r5 != r0) goto L9
            java.lang.reflect.ParameterizedType r5 = com.alibaba.fastjson2.util.TypeUtils.PARAM_TYPE_LIST_STR
            goto L15
        L9:
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r5
            r0.<init>(r1, r2)
            r5 = r0
        L15:
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriter r4 = r0.createFieldWriter(r4, r5, r1, r6)
            return r4
    }

    public static <T> com.alibaba.fastjson2.writer.FieldWriter fieldWriterListString(java.lang.String r3, java.util.function.Function<T, java.util.List<java.lang.String>> r4) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            java.lang.reflect.ParameterizedType r1 = com.alibaba.fastjson2.util.TypeUtils.PARAM_TYPE_LIST_STR
            java.lang.Class<java.util.List> r2 = java.util.List.class
            com.alibaba.fastjson2.writer.FieldWriter r3 = r0.createFieldWriter(r3, r1, r2, r4)
            return r3
    }

    private static /* synthetic */ int lambda$ofToBooleanArray$0(java.util.function.ToLongFunction r0, java.lang.Object r1) {
            long r0 = r0.applyAsLong(r1)
            int r0 = (int) r0
            return r0
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter objectWriter(java.lang.Class r1) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.createObjectWriter(r1)
            return r1
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter objectWriter(java.lang.Class r1, long r2, com.alibaba.fastjson2.writer.FieldWriter... r4) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.createObjectWriter(r1, r2, r4)
            return r1
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter objectWriter(java.lang.Class r1, com.alibaba.fastjson2.writer.FieldWriter... r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.createObjectWriter(r1, r2)
            return r1
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter objectWriter(com.alibaba.fastjson2.writer.FieldWriter... r1) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.createObjectWriter(r1)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter<T> of(java.lang.Class<T> r1, com.alibaba.fastjson2.writer.FieldWriter... r2) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.createObjectWriter(r1, r2)
            return r1
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter ofReflect(java.lang.Class r1) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriterCreator.INSTANCE
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.createObjectWriter(r1)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToBigDecimal(java.util.function.Function<java.lang.Object, java.math.BigDecimal> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToBooleanArray(java.util.function.Function<java.lang.Object, boolean[]> r1) {
            com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToBooleanArray(java.util.function.ToIntFunction r1, java.util.function.BiFunction<java.lang.Object, java.lang.Integer, java.lang.Boolean> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArrayLambda r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArrayLambda
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToBooleanArray(java.util.function.ToLongFunction r1, java.util.function.BiFunction<java.lang.Object, java.lang.Integer, java.lang.Boolean> r2) {
            com.alibaba.fastjson2.writer.c r0 = new com.alibaba.fastjson2.writer.c
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArrayLambda r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArrayLambda
            r1.<init>(r0, r2)
            return r1
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToByteArray(java.util.function.Function<java.lang.Object, byte[]> r1) {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToCharArray(java.util.function.Function<java.lang.Object, char[]> r1) {
            com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToDoubleArray(java.util.function.Function<java.lang.Object, double[]> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToFloatArray(java.util.function.Function<java.lang.Object, float[]> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToInt(java.util.function.ToIntFunction r10) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriterInt32ValFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterInt32ValFunc
            r7 = 0
            r8 = 0
            java.lang.String r2 = "toInt"
            r3 = 0
            r4 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r6 = 0
            r9 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            r10 = 1
            com.alibaba.fastjson2.writer.FieldWriter[] r10 = new com.alibaba.fastjson2.writer.FieldWriter[r10]
            r2 = 0
            r10[r2] = r1
            com.alibaba.fastjson2.writer.ObjectWriter r10 = r0.createObjectWriter(r10)
            return r10
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToIntArray(java.util.function.Function<java.lang.Object, int[]> r1) {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32ValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt32ValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToLong(java.util.function.ToLongFunction r10) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            com.alibaba.fastjson2.writer.FieldWriterInt64ValFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterInt64ValFunc
            r7 = 0
            r8 = 0
            java.lang.String r2 = "toLong"
            r3 = 0
            r4 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r6 = 0
            r9 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            r10 = 1
            com.alibaba.fastjson2.writer.FieldWriter[] r10 = new com.alibaba.fastjson2.writer.FieldWriter[r10]
            r2 = 0
            r10[r2] = r1
            com.alibaba.fastjson2.writer.ObjectWriter r10 = r0.createObjectWriter(r10)
            return r10
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToLongArray(java.util.function.Function<java.lang.Object, long[]> r1) {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToShortArray(java.util.function.Function<java.lang.Object, short[]> r1) {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt16ValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt16ValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.writer.ObjectWriter ofToString(java.util.function.Function<T, java.lang.String> r13) {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriters.INSTANCE
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r11 = 0
            r1 = 0
            r2 = 0
            java.lang.String r3 = "toString"
            r4 = 0
            r5 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r7 = 0
            r8 = 0
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r12 = r13
            com.alibaba.fastjson2.writer.FieldWriter r13 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            com.alibaba.fastjson2.writer.FieldWriter[] r13 = new com.alibaba.fastjson2.writer.FieldWriter[]{r13}
            com.alibaba.fastjson2.writer.ObjectWriter r13 = r0.createObjectWriter(r13)
            return r13
    }
}
