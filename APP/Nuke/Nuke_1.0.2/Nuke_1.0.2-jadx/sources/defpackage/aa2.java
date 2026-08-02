package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ cj b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public aa2(cj cjVar) {
        this.b = cjVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r9 = defpackage.ww0.b(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r6.a).put(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        r6 = (defpackage.ww0) r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ww0 ww0VarB;
        ww0 ww0Var;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        i51 i51Var = yz1.b;
        if (i51Var.s(method)) {
            return i51Var.r(obj, method, objArr2);
        }
        cj cjVar = this.b;
        while (true) {
            Object objPutIfAbsent = ((ConcurrentHashMap) cjVar.a).get(method);
            if (objPutIfAbsent instanceof ww0) {
                ww0VarB = (ww0) objPutIfAbsent;
                break;
            }
            if (objPutIfAbsent == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        objPutIfAbsent = ((ConcurrentHashMap) cjVar.a).putIfAbsent(method, obj2);
                        if (objPutIfAbsent != null) {
                            synchronized (objPutIfAbsent) {
                                try {
                                    Object obj3 = ((ConcurrentHashMap) cjVar.a).get(method);
                                    if (obj3 != null) {
                                        break;
                                    }
                                } finally {
                                }
                            }
                            ww0VarB = ww0Var;
                            break;
                        }
                        try {
                            break;
                        } catch (Throwable th) {
                            ((ConcurrentHashMap) cjVar.a).remove(method);
                            throw th;
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
            }
        }
        return ww0VarB.a(new ct1(ww0VarB.a, obj, objArr2, ww0VarB.b, ww0VarB.c), objArr2);
    }
}
