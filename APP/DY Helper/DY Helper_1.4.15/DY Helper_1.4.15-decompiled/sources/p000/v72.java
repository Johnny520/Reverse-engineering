package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class v72 {

    /* JADX INFO: renamed from: α */
    public final p000.C0103c7 f11125;

    /* JADX INFO: renamed from: β */
    public final p000.C0103c7 f11126;

    /* JADX INFO: renamed from: γ */
    public final p000.C0103c7 f11127;

    public v72(p000.C0103c7 r1, p000.C0103c7 r2, p000.C0103c7 r3) {
            r0 = this;
            r0.<init>()
            r0.f11125 = r1
            r0.f11126 = r2
            r0.f11127 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public abstract p000.w72 mo6053();

    /* JADX INFO: renamed from: β */
    public final java.lang.Class m6054(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            c7 r3 = r3.f11127
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

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method m6055(java.lang.String r4) {
            r3 = this;
            c7 r3 = r3.f11125
            java.lang.Object r0 = r3.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L25
            java.lang.System.currentTimeMillis()
            r0 = 1
            java.lang.Class<v72> r1 = p000.v72.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r4, r0, r2)
            java.lang.String r2 = "read"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            r3.put(r4, r0)
        L25:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method m6056(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            c7 r1 = r3.f11126
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            java.lang.Class r3 = r3.m6054(r4)
            java.lang.System.currentTimeMillis()
            java.lang.Class<v72> r0 = p000.v72.class
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r0}
            java.lang.String r2 = "write"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r2, r0)
            java.lang.String r4 = r4.getName()
            r1.put(r4, r3)
            return r3
        L29:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public abstract boolean mo6057(int r1);

    /* JADX INFO: renamed from: ζ */
    public final android.os.Parcelable m6058(android.os.Parcelable r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo6057(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            w72 r0 = (p000.w72) r0
            java.lang.Class<w72> r1 = p000.w72.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcel r0 = r0.f11594
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final p000.x72 m6059() {
            r3 = this;
            r0 = r3
            w72 r0 = (p000.w72) r0
            android.os.Parcel r0 = r0.f11594
            java.lang.String r0 = r0.readString()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            w72 r2 = r3.mo6053()
            java.lang.reflect.Method r3 = r3.m6055(r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            x72 r3 = (p000.x72) r3     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            return r3
        L20:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered ClassNotFoundException"
            r0.<init>(r1, r3)
            throw r0
        L29:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered NoSuchMethodException"
            r0.<init>(r1, r3)
            throw r0
        L32:
            r3 = move-exception
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r3.getCause()
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L42:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered InvocationTargetException"
            r0.<init>(r1, r3)
            throw r0
        L4a:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered IllegalAccessException"
            r0.<init>(r1, r3)
            throw r0
    }

    /* JADX INFO: renamed from: θ */
    public abstract void mo6060(int r1);

    /* JADX INFO: renamed from: ι */
    public final void m6061(p000.x72 r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lb
            w72 r3 = (p000.w72) r3
            android.os.Parcel r3 = r3.f11594
            r3.writeString(r0)
            return
        Lb:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L81
            java.lang.Class r1 = r3.m6054(r1)     // Catch: java.lang.ClassNotFoundException -> L81
            java.lang.String r1 = r1.getName()
            r2 = r3
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            r2.writeString(r1)
            w72 r1 = r3.mo6053()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            java.lang.reflect.Method r3 = r3.m6056(r2)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            r3.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            android.os.Parcel r3 = r1.f11594
            int r4 = r1.f11598
            if (r4 < 0) goto L4d
            android.util.SparseIntArray r0 = r1.f11593
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
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r4.<init>(r0, r3)
            throw r4
        L57:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r4.<init>(r0, r3)
            throw r4
        L60:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof java.lang.RuntimeException
            if (r4 == 0) goto L70
            java.lang.Throwable r3 = r3.getCause()
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L70:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r4.<init>(r0, r3)
            throw r4
        L78:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r4.<init>(r0, r3)
            throw r4
        L81:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r1 = " does not have a Parcelizer"
            java.lang.String r4 = r4.concat(r1)
            r0.<init>(r4, r3)
            throw r0
    }
}
