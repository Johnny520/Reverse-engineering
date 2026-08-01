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
        AbstractC3221.m7312(typeArr2.length <= 1);
        AbstractC3221.m7312(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC3221.m7311(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = AbstractC3221.m7313(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC3221.m7311(typeArr2[0]);
        AbstractC3221.m7312(typeArr[0] == Object.class);
        this.lowerBound = AbstractC3221.m7313(typeArr2[0]);
        this.upperBound = Object.class;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC3221.m7309(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : AbstractC3221.f10871;
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
            return "? super " + AbstractC3221.m7316(this.lowerBound);
        }
        if (this.upperBound == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC3221.m7316(this.upperBound);
    }
}
