package retrofit2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5754 implements GenericArrayType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f15755;

    public C5754(Type type) {
        this.f15755 = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC5785.m11176(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f15755;
    }

    public final int hashCode() {
        return this.f15755.hashCode();
    }

    public final String toString() {
        return AbstractC5785.m11180(this.f15755) + "[]";
    }
}
