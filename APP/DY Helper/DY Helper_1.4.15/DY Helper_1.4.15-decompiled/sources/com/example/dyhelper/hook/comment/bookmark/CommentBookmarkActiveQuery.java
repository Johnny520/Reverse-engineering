package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkActiveQuery {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery INSTANCE = null;
    private static final java.lang.String TAG = "r3d4f554990ee3884";
    private static volatile android.content.Context appContext;
    private static volatile boolean autoScanScheduled;
    private static final java.util.concurrent.ExecutorService executor = null;
    private static volatile java.lang.ClassLoader hostClassLoader;
    private static final java.util.concurrent.atomic.AtomicBoolean inFlight = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class QueryOptions {
        public static final int $stable = 0;
        private final long delayBetweenItemsMs;
        private final boolean loadReplyWhenCountIncreased;
        private final boolean notifyIfNew;

        public QueryOptions(boolean r1, long r2, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.loadReplyWhenCountIncreased = r1
                r0.delayBetweenItemsMs = r2
                r0.notifyIfNew = r4
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.QueryOptions copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.QueryOptions r0, boolean r1, long r2, boolean r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L6
                boolean r1 = r0.loadReplyWhenCountIncreased
            L6:
                r6 = r5 & 2
                if (r6 == 0) goto Lc
                long r2 = r0.delayBetweenItemsMs
            Lc:
                r5 = r5 & 4
                if (r5 == 0) goto L12
                boolean r4 = r0.notifyIfNew
            L12:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions r0 = r0.copy(r1, r2, r4)
                return r0
        }

        public final boolean component1() {
                r0 = this;
                boolean r0 = r0.loadReplyWhenCountIncreased
                return r0
        }

        public final long component2() {
                r2 = this;
                long r0 = r2.delayBetweenItemsMs
                return r0
        }

        public final boolean component3() {
                r0 = this;
                boolean r0 = r0.notifyIfNew
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.QueryOptions copy(boolean r1, long r2, boolean r4) {
                r0 = this;
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions
                r0.<init>(r1, r2, r4)
                return r0
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.QueryOptions
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions r8 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.QueryOptions) r8
                boolean r1 = r7.loadReplyWhenCountIncreased
                boolean r3 = r8.loadReplyWhenCountIncreased
                if (r1 == r3) goto L13
                return r2
            L13:
                long r3 = r7.delayBetweenItemsMs
                long r5 = r8.delayBetweenItemsMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L1c
                return r2
            L1c:
                boolean r7 = r7.notifyIfNew
                boolean r8 = r8.notifyIfNew
                if (r7 == r8) goto L23
                return r2
            L23:
                return r0
        }

        public final long getDelayBetweenItemsMs() {
                r2 = this;
                long r0 = r2.delayBetweenItemsMs
                return r0
        }

        public final boolean getLoadReplyWhenCountIncreased() {
                r0 = this;
                boolean r0 = r0.loadReplyWhenCountIncreased
                return r0
        }

        public final boolean getNotifyIfNew() {
                r0 = this;
                boolean r0 = r0.notifyIfNew
                return r0
        }

        public int hashCode() {
                r4 = this;
                boolean r0 = r4.loadReplyWhenCountIncreased
                int r0 = java.lang.Boolean.hashCode(r0)
                r1 = 31
                int r0 = r0 * r1
                long r2 = r4.delayBetweenItemsMs
                int r0 = p000.lz1.m3677(r0, r1, r2)
                boolean r4 = r4.notifyIfNew
                int r4 = java.lang.Boolean.hashCode(r4)
                int r4 = r4 + r0
                return r4
        }

        public java.lang.String toString() {
                r5 = this;
                boolean r0 = r5.loadReplyWhenCountIncreased
                long r1 = r5.delayBetweenItemsMs
                boolean r5 = r5.notifyIfNew
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "QueryOptions(loadReplyWhenCountIncreased="
                r3.<init>(r4)
                r3.append(r0)
                java.lang.String r0 = ", delayBetweenItemsMs="
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = ", notifyIfNew="
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = ")"
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                return r5
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Summary {
        public static final int $stable = 0;
        private final int failed;
        private final int queried;
        private final int skipped;
        private final int total;
        private final int updated;

        public Summary(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.total = r1
                r0.queried = r2
                r0.updated = r3
                r0.skipped = r4
                r0.failed = r5
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r0, int r1, int r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                int r1 = r0.total
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                int r2 = r0.queried
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                int r3 = r0.updated
            L12:
                r7 = r6 & 8
                if (r7 == 0) goto L18
                int r4 = r0.skipped
            L18:
                r6 = r6 & 16
                if (r6 == 0) goto L1e
                int r5 = r0.failed
            L1e:
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r0 = r2.copy(r3, r4, r5, r6, r7)
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
                int r0 = r0.skipped
                return r0
        }

        public final int component5() {
                r0 = this;
                int r0 = r0.failed
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary copy(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary) r5
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
                int r1 = r4.skipped
                int r3 = r5.skipped
                if (r1 == r3) goto L28
                return r2
            L28:
                int r4 = r4.failed
                int r5 = r5.failed
                if (r4 == r5) goto L2f
                return r2
            L2f:
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

        public final int getSkipped() {
                r0 = this;
                int r0 = r0.skipped
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
                int r2 = r3.skipped
                int r0 = p000.a12.m14(r2, r0, r1)
                int r3 = r3.failed
                int r3 = java.lang.Integer.hashCode(r3)
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r7 = this;
                int r0 = r7.total
                int r1 = r7.queried
                int r2 = r7.updated
                int r3 = r7.skipped
                int r7 = r7.failed
                java.lang.String r4 = ", queried="
                java.lang.String r5 = ", updated="
                java.lang.String r6 = "Summary(total="
                java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r6, r0, r4, r1, r5)
                java.lang.String r1 = ", skipped="
                java.lang.String r4 = ", failed="
                p000.AbstractC0602nx.m4117(r0, r2, r1, r3, r4)
                java.lang.String r1 = ")"
                java.lang.String r7 = p000.AbstractC0602nx.m4131(r0, r7, r1)
                return r7
        }

        public final java.lang.String toastText() {
                r7 = this;
                int r0 = r7.queried
                int r1 = r7.total
                int r2 = r7.updated
                int r3 = r7.skipped
                int r7 = r7.failed
                java.lang.String r4 = "/"
                java.lang.String r5 = "，新回复 "
                java.lang.String r6 = "查询完成：成功 "
                java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r6, r0, r4, r1, r5)
                java.lang.String r1 = "，跳过 "
                java.lang.String r4 = "，失败 "
                p000.AbstractC0602nx.m4117(r0, r2, r1, r3, r4)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                return r7
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE = r0
            aj r0 = new aj
            r1 = 3
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.executor = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.inFlight = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.$stable = r0
            return
    }

    private CommentBookmarkActiveQuery() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.lang.Thread executor$lambda$1(java.lang.Runnable r2) {
            java.lang.String r0 = "r3d4f554990ee3884"
            r1 = 1
            java.lang.Thread r2 = p000.AbstractC0602nx.m4139(r2, r0, r1)
            return r2
    }

    private final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> loadNewRepliesSafely(java.lang.ClassLoader r5, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6) {
            r4 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE     // Catch: java.lang.Throwable -> L9
            r0 = 50
            java.lang.Object r4 = r4.loadFirstPage(r5, r6, r0)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L10:
            java.lang.Throwable r5 = p000.fo1.m2190(r4)
            if (r5 == 0) goto L2b
            java.lang.String r0 = r6.getCommentId()
            java.lang.String r1 = r6.getAwemeId()
            java.lang.String r2 = "load reply list failed, cid="
            java.lang.String r3 = ", awemeId="
            java.lang.String r0 = p000.a12.m18(r2, r0, r3, r1)
            java.lang.String r1 = "r3d4f554990ee3884"
            p000.C0888ux.m5977(r1, r0, r5)
        L2b:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L30
            r4 = 0
        L30:
            if (r4 != 0) goto L35
            jz r4 = p000.C0450jz.f5672
            return r4
        L35:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.util.List r4 = r5.findCommentObjects(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L44:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r4.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.String r1 = r1.getCommentId(r0)
            if (r1 == 0) goto L44
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L5d
            goto L44
        L5d:
            java.lang.String r2 = r6.getCommentId()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L44
            r5.add(r0)
            goto L44
        L6b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L74:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r5.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0 = r1.toNewReplyItem(r0)
            if (r0 == 0) goto L74
            r4.add(r0)
            goto L74
        L8a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L93:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r4.next()
            r1 = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r1
            java.lang.String r2 = r1.getReplyId()
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto L93
            java.util.Set r2 = r6.getKnownReplyIds()
            java.lang.String r1 = r1.getReplyId()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L93
            r5.add(r0)
            goto L93
        Lbc:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lca:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r1
            java.lang.String r1 = r1.getReplyId()
            boolean r1 = r4.add(r1)
            if (r1 == 0) goto Lca
            r6.add(r0)
            goto Lca
        Le5:
            return r6
    }

    public static /* synthetic */ void queryAll$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0, android.app.Activity r1, p000.a80 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            gh r2 = new gh
            r3 = 24
            r2.<init>(r3)
        Lb:
            r0.queryAll(r1, r2)
            return
    }

    private static final p000.s62 queryAll$lambda$19(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r0) {
            r0.getClass()
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final void queryAll$lambda$21(java.lang.ClassLoader r5, java.util.List r6, android.app.Activity r7, p000.a80 r8) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            r5.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions r1 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions
            r2 = 1
            r3 = 120(0x78, double:5.93E-322)
            r1.<init>(r2, r3, r2)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r5 = r0.querySnapshot(r5, r6, r1)
            e9 r6 = new e9
            r0 = 7
            r6.<init>(r7, r5, r8, r0)
            r7.runOnUiThread(r6)
            return
    }

    private static final void queryAll$lambda$21$lambda$20(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r3, p000.a80 r4) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.inFlight
            r1 = 0
            r0.set(r1)
            java.lang.String r0 = r3.toastText()
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            r2.show()
            r4.invoke(r3)
            return
    }

    private final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary querySnapshot(java.lang.ClassLoader r17, java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r18, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.QueryOptions r19) {
            r16 = this;
            r1 = r17
            java.lang.String r2 = ", awemeId="
            java.lang.String r3 = "r3d4f554990ee3884"
            java.util.Iterator r4 = r18.iterator()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L18d
            java.lang.Object r0 = r4.next()
            r6 = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r6
            java.lang.String r0 = r6.getCommentId()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L187
            java.lang.String r0 = r6.getAwemeId()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L31
            goto L187
        L31:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r12 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE     // Catch: java.lang.Throwable -> L72
            java.lang.Object r12 = r12.loadInsertedCommentList(r1, r6)     // Catch: java.lang.Throwable -> L72
            if (r12 == 0) goto L118
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r13 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L72
            java.lang.String r14 = r6.getCommentId()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r12 = r13.findCommentObjectById(r12, r14)     // Catch: java.lang.Throwable -> L72
            if (r12 == 0) goto Lf8
            int r12 = r13.getReplyCount(r12)     // Catch: java.lang.Throwable -> L72
            if (r12 < 0) goto Ld8
            jz r13 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L72
            boolean r14 = r19.getLoadReplyWhenCountIncreased()     // Catch: java.lang.Throwable -> L72
            if (r14 == 0) goto L7a
            int r14 = r6.getLastKnownReplyCount()     // Catch: java.lang.Throwable -> L72
            if (r12 > r14) goto L76
            boolean r14 = r6.getHasNewReplies()     // Catch: java.lang.Throwable -> L72
            if (r14 == 0) goto L7a
            int r14 = r6.getNewReplyCount()     // Catch: java.lang.Throwable -> L72
            if (r14 <= 0) goto L7a
            java.util.List r14 = r6.getNewReplyItems()     // Catch: java.lang.Throwable -> L72
            boolean r14 = r14.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r14 == 0) goto L7a
            goto L76
        L72:
            r0 = move-exception
            r7 = 0
            goto L121
        L76:
            java.util.List r13 = r0.loadNewRepliesSafely(r1, r6)     // Catch: java.lang.Throwable -> L72
        L7a:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L72
            java.lang.String r14 = r6.getCommentId()     // Catch: java.lang.Throwable -> L72
            boolean r15 = r19.getNotifyIfNew()     // Catch: java.lang.Throwable -> L72
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r0.updateReplyCountAndReplies(r14, r12, r13, r15)     // Catch: java.lang.Throwable -> L72
            int r8 = r8 + 1
            if (r0 == 0) goto L8e
            int r9 = r9 + 1
        L8e:
            java.lang.String r14 = r6.getCommentId()     // Catch: java.lang.Throwable -> L72
            java.lang.String r15 = r6.getAwemeId()     // Catch: java.lang.Throwable -> L72
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L9e
            r0 = 1
            goto L9f
        L9e:
            r0 = 0
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = "queried cid="
            r5.append(r7)     // Catch: java.lang.Throwable -> L72
            r5.append(r14)     // Catch: java.lang.Throwable -> L72
            r5.append(r2)     // Catch: java.lang.Throwable -> L72
            r5.append(r15)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = ", replyCount="
            r5.append(r7)     // Catch: java.lang.Throwable -> L72
            r5.append(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = ", newReplyItems="
            r5.append(r7)     // Catch: java.lang.Throwable -> L72
            r5.append(r13)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = ", changed="
            r5.append(r7)     // Catch: java.lang.Throwable -> L72
            r5.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L72
            r5 = 4
            r7 = 0
            p000.C0888ux.m5988(r3, r0, r7, r5, r7)     // Catch: java.lang.Throwable -> Ld6
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Ld6
            goto L127
        Ld6:
            r0 = move-exception
            goto L121
        Ld8:
            r7 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r6.getCommentId()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r12.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r13 = "replyCount invalid, cid="
            r12.append(r13)     // Catch: java.lang.Throwable -> Ld6
            r12.append(r5)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r12.toString()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Ld6
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        Lf8:
            r7 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r6.getCommentId()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r12.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r13 = "comment not found in response, cid="
            r12.append(r13)     // Catch: java.lang.Throwable -> Ld6
            r12.append(r5)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r12.toString()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Ld6
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        L118:
            r7 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = "loadInsertedCommentList returns null"
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        L121:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L127:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L175
            int r11 = r11 + 1
            java.lang.String r5 = r6.getCommentId()
            java.lang.String r6 = r6.getAwemeId()
            java.lang.Class r12 = r0.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = r0.getMessage()
            java.lang.Throwable r14 = r0.getCause()
            if (r14 == 0) goto L152
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            goto L153
        L152:
            r14 = r7
        L153:
            java.lang.Throwable r15 = r0.getCause()
            if (r15 == 0) goto L15d
            java.lang.String r7 = r15.getMessage()
        L15d:
            java.lang.String r15 = "query failed cid="
            java.lang.String r1 = ", type="
            java.lang.StringBuilder r1 = p000.lz1.m3695(r15, r5, r2, r6, r1)
            java.lang.String r5 = ", message="
            java.lang.String r6 = ", cause="
            p000.AbstractC0602nx.m4119(r1, r12, r5, r13, r6)
            java.lang.String r5 = ":"
            java.lang.String r1 = p000.AbstractC0602nx.m4133(r1, r14, r5, r7)
            p000.C0888ux.m5977(r3, r1, r0)
        L175:
            long r0 = r19.getDelayBetweenItemsMs()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L189
            long r0 = r19.getDelayBetweenItemsMs()     // Catch: java.lang.Throwable -> L189
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L189
            goto L189
        L187:
            int r10 = r10 + 1
        L189:
            r1 = r17
            goto Le
        L18d:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r6 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary
            int r7 = r18.size()
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    private static final void scheduleAutoScanIfNeeded$lambda$8(java.lang.ClassLoader r11) {
            java.lang.String r0 = "auto scan completed, total="
            java.lang.String r1 = "auto scan started, total bookmarks="
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L29
            java.util.List r2 = r2.all()     // Catch: java.lang.Throwable -> L29
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L29
            r5 = 4
            r6 = 0
            if (r3 == 0) goto L2b
            java.lang.String r11 = "r3d4f554990ee3884"
            java.lang.String r0 = "auto scan skipped, no bookmarks"
            p000.C0888ux.m5988(r11, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r11 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            monitor-enter(r11)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.autoScanScheduled = r4     // Catch: java.lang.Throwable -> L26
            monitor-exit(r11)
            return
        L26:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L29:
            r11 = move-exception
            goto L9b
        L2b:
            java.lang.String r3 = "r3d4f554990ee3884"
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r8.append(r7)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L29
            p000.C0888ux.m5988(r3, r1, r6, r5, r6)     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions r3 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$QueryOptions     // Catch: java.lang.Throwable -> L29
            r7 = 200(0xc8, double:9.9E-322)
            r9 = 1
            r3.<init>(r9, r7, r9)     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r11 = r1.querySnapshot(r11, r2, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "r3d4f554990ee3884"
            int r3 = r11.getTotal()     // Catch: java.lang.Throwable -> L29
            int r7 = r11.getQueried()     // Catch: java.lang.Throwable -> L29
            int r8 = r11.getUpdated()     // Catch: java.lang.Throwable -> L29
            int r9 = r11.getSkipped()     // Catch: java.lang.Throwable -> L29
            int r11 = r11.getFailed()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L29
            r10.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = ", queried="
            r10.append(r0)     // Catch: java.lang.Throwable -> L29
            r10.append(r7)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = ", updated="
            r10.append(r0)     // Catch: java.lang.Throwable -> L29
            r10.append(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = ", skipped="
            r10.append(r0)     // Catch: java.lang.Throwable -> L29
            r10.append(r9)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = ", failed="
            r10.append(r0)     // Catch: java.lang.Throwable -> L29
            r10.append(r11)     // Catch: java.lang.Throwable -> L29
            java.lang.String r11 = r10.toString()     // Catch: java.lang.Throwable -> L29
            p000.C0888ux.m5988(r2, r11, r6, r5, r6)     // Catch: java.lang.Throwable -> L29
            monitor-enter(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.autoScanScheduled = r4     // Catch: java.lang.Throwable -> L98
            monitor-exit(r1)
            return
        L98:
            r11 = move-exception
            monitor-exit(r1)
            throw r11
        L9b:
            java.lang.String r0 = "r3d4f554990ee3884"
            java.lang.String r1 = "auto scan error"
            p000.C0888ux.m5977(r0, r1, r11)     // Catch: java.lang.Throwable -> Lac
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r11 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            monitor-enter(r11)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.autoScanScheduled = r4     // Catch: java.lang.Throwable -> La9
            monitor-exit(r11)
            return
        La9:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        Lac:
            r11 = move-exception
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            monitor-enter(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.autoScanScheduled = r4     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)
            throw r11
        Lb4:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m1393(java.lang.ClassLoader r0) {
            scheduleAutoScanIfNeeded$lambda$8(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m1394(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r1, p000.a80 r2) {
            queryAll$lambda$21$lambda$20(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ void m1395(java.lang.ClassLoader r0, java.util.List r1, android.app.Activity r2, p000.a80 r3) {
            queryAll$lambda$21(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ p000.s62 m1396(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r0) {
            s62 r0 = queryAll$lambda$19(r0)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ java.lang.Thread m1397(java.lang.Runnable r0) {
            java.lang.Thread r0 = executor$lambda$1(r0)
            return r0
    }

    public final void init(android.content.Context r2, java.lang.ClassLoader r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r2 = r0
        Le:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.appContext = r2
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.hostClassLoader = r3
            r2 = 0
            r1.installCaptureHooks(r3, r2)
            return
    }

    public final void installCaptureHooks(java.lang.ClassLoader r1, boolean r2) {
            r0 = this;
            r1.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE     // Catch: java.lang.Throwable -> Lb
            r0.installCaptureHooks(r1, r2)     // Catch: java.lang.Throwable -> Lb
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L12:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "r3d4f554990ee3884"
            java.lang.String r2 = "installCaptureHooks failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L1f:
            return
    }

    public final void queryAll(android.app.Activity r7, p000.a80 r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            java.lang.ClassLoader r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.hostClassLoader
            if (r6 != 0) goto Le
            java.lang.ClassLoader r6 = r7.getClassLoader()
        Le:
            r1 = r6
            java.util.concurrent.atomic.AtomicBoolean r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.inFlight
            r0 = 1
            r2 = 0
            boolean r0 = r6.compareAndSet(r2, r0)
            if (r0 != 0) goto L23
            java.lang.String r6 = "正在查询书签评论，请稍候"
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            return
        L23:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            java.util.List r0 = r0.all()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L49
            r6.set(r2)
            java.lang.String r6 = "暂无书签评论"
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r8.invoke(r0)
            return
        L49:
            java.lang.String r6 = "开始查询书签评论"
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r2)
            r6.show()
            java.util.concurrent.ExecutorService r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.executor
            r2 = r0
            nj r0 = new nj
            r5 = 0
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.execute(r0)
            return
    }

    public final void scheduleAutoScanIfNeeded() {
            r6 = this;
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.appContext
            if (r0 != 0) goto L5
            goto L9
        L5:
            java.lang.ClassLoader r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.hostClassLoader
            if (r1 != 0) goto La
        L9:
            return
        La:
            java.lang.String r2 = "dyhelper_prefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            java.lang.String r2 = "comment_bookmark_auto_scan_enabled"
            boolean r0 = r0.getBoolean(r2, r3)
            r2 = 4
            r4 = 0
            if (r0 != 0) goto L23
            java.lang.String r6 = "r3d4f554990ee3884"
            java.lang.String r0 = "auto scan disabled by user settings"
            p000.C0888ux.m5988(r6, r0, r4, r2, r4)
            return
        L23:
            r0 = 1
            boolean r5 = p000.AbstractC0976x9.m6538()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L31
            boolean r5 = com.example.dyhelper.beta.BetaNativeBridge.m1284()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L31
            r3 = r0
        L31:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r3)
            r3 = r5
        L3d:
            java.lang.Throwable r5 = p000.fo1.m2190(r3)
            if (r5 != 0) goto L44
            goto L46
        L44:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L46:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L56
            java.lang.String r6 = "r3d4f554990ee3884"
            java.lang.String r0 = "auto scan skipped, not a beta user"
            p000.C0888ux.m5988(r6, r0, r4, r2, r4)
            return
        L56:
            monitor-enter(r6)
            boolean r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.autoScanScheduled     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L66
            java.lang.String r0 = "r3d4f554990ee3884"
            java.lang.String r1 = "auto scan already scheduled, skip"
            p000.C0888ux.m5988(r0, r1, r4, r2, r4)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r6)
            return
        L64:
            r0 = move-exception
            goto L7c
        L66:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.autoScanScheduled = r0     // Catch: java.lang.Throwable -> L64
            monitor-exit(r6)
            java.lang.String r6 = "r3d4f554990ee3884"
            java.lang.String r0 = "auto scan scheduled, will execute after 5 seconds delay"
            p000.C0888ux.m5988(r6, r0, r4, r2, r4)
            java.util.concurrent.ExecutorService r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.executor
            oj r0 = new oj
            r2 = 0
            r0.<init>(r1, r2)
            r6.execute(r0)
            return
        L7c:
            monitor-exit(r6)
            throw r0
    }
}
