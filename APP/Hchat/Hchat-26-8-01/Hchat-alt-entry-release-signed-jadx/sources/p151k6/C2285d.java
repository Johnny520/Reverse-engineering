package p151k6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import p100h0.C1545q0;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p134j6.AbstractC2070h;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2285d implements InterfaceC1623o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7612g;

    /* JADX INFO: renamed from: h */
    public final C1545q0 f7613h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2285d(C1545q0 c1545q0, int i9) {
        this.f7612g = i9;
        this.f7613h = c1545q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        Class cls;
        Type[] actualTypeArguments;
        int i9 = this.f7612g;
        C1545q0 c1545q0 = this.f7613h;
        cls = Object.class;
        switch (i9) {
            case 0:
                Type type = c2901a.f9369b;
                Class cls2 = c2901a.f9368a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type typeM5129g = AbstractC2070h.m5129g(type, cls2, Collection.class);
                cls = typeM5129g instanceof ParameterizedType ? ((ParameterizedType) typeM5129g).getActualTypeArguments()[0] : Object.class;
                C2327y c2327y = new C2327y(c1614f, c1614f.m4130b(new C2901a(cls)), cls);
                c1545q0.m4042c(c2901a, false);
                return new C2282c(c2327y);
            default:
                Type type2 = c2901a.f9369b;
                Class cls3 = c2901a.f9368a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeM5129g2 = AbstractC2070h.m5129g(type2, cls3, Map.class);
                    actualTypeArguments = typeM5129g2 instanceof ParameterizedType ? ((ParameterizedType) typeM5129g2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                C2327y c2327y2 = new C2327y(c1614f, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC2284c1.f7588c : c1614f.m4130b(new C2901a(type3)), type3);
                C2327y c2327y3 = new C2327y(c1614f, c1614f.m4130b(new C2901a(type4)), type4);
                c1545q0.m4042c(c2901a, false);
                return new C2282c(this, c2327y2, c2327y3);
        }
    }
}
