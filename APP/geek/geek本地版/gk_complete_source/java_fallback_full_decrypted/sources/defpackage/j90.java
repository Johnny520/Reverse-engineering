package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j90 {
    public final defpackage.n6 a;
    public final defpackage.n6 b;
    public final defpackage.n6 c;

    public j90(defpackage.n6 r1, defpackage.n6 r2, defpackage.n6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public abstract defpackage.k90 a();

    public final java.lang.Class b(java.lang.Class r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            r1 = 0
            n6 r2 = r4.c
            java.lang.Object r0 = r2.getOrDefault(r0, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L44
            java.lang.Package r0 = r5.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r5.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "."
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "Parcelizer"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.lang.ClassLoader r3 = r5.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r3)
            java.lang.String r5 = r5.getName()
            r2.put(r5, r0)
        L44:
            return r0
    }

    public final java.lang.reflect.Method c(java.lang.String r5) {
            r4 = this;
            r0 = 0
            n6 r1 = r4.a
            java.lang.Object r0 = r1.getOrDefault(r5, r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L26
            java.lang.System.currentTimeMillis()
            r0 = 1
            java.lang.Class<j90> r2 = defpackage.j90.class
            java.lang.ClassLoader r3 = r2.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r5, r0, r3)
            java.lang.String r3 = "read"
            java.lang.Class[] r2 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            r1.put(r5, r0)
        L26:
            return r0
    }

    public final java.lang.reflect.Method d(java.lang.Class r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            r1 = 0
            n6 r2 = r4.b
            java.lang.Object r0 = r2.getOrDefault(r0, r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            java.lang.Class r0 = r4.b(r5)
            java.lang.System.currentTimeMillis()
            java.lang.Class<j90> r1 = defpackage.j90.class
            java.lang.Class[] r1 = new java.lang.Class[]{r5, r1}
            java.lang.String r3 = "write"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)
            java.lang.String r5 = r5.getName()
            r2.put(r5, r0)
        L29:
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
            k90 r1 = (defpackage.k90) r1
            java.lang.Class<k90> r2 = defpackage.k90.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcel r1 = r1.e
            android.os.Parcelable r1 = r1.readParcelable(r2)
            return r1
    }

    public final defpackage.l90 g() {
            r3 = this;
            r0 = r3
            k90 r0 = (defpackage.k90) r0
            android.os.Parcel r0 = r0.e
            java.lang.String r0 = r0.readString()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            k90 r2 = r3.a()
            java.lang.reflect.Method r0 = r3.c(r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            l90 r0 = (defpackage.l90) r0     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r0
        L20:
            r0 = move-exception
            goto L28
        L22:
            r0 = move-exception
            goto L30
        L24:
            r0 = move-exception
            goto L38
        L26:
            r0 = move-exception
            goto L4f
        L28:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered ClassNotFoundException"
            r1.<init>(r2, r0)
            throw r1
        L30:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered NoSuchMethodException"
            r1.<init>(r2, r0)
            throw r1
        L38:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L47
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L47:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered InvocationTargetException"
            r1.<init>(r2, r0)
            throw r1
        L4f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered IllegalAccessException"
            r1.<init>(r2, r0)
            throw r1
    }

    public abstract void h(int r1);

    public final void i(defpackage.l90 r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lc
            r4 = r3
            k90 r4 = (defpackage.k90) r4
            android.os.Parcel r4 = r4.e
            r4.writeString(r0)
            return
        Lc:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L86
            java.lang.Class r1 = r3.b(r1)     // Catch: java.lang.ClassNotFoundException -> L86
            java.lang.String r1 = r1.getName()
            r2 = r3
            k90 r2 = (defpackage.k90) r2
            android.os.Parcel r2 = r2.e
            r2.writeString(r1)
            k90 r1 = r3.a()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.reflect.Method r2 = r3.d(r2)     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            r2.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L4f java.lang.NoSuchMethodException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.IllegalAccessException -> L55
            android.os.Parcel r4 = r1.e
            int r0 = r1.i
            if (r0 < 0) goto L4e
            android.util.SparseIntArray r1 = r1.d
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
            goto L5f
        L53:
            r4 = move-exception
            goto L67
        L55:
            r4 = move-exception
            goto L7e
        L57:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered ClassNotFoundException"
            r0.<init>(r1, r4)
            throw r0
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered NoSuchMethodException"
            r0.<init>(r1, r4)
            throw r0
        L67:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L76
            java.lang.Throwable r4 = r4.getCause()
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L76:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered InvocationTargetException"
            r0.<init>(r1, r4)
            throw r0
        L7e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered IllegalAccessException"
            r0.<init>(r1, r4)
            throw r0
        L86:
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
