package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriters {
    static ObjectWriterCreator INSTANCE = ObjectWriterCreator.INSTANCE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldWriter fieldWriter(String str, Function<T, String> function) {
        return INSTANCE.createFieldWriter(str, String.class, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T, V> FieldWriter fieldWriterList(String str, Class<V> cls, Function<T, List<V>> function) {
        return INSTANCE.createFieldWriter(str, cls == String.class ? TypeUtils.PARAM_TYPE_LIST_STR : new ParameterizedTypeImpl(List.class, cls), List.class, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> FieldWriter fieldWriterListString(String str, Function<T, List<String>> function) {
        return INSTANCE.createFieldWriter(str, TypeUtils.PARAM_TYPE_LIST_STR, List.class, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$ofToBooleanArray$0(ToLongFunction toLongFunction, Object obj) {
        return (int) toLongFunction.applyAsLong(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectWriter objectWriter(Class cls) {
        return INSTANCE.createObjectWriter(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <T> ObjectWriter<T> m1792of(Class<T> cls, FieldWriter... fieldWriterArr) {
        return INSTANCE.createObjectWriter(cls, fieldWriterArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectWriter ofReflect(Class cls) {
        return ObjectWriterCreator.INSTANCE.createObjectWriter(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToBigDecimal(Function<Object, BigDecimal> function) {
        return new ObjectWriterImplBigDecimal(null, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToBooleanArray(final ToLongFunction toLongFunction, BiFunction<Object, Integer, Boolean> biFunction) {
        return new ObjectWriterImplBoolValueArrayLambda(new ToIntFunction() { // from class: com.alibaba.fastjson2.writer.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ObjectWriters.lambda$ofToBooleanArray$0(toLongFunction, obj);
            }
        }, biFunction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToByteArray(Function<Object, byte[]> function) {
        return new ObjectWriterImplInt8ValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToCharArray(Function<Object, char[]> function) {
        return new ObjectWriterImplCharValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToDoubleArray(Function<Object, double[]> function) {
        return new ObjectWriterImplDoubleValueArray(function, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToFloatArray(Function<Object, float[]> function) {
        return new ObjectWriterImplFloatValueArray(function, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToInt(ToIntFunction toIntFunction) {
        return INSTANCE.createObjectWriter(new FieldWriterInt32ValFunc("toInt", 0, FieldInfo.VALUE_MASK, null, null, null, toIntFunction));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToIntArray(Function<Object, int[]> function) {
        return new ObjectWriterImplInt32ValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToLong(ToLongFunction toLongFunction) {
        return INSTANCE.createObjectWriter(new FieldWriterInt64ValFunc("toLong", 0, FieldInfo.VALUE_MASK, null, null, null, toLongFunction));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToLongArray(Function<Object, long[]> function) {
        return new ObjectWriterImplInt64ValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToShortArray(Function<Object, short[]> function) {
        return new ObjectWriterImplInt16ValueArray(function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> ObjectWriter ofToString(Function<T, String> function) {
        ObjectWriterCreator objectWriterCreator = INSTANCE;
        return objectWriterCreator.createObjectWriter(objectWriterCreator.createFieldWriter(null, null, "toString", 0, FieldInfo.VALUE_MASK, null, null, String.class, String.class, null, function));
    }

    public static ObjectWriter objectWriter(Class cls, FieldWriter... fieldWriterArr) {
        return INSTANCE.createObjectWriter(cls, fieldWriterArr);
    }

    public static ObjectWriter objectWriter(Class cls, long j3, FieldWriter... fieldWriterArr) {
        return INSTANCE.createObjectWriter(cls, j3, fieldWriterArr);
    }

    public static <T> FieldWriter fieldWriter(String str, ToIntFunction<T> toIntFunction) {
        return INSTANCE.createFieldWriter(str, toIntFunction);
    }

    public static ObjectWriter objectWriter(FieldWriter... fieldWriterArr) {
        return INSTANCE.createObjectWriter(fieldWriterArr);
    }

    public static <T> FieldWriter fieldWriter(String str, ToShortFunction<T> toShortFunction) {
        return INSTANCE.createFieldWriter(str, toShortFunction);
    }

    public static <T> FieldWriter fieldWriter(String str, ToByteFunction<T> toByteFunction) {
        return INSTANCE.createFieldWriter(str, toByteFunction);
    }

    public static <T> ObjectWriter ofToBooleanArray(ToIntFunction toIntFunction, BiFunction<Object, Integer, Boolean> biFunction) {
        return new ObjectWriterImplBoolValueArrayLambda(toIntFunction, biFunction);
    }

    public static <T> FieldWriter fieldWriter(String str, ToFloatFunction<T> toFloatFunction) {
        return INSTANCE.createFieldWriter(str, toFloatFunction);
    }

    public static <T> ObjectWriter ofToBooleanArray(Function<Object, boolean[]> function) {
        return new ObjectWriterImplBoolValueArray(function);
    }

    public static <T> FieldWriter fieldWriter(String str, ToDoubleFunction<T> toDoubleFunction) {
        return INSTANCE.createFieldWriter(str, toDoubleFunction);
    }

    public static <T> FieldWriter fieldWriter(String str, Predicate<T> predicate) {
        return INSTANCE.createFieldWriter(str, predicate);
    }

    public static <T> FieldWriter fieldWriter(String str, ToLongFunction<T> toLongFunction) {
        return INSTANCE.createFieldWriter(str, toLongFunction);
    }

    public static <T, V> FieldWriter fieldWriter(String str, Class<V> cls, Function<T, V> function) {
        return INSTANCE.createFieldWriter(str, cls, function);
    }

    public static <T, V> FieldWriter fieldWriter(String str, Type type, Class<V> cls, Function<T, V> function) {
        return INSTANCE.createFieldWriter(str, type, cls, function);
    }
}
