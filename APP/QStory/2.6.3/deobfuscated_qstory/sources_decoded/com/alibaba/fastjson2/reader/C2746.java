package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.bytebuddy.description.method.ParameterDescription;
import p009.AbstractC6183;
import p144.C7547;
import p278.C8363;
import p297.AbstractC8591;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2746 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final HashMap f8389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f8390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Parameter[] f8391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final HashMap f8392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final HashMap f8393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long[] f8394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final HashMap f8395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f8396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BiFunction f8397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Constructor f8398;

    public C2746(ArrayList arrayList, Constructor constructor, Function function, BiFunction biFunction, Constructor constructor2, String... strArr) {
        this.f8396 = function;
        this.f8397 = biFunction;
        boolean z = constructor2 != null;
        this.f8390 = z;
        this.f8398 = z ? constructor2 : constructor;
        Parameter[] parameters = constructor.getParameters();
        this.f8391 = parameters;
        this.f8394 = new long[parameters.length];
        int i = 0;
        while (true) {
            Parameter[] parameterArr = this.f8391;
            if (i >= parameterArr.length) {
                break;
            }
            String name = i < strArr.length ? strArr[i] : parameterArr[i].getName();
            if (name == null) {
                name = AbstractC6183.m11588(i, ParameterDescription.NAME_PREFIX);
            }
            this.f8394[i] = AbstractC2860.m5774(name);
            i++;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            this.f8395 = new HashMap(size, 1.0f);
            this.f8392 = new HashMap(size, 1.0f);
            this.f8389 = new HashMap(size, 1.0f);
            this.f8393 = new HashMap(size, 1.0f);
            for (int i2 = 0; i2 < size; i2++) {
                Constructor constructor3 = (Constructor) arrayList.get(i2);
                constructor3.setAccessible(true);
                String[] strArrM14217 = AbstractC8591.m14217(constructor3);
                Parameter[] parameters2 = constructor3.getParameters();
                C8363 c8363 = new C8363();
                C2802 c2802M6387 = AbstractC2933.m6387();
                for (int i3 = 0; i3 < parameters2.length && i3 < strArrM14217.length; i3++) {
                    c8363.m13865();
                    c2802M6387.m5623(c8363, constructor3.getDeclaringClass(), constructor3, i3, parameters2[i3]);
                    String str = c8363.f23049;
                    if (str != null) {
                        strArrM14217[i3] = str;
                    }
                }
                long[] jArr = new long[strArrM14217.length];
                Type[] genericParameterTypes = constructor3.getGenericParameterTypes();
                HashSet hashSet = new HashSet(strArrM14217.length);
                for (int i4 = 0; i4 < strArrM14217.length; i4++) {
                    long jM5774 = AbstractC2860.m5774(strArrM14217[i4]);
                    jArr[i4] = jM5774;
                    hashSet.add(Long.valueOf(jM5774));
                }
                this.f8395.put(hashSet, constructor3);
                this.f8392.put(hashSet, strArrM14217);
                this.f8393.put(hashSet, jArr);
                this.f8389.put(hashSet, genericParameterTypes);
            }
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        long[] jArr = this.f8394;
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (map.containsKey(Long.valueOf(jArr[i2]))) {
                i2++;
            } else {
                HashMap map2 = this.f8395;
                if (map2 != null) {
                    Set setKeySet = map.keySet();
                    Constructor constructor = (Constructor) map2.get(setKeySet);
                    if (constructor != null) {
                        long[] jArr2 = (long[]) this.f8393.get(setKeySet);
                        Type[] typeArr = (Type[]) this.f8389.get(setKeySet);
                        Object[] objArr = new Object[jArr2.length];
                        while (i < jArr2.length) {
                            Object objM5945 = map.get(Long.valueOf(jArr2[i]));
                            Type type = typeArr[i];
                            if (objM5945 == null) {
                                objM5945 = AbstractC2867.m5945(type);
                            }
                            objArr[i] = objM5945;
                            i++;
                        }
                        try {
                            return constructor.newInstance(objArr);
                        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                            C7547.m12775("invoke constructor error, ", constructor, e);
                            return null;
                        }
                    }
                }
            }
        }
        Function function = this.f8396;
        Parameter[] parameterArr = this.f8391;
        if (function != null && parameterArr.length == 1) {
            Parameter parameter = parameterArr[0];
            Object objM5927 = map.get(Long.valueOf(jArr[0]));
            Class<?> type2 = parameter.getType();
            if (objM5927 == null) {
                objM5927 = AbstractC2867.m5945(type2);
            } else if (!type2.isInstance(objM5927)) {
                objM5927 = AbstractC2867.m5927(type2, objM5927);
            }
            return function.apply(objM5927);
        }
        BiFunction biFunction = this.f8397;
        if (biFunction != null && parameterArr.length == 2) {
            Object objM59272 = map.get(Long.valueOf(jArr[0]));
            Class<?> type3 = parameterArr[0].getType();
            if (objM59272 == null) {
                objM59272 = AbstractC2867.m5945(type3);
            } else if (!type3.isInstance(objM59272)) {
                objM59272 = AbstractC2867.m5927(type3, objM59272);
            }
            Object objM59273 = map.get(Long.valueOf(jArr[1]));
            Class<?> type4 = parameterArr[1].getType();
            if (objM59273 == null) {
                objM59273 = AbstractC2867.m5945(type4);
            } else if (!type4.isInstance(objM59273)) {
                objM59273 = AbstractC2867.m5927(type4, objM59273);
            }
            return biFunction.apply(objM59272, objM59273);
        }
        int length2 = parameterArr.length;
        Constructor constructor2 = this.f8398;
        Object[] objArr2 = new Object[constructor2.getParameterCount()];
        if (this.f8390) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                Parameter parameter2 = parameterArr[i3];
                Class<?> type5 = parameter2.getType();
                Type parameterizedType = parameter2.getParameterizedType();
                Object objM5925 = map.get(Long.valueOf(jArr[i3]));
                if (objM5925 != null) {
                    if (!type5.isInstance(objM5925)) {
                        objM5925 = AbstractC2867.m5927(type5, objM5925);
                    } else if (parameterizedType instanceof ParameterizedType) {
                        objM5925 = AbstractC2867.m5925(objM5925, parameterizedType);
                    }
                    objArr2[i3] = objM5925;
                } else {
                    i4 |= 1 << i3;
                    if (type5.isPrimitive()) {
                        objArr2[i3] = AbstractC2867.m5945(type5);
                    }
                }
                int i5 = i3 + 1;
                if (i5 % 32 == 0 || i5 == length2) {
                    objArr2[(i3 / 32) + length2] = Integer.valueOf(i4);
                    i4 = 0;
                }
                i3 = i5;
            }
        } else {
            while (i < length2) {
                Parameter parameter3 = parameterArr[i];
                Class<?> type6 = parameter3.getType();
                Type parameterizedType2 = parameter3.getParameterizedType();
                Object objM59252 = map.get(Long.valueOf(jArr[i]));
                if (objM59252 == null) {
                    objM59252 = AbstractC2867.m5945(type6);
                } else if (!type6.isInstance(objM59252)) {
                    objM59252 = AbstractC2867.m5927(type6, objM59252);
                } else if (parameterizedType2 instanceof ParameterizedType) {
                    objM59252 = AbstractC2867.m5925(objM59252, parameterizedType2);
                }
                objArr2[i] = objM59252;
                i++;
            }
        }
        try {
            return constructor2.newInstance(objArr2);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e2) {
            C7547.m12775("invoke constructor error, ", constructor2, e2);
            return null;
        }
    }
}
