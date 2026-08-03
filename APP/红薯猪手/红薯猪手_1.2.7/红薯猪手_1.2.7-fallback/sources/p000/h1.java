package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends p000.ob {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object f424;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.concurrent.ExecutorService f425;

    public class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.concurrent.atomic.AtomicInteger f426;

        public a() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.f426 = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r4)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.util.concurrent.atomic.AtomicInteger r1 = r3.f426
                int r1 = r1.getAndIncrement()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r4[r2] = r1
                java.lang.String r1 = "arch_disk_io_%d"
                java.lang.String r4 = java.lang.String.format(r1, r4)
                r0.setName(r4)
                return r0
        }
    }

    public h1() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f424 = r0
            ۟.h1$a r0 = new ۟.h1$a
            r0.<init>()
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.f425 = r0
            return
    }
}
