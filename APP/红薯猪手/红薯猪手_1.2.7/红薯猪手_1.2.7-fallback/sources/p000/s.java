package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p000.ob {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile p000.s f947;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final ۟.s.a f948 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public p000.h1 f949;

    public static class a implements java.util.concurrent.Executor {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r3) {
                r2 = this;
                ۟.s r0 = p000.s.f947
                if (r0 == 0) goto L7
            L4:
                ۟.s r0 = p000.s.f947
                goto L17
            L7:
                java.lang.Class<۟.s> r0 = p000.s.class
                monitor-enter(r0)
                ۟.s r1 = p000.s.f947     // Catch: java.lang.Throwable -> L1f
                if (r1 != 0) goto L15
                ۟.s r1 = new ۟.s     // Catch: java.lang.Throwable -> L1f
                r1.<init>()     // Catch: java.lang.Throwable -> L1f
                p000.s.f947 = r1     // Catch: java.lang.Throwable -> L1f
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                goto L4
            L17:
                ۟.h1 r0 = r0.f949
                java.util.concurrent.ExecutorService r0 = r0.f425
                r0.execute(r3)
                return
            L1f:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                throw r3
        }
    }

    static {
            ۟.s$a r0 = new ۟.s$a
            r0.<init>()
            p000.s.f948 = r0
            return
    }

    public s() {
            r1 = this;
            r1.<init>()
            ۟.h1 r0 = new ۟.h1
            r0.<init>()
            r1.f949 = r0
            return
    }
}
