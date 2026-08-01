package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1943 implements defpackage.InterfaceC0132 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.os.IBinder f8458;

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.f8458
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3358(long r4, defpackage.BinderC1295 r6) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "io.github.libxposed.service.IXposedService"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
            r0.writeLong(r4)     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L28
            r0.writeStrongInterface(r6)     // Catch: java.lang.Throwable -> L28
            android.os.IBinder r3 = r3.f8458     // Catch: java.lang.Throwable -> L28
            r5 = 15
            r3.transact(r5, r0, r1, r4)     // Catch: java.lang.Throwable -> L28
            r1.readException()     // Catch: java.lang.Throwable -> L28
            r1.recycle()
            r0.recycle()
            return
        L28:
            r3 = move-exception
            r1.recycle()
            r0.recycle()
            throw r3
    }
}
