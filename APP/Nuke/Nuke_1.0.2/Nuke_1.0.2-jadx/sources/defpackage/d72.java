package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d72 {
    public static final e72 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        e72 e72Var = null;
        try {
            e72Var = (e72) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e72Var == null) {
            e72Var = new e72();
        }
        a = e72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bt a(Class cls) {
        a.getClass();
        return new bt(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h63 b() {
        bt btVarA = a(Object.class);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new h63(btVarA, list, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h63 c(Class cls) {
        bt btVarA = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new h63(btVarA, list, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h63 d(Class cls, x41 x41Var) {
        bt btVarA = a(cls);
        List listSingletonList = Collections.singletonList(x41Var);
        a.getClass();
        return new h63(btVarA, listSingletonList, false);
    }
}
