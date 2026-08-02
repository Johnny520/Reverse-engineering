package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cu implements r43 {
    public final /* synthetic */ int h;
    public final sz0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cu(sz0 sz0Var, int i) {
        this.h = i;
        this.i = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r43
    public final q43 a(ir0 ir0Var, j63 j63Var) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.h;
        sz0 sz0Var = this.i;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = j63Var.b;
                Class cls2 = j63Var.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                rg3.s(Collection.class.isAssignableFrom(cls2));
                Type typeS = tl.S(type, cls2, tl.E(type, cls2, Collection.class), new HashMap());
                cls = typeS instanceof ParameterizedType ? ((ParameterizedType) typeS).getActualTypeArguments()[0] : Object.class;
                return new bu(new ue1(ir0Var, ir0Var.c(new j63(cls)), cls), sz0Var.D(j63Var, false));
            default:
                Type type2 = j63Var.b;
                Class cls3 = j63Var.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    rg3.s(Map.class.isAssignableFrom(cls3));
                    Type typeS2 = tl.S(type2, cls3, tl.E(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeS2 instanceof ParameterizedType ? ((ParameterizedType) typeS2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new ue1(this, new ue1(ir0Var, (type3 == Boolean.TYPE || type3 == Boolean.class) ? v53.c : ir0Var.c(new j63(type3)), type3), new ue1(ir0Var, ir0Var.c(new j63(type4)), type4), sz0Var.D(j63Var, false));
        }
    }
}
