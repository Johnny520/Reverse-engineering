package p027E4;

import java.lang.reflect.InvocationHandler;
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

    public C0307V(C0240b c0240b, Class cls) {
        this.f1022c = c0240b;
        this.f1021b = cls;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.f1021b
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.Object r8 = r9.invoke(r7, r10)
            return r8
        Lf:
            if (r10 == 0) goto L13
        L11:
            r4 = r10
            goto L16
        L13:
            java.lang.Object[] r10 = r7.f1020a
            goto L11
        L16:
            E4.b r10 = p027E4.AbstractC0300N.f961b
            boolean r1 = r10.mo518f(r9)
            if (r1 == 0) goto L23
            java.lang.Object r8 = r10.mo517e(r9, r0, r8, r4)
            return r8
        L23:
            C1.b r10 = r7.f1022c
        L25:
            java.lang.Object r1 = r10.f808a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r9)
            boolean r2 = r1 instanceof p027E4.AbstractC0333t
            if (r2 == 0) goto L35
            E4.t r1 = (p027E4.AbstractC0333t) r1
        L33:
            r9 = r1
            goto L79
        L35:
            if (r1 != 0) goto L65
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            monitor-enter(r2)
            java.lang.Object r1 = r10.f808a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.putIfAbsent(r9, r2)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L61
            E4.t r1 = p027E4.AbstractC0333t.m553b(r10, r0, r9)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r10.f808a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.put(r9, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L33
        L54:
            r0 = move-exception
            r8 = r0
            goto L63
        L57:
            r0 = move-exception
            r8 = r0
            java.lang.Object r10 = r10.f808a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.remove(r9)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L65
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r8
        L65:
            monitor-enter(r1)
            java.lang.Object r2 = r10.f808a     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L75
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            goto L25
        L72:
            r0 = move-exception
            r8 = r0
            goto L8a
        L75:
            r9 = r2
            E4.t r9 = (p027E4.AbstractC0333t) r9     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
        L79:
            E4.C r1 = new E4.C
            E4.T r2 = r9.f1054a
            X3.d r5 = r9.f1055b
            E4.n r6 = r9.f1056c
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = r9.mo552a(r1, r4)
            return r8
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p027E4.C0307V.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
