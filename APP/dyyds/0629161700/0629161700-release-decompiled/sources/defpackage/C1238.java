package defpackage;

/* JADX INFO: renamed from: ᛷᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1238 implements defpackage.InterfaceC0801 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.os.IBinder f5545;

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.f5545
            return r0
    }

    @Override // defpackage.InterfaceC0801
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo540(java.lang.String[] r3) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = defpackage.InterfaceC0801.f3701     // Catch: java.lang.Throwable -> L17
            r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
            r0.writeStringArray(r3)     // Catch: java.lang.Throwable -> L17
            android.os.IBinder r2 = r2.f5545     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r1 = 1
            r2.transact(r1, r0, r3, r1)     // Catch: java.lang.Throwable -> L17
            r0.recycle()
            return
        L17:
            r2 = move-exception
            r0.recycle()
            throw r2
    }
}
