package a;

/* JADX INFO: loaded from: classes.dex */
public class W9<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap<K, V> f324a;
    public int b;
    public final int c;
    public int d;
    public int e;

    public W9(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.c = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1
            r1 = 0
            r2 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r1, r2, r0)
            r3.f324a = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    public final V a(K r2) {
            r1 = this;
            if (r2 == 0) goto L20
            monitor-enter(r1)
            java.util.LinkedHashMap<K, V> r0 = r1.f324a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            int r0 = r1.d     // Catch: java.lang.Throwable -> L13
            int r0 = r0 + 1
            r1.d = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r2 = move-exception
            goto L1e
        L15:
            int r2 = r1.e     // Catch: java.lang.Throwable -> L13
            int r2 = r2 + 1
            r1.e = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            r2 = 0
            return r2
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
        L20:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r2.<init>(r0)
            throw r2
    }

    public final V b(K r3, V r4) {
            r2 = this;
            if (r3 == 0) goto L87
            monitor-enter(r2)
            int r0 = r2.b     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 1
            r2.b = r0     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap<K, V> r0 = r2.f324a     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            int r4 = r2.b     // Catch: java.lang.Throwable -> L18
            int r4 = r4 + (-1)
            r2.b = r4     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L85
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            int r4 = r2.c
        L1d:
            monitor-enter(r2)
            int r0 = r2.b     // Catch: java.lang.Throwable -> L2f
            if (r0 < 0) goto L64
            java.util.LinkedHashMap<K, V> r0 = r2.f324a     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            int r0 = r2.b     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L64
            goto L31
        L2f:
            r3 = move-exception
            goto L83
        L31:
            int r0 = r2.b     // Catch: java.lang.Throwable -> L2f
            if (r0 <= r4) goto L62
            java.util.LinkedHashMap<K, V> r0 = r2.f324a     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L3e
            goto L62
        L3e:
            java.util.LinkedHashMap<K, V> r0 = r2.f324a     // Catch: java.lang.Throwable -> L2f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L2f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L2f
            r0.getValue()     // Catch: java.lang.Throwable -> L2f
            java.util.LinkedHashMap<K, V> r0 = r2.f324a     // Catch: java.lang.Throwable -> L2f
            r0.remove(r1)     // Catch: java.lang.Throwable -> L2f
            int r0 = r2.b     // Catch: java.lang.Throwable -> L2f
            int r0 = r0 + (-1)
            r2.b = r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L1d
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r3
        L64:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2f
            r4.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r3
        L85:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
        L87:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "LruCache[maxSize="
            monitor-enter(r6)
            int r1 = r6.d     // Catch: java.lang.Throwable -> Lf
            int r2 = r6.e     // Catch: java.lang.Throwable -> Lf
            int r3 = r1 + r2
            if (r3 == 0) goto L11
            int r4 = r1 * 100
            int r4 = r4 / r3
            goto L12
        Lf:
            r0 = move-exception
            goto L41
        L11:
            r4 = 0
        L12:
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lf
            int r3 = r6.c     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            r5.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = ",hits="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf
            r5.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = ",misses="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf
            r5.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = ",hitRate="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf
            r5.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "%]"
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            return r0
        L41:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }
}
