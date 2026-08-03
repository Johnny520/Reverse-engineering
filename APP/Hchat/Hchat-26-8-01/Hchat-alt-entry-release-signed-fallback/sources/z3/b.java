package z3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.e f22520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.e f22521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.e f22522c;

    public b(f.e r1, f.e r2, f.e r3) {
            r0 = this;
            r0.<init>()
            r0.f22520a = r1
            r0.f22521b = r2
            r0.f22522c = r3
            return
    }

    public abstract z3.c a();

    public final java.lang.Class b(java.lang.Class r6) {
            r5 = this;
            java.lang.String r0 = r6.getName()
            f.e r1 = r5.f22522c
            java.lang.Object r0 = r1.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L32
            java.lang.Package r0 = r6.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = r6.getSimpleName()
            java.lang.String r3 = "."
            java.lang.String r4 = "Parcelizer"
            java.lang.String r0 = wb.en.i(r0, r3, r2, r4)
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r3)
            java.lang.String r6 = r6.getName()
            r1.put(r6, r0)
        L32:
            return r0
    }

    public final java.lang.reflect.Method c(java.lang.String r5) {
            r4 = this;
            f.e r0 = r4.f22520a
            java.lang.Object r1 = r0.get(r5)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L25
            java.lang.System.currentTimeMillis()
            r1 = 1
            java.lang.Class<z3.b> r2 = z3.b.class
            java.lang.ClassLoader r3 = r2.getClassLoader()
            java.lang.Class r1 = java.lang.Class.forName(r5, r1, r3)
            java.lang.String r3 = "read"
            java.lang.Class[] r2 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r2)
            r0.put(r5, r1)
        L25:
            return r1
    }

    public final java.lang.reflect.Method d(java.lang.Class r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            f.e r1 = r4.f22521b
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L28
            java.lang.Class r0 = r4.b(r5)
            java.lang.System.currentTimeMillis()
            java.lang.Class<z3.b> r2 = z3.b.class
            java.lang.Class[] r2 = new java.lang.Class[]{r5, r2}
            java.lang.String r3 = "write"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L28:
            return r0
    }

    public abstract boolean e(int r1);

    public final android.os.Parcelable f(android.os.Parcelable r1, int r2) {
            r0 = this;
            boolean r2 = r0.e(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            r1 = r0
            z3.c r1 = (z3.c) r1
            java.lang.Class<z3.c> r2 = z3.c.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcel r1 = r1.f22524e
            android.os.Parcelable r1 = r1.readParcelable(r2)
            return r1
    }

    public final z3.d g() {
            r3 = this;
            r0 = r3
            z3.c r0 = (z3.c) r0
            android.os.Parcel r0 = r0.f22524e
            java.lang.String r0 = r0.readString()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            z3.c r2 = r3.a()
            java.lang.reflect.Method r0 = r3.c(r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            z3.d r0 = (z3.d) r0     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r0
        L20:
            r0 = move-exception
            goto L28
        L22:
            r0 = move-exception
            goto L2f
        L24:
            r0 = move-exception
            goto L35
        L26:
            r0 = move-exception
            goto L4a
        L28:
            java.lang.String r1 = "VersionedParcel encountered ClassNotFoundException"
            ah.a.p(r1, r0)
        L2d:
            r0 = 0
            return r0
        L2f:
            java.lang.String r1 = "VersionedParcel encountered NoSuchMethodException"
            ah.a.p(r1, r0)
            goto L2d
        L35:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L43
            java.lang.String r1 = "VersionedParcel encountered InvocationTargetException"
            ah.a.p(r1, r0)
            goto L2d
        L43:
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L4a:
            java.lang.String r1 = "VersionedParcel encountered IllegalAccessException"
            ah.a.p(r1, r0)
            goto L2d
    }

    public abstract void h(int r1);

    public final void i(z3.d r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lc
            r4 = r3
            z3.c r4 = (z3.c) r4
            android.os.Parcel r4 = r4.f22524e
            r4.writeString(r0)
            return
        Lc:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L7e
            java.lang.Class r1 = r3.b(r1)     // Catch: java.lang.ClassNotFoundException -> L7e
            java.lang.String r1 = r1.getName()
            r2 = r3
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            r2.writeString(r1)
            z3.c r1 = r3.a()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.reflect.Method r2 = r3.d(r2)     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            r2.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            android.os.Parcel r4 = r1.f22524e
            int r0 = r1.f22528i
            if (r0 < 0) goto L4e
            android.util.SparseIntArray r1 = r1.f22523d
            int r0 = r1.get(r0)
            int r1 = r4.dataPosition()
            int r2 = r1 - r0
            r4.setDataPosition(r0)
            r4.writeInt(r2)
            r4.setDataPosition(r1)
        L4e:
            return
        L4f:
            r4 = move-exception
            goto L57
        L51:
            r4 = move-exception
            goto L5d
        L53:
            r4 = move-exception
            goto L63
        L55:
            r4 = move-exception
            goto L78
        L57:
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            ah.a.p(r0, r4)
            return
        L5d:
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            ah.a.p(r0, r4)
            return
        L63:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L71
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            ah.a.p(r0, r4)
            return
        L71:
            java.lang.Throwable r4 = r4.getCause()
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L78:
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            ah.a.p(r0, r4)
            return
        L7e:
            r0 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not have a Parcelizer"
            java.lang.String r4 = r4.concat(r1)
            ah.a.p(r4, r0)
            return
    }
}
