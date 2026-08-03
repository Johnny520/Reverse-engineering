package a;

/* JADX INFO: loaded from: classes.dex */
public final class R4 extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f239a;

    public class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.concurrent.atomic.AtomicInteger f240a;

        public a() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.f240a = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "arch_disk_io_"
                r3.<init>(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.f240a
                int r1 = r1.getAndIncrement()
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                r0.setName(r3)
                return r0
        }
    }

    public R4() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f239a = r0
            a.R4$a r0 = new a.R4$a
            r0.<init>()
            r1 = 4
            java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            return
    }
}
