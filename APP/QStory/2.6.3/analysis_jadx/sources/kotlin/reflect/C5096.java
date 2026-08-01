package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5096 implements GenericArrayType, Type {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f14643;

    public C5096(Type type) {
        type.getClass();
        this.f14643 = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC4395.m8907(this.f14643, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f14643;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC5090.m10104(this.f14643) + "[]";
    }

    public final int hashCode() {
        return this.f14643.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
