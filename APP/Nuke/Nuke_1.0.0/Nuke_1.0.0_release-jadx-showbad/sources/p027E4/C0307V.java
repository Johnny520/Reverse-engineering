package p027E4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import p014C1.C0240b;

/* JADX INFO: renamed from: E4.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0307V implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object[] f1020a = new Object[0];

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f1021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0240b f1022c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0307V(C0240b c0240b, Class cls) {
        this.f1022c = c0240b;
        this.f1021b = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = p027E4.AbstractC0333t.m553b(r10, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r10.f808a).put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r9 = (p027E4.AbstractC0333t) r2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC0333t abstractC0333tM553b;
        Class cls = this.f1021b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f1020a;
        }
        Object[] objArr2 = objArr;
        C0314b c0314b = AbstractC0300N.f961b;
        if (c0314b.mo518f(method)) {
            return c0314b.mo517e(method, cls, obj, objArr2);
        }
        C0240b c0240b = this.f1022c;
        while (true) {
            Object objPutIfAbsent = ((ConcurrentHashMap) c0240b.f808a).get(method);
            if (!(objPutIfAbsent instanceof AbstractC0333t)) {
                if (objPutIfAbsent == null) {
                    Object obj2 = new Object();
                    synchronized (obj2) {
                        try {
                            objPutIfAbsent = ((ConcurrentHashMap) c0240b.f808a).putIfAbsent(method, obj2);
                            if (objPutIfAbsent == null) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    ((ConcurrentHashMap) c0240b.f808a).remove(method);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                }
                synchronized (objPutIfAbsent) {
                    try {
                        Object obj3 = ((ConcurrentHashMap) c0240b.f808a).get(method);
                        if (obj3 != null) {
                            break;
                        }
                    } finally {
                    }
                }
                break;
            }
            abstractC0333tM553b = (AbstractC0333t) objPutIfAbsent;
            break;
        }
        AbstractC0333t abstractC0333t = abstractC0333tM553b;
        return abstractC0333t.mo552a(new C0289C(abstractC0333t.f1054a, obj, objArr2, abstractC0333t.f1055b, abstractC0333t.f1056c), objArr2);
    }
}
