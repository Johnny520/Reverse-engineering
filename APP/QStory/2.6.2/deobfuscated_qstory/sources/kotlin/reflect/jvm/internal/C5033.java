package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14515;

    public /* synthetic */ C5033(Object obj, int i, int i2) {
        this.f14515 = i2;
        this.f14514 = obj;
        this.f14513 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14515;
        int i2 = this.f14513;
        Object obj = this.f14514;
        switch (i) {
            case 0:
                AbstractC4925 abstractC4925 = (AbstractC4925) ((InterfaceC6542) obj).invoke();
                InterfaceC5183 interfaceC5183M10211 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(abstractC4925, 2));
                C5073 c5073 = abstractC4925.f14261;
                Type type = c5073 != null ? (Type) c5073.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i2 != 0) {
                        C4210.m8605(abstractC4925, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    C4210.m8605(abstractC4925, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) interfaceC5183M10211.getValue()).get(i2);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = (Type) AbstractC4346.m8848(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) AbstractC4346.m8849(upperBounds);
                }
                Type type4 = type3;
                type4.getClass();
                return type4;
            case 1:
                return (InterfaceC4473) ((List) obj).get(i2);
            default:
                Object obj2 = ((InterfaceC4479) obj).mo9045().get(i2);
                obj2.getClass();
                return (InterfaceC4473) obj2;
        }
    }
}
