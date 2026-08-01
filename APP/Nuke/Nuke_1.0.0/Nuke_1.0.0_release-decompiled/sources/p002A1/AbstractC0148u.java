package p002A1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0148u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f548a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f549b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m192a(Constructor constructor, InterfaceC0144q interfaceC0144q) {
        try {
            AbstractC1665j.m2982b(constructor.newInstance(interfaceC0144q));
            throw new ClassCastException();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m193b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.AbstractC0148u.m193b(java.lang.Class):int");
    }
}
