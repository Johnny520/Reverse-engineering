package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hp2 extends t70 implements w70 {
    public static final hp2 d = new hp2(true);
    public static final String e = "ServiceManager";
    public static final hx2 f = new hx2(new hn1(16));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object j(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Object objInvoke = ((Method) f.getValue()).invoke(null, cls);
        if (objInvoke != null) {
            return objInvoke;
        }
        s.c("ServiceManager returned null for ".concat(cls.getName()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(gp2.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }
}
