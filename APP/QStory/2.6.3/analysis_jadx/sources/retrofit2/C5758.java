package retrofit2;

import androidx.appcompat.widget.C0131;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5758 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f15770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0131 f15771;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f15772 = new Object[0];

    public C5758(C0131 c0131, Class cls) {
        this.f15771 = c0131;
        this.f15770 = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r10 = retrofit2.AbstractC5784.m11173(r7, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r7.f578).put(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        r7 = (retrofit2.AbstractC5784) r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.f15770
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.Object r7 = r9.invoke(r7, r10)
            return r7
        Lf:
            if (r10 == 0) goto L13
        L11:
            r4 = r10
            goto L16
        L13:
            java.lang.Object[] r10 = r7.f15772
            goto L11
        L16:
            retrofit2.飘花落叶言子楪世苏兰哲 r10 = retrofit2.AbstractC5761.f15813
            boolean r1 = r10.mo11155(r9)
            if (r1 == 0) goto L23
            java.lang.Object r7 = r10.mo11156(r9, r0, r8, r4)
            return r7
        L23:
            androidx.appcompat.widget.飘花落叶言子世楪苏哲兰 r7 = r7.f15771
        L25:
            java.io.Serializable r10 = r7.f578
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            java.lang.Object r10 = r10.get(r9)
            boolean r1 = r10 instanceof retrofit2.AbstractC5784
            if (r1 == 0) goto L34
            retrofit2.飘花落叶言子楪兰世苏哲 r10 = (retrofit2.AbstractC5784) r10
            goto L79
        L34:
            if (r10 != 0) goto L64
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            monitor-enter(r1)
            java.io.Serializable r10 = r7.f578     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L53
            java.lang.Object r10 = r10.putIfAbsent(r9, r1)     // Catch: java.lang.Throwable -> L53
            if (r10 != 0) goto L60
            retrofit2.飘花落叶言子楪兰世苏哲 r10 = retrofit2.AbstractC5784.m11173(r7, r0, r9)     // Catch: java.lang.Throwable -> L56
            java.io.Serializable r7 = r7.f578     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch: java.lang.Throwable -> L53
            r7.put(r9, r10)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            goto L79
        L53:
            r0 = move-exception
            r7 = r0
            goto L62
        L56:
            r0 = move-exception
            r8 = r0
            java.io.Serializable r7 = r7.f578     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch: java.lang.Throwable -> L53
            r7.remove(r9)     // Catch: java.lang.Throwable -> L53
            throw r8     // Catch: java.lang.Throwable -> L53
        L60:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            goto L64
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            throw r7
        L64:
            monitor-enter(r10)
            java.io.Serializable r1 = r7.f578     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L74
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L71
            goto L25
        L71:
            r0 = move-exception
            r7 = r0
            goto L8a
        L74:
            r7 = r1
            retrofit2.飘花落叶言子楪兰世苏哲 r7 = (retrofit2.AbstractC5784) r7     // Catch: java.lang.Throwable -> L71
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L71
            r10 = r7
        L79:
            retrofit2.飘花落叶言子世楪哲苏兰 r1 = new retrofit2.飘花落叶言子世楪哲苏兰
            retrofit2.飘花落叶言子世兰楪苏哲 r2 = r10.f15877
            飘花落叶言世兰子哲苏楪.飘花落叶言子世楪苏哲兰 r5 = r10.f15876
            retrofit2.飘花落叶言子楪哲世兰苏 r6 = r10.f15875
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = r10.mo11174(r1, r4)
            return r7
        L8a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L71
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C5758.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
