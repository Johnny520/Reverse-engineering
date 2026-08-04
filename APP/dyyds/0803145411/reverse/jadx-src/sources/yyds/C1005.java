package yyds;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: yyds.ᛴᲈᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1005 implements InterfaceC0652 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4573;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2133 f4574;

    public /* synthetic */ C1005(C2133 c2133, int i) {
        this.f4573 = i;
        this.f4574 = c2133;
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f4573;
        C2133 c2133 = this.f4574;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = c2805.f13683;
                Class cls2 = c2805.f13682;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type typeM3710 = AbstractC1917.m3710(type, cls2, Collection.class);
                cls = typeM3710 instanceof ParameterizedType ? ((ParameterizedType) typeM3710).getActualTypeArguments()[0] : Object.class;
                return new C1546(new C1627(c0114, c0114.m521(new C2805(cls)), cls, 2), c2133.m4051(c2805, false), 0);
            default:
                Type type2 = c2805.f13683;
                Class cls3 = c2805.f13682;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeM37102 = AbstractC1917.m3710(type2, cls3, Map.class);
                    actualTypeArguments = typeM37102 instanceof ParameterizedType ? ((ParameterizedType) typeM37102).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C1627(this, new C1627(c0114, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0193.f1144 : c0114.m521(new C2805(type3)), type3, 2), new C1627(c0114, c0114.m521(new C2805(type4)), type4, 2), c2133.m4051(c2805, false));
        }
    }
}
