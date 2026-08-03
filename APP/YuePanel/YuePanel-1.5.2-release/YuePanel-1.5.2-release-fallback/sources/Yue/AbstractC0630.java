package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0630<D> extends Yue.C3654<D> {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.String f1595 = "AsyncTaskLoader";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean f1596 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.util.concurrent.Executor f1597;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public volatile Yue.AbstractC0630<D>.RunnableC0631 f1598;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public volatile Yue.AbstractC0630<D>.RunnableC0631 f1599;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public long f1600;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public long f1601;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public android.os.Handler f1602;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۟$ۥ, reason: contains not printable characters */
    public final class RunnableC0631 extends Yue.AbstractC4228<java.lang.Void, java.lang.Void, D> implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final java.util.concurrent.CountDownLatch f1603;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public boolean f1604;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0630 f1605;

        public RunnableC0631(Yue.AbstractC0630 r2) {
                r1 = this;
                r1.f1605 = r2
                r1.<init>()
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
                r0 = 1
                r2.<init>(r0)
                r1.f1603 = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.f1604 = r0
                Yue.ۥۣ۟ۢ۟ r0 = r1.f1605
                r0.m4134()
                return
        }

        @Override // Yue.AbstractC4228
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ java.lang.Object mo4141(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Object r1 = r0.m4144(r1)
                return r1
        }

        @Override // Yue.AbstractC4228
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo4142(D r2) {
                r1 = this;
                Yue.ۥۣ۟ۢ۟ r0 = r1.f1605     // Catch: java.lang.Throwable -> Lb
                r0.m4132(r1, r2)     // Catch: java.lang.Throwable -> Lb
                java.util.concurrent.CountDownLatch r2 = r1.f1603
                r2.countDown()
                return
            Lb:
                r2 = move-exception
                java.util.concurrent.CountDownLatch r0 = r1.f1603
                r0.countDown()
                throw r2
        }

        @Override // Yue.AbstractC4228
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void mo4143(D r2) {
                r1 = this;
                Yue.ۥۣ۟ۢ۟ r0 = r1.f1605     // Catch: java.lang.Throwable -> Lb
                r0.m4133(r1, r2)     // Catch: java.lang.Throwable -> Lb
                java.util.concurrent.CountDownLatch r2 = r1.f1603
                r2.countDown()
                return
            Lb:
                r2 = move-exception
                java.util.concurrent.CountDownLatch r0 = r1.f1603
                r0.countDown()
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public D m4144(java.lang.Void... r2) {
                r1 = this;
                Yue.ۥۣ۟ۢ۟ r2 = r1.f1605     // Catch: Yue.C4644 -> L7
                java.lang.Object r2 = r2.m4138()     // Catch: Yue.C4644 -> L7
                return r2
            L7:
                r2 = move-exception
                boolean r0 = r1.m16519()
                if (r0 == 0) goto L10
                r2 = 0
                return r2
            L10:
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m4145() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.f1603     // Catch: java.lang.InterruptedException -> L5
                r0.await()     // Catch: java.lang.InterruptedException -> L5
            L5:
                return
        }
    }

    public AbstractC0630(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = Yue.AbstractC4228.f13096
            r1.<init>(r2, r0)
            return
    }

    public AbstractC0630(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = -10000(0xffffffffffffd8f0, double:NaN)
            r2.f1601 = r0
            r2.f1597 = r4
            return
    }

    @Override // Yue.C3654
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo4128(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            super.mo4128(r5, r6, r7, r8)
            Yue.ۥۣ۟ۢ۟<D>$ۥ r6 = r4.f1598
            java.lang.String r8 = " waiting="
            if (r6 == 0) goto L20
            r7.print(r5)
            java.lang.String r6 = "mTask="
            r7.print(r6)
            Yue.ۥۣ۟ۢ۟<D>$ۥ r6 = r4.f1598
            r7.print(r6)
            r7.print(r8)
            Yue.ۥۣ۟ۢ۟<D>$ۥ r6 = r4.f1598
            boolean r6 = r6.f1604
            r7.println(r6)
        L20:
            Yue.ۥۣ۟ۢ۟<D>$ۥ r6 = r4.f1599
            if (r6 == 0) goto L3b
            r7.print(r5)
            java.lang.String r6 = "mCancellingTask="
            r7.print(r6)
            Yue.ۥۣ۟ۢ۟<D>$ۥ r6 = r4.f1599
            r7.print(r6)
            r7.print(r8)
            Yue.ۥۣ۟ۢ۟<D>$ۥ r6 = r4.f1599
            boolean r6 = r6.f1604
            r7.println(r6)
        L3b:
            long r0 = r4.f1600
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L61
            r7.print(r5)
            java.lang.String r5 = "mUpdateThrottle="
            r7.print(r5)
            long r5 = r4.f1600
            Yue.C6239.m23255(r5, r7)
            java.lang.String r5 = " mLastLoadCompleteTime="
            r7.print(r5)
            long r5 = r4.f1601
            long r0 = android.os.SystemClock.uptimeMillis()
            Yue.C6239.m23254(r5, r0, r7)
            r7.println()
        L61:
            return
    }

    @Override // Yue.C3654
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo4129() {
            r4 = this;
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1598
            r1 = 0
            if (r0 == 0) goto L4b
            boolean r0 = r4.f11662
            if (r0 != 0) goto Lc
            r0 = 1
            r4.f11665 = r0
        Lc:
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1599
            r2 = 0
            if (r0 == 0) goto L25
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1598
            boolean r0 = r0.f1604
            if (r0 == 0) goto L22
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1598
            r0.f1604 = r1
            android.os.Handler r0 = r4.f1602
            Yue.ۥۣ۟ۢ۟<D>$ۥ r3 = r4.f1598
            r0.removeCallbacks(r3)
        L22:
            r4.f1598 = r2
            return r1
        L25:
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1598
            boolean r0 = r0.f1604
            if (r0 == 0) goto L39
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1598
            r0.f1604 = r1
            android.os.Handler r0 = r4.f1602
            Yue.ۥۣ۟ۢ۟<D>$ۥ r3 = r4.f1598
            r0.removeCallbacks(r3)
            r4.f1598 = r2
            return r1
        L39:
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r4.f1598
            boolean r0 = r0.m16512(r1)
            if (r0 == 0) goto L48
            Yue.ۥۣ۟ۢ۟<D>$ۥ r1 = r4.f1598
            r4.f1599 = r1
            r4.mo4131()
        L48:
            r4.f1598 = r2
            return r0
        L4b:
            return r1
    }

    @Override // Yue.C3654
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo4130() {
            r1 = this;
            super.mo4130()
            r1.m14777()
            Yue.ۥۣ۟ۢ۟$ۥ r0 = new Yue.ۥۣ۟ۢ۟$ۥ
            r0.<init>(r1)
            r1.f1598 = r0
            r1.m4134()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void mo4131() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m4132(Yue.AbstractC0630<D>.RunnableC0631 r1, D r2) {
            r0 = this;
            r0.mo4137(r2)
            Yue.ۥۣ۟ۢ۟<D>$ۥ r2 = r0.f1599
            if (r2 != r1) goto L19
            r0.m14792()
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.f1601 = r1
            r1 = 0
            r0.f1599 = r1
            r0.m14780()
            r0.m4134()
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m4133(Yue.AbstractC0630<D>.RunnableC0631 r3, D r4) {
            r2 = this;
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r2.f1598
            if (r0 == r3) goto L8
            r2.m4132(r3, r4)
            goto L21
        L8:
            boolean r3 = r2.m14784()
            if (r3 == 0) goto L12
            r2.mo4137(r4)
            goto L21
        L12:
            r2.m14778()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.f1601 = r0
            r3 = 0
            r2.f1598 = r3
            r2.mo8075(r4)
        L21:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m4134() {
            r6 = this;
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r6.f1599
            if (r0 != 0) goto L49
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r6.f1598
            if (r0 == 0) goto L49
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r6.f1598
            boolean r0 = r0.f1604
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r6.f1598
            r1 = 0
            r0.f1604 = r1
            android.os.Handler r0 = r6.f1602
            Yue.ۥۣ۟ۢ۟<D>$ۥ r1 = r6.f1598
            r0.removeCallbacks(r1)
        L1a:
            long r0 = r6.f1600
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.f1601
            long r4 = r6.f1600
            long r2 = r2 + r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L41
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r6.f1598
            r1 = 1
            r0.f1604 = r1
            android.os.Handler r0 = r6.f1602
            Yue.ۥۣ۟ۢ۟<D>$ۥ r1 = r6.f1598
            long r2 = r6.f1601
            long r4 = r6.f1600
            long r2 = r2 + r4
            r0.postAtTime(r1, r2)
            return
        L41:
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r6.f1598
            java.util.concurrent.Executor r1 = r6.f1597
            r2 = 0
            r0.m16514(r1, r2)
        L49:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean m4135() {
            r1 = this;
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r1.f1599
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public abstract D mo4136();

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void mo4137(@Yue.InterfaceC4544 D r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public D m4138() {
            r1 = this;
            java.lang.Object r0 = r1.mo4136()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m4139(long r3) {
            r2 = this;
            r2.f1600 = r3
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto Lf
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r2.f1602 = r3
        Lf:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m4140() {
            r1 = this;
            Yue.ۥۣ۟ۢ۟<D>$ۥ r0 = r1.f1598
            if (r0 == 0) goto L7
            r0.m4145()
        L7:
            return
    }
}
