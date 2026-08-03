package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4820 {

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۠$ۥ, reason: contains not printable characters */
    public interface InterfaceC4821<T> {
        @Yue.InterfaceC4543
        T acquire();

        boolean release(@Yue.InterfaceC4418 T r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class C4822<T> implements Yue.C4820.InterfaceC4821<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.lang.Object[] f15284;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f15285;

        public C4822(@Yue.InterfaceC3281(from = 1) int r2) {
                r1 = this;
                r1.<init>()
                if (r2 <= 0) goto La
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.f15284 = r2
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The max pool size must be > 0"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @Override // Yue.C4820.InterfaceC4821
        @Yue.InterfaceC4543
        public T acquire() {
                r4 = this;
                int r0 = r4.f15285
                r1 = 0
                if (r0 <= 0) goto L1b
                int r0 = r0 + (-1)
                java.lang.Object[] r2 = r4.f15284
                r2 = r2[r0]
                java.lang.String r3 = "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"
                Yue.C3329.m13904(r2, r3)
                java.lang.Object[] r3 = r4.f15284
                r3[r0] = r1
                int r0 = r4.f15285
                int r0 = r0 + (-1)
                r4.f15285 = r0
                return r2
            L1b:
                return r1
        }

        @Override // Yue.C4820.InterfaceC4821
        public boolean release(@Yue.InterfaceC4418 T r5) {
                r4 = this;
                java.lang.String r0 = "instance"
                Yue.C3329.m13906(r5, r0)
                boolean r0 = r4.m19101(r5)
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L1c
                int r0 = r4.f15285
                java.lang.Object[] r2 = r4.f15284
                int r3 = r2.length
                if (r0 >= r3) goto L1a
                r2[r0] = r5
                int r0 = r0 + r1
                r4.f15285 = r0
                return r1
            L1a:
                r5 = 0
                return r5
            L1c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Already in the pool!"
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean m19101(T r5) {
                r4 = this;
                int r0 = r4.f15285
                r1 = 0
                r2 = r1
            L4:
                if (r2 >= r0) goto L11
                java.lang.Object[] r3 = r4.f15284
                r3 = r3[r2]
                if (r3 != r5) goto Le
                r5 = 1
                return r5
            Le:
                int r2 = r2 + 1
                goto L4
            L11:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۤ۠$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class C4823<T> extends Yue.C4820.C4822<T> {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.lang.Object f15286;

        public C4823(int r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.f15286 = r1
                return
        }

        @Override // Yue.C4820.C4822, Yue.C4820.InterfaceC4821
        @Yue.InterfaceC4543
        public T acquire() {
                r2 = this;
                java.lang.Object r0 = r2.f15286
                monitor-enter(r0)
                java.lang.Object r1 = super.acquire()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // Yue.C4820.C4822, Yue.C4820.InterfaceC4821
        public boolean release(@Yue.InterfaceC4418 T r2) {
                r1 = this;
                java.lang.String r0 = "instance"
                Yue.C3329.m13906(r2, r0)
                java.lang.Object r0 = r1.f15286
                monitor-enter(r0)
                boolean r2 = super.release(r2)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)
                return r2
            Le:
                r2 = move-exception
                monitor-exit(r0)
                throw r2
        }
    }

    public C4820() {
            r0 = this;
            r0.<init>()
            return
    }
}
