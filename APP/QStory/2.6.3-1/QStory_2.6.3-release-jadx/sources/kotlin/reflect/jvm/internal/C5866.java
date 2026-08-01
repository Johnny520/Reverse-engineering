package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5306;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5866 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14862;

    public /* synthetic */ C5866(Object obj, int i, int i2) {
        this.f14862 = i2;
        this.f14861 = obj;
        this.f14860 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14862;
        int i2 = this.f14860;
        Object obj = this.f14861;
        switch (i) {
            case 0:
                AbstractC5758 abstractC5758 = (AbstractC5758) ((InterfaceC7372) obj).invoke();
                InterfaceC6016 interfaceC6016M10774 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(abstractC5758, 2));
                C5906 c5906 = abstractC5758.f14608;
                Type type = c5906 != null ? (Type) c5906.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i2 != 0) {
                        C5043.m9154(abstractC5758, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    C5043.m9154(abstractC5758, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) interfaceC6016M10774.getValue()).get(i2);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = (Type) AbstractC5179.m9387(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) AbstractC5179.m9384(upperBounds);
                }
                Type type4 = type3;
                type4.getClass();
                return type4;
            case 1:
                return (InterfaceC5306) ((List) obj).get(i2);
            default:
                Object obj2 = ((InterfaceC5312) obj).mo9594().get(i2);
                obj2.getClass();
                return (InterfaceC5306) obj2;
        }
    }
}
