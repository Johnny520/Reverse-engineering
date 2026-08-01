package defpackage;

/* JADX INFO: renamed from: ᛴᛷᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0706 implements defpackage.InterfaceC0228 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.os.IBinder f3357;

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.f3357
            return r0
    }

    @Override // defpackage.InterfaceC0228
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo835(java.lang.String[] r3, int r4) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = defpackage.InterfaceC0228.f1387     // Catch: java.lang.Throwable -> L1b
            r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1b
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
            r0.writeStringArray(r3)     // Catch: java.lang.Throwable -> L1b
            android.os.IBinder r2 = r2.f3357     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r4 = 1
            r1 = 3
            r2.transact(r1, r0, r3, r4)     // Catch: java.lang.Throwable -> L1b
            r0.recycle()
            return
        L1b:
            r2 = move-exception
            r0.recycle()
            throw r2
    }

    @Override // defpackage.InterfaceC0228
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final int mo836(defpackage.InterfaceC0801 r4, java.lang.String r5) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = defpackage.InterfaceC0228.f1387     // Catch: java.lang.Throwable -> L28
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
            r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L28
            r0.writeString(r5)     // Catch: java.lang.Throwable -> L28
            android.os.IBinder r3 = r3.f3357     // Catch: java.lang.Throwable -> L28
            r4 = 1
            r5 = 0
            r3.transact(r4, r0, r1, r5)     // Catch: java.lang.Throwable -> L28
            r1.readException()     // Catch: java.lang.Throwable -> L28
            int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L28
            r1.recycle()
            r0.recycle()
            return r3
        L28:
            r3 = move-exception
            r1.recycle()
            r0.recycle()
            throw r3
    }
}
