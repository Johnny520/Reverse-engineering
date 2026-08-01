package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t80 extends android.os.Binder implements android.os.IInterface {
    public final /* synthetic */ androidx.core.content.UnusedAppRestrictionsBackportService a;

    public t80(androidx.core.content.UnusedAppRestrictionsBackportService r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            java.lang.String r1 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
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
            java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
            r1 = 1
            if (r4 < r1) goto Ld
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r2) goto Ld
            r5.enforceInterface(r0)
        Ld:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r4 == r2) goto L42
            if (r4 == r1) goto L19
            boolean r4 = super.onTransact(r4, r5, r6, r7)
            return r4
        L19:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L21
            r4 = 0
            goto L39
        L21:
            java.lang.String r5 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            if (r5 == 0) goto L31
            boolean r6 = r5 instanceof defpackage.ro
            if (r6 == 0) goto L31
            r4 = r5
            ro r4 = (defpackage.ro) r4
            goto L39
        L31:
            ro r5 = new ro
            r5.<init>()
            r5.a = r4
            r4 = r5
        L39:
            if (r4 != 0) goto L3c
            return r1
        L3c:
            androidx.core.content.UnusedAppRestrictionsBackportService r4 = r3.a
            r4.a()
            return r1
        L42:
            r6.writeString(r0)
            return r1
    }
}
