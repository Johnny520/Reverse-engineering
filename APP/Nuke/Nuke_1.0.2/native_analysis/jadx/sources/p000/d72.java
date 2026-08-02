package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d72 {

    /* JADX INFO: renamed from: a */
    public static final e72 f1901a;

    static {
        e72 e72Var = null;
        try {
            e72Var = (e72) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e72Var == null) {
            e72Var = new e72();
        }
        f1901a = e72Var;
    }

    /* JADX INFO: renamed from: a */
    public static C0067bt m967a(Class cls) {
        f1901a.getClass();
        return new C0067bt(cls);
    }

    /* JADX INFO: renamed from: b */
    public static h63 m968b() {
        C0067bt c0067btM967a = m967a(Object.class);
        List list = Collections.EMPTY_LIST;
        f1901a.getClass();
        return new h63(c0067btM967a, list, true);
    }

    /* JADX INFO: renamed from: c */
    public static h63 m969c(Class cls) {
        C0067bt c0067btM967a = m967a(cls);
        List list = Collections.EMPTY_LIST;
        f1901a.getClass();
        return new h63(c0067btM967a, list, false);
    }

    /* JADX INFO: renamed from: d */
    public static h63 m970d(Class cls, x41 x41Var) {
        C0067bt c0067btM967a = m967a(cls);
        List listSingletonList = Collections.singletonList(x41Var);
        f1901a.getClass();
        return new h63(c0067btM967a, listSingletonList, false);
    }
}
