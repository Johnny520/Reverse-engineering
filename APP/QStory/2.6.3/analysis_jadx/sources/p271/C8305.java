package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import com.google.gson.internal.AbstractC3221;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p232.C8065;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8305 implements InterfaceC3249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8065 f22914;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22915;

    public /* synthetic */ C8305(C8065 c8065, int i) {
        this.f22915 = i;
        this.f22914 = c8065;
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f22915;
        C8065 c8065 = this.f22914;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = c8246.f22814;
                Class cls2 = c8246.f22815;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC3221.m7312(Collection.class.isAssignableFrom(cls2));
                Type typeM7319 = AbstractC3221.m7319(type, cls2, AbstractC3221.m7315(cls2, Collection.class, type), new HashMap());
                cls = typeM7319 instanceof ParameterizedType ? ((ParameterizedType) typeM7319).getActualTypeArguments()[0] : Object.class;
                return new C8306(new C8319(c3253, c3253.m7340(new C8246(cls)), cls), c8065.m13549(c8246, false));
            default:
                Type type2 = c8246.f22814;
                Class cls3 = c8246.f22815;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC3221.m7312(Map.class.isAssignableFrom(cls3));
                    Type typeM73192 = AbstractC3221.m7319(type2, cls3, AbstractC3221.m7315(cls3, Map.class, type2), new HashMap());
                    actualTypeArguments = typeM73192 instanceof ParameterizedType ? ((ParameterizedType) typeM73192).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C8319(this, new C8319(c3253, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC8327.f22970 : c3253.m7340(new C8246(type3)), type3), new C8319(c3253, c3253.m7340(new C8246(type4)), type4), c8065.m13549(c8246, false));
        }
    }
}
