package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$WildcardTypeImpl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type lowerBound;
    private final Type upperBound;

    public GsonTypes$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        AbstractC4053.m7871(typeArr2.length <= 1);
        AbstractC4053.m7871(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC4053.m7870(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = AbstractC4053.m7872(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC4053.m7870(typeArr2[0]);
        AbstractC4053.m7871(typeArr[0] == Object.class);
        this.lowerBound = AbstractC4053.m7872(typeArr2[0]);
        this.upperBound = Object.class;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC4053.m7868(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : AbstractC4053.f11216;
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
            return "? super " + AbstractC4053.m7875(this.lowerBound);
        }
        if (this.upperBound == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC4053.m7875(this.upperBound);
    }
}
