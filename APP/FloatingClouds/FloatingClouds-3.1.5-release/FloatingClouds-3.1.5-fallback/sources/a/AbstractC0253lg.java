package a;

/* JADX INFO: renamed from: a.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0253lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.J1<java.lang.String, java.lang.reflect.Method> f566a;
    public final a.J1<java.lang.String, java.lang.reflect.Method> b;
    public final a.J1<java.lang.String, java.lang.Class> c;

    public AbstractC0253lg(a.J1<java.lang.String, java.lang.reflect.Method> r1, a.J1<java.lang.String, java.lang.reflect.Method> r2, a.J1<java.lang.String, java.lang.Class> r3) {
            r0 = this;
            r0.<init>()
            r0.f566a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public abstract a.C0271mg a();

    public final java.lang.Class b(java.lang.Class<? extends a.InterfaceC0289ng> r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            a.J1<java.lang.String, java.lang.Class> r1 = r4.c
            r2 = 0
            java.lang.Object r0 = r1.getOrDefault(r0, r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L44
            java.lang.Package r0 = r5.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = r5.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "."
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "Parcelizer"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2 = 0
            java.lang.ClassLoader r3 = r5.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r3)
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L44:
            return r0
    }

    public final java.lang.reflect.Method c(java.lang.String r5) {
            r4 = this;
            a.J1<java.lang.String, java.lang.reflect.Method> r0 = r4.f566a
            r1 = 0
            java.lang.Object r1 = r0.getOrDefault(r5, r1)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L26
            java.lang.System.currentTimeMillis()
            java.lang.Class<a.lg> r1 = a.AbstractC0253lg.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            r3 = 1
            java.lang.Class r2 = java.lang.Class.forName(r5, r3, r2)
            java.lang.String r3 = "read"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r3, r1)
            r0.put(r5, r1)
        L26:
            return r1
    }

    public final java.lang.reflect.Method d(java.lang.Class r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            a.J1<java.lang.String, java.lang.reflect.Method> r1 = r4.b
            r2 = 0
            java.lang.Object r0 = r1.getOrDefault(r0, r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            java.lang.Class r0 = r4.b(r5)
            java.lang.System.currentTimeMillis()
            java.lang.Class<a.lg> r2 = a.AbstractC0253lg.class
            java.lang.Class[] r2 = new java.lang.Class[]{r5, r2}
            java.lang.String r3 = "write"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L29:
            return r0
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract java.lang.CharSequence g();

    public abstract boolean h(int r1);

    public abstract int i();

    public abstract <T extends android.os.Parcelable> T j();

    public abstract java.lang.String k();

    public final <T extends a.InterfaceC0289ng> T l() {
            r3 = this;
            java.lang.String r0 = r3.k()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            a.mg r2 = r3.a()
            java.lang.reflect.Method r0 = r3.c(r0)     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.NoSuchMethodException -> L1d java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.NoSuchMethodException -> L1d java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.NoSuchMethodException -> L1d java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            a.ng r0 = (a.InterfaceC0289ng) r0     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.NoSuchMethodException -> L1d java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            return r0
        L1b:
            r0 = move-exception
            goto L23
        L1d:
            r0 = move-exception
            goto L2b
        L1f:
            r0 = move-exception
            goto L33
        L21:
            r0 = move-exception
            goto L4a
        L23:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered ClassNotFoundException"
            r1.<init>(r2, r0)
            throw r1
        L2b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered NoSuchMethodException"
            r1.<init>(r2, r0)
            throw r1
        L33:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L42
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L42:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered InvocationTargetException"
            r1.<init>(r2, r0)
            throw r1
        L4a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered IllegalAccessException"
            r1.<init>(r2, r0)
            throw r1
    }

    public abstract void m(int r1);

    public abstract void n(boolean r1);

    public abstract void o(byte[] r1);

    public abstract void p(java.lang.CharSequence r1);

    public abstract void q(int r1);

    public abstract void r(android.os.Parcelable r1);

    public abstract void s(java.lang.String r1);

    public final void t(a.InterfaceC0289ng r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L7
            r3.s(r0)
            return
        L7:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L64
            java.lang.Class r1 = r3.b(r1)     // Catch: java.lang.ClassNotFoundException -> L64
            java.lang.String r1 = r1.getName()
            r3.s(r1)
            a.mg r1 = r3.a()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.reflect.Method r2 = r3.d(r2)     // Catch: java.lang.ClassNotFoundException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r2.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L2d java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r1.u()
            return
        L2d:
            r4 = move-exception
            goto L35
        L2f:
            r4 = move-exception
            goto L3d
        L31:
            r4 = move-exception
            goto L45
        L33:
            r4 = move-exception
            goto L5c
        L35:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered ClassNotFoundException"
            r0.<init>(r1, r4)
            throw r0
        L3d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered NoSuchMethodException"
            r0.<init>(r1, r4)
            throw r0
        L45:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L54
            java.lang.Throwable r4 = r4.getCause()
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L54:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered InvocationTargetException"
            r0.<init>(r1, r4)
            throw r0
        L5c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered IllegalAccessException"
            r0.<init>(r1, r4)
            throw r0
        L64:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r2 = " does not have a Parcelizer"
            java.lang.String r4 = r4.concat(r2)
            r1.<init>(r4, r0)
            throw r1
    }
}
