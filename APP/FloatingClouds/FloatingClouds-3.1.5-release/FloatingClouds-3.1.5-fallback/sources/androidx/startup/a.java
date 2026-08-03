package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static volatile androidx.startup.a d;
    public static final java.lang.Object e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f1020a;
    public final java.util.HashSet b;
    public final android.content.Context c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.startup.a.e = r0
            return
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.c = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f1020a = r1
            return
    }

    public static androidx.startup.a c(android.content.Context r2) {
            androidx.startup.a r0 = androidx.startup.a.d
            if (r0 != 0) goto L19
            java.lang.Object r0 = androidx.startup.a.e
            monitor-enter(r0)
            androidx.startup.a r1 = androidx.startup.a.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            androidx.startup.a r1 = new androidx.startup.a     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            androidx.startup.a.d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            androidx.startup.a r2 = androidx.startup.a.d
            return r2
    }

    public final void a(android.os.Bundle r7) {
            r6 = this;
            android.content.Context r0 = r6.c
            int r1 = androidx.startup.R.string.androidx_startup
            java.lang.String r0 = r0.getString(r1)
            if (r7 == 0) goto L5c
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L40
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Set r2 = r7.keySet()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L40
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.HashSet r4 = r6.b
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassNotFoundException -> L40
            r5 = 0
            java.lang.String r5 = r7.getString(r3, r5)     // Catch: java.lang.ClassNotFoundException -> L40
            boolean r5 = r0.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L40
            if (r5 == 0) goto L17
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.Class<a.V8> r5 = a.V8.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            if (r5 == 0) goto L17
            r4.add(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L17
        L40:
            r7 = move-exception
            goto L56
        L42:
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.ClassNotFoundException -> L40
        L46:
            boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L40
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L40
            r6.b(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L46
        L56:
            a.Ob r0 = new a.Ob
            r0.<init>(r7)
            throw r0
        L5c:
            return
    }

    public final java.lang.Object b(java.lang.Class r6, java.util.HashSet r7) {
            r5 = this;
            java.lang.String r0 = "Cannot initialize "
            boolean r1 = a.C0503zf.a()
            if (r1 == 0) goto L13
            java.lang.String r1 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L10
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r6 = move-exception
            goto L8b
        L13:
            boolean r1 = r7.contains(r6)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L70
            java.util.HashMap r0 = r5.f1020a
            boolean r1 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L68
            r7.add(r6)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L53
            a.V8 r1 = (a.V8) r1     // Catch: java.lang.Throwable -> L53
            java.util.List r2 = r1.a()     // Catch: java.lang.Throwable -> L53
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L53
        L3d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L53
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L3d
            r5.b(r3, r7)     // Catch: java.lang.Throwable -> L53
            goto L3d
        L53:
            r6 = move-exception
            goto L62
        L55:
            android.content.Context r2 = r5.c     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L53
            r7.remove(r6)     // Catch: java.lang.Throwable -> L53
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L53
            goto L6c
        L62:
            a.Ob r7 = new a.Ob     // Catch: java.lang.Throwable -> L10
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L10
            throw r7     // Catch: java.lang.Throwable -> L10
        L68:
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L10
        L6c:
            android.os.Trace.endSection()
            return r1
        L70:
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L10
            r7.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = ". Cycle detected."
            r7.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L10
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L10
            throw r7     // Catch: java.lang.Throwable -> L10
        L8b:
            android.os.Trace.endSection()
            throw r6
    }
}
