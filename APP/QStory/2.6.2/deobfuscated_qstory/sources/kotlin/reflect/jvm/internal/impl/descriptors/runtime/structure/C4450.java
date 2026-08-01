package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.C5553;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4450 extends AbstractC4436 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final EmptyList f13076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4436 f13077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f13078;

    /* JADX WARN: Multi-variable type inference failed */
    public C4450(Type type) {
        AbstractC4436 c4438;
        AbstractC4436 c44382;
        this.f13078 = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    c4438 = componentType.isPrimitive() ? new C4438(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C4450(componentType) : componentType instanceof WildcardType ? new C4426((WildcardType) componentType) : new C4449(componentType);
                }
            }
            C5553.m10814("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                c44382 = new C4438(cls2);
                this.f13077 = c44382;
                this.f13076 = EmptyList.INSTANCE;
            }
        }
        c4438 = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C4450(genericComponentType) : genericComponentType instanceof WildcardType ? new C4426((WildcardType) genericComponentType) : new C4449(genericComponentType);
        c44382 = c4438;
        this.f13077 = c44382;
        this.f13076 = EmptyList.INSTANCE;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        return this.f13076;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo8981() {
        return this.f13078;
    }
}
