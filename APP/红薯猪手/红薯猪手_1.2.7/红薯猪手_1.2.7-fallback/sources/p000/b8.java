package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b8 extends java.util.concurrent.ThreadPoolExecutor {

    public static final class a extends java.util.concurrent.FutureTask<p000.c0> implements java.lang.Comparable<۟.b8.a> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.c0 f155;

        public a(p000.c0 r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.f155 = r2
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final int compareTo(۟.b8.a r4) {
                r3 = this;
                ۟.b8$a r4 = (۟.b8.a) r4
                ۟.c0 r0 = r3.f155
                int r1 = r0.f193
                ۟.c0 r4 = r4.f155
                int r2 = r4.f193
                if (r1 != r2) goto L12
                int r0 = r0.f175
                int r4 = r4.f175
                int r0 = r0 - r4
                goto L1c
            L12:
                int r4 = p000.c4.m109(r2)
                int r0 = p000.c4.m109(r1)
                int r0 = r4 - r0
            L1c:
                return r0
        }
    }

    public b8() {
            r8 = this;
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r6 = new java.util.concurrent.PriorityBlockingQueue
            r6.<init>()
            ۟.ic$b r7 = new ۟.ic$b
            r7.<init>()
            r1 = 3
            r2 = 3
            r3 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            ۟.b8$a r0 = new ۟.b8$a
            ۟.c0 r2 = (p000.c0) r2
            r0.<init>(r2)
            r1.execute(r0)
            return r0
    }
}
