package defpackage;

/* JADX INFO: renamed from: ᛳᲇᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0576 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0302 f2848 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Map f2849 = null;

    static {
            ᛲᛶᛲᲁ r0 = new ᛲᛶᛲᲁ
            r1 = 1
            r0.<init>(r1)
            defpackage.AbstractC0576.f2848 = r0
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "boolean"
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2.<init>(r0, r1)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r0 = "byte"
            java.lang.Class r1 = java.lang.Byte.TYPE
            r3.<init>(r0, r1)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r0 = "char"
            java.lang.Class r1 = java.lang.Character.TYPE
            r4.<init>(r0, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "short"
            java.lang.Class r1 = java.lang.Short.TYPE
            r5.<init>(r0, r1)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r0 = "int"
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6.<init>(r0, r1)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r0 = "long"
            java.lang.Class r1 = java.lang.Long.TYPE
            r7.<init>(r0, r1)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r0 = "float"
            java.lang.Class r1 = java.lang.Float.TYPE
            r8.<init>(r0, r1)
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r0 = "double"
            java.lang.Class r1 = java.lang.Double.TYPE
            r9.<init>(r0, r1)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.String r0 = "void"
            java.lang.Class r1 = java.lang.Void.TYPE
            r10.<init>(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r0 = defpackage.AbstractC1893.m3321(r0)
            defpackage.AbstractC0576.f2849 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.Class m1370(java.lang.ClassLoader r6, java.lang.String r7) {
            ᛲᛶᛲᲁ r0 = defpackage.AbstractC0576.f2848
            java.lang.Object r1 = r0.f1616
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = (java.util.concurrent.locks.ReentrantReadWriteLock) r1
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.lock()
            java.lang.Object r3 = r0.f1619     // Catch: java.lang.Throwable -> L21
            java.util.WeakHashMap r3 = (java.util.WeakHashMap) r3     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 != 0) goto L3f
            java.lang.Object r3 = r0.f1615     // Catch: java.lang.Throwable -> L21
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L24
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L21
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r6 = move-exception
            goto L11e
        L24:
            r3 = r4
        L25:
            if (r3 != r6) goto L5b
            java.lang.Object r3 = r0.f1618     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L21
            ᲈᲈᛵᛱ r3 = (defpackage.C2368) r3     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L34
            goto L5b
        L34:
            java.lang.Object r3 = r3.m3878()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L5b
            r2.unlock()
            goto L117
        L3f:
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L21
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L21
            ᲈᲈᛵᛱ r3 = (defpackage.C2368) r3     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L50
            goto L5b
        L50:
            java.lang.Object r3 = r3.m3878()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L5b
            r2.unlock()
            goto L117
        L5b:
            r2.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.lang.Object r2 = r0.f1619     // Catch: java.lang.Throwable -> L78
            java.util.WeakHashMap r2 = (java.util.WeakHashMap) r2     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto Lae
            java.lang.Object r3 = r0.f1615     // Catch: java.lang.Throwable -> L78
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L78
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r6 = move-exception
            goto L11a
        L7b:
            r3 = r4
        L7c:
            if (r3 != 0) goto L8d
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L78
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L78
            r0.f1615 = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r3 = r0.f1618     // Catch: java.lang.Throwable -> L78
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L78
            r3.clear()     // Catch: java.lang.Throwable -> L78
            goto Lae
        L8d:
            if (r3 == r6) goto Lae
            java.util.WeakHashMap r2 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r5 = r0.f1618     // Catch: java.lang.Throwable -> L78
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L78
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L78
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L78
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L78
            r0.f1619 = r2     // Catch: java.lang.Throwable -> L78
            r0.f1615 = r4     // Catch: java.lang.Throwable -> L78
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L78
            r0.f1618 = r3     // Catch: java.lang.Throwable -> L78
        Lae:
            if (r2 == 0) goto Lc1
            java.lang.Object r0 = r2.get(r6)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto Lbe
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            r2.put(r6, r0)     // Catch: java.lang.Throwable -> L78
        Lbe:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L78
            goto Lc5
        Lc1:
            java.lang.Object r0 = r0.f1618     // Catch: java.lang.Throwable -> L78
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L78
        Lc5:
            java.lang.Object r2 = r0.get(r7)     // Catch: java.lang.Throwable -> L78
            ᲈᲈᛵᛱ r2 = (defpackage.C2368) r2     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto Ld7
            java.lang.Object r3 = r2.m3878()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto Ld7
            r1.unlock()
            goto L117
        Ld7:
            r2 = 0
            r3 = r7
            r4 = r2
        Lda:
            java.lang.String r5 = "[]"
            boolean r5 = defpackage.AbstractC0651.m1483(r3, r5, r2)     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto Lef
            int r4 = r4 + 1
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L78
            int r5 = r5 + (-2)
            java.lang.String r3 = r3.substring(r2, r5)     // Catch: java.lang.Throwable -> L78
            goto Lda
        Lef:
            java.util.Map r5 = defpackage.AbstractC0576.f2849     // Catch: java.lang.Throwable -> L78
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L78
            if (r5 != 0) goto Lfd
            java.lang.Class r5 = r6.loadClass(r3)     // Catch: java.lang.Throwable -> L78
        Lfd:
            r6 = r2
            r3 = r5
        Lff:
            if (r6 >= r4) goto L10c
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r2)     // Catch: java.lang.Throwable -> L78
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L78
            int r6 = r6 + 1
            goto Lff
        L10c:
            ᲈᲈᛵᛱ r6 = new ᲈᲈᛵᛱ     // Catch: java.lang.Throwable -> L78
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L78
            r0.put(r7, r6)     // Catch: java.lang.Throwable -> L78
            r1.unlock()
        L117:
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L11a:
            r1.unlock()
            throw r6
        L11e:
            r2.unlock()
            throw r6
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.io.Serializable m1371(java.lang.ClassLoader r3, java.util.ArrayList r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = m1370(r3, r1)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r1 = move-exception
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r1)
            r1 = r2
        L25:
            java.lang.Throwable r2 = defpackage.C2165.m3569(r1)
            if (r2 != 0) goto L31
            java.lang.Class r1 = (java.lang.Class) r1
            r0.add(r1)
            goto Ld
        L31:
            ᛴᛸᛲᲀ r3 = new ᛴᛸᛲᲀ
            r3.<init>(r2)
            return r3
        L37:
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            return r3
    }
}
