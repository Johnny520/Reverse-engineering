package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4451 extends AbstractC4437 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final EmptyList f13080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4437 f13081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f13082;

    /* JADX WARN: Multi-variable type inference failed */
    public C4451(Type type) {
        AbstractC4437 c4439;
        AbstractC4437 c44392;
        this.f13082 = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    c4439 = componentType.isPrimitive() ? new C4439(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C4451(componentType) : componentType instanceof WildcardType ? new C4427((WildcardType) componentType) : new C4450(componentType);
                }
            }
            C5554.m10871("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                c44392 = new C4439(cls2);
                this.f13081 = c44392;
                this.f13080 = EmptyList.INSTANCE;
            }
        }
        c4439 = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C4451(genericComponentType) : genericComponentType instanceof WildcardType ? new C4427((WildcardType) genericComponentType) : new C4450(genericComponentType);
        c44392 = c4439;
        this.f13081 = c44392;
        this.f13080 = EmptyList.INSTANCE;
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        return this.f13080;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4437
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Type mo8971() {
        return this.f13082;
    }
}
