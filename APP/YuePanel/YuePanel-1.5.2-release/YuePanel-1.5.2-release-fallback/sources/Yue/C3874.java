package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3874 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f12340 = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f12341 = false;

    static {
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.C4225 m15626(java.lang.Throwable r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            throw r0
        L3:
            m15630()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C4225 m15627(java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = r0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            Yue.ۥۡۡۡۨ r1 = m15626(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m15628() {
            return
    }

    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m15629(@Yue.InterfaceC4418 Yue.AbstractC3862 r0) {
            Yue.ۥ۠ۨۥۥ r0 = r0.mo12588()
            boolean r0 = r0 instanceof Yue.C4225
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Void m15630() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.AbstractC3862 m15631(@Yue.InterfaceC4418 Yue.InterfaceC3871 r0, @Yue.InterfaceC4418 java.util.List<? extends Yue.InterfaceC3871> r1) {
            Yue.ۥ۠ۨۥۥ r0 = r0.mo1410(r1)     // Catch: java.lang.Throwable -> L5
            goto Le
        L5:
            r1 = move-exception
            java.lang.String r0 = r0.mo1409()
            Yue.ۥۡۡۡۨ r0 = m15626(r1, r0)
        Le:
            return r0
    }
}
