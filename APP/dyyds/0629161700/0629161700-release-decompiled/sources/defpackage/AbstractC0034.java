package defpackage;

/* JADX INFO: renamed from: ᛱᛲᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0034 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1499 f531;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1499 f532;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1499 f533;

    public AbstractC0034(defpackage.C1499 r1, defpackage.C1499 r2, defpackage.C1499 r3) {
            r0 = this;
            r0.<init>()
            r0.f532 = r1
            r0.f533 = r2
            r0.f531 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public abstract void mo348(int r1);

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m349(defpackage.InterfaceC1905 r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lb
            ᛸᲁᲈᛳ r3 = (defpackage.C1576) r3
            android.os.Parcel r3 = r3.f6985
            r3.writeString(r0)
            return
        Lb:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L79
            java.lang.Class r1 = r3.m354(r1)     // Catch: java.lang.ClassNotFoundException -> L79
            java.lang.String r1 = r1.getName()
            r2 = r3
            ᛸᲁᲈᛳ r2 = (defpackage.C1576) r2
            android.os.Parcel r2 = r2.f6985
            r2.writeString(r1)
            ᛸᲁᲈᛳ r1 = r3.mo353()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            java.lang.reflect.Method r3 = r3.m351(r2)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            r3.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            android.os.Parcel r3 = r1.f6985
            int r4 = r1.f6984
            if (r4 < 0) goto L4d
            android.util.SparseIntArray r0 = r1.f6986
            int r4 = r0.get(r4)
            int r0 = r3.dataPosition()
            int r1 = r0 - r4
            r3.setDataPosition(r4)
            r3.writeInt(r1)
            r3.setDataPosition(r0)
        L4d:
            return
        L4e:
            r3 = move-exception
            java.lang.String r4 = "VersionedParcel encountered ClassNotFoundException"
            defpackage.C0086.m548(r4, r3)
            return
        L55:
            r3 = move-exception
            java.lang.String r4 = "VersionedParcel encountered NoSuchMethodException"
            defpackage.C0086.m548(r4, r3)
            return
        L5c:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof java.lang.RuntimeException
            if (r4 != 0) goto L6b
            java.lang.String r4 = "VersionedParcel encountered InvocationTargetException"
            defpackage.C0086.m548(r4, r3)
            return
        L6b:
            java.lang.Throwable r3 = r3.getCause()
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L72:
            r3 = move-exception
            java.lang.String r4 = "VersionedParcel encountered IllegalAccessException"
            defpackage.C0086.m548(r4, r3)
            return
        L79:
            r3 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r0 = " does not have a Parcelizer"
            java.lang.String r4 = r4.concat(r0)
            defpackage.C0086.m548(r4, r3)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public abstract boolean mo350(int r1);

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.reflect.Method m351(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            ᛸᛶᛱᛲ r1 = r3.f533
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            java.lang.Class r3 = r3.m354(r4)
            java.lang.System.currentTimeMillis()
            java.lang.Class<ᛱᛲᛵᲇ> r0 = defpackage.AbstractC0034.class
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r0}
            java.lang.String r2 = "write"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r2, r0)
            java.lang.String r4 = r4.getName()
            r1.put(r4, r3)
            return r3
        L29:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Method m352(java.lang.String r4) {
            r3 = this;
            ᛸᛶᛱᛲ r3 = r3.f532
            java.lang.Object r0 = r3.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L25
            java.lang.System.currentTimeMillis()
            java.lang.Class<ᛱᛲᛵᲇ> r0 = defpackage.AbstractC0034.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r2 = 1
            java.lang.Class r1 = java.lang.Class.forName(r4, r2, r1)
            java.lang.String r2 = "read"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)
            r3.put(r4, r0)
        L25:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public abstract defpackage.C1576 mo353();

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Class m354(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            ᛸᛶᛱᛲ r3 = r3.f531
            java.lang.Object r0 = r3.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L43
            java.lang.Package r0 = r4.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r4.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "."
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "Parcelizer"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            java.lang.ClassLoader r2 = r4.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)
            java.lang.String r4 = r4.getName()
            r3.put(r4, r0)
        L43:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.os.Parcelable m355(android.os.Parcelable r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo350(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            ᛸᲁᲈᛳ r0 = (defpackage.C1576) r0
            java.lang.Class<ᛸᲁᲈᛳ> r1 = defpackage.C1576.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcel r0 = r0.f6985
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC1905 m356() {
            r3 = this;
            r0 = r3
            ᛸᲁᲈᛳ r0 = (defpackage.C1576) r0
            android.os.Parcel r0 = r0.f6985
            java.lang.String r0 = r0.readString()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            ᛸᲁᲈᛳ r2 = r3.mo353()
            java.lang.reflect.Method r3 = r3.m352(r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            ᲁᛸᲇᛸ r3 = (defpackage.InterfaceC1905) r3     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r3
        L20:
            r3 = move-exception
            goto L28
        L22:
            r3 = move-exception
            goto L2e
        L24:
            r3 = move-exception
            goto L34
        L26:
            r3 = move-exception
            goto L49
        L28:
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            defpackage.C0086.m548(r0, r3)
            return r1
        L2e:
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            defpackage.C0086.m548(r0, r3)
            return r1
        L34:
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L42
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            defpackage.C0086.m548(r0, r3)
            return r1
        L42:
            java.lang.Throwable r3 = r3.getCause()
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L49:
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            defpackage.C0086.m548(r0, r3)
            return r1
    }
}
