package x3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x3.a f21176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f21177e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f21178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f21179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.Context f21180c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            x3.a.f21177e = r0
            return
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f21180c = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f21179b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f21178a = r1
            return
    }

    public static x3.a c(android.content.Context r2) {
            x3.a r0 = x3.a.f21176d
            if (r0 != 0) goto L19
            java.lang.Object r0 = x3.a.f21177e
            monitor-enter(r0)
            x3.a r1 = x3.a.f21176d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            x3.a r1 = new x3.a     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            x3.a.f21176d = r1     // Catch: java.lang.Throwable -> L13
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
            x3.a r2 = x3.a.f21176d
            return r2
    }

    public final void a(android.os.Bundle r7) {
            r6 = this;
            android.content.Context r0 = r6.f21180c
            r1 = 2131296258(0x7f090002, float:1.8210428E38)
            java.lang.String r0 = r0.getString(r1)
            if (r7 == 0) goto L5d
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L41
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L41
            java.util.Set r2 = r7.keySet()     // Catch: java.lang.ClassNotFoundException -> L41
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L41
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L41
            java.util.HashSet r4 = r6.f21179b
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassNotFoundException -> L41
            r5 = 0
            java.lang.String r5 = r7.getString(r3, r5)     // Catch: java.lang.ClassNotFoundException -> L41
            boolean r5 = r0.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L41
            if (r5 == 0) goto L18
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.Class<x3.b> r5 = x3.b.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L41
            if (r5 == 0) goto L18
            r4.add(r3)     // Catch: java.lang.ClassNotFoundException -> L41
            goto L18
        L41:
            r7 = move-exception
            goto L57
        L43:
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.ClassNotFoundException -> L41
        L47:
            boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L41
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L41
            r6.b(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L41
            goto L47
        L57:
            af.d r0 = new af.d
            r0.<init>(r7)
            throw r0
        L5d:
            return
    }

    public final java.lang.Object b(java.lang.Class r8, java.util.HashSet r9) {
            r7 = this;
            java.util.HashMap r0 = r7.f21178a
            java.lang.String r1 = "Cannot initialize "
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r4 = 0
            if (r2 < r3) goto L10
            boolean r2 = y3.a.a()
            goto L67
        L10:
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.reflect.Method r3 = a.a.f3i     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L33
            java.lang.String r3 = "TRACE_TAG_APP"
            java.lang.reflect.Field r3 = r2.getField(r3)     // Catch: java.lang.Exception -> L31
            long r5 = r3.getLong(r4)     // Catch: java.lang.Exception -> L31
            a.a.f2h = r5     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "isTagEnabled"
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L31
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Exception -> L31
            a.a.f3i = r2     // Catch: java.lang.Exception -> L31
            goto L33
        L31:
            r2 = move-exception
            goto L4a
        L33:
            java.lang.reflect.Method r2 = a.a.f3i     // Catch: java.lang.Exception -> L31
            long r5 = a.a.f2h     // Catch: java.lang.Exception -> L31
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L31
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L31
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L31
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L31
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L31
            goto L67
        L4a:
            boolean r3 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r3 == 0) goto L5f
            java.lang.Throwable r8 = r2.getCause()
            boolean r9 = r8 instanceof java.lang.RuntimeException
            if (r9 == 0) goto L59
            java.lang.RuntimeException r8 = (java.lang.RuntimeException) r8
            throw r8
        L59:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
        L5f:
            java.lang.String r3 = "Trace"
            java.lang.String r5 = "Unable to call isTagEnabled via reflection"
            android.util.Log.v(r3, r5, r2)
            r2 = 0
        L67:
            if (r2 == 0) goto L74
            java.lang.String r2 = r8.getSimpleName()     // Catch: java.lang.Throwable -> L71
            a.a.o(r2)     // Catch: java.lang.Throwable -> L71
            goto L74
        L71:
            r8 = move-exception
            goto Le9
        L74:
            boolean r2 = r9.contains(r8)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto Lce
            boolean r1 = r0.containsKey(r8)     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto Lc6
            r9.add(r8)     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Constructor r1 = r8.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r1 = r1.newInstance(r4)     // Catch: java.lang.Throwable -> Lb1
            x3.b r1 = (x3.b) r1     // Catch: java.lang.Throwable -> Lb1
            java.util.List r2 = r1.a()     // Catch: java.lang.Throwable -> Lb1
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto Lb3
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb1
        L9b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r4 != 0) goto L9b
            r7.b(r3, r9)     // Catch: java.lang.Throwable -> Lb1
            goto L9b
        Lb1:
            r8 = move-exception
            goto Lc0
        Lb3:
            android.content.Context r2 = r7.f21180c     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r1 = r1.b(r2)     // Catch: java.lang.Throwable -> Lb1
            r9.remove(r8)     // Catch: java.lang.Throwable -> Lb1
            r0.put(r8, r1)     // Catch: java.lang.Throwable -> Lb1
            goto Lca
        Lc0:
            af.d r9 = new af.d     // Catch: java.lang.Throwable -> L71
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L71
            throw r9     // Catch: java.lang.Throwable -> L71
        Lc6:
            java.lang.Object r1 = r0.get(r8)     // Catch: java.lang.Throwable -> L71
        Lca:
            android.os.Trace.endSection()
            return r1
        Lce:
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L71
            r9.append(r8)     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = ". Cycle detected."
            r9.append(r8)     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L71
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L71
            throw r9     // Catch: java.lang.Throwable -> L71
        Le9:
            android.os.Trace.endSection()
            throw r8
    }
}
