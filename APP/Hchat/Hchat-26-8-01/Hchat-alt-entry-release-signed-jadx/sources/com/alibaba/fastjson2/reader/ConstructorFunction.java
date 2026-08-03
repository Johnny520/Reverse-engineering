package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorFunction<T> implements Function<Map<Long, Object>, T> {
    Map<Set<Long>, Type[]> alternateConstructorArgTypes;
    Map<Set<Long>, Constructor> alternateConstructorMap;
    Map<Set<Long>, long[]> alternateConstructorNameHashCodes;
    Map<Set<Long>, String[]> alternateConstructorNames;
    final BiFunction biFunction;
    final Constructor constructor;
    final Function function;
    final long[] hashCodes;
    final boolean kotlinMaker;
    final int parameterCount;
    final Class[] parameterTypes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstructorFunction(List<Constructor> list, Constructor constructor, Function function, BiFunction biFunction, Constructor constructor2, String... strArr) {
        boolean z9 = constructor2 != null;
        this.kotlinMaker = z9;
        this.function = function;
        this.biFunction = biFunction;
        constructor2 = z9 ? constructor2 : constructor;
        this.constructor = constructor2;
        this.parameterCount = constructor2.getParameterCount();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        this.parameterTypes = parameterTypes;
        this.hashCodes = new long[parameterTypes.length];
        int i9 = 0;
        while (i9 < this.parameterTypes.length) {
            String strM2249l = i9 < strArr.length ? strArr[i9] : null;
            if (strM2249l == null) {
                strM2249l = AbstractC0921a.m2249l(i9, "arg");
            }
            this.hashCodes[i9] = Fnv.hashCode64(strM2249l);
            i9++;
        }
        if (list != null) {
            this.alternateConstructorMap = new HashMap(list.size());
            this.alternateConstructorNames = new HashMap(list.size());
            this.alternateConstructorArgTypes = new HashMap(list.size());
            this.alternateConstructorNameHashCodes = new HashMap(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                Constructor constructor3 = list.get(i10);
                constructor3.setAccessible(true);
                String[] strArrLookupParameterNames = BeanUtils.lookupParameterNames(constructor3);
                Class<?>[] parameterTypes2 = constructor3.getParameterTypes();
                FieldInfo fieldInfo = new FieldInfo();
                ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
                Annotation[][] parameterAnnotations = constructor3.getParameterAnnotations();
                for (int i11 = 0; i10 < parameterTypes2.length && i11 < strArrLookupParameterNames.length; i11++) {
                    fieldInfo.init();
                    objectReaderProvider.getFieldInfo(fieldInfo, constructor3.getDeclaringClass(), constructor3, i11, parameterAnnotations);
                    String str = fieldInfo.fieldName;
                    if (str != null) {
                        strArrLookupParameterNames[i11] = str;
                    }
                }
                long[] jArr = new long[strArrLookupParameterNames.length];
                Type[] genericParameterTypes = constructor3.getGenericParameterTypes();
                HashSet hashSet = new HashSet(strArrLookupParameterNames.length);
                for (int i12 = 0; i12 < strArrLookupParameterNames.length; i12++) {
                    String str2 = strArrLookupParameterNames[i12];
                    long jHashCode64 = str2 == null ? 0L : Fnv.hashCode64(str2);
                    jArr[i12] = jHashCode64;
                    hashSet.add(Long.valueOf(jHashCode64));
                }
                this.alternateConstructorMap.put(hashSet, constructor3);
                this.alternateConstructorNames.put(hashSet, strArrLookupParameterNames);
                this.alternateConstructorNameHashCodes.put(hashSet, jArr);
                this.alternateConstructorArgTypes.put(hashSet, genericParameterTypes);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.util.function.Function */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.util.function.BiFunction */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public T apply(Map<Long, Object> map) {
        Set<Long> setKeySet;
        Constructor constructor;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            long[] jArr = this.hashCodes;
            if (i10 >= jArr.length) {
                break;
            }
            if (map.containsKey(Long.valueOf(jArr[i10]))) {
                i10++;
            } else if (this.alternateConstructorMap != null && (constructor = this.alternateConstructorMap.get((setKeySet = map.keySet()))) != null) {
                long[] jArr2 = this.alternateConstructorNameHashCodes.get(setKeySet);
                Type[] typeArr = this.alternateConstructorArgTypes.get(setKeySet);
                Object[] objArr = new Object[jArr2.length];
                while (i9 < jArr2.length) {
                    Object defaultValue = map.get(Long.valueOf(jArr2[i9]));
                    Type type = typeArr[i9];
                    if (defaultValue == null) {
                        defaultValue = TypeUtils.getDefaultValue(type);
                    }
                    objArr[i9] = defaultValue;
                    i9++;
                }
                try {
                    return (T) constructor.newInstance(objArr);
                } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e6) {
                    throw new JSONException("invoke constructor error, " + constructor, e6);
                }
            }
        }
        if (this.function != null && this.parameterTypes.length == 1) {
            Object objCast = map.get(Long.valueOf(this.hashCodes[0]));
            Class cls = this.parameterTypes[0];
            if (objCast == null) {
                objCast = TypeUtils.getDefaultValue(cls);
            } else if (!cls.isInstance(objCast)) {
                objCast = TypeUtils.cast(objCast, (Class<Object>) cls, JSONFactory.defaultObjectReaderProvider);
            }
            return (T) this.function.apply(objCast);
        }
        if (this.biFunction != null && this.parameterTypes.length == 2) {
            Object objCast2 = map.get(Long.valueOf(this.hashCodes[0]));
            Class cls2 = this.parameterTypes[0];
            if (objCast2 == null) {
                objCast2 = TypeUtils.getDefaultValue(cls2);
            } else if (!cls2.isInstance(objCast2)) {
                objCast2 = TypeUtils.cast(objCast2, (Class<Object>) cls2, JSONFactory.defaultObjectReaderProvider);
            }
            Object objCast3 = map.get(Long.valueOf(this.hashCodes[1]));
            Class cls3 = this.parameterTypes[1];
            if (objCast3 == null) {
                objCast3 = TypeUtils.getDefaultValue(cls3);
            } else if (!cls3.isInstance(objCast3)) {
                objCast3 = TypeUtils.cast(objCast3, (Class<Object>) cls3, JSONFactory.defaultObjectReaderProvider);
            }
            return (T) this.biFunction.apply(objCast2, objCast3);
        }
        int length = this.parameterTypes.length;
        Object[] objArr2 = new Object[this.parameterCount];
        if (this.kotlinMaker) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                Object obj = map.get(Long.valueOf(this.hashCodes[i11]));
                if (obj != null) {
                    objArr2[i11] = obj;
                } else {
                    i12 |= 1 << i11;
                    Class cls4 = this.parameterTypes[i11];
                    if (cls4.isPrimitive()) {
                        objArr2[i11] = TypeUtils.getDefaultValue(cls4);
                    }
                }
                int i13 = i11 + 1;
                if (i13 % 32 == 0 || i13 == length) {
                    objArr2[(i11 / 32) + length] = Integer.valueOf(i12);
                    i12 = 0;
                }
                i11 = i13;
            }
        } else {
            while (i9 < length) {
                Class cls5 = this.parameterTypes[i9];
                Object objCast4 = map.get(Long.valueOf(this.hashCodes[i9]));
                if (objCast4 == null) {
                    objCast4 = TypeUtils.getDefaultValue(cls5);
                } else if (!cls5.isInstance(objCast4)) {
                    objCast4 = TypeUtils.cast(objCast4, (Class<Object>) cls5, JSONFactory.defaultObjectReaderProvider);
                } else if (Collection.class.isAssignableFrom(cls5) || Map.class.isAssignableFrom(cls5)) {
                    Type[] genericParameterTypes = this.constructor.getGenericParameterTypes();
                    if (genericParameterTypes.length == this.parameterTypes.length) {
                        objCast4 = TypeUtils.cast(objCast4, genericParameterTypes[i9]);
                    }
                }
                objArr2[i9] = objCast4;
                i9++;
            }
        }
        try {
            return (T) this.constructor.newInstance(objArr2);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e7) {
            C0086a.m456o("invoke constructor error, ", this.constructor, e7);
            return null;
        }
    }
}
