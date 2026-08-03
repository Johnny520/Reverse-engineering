package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6191 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC1632 f22168;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object[] f22169;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC6176<java.lang.Object>[] f22170;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f22171;

    public C6191(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f22168 = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.f22169 = r1
            Yue.ۥۢۡۡۤ[] r1 = new Yue.InterfaceC6176[r2]
            r0.f22170 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m23165(@Yue.InterfaceC4418 Yue.InterfaceC6176<?> r3, @Yue.InterfaceC4543 java.lang.Object r4) {
            r2 = this;
            java.lang.Object[] r0 = r2.f22169
            int r1 = r2.f22171
            r0[r1] = r4
            Yue.ۥۢۡۡۤ<java.lang.Object>[] r4 = r2.f22170
            int r0 = r1 + 1
            r2.f22171 = r0
            r4[r1] = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m23166(@Yue.InterfaceC4418 Yue.InterfaceC1632 r5) {
            r4 = this;
            Yue.ۥۢۡۡۤ<java.lang.Object>[] r0 = r4.f22170
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1c
        L7:
            int r1 = r0 + (-1)
            Yue.ۥۢۡۡۤ<java.lang.Object>[] r2 = r4.f22170
            r2 = r2[r0]
            Yue.C3329.m13903(r2)
            java.lang.Object[] r3 = r4.f22169
            r0 = r3[r0]
            r2.mo7937(r5, r0)
            if (r1 >= 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L7
        L1c:
            return
    }
}
