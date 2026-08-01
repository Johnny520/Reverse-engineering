package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import io.ktor.util.C5043;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5259 extends AbstractC5269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f13389 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WildcardType f13390;

    public C5259(WildcardType wildcardType) {
        this.f13390 = wildcardType;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        return this.f13389;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5269 m9529() {
        WildcardType wildcardType = this.f13390;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C5043.m9155(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objM9408 = AbstractC5179.m9408(lowerBounds);
            objM9408.getClass();
            Type type = (Type) objM9408;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C5271(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C5283(type) : type instanceof WildcardType ? new C5259((WildcardType) type) : new C5282(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) AbstractC5179.m9408(upperBounds);
            if (!AbstractC5227.m9466(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new C5271(cls2);
                    }
                }
                return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C5283(type2) : type2 instanceof WildcardType ? new C5259((WildcardType) type2) : new C5282(type2);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type mo9530() {
        return this.f13390;
    }
}
