package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FactoryFunction<T> implements Function<Map<Long, Object>, T> {
    final BiFunction biFunction;
    final Method factoryMethod;
    final Function function;
    final long[] hashCodes;
    final String[] paramNames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FactoryFunction(Method method, String... strArr) {
        this.factoryMethod = method;
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.paramNames = new String[parameterTypes.length];
        this.hashCodes = new long[parameterTypes.length];
        int i9 = 0;
        while (true) {
            if (i9 >= parameterTypes.length) {
                this.function = null;
                this.biFunction = null;
                return;
            }
            String strM2249l = i9 < strArr.length ? strArr[i9] : null;
            if (strM2249l == null) {
                strM2249l = AbstractC0921a.m2249l(i9, "arg");
            }
            strArr[i9] = strM2249l;
            this.hashCodes[i9] = Fnv.hashCode64(strM2249l);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.function.Function */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.function.BiFunction */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public T apply(Map<Long, Object> map) {
        if (this.function != null) {
            return (T) this.function.apply(map.get(Long.valueOf(this.hashCodes[0])));
        }
        BiFunction biFunction = this.biFunction;
        long[] jArr = this.hashCodes;
        if (biFunction != null) {
            return (T) this.biFunction.apply(map.get(Long.valueOf(jArr[0])), map.get(Long.valueOf(this.hashCodes[1])));
        }
        int length = jArr.length;
        Object[] objArr = new Object[length];
        for (int i9 = 0; i9 < length; i9++) {
            objArr[i9] = map.get(Long.valueOf(this.hashCodes[i9]));
        }
        try {
            return (T) this.factoryMethod.invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            C0086a.m465x("invoke factoryMethod error", e6);
            return null;
        }
    }
}
