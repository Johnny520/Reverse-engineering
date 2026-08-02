package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: cu */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0106cu implements r43 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1734h;

    /* JADX INFO: renamed from: i */
    public final sz0 f1735i;

    public /* synthetic */ C0106cu(sz0 sz0Var, int i) {
        this.f1734h = i;
        this.f1735i = sz0Var;
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f1734h;
        sz0 sz0Var = this.f1735i;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = j63Var.f4905b;
                Class cls2 = j63Var.f4904a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                rg3.m4483s(Collection.class.isAssignableFrom(cls2));
                Type typeM5290S = AbstractC0738tl.m5290S(type, cls2, AbstractC0738tl.m5278E(type, cls2, Collection.class), new HashMap());
                cls = typeM5290S instanceof ParameterizedType ? ((ParameterizedType) typeM5290S).getActualTypeArguments()[0] : Object.class;
                return new C0068bu(new ue1(ir0Var, ir0Var.m2386c(new j63(cls)), cls), sz0Var.m5031D(j63Var, false));
            default:
                Type type2 = j63Var.f4905b;
                Class cls3 = j63Var.f4904a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    rg3.m4483s(Map.class.isAssignableFrom(cls3));
                    Type typeM5290S2 = AbstractC0738tl.m5290S(type2, cls3, AbstractC0738tl.m5278E(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM5290S2 instanceof ParameterizedType ? ((ParameterizedType) typeM5290S2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new ue1(this, new ue1(ir0Var, (type3 == Boolean.TYPE || type3 == Boolean.class) ? v53.f11724c : ir0Var.m2386c(new j63(type3)), type3), new ue1(ir0Var, ir0Var.m2386c(new j63(type4)), type4), sz0Var.m5031D(j63Var, false));
        }
    }
}
