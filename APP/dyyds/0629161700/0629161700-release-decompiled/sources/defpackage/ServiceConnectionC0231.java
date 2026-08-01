package defpackage;

/* JADX INFO: renamed from: ᛲᛱᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0231 implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1675 f1402;

    public ServiceConnectionC0231(defpackage.C1675 r1) {
            r0 = this;
            r0.<init>()
            r0.f1402 = r1
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
            r1 = this;
            int r2 = defpackage.BinderC1374.f6005
            java.lang.String r2 = defpackage.InterfaceC0228.f1387
            android.os.IInterface r2 = r3.queryLocalInterface(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof defpackage.InterfaceC0228
            if (r0 == 0) goto L11
            ᛱᲈᲈᛴ r2 = (defpackage.InterfaceC0228) r2
            goto L18
        L11:
            ᛴᛷᛵᛸ r2 = new ᛴᛷᛵᛸ
            r2.<init>()
            r2.f3357 = r3
        L18:
            ᲀᛵᛶᛱ r1 = r1.f1402
            r1.f7477 = r2
            ᛱᛴᛷᛳ r3 = r1.f7474     // Catch: android.os.RemoteException -> L27
            java.lang.String r0 = r1.f7473     // Catch: android.os.RemoteException -> L27
            int r2 = r2.mo836(r3, r0)     // Catch: android.os.RemoteException -> L27
            r1.f7476 = r2     // Catch: android.os.RemoteException -> L27
            return
        L27:
            r1 = move-exception
            java.lang.String r2 = "ROOM"
            java.lang.String r3 = "Cannot register multi-instance invalidation callback"
            android.util.Log.w(r2, r3, r1)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            ᲀᛵᛶᛱ r0 = r0.f1402
            r1 = 0
            r0.f7477 = r1
            return
    }
}
