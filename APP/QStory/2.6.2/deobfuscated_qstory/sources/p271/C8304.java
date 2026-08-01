package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import com.google.gson.internal.AbstractC3220;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p232.C8064;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8304 implements InterfaceC3248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8064 f22915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22916;

    public /* synthetic */ C8304(C8064 c8064, int i) {
        this.f22916 = i;
        this.f22915 = c8064;
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f22916;
        C8064 c8064 = this.f22915;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = c8245.f22815;
                Class cls2 = c8245.f22816;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC3220.m7325(Collection.class.isAssignableFrom(cls2));
                Type typeM7332 = AbstractC3220.m7332(type, cls2, AbstractC3220.m7328(cls2, Collection.class, type), new HashMap());
                cls = typeM7332 instanceof ParameterizedType ? ((ParameterizedType) typeM7332).getActualTypeArguments()[0] : Object.class;
                return new C8305(new C8318(c3252, c3252.m7353(new C8245(cls)), cls), c8064.m13520(c8245, false));
            default:
                Type type2 = c8245.f22815;
                Class cls3 = c8245.f22816;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC3220.m7325(Map.class.isAssignableFrom(cls3));
                    Type typeM73322 = AbstractC3220.m7332(type2, cls3, AbstractC3220.m7328(cls3, Map.class, type2), new HashMap());
                    actualTypeArguments = typeM73322 instanceof ParameterizedType ? ((ParameterizedType) typeM73322).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C8318(this, new C8318(c3252, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC8326.f22971 : c3252.m7353(new C8245(type3)), type3), new C8318(c3252, c3252.m7353(new C8245(type4)), type4), c8064.m13520(c8245, false));
        }
    }
}
