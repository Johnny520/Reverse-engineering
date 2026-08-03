package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7766 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<androidx.recyclerview.widget.RunnableC7766> f29935 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static java.util.Comparator<androidx.recyclerview.widget.RunnableC7766.C7769> f29936;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> f29937;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public long f29938;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public long f29939;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RunnableC7766.C7769> f29940;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ, reason: contains not printable characters */
    public static class C7767 implements java.util.Comparator<androidx.recyclerview.widget.RunnableC7766.C7769> {
        public C7767() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(androidx.recyclerview.widget.RunnableC7766.C7769 r1, androidx.recyclerview.widget.RunnableC7766.C7769 r2) {
                r0 = this;
                androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟ r1 = (androidx.recyclerview.widget.RunnableC7766.C7769) r1
                androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟ r2 = (androidx.recyclerview.widget.RunnableC7766.C7769) r2
                int r1 = r0.m30144(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m30144(androidx.recyclerview.widget.RunnableC7766.C7769 r7, androidx.recyclerview.widget.RunnableC7766.C7769 r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r7.f29948
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L8
                r3 = r2
                goto L9
            L8:
                r3 = r1
            L9:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f29948
                if (r4 != 0) goto Lf
                r4 = r2
                goto L10
            Lf:
                r4 = r1
            L10:
                r5 = -1
                if (r3 == r4) goto L18
                if (r0 != 0) goto L16
                goto L17
            L16:
                r2 = r5
            L17:
                return r2
            L18:
                boolean r0 = r7.f29945
                boolean r3 = r8.f29945
                if (r0 == r3) goto L22
                if (r0 == 0) goto L21
                r2 = r5
            L21:
                return r2
            L22:
                int r0 = r8.f29946
                int r2 = r7.f29946
                int r0 = r0 - r2
                if (r0 == 0) goto L2a
                return r0
            L2a:
                int r7 = r7.f29947
                int r8 = r8.f29947
                int r7 = r7 - r8
                if (r7 == 0) goto L32
                return r7
            L32:
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟, reason: contains not printable characters */
    @android.annotation.SuppressLint({"VisibleForTests"})
    public static class C7768 implements androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29941;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29942;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int[] f29943;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29944;

        public C7768() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694
        /* JADX INFO: renamed from: ۥ */
        public void mo29770(int r6, int r7) {
                r5 = this;
                if (r6 < 0) goto L3a
                if (r7 < 0) goto L32
                int r0 = r5.f29944
                int r1 = r0 * 2
                int[] r2 = r5.f29943
                r3 = 4
                if (r2 != 0) goto L16
                int[] r0 = new int[r3]
                r5.f29943 = r0
                r2 = -1
                java.util.Arrays.fill(r0, r2)
                goto L23
            L16:
                int r4 = r2.length
                if (r1 < r4) goto L23
                int r0 = r0 * r3
                int[] r0 = new int[r0]
                r5.f29943 = r0
                int r3 = r2.length
                r4 = 0
                java.lang.System.arraycopy(r2, r4, r0, r4, r3)
            L23:
                int[] r0 = r5.f29943
                r0[r1] = r6
                int r1 = r1 + 1
                r0[r1] = r7
                int r6 = r5.f29944
                int r6 = r6 + 1
                r5.f29944 = r6
                return
            L32:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Pixel distance must be non-negative"
                r6.<init>(r7)
                throw r6
            L3a:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Layout positions must be non-negative"
                r6.<init>(r7)
                throw r6
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m30145() {
                r2 = this;
                int[] r0 = r2.f29943
                if (r0 == 0) goto L8
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L8:
                r0 = 0
                r2.f29944 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30146(androidx.recyclerview.widget.RecyclerView r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.f29944 = r0
                int[] r0 = r4.f29943
                if (r0 == 0) goto Lb
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            Lb:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r5.mLayout
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r5.mAdapter
                if (r1 == 0) goto L4b
                if (r0 == 0) goto L4b
                boolean r1 = r0.isItemPrefetchEnabled()
                if (r1 == 0) goto L4b
                if (r6 == 0) goto L2d
                androidx.recyclerview.widget.ۥ r1 = r5.mAdapterHelper
                boolean r1 = r1.m30011()
                if (r1 != 0) goto L3c
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r5.mAdapter
                int r1 = r1.getItemCount()
                r0.collectInitialPrefetchPositions(r1, r4)
                goto L3c
            L2d:
                boolean r1 = r5.hasPendingAdapterUpdates()
                if (r1 != 0) goto L3c
                int r1 = r4.f29941
                int r2 = r4.f29942
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r5.mState
                r0.collectAdjacentPrefetchPositions(r1, r2, r3, r4)
            L3c:
                int r1 = r4.f29944
                int r2 = r0.mPrefetchMaxCountObserved
                if (r1 <= r2) goto L4b
                r0.mPrefetchMaxCountObserved = r1
                r0.mPrefetchMaxObservedInInitialPrefetch = r6
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r5 = r5.mRecycler
                r5.m29833()
            L4b:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m30147(int r5) {
                r4 = this;
                int[] r0 = r4.f29943
                r1 = 0
                if (r0 == 0) goto L17
                int r0 = r4.f29944
                int r0 = r0 * 2
                r2 = r1
            La:
                if (r2 >= r0) goto L17
                int[] r3 = r4.f29943
                r3 = r3[r2]
                if (r3 != r5) goto L14
                r5 = 1
                return r5
            L14:
                int r2 = r2 + 2
                goto La
            L17:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30148(int r1, int r2) {
                r0 = this;
                r0.f29941 = r1
                r0.f29942 = r2
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class C7769 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f29945;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29946;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29947;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView f29948;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29949;

        public C7769() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m30149() {
                r2 = this;
                r0 = 0
                r2.f29945 = r0
                r2.f29946 = r0
                r2.f29947 = r0
                r1 = 0
                r2.f29948 = r1
                r2.f29949 = r0
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.recyclerview.widget.RunnableC7766.f29935 = r0
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ
            r0.<init>()
            androidx.recyclerview.widget.RunnableC7766.f29936 = r0
            return
    }

    public RunnableC7766() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29937 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29940 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m30134(androidx.recyclerview.widget.RecyclerView r5, int r6) {
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r5.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
            int r4 = r3.mPosition
            if (r4 != r6) goto L20
            boolean r3 = r3.isInvalid()
            if (r3 != 0) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            return r1
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            r0 = 0
            java.lang.String r2 = "RV Prefetch"
            Yue.C6388.m23593(r2)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r8.f29937     // Catch: java.lang.Throwable -> L36
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L15
        Lf:
            r8.f29938 = r0
            Yue.C6388.m23595()
            return
        L15:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r8.f29937     // Catch: java.lang.Throwable -> L36
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L36
            r3 = 0
            r4 = r0
        L1d:
            if (r3 >= r2) goto L3b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r6 = r8.f29937     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L36
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch: java.lang.Throwable -> L36
            int r7 = r6.getWindowVisibility()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L38
            long r6 = r6.getDrawingTime()     // Catch: java.lang.Throwable -> L36
            long r4 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r2 = move-exception
            goto L52
        L38:
            int r3 = r3 + 1
            goto L1d
        L3b:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L40
            goto Lf
        L40:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L36
            long r2 = r2.toNanos(r4)     // Catch: java.lang.Throwable -> L36
            long r4 = r8.f29939     // Catch: java.lang.Throwable -> L36
            long r2 = r2 + r4
            r8.m30140(r2)     // Catch: java.lang.Throwable -> L36
            r8.f29938 = r0
            Yue.C6388.m23595()
            return
        L52:
            r8.f29938 = r0
            Yue.C6388.m23595()
            throw r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m30135(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.f29937
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m30136() {
            r12 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r12.f29937
            int r0 = r0.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r0) goto L26
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r4 = r12.f29937
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 != 0) goto L23
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r5 = r4.mPrefetchRegistry
            r5.m30146(r4, r1)
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r4 = r4.mPrefetchRegistry
            int r4 = r4.f29944
            int r3 = r3 + r4
        L23:
            int r2 = r2 + 1
            goto L9
        L26:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r2 = r12.f29940
            r2.ensureCapacity(r3)
            r2 = r1
            r3 = r2
        L2d:
            if (r2 >= r0) goto L8e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r4 = r12.f29937
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 == 0) goto L3e
            goto L8b
        L3e:
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r5 = r4.mPrefetchRegistry
            int r6 = r5.f29941
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.f29942
            int r7 = java.lang.Math.abs(r7)
            int r6 = r6 + r7
            r7 = r1
        L4e:
            int r8 = r5.f29944
            int r8 = r8 * 2
            if (r7 >= r8) goto L8b
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r8 = r12.f29940
            int r8 = r8.size()
            if (r3 < r8) goto L67
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟ r8 = new androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟
            r8.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r9 = r12.f29940
            r9.add(r8)
            goto L6f
        L67:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r8 = r12.f29940
            java.lang.Object r8 = r8.get(r3)
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟ r8 = (androidx.recyclerview.widget.RunnableC7766.C7769) r8
        L6f:
            int[] r9 = r5.f29943
            int r10 = r7 + 1
            r10 = r9[r10]
            if (r10 > r6) goto L79
            r11 = 1
            goto L7a
        L79:
            r11 = r1
        L7a:
            r8.f29945 = r11
            r8.f29946 = r6
            r8.f29947 = r10
            r8.f29948 = r4
            r9 = r9[r7]
            r8.f29949 = r9
            int r3 = r3 + 1
            int r7 = r7 + 2
            goto L4e
        L8b:
            int r2 = r2 + 1
            goto L2d
        L8e:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r0 = r12.f29940
            java.util.Comparator<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r1 = androidx.recyclerview.widget.RunnableC7766.f29936
            java.util.Collections.sort(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30137(androidx.recyclerview.widget.RunnableC7766.C7769 r4, long r5) {
            r3 = this;
            boolean r0 = r4.f29945
            if (r0 == 0) goto La
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lb
        La:
            r0 = r5
        Lb:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f29948
            int r4 = r4.f29949
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = r3.m30142(r2, r4, r0)
            if (r4 == 0) goto L30
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r4.mNestedRecyclerView
            if (r0 == 0) goto L30
            boolean r0 = r4.isBound()
            if (r0 == 0) goto L30
            boolean r0 = r4.isInvalid()
            if (r0 != 0) goto L30
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r4 = r4.mNestedRecyclerView
            java.lang.Object r4 = r4.get()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r3.m30141(r4, r5)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30138(long r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r1 = r3.f29940
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟> r1 = r3.f29940
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟ r1 = (androidx.recyclerview.widget.RunnableC7766.C7769) r1
            androidx.recyclerview.widget.RecyclerView r2 = r1.f29948
            if (r2 != 0) goto L16
            goto L1f
        L16:
            r3.m30137(r1, r4)
            r1.m30149()
            int r0 = r0 + 1
            goto L1
        L1f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30139(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L17
            long r0 = r4.f29938
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            long r0 = r5.getNanoTime()
            r4.f29938 = r0
            r5.post(r4)
        L17:
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r5 = r5.mPrefetchRegistry
            r5.m30148(r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30140(long r1) {
            r0 = this;
            r0.m30136()
            r0.m30138(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30141(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView r4, long r5) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r4.mChildHelper
            int r0 = r0.m30051()
            if (r0 == 0) goto L12
            r4.removeAndRecycleViews()
        L12:
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r0 = r4.mPrefetchRegistry
            r1 = 1
            r0.m30146(r4, r1)
            int r1 = r0.f29944
            if (r1 == 0) goto L43
            java.lang.String r1 = "RV Nested Prefetch"
            Yue.C6388.m23593(r1)     // Catch: java.lang.Throwable -> L39
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r4.mState     // Catch: java.lang.Throwable -> L39
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r2 = r4.mAdapter     // Catch: java.lang.Throwable -> L39
            r1.m29865(r2)     // Catch: java.lang.Throwable -> L39
            r1 = 0
        L29:
            int r2 = r0.f29944     // Catch: java.lang.Throwable -> L39
            int r2 = r2 * 2
            if (r1 >= r2) goto L3b
            int[] r2 = r0.f29943     // Catch: java.lang.Throwable -> L39
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L39
            r3.m30142(r4, r2, r5)     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + 2
            goto L29
        L39:
            r4 = move-exception
            goto L3f
        L3b:
            Yue.C6388.m23595()
            goto L43
        L3f:
            Yue.C6388.m23595()
            throw r4
        L43:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC7716 m30142(androidx.recyclerview.widget.RecyclerView r3, int r4, long r5) {
            r2 = this;
            boolean r0 = m30134(r3, r4)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r3.mRecycler
            r1 = 0
            r3.onEnterLayoutOrScroll()     // Catch: java.lang.Throwable -> L26
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = r0.m29831(r4, r1, r5)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L2b
            boolean r5 = r4.isBound()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L28
            boolean r5 = r4.isInvalid()     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L28
            android.view.View r5 = r4.itemView     // Catch: java.lang.Throwable -> L26
            r0.m29824(r5)     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            r4 = move-exception
            goto L2f
        L28:
            r0.m29796(r4, r1)     // Catch: java.lang.Throwable -> L26
        L2b:
            r3.onExitLayoutOrScroll(r1)
            return r4
        L2f:
            r3.onExitLayoutOrScroll(r1)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m30143(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.f29937
            r0.remove(r2)
            return
    }
}
