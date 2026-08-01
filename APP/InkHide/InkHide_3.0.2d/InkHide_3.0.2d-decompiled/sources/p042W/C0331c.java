package p042W;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p024M.C0191e;
import p037T.AbstractC0274y;
import p037T.C0259j;
import p037T.C0261l;
import p037T.InterfaceC0275z;
import p039U.InterfaceC0289a;
import p041V.AbstractC0311d;
import p041V.InterfaceC0323p;
import p049a0.C0367a;

/* JADX INFO: renamed from: W.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0331c implements InterfaceC0275z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f737a;

    /* JADX INFO: renamed from: b */
    public final C0191e f738b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0331c(C0191e c0191e, int i2) {
        this.f737a = i2;
        this.f738b = c0191e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static AbstractC0274y m561b(C0191e c0191e, C0261l c0261l, C0367a c0367a, InterfaceC0289a interfaceC0289a) {
        AbstractC0274y abstractC0274yMo493a;
        Object objMo143n = c0191e.m401b(new C0367a(interfaceC0289a.value())).mo143n();
        boolean zNullSafe = interfaceC0289a.nullSafe();
        if (objMo143n instanceof AbstractC0274y) {
            abstractC0274yMo493a = (AbstractC0274y) objMo143n;
        } else {
            if (!(objMo143n instanceof InterfaceC0275z)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo143n.getClass().getName() + " as a @JsonAdapter for " + AbstractC0311d.m548j(c0367a.f861b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            abstractC0274yMo493a = ((InterfaceC0275z) objMo143n).mo493a(c0261l, c0367a);
        }
        return (abstractC0274yMo493a == null || !zNullSafe) ? abstractC0274yMo493a : new C0259j(abstractC0274yMo493a, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        C0191e c0191e = this.f738b;
        switch (this.f737a) {
            case 0:
                Class cls2 = c0367a.f860a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c0367a.f861b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC0311d.m540b(Collection.class.isAssignableFrom(cls2));
                Type typeM547i = AbstractC0311d.m547i(type, cls2, AbstractC0311d.m544f(type, cls2, Collection.class), new HashMap());
                cls = typeM547i instanceof ParameterizedType ? ((ParameterizedType) typeM547i).getActualTypeArguments()[0] : Object.class;
                return new C0330b(c0261l, cls, c0261l.m481d(new C0367a(cls)), c0191e.m401b(c0367a));
            case 1:
                InterfaceC0289a interfaceC0289a = (InterfaceC0289a) c0367a.f860a.getAnnotation(InterfaceC0289a.class);
                if (interfaceC0289a == null) {
                    return null;
                }
                return m561b(c0191e, c0261l, c0367a, interfaceC0289a);
            default:
                Class cls3 = c0367a.f860a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c0367a.f861b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC0311d.m540b(Map.class.isAssignableFrom(cls3));
                    Type typeM547i2 = AbstractC0311d.m547i(type2, cls3, AbstractC0311d.m544f(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM547i2 instanceof ParameterizedType ? ((ParameterizedType) typeM547i2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                AbstractC0274y abstractC0274yM481d = (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0352x.f802c : c0261l.m481d(new C0367a(type3));
                AbstractC0274y abstractC0274yM481d2 = c0261l.m481d(new C0367a(actualTypeArguments[1]));
                InterfaceC0323p interfaceC0323pM401b = c0191e.m401b(c0367a);
                Type[] typeArr = actualTypeArguments;
                return new C0339k(this, c0261l, typeArr[0], abstractC0274yM481d, typeArr[1], abstractC0274yM481d2, interfaceC0323pM401b);
        }
    }
}
