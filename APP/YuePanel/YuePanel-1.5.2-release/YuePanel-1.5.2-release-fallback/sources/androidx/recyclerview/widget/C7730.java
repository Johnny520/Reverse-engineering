package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7730<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final java.util.concurrent.Executor f29763;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.concurrent.Executor f29764;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.recyclerview.widget.C7752.AbstractC7756<T> f29765;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟$ۥ, reason: contains not printable characters */
    public static final class C7731<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.Object f29766 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static java.util.concurrent.Executor f29767;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.concurrent.Executor f29768;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.concurrent.Executor f29769;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final androidx.recyclerview.widget.C7752.AbstractC7756<T> f29770;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.recyclerview.widget.C7730.C7731.f29766 = r0
                return
        }

        public C7731(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.AbstractC7756<T> r1) {
                r0 = this;
                r0.<init>()
                r0.f29770 = r1
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.C7730<T> m30026() {
                r4 = this;
                java.util.concurrent.Executor r0 = r4.f29769
                if (r0 != 0) goto L1d
                java.lang.Object r0 = androidx.recyclerview.widget.C7730.C7731.f29766
                monitor-enter(r0)
                java.util.concurrent.Executor r1 = androidx.recyclerview.widget.C7730.C7731.f29767     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                r1 = 2
                java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)     // Catch: java.lang.Throwable -> L13
                androidx.recyclerview.widget.C7730.C7731.f29767 = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L1b
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                java.util.concurrent.Executor r0 = androidx.recyclerview.widget.C7730.C7731.f29767
                r4.f29769 = r0
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
            L1d:
                androidx.recyclerview.widget.ۥ۟۟ r0 = new androidx.recyclerview.widget.ۥ۟۟
                java.util.concurrent.Executor r1 = r4.f29768
                java.util.concurrent.Executor r2 = r4.f29769
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟<T> r3 = r4.f29770
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.C7730.C7731<T> m30027(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.f29769 = r1
                return r0
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.C7730.C7731<T> m30028(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.f29768 = r1
                return r0
        }
    }

    public C7730(@Yue.InterfaceC4544 java.util.concurrent.Executor r1, @Yue.InterfaceC4410 java.util.concurrent.Executor r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.AbstractC7756<T> r3) {
            r0 = this;
            r0.<init>()
            r0.f29763 = r1
            r0.f29764 = r2
            r0.f29765 = r3
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.concurrent.Executor m30023() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f29764
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.recyclerview.widget.C7752.AbstractC7756<T> m30024() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟<T> r0 = r1.f29765
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.concurrent.Executor m30025() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f29763
            return r0
    }
}
