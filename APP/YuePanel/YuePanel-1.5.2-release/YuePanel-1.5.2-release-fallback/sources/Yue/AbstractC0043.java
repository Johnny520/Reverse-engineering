package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3324
public abstract class AbstractC0043<T> extends Yue.C3403 implements Yue.InterfaceC3383, Yue.InterfaceC1598<T>, Yue.InterfaceC1662 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632 f101;

    public AbstractC0043(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            if (r2 == 0) goto L10
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r2 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r1.get(r2)
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            r0.m14112(r2)
        L10:
            Yue.ۥ۟ۧۦۥ r1 = r1.plus(r0)
            r0.f101 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m370() {
            return
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f101
            return r0
    }

    @Override // Yue.InterfaceC1662
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getCoroutineContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f101
            return r0
    }

    @Override // Yue.InterfaceC1598
    public final void resumeWith(@Yue.InterfaceC4418 java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r3 = Yue.C1423.m7054(r3, r0, r1, r0)
            java.lang.Object r3 = r2.m14120(r3)
            Yue.ۥۢ۠ۦۢ r0 = Yue.C3409.f10876
            if (r3 != r0) goto Lf
            return
        Lf:
            r2.mo376(r3)
            return
    }

    @Override // Yue.C3403, Yue.InterfaceC3383
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo371() {
            r1 = this;
            boolean r0 = super.mo371()
            return r0
    }

    @Override // Yue.C3403
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public java.lang.String mo372() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            java.lang.String r1 = " was cancelled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final void mo373(@Yue.InterfaceC4418 java.lang.Throwable r2) {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f101
            Yue.C1650.m7933(r0, r2)
            return
    }

    @Override // Yue.C3403
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public java.lang.String mo374() {
            r3 = this;
            Yue.ۥ۟ۧۦۥ r0 = r3.f101
            java.lang.String r0 = Yue.C1639.m7915(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = super.mo374()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\":"
            r1.append(r0)
            java.lang.String r0 = super.mo374()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public final void mo375(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C1417
            if (r0 == 0) goto L10
            Yue.ۥ۟ۦۣۢ r2 = (Yue.C1417) r2
            java.lang.Throwable r0 = r2.f4520
            boolean r2 = r2.m7041()
            r1.mo377(r0, r2)
            goto L13
        L10:
            r1.mo378(r2)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public void mo376(@Yue.InterfaceC4543 java.lang.Object r1) {
            r0 = this;
            r0.mo4680(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public void mo377(@Yue.InterfaceC4418 java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public void mo378(T r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public final <R> void m379(@Yue.InterfaceC4418 Yue.EnumC1666 r1, R r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r3) {
            r0 = this;
            r1.m8019(r3, r2, r0)
            return
    }
}
