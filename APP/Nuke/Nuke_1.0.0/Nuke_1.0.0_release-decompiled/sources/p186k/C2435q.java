package p186k;

import java.util.LinkedHashMap;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p191k4.C2475a;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2435q {

    /* JADX INFO: renamed from: a */
    public final int f7861a;

    /* JADX INFO: renamed from: b */
    public final C1753n f7862b;

    /* JADX INFO: renamed from: c */
    public final C2475a f7863c;

    /* JADX INFO: renamed from: d */
    public int f7864d;

    /* JADX INFO: renamed from: e */
    public int f7865e;

    /* JADX INFO: renamed from: f */
    public int f7866f;

    public C2435q(int i5) {
        this.f7861a = i5;
        if (i5 <= 0) {
            AbstractC2477a.m4422c("maxSize <= 0");
            throw null;
        }
        this.f7862b = new C1753n(11);
        this.f7863c = new C2475a(1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m4326a(Object obj) {
        AbstractC1665j.m2985e(obj, "key");
        synchronized (this.f7863c) {
            C1753n c1753n = this.f7862b;
            c1753n.getClass();
            Object obj2 = ((LinkedHashMap) c1753n.f6028e).get(obj);
            if (obj2 != null) {
                this.f7865e++;
                return obj2;
            }
            this.f7866f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4327b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            p117X2.AbstractC1665j.m2985e(r6, r0)
            k4.a r0 = r5.f7863c
            monitor-enter(r0)
            int r1 = r5.f7864d     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + 1
            r5.f7864d = r1     // Catch: java.lang.Throwable -> L24
            Y1.n r1 = r5.f7862b     // Catch: java.lang.Throwable -> L24
            r1.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.f6028e     // Catch: java.lang.Throwable -> L24
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L27
            int r7 = r5.f7864d     // Catch: java.lang.Throwable -> L24
            int r7 = r7 + (-1)
            r5.f7864d = r7     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r6 = move-exception
            goto Lc3
        L27:
            monitor-exit(r0)
            int r7 = r5.f7861a
        L2a:
            k4.a r0 = r5.f7863c
            monitor-enter(r0)
            int r1 = r5.f7864d     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb9
            Y1.n r1 = r5.f7862b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f6028e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r5.f7864d     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb9
            goto L45
        L42:
            r6 = move-exception
            goto Lc1
        L45:
            int r1 = r5.f7864d     // Catch: java.lang.Throwable -> L42
            if (r1 <= r7) goto Lb7
            Y1.n r1 = r5.f7862b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f6028e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L56
            goto Lb7
        L56:
            Y1.n r1 = r5.f7862b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f6028e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "<get-entries>(...)"
            p117X2.AbstractC1665j.m2984d(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L7b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L75
            goto L8a
        L75:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L8a
        L7b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L86
            goto L8a
        L86:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L8a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L90
            monitor-exit(r0)
            return r6
        L90:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            Y1.n r3 = r5.f7862b     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "key"
            p117X2.AbstractC1665j.m2985e(r1, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.f6028e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r5.f7864d     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "value"
            p117X2.AbstractC1665j.m2985e(r2, r3)     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r5.f7864d = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L2a
        Lb7:
            monitor-exit(r0)
            return r6
        Lb9:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L42
        Lc1:
            monitor-exit(r0)
            throw r6
        Lc3:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2435q.m4327b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.f7863c) {
            try {
                int i5 = this.f7865e;
                int i6 = this.f7866f + i5;
                str = "LruCache[maxSize=" + this.f7861a + ",hits=" + this.f7865e + ",misses=" + this.f7866f + ",hitRate=" + (i6 != 0 ? (i5 * 100) / i6 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
