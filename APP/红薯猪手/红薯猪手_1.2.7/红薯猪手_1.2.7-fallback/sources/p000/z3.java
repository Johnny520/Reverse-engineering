package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class z3 extends android.os.Binder implements android.os.IInterface {
    public z3() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationService"
            r1.attachInterface(r1, r0)
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            r4 = this;
            java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationService"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L71
            r3 = 2
            if (r5 == r3) goto L2c
            r1 = 3
            if (r5 == r1) goto L1a
            r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 == r1) goto L16
            boolean r5 = super.onTransact(r5, r6, r7, r8)
            return r5
        L16:
            r7.writeString(r0)
            return r2
        L1a:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            java.lang.String[] r6 = r6.createStringArray()
            r7 = r4
            androidx.room.MultiInstanceInvalidationService$b r7 = (androidx.room.MultiInstanceInvalidationService.b) r7
            r7.m0(r5, r6)
            return r2
        L2c:
            r6.enforceInterface(r0)
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L36
            goto L4b
        L36:
            java.lang.String r8 = "androidx.room.IMultiInstanceInvalidationCallback"
            android.os.IInterface r8 = r5.queryLocalInterface(r8)
            if (r8 == 0) goto L46
            boolean r0 = r8 instanceof p000.y3
            if (r0 == 0) goto L46
            r1 = r8
            ۟.y3 r1 = (p000.y3) r1
            goto L4b
        L46:
            ۟.y3$a$a r1 = new ۟.y3$a$a
            r1.<init>(r5)
        L4b:
            int r5 = r6.readInt()
            r6 = r4
            androidx.room.MultiInstanceInvalidationService$b r6 = (androidx.room.MultiInstanceInvalidationService.b) r6
            androidx.room.MultiInstanceInvalidationService r8 = r6.f5
            androidx.room.MultiInstanceInvalidationService$a r8 = r8.f2
            monitor-enter(r8)
            androidx.room.MultiInstanceInvalidationService r0 = r6.f5     // Catch: java.lang.Throwable -> L6e
            androidx.room.MultiInstanceInvalidationService$a r0 = r0.f2     // Catch: java.lang.Throwable -> L6e
            r0.unregister(r1)     // Catch: java.lang.Throwable -> L6e
            androidx.room.MultiInstanceInvalidationService r6 = r6.f5     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap<java.lang.Integer, java.lang.String> r6 = r6.f1     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L6e
            r6.remove(r5)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6e
            r7.writeNoException()
            return r2
        L6e:
            r5 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6e
            throw r5
        L71:
            r6.enforceInterface(r0)
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L7b
            goto L90
        L7b:
            java.lang.String r8 = "androidx.room.IMultiInstanceInvalidationCallback"
            android.os.IInterface r8 = r5.queryLocalInterface(r8)
            if (r8 == 0) goto L8b
            boolean r0 = r8 instanceof p000.y3
            if (r0 == 0) goto L8b
            r1 = r8
            ۟.y3 r1 = (p000.y3) r1
            goto L90
        L8b:
            ۟.y3$a$a r1 = new ۟.y3$a$a
            r1.<init>(r5)
        L90:
            java.lang.String r5 = r6.readString()
            r6 = r4
            androidx.room.MultiInstanceInvalidationService$b r6 = (androidx.room.MultiInstanceInvalidationService.b) r6
            int r5 = r6.m1(r1, r5)
            r7.writeNoException()
            r7.writeInt(r5)
            return r2
    }
}
