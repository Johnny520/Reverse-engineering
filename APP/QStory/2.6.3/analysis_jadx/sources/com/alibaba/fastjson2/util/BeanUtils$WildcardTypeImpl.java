package com.alibaba.fastjson2.util;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class BeanUtils$WildcardTypeImpl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type lowerBound;
    private final Type upperBound;

    public BeanUtils$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        AbstractC2865.m5808(typeArr2.length <= 1);
        AbstractC2865.m5808(typeArr.length == 1);
        if (typeArr2.length != 1) {
            AbstractC2865.m5807(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = AbstractC2865.m5809(typeArr[0]);
        } else {
            AbstractC2865.m5807(typeArr2[0]);
            AbstractC2865.m5808(typeArr[0] == Object.class);
            this.lowerBound = AbstractC2865.m5809(typeArr2[0]);
            this.upperBound = Object.class;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC2865.m5829(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : AbstractC2865.f9017;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        return new Type[]{this.upperBound};
    }

    public int hashCode() {
        Type type = this.lowerBound;
        return (this.upperBound.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public String toString() {
        if (this.lowerBound != null) {
            return "? super " + AbstractC2865.m5783(this.lowerBound);
        }
        if (this.upperBound == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC2865.m5783(this.upperBound);
    }
}
