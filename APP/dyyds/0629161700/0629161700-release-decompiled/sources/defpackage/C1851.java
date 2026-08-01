package defpackage;

/* JADX INFO: renamed from: ᲁᛴᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1851 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f8086 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC0132 f8087;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            defpackage.C1851.f8086 = r0
            return
    }

    public C1851(defpackage.InterfaceC0132 r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f8087 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m3259(defpackage.C1226 r4, defpackage.C2181 r5) {
            r3 = this;
            r0 = 102(0x66, float:1.43E-43)
            int r1 = r3.m3263()
            if (r1 < r0) goto L2d
            ᛷᛶᲀᛴ r0 = new ᛷᛶᲀᛴ
            r0.<init>(r4, r5)
            java.util.concurrent.ConcurrentHashMap$KeySetView r5 = defpackage.C1851.f8086
            r5.add(r0)
            ᛱᛷᲀᛸ r3 = r3.f8087     // Catch: java.lang.RuntimeException -> L1c android.os.RemoteException -> L1e
            long r1 = r4.f5519     // Catch: java.lang.RuntimeException -> L1c android.os.RemoteException -> L1e
            ᲁᲇᛴᲀ r3 = (defpackage.C1943) r3     // Catch: java.lang.RuntimeException -> L1c android.os.RemoteException -> L1e
            r3.m3358(r1, r0)     // Catch: java.lang.RuntimeException -> L1c android.os.RemoteException -> L1e
            return
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            r3 = move-exception
            goto L24
        L20:
            r5.remove(r0)
            throw r3
        L24:
            r5.remove(r0)
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ
            r4.<init>(r3)
            throw r4
        L2d:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Requires Xposed service API 102"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final long m3260() {
            r4 = this;
            ᛱᛷᲀᛸ r4 = r4.f8087     // Catch: android.os.RemoteException -> L2e
            ᲁᲇᛴᲀ r4 = (defpackage.C1943) r4     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
            android.os.IBinder r4 = r4.f8458     // Catch: java.lang.Throwable -> L26
            r2 = 5
            r3 = 0
            r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            r1.readException()     // Catch: java.lang.Throwable -> L26
            long r2 = r1.readLong()     // Catch: java.lang.Throwable -> L26
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            return r2
        L26:
            r4 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            throw r4     // Catch: android.os.RemoteException -> L2e
        L2e:
            r4 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String m3261() {
            r4 = this;
            ᛱᛷᲀᛸ r4 = r4.f8087     // Catch: android.os.RemoteException -> L2e
            ᲁᲇᛴᲀ r4 = (defpackage.C1943) r4     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
            android.os.IBinder r4 = r4.f8458     // Catch: java.lang.Throwable -> L26
            r2 = 4
            r3 = 0
            r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            r1.readException()     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L26
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            return r4
        L26:
            r4 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            throw r4     // Catch: android.os.RemoteException -> L2e
        L2e:
            r4 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long m3262() {
            r4 = this;
            ᛱᛷᲀᛸ r4 = r4.f8087     // Catch: android.os.RemoteException -> L2e
            ᲁᲇᛴᲀ r4 = (defpackage.C1943) r4     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
            android.os.IBinder r4 = r4.f8458     // Catch: java.lang.Throwable -> L26
            r2 = 6
            r3 = 0
            r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            r1.readException()     // Catch: java.lang.Throwable -> L26
            long r2 = r1.readLong()     // Catch: java.lang.Throwable -> L26
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            return r2
        L26:
            r4 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            throw r4     // Catch: android.os.RemoteException -> L2e
        L2e:
            r4 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m3263() {
            r4 = this;
            ᛱᛷᲀᛸ r4 = r4.f8087     // Catch: android.os.RemoteException -> L2e
            ᲁᲇᛴᲀ r4 = (defpackage.C1943) r4     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
            android.os.IBinder r4 = r4.f8458     // Catch: java.lang.Throwable -> L26
            r2 = 2
            r3 = 0
            r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            r1.readException()     // Catch: java.lang.Throwable -> L26
            int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L26
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            return r4
        L26:
            r4 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            throw r4     // Catch: android.os.RemoteException -> L2e
        L2e:
            r4 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m3264() {
            r4 = this;
            ᛱᛷᲀᛸ r4 = r4.f8087     // Catch: android.os.RemoteException -> L2e
            ᲁᲇᛴᲀ r4 = (defpackage.C1943) r4     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2e
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
            android.os.IBinder r4 = r4.f8458     // Catch: java.lang.Throwable -> L26
            r2 = 3
            r3 = 0
            r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            r1.readException()     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L26
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            return r4
        L26:
            r4 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L2e
            r0.recycle()     // Catch: android.os.RemoteException -> L2e
            throw r4     // Catch: android.os.RemoteException -> L2e
        L2e:
            r4 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.List m3265() {
            r8 = this;
            r0 = 102(0x66, float:1.43E-43)
            int r1 = r8.m3263()
            if (r1 < r0) goto La4
            ᛱᛷᲀᛸ r8 = r8.f8087     // Catch: android.os.RemoteException -> L9d
            ᲁᲇᛴᲀ r8 = (defpackage.C1943) r8     // Catch: android.os.RemoteException -> L9d
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L9d
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L9d
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L95
            android.os.IBinder r8 = r8.f8458     // Catch: java.lang.Throwable -> L95
            r2 = 14
            r3 = 0
            r8.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L95
            r1.readException()     // Catch: java.lang.Throwable -> L95
            android.os.Parcelable$Creator<ᛴᛶᛴᲀ> r8 = defpackage.C0690.CREATOR     // Catch: java.lang.Throwable -> L95
            java.util.ArrayList r8 = r1.createTypedArrayList(r8)     // Catch: java.lang.Throwable -> L95
            r1.recycle()     // Catch: android.os.RemoteException -> L9d
            r0.recycle()     // Catch: android.os.RemoteException -> L9d
            if (r8 == 0) goto L8d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: android.os.RemoteException -> L9d
            int r1 = r8.size()     // Catch: android.os.RemoteException -> L9d
            r0.<init>(r1)     // Catch: android.os.RemoteException -> L9d
            java.util.Iterator r8 = r8.iterator()     // Catch: android.os.RemoteException -> L9d
        L3f:
            boolean r1 = r8.hasNext()     // Catch: android.os.RemoteException -> L9d
            if (r1 == 0) goto L88
            java.lang.Object r1 = r8.next()     // Catch: android.os.RemoteException -> L9d
            ᛴᛶᛴᲀ r1 = (defpackage.C0690) r1     // Catch: android.os.RemoteException -> L9d
            if (r1 == 0) goto L80
            java.lang.String r2 = r1.f3319     // Catch: android.os.RemoteException -> L9d
            if (r2 == 0) goto L78
            ᛷᛲᛵᛳ r3 = new ᛷᛲᛵᛳ     // Catch: android.os.RemoteException -> L9d
            long r4 = r1.f3318     // Catch: android.os.RemoteException -> L9d
            int r1 = r1.f3320     // Catch: android.os.RemoteException -> L9d
            r6 = 1
            if (r1 == 0) goto L71
            r7 = 2
            if (r1 == r6) goto L70
            r6 = 3
            if (r1 == r7) goto L71
            if (r1 != r6) goto L64
            r6 = 4
            goto L71
        L64:
            ᛸᛵᛳᲀ r8 = new ᛸᛵᛳᲀ     // Catch: android.os.RemoteException -> L9d
            java.lang.String r0 = "Invalid hooked target state: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r1, r0)     // Catch: android.os.RemoteException -> L9d
            r8.<init>(r0)     // Catch: android.os.RemoteException -> L9d
            throw r8     // Catch: android.os.RemoteException -> L9d
        L70:
            r6 = r7
        L71:
            r3.<init>(r4, r2, r6)     // Catch: android.os.RemoteException -> L9d
            r0.add(r3)     // Catch: android.os.RemoteException -> L9d
            goto L3f
        L78:
            ᛸᛵᛳᲀ r8 = new ᛸᛵᛳᲀ     // Catch: android.os.RemoteException -> L9d
            java.lang.String r0 = "Framework returns target with null processName"
            r8.<init>(r0)     // Catch: android.os.RemoteException -> L9d
            throw r8     // Catch: android.os.RemoteException -> L9d
        L80:
            ᛸᛵᛳᲀ r8 = new ᛸᛵᛳᲀ     // Catch: android.os.RemoteException -> L9d
            java.lang.String r0 = "Framework returns null target"
            r8.<init>(r0)     // Catch: android.os.RemoteException -> L9d
            throw r8     // Catch: android.os.RemoteException -> L9d
        L88:
            java.util.List r8 = java.util.Collections.unmodifiableList(r0)     // Catch: android.os.RemoteException -> L9d
            return r8
        L8d:
            ᛸᛵᛳᲀ r8 = new ᛸᛵᛳᲀ     // Catch: android.os.RemoteException -> L9d
            java.lang.String r0 = "Framework returns null"
            r8.<init>(r0)     // Catch: android.os.RemoteException -> L9d
            throw r8     // Catch: android.os.RemoteException -> L9d
        L95:
            r8 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L9d
            r0.recycle()     // Catch: android.os.RemoteException -> L9d
            throw r8     // Catch: android.os.RemoteException -> L9d
        L9d:
            r8 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r8)
            throw r0
        La4:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Requires Xposed service API 102"
            r8.<init>(r0)
            throw r8
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.ArrayList m3266() {
            r4 = this;
            ᛱᛷᲀᛸ r4 = r4.f8087     // Catch: android.os.RemoteException -> L2f
            ᲁᲇᛴᲀ r4 = (defpackage.C1943) r4     // Catch: android.os.RemoteException -> L2f
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2f
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L2f
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
            android.os.IBinder r4 = r4.f8458     // Catch: java.lang.Throwable -> L27
            r2 = 11
            r3 = 0
            r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L27
            r1.readException()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r4 = r1.createStringArrayList()     // Catch: java.lang.Throwable -> L27
            r1.recycle()     // Catch: android.os.RemoteException -> L2f
            r0.recycle()     // Catch: android.os.RemoteException -> L2f
            return r4
        L27:
            r4 = move-exception
            r1.recycle()     // Catch: android.os.RemoteException -> L2f
            r0.recycle()     // Catch: android.os.RemoteException -> L2f
            throw r4     // Catch: android.os.RemoteException -> L2f
        L2f:
            r4 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            r0.<init>(r4)
            throw r0
    }
}
