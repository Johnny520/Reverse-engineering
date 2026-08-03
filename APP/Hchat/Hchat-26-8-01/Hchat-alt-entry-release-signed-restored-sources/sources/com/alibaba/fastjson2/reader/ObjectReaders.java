package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.TypeReference;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaders {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T, V> FieldReader fieldReader(String str, Type type, BiConsumer<T, V> biConsumer, ObjectReader<V> objectReader) {
        return new FieldReaderObjectFunc(str, type, TypeUtils.getClass(type), 0, 0L, null, null, null, null, biConsumer, objectReader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderBool(String str, ObjBoolConsumer<T> objBoolConsumer) {
        return new FieldReaderBoolValFunc(str, 0, null, objBoolConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderByte(String str, ObjByteConsumer<T> objByteConsumer) {
        return new FieldReaderInt8ValueFunc(str, 0, null, objByteConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderChar(String str, ObjCharConsumer<T> objCharConsumer) {
        return new FieldReaderCharValueFunc(str, 0, null, null, null, objCharConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderDouble(String str, ObjDoubleConsumer<T> objDoubleConsumer) {
        return new FieldReaderDoubleValueFunc(str, 0, null, null, objDoubleConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderFloat(String str, ObjFloatConsumer<T> objFloatConsumer) {
        return new FieldReaderFloatValueFunc(str, 0, null, null, objFloatConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderInt(String str, ObjIntConsumer<T> objIntConsumer) {
        return new FieldReaderInt32ValueFunc(str, 0, null, null, objIntConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T, V> FieldReader fieldReaderList(String str, Type type, Supplier<List<V>> supplier, BiConsumer<T, List<V>> biConsumer, ObjectReader<V> objectReader) {
        return new FieldReaderListFuncImpl(supplier, objectReader, biConsumer, type, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderListStr(String str, BiConsumer<T, List<String>> biConsumer) {
        return new FieldReaderListFuncImpl(new C0635n(), null, biConsumer, String.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderLong(String str, ObjLongConsumer<T> objLongConsumer) {
        return new FieldReaderInt64ValueFunc(str, 0, null, null, objLongConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T, V> FieldReader fieldReaderMap(String str, Class cls, Type type, Type type2, BiConsumer<T, Map> biConsumer) {
        return new FieldReaderObject(str, TypeReference.parametricType((Class<?>) cls, type, type2), cls, 0, 0L, null, null, null, null, null, biConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderShort(String str, ObjShortConsumer<T> objShortConsumer) {
        return new FieldReaderInt16ValueFunc(str, 0, 0L, null, null, null, null, objShortConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldReader fieldReaderString(String str, BiConsumer<T, String> biConsumer) {
        return ObjectReaderCreator.INSTANCE.createFieldReader(str, String.class, String.class, (Method) null, biConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FieldReader fieldReaderWithField(String str, Class cls) {
        return ObjectReaderCreator.INSTANCE.createFieldReader(str, BeanUtils.getDeclaredField(cls, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FieldReader fieldReaderWithMethod(String str, Class cls, String str2) {
        return ObjectReaderCreator.INSTANCE.createFieldReader(str, BeanUtils.getSetter(cls, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromBigDecimal(Function<BigDecimal, Object> function) {
        return new ObjectReaderImplBigDecimal(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromByteArray(Function<byte[], Object> function) {
        return new ObjectReaderImplInt8ValueArray(function, "base64");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromCharArray(Function<char[], Object> function) {
        return new ObjectReaderImplCharValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromDoubleArray(Function<double[], Object> function) {
        return new ObjectReaderImplDoubleValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromFloatArray(Function<float[], Object> function) {
        return new ObjectReaderImplFloatValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromIntArray(Function<int[], Object> function) {
        return new ObjectReaderImplInt32ValueArray(null, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromLongArray(Function<long[], Object> function) {
        return new ObjectReaderImplInt64ValueArray(null, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> fromShortArray(Function<short[], Object> function) {
        return new ObjectReaderImplInt16ValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> objectReader(Function<Map<Long, Object>, T> function, FieldReader... fieldReaderArr) {
        return ObjectReaderCreator.INSTANCE.createObjectReaderNoneDefaultConstructor(null, function, fieldReaderArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <T> ObjectReader<T> m1766of(Supplier<T> supplier, FieldReader... fieldReaderArr) {
        return ObjectReaderCreator.INSTANCE.createObjectReader(null, supplier, fieldReaderArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> ofInt(IntFunction<T> intFunction) {
        return new ObjectReaderImplFromInt(null, intFunction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> ofLong(LongFunction<T> longFunction) {
        return new ObjectReaderImplFromLong(null, longFunction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> ofReflect(Class<T> cls) {
        return ObjectReaderCreator.INSTANCE.createObjectReader((Class) cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectReader<T> ofString(Function<String, T> function) {
        return new ObjectReaderImplFromString(null, function);
    }

    public static <T> ObjectReader<T> objectReader(Class<T> cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        return ObjectReaderCreator.INSTANCE.createObjectReader(cls, supplier, fieldReaderArr);
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReader<T> m1765of(Class<T> cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        return ObjectReaderCreator.INSTANCE.createObjectReader(cls, supplier, fieldReaderArr);
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReader<T> m1764of(Class<T> cls) {
        return ObjectReaderCreator.INSTANCE.createObjectReader((Class) cls);
    }

    public static <T, V> FieldReader fieldReaderList(String str, Type type, Supplier<List<V>> supplier, BiConsumer<T, List<V>> biConsumer) {
        return new FieldReaderListFuncImpl(supplier, null, biConsumer, type, str);
    }

    public static FieldReader fieldReaderWithField(String str, Class cls, String str2) {
        return ObjectReaderCreator.INSTANCE.createFieldReader(str, BeanUtils.getDeclaredField(cls, str2));
    }

    public static <T, V> FieldReader fieldReaderList(String str, Type type, BiConsumer<T, List<V>> biConsumer) {
        return fieldReaderList(str, type, new C0635n(), biConsumer);
    }

    public static FieldReader fieldReader(String str, Type type, Class cls) {
        return ObjectReaderCreator.INSTANCE.createFieldReader((Class) null, str, type, cls, (Method) null);
    }

    public static <T, V> FieldReader fieldReader(String str, Class<V> cls, BiConsumer<T, V> biConsumer) {
        return ObjectReaderCreator.INSTANCE.createFieldReader(str, cls, cls, (Method) null, biConsumer);
    }

    public static <T, V> FieldReader fieldReader(String str, Type type, Class<V> cls, BiConsumer<T, V> biConsumer) {
        return ObjectReaderCreator.INSTANCE.createFieldReader(str, type, cls, (Method) null, biConsumer);
    }

    public static FieldReader fieldReader(String str, Class cls) {
        return ObjectReaderCreator.INSTANCE.createFieldReader((Class) null, str, cls, cls, (Method) null);
    }
}
