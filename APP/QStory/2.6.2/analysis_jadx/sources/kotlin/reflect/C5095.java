package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5095 implements GenericArrayType, Type {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type f14643;

    public C5095(Type type) {
        type.getClass();
        this.f14643 = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC4394.m8917(this.f14643, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f14643;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC5089.m10100(this.f14643) + "[]";
    }

    public final int hashCode() {
        return this.f14643.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
