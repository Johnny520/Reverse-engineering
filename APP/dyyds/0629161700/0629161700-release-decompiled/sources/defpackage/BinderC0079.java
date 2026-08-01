package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0079 extends android.os.Binder implements defpackage.InterfaceC0801 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1675 f816;

    public BinderC0079(defpackage.C1675 r1) {
            r0 = this;
            r0.f816 = r1
            r0.<init>()
            java.lang.String r1 = defpackage.InterfaceC0801.f3701
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
            java.lang.String r0 = defpackage.InterfaceC0801.f3701
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
            java.lang.String[] r4 = r5.createStringArray()
            r3.mo540(r4)
            return r1
    }

    @Override // defpackage.InterfaceC0801
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo540(java.lang.String[] r5) {
            r4 = this;
            ᲀᛵᛶᛱ r4 = r4.f816
            ᛷᲈᛳᛳ r0 = r4.f7471
            ᛲᛷᛶᛸ r1 = new ᛲᛷᛶᛸ
            r2 = 9
            r3 = 0
            r1.<init>(r5, r4, r3, r2)
            r4 = 3
            defpackage.AbstractC0397.m1149(r0, r3, r1, r4)
            return
    }
}
