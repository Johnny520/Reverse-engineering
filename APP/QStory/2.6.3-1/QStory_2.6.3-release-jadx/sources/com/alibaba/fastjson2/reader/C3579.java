package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
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
import p025.AbstractC7012;
import p160.C8376;
import p294.C9192;
import p313.AbstractC9420;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3579 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final HashMap f8734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f8735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Parameter[] f8736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final HashMap f8737;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final HashMap f8738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long[] f8739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final HashMap f8740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f8741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BiFunction f8742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Constructor f8743;

    public C3579(ArrayList arrayList, Constructor constructor, Function function, BiFunction biFunction, Constructor constructor2, String... strArr) {
        this.f8741 = function;
        this.f8742 = biFunction;
        boolean z = constructor2 != null;
        this.f8735 = z;
        this.f8743 = z ? constructor2 : constructor;
        Parameter[] parameters = constructor.getParameters();
        this.f8736 = parameters;
        this.f8739 = new long[parameters.length];
        int i = 0;
        while (true) {
            Parameter[] parameterArr = this.f8736;
            if (i >= parameterArr.length) {
                break;
            }
            String name = i < strArr.length ? strArr[i] : parameterArr[i].getName();
            if (name == null) {
                name = AbstractC7012.m12147(i, ParameterDescription.NAME_PREFIX);
            }
            this.f8739[i] = AbstractC3693.m6334(name);
            i++;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            this.f8740 = new HashMap(size, 1.0f);
            this.f8737 = new HashMap(size, 1.0f);
            this.f8734 = new HashMap(size, 1.0f);
            this.f8738 = new HashMap(size, 1.0f);
            for (int i2 = 0; i2 < size; i2++) {
                Constructor constructor3 = (Constructor) arrayList.get(i2);
                constructor3.setAccessible(true);
                String[] strArrM14776 = AbstractC9420.m14776(constructor3);
                Parameter[] parameters2 = constructor3.getParameters();
                C9192 c9192 = new C9192();
                C3635 c3635M6947 = AbstractC3766.m6947();
                for (int i3 = 0; i3 < parameters2.length && i3 < strArrM14776.length; i3++) {
                    c9192.m14424();
                    c3635M6947.m6183(c9192, constructor3.getDeclaringClass(), constructor3, i3, parameters2[i3]);
                    String str = c9192.f23394;
                    if (str != null) {
                        strArrM14776[i3] = str;
                    }
                }
                long[] jArr = new long[strArrM14776.length];
                Type[] genericParameterTypes = constructor3.getGenericParameterTypes();
                HashSet hashSet = new HashSet(strArrM14776.length);
                for (int i4 = 0; i4 < strArrM14776.length; i4++) {
                    long jM6334 = AbstractC3693.m6334(strArrM14776[i4]);
                    jArr[i4] = jM6334;
                    hashSet.add(Long.valueOf(jM6334));
                }
                this.f8740.put(hashSet, constructor3);
                this.f8737.put(hashSet, strArrM14776);
                this.f8738.put(hashSet, jArr);
                this.f8734.put(hashSet, genericParameterTypes);
            }
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        long[] jArr = this.f8739;
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
                HashMap map2 = this.f8740;
                if (map2 != null) {
                    Set setKeySet = map.keySet();
                    Constructor constructor = (Constructor) map2.get(setKeySet);
                    if (constructor != null) {
                        long[] jArr2 = (long[]) this.f8738.get(setKeySet);
                        Type[] typeArr = (Type[]) this.f8734.get(setKeySet);
                        Object[] objArr = new Object[jArr2.length];
                        while (i < jArr2.length) {
                            Object objM6505 = map.get(Long.valueOf(jArr2[i]));
                            Type type = typeArr[i];
                            if (objM6505 == null) {
                                objM6505 = AbstractC3700.m6505(type);
                            }
                            objArr[i] = objM6505;
                            i++;
                        }
                        try {
                            return constructor.newInstance(objArr);
                        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                            C8376.m13334("invoke constructor error, ", constructor, e);
                            return null;
                        }
                    }
                }
            }
        }
        Function function = this.f8741;
        Parameter[] parameterArr = this.f8736;
        if (function != null && parameterArr.length == 1) {
            Parameter parameter = parameterArr[0];
            Object objM6487 = map.get(Long.valueOf(jArr[0]));
            Class<?> type2 = parameter.getType();
            if (objM6487 == null) {
                objM6487 = AbstractC3700.m6505(type2);
            } else if (!type2.isInstance(objM6487)) {
                objM6487 = AbstractC3700.m6487(type2, objM6487);
            }
            return function.apply(objM6487);
        }
        BiFunction biFunction = this.f8742;
        if (biFunction != null && parameterArr.length == 2) {
            Object objM64872 = map.get(Long.valueOf(jArr[0]));
            Class<?> type3 = parameterArr[0].getType();
            if (objM64872 == null) {
                objM64872 = AbstractC3700.m6505(type3);
            } else if (!type3.isInstance(objM64872)) {
                objM64872 = AbstractC3700.m6487(type3, objM64872);
            }
            Object objM64873 = map.get(Long.valueOf(jArr[1]));
            Class<?> type4 = parameterArr[1].getType();
            if (objM64873 == null) {
                objM64873 = AbstractC3700.m6505(type4);
            } else if (!type4.isInstance(objM64873)) {
                objM64873 = AbstractC3700.m6487(type4, objM64873);
            }
            return biFunction.apply(objM64872, objM64873);
        }
        int length2 = parameterArr.length;
        Constructor constructor2 = this.f8743;
        Object[] objArr2 = new Object[constructor2.getParameterCount()];
        if (this.f8735) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                Parameter parameter2 = parameterArr[i3];
                Class<?> type5 = parameter2.getType();
                Type parameterizedType = parameter2.getParameterizedType();
                Object objM6485 = map.get(Long.valueOf(jArr[i3]));
                if (objM6485 != null) {
                    if (!type5.isInstance(objM6485)) {
                        objM6485 = AbstractC3700.m6487(type5, objM6485);
                    } else if (parameterizedType instanceof ParameterizedType) {
                        objM6485 = AbstractC3700.m6485(objM6485, parameterizedType);
                    }
                    objArr2[i3] = objM6485;
                } else {
                    i4 |= 1 << i3;
                    if (type5.isPrimitive()) {
                        objArr2[i3] = AbstractC3700.m6505(type5);
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
                Object objM64852 = map.get(Long.valueOf(jArr[i]));
                if (objM64852 == null) {
                    objM64852 = AbstractC3700.m6505(type6);
                } else if (!type6.isInstance(objM64852)) {
                    objM64852 = AbstractC3700.m6487(type6, objM64852);
                } else if (parameterizedType2 instanceof ParameterizedType) {
                    objM64852 = AbstractC3700.m6485(objM64852, parameterizedType2);
                }
                objArr2[i] = objM64852;
                i++;
            }
        }
        try {
            return constructor2.newInstance(objArr2);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e2) {
            C8376.m13334("invoke constructor error, ", constructor2, e2);
            return null;
        }
    }
}
