package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: Pt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681Pt {

    /* JADX INFO: renamed from: a */
    public static final Method f2179a = null;

    static {
        Method[] r1 = Throwable.class.getMethods();
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        Method r5 = null;
        Class<?> r52 = null;
        if (r4 >= r2) goto L14;
        Method r6 = r1[r4];
        if (AbstractC0585Nj.m1134a(r6.getName(), "addSuppressed") == false) goto L13;
        Class<?>[] r7 = r6.getParameterTypes();
        if (r7.length != 1) goto L11;
        r52 = r7[0];
    L11:
        if (AbstractC0585Nj.m1134a(r52, Throwable.class) == false) goto L13;
        r5 = r6;
    L13:
        r4 = r4 + 1;
    L14:
        f2179a = r5;
        int r0 = r1.length;
    L15:
        if (r3 >= r0) goto L20;
        if (AbstractC0585Nj.m1134a(r1[r3].getName(), "getSuppressed") == true) goto L18;
        r3 = r3 + 1;
        goto L15
    L18:
        return;
    }
}
