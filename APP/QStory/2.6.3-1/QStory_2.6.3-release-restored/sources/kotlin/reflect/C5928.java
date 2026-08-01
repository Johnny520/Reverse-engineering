package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5928 implements GenericArrayType, Type {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f14988;

    public C5928(Type type) {
        type.getClass();
        this.f14988 = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC5227.m9466(this.f14988, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f14988;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC5922.m10663(this.f14988) + "[]";
    }

    public final int hashCode() {
        return this.f14988.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
