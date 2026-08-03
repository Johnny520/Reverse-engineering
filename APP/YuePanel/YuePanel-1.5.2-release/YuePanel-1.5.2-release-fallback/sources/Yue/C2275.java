package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2275 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۢ$ۥ, reason: contains not printable characters */
    public static class ExecutorC2276 implements java.util.concurrent.Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.os.Handler f7060;

        public ExecutorC2276(@Yue.InterfaceC4410 android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = Yue.C4868.m19181(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.f7060 = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@Yue.InterfaceC4410 java.lang.Runnable r3) {
                r2 = this;
                android.os.Handler r0 = r2.f7060
                java.lang.Object r3 = Yue.C4868.m19181(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto Lf
                return
            Lf:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.f7060
                r0.append(r1)
                java.lang.String r1 = " is shutting down"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    public C2275() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.concurrent.Executor m10520(@Yue.InterfaceC4410 android.os.Handler r1) {
            Yue.ۥۣ۠ۡۢ$ۥ r0 = new Yue.ۥۣ۠ۡۢ$ۥ
            r0.<init>(r1)
            return r0
    }
}
