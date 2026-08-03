package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5397<T> extends Yue.AbstractC3402 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0934<T> f20042;

    public C5397(@Yue.InterfaceC4418 Yue.C0934<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.f20042 = r1
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.mo4448(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Override // Yue.AbstractC1419
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo4448(@Yue.InterfaceC4543 java.lang.Throwable r3) {
            r2 = this;
            Yue.ۥ۠ۦ۠۟ r3 = r2.m14079()
            java.lang.Object r3 = r3.m14111()
            boolean r0 = r3 instanceof Yue.C1417
            if (r0 == 0) goto L20
            Yue.ۥۣ۟ۨ۠<T> r0 = r2.f20042
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            Yue.ۥ۟ۦۣۢ r3 = (Yue.C1417) r3
            java.lang.Throwable r3 = r3.f4520
            java.lang.Object r3 = Yue.C5391.m20390(r3)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            r0.resumeWith(r3)
            goto L2f
        L20:
            Yue.ۥۣ۟ۨ۠<T> r0 = r2.f20042
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C3409.m14169(r3)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            r0.resumeWith(r3)
        L2f:
            return
    }
}
