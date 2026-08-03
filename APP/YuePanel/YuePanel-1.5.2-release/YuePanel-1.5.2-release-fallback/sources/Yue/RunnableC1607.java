package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1607 extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<Yue.C6593> f5021;

    public RunnableC1607(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f5021 = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L15
            Yue.ۥ۟ۧۤۢ<Yue.ۥۣۢ۠ۤ> r0 = r2.f5021
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            java.lang.Object r1 = Yue.C5388.m20377(r1)
            r0.resumeWith(r1)
        L15:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationRunnable(ran = "
            r0.append(r1)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
