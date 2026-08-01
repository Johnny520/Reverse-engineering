package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛶᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0668 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1001 f2279;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C1001 f2280;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1001 f2281;

    public AbstractC0668(xhss.C1001 r1, xhss.C1001 r2, xhss.C1001 r3) {
            r0 = this;
            r0.<init>()
            r0.f2281 = r1
            r0.f2279 = r2
            r0.f2280 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Class m1148(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            xhss.ᲇᛱᛱᛶ r3 = r3.f2280
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

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.reflect.Method m1149(java.lang.String r4) {
            r3 = this;
            xhss.ᲇᛱᛱᛶ r3 = r3.f2281
            java.lang.Object r0 = r3.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L25
            java.lang.System.currentTimeMillis()
            java.lang.Class<xhss.ᛷᛶᲀᲁ> r0 = xhss.AbstractC0668.class
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

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public abstract boolean mo232(int r1);

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public abstract xhss.C0076 mo233();

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1150(xhss.InterfaceC0440 r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lb
            xhss.ᛱᛸᛵᛳ r3 = (xhss.C0076) r3
            android.os.Parcel r3 = r3.f410
            r3.writeString(r0)
            return
        Lb:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L81
            java.lang.Class r1 = r3.m1148(r1)     // Catch: java.lang.ClassNotFoundException -> L81
            java.lang.String r1 = r1.getName()
            r2 = r3
            xhss.ᛱᛸᛵᛳ r2 = (xhss.C0076) r2
            android.os.Parcel r2 = r2.f410
            r2.writeString(r1)
            xhss.ᛱᛸᛵᛳ r1 = r3.mo233()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            java.lang.reflect.Method r3 = r3.m1152(r2)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            r3.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L57 java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L78
            android.os.Parcel r3 = r1.f410
            int r4 = r1.f411
            if (r4 < 0) goto L4d
            android.util.SparseIntArray r0 = r1.f415
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

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public abstract void mo234(int r1);

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.InterfaceC0440 m1151() {
            r3 = this;
            r0 = r3
            xhss.ᛱᛸᛵᛳ r0 = (xhss.C0076) r0
            android.os.Parcel r0 = r0.f410
            java.lang.String r0 = r0.readString()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            xhss.ᛱᛸᛵᛳ r2 = r3.mo233()
            java.lang.reflect.Method r3 = r3.m1149(r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
            xhss.ᛵᛲᛲᛴ r3 = (xhss.InterfaceC0440) r3     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L4a
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

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.reflect.Method m1152(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            xhss.ᲇᛱᛱᛶ r1 = r3.f2279
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            java.lang.Class r3 = r3.m1148(r4)
            java.lang.System.currentTimeMillis()
            java.lang.Class<xhss.ᛷᛶᲀᲁ> r0 = xhss.AbstractC0668.class
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r0}
            java.lang.String r2 = "write"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r2, r0)
            java.lang.String r4 = r4.getName()
            r1.put(r4, r3)
            return r3
        L29:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final android.os.Parcelable m1153(android.os.Parcelable r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo232(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            xhss.ᛱᛸᛵᛳ r0 = (xhss.C0076) r0
            java.lang.Class<xhss.ᛱᛸᛵᛳ> r1 = xhss.C0076.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcel r0 = r0.f410
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }
}
