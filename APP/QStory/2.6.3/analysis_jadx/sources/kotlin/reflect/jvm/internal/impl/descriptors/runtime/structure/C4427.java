package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import io.ktor.util.C4211;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4427 extends AbstractC4437 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f13044 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WildcardType f13045;

    public C4427(WildcardType wildcardType) {
        this.f13045 = wildcardType;
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        return this.f13044;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4437 m8970() {
        WildcardType wildcardType = this.f13045;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C4211.m8596(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objM8849 = AbstractC4347.m8849(lowerBounds);
            objM8849.getClass();
            Type type = (Type) objM8849;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C4439(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C4451(type) : type instanceof WildcardType ? new C4427((WildcardType) type) : new C4450(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) AbstractC4347.m8849(upperBounds);
            if (!AbstractC4395.m8907(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new C4439(cls2);
                    }
                }
                return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C4451(type2) : type2 instanceof WildcardType ? new C4427((WildcardType) type2) : new C4450(type2);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4437
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type mo8971() {
        return this.f13045;
    }
}
