package p230r2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p154e2.C2029h;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p224q2.AbstractC2917h;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3128d implements InterfaceC2771C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9862d;

    /* JADX INFO: renamed from: e */
    public final C2029h f9863e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3128d(C2029h c2029h, int i5) {
        this.f9862d = i5;
        this.f9863e = c2029h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Class cls;
        Type[] actualTypeArguments;
        int i5 = this.f9862d;
        C2029h c2029h = this.f9863e;
        cls = Object.class;
        switch (i5) {
            case 0:
                Type type = c3352a.f10418b;
                Class cls2 = c3352a.f10417a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC2917h.m5110b(Collection.class.isAssignableFrom(cls2));
                Type typeM5118j = AbstractC2917h.m5118j(type, cls2, AbstractC2917h.m5115g(type, cls2, Collection.class), new HashMap());
                cls = typeM5118j instanceof ParameterizedType ? ((ParameterizedType) typeM5118j).getActualTypeArguments()[0] : Object.class;
                return new C3126c(new C3138n(c2785n, c2785n.m4973b(new C3352a(cls)), cls), c2029h.m3725c(c3352a, false));
            default:
                Type type2 = c3352a.f10418b;
                Class cls3 = c3352a.f10417a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC2917h.m5110b(Map.class.isAssignableFrom(cls3));
                    Type typeM5118j2 = AbstractC2917h.m5118j(type2, cls3, AbstractC2917h.m5115g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM5118j2 instanceof ParameterizedType ? ((ParameterizedType) typeM5118j2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C3138n(this, new C3138n(c2785n, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC3127c0.f9838c : c2785n.m4973b(new C3352a(type3)), type3), new C3138n(c2785n, c2785n.m4973b(new C3352a(type4)), type4), c2029h.m3725c(c3352a, false));
        }
    }
}
