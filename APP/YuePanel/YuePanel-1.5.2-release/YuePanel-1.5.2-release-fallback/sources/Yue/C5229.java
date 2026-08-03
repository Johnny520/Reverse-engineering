package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5229 extends Yue.AbstractC5379 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f19630;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long f19631;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f19632;

    public C5229(@Yue.InterfaceC4543 java.lang.String r2, long r3, @Yue.InterfaceC4418 Yue.InterfaceC0849 r5) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.f19630 = r2
            r1.f19631 = r3
            r1.f19632 = r5
            return
    }

    @Override // Yue.AbstractC5379
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public long mo5163() {
            r2 = this;
            long r0 = r2.f19631
            return r0
    }

    @Override // Yue.AbstractC5379
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Yue.C4116 mo5164() {
            r2 = this;
            java.lang.String r0 = r2.f19630
            if (r0 == 0) goto Lb
            Yue.ۥۡ۠ۥۨ$ۥ r1 = Yue.C4116.f12664
            Yue.ۥۡ۠ۥۨ r0 = r1.m16153(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // Yue.AbstractC5379
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public Yue.InterfaceC0849 mo5165() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.f19632
            return r0
    }
}
