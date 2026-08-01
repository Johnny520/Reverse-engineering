package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class qx {
    public static final Method a = null;

    static {
        Method[] r1 = Throwable.class.getMethods();
        ip.l(r1);
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        Method r5 = null;
        Class<?> r52 = null;
        if (r4 >= r2) goto L14;
        Method r6 = r1[r4];
        if (ip.i(r6.getName(), "addSuppressed") == false) goto L13;
        Class<?>[] r7 = r6.getParameterTypes();
        ip.n("getParameterTypes(...)", r7);
        if (r7.length != 1) goto L11;
        r52 = r7[0];
    L11:
        if (ip.i(r52, Throwable.class) == false) goto L13;
        r5 = r6;
    L13:
        r4 = r4 + 1;
    L14:
        a = r5;
        int r0 = r1.length;
    L15:
        if (r3 >= r0) goto L20;
        if (ip.i(r1[r3].getName(), "getSuppressed") == true) goto L18;
        r3 = r3 + 1;
        goto L15
    L18:
        return;
    }
}
