package p022L0;

import java.lang.reflect.Method;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: L0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246a {

    /* JADX INFO: renamed from: a */
    public static final Method f524a = null;

    static {
        Method[] r1 = Throwable.class.getMethods();
        AbstractC0307g.m700b(r1);
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        Method r5 = null;
        Class<?> r52 = null;
        if (r4 >= r2) goto L14;
        Method r6 = r1[r4];
        if (AbstractC0307g.m699a(r6.getName(), "addSuppressed") == false) goto L13;
        Class<?>[] r7 = r6.getParameterTypes();
        AbstractC0307g.m702d(r7, "getParameterTypes(...)");
        if (r7.length != 1) goto L11;
        r52 = r7[0];
    L11:
        if (AbstractC0307g.m699a(r52, Throwable.class) == false) goto L13;
        r5 = r6;
    L13:
        r4 = r4 + 1;
    L14:
        f524a = r5;
        int r02 = r1.length;
    L15:
        if (r3 >= r02) goto L27;
        if (AbstractC0307g.m699a(r1[r3].getName(), "getSuppressed") == true) goto L20;
        r3 = r3 + 1;
        goto L15
    L20:
        return;
    }
}
