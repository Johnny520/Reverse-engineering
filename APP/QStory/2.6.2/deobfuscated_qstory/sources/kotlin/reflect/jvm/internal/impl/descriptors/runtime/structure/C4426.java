package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import io.ktor.util.C4210;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4426 extends AbstractC4436 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f13040 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WildcardType f13041;

    public C4426(WildcardType wildcardType) {
        this.f13041 = wildcardType;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        return this.f13040;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4436 m8980() {
        WildcardType wildcardType = this.f13041;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C4210.m8606(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objM8853 = AbstractC4346.m8853(lowerBounds);
            objM8853.getClass();
            Type type = (Type) objM8853;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C4438(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C4450(type) : type instanceof WildcardType ? new C4426((WildcardType) type) : new C4449(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) AbstractC4346.m8853(upperBounds);
            if (!AbstractC4394.m8917(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new C4438(cls2);
                    }
                }
                return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C4450(type2) : type2 instanceof WildcardType ? new C4426((WildcardType) type2) : new C4449(type2);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type mo8981() {
        return this.f13041;
    }
}
