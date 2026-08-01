package defpackage;

/* JADX INFO: renamed from: ᛷᛶᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1295 extends android.os.Binder implements android.os.IInterface {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1226 f5755;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2181 f5756;

    public BinderC1295(defpackage.C1226 r1, defpackage.C2181 r2) {
            r0 = this;
            r0.f5756 = r2
            r0.f5755 = r1
            r0.<init>()
            java.lang.String r1 = "io.github.libxposed.service.IHotReloadCallback"
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto Ld
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 > r1) goto Ld
            java.lang.String r1 = "io.github.libxposed.service.IHotReloadCallback"
            r4.enforceInterface(r1)
        Ld:
            r1 = 2
            if (r3 == r1) goto L15
            boolean r2 = super.onTransact(r3, r4, r5, r6)
            return r2
        L15:
            int r3 = r4.readInt()
            java.lang.String r4 = r4.readString()
            ᲈᛱᲇᛲ r5 = r2.f5756     // Catch: java.lang.Throwable -> L57
            ᛷᛲᛵᛳ r6 = r2.f5755     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L45
            if (r3 == r0) goto L42
            if (r3 == r1) goto L3f
            r1 = 3
            if (r3 == r1) goto L3c
            r1 = 4
            if (r3 != r1) goto L30
            ᲇᛴᲀᛸ r3 = defpackage.EnumC2042.f8811     // Catch: java.lang.Throwable -> L57
            goto L47
        L30:
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Invalid hot reload status code: "
            java.lang.String r3 = defpackage.AbstractC1124.m2145(r3, r5)     // Catch: java.lang.Throwable -> L57
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L57
        L3c:
            ᲇᛴᲀᛸ r3 = defpackage.EnumC2042.f8810     // Catch: java.lang.Throwable -> L57
            goto L47
        L3f:
            ᲇᛴᲀᛸ r3 = defpackage.EnumC2042.f8807     // Catch: java.lang.Throwable -> L57
            goto L47
        L42:
            ᲇᛴᲀᛸ r3 = defpackage.EnumC2042.f8808     // Catch: java.lang.Throwable -> L57
            goto L47
        L45:
            ᲇᛴᲀᛸ r3 = defpackage.EnumC2042.f8809     // Catch: java.lang.Throwable -> L57
        L47:
            ᛱᲇᛳᲇ r1 = new ᛱᲇᛳᲇ     // Catch: java.lang.Throwable -> L57
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L57
            com.ss.android.ugc.awemes.MainActivity r3 = r5.f9265     // Catch: java.lang.Throwable -> L57
            com.ss.android.ugc.awemes.MainActivity.m295(r3, r6, r1)     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = defpackage.C1851.f8086
            r3.remove(r2)
            return r0
        L57:
            r3 = move-exception
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = defpackage.C1851.f8086
            r4.remove(r2)
            throw r3
    }
}
