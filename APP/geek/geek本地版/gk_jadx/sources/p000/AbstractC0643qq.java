package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: renamed from: qq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0643qq {

    /* JADX INFO: renamed from: a */
    public static final HashMap f4112a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f4113b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m2180a(Constructor constructor, InterfaceC0531nq interfaceC0531nq) {
        try {
            AbstractC0346ip.m1502n("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(interfaceC0531nq));
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2181b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0643qq.m2181b(java.lang.Class):int");
    }
}
