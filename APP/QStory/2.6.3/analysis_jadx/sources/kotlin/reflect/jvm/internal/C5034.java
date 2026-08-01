package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5034 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14517;

    public /* synthetic */ C5034(Object obj, int i, int i2) {
        this.f14517 = i2;
        this.f14516 = obj;
        this.f14515 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14517;
        int i2 = this.f14515;
        Object obj = this.f14516;
        switch (i) {
            case 0:
                AbstractC4926 abstractC4926 = (AbstractC4926) ((InterfaceC6543) obj).invoke();
                InterfaceC5184 interfaceC5184M10215 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(abstractC4926, 2));
                C5074 c5074 = abstractC4926.f14263;
                Type type = c5074 != null ? (Type) c5074.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i2 != 0) {
                        C4211.m8595(abstractC4926, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    C4211.m8595(abstractC4926, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) interfaceC5184M10215.getValue()).get(i2);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = (Type) AbstractC4347.m8828(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) AbstractC4347.m8825(upperBounds);
                }
                Type type4 = type3;
                type4.getClass();
                return type4;
            case 1:
                return (InterfaceC4474) ((List) obj).get(i2);
            default:
                Object obj2 = ((InterfaceC4480) obj).mo9035().get(i2);
                obj2.getClass();
                return (InterfaceC4474) obj2;
        }
    }
}
