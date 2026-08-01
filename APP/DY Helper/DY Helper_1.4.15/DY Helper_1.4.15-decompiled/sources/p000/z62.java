package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z62 extends android.os.Binder implements p000.qk0 {

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ androidx.core.content.UnusedAppRestrictionsBackportService f12992;

    public z62(androidx.core.content.UnusedAppRestrictionsBackportService r1) {
            r0 = this;
            r0.f12992 = r1
            r0.<init>()
            java.lang.String r1 = p000.qk0.f9027
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
            java.lang.String r0 = p000.qk0.f9027
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
            if (r4 == r1) goto L1d
            boolean r3 = super.onTransact(r4, r5, r6, r7)
            return r3
        L1d:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L25
            r4 = 0
            goto L3d
        L25:
            java.lang.String r5 = p000.pk0.f8588
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            if (r5 == 0) goto L35
            boolean r6 = r5 instanceof p000.pk0
            if (r6 == 0) goto L35
            r4 = r5
            pk0 r4 = (p000.pk0) r4
            goto L3d
        L35:
            ok0 r5 = new ok0
            r5.<init>()
            r5.f8129 = r4
            r4 = r5
        L3d:
            if (r4 != 0) goto L40
            return r1
        L40:
            androidx.core.content.UnusedAppRestrictionsBackportService r3 = r3.f12992
            r3.m417()
            return r1
    }
}
