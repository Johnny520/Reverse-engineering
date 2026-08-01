package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛲᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.util.Map f1964 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C1068 f1965 = null;

    static {
            xhss.ᲇᛸᛶ r0 = new xhss.ᲇᛸᛶ
            r1 = 0
            r0.<init>(r1)
            xhss.AbstractC0545.f1965 = r0
            xhss.ᲀᛴᛳᛸ r2 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "boolean"
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r3 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "byte"
            java.lang.Class r1 = java.lang.Byte.TYPE
            r3.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r4 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "char"
            java.lang.Class r1 = java.lang.Character.TYPE
            r4.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r5 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "short"
            java.lang.Class r1 = java.lang.Short.TYPE
            r5.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r6 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "int"
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r7 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "long"
            java.lang.Class r1 = java.lang.Long.TYPE
            r7.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r8 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "float"
            java.lang.Class r1 = java.lang.Float.TYPE
            r8.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r9 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "double"
            java.lang.Class r1 = java.lang.Double.TYPE
            r9.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ r10 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "void"
            java.lang.Class r1 = java.lang.Void.TYPE
            r10.<init>(r0, r1)
            xhss.ᲀᛴᛳᛸ[] r0 = new xhss.C0857[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r0 = xhss.AbstractC0955.m1569(r0)
            xhss.AbstractC0545.f1964 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.io.Serializable m976(java.lang.ClassLoader r3, java.util.ArrayList r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = m977(r3, r1)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r1 = move-exception
            xhss.ᲈᛳᛱᲇ r2 = new xhss.ᲈᛳᛱᲇ
            r2.<init>(r1)
            r1 = r2
        L25:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r1)
            if (r2 != 0) goto L31
            java.lang.Class r1 = (java.lang.Class) r1
            r0.add(r1)
            goto Ld
        L31:
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            return r3
        L37:
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            if (r3 == 0) goto L41
            return r3
        L41:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            xhss.C0532.m953(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.lang.Class m977(java.lang.ClassLoader r7, java.lang.String r8) {
            xhss.ᛳᛶᲈᲇ r0 = new xhss.ᛳᛶᲈᲇ
            r0.<init>(r7, r8)
            xhss.ᲇᛸᛶ r1 = xhss.AbstractC0545.f1965
            java.lang.Object r2 = r1.f3444
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = (java.util.concurrent.locks.ReentrantReadWriteLock) r2
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            r3.lock()
            java.lang.Object r4 = r1.f3447     // Catch: java.lang.Throwable -> L26
            java.util.WeakHashMap r4 = (java.util.WeakHashMap) r4     // Catch: java.lang.Throwable -> L26
            r5 = 0
            if (r4 != 0) goto L44
            java.lang.Object r4 = r1.f3446     // Catch: java.lang.Throwable -> L26
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L29
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L26
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r7 = move-exception
            goto Lf3
        L29:
            r4 = r5
        L2a:
            if (r4 != r7) goto L60
            java.lang.Object r4 = r1.f3445     // Catch: java.lang.Throwable -> L26
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L26
            xhss.ᛲᛵᲁᲁ r4 = (xhss.C0165) r4     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L39
            goto L60
        L39:
            java.lang.Object r4 = r4.m407()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L60
            r3.unlock()
            goto Lec
        L44:
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L26
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L60
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L26
            xhss.ᛲᛵᲁᲁ r4 = (xhss.C0165) r4     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L55
            goto L60
        L55:
            java.lang.Object r4 = r4.m407()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L60
            r3.unlock()
            goto Lec
        L60:
            r3.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            java.lang.Object r3 = r1.f3447     // Catch: java.lang.Throwable -> L7d
            java.util.WeakHashMap r3 = (java.util.WeakHashMap) r3     // Catch: java.lang.Throwable -> L7d
            if (r3 != 0) goto Lb3
            java.lang.Object r4 = r1.f3446     // Catch: java.lang.Throwable -> L7d
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L80
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L7d
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r7 = move-exception
            goto Lef
        L80:
            r4 = r5
        L81:
            if (r4 != 0) goto L92
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7d
            r1.f3446 = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r1.f3445     // Catch: java.lang.Throwable -> L7d
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L7d
            r4.clear()     // Catch: java.lang.Throwable -> L7d
            goto Lb3
        L92:
            if (r4 == r7) goto Lb3
            java.util.WeakHashMap r3 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r6 = r1.f3445     // Catch: java.lang.Throwable -> L7d
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: java.lang.Throwable -> L7d
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L7d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L7d
            r1.f3447 = r3     // Catch: java.lang.Throwable -> L7d
            r1.f3446 = r5     // Catch: java.lang.Throwable -> L7d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            r1.f3445 = r4     // Catch: java.lang.Throwable -> L7d
        Lb3:
            if (r3 == 0) goto Lc6
            java.lang.Object r1 = r3.get(r7)     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto Lc3
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            r3.put(r7, r1)     // Catch: java.lang.Throwable -> L7d
        Lc3:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L7d
            goto Lcb
        Lc6:
            java.lang.Object r7 = r1.f3445     // Catch: java.lang.Throwable -> L7d
            r1 = r7
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L7d
        Lcb:
            java.lang.Object r7 = r1.get(r8)     // Catch: java.lang.Throwable -> L7d
            xhss.ᛲᛵᲁᲁ r7 = (xhss.C0165) r7     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto Ldd
            java.lang.Object r4 = r7.m407()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto Ldd
            r2.unlock()
            goto Lec
        Ldd:
            java.lang.Object r4 = r0.mo136()     // Catch: java.lang.Throwable -> L7d
            xhss.ᛲᛵᲁᲁ r7 = new xhss.ᛲᛵᲁᲁ     // Catch: java.lang.Throwable -> L7d
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            r1.put(r8, r7)     // Catch: java.lang.Throwable -> L7d
            r2.unlock()
        Lec:
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        Lef:
            r2.unlock()
            throw r7
        Lf3:
            r3.unlock()
            throw r7
    }
}
