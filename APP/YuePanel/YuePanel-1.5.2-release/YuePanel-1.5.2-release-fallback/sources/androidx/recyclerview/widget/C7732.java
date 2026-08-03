package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7732<T> {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.util.concurrent.Executor f29771 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC3643 f29772;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7730<T> f29773;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.concurrent.Executor f29774;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.List<androidx.recyclerview.widget.C7732.InterfaceC7736<T>> f29775;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public java.util.List<T> f29776;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public java.util.List<T> f29777;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f29778;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ, reason: contains not printable characters */
    public class RunnableC7733 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.List f29779;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.util.List f29780;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f29781;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Runnable f29782;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7732 f29783;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ, reason: contains not printable characters */
        public class C7734 extends androidx.recyclerview.widget.C7752.AbstractC7754 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.recyclerview.widget.C7732.RunnableC7733 f29784;

            public C7734(androidx.recyclerview.widget.C7732.RunnableC7733 r1) {
                    r0 = this;
                    r0.f29784 = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.recyclerview.widget.C7752.AbstractC7754
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public boolean mo30036(int r2, int r3) {
                    r1 = this;
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29779
                    java.lang.Object r2 = r0.get(r2)
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29780
                    java.lang.Object r3 = r0.get(r3)
                    if (r2 == 0) goto L23
                    if (r3 == 0) goto L23
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    androidx.recyclerview.widget.ۥ۟۟۟ r0 = r0.f29783
                    androidx.recyclerview.widget.ۥ۟۟<T> r0 = r0.f29773
                    androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ r0 = r0.m30024()
                    boolean r2 = r0.m30101(r2, r3)
                    return r2
                L23:
                    if (r2 != 0) goto L29
                    if (r3 != 0) goto L29
                    r2 = 1
                    return r2
                L29:
                    java.lang.AssertionError r2 = new java.lang.AssertionError
                    r2.<init>()
                    throw r2
            }

            @Override // androidx.recyclerview.widget.C7752.AbstractC7754
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public boolean mo30037(int r2, int r3) {
                    r1 = this;
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29779
                    java.lang.Object r2 = r0.get(r2)
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29780
                    java.lang.Object r3 = r0.get(r3)
                    if (r2 == 0) goto L23
                    if (r3 == 0) goto L23
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    androidx.recyclerview.widget.ۥ۟۟۟ r0 = r0.f29783
                    androidx.recyclerview.widget.ۥ۟۟<T> r0 = r0.f29773
                    androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ r0 = r0.m30024()
                    boolean r2 = r0.m30102(r2, r3)
                    return r2
                L23:
                    if (r2 != 0) goto L29
                    if (r3 != 0) goto L29
                    r2 = 1
                    goto L2a
                L29:
                    r2 = 0
                L2a:
                    return r2
            }

            @Override // androidx.recyclerview.widget.C7752.AbstractC7754
            @Yue.InterfaceC4544
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public java.lang.Object mo30038(int r2, int r3) {
                    r1 = this;
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29779
                    java.lang.Object r2 = r0.get(r2)
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29780
                    java.lang.Object r3 = r0.get(r3)
                    if (r2 == 0) goto L23
                    if (r3 == 0) goto L23
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    androidx.recyclerview.widget.ۥ۟۟۟ r0 = r0.f29783
                    androidx.recyclerview.widget.ۥ۟۟<T> r0 = r0.f29773
                    androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ r0 = r0.m30024()
                    java.lang.Object r2 = r0.m30103(r2, r3)
                    return r2
                L23:
                    java.lang.AssertionError r2 = new java.lang.AssertionError
                    r2.<init>()
                    throw r2
            }

            @Override // androidx.recyclerview.widget.C7752.AbstractC7754
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int mo30039() {
                    r1 = this;
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29780
                    int r0 = r0.size()
                    return r0
            }

            @Override // androidx.recyclerview.widget.C7752.AbstractC7754
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int mo30040() {
                    r1 = this;
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r1.f29784
                    java.util.List r0 = r0.f29779
                    int r0 = r0.size()
                    return r0
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ۟, reason: contains not printable characters */
        public class RunnableC7735 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ androidx.recyclerview.widget.C7752.C7755 f29785;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ androidx.recyclerview.widget.C7732.RunnableC7733 f29786;

            public RunnableC7735(androidx.recyclerview.widget.C7732.RunnableC7733 r1, androidx.recyclerview.widget.C7752.C7755 r2) {
                    r0 = this;
                    r0.f29786 = r1
                    r0.f29785 = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    androidx.recyclerview.widget.ۥ۟۟۟$ۥ r0 = r4.f29786
                    androidx.recyclerview.widget.ۥ۟۟۟ r1 = r0.f29783
                    int r2 = r1.f29778
                    int r3 = r0.f29781
                    if (r2 != r3) goto L13
                    java.util.List r2 = r0.f29780
                    androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟ r3 = r4.f29785
                    java.lang.Runnable r0 = r0.f29782
                    r1.m30031(r2, r3, r0)
                L13:
                    return
            }
        }

        public RunnableC7733(androidx.recyclerview.widget.C7732 r1, java.util.List r2, java.util.List r3, int r4, java.lang.Runnable r5) {
                r0 = this;
                r0.f29783 = r1
                r0.f29779 = r2
                r0.f29780 = r3
                r0.f29781 = r4
                r0.f29782 = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ
                r0.<init>(r3)
                androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟ r0 = androidx.recyclerview.widget.C7752.m30084(r0)
                androidx.recyclerview.widget.ۥ۟۟۟ r1 = r3.f29783
                java.util.concurrent.Executor r1 = r1.f29774
                androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ۟ r2 = new androidx.recyclerview.widget.ۥ۟۟۟$ۥ$ۥ۟
                r2.<init>(r3, r0)
                r1.execute(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC7736<T> {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo30041(@Yue.InterfaceC4410 java.util.List<T> r1, @Yue.InterfaceC4410 java.util.List<T> r2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class ExecutorC7737 implements java.util.concurrent.Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.os.Handler f29787;

        public ExecutorC7737() {
                r2 = this;
                r2.<init>()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.f29787 = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@Yue.InterfaceC4410 java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.f29787
                r0.post(r2)
                return
        }
    }

    static {
            androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟۟ r0 = new androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟۟
            r0.<init>()
            androidx.recyclerview.widget.C7732.f29771 = r0
            return
    }

    public C7732(@Yue.InterfaceC4410 Yue.InterfaceC3643 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.C7730<T> r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f29775 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f29777 = r0
            r1.f29772 = r2
            r1.f29773 = r3
            java.util.concurrent.Executor r2 = r3.m30025()
            if (r2 == 0) goto L21
            java.util.concurrent.Executor r2 = r3.m30025()
            r1.f29774 = r2
            goto L25
        L21:
            java.util.concurrent.Executor r2 = androidx.recyclerview.widget.C7732.f29771
            r1.f29774 = r2
        L25:
            return
    }

    public C7732(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.AbstractC7756<T> r3) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟ r0 = new androidx.recyclerview.widget.ۥ۟
            r0.<init>(r2)
            androidx.recyclerview.widget.ۥ۟۟$ۥ r2 = new androidx.recyclerview.widget.ۥ۟۟$ۥ
            r2.<init>(r3)
            androidx.recyclerview.widget.ۥ۟۟ r2 = r2.m30026()
            r1.<init>(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m30029(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7732.InterfaceC7736<T> r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟<T>> r0 = r1.f29775
            r0.add(r2)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.List<T> m30030() {
            r1 = this;
            java.util.List<T> r0 = r1.f29777
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m30031(@Yue.InterfaceC4410 java.util.List<T> r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.C7755 r3, @Yue.InterfaceC4544 java.lang.Runnable r4) {
            r1 = this;
            java.util.List<T> r0 = r1.f29777
            r1.f29776 = r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f29777 = r2
            Yue.ۥ۠ۧۢۦ r2 = r1.f29772
            r3.m30094(r2)
            r1.m30032(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30032(@Yue.InterfaceC4410 java.util.List<T> r4, @Yue.InterfaceC4544 java.lang.Runnable r5) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟<T>> r0 = r3.f29775
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟ r1 = (androidx.recyclerview.widget.C7732.InterfaceC7736) r1
            java.util.List<T> r2 = r3.f29777
            r1.mo30041(r4, r2)
            goto L6
        L18:
            if (r5 == 0) goto L1d
            r5.run()
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30033(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7732.InterfaceC7736<T> r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.ۥ۟۟۟$ۥ۟<T>> r0 = r1.f29775
            r0.remove(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30034(@Yue.InterfaceC4544 java.util.List<T> r2) {
            r1 = this;
            r0 = 0
            r1.m30035(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30035(@Yue.InterfaceC4544 java.util.List<T> r9, @Yue.InterfaceC4544 java.lang.Runnable r10) {
            r8 = this;
            int r0 = r8.f29778
            int r5 = r0 + 1
            r8.f29778 = r5
            java.util.List<T> r3 = r8.f29776
            if (r9 != r3) goto L10
            if (r10 == 0) goto Lf
            r10.run()
        Lf:
            return
        L10:
            java.util.List<T> r0 = r8.f29777
            r1 = 0
            if (r9 != 0) goto L2b
            int r9 = r3.size()
            r2 = 0
            r8.f29776 = r2
            java.util.List r2 = java.util.Collections.emptyList()
            r8.f29777 = r2
            Yue.ۥ۠ۧۢۦ r2 = r8.f29772
            r2.mo4607(r1, r9)
            r8.m30032(r0, r10)
            return
        L2b:
            if (r3 != 0) goto L42
            r8.f29776 = r9
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
            r8.f29777 = r2
            Yue.ۥ۠ۧۢۦ r2 = r8.f29772
            int r9 = r9.size()
            r2.mo4606(r1, r9)
            r8.m30032(r0, r10)
            return
        L42:
            androidx.recyclerview.widget.ۥ۟۟<T> r0 = r8.f29773
            java.util.concurrent.Executor r0 = r0.m30023()
            androidx.recyclerview.widget.ۥ۟۟۟$ۥ r7 = new androidx.recyclerview.widget.ۥ۟۟۟$ۥ
            r1 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
            return
    }
}
