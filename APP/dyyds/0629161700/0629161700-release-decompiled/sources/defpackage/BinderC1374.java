package defpackage;

/* JADX INFO: renamed from: ᛷᲁᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1374 extends android.os.Binder implements defpackage.InterfaceC0228 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f6005 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f6006;

    public BinderC1374(androidx.room.MultiInstanceInvalidationService r1) {
            r0 = this;
            r0.f6006 = r1
            r0.<init>()
            java.lang.String r1 = defpackage.InterfaceC0228.f1387
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            r3 = this;
            java.lang.String r0 = defpackage.InterfaceC0228.f1387
            r1 = 1
            if (r4 < r1) goto Ld
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r2) goto Ld
            r5.enforceInterface(r0)
        Ld:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r4 != r2) goto L16
            r6.writeString(r0)
            return r1
        L16:
            r0 = 0
            if (r4 == r1) goto L70
            r2 = 2
            if (r4 == r2) goto L30
            r0 = 3
            if (r4 == r0) goto L24
            boolean r3 = super.onTransact(r4, r5, r6, r7)
            return r3
        L24:
            int r4 = r5.readInt()
            java.lang.String[] r5 = r5.createStringArray()
            r3.mo835(r5, r4)
            return r1
        L30:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L37
            goto L4e
        L37:
            java.lang.String r7 = defpackage.InterfaceC0801.f3701
            android.os.IInterface r7 = r4.queryLocalInterface(r7)
            if (r7 == 0) goto L47
            boolean r0 = r7 instanceof defpackage.InterfaceC0801
            if (r0 == 0) goto L47
            r0 = r7
            ᛴᲈᲇᛱ r0 = (defpackage.InterfaceC0801) r0
            goto L4e
        L47:
            ᛷᛳᛳ r0 = new ᛷᛳᛳ
            r0.<init>()
            r0.f5545 = r4
        L4e:
            int r4 = r5.readInt()
            androidx.room.MultiInstanceInvalidationService r3 = r3.f6006
            ᛶᛳᛶᛴ r5 = r3.f338
            monitor-enter(r5)
            ᛶᛳᛶᛴ r7 = r3.f338     // Catch: java.lang.Throwable -> L6d
            r7.unregister(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap r3 = r3.f339     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)
            r6.writeNoException()
            return r1
        L6d:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L70:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L77
            goto L8e
        L77:
            java.lang.String r7 = defpackage.InterfaceC0801.f3701
            android.os.IInterface r7 = r4.queryLocalInterface(r7)
            if (r7 == 0) goto L87
            boolean r0 = r7 instanceof defpackage.InterfaceC0801
            if (r0 == 0) goto L87
            r0 = r7
            ᛴᲈᲇᛱ r0 = (defpackage.InterfaceC0801) r0
            goto L8e
        L87:
            ᛷᛳᛳ r0 = new ᛷᛳᛳ
            r0.<init>()
            r0.f5545 = r4
        L8e:
            java.lang.String r4 = r5.readString()
            int r3 = r3.mo836(r0, r4)
            r6.writeNoException()
            r6.writeInt(r3)
            return r1
    }

    @Override // defpackage.InterfaceC0228
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo835(java.lang.String[] r8, int r9) {
            r7 = this;
            androidx.room.MultiInstanceInvalidationService r7 = r7.f6006
            ᛶᛳᛶᛴ r0 = r7.f338
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r7.f339     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.lang.String r7 = "ROOM"
            java.lang.String r8 = "Remote invalidation client ID not registered"
            android.util.Log.w(r7, r8)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r7 = move-exception
            goto L68
        L1e:
            ᛶᛳᛶᛴ r2 = r7.f338     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L1c
            r3 = 0
        L25:
            ᛶᛳᛶᛴ r4 = r7.f338
            if (r3 >= r2) goto L63
            java.lang.Object r4 = r4.getBroadcastCookie(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L50
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> L50
            java.util.LinkedHashMap r6 = r7.f339     // Catch: java.lang.Throwable -> L50
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L50
            if (r9 == r5) goto L5a
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L44
            goto L5a
        L44:
            ᛶᛳᛶᛴ r4 = r7.f338     // Catch: java.lang.Throwable -> L50 android.os.RemoteException -> L52
            android.os.IInterface r4 = r4.getBroadcastItem(r3)     // Catch: java.lang.Throwable -> L50 android.os.RemoteException -> L52
            ᛴᲈᲇᛱ r4 = (defpackage.InterfaceC0801) r4     // Catch: java.lang.Throwable -> L50 android.os.RemoteException -> L52
            r4.mo540(r8)     // Catch: java.lang.Throwable -> L50 android.os.RemoteException -> L52
            goto L5a
        L50:
            r8 = move-exception
            goto L5d
        L52:
            r4 = move-exception
            java.lang.String r5 = "ROOM"
            java.lang.String r6 = "Error invoking a remote callback"
            android.util.Log.w(r5, r6, r4)     // Catch: java.lang.Throwable -> L50
        L5a:
            int r3 = r3 + 1
            goto L25
        L5d:
            ᛶᛳᛶᛴ r7 = r7.f338     // Catch: java.lang.Throwable -> L1c
            r7.finishBroadcast()     // Catch: java.lang.Throwable -> L1c
            throw r8     // Catch: java.lang.Throwable -> L1c
        L63:
            r4.finishBroadcast()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L68:
            monitor-exit(r0)
            throw r7
    }

    @Override // defpackage.InterfaceC0228
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final int mo836(defpackage.InterfaceC0801 r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            androidx.room.MultiInstanceInvalidationService r5 = r5.f6006
            ᛶᛳᛶᛴ r1 = r5.f338
            monitor-enter(r1)
            int r2 = r5.f340     // Catch: java.lang.Throwable -> L26
            int r2 = r2 + 1
            r5.f340 = r2     // Catch: java.lang.Throwable -> L26
            ᛶᛳᛶᛴ r3 = r5.f338     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r3.register(r6, r4)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L28
            java.util.LinkedHashMap r5 = r5.f339     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L26
            r0 = r2
            goto L2e
        L26:
            r5 = move-exception
            goto L30
        L28:
            int r6 = r5.f340     // Catch: java.lang.Throwable -> L26
            int r6 = r6 + (-1)
            r5.f340 = r6     // Catch: java.lang.Throwable -> L26
        L2e:
            monitor-exit(r1)
            return r0
        L30:
            monitor-exit(r1)
            throw r5
    }
}
