package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkActiveQuery {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery INSTANCE = null;
    private static final java.lang.String TAG = "r2ac997fa1bc77e34";
    private static volatile android.content.Context appContext;
    private static final java.util.concurrent.ExecutorService executor = null;
    private static volatile java.lang.ClassLoader hostClassLoader;
    private static final java.util.concurrent.atomic.AtomicBoolean inFlight = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Summary {
        public static final int $stable = 0;
        private final int failed;
        private final int queried;
        private final int total;
        private final int updated;

        public Summary(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.total = r1
                r0.queried = r2
                r0.updated = r3
                r0.failed = r4
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary copy$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L6
                int r1 = r0.total
            L6:
                r6 = r5 & 2
                if (r6 == 0) goto Lc
                int r2 = r0.queried
            Lc:
                r6 = r5 & 4
                if (r6 == 0) goto L12
                int r3 = r0.updated
            L12:
                r5 = r5 & 8
                if (r5 == 0) goto L18
                int r4 = r0.failed
            L18:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r0 = r0.copy(r1, r2, r3, r4)
                return r0
        }

        public final int component1() {
                r0 = this;
                int r0 = r0.total
                return r0
        }

        public final int component2() {
                r0 = this;
                int r0 = r0.queried
                return r0
        }

        public final int component3() {
                r0 = this;
                int r0 = r0.updated
                return r0
        }

        public final int component4() {
                r0 = this;
                int r0 = r0.failed
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary copy(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r5 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary) r5
                int r1 = r4.total
                int r3 = r5.total
                if (r1 == r3) goto L13
                return r2
            L13:
                int r1 = r4.queried
                int r3 = r5.queried
                if (r1 == r3) goto L1a
                return r2
            L1a:
                int r1 = r4.updated
                int r3 = r5.updated
                if (r1 == r3) goto L21
                return r2
            L21:
                int r4 = r4.failed
                int r5 = r5.failed
                if (r4 == r5) goto L28
                return r2
            L28:
                return r0
        }

        public final int getFailed() {
                r0 = this;
                int r0 = r0.failed
                return r0
        }

        public final int getQueried() {
                r0 = this;
                int r0 = r0.queried
                return r0
        }

        public final int getTotal() {
                r0 = this;
                int r0 = r0.total
                return r0
        }

        public final int getUpdated() {
                r0 = this;
                int r0 = r0.updated
                return r0
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.total
                int r0 = java.lang.Integer.hashCode(r0)
                r1 = 31
                int r0 = r0 * r1
                int r2 = r3.queried
                int r0 = p000.a12.m14(r2, r0, r1)
                int r2 = r3.updated
                int r0 = p000.a12.m14(r2, r0, r1)
                int r3 = r3.failed
                int r3 = java.lang.Integer.hashCode(r3)
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r6 = this;
                int r0 = r6.total
                int r1 = r6.queried
                int r2 = r6.updated
                int r6 = r6.failed
                java.lang.String r3 = ", queried="
                java.lang.String r4 = ", updated="
                java.lang.String r5 = "Summary(total="
                java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r5, r0, r3, r1, r4)
                r0.append(r2)
                java.lang.String r1 = ", failed="
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = ")"
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                return r6
        }

        public final java.lang.String toastText() {
                r6 = this;
                int r0 = r6.queried
                int r1 = r6.total
                int r2 = r6.updated
                int r6 = r6.failed
                java.lang.String r3 = "/"
                java.lang.String r4 = "，新作品 "
                java.lang.String r5 = "主页查询完成：成功 "
                java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r5, r0, r3, r1, r4)
                r0.append(r2)
                java.lang.String r1 = "，失败 "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                return r6
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.INSTANCE = r0
            aj r0 = new aj
            r1 = 17
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.executor = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.inFlight = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.$stable = r0
            return
    }

    private ProfileBookmarkActiveQuery() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.lang.Thread executor$lambda$1(java.lang.Runnable r2) {
            java.lang.String r0 = "r2ac997fa1bc77e34"
            r1 = 1
            java.lang.Thread r2 = p000.AbstractC0602nx.m4139(r2, r0, r1)
            return r2
    }

    public static /* synthetic */ void queryAll$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery r0, android.app.Activity r1, p000.a80 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto La
            li1 r2 = new li1
            r3 = 4
            r2.<init>(r3)
        La:
            r0.queryAll(r1, r2)
            return
    }

    private static final p000.s62 queryAll$lambda$2(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r0) {
            r0.getClass()
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final void queryAll$lambda$4(java.lang.ClassLoader r2, java.util.List r3, android.app.Activity r4, p000.a80 r5) {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.INSTANCE
            r2.getClass()
            r1 = 1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r2 = r0.querySnapshot(r2, r3, r1)
            jg1 r3 = new jg1
            r0 = 1
            r3.<init>(r4, r2, r5, r0)
            r4.runOnUiThread(r3)
            return
    }

    private static final void queryAll$lambda$4$lambda$3(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r3, p000.a80 r4) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.inFlight
            r1 = 0
            r0.set(r1)
            java.lang.String r0 = r3.toastText()
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            r2.show()
            r4.invoke(r3)
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ p000.s62 m1435(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r0) {
            s62 r0 = queryAll$lambda$2(r0)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m1436(java.lang.ClassLoader r0, java.util.List r1, android.app.Activity r2, p000.a80 r3) {
            queryAll$lambda$4(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ java.lang.Thread m1437(java.lang.Runnable r0) {
            java.lang.Thread r0 = executor$lambda$1(r0)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m1438(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r1, p000.a80 r2) {
            queryAll$lambda$4$lambda$3(r0, r1, r2)
            return
    }

    public final void init(android.content.Context r1, java.lang.ClassLoader r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.appContext = r1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.hostClassLoader = r2
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            android.content.Context r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.appContext
            r1.getClass()
            r0.init(r1)
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r0 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE
            android.content.Context r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.appContext
            r1.getClass()
            r0.init(r1)
            return
    }

    public final void queryAll(android.app.Activity r7, p000.a80 r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            java.lang.ClassLoader r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.hostClassLoader
            if (r6 != 0) goto Le
            java.lang.ClassLoader r6 = r7.getClassLoader()
        Le:
            r1 = r6
            java.util.concurrent.atomic.AtomicBoolean r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.inFlight
            r0 = 1
            r2 = 0
            boolean r0 = r6.compareAndSet(r2, r0)
            if (r0 != 0) goto L23
            java.lang.String r6 = "正在查询主页书签，请稍候"
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            return
        L23:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            java.util.List r0 = r0.all()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L44
            r6.set(r2)
            java.lang.String r6 = "暂无主页书签"
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary
            r6.<init>(r2, r2, r2, r2)
            r8.invoke(r6)
            return
        L44:
            java.lang.String r6 = "开始查询主页书签"
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            java.util.concurrent.ExecutorService r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.executor
            r2 = r0
            nj r0 = new nj
            r5 = 1
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.execute(r0)
            return
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary querySnapshot(java.lang.ClassLoader r20, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r21, boolean r22) {
            r19 = this;
            java.lang.String r1 = ", key="
            java.lang.String r2 = "r2ac997fa1bc77e34"
            r20.getClass()
            r21.getClass()
            java.util.Iterator r3 = r21.iterator()
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r3.next()
            r10 = r0
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r10 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r10
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient r8 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.INSTANCE     // Catch: java.lang.Throwable -> L95
            r17 = 120(0x78, float:1.68E-43)
            r18 = 0
            r11 = 20
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r20
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r0 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.loadProfileAwemeList$default(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L99
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r8 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r10.uniqueKey()     // Catch: java.lang.Throwable -> L95
            java.util.List r11 = r0.getItems()     // Catch: java.lang.Throwable -> L95
            int r12 = r0.getTotalCount()     // Catch: java.lang.Throwable -> L95
            r13 = r22
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r8 = r8.updateAwemeSnapshot(r9, r11, r12, r13)     // Catch: java.lang.Throwable -> L93
            int r5 = r5 + 1
            if (r8 == 0) goto L4f
            int r6 = r6 + 1
        L4f:
            java.lang.String r9 = r10.displayName()     // Catch: java.lang.Throwable -> L93
            java.lang.String r11 = r10.uniqueKey()     // Catch: java.lang.Throwable -> L93
            java.util.List r0 = r0.getItems()     // Catch: java.lang.Throwable -> L93
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L63
            r8 = 1
            goto L64
        L63:
            r8 = r4
        L64:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r12.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r14 = "queried profile="
            r12.append(r14)     // Catch: java.lang.Throwable -> L93
            r12.append(r9)     // Catch: java.lang.Throwable -> L93
            r12.append(r1)     // Catch: java.lang.Throwable -> L93
            r12.append(r11)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = ", items="
            r12.append(r9)     // Catch: java.lang.Throwable -> L93
            r12.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = ", changed="
            r12.append(r0)     // Catch: java.lang.Throwable -> L93
            r12.append(r8)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L93
            r8 = 4
            r9 = 0
            p000.C0888ux.m5988(r2, r0, r9, r8, r9)     // Catch: java.lang.Throwable -> L93
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L93
            goto La9
        L93:
            r0 = move-exception
            goto La3
        L95:
            r0 = move-exception
            r13 = r22
            goto La3
        L99:
            r13 = r22
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = "loadProfileAwemeList returns null"
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        La3:
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        La9:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Lc2
            int r7 = r7 + 1
            java.lang.String r8 = r10.displayName()
            java.lang.String r9 = r10.uniqueKey()
            java.lang.String r10 = "query failed profile="
            java.lang.String r8 = p000.a12.m18(r10, r8, r1, r9)
            p000.C0888ux.m5977(r2, r8, r0)
        Lc2:
            r8 = 180(0xb4, double:8.9E-322)
            java.lang.Thread.sleep(r8)     // Catch: java.lang.Throwable -> L12
            goto L12
        Lc9:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary
            int r1 = r21.size()
            r0.<init>(r1, r5, r6, r7)
            return r0
    }
}
