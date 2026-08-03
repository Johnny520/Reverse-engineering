package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6253 extends java.util.concurrent.CancellationException implements Yue.InterfaceC1631<Yue.C6253> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final transient Yue.InterfaceC3383 f22304;

    public C6253(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C6253(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4543 Yue.InterfaceC3383 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f22304 = r2
            return
    }

    @Override // Yue.InterfaceC1631
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ java.lang.Throwable mo7905() {
            r1 = this;
            Yue.ۥۢۡۤۨ r0 = r1.m23309()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6253 m23309() {
            r3 = this;
            Yue.ۥۢۡۤۨ r0 = new Yue.ۥۢۡۤۨ
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto La
            java.lang.String r1 = ""
        La:
            Yue.ۥ۠ۦ۟ۡ r2 = r3.f22304
            r0.<init>(r1, r2)
            r0.initCause(r3)
            return r0
    }
}
