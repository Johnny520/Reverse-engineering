package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2372 extends java.io.IOException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.File f7764;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.io.File f7765;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f7766;

    public C2372(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4543 java.io.File r3, @Yue.InterfaceC4543 java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = Yue.C2265.m10464(r2, r3, r4)
            r1.<init>(r0)
            r1.f7764 = r2
            r1.f7765 = r3
            r1.f7766 = r4
            return
    }

    public /* synthetic */ C2372(java.io.File r2, java.io.File r3, java.lang.String r4, int r5, Yue.C1769 r6) {
            r1 = this;
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            r1.<init>(r2, r3, r4)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.io.File m10946() {
            r1 = this;
            java.io.File r0 = r1.f7764
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.io.File m10947() {
            r1 = this;
            java.io.File r0 = r1.f7765
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String m10948() {
            r1 = this;
            java.lang.String r0 = r1.f7766
            return r0
    }
}
