package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeReference<T> {
    protected final Class<? super T> rawType;
    protected final Type type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypeReference(Type... typeArr) {
        if (typeArr == null || typeArr.length == 0) {
            throw null;
        }
        if (typeArr.length == 1 && typeArr[0] == null) {
            typeArr = new Type[]{Object.class};
        }
        Class<?> cls = getClass();
        Type typeCanonicalize = canonicalize(cls, (ParameterizedType) ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0], typeArr, 0);
        this.type = typeCanonicalize;
        this.rawType = (Class<? super T>) BeanUtils.getRawType(typeCanonicalize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type arrayType(Class<?> cls) {
        return new BeanUtils.GenericArrayTypeImpl(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Type canonicalize(Class<?> cls, ParameterizedType parameterizedType, Type[] typeArr, int i9) {
        char c10;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            if ((actualTypeArguments[i10] instanceof TypeVariable) && i9 < typeArr.length) {
                actualTypeArguments[i10] = typeArr[i9];
                i9++;
            }
            Type genericComponentType = actualTypeArguments[i10];
            if (genericComponentType instanceof GenericArrayType) {
                int i11 = 0;
                while (genericComponentType instanceof GenericArrayType) {
                    i11++;
                    genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
                }
                if (genericComponentType instanceof Class) {
                    Class cls2 = (Class) genericComponentType;
                    if (cls2.isPrimitive()) {
                        if (cls2 == Integer.TYPE) {
                            c10 = 'I';
                        } else if (cls2 == Long.TYPE) {
                            c10 = 'J';
                        } else if (cls2 == Float.TYPE) {
                            c10 = 'F';
                        } else if (cls2 == Double.TYPE) {
                            c10 = 'D';
                        } else if (cls2 == Boolean.TYPE) {
                            c10 = 'Z';
                        } else if (cls2 == Character.TYPE) {
                            c10 = 'C';
                        } else if (cls2 == Byte.TYPE) {
                            c10 = 'B';
                        } else if (cls2 == Short.TYPE) {
                            c10 = 'S';
                        }
                        char[] cArr = new char[i11 + 1];
                        for (int i12 = 0; i12 < i11; i12++) {
                            cArr[i12] = '[';
                        }
                        cArr[i11] = c10;
                        actualTypeArguments[i10] = TypeUtils.loadClass(new String(cArr));
                    }
                }
            }
            Type type = actualTypeArguments[i10];
            if (type instanceof ParameterizedType) {
                actualTypeArguments[i10] = canonicalize(cls, (ParameterizedType) type, typeArr, i9);
            }
        }
        return new ParameterizedTypeImpl(actualTypeArguments, cls, rawType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type collectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return new ParameterizedTypeImpl(cls, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TypeReference<?> get(Type type) {
        return new TypeReference<Object>(type, true) { // from class: com.alibaba.fastjson2.TypeReference.1
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type mapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        return new ParameterizedTypeImpl(cls, cls2, cls3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static Type m1689of(Type... typeArr) {
        return new MultiType(typeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type parametricType(Class<?> cls, Class<?>... clsArr) {
        return new ParameterizedTypeImpl(cls, clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Type getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<T> parseArray(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, this.type, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T parseObject(String str) {
        return (T) JSON.parseObject(str, this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: to */
    public T m1690to(JSONArray jSONArray) {
        return (T) jSONArray.m1638to(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public T toJavaObject(JSONArray jSONArray) {
        return (T) jSONArray.m1638to(this.type);
    }

    public static Type parametricType(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(cls, typeArr);
    }

    public List<T> parseArray(byte[] bArr, JSONReader.Feature... featureArr) {
        return JSON.parseArray(bArr, this.type, featureArr);
    }

    public T parseObject(byte[] bArr) {
        return (T) JSON.parseObject(bArr, this.type);
    }

    /* JADX INFO: renamed from: to */
    public T m1691to(JSONObject jSONObject, JSONReader.Feature... featureArr) {
        return (T) jSONObject.m1655to(this.type, featureArr);
    }

    @Deprecated
    public T toJavaObject(JSONObject jSONObject, JSONReader.Feature... featureArr) {
        return (T) jSONObject.m1655to(this.type, featureArr);
    }

    public TypeReference() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.type = type;
        this.rawType = (Class<? super T>) BeanUtils.getRawType(type);
    }

    private TypeReference(Type type, boolean z9) {
        type.getClass();
        this.type = BeanUtils.canonicalize(type);
        this.rawType = (Class<? super T>) BeanUtils.getRawType(type);
    }
}
