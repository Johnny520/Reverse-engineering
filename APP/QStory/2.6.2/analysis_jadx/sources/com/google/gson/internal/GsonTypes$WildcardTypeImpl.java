package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$WildcardTypeImpl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type lowerBound;
    private final Type upperBound;

    public GsonTypes$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        AbstractC3220.m7325(typeArr2.length <= 1);
        AbstractC3220.m7325(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC3220.m7324(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = AbstractC3220.m7326(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC3220.m7324(typeArr2[0]);
        AbstractC3220.m7325(typeArr[0] == Object.class);
        this.lowerBound = AbstractC3220.m7326(typeArr2[0]);
        this.upperBound = Object.class;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC3220.m7322(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : AbstractC3220.f10866;
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
            return "? super " + AbstractC3220.m7329(this.lowerBound);
        }
        if (this.upperBound == Object.class) {
            return TypeDescription.Generic.OfWildcardType.SYMBOL;
        }
        return "? extends " + AbstractC3220.m7329(this.upperBound);
    }
}
