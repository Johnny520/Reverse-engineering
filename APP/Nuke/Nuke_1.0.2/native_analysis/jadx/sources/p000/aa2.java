package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object[] f125a = new Object[0];

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0093cj f126b;

    public aa2(C0093cj c0093cj) {
        this.f126b = c0093cj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r9 = p000.ww0.m6016b(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r6.f1579a).put(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        r6 = (p000.ww0) r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ww0 ww0VarM6016b;
        ww0 ww0Var;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f125a;
        }
        Object[] objArr2 = objArr;
        i51 i51Var = yz1.f13683b;
        if (i51Var.mo661s(method)) {
            return i51Var.mo660r(obj, method, objArr2);
        }
        C0093cj c0093cj = this.f126b;
        while (true) {
            Object objPutIfAbsent = ((ConcurrentHashMap) c0093cj.f1579a).get(method);
            if (objPutIfAbsent instanceof ww0) {
                ww0VarM6016b = (ww0) objPutIfAbsent;
                break;
            }
            if (objPutIfAbsent == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        objPutIfAbsent = ((ConcurrentHashMap) c0093cj.f1579a).putIfAbsent(method, obj2);
                        if (objPutIfAbsent != null) {
                            synchronized (objPutIfAbsent) {
                                try {
                                    Object obj3 = ((ConcurrentHashMap) c0093cj.f1579a).get(method);
                                    if (obj3 != null) {
                                        break;
                                    }
                                } finally {
                                }
                            }
                            ww0VarM6016b = ww0Var;
                            break;
                        }
                        try {
                            break;
                        } catch (Throwable th) {
                            ((ConcurrentHashMap) c0093cj.f1579a).remove(method);
                            throw th;
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
            }
        }
        return ww0VarM6016b.mo5587a(new ct1(ww0VarM6016b.f12695a, obj, objArr2, ww0VarM6016b.f12696b, ww0VarM6016b.f12697c), objArr2);
    }
}
