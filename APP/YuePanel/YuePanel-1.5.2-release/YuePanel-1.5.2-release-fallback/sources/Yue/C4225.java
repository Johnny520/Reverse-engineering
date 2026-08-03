package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4225 extends Yue.AbstractC3862 implements Yue.InterfaceC1802 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Throwable f13076;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f13077;

    public C4225(@Yue.InterfaceC4543 java.lang.Throwable r1, @Yue.InterfaceC4543 java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f13076 = r1
            r0.f13077 = r2
            return
    }

    public /* synthetic */ C4225(java.lang.Throwable r1, java.lang.String r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Override // Yue.AbstractC1643
    public /* bridge */ /* synthetic */ void dispatch(Yue.InterfaceC1632 r1, java.lang.Runnable r2) {
            r0 = this;
            r0.m16505(r1, r2)
            return
    }

    @Override // Yue.AbstractC1643
    public boolean isDispatchNeeded(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            r0 = this;
            r0.m16506()
            Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC3862, Yue.AbstractC1643
    @Yue.InterfaceC4418
    public Yue.AbstractC1643 limitedParallelism(int r1) {
            r0 = this;
            r0.m16506()
            Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC3862, Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dispatchers.Main[missing"
            r0.append(r1)
            java.lang.Throwable r1 = r3.f13076
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", cause="
            r1.append(r2)
            java.lang.Throwable r2 = r3.f13076
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L24
        L22:
            java.lang.String r1 = ""
        L24:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.Object mo8485(long r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r3) {
            r0 = this;
            r0.m16506()
            Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
            r1.<init>()
            throw r1
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public Yue.InterfaceC1892 mo8438(long r1, @Yue.InterfaceC4418 java.lang.Runnable r3, @Yue.InterfaceC4418 Yue.InterfaceC1632 r4) {
            r0 = this;
            r0.m16506()
            Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
            r1.<init>()
            throw r1
    }

    @Override // Yue.InterfaceC1802
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public /* bridge */ /* synthetic */ void mo8486(long r1, Yue.InterfaceC0932 r3) {
            r0 = this;
            r0.m16507(r1, r3)
            return
    }

    @Override // Yue.AbstractC3862
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public Yue.AbstractC3862 mo12588() {
            r0 = this;
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public java.lang.Void m16505(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            r0.m16506()
            Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final java.lang.Void m16506() {
            r4 = this;
            java.lang.Throwable r0 = r4.f13076
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f13077
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f13076
            r1.<init>(r0, r2)
            throw r1
        L36:
            Yue.C3874.m15630()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public java.lang.Void m16507(long r1, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super Yue.C6593> r3) {
            r0 = this;
            r0.m16506()
            Yue.ۥ۠ۦۧۤ r1 = new Yue.ۥ۠ۦۧۤ
            r1.<init>()
            throw r1
    }
}
