package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@JSONType(deserializeFeatures = {JSONReader.Feature.SupportAutoType}, typeName = "java.lang.reflect.ParameterizedType")
public final class ParameterizedTypeImpl implements ParameterizedType {
    private final Type[] actualTypeArguments;
    private final Type ownerType;
    private final Type rawType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParameterizedTypeImpl(Type type, Type... typeArr) {
        this.rawType = type;
        this.actualTypeArguments = typeArr;
        this.ownerType = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ParameterizedTypeImpl.class == obj.getClass()) {
            ParameterizedTypeImpl parameterizedTypeImpl = (ParameterizedTypeImpl) obj;
            if (!Arrays.equals(this.actualTypeArguments, parameterizedTypeImpl.actualTypeArguments)) {
                return false;
            }
            Type type = this.ownerType;
            Type type2 = parameterizedTypeImpl.ownerType;
            if (type == null ? type2 != null : !type.equals(type2)) {
                return false;
            }
            Type type3 = this.rawType;
            Type type4 = parameterizedTypeImpl.rawType;
            if (type3 != null) {
                return type3.equals(type4);
            }
            if (type4 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.actualTypeArguments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        Type[] typeArr = this.actualTypeArguments;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.ownerType;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.rawType;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }

    @JSONCreator(parameterNames = {"actualTypeArguments", "ownerType", "rawType"})
    public ParameterizedTypeImpl(Type[] typeArr, Type type, Type type2) {
        this.actualTypeArguments = typeArr;
        this.ownerType = type;
        this.rawType = type2;
    }
}
