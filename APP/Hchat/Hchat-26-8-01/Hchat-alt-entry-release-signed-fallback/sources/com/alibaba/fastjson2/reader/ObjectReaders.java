package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaders {
    public ObjectReaders() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.alibaba.fastjson2.reader.FieldReader fieldReader(java.lang.String r6, java.lang.Class r7) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r1 = 0
            r5 = 0
            r4 = r7
            r2 = r6
            r3 = r7
            com.alibaba.fastjson2.reader.FieldReader r6 = r0.createFieldReader(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReader(java.lang.String r6, java.lang.Class<V> r7, java.util.function.BiConsumer<T, V> r8) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r4 = 0
            r3 = r7
            r1 = r6
            r2 = r7
            r5 = r8
            com.alibaba.fastjson2.reader.FieldReader r6 = r0.createFieldReader(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.alibaba.fastjson2.reader.FieldReader fieldReader(java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r1 = 0
            r5 = 0
            r2 = r6
            r3 = r7
            r4 = r8
            com.alibaba.fastjson2.reader.FieldReader r6 = r0.createFieldReader(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReader(java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class<V> r8, java.util.function.BiConsumer<T, V> r9) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r4 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            com.alibaba.fastjson2.reader.FieldReader r6 = r0.createFieldReader(r1, r2, r3, r4, r5)
            return r6
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReader(java.lang.String r13, java.lang.reflect.Type r14, java.util.function.BiConsumer<T, V> r15, com.alibaba.fastjson2.reader.ObjectReader<V> r16) {
            com.alibaba.fastjson2.reader.FieldReaderObjectFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectFunc
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.getClass(r14)
            r9 = 0
            r10 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r1 = r13
            r2 = r14
            r11 = r15
            r12 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderBool(java.lang.String r3, com.alibaba.fastjson2.function.ObjBoolConsumer<T> r4) {
            com.alibaba.fastjson2.reader.FieldReaderBoolValFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderBoolValFunc
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2, r4)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderByte(java.lang.String r3, com.alibaba.fastjson2.function.ObjByteConsumer<T> r4) {
            com.alibaba.fastjson2.reader.FieldReaderInt8ValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderInt8ValueFunc
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2, r4)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderChar(java.lang.String r7, com.alibaba.fastjson2.function.ObjCharConsumer<T> r8) {
            com.alibaba.fastjson2.reader.FieldReaderCharValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderCharValueFunc
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderDouble(java.lang.String r6, java.util.function.ObjDoubleConsumer<T> r7) {
            com.alibaba.fastjson2.reader.FieldReaderDoubleValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderDoubleValueFunc
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderFloat(java.lang.String r6, com.alibaba.fastjson2.function.ObjFloatConsumer<T> r7) {
            com.alibaba.fastjson2.reader.FieldReaderFloatValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderFloatValueFunc
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderInt(java.lang.String r6, java.util.function.ObjIntConsumer<T> r7) {
            com.alibaba.fastjson2.reader.FieldReaderInt32ValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32ValueFunc
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReaderList(java.lang.String r1, java.lang.reflect.Type r2, java.util.function.BiConsumer<T, java.util.List<V>> r3) {
            com.alibaba.fastjson2.reader.n r0 = new com.alibaba.fastjson2.reader.n
            r0.<init>()
            com.alibaba.fastjson2.reader.FieldReader r1 = fieldReaderList(r1, r2, r0, r3)
            return r1
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReaderList(java.lang.String r6, java.lang.reflect.Type r7, java.util.function.Supplier<java.util.List<V>> r8, java.util.function.BiConsumer<T, java.util.List<V>> r9) {
            com.alibaba.fastjson2.reader.FieldReaderListFuncImpl r0 = new com.alibaba.fastjson2.reader.FieldReaderListFuncImpl
            r2 = 0
            r5 = r6
            r4 = r7
            r1 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReaderList(java.lang.String r6, java.lang.reflect.Type r7, java.util.function.Supplier<java.util.List<V>> r8, java.util.function.BiConsumer<T, java.util.List<V>> r9, com.alibaba.fastjson2.reader.ObjectReader<V> r10) {
            com.alibaba.fastjson2.reader.FieldReaderListFuncImpl r0 = new com.alibaba.fastjson2.reader.FieldReaderListFuncImpl
            r5 = r6
            r4 = r7
            r1 = r8
            r3 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderListStr(java.lang.String r6, java.util.function.BiConsumer<T, java.util.List<java.lang.String>> r7) {
            com.alibaba.fastjson2.reader.FieldReaderListFuncImpl r0 = new com.alibaba.fastjson2.reader.FieldReaderListFuncImpl
            com.alibaba.fastjson2.reader.n r1 = new com.alibaba.fastjson2.reader.n
            r1.<init>()
            r2 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderLong(java.lang.String r6, java.util.function.ObjLongConsumer<T> r7) {
            com.alibaba.fastjson2.reader.FieldReaderInt64ValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64ValueFunc
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static <T, V> com.alibaba.fastjson2.reader.FieldReader fieldReaderMap(java.lang.String r13, java.lang.Class r14, java.lang.reflect.Type r15, java.lang.reflect.Type r16, java.util.function.BiConsumer<T, java.util.Map> r17) {
            com.alibaba.fastjson2.reader.FieldReaderObject r0 = new com.alibaba.fastjson2.reader.FieldReaderObject
            r1 = 2
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r15
            r15 = 1
            r1[r15] = r16
            java.lang.reflect.Type r2 = com.alibaba.fastjson2.TypeReference.parametricType(r14, r1)
            r10 = 0
            r11 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r13
            r3 = r14
            r12 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderShort(java.lang.String r10, com.alibaba.fastjson2.function.ObjShortConsumer<T> r11) {
            com.alibaba.fastjson2.reader.FieldReaderInt16ValueFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderInt16ValueFunc
            r7 = 0
            r8 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r9 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.FieldReader fieldReaderString(java.lang.String r6, java.util.function.BiConsumer<T, java.lang.String> r7) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1 = r6
            r5 = r7
            com.alibaba.fastjson2.reader.FieldReader r6 = r0.createFieldReader(r1, r2, r3, r4, r5)
            return r6
    }

    public static com.alibaba.fastjson2.reader.FieldReader fieldReaderWithField(java.lang.String r1, java.lang.Class r2) {
            java.lang.reflect.Field r2 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r2, r1)
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.FieldReader r1 = r0.createFieldReader(r1, r2)
            return r1
    }

    public static com.alibaba.fastjson2.reader.FieldReader fieldReaderWithField(java.lang.String r0, java.lang.Class r1, java.lang.String r2) {
            java.lang.reflect.Field r1 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r1, r2)
            com.alibaba.fastjson2.reader.ObjectReaderCreator r2 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.FieldReader r0 = r2.createFieldReader(r0, r1)
            return r0
    }

    public static com.alibaba.fastjson2.reader.FieldReader fieldReaderWithMethod(java.lang.String r0, java.lang.Class r1, java.lang.String r2) {
            java.lang.reflect.Method r1 = com.alibaba.fastjson2.util.BeanUtils.getSetter(r1, r2)
            com.alibaba.fastjson2.reader.ObjectReaderCreator r2 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.FieldReader r0 = r2.createFieldReader(r0, r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromBigDecimal(java.util.function.Function<java.math.BigDecimal, java.lang.Object> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromByteArray(java.util.function.Function<byte[], java.lang.Object> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray
            java.lang.String r1 = "base64"
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromCharArray(java.util.function.Function<char[], java.lang.Object> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromDoubleArray(java.util.function.Function<double[], java.lang.Object> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromFloatArray(java.util.function.Function<float[], java.lang.Object> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromIntArray(java.util.function.Function<int[], java.lang.Object> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromLongArray(java.util.function.Function<long[], java.lang.Object> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> fromShortArray(java.util.function.Function<short[], java.lang.Object> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray
            r0.<init>(r1)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> objectReader(java.lang.Class<T> r1, java.util.function.Supplier<T> r2, com.alibaba.fastjson2.reader.FieldReader... r3) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.createObjectReader(r1, r2, r3)
            return r1
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> objectReader(java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> r2, com.alibaba.fastjson2.reader.FieldReader... r3) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r1 = 0
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.createObjectReaderNoneDefaultConstructor(r1, r2, r3)
            return r2
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> of(java.lang.Class<T> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.createObjectReader(r1)
            return r1
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> of(java.lang.Class<T> r1, java.util.function.Supplier<T> r2, com.alibaba.fastjson2.reader.FieldReader... r3) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.createObjectReader(r1, r2, r3)
            return r1
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> of(java.util.function.Supplier<T> r2, com.alibaba.fastjson2.reader.FieldReader... r3) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r1 = 0
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.createObjectReader(r1, r2, r3)
            return r2
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> ofInt(java.util.function.IntFunction<T> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderImplFromInt r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromInt
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> ofLong(java.util.function.LongFunction<T> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderImplFromLong r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromLong
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> ofReflect(java.lang.Class<T> r1) {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.createObjectReader(r1)
            return r1
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReader<T> ofString(java.util.function.Function<java.lang.String, T> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }
}
