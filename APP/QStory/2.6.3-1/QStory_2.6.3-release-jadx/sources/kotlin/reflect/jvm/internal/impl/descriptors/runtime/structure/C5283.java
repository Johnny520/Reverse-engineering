package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5283 extends AbstractC5269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final EmptyList f13425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5269 f13426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f13427;

    /* JADX WARN: Multi-variable type inference failed */
    public C5283(Type type) {
        AbstractC5269 c5271;
        AbstractC5269 c52712;
        this.f13427 = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    c5271 = componentType.isPrimitive() ? new C5271(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C5283(componentType) : componentType instanceof WildcardType ? new C5259((WildcardType) componentType) : new C5282(componentType);
                }
            }
            C6385.m11430("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                c52712 = new C5271(cls2);
                this.f13426 = c52712;
                this.f13425 = EmptyList.INSTANCE;
            }
        }
        c5271 = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C5283(genericComponentType) : genericComponentType instanceof WildcardType ? new C5259((WildcardType) genericComponentType) : new C5282(genericComponentType);
        c52712 = c5271;
        this.f13426 = c52712;
        this.f13425 = EmptyList.INSTANCE;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        return this.f13425;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo9530() {
        return this.f13427;
    }
}
