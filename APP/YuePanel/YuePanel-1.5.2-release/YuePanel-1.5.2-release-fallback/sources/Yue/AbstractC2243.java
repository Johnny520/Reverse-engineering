package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2243 extends Yue.AbstractC2237 {
    public AbstractC2243() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ */
    public abstract java.lang.Thread mo4683();

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ */
    public void mo8439(long r2, @Yue.InterfaceC4418 Yue.AbstractC2238.AbstractRunnableC2241 r4) {
            r1 = this;
            Yue.ۥ۟ۨۥۤ r0 = Yue.RunnableC1771.f5485
            r0.m10272(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final void m10283() {
            r2 = this;
            java.lang.Thread r0 = r2.mo4683()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L1c
            Yue.ۥ۟۟ۢۧ r1 = Yue.C0098.m539()
            if (r1 == 0) goto L16
            r1.m535(r0)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L1c
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L1c:
            return
    }
}
