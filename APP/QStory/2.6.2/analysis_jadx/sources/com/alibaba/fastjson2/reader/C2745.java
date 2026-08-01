package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
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
import p007.AbstractC6136;
import p144.C7546;
import p278.C8362;
import p297.AbstractC8599;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2745 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final HashMap f8387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f8388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Parameter[] f8389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final HashMap f8390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final HashMap f8391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long[] f8392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final HashMap f8393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f8394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BiFunction f8395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Constructor f8396;

    public C2745(ArrayList arrayList, Constructor constructor, Function function, BiFunction biFunction, Constructor constructor2, String... strArr) {
        this.f8394 = function;
        this.f8395 = biFunction;
        boolean z = constructor2 != null;
        this.f8388 = z;
        this.f8396 = z ? constructor2 : constructor;
        Parameter[] parameters = constructor.getParameters();
        this.f8389 = parameters;
        this.f8392 = new long[parameters.length];
        int i = 0;
        while (true) {
            Parameter[] parameterArr = this.f8389;
            if (i >= parameterArr.length) {
                break;
            }
            String name = i < strArr.length ? strArr[i] : parameterArr[i].getName();
            if (name == null) {
                name = AbstractC6136.m11556(i, ParameterDescription.NAME_PREFIX);
            }
            this.f8392[i] = AbstractC2859.m5729(name);
            i++;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            this.f8393 = new HashMap(size, 1.0f);
            this.f8390 = new HashMap(size, 1.0f);
            this.f8387 = new HashMap(size, 1.0f);
            this.f8391 = new HashMap(size, 1.0f);
            for (int i2 = 0; i2 < size; i2++) {
                Constructor constructor3 = (Constructor) arrayList.get(i2);
                constructor3.setAccessible(true);
                String[] strArrM14198 = AbstractC8599.m14198(constructor3);
                Parameter[] parameters2 = constructor3.getParameters();
                C8362 c8362 = new C8362();
                C2801 c2801M6329 = AbstractC2932.m6329();
                for (int i3 = 0; i3 < parameters2.length && i3 < strArrM14198.length; i3++) {
                    c8362.m13848();
                    c2801M6329.m5578(c8362, constructor3.getDeclaringClass(), constructor3, i3, parameters2[i3]);
                    String str = c8362.f23050;
                    if (str != null) {
                        strArrM14198[i3] = str;
                    }
                }
                long[] jArr = new long[strArrM14198.length];
                Type[] genericParameterTypes = constructor3.getGenericParameterTypes();
                HashSet hashSet = new HashSet(strArrM14198.length);
                for (int i4 = 0; i4 < strArrM14198.length; i4++) {
                    long jM5729 = AbstractC2859.m5729(strArrM14198[i4]);
                    jArr[i4] = jM5729;
                    hashSet.add(Long.valueOf(jM5729));
                }
                this.f8393.put(hashSet, constructor3);
                this.f8390.put(hashSet, strArrM14198);
                this.f8391.put(hashSet, jArr);
                this.f8387.put(hashSet, genericParameterTypes);
            }
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        long[] jArr = this.f8392;
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
                HashMap map2 = this.f8393;
                if (map2 != null) {
                    Set setKeySet = map.keySet();
                    Constructor constructor = (Constructor) map2.get(setKeySet);
                    if (constructor != null) {
                        long[] jArr2 = (long[]) this.f8391.get(setKeySet);
                        Type[] typeArr = (Type[]) this.f8387.get(setKeySet);
                        Object[] objArr = new Object[jArr2.length];
                        while (i < jArr2.length) {
                            Object objM5900 = map.get(Long.valueOf(jArr2[i]));
                            Type type = typeArr[i];
                            if (objM5900 == null) {
                                objM5900 = AbstractC2866.m5900(type);
                            }
                            objArr[i] = objM5900;
                            i++;
                        }
                        try {
                            return constructor.newInstance(objArr);
                        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                            C7546.m12746("invoke constructor error, ", constructor, e);
                            return null;
                        }
                    }
                }
            }
        }
        Function function = this.f8394;
        Parameter[] parameterArr = this.f8389;
        if (function != null && parameterArr.length == 1) {
            Parameter parameter = parameterArr[0];
            Object objM5882 = map.get(Long.valueOf(jArr[0]));
            Class<?> type2 = parameter.getType();
            if (objM5882 == null) {
                objM5882 = AbstractC2866.m5900(type2);
            } else if (!type2.isInstance(objM5882)) {
                objM5882 = AbstractC2866.m5882(type2, objM5882);
            }
            return function.apply(objM5882);
        }
        BiFunction biFunction = this.f8395;
        if (biFunction != null && parameterArr.length == 2) {
            Object objM58822 = map.get(Long.valueOf(jArr[0]));
            Class<?> type3 = parameterArr[0].getType();
            if (objM58822 == null) {
                objM58822 = AbstractC2866.m5900(type3);
            } else if (!type3.isInstance(objM58822)) {
                objM58822 = AbstractC2866.m5882(type3, objM58822);
            }
            Object objM58823 = map.get(Long.valueOf(jArr[1]));
            Class<?> type4 = parameterArr[1].getType();
            if (objM58823 == null) {
                objM58823 = AbstractC2866.m5900(type4);
            } else if (!type4.isInstance(objM58823)) {
                objM58823 = AbstractC2866.m5882(type4, objM58823);
            }
            return biFunction.apply(objM58822, objM58823);
        }
        int length2 = parameterArr.length;
        Constructor constructor2 = this.f8396;
        Object[] objArr2 = new Object[constructor2.getParameterCount()];
        if (this.f8388) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                Parameter parameter2 = parameterArr[i3];
                Class<?> type5 = parameter2.getType();
                Type parameterizedType = parameter2.getParameterizedType();
                Object objM5880 = map.get(Long.valueOf(jArr[i3]));
                if (objM5880 != null) {
                    if (!type5.isInstance(objM5880)) {
                        objM5880 = AbstractC2866.m5882(type5, objM5880);
                    } else if (parameterizedType instanceof ParameterizedType) {
                        objM5880 = AbstractC2866.m5880(objM5880, parameterizedType);
                    }
                    objArr2[i3] = objM5880;
                } else {
                    i4 |= 1 << i3;
                    if (type5.isPrimitive()) {
                        objArr2[i3] = AbstractC2866.m5900(type5);
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
                Object objM58802 = map.get(Long.valueOf(jArr[i]));
                if (objM58802 == null) {
                    objM58802 = AbstractC2866.m5900(type6);
                } else if (!type6.isInstance(objM58802)) {
                    objM58802 = AbstractC2866.m5882(type6, objM58802);
                } else if (parameterizedType2 instanceof ParameterizedType) {
                    objM58802 = AbstractC2866.m5880(objM58802, parameterizedType2);
                }
                objArr2[i] = objM58802;
                i++;
            }
        }
        try {
            return constructor2.newInstance(objArr2);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e2) {
            C7546.m12746("invoke constructor error, ", constructor2, e2);
            return null;
        }
    }
}
