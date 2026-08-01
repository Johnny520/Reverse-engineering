package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import com.google.gson.internal.AbstractC4053;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p248.C8894;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9134 implements InterfaceC4081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8894 f23259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23260;

    public /* synthetic */ C9134(C8894 c8894, int i) {
        this.f23260 = i;
        this.f23259 = c8894;
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f23260;
        C8894 c8894 = this.f23259;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = c9075.f23159;
                Class cls2 = c9075.f23160;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC4053.m7871(Collection.class.isAssignableFrom(cls2));
                Type typeM7878 = AbstractC4053.m7878(type, cls2, AbstractC4053.m7874(cls2, Collection.class, type), new HashMap());
                cls = typeM7878 instanceof ParameterizedType ? ((ParameterizedType) typeM7878).getActualTypeArguments()[0] : Object.class;
                return new C9135(new C9148(c4085, c4085.m7899(new C9075(cls)), cls), c8894.m14108(c9075, false));
            default:
                Type type2 = c9075.f23159;
                Class cls3 = c9075.f23160;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC4053.m7871(Map.class.isAssignableFrom(cls3));
                    Type typeM78782 = AbstractC4053.m7878(type2, cls3, AbstractC4053.m7874(cls3, Map.class, type2), new HashMap());
                    actualTypeArguments = typeM78782 instanceof ParameterizedType ? ((ParameterizedType) typeM78782).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C9148(this, new C9148(c4085, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC9156.f23315 : c4085.m7899(new C9075(type3)), type3), new C9148(c4085, c4085.m7899(new C9075(type4)), type4), c8894.m14108(c9075, false));
        }
    }
}
