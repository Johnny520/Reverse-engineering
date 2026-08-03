package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6116 extends Yue.AbstractRunnableC6112 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final java.lang.Runnable f22062;

    public C6116(@Yue.InterfaceC4418 java.lang.Runnable r1, long r2, @Yue.InterfaceC4418 Yue.InterfaceC6113 r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.f22062 = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Runnable r0 = r2.f22062     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            Yue.ۥۢ۠ۨۨ r0 = r2.f22060
            r0.mo14526()
            return
        Lb:
            r0 = move-exception
            Yue.ۥۢ۠ۨۨ r1 = r2.f22060
            r1.mo14526()
            throw r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Task["
            r0.append(r1)
            java.lang.Runnable r1 = r4.f22062
            java.lang.String r1 = Yue.C1758.m8350(r1)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.Runnable r1 = r4.f22062
            java.lang.String r1 = Yue.C1758.m8351(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.f22059
            r0.append(r2)
            r0.append(r1)
            Yue.ۥۢ۠ۨۨ r1 = r4.f22060
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
